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
package com.amazonaws.services.ivsrealtime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/ListParticipantEvents" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListParticipantEventsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of the matching events.
     * </p>
     */
    private java.util.List<Event> events;
    /**
     * <p>
     * If there are more events than <code>maxResults</code>, use <code>nextToken</code> in the request to get the next
     * set.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of the matching events.
     * </p>
     * 
     * @return List of the matching events.
     */

    public java.util.List<Event> getEvents() {
        return events;
    }

    /**
     * <p>
     * List of the matching events.
     * </p>
     * 
     * @param events
     *        List of the matching events.
     */

    public void setEvents(java.util.Collection<Event> events) {
        if (events == null) {
            this.events = null;
            return;
        }

        this.events = new java.util.ArrayList<Event>(events);
    }

    /**
     * <p>
     * List of the matching events.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvents(java.util.Collection)} or {@link #withEvents(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param events
     *        List of the matching events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListParticipantEventsResult withEvents(Event... events) {
        if (this.events == null) {
            setEvents(new java.util.ArrayList<Event>(events.length));
        }
        for (Event ele : events) {
            this.events.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of the matching events.
     * </p>
     * 
     * @param events
     *        List of the matching events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListParticipantEventsResult withEvents(java.util.Collection<Event> events) {
        setEvents(events);
        return this;
    }

    /**
     * <p>
     * If there are more events than <code>maxResults</code>, use <code>nextToken</code> in the request to get the next
     * set.
     * </p>
     * 
     * @param nextToken
     *        If there are more events than <code>maxResults</code>, use <code>nextToken</code> in the request to get
     *        the next set.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are more events than <code>maxResults</code>, use <code>nextToken</code> in the request to get the next
     * set.
     * </p>
     * 
     * @return If there are more events than <code>maxResults</code>, use <code>nextToken</code> in the request to get
     *         the next set.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If there are more events than <code>maxResults</code>, use <code>nextToken</code> in the request to get the next
     * set.
     * </p>
     * 
     * @param nextToken
     *        If there are more events than <code>maxResults</code>, use <code>nextToken</code> in the request to get
     *        the next set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListParticipantEventsResult withNextToken(String nextToken) {
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
        if (getEvents() != null)
            sb.append("Events: ").append(getEvents()).append(",");
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

        if (obj instanceof ListParticipantEventsResult == false)
            return false;
        ListParticipantEventsResult other = (ListParticipantEventsResult) obj;
        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false)
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

        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListParticipantEventsResult clone() {
        try {
            return (ListParticipantEventsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
