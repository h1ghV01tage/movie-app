<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	 <header style="height: 30px; background-color:maroon;">
	 
	</header>
	<div class="container">
		<img alt="" src="img/movietime.png" style="height:100px;">
		<img alt="" src="img/movietime.png" style="height:100px;">
		<img alt="" src="img/movietime.png" style="height:100px;">
		<img alt="" src="img/movietime.png" style="height:100px;">
		
	</div>
	
	<hr/>
		<b>${message}</b>
	<hr/>
					
		<form action="login" method="post">
			<div class="form-group">
				<label>username</label>
				<input type="text" name="username" class="form-control" ></input>
			</div>
		
			<div class="form-group">
				<label>password</label>
				<input type="password" name="password" class="form-control" ></input>
			</div>
			
			<div class="form-group">
				<button type="submit" class="btn btn-primary">Sign In</button>
			</div>
		</form>
</body>
</html>