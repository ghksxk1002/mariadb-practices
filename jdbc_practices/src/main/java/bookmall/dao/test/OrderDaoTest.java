package bookmall.dao.test;

import java.util.List;

import bookmall.dao.OrderDao;
import bookmall.vo.OrderVo;

public class OrderDaoTest {

	public static void main(String[] args) {
		//insertTest();
		findAllTest();
	}

	private static void insertTest() {
		OrderVo vo = null;
		OrderDao dao = new OrderDao();

		vo = new OrderVo();
		vo.setOrderNo(1L);
		vo.setPrice(30000L);
		vo.setDirlok("부산시 동래구");
		vo.setMamber_no(6L);
		dao.insert(vo);

	}

	private static void findAllTest() {
		List<OrderVo> list = new OrderDao().findAll();
		for (OrderVo vo : list) {
			System.out.println(vo);
		}
	}

}
