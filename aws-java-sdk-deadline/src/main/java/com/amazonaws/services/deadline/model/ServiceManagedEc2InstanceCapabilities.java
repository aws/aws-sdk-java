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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon EC2 instance capabilities.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/ServiceManagedEc2InstanceCapabilities"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceManagedEc2InstanceCapabilities implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The allowable Amazon EC2 instance types.
     * </p>
     */
    private java.util.List<String> allowedInstanceTypes;
    /**
     * <p>
     * The CPU architecture type.
     * </p>
     */
    private String cpuArchitectureType;
    /**
     * <p>
     * The custom capability amounts to require for instances in this fleet.
     * </p>
     */
    private java.util.List<FleetAmountCapability> customAmounts;
    /**
     * <p>
     * The custom capability attributes to require for instances in this fleet.
     * </p>
     */
    private java.util.List<FleetAttributeCapability> customAttributes;
    /**
     * <p>
     * The instance types to exclude from the fleet.
     * </p>
     */
    private java.util.List<String> excludedInstanceTypes;
    /**
     * <p>
     * The memory, as MiB, for the Amazon EC2 instance type.
     * </p>
     */
    private MemoryMiBRange memoryMiB;
    /**
     * <p>
     * The operating system (OS) family.
     * </p>
     */
    private String osFamily;
    /**
     * <p>
     * The root EBS volume.
     * </p>
     */
    private Ec2EbsVolume rootEbsVolume;
    /**
     * <p>
     * The amount of vCPU to require for instances in this fleet.
     * </p>
     */
    private VCpuCountRange vCpuCount;

    /**
     * <p>
     * The allowable Amazon EC2 instance types.
     * </p>
     * 
     * @return The allowable Amazon EC2 instance types.
     */

    public java.util.List<String> getAllowedInstanceTypes() {
        return allowedInstanceTypes;
    }

    /**
     * <p>
     * The allowable Amazon EC2 instance types.
     * </p>
     * 
     * @param allowedInstanceTypes
     *        The allowable Amazon EC2 instance types.
     */

    public void setAllowedInstanceTypes(java.util.Collection<String> allowedInstanceTypes) {
        if (allowedInstanceTypes == null) {
            this.allowedInstanceTypes = null;
            return;
        }

        this.allowedInstanceTypes = new java.util.ArrayList<String>(allowedInstanceTypes);
    }

    /**
     * <p>
     * The allowable Amazon EC2 instance types.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedInstanceTypes(java.util.Collection)} or {@link #withAllowedInstanceTypes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param allowedInstanceTypes
     *        The allowable Amazon EC2 instance types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceManagedEc2InstanceCapabilities withAllowedInstanceTypes(String... allowedInstanceTypes) {
        if (this.allowedInstanceTypes == null) {
            setAllowedInstanceTypes(new java.util.ArrayList<String>(allowedInstanceTypes.length));
        }
        for (String ele : allowedInstanceTypes) {
            this.allowedInstanceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The allowable Amazon EC2 instance types.
     * </p>
     * 
     * @param allowedInstanceTypes
     *        The allowable Amazon EC2 instance types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceManagedEc2InstanceCapabilities withAllowedInstanceTypes(java.util.Collection<String> allowedInstanceTypes) {
        setAllowedInstanceTypes(allowedInstanceTypes);
        return this;
    }

    /**
     * <p>
     * The CPU architecture type.
     * </p>
     * 
     * @param cpuArchitectureType
     *        The CPU architecture type.
     * @see CpuArchitectureType
     */

    public void setCpuArchitectureType(String cpuArchitectureType) {
        this.cpuArchitectureType = cpuArchitectureType;
    }

    /**
     * <p>
     * The CPU architecture type.
     * </p>
     * 
     * @return The CPU architecture type.
     * @see CpuArchitectureType
     */

    public String getCpuArchitectureType() {
        return this.cpuArchitectureType;
    }

    /**
     * <p>
     * The CPU architecture type.
     * </p>
     * 
     * @param cpuArchitectureType
     *        The CPU architecture type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CpuArchitectureType
     */

    public ServiceManagedEc2InstanceCapabilities withCpuArchitectureType(String cpuArchitectureType) {
        setCpuArchitectureType(cpuArchitectureType);
        return this;
    }

    /**
     * <p>
     * The CPU architecture type.
     * </p>
     * 
     * @param cpuArchitectureType
     *        The CPU architecture type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CpuArchitectureType
     */

    public ServiceManagedEc2InstanceCapabilities withCpuArchitectureType(CpuArchitectureType cpuArchitectureType) {
        this.cpuArchitectureType = cpuArchitectureType.toString();
        return this;
    }

    /**
     * <p>
     * The custom capability amounts to require for instances in this fleet.
     * </p>
     * 
     * @return The custom capability amounts to require for instances in this fleet.
     */

    public java.util.List<FleetAmountCapability> getCustomAmounts() {
        return customAmounts;
    }

    /**
     * <p>
     * The custom capability amounts to require for instances in this fleet.
     * </p>
     * 
     * @param customAmounts
     *        The custom capability amounts to require for instances in this fleet.
     */

    public void setCustomAmounts(java.util.Collection<FleetAmountCapability> customAmounts) {
        if (customAmounts == null) {
            this.customAmounts = null;
            return;
        }

        this.customAmounts = new java.util.ArrayList<FleetAmountCapability>(customAmounts);
    }

    /**
     * <p>
     * The custom capability amounts to require for instances in this fleet.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomAmounts(java.util.Collection)} or {@link #withCustomAmounts(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param customAmounts
     *        The custom capability amounts to require for instances in this fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceManagedEc2InstanceCapabilities withCustomAmounts(FleetAmountCapability... customAmounts) {
        if (this.customAmounts == null) {
            setCustomAmounts(new java.util.ArrayList<FleetAmountCapability>(customAmounts.length));
        }
        for (FleetAmountCapability ele : customAmounts) {
            this.customAmounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The custom capability amounts to require for instances in this fleet.
     * </p>
     * 
     * @param customAmounts
     *        The custom capability amounts to require for instances in this fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceManagedEc2InstanceCapabilities withCustomAmounts(java.util.Collection<FleetAmountCapability> customAmounts) {
        setCustomAmounts(customAmounts);
        return this;
    }

    /**
     * <p>
     * The custom capability attributes to require for instances in this fleet.
     * </p>
     * 
     * @return The custom capability attributes to require for instances in this fleet.
     */

    public java.util.List<FleetAttributeCapability> getCustomAttributes() {
        return customAttributes;
    }

    /**
     * <p>
     * The custom capability attributes to require for instances in this fleet.
     * </p>
     * 
     * @param customAttributes
     *        The custom capability attributes to require for instances in this fleet.
     */

    public void setCustomAttributes(java.util.Collection<FleetAttributeCapability> customAttributes) {
        if (customAttributes == null) {
            this.customAttributes = null;
            return;
        }

        this.customAttributes = new java.util.ArrayList<FleetAttributeCapability>(customAttributes);
    }

    /**
     * <p>
     * The custom capability attributes to require for instances in this fleet.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomAttributes(java.util.Collection)} or {@link #withCustomAttributes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param customAttributes
     *        The custom capability attributes to require for instances in this fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceManagedEc2InstanceCapabilities withCustomAttributes(FleetAttributeCapability... customAttributes) {
        if (this.customAttributes == null) {
            setCustomAttributes(new java.util.ArrayList<FleetAttributeCapability>(customAttributes.length));
        }
        for (FleetAttributeCapability ele : customAttributes) {
            this.customAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The custom capability attributes to require for instances in this fleet.
     * </p>
     * 
     * @param customAttributes
     *        The custom capability attributes to require for instances in this fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceManagedEc2InstanceCapabilities withCustomAttributes(java.util.Collection<FleetAttributeCapability> customAttributes) {
        setCustomAttributes(customAttributes);
        return this;
    }

    /**
     * <p>
     * The instance types to exclude from the fleet.
     * </p>
     * 
     * @return The instance types to exclude from the fleet.
     */

    public java.util.List<String> getExcludedInstanceTypes() {
        return excludedInstanceTypes;
    }

    /**
     * <p>
     * The instance types to exclude from the fleet.
     * </p>
     * 
     * @param excludedInstanceTypes
     *        The instance types to exclude from the fleet.
     */

    public void setExcludedInstanceTypes(java.util.Collection<String> excludedInstanceTypes) {
        if (excludedInstanceTypes == null) {
            this.excludedInstanceTypes = null;
            return;
        }

        this.excludedInstanceTypes = new java.util.ArrayList<String>(excludedInstanceTypes);
    }

    /**
     * <p>
     * The instance types to exclude from the fleet.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludedInstanceTypes(java.util.Collection)} or
     * {@link #withExcludedInstanceTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param excludedInstanceTypes
     *        The instance types to exclude from the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceManagedEc2InstanceCapabilities withExcludedInstanceTypes(String... excludedInstanceTypes) {
        if (this.excludedInstanceTypes == null) {
            setExcludedInstanceTypes(new java.util.ArrayList<String>(excludedInstanceTypes.length));
        }
        for (String ele : excludedInstanceTypes) {
            this.excludedInstanceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The instance types to exclude from the fleet.
     * </p>
     * 
     * @param excludedInstanceTypes
     *        The instance types to exclude from the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceManagedEc2InstanceCapabilities withExcludedInstanceTypes(java.util.Collection<String> excludedInstanceTypes) {
        setExcludedInstanceTypes(excludedInstanceTypes);
        return this;
    }

    /**
     * <p>
     * The memory, as MiB, for the Amazon EC2 instance type.
     * </p>
     * 
     * @param memoryMiB
     *        The memory, as MiB, for the Amazon EC2 instance type.
     */

    public void setMemoryMiB(MemoryMiBRange memoryMiB) {
        this.memoryMiB = memoryMiB;
    }

    /**
     * <p>
     * The memory, as MiB, for the Amazon EC2 instance type.
     * </p>
     * 
     * @return The memory, as MiB, for the Amazon EC2 instance type.
     */

    public MemoryMiBRange getMemoryMiB() {
        return this.memoryMiB;
    }

    /**
     * <p>
     * The memory, as MiB, for the Amazon EC2 instance type.
     * </p>
     * 
     * @param memoryMiB
     *        The memory, as MiB, for the Amazon EC2 instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceManagedEc2InstanceCapabilities withMemoryMiB(MemoryMiBRange memoryMiB) {
        setMemoryMiB(memoryMiB);
        return this;
    }

    /**
     * <p>
     * The operating system (OS) family.
     * </p>
     * 
     * @param osFamily
     *        The operating system (OS) family.
     * @see ServiceManagedFleetOperatingSystemFamily
     */

    public void setOsFamily(String osFamily) {
        this.osFamily = osFamily;
    }

    /**
     * <p>
     * The operating system (OS) family.
     * </p>
     * 
     * @return The operating system (OS) family.
     * @see ServiceManagedFleetOperatingSystemFamily
     */

    public String getOsFamily() {
        return this.osFamily;
    }

    /**
     * <p>
     * The operating system (OS) family.
     * </p>
     * 
     * @param osFamily
     *        The operating system (OS) family.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceManagedFleetOperatingSystemFamily
     */

    public ServiceManagedEc2InstanceCapabilities withOsFamily(String osFamily) {
        setOsFamily(osFamily);
        return this;
    }

    /**
     * <p>
     * The operating system (OS) family.
     * </p>
     * 
     * @param osFamily
     *        The operating system (OS) family.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceManagedFleetOperatingSystemFamily
     */

    public ServiceManagedEc2InstanceCapabilities withOsFamily(ServiceManagedFleetOperatingSystemFamily osFamily) {
        this.osFamily = osFamily.toString();
        return this;
    }

    /**
     * <p>
     * The root EBS volume.
     * </p>
     * 
     * @param rootEbsVolume
     *        The root EBS volume.
     */

    public void setRootEbsVolume(Ec2EbsVolume rootEbsVolume) {
        this.rootEbsVolume = rootEbsVolume;
    }

    /**
     * <p>
     * The root EBS volume.
     * </p>
     * 
     * @return The root EBS volume.
     */

    public Ec2EbsVolume getRootEbsVolume() {
        return this.rootEbsVolume;
    }

    /**
     * <p>
     * The root EBS volume.
     * </p>
     * 
     * @param rootEbsVolume
     *        The root EBS volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceManagedEc2InstanceCapabilities withRootEbsVolume(Ec2EbsVolume rootEbsVolume) {
        setRootEbsVolume(rootEbsVolume);
        return this;
    }

    /**
     * <p>
     * The amount of vCPU to require for instances in this fleet.
     * </p>
     * 
     * @param vCpuCount
     *        The amount of vCPU to require for instances in this fleet.
     */

    public void setVCpuCount(VCpuCountRange vCpuCount) {
        this.vCpuCount = vCpuCount;
    }

    /**
     * <p>
     * The amount of vCPU to require for instances in this fleet.
     * </p>
     * 
     * @return The amount of vCPU to require for instances in this fleet.
     */

    public VCpuCountRange getVCpuCount() {
        return this.vCpuCount;
    }

    /**
     * <p>
     * The amount of vCPU to require for instances in this fleet.
     * </p>
     * 
     * @param vCpuCount
     *        The amount of vCPU to require for instances in this fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceManagedEc2InstanceCapabilities withVCpuCount(VCpuCountRange vCpuCount) {
        setVCpuCount(vCpuCount);
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
        if (getAllowedInstanceTypes() != null)
            sb.append("AllowedInstanceTypes: ").append(getAllowedInstanceTypes()).append(",");
        if (getCpuArchitectureType() != null)
            sb.append("CpuArchitectureType: ").append(getCpuArchitectureType()).append(",");
        if (getCustomAmounts() != null)
            sb.append("CustomAmounts: ").append(getCustomAmounts()).append(",");
        if (getCustomAttributes() != null)
            sb.append("CustomAttributes: ").append(getCustomAttributes()).append(",");
        if (getExcludedInstanceTypes() != null)
            sb.append("ExcludedInstanceTypes: ").append(getExcludedInstanceTypes()).append(",");
        if (getMemoryMiB() != null)
            sb.append("MemoryMiB: ").append(getMemoryMiB()).append(",");
        if (getOsFamily() != null)
            sb.append("OsFamily: ").append(getOsFamily()).append(",");
        if (getRootEbsVolume() != null)
            sb.append("RootEbsVolume: ").append(getRootEbsVolume()).append(",");
        if (getVCpuCount() != null)
            sb.append("VCpuCount: ").append(getVCpuCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceManagedEc2InstanceCapabilities == false)
            return false;
        ServiceManagedEc2InstanceCapabilities other = (ServiceManagedEc2InstanceCapabilities) obj;
        if (other.getAllowedInstanceTypes() == null ^ this.getAllowedInstanceTypes() == null)
            return false;
        if (other.getAllowedInstanceTypes() != null && other.getAllowedInstanceTypes().equals(this.getAllowedInstanceTypes()) == false)
            return false;
        if (other.getCpuArchitectureType() == null ^ this.getCpuArchitectureType() == null)
            return false;
        if (other.getCpuArchitectureType() != null && other.getCpuArchitectureType().equals(this.getCpuArchitectureType()) == false)
            return false;
        if (other.getCustomAmounts() == null ^ this.getCustomAmounts() == null)
            return false;
        if (other.getCustomAmounts() != null && other.getCustomAmounts().equals(this.getCustomAmounts()) == false)
            return false;
        if (other.getCustomAttributes() == null ^ this.getCustomAttributes() == null)
            return false;
        if (other.getCustomAttributes() != null && other.getCustomAttributes().equals(this.getCustomAttributes()) == false)
            return false;
        if (other.getExcludedInstanceTypes() == null ^ this.getExcludedInstanceTypes() == null)
            return false;
        if (other.getExcludedInstanceTypes() != null && other.getExcludedInstanceTypes().equals(this.getExcludedInstanceTypes()) == false)
            return false;
        if (other.getMemoryMiB() == null ^ this.getMemoryMiB() == null)
            return false;
        if (other.getMemoryMiB() != null && other.getMemoryMiB().equals(this.getMemoryMiB()) == false)
            return false;
        if (other.getOsFamily() == null ^ this.getOsFamily() == null)
            return false;
        if (other.getOsFamily() != null && other.getOsFamily().equals(this.getOsFamily()) == false)
            return false;
        if (other.getRootEbsVolume() == null ^ this.getRootEbsVolume() == null)
            return false;
        if (other.getRootEbsVolume() != null && other.getRootEbsVolume().equals(this.getRootEbsVolume()) == false)
            return false;
        if (other.getVCpuCount() == null ^ this.getVCpuCount() == null)
            return false;
        if (other.getVCpuCount() != null && other.getVCpuCount().equals(this.getVCpuCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowedInstanceTypes() == null) ? 0 : getAllowedInstanceTypes().hashCode());
        hashCode = prime * hashCode + ((getCpuArchitectureType() == null) ? 0 : getCpuArchitectureType().hashCode());
        hashCode = prime * hashCode + ((getCustomAmounts() == null) ? 0 : getCustomAmounts().hashCode());
        hashCode = prime * hashCode + ((getCustomAttributes() == null) ? 0 : getCustomAttributes().hashCode());
        hashCode = prime * hashCode + ((getExcludedInstanceTypes() == null) ? 0 : getExcludedInstanceTypes().hashCode());
        hashCode = prime * hashCode + ((getMemoryMiB() == null) ? 0 : getMemoryMiB().hashCode());
        hashCode = prime * hashCode + ((getOsFamily() == null) ? 0 : getOsFamily().hashCode());
        hashCode = prime * hashCode + ((getRootEbsVolume() == null) ? 0 : getRootEbsVolume().hashCode());
        hashCode = prime * hashCode + ((getVCpuCount() == null) ? 0 : getVCpuCount().hashCode());
        return hashCode;
    }

    @Override
    public ServiceManagedEc2InstanceCapabilities clone() {
        try {
            return (ServiceManagedEc2InstanceCapabilities) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.ServiceManagedEc2InstanceCapabilitiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
