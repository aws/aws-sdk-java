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
package com.amazonaws.services.ssmsap.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/ListOperationEvents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListOperationEventsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A returned list of operation events that meet the filter criteria.
     * </p>
     */
    private java.util.List<OperationEvent> operationEvents;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A returned list of operation events that meet the filter criteria.
     * </p>
     * 
     * @return A returned list of operation events that meet the filter criteria.
     */

    public java.util.List<OperationEvent> getOperationEvents() {
        return operationEvents;
    }

    /**
     * <p>
     * A returned list of operation events that meet the filter criteria.
     * </p>
     * 
     * @param operationEvents
     *        A returned list of operation events that meet the filter criteria.
     */

    public void setOperationEvents(java.util.Collection<OperationEvent> operationEvents) {
        if (operationEvents == null) {
            this.operationEvents = null;
            return;
        }

        this.operationEvents = new java.util.ArrayList<OperationEvent>(operationEvents);
    }

    /**
     * <p>
     * A returned list of operation events that meet the filter criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOperationEvents(java.util.Collection)} or {@link #withOperationEvents(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param operationEvents
     *        A returned list of operation events that meet the filter criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOperationEventsResult withOperationEvents(OperationEvent... operationEvents) {
        if (this.operationEvents == null) {
            setOperationEvents(new java.util.ArrayList<OperationEvent>(operationEvents.length));
        }
        for (OperationEvent ele : operationEvents) {
            this.operationEvents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A returned list of operation events that meet the filter criteria.
     * </p>
     * 
     * @param operationEvents
     *        A returned list of operation events that meet the filter criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOperationEventsResult withOperationEvents(java.util.Collection<OperationEvent> operationEvents) {
        setOperationEvents(operationEvents);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is null when there are no more results
     *        to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value is null when there are no more results
     *         to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is null when there are no more results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is null when there are no more results
     *        to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOperationEventsResult withNextToken(String nextToken) {
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
        if (getOperationEvents() != null)
            sb.append("OperationEvents: ").append(getOperationEvents()).append(",");
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

        if (obj instanceof ListOperationEventsResult == false)
            return false;
        ListOperationEventsResult other = (ListOperationEventsResult) obj;
        if (other.getOperationEvents() == null ^ this.getOperationEvents() == null)
            return false;
        if (other.getOperationEvents() != null && other.getOperationEvents().equals(this.getOperationEvents()) == false)
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

        hashCode = prime * hashCode + ((getOperationEvents() == null) ? 0 : getOperationEvents().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListOperationEventsResult clone() {
        try {
            return (ListOperationEventsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
