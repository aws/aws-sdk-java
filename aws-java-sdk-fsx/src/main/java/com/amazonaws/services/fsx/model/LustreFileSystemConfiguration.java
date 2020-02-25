/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The configuration for the Amazon FSx for Lustre file system.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/LustreFileSystemConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LustreFileSystemConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The UTC time that you want to begin your weekly maintenance window.
     * </p>
     */
    private String weeklyMaintenanceStartTime;

    private DataRepositoryConfiguration dataRepositoryConfiguration;
    /**
     * <p>
     * The deployment type of the FSX for Lustre file system.
     * </p>
     */
    private String deploymentType;
    /**
     * <p>
     * Per unit storage throughput represents the megabytes per second of read or write throughput per 1 tebibyte of
     * storage provisioned. File system throughput capacity is equal to Storage capacity (TiB) *
     * PerUnitStorageThroughput (MB/s/TiB). This option is only valid for <code>PERSISTENT_1</code> deployment types.
     * Valid values are 50, 100, 200.
     * </p>
     */
    private Integer perUnitStorageThroughput;
    /**
     * <p>
     * You use the <code>MountName</code> value when mounting the file system.
     * </p>
     * <p>
     * For the <code>SCRATCH_1</code> deployment type, this value is always "<code>fsx</code>". For
     * <code>SCRATCH_2</code> and <code>PERSISTENT_1</code> deployment types, this value is a string that is unique
     * within an AWS Region.
     * </p>
     */
    private String mountName;

    /**
     * <p>
     * The UTC time that you want to begin your weekly maintenance window.
     * </p>
     * 
     * @param weeklyMaintenanceStartTime
     *        The UTC time that you want to begin your weekly maintenance window.
     */

    public void setWeeklyMaintenanceStartTime(String weeklyMaintenanceStartTime) {
        this.weeklyMaintenanceStartTime = weeklyMaintenanceStartTime;
    }

    /**
     * <p>
     * The UTC time that you want to begin your weekly maintenance window.
     * </p>
     * 
     * @return The UTC time that you want to begin your weekly maintenance window.
     */

    public String getWeeklyMaintenanceStartTime() {
        return this.weeklyMaintenanceStartTime;
    }

    /**
     * <p>
     * The UTC time that you want to begin your weekly maintenance window.
     * </p>
     * 
     * @param weeklyMaintenanceStartTime
     *        The UTC time that you want to begin your weekly maintenance window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LustreFileSystemConfiguration withWeeklyMaintenanceStartTime(String weeklyMaintenanceStartTime) {
        setWeeklyMaintenanceStartTime(weeklyMaintenanceStartTime);
        return this;
    }

    /**
     * @param dataRepositoryConfiguration
     */

    public void setDataRepositoryConfiguration(DataRepositoryConfiguration dataRepositoryConfiguration) {
        this.dataRepositoryConfiguration = dataRepositoryConfiguration;
    }

    /**
     * @return
     */

    public DataRepositoryConfiguration getDataRepositoryConfiguration() {
        return this.dataRepositoryConfiguration;
    }

    /**
     * @param dataRepositoryConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LustreFileSystemConfiguration withDataRepositoryConfiguration(DataRepositoryConfiguration dataRepositoryConfiguration) {
        setDataRepositoryConfiguration(dataRepositoryConfiguration);
        return this;
    }

    /**
     * <p>
     * The deployment type of the FSX for Lustre file system.
     * </p>
     * 
     * @param deploymentType
     *        The deployment type of the FSX for Lustre file system.
     * @see LustreDeploymentType
     */

    public void setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
    }

    /**
     * <p>
     * The deployment type of the FSX for Lustre file system.
     * </p>
     * 
     * @return The deployment type of the FSX for Lustre file system.
     * @see LustreDeploymentType
     */

    public String getDeploymentType() {
        return this.deploymentType;
    }

    /**
     * <p>
     * The deployment type of the FSX for Lustre file system.
     * </p>
     * 
     * @param deploymentType
     *        The deployment type of the FSX for Lustre file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LustreDeploymentType
     */

    public LustreFileSystemConfiguration withDeploymentType(String deploymentType) {
        setDeploymentType(deploymentType);
        return this;
    }

    /**
     * <p>
     * The deployment type of the FSX for Lustre file system.
     * </p>
     * 
     * @param deploymentType
     *        The deployment type of the FSX for Lustre file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LustreDeploymentType
     */

    public LustreFileSystemConfiguration withDeploymentType(LustreDeploymentType deploymentType) {
        this.deploymentType = deploymentType.toString();
        return this;
    }

    /**
     * <p>
     * Per unit storage throughput represents the megabytes per second of read or write throughput per 1 tebibyte of
     * storage provisioned. File system throughput capacity is equal to Storage capacity (TiB) *
     * PerUnitStorageThroughput (MB/s/TiB). This option is only valid for <code>PERSISTENT_1</code> deployment types.
     * Valid values are 50, 100, 200.
     * </p>
     * 
     * @param perUnitStorageThroughput
     *        Per unit storage throughput represents the megabytes per second of read or write throughput per 1 tebibyte
     *        of storage provisioned. File system throughput capacity is equal to Storage capacity (TiB) *
     *        PerUnitStorageThroughput (MB/s/TiB). This option is only valid for <code>PERSISTENT_1</code> deployment
     *        types. Valid values are 50, 100, 200.
     */

    public void setPerUnitStorageThroughput(Integer perUnitStorageThroughput) {
        this.perUnitStorageThroughput = perUnitStorageThroughput;
    }

    /**
     * <p>
     * Per unit storage throughput represents the megabytes per second of read or write throughput per 1 tebibyte of
     * storage provisioned. File system throughput capacity is equal to Storage capacity (TiB) *
     * PerUnitStorageThroughput (MB/s/TiB). This option is only valid for <code>PERSISTENT_1</code> deployment types.
     * Valid values are 50, 100, 200.
     * </p>
     * 
     * @return Per unit storage throughput represents the megabytes per second of read or write throughput per 1
     *         tebibyte of storage provisioned. File system throughput capacity is equal to Storage capacity (TiB) *
     *         PerUnitStorageThroughput (MB/s/TiB). This option is only valid for <code>PERSISTENT_1</code> deployment
     *         types. Valid values are 50, 100, 200.
     */

    public Integer getPerUnitStorageThroughput() {
        return this.perUnitStorageThroughput;
    }

    /**
     * <p>
     * Per unit storage throughput represents the megabytes per second of read or write throughput per 1 tebibyte of
     * storage provisioned. File system throughput capacity is equal to Storage capacity (TiB) *
     * PerUnitStorageThroughput (MB/s/TiB). This option is only valid for <code>PERSISTENT_1</code> deployment types.
     * Valid values are 50, 100, 200.
     * </p>
     * 
     * @param perUnitStorageThroughput
     *        Per unit storage throughput represents the megabytes per second of read or write throughput per 1 tebibyte
     *        of storage provisioned. File system throughput capacity is equal to Storage capacity (TiB) *
     *        PerUnitStorageThroughput (MB/s/TiB). This option is only valid for <code>PERSISTENT_1</code> deployment
     *        types. Valid values are 50, 100, 200.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LustreFileSystemConfiguration withPerUnitStorageThroughput(Integer perUnitStorageThroughput) {
        setPerUnitStorageThroughput(perUnitStorageThroughput);
        return this;
    }

    /**
     * <p>
     * You use the <code>MountName</code> value when mounting the file system.
     * </p>
     * <p>
     * For the <code>SCRATCH_1</code> deployment type, this value is always "<code>fsx</code>". For
     * <code>SCRATCH_2</code> and <code>PERSISTENT_1</code> deployment types, this value is a string that is unique
     * within an AWS Region.
     * </p>
     * 
     * @param mountName
     *        You use the <code>MountName</code> value when mounting the file system.</p>
     *        <p>
     *        For the <code>SCRATCH_1</code> deployment type, this value is always "<code>fsx</code>". For
     *        <code>SCRATCH_2</code> and <code>PERSISTENT_1</code> deployment types, this value is a string that is
     *        unique within an AWS Region.
     */

    public void setMountName(String mountName) {
        this.mountName = mountName;
    }

    /**
     * <p>
     * You use the <code>MountName</code> value when mounting the file system.
     * </p>
     * <p>
     * For the <code>SCRATCH_1</code> deployment type, this value is always "<code>fsx</code>". For
     * <code>SCRATCH_2</code> and <code>PERSISTENT_1</code> deployment types, this value is a string that is unique
     * within an AWS Region.
     * </p>
     * 
     * @return You use the <code>MountName</code> value when mounting the file system.</p>
     *         <p>
     *         For the <code>SCRATCH_1</code> deployment type, this value is always "<code>fsx</code>". For
     *         <code>SCRATCH_2</code> and <code>PERSISTENT_1</code> deployment types, this value is a string that is
     *         unique within an AWS Region.
     */

    public String getMountName() {
        return this.mountName;
    }

    /**
     * <p>
     * You use the <code>MountName</code> value when mounting the file system.
     * </p>
     * <p>
     * For the <code>SCRATCH_1</code> deployment type, this value is always "<code>fsx</code>". For
     * <code>SCRATCH_2</code> and <code>PERSISTENT_1</code> deployment types, this value is a string that is unique
     * within an AWS Region.
     * </p>
     * 
     * @param mountName
     *        You use the <code>MountName</code> value when mounting the file system.</p>
     *        <p>
     *        For the <code>SCRATCH_1</code> deployment type, this value is always "<code>fsx</code>". For
     *        <code>SCRATCH_2</code> and <code>PERSISTENT_1</code> deployment types, this value is a string that is
     *        unique within an AWS Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LustreFileSystemConfiguration withMountName(String mountName) {
        setMountName(mountName);
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
        if (getWeeklyMaintenanceStartTime() != null)
            sb.append("WeeklyMaintenanceStartTime: ").append(getWeeklyMaintenanceStartTime()).append(",");
        if (getDataRepositoryConfiguration() != null)
            sb.append("DataRepositoryConfiguration: ").append(getDataRepositoryConfiguration()).append(",");
        if (getDeploymentType() != null)
            sb.append("DeploymentType: ").append(getDeploymentType()).append(",");
        if (getPerUnitStorageThroughput() != null)
            sb.append("PerUnitStorageThroughput: ").append(getPerUnitStorageThroughput()).append(",");
        if (getMountName() != null)
            sb.append("MountName: ").append(getMountName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LustreFileSystemConfiguration == false)
            return false;
        LustreFileSystemConfiguration other = (LustreFileSystemConfiguration) obj;
        if (other.getWeeklyMaintenanceStartTime() == null ^ this.getWeeklyMaintenanceStartTime() == null)
            return false;
        if (other.getWeeklyMaintenanceStartTime() != null && other.getWeeklyMaintenanceStartTime().equals(this.getWeeklyMaintenanceStartTime()) == false)
            return false;
        if (other.getDataRepositoryConfiguration() == null ^ this.getDataRepositoryConfiguration() == null)
            return false;
        if (other.getDataRepositoryConfiguration() != null && other.getDataRepositoryConfiguration().equals(this.getDataRepositoryConfiguration()) == false)
            return false;
        if (other.getDeploymentType() == null ^ this.getDeploymentType() == null)
            return false;
        if (other.getDeploymentType() != null && other.getDeploymentType().equals(this.getDeploymentType()) == false)
            return false;
        if (other.getPerUnitStorageThroughput() == null ^ this.getPerUnitStorageThroughput() == null)
            return false;
        if (other.getPerUnitStorageThroughput() != null && other.getPerUnitStorageThroughput().equals(this.getPerUnitStorageThroughput()) == false)
            return false;
        if (other.getMountName() == null ^ this.getMountName() == null)
            return false;
        if (other.getMountName() != null && other.getMountName().equals(this.getMountName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWeeklyMaintenanceStartTime() == null) ? 0 : getWeeklyMaintenanceStartTime().hashCode());
        hashCode = prime * hashCode + ((getDataRepositoryConfiguration() == null) ? 0 : getDataRepositoryConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDeploymentType() == null) ? 0 : getDeploymentType().hashCode());
        hashCode = prime * hashCode + ((getPerUnitStorageThroughput() == null) ? 0 : getPerUnitStorageThroughput().hashCode());
        hashCode = prime * hashCode + ((getMountName() == null) ? 0 : getMountName().hashCode());
        return hashCode;
    }

    @Override
    public LustreFileSystemConfiguration clone() {
        try {
            return (LustreFileSystemConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.LustreFileSystemConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
