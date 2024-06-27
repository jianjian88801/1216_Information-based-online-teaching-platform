package com.entity.vo;

import com.entity.XueshengchengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 学生成绩
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-07 11:01:23
 */
public class XueshengchengjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 科目1成绩
	 */
	
	private Integer kemu1chengji;
		
	/**
	 * 科目2成绩
	 */
	
	private Integer kemu2chengji;
		
	/**
	 * 科目3成绩
	 */
	
	private Integer kemu3chengji;
		
	/**
	 * 科目4成绩
	 */
	
	private Integer kemu4chengji;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：科目1成绩
	 */
	 
	public void setKemu1chengji(Integer kemu1chengji) {
		this.kemu1chengji = kemu1chengji;
	}
	
	/**
	 * 获取：科目1成绩
	 */
	public Integer getKemu1chengji() {
		return kemu1chengji;
	}
				
	
	/**
	 * 设置：科目2成绩
	 */
	 
	public void setKemu2chengji(Integer kemu2chengji) {
		this.kemu2chengji = kemu2chengji;
	}
	
	/**
	 * 获取：科目2成绩
	 */
	public Integer getKemu2chengji() {
		return kemu2chengji;
	}
				
	
	/**
	 * 设置：科目3成绩
	 */
	 
	public void setKemu3chengji(Integer kemu3chengji) {
		this.kemu3chengji = kemu3chengji;
	}
	
	/**
	 * 获取：科目3成绩
	 */
	public Integer getKemu3chengji() {
		return kemu3chengji;
	}
				
	
	/**
	 * 设置：科目4成绩
	 */
	 
	public void setKemu4chengji(Integer kemu4chengji) {
		this.kemu4chengji = kemu4chengji;
	}
	
	/**
	 * 获取：科目4成绩
	 */
	public Integer getKemu4chengji() {
		return kemu4chengji;
	}
			
}
