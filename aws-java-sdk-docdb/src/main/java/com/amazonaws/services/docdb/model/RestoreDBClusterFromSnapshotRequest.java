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
package com.amazonaws.services.docdb.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input to <a>RestoreDBClusterFromSnapshot</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/RestoreDBClusterFromSnapshot" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreDBClusterFromSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Provides the list of Amazon EC2 Availability Zones that instances in the restored DB cluster can be created in.
     * </p>
     */
    private java.util.List<String> availabilityZones;
    /**
     * <p>
     * The name of the DB cluster to create from the DB snapshot or DB cluster snapshot. This parameter isn't case
     * sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-snapshot-id</code>
     * </p>
     */
    private String dBClusterIdentifier;
    /**
     * <p>
     * The identifier for the DB snapshot or DB cluster snapshot to restore from.
     * </p>
     * <p>
     * You can use either the name or the Amazon Resource Name (ARN) to specify a DB cluster snapshot. However, you can
     * use only the ARN to specify a DB snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing snapshot.
     * </p>
     * </li>
     * </ul>
     */
    private String snapshotIdentifier;
    /**
     * <p>
     * The database engine to use for the new DB cluster.
     * </p>
     * <p>
     * Default: The same as source.
     * </p>
     * <p>
     * Constraint: Must be compatible with the engine of the source.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * The version of the database engine to use for the new DB cluster.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The port number on which the new DB cluster accepts connections.
     * </p>
     * <p>
     * Constraints: Must be a value from <code>1150</code> to <code>65535</code>.
     * </p>
     * <p>
     * Default: The same port as the original DB cluster.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The name of the DB subnet group to use for the new DB cluster.
     * </p>
     * <p>
     * Constraints: If provided, must match the name of an existing <code>DBSubnetGroup</code>.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     */
    private String dBSubnetGroupName;
    /**
     * <p>
     * A list of virtual private cloud (VPC) security groups that the new DB cluster will belong to.
     * </p>
     */
    private java.util.List<String> vpcSecurityGroupIds;
    /**
     * <p>
     * The tags to be assigned to the restored DB cluster.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The AWS KMS key identifier to use when restoring an encrypted DB cluster from a DB snapshot or DB cluster
     * snapshot.
     * </p>
     * <p>
     * The AWS KMS key identifier is the Amazon Resource Name (ARN) for the AWS KMS encryption key. If you are restoring
     * a DB cluster with the same AWS account that owns the AWS KMS encryption key used to encrypt the new DB cluster,
     * then you can use the AWS KMS key alias instead of the ARN for the AWS KMS encryption key.
     * </p>
     * <p>
     * If you do not specify a value for the <code>KmsKeyId</code> parameter, then the following occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the DB snapshot or DB cluster snapshot in <code>SnapshotIdentifier</code> is encrypted, then the restored DB
     * cluster is encrypted using the AWS KMS key that was used to encrypt the DB snapshot or the DB cluster snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the DB snapshot or the DB cluster snapshot in <code>SnapshotIdentifier</code> is not encrypted, then the
     * restored DB cluster is not encrypted.
     * </p>
     * </li>
     * </ul>
     */
    private String kmsKeyId;
    /**
     * <p>
     * A list of log types that must be enabled for exporting to Amazon CloudWatch Logs.
     * </p>
     */
    private java.util.List<String> enableCloudwatchLogsExports;

    /**
     * <p>
     * Provides the list of Amazon EC2 Availability Zones that instances in the restored DB cluster can be created in.
     * </p>
     * 
     * @return Provides the list of Amazon EC2 Availability Zones that instances in the restored DB cluster can be
     *         created in.
     */

    public java.util.List<String> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * <p>
     * Provides the list of Amazon EC2 Availability Zones that instances in the restored DB cluster can be created in.
     * </p>
     * 
     * @param availabilityZones
     *        Provides the list of Amazon EC2 Availability Zones that instances in the restored DB cluster can be
     *        created in.
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
     * Provides the list of Amazon EC2 Availability Zones that instances in the restored DB cluster can be created in.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityZones(java.util.Collection)} or {@link #withAvailabilityZones(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        Provides the list of Amazon EC2 Availability Zones that instances in the restored DB cluster can be
     *        created in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withAvailabilityZones(String... availabilityZones) {
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
     * Provides the list of Amazon EC2 Availability Zones that instances in the restored DB cluster can be created in.
     * </p>
     * 
     * @param availabilityZones
     *        Provides the list of Amazon EC2 Availability Zones that instances in the restored DB cluster can be
     *        created in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * The name of the DB cluster to create from the DB snapshot or DB cluster snapshot. This parameter isn't case
     * sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-snapshot-id</code>
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The name of the DB cluster to create from the DB snapshot or DB cluster snapshot. This parameter isn't
     *        case sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 letters, numbers, or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The first character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>my-snapshot-id</code>
     */

    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * The name of the DB cluster to create from the DB snapshot or DB cluster snapshot. This parameter isn't case
     * sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-snapshot-id</code>
     * </p>
     * 
     * @return The name of the DB cluster to create from the DB snapshot or DB cluster snapshot. This parameter isn't
     *         case sensitive.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain from 1 to 63 letters, numbers, or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The first character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot end with a hyphen or contain two consecutive hyphens.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>my-snapshot-id</code>
     */

    public String getDBClusterIdentifier() {
        return this.dBClusterIdentifier;
    }

    /**
     * <p>
     * The name of the DB cluster to create from the DB snapshot or DB cluster snapshot. This parameter isn't case
     * sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-snapshot-id</code>
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The name of the DB cluster to create from the DB snapshot or DB cluster snapshot. This parameter isn't
     *        case sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 letters, numbers, or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The first character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>my-snapshot-id</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        setDBClusterIdentifier(dBClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier for the DB snapshot or DB cluster snapshot to restore from.
     * </p>
     * <p>
     * You can use either the name or the Amazon Resource Name (ARN) to specify a DB cluster snapshot. However, you can
     * use only the ARN to specify a DB snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing snapshot.
     * </p>
     * </li>
     * </ul>
     * 
     * @param snapshotIdentifier
     *        The identifier for the DB snapshot or DB cluster snapshot to restore from.</p>
     *        <p>
     *        You can use either the name or the Amazon Resource Name (ARN) to specify a DB cluster snapshot. However,
     *        you can use only the ARN to specify a DB snapshot.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the identifier of an existing snapshot.
     *        </p>
     *        </li>
     */

    public void setSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
    }

    /**
     * <p>
     * The identifier for the DB snapshot or DB cluster snapshot to restore from.
     * </p>
     * <p>
     * You can use either the name or the Amazon Resource Name (ARN) to specify a DB cluster snapshot. However, you can
     * use only the ARN to specify a DB snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing snapshot.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The identifier for the DB snapshot or DB cluster snapshot to restore from.</p>
     *         <p>
     *         You can use either the name or the Amazon Resource Name (ARN) to specify a DB cluster snapshot. However,
     *         you can use only the ARN to specify a DB snapshot.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must match the identifier of an existing snapshot.
     *         </p>
     *         </li>
     */

    public String getSnapshotIdentifier() {
        return this.snapshotIdentifier;
    }

    /**
     * <p>
     * The identifier for the DB snapshot or DB cluster snapshot to restore from.
     * </p>
     * <p>
     * You can use either the name or the Amazon Resource Name (ARN) to specify a DB cluster snapshot. However, you can
     * use only the ARN to specify a DB snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing snapshot.
     * </p>
     * </li>
     * </ul>
     * 
     * @param snapshotIdentifier
     *        The identifier for the DB snapshot or DB cluster snapshot to restore from.</p>
     *        <p>
     *        You can use either the name or the Amazon Resource Name (ARN) to specify a DB cluster snapshot. However,
     *        you can use only the ARN to specify a DB snapshot.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the identifier of an existing snapshot.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withSnapshotIdentifier(String snapshotIdentifier) {
        setSnapshotIdentifier(snapshotIdentifier);
        return this;
    }

    /**
     * <p>
     * The database engine to use for the new DB cluster.
     * </p>
     * <p>
     * Default: The same as source.
     * </p>
     * <p>
     * Constraint: Must be compatible with the engine of the source.
     * </p>
     * 
     * @param engine
     *        The database engine to use for the new DB cluster.</p>
     *        <p>
     *        Default: The same as source.
     *        </p>
     *        <p>
     *        Constraint: Must be compatible with the engine of the source.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The database engine to use for the new DB cluster.
     * </p>
     * <p>
     * Default: The same as source.
     * </p>
     * <p>
     * Constraint: Must be compatible with the engine of the source.
     * </p>
     * 
     * @return The database engine to use for the new DB cluster.</p>
     *         <p>
     *         Default: The same as source.
     *         </p>
     *         <p>
     *         Constraint: Must be compatible with the engine of the source.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The database engine to use for the new DB cluster.
     * </p>
     * <p>
     * Default: The same as source.
     * </p>
     * <p>
     * Constraint: Must be compatible with the engine of the source.
     * </p>
     * 
     * @param engine
     *        The database engine to use for the new DB cluster.</p>
     *        <p>
     *        Default: The same as source.
     *        </p>
     *        <p>
     *        Constraint: Must be compatible with the engine of the source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The version of the database engine to use for the new DB cluster.
     * </p>
     * 
     * @param engineVersion
     *        The version of the database engine to use for the new DB cluster.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version of the database engine to use for the new DB cluster.
     * </p>
     * 
     * @return The version of the database engine to use for the new DB cluster.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The version of the database engine to use for the new DB cluster.
     * </p>
     * 
     * @param engineVersion
     *        The version of the database engine to use for the new DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The port number on which the new DB cluster accepts connections.
     * </p>
     * <p>
     * Constraints: Must be a value from <code>1150</code> to <code>65535</code>.
     * </p>
     * <p>
     * Default: The same port as the original DB cluster.
     * </p>
     * 
     * @param port
     *        The port number on which the new DB cluster accepts connections.</p>
     *        <p>
     *        Constraints: Must be a value from <code>1150</code> to <code>65535</code>.
     *        </p>
     *        <p>
     *        Default: The same port as the original DB cluster.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port number on which the new DB cluster accepts connections.
     * </p>
     * <p>
     * Constraints: Must be a value from <code>1150</code> to <code>65535</code>.
     * </p>
     * <p>
     * Default: The same port as the original DB cluster.
     * </p>
     * 
     * @return The port number on which the new DB cluster accepts connections.</p>
     *         <p>
     *         Constraints: Must be a value from <code>1150</code> to <code>65535</code>.
     *         </p>
     *         <p>
     *         Default: The same port as the original DB cluster.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port number on which the new DB cluster accepts connections.
     * </p>
     * <p>
     * Constraints: Must be a value from <code>1150</code> to <code>65535</code>.
     * </p>
     * <p>
     * Default: The same port as the original DB cluster.
     * </p>
     * 
     * @param port
     *        The port number on which the new DB cluster accepts connections.</p>
     *        <p>
     *        Constraints: Must be a value from <code>1150</code> to <code>65535</code>.
     *        </p>
     *        <p>
     *        Default: The same port as the original DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The name of the DB subnet group to use for the new DB cluster.
     * </p>
     * <p>
     * Constraints: If provided, must match the name of an existing <code>DBSubnetGroup</code>.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * 
     * @param dBSubnetGroupName
     *        The name of the DB subnet group to use for the new DB cluster.</p>
     *        <p>
     *        Constraints: If provided, must match the name of an existing <code>DBSubnetGroup</code>.
     *        </p>
     *        <p>
     *        Example: <code>mySubnetgroup</code>
     */

    public void setDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
    }

    /**
     * <p>
     * The name of the DB subnet group to use for the new DB cluster.
     * </p>
     * <p>
     * Constraints: If provided, must match the name of an existing <code>DBSubnetGroup</code>.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * 
     * @return The name of the DB subnet group to use for the new DB cluster.</p>
     *         <p>
     *         Constraints: If provided, must match the name of an existing <code>DBSubnetGroup</code>.
     *         </p>
     *         <p>
     *         Example: <code>mySubnetgroup</code>
     */

    public String getDBSubnetGroupName() {
        return this.dBSubnetGroupName;
    }

    /**
     * <p>
     * The name of the DB subnet group to use for the new DB cluster.
     * </p>
     * <p>
     * Constraints: If provided, must match the name of an existing <code>DBSubnetGroup</code>.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * 
     * @param dBSubnetGroupName
     *        The name of the DB subnet group to use for the new DB cluster.</p>
     *        <p>
     *        Constraints: If provided, must match the name of an existing <code>DBSubnetGroup</code>.
     *        </p>
     *        <p>
     *        Example: <code>mySubnetgroup</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withDBSubnetGroupName(String dBSubnetGroupName) {
        setDBSubnetGroupName(dBSubnetGroupName);
        return this;
    }

    /**
     * <p>
     * A list of virtual private cloud (VPC) security groups that the new DB cluster will belong to.
     * </p>
     * 
     * @return A list of virtual private cloud (VPC) security groups that the new DB cluster will belong to.
     */

    public java.util.List<String> getVpcSecurityGroupIds() {
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * A list of virtual private cloud (VPC) security groups that the new DB cluster will belong to.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of virtual private cloud (VPC) security groups that the new DB cluster will belong to.
     */

    public void setVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        if (vpcSecurityGroupIds == null) {
            this.vpcSecurityGroupIds = null;
            return;
        }

        this.vpcSecurityGroupIds = new java.util.ArrayList<String>(vpcSecurityGroupIds);
    }

    /**
     * <p>
     * A list of virtual private cloud (VPC) security groups that the new DB cluster will belong to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroupIds(java.util.Collection)} or {@link #withVpcSecurityGroupIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of virtual private cloud (VPC) security groups that the new DB cluster will belong to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
        if (this.vpcSecurityGroupIds == null) {
            setVpcSecurityGroupIds(new java.util.ArrayList<String>(vpcSecurityGroupIds.length));
        }
        for (String ele : vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of virtual private cloud (VPC) security groups that the new DB cluster will belong to.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of virtual private cloud (VPC) security groups that the new DB cluster will belong to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * The tags to be assigned to the restored DB cluster.
     * </p>
     * 
     * @return The tags to be assigned to the restored DB cluster.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to be assigned to the restored DB cluster.
     * </p>
     * 
     * @param tags
     *        The tags to be assigned to the restored DB cluster.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags to be assigned to the restored DB cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags to be assigned to the restored DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to be assigned to the restored DB cluster.
     * </p>
     * 
     * @param tags
     *        The tags to be assigned to the restored DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The AWS KMS key identifier to use when restoring an encrypted DB cluster from a DB snapshot or DB cluster
     * snapshot.
     * </p>
     * <p>
     * The AWS KMS key identifier is the Amazon Resource Name (ARN) for the AWS KMS encryption key. If you are restoring
     * a DB cluster with the same AWS account that owns the AWS KMS encryption key used to encrypt the new DB cluster,
     * then you can use the AWS KMS key alias instead of the ARN for the AWS KMS encryption key.
     * </p>
     * <p>
     * If you do not specify a value for the <code>KmsKeyId</code> parameter, then the following occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the DB snapshot or DB cluster snapshot in <code>SnapshotIdentifier</code> is encrypted, then the restored DB
     * cluster is encrypted using the AWS KMS key that was used to encrypt the DB snapshot or the DB cluster snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the DB snapshot or the DB cluster snapshot in <code>SnapshotIdentifier</code> is not encrypted, then the
     * restored DB cluster is not encrypted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param kmsKeyId
     *        The AWS KMS key identifier to use when restoring an encrypted DB cluster from a DB snapshot or DB cluster
     *        snapshot.</p>
     *        <p>
     *        The AWS KMS key identifier is the Amazon Resource Name (ARN) for the AWS KMS encryption key. If you are
     *        restoring a DB cluster with the same AWS account that owns the AWS KMS encryption key used to encrypt the
     *        new DB cluster, then you can use the AWS KMS key alias instead of the ARN for the AWS KMS encryption key.
     *        </p>
     *        <p>
     *        If you do not specify a value for the <code>KmsKeyId</code> parameter, then the following occurs:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the DB snapshot or DB cluster snapshot in <code>SnapshotIdentifier</code> is encrypted, then the
     *        restored DB cluster is encrypted using the AWS KMS key that was used to encrypt the DB snapshot or the DB
     *        cluster snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the DB snapshot or the DB cluster snapshot in <code>SnapshotIdentifier</code> is not encrypted, then
     *        the restored DB cluster is not encrypted.
     *        </p>
     *        </li>
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key identifier to use when restoring an encrypted DB cluster from a DB snapshot or DB cluster
     * snapshot.
     * </p>
     * <p>
     * The AWS KMS key identifier is the Amazon Resource Name (ARN) for the AWS KMS encryption key. If you are restoring
     * a DB cluster with the same AWS account that owns the AWS KMS encryption key used to encrypt the new DB cluster,
     * then you can use the AWS KMS key alias instead of the ARN for the AWS KMS encryption key.
     * </p>
     * <p>
     * If you do not specify a value for the <code>KmsKeyId</code> parameter, then the following occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the DB snapshot or DB cluster snapshot in <code>SnapshotIdentifier</code> is encrypted, then the restored DB
     * cluster is encrypted using the AWS KMS key that was used to encrypt the DB snapshot or the DB cluster snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the DB snapshot or the DB cluster snapshot in <code>SnapshotIdentifier</code> is not encrypted, then the
     * restored DB cluster is not encrypted.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The AWS KMS key identifier to use when restoring an encrypted DB cluster from a DB snapshot or DB cluster
     *         snapshot.</p>
     *         <p>
     *         The AWS KMS key identifier is the Amazon Resource Name (ARN) for the AWS KMS encryption key. If you are
     *         restoring a DB cluster with the same AWS account that owns the AWS KMS encryption key used to encrypt the
     *         new DB cluster, then you can use the AWS KMS key alias instead of the ARN for the AWS KMS encryption key.
     *         </p>
     *         <p>
     *         If you do not specify a value for the <code>KmsKeyId</code> parameter, then the following occurs:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the DB snapshot or DB cluster snapshot in <code>SnapshotIdentifier</code> is encrypted, then the
     *         restored DB cluster is encrypted using the AWS KMS key that was used to encrypt the DB snapshot or the DB
     *         cluster snapshot.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the DB snapshot or the DB cluster snapshot in <code>SnapshotIdentifier</code> is not encrypted, then
     *         the restored DB cluster is not encrypted.
     *         </p>
     *         </li>
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key identifier to use when restoring an encrypted DB cluster from a DB snapshot or DB cluster
     * snapshot.
     * </p>
     * <p>
     * The AWS KMS key identifier is the Amazon Resource Name (ARN) for the AWS KMS encryption key. If you are restoring
     * a DB cluster with the same AWS account that owns the AWS KMS encryption key used to encrypt the new DB cluster,
     * then you can use the AWS KMS key alias instead of the ARN for the AWS KMS encryption key.
     * </p>
     * <p>
     * If you do not specify a value for the <code>KmsKeyId</code> parameter, then the following occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the DB snapshot or DB cluster snapshot in <code>SnapshotIdentifier</code> is encrypted, then the restored DB
     * cluster is encrypted using the AWS KMS key that was used to encrypt the DB snapshot or the DB cluster snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the DB snapshot or the DB cluster snapshot in <code>SnapshotIdentifier</code> is not encrypted, then the
     * restored DB cluster is not encrypted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param kmsKeyId
     *        The AWS KMS key identifier to use when restoring an encrypted DB cluster from a DB snapshot or DB cluster
     *        snapshot.</p>
     *        <p>
     *        The AWS KMS key identifier is the Amazon Resource Name (ARN) for the AWS KMS encryption key. If you are
     *        restoring a DB cluster with the same AWS account that owns the AWS KMS encryption key used to encrypt the
     *        new DB cluster, then you can use the AWS KMS key alias instead of the ARN for the AWS KMS encryption key.
     *        </p>
     *        <p>
     *        If you do not specify a value for the <code>KmsKeyId</code> parameter, then the following occurs:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the DB snapshot or DB cluster snapshot in <code>SnapshotIdentifier</code> is encrypted, then the
     *        restored DB cluster is encrypted using the AWS KMS key that was used to encrypt the DB snapshot or the DB
     *        cluster snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the DB snapshot or the DB cluster snapshot in <code>SnapshotIdentifier</code> is not encrypted, then
     *        the restored DB cluster is not encrypted.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * A list of log types that must be enabled for exporting to Amazon CloudWatch Logs.
     * </p>
     * 
     * @return A list of log types that must be enabled for exporting to Amazon CloudWatch Logs.
     */

    public java.util.List<String> getEnableCloudwatchLogsExports() {
        return enableCloudwatchLogsExports;
    }

    /**
     * <p>
     * A list of log types that must be enabled for exporting to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param enableCloudwatchLogsExports
     *        A list of log types that must be enabled for exporting to Amazon CloudWatch Logs.
     */

    public void setEnableCloudwatchLogsExports(java.util.Collection<String> enableCloudwatchLogsExports) {
        if (enableCloudwatchLogsExports == null) {
            this.enableCloudwatchLogsExports = null;
            return;
        }

        this.enableCloudwatchLogsExports = new java.util.ArrayList<String>(enableCloudwatchLogsExports);
    }

    /**
     * <p>
     * A list of log types that must be enabled for exporting to Amazon CloudWatch Logs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnableCloudwatchLogsExports(java.util.Collection)} or
     * {@link #withEnableCloudwatchLogsExports(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param enableCloudwatchLogsExports
     *        A list of log types that must be enabled for exporting to Amazon CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withEnableCloudwatchLogsExports(String... enableCloudwatchLogsExports) {
        if (this.enableCloudwatchLogsExports == null) {
            setEnableCloudwatchLogsExports(new java.util.ArrayList<String>(enableCloudwatchLogsExports.length));
        }
        for (String ele : enableCloudwatchLogsExports) {
            this.enableCloudwatchLogsExports.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of log types that must be enabled for exporting to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param enableCloudwatchLogsExports
     *        A list of log types that must be enabled for exporting to Amazon CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withEnableCloudwatchLogsExports(java.util.Collection<String> enableCloudwatchLogsExports) {
        setEnableCloudwatchLogsExports(enableCloudwatchLogsExports);
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
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: ").append(getAvailabilityZones()).append(",");
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: ").append(getDBClusterIdentifier()).append(",");
        if (getSnapshotIdentifier() != null)
            sb.append("SnapshotIdentifier: ").append(getSnapshotIdentifier()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getDBSubnetGroupName() != null)
            sb.append("DBSubnetGroupName: ").append(getDBSubnetGroupName()).append(",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: ").append(getVpcSecurityGroupIds()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getEnableCloudwatchLogsExports() != null)
            sb.append("EnableCloudwatchLogsExports: ").append(getEnableCloudwatchLogsExports());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreDBClusterFromSnapshotRequest == false)
            return false;
        RestoreDBClusterFromSnapshotRequest other = (RestoreDBClusterFromSnapshotRequest) obj;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getSnapshotIdentifier() == null ^ this.getSnapshotIdentifier() == null)
            return false;
        if (other.getSnapshotIdentifier() != null && other.getSnapshotIdentifier().equals(this.getSnapshotIdentifier()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getDBSubnetGroupName() == null ^ this.getDBSubnetGroupName() == null)
            return false;
        if (other.getDBSubnetGroupName() != null && other.getDBSubnetGroupName().equals(this.getDBSubnetGroupName()) == false)
            return false;
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null)
            return false;
        if (other.getVpcSecurityGroupIds() != null && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getEnableCloudwatchLogsExports() == null ^ this.getEnableCloudwatchLogsExports() == null)
            return false;
        if (other.getEnableCloudwatchLogsExports() != null && other.getEnableCloudwatchLogsExports().equals(this.getEnableCloudwatchLogsExports()) == false)
            return false;
        return true;
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
        hashCode = prime * hashCode + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getEnableCloudwatchLogsExports() == null) ? 0 : getEnableCloudwatchLogsExports().hashCode());
        return hashCode;
    }

    @Override
    public RestoreDBClusterFromSnapshotRequest clone() {
        return (RestoreDBClusterFromSnapshotRequest) super.clone();
    }

}
