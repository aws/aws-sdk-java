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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListRules" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRulesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Summary information about a rule.
     * </p>
     */
    private java.util.List<RuleSummary> ruleSummaryList;
    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Summary information about a rule.
     * </p>
     * 
     * @return Summary information about a rule.
     */

    public java.util.List<RuleSummary> getRuleSummaryList() {
        return ruleSummaryList;
    }

    /**
     * <p>
     * Summary information about a rule.
     * </p>
     * 
     * @param ruleSummaryList
     *        Summary information about a rule.
     */

    public void setRuleSummaryList(java.util.Collection<RuleSummary> ruleSummaryList) {
        if (ruleSummaryList == null) {
            this.ruleSummaryList = null;
            return;
        }

        this.ruleSummaryList = new java.util.ArrayList<RuleSummary>(ruleSummaryList);
    }

    /**
     * <p>
     * Summary information about a rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRuleSummaryList(java.util.Collection)} or {@link #withRuleSummaryList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param ruleSummaryList
     *        Summary information about a rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRulesResult withRuleSummaryList(RuleSummary... ruleSummaryList) {
        if (this.ruleSummaryList == null) {
            setRuleSummaryList(new java.util.ArrayList<RuleSummary>(ruleSummaryList.length));
        }
        for (RuleSummary ele : ruleSummaryList) {
            this.ruleSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Summary information about a rule.
     * </p>
     * 
     * @param ruleSummaryList
     *        Summary information about a rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRulesResult withRuleSummaryList(java.util.Collection<RuleSummary> ruleSummaryList) {
        setRuleSummaryList(ruleSummaryList);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @return If there are additional results, this is the token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        If there are additional results, this is the token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRulesResult withNextToken(String nextToken) {
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
        if (getRuleSummaryList() != null)
            sb.append("RuleSummaryList: ").append(getRuleSummaryList()).append(",");
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

        if (obj instanceof ListRulesResult == false)
            return false;
        ListRulesResult other = (ListRulesResult) obj;
        if (other.getRuleSummaryList() == null ^ this.getRuleSummaryList() == null)
            return false;
        if (other.getRuleSummaryList() != null && other.getRuleSummaryList().equals(this.getRuleSummaryList()) == false)
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

        hashCode = prime * hashCode + ((getRuleSummaryList() == null) ? 0 : getRuleSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
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
