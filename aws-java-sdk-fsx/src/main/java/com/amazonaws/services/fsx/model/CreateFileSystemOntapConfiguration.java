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
 * The ONTAP configuration properties of the FSx for ONTAP file system that you are creating.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateFileSystemOntapConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFileSystemOntapConfiguration implements Serializable, Cloneable, StructuredPojo {

    private Integer automaticBackupRetentionDays;

    private String dailyAutomaticBackupStartTime;
    /**
     * <p>
     * Specifies the FSx for ONTAP file system deployment type to use in creating the file system.
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
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/high-availability-AZ.html">Choosing a file system
     * deployment type</a>.
     * </p>
     */
    private String deploymentType;
    /**
     * <p>
     * (Multi-AZ only) Specifies the IP address range in which the endpoints to access your file system will be created.
     * By default in the Amazon FSx API, Amazon FSx selects an unused IP address range for you from the 198.19.* range.
     * By default in the Amazon FSx console, Amazon FSx chooses the last 64 IP addresses from the VPC’s primary CIDR
     * range to use as the endpoint IP address range for the file system. You can have overlapping endpoint IP addresses
     * for file systems deployed in the same VPC/route tables, as long as they don't overlap with any subnet.
     * </p>
     */
    private String endpointIpAddressRange;
    /**
     * <p>
     * The ONTAP administrative password for the <code>fsxadmin</code> user with which you administer your file system
     * using the NetApp ONTAP CLI and REST API.
     * </p>
     */
    private String fsxAdminPassword;
    /**
     * <p>
     * The SSD IOPS configuration for the FSx for ONTAP file system.
     * </p>
     */
    private DiskIopsConfiguration diskIopsConfiguration;
    /**
     * <p>
     * Required when <code>DeploymentType</code> is set to <code>MULTI_AZ_1</code>. This specifies the subnet in which
     * you want the preferred file server to be located.
     * </p>
     */
    private String preferredSubnetId;
    /**
     * <p>
     * (Multi-AZ only) Specifies the route tables in which Amazon FSx creates the rules for routing traffic to the
     * correct file server. You should specify all virtual private cloud (VPC) route tables associated with the subnets
     * in which your clients are located. By default, Amazon FSx selects your VPC's default route table.
     * </p>
     * <note>
     * <p>
     * Amazon FSx manages these route tables for Multi-AZ file systems using tag-based authentication. These route
     * tables are tagged with <code>Key: AmazonFSx; Value: ManagedByAmazonFSx</code>. When creating FSx for ONTAP
     * Multi-AZ file systems using CloudFormation we recommend that you add the
     * <code>Key: AmazonFSx; Value: ManagedByAmazonFSx</code> tag manually.
     * </p>
     * </note>
     */
    private java.util.List<String> routeTableIds;
    /**
     * <p>
     * Sets the throughput capacity for the file system that you're creating in megabytes per second (MBps). For more
     * information, see <a
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

    private String weeklyMaintenanceStartTime;
    /**
     * <p>
     * Specifies how many high-availability (HA) pairs of file servers will power your file system. Scale-up file
     * systems are powered by 1 HA pair. The default value is 1. FSx for ONTAP scale-out file systems are powered by up
     * to 12 HA pairs. The value of this property affects the values of <code>StorageCapacity</code>, <code>Iops</code>,
     * and <code>ThroughputCapacity</code>. For more information, see <a
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
     * Use to choose the throughput capacity per HA pair, rather than the total throughput for the file system.
     * </p>
     * <p>
     * You can define either the <code>ThroughputCapacityPerHAPair</code> or the <code>ThroughputCapacity</code> when
     * creating a file system, but not both.
     * </p>
     * <p>
     * This field and <code>ThroughputCapacity</code> are the same for scale-up file systems powered by one HA pair.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>SINGLE_AZ_1</code> and <code>MULTI_AZ_1</code> file systems, valid values are 128, 256, 512, 1024,
     * 2048, or 4096 MBps.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>SINGLE_AZ_2</code> file systems, valid values are 3072 or 6144 MBps.
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

    public CreateFileSystemOntapConfiguration withAutomaticBackupRetentionDays(Integer automaticBackupRetentionDays) {
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

    public CreateFileSystemOntapConfiguration withDailyAutomaticBackupStartTime(String dailyAutomaticBackupStartTime) {
        setDailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime);
        return this;
    }

    /**
     * <p>
     * Specifies the FSx for ONTAP file system deployment type to use in creating the file system.
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
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/high-availability-AZ.html">Choosing a file system
     * deployment type</a>.
     * </p>
     * 
     * @param deploymentType
     *        Specifies the FSx for ONTAP file system deployment type to use in creating the file system. </p>
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
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/high-availability-AZ.html">Choosing a file system
     *        deployment type</a>.
     * @see OntapDeploymentType
     */

    public void setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
    }

    /**
     * <p>
     * Specifies the FSx for ONTAP file system deployment type to use in creating the file system.
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
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/high-availability-AZ.html">Choosing a file system
     * deployment type</a>.
     * </p>
     * 
     * @return Specifies the FSx for ONTAP file system deployment type to use in creating the file system. </p>
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
     *         href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/high-availability-AZ.html">Choosing a file system
     *         deployment type</a>.
     * @see OntapDeploymentType
     */

    public String getDeploymentType() {
        return this.deploymentType;
    }

    /**
     * <p>
     * Specifies the FSx for ONTAP file system deployment type to use in creating the file system.
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
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/high-availability-AZ.html">Choosing a file system
     * deployment type</a>.
     * </p>
     * 
     * @param deploymentType
     *        Specifies the FSx for ONTAP file system deployment type to use in creating the file system. </p>
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
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/high-availability-AZ.html">Choosing a file system
     *        deployment type</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OntapDeploymentType
     */

    public CreateFileSystemOntapConfiguration withDeploymentType(String deploymentType) {
        setDeploymentType(deploymentType);
        return this;
    }

    /**
     * <p>
     * Specifies the FSx for ONTAP file system deployment type to use in creating the file system.
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
     * href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/high-availability-AZ.html">Choosing a file system
     * deployment type</a>.
     * </p>
     * 
     * @param deploymentType
     *        Specifies the FSx for ONTAP file system deployment type to use in creating the file system. </p>
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
     *        href="https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/high-availability-AZ.html">Choosing a file system
     *        deployment type</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OntapDeploymentType
     */

    public CreateFileSystemOntapConfiguration withDeploymentType(OntapDeploymentType deploymentType) {
        this.deploymentType = deploymentType.toString();
        return this;
    }

    /**
     * <p>
     * (Multi-AZ only) Specifies the IP address range in which the endpoints to access your file system will be created.
     * By default in the Amazon FSx API, Amazon FSx selects an unused IP address range for you from the 198.19.* range.
     * By default in the Amazon FSx console, Amazon FSx chooses the last 64 IP addresses from the VPC’s primary CIDR
     * range to use as the endpoint IP address range for the file system. You can have overlapping endpoint IP addresses
     * for file systems deployed in the same VPC/route tables, as long as they don't overlap with any subnet.
     * </p>
     * 
     * @param endpointIpAddressRange
     *        (Multi-AZ only) Specifies the IP address range in which the endpoints to access your file system will be
     *        created. By default in the Amazon FSx API, Amazon FSx selects an unused IP address range for you from the
     *        198.19.* range. By default in the Amazon FSx console, Amazon FSx chooses the last 64 IP addresses from the
     *        VPC’s primary CIDR range to use as the endpoint IP address range for the file system. You can have
     *        overlapping endpoint IP addresses for file systems deployed in the same VPC/route tables, as long as they
     *        don't overlap with any subnet.
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
     * for file systems deployed in the same VPC/route tables, as long as they don't overlap with any subnet.
     * </p>
     * 
     * @return (Multi-AZ only) Specifies the IP address range in which the endpoints to access your file system will be
     *         created. By default in the Amazon FSx API, Amazon FSx selects an unused IP address range for you from the
     *         198.19.* range. By default in the Amazon FSx console, Amazon FSx chooses the last 64 IP addresses from
     *         the VPC’s primary CIDR range to use as the endpoint IP address range for the file system. You can have
     *         overlapping endpoint IP addresses for file systems deployed in the same VPC/route tables, as long as they
     *         don't overlap with any subnet.
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
     * for file systems deployed in the same VPC/route tables, as long as they don't overlap with any subnet.
     * </p>
     * 
     * @param endpointIpAddressRange
     *        (Multi-AZ only) Specifies the IP address range in which the endpoints to access your file system will be
     *        created. By default in the Amazon FSx API, Amazon FSx selects an unused IP address range for you from the
     *        198.19.* range. By default in the Amazon FSx console, Amazon FSx chooses the last 64 IP addresses from the
     *        VPC’s primary CIDR range to use as the endpoint IP address range for the file system. You can have
     *        overlapping endpoint IP addresses for file systems deployed in the same VPC/route tables, as long as they
     *        don't overlap with any subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemOntapConfiguration withEndpointIpAddressRange(String endpointIpAddressRange) {
        setEndpointIpAddressRange(endpointIpAddressRange);
        return this;
    }

    /**
     * <p>
     * The ONTAP administrative password for the <code>fsxadmin</code> user with which you administer your file system
     * using the NetApp ONTAP CLI and REST API.
     * </p>
     * 
     * @param fsxAdminPassword
     *        The ONTAP administrative password for the <code>fsxadmin</code> user with which you administer your file
     *        system using the NetApp ONTAP CLI and REST API.
     */

    public void setFsxAdminPassword(String fsxAdminPassword) {
        this.fsxAdminPassword = fsxAdminPassword;
    }

    /**
     * <p>
     * The ONTAP administrative password for the <code>fsxadmin</code> user with which you administer your file system
     * using the NetApp ONTAP CLI and REST API.
     * </p>
     * 
     * @return The ONTAP administrative password for the <code>fsxadmin</code> user with which you administer your file
     *         system using the NetApp ONTAP CLI and REST API.
     */

    public String getFsxAdminPassword() {
        return this.fsxAdminPassword;
    }

    /**
     * <p>
     * The ONTAP administrative password for the <code>fsxadmin</code> user with which you administer your file system
     * using the NetApp ONTAP CLI and REST API.
     * </p>
     * 
     * @param fsxAdminPassword
     *        The ONTAP administrative password for the <code>fsxadmin</code> user with which you administer your file
     *        system using the NetApp ONTAP CLI and REST API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemOntapConfiguration withFsxAdminPassword(String fsxAdminPassword) {
        setFsxAdminPassword(fsxAdminPassword);
        return this;
    }

    /**
     * <p>
     * The SSD IOPS configuration for the FSx for ONTAP file system.
     * </p>
     * 
     * @param diskIopsConfiguration
     *        The SSD IOPS configuration for the FSx for ONTAP file system.
     */

    public void setDiskIopsConfiguration(DiskIopsConfiguration diskIopsConfiguration) {
        this.diskIopsConfiguration = diskIopsConfiguration;
    }

    /**
     * <p>
     * The SSD IOPS configuration for the FSx for ONTAP file system.
     * </p>
     * 
     * @return The SSD IOPS configuration for the FSx for ONTAP file system.
     */

    public DiskIopsConfiguration getDiskIopsConfiguration() {
        return this.diskIopsConfiguration;
    }

    /**
     * <p>
     * The SSD IOPS configuration for the FSx for ONTAP file system.
     * </p>
     * 
     * @param diskIopsConfiguration
     *        The SSD IOPS configuration for the FSx for ONTAP file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemOntapConfiguration withDiskIopsConfiguration(DiskIopsConfiguration diskIopsConfiguration) {
        setDiskIopsConfiguration(diskIopsConfiguration);
        return this;
    }

    /**
     * <p>
     * Required when <code>DeploymentType</code> is set to <code>MULTI_AZ_1</code>. This specifies the subnet in which
     * you want the preferred file server to be located.
     * </p>
     * 
     * @param preferredSubnetId
     *        Required when <code>DeploymentType</code> is set to <code>MULTI_AZ_1</code>. This specifies the subnet in
     *        which you want the preferred file server to be located.
     */

    public void setPreferredSubnetId(String preferredSubnetId) {
        this.preferredSubnetId = preferredSubnetId;
    }

    /**
     * <p>
     * Required when <code>DeploymentType</code> is set to <code>MULTI_AZ_1</code>. This specifies the subnet in which
     * you want the preferred file server to be located.
     * </p>
     * 
     * @return Required when <code>DeploymentType</code> is set to <code>MULTI_AZ_1</code>. This specifies the subnet in
     *         which you want the preferred file server to be located.
     */

    public String getPreferredSubnetId() {
        return this.preferredSubnetId;
    }

    /**
     * <p>
     * Required when <code>DeploymentType</code> is set to <code>MULTI_AZ_1</code>. This specifies the subnet in which
     * you want the preferred file server to be located.
     * </p>
     * 
     * @param preferredSubnetId
     *        Required when <code>DeploymentType</code> is set to <code>MULTI_AZ_1</code>. This specifies the subnet in
     *        which you want the preferred file server to be located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemOntapConfiguration withPreferredSubnetId(String preferredSubnetId) {
        setPreferredSubnetId(preferredSubnetId);
        return this;
    }

    /**
     * <p>
     * (Multi-AZ only) Specifies the route tables in which Amazon FSx creates the rules for routing traffic to the
     * correct file server. You should specify all virtual private cloud (VPC) route tables associated with the subnets
     * in which your clients are located. By default, Amazon FSx selects your VPC's default route table.
     * </p>
     * <note>
     * <p>
     * Amazon FSx manages these route tables for Multi-AZ file systems using tag-based authentication. These route
     * tables are tagged with <code>Key: AmazonFSx; Value: ManagedByAmazonFSx</code>. When creating FSx for ONTAP
     * Multi-AZ file systems using CloudFormation we recommend that you add the
     * <code>Key: AmazonFSx; Value: ManagedByAmazonFSx</code> tag manually.
     * </p>
     * </note>
     * 
     * @return (Multi-AZ only) Specifies the route tables in which Amazon FSx creates the rules for routing traffic to
     *         the correct file server. You should specify all virtual private cloud (VPC) route tables associated with
     *         the subnets in which your clients are located. By default, Amazon FSx selects your VPC's default route
     *         table.</p> <note>
     *         <p>
     *         Amazon FSx manages these route tables for Multi-AZ file systems using tag-based authentication. These
     *         route tables are tagged with <code>Key: AmazonFSx; Value: ManagedByAmazonFSx</code>. When creating FSx
     *         for ONTAP Multi-AZ file systems using CloudFormation we recommend that you add the
     *         <code>Key: AmazonFSx; Value: ManagedByAmazonFSx</code> tag manually.
     *         </p>
     */

    public java.util.List<String> getRouteTableIds() {
        return routeTableIds;
    }

    /**
     * <p>
     * (Multi-AZ only) Specifies the route tables in which Amazon FSx creates the rules for routing traffic to the
     * correct file server. You should specify all virtual private cloud (VPC) route tables associated with the subnets
     * in which your clients are located. By default, Amazon FSx selects your VPC's default route table.
     * </p>
     * <note>
     * <p>
     * Amazon FSx manages these route tables for Multi-AZ file systems using tag-based authentication. These route
     * tables are tagged with <code>Key: AmazonFSx; Value: ManagedByAmazonFSx</code>. When creating FSx for ONTAP
     * Multi-AZ file systems using CloudFormation we recommend that you add the
     * <code>Key: AmazonFSx; Value: ManagedByAmazonFSx</code> tag manually.
     * </p>
     * </note>
     * 
     * @param routeTableIds
     *        (Multi-AZ only) Specifies the route tables in which Amazon FSx creates the rules for routing traffic to
     *        the correct file server. You should specify all virtual private cloud (VPC) route tables associated with
     *        the subnets in which your clients are located. By default, Amazon FSx selects your VPC's default route
     *        table.</p> <note>
     *        <p>
     *        Amazon FSx manages these route tables for Multi-AZ file systems using tag-based authentication. These
     *        route tables are tagged with <code>Key: AmazonFSx; Value: ManagedByAmazonFSx</code>. When creating FSx for
     *        ONTAP Multi-AZ file systems using CloudFormation we recommend that you add the
     *        <code>Key: AmazonFSx; Value: ManagedByAmazonFSx</code> tag manually.
     *        </p>
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
     * (Multi-AZ only) Specifies the route tables in which Amazon FSx creates the rules for routing traffic to the
     * correct file server. You should specify all virtual private cloud (VPC) route tables associated with the subnets
     * in which your clients are located. By default, Amazon FSx selects your VPC's default route table.
     * </p>
     * <note>
     * <p>
     * Amazon FSx manages these route tables for Multi-AZ file systems using tag-based authentication. These route
     * tables are tagged with <code>Key: AmazonFSx; Value: ManagedByAmazonFSx</code>. When creating FSx for ONTAP
     * Multi-AZ file systems using CloudFormation we recommend that you add the
     * <code>Key: AmazonFSx; Value: ManagedByAmazonFSx</code> tag manually.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRouteTableIds(java.util.Collection)} or {@link #withRouteTableIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param routeTableIds
     *        (Multi-AZ only) Specifies the route tables in which Amazon FSx creates the rules for routing traffic to
     *        the correct file server. You should specify all virtual private cloud (VPC) route tables associated with
     *        the subnets in which your clients are located. By default, Amazon FSx selects your VPC's default route
     *        table.</p> <note>
     *        <p>
     *        Amazon FSx manages these route tables for Multi-AZ file systems using tag-based authentication. These
     *        route tables are tagged with <code>Key: AmazonFSx; Value: ManagedByAmazonFSx</code>. When creating FSx for
     *        ONTAP Multi-AZ file systems using CloudFormation we recommend that you add the
     *        <code>Key: AmazonFSx; Value: ManagedByAmazonFSx</code> tag manually.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemOntapConfiguration withRouteTableIds(String... routeTableIds) {
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
     * (Multi-AZ only) Specifies the route tables in which Amazon FSx creates the rules for routing traffic to the
     * correct file server. You should specify all virtual private cloud (VPC) route tables associated with the subnets
     * in which your clients are located. By default, Amazon FSx selects your VPC's default route table.
     * </p>
     * <note>
     * <p>
     * Amazon FSx manages these route tables for Multi-AZ file systems using tag-based authentication. These route
     * tables are tagged with <code>Key: AmazonFSx; Value: ManagedByAmazonFSx</code>. When creating FSx for ONTAP
     * Multi-AZ file systems using CloudFormation we recommend that you add the
     * <code>Key: AmazonFSx; Value: ManagedByAmazonFSx</code> tag manually.
     * </p>
     * </note>
     * 
     * @param routeTableIds
     *        (Multi-AZ only) Specifies the route tables in which Amazon FSx creates the rules for routing traffic to
     *        the correct file server. You should specify all virtual private cloud (VPC) route tables associated with
     *        the subnets in which your clients are located. By default, Amazon FSx selects your VPC's default route
     *        table.</p> <note>
     *        <p>
     *        Amazon FSx manages these route tables for Multi-AZ file systems using tag-based authentication. These
     *        route tables are tagged with <code>Key: AmazonFSx; Value: ManagedByAmazonFSx</code>. When creating FSx for
     *        ONTAP Multi-AZ file systems using CloudFormation we recommend that you add the
     *        <code>Key: AmazonFSx; Value: ManagedByAmazonFSx</code> tag manually.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemOntapConfiguration withRouteTableIds(java.util.Collection<String> routeTableIds) {
        setRouteTableIds(routeTableIds);
        return this;
    }

    /**
     * <p>
     * Sets the throughput capacity for the file system that you're creating in megabytes per second (MBps). For more
     * information, see <a
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
     *        Sets the throughput capacity for the file system that you're creating in megabytes per second (MBps). For
     *        more information, see <a
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
     * Sets the throughput capacity for the file system that you're creating in megabytes per second (MBps). For more
     * information, see <a
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
     * @return Sets the throughput capacity for the file system that you're creating in megabytes per second (MBps). For
     *         more information, see <a
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
     * Sets the throughput capacity for the file system that you're creating in megabytes per second (MBps). For more
     * information, see <a
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
     *        Sets the throughput capacity for the file system that you're creating in megabytes per second (MBps). For
     *        more information, see <a
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

    public CreateFileSystemOntapConfiguration withThroughputCapacity(Integer throughputCapacity) {
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

    public CreateFileSystemOntapConfiguration withWeeklyMaintenanceStartTime(String weeklyMaintenanceStartTime) {
        setWeeklyMaintenanceStartTime(weeklyMaintenanceStartTime);
        return this;
    }

    /**
     * <p>
     * Specifies how many high-availability (HA) pairs of file servers will power your file system. Scale-up file
     * systems are powered by 1 HA pair. The default value is 1. FSx for ONTAP scale-out file systems are powered by up
     * to 12 HA pairs. The value of this property affects the values of <code>StorageCapacity</code>, <code>Iops</code>,
     * and <code>ThroughputCapacity</code>. For more information, see <a
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
     *        Specifies how many high-availability (HA) pairs of file servers will power your file system. Scale-up file
     *        systems are powered by 1 HA pair. The default value is 1. FSx for ONTAP scale-out file systems are powered
     *        by up to 12 HA pairs. The value of this property affects the values of <code>StorageCapacity</code>,
     *        <code>Iops</code>, and <code>ThroughputCapacity</code>. For more information, see <a
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
     * Specifies how many high-availability (HA) pairs of file servers will power your file system. Scale-up file
     * systems are powered by 1 HA pair. The default value is 1. FSx for ONTAP scale-out file systems are powered by up
     * to 12 HA pairs. The value of this property affects the values of <code>StorageCapacity</code>, <code>Iops</code>,
     * and <code>ThroughputCapacity</code>. For more information, see <a
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
     * @return Specifies how many high-availability (HA) pairs of file servers will power your file system. Scale-up
     *         file systems are powered by 1 HA pair. The default value is 1. FSx for ONTAP scale-out file systems are
     *         powered by up to 12 HA pairs. The value of this property affects the values of
     *         <code>StorageCapacity</code>, <code>Iops</code>, and <code>ThroughputCapacity</code>. For more
     *         information, see <a
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
     * Specifies how many high-availability (HA) pairs of file servers will power your file system. Scale-up file
     * systems are powered by 1 HA pair. The default value is 1. FSx for ONTAP scale-out file systems are powered by up
     * to 12 HA pairs. The value of this property affects the values of <code>StorageCapacity</code>, <code>Iops</code>,
     * and <code>ThroughputCapacity</code>. For more information, see <a
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
     *        Specifies how many high-availability (HA) pairs of file servers will power your file system. Scale-up file
     *        systems are powered by 1 HA pair. The default value is 1. FSx for ONTAP scale-out file systems are powered
     *        by up to 12 HA pairs. The value of this property affects the values of <code>StorageCapacity</code>,
     *        <code>Iops</code>, and <code>ThroughputCapacity</code>. For more information, see <a
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

    public CreateFileSystemOntapConfiguration withHAPairs(Integer hAPairs) {
        setHAPairs(hAPairs);
        return this;
    }

    /**
     * <p>
     * Use to choose the throughput capacity per HA pair, rather than the total throughput for the file system.
     * </p>
     * <p>
     * You can define either the <code>ThroughputCapacityPerHAPair</code> or the <code>ThroughputCapacity</code> when
     * creating a file system, but not both.
     * </p>
     * <p>
     * This field and <code>ThroughputCapacity</code> are the same for scale-up file systems powered by one HA pair.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>SINGLE_AZ_1</code> and <code>MULTI_AZ_1</code> file systems, valid values are 128, 256, 512, 1024,
     * 2048, or 4096 MBps.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>SINGLE_AZ_2</code> file systems, valid values are 3072 or 6144 MBps.
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
     *        You can define either the <code>ThroughputCapacityPerHAPair</code> or the <code>ThroughputCapacity</code>
     *        when creating a file system, but not both.
     *        </p>
     *        <p>
     *        This field and <code>ThroughputCapacity</code> are the same for scale-up file systems powered by one HA
     *        pair.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For <code>SINGLE_AZ_1</code> and <code>MULTI_AZ_1</code> file systems, valid values are 128, 256, 512,
     *        1024, 2048, or 4096 MBps.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For <code>SINGLE_AZ_2</code> file systems, valid values are 3072 or 6144 MBps.
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
     * You can define either the <code>ThroughputCapacityPerHAPair</code> or the <code>ThroughputCapacity</code> when
     * creating a file system, but not both.
     * </p>
     * <p>
     * This field and <code>ThroughputCapacity</code> are the same for scale-up file systems powered by one HA pair.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>SINGLE_AZ_1</code> and <code>MULTI_AZ_1</code> file systems, valid values are 128, 256, 512, 1024,
     * 2048, or 4096 MBps.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>SINGLE_AZ_2</code> file systems, valid values are 3072 or 6144 MBps.
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
     *         You can define either the <code>ThroughputCapacityPerHAPair</code> or the <code>ThroughputCapacity</code>
     *         when creating a file system, but not both.
     *         </p>
     *         <p>
     *         This field and <code>ThroughputCapacity</code> are the same for scale-up file systems powered by one HA
     *         pair.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For <code>SINGLE_AZ_1</code> and <code>MULTI_AZ_1</code> file systems, valid values are 128, 256, 512,
     *         1024, 2048, or 4096 MBps.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For <code>SINGLE_AZ_2</code> file systems, valid values are 3072 or 6144 MBps.
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
     * You can define either the <code>ThroughputCapacityPerHAPair</code> or the <code>ThroughputCapacity</code> when
     * creating a file system, but not both.
     * </p>
     * <p>
     * This field and <code>ThroughputCapacity</code> are the same for scale-up file systems powered by one HA pair.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>SINGLE_AZ_1</code> and <code>MULTI_AZ_1</code> file systems, valid values are 128, 256, 512, 1024,
     * 2048, or 4096 MBps.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>SINGLE_AZ_2</code> file systems, valid values are 3072 or 6144 MBps.
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
     *        You can define either the <code>ThroughputCapacityPerHAPair</code> or the <code>ThroughputCapacity</code>
     *        when creating a file system, but not both.
     *        </p>
     *        <p>
     *        This field and <code>ThroughputCapacity</code> are the same for scale-up file systems powered by one HA
     *        pair.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For <code>SINGLE_AZ_1</code> and <code>MULTI_AZ_1</code> file systems, valid values are 128, 256, 512,
     *        1024, 2048, or 4096 MBps.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For <code>SINGLE_AZ_2</code> file systems, valid values are 3072 or 6144 MBps.
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

    public CreateFileSystemOntapConfiguration withThroughputCapacityPerHAPair(Integer throughputCapacityPerHAPair) {
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
        if (getFsxAdminPassword() != null)
            sb.append("FsxAdminPassword: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof CreateFileSystemOntapConfiguration == false)
            return false;
        CreateFileSystemOntapConfiguration other = (CreateFileSystemOntapConfiguration) obj;
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
        if (other.getFsxAdminPassword() == null ^ this.getFsxAdminPassword() == null)
            return false;
        if (other.getFsxAdminPassword() != null && other.getFsxAdminPassword().equals(this.getFsxAdminPassword()) == false)
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
        hashCode = prime * hashCode + ((getFsxAdminPassword() == null) ? 0 : getFsxAdminPassword().hashCode());
        hashCode = prime * hashCode + ((getDiskIopsConfiguration() == null) ? 0 : getDiskIopsConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPreferredSubnetId() == null) ? 0 : getPreferredSubnetId().hashCode());
        hashCode = prime * hashCode + ((getRouteTableIds() == null) ? 0 : getRouteTableIds().hashCode());
        hashCode = prime * hashCode + ((getThroughputCapacity() == null) ? 0 : getThroughputCapacity().hashCode());
        hashCode = prime * hashCode + ((getWeeklyMaintenanceStartTime() == null) ? 0 : getWeeklyMaintenanceStartTime().hashCode());
        hashCode = prime * hashCode + ((getHAPairs() == null) ? 0 : getHAPairs().hashCode());
        hashCode = prime * hashCode + ((getThroughputCapacityPerHAPair() == null) ? 0 : getThroughputCapacityPerHAPair().hashCode());
        return hashCode;
    }

    @Override
    public CreateFileSystemOntapConfiguration clone() {
        try {
            return (CreateFileSystemOntapConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.CreateFileSystemOntapConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
