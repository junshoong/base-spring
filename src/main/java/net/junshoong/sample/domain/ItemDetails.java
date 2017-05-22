package net.junshoong.sample.domain;

public class ItemDetails {
	private long id;
	
	private String content;
	
	private int level;
	
	public ItemDetails() { }
	
	public ItemDetails(long id, String content, int level) {
		this.id = id;
		this.content = content;
		this.level = level;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	@Override
	public String toString() {
		return "id :" + id + 
				", content : " + content + 
				", level : " + level;
	}
	
	

}