$(function () {
    $("#jqGrid").jqGrid({
        url: '../users/list',
        datatype: "json",
        colModel: [			
			{ label: '手机号码', name: 'phone', index: 'phone', width: 100, key: true },
						
			{ label: '真实姓名', name: 'realname', index: 'realname', width: 80 }, 			
			{ label: '年龄', name: 'age', index: 'age', width: 80 }, 			
			{ label: '性别', name: 'gender', index: 'gender', width: 80 }, 			
			
			{ label: '账户余额', name: 'balance', index: 'balance', width: 80 }, 			
			{ label: '奖金', name: 'refMoney', index: 'ref_money', width: 80 }, 			
		
			{ label: '公司名称', name: 'workOrg', index: 'work_org', width: 80 }, 			
	
		
			{ label: '添加时间', name: 'addTime', index: 'add_time', width: 80 }
        ],
		viewrecords: true,
        height: 385,
        rowNum: 10,
		rowList : [10,30,50],
        rownumbers: true, 
        rownumWidth: 25, 
        autowidth:true,
        multiselect: true,
        pager: "#jqGridPager",
        jsonReader : {
            root: "page.list",
            page: "page.currPage",
            total: "page.totalPage",
            records: "page.totalCount"
        },
        prmNames : {
            page:"page", 
            rows:"limit", 
            order: "order"
        },
        gridComplete:function(){
        	//隐藏grid底部滚动条
        	$("#jqGrid").closest(".ui-jqgrid-bdiv").css({ "overflow-x" : "hidden" }); 
        }
    });
});

var vm = new Vue({
	el:'#rrapp',
	data:{
		showList: true,
		title: null,
		users: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.users = {};
		},
		update: function (event) {
			var phone = getSelectedRow();
			if(phone == null){
				return ;
			}
			vm.showList = false;
            vm.title = "修改";
            
            vm.getInfo(phone)
		},
		saveOrUpdate: function (event) {
			var url = vm.users.phone == null ? "../users/save" : "../users/update";
			$.ajax({
				type: "POST",
			    url: url,
			    data: JSON.stringify(vm.users),
			    success: function(r){
			    	if(r.code === 0){
						alert('操作成功', function(index){
							vm.reload();
						});
					}else{
						alert(r.msg);
					}
				}
			});
		},
		del: function (event) {
			var phones = getSelectedRows();
			if(phones == null){
				return ;
			}
			
			confirm('确定要删除选中的记录？', function(){
				$.ajax({
					type: "POST",
				    url: "../users/delete",
				    data: JSON.stringify(phones),
				    success: function(r){
						if(r.code == 0){
							alert('操作成功', function(index){
								$("#jqGrid").trigger("reloadGrid");
							});
						}else{
							alert(r.msg);
						}
					}
				});
			});
		},
		getInfo: function(phone){
			$.get("../users/info/"+phone, function(r){
                vm.users = r.users;
            });
		},
		reload: function (event) {
			vm.showList = true;
			var page = $("#jqGrid").jqGrid('getGridParam','page');
			$("#jqGrid").jqGrid('setGridParam',{ 
                page:page
            }).trigger("reloadGrid");
		}
	}
});