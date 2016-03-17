/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#createDBCluster(CreateDBClusterRequest) CreateDBCluster operation}.
 * <p>
 * Creates a new Amazon Aurora DB cluster. For more information on Amazon
 * Aurora, see
 * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html"> Aurora on Amazon RDS </a>
 * in the <i>Amazon RDS User Guide.</i>
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#createDBCluster(CreateDBClusterRequest)
 */
public class CreateDBClusterRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * A list of EC2 Availability Zones that instances in the DB cluster can
     * be created in. For information on regions and Availability Zones, see
     * <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html">Regions
     * and Availability Zones</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> availabilityZones;

    /**
     * The number of days for which automated backups are retained. You must
     * specify a minimum value of 1. <p>Default: 1 <p>Constraints: <ul>
     * <li>Must be a value from 1 to 35</li> </ul>
     */
    private Integer backupRetentionPeriod;

    /**
     * A value that indicates that the DB cluster should be associated with
     * the specified CharacterSet.
     */
    private String characterSetName;

    /**
     * The name for your database of up to 8 alpha-numeric characters. If you
     * do not provide a name, Amazon RDS will not create a database in the DB
     * cluster you are creating.
     */
    private String databaseName;

    /**
     * The DB cluster identifier. This parameter is stored as a lowercase
     * string. <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens.</li> <li>First character must be a
     * letter.</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens.</li> </ul> <p>Example: <code>my-cluster1</code>
     */
    private String dBClusterIdentifier;

    /**
     * The name of the DB cluster parameter group to associate with this DB
     * cluster. If this argument is omitted, <code>default.aurora5.6</code>
     * for the specified engine will be used. <p> Constraints: <ul> <li>Must
     * be 1 to 255 alphanumeric characters</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul>
     */
    private String dBClusterParameterGroupName;

    /**
     * A list of EC2 VPC security groups to associate with this DB cluster.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> vpcSecurityGroupIds;

    /**
     * A DB subnet group to associate with this DB cluster. <p>Constraints:
     * Must contain no more than 255 alphanumeric characters, periods,
     * underscores, spaces, or hyphens. Must not be default. <p>Example:
     * <code>mySubnetgroup</code>
     */
    private String dBSubnetGroupName;

    /**
     * The name of the database engine to be used for this DB cluster.
     * <p>Valid Values: <code>aurora</code>
     */
    private String engine;

    /**
     * The version number of the database engine to use. <p> <b>Aurora</b>
     * <p>Example: <code>5.6.10a</code>
     */
    private String engineVersion;

    /**
     * The port number on which the instances in the DB cluster accept
     * connections. <p> Default: <code>3306</code>
     */
    private Integer port;

    /**
     * The name of the master user for the client DB cluster. <p>Constraints:
     * <ul> <li>Must be 1 to 16 alphanumeric characters.</li> <li>First
     * character must be a letter.</li> <li>Cannot be a reserved word for the
     * chosen database engine.</li> </ul>
     */
    private String masterUsername;

    /**
     * The password for the master database user. This password can contain
     * any printable ASCII character except "/", """, or "@". <p>Constraints:
     * Must contain from 8 to 41 characters.
     */
    private String masterUserPassword;

    /**
     * A value that indicates that the DB cluster should be associated with
     * the specified option group. <p>Permanent options cannot be removed
     * from an option group. The option group cannot be removed from a DB
     * cluster once it is associated with a DB cluster.
     */
    private String optionGroupName;

    /**
     * The daily time range during which automated backups are created if
     * automated backups are enabled using the
     * <code>BackupRetentionPeriod</code> parameter. <p>Default: A 30-minute
     * window selected at random from an 8-hour block of time per region. To
     * see the time blocks available, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     * Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     * User Guide.</i> <p>Constraints: <ul> <li>Must be in the format
     * <code>hh24:mi-hh24:mi</code>.</li> <li>Times should be in Universal
     * Coordinated Time (UTC).</li> <li>Must not conflict with the preferred
     * maintenance window.</li> <li>Must be at least 30 minutes.</li> </ul>
     */
    private String preferredBackupWindow;

    /**
     * The weekly time range during which system maintenance can occur, in
     * Universal Coordinated Time (UTC). <p> Format:
     * <code>ddd:hh24:mi-ddd:hh24:mi</code> <p>Default: A 30-minute window
     * selected at random from an 8-hour block of time per region, occurring
     * on a random day of the week. To see the time blocks available, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     * Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     * User Guide.</i> <p>Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * <p>Constraints: Minimum 30-minute window.
     */
    private String preferredMaintenanceWindow;

    /**
     * A list of tags.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * Specifies whether the DB cluster is encrypted.
     */
    private Boolean storageEncrypted;

    /**
     * The KMS key identifier for an encrypted DB cluster. <p>The KMS key
     * identifier is the Amazon Resource Name (ARN) for the KMS encryption
     * key. If you are creating a DB cluster with the same AWS account that
     * owns the KMS encryption key used to encrypt the new DB cluster, then
     * you can use the KMS key alias instead of the ARN for the KM encryption
     * key. <p>If the <code>StorageEncrypted</code> parameter is true, and
     * you do not specify a value for the <code>KmsKeyId</code> parameter,
     * then Amazon RDS will use your default encryption key. AWS KMS creates
     * the default encryption key for your AWS account. Your AWS account has
     * a different default encryption key for each AWS region.
     */
    private String kmsKeyId;

    /**
     * A list of EC2 Availability Zones that instances in the DB cluster can
     * be created in. For information on regions and Availability Zones, see
     * <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html">Regions
     * and Availability Zones</a>.
     *
     * @return A list of EC2 Availability Zones that instances in the DB cluster can
     *         be created in. For information on regions and Availability Zones, see
     *         <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html">Regions
     *         and Availability Zones</a>.
     */
    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
              availabilityZones = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              availabilityZones.setAutoConstruct(true);
        }
        return availabilityZones;
    }
    
    /**
     * A list of EC2 Availability Zones that instances in the DB cluster can
     * be created in. For information on regions and Availability Zones, see
     * <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html">Regions
     * and Availability Zones</a>.
     *
     * @param availabilityZones A list of EC2 Availability Zones that instances in the DB cluster can
     *         be created in. For information on regions and Availability Zones, see
     *         <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html">Regions
     *         and Availability Zones</a>.
     */
    public void setAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> availabilityZonesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(availabilityZones.size());
        availabilityZonesCopy.addAll(availabilityZones);
        this.availabilityZones = availabilityZonesCopy;
    }
    
    /**
     * A list of EC2 Availability Zones that instances in the DB cluster can
     * be created in. For information on regions and Availability Zones, see
     * <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html">Regions
     * and Availability Zones</a>.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAvailabilityZones(java.util.Collection)} or
     * {@link #withAvailabilityZones(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones A list of EC2 Availability Zones that instances in the DB cluster can
     *         be created in. For information on regions and Availability Zones, see
     *         <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html">Regions
     *         and Availability Zones</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBClusterRequest withAvailabilityZones(String... availabilityZones) {
        if (getAvailabilityZones() == null) setAvailabilityZones(new java.util.ArrayList<String>(availabilityZones.length));
        for (String value : availabilityZones) {
            getAvailabilityZones().add(value);
        }
        return this;
    }
    
    /**
     * A list of EC2 Availability Zones that instances in the DB cluster can
     * be created in. For information on regions and Availability Zones, see
     * <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html">Regions
     * and Availability Zones</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones A list of EC2 Availability Zones that instances in the DB cluster can
     *         be created in. For information on regions and Availability Zones, see
     *         <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html">Regions
     *         and Availability Zones</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBClusterRequest withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> availabilityZonesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(availabilityZones.size());
            availabilityZonesCopy.addAll(availabilityZones);
            this.availabilityZones = availabilityZonesCopy;
        }

        return this;
    }

    /**
     * The number of days for which automated backups are retained. You must
     * specify a minimum value of 1. <p>Default: 1 <p>Constraints: <ul>
     * <li>Must be a value from 1 to 35</li> </ul>
     *
     * @return The number of days for which automated backups are retained. You must
     *         specify a minimum value of 1. <p>Default: 1 <p>Constraints: <ul>
     *         <li>Must be a value from 1 to 35</li> </ul>
     */
    public Integer getBackupRetentionPeriod() {
        return backupRetentionPeriod;
    }
    
    /**
     * The number of days for which automated backups are retained. You must
     * specify a minimum value of 1. <p>Default: 1 <p>Constraints: <ul>
     * <li>Must be a value from 1 to 35</li> </ul>
     *
     * @param backupRetentionPeriod The number of days for which automated backups are retained. You must
     *         specify a minimum value of 1. <p>Default: 1 <p>Constraints: <ul>
     *         <li>Must be a value from 1 to 35</li> </ul>
     */
    public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }
    
    /**
     * The number of days for which automated backups are retained. You must
     * specify a minimum value of 1. <p>Default: 1 <p>Constraints: <ul>
     * <li>Must be a value from 1 to 35</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param backupRetentionPeriod The number of days for which automated backups are retained. You must
     *         specify a minimum value of 1. <p>Default: 1 <p>Constraints: <ul>
     *         <li>Must be a value from 1 to 35</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBClusterRequest withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }

    /**
     * A value that indicates that the DB cluster should be associated with
     * the specified CharacterSet.
     *
     * @return A value that indicates that the DB cluster should be associated with
     *         the specified CharacterSet.
     */
    public String getCharacterSetName() {
        return characterSetName;
    }
    
    /**
     * A value that indicates that the DB cluster should be associated with
     * the specified CharacterSet.
     *
     * @param characterSetName A value that indicates that the DB cluster should be associated with
     *         the specified CharacterSet.
     */
    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }
    
    /**
     * A value that indicates that the DB cluster should be associated with
     * the specified CharacterSet.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param characterSetName A value that indicates that the DB cluster should be associated with
     *         the specified CharacterSet.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBClusterRequest withCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
        return this;
    }

    /**
     * The name for your database of up to 8 alpha-numeric characters. If you
     * do not provide a name, Amazon RDS will not create a database in the DB
     * cluster you are creating.
     *
     * @return The name for your database of up to 8 alpha-numeric characters. If you
     *         do not provide a name, Amazon RDS will not create a database in the DB
     *         cluster you are creating.
     */
    public String getDatabaseName() {
        return databaseName;
    }
    
    /**
     * The name for your database of up to 8 alpha-numeric characters. If you
     * do not provide a name, Amazon RDS will not create a database in the DB
     * cluster you are creating.
     *
     * @param databaseName The name for your database of up to 8 alpha-numeric characters. If you
     *         do not provide a name, Amazon RDS will not create a database in the DB
     *         cluster you are creating.
     */
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }
    
    /**
     * The name for your database of up to 8 alpha-numeric characters. If you
     * do not provide a name, Amazon RDS will not create a database in the DB
     * cluster you are creating.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param databaseName The name for your database of up to 8 alpha-numeric characters. If you
     *         do not provide a name, Amazon RDS will not create a database in the DB
     *         cluster you are creating.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBClusterRequest withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * The DB cluster identifier. This parameter is stored as a lowercase
     * string. <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens.</li> <li>First character must be a
     * letter.</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens.</li> </ul> <p>Example: <code>my-cluster1</code>
     *
     * @return The DB cluster identifier. This parameter is stored as a lowercase
     *         string. <p>Constraints: <ul> <li>Must contain from 1 to 63
     *         alphanumeric characters or hyphens.</li> <li>First character must be a
     *         letter.</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens.</li> </ul> <p>Example: <code>my-cluster1</code>
     */
    public String getDBClusterIdentifier() {
        return dBClusterIdentifier;
    }
    
    /**
     * The DB cluster identifier. This parameter is stored as a lowercase
     * string. <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens.</li> <li>First character must be a
     * letter.</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens.</li> </ul> <p>Example: <code>my-cluster1</code>
     *
     * @param dBClusterIdentifier The DB cluster identifier. This parameter is stored as a lowercase
     *         string. <p>Constraints: <ul> <li>Must contain from 1 to 63
     *         alphanumeric characters or hyphens.</li> <li>First character must be a
     *         letter.</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens.</li> </ul> <p>Example: <code>my-cluster1</code>
     */
    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }
    
    /**
     * The DB cluster identifier. This parameter is stored as a lowercase
     * string. <p>Constraints: <ul> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens.</li> <li>First character must be a
     * letter.</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens.</li> </ul> <p>Example: <code>my-cluster1</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBClusterIdentifier The DB cluster identifier. This parameter is stored as a lowercase
     *         string. <p>Constraints: <ul> <li>Must contain from 1 to 63
     *         alphanumeric characters or hyphens.</li> <li>First character must be a
     *         letter.</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens.</li> </ul> <p>Example: <code>my-cluster1</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBClusterRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
        return this;
    }

    /**
     * The name of the DB cluster parameter group to associate with this DB
     * cluster. If this argument is omitted, <code>default.aurora5.6</code>
     * for the specified engine will be used. <p> Constraints: <ul> <li>Must
     * be 1 to 255 alphanumeric characters</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul>
     *
     * @return The name of the DB cluster parameter group to associate with this DB
     *         cluster. If this argument is omitted, <code>default.aurora5.6</code>
     *         for the specified engine will be used. <p> Constraints: <ul> <li>Must
     *         be 1 to 255 alphanumeric characters</li> <li>First character must be a
     *         letter</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens</li> </ul>
     */
    public String getDBClusterParameterGroupName() {
        return dBClusterParameterGroupName;
    }
    
    /**
     * The name of the DB cluster parameter group to associate with this DB
     * cluster. If this argument is omitted, <code>default.aurora5.6</code>
     * for the specified engine will be used. <p> Constraints: <ul> <li>Must
     * be 1 to 255 alphanumeric characters</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul>
     *
     * @param dBClusterParameterGroupName The name of the DB cluster parameter group to associate with this DB
     *         cluster. If this argument is omitted, <code>default.aurora5.6</code>
     *         for the specified engine will be used. <p> Constraints: <ul> <li>Must
     *         be 1 to 255 alphanumeric characters</li> <li>First character must be a
     *         letter</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens</li> </ul>
     */
    public void setDBClusterParameterGroupName(String dBClusterParameterGroupName) {
        this.dBClusterParameterGroupName = dBClusterParameterGroupName;
    }
    
    /**
     * The name of the DB cluster parameter group to associate with this DB
     * cluster. If this argument is omitted, <code>default.aurora5.6</code>
     * for the specified engine will be used. <p> Constraints: <ul> <li>Must
     * be 1 to 255 alphanumeric characters</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBClusterParameterGroupName The name of the DB cluster parameter group to associate with this DB
     *         cluster. If this argument is omitted, <code>default.aurora5.6</code>
     *         for the specified engine will be used. <p> Constraints: <ul> <li>Must
     *         be 1 to 255 alphanumeric characters</li> <li>First character must be a
     *         letter</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBClusterRequest withDBClusterParameterGroupName(String dBClusterParameterGroupName) {
        this.dBClusterParameterGroupName = dBClusterParameterGroupName;
        return this;
    }

    /**
     * A list of EC2 VPC security groups to associate with this DB cluster.
     *
     * @return A list of EC2 VPC security groups to associate with this DB cluster.
     */
    public java.util.List<String> getVpcSecurityGroupIds() {
        if (vpcSecurityGroupIds == null) {
              vpcSecurityGroupIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              vpcSecurityGroupIds.setAutoConstruct(true);
        }
        return vpcSecurityGroupIds;
    }
    
    /**
     * A list of EC2 VPC security groups to associate with this DB cluster.
     *
     * @param vpcSecurityGroupIds A list of EC2 VPC security groups to associate with this DB cluster.
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
     * A list of EC2 VPC security groups to associate with this DB cluster.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setVpcSecurityGroupIds(java.util.Collection)} or
     * {@link #withVpcSecurityGroupIds(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcSecurityGroupIds A list of EC2 VPC security groups to associate with this DB cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBClusterRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
        if (getVpcSecurityGroupIds() == null) setVpcSecurityGroupIds(new java.util.ArrayList<String>(vpcSecurityGroupIds.length));
        for (String value : vpcSecurityGroupIds) {
            getVpcSecurityGroupIds().add(value);
        }
        return this;
    }
    
    /**
     * A list of EC2 VPC security groups to associate with this DB cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcSecurityGroupIds A list of EC2 VPC security groups to associate with this DB cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBClusterRequest withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
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
     * A DB subnet group to associate with this DB cluster. <p>Constraints:
     * Must contain no more than 255 alphanumeric characters, periods,
     * underscores, spaces, or hyphens. Must not be default. <p>Example:
     * <code>mySubnetgroup</code>
     *
     * @return A DB subnet group to associate with this DB cluster. <p>Constraints:
     *         Must contain no more than 255 alphanumeric characters, periods,
     *         underscores, spaces, or hyphens. Must not be default. <p>Example:
     *         <code>mySubnetgroup</code>
     */
    public String getDBSubnetGroupName() {
        return dBSubnetGroupName;
    }
    
    /**
     * A DB subnet group to associate with this DB cluster. <p>Constraints:
     * Must contain no more than 255 alphanumeric characters, periods,
     * underscores, spaces, or hyphens. Must not be default. <p>Example:
     * <code>mySubnetgroup</code>
     *
     * @param dBSubnetGroupName A DB subnet group to associate with this DB cluster. <p>Constraints:
     *         Must contain no more than 255 alphanumeric characters, periods,
     *         underscores, spaces, or hyphens. Must not be default. <p>Example:
     *         <code>mySubnetgroup</code>
     */
    public void setDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
    }
    
    /**
     * A DB subnet group to associate with this DB cluster. <p>Constraints:
     * Must contain no more than 255 alphanumeric characters, periods,
     * underscores, spaces, or hyphens. Must not be default. <p>Example:
     * <code>mySubnetgroup</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSubnetGroupName A DB subnet group to associate with this DB cluster. <p>Constraints:
     *         Must contain no more than 255 alphanumeric characters, periods,
     *         underscores, spaces, or hyphens. Must not be default. <p>Example:
     *         <code>mySubnetgroup</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBClusterRequest withDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
        return this;
    }

    /**
     * The name of the database engine to be used for this DB cluster.
     * <p>Valid Values: <code>aurora</code>
     *
     * @return The name of the database engine to be used for this DB cluster.
     *         <p>Valid Values: <code>aurora</code>
     */
    public String getEngine() {
        return engine;
    }
    
    /**
     * The name of the database engine to be used for this DB cluster.
     * <p>Valid Values: <code>aurora</code>
     *
     * @param engine The name of the database engine to be used for this DB cluster.
     *         <p>Valid Values: <code>aurora</code>
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }
    
    /**
     * The name of the database engine to be used for this DB cluster.
     * <p>Valid Values: <code>aurora</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engine The name of the database engine to be used for this DB cluster.
     *         <p>Valid Values: <code>aurora</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBClusterRequest withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * The version number of the database engine to use. <p> <b>Aurora</b>
     * <p>Example: <code>5.6.10a</code>
     *
     * @return The version number of the database engine to use. <p> <b>Aurora</b>
     *         <p>Example: <code>5.6.10a</code>
     */
    public String getEngineVersion() {
        return engineVersion;
    }
    
    /**
     * The version number of the database engine to use. <p> <b>Aurora</b>
     * <p>Example: <code>5.6.10a</code>
     *
     * @param engineVersion The version number of the database engine to use. <p> <b>Aurora</b>
     *         <p>Example: <code>5.6.10a</code>
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }
    
    /**
     * The version number of the database engine to use. <p> <b>Aurora</b>
     * <p>Example: <code>5.6.10a</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineVersion The version number of the database engine to use. <p> <b>Aurora</b>
     *         <p>Example: <code>5.6.10a</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBClusterRequest withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * The port number on which the instances in the DB cluster accept
     * connections. <p> Default: <code>3306</code>
     *
     * @return The port number on which the instances in the DB cluster accept
     *         connections. <p> Default: <code>3306</code>
     */
    public Integer getPort() {
        return port;
    }
    
    /**
     * The port number on which the instances in the DB cluster accept
     * connections. <p> Default: <code>3306</code>
     *
     * @param port The port number on which the instances in the DB cluster accept
     *         connections. <p> Default: <code>3306</code>
     */
    public void setPort(Integer port) {
        this.port = port;
    }
    
    /**
     * The port number on which the instances in the DB cluster accept
     * connections. <p> Default: <code>3306</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param port The port number on which the instances in the DB cluster accept
     *         connections. <p> Default: <code>3306</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBClusterRequest withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * The name of the master user for the client DB cluster. <p>Constraints:
     * <ul> <li>Must be 1 to 16 alphanumeric characters.</li> <li>First
     * character must be a letter.</li> <li>Cannot be a reserved word for the
     * chosen database engine.</li> </ul>
     *
     * @return The name of the master user for the client DB cluster. <p>Constraints:
     *         <ul> <li>Must be 1 to 16 alphanumeric characters.</li> <li>First
     *         character must be a letter.</li> <li>Cannot be a reserved word for the
     *         chosen database engine.</li> </ul>
     */
    public String getMasterUsername() {
        return masterUsername;
    }
    
    /**
     * The name of the master user for the client DB cluster. <p>Constraints:
     * <ul> <li>Must be 1 to 16 alphanumeric characters.</li> <li>First
     * character must be a letter.</li> <li>Cannot be a reserved word for the
     * chosen database engine.</li> </ul>
     *
     * @param masterUsername The name of the master user for the client DB cluster. <p>Constraints:
     *         <ul> <li>Must be 1 to 16 alphanumeric characters.</li> <li>First
     *         character must be a letter.</li> <li>Cannot be a reserved word for the
     *         chosen database engine.</li> </ul>
     */
    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }
    
    /**
     * The name of the master user for the client DB cluster. <p>Constraints:
     * <ul> <li>Must be 1 to 16 alphanumeric characters.</li> <li>First
     * character must be a letter.</li> <li>Cannot be a reserved word for the
     * chosen database engine.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param masterUsername The name of the master user for the client DB cluster. <p>Constraints:
     *         <ul> <li>Must be 1 to 16 alphanumeric characters.</li> <li>First
     *         character must be a letter.</li> <li>Cannot be a reserved word for the
     *         chosen database engine.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBClusterRequest withMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
        return this;
    }

    /**
     * The password for the master database user. This password can contain
     * any printable ASCII character except "/", """, or "@". <p>Constraints:
     * Must contain from 8 to 41 characters.
     *
     * @return The password for the master database user. This password can contain
     *         any printable ASCII character except "/", """, or "@". <p>Constraints:
     *         Must contain from 8 to 41 characters.
     */
    public String getMasterUserPassword() {
        return masterUserPassword;
    }
    
    /**
     * The password for the master database user. This password can contain
     * any printable ASCII character except "/", """, or "@". <p>Constraints:
     * Must contain from 8 to 41 characters.
     *
     * @param masterUserPassword The password for the master database user. This password can contain
     *         any printable ASCII character except "/", """, or "@". <p>Constraints:
     *         Must contain from 8 to 41 characters.
     */
    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }
    
    /**
     * The password for the master database user. This password can contain
     * any printable ASCII character except "/", """, or "@". <p>Constraints:
     * Must contain from 8 to 41 characters.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param masterUserPassword The password for the master database user. This password can contain
     *         any printable ASCII character except "/", """, or "@". <p>Constraints:
     *         Must contain from 8 to 41 characters.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBClusterRequest withMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
        return this;
    }

    /**
     * A value that indicates that the DB cluster should be associated with
     * the specified option group. <p>Permanent options cannot be removed
     * from an option group. The option group cannot be removed from a DB
     * cluster once it is associated with a DB cluster.
     *
     * @return A value that indicates that the DB cluster should be associated with
     *         the specified option group. <p>Permanent options cannot be removed
     *         from an option group. The option group cannot be removed from a DB
     *         cluster once it is associated with a DB cluster.
     */
    public String getOptionGroupName() {
        return optionGroupName;
    }
    
    /**
     * A value that indicates that the DB cluster should be associated with
     * the specified option group. <p>Permanent options cannot be removed
     * from an option group. The option group cannot be removed from a DB
     * cluster once it is associated with a DB cluster.
     *
     * @param optionGroupName A value that indicates that the DB cluster should be associated with
     *         the specified option group. <p>Permanent options cannot be removed
     *         from an option group. The option group cannot be removed from a DB
     *         cluster once it is associated with a DB cluster.
     */
    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }
    
    /**
     * A value that indicates that the DB cluster should be associated with
     * the specified option group. <p>Permanent options cannot be removed
     * from an option group. The option group cannot be removed from a DB
     * cluster once it is associated with a DB cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionGroupName A value that indicates that the DB cluster should be associated with
     *         the specified option group. <p>Permanent options cannot be removed
     *         from an option group. The option group cannot be removed from a DB
     *         cluster once it is associated with a DB cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBClusterRequest withOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
        return this;
    }

    /**
     * The daily time range during which automated backups are created if
     * automated backups are enabled using the
     * <code>BackupRetentionPeriod</code> parameter. <p>Default: A 30-minute
     * window selected at random from an 8-hour block of time per region. To
     * see the time blocks available, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     * Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     * User Guide.</i> <p>Constraints: <ul> <li>Must be in the format
     * <code>hh24:mi-hh24:mi</code>.</li> <li>Times should be in Universal
     * Coordinated Time (UTC).</li> <li>Must not conflict with the preferred
     * maintenance window.</li> <li>Must be at least 30 minutes.</li> </ul>
     *
     * @return The daily time range during which automated backups are created if
     *         automated backups are enabled using the
     *         <code>BackupRetentionPeriod</code> parameter. <p>Default: A 30-minute
     *         window selected at random from an 8-hour block of time per region. To
     *         see the time blocks available, see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     *         Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     *         User Guide.</i> <p>Constraints: <ul> <li>Must be in the format
     *         <code>hh24:mi-hh24:mi</code>.</li> <li>Times should be in Universal
     *         Coordinated Time (UTC).</li> <li>Must not conflict with the preferred
     *         maintenance window.</li> <li>Must be at least 30 minutes.</li> </ul>
     */
    public String getPreferredBackupWindow() {
        return preferredBackupWindow;
    }
    
    /**
     * The daily time range during which automated backups are created if
     * automated backups are enabled using the
     * <code>BackupRetentionPeriod</code> parameter. <p>Default: A 30-minute
     * window selected at random from an 8-hour block of time per region. To
     * see the time blocks available, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     * Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     * User Guide.</i> <p>Constraints: <ul> <li>Must be in the format
     * <code>hh24:mi-hh24:mi</code>.</li> <li>Times should be in Universal
     * Coordinated Time (UTC).</li> <li>Must not conflict with the preferred
     * maintenance window.</li> <li>Must be at least 30 minutes.</li> </ul>
     *
     * @param preferredBackupWindow The daily time range during which automated backups are created if
     *         automated backups are enabled using the
     *         <code>BackupRetentionPeriod</code> parameter. <p>Default: A 30-minute
     *         window selected at random from an 8-hour block of time per region. To
     *         see the time blocks available, see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     *         Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     *         User Guide.</i> <p>Constraints: <ul> <li>Must be in the format
     *         <code>hh24:mi-hh24:mi</code>.</li> <li>Times should be in Universal
     *         Coordinated Time (UTC).</li> <li>Must not conflict with the preferred
     *         maintenance window.</li> <li>Must be at least 30 minutes.</li> </ul>
     */
    public void setPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
    }
    
    /**
     * The daily time range during which automated backups are created if
     * automated backups are enabled using the
     * <code>BackupRetentionPeriod</code> parameter. <p>Default: A 30-minute
     * window selected at random from an 8-hour block of time per region. To
     * see the time blocks available, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     * Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     * User Guide.</i> <p>Constraints: <ul> <li>Must be in the format
     * <code>hh24:mi-hh24:mi</code>.</li> <li>Times should be in Universal
     * Coordinated Time (UTC).</li> <li>Must not conflict with the preferred
     * maintenance window.</li> <li>Must be at least 30 minutes.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preferredBackupWindow The daily time range during which automated backups are created if
     *         automated backups are enabled using the
     *         <code>BackupRetentionPeriod</code> parameter. <p>Default: A 30-minute
     *         window selected at random from an 8-hour block of time per region. To
     *         see the time blocks available, see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     *         Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     *         User Guide.</i> <p>Constraints: <ul> <li>Must be in the format
     *         <code>hh24:mi-hh24:mi</code>.</li> <li>Times should be in Universal
     *         Coordinated Time (UTC).</li> <li>Must not conflict with the preferred
     *         maintenance window.</li> <li>Must be at least 30 minutes.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBClusterRequest withPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
        return this;
    }

    /**
     * The weekly time range during which system maintenance can occur, in
     * Universal Coordinated Time (UTC). <p> Format:
     * <code>ddd:hh24:mi-ddd:hh24:mi</code> <p>Default: A 30-minute window
     * selected at random from an 8-hour block of time per region, occurring
     * on a random day of the week. To see the time blocks available, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     * Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     * User Guide.</i> <p>Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * <p>Constraints: Minimum 30-minute window.
     *
     * @return The weekly time range during which system maintenance can occur, in
     *         Universal Coordinated Time (UTC). <p> Format:
     *         <code>ddd:hh24:mi-ddd:hh24:mi</code> <p>Default: A 30-minute window
     *         selected at random from an 8-hour block of time per region, occurring
     *         on a random day of the week. To see the time blocks available, see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     *         Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     *         User Guide.</i> <p>Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *         <p>Constraints: Minimum 30-minute window.
     */
    public String getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }
    
    /**
     * The weekly time range during which system maintenance can occur, in
     * Universal Coordinated Time (UTC). <p> Format:
     * <code>ddd:hh24:mi-ddd:hh24:mi</code> <p>Default: A 30-minute window
     * selected at random from an 8-hour block of time per region, occurring
     * on a random day of the week. To see the time blocks available, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     * Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     * User Guide.</i> <p>Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * <p>Constraints: Minimum 30-minute window.
     *
     * @param preferredMaintenanceWindow The weekly time range during which system maintenance can occur, in
     *         Universal Coordinated Time (UTC). <p> Format:
     *         <code>ddd:hh24:mi-ddd:hh24:mi</code> <p>Default: A 30-minute window
     *         selected at random from an 8-hour block of time per region, occurring
     *         on a random day of the week. To see the time blocks available, see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     *         Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     *         User Guide.</i> <p>Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *         <p>Constraints: Minimum 30-minute window.
     */
    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }
    
    /**
     * The weekly time range during which system maintenance can occur, in
     * Universal Coordinated Time (UTC). <p> Format:
     * <code>ddd:hh24:mi-ddd:hh24:mi</code> <p>Default: A 30-minute window
     * selected at random from an 8-hour block of time per region, occurring
     * on a random day of the week. To see the time blocks available, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     * Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     * User Guide.</i> <p>Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * <p>Constraints: Minimum 30-minute window.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preferredMaintenanceWindow The weekly time range during which system maintenance can occur, in
     *         Universal Coordinated Time (UTC). <p> Format:
     *         <code>ddd:hh24:mi-ddd:hh24:mi</code> <p>Default: A 30-minute window
     *         selected at random from an 8-hour block of time per region, occurring
     *         on a random day of the week. To see the time blocks available, see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     *         Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS
     *         User Guide.</i> <p>Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *         <p>Constraints: Minimum 30-minute window.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBClusterRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
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
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTags(java.util.Collection)} or {@link
     * #withTags(java.util.Collection)} if you want to override the existing
     * values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBClusterRequest withTags(Tag... tags) {
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
    public CreateDBClusterRequest withTags(java.util.Collection<Tag> tags) {
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
     * Specifies whether the DB cluster is encrypted.
     *
     * @return Specifies whether the DB cluster is encrypted.
     */
    public Boolean isStorageEncrypted() {
        return storageEncrypted;
    }
    
    /**
     * Specifies whether the DB cluster is encrypted.
     *
     * @param storageEncrypted Specifies whether the DB cluster is encrypted.
     */
    public void setStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
    }
    
    /**
     * Specifies whether the DB cluster is encrypted.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param storageEncrypted Specifies whether the DB cluster is encrypted.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBClusterRequest withStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
        return this;
    }

    /**
     * Specifies whether the DB cluster is encrypted.
     *
     * @return Specifies whether the DB cluster is encrypted.
     */
    public Boolean getStorageEncrypted() {
        return storageEncrypted;
    }

    /**
     * The KMS key identifier for an encrypted DB cluster. <p>The KMS key
     * identifier is the Amazon Resource Name (ARN) for the KMS encryption
     * key. If you are creating a DB cluster with the same AWS account that
     * owns the KMS encryption key used to encrypt the new DB cluster, then
     * you can use the KMS key alias instead of the ARN for the KM encryption
     * key. <p>If the <code>StorageEncrypted</code> parameter is true, and
     * you do not specify a value for the <code>KmsKeyId</code> parameter,
     * then Amazon RDS will use your default encryption key. AWS KMS creates
     * the default encryption key for your AWS account. Your AWS account has
     * a different default encryption key for each AWS region.
     *
     * @return The KMS key identifier for an encrypted DB cluster. <p>The KMS key
     *         identifier is the Amazon Resource Name (ARN) for the KMS encryption
     *         key. If you are creating a DB cluster with the same AWS account that
     *         owns the KMS encryption key used to encrypt the new DB cluster, then
     *         you can use the KMS key alias instead of the ARN for the KM encryption
     *         key. <p>If the <code>StorageEncrypted</code> parameter is true, and
     *         you do not specify a value for the <code>KmsKeyId</code> parameter,
     *         then Amazon RDS will use your default encryption key. AWS KMS creates
     *         the default encryption key for your AWS account. Your AWS account has
     *         a different default encryption key for each AWS region.
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }
    
    /**
     * The KMS key identifier for an encrypted DB cluster. <p>The KMS key
     * identifier is the Amazon Resource Name (ARN) for the KMS encryption
     * key. If you are creating a DB cluster with the same AWS account that
     * owns the KMS encryption key used to encrypt the new DB cluster, then
     * you can use the KMS key alias instead of the ARN for the KM encryption
     * key. <p>If the <code>StorageEncrypted</code> parameter is true, and
     * you do not specify a value for the <code>KmsKeyId</code> parameter,
     * then Amazon RDS will use your default encryption key. AWS KMS creates
     * the default encryption key for your AWS account. Your AWS account has
     * a different default encryption key for each AWS region.
     *
     * @param kmsKeyId The KMS key identifier for an encrypted DB cluster. <p>The KMS key
     *         identifier is the Amazon Resource Name (ARN) for the KMS encryption
     *         key. If you are creating a DB cluster with the same AWS account that
     *         owns the KMS encryption key used to encrypt the new DB cluster, then
     *         you can use the KMS key alias instead of the ARN for the KM encryption
     *         key. <p>If the <code>StorageEncrypted</code> parameter is true, and
     *         you do not specify a value for the <code>KmsKeyId</code> parameter,
     *         then Amazon RDS will use your default encryption key. AWS KMS creates
     *         the default encryption key for your AWS account. Your AWS account has
     *         a different default encryption key for each AWS region.
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }
    
    /**
     * The KMS key identifier for an encrypted DB cluster. <p>The KMS key
     * identifier is the Amazon Resource Name (ARN) for the KMS encryption
     * key. If you are creating a DB cluster with the same AWS account that
     * owns the KMS encryption key used to encrypt the new DB cluster, then
     * you can use the KMS key alias instead of the ARN for the KM encryption
     * key. <p>If the <code>StorageEncrypted</code> parameter is true, and
     * you do not specify a value for the <code>KmsKeyId</code> parameter,
     * then Amazon RDS will use your default encryption key. AWS KMS creates
     * the default encryption key for your AWS account. Your AWS account has
     * a different default encryption key for each AWS region.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param kmsKeyId The KMS key identifier for an encrypted DB cluster. <p>The KMS key
     *         identifier is the Amazon Resource Name (ARN) for the KMS encryption
     *         key. If you are creating a DB cluster with the same AWS account that
     *         owns the KMS encryption key used to encrypt the new DB cluster, then
     *         you can use the KMS key alias instead of the ARN for the KM encryption
     *         key. <p>If the <code>StorageEncrypted</code> parameter is true, and
     *         you do not specify a value for the <code>KmsKeyId</code> parameter,
     *         then Amazon RDS will use your default encryption key. AWS KMS creates
     *         the default encryption key for your AWS account. Your AWS account has
     *         a different default encryption key for each AWS region.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateDBClusterRequest withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
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
        if (getAvailabilityZones() != null) sb.append("AvailabilityZones: " + getAvailabilityZones() + ",");
        if (getBackupRetentionPeriod() != null) sb.append("BackupRetentionPeriod: " + getBackupRetentionPeriod() + ",");
        if (getCharacterSetName() != null) sb.append("CharacterSetName: " + getCharacterSetName() + ",");
        if (getDatabaseName() != null) sb.append("DatabaseName: " + getDatabaseName() + ",");
        if (getDBClusterIdentifier() != null) sb.append("DBClusterIdentifier: " + getDBClusterIdentifier() + ",");
        if (getDBClusterParameterGroupName() != null) sb.append("DBClusterParameterGroupName: " + getDBClusterParameterGroupName() + ",");
        if (getVpcSecurityGroupIds() != null) sb.append("VpcSecurityGroupIds: " + getVpcSecurityGroupIds() + ",");
        if (getDBSubnetGroupName() != null) sb.append("DBSubnetGroupName: " + getDBSubnetGroupName() + ",");
        if (getEngine() != null) sb.append("Engine: " + getEngine() + ",");
        if (getEngineVersion() != null) sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getPort() != null) sb.append("Port: " + getPort() + ",");
        if (getMasterUsername() != null) sb.append("MasterUsername: " + getMasterUsername() + ",");
        if (getMasterUserPassword() != null) sb.append("MasterUserPassword: " + getMasterUserPassword() + ",");
        if (getOptionGroupName() != null) sb.append("OptionGroupName: " + getOptionGroupName() + ",");
        if (getPreferredBackupWindow() != null) sb.append("PreferredBackupWindow: " + getPreferredBackupWindow() + ",");
        if (getPreferredMaintenanceWindow() != null) sb.append("PreferredMaintenanceWindow: " + getPreferredMaintenanceWindow() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() + ",");
        if (isStorageEncrypted() != null) sb.append("StorageEncrypted: " + isStorageEncrypted() + ",");
        if (getKmsKeyId() != null) sb.append("KmsKeyId: " + getKmsKeyId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode()); 
        hashCode = prime * hashCode + ((getBackupRetentionPeriod() == null) ? 0 : getBackupRetentionPeriod().hashCode()); 
        hashCode = prime * hashCode + ((getCharacterSetName() == null) ? 0 : getCharacterSetName().hashCode()); 
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode()); 
        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getDBClusterParameterGroupName() == null) ? 0 : getDBClusterParameterGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode()); 
        hashCode = prime * hashCode + ((getDBSubnetGroupName() == null) ? 0 : getDBSubnetGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode()); 
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode()); 
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode()); 
        hashCode = prime * hashCode + ((getMasterUsername() == null) ? 0 : getMasterUsername().hashCode()); 
        hashCode = prime * hashCode + ((getMasterUserPassword() == null) ? 0 : getMasterUserPassword().hashCode()); 
        hashCode = prime * hashCode + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getPreferredBackupWindow() == null) ? 0 : getPreferredBackupWindow().hashCode()); 
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        hashCode = prime * hashCode + ((isStorageEncrypted() == null) ? 0 : isStorageEncrypted().hashCode()); 
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateDBClusterRequest == false) return false;
        CreateDBClusterRequest other = (CreateDBClusterRequest)obj;
        
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null) return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false) return false; 
        if (other.getBackupRetentionPeriod() == null ^ this.getBackupRetentionPeriod() == null) return false;
        if (other.getBackupRetentionPeriod() != null && other.getBackupRetentionPeriod().equals(this.getBackupRetentionPeriod()) == false) return false; 
        if (other.getCharacterSetName() == null ^ this.getCharacterSetName() == null) return false;
        if (other.getCharacterSetName() != null && other.getCharacterSetName().equals(this.getCharacterSetName()) == false) return false; 
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null) return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false) return false; 
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null) return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false) return false; 
        if (other.getDBClusterParameterGroupName() == null ^ this.getDBClusterParameterGroupName() == null) return false;
        if (other.getDBClusterParameterGroupName() != null && other.getDBClusterParameterGroupName().equals(this.getDBClusterParameterGroupName()) == false) return false; 
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null) return false;
        if (other.getVpcSecurityGroupIds() != null && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false) return false; 
        if (other.getDBSubnetGroupName() == null ^ this.getDBSubnetGroupName() == null) return false;
        if (other.getDBSubnetGroupName() != null && other.getDBSubnetGroupName().equals(this.getDBSubnetGroupName()) == false) return false; 
        if (other.getEngine() == null ^ this.getEngine() == null) return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false) return false; 
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null) return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false) return false; 
        if (other.getPort() == null ^ this.getPort() == null) return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false) return false; 
        if (other.getMasterUsername() == null ^ this.getMasterUsername() == null) return false;
        if (other.getMasterUsername() != null && other.getMasterUsername().equals(this.getMasterUsername()) == false) return false; 
        if (other.getMasterUserPassword() == null ^ this.getMasterUserPassword() == null) return false;
        if (other.getMasterUserPassword() != null && other.getMasterUserPassword().equals(this.getMasterUserPassword()) == false) return false; 
        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null) return false;
        if (other.getOptionGroupName() != null && other.getOptionGroupName().equals(this.getOptionGroupName()) == false) return false; 
        if (other.getPreferredBackupWindow() == null ^ this.getPreferredBackupWindow() == null) return false;
        if (other.getPreferredBackupWindow() != null && other.getPreferredBackupWindow().equals(this.getPreferredBackupWindow()) == false) return false; 
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null) return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        if (other.isStorageEncrypted() == null ^ this.isStorageEncrypted() == null) return false;
        if (other.isStorageEncrypted() != null && other.isStorageEncrypted().equals(this.isStorageEncrypted()) == false) return false; 
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null) return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateDBClusterRequest clone() {
        
            return (CreateDBClusterRequest) super.clone();
    }

}
    