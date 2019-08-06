<html>
<body>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
<script src="http://code.jquery.com/jquery-1.7.1.min.js"></script>
<h3>Spring REST Demo</h3>

<hr>
<a href="${pageContext.request.contextPath}/customers">Hello</a>
<!-- <button id="button1" type="submit">Submit</button>
 -->
<!-- <script type="text/javascript">
document.getElementById("button1").addEventListener("click",madeAjaxCall,false);
function madeAjaxCall(){
	$.ajax({
    type:'GET',
    url:"http://localhost:8080//Spring-REST-CRUD/customers",
    contentType:"application/json",
    //async:false,
    cache:false,
        //data:{purpose:f_purpose, userName:f_userName,status: f_status,latAdd: f_latAdd, longAdd:f_lngAdd},
    dataType:'json',
    success:function(){ 
            console.log('Got the response');
    },
    error: function(){
    	console.log('Something went wrong!');
    	}
    });
}
</script> -->
</body>
</html>