/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directory.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about the directory.
 * </p>
 */
public class DirectoryVpcSettingsDescription implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the VPC that the directory is in.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The identifiers of the subnets for the directory servers.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> subnetIds;
    /**
     * <p>
     * The security group identifier for the directory. If the directory was created before 8/1/2014, this is the
     * identifier of the directory members security group that was created when the directory was created. If the
     * directory was created after this date, this value is null.
     * </p>
     */
    private String securityGroupId;
    /**
     * <p>
     * The list of Availability Zones that the directory is in.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> availabilityZones;

    /**
     * <p>
     * The identifier of the VPC that the directory is in.
     * </p>
     * 
     * @param vpcId
     *        The identifier of the VPC that the directory is in.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The identifier of the VPC that the directory is in.
     * </p>
     * 
     * @return The identifier of the VPC that the directory is in.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The identifier of the VPC that the directory is in.
     * </p>
     * 
     * @param vpcId
     *        The identifier of the VPC that the directory is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryVpcSettingsDescription withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The identifiers of the subnets for the directory servers.
     * </p>
     * 
     * @return The identifiers of the subnets for the directory servers.
     */

    public java.util.List<String> getSubnetIds() {
        if (subnetIds == null) {
            subnetIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return subnetIds;
    }

    /**
     * <p>
     * The identifiers of the subnets for the directory servers.
     * </p>
     * 
     * @param subnetIds
     *        The identifiers of the subnets for the directory servers.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new com.amazonaws.internal.SdkInternalList<String>(subnetIds);
    }

    /**
     * <p>
     * The identifiers of the subnets for the directory servers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        The identifiers of the subnets for the directory servers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryVpcSettingsDescription withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new com.amazonaws.internal.SdkInternalList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifiers of the subnets for the directory servers.
     * </p>
     * 
     * @param subnetIds
     *        The identifiers of the subnets for the directory servers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryVpcSettingsDescription withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The security group identifier for the directory. If the directory was created before 8/1/2014, this is the
     * identifier of the directory members security group that was created when the directory was created. If the
     * directory was created after this date, this value is null.
     * </p>
     * 
     * @param securityGroupId
     *        The security group identifier for the directory. If the directory was created before 8/1/2014, this is the
     *        identifier of the directory members security group that was created when the directory was created. If the
     *        directory was created after this date, this value is null.
     */

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    /**
     * <p>
     * The security group identifier for the directory. If the directory was created before 8/1/2014, this is the
     * identifier of the directory members security group that was created when the directory was created. If the
     * directory was created after this date, this value is null.
     * </p>
     * 
     * @return The security group identifier for the directory. If the directory was created before 8/1/2014, this is
     *         the identifier of the directory members security group that was created when the directory was created.
     *         If the directory was created after this date, this value is null.
     */

    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * <p>
     * The security group identifier for the directory. If the directory was created before 8/1/2014, this is the
     * identifier of the directory members security group that was created when the directory was created. If the
     * directory was created after this date, this value is null.
     * </p>
     * 
     * @param securityGroupId
     *        The security group identifier for the directory. If the directory was created before 8/1/2014, this is the
     *        identifier of the directory members security group that was created when the directory was created. If the
     *        directory was created after this date, this value is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryVpcSettingsDescription withSecurityGroupId(String securityGroupId) {
        setSecurityGroupId(securityGroupId);
        return this;
    }

    /**
     * <p>
     * The list of Availability Zones that the directory is in.
     * </p>
     * 
     * @return The list of Availability Zones that the directory is in.
     */

    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
            availabilityZones = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return availabilityZones;
    }

    /**
     * <p>
     * The list of Availability Zones that the directory is in.
     * </p>
     * 
     * @param availabilityZones
     *        The list of Availability Zones that the directory is in.
     */

    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new com.amazonaws.internal.SdkInternalList<String>(availabilityZones);
    }

    /**
     * <p>
     * The list of Availability Zones that the directory is in.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        The list of Availability Zones that the directory is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryVpcSettingsDescription withAvailabilityZones(String... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new com.amazonaws.internal.SdkInternalList<String>(availabilityZones.length));
        }
        for (String ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of Availability Zones that the directory is in.
     * </p>
     * 
     * @param availabilityZones
     *        The list of Availability Zones that the directory is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DirectoryVpcSettingsDescription withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: " + getSubnetIds() + ",");
        if (getSecurityGroupId() != null)
            sb.append("SecurityGroupId: " + getSecurityGroupId() + ",");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: " + getAvailabilityZones());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DirectoryVpcSettingsDescription == false)
            return false;
        DirectoryVpcSettingsDescription other = (DirectoryVpcSettingsDescription) obj;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getSecurityGroupId() == null ^ this.getSecurityGroupId() == null)
            return false;
        if (other.getSecurityGroupId() != null && other.getSecurityGroupId().equals(this.getSecurityGroupId()) == false)
            return false;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupId() == null) ? 0 : getSecurityGroupId().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        return hashCode;
    }

    @Override
    public DirectoryVpcSettingsDescription clone() {
        try {
            return (DirectoryVpcSettingsDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
