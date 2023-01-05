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
 * The configuration updates for an Amazon FSx for NetApp ONTAP file system.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateFileSystemOntapConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFileSystemOntapConfiguration implements Serializable, Cloneable, StructuredPojo {

    private Integer automaticBackupRetentionDays;

    private String dailyAutomaticBackupStartTime;
    /**
     * <p>
     * The ONTAP administrative password for the <code>fsxadmin</code> user.
     * </p>
     */
    private String fsxAdminPassword;

    private String weeklyMaintenanceStartTime;
    /**
     * <p>
     * The SSD IOPS (input/output operations per second) configuration for an Amazon FSx for NetApp ONTAP file system.
     * The default is 3 IOPS per GB of storage capacity, but you can provision additional IOPS per GB of storage. The
     * configuration consists of an IOPS mode (<code>AUTOMATIC</code> or <code>USER_PROVISIONED</code>), and in the case
     * of <code>USER_PROVISIONED</code> IOPS, the total number of SSD IOPS provisioned.
     * </p>
     */
    private DiskIopsConfiguration diskIopsConfiguration;
    /**
     * <p>
     * Specifies the throughput of an FSx for NetApp ONTAP file system, measured in megabytes per second (MBps). Valid
     * values are 128, 256, 512, 1024, 2048, and 4096 MBps.
     * </p>
     */
    private Integer throughputCapacity;
    /**
     * <p>
     * (Multi-AZ only) A list of IDs of new virtual private cloud (VPC) route tables to associate (add) with your Amazon
     * FSx for NetApp ONTAP file system.
     * </p>
     */
    private java.util.List<String> addRouteTableIds;
    /**
     * <p>
     * (Multi-AZ only) A list of IDs of existing virtual private cloud (VPC) route tables to disassociate (remove) from
     * your Amazon FSx for NetApp ONTAP file system. You can use the API operation to retrieve the list of VPC route
     * table IDs for a file system.
     * </p>
     */
    private java.util.List<String> removeRouteTableIds;

    /**
     * @param automaticBackupRetentionDays
     */

    public void setAutomaticBackupRetentionDays(Integer automaticBackupRetentionDays) {
        this.automaticBackupRetentionDays = automaticBackupRetentionDays;
    }

    /**
     * @return
     */

    public Integer getAutomaticBackupRetentionDays() {
        return this.automaticBackupRetentionDays;
    }

    /**
     * @param automaticBackupRetentionDays
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemOntapConfiguration withAutomaticBackupRetentionDays(Integer automaticBackupRetentionDays) {
        setAutomaticBackupRetentionDays(automaticBackupRetentionDays);
        return this;
    }

    /**
     * @param dailyAutomaticBackupStartTime
     */

    public void setDailyAutomaticBackupStartTime(String dailyAutomaticBackupStartTime) {
        this.dailyAutomaticBackupStartTime = dailyAutomaticBackupStartTime;
    }

    /**
     * @return
     */

    public String getDailyAutomaticBackupStartTime() {
        return this.dailyAutomaticBackupStartTime;
    }

    /**
     * @param dailyAutomaticBackupStartTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemOntapConfiguration withDailyAutomaticBackupStartTime(String dailyAutomaticBackupStartTime) {
        setDailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime);
        return this;
    }

    /**
     * <p>
     * The ONTAP administrative password for the <code>fsxadmin</code> user.
     * </p>
     * 
     * @param fsxAdminPassword
     *        The ONTAP administrative password for the <code>fsxadmin</code> user.
     */

    public void setFsxAdminPassword(String fsxAdminPassword) {
        this.fsxAdminPassword = fsxAdminPassword;
    }

    /**
     * <p>
     * The ONTAP administrative password for the <code>fsxadmin</code> user.
     * </p>
     * 
     * @return The ONTAP administrative password for the <code>fsxadmin</code> user.
     */

    public String getFsxAdminPassword() {
        return this.fsxAdminPassword;
    }

    /**
     * <p>
     * The ONTAP administrative password for the <code>fsxadmin</code> user.
     * </p>
     * 
     * @param fsxAdminPassword
     *        The ONTAP administrative password for the <code>fsxadmin</code> user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemOntapConfiguration withFsxAdminPassword(String fsxAdminPassword) {
        setFsxAdminPassword(fsxAdminPassword);
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

    public UpdateFileSystemOntapConfiguration withWeeklyMaintenanceStartTime(String weeklyMaintenanceStartTime) {
        setWeeklyMaintenanceStartTime(weeklyMaintenanceStartTime);
        return this;
    }

    /**
     * <p>
     * The SSD IOPS (input/output operations per second) configuration for an Amazon FSx for NetApp ONTAP file system.
     * The default is 3 IOPS per GB of storage capacity, but you can provision additional IOPS per GB of storage. The
     * configuration consists of an IOPS mode (<code>AUTOMATIC</code> or <code>USER_PROVISIONED</code>), and in the case
     * of <code>USER_PROVISIONED</code> IOPS, the total number of SSD IOPS provisioned.
     * </p>
     * 
     * @param diskIopsConfiguration
     *        The SSD IOPS (input/output operations per second) configuration for an Amazon FSx for NetApp ONTAP file
     *        system. The default is 3 IOPS per GB of storage capacity, but you can provision additional IOPS per GB of
     *        storage. The configuration consists of an IOPS mode (<code>AUTOMATIC</code> or
     *        <code>USER_PROVISIONED</code>), and in the case of <code>USER_PROVISIONED</code> IOPS, the total number of
     *        SSD IOPS provisioned.
     */

    public void setDiskIopsConfiguration(DiskIopsConfiguration diskIopsConfiguration) {
        this.diskIopsConfiguration = diskIopsConfiguration;
    }

    /**
     * <p>
     * The SSD IOPS (input/output operations per second) configuration for an Amazon FSx for NetApp ONTAP file system.
     * The default is 3 IOPS per GB of storage capacity, but you can provision additional IOPS per GB of storage. The
     * configuration consists of an IOPS mode (<code>AUTOMATIC</code> or <code>USER_PROVISIONED</code>), and in the case
     * of <code>USER_PROVISIONED</code> IOPS, the total number of SSD IOPS provisioned.
     * </p>
     * 
     * @return The SSD IOPS (input/output operations per second) configuration for an Amazon FSx for NetApp ONTAP file
     *         system. The default is 3 IOPS per GB of storage capacity, but you can provision additional IOPS per GB of
     *         storage. The configuration consists of an IOPS mode (<code>AUTOMATIC</code> or
     *         <code>USER_PROVISIONED</code>), and in the case of <code>USER_PROVISIONED</code> IOPS, the total number
     *         of SSD IOPS provisioned.
     */

    public DiskIopsConfiguration getDiskIopsConfiguration() {
        return this.diskIopsConfiguration;
    }

    /**
     * <p>
     * The SSD IOPS (input/output operations per second) configuration for an Amazon FSx for NetApp ONTAP file system.
     * The default is 3 IOPS per GB of storage capacity, but you can provision additional IOPS per GB of storage. The
     * configuration consists of an IOPS mode (<code>AUTOMATIC</code> or <code>USER_PROVISIONED</code>), and in the case
     * of <code>USER_PROVISIONED</code> IOPS, the total number of SSD IOPS provisioned.
     * </p>
     * 
     * @param diskIopsConfiguration
     *        The SSD IOPS (input/output operations per second) configuration for an Amazon FSx for NetApp ONTAP file
     *        system. The default is 3 IOPS per GB of storage capacity, but you can provision additional IOPS per GB of
     *        storage. The configuration consists of an IOPS mode (<code>AUTOMATIC</code> or
     *        <code>USER_PROVISIONED</code>), and in the case of <code>USER_PROVISIONED</code> IOPS, the total number of
     *        SSD IOPS provisioned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemOntapConfiguration withDiskIopsConfiguration(DiskIopsConfiguration diskIopsConfiguration) {
        setDiskIopsConfiguration(diskIopsConfiguration);
        return this;
    }

    /**
     * <p>
     * Specifies the throughput of an FSx for NetApp ONTAP file system, measured in megabytes per second (MBps). Valid
     * values are 128, 256, 512, 1024, 2048, and 4096 MBps.
     * </p>
     * 
     * @param throughputCapacity
     *        Specifies the throughput of an FSx for NetApp ONTAP file system, measured in megabytes per second (MBps).
     *        Valid values are 128, 256, 512, 1024, 2048, and 4096 MBps.
     */

    public void setThroughputCapacity(Integer throughputCapacity) {
        this.throughputCapacity = throughputCapacity;
    }

    /**
     * <p>
     * Specifies the throughput of an FSx for NetApp ONTAP file system, measured in megabytes per second (MBps). Valid
     * values are 128, 256, 512, 1024, 2048, and 4096 MBps.
     * </p>
     * 
     * @return Specifies the throughput of an FSx for NetApp ONTAP file system, measured in megabytes per second (MBps).
     *         Valid values are 128, 256, 512, 1024, 2048, and 4096 MBps.
     */

    public Integer getThroughputCapacity() {
        return this.throughputCapacity;
    }

    /**
     * <p>
     * Specifies the throughput of an FSx for NetApp ONTAP file system, measured in megabytes per second (MBps). Valid
     * values are 128, 256, 512, 1024, 2048, and 4096 MBps.
     * </p>
     * 
     * @param throughputCapacity
     *        Specifies the throughput of an FSx for NetApp ONTAP file system, measured in megabytes per second (MBps).
     *        Valid values are 128, 256, 512, 1024, 2048, and 4096 MBps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemOntapConfiguration withThroughputCapacity(Integer throughputCapacity) {
        setThroughputCapacity(throughputCapacity);
        return this;
    }

    /**
     * <p>
     * (Multi-AZ only) A list of IDs of new virtual private cloud (VPC) route tables to associate (add) with your Amazon
     * FSx for NetApp ONTAP file system.
     * </p>
     * 
     * @return (Multi-AZ only) A list of IDs of new virtual private cloud (VPC) route tables to associate (add) with
     *         your Amazon FSx for NetApp ONTAP file system.
     */

    public java.util.List<String> getAddRouteTableIds() {
        return addRouteTableIds;
    }

    /**
     * <p>
     * (Multi-AZ only) A list of IDs of new virtual private cloud (VPC) route tables to associate (add) with your Amazon
     * FSx for NetApp ONTAP file system.
     * </p>
     * 
     * @param addRouteTableIds
     *        (Multi-AZ only) A list of IDs of new virtual private cloud (VPC) route tables to associate (add) with your
     *        Amazon FSx for NetApp ONTAP file system.
     */

    public void setAddRouteTableIds(java.util.Collection<String> addRouteTableIds) {
        if (addRouteTableIds == null) {
            this.addRouteTableIds = null;
            return;
        }

        this.addRouteTableIds = new java.util.ArrayList<String>(addRouteTableIds);
    }

    /**
     * <p>
     * (Multi-AZ only) A list of IDs of new virtual private cloud (VPC) route tables to associate (add) with your Amazon
     * FSx for NetApp ONTAP file system.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddRouteTableIds(java.util.Collection)} or {@link #withAddRouteTableIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param addRouteTableIds
     *        (Multi-AZ only) A list of IDs of new virtual private cloud (VPC) route tables to associate (add) with your
     *        Amazon FSx for NetApp ONTAP file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemOntapConfiguration withAddRouteTableIds(String... addRouteTableIds) {
        if (this.addRouteTableIds == null) {
            setAddRouteTableIds(new java.util.ArrayList<String>(addRouteTableIds.length));
        }
        for (String ele : addRouteTableIds) {
            this.addRouteTableIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * (Multi-AZ only) A list of IDs of new virtual private cloud (VPC) route tables to associate (add) with your Amazon
     * FSx for NetApp ONTAP file system.
     * </p>
     * 
     * @param addRouteTableIds
     *        (Multi-AZ only) A list of IDs of new virtual private cloud (VPC) route tables to associate (add) with your
     *        Amazon FSx for NetApp ONTAP file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemOntapConfiguration withAddRouteTableIds(java.util.Collection<String> addRouteTableIds) {
        setAddRouteTableIds(addRouteTableIds);
        return this;
    }

    /**
     * <p>
     * (Multi-AZ only) A list of IDs of existing virtual private cloud (VPC) route tables to disassociate (remove) from
     * your Amazon FSx for NetApp ONTAP file system. You can use the API operation to retrieve the list of VPC route
     * table IDs for a file system.
     * </p>
     * 
     * @return (Multi-AZ only) A list of IDs of existing virtual private cloud (VPC) route tables to disassociate
     *         (remove) from your Amazon FSx for NetApp ONTAP file system. You can use the API operation to retrieve the
     *         list of VPC route table IDs for a file system.
     */

    public java.util.List<String> getRemoveRouteTableIds() {
        return removeRouteTableIds;
    }

    /**
     * <p>
     * (Multi-AZ only) A list of IDs of existing virtual private cloud (VPC) route tables to disassociate (remove) from
     * your Amazon FSx for NetApp ONTAP file system. You can use the API operation to retrieve the list of VPC route
     * table IDs for a file system.
     * </p>
     * 
     * @param removeRouteTableIds
     *        (Multi-AZ only) A list of IDs of existing virtual private cloud (VPC) route tables to disassociate
     *        (remove) from your Amazon FSx for NetApp ONTAP file system. You can use the API operation to retrieve the
     *        list of VPC route table IDs for a file system.
     */

    public void setRemoveRouteTableIds(java.util.Collection<String> removeRouteTableIds) {
        if (removeRouteTableIds == null) {
            this.removeRouteTableIds = null;
            return;
        }

        this.removeRouteTableIds = new java.util.ArrayList<String>(removeRouteTableIds);
    }

    /**
     * <p>
     * (Multi-AZ only) A list of IDs of existing virtual private cloud (VPC) route tables to disassociate (remove) from
     * your Amazon FSx for NetApp ONTAP file system. You can use the API operation to retrieve the list of VPC route
     * table IDs for a file system.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemoveRouteTableIds(java.util.Collection)} or {@link #withRemoveRouteTableIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param removeRouteTableIds
     *        (Multi-AZ only) A list of IDs of existing virtual private cloud (VPC) route tables to disassociate
     *        (remove) from your Amazon FSx for NetApp ONTAP file system. You can use the API operation to retrieve the
     *        list of VPC route table IDs for a file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemOntapConfiguration withRemoveRouteTableIds(String... removeRouteTableIds) {
        if (this.removeRouteTableIds == null) {
            setRemoveRouteTableIds(new java.util.ArrayList<String>(removeRouteTableIds.length));
        }
        for (String ele : removeRouteTableIds) {
            this.removeRouteTableIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * (Multi-AZ only) A list of IDs of existing virtual private cloud (VPC) route tables to disassociate (remove) from
     * your Amazon FSx for NetApp ONTAP file system. You can use the API operation to retrieve the list of VPC route
     * table IDs for a file system.
     * </p>
     * 
     * @param removeRouteTableIds
     *        (Multi-AZ only) A list of IDs of existing virtual private cloud (VPC) route tables to disassociate
     *        (remove) from your Amazon FSx for NetApp ONTAP file system. You can use the API operation to retrieve the
     *        list of VPC route table IDs for a file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemOntapConfiguration withRemoveRouteTableIds(java.util.Collection<String> removeRouteTableIds) {
        setRemoveRouteTableIds(removeRouteTableIds);
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
        if (getAutomaticBackupRetentionDays() != null)
            sb.append("AutomaticBackupRetentionDays: ").append(getAutomaticBackupRetentionDays()).append(",");
        if (getDailyAutomaticBackupStartTime() != null)
            sb.append("DailyAutomaticBackupStartTime: ").append(getDailyAutomaticBackupStartTime()).append(",");
        if (getFsxAdminPassword() != null)
            sb.append("FsxAdminPassword: ").append("***Sensitive Data Redacted***").append(",");
        if (getWeeklyMaintenanceStartTime() != null)
            sb.append("WeeklyMaintenanceStartTime: ").append(getWeeklyMaintenanceStartTime()).append(",");
        if (getDiskIopsConfiguration() != null)
            sb.append("DiskIopsConfiguration: ").append(getDiskIopsConfiguration()).append(",");
        if (getThroughputCapacity() != null)
            sb.append("ThroughputCapacity: ").append(getThroughputCapacity()).append(",");
        if (getAddRouteTableIds() != null)
            sb.append("AddRouteTableIds: ").append(getAddRouteTableIds()).append(",");
        if (getRemoveRouteTableIds() != null)
            sb.append("RemoveRouteTableIds: ").append(getRemoveRouteTableIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFileSystemOntapConfiguration == false)
            return false;
        UpdateFileSystemOntapConfiguration other = (UpdateFileSystemOntapConfiguration) obj;
        if (other.getAutomaticBackupRetentionDays() == null ^ this.getAutomaticBackupRetentionDays() == null)
            return false;
        if (other.getAutomaticBackupRetentionDays() != null && other.getAutomaticBackupRetentionDays().equals(this.getAutomaticBackupRetentionDays()) == false)
            return false;
        if (other.getDailyAutomaticBackupStartTime() == null ^ this.getDailyAutomaticBackupStartTime() == null)
            return false;
        if (other.getDailyAutomaticBackupStartTime() != null
                && other.getDailyAutomaticBackupStartTime().equals(this.getDailyAutomaticBackupStartTime()) == false)
            return false;
        if (other.getFsxAdminPassword() == null ^ this.getFsxAdminPassword() == null)
            return false;
        if (other.getFsxAdminPassword() != null && other.getFsxAdminPassword().equals(this.getFsxAdminPassword()) == false)
            return false;
        if (other.getWeeklyMaintenanceStartTime() == null ^ this.getWeeklyMaintenanceStartTime() == null)
            return false;
        if (other.getWeeklyMaintenanceStartTime() != null && other.getWeeklyMaintenanceStartTime().equals(this.getWeeklyMaintenanceStartTime()) == false)
            return false;
        if (other.getDiskIopsConfiguration() == null ^ this.getDiskIopsConfiguration() == null)
            return false;
        if (other.getDiskIopsConfiguration() != null && other.getDiskIopsConfiguration().equals(this.getDiskIopsConfiguration()) == false)
            return false;
        if (other.getThroughputCapacity() == null ^ this.getThroughputCapacity() == null)
            return false;
        if (other.getThroughputCapacity() != null && other.getThroughputCapacity().equals(this.getThroughputCapacity()) == false)
            return false;
        if (other.getAddRouteTableIds() == null ^ this.getAddRouteTableIds() == null)
            return false;
        if (other.getAddRouteTableIds() != null && other.getAddRouteTableIds().equals(this.getAddRouteTableIds()) == false)
            return false;
        if (other.getRemoveRouteTableIds() == null ^ this.getRemoveRouteTableIds() == null)
            return false;
        if (other.getRemoveRouteTableIds() != null && other.getRemoveRouteTableIds().equals(this.getRemoveRouteTableIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutomaticBackupRetentionDays() == null) ? 0 : getAutomaticBackupRetentionDays().hashCode());
        hashCode = prime * hashCode + ((getDailyAutomaticBackupStartTime() == null) ? 0 : getDailyAutomaticBackupStartTime().hashCode());
        hashCode = prime * hashCode + ((getFsxAdminPassword() == null) ? 0 : getFsxAdminPassword().hashCode());
        hashCode = prime * hashCode + ((getWeeklyMaintenanceStartTime() == null) ? 0 : getWeeklyMaintenanceStartTime().hashCode());
        hashCode = prime * hashCode + ((getDiskIopsConfiguration() == null) ? 0 : getDiskIopsConfiguration().hashCode());
        hashCode = prime * hashCode + ((getThroughputCapacity() == null) ? 0 : getThroughputCapacity().hashCode());
        hashCode = prime * hashCode + ((getAddRouteTableIds() == null) ? 0 : getAddRouteTableIds().hashCode());
        hashCode = prime * hashCode + ((getRemoveRouteTableIds() == null) ? 0 : getRemoveRouteTableIds().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFileSystemOntapConfiguration clone() {
        try {
            return (UpdateFileSystemOntapConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.UpdateFileSystemOntapConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
