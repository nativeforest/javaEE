<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SierraLab</title>
<script src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js"></script>
</head>
<body>

<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="main.jsp"></jsp:include>
<jsp:include page="footer.jsp"></jsp:include>
<script type="text/javascript">
$(document).ready( function () {
    $('#myTable').DataTable();
} );
</script>

</body>
</html>