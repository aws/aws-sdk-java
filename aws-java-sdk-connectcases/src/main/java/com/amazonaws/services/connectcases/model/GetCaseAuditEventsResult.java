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
package com.amazonaws.services.connectcases.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/GetCaseAuditEvents" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCaseAuditEventsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of case audits where each represents a particular edit of the case.
     * </p>
     */
    private java.util.List<AuditEvent> auditEvents;
    /**
     * <p>
     * The token for the next set of results. This is null if there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of case audits where each represents a particular edit of the case.
     * </p>
     * 
     * @return A list of case audits where each represents a particular edit of the case.
     */

    public java.util.List<AuditEvent> getAuditEvents() {
        return auditEvents;
    }

    /**
     * <p>
     * A list of case audits where each represents a particular edit of the case.
     * </p>
     * 
     * @param auditEvents
     *        A list of case audits where each represents a particular edit of the case.
     */

    public void setAuditEvents(java.util.Collection<AuditEvent> auditEvents) {
        if (auditEvents == null) {
            this.auditEvents = null;
            return;
        }

        this.auditEvents = new java.util.ArrayList<AuditEvent>(auditEvents);
    }

    /**
     * <p>
     * A list of case audits where each represents a particular edit of the case.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAuditEvents(java.util.Collection)} or {@link #withAuditEvents(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param auditEvents
     *        A list of case audits where each represents a particular edit of the case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCaseAuditEventsResult withAuditEvents(AuditEvent... auditEvents) {
        if (this.auditEvents == null) {
            setAuditEvents(new java.util.ArrayList<AuditEvent>(auditEvents.length));
        }
        for (AuditEvent ele : auditEvents) {
            this.auditEvents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of case audits where each represents a particular edit of the case.
     * </p>
     * 
     * @param auditEvents
     *        A list of case audits where each represents a particular edit of the case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCaseAuditEventsResult withAuditEvents(java.util.Collection<AuditEvent> auditEvents) {
        setAuditEvents(auditEvents);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. This is null if there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. This is null if there are no more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. This is null if there are no more results to return.
     * </p>
     * 
     * @return The token for the next set of results. This is null if there are no more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. This is null if there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. This is null if there are no more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCaseAuditEventsResult withNextToken(String nextToken) {
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
        if (getAuditEvents() != null)
            sb.append("AuditEvents: ").append(getAuditEvents()).append(",");
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

        if (obj instanceof GetCaseAuditEventsResult == false)
            return false;
        GetCaseAuditEventsResult other = (GetCaseAuditEventsResult) obj;
        if (other.getAuditEvents() == null ^ this.getAuditEvents() == null)
            return false;
        if (other.getAuditEvents() != null && other.getAuditEvents().equals(this.getAuditEvents()) == false)
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

        hashCode = prime * hashCode + ((getAuditEvents() == null) ? 0 : getAuditEvents().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetCaseAuditEventsResult clone() {
        try {
            return (GetCaseAuditEventsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
