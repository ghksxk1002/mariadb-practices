package bookmall.vo;

public class OrderBookVo {
	private Long bookNo;
	private Long amuount;
	private Long orderNo;
	private Long book_no;
	public Long getBookNo() {
		return bookNo;
	}
	public void setBookNo(Long bookNo) {
		this.bookNo = bookNo;
	}
	public Long getAmuount() {
		return amuount;
	}
	public void setAmuount(Long amuount) {
		this.amuount = amuount;
	}
	public Long getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(Long orderNo) {
		this.orderNo = orderNo;
	}
	public Long getBook_no() {
		return book_no;
	}
	public void setBook_no(Long book_no) {
		this.book_no = book_no;
	}
	@Override
	public String toString() {
		return "OrderBookVo [bookNo=" + bookNo + ", amuount=" + amuount + ", orderNo=" + orderNo + ", book_no="
				+ book_no + "]";
	}
	
	
}
