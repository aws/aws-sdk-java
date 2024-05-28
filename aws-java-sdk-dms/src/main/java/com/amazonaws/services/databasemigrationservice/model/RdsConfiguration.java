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
 * Provides information that describes the configuration of the recommended target engine on Amazon RDS.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/RdsConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RdsConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes the recommended target Amazon RDS engine edition.
     * </p>
     */
    private String engineEdition;
    /**
     * <p>
     * Describes the recommended target Amazon RDS instance type.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * Describes the number of virtual CPUs (vCPU) on the recommended Amazon RDS DB instance that meets your
     * requirements.
     * </p>
     */
    private Double instanceVcpu;
    /**
     * <p>
     * Describes the memory on the recommended Amazon RDS DB instance that meets your requirements.
     * </p>
     */
    private Double instanceMemory;
    /**
     * <p>
     * Describes the storage type of the recommended Amazon RDS DB instance that meets your requirements.
     * </p>
     * <p>
     * Amazon RDS provides three storage types: General Purpose SSD (also known as gp2 and gp3), Provisioned IOPS SSD
     * (also known as io1), and magnetic (also known as standard).
     * </p>
     */
    private String storageType;
    /**
     * <p>
     * Describes the storage size of the recommended Amazon RDS DB instance that meets your requirements.
     * </p>
     */
    private Integer storageSize;
    /**
     * <p>
     * Describes the number of I/O operations completed each second (IOPS) on the recommended Amazon RDS DB instance
     * that meets your requirements.
     * </p>
     */
    private Integer storageIops;
    /**
     * <p>
     * Describes the deployment option for the recommended Amazon RDS DB instance. The deployment options include
     * Multi-AZ and Single-AZ deployments. Valid values include <code>"MULTI_AZ"</code> and <code>"SINGLE_AZ"</code>.
     * </p>
     */
    private String deploymentOption;
    /**
     * <p>
     * Describes the recommended target Amazon RDS engine version.
     * </p>
     */
    private String engineVersion;

    /**
     * <p>
     * Describes the recommended target Amazon RDS engine edition.
     * </p>
     * 
     * @param engineEdition
     *        Describes the recommended target Amazon RDS engine edition.
     */

    public void setEngineEdition(String engineEdition) {
        this.engineEdition = engineEdition;
    }

    /**
     * <p>
     * Describes the recommended target Amazon RDS engine edition.
     * </p>
     * 
     * @return Describes the recommended target Amazon RDS engine edition.
     */

    public String getEngineEdition() {
        return this.engineEdition;
    }

    /**
     * <p>
     * Describes the recommended target Amazon RDS engine edition.
     * </p>
     * 
     * @param engineEdition
     *        Describes the recommended target Amazon RDS engine edition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsConfiguration withEngineEdition(String engineEdition) {
        setEngineEdition(engineEdition);
        return this;
    }

    /**
     * <p>
     * Describes the recommended target Amazon RDS instance type.
     * </p>
     * 
     * @param instanceType
     *        Describes the recommended target Amazon RDS instance type.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * Describes the recommended target Amazon RDS instance type.
     * </p>
     * 
     * @return Describes the recommended target Amazon RDS instance type.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * Describes the recommended target Amazon RDS instance type.
     * </p>
     * 
     * @param instanceType
     *        Describes the recommended target Amazon RDS instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsConfiguration withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * Describes the number of virtual CPUs (vCPU) on the recommended Amazon RDS DB instance that meets your
     * requirements.
     * </p>
     * 
     * @param instanceVcpu
     *        Describes the number of virtual CPUs (vCPU) on the recommended Amazon RDS DB instance that meets your
     *        requirements.
     */

    public void setInstanceVcpu(Double instanceVcpu) {
        this.instanceVcpu = instanceVcpu;
    }

    /**
     * <p>
     * Describes the number of virtual CPUs (vCPU) on the recommended Amazon RDS DB instance that meets your
     * requirements.
     * </p>
     * 
     * @return Describes the number of virtual CPUs (vCPU) on the recommended Amazon RDS DB instance that meets your
     *         requirements.
     */

    public Double getInstanceVcpu() {
        return this.instanceVcpu;
    }

    /**
     * <p>
     * Describes the number of virtual CPUs (vCPU) on the recommended Amazon RDS DB instance that meets your
     * requirements.
     * </p>
     * 
     * @param instanceVcpu
     *        Describes the number of virtual CPUs (vCPU) on the recommended Amazon RDS DB instance that meets your
     *        requirements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsConfiguration withInstanceVcpu(Double instanceVcpu) {
        setInstanceVcpu(instanceVcpu);
        return this;
    }

    /**
     * <p>
     * Describes the memory on the recommended Amazon RDS DB instance that meets your requirements.
     * </p>
     * 
     * @param instanceMemory
     *        Describes the memory on the recommended Amazon RDS DB instance that meets your requirements.
     */

    public void setInstanceMemory(Double instanceMemory) {
        this.instanceMemory = instanceMemory;
    }

    /**
     * <p>
     * Describes the memory on the recommended Amazon RDS DB instance that meets your requirements.
     * </p>
     * 
     * @return Describes the memory on the recommended Amazon RDS DB instance that meets your requirements.
     */

    public Double getInstanceMemory() {
        return this.instanceMemory;
    }

    /**
     * <p>
     * Describes the memory on the recommended Amazon RDS DB instance that meets your requirements.
     * </p>
     * 
     * @param instanceMemory
     *        Describes the memory on the recommended Amazon RDS DB instance that meets your requirements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsConfiguration withInstanceMemory(Double instanceMemory) {
        setInstanceMemory(instanceMemory);
        return this;
    }

    /**
     * <p>
     * Describes the storage type of the recommended Amazon RDS DB instance that meets your requirements.
     * </p>
     * <p>
     * Amazon RDS provides three storage types: General Purpose SSD (also known as gp2 and gp3), Provisioned IOPS SSD
     * (also known as io1), and magnetic (also known as standard).
     * </p>
     * 
     * @param storageType
     *        Describes the storage type of the recommended Amazon RDS DB instance that meets your requirements.</p>
     *        <p>
     *        Amazon RDS provides three storage types: General Purpose SSD (also known as gp2 and gp3), Provisioned IOPS
     *        SSD (also known as io1), and magnetic (also known as standard).
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * Describes the storage type of the recommended Amazon RDS DB instance that meets your requirements.
     * </p>
     * <p>
     * Amazon RDS provides three storage types: General Purpose SSD (also known as gp2 and gp3), Provisioned IOPS SSD
     * (also known as io1), and magnetic (also known as standard).
     * </p>
     * 
     * @return Describes the storage type of the recommended Amazon RDS DB instance that meets your requirements.</p>
     *         <p>
     *         Amazon RDS provides three storage types: General Purpose SSD (also known as gp2 and gp3), Provisioned
     *         IOPS SSD (also known as io1), and magnetic (also known as standard).
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * Describes the storage type of the recommended Amazon RDS DB instance that meets your requirements.
     * </p>
     * <p>
     * Amazon RDS provides three storage types: General Purpose SSD (also known as gp2 and gp3), Provisioned IOPS SSD
     * (also known as io1), and magnetic (also known as standard).
     * </p>
     * 
     * @param storageType
     *        Describes the storage type of the recommended Amazon RDS DB instance that meets your requirements.</p>
     *        <p>
     *        Amazon RDS provides three storage types: General Purpose SSD (also known as gp2 and gp3), Provisioned IOPS
     *        SSD (also known as io1), and magnetic (also known as standard).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsConfiguration withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p>
     * Describes the storage size of the recommended Amazon RDS DB instance that meets your requirements.
     * </p>
     * 
     * @param storageSize
     *        Describes the storage size of the recommended Amazon RDS DB instance that meets your requirements.
     */

    public void setStorageSize(Integer storageSize) {
        this.storageSize = storageSize;
    }

    /**
     * <p>
     * Describes the storage size of the recommended Amazon RDS DB instance that meets your requirements.
     * </p>
     * 
     * @return Describes the storage size of the recommended Amazon RDS DB instance that meets your requirements.
     */

    public Integer getStorageSize() {
        return this.storageSize;
    }

    /**
     * <p>
     * Describes the storage size of the recommended Amazon RDS DB instance that meets your requirements.
     * </p>
     * 
     * @param storageSize
     *        Describes the storage size of the recommended Amazon RDS DB instance that meets your requirements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsConfiguration withStorageSize(Integer storageSize) {
        setStorageSize(storageSize);
        return this;
    }

    /**
     * <p>
     * Describes the number of I/O operations completed each second (IOPS) on the recommended Amazon RDS DB instance
     * that meets your requirements.
     * </p>
     * 
     * @param storageIops
     *        Describes the number of I/O operations completed each second (IOPS) on the recommended Amazon RDS DB
     *        instance that meets your requirements.
     */

    public void setStorageIops(Integer storageIops) {
        this.storageIops = storageIops;
    }

    /**
     * <p>
     * Describes the number of I/O operations completed each second (IOPS) on the recommended Amazon RDS DB instance
     * that meets your requirements.
     * </p>
     * 
     * @return Describes the number of I/O operations completed each second (IOPS) on the recommended Amazon RDS DB
     *         instance that meets your requirements.
     */

    public Integer getStorageIops() {
        return this.storageIops;
    }

    /**
     * <p>
     * Describes the number of I/O operations completed each second (IOPS) on the recommended Amazon RDS DB instance
     * that meets your requirements.
     * </p>
     * 
     * @param storageIops
     *        Describes the number of I/O operations completed each second (IOPS) on the recommended Amazon RDS DB
     *        instance that meets your requirements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsConfiguration withStorageIops(Integer storageIops) {
        setStorageIops(storageIops);
        return this;
    }

    /**
     * <p>
     * Describes the deployment option for the recommended Amazon RDS DB instance. The deployment options include
     * Multi-AZ and Single-AZ deployments. Valid values include <code>"MULTI_AZ"</code> and <code>"SINGLE_AZ"</code>.
     * </p>
     * 
     * @param deploymentOption
     *        Describes the deployment option for the recommended Amazon RDS DB instance. The deployment options include
     *        Multi-AZ and Single-AZ deployments. Valid values include <code>"MULTI_AZ"</code> and
     *        <code>"SINGLE_AZ"</code>.
     */

    public void setDeploymentOption(String deploymentOption) {
        this.deploymentOption = deploymentOption;
    }

    /**
     * <p>
     * Describes the deployment option for the recommended Amazon RDS DB instance. The deployment options include
     * Multi-AZ and Single-AZ deployments. Valid values include <code>"MULTI_AZ"</code> and <code>"SINGLE_AZ"</code>.
     * </p>
     * 
     * @return Describes the deployment option for the recommended Amazon RDS DB instance. The deployment options
     *         include Multi-AZ and Single-AZ deployments. Valid values include <code>"MULTI_AZ"</code> and
     *         <code>"SINGLE_AZ"</code>.
     */

    public String getDeploymentOption() {
        return this.deploymentOption;
    }

    /**
     * <p>
     * Describes the deployment option for the recommended Amazon RDS DB instance. The deployment options include
     * Multi-AZ and Single-AZ deployments. Valid values include <code>"MULTI_AZ"</code> and <code>"SINGLE_AZ"</code>.
     * </p>
     * 
     * @param deploymentOption
     *        Describes the deployment option for the recommended Amazon RDS DB instance. The deployment options include
     *        Multi-AZ and Single-AZ deployments. Valid values include <code>"MULTI_AZ"</code> and
     *        <code>"SINGLE_AZ"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsConfiguration withDeploymentOption(String deploymentOption) {
        setDeploymentOption(deploymentOption);
        return this;
    }

    /**
     * <p>
     * Describes the recommended target Amazon RDS engine version.
     * </p>
     * 
     * @param engineVersion
     *        Describes the recommended target Amazon RDS engine version.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * Describes the recommended target Amazon RDS engine version.
     * </p>
     * 
     * @return Describes the recommended target Amazon RDS engine version.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * Describes the recommended target Amazon RDS engine version.
     * </p>
     * 
     * @param engineVersion
     *        Describes the recommended target Amazon RDS engine version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RdsConfiguration withEngineVersion(String engineVersion) {
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
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getInstanceVcpu() != null)
            sb.append("InstanceVcpu: ").append(getInstanceVcpu()).append(",");
        if (getInstanceMemory() != null)
            sb.append("InstanceMemory: ").append(getInstanceMemory()).append(",");
        if (getStorageType() != null)
            sb.append("StorageType: ").append(getStorageType()).append(",");
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

        if (obj instanceof RdsConfiguration == false)
            return false;
        RdsConfiguration other = (RdsConfiguration) obj;
        if (other.getEngineEdition() == null ^ this.getEngineEdition() == null)
            return false;
        if (other.getEngineEdition() != null && other.getEngineEdition().equals(this.getEngineEdition()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getInstanceVcpu() == null ^ this.getInstanceVcpu() == null)
            return false;
        if (other.getInstanceVcpu() != null && other.getInstanceVcpu().equals(this.getInstanceVcpu()) == false)
            return false;
        if (other.getInstanceMemory() == null ^ this.getInstanceMemory() == null)
            return false;
        if (other.getInstanceMemory() != null && other.getInstanceMemory().equals(this.getInstanceMemory()) == false)
            return false;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false)
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
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getInstanceVcpu() == null) ? 0 : getInstanceVcpu().hashCode());
        hashCode = prime * hashCode + ((getInstanceMemory() == null) ? 0 : getInstanceMemory().hashCode());
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getStorageSize() == null) ? 0 : getStorageSize().hashCode());
        hashCode = prime * hashCode + ((getStorageIops() == null) ? 0 : getStorageIops().hashCode());
        hashCode = prime * hashCode + ((getDeploymentOption() == null) ? 0 : getDeploymentOption().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        return hashCode;
    }

    @Override
    public RdsConfiguration clone() {
        try {
            return (RdsConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.RdsConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
