<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>



<script src="resources/js/HttpRequest.js"></script>

<script type="text/javascript">
	
	function send(f) {
		let id = f.login_id_text.value.trim();
		let pwd = f.login_pw_text.value.trim();
	
		if(id==''){
			alert("아이디를 입력해주세요");
			return;
		}
		
		if(pwd==''){
			alert("비밀번호를 입력해주세요");
			return;
		}
		
		let url = "mloginconf";
		let param = "id="+encodeURIComponent(id)+"&pwd="+encodeURIComponent(pwd);
		//alert(param);
		sendRequest(url,param,callback,"POST");
	}
	
	function callback() {
		
	}

</script>


</head>
<body>
    <form>
        <table id="login_table">
            <tr>
                <td class="login_id_style">
                    <input type="text" placeholder="아이디를 입력해주세요" name="login_id_text" id="login_id_text">
                </td>
            </tr>
            <tr>
                <td>
					<input type="password" placeholder="비밀번호를 입력해주세요" name="login_pw_text" id="login_pw_text">
                </td>
            </tr>
            <tr>
            	<td>
            		<input type="button" value="로그인" onclick="send(this.form)">
            	</td>
            </tr>
        </table>
    </form>
</body>
</html>

