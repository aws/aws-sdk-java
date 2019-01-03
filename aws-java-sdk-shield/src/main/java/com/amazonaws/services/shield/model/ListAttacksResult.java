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
package com.amazonaws.services.shield.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/ListAttacks" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAttacksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The attack information for the specified time range.
     * </p>
     */
    private java.util.List<AttackSummary> attackSummaries;
    /**
     * <p>
     * The token returned by a previous call to indicate that there is more data available. If not null, more results
     * are available. Pass this value for the <code>NextMarker</code> parameter in a subsequent call to
     * <code>ListAttacks</code> to retrieve the next set of items.
     * </p>
     * <p>
     * AWS WAF might return the list of <a>AttackSummary</a> objects in batches smaller than the number specified by
     * MaxResults. If there are more <a>AttackSummary</a> objects to return, AWS WAF will always also return a
     * <code>NextToken</code>.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The attack information for the specified time range.
     * </p>
     * 
     * @return The attack information for the specified time range.
     */

    public java.util.List<AttackSummary> getAttackSummaries() {
        return attackSummaries;
    }

    /**
     * <p>
     * The attack information for the specified time range.
     * </p>
     * 
     * @param attackSummaries
     *        The attack information for the specified time range.
     */

    public void setAttackSummaries(java.util.Collection<AttackSummary> attackSummaries) {
        if (attackSummaries == null) {
            this.attackSummaries = null;
            return;
        }

        this.attackSummaries = new java.util.ArrayList<AttackSummary>(attackSummaries);
    }

    /**
     * <p>
     * The attack information for the specified time range.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttackSummaries(java.util.Collection)} or {@link #withAttackSummaries(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param attackSummaries
     *        The attack information for the specified time range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAttacksResult withAttackSummaries(AttackSummary... attackSummaries) {
        if (this.attackSummaries == null) {
            setAttackSummaries(new java.util.ArrayList<AttackSummary>(attackSummaries.length));
        }
        for (AttackSummary ele : attackSummaries) {
            this.attackSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The attack information for the specified time range.
     * </p>
     * 
     * @param attackSummaries
     *        The attack information for the specified time range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAttacksResult withAttackSummaries(java.util.Collection<AttackSummary> attackSummaries) {
        setAttackSummaries(attackSummaries);
        return this;
    }

    /**
     * <p>
     * The token returned by a previous call to indicate that there is more data available. If not null, more results
     * are available. Pass this value for the <code>NextMarker</code> parameter in a subsequent call to
     * <code>ListAttacks</code> to retrieve the next set of items.
     * </p>
     * <p>
     * AWS WAF might return the list of <a>AttackSummary</a> objects in batches smaller than the number specified by
     * MaxResults. If there are more <a>AttackSummary</a> objects to return, AWS WAF will always also return a
     * <code>NextToken</code>.
     * </p>
     * 
     * @param nextToken
     *        The token returned by a previous call to indicate that there is more data available. If not null, more
     *        results are available. Pass this value for the <code>NextMarker</code> parameter in a subsequent call to
     *        <code>ListAttacks</code> to retrieve the next set of items.</p>
     *        <p>
     *        AWS WAF might return the list of <a>AttackSummary</a> objects in batches smaller than the number specified
     *        by MaxResults. If there are more <a>AttackSummary</a> objects to return, AWS WAF will always also return a
     *        <code>NextToken</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token returned by a previous call to indicate that there is more data available. If not null, more results
     * are available. Pass this value for the <code>NextMarker</code> parameter in a subsequent call to
     * <code>ListAttacks</code> to retrieve the next set of items.
     * </p>
     * <p>
     * AWS WAF might return the list of <a>AttackSummary</a> objects in batches smaller than the number specified by
     * MaxResults. If there are more <a>AttackSummary</a> objects to return, AWS WAF will always also return a
     * <code>NextToken</code>.
     * </p>
     * 
     * @return The token returned by a previous call to indicate that there is more data available. If not null, more
     *         results are available. Pass this value for the <code>NextMarker</code> parameter in a subsequent call to
     *         <code>ListAttacks</code> to retrieve the next set of items.</p>
     *         <p>
     *         AWS WAF might return the list of <a>AttackSummary</a> objects in batches smaller than the number
     *         specified by MaxResults. If there are more <a>AttackSummary</a> objects to return, AWS WAF will always
     *         also return a <code>NextToken</code>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token returned by a previous call to indicate that there is more data available. If not null, more results
     * are available. Pass this value for the <code>NextMarker</code> parameter in a subsequent call to
     * <code>ListAttacks</code> to retrieve the next set of items.
     * </p>
     * <p>
     * AWS WAF might return the list of <a>AttackSummary</a> objects in batches smaller than the number specified by
     * MaxResults. If there are more <a>AttackSummary</a> objects to return, AWS WAF will always also return a
     * <code>NextToken</code>.
     * </p>
     * 
     * @param nextToken
     *        The token returned by a previous call to indicate that there is more data available. If not null, more
     *        results are available. Pass this value for the <code>NextMarker</code> parameter in a subsequent call to
     *        <code>ListAttacks</code> to retrieve the next set of items.</p>
     *        <p>
     *        AWS WAF might return the list of <a>AttackSummary</a> objects in batches smaller than the number specified
     *        by MaxResults. If there are more <a>AttackSummary</a> objects to return, AWS WAF will always also return a
     *        <code>NextToken</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAttacksResult withNextToken(String nextToken) {
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
        if (getAttackSummaries() != null)
            sb.append("AttackSummaries: ").append(getAttackSummaries()).append(",");
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

        if (obj instanceof ListAttacksResult == false)
            return false;
        ListAttacksResult other = (ListAttacksResult) obj;
        if (other.getAttackSummaries() == null ^ this.getAttackSummaries() == null)
            return false;
        if (other.getAttackSummaries() != null && other.getAttackSummaries().equals(this.getAttackSummaries()) == false)
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

        hashCode = prime * hashCode + ((getAttackSummaries() == null) ? 0 : getAttackSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAttacksResult clone() {
        try {
            return (ListAttacksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
