var completeAry = [];
$(function(){
	$("#search").typeahead({source:function(query,process){
		if(completeAry==''){
			$.ajax({ 
		        type: "post", 
		        url: generateUrl("sh!procTypeahead.do?city="+$(".city-info__name").attr("code")), 
		        cache:false, 
		        async:false, //同步
		        dataType: "json", 
		        success: function(data){ 
		        	$.each(data["record"],function(i,n){
						completeAry[i]=n;
					});
					process(completeAry);
		        } 
			});
		}else{process(completeAry);}
	}});
	
	$("#btnSearch").bind("click",function(){
		var searchStr = $("#search").val();
		if(searchStr=='') return false;
		window.location.href=generateUrl("html/search/productSearch.html?s="+searchStr+"&ct="+$(".city-info__name").attr("code"));
	});
	
	$(document).keydown(function(event){
		if(event.keyCode==13){
		$("#btnSearch").click();
		}
		}); 
	
});