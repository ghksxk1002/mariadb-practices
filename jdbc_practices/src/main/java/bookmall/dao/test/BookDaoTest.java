package bookmall.dao.test;

import bookmall.dao.BookDao;
import bookmall.vo.BookVo;

public class BookDaoTest {
	
	public static void main(String[] args) {
		insertTest();
	}

	private static void insertTest() {
		BookVo vo = null;
		BookDao dao = new BookDao();
		
		vo = new BookVo();
		vo.setTitle("해리포터");
		vo.setPrice(30000);
		vo.setCategroyNo(1);
		dao.insert(vo);

		vo = new BookVo();
		vo.setTitle("내일기");
		vo.setPrice(60000);
		vo.setCategroyNo(2);
		dao.insert(vo);

	}
}
