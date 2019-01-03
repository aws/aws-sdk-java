/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an instance's Amazon EBS volume.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/Volume" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Volume implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The volume ID.
     * </p>
     */
    private String volumeId;
    /**
     * <p>
     * The Amazon EC2 volume ID.
     * </p>
     */
    private String ec2VolumeId;
    /**
     * <p>
     * The volume name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The RAID array ID.
     * </p>
     */
    private String raidArrayId;
    /**
     * <p>
     * The instance ID.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The value returned by <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeVolumes.html"
     * >DescribeVolumes</a>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The volume size.
     * </p>
     */
    private Integer size;
    /**
     * <p>
     * The device name.
     * </p>
     */
    private String device;
    /**
     * <p>
     * The volume mount point. For example, "/mnt/disk1".
     * </p>
     */
    private String mountPoint;
    /**
     * <p>
     * The AWS region. For more information about AWS regions, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The volume Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The volume type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"> Amazon EBS Volume Types</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>standard</code> - Magnetic. Magnetic volumes must have a minimum size of 1 GiB and a maximum size of 1024
     * GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code> - Provisioned IOPS (SSD). PIOPS volumes must have a minimum size of 4 GiB and a maximum size of
     * 16384 GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>gp2</code> - General Purpose (SSD). General purpose volumes must have a minimum size of 1 GiB and a maximum
     * size of 16384 GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>st1</code> - Throughput Optimized hard disk drive (HDD). Throughput optimized HDD volumes must have a
     * minimum size of 500 GiB and a maximum size of 16384 GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sc1</code> - Cold HDD. Cold HDD volumes must have a minimum size of 500 GiB and a maximum size of 16384
     * GiB.
     * </p>
     * </li>
     * </ul>
     */
    private String volumeType;
    /**
     * <p>
     * For PIOPS volumes, the IOPS per disk.
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * Specifies whether an Amazon EBS volume is encrypted. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a>.
     * </p>
     */
    private Boolean encrypted;

    /**
     * <p>
     * The volume ID.
     * </p>
     * 
     * @param volumeId
     *        The volume ID.
     */

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * The volume ID.
     * </p>
     * 
     * @return The volume ID.
     */

    public String getVolumeId() {
        return this.volumeId;
    }

    /**
     * <p>
     * The volume ID.
     * </p>
     * 
     * @param volumeId
     *        The volume ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withVolumeId(String volumeId) {
        setVolumeId(volumeId);
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 volume ID.
     * </p>
     * 
     * @param ec2VolumeId
     *        The Amazon EC2 volume ID.
     */

    public void setEc2VolumeId(String ec2VolumeId) {
        this.ec2VolumeId = ec2VolumeId;
    }

    /**
     * <p>
     * The Amazon EC2 volume ID.
     * </p>
     * 
     * @return The Amazon EC2 volume ID.
     */

    public String getEc2VolumeId() {
        return this.ec2VolumeId;
    }

    /**
     * <p>
     * The Amazon EC2 volume ID.
     * </p>
     * 
     * @param ec2VolumeId
     *        The Amazon EC2 volume ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withEc2VolumeId(String ec2VolumeId) {
        setEc2VolumeId(ec2VolumeId);
        return this;
    }

    /**
     * <p>
     * The volume name.
     * </p>
     * 
     * @param name
     *        The volume name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The volume name.
     * </p>
     * 
     * @return The volume name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The volume name.
     * </p>
     * 
     * @param name
     *        The volume name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The RAID array ID.
     * </p>
     * 
     * @param raidArrayId
     *        The RAID array ID.
     */

    public void setRaidArrayId(String raidArrayId) {
        this.raidArrayId = raidArrayId;
    }

    /**
     * <p>
     * The RAID array ID.
     * </p>
     * 
     * @return The RAID array ID.
     */

    public String getRaidArrayId() {
        return this.raidArrayId;
    }

    /**
     * <p>
     * The RAID array ID.
     * </p>
     * 
     * @param raidArrayId
     *        The RAID array ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withRaidArrayId(String raidArrayId) {
        setRaidArrayId(raidArrayId);
        return this;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @param instanceId
     *        The instance ID.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @return The instance ID.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @param instanceId
     *        The instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The value returned by <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeVolumes.html"
     * >DescribeVolumes</a>.
     * </p>
     * 
     * @param status
     *        The value returned by <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeVolumes.html"
     *        >DescribeVolumes</a>.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The value returned by <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeVolumes.html"
     * >DescribeVolumes</a>.
     * </p>
     * 
     * @return The value returned by <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeVolumes.html"
     *         >DescribeVolumes</a>.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The value returned by <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeVolumes.html"
     * >DescribeVolumes</a>.
     * </p>
     * 
     * @param status
     *        The value returned by <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeVolumes.html"
     *        >DescribeVolumes</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The volume size.
     * </p>
     * 
     * @param size
     *        The volume size.
     */

    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * <p>
     * The volume size.
     * </p>
     * 
     * @return The volume size.
     */

    public Integer getSize() {
        return this.size;
    }

    /**
     * <p>
     * The volume size.
     * </p>
     * 
     * @param size
     *        The volume size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withSize(Integer size) {
        setSize(size);
        return this;
    }

    /**
     * <p>
     * The device name.
     * </p>
     * 
     * @param device
     *        The device name.
     */

    public void setDevice(String device) {
        this.device = device;
    }

    /**
     * <p>
     * The device name.
     * </p>
     * 
     * @return The device name.
     */

    public String getDevice() {
        return this.device;
    }

    /**
     * <p>
     * The device name.
     * </p>
     * 
     * @param device
     *        The device name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withDevice(String device) {
        setDevice(device);
        return this;
    }

    /**
     * <p>
     * The volume mount point. For example, "/mnt/disk1".
     * </p>
     * 
     * @param mountPoint
     *        The volume mount point. For example, "/mnt/disk1".
     */

    public void setMountPoint(String mountPoint) {
        this.mountPoint = mountPoint;
    }

    /**
     * <p>
     * The volume mount point. For example, "/mnt/disk1".
     * </p>
     * 
     * @return The volume mount point. For example, "/mnt/disk1".
     */

    public String getMountPoint() {
        return this.mountPoint;
    }

    /**
     * <p>
     * The volume mount point. For example, "/mnt/disk1".
     * </p>
     * 
     * @param mountPoint
     *        The volume mount point. For example, "/mnt/disk1".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withMountPoint(String mountPoint) {
        setMountPoint(mountPoint);
        return this;
    }

    /**
     * <p>
     * The AWS region. For more information about AWS regions, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     * </p>
     * 
     * @param region
     *        The AWS region. For more information about AWS regions, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The AWS region. For more information about AWS regions, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     * </p>
     * 
     * @return The AWS region. For more information about AWS regions, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The AWS region. For more information about AWS regions, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     * </p>
     * 
     * @param region
     *        The AWS region. For more information about AWS regions, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The volume Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     * </p>
     * 
     * @param availabilityZone
     *        The volume Availability Zone. For more information, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The volume Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     * </p>
     * 
     * @return The volume Availability Zone. For more information, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The volume Availability Zone. For more information, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     * </p>
     * 
     * @param availabilityZone
     *        The volume Availability Zone. For more information, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/rande.html">Regions and Endpoints</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The volume type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"> Amazon EBS Volume Types</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>standard</code> - Magnetic. Magnetic volumes must have a minimum size of 1 GiB and a maximum size of 1024
     * GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code> - Provisioned IOPS (SSD). PIOPS volumes must have a minimum size of 4 GiB and a maximum size of
     * 16384 GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>gp2</code> - General Purpose (SSD). General purpose volumes must have a minimum size of 1 GiB and a maximum
     * size of 16384 GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>st1</code> - Throughput Optimized hard disk drive (HDD). Throughput optimized HDD volumes must have a
     * minimum size of 500 GiB and a maximum size of 16384 GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sc1</code> - Cold HDD. Cold HDD volumes must have a minimum size of 500 GiB and a maximum size of 16384
     * GiB.
     * </p>
     * </li>
     * </ul>
     * 
     * @param volumeType
     *        The volume type. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"> Amazon EBS Volume
     *        Types</a>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>standard</code> - Magnetic. Magnetic volumes must have a minimum size of 1 GiB and a maximum size of
     *        1024 GiB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>io1</code> - Provisioned IOPS (SSD). PIOPS volumes must have a minimum size of 4 GiB and a maximum
     *        size of 16384 GiB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>gp2</code> - General Purpose (SSD). General purpose volumes must have a minimum size of 1 GiB and a
     *        maximum size of 16384 GiB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>st1</code> - Throughput Optimized hard disk drive (HDD). Throughput optimized HDD volumes must have
     *        a minimum size of 500 GiB and a maximum size of 16384 GiB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sc1</code> - Cold HDD. Cold HDD volumes must have a minimum size of 500 GiB and a maximum size of
     *        16384 GiB.
     *        </p>
     *        </li>
     */

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * The volume type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"> Amazon EBS Volume Types</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>standard</code> - Magnetic. Magnetic volumes must have a minimum size of 1 GiB and a maximum size of 1024
     * GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code> - Provisioned IOPS (SSD). PIOPS volumes must have a minimum size of 4 GiB and a maximum size of
     * 16384 GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>gp2</code> - General Purpose (SSD). General purpose volumes must have a minimum size of 1 GiB and a maximum
     * size of 16384 GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>st1</code> - Throughput Optimized hard disk drive (HDD). Throughput optimized HDD volumes must have a
     * minimum size of 500 GiB and a maximum size of 16384 GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sc1</code> - Cold HDD. Cold HDD volumes must have a minimum size of 500 GiB and a maximum size of 16384
     * GiB.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The volume type. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"> Amazon EBS Volume
     *         Types</a>.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>standard</code> - Magnetic. Magnetic volumes must have a minimum size of 1 GiB and a maximum size
     *         of 1024 GiB.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>io1</code> - Provisioned IOPS (SSD). PIOPS volumes must have a minimum size of 4 GiB and a maximum
     *         size of 16384 GiB.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>gp2</code> - General Purpose (SSD). General purpose volumes must have a minimum size of 1 GiB and a
     *         maximum size of 16384 GiB.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>st1</code> - Throughput Optimized hard disk drive (HDD). Throughput optimized HDD volumes must have
     *         a minimum size of 500 GiB and a maximum size of 16384 GiB.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sc1</code> - Cold HDD. Cold HDD volumes must have a minimum size of 500 GiB and a maximum size of
     *         16384 GiB.
     *         </p>
     *         </li>
     */

    public String getVolumeType() {
        return this.volumeType;
    }

    /**
     * <p>
     * The volume type. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"> Amazon EBS Volume Types</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>standard</code> - Magnetic. Magnetic volumes must have a minimum size of 1 GiB and a maximum size of 1024
     * GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>io1</code> - Provisioned IOPS (SSD). PIOPS volumes must have a minimum size of 4 GiB and a maximum size of
     * 16384 GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>gp2</code> - General Purpose (SSD). General purpose volumes must have a minimum size of 1 GiB and a maximum
     * size of 16384 GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>st1</code> - Throughput Optimized hard disk drive (HDD). Throughput optimized HDD volumes must have a
     * minimum size of 500 GiB and a maximum size of 16384 GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sc1</code> - Cold HDD. Cold HDD volumes must have a minimum size of 500 GiB and a maximum size of 16384
     * GiB.
     * </p>
     * </li>
     * </ul>
     * 
     * @param volumeType
     *        The volume type. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html"> Amazon EBS Volume
     *        Types</a>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>standard</code> - Magnetic. Magnetic volumes must have a minimum size of 1 GiB and a maximum size of
     *        1024 GiB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>io1</code> - Provisioned IOPS (SSD). PIOPS volumes must have a minimum size of 4 GiB and a maximum
     *        size of 16384 GiB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>gp2</code> - General Purpose (SSD). General purpose volumes must have a minimum size of 1 GiB and a
     *        maximum size of 16384 GiB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>st1</code> - Throughput Optimized hard disk drive (HDD). Throughput optimized HDD volumes must have
     *        a minimum size of 500 GiB and a maximum size of 16384 GiB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sc1</code> - Cold HDD. Cold HDD volumes must have a minimum size of 500 GiB and a maximum size of
     *        16384 GiB.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withVolumeType(String volumeType) {
        setVolumeType(volumeType);
        return this;
    }

    /**
     * <p>
     * For PIOPS volumes, the IOPS per disk.
     * </p>
     * 
     * @param iops
     *        For PIOPS volumes, the IOPS per disk.
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * For PIOPS volumes, the IOPS per disk.
     * </p>
     * 
     * @return For PIOPS volumes, the IOPS per disk.
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * For PIOPS volumes, the IOPS per disk.
     * </p>
     * 
     * @param iops
     *        For PIOPS volumes, the IOPS per disk.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * Specifies whether an Amazon EBS volume is encrypted. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a>.
     * </p>
     * 
     * @param encrypted
     *        Specifies whether an Amazon EBS volume is encrypted. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a>.
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Specifies whether an Amazon EBS volume is encrypted. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a>.
     * </p>
     * 
     * @return Specifies whether an Amazon EBS volume is encrypted. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a>.
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * Specifies whether an Amazon EBS volume is encrypted. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a>.
     * </p>
     * 
     * @param encrypted
     *        Specifies whether an Amazon EBS volume is encrypted. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * Specifies whether an Amazon EBS volume is encrypted. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a>.
     * </p>
     * 
     * @return Specifies whether an Amazon EBS volume is encrypted. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html">Amazon EBS Encryption</a>.
     */

    public Boolean isEncrypted() {
        return this.encrypted;
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
        if (getVolumeId() != null)
            sb.append("VolumeId: ").append(getVolumeId()).append(",");
        if (getEc2VolumeId() != null)
            sb.append("Ec2VolumeId: ").append(getEc2VolumeId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRaidArrayId() != null)
            sb.append("RaidArrayId: ").append(getRaidArrayId()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSize() != null)
            sb.append("Size: ").append(getSize()).append(",");
        if (getDevice() != null)
            sb.append("Device: ").append(getDevice()).append(",");
        if (getMountPoint() != null)
            sb.append("MountPoint: ").append(getMountPoint()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getVolumeType() != null)
            sb.append("VolumeType: ").append(getVolumeType()).append(",");
        if (getIops() != null)
            sb.append("Iops: ").append(getIops()).append(",");
        if (getEncrypted() != null)
            sb.append("Encrypted: ").append(getEncrypted());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Volume == false)
            return false;
        Volume other = (Volume) obj;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        if (other.getEc2VolumeId() == null ^ this.getEc2VolumeId() == null)
            return false;
        if (other.getEc2VolumeId() != null && other.getEc2VolumeId().equals(this.getEc2VolumeId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRaidArrayId() == null ^ this.getRaidArrayId() == null)
            return false;
        if (other.getRaidArrayId() != null && other.getRaidArrayId().equals(this.getRaidArrayId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        if (other.getDevice() == null ^ this.getDevice() == null)
            return false;
        if (other.getDevice() != null && other.getDevice().equals(this.getDevice()) == false)
            return false;
        if (other.getMountPoint() == null ^ this.getMountPoint() == null)
            return false;
        if (other.getMountPoint() != null && other.getMountPoint().equals(this.getMountPoint()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getVolumeType() == null ^ this.getVolumeType() == null)
            return false;
        if (other.getVolumeType() != null && other.getVolumeType().equals(this.getVolumeType()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        hashCode = prime * hashCode + ((getEc2VolumeId() == null) ? 0 : getEc2VolumeId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRaidArrayId() == null) ? 0 : getRaidArrayId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        hashCode = prime * hashCode + ((getDevice() == null) ? 0 : getDevice().hashCode());
        hashCode = prime * hashCode + ((getMountPoint() == null) ? 0 : getMountPoint().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        return hashCode;
    }

    @Override
    public Volume clone() {
        try {
            return (Volume) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opsworks.model.transform.VolumeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
