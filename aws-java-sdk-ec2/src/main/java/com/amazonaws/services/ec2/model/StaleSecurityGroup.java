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
 * Describes a stale security group (a security group that contains stale rules).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/StaleSecurityGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StaleSecurityGroup implements Serializable, Cloneable {

    /**
     * <p>
     * The description of the security group.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID of the security group.
     * </p>
     */
    private String groupId;
    /**
     * <p>
     * The name of the security group.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * Information about the stale inbound rules in the security group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<StaleIpPermission> staleIpPermissions;
    /**
     * <p>
     * Information about the stale outbound rules in the security group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<StaleIpPermission> staleIpPermissionsEgress;
    /**
     * <p>
     * The ID of the VPC for the security group.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * The description of the security group.
     * </p>
     * 
     * @param description
     *        The description of the security group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the security group.
     * </p>
     * 
     * @return The description of the security group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the security group.
     * </p>
     * 
     * @param description
     *        The description of the security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaleSecurityGroup withDescription(String description) {
        setDescription(description);
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

    public StaleSecurityGroup withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

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

    public StaleSecurityGroup withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * Information about the stale inbound rules in the security group.
     * </p>
     * 
     * @return Information about the stale inbound rules in the security group.
     */

    public java.util.List<StaleIpPermission> getStaleIpPermissions() {
        if (staleIpPermissions == null) {
            staleIpPermissions = new com.amazonaws.internal.SdkInternalList<StaleIpPermission>();
        }
        return staleIpPermissions;
    }

    /**
     * <p>
     * Information about the stale inbound rules in the security group.
     * </p>
     * 
     * @param staleIpPermissions
     *        Information about the stale inbound rules in the security group.
     */

    public void setStaleIpPermissions(java.util.Collection<StaleIpPermission> staleIpPermissions) {
        if (staleIpPermissions == null) {
            this.staleIpPermissions = null;
            return;
        }

        this.staleIpPermissions = new com.amazonaws.internal.SdkInternalList<StaleIpPermission>(staleIpPermissions);
    }

    /**
     * <p>
     * Information about the stale inbound rules in the security group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStaleIpPermissions(java.util.Collection)} or {@link #withStaleIpPermissions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param staleIpPermissions
     *        Information about the stale inbound rules in the security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaleSecurityGroup withStaleIpPermissions(StaleIpPermission... staleIpPermissions) {
        if (this.staleIpPermissions == null) {
            setStaleIpPermissions(new com.amazonaws.internal.SdkInternalList<StaleIpPermission>(staleIpPermissions.length));
        }
        for (StaleIpPermission ele : staleIpPermissions) {
            this.staleIpPermissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the stale inbound rules in the security group.
     * </p>
     * 
     * @param staleIpPermissions
     *        Information about the stale inbound rules in the security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaleSecurityGroup withStaleIpPermissions(java.util.Collection<StaleIpPermission> staleIpPermissions) {
        setStaleIpPermissions(staleIpPermissions);
        return this;
    }

    /**
     * <p>
     * Information about the stale outbound rules in the security group.
     * </p>
     * 
     * @return Information about the stale outbound rules in the security group.
     */

    public java.util.List<StaleIpPermission> getStaleIpPermissionsEgress() {
        if (staleIpPermissionsEgress == null) {
            staleIpPermissionsEgress = new com.amazonaws.internal.SdkInternalList<StaleIpPermission>();
        }
        return staleIpPermissionsEgress;
    }

    /**
     * <p>
     * Information about the stale outbound rules in the security group.
     * </p>
     * 
     * @param staleIpPermissionsEgress
     *        Information about the stale outbound rules in the security group.
     */

    public void setStaleIpPermissionsEgress(java.util.Collection<StaleIpPermission> staleIpPermissionsEgress) {
        if (staleIpPermissionsEgress == null) {
            this.staleIpPermissionsEgress = null;
            return;
        }

        this.staleIpPermissionsEgress = new com.amazonaws.internal.SdkInternalList<StaleIpPermission>(staleIpPermissionsEgress);
    }

    /**
     * <p>
     * Information about the stale outbound rules in the security group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStaleIpPermissionsEgress(java.util.Collection)} or
     * {@link #withStaleIpPermissionsEgress(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param staleIpPermissionsEgress
     *        Information about the stale outbound rules in the security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaleSecurityGroup withStaleIpPermissionsEgress(StaleIpPermission... staleIpPermissionsEgress) {
        if (this.staleIpPermissionsEgress == null) {
            setStaleIpPermissionsEgress(new com.amazonaws.internal.SdkInternalList<StaleIpPermission>(staleIpPermissionsEgress.length));
        }
        for (StaleIpPermission ele : staleIpPermissionsEgress) {
            this.staleIpPermissionsEgress.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the stale outbound rules in the security group.
     * </p>
     * 
     * @param staleIpPermissionsEgress
     *        Information about the stale outbound rules in the security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaleSecurityGroup withStaleIpPermissionsEgress(java.util.Collection<StaleIpPermission> staleIpPermissionsEgress) {
        setStaleIpPermissionsEgress(staleIpPermissionsEgress);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC for the security group.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC for the security group.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC for the security group.
     * </p>
     * 
     * @return The ID of the VPC for the security group.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC for the security group.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC for the security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaleSecurityGroup withVpcId(String vpcId) {
        setVpcId(vpcId);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getGroupId() != null)
            sb.append("GroupId: ").append(getGroupId()).append(",");
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName()).append(",");
        if (getStaleIpPermissions() != null)
            sb.append("StaleIpPermissions: ").append(getStaleIpPermissions()).append(",");
        if (getStaleIpPermissionsEgress() != null)
            sb.append("StaleIpPermissionsEgress: ").append(getStaleIpPermissionsEgress()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StaleSecurityGroup == false)
            return false;
        StaleSecurityGroup other = (StaleSecurityGroup) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getStaleIpPermissions() == null ^ this.getStaleIpPermissions() == null)
            return false;
        if (other.getStaleIpPermissions() != null && other.getStaleIpPermissions().equals(this.getStaleIpPermissions()) == false)
            return false;
        if (other.getStaleIpPermissionsEgress() == null ^ this.getStaleIpPermissionsEgress() == null)
            return false;
        if (other.getStaleIpPermissionsEgress() != null && other.getStaleIpPermissionsEgress().equals(this.getStaleIpPermissionsEgress()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getStaleIpPermissions() == null) ? 0 : getStaleIpPermissions().hashCode());
        hashCode = prime * hashCode + ((getStaleIpPermissionsEgress() == null) ? 0 : getStaleIpPermissionsEgress().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        return hashCode;
    }

    @Override
    public StaleSecurityGroup clone() {
        try {
            return (StaleSecurityGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
