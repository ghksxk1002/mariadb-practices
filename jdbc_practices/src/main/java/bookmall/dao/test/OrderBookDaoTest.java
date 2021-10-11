package bookmall.dao.test;

import java.util.List;

import bookmall.dao.OrderBookDao;
import bookmall.vo.OrderBookVo;

public class OrderBookDaoTest {

	public static void main(String[] args) {
		//insertTest();
		findAllTest();
	}
	
	private static void insertTest() {
		OrderBookVo vo = null;
		OrderBookDao dao = new OrderBookDao();
		
		vo = new OrderBookVo();
		vo.setOrderNo(3L);
		vo.setBookNo(1L);
		vo.setAmuount(10L);
		dao.insert(vo);
		
		vo = new OrderBookVo();
		vo.setOrderNo(3L);
		vo.setBookNo(2L);
		vo.setAmuount(20L);
		dao.insert(vo);
		
		
	}
	
	private static void findAllTest() {
		List<OrderBookVo> list = new OrderBookDao().findAll();
		for(OrderBookVo vo : list) {
			System.out.println(vo);
		}
	}
}