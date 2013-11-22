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
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#createDBInstanceReadReplica(CreateDBInstanceReadReplicaRequest) CreateDBInstanceReadReplica operation}.
 * <p>
 * Creates a DB instance that acts as a read replica of a source DB instance.
 * </p>
 * <p>
 * All read replica DB instances are created as Single-AZ deployments with backups disabled. All other DB instance attributes (including DB security
 * groups and DB parameter groups) are inherited from the source DB instance, except as specified below.
 * </p>
 * <p>
 * <b>IMPORTANT:</b> The source DB instance must have backup retention enabled.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#createDBInstanceReadReplica(CreateDBInstanceReadReplicaRequest)
 */
public class CreateDBInstanceReadReplicaRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The DB instance identifier of the read replica. This is the unique key
     * that identifies a DB instance. This parameter is stored as a lowercase
     * string.
     */
    private String dBInstanceIdentifier;

    /**
     * The identifier of the DB instance that will act as the source for the
     * read replica. Each DB instance can have up to five read replicas.
     * <p>Constraints: <ul> <li>Must be the identifier of an existing DB
     * instance.</li> <li>Can specify a DB instance that is a read replica
     * only if the source is running MySQL 5.6.</li> <li>The specified DB
     * instance must have automatic backups enabled, its backup retention
     * period must be greater than 0.</li> </ul>
     */
    private String sourceDBInstanceIdentifier;

    /**
     * The compute and memory capacity of the read replica. <p> Valid Values:
     * <code>db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge |
     * db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge</code> <p>Default:
     * Inherits from the source DB instance.
     */
    private String dBInstanceClass;

    /**
     * The Amazon EC2 Availability Zone that the read replica will be created
     * in. <p> Default: A random, system-chosen Availability Zone in the
     * endpoint's region. <p> Example: <code>us-east-1d</code>
     */
    private String availabilityZone;

    /**
     * The port number that the DB instance uses for connections. <p>Default:
     * Inherits from the source DB instance <p>Valid Values:
     * <code>1150-65535</code>
     */
    private Integer port;

    /**
     * Indicates that minor engine upgrades will be applied automatically to
     * the read replica during the maintenance window. <p>Default: Inherits
     * from the source DB instance
     */
    private Boolean autoMinorVersionUpgrade;

    /**
     * The amount of Provisioned IOPS (input/output operations per second) to
     * be initially allocated for the DB instance.
     */
    private Integer iops;

    /**
     * The option group the DB instance will be associated with. If omitted,
     * the default option group for the engine specified will be used.
     */
    private String optionGroupName;

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
     * A DB Subnet Group to associate with this DB Instance in case of a
     * cross region read replica. <p>If there is no DB Subnet Group, then it
     * is a non-VPC DB instance. <p> Constraints: All the cross region read
     * replicas that share the source instance should lie within the same
     * VPC.
     */
    private String dBSubnetGroupName;

    /**
     * Default constructor for a new CreateDBInstanceReadReplicaRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateDBInstanceReadReplicaRequest() {}
    
    /**
     * Constructs a new CreateDBInstanceReadReplicaRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param dBInstanceIdentifier The DB instance identifier of the read
     * replica. This is the unique key that identifies a DB instance. This
     * parameter is stored as a lowercase string.
     * @param sourceDBInstanceIdentifier The identifier of the DB instance
     * that will act as the source for the read replica. Each DB instance can
     * have up to five read replicas. <p>Constraints: <ul> <li>Must be the
     * identifier of an existing DB instance.</li> <li>Can specify a DB
     * instance that is a read replica only if the source is running MySQL
     * 5.6.</li> <li>The specified DB instance must have automatic backups
     * enabled, its backup retention period must be greater than 0.</li>
     * </ul>
     */
    public CreateDBInstanceReadReplicaRequest(String dBInstanceIdentifier, String sourceDBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
        setSourceDBInstanceIdentifier(sourceDBInstanceIdentifier);
    }

    /**
     * The DB instance identifier of the read replica. This is the unique key
     * that identifies a DB instance. This parameter is stored as a lowercase
     * string.
     *
     * @return The DB instance identifier of the read replica. This is the unique key
     *         that identifies a DB instance. This parameter is stored as a lowercase
     *         string.
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }
    
    /**
     * The DB instance identifier of the read replica. This is the unique key
     * that identifies a DB instance. This parameter is stored as a lowercase
     * string.
     *
     * @param dBInstanceIdentifier The DB instance identifier of the read replica. This is the unique key
     *         that identifies a DB instance. This parameter is stored as a lowercase
     *         string.
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }
    
    /**
     * The DB instance identifier of the read replica. This is the unique key
     * that identifies a DB instance. This parameter is stored as a lowercase
     * string.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceIdentifier The DB instance identifier of the read replica. This is the unique key
     *         that identifies a DB instance. This parameter is stored as a lowercase
     *         string.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBInstanceReadReplicaRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        return this;
    }

    /**
     * The identifier of the DB instance that will act as the source for the
     * read replica. Each DB instance can have up to five read replicas.
     * <p>Constraints: <ul> <li>Must be the identifier of an existing DB
     * instance.</li> <li>Can specify a DB instance that is a read replica
     * only if the source is running MySQL 5.6.</li> <li>The specified DB
     * instance must have automatic backups enabled, its backup retention
     * period must be greater than 0.</li> </ul>
     *
     * @return The identifier of the DB instance that will act as the source for the
     *         read replica. Each DB instance can have up to five read replicas.
     *         <p>Constraints: <ul> <li>Must be the identifier of an existing DB
     *         instance.</li> <li>Can specify a DB instance that is a read replica
     *         only if the source is running MySQL 5.6.</li> <li>The specified DB
     *         instance must have automatic backups enabled, its backup retention
     *         period must be greater than 0.</li> </ul>
     */
    public String getSourceDBInstanceIdentifier() {
        return sourceDBInstanceIdentifier;
    }
    
    /**
     * The identifier of the DB instance that will act as the source for the
     * read replica. Each DB instance can have up to five read replicas.
     * <p>Constraints: <ul> <li>Must be the identifier of an existing DB
     * instance.</li> <li>Can specify a DB instance that is a read replica
     * only if the source is running MySQL 5.6.</li> <li>The specified DB
     * instance must have automatic backups enabled, its backup retention
     * period must be greater than 0.</li> </ul>
     *
     * @param sourceDBInstanceIdentifier The identifier of the DB instance that will act as the source for the
     *         read replica. Each DB instance can have up to five read replicas.
     *         <p>Constraints: <ul> <li>Must be the identifier of an existing DB
     *         instance.</li> <li>Can specify a DB instance that is a read replica
     *         only if the source is running MySQL 5.6.</li> <li>The specified DB
     *         instance must have automatic backups enabled, its backup retention
     *         period must be greater than 0.</li> </ul>
     */
    public void setSourceDBInstanceIdentifier(String sourceDBInstanceIdentifier) {
        this.sourceDBInstanceIdentifier = sourceDBInstanceIdentifier;
    }
    
    /**
     * The identifier of the DB instance that will act as the source for the
     * read replica. Each DB instance can have up to five read replicas.
     * <p>Constraints: <ul> <li>Must be the identifier of an existing DB
     * instance.</li> <li>Can specify a DB instance that is a read replica
     * only if the source is running MySQL 5.6.</li> <li>The specified DB
     * instance must have automatic backups enabled, its backup retention
     * period must be greater than 0.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceDBInstanceIdentifier The identifier of the DB instance that will act as the source for the
     *         read replica. Each DB instance can have up to five read replicas.
     *         <p>Constraints: <ul> <li>Must be the identifier of an existing DB
     *         instance.</li> <li>Can specify a DB instance that is a read replica
     *         only if the source is running MySQL 5.6.</li> <li>The specified DB
     *         instance must have automatic backups enabled, its backup retention
     *         period must be greater than 0.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBInstanceReadReplicaRequest withSourceDBInstanceIdentifier(String sourceDBInstanceIdentifier) {
        this.sourceDBInstanceIdentifier = sourceDBInstanceIdentifier;
        return this;
    }

    /**
     * The compute and memory capacity of the read replica. <p> Valid Values:
     * <code>db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge |
     * db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge</code> <p>Default:
     * Inherits from the source DB instance.
     *
     * @return The compute and memory capacity of the read replica. <p> Valid Values:
     *         <code>db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge |
     *         db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge</code> <p>Default:
     *         Inherits from the source DB instance.
     */
    public String getDBInstanceClass() {
        return dBInstanceClass;
    }
    
    /**
     * The compute and memory capacity of the read replica. <p> Valid Values:
     * <code>db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge |
     * db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge</code> <p>Default:
     * Inherits from the source DB instance.
     *
     * @param dBInstanceClass The compute and memory capacity of the read replica. <p> Valid Values:
     *         <code>db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge |
     *         db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge</code> <p>Default:
     *         Inherits from the source DB instance.
     */
    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }
    
    /**
     * The compute and memory capacity of the read replica. <p> Valid Values:
     * <code>db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge |
     * db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge</code> <p>Default:
     * Inherits from the source DB instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceClass The compute and memory capacity of the read replica. <p> Valid Values:
     *         <code>db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge |
     *         db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge</code> <p>Default:
     *         Inherits from the source DB instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBInstanceReadReplicaRequest withDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
        return this;
    }

    /**
     * The Amazon EC2 Availability Zone that the read replica will be created
     * in. <p> Default: A random, system-chosen Availability Zone in the
     * endpoint's region. <p> Example: <code>us-east-1d</code>
     *
     * @return The Amazon EC2 Availability Zone that the read replica will be created
     *         in. <p> Default: A random, system-chosen Availability Zone in the
     *         endpoint's region. <p> Example: <code>us-east-1d</code>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The Amazon EC2 Availability Zone that the read replica will be created
     * in. <p> Default: A random, system-chosen Availability Zone in the
     * endpoint's region. <p> Example: <code>us-east-1d</code>
     *
     * @param availabilityZone The Amazon EC2 Availability Zone that the read replica will be created
     *         in. <p> Default: A random, system-chosen Availability Zone in the
     *         endpoint's region. <p> Example: <code>us-east-1d</code>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The Amazon EC2 Availability Zone that the read replica will be created
     * in. <p> Default: A random, system-chosen Availability Zone in the
     * endpoint's region. <p> Example: <code>us-east-1d</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZone The Amazon EC2 Availability Zone that the read replica will be created
     *         in. <p> Default: A random, system-chosen Availability Zone in the
     *         endpoint's region. <p> Example: <code>us-east-1d</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBInstanceReadReplicaRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * The port number that the DB instance uses for connections. <p>Default:
     * Inherits from the source DB instance <p>Valid Values:
     * <code>1150-65535</code>
     *
     * @return The port number that the DB instance uses for connections. <p>Default:
     *         Inherits from the source DB instance <p>Valid Values:
     *         <code>1150-65535</code>
     */
    public Integer getPort() {
        return port;
    }
    
    /**
     * The port number that the DB instance uses for connections. <p>Default:
     * Inherits from the source DB instance <p>Valid Values:
     * <code>1150-65535</code>
     *
     * @param port The port number that the DB instance uses for connections. <p>Default:
     *         Inherits from the source DB instance <p>Valid Values:
     *         <code>1150-65535</code>
     */
    public void setPort(Integer port) {
        this.port = port;
    }
    
    /**
     * The port number that the DB instance uses for connections. <p>Default:
     * Inherits from the source DB instance <p>Valid Values:
     * <code>1150-65535</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param port The port number that the DB instance uses for connections. <p>Default:
     *         Inherits from the source DB instance <p>Valid Values:
     *         <code>1150-65535</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBInstanceReadReplicaRequest withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Indicates that minor engine upgrades will be applied automatically to
     * the read replica during the maintenance window. <p>Default: Inherits
     * from the source DB instance
     *
     * @return Indicates that minor engine upgrades will be applied automatically to
     *         the read replica during the maintenance window. <p>Default: Inherits
     *         from the source DB instance
     */
    public Boolean isAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }
    
    /**
     * Indicates that minor engine upgrades will be applied automatically to
     * the read replica during the maintenance window. <p>Default: Inherits
     * from the source DB instance
     *
     * @param autoMinorVersionUpgrade Indicates that minor engine upgrades will be applied automatically to
     *         the read replica during the maintenance window. <p>Default: Inherits
     *         from the source DB instance
     */
    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }
    
    /**
     * Indicates that minor engine upgrades will be applied automatically to
     * the read replica during the maintenance window. <p>Default: Inherits
     * from the source DB instance
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoMinorVersionUpgrade Indicates that minor engine upgrades will be applied automatically to
     *         the read replica during the maintenance window. <p>Default: Inherits
     *         from the source DB instance
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBInstanceReadReplicaRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        return this;
    }

    /**
     * Indicates that minor engine upgrades will be applied automatically to
     * the read replica during the maintenance window. <p>Default: Inherits
     * from the source DB instance
     *
     * @return Indicates that minor engine upgrades will be applied automatically to
     *         the read replica during the maintenance window. <p>Default: Inherits
     *         from the source DB instance
     */
    public Boolean getAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }

    /**
     * The amount of Provisioned IOPS (input/output operations per second) to
     * be initially allocated for the DB instance.
     *
     * @return The amount of Provisioned IOPS (input/output operations per second) to
     *         be initially allocated for the DB instance.
     */
    public Integer getIops() {
        return iops;
    }
    
    /**
     * The amount of Provisioned IOPS (input/output operations per second) to
     * be initially allocated for the DB instance.
     *
     * @param iops The amount of Provisioned IOPS (input/output operations per second) to
     *         be initially allocated for the DB instance.
     */
    public void setIops(Integer iops) {
        this.iops = iops;
    }
    
    /**
     * The amount of Provisioned IOPS (input/output operations per second) to
     * be initially allocated for the DB instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param iops The amount of Provisioned IOPS (input/output operations per second) to
     *         be initially allocated for the DB instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBInstanceReadReplicaRequest withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * The option group the DB instance will be associated with. If omitted,
     * the default option group for the engine specified will be used.
     *
     * @return The option group the DB instance will be associated with. If omitted,
     *         the default option group for the engine specified will be used.
     */
    public String getOptionGroupName() {
        return optionGroupName;
    }
    
    /**
     * The option group the DB instance will be associated with. If omitted,
     * the default option group for the engine specified will be used.
     *
     * @param optionGroupName The option group the DB instance will be associated with. If omitted,
     *         the default option group for the engine specified will be used.
     */
    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }
    
    /**
     * The option group the DB instance will be associated with. If omitted,
     * the default option group for the engine specified will be used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionGroupName The option group the DB instance will be associated with. If omitted,
     *         the default option group for the engine specified will be used.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBInstanceReadReplicaRequest withOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
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
    public CreateDBInstanceReadReplicaRequest withPubliclyAccessible(Boolean publiclyAccessible) {
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
    public CreateDBInstanceReadReplicaRequest withTags(Tag... tags) {
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
    public CreateDBInstanceReadReplicaRequest withTags(java.util.Collection<Tag> tags) {
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
     * A DB Subnet Group to associate with this DB Instance in case of a
     * cross region read replica. <p>If there is no DB Subnet Group, then it
     * is a non-VPC DB instance. <p> Constraints: All the cross region read
     * replicas that share the source instance should lie within the same
     * VPC.
     *
     * @return A DB Subnet Group to associate with this DB Instance in case of a
     *         cross region read replica. <p>If there is no DB Subnet Group, then it
     *         is a non-VPC DB instance. <p> Constraints: All the cross region read
     *         replicas that share the source instance should lie within the same
     *         VPC.
     */
    public String getDBSubnetGroupName() {
        return dBSubnetGroupName;
    }
    
    /**
     * A DB Subnet Group to associate with this DB Instance in case of a
     * cross region read replica. <p>If there is no DB Subnet Group, then it
     * is a non-VPC DB instance. <p> Constraints: All the cross region read
     * replicas that share the source instance should lie within the same
     * VPC.
     *
     * @param dBSubnetGroupName A DB Subnet Group to associate with this DB Instance in case of a
     *         cross region read replica. <p>If there is no DB Subnet Group, then it
     *         is a non-VPC DB instance. <p> Constraints: All the cross region read
     *         replicas that share the source instance should lie within the same
     *         VPC.
     */
    public void setDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
    }
    
    /**
     * A DB Subnet Group to associate with this DB Instance in case of a
     * cross region read replica. <p>If there is no DB Subnet Group, then it
     * is a non-VPC DB instance. <p> Constraints: All the cross region read
     * replicas that share the source instance should lie within the same
     * VPC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSubnetGroupName A DB Subnet Group to associate with this DB Instance in case of a
     *         cross region read replica. <p>If there is no DB Subnet Group, then it
     *         is a non-VPC DB instance. <p> Constraints: All the cross region read
     *         replicas that share the source instance should lie within the same
     *         VPC.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateDBInstanceReadReplicaRequest withDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
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
        if (getDBInstanceIdentifier() != null) sb.append("DBInstanceIdentifier: " + getDBInstanceIdentifier() + ",");
        if (getSourceDBInstanceIdentifier() != null) sb.append("SourceDBInstanceIdentifier: " + getSourceDBInstanceIdentifier() + ",");
        if (getDBInstanceClass() != null) sb.append("DBInstanceClass: " + getDBInstanceClass() + ",");
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getPort() != null) sb.append("Port: " + getPort() + ",");
        if (isAutoMinorVersionUpgrade() != null) sb.append("AutoMinorVersionUpgrade: " + isAutoMinorVersionUpgrade() + ",");
        if (getIops() != null) sb.append("Iops: " + getIops() + ",");
        if (getOptionGroupName() != null) sb.append("OptionGroupName: " + getOptionGroupName() + ",");
        if (isPubliclyAccessible() != null) sb.append("PubliclyAccessible: " + isPubliclyAccessible() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() + ",");
        if (getDBSubnetGroupName() != null) sb.append("DBSubnetGroupName: " + getDBSubnetGroupName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getSourceDBInstanceIdentifier() == null) ? 0 : getSourceDBInstanceIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getDBInstanceClass() == null) ? 0 : getDBInstanceClass().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode()); 
        hashCode = prime * hashCode + ((isAutoMinorVersionUpgrade() == null) ? 0 : isAutoMinorVersionUpgrade().hashCode()); 
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode()); 
        hashCode = prime * hashCode + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode()); 
        hashCode = prime * hashCode + ((isPubliclyAccessible() == null) ? 0 : isPubliclyAccessible().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        hashCode = prime * hashCode + ((getDBSubnetGroupName() == null) ? 0 : getDBSubnetGroupName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateDBInstanceReadReplicaRequest == false) return false;
        CreateDBInstanceReadReplicaRequest other = (CreateDBInstanceReadReplicaRequest)obj;
        
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null) return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false) return false; 
        if (other.getSourceDBInstanceIdentifier() == null ^ this.getSourceDBInstanceIdentifier() == null) return false;
        if (other.getSourceDBInstanceIdentifier() != null && other.getSourceDBInstanceIdentifier().equals(this.getSourceDBInstanceIdentifier()) == false) return false; 
        if (other.getDBInstanceClass() == null ^ this.getDBInstanceClass() == null) return false;
        if (other.getDBInstanceClass() != null && other.getDBInstanceClass().equals(this.getDBInstanceClass()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.getPort() == null ^ this.getPort() == null) return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false) return false; 
        if (other.isAutoMinorVersionUpgrade() == null ^ this.isAutoMinorVersionUpgrade() == null) return false;
        if (other.isAutoMinorVersionUpgrade() != null && other.isAutoMinorVersionUpgrade().equals(this.isAutoMinorVersionUpgrade()) == false) return false; 
        if (other.getIops() == null ^ this.getIops() == null) return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false) return false; 
        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null) return false;
        if (other.getOptionGroupName() != null && other.getOptionGroupName().equals(this.getOptionGroupName()) == false) return false; 
        if (other.isPubliclyAccessible() == null ^ this.isPubliclyAccessible() == null) return false;
        if (other.isPubliclyAccessible() != null && other.isPubliclyAccessible().equals(this.isPubliclyAccessible()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        if (other.getDBSubnetGroupName() == null ^ this.getDBSubnetGroupName() == null) return false;
        if (other.getDBSubnetGroupName() != null && other.getDBSubnetGroupName().equals(this.getDBSubnetGroupName()) == false) return false; 
        return true;
    }
    
}
    