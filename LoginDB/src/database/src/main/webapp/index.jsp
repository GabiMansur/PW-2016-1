<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <link rel="stylesheet" href="../css/bootstrap.css" type="text/css">
  <link rel="stylesheet" href="../css/styles.css" type="text/css">
  <title>Login</title>
</head>
<body>
<div class="containerForm">
  <form class="form-horizontal" action="login.jsp" method="post">
    <div calss="module"><h2 class="text-center">Login</h2></div>
    <div class="form-group">
      <label for="inputUsername" class="col-sm-2 control-label">Username</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" id="inputUsername" placeholder="Username">
      </div>
    </div>
    <div class="form-group">
      <label for="inputPassword" class="col-sm-2 control-label">Password</label>
      <div class="col-sm-10">
        <input type="password" class="form-control" id="inputPassword" placeholder="Password">
      </div>
    </div>
    <div class="form-group">
      <div class="col-sm-offset-2 col-sm-10">
        <div class="checkbox">
          <label>
            <input type="checkbox"> Remember me
          </label>
        </div>
      </div>
    </div>
    <div class="form-group">
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">Fazer Login</button>
        <a type="submit" href="register.jsp" class="btn btn-default">Register</a>
      </div>
    </div>
  </form>
</div>
</body>
</html>
