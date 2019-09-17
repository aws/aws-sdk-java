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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/ListEventSources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEventSourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of event sources.
     * </p>
     */
    private java.util.List<EventSource> eventSources;
    /**
     * <p>
     * A token you can use in a subsequent operation to retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of event sources.
     * </p>
     * 
     * @return The list of event sources.
     */

    public java.util.List<EventSource> getEventSources() {
        return eventSources;
    }

    /**
     * <p>
     * The list of event sources.
     * </p>
     * 
     * @param eventSources
     *        The list of event sources.
     */

    public void setEventSources(java.util.Collection<EventSource> eventSources) {
        if (eventSources == null) {
            this.eventSources = null;
            return;
        }

        this.eventSources = new java.util.ArrayList<EventSource>(eventSources);
    }

    /**
     * <p>
     * The list of event sources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventSources(java.util.Collection)} or {@link #withEventSources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param eventSources
     *        The list of event sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventSourcesResult withEventSources(EventSource... eventSources) {
        if (this.eventSources == null) {
            setEventSources(new java.util.ArrayList<EventSource>(eventSources.length));
        }
        for (EventSource ele : eventSources) {
            this.eventSources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of event sources.
     * </p>
     * 
     * @param eventSources
     *        The list of event sources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventSourcesResult withEventSources(java.util.Collection<EventSource> eventSources) {
        setEventSources(eventSources);
        return this;
    }

    /**
     * <p>
     * A token you can use in a subsequent operation to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token you can use in a subsequent operation to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token you can use in a subsequent operation to retrieve the next set of results.
     * </p>
     * 
     * @return A token you can use in a subsequent operation to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token you can use in a subsequent operation to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token you can use in a subsequent operation to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEventSourcesResult withNextToken(String nextToken) {
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
        if (getEventSources() != null)
            sb.append("EventSources: ").append(getEventSources()).append(",");
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

        if (obj instanceof ListEventSourcesResult == false)
            return false;
        ListEventSourcesResult other = (ListEventSourcesResult) obj;
        if (other.getEventSources() == null ^ this.getEventSources() == null)
            return false;
        if (other.getEventSources() != null && other.getEventSources().equals(this.getEventSources()) == false)
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

        hashCode = prime * hashCode + ((getEventSources() == null) ? 0 : getEventSources().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListEventSourcesResult clone() {
        try {
            return (ListEventSourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
