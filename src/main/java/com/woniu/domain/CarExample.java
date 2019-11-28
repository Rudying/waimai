package com.woniu.domain;

import java.util.ArrayList;
import java.util.List;

public class CarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarExample() {
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

        public Criteria andCaidIsNull() {
            addCriterion("caid is null");
            return (Criteria) this;
        }

        public Criteria andCaidIsNotNull() {
            addCriterion("caid is not null");
            return (Criteria) this;
        }

        public Criteria andCaidEqualTo(Integer value) {
            addCriterion("caid =", value, "caid");
            return (Criteria) this;
        }

        public Criteria andCaidNotEqualTo(Integer value) {
            addCriterion("caid <>", value, "caid");
            return (Criteria) this;
        }

        public Criteria andCaidGreaterThan(Integer value) {
            addCriterion("caid >", value, "caid");
            return (Criteria) this;
        }

        public Criteria andCaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("caid >=", value, "caid");
            return (Criteria) this;
        }

        public Criteria andCaidLessThan(Integer value) {
            addCriterion("caid <", value, "caid");
            return (Criteria) this;
        }

        public Criteria andCaidLessThanOrEqualTo(Integer value) {
            addCriterion("caid <=", value, "caid");
            return (Criteria) this;
        }

        public Criteria andCaidIn(List<Integer> values) {
            addCriterion("caid in", values, "caid");
            return (Criteria) this;
        }

        public Criteria andCaidNotIn(List<Integer> values) {
            addCriterion("caid not in", values, "caid");
            return (Criteria) this;
        }

        public Criteria andCaidBetween(Integer value1, Integer value2) {
            addCriterion("caid between", value1, value2, "caid");
            return (Criteria) this;
        }

        public Criteria andCaidNotBetween(Integer value1, Integer value2) {
            addCriterion("caid not between", value1, value2, "caid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andFnameIsNull() {
            addCriterion("fname is null");
            return (Criteria) this;
        }

        public Criteria andFnameIsNotNull() {
            addCriterion("fname is not null");
            return (Criteria) this;
        }

        public Criteria andFnameEqualTo(String value) {
            addCriterion("fname =", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotEqualTo(String value) {
            addCriterion("fname <>", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameGreaterThan(String value) {
            addCriterion("fname >", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameGreaterThanOrEqualTo(String value) {
            addCriterion("fname >=", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLessThan(String value) {
            addCriterion("fname <", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLessThanOrEqualTo(String value) {
            addCriterion("fname <=", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLike(String value) {
            addCriterion("fname like", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotLike(String value) {
            addCriterion("fname not like", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameIn(List<String> values) {
            addCriterion("fname in", values, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotIn(List<String> values) {
            addCriterion("fname not in", values, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameBetween(String value1, String value2) {
            addCriterion("fname between", value1, value2, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotBetween(String value1, String value2) {
            addCriterion("fname not between", value1, value2, "fname");
            return (Criteria) this;
        }

        public Criteria andFpriceIsNull() {
            addCriterion("fprice is null");
            return (Criteria) this;
        }

        public Criteria andFpriceIsNotNull() {
            addCriterion("fprice is not null");
            return (Criteria) this;
        }

        public Criteria andFpriceEqualTo(Double value) {
            addCriterion("fprice =", value, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceNotEqualTo(Double value) {
            addCriterion("fprice <>", value, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceGreaterThan(Double value) {
            addCriterion("fprice >", value, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("fprice >=", value, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceLessThan(Double value) {
            addCriterion("fprice <", value, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceLessThanOrEqualTo(Double value) {
            addCriterion("fprice <=", value, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceIn(List<Double> values) {
            addCriterion("fprice in", values, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceNotIn(List<Double> values) {
            addCriterion("fprice not in", values, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceBetween(Double value1, Double value2) {
            addCriterion("fprice between", value1, value2, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceNotBetween(Double value1, Double value2) {
            addCriterion("fprice not between", value1, value2, "fprice");
            return (Criteria) this;
        }

        public Criteria andFphotoIsNull() {
            addCriterion("fphoto is null");
            return (Criteria) this;
        }

        public Criteria andFphotoIsNotNull() {
            addCriterion("fphoto is not null");
            return (Criteria) this;
        }

        public Criteria andFphotoEqualTo(String value) {
            addCriterion("fphoto =", value, "fphoto");
            return (Criteria) this;
        }

        public Criteria andFphotoNotEqualTo(String value) {
            addCriterion("fphoto <>", value, "fphoto");
            return (Criteria) this;
        }

        public Criteria andFphotoGreaterThan(String value) {
            addCriterion("fphoto >", value, "fphoto");
            return (Criteria) this;
        }

        public Criteria andFphotoGreaterThanOrEqualTo(String value) {
            addCriterion("fphoto >=", value, "fphoto");
            return (Criteria) this;
        }

        public Criteria andFphotoLessThan(String value) {
            addCriterion("fphoto <", value, "fphoto");
            return (Criteria) this;
        }

        public Criteria andFphotoLessThanOrEqualTo(String value) {
            addCriterion("fphoto <=", value, "fphoto");
            return (Criteria) this;
        }

        public Criteria andFphotoLike(String value) {
            addCriterion("fphoto like", value, "fphoto");
            return (Criteria) this;
        }

        public Criteria andFphotoNotLike(String value) {
            addCriterion("fphoto not like", value, "fphoto");
            return (Criteria) this;
        }

        public Criteria andFphotoIn(List<String> values) {
            addCriterion("fphoto in", values, "fphoto");
            return (Criteria) this;
        }

        public Criteria andFphotoNotIn(List<String> values) {
            addCriterion("fphoto not in", values, "fphoto");
            return (Criteria) this;
        }

        public Criteria andFphotoBetween(String value1, String value2) {
            addCriterion("fphoto between", value1, value2, "fphoto");
            return (Criteria) this;
        }

        public Criteria andFphotoNotBetween(String value1, String value2) {
            addCriterion("fphoto not between", value1, value2, "fphoto");
            return (Criteria) this;
        }

        public Criteria andCcountIsNull() {
            addCriterion("ccount is null");
            return (Criteria) this;
        }

        public Criteria andCcountIsNotNull() {
            addCriterion("ccount is not null");
            return (Criteria) this;
        }

        public Criteria andCcountEqualTo(Integer value) {
            addCriterion("ccount =", value, "ccount");
            return (Criteria) this;
        }

        public Criteria andCcountNotEqualTo(Integer value) {
            addCriterion("ccount <>", value, "ccount");
            return (Criteria) this;
        }

        public Criteria andCcountGreaterThan(Integer value) {
            addCriterion("ccount >", value, "ccount");
            return (Criteria) this;
        }

        public Criteria andCcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ccount >=", value, "ccount");
            return (Criteria) this;
        }

        public Criteria andCcountLessThan(Integer value) {
            addCriterion("ccount <", value, "ccount");
            return (Criteria) this;
        }

        public Criteria andCcountLessThanOrEqualTo(Integer value) {
            addCriterion("ccount <=", value, "ccount");
            return (Criteria) this;
        }

        public Criteria andCcountIn(List<Integer> values) {
            addCriterion("ccount in", values, "ccount");
            return (Criteria) this;
        }

        public Criteria andCcountNotIn(List<Integer> values) {
            addCriterion("ccount not in", values, "ccount");
            return (Criteria) this;
        }

        public Criteria andCcountBetween(Integer value1, Integer value2) {
            addCriterion("ccount between", value1, value2, "ccount");
            return (Criteria) this;
        }

        public Criteria andCcountNotBetween(Integer value1, Integer value2) {
            addCriterion("ccount not between", value1, value2, "ccount");
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