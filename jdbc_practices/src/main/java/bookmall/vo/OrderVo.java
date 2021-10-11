package bookmall.vo;

public class OrderVo {
	private Long no;
	private Long orderNo;
	private Long price;
	private String dirlok;
	private Long mamber_no;
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public Long getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(Long orderNo) {
		this.orderNo = orderNo;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
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
