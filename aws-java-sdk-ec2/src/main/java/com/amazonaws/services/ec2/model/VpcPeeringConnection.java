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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a VPC peering connection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/VpcPeeringConnection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcPeeringConnection implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the accepter VPC. CIDR block information is only returned when describing an active VPC peering
     * connection.
     * </p>
     */
    private VpcPeeringConnectionVpcInfo accepterVpcInfo;
    /**
     * <p>
     * The time that an unaccepted VPC peering connection will expire.
     * </p>
     */
    private java.util.Date expirationTime;
    /**
     * <p>
     * Information about the requester VPC. CIDR block information is only returned when describing an active VPC
     * peering connection.
     * </p>
     */
    private VpcPeeringConnectionVpcInfo requesterVpcInfo;
    /**
     * <p>
     * The status of the VPC peering connection.
     * </p>
     */
    private VpcPeeringConnectionStateReason status;
    /**
     * <p>
     * Any tags assigned to the resource.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The ID of the VPC peering connection.
     * </p>
     */
    private String vpcPeeringConnectionId;

    /**
     * <p>
     * Information about the accepter VPC. CIDR block information is only returned when describing an active VPC peering
     * connection.
     * </p>
     * 
     * @param accepterVpcInfo
     *        Information about the accepter VPC. CIDR block information is only returned when describing an active VPC
     *        peering connection.
     */

    public void setAccepterVpcInfo(VpcPeeringConnectionVpcInfo accepterVpcInfo) {
        this.accepterVpcInfo = accepterVpcInfo;
    }

    /**
     * <p>
     * Information about the accepter VPC. CIDR block information is only returned when describing an active VPC peering
     * connection.
     * </p>
     * 
     * @return Information about the accepter VPC. CIDR block information is only returned when describing an active VPC
     *         peering connection.
     */

    public VpcPeeringConnectionVpcInfo getAccepterVpcInfo() {
        return this.accepterVpcInfo;
    }

    /**
     * <p>
     * Information about the accepter VPC. CIDR block information is only returned when describing an active VPC peering
     * connection.
     * </p>
     * 
     * @param accepterVpcInfo
     *        Information about the accepter VPC. CIDR block information is only returned when describing an active VPC
     *        peering connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcPeeringConnection withAccepterVpcInfo(VpcPeeringConnectionVpcInfo accepterVpcInfo) {
        setAccepterVpcInfo(accepterVpcInfo);
        return this;
    }

    /**
     * <p>
     * The time that an unaccepted VPC peering connection will expire.
     * </p>
     * 
     * @param expirationTime
     *        The time that an unaccepted VPC peering connection will expire.
     */

    public void setExpirationTime(java.util.Date expirationTime) {
        this.expirationTime = expirationTime;
    }

    /**
     * <p>
     * The time that an unaccepted VPC peering connection will expire.
     * </p>
     * 
     * @return The time that an unaccepted VPC peering connection will expire.
     */

    public java.util.Date getExpirationTime() {
        return this.expirationTime;
    }

    /**
     * <p>
     * The time that an unaccepted VPC peering connection will expire.
     * </p>
     * 
     * @param expirationTime
     *        The time that an unaccepted VPC peering connection will expire.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcPeeringConnection withExpirationTime(java.util.Date expirationTime) {
        setExpirationTime(expirationTime);
        return this;
    }

    /**
     * <p>
     * Information about the requester VPC. CIDR block information is only returned when describing an active VPC
     * peering connection.
     * </p>
     * 
     * @param requesterVpcInfo
     *        Information about the requester VPC. CIDR block information is only returned when describing an active VPC
     *        peering connection.
     */

    public void setRequesterVpcInfo(VpcPeeringConnectionVpcInfo requesterVpcInfo) {
        this.requesterVpcInfo = requesterVpcInfo;
    }

    /**
     * <p>
     * Information about the requester VPC. CIDR block information is only returned when describing an active VPC
     * peering connection.
     * </p>
     * 
     * @return Information about the requester VPC. CIDR block information is only returned when describing an active
     *         VPC peering connection.
     */

    public VpcPeeringConnectionVpcInfo getRequesterVpcInfo() {
        return this.requesterVpcInfo;
    }

    /**
     * <p>
     * Information about the requester VPC. CIDR block information is only returned when describing an active VPC
     * peering connection.
     * </p>
     * 
     * @param requesterVpcInfo
     *        Information about the requester VPC. CIDR block information is only returned when describing an active VPC
     *        peering connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcPeeringConnection withRequesterVpcInfo(VpcPeeringConnectionVpcInfo requesterVpcInfo) {
        setRequesterVpcInfo(requesterVpcInfo);
        return this;
    }

    /**
     * <p>
     * The status of the VPC peering connection.
     * </p>
     * 
     * @param status
     *        The status of the VPC peering connection.
     */

    public void setStatus(VpcPeeringConnectionStateReason status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the VPC peering connection.
     * </p>
     * 
     * @return The status of the VPC peering connection.
     */

    public VpcPeeringConnectionStateReason getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the VPC peering connection.
     * </p>
     * 
     * @param status
     *        The status of the VPC peering connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcPeeringConnection withStatus(VpcPeeringConnectionStateReason status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the resource.
     * </p>
     * 
     * @return Any tags assigned to the resource.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the resource.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the resource.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * Any tags assigned to the resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcPeeringConnection withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the resource.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcPeeringConnection withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC peering connection.
     * </p>
     * 
     * @param vpcPeeringConnectionId
     *        The ID of the VPC peering connection.
     */

    public void setVpcPeeringConnectionId(String vpcPeeringConnectionId) {
        this.vpcPeeringConnectionId = vpcPeeringConnectionId;
    }

    /**
     * <p>
     * The ID of the VPC peering connection.
     * </p>
     * 
     * @return The ID of the VPC peering connection.
     */

    public String getVpcPeeringConnectionId() {
        return this.vpcPeeringConnectionId;
    }

    /**
     * <p>
     * The ID of the VPC peering connection.
     * </p>
     * 
     * @param vpcPeeringConnectionId
     *        The ID of the VPC peering connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VpcPeeringConnection withVpcPeeringConnectionId(String vpcPeeringConnectionId) {
        setVpcPeeringConnectionId(vpcPeeringConnectionId);
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
        if (getAccepterVpcInfo() != null)
            sb.append("AccepterVpcInfo: ").append(getAccepterVpcInfo()).append(",");
        if (getExpirationTime() != null)
            sb.append("ExpirationTime: ").append(getExpirationTime()).append(",");
        if (getRequesterVpcInfo() != null)
            sb.append("RequesterVpcInfo: ").append(getRequesterVpcInfo()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getVpcPeeringConnectionId() != null)
            sb.append("VpcPeeringConnectionId: ").append(getVpcPeeringConnectionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcPeeringConnection == false)
            return false;
        VpcPeeringConnection other = (VpcPeeringConnection) obj;
        if (other.getAccepterVpcInfo() == null ^ this.getAccepterVpcInfo() == null)
            return false;
        if (other.getAccepterVpcInfo() != null && other.getAccepterVpcInfo().equals(this.getAccepterVpcInfo()) == false)
            return false;
        if (other.getExpirationTime() == null ^ this.getExpirationTime() == null)
            return false;
        if (other.getExpirationTime() != null && other.getExpirationTime().equals(this.getExpirationTime()) == false)
            return false;
        if (other.getRequesterVpcInfo() == null ^ this.getRequesterVpcInfo() == null)
            return false;
        if (other.getRequesterVpcInfo() != null && other.getRequesterVpcInfo().equals(this.getRequesterVpcInfo()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVpcPeeringConnectionId() == null ^ this.getVpcPeeringConnectionId() == null)
            return false;
        if (other.getVpcPeeringConnectionId() != null && other.getVpcPeeringConnectionId().equals(this.getVpcPeeringConnectionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccepterVpcInfo() == null) ? 0 : getAccepterVpcInfo().hashCode());
        hashCode = prime * hashCode + ((getExpirationTime() == null) ? 0 : getExpirationTime().hashCode());
        hashCode = prime * hashCode + ((getRequesterVpcInfo() == null) ? 0 : getRequesterVpcInfo().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVpcPeeringConnectionId() == null) ? 0 : getVpcPeeringConnectionId().hashCode());
        return hashCode;
    }

    @Override
    public VpcPeeringConnection clone() {
        try {
            return (VpcPeeringConnection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
