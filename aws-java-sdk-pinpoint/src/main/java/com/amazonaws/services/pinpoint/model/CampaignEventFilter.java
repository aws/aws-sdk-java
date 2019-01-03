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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * An object that defines the events that cause the campaign to be sent.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/CampaignEventFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CampaignEventFilter implements Serializable, Cloneable, StructuredPojo {

    /** An object that defines the dimensions for the event filter. */
    private EventDimensions dimensions;
    /**
     * The type of event that causes the campaign to be sent. Possible values:
     * 
     * SYSTEM - Send the campaign when a system event occurs. See the System resource for more information.
     * 
     * ENDPOINT - Send the campaign when an endpoint event occurs. See the Event resource for more information.
     */
    private String filterType;

    /**
     * An object that defines the dimensions for the event filter.
     * 
     * @param dimensions
     *        An object that defines the dimensions for the event filter.
     */

    public void setDimensions(EventDimensions dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * An object that defines the dimensions for the event filter.
     * 
     * @return An object that defines the dimensions for the event filter.
     */

    public EventDimensions getDimensions() {
        return this.dimensions;
    }

    /**
     * An object that defines the dimensions for the event filter.
     * 
     * @param dimensions
     *        An object that defines the dimensions for the event filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CampaignEventFilter withDimensions(EventDimensions dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * The type of event that causes the campaign to be sent. Possible values:
     * 
     * SYSTEM - Send the campaign when a system event occurs. See the System resource for more information.
     * 
     * ENDPOINT - Send the campaign when an endpoint event occurs. See the Event resource for more information.
     * 
     * @param filterType
     *        The type of event that causes the campaign to be sent. Possible values:
     * 
     *        SYSTEM - Send the campaign when a system event occurs. See the System resource for more information.
     * 
     *        ENDPOINT - Send the campaign when an endpoint event occurs. See the Event resource for more information.
     * @see FilterType
     */

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    /**
     * The type of event that causes the campaign to be sent. Possible values:
     * 
     * SYSTEM - Send the campaign when a system event occurs. See the System resource for more information.
     * 
     * ENDPOINT - Send the campaign when an endpoint event occurs. See the Event resource for more information.
     * 
     * @return The type of event that causes the campaign to be sent. Possible values:
     * 
     *         SYSTEM - Send the campaign when a system event occurs. See the System resource for more information.
     * 
     *         ENDPOINT - Send the campaign when an endpoint event occurs. See the Event resource for more information.
     * @see FilterType
     */

    public String getFilterType() {
        return this.filterType;
    }

    /**
     * The type of event that causes the campaign to be sent. Possible values:
     * 
     * SYSTEM - Send the campaign when a system event occurs. See the System resource for more information.
     * 
     * ENDPOINT - Send the campaign when an endpoint event occurs. See the Event resource for more information.
     * 
     * @param filterType
     *        The type of event that causes the campaign to be sent. Possible values:
     * 
     *        SYSTEM - Send the campaign when a system event occurs. See the System resource for more information.
     * 
     *        ENDPOINT - Send the campaign when an endpoint event occurs. See the Event resource for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterType
     */

    public CampaignEventFilter withFilterType(String filterType) {
        setFilterType(filterType);
        return this;
    }

    /**
     * The type of event that causes the campaign to be sent. Possible values:
     * 
     * SYSTEM - Send the campaign when a system event occurs. See the System resource for more information.
     * 
     * ENDPOINT - Send the campaign when an endpoint event occurs. See the Event resource for more information.
     * 
     * @param filterType
     *        The type of event that causes the campaign to be sent. Possible values:
     * 
     *        SYSTEM - Send the campaign when a system event occurs. See the System resource for more information.
     * 
     *        ENDPOINT - Send the campaign when an endpoint event occurs. See the Event resource for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterType
     */

    public CampaignEventFilter withFilterType(FilterType filterType) {
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

        if (obj instanceof CampaignEventFilter == false)
            return false;
        CampaignEventFilter other = (CampaignEventFilter) obj;
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
    public CampaignEventFilter clone() {
        try {
            return (CampaignEventFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.CampaignEventFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
