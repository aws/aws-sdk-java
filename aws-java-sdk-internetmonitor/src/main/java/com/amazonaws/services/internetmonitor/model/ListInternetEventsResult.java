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
package com.amazonaws.services.internetmonitor.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/ListInternetEvents" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInternetEventsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A set of internet events returned for the list operation.
     * </p>
     */
    private java.util.List<InternetEventSummary> internetEvents;
    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A set of internet events returned for the list operation.
     * </p>
     * 
     * @return A set of internet events returned for the list operation.
     */

    public java.util.List<InternetEventSummary> getInternetEvents() {
        return internetEvents;
    }

    /**
     * <p>
     * A set of internet events returned for the list operation.
     * </p>
     * 
     * @param internetEvents
     *        A set of internet events returned for the list operation.
     */

    public void setInternetEvents(java.util.Collection<InternetEventSummary> internetEvents) {
        if (internetEvents == null) {
            this.internetEvents = null;
            return;
        }

        this.internetEvents = new java.util.ArrayList<InternetEventSummary>(internetEvents);
    }

    /**
     * <p>
     * A set of internet events returned for the list operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInternetEvents(java.util.Collection)} or {@link #withInternetEvents(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param internetEvents
     *        A set of internet events returned for the list operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInternetEventsResult withInternetEvents(InternetEventSummary... internetEvents) {
        if (this.internetEvents == null) {
            setInternetEvents(new java.util.ArrayList<InternetEventSummary>(internetEvents.length));
        }
        for (InternetEventSummary ele : internetEvents) {
            this.internetEvents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A set of internet events returned for the list operation.
     * </p>
     * 
     * @param internetEvents
     *        A set of internet events returned for the list operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInternetEventsResult withInternetEvents(java.util.Collection<InternetEventSummary> internetEvents) {
        setInternetEvents(internetEvents);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. You receive this token from a previous call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     * 
     * @return The token for the next set of results. You receive this token from a previous call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results. You receive this token from a previous call.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results. You receive this token from a previous call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInternetEventsResult withNextToken(String nextToken) {
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
        if (getInternetEvents() != null)
            sb.append("InternetEvents: ").append(getInternetEvents()).append(",");
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

        if (obj instanceof ListInternetEventsResult == false)
            return false;
        ListInternetEventsResult other = (ListInternetEventsResult) obj;
        if (other.getInternetEvents() == null ^ this.getInternetEvents() == null)
            return false;
        if (other.getInternetEvents() != null && other.getInternetEvents().equals(this.getInternetEvents()) == false)
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

        hashCode = prime * hashCode + ((getInternetEvents() == null) ? 0 : getInternetEvents().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListInternetEventsResult clone() {
        try {
            return (ListInternetEventsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
