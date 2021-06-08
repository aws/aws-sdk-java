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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the settings for an event that causes a campaign to be sent or a journey activity to be performed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/EventFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The dimensions for the event filter to use for the campaign or the journey activity.
     * </p>
     */
    private EventDimensions dimensions;
    /**
     * <p>
     * The type of event that causes the campaign to be sent or the journey activity to be performed. Valid values are:
     * SYSTEM, sends the campaign or performs the activity when a system event occurs; and, ENDPOINT, sends the campaign
     * or performs the activity when an endpoint event (<link linkend="apps-application-id-events">Events
     * resource</link>) occurs.
     * </p>
     */
    private String filterType;

    /**
     * <p>
     * The dimensions for the event filter to use for the campaign or the journey activity.
     * </p>
     * 
     * @param dimensions
     *        The dimensions for the event filter to use for the campaign or the journey activity.
     */

    public void setDimensions(EventDimensions dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * <p>
     * The dimensions for the event filter to use for the campaign or the journey activity.
     * </p>
     * 
     * @return The dimensions for the event filter to use for the campaign or the journey activity.
     */

    public EventDimensions getDimensions() {
        return this.dimensions;
    }

    /**
     * <p>
     * The dimensions for the event filter to use for the campaign or the journey activity.
     * </p>
     * 
     * @param dimensions
     *        The dimensions for the event filter to use for the campaign or the journey activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventFilter withDimensions(EventDimensions dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * <p>
     * The type of event that causes the campaign to be sent or the journey activity to be performed. Valid values are:
     * SYSTEM, sends the campaign or performs the activity when a system event occurs; and, ENDPOINT, sends the campaign
     * or performs the activity when an endpoint event (<link linkend="apps-application-id-events">Events
     * resource</link>) occurs.
     * </p>
     * 
     * @param filterType
     *        The type of event that causes the campaign to be sent or the journey activity to be performed. Valid
     *        values are: SYSTEM, sends the campaign or performs the activity when a system event occurs; and, ENDPOINT,
     *        sends the campaign or performs the activity when an endpoint event (<link
     *        linkend="apps-application-id-events">Events resource</link>) occurs.
     * @see FilterType
     */

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    /**
     * <p>
     * The type of event that causes the campaign to be sent or the journey activity to be performed. Valid values are:
     * SYSTEM, sends the campaign or performs the activity when a system event occurs; and, ENDPOINT, sends the campaign
     * or performs the activity when an endpoint event (<link linkend="apps-application-id-events">Events
     * resource</link>) occurs.
     * </p>
     * 
     * @return The type of event that causes the campaign to be sent or the journey activity to be performed. Valid
     *         values are: SYSTEM, sends the campaign or performs the activity when a system event occurs; and,
     *         ENDPOINT, sends the campaign or performs the activity when an endpoint event (<link
     *         linkend="apps-application-id-events">Events resource</link>) occurs.
     * @see FilterType
     */

    public String getFilterType() {
        return this.filterType;
    }

    /**
     * <p>
     * The type of event that causes the campaign to be sent or the journey activity to be performed. Valid values are:
     * SYSTEM, sends the campaign or performs the activity when a system event occurs; and, ENDPOINT, sends the campaign
     * or performs the activity when an endpoint event (<link linkend="apps-application-id-events">Events
     * resource</link>) occurs.
     * </p>
     * 
     * @param filterType
     *        The type of event that causes the campaign to be sent or the journey activity to be performed. Valid
     *        values are: SYSTEM, sends the campaign or performs the activity when a system event occurs; and, ENDPOINT,
     *        sends the campaign or performs the activity when an endpoint event (<link
     *        linkend="apps-application-id-events">Events resource</link>) occurs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterType
     */

    public EventFilter withFilterType(String filterType) {
        setFilterType(filterType);
        return this;
    }

    /**
     * <p>
     * The type of event that causes the campaign to be sent or the journey activity to be performed. Valid values are:
     * SYSTEM, sends the campaign or performs the activity when a system event occurs; and, ENDPOINT, sends the campaign
     * or performs the activity when an endpoint event (<link linkend="apps-application-id-events">Events
     * resource</link>) occurs.
     * </p>
     * 
     * @param filterType
     *        The type of event that causes the campaign to be sent or the journey activity to be performed. Valid
     *        values are: SYSTEM, sends the campaign or performs the activity when a system event occurs; and, ENDPOINT,
     *        sends the campaign or performs the activity when an endpoint event (<link
     *        linkend="apps-application-id-events">Events resource</link>) occurs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterType
     */

    public EventFilter withFilterType(FilterType filterType) {
        this.filterType = filterType.toString();
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
        if (getDimensions() != null)
            sb.append("Dimensions: ").append(getDimensions()).append(",");
        if (getFilterType() != null)
            sb.append("FilterType: ").append(getFilterType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventFilter == false)
            return false;
        EventFilter other = (EventFilter) obj;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getFilterType() == null ^ this.getFilterType() == null)
            return false;
        if (other.getFilterType() != null && other.getFilterType().equals(this.getFilterType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode + ((getFilterType() == null) ? 0 : getFilterType().hashCode());
        return hashCode;
    }

    @Override
    public EventFilter clone() {
        try {
            return (EventFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.EventFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
