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
package com.amazonaws.services.dataexchange.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/ListEventActions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEventActionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The event action objects listed by the request.
     * </p>
     */
    private java.util.List<EventActionEntry> eventActions;
    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The event action objects listed by the request.
     * </p>
     * 
     * @return The event action objects listed by the request.
     */

    public java.util.List<EventActionEntry> getEventActions() {
        return eventActions;
    }

    /**
     * <p>
     * The event action objects listed by the request.
     * </p>
     * 
     * @param eventActions
     *        The event action objects listed by the request.
     */

    public void setEventActions(java.util.Collection<EventActionEntry> eventActions) {
        if (eventActions == null) {
            this.eventActions = null;
            return;
        }

        this.eventActions = new java.util.ArrayList<EventActionEntry>(eventActions);
    }

    /**
     * <p>
     * The event action objects listed by the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventActions(java.util.Collection)} or {@link #withEventActions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param eventActions
     *        The event action objects listed by the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventActionsResult withEventActions(EventActionEntry... eventActions) {
        if (this.eventActions == null) {
            setEventActions(new java.util.ArrayList<EventActionEntry>(eventActions.length));
        }
        for (EventActionEntry ele : eventActions) {
            this.eventActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The event action objects listed by the request.
     * </p>
     * 
     * @param eventActions
     *        The event action objects listed by the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventActionsResult withEventActions(java.util.Collection<EventActionEntry> eventActions) {
        setEventActions(eventActions);
        return this;
    }

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token value retrieved from a previous call to access the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     * 
     * @return The token value retrieved from a previous call to access the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token value retrieved from a previous call to access the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventActionsResult withNextToken(String nextToken) {
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
        if (getEventActions() != null)
            sb.append("EventActions: ").append(getEventActions()).append(",");
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

        if (obj instanceof ListEventActionsResult == false)
            return false;
        ListEventActionsResult other = (ListEventActionsResult) obj;
        if (other.getEventActions() == null ^ this.getEventActions() == null)
            return false;
        if (other.getEventActions() != null && other.getEventActions().equals(this.getEventActions()) == false)
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

        hashCode = prime * hashCode + ((getEventActions() == null) ? 0 : getEventActions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEventActionsResult clone() {
        try {
            return (ListEventActionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
