package bookshop.main;

import java.util.List;
import java.util.Scanner;

import bookshop.dao.BookDao;
import bookshop.vo.BookVo;

public class BookShop {

	public static void main(String[] args) {
		diplayBookInfo();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("대여하고 싶은 책의 번호를 입력하세요:");
		Long no = scanner.nextLong();
		scanner.close();
		
		new BookDao().update(no, "대여중");
		
		diplayBookInfo();
	}

	private static void diplayBookInfo() {
		System.out.println("******도서정보출력******");
		
		List<BookVo> list = new BookDao().findAll();
		for(BookVo vo : list) {
			String info = String.format("[%d] 책 제목: %s 작가: %s 대여유무: %s,",vo.getNo(), vo.getTitle(), vo.getAuthorName(), vo.getStatus());
			System.out.println(info);
		}
	}

}
