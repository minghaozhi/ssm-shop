package com.ssm.common.pojo;

import java.io.Serializable;
import java.util.List;
/**
 * @author 墨殇
 * @description:
 * @Date : 2018/2/2.
 */
public class EasyUIDataGridResult implements Serializable{

	private long total;
	private List rows;
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List getRows() {
		return rows;
	}
	public void setRows(List rows) {
		this.rows = rows;
	}
	
}
