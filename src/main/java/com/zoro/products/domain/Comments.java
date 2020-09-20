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
public class Comments implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商品评论
     */
    private byte[] isGoodComment;

    /**
     * 商品id
     */
    private Integer productId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public byte[] getIsGoodComment() {
        return isGoodComment;
    }

    public void setIsGoodComment(byte[] isGoodComment) {
        this.isGoodComment = isGoodComment;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "Comments{" +
        "id=" + id +
        ", isGoodComment=" + isGoodComment +
        ", productId=" + productId +
        "}";
    }
}
