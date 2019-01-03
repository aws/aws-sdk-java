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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the result of a successful invocation of the <a>DescribeEvents</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeEvents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEventsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An optional pagination token provided by a previous Events request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code> .
     * </p>
     */
    private String marker;
    /**
     * <p>
     * A list of <a>Event</a> instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Event> events;

    /**
     * <p>
     * An optional pagination token provided by a previous Events request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code> .
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous Events request. If this parameter is specified, the
     *        response includes only records beyond the marker, up to the value specified by <code>MaxRecords</code> .
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous Events request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code> .
     * </p>
     * 
     * @return An optional pagination token provided by a previous Events request. If this parameter is specified, the
     *         response includes only records beyond the marker, up to the value specified by <code>MaxRecords</code> .
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous Events request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code> .
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous Events request. If this parameter is specified, the
     *        response includes only records beyond the marker, up to the value specified by <code>MaxRecords</code> .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * A list of <a>Event</a> instances.
     * </p>
     * 
     * @return A list of <a>Event</a> instances.
     */

    public java.util.List<Event> getEvents() {
        if (events == null) {
            events = new com.amazonaws.internal.SdkInternalList<Event>();
        }
        return events;
    }

    /**
     * <p>
     * A list of <a>Event</a> instances.
     * </p>
     * 
     * @param events
     *        A list of <a>Event</a> instances.
     */

    public void setEvents(java.util.Collection<Event> events) {
        if (events == null) {
            this.events = null;
            return;
        }

        this.events = new com.amazonaws.internal.SdkInternalList<Event>(events);
    }

    /**
     * <p>
     * A list of <a>Event</a> instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvents(java.util.Collection)} or {@link #withEvents(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param events
     *        A list of <a>Event</a> instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventsResult withEvents(Event... events) {
        if (this.events == null) {
            setEvents(new com.amazonaws.internal.SdkInternalList<Event>(events.length));
        }
        for (Event ele : events) {
            this.events.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a>Event</a> instances.
     * </p>
     * 
     * @param events
     *        A list of <a>Event</a> instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventsResult withEvents(java.util.Collection<Event> events) {
        setEvents(events);
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
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getEvents() != null)
            sb.append("Events: ").append(getEvents());
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
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
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
