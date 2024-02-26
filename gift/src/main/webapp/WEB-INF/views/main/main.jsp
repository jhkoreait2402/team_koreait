<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/main/main.css">
<script src="resources/js/httpRequest.js"></script>
<script type="text/javascript">
	function cate(cate) {
		
		if(cate.classList.contains('categorylist_all')) {
			/* alert('전체~'); */
			console.log('전체 클릭');
			return;
		}
		console.log(cate.classList[1]);
		/* 카테고리no 가져가서 디비조회 */
		/* alert('카테고리~'); */
		console.log('카테고리 클릭');
		
	/* 	sendRequest(url, param, cateItemRs, "GET"); */
	}
	
	// <strong id="itemListCnt">, <ul id="itemList">
/* 	function cateItemRs() {
		let cnt = document.getElementById('itemListCnt');
		let list = document.getElementById('itemList');
		
		cnt.innerHTML = 
		itemList.innerHTML = 
		
		
	} */
</script>
</head>
<body>
<div id="wrapper">

	<!-- 헤더영역 -->
	<header>
	    header
	</header>

	<main>
		<!-- 광고 -->
		<section id="main-banner" class="section">
			<div class="swiper _swiper-01">
				<div class="swiper-wrapper">
				광고배너
				</div>
			</div>
		</section>
		
		<!-- 상품목록 -->
		<section id="main-product" class="section">
			<div class="wrap">	
				<!-- 카테고리 -->
				<div id="cateArea">
					<div class="cateListWrap">
						<ul class="cateList">
							<li id="category" class="category categorylist_all" onclick="cate(this)" tabindex="0"> 
									<div class="img">
										<img src="resources/images/main/cate00.png" alt="전체">
									</div>
									<p>전체</p>
							</li>
							<c:forEach var="cate" items="${cateInfo}" >
							<li id="category" class="category ${cate.category_no}" onclick="cate(this)" tabindex="0"><!-- 카테고리별 idx ? -->
								<!-- <a href="" class> -->	
									<div class="img">
										<img src="resources/images/main/cate0${cate.category_no}.png" alt="${cate.category_name}">
									</div>
									<p>${cate.category_name}</p>
								<!-- </a>  -->
							</li>
							</c:forEach>
						</ul>			
					</div>
				</div>
				<!-- //카테고리 -->
				
				<!-- 상품 -->
				<div id="itemArea">
					<div class="itemInner">
						<!-- 탭 -->
						<div class="tabWrap">
							<p class="total">총 
							<strong id="itemListCnt">${itemCount}</strong><!-- item에 카테고리1이 총몇개있는지 -->
							개
							</p>
							<div class="tab">
								<a href="" class="hot">인기순</a> <!-- 클릭시 on 추가 -->
								<a href="" class="lowPrice">낮은가격순</a> <!-- 클릭시 on 추가 -->
								<a href="" class="highPrice">높은가격순</a> <!-- 클릭시 on 추가 -->
							</div>
						</div>
						<!-- 목록 -->
						<div class="itemListWrap">
							<ul id="itemList" class="itemList">
								<c:forEach var="item" items="${itemList}">
								<li class id="">
									<a href="item/${item.item_no}" class="inner">
										<!-- 상품 이미지 -->
										<div class="item_img">
											<img src="resources/images/item/${item.item_image}.jpg">
										</div>
										<!-- 상품 정보 -->
										<div class="txtWrap">
											<span class="brandNm">${item.brand}</span>
											<p class="itemNm">${item.item_name}</p>
											<span class="price">${item.item_price}</span>
										</div>
									</a>
								</li>
								</c:forEach>
							</ul>
						</div>						
					</div>
				</div>
				<!-- //상품 -->
			</div>
		</section>
	</main>
</div>

	<!-- 푸터영역 -->
    <footer>
		footer
	</footer>

</body>
<script type="text/javascript">

let cateList = Array.from(document.querySelectorAll("#category"));

for(let i=0; i < cateList.length; i++) {

	cateList[i].addEventListener("blur", function() {
		let div = cateList[i].querySelector('div');
		div.classList.remove('on');
	});
	
	cateList[i].addEventListener("click", function() {
		let div = cateList[i].querySelector('div');
		div.classList.add('on');
	});
}

</script>
</html>