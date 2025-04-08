package com.entity.model;

import com.entity.ZuozheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 作者
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZuozheModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 账户
     */
    private String username;


    /**
     * 密码
     */
    private String password;


    /**
     * 作者姓名
     */
    private String zuozheName;


    /**
     * 作者手机号
     */
    private String zuozhePhone;


    /**
     * 作者身份证号
     */
    private String zuozheIdNumber;


    /**
     * 作者头像
     */
    private String zuozhePhoto;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 电子邮箱
     */
    private String yonghuEmail;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 设置：账户
	 */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 设置：密码
	 */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：作者姓名
	 */
    public String getZuozheName() {
        return zuozheName;
    }


    /**
	 * 设置：作者姓名
	 */
    public void setZuozheName(String zuozheName) {
        this.zuozheName = zuozheName;
    }
    /**
	 * 获取：作者手机号
	 */
    public String getZuozhePhone() {
        return zuozhePhone;
    }


    /**
	 * 设置：作者手机号
	 */
    public void setZuozhePhone(String zuozhePhone) {
        this.zuozhePhone = zuozhePhone;
    }
    /**
	 * 获取：作者身份证号
	 */
    public String getZuozheIdNumber() {
        return zuozheIdNumber;
    }


    /**
	 * 设置：作者身份证号
	 */
    public void setZuozheIdNumber(String zuozheIdNumber) {
        this.zuozheIdNumber = zuozheIdNumber;
    }
    /**
	 * 获取：作者头像
	 */
    public String getZuozhePhoto() {
        return zuozhePhoto;
    }


    /**
	 * 设置：作者头像
	 */
    public void setZuozhePhoto(String zuozhePhoto) {
        this.zuozhePhoto = zuozhePhoto;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：电子邮箱
	 */
    public String getYonghuEmail() {
        return yonghuEmail;
    }


    /**
	 * 设置：电子邮箱
	 */
    public void setYonghuEmail(String yonghuEmail) {
        this.yonghuEmail = yonghuEmail;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
