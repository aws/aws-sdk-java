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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/ListTimelineEvents" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTimelineEventsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Details about each event that occurred during the incident.
     * </p>
     */
    private java.util.List<EventSummary> eventSummaries;
    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Details about each event that occurred during the incident.
     * </p>
     * 
     * @return Details about each event that occurred during the incident.
     */

    public java.util.List<EventSummary> getEventSummaries() {
        return eventSummaries;
    }

    /**
     * <p>
     * Details about each event that occurred during the incident.
     * </p>
     * 
     * @param eventSummaries
     *        Details about each event that occurred during the incident.
     */

    public void setEventSummaries(java.util.Collection<EventSummary> eventSummaries) {
        if (eventSummaries == null) {
            this.eventSummaries = null;
            return;
        }

        this.eventSummaries = new java.util.ArrayList<EventSummary>(eventSummaries);
    }

    /**
     * <p>
     * Details about each event that occurred during the incident.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventSummaries(java.util.Collection)} or {@link #withEventSummaries(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param eventSummaries
     *        Details about each event that occurred during the incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTimelineEventsResult withEventSummaries(EventSummary... eventSummaries) {
        if (this.eventSummaries == null) {
            setEventSummaries(new java.util.ArrayList<EventSummary>(eventSummaries.length));
        }
        for (EventSummary ele : eventSummaries) {
            this.eventSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details about each event that occurred during the incident.
     * </p>
     * 
     * @param eventSummaries
     *        Details about each event that occurred during the incident.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTimelineEventsResult withEventSummaries(java.util.Collection<EventSummary> eventSummaries) {
        setEventSummaries(eventSummaries);
        return this;
    }

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to continue to the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     * 
     * @return The pagination token to continue to the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token to continue to the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The pagination token to continue to the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTimelineEventsResult withNextToken(String nextToken) {
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
        if (getEventSummaries() != null)
            sb.append("EventSummaries: ").append(getEventSummaries()).append(",");
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

        if (obj instanceof ListTimelineEventsResult == false)
            return false;
        ListTimelineEventsResult other = (ListTimelineEventsResult) obj;
        if (other.getEventSummaries() == null ^ this.getEventSummaries() == null)
            return false;
        if (other.getEventSummaries() != null && other.getEventSummaries().equals(this.getEventSummaries()) == false)
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

        hashCode = prime * hashCode + ((getEventSummaries() == null) ? 0 : getEventSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTimelineEventsResult clone() {
        try {
            return (ListTimelineEventsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
