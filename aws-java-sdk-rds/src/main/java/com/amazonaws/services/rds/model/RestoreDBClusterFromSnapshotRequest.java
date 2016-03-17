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
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#restoreDBClusterFromSnapshot(RestoreDBClusterFromSnapshotRequest) RestoreDBClusterFromSnapshot operation}.
 * <p>
 * Creates a new DB cluster from a DB cluster snapshot. The target DB
 * cluster is created from the source DB cluster restore point with the
 * same configuration as the original source DB cluster, except that the
 * new DB cluster is created with the default security group.
 * </p>
 * <p>
 * For more information on Amazon Aurora, see
 * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html"> Aurora on Amazon RDS </a>
 * in the <i>Amazon RDS User Guide.</i>
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#restoreDBClusterFromSnapshot(RestoreDBClusterFromSnapshotRequest)
 */
public class RestoreDBClusterFromSnapshotRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * Provides the list of EC2 Availability Zones that instances in the
     * restored DB cluster can be created in.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> availabilityZones;

    /**
     * The name of the DB cluster to create from the DB cluster snapshot.
     * This parameter isn't case-sensitive. <p>Constraints: <ul> <li>Must
     * contain from 1 to 255 alphanumeric characters or hyphens</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul> <p>Example:
     * <code>my-snapshot-id</code>
     */
    private String dBClusterIdentifier;

    /**
     * The identifier for the DB cluster snapshot to restore from.
     * <p>Constraints: <ul> <li>Must contain from 1 to 63 alphanumeric
     * characters or hyphens</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * </ul>
     */
    private String snapshotIdentifier;

    /**
     * The database engine to use for the new DB cluster. <p>Default: The
     * same as source <p>Constraint: Must be compatible with the engine of
     * the source
     */
    private String engine;

    /**
     * The version of the database engine to use for the new DB cluster.
     */
    private String engineVersion;

    /**
     * The port number on which the new DB cluster accepts connections.
     * <p>Constraints: Value must be <code>1150-65535</code> <p>Default: The
     * same port as the original DB cluster.
     */
    private Integer port;

    /**
     * The name of the DB subnet group to use for the new DB cluster.
     * <p>Constraints: Must contain no more than 255 alphanumeric characters,
     * periods, underscores, spaces, or hyphens. Must not be default.
     * <p>Example: <code>mySubnetgroup</code>
     */
    private String dBSubnetGroupName;

    /**
     * The database name for the restored DB cluster.
     */
    private String databaseName;

    /**
     * The name of the option group to use for the restored DB cluster.
     */
    private String optionGroupName;

    /**
     * A list of VPC security groups that the new DB cluster will belong to.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> vpcSecurityGroupIds;

    /**
     * The tags to be assigned to the restored DB cluster.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The KMS key identifier to use when restoring an encrypted DB cluster
     * from an encrypted DB cluster snapshot. <p>The KMS key identifier is
     * the Amazon Resource Name (ARN) for the KMS encryption key. If you are
     * restoring a DB cluster with the same AWS account that owns the KMS
     * encryption key used to encrypt the new DB cluster, then you can use
     * the KMS key alias instead of the ARN for the KMS encryption key. <p>If
     * you do not specify a value for the <code>KmsKeyId</code> parameter,
     * then the following will occur: <ul> <li>If the DB cluster snapshot is
     * encrypted, then the restored DB cluster is encrypted using the KMS key
     * that was used to encrypt the DB cluster snapshot.</li> <li>If the DB
     * cluster snapshot is not encrypted, then the restored DB cluster is not
     * encrypted.</li> </ul> <p>If <code>SnapshotIdentifier</code> refers to
     * a DB cluster snapshot that is not encrypted, and you specify a value
     * for the <code>KmsKeyId</code> parameter, then the restore request is
     * rejected.
     */
    private String kmsKeyId;

    /**
     * Provides the list of EC2 Availability Zones that instances in the
     * restored DB cluster can be created in.
     *
     * @return Provides the list of EC2 Availability Zones that instances in the
     *         restored DB cluster can be created in.
     */
    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
              availabilityZones = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              availabilityZones.setAutoConstruct(true);
        }
        return availabilityZones;
    }
    
    /**
     * Provides the list of EC2 Availability Zones that instances in the
     * restored DB cluster can be created in.
     *
     * @param availabilityZones Provides the list of EC2 Availability Zones that instances in the
     *         restored DB cluster can be created in.
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
     * Provides the list of EC2 Availability Zones that instances in the
     * restored DB cluster can be created in.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAvailabilityZones(java.util.Collection)} or
     * {@link #withAvailabilityZones(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones Provides the list of EC2 Availability Zones that instances in the
     *         restored DB cluster can be created in.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreDBClusterFromSnapshotRequest withAvailabilityZones(String... availabilityZones) {
        if (getAvailabilityZones() == null) setAvailabilityZones(new java.util.ArrayList<String>(availabilityZones.length));
        for (String value : availabilityZones) {
            getAvailabilityZones().add(value);
        }
        return this;
    }
    
    /**
     * Provides the list of EC2 Availability Zones that instances in the
     * restored DB cluster can be created in.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityZones Provides the list of EC2 Availability Zones that instances in the
     *         restored DB cluster can be created in.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreDBClusterFromSnapshotRequest withAvailabilityZones(java.util.Collection<String> availabilityZones) {
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
     * The name of the DB cluster to create from the DB cluster snapshot.
     * This parameter isn't case-sensitive. <p>Constraints: <ul> <li>Must
     * contain from 1 to 255 alphanumeric characters or hyphens</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul> <p>Example:
     * <code>my-snapshot-id</code>
     *
     * @return The name of the DB cluster to create from the DB cluster snapshot.
     *         This parameter isn't case-sensitive. <p>Constraints: <ul> <li>Must
     *         contain from 1 to 255 alphanumeric characters or hyphens</li>
     *         <li>First character must be a letter</li> <li>Cannot end with a hyphen
     *         or contain two consecutive hyphens</li> </ul> <p>Example:
     *         <code>my-snapshot-id</code>
     */
    public String getDBClusterIdentifier() {
        return dBClusterIdentifier;
    }
    
    /**
     * The name of the DB cluster to create from the DB cluster snapshot.
     * This parameter isn't case-sensitive. <p>Constraints: <ul> <li>Must
     * contain from 1 to 255 alphanumeric characters or hyphens</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul> <p>Example:
     * <code>my-snapshot-id</code>
     *
     * @param dBClusterIdentifier The name of the DB cluster to create from the DB cluster snapshot.
     *         This parameter isn't case-sensitive. <p>Constraints: <ul> <li>Must
     *         contain from 1 to 255 alphanumeric characters or hyphens</li>
     *         <li>First character must be a letter</li> <li>Cannot end with a hyphen
     *         or contain two consecutive hyphens</li> </ul> <p>Example:
     *         <code>my-snapshot-id</code>
     */
    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }
    
    /**
     * The name of the DB cluster to create from the DB cluster snapshot.
     * This parameter isn't case-sensitive. <p>Constraints: <ul> <li>Must
     * contain from 1 to 255 alphanumeric characters or hyphens</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul> <p>Example:
     * <code>my-snapshot-id</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBClusterIdentifier The name of the DB cluster to create from the DB cluster snapshot.
     *         This parameter isn't case-sensitive. <p>Constraints: <ul> <li>Must
     *         contain from 1 to 255 alphanumeric characters or hyphens</li>
     *         <li>First character must be a letter</li> <li>Cannot end with a hyphen
     *         or contain two consecutive hyphens</li> </ul> <p>Example:
     *         <code>my-snapshot-id</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreDBClusterFromSnapshotRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
        return this;
    }

    /**
     * The identifier for the DB cluster snapshot to restore from.
     * <p>Constraints: <ul> <li>Must contain from 1 to 63 alphanumeric
     * characters or hyphens</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * </ul>
     *
     * @return The identifier for the DB cluster snapshot to restore from.
     *         <p>Constraints: <ul> <li>Must contain from 1 to 63 alphanumeric
     *         characters or hyphens</li> <li>First character must be a letter</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     *         </ul>
     */
    public String getSnapshotIdentifier() {
        return snapshotIdentifier;
    }
    
    /**
     * The identifier for the DB cluster snapshot to restore from.
     * <p>Constraints: <ul> <li>Must contain from 1 to 63 alphanumeric
     * characters or hyphens</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * </ul>
     *
     * @param snapshotIdentifier The identifier for the DB cluster snapshot to restore from.
     *         <p>Constraints: <ul> <li>Must contain from 1 to 63 alphanumeric
     *         characters or hyphens</li> <li>First character must be a letter</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     *         </ul>
     */
    public void setSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
    }
    
    /**
     * The identifier for the DB cluster snapshot to restore from.
     * <p>Constraints: <ul> <li>Must contain from 1 to 63 alphanumeric
     * characters or hyphens</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotIdentifier The identifier for the DB cluster snapshot to restore from.
     *         <p>Constraints: <ul> <li>Must contain from 1 to 63 alphanumeric
     *         characters or hyphens</li> <li>First character must be a letter</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     *         </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreDBClusterFromSnapshotRequest withSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
        return this;
    }

    /**
     * The database engine to use for the new DB cluster. <p>Default: The
     * same as source <p>Constraint: Must be compatible with the engine of
     * the source
     *
     * @return The database engine to use for the new DB cluster. <p>Default: The
     *         same as source <p>Constraint: Must be compatible with the engine of
     *         the source
     */
    public String getEngine() {
        return engine;
    }
    
    /**
     * The database engine to use for the new DB cluster. <p>Default: The
     * same as source <p>Constraint: Must be compatible with the engine of
     * the source
     *
     * @param engine The database engine to use for the new DB cluster. <p>Default: The
     *         same as source <p>Constraint: Must be compatible with the engine of
     *         the source
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }
    
    /**
     * The database engine to use for the new DB cluster. <p>Default: The
     * same as source <p>Constraint: Must be compatible with the engine of
     * the source
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engine The database engine to use for the new DB cluster. <p>Default: The
     *         same as source <p>Constraint: Must be compatible with the engine of
     *         the source
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreDBClusterFromSnapshotRequest withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * The version of the database engine to use for the new DB cluster.
     *
     * @return The version of the database engine to use for the new DB cluster.
     */
    public String getEngineVersion() {
        return engineVersion;
    }
    
    /**
     * The version of the database engine to use for the new DB cluster.
     *
     * @param engineVersion The version of the database engine to use for the new DB cluster.
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }
    
    /**
     * The version of the database engine to use for the new DB cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineVersion The version of the database engine to use for the new DB cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreDBClusterFromSnapshotRequest withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * The port number on which the new DB cluster accepts connections.
     * <p>Constraints: Value must be <code>1150-65535</code> <p>Default: The
     * same port as the original DB cluster.
     *
     * @return The port number on which the new DB cluster accepts connections.
     *         <p>Constraints: Value must be <code>1150-65535</code> <p>Default: The
     *         same port as the original DB cluster.
     */
    public Integer getPort() {
        return port;
    }
    
    /**
     * The port number on which the new DB cluster accepts connections.
     * <p>Constraints: Value must be <code>1150-65535</code> <p>Default: The
     * same port as the original DB cluster.
     *
     * @param port The port number on which the new DB cluster accepts connections.
     *         <p>Constraints: Value must be <code>1150-65535</code> <p>Default: The
     *         same port as the original DB cluster.
     */
    public void setPort(Integer port) {
        this.port = port;
    }
    
    /**
     * The port number on which the new DB cluster accepts connections.
     * <p>Constraints: Value must be <code>1150-65535</code> <p>Default: The
     * same port as the original DB cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param port The port number on which the new DB cluster accepts connections.
     *         <p>Constraints: Value must be <code>1150-65535</code> <p>Default: The
     *         same port as the original DB cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreDBClusterFromSnapshotRequest withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * The name of the DB subnet group to use for the new DB cluster.
     * <p>Constraints: Must contain no more than 255 alphanumeric characters,
     * periods, underscores, spaces, or hyphens. Must not be default.
     * <p>Example: <code>mySubnetgroup</code>
     *
     * @return The name of the DB subnet group to use for the new DB cluster.
     *         <p>Constraints: Must contain no more than 255 alphanumeric characters,
     *         periods, underscores, spaces, or hyphens. Must not be default.
     *         <p>Example: <code>mySubnetgroup</code>
     */
    public String getDBSubnetGroupName() {
        return dBSubnetGroupName;
    }
    
    /**
     * The name of the DB subnet group to use for the new DB cluster.
     * <p>Constraints: Must contain no more than 255 alphanumeric characters,
     * periods, underscores, spaces, or hyphens. Must not be default.
     * <p>Example: <code>mySubnetgroup</code>
     *
     * @param dBSubnetGroupName The name of the DB subnet group to use for the new DB cluster.
     *         <p>Constraints: Must contain no more than 255 alphanumeric characters,
     *         periods, underscores, spaces, or hyphens. Must not be default.
     *         <p>Example: <code>mySubnetgroup</code>
     */
    public void setDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
    }
    
    /**
     * The name of the DB subnet group to use for the new DB cluster.
     * <p>Constraints: Must contain no more than 255 alphanumeric characters,
     * periods, underscores, spaces, or hyphens. Must not be default.
     * <p>Example: <code>mySubnetgroup</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSubnetGroupName The name of the DB subnet group to use for the new DB cluster.
     *         <p>Constraints: Must contain no more than 255 alphanumeric characters,
     *         periods, underscores, spaces, or hyphens. Must not be default.
     *         <p>Example: <code>mySubnetgroup</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreDBClusterFromSnapshotRequest withDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
        return this;
    }

    /**
     * The database name for the restored DB cluster.
     *
     * @return The database name for the restored DB cluster.
     */
    public String getDatabaseName() {
        return databaseName;
    }
    
    /**
     * The database name for the restored DB cluster.
     *
     * @param databaseName The database name for the restored DB cluster.
     */
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }
    
    /**
     * The database name for the restored DB cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param databaseName The database name for the restored DB cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreDBClusterFromSnapshotRequest withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * The name of the option group to use for the restored DB cluster.
     *
     * @return The name of the option group to use for the restored DB cluster.
     */
    public String getOptionGroupName() {
        return optionGroupName;
    }
    
    /**
     * The name of the option group to use for the restored DB cluster.
     *
     * @param optionGroupName The name of the option group to use for the restored DB cluster.
     */
    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }
    
    /**
     * The name of the option group to use for the restored DB cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionGroupName The name of the option group to use for the restored DB cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreDBClusterFromSnapshotRequest withOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
        return this;
    }

    /**
     * A list of VPC security groups that the new DB cluster will belong to.
     *
     * @return A list of VPC security groups that the new DB cluster will belong to.
     */
    public java.util.List<String> getVpcSecurityGroupIds() {
        if (vpcSecurityGroupIds == null) {
              vpcSecurityGroupIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              vpcSecurityGroupIds.setAutoConstruct(true);
        }
        return vpcSecurityGroupIds;
    }
    
    /**
     * A list of VPC security groups that the new DB cluster will belong to.
     *
     * @param vpcSecurityGroupIds A list of VPC security groups that the new DB cluster will belong to.
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
     * A list of VPC security groups that the new DB cluster will belong to.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setVpcSecurityGroupIds(java.util.Collection)} or
     * {@link #withVpcSecurityGroupIds(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcSecurityGroupIds A list of VPC security groups that the new DB cluster will belong to.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreDBClusterFromSnapshotRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
        if (getVpcSecurityGroupIds() == null) setVpcSecurityGroupIds(new java.util.ArrayList<String>(vpcSecurityGroupIds.length));
        for (String value : vpcSecurityGroupIds) {
            getVpcSecurityGroupIds().add(value);
        }
        return this;
    }
    
    /**
     * A list of VPC security groups that the new DB cluster will belong to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcSecurityGroupIds A list of VPC security groups that the new DB cluster will belong to.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreDBClusterFromSnapshotRequest withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
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
     * The tags to be assigned to the restored DB cluster.
     *
     * @return The tags to be assigned to the restored DB cluster.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * The tags to be assigned to the restored DB cluster.
     *
     * @param tags The tags to be assigned to the restored DB cluster.
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
     * The tags to be assigned to the restored DB cluster.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTags(java.util.Collection)} or {@link
     * #withTags(java.util.Collection)} if you want to override the existing
     * values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The tags to be assigned to the restored DB cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreDBClusterFromSnapshotRequest withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * The tags to be assigned to the restored DB cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The tags to be assigned to the restored DB cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreDBClusterFromSnapshotRequest withTags(java.util.Collection<Tag> tags) {
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
     * The KMS key identifier to use when restoring an encrypted DB cluster
     * from an encrypted DB cluster snapshot. <p>The KMS key identifier is
     * the Amazon Resource Name (ARN) for the KMS encryption key. If you are
     * restoring a DB cluster with the same AWS account that owns the KMS
     * encryption key used to encrypt the new DB cluster, then you can use
     * the KMS key alias instead of the ARN for the KMS encryption key. <p>If
     * you do not specify a value for the <code>KmsKeyId</code> parameter,
     * then the following will occur: <ul> <li>If the DB cluster snapshot is
     * encrypted, then the restored DB cluster is encrypted using the KMS key
     * that was used to encrypt the DB cluster snapshot.</li> <li>If the DB
     * cluster snapshot is not encrypted, then the restored DB cluster is not
     * encrypted.</li> </ul> <p>If <code>SnapshotIdentifier</code> refers to
     * a DB cluster snapshot that is not encrypted, and you specify a value
     * for the <code>KmsKeyId</code> parameter, then the restore request is
     * rejected.
     *
     * @return The KMS key identifier to use when restoring an encrypted DB cluster
     *         from an encrypted DB cluster snapshot. <p>The KMS key identifier is
     *         the Amazon Resource Name (ARN) for the KMS encryption key. If you are
     *         restoring a DB cluster with the same AWS account that owns the KMS
     *         encryption key used to encrypt the new DB cluster, then you can use
     *         the KMS key alias instead of the ARN for the KMS encryption key. <p>If
     *         you do not specify a value for the <code>KmsKeyId</code> parameter,
     *         then the following will occur: <ul> <li>If the DB cluster snapshot is
     *         encrypted, then the restored DB cluster is encrypted using the KMS key
     *         that was used to encrypt the DB cluster snapshot.</li> <li>If the DB
     *         cluster snapshot is not encrypted, then the restored DB cluster is not
     *         encrypted.</li> </ul> <p>If <code>SnapshotIdentifier</code> refers to
     *         a DB cluster snapshot that is not encrypted, and you specify a value
     *         for the <code>KmsKeyId</code> parameter, then the restore request is
     *         rejected.
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }
    
    /**
     * The KMS key identifier to use when restoring an encrypted DB cluster
     * from an encrypted DB cluster snapshot. <p>The KMS key identifier is
     * the Amazon Resource Name (ARN) for the KMS encryption key. If you are
     * restoring a DB cluster with the same AWS account that owns the KMS
     * encryption key used to encrypt the new DB cluster, then you can use
     * the KMS key alias instead of the ARN for the KMS encryption key. <p>If
     * you do not specify a value for the <code>KmsKeyId</code> parameter,
     * then the following will occur: <ul> <li>If the DB cluster snapshot is
     * encrypted, then the restored DB cluster is encrypted using the KMS key
     * that was used to encrypt the DB cluster snapshot.</li> <li>If the DB
     * cluster snapshot is not encrypted, then the restored DB cluster is not
     * encrypted.</li> </ul> <p>If <code>SnapshotIdentifier</code> refers to
     * a DB cluster snapshot that is not encrypted, and you specify a value
     * for the <code>KmsKeyId</code> parameter, then the restore request is
     * rejected.
     *
     * @param kmsKeyId The KMS key identifier to use when restoring an encrypted DB cluster
     *         from an encrypted DB cluster snapshot. <p>The KMS key identifier is
     *         the Amazon Resource Name (ARN) for the KMS encryption key. If you are
     *         restoring a DB cluster with the same AWS account that owns the KMS
     *         encryption key used to encrypt the new DB cluster, then you can use
     *         the KMS key alias instead of the ARN for the KMS encryption key. <p>If
     *         you do not specify a value for the <code>KmsKeyId</code> parameter,
     *         then the following will occur: <ul> <li>If the DB cluster snapshot is
     *         encrypted, then the restored DB cluster is encrypted using the KMS key
     *         that was used to encrypt the DB cluster snapshot.</li> <li>If the DB
     *         cluster snapshot is not encrypted, then the restored DB cluster is not
     *         encrypted.</li> </ul> <p>If <code>SnapshotIdentifier</code> refers to
     *         a DB cluster snapshot that is not encrypted, and you specify a value
     *         for the <code>KmsKeyId</code> parameter, then the restore request is
     *         rejected.
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }
    
    /**
     * The KMS key identifier to use when restoring an encrypted DB cluster
     * from an encrypted DB cluster snapshot. <p>The KMS key identifier is
     * the Amazon Resource Name (ARN) for the KMS encryption key. If you are
     * restoring a DB cluster with the same AWS account that owns the KMS
     * encryption key used to encrypt the new DB cluster, then you can use
     * the KMS key alias instead of the ARN for the KMS encryption key. <p>If
     * you do not specify a value for the <code>KmsKeyId</code> parameter,
     * then the following will occur: <ul> <li>If the DB cluster snapshot is
     * encrypted, then the restored DB cluster is encrypted using the KMS key
     * that was used to encrypt the DB cluster snapshot.</li> <li>If the DB
     * cluster snapshot is not encrypted, then the restored DB cluster is not
     * encrypted.</li> </ul> <p>If <code>SnapshotIdentifier</code> refers to
     * a DB cluster snapshot that is not encrypted, and you specify a value
     * for the <code>KmsKeyId</code> parameter, then the restore request is
     * rejected.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param kmsKeyId The KMS key identifier to use when restoring an encrypted DB cluster
     *         from an encrypted DB cluster snapshot. <p>The KMS key identifier is
     *         the Amazon Resource Name (ARN) for the KMS encryption key. If you are
     *         restoring a DB cluster with the same AWS account that owns the KMS
     *         encryption key used to encrypt the new DB cluster, then you can use
     *         the KMS key alias instead of the ARN for the KMS encryption key. <p>If
     *         you do not specify a value for the <code>KmsKeyId</code> parameter,
     *         then the following will occur: <ul> <li>If the DB cluster snapshot is
     *         encrypted, then the restored DB cluster is encrypted using the KMS key
     *         that was used to encrypt the DB cluster snapshot.</li> <li>If the DB
     *         cluster snapshot is not encrypted, then the restored DB cluster is not
     *         encrypted.</li> </ul> <p>If <code>SnapshotIdentifier</code> refers to
     *         a DB cluster snapshot that is not encrypted, and you specify a value
     *         for the <code>KmsKeyId</code> parameter, then the restore request is
     *         rejected.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreDBClusterFromSnapshotRequest withKmsKeyId(String kmsKeyId) {
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
        if (getDBClusterIdentifier() != null) sb.append("DBClusterIdentifier: " + getDBClusterIdentifier() + ",");
        if (getSnapshotIdentifier() != null) sb.append("SnapshotIdentifier: " + getSnapshotIdentifier() + ",");
        if (getEngine() != null) sb.append("Engine: " + getEngine() + ",");
        if (getEngineVersion() != null) sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getPort() != null) sb.append("Port: " + getPort() + ",");
        if (getDBSubnetGroupName() != null) sb.append("DBSubnetGroupName: " + getDBSubnetGroupName() + ",");
        if (getDatabaseName() != null) sb.append("DatabaseName: " + getDatabaseName() + ",");
        if (getOptionGroupName() != null) sb.append("OptionGroupName: " + getOptionGroupName() + ",");
        if (getVpcSecurityGroupIds() != null) sb.append("VpcSecurityGroupIds: " + getVpcSecurityGroupIds() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() + ",");
        if (getKmsKeyId() != null) sb.append("KmsKeyId: " + getKmsKeyId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode()); 
        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getSnapshotIdentifier() == null) ? 0 : getSnapshotIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode()); 
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode()); 
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode()); 
        hashCode = prime * hashCode + ((getDBSubnetGroupName() == null) ? 0 : getDBSubnetGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode()); 
        hashCode = prime * hashCode + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RestoreDBClusterFromSnapshotRequest == false) return false;
        RestoreDBClusterFromSnapshotRequest other = (RestoreDBClusterFromSnapshotRequest)obj;
        
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null) return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false) return false; 
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null) return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false) return false; 
        if (other.getSnapshotIdentifier() == null ^ this.getSnapshotIdentifier() == null) return false;
        if (other.getSnapshotIdentifier() != null && other.getSnapshotIdentifier().equals(this.getSnapshotIdentifier()) == false) return false; 
        if (other.getEngine() == null ^ this.getEngine() == null) return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false) return false; 
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null) return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false) return false; 
        if (other.getPort() == null ^ this.getPort() == null) return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false) return false; 
        if (other.getDBSubnetGroupName() == null ^ this.getDBSubnetGroupName() == null) return false;
        if (other.getDBSubnetGroupName() != null && other.getDBSubnetGroupName().equals(this.getDBSubnetGroupName()) == false) return false; 
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null) return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false) return false; 
        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null) return false;
        if (other.getOptionGroupName() != null && other.getOptionGroupName().equals(this.getOptionGroupName()) == false) return false; 
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null) return false;
        if (other.getVpcSecurityGroupIds() != null && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null) return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false) return false; 
        return true;
    }
    
    @Override
    public RestoreDBClusterFromSnapshotRequest clone() {
        
            return (RestoreDBClusterFromSnapshotRequest) super.clone();
    }

}
    