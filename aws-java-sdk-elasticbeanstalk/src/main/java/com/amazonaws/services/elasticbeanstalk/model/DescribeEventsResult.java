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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Result message wrapping a list of event descriptions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/DescribeEvents" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEventsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <a>EventDescription</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<EventDescription> events;
    /**
     * <p>
     * If returned, this indicates that there are more results to obtain. Use this token in the next
     * <a>DescribeEvents</a> call to get the next batch of events.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <a>EventDescription</a>.
     * </p>
     * 
     * @return A list of <a>EventDescription</a>.
     */

    public java.util.List<EventDescription> getEvents() {
        if (events == null) {
            events = new com.amazonaws.internal.SdkInternalList<EventDescription>();
        }
        return events;
    }

    /**
     * <p>
     * A list of <a>EventDescription</a>.
     * </p>
     * 
     * @param events
     *        A list of <a>EventDescription</a>.
     */

    public void setEvents(java.util.Collection<EventDescription> events) {
        if (events == null) {
            this.events = null;
            return;
        }

        this.events = new com.amazonaws.internal.SdkInternalList<EventDescription>(events);
    }

    /**
     * <p>
     * A list of <a>EventDescription</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvents(java.util.Collection)} or {@link #withEvents(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param events
     *        A list of <a>EventDescription</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventsResult withEvents(EventDescription... events) {
        if (this.events == null) {
            setEvents(new com.amazonaws.internal.SdkInternalList<EventDescription>(events.length));
        }
        for (EventDescription ele : events) {
            this.events.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a>EventDescription</a>.
     * </p>
     * 
     * @param events
     *        A list of <a>EventDescription</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventsResult withEvents(java.util.Collection<EventDescription> events) {
        setEvents(events);
        return this;
    }

    /**
     * <p>
     * If returned, this indicates that there are more results to obtain. Use this token in the next
     * <a>DescribeEvents</a> call to get the next batch of events.
     * </p>
     * 
     * @param nextToken
     *        If returned, this indicates that there are more results to obtain. Use this token in the next
     *        <a>DescribeEvents</a> call to get the next batch of events.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If returned, this indicates that there are more results to obtain. Use this token in the next
     * <a>DescribeEvents</a> call to get the next batch of events.
     * </p>
     * 
     * @return If returned, this indicates that there are more results to obtain. Use this token in the next
     *         <a>DescribeEvents</a> call to get the next batch of events.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If returned, this indicates that there are more results to obtain. Use this token in the next
     * <a>DescribeEvents</a> call to get the next batch of events.
     * </p>
     * 
     * @param nextToken
     *        If returned, this indicates that there are more results to obtain. Use this token in the next
     *        <a>DescribeEvents</a> call to get the next batch of events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventsResult withNextToken(String nextToken) {
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

        if (obj instanceof DescribeEventsResult == false)
            return false;
        DescribeEventsResult other = (DescribeEventsResult) obj;
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
    public DescribeEventsResult clone() {
        try {
            return (DescribeEventsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
