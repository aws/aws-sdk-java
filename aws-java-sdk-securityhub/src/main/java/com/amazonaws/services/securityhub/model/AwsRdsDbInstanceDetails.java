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
 * Contains the details of an Amazon RDS DB instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsRdsDbInstanceDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRdsDbInstanceDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) roles associated with the DB instance.
     * </p>
     */
    private java.util.List<AwsRdsDbInstanceAssociatedRole> associatedRoles;
    /**
     * <p>
     * The identifier of the CA certificate for this DB instance.
     * </p>
     */
    private String cACertificateIdentifier;
    /**
     * <p>
     * If the DB instance is a member of a DB cluster, contains the name of the DB cluster that the DB instance is a
     * member of.
     * </p>
     */
    private String dBClusterIdentifier;
    /**
     * <p>
     * Contains a user-supplied database identifier. This identifier is the unique key that identifies a DB instance.
     * </p>
     */
    private String dBInstanceIdentifier;
    /**
     * <p>
     * Contains the name of the compute and memory capacity class of the DB instance.
     * </p>
     */
    private String dBInstanceClass;
    /**
     * <p>
     * Specifies the port that the DB instance listens on. If the DB instance is part of a DB cluster, this can be a
     * different port than the DB cluster port.
     * </p>
     */
    private Integer dbInstancePort;
    /**
     * <p>
     * The AWS Region-unique, immutable identifier for the DB instance. This identifier is found in AWS CloudTrail log
     * entries whenever the AWS KMS key for the DB instance is accessed.
     * </p>
     */
    private String dbiResourceId;
    /**
     * <p>
     * The meaning of this parameter differs according to the database engine you use.
     * </p>
     * <p>
     * <b>MySQL, MariaDB, SQL Server, PostgreSQL</b>
     * </p>
     * <p>
     * Contains the name of the initial database of this instance that was provided at create time, if one was specified
     * when the DB instance was created. This same name is returned for the life of the DB instance.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Contains the Oracle System ID (SID) of the created DB instance. Not shown when the returned parameters do not
     * apply to an Oracle DB instance.
     * </p>
     */
    private String dBName;
    /**
     * <p>
     * Indicates whether the DB instance has deletion protection enabled.
     * </p>
     * <p>
     * When deletion protection is enabled, the database cannot be deleted.
     * </p>
     */
    private Boolean deletionProtection;
    /**
     * <p>
     * Specifies the connection endpoint.
     * </p>
     */
    private AwsRdsDbInstanceEndpoint endpoint;
    /**
     * <p>
     * Provides the name of the database engine to use for this DB instance.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * Indicates the database engine version.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     * otherwise false.
     * </p>
     * <p>
     * IAM database authentication can be enabled for the following database engines.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For MySQL 5.6, minor version 5.6.34 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * For MySQL 5.7, minor version 5.7.16 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora 5.6 or higher
     * </p>
     * </li>
     * </ul>
     */
    private Boolean iAMDatabaseAuthenticationEnabled;
    /**
     * <p>
     * Provides the date and time the DB instance was created.
     * </p>
     */
    private String instanceCreateTime;
    /**
     * <p>
     * If <code>StorageEncrypted</code> is true, the AWS KMS key identifier for the encrypted DB instance.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * Specifies the accessibility options for the DB instance.
     * </p>
     * <p>
     * A value of true specifies an Internet-facing instance with a publicly resolvable DNS name, which resolves to a
     * public IP address.
     * </p>
     * <p>
     * A value of false specifies an internal instance with a DNS name that resolves to a private IP address.
     * </p>
     */
    private Boolean publiclyAccessible;
    /**
     * <p>
     * Specifies whether the DB instance is encrypted.
     * </p>
     */
    private Boolean storageEncrypted;
    /**
     * <p>
     * The ARN from the key store with which the instance is associated for TDE encryption.
     * </p>
     */
    private String tdeCredentialArn;
    /**
     * <p>
     * A list of VPC security groups that the DB instance belongs to.
     * </p>
     */
    private java.util.List<AwsRdsDbInstanceVpcSecurityGroup> vpcSecurityGroups;

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) roles associated with the DB instance.
     * </p>
     * 
     * @return The AWS Identity and Access Management (IAM) roles associated with the DB instance.
     */

    public java.util.List<AwsRdsDbInstanceAssociatedRole> getAssociatedRoles() {
        return associatedRoles;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) roles associated with the DB instance.
     * </p>
     * 
     * @param associatedRoles
     *        The AWS Identity and Access Management (IAM) roles associated with the DB instance.
     */

    public void setAssociatedRoles(java.util.Collection<AwsRdsDbInstanceAssociatedRole> associatedRoles) {
        if (associatedRoles == null) {
            this.associatedRoles = null;
            return;
        }

        this.associatedRoles = new java.util.ArrayList<AwsRdsDbInstanceAssociatedRole>(associatedRoles);
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) roles associated with the DB instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssociatedRoles(java.util.Collection)} or {@link #withAssociatedRoles(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param associatedRoles
     *        The AWS Identity and Access Management (IAM) roles associated with the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withAssociatedRoles(AwsRdsDbInstanceAssociatedRole... associatedRoles) {
        if (this.associatedRoles == null) {
            setAssociatedRoles(new java.util.ArrayList<AwsRdsDbInstanceAssociatedRole>(associatedRoles.length));
        }
        for (AwsRdsDbInstanceAssociatedRole ele : associatedRoles) {
            this.associatedRoles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The AWS Identity and Access Management (IAM) roles associated with the DB instance.
     * </p>
     * 
     * @param associatedRoles
     *        The AWS Identity and Access Management (IAM) roles associated with the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withAssociatedRoles(java.util.Collection<AwsRdsDbInstanceAssociatedRole> associatedRoles) {
        setAssociatedRoles(associatedRoles);
        return this;
    }

    /**
     * <p>
     * The identifier of the CA certificate for this DB instance.
     * </p>
     * 
     * @param cACertificateIdentifier
     *        The identifier of the CA certificate for this DB instance.
     */

    public void setCACertificateIdentifier(String cACertificateIdentifier) {
        this.cACertificateIdentifier = cACertificateIdentifier;
    }

    /**
     * <p>
     * The identifier of the CA certificate for this DB instance.
     * </p>
     * 
     * @return The identifier of the CA certificate for this DB instance.
     */

    public String getCACertificateIdentifier() {
        return this.cACertificateIdentifier;
    }

    /**
     * <p>
     * The identifier of the CA certificate for this DB instance.
     * </p>
     * 
     * @param cACertificateIdentifier
     *        The identifier of the CA certificate for this DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withCACertificateIdentifier(String cACertificateIdentifier) {
        setCACertificateIdentifier(cACertificateIdentifier);
        return this;
    }

    /**
     * <p>
     * If the DB instance is a member of a DB cluster, contains the name of the DB cluster that the DB instance is a
     * member of.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        If the DB instance is a member of a DB cluster, contains the name of the DB cluster that the DB instance
     *        is a member of.
     */

    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * If the DB instance is a member of a DB cluster, contains the name of the DB cluster that the DB instance is a
     * member of.
     * </p>
     * 
     * @return If the DB instance is a member of a DB cluster, contains the name of the DB cluster that the DB instance
     *         is a member of.
     */

    public String getDBClusterIdentifier() {
        return this.dBClusterIdentifier;
    }

    /**
     * <p>
     * If the DB instance is a member of a DB cluster, contains the name of the DB cluster that the DB instance is a
     * member of.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        If the DB instance is a member of a DB cluster, contains the name of the DB cluster that the DB instance
     *        is a member of.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withDBClusterIdentifier(String dBClusterIdentifier) {
        setDBClusterIdentifier(dBClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * Contains a user-supplied database identifier. This identifier is the unique key that identifies a DB instance.
     * </p>
     * 
     * @param dBInstanceIdentifier
     *        Contains a user-supplied database identifier. This identifier is the unique key that identifies a DB
     *        instance.
     */

    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * Contains a user-supplied database identifier. This identifier is the unique key that identifies a DB instance.
     * </p>
     * 
     * @return Contains a user-supplied database identifier. This identifier is the unique key that identifies a DB
     *         instance.
     */

    public String getDBInstanceIdentifier() {
        return this.dBInstanceIdentifier;
    }

    /**
     * <p>
     * Contains a user-supplied database identifier. This identifier is the unique key that identifies a DB instance.
     * </p>
     * 
     * @param dBInstanceIdentifier
     *        Contains a user-supplied database identifier. This identifier is the unique key that identifies a DB
     *        instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withDBInstanceIdentifier(String dBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * Contains the name of the compute and memory capacity class of the DB instance.
     * </p>
     * 
     * @param dBInstanceClass
     *        Contains the name of the compute and memory capacity class of the DB instance.
     */

    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }

    /**
     * <p>
     * Contains the name of the compute and memory capacity class of the DB instance.
     * </p>
     * 
     * @return Contains the name of the compute and memory capacity class of the DB instance.
     */

    public String getDBInstanceClass() {
        return this.dBInstanceClass;
    }

    /**
     * <p>
     * Contains the name of the compute and memory capacity class of the DB instance.
     * </p>
     * 
     * @param dBInstanceClass
     *        Contains the name of the compute and memory capacity class of the DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withDBInstanceClass(String dBInstanceClass) {
        setDBInstanceClass(dBInstanceClass);
        return this;
    }

    /**
     * <p>
     * Specifies the port that the DB instance listens on. If the DB instance is part of a DB cluster, this can be a
     * different port than the DB cluster port.
     * </p>
     * 
     * @param dbInstancePort
     *        Specifies the port that the DB instance listens on. If the DB instance is part of a DB cluster, this can
     *        be a different port than the DB cluster port.
     */

    public void setDbInstancePort(Integer dbInstancePort) {
        this.dbInstancePort = dbInstancePort;
    }

    /**
     * <p>
     * Specifies the port that the DB instance listens on. If the DB instance is part of a DB cluster, this can be a
     * different port than the DB cluster port.
     * </p>
     * 
     * @return Specifies the port that the DB instance listens on. If the DB instance is part of a DB cluster, this can
     *         be a different port than the DB cluster port.
     */

    public Integer getDbInstancePort() {
        return this.dbInstancePort;
    }

    /**
     * <p>
     * Specifies the port that the DB instance listens on. If the DB instance is part of a DB cluster, this can be a
     * different port than the DB cluster port.
     * </p>
     * 
     * @param dbInstancePort
     *        Specifies the port that the DB instance listens on. If the DB instance is part of a DB cluster, this can
     *        be a different port than the DB cluster port.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withDbInstancePort(Integer dbInstancePort) {
        setDbInstancePort(dbInstancePort);
        return this;
    }

    /**
     * <p>
     * The AWS Region-unique, immutable identifier for the DB instance. This identifier is found in AWS CloudTrail log
     * entries whenever the AWS KMS key for the DB instance is accessed.
     * </p>
     * 
     * @param dbiResourceId
     *        The AWS Region-unique, immutable identifier for the DB instance. This identifier is found in AWS
     *        CloudTrail log entries whenever the AWS KMS key for the DB instance is accessed.
     */

    public void setDbiResourceId(String dbiResourceId) {
        this.dbiResourceId = dbiResourceId;
    }

    /**
     * <p>
     * The AWS Region-unique, immutable identifier for the DB instance. This identifier is found in AWS CloudTrail log
     * entries whenever the AWS KMS key for the DB instance is accessed.
     * </p>
     * 
     * @return The AWS Region-unique, immutable identifier for the DB instance. This identifier is found in AWS
     *         CloudTrail log entries whenever the AWS KMS key for the DB instance is accessed.
     */

    public String getDbiResourceId() {
        return this.dbiResourceId;
    }

    /**
     * <p>
     * The AWS Region-unique, immutable identifier for the DB instance. This identifier is found in AWS CloudTrail log
     * entries whenever the AWS KMS key for the DB instance is accessed.
     * </p>
     * 
     * @param dbiResourceId
     *        The AWS Region-unique, immutable identifier for the DB instance. This identifier is found in AWS
     *        CloudTrail log entries whenever the AWS KMS key for the DB instance is accessed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withDbiResourceId(String dbiResourceId) {
        setDbiResourceId(dbiResourceId);
        return this;
    }

    /**
     * <p>
     * The meaning of this parameter differs according to the database engine you use.
     * </p>
     * <p>
     * <b>MySQL, MariaDB, SQL Server, PostgreSQL</b>
     * </p>
     * <p>
     * Contains the name of the initial database of this instance that was provided at create time, if one was specified
     * when the DB instance was created. This same name is returned for the life of the DB instance.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Contains the Oracle System ID (SID) of the created DB instance. Not shown when the returned parameters do not
     * apply to an Oracle DB instance.
     * </p>
     * 
     * @param dBName
     *        The meaning of this parameter differs according to the database engine you use.</p>
     *        <p>
     *        <b>MySQL, MariaDB, SQL Server, PostgreSQL</b>
     *        </p>
     *        <p>
     *        Contains the name of the initial database of this instance that was provided at create time, if one was
     *        specified when the DB instance was created. This same name is returned for the life of the DB instance.
     *        </p>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        Contains the Oracle System ID (SID) of the created DB instance. Not shown when the returned parameters do
     *        not apply to an Oracle DB instance.
     */

    public void setDBName(String dBName) {
        this.dBName = dBName;
    }

    /**
     * <p>
     * The meaning of this parameter differs according to the database engine you use.
     * </p>
     * <p>
     * <b>MySQL, MariaDB, SQL Server, PostgreSQL</b>
     * </p>
     * <p>
     * Contains the name of the initial database of this instance that was provided at create time, if one was specified
     * when the DB instance was created. This same name is returned for the life of the DB instance.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Contains the Oracle System ID (SID) of the created DB instance. Not shown when the returned parameters do not
     * apply to an Oracle DB instance.
     * </p>
     * 
     * @return The meaning of this parameter differs according to the database engine you use.</p>
     *         <p>
     *         <b>MySQL, MariaDB, SQL Server, PostgreSQL</b>
     *         </p>
     *         <p>
     *         Contains the name of the initial database of this instance that was provided at create time, if one was
     *         specified when the DB instance was created. This same name is returned for the life of the DB instance.
     *         </p>
     *         <p>
     *         <b>Oracle</b>
     *         </p>
     *         <p>
     *         Contains the Oracle System ID (SID) of the created DB instance. Not shown when the returned parameters do
     *         not apply to an Oracle DB instance.
     */

    public String getDBName() {
        return this.dBName;
    }

    /**
     * <p>
     * The meaning of this parameter differs according to the database engine you use.
     * </p>
     * <p>
     * <b>MySQL, MariaDB, SQL Server, PostgreSQL</b>
     * </p>
     * <p>
     * Contains the name of the initial database of this instance that was provided at create time, if one was specified
     * when the DB instance was created. This same name is returned for the life of the DB instance.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Contains the Oracle System ID (SID) of the created DB instance. Not shown when the returned parameters do not
     * apply to an Oracle DB instance.
     * </p>
     * 
     * @param dBName
     *        The meaning of this parameter differs according to the database engine you use.</p>
     *        <p>
     *        <b>MySQL, MariaDB, SQL Server, PostgreSQL</b>
     *        </p>
     *        <p>
     *        Contains the name of the initial database of this instance that was provided at create time, if one was
     *        specified when the DB instance was created. This same name is returned for the life of the DB instance.
     *        </p>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        Contains the Oracle System ID (SID) of the created DB instance. Not shown when the returned parameters do
     *        not apply to an Oracle DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withDBName(String dBName) {
        setDBName(dBName);
        return this;
    }

    /**
     * <p>
     * Indicates whether the DB instance has deletion protection enabled.
     * </p>
     * <p>
     * When deletion protection is enabled, the database cannot be deleted.
     * </p>
     * 
     * @param deletionProtection
     *        Indicates whether the DB instance has deletion protection enabled.</p>
     *        <p>
     *        When deletion protection is enabled, the database cannot be deleted.
     */

    public void setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
    }

    /**
     * <p>
     * Indicates whether the DB instance has deletion protection enabled.
     * </p>
     * <p>
     * When deletion protection is enabled, the database cannot be deleted.
     * </p>
     * 
     * @return Indicates whether the DB instance has deletion protection enabled.</p>
     *         <p>
     *         When deletion protection is enabled, the database cannot be deleted.
     */

    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * Indicates whether the DB instance has deletion protection enabled.
     * </p>
     * <p>
     * When deletion protection is enabled, the database cannot be deleted.
     * </p>
     * 
     * @param deletionProtection
     *        Indicates whether the DB instance has deletion protection enabled.</p>
     *        <p>
     *        When deletion protection is enabled, the database cannot be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withDeletionProtection(Boolean deletionProtection) {
        setDeletionProtection(deletionProtection);
        return this;
    }

    /**
     * <p>
     * Indicates whether the DB instance has deletion protection enabled.
     * </p>
     * <p>
     * When deletion protection is enabled, the database cannot be deleted.
     * </p>
     * 
     * @return Indicates whether the DB instance has deletion protection enabled.</p>
     *         <p>
     *         When deletion protection is enabled, the database cannot be deleted.
     */

    public Boolean isDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * Specifies the connection endpoint.
     * </p>
     * 
     * @param endpoint
     *        Specifies the connection endpoint.
     */

    public void setEndpoint(AwsRdsDbInstanceEndpoint endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * Specifies the connection endpoint.
     * </p>
     * 
     * @return Specifies the connection endpoint.
     */

    public AwsRdsDbInstanceEndpoint getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * Specifies the connection endpoint.
     * </p>
     * 
     * @param endpoint
     *        Specifies the connection endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withEndpoint(AwsRdsDbInstanceEndpoint endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * Provides the name of the database engine to use for this DB instance.
     * </p>
     * 
     * @param engine
     *        Provides the name of the database engine to use for this DB instance.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * Provides the name of the database engine to use for this DB instance.
     * </p>
     * 
     * @return Provides the name of the database engine to use for this DB instance.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * Provides the name of the database engine to use for this DB instance.
     * </p>
     * 
     * @param engine
     *        Provides the name of the database engine to use for this DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * Indicates the database engine version.
     * </p>
     * 
     * @param engineVersion
     *        Indicates the database engine version.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * Indicates the database engine version.
     * </p>
     * 
     * @return Indicates the database engine version.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * Indicates the database engine version.
     * </p>
     * 
     * @param engineVersion
     *        Indicates the database engine version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     * otherwise false.
     * </p>
     * <p>
     * IAM database authentication can be enabled for the following database engines.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For MySQL 5.6, minor version 5.6.34 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * For MySQL 5.7, minor version 5.7.16 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora 5.6 or higher
     * </p>
     * </li>
     * </ul>
     * 
     * @param iAMDatabaseAuthenticationEnabled
     *        True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     *        otherwise false.</p>
     *        <p>
     *        IAM database authentication can be enabled for the following database engines.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For MySQL 5.6, minor version 5.6.34 or higher
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For MySQL 5.7, minor version 5.7.16 or higher
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Aurora 5.6 or higher
     *        </p>
     *        </li>
     */

    public void setIAMDatabaseAuthenticationEnabled(Boolean iAMDatabaseAuthenticationEnabled) {
        this.iAMDatabaseAuthenticationEnabled = iAMDatabaseAuthenticationEnabled;
    }

    /**
     * <p>
     * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     * otherwise false.
     * </p>
     * <p>
     * IAM database authentication can be enabled for the following database engines.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For MySQL 5.6, minor version 5.6.34 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * For MySQL 5.7, minor version 5.7.16 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora 5.6 or higher
     * </p>
     * </li>
     * </ul>
     * 
     * @return True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     *         otherwise false.</p>
     *         <p>
     *         IAM database authentication can be enabled for the following database engines.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For MySQL 5.6, minor version 5.6.34 or higher
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For MySQL 5.7, minor version 5.7.16 or higher
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Aurora 5.6 or higher
     *         </p>
     *         </li>
     */

    public Boolean getIAMDatabaseAuthenticationEnabled() {
        return this.iAMDatabaseAuthenticationEnabled;
    }

    /**
     * <p>
     * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     * otherwise false.
     * </p>
     * <p>
     * IAM database authentication can be enabled for the following database engines.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For MySQL 5.6, minor version 5.6.34 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * For MySQL 5.7, minor version 5.7.16 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora 5.6 or higher
     * </p>
     * </li>
     * </ul>
     * 
     * @param iAMDatabaseAuthenticationEnabled
     *        True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     *        otherwise false.</p>
     *        <p>
     *        IAM database authentication can be enabled for the following database engines.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For MySQL 5.6, minor version 5.6.34 or higher
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For MySQL 5.7, minor version 5.7.16 or higher
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Aurora 5.6 or higher
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withIAMDatabaseAuthenticationEnabled(Boolean iAMDatabaseAuthenticationEnabled) {
        setIAMDatabaseAuthenticationEnabled(iAMDatabaseAuthenticationEnabled);
        return this;
    }

    /**
     * <p>
     * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     * otherwise false.
     * </p>
     * <p>
     * IAM database authentication can be enabled for the following database engines.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For MySQL 5.6, minor version 5.6.34 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * For MySQL 5.7, minor version 5.7.16 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * Aurora 5.6 or higher
     * </p>
     * </li>
     * </ul>
     * 
     * @return True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and
     *         otherwise false.</p>
     *         <p>
     *         IAM database authentication can be enabled for the following database engines.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For MySQL 5.6, minor version 5.6.34 or higher
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For MySQL 5.7, minor version 5.7.16 or higher
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Aurora 5.6 or higher
     *         </p>
     *         </li>
     */

    public Boolean isIAMDatabaseAuthenticationEnabled() {
        return this.iAMDatabaseAuthenticationEnabled;
    }

    /**
     * <p>
     * Provides the date and time the DB instance was created.
     * </p>
     * 
     * @param instanceCreateTime
     *        Provides the date and time the DB instance was created.
     */

    public void setInstanceCreateTime(String instanceCreateTime) {
        this.instanceCreateTime = instanceCreateTime;
    }

    /**
     * <p>
     * Provides the date and time the DB instance was created.
     * </p>
     * 
     * @return Provides the date and time the DB instance was created.
     */

    public String getInstanceCreateTime() {
        return this.instanceCreateTime;
    }

    /**
     * <p>
     * Provides the date and time the DB instance was created.
     * </p>
     * 
     * @param instanceCreateTime
     *        Provides the date and time the DB instance was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withInstanceCreateTime(String instanceCreateTime) {
        setInstanceCreateTime(instanceCreateTime);
        return this;
    }

    /**
     * <p>
     * If <code>StorageEncrypted</code> is true, the AWS KMS key identifier for the encrypted DB instance.
     * </p>
     * 
     * @param kmsKeyId
     *        If <code>StorageEncrypted</code> is true, the AWS KMS key identifier for the encrypted DB instance.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * If <code>StorageEncrypted</code> is true, the AWS KMS key identifier for the encrypted DB instance.
     * </p>
     * 
     * @return If <code>StorageEncrypted</code> is true, the AWS KMS key identifier for the encrypted DB instance.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * If <code>StorageEncrypted</code> is true, the AWS KMS key identifier for the encrypted DB instance.
     * </p>
     * 
     * @param kmsKeyId
     *        If <code>StorageEncrypted</code> is true, the AWS KMS key identifier for the encrypted DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * Specifies the accessibility options for the DB instance.
     * </p>
     * <p>
     * A value of true specifies an Internet-facing instance with a publicly resolvable DNS name, which resolves to a
     * public IP address.
     * </p>
     * <p>
     * A value of false specifies an internal instance with a DNS name that resolves to a private IP address.
     * </p>
     * 
     * @param publiclyAccessible
     *        Specifies the accessibility options for the DB instance.</p>
     *        <p>
     *        A value of true specifies an Internet-facing instance with a publicly resolvable DNS name, which resolves
     *        to a public IP address.
     *        </p>
     *        <p>
     *        A value of false specifies an internal instance with a DNS name that resolves to a private IP address.
     */

    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * Specifies the accessibility options for the DB instance.
     * </p>
     * <p>
     * A value of true specifies an Internet-facing instance with a publicly resolvable DNS name, which resolves to a
     * public IP address.
     * </p>
     * <p>
     * A value of false specifies an internal instance with a DNS name that resolves to a private IP address.
     * </p>
     * 
     * @return Specifies the accessibility options for the DB instance.</p>
     *         <p>
     *         A value of true specifies an Internet-facing instance with a publicly resolvable DNS name, which resolves
     *         to a public IP address.
     *         </p>
     *         <p>
     *         A value of false specifies an internal instance with a DNS name that resolves to a private IP address.
     */

    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * Specifies the accessibility options for the DB instance.
     * </p>
     * <p>
     * A value of true specifies an Internet-facing instance with a publicly resolvable DNS name, which resolves to a
     * public IP address.
     * </p>
     * <p>
     * A value of false specifies an internal instance with a DNS name that resolves to a private IP address.
     * </p>
     * 
     * @param publiclyAccessible
     *        Specifies the accessibility options for the DB instance.</p>
     *        <p>
     *        A value of true specifies an Internet-facing instance with a publicly resolvable DNS name, which resolves
     *        to a public IP address.
     *        </p>
     *        <p>
     *        A value of false specifies an internal instance with a DNS name that resolves to a private IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withPubliclyAccessible(Boolean publiclyAccessible) {
        setPubliclyAccessible(publiclyAccessible);
        return this;
    }

    /**
     * <p>
     * Specifies the accessibility options for the DB instance.
     * </p>
     * <p>
     * A value of true specifies an Internet-facing instance with a publicly resolvable DNS name, which resolves to a
     * public IP address.
     * </p>
     * <p>
     * A value of false specifies an internal instance with a DNS name that resolves to a private IP address.
     * </p>
     * 
     * @return Specifies the accessibility options for the DB instance.</p>
     *         <p>
     *         A value of true specifies an Internet-facing instance with a publicly resolvable DNS name, which resolves
     *         to a public IP address.
     *         </p>
     *         <p>
     *         A value of false specifies an internal instance with a DNS name that resolves to a private IP address.
     */

    public Boolean isPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * Specifies whether the DB instance is encrypted.
     * </p>
     * 
     * @param storageEncrypted
     *        Specifies whether the DB instance is encrypted.
     */

    public void setStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
    }

    /**
     * <p>
     * Specifies whether the DB instance is encrypted.
     * </p>
     * 
     * @return Specifies whether the DB instance is encrypted.
     */

    public Boolean getStorageEncrypted() {
        return this.storageEncrypted;
    }

    /**
     * <p>
     * Specifies whether the DB instance is encrypted.
     * </p>
     * 
     * @param storageEncrypted
     *        Specifies whether the DB instance is encrypted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withStorageEncrypted(Boolean storageEncrypted) {
        setStorageEncrypted(storageEncrypted);
        return this;
    }

    /**
     * <p>
     * Specifies whether the DB instance is encrypted.
     * </p>
     * 
     * @return Specifies whether the DB instance is encrypted.
     */

    public Boolean isStorageEncrypted() {
        return this.storageEncrypted;
    }

    /**
     * <p>
     * The ARN from the key store with which the instance is associated for TDE encryption.
     * </p>
     * 
     * @param tdeCredentialArn
     *        The ARN from the key store with which the instance is associated for TDE encryption.
     */

    public void setTdeCredentialArn(String tdeCredentialArn) {
        this.tdeCredentialArn = tdeCredentialArn;
    }

    /**
     * <p>
     * The ARN from the key store with which the instance is associated for TDE encryption.
     * </p>
     * 
     * @return The ARN from the key store with which the instance is associated for TDE encryption.
     */

    public String getTdeCredentialArn() {
        return this.tdeCredentialArn;
    }

    /**
     * <p>
     * The ARN from the key store with which the instance is associated for TDE encryption.
     * </p>
     * 
     * @param tdeCredentialArn
     *        The ARN from the key store with which the instance is associated for TDE encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withTdeCredentialArn(String tdeCredentialArn) {
        setTdeCredentialArn(tdeCredentialArn);
        return this;
    }

    /**
     * <p>
     * A list of VPC security groups that the DB instance belongs to.
     * </p>
     * 
     * @return A list of VPC security groups that the DB instance belongs to.
     */

    public java.util.List<AwsRdsDbInstanceVpcSecurityGroup> getVpcSecurityGroups() {
        return vpcSecurityGroups;
    }

    /**
     * <p>
     * A list of VPC security groups that the DB instance belongs to.
     * </p>
     * 
     * @param vpcSecurityGroups
     *        A list of VPC security groups that the DB instance belongs to.
     */

    public void setVpcSecurityGroups(java.util.Collection<AwsRdsDbInstanceVpcSecurityGroup> vpcSecurityGroups) {
        if (vpcSecurityGroups == null) {
            this.vpcSecurityGroups = null;
            return;
        }

        this.vpcSecurityGroups = new java.util.ArrayList<AwsRdsDbInstanceVpcSecurityGroup>(vpcSecurityGroups);
    }

    /**
     * <p>
     * A list of VPC security groups that the DB instance belongs to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroups(java.util.Collection)} or {@link #withVpcSecurityGroups(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroups
     *        A list of VPC security groups that the DB instance belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withVpcSecurityGroups(AwsRdsDbInstanceVpcSecurityGroup... vpcSecurityGroups) {
        if (this.vpcSecurityGroups == null) {
            setVpcSecurityGroups(new java.util.ArrayList<AwsRdsDbInstanceVpcSecurityGroup>(vpcSecurityGroups.length));
        }
        for (AwsRdsDbInstanceVpcSecurityGroup ele : vpcSecurityGroups) {
            this.vpcSecurityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of VPC security groups that the DB instance belongs to.
     * </p>
     * 
     * @param vpcSecurityGroups
     *        A list of VPC security groups that the DB instance belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRdsDbInstanceDetails withVpcSecurityGroups(java.util.Collection<AwsRdsDbInstanceVpcSecurityGroup> vpcSecurityGroups) {
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
        if (getAssociatedRoles() != null)
            sb.append("AssociatedRoles: ").append(getAssociatedRoles()).append(",");
        if (getCACertificateIdentifier() != null)
            sb.append("CACertificateIdentifier: ").append(getCACertificateIdentifier()).append(",");
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: ").append(getDBClusterIdentifier()).append(",");
        if (getDBInstanceIdentifier() != null)
            sb.append("DBInstanceIdentifier: ").append(getDBInstanceIdentifier()).append(",");
        if (getDBInstanceClass() != null)
            sb.append("DBInstanceClass: ").append(getDBInstanceClass()).append(",");
        if (getDbInstancePort() != null)
            sb.append("DbInstancePort: ").append(getDbInstancePort()).append(",");
        if (getDbiResourceId() != null)
            sb.append("DbiResourceId: ").append(getDbiResourceId()).append(",");
        if (getDBName() != null)
            sb.append("DBName: ").append(getDBName()).append(",");
        if (getDeletionProtection() != null)
            sb.append("DeletionProtection: ").append(getDeletionProtection()).append(",");
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getIAMDatabaseAuthenticationEnabled() != null)
            sb.append("IAMDatabaseAuthenticationEnabled: ").append(getIAMDatabaseAuthenticationEnabled()).append(",");
        if (getInstanceCreateTime() != null)
            sb.append("InstanceCreateTime: ").append(getInstanceCreateTime()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: ").append(getPubliclyAccessible()).append(",");
        if (getStorageEncrypted() != null)
            sb.append("StorageEncrypted: ").append(getStorageEncrypted()).append(",");
        if (getTdeCredentialArn() != null)
            sb.append("TdeCredentialArn: ").append(getTdeCredentialArn()).append(",");
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

        if (obj instanceof AwsRdsDbInstanceDetails == false)
            return false;
        AwsRdsDbInstanceDetails other = (AwsRdsDbInstanceDetails) obj;
        if (other.getAssociatedRoles() == null ^ this.getAssociatedRoles() == null)
            return false;
        if (other.getAssociatedRoles() != null && other.getAssociatedRoles().equals(this.getAssociatedRoles()) == false)
            return false;
        if (other.getCACertificateIdentifier() == null ^ this.getCACertificateIdentifier() == null)
            return false;
        if (other.getCACertificateIdentifier() != null && other.getCACertificateIdentifier().equals(this.getCACertificateIdentifier()) == false)
            return false;
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null)
            return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false)
            return false;
        if (other.getDBInstanceClass() == null ^ this.getDBInstanceClass() == null)
            return false;
        if (other.getDBInstanceClass() != null && other.getDBInstanceClass().equals(this.getDBInstanceClass()) == false)
            return false;
        if (other.getDbInstancePort() == null ^ this.getDbInstancePort() == null)
            return false;
        if (other.getDbInstancePort() != null && other.getDbInstancePort().equals(this.getDbInstancePort()) == false)
            return false;
        if (other.getDbiResourceId() == null ^ this.getDbiResourceId() == null)
            return false;
        if (other.getDbiResourceId() != null && other.getDbiResourceId().equals(this.getDbiResourceId()) == false)
            return false;
        if (other.getDBName() == null ^ this.getDBName() == null)
            return false;
        if (other.getDBName() != null && other.getDBName().equals(this.getDBName()) == false)
            return false;
        if (other.getDeletionProtection() == null ^ this.getDeletionProtection() == null)
            return false;
        if (other.getDeletionProtection() != null && other.getDeletionProtection().equals(this.getDeletionProtection()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getIAMDatabaseAuthenticationEnabled() == null ^ this.getIAMDatabaseAuthenticationEnabled() == null)
            return false;
        if (other.getIAMDatabaseAuthenticationEnabled() != null
                && other.getIAMDatabaseAuthenticationEnabled().equals(this.getIAMDatabaseAuthenticationEnabled()) == false)
            return false;
        if (other.getInstanceCreateTime() == null ^ this.getInstanceCreateTime() == null)
            return false;
        if (other.getInstanceCreateTime() != null && other.getInstanceCreateTime().equals(this.getInstanceCreateTime()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getStorageEncrypted() == null ^ this.getStorageEncrypted() == null)
            return false;
        if (other.getStorageEncrypted() != null && other.getStorageEncrypted().equals(this.getStorageEncrypted()) == false)
            return false;
        if (other.getTdeCredentialArn() == null ^ this.getTdeCredentialArn() == null)
            return false;
        if (other.getTdeCredentialArn() != null && other.getTdeCredentialArn().equals(this.getTdeCredentialArn()) == false)
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

        hashCode = prime * hashCode + ((getAssociatedRoles() == null) ? 0 : getAssociatedRoles().hashCode());
        hashCode = prime * hashCode + ((getCACertificateIdentifier() == null) ? 0 : getCACertificateIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDBInstanceClass() == null) ? 0 : getDBInstanceClass().hashCode());
        hashCode = prime * hashCode + ((getDbInstancePort() == null) ? 0 : getDbInstancePort().hashCode());
        hashCode = prime * hashCode + ((getDbiResourceId() == null) ? 0 : getDbiResourceId().hashCode());
        hashCode = prime * hashCode + ((getDBName() == null) ? 0 : getDBName().hashCode());
        hashCode = prime * hashCode + ((getDeletionProtection() == null) ? 0 : getDeletionProtection().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getIAMDatabaseAuthenticationEnabled() == null) ? 0 : getIAMDatabaseAuthenticationEnabled().hashCode());
        hashCode = prime * hashCode + ((getInstanceCreateTime() == null) ? 0 : getInstanceCreateTime().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode + ((getStorageEncrypted() == null) ? 0 : getStorageEncrypted().hashCode());
        hashCode = prime * hashCode + ((getTdeCredentialArn() == null) ? 0 : getTdeCredentialArn().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroups() == null) ? 0 : getVpcSecurityGroups().hashCode());
        return hashCode;
    }

    @Override
    public AwsRdsDbInstanceDetails clone() {
        try {
            return (AwsRdsDbInstanceDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsRdsDbInstanceDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
