# study

##프로젝트 개요
study 프로젝트는 SpringBoot를 공부하기 위해 시작한 프로젝트로 간단한 쇼핑몰의 Admin 페이지를 개발하는 것을 목표로 한 클론 코딩 프로젝트입니다.
해당 프로젝트는 SpringBoot를 이용하여 진행하였으며, DB는 MySQL을 사용, JPA를 이용하여 연동하였습니다. 이용자와 상품, 파트너사 등의 Entity들의
간단한 CRUD 기능을 구현하였으며 Rest Client를 통해 테스트하고 최종적으로 제공된 프론트엔드을 합쳐 이용자 목록을 화면에 나타내는 기능까지 구현하였습니다.

##주요 기능
- 이용자의 생성, 조회, 수정, 삭제 기능
- 상품과 카테고리, 파트너사 등의 CRUD 기능
- 이용자가 주문한 내역(주문한 제품의 총 갯수와 가격, 도착 날짜, 주문의 형태, 지불방식 등) 생성 및 조회 기능
- 이용가가 주문한 제품의 상세 내역(상품 도착 날짜, 상품의 갯수, 총 가격, 상품의 id 등) 생성 및 조회 기능


##구현 화면
추가바람


##학습 내용
###SpringMVC
기본적인 SpringMVC의 어노테이션을 이용한 REST API의 작성법을 학습하였습니다.
- @GetMapping
- @PostMapping
- @PutMapping
- @PatchMapping
- @DeleteMapping
- @PathVariable
- @RequestBody 

###SpirngFramework 패키지
기본적인 의존성 주입 방법과, 페이징 등에 대하여 학습하였습니다.
- @Autowired 어노테이션을 통한 의존성 주입
- @Pageable 어노테이션을 통한 데이터의 페이징 방법

###MySQL
- MySQL WorkBench 사용법(Reverse Engineering 등)
- 테이블간 연관 관계 설정

###JPA
- JpaRepository를 통한 DB 연동
- 연관관계 설정을 위한 어노테이션 사용법(@OneToMany, @ManyToOne 등)

###Java
- enum 형태의 데이터 관리(공통적으로 작성되는 데이터부분을 enum으로 관리하여 데이터 검증과 리팩토링에 유리)
