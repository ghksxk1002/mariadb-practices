package bookmall.vo;

public class OrderVo {
	private int no;
	private Long orderNo;
	private int price;
	private String dirlok;
	private Long mamber_no;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public Long getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(Long orderNo) {
		this.orderNo = orderNo;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDirlok() {
		return dirlok;
	}
	public void setDirlok(String dirlok) {
		this.dirlok = dirlok;
	}
	public Long getMamber_no() {
		return mamber_no;
	}
	public void setMamber_no(Long mamber_no) {
		this.mamber_no = mamber_no;
	}
	@Override
	public String toString() {
		return "OrderVo [no=" + no + ", orderNo=" + orderNo + ", price=" + price + ", dirlok=" + dirlok + ", mamber_no="
				+ mamber_no + "]";
	}
	
	
	
}
