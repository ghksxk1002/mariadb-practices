# workbrench 에서 작업하기

## SQL 연습

#### -- Bassic Query

#### -- 테이블 삭제

```
drop table pet;
```

#### -- 테이블 만들기

```
create table pet(
	name varchar(20),
    owner varchar(20),
    species varchar(20),
    gender char(1),
    birth DATE,
    death DATE
);
```



#### -- scheme 확인

desc pet;

[테이블만들기연습](C:\Users\user\Desktop\캡쳐파일\테이블만들기연습.PNG)



#### -- 테이터 넣기 insert , (넣을값)value ('성탄이', '안대혁', 'dog', 'm', '2018-12-28', null);

#### 테이블 순서대로 넣어야됨 <name, owner, species, gender, birth, death>

```
insert
	into pet
	value ('성탄이', '안대혁', 'dog', 'm', '2018-12-28', null);
```

![value값 추가](C:\Users\user\Desktop\캡쳐파일\value값 추가.PNG)

#### -- 데이터 삭제(delete)

```
delete
  from pet
 where name = '성탄이';
```

> pet 테이블의 성탄이열이 사라짐

![성탄이삭제](C:\Users\user\Desktop\캡쳐파일\성탄이삭제.PNG)

#### -- 조회(검색,select), 프로젝션 원하는 칼럼을 select해서 조회하는것

```
select name, owner, species, gender, birth, death from pet;
```

#### -- load data local infile : 로컬에있는 파일 받아오기

```
load data local infile 'c:\\pet.txt' into table pet;	
```

> 권한때문에 설정을 해주어야됨 
>
> OPT_LOCAL_INFILE=1

![로컬파일로드시에러해결](C:\Users\user\Desktop\캡쳐파일\로컬파일로드시에러해결.PNG)

#### -- update death

```
update pet
   set death=null
 where name != 'Bowser';
```

> 이름이 Bower가 아닌 열의 death를 null로 만듬

![로컬에있는파일불러온후 null값 지정](C:\Users\user\Desktop\캡쳐파일\로컬에있는파일불러온후 null값 지정.PNG)

#### -- 조회연습1:where

```
-- 1990년 이후에 태어난 아이들은?
select name, species, birth
  from pet
 where birth > '1990-12-31';
```

> pet 에서 1991년 이후에 태어난 아이들을 찾는다

![where연습1](C:\Users\user\Desktop\캡쳐파일\where연습1.PNG)

#### -- Gwem과 함께 사는 아이는?

```
select name, species, owner
  from pet
 where owner = 'Gwen';
-- null 다루기 1 : 살아있는 애들은?
select  name, birth, death
  from pet
 where death is null;
    
-- null 다루기 2 : 죽어있는 애들은?
select  name, birth, death
  from pet
 where death is not null;
```

#### -- like 검색(패턴 매칭) : 이름이 b로 시작하는 아이는?

```
select name from pet where name like 'b%';
```

#### -- like 검색(패턴 매칭) : 이름이 b로 시작하는 아이들 중에 이름이 6자인 아이는?

```
select name from pet where name like 'b______';
```

#### -- 집계(통계) 함수

```
select count(*) from pet;

select count(death) from pet;
select count(*) from pet where death is not null;
```

