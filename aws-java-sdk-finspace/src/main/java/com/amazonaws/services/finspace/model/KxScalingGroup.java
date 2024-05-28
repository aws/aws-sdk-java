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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure for storing metadata of scaling group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/KxScalingGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KxScalingGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the kdb scaling group.
     * </p>
     */
    private String scalingGroupName;
    /**
     * <p>
     * The memory and CPU capabilities of the scaling group host on which FinSpace Managed kdb clusters will be placed.
     * </p>
     * <p>
     * You can add one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>kx.sg.4xlarge</code> – The host type with a configuration of 108 GiB memory and 16 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.sg.8xlarge</code> – The host type with a configuration of 216 GiB memory and 32 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.sg.16xlarge</code> – The host type with a configuration of 432 GiB memory and 64 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.sg.32xlarge</code> – The host type with a configuration of 864 GiB memory and 128 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.sg1.16xlarge</code> – The host type with a configuration of 1949 GiB memory and 64 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.sg1.24xlarge</code> – The host type with a configuration of 2948 GiB memory and 96 vCPUs.
     * </p>
     * </li>
     * </ul>
     */
    private String hostType;
    /**
     * <p>
     * The list of clusters currently active in a given scaling group.
     * </p>
     */
    private java.util.List<String> clusters;
    /**
     * <p>
     * The identifier of the availability zones.
     * </p>
     */
    private String availabilityZoneId;
    /**
     * <p>
     * The status of scaling groups.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The error message when a failed state occurs.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * The last time that the scaling group was updated in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     */
    private java.util.Date lastModifiedTimestamp;
    /**
     * <p>
     * The timestamp at which the scaling group was created in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     */
    private java.util.Date createdTimestamp;

    /**
     * <p>
     * A unique identifier for the kdb scaling group.
     * </p>
     * 
     * @param scalingGroupName
     *        A unique identifier for the kdb scaling group.
     */

    public void setScalingGroupName(String scalingGroupName) {
        this.scalingGroupName = scalingGroupName;
    }

    /**
     * <p>
     * A unique identifier for the kdb scaling group.
     * </p>
     * 
     * @return A unique identifier for the kdb scaling group.
     */

    public String getScalingGroupName() {
        return this.scalingGroupName;
    }

    /**
     * <p>
     * A unique identifier for the kdb scaling group.
     * </p>
     * 
     * @param scalingGroupName
     *        A unique identifier for the kdb scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxScalingGroup withScalingGroupName(String scalingGroupName) {
        setScalingGroupName(scalingGroupName);
        return this;
    }

    /**
     * <p>
     * The memory and CPU capabilities of the scaling group host on which FinSpace Managed kdb clusters will be placed.
     * </p>
     * <p>
     * You can add one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>kx.sg.4xlarge</code> – The host type with a configuration of 108 GiB memory and 16 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.sg.8xlarge</code> – The host type with a configuration of 216 GiB memory and 32 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.sg.16xlarge</code> – The host type with a configuration of 432 GiB memory and 64 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.sg.32xlarge</code> – The host type with a configuration of 864 GiB memory and 128 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.sg1.16xlarge</code> – The host type with a configuration of 1949 GiB memory and 64 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.sg1.24xlarge</code> – The host type with a configuration of 2948 GiB memory and 96 vCPUs.
     * </p>
     * </li>
     * </ul>
     * 
     * @param hostType
     *        The memory and CPU capabilities of the scaling group host on which FinSpace Managed kdb clusters will be
     *        placed.</p>
     *        <p>
     *        You can add one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>kx.sg.4xlarge</code> – The host type with a configuration of 108 GiB memory and 16 vCPUs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>kx.sg.8xlarge</code> – The host type with a configuration of 216 GiB memory and 32 vCPUs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>kx.sg.16xlarge</code> – The host type with a configuration of 432 GiB memory and 64 vCPUs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>kx.sg.32xlarge</code> – The host type with a configuration of 864 GiB memory and 128 vCPUs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>kx.sg1.16xlarge</code> – The host type with a configuration of 1949 GiB memory and 64 vCPUs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>kx.sg1.24xlarge</code> – The host type with a configuration of 2948 GiB memory and 96 vCPUs.
     *        </p>
     *        </li>
     */

    public void setHostType(String hostType) {
        this.hostType = hostType;
    }

    /**
     * <p>
     * The memory and CPU capabilities of the scaling group host on which FinSpace Managed kdb clusters will be placed.
     * </p>
     * <p>
     * You can add one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>kx.sg.4xlarge</code> – The host type with a configuration of 108 GiB memory and 16 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.sg.8xlarge</code> – The host type with a configuration of 216 GiB memory and 32 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.sg.16xlarge</code> – The host type with a configuration of 432 GiB memory and 64 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.sg.32xlarge</code> – The host type with a configuration of 864 GiB memory and 128 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.sg1.16xlarge</code> – The host type with a configuration of 1949 GiB memory and 64 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.sg1.24xlarge</code> – The host type with a configuration of 2948 GiB memory and 96 vCPUs.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The memory and CPU capabilities of the scaling group host on which FinSpace Managed kdb clusters will be
     *         placed.</p>
     *         <p>
     *         You can add one of the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>kx.sg.4xlarge</code> – The host type with a configuration of 108 GiB memory and 16 vCPUs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>kx.sg.8xlarge</code> – The host type with a configuration of 216 GiB memory and 32 vCPUs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>kx.sg.16xlarge</code> – The host type with a configuration of 432 GiB memory and 64 vCPUs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>kx.sg.32xlarge</code> – The host type with a configuration of 864 GiB memory and 128 vCPUs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>kx.sg1.16xlarge</code> – The host type with a configuration of 1949 GiB memory and 64 vCPUs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>kx.sg1.24xlarge</code> – The host type with a configuration of 2948 GiB memory and 96 vCPUs.
     *         </p>
     *         </li>
     */

    public String getHostType() {
        return this.hostType;
    }

    /**
     * <p>
     * The memory and CPU capabilities of the scaling group host on which FinSpace Managed kdb clusters will be placed.
     * </p>
     * <p>
     * You can add one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>kx.sg.4xlarge</code> – The host type with a configuration of 108 GiB memory and 16 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.sg.8xlarge</code> – The host type with a configuration of 216 GiB memory and 32 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.sg.16xlarge</code> – The host type with a configuration of 432 GiB memory and 64 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.sg.32xlarge</code> – The host type with a configuration of 864 GiB memory and 128 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.sg1.16xlarge</code> – The host type with a configuration of 1949 GiB memory and 64 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.sg1.24xlarge</code> – The host type with a configuration of 2948 GiB memory and 96 vCPUs.
     * </p>
     * </li>
     * </ul>
     * 
     * @param hostType
     *        The memory and CPU capabilities of the scaling group host on which FinSpace Managed kdb clusters will be
     *        placed.</p>
     *        <p>
     *        You can add one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>kx.sg.4xlarge</code> – The host type with a configuration of 108 GiB memory and 16 vCPUs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>kx.sg.8xlarge</code> – The host type with a configuration of 216 GiB memory and 32 vCPUs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>kx.sg.16xlarge</code> – The host type with a configuration of 432 GiB memory and 64 vCPUs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>kx.sg.32xlarge</code> – The host type with a configuration of 864 GiB memory and 128 vCPUs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>kx.sg1.16xlarge</code> – The host type with a configuration of 1949 GiB memory and 64 vCPUs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>kx.sg1.24xlarge</code> – The host type with a configuration of 2948 GiB memory and 96 vCPUs.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxScalingGroup withHostType(String hostType) {
        setHostType(hostType);
        return this;
    }

    /**
     * <p>
     * The list of clusters currently active in a given scaling group.
     * </p>
     * 
     * @return The list of clusters currently active in a given scaling group.
     */

    public java.util.List<String> getClusters() {
        return clusters;
    }

    /**
     * <p>
     * The list of clusters currently active in a given scaling group.
     * </p>
     * 
     * @param clusters
     *        The list of clusters currently active in a given scaling group.
     */

    public void setClusters(java.util.Collection<String> clusters) {
        if (clusters == null) {
            this.clusters = null;
            return;
        }

        this.clusters = new java.util.ArrayList<String>(clusters);
    }

    /**
     * <p>
     * The list of clusters currently active in a given scaling group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClusters(java.util.Collection)} or {@link #withClusters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param clusters
     *        The list of clusters currently active in a given scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxScalingGroup withClusters(String... clusters) {
        if (this.clusters == null) {
            setClusters(new java.util.ArrayList<String>(clusters.length));
        }
        for (String ele : clusters) {
            this.clusters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of clusters currently active in a given scaling group.
     * </p>
     * 
     * @param clusters
     *        The list of clusters currently active in a given scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxScalingGroup withClusters(java.util.Collection<String> clusters) {
        setClusters(clusters);
        return this;
    }

    /**
     * <p>
     * The identifier of the availability zones.
     * </p>
     * 
     * @param availabilityZoneId
     *        The identifier of the availability zones.
     */

    public void setAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
    }

    /**
     * <p>
     * The identifier of the availability zones.
     * </p>
     * 
     * @return The identifier of the availability zones.
     */

    public String getAvailabilityZoneId() {
        return this.availabilityZoneId;
    }

    /**
     * <p>
     * The identifier of the availability zones.
     * </p>
     * 
     * @param availabilityZoneId
     *        The identifier of the availability zones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxScalingGroup withAvailabilityZoneId(String availabilityZoneId) {
        setAvailabilityZoneId(availabilityZoneId);
        return this;
    }

    /**
     * <p>
     * The status of scaling groups.
     * </p>
     * 
     * @param status
     *        The status of scaling groups.
     * @see KxScalingGroupStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of scaling groups.
     * </p>
     * 
     * @return The status of scaling groups.
     * @see KxScalingGroupStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of scaling groups.
     * </p>
     * 
     * @param status
     *        The status of scaling groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KxScalingGroupStatus
     */

    public KxScalingGroup withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of scaling groups.
     * </p>
     * 
     * @param status
     *        The status of scaling groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KxScalingGroupStatus
     */

    public KxScalingGroup withStatus(KxScalingGroupStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The error message when a failed state occurs.
     * </p>
     * 
     * @param statusReason
     *        The error message when a failed state occurs.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The error message when a failed state occurs.
     * </p>
     * 
     * @return The error message when a failed state occurs.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The error message when a failed state occurs.
     * </p>
     * 
     * @param statusReason
     *        The error message when a failed state occurs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxScalingGroup withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * The last time that the scaling group was updated in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param lastModifiedTimestamp
     *        The last time that the scaling group was updated in FinSpace. The value is determined as epoch time in
     *        milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *        1635768000000.
     */

    public void setLastModifiedTimestamp(java.util.Date lastModifiedTimestamp) {
        this.lastModifiedTimestamp = lastModifiedTimestamp;
    }

    /**
     * <p>
     * The last time that the scaling group was updated in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @return The last time that the scaling group was updated in FinSpace. The value is determined as epoch time in
     *         milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *         1635768000000.
     */

    public java.util.Date getLastModifiedTimestamp() {
        return this.lastModifiedTimestamp;
    }

    /**
     * <p>
     * The last time that the scaling group was updated in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param lastModifiedTimestamp
     *        The last time that the scaling group was updated in FinSpace. The value is determined as epoch time in
     *        milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *        1635768000000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxScalingGroup withLastModifiedTimestamp(java.util.Date lastModifiedTimestamp) {
        setLastModifiedTimestamp(lastModifiedTimestamp);
        return this;
    }

    /**
     * <p>
     * The timestamp at which the scaling group was created in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param createdTimestamp
     *        The timestamp at which the scaling group was created in FinSpace. The value is determined as epoch time in
     *        milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *        1635768000000.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The timestamp at which the scaling group was created in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @return The timestamp at which the scaling group was created in FinSpace. The value is determined as epoch time
     *         in milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *         1635768000000.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The timestamp at which the scaling group was created in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param createdTimestamp
     *        The timestamp at which the scaling group was created in FinSpace. The value is determined as epoch time in
     *        milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *        1635768000000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxScalingGroup withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
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
        if (getScalingGroupName() != null)
            sb.append("ScalingGroupName: ").append(getScalingGroupName()).append(",");
        if (getHostType() != null)
            sb.append("HostType: ").append(getHostType()).append(",");
        if (getClusters() != null)
            sb.append("Clusters: ").append(getClusters()).append(",");
        if (getAvailabilityZoneId() != null)
            sb.append("AvailabilityZoneId: ").append(getAvailabilityZoneId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getLastModifiedTimestamp() != null)
            sb.append("LastModifiedTimestamp: ").append(getLastModifiedTimestamp()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KxScalingGroup == false)
            return false;
        KxScalingGroup other = (KxScalingGroup) obj;
        if (other.getScalingGroupName() == null ^ this.getScalingGroupName() == null)
            return false;
        if (other.getScalingGroupName() != null && other.getScalingGroupName().equals(this.getScalingGroupName()) == false)
            return false;
        if (other.getHostType() == null ^ this.getHostType() == null)
            return false;
        if (other.getHostType() != null && other.getHostType().equals(this.getHostType()) == false)
            return false;
        if (other.getClusters() == null ^ this.getClusters() == null)
            return false;
        if (other.getClusters() != null && other.getClusters().equals(this.getClusters()) == false)
            return false;
        if (other.getAvailabilityZoneId() == null ^ this.getAvailabilityZoneId() == null)
            return false;
        if (other.getAvailabilityZoneId() != null && other.getAvailabilityZoneId().equals(this.getAvailabilityZoneId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getLastModifiedTimestamp() == null ^ this.getLastModifiedTimestamp() == null)
            return false;
        if (other.getLastModifiedTimestamp() != null && other.getLastModifiedTimestamp().equals(this.getLastModifiedTimestamp()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScalingGroupName() == null) ? 0 : getScalingGroupName().hashCode());
        hashCode = prime * hashCode + ((getHostType() == null) ? 0 : getHostType().hashCode());
        hashCode = prime * hashCode + ((getClusters() == null) ? 0 : getClusters().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZoneId() == null) ? 0 : getAvailabilityZoneId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTimestamp() == null) ? 0 : getLastModifiedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public KxScalingGroup clone() {
        try {
            return (KxScalingGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.finspace.model.transform.KxScalingGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
