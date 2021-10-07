package bookmall.dao;

public class CartDao {
	private int memberNo;
	private int bookNo;
	private int amount;
	
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "CartDao [memberNo=" + memberNo + ", bookNo=" + bookNo + ", amount=" + amount + "]";
	}
	
}
