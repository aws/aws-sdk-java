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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/ListEventActions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEventActionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the event source.
     * </p>
     */
    private String eventSourceId;
    /**
     * <p>
     * The maximum number of results returned by a single call.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token value retrieved from a previous call to access the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The unique identifier for the event source.
     * </p>
     * 
     * @param eventSourceId
     *        The unique identifier for the event source.
     */

    public void setEventSourceId(String eventSourceId) {
        this.eventSourceId = eventSourceId;
    }

    /**
     * <p>
     * The unique identifier for the event source.
     * </p>
     * 
     * @return The unique identifier for the event source.
     */

    public String getEventSourceId() {
        return this.eventSourceId;
    }

    /**
     * <p>
     * The unique identifier for the event source.
     * </p>
     * 
     * @param eventSourceId
     *        The unique identifier for the event source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventActionsRequest withEventSourceId(String eventSourceId) {
        setEventSourceId(eventSourceId);
        return this;
    }

    /**
     * <p>
     * The maximum number of results returned by a single call.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results returned by a single call.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results returned by a single call.
     * </p>
     * 
     * @return The maximum number of results returned by a single call.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results returned by a single call.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results returned by a single call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventActionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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

    public ListEventActionsRequest withNextToken(String nextToken) {
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
        if (getEventSourceId() != null)
            sb.append("EventSourceId: ").append(getEventSourceId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListEventActionsRequest == false)
            return false;
        ListEventActionsRequest other = (ListEventActionsRequest) obj;
        if (other.getEventSourceId() == null ^ this.getEventSourceId() == null)
            return false;
        if (other.getEventSourceId() != null && other.getEventSourceId().equals(this.getEventSourceId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getEventSourceId() == null) ? 0 : getEventSourceId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEventActionsRequest clone() {
        return (ListEventActionsRequest) super.clone();
    }

}
