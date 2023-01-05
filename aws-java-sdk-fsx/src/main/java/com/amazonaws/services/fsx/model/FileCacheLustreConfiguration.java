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
 * The configuration for the Amazon File Cache resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/FileCacheLustreConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FileCacheLustreConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Per unit storage throughput represents the megabytes per second of read or write throughput per 1 tebibyte of
     * storage provisioned. Cache throughput capacity is equal to Storage capacity (TiB) * PerUnitStorageThroughput
     * (MB/s/TiB). The only supported value is <code>1000</code>.
     * </p>
     */
    private Integer perUnitStorageThroughput;
    /**
     * <p>
     * The deployment type of the Amazon File Cache resource, which must be <code>CACHE_1</code>.
     * </p>
     */
    private String deploymentType;
    /**
     * <p>
     * You use the <code>MountName</code> value when mounting the cache. If you pass a cache ID to the
     * <code>DescribeFileCaches</code> operation, it returns the the <code>MountName</code> value as part of the cache's
     * description.
     * </p>
     */
    private String mountName;

    private String weeklyMaintenanceStartTime;
    /**
     * <p>
     * The configuration for a Lustre MDT (Metadata Target) storage volume.
     * </p>
     */
    private FileCacheLustreMetadataConfiguration metadataConfiguration;
    /**
     * <p>
     * The configuration for Lustre logging used to write the enabled logging events for your Amazon File Cache resource
     * to Amazon CloudWatch Logs.
     * </p>
     */
    private LustreLogConfiguration logConfiguration;

    /**
     * <p>
     * Per unit storage throughput represents the megabytes per second of read or write throughput per 1 tebibyte of
     * storage provisioned. Cache throughput capacity is equal to Storage capacity (TiB) * PerUnitStorageThroughput
     * (MB/s/TiB). The only supported value is <code>1000</code>.
     * </p>
     * 
     * @param perUnitStorageThroughput
     *        Per unit storage throughput represents the megabytes per second of read or write throughput per 1 tebibyte
     *        of storage provisioned. Cache throughput capacity is equal to Storage capacity (TiB) *
     *        PerUnitStorageThroughput (MB/s/TiB). The only supported value is <code>1000</code>.
     */

    public void setPerUnitStorageThroughput(Integer perUnitStorageThroughput) {
        this.perUnitStorageThroughput = perUnitStorageThroughput;
    }

    /**
     * <p>
     * Per unit storage throughput represents the megabytes per second of read or write throughput per 1 tebibyte of
     * storage provisioned. Cache throughput capacity is equal to Storage capacity (TiB) * PerUnitStorageThroughput
     * (MB/s/TiB). The only supported value is <code>1000</code>.
     * </p>
     * 
     * @return Per unit storage throughput represents the megabytes per second of read or write throughput per 1
     *         tebibyte of storage provisioned. Cache throughput capacity is equal to Storage capacity (TiB) *
     *         PerUnitStorageThroughput (MB/s/TiB). The only supported value is <code>1000</code>.
     */

    public Integer getPerUnitStorageThroughput() {
        return this.perUnitStorageThroughput;
    }

    /**
     * <p>
     * Per unit storage throughput represents the megabytes per second of read or write throughput per 1 tebibyte of
     * storage provisioned. Cache throughput capacity is equal to Storage capacity (TiB) * PerUnitStorageThroughput
     * (MB/s/TiB). The only supported value is <code>1000</code>.
     * </p>
     * 
     * @param perUnitStorageThroughput
     *        Per unit storage throughput represents the megabytes per second of read or write throughput per 1 tebibyte
     *        of storage provisioned. Cache throughput capacity is equal to Storage capacity (TiB) *
     *        PerUnitStorageThroughput (MB/s/TiB). The only supported value is <code>1000</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileCacheLustreConfiguration withPerUnitStorageThroughput(Integer perUnitStorageThroughput) {
        setPerUnitStorageThroughput(perUnitStorageThroughput);
        return this;
    }

    /**
     * <p>
     * The deployment type of the Amazon File Cache resource, which must be <code>CACHE_1</code>.
     * </p>
     * 
     * @param deploymentType
     *        The deployment type of the Amazon File Cache resource, which must be <code>CACHE_1</code>.
     * @see FileCacheLustreDeploymentType
     */

    public void setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
    }

    /**
     * <p>
     * The deployment type of the Amazon File Cache resource, which must be <code>CACHE_1</code>.
     * </p>
     * 
     * @return The deployment type of the Amazon File Cache resource, which must be <code>CACHE_1</code>.
     * @see FileCacheLustreDeploymentType
     */

    public String getDeploymentType() {
        return this.deploymentType;
    }

    /**
     * <p>
     * The deployment type of the Amazon File Cache resource, which must be <code>CACHE_1</code>.
     * </p>
     * 
     * @param deploymentType
     *        The deployment type of the Amazon File Cache resource, which must be <code>CACHE_1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileCacheLustreDeploymentType
     */

    public FileCacheLustreConfiguration withDeploymentType(String deploymentType) {
        setDeploymentType(deploymentType);
        return this;
    }

    /**
     * <p>
     * The deployment type of the Amazon File Cache resource, which must be <code>CACHE_1</code>.
     * </p>
     * 
     * @param deploymentType
     *        The deployment type of the Amazon File Cache resource, which must be <code>CACHE_1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileCacheLustreDeploymentType
     */

    public FileCacheLustreConfiguration withDeploymentType(FileCacheLustreDeploymentType deploymentType) {
        this.deploymentType = deploymentType.toString();
        return this;
    }

    /**
     * <p>
     * You use the <code>MountName</code> value when mounting the cache. If you pass a cache ID to the
     * <code>DescribeFileCaches</code> operation, it returns the the <code>MountName</code> value as part of the cache's
     * description.
     * </p>
     * 
     * @param mountName
     *        You use the <code>MountName</code> value when mounting the cache. If you pass a cache ID to the
     *        <code>DescribeFileCaches</code> operation, it returns the the <code>MountName</code> value as part of the
     *        cache's description.
     */

    public void setMountName(String mountName) {
        this.mountName = mountName;
    }

    /**
     * <p>
     * You use the <code>MountName</code> value when mounting the cache. If you pass a cache ID to the
     * <code>DescribeFileCaches</code> operation, it returns the the <code>MountName</code> value as part of the cache's
     * description.
     * </p>
     * 
     * @return You use the <code>MountName</code> value when mounting the cache. If you pass a cache ID to the
     *         <code>DescribeFileCaches</code> operation, it returns the the <code>MountName</code> value as part of the
     *         cache's description.
     */

    public String getMountName() {
        return this.mountName;
    }

    /**
     * <p>
     * You use the <code>MountName</code> value when mounting the cache. If you pass a cache ID to the
     * <code>DescribeFileCaches</code> operation, it returns the the <code>MountName</code> value as part of the cache's
     * description.
     * </p>
     * 
     * @param mountName
     *        You use the <code>MountName</code> value when mounting the cache. If you pass a cache ID to the
     *        <code>DescribeFileCaches</code> operation, it returns the the <code>MountName</code> value as part of the
     *        cache's description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileCacheLustreConfiguration withMountName(String mountName) {
        setMountName(mountName);
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

    public FileCacheLustreConfiguration withWeeklyMaintenanceStartTime(String weeklyMaintenanceStartTime) {
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

    public FileCacheLustreConfiguration withMetadataConfiguration(FileCacheLustreMetadataConfiguration metadataConfiguration) {
        setMetadataConfiguration(metadataConfiguration);
        return this;
    }

    /**
     * <p>
     * The configuration for Lustre logging used to write the enabled logging events for your Amazon File Cache resource
     * to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param logConfiguration
     *        The configuration for Lustre logging used to write the enabled logging events for your Amazon File Cache
     *        resource to Amazon CloudWatch Logs.
     */

    public void setLogConfiguration(LustreLogConfiguration logConfiguration) {
        this.logConfiguration = logConfiguration;
    }

    /**
     * <p>
     * The configuration for Lustre logging used to write the enabled logging events for your Amazon File Cache resource
     * to Amazon CloudWatch Logs.
     * </p>
     * 
     * @return The configuration for Lustre logging used to write the enabled logging events for your Amazon File Cache
     *         resource to Amazon CloudWatch Logs.
     */

    public LustreLogConfiguration getLogConfiguration() {
        return this.logConfiguration;
    }

    /**
     * <p>
     * The configuration for Lustre logging used to write the enabled logging events for your Amazon File Cache resource
     * to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param logConfiguration
     *        The configuration for Lustre logging used to write the enabled logging events for your Amazon File Cache
     *        resource to Amazon CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileCacheLustreConfiguration withLogConfiguration(LustreLogConfiguration logConfiguration) {
        setLogConfiguration(logConfiguration);
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
        if (getMountName() != null)
            sb.append("MountName: ").append(getMountName()).append(",");
        if (getWeeklyMaintenanceStartTime() != null)
            sb.append("WeeklyMaintenanceStartTime: ").append(getWeeklyMaintenanceStartTime()).append(",");
        if (getMetadataConfiguration() != null)
            sb.append("MetadataConfiguration: ").append(getMetadataConfiguration()).append(",");
        if (getLogConfiguration() != null)
            sb.append("LogConfiguration: ").append(getLogConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileCacheLustreConfiguration == false)
            return false;
        FileCacheLustreConfiguration other = (FileCacheLustreConfiguration) obj;
        if (other.getPerUnitStorageThroughput() == null ^ this.getPerUnitStorageThroughput() == null)
            return false;
        if (other.getPerUnitStorageThroughput() != null && other.getPerUnitStorageThroughput().equals(this.getPerUnitStorageThroughput()) == false)
            return false;
        if (other.getDeploymentType() == null ^ this.getDeploymentType() == null)
            return false;
        if (other.getDeploymentType() != null && other.getDeploymentType().equals(this.getDeploymentType()) == false)
            return false;
        if (other.getMountName() == null ^ this.getMountName() == null)
            return false;
        if (other.getMountName() != null && other.getMountName().equals(this.getMountName()) == false)
            return false;
        if (other.getWeeklyMaintenanceStartTime() == null ^ this.getWeeklyMaintenanceStartTime() == null)
            return false;
        if (other.getWeeklyMaintenanceStartTime() != null && other.getWeeklyMaintenanceStartTime().equals(this.getWeeklyMaintenanceStartTime()) == false)
            return false;
        if (other.getMetadataConfiguration() == null ^ this.getMetadataConfiguration() == null)
            return false;
        if (other.getMetadataConfiguration() != null && other.getMetadataConfiguration().equals(this.getMetadataConfiguration()) == false)
            return false;
        if (other.getLogConfiguration() == null ^ this.getLogConfiguration() == null)
            return false;
        if (other.getLogConfiguration() != null && other.getLogConfiguration().equals(this.getLogConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPerUnitStorageThroughput() == null) ? 0 : getPerUnitStorageThroughput().hashCode());
        hashCode = prime * hashCode + ((getDeploymentType() == null) ? 0 : getDeploymentType().hashCode());
        hashCode = prime * hashCode + ((getMountName() == null) ? 0 : getMountName().hashCode());
        hashCode = prime * hashCode + ((getWeeklyMaintenanceStartTime() == null) ? 0 : getWeeklyMaintenanceStartTime().hashCode());
        hashCode = prime * hashCode + ((getMetadataConfiguration() == null) ? 0 : getMetadataConfiguration().hashCode());
        hashCode = prime * hashCode + ((getLogConfiguration() == null) ? 0 : getLogConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public FileCacheLustreConfiguration clone() {
        try {
            return (FileCacheLustreConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.FileCacheLustreConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
