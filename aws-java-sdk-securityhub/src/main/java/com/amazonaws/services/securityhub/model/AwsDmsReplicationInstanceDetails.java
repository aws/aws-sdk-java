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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about an Database Migration Service (DMS) replication instance. DMS uses a replication instance to
 * connect to your source data store, read the source data, and format the data for consumption by the target data
 * store.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsDmsReplicationInstanceDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsDmsReplicationInstanceDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The amount of storage (in gigabytes) that is allocated for the replication instance.
     * </p>
     */
    private Integer allocatedStorage;
    /**
     * <p>
     * Indicates whether minor engine upgrades are applied automatically to the replication instance during the
     * maintenance window.
     * </p>
     */
    private Boolean autoMinorVersionUpgrade;
    /**
     * <p>
     * The Availability Zone that the replication instance is created in. The default value is a random, system-chosen
     * Availability Zone in the endpoint's Amazon Web Services Region, such as <code>us-east-1d</code>.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The engine version number of the replication instance. If an engine version number is not specified when a
     * replication instance is created, the default is the latest engine version available.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * An KMS key identifier that is used to encrypt the data on the replication instance. If you don't specify a value
     * for the <code>KmsKeyId</code> parameter, DMS uses your default encryption key. KMS creates the default encryption
     * key for your Amazon Web Services account. Your Amazon Web Services account has a different default encryption key
     * for each Amazon Web Services Region.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * Specifies whether the replication instance is deployed across multiple Availability Zones (AZs). You can't set
     * the <code>AvailabilityZone</code> parameter if the <code>MultiAZ</code> parameter is set to <code>true</code>.
     * </p>
     */
    private Boolean multiAZ;
    /**
     * <p>
     * The maintenance window times for the replication instance. Upgrades to the replication instance are performed
     * during this time.
     * </p>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * Specifies the accessibility options for the replication instance. A value of <code>true</code> represents an
     * instance with a public IP address. A value of <code>false</code> represents an instance with a private IP
     * address. The default value is <code>true</code>.
     * </p>
     */
    private Boolean publiclyAccessible;
    /**
     * <p>
     * The compute and memory capacity of the replication instance as defined for the specified replication instance
     * class.
     * </p>
     */
    private String replicationInstanceClass;
    /**
     * <p>
     * The replication instance identifier.
     * </p>
     */
    private String replicationInstanceIdentifier;
    /**
     * <p>
     * The subnet group for the replication instance.
     * </p>
     */
    private AwsDmsReplicationInstanceReplicationSubnetGroupDetails replicationSubnetGroup;
    /**
     * <p>
     * The virtual private cloud (VPC) security group for the replication instance.
     * </p>
     */
    private java.util.List<AwsDmsReplicationInstanceVpcSecurityGroupsDetails> vpcSecurityGroups;

    /**
     * <p>
     * The amount of storage (in gigabytes) that is allocated for the replication instance.
     * </p>
     * 
     * @param allocatedStorage
     *        The amount of storage (in gigabytes) that is allocated for the replication instance.
     */

    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) that is allocated for the replication instance.
     * </p>
     * 
     * @return The amount of storage (in gigabytes) that is allocated for the replication instance.
     */

    public Integer getAllocatedStorage() {
        return this.allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) that is allocated for the replication instance.
     * </p>
     * 
     * @param allocatedStorage
     *        The amount of storage (in gigabytes) that is allocated for the replication instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDmsReplicationInstanceDetails withAllocatedStorage(Integer allocatedStorage) {
        setAllocatedStorage(allocatedStorage);
        return this;
    }

    /**
     * <p>
     * Indicates whether minor engine upgrades are applied automatically to the replication instance during the
     * maintenance window.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        Indicates whether minor engine upgrades are applied automatically to the replication instance during the
     *        maintenance window.
     */

    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Indicates whether minor engine upgrades are applied automatically to the replication instance during the
     * maintenance window.
     * </p>
     * 
     * @return Indicates whether minor engine upgrades are applied automatically to the replication instance during the
     *         maintenance window.
     */

    public Boolean getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Indicates whether minor engine upgrades are applied automatically to the replication instance during the
     * maintenance window.
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        Indicates whether minor engine upgrades are applied automatically to the replication instance during the
     *        maintenance window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDmsReplicationInstanceDetails withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        setAutoMinorVersionUpgrade(autoMinorVersionUpgrade);
        return this;
    }

    /**
     * <p>
     * Indicates whether minor engine upgrades are applied automatically to the replication instance during the
     * maintenance window.
     * </p>
     * 
     * @return Indicates whether minor engine upgrades are applied automatically to the replication instance during the
     *         maintenance window.
     */

    public Boolean isAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * The Availability Zone that the replication instance is created in. The default value is a random, system-chosen
     * Availability Zone in the endpoint's Amazon Web Services Region, such as <code>us-east-1d</code>.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone that the replication instance is created in. The default value is a random,
     *        system-chosen Availability Zone in the endpoint's Amazon Web Services Region, such as
     *        <code>us-east-1d</code>.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone that the replication instance is created in. The default value is a random, system-chosen
     * Availability Zone in the endpoint's Amazon Web Services Region, such as <code>us-east-1d</code>.
     * </p>
     * 
     * @return The Availability Zone that the replication instance is created in. The default value is a random,
     *         system-chosen Availability Zone in the endpoint's Amazon Web Services Region, such as
     *         <code>us-east-1d</code>.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone that the replication instance is created in. The default value is a random, system-chosen
     * Availability Zone in the endpoint's Amazon Web Services Region, such as <code>us-east-1d</code>.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone that the replication instance is created in. The default value is a random,
     *        system-chosen Availability Zone in the endpoint's Amazon Web Services Region, such as
     *        <code>us-east-1d</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDmsReplicationInstanceDetails withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The engine version number of the replication instance. If an engine version number is not specified when a
     * replication instance is created, the default is the latest engine version available.
     * </p>
     * 
     * @param engineVersion
     *        The engine version number of the replication instance. If an engine version number is not specified when a
     *        replication instance is created, the default is the latest engine version available.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The engine version number of the replication instance. If an engine version number is not specified when a
     * replication instance is created, the default is the latest engine version available.
     * </p>
     * 
     * @return The engine version number of the replication instance. If an engine version number is not specified when
     *         a replication instance is created, the default is the latest engine version available.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The engine version number of the replication instance. If an engine version number is not specified when a
     * replication instance is created, the default is the latest engine version available.
     * </p>
     * 
     * @param engineVersion
     *        The engine version number of the replication instance. If an engine version number is not specified when a
     *        replication instance is created, the default is the latest engine version available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDmsReplicationInstanceDetails withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * An KMS key identifier that is used to encrypt the data on the replication instance. If you don't specify a value
     * for the <code>KmsKeyId</code> parameter, DMS uses your default encryption key. KMS creates the default encryption
     * key for your Amazon Web Services account. Your Amazon Web Services account has a different default encryption key
     * for each Amazon Web Services Region.
     * </p>
     * 
     * @param kmsKeyId
     *        An KMS key identifier that is used to encrypt the data on the replication instance. If you don't specify a
     *        value for the <code>KmsKeyId</code> parameter, DMS uses your default encryption key. KMS creates the
     *        default encryption key for your Amazon Web Services account. Your Amazon Web Services account has a
     *        different default encryption key for each Amazon Web Services Region.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * An KMS key identifier that is used to encrypt the data on the replication instance. If you don't specify a value
     * for the <code>KmsKeyId</code> parameter, DMS uses your default encryption key. KMS creates the default encryption
     * key for your Amazon Web Services account. Your Amazon Web Services account has a different default encryption key
     * for each Amazon Web Services Region.
     * </p>
     * 
     * @return An KMS key identifier that is used to encrypt the data on the replication instance. If you don't specify
     *         a value for the <code>KmsKeyId</code> parameter, DMS uses your default encryption key. KMS creates the
     *         default encryption key for your Amazon Web Services account. Your Amazon Web Services account has a
     *         different default encryption key for each Amazon Web Services Region.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * An KMS key identifier that is used to encrypt the data on the replication instance. If you don't specify a value
     * for the <code>KmsKeyId</code> parameter, DMS uses your default encryption key. KMS creates the default encryption
     * key for your Amazon Web Services account. Your Amazon Web Services account has a different default encryption key
     * for each Amazon Web Services Region.
     * </p>
     * 
     * @param kmsKeyId
     *        An KMS key identifier that is used to encrypt the data on the replication instance. If you don't specify a
     *        value for the <code>KmsKeyId</code> parameter, DMS uses your default encryption key. KMS creates the
     *        default encryption key for your Amazon Web Services account. Your Amazon Web Services account has a
     *        different default encryption key for each Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDmsReplicationInstanceDetails withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * Specifies whether the replication instance is deployed across multiple Availability Zones (AZs). You can't set
     * the <code>AvailabilityZone</code> parameter if the <code>MultiAZ</code> parameter is set to <code>true</code>.
     * </p>
     * 
     * @param multiAZ
     *        Specifies whether the replication instance is deployed across multiple Availability Zones (AZs). You can't
     *        set the <code>AvailabilityZone</code> parameter if the <code>MultiAZ</code> parameter is set to
     *        <code>true</code>.
     */

    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }

    /**
     * <p>
     * Specifies whether the replication instance is deployed across multiple Availability Zones (AZs). You can't set
     * the <code>AvailabilityZone</code> parameter if the <code>MultiAZ</code> parameter is set to <code>true</code>.
     * </p>
     * 
     * @return Specifies whether the replication instance is deployed across multiple Availability Zones (AZs). You
     *         can't set the <code>AvailabilityZone</code> parameter if the <code>MultiAZ</code> parameter is set to
     *         <code>true</code>.
     */

    public Boolean getMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * Specifies whether the replication instance is deployed across multiple Availability Zones (AZs). You can't set
     * the <code>AvailabilityZone</code> parameter if the <code>MultiAZ</code> parameter is set to <code>true</code>.
     * </p>
     * 
     * @param multiAZ
     *        Specifies whether the replication instance is deployed across multiple Availability Zones (AZs). You can't
     *        set the <code>AvailabilityZone</code> parameter if the <code>MultiAZ</code> parameter is set to
     *        <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDmsReplicationInstanceDetails withMultiAZ(Boolean multiAZ) {
        setMultiAZ(multiAZ);
        return this;
    }

    /**
     * <p>
     * Specifies whether the replication instance is deployed across multiple Availability Zones (AZs). You can't set
     * the <code>AvailabilityZone</code> parameter if the <code>MultiAZ</code> parameter is set to <code>true</code>.
     * </p>
     * 
     * @return Specifies whether the replication instance is deployed across multiple Availability Zones (AZs). You
     *         can't set the <code>AvailabilityZone</code> parameter if the <code>MultiAZ</code> parameter is set to
     *         <code>true</code>.
     */

    public Boolean isMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * The maintenance window times for the replication instance. Upgrades to the replication instance are performed
     * during this time.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The maintenance window times for the replication instance. Upgrades to the replication instance are
     *        performed during this time.
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The maintenance window times for the replication instance. Upgrades to the replication instance are performed
     * during this time.
     * </p>
     * 
     * @return The maintenance window times for the replication instance. Upgrades to the replication instance are
     *         performed during this time.
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The maintenance window times for the replication instance. Upgrades to the replication instance are performed
     * during this time.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The maintenance window times for the replication instance. Upgrades to the replication instance are
     *        performed during this time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDmsReplicationInstanceDetails withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * Specifies the accessibility options for the replication instance. A value of <code>true</code> represents an
     * instance with a public IP address. A value of <code>false</code> represents an instance with a private IP
     * address. The default value is <code>true</code>.
     * </p>
     * 
     * @param publiclyAccessible
     *        Specifies the accessibility options for the replication instance. A value of <code>true</code> represents
     *        an instance with a public IP address. A value of <code>false</code> represents an instance with a private
     *        IP address. The default value is <code>true</code>.
     */

    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * Specifies the accessibility options for the replication instance. A value of <code>true</code> represents an
     * instance with a public IP address. A value of <code>false</code> represents an instance with a private IP
     * address. The default value is <code>true</code>.
     * </p>
     * 
     * @return Specifies the accessibility options for the replication instance. A value of <code>true</code> represents
     *         an instance with a public IP address. A value of <code>false</code> represents an instance with a private
     *         IP address. The default value is <code>true</code>.
     */

    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * Specifies the accessibility options for the replication instance. A value of <code>true</code> represents an
     * instance with a public IP address. A value of <code>false</code> represents an instance with a private IP
     * address. The default value is <code>true</code>.
     * </p>
     * 
     * @param publiclyAccessible
     *        Specifies the accessibility options for the replication instance. A value of <code>true</code> represents
     *        an instance with a public IP address. A value of <code>false</code> represents an instance with a private
     *        IP address. The default value is <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDmsReplicationInstanceDetails withPubliclyAccessible(Boolean publiclyAccessible) {
        setPubliclyAccessible(publiclyAccessible);
        return this;
    }

    /**
     * <p>
     * Specifies the accessibility options for the replication instance. A value of <code>true</code> represents an
     * instance with a public IP address. A value of <code>false</code> represents an instance with a private IP
     * address. The default value is <code>true</code>.
     * </p>
     * 
     * @return Specifies the accessibility options for the replication instance. A value of <code>true</code> represents
     *         an instance with a public IP address. A value of <code>false</code> represents an instance with a private
     *         IP address. The default value is <code>true</code>.
     */

    public Boolean isPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * The compute and memory capacity of the replication instance as defined for the specified replication instance
     * class.
     * </p>
     * 
     * @param replicationInstanceClass
     *        The compute and memory capacity of the replication instance as defined for the specified replication
     *        instance class.
     */

    public void setReplicationInstanceClass(String replicationInstanceClass) {
        this.replicationInstanceClass = replicationInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the replication instance as defined for the specified replication instance
     * class.
     * </p>
     * 
     * @return The compute and memory capacity of the replication instance as defined for the specified replication
     *         instance class.
     */

    public String getReplicationInstanceClass() {
        return this.replicationInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the replication instance as defined for the specified replication instance
     * class.
     * </p>
     * 
     * @param replicationInstanceClass
     *        The compute and memory capacity of the replication instance as defined for the specified replication
     *        instance class.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDmsReplicationInstanceDetails withReplicationInstanceClass(String replicationInstanceClass) {
        setReplicationInstanceClass(replicationInstanceClass);
        return this;
    }

    /**
     * <p>
     * The replication instance identifier.
     * </p>
     * 
     * @param replicationInstanceIdentifier
     *        The replication instance identifier.
     */

    public void setReplicationInstanceIdentifier(String replicationInstanceIdentifier) {
        this.replicationInstanceIdentifier = replicationInstanceIdentifier;
    }

    /**
     * <p>
     * The replication instance identifier.
     * </p>
     * 
     * @return The replication instance identifier.
     */

    public String getReplicationInstanceIdentifier() {
        return this.replicationInstanceIdentifier;
    }

    /**
     * <p>
     * The replication instance identifier.
     * </p>
     * 
     * @param replicationInstanceIdentifier
     *        The replication instance identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDmsReplicationInstanceDetails withReplicationInstanceIdentifier(String replicationInstanceIdentifier) {
        setReplicationInstanceIdentifier(replicationInstanceIdentifier);
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

    public void setReplicationSubnetGroup(AwsDmsReplicationInstanceReplicationSubnetGroupDetails replicationSubnetGroup) {
        this.replicationSubnetGroup = replicationSubnetGroup;
    }

    /**
     * <p>
     * The subnet group for the replication instance.
     * </p>
     * 
     * @return The subnet group for the replication instance.
     */

    public AwsDmsReplicationInstanceReplicationSubnetGroupDetails getReplicationSubnetGroup() {
        return this.replicationSubnetGroup;
    }

    /**
     * <p>
     * The subnet group for the replication instance.
     * </p>
     * 
     * @param replicationSubnetGroup
     *        The subnet group for the replication instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDmsReplicationInstanceDetails withReplicationSubnetGroup(AwsDmsReplicationInstanceReplicationSubnetGroupDetails replicationSubnetGroup) {
        setReplicationSubnetGroup(replicationSubnetGroup);
        return this;
    }

    /**
     * <p>
     * The virtual private cloud (VPC) security group for the replication instance.
     * </p>
     * 
     * @return The virtual private cloud (VPC) security group for the replication instance.
     */

    public java.util.List<AwsDmsReplicationInstanceVpcSecurityGroupsDetails> getVpcSecurityGroups() {
        return vpcSecurityGroups;
    }

    /**
     * <p>
     * The virtual private cloud (VPC) security group for the replication instance.
     * </p>
     * 
     * @param vpcSecurityGroups
     *        The virtual private cloud (VPC) security group for the replication instance.
     */

    public void setVpcSecurityGroups(java.util.Collection<AwsDmsReplicationInstanceVpcSecurityGroupsDetails> vpcSecurityGroups) {
        if (vpcSecurityGroups == null) {
            this.vpcSecurityGroups = null;
            return;
        }

        this.vpcSecurityGroups = new java.util.ArrayList<AwsDmsReplicationInstanceVpcSecurityGroupsDetails>(vpcSecurityGroups);
    }

    /**
     * <p>
     * The virtual private cloud (VPC) security group for the replication instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroups(java.util.Collection)} or {@link #withVpcSecurityGroups(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroups
     *        The virtual private cloud (VPC) security group for the replication instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDmsReplicationInstanceDetails withVpcSecurityGroups(AwsDmsReplicationInstanceVpcSecurityGroupsDetails... vpcSecurityGroups) {
        if (this.vpcSecurityGroups == null) {
            setVpcSecurityGroups(new java.util.ArrayList<AwsDmsReplicationInstanceVpcSecurityGroupsDetails>(vpcSecurityGroups.length));
        }
        for (AwsDmsReplicationInstanceVpcSecurityGroupsDetails ele : vpcSecurityGroups) {
            this.vpcSecurityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The virtual private cloud (VPC) security group for the replication instance.
     * </p>
     * 
     * @param vpcSecurityGroups
     *        The virtual private cloud (VPC) security group for the replication instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsDmsReplicationInstanceDetails withVpcSecurityGroups(java.util.Collection<AwsDmsReplicationInstanceVpcSecurityGroupsDetails> vpcSecurityGroups) {
        setVpcSecurityGroups(vpcSecurityGroups);
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
        if (getAllocatedStorage() != null)
            sb.append("AllocatedStorage: ").append(getAllocatedStorage()).append(",");
        if (getAutoMinorVersionUpgrade() != null)
            sb.append("AutoMinorVersionUpgrade: ").append(getAutoMinorVersionUpgrade()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getMultiAZ() != null)
            sb.append("MultiAZ: ").append(getMultiAZ()).append(",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: ").append(getPreferredMaintenanceWindow()).append(",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: ").append(getPubliclyAccessible()).append(",");
        if (getReplicationInstanceClass() != null)
            sb.append("ReplicationInstanceClass: ").append(getReplicationInstanceClass()).append(",");
        if (getReplicationInstanceIdentifier() != null)
            sb.append("ReplicationInstanceIdentifier: ").append(getReplicationInstanceIdentifier()).append(",");
        if (getReplicationSubnetGroup() != null)
            sb.append("ReplicationSubnetGroup: ").append(getReplicationSubnetGroup()).append(",");
        if (getVpcSecurityGroups() != null)
            sb.append("VpcSecurityGroups: ").append(getVpcSecurityGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsDmsReplicationInstanceDetails == false)
            return false;
        AwsDmsReplicationInstanceDetails other = (AwsDmsReplicationInstanceDetails) obj;
        if (other.getAllocatedStorage() == null ^ this.getAllocatedStorage() == null)
            return false;
        if (other.getAllocatedStorage() != null && other.getAllocatedStorage().equals(this.getAllocatedStorage()) == false)
            return false;
        if (other.getAutoMinorVersionUpgrade() == null ^ this.getAutoMinorVersionUpgrade() == null)
            return false;
        if (other.getAutoMinorVersionUpgrade() != null && other.getAutoMinorVersionUpgrade().equals(this.getAutoMinorVersionUpgrade()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getMultiAZ() == null ^ this.getMultiAZ() == null)
            return false;
        if (other.getMultiAZ() != null && other.getMultiAZ().equals(this.getMultiAZ()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getReplicationInstanceClass() == null ^ this.getReplicationInstanceClass() == null)
            return false;
        if (other.getReplicationInstanceClass() != null && other.getReplicationInstanceClass().equals(this.getReplicationInstanceClass()) == false)
            return false;
        if (other.getReplicationInstanceIdentifier() == null ^ this.getReplicationInstanceIdentifier() == null)
            return false;
        if (other.getReplicationInstanceIdentifier() != null
                && other.getReplicationInstanceIdentifier().equals(this.getReplicationInstanceIdentifier()) == false)
            return false;
        if (other.getReplicationSubnetGroup() == null ^ this.getReplicationSubnetGroup() == null)
            return false;
        if (other.getReplicationSubnetGroup() != null && other.getReplicationSubnetGroup().equals(this.getReplicationSubnetGroup()) == false)
            return false;
        if (other.getVpcSecurityGroups() == null ^ this.getVpcSecurityGroups() == null)
            return false;
        if (other.getVpcSecurityGroups() != null && other.getVpcSecurityGroups().equals(this.getVpcSecurityGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode());
        hashCode = prime * hashCode + ((getAutoMinorVersionUpgrade() == null) ? 0 : getAutoMinorVersionUpgrade().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getMultiAZ() == null) ? 0 : getMultiAZ().hashCode());
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode + ((getReplicationInstanceClass() == null) ? 0 : getReplicationInstanceClass().hashCode());
        hashCode = prime * hashCode + ((getReplicationInstanceIdentifier() == null) ? 0 : getReplicationInstanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getReplicationSubnetGroup() == null) ? 0 : getReplicationSubnetGroup().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroups() == null) ? 0 : getVpcSecurityGroups().hashCode());
        return hashCode;
    }

    @Override
    public AwsDmsReplicationInstanceDetails clone() {
        try {
            return (AwsDmsReplicationInstanceDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsDmsReplicationInstanceDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
