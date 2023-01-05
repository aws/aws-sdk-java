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
package com.amazonaws.services.snowdevicemanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The description of an instance. Currently, Amazon EC2 instances are the only supported instance type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/Instance" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Instance implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Machine Image (AMI) launch index, which you can use to find this instance in the launch group.
     * </p>
     */
    private Integer amiLaunchIndex;
    /**
     * <p>
     * Any block device mapping entries for the instance.
     * </p>
     */
    private java.util.List<InstanceBlockDeviceMapping> blockDeviceMappings;
    /**
     * <p>
     * The CPU options for the instance.
     * </p>
     */
    private CpuOptions cpuOptions;
    /**
     * <p>
     * When the instance was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The ID of the AMI used to launch the instance.
     * </p>
     */
    private String imageId;
    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The instance type.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The private IPv4 address assigned to the instance.
     * </p>
     */
    private String privateIpAddress;
    /**
     * <p>
     * The public IPv4 address assigned to the instance.
     * </p>
     */
    private String publicIpAddress;
    /**
     * <p>
     * The device name of the root device volume (for example, <code>/dev/sda1</code>).
     * </p>
     */
    private String rootDeviceName;
    /**
     * <p>
     * The security groups for the instance.
     * </p>
     */
    private java.util.List<SecurityGroupIdentifier> securityGroups;

    private InstanceState state;
    /**
     * <p>
     * When the instance was last updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The Amazon Machine Image (AMI) launch index, which you can use to find this instance in the launch group.
     * </p>
     * 
     * @param amiLaunchIndex
     *        The Amazon Machine Image (AMI) launch index, which you can use to find this instance in the launch group.
     */

    public void setAmiLaunchIndex(Integer amiLaunchIndex) {
        this.amiLaunchIndex = amiLaunchIndex;
    }

    /**
     * <p>
     * The Amazon Machine Image (AMI) launch index, which you can use to find this instance in the launch group.
     * </p>
     * 
     * @return The Amazon Machine Image (AMI) launch index, which you can use to find this instance in the launch group.
     */

    public Integer getAmiLaunchIndex() {
        return this.amiLaunchIndex;
    }

    /**
     * <p>
     * The Amazon Machine Image (AMI) launch index, which you can use to find this instance in the launch group.
     * </p>
     * 
     * @param amiLaunchIndex
     *        The Amazon Machine Image (AMI) launch index, which you can use to find this instance in the launch group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withAmiLaunchIndex(Integer amiLaunchIndex) {
        setAmiLaunchIndex(amiLaunchIndex);
        return this;
    }

    /**
     * <p>
     * Any block device mapping entries for the instance.
     * </p>
     * 
     * @return Any block device mapping entries for the instance.
     */

    public java.util.List<InstanceBlockDeviceMapping> getBlockDeviceMappings() {
        return blockDeviceMappings;
    }

    /**
     * <p>
     * Any block device mapping entries for the instance.
     * </p>
     * 
     * @param blockDeviceMappings
     *        Any block device mapping entries for the instance.
     */

    public void setBlockDeviceMappings(java.util.Collection<InstanceBlockDeviceMapping> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
            return;
        }

        this.blockDeviceMappings = new java.util.ArrayList<InstanceBlockDeviceMapping>(blockDeviceMappings);
    }

    /**
     * <p>
     * Any block device mapping entries for the instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlockDeviceMappings(java.util.Collection)} or {@link #withBlockDeviceMappings(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param blockDeviceMappings
     *        Any block device mapping entries for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withBlockDeviceMappings(InstanceBlockDeviceMapping... blockDeviceMappings) {
        if (this.blockDeviceMappings == null) {
            setBlockDeviceMappings(new java.util.ArrayList<InstanceBlockDeviceMapping>(blockDeviceMappings.length));
        }
        for (InstanceBlockDeviceMapping ele : blockDeviceMappings) {
            this.blockDeviceMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any block device mapping entries for the instance.
     * </p>
     * 
     * @param blockDeviceMappings
     *        Any block device mapping entries for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withBlockDeviceMappings(java.util.Collection<InstanceBlockDeviceMapping> blockDeviceMappings) {
        setBlockDeviceMappings(blockDeviceMappings);
        return this;
    }

    /**
     * <p>
     * The CPU options for the instance.
     * </p>
     * 
     * @param cpuOptions
     *        The CPU options for the instance.
     */

    public void setCpuOptions(CpuOptions cpuOptions) {
        this.cpuOptions = cpuOptions;
    }

    /**
     * <p>
     * The CPU options for the instance.
     * </p>
     * 
     * @return The CPU options for the instance.
     */

    public CpuOptions getCpuOptions() {
        return this.cpuOptions;
    }

    /**
     * <p>
     * The CPU options for the instance.
     * </p>
     * 
     * @param cpuOptions
     *        The CPU options for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withCpuOptions(CpuOptions cpuOptions) {
        setCpuOptions(cpuOptions);
        return this;
    }

    /**
     * <p>
     * When the instance was created.
     * </p>
     * 
     * @param createdAt
     *        When the instance was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * When the instance was created.
     * </p>
     * 
     * @return When the instance was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * When the instance was created.
     * </p>
     * 
     * @param createdAt
     *        When the instance was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The ID of the AMI used to launch the instance.
     * </p>
     * 
     * @param imageId
     *        The ID of the AMI used to launch the instance.
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The ID of the AMI used to launch the instance.
     * </p>
     * 
     * @return The ID of the AMI used to launch the instance.
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The ID of the AMI used to launch the instance.
     * </p>
     * 
     * @param imageId
     *        The ID of the AMI used to launch the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @return The ID of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @param instanceType
     *        The instance type.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @return The instance type.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @param instanceType
     *        The instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The private IPv4 address assigned to the instance.
     * </p>
     * 
     * @param privateIpAddress
     *        The private IPv4 address assigned to the instance.
     */

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    /**
     * <p>
     * The private IPv4 address assigned to the instance.
     * </p>
     * 
     * @return The private IPv4 address assigned to the instance.
     */

    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * <p>
     * The private IPv4 address assigned to the instance.
     * </p>
     * 
     * @param privateIpAddress
     *        The private IPv4 address assigned to the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withPrivateIpAddress(String privateIpAddress) {
        setPrivateIpAddress(privateIpAddress);
        return this;
    }

    /**
     * <p>
     * The public IPv4 address assigned to the instance.
     * </p>
     * 
     * @param publicIpAddress
     *        The public IPv4 address assigned to the instance.
     */

    public void setPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
    }

    /**
     * <p>
     * The public IPv4 address assigned to the instance.
     * </p>
     * 
     * @return The public IPv4 address assigned to the instance.
     */

    public String getPublicIpAddress() {
        return this.publicIpAddress;
    }

    /**
     * <p>
     * The public IPv4 address assigned to the instance.
     * </p>
     * 
     * @param publicIpAddress
     *        The public IPv4 address assigned to the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withPublicIpAddress(String publicIpAddress) {
        setPublicIpAddress(publicIpAddress);
        return this;
    }

    /**
     * <p>
     * The device name of the root device volume (for example, <code>/dev/sda1</code>).
     * </p>
     * 
     * @param rootDeviceName
     *        The device name of the root device volume (for example, <code>/dev/sda1</code>).
     */

    public void setRootDeviceName(String rootDeviceName) {
        this.rootDeviceName = rootDeviceName;
    }

    /**
     * <p>
     * The device name of the root device volume (for example, <code>/dev/sda1</code>).
     * </p>
     * 
     * @return The device name of the root device volume (for example, <code>/dev/sda1</code>).
     */

    public String getRootDeviceName() {
        return this.rootDeviceName;
    }

    /**
     * <p>
     * The device name of the root device volume (for example, <code>/dev/sda1</code>).
     * </p>
     * 
     * @param rootDeviceName
     *        The device name of the root device volume (for example, <code>/dev/sda1</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withRootDeviceName(String rootDeviceName) {
        setRootDeviceName(rootDeviceName);
        return this;
    }

    /**
     * <p>
     * The security groups for the instance.
     * </p>
     * 
     * @return The security groups for the instance.
     */

    public java.util.List<SecurityGroupIdentifier> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * The security groups for the instance.
     * </p>
     * 
     * @param securityGroups
     *        The security groups for the instance.
     */

    public void setSecurityGroups(java.util.Collection<SecurityGroupIdentifier> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new java.util.ArrayList<SecurityGroupIdentifier>(securityGroups);
    }

    /**
     * <p>
     * The security groups for the instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        The security groups for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withSecurityGroups(SecurityGroupIdentifier... securityGroups) {
        if (this.securityGroups == null) {
            setSecurityGroups(new java.util.ArrayList<SecurityGroupIdentifier>(securityGroups.length));
        }
        for (SecurityGroupIdentifier ele : securityGroups) {
            this.securityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The security groups for the instance.
     * </p>
     * 
     * @param securityGroups
     *        The security groups for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withSecurityGroups(java.util.Collection<SecurityGroupIdentifier> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * @param state
     */

    public void setState(InstanceState state) {
        this.state = state;
    }

    /**
     * @return
     */

    public InstanceState getState() {
        return this.state;
    }

    /**
     * @param state
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withState(InstanceState state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * When the instance was last updated.
     * </p>
     * 
     * @param updatedAt
     *        When the instance was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * When the instance was last updated.
     * </p>
     * 
     * @return When the instance was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * When the instance was last updated.
     * </p>
     * 
     * @param updatedAt
     *        When the instance was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getAmiLaunchIndex() != null)
            sb.append("AmiLaunchIndex: ").append(getAmiLaunchIndex()).append(",");
        if (getBlockDeviceMappings() != null)
            sb.append("BlockDeviceMappings: ").append(getBlockDeviceMappings()).append(",");
        if (getCpuOptions() != null)
            sb.append("CpuOptions: ").append(getCpuOptions()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getImageId() != null)
            sb.append("ImageId: ").append(getImageId()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getPrivateIpAddress() != null)
            sb.append("PrivateIpAddress: ").append(getPrivateIpAddress()).append(",");
        if (getPublicIpAddress() != null)
            sb.append("PublicIpAddress: ").append(getPublicIpAddress()).append(",");
        if (getRootDeviceName() != null)
            sb.append("RootDeviceName: ").append(getRootDeviceName()).append(",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: ").append(getSecurityGroups()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Instance == false)
            return false;
        Instance other = (Instance) obj;
        if (other.getAmiLaunchIndex() == null ^ this.getAmiLaunchIndex() == null)
            return false;
        if (other.getAmiLaunchIndex() != null && other.getAmiLaunchIndex().equals(this.getAmiLaunchIndex()) == false)
            return false;
        if (other.getBlockDeviceMappings() == null ^ this.getBlockDeviceMappings() == null)
            return false;
        if (other.getBlockDeviceMappings() != null && other.getBlockDeviceMappings().equals(this.getBlockDeviceMappings()) == false)
            return false;
        if (other.getCpuOptions() == null ^ this.getCpuOptions() == null)
            return false;
        if (other.getCpuOptions() != null && other.getCpuOptions().equals(this.getCpuOptions()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getPrivateIpAddress() == null ^ this.getPrivateIpAddress() == null)
            return false;
        if (other.getPrivateIpAddress() != null && other.getPrivateIpAddress().equals(this.getPrivateIpAddress()) == false)
            return false;
        if (other.getPublicIpAddress() == null ^ this.getPublicIpAddress() == null)
            return false;
        if (other.getPublicIpAddress() != null && other.getPublicIpAddress().equals(this.getPublicIpAddress()) == false)
            return false;
        if (other.getRootDeviceName() == null ^ this.getRootDeviceName() == null)
            return false;
        if (other.getRootDeviceName() != null && other.getRootDeviceName().equals(this.getRootDeviceName()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmiLaunchIndex() == null) ? 0 : getAmiLaunchIndex().hashCode());
        hashCode = prime * hashCode + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode());
        hashCode = prime * hashCode + ((getCpuOptions() == null) ? 0 : getCpuOptions().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress().hashCode());
        hashCode = prime * hashCode + ((getPublicIpAddress() == null) ? 0 : getPublicIpAddress().hashCode());
        hashCode = prime * hashCode + ((getRootDeviceName() == null) ? 0 : getRootDeviceName().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public Instance clone() {
        try {
            return (Instance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.snowdevicemanagement.model.transform.InstanceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
