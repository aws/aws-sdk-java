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
 * Configuration for the FSx for NetApp ONTAP file system.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/OntapFileSystemConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OntapFileSystemConfiguration implements Serializable, Cloneable, StructuredPojo {

    private Integer automaticBackupRetentionDays;

    private String dailyAutomaticBackupStartTime;
    /**
     * <p>
     * Specifies the FSx for ONTAP file system deployment type in use in the file system.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MULTI_AZ_1</code> - (Default) A high availability file system configured for Multi-AZ redundancy to
     * tolerate temporary Availability Zone (AZ) unavailability.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_1</code> - A file system configured for Single-AZ redundancy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_2</code> - A file system configured with multiple high-availability (HA) pairs for Single-AZ
     * redundancy.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For information about the use cases for Multi-AZ and Single-AZ deployments, refer to <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/high-availability-multiAZ.html">Choosing Multi-AZ or
     * Single-AZ file system deployment</a>.
     * </p>
     */
    private String deploymentType;
    /**
     * <p>
     * (Multi-AZ only) Specifies the IP address range in which the endpoints to access your file system will be created.
     * By default in the Amazon FSx API, Amazon FSx selects an unused IP address range for you from the 198.19.* range.
     * By default in the Amazon FSx console, Amazon FSx chooses the last 64 IP addresses from the VPC’s primary CIDR
     * range to use as the endpoint IP address range for the file system. You can have overlapping endpoint IP addresses
     * for file systems deployed in the same VPC/route tables.
     * </p>
     */
    private String endpointIpAddressRange;
    /**
     * <p>
     * The <code>Management</code> and <code>Intercluster</code> endpoints that are used to access data or to manage the
     * file system using the NetApp ONTAP CLI, REST API, or NetApp SnapMirror.
     * </p>
     */
    private FileSystemEndpoints endpoints;
    /**
     * <p>
     * The SSD IOPS configuration for the ONTAP file system, specifying the number of provisioned IOPS and the provision
     * mode.
     * </p>
     */
    private DiskIopsConfiguration diskIopsConfiguration;

    private String preferredSubnetId;
    /**
     * <p>
     * (Multi-AZ only) The VPC route tables in which your file system's endpoints are created.
     * </p>
     */
    private java.util.List<String> routeTableIds;

    private Integer throughputCapacity;

    private String weeklyMaintenanceStartTime;
    /**
     * <p>
     * You can use the <code>fsxadmin</code> user account to access the NetApp ONTAP CLI and REST API. The password
     * value is always redacted in the response.
     * </p>
     */
    private String fsxAdminPassword;
    /**
     * <p>
     * Specifies how many high-availability (HA) file server pairs the file system will have. The default value is 1.
     * The value of this property affects the values of <code>StorageCapacity</code>, <code>Iops</code>, and
     * <code>ThroughputCapacity</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/HA-pairs.html">High-availability (HA) pairs</a> in the
     * FSx for ONTAP user guide.
     * </p>
     * <p>
     * Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following conditions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value of <code>HAPairs</code> is less than 1 or greater than 12.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>HAPairs</code> is greater than 1 and the value of <code>DeploymentType</code> is
     * <code>SINGLE_AZ_1</code> or <code>MULTI_AZ_1</code>.
     * </p>
     * </li>
     * </ul>
     */
    private Integer hAPairs;
    /**
     * <p>
     * Use to choose the throughput capacity per HA pair. When the value of <code>HAPairs</code> is equal to 1, the
     * value of <code>ThroughputCapacityPerHAPair</code> is the total throughput for the file system.
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
     * The value of <code>ThroughputCapacity</code> and <code>ThroughputCapacityPerHAPair</code> are not the same value.
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

    public OntapFileSystemConfiguration withAutomaticBackupRetentionDays(Integer automaticBackupRetentionDays) {
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

    public OntapFileSystemConfiguration withDailyAutomaticBackupStartTime(String dailyAutomaticBackupStartTime) {
        setDailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime);
        return this;
    }

    /**
     * <p>
     * Specifies the FSx for ONTAP file system deployment type in use in the file system.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MULTI_AZ_1</code> - (Default) A high availability file system configured for Multi-AZ redundancy to
     * tolerate temporary Availability Zone (AZ) unavailability.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_1</code> - A file system configured for Single-AZ redundancy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_2</code> - A file system configured with multiple high-availability (HA) pairs for Single-AZ
     * redundancy.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For information about the use cases for Multi-AZ and Single-AZ deployments, refer to <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/high-availability-multiAZ.html">Choosing Multi-AZ or
     * Single-AZ file system deployment</a>.
     * </p>
     * 
     * @param deploymentType
     *        Specifies the FSx for ONTAP file system deployment type in use in the file system. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MULTI_AZ_1</code> - (Default) A high availability file system configured for Multi-AZ redundancy to
     *        tolerate temporary Availability Zone (AZ) unavailability.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SINGLE_AZ_1</code> - A file system configured for Single-AZ redundancy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SINGLE_AZ_2</code> - A file system configured with multiple high-availability (HA) pairs for
     *        Single-AZ redundancy.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For information about the use cases for Multi-AZ and Single-AZ deployments, refer to <a
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/high-availability-multiAZ.html">Choosing Multi-AZ
     *        or Single-AZ file system deployment</a>.
     * @see OntapDeploymentType
     */

    public void setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
    }

    /**
     * <p>
     * Specifies the FSx for ONTAP file system deployment type in use in the file system.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MULTI_AZ_1</code> - (Default) A high availability file system configured for Multi-AZ redundancy to
     * tolerate temporary Availability Zone (AZ) unavailability.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_1</code> - A file system configured for Single-AZ redundancy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_2</code> - A file system configured with multiple high-availability (HA) pairs for Single-AZ
     * redundancy.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For information about the use cases for Multi-AZ and Single-AZ deployments, refer to <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/high-availability-multiAZ.html">Choosing Multi-AZ or
     * Single-AZ file system deployment</a>.
     * </p>
     * 
     * @return Specifies the FSx for ONTAP file system deployment type in use in the file system. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>MULTI_AZ_1</code> - (Default) A high availability file system configured for Multi-AZ redundancy to
     *         tolerate temporary Availability Zone (AZ) unavailability.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SINGLE_AZ_1</code> - A file system configured for Single-AZ redundancy.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SINGLE_AZ_2</code> - A file system configured with multiple high-availability (HA) pairs for
     *         Single-AZ redundancy.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For information about the use cases for Multi-AZ and Single-AZ deployments, refer to <a
     *         href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/high-availability-multiAZ.html">Choosing Multi-AZ
     *         or Single-AZ file system deployment</a>.
     * @see OntapDeploymentType
     */

    public String getDeploymentType() {
        return this.deploymentType;
    }

    /**
     * <p>
     * Specifies the FSx for ONTAP file system deployment type in use in the file system.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MULTI_AZ_1</code> - (Default) A high availability file system configured for Multi-AZ redundancy to
     * tolerate temporary Availability Zone (AZ) unavailability.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_1</code> - A file system configured for Single-AZ redundancy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_2</code> - A file system configured with multiple high-availability (HA) pairs for Single-AZ
     * redundancy.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For information about the use cases for Multi-AZ and Single-AZ deployments, refer to <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/high-availability-multiAZ.html">Choosing Multi-AZ or
     * Single-AZ file system deployment</a>.
     * </p>
     * 
     * @param deploymentType
     *        Specifies the FSx for ONTAP file system deployment type in use in the file system. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MULTI_AZ_1</code> - (Default) A high availability file system configured for Multi-AZ redundancy to
     *        tolerate temporary Availability Zone (AZ) unavailability.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SINGLE_AZ_1</code> - A file system configured for Single-AZ redundancy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SINGLE_AZ_2</code> - A file system configured with multiple high-availability (HA) pairs for
     *        Single-AZ redundancy.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For information about the use cases for Multi-AZ and Single-AZ deployments, refer to <a
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/high-availability-multiAZ.html">Choosing Multi-AZ
     *        or Single-AZ file system deployment</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OntapDeploymentType
     */

    public OntapFileSystemConfiguration withDeploymentType(String deploymentType) {
        setDeploymentType(deploymentType);
        return this;
    }

    /**
     * <p>
     * Specifies the FSx for ONTAP file system deployment type in use in the file system.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MULTI_AZ_1</code> - (Default) A high availability file system configured for Multi-AZ redundancy to
     * tolerate temporary Availability Zone (AZ) unavailability.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_1</code> - A file system configured for Single-AZ redundancy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_AZ_2</code> - A file system configured with multiple high-availability (HA) pairs for Single-AZ
     * redundancy.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For information about the use cases for Multi-AZ and Single-AZ deployments, refer to <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/high-availability-multiAZ.html">Choosing Multi-AZ or
     * Single-AZ file system deployment</a>.
     * </p>
     * 
     * @param deploymentType
     *        Specifies the FSx for ONTAP file system deployment type in use in the file system. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MULTI_AZ_1</code> - (Default) A high availability file system configured for Multi-AZ redundancy to
     *        tolerate temporary Availability Zone (AZ) unavailability.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SINGLE_AZ_1</code> - A file system configured for Single-AZ redundancy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SINGLE_AZ_2</code> - A file system configured with multiple high-availability (HA) pairs for
     *        Single-AZ redundancy.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For information about the use cases for Multi-AZ and Single-AZ deployments, refer to <a
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/high-availability-multiAZ.html">Choosing Multi-AZ
     *        or Single-AZ file system deployment</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OntapDeploymentType
     */

    public OntapFileSystemConfiguration withDeploymentType(OntapDeploymentType deploymentType) {
        this.deploymentType = deploymentType.toString();
        return this;
    }

    /**
     * <p>
     * (Multi-AZ only) Specifies the IP address range in which the endpoints to access your file system will be created.
     * By default in the Amazon FSx API, Amazon FSx selects an unused IP address range for you from the 198.19.* range.
     * By default in the Amazon FSx console, Amazon FSx chooses the last 64 IP addresses from the VPC’s primary CIDR
     * range to use as the endpoint IP address range for the file system. You can have overlapping endpoint IP addresses
     * for file systems deployed in the same VPC/route tables.
     * </p>
     * 
     * @param endpointIpAddressRange
     *        (Multi-AZ only) Specifies the IP address range in which the endpoints to access your file system will be
     *        created. By default in the Amazon FSx API, Amazon FSx selects an unused IP address range for you from the
     *        198.19.* range. By default in the Amazon FSx console, Amazon FSx chooses the last 64 IP addresses from the
     *        VPC’s primary CIDR range to use as the endpoint IP address range for the file system. You can have
     *        overlapping endpoint IP addresses for file systems deployed in the same VPC/route tables.
     */

    public void setEndpointIpAddressRange(String endpointIpAddressRange) {
        this.endpointIpAddressRange = endpointIpAddressRange;
    }

    /**
     * <p>
     * (Multi-AZ only) Specifies the IP address range in which the endpoints to access your file system will be created.
     * By default in the Amazon FSx API, Amazon FSx selects an unused IP address range for you from the 198.19.* range.
     * By default in the Amazon FSx console, Amazon FSx chooses the last 64 IP addresses from the VPC’s primary CIDR
     * range to use as the endpoint IP address range for the file system. You can have overlapping endpoint IP addresses
     * for file systems deployed in the same VPC/route tables.
     * </p>
     * 
     * @return (Multi-AZ only) Specifies the IP address range in which the endpoints to access your file system will be
     *         created. By default in the Amazon FSx API, Amazon FSx selects an unused IP address range for you from the
     *         198.19.* range. By default in the Amazon FSx console, Amazon FSx chooses the last 64 IP addresses from
     *         the VPC’s primary CIDR range to use as the endpoint IP address range for the file system. You can have
     *         overlapping endpoint IP addresses for file systems deployed in the same VPC/route tables.
     */

    public String getEndpointIpAddressRange() {
        return this.endpointIpAddressRange;
    }

    /**
     * <p>
     * (Multi-AZ only) Specifies the IP address range in which the endpoints to access your file system will be created.
     * By default in the Amazon FSx API, Amazon FSx selects an unused IP address range for you from the 198.19.* range.
     * By default in the Amazon FSx console, Amazon FSx chooses the last 64 IP addresses from the VPC’s primary CIDR
     * range to use as the endpoint IP address range for the file system. You can have overlapping endpoint IP addresses
     * for file systems deployed in the same VPC/route tables.
     * </p>
     * 
     * @param endpointIpAddressRange
     *        (Multi-AZ only) Specifies the IP address range in which the endpoints to access your file system will be
     *        created. By default in the Amazon FSx API, Amazon FSx selects an unused IP address range for you from the
     *        198.19.* range. By default in the Amazon FSx console, Amazon FSx chooses the last 64 IP addresses from the
     *        VPC’s primary CIDR range to use as the endpoint IP address range for the file system. You can have
     *        overlapping endpoint IP addresses for file systems deployed in the same VPC/route tables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OntapFileSystemConfiguration withEndpointIpAddressRange(String endpointIpAddressRange) {
        setEndpointIpAddressRange(endpointIpAddressRange);
        return this;
    }

    /**
     * <p>
     * The <code>Management</code> and <code>Intercluster</code> endpoints that are used to access data or to manage the
     * file system using the NetApp ONTAP CLI, REST API, or NetApp SnapMirror.
     * </p>
     * 
     * @param endpoints
     *        The <code>Management</code> and <code>Intercluster</code> endpoints that are used to access data or to
     *        manage the file system using the NetApp ONTAP CLI, REST API, or NetApp SnapMirror.
     */

    public void setEndpoints(FileSystemEndpoints endpoints) {
        this.endpoints = endpoints;
    }

    /**
     * <p>
     * The <code>Management</code> and <code>Intercluster</code> endpoints that are used to access data or to manage the
     * file system using the NetApp ONTAP CLI, REST API, or NetApp SnapMirror.
     * </p>
     * 
     * @return The <code>Management</code> and <code>Intercluster</code> endpoints that are used to access data or to
     *         manage the file system using the NetApp ONTAP CLI, REST API, or NetApp SnapMirror.
     */

    public FileSystemEndpoints getEndpoints() {
        return this.endpoints;
    }

    /**
     * <p>
     * The <code>Management</code> and <code>Intercluster</code> endpoints that are used to access data or to manage the
     * file system using the NetApp ONTAP CLI, REST API, or NetApp SnapMirror.
     * </p>
     * 
     * @param endpoints
     *        The <code>Management</code> and <code>Intercluster</code> endpoints that are used to access data or to
     *        manage the file system using the NetApp ONTAP CLI, REST API, or NetApp SnapMirror.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OntapFileSystemConfiguration withEndpoints(FileSystemEndpoints endpoints) {
        setEndpoints(endpoints);
        return this;
    }

    /**
     * <p>
     * The SSD IOPS configuration for the ONTAP file system, specifying the number of provisioned IOPS and the provision
     * mode.
     * </p>
     * 
     * @param diskIopsConfiguration
     *        The SSD IOPS configuration for the ONTAP file system, specifying the number of provisioned IOPS and the
     *        provision mode.
     */

    public void setDiskIopsConfiguration(DiskIopsConfiguration diskIopsConfiguration) {
        this.diskIopsConfiguration = diskIopsConfiguration;
    }

    /**
     * <p>
     * The SSD IOPS configuration for the ONTAP file system, specifying the number of provisioned IOPS and the provision
     * mode.
     * </p>
     * 
     * @return The SSD IOPS configuration for the ONTAP file system, specifying the number of provisioned IOPS and the
     *         provision mode.
     */

    public DiskIopsConfiguration getDiskIopsConfiguration() {
        return this.diskIopsConfiguration;
    }

    /**
     * <p>
     * The SSD IOPS configuration for the ONTAP file system, specifying the number of provisioned IOPS and the provision
     * mode.
     * </p>
     * 
     * @param diskIopsConfiguration
     *        The SSD IOPS configuration for the ONTAP file system, specifying the number of provisioned IOPS and the
     *        provision mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OntapFileSystemConfiguration withDiskIopsConfiguration(DiskIopsConfiguration diskIopsConfiguration) {
        setDiskIopsConfiguration(diskIopsConfiguration);
        return this;
    }

    /**
     * @param preferredSubnetId
     */

    public void setPreferredSubnetId(String preferredSubnetId) {
        this.preferredSubnetId = preferredSubnetId;
    }

    /**
     * @return
     */

    public String getPreferredSubnetId() {
        return this.preferredSubnetId;
    }

    /**
     * @param preferredSubnetId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OntapFileSystemConfiguration withPreferredSubnetId(String preferredSubnetId) {
        setPreferredSubnetId(preferredSubnetId);
        return this;
    }

    /**
     * <p>
     * (Multi-AZ only) The VPC route tables in which your file system's endpoints are created.
     * </p>
     * 
     * @return (Multi-AZ only) The VPC route tables in which your file system's endpoints are created.
     */

    public java.util.List<String> getRouteTableIds() {
        return routeTableIds;
    }

    /**
     * <p>
     * (Multi-AZ only) The VPC route tables in which your file system's endpoints are created.
     * </p>
     * 
     * @param routeTableIds
     *        (Multi-AZ only) The VPC route tables in which your file system's endpoints are created.
     */

    public void setRouteTableIds(java.util.Collection<String> routeTableIds) {
        if (routeTableIds == null) {
            this.routeTableIds = null;
            return;
        }

        this.routeTableIds = new java.util.ArrayList<String>(routeTableIds);
    }

    /**
     * <p>
     * (Multi-AZ only) The VPC route tables in which your file system's endpoints are created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRouteTableIds(java.util.Collection)} or {@link #withRouteTableIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param routeTableIds
     *        (Multi-AZ only) The VPC route tables in which your file system's endpoints are created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OntapFileSystemConfiguration withRouteTableIds(String... routeTableIds) {
        if (this.routeTableIds == null) {
            setRouteTableIds(new java.util.ArrayList<String>(routeTableIds.length));
        }
        for (String ele : routeTableIds) {
            this.routeTableIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * (Multi-AZ only) The VPC route tables in which your file system's endpoints are created.
     * </p>
     * 
     * @param routeTableIds
     *        (Multi-AZ only) The VPC route tables in which your file system's endpoints are created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OntapFileSystemConfiguration withRouteTableIds(java.util.Collection<String> routeTableIds) {
        setRouteTableIds(routeTableIds);
        return this;
    }

    /**
     * @param throughputCapacity
     */

    public void setThroughputCapacity(Integer throughputCapacity) {
        this.throughputCapacity = throughputCapacity;
    }

    /**
     * @return
     */

    public Integer getThroughputCapacity() {
        return this.throughputCapacity;
    }

    /**
     * @param throughputCapacity
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OntapFileSystemConfiguration withThroughputCapacity(Integer throughputCapacity) {
        setThroughputCapacity(throughputCapacity);
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

    public OntapFileSystemConfiguration withWeeklyMaintenanceStartTime(String weeklyMaintenanceStartTime) {
        setWeeklyMaintenanceStartTime(weeklyMaintenanceStartTime);
        return this;
    }

    /**
     * <p>
     * You can use the <code>fsxadmin</code> user account to access the NetApp ONTAP CLI and REST API. The password
     * value is always redacted in the response.
     * </p>
     * 
     * @param fsxAdminPassword
     *        You can use the <code>fsxadmin</code> user account to access the NetApp ONTAP CLI and REST API. The
     *        password value is always redacted in the response.
     */

    public void setFsxAdminPassword(String fsxAdminPassword) {
        this.fsxAdminPassword = fsxAdminPassword;
    }

    /**
     * <p>
     * You can use the <code>fsxadmin</code> user account to access the NetApp ONTAP CLI and REST API. The password
     * value is always redacted in the response.
     * </p>
     * 
     * @return You can use the <code>fsxadmin</code> user account to access the NetApp ONTAP CLI and REST API. The
     *         password value is always redacted in the response.
     */

    public String getFsxAdminPassword() {
        return this.fsxAdminPassword;
    }

    /**
     * <p>
     * You can use the <code>fsxadmin</code> user account to access the NetApp ONTAP CLI and REST API. The password
     * value is always redacted in the response.
     * </p>
     * 
     * @param fsxAdminPassword
     *        You can use the <code>fsxadmin</code> user account to access the NetApp ONTAP CLI and REST API. The
     *        password value is always redacted in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OntapFileSystemConfiguration withFsxAdminPassword(String fsxAdminPassword) {
        setFsxAdminPassword(fsxAdminPassword);
        return this;
    }

    /**
     * <p>
     * Specifies how many high-availability (HA) file server pairs the file system will have. The default value is 1.
     * The value of this property affects the values of <code>StorageCapacity</code>, <code>Iops</code>, and
     * <code>ThroughputCapacity</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/HA-pairs.html">High-availability (HA) pairs</a> in the
     * FSx for ONTAP user guide.
     * </p>
     * <p>
     * Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following conditions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value of <code>HAPairs</code> is less than 1 or greater than 12.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>HAPairs</code> is greater than 1 and the value of <code>DeploymentType</code> is
     * <code>SINGLE_AZ_1</code> or <code>MULTI_AZ_1</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param hAPairs
     *        Specifies how many high-availability (HA) file server pairs the file system will have. The default value
     *        is 1. The value of this property affects the values of <code>StorageCapacity</code>, <code>Iops</code>,
     *        and <code>ThroughputCapacity</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/HA-pairs.html">High-availability (HA) pairs</a> in
     *        the FSx for ONTAP user guide.</p>
     *        <p>
     *        Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following conditions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The value of <code>HAPairs</code> is less than 1 or greater than 12.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The value of <code>HAPairs</code> is greater than 1 and the value of <code>DeploymentType</code> is
     *        <code>SINGLE_AZ_1</code> or <code>MULTI_AZ_1</code>.
     *        </p>
     *        </li>
     */

    public void setHAPairs(Integer hAPairs) {
        this.hAPairs = hAPairs;
    }

    /**
     * <p>
     * Specifies how many high-availability (HA) file server pairs the file system will have. The default value is 1.
     * The value of this property affects the values of <code>StorageCapacity</code>, <code>Iops</code>, and
     * <code>ThroughputCapacity</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/HA-pairs.html">High-availability (HA) pairs</a> in the
     * FSx for ONTAP user guide.
     * </p>
     * <p>
     * Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following conditions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value of <code>HAPairs</code> is less than 1 or greater than 12.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>HAPairs</code> is greater than 1 and the value of <code>DeploymentType</code> is
     * <code>SINGLE_AZ_1</code> or <code>MULTI_AZ_1</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies how many high-availability (HA) file server pairs the file system will have. The default value
     *         is 1. The value of this property affects the values of <code>StorageCapacity</code>, <code>Iops</code>,
     *         and <code>ThroughputCapacity</code>. For more information, see <a
     *         href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/HA-pairs.html">High-availability (HA) pairs</a>
     *         in the FSx for ONTAP user guide.</p>
     *         <p>
     *         Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following conditions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The value of <code>HAPairs</code> is less than 1 or greater than 12.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The value of <code>HAPairs</code> is greater than 1 and the value of <code>DeploymentType</code> is
     *         <code>SINGLE_AZ_1</code> or <code>MULTI_AZ_1</code>.
     *         </p>
     *         </li>
     */

    public Integer getHAPairs() {
        return this.hAPairs;
    }

    /**
     * <p>
     * Specifies how many high-availability (HA) file server pairs the file system will have. The default value is 1.
     * The value of this property affects the values of <code>StorageCapacity</code>, <code>Iops</code>, and
     * <code>ThroughputCapacity</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/HA-pairs.html">High-availability (HA) pairs</a> in the
     * FSx for ONTAP user guide.
     * </p>
     * <p>
     * Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following conditions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value of <code>HAPairs</code> is less than 1 or greater than 12.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>HAPairs</code> is greater than 1 and the value of <code>DeploymentType</code> is
     * <code>SINGLE_AZ_1</code> or <code>MULTI_AZ_1</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param hAPairs
     *        Specifies how many high-availability (HA) file server pairs the file system will have. The default value
     *        is 1. The value of this property affects the values of <code>StorageCapacity</code>, <code>Iops</code>,
     *        and <code>ThroughputCapacity</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/HA-pairs.html">High-availability (HA) pairs</a> in
     *        the FSx for ONTAP user guide.</p>
     *        <p>
     *        Amazon FSx responds with an HTTP status code 400 (Bad Request) for the following conditions:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The value of <code>HAPairs</code> is less than 1 or greater than 12.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The value of <code>HAPairs</code> is greater than 1 and the value of <code>DeploymentType</code> is
     *        <code>SINGLE_AZ_1</code> or <code>MULTI_AZ_1</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OntapFileSystemConfiguration withHAPairs(Integer hAPairs) {
        setHAPairs(hAPairs);
        return this;
    }

    /**
     * <p>
     * Use to choose the throughput capacity per HA pair. When the value of <code>HAPairs</code> is equal to 1, the
     * value of <code>ThroughputCapacityPerHAPair</code> is the total throughput for the file system.
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
     * The value of <code>ThroughputCapacity</code> and <code>ThroughputCapacityPerHAPair</code> are not the same value.
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
     *        Use to choose the throughput capacity per HA pair. When the value of <code>HAPairs</code> is equal to 1,
     *        the value of <code>ThroughputCapacityPerHAPair</code> is the total throughput for the file system.</p>
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
     *        value.
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
     * Use to choose the throughput capacity per HA pair. When the value of <code>HAPairs</code> is equal to 1, the
     * value of <code>ThroughputCapacityPerHAPair</code> is the total throughput for the file system.
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
     * The value of <code>ThroughputCapacity</code> and <code>ThroughputCapacityPerHAPair</code> are not the same value.
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
     * @return Use to choose the throughput capacity per HA pair. When the value of <code>HAPairs</code> is equal to 1,
     *         the value of <code>ThroughputCapacityPerHAPair</code> is the total throughput for the file system.</p>
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
     *         same value.
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
     * Use to choose the throughput capacity per HA pair. When the value of <code>HAPairs</code> is equal to 1, the
     * value of <code>ThroughputCapacityPerHAPair</code> is the total throughput for the file system.
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
     * The value of <code>ThroughputCapacity</code> and <code>ThroughputCapacityPerHAPair</code> are not the same value.
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
     *        Use to choose the throughput capacity per HA pair. When the value of <code>HAPairs</code> is equal to 1,
     *        the value of <code>ThroughputCapacityPerHAPair</code> is the total throughput for the file system.</p>
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
     *        value.
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

    public OntapFileSystemConfiguration withThroughputCapacityPerHAPair(Integer throughputCapacityPerHAPair) {
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
        if (getDeploymentType() != null)
            sb.append("DeploymentType: ").append(getDeploymentType()).append(",");
        if (getEndpointIpAddressRange() != null)
            sb.append("EndpointIpAddressRange: ").append(getEndpointIpAddressRange()).append(",");
        if (getEndpoints() != null)
            sb.append("Endpoints: ").append(getEndpoints()).append(",");
        if (getDiskIopsConfiguration() != null)
            sb.append("DiskIopsConfiguration: ").append(getDiskIopsConfiguration()).append(",");
        if (getPreferredSubnetId() != null)
            sb.append("PreferredSubnetId: ").append(getPreferredSubnetId()).append(",");
        if (getRouteTableIds() != null)
            sb.append("RouteTableIds: ").append(getRouteTableIds()).append(",");
        if (getThroughputCapacity() != null)
            sb.append("ThroughputCapacity: ").append(getThroughputCapacity()).append(",");
        if (getWeeklyMaintenanceStartTime() != null)
            sb.append("WeeklyMaintenanceStartTime: ").append(getWeeklyMaintenanceStartTime()).append(",");
        if (getFsxAdminPassword() != null)
            sb.append("FsxAdminPassword: ").append("***Sensitive Data Redacted***").append(",");
        if (getHAPairs() != null)
            sb.append("HAPairs: ").append(getHAPairs()).append(",");
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

        if (obj instanceof OntapFileSystemConfiguration == false)
            return false;
        OntapFileSystemConfiguration other = (OntapFileSystemConfiguration) obj;
        if (other.getAutomaticBackupRetentionDays() == null ^ this.getAutomaticBackupRetentionDays() == null)
            return false;
        if (other.getAutomaticBackupRetentionDays() != null && other.getAutomaticBackupRetentionDays().equals(this.getAutomaticBackupRetentionDays()) == false)
            return false;
        if (other.getDailyAutomaticBackupStartTime() == null ^ this.getDailyAutomaticBackupStartTime() == null)
            return false;
        if (other.getDailyAutomaticBackupStartTime() != null
                && other.getDailyAutomaticBackupStartTime().equals(this.getDailyAutomaticBackupStartTime()) == false)
            return false;
        if (other.getDeploymentType() == null ^ this.getDeploymentType() == null)
            return false;
        if (other.getDeploymentType() != null && other.getDeploymentType().equals(this.getDeploymentType()) == false)
            return false;
        if (other.getEndpointIpAddressRange() == null ^ this.getEndpointIpAddressRange() == null)
            return false;
        if (other.getEndpointIpAddressRange() != null && other.getEndpointIpAddressRange().equals(this.getEndpointIpAddressRange()) == false)
            return false;
        if (other.getEndpoints() == null ^ this.getEndpoints() == null)
            return false;
        if (other.getEndpoints() != null && other.getEndpoints().equals(this.getEndpoints()) == false)
            return false;
        if (other.getDiskIopsConfiguration() == null ^ this.getDiskIopsConfiguration() == null)
            return false;
        if (other.getDiskIopsConfiguration() != null && other.getDiskIopsConfiguration().equals(this.getDiskIopsConfiguration()) == false)
            return false;
        if (other.getPreferredSubnetId() == null ^ this.getPreferredSubnetId() == null)
            return false;
        if (other.getPreferredSubnetId() != null && other.getPreferredSubnetId().equals(this.getPreferredSubnetId()) == false)
            return false;
        if (other.getRouteTableIds() == null ^ this.getRouteTableIds() == null)
            return false;
        if (other.getRouteTableIds() != null && other.getRouteTableIds().equals(this.getRouteTableIds()) == false)
            return false;
        if (other.getThroughputCapacity() == null ^ this.getThroughputCapacity() == null)
            return false;
        if (other.getThroughputCapacity() != null && other.getThroughputCapacity().equals(this.getThroughputCapacity()) == false)
            return false;
        if (other.getWeeklyMaintenanceStartTime() == null ^ this.getWeeklyMaintenanceStartTime() == null)
            return false;
        if (other.getWeeklyMaintenanceStartTime() != null && other.getWeeklyMaintenanceStartTime().equals(this.getWeeklyMaintenanceStartTime()) == false)
            return false;
        if (other.getFsxAdminPassword() == null ^ this.getFsxAdminPassword() == null)
            return false;
        if (other.getFsxAdminPassword() != null && other.getFsxAdminPassword().equals(this.getFsxAdminPassword()) == false)
            return false;
        if (other.getHAPairs() == null ^ this.getHAPairs() == null)
            return false;
        if (other.getHAPairs() != null && other.getHAPairs().equals(this.getHAPairs()) == false)
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
        hashCode = prime * hashCode + ((getDeploymentType() == null) ? 0 : getDeploymentType().hashCode());
        hashCode = prime * hashCode + ((getEndpointIpAddressRange() == null) ? 0 : getEndpointIpAddressRange().hashCode());
        hashCode = prime * hashCode + ((getEndpoints() == null) ? 0 : getEndpoints().hashCode());
        hashCode = prime * hashCode + ((getDiskIopsConfiguration() == null) ? 0 : getDiskIopsConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPreferredSubnetId() == null) ? 0 : getPreferredSubnetId().hashCode());
        hashCode = prime * hashCode + ((getRouteTableIds() == null) ? 0 : getRouteTableIds().hashCode());
        hashCode = prime * hashCode + ((getThroughputCapacity() == null) ? 0 : getThroughputCapacity().hashCode());
        hashCode = prime * hashCode + ((getWeeklyMaintenanceStartTime() == null) ? 0 : getWeeklyMaintenanceStartTime().hashCode());
        hashCode = prime * hashCode + ((getFsxAdminPassword() == null) ? 0 : getFsxAdminPassword().hashCode());
        hashCode = prime * hashCode + ((getHAPairs() == null) ? 0 : getHAPairs().hashCode());
        hashCode = prime * hashCode + ((getThroughputCapacityPerHAPair() == null) ? 0 : getThroughputCapacityPerHAPair().hashCode());
        return hashCode;
    }

    @Override
    public OntapFileSystemConfiguration clone() {
        try {
            return (OntapFileSystemConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.OntapFileSystemConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
