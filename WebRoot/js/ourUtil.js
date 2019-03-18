/**
 * load header foot
 */
$(function(){
	$("#header").load(genLinkUrl("html/frame/header.html?"));
	$("#foot").load(genLinkUrl("html/frame/foot.html?"));
});
/**
 * 得到url中的参数
 * @param attrName
 * @author wanghaibo
 * @returns
 */
var urlParam;
function getUrlParam(attrName){
	if(urlParam==null){
		var up = location.search;
		if(up=='')return "FIAL999";
		up = up.split("?")[1];
		if(up.indexOf("&")==-1){
			var param = up.split("=");
			urlParam = new Object();
			urlParam[param[0]]=param[1];
			return param[1];
		}else{
			var ps = up.split("&");
			urlParam = new Object();
			for(var i=0;i<ps.length;i++){
				var p = ps[i].split("=");
				urlParam[p[0]]=p[1];
			}
		}
	}
	return eval("urlParam." + attrName);
}

/**
 * 获取地址
 * @return
 */
function getBasePath() {

    var baseUrl = window.location.protocol+"//"+window.location.host+"/"+window.location.pathname.split("/")[1]+"/";
    return baseUrl;
}

function genLinkUrl(strPara){
	var basePath=getBasePath();
	if(strPara.substr(strPara.length-1,strPara.length)=='?'){
		strPara+=("sds="+new Date().getSeconds());
	}else{
		strPara+=("&sds="+new Date().getSeconds());
	}
	return basePath+strPara;
}

/**
 * 传入action名与参数,获取最终URL
 * @param strParam eg:homepage!add.do?a=1
 */
function generateUrl(strPara,param){
	var basePath=getBasePath();
	if(param!=undefined&&param!=null&&param!=''){//拼接问号后的参数
		var p = param.split(",");
		$.each(p,function(i,n){//alert(n);
			strPara+=n;
			strPara+="=";
			strPara+=$("#"+n).val();
			strPara+="&";
		});
	}else{
		//alert(strPara.substr(strPara.length-1,strPara.length-1));
		if(strPara.substr(strPara.length-1,strPara.length-1)!='?'){
			strPara+="&";
		}
	}
	var strUrl = basePath+strPara+"sds="+new Date().getSeconds();
	//alert(strUrl);
	var strUrl1 = encodeURI(strUrl);
	return encodeURI(strUrl1);
}


function toPage(ifmName,ifmUrl){//change iframe page
			$("#"+ifmName).attr("src",ifmUrl);
}

Date.prototype.format = function(format) {
    /*
     * format="yyyy-MM-dd hh:mm:ss";
     */
    var o = {
        "M+" : this.getMonth() + 1,
        "d+" : this.getDate(),
        "h+" : this.getHours(),
        "m+" : this.getMinutes(),
        "s+" : this.getSeconds(),
        "q+" : Math.floor((this.getMonth() + 3) / 3),
        "S" : this.getMilliseconds()
    };
    if (/(y+)/.test(format)) {
            format = format.replace(RegExp.$1, (this.getFullYear() + "").substr(4- RegExp.$1.length));
        }
    for (var k in o) {
        if (new RegExp("(" + k + ")").test(format)){
            format = format.replace(RegExp.$1, RegExp.$1.length == 1? o[k]:("00" + o[k]).substr(("" + o[k]).length));
        }
    }
    return format;
    
};
//转化JSON日期格式
function toDate(objDate, format) {
    var date = new Date();
    if(objDate==null){
    	return '';
    }else{
	    date.setTime(objDate.time);
	    date.setHours(objDate.hours);
	    date.setMinutes(objDate.minutes);
	    date.setSeconds(objDate.seconds);
	    return date.format(format);
    }

}
var ifTimeOut="";
//重写ajax方法
(function($){  
    //备份jquery的ajax方法  
    var _ajax=$.ajax;  
      
    //重写jquery的ajax方法  
    $.ajax=function(opt){  
        //备份opt中error和success方法  
        var fn = {  
            error:function(XMLHttpRequest, textStatus, errorThrown){},  
            success:function(data, textStatus){}  
        }  
        if(opt.error){  
            fn.error=opt.error;  
        }  
        if(opt.success){  
            fn.success=opt.success;  
        }  
          
        //扩展增强处理  
        var _opt = $.extend(opt,{  
            error:function(XMLHttpRequest, textStatus, errorThrown){  
                //错误方法增强处理  
                fn.error(XMLHttpRequest, textStatus, errorThrown);  
            },  
            success:function(data, textStatus){ //$.each(data,function(i,n){alert(i+"   "+n);})
                //成功回调方法增强处理  
            	if(ifTimeOut=='999'){
            		return;
            	}
                if(data["result"]=='999'){//ajax成功访问后回调拦截器,拦截
                	ifTimeOut='999';
                	if(confirm("当前用户未登录,请登录！")){
                		window.location.href=generateUrl("html/register/login.html?");
                		return;
                	}else{
                		window.location.href=generateUrl("html/home/index.html?");
                		return;
                	}
                }else{
                	ifTimeOut="";
                	fn.success(data, textStatus);  
                }
            }  
        });  
        _ajax(_opt);  
    };  
})(jQuery); 

//$(document).ready(function(){
//	  $("#a1").addClass("current");
//	  $("#middle").load("homepage!onload.do");
//});
//function pageLoad(strUrl){
//	$("#middle").load(strUrl);
//}