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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an Availability Zone on a domain.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AvailabilityZoneInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Availability Zone.
     * </p>
     */
    private String availabilityZoneName;
    /**
     * <p>
     * The current state of the Availability Zone. Current options are <code>Active</code> and <code>StandBy</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code> - Data nodes in the Availability Zone are in use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StandBy</code> - Data nodes in the Availability Zone are in a standby state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NotAvailable</code> - Unable to retrieve information.
     * </p>
     * </li>
     * </ul>
     */
    private String zoneStatus;
    /**
     * <p>
     * The total number of data nodes configured in the Availability Zone.
     * </p>
     */
    private String configuredDataNodeCount;
    /**
     * <p>
     * The number of data nodes active in the Availability Zone.
     * </p>
     */
    private String availableDataNodeCount;
    /**
     * <p>
     * The total number of primary and replica shards in the Availability Zone.
     * </p>
     */
    private String totalShards;
    /**
     * <p>
     * The total number of primary and replica shards that aren't allocated to any of the nodes in the Availability
     * Zone.
     * </p>
     */
    private String totalUnAssignedShards;

    /**
     * <p>
     * The name of the Availability Zone.
     * </p>
     * 
     * @param availabilityZoneName
     *        The name of the Availability Zone.
     */

    public void setAvailabilityZoneName(String availabilityZoneName) {
        this.availabilityZoneName = availabilityZoneName;
    }

    /**
     * <p>
     * The name of the Availability Zone.
     * </p>
     * 
     * @return The name of the Availability Zone.
     */

    public String getAvailabilityZoneName() {
        return this.availabilityZoneName;
    }

    /**
     * <p>
     * The name of the Availability Zone.
     * </p>
     * 
     * @param availabilityZoneName
     *        The name of the Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AvailabilityZoneInfo withAvailabilityZoneName(String availabilityZoneName) {
        setAvailabilityZoneName(availabilityZoneName);
        return this;
    }

    /**
     * <p>
     * The current state of the Availability Zone. Current options are <code>Active</code> and <code>StandBy</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code> - Data nodes in the Availability Zone are in use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StandBy</code> - Data nodes in the Availability Zone are in a standby state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NotAvailable</code> - Unable to retrieve information.
     * </p>
     * </li>
     * </ul>
     * 
     * @param zoneStatus
     *        The current state of the Availability Zone. Current options are <code>Active</code> and
     *        <code>StandBy</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Active</code> - Data nodes in the Availability Zone are in use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>StandBy</code> - Data nodes in the Availability Zone are in a standby state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NotAvailable</code> - Unable to retrieve information.
     *        </p>
     *        </li>
     * @see ZoneStatus
     */

    public void setZoneStatus(String zoneStatus) {
        this.zoneStatus = zoneStatus;
    }

    /**
     * <p>
     * The current state of the Availability Zone. Current options are <code>Active</code> and <code>StandBy</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code> - Data nodes in the Availability Zone are in use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StandBy</code> - Data nodes in the Availability Zone are in a standby state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NotAvailable</code> - Unable to retrieve information.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current state of the Availability Zone. Current options are <code>Active</code> and
     *         <code>StandBy</code>.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Active</code> - Data nodes in the Availability Zone are in use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>StandBy</code> - Data nodes in the Availability Zone are in a standby state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NotAvailable</code> - Unable to retrieve information.
     *         </p>
     *         </li>
     * @see ZoneStatus
     */

    public String getZoneStatus() {
        return this.zoneStatus;
    }

    /**
     * <p>
     * The current state of the Availability Zone. Current options are <code>Active</code> and <code>StandBy</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code> - Data nodes in the Availability Zone are in use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StandBy</code> - Data nodes in the Availability Zone are in a standby state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NotAvailable</code> - Unable to retrieve information.
     * </p>
     * </li>
     * </ul>
     * 
     * @param zoneStatus
     *        The current state of the Availability Zone. Current options are <code>Active</code> and
     *        <code>StandBy</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Active</code> - Data nodes in the Availability Zone are in use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>StandBy</code> - Data nodes in the Availability Zone are in a standby state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NotAvailable</code> - Unable to retrieve information.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ZoneStatus
     */

    public AvailabilityZoneInfo withZoneStatus(String zoneStatus) {
        setZoneStatus(zoneStatus);
        return this;
    }

    /**
     * <p>
     * The current state of the Availability Zone. Current options are <code>Active</code> and <code>StandBy</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Active</code> - Data nodes in the Availability Zone are in use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>StandBy</code> - Data nodes in the Availability Zone are in a standby state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NotAvailable</code> - Unable to retrieve information.
     * </p>
     * </li>
     * </ul>
     * 
     * @param zoneStatus
     *        The current state of the Availability Zone. Current options are <code>Active</code> and
     *        <code>StandBy</code>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Active</code> - Data nodes in the Availability Zone are in use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>StandBy</code> - Data nodes in the Availability Zone are in a standby state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NotAvailable</code> - Unable to retrieve information.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ZoneStatus
     */

    public AvailabilityZoneInfo withZoneStatus(ZoneStatus zoneStatus) {
        this.zoneStatus = zoneStatus.toString();
        return this;
    }

    /**
     * <p>
     * The total number of data nodes configured in the Availability Zone.
     * </p>
     * 
     * @param configuredDataNodeCount
     *        The total number of data nodes configured in the Availability Zone.
     */

    public void setConfiguredDataNodeCount(String configuredDataNodeCount) {
        this.configuredDataNodeCount = configuredDataNodeCount;
    }

    /**
     * <p>
     * The total number of data nodes configured in the Availability Zone.
     * </p>
     * 
     * @return The total number of data nodes configured in the Availability Zone.
     */

    public String getConfiguredDataNodeCount() {
        return this.configuredDataNodeCount;
    }

    /**
     * <p>
     * The total number of data nodes configured in the Availability Zone.
     * </p>
     * 
     * @param configuredDataNodeCount
     *        The total number of data nodes configured in the Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AvailabilityZoneInfo withConfiguredDataNodeCount(String configuredDataNodeCount) {
        setConfiguredDataNodeCount(configuredDataNodeCount);
        return this;
    }

    /**
     * <p>
     * The number of data nodes active in the Availability Zone.
     * </p>
     * 
     * @param availableDataNodeCount
     *        The number of data nodes active in the Availability Zone.
     */

    public void setAvailableDataNodeCount(String availableDataNodeCount) {
        this.availableDataNodeCount = availableDataNodeCount;
    }

    /**
     * <p>
     * The number of data nodes active in the Availability Zone.
     * </p>
     * 
     * @return The number of data nodes active in the Availability Zone.
     */

    public String getAvailableDataNodeCount() {
        return this.availableDataNodeCount;
    }

    /**
     * <p>
     * The number of data nodes active in the Availability Zone.
     * </p>
     * 
     * @param availableDataNodeCount
     *        The number of data nodes active in the Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AvailabilityZoneInfo withAvailableDataNodeCount(String availableDataNodeCount) {
        setAvailableDataNodeCount(availableDataNodeCount);
        return this;
    }

    /**
     * <p>
     * The total number of primary and replica shards in the Availability Zone.
     * </p>
     * 
     * @param totalShards
     *        The total number of primary and replica shards in the Availability Zone.
     */

    public void setTotalShards(String totalShards) {
        this.totalShards = totalShards;
    }

    /**
     * <p>
     * The total number of primary and replica shards in the Availability Zone.
     * </p>
     * 
     * @return The total number of primary and replica shards in the Availability Zone.
     */

    public String getTotalShards() {
        return this.totalShards;
    }

    /**
     * <p>
     * The total number of primary and replica shards in the Availability Zone.
     * </p>
     * 
     * @param totalShards
     *        The total number of primary and replica shards in the Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AvailabilityZoneInfo withTotalShards(String totalShards) {
        setTotalShards(totalShards);
        return this;
    }

    /**
     * <p>
     * The total number of primary and replica shards that aren't allocated to any of the nodes in the Availability
     * Zone.
     * </p>
     * 
     * @param totalUnAssignedShards
     *        The total number of primary and replica shards that aren't allocated to any of the nodes in the
     *        Availability Zone.
     */

    public void setTotalUnAssignedShards(String totalUnAssignedShards) {
        this.totalUnAssignedShards = totalUnAssignedShards;
    }

    /**
     * <p>
     * The total number of primary and replica shards that aren't allocated to any of the nodes in the Availability
     * Zone.
     * </p>
     * 
     * @return The total number of primary and replica shards that aren't allocated to any of the nodes in the
     *         Availability Zone.
     */

    public String getTotalUnAssignedShards() {
        return this.totalUnAssignedShards;
    }

    /**
     * <p>
     * The total number of primary and replica shards that aren't allocated to any of the nodes in the Availability
     * Zone.
     * </p>
     * 
     * @param totalUnAssignedShards
     *        The total number of primary and replica shards that aren't allocated to any of the nodes in the
     *        Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AvailabilityZoneInfo withTotalUnAssignedShards(String totalUnAssignedShards) {
        setTotalUnAssignedShards(totalUnAssignedShards);
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
        if (getAvailabilityZoneName() != null)
            sb.append("AvailabilityZoneName: ").append(getAvailabilityZoneName()).append(",");
        if (getZoneStatus() != null)
            sb.append("ZoneStatus: ").append(getZoneStatus()).append(",");
        if (getConfiguredDataNodeCount() != null)
            sb.append("ConfiguredDataNodeCount: ").append(getConfiguredDataNodeCount()).append(",");
        if (getAvailableDataNodeCount() != null)
            sb.append("AvailableDataNodeCount: ").append(getAvailableDataNodeCount()).append(",");
        if (getTotalShards() != null)
            sb.append("TotalShards: ").append(getTotalShards()).append(",");
        if (getTotalUnAssignedShards() != null)
            sb.append("TotalUnAssignedShards: ").append(getTotalUnAssignedShards());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AvailabilityZoneInfo == false)
            return false;
        AvailabilityZoneInfo other = (AvailabilityZoneInfo) obj;
        if (other.getAvailabilityZoneName() == null ^ this.getAvailabilityZoneName() == null)
            return false;
        if (other.getAvailabilityZoneName() != null && other.getAvailabilityZoneName().equals(this.getAvailabilityZoneName()) == false)
            return false;
        if (other.getZoneStatus() == null ^ this.getZoneStatus() == null)
            return false;
        if (other.getZoneStatus() != null && other.getZoneStatus().equals(this.getZoneStatus()) == false)
            return false;
        if (other.getConfiguredDataNodeCount() == null ^ this.getConfiguredDataNodeCount() == null)
            return false;
        if (other.getConfiguredDataNodeCount() != null && other.getConfiguredDataNodeCount().equals(this.getConfiguredDataNodeCount()) == false)
            return false;
        if (other.getAvailableDataNodeCount() == null ^ this.getAvailableDataNodeCount() == null)
            return false;
        if (other.getAvailableDataNodeCount() != null && other.getAvailableDataNodeCount().equals(this.getAvailableDataNodeCount()) == false)
            return false;
        if (other.getTotalShards() == null ^ this.getTotalShards() == null)
            return false;
        if (other.getTotalShards() != null && other.getTotalShards().equals(this.getTotalShards()) == false)
            return false;
        if (other.getTotalUnAssignedShards() == null ^ this.getTotalUnAssignedShards() == null)
            return false;
        if (other.getTotalUnAssignedShards() != null && other.getTotalUnAssignedShards().equals(this.getTotalUnAssignedShards()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityZoneName() == null) ? 0 : getAvailabilityZoneName().hashCode());
        hashCode = prime * hashCode + ((getZoneStatus() == null) ? 0 : getZoneStatus().hashCode());
        hashCode = prime * hashCode + ((getConfiguredDataNodeCount() == null) ? 0 : getConfiguredDataNodeCount().hashCode());
        hashCode = prime * hashCode + ((getAvailableDataNodeCount() == null) ? 0 : getAvailableDataNodeCount().hashCode());
        hashCode = prime * hashCode + ((getTotalShards() == null) ? 0 : getTotalShards().hashCode());
        hashCode = prime * hashCode + ((getTotalUnAssignedShards() == null) ? 0 : getTotalUnAssignedShards().hashCode());
        return hashCode;
    }

    @Override
    public AvailabilityZoneInfo clone() {
        try {
            return (AvailabilityZoneInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.AvailabilityZoneInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
