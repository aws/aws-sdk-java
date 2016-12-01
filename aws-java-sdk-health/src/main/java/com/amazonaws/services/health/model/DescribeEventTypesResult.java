/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.health.model;

import java.io.Serializable;

/**
 * 
 */
public class DescribeEventTypesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * List of event types to be matched with.
     * </p>
     */
    private java.util.List<EventType> eventTypes;
    /**
     * <p>
     * If the results of a search are large, only a portion of the results are returned, and a <code>nextToken</code>
     * pagination token is returned in the response. To retrieve the next batch of results, reissue the search request
     * and include the returned token. When all results have been returned, the response does not contain a pagination
     * token value.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of event types to be matched with.
     * </p>
     * 
     * @return List of event types to be matched with.
     */

    public java.util.List<EventType> getEventTypes() {
        return eventTypes;
    }

    /**
     * <p>
     * List of event types to be matched with.
     * </p>
     * 
     * @param eventTypes
     *        List of event types to be matched with.
     */

    public void setEventTypes(java.util.Collection<EventType> eventTypes) {
        if (eventTypes == null) {
            this.eventTypes = null;
            return;
        }

        this.eventTypes = new java.util.ArrayList<EventType>(eventTypes);
    }

    /**
     * <p>
     * List of event types to be matched with.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventTypes(java.util.Collection)} or {@link #withEventTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param eventTypes
     *        List of event types to be matched with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventTypesResult withEventTypes(EventType... eventTypes) {
        if (this.eventTypes == null) {
            setEventTypes(new java.util.ArrayList<EventType>(eventTypes.length));
        }
        for (EventType ele : eventTypes) {
            this.eventTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of event types to be matched with.
     * </p>
     * 
     * @param eventTypes
     *        List of event types to be matched with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventTypesResult withEventTypes(java.util.Collection<EventType> eventTypes) {
        setEventTypes(eventTypes);
        return this;
    }

    /**
     * <p>
     * If the results of a search are large, only a portion of the results are returned, and a <code>nextToken</code>
     * pagination token is returned in the response. To retrieve the next batch of results, reissue the search request
     * and include the returned token. When all results have been returned, the response does not contain a pagination
     * token value.
     * </p>
     * 
     * @param nextToken
     *        If the results of a search are large, only a portion of the results are returned, and a
     *        <code>nextToken</code> pagination token is returned in the response. To retrieve the next batch of
     *        results, reissue the search request and include the returned token. When all results have been returned,
     *        the response does not contain a pagination token value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the results of a search are large, only a portion of the results are returned, and a <code>nextToken</code>
     * pagination token is returned in the response. To retrieve the next batch of results, reissue the search request
     * and include the returned token. When all results have been returned, the response does not contain a pagination
     * token value.
     * </p>
     * 
     * @return If the results of a search are large, only a portion of the results are returned, and a
     *         <code>nextToken</code> pagination token is returned in the response. To retrieve the next batch of
     *         results, reissue the search request and include the returned token. When all results have been returned,
     *         the response does not contain a pagination token value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the results of a search are large, only a portion of the results are returned, and a <code>nextToken</code>
     * pagination token is returned in the response. To retrieve the next batch of results, reissue the search request
     * and include the returned token. When all results have been returned, the response does not contain a pagination
     * token value.
     * </p>
     * 
     * @param nextToken
     *        If the results of a search are large, only a portion of the results are returned, and a
     *        <code>nextToken</code> pagination token is returned in the response. To retrieve the next batch of
     *        results, reissue the search request and include the returned token. When all results have been returned,
     *        the response does not contain a pagination token value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventTypesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEventTypes() != null)
            sb.append("EventTypes: " + getEventTypes() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEventTypesResult == false)
            return false;
        DescribeEventTypesResult other = (DescribeEventTypesResult) obj;
        if (other.getEventTypes() == null ^ this.getEventTypes() == null)
            return false;
        if (other.getEventTypes() != null && other.getEventTypes().equals(this.getEventTypes()) == false)
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

        hashCode = prime * hashCode + ((getEventTypes() == null) ? 0 : getEventTypes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEventTypesResult clone() {
        try {
            return (DescribeEventTypesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
