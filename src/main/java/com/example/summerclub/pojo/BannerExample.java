package com.example.summerclub.pojo;

import java.util.ArrayList;
import java.util.List;

public class BannerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BannerExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceOneIsNull() {
            addCriterion("blanck_space_one is null");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceOneIsNotNull() {
            addCriterion("blanck_space_one is not null");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceOneEqualTo(String value) {
            addCriterion("blanck_space_one =", value, "blanckSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceOneNotEqualTo(String value) {
            addCriterion("blanck_space_one <>", value, "blanckSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceOneGreaterThan(String value) {
            addCriterion("blanck_space_one >", value, "blanckSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceOneGreaterThanOrEqualTo(String value) {
            addCriterion("blanck_space_one >=", value, "blanckSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceOneLessThan(String value) {
            addCriterion("blanck_space_one <", value, "blanckSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceOneLessThanOrEqualTo(String value) {
            addCriterion("blanck_space_one <=", value, "blanckSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceOneLike(String value) {
            addCriterion("blanck_space_one like", value, "blanckSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceOneNotLike(String value) {
            addCriterion("blanck_space_one not like", value, "blanckSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceOneIn(List<String> values) {
            addCriterion("blanck_space_one in", values, "blanckSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceOneNotIn(List<String> values) {
            addCriterion("blanck_space_one not in", values, "blanckSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceOneBetween(String value1, String value2) {
            addCriterion("blanck_space_one between", value1, value2, "blanckSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceOneNotBetween(String value1, String value2) {
            addCriterion("blanck_space_one not between", value1, value2, "blanckSpaceOne");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceThreeIsNull() {
            addCriterion("blanck_space_three is null");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceThreeIsNotNull() {
            addCriterion("blanck_space_three is not null");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceThreeEqualTo(String value) {
            addCriterion("blanck_space_three =", value, "blanckSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceThreeNotEqualTo(String value) {
            addCriterion("blanck_space_three <>", value, "blanckSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceThreeGreaterThan(String value) {
            addCriterion("blanck_space_three >", value, "blanckSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceThreeGreaterThanOrEqualTo(String value) {
            addCriterion("blanck_space_three >=", value, "blanckSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceThreeLessThan(String value) {
            addCriterion("blanck_space_three <", value, "blanckSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceThreeLessThanOrEqualTo(String value) {
            addCriterion("blanck_space_three <=", value, "blanckSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceThreeLike(String value) {
            addCriterion("blanck_space_three like", value, "blanckSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceThreeNotLike(String value) {
            addCriterion("blanck_space_three not like", value, "blanckSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceThreeIn(List<String> values) {
            addCriterion("blanck_space_three in", values, "blanckSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceThreeNotIn(List<String> values) {
            addCriterion("blanck_space_three not in", values, "blanckSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceThreeBetween(String value1, String value2) {
            addCriterion("blanck_space_three between", value1, value2, "blanckSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceThreeNotBetween(String value1, String value2) {
            addCriterion("blanck_space_three not between", value1, value2, "blanckSpaceThree");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceTwoIsNull() {
            addCriterion("blanck_space_two is null");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceTwoIsNotNull() {
            addCriterion("blanck_space_two is not null");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceTwoEqualTo(String value) {
            addCriterion("blanck_space_two =", value, "blanckSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceTwoNotEqualTo(String value) {
            addCriterion("blanck_space_two <>", value, "blanckSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceTwoGreaterThan(String value) {
            addCriterion("blanck_space_two >", value, "blanckSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceTwoGreaterThanOrEqualTo(String value) {
            addCriterion("blanck_space_two >=", value, "blanckSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceTwoLessThan(String value) {
            addCriterion("blanck_space_two <", value, "blanckSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceTwoLessThanOrEqualTo(String value) {
            addCriterion("blanck_space_two <=", value, "blanckSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceTwoLike(String value) {
            addCriterion("blanck_space_two like", value, "blanckSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceTwoNotLike(String value) {
            addCriterion("blanck_space_two not like", value, "blanckSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceTwoIn(List<String> values) {
            addCriterion("blanck_space_two in", values, "blanckSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceTwoNotIn(List<String> values) {
            addCriterion("blanck_space_two not in", values, "blanckSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceTwoBetween(String value1, String value2) {
            addCriterion("blanck_space_two between", value1, value2, "blanckSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andBlanckSpaceTwoNotBetween(String value1, String value2) {
            addCriterion("blanck_space_two not between", value1, value2, "blanckSpaceTwo");
            return (Criteria) this;
        }

        public Criteria andIntroduceIsNull() {
            addCriterion("introduce is null");
            return (Criteria) this;
        }

        public Criteria andIntroduceIsNotNull() {
            addCriterion("introduce is not null");
            return (Criteria) this;
        }

        public Criteria andIntroduceEqualTo(String value) {
            addCriterion("introduce =", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotEqualTo(String value) {
            addCriterion("introduce <>", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceGreaterThan(String value) {
            addCriterion("introduce >", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("introduce >=", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLessThan(String value) {
            addCriterion("introduce <", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLessThanOrEqualTo(String value) {
            addCriterion("introduce <=", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLike(String value) {
            addCriterion("introduce like", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotLike(String value) {
            addCriterion("introduce not like", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceIn(List<String> values) {
            addCriterion("introduce in", values, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotIn(List<String> values) {
            addCriterion("introduce not in", values, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceBetween(String value1, String value2) {
            addCriterion("introduce between", value1, value2, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotBetween(String value1, String value2) {
            addCriterion("introduce not between", value1, value2, "introduce");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIsNull() {
            addCriterion("link_url is null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIsNotNull() {
            addCriterion("link_url is not null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlEqualTo(String value) {
            addCriterion("link_url =", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotEqualTo(String value) {
            addCriterion("link_url <>", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlGreaterThan(String value) {
            addCriterion("link_url >", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlGreaterThanOrEqualTo(String value) {
            addCriterion("link_url >=", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLessThan(String value) {
            addCriterion("link_url <", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLessThanOrEqualTo(String value) {
            addCriterion("link_url <=", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLike(String value) {
            addCriterion("link_url like", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotLike(String value) {
            addCriterion("link_url not like", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIn(List<String> values) {
            addCriterion("link_url in", values, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotIn(List<String> values) {
            addCriterion("link_url not in", values, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlBetween(String value1, String value2) {
            addCriterion("link_url between", value1, value2, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotBetween(String value1, String value2) {
            addCriterion("link_url not between", value1, value2, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
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