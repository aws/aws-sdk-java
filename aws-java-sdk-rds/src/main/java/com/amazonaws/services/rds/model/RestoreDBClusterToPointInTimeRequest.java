/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/RestoreDBClusterToPointInTime" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreDBClusterToPointInTimeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the new DB cluster to be created.
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
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private String dBClusterIdentifier;
    /**
     * <p>
     * The type of restore to be performed. You can specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>full-copy</code> - The new DB cluster is restored as a full copy of the source DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>copy-on-write</code> - The new DB cluster is restored as a clone of the source DB cluster.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Constraints: You can't specify <code>copy-on-write</code> if the engine version of the source DB cluster is
     * earlier than 1.11.
     * </p>
     * <p>
     * If you don't specify a <code>RestoreType</code> value, then the new DB cluster is restored as a full copy of the
     * source DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private String restoreType;
    /**
     * <p>
     * The identifier of the source DB cluster from which to restore.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DBCluster.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private String sourceDBClusterIdentifier;
    /**
     * <p>
     * The date and time to restore the DB cluster to.
     * </p>
     * <p>
     * Valid Values: Value must be a time in Universal Coordinated Time (UTC) format
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be before the latest restorable time for the DB instance
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be specified if <code>UseLatestRestorableTime</code> parameter isn't provided
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be specified if the <code>UseLatestRestorableTime</code> parameter is enabled
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be specified if the <code>RestoreType</code> parameter is <code>copy-on-write</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>2015-03-07T23:45:00Z</code>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private java.util.Date restoreToTime;
    /**
     * <p>
     * A value that indicates whether to restore the DB cluster to the latest restorable backup time. By default, the DB
     * cluster isn't restored to the latest restorable backup time.
     * </p>
     * <p>
     * Constraints: Can't be specified if <code>RestoreToTime</code> parameter is provided.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private Boolean useLatestRestorableTime;
    /**
     * <p>
     * The port number on which the new DB cluster accepts connections.
     * </p>
     * <p>
     * Constraints: A value from <code>1150-65535</code>.
     * </p>
     * <p>
     * Default: The default port for the engine.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The DB subnet group name to use for the new DB cluster.
     * </p>
     * <p>
     * Constraints: If supplied, must match the name of an existing DBSubnetGroup.
     * </p>
     * <p>
     * Example: <code>mydbsubnetgroup</code>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private String dBSubnetGroupName;
    /**
     * <p>
     * The name of the option group for the new DB cluster.
     * </p>
     * <p>
     * DB clusters are associated with a default option group that can't be modified.
     * </p>
     */
    private String optionGroupName;
    /**
     * <p>
     * A list of VPC security groups that the new DB cluster belongs to.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupIds;

    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The Amazon Web Services KMS key identifier to use when restoring an encrypted DB cluster from an encrypted DB
     * cluster.
     * </p>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key. To
     * use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN.
     * </p>
     * <p>
     * You can restore to a new DB cluster and encrypt the new DB cluster with a KMS key that is different from the KMS
     * key used to encrypt the source DB cluster. The new DB cluster is encrypted with the KMS key identified by the
     * <code>KmsKeyId</code> parameter.
     * </p>
     * <p>
     * If you don't specify a value for the <code>KmsKeyId</code> parameter, then the following occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the DB cluster is encrypted, then the restored DB cluster is encrypted using the KMS key that was used to
     * encrypt the source DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the DB cluster isn't encrypted, then the restored DB cluster isn't encrypted.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>DBClusterIdentifier</code> refers to a DB cluster that isn't encrypted, then the restore request is
     * rejected.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management (IAM)
     * accounts to database accounts. By default, mapping isn't enabled.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
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
     * <p>
     * Valid for: Aurora MySQL DB clusters only
     * </p>
     */
    private Long backtrackWindow;
    /**
     * <p>
     * The list of logs that the restored DB cluster is to export to CloudWatch Logs. The values in the list depend on
     * the DB engine being used.
     * </p>
     * <p>
     * <b>RDS for MySQL</b>
     * </p>
     * <p>
     * Possible values are <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     * </p>
     * <p>
     * <b>RDS for PostgreSQL</b>
     * </p>
     * <p>
     * Possible values are <code>postgresql</code> and <code>upgrade</code>.
     * </p>
     * <p>
     * <b>Aurora MySQL</b>
     * </p>
     * <p>
     * Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     * </p>
     * <p>
     * <b>Aurora PostgreSQL</b>
     * </p>
     * <p>
     * Possible value is <code>postgresql</code>.
     * </p>
     * <p>
     * For more information about exporting CloudWatch Logs for Amazon RDS, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * For more information about exporting CloudWatch Logs for Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> enableCloudwatchLogsExports;
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
     * If supplied, must match the name of an existing DB cluster parameter group.
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
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private String dBClusterParameterGroupName;
    /**
     * <p>
     * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when
     * deletion protection is enabled. By default, deletion protection isn't enabled.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private Boolean deletionProtection;
    /**
     * <p>
     * A value that indicates whether to copy all tags from the restored DB cluster to snapshots of the restored DB
     * cluster. The default is not to copy them.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     */
    private Boolean copyTagsToSnapshot;
    /**
     * <p>
     * Specify the Active Directory directory ID to restore the DB cluster in. The domain must be created prior to this
     * operation.
     * </p>
     * <p>
     * For Amazon Aurora DB clusters, Amazon RDS can use Kerberos Authentication to authenticate users that connect to
     * the DB cluster. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/kerberos-authentication.html">Kerberos
     * Authentication</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     */
    private String domain;
    /**
     * <p>
     * Specify the name of the IAM role to be used when making API calls to the Directory Service.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     */
    private String domainIAMRoleName;
    /**
     * <p>
     * For DB clusters in <code>serverless</code> DB engine mode, the scaling properties of the DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     */
    private ScalingConfiguration scalingConfiguration;
    /**
     * <p>
     * The engine mode of the new cluster. Specify <code>provisioned</code> or <code>serverless</code>, depending on the
     * type of the cluster you are creating. You can create an Aurora Serverless v1 clone from a provisioned cluster, or
     * a provisioned clone from an Aurora Serverless v1 cluster. To create a clone that is an Aurora Serverless v1
     * cluster, the original cluster must be an Aurora Serverless v1 cluster or an encrypted provisioned cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     */
    private String engineMode;
    /**
     * <p>
     * The compute and memory capacity of the each DB instance in the Multi-AZ DB cluster, for example db.m6gd.xlarge.
     * Not all DB instance classes are available in all Amazon Web Services Regions, or for all database engines.
     * </p>
     * <p>
     * For the full list of DB instance classes, and availability for your engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB instance class</a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     */
    private String dBClusterInstanceClass;
    /**
     * <p>
     * Specifies the storage type to be associated with the each DB instance in the Multi-AZ DB cluster.
     * </p>
     * <p>
     * Valid values: <code>io1</code>
     * </p>
     * <p>
     * When specified, a value for the <code>Iops</code> parameter is required.
     * </p>
     * <p>
     * Default: <code>io1</code>
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     */
    private String storageType;
    /**
     * <p>
     * A value that indicates whether the DB cluster is publicly accessible.
     * </p>
     * <p>
     * When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private IP
     * address from within the DB cluster's virtual private cloud (VPC). It resolves to the public IP address from
     * outside of the DB cluster's VPC. Access to the DB cluster is ultimately controlled by the security group it uses.
     * That public access is not permitted if the security group assigned to the DB cluster doesn't permit it.
     * </p>
     * <p>
     * When the DB cluster isn't publicly accessible, it is an internal DB cluster with a DNS name that resolves to a
     * private IP address.
     * </p>
     * <p>
     * Default: The default behavior varies depending on whether <code>DBSubnetGroupName</code> is specified.
     * </p>
     * <p>
     * If <code>DBSubnetGroupName</code> isn't specified, and <code>PubliclyAccessible</code> isn't specified, the
     * following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the default VPC in the target Region doesn’t have an internet gateway attached to it, the DB cluster is
     * private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the default VPC in the target Region has an internet gateway attached to it, the DB cluster is public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>DBSubnetGroupName</code> is specified, and <code>PubliclyAccessible</code> isn't specified, the
     * following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the DB cluster is private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the subnets are part of a VPC that has an internet gateway attached to it, the DB cluster is public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     */
    private Boolean publiclyAccessible;
    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for each DB
     * instance in the Multi-AZ DB cluster.
     * </p>
     * <p>
     * For information about valid IOPS values, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html#USER_PIOPS">Amazon RDS Provisioned
     * IOPS storage</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Constraints: Must be a multiple between .5 and 50 of the storage amount for the DB instance.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     */
    private Integer iops;

    private ServerlessV2ScalingConfiguration serverlessV2ScalingConfiguration;
    /**
     * <p>
     * The network type of the DB cluster.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IPV4</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DUAL</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The network type is determined by the <code>DBSubnetGroup</code> specified for the DB cluster. A
     * <code>DBSubnetGroup</code> can support only the IPv4 protocol or the IPv4 and the IPv6 protocols (
     * <code>DUAL</code>).
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html">
     * Working with a DB instance in a VPC</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     */
    private String networkType;

    /**
     * <p>
     * The name of the new DB cluster to be created.
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
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The name of the new DB cluster to be created.</p>
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
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * The name of the new DB cluster to be created.
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
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return The name of the new DB cluster to be created.</p>
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
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public String getDBClusterIdentifier() {
        return this.dBClusterIdentifier;
    }

    /**
     * <p>
     * The name of the new DB cluster to be created.
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
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The name of the new DB cluster to be created.</p>
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
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterToPointInTimeRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        setDBClusterIdentifier(dBClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The type of restore to be performed. You can specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>full-copy</code> - The new DB cluster is restored as a full copy of the source DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>copy-on-write</code> - The new DB cluster is restored as a clone of the source DB cluster.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Constraints: You can't specify <code>copy-on-write</code> if the engine version of the source DB cluster is
     * earlier than 1.11.
     * </p>
     * <p>
     * If you don't specify a <code>RestoreType</code> value, then the new DB cluster is restored as a full copy of the
     * source DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param restoreType
     *        The type of restore to be performed. You can specify one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>full-copy</code> - The new DB cluster is restored as a full copy of the source DB cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>copy-on-write</code> - The new DB cluster is restored as a clone of the source DB cluster.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Constraints: You can't specify <code>copy-on-write</code> if the engine version of the source DB cluster
     *        is earlier than 1.11.
     *        </p>
     *        <p>
     *        If you don't specify a <code>RestoreType</code> value, then the new DB cluster is restored as a full copy
     *        of the source DB cluster.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setRestoreType(String restoreType) {
        this.restoreType = restoreType;
    }

    /**
     * <p>
     * The type of restore to be performed. You can specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>full-copy</code> - The new DB cluster is restored as a full copy of the source DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>copy-on-write</code> - The new DB cluster is restored as a clone of the source DB cluster.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Constraints: You can't specify <code>copy-on-write</code> if the engine version of the source DB cluster is
     * earlier than 1.11.
     * </p>
     * <p>
     * If you don't specify a <code>RestoreType</code> value, then the new DB cluster is restored as a full copy of the
     * source DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return The type of restore to be performed. You can specify one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>full-copy</code> - The new DB cluster is restored as a full copy of the source DB cluster.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>copy-on-write</code> - The new DB cluster is restored as a clone of the source DB cluster.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Constraints: You can't specify <code>copy-on-write</code> if the engine version of the source DB cluster
     *         is earlier than 1.11.
     *         </p>
     *         <p>
     *         If you don't specify a <code>RestoreType</code> value, then the new DB cluster is restored as a full copy
     *         of the source DB cluster.
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public String getRestoreType() {
        return this.restoreType;
    }

    /**
     * <p>
     * The type of restore to be performed. You can specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>full-copy</code> - The new DB cluster is restored as a full copy of the source DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>copy-on-write</code> - The new DB cluster is restored as a clone of the source DB cluster.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Constraints: You can't specify <code>copy-on-write</code> if the engine version of the source DB cluster is
     * earlier than 1.11.
     * </p>
     * <p>
     * If you don't specify a <code>RestoreType</code> value, then the new DB cluster is restored as a full copy of the
     * source DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param restoreType
     *        The type of restore to be performed. You can specify one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>full-copy</code> - The new DB cluster is restored as a full copy of the source DB cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>copy-on-write</code> - The new DB cluster is restored as a clone of the source DB cluster.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Constraints: You can't specify <code>copy-on-write</code> if the engine version of the source DB cluster
     *        is earlier than 1.11.
     *        </p>
     *        <p>
     *        If you don't specify a <code>RestoreType</code> value, then the new DB cluster is restored as a full copy
     *        of the source DB cluster.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterToPointInTimeRequest withRestoreType(String restoreType) {
        setRestoreType(restoreType);
        return this;
    }

    /**
     * <p>
     * The identifier of the source DB cluster from which to restore.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DBCluster.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param sourceDBClusterIdentifier
     *        The identifier of the source DB cluster from which to restore.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the identifier of an existing DBCluster.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setSourceDBClusterIdentifier(String sourceDBClusterIdentifier) {
        this.sourceDBClusterIdentifier = sourceDBClusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the source DB cluster from which to restore.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DBCluster.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return The identifier of the source DB cluster from which to restore.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must match the identifier of an existing DBCluster.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public String getSourceDBClusterIdentifier() {
        return this.sourceDBClusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the source DB cluster from which to restore.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DBCluster.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param sourceDBClusterIdentifier
     *        The identifier of the source DB cluster from which to restore.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the identifier of an existing DBCluster.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterToPointInTimeRequest withSourceDBClusterIdentifier(String sourceDBClusterIdentifier) {
        setSourceDBClusterIdentifier(sourceDBClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The date and time to restore the DB cluster to.
     * </p>
     * <p>
     * Valid Values: Value must be a time in Universal Coordinated Time (UTC) format
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be before the latest restorable time for the DB instance
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be specified if <code>UseLatestRestorableTime</code> parameter isn't provided
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be specified if the <code>UseLatestRestorableTime</code> parameter is enabled
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be specified if the <code>RestoreType</code> parameter is <code>copy-on-write</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>2015-03-07T23:45:00Z</code>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param restoreToTime
     *        The date and time to restore the DB cluster to.</p>
     *        <p>
     *        Valid Values: Value must be a time in Universal Coordinated Time (UTC) format
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be before the latest restorable time for the DB instance
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be specified if <code>UseLatestRestorableTime</code> parameter isn't provided
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be specified if the <code>UseLatestRestorableTime</code> parameter is enabled
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be specified if the <code>RestoreType</code> parameter is <code>copy-on-write</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>2015-03-07T23:45:00Z</code>
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setRestoreToTime(java.util.Date restoreToTime) {
        this.restoreToTime = restoreToTime;
    }

    /**
     * <p>
     * The date and time to restore the DB cluster to.
     * </p>
     * <p>
     * Valid Values: Value must be a time in Universal Coordinated Time (UTC) format
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be before the latest restorable time for the DB instance
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be specified if <code>UseLatestRestorableTime</code> parameter isn't provided
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be specified if the <code>UseLatestRestorableTime</code> parameter is enabled
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be specified if the <code>RestoreType</code> parameter is <code>copy-on-write</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>2015-03-07T23:45:00Z</code>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return The date and time to restore the DB cluster to.</p>
     *         <p>
     *         Valid Values: Value must be a time in Universal Coordinated Time (UTC) format
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be before the latest restorable time for the DB instance
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be specified if <code>UseLatestRestorableTime</code> parameter isn't provided
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't be specified if the <code>UseLatestRestorableTime</code> parameter is enabled
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't be specified if the <code>RestoreType</code> parameter is <code>copy-on-write</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>2015-03-07T23:45:00Z</code>
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public java.util.Date getRestoreToTime() {
        return this.restoreToTime;
    }

    /**
     * <p>
     * The date and time to restore the DB cluster to.
     * </p>
     * <p>
     * Valid Values: Value must be a time in Universal Coordinated Time (UTC) format
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be before the latest restorable time for the DB instance
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be specified if <code>UseLatestRestorableTime</code> parameter isn't provided
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be specified if the <code>UseLatestRestorableTime</code> parameter is enabled
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be specified if the <code>RestoreType</code> parameter is <code>copy-on-write</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>2015-03-07T23:45:00Z</code>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param restoreToTime
     *        The date and time to restore the DB cluster to.</p>
     *        <p>
     *        Valid Values: Value must be a time in Universal Coordinated Time (UTC) format
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be before the latest restorable time for the DB instance
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be specified if <code>UseLatestRestorableTime</code> parameter isn't provided
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be specified if the <code>UseLatestRestorableTime</code> parameter is enabled
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Can't be specified if the <code>RestoreType</code> parameter is <code>copy-on-write</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>2015-03-07T23:45:00Z</code>
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterToPointInTimeRequest withRestoreToTime(java.util.Date restoreToTime) {
        setRestoreToTime(restoreToTime);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to restore the DB cluster to the latest restorable backup time. By default, the DB
     * cluster isn't restored to the latest restorable backup time.
     * </p>
     * <p>
     * Constraints: Can't be specified if <code>RestoreToTime</code> parameter is provided.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param useLatestRestorableTime
     *        A value that indicates whether to restore the DB cluster to the latest restorable backup time. By default,
     *        the DB cluster isn't restored to the latest restorable backup time.</p>
     *        <p>
     *        Constraints: Can't be specified if <code>RestoreToTime</code> parameter is provided.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setUseLatestRestorableTime(Boolean useLatestRestorableTime) {
        this.useLatestRestorableTime = useLatestRestorableTime;
    }

    /**
     * <p>
     * A value that indicates whether to restore the DB cluster to the latest restorable backup time. By default, the DB
     * cluster isn't restored to the latest restorable backup time.
     * </p>
     * <p>
     * Constraints: Can't be specified if <code>RestoreToTime</code> parameter is provided.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return A value that indicates whether to restore the DB cluster to the latest restorable backup time. By
     *         default, the DB cluster isn't restored to the latest restorable backup time.</p>
     *         <p>
     *         Constraints: Can't be specified if <code>RestoreToTime</code> parameter is provided.
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public Boolean getUseLatestRestorableTime() {
        return this.useLatestRestorableTime;
    }

    /**
     * <p>
     * A value that indicates whether to restore the DB cluster to the latest restorable backup time. By default, the DB
     * cluster isn't restored to the latest restorable backup time.
     * </p>
     * <p>
     * Constraints: Can't be specified if <code>RestoreToTime</code> parameter is provided.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param useLatestRestorableTime
     *        A value that indicates whether to restore the DB cluster to the latest restorable backup time. By default,
     *        the DB cluster isn't restored to the latest restorable backup time.</p>
     *        <p>
     *        Constraints: Can't be specified if <code>RestoreToTime</code> parameter is provided.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterToPointInTimeRequest withUseLatestRestorableTime(Boolean useLatestRestorableTime) {
        setUseLatestRestorableTime(useLatestRestorableTime);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to restore the DB cluster to the latest restorable backup time. By default, the DB
     * cluster isn't restored to the latest restorable backup time.
     * </p>
     * <p>
     * Constraints: Can't be specified if <code>RestoreToTime</code> parameter is provided.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return A value that indicates whether to restore the DB cluster to the latest restorable backup time. By
     *         default, the DB cluster isn't restored to the latest restorable backup time.</p>
     *         <p>
     *         Constraints: Can't be specified if <code>RestoreToTime</code> parameter is provided.
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public Boolean isUseLatestRestorableTime() {
        return this.useLatestRestorableTime;
    }

    /**
     * <p>
     * The port number on which the new DB cluster accepts connections.
     * </p>
     * <p>
     * Constraints: A value from <code>1150-65535</code>.
     * </p>
     * <p>
     * Default: The default port for the engine.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param port
     *        The port number on which the new DB cluster accepts connections.</p>
     *        <p>
     *        Constraints: A value from <code>1150-65535</code>.
     *        </p>
     *        <p>
     *        Default: The default port for the engine.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port number on which the new DB cluster accepts connections.
     * </p>
     * <p>
     * Constraints: A value from <code>1150-65535</code>.
     * </p>
     * <p>
     * Default: The default port for the engine.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return The port number on which the new DB cluster accepts connections.</p>
     *         <p>
     *         Constraints: A value from <code>1150-65535</code>.
     *         </p>
     *         <p>
     *         Default: The default port for the engine.
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port number on which the new DB cluster accepts connections.
     * </p>
     * <p>
     * Constraints: A value from <code>1150-65535</code>.
     * </p>
     * <p>
     * Default: The default port for the engine.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param port
     *        The port number on which the new DB cluster accepts connections.</p>
     *        <p>
     *        Constraints: A value from <code>1150-65535</code>.
     *        </p>
     *        <p>
     *        Default: The default port for the engine.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterToPointInTimeRequest withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The DB subnet group name to use for the new DB cluster.
     * </p>
     * <p>
     * Constraints: If supplied, must match the name of an existing DBSubnetGroup.
     * </p>
     * <p>
     * Example: <code>mydbsubnetgroup</code>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param dBSubnetGroupName
     *        The DB subnet group name to use for the new DB cluster.</p>
     *        <p>
     *        Constraints: If supplied, must match the name of an existing DBSubnetGroup.
     *        </p>
     *        <p>
     *        Example: <code>mydbsubnetgroup</code>
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
    }

    /**
     * <p>
     * The DB subnet group name to use for the new DB cluster.
     * </p>
     * <p>
     * Constraints: If supplied, must match the name of an existing DBSubnetGroup.
     * </p>
     * <p>
     * Example: <code>mydbsubnetgroup</code>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return The DB subnet group name to use for the new DB cluster.</p>
     *         <p>
     *         Constraints: If supplied, must match the name of an existing DBSubnetGroup.
     *         </p>
     *         <p>
     *         Example: <code>mydbsubnetgroup</code>
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public String getDBSubnetGroupName() {
        return this.dBSubnetGroupName;
    }

    /**
     * <p>
     * The DB subnet group name to use for the new DB cluster.
     * </p>
     * <p>
     * Constraints: If supplied, must match the name of an existing DBSubnetGroup.
     * </p>
     * <p>
     * Example: <code>mydbsubnetgroup</code>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param dBSubnetGroupName
     *        The DB subnet group name to use for the new DB cluster.</p>
     *        <p>
     *        Constraints: If supplied, must match the name of an existing DBSubnetGroup.
     *        </p>
     *        <p>
     *        Example: <code>mydbsubnetgroup</code>
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterToPointInTimeRequest withDBSubnetGroupName(String dBSubnetGroupName) {
        setDBSubnetGroupName(dBSubnetGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the option group for the new DB cluster.
     * </p>
     * <p>
     * DB clusters are associated with a default option group that can't be modified.
     * </p>
     * 
     * @param optionGroupName
     *        The name of the option group for the new DB cluster.</p>
     *        <p>
     *        DB clusters are associated with a default option group that can't be modified.
     */

    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p>
     * The name of the option group for the new DB cluster.
     * </p>
     * <p>
     * DB clusters are associated with a default option group that can't be modified.
     * </p>
     * 
     * @return The name of the option group for the new DB cluster.</p>
     *         <p>
     *         DB clusters are associated with a default option group that can't be modified.
     */

    public String getOptionGroupName() {
        return this.optionGroupName;
    }

    /**
     * <p>
     * The name of the option group for the new DB cluster.
     * </p>
     * <p>
     * DB clusters are associated with a default option group that can't be modified.
     * </p>
     * 
     * @param optionGroupName
     *        The name of the option group for the new DB cluster.</p>
     *        <p>
     *        DB clusters are associated with a default option group that can't be modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterToPointInTimeRequest withOptionGroupName(String optionGroupName) {
        setOptionGroupName(optionGroupName);
        return this;
    }

    /**
     * <p>
     * A list of VPC security groups that the new DB cluster belongs to.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return A list of VPC security groups that the new DB cluster belongs to.</p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public java.util.List<String> getVpcSecurityGroupIds() {
        if (vpcSecurityGroupIds == null) {
            vpcSecurityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * A list of VPC security groups that the new DB cluster belongs to.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of VPC security groups that the new DB cluster belongs to.</p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
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
     * A list of VPC security groups that the new DB cluster belongs to.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroupIds(java.util.Collection)} or {@link #withVpcSecurityGroupIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of VPC security groups that the new DB cluster belongs to.</p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterToPointInTimeRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
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
     * A list of VPC security groups that the new DB cluster belongs to.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of VPC security groups that the new DB cluster belongs to.</p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterToPointInTimeRequest withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * @param tags
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
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterToPointInTimeRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterToPointInTimeRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key identifier to use when restoring an encrypted DB cluster from an encrypted DB
     * cluster.
     * </p>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key. To
     * use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN.
     * </p>
     * <p>
     * You can restore to a new DB cluster and encrypt the new DB cluster with a KMS key that is different from the KMS
     * key used to encrypt the source DB cluster. The new DB cluster is encrypted with the KMS key identified by the
     * <code>KmsKeyId</code> parameter.
     * </p>
     * <p>
     * If you don't specify a value for the <code>KmsKeyId</code> parameter, then the following occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the DB cluster is encrypted, then the restored DB cluster is encrypted using the KMS key that was used to
     * encrypt the source DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the DB cluster isn't encrypted, then the restored DB cluster isn't encrypted.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>DBClusterIdentifier</code> refers to a DB cluster that isn't encrypted, then the restore request is
     * rejected.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Web Services KMS key identifier to use when restoring an encrypted DB cluster from an encrypted
     *        DB cluster.</p>
     *        <p>
     *        The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS
     *        key. To use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN.
     *        </p>
     *        <p>
     *        You can restore to a new DB cluster and encrypt the new DB cluster with a KMS key that is different from
     *        the KMS key used to encrypt the source DB cluster. The new DB cluster is encrypted with the KMS key
     *        identified by the <code>KmsKeyId</code> parameter.
     *        </p>
     *        <p>
     *        If you don't specify a value for the <code>KmsKeyId</code> parameter, then the following occurs:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the DB cluster is encrypted, then the restored DB cluster is encrypted using the KMS key that was used
     *        to encrypt the source DB cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the DB cluster isn't encrypted, then the restored DB cluster isn't encrypted.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If <code>DBClusterIdentifier</code> refers to a DB cluster that isn't encrypted, then the restore request
     *        is rejected.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key identifier to use when restoring an encrypted DB cluster from an encrypted DB
     * cluster.
     * </p>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key. To
     * use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN.
     * </p>
     * <p>
     * You can restore to a new DB cluster and encrypt the new DB cluster with a KMS key that is different from the KMS
     * key used to encrypt the source DB cluster. The new DB cluster is encrypted with the KMS key identified by the
     * <code>KmsKeyId</code> parameter.
     * </p>
     * <p>
     * If you don't specify a value for the <code>KmsKeyId</code> parameter, then the following occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the DB cluster is encrypted, then the restored DB cluster is encrypted using the KMS key that was used to
     * encrypt the source DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the DB cluster isn't encrypted, then the restored DB cluster isn't encrypted.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>DBClusterIdentifier</code> refers to a DB cluster that isn't encrypted, then the restore request is
     * rejected.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return The Amazon Web Services KMS key identifier to use when restoring an encrypted DB cluster from an
     *         encrypted DB cluster.</p>
     *         <p>
     *         The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS
     *         key. To use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN.
     *         </p>
     *         <p>
     *         You can restore to a new DB cluster and encrypt the new DB cluster with a KMS key that is different from
     *         the KMS key used to encrypt the source DB cluster. The new DB cluster is encrypted with the KMS key
     *         identified by the <code>KmsKeyId</code> parameter.
     *         </p>
     *         <p>
     *         If you don't specify a value for the <code>KmsKeyId</code> parameter, then the following occurs:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the DB cluster is encrypted, then the restored DB cluster is encrypted using the KMS key that was used
     *         to encrypt the source DB cluster.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the DB cluster isn't encrypted, then the restored DB cluster isn't encrypted.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If <code>DBClusterIdentifier</code> refers to a DB cluster that isn't encrypted, then the restore request
     *         is rejected.
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services KMS key identifier to use when restoring an encrypted DB cluster from an encrypted DB
     * cluster.
     * </p>
     * <p>
     * The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key. To
     * use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN.
     * </p>
     * <p>
     * You can restore to a new DB cluster and encrypt the new DB cluster with a KMS key that is different from the KMS
     * key used to encrypt the source DB cluster. The new DB cluster is encrypted with the KMS key identified by the
     * <code>KmsKeyId</code> parameter.
     * </p>
     * <p>
     * If you don't specify a value for the <code>KmsKeyId</code> parameter, then the following occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the DB cluster is encrypted, then the restored DB cluster is encrypted using the KMS key that was used to
     * encrypt the source DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the DB cluster isn't encrypted, then the restored DB cluster isn't encrypted.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>DBClusterIdentifier</code> refers to a DB cluster that isn't encrypted, then the restore request is
     * rejected.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Web Services KMS key identifier to use when restoring an encrypted DB cluster from an encrypted
     *        DB cluster.</p>
     *        <p>
     *        The Amazon Web Services KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS
     *        key. To use a KMS key in a different Amazon Web Services account, specify the key ARN or alias ARN.
     *        </p>
     *        <p>
     *        You can restore to a new DB cluster and encrypt the new DB cluster with a KMS key that is different from
     *        the KMS key used to encrypt the source DB cluster. The new DB cluster is encrypted with the KMS key
     *        identified by the <code>KmsKeyId</code> parameter.
     *        </p>
     *        <p>
     *        If you don't specify a value for the <code>KmsKeyId</code> parameter, then the following occurs:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the DB cluster is encrypted, then the restored DB cluster is encrypted using the KMS key that was used
     *        to encrypt the source DB cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the DB cluster isn't encrypted, then the restored DB cluster isn't encrypted.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If <code>DBClusterIdentifier</code> refers to a DB cluster that isn't encrypted, then the restore request
     *        is rejected.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterToPointInTimeRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management (IAM)
     * accounts to database accounts. By default, mapping isn't enabled.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param enableIAMDatabaseAuthentication
     *        A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management
     *        (IAM) accounts to database accounts. By default, mapping isn't enabled.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM
     *        Database Authentication</a> in the <i>Amazon Aurora User Guide</i>.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     */

    public void setEnableIAMDatabaseAuthentication(Boolean enableIAMDatabaseAuthentication) {
        this.enableIAMDatabaseAuthentication = enableIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management (IAM)
     * accounts to database accounts. By default, mapping isn't enabled.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management
     *         (IAM) accounts to database accounts. By default, mapping isn't enabled.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM
     *         Database Authentication</a> in the <i>Amazon Aurora User Guide</i>.
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public Boolean getEnableIAMDatabaseAuthentication() {
        return this.enableIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management (IAM)
     * accounts to database accounts. By default, mapping isn't enabled.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param enableIAMDatabaseAuthentication
     *        A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management
     *        (IAM) accounts to database accounts. By default, mapping isn't enabled.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM
     *        Database Authentication</a> in the <i>Amazon Aurora User Guide</i>.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterToPointInTimeRequest withEnableIAMDatabaseAuthentication(Boolean enableIAMDatabaseAuthentication) {
        setEnableIAMDatabaseAuthentication(enableIAMDatabaseAuthentication);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management (IAM)
     * accounts to database accounts. By default, mapping isn't enabled.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM Database
     * Authentication</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return A value that indicates whether to enable mapping of Amazon Web Services Identity and Access Management
     *         (IAM) accounts to database accounts. By default, mapping isn't enabled.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/UsingWithRDS.IAMDBAuth.html"> IAM
     *         Database Authentication</a> in the <i>Amazon Aurora User Guide</i>.
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters only
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
     * <p>
     * Valid for: Aurora MySQL DB clusters only
     * </p>
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
     *        </ul>
     *        <p>
     *        Valid for: Aurora MySQL DB clusters only
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
     * <p>
     * Valid for: Aurora MySQL DB clusters only
     * </p>
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
     *         </ul>
     *         <p>
     *         Valid for: Aurora MySQL DB clusters only
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
     * <p>
     * Valid for: Aurora MySQL DB clusters only
     * </p>
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
     *        </ul>
     *        <p>
     *        Valid for: Aurora MySQL DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterToPointInTimeRequest withBacktrackWindow(Long backtrackWindow) {
        setBacktrackWindow(backtrackWindow);
        return this;
    }

    /**
     * <p>
     * The list of logs that the restored DB cluster is to export to CloudWatch Logs. The values in the list depend on
     * the DB engine being used.
     * </p>
     * <p>
     * <b>RDS for MySQL</b>
     * </p>
     * <p>
     * Possible values are <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     * </p>
     * <p>
     * <b>RDS for PostgreSQL</b>
     * </p>
     * <p>
     * Possible values are <code>postgresql</code> and <code>upgrade</code>.
     * </p>
     * <p>
     * <b>Aurora MySQL</b>
     * </p>
     * <p>
     * Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     * </p>
     * <p>
     * <b>Aurora PostgreSQL</b>
     * </p>
     * <p>
     * Possible value is <code>postgresql</code>.
     * </p>
     * <p>
     * For more information about exporting CloudWatch Logs for Amazon RDS, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * For more information about exporting CloudWatch Logs for Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return The list of logs that the restored DB cluster is to export to CloudWatch Logs. The values in the list
     *         depend on the DB engine being used.</p>
     *         <p>
     *         <b>RDS for MySQL</b>
     *         </p>
     *         <p>
     *         Possible values are <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     *         </p>
     *         <p>
     *         <b>RDS for PostgreSQL</b>
     *         </p>
     *         <p>
     *         Possible values are <code>postgresql</code> and <code>upgrade</code>.
     *         </p>
     *         <p>
     *         <b>Aurora MySQL</b>
     *         </p>
     *         <p>
     *         Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and
     *         <code>slowquery</code>.
     *         </p>
     *         <p>
     *         <b>Aurora PostgreSQL</b>
     *         </p>
     *         <p>
     *         Possible value is <code>postgresql</code>.
     *         </p>
     *         <p>
     *         For more information about exporting CloudWatch Logs for Amazon RDS, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *         >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon RDS User Guide</i>.
     *         </p>
     *         <p>
     *         For more information about exporting CloudWatch Logs for Amazon Aurora, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *         >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon Aurora User Guide</i>.
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public java.util.List<String> getEnableCloudwatchLogsExports() {
        if (enableCloudwatchLogsExports == null) {
            enableCloudwatchLogsExports = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return enableCloudwatchLogsExports;
    }

    /**
     * <p>
     * The list of logs that the restored DB cluster is to export to CloudWatch Logs. The values in the list depend on
     * the DB engine being used.
     * </p>
     * <p>
     * <b>RDS for MySQL</b>
     * </p>
     * <p>
     * Possible values are <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     * </p>
     * <p>
     * <b>RDS for PostgreSQL</b>
     * </p>
     * <p>
     * Possible values are <code>postgresql</code> and <code>upgrade</code>.
     * </p>
     * <p>
     * <b>Aurora MySQL</b>
     * </p>
     * <p>
     * Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     * </p>
     * <p>
     * <b>Aurora PostgreSQL</b>
     * </p>
     * <p>
     * Possible value is <code>postgresql</code>.
     * </p>
     * <p>
     * For more information about exporting CloudWatch Logs for Amazon RDS, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * For more information about exporting CloudWatch Logs for Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param enableCloudwatchLogsExports
     *        The list of logs that the restored DB cluster is to export to CloudWatch Logs. The values in the list
     *        depend on the DB engine being used.</p>
     *        <p>
     *        <b>RDS for MySQL</b>
     *        </p>
     *        <p>
     *        Possible values are <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     *        </p>
     *        <p>
     *        <b>RDS for PostgreSQL</b>
     *        </p>
     *        <p>
     *        Possible values are <code>postgresql</code> and <code>upgrade</code>.
     *        </p>
     *        <p>
     *        <b>Aurora MySQL</b>
     *        </p>
     *        <p>
     *        Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and
     *        <code>slowquery</code>.
     *        </p>
     *        <p>
     *        <b>Aurora PostgreSQL</b>
     *        </p>
     *        <p>
     *        Possible value is <code>postgresql</code>.
     *        </p>
     *        <p>
     *        For more information about exporting CloudWatch Logs for Amazon RDS, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *        >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        For more information about exporting CloudWatch Logs for Amazon Aurora, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *        >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon Aurora User Guide</i>.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
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
     * The list of logs that the restored DB cluster is to export to CloudWatch Logs. The values in the list depend on
     * the DB engine being used.
     * </p>
     * <p>
     * <b>RDS for MySQL</b>
     * </p>
     * <p>
     * Possible values are <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     * </p>
     * <p>
     * <b>RDS for PostgreSQL</b>
     * </p>
     * <p>
     * Possible values are <code>postgresql</code> and <code>upgrade</code>.
     * </p>
     * <p>
     * <b>Aurora MySQL</b>
     * </p>
     * <p>
     * Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     * </p>
     * <p>
     * <b>Aurora PostgreSQL</b>
     * </p>
     * <p>
     * Possible value is <code>postgresql</code>.
     * </p>
     * <p>
     * For more information about exporting CloudWatch Logs for Amazon RDS, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * For more information about exporting CloudWatch Logs for Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnableCloudwatchLogsExports(java.util.Collection)} or
     * {@link #withEnableCloudwatchLogsExports(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param enableCloudwatchLogsExports
     *        The list of logs that the restored DB cluster is to export to CloudWatch Logs. The values in the list
     *        depend on the DB engine being used.</p>
     *        <p>
     *        <b>RDS for MySQL</b>
     *        </p>
     *        <p>
     *        Possible values are <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     *        </p>
     *        <p>
     *        <b>RDS for PostgreSQL</b>
     *        </p>
     *        <p>
     *        Possible values are <code>postgresql</code> and <code>upgrade</code>.
     *        </p>
     *        <p>
     *        <b>Aurora MySQL</b>
     *        </p>
     *        <p>
     *        Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and
     *        <code>slowquery</code>.
     *        </p>
     *        <p>
     *        <b>Aurora PostgreSQL</b>
     *        </p>
     *        <p>
     *        Possible value is <code>postgresql</code>.
     *        </p>
     *        <p>
     *        For more information about exporting CloudWatch Logs for Amazon RDS, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *        >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        For more information about exporting CloudWatch Logs for Amazon Aurora, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *        >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon Aurora User Guide</i>.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterToPointInTimeRequest withEnableCloudwatchLogsExports(String... enableCloudwatchLogsExports) {
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
     * The list of logs that the restored DB cluster is to export to CloudWatch Logs. The values in the list depend on
     * the DB engine being used.
     * </p>
     * <p>
     * <b>RDS for MySQL</b>
     * </p>
     * <p>
     * Possible values are <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     * </p>
     * <p>
     * <b>RDS for PostgreSQL</b>
     * </p>
     * <p>
     * Possible values are <code>postgresql</code> and <code>upgrade</code>.
     * </p>
     * <p>
     * <b>Aurora MySQL</b>
     * </p>
     * <p>
     * Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     * </p>
     * <p>
     * <b>Aurora PostgreSQL</b>
     * </p>
     * <p>
     * Possible value is <code>postgresql</code>.
     * </p>
     * <p>
     * For more information about exporting CloudWatch Logs for Amazon RDS, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * For more information about exporting CloudWatch Logs for Amazon Aurora, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param enableCloudwatchLogsExports
     *        The list of logs that the restored DB cluster is to export to CloudWatch Logs. The values in the list
     *        depend on the DB engine being used.</p>
     *        <p>
     *        <b>RDS for MySQL</b>
     *        </p>
     *        <p>
     *        Possible values are <code>error</code>, <code>general</code>, and <code>slowquery</code>.
     *        </p>
     *        <p>
     *        <b>RDS for PostgreSQL</b>
     *        </p>
     *        <p>
     *        Possible values are <code>postgresql</code> and <code>upgrade</code>.
     *        </p>
     *        <p>
     *        <b>Aurora MySQL</b>
     *        </p>
     *        <p>
     *        Possible values are <code>audit</code>, <code>error</code>, <code>general</code>, and
     *        <code>slowquery</code>.
     *        </p>
     *        <p>
     *        <b>Aurora PostgreSQL</b>
     *        </p>
     *        <p>
     *        Possible value is <code>postgresql</code>.
     *        </p>
     *        <p>
     *        For more information about exporting CloudWatch Logs for Amazon RDS, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *        >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        For more information about exporting CloudWatch Logs for Amazon Aurora, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *        >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon Aurora User Guide</i>.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterToPointInTimeRequest withEnableCloudwatchLogsExports(java.util.Collection<String> enableCloudwatchLogsExports) {
        setEnableCloudwatchLogsExports(enableCloudwatchLogsExports);
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
     * If supplied, must match the name of an existing DB cluster parameter group.
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
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
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
     *        If supplied, must match the name of an existing DB cluster parameter group.
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
     *        </ul>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
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
     * If supplied, must match the name of an existing DB cluster parameter group.
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
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return The name of the DB cluster parameter group to associate with this DB cluster. If this argument is
     *         omitted, the default DB cluster parameter group for the specified engine is used.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If supplied, must match the name of an existing DB cluster parameter group.
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
     *         </ul>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
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
     * If supplied, must match the name of an existing DB cluster parameter group.
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
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
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
     *        If supplied, must match the name of an existing DB cluster parameter group.
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
     *        </ul>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterToPointInTimeRequest withDBClusterParameterGroupName(String dBClusterParameterGroupName) {
        setDBClusterParameterGroupName(dBClusterParameterGroupName);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when
     * deletion protection is enabled. By default, deletion protection isn't enabled.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param deletionProtection
     *        A value that indicates whether the DB cluster has deletion protection enabled. The database can't be
     *        deleted when deletion protection is enabled. By default, deletion protection isn't enabled.</p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when
     * deletion protection is enabled. By default, deletion protection isn't enabled.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return A value that indicates whether the DB cluster has deletion protection enabled. The database can't be
     *         deleted when deletion protection is enabled. By default, deletion protection isn't enabled.</p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when
     * deletion protection is enabled. By default, deletion protection isn't enabled.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param deletionProtection
     *        A value that indicates whether the DB cluster has deletion protection enabled. The database can't be
     *        deleted when deletion protection is enabled. By default, deletion protection isn't enabled.</p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterToPointInTimeRequest withDeletionProtection(Boolean deletionProtection) {
        setDeletionProtection(deletionProtection);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when
     * deletion protection is enabled. By default, deletion protection isn't enabled.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return A value that indicates whether the DB cluster has deletion protection enabled. The database can't be
     *         deleted when deletion protection is enabled. By default, deletion protection isn't enabled.</p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public Boolean isDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the restored DB cluster to snapshots of the restored DB
     * cluster. The default is not to copy them.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        A value that indicates whether to copy all tags from the restored DB cluster to snapshots of the restored
     *        DB cluster. The default is not to copy them.</p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public void setCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the restored DB cluster to snapshots of the restored DB
     * cluster. The default is not to copy them.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return A value that indicates whether to copy all tags from the restored DB cluster to snapshots of the restored
     *         DB cluster. The default is not to copy them.</p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public Boolean getCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the restored DB cluster to snapshots of the restored DB
     * cluster. The default is not to copy them.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        A value that indicates whether to copy all tags from the restored DB cluster to snapshots of the restored
     *        DB cluster. The default is not to copy them.</p>
     *        <p>
     *        Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterToPointInTimeRequest withCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        setCopyTagsToSnapshot(copyTagsToSnapshot);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the restored DB cluster to snapshots of the restored DB
     * cluster. The default is not to copy them.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters and Multi-AZ DB clusters
     * </p>
     * 
     * @return A value that indicates whether to copy all tags from the restored DB cluster to snapshots of the restored
     *         DB cluster. The default is not to copy them.</p>
     *         <p>
     *         Valid for: Aurora DB clusters and Multi-AZ DB clusters
     */

    public Boolean isCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
    }

    /**
     * <p>
     * Specify the Active Directory directory ID to restore the DB cluster in. The domain must be created prior to this
     * operation.
     * </p>
     * <p>
     * For Amazon Aurora DB clusters, Amazon RDS can use Kerberos Authentication to authenticate users that connect to
     * the DB cluster. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/kerberos-authentication.html">Kerberos
     * Authentication</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param domain
     *        Specify the Active Directory directory ID to restore the DB cluster in. The domain must be created prior
     *        to this operation.</p>
     *        <p>
     *        For Amazon Aurora DB clusters, Amazon RDS can use Kerberos Authentication to authenticate users that
     *        connect to the DB cluster. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/kerberos-authentication.html">Kerberos
     *        Authentication</a> in the <i>Amazon Aurora User Guide</i>.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * Specify the Active Directory directory ID to restore the DB cluster in. The domain must be created prior to this
     * operation.
     * </p>
     * <p>
     * For Amazon Aurora DB clusters, Amazon RDS can use Kerberos Authentication to authenticate users that connect to
     * the DB cluster. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/kerberos-authentication.html">Kerberos
     * Authentication</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return Specify the Active Directory directory ID to restore the DB cluster in. The domain must be created prior
     *         to this operation.</p>
     *         <p>
     *         For Amazon Aurora DB clusters, Amazon RDS can use Kerberos Authentication to authenticate users that
     *         connect to the DB cluster. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/kerberos-authentication.html">Kerberos
     *         Authentication</a> in the <i>Amazon Aurora User Guide</i>.
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * Specify the Active Directory directory ID to restore the DB cluster in. The domain must be created prior to this
     * operation.
     * </p>
     * <p>
     * For Amazon Aurora DB clusters, Amazon RDS can use Kerberos Authentication to authenticate users that connect to
     * the DB cluster. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/kerberos-authentication.html">Kerberos
     * Authentication</a> in the <i>Amazon Aurora User Guide</i>.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param domain
     *        Specify the Active Directory directory ID to restore the DB cluster in. The domain must be created prior
     *        to this operation.</p>
     *        <p>
     *        For Amazon Aurora DB clusters, Amazon RDS can use Kerberos Authentication to authenticate users that
     *        connect to the DB cluster. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/kerberos-authentication.html">Kerberos
     *        Authentication</a> in the <i>Amazon Aurora User Guide</i>.
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterToPointInTimeRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * Specify the name of the IAM role to be used when making API calls to the Directory Service.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param domainIAMRoleName
     *        Specify the name of the IAM role to be used when making API calls to the Directory Service.</p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     */

    public void setDomainIAMRoleName(String domainIAMRoleName) {
        this.domainIAMRoleName = domainIAMRoleName;
    }

    /**
     * <p>
     * Specify the name of the IAM role to be used when making API calls to the Directory Service.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return Specify the name of the IAM role to be used when making API calls to the Directory Service.</p>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public String getDomainIAMRoleName() {
        return this.domainIAMRoleName;
    }

    /**
     * <p>
     * Specify the name of the IAM role to be used when making API calls to the Directory Service.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param domainIAMRoleName
     *        Specify the name of the IAM role to be used when making API calls to the Directory Service.</p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterToPointInTimeRequest withDomainIAMRoleName(String domainIAMRoleName) {
        setDomainIAMRoleName(domainIAMRoleName);
        return this;
    }

    /**
     * <p>
     * For DB clusters in <code>serverless</code> DB engine mode, the scaling properties of the DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param scalingConfiguration
     *        For DB clusters in <code>serverless</code> DB engine mode, the scaling properties of the DB cluster.</p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     */

    public void setScalingConfiguration(ScalingConfiguration scalingConfiguration) {
        this.scalingConfiguration = scalingConfiguration;
    }

    /**
     * <p>
     * For DB clusters in <code>serverless</code> DB engine mode, the scaling properties of the DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return For DB clusters in <code>serverless</code> DB engine mode, the scaling properties of the DB cluster.</p>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public ScalingConfiguration getScalingConfiguration() {
        return this.scalingConfiguration;
    }

    /**
     * <p>
     * For DB clusters in <code>serverless</code> DB engine mode, the scaling properties of the DB cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param scalingConfiguration
     *        For DB clusters in <code>serverless</code> DB engine mode, the scaling properties of the DB cluster.</p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterToPointInTimeRequest withScalingConfiguration(ScalingConfiguration scalingConfiguration) {
        setScalingConfiguration(scalingConfiguration);
        return this;
    }

    /**
     * <p>
     * The engine mode of the new cluster. Specify <code>provisioned</code> or <code>serverless</code>, depending on the
     * type of the cluster you are creating. You can create an Aurora Serverless v1 clone from a provisioned cluster, or
     * a provisioned clone from an Aurora Serverless v1 cluster. To create a clone that is an Aurora Serverless v1
     * cluster, the original cluster must be an Aurora Serverless v1 cluster or an encrypted provisioned cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param engineMode
     *        The engine mode of the new cluster. Specify <code>provisioned</code> or <code>serverless</code>, depending
     *        on the type of the cluster you are creating. You can create an Aurora Serverless v1 clone from a
     *        provisioned cluster, or a provisioned clone from an Aurora Serverless v1 cluster. To create a clone that
     *        is an Aurora Serverless v1 cluster, the original cluster must be an Aurora Serverless v1 cluster or an
     *        encrypted provisioned cluster.</p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     */

    public void setEngineMode(String engineMode) {
        this.engineMode = engineMode;
    }

    /**
     * <p>
     * The engine mode of the new cluster. Specify <code>provisioned</code> or <code>serverless</code>, depending on the
     * type of the cluster you are creating. You can create an Aurora Serverless v1 clone from a provisioned cluster, or
     * a provisioned clone from an Aurora Serverless v1 cluster. To create a clone that is an Aurora Serverless v1
     * cluster, the original cluster must be an Aurora Serverless v1 cluster or an encrypted provisioned cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return The engine mode of the new cluster. Specify <code>provisioned</code> or <code>serverless</code>,
     *         depending on the type of the cluster you are creating. You can create an Aurora Serverless v1 clone from
     *         a provisioned cluster, or a provisioned clone from an Aurora Serverless v1 cluster. To create a clone
     *         that is an Aurora Serverless v1 cluster, the original cluster must be an Aurora Serverless v1 cluster or
     *         an encrypted provisioned cluster.</p>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public String getEngineMode() {
        return this.engineMode;
    }

    /**
     * <p>
     * The engine mode of the new cluster. Specify <code>provisioned</code> or <code>serverless</code>, depending on the
     * type of the cluster you are creating. You can create an Aurora Serverless v1 clone from a provisioned cluster, or
     * a provisioned clone from an Aurora Serverless v1 cluster. To create a clone that is an Aurora Serverless v1
     * cluster, the original cluster must be an Aurora Serverless v1 cluster or an encrypted provisioned cluster.
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param engineMode
     *        The engine mode of the new cluster. Specify <code>provisioned</code> or <code>serverless</code>, depending
     *        on the type of the cluster you are creating. You can create an Aurora Serverless v1 clone from a
     *        provisioned cluster, or a provisioned clone from an Aurora Serverless v1 cluster. To create a clone that
     *        is an Aurora Serverless v1 cluster, the original cluster must be an Aurora Serverless v1 cluster or an
     *        encrypted provisioned cluster.</p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterToPointInTimeRequest withEngineMode(String engineMode) {
        setEngineMode(engineMode);
        return this;
    }

    /**
     * <p>
     * The compute and memory capacity of the each DB instance in the Multi-AZ DB cluster, for example db.m6gd.xlarge.
     * Not all DB instance classes are available in all Amazon Web Services Regions, or for all database engines.
     * </p>
     * <p>
     * For the full list of DB instance classes, and availability for your engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB instance class</a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param dBClusterInstanceClass
     *        The compute and memory capacity of the each DB instance in the Multi-AZ DB cluster, for example
     *        db.m6gd.xlarge. Not all DB instance classes are available in all Amazon Web Services Regions, or for all
     *        database engines.</p>
     *        <p>
     *        For the full list of DB instance classes, and availability for your engine, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB instance
     *        class</a> in the <i>Amazon RDS User Guide.</i>
     *        </p>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     */

    public void setDBClusterInstanceClass(String dBClusterInstanceClass) {
        this.dBClusterInstanceClass = dBClusterInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the each DB instance in the Multi-AZ DB cluster, for example db.m6gd.xlarge.
     * Not all DB instance classes are available in all Amazon Web Services Regions, or for all database engines.
     * </p>
     * <p>
     * For the full list of DB instance classes, and availability for your engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB instance class</a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @return The compute and memory capacity of the each DB instance in the Multi-AZ DB cluster, for example
     *         db.m6gd.xlarge. Not all DB instance classes are available in all Amazon Web Services Regions, or for all
     *         database engines.</p>
     *         <p>
     *         For the full list of DB instance classes, and availability for your engine, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB instance
     *         class</a> in the <i>Amazon RDS User Guide.</i>
     *         </p>
     *         <p>
     *         Valid for: Multi-AZ DB clusters only
     */

    public String getDBClusterInstanceClass() {
        return this.dBClusterInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the each DB instance in the Multi-AZ DB cluster, for example db.m6gd.xlarge.
     * Not all DB instance classes are available in all Amazon Web Services Regions, or for all database engines.
     * </p>
     * <p>
     * For the full list of DB instance classes, and availability for your engine, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB instance class</a>
     * in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param dBClusterInstanceClass
     *        The compute and memory capacity of the each DB instance in the Multi-AZ DB cluster, for example
     *        db.m6gd.xlarge. Not all DB instance classes are available in all Amazon Web Services Regions, or for all
     *        database engines.</p>
     *        <p>
     *        For the full list of DB instance classes, and availability for your engine, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html">DB instance
     *        class</a> in the <i>Amazon RDS User Guide.</i>
     *        </p>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterToPointInTimeRequest withDBClusterInstanceClass(String dBClusterInstanceClass) {
        setDBClusterInstanceClass(dBClusterInstanceClass);
        return this;
    }

    /**
     * <p>
     * Specifies the storage type to be associated with the each DB instance in the Multi-AZ DB cluster.
     * </p>
     * <p>
     * Valid values: <code>io1</code>
     * </p>
     * <p>
     * When specified, a value for the <code>Iops</code> parameter is required.
     * </p>
     * <p>
     * Default: <code>io1</code>
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param storageType
     *        Specifies the storage type to be associated with the each DB instance in the Multi-AZ DB cluster.</p>
     *        <p>
     *        Valid values: <code>io1</code>
     *        </p>
     *        <p>
     *        When specified, a value for the <code>Iops</code> parameter is required.
     *        </p>
     *        <p>
     *        Default: <code>io1</code>
     *        </p>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * Specifies the storage type to be associated with the each DB instance in the Multi-AZ DB cluster.
     * </p>
     * <p>
     * Valid values: <code>io1</code>
     * </p>
     * <p>
     * When specified, a value for the <code>Iops</code> parameter is required.
     * </p>
     * <p>
     * Default: <code>io1</code>
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @return Specifies the storage type to be associated with the each DB instance in the Multi-AZ DB cluster.</p>
     *         <p>
     *         Valid values: <code>io1</code>
     *         </p>
     *         <p>
     *         When specified, a value for the <code>Iops</code> parameter is required.
     *         </p>
     *         <p>
     *         Default: <code>io1</code>
     *         </p>
     *         <p>
     *         Valid for: Multi-AZ DB clusters only
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * Specifies the storage type to be associated with the each DB instance in the Multi-AZ DB cluster.
     * </p>
     * <p>
     * Valid values: <code>io1</code>
     * </p>
     * <p>
     * When specified, a value for the <code>Iops</code> parameter is required.
     * </p>
     * <p>
     * Default: <code>io1</code>
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param storageType
     *        Specifies the storage type to be associated with the each DB instance in the Multi-AZ DB cluster.</p>
     *        <p>
     *        Valid values: <code>io1</code>
     *        </p>
     *        <p>
     *        When specified, a value for the <code>Iops</code> parameter is required.
     *        </p>
     *        <p>
     *        Default: <code>io1</code>
     *        </p>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterToPointInTimeRequest withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster is publicly accessible.
     * </p>
     * <p>
     * When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private IP
     * address from within the DB cluster's virtual private cloud (VPC). It resolves to the public IP address from
     * outside of the DB cluster's VPC. Access to the DB cluster is ultimately controlled by the security group it uses.
     * That public access is not permitted if the security group assigned to the DB cluster doesn't permit it.
     * </p>
     * <p>
     * When the DB cluster isn't publicly accessible, it is an internal DB cluster with a DNS name that resolves to a
     * private IP address.
     * </p>
     * <p>
     * Default: The default behavior varies depending on whether <code>DBSubnetGroupName</code> is specified.
     * </p>
     * <p>
     * If <code>DBSubnetGroupName</code> isn't specified, and <code>PubliclyAccessible</code> isn't specified, the
     * following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the default VPC in the target Region doesn’t have an internet gateway attached to it, the DB cluster is
     * private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the default VPC in the target Region has an internet gateway attached to it, the DB cluster is public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>DBSubnetGroupName</code> is specified, and <code>PubliclyAccessible</code> isn't specified, the
     * following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the DB cluster is private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the subnets are part of a VPC that has an internet gateway attached to it, the DB cluster is public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param publiclyAccessible
     *        A value that indicates whether the DB cluster is publicly accessible.</p>
     *        <p>
     *        When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private
     *        IP address from within the DB cluster's virtual private cloud (VPC). It resolves to the public IP address
     *        from outside of the DB cluster's VPC. Access to the DB cluster is ultimately controlled by the security
     *        group it uses. That public access is not permitted if the security group assigned to the DB cluster
     *        doesn't permit it.
     *        </p>
     *        <p>
     *        When the DB cluster isn't publicly accessible, it is an internal DB cluster with a DNS name that resolves
     *        to a private IP address.
     *        </p>
     *        <p>
     *        Default: The default behavior varies depending on whether <code>DBSubnetGroupName</code> is specified.
     *        </p>
     *        <p>
     *        If <code>DBSubnetGroupName</code> isn't specified, and <code>PubliclyAccessible</code> isn't specified,
     *        the following applies:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the default VPC in the target Region doesn’t have an internet gateway attached to it, the DB cluster is
     *        private.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the default VPC in the target Region has an internet gateway attached to it, the DB cluster is public.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If <code>DBSubnetGroupName</code> is specified, and <code>PubliclyAccessible</code> isn't specified, the
     *        following applies:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the DB cluster is
     *        private.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the subnets are part of a VPC that has an internet gateway attached to it, the DB cluster is public.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     */

    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster is publicly accessible.
     * </p>
     * <p>
     * When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private IP
     * address from within the DB cluster's virtual private cloud (VPC). It resolves to the public IP address from
     * outside of the DB cluster's VPC. Access to the DB cluster is ultimately controlled by the security group it uses.
     * That public access is not permitted if the security group assigned to the DB cluster doesn't permit it.
     * </p>
     * <p>
     * When the DB cluster isn't publicly accessible, it is an internal DB cluster with a DNS name that resolves to a
     * private IP address.
     * </p>
     * <p>
     * Default: The default behavior varies depending on whether <code>DBSubnetGroupName</code> is specified.
     * </p>
     * <p>
     * If <code>DBSubnetGroupName</code> isn't specified, and <code>PubliclyAccessible</code> isn't specified, the
     * following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the default VPC in the target Region doesn’t have an internet gateway attached to it, the DB cluster is
     * private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the default VPC in the target Region has an internet gateway attached to it, the DB cluster is public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>DBSubnetGroupName</code> is specified, and <code>PubliclyAccessible</code> isn't specified, the
     * following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the DB cluster is private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the subnets are part of a VPC that has an internet gateway attached to it, the DB cluster is public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @return A value that indicates whether the DB cluster is publicly accessible.</p>
     *         <p>
     *         When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private
     *         IP address from within the DB cluster's virtual private cloud (VPC). It resolves to the public IP address
     *         from outside of the DB cluster's VPC. Access to the DB cluster is ultimately controlled by the security
     *         group it uses. That public access is not permitted if the security group assigned to the DB cluster
     *         doesn't permit it.
     *         </p>
     *         <p>
     *         When the DB cluster isn't publicly accessible, it is an internal DB cluster with a DNS name that resolves
     *         to a private IP address.
     *         </p>
     *         <p>
     *         Default: The default behavior varies depending on whether <code>DBSubnetGroupName</code> is specified.
     *         </p>
     *         <p>
     *         If <code>DBSubnetGroupName</code> isn't specified, and <code>PubliclyAccessible</code> isn't specified,
     *         the following applies:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the default VPC in the target Region doesn’t have an internet gateway attached to it, the DB cluster
     *         is private.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the default VPC in the target Region has an internet gateway attached to it, the DB cluster is public.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If <code>DBSubnetGroupName</code> is specified, and <code>PubliclyAccessible</code> isn't specified, the
     *         following applies:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the DB cluster is
     *         private.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the subnets are part of a VPC that has an internet gateway attached to it, the DB cluster is public.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Valid for: Multi-AZ DB clusters only
     */

    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster is publicly accessible.
     * </p>
     * <p>
     * When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private IP
     * address from within the DB cluster's virtual private cloud (VPC). It resolves to the public IP address from
     * outside of the DB cluster's VPC. Access to the DB cluster is ultimately controlled by the security group it uses.
     * That public access is not permitted if the security group assigned to the DB cluster doesn't permit it.
     * </p>
     * <p>
     * When the DB cluster isn't publicly accessible, it is an internal DB cluster with a DNS name that resolves to a
     * private IP address.
     * </p>
     * <p>
     * Default: The default behavior varies depending on whether <code>DBSubnetGroupName</code> is specified.
     * </p>
     * <p>
     * If <code>DBSubnetGroupName</code> isn't specified, and <code>PubliclyAccessible</code> isn't specified, the
     * following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the default VPC in the target Region doesn’t have an internet gateway attached to it, the DB cluster is
     * private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the default VPC in the target Region has an internet gateway attached to it, the DB cluster is public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>DBSubnetGroupName</code> is specified, and <code>PubliclyAccessible</code> isn't specified, the
     * following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the DB cluster is private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the subnets are part of a VPC that has an internet gateway attached to it, the DB cluster is public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param publiclyAccessible
     *        A value that indicates whether the DB cluster is publicly accessible.</p>
     *        <p>
     *        When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private
     *        IP address from within the DB cluster's virtual private cloud (VPC). It resolves to the public IP address
     *        from outside of the DB cluster's VPC. Access to the DB cluster is ultimately controlled by the security
     *        group it uses. That public access is not permitted if the security group assigned to the DB cluster
     *        doesn't permit it.
     *        </p>
     *        <p>
     *        When the DB cluster isn't publicly accessible, it is an internal DB cluster with a DNS name that resolves
     *        to a private IP address.
     *        </p>
     *        <p>
     *        Default: The default behavior varies depending on whether <code>DBSubnetGroupName</code> is specified.
     *        </p>
     *        <p>
     *        If <code>DBSubnetGroupName</code> isn't specified, and <code>PubliclyAccessible</code> isn't specified,
     *        the following applies:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the default VPC in the target Region doesn’t have an internet gateway attached to it, the DB cluster is
     *        private.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the default VPC in the target Region has an internet gateway attached to it, the DB cluster is public.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If <code>DBSubnetGroupName</code> is specified, and <code>PubliclyAccessible</code> isn't specified, the
     *        following applies:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the DB cluster is
     *        private.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the subnets are part of a VPC that has an internet gateway attached to it, the DB cluster is public.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterToPointInTimeRequest withPubliclyAccessible(Boolean publiclyAccessible) {
        setPubliclyAccessible(publiclyAccessible);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB cluster is publicly accessible.
     * </p>
     * <p>
     * When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private IP
     * address from within the DB cluster's virtual private cloud (VPC). It resolves to the public IP address from
     * outside of the DB cluster's VPC. Access to the DB cluster is ultimately controlled by the security group it uses.
     * That public access is not permitted if the security group assigned to the DB cluster doesn't permit it.
     * </p>
     * <p>
     * When the DB cluster isn't publicly accessible, it is an internal DB cluster with a DNS name that resolves to a
     * private IP address.
     * </p>
     * <p>
     * Default: The default behavior varies depending on whether <code>DBSubnetGroupName</code> is specified.
     * </p>
     * <p>
     * If <code>DBSubnetGroupName</code> isn't specified, and <code>PubliclyAccessible</code> isn't specified, the
     * following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the default VPC in the target Region doesn’t have an internet gateway attached to it, the DB cluster is
     * private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the default VPC in the target Region has an internet gateway attached to it, the DB cluster is public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>DBSubnetGroupName</code> is specified, and <code>PubliclyAccessible</code> isn't specified, the
     * following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the DB cluster is private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the subnets are part of a VPC that has an internet gateway attached to it, the DB cluster is public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @return A value that indicates whether the DB cluster is publicly accessible.</p>
     *         <p>
     *         When the DB cluster is publicly accessible, its Domain Name System (DNS) endpoint resolves to the private
     *         IP address from within the DB cluster's virtual private cloud (VPC). It resolves to the public IP address
     *         from outside of the DB cluster's VPC. Access to the DB cluster is ultimately controlled by the security
     *         group it uses. That public access is not permitted if the security group assigned to the DB cluster
     *         doesn't permit it.
     *         </p>
     *         <p>
     *         When the DB cluster isn't publicly accessible, it is an internal DB cluster with a DNS name that resolves
     *         to a private IP address.
     *         </p>
     *         <p>
     *         Default: The default behavior varies depending on whether <code>DBSubnetGroupName</code> is specified.
     *         </p>
     *         <p>
     *         If <code>DBSubnetGroupName</code> isn't specified, and <code>PubliclyAccessible</code> isn't specified,
     *         the following applies:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the default VPC in the target Region doesn’t have an internet gateway attached to it, the DB cluster
     *         is private.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the default VPC in the target Region has an internet gateway attached to it, the DB cluster is public.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If <code>DBSubnetGroupName</code> is specified, and <code>PubliclyAccessible</code> isn't specified, the
     *         following applies:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the subnets are part of a VPC that doesn’t have an internet gateway attached to it, the DB cluster is
     *         private.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the subnets are part of a VPC that has an internet gateway attached to it, the DB cluster is public.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Valid for: Multi-AZ DB clusters only
     */

    public Boolean isPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for each DB
     * instance in the Multi-AZ DB cluster.
     * </p>
     * <p>
     * For information about valid IOPS values, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html#USER_PIOPS">Amazon RDS Provisioned
     * IOPS storage</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Constraints: Must be a multiple between .5 and 50 of the storage amount for the DB instance.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param iops
     *        The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for each DB
     *        instance in the Multi-AZ DB cluster.</p>
     *        <p>
     *        For information about valid IOPS values, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html#USER_PIOPS">Amazon RDS
     *        Provisioned IOPS storage</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        Constraints: Must be a multiple between .5 and 50 of the storage amount for the DB instance.
     *        </p>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for each DB
     * instance in the Multi-AZ DB cluster.
     * </p>
     * <p>
     * For information about valid IOPS values, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html#USER_PIOPS">Amazon RDS Provisioned
     * IOPS storage</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Constraints: Must be a multiple between .5 and 50 of the storage amount for the DB instance.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @return The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for each DB
     *         instance in the Multi-AZ DB cluster.</p>
     *         <p>
     *         For information about valid IOPS values, see <a
     *         href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html#USER_PIOPS">Amazon RDS
     *         Provisioned IOPS storage</a> in the <i>Amazon RDS User Guide</i>.
     *         </p>
     *         <p>
     *         Constraints: Must be a multiple between .5 and 50 of the storage amount for the DB instance.
     *         </p>
     *         <p>
     *         Valid for: Multi-AZ DB clusters only
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for each DB
     * instance in the Multi-AZ DB cluster.
     * </p>
     * <p>
     * For information about valid IOPS values, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html#USER_PIOPS">Amazon RDS Provisioned
     * IOPS storage</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Constraints: Must be a multiple between .5 and 50 of the storage amount for the DB instance.
     * </p>
     * <p>
     * Valid for: Multi-AZ DB clusters only
     * </p>
     * 
     * @param iops
     *        The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for each DB
     *        instance in the Multi-AZ DB cluster.</p>
     *        <p>
     *        For information about valid IOPS values, see <a
     *        href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html#USER_PIOPS">Amazon RDS
     *        Provisioned IOPS storage</a> in the <i>Amazon RDS User Guide</i>.
     *        </p>
     *        <p>
     *        Constraints: Must be a multiple between .5 and 50 of the storage amount for the DB instance.
     *        </p>
     *        <p>
     *        Valid for: Multi-AZ DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterToPointInTimeRequest withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * @param serverlessV2ScalingConfiguration
     */

    public void setServerlessV2ScalingConfiguration(ServerlessV2ScalingConfiguration serverlessV2ScalingConfiguration) {
        this.serverlessV2ScalingConfiguration = serverlessV2ScalingConfiguration;
    }

    /**
     * @return
     */

    public ServerlessV2ScalingConfiguration getServerlessV2ScalingConfiguration() {
        return this.serverlessV2ScalingConfiguration;
    }

    /**
     * @param serverlessV2ScalingConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterToPointInTimeRequest withServerlessV2ScalingConfiguration(ServerlessV2ScalingConfiguration serverlessV2ScalingConfiguration) {
        setServerlessV2ScalingConfiguration(serverlessV2ScalingConfiguration);
        return this;
    }

    /**
     * <p>
     * The network type of the DB cluster.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IPV4</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DUAL</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The network type is determined by the <code>DBSubnetGroup</code> specified for the DB cluster. A
     * <code>DBSubnetGroup</code> can support only the IPv4 protocol or the IPv4 and the IPv6 protocols (
     * <code>DUAL</code>).
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html">
     * Working with a DB instance in a VPC</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param networkType
     *        The network type of the DB cluster.</p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IPV4</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DUAL</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The network type is determined by the <code>DBSubnetGroup</code> specified for the DB cluster. A
     *        <code>DBSubnetGroup</code> can support only the IPv4 protocol or the IPv4 and the IPv6 protocols (
     *        <code>DUAL</code>).
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html">
     *        Working with a DB instance in a VPC</a> in the <i>Amazon Aurora User Guide.</i>
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     */

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    /**
     * <p>
     * The network type of the DB cluster.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IPV4</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DUAL</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The network type is determined by the <code>DBSubnetGroup</code> specified for the DB cluster. A
     * <code>DBSubnetGroup</code> can support only the IPv4 protocol or the IPv4 and the IPv6 protocols (
     * <code>DUAL</code>).
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html">
     * Working with a DB instance in a VPC</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @return The network type of the DB cluster.</p>
     *         <p>
     *         Valid values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>IPV4</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DUAL</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The network type is determined by the <code>DBSubnetGroup</code> specified for the DB cluster. A
     *         <code>DBSubnetGroup</code> can support only the IPv4 protocol or the IPv4 and the IPv6 protocols (
     *         <code>DUAL</code>).
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html"
     *         > Working with a DB instance in a VPC</a> in the <i>Amazon Aurora User Guide.</i>
     *         </p>
     *         <p>
     *         Valid for: Aurora DB clusters only
     */

    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * <p>
     * The network type of the DB cluster.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IPV4</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DUAL</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The network type is determined by the <code>DBSubnetGroup</code> specified for the DB cluster. A
     * <code>DBSubnetGroup</code> can support only the IPv4 protocol or the IPv4 and the IPv6 protocols (
     * <code>DUAL</code>).
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html">
     * Working with a DB instance in a VPC</a> in the <i>Amazon Aurora User Guide.</i>
     * </p>
     * <p>
     * Valid for: Aurora DB clusters only
     * </p>
     * 
     * @param networkType
     *        The network type of the DB cluster.</p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IPV4</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DUAL</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The network type is determined by the <code>DBSubnetGroup</code> specified for the DB cluster. A
     *        <code>DBSubnetGroup</code> can support only the IPv4 protocol or the IPv4 and the IPv6 protocols (
     *        <code>DUAL</code>).
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_VPC.WorkingWithRDSInstanceinaVPC.html">
     *        Working with a DB instance in a VPC</a> in the <i>Amazon Aurora User Guide.</i>
     *        </p>
     *        <p>
     *        Valid for: Aurora DB clusters only
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterToPointInTimeRequest withNetworkType(String networkType) {
        setNetworkType(networkType);
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
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: ").append(getDBClusterIdentifier()).append(",");
        if (getRestoreType() != null)
            sb.append("RestoreType: ").append(getRestoreType()).append(",");
        if (getSourceDBClusterIdentifier() != null)
            sb.append("SourceDBClusterIdentifier: ").append(getSourceDBClusterIdentifier()).append(",");
        if (getRestoreToTime() != null)
            sb.append("RestoreToTime: ").append(getRestoreToTime()).append(",");
        if (getUseLatestRestorableTime() != null)
            sb.append("UseLatestRestorableTime: ").append(getUseLatestRestorableTime()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getDBSubnetGroupName() != null)
            sb.append("DBSubnetGroupName: ").append(getDBSubnetGroupName()).append(",");
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
        if (getDBClusterParameterGroupName() != null)
            sb.append("DBClusterParameterGroupName: ").append(getDBClusterParameterGroupName()).append(",");
        if (getDeletionProtection() != null)
            sb.append("DeletionProtection: ").append(getDeletionProtection()).append(",");
        if (getCopyTagsToSnapshot() != null)
            sb.append("CopyTagsToSnapshot: ").append(getCopyTagsToSnapshot()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getDomainIAMRoleName() != null)
            sb.append("DomainIAMRoleName: ").append(getDomainIAMRoleName()).append(",");
        if (getScalingConfiguration() != null)
            sb.append("ScalingConfiguration: ").append(getScalingConfiguration()).append(",");
        if (getEngineMode() != null)
            sb.append("EngineMode: ").append(getEngineMode()).append(",");
        if (getDBClusterInstanceClass() != null)
            sb.append("DBClusterInstanceClass: ").append(getDBClusterInstanceClass()).append(",");
        if (getStorageType() != null)
            sb.append("StorageType: ").append(getStorageType()).append(",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: ").append(getPubliclyAccessible()).append(",");
        if (getIops() != null)
            sb.append("Iops: ").append(getIops()).append(",");
        if (getServerlessV2ScalingConfiguration() != null)
            sb.append("ServerlessV2ScalingConfiguration: ").append(getServerlessV2ScalingConfiguration()).append(",");
        if (getNetworkType() != null)
            sb.append("NetworkType: ").append(getNetworkType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreDBClusterToPointInTimeRequest == false)
            return false;
        RestoreDBClusterToPointInTimeRequest other = (RestoreDBClusterToPointInTimeRequest) obj;
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getRestoreType() == null ^ this.getRestoreType() == null)
            return false;
        if (other.getRestoreType() != null && other.getRestoreType().equals(this.getRestoreType()) == false)
            return false;
        if (other.getSourceDBClusterIdentifier() == null ^ this.getSourceDBClusterIdentifier() == null)
            return false;
        if (other.getSourceDBClusterIdentifier() != null && other.getSourceDBClusterIdentifier().equals(this.getSourceDBClusterIdentifier()) == false)
            return false;
        if (other.getRestoreToTime() == null ^ this.getRestoreToTime() == null)
            return false;
        if (other.getRestoreToTime() != null && other.getRestoreToTime().equals(this.getRestoreToTime()) == false)
            return false;
        if (other.getUseLatestRestorableTime() == null ^ this.getUseLatestRestorableTime() == null)
            return false;
        if (other.getUseLatestRestorableTime() != null && other.getUseLatestRestorableTime().equals(this.getUseLatestRestorableTime()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getDBSubnetGroupName() == null ^ this.getDBSubnetGroupName() == null)
            return false;
        if (other.getDBSubnetGroupName() != null && other.getDBSubnetGroupName().equals(this.getDBSubnetGroupName()) == false)
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
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getDomainIAMRoleName() == null ^ this.getDomainIAMRoleName() == null)
            return false;
        if (other.getDomainIAMRoleName() != null && other.getDomainIAMRoleName().equals(this.getDomainIAMRoleName()) == false)
            return false;
        if (other.getScalingConfiguration() == null ^ this.getScalingConfiguration() == null)
            return false;
        if (other.getScalingConfiguration() != null && other.getScalingConfiguration().equals(this.getScalingConfiguration()) == false)
            return false;
        if (other.getEngineMode() == null ^ this.getEngineMode() == null)
            return false;
        if (other.getEngineMode() != null && other.getEngineMode().equals(this.getEngineMode()) == false)
            return false;
        if (other.getDBClusterInstanceClass() == null ^ this.getDBClusterInstanceClass() == null)
            return false;
        if (other.getDBClusterInstanceClass() != null && other.getDBClusterInstanceClass().equals(this.getDBClusterInstanceClass()) == false)
            return false;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getServerlessV2ScalingConfiguration() == null ^ this.getServerlessV2ScalingConfiguration() == null)
            return false;
        if (other.getServerlessV2ScalingConfiguration() != null
                && other.getServerlessV2ScalingConfiguration().equals(this.getServerlessV2ScalingConfiguration()) == false)
            return false;
        if (other.getNetworkType() == null ^ this.getNetworkType() == null)
            return false;
        if (other.getNetworkType() != null && other.getNetworkType().equals(this.getNetworkType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getRestoreType() == null) ? 0 : getRestoreType().hashCode());
        hashCode = prime * hashCode + ((getSourceDBClusterIdentifier() == null) ? 0 : getSourceDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getRestoreToTime() == null) ? 0 : getRestoreToTime().hashCode());
        hashCode = prime * hashCode + ((getUseLatestRestorableTime() == null) ? 0 : getUseLatestRestorableTime().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getDBSubnetGroupName() == null) ? 0 : getDBSubnetGroupName().hashCode());
        hashCode = prime * hashCode + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getEnableIAMDatabaseAuthentication() == null) ? 0 : getEnableIAMDatabaseAuthentication().hashCode());
        hashCode = prime * hashCode + ((getBacktrackWindow() == null) ? 0 : getBacktrackWindow().hashCode());
        hashCode = prime * hashCode + ((getEnableCloudwatchLogsExports() == null) ? 0 : getEnableCloudwatchLogsExports().hashCode());
        hashCode = prime * hashCode + ((getDBClusterParameterGroupName() == null) ? 0 : getDBClusterParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getDeletionProtection() == null) ? 0 : getDeletionProtection().hashCode());
        hashCode = prime * hashCode + ((getCopyTagsToSnapshot() == null) ? 0 : getCopyTagsToSnapshot().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getDomainIAMRoleName() == null) ? 0 : getDomainIAMRoleName().hashCode());
        hashCode = prime * hashCode + ((getScalingConfiguration() == null) ? 0 : getScalingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getEngineMode() == null) ? 0 : getEngineMode().hashCode());
        hashCode = prime * hashCode + ((getDBClusterInstanceClass() == null) ? 0 : getDBClusterInstanceClass().hashCode());
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getServerlessV2ScalingConfiguration() == null) ? 0 : getServerlessV2ScalingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getNetworkType() == null) ? 0 : getNetworkType().hashCode());
        return hashCode;
    }

    @Override
    public RestoreDBClusterToPointInTimeRequest clone() {
        return (RestoreDBClusterToPointInTimeRequest) super.clone();
    }

}
