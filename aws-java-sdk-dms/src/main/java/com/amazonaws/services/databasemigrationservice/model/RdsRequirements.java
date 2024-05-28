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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information that describes the requirements to the target engine on Amazon RDS.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/RdsRequirements" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RdsRequirements implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The required target Amazon RDS engine edition.
     * </p>
     */
    private String engineEdition;
    /**
     * <p>
     * The required number of virtual CPUs (vCPU) on the Amazon RDS DB instance.
     * </p>
     */
    private Double instanceVcpu;
    /**
     * <p>
     * The required memory on the Amazon RDS DB instance.
     * </p>
     */
    private Double instanceMemory;
    /**
     * <p>
     * The required Amazon RDS DB instance storage size.
     * </p>
     */
    private Integer storageSize;
    /**
     * <p>
     * The required number of I/O operations completed each second (IOPS) on your Amazon RDS DB instance.
     * </p>
     */
    private Integer storageIops;
    /**
     * <p>
     * The required deployment option for the Amazon RDS DB instance. Valid values include <code>"MULTI_AZ"</code> for
     * Multi-AZ deployments and <code>"SINGLE_AZ"</code> for Single-AZ deployments.
     * </p>
     */
    private String deploymentOption;
    /**
     * <p>
     * The required target Amazon RDS engine version.
     * </p>
     */
    private String engineVersion;

    /**
     * <p>
     * The required target Amazon RDS engine edition.
     * </p>
     * 
     * @param engineEdition
     *        The required target Amazon RDS engine edition.
     */

    public void setEngineEdition(String engineEdition) {
        this.engineEdition = engineEdition;
    }

    /**
     * <p>
     * The required target Amazon RDS engine edition.
     * </p>
     * 
     * @return The required target Amazon RDS engine edition.
     */

    public String getEngineEdition() {
        return this.engineEdition;
    }

    /**
     * <p>
     * The required target Amazon RDS engine edition.
     * </p>
     * 
     * @param engineEdition
     *        The required target Amazon RDS engine edition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsRequirements withEngineEdition(String engineEdition) {
        setEngineEdition(engineEdition);
        return this;
    }

    /**
     * <p>
     * The required number of virtual CPUs (vCPU) on the Amazon RDS DB instance.
     * </p>
     * 
     * @param instanceVcpu
     *        The required number of virtual CPUs (vCPU) on the Amazon RDS DB instance.
     */

    public void setInstanceVcpu(Double instanceVcpu) {
        this.instanceVcpu = instanceVcpu;
    }

    /**
     * <p>
     * The required number of virtual CPUs (vCPU) on the Amazon RDS DB instance.
     * </p>
     * 
     * @return The required number of virtual CPUs (vCPU) on the Amazon RDS DB instance.
     */

    public Double getInstanceVcpu() {
        return this.instanceVcpu;
    }

    /**
     * <p>
     * The required number of virtual CPUs (vCPU) on the Amazon RDS DB instance.
     * </p>
     * 
     * @param instanceVcpu
     *        The required number of virtual CPUs (vCPU) on the Amazon RDS DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsRequirements withInstanceVcpu(Double instanceVcpu) {
        setInstanceVcpu(instanceVcpu);
        return this;
    }

    /**
     * <p>
     * The required memory on the Amazon RDS DB instance.
     * </p>
     * 
     * @param instanceMemory
     *        The required memory on the Amazon RDS DB instance.
     */

    public void setInstanceMemory(Double instanceMemory) {
        this.instanceMemory = instanceMemory;
    }

    /**
     * <p>
     * The required memory on the Amazon RDS DB instance.
     * </p>
     * 
     * @return The required memory on the Amazon RDS DB instance.
     */

    public Double getInstanceMemory() {
        return this.instanceMemory;
    }

    /**
     * <p>
     * The required memory on the Amazon RDS DB instance.
     * </p>
     * 
     * @param instanceMemory
     *        The required memory on the Amazon RDS DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsRequirements withInstanceMemory(Double instanceMemory) {
        setInstanceMemory(instanceMemory);
        return this;
    }

    /**
     * <p>
     * The required Amazon RDS DB instance storage size.
     * </p>
     * 
     * @param storageSize
     *        The required Amazon RDS DB instance storage size.
     */

    public void setStorageSize(Integer storageSize) {
        this.storageSize = storageSize;
    }

    /**
     * <p>
     * The required Amazon RDS DB instance storage size.
     * </p>
     * 
     * @return The required Amazon RDS DB instance storage size.
     */

    public Integer getStorageSize() {
        return this.storageSize;
    }

    /**
     * <p>
     * The required Amazon RDS DB instance storage size.
     * </p>
     * 
     * @param storageSize
     *        The required Amazon RDS DB instance storage size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsRequirements withStorageSize(Integer storageSize) {
        setStorageSize(storageSize);
        return this;
    }

    /**
     * <p>
     * The required number of I/O operations completed each second (IOPS) on your Amazon RDS DB instance.
     * </p>
     * 
     * @param storageIops
     *        The required number of I/O operations completed each second (IOPS) on your Amazon RDS DB instance.
     */

    public void setStorageIops(Integer storageIops) {
        this.storageIops = storageIops;
    }

    /**
     * <p>
     * The required number of I/O operations completed each second (IOPS) on your Amazon RDS DB instance.
     * </p>
     * 
     * @return The required number of I/O operations completed each second (IOPS) on your Amazon RDS DB instance.
     */

    public Integer getStorageIops() {
        return this.storageIops;
    }

    /**
     * <p>
     * The required number of I/O operations completed each second (IOPS) on your Amazon RDS DB instance.
     * </p>
     * 
     * @param storageIops
     *        The required number of I/O operations completed each second (IOPS) on your Amazon RDS DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsRequirements withStorageIops(Integer storageIops) {
        setStorageIops(storageIops);
        return this;
    }

    /**
     * <p>
     * The required deployment option for the Amazon RDS DB instance. Valid values include <code>"MULTI_AZ"</code> for
     * Multi-AZ deployments and <code>"SINGLE_AZ"</code> for Single-AZ deployments.
     * </p>
     * 
     * @param deploymentOption
     *        The required deployment option for the Amazon RDS DB instance. Valid values include
     *        <code>"MULTI_AZ"</code> for Multi-AZ deployments and <code>"SINGLE_AZ"</code> for Single-AZ deployments.
     */

    public void setDeploymentOption(String deploymentOption) {
        this.deploymentOption = deploymentOption;
    }

    /**
     * <p>
     * The required deployment option for the Amazon RDS DB instance. Valid values include <code>"MULTI_AZ"</code> for
     * Multi-AZ deployments and <code>"SINGLE_AZ"</code> for Single-AZ deployments.
     * </p>
     * 
     * @return The required deployment option for the Amazon RDS DB instance. Valid values include
     *         <code>"MULTI_AZ"</code> for Multi-AZ deployments and <code>"SINGLE_AZ"</code> for Single-AZ deployments.
     */

    public String getDeploymentOption() {
        return this.deploymentOption;
    }

    /**
     * <p>
     * The required deployment option for the Amazon RDS DB instance. Valid values include <code>"MULTI_AZ"</code> for
     * Multi-AZ deployments and <code>"SINGLE_AZ"</code> for Single-AZ deployments.
     * </p>
     * 
     * @param deploymentOption
     *        The required deployment option for the Amazon RDS DB instance. Valid values include
     *        <code>"MULTI_AZ"</code> for Multi-AZ deployments and <code>"SINGLE_AZ"</code> for Single-AZ deployments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsRequirements withDeploymentOption(String deploymentOption) {
        setDeploymentOption(deploymentOption);
        return this;
    }

    /**
     * <p>
     * The required target Amazon RDS engine version.
     * </p>
     * 
     * @param engineVersion
     *        The required target Amazon RDS engine version.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The required target Amazon RDS engine version.
     * </p>
     * 
     * @return The required target Amazon RDS engine version.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The required target Amazon RDS engine version.
     * </p>
     * 
     * @param engineVersion
     *        The required target Amazon RDS engine version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsRequirements withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
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
        if (getEngineEdition() != null)
            sb.append("EngineEdition: ").append(getEngineEdition()).append(",");
        if (getInstanceVcpu() != null)
            sb.append("InstanceVcpu: ").append(getInstanceVcpu()).append(",");
        if (getInstanceMemory() != null)
            sb.append("InstanceMemory: ").append(getInstanceMemory()).append(",");
        if (getStorageSize() != null)
            sb.append("StorageSize: ").append(getStorageSize()).append(",");
        if (getStorageIops() != null)
            sb.append("StorageIops: ").append(getStorageIops()).append(",");
        if (getDeploymentOption() != null)
            sb.append("DeploymentOption: ").append(getDeploymentOption()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RdsRequirements == false)
            return false;
        RdsRequirements other = (RdsRequirements) obj;
        if (other.getEngineEdition() == null ^ this.getEngineEdition() == null)
            return false;
        if (other.getEngineEdition() != null && other.getEngineEdition().equals(this.getEngineEdition()) == false)
            return false;
        if (other.getInstanceVcpu() == null ^ this.getInstanceVcpu() == null)
            return false;
        if (other.getInstanceVcpu() != null && other.getInstanceVcpu().equals(this.getInstanceVcpu()) == false)
            return false;
        if (other.getInstanceMemory() == null ^ this.getInstanceMemory() == null)
            return false;
        if (other.getInstanceMemory() != null && other.getInstanceMemory().equals(this.getInstanceMemory()) == false)
            return false;
        if (other.getStorageSize() == null ^ this.getStorageSize() == null)
            return false;
        if (other.getStorageSize() != null && other.getStorageSize().equals(this.getStorageSize()) == false)
            return false;
        if (other.getStorageIops() == null ^ this.getStorageIops() == null)
            return false;
        if (other.getStorageIops() != null && other.getStorageIops().equals(this.getStorageIops()) == false)
            return false;
        if (other.getDeploymentOption() == null ^ this.getDeploymentOption() == null)
            return false;
        if (other.getDeploymentOption() != null && other.getDeploymentOption().equals(this.getDeploymentOption()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngineEdition() == null) ? 0 : getEngineEdition().hashCode());
        hashCode = prime * hashCode + ((getInstanceVcpu() == null) ? 0 : getInstanceVcpu().hashCode());
        hashCode = prime * hashCode + ((getInstanceMemory() == null) ? 0 : getInstanceMemory().hashCode());
        hashCode = prime * hashCode + ((getStorageSize() == null) ? 0 : getStorageSize().hashCode());
        hashCode = prime * hashCode + ((getStorageIops() == null) ? 0 : getStorageIops().hashCode());
        hashCode = prime * hashCode + ((getDeploymentOption() == null) ? 0 : getDeploymentOption().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        return hashCode;
    }

    @Override
    public RdsRequirements clone() {
        try {
            return (RdsRequirements) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.RdsRequirementsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
