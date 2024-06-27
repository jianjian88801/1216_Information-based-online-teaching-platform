package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 学生成绩
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-07 11:01:23
 */
@TableName("xueshengchengji")
public class XueshengchengjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XueshengchengjiEntity() {
		
	}
	
	public XueshengchengjiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 学号
	 */
					
	private String xuehao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
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
