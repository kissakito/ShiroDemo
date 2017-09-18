<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<div id="content" class="col-md-12">









				<!-- page header -->
			<!-- 	<div class="pageheader">


					<h2>
						<i class="fa fa-tachometer"></i> Dashboard 
					</h2>


					<div class="breadcrumbs">
						<ol class="breadcrumb">
							<li>You are here</li>
							<li><a href="index.html">Online Shopping  System</a></li>
							<li class="active">Dashboard</li>
						</ol>
					</div>


				</div>
				/page header
 -->





				<!-- content main container -->
				<div class="main">



					<!-- cards -->
					<div class="row cards" style="height:13%">

						<div class="card-container col-lg-3 col-sm-6 col-sm-12">
							<div class="card card-redbrown hover">
								<div class="front">

									<div class="media">
										<span class="pull-left"> <i
											class="fa fa-users media-object"></i>
										</span>

										<div class="media-body">
											<small>新用户</small>
											<h2 class="media-heading animate-number" data-value="3659"
												data-animation-duration="1500">0</h2>
										</div>
									</div>

									<div class="progress-list">
										<div class="details">
											<div class="title">月计划 %</div>
										</div>
										<div class="status pull-right bg-transparent-black-1">
											<span class="animate-number" data-value="83"
												data-animation-duration="1500">0</span>%
										</div>
										<div class="clearfix"></div>
										<div
											class="progress progress-little progress-transparent-black">
											<div class="progress-bar animate-progress-bar"
												data-percentage="83%"></div>
										</div>
									</div>

								</div>
								<div class="back">
									<a href="#"> <i class="fa fa-rmb fa-4x"></i> <span>Check
											Summary</span>
									</a>
								</div>
							</div>
						</div>


						<div class="card-container col-lg-3 col-sm-6 col-sm-12">
							<div class="card card-blue hover">
								<div class="front">

									<div class="media">
										<span class="pull-left"> <i
											class="fa fa-shopping-cart media-object"></i>
										</span>

										<div class="media-body">
											<small>订单量</small>
											<h2 class="media-heading animate-number" data-value="19214"
												data-animation-duration="1500">0</h2>
										</div>
									</div>

									<div class="progress-list">
										<div class="details">
											<div class="title">月计划 %</div>
										</div>
										<div class="status pull-right bg-transparent-black-1">
											<span class="animate-number" data-value="100"
												data-animation-duration="1500">0</span>%
										</div>
										<div class="clearfix"></div>
										<div
											class="progress progress-little progress-transparent-black">
											<div class="progress-bar animate-progress-bar"
												data-percentage="100%"></div>
										</div>
									</div>

								</div>
								<div class="back">
									<a href="#"> <i class="fa fa-bar-chart-o fa-4x"></i> <span>Check
											Summary</span>
									</a>
								</div>
							</div>
						</div>



						<div class="card-container col-lg-3 col-sm-6 col-sm-12">
							<div class="card card-greensea hover">
								<div class="front">

									<div class="media">
										<span class="pull-left"> <i
											class="fa fa-jpy media-object"></i>
										</span>

										<div class="media-body">
											<small>销售额</small>
											<h2 class="media-heading animate-number" data-value="169541"
												data-animation-duration="1500">0</h2>
										</div>
									</div>

									<div class="progress-list">
										<div class="details">
											<div class="title">月计划 %</div>
										</div>
										<div class="status pull-right bg-transparent-black-1">
											<span class="animate-number" data-value="42"
												data-animation-duration="1500">0</span>%
										</div>
										<div class="clearfix"></div>
										<div
											class="progress progress-little progress-transparent-black">
											<div class="progress-bar animate-progress-bar"
												data-percentage="42%"></div>
										</div>
									</div>

								</div>
								<div class="back">
									<a href="#"> <i class="fa fa-bar-chart-o fa-4x"></i> <span>Check
											Summary</span>
									</a>
								</div>
							</div>
						</div>


						<div class="card-container col-lg-3 col-sm-6 col-xs-12">
							<div class="card card-slategray hover">
								<div class="front">

									<div class="media">
										<span class="pull-left"> <i
											class="fa fa-eye media-object"></i>
										</span>

										<div class="media-body">
											<small>访问量</small>
											<h2 class="media-heading animate-number" data-value="9634"
												data-animation-duration="1500">0</h2>
										</div>
									</div>

									<div class="progress-list">
										<div class="details">
											<div class="title">月计划 %</div>
										</div>
										<div class="status pull-right bg-transparent-black-1">
											<span class="animate-number" data-value="25"
												data-animation-duration="1500">0</span>%
										</div>
										<div class="clearfix"></div>
										<div
											class="progress progress-little progress-transparent-black">
											<div class="progress-bar animate-progress-bar"
												data-percentage="25%"></div>
										</div>
									</div>

								</div>
								<div class="back">
									<a href="#"> <i class="fa fa-bar-chart-o fa-4x"></i> <span>Check
											Summary</span>
									</a>
								</div>
							</div>
						</div>


					</div>
					<!-- /cards -->




					<!-- row -->
					<div class="row">


						<!-- col 8 -->
						<div class="col-lg-8 col-md-12">




							<!-- tile -->
							<section class="tile transparent">




								<!-- tile header -->
								<div
									class="tile-header color transparent-black textured rounded-top-corners">
									<h1>
										<strong>月销量统计图表</strong> 
									</h1>
									<div class="controls">
										<a href="#" class="refresh"><i class="fa fa-refresh"></i></a>
										<a href="#" class="remove"><i class="fa fa-times"></i></a>
									</div>
								</div>
								<!-- /tile header -->


								<!-- tile widget -->
								<div class="tile-widget color transparent-black textured"
									style="margin-bottom:10px;">
									<div id="statistics-chart" class="chart statistics"
										style="height: 250px;"></div>
								</div>
								<!-- /tile widget -->


								<!-- tile body -->
								<div
									class="tile-body color transparent-white rounded-bottom-corners">
									<div class="row">
										<ul class="inline">

											<li class="col-md-8 col-sm-12 col-xs-12 text-center">

												<h4 class="underline text-left">
													<strong>总量统计</strong> 
												</h4>

												<div class="inner-container inline">
													<div data-percent="100" data-size="140"
														class="pie-chart inline" data-scale-color="false"
														data-track-color="rgba(0,0,0,0)" data-bar-color="#ffffff"
														data-line-width="5">
														<div class="text-center">
															<i class="fa fa-rmb fa-5x"></i>
														</div>
													</div>
													<p class="chart-overall text-center medium-thin uppercase">
														<span class="big-medium animate-number" data-value="6175"
															data-animation-duration="2500">0</span> Sales
													</p>
												</div>


												<div class="inner-container inline">
													<div data-percent="85" data-size="140"
														class="pie-chart inline" data-scale-color="false"
														data-track-color="rgba(0,0,0,0)"
														data-bar-color="rgba(0,0,0,.4)" data-line-width="5">
														<div class="text-center">
															<span><i
																class="fa fa-eye fa-5x color-transparent-black"></i></span>
														</div>
													</div>
													<p
														class="chart-overall text-center medium-thin uppercase color-transparent-black">
														<span class="big-medium animate-number" data-value="8213"
															data-animation-duration="2500">0</span> Visits
													</p>
												</div>

											</li>

											<li class="col-md-4 col-sm-12 col-xs-12">
												<h4 class="underline">
													<strong>用户分布</strong> 
												</h4>
												<ul class="progress-list">
													<li>
														<div class="details">
															<div class="title">America</div>
															<div class="description">Visitors from America</div>
														</div>
														<div class="status pull-right">
															<span class="animate-number" data-value="40"
																data-animation-duration="1500">0</span>%
														</div>
														<div class="clearfix"></div>
														<div class="progress progress-little">
															<div
																class="progress-bar progress-bar-green animate-progress-bar"
																data-percentage="40%" style="width: 0%;"></div>
														</div>
													</li>
													<li>
														<div class="details">
															<div class="title">Europe</div>
															<div class="description">Visitors from Europe</div>
														</div>
														<div class="status pull-right">
															<span class="animate-number" data-value="38"
																data-animation-duration="1000">0</span>%
														</div>
														<div class="clearfix"></div>
														<div class="progress progress-little">
															<div
																class="progress-bar progress-bar-cyan animate-progress-bar"
																data-percentage="35%" style="width: 0%;"></div>
														</div>
													</li>
													<li>
														<div class="details">
															<div class="title">Asia</div>
															<div class="description">Visitors from Asia</div>
														</div>
														<div class="status pull-right">
															<span class="animate-number" data-value="12"
																data-animation-duration="800">0</span>%
														</div>
														<div class="clearfix"></div>
														<div class="progress progress-little">
															<div
																class="progress-bar progress-bar-amethyst animate-progress-bar"
																data-percentage="12%" style="width: 0%;"></div>
														</div>
													</li>
													<li>
														<div class="details">
															<div class="title">Africa</div>
															<div class="description">Visitors from Africa</div>
														</div>
														<div class="status pull-right">
															<span class="animate-number" data-value="7"
																data-animation-duration="600">0</span>%
														</div>
														<div class="clearfix"></div>
														<div class="progress progress-little">
															<div
																class="progress-bar progress-bar-orange animate-progress-bar"
																data-percentage="7%" style="width: 0%;"></div>
														</div>
													</li>
													<li>
														<div class="details">
															<div class="title">Other</div>
														</div>
														<div class="status pull-right">
															<span class="animate-number" data-value="6"
																data-animation-duration="400">0</span>%
														</div>
														<div class="clearfix"></div>
														<div class="progress progress-little">
															<div
																class="progress-bar progress-bar-red animate-progress-bar"
																data-percentage="6%" style="width: 0%;"></div>
														</div>
													</li>
												</ul>
											</li>
										</ul>
									</div>
								</div>
								<!-- /tile body -->



							</section>
							<!-- /tile -->



						</div>
						<!-- /col 8 -->



						<!-- col 4 -->
						<div class="col-lg-4 col-md-12 col-sm-12 col-xs-12">




							<!-- tile -->
							<section class="tile color transparent-black textured">




								<!-- tile header -->
								<div class="tile-header">
									<h1>
										<strong>实时访问量</strong>
									</h1>
									<div class="controls">
										<a href="#" class="refresh"><i class="fa fa-refresh"></i></a>
										<a href="#" class="remove"><i class="fa fa-times"></i></a>
									</div>
								</div>
								<!-- /tile header -->

								<!-- tile widget -->
								<div class="tile-widget">

									<div class="progress-list with-heading">
										<div class="details">
											<div class="title">
												<h2>
													<i class="fa fa-hdd-o"></i> <span class="animate-number"
														data-value="394" data-animation-duration="1600">0</span>
													GB
												</h2>
											</div>
										</div>
										<div class="status pull-right bg-transparent-black-1">
											<span class="animate-number" data-value="42"
												data-animation-duration="1500">0</span>%
										</div>
										<div class="clearfix"></div>
										<div
											class="progress progress-little progress-transparent-black"
											style="margin-bottom: 5px">
											<div class="progress-bar animate-progress-bar"
												data-percentage="42%"></div>
										</div>
									</div>
									<p class="description">
										<strong>394GB</strong> used of <strong class="white-text">2,048GB</strong>
										on File Server
									</p>
								</div>
								<!-- /tile widget -->


								<!-- tile body -->
								<div class="tile-body paddingtop">
									<div id="serverload-chart"></div>
								</div>
								<!-- /tile body -->



							</section>
							<!-- /tile -->


							<!-- tile -->
							<section class="tile color transparent-black">



								<!-- tile header -->
								<div class="tile-header">
									<h1>
										<strong>浏览器使用分布</strong>
									</h1>
									<div class="controls">
										<a href="#" class="refresh"><i class="fa fa-refresh"></i></a>
										<a href="#" class="remove"><i class="fa fa-times"></i></a>
									</div>
								</div>
								<!-- /tile header -->

								<!-- tile body -->
								<div class="tile-body">
									<div id="browser-usage" style="height: 230px;"
										class="morris-chart"></div>
									<ul class="inline text-center chart-legend">
										<li><span class="badge badge-outline"
											style="border-color: #00a3d8"></span> Chrome <small>25%</small>,</li>
										<li><span class="badge badge-outline"
											style="border-color: #1693A5"></span> Other <small>25%</small>,</li>
										<li><span class="badge badge-outline"
											style="border-color: #2fbbe8"></span> Safari <small>20%</small>,</li>
										<li><span class="badge badge-outline"
											style="border-color: #72cae7"></span> Firefox <small>15%</small>,</li>
										<li><span class="badge badge-outline"
											style="border-color: #ffc100"></span> Internet Explorer <small>10%</small>,</li>
										<li><span class="badge badge-outline"
											style="border-color: #d9544f"></span> Opera <small>5%</small></li>
									</ul>
								</div>
								<!-- /tile body -->




							</section>
							<!-- /tile -->






						</div>
						<!-- /col 4 -->


					</div>
					<!-- /row -->


				



				</div>
				<!-- /content container -->






			</div>