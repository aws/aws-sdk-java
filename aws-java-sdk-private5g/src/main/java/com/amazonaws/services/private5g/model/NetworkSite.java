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
package com.amazonaws.services.private5g.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a network site.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/NetworkSite" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkSite implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The parent Availability Zone for the network site.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The parent Availability Zone ID for the network site.
     * </p>
     */
    private String availabilityZoneId;
    /**
     * <p>
     * The creation time of the network site.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The current plan of the network site.
     * </p>
     */
    private SitePlan currentPlan;
    /**
     * <p>
     * The description of the network site.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network to which the network site belongs.
     * </p>
     */
    private String networkArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network site.
     * </p>
     */
    private String networkSiteArn;
    /**
     * <p>
     * The name of the network site.
     * </p>
     */
    private String networkSiteName;
    /**
     * <p>
     * The pending plan of the network site.
     * </p>
     */
    private SitePlan pendingPlan;
    /**
     * <p>
     * The status of the network site.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The status reason of the network site.
     * </p>
     */
    private String statusReason;

    /**
     * <p>
     * The parent Availability Zone for the network site.
     * </p>
     * 
     * @param availabilityZone
     *        The parent Availability Zone for the network site.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The parent Availability Zone for the network site.
     * </p>
     * 
     * @return The parent Availability Zone for the network site.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The parent Availability Zone for the network site.
     * </p>
     * 
     * @param availabilityZone
     *        The parent Availability Zone for the network site.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkSite withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The parent Availability Zone ID for the network site.
     * </p>
     * 
     * @param availabilityZoneId
     *        The parent Availability Zone ID for the network site.
     */

    public void setAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
    }

    /**
     * <p>
     * The parent Availability Zone ID for the network site.
     * </p>
     * 
     * @return The parent Availability Zone ID for the network site.
     */

    public String getAvailabilityZoneId() {
        return this.availabilityZoneId;
    }

    /**
     * <p>
     * The parent Availability Zone ID for the network site.
     * </p>
     * 
     * @param availabilityZoneId
     *        The parent Availability Zone ID for the network site.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkSite withAvailabilityZoneId(String availabilityZoneId) {
        setAvailabilityZoneId(availabilityZoneId);
        return this;
    }

    /**
     * <p>
     * The creation time of the network site.
     * </p>
     * 
     * @param createdAt
     *        The creation time of the network site.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The creation time of the network site.
     * </p>
     * 
     * @return The creation time of the network site.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The creation time of the network site.
     * </p>
     * 
     * @param createdAt
     *        The creation time of the network site.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkSite withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The current plan of the network site.
     * </p>
     * 
     * @param currentPlan
     *        The current plan of the network site.
     */

    public void setCurrentPlan(SitePlan currentPlan) {
        this.currentPlan = currentPlan;
    }

    /**
     * <p>
     * The current plan of the network site.
     * </p>
     * 
     * @return The current plan of the network site.
     */

    public SitePlan getCurrentPlan() {
        return this.currentPlan;
    }

    /**
     * <p>
     * The current plan of the network site.
     * </p>
     * 
     * @param currentPlan
     *        The current plan of the network site.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkSite withCurrentPlan(SitePlan currentPlan) {
        setCurrentPlan(currentPlan);
        return this;
    }

    /**
     * <p>
     * The description of the network site.
     * </p>
     * 
     * @param description
     *        The description of the network site.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the network site.
     * </p>
     * 
     * @return The description of the network site.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the network site.
     * </p>
     * 
     * @param description
     *        The description of the network site.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkSite withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network to which the network site belongs.
     * </p>
     * 
     * @param networkArn
     *        The Amazon Resource Name (ARN) of the network to which the network site belongs.
     */

    public void setNetworkArn(String networkArn) {
        this.networkArn = networkArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network to which the network site belongs.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the network to which the network site belongs.
     */

    public String getNetworkArn() {
        return this.networkArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network to which the network site belongs.
     * </p>
     * 
     * @param networkArn
     *        The Amazon Resource Name (ARN) of the network to which the network site belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkSite withNetworkArn(String networkArn) {
        setNetworkArn(networkArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network site.
     * </p>
     * 
     * @param networkSiteArn
     *        The Amazon Resource Name (ARN) of the network site.
     */

    public void setNetworkSiteArn(String networkSiteArn) {
        this.networkSiteArn = networkSiteArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network site.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the network site.
     */

    public String getNetworkSiteArn() {
        return this.networkSiteArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the network site.
     * </p>
     * 
     * @param networkSiteArn
     *        The Amazon Resource Name (ARN) of the network site.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkSite withNetworkSiteArn(String networkSiteArn) {
        setNetworkSiteArn(networkSiteArn);
        return this;
    }

    /**
     * <p>
     * The name of the network site.
     * </p>
     * 
     * @param networkSiteName
     *        The name of the network site.
     */

    public void setNetworkSiteName(String networkSiteName) {
        this.networkSiteName = networkSiteName;
    }

    /**
     * <p>
     * The name of the network site.
     * </p>
     * 
     * @return The name of the network site.
     */

    public String getNetworkSiteName() {
        return this.networkSiteName;
    }

    /**
     * <p>
     * The name of the network site.
     * </p>
     * 
     * @param networkSiteName
     *        The name of the network site.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkSite withNetworkSiteName(String networkSiteName) {
        setNetworkSiteName(networkSiteName);
        return this;
    }

    /**
     * <p>
     * The pending plan of the network site.
     * </p>
     * 
     * @param pendingPlan
     *        The pending plan of the network site.
     */

    public void setPendingPlan(SitePlan pendingPlan) {
        this.pendingPlan = pendingPlan;
    }

    /**
     * <p>
     * The pending plan of the network site.
     * </p>
     * 
     * @return The pending plan of the network site.
     */

    public SitePlan getPendingPlan() {
        return this.pendingPlan;
    }

    /**
     * <p>
     * The pending plan of the network site.
     * </p>
     * 
     * @param pendingPlan
     *        The pending plan of the network site.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkSite withPendingPlan(SitePlan pendingPlan) {
        setPendingPlan(pendingPlan);
        return this;
    }

    /**
     * <p>
     * The status of the network site.
     * </p>
     * 
     * @param status
     *        The status of the network site.
     * @see NetworkSiteStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the network site.
     * </p>
     * 
     * @return The status of the network site.
     * @see NetworkSiteStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the network site.
     * </p>
     * 
     * @param status
     *        The status of the network site.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkSiteStatus
     */

    public NetworkSite withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the network site.
     * </p>
     * 
     * @param status
     *        The status of the network site.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NetworkSiteStatus
     */

    public NetworkSite withStatus(NetworkSiteStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The status reason of the network site.
     * </p>
     * 
     * @param statusReason
     *        The status reason of the network site.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The status reason of the network site.
     * </p>
     * 
     * @return The status reason of the network site.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The status reason of the network site.
     * </p>
     * 
     * @param statusReason
     *        The status reason of the network site.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkSite withStatusReason(String statusReason) {
        setStatusReason(statusReason);
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
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getAvailabilityZoneId() != null)
            sb.append("AvailabilityZoneId: ").append(getAvailabilityZoneId()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCurrentPlan() != null)
            sb.append("CurrentPlan: ").append(getCurrentPlan()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getNetworkArn() != null)
            sb.append("NetworkArn: ").append(getNetworkArn()).append(",");
        if (getNetworkSiteArn() != null)
            sb.append("NetworkSiteArn: ").append(getNetworkSiteArn()).append(",");
        if (getNetworkSiteName() != null)
            sb.append("NetworkSiteName: ").append(getNetworkSiteName()).append(",");
        if (getPendingPlan() != null)
            sb.append("PendingPlan: ").append(getPendingPlan()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkSite == false)
            return false;
        NetworkSite other = (NetworkSite) obj;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getAvailabilityZoneId() == null ^ this.getAvailabilityZoneId() == null)
            return false;
        if (other.getAvailabilityZoneId() != null && other.getAvailabilityZoneId().equals(this.getAvailabilityZoneId()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCurrentPlan() == null ^ this.getCurrentPlan() == null)
            return false;
        if (other.getCurrentPlan() != null && other.getCurrentPlan().equals(this.getCurrentPlan()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getNetworkArn() == null ^ this.getNetworkArn() == null)
            return false;
        if (other.getNetworkArn() != null && other.getNetworkArn().equals(this.getNetworkArn()) == false)
            return false;
        if (other.getNetworkSiteArn() == null ^ this.getNetworkSiteArn() == null)
            return false;
        if (other.getNetworkSiteArn() != null && other.getNetworkSiteArn().equals(this.getNetworkSiteArn()) == false)
            return false;
        if (other.getNetworkSiteName() == null ^ this.getNetworkSiteName() == null)
            return false;
        if (other.getNetworkSiteName() != null && other.getNetworkSiteName().equals(this.getNetworkSiteName()) == false)
            return false;
        if (other.getPendingPlan() == null ^ this.getPendingPlan() == null)
            return false;
        if (other.getPendingPlan() != null && other.getPendingPlan().equals(this.getPendingPlan()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZoneId() == null) ? 0 : getAvailabilityZoneId().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCurrentPlan() == null) ? 0 : getCurrentPlan().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getNetworkArn() == null) ? 0 : getNetworkArn().hashCode());
        hashCode = prime * hashCode + ((getNetworkSiteArn() == null) ? 0 : getNetworkSiteArn().hashCode());
        hashCode = prime * hashCode + ((getNetworkSiteName() == null) ? 0 : getNetworkSiteName().hashCode());
        hashCode = prime * hashCode + ((getPendingPlan() == null) ? 0 : getPendingPlan().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        return hashCode;
    }

    @Override
    public NetworkSite clone() {
        try {
            return (NetworkSite) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.private5g.model.transform.NetworkSiteMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
