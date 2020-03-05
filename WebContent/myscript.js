function validation(){

	var id = document.forms.myform.un.value;
	var x = document.forms.myform.pass.value;
	var y = document.forms.myform.cpass.value;
	var d = document.forms.myform.address.value;
	var numEx = /^[0-9]+$/;
	if(id == "" || id == null)
	{
		alert("Name Can Not Be Empty");
		return false; 
	}
	else  if(id.match(numEx)){
	
		alert("Name Must Be Character");
		return false;
	} 
	if(d == "" || d == null)
	{
		alert("Address Can Not Be Empty");
		return false; 
	}
	if(x == "" || x == null)
	{
		alert("Password Can Not Be Empty");
		return false;
	}
	 if (x.match(/[a-z]/g) && x.match( 
    /[A-Z]/g) && x.match( 
    /[0-9]/g) && x.match( 
    /[^a-zA-Z\d]/g) && x.length >= 8) 
return true;
else 
{
alert("enter strong password");
return false;
}	
	if(y == "" || y == null)
	{
		alert("ConfirmPassword Can Not Be Empty");
		return false; 
	}
	if(x.match(y))
	{
		return true;
	}
	else
	{
		alert("Provide same password");
		return false;
		}
	
	
	
		
}