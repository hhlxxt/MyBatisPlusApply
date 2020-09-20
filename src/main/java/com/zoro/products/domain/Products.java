package com.zoro.products.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zoro
 * @since 2020-09-20
 */
public class Products implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品信息表
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商品类别
     */
    private String category;

    private String subCategory;

    private String categorydesc;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public String getCategorydesc() {
        return categorydesc;
    }

    public void setCategorydesc(String categorydesc) {
        this.categorydesc = categorydesc;
    }

    @Override
    public String toString() {
        return "Products{" +
        "id=" + id +
        ", category=" + category +
        ", subCategory=" + subCategory +
        ", categorydesc=" + categorydesc +
        "}";
    }
}
