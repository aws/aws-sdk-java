/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53recoveryreadiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ListRules"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRulesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token that identifies which batch of results you want to see.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of readiness rules for a specific resource type.
     * </p>
     */
    private java.util.List<ListRulesOutput> rules;

    /**
     * <p>
     * The token that identifies which batch of results you want to see.
     * </p>
     * 
     * @param nextToken
     *        The token that identifies which batch of results you want to see.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that identifies which batch of results you want to see.
     * </p>
     * 
     * @return The token that identifies which batch of results you want to see.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token that identifies which batch of results you want to see.
     * </p>
     * 
     * @param nextToken
     *        The token that identifies which batch of results you want to see.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRulesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of readiness rules for a specific resource type.
     * </p>
     * 
     * @return A list of readiness rules for a specific resource type.
     */

    public java.util.List<ListRulesOutput> getRules() {
        return rules;
    }

    /**
     * <p>
     * A list of readiness rules for a specific resource type.
     * </p>
     * 
     * @param rules
     *        A list of readiness rules for a specific resource type.
     */

    public void setRules(java.util.Collection<ListRulesOutput> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<ListRulesOutput>(rules);
    }

    /**
     * <p>
     * A list of readiness rules for a specific resource type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        A list of readiness rules for a specific resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRulesResult withRules(ListRulesOutput... rules) {
        if (this.rules == null) {
            setRules(new java.util.ArrayList<ListRulesOutput>(rules.length));
        }
        for (ListRulesOutput ele : rules) {
            this.rules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of readiness rules for a specific resource type.
     * </p>
     * 
     * @param rules
     *        A list of readiness rules for a specific resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRulesResult withRules(java.util.Collection<ListRulesOutput> rules) {
        setRules(rules);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getRules() != null)
            sb.append("Rules: ").append(getRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRulesResult == false)
            return false;
        ListRulesResult other = (ListRulesResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        return hashCode;
    }

    @Override
    public ListRulesResult clone() {
        try {
            return (ListRulesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
