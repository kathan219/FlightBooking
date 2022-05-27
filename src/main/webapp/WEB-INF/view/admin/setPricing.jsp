<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width,initial-scale=1,user-scalable=0,minimal-ui">
<title>Annex - Responsive Bootstrap 4 Admin Dashboard</title>
<meta content="Admin Dashboard" name="description">
<meta content="Mannatthemes" name="author">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<link rel="shortcut icon" href="assets/images/favicon.ico">
<link href="<%=request.getContextPath()%>/adminResources/css/bootstrap.min.css" rel="stylesheet"
	type="text/css">
<link href="<%=request.getContextPath()%>/adminResources/css/icons.css" rel="stylesheet"
	type="text/css">
<link href="<%=request.getContextPath()%>/adminResources/css/style.css" rel="stylesheet"
	type="text/css">
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
											<li class="breadcrumb-item"><a href="#">Home</a></li>
											<li class="breadcrumb-item"><a href="#">Manage City</a></li>
											<li class="breadcrumb-item active">Set Pricing</li>
										</ol>
									</div>
									<h4 class="page-title">Set Pricing</h4>
								</div>
							</div>
						</div>
						<!-- end page title end breadcrumb -->
						<div class="row">
							<div class="col-lg-12">
								<div class="card m-b-30">
									<div class="card-body">


										<form class="" action="#">
											<div class="form-group row">
												<label class="col-sm-2 col-form-label">Route Name</label>
												<div class="col-sm-10">
													<select class="form-control"><option
															selected="selected" disabled="disabled">Select</option>
														<option>Large select</option>
														<option>Small select</option></select>
												</div>
											</div>



											<div class="form-group">
												<label>Price Description</label>
												<div>
													<textarea required class="form-control" rows="5"></textarea>
												</div>
											</div>





											<div class="form-group row">

												<label class="col-sm-2 col-form-label">Infants</label>
												<div class="col-sm-4">
													<div>
														<div
															class="input-group bootstrap-touchspin bootstrap-touchspin-injected"
															class="form-control
															style="margin-left: -16px">
															<span class="input-group-btn input-group-prepend"><button
																	class="btn btn-primary bootstrap-touchspin-down"
																	type="button">-</button></span><input id="demo0" type="text"
																value="0" name="demo0" data-bts-min="0"
																data-bts-max="100" data-bts-init-val=""
																data-bts-step="1" data-bts-decimal="0"
																data-bts-step-interval="100"
																data-bts-force-step-divisibility="round"
																data-bts-step-interval-delay="500" data-bts-prefix=""
																data-bts-postfix="" data-bts-prefix-extra-class=""
																data-bts-postfix-extra-class="" data-bts-booster="true"
																data-bts-boostat="10" data-bts-max-boosted-step="false"
																data-bts-mousewheel="true"
																data-bts-button-down-class="btn btn-default"
																data-bts-button-up-class="btn btn-default"
																class="form-control"><span
																class="input-group-btn input-group-append"><button
																	class="btn btn-primary bootstrap-touchspin-up"
																	type="button">+</button></span>

														</div>
													</div>

												</div>
											</div>



											<div class="form-group row">

												<label class="col-sm-2 col-form-label">Children</label>
												<div class="col-sm-4">
													<div>
														<div
															class="input-group bootstrap-touchspin bootstrap-touchspin-injected"
															class="form-control
															style="margin-left: -16px">
															<span class="input-group-btn input-group-prepend"><button
																	class="btn btn-primary bootstrap-touchspin-down"
																	type="button">-</button></span><input id="demo0" type="text"
																value="0" name="demo0" data-bts-min="0"
																data-bts-max="100" data-bts-init-val=""
																data-bts-step="1" data-bts-decimal="0"
																data-bts-step-interval="100"
																data-bts-force-step-divisibility="round"
																data-bts-step-interval-delay="500" data-bts-prefix=""
																data-bts-postfix="" data-bts-prefix-extra-class=""
																data-bts-postfix-extra-class="" data-bts-booster="true"
																data-bts-boostat="10" data-bts-max-boosted-step="false"
																data-bts-mousewheel="true"
																data-bts-button-down-class="btn btn-default"
																data-bts-button-up-class="btn btn-default"
																class="form-control"><span
																class="input-group-btn input-group-append"><button
																	class="btn btn-primary bootstrap-touchspin-up"
																	type="button">+</button></span>

														</div>
													</div>

												</div>
											</div>

											<div class="form-group row">

												<label class="col-sm-2 col-form-label">Adults</label>
												<div class="col-sm-4">
													<div>
														<div
															class="input-group bootstrap-touchspin bootstrap-touchspin-injected"
															class="form-control
															style="margin-left: -16px">
															<span class="input-group-btn input-group-prepend"><button
																	class="btn btn-primary bootstrap-touchspin-down"
																	type="button">-</button></span><input id="demo0" type="text"
																value="0" name="demo0" data-bts-min="0"
																data-bts-max="100" data-bts-init-val=""
																data-bts-step="1" data-bts-decimal="0"
																data-bts-step-interval="100"
																data-bts-force-step-divisibility="round"
																data-bts-step-interval-delay="500" data-bts-prefix=""
																data-bts-postfix="" data-bts-prefix-extra-class=""
																data-bts-postfix-extra-class="" data-bts-booster="true"
																data-bts-boostat="10" data-bts-max-boosted-step="false"
																data-bts-mousewheel="true"
																data-bts-button-down-class="btn btn-default"
																data-bts-button-up-class="btn btn-default"
																class="form-control"><span
																class="input-group-btn input-group-append"><button
																	class="btn btn-primary bootstrap-touchspin-up"
																	type="button">+</button></span>

														</div>
													</div>

												</div>
											</div>

											<div class="form-group">
												<div class="custom-control custom-checkbox">
													<input type="checkbox" class="custom-control-input"
														id="customCheck1" data-parsley-multiple="groups"
														data-parsley-mincheck="2"> <label
														class="custom-control-label" for="customCheck1">Complimentary
														meal</label>
												</div>
											</div>
											<div class="form-group">
												<div class="custom-control custom-checkbox">
													<input type="checkbox" class="custom-control-input"
														id="customCheck1" data-parsley-multiple="groups"
														data-parsley-mincheck="2"> <label
														class="custom-control-label" for="customCheck1">Cancellation
														Policy*</label>
												</div>
											</div>

											<!-- <div class="form-group">
												<label class="col-sm-2 col-form-label">Charges</label>
												<div class="col-sm-2">
													<input type="text" class="form-control" placeholder="$">
												</div> -->
												 <div class="form-group">
													<div>
														<button type="submit"
															class="btn btn-primary waves-effect waves-light">Save</button>

													</div>
												</div>
											</div> 
										</form>
									</div>
								</div>
							</div>
							<!-- end col -->
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
	<!-- END wrapper -->
	<!-- jQuery  -->
	<script src="<%=request.getContextPath()%>/adminResources/js/jquery.min.js"></script>
	<script src="<%=request.getContextPath()%>/adminResources/js/popper.min.js"></script>
	<script src="<%=request.getContextPath()%>/adminResources/js/bootstrap.min.js"></script>
	<script src="<%=request.getContextPath()%>/adminResources/js/modernizr.min.js"></script>
	<script src="<%=request.getContextPath()%>/adminResources/js/detect.js"></script>
	<script src="<%=request.getContextPath()%>/adminResources/js/fastclick.js"></script>
	<script src="<%=request.getContextPath()%>/adminResources/js/jquery.slimscroll.js"></script>
	<script src="<%=request.getContextPath()%>/adminResources/js/jquery.blockUI.js"></script>
	<script src="<%=request.getContextPath()%>/adminResources/js/waves.js"></script>
	<script src="<%=request.getContextPath()%>/adminResources/js/jquery.nicescroll.js"></script>
	<script src="<%=request.getContextPath()%>/adminResources/js/jquery.scrollTo.min.js"></script>
	<!-- Parsley js -->
	<script type="text/javascript" src="<%=request.getContextPath()%>/adminResources/js/parsley.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {
			$('form').parsley();
		});
	</script>
	<!-- App js -->
	<script src="<%=request.getContextPath()%>/adminResources/js/app.js"></script>
</body>
</html>