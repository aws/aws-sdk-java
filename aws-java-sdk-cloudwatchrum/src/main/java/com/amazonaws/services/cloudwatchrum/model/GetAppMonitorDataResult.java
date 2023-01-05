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
package com.amazonaws.services.cloudwatchrum.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/GetAppMonitorData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAppMonitorDataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The events that RUM collected that match your request.
     * </p>
     */
    private java.util.List<String> events;
    /**
     * <p>
     * A token that you can use in a subsequent operation to retrieve the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The events that RUM collected that match your request.
     * </p>
     * 
     * @return The events that RUM collected that match your request.
     */

    public java.util.List<String> getEvents() {
        return events;
    }

    /**
     * <p>
     * The events that RUM collected that match your request.
     * </p>
     * 
     * @param events
     *        The events that RUM collected that match your request.
     */

    public void setEvents(java.util.Collection<String> events) {
        if (events == null) {
            this.events = null;
            return;
        }

        this.events = new java.util.ArrayList<String>(events);
    }

    /**
     * <p>
     * The events that RUM collected that match your request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvents(java.util.Collection)} or {@link #withEvents(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param events
     *        The events that RUM collected that match your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAppMonitorDataResult withEvents(String... events) {
        if (this.events == null) {
            setEvents(new java.util.ArrayList<String>(events.length));
        }
        for (String ele : events) {
            this.events.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The events that RUM collected that match your request.
     * </p>
     * 
     * @param events
     *        The events that RUM collected that match your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAppMonitorDataResult withEvents(java.util.Collection<String> events) {
        setEvents(events);
        return this;
    }

    /**
     * <p>
     * A token that you can use in a subsequent operation to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token that you can use in a subsequent operation to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that you can use in a subsequent operation to retrieve the next set of results.
     * </p>
     * 
     * @return A token that you can use in a subsequent operation to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that you can use in a subsequent operation to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token that you can use in a subsequent operation to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAppMonitorDataResult withNextToken(String nextToken) {
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

        if (obj instanceof GetAppMonitorDataResult == false)
            return false;
        GetAppMonitorDataResult other = (GetAppMonitorDataResult) obj;
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
    public GetAppMonitorDataResult clone() {
        try {
            return (GetAppMonitorDataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
