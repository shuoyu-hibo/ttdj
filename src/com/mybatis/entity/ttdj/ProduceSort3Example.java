package com.mybatis.entity.ttdj;

import java.util.ArrayList;
import java.util.List;

public class ProduceSort3Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProduceSort3Example() {
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