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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an Amazon RDS DB cluster snapshot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsRdsDbClusterSnapshotDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRdsDbClusterSnapshotDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of Availability Zones where instances in the DB cluster can be created.
     * </p>
     */
    private java.util.List<String> availabilityZones;
    /**
     * <p>
     * Indicates when the snapshot was taken.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     */
    private String snapshotCreateTime;
    /** <p/> */
    private String engine;
    /**
     * <p>
     * Specifies the allocated storage size in gibibytes (GiB).
     * </p>
     */
    private Integer allocatedStorage;
    /**
     * <p>
     * The status of this DB cluster snapshot.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The port number on which the DB instances in the DB cluster accept connections.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The VPC ID that is associated with the DB cluster snapshot.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * Indicates when the DB cluster was created, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     */
    private String clusterCreateTime;
    /**
     * <p>
     * The name of the master user for the DB cluster.
     * </p>
     */
    private String masterUsername;
    /**
     * <p>
     * The version of the database engine to use.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The license model information for this DB cluster snapshot.
     * </p>
     */
    private String licenseModel;
    /**
     * <p>
     * The type of DB cluster snapshot.
     * </p>
     */
    private String snapshotType;
    /**
     * <p>
     * Specifies the percentage of the estimated data that has been transferred.
     * </p>
     */
    private Integer percentProgress;
    /**
     * <p>
     * Whether the DB cluster is encrypted.
     * </p>
     */
    private Boolean storageEncrypted;
    /**
     * <p>
     * The ARN of the AWS KMS master key that is used to encrypt the database instances in the DB cluster.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The DB cluster identifier.
     * </p>
     */
    private String dbClusterIdentifier;
    /**
     * <p>
     * The identifier of the DB cluster snapshot.
     * </p>
     */
    private String dbClusterSnapshotIdentifier;
    /**
     * <p>
     * Whether mapping of IAM accounts to database accounts is enabled.
     * </p>
     */
    private Boolean iamDatabaseAuthenticationEnabled;

    /**
     * <p>
     * A list of Availability Zones where instances in the DB cluster can be created.
     * </p>
     * 
     * @return A list of Availability Zones where instances in the DB cluster can be created.
     */

    public java.util.List<String> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * <p>
     * A list of Availability Zones where instances in the DB cluster can be created.
     * </p>
     * 
     * @param availabilityZones
     *        A list of Availability Zones where instances in the DB cluster can be created.
     */

    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new java.util.ArrayList<String>(availabilityZones);
    }

    /**
     * <p>
     * A list of Availability Zones where instances in the DB cluster can be created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        A list of Availability Zones where instances in the DB cluster can be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterSnapshotDetails withAvailabilityZones(String... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new java.util.ArrayList<String>(availabilityZones.length));
        }
        for (String ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Availability Zones where instances in the DB cluster can be created.
     * </p>
     * 
     * @param availabilityZones
     *        A list of Availability Zones where instances in the DB cluster can be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterSnapshotDetails withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * Indicates when the snapshot was taken.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param snapshotCreateTime
     *        Indicates when the snapshot was taken.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public void setSnapshotCreateTime(String snapshotCreateTime) {
        this.snapshotCreateTime = snapshotCreateTime;
    }

    /**
     * <p>
     * Indicates when the snapshot was taken.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return Indicates when the snapshot was taken.</p>
     *         <p>
     *         Uses the <code>date-time</code> format specified in <a
     *         href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *         Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public String getSnapshotCreateTime() {
        return this.snapshotCreateTime;
    }

    /**
     * <p>
     * Indicates when the snapshot was taken.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param snapshotCreateTime
     *        Indicates when the snapshot was taken.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterSnapshotDetails withSnapshotCreateTime(String snapshotCreateTime) {
        setSnapshotCreateTime(snapshotCreateTime);
        return this;
    }

    /**
     * <p/>
     * 
     * @param engine
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p/>
     * 
     * @param engine
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterSnapshotDetails withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * Specifies the allocated storage size in gibibytes (GiB).
     * </p>
     * 
     * @param allocatedStorage
     *        Specifies the allocated storage size in gibibytes (GiB).
     */

    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * Specifies the allocated storage size in gibibytes (GiB).
     * </p>
     * 
     * @return Specifies the allocated storage size in gibibytes (GiB).
     */

    public Integer getAllocatedStorage() {
        return this.allocatedStorage;
    }

    /**
     * <p>
     * Specifies the allocated storage size in gibibytes (GiB).
     * </p>
     * 
     * @param allocatedStorage
     *        Specifies the allocated storage size in gibibytes (GiB).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterSnapshotDetails withAllocatedStorage(Integer allocatedStorage) {
        setAllocatedStorage(allocatedStorage);
        return this;
    }

    /**
     * <p>
     * The status of this DB cluster snapshot.
     * </p>
     * 
     * @param status
     *        The status of this DB cluster snapshot.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of this DB cluster snapshot.
     * </p>
     * 
     * @return The status of this DB cluster snapshot.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of this DB cluster snapshot.
     * </p>
     * 
     * @param status
     *        The status of this DB cluster snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterSnapshotDetails withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The port number on which the DB instances in the DB cluster accept connections.
     * </p>
     * 
     * @param port
     *        The port number on which the DB instances in the DB cluster accept connections.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port number on which the DB instances in the DB cluster accept connections.
     * </p>
     * 
     * @return The port number on which the DB instances in the DB cluster accept connections.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port number on which the DB instances in the DB cluster accept connections.
     * </p>
     * 
     * @param port
     *        The port number on which the DB instances in the DB cluster accept connections.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterSnapshotDetails withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The VPC ID that is associated with the DB cluster snapshot.
     * </p>
     * 
     * @param vpcId
     *        The VPC ID that is associated with the DB cluster snapshot.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The VPC ID that is associated with the DB cluster snapshot.
     * </p>
     * 
     * @return The VPC ID that is associated with the DB cluster snapshot.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The VPC ID that is associated with the DB cluster snapshot.
     * </p>
     * 
     * @param vpcId
     *        The VPC ID that is associated with the DB cluster snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterSnapshotDetails withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * Indicates when the DB cluster was created, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param clusterCreateTime
     *        Indicates when the DB cluster was created, in Universal Coordinated Time (UTC).</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public void setClusterCreateTime(String clusterCreateTime) {
        this.clusterCreateTime = clusterCreateTime;
    }

    /**
     * <p>
     * Indicates when the DB cluster was created, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return Indicates when the DB cluster was created, in Universal Coordinated Time (UTC).</p>
     *         <p>
     *         Uses the <code>date-time</code> format specified in <a
     *         href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *         Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public String getClusterCreateTime() {
        return this.clusterCreateTime;
    }

    /**
     * <p>
     * Indicates when the DB cluster was created, in Universal Coordinated Time (UTC).
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param clusterCreateTime
     *        Indicates when the DB cluster was created, in Universal Coordinated Time (UTC).</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterSnapshotDetails withClusterCreateTime(String clusterCreateTime) {
        setClusterCreateTime(clusterCreateTime);
        return this;
    }

    /**
     * <p>
     * The name of the master user for the DB cluster.
     * </p>
     * 
     * @param masterUsername
     *        The name of the master user for the DB cluster.
     */

    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }

    /**
     * <p>
     * The name of the master user for the DB cluster.
     * </p>
     * 
     * @return The name of the master user for the DB cluster.
     */

    public String getMasterUsername() {
        return this.masterUsername;
    }

    /**
     * <p>
     * The name of the master user for the DB cluster.
     * </p>
     * 
     * @param masterUsername
     *        The name of the master user for the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterSnapshotDetails withMasterUsername(String masterUsername) {
        setMasterUsername(masterUsername);
        return this;
    }

    /**
     * <p>
     * The version of the database engine to use.
     * </p>
     * 
     * @param engineVersion
     *        The version of the database engine to use.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version of the database engine to use.
     * </p>
     * 
     * @return The version of the database engine to use.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The version of the database engine to use.
     * </p>
     * 
     * @param engineVersion
     *        The version of the database engine to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterSnapshotDetails withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The license model information for this DB cluster snapshot.
     * </p>
     * 
     * @param licenseModel
     *        The license model information for this DB cluster snapshot.
     */

    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }

    /**
     * <p>
     * The license model information for this DB cluster snapshot.
     * </p>
     * 
     * @return The license model information for this DB cluster snapshot.
     */

    public String getLicenseModel() {
        return this.licenseModel;
    }

    /**
     * <p>
     * The license model information for this DB cluster snapshot.
     * </p>
     * 
     * @param licenseModel
     *        The license model information for this DB cluster snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterSnapshotDetails withLicenseModel(String licenseModel) {
        setLicenseModel(licenseModel);
        return this;
    }

    /**
     * <p>
     * The type of DB cluster snapshot.
     * </p>
     * 
     * @param snapshotType
     *        The type of DB cluster snapshot.
     */

    public void setSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
    }

    /**
     * <p>
     * The type of DB cluster snapshot.
     * </p>
     * 
     * @return The type of DB cluster snapshot.
     */

    public String getSnapshotType() {
        return this.snapshotType;
    }

    /**
     * <p>
     * The type of DB cluster snapshot.
     * </p>
     * 
     * @param snapshotType
     *        The type of DB cluster snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterSnapshotDetails withSnapshotType(String snapshotType) {
        setSnapshotType(snapshotType);
        return this;
    }

    /**
     * <p>
     * Specifies the percentage of the estimated data that has been transferred.
     * </p>
     * 
     * @param percentProgress
     *        Specifies the percentage of the estimated data that has been transferred.
     */

    public void setPercentProgress(Integer percentProgress) {
        this.percentProgress = percentProgress;
    }

    /**
     * <p>
     * Specifies the percentage of the estimated data that has been transferred.
     * </p>
     * 
     * @return Specifies the percentage of the estimated data that has been transferred.
     */

    public Integer getPercentProgress() {
        return this.percentProgress;
    }

    /**
     * <p>
     * Specifies the percentage of the estimated data that has been transferred.
     * </p>
     * 
     * @param percentProgress
     *        Specifies the percentage of the estimated data that has been transferred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterSnapshotDetails withPercentProgress(Integer percentProgress) {
        setPercentProgress(percentProgress);
        return this;
    }

    /**
     * <p>
     * Whether the DB cluster is encrypted.
     * </p>
     * 
     * @param storageEncrypted
     *        Whether the DB cluster is encrypted.
     */

    public void setStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
    }

    /**
     * <p>
     * Whether the DB cluster is encrypted.
     * </p>
     * 
     * @return Whether the DB cluster is encrypted.
     */

    public Boolean getStorageEncrypted() {
        return this.storageEncrypted;
    }

    /**
     * <p>
     * Whether the DB cluster is encrypted.
     * </p>
     * 
     * @param storageEncrypted
     *        Whether the DB cluster is encrypted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterSnapshotDetails withStorageEncrypted(Boolean storageEncrypted) {
        setStorageEncrypted(storageEncrypted);
        return this;
    }

    /**
     * <p>
     * Whether the DB cluster is encrypted.
     * </p>
     * 
     * @return Whether the DB cluster is encrypted.
     */

    public Boolean isStorageEncrypted() {
        return this.storageEncrypted;
    }

    /**
     * <p>
     * The ARN of the AWS KMS master key that is used to encrypt the database instances in the DB cluster.
     * </p>
     * 
     * @param kmsKeyId
     *        The ARN of the AWS KMS master key that is used to encrypt the database instances in the DB cluster.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ARN of the AWS KMS master key that is used to encrypt the database instances in the DB cluster.
     * </p>
     * 
     * @return The ARN of the AWS KMS master key that is used to encrypt the database instances in the DB cluster.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The ARN of the AWS KMS master key that is used to encrypt the database instances in the DB cluster.
     * </p>
     * 
     * @param kmsKeyId
     *        The ARN of the AWS KMS master key that is used to encrypt the database instances in the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterSnapshotDetails withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The DB cluster identifier.
     * </p>
     * 
     * @param dbClusterIdentifier
     *        The DB cluster identifier.
     */

    public void setDbClusterIdentifier(String dbClusterIdentifier) {
        this.dbClusterIdentifier = dbClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier.
     * </p>
     * 
     * @return The DB cluster identifier.
     */

    public String getDbClusterIdentifier() {
        return this.dbClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier.
     * </p>
     * 
     * @param dbClusterIdentifier
     *        The DB cluster identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterSnapshotDetails withDbClusterIdentifier(String dbClusterIdentifier) {
        setDbClusterIdentifier(dbClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier of the DB cluster snapshot.
     * </p>
     * 
     * @param dbClusterSnapshotIdentifier
     *        The identifier of the DB cluster snapshot.
     */

    public void setDbClusterSnapshotIdentifier(String dbClusterSnapshotIdentifier) {
        this.dbClusterSnapshotIdentifier = dbClusterSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the DB cluster snapshot.
     * </p>
     * 
     * @return The identifier of the DB cluster snapshot.
     */

    public String getDbClusterSnapshotIdentifier() {
        return this.dbClusterSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the DB cluster snapshot.
     * </p>
     * 
     * @param dbClusterSnapshotIdentifier
     *        The identifier of the DB cluster snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterSnapshotDetails withDbClusterSnapshotIdentifier(String dbClusterSnapshotIdentifier) {
        setDbClusterSnapshotIdentifier(dbClusterSnapshotIdentifier);
        return this;
    }

    /**
     * <p>
     * Whether mapping of IAM accounts to database accounts is enabled.
     * </p>
     * 
     * @param iamDatabaseAuthenticationEnabled
     *        Whether mapping of IAM accounts to database accounts is enabled.
     */

    public void setIamDatabaseAuthenticationEnabled(Boolean iamDatabaseAuthenticationEnabled) {
        this.iamDatabaseAuthenticationEnabled = iamDatabaseAuthenticationEnabled;
    }

    /**
     * <p>
     * Whether mapping of IAM accounts to database accounts is enabled.
     * </p>
     * 
     * @return Whether mapping of IAM accounts to database accounts is enabled.
     */

    public Boolean getIamDatabaseAuthenticationEnabled() {
        return this.iamDatabaseAuthenticationEnabled;
    }

    /**
     * <p>
     * Whether mapping of IAM accounts to database accounts is enabled.
     * </p>
     * 
     * @param iamDatabaseAuthenticationEnabled
     *        Whether mapping of IAM accounts to database accounts is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbClusterSnapshotDetails withIamDatabaseAuthenticationEnabled(Boolean iamDatabaseAuthenticationEnabled) {
        setIamDatabaseAuthenticationEnabled(iamDatabaseAuthenticationEnabled);
        return this;
    }

    /**
     * <p>
     * Whether mapping of IAM accounts to database accounts is enabled.
     * </p>
     * 
     * @return Whether mapping of IAM accounts to database accounts is enabled.
     */

    public Boolean isIamDatabaseAuthenticationEnabled() {
        return this.iamDatabaseAuthenticationEnabled;
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
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: ").append(getAvailabilityZones()).append(",");
        if (getSnapshotCreateTime() != null)
            sb.append("SnapshotCreateTime: ").append(getSnapshotCreateTime()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getAllocatedStorage() != null)
            sb.append("AllocatedStorage: ").append(getAllocatedStorage()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getClusterCreateTime() != null)
            sb.append("ClusterCreateTime: ").append(getClusterCreateTime()).append(",");
        if (getMasterUsername() != null)
            sb.append("MasterUsername: ").append(getMasterUsername()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getLicenseModel() != null)
            sb.append("LicenseModel: ").append(getLicenseModel()).append(",");
        if (getSnapshotType() != null)
            sb.append("SnapshotType: ").append(getSnapshotType()).append(",");
        if (getPercentProgress() != null)
            sb.append("PercentProgress: ").append(getPercentProgress()).append(",");
        if (getStorageEncrypted() != null)
            sb.append("StorageEncrypted: ").append(getStorageEncrypted()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getDbClusterIdentifier() != null)
            sb.append("DbClusterIdentifier: ").append(getDbClusterIdentifier()).append(",");
        if (getDbClusterSnapshotIdentifier() != null)
            sb.append("DbClusterSnapshotIdentifier: ").append(getDbClusterSnapshotIdentifier()).append(",");
        if (getIamDatabaseAuthenticationEnabled() != null)
            sb.append("IamDatabaseAuthenticationEnabled: ").append(getIamDatabaseAuthenticationEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsRdsDbClusterSnapshotDetails == false)
            return false;
        AwsRdsDbClusterSnapshotDetails other = (AwsRdsDbClusterSnapshotDetails) obj;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getSnapshotCreateTime() == null ^ this.getSnapshotCreateTime() == null)
            return false;
        if (other.getSnapshotCreateTime() != null && other.getSnapshotCreateTime().equals(this.getSnapshotCreateTime()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getAllocatedStorage() == null ^ this.getAllocatedStorage() == null)
            return false;
        if (other.getAllocatedStorage() != null && other.getAllocatedStorage().equals(this.getAllocatedStorage()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getClusterCreateTime() == null ^ this.getClusterCreateTime() == null)
            return false;
        if (other.getClusterCreateTime() != null && other.getClusterCreateTime().equals(this.getClusterCreateTime()) == false)
            return false;
        if (other.getMasterUsername() == null ^ this.getMasterUsername() == null)
            return false;
        if (other.getMasterUsername() != null && other.getMasterUsername().equals(this.getMasterUsername()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getLicenseModel() == null ^ this.getLicenseModel() == null)
            return false;
        if (other.getLicenseModel() != null && other.getLicenseModel().equals(this.getLicenseModel()) == false)
            return false;
        if (other.getSnapshotType() == null ^ this.getSnapshotType() == null)
            return false;
        if (other.getSnapshotType() != null && other.getSnapshotType().equals(this.getSnapshotType()) == false)
            return false;
        if (other.getPercentProgress() == null ^ this.getPercentProgress() == null)
            return false;
        if (other.getPercentProgress() != null && other.getPercentProgress().equals(this.getPercentProgress()) == false)
            return false;
        if (other.getStorageEncrypted() == null ^ this.getStorageEncrypted() == null)
            return false;
        if (other.getStorageEncrypted() != null && other.getStorageEncrypted().equals(this.getStorageEncrypted()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getDbClusterIdentifier() == null ^ this.getDbClusterIdentifier() == null)
            return false;
        if (other.getDbClusterIdentifier() != null && other.getDbClusterIdentifier().equals(this.getDbClusterIdentifier()) == false)
            return false;
        if (other.getDbClusterSnapshotIdentifier() == null ^ this.getDbClusterSnapshotIdentifier() == null)
            return false;
        if (other.getDbClusterSnapshotIdentifier() != null && other.getDbClusterSnapshotIdentifier().equals(this.getDbClusterSnapshotIdentifier()) == false)
            return false;
        if (other.getIamDatabaseAuthenticationEnabled() == null ^ this.getIamDatabaseAuthenticationEnabled() == null)
            return false;
        if (other.getIamDatabaseAuthenticationEnabled() != null
                && other.getIamDatabaseAuthenticationEnabled().equals(this.getIamDatabaseAuthenticationEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode + ((getSnapshotCreateTime() == null) ? 0 : getSnapshotCreateTime().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getClusterCreateTime() == null) ? 0 : getClusterCreateTime().hashCode());
        hashCode = prime * hashCode + ((getMasterUsername() == null) ? 0 : getMasterUsername().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getLicenseModel() == null) ? 0 : getLicenseModel().hashCode());
        hashCode = prime * hashCode + ((getSnapshotType() == null) ? 0 : getSnapshotType().hashCode());
        hashCode = prime * hashCode + ((getPercentProgress() == null) ? 0 : getPercentProgress().hashCode());
        hashCode = prime * hashCode + ((getStorageEncrypted() == null) ? 0 : getStorageEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getDbClusterIdentifier() == null) ? 0 : getDbClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDbClusterSnapshotIdentifier() == null) ? 0 : getDbClusterSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode + ((getIamDatabaseAuthenticationEnabled() == null) ? 0 : getIamDatabaseAuthenticationEnabled().hashCode());
        return hashCode;
    }

    @Override
    public AwsRdsDbClusterSnapshotDetails clone() {
        try {
            return (AwsRdsDbClusterSnapshotDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsRdsDbClusterSnapshotDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
