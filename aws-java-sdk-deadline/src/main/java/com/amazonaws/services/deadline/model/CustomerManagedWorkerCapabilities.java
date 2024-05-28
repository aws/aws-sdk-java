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
 * The worker capabilities for a customer managed workflow.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CustomerManagedWorkerCapabilities"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomerManagedWorkerCapabilities implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The range of the accelerator.
     * </p>
     */
    private AcceleratorCountRange acceleratorCount;
    /**
     * <p>
     * The total memory (MiB) for the customer managed worker capabilities.
     * </p>
     */
    private AcceleratorTotalMemoryMiBRange acceleratorTotalMemoryMiB;
    /**
     * <p>
     * The accelerator types for the customer managed worker capabilities.
     * </p>
     */
    private java.util.List<String> acceleratorTypes;
    /**
     * <p>
     * The CPU architecture type for the customer managed worker capabilities.
     * </p>
     */
    private String cpuArchitectureType;
    /**
     * <p>
     * Custom requirement ranges for customer managed worker capabilities.
     * </p>
     */
    private java.util.List<FleetAmountCapability> customAmounts;
    /**
     * <p>
     * Custom attributes for the customer manged worker capabilities.
     * </p>
     */
    private java.util.List<FleetAttributeCapability> customAttributes;
    /**
     * <p>
     * The memory (MiB).
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
     * The vCPU count for the customer manged worker capabilities.
     * </p>
     */
    private VCpuCountRange vCpuCount;

    /**
     * <p>
     * The range of the accelerator.
     * </p>
     * 
     * @param acceleratorCount
     *        The range of the accelerator.
     */

    public void setAcceleratorCount(AcceleratorCountRange acceleratorCount) {
        this.acceleratorCount = acceleratorCount;
    }

    /**
     * <p>
     * The range of the accelerator.
     * </p>
     * 
     * @return The range of the accelerator.
     */

    public AcceleratorCountRange getAcceleratorCount() {
        return this.acceleratorCount;
    }

    /**
     * <p>
     * The range of the accelerator.
     * </p>
     * 
     * @param acceleratorCount
     *        The range of the accelerator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerManagedWorkerCapabilities withAcceleratorCount(AcceleratorCountRange acceleratorCount) {
        setAcceleratorCount(acceleratorCount);
        return this;
    }

    /**
     * <p>
     * The total memory (MiB) for the customer managed worker capabilities.
     * </p>
     * 
     * @param acceleratorTotalMemoryMiB
     *        The total memory (MiB) for the customer managed worker capabilities.
     */

    public void setAcceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBRange acceleratorTotalMemoryMiB) {
        this.acceleratorTotalMemoryMiB = acceleratorTotalMemoryMiB;
    }

    /**
     * <p>
     * The total memory (MiB) for the customer managed worker capabilities.
     * </p>
     * 
     * @return The total memory (MiB) for the customer managed worker capabilities.
     */

    public AcceleratorTotalMemoryMiBRange getAcceleratorTotalMemoryMiB() {
        return this.acceleratorTotalMemoryMiB;
    }

    /**
     * <p>
     * The total memory (MiB) for the customer managed worker capabilities.
     * </p>
     * 
     * @param acceleratorTotalMemoryMiB
     *        The total memory (MiB) for the customer managed worker capabilities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerManagedWorkerCapabilities withAcceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBRange acceleratorTotalMemoryMiB) {
        setAcceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB);
        return this;
    }

    /**
     * <p>
     * The accelerator types for the customer managed worker capabilities.
     * </p>
     * 
     * @return The accelerator types for the customer managed worker capabilities.
     * @see AcceleratorType
     */

    public java.util.List<String> getAcceleratorTypes() {
        return acceleratorTypes;
    }

    /**
     * <p>
     * The accelerator types for the customer managed worker capabilities.
     * </p>
     * 
     * @param acceleratorTypes
     *        The accelerator types for the customer managed worker capabilities.
     * @see AcceleratorType
     */

    public void setAcceleratorTypes(java.util.Collection<String> acceleratorTypes) {
        if (acceleratorTypes == null) {
            this.acceleratorTypes = null;
            return;
        }

        this.acceleratorTypes = new java.util.ArrayList<String>(acceleratorTypes);
    }

    /**
     * <p>
     * The accelerator types for the customer managed worker capabilities.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAcceleratorTypes(java.util.Collection)} or {@link #withAcceleratorTypes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param acceleratorTypes
     *        The accelerator types for the customer managed worker capabilities.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceleratorType
     */

    public CustomerManagedWorkerCapabilities withAcceleratorTypes(String... acceleratorTypes) {
        if (this.acceleratorTypes == null) {
            setAcceleratorTypes(new java.util.ArrayList<String>(acceleratorTypes.length));
        }
        for (String ele : acceleratorTypes) {
            this.acceleratorTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The accelerator types for the customer managed worker capabilities.
     * </p>
     * 
     * @param acceleratorTypes
     *        The accelerator types for the customer managed worker capabilities.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceleratorType
     */

    public CustomerManagedWorkerCapabilities withAcceleratorTypes(java.util.Collection<String> acceleratorTypes) {
        setAcceleratorTypes(acceleratorTypes);
        return this;
    }

    /**
     * <p>
     * The accelerator types for the customer managed worker capabilities.
     * </p>
     * 
     * @param acceleratorTypes
     *        The accelerator types for the customer managed worker capabilities.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceleratorType
     */

    public CustomerManagedWorkerCapabilities withAcceleratorTypes(AcceleratorType... acceleratorTypes) {
        java.util.ArrayList<String> acceleratorTypesCopy = new java.util.ArrayList<String>(acceleratorTypes.length);
        for (AcceleratorType value : acceleratorTypes) {
            acceleratorTypesCopy.add(value.toString());
        }
        if (getAcceleratorTypes() == null) {
            setAcceleratorTypes(acceleratorTypesCopy);
        } else {
            getAcceleratorTypes().addAll(acceleratorTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The CPU architecture type for the customer managed worker capabilities.
     * </p>
     * 
     * @param cpuArchitectureType
     *        The CPU architecture type for the customer managed worker capabilities.
     * @see CpuArchitectureType
     */

    public void setCpuArchitectureType(String cpuArchitectureType) {
        this.cpuArchitectureType = cpuArchitectureType;
    }

    /**
     * <p>
     * The CPU architecture type for the customer managed worker capabilities.
     * </p>
     * 
     * @return The CPU architecture type for the customer managed worker capabilities.
     * @see CpuArchitectureType
     */

    public String getCpuArchitectureType() {
        return this.cpuArchitectureType;
    }

    /**
     * <p>
     * The CPU architecture type for the customer managed worker capabilities.
     * </p>
     * 
     * @param cpuArchitectureType
     *        The CPU architecture type for the customer managed worker capabilities.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CpuArchitectureType
     */

    public CustomerManagedWorkerCapabilities withCpuArchitectureType(String cpuArchitectureType) {
        setCpuArchitectureType(cpuArchitectureType);
        return this;
    }

    /**
     * <p>
     * The CPU architecture type for the customer managed worker capabilities.
     * </p>
     * 
     * @param cpuArchitectureType
     *        The CPU architecture type for the customer managed worker capabilities.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CpuArchitectureType
     */

    public CustomerManagedWorkerCapabilities withCpuArchitectureType(CpuArchitectureType cpuArchitectureType) {
        this.cpuArchitectureType = cpuArchitectureType.toString();
        return this;
    }

    /**
     * <p>
     * Custom requirement ranges for customer managed worker capabilities.
     * </p>
     * 
     * @return Custom requirement ranges for customer managed worker capabilities.
     */

    public java.util.List<FleetAmountCapability> getCustomAmounts() {
        return customAmounts;
    }

    /**
     * <p>
     * Custom requirement ranges for customer managed worker capabilities.
     * </p>
     * 
     * @param customAmounts
     *        Custom requirement ranges for customer managed worker capabilities.
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
     * Custom requirement ranges for customer managed worker capabilities.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomAmounts(java.util.Collection)} or {@link #withCustomAmounts(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param customAmounts
     *        Custom requirement ranges for customer managed worker capabilities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerManagedWorkerCapabilities withCustomAmounts(FleetAmountCapability... customAmounts) {
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
     * Custom requirement ranges for customer managed worker capabilities.
     * </p>
     * 
     * @param customAmounts
     *        Custom requirement ranges for customer managed worker capabilities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerManagedWorkerCapabilities withCustomAmounts(java.util.Collection<FleetAmountCapability> customAmounts) {
        setCustomAmounts(customAmounts);
        return this;
    }

    /**
     * <p>
     * Custom attributes for the customer manged worker capabilities.
     * </p>
     * 
     * @return Custom attributes for the customer manged worker capabilities.
     */

    public java.util.List<FleetAttributeCapability> getCustomAttributes() {
        return customAttributes;
    }

    /**
     * <p>
     * Custom attributes for the customer manged worker capabilities.
     * </p>
     * 
     * @param customAttributes
     *        Custom attributes for the customer manged worker capabilities.
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
     * Custom attributes for the customer manged worker capabilities.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomAttributes(java.util.Collection)} or {@link #withCustomAttributes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param customAttributes
     *        Custom attributes for the customer manged worker capabilities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerManagedWorkerCapabilities withCustomAttributes(FleetAttributeCapability... customAttributes) {
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
     * Custom attributes for the customer manged worker capabilities.
     * </p>
     * 
     * @param customAttributes
     *        Custom attributes for the customer manged worker capabilities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerManagedWorkerCapabilities withCustomAttributes(java.util.Collection<FleetAttributeCapability> customAttributes) {
        setCustomAttributes(customAttributes);
        return this;
    }

    /**
     * <p>
     * The memory (MiB).
     * </p>
     * 
     * @param memoryMiB
     *        The memory (MiB).
     */

    public void setMemoryMiB(MemoryMiBRange memoryMiB) {
        this.memoryMiB = memoryMiB;
    }

    /**
     * <p>
     * The memory (MiB).
     * </p>
     * 
     * @return The memory (MiB).
     */

    public MemoryMiBRange getMemoryMiB() {
        return this.memoryMiB;
    }

    /**
     * <p>
     * The memory (MiB).
     * </p>
     * 
     * @param memoryMiB
     *        The memory (MiB).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerManagedWorkerCapabilities withMemoryMiB(MemoryMiBRange memoryMiB) {
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
     * @see CustomerManagedFleetOperatingSystemFamily
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
     * @see CustomerManagedFleetOperatingSystemFamily
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
     * @see CustomerManagedFleetOperatingSystemFamily
     */

    public CustomerManagedWorkerCapabilities withOsFamily(String osFamily) {
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
     * @see CustomerManagedFleetOperatingSystemFamily
     */

    public CustomerManagedWorkerCapabilities withOsFamily(CustomerManagedFleetOperatingSystemFamily osFamily) {
        this.osFamily = osFamily.toString();
        return this;
    }

    /**
     * <p>
     * The vCPU count for the customer manged worker capabilities.
     * </p>
     * 
     * @param vCpuCount
     *        The vCPU count for the customer manged worker capabilities.
     */

    public void setVCpuCount(VCpuCountRange vCpuCount) {
        this.vCpuCount = vCpuCount;
    }

    /**
     * <p>
     * The vCPU count for the customer manged worker capabilities.
     * </p>
     * 
     * @return The vCPU count for the customer manged worker capabilities.
     */

    public VCpuCountRange getVCpuCount() {
        return this.vCpuCount;
    }

    /**
     * <p>
     * The vCPU count for the customer manged worker capabilities.
     * </p>
     * 
     * @param vCpuCount
     *        The vCPU count for the customer manged worker capabilities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomerManagedWorkerCapabilities withVCpuCount(VCpuCountRange vCpuCount) {
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
        if (getAcceleratorCount() != null)
            sb.append("AcceleratorCount: ").append(getAcceleratorCount()).append(",");
        if (getAcceleratorTotalMemoryMiB() != null)
            sb.append("AcceleratorTotalMemoryMiB: ").append(getAcceleratorTotalMemoryMiB()).append(",");
        if (getAcceleratorTypes() != null)
            sb.append("AcceleratorTypes: ").append(getAcceleratorTypes()).append(",");
        if (getCpuArchitectureType() != null)
            sb.append("CpuArchitectureType: ").append(getCpuArchitectureType()).append(",");
        if (getCustomAmounts() != null)
            sb.append("CustomAmounts: ").append(getCustomAmounts()).append(",");
        if (getCustomAttributes() != null)
            sb.append("CustomAttributes: ").append(getCustomAttributes()).append(",");
        if (getMemoryMiB() != null)
            sb.append("MemoryMiB: ").append(getMemoryMiB()).append(",");
        if (getOsFamily() != null)
            sb.append("OsFamily: ").append(getOsFamily()).append(",");
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

        if (obj instanceof CustomerManagedWorkerCapabilities == false)
            return false;
        CustomerManagedWorkerCapabilities other = (CustomerManagedWorkerCapabilities) obj;
        if (other.getAcceleratorCount() == null ^ this.getAcceleratorCount() == null)
            return false;
        if (other.getAcceleratorCount() != null && other.getAcceleratorCount().equals(this.getAcceleratorCount()) == false)
            return false;
        if (other.getAcceleratorTotalMemoryMiB() == null ^ this.getAcceleratorTotalMemoryMiB() == null)
            return false;
        if (other.getAcceleratorTotalMemoryMiB() != null && other.getAcceleratorTotalMemoryMiB().equals(this.getAcceleratorTotalMemoryMiB()) == false)
            return false;
        if (other.getAcceleratorTypes() == null ^ this.getAcceleratorTypes() == null)
            return false;
        if (other.getAcceleratorTypes() != null && other.getAcceleratorTypes().equals(this.getAcceleratorTypes()) == false)
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
        if (other.getMemoryMiB() == null ^ this.getMemoryMiB() == null)
            return false;
        if (other.getMemoryMiB() != null && other.getMemoryMiB().equals(this.getMemoryMiB()) == false)
            return false;
        if (other.getOsFamily() == null ^ this.getOsFamily() == null)
            return false;
        if (other.getOsFamily() != null && other.getOsFamily().equals(this.getOsFamily()) == false)
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

        hashCode = prime * hashCode + ((getAcceleratorCount() == null) ? 0 : getAcceleratorCount().hashCode());
        hashCode = prime * hashCode + ((getAcceleratorTotalMemoryMiB() == null) ? 0 : getAcceleratorTotalMemoryMiB().hashCode());
        hashCode = prime * hashCode + ((getAcceleratorTypes() == null) ? 0 : getAcceleratorTypes().hashCode());
        hashCode = prime * hashCode + ((getCpuArchitectureType() == null) ? 0 : getCpuArchitectureType().hashCode());
        hashCode = prime * hashCode + ((getCustomAmounts() == null) ? 0 : getCustomAmounts().hashCode());
        hashCode = prime * hashCode + ((getCustomAttributes() == null) ? 0 : getCustomAttributes().hashCode());
        hashCode = prime * hashCode + ((getMemoryMiB() == null) ? 0 : getMemoryMiB().hashCode());
        hashCode = prime * hashCode + ((getOsFamily() == null) ? 0 : getOsFamily().hashCode());
        hashCode = prime * hashCode + ((getVCpuCount() == null) ? 0 : getVCpuCount().hashCode());
        return hashCode;
    }

    @Override
    public CustomerManagedWorkerCapabilities clone() {
        try {
            return (CustomerManagedWorkerCapabilities) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.CustomerManagedWorkerCapabilitiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
