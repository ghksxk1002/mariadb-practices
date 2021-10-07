package bookmall.vo;

public class BookVo {
	private int no;
	private int price;
	private String title;
	private int categroyNo;

	public BookVo() {
	}

	public BookVo(int no, int price, String title, int categroyNo) {
		this.no = no;
		this.price = price;
		this.title = title;
		this.categroyNo = categroyNo;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCategroyNo() {
		return categroyNo;
	}

	public void setCategroyNo(int categroyNo) {
		this.categroyNo = categroyNo;
	}

	@Override
	public String toString() {
		return "BookVo [no=" + no + ", price=" + price + ", title=" + title + ", categroyNo=" + categroyNo + "]";
	}

}
