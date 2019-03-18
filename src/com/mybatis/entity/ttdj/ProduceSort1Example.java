package com.mybatis.entity.ttdj;

import java.util.ArrayList;
import java.util.List;

public class ProduceSort1Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProduceSort1Example() {
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

        public Criteria andProSortCodeIsNull() {
            addCriterion("PRO_SORT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProSortCodeIsNotNull() {
            addCriterion("PRO_SORT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProSortCodeEqualTo(Integer value) {
            addCriterion("PRO_SORT_CODE =", value, "proSortCode");
            return (Criteria) this;
        }

        public Criteria andProSortCodeNotEqualTo(Integer value) {
            addCriterion("PRO_SORT_CODE <>", value, "proSortCode");
            return (Criteria) this;
        }

        public Criteria andProSortCodeGreaterThan(Integer value) {
            addCriterion("PRO_SORT_CODE >", value, "proSortCode");
            return (Criteria) this;
        }

        public Criteria andProSortCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRO_SORT_CODE >=", value, "proSortCode");
            return (Criteria) this;
        }

        public Criteria andProSortCodeLessThan(Integer value) {
            addCriterion("PRO_SORT_CODE <", value, "proSortCode");
            return (Criteria) this;
        }

        public Criteria andProSortCodeLessThanOrEqualTo(Integer value) {
            addCriterion("PRO_SORT_CODE <=", value, "proSortCode");
            return (Criteria) this;
        }

        public Criteria andProSortCodeIn(List<Integer> values) {
            addCriterion("PRO_SORT_CODE in", values, "proSortCode");
            return (Criteria) this;
        }

        public Criteria andProSortCodeNotIn(List<Integer> values) {
            addCriterion("PRO_SORT_CODE not in", values, "proSortCode");
            return (Criteria) this;
        }

        public Criteria andProSortCodeBetween(Integer value1, Integer value2) {
            addCriterion("PRO_SORT_CODE between", value1, value2, "proSortCode");
            return (Criteria) this;
        }

        public Criteria andProSortCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("PRO_SORT_CODE not between", value1, value2, "proSortCode");
            return (Criteria) this;
        }

        public Criteria andProSortNameIsNull() {
            addCriterion("PRO_SORT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProSortNameIsNotNull() {
            addCriterion("PRO_SORT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProSortNameEqualTo(String value) {
            addCriterion("PRO_SORT_NAME =", value, "proSortName");
            return (Criteria) this;
        }

        public Criteria andProSortNameNotEqualTo(String value) {
            addCriterion("PRO_SORT_NAME <>", value, "proSortName");
            return (Criteria) this;
        }

        public Criteria andProSortNameGreaterThan(String value) {
            addCriterion("PRO_SORT_NAME >", value, "proSortName");
            return (Criteria) this;
        }

        public Criteria andProSortNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_SORT_NAME >=", value, "proSortName");
            return (Criteria) this;
        }

        public Criteria andProSortNameLessThan(String value) {
            addCriterion("PRO_SORT_NAME <", value, "proSortName");
            return (Criteria) this;
        }

        public Criteria andProSortNameLessThanOrEqualTo(String value) {
            addCriterion("PRO_SORT_NAME <=", value, "proSortName");
            return (Criteria) this;
        }

        public Criteria andProSortNameLike(String value) {
            addCriterion("PRO_SORT_NAME like", value, "proSortName");
            return (Criteria) this;
        }

        public Criteria andProSortNameNotLike(String value) {
            addCriterion("PRO_SORT_NAME not like", value, "proSortName");
            return (Criteria) this;
        }

        public Criteria andProSortNameIn(List<String> values) {
            addCriterion("PRO_SORT_NAME in", values, "proSortName");
            return (Criteria) this;
        }

        public Criteria andProSortNameNotIn(List<String> values) {
            addCriterion("PRO_SORT_NAME not in", values, "proSortName");
            return (Criteria) this;
        }

        public Criteria andProSortNameBetween(String value1, String value2) {
            addCriterion("PRO_SORT_NAME between", value1, value2, "proSortName");
            return (Criteria) this;
        }

        public Criteria andProSortNameNotBetween(String value1, String value2) {
            addCriterion("PRO_SORT_NAME not between", value1, value2, "proSortName");
            return (Criteria) this;
        }

        public Criteria andIfUseIsNull() {
            addCriterion("IF_USE is null");
            return (Criteria) this;
        }

        public Criteria andIfUseIsNotNull() {
            addCriterion("IF_USE is not null");
            return (Criteria) this;
        }

        public Criteria andIfUseEqualTo(String value) {
            addCriterion("IF_USE =", value, "ifUse");
            return (Criteria) this;
        }

        public Criteria andIfUseNotEqualTo(String value) {
            addCriterion("IF_USE <>", value, "ifUse");
            return (Criteria) this;
        }

        public Criteria andIfUseGreaterThan(String value) {
            addCriterion("IF_USE >", value, "ifUse");
            return (Criteria) this;
        }

        public Criteria andIfUseGreaterThanOrEqualTo(String value) {
            addCriterion("IF_USE >=", value, "ifUse");
            return (Criteria) this;
        }

        public Criteria andIfUseLessThan(String value) {
            addCriterion("IF_USE <", value, "ifUse");
            return (Criteria) this;
        }

        public Criteria andIfUseLessThanOrEqualTo(String value) {
            addCriterion("IF_USE <=", value, "ifUse");
            return (Criteria) this;
        }

        public Criteria andIfUseLike(String value) {
            addCriterion("IF_USE like", value, "ifUse");
            return (Criteria) this;
        }

        public Criteria andIfUseNotLike(String value) {
            addCriterion("IF_USE not like", value, "ifUse");
            return (Criteria) this;
        }

        public Criteria andIfUseIn(List<String> values) {
            addCriterion("IF_USE in", values, "ifUse");
            return (Criteria) this;
        }

        public Criteria andIfUseNotIn(List<String> values) {
            addCriterion("IF_USE not in", values, "ifUse");
            return (Criteria) this;
        }

        public Criteria andIfUseBetween(String value1, String value2) {
            addCriterion("IF_USE between", value1, value2, "ifUse");
            return (Criteria) this;
        }

        public Criteria andIfUseNotBetween(String value1, String value2) {
            addCriterion("IF_USE not between", value1, value2, "ifUse");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNull() {
            addCriterion("ORDER_NUM is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNotNull() {
            addCriterion("ORDER_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumEqualTo(Integer value) {
            addCriterion("ORDER_NUM =", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotEqualTo(Integer value) {
            addCriterion("ORDER_NUM <>", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThan(Integer value) {
            addCriterion("ORDER_NUM >", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_NUM >=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThan(Integer value) {
            addCriterion("ORDER_NUM <", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_NUM <=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIn(List<Integer> values) {
            addCriterion("ORDER_NUM in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotIn(List<Integer> values) {
            addCriterion("ORDER_NUM not in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_NUM between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_NUM not between", value1, value2, "orderNum");
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