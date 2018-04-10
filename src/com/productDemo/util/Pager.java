package com.productDemo.util;

public class Pager {
	
	private Integer pageNo=1;
	private Integer pageSize=5;
	private Integer totalPage;
	private Integer totalCount;
	public Integer getPageNo() {
		return pageNo;
	}
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
		this.totalPage=totalCount%pageSize==0?totalCount/pageSize:totalCount/pageSize+1;
	}
}
