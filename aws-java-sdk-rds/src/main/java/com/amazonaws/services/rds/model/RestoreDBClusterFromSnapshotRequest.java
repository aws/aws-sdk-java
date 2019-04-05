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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RestoreDBClusterFromSnapshot" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreDBClusterFromSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Provides the list of Amazon EC2 Availability Zones that instances in the restored DB cluster can be created in.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> availabilityZones;
    /**
     * <p>
     * The name of the DB cluster to create from the DB snapshot or DB cluster snapshot. This parameter isn't
     * case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
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
     * Must match the identifier of an existing Snapshot.
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
     * Default: The same as source
     * </p>
     * <p>
     * Constraint: Must be compatible with the engine of the source
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
     * Constraints: This value must be <code>1150-65535</code>
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
     * Constraints: If supplied, must match the name of an existing DB subnet group.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     */
    private String dBSubnetGroupName;
    /**
     * <p>
     * The database name for the restored DB cluster.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The name of the option group to use for the restored DB cluster.
     * </p>
     */
    private String optionGroupName;
    /**
     * <p>
     * A list of VPC security groups that the new DB cluster will belong to.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupIds;
    /**
     * <p>
     * The tags to be assigned to the restored DB cluster.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The AWS KMS key identifier to use when restoring an encrypted DB cluster from a DB snapshot or DB cluster
     * snapshot.
     * </p>
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are restoring a DB
     * cluster with the same AWS account that owns the KMS encryption key used to encrypt the new DB cluster, then you
     * can use the KMS key alias instead of the ARN for the KMS encryption key.
     * </p>
     * <p>
     * If you don't specify a value for the <code>KmsKeyId</code> parameter, then the following occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the DB snapshot or DB cluster snapshot in <code>SnapshotIdentifier</code> is encrypted, then the restored DB
     * cluster is encrypted using the KMS key that was used to encrypt the DB snapshot or DB cluster snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the DB snapshot or DB cluster snapshot in <code>SnapshotIdentifier</code> is not encrypted, then the restored
     * DB cluster is not encrypted.
     * </p>
     * </li>
     * </ul>
     */
    private String kmsKeyId;
    /**
     * <p>
     * True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts, and otherwise
     * false.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean enableIAMDatabaseAuthentication;
    /**
     * <p>
     * The target backtrack window, in seconds. To disable backtracking, set this value to 0.
     * </p>
     * <p>
     * Default: 0
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If specified, this value must be set to a number from 0 to 259,200 (72 hours).
     * </p>
     * </li>
     * </ul>
     */
    private Long backtrackWindow;
    /**
     * <p>
     * The list of logs that the restored DB cluster is to export to Amazon CloudWatch Logs. The values in the list
     * depend on the DB engine being used. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> enableCloudwatchLogsExports;
    /**
     * <p>
     * The DB engine mode of the DB cluster, either <code>provisioned</code>, <code>serverless</code>, or
     * <code>parallelquery</code>.
     * </p>
     */
    private String engineMode;
    /**
     * <p>
     * For DB clusters in <code>serverless</code> DB engine mode, the scaling properties of the DB cluster.
     * </p>
     */
    private ScalingConfiguration scalingConfiguration;
    /**
     * <p>
     * The name of the DB cluster parameter group to associate with this DB cluster. If this argument is omitted, the
     * default DB cluster parameter group for the specified engine is used.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the name of an existing default DB cluster parameter group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     */
    private String dBClusterParameterGroupName;
    /**
     * <p>
     * Indicates if the DB cluster should have deletion protection enabled. The database can't be deleted when this
     * value is set to true. The default is false.
     * </p>
     */
    private Boolean deletionProtection;
    /**
     * <p>
     * True to copy all tags from the restored DB cluster to snapshots of the restored DB cluster, and otherwise false.
     * The default is false.
     * </p>
     */
    private Boolean copyTagsToSnapshot;

    /**
     * <p>
     * Provides the list of Amazon EC2 Availability Zones that instances in the restored DB cluster can be created in.
     * </p>
     * 
     * @return Provides the list of Amazon EC2 Availability Zones that instances in the restored DB cluster can be
     *         created in.
     */

    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
            availabilityZones = new com.amazonaws.internal.SdkInternalList<String>();
        }
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

        this.availabilityZones = new com.amazonaws.internal.SdkInternalList<String>(availabilityZones);
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
            setAvailabilityZones(new com.amazonaws.internal.SdkInternalList<String>(availabilityZones.length));
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
     * The name of the DB cluster to create from the DB snapshot or DB cluster snapshot. This parameter isn't
     * case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-snapshot-id</code>
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The name of the DB cluster to create from the DB snapshot or DB cluster snapshot. This parameter isn't
     *        case-sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 letters, numbers, or hyphens
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't end with a hyphen or contain two consecutive hyphens
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
     * The name of the DB cluster to create from the DB snapshot or DB cluster snapshot. This parameter isn't
     * case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-snapshot-id</code>
     * </p>
     * 
     * @return The name of the DB cluster to create from the DB snapshot or DB cluster snapshot. This parameter isn't
     *         case-sensitive.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain from 1 to 63 letters, numbers, or hyphens
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't end with a hyphen or contain two consecutive hyphens
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
     * The name of the DB cluster to create from the DB snapshot or DB cluster snapshot. This parameter isn't
     * case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-snapshot-id</code>
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The name of the DB cluster to create from the DB snapshot or DB cluster snapshot. This parameter isn't
     *        case-sensitive.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 letters, numbers, or hyphens
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't end with a hyphen or contain two consecutive hyphens
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
     * Must match the identifier of an existing Snapshot.
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
     *        Must match the identifier of an existing Snapshot.
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
     * Must match the identifier of an existing Snapshot.
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
     *         Must match the identifier of an existing Snapshot.
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
     * Must match the identifier of an existing Snapshot.
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
     *        Must match the identifier of an existing Snapshot.
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
     * Default: The same as source
     * </p>
     * <p>
     * Constraint: Must be compatible with the engine of the source
     * </p>
     * 
     * @param engine
     *        The database engine to use for the new DB cluster.</p>
     *        <p>
     *        Default: The same as source
     *        </p>
     *        <p>
     *        Constraint: Must be compatible with the engine of the source
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The database engine to use for the new DB cluster.
     * </p>
     * <p>
     * Default: The same as source
     * </p>
     * <p>
     * Constraint: Must be compatible with the engine of the source
     * </p>
     * 
     * @return The database engine to use for the new DB cluster.</p>
     *         <p>
     *         Default: The same as source
     *         </p>
     *         <p>
     *         Constraint: Must be compatible with the engine of the source
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The database engine to use for the new DB cluster.
     * </p>
     * <p>
     * Default: The same as source
     * </p>
     * <p>
     * Constraint: Must be compatible with the engine of the source
     * </p>
     * 
     * @param engine
     *        The database engine to use for the new DB cluster.</p>
     *        <p>
     *        Default: The same as source
     *        </p>
     *        <p>
     *        Constraint: Must be compatible with the engine of the source
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
     * Constraints: This value must be <code>1150-65535</code>
     * </p>
     * <p>
     * Default: The same port as the original DB cluster.
     * </p>
     * 
     * @param port
     *        The port number on which the new DB cluster accepts connections.</p>
     *        <p>
     *        Constraints: This value must be <code>1150-65535</code>
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
     * Constraints: This value must be <code>1150-65535</code>
     * </p>
     * <p>
     * Default: The same port as the original DB cluster.
     * </p>
     * 
     * @return The port number on which the new DB cluster accepts connections.</p>
     *         <p>
     *         Constraints: This value must be <code>1150-65535</code>
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
     * Constraints: This value must be <code>1150-65535</code>
     * </p>
     * <p>
     * Default: The same port as the original DB cluster.
     * </p>
     * 
     * @param port
     *        The port number on which the new DB cluster accepts connections.</p>
     *        <p>
     *        Constraints: This value must be <code>1150-65535</code>
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
     * Constraints: If supplied, must match the name of an existing DB subnet group.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * 
     * @param dBSubnetGroupName
     *        The name of the DB subnet group to use for the new DB cluster.</p>
     *        <p>
     *        Constraints: If supplied, must match the name of an existing DB subnet group.
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
     * Constraints: If supplied, must match the name of an existing DB subnet group.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * 
     * @return The name of the DB subnet group to use for the new DB cluster.</p>
     *         <p>
     *         Constraints: If supplied, must match the name of an existing DB subnet group.
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
     * Constraints: If supplied, must match the name of an existing DB subnet group.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * 
     * @param dBSubnetGroupName
     *        The name of the DB subnet group to use for the new DB cluster.</p>
     *        <p>
     *        Constraints: If supplied, must match the name of an existing DB subnet group.
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
     * The database name for the restored DB cluster.
     * </p>
     * 
     * @param databaseName
     *        The database name for the restored DB cluster.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The database name for the restored DB cluster.
     * </p>
     * 
     * @return The database name for the restored DB cluster.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The database name for the restored DB cluster.
     * </p>
     * 
     * @param databaseName
     *        The database name for the restored DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The name of the option group to use for the restored DB cluster.
     * </p>
     * 
     * @param optionGroupName
     *        The name of the option group to use for the restored DB cluster.
     */

    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p>
     * The name of the option group to use for the restored DB cluster.
     * </p>
     * 
     * @return The name of the option group to use for the restored DB cluster.
     */

    public String getOptionGroupName() {
        return this.optionGroupName;
    }

    /**
     * <p>
     * The name of the option group to use for the restored DB cluster.
     * </p>
     * 
     * @param optionGroupName
     *        The name of the option group to use for the restored DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withOptionGroupName(String optionGroupName) {
        setOptionGroupName(optionGroupName);
        return this;
    }

    /**
     * <p>
     * A list of VPC security groups that the new DB cluster will belong to.
     * </p>
     * 
     * @return A list of VPC security groups that the new DB cluster will belong to.
     */

    public java.util.List<String> getVpcSecurityGroupIds() {
        if (vpcSecurityGroupIds == null) {
            vpcSecurityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * A list of VPC security groups that the new DB cluster will belong to.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of VPC security groups that the new DB cluster will belong to.
     */

    public void setVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        if (vpcSecurityGroupIds == null) {
            this.vpcSecurityGroupIds = null;
            return;
        }

        this.vpcSecurityGroupIds = new com.amazonaws.internal.SdkInternalList<String>(vpcSecurityGroupIds);
    }

    /**
     * <p>
     * A list of VPC security groups that the new DB cluster will belong to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroupIds(java.util.Collection)} or {@link #withVpcSecurityGroupIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of VPC security groups that the new DB cluster will belong to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
        if (this.vpcSecurityGroupIds == null) {
            setVpcSecurityGroupIds(new com.amazonaws.internal.SdkInternalList<String>(vpcSecurityGroupIds.length));
        }
        for (String ele : vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of VPC security groups that the new DB cluster will belong to.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of VPC security groups that the new DB cluster will belong to.
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
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
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

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
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
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
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
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are restoring a DB
     * cluster with the same AWS account that owns the KMS encryption key used to encrypt the new DB cluster, then you
     * can use the KMS key alias instead of the ARN for the KMS encryption key.
     * </p>
     * <p>
     * If you don't specify a value for the <code>KmsKeyId</code> parameter, then the following occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the DB snapshot or DB cluster snapshot in <code>SnapshotIdentifier</code> is encrypted, then the restored DB
     * cluster is encrypted using the KMS key that was used to encrypt the DB snapshot or DB cluster snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the DB snapshot or DB cluster snapshot in <code>SnapshotIdentifier</code> is not encrypted, then the restored
     * DB cluster is not encrypted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param kmsKeyId
     *        The AWS KMS key identifier to use when restoring an encrypted DB cluster from a DB snapshot or DB cluster
     *        snapshot.</p>
     *        <p>
     *        The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are restoring
     *        a DB cluster with the same AWS account that owns the KMS encryption key used to encrypt the new DB
     *        cluster, then you can use the KMS key alias instead of the ARN for the KMS encryption key.
     *        </p>
     *        <p>
     *        If you don't specify a value for the <code>KmsKeyId</code> parameter, then the following occurs:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the DB snapshot or DB cluster snapshot in <code>SnapshotIdentifier</code> is encrypted, then the
     *        restored DB cluster is encrypted using the KMS key that was used to encrypt the DB snapshot or DB cluster
     *        snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the DB snapshot or DB cluster snapshot in <code>SnapshotIdentifier</code> is not encrypted, then the
     *        restored DB cluster is not encrypted.
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
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are restoring a DB
     * cluster with the same AWS account that owns the KMS encryption key used to encrypt the new DB cluster, then you
     * can use the KMS key alias instead of the ARN for the KMS encryption key.
     * </p>
     * <p>
     * If you don't specify a value for the <code>KmsKeyId</code> parameter, then the following occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the DB snapshot or DB cluster snapshot in <code>SnapshotIdentifier</code> is encrypted, then the restored DB
     * cluster is encrypted using the KMS key that was used to encrypt the DB snapshot or DB cluster snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the DB snapshot or DB cluster snapshot in <code>SnapshotIdentifier</code> is not encrypted, then the restored
     * DB cluster is not encrypted.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The AWS KMS key identifier to use when restoring an encrypted DB cluster from a DB snapshot or DB cluster
     *         snapshot.</p>
     *         <p>
     *         The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are restoring
     *         a DB cluster with the same AWS account that owns the KMS encryption key used to encrypt the new DB
     *         cluster, then you can use the KMS key alias instead of the ARN for the KMS encryption key.
     *         </p>
     *         <p>
     *         If you don't specify a value for the <code>KmsKeyId</code> parameter, then the following occurs:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the DB snapshot or DB cluster snapshot in <code>SnapshotIdentifier</code> is encrypted, then the
     *         restored DB cluster is encrypted using the KMS key that was used to encrypt the DB snapshot or DB cluster
     *         snapshot.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the DB snapshot or DB cluster snapshot in <code>SnapshotIdentifier</code> is not encrypted, then the
     *         restored DB cluster is not encrypted.
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
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are restoring a DB
     * cluster with the same AWS account that owns the KMS encryption key used to encrypt the new DB cluster, then you
     * can use the KMS key alias instead of the ARN for the KMS encryption key.
     * </p>
     * <p>
     * If you don't specify a value for the <code>KmsKeyId</code> parameter, then the following occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the DB snapshot or DB cluster snapshot in <code>SnapshotIdentifier</code> is encrypted, then the restored DB
     * cluster is encrypted using the KMS key that was used to encrypt the DB snapshot or DB cluster snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the DB snapshot or DB cluster snapshot in <code>SnapshotIdentifier</code> is not encrypted, then the restored
     * DB cluster is not encrypted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param kmsKeyId
     *        The AWS KMS key identifier to use when restoring an encrypted DB cluster from a DB snapshot or DB cluster
     *        snapshot.</p>
     *        <p>
     *        The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are restoring
     *        a DB cluster with the same AWS account that owns the KMS encryption key used to encrypt the new DB
     *        cluster, then you can use the KMS key alias instead of the ARN for the KMS encryption key.
     *        </p>
     *        <p>
     *        If you don't specify a value for the <code>KmsKeyId</code> parameter, then the following occurs:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the DB snapshot or DB cluster snapshot in <code>SnapshotIdentifier</code> is encrypted, then the
     *        restored DB cluster is encrypted using the KMS key that was used to encrypt the DB snapshot or DB cluster
     *        snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the DB snapshot or DB cluster snapshot in <code>SnapshotIdentifier</code> is not encrypted, then the
     *        restored DB cluster is not encrypted.
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
     * True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts, and otherwise
     * false.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param enableIAMDatabaseAuthentication
     *        True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts, and
     *        otherwise false.</p>
     *        <p>
     *        Default: <code>false</code>
     */

    public void setEnableIAMDatabaseAuthentication(Boolean enableIAMDatabaseAuthentication) {
        this.enableIAMDatabaseAuthentication = enableIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts, and otherwise
     * false.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts, and
     *         otherwise false.</p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean getEnableIAMDatabaseAuthentication() {
        return this.enableIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts, and otherwise
     * false.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param enableIAMDatabaseAuthentication
     *        True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts, and
     *        otherwise false.</p>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withEnableIAMDatabaseAuthentication(Boolean enableIAMDatabaseAuthentication) {
        setEnableIAMDatabaseAuthentication(enableIAMDatabaseAuthentication);
        return this;
    }

    /**
     * <p>
     * True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts, and otherwise
     * false.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts, and
     *         otherwise false.</p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean isEnableIAMDatabaseAuthentication() {
        return this.enableIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * The target backtrack window, in seconds. To disable backtracking, set this value to 0.
     * </p>
     * <p>
     * Default: 0
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If specified, this value must be set to a number from 0 to 259,200 (72 hours).
     * </p>
     * </li>
     * </ul>
     * 
     * @param backtrackWindow
     *        The target backtrack window, in seconds. To disable backtracking, set this value to 0.</p>
     *        <p>
     *        Default: 0
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If specified, this value must be set to a number from 0 to 259,200 (72 hours).
     *        </p>
     *        </li>
     */

    public void setBacktrackWindow(Long backtrackWindow) {
        this.backtrackWindow = backtrackWindow;
    }

    /**
     * <p>
     * The target backtrack window, in seconds. To disable backtracking, set this value to 0.
     * </p>
     * <p>
     * Default: 0
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If specified, this value must be set to a number from 0 to 259,200 (72 hours).
     * </p>
     * </li>
     * </ul>
     * 
     * @return The target backtrack window, in seconds. To disable backtracking, set this value to 0.</p>
     *         <p>
     *         Default: 0
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If specified, this value must be set to a number from 0 to 259,200 (72 hours).
     *         </p>
     *         </li>
     */

    public Long getBacktrackWindow() {
        return this.backtrackWindow;
    }

    /**
     * <p>
     * The target backtrack window, in seconds. To disable backtracking, set this value to 0.
     * </p>
     * <p>
     * Default: 0
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If specified, this value must be set to a number from 0 to 259,200 (72 hours).
     * </p>
     * </li>
     * </ul>
     * 
     * @param backtrackWindow
     *        The target backtrack window, in seconds. To disable backtracking, set this value to 0.</p>
     *        <p>
     *        Default: 0
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If specified, this value must be set to a number from 0 to 259,200 (72 hours).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withBacktrackWindow(Long backtrackWindow) {
        setBacktrackWindow(backtrackWindow);
        return this;
    }

    /**
     * <p>
     * The list of logs that the restored DB cluster is to export to Amazon CloudWatch Logs. The values in the list
     * depend on the DB engine being used. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @return The list of logs that the restored DB cluster is to export to Amazon CloudWatch Logs. The values in the
     *         list depend on the DB engine being used. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *         >Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon Aurora User Guide</i>.
     */

    public java.util.List<String> getEnableCloudwatchLogsExports() {
        if (enableCloudwatchLogsExports == null) {
            enableCloudwatchLogsExports = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return enableCloudwatchLogsExports;
    }

    /**
     * <p>
     * The list of logs that the restored DB cluster is to export to Amazon CloudWatch Logs. The values in the list
     * depend on the DB engine being used. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param enableCloudwatchLogsExports
     *        The list of logs that the restored DB cluster is to export to Amazon CloudWatch Logs. The values in the
     *        list depend on the DB engine being used. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *        >Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon Aurora User Guide</i>.
     */

    public void setEnableCloudwatchLogsExports(java.util.Collection<String> enableCloudwatchLogsExports) {
        if (enableCloudwatchLogsExports == null) {
            this.enableCloudwatchLogsExports = null;
            return;
        }

        this.enableCloudwatchLogsExports = new com.amazonaws.internal.SdkInternalList<String>(enableCloudwatchLogsExports);
    }

    /**
     * <p>
     * The list of logs that the restored DB cluster is to export to Amazon CloudWatch Logs. The values in the list
     * depend on the DB engine being used. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnableCloudwatchLogsExports(java.util.Collection)} or
     * {@link #withEnableCloudwatchLogsExports(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param enableCloudwatchLogsExports
     *        The list of logs that the restored DB cluster is to export to Amazon CloudWatch Logs. The values in the
     *        list depend on the DB engine being used. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *        >Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon Aurora User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withEnableCloudwatchLogsExports(String... enableCloudwatchLogsExports) {
        if (this.enableCloudwatchLogsExports == null) {
            setEnableCloudwatchLogsExports(new com.amazonaws.internal.SdkInternalList<String>(enableCloudwatchLogsExports.length));
        }
        for (String ele : enableCloudwatchLogsExports) {
            this.enableCloudwatchLogsExports.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of logs that the restored DB cluster is to export to Amazon CloudWatch Logs. The values in the list
     * depend on the DB engine being used. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * 
     * @param enableCloudwatchLogsExports
     *        The list of logs that the restored DB cluster is to export to Amazon CloudWatch Logs. The values in the
     *        list depend on the DB engine being used. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *        >Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon Aurora User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withEnableCloudwatchLogsExports(java.util.Collection<String> enableCloudwatchLogsExports) {
        setEnableCloudwatchLogsExports(enableCloudwatchLogsExports);
        return this;
    }

    /**
     * <p>
     * The DB engine mode of the DB cluster, either <code>provisioned</code>, <code>serverless</code>, or
     * <code>parallelquery</code>.
     * </p>
     * 
     * @param engineMode
     *        The DB engine mode of the DB cluster, either <code>provisioned</code>, <code>serverless</code>, or
     *        <code>parallelquery</code>.
     */

    public void setEngineMode(String engineMode) {
        this.engineMode = engineMode;
    }

    /**
     * <p>
     * The DB engine mode of the DB cluster, either <code>provisioned</code>, <code>serverless</code>, or
     * <code>parallelquery</code>.
     * </p>
     * 
     * @return The DB engine mode of the DB cluster, either <code>provisioned</code>, <code>serverless</code>, or
     *         <code>parallelquery</code>.
     */

    public String getEngineMode() {
        return this.engineMode;
    }

    /**
     * <p>
     * The DB engine mode of the DB cluster, either <code>provisioned</code>, <code>serverless</code>, or
     * <code>parallelquery</code>.
     * </p>
     * 
     * @param engineMode
     *        The DB engine mode of the DB cluster, either <code>provisioned</code>, <code>serverless</code>, or
     *        <code>parallelquery</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withEngineMode(String engineMode) {
        setEngineMode(engineMode);
        return this;
    }

    /**
     * <p>
     * For DB clusters in <code>serverless</code> DB engine mode, the scaling properties of the DB cluster.
     * </p>
     * 
     * @param scalingConfiguration
     *        For DB clusters in <code>serverless</code> DB engine mode, the scaling properties of the DB cluster.
     */

    public void setScalingConfiguration(ScalingConfiguration scalingConfiguration) {
        this.scalingConfiguration = scalingConfiguration;
    }

    /**
     * <p>
     * For DB clusters in <code>serverless</code> DB engine mode, the scaling properties of the DB cluster.
     * </p>
     * 
     * @return For DB clusters in <code>serverless</code> DB engine mode, the scaling properties of the DB cluster.
     */

    public ScalingConfiguration getScalingConfiguration() {
        return this.scalingConfiguration;
    }

    /**
     * <p>
     * For DB clusters in <code>serverless</code> DB engine mode, the scaling properties of the DB cluster.
     * </p>
     * 
     * @param scalingConfiguration
     *        For DB clusters in <code>serverless</code> DB engine mode, the scaling properties of the DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withScalingConfiguration(ScalingConfiguration scalingConfiguration) {
        setScalingConfiguration(scalingConfiguration);
        return this;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group to associate with this DB cluster. If this argument is omitted, the
     * default DB cluster parameter group for the specified engine is used.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the name of an existing default DB cluster parameter group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBClusterParameterGroupName
     *        The name of the DB cluster parameter group to associate with this DB cluster. If this argument is omitted,
     *        the default DB cluster parameter group for the specified engine is used.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match the name of an existing default DB cluster parameter group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be 1 to 255 letters, numbers, or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     */

    public void setDBClusterParameterGroupName(String dBClusterParameterGroupName) {
        this.dBClusterParameterGroupName = dBClusterParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group to associate with this DB cluster. If this argument is omitted, the
     * default DB cluster parameter group for the specified engine is used.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the name of an existing default DB cluster parameter group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the DB cluster parameter group to associate with this DB cluster. If this argument is
     *         omitted, the default DB cluster parameter group for the specified engine is used.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If supplied, must match the name of an existing default DB cluster parameter group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be 1 to 255 letters, numbers, or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't end with a hyphen or contain two consecutive hyphens.
     *         </p>
     *         </li>
     */

    public String getDBClusterParameterGroupName() {
        return this.dBClusterParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group to associate with this DB cluster. If this argument is omitted, the
     * default DB cluster parameter group for the specified engine is used.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If supplied, must match the name of an existing default DB cluster parameter group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBClusterParameterGroupName
     *        The name of the DB cluster parameter group to associate with this DB cluster. If this argument is omitted,
     *        the default DB cluster parameter group for the specified engine is used.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If supplied, must match the name of an existing default DB cluster parameter group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be 1 to 255 letters, numbers, or hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withDBClusterParameterGroupName(String dBClusterParameterGroupName) {
        setDBClusterParameterGroupName(dBClusterParameterGroupName);
        return this;
    }

    /**
     * <p>
     * Indicates if the DB cluster should have deletion protection enabled. The database can't be deleted when this
     * value is set to true. The default is false.
     * </p>
     * 
     * @param deletionProtection
     *        Indicates if the DB cluster should have deletion protection enabled. The database can't be deleted when
     *        this value is set to true. The default is false.
     */

    public void setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
    }

    /**
     * <p>
     * Indicates if the DB cluster should have deletion protection enabled. The database can't be deleted when this
     * value is set to true. The default is false.
     * </p>
     * 
     * @return Indicates if the DB cluster should have deletion protection enabled. The database can't be deleted when
     *         this value is set to true. The default is false.
     */

    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * Indicates if the DB cluster should have deletion protection enabled. The database can't be deleted when this
     * value is set to true. The default is false.
     * </p>
     * 
     * @param deletionProtection
     *        Indicates if the DB cluster should have deletion protection enabled. The database can't be deleted when
     *        this value is set to true. The default is false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withDeletionProtection(Boolean deletionProtection) {
        setDeletionProtection(deletionProtection);
        return this;
    }

    /**
     * <p>
     * Indicates if the DB cluster should have deletion protection enabled. The database can't be deleted when this
     * value is set to true. The default is false.
     * </p>
     * 
     * @return Indicates if the DB cluster should have deletion protection enabled. The database can't be deleted when
     *         this value is set to true. The default is false.
     */

    public Boolean isDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * True to copy all tags from the restored DB cluster to snapshots of the restored DB cluster, and otherwise false.
     * The default is false.
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        True to copy all tags from the restored DB cluster to snapshots of the restored DB cluster, and otherwise
     *        false. The default is false.
     */

    public void setCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
    }

    /**
     * <p>
     * True to copy all tags from the restored DB cluster to snapshots of the restored DB cluster, and otherwise false.
     * The default is false.
     * </p>
     * 
     * @return True to copy all tags from the restored DB cluster to snapshots of the restored DB cluster, and otherwise
     *         false. The default is false.
     */

    public Boolean getCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
    }

    /**
     * <p>
     * True to copy all tags from the restored DB cluster to snapshots of the restored DB cluster, and otherwise false.
     * The default is false.
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        True to copy all tags from the restored DB cluster to snapshots of the restored DB cluster, and otherwise
     *        false. The default is false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterFromSnapshotRequest withCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        setCopyTagsToSnapshot(copyTagsToSnapshot);
        return this;
    }

    /**
     * <p>
     * True to copy all tags from the restored DB cluster to snapshots of the restored DB cluster, and otherwise false.
     * The default is false.
     * </p>
     * 
     * @return True to copy all tags from the restored DB cluster to snapshots of the restored DB cluster, and otherwise
     *         false. The default is false.
     */

    public Boolean isCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
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
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getOptionGroupName() != null)
            sb.append("OptionGroupName: ").append(getOptionGroupName()).append(",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: ").append(getVpcSecurityGroupIds()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getEnableIAMDatabaseAuthentication() != null)
            sb.append("EnableIAMDatabaseAuthentication: ").append(getEnableIAMDatabaseAuthentication()).append(",");
        if (getBacktrackWindow() != null)
            sb.append("BacktrackWindow: ").append(getBacktrackWindow()).append(",");
        if (getEnableCloudwatchLogsExports() != null)
            sb.append("EnableCloudwatchLogsExports: ").append(getEnableCloudwatchLogsExports()).append(",");
        if (getEngineMode() != null)
            sb.append("EngineMode: ").append(getEngineMode()).append(",");
        if (getScalingConfiguration() != null)
            sb.append("ScalingConfiguration: ").append(getScalingConfiguration()).append(",");
        if (getDBClusterParameterGroupName() != null)
            sb.append("DBClusterParameterGroupName: ").append(getDBClusterParameterGroupName()).append(",");
        if (getDeletionProtection() != null)
            sb.append("DeletionProtection: ").append(getDeletionProtection()).append(",");
        if (getCopyTagsToSnapshot() != null)
            sb.append("CopyTagsToSnapshot: ").append(getCopyTagsToSnapshot());
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
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null)
            return false;
        if (other.getOptionGroupName() != null && other.getOptionGroupName().equals(this.getOptionGroupName()) == false)
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
        if (other.getEnableIAMDatabaseAuthentication() == null ^ this.getEnableIAMDatabaseAuthentication() == null)
            return false;
        if (other.getEnableIAMDatabaseAuthentication() != null
                && other.getEnableIAMDatabaseAuthentication().equals(this.getEnableIAMDatabaseAuthentication()) == false)
            return false;
        if (other.getBacktrackWindow() == null ^ this.getBacktrackWindow() == null)
            return false;
        if (other.getBacktrackWindow() != null && other.getBacktrackWindow().equals(this.getBacktrackWindow()) == false)
            return false;
        if (other.getEnableCloudwatchLogsExports() == null ^ this.getEnableCloudwatchLogsExports() == null)
            return false;
        if (other.getEnableCloudwatchLogsExports() != null && other.getEnableCloudwatchLogsExports().equals(this.getEnableCloudwatchLogsExports()) == false)
            return false;
        if (other.getEngineMode() == null ^ this.getEngineMode() == null)
            return false;
        if (other.getEngineMode() != null && other.getEngineMode().equals(this.getEngineMode()) == false)
            return false;
        if (other.getScalingConfiguration() == null ^ this.getScalingConfiguration() == null)
            return false;
        if (other.getScalingConfiguration() != null && other.getScalingConfiguration().equals(this.getScalingConfiguration()) == false)
            return false;
        if (other.getDBClusterParameterGroupName() == null ^ this.getDBClusterParameterGroupName() == null)
            return false;
        if (other.getDBClusterParameterGroupName() != null && other.getDBClusterParameterGroupName().equals(this.getDBClusterParameterGroupName()) == false)
            return false;
        if (other.getDeletionProtection() == null ^ this.getDeletionProtection() == null)
            return false;
        if (other.getDeletionProtection() != null && other.getDeletionProtection().equals(this.getDeletionProtection()) == false)
            return false;
        if (other.getCopyTagsToSnapshot() == null ^ this.getCopyTagsToSnapshot() == null)
            return false;
        if (other.getCopyTagsToSnapshot() != null && other.getCopyTagsToSnapshot().equals(this.getCopyTagsToSnapshot()) == false)
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
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getEnableIAMDatabaseAuthentication() == null) ? 0 : getEnableIAMDatabaseAuthentication().hashCode());
        hashCode = prime * hashCode + ((getBacktrackWindow() == null) ? 0 : getBacktrackWindow().hashCode());
        hashCode = prime * hashCode + ((getEnableCloudwatchLogsExports() == null) ? 0 : getEnableCloudwatchLogsExports().hashCode());
        hashCode = prime * hashCode + ((getEngineMode() == null) ? 0 : getEngineMode().hashCode());
        hashCode = prime * hashCode + ((getScalingConfiguration() == null) ? 0 : getScalingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDBClusterParameterGroupName() == null) ? 0 : getDBClusterParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getDeletionProtection() == null) ? 0 : getDeletionProtection().hashCode());
        hashCode = prime * hashCode + ((getCopyTagsToSnapshot() == null) ? 0 : getCopyTagsToSnapshot().hashCode());
        return hashCode;
    }

    @Override
    public RestoreDBClusterFromSnapshotRequest clone() {
        return (RestoreDBClusterFromSnapshotRequest) super.clone();
    }

}
