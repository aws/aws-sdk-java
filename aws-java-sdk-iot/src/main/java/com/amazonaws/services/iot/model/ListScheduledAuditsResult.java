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

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListScheduledAuditsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of scheduled audits.
     * </p>
     */
    private java.util.List<ScheduledAuditMetadata> scheduledAudits;
    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or <code>null</code> if there are no additional
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of scheduled audits.
     * </p>
     * 
     * @return The list of scheduled audits.
     */

    public java.util.List<ScheduledAuditMetadata> getScheduledAudits() {
        return scheduledAudits;
    }

    /**
     * <p>
     * The list of scheduled audits.
     * </p>
     * 
     * @param scheduledAudits
     *        The list of scheduled audits.
     */

    public void setScheduledAudits(java.util.Collection<ScheduledAuditMetadata> scheduledAudits) {
        if (scheduledAudits == null) {
            this.scheduledAudits = null;
            return;
        }

        this.scheduledAudits = new java.util.ArrayList<ScheduledAuditMetadata>(scheduledAudits);
    }

    /**
     * <p>
     * The list of scheduled audits.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScheduledAudits(java.util.Collection)} or {@link #withScheduledAudits(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param scheduledAudits
     *        The list of scheduled audits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListScheduledAuditsResult withScheduledAudits(ScheduledAuditMetadata... scheduledAudits) {
        if (this.scheduledAudits == null) {
            setScheduledAudits(new java.util.ArrayList<ScheduledAuditMetadata>(scheduledAudits.length));
        }
        for (ScheduledAuditMetadata ele : scheduledAudits) {
            this.scheduledAudits.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of scheduled audits.
     * </p>
     * 
     * @param scheduledAudits
     *        The list of scheduled audits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListScheduledAuditsResult withScheduledAudits(java.util.Collection<ScheduledAuditMetadata> scheduledAudits) {
        setScheduledAudits(scheduledAudits);
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

    public ListScheduledAuditsResult withNextToken(String nextToken) {
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
        if (getScheduledAudits() != null)
            sb.append("ScheduledAudits: ").append(getScheduledAudits()).append(",");
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

        if (obj instanceof ListScheduledAuditsResult == false)
            return false;
        ListScheduledAuditsResult other = (ListScheduledAuditsResult) obj;
        if (other.getScheduledAudits() == null ^ this.getScheduledAudits() == null)
            return false;
        if (other.getScheduledAudits() != null && other.getScheduledAudits().equals(this.getScheduledAudits()) == false)
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

        hashCode = prime * hashCode + ((getScheduledAudits() == null) ? 0 : getScheduledAudits().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListScheduledAuditsResult clone() {
        try {
            return (ListScheduledAuditsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
