/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the ListTopicRules operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTopicRulesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The topic.
     * </p>
     */
    private String topic;
    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token used to retrieve the next value.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Specifies whether the rule is disabled.
     * </p>
     */
    private Boolean ruleDisabled;

    /**
     * <p>
     * The topic.
     * </p>
     * 
     * @param topic
     *        The topic.
     */

    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * <p>
     * The topic.
     * </p>
     * 
     * @return The topic.
     */

    public String getTopic() {
        return this.topic;
    }

    /**
     * <p>
     * The topic.
     * </p>
     * 
     * @param topic
     *        The topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTopicRulesRequest withTopic(String topic) {
        setTopic(topic);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @return The maximum number of results to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTopicRulesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token used to retrieve the next value.
     * </p>
     * 
     * @param nextToken
     *        A token used to retrieve the next value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token used to retrieve the next value.
     * </p>
     * 
     * @return A token used to retrieve the next value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token used to retrieve the next value.
     * </p>
     * 
     * @param nextToken
     *        A token used to retrieve the next value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTopicRulesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Specifies whether the rule is disabled.
     * </p>
     * 
     * @param ruleDisabled
     *        Specifies whether the rule is disabled.
     */

    public void setRuleDisabled(Boolean ruleDisabled) {
        this.ruleDisabled = ruleDisabled;
    }

    /**
     * <p>
     * Specifies whether the rule is disabled.
     * </p>
     * 
     * @return Specifies whether the rule is disabled.
     */

    public Boolean getRuleDisabled() {
        return this.ruleDisabled;
    }

    /**
     * <p>
     * Specifies whether the rule is disabled.
     * </p>
     * 
     * @param ruleDisabled
     *        Specifies whether the rule is disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTopicRulesRequest withRuleDisabled(Boolean ruleDisabled) {
        setRuleDisabled(ruleDisabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether the rule is disabled.
     * </p>
     * 
     * @return Specifies whether the rule is disabled.
     */

    public Boolean isRuleDisabled() {
        return this.ruleDisabled;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTopic() != null)
            sb.append("Topic: ").append(getTopic()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getRuleDisabled() != null)
            sb.append("RuleDisabled: ").append(getRuleDisabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTopicRulesRequest == false)
            return false;
        ListTopicRulesRequest other = (ListTopicRulesRequest) obj;
        if (other.getTopic() == null ^ this.getTopic() == null)
            return false;
        if (other.getTopic() != null && other.getTopic().equals(this.getTopic()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRuleDisabled() == null ^ this.getRuleDisabled() == null)
            return false;
        if (other.getRuleDisabled() != null && other.getRuleDisabled().equals(this.getRuleDisabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopic() == null) ? 0 : getTopic().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRuleDisabled() == null) ? 0 : getRuleDisabled().hashCode());
        return hashCode;
    }

    @Override
    public ListTopicRulesRequest clone() {
        return (ListTopicRulesRequest) super.clone();
    }

}
