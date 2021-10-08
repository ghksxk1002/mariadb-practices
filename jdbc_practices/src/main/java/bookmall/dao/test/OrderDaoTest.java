package bookmall.dao.test;

import java.util.List;

import bookmall.dao.OrderDao;
import bookmall.vo.OrderVo;


public class OrderDaoTest {

	public static void main(String[] args) {
		insertTest();
		findAllTest();
	}

	private static void findAllTest() {
		List<OrderVo> list = new OrderDao().findAll();
		for (OrderVo vo : list) {
			System.out.println(vo);
		}
	}

	private static void insertTest() {
		OrderVo vo = null;
		OrderDao dao = new OrderDao();

		vo = new OrderVo();
		vo.setOrderNo("5558699");
		dao.insert(vo);

//		vo = new CategoryVo();
//		vo.setName("소설");
//		dao.insert(vo);

	}

}
