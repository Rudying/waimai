package com.woniu.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
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

        public Criteria andFidIsNull() {
            addCriterion("fid is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("fid is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(Integer value) {
            addCriterion("fid =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(Integer value) {
            addCriterion("fid <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(Integer value) {
            addCriterion("fid >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fid >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(Integer value) {
            addCriterion("fid <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(Integer value) {
            addCriterion("fid <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<Integer> values) {
            addCriterion("fid in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<Integer> values) {
            addCriterion("fid not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(Integer value1, Integer value2) {
            addCriterion("fid between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(Integer value1, Integer value2) {
            addCriterion("fid not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andCinfoIsNull() {
            addCriterion("cinfo is null");
            return (Criteria) this;
        }

        public Criteria andCinfoIsNotNull() {
            addCriterion("cinfo is not null");
            return (Criteria) this;
        }

        public Criteria andCinfoEqualTo(String value) {
            addCriterion("cinfo =", value, "cinfo");
            return (Criteria) this;
        }

        public Criteria andCinfoNotEqualTo(String value) {
            addCriterion("cinfo <>", value, "cinfo");
            return (Criteria) this;
        }

        public Criteria andCinfoGreaterThan(String value) {
            addCriterion("cinfo >", value, "cinfo");
            return (Criteria) this;
        }

        public Criteria andCinfoGreaterThanOrEqualTo(String value) {
            addCriterion("cinfo >=", value, "cinfo");
            return (Criteria) this;
        }

        public Criteria andCinfoLessThan(String value) {
            addCriterion("cinfo <", value, "cinfo");
            return (Criteria) this;
        }

        public Criteria andCinfoLessThanOrEqualTo(String value) {
            addCriterion("cinfo <=", value, "cinfo");
            return (Criteria) this;
        }

        public Criteria andCinfoLike(String value) {
            addCriterion("cinfo like", value, "cinfo");
            return (Criteria) this;
        }

        public Criteria andCinfoNotLike(String value) {
            addCriterion("cinfo not like", value, "cinfo");
            return (Criteria) this;
        }

        public Criteria andCinfoIn(List<String> values) {
            addCriterion("cinfo in", values, "cinfo");
            return (Criteria) this;
        }

        public Criteria andCinfoNotIn(List<String> values) {
            addCriterion("cinfo not in", values, "cinfo");
            return (Criteria) this;
        }

        public Criteria andCinfoBetween(String value1, String value2) {
            addCriterion("cinfo between", value1, value2, "cinfo");
            return (Criteria) this;
        }

        public Criteria andCinfoNotBetween(String value1, String value2) {
            addCriterion("cinfo not between", value1, value2, "cinfo");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Date value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Date value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Date value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Date value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Date value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Date> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Date> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Date value1, Date value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Date value1, Date value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCphotoIsNull() {
            addCriterion("cphoto is null");
            return (Criteria) this;
        }

        public Criteria andCphotoIsNotNull() {
            addCriterion("cphoto is not null");
            return (Criteria) this;
        }

        public Criteria andCphotoEqualTo(String value) {
            addCriterion("cphoto =", value, "cphoto");
            return (Criteria) this;
        }

        public Criteria andCphotoNotEqualTo(String value) {
            addCriterion("cphoto <>", value, "cphoto");
            return (Criteria) this;
        }

        public Criteria andCphotoGreaterThan(String value) {
            addCriterion("cphoto >", value, "cphoto");
            return (Criteria) this;
        }

        public Criteria andCphotoGreaterThanOrEqualTo(String value) {
            addCriterion("cphoto >=", value, "cphoto");
            return (Criteria) this;
        }

        public Criteria andCphotoLessThan(String value) {
            addCriterion("cphoto <", value, "cphoto");
            return (Criteria) this;
        }

        public Criteria andCphotoLessThanOrEqualTo(String value) {
            addCriterion("cphoto <=", value, "cphoto");
            return (Criteria) this;
        }

        public Criteria andCphotoLike(String value) {
            addCriterion("cphoto like", value, "cphoto");
            return (Criteria) this;
        }

        public Criteria andCphotoNotLike(String value) {
            addCriterion("cphoto not like", value, "cphoto");
            return (Criteria) this;
        }

        public Criteria andCphotoIn(List<String> values) {
            addCriterion("cphoto in", values, "cphoto");
            return (Criteria) this;
        }

        public Criteria andCphotoNotIn(List<String> values) {
            addCriterion("cphoto not in", values, "cphoto");
            return (Criteria) this;
        }

        public Criteria andCphotoBetween(String value1, String value2) {
            addCriterion("cphoto between", value1, value2, "cphoto");
            return (Criteria) this;
        }

        public Criteria andCphotoNotBetween(String value1, String value2) {
            addCriterion("cphoto not between", value1, value2, "cphoto");
            return (Criteria) this;
        }

        public Criteria andCcoinIsNull() {
            addCriterion("ccoin is null");
            return (Criteria) this;
        }

        public Criteria andCcoinIsNotNull() {
            addCriterion("ccoin is not null");
            return (Criteria) this;
        }

        public Criteria andCcoinEqualTo(Integer value) {
            addCriterion("ccoin =", value, "ccoin");
            return (Criteria) this;
        }

        public Criteria andCcoinNotEqualTo(Integer value) {
            addCriterion("ccoin <>", value, "ccoin");
            return (Criteria) this;
        }

        public Criteria andCcoinGreaterThan(Integer value) {
            addCriterion("ccoin >", value, "ccoin");
            return (Criteria) this;
        }

        public Criteria andCcoinGreaterThanOrEqualTo(Integer value) {
            addCriterion("ccoin >=", value, "ccoin");
            return (Criteria) this;
        }

        public Criteria andCcoinLessThan(Integer value) {
            addCriterion("ccoin <", value, "ccoin");
            return (Criteria) this;
        }

        public Criteria andCcoinLessThanOrEqualTo(Integer value) {
            addCriterion("ccoin <=", value, "ccoin");
            return (Criteria) this;
        }

        public Criteria andCcoinIn(List<Integer> values) {
            addCriterion("ccoin in", values, "ccoin");
            return (Criteria) this;
        }

        public Criteria andCcoinNotIn(List<Integer> values) {
            addCriterion("ccoin not in", values, "ccoin");
            return (Criteria) this;
        }

        public Criteria andCcoinBetween(Integer value1, Integer value2) {
            addCriterion("ccoin between", value1, value2, "ccoin");
            return (Criteria) this;
        }

        public Criteria andCcoinNotBetween(Integer value1, Integer value2) {
            addCriterion("ccoin not between", value1, value2, "ccoin");
            return (Criteria) this;
        }

        public Criteria andCstatusIsNull() {
            addCriterion("cstatus is null");
            return (Criteria) this;
        }

        public Criteria andCstatusIsNotNull() {
            addCriterion("cstatus is not null");
            return (Criteria) this;
        }

        public Criteria andCstatusEqualTo(Integer value) {
            addCriterion("cstatus =", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusNotEqualTo(Integer value) {
            addCriterion("cstatus <>", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusGreaterThan(Integer value) {
            addCriterion("cstatus >", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("cstatus >=", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusLessThan(Integer value) {
            addCriterion("cstatus <", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusLessThanOrEqualTo(Integer value) {
            addCriterion("cstatus <=", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusIn(List<Integer> values) {
            addCriterion("cstatus in", values, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusNotIn(List<Integer> values) {
            addCriterion("cstatus not in", values, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusBetween(Integer value1, Integer value2) {
            addCriterion("cstatus between", value1, value2, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("cstatus not between", value1, value2, "cstatus");
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