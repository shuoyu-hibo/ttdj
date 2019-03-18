package com.mybatis.entity.ttdj;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProduceInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProduceInfoExample() {
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

        public Criteria andProduceIdIsNull() {
            addCriterion("PRODUCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andProduceIdIsNotNull() {
            addCriterion("PRODUCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProduceIdEqualTo(Integer value) {
            addCriterion("PRODUCE_ID =", value, "produceId");
            return (Criteria) this;
        }

        public Criteria andProduceIdNotEqualTo(Integer value) {
            addCriterion("PRODUCE_ID <>", value, "produceId");
            return (Criteria) this;
        }

        public Criteria andProduceIdGreaterThan(Integer value) {
            addCriterion("PRODUCE_ID >", value, "produceId");
            return (Criteria) this;
        }

        public Criteria andProduceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRODUCE_ID >=", value, "produceId");
            return (Criteria) this;
        }

        public Criteria andProduceIdLessThan(Integer value) {
            addCriterion("PRODUCE_ID <", value, "produceId");
            return (Criteria) this;
        }

        public Criteria andProduceIdLessThanOrEqualTo(Integer value) {
            addCriterion("PRODUCE_ID <=", value, "produceId");
            return (Criteria) this;
        }

        public Criteria andProduceIdIn(List<Integer> values) {
            addCriterion("PRODUCE_ID in", values, "produceId");
            return (Criteria) this;
        }

        public Criteria andProduceIdNotIn(List<Integer> values) {
            addCriterion("PRODUCE_ID not in", values, "produceId");
            return (Criteria) this;
        }

        public Criteria andProduceIdBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCE_ID between", value1, value2, "produceId");
            return (Criteria) this;
        }

        public Criteria andProduceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCE_ID not between", value1, value2, "produceId");
            return (Criteria) this;
        }

        public Criteria andProduceNameIsNull() {
            addCriterion("PRODUCE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProduceNameIsNotNull() {
            addCriterion("PRODUCE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProduceNameEqualTo(String value) {
            addCriterion("PRODUCE_NAME =", value, "produceName");
            return (Criteria) this;
        }

        public Criteria andProduceNameNotEqualTo(String value) {
            addCriterion("PRODUCE_NAME <>", value, "produceName");
            return (Criteria) this;
        }

        public Criteria andProduceNameGreaterThan(String value) {
            addCriterion("PRODUCE_NAME >", value, "produceName");
            return (Criteria) this;
        }

        public Criteria andProduceNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCE_NAME >=", value, "produceName");
            return (Criteria) this;
        }

        public Criteria andProduceNameLessThan(String value) {
            addCriterion("PRODUCE_NAME <", value, "produceName");
            return (Criteria) this;
        }

        public Criteria andProduceNameLessThanOrEqualTo(String value) {
            addCriterion("PRODUCE_NAME <=", value, "produceName");
            return (Criteria) this;
        }

        public Criteria andProduceNameLike(String value) {
            addCriterion("PRODUCE_NAME like", value, "produceName");
            return (Criteria) this;
        }

        public Criteria andProduceNameNotLike(String value) {
            addCriterion("PRODUCE_NAME not like", value, "produceName");
            return (Criteria) this;
        }

        public Criteria andProduceNameIn(List<String> values) {
            addCriterion("PRODUCE_NAME in", values, "produceName");
            return (Criteria) this;
        }

        public Criteria andProduceNameNotIn(List<String> values) {
            addCriterion("PRODUCE_NAME not in", values, "produceName");
            return (Criteria) this;
        }

        public Criteria andProduceNameBetween(String value1, String value2) {
            addCriterion("PRODUCE_NAME between", value1, value2, "produceName");
            return (Criteria) this;
        }

        public Criteria andProduceNameNotBetween(String value1, String value2) {
            addCriterion("PRODUCE_NAME not between", value1, value2, "produceName");
            return (Criteria) this;
        }

        public Criteria andProduceDescIsNull() {
            addCriterion("PRODUCE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andProduceDescIsNotNull() {
            addCriterion("PRODUCE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andProduceDescEqualTo(String value) {
            addCriterion("PRODUCE_DESC =", value, "produceDesc");
            return (Criteria) this;
        }

        public Criteria andProduceDescNotEqualTo(String value) {
            addCriterion("PRODUCE_DESC <>", value, "produceDesc");
            return (Criteria) this;
        }

        public Criteria andProduceDescGreaterThan(String value) {
            addCriterion("PRODUCE_DESC >", value, "produceDesc");
            return (Criteria) this;
        }

        public Criteria andProduceDescGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCE_DESC >=", value, "produceDesc");
            return (Criteria) this;
        }

        public Criteria andProduceDescLessThan(String value) {
            addCriterion("PRODUCE_DESC <", value, "produceDesc");
            return (Criteria) this;
        }

        public Criteria andProduceDescLessThanOrEqualTo(String value) {
            addCriterion("PRODUCE_DESC <=", value, "produceDesc");
            return (Criteria) this;
        }

        public Criteria andProduceDescLike(String value) {
            addCriterion("PRODUCE_DESC like", value, "produceDesc");
            return (Criteria) this;
        }

        public Criteria andProduceDescNotLike(String value) {
            addCriterion("PRODUCE_DESC not like", value, "produceDesc");
            return (Criteria) this;
        }

        public Criteria andProduceDescIn(List<String> values) {
            addCriterion("PRODUCE_DESC in", values, "produceDesc");
            return (Criteria) this;
        }

        public Criteria andProduceDescNotIn(List<String> values) {
            addCriterion("PRODUCE_DESC not in", values, "produceDesc");
            return (Criteria) this;
        }

        public Criteria andProduceDescBetween(String value1, String value2) {
            addCriterion("PRODUCE_DESC between", value1, value2, "produceDesc");
            return (Criteria) this;
        }

        public Criteria andProduceDescNotBetween(String value1, String value2) {
            addCriterion("PRODUCE_DESC not between", value1, value2, "produceDesc");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andProducePicIsNull() {
            addCriterion("PRODUCE_PIC is null");
            return (Criteria) this;
        }

        public Criteria andProducePicIsNotNull() {
            addCriterion("PRODUCE_PIC is not null");
            return (Criteria) this;
        }

        public Criteria andProducePicEqualTo(String value) {
            addCriterion("PRODUCE_PIC =", value, "producePic");
            return (Criteria) this;
        }

        public Criteria andProducePicNotEqualTo(String value) {
            addCriterion("PRODUCE_PIC <>", value, "producePic");
            return (Criteria) this;
        }

        public Criteria andProducePicGreaterThan(String value) {
            addCriterion("PRODUCE_PIC >", value, "producePic");
            return (Criteria) this;
        }

        public Criteria andProducePicGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCE_PIC >=", value, "producePic");
            return (Criteria) this;
        }

        public Criteria andProducePicLessThan(String value) {
            addCriterion("PRODUCE_PIC <", value, "producePic");
            return (Criteria) this;
        }

        public Criteria andProducePicLessThanOrEqualTo(String value) {
            addCriterion("PRODUCE_PIC <=", value, "producePic");
            return (Criteria) this;
        }

        public Criteria andProducePicLike(String value) {
            addCriterion("PRODUCE_PIC like", value, "producePic");
            return (Criteria) this;
        }

        public Criteria andProducePicNotLike(String value) {
            addCriterion("PRODUCE_PIC not like", value, "producePic");
            return (Criteria) this;
        }

        public Criteria andProducePicIn(List<String> values) {
            addCriterion("PRODUCE_PIC in", values, "producePic");
            return (Criteria) this;
        }

        public Criteria andProducePicNotIn(List<String> values) {
            addCriterion("PRODUCE_PIC not in", values, "producePic");
            return (Criteria) this;
        }

        public Criteria andProducePicBetween(String value1, String value2) {
            addCriterion("PRODUCE_PIC between", value1, value2, "producePic");
            return (Criteria) this;
        }

        public Criteria andProducePicNotBetween(String value1, String value2) {
            addCriterion("PRODUCE_PIC not between", value1, value2, "producePic");
            return (Criteria) this;
        }

        public Criteria andProducePriceIsNull() {
            addCriterion("PRODUCE_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andProducePriceIsNotNull() {
            addCriterion("PRODUCE_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andProducePriceEqualTo(BigDecimal value) {
            addCriterion("PRODUCE_PRICE =", value, "producePrice");
            return (Criteria) this;
        }

        public Criteria andProducePriceNotEqualTo(BigDecimal value) {
            addCriterion("PRODUCE_PRICE <>", value, "producePrice");
            return (Criteria) this;
        }

        public Criteria andProducePriceGreaterThan(BigDecimal value) {
            addCriterion("PRODUCE_PRICE >", value, "producePrice");
            return (Criteria) this;
        }

        public Criteria andProducePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCE_PRICE >=", value, "producePrice");
            return (Criteria) this;
        }

        public Criteria andProducePriceLessThan(BigDecimal value) {
            addCriterion("PRODUCE_PRICE <", value, "producePrice");
            return (Criteria) this;
        }

        public Criteria andProducePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCE_PRICE <=", value, "producePrice");
            return (Criteria) this;
        }

        public Criteria andProducePriceIn(List<BigDecimal> values) {
            addCriterion("PRODUCE_PRICE in", values, "producePrice");
            return (Criteria) this;
        }

        public Criteria andProducePriceNotIn(List<BigDecimal> values) {
            addCriterion("PRODUCE_PRICE not in", values, "producePrice");
            return (Criteria) this;
        }

        public Criteria andProducePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCE_PRICE between", value1, value2, "producePrice");
            return (Criteria) this;
        }

        public Criteria andProducePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCE_PRICE not between", value1, value2, "producePrice");
            return (Criteria) this;
        }

        public Criteria andRemitPriceIsNull() {
            addCriterion("REMIT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andRemitPriceIsNotNull() {
            addCriterion("REMIT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andRemitPriceEqualTo(BigDecimal value) {
            addCriterion("REMIT_PRICE =", value, "remitPrice");
            return (Criteria) this;
        }

        public Criteria andRemitPriceNotEqualTo(BigDecimal value) {
            addCriterion("REMIT_PRICE <>", value, "remitPrice");
            return (Criteria) this;
        }

        public Criteria andRemitPriceGreaterThan(BigDecimal value) {
            addCriterion("REMIT_PRICE >", value, "remitPrice");
            return (Criteria) this;
        }

        public Criteria andRemitPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REMIT_PRICE >=", value, "remitPrice");
            return (Criteria) this;
        }

        public Criteria andRemitPriceLessThan(BigDecimal value) {
            addCriterion("REMIT_PRICE <", value, "remitPrice");
            return (Criteria) this;
        }

        public Criteria andRemitPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REMIT_PRICE <=", value, "remitPrice");
            return (Criteria) this;
        }

        public Criteria andRemitPriceIn(List<BigDecimal> values) {
            addCriterion("REMIT_PRICE in", values, "remitPrice");
            return (Criteria) this;
        }

        public Criteria andRemitPriceNotIn(List<BigDecimal> values) {
            addCriterion("REMIT_PRICE not in", values, "remitPrice");
            return (Criteria) this;
        }

        public Criteria andRemitPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REMIT_PRICE between", value1, value2, "remitPrice");
            return (Criteria) this;
        }

        public Criteria andRemitPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REMIT_PRICE not between", value1, value2, "remitPrice");
            return (Criteria) this;
        }

        public Criteria andFinalPriceIsNull() {
            addCriterion("FINAL_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andFinalPriceIsNotNull() {
            addCriterion("FINAL_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andFinalPriceEqualTo(BigDecimal value) {
            addCriterion("FINAL_PRICE =", value, "finalPrice");
            return (Criteria) this;
        }

        public Criteria andFinalPriceNotEqualTo(BigDecimal value) {
            addCriterion("FINAL_PRICE <>", value, "finalPrice");
            return (Criteria) this;
        }

        public Criteria andFinalPriceGreaterThan(BigDecimal value) {
            addCriterion("FINAL_PRICE >", value, "finalPrice");
            return (Criteria) this;
        }

        public Criteria andFinalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FINAL_PRICE >=", value, "finalPrice");
            return (Criteria) this;
        }

        public Criteria andFinalPriceLessThan(BigDecimal value) {
            addCriterion("FINAL_PRICE <", value, "finalPrice");
            return (Criteria) this;
        }

        public Criteria andFinalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FINAL_PRICE <=", value, "finalPrice");
            return (Criteria) this;
        }

        public Criteria andFinalPriceIn(List<BigDecimal> values) {
            addCriterion("FINAL_PRICE in", values, "finalPrice");
            return (Criteria) this;
        }

        public Criteria andFinalPriceNotIn(List<BigDecimal> values) {
            addCriterion("FINAL_PRICE not in", values, "finalPrice");
            return (Criteria) this;
        }

        public Criteria andFinalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FINAL_PRICE between", value1, value2, "finalPrice");
            return (Criteria) this;
        }

        public Criteria andFinalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FINAL_PRICE not between", value1, value2, "finalPrice");
            return (Criteria) this;
        }

        public Criteria andProduceCountIsNull() {
            addCriterion("PRODUCE_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andProduceCountIsNotNull() {
            addCriterion("PRODUCE_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andProduceCountEqualTo(Integer value) {
            addCriterion("PRODUCE_COUNT =", value, "produceCount");
            return (Criteria) this;
        }

        public Criteria andProduceCountNotEqualTo(Integer value) {
            addCriterion("PRODUCE_COUNT <>", value, "produceCount");
            return (Criteria) this;
        }

        public Criteria andProduceCountGreaterThan(Integer value) {
            addCriterion("PRODUCE_COUNT >", value, "produceCount");
            return (Criteria) this;
        }

        public Criteria andProduceCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRODUCE_COUNT >=", value, "produceCount");
            return (Criteria) this;
        }

        public Criteria andProduceCountLessThan(Integer value) {
            addCriterion("PRODUCE_COUNT <", value, "produceCount");
            return (Criteria) this;
        }

        public Criteria andProduceCountLessThanOrEqualTo(Integer value) {
            addCriterion("PRODUCE_COUNT <=", value, "produceCount");
            return (Criteria) this;
        }

        public Criteria andProduceCountIn(List<Integer> values) {
            addCriterion("PRODUCE_COUNT in", values, "produceCount");
            return (Criteria) this;
        }

        public Criteria andProduceCountNotIn(List<Integer> values) {
            addCriterion("PRODUCE_COUNT not in", values, "produceCount");
            return (Criteria) this;
        }

        public Criteria andProduceCountBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCE_COUNT between", value1, value2, "produceCount");
            return (Criteria) this;
        }

        public Criteria andProduceCountNotBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCE_COUNT not between", value1, value2, "produceCount");
            return (Criteria) this;
        }

        public Criteria andProduceBuyCountIsNull() {
            addCriterion("PRODUCE_BUY_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andProduceBuyCountIsNotNull() {
            addCriterion("PRODUCE_BUY_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andProduceBuyCountEqualTo(Integer value) {
            addCriterion("PRODUCE_BUY_COUNT =", value, "produceBuyCount");
            return (Criteria) this;
        }

        public Criteria andProduceBuyCountNotEqualTo(Integer value) {
            addCriterion("PRODUCE_BUY_COUNT <>", value, "produceBuyCount");
            return (Criteria) this;
        }

        public Criteria andProduceBuyCountGreaterThan(Integer value) {
            addCriterion("PRODUCE_BUY_COUNT >", value, "produceBuyCount");
            return (Criteria) this;
        }

        public Criteria andProduceBuyCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRODUCE_BUY_COUNT >=", value, "produceBuyCount");
            return (Criteria) this;
        }

        public Criteria andProduceBuyCountLessThan(Integer value) {
            addCriterion("PRODUCE_BUY_COUNT <", value, "produceBuyCount");
            return (Criteria) this;
        }

        public Criteria andProduceBuyCountLessThanOrEqualTo(Integer value) {
            addCriterion("PRODUCE_BUY_COUNT <=", value, "produceBuyCount");
            return (Criteria) this;
        }

        public Criteria andProduceBuyCountIn(List<Integer> values) {
            addCriterion("PRODUCE_BUY_COUNT in", values, "produceBuyCount");
            return (Criteria) this;
        }

        public Criteria andProduceBuyCountNotIn(List<Integer> values) {
            addCriterion("PRODUCE_BUY_COUNT not in", values, "produceBuyCount");
            return (Criteria) this;
        }

        public Criteria andProduceBuyCountBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCE_BUY_COUNT between", value1, value2, "produceBuyCount");
            return (Criteria) this;
        }

        public Criteria andProduceBuyCountNotBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCE_BUY_COUNT not between", value1, value2, "produceBuyCount");
            return (Criteria) this;
        }

        public Criteria andFavoriteCountIsNull() {
            addCriterion("FAVORITE_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andFavoriteCountIsNotNull() {
            addCriterion("FAVORITE_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andFavoriteCountEqualTo(Integer value) {
            addCriterion("FAVORITE_COUNT =", value, "favoriteCount");
            return (Criteria) this;
        }

        public Criteria andFavoriteCountNotEqualTo(Integer value) {
            addCriterion("FAVORITE_COUNT <>", value, "favoriteCount");
            return (Criteria) this;
        }

        public Criteria andFavoriteCountGreaterThan(Integer value) {
            addCriterion("FAVORITE_COUNT >", value, "favoriteCount");
            return (Criteria) this;
        }

        public Criteria andFavoriteCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("FAVORITE_COUNT >=", value, "favoriteCount");
            return (Criteria) this;
        }

        public Criteria andFavoriteCountLessThan(Integer value) {
            addCriterion("FAVORITE_COUNT <", value, "favoriteCount");
            return (Criteria) this;
        }

        public Criteria andFavoriteCountLessThanOrEqualTo(Integer value) {
            addCriterion("FAVORITE_COUNT <=", value, "favoriteCount");
            return (Criteria) this;
        }

        public Criteria andFavoriteCountIn(List<Integer> values) {
            addCriterion("FAVORITE_COUNT in", values, "favoriteCount");
            return (Criteria) this;
        }

        public Criteria andFavoriteCountNotIn(List<Integer> values) {
            addCriterion("FAVORITE_COUNT not in", values, "favoriteCount");
            return (Criteria) this;
        }

        public Criteria andFavoriteCountBetween(Integer value1, Integer value2) {
            addCriterion("FAVORITE_COUNT between", value1, value2, "favoriteCount");
            return (Criteria) this;
        }

        public Criteria andFavoriteCountNotBetween(Integer value1, Integer value2) {
            addCriterion("FAVORITE_COUNT not between", value1, value2, "favoriteCount");
            return (Criteria) this;
        }

        public Criteria andProSort1NameIsNull() {
            addCriterion("PRO_SORT1_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProSort1NameIsNotNull() {
            addCriterion("PRO_SORT1_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProSort1NameEqualTo(String value) {
            addCriterion("PRO_SORT1_NAME =", value, "proSort1Name");
            return (Criteria) this;
        }

        public Criteria andProSort1NameNotEqualTo(String value) {
            addCriterion("PRO_SORT1_NAME <>", value, "proSort1Name");
            return (Criteria) this;
        }

        public Criteria andProSort1NameGreaterThan(String value) {
            addCriterion("PRO_SORT1_NAME >", value, "proSort1Name");
            return (Criteria) this;
        }

        public Criteria andProSort1NameGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_SORT1_NAME >=", value, "proSort1Name");
            return (Criteria) this;
        }

        public Criteria andProSort1NameLessThan(String value) {
            addCriterion("PRO_SORT1_NAME <", value, "proSort1Name");
            return (Criteria) this;
        }

        public Criteria andProSort1NameLessThanOrEqualTo(String value) {
            addCriterion("PRO_SORT1_NAME <=", value, "proSort1Name");
            return (Criteria) this;
        }

        public Criteria andProSort1NameLike(String value) {
            addCriterion("PRO_SORT1_NAME like", value, "proSort1Name");
            return (Criteria) this;
        }

        public Criteria andProSort1NameNotLike(String value) {
            addCriterion("PRO_SORT1_NAME not like", value, "proSort1Name");
            return (Criteria) this;
        }

        public Criteria andProSort1NameIn(List<String> values) {
            addCriterion("PRO_SORT1_NAME in", values, "proSort1Name");
            return (Criteria) this;
        }

        public Criteria andProSort1NameNotIn(List<String> values) {
            addCriterion("PRO_SORT1_NAME not in", values, "proSort1Name");
            return (Criteria) this;
        }

        public Criteria andProSort1NameBetween(String value1, String value2) {
            addCriterion("PRO_SORT1_NAME between", value1, value2, "proSort1Name");
            return (Criteria) this;
        }

        public Criteria andProSort1NameNotBetween(String value1, String value2) {
            addCriterion("PRO_SORT1_NAME not between", value1, value2, "proSort1Name");
            return (Criteria) this;
        }

        public Criteria andProSort1CodeIsNull() {
            addCriterion("PRO_SORT1_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProSort1CodeIsNotNull() {
            addCriterion("PRO_SORT1_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProSort1CodeEqualTo(Integer value) {
            addCriterion("PRO_SORT1_CODE =", value, "proSort1Code");
            return (Criteria) this;
        }

        public Criteria andProSort1CodeNotEqualTo(Integer value) {
            addCriterion("PRO_SORT1_CODE <>", value, "proSort1Code");
            return (Criteria) this;
        }

        public Criteria andProSort1CodeGreaterThan(Integer value) {
            addCriterion("PRO_SORT1_CODE >", value, "proSort1Code");
            return (Criteria) this;
        }

        public Criteria andProSort1CodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRO_SORT1_CODE >=", value, "proSort1Code");
            return (Criteria) this;
        }

        public Criteria andProSort1CodeLessThan(Integer value) {
            addCriterion("PRO_SORT1_CODE <", value, "proSort1Code");
            return (Criteria) this;
        }

        public Criteria andProSort1CodeLessThanOrEqualTo(Integer value) {
            addCriterion("PRO_SORT1_CODE <=", value, "proSort1Code");
            return (Criteria) this;
        }

        public Criteria andProSort1CodeIn(List<Integer> values) {
            addCriterion("PRO_SORT1_CODE in", values, "proSort1Code");
            return (Criteria) this;
        }

        public Criteria andProSort1CodeNotIn(List<Integer> values) {
            addCriterion("PRO_SORT1_CODE not in", values, "proSort1Code");
            return (Criteria) this;
        }

        public Criteria andProSort1CodeBetween(Integer value1, Integer value2) {
            addCriterion("PRO_SORT1_CODE between", value1, value2, "proSort1Code");
            return (Criteria) this;
        }

        public Criteria andProSort1CodeNotBetween(Integer value1, Integer value2) {
            addCriterion("PRO_SORT1_CODE not between", value1, value2, "proSort1Code");
            return (Criteria) this;
        }

        public Criteria andProSort2NameIsNull() {
            addCriterion("PRO_SORT2_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProSort2NameIsNotNull() {
            addCriterion("PRO_SORT2_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProSort2NameEqualTo(String value) {
            addCriterion("PRO_SORT2_NAME =", value, "proSort2Name");
            return (Criteria) this;
        }

        public Criteria andProSort2NameNotEqualTo(String value) {
            addCriterion("PRO_SORT2_NAME <>", value, "proSort2Name");
            return (Criteria) this;
        }

        public Criteria andProSort2NameGreaterThan(String value) {
            addCriterion("PRO_SORT2_NAME >", value, "proSort2Name");
            return (Criteria) this;
        }

        public Criteria andProSort2NameGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_SORT2_NAME >=", value, "proSort2Name");
            return (Criteria) this;
        }

        public Criteria andProSort2NameLessThan(String value) {
            addCriterion("PRO_SORT2_NAME <", value, "proSort2Name");
            return (Criteria) this;
        }

        public Criteria andProSort2NameLessThanOrEqualTo(String value) {
            addCriterion("PRO_SORT2_NAME <=", value, "proSort2Name");
            return (Criteria) this;
        }

        public Criteria andProSort2NameLike(String value) {
            addCriterion("PRO_SORT2_NAME like", value, "proSort2Name");
            return (Criteria) this;
        }

        public Criteria andProSort2NameNotLike(String value) {
            addCriterion("PRO_SORT2_NAME not like", value, "proSort2Name");
            return (Criteria) this;
        }

        public Criteria andProSort2NameIn(List<String> values) {
            addCriterion("PRO_SORT2_NAME in", values, "proSort2Name");
            return (Criteria) this;
        }

        public Criteria andProSort2NameNotIn(List<String> values) {
            addCriterion("PRO_SORT2_NAME not in", values, "proSort2Name");
            return (Criteria) this;
        }

        public Criteria andProSort2NameBetween(String value1, String value2) {
            addCriterion("PRO_SORT2_NAME between", value1, value2, "proSort2Name");
            return (Criteria) this;
        }

        public Criteria andProSort2NameNotBetween(String value1, String value2) {
            addCriterion("PRO_SORT2_NAME not between", value1, value2, "proSort2Name");
            return (Criteria) this;
        }

        public Criteria andProSort2CodeIsNull() {
            addCriterion("PRO_SORT2_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProSort2CodeIsNotNull() {
            addCriterion("PRO_SORT2_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProSort2CodeEqualTo(Integer value) {
            addCriterion("PRO_SORT2_CODE =", value, "proSort2Code");
            return (Criteria) this;
        }

        public Criteria andProSort2CodeNotEqualTo(Integer value) {
            addCriterion("PRO_SORT2_CODE <>", value, "proSort2Code");
            return (Criteria) this;
        }

        public Criteria andProSort2CodeGreaterThan(Integer value) {
            addCriterion("PRO_SORT2_CODE >", value, "proSort2Code");
            return (Criteria) this;
        }

        public Criteria andProSort2CodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRO_SORT2_CODE >=", value, "proSort2Code");
            return (Criteria) this;
        }

        public Criteria andProSort2CodeLessThan(Integer value) {
            addCriterion("PRO_SORT2_CODE <", value, "proSort2Code");
            return (Criteria) this;
        }

        public Criteria andProSort2CodeLessThanOrEqualTo(Integer value) {
            addCriterion("PRO_SORT2_CODE <=", value, "proSort2Code");
            return (Criteria) this;
        }

        public Criteria andProSort2CodeIn(List<Integer> values) {
            addCriterion("PRO_SORT2_CODE in", values, "proSort2Code");
            return (Criteria) this;
        }

        public Criteria andProSort2CodeNotIn(List<Integer> values) {
            addCriterion("PRO_SORT2_CODE not in", values, "proSort2Code");
            return (Criteria) this;
        }

        public Criteria andProSort2CodeBetween(Integer value1, Integer value2) {
            addCriterion("PRO_SORT2_CODE between", value1, value2, "proSort2Code");
            return (Criteria) this;
        }

        public Criteria andProSort2CodeNotBetween(Integer value1, Integer value2) {
            addCriterion("PRO_SORT2_CODE not between", value1, value2, "proSort2Code");
            return (Criteria) this;
        }

        public Criteria andProSort3NameIsNull() {
            addCriterion("PRO_SORT3_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProSort3NameIsNotNull() {
            addCriterion("PRO_SORT3_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProSort3NameEqualTo(String value) {
            addCriterion("PRO_SORT3_NAME =", value, "proSort3Name");
            return (Criteria) this;
        }

        public Criteria andProSort3NameNotEqualTo(String value) {
            addCriterion("PRO_SORT3_NAME <>", value, "proSort3Name");
            return (Criteria) this;
        }

        public Criteria andProSort3NameGreaterThan(String value) {
            addCriterion("PRO_SORT3_NAME >", value, "proSort3Name");
            return (Criteria) this;
        }

        public Criteria andProSort3NameGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_SORT3_NAME >=", value, "proSort3Name");
            return (Criteria) this;
        }

        public Criteria andProSort3NameLessThan(String value) {
            addCriterion("PRO_SORT3_NAME <", value, "proSort3Name");
            return (Criteria) this;
        }

        public Criteria andProSort3NameLessThanOrEqualTo(String value) {
            addCriterion("PRO_SORT3_NAME <=", value, "proSort3Name");
            return (Criteria) this;
        }

        public Criteria andProSort3NameLike(String value) {
            addCriterion("PRO_SORT3_NAME like", value, "proSort3Name");
            return (Criteria) this;
        }

        public Criteria andProSort3NameNotLike(String value) {
            addCriterion("PRO_SORT3_NAME not like", value, "proSort3Name");
            return (Criteria) this;
        }

        public Criteria andProSort3NameIn(List<String> values) {
            addCriterion("PRO_SORT3_NAME in", values, "proSort3Name");
            return (Criteria) this;
        }

        public Criteria andProSort3NameNotIn(List<String> values) {
            addCriterion("PRO_SORT3_NAME not in", values, "proSort3Name");
            return (Criteria) this;
        }

        public Criteria andProSort3NameBetween(String value1, String value2) {
            addCriterion("PRO_SORT3_NAME between", value1, value2, "proSort3Name");
            return (Criteria) this;
        }

        public Criteria andProSort3NameNotBetween(String value1, String value2) {
            addCriterion("PRO_SORT3_NAME not between", value1, value2, "proSort3Name");
            return (Criteria) this;
        }

        public Criteria andProSort3CodeIsNull() {
            addCriterion("PRO_SORT3_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProSort3CodeIsNotNull() {
            addCriterion("PRO_SORT3_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProSort3CodeEqualTo(Integer value) {
            addCriterion("PRO_SORT3_CODE =", value, "proSort3Code");
            return (Criteria) this;
        }

        public Criteria andProSort3CodeNotEqualTo(Integer value) {
            addCriterion("PRO_SORT3_CODE <>", value, "proSort3Code");
            return (Criteria) this;
        }

        public Criteria andProSort3CodeGreaterThan(Integer value) {
            addCriterion("PRO_SORT3_CODE >", value, "proSort3Code");
            return (Criteria) this;
        }

        public Criteria andProSort3CodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRO_SORT3_CODE >=", value, "proSort3Code");
            return (Criteria) this;
        }

        public Criteria andProSort3CodeLessThan(Integer value) {
            addCriterion("PRO_SORT3_CODE <", value, "proSort3Code");
            return (Criteria) this;
        }

        public Criteria andProSort3CodeLessThanOrEqualTo(Integer value) {
            addCriterion("PRO_SORT3_CODE <=", value, "proSort3Code");
            return (Criteria) this;
        }

        public Criteria andProSort3CodeIn(List<Integer> values) {
            addCriterion("PRO_SORT3_CODE in", values, "proSort3Code");
            return (Criteria) this;
        }

        public Criteria andProSort3CodeNotIn(List<Integer> values) {
            addCriterion("PRO_SORT3_CODE not in", values, "proSort3Code");
            return (Criteria) this;
        }

        public Criteria andProSort3CodeBetween(Integer value1, Integer value2) {
            addCriterion("PRO_SORT3_CODE between", value1, value2, "proSort3Code");
            return (Criteria) this;
        }

        public Criteria andProSort3CodeNotBetween(Integer value1, Integer value2) {
            addCriterion("PRO_SORT3_CODE not between", value1, value2, "proSort3Code");
            return (Criteria) this;
        }

        public Criteria andIfPopularIsNull() {
            addCriterion("IF_POPULAR is null");
            return (Criteria) this;
        }

        public Criteria andIfPopularIsNotNull() {
            addCriterion("IF_POPULAR is not null");
            return (Criteria) this;
        }

        public Criteria andIfPopularEqualTo(String value) {
            addCriterion("IF_POPULAR =", value, "ifPopular");
            return (Criteria) this;
        }

        public Criteria andIfPopularNotEqualTo(String value) {
            addCriterion("IF_POPULAR <>", value, "ifPopular");
            return (Criteria) this;
        }

        public Criteria andIfPopularGreaterThan(String value) {
            addCriterion("IF_POPULAR >", value, "ifPopular");
            return (Criteria) this;
        }

        public Criteria andIfPopularGreaterThanOrEqualTo(String value) {
            addCriterion("IF_POPULAR >=", value, "ifPopular");
            return (Criteria) this;
        }

        public Criteria andIfPopularLessThan(String value) {
            addCriterion("IF_POPULAR <", value, "ifPopular");
            return (Criteria) this;
        }

        public Criteria andIfPopularLessThanOrEqualTo(String value) {
            addCriterion("IF_POPULAR <=", value, "ifPopular");
            return (Criteria) this;
        }

        public Criteria andIfPopularLike(String value) {
            addCriterion("IF_POPULAR like", value, "ifPopular");
            return (Criteria) this;
        }

        public Criteria andIfPopularNotLike(String value) {
            addCriterion("IF_POPULAR not like", value, "ifPopular");
            return (Criteria) this;
        }

        public Criteria andIfPopularIn(List<String> values) {
            addCriterion("IF_POPULAR in", values, "ifPopular");
            return (Criteria) this;
        }

        public Criteria andIfPopularNotIn(List<String> values) {
            addCriterion("IF_POPULAR not in", values, "ifPopular");
            return (Criteria) this;
        }

        public Criteria andIfPopularBetween(String value1, String value2) {
            addCriterion("IF_POPULAR between", value1, value2, "ifPopular");
            return (Criteria) this;
        }

        public Criteria andIfPopularNotBetween(String value1, String value2) {
            addCriterion("IF_POPULAR not between", value1, value2, "ifPopular");
            return (Criteria) this;
        }

        public Criteria andHomepageShowIsNull() {
            addCriterion("HOMEPAGE_SHOW is null");
            return (Criteria) this;
        }

        public Criteria andHomepageShowIsNotNull() {
            addCriterion("HOMEPAGE_SHOW is not null");
            return (Criteria) this;
        }

        public Criteria andHomepageShowEqualTo(Integer value) {
            addCriterion("HOMEPAGE_SHOW =", value, "homepageShow");
            return (Criteria) this;
        }

        public Criteria andHomepageShowNotEqualTo(Integer value) {
            addCriterion("HOMEPAGE_SHOW <>", value, "homepageShow");
            return (Criteria) this;
        }

        public Criteria andHomepageShowGreaterThan(Integer value) {
            addCriterion("HOMEPAGE_SHOW >", value, "homepageShow");
            return (Criteria) this;
        }

        public Criteria andHomepageShowGreaterThanOrEqualTo(Integer value) {
            addCriterion("HOMEPAGE_SHOW >=", value, "homepageShow");
            return (Criteria) this;
        }

        public Criteria andHomepageShowLessThan(Integer value) {
            addCriterion("HOMEPAGE_SHOW <", value, "homepageShow");
            return (Criteria) this;
        }

        public Criteria andHomepageShowLessThanOrEqualTo(Integer value) {
            addCriterion("HOMEPAGE_SHOW <=", value, "homepageShow");
            return (Criteria) this;
        }

        public Criteria andHomepageShowIn(List<Integer> values) {
            addCriterion("HOMEPAGE_SHOW in", values, "homepageShow");
            return (Criteria) this;
        }

        public Criteria andHomepageShowNotIn(List<Integer> values) {
            addCriterion("HOMEPAGE_SHOW not in", values, "homepageShow");
            return (Criteria) this;
        }

        public Criteria andHomepageShowBetween(Integer value1, Integer value2) {
            addCriterion("HOMEPAGE_SHOW between", value1, value2, "homepageShow");
            return (Criteria) this;
        }

        public Criteria andHomepageShowNotBetween(Integer value1, Integer value2) {
            addCriterion("HOMEPAGE_SHOW not between", value1, value2, "homepageShow");
            return (Criteria) this;
        }

        public Criteria andAddDateIsNull() {
            addCriterion("ADD_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAddDateIsNotNull() {
            addCriterion("ADD_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAddDateEqualTo(Date value) {
            addCriterion("ADD_DATE =", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateNotEqualTo(Date value) {
            addCriterion("ADD_DATE <>", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateGreaterThan(Date value) {
            addCriterion("ADD_DATE >", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ADD_DATE >=", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateLessThan(Date value) {
            addCriterion("ADD_DATE <", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateLessThanOrEqualTo(Date value) {
            addCriterion("ADD_DATE <=", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateIn(List<Date> values) {
            addCriterion("ADD_DATE in", values, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateNotIn(List<Date> values) {
            addCriterion("ADD_DATE not in", values, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateBetween(Date value1, Date value2) {
            addCriterion("ADD_DATE between", value1, value2, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateNotBetween(Date value1, Date value2) {
            addCriterion("ADD_DATE not between", value1, value2, "addDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNull() {
            addCriterion("LAST_UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNotNull() {
            addCriterion("LAST_UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE =", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE <>", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThan(Date value) {
            addCriterion("LAST_UPDATE_DATE >", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE >=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThan(Date value) {
            addCriterion("LAST_UPDATE_DATE <", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_DATE <=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIn(List<Date> values) {
            addCriterion("LAST_UPDATE_DATE in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotIn(List<Date> values) {
            addCriterion("LAST_UPDATE_DATE not in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATE_DATE between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATE_DATE not between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
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