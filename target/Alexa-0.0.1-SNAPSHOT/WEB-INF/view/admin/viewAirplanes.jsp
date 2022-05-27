<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width,initial-scale=1,user-scalable=0,minimal-ui">
<title>Admin | View Airplanes</title>
<meta content="Admin Dashboard" name="description">
<meta content="Mannatthemes" name="author">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<link rel="shortcut icon" href="assets/images/favicon.ico">
<!-- DataTables -->
<link
	href="<%=request.getContextPath()%>/adminResources/css/dataTables.bootstrap4.min.css"
	rel="stylesheet" type="text/css">
<link
	href="<%=request.getContextPath()%>/adminResources/css/buttons.bootstrap4.min.css"
	rel="stylesheet" type="text/css">
<!-- Responsive datatable examples -->
<link
	href="<%=request.getContextPath()%>/adminResources/css/responsive.bootstrap4.min.css"
	rel="stylesheet" type="text/css">
<link
	href="<%=request.getContextPath()%>/adminResources/css/bootstrap.min.css"
	rel="stylesheet" type="text/css">
<link href="<%=request.getContextPath()%>/adminResources/css/icons.css"
	rel="stylesheet" type="text/css">
<link href="<%=request.getContextPath()%>/adminResources/css/style.css"
	rel="stylesheet" type="text/css">

<!-- Custom css -->
<link
	href="<%=request.getContextPath()%>adminResources\css\custom\photoStyle.css"
	rel="stylesheet" type="text/css">

</head>
<body class="fixed-left">
	<!-- Begin page -->
	<div id="wrapper">
		<!-- ========== Left Sidebar Start ========== -->

		<jsp:include page="menu.jsp"></jsp:include>

		<!-- Left Sidebar End -->
		<!-- Start right Content here -->
		<div class="content-page">
			<!-- Start content -->
			<div class="content">
				<!-- Top Bar Start -->

				<jsp:include page="header.jsp"></jsp:include>

				<!-- Top Bar End -->
				<div class="page-content-wrapper">
					<div class="container-fluid">
						<div class="row">
							<div class="col-sm-12">
								<div class="page-title-box">
									<div class="btn-group float-right">
										<ol class="breadcrumb hide-phone p-0 m-0">
											<li class="breadcrumb-item"><a href="/">Home</a></li>
											<li class="breadcrumb-item"><a href="#">Manage
													Airplanes</a></li>
											<li class="breadcrumb-item active">View Airplanes</li>
										</ol>
									</div>
									<h4 class="page-title">View Airplane</h4>
								</div>
							</div>
						</div>
						<!-- end page title end breadcrumb -->

						<div class="row">
							<div class="col-12">
								<div class="card m-b-30">
									<div class="card-body">
										<table id="datatable-buttons"
											class="table table-striped table-bordered" cellspacing="0"
											width="100%">
											<thead>
												<tr>
													<th>No</th>
													<th>Airline Name</th>
													<th>Airplane Type</th>
													<th>Airplane Number</th>
													<!-- <th>First-Class Capacity</th>
													<th>Executive-Class Capacity</th>
													<th>Economy Capacity</th>
													<th>Total Capacity</th> -->
													<th>Airline Description</th>
													<th>Airplane Picture</th>
													<th>Action</th>
												</tr>
											</thead>
											<tbody>
												<c:forEach items="${ manageAirplanesList}" var="i"
													varStatus="j">
													<tr>
														<td>${ j.count}</td>
														<td>${ i.manageAirlineVO.airlineName}</td>
														<td>${ i.manageAirplaneTypeVO.airplaneType}</td>
														<td>${ i.airplaneNumber}</td>
														<!-- <td>100</td>
													<td>100</td>
													<td>100</td>
													<td>300</td> -->
														<td>${ i.airplaneDescription}</td>


														<td>

															<div id="myImg">


																<%-- <a
																	href="<%=request.getContextPath()%>/document/airplanes/${i.airplaneFileName}"
																	target="_blank"> --%> <img
																	src="<%=request.getContextPath()%>/document/airplanes/${i.airplaneFileName}"
																	target="_blank" alt="/${i.airplaneFileName}"
																	class="img-fluid" style="height: 50px; width: 50px;" onclick="fn(this)">
																<!-- </a> -->
															</div>
														<td><a href='editAirplanes?id=${i.id}'> <i
																class="mdi mdi-pencil font-20"></i>
														</a> <a href='deleteAirplanes?id=${i.id}'> <i
																class="mdi mdi-delete font-20 text-danger ml-3"></i>
														</a></td>
													</tr>
												</c:forEach>
											</tbody>
										</table>
									</div>
								</div>
							</div>
							<!-- end col -->
						</div>
						<!-- end row -->
					</div>
					<!-- container -->
				</div>
				<!-- Page content Wrapper -->
			</div>
			<!-- content -->
			<jsp:include page="footer.jsp"></jsp:include>
		</div>
		<!-- End Right content here -->
	</div>

	<div id="myModal" class="modal">
		<span class="close">&times;</span> <img class="modal-content"
			id="img01">
		<div id="caption"></div>
	</div>



	<!-- END wrapper -->
	<!-- jQuery  -->
	<script
		src="<%=request.getContextPath()%>/adminResources/js/jquery.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/popper.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/bootstrap.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/modernizr.min.js"></script>
	<script src="<%=request.getContextPath()%>/adminResources/js/detect.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/fastclick.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/jquery.slimscroll.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/jquery.blockUI.js"></script>
	<script src="<%=request.getContextPath()%>/adminResources/js/waves.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/jquery.nicescroll.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/jquery.scrollTo.min.js"></script>
	<!-- Required datatable js -->
	<script
		src="<%=request.getContextPath()%>/adminResources/js/jquery.dataTables.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/dataTables.bootstrap4.min.js"></script>
	<!-- Buttons examples -->
	<script
		src="<%=request.getContextPath()%>/adminResources/js/dataTables.buttons.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/buttons.bootstrap4.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/jszip.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/pdfmake.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/vfs_fonts.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/buttons.html5.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/buttons.print.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/buttons.colVis.min.js"></script>
	<!-- Responsive examples -->
	<script
		src="<%=request.getContextPath()%>/adminResources/js/dataTables.responsive.min.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/responsive.bootstrap4.min.js"></script>
	<!-- Datatable init js -->
	<script
		src="<%=request.getContextPath()%>/adminResources/js/datatables.init.js"></script>

	<!-- Custom js -->
	<script
		src="<%=request.getContextPath()%>\adminResources\js\custom\photoSet.js"></script>

	<!-- App js -->
	<script src="<%=request.getContextPath()%>/adminResources/js/app.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {
			$('#datatable2').DataTable();
		});
	</script>
</body>
</html>