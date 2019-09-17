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
 * <p>
 * Specifies the dimension settings for a segment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/SegmentDimensions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SegmentDimensions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * One or more custom attributes to use as criteria for the segment.
     * </p>
     */
    private java.util.Map<String, AttributeDimension> attributes;
    /**
     * <p>
     * The behavior-based criteria, such as how recently users have used your app, for the segment.
     * </p>
     */
    private SegmentBehaviors behavior;
    /**
     * <p>
     * The demographic-based criteria, such as device platform, for the segment.
     * </p>
     */
    private SegmentDemographics demographic;
    /**
     * <p>
     * The location-based criteria, such as region or GPS coordinates, for the segment.
     * </p>
     */
    private SegmentLocation location;
    /**
     * <p>
     * One or more custom metrics to use as criteria for the segment.
     * </p>
     */
    private java.util.Map<String, MetricDimension> metrics;
    /**
     * <p>
     * One or more custom user attributes to use as criteria for the segment.
     * </p>
     */
    private java.util.Map<String, AttributeDimension> userAttributes;

    /**
     * <p>
     * One or more custom attributes to use as criteria for the segment.
     * </p>
     * 
     * @return One or more custom attributes to use as criteria for the segment.
     */

    public java.util.Map<String, AttributeDimension> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * One or more custom attributes to use as criteria for the segment.
     * </p>
     * 
     * @param attributes
     *        One or more custom attributes to use as criteria for the segment.
     */

    public void setAttributes(java.util.Map<String, AttributeDimension> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * One or more custom attributes to use as criteria for the segment.
     * </p>
     * 
     * @param attributes
     *        One or more custom attributes to use as criteria for the segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentDimensions withAttributes(java.util.Map<String, AttributeDimension> attributes) {
        setAttributes(attributes);
        return this;
    }

    public SegmentDimensions addAttributesEntry(String key, AttributeDimension value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, AttributeDimension>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentDimensions clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * The behavior-based criteria, such as how recently users have used your app, for the segment.
     * </p>
     * 
     * @param behavior
     *        The behavior-based criteria, such as how recently users have used your app, for the segment.
     */

    public void setBehavior(SegmentBehaviors behavior) {
        this.behavior = behavior;
    }

    /**
     * <p>
     * The behavior-based criteria, such as how recently users have used your app, for the segment.
     * </p>
     * 
     * @return The behavior-based criteria, such as how recently users have used your app, for the segment.
     */

    public SegmentBehaviors getBehavior() {
        return this.behavior;
    }

    /**
     * <p>
     * The behavior-based criteria, such as how recently users have used your app, for the segment.
     * </p>
     * 
     * @param behavior
     *        The behavior-based criteria, such as how recently users have used your app, for the segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentDimensions withBehavior(SegmentBehaviors behavior) {
        setBehavior(behavior);
        return this;
    }

    /**
     * <p>
     * The demographic-based criteria, such as device platform, for the segment.
     * </p>
     * 
     * @param demographic
     *        The demographic-based criteria, such as device platform, for the segment.
     */

    public void setDemographic(SegmentDemographics demographic) {
        this.demographic = demographic;
    }

    /**
     * <p>
     * The demographic-based criteria, such as device platform, for the segment.
     * </p>
     * 
     * @return The demographic-based criteria, such as device platform, for the segment.
     */

    public SegmentDemographics getDemographic() {
        return this.demographic;
    }

    /**
     * <p>
     * The demographic-based criteria, such as device platform, for the segment.
     * </p>
     * 
     * @param demographic
     *        The demographic-based criteria, such as device platform, for the segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentDimensions withDemographic(SegmentDemographics demographic) {
        setDemographic(demographic);
        return this;
    }

    /**
     * <p>
     * The location-based criteria, such as region or GPS coordinates, for the segment.
     * </p>
     * 
     * @param location
     *        The location-based criteria, such as region or GPS coordinates, for the segment.
     */

    public void setLocation(SegmentLocation location) {
        this.location = location;
    }

    /**
     * <p>
     * The location-based criteria, such as region or GPS coordinates, for the segment.
     * </p>
     * 
     * @return The location-based criteria, such as region or GPS coordinates, for the segment.
     */

    public SegmentLocation getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The location-based criteria, such as region or GPS coordinates, for the segment.
     * </p>
     * 
     * @param location
     *        The location-based criteria, such as region or GPS coordinates, for the segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentDimensions withLocation(SegmentLocation location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * One or more custom metrics to use as criteria for the segment.
     * </p>
     * 
     * @return One or more custom metrics to use as criteria for the segment.
     */

    public java.util.Map<String, MetricDimension> getMetrics() {
        return metrics;
    }

    /**
     * <p>
     * One or more custom metrics to use as criteria for the segment.
     * </p>
     * 
     * @param metrics
     *        One or more custom metrics to use as criteria for the segment.
     */

    public void setMetrics(java.util.Map<String, MetricDimension> metrics) {
        this.metrics = metrics;
    }

    /**
     * <p>
     * One or more custom metrics to use as criteria for the segment.
     * </p>
     * 
     * @param metrics
     *        One or more custom metrics to use as criteria for the segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentDimensions withMetrics(java.util.Map<String, MetricDimension> metrics) {
        setMetrics(metrics);
        return this;
    }

    public SegmentDimensions addMetricsEntry(String key, MetricDimension value) {
        if (null == this.metrics) {
            this.metrics = new java.util.HashMap<String, MetricDimension>();
        }
        if (this.metrics.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.metrics.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Metrics.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentDimensions clearMetricsEntries() {
        this.metrics = null;
        return this;
    }

    /**
     * <p>
     * One or more custom user attributes to use as criteria for the segment.
     * </p>
     * 
     * @return One or more custom user attributes to use as criteria for the segment.
     */

    public java.util.Map<String, AttributeDimension> getUserAttributes() {
        return userAttributes;
    }

    /**
     * <p>
     * One or more custom user attributes to use as criteria for the segment.
     * </p>
     * 
     * @param userAttributes
     *        One or more custom user attributes to use as criteria for the segment.
     */

    public void setUserAttributes(java.util.Map<String, AttributeDimension> userAttributes) {
        this.userAttributes = userAttributes;
    }

    /**
     * <p>
     * One or more custom user attributes to use as criteria for the segment.
     * </p>
     * 
     * @param userAttributes
     *        One or more custom user attributes to use as criteria for the segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentDimensions withUserAttributes(java.util.Map<String, AttributeDimension> userAttributes) {
        setUserAttributes(userAttributes);
        return this;
    }

    public SegmentDimensions addUserAttributesEntry(String key, AttributeDimension value) {
        if (null == this.userAttributes) {
            this.userAttributes = new java.util.HashMap<String, AttributeDimension>();
        }
        if (this.userAttributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.userAttributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into UserAttributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SegmentDimensions clearUserAttributesEntries() {
        this.userAttributes = null;
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
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getBehavior() != null)
            sb.append("Behavior: ").append(getBehavior()).append(",");
        if (getDemographic() != null)
            sb.append("Demographic: ").append(getDemographic()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getMetrics() != null)
            sb.append("Metrics: ").append(getMetrics()).append(",");
        if (getUserAttributes() != null)
            sb.append("UserAttributes: ").append(getUserAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SegmentDimensions == false)
            return false;
        SegmentDimensions other = (SegmentDimensions) obj;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getBehavior() == null ^ this.getBehavior() == null)
            return false;
        if (other.getBehavior() != null && other.getBehavior().equals(this.getBehavior()) == false)
            return false;
        if (other.getDemographic() == null ^ this.getDemographic() == null)
            return false;
        if (other.getDemographic() != null && other.getDemographic().equals(this.getDemographic()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        if (other.getUserAttributes() == null ^ this.getUserAttributes() == null)
            return false;
        if (other.getUserAttributes() != null && other.getUserAttributes().equals(this.getUserAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getBehavior() == null) ? 0 : getBehavior().hashCode());
        hashCode = prime * hashCode + ((getDemographic() == null) ? 0 : getDemographic().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        hashCode = prime * hashCode + ((getUserAttributes() == null) ? 0 : getUserAttributes().hashCode());
        return hashCode;
    }

    @Override
    public SegmentDimensions clone() {
        try {
            return (SegmentDimensions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.SegmentDimensionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
