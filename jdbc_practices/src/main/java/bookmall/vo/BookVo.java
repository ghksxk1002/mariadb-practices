package bookmall.vo;

public class BookVo {
	private Long no;
	private Long price;
	private String title;
	private Long categroyNo;
	private String cateName;

	public BookVo() {
	}

	public BookVo(Long no, Long price, String title, Long categroyNo) {
		this.no = no;
		this.price = price;
		this.title = title;
		this.categroyNo = categroyNo;
	}

	public Long getNo() {
		return no;
	}

	public void setNo(Long no) {
		this.no = no;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getCategroyNo() {
		return categroyNo;
	}

	public void setCategroyNo(Long categroyNo) {
		this.categroyNo = categroyNo;
	}

	public String getCateName() {
		return cateName;
	}

	public void setCateName(String cateName) {
		this.cateName = cateName;
	}

	@Override
	public String toString() {
		return "BookVo [no=" + no + ", price=" + price + ", title=" + title + ", categroyNo=" + categroyNo
				+ ", cateName=" + cateName + "]";
	}
	

}
