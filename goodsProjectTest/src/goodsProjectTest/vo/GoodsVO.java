package goodsProjectTest.vo;

public class GoodsVO {

	private long no;
	private String name;
	private long price;


	public long getNo() {
		return no;
	}

	public void setNo(long no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "GoodsVO [no=" + no + ", name=" + name + ", price=" + price + "]";
	}



}
