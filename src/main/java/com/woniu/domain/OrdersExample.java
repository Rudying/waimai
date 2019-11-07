package com.woniu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Integer value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Integer value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Integer value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Integer value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Integer value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Integer> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Integer> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Integer value1, Integer value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Integer value1, Integer value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOnumberIsNull() {
            addCriterion("onumber is null");
            return (Criteria) this;
        }

        public Criteria andOnumberIsNotNull() {
            addCriterion("onumber is not null");
            return (Criteria) this;
        }

        public Criteria andOnumberEqualTo(String value) {
            addCriterion("onumber =", value, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberNotEqualTo(String value) {
            addCriterion("onumber <>", value, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberGreaterThan(String value) {
            addCriterion("onumber >", value, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberGreaterThanOrEqualTo(String value) {
            addCriterion("onumber >=", value, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberLessThan(String value) {
            addCriterion("onumber <", value, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberLessThanOrEqualTo(String value) {
            addCriterion("onumber <=", value, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberLike(String value) {
            addCriterion("onumber like", value, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberNotLike(String value) {
            addCriterion("onumber not like", value, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberIn(List<String> values) {
            addCriterion("onumber in", values, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberNotIn(List<String> values) {
            addCriterion("onumber not in", values, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberBetween(String value1, String value2) {
            addCriterion("onumber between", value1, value2, "onumber");
            return (Criteria) this;
        }

        public Criteria andOnumberNotBetween(String value1, String value2) {
            addCriterion("onumber not between", value1, value2, "onumber");
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

        public Criteria andOaddressIsNull() {
            addCriterion("oaddress is null");
            return (Criteria) this;
        }

        public Criteria andOaddressIsNotNull() {
            addCriterion("oaddress is not null");
            return (Criteria) this;
        }

        public Criteria andOaddressEqualTo(String value) {
            addCriterion("oaddress =", value, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressNotEqualTo(String value) {
            addCriterion("oaddress <>", value, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressGreaterThan(String value) {
            addCriterion("oaddress >", value, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressGreaterThanOrEqualTo(String value) {
            addCriterion("oaddress >=", value, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressLessThan(String value) {
            addCriterion("oaddress <", value, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressLessThanOrEqualTo(String value) {
            addCriterion("oaddress <=", value, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressLike(String value) {
            addCriterion("oaddress like", value, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressNotLike(String value) {
            addCriterion("oaddress not like", value, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressIn(List<String> values) {
            addCriterion("oaddress in", values, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressNotIn(List<String> values) {
            addCriterion("oaddress not in", values, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressBetween(String value1, String value2) {
            addCriterion("oaddress between", value1, value2, "oaddress");
            return (Criteria) this;
        }

        public Criteria andOaddressNotBetween(String value1, String value2) {
            addCriterion("oaddress not between", value1, value2, "oaddress");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andOmessageIsNull() {
            addCriterion("omessage is null");
            return (Criteria) this;
        }

        public Criteria andOmessageIsNotNull() {
            addCriterion("omessage is not null");
            return (Criteria) this;
        }

        public Criteria andOmessageEqualTo(String value) {
            addCriterion("omessage =", value, "omessage");
            return (Criteria) this;
        }

        public Criteria andOmessageNotEqualTo(String value) {
            addCriterion("omessage <>", value, "omessage");
            return (Criteria) this;
        }

        public Criteria andOmessageGreaterThan(String value) {
            addCriterion("omessage >", value, "omessage");
            return (Criteria) this;
        }

        public Criteria andOmessageGreaterThanOrEqualTo(String value) {
            addCriterion("omessage >=", value, "omessage");
            return (Criteria) this;
        }

        public Criteria andOmessageLessThan(String value) {
            addCriterion("omessage <", value, "omessage");
            return (Criteria) this;
        }

        public Criteria andOmessageLessThanOrEqualTo(String value) {
            addCriterion("omessage <=", value, "omessage");
            return (Criteria) this;
        }

        public Criteria andOmessageLike(String value) {
            addCriterion("omessage like", value, "omessage");
            return (Criteria) this;
        }

        public Criteria andOmessageNotLike(String value) {
            addCriterion("omessage not like", value, "omessage");
            return (Criteria) this;
        }

        public Criteria andOmessageIn(List<String> values) {
            addCriterion("omessage in", values, "omessage");
            return (Criteria) this;
        }

        public Criteria andOmessageNotIn(List<String> values) {
            addCriterion("omessage not in", values, "omessage");
            return (Criteria) this;
        }

        public Criteria andOmessageBetween(String value1, String value2) {
            addCriterion("omessage between", value1, value2, "omessage");
            return (Criteria) this;
        }

        public Criteria andOmessageNotBetween(String value1, String value2) {
            addCriterion("omessage not between", value1, value2, "omessage");
            return (Criteria) this;
        }

        public Criteria andOstatusIsNull() {
            addCriterion("ostatus is null");
            return (Criteria) this;
        }

        public Criteria andOstatusIsNotNull() {
            addCriterion("ostatus is not null");
            return (Criteria) this;
        }

        public Criteria andOstatusEqualTo(Integer value) {
            addCriterion("ostatus =", value, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusNotEqualTo(Integer value) {
            addCriterion("ostatus <>", value, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusGreaterThan(Integer value) {
            addCriterion("ostatus >", value, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ostatus >=", value, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusLessThan(Integer value) {
            addCriterion("ostatus <", value, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusLessThanOrEqualTo(Integer value) {
            addCriterion("ostatus <=", value, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusIn(List<Integer> values) {
            addCriterion("ostatus in", values, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusNotIn(List<Integer> values) {
            addCriterion("ostatus not in", values, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusBetween(Integer value1, Integer value2) {
            addCriterion("ostatus between", value1, value2, "ostatus");
            return (Criteria) this;
        }

        public Criteria andOstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("ostatus not between", value1, value2, "ostatus");
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