package com.ls.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class ExperienceBaseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExperienceBaseInfoExample() {
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

        public Criteria andExperienceIdIsNull() {
            addCriterion("experience_id is null");
            return (Criteria) this;
        }

        public Criteria andExperienceIdIsNotNull() {
            addCriterion("experience_id is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceIdEqualTo(Integer value) {
            addCriterion("experience_id =", value, "experienceId");
            return (Criteria) this;
        }

        public Criteria andExperienceIdNotEqualTo(Integer value) {
            addCriterion("experience_id <>", value, "experienceId");
            return (Criteria) this;
        }

        public Criteria andExperienceIdGreaterThan(Integer value) {
            addCriterion("experience_id >", value, "experienceId");
            return (Criteria) this;
        }

        public Criteria andExperienceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("experience_id >=", value, "experienceId");
            return (Criteria) this;
        }

        public Criteria andExperienceIdLessThan(Integer value) {
            addCriterion("experience_id <", value, "experienceId");
            return (Criteria) this;
        }

        public Criteria andExperienceIdLessThanOrEqualTo(Integer value) {
            addCriterion("experience_id <=", value, "experienceId");
            return (Criteria) this;
        }

        public Criteria andExperienceIdIn(List<Integer> values) {
            addCriterion("experience_id in", values, "experienceId");
            return (Criteria) this;
        }

        public Criteria andExperienceIdNotIn(List<Integer> values) {
            addCriterion("experience_id not in", values, "experienceId");
            return (Criteria) this;
        }

        public Criteria andExperienceIdBetween(Integer value1, Integer value2) {
            addCriterion("experience_id between", value1, value2, "experienceId");
            return (Criteria) this;
        }

        public Criteria andExperienceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("experience_id not between", value1, value2, "experienceId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andExperienceTitleIsNull() {
            addCriterion("experience_title is null");
            return (Criteria) this;
        }

        public Criteria andExperienceTitleIsNotNull() {
            addCriterion("experience_title is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceTitleEqualTo(String value) {
            addCriterion("experience_title =", value, "experienceTitle");
            return (Criteria) this;
        }

        public Criteria andExperienceTitleNotEqualTo(String value) {
            addCriterion("experience_title <>", value, "experienceTitle");
            return (Criteria) this;
        }

        public Criteria andExperienceTitleGreaterThan(String value) {
            addCriterion("experience_title >", value, "experienceTitle");
            return (Criteria) this;
        }

        public Criteria andExperienceTitleGreaterThanOrEqualTo(String value) {
            addCriterion("experience_title >=", value, "experienceTitle");
            return (Criteria) this;
        }

        public Criteria andExperienceTitleLessThan(String value) {
            addCriterion("experience_title <", value, "experienceTitle");
            return (Criteria) this;
        }

        public Criteria andExperienceTitleLessThanOrEqualTo(String value) {
            addCriterion("experience_title <=", value, "experienceTitle");
            return (Criteria) this;
        }

        public Criteria andExperienceTitleLike(String value) {
            addCriterion("experience_title like", value, "experienceTitle");
            return (Criteria) this;
        }

        public Criteria andExperienceTitleNotLike(String value) {
            addCriterion("experience_title not like", value, "experienceTitle");
            return (Criteria) this;
        }

        public Criteria andExperienceTitleIn(List<String> values) {
            addCriterion("experience_title in", values, "experienceTitle");
            return (Criteria) this;
        }

        public Criteria andExperienceTitleNotIn(List<String> values) {
            addCriterion("experience_title not in", values, "experienceTitle");
            return (Criteria) this;
        }

        public Criteria andExperienceTitleBetween(String value1, String value2) {
            addCriterion("experience_title between", value1, value2, "experienceTitle");
            return (Criteria) this;
        }

        public Criteria andExperienceTitleNotBetween(String value1, String value2) {
            addCriterion("experience_title not between", value1, value2, "experienceTitle");
            return (Criteria) this;
        }

        public Criteria andExperienceTimeIsNull() {
            addCriterion("experience_time is null");
            return (Criteria) this;
        }

        public Criteria andExperienceTimeIsNotNull() {
            addCriterion("experience_time is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceTimeEqualTo(Date value) {
            addCriterion("experience_time =", value, "experienceTime");
            return (Criteria) this;
        }

        public Criteria andExperienceTimeNotEqualTo(Date value) {
            addCriterion("experience_time <>", value, "experienceTime");
            return (Criteria) this;
        }

        public Criteria andExperienceTimeGreaterThan(Date value) {
            addCriterion("experience_time >", value, "experienceTime");
            return (Criteria) this;
        }

        public Criteria andExperienceTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("experience_time >=", value, "experienceTime");
            return (Criteria) this;
        }

        public Criteria andExperienceTimeLessThan(Date value) {
            addCriterion("experience_time <", value, "experienceTime");
            return (Criteria) this;
        }

        public Criteria andExperienceTimeLessThanOrEqualTo(Date value) {
            addCriterion("experience_time <=", value, "experienceTime");
            return (Criteria) this;
        }

        public Criteria andExperienceTimeIn(List<Date> values) {
            addCriterion("experience_time in", values, "experienceTime");
            return (Criteria) this;
        }

        public Criteria andExperienceTimeNotIn(List<Date> values) {
            addCriterion("experience_time not in", values, "experienceTime");
            return (Criteria) this;
        }

        public Criteria andExperienceTimeBetween(Date value1, Date value2) {
            addCriterion("experience_time between", value1, value2, "experienceTime");
            return (Criteria) this;
        }

        public Criteria andExperienceTimeNotBetween(Date value1, Date value2) {
            addCriterion("experience_time not between", value1, value2, "experienceTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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