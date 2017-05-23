package net.junshoong.sample.domain;

public class Item {
	private long id;
	
	private String content;
	
	private String level;
	
	public Item() { }
	
	public Item(long id, String content, String level) {
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

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
	
	@Override
	public String toString() {
		return "id :" + id + 
				", content : " + content + 
				", level : " + level;
	}
	
	

}
