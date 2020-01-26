package com.hanhee.spada.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Slide implements Serializable {
    private Long slideId;

    private Long slideType;

    private Long specialId;

    private String title;

    private String ordering;

    private String appNewSlideImg;

    private String slideImg;

    private String slideUrl;

    private Long targetId;

    private Long cardId;

    private String businessType;

    private String slideImgBig;

    private static final long serialVersionUID = 1L;

    public Long getSlideId() {
        return slideId;
    }

    public void setSlideId(Long slideId) {
        this.slideId = slideId;
    }

    public Long getSlideType() {
        return slideType;
    }

    public void setSlideType(Long slideType) {
        this.slideType = slideType;
    }

    public Long getSpecialId() {
        return specialId;
    }

    public void setSpecialId(Long specialId) {
        this.specialId = specialId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOrdering() {
        return ordering;
    }

    public void setOrdering(String ordering) {
        this.ordering = ordering;
    }

    public String getAppNewSlideImg() {
        return appNewSlideImg;
    }

    public void setAppNewSlideImg(String appNewSlideImg) {
        this.appNewSlideImg = appNewSlideImg;
    }

    public String getSlideImg() {
        return slideImg;
    }

    public void setSlideImg(String slideImg) {
        this.slideImg = slideImg;
    }

    public String getSlideUrl() {
        return slideUrl;
    }

    public void setSlideUrl(String slideUrl) {
        this.slideUrl = slideUrl;
    }

    public Long getTargetId() {
        return targetId;
    }

    public void setTargetId(Long targetId) {
        this.targetId = targetId;
    }

    public Long getCardId() {
        return cardId;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getSlideImgBig() {
        return slideImgBig;
    }

    public void setSlideImgBig(String slideImgBig) {
        this.slideImgBig = slideImgBig;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", slideId=").append(slideId);
        sb.append(", slideType=").append(slideType);
        sb.append(", specialId=").append(specialId);
        sb.append(", title=").append(title);
        sb.append(", ordering=").append(ordering);
        sb.append(", appNewSlideImg=").append(appNewSlideImg);
        sb.append(", slideImg=").append(slideImg);
        sb.append(", slideUrl=").append(slideUrl);
        sb.append(", targetId=").append(targetId);
        sb.append(", cardId=").append(cardId);
        sb.append(", businessType=").append(businessType);
        sb.append(", slideImgBig=").append(slideImgBig);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}