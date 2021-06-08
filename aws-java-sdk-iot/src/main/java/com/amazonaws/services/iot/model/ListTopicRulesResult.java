/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * The output from the ListTopicRules operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTopicRulesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The rules.
     * </p>
     */
    private java.util.List<TopicRuleListItem> rules;
    /**
     * <p>
     * The token to use to get the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The rules.
     * </p>
     * 
     * @return The rules.
     */

    public java.util.List<TopicRuleListItem> getRules() {
        return rules;
    }

    /**
     * <p>
     * The rules.
     * </p>
     * 
     * @param rules
     *        The rules.
     */

    public void setRules(java.util.Collection<TopicRuleListItem> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<TopicRuleListItem>(rules);
    }

    /**
     * <p>
     * The rules.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        The rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTopicRulesResult withRules(TopicRuleListItem... rules) {
        if (this.rules == null) {
            setRules(new java.util.ArrayList<TopicRuleListItem>(rules.length));
        }
        for (TopicRuleListItem ele : rules) {
            this.rules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The rules.
     * </p>
     * 
     * @param rules
     *        The rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTopicRulesResult withRules(java.util.Collection<TopicRuleListItem> rules) {
        setRules(rules);
        return this;
    }

    /**
     * <p>
     * The token to use to get the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token to use to get the next set of results, or <b>null</b> if there are no additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to get the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     * 
     * @return The token to use to get the next set of results, or <b>null</b> if there are no additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to get the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token to use to get the next set of results, or <b>null</b> if there are no additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTopicRulesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
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
        if (getRules() != null)
            sb.append("Rules: ").append(getRules()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTopicRulesResult == false)
            return false;
        ListTopicRulesResult other = (ListTopicRulesResult) obj;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTopicRulesResult clone() {
        try {
            return (ListTopicRulesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
