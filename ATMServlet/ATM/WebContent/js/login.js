var attempt = 3; 


function validate(){
	var username = document.getElementById("username").value;
	var password = document.getElementById("password").value;

	if ( username == "admin" && password == "admin123"){
		alert ("Login successfully");
		//window.location = "success.html"; 
		
		document.location.href = '/ATM/ATMBalServlet';
		return false;
	}
	else{
		attempt --;
		alert("You have left "+attempt+" attempt;");
		

		if( attempt == 0){
			document.getElementById("username").disabled = true;
			document.getElementById("password").disabled = true;
			document.getElementById("submit").disabled = true;
			return false;
		}
	}
}


function checkBalance(){
	alert("hello");
}