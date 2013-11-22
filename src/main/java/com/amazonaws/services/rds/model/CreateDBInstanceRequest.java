/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#createDBInstance(CreateDBInstanceRequest) CreateDBInstance operation}.
 * <p>
 * Creates a new DB instance.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#createDBInstance(CreateDBInstanceRequest)
 */
public class CreateDBInstanceRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The meaning of this parameter differs according to the database engine
     * you use. <p><b>MySQL</b> <p>The name of the database to create when
     * the DB instance is created. If this parameter is not specified, no
     * database is created in the DB instance. <p>Constraints: <ul> <li>Must
     * contain 1 to 64 alphanumeric characters</li> <li>Cannot be a word
     * reserved by the specified database engine</li> </ul> <p>Type: String
     * <p><b>Oracle</b> <p> The Oracle System ID (SID) of the created DB
     * instance. <p>Default: <code>ORCL</code> <p>Constraints: <ul>
     * <li>Cannot be longer than 8 characters</li> </ul> <p><b>SQL Server</b>
     * <p>Not applicable. Must be null.
     */
    private String dBName;

    /**
     * The DB instance identifier. This parameter is stored as a lowercase
     * string. <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens (1 to 15 for SQL Server).</li>
     * <li>First character must be a letter.</li> <li>Cannot end with a
     * hyphen or contain two consecutive hyphens.</li> </ul> <p>Example:
     * <code>mydbinstance</code>
     */
    private String dBInstanceIdentifier;

    /**
     * The amount of storage (in gigabytes) to be initially allocated for the
     * database instance. <p><b>MySQL</b> <p> Constraints: Must be an integer
     * from 5 to 1024. <p> Type: Integer <p><b>Oracle</b> <p> Constraints:
     * Must be an integer from 10 to 1024. <p><b>SQL Server</b> <p>
     * Constraints: Must be an integer from 200 to 1024 (Standard Edition and
     * Enterprise Edition) or from 30 to 1024 (Express Edition and Web
     * Edition)
     */
    private Integer allocatedStorage;

    /**
     * The compute and memory capacity of the DB instance. <p> Valid Values:
     * <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large |
     * db.m1.xlarge | db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge</code>
     */
    private String dBInstanceClass;

    /**
     * The name of the database engine to be used for this instance. <p>
     * Valid Values: <code>MySQL</code> | <code>oracle-se1</code> |
     * <code>oracle-se</code> | <code>oracle-ee</code> |
     * <code>sqlserver-ee</code> | <code>sqlserver-se</code> |
     * <code>sqlserver-ex</code> | <code>sqlserver-web</code>
     */
    private String engine;

    /**
     * The name of master user for the client DB instance. <p><b>MySQL</b>
     * <p>Constraints: <ul> <li>Must be 1 to 16 alphanumeric characters.</li>
     * <li>First character must be a letter.</li> <li>Cannot be a reserved
     * word for the chosen database engine.</li> </ul> <p>Type: String
     * <p><b>Oracle</b> <p>Constraints: <ul> <li>Must be 1 to 30 alphanumeric
     * characters.</li> <li>First character must be a letter.</li> <li>Cannot
     * be a reserved word for the chosen database engine.</li> </ul>
     * <p><b>SQL Server</b> <p>Constraints: <ul> <li>Must be 1 to 128
     * alphanumeric characters.</li> <li>First character must be a
     * letter.</li> <li>Cannot be a reserved word for the chosen database
     * engine.</li> </ul>
     */
    private String masterUsername;

    /**
     * The password for the master database user. Can be any printable ASCII
     * character except "/", """, or "@". <p>Type: String <p><b>MySQL</b> <p>
     * Constraints: Must contain from 8 to 41 characters. <p><b>Oracle</b>
     * <p> Constraints: Must contain from 8 to 30 characters. <p><b>SQL
     * Server</b> <p> Constraints: Must contain from 8 to 128 characters.
     */
    private String masterUserPassword;

    /**
     * A list of DB security groups to associate with this DB instance. <p>
     * Default: The default DB security group for the database engine.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> dBSecurityGroups;

    /**
     * A list of EC2 VPC security groups to associate with this DB instance.
     * <p> Default: The default EC2 VPC security group for the DB subnet
     * group's VPC.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> vpcSecurityGroupIds;

    /**
     * The EC2 Availability Zone that the database instance will be created
     * in. <p> Default: A random, system-chosen Availability Zone in the
     * endpoint's region. <p> Example: <code>us-east-1d</code> <p>
     * Constraint: The AvailabilityZone parameter cannot be specified if the
     * MultiAZ parameter is set to <code>true</code>. The specified
     * Availability Zone must be in the same region as the current endpoint.
     */
    private String availabilityZone;

    /**
     * A DB subnet group to associate with this DB instance. <p> If there is
     * no DB subnet group, then it is a non-VPC DB instance.
     */
    private String dBSubnetGroupName;

    /**
     * The weekly time range (in UTC) during which system maintenance can
     * occur. <p> Format: <code>ddd:hh24:mi-ddd:hh24:mi</code> <p> Default: A
     * 30-minute window selected at random from an 8-hour block of time per
     * region, occurring on a random day of the week. To see the time blocks
     * available, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     * Adjusting the Preferred Maintenance Window</a> in the Amazon RDS User
     * Guide. <p>Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * <p>Constraints: Minimum 30-minute window.
     */
    private String preferredMaintenanceWindow;

    /**
     * The name of the DB parameter group to associate with this DB instance.
     * If this argument is omitted, the default DBParameterGroup for the
     * specified engine will be used. <p> Constraints: <ul> <li>Must be 1 to
     * 255 alphanumeric characters</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul>
     */
    private String dBParameterGroupName;

    /**
     * The number of days for which automated backups are retained. Setting
     * this parameter to a positive number enables backups. Setting this
     * parameter to 0 disables automated backups. <p> Default: 1
     * <p>Constraints: <ul> <li>Must be a value from 0 to 35</li> <li>Cannot
     * be set to 0 if the DB instance is a source to read replicas</li> </ul>
     */
    private Integer backupRetentionPeriod;

    /**
     * The daily time range during which automated backups are created if
     * automated backups are enabled, using the
     * <code>BackupRetentionPeriod</code> parameter. <p> Default: A 30-minute
     * window selected at random from an 8-hour block of time per region. See
     * the Amazon RDS User Guide for the time blocks for each region from
     * which the default backup windows are assigned. <p> Constraints: Must
     * be in the format <code>hh24:mi-hh24:mi</code>. Times should be
     * Universal Time Coordinated (UTC). Must not conflict with the preferred
     * maintenance window. Must be at least 30 minutes.
     */
    private String preferredBackupWindow;

    /**
     * The port number on which the database accepts connections.
     * <p><b>MySQL</b> <p> Default: <code>3306</code> <p> Valid Values:
     * <code>1150-65535</code> <p>Type: Integer <p><b>Oracle</b> <p> Default:
     * <code>1521</code> <p> Valid Values: <code>1150-65535</code> <p><b>SQL
     * Server</b> <p> Default: <code>1433</code> <p> Valid Values:
     * <code>1150-65535</code> except for <code>1434</code> and
     * <code>3389</code>.
     */
    private Integer port;

    /**
     * Specifies if the DB instance is a Multi-AZ deployment. You cannot set
     * the AvailabilityZone parameter if the MultiAZ parameter is set to
     * true.
     */
    private Boolean multiAZ;

    /**
     * The version number of the database engine to use. <p><b>MySQL</b>
     * <p>Example: <code>5.1.42</code> <p>Type: String <p><b>Oracle</b>
     * <p>Example: <code>11.2.0.2.v2</code> <p>Type: String <p><b>SQL
     * Server</b> <p>Example: <code>10.50.2789.0.v1</code>
     */
    private String engineVersion;

    /**
     * Indicates that minor engine upgrades will be applied automatically to
     * the DB instance during the maintenance window. <p>Default:
     * <code>true</code>
     */
    private Boolean autoMinorVersionUpgrade;

    /**
     * License model information for this DB instance. <p> Valid values:
     * <code>license-included</code> | <code>bring-your-own-license</code> |
     * <code>general-public-license</code>
     */
    private String licenseModel;

    /**
     * The amount of Provisioned IOPS (input/output operations per second) to
     * be initially allocated for the DB instance. <p> Constraints: Must be
     * an integer greater than 1000.
     */
    private Integer iops;

    /**
     * Indicates that the DB instance should be associated with the specified
     * option group. <p> <!-- Note that persistent options, such as the
     * TDE_SQLServer option for Microsoft SQL Server, cannot be removed from
     * an option group while DB instances are associated with the option
     * group. --> Permanent options, such as the TDE option for Oracle
     * Advanced Security TDE, cannot be removed from an option group, and
     * that option group cannot be removed from a DB instance once it is
     * associated with a DB instance
     */
    private String optionGroupName;

    /**
     * For supported engines, indicates that the DB instance should be
     * associated with the specified CharacterSet.
     */
    private String characterSetName;

    /**
     * Specifies the accessibility options for the DB instance. A value of
     * true specifies an Internet-facing instance with a publicly resolvable
     * DNS name, which resolves to a public IP address. A value of false
     * specifies an internal instance with a DNS name that resolves to a
     * private IP address. <p> Default: The default behavior varies depending
     * on whether a VPC has been requested or not. The following list shows
     * the default behavior in each case. <ul> <li><b>Default
     * VPC:</b>true</li> <li><b>VPC:</b>false</li> </ul> <p> If no DB subnet
     * group has been specified as part of the request and the
     * PubliclyAccessible value has not been set, the DB instance will be
     * publicly accessible. If a specific DB subnet group has been specified
     * as part of the request and the PubliclyAccessible value has not been
     * set, the DB instance will be private.
     */
    private Boolean publiclyAccessible;

    /**
     * A list of tags.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * Default constructor for a new CreateDBInstanceRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateDBInstanceRequest() {}
    
    /**
     * Constructs a new CreateDBInstanceRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param dBInstanceIdentifier The DB instance identifier. This parameter
     * is stored as a lowercase string. <p>Constraints: <ul> <li>Must contain
     * from 1 to 63 alphanumeric characters or hyphens (1 to 15 for SQL
     * Server).</li> <li>First character must be a letter.</li> <li>Cannot
     * end with a hyphen or contain two consecutive hyphens.</li> </ul>
     * <p>Example: <code>mydbinstance</code>
     * @param allocatedStorage The amount of storage (in gigabytes) to be
     * initially allocated for the database instance. <p><b>MySQL</b> <p>
     * Constraints: Must be an integer from 5 to 1024. <p> Type: Integer
     * <p><b>Oracle</b> <p> Constraints: Must be an integer from 10 to 1024.
     * <p><b>SQL Server</b> <p> Constraints: Must be an integer from 200 to
     * 1024 (Standard Edition and Enterprise Edition) or from 30 to 1024
     * (Express Edition and Web Edition)
     * @param dBInstanceClass The compute and memory capacity of the DB
     * instance. <p> Valid Values: <code>db.t1.micro | db.m1.small |
     * db.m1.medium | db.m1.large | db.m1.xlarge | db.m2.xlarge
     * |db.m2.2xlarge | db.m2.4xlarge</code>
     * @param engine The name of the database engine to be used for this
     * instance. <p> Valid Values: <code>MySQL</code> |
     * <code>oracle-se1</code> | <code>oracle-se</code> |
     * <code>oracle-ee</code> | <code>sqlserver-ee</code> |
     * <code>sqlserver-se</code> | <code>sqlserver-ex</code> |
     * <code>sqlserver-web</code>
     * @param masterUsername The name of master user for the client DB
     * instance. <p><b>MySQL</b> <p>Constraints: <ul> <li>Must be 1 to 16
     * alphanumeric characters.</li> <li>First character must be a
     * letter.</li> <li>Cannot be a reserved word for the chosen database
     * engine.</li> </ul> <p>Type: String <p><b>Oracle</b> <p>Constraints:
     * <ul> <li>Must be 1 to 30 alphanumeric characters.</li> <li>First
     * character must be a letter.</li> <li>Cannot be a reserved word for the
     * chosen database engine.</li> </ul> <p><b>SQL Server</b>
     * <p>Constraints: <ul> <li>Must be 1 to 128 alphanumeric
     * characters.</li> <li>First character must be a letter.</li> <li>Cannot
     * be a reserved word for the chosen database engine.</li> </ul>
     * @param masterUserPassword The password for the master database user.
     * Can be any printable ASCII character except "/", """, or "@". <p>Type:
     * String <p><b>MySQL</b> <p> Constraints: Must contain from 8 to 41
     * characters. <p><b>Oracle</b> <p> Constraints: Must contain from 8 to
     * 30 characters. <p><b>SQL Server</b> <p> Constraints: Must contain from
     * 8 to 128 characters.
     */
    public CreateDBInstanceRequest(String dBInstanceIdentifier, Integer allocatedStorage, String dBInstanceClass, String engine, String masterUsername, String masterUserPassword) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
        setAllocatedStorage(allocatedStorage);
        setDBInstanceClass(dBInstanceClass);
        setEngine(engine);
        setMasterUsername(masterUsername);
        setMasterUserPassword(masterUserPassword);
    }

    /**
     * The meaning of this parameter differs according to the database engine
     * you use. <p><b>MySQL</b> <p>The name of the database to create when
     * the DB instance is created. If this parameter is not specified, no
     * database is created in the DB instance. <p>Constraints: <ul> <li>Must
     * contain 1 to 64 alphanumeric characters</li> <li>Cannot be a word
     * reserved by the specified database engine</li> </ul> <p>Type: String
     * <p><b>Oracle</b> <p> The Oracle System ID (SID) of the created DB
     * instance. <p>Default: <code>ORCL</code> <p>Constraints: <ul>
     * <li>Cannot be longer than 8 characters</li> </ul> <p><b>SQL Server</b>
     * <p>Not applicable. Must be null.
     *
     * @return The meaning of this parameter differs according to the database engine
     *         you use. <p><b>MySQL</b> <p>The name of the database to create when
     *         the DB instance is created. If this parameter is not specified, no
     *         database is created in the DB instance. <p>Constraints: <ul> <li>Must
     *         contain 1 to 64 alphanumeric characters</li> <li>Cannot be a word
     *         reserved by the specified database engine</li> </ul> <p>Type: String
     *         <p><b>Oracle</b> <p> The Oracle System ID (SID) of the created DB
     *         instance. <p>Default: <code>ORCL</code> <p>Constraints: <ul>
     *         <li>Cannot be longer than 8 characters</li> </ul> <p><b>SQL Server</b>
     *         <p>Not applicable. Must be null.
     */
    public String getDBName() {
        return dBName;
    }
    
    /**
     * The meaning of this parameter differs according to the database engine
     * you use. <p><b>MySQL</b> <p>The name of the database to create when
     * the DB instance is created. If this parameter is not specified, no
     * database is created in the DB instance. <p>Constraints: <ul> <li>Must
     * contain 1 to 64 alphanumeric characters</li> <li>Cannot be a word
     * reserved by the specified database engine</li> </ul> <p>Type: String
     * <p><b>Oracle</b> <p> The Oracle System ID (SID) of the created DB
     * instance. <p>Default: <code>ORCL</code> <p>Constraints: <ul>
     * <li>Cannot be longer than 8 characters</li> </ul> <p><b>SQL Server</b>
     * <p>Not applicable. Must be null.
     *
     * @param dBName The meaning of this parameter differs according to the database engine
     *         you use. <p><b>MySQL</b> <p>The name of the database to create when
     *         the DB instance is created. If this parameter is not specified, no
     *         database is created in the DB instance. <p>Constraints: <ul> <li>Must
     *         contain 1 to 64 alphanumeric characters</li> <li>Cannot be a word
     *         reserved by the specified database engine</li> </ul> <p>Type: String
     *         <p><b>Oracle</b> <p> The Oracle System ID (SID) of the created DB
     *         instance. <p>Default: <code>ORCL</code> <p>Constraints: <ul>
     *         <li>Cannot be longer than 8 characters</li> </ul> <p><b>SQL Server</b>
     *         <p>Not applicable. Must be null.
     */
    public void setDBName(String dBName) {
        this.dBName = dBName;
    }
    
    /**
     * The meaning of this parameter differs according to the database engine
     * you use. <p><b>MySQL</b> <p>The name of the database to create when
     * the DB instance is created. If this parameter is not specified, no
     * database is created in the DB instance. <p>Constraints: <ul> <li>Must
     * contain 1 to 64 alphanumeric characters</li> <li>Cannot be a word
     * reserved by the specified database engine</li> </ul> <p>Type: String
     * <p><b>Oracle</b> <p> The Oracle System ID (SID) of the created DB
     * instance. <p>Default: <code>ORCL</code> <p>Constraints: <ul>
     * <li>Cannot be longer than 8 characters</li> </ul> <p><b>SQL Server</b>
     * <p>Not applicable. Must be null.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBName The meaning of this parameter differs according to the database engine
     *         you use. <p><b>MySQL</b> <p>The name of the database to create when
     *         the DB instance is created. If this parameter is not specified, no
     *         database is created in the DB instance. <p>Constraints: <ul> <li>Must
     *         contain 1 to 64 alphanumeric characters</li> <li>Cannot be a word
     *         reserved by the specified database engine</li> </ul> <p>Type: String
     *         <p><b>Oracle</b> <p> The Oracle System ID (SID) of the created DB
     *         instance. <p>Default: <code>ORCL</code> <p>Constraints: <ul>
     *         <li>Cannot be longer than 8 characters</li> </ul> <p><b>SQL Server</b>
     *         <p>Not applicable. Must be null.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBInstanceRequest withDBName(String dBName) {
        this.dBName = dBName;
        return this;
    }

    /**
     * The DB instance identifier. This parameter is stored as a lowercase
     * string. <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens (1 to 15 for SQL Server).</li>
     * <li>First character must be a letter.</li> <li>Cannot end with a
     * hyphen or contain two consecutive hyphens.</li> </ul> <p>Example:
     * <code>mydbinstance</code>
     *
     * @return The DB instance identifier. This parameter is stored as a lowercase
     *         string. <p>Constraints: <ul> <li>Must contain from 1 to 63
     *         alphanumeric characters or hyphens (1 to 15 for SQL Server).</li>
     *         <li>First character must be a letter.</li> <li>Cannot end with a
     *         hyphen or contain two consecutive hyphens.</li> </ul> <p>Example:
     *         <code>mydbinstance</code>
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }
    
    /**
     * The DB instance identifier. This parameter is stored as a lowercase
     * string. <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens (1 to 15 for SQL Server).</li>
     * <li>First character must be a letter.</li> <li>Cannot end with a
     * hyphen or contain two consecutive hyphens.</li> </ul> <p>Example:
     * <code>mydbinstance</code>
     *
     * @param dBInstanceIdentifier The DB instance identifier. This parameter is stored as a lowercase
     *         string. <p>Constraints: <ul> <li>Must contain from 1 to 63
     *         alphanumeric characters or hyphens (1 to 15 for SQL Server).</li>
     *         <li>First character must be a letter.</li> <li>Cannot end with a
     *         hyphen or contain two consecutive hyphens.</li> </ul> <p>Example:
     *         <code>mydbinstance</code>
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }
    
    /**
     * The DB instance identifier. This parameter is stored as a lowercase
     * string. <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens (1 to 15 for SQL Server).</li>
     * <li>First character must be a letter.</li> <li>Cannot end with a
     * hyphen or contain two consecutive hyphens.</li> </ul> <p>Example:
     * <code>mydbinstance</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceIdentifier The DB instance identifier. This parameter is stored as a lowercase
     *         string. <p>Constraints: <ul> <li>Must contain from 1 to 63
     *         alphanumeric characters or hyphens (1 to 15 for SQL Server).</li>
     *         <li>First character must be a letter.</li> <li>Cannot end with a
     *         hyphen or contain two consecutive hyphens.</li> </ul> <p>Example:
     *         <code>mydbinstance</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBInstanceRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        return this;
    }

    /**
     * The amount of storage (in gigabytes) to be initially allocated for the
     * database instance. <p><b>MySQL</b> <p> Constraints: Must be an integer
     * from 5 to 1024. <p> Type: Integer <p><b>Oracle</b> <p> Constraints:
     * Must be an integer from 10 to 1024. <p><b>SQL Server</b> <p>
     * Constraints: Must be an integer from 200 to 1024 (Standard Edition and
     * Enterprise Edition) or from 30 to 1024 (Express Edition and Web
     * Edition)
     *
     * @return The amount of storage (in gigabytes) to be initially allocated for the
     *         database instance. <p><b>MySQL</b> <p> Constraints: Must be an integer
     *         from 5 to 1024. <p> Type: Integer <p><b>Oracle</b> <p> Constraints:
     *         Must be an integer from 10 to 1024. <p><b>SQL Server</b> <p>
     *         Constraints: Must be an integer from 200 to 1024 (Standard Edition and
     *         Enterprise Edition) or from 30 to 1024 (Express Edition and Web
     *         Edition)
     */
    public Integer getAllocatedStorage() {
        return allocatedStorage;
    }
    
    /**
     * The amount of storage (in gigabytes) to be initially allocated for the
     * database instance. <p><b>MySQL</b> <p> Constraints: Must be an integer
     * from 5 to 1024. <p> Type: Integer <p><b>Oracle</b> <p> Constraints:
     * Must be an integer from 10 to 1024. <p><b>SQL Server</b> <p>
     * Constraints: Must be an integer from 200 to 1024 (Standard Edition and
     * Enterprise Edition) or from 30 to 1024 (Express Edition and Web
     * Edition)
     *
     * @param allocatedStorage The amount of storage (in gigabytes) to be initially allocated for the
     *         database instance. <p><b>MySQL</b> <p> Constraints: Must be an integer
     *         from 5 to 1024. <p> Type: Integer <p><b>Oracle</b> <p> Constraints:
     *         Must be an integer from 10 to 1024. <p><b>SQL Server</b> <p>
     *         Constraints: Must be an integer from 200 to 1024 (Standard Edition and
     *         Enterprise Edition) or from 30 to 1024 (Express Edition and Web
     *         Edition)
     */
    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }
    
    /**
     * The amount of storage (in gigabytes) to be initially allocated for the
     * database instance. <p><b>MySQL</b> <p> Constraints: Must be an integer
     * from 5 to 1024. <p> Type: Integer <p><b>Oracle</b> <p> Constraints:
     * Must be an integer from 10 to 1024. <p><b>SQL Server</b> <p>
     * Constraints: Must be an integer from 200 to 1024 (Standard Edition and
     * Enterprise Edition) or from 30 to 1024 (Express Edition and Web
     * Edition)
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param allocatedStorage The amount of storage (in gigabytes) to be initially allocated for the
     *         database instance. <p><b>MySQL</b> <p> Constraints: Must be an integer
     *         from 5 to 1024. <p> Type: Integer <p><b>Oracle</b> <p> Constraints:
     *         Must be an integer from 10 to 1024. <p><b>SQL Server</b> <p>
     *         Constraints: Must be an integer from 200 to 1024 (Standard Edition and
     *         Enterprise Edition) or from 30 to 1024 (Express Edition and Web
     *         Edition)
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBInstanceRequest withAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
        return this;
    }

    /**
     * The compute and memory capacity of the DB instance. <p> Valid Values:
     * <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large |
     * db.m1.xlarge | db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge</code>
     *
     * @return The compute and memory capacity of the DB instance. <p> Valid Values:
     *         <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large |
     *         db.m1.xlarge | db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge</code>
     */
    public String getDBInstanceClass() {
        return dBInstanceClass;
    }
    
    /**
     * The compute and memory capacity of the DB instance. <p> Valid Values:
     * <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large |
     * db.m1.xlarge | db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge</code>
     *
     * @param dBInstanceClass The compute and memory capacity of the DB instance. <p> Valid Values:
     *         <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large |
     *         db.m1.xlarge | db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge</code>
     */
    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }
    
    /**
     * The compute and memory capacity of the DB instance. <p> Valid Values:
     * <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large |
     * db.m1.xlarge | db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceClass The compute and memory capacity of the DB instance. <p> Valid Values:
     *         <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large |
     *         db.m1.xlarge | db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBInstanceRequest withDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
        return this;
    }

    /**
     * The name of the database engine to be used for this instance. <p>
     * Valid Values: <code>MySQL</code> | <code>oracle-se1</code> |
     * <code>oracle-se</code> | <code>oracle-ee</code> |
     * <code>sqlserver-ee</code> | <code>sqlserver-se</code> |
     * <code>sqlserver-ex</code> | <code>sqlserver-web</code>
     *
     * @return The name of the database engine to be used for this instance. <p>
     *         Valid Values: <code>MySQL</code> | <code>oracle-se1</code> |
     *         <code>oracle-se</code> | <code>oracle-ee</code> |
     *         <code>sqlserver-ee</code> | <code>sqlserver-se</code> |
     *         <code>sqlserver-ex</code> | <code>sqlserver-web</code>
     */
    public String getEngine() {
        return engine;
    }
    
    /**
     * The name of the database engine to be used for this instance. <p>
     * Valid Values: <code>MySQL</code> | <code>oracle-se1</code> |
     * <code>oracle-se</code> | <code>oracle-ee</code> |
     * <code>sqlserver-ee</code> | <code>sqlserver-se</code> |
     * <code>sqlserver-ex</code> | <code>sqlserver-web</code>
     *
     * @param engine The name of the database engine to be used for this instance. <p>
     *         Valid Values: <code>MySQL</code> | <code>oracle-se1</code> |
     *         <code>oracle-se</code> | <code>oracle-ee</code> |
     *         <code>sqlserver-ee</code> | <code>sqlserver-se</code> |
     *         <code>sqlserver-ex</code> | <code>sqlserver-web</code>
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }
    
    /**
     * The name of the database engine to be used for this instance. <p>
     * Valid Values: <code>MySQL</code> | <code>oracle-se1</code> |
     * <code>oracle-se</code> | <code>oracle-ee</code> |
     * <code>sqlserver-ee</code> | <code>sqlserver-se</code> |
     * <code>sqlserver-ex</code> | <code>sqlserver-web</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engine The name of the database engine to be used for this instance. <p>
     *         Valid Values: <code>MySQL</code> | <code>oracle-se1</code> |
     *         <code>oracle-se</code> | <code>oracle-ee</code> |
     *         <code>sqlserver-ee</code> | <code>sqlserver-se</code> |
     *         <code>sqlserver-ex</code> | <code>sqlserver-web</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBInstanceRequest withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * The name of master user for the client DB instance. <p><b>MySQL</b>
     * <p>Constraints: <ul> <li>Must be 1 to 16 alphanumeric characters.</li>
     * <li>First character must be a letter.</li> <li>Cannot be a reserved
     * word for the chosen database engine.</li> </ul> <p>Type: String
     * <p><b>Oracle</b> <p>Constraints: <ul> <li>Must be 1 to 30 alphanumeric
     * characters.</li> <li>First character must be a letter.</li> <li>Cannot
     * be a reserved word for the chosen database engine.</li> </ul>
     * <p><b>SQL Server</b> <p>Constraints: <ul> <li>Must be 1 to 128
     * alphanumeric characters.</li> <li>First character must be a
     * letter.</li> <li>Cannot be a reserved word for the chosen database
     * engine.</li> </ul>
     *
     * @return The name of master user for the client DB instance. <p><b>MySQL</b>
     *         <p>Constraints: <ul> <li>Must be 1 to 16 alphanumeric characters.</li>
     *         <li>First character must be a letter.</li> <li>Cannot be a reserved
     *         word for the chosen database engine.</li> </ul> <p>Type: String
     *         <p><b>Oracle</b> <p>Constraints: <ul> <li>Must be 1 to 30 alphanumeric
     *         characters.</li> <li>First character must be a letter.</li> <li>Cannot
     *         be a reserved word for the chosen database engine.</li> </ul>
     *         <p><b>SQL Server</b> <p>Constraints: <ul> <li>Must be 1 to 128
     *         alphanumeric characters.</li> <li>First character must be a
     *         letter.</li> <li>Cannot be a reserved word for the chosen database
     *         engine.</li> </ul>
     */
    public String getMasterUsername() {
        return masterUsername;
    }
    
    /**
     * The name of master user for the client DB instance. <p><b>MySQL</b>
     * <p>Constraints: <ul> <li>Must be 1 to 16 alphanumeric characters.</li>
     * <li>First character must be a letter.</li> <li>Cannot be a reserved
     * word for the chosen database engine.</li> </ul> <p>Type: String
     * <p><b>Oracle</b> <p>Constraints: <ul> <li>Must be 1 to 30 alphanumeric
     * characters.</li> <li>First character must be a letter.</li> <li>Cannot
     * be a reserved word for the chosen database engine.</li> </ul>
     * <p><b>SQL Server</b> <p>Constraints: <ul> <li>Must be 1 to 128
     * alphanumeric characters.</li> <li>First character must be a
     * letter.</li> <li>Cannot be a reserved word for the chosen database
     * engine.</li> </ul>
     *
     * @param masterUsername The name of master user for the client DB instance. <p><b>MySQL</b>
     *         <p>Constraints: <ul> <li>Must be 1 to 16 alphanumeric characters.</li>
     *         <li>First character must be a letter.</li> <li>Cannot be a reserved
     *         word for the chosen database engine.</li> </ul> <p>Type: String
     *         <p><b>Oracle</b> <p>Constraints: <ul> <li>Must be 1 to 30 alphanumeric
     *         characters.</li> <li>First character must be a letter.</li> <li>Cannot
     *         be a reserved word for the chosen database engine.</li> </ul>
     *         <p><b>SQL Server</b> <p>Constraints: <ul> <li>Must be 1 to 128
     *         alphanumeric characters.</li> <li>First character must be a
     *         letter.</li> <li>Cannot be a reserved word for the chosen database
     *         engine.</li> </ul>
     */
    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }
    
    /**
     * The name of master user for the client DB instance. <p><b>MySQL</b>
     * <p>Constraints: <ul> <li>Must be 1 to 16 alphanumeric characters.</li>
     * <li>First character must be a letter.</li> <li>Cannot be a reserved
     * word for the chosen database engine.</li> </ul> <p>Type: String
     * <p><b>Oracle</b> <p>Constraints: <ul> <li>Must be 1 to 30 alphanumeric
     * characters.</li> <li>First character must be a letter.</li> <li>Cannot
     * be a reserved word for the chosen database engine.</li> </ul>
     * <p><b>SQL Server</b> <p>Constraints: <ul> <li>Must be 1 to 128
     * alphanumeric characters.</li> <li>First character must be a
     * letter.</li> <li>Cannot be a reserved word for the chosen database
     * engine.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param masterUsername The name of master user for the client DB instance. <p><b>MySQL</b>
     *         <p>Constraints: <ul> <li>Must be 1 to 16 alphanumeric characters.</li>
     *         <li>First character must be a letter.</li> <li>Cannot be a reserved
     *         word for the chosen database engine.</li> </ul> <p>Type: String
     *         <p><b>Oracle</b> <p>Constraints: <ul> <li>Must be 1 to 30 alphanumeric
     *         characters.</li> <li>First character must be a letter.</li> <li>Cannot
     *         be a reserved word for the chosen database engine.</li> </ul>
     *         <p><b>SQL Server</b> <p>Constraints: <ul> <li>Must be 1 to 128
     *         alphanumeric characters.</li> <li>First character must be a
     *         letter.</li> <li>Cannot be a reserved word for the chosen database
     *         engine.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBInstanceRequest withMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
        return this;
    }

    /**
     * The password for the master database user. Can be any printable ASCII
     * character except "/", """, or "@". <p>Type: String <p><b>MySQL</b> <p>
     * Constraints: Must contain from 8 to 41 characters. <p><b>Oracle</b>
     * <p> Constraints: Must contain from 8 to 30 characters. <p><b>SQL
     * Server</b> <p> Constraints: Must contain from 8 to 128 characters.
     *
     * @return The password for the master database user. Can be any printable ASCII
     *         character except "/", """, or "@". <p>Type: String <p><b>MySQL</b> <p>
     *         Constraints: Must contain from 8 to 41 characters. <p><b>Oracle</b>
     *         <p> Constraints: Must contain from 8 to 30 characters. <p><b>SQL
     *         Server</b> <p> Constraints: Must contain from 8 to 128 characters.
     */
    public String getMasterUserPassword() {
        return masterUserPassword;
    }
    
    /**
     * The password for the master database user. Can be any printable ASCII
     * character except "/", """, or "@". <p>Type: String <p><b>MySQL</b> <p>
     * Constraints: Must contain from 8 to 41 characters. <p><b>Oracle</b>
     * <p> Constraints: Must contain from 8 to 30 characters. <p><b>SQL
     * Server</b> <p> Constraints: Must contain from 8 to 128 characters.
     *
     * @param masterUserPassword The password for the master database user. Can be any printable ASCII
     *         character except "/", """, or "@". <p>Type: String <p><b>MySQL</b> <p>
     *         Constraints: Must contain from 8 to 41 characters. <p><b>Oracle</b>
     *         <p> Constraints: Must contain from 8 to 30 characters. <p><b>SQL
     *         Server</b> <p> Constraints: Must contain from 8 to 128 characters.
     */
    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }
    
    /**
     * The password for the master database user. Can be any printable ASCII
     * character except "/", """, or "@". <p>Type: String <p><b>MySQL</b> <p>
     * Constraints: Must contain from 8 to 41 characters. <p><b>Oracle</b>
     * <p> Constraints: Must contain from 8 to 30 characters. <p><b>SQL
     * Server</b> <p> Constraints: Must contain from 8 to 128 characters.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param masterUserPassword The password for the master database user. Can be any printable ASCII
     *         character except "/", """, or "@". <p>Type: String <p><b>MySQL</b> <p>
     *         Constraints: Must contain from 8 to 41 characters. <p><b>Oracle</b>
     *         <p> Constraints: Must contain from 8 to 30 characters. <p><b>SQL
     *         Server</b> <p> Constraints: Must contain from 8 to 128 characters.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBInstanceRequest withMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
        return this;
    }

    /**
     * A list of DB security groups to associate with this DB instance. <p>
     * Default: The default DB security group for the database engine.
     *
     * @return A list of DB security groups to associate with this DB instance. <p>
     *         Default: The default DB security group for the database engine.
     */
    public java.util.List<String> getDBSecurityGroups() {
        if (dBSecurityGroups == null) {
              dBSecurityGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              dBSecurityGroups.setAutoConstruct(true);
        }
        return dBSecurityGroups;
    }
    
    /**
     * A list of DB security groups to associate with this DB instance. <p>
     * Default: The default DB security group for the database engine.
     *
     * @param dBSecurityGroups A list of DB security groups to associate with this DB instance. <p>
     *         Default: The default DB security group for the database engine.
     */
    public void setDBSecurityGroups(java.util.Collection<String> dBSecurityGroups) {
        if (dBSecurityGroups == null) {
            this.dBSecurityGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> dBSecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(dBSecurityGroups.size());
        dBSecurityGroupsCopy.addAll(dBSecurityGroups);
        this.dBSecurityGroups = dBSecurityGroupsCopy;
    }
    
    /**
     * A list of DB security groups to associate with this DB instance. <p>
     * Default: The default DB security group for the database engine.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroups A list of DB security groups to associate with this DB instance. <p>
     *         Default: The default DB security group for the database engine.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBInstanceRequest withDBSecurityGroups(String... dBSecurityGroups) {
        if (getDBSecurityGroups() == null) setDBSecurityGroups(new java.util.ArrayList<String>(dBSecurityGroups.length));
        for (String value : dBSecurityGroups) {
            getDBSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of DB security groups to associate with this DB instance. <p>
     * Default: The default DB security group for the database engine.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroups A list of DB security groups to associate with this DB instance. <p>
     *         Default: The default DB security group for the database engine.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBInstanceRequest withDBSecurityGroups(java.util.Collection<String> dBSecurityGroups) {
        if (dBSecurityGroups == null) {
            this.dBSecurityGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> dBSecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(dBSecurityGroups.size());
            dBSecurityGroupsCopy.addAll(dBSecurityGroups);
            this.dBSecurityGroups = dBSecurityGroupsCopy;
        }

        return this;
    }

    /**
     * A list of EC2 VPC security groups to associate with this DB instance.
     * <p> Default: The default EC2 VPC security group for the DB subnet
     * group's VPC.
     *
     * @return A list of EC2 VPC security groups to associate with this DB instance.
     *         <p> Default: The default EC2 VPC security group for the DB subnet
     *         group's VPC.
     */
    public java.util.List<String> getVpcSecurityGroupIds() {
        if (vpcSecurityGroupIds == null) {
              vpcSecurityGroupIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              vpcSecurityGroupIds.setAutoConstruct(true);
        }
        return vpcSecurityGroupIds;
    }
    
    /**
     * A list of EC2 VPC security groups to associate with this DB instance.
     * <p> Default: The default EC2 VPC security group for the DB subnet
     * group's VPC.
     *
     * @param vpcSecurityGroupIds A list of EC2 VPC security groups to associate with this DB instance.
     *         <p> Default: The default EC2 VPC security group for the DB subnet
     *         group's VPC.
     */
    public void setVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        if (vpcSecurityGroupIds == null) {
            this.vpcSecurityGroupIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> vpcSecurityGroupIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(vpcSecurityGroupIds.size());
        vpcSecurityGroupIdsCopy.addAll(vpcSecurityGroupIds);
        this.vpcSecurityGroupIds = vpcSecurityGroupIdsCopy;
    }
    
    /**
     * A list of EC2 VPC security groups to associate with this DB instance.
     * <p> Default: The default EC2 VPC security group for the DB subnet
     * group's VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcSecurityGroupIds A list of EC2 VPC security groups to associate with this DB instance.
     *         <p> Default: The default EC2 VPC security group for the DB subnet
     *         group's VPC.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBInstanceRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
        if (getVpcSecurityGroupIds() == null) setVpcSecurityGroupIds(new java.util.ArrayList<String>(vpcSecurityGroupIds.length));
        for (String value : vpcSecurityGroupIds) {
            getVpcSecurityGroupIds().add(value);
        }
        return this;
    }
    
    /**
     * A list of EC2 VPC security groups to associate with this DB instance.
     * <p> Default: The default EC2 VPC security group for the DB subnet
     * group's VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcSecurityGroupIds A list of EC2 VPC security groups to associate with this DB instance.
     *         <p> Default: The default EC2 VPC security group for the DB subnet
     *         group's VPC.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBInstanceRequest withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        if (vpcSecurityGroupIds == null) {
            this.vpcSecurityGroupIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> vpcSecurityGroupIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(vpcSecurityGroupIds.size());
            vpcSecurityGroupIdsCopy.addAll(vpcSecurityGroupIds);
            this.vpcSecurityGroupIds = vpcSecurityGroupIdsCopy;
        }

        return this;
    }

    /**
     * The EC2 Availability Zone that the database instance will be created
     * in. <p> Default: A random, system-chosen Availability Zone in the
     * endpoint's region. <p> Example: <code>us-east-1d</code> <p>
     * Constraint: The AvailabilityZone parameter cannot be specified if the
     * MultiAZ parameter is set to <code>true</code>. The specified
     * Availability Zone must be in the same region as the current endpoint.
     *
     * @return The EC2 Availability Zone that the database instance will be created
     *         in. <p> Default: A random, system-chosen Availability Zone in the
     *         endpoint's region. <p> Example: <code>us-east-1d</code> <p>
     *         Constraint: The AvailabilityZone parameter cannot be specified if the
     *         MultiAZ parameter is set to <code>true</code>. The specified
     *         Availability Zone must be in the same region as the current endpoint.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The EC2 Availability Zone that the database instance will be created
     * in. <p> Default: A random, system-chosen Availability Zone in the
     * endpoint's region. <p> Example: <code>us-east-1d</code> <p>
     * Constraint: The AvailabilityZone parameter cannot be specified if the
     * MultiAZ parameter is set to <code>true</code>. The specified
     * Availability Zone must be in the same region as the current endpoint.
     *
     * @param availabilityZone The EC2 Availability Zone that the database instance will be created
     *         in. <p> Default: A random, system-chosen Availability Zone in the
     *         endpoint's region. <p> Example: <code>us-east-1d</code> <p>
     *         Constraint: The AvailabilityZone parameter cannot be specified if the
     *         MultiAZ parameter is set to <code>true</code>. The specified
     *         Availability Zone must be in the same region as the current endpoint.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The EC2 Availability Zone that the database instance will be created
     * in. <p> Default: A random, system-chosen Availability Zone in the
     * endpoint's region. <p> Example: <code>us-east-1d</code> <p>
     * Constraint: The AvailabilityZone parameter cannot be specified if the
     * MultiAZ parameter is set to <code>true</code>. The specified
     * Availability Zone must be in the same region as the current endpoint.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The EC2 Availability Zone that the database instance will be created
     *         in. <p> Default: A random, system-chosen Availability Zone in the
     *         endpoint's region. <p> Example: <code>us-east-1d</code> <p>
     *         Constraint: The AvailabilityZone parameter cannot be specified if the
     *         MultiAZ parameter is set to <code>true</code>. The specified
     *         Availability Zone must be in the same region as the current endpoint.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBInstanceRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * A DB subnet group to associate with this DB instance. <p> If there is
     * no DB subnet group, then it is a non-VPC DB instance.
     *
     * @return A DB subnet group to associate with this DB instance. <p> If there is
     *         no DB subnet group, then it is a non-VPC DB instance.
     */
    public String getDBSubnetGroupName() {
        return dBSubnetGroupName;
    }
    
    /**
     * A DB subnet group to associate with this DB instance. <p> If there is
     * no DB subnet group, then it is a non-VPC DB instance.
     *
     * @param dBSubnetGroupName A DB subnet group to associate with this DB instance. <p> If there is
     *         no DB subnet group, then it is a non-VPC DB instance.
     */
    public void setDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
    }
    
    /**
     * A DB subnet group to associate with this DB instance. <p> If there is
     * no DB subnet group, then it is a non-VPC DB instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSubnetGroupName A DB subnet group to associate with this DB instance. <p> If there is
     *         no DB subnet group, then it is a non-VPC DB instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBInstanceRequest withDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
        return this;
    }

    /**
     * The weekly time range (in UTC) during which system maintenance can
     * occur. <p> Format: <code>ddd:hh24:mi-ddd:hh24:mi</code> <p> Default: A
     * 30-minute window selected at random from an 8-hour block of time per
     * region, occurring on a random day of the week. To see the time blocks
     * available, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     * Adjusting the Preferred Maintenance Window</a> in the Amazon RDS User
     * Guide. <p>Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * <p>Constraints: Minimum 30-minute window.
     *
     * @return The weekly time range (in UTC) during which system maintenance can
     *         occur. <p> Format: <code>ddd:hh24:mi-ddd:hh24:mi</code> <p> Default: A
     *         30-minute window selected at random from an 8-hour block of time per
     *         region, occurring on a random day of the week. To see the time blocks
     *         available, see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     *         Adjusting the Preferred Maintenance Window</a> in the Amazon RDS User
     *         Guide. <p>Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *         <p>Constraints: Minimum 30-minute window.
     */
    public String getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }
    
    /**
     * The weekly time range (in UTC) during which system maintenance can
     * occur. <p> Format: <code>ddd:hh24:mi-ddd:hh24:mi</code> <p> Default: A
     * 30-minute window selected at random from an 8-hour block of time per
     * region, occurring on a random day of the week. To see the time blocks
     * available, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     * Adjusting the Preferred Maintenance Window</a> in the Amazon RDS User
     * Guide. <p>Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * <p>Constraints: Minimum 30-minute window.
     *
     * @param preferredMaintenanceWindow The weekly time range (in UTC) during which system maintenance can
     *         occur. <p> Format: <code>ddd:hh24:mi-ddd:hh24:mi</code> <p> Default: A
     *         30-minute window selected at random from an 8-hour block of time per
     *         region, occurring on a random day of the week. To see the time blocks
     *         available, see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     *         Adjusting the Preferred Maintenance Window</a> in the Amazon RDS User
     *         Guide. <p>Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *         <p>Constraints: Minimum 30-minute window.
     */
    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }
    
    /**
     * The weekly time range (in UTC) during which system maintenance can
     * occur. <p> Format: <code>ddd:hh24:mi-ddd:hh24:mi</code> <p> Default: A
     * 30-minute window selected at random from an 8-hour block of time per
     * region, occurring on a random day of the week. To see the time blocks
     * available, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     * Adjusting the Preferred Maintenance Window</a> in the Amazon RDS User
     * Guide. <p>Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * <p>Constraints: Minimum 30-minute window.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preferredMaintenanceWindow The weekly time range (in UTC) during which system maintenance can
     *         occur. <p> Format: <code>ddd:hh24:mi-ddd:hh24:mi</code> <p> Default: A
     *         30-minute window selected at random from an 8-hour block of time per
     *         region, occurring on a random day of the week. To see the time blocks
     *         available, see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     *         Adjusting the Preferred Maintenance Window</a> in the Amazon RDS User
     *         Guide. <p>Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *         <p>Constraints: Minimum 30-minute window.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBInstanceRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * The name of the DB parameter group to associate with this DB instance.
     * If this argument is omitted, the default DBParameterGroup for the
     * specified engine will be used. <p> Constraints: <ul> <li>Must be 1 to
     * 255 alphanumeric characters</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul>
     *
     * @return The name of the DB parameter group to associate with this DB instance.
     *         If this argument is omitted, the default DBParameterGroup for the
     *         specified engine will be used. <p> Constraints: <ul> <li>Must be 1 to
     *         255 alphanumeric characters</li> <li>First character must be a
     *         letter</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens</li> </ul>
     */
    public String getDBParameterGroupName() {
        return dBParameterGroupName;
    }
    
    /**
     * The name of the DB parameter group to associate with this DB instance.
     * If this argument is omitted, the default DBParameterGroup for the
     * specified engine will be used. <p> Constraints: <ul> <li>Must be 1 to
     * 255 alphanumeric characters</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul>
     *
     * @param dBParameterGroupName The name of the DB parameter group to associate with this DB instance.
     *         If this argument is omitted, the default DBParameterGroup for the
     *         specified engine will be used. <p> Constraints: <ul> <li>Must be 1 to
     *         255 alphanumeric characters</li> <li>First character must be a
     *         letter</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens</li> </ul>
     */
    public void setDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
    }
    
    /**
     * The name of the DB parameter group to associate with this DB instance.
     * If this argument is omitted, the default DBParameterGroup for the
     * specified engine will be used. <p> Constraints: <ul> <li>Must be 1 to
     * 255 alphanumeric characters</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBParameterGroupName The name of the DB parameter group to associate with this DB instance.
     *         If this argument is omitted, the default DBParameterGroup for the
     *         specified engine will be used. <p> Constraints: <ul> <li>Must be 1 to
     *         255 alphanumeric characters</li> <li>First character must be a
     *         letter</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBInstanceRequest withDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
        return this;
    }

    /**
     * The number of days for which automated backups are retained. Setting
     * this parameter to a positive number enables backups. Setting this
     * parameter to 0 disables automated backups. <p> Default: 1
     * <p>Constraints: <ul> <li>Must be a value from 0 to 35</li> <li>Cannot
     * be set to 0 if the DB instance is a source to read replicas</li> </ul>
     *
     * @return The number of days for which automated backups are retained. Setting
     *         this parameter to a positive number enables backups. Setting this
     *         parameter to 0 disables automated backups. <p> Default: 1
     *         <p>Constraints: <ul> <li>Must be a value from 0 to 35</li> <li>Cannot
     *         be set to 0 if the DB instance is a source to read replicas</li> </ul>
     */
    public Integer getBackupRetentionPeriod() {
        return backupRetentionPeriod;
    }
    
    /**
     * The number of days for which automated backups are retained. Setting
     * this parameter to a positive number enables backups. Setting this
     * parameter to 0 disables automated backups. <p> Default: 1
     * <p>Constraints: <ul> <li>Must be a value from 0 to 35</li> <li>Cannot
     * be set to 0 if the DB instance is a source to read replicas</li> </ul>
     *
     * @param backupRetentionPeriod The number of days for which automated backups are retained. Setting
     *         this parameter to a positive number enables backups. Setting this
     *         parameter to 0 disables automated backups. <p> Default: 1
     *         <p>Constraints: <ul> <li>Must be a value from 0 to 35</li> <li>Cannot
     *         be set to 0 if the DB instance is a source to read replicas</li> </ul>
     */
    public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }
    
    /**
     * The number of days for which automated backups are retained. Setting
     * this parameter to a positive number enables backups. Setting this
     * parameter to 0 disables automated backups. <p> Default: 1
     * <p>Constraints: <ul> <li>Must be a value from 0 to 35</li> <li>Cannot
     * be set to 0 if the DB instance is a source to read replicas</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param backupRetentionPeriod The number of days for which automated backups are retained. Setting
     *         this parameter to a positive number enables backups. Setting this
     *         parameter to 0 disables automated backups. <p> Default: 1
     *         <p>Constraints: <ul> <li>Must be a value from 0 to 35</li> <li>Cannot
     *         be set to 0 if the DB instance is a source to read replicas</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBInstanceRequest withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }

    /**
     * The daily time range during which automated backups are created if
     * automated backups are enabled, using the
     * <code>BackupRetentionPeriod</code> parameter. <p> Default: A 30-minute
     * window selected at random from an 8-hour block of time per region. See
     * the Amazon RDS User Guide for the time blocks for each region from
     * which the default backup windows are assigned. <p> Constraints: Must
     * be in the format <code>hh24:mi-hh24:mi</code>. Times should be
     * Universal Time Coordinated (UTC). Must not conflict with the preferred
     * maintenance window. Must be at least 30 minutes.
     *
     * @return The daily time range during which automated backups are created if
     *         automated backups are enabled, using the
     *         <code>BackupRetentionPeriod</code> parameter. <p> Default: A 30-minute
     *         window selected at random from an 8-hour block of time per region. See
     *         the Amazon RDS User Guide for the time blocks for each region from
     *         which the default backup windows are assigned. <p> Constraints: Must
     *         be in the format <code>hh24:mi-hh24:mi</code>. Times should be
     *         Universal Time Coordinated (UTC). Must not conflict with the preferred
     *         maintenance window. Must be at least 30 minutes.
     */
    public String getPreferredBackupWindow() {
        return preferredBackupWindow;
    }
    
    /**
     * The daily time range during which automated backups are created if
     * automated backups are enabled, using the
     * <code>BackupRetentionPeriod</code> parameter. <p> Default: A 30-minute
     * window selected at random from an 8-hour block of time per region. See
     * the Amazon RDS User Guide for the time blocks for each region from
     * which the default backup windows are assigned. <p> Constraints: Must
     * be in the format <code>hh24:mi-hh24:mi</code>. Times should be
     * Universal Time Coordinated (UTC). Must not conflict with the preferred
     * maintenance window. Must be at least 30 minutes.
     *
     * @param preferredBackupWindow The daily time range during which automated backups are created if
     *         automated backups are enabled, using the
     *         <code>BackupRetentionPeriod</code> parameter. <p> Default: A 30-minute
     *         window selected at random from an 8-hour block of time per region. See
     *         the Amazon RDS User Guide for the time blocks for each region from
     *         which the default backup windows are assigned. <p> Constraints: Must
     *         be in the format <code>hh24:mi-hh24:mi</code>. Times should be
     *         Universal Time Coordinated (UTC). Must not conflict with the preferred
     *         maintenance window. Must be at least 30 minutes.
     */
    public void setPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
    }
    
    /**
     * The daily time range during which automated backups are created if
     * automated backups are enabled, using the
     * <code>BackupRetentionPeriod</code> parameter. <p> Default: A 30-minute
     * window selected at random from an 8-hour block of time per region. See
     * the Amazon RDS User Guide for the time blocks for each region from
     * which the default backup windows are assigned. <p> Constraints: Must
     * be in the format <code>hh24:mi-hh24:mi</code>. Times should be
     * Universal Time Coordinated (UTC). Must not conflict with the preferred
     * maintenance window. Must be at least 30 minutes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preferredBackupWindow The daily time range during which automated backups are created if
     *         automated backups are enabled, using the
     *         <code>BackupRetentionPeriod</code> parameter. <p> Default: A 30-minute
     *         window selected at random from an 8-hour block of time per region. See
     *         the Amazon RDS User Guide for the time blocks for each region from
     *         which the default backup windows are assigned. <p> Constraints: Must
     *         be in the format <code>hh24:mi-hh24:mi</code>. Times should be
     *         Universal Time Coordinated (UTC). Must not conflict with the preferred
     *         maintenance window. Must be at least 30 minutes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBInstanceRequest withPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
        return this;
    }

    /**
     * The port number on which the database accepts connections.
     * <p><b>MySQL</b> <p> Default: <code>3306</code> <p> Valid Values:
     * <code>1150-65535</code> <p>Type: Integer <p><b>Oracle</b> <p> Default:
     * <code>1521</code> <p> Valid Values: <code>1150-65535</code> <p><b>SQL
     * Server</b> <p> Default: <code>1433</code> <p> Valid Values:
     * <code>1150-65535</code> except for <code>1434</code> and
     * <code>3389</code>.
     *
     * @return The port number on which the database accepts connections.
     *         <p><b>MySQL</b> <p> Default: <code>3306</code> <p> Valid Values:
     *         <code>1150-65535</code> <p>Type: Integer <p><b>Oracle</b> <p> Default:
     *         <code>1521</code> <p> Valid Values: <code>1150-65535</code> <p><b>SQL
     *         Server</b> <p> Default: <code>1433</code> <p> Valid Values:
     *         <code>1150-65535</code> except for <code>1434</code> and
     *         <code>3389</code>.
     */
    public Integer getPort() {
        return port;
    }
    
    /**
     * The port number on which the database accepts connections.
     * <p><b>MySQL</b> <p> Default: <code>3306</code> <p> Valid Values:
     * <code>1150-65535</code> <p>Type: Integer <p><b>Oracle</b> <p> Default:
     * <code>1521</code> <p> Valid Values: <code>1150-65535</code> <p><b>SQL
     * Server</b> <p> Default: <code>1433</code> <p> Valid Values:
     * <code>1150-65535</code> except for <code>1434</code> and
     * <code>3389</code>.
     *
     * @param port The port number on which the database accepts connections.
     *         <p><b>MySQL</b> <p> Default: <code>3306</code> <p> Valid Values:
     *         <code>1150-65535</code> <p>Type: Integer <p><b>Oracle</b> <p> Default:
     *         <code>1521</code> <p> Valid Values: <code>1150-65535</code> <p><b>SQL
     *         Server</b> <p> Default: <code>1433</code> <p> Valid Values:
     *         <code>1150-65535</code> except for <code>1434</code> and
     *         <code>3389</code>.
     */
    public void setPort(Integer port) {
        this.port = port;
    }
    
    /**
     * The port number on which the database accepts connections.
     * <p><b>MySQL</b> <p> Default: <code>3306</code> <p> Valid Values:
     * <code>1150-65535</code> <p>Type: Integer <p><b>Oracle</b> <p> Default:
     * <code>1521</code> <p> Valid Values: <code>1150-65535</code> <p><b>SQL
     * Server</b> <p> Default: <code>1433</code> <p> Valid Values:
     * <code>1150-65535</code> except for <code>1434</code> and
     * <code>3389</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param port The port number on which the database accepts connections.
     *         <p><b>MySQL</b> <p> Default: <code>3306</code> <p> Valid Values:
     *         <code>1150-65535</code> <p>Type: Integer <p><b>Oracle</b> <p> Default:
     *         <code>1521</code> <p> Valid Values: <code>1150-65535</code> <p><b>SQL
     *         Server</b> <p> Default: <code>1433</code> <p> Valid Values:
     *         <code>1150-65535</code> except for <code>1434</code> and
     *         <code>3389</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBInstanceRequest withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Specifies if the DB instance is a Multi-AZ deployment. You cannot set
     * the AvailabilityZone parameter if the MultiAZ parameter is set to
     * true.
     *
     * @return Specifies if the DB instance is a Multi-AZ deployment. You cannot set
     *         the AvailabilityZone parameter if the MultiAZ parameter is set to
     *         true.
     */
    public Boolean isMultiAZ() {
        return multiAZ;
    }
    
    /**
     * Specifies if the DB instance is a Multi-AZ deployment. You cannot set
     * the AvailabilityZone parameter if the MultiAZ parameter is set to
     * true.
     *
     * @param multiAZ Specifies if the DB instance is a Multi-AZ deployment. You cannot set
     *         the AvailabilityZone parameter if the MultiAZ parameter is set to
     *         true.
     */
    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }
    
    /**
     * Specifies if the DB instance is a Multi-AZ deployment. You cannot set
     * the AvailabilityZone parameter if the MultiAZ parameter is set to
     * true.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param multiAZ Specifies if the DB instance is a Multi-AZ deployment. You cannot set
     *         the AvailabilityZone parameter if the MultiAZ parameter is set to
     *         true.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBInstanceRequest withMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
        return this;
    }

    /**
     * Specifies if the DB instance is a Multi-AZ deployment. You cannot set
     * the AvailabilityZone parameter if the MultiAZ parameter is set to
     * true.
     *
     * @return Specifies if the DB instance is a Multi-AZ deployment. You cannot set
     *         the AvailabilityZone parameter if the MultiAZ parameter is set to
     *         true.
     */
    public Boolean getMultiAZ() {
        return multiAZ;
    }

    /**
     * The version number of the database engine to use. <p><b>MySQL</b>
     * <p>Example: <code>5.1.42</code> <p>Type: String <p><b>Oracle</b>
     * <p>Example: <code>11.2.0.2.v2</code> <p>Type: String <p><b>SQL
     * Server</b> <p>Example: <code>10.50.2789.0.v1</code>
     *
     * @return The version number of the database engine to use. <p><b>MySQL</b>
     *         <p>Example: <code>5.1.42</code> <p>Type: String <p><b>Oracle</b>
     *         <p>Example: <code>11.2.0.2.v2</code> <p>Type: String <p><b>SQL
     *         Server</b> <p>Example: <code>10.50.2789.0.v1</code>
     */
    public String getEngineVersion() {
        return engineVersion;
    }
    
    /**
     * The version number of the database engine to use. <p><b>MySQL</b>
     * <p>Example: <code>5.1.42</code> <p>Type: String <p><b>Oracle</b>
     * <p>Example: <code>11.2.0.2.v2</code> <p>Type: String <p><b>SQL
     * Server</b> <p>Example: <code>10.50.2789.0.v1</code>
     *
     * @param engineVersion The version number of the database engine to use. <p><b>MySQL</b>
     *         <p>Example: <code>5.1.42</code> <p>Type: String <p><b>Oracle</b>
     *         <p>Example: <code>11.2.0.2.v2</code> <p>Type: String <p><b>SQL
     *         Server</b> <p>Example: <code>10.50.2789.0.v1</code>
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }
    
    /**
     * The version number of the database engine to use. <p><b>MySQL</b>
     * <p>Example: <code>5.1.42</code> <p>Type: String <p><b>Oracle</b>
     * <p>Example: <code>11.2.0.2.v2</code> <p>Type: String <p><b>SQL
     * Server</b> <p>Example: <code>10.50.2789.0.v1</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineVersion The version number of the database engine to use. <p><b>MySQL</b>
     *         <p>Example: <code>5.1.42</code> <p>Type: String <p><b>Oracle</b>
     *         <p>Example: <code>11.2.0.2.v2</code> <p>Type: String <p><b>SQL
     *         Server</b> <p>Example: <code>10.50.2789.0.v1</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBInstanceRequest withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * Indicates that minor engine upgrades will be applied automatically to
     * the DB instance during the maintenance window. <p>Default:
     * <code>true</code>
     *
     * @return Indicates that minor engine upgrades will be applied automatically to
     *         the DB instance during the maintenance window. <p>Default:
     *         <code>true</code>
     */
    public Boolean isAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }
    
    /**
     * Indicates that minor engine upgrades will be applied automatically to
     * the DB instance during the maintenance window. <p>Default:
     * <code>true</code>
     *
     * @param autoMinorVersionUpgrade Indicates that minor engine upgrades will be applied automatically to
     *         the DB instance during the maintenance window. <p>Default:
     *         <code>true</code>
     */
    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }
    
    /**
     * Indicates that minor engine upgrades will be applied automatically to
     * the DB instance during the maintenance window. <p>Default:
     * <code>true</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoMinorVersionUpgrade Indicates that minor engine upgrades will be applied automatically to
     *         the DB instance during the maintenance window. <p>Default:
     *         <code>true</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBInstanceRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        return this;
    }

    /**
     * Indicates that minor engine upgrades will be applied automatically to
     * the DB instance during the maintenance window. <p>Default:
     * <code>true</code>
     *
     * @return Indicates that minor engine upgrades will be applied automatically to
     *         the DB instance during the maintenance window. <p>Default:
     *         <code>true</code>
     */
    public Boolean getAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }

    /**
     * License model information for this DB instance. <p> Valid values:
     * <code>license-included</code> | <code>bring-your-own-license</code> |
     * <code>general-public-license</code>
     *
     * @return License model information for this DB instance. <p> Valid values:
     *         <code>license-included</code> | <code>bring-your-own-license</code> |
     *         <code>general-public-license</code>
     */
    public String getLicenseModel() {
        return licenseModel;
    }
    
    /**
     * License model information for this DB instance. <p> Valid values:
     * <code>license-included</code> | <code>bring-your-own-license</code> |
     * <code>general-public-license</code>
     *
     * @param licenseModel License model information for this DB instance. <p> Valid values:
     *         <code>license-included</code> | <code>bring-your-own-license</code> |
     *         <code>general-public-license</code>
     */
    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }
    
    /**
     * License model information for this DB instance. <p> Valid values:
     * <code>license-included</code> | <code>bring-your-own-license</code> |
     * <code>general-public-license</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param licenseModel License model information for this DB instance. <p> Valid values:
     *         <code>license-included</code> | <code>bring-your-own-license</code> |
     *         <code>general-public-license</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBInstanceRequest withLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
        return this;
    }

    /**
     * The amount of Provisioned IOPS (input/output operations per second) to
     * be initially allocated for the DB instance. <p> Constraints: Must be
     * an integer greater than 1000.
     *
     * @return The amount of Provisioned IOPS (input/output operations per second) to
     *         be initially allocated for the DB instance. <p> Constraints: Must be
     *         an integer greater than 1000.
     */
    public Integer getIops() {
        return iops;
    }
    
    /**
     * The amount of Provisioned IOPS (input/output operations per second) to
     * be initially allocated for the DB instance. <p> Constraints: Must be
     * an integer greater than 1000.
     *
     * @param iops The amount of Provisioned IOPS (input/output operations per second) to
     *         be initially allocated for the DB instance. <p> Constraints: Must be
     *         an integer greater than 1000.
     */
    public void setIops(Integer iops) {
        this.iops = iops;
    }
    
    /**
     * The amount of Provisioned IOPS (input/output operations per second) to
     * be initially allocated for the DB instance. <p> Constraints: Must be
     * an integer greater than 1000.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param iops The amount of Provisioned IOPS (input/output operations per second) to
     *         be initially allocated for the DB instance. <p> Constraints: Must be
     *         an integer greater than 1000.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBInstanceRequest withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * Indicates that the DB instance should be associated with the specified
     * option group. <p> <!-- Note that persistent options, such as the
     * TDE_SQLServer option for Microsoft SQL Server, cannot be removed from
     * an option group while DB instances are associated with the option
     * group. --> Permanent options, such as the TDE option for Oracle
     * Advanced Security TDE, cannot be removed from an option group, and
     * that option group cannot be removed from a DB instance once it is
     * associated with a DB instance
     *
     * @return Indicates that the DB instance should be associated with the specified
     *         option group. <p> <!-- Note that persistent options, such as the
     *         TDE_SQLServer option for Microsoft SQL Server, cannot be removed from
     *         an option group while DB instances are associated with the option
     *         group. --> Permanent options, such as the TDE option for Oracle
     *         Advanced Security TDE, cannot be removed from an option group, and
     *         that option group cannot be removed from a DB instance once it is
     *         associated with a DB instance
     */
    public String getOptionGroupName() {
        return optionGroupName;
    }
    
    /**
     * Indicates that the DB instance should be associated with the specified
     * option group. <p> <!-- Note that persistent options, such as the
     * TDE_SQLServer option for Microsoft SQL Server, cannot be removed from
     * an option group while DB instances are associated with the option
     * group. --> Permanent options, such as the TDE option for Oracle
     * Advanced Security TDE, cannot be removed from an option group, and
     * that option group cannot be removed from a DB instance once it is
     * associated with a DB instance
     *
     * @param optionGroupName Indicates that the DB instance should be associated with the specified
     *         option group. <p> <!-- Note that persistent options, such as the
     *         TDE_SQLServer option for Microsoft SQL Server, cannot be removed from
     *         an option group while DB instances are associated with the option
     *         group. --> Permanent options, such as the TDE option for Oracle
     *         Advanced Security TDE, cannot be removed from an option group, and
     *         that option group cannot be removed from a DB instance once it is
     *         associated with a DB instance
     */
    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }
    
    /**
     * Indicates that the DB instance should be associated with the specified
     * option group. <p> <!-- Note that persistent options, such as the
     * TDE_SQLServer option for Microsoft SQL Server, cannot be removed from
     * an option group while DB instances are associated with the option
     * group. --> Permanent options, such as the TDE option for Oracle
     * Advanced Security TDE, cannot be removed from an option group, and
     * that option group cannot be removed from a DB instance once it is
     * associated with a DB instance
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionGroupName Indicates that the DB instance should be associated with the specified
     *         option group. <p> <!-- Note that persistent options, such as the
     *         TDE_SQLServer option for Microsoft SQL Server, cannot be removed from
     *         an option group while DB instances are associated with the option
     *         group. --> Permanent options, such as the TDE option for Oracle
     *         Advanced Security TDE, cannot be removed from an option group, and
     *         that option group cannot be removed from a DB instance once it is
     *         associated with a DB instance
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBInstanceRequest withOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
        return this;
    }

    /**
     * For supported engines, indicates that the DB instance should be
     * associated with the specified CharacterSet.
     *
     * @return For supported engines, indicates that the DB instance should be
     *         associated with the specified CharacterSet.
     */
    public String getCharacterSetName() {
        return characterSetName;
    }
    
    /**
     * For supported engines, indicates that the DB instance should be
     * associated with the specified CharacterSet.
     *
     * @param characterSetName For supported engines, indicates that the DB instance should be
     *         associated with the specified CharacterSet.
     */
    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }
    
    /**
     * For supported engines, indicates that the DB instance should be
     * associated with the specified CharacterSet.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param characterSetName For supported engines, indicates that the DB instance should be
     *         associated with the specified CharacterSet.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBInstanceRequest withCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
        return this;
    }

    /**
     * Specifies the accessibility options for the DB instance. A value of
     * true specifies an Internet-facing instance with a publicly resolvable
     * DNS name, which resolves to a public IP address. A value of false
     * specifies an internal instance with a DNS name that resolves to a
     * private IP address. <p> Default: The default behavior varies depending
     * on whether a VPC has been requested or not. The following list shows
     * the default behavior in each case. <ul> <li><b>Default
     * VPC:</b>true</li> <li><b>VPC:</b>false</li> </ul> <p> If no DB subnet
     * group has been specified as part of the request and the
     * PubliclyAccessible value has not been set, the DB instance will be
     * publicly accessible. If a specific DB subnet group has been specified
     * as part of the request and the PubliclyAccessible value has not been
     * set, the DB instance will be private.
     *
     * @return Specifies the accessibility options for the DB instance. A value of
     *         true specifies an Internet-facing instance with a publicly resolvable
     *         DNS name, which resolves to a public IP address. A value of false
     *         specifies an internal instance with a DNS name that resolves to a
     *         private IP address. <p> Default: The default behavior varies depending
     *         on whether a VPC has been requested or not. The following list shows
     *         the default behavior in each case. <ul> <li><b>Default
     *         VPC:</b>true</li> <li><b>VPC:</b>false</li> </ul> <p> If no DB subnet
     *         group has been specified as part of the request and the
     *         PubliclyAccessible value has not been set, the DB instance will be
     *         publicly accessible. If a specific DB subnet group has been specified
     *         as part of the request and the PubliclyAccessible value has not been
     *         set, the DB instance will be private.
     */
    public Boolean isPubliclyAccessible() {
        return publiclyAccessible;
    }
    
    /**
     * Specifies the accessibility options for the DB instance. A value of
     * true specifies an Internet-facing instance with a publicly resolvable
     * DNS name, which resolves to a public IP address. A value of false
     * specifies an internal instance with a DNS name that resolves to a
     * private IP address. <p> Default: The default behavior varies depending
     * on whether a VPC has been requested or not. The following list shows
     * the default behavior in each case. <ul> <li><b>Default
     * VPC:</b>true</li> <li><b>VPC:</b>false</li> </ul> <p> If no DB subnet
     * group has been specified as part of the request and the
     * PubliclyAccessible value has not been set, the DB instance will be
     * publicly accessible. If a specific DB subnet group has been specified
     * as part of the request and the PubliclyAccessible value has not been
     * set, the DB instance will be private.
     *
     * @param publiclyAccessible Specifies the accessibility options for the DB instance. A value of
     *         true specifies an Internet-facing instance with a publicly resolvable
     *         DNS name, which resolves to a public IP address. A value of false
     *         specifies an internal instance with a DNS name that resolves to a
     *         private IP address. <p> Default: The default behavior varies depending
     *         on whether a VPC has been requested or not. The following list shows
     *         the default behavior in each case. <ul> <li><b>Default
     *         VPC:</b>true</li> <li><b>VPC:</b>false</li> </ul> <p> If no DB subnet
     *         group has been specified as part of the request and the
     *         PubliclyAccessible value has not been set, the DB instance will be
     *         publicly accessible. If a specific DB subnet group has been specified
     *         as part of the request and the PubliclyAccessible value has not been
     *         set, the DB instance will be private.
     */
    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }
    
    /**
     * Specifies the accessibility options for the DB instance. A value of
     * true specifies an Internet-facing instance with a publicly resolvable
     * DNS name, which resolves to a public IP address. A value of false
     * specifies an internal instance with a DNS name that resolves to a
     * private IP address. <p> Default: The default behavior varies depending
     * on whether a VPC has been requested or not. The following list shows
     * the default behavior in each case. <ul> <li><b>Default
     * VPC:</b>true</li> <li><b>VPC:</b>false</li> </ul> <p> If no DB subnet
     * group has been specified as part of the request and the
     * PubliclyAccessible value has not been set, the DB instance will be
     * publicly accessible. If a specific DB subnet group has been specified
     * as part of the request and the PubliclyAccessible value has not been
     * set, the DB instance will be private.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publiclyAccessible Specifies the accessibility options for the DB instance. A value of
     *         true specifies an Internet-facing instance with a publicly resolvable
     *         DNS name, which resolves to a public IP address. A value of false
     *         specifies an internal instance with a DNS name that resolves to a
     *         private IP address. <p> Default: The default behavior varies depending
     *         on whether a VPC has been requested or not. The following list shows
     *         the default behavior in each case. <ul> <li><b>Default
     *         VPC:</b>true</li> <li><b>VPC:</b>false</li> </ul> <p> If no DB subnet
     *         group has been specified as part of the request and the
     *         PubliclyAccessible value has not been set, the DB instance will be
     *         publicly accessible. If a specific DB subnet group has been specified
     *         as part of the request and the PubliclyAccessible value has not been
     *         set, the DB instance will be private.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBInstanceRequest withPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
        return this;
    }

    /**
     * Specifies the accessibility options for the DB instance. A value of
     * true specifies an Internet-facing instance with a publicly resolvable
     * DNS name, which resolves to a public IP address. A value of false
     * specifies an internal instance with a DNS name that resolves to a
     * private IP address. <p> Default: The default behavior varies depending
     * on whether a VPC has been requested or not. The following list shows
     * the default behavior in each case. <ul> <li><b>Default
     * VPC:</b>true</li> <li><b>VPC:</b>false</li> </ul> <p> If no DB subnet
     * group has been specified as part of the request and the
     * PubliclyAccessible value has not been set, the DB instance will be
     * publicly accessible. If a specific DB subnet group has been specified
     * as part of the request and the PubliclyAccessible value has not been
     * set, the DB instance will be private.
     *
     * @return Specifies the accessibility options for the DB instance. A value of
     *         true specifies an Internet-facing instance with a publicly resolvable
     *         DNS name, which resolves to a public IP address. A value of false
     *         specifies an internal instance with a DNS name that resolves to a
     *         private IP address. <p> Default: The default behavior varies depending
     *         on whether a VPC has been requested or not. The following list shows
     *         the default behavior in each case. <ul> <li><b>Default
     *         VPC:</b>true</li> <li><b>VPC:</b>false</li> </ul> <p> If no DB subnet
     *         group has been specified as part of the request and the
     *         PubliclyAccessible value has not been set, the DB instance will be
     *         publicly accessible. If a specific DB subnet group has been specified
     *         as part of the request and the PubliclyAccessible value has not been
     *         set, the DB instance will be private.
     */
    public Boolean getPubliclyAccessible() {
        return publiclyAccessible;
    }

    /**
     * A list of tags.
     *
     * @return A list of tags.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * A list of tags.
     *
     * @param tags A list of tags.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * A list of tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBInstanceRequest withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * A list of tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBInstanceRequest withTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
        }

        return this;
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
        if (getDBName() != null) sb.append("DBName: " + getDBName() + ",");
        if (getDBInstanceIdentifier() != null) sb.append("DBInstanceIdentifier: " + getDBInstanceIdentifier() + ",");
        if (getAllocatedStorage() != null) sb.append("AllocatedStorage: " + getAllocatedStorage() + ",");
        if (getDBInstanceClass() != null) sb.append("DBInstanceClass: " + getDBInstanceClass() + ",");
        if (getEngine() != null) sb.append("Engine: " + getEngine() + ",");
        if (getMasterUsername() != null) sb.append("MasterUsername: " + getMasterUsername() + ",");
        if (getMasterUserPassword() != null) sb.append("MasterUserPassword: " + getMasterUserPassword() + ",");
        if (getDBSecurityGroups() != null) sb.append("DBSecurityGroups: " + getDBSecurityGroups() + ",");
        if (getVpcSecurityGroupIds() != null) sb.append("VpcSecurityGroupIds: " + getVpcSecurityGroupIds() + ",");
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getDBSubnetGroupName() != null) sb.append("DBSubnetGroupName: " + getDBSubnetGroupName() + ",");
        if (getPreferredMaintenanceWindow() != null) sb.append("PreferredMaintenanceWindow: " + getPreferredMaintenanceWindow() + ",");
        if (getDBParameterGroupName() != null) sb.append("DBParameterGroupName: " + getDBParameterGroupName() + ",");
        if (getBackupRetentionPeriod() != null) sb.append("BackupRetentionPeriod: " + getBackupRetentionPeriod() + ",");
        if (getPreferredBackupWindow() != null) sb.append("PreferredBackupWindow: " + getPreferredBackupWindow() + ",");
        if (getPort() != null) sb.append("Port: " + getPort() + ",");
        if (isMultiAZ() != null) sb.append("MultiAZ: " + isMultiAZ() + ",");
        if (getEngineVersion() != null) sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (isAutoMinorVersionUpgrade() != null) sb.append("AutoMinorVersionUpgrade: " + isAutoMinorVersionUpgrade() + ",");
        if (getLicenseModel() != null) sb.append("LicenseModel: " + getLicenseModel() + ",");
        if (getIops() != null) sb.append("Iops: " + getIops() + ",");
        if (getOptionGroupName() != null) sb.append("OptionGroupName: " + getOptionGroupName() + ",");
        if (getCharacterSetName() != null) sb.append("CharacterSetName: " + getCharacterSetName() + ",");
        if (isPubliclyAccessible() != null) sb.append("PubliclyAccessible: " + isPubliclyAccessible() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDBName() == null) ? 0 : getDBName().hashCode()); 
        hashCode = prime * hashCode + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode()); 
        hashCode = prime * hashCode + ((getDBInstanceClass() == null) ? 0 : getDBInstanceClass().hashCode()); 
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode()); 
        hashCode = prime * hashCode + ((getMasterUsername() == null) ? 0 : getMasterUsername().hashCode()); 
        hashCode = prime * hashCode + ((getMasterUserPassword() == null) ? 0 : getMasterUserPassword().hashCode()); 
        hashCode = prime * hashCode + ((getDBSecurityGroups() == null) ? 0 : getDBSecurityGroups().hashCode()); 
        hashCode = prime * hashCode + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((getDBSubnetGroupName() == null) ? 0 : getDBSubnetGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode()); 
        hashCode = prime * hashCode + ((getDBParameterGroupName() == null) ? 0 : getDBParameterGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getBackupRetentionPeriod() == null) ? 0 : getBackupRetentionPeriod().hashCode()); 
        hashCode = prime * hashCode + ((getPreferredBackupWindow() == null) ? 0 : getPreferredBackupWindow().hashCode()); 
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode()); 
        hashCode = prime * hashCode + ((isMultiAZ() == null) ? 0 : isMultiAZ().hashCode()); 
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode()); 
        hashCode = prime * hashCode + ((isAutoMinorVersionUpgrade() == null) ? 0 : isAutoMinorVersionUpgrade().hashCode()); 
        hashCode = prime * hashCode + ((getLicenseModel() == null) ? 0 : getLicenseModel().hashCode()); 
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode()); 
        hashCode = prime * hashCode + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getCharacterSetName() == null) ? 0 : getCharacterSetName().hashCode()); 
        hashCode = prime * hashCode + ((isPubliclyAccessible() == null) ? 0 : isPubliclyAccessible().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateDBInstanceRequest == false) return false;
        CreateDBInstanceRequest other = (CreateDBInstanceRequest)obj;
        
        if (other.getDBName() == null ^ this.getDBName() == null) return false;
        if (other.getDBName() != null && other.getDBName().equals(this.getDBName()) == false) return false; 
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null) return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false) return false; 
        if (other.getAllocatedStorage() == null ^ this.getAllocatedStorage() == null) return false;
        if (other.getAllocatedStorage() != null && other.getAllocatedStorage().equals(this.getAllocatedStorage()) == false) return false; 
        if (other.getDBInstanceClass() == null ^ this.getDBInstanceClass() == null) return false;
        if (other.getDBInstanceClass() != null && other.getDBInstanceClass().equals(this.getDBInstanceClass()) == false) return false; 
        if (other.getEngine() == null ^ this.getEngine() == null) return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false) return false; 
        if (other.getMasterUsername() == null ^ this.getMasterUsername() == null) return false;
        if (other.getMasterUsername() != null && other.getMasterUsername().equals(this.getMasterUsername()) == false) return false; 
        if (other.getMasterUserPassword() == null ^ this.getMasterUserPassword() == null) return false;
        if (other.getMasterUserPassword() != null && other.getMasterUserPassword().equals(this.getMasterUserPassword()) == false) return false; 
        if (other.getDBSecurityGroups() == null ^ this.getDBSecurityGroups() == null) return false;
        if (other.getDBSecurityGroups() != null && other.getDBSecurityGroups().equals(this.getDBSecurityGroups()) == false) return false; 
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null) return false;
        if (other.getVpcSecurityGroupIds() != null && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.getDBSubnetGroupName() == null ^ this.getDBSubnetGroupName() == null) return false;
        if (other.getDBSubnetGroupName() != null && other.getDBSubnetGroupName().equals(this.getDBSubnetGroupName()) == false) return false; 
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null) return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false) return false; 
        if (other.getDBParameterGroupName() == null ^ this.getDBParameterGroupName() == null) return false;
        if (other.getDBParameterGroupName() != null && other.getDBParameterGroupName().equals(this.getDBParameterGroupName()) == false) return false; 
        if (other.getBackupRetentionPeriod() == null ^ this.getBackupRetentionPeriod() == null) return false;
        if (other.getBackupRetentionPeriod() != null && other.getBackupRetentionPeriod().equals(this.getBackupRetentionPeriod()) == false) return false; 
        if (other.getPreferredBackupWindow() == null ^ this.getPreferredBackupWindow() == null) return false;
        if (other.getPreferredBackupWindow() != null && other.getPreferredBackupWindow().equals(this.getPreferredBackupWindow()) == false) return false; 
        if (other.getPort() == null ^ this.getPort() == null) return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false) return false; 
        if (other.isMultiAZ() == null ^ this.isMultiAZ() == null) return false;
        if (other.isMultiAZ() != null && other.isMultiAZ().equals(this.isMultiAZ()) == false) return false; 
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null) return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false) return false; 
        if (other.isAutoMinorVersionUpgrade() == null ^ this.isAutoMinorVersionUpgrade() == null) return false;
        if (other.isAutoMinorVersionUpgrade() != null && other.isAutoMinorVersionUpgrade().equals(this.isAutoMinorVersionUpgrade()) == false) return false; 
        if (other.getLicenseModel() == null ^ this.getLicenseModel() == null) return false;
        if (other.getLicenseModel() != null && other.getLicenseModel().equals(this.getLicenseModel()) == false) return false; 
        if (other.getIops() == null ^ this.getIops() == null) return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false) return false; 
        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null) return false;
        if (other.getOptionGroupName() != null && other.getOptionGroupName().equals(this.getOptionGroupName()) == false) return false; 
        if (other.getCharacterSetName() == null ^ this.getCharacterSetName() == null) return false;
        if (other.getCharacterSetName() != null && other.getCharacterSetName().equals(this.getCharacterSetName()) == false) return false; 
        if (other.isPubliclyAccessible() == null ^ this.isPubliclyAccessible() == null) return false;
        if (other.isPubliclyAccessible() != null && other.isPubliclyAccessible().equals(this.isPubliclyAccessible()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
}
    