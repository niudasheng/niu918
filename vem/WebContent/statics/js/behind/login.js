$(function() {

    if ($("#userName, #password").val() != "") {
        $("#userName, #password").css("color","#000000");
    }

    $("#userName, #password").focus(function() {
        $("#userName, #password").css("color","#000000");
    })

    $("#userName, #password").blur(function() {
        $("#userName, #password").css("color","#000000");
    })
})

/*
   Enter trigger login
 */
function keyLogin() {
    if (event.keyCode == 13) {
        document.getElementById("loginButton").click();
    }
}

/*
 * 校验表单
 */
function checkForm() {
    var userName = $("#userName").val();
    var password = $("#password").val();

    if (isNotNull(userName)) {
        layer.tips('您好，您的用户名输入有误', '#nameId', {
          tips: [1, '#0FA6D8'] 
        });
        return;
    }

    if (isNotNull(password)) {
        layer.tips('您好，您的密码输入有误', '.password_css', {
            tips: [1, '#0FA6D8']
          });
        return;
    }

    $.ajax({
        url : "/vem/checkBehindUser.do",
        type : "post",
        data : "userName=" + userName + "&pwd=" + password,
        async:false,
        dataType : "json",
        success : function(data) {
            if(data.resultcode == "101"){
                layer.msg("用户名或密码错误！！", {
                    icon : 0
                });
            }else if(data.resultcode == "200"){
//                $.ajax({
//                    url : "/Virgo/qwerty.login",
//                    type : "post",
//                    dataType : "html",
//                    success : function(data){
////                        location.href=data;
//                    }
//                });
              //  location.href="/vem/pages/behind/index.html";
            	alert("111")
            }
        }
    });
}
/*
 * 空值判断
 */
function isNotNull(value) {
    if (null != value && "null" != value && "" != value && undefined != value
            && "undefined" != value) {
        return false;
    } else {
        return true;
    }
}