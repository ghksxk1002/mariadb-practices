package bookmall.dao.test;

import java.util.List;

import bookmall.dao.MemberDao;
import bookmall.vo.MemberVo;


public class MemberDaoTest {
	public static void main(String[] args) {
		//insertTest();
		findAllTest();
	}

	private static void findAllTest() {
		List<MemberVo> list = new MemberDao().findAll();
		for (MemberVo vo : list) {
			System.out.println(vo);
		}
	}

	private static void insertTest() {
		MemberVo vo = null;
		MemberDao dao = new MemberDao();

		vo = new MemberVo();
		vo.setName("이승현");
		vo.setPhoneNo("01056859658");
		vo.setEmail("ghksiie@naver.com");
		vo.setPassword("ejjjfksuekjfh");
		dao.insert(vo);
		
		vo = new MemberVo();
		vo.setName("이승환");
		vo.setPhoneNo("01065898265");
		vo.setEmail("mmdkei@naver.com");
		vo.setPassword("efsdfeefff");
		dao.insert(vo);

	}
}
