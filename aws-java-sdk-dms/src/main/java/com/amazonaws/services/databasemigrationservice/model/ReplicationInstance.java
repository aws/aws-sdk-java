/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;

/**
 * 
 */
public class ReplicationInstance implements Serializable, Cloneable {

    /**
     * <p>
     * The replication instance identifier. This parameter is stored as a
     * lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>Must contain from 1 to 63 alphanumeric characters or hyphens.</li>
     * <li>First character must be a letter.</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     * </ul>
     * <p>
     * Example: <code>myrepinstance</code>
     * </p>
     */
    private String replicationInstanceIdentifier;
    /**
     * <p>
     * The compute and memory capacity of the replication instance.
     * </p>
     * <p>
     * Valid Values:
     * <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     * </p>
     */
    private String replicationInstanceClass;
    /**
     * <p>
     * The status of the replication instance.
     * </p>
     */
    private String replicationInstanceStatus;
    /**
     * <p>
     * The amount of storage (in gigabytes) that is allocated for the
     * replication instance.
     * </p>
     */
    private Integer allocatedStorage;
    /**
     * <p>
     * The time the replication instance was created.
     * </p>
     */
    private java.util.Date instanceCreateTime;
    /**
     * <p>
     * The Availability Zone for the instance.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The subnet group for the replication instance.
     * </p>
     */
    private ReplicationSubnetGroup replicationSubnetGroup;
    /**
     * <p>
     * The maintenance window times for the replication instance.
     * </p>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * The pending modification values.
     * </p>
     */
    private ReplicationPendingModifiedValues pendingModifiedValues;
    /**
     * <p>
     * The engine version number of the replication instance.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * Boolean value indicating if minor version upgrades will be automatically
     * applied to the instance.
     * </p>
     */
    private Boolean autoMinorVersionUpgrade;
    /**
     * <p>
     * The KMS key identifier that is used to encrypt the content on the
     * replication instance. If you do not specify a value for the KmsKeyId
     * parameter, then AWS DMS will use your default encryption key. AWS KMS
     * creates the default encryption key for your AWS account. Your AWS account
     * has a different default encryption key for each AWS region.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     */
    private String replicationInstanceArn;
    /**
     * <p>
     * The public IP address of the replication instance.
     * </p>
     */
    private String replicationInstancePublicIpAddress;
    /**
     * <p>
     * The private IP address of the replication instance.
     * </p>
     */
    private String replicationInstancePrivateIpAddress;
    /**
     * <p>
     * Specifies the accessibility options for the replication instance. A value
     * of <code>true</code> represents an instance with a public IP address. A
     * value of <code>false</code> represents an instance with a private IP
     * address. The default value is <code>true</code>.
     * </p>
     */
    private Boolean publiclyAccessible;

    /**
     * <p>
     * The replication instance identifier. This parameter is stored as a
     * lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>Must contain from 1 to 63 alphanumeric characters or hyphens.</li>
     * <li>First character must be a letter.</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     * </ul>
     * <p>
     * Example: <code>myrepinstance</code>
     * </p>
     * 
     * @param replicationInstanceIdentifier
     *        The replication instance identifier. This parameter is stored as a
     *        lowercase string.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>Must contain from 1 to 63 alphanumeric characters or hyphens.</li>
     *        <li>First character must be a letter.</li>
     *        <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     *        </ul>
     *        <p>
     *        Example: <code>myrepinstance</code>
     */

    public void setReplicationInstanceIdentifier(
            String replicationInstanceIdentifier) {
        this.replicationInstanceIdentifier = replicationInstanceIdentifier;
    }

    /**
     * <p>
     * The replication instance identifier. This parameter is stored as a
     * lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>Must contain from 1 to 63 alphanumeric characters or hyphens.</li>
     * <li>First character must be a letter.</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     * </ul>
     * <p>
     * Example: <code>myrepinstance</code>
     * </p>
     * 
     * @return The replication instance identifier. This parameter is stored as
     *         a lowercase string.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>Must contain from 1 to 63 alphanumeric characters or hyphens.
     *         </li>
     *         <li>First character must be a letter.</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     *         </ul>
     *         <p>
     *         Example: <code>myrepinstance</code>
     */

    public String getReplicationInstanceIdentifier() {
        return this.replicationInstanceIdentifier;
    }

    /**
     * <p>
     * The replication instance identifier. This parameter is stored as a
     * lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>Must contain from 1 to 63 alphanumeric characters or hyphens.</li>
     * <li>First character must be a letter.</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     * </ul>
     * <p>
     * Example: <code>myrepinstance</code>
     * </p>
     * 
     * @param replicationInstanceIdentifier
     *        The replication instance identifier. This parameter is stored as a
     *        lowercase string.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>Must contain from 1 to 63 alphanumeric characters or hyphens.</li>
     *        <li>First character must be a letter.</li>
     *        <li>Cannot end with a hyphen or contain two consecutive hyphens.</li>
     *        </ul>
     *        <p>
     *        Example: <code>myrepinstance</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReplicationInstance withReplicationInstanceIdentifier(
            String replicationInstanceIdentifier) {
        setReplicationInstanceIdentifier(replicationInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * The compute and memory capacity of the replication instance.
     * </p>
     * <p>
     * Valid Values:
     * <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     * </p>
     * 
     * @param replicationInstanceClass
     *        The compute and memory capacity of the replication instance. </p>
     *        <p>
     *        Valid Values:
     *        <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     */

    public void setReplicationInstanceClass(String replicationInstanceClass) {
        this.replicationInstanceClass = replicationInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the replication instance.
     * </p>
     * <p>
     * Valid Values:
     * <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     * </p>
     * 
     * @return The compute and memory capacity of the replication instance. </p>
     *         <p>
     *         Valid Values:
     *         <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     */

    public String getReplicationInstanceClass() {
        return this.replicationInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the replication instance.
     * </p>
     * <p>
     * Valid Values:
     * <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     * </p>
     * 
     * @param replicationInstanceClass
     *        The compute and memory capacity of the replication instance. </p>
     *        <p>
     *        Valid Values:
     *        <code>dms.t2.micro | dms.t2.small | dms.t2.medium | dms.t2.large | dms.c4.large | dms.c4.xlarge | dms.c4.2xlarge | dms.c4.4xlarge </code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReplicationInstance withReplicationInstanceClass(
            String replicationInstanceClass) {
        setReplicationInstanceClass(replicationInstanceClass);
        return this;
    }

    /**
     * <p>
     * The status of the replication instance.
     * </p>
     * 
     * @param replicationInstanceStatus
     *        The status of the replication instance.
     */

    public void setReplicationInstanceStatus(String replicationInstanceStatus) {
        this.replicationInstanceStatus = replicationInstanceStatus;
    }

    /**
     * <p>
     * The status of the replication instance.
     * </p>
     * 
     * @return The status of the replication instance.
     */

    public String getReplicationInstanceStatus() {
        return this.replicationInstanceStatus;
    }

    /**
     * <p>
     * The status of the replication instance.
     * </p>
     * 
     * @param replicationInstanceStatus
     *        The status of the replication instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReplicationInstance withReplicationInstanceStatus(
            String replicationInstanceStatus) {
        setReplicationInstanceStatus(replicationInstanceStatus);
        return this;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) that is allocated for the
     * replication instance.
     * </p>
     * 
     * @param allocatedStorage
     *        The amount of storage (in gigabytes) that is allocated for the
     *        replication instance.
     */

    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) that is allocated for the
     * replication instance.
     * </p>
     * 
     * @return The amount of storage (in gigabytes) that is allocated for the
     *         replication instance.
     */

    public Integer getAllocatedStorage() {
        return this.allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) that is allocated for the
     * replication instance.
     * </p>
     * 
     * @param allocatedStorage
     *        The amount of storage (in gigabytes) that is allocated for the
     *        replication instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReplicationInstance withAllocatedStorage(Integer allocatedStorage) {
        setAllocatedStorage(allocatedStorage);
        return this;
    }

    /**
     * <p>
     * The time the replication instance was created.
     * </p>
     * 
     * @param instanceCreateTime
     *        The time the replication instance was created.
     */

    public void setInstanceCreateTime(java.util.Date instanceCreateTime) {
        this.instanceCreateTime = instanceCreateTime;
    }

    /**
     * <p>
     * The time the replication instance was created.
     * </p>
     * 
     * @return The time the replication instance was created.
     */

    public java.util.Date getInstanceCreateTime() {
        return this.instanceCreateTime;
    }

    /**
     * <p>
     * The time the replication instance was created.
     * </p>
     * 
     * @param instanceCreateTime
     *        The time the replication instance was created.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReplicationInstance withInstanceCreateTime(
            java.util.Date instanceCreateTime) {
        setInstanceCreateTime(instanceCreateTime);
        return this;
    }

    /**
     * <p>
     * The Availability Zone for the instance.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone for the instance.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone for the instance.
     * </p>
     * 
     * @return The Availability Zone for the instance.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone for the instance.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone for the instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReplicationInstance withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The subnet group for the replication instance.
     * </p>
     * 
     * @param replicationSubnetGroup
     *        The subnet group for the replication instance.
     */

    public void setReplicationSubnetGroup(
            ReplicationSubnetGroup replicationSubnetGroup) {
        this.replicationSubnetGroup = replicationSubnetGroup;
    }

    /**
     * <p>
     * The subnet group for the replication instance.
     * </p>
     * 
     * @return The subnet group for the replication instance.
     */

    public ReplicationSubnetGroup getReplicationSubnetGroup() {
        return this.replicationSubnetGroup;
    }

    /**
     * <p>
     * The subnet group for the replication instance.
     * </p>
     * 
     * @param replicationSubnetGroup
     *        The subnet group for the replication instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReplicationInstance withReplicationSubnetGroup(
            ReplicationSubnetGroup replicationSubnetGroup) {
        setReplicationSubnetGroup(replicationSubnetGroup);
        return this;
    }

    /**
     * <p>
     * The maintenance window times for the replication instance.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The maintenance window times for the replication instance.
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The maintenance window times for the replication instance.
     * </p>
     * 
     * @return The maintenance window times for the replication instance.
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The maintenance window times for the replication instance.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The maintenance window times for the replication instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReplicationInstance withPreferredMaintenanceWindow(
            String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * The pending modification values.
     * </p>
     * 
     * @param pendingModifiedValues
     *        The pending modification values.
     */

    public void setPendingModifiedValues(
            ReplicationPendingModifiedValues pendingModifiedValues) {
        this.pendingModifiedValues = pendingModifiedValues;
    }

    /**
     * <p>
     * The pending modification values.
     * </p>
     * 
     * @return The pending modification values.
     */

    public ReplicationPendingModifiedValues getPendingModifiedValues() {
        return this.pendingModifiedValues;
    }

    /**
     * <p>
     * The pending modification values.
     * </p>
     * 
     * @param pendingModifiedValues
     *        The pending modification values.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReplicationInstance withPendingModifiedValues(
            ReplicationPendingModifiedValues pendingModifiedValues) {
        setPendingModifiedValues(pendingModifiedValues);
        return this;
    }

    /**
     * <p>
     * The engine version number of the replication instance.
     * </p>
     * 
     * @param engineVersion
     *        The engine version number of the replication instance.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The engine version number of the replication instance.
     * </p>
     * 
     * @return The engine version number of the replication instance.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The engine version number of the replication instance.
     * </p>
     * 
     * @param engineVersion
     *        The engine version number of the replication instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReplicationInstance withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * Boolean value indicating if minor version upgrades will be automatically
     * applied to the instance.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        Boolean value indicating if minor version upgrades will be
     *        automatically applied to the instance.
     */

    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Boolean value indicating if minor version upgrades will be automatically
     * applied to the instance.
     * </p>
     * 
     * @return Boolean value indicating if minor version upgrades will be
     *         automatically applied to the instance.
     */

    public Boolean getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Boolean value indicating if minor version upgrades will be automatically
     * applied to the instance.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        Boolean value indicating if minor version upgrades will be
     *        automatically applied to the instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReplicationInstance withAutoMinorVersionUpgrade(
            Boolean autoMinorVersionUpgrade) {
        setAutoMinorVersionUpgrade(autoMinorVersionUpgrade);
        return this;
    }

    /**
     * <p>
     * Boolean value indicating if minor version upgrades will be automatically
     * applied to the instance.
     * </p>
     * 
     * @return Boolean value indicating if minor version upgrades will be
     *         automatically applied to the instance.
     */

    public Boolean isAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * The KMS key identifier that is used to encrypt the content on the
     * replication instance. If you do not specify a value for the KmsKeyId
     * parameter, then AWS DMS will use your default encryption key. AWS KMS
     * creates the default encryption key for your AWS account. Your AWS account
     * has a different default encryption key for each AWS region.
     * </p>
     * 
     * @param kmsKeyId
     *        The KMS key identifier that is used to encrypt the content on the
     *        replication instance. If you do not specify a value for the
     *        KmsKeyId parameter, then AWS DMS will use your default encryption
     *        key. AWS KMS creates the default encryption key for your AWS
     *        account. Your AWS account has a different default encryption key
     *        for each AWS region.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The KMS key identifier that is used to encrypt the content on the
     * replication instance. If you do not specify a value for the KmsKeyId
     * parameter, then AWS DMS will use your default encryption key. AWS KMS
     * creates the default encryption key for your AWS account. Your AWS account
     * has a different default encryption key for each AWS region.
     * </p>
     * 
     * @return The KMS key identifier that is used to encrypt the content on the
     *         replication instance. If you do not specify a value for the
     *         KmsKeyId parameter, then AWS DMS will use your default encryption
     *         key. AWS KMS creates the default encryption key for your AWS
     *         account. Your AWS account has a different default encryption key
     *         for each AWS region.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The KMS key identifier that is used to encrypt the content on the
     * replication instance. If you do not specify a value for the KmsKeyId
     * parameter, then AWS DMS will use your default encryption key. AWS KMS
     * creates the default encryption key for your AWS account. Your AWS account
     * has a different default encryption key for each AWS region.
     * </p>
     * 
     * @param kmsKeyId
     *        The KMS key identifier that is used to encrypt the content on the
     *        replication instance. If you do not specify a value for the
     *        KmsKeyId parameter, then AWS DMS will use your default encryption
     *        key. AWS KMS creates the default encryption key for your AWS
     *        account. Your AWS account has a different default encryption key
     *        for each AWS region.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReplicationInstance withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     * 
     * @param replicationInstanceArn
     *        The Amazon Resource Name (ARN) of the replication instance.
     */

    public void setReplicationInstanceArn(String replicationInstanceArn) {
        this.replicationInstanceArn = replicationInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the replication instance.
     */

    public String getReplicationInstanceArn() {
        return this.replicationInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication instance.
     * </p>
     * 
     * @param replicationInstanceArn
     *        The Amazon Resource Name (ARN) of the replication instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReplicationInstance withReplicationInstanceArn(
            String replicationInstanceArn) {
        setReplicationInstanceArn(replicationInstanceArn);
        return this;
    }

    /**
     * <p>
     * The public IP address of the replication instance.
     * </p>
     * 
     * @param replicationInstancePublicIpAddress
     *        The public IP address of the replication instance.
     */

    public void setReplicationInstancePublicIpAddress(
            String replicationInstancePublicIpAddress) {
        this.replicationInstancePublicIpAddress = replicationInstancePublicIpAddress;
    }

    /**
     * <p>
     * The public IP address of the replication instance.
     * </p>
     * 
     * @return The public IP address of the replication instance.
     */

    public String getReplicationInstancePublicIpAddress() {
        return this.replicationInstancePublicIpAddress;
    }

    /**
     * <p>
     * The public IP address of the replication instance.
     * </p>
     * 
     * @param replicationInstancePublicIpAddress
     *        The public IP address of the replication instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReplicationInstance withReplicationInstancePublicIpAddress(
            String replicationInstancePublicIpAddress) {
        setReplicationInstancePublicIpAddress(replicationInstancePublicIpAddress);
        return this;
    }

    /**
     * <p>
     * The private IP address of the replication instance.
     * </p>
     * 
     * @param replicationInstancePrivateIpAddress
     *        The private IP address of the replication instance.
     */

    public void setReplicationInstancePrivateIpAddress(
            String replicationInstancePrivateIpAddress) {
        this.replicationInstancePrivateIpAddress = replicationInstancePrivateIpAddress;
    }

    /**
     * <p>
     * The private IP address of the replication instance.
     * </p>
     * 
     * @return The private IP address of the replication instance.
     */

    public String getReplicationInstancePrivateIpAddress() {
        return this.replicationInstancePrivateIpAddress;
    }

    /**
     * <p>
     * The private IP address of the replication instance.
     * </p>
     * 
     * @param replicationInstancePrivateIpAddress
     *        The private IP address of the replication instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReplicationInstance withReplicationInstancePrivateIpAddress(
            String replicationInstancePrivateIpAddress) {
        setReplicationInstancePrivateIpAddress(replicationInstancePrivateIpAddress);
        return this;
    }

    /**
     * <p>
     * Specifies the accessibility options for the replication instance. A value
     * of <code>true</code> represents an instance with a public IP address. A
     * value of <code>false</code> represents an instance with a private IP
     * address. The default value is <code>true</code>.
     * </p>
     * 
     * @param publiclyAccessible
     *        Specifies the accessibility options for the replication instance.
     *        A value of <code>true</code> represents an instance with a public
     *        IP address. A value of <code>false</code> represents an instance
     *        with a private IP address. The default value is <code>true</code>.
     */

    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * Specifies the accessibility options for the replication instance. A value
     * of <code>true</code> represents an instance with a public IP address. A
     * value of <code>false</code> represents an instance with a private IP
     * address. The default value is <code>true</code>.
     * </p>
     * 
     * @return Specifies the accessibility options for the replication instance.
     *         A value of <code>true</code> represents an instance with a public
     *         IP address. A value of <code>false</code> represents an instance
     *         with a private IP address. The default value is <code>true</code>
     *         .
     */

    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * Specifies the accessibility options for the replication instance. A value
     * of <code>true</code> represents an instance with a public IP address. A
     * value of <code>false</code> represents an instance with a private IP
     * address. The default value is <code>true</code>.
     * </p>
     * 
     * @param publiclyAccessible
     *        Specifies the accessibility options for the replication instance.
     *        A value of <code>true</code> represents an instance with a public
     *        IP address. A value of <code>false</code> represents an instance
     *        with a private IP address. The default value is <code>true</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReplicationInstance withPubliclyAccessible(Boolean publiclyAccessible) {
        setPubliclyAccessible(publiclyAccessible);
        return this;
    }

    /**
     * <p>
     * Specifies the accessibility options for the replication instance. A value
     * of <code>true</code> represents an instance with a public IP address. A
     * value of <code>false</code> represents an instance with a private IP
     * address. The default value is <code>true</code>.
     * </p>
     * 
     * @return Specifies the accessibility options for the replication instance.
     *         A value of <code>true</code> represents an instance with a public
     *         IP address. A value of <code>false</code> represents an instance
     *         with a private IP address. The default value is <code>true</code>
     *         .
     */

    public Boolean isPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getReplicationInstanceIdentifier() != null)
            sb.append("ReplicationInstanceIdentifier: "
                    + getReplicationInstanceIdentifier() + ",");
        if (getReplicationInstanceClass() != null)
            sb.append("ReplicationInstanceClass: "
                    + getReplicationInstanceClass() + ",");
        if (getReplicationInstanceStatus() != null)
            sb.append("ReplicationInstanceStatus: "
                    + getReplicationInstanceStatus() + ",");
        if (getAllocatedStorage() != null)
            sb.append("AllocatedStorage: " + getAllocatedStorage() + ",");
        if (getInstanceCreateTime() != null)
            sb.append("InstanceCreateTime: " + getInstanceCreateTime() + ",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getReplicationSubnetGroup() != null)
            sb.append("ReplicationSubnetGroup: " + getReplicationSubnetGroup()
                    + ",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: "
                    + getPreferredMaintenanceWindow() + ",");
        if (getPendingModifiedValues() != null)
            sb.append("PendingModifiedValues: " + getPendingModifiedValues()
                    + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getAutoMinorVersionUpgrade() != null)
            sb.append("AutoMinorVersionUpgrade: "
                    + getAutoMinorVersionUpgrade() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getReplicationInstanceArn() != null)
            sb.append("ReplicationInstanceArn: " + getReplicationInstanceArn()
                    + ",");
        if (getReplicationInstancePublicIpAddress() != null)
            sb.append("ReplicationInstancePublicIpAddress: "
                    + getReplicationInstancePublicIpAddress() + ",");
        if (getReplicationInstancePrivateIpAddress() != null)
            sb.append("ReplicationInstancePrivateIpAddress: "
                    + getReplicationInstancePrivateIpAddress() + ",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: " + getPubliclyAccessible());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationInstance == false)
            return false;
        ReplicationInstance other = (ReplicationInstance) obj;
        if (other.getReplicationInstanceIdentifier() == null
                ^ this.getReplicationInstanceIdentifier() == null)
            return false;
        if (other.getReplicationInstanceIdentifier() != null
                && other.getReplicationInstanceIdentifier().equals(
                        this.getReplicationInstanceIdentifier()) == false)
            return false;
        if (other.getReplicationInstanceClass() == null
                ^ this.getReplicationInstanceClass() == null)
            return false;
        if (other.getReplicationInstanceClass() != null
                && other.getReplicationInstanceClass().equals(
                        this.getReplicationInstanceClass()) == false)
            return false;
        if (other.getReplicationInstanceStatus() == null
                ^ this.getReplicationInstanceStatus() == null)
            return false;
        if (other.getReplicationInstanceStatus() != null
                && other.getReplicationInstanceStatus().equals(
                        this.getReplicationInstanceStatus()) == false)
            return false;
        if (other.getAllocatedStorage() == null
                ^ this.getAllocatedStorage() == null)
            return false;
        if (other.getAllocatedStorage() != null
                && other.getAllocatedStorage().equals(
                        this.getAllocatedStorage()) == false)
            return false;
        if (other.getInstanceCreateTime() == null
                ^ this.getInstanceCreateTime() == null)
            return false;
        if (other.getInstanceCreateTime() != null
                && other.getInstanceCreateTime().equals(
                        this.getInstanceCreateTime()) == false)
            return false;
        if (other.getAvailabilityZone() == null
                ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(
                        this.getAvailabilityZone()) == false)
            return false;
        if (other.getReplicationSubnetGroup() == null
                ^ this.getReplicationSubnetGroup() == null)
            return false;
        if (other.getReplicationSubnetGroup() != null
                && other.getReplicationSubnetGroup().equals(
                        this.getReplicationSubnetGroup()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null
                ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null
                && other.getPreferredMaintenanceWindow().equals(
                        this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getPendingModifiedValues() == null
                ^ this.getPendingModifiedValues() == null)
            return false;
        if (other.getPendingModifiedValues() != null
                && other.getPendingModifiedValues().equals(
                        this.getPendingModifiedValues()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null
                && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getAutoMinorVersionUpgrade() == null
                ^ this.getAutoMinorVersionUpgrade() == null)
            return false;
        if (other.getAutoMinorVersionUpgrade() != null
                && other.getAutoMinorVersionUpgrade().equals(
                        this.getAutoMinorVersionUpgrade()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null
                && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getReplicationInstanceArn() == null
                ^ this.getReplicationInstanceArn() == null)
            return false;
        if (other.getReplicationInstanceArn() != null
                && other.getReplicationInstanceArn().equals(
                        this.getReplicationInstanceArn()) == false)
            return false;
        if (other.getReplicationInstancePublicIpAddress() == null
                ^ this.getReplicationInstancePublicIpAddress() == null)
            return false;
        if (other.getReplicationInstancePublicIpAddress() != null
                && other.getReplicationInstancePublicIpAddress().equals(
                        this.getReplicationInstancePublicIpAddress()) == false)
            return false;
        if (other.getReplicationInstancePrivateIpAddress() == null
                ^ this.getReplicationInstancePrivateIpAddress() == null)
            return false;
        if (other.getReplicationInstancePrivateIpAddress() != null
                && other.getReplicationInstancePrivateIpAddress().equals(
                        this.getReplicationInstancePrivateIpAddress()) == false)
            return false;
        if (other.getPubliclyAccessible() == null
                ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null
                && other.getPubliclyAccessible().equals(
                        this.getPubliclyAccessible()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getReplicationInstanceIdentifier() == null) ? 0
                        : getReplicationInstanceIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationInstanceClass() == null) ? 0
                        : getReplicationInstanceClass().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationInstanceStatus() == null) ? 0
                        : getReplicationInstanceStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getInstanceCreateTime() == null) ? 0
                        : getInstanceCreateTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationSubnetGroup() == null) ? 0
                        : getReplicationSubnetGroup().hashCode());
        hashCode = prime
                * hashCode
                + ((getPreferredMaintenanceWindow() == null) ? 0
                        : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime
                * hashCode
                + ((getPendingModifiedValues() == null) ? 0
                        : getPendingModifiedValues().hashCode());
        hashCode = prime
                * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAutoMinorVersionUpgrade() == null) ? 0
                        : getAutoMinorVersionUpgrade().hashCode());
        hashCode = prime * hashCode
                + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationInstanceArn() == null) ? 0
                        : getReplicationInstanceArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationInstancePublicIpAddress() == null) ? 0
                        : getReplicationInstancePublicIpAddress().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationInstancePrivateIpAddress() == null) ? 0
                        : getReplicationInstancePrivateIpAddress().hashCode());
        hashCode = prime
                * hashCode
                + ((getPubliclyAccessible() == null) ? 0
                        : getPubliclyAccessible().hashCode());
        return hashCode;
    }

    @Override
    public ReplicationInstance clone() {
        try {
            return (ReplicationInstance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
