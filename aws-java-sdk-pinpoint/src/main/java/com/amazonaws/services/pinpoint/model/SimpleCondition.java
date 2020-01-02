/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Specifies a condition to evaluate for an activity in a journey.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/SimpleCondition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SimpleCondition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The dimension settings for the event that's associated with the activity.
     * </p>
     */
    private EventCondition eventCondition;
    /**
     * <p>
     * The segment that's associated with the activity.
     * </p>
     */
    private SegmentCondition segmentCondition;
    /**
     * <p>
     * The dimension settings for the segment that's associated with the activity.
     * </p>
     */
    private SegmentDimensions segmentDimensions;

    /**
     * <p>
     * The dimension settings for the event that's associated with the activity.
     * </p>
     * 
     * @param eventCondition
     *        The dimension settings for the event that's associated with the activity.
     */

    public void setEventCondition(EventCondition eventCondition) {
        this.eventCondition = eventCondition;
    }

    /**
     * <p>
     * The dimension settings for the event that's associated with the activity.
     * </p>
     * 
     * @return The dimension settings for the event that's associated with the activity.
     */

    public EventCondition getEventCondition() {
        return this.eventCondition;
    }

    /**
     * <p>
     * The dimension settings for the event that's associated with the activity.
     * </p>
     * 
     * @param eventCondition
     *        The dimension settings for the event that's associated with the activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimpleCondition withEventCondition(EventCondition eventCondition) {
        setEventCondition(eventCondition);
        return this;
    }

    /**
     * <p>
     * The segment that's associated with the activity.
     * </p>
     * 
     * @param segmentCondition
     *        The segment that's associated with the activity.
     */

    public void setSegmentCondition(SegmentCondition segmentCondition) {
        this.segmentCondition = segmentCondition;
    }

    /**
     * <p>
     * The segment that's associated with the activity.
     * </p>
     * 
     * @return The segment that's associated with the activity.
     */

    public SegmentCondition getSegmentCondition() {
        return this.segmentCondition;
    }

    /**
     * <p>
     * The segment that's associated with the activity.
     * </p>
     * 
     * @param segmentCondition
     *        The segment that's associated with the activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimpleCondition withSegmentCondition(SegmentCondition segmentCondition) {
        setSegmentCondition(segmentCondition);
        return this;
    }

    /**
     * <p>
     * The dimension settings for the segment that's associated with the activity.
     * </p>
     * 
     * @param segmentDimensions
     *        The dimension settings for the segment that's associated with the activity.
     */

    public void setSegmentDimensions(SegmentDimensions segmentDimensions) {
        this.segmentDimensions = segmentDimensions;
    }

    /**
     * <p>
     * The dimension settings for the segment that's associated with the activity.
     * </p>
     * 
     * @return The dimension settings for the segment that's associated with the activity.
     */

    public SegmentDimensions getSegmentDimensions() {
        return this.segmentDimensions;
    }

    /**
     * <p>
     * The dimension settings for the segment that's associated with the activity.
     * </p>
     * 
     * @param segmentDimensions
     *        The dimension settings for the segment that's associated with the activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimpleCondition withSegmentDimensions(SegmentDimensions segmentDimensions) {
        setSegmentDimensions(segmentDimensions);
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
        if (getEventCondition() != null)
            sb.append("EventCondition: ").append(getEventCondition()).append(",");
        if (getSegmentCondition() != null)
            sb.append("SegmentCondition: ").append(getSegmentCondition()).append(",");
        if (getSegmentDimensions() != null)
            sb.append("SegmentDimensions: ").append(getSegmentDimensions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SimpleCondition == false)
            return false;
        SimpleCondition other = (SimpleCondition) obj;
        if (other.getEventCondition() == null ^ this.getEventCondition() == null)
            return false;
        if (other.getEventCondition() != null && other.getEventCondition().equals(this.getEventCondition()) == false)
            return false;
        if (other.getSegmentCondition() == null ^ this.getSegmentCondition() == null)
            return false;
        if (other.getSegmentCondition() != null && other.getSegmentCondition().equals(this.getSegmentCondition()) == false)
            return false;
        if (other.getSegmentDimensions() == null ^ this.getSegmentDimensions() == null)
            return false;
        if (other.getSegmentDimensions() != null && other.getSegmentDimensions().equals(this.getSegmentDimensions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventCondition() == null) ? 0 : getEventCondition().hashCode());
        hashCode = prime * hashCode + ((getSegmentCondition() == null) ? 0 : getSegmentCondition().hashCode());
        hashCode = prime * hashCode + ((getSegmentDimensions() == null) ? 0 : getSegmentDimensions().hashCode());
        return hashCode;
    }

    @Override
    public SimpleCondition clone() {
        try {
            return (SimpleCondition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.SimpleConditionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
