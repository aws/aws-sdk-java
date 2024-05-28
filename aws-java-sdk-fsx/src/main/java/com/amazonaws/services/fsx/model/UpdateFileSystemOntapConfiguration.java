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
     * Update the password for the <code>fsxadmin</code> user by entering a new password. You use the
     * <code>fsxadmin</code> user to access the NetApp ONTAP CLI and REST API to manage your file system resources. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-resources-ontap-apps.html">Managing resources
     * using NetApp Applicaton</a>.
     * </p>
     */
    private String fsxAdminPassword;

    private String weeklyMaintenanceStartTime;
    /**
     * <p>
     * The SSD IOPS (input output operations per second) configuration for an Amazon FSx for NetApp ONTAP file system.
     * The default is 3 IOPS per GB of storage capacity, but you can provision additional IOPS per GB of storage. The
     * configuration consists of an IOPS mode (<code>AUTOMATIC</code> or <code>USER_PROVISIONED</code>), and in the case
     * of <code>USER_PROVISIONED</code> IOPS, the total number of SSD IOPS provisioned. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/increase-primary-storage.html">Updating SSD storage
     * capacity and IOPS</a>.
     * </p>
     */
    private DiskIopsConfiguration diskIopsConfiguration;
    /**
     * <p>
     * Enter a new value to change the amount of throughput capacity for the file system in megabytes per second (MBps).
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-throughput-capacity.html">Managing throughput
     * capacity</a> in the FSx for ONTAP User Guide.
     * </p>
     * <p>
     * Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following conditions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value of <code>ThroughputCapacity</code> and <code>ThroughputCapacityPerHAPair</code> are not the same value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>ThroughputCapacity</code> when divided by the value of <code>HAPairs</code> is outside of the
     * valid range for <code>ThroughputCapacity</code>.
     * </p>
     * </li>
     * </ul>
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
     * <p>
     * Use to choose the throughput capacity per HA pair, rather than the total throughput for the file system.
     * </p>
     * <p>
     * This field and <code>ThroughputCapacity</code> cannot be defined in the same API call, but one is required.
     * </p>
     * <p>
     * This field and <code>ThroughputCapacity</code> are the same for file systems with one HA pair.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>SINGLE_AZ_1</code> and <code>MULTI_AZ_1</code>, valid values are 128, 256, 512, 1024, 2048, or 4096
     * MBps.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>SINGLE_AZ_2</code>, valid values are 3072 or 6144 MBps.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following conditions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value of <code>ThroughputCapacity</code> and <code>ThroughputCapacityPerHAPair</code> are not the same value
     * for file systems with one HA pair.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of deployment type is <code>SINGLE_AZ_2</code> and <code>ThroughputCapacity</code> /
     * <code>ThroughputCapacityPerHAPair</code> is a valid HA pair (a value between 2 and 12).
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>ThroughputCapacityPerHAPair</code> is not a valid value.
     * </p>
     * </li>
     * </ul>
     */
    private Integer throughputCapacityPerHAPair;

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
     * Update the password for the <code>fsxadmin</code> user by entering a new password. You use the
     * <code>fsxadmin</code> user to access the NetApp ONTAP CLI and REST API to manage your file system resources. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-resources-ontap-apps.html">Managing resources
     * using NetApp Applicaton</a>.
     * </p>
     * 
     * @param fsxAdminPassword
     *        Update the password for the <code>fsxadmin</code> user by entering a new password. You use the
     *        <code>fsxadmin</code> user to access the NetApp ONTAP CLI and REST API to manage your file system
     *        resources. For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-resources-ontap-apps.html">Managing
     *        resources using NetApp Applicaton</a>.
     */

    public void setFsxAdminPassword(String fsxAdminPassword) {
        this.fsxAdminPassword = fsxAdminPassword;
    }

    /**
     * <p>
     * Update the password for the <code>fsxadmin</code> user by entering a new password. You use the
     * <code>fsxadmin</code> user to access the NetApp ONTAP CLI and REST API to manage your file system resources. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-resources-ontap-apps.html">Managing resources
     * using NetApp Applicaton</a>.
     * </p>
     * 
     * @return Update the password for the <code>fsxadmin</code> user by entering a new password. You use the
     *         <code>fsxadmin</code> user to access the NetApp ONTAP CLI and REST API to manage your file system
     *         resources. For more information, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-resources-ontap-apps.html">Managing
     *         resources using NetApp Applicaton</a>.
     */

    public String getFsxAdminPassword() {
        return this.fsxAdminPassword;
    }

    /**
     * <p>
     * Update the password for the <code>fsxadmin</code> user by entering a new password. You use the
     * <code>fsxadmin</code> user to access the NetApp ONTAP CLI and REST API to manage your file system resources. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-resources-ontap-apps.html">Managing resources
     * using NetApp Applicaton</a>.
     * </p>
     * 
     * @param fsxAdminPassword
     *        Update the password for the <code>fsxadmin</code> user by entering a new password. You use the
     *        <code>fsxadmin</code> user to access the NetApp ONTAP CLI and REST API to manage your file system
     *        resources. For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-resources-ontap-apps.html">Managing
     *        resources using NetApp Applicaton</a>.
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
     * The SSD IOPS (input output operations per second) configuration for an Amazon FSx for NetApp ONTAP file system.
     * The default is 3 IOPS per GB of storage capacity, but you can provision additional IOPS per GB of storage. The
     * configuration consists of an IOPS mode (<code>AUTOMATIC</code> or <code>USER_PROVISIONED</code>), and in the case
     * of <code>USER_PROVISIONED</code> IOPS, the total number of SSD IOPS provisioned. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/increase-primary-storage.html">Updating SSD storage
     * capacity and IOPS</a>.
     * </p>
     * 
     * @param diskIopsConfiguration
     *        The SSD IOPS (input output operations per second) configuration for an Amazon FSx for NetApp ONTAP file
     *        system. The default is 3 IOPS per GB of storage capacity, but you can provision additional IOPS per GB of
     *        storage. The configuration consists of an IOPS mode (<code>AUTOMATIC</code> or
     *        <code>USER_PROVISIONED</code>), and in the case of <code>USER_PROVISIONED</code> IOPS, the total number of
     *        SSD IOPS provisioned. For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/increase-primary-storage.html">Updating SSD
     *        storage capacity and IOPS</a>.
     */

    public void setDiskIopsConfiguration(DiskIopsConfiguration diskIopsConfiguration) {
        this.diskIopsConfiguration = diskIopsConfiguration;
    }

    /**
     * <p>
     * The SSD IOPS (input output operations per second) configuration for an Amazon FSx for NetApp ONTAP file system.
     * The default is 3 IOPS per GB of storage capacity, but you can provision additional IOPS per GB of storage. The
     * configuration consists of an IOPS mode (<code>AUTOMATIC</code> or <code>USER_PROVISIONED</code>), and in the case
     * of <code>USER_PROVISIONED</code> IOPS, the total number of SSD IOPS provisioned. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/increase-primary-storage.html">Updating SSD storage
     * capacity and IOPS</a>.
     * </p>
     * 
     * @return The SSD IOPS (input output operations per second) configuration for an Amazon FSx for NetApp ONTAP file
     *         system. The default is 3 IOPS per GB of storage capacity, but you can provision additional IOPS per GB of
     *         storage. The configuration consists of an IOPS mode (<code>AUTOMATIC</code> or
     *         <code>USER_PROVISIONED</code>), and in the case of <code>USER_PROVISIONED</code> IOPS, the total number
     *         of SSD IOPS provisioned. For more information, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/increase-primary-storage.html">Updating SSD
     *         storage capacity and IOPS</a>.
     */

    public DiskIopsConfiguration getDiskIopsConfiguration() {
        return this.diskIopsConfiguration;
    }

    /**
     * <p>
     * The SSD IOPS (input output operations per second) configuration for an Amazon FSx for NetApp ONTAP file system.
     * The default is 3 IOPS per GB of storage capacity, but you can provision additional IOPS per GB of storage. The
     * configuration consists of an IOPS mode (<code>AUTOMATIC</code> or <code>USER_PROVISIONED</code>), and in the case
     * of <code>USER_PROVISIONED</code> IOPS, the total number of SSD IOPS provisioned. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/increase-primary-storage.html">Updating SSD storage
     * capacity and IOPS</a>.
     * </p>
     * 
     * @param diskIopsConfiguration
     *        The SSD IOPS (input output operations per second) configuration for an Amazon FSx for NetApp ONTAP file
     *        system. The default is 3 IOPS per GB of storage capacity, but you can provision additional IOPS per GB of
     *        storage. The configuration consists of an IOPS mode (<code>AUTOMATIC</code> or
     *        <code>USER_PROVISIONED</code>), and in the case of <code>USER_PROVISIONED</code> IOPS, the total number of
     *        SSD IOPS provisioned. For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/increase-primary-storage.html">Updating SSD
     *        storage capacity and IOPS</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemOntapConfiguration withDiskIopsConfiguration(DiskIopsConfiguration diskIopsConfiguration) {
        setDiskIopsConfiguration(diskIopsConfiguration);
        return this;
    }

    /**
     * <p>
     * Enter a new value to change the amount of throughput capacity for the file system in megabytes per second (MBps).
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-throughput-capacity.html">Managing throughput
     * capacity</a> in the FSx for ONTAP User Guide.
     * </p>
     * <p>
     * Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following conditions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value of <code>ThroughputCapacity</code> and <code>ThroughputCapacityPerHAPair</code> are not the same value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>ThroughputCapacity</code> when divided by the value of <code>HAPairs</code> is outside of the
     * valid range for <code>ThroughputCapacity</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param throughputCapacity
     *        Enter a new value to change the amount of throughput capacity for the file system in megabytes per second
     *        (MBps). For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-throughput-capacity.html">Managing
     *        throughput capacity</a> in the FSx for ONTAP User Guide.</p>
     *        <p>
     *        Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following conditions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The value of <code>ThroughputCapacity</code> and <code>ThroughputCapacityPerHAPair</code> are not the same
     *        value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The value of <code>ThroughputCapacity</code> when divided by the value of <code>HAPairs</code> is outside
     *        of the valid range for <code>ThroughputCapacity</code>.
     *        </p>
     *        </li>
     */

    public void setThroughputCapacity(Integer throughputCapacity) {
        this.throughputCapacity = throughputCapacity;
    }

    /**
     * <p>
     * Enter a new value to change the amount of throughput capacity for the file system in megabytes per second (MBps).
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-throughput-capacity.html">Managing throughput
     * capacity</a> in the FSx for ONTAP User Guide.
     * </p>
     * <p>
     * Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following conditions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value of <code>ThroughputCapacity</code> and <code>ThroughputCapacityPerHAPair</code> are not the same value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>ThroughputCapacity</code> when divided by the value of <code>HAPairs</code> is outside of the
     * valid range for <code>ThroughputCapacity</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Enter a new value to change the amount of throughput capacity for the file system in megabytes per second
     *         (MBps). For more information, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-throughput-capacity.html">Managing
     *         throughput capacity</a> in the FSx for ONTAP User Guide.</p>
     *         <p>
     *         Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following conditions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The value of <code>ThroughputCapacity</code> and <code>ThroughputCapacityPerHAPair</code> are not the
     *         same value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The value of <code>ThroughputCapacity</code> when divided by the value of <code>HAPairs</code> is outside
     *         of the valid range for <code>ThroughputCapacity</code>.
     *         </p>
     *         </li>
     */

    public Integer getThroughputCapacity() {
        return this.throughputCapacity;
    }

    /**
     * <p>
     * Enter a new value to change the amount of throughput capacity for the file system in megabytes per second (MBps).
     * For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-throughput-capacity.html">Managing throughput
     * capacity</a> in the FSx for ONTAP User Guide.
     * </p>
     * <p>
     * Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following conditions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value of <code>ThroughputCapacity</code> and <code>ThroughputCapacityPerHAPair</code> are not the same value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>ThroughputCapacity</code> when divided by the value of <code>HAPairs</code> is outside of the
     * valid range for <code>ThroughputCapacity</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param throughputCapacity
     *        Enter a new value to change the amount of throughput capacity for the file system in megabytes per second
     *        (MBps). For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-throughput-capacity.html">Managing
     *        throughput capacity</a> in the FSx for ONTAP User Guide.</p>
     *        <p>
     *        Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following conditions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The value of <code>ThroughputCapacity</code> and <code>ThroughputCapacityPerHAPair</code> are not the same
     *        value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The value of <code>ThroughputCapacity</code> when divided by the value of <code>HAPairs</code> is outside
     *        of the valid range for <code>ThroughputCapacity</code>.
     *        </p>
     *        </li>
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
     * <p>
     * Use to choose the throughput capacity per HA pair, rather than the total throughput for the file system.
     * </p>
     * <p>
     * This field and <code>ThroughputCapacity</code> cannot be defined in the same API call, but one is required.
     * </p>
     * <p>
     * This field and <code>ThroughputCapacity</code> are the same for file systems with one HA pair.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>SINGLE_AZ_1</code> and <code>MULTI_AZ_1</code>, valid values are 128, 256, 512, 1024, 2048, or 4096
     * MBps.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>SINGLE_AZ_2</code>, valid values are 3072 or 6144 MBps.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following conditions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value of <code>ThroughputCapacity</code> and <code>ThroughputCapacityPerHAPair</code> are not the same value
     * for file systems with one HA pair.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of deployment type is <code>SINGLE_AZ_2</code> and <code>ThroughputCapacity</code> /
     * <code>ThroughputCapacityPerHAPair</code> is a valid HA pair (a value between 2 and 12).
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>ThroughputCapacityPerHAPair</code> is not a valid value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param throughputCapacityPerHAPair
     *        Use to choose the throughput capacity per HA pair, rather than the total throughput for the file system.
     *        </p>
     *        <p>
     *        This field and <code>ThroughputCapacity</code> cannot be defined in the same API call, but one is
     *        required.
     *        </p>
     *        <p>
     *        This field and <code>ThroughputCapacity</code> are the same for file systems with one HA pair.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For <code>SINGLE_AZ_1</code> and <code>MULTI_AZ_1</code>, valid values are 128, 256, 512, 1024, 2048, or
     *        4096 MBps.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For <code>SINGLE_AZ_2</code>, valid values are 3072 or 6144 MBps.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following conditions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The value of <code>ThroughputCapacity</code> and <code>ThroughputCapacityPerHAPair</code> are not the same
     *        value for file systems with one HA pair.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The value of deployment type is <code>SINGLE_AZ_2</code> and <code>ThroughputCapacity</code> /
     *        <code>ThroughputCapacityPerHAPair</code> is a valid HA pair (a value between 2 and 12).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The value of <code>ThroughputCapacityPerHAPair</code> is not a valid value.
     *        </p>
     *        </li>
     */

    public void setThroughputCapacityPerHAPair(Integer throughputCapacityPerHAPair) {
        this.throughputCapacityPerHAPair = throughputCapacityPerHAPair;
    }

    /**
     * <p>
     * Use to choose the throughput capacity per HA pair, rather than the total throughput for the file system.
     * </p>
     * <p>
     * This field and <code>ThroughputCapacity</code> cannot be defined in the same API call, but one is required.
     * </p>
     * <p>
     * This field and <code>ThroughputCapacity</code> are the same for file systems with one HA pair.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>SINGLE_AZ_1</code> and <code>MULTI_AZ_1</code>, valid values are 128, 256, 512, 1024, 2048, or 4096
     * MBps.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>SINGLE_AZ_2</code>, valid values are 3072 or 6144 MBps.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following conditions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value of <code>ThroughputCapacity</code> and <code>ThroughputCapacityPerHAPair</code> are not the same value
     * for file systems with one HA pair.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of deployment type is <code>SINGLE_AZ_2</code> and <code>ThroughputCapacity</code> /
     * <code>ThroughputCapacityPerHAPair</code> is a valid HA pair (a value between 2 and 12).
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>ThroughputCapacityPerHAPair</code> is not a valid value.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Use to choose the throughput capacity per HA pair, rather than the total throughput for the file system.
     *         </p>
     *         <p>
     *         This field and <code>ThroughputCapacity</code> cannot be defined in the same API call, but one is
     *         required.
     *         </p>
     *         <p>
     *         This field and <code>ThroughputCapacity</code> are the same for file systems with one HA pair.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For <code>SINGLE_AZ_1</code> and <code>MULTI_AZ_1</code>, valid values are 128, 256, 512, 1024, 2048, or
     *         4096 MBps.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For <code>SINGLE_AZ_2</code>, valid values are 3072 or 6144 MBps.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following conditions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The value of <code>ThroughputCapacity</code> and <code>ThroughputCapacityPerHAPair</code> are not the
     *         same value for file systems with one HA pair.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The value of deployment type is <code>SINGLE_AZ_2</code> and <code>ThroughputCapacity</code> /
     *         <code>ThroughputCapacityPerHAPair</code> is a valid HA pair (a value between 2 and 12).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The value of <code>ThroughputCapacityPerHAPair</code> is not a valid value.
     *         </p>
     *         </li>
     */

    public Integer getThroughputCapacityPerHAPair() {
        return this.throughputCapacityPerHAPair;
    }

    /**
     * <p>
     * Use to choose the throughput capacity per HA pair, rather than the total throughput for the file system.
     * </p>
     * <p>
     * This field and <code>ThroughputCapacity</code> cannot be defined in the same API call, but one is required.
     * </p>
     * <p>
     * This field and <code>ThroughputCapacity</code> are the same for file systems with one HA pair.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>SINGLE_AZ_1</code> and <code>MULTI_AZ_1</code>, valid values are 128, 256, 512, 1024, 2048, or 4096
     * MBps.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>SINGLE_AZ_2</code>, valid values are 3072 or 6144 MBps.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following conditions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value of <code>ThroughputCapacity</code> and <code>ThroughputCapacityPerHAPair</code> are not the same value
     * for file systems with one HA pair.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of deployment type is <code>SINGLE_AZ_2</code> and <code>ThroughputCapacity</code> /
     * <code>ThroughputCapacityPerHAPair</code> is a valid HA pair (a value between 2 and 12).
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>ThroughputCapacityPerHAPair</code> is not a valid value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param throughputCapacityPerHAPair
     *        Use to choose the throughput capacity per HA pair, rather than the total throughput for the file system.
     *        </p>
     *        <p>
     *        This field and <code>ThroughputCapacity</code> cannot be defined in the same API call, but one is
     *        required.
     *        </p>
     *        <p>
     *        This field and <code>ThroughputCapacity</code> are the same for file systems with one HA pair.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For <code>SINGLE_AZ_1</code> and <code>MULTI_AZ_1</code>, valid values are 128, 256, 512, 1024, 2048, or
     *        4096 MBps.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For <code>SINGLE_AZ_2</code>, valid values are 3072 or 6144 MBps.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following conditions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The value of <code>ThroughputCapacity</code> and <code>ThroughputCapacityPerHAPair</code> are not the same
     *        value for file systems with one HA pair.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The value of deployment type is <code>SINGLE_AZ_2</code> and <code>ThroughputCapacity</code> /
     *        <code>ThroughputCapacityPerHAPair</code> is a valid HA pair (a value between 2 and 12).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The value of <code>ThroughputCapacityPerHAPair</code> is not a valid value.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFileSystemOntapConfiguration withThroughputCapacityPerHAPair(Integer throughputCapacityPerHAPair) {
        setThroughputCapacityPerHAPair(throughputCapacityPerHAPair);
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
            sb.append("RemoveRouteTableIds: ").append(getRemoveRouteTableIds()).append(",");
        if (getThroughputCapacityPerHAPair() != null)
            sb.append("ThroughputCapacityPerHAPair: ").append(getThroughputCapacityPerHAPair());
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
        if (other.getThroughputCapacityPerHAPair() == null ^ this.getThroughputCapacityPerHAPair() == null)
            return false;
        if (other.getThroughputCapacityPerHAPair() != null && other.getThroughputCapacityPerHAPair().equals(this.getThroughputCapacityPerHAPair()) == false)
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
        hashCode = prime * hashCode + ((getThroughputCapacityPerHAPair() == null) ? 0 : getThroughputCapacityPerHAPair().hashCode());
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
