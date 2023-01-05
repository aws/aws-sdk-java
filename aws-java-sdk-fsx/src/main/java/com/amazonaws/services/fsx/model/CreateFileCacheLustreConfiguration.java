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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon File Cache configuration for the cache that you are creating.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateFileCacheLustreConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFileCacheLustreConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Provisions the amount of read and write throughput for each 1 tebibyte (TiB) of cache storage capacity, in
     * MB/s/TiB. The only supported value is <code>1000</code>.
     * </p>
     */
    private Integer perUnitStorageThroughput;
    /**
     * <p>
     * Specifies the cache deployment type, which must be <code>CACHE_1</code>.
     * </p>
     */
    private String deploymentType;

    private String weeklyMaintenanceStartTime;
    /**
     * <p>
     * The configuration for a Lustre MDT (Metadata Target) storage volume.
     * </p>
     */
    private FileCacheLustreMetadataConfiguration metadataConfiguration;

    /**
     * <p>
     * Provisions the amount of read and write throughput for each 1 tebibyte (TiB) of cache storage capacity, in
     * MB/s/TiB. The only supported value is <code>1000</code>.
     * </p>
     * 
     * @param perUnitStorageThroughput
     *        Provisions the amount of read and write throughput for each 1 tebibyte (TiB) of cache storage capacity, in
     *        MB/s/TiB. The only supported value is <code>1000</code>.
     */

    public void setPerUnitStorageThroughput(Integer perUnitStorageThroughput) {
        this.perUnitStorageThroughput = perUnitStorageThroughput;
    }

    /**
     * <p>
     * Provisions the amount of read and write throughput for each 1 tebibyte (TiB) of cache storage capacity, in
     * MB/s/TiB. The only supported value is <code>1000</code>.
     * </p>
     * 
     * @return Provisions the amount of read and write throughput for each 1 tebibyte (TiB) of cache storage capacity,
     *         in MB/s/TiB. The only supported value is <code>1000</code>.
     */

    public Integer getPerUnitStorageThroughput() {
        return this.perUnitStorageThroughput;
    }

    /**
     * <p>
     * Provisions the amount of read and write throughput for each 1 tebibyte (TiB) of cache storage capacity, in
     * MB/s/TiB. The only supported value is <code>1000</code>.
     * </p>
     * 
     * @param perUnitStorageThroughput
     *        Provisions the amount of read and write throughput for each 1 tebibyte (TiB) of cache storage capacity, in
     *        MB/s/TiB. The only supported value is <code>1000</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileCacheLustreConfiguration withPerUnitStorageThroughput(Integer perUnitStorageThroughput) {
        setPerUnitStorageThroughput(perUnitStorageThroughput);
        return this;
    }

    /**
     * <p>
     * Specifies the cache deployment type, which must be <code>CACHE_1</code>.
     * </p>
     * 
     * @param deploymentType
     *        Specifies the cache deployment type, which must be <code>CACHE_1</code>.
     * @see FileCacheLustreDeploymentType
     */

    public void setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
    }

    /**
     * <p>
     * Specifies the cache deployment type, which must be <code>CACHE_1</code>.
     * </p>
     * 
     * @return Specifies the cache deployment type, which must be <code>CACHE_1</code>.
     * @see FileCacheLustreDeploymentType
     */

    public String getDeploymentType() {
        return this.deploymentType;
    }

    /**
     * <p>
     * Specifies the cache deployment type, which must be <code>CACHE_1</code>.
     * </p>
     * 
     * @param deploymentType
     *        Specifies the cache deployment type, which must be <code>CACHE_1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileCacheLustreDeploymentType
     */

    public CreateFileCacheLustreConfiguration withDeploymentType(String deploymentType) {
        setDeploymentType(deploymentType);
        return this;
    }

    /**
     * <p>
     * Specifies the cache deployment type, which must be <code>CACHE_1</code>.
     * </p>
     * 
     * @param deploymentType
     *        Specifies the cache deployment type, which must be <code>CACHE_1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileCacheLustreDeploymentType
     */

    public CreateFileCacheLustreConfiguration withDeploymentType(FileCacheLustreDeploymentType deploymentType) {
        this.deploymentType = deploymentType.toString();
        return this;
    }

    /**
     * @param weeklyMaintenanceStartTime
     */

    public void setWeeklyMaintenanceStartTime(String weeklyMaintenanceStartTime) {
        this.weeklyMaintenanceStartTime = weeklyMaintenanceStartTime;
    }

    /**
     * @return
     */

    public String getWeeklyMaintenanceStartTime() {
        return this.weeklyMaintenanceStartTime;
    }

    /**
     * @param weeklyMaintenanceStartTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileCacheLustreConfiguration withWeeklyMaintenanceStartTime(String weeklyMaintenanceStartTime) {
        setWeeklyMaintenanceStartTime(weeklyMaintenanceStartTime);
        return this;
    }

    /**
     * <p>
     * The configuration for a Lustre MDT (Metadata Target) storage volume.
     * </p>
     * 
     * @param metadataConfiguration
     *        The configuration for a Lustre MDT (Metadata Target) storage volume.
     */

    public void setMetadataConfiguration(FileCacheLustreMetadataConfiguration metadataConfiguration) {
        this.metadataConfiguration = metadataConfiguration;
    }

    /**
     * <p>
     * The configuration for a Lustre MDT (Metadata Target) storage volume.
     * </p>
     * 
     * @return The configuration for a Lustre MDT (Metadata Target) storage volume.
     */

    public FileCacheLustreMetadataConfiguration getMetadataConfiguration() {
        return this.metadataConfiguration;
    }

    /**
     * <p>
     * The configuration for a Lustre MDT (Metadata Target) storage volume.
     * </p>
     * 
     * @param metadataConfiguration
     *        The configuration for a Lustre MDT (Metadata Target) storage volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileCacheLustreConfiguration withMetadataConfiguration(FileCacheLustreMetadataConfiguration metadataConfiguration) {
        setMetadataConfiguration(metadataConfiguration);
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
        if (getPerUnitStorageThroughput() != null)
            sb.append("PerUnitStorageThroughput: ").append(getPerUnitStorageThroughput()).append(",");
        if (getDeploymentType() != null)
            sb.append("DeploymentType: ").append(getDeploymentType()).append(",");
        if (getWeeklyMaintenanceStartTime() != null)
            sb.append("WeeklyMaintenanceStartTime: ").append(getWeeklyMaintenanceStartTime()).append(",");
        if (getMetadataConfiguration() != null)
            sb.append("MetadataConfiguration: ").append(getMetadataConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFileCacheLustreConfiguration == false)
            return false;
        CreateFileCacheLustreConfiguration other = (CreateFileCacheLustreConfiguration) obj;
        if (other.getPerUnitStorageThroughput() == null ^ this.getPerUnitStorageThroughput() == null)
            return false;
        if (other.getPerUnitStorageThroughput() != null && other.getPerUnitStorageThroughput().equals(this.getPerUnitStorageThroughput()) == false)
            return false;
        if (other.getDeploymentType() == null ^ this.getDeploymentType() == null)
            return false;
        if (other.getDeploymentType() != null && other.getDeploymentType().equals(this.getDeploymentType()) == false)
            return false;
        if (other.getWeeklyMaintenanceStartTime() == null ^ this.getWeeklyMaintenanceStartTime() == null)
            return false;
        if (other.getWeeklyMaintenanceStartTime() != null && other.getWeeklyMaintenanceStartTime().equals(this.getWeeklyMaintenanceStartTime()) == false)
            return false;
        if (other.getMetadataConfiguration() == null ^ this.getMetadataConfiguration() == null)
            return false;
        if (other.getMetadataConfiguration() != null && other.getMetadataConfiguration().equals(this.getMetadataConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPerUnitStorageThroughput() == null) ? 0 : getPerUnitStorageThroughput().hashCode());
        hashCode = prime * hashCode + ((getDeploymentType() == null) ? 0 : getDeploymentType().hashCode());
        hashCode = prime * hashCode + ((getWeeklyMaintenanceStartTime() == null) ? 0 : getWeeklyMaintenanceStartTime().hashCode());
        hashCode = prime * hashCode + ((getMetadataConfiguration() == null) ? 0 : getMetadataConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CreateFileCacheLustreConfiguration clone() {
        try {
            return (CreateFileCacheLustreConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.CreateFileCacheLustreConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
