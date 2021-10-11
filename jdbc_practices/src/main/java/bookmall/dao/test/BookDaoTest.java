package bookmall.dao.test;

import java.util.List;

import bookmall.dao.BookDao;
import bookmall.vo.BookVo;

public class BookDaoTest {

	public static void main(String[] args) {
		//insertTest();
		findAllTest();
	}

	private static void findAllTest() {
		List<BookVo> list = new BookDao().findAll();
		for (BookVo vo : list) {
			System.out.println(vo);
		}
	}

	private static void insertTest() {
		BookVo vo = null;
		BookDao dao = new BookDao();

		vo = new BookVo();
		vo.setTitle("해리포터");
		vo.setPrice(30000L);
		vo.setCategroyNo(1L);
		dao.insert(vo);

		vo = new BookVo();
		vo.setTitle("내일기");
		vo.setPrice(60000L);
		vo.setCategroyNo(2L);
		dao.insert(vo);

	}
}
