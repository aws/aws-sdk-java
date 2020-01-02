/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/GetRules" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRulesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The details of the requested rule.
     * </p>
     */
    private java.util.List<RuleDetail> ruleDetails;
    /**
     * <p>
     * The next page token to be used in subsequent requests.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The details of the requested rule.
     * </p>
     * 
     * @return The details of the requested rule.
     */

    public java.util.List<RuleDetail> getRuleDetails() {
        return ruleDetails;
    }

    /**
     * <p>
     * The details of the requested rule.
     * </p>
     * 
     * @param ruleDetails
     *        The details of the requested rule.
     */

    public void setRuleDetails(java.util.Collection<RuleDetail> ruleDetails) {
        if (ruleDetails == null) {
            this.ruleDetails = null;
            return;
        }

        this.ruleDetails = new java.util.ArrayList<RuleDetail>(ruleDetails);
    }

    /**
     * <p>
     * The details of the requested rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRuleDetails(java.util.Collection)} or {@link #withRuleDetails(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ruleDetails
     *        The details of the requested rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRulesResult withRuleDetails(RuleDetail... ruleDetails) {
        if (this.ruleDetails == null) {
            setRuleDetails(new java.util.ArrayList<RuleDetail>(ruleDetails.length));
        }
        for (RuleDetail ele : ruleDetails) {
            this.ruleDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The details of the requested rule.
     * </p>
     * 
     * @param ruleDetails
     *        The details of the requested rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRulesResult withRuleDetails(java.util.Collection<RuleDetail> ruleDetails) {
        setRuleDetails(ruleDetails);
        return this;
    }

    /**
     * <p>
     * The next page token to be used in subsequent requests.
     * </p>
     * 
     * @param nextToken
     *        The next page token to be used in subsequent requests.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next page token to be used in subsequent requests.
     * </p>
     * 
     * @return The next page token to be used in subsequent requests.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next page token to be used in subsequent requests.
     * </p>
     * 
     * @param nextToken
     *        The next page token to be used in subsequent requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRulesResult withNextToken(String nextToken) {
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
        if (getRuleDetails() != null)
            sb.append("RuleDetails: ").append(getRuleDetails()).append(",");
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

        if (obj instanceof GetRulesResult == false)
            return false;
        GetRulesResult other = (GetRulesResult) obj;
        if (other.getRuleDetails() == null ^ this.getRuleDetails() == null)
            return false;
        if (other.getRuleDetails() != null && other.getRuleDetails().equals(this.getRuleDetails()) == false)
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

        hashCode = prime * hashCode + ((getRuleDetails() == null) ? 0 : getRuleDetails().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetRulesResult clone() {
        try {
            return (GetRulesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
