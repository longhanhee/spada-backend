package com.hanhee.spada.model;

import java.util.ArrayList;
import java.util.List;

public class SlideExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SlideExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSlideIdIsNull() {
            addCriterion("slide_id is null");
            return (Criteria) this;
        }

        public Criteria andSlideIdIsNotNull() {
            addCriterion("slide_id is not null");
            return (Criteria) this;
        }

        public Criteria andSlideIdEqualTo(Long value) {
            addCriterion("slide_id =", value, "slideId");
            return (Criteria) this;
        }

        public Criteria andSlideIdNotEqualTo(Long value) {
            addCriterion("slide_id <>", value, "slideId");
            return (Criteria) this;
        }

        public Criteria andSlideIdGreaterThan(Long value) {
            addCriterion("slide_id >", value, "slideId");
            return (Criteria) this;
        }

        public Criteria andSlideIdGreaterThanOrEqualTo(Long value) {
            addCriterion("slide_id >=", value, "slideId");
            return (Criteria) this;
        }

        public Criteria andSlideIdLessThan(Long value) {
            addCriterion("slide_id <", value, "slideId");
            return (Criteria) this;
        }

        public Criteria andSlideIdLessThanOrEqualTo(Long value) {
            addCriterion("slide_id <=", value, "slideId");
            return (Criteria) this;
        }

        public Criteria andSlideIdIn(List<Long> values) {
            addCriterion("slide_id in", values, "slideId");
            return (Criteria) this;
        }

        public Criteria andSlideIdNotIn(List<Long> values) {
            addCriterion("slide_id not in", values, "slideId");
            return (Criteria) this;
        }

        public Criteria andSlideIdBetween(Long value1, Long value2) {
            addCriterion("slide_id between", value1, value2, "slideId");
            return (Criteria) this;
        }

        public Criteria andSlideIdNotBetween(Long value1, Long value2) {
            addCriterion("slide_id not between", value1, value2, "slideId");
            return (Criteria) this;
        }

        public Criteria andSlideTypeIsNull() {
            addCriterion("slide_type is null");
            return (Criteria) this;
        }

        public Criteria andSlideTypeIsNotNull() {
            addCriterion("slide_type is not null");
            return (Criteria) this;
        }

        public Criteria andSlideTypeEqualTo(Long value) {
            addCriterion("slide_type =", value, "slideType");
            return (Criteria) this;
        }

        public Criteria andSlideTypeNotEqualTo(Long value) {
            addCriterion("slide_type <>", value, "slideType");
            return (Criteria) this;
        }

        public Criteria andSlideTypeGreaterThan(Long value) {
            addCriterion("slide_type >", value, "slideType");
            return (Criteria) this;
        }

        public Criteria andSlideTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("slide_type >=", value, "slideType");
            return (Criteria) this;
        }

        public Criteria andSlideTypeLessThan(Long value) {
            addCriterion("slide_type <", value, "slideType");
            return (Criteria) this;
        }

        public Criteria andSlideTypeLessThanOrEqualTo(Long value) {
            addCriterion("slide_type <=", value, "slideType");
            return (Criteria) this;
        }

        public Criteria andSlideTypeIn(List<Long> values) {
            addCriterion("slide_type in", values, "slideType");
            return (Criteria) this;
        }

        public Criteria andSlideTypeNotIn(List<Long> values) {
            addCriterion("slide_type not in", values, "slideType");
            return (Criteria) this;
        }

        public Criteria andSlideTypeBetween(Long value1, Long value2) {
            addCriterion("slide_type between", value1, value2, "slideType");
            return (Criteria) this;
        }

        public Criteria andSlideTypeNotBetween(Long value1, Long value2) {
            addCriterion("slide_type not between", value1, value2, "slideType");
            return (Criteria) this;
        }

        public Criteria andSpecialIdIsNull() {
            addCriterion("special_id is null");
            return (Criteria) this;
        }

        public Criteria andSpecialIdIsNotNull() {
            addCriterion("special_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialIdEqualTo(Long value) {
            addCriterion("special_id =", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdNotEqualTo(Long value) {
            addCriterion("special_id <>", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdGreaterThan(Long value) {
            addCriterion("special_id >", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdGreaterThanOrEqualTo(Long value) {
            addCriterion("special_id >=", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdLessThan(Long value) {
            addCriterion("special_id <", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdLessThanOrEqualTo(Long value) {
            addCriterion("special_id <=", value, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdIn(List<Long> values) {
            addCriterion("special_id in", values, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdNotIn(List<Long> values) {
            addCriterion("special_id not in", values, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdBetween(Long value1, Long value2) {
            addCriterion("special_id between", value1, value2, "specialId");
            return (Criteria) this;
        }

        public Criteria andSpecialIdNotBetween(Long value1, Long value2) {
            addCriterion("special_id not between", value1, value2, "specialId");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andOrderingIsNull() {
            addCriterion("ordering is null");
            return (Criteria) this;
        }

        public Criteria andOrderingIsNotNull() {
            addCriterion("ordering is not null");
            return (Criteria) this;
        }

        public Criteria andOrderingEqualTo(String value) {
            addCriterion("ordering =", value, "ordering");
            return (Criteria) this;
        }

        public Criteria andOrderingNotEqualTo(String value) {
            addCriterion("ordering <>", value, "ordering");
            return (Criteria) this;
        }

        public Criteria andOrderingGreaterThan(String value) {
            addCriterion("ordering >", value, "ordering");
            return (Criteria) this;
        }

        public Criteria andOrderingGreaterThanOrEqualTo(String value) {
            addCriterion("ordering >=", value, "ordering");
            return (Criteria) this;
        }

        public Criteria andOrderingLessThan(String value) {
            addCriterion("ordering <", value, "ordering");
            return (Criteria) this;
        }

        public Criteria andOrderingLessThanOrEqualTo(String value) {
            addCriterion("ordering <=", value, "ordering");
            return (Criteria) this;
        }

        public Criteria andOrderingLike(String value) {
            addCriterion("ordering like", value, "ordering");
            return (Criteria) this;
        }

        public Criteria andOrderingNotLike(String value) {
            addCriterion("ordering not like", value, "ordering");
            return (Criteria) this;
        }

        public Criteria andOrderingIn(List<String> values) {
            addCriterion("ordering in", values, "ordering");
            return (Criteria) this;
        }

        public Criteria andOrderingNotIn(List<String> values) {
            addCriterion("ordering not in", values, "ordering");
            return (Criteria) this;
        }

        public Criteria andOrderingBetween(String value1, String value2) {
            addCriterion("ordering between", value1, value2, "ordering");
            return (Criteria) this;
        }

        public Criteria andOrderingNotBetween(String value1, String value2) {
            addCriterion("ordering not between", value1, value2, "ordering");
            return (Criteria) this;
        }

        public Criteria andAppNewSlideImgIsNull() {
            addCriterion("app_new_slide_img is null");
            return (Criteria) this;
        }

        public Criteria andAppNewSlideImgIsNotNull() {
            addCriterion("app_new_slide_img is not null");
            return (Criteria) this;
        }

        public Criteria andAppNewSlideImgEqualTo(String value) {
            addCriterion("app_new_slide_img =", value, "appNewSlideImg");
            return (Criteria) this;
        }

        public Criteria andAppNewSlideImgNotEqualTo(String value) {
            addCriterion("app_new_slide_img <>", value, "appNewSlideImg");
            return (Criteria) this;
        }

        public Criteria andAppNewSlideImgGreaterThan(String value) {
            addCriterion("app_new_slide_img >", value, "appNewSlideImg");
            return (Criteria) this;
        }

        public Criteria andAppNewSlideImgGreaterThanOrEqualTo(String value) {
            addCriterion("app_new_slide_img >=", value, "appNewSlideImg");
            return (Criteria) this;
        }

        public Criteria andAppNewSlideImgLessThan(String value) {
            addCriterion("app_new_slide_img <", value, "appNewSlideImg");
            return (Criteria) this;
        }

        public Criteria andAppNewSlideImgLessThanOrEqualTo(String value) {
            addCriterion("app_new_slide_img <=", value, "appNewSlideImg");
            return (Criteria) this;
        }

        public Criteria andAppNewSlideImgLike(String value) {
            addCriterion("app_new_slide_img like", value, "appNewSlideImg");
            return (Criteria) this;
        }

        public Criteria andAppNewSlideImgNotLike(String value) {
            addCriterion("app_new_slide_img not like", value, "appNewSlideImg");
            return (Criteria) this;
        }

        public Criteria andAppNewSlideImgIn(List<String> values) {
            addCriterion("app_new_slide_img in", values, "appNewSlideImg");
            return (Criteria) this;
        }

        public Criteria andAppNewSlideImgNotIn(List<String> values) {
            addCriterion("app_new_slide_img not in", values, "appNewSlideImg");
            return (Criteria) this;
        }

        public Criteria andAppNewSlideImgBetween(String value1, String value2) {
            addCriterion("app_new_slide_img between", value1, value2, "appNewSlideImg");
            return (Criteria) this;
        }

        public Criteria andAppNewSlideImgNotBetween(String value1, String value2) {
            addCriterion("app_new_slide_img not between", value1, value2, "appNewSlideImg");
            return (Criteria) this;
        }

        public Criteria andSlideImgIsNull() {
            addCriterion("slide_img is null");
            return (Criteria) this;
        }

        public Criteria andSlideImgIsNotNull() {
            addCriterion("slide_img is not null");
            return (Criteria) this;
        }

        public Criteria andSlideImgEqualTo(String value) {
            addCriterion("slide_img =", value, "slideImg");
            return (Criteria) this;
        }

        public Criteria andSlideImgNotEqualTo(String value) {
            addCriterion("slide_img <>", value, "slideImg");
            return (Criteria) this;
        }

        public Criteria andSlideImgGreaterThan(String value) {
            addCriterion("slide_img >", value, "slideImg");
            return (Criteria) this;
        }

        public Criteria andSlideImgGreaterThanOrEqualTo(String value) {
            addCriterion("slide_img >=", value, "slideImg");
            return (Criteria) this;
        }

        public Criteria andSlideImgLessThan(String value) {
            addCriterion("slide_img <", value, "slideImg");
            return (Criteria) this;
        }

        public Criteria andSlideImgLessThanOrEqualTo(String value) {
            addCriterion("slide_img <=", value, "slideImg");
            return (Criteria) this;
        }

        public Criteria andSlideImgLike(String value) {
            addCriterion("slide_img like", value, "slideImg");
            return (Criteria) this;
        }

        public Criteria andSlideImgNotLike(String value) {
            addCriterion("slide_img not like", value, "slideImg");
            return (Criteria) this;
        }

        public Criteria andSlideImgIn(List<String> values) {
            addCriterion("slide_img in", values, "slideImg");
            return (Criteria) this;
        }

        public Criteria andSlideImgNotIn(List<String> values) {
            addCriterion("slide_img not in", values, "slideImg");
            return (Criteria) this;
        }

        public Criteria andSlideImgBetween(String value1, String value2) {
            addCriterion("slide_img between", value1, value2, "slideImg");
            return (Criteria) this;
        }

        public Criteria andSlideImgNotBetween(String value1, String value2) {
            addCriterion("slide_img not between", value1, value2, "slideImg");
            return (Criteria) this;
        }

        public Criteria andSlideUrlIsNull() {
            addCriterion("slide_url is null");
            return (Criteria) this;
        }

        public Criteria andSlideUrlIsNotNull() {
            addCriterion("slide_url is not null");
            return (Criteria) this;
        }

        public Criteria andSlideUrlEqualTo(String value) {
            addCriterion("slide_url =", value, "slideUrl");
            return (Criteria) this;
        }

        public Criteria andSlideUrlNotEqualTo(String value) {
            addCriterion("slide_url <>", value, "slideUrl");
            return (Criteria) this;
        }

        public Criteria andSlideUrlGreaterThan(String value) {
            addCriterion("slide_url >", value, "slideUrl");
            return (Criteria) this;
        }

        public Criteria andSlideUrlGreaterThanOrEqualTo(String value) {
            addCriterion("slide_url >=", value, "slideUrl");
            return (Criteria) this;
        }

        public Criteria andSlideUrlLessThan(String value) {
            addCriterion("slide_url <", value, "slideUrl");
            return (Criteria) this;
        }

        public Criteria andSlideUrlLessThanOrEqualTo(String value) {
            addCriterion("slide_url <=", value, "slideUrl");
            return (Criteria) this;
        }

        public Criteria andSlideUrlLike(String value) {
            addCriterion("slide_url like", value, "slideUrl");
            return (Criteria) this;
        }

        public Criteria andSlideUrlNotLike(String value) {
            addCriterion("slide_url not like", value, "slideUrl");
            return (Criteria) this;
        }

        public Criteria andSlideUrlIn(List<String> values) {
            addCriterion("slide_url in", values, "slideUrl");
            return (Criteria) this;
        }

        public Criteria andSlideUrlNotIn(List<String> values) {
            addCriterion("slide_url not in", values, "slideUrl");
            return (Criteria) this;
        }

        public Criteria andSlideUrlBetween(String value1, String value2) {
            addCriterion("slide_url between", value1, value2, "slideUrl");
            return (Criteria) this;
        }

        public Criteria andSlideUrlNotBetween(String value1, String value2) {
            addCriterion("slide_url not between", value1, value2, "slideUrl");
            return (Criteria) this;
        }

        public Criteria andTargetIdIsNull() {
            addCriterion("target_id is null");
            return (Criteria) this;
        }

        public Criteria andTargetIdIsNotNull() {
            addCriterion("target_id is not null");
            return (Criteria) this;
        }

        public Criteria andTargetIdEqualTo(Long value) {
            addCriterion("target_id =", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdNotEqualTo(Long value) {
            addCriterion("target_id <>", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdGreaterThan(Long value) {
            addCriterion("target_id >", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdGreaterThanOrEqualTo(Long value) {
            addCriterion("target_id >=", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdLessThan(Long value) {
            addCriterion("target_id <", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdLessThanOrEqualTo(Long value) {
            addCriterion("target_id <=", value, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdIn(List<Long> values) {
            addCriterion("target_id in", values, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdNotIn(List<Long> values) {
            addCriterion("target_id not in", values, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdBetween(Long value1, Long value2) {
            addCriterion("target_id between", value1, value2, "targetId");
            return (Criteria) this;
        }

        public Criteria andTargetIdNotBetween(Long value1, Long value2) {
            addCriterion("target_id not between", value1, value2, "targetId");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNull() {
            addCriterion("card_id is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("card_id is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(Long value) {
            addCriterion("card_id =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(Long value) {
            addCriterion("card_id <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(Long value) {
            addCriterion("card_id >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(Long value) {
            addCriterion("card_id >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(Long value) {
            addCriterion("card_id <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(Long value) {
            addCriterion("card_id <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<Long> values) {
            addCriterion("card_id in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<Long> values) {
            addCriterion("card_id not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(Long value1, Long value2) {
            addCriterion("card_id between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(Long value1, Long value2) {
            addCriterion("card_id not between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNull() {
            addCriterion("business_type is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNotNull() {
            addCriterion("business_type is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeEqualTo(String value) {
            addCriterion("business_type =", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotEqualTo(String value) {
            addCriterion("business_type <>", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThan(String value) {
            addCriterion("business_type >", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("business_type >=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThan(String value) {
            addCriterion("business_type <", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThanOrEqualTo(String value) {
            addCriterion("business_type <=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLike(String value) {
            addCriterion("business_type like", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotLike(String value) {
            addCriterion("business_type not like", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIn(List<String> values) {
            addCriterion("business_type in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotIn(List<String> values) {
            addCriterion("business_type not in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeBetween(String value1, String value2) {
            addCriterion("business_type between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotBetween(String value1, String value2) {
            addCriterion("business_type not between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andSlideImgBigIsNull() {
            addCriterion("slide_img_big is null");
            return (Criteria) this;
        }

        public Criteria andSlideImgBigIsNotNull() {
            addCriterion("slide_img_big is not null");
            return (Criteria) this;
        }

        public Criteria andSlideImgBigEqualTo(String value) {
            addCriterion("slide_img_big =", value, "slideImgBig");
            return (Criteria) this;
        }

        public Criteria andSlideImgBigNotEqualTo(String value) {
            addCriterion("slide_img_big <>", value, "slideImgBig");
            return (Criteria) this;
        }

        public Criteria andSlideImgBigGreaterThan(String value) {
            addCriterion("slide_img_big >", value, "slideImgBig");
            return (Criteria) this;
        }

        public Criteria andSlideImgBigGreaterThanOrEqualTo(String value) {
            addCriterion("slide_img_big >=", value, "slideImgBig");
            return (Criteria) this;
        }

        public Criteria andSlideImgBigLessThan(String value) {
            addCriterion("slide_img_big <", value, "slideImgBig");
            return (Criteria) this;
        }

        public Criteria andSlideImgBigLessThanOrEqualTo(String value) {
            addCriterion("slide_img_big <=", value, "slideImgBig");
            return (Criteria) this;
        }

        public Criteria andSlideImgBigLike(String value) {
            addCriterion("slide_img_big like", value, "slideImgBig");
            return (Criteria) this;
        }

        public Criteria andSlideImgBigNotLike(String value) {
            addCriterion("slide_img_big not like", value, "slideImgBig");
            return (Criteria) this;
        }

        public Criteria andSlideImgBigIn(List<String> values) {
            addCriterion("slide_img_big in", values, "slideImgBig");
            return (Criteria) this;
        }

        public Criteria andSlideImgBigNotIn(List<String> values) {
            addCriterion("slide_img_big not in", values, "slideImgBig");
            return (Criteria) this;
        }

        public Criteria andSlideImgBigBetween(String value1, String value2) {
            addCriterion("slide_img_big between", value1, value2, "slideImgBig");
            return (Criteria) this;
        }

        public Criteria andSlideImgBigNotBetween(String value1, String value2) {
            addCriterion("slide_img_big not between", value1, value2, "slideImgBig");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}