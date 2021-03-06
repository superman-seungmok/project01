package global03.groot.model;

import java.sql.Timestamp;

public class DebateBoardDTO {
	private Integer postNo;
	private Integer genre;
	private String id;
	private String bookName;
	private String subject;
	private String content;
	private Integer cbCheck;
	private Integer chanCnt;
	private Integer banCnt;
	private Integer readCnt;
	private Integer liked;
	private Timestamp reg;
	
	public Integer getPostNo() {
		return postNo;
	}
	public void setPostNo(Integer postNo) {
		this.postNo = postNo;
	}
	public Integer getGenre() {
		return genre;
	}
	public void setGenre(Integer genre) {
		this.genre = genre;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getCbCheck() {
		return cbCheck;
	}
	public void setCbCheck(Integer cbCheck) {
		this.cbCheck = cbCheck;
	}
	public Integer getChanCnt() {
		return chanCnt;
	}
	public void setChanCnt(Integer chanCnt) {
		this.chanCnt = chanCnt;
	}
	public Integer getBanCnt() {
		return banCnt;
	}
	public void setBanCnt(Integer banCnt) {
		this.banCnt = banCnt;
	}
	public Integer getReadCnt() {
		return readCnt;
	}
	public void setReadCnt(Integer readCnt) {
		this.readCnt = readCnt;
	}
	public Integer getLiked() {
		return liked;
	}
	public void setLiked(Integer liked) {
		this.liked = liked;
	}
	public Timestamp getReg() {
		return reg;
	}
	public void setReg(Timestamp reg) {
		this.reg = reg;
	}
}
