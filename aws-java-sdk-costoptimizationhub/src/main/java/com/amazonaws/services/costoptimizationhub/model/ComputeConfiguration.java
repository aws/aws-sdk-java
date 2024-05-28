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
package com.amazonaws.services.costoptimizationhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the performance configuration for compute services such as Amazon EC2, Lambda, and ECS.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/ComputeConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComputeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The architecture of the resource.
     * </p>
     */
    private String architecture;
    /**
     * <p>
     * The memory size of the resource.
     * </p>
     */
    private Integer memorySizeInMB;
    /**
     * <p>
     * The platform of the resource. The platform is the specific combination of operating system, license model, and
     * software on an instance.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The number of vCPU cores in the resource.
     * </p>
     */
    private Double vCpu;

    /**
     * <p>
     * The architecture of the resource.
     * </p>
     * 
     * @param architecture
     *        The architecture of the resource.
     */

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    /**
     * <p>
     * The architecture of the resource.
     * </p>
     * 
     * @return The architecture of the resource.
     */

    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * <p>
     * The architecture of the resource.
     * </p>
     * 
     * @param architecture
     *        The architecture of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeConfiguration withArchitecture(String architecture) {
        setArchitecture(architecture);
        return this;
    }

    /**
     * <p>
     * The memory size of the resource.
     * </p>
     * 
     * @param memorySizeInMB
     *        The memory size of the resource.
     */

    public void setMemorySizeInMB(Integer memorySizeInMB) {
        this.memorySizeInMB = memorySizeInMB;
    }

    /**
     * <p>
     * The memory size of the resource.
     * </p>
     * 
     * @return The memory size of the resource.
     */

    public Integer getMemorySizeInMB() {
        return this.memorySizeInMB;
    }

    /**
     * <p>
     * The memory size of the resource.
     * </p>
     * 
     * @param memorySizeInMB
     *        The memory size of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeConfiguration withMemorySizeInMB(Integer memorySizeInMB) {
        setMemorySizeInMB(memorySizeInMB);
        return this;
    }

    /**
     * <p>
     * The platform of the resource. The platform is the specific combination of operating system, license model, and
     * software on an instance.
     * </p>
     * 
     * @param platform
     *        The platform of the resource. The platform is the specific combination of operating system, license model,
     *        and software on an instance.
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The platform of the resource. The platform is the specific combination of operating system, license model, and
     * software on an instance.
     * </p>
     * 
     * @return The platform of the resource. The platform is the specific combination of operating system, license
     *         model, and software on an instance.
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The platform of the resource. The platform is the specific combination of operating system, license model, and
     * software on an instance.
     * </p>
     * 
     * @param platform
     *        The platform of the resource. The platform is the specific combination of operating system, license model,
     *        and software on an instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeConfiguration withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The number of vCPU cores in the resource.
     * </p>
     * 
     * @param vCpu
     *        The number of vCPU cores in the resource.
     */

    public void setVCpu(Double vCpu) {
        this.vCpu = vCpu;
    }

    /**
     * <p>
     * The number of vCPU cores in the resource.
     * </p>
     * 
     * @return The number of vCPU cores in the resource.
     */

    public Double getVCpu() {
        return this.vCpu;
    }

    /**
     * <p>
     * The number of vCPU cores in the resource.
     * </p>
     * 
     * @param vCpu
     *        The number of vCPU cores in the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComputeConfiguration withVCpu(Double vCpu) {
        setVCpu(vCpu);
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
        if (getArchitecture() != null)
            sb.append("Architecture: ").append(getArchitecture()).append(",");
        if (getMemorySizeInMB() != null)
            sb.append("MemorySizeInMB: ").append(getMemorySizeInMB()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getVCpu() != null)
            sb.append("VCpu: ").append(getVCpu());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComputeConfiguration == false)
            return false;
        ComputeConfiguration other = (ComputeConfiguration) obj;
        if (other.getArchitecture() == null ^ this.getArchitecture() == null)
            return false;
        if (other.getArchitecture() != null && other.getArchitecture().equals(this.getArchitecture()) == false)
            return false;
        if (other.getMemorySizeInMB() == null ^ this.getMemorySizeInMB() == null)
            return false;
        if (other.getMemorySizeInMB() != null && other.getMemorySizeInMB().equals(this.getMemorySizeInMB()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getVCpu() == null ^ this.getVCpu() == null)
            return false;
        if (other.getVCpu() != null && other.getVCpu().equals(this.getVCpu()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArchitecture() == null) ? 0 : getArchitecture().hashCode());
        hashCode = prime * hashCode + ((getMemorySizeInMB() == null) ? 0 : getMemorySizeInMB().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getVCpu() == null) ? 0 : getVCpu().hashCode());
        return hashCode;
    }

    @Override
    public ComputeConfiguration clone() {
        try {
            return (ComputeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costoptimizationhub.model.transform.ComputeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
