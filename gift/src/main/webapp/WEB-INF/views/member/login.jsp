<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="../css/login_style.css">

<script type="text/javascript">

function login_id_onclick() {
	//alert("ㅎㅇ");
	var value = document.getElementById("login_id_text").placeholder;
	//alert(value);
	document.getElementById("login_id_text").placeholder = "";
}//여긴 문제 없음

function login_pwd_onclick() {
	var value2 = document.getElementbyId("login_pw_text").placeholder;
	alert(":?");
}

</script>
</head>
<body>
    <form>
        <table id="login_table">
            <tr>
                <td class="login_id_style">
                    <input type="text" placeholder="아이디를 입력해주세요" name="login_id_text" id="login_id_text" onclick=login_id_onclick();>
                </td>
            </tr>
            <tr>
                <td>
					<input type="password" placeholder="비밀번호를 입력해주세요" name="pwd_text" id="login_pw_text" onclick=login_pwd_onclick();>
                </td>
            </tr>
            <tr>
            	<td>
            		<input type="button" value="로그인" onclick=send(this.form);>
            	</td>
            </tr>
        </table>
    </form>
</body>
</html>

