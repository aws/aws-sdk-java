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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about a VPC peering connection between two VPCs: a requester VPC that you own and an accepter
 * VPC with which to create the connection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2VpcPeeringConnectionDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2VpcPeeringConnectionDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the accepter VPC.
     * </p>
     */
    private AwsEc2VpcPeeringConnectionVpcInfoDetails accepterVpcInfo;
    /**
     * <p>
     * The time at which an unaccepted VPC peering connection will expire.
     * </p>
     */
    private String expirationTime;
    /**
     * <p>
     * Information about the requester VPC.
     * </p>
     */
    private AwsEc2VpcPeeringConnectionVpcInfoDetails requesterVpcInfo;
    /**
     * <p>
     * The status of the VPC peering connection.
     * </p>
     */
    private AwsEc2VpcPeeringConnectionStatusDetails status;
    /**
     * <p>
     * The ID of the VPC peering connection.
     * </p>
     */
    private String vpcPeeringConnectionId;

    /**
     * <p>
     * Information about the accepter VPC.
     * </p>
     * 
     * @param accepterVpcInfo
     *        Information about the accepter VPC.
     */

    public void setAccepterVpcInfo(AwsEc2VpcPeeringConnectionVpcInfoDetails accepterVpcInfo) {
        this.accepterVpcInfo = accepterVpcInfo;
    }

    /**
     * <p>
     * Information about the accepter VPC.
     * </p>
     * 
     * @return Information about the accepter VPC.
     */

    public AwsEc2VpcPeeringConnectionVpcInfoDetails getAccepterVpcInfo() {
        return this.accepterVpcInfo;
    }

    /**
     * <p>
     * Information about the accepter VPC.
     * </p>
     * 
     * @param accepterVpcInfo
     *        Information about the accepter VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VpcPeeringConnectionDetails withAccepterVpcInfo(AwsEc2VpcPeeringConnectionVpcInfoDetails accepterVpcInfo) {
        setAccepterVpcInfo(accepterVpcInfo);
        return this;
    }

    /**
     * <p>
     * The time at which an unaccepted VPC peering connection will expire.
     * </p>
     * 
     * @param expirationTime
     *        The time at which an unaccepted VPC peering connection will expire.
     */

    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }

    /**
     * <p>
     * The time at which an unaccepted VPC peering connection will expire.
     * </p>
     * 
     * @return The time at which an unaccepted VPC peering connection will expire.
     */

    public String getExpirationTime() {
        return this.expirationTime;
    }

    /**
     * <p>
     * The time at which an unaccepted VPC peering connection will expire.
     * </p>
     * 
     * @param expirationTime
     *        The time at which an unaccepted VPC peering connection will expire.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VpcPeeringConnectionDetails withExpirationTime(String expirationTime) {
        setExpirationTime(expirationTime);
        return this;
    }

    /**
     * <p>
     * Information about the requester VPC.
     * </p>
     * 
     * @param requesterVpcInfo
     *        Information about the requester VPC.
     */

    public void setRequesterVpcInfo(AwsEc2VpcPeeringConnectionVpcInfoDetails requesterVpcInfo) {
        this.requesterVpcInfo = requesterVpcInfo;
    }

    /**
     * <p>
     * Information about the requester VPC.
     * </p>
     * 
     * @return Information about the requester VPC.
     */

    public AwsEc2VpcPeeringConnectionVpcInfoDetails getRequesterVpcInfo() {
        return this.requesterVpcInfo;
    }

    /**
     * <p>
     * Information about the requester VPC.
     * </p>
     * 
     * @param requesterVpcInfo
     *        Information about the requester VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VpcPeeringConnectionDetails withRequesterVpcInfo(AwsEc2VpcPeeringConnectionVpcInfoDetails requesterVpcInfo) {
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

    public void setStatus(AwsEc2VpcPeeringConnectionStatusDetails status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the VPC peering connection.
     * </p>
     * 
     * @return The status of the VPC peering connection.
     */

    public AwsEc2VpcPeeringConnectionStatusDetails getStatus() {
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

    public AwsEc2VpcPeeringConnectionDetails withStatus(AwsEc2VpcPeeringConnectionStatusDetails status) {
        setStatus(status);
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

    public AwsEc2VpcPeeringConnectionDetails withVpcPeeringConnectionId(String vpcPeeringConnectionId) {
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

        if (obj instanceof AwsEc2VpcPeeringConnectionDetails == false)
            return false;
        AwsEc2VpcPeeringConnectionDetails other = (AwsEc2VpcPeeringConnectionDetails) obj;
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
        hashCode = prime * hashCode + ((getVpcPeeringConnectionId() == null) ? 0 : getVpcPeeringConnectionId().hashCode());
        return hashCode;
    }

    @Override
    public AwsEc2VpcPeeringConnectionDetails clone() {
        try {
            return (AwsEc2VpcPeeringConnectionDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2VpcPeeringConnectionDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
