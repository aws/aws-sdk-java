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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/ListRuleNamesByTarget" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRuleNamesByTargetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The names of the rules that can invoke the given target.
     * </p>
     */
    private java.util.List<String> ruleNames;
    /**
     * <p>
     * Indicates whether there are additional results to retrieve. If there are no more results, the value is null.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The names of the rules that can invoke the given target.
     * </p>
     * 
     * @return The names of the rules that can invoke the given target.
     */

    public java.util.List<String> getRuleNames() {
        return ruleNames;
    }

    /**
     * <p>
     * The names of the rules that can invoke the given target.
     * </p>
     * 
     * @param ruleNames
     *        The names of the rules that can invoke the given target.
     */

    public void setRuleNames(java.util.Collection<String> ruleNames) {
        if (ruleNames == null) {
            this.ruleNames = null;
            return;
        }

        this.ruleNames = new java.util.ArrayList<String>(ruleNames);
    }

    /**
     * <p>
     * The names of the rules that can invoke the given target.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRuleNames(java.util.Collection)} or {@link #withRuleNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ruleNames
     *        The names of the rules that can invoke the given target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRuleNamesByTargetResult withRuleNames(String... ruleNames) {
        if (this.ruleNames == null) {
            setRuleNames(new java.util.ArrayList<String>(ruleNames.length));
        }
        for (String ele : ruleNames) {
            this.ruleNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the rules that can invoke the given target.
     * </p>
     * 
     * @param ruleNames
     *        The names of the rules that can invoke the given target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRuleNamesByTargetResult withRuleNames(java.util.Collection<String> ruleNames) {
        setRuleNames(ruleNames);
        return this;
    }

    /**
     * <p>
     * Indicates whether there are additional results to retrieve. If there are no more results, the value is null.
     * </p>
     * 
     * @param nextToken
     *        Indicates whether there are additional results to retrieve. If there are no more results, the value is
     *        null.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Indicates whether there are additional results to retrieve. If there are no more results, the value is null.
     * </p>
     * 
     * @return Indicates whether there are additional results to retrieve. If there are no more results, the value is
     *         null.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Indicates whether there are additional results to retrieve. If there are no more results, the value is null.
     * </p>
     * 
     * @param nextToken
     *        Indicates whether there are additional results to retrieve. If there are no more results, the value is
     *        null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRuleNamesByTargetResult withNextToken(String nextToken) {
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
        if (getRuleNames() != null)
            sb.append("RuleNames: ").append(getRuleNames()).append(",");
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

        if (obj instanceof ListRuleNamesByTargetResult == false)
            return false;
        ListRuleNamesByTargetResult other = (ListRuleNamesByTargetResult) obj;
        if (other.getRuleNames() == null ^ this.getRuleNames() == null)
            return false;
        if (other.getRuleNames() != null && other.getRuleNames().equals(this.getRuleNames()) == false)
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

        hashCode = prime * hashCode + ((getRuleNames() == null) ? 0 : getRuleNames().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListRuleNamesByTargetResult clone() {
        try {
            return (ListRuleNamesByTargetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
