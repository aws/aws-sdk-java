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

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAuditSuppressionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of audit suppressions.
     * </p>
     */
    private java.util.List<AuditSuppression> suppressions;
    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or <code>null</code> if there are no additional
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of audit suppressions.
     * </p>
     * 
     * @return List of audit suppressions.
     */

    public java.util.List<AuditSuppression> getSuppressions() {
        return suppressions;
    }

    /**
     * <p>
     * List of audit suppressions.
     * </p>
     * 
     * @param suppressions
     *        List of audit suppressions.
     */

    public void setSuppressions(java.util.Collection<AuditSuppression> suppressions) {
        if (suppressions == null) {
            this.suppressions = null;
            return;
        }

        this.suppressions = new java.util.ArrayList<AuditSuppression>(suppressions);
    }

    /**
     * <p>
     * List of audit suppressions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuppressions(java.util.Collection)} or {@link #withSuppressions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param suppressions
     *        List of audit suppressions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAuditSuppressionsResult withSuppressions(AuditSuppression... suppressions) {
        if (this.suppressions == null) {
            setSuppressions(new java.util.ArrayList<AuditSuppression>(suppressions.length));
        }
        for (AuditSuppression ele : suppressions) {
            this.suppressions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of audit suppressions.
     * </p>
     * 
     * @param suppressions
     *        List of audit suppressions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAuditSuppressionsResult withSuppressions(java.util.Collection<AuditSuppression> suppressions) {
        setSuppressions(suppressions);
        return this;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or <code>null</code> if there are no additional
     * results.
     * </p>
     * 
     * @param nextToken
     *        A token that can be used to retrieve the next set of results, or <code>null</code> if there are no
     *        additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or <code>null</code> if there are no additional
     * results.
     * </p>
     * 
     * @return A token that can be used to retrieve the next set of results, or <code>null</code> if there are no
     *         additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or <code>null</code> if there are no additional
     * results.
     * </p>
     * 
     * @param nextToken
     *        A token that can be used to retrieve the next set of results, or <code>null</code> if there are no
     *        additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAuditSuppressionsResult withNextToken(String nextToken) {
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
        if (getSuppressions() != null)
            sb.append("Suppressions: ").append(getSuppressions()).append(",");
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

        if (obj instanceof ListAuditSuppressionsResult == false)
            return false;
        ListAuditSuppressionsResult other = (ListAuditSuppressionsResult) obj;
        if (other.getSuppressions() == null ^ this.getSuppressions() == null)
            return false;
        if (other.getSuppressions() != null && other.getSuppressions().equals(this.getSuppressions()) == false)
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

        hashCode = prime * hashCode + ((getSuppressions() == null) ? 0 : getSuppressions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAuditSuppressionsResult clone() {
        try {
            return (ListAuditSuppressionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
