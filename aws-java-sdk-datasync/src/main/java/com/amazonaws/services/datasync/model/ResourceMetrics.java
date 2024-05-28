/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information, including performance data and capacity usage, provided by DataSync Discovery about a resource in your
 * on-premises storage system.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ResourceMetrics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceMetrics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time when DataSync Discovery collected this information from the resource.
     * </p>
     */
    private java.util.Date timestamp;
    /**
     * <p>
     * The types of performance data that DataSync Discovery collects about the on-premises storage system resource.
     * </p>
     */
    private P95Metrics p95Metrics;
    /**
     * <p>
     * The storage capacity of the on-premises storage system resource.
     * </p>
     */
    private Capacity capacity;
    /**
     * <p>
     * The universally unique identifier (UUID) of the on-premises storage system resource.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The type of on-premises storage system resource.
     * </p>
     */
    private String resourceType;

    /**
     * <p>
     * The time when DataSync Discovery collected this information from the resource.
     * </p>
     * 
     * @param timestamp
     *        The time when DataSync Discovery collected this information from the resource.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The time when DataSync Discovery collected this information from the resource.
     * </p>
     * 
     * @return The time when DataSync Discovery collected this information from the resource.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The time when DataSync Discovery collected this information from the resource.
     * </p>
     * 
     * @param timestamp
     *        The time when DataSync Discovery collected this information from the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceMetrics withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * The types of performance data that DataSync Discovery collects about the on-premises storage system resource.
     * </p>
     * 
     * @param p95Metrics
     *        The types of performance data that DataSync Discovery collects about the on-premises storage system
     *        resource.
     */

    public void setP95Metrics(P95Metrics p95Metrics) {
        this.p95Metrics = p95Metrics;
    }

    /**
     * <p>
     * The types of performance data that DataSync Discovery collects about the on-premises storage system resource.
     * </p>
     * 
     * @return The types of performance data that DataSync Discovery collects about the on-premises storage system
     *         resource.
     */

    public P95Metrics getP95Metrics() {
        return this.p95Metrics;
    }

    /**
     * <p>
     * The types of performance data that DataSync Discovery collects about the on-premises storage system resource.
     * </p>
     * 
     * @param p95Metrics
     *        The types of performance data that DataSync Discovery collects about the on-premises storage system
     *        resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceMetrics withP95Metrics(P95Metrics p95Metrics) {
        setP95Metrics(p95Metrics);
        return this;
    }

    /**
     * <p>
     * The storage capacity of the on-premises storage system resource.
     * </p>
     * 
     * @param capacity
     *        The storage capacity of the on-premises storage system resource.
     */

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    /**
     * <p>
     * The storage capacity of the on-premises storage system resource.
     * </p>
     * 
     * @return The storage capacity of the on-premises storage system resource.
     */

    public Capacity getCapacity() {
        return this.capacity;
    }

    /**
     * <p>
     * The storage capacity of the on-premises storage system resource.
     * </p>
     * 
     * @param capacity
     *        The storage capacity of the on-premises storage system resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceMetrics withCapacity(Capacity capacity) {
        setCapacity(capacity);
        return this;
    }

    /**
     * <p>
     * The universally unique identifier (UUID) of the on-premises storage system resource.
     * </p>
     * 
     * @param resourceId
     *        The universally unique identifier (UUID) of the on-premises storage system resource.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The universally unique identifier (UUID) of the on-premises storage system resource.
     * </p>
     * 
     * @return The universally unique identifier (UUID) of the on-premises storage system resource.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The universally unique identifier (UUID) of the on-premises storage system resource.
     * </p>
     * 
     * @param resourceId
     *        The universally unique identifier (UUID) of the on-premises storage system resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceMetrics withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The type of on-premises storage system resource.
     * </p>
     * 
     * @param resourceType
     *        The type of on-premises storage system resource.
     * @see DiscoveryResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of on-premises storage system resource.
     * </p>
     * 
     * @return The type of on-premises storage system resource.
     * @see DiscoveryResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of on-premises storage system resource.
     * </p>
     * 
     * @param resourceType
     *        The type of on-premises storage system resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiscoveryResourceType
     */

    public ResourceMetrics withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of on-premises storage system resource.
     * </p>
     * 
     * @param resourceType
     *        The type of on-premises storage system resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiscoveryResourceType
     */

    public ResourceMetrics withResourceType(DiscoveryResourceType resourceType) {
        this.resourceType = resourceType.toString();
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
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
        if (getP95Metrics() != null)
            sb.append("P95Metrics: ").append(getP95Metrics()).append(",");
        if (getCapacity() != null)
            sb.append("Capacity: ").append(getCapacity()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceMetrics == false)
            return false;
        ResourceMetrics other = (ResourceMetrics) obj;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getP95Metrics() == null ^ this.getP95Metrics() == null)
            return false;
        if (other.getP95Metrics() != null && other.getP95Metrics().equals(this.getP95Metrics()) == false)
            return false;
        if (other.getCapacity() == null ^ this.getCapacity() == null)
            return false;
        if (other.getCapacity() != null && other.getCapacity().equals(this.getCapacity()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getP95Metrics() == null) ? 0 : getP95Metrics().hashCode());
        hashCode = prime * hashCode + ((getCapacity() == null) ? 0 : getCapacity().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        return hashCode;
    }

    @Override
    public ResourceMetrics clone() {
        try {
            return (ResourceMetrics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.ResourceMetricsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
