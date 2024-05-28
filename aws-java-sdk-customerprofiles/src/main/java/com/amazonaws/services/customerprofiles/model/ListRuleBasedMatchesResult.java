/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/ListRuleBasedMatches"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRuleBasedMatchesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of <code>MatchIds</code> for the given domain.
     * </p>
     */
    private java.util.List<String> matchIds;
    /**
     * <p>
     * The pagination token from the previous <code>ListRuleBasedMatches</code> API call.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of <code>MatchIds</code> for the given domain.
     * </p>
     * 
     * @return The list of <code>MatchIds</code> for the given domain.
     */

    public java.util.List<String> getMatchIds() {
        return matchIds;
    }

    /**
     * <p>
     * The list of <code>MatchIds</code> for the given domain.
     * </p>
     * 
     * @param matchIds
     *        The list of <code>MatchIds</code> for the given domain.
     */

    public void setMatchIds(java.util.Collection<String> matchIds) {
        if (matchIds == null) {
            this.matchIds = null;
            return;
        }

        this.matchIds = new java.util.ArrayList<String>(matchIds);
    }

    /**
     * <p>
     * The list of <code>MatchIds</code> for the given domain.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMatchIds(java.util.Collection)} or {@link #withMatchIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param matchIds
     *        The list of <code>MatchIds</code> for the given domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRuleBasedMatchesResult withMatchIds(String... matchIds) {
        if (this.matchIds == null) {
            setMatchIds(new java.util.ArrayList<String>(matchIds.length));
        }
        for (String ele : matchIds) {
            this.matchIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of <code>MatchIds</code> for the given domain.
     * </p>
     * 
     * @param matchIds
     *        The list of <code>MatchIds</code> for the given domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRuleBasedMatchesResult withMatchIds(java.util.Collection<String> matchIds) {
        setMatchIds(matchIds);
        return this;
    }

    /**
     * <p>
     * The pagination token from the previous <code>ListRuleBasedMatches</code> API call.
     * </p>
     * 
     * @param nextToken
     *        The pagination token from the previous <code>ListRuleBasedMatches</code> API call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token from the previous <code>ListRuleBasedMatches</code> API call.
     * </p>
     * 
     * @return The pagination token from the previous <code>ListRuleBasedMatches</code> API call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token from the previous <code>ListRuleBasedMatches</code> API call.
     * </p>
     * 
     * @param nextToken
     *        The pagination token from the previous <code>ListRuleBasedMatches</code> API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRuleBasedMatchesResult withNextToken(String nextToken) {
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
        if (getMatchIds() != null)
            sb.append("MatchIds: ").append(getMatchIds()).append(",");
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

        if (obj instanceof ListRuleBasedMatchesResult == false)
            return false;
        ListRuleBasedMatchesResult other = (ListRuleBasedMatchesResult) obj;
        if (other.getMatchIds() == null ^ this.getMatchIds() == null)
            return false;
        if (other.getMatchIds() != null && other.getMatchIds().equals(this.getMatchIds()) == false)
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

        hashCode = prime * hashCode + ((getMatchIds() == null) ? 0 : getMatchIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListRuleBasedMatchesResult clone() {
        try {
            return (ListRuleBasedMatchesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
