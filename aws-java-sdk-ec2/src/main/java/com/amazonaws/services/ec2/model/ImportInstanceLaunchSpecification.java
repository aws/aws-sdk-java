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
 * Describes the launch specification for VM import.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ImportInstanceLaunchSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportInstanceLaunchSpecification implements Serializable, Cloneable {

    /**
     * <p>
     * Reserved.
     * </p>
     */
    private String additionalInfo;
    /**
     * <p>
     * The architecture of the instance.
     * </p>
     */
    private String architecture;
    /**
     * <p>
     * One or more security group IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> groupIds;
    /**
     * <p>
     * One or more security group names.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> groupNames;
    /**
     * <p>
     * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the
     * operating system command for system shutdown).
     * </p>
     */
    private String instanceInitiatedShutdownBehavior;
    /**
     * <p>
     * The instance type. For more information about the instance types that you can import, see <a
     * href="https://docs.aws.amazon.com/vm-import/latest/userguide/vmie_prereqs.html#vmimport-instance-types">Instance
     * Types</a> in the VM Import/Export User Guide.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * Indicates whether monitoring is enabled.
     * </p>
     */
    private Boolean monitoring;
    /**
     * <p>
     * The placement information for the instance.
     * </p>
     */
    private Placement placement;
    /**
     * <p>
     * [EC2-VPC] An available IP address from the IP address range of the subnet.
     * </p>
     */
    private String privateIpAddress;
    /**
     * <p>
     * [EC2-VPC] The ID of the subnet in which to launch the instance.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The Base64-encoded user data to make available to the instance.
     * </p>
     */
    private UserData userData;

    /**
     * <p>
     * Reserved.
     * </p>
     * 
     * @param additionalInfo
     *        Reserved.
     */

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     * 
     * @return Reserved.
     */

    public String getAdditionalInfo() {
        return this.additionalInfo;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     * 
     * @param additionalInfo
     *        Reserved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportInstanceLaunchSpecification withAdditionalInfo(String additionalInfo) {
        setAdditionalInfo(additionalInfo);
        return this;
    }

    /**
     * <p>
     * The architecture of the instance.
     * </p>
     * 
     * @param architecture
     *        The architecture of the instance.
     * @see ArchitectureValues
     */

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    /**
     * <p>
     * The architecture of the instance.
     * </p>
     * 
     * @return The architecture of the instance.
     * @see ArchitectureValues
     */

    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * <p>
     * The architecture of the instance.
     * </p>
     * 
     * @param architecture
     *        The architecture of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArchitectureValues
     */

    public ImportInstanceLaunchSpecification withArchitecture(String architecture) {
        setArchitecture(architecture);
        return this;
    }

    /**
     * <p>
     * The architecture of the instance.
     * </p>
     * 
     * @param architecture
     *        The architecture of the instance.
     * @see ArchitectureValues
     */

    public void setArchitecture(ArchitectureValues architecture) {
        withArchitecture(architecture);
    }

    /**
     * <p>
     * The architecture of the instance.
     * </p>
     * 
     * @param architecture
     *        The architecture of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArchitectureValues
     */

    public ImportInstanceLaunchSpecification withArchitecture(ArchitectureValues architecture) {
        this.architecture = architecture.toString();
        return this;
    }

    /**
     * <p>
     * One or more security group IDs.
     * </p>
     * 
     * @return One or more security group IDs.
     */

    public java.util.List<String> getGroupIds() {
        if (groupIds == null) {
            groupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return groupIds;
    }

    /**
     * <p>
     * One or more security group IDs.
     * </p>
     * 
     * @param groupIds
     *        One or more security group IDs.
     */

    public void setGroupIds(java.util.Collection<String> groupIds) {
        if (groupIds == null) {
            this.groupIds = null;
            return;
        }

        this.groupIds = new com.amazonaws.internal.SdkInternalList<String>(groupIds);
    }

    /**
     * <p>
     * One or more security group IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroupIds(java.util.Collection)} or {@link #withGroupIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param groupIds
     *        One or more security group IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportInstanceLaunchSpecification withGroupIds(String... groupIds) {
        if (this.groupIds == null) {
            setGroupIds(new com.amazonaws.internal.SdkInternalList<String>(groupIds.length));
        }
        for (String ele : groupIds) {
            this.groupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more security group IDs.
     * </p>
     * 
     * @param groupIds
     *        One or more security group IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportInstanceLaunchSpecification withGroupIds(java.util.Collection<String> groupIds) {
        setGroupIds(groupIds);
        return this;
    }

    /**
     * <p>
     * One or more security group names.
     * </p>
     * 
     * @return One or more security group names.
     */

    public java.util.List<String> getGroupNames() {
        if (groupNames == null) {
            groupNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return groupNames;
    }

    /**
     * <p>
     * One or more security group names.
     * </p>
     * 
     * @param groupNames
     *        One or more security group names.
     */

    public void setGroupNames(java.util.Collection<String> groupNames) {
        if (groupNames == null) {
            this.groupNames = null;
            return;
        }

        this.groupNames = new com.amazonaws.internal.SdkInternalList<String>(groupNames);
    }

    /**
     * <p>
     * One or more security group names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroupNames(java.util.Collection)} or {@link #withGroupNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param groupNames
     *        One or more security group names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportInstanceLaunchSpecification withGroupNames(String... groupNames) {
        if (this.groupNames == null) {
            setGroupNames(new com.amazonaws.internal.SdkInternalList<String>(groupNames.length));
        }
        for (String ele : groupNames) {
            this.groupNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more security group names.
     * </p>
     * 
     * @param groupNames
     *        One or more security group names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportInstanceLaunchSpecification withGroupNames(java.util.Collection<String> groupNames) {
        setGroupNames(groupNames);
        return this;
    }

    /**
     * <p>
     * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the
     * operating system command for system shutdown).
     * </p>
     * 
     * @param instanceInitiatedShutdownBehavior
     *        Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the
     *        operating system command for system shutdown).
     * @see ShutdownBehavior
     */

    public void setInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
    }

    /**
     * <p>
     * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the
     * operating system command for system shutdown).
     * </p>
     * 
     * @return Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the
     *         operating system command for system shutdown).
     * @see ShutdownBehavior
     */

    public String getInstanceInitiatedShutdownBehavior() {
        return this.instanceInitiatedShutdownBehavior;
    }

    /**
     * <p>
     * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the
     * operating system command for system shutdown).
     * </p>
     * 
     * @param instanceInitiatedShutdownBehavior
     *        Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the
     *        operating system command for system shutdown).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShutdownBehavior
     */

    public ImportInstanceLaunchSpecification withInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
        setInstanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior);
        return this;
    }

    /**
     * <p>
     * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the
     * operating system command for system shutdown).
     * </p>
     * 
     * @param instanceInitiatedShutdownBehavior
     *        Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the
     *        operating system command for system shutdown).
     * @see ShutdownBehavior
     */

    public void setInstanceInitiatedShutdownBehavior(ShutdownBehavior instanceInitiatedShutdownBehavior) {
        withInstanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior);
    }

    /**
     * <p>
     * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the
     * operating system command for system shutdown).
     * </p>
     * 
     * @param instanceInitiatedShutdownBehavior
     *        Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the
     *        operating system command for system shutdown).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShutdownBehavior
     */

    public ImportInstanceLaunchSpecification withInstanceInitiatedShutdownBehavior(ShutdownBehavior instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior.toString();
        return this;
    }

    /**
     * <p>
     * The instance type. For more information about the instance types that you can import, see <a
     * href="https://docs.aws.amazon.com/vm-import/latest/userguide/vmie_prereqs.html#vmimport-instance-types">Instance
     * Types</a> in the VM Import/Export User Guide.
     * </p>
     * 
     * @param instanceType
     *        The instance type. For more information about the instance types that you can import, see <a
     *        href="https://docs.aws.amazon.com/vm-import/latest/userguide/vmie_prereqs.html#vmimport-instance-types"
     *        >Instance Types</a> in the VM Import/Export User Guide.
     * @see InstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type. For more information about the instance types that you can import, see <a
     * href="https://docs.aws.amazon.com/vm-import/latest/userguide/vmie_prereqs.html#vmimport-instance-types">Instance
     * Types</a> in the VM Import/Export User Guide.
     * </p>
     * 
     * @return The instance type. For more information about the instance types that you can import, see <a
     *         href="https://docs.aws.amazon.com/vm-import/latest/userguide/vmie_prereqs.html#vmimport-instance-types"
     *         >Instance Types</a> in the VM Import/Export User Guide.
     * @see InstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type. For more information about the instance types that you can import, see <a
     * href="https://docs.aws.amazon.com/vm-import/latest/userguide/vmie_prereqs.html#vmimport-instance-types">Instance
     * Types</a> in the VM Import/Export User Guide.
     * </p>
     * 
     * @param instanceType
     *        The instance type. For more information about the instance types that you can import, see <a
     *        href="https://docs.aws.amazon.com/vm-import/latest/userguide/vmie_prereqs.html#vmimport-instance-types"
     *        >Instance Types</a> in the VM Import/Export User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public ImportInstanceLaunchSpecification withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The instance type. For more information about the instance types that you can import, see <a
     * href="https://docs.aws.amazon.com/vm-import/latest/userguide/vmie_prereqs.html#vmimport-instance-types">Instance
     * Types</a> in the VM Import/Export User Guide.
     * </p>
     * 
     * @param instanceType
     *        The instance type. For more information about the instance types that you can import, see <a
     *        href="https://docs.aws.amazon.com/vm-import/latest/userguide/vmie_prereqs.html#vmimport-instance-types"
     *        >Instance Types</a> in the VM Import/Export User Guide.
     * @see InstanceType
     */

    public void setInstanceType(InstanceType instanceType) {
        withInstanceType(instanceType);
    }

    /**
     * <p>
     * The instance type. For more information about the instance types that you can import, see <a
     * href="https://docs.aws.amazon.com/vm-import/latest/userguide/vmie_prereqs.html#vmimport-instance-types">Instance
     * Types</a> in the VM Import/Export User Guide.
     * </p>
     * 
     * @param instanceType
     *        The instance type. For more information about the instance types that you can import, see <a
     *        href="https://docs.aws.amazon.com/vm-import/latest/userguide/vmie_prereqs.html#vmimport-instance-types"
     *        >Instance Types</a> in the VM Import/Export User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceType
     */

    public ImportInstanceLaunchSpecification withInstanceType(InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether monitoring is enabled.
     * </p>
     * 
     * @param monitoring
     *        Indicates whether monitoring is enabled.
     */

    public void setMonitoring(Boolean monitoring) {
        this.monitoring = monitoring;
    }

    /**
     * <p>
     * Indicates whether monitoring is enabled.
     * </p>
     * 
     * @return Indicates whether monitoring is enabled.
     */

    public Boolean getMonitoring() {
        return this.monitoring;
    }

    /**
     * <p>
     * Indicates whether monitoring is enabled.
     * </p>
     * 
     * @param monitoring
     *        Indicates whether monitoring is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportInstanceLaunchSpecification withMonitoring(Boolean monitoring) {
        setMonitoring(monitoring);
        return this;
    }

    /**
     * <p>
     * Indicates whether monitoring is enabled.
     * </p>
     * 
     * @return Indicates whether monitoring is enabled.
     */

    public Boolean isMonitoring() {
        return this.monitoring;
    }

    /**
     * <p>
     * The placement information for the instance.
     * </p>
     * 
     * @param placement
     *        The placement information for the instance.
     */

    public void setPlacement(Placement placement) {
        this.placement = placement;
    }

    /**
     * <p>
     * The placement information for the instance.
     * </p>
     * 
     * @return The placement information for the instance.
     */

    public Placement getPlacement() {
        return this.placement;
    }

    /**
     * <p>
     * The placement information for the instance.
     * </p>
     * 
     * @param placement
     *        The placement information for the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportInstanceLaunchSpecification withPlacement(Placement placement) {
        setPlacement(placement);
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] An available IP address from the IP address range of the subnet.
     * </p>
     * 
     * @param privateIpAddress
     *        [EC2-VPC] An available IP address from the IP address range of the subnet.
     */

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    /**
     * <p>
     * [EC2-VPC] An available IP address from the IP address range of the subnet.
     * </p>
     * 
     * @return [EC2-VPC] An available IP address from the IP address range of the subnet.
     */

    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * <p>
     * [EC2-VPC] An available IP address from the IP address range of the subnet.
     * </p>
     * 
     * @param privateIpAddress
     *        [EC2-VPC] An available IP address from the IP address range of the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportInstanceLaunchSpecification withPrivateIpAddress(String privateIpAddress) {
        setPrivateIpAddress(privateIpAddress);
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] The ID of the subnet in which to launch the instance.
     * </p>
     * 
     * @param subnetId
     *        [EC2-VPC] The ID of the subnet in which to launch the instance.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * [EC2-VPC] The ID of the subnet in which to launch the instance.
     * </p>
     * 
     * @return [EC2-VPC] The ID of the subnet in which to launch the instance.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * [EC2-VPC] The ID of the subnet in which to launch the instance.
     * </p>
     * 
     * @param subnetId
     *        [EC2-VPC] The ID of the subnet in which to launch the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportInstanceLaunchSpecification withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The Base64-encoded user data to make available to the instance.
     * </p>
     * 
     * @param userData
     *        The Base64-encoded user data to make available to the instance.
     */

    public void setUserData(UserData userData) {
        this.userData = userData;
    }

    /**
     * <p>
     * The Base64-encoded user data to make available to the instance.
     * </p>
     * 
     * @return The Base64-encoded user data to make available to the instance.
     */

    public UserData getUserData() {
        return this.userData;
    }

    /**
     * <p>
     * The Base64-encoded user data to make available to the instance.
     * </p>
     * 
     * @param userData
     *        The Base64-encoded user data to make available to the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportInstanceLaunchSpecification withUserData(UserData userData) {
        setUserData(userData);
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
        if (getAdditionalInfo() != null)
            sb.append("AdditionalInfo: ").append(getAdditionalInfo()).append(",");
        if (getArchitecture() != null)
            sb.append("Architecture: ").append(getArchitecture()).append(",");
        if (getGroupIds() != null)
            sb.append("GroupIds: ").append(getGroupIds()).append(",");
        if (getGroupNames() != null)
            sb.append("GroupNames: ").append(getGroupNames()).append(",");
        if (getInstanceInitiatedShutdownBehavior() != null)
            sb.append("InstanceInitiatedShutdownBehavior: ").append(getInstanceInitiatedShutdownBehavior()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getMonitoring() != null)
            sb.append("Monitoring: ").append(getMonitoring()).append(",");
        if (getPlacement() != null)
            sb.append("Placement: ").append(getPlacement()).append(",");
        if (getPrivateIpAddress() != null)
            sb.append("PrivateIpAddress: ").append(getPrivateIpAddress()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getUserData() != null)
            sb.append("UserData: ").append(getUserData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportInstanceLaunchSpecification == false)
            return false;
        ImportInstanceLaunchSpecification other = (ImportInstanceLaunchSpecification) obj;
        if (other.getAdditionalInfo() == null ^ this.getAdditionalInfo() == null)
            return false;
        if (other.getAdditionalInfo() != null && other.getAdditionalInfo().equals(this.getAdditionalInfo()) == false)
            return false;
        if (other.getArchitecture() == null ^ this.getArchitecture() == null)
            return false;
        if (other.getArchitecture() != null && other.getArchitecture().equals(this.getArchitecture()) == false)
            return false;
        if (other.getGroupIds() == null ^ this.getGroupIds() == null)
            return false;
        if (other.getGroupIds() != null && other.getGroupIds().equals(this.getGroupIds()) == false)
            return false;
        if (other.getGroupNames() == null ^ this.getGroupNames() == null)
            return false;
        if (other.getGroupNames() != null && other.getGroupNames().equals(this.getGroupNames()) == false)
            return false;
        if (other.getInstanceInitiatedShutdownBehavior() == null ^ this.getInstanceInitiatedShutdownBehavior() == null)
            return false;
        if (other.getInstanceInitiatedShutdownBehavior() != null
                && other.getInstanceInitiatedShutdownBehavior().equals(this.getInstanceInitiatedShutdownBehavior()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getMonitoring() == null ^ this.getMonitoring() == null)
            return false;
        if (other.getMonitoring() != null && other.getMonitoring().equals(this.getMonitoring()) == false)
            return false;
        if (other.getPlacement() == null ^ this.getPlacement() == null)
            return false;
        if (other.getPlacement() != null && other.getPlacement().equals(this.getPlacement()) == false)
            return false;
        if (other.getPrivateIpAddress() == null ^ this.getPrivateIpAddress() == null)
            return false;
        if (other.getPrivateIpAddress() != null && other.getPrivateIpAddress().equals(this.getPrivateIpAddress()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getUserData() == null ^ this.getUserData() == null)
            return false;
        if (other.getUserData() != null && other.getUserData().equals(this.getUserData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdditionalInfo() == null) ? 0 : getAdditionalInfo().hashCode());
        hashCode = prime * hashCode + ((getArchitecture() == null) ? 0 : getArchitecture().hashCode());
        hashCode = prime * hashCode + ((getGroupIds() == null) ? 0 : getGroupIds().hashCode());
        hashCode = prime * hashCode + ((getGroupNames() == null) ? 0 : getGroupNames().hashCode());
        hashCode = prime * hashCode + ((getInstanceInitiatedShutdownBehavior() == null) ? 0 : getInstanceInitiatedShutdownBehavior().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getMonitoring() == null) ? 0 : getMonitoring().hashCode());
        hashCode = prime * hashCode + ((getPlacement() == null) ? 0 : getPlacement().hashCode());
        hashCode = prime * hashCode + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getUserData() == null) ? 0 : getUserData().hashCode());
        return hashCode;
    }

    @Override
    public ImportInstanceLaunchSpecification clone() {
        try {
            return (ImportInstanceLaunchSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
