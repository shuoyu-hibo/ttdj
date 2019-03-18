$(function(){
		$.post(generateUrl("login!checkUserLogin.do?"),function(data){
			if(data["result"]=="0"){
				$("#userNameShow").html(data["record"][0]);
				$("#div_login").show();
				$("#div_unlogin").hide();
				//$("#quit").attr("href",generateUrl("login!userQuit.do?"));
				$("#quit").bind("click",function(){
					if(confirm("确认退出吗？")){
						window.location.href=generateUrl("login!userQuit.do?");
					}
				});
			}else{
				$("#div_login").hide();
				$("#div_unlogin").show();
			}
		});
		
		$.post(generateUrl("login!loadMenuToHomepage.do?"),function(data){
			$.each(data["record"],function(i,n){
				var tempName = "";
				if(n.proSortName.length>8){
					tempName = n.proSortName.substring(0,8);
					tempName += " ... ";
				}else{
					tempName = n.proSortName;
				}
				//added by yangxiaowei  20150605 start
  				$("#cate_more"+n.proSortCode).attr("href",generateUrl("html/search/productSearch.html?s1="+n.proSortCode+"&sn1="+n.proSortName+"&ct="+$(".city-info__name").attr("code")));
				//added by yangxiaowei  20150605 end
				var str = "<i>&gt;</i> <a class=\"ti\" href=\""+generateUrl('html/search/productSearch.html?s1='+n.proSortCode+'&sn1='+n.proSortName+"&ct="+$(".city-info__name").attr("code"))+"\" title=\""+n.proSortName+"\" mon=\"#content="+n.proSortName+"\">"+tempName+"</a>";
				$("#liMenu"+(i+1)).append(str);
				var strChild="<div class=\"prosmore hide\">";
				$.post(generateUrl("login!loadMenu2ToHomepage.do?proSort1Code="+n.proSortCode),function(json){
					$.each(json["record"],function(k,v){
						strChild+="<ul class=\"breadcrumb\">";
						strChild+="<li><a href=\""+generateUrl('html/search/productSearch.html?s2='+v.proSort2Code+'&sn2='+v.proSort2Name+"&ct="+$(".city-info__name").attr("code"))+"\" style=\"color:red\">"+v.proSort2Name+"</a> &gt; </li>";
						$.each(v.produceSort3List,function(sort3k,sort3v){
							strChild+="<li><a href=\""+generateUrl('html/search/productSearch.html?s3='+sort3v.proSort3Code+'&sn3='+sort3v.proSort3Name+"&ct="+$(".city-info__name").attr("code"))+"\">"+sort3v.proSort3Name+"</a>  </li>";
						});
						strChild+="</ul>";
					});
					strChild+="</div>";
					$("#liMenu"+(i+1)).append(strChild);
				});
			});
		});
		

		
	});