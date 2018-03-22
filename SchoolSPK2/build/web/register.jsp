<html>
<head>
    <title>Post Ajax</title>
    <link rel="stylesheet" href="../bootstrap/css/bootstrap.min.css">
    <script type="text/javascript" src="../bootstrap/js/jquery-1.11.1.min.js"></script>
</head>
<body>
 <div class="row">
    <div class="col-md-3"></div>
    <div class="col-md-6">
      <!-- Post With Text Input -->
        <form action="get.php">
         <div class="panel panel-default">
           <div class="panel-heading">Post AJAX</div>
             <div class="panel-body">
               <div class="form-group">
                 <label for="username">Username</label>
                 <input type="text" class="form-control" id="username" name="username" value="">
               </div>
               <div class="form-group">
                 <label for="email">Email address</label>
                 <input type="email" class="form-control" id="email" name="email" value="">
                 <span class='glyphicon form-control-feedback' aria-hidden='true'></span>
               </div>
               <div class="form-group">
                 <label for="password">Password</label>
                 <input type="password" class="form-control" id="password" name="password" value="">
               </div>
               <button type="submit" class="btn btn-default">Submit</button>
            </div>
          </div>
        </form>
      </div><!--/ .col-md-6 -->
      <div class="col-md-3"></div>
</div><!--/ .row -->
<span class='glyphicon form-control-feedback' aria-hidden='true'></span>
</body>
</html>