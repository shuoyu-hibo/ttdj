/**
 * @author  wanghaibo  20150601 
 */
var pageCurrent=1;//当前页面
var pageSum=1;//总页数
var pageCurrFirst=0;//当前页面分页码中的第一位置
var pageCurrLast=5;//当前页面分页码中的最后位置
$(function(){
	$("#pNumNext").bind("click",function(){
		if($("#pNumNext").attr("class")=="disabled"){
			return;
		}
		$("#pNum_"+pageCurrent).removeClass("active");
		if(pageCurrent<5){
			pageCurrent += 1;
		}else{
			pageCurrent+=1;
			var np=0;
			if(pageCurrent+4<=pageSum){
				pageCurrFirst=np=pageCurrent;
				pageCurrLast=pageCurrFirst+4;
				$.each($("li[id^='pNum_']"),function(i,n){
					$(n).children("a").text(np);
					$(n).attr("id","pNum_"+np);
					np++;
				});
			}
		}
		if(pageCurrent>1){
			$("#pNumPre").removeClass("disabled");
		}
		if(pageCurrent==pageSum){
			$("#pNumNext").addClass("disabled");
		}
		$("#pNum_"+pageCurrent).addClass("active");
		
		pageChange();//invoke pageChange
	});
	$("#pNumPre").bind("click",function(){
		if($("#pNumPre").attr("class")=="disabled"){
			return;
		}
		$("#pNum_"+pageCurrent).removeClass("active");
		if(pageCurrent<=pageCurrFirst){
			pageCurrent-=1;
			var np=pageCurrFirst=pageCurrent-4;
			if(np<1){np=pageCurrFirst=1;}
			pageCurrLast=pageCurrFirst+4;
			$.each($("li[id^='pNum_']"),function(i,n){
				$(n).children("a").text(np);
				$(n).attr("id","pNum_"+np);
				np++;
			});
		}else{
			pageCurrent -= 1;
		}
		if((pageCurrent+1)==pageSum){
			$("#pNumNext").removeClass("disabled");
		}
		if(pageCurrent==1){
			$("#pNumPre").addClass("disabled");
		}
		$("#pNum_"+pageCurrent).addClass("active");
		
		pageChange();//invoke pageChange
	});
	$("li[id^='pNum_']").bind("click",function(){
		var pointPageNum = $(this).children("a").text();
		pointPageNum = parseInt(pointPageNum);
		if(pointPageNum==pageCurrent){return;}
		
		$("#pNum_"+pageCurrent).removeClass("active");
		if(pointPageNum==pageCurrFirst&&pointPageNum!=1){
			var np=pageCurrFirst=pointPageNum-4;
			if(np<1){np=pageCurrFirst=1;}
			pageCurrLast=pageCurrFirst+4;
			$.each($("li[id^='pNum_']"),function(i,n){
				$(n).children("a").text(np);
				$(n).attr("id","pNum_"+np);
				np++;
			});
		}else if(pointPageNum==pageCurrLast&&pointPageNum!=pageSum){
			var np=pageCurrFirst=pointPageNum;
			pageCurrLast=pageCurrFirst+4;
			if(np>pageSum-4){np=pageSum-4;pageCurrLast=pageSum;pageCurrFirst=pageSum-4;}
			$.each($("li[id^='pNum_']"),function(i,n){
				$(n).children("a").text(np);
				$(n).attr("id","pNum_"+np);
				np++;
			});
		}
		$("#pNum_"+pointPageNum).addClass("active");
		
		if(pointPageNum==pageSum){
			$("#pNumPre").removeClass("disabled");
			$("#pNumNext").addClass("disabled");
		}else if(pointPageNum==1){
			$("#pNumPre").addClass("disabled");
			$("#pNumNext").removeClass("disabled");
		}else{
			$("#pNumPre").removeClass("disabled");
			$("#pNumNext").removeClass("disabled");
		}
		pageCurrent=pointPageNum;
		
		pageChange();//invoke pageChange
	});
});
function pageNumSet(recordSize,pageSize){//page btn create
	var str = ""+recordSize/pageSize;
	var pageSize = 0;
	if(recordSize%pageSize==0){
		pageSize = recordSize/pageSize;
	}else{
		var num = str.split(".")[0];
		pageSize = parseInt(num)+1;
	}
	//pageSize=20;//test
	//if(recordSize%9>=1&&recordSize>9){
    //		pageSize+=1;
	//}
	pageSum = pageSize;
	for(var i=1;i<=5;i++){$("#pNum_"+i).show();}
	$("#pNumPre").show();
	$("#pNumNext").show();
	if(pageSize==1){//如果是一页
		for(var i=1;i<=5;i++){$("#pNum_"+i).hide();}
     	$("#pNumPre").hide();
     	$("#pNumNext").hide();
	}
	for(pageSize;pageSize<5;pageSize++){
		$("#pNum_"+(pageSize+1)).hide();
	}
	$("#font_ps").html("&nbsp;&nbsp;&nbsp;共【"+pageSum+"】页");
}