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
 * 教学信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-07 11:01:23
 */
@TableName("jiaoxuexinxi")
public class JiaoxuexinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaoxuexinxiEntity() {
		
	}
	
	public JiaoxuexinxiEntity(T t) {
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
	 * 课程号
	 */
					
	private String kechenghao;
	
	/**
	 * 课程名
	 */
					
	private String kechengming;
	
	/**
	 * 课程详情
	 */
					
	private String kechengxiangqing;
	
	/**
	 * 课程时长
	 */
					
	private Integer kechengshizhang;
	
	/**
	 * 教师姓名
	 */
					
	private String jiaoshixingming;
	
	/**
	 * 照片
	 */
					
	private String zhaopian;
	
	
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
	 * 设置：课程号
	 */
	public void setKechenghao(String kechenghao) {
		this.kechenghao = kechenghao;
	}
	/**
	 * 获取：课程号
	 */
	public String getKechenghao() {
		return kechenghao;
	}
	/**
	 * 设置：课程名
	 */
	public void setKechengming(String kechengming) {
		this.kechengming = kechengming;
	}
	/**
	 * 获取：课程名
	 */
	public String getKechengming() {
		return kechengming;
	}
	/**
	 * 设置：课程详情
	 */
	public void setKechengxiangqing(String kechengxiangqing) {
		this.kechengxiangqing = kechengxiangqing;
	}
	/**
	 * 获取：课程详情
	 */
	public String getKechengxiangqing() {
		return kechengxiangqing;
	}
	/**
	 * 设置：课程时长
	 */
	public void setKechengshizhang(Integer kechengshizhang) {
		this.kechengshizhang = kechengshizhang;
	}
	/**
	 * 获取：课程时长
	 */
	public Integer getKechengshizhang() {
		return kechengshizhang;
	}
	/**
	 * 设置：教师姓名
	 */
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
	/**
	 * 设置：照片
	 */
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}

}
