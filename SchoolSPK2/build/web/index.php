<html>
<head>
    <title>Post Ajax</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
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


</body>
</html>

<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js"></script>
<script type="text/javascript">
  $(document).ready(function(){
    $("#email").change(function() {
      var email = $('#email').val();
    });
  });


  var request = $.ajax({
 
url: "get.php",
 
type: "POST",
 
data: {email: email},
 
success: function(data, textStatus, jQxhr){
 if(data == 'OK'){
    $('.form-group:nth-child(2)').addClass('has-success has-feedback');
    $('.form-group:nth-child(2)').removeClass('has-error');
    $('.form-group:nth-child(2) > span').addClass('glyphicon-ok');
    $('.form-group:nth-child(2) > span').removeClass('glyphicon-remove');
} else {
    $('.form-group:nth-child(2)').addClass('has-error has-feedback');
    $('.form-group:nth-child(2) > span').removeClass('glyphicon-ok');
    $('.form-group:nth-child(2) > span').addClass('glyphicon-remove');
}
  // OK
 
},
 
error: function(jqXhr, textStatus, errorThrown){
 
  // Not OK
 
  console.log(errorThrown);
 
}
 
});
</script>

