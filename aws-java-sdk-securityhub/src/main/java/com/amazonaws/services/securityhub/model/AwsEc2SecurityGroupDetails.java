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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about an EC2 security group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2SecurityGroupDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2SecurityGroupDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the security group.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The ID of the security group.
     * </p>
     */
    private String groupId;
    /**
     * <p>
     * The AWS account ID of the owner of the security group.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * [VPC only] The ID of the VPC for the security group.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The inbound rules associated with the security group.
     * </p>
     */
    private java.util.List<AwsEc2SecurityGroupIpPermission> ipPermissions;
    /**
     * <p>
     * [VPC only] The outbound rules associated with the security group.
     * </p>
     */
    private java.util.List<AwsEc2SecurityGroupIpPermission> ipPermissionsEgress;

    /**
     * <p>
     * The name of the security group.
     * </p>
     * 
     * @param groupName
     *        The name of the security group.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the security group.
     * </p>
     * 
     * @return The name of the security group.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The name of the security group.
     * </p>
     * 
     * @param groupName
     *        The name of the security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2SecurityGroupDetails withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The ID of the security group.
     * </p>
     * 
     * @param groupId
     *        The ID of the security group.
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * <p>
     * The ID of the security group.
     * </p>
     * 
     * @return The ID of the security group.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * <p>
     * The ID of the security group.
     * </p>
     * 
     * @param groupId
     *        The ID of the security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2SecurityGroupDetails withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the security group.
     * </p>
     * 
     * @param ownerId
     *        The AWS account ID of the owner of the security group.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the security group.
     * </p>
     * 
     * @return The AWS account ID of the owner of the security group.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The AWS account ID of the owner of the security group.
     * </p>
     * 
     * @param ownerId
     *        The AWS account ID of the owner of the security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2SecurityGroupDetails withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * [VPC only] The ID of the VPC for the security group.
     * </p>
     * 
     * @param vpcId
     *        [VPC only] The ID of the VPC for the security group.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * [VPC only] The ID of the VPC for the security group.
     * </p>
     * 
     * @return [VPC only] The ID of the VPC for the security group.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * [VPC only] The ID of the VPC for the security group.
     * </p>
     * 
     * @param vpcId
     *        [VPC only] The ID of the VPC for the security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2SecurityGroupDetails withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The inbound rules associated with the security group.
     * </p>
     * 
     * @return The inbound rules associated with the security group.
     */

    public java.util.List<AwsEc2SecurityGroupIpPermission> getIpPermissions() {
        return ipPermissions;
    }

    /**
     * <p>
     * The inbound rules associated with the security group.
     * </p>
     * 
     * @param ipPermissions
     *        The inbound rules associated with the security group.
     */

    public void setIpPermissions(java.util.Collection<AwsEc2SecurityGroupIpPermission> ipPermissions) {
        if (ipPermissions == null) {
            this.ipPermissions = null;
            return;
        }

        this.ipPermissions = new java.util.ArrayList<AwsEc2SecurityGroupIpPermission>(ipPermissions);
    }

    /**
     * <p>
     * The inbound rules associated with the security group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpPermissions(java.util.Collection)} or {@link #withIpPermissions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param ipPermissions
     *        The inbound rules associated with the security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2SecurityGroupDetails withIpPermissions(AwsEc2SecurityGroupIpPermission... ipPermissions) {
        if (this.ipPermissions == null) {
            setIpPermissions(new java.util.ArrayList<AwsEc2SecurityGroupIpPermission>(ipPermissions.length));
        }
        for (AwsEc2SecurityGroupIpPermission ele : ipPermissions) {
            this.ipPermissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The inbound rules associated with the security group.
     * </p>
     * 
     * @param ipPermissions
     *        The inbound rules associated with the security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2SecurityGroupDetails withIpPermissions(java.util.Collection<AwsEc2SecurityGroupIpPermission> ipPermissions) {
        setIpPermissions(ipPermissions);
        return this;
    }

    /**
     * <p>
     * [VPC only] The outbound rules associated with the security group.
     * </p>
     * 
     * @return [VPC only] The outbound rules associated with the security group.
     */

    public java.util.List<AwsEc2SecurityGroupIpPermission> getIpPermissionsEgress() {
        return ipPermissionsEgress;
    }

    /**
     * <p>
     * [VPC only] The outbound rules associated with the security group.
     * </p>
     * 
     * @param ipPermissionsEgress
     *        [VPC only] The outbound rules associated with the security group.
     */

    public void setIpPermissionsEgress(java.util.Collection<AwsEc2SecurityGroupIpPermission> ipPermissionsEgress) {
        if (ipPermissionsEgress == null) {
            this.ipPermissionsEgress = null;
            return;
        }

        this.ipPermissionsEgress = new java.util.ArrayList<AwsEc2SecurityGroupIpPermission>(ipPermissionsEgress);
    }

    /**
     * <p>
     * [VPC only] The outbound rules associated with the security group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpPermissionsEgress(java.util.Collection)} or {@link #withIpPermissionsEgress(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param ipPermissionsEgress
     *        [VPC only] The outbound rules associated with the security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2SecurityGroupDetails withIpPermissionsEgress(AwsEc2SecurityGroupIpPermission... ipPermissionsEgress) {
        if (this.ipPermissionsEgress == null) {
            setIpPermissionsEgress(new java.util.ArrayList<AwsEc2SecurityGroupIpPermission>(ipPermissionsEgress.length));
        }
        for (AwsEc2SecurityGroupIpPermission ele : ipPermissionsEgress) {
            this.ipPermissionsEgress.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * [VPC only] The outbound rules associated with the security group.
     * </p>
     * 
     * @param ipPermissionsEgress
     *        [VPC only] The outbound rules associated with the security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2SecurityGroupDetails withIpPermissionsEgress(java.util.Collection<AwsEc2SecurityGroupIpPermission> ipPermissionsEgress) {
        setIpPermissionsEgress(ipPermissionsEgress);
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
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName()).append(",");
        if (getGroupId() != null)
            sb.append("GroupId: ").append(getGroupId()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getIpPermissions() != null)
            sb.append("IpPermissions: ").append(getIpPermissions()).append(",");
        if (getIpPermissionsEgress() != null)
            sb.append("IpPermissionsEgress: ").append(getIpPermissionsEgress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2SecurityGroupDetails == false)
            return false;
        AwsEc2SecurityGroupDetails other = (AwsEc2SecurityGroupDetails) obj;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getIpPermissions() == null ^ this.getIpPermissions() == null)
            return false;
        if (other.getIpPermissions() != null && other.getIpPermissions().equals(this.getIpPermissions()) == false)
            return false;
        if (other.getIpPermissionsEgress() == null ^ this.getIpPermissionsEgress() == null)
            return false;
        if (other.getIpPermissionsEgress() != null && other.getIpPermissionsEgress().equals(this.getIpPermissionsEgress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getIpPermissions() == null) ? 0 : getIpPermissions().hashCode());
        hashCode = prime * hashCode + ((getIpPermissionsEgress() == null) ? 0 : getIpPermissionsEgress().hashCode());
        return hashCode;
    }

    @Override
    public AwsEc2SecurityGroupDetails clone() {
        try {
            return (AwsEc2SecurityGroupDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2SecurityGroupDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
