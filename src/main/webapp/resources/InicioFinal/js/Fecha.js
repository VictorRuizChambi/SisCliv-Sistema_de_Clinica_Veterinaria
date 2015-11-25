var x= $(document);
x.ready(Fecha);
function Fecha(){
	var x;
	x=$("#datetimepicker3");
	$('#datetimepicker3').datetimepicker({
         pickDate: false
         });
}