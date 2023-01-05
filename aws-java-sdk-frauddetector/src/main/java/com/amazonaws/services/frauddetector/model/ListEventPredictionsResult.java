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
package com.amazonaws.services.frauddetector.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/frauddetector-2019-11-15/ListEventPredictions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEventPredictionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The summary of the past predictions.
     * </p>
     */
    private java.util.List<EventPredictionSummary> eventPredictionSummaries;
    /**
     * <p>
     * Identifies the next page of results to return. Use the token to make the call again to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The summary of the past predictions.
     * </p>
     * 
     * @return The summary of the past predictions.
     */

    public java.util.List<EventPredictionSummary> getEventPredictionSummaries() {
        return eventPredictionSummaries;
    }

    /**
     * <p>
     * The summary of the past predictions.
     * </p>
     * 
     * @param eventPredictionSummaries
     *        The summary of the past predictions.
     */

    public void setEventPredictionSummaries(java.util.Collection<EventPredictionSummary> eventPredictionSummaries) {
        if (eventPredictionSummaries == null) {
            this.eventPredictionSummaries = null;
            return;
        }

        this.eventPredictionSummaries = new java.util.ArrayList<EventPredictionSummary>(eventPredictionSummaries);
    }

    /**
     * <p>
     * The summary of the past predictions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventPredictionSummaries(java.util.Collection)} or
     * {@link #withEventPredictionSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param eventPredictionSummaries
     *        The summary of the past predictions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventPredictionsResult withEventPredictionSummaries(EventPredictionSummary... eventPredictionSummaries) {
        if (this.eventPredictionSummaries == null) {
            setEventPredictionSummaries(new java.util.ArrayList<EventPredictionSummary>(eventPredictionSummaries.length));
        }
        for (EventPredictionSummary ele : eventPredictionSummaries) {
            this.eventPredictionSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The summary of the past predictions.
     * </p>
     * 
     * @param eventPredictionSummaries
     *        The summary of the past predictions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventPredictionsResult withEventPredictionSummaries(java.util.Collection<EventPredictionSummary> eventPredictionSummaries) {
        setEventPredictionSummaries(eventPredictionSummaries);
        return this;
    }

    /**
     * <p>
     * Identifies the next page of results to return. Use the token to make the call again to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours.
     * </p>
     * 
     * @param nextToken
     *        Identifies the next page of results to return. Use the token to make the call again to retrieve the next
     *        page. Keep all other arguments unchanged. Each pagination token expires after 24 hours.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Identifies the next page of results to return. Use the token to make the call again to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours.
     * </p>
     * 
     * @return Identifies the next page of results to return. Use the token to make the call again to retrieve the next
     *         page. Keep all other arguments unchanged. Each pagination token expires after 24 hours.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Identifies the next page of results to return. Use the token to make the call again to retrieve the next page.
     * Keep all other arguments unchanged. Each pagination token expires after 24 hours.
     * </p>
     * 
     * @param nextToken
     *        Identifies the next page of results to return. Use the token to make the call again to retrieve the next
     *        page. Keep all other arguments unchanged. Each pagination token expires after 24 hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventPredictionsResult withNextToken(String nextToken) {
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
        if (getEventPredictionSummaries() != null)
            sb.append("EventPredictionSummaries: ").append(getEventPredictionSummaries()).append(",");
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

        if (obj instanceof ListEventPredictionsResult == false)
            return false;
        ListEventPredictionsResult other = (ListEventPredictionsResult) obj;
        if (other.getEventPredictionSummaries() == null ^ this.getEventPredictionSummaries() == null)
            return false;
        if (other.getEventPredictionSummaries() != null && other.getEventPredictionSummaries().equals(this.getEventPredictionSummaries()) == false)
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

        hashCode = prime * hashCode + ((getEventPredictionSummaries() == null) ? 0 : getEventPredictionSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEventPredictionsResult clone() {
        try {
            return (ListEventPredictionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
