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
package com.amazonaws.services.health.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeEventAggregates" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEventAggregatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The number of events in each category that meet the optional filter criteria.
     * </p>
     */
    private java.util.List<EventAggregate> eventAggregates;
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
     * The number of events in each category that meet the optional filter criteria.
     * </p>
     * 
     * @return The number of events in each category that meet the optional filter criteria.
     */

    public java.util.List<EventAggregate> getEventAggregates() {
        return eventAggregates;
    }

    /**
     * <p>
     * The number of events in each category that meet the optional filter criteria.
     * </p>
     * 
     * @param eventAggregates
     *        The number of events in each category that meet the optional filter criteria.
     */

    public void setEventAggregates(java.util.Collection<EventAggregate> eventAggregates) {
        if (eventAggregates == null) {
            this.eventAggregates = null;
            return;
        }

        this.eventAggregates = new java.util.ArrayList<EventAggregate>(eventAggregates);
    }

    /**
     * <p>
     * The number of events in each category that meet the optional filter criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventAggregates(java.util.Collection)} or {@link #withEventAggregates(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param eventAggregates
     *        The number of events in each category that meet the optional filter criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventAggregatesResult withEventAggregates(EventAggregate... eventAggregates) {
        if (this.eventAggregates == null) {
            setEventAggregates(new java.util.ArrayList<EventAggregate>(eventAggregates.length));
        }
        for (EventAggregate ele : eventAggregates) {
            this.eventAggregates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The number of events in each category that meet the optional filter criteria.
     * </p>
     * 
     * @param eventAggregates
     *        The number of events in each category that meet the optional filter criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventAggregatesResult withEventAggregates(java.util.Collection<EventAggregate> eventAggregates) {
        setEventAggregates(eventAggregates);
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

    public DescribeEventAggregatesResult withNextToken(String nextToken) {
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
        if (getEventAggregates() != null)
            sb.append("EventAggregates: ").append(getEventAggregates()).append(",");
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

        if (obj instanceof DescribeEventAggregatesResult == false)
            return false;
        DescribeEventAggregatesResult other = (DescribeEventAggregatesResult) obj;
        if (other.getEventAggregates() == null ^ this.getEventAggregates() == null)
            return false;
        if (other.getEventAggregates() != null && other.getEventAggregates().equals(this.getEventAggregates()) == false)
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

        hashCode = prime * hashCode + ((getEventAggregates() == null) ? 0 : getEventAggregates().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEventAggregatesResult clone() {
        try {
            return (DescribeEventAggregatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
