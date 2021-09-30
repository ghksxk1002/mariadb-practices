# SQL예제 리눅스로 다운받기

> 1. sftp wedmaster@"내 로컬주소" 

> 2. webmaster로 다운받은 파일 다운

![예제stfp로webmaster에 다운](C:\Users\user\Desktop\캡쳐파일\예제stfp로webmaster에 다운.PNG)

> 3.  위치 root , root로 예제 mv => mv /home/webmaster/employess_db.zip .

> 4. zip 파일이기 때문에 unzip 패키지 다운받고 압축해제

> 5. cd /employees_db 위치로 이동후에 mysql -p < employees_db 하면 에러남 ... db생성하고 새로운 사용자도 만들어야됨

> 6. 데이터 베이스 만들고 -> 사용자 생성  인증하고 -> 권한부여

```
create database employees

create user  'user'@'내 로컬 주소' identified by 'password'

grant all privileges on employess.* to.  'user'@'내 로컬 주소'

flush privileges
```

> 7. workbench 에서 새로운 연결

![새로운 연결생성](C:\Users\user\Desktop\캡쳐파일\새로운 연결생성.PNG)

> 8. 다운로드 확인

![다운로드확인](C:\Users\user\Desktop\캡쳐파일\다운로드확인.PNG)