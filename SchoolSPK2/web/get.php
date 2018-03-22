<?php
$servername = "jdbc:derby://localhost:1527/DB203";
$username =  "DB203";
$password = "db203";
$dbname = "DB203";
mysql_query("SET NAMES utf8");
 
// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
  die("Connection failed: " . $conn->connect_error);
}
 
$m = $_POST['email'];
$sql = "SELECT * FROM STUDENT WHERE FNAME LIKE '$m' ";
$result = $conn->query($sql);
 
if ($result->num_rows >= 1){
    echo "Not";
} else {
    echo "OK";
}
?>