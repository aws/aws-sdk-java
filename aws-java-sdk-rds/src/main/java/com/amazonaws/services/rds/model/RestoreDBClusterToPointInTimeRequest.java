/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 */
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
     * Must contain from 1 to 63 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     */
    private String dBClusterIdentifier;
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
     * Must be the identifier of an existing database instance
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
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
     * Cannot be specified if <code>UseLatestRestorableTime</code> parameter is true
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>2015-03-07T23:45:00Z</code>
     * </p>
     */
    private java.util.Date restoreToTime;
    /**
     * <p>
     * A value that is set to <code>true</code> to restore the DB cluster to the latest restorable backup time, and
     * <code>false</code> otherwise.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * <p>
     * Constraints: Cannot be specified if <code>RestoreToTime</code> parameter is provided.
     * </p>
     */
    private Boolean useLatestRestorableTime;
    /**
     * <p>
     * The port number on which the new DB cluster accepts connections.
     * </p>
     * <p>
     * Constraints: Value must be <code>1150-65535</code>
     * </p>
     * <p>
     * Default: The same port as the original DB cluster.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The DB subnet group name to use for the new DB cluster.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters, periods, underscores, spaces, or hyphens.
     * Must not be default.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     */
    private String dBSubnetGroupName;
    /**
     * <p>
     * The name of the option group for the new DB cluster.
     * </p>
     */
    private String optionGroupName;
    /**
     * <p>
     * A lst of VPC security groups that the new DB cluster belongs to.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupIds;

    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The KMS key identifier to use when restoring an encrypted DB cluster from an encrypted DB cluster.
     * </p>
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are restoring a DB
     * cluster with the same AWS account that owns the KMS encryption key used to encrypt the new DB cluster, then you
     * can use the KMS key alias instead of the ARN for the KMS encryption key.
     * </p>
     * <p>
     * You can restore to a new DB cluster and encrypt the new DB cluster with a KMS key that is different than the KMS
     * key used to encrypt the source DB cluster. The new DB cluster will be encrypted with the KMS key identified by
     * the <code>KmsKeyId</code> parameter.
     * </p>
     * <p>
     * If you do not specify a value for the <code>KmsKeyId</code> parameter, then the following will occur:
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
     * If the DB cluster is not encrypted, then the restored DB cluster is not encrypted.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>DBClusterIdentifier</code> refers to a DB cluster that is note encrypted, then the restore request is
     * rejected.
     * </p>
     */
    private String kmsKeyId;

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
     * Must contain from 1 to 63 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBClusterIdentifier
     *        The name of the new DB cluster to be created.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 alphanumeric characters or hyphens
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
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
     * Must contain from 1 to 63 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the new DB cluster to be created.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain from 1 to 63 alphanumeric characters or hyphens
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot end with a hyphen or contain two consecutive hyphens
     *         </p>
     *         </li>
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
     * Must contain from 1 to 63 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBClusterIdentifier
     *        The name of the new DB cluster to be created.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 alphanumeric characters or hyphens
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterToPointInTimeRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        setDBClusterIdentifier(dBClusterIdentifier);
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
     * Must be the identifier of an existing database instance
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceDBClusterIdentifier
     *        The identifier of the source DB cluster from which to restore.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be the identifier of an existing database instance
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 alphanumeric characters or hyphens
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
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
     * Must be the identifier of an existing database instance
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * 
     * @return The identifier of the source DB cluster from which to restore.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be the identifier of an existing database instance
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must contain from 1 to 63 alphanumeric characters or hyphens
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot end with a hyphen or contain two consecutive hyphens
     *         </p>
     *         </li>
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
     * Must be the identifier of an existing database instance
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceDBClusterIdentifier
     *        The identifier of the source DB cluster from which to restore.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be the identifier of an existing database instance
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 alphanumeric characters or hyphens
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
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
     * Cannot be specified if <code>UseLatestRestorableTime</code> parameter is true
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>2015-03-07T23:45:00Z</code>
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
     *        Cannot be specified if <code>UseLatestRestorableTime</code> parameter is true
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>2015-03-07T23:45:00Z</code>
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
     * Cannot be specified if <code>UseLatestRestorableTime</code> parameter is true
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>2015-03-07T23:45:00Z</code>
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
     *         Cannot be specified if <code>UseLatestRestorableTime</code> parameter is true
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>2015-03-07T23:45:00Z</code>
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
     * Cannot be specified if <code>UseLatestRestorableTime</code> parameter is true
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>2015-03-07T23:45:00Z</code>
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
     *        Cannot be specified if <code>UseLatestRestorableTime</code> parameter is true
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>2015-03-07T23:45:00Z</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterToPointInTimeRequest withRestoreToTime(java.util.Date restoreToTime) {
        setRestoreToTime(restoreToTime);
        return this;
    }

    /**
     * <p>
     * A value that is set to <code>true</code> to restore the DB cluster to the latest restorable backup time, and
     * <code>false</code> otherwise.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * <p>
     * Constraints: Cannot be specified if <code>RestoreToTime</code> parameter is provided.
     * </p>
     * 
     * @param useLatestRestorableTime
     *        A value that is set to <code>true</code> to restore the DB cluster to the latest restorable backup time,
     *        and <code>false</code> otherwise. </p>
     *        <p>
     *        Default: <code>false</code>
     *        </p>
     *        <p>
     *        Constraints: Cannot be specified if <code>RestoreToTime</code> parameter is provided.
     */

    public void setUseLatestRestorableTime(Boolean useLatestRestorableTime) {
        this.useLatestRestorableTime = useLatestRestorableTime;
    }

    /**
     * <p>
     * A value that is set to <code>true</code> to restore the DB cluster to the latest restorable backup time, and
     * <code>false</code> otherwise.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * <p>
     * Constraints: Cannot be specified if <code>RestoreToTime</code> parameter is provided.
     * </p>
     * 
     * @return A value that is set to <code>true</code> to restore the DB cluster to the latest restorable backup time,
     *         and <code>false</code> otherwise. </p>
     *         <p>
     *         Default: <code>false</code>
     *         </p>
     *         <p>
     *         Constraints: Cannot be specified if <code>RestoreToTime</code> parameter is provided.
     */

    public Boolean getUseLatestRestorableTime() {
        return this.useLatestRestorableTime;
    }

    /**
     * <p>
     * A value that is set to <code>true</code> to restore the DB cluster to the latest restorable backup time, and
     * <code>false</code> otherwise.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * <p>
     * Constraints: Cannot be specified if <code>RestoreToTime</code> parameter is provided.
     * </p>
     * 
     * @param useLatestRestorableTime
     *        A value that is set to <code>true</code> to restore the DB cluster to the latest restorable backup time,
     *        and <code>false</code> otherwise. </p>
     *        <p>
     *        Default: <code>false</code>
     *        </p>
     *        <p>
     *        Constraints: Cannot be specified if <code>RestoreToTime</code> parameter is provided.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterToPointInTimeRequest withUseLatestRestorableTime(Boolean useLatestRestorableTime) {
        setUseLatestRestorableTime(useLatestRestorableTime);
        return this;
    }

    /**
     * <p>
     * A value that is set to <code>true</code> to restore the DB cluster to the latest restorable backup time, and
     * <code>false</code> otherwise.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * <p>
     * Constraints: Cannot be specified if <code>RestoreToTime</code> parameter is provided.
     * </p>
     * 
     * @return A value that is set to <code>true</code> to restore the DB cluster to the latest restorable backup time,
     *         and <code>false</code> otherwise. </p>
     *         <p>
     *         Default: <code>false</code>
     *         </p>
     *         <p>
     *         Constraints: Cannot be specified if <code>RestoreToTime</code> parameter is provided.
     */

    public Boolean isUseLatestRestorableTime() {
        return this.useLatestRestorableTime;
    }

    /**
     * <p>
     * The port number on which the new DB cluster accepts connections.
     * </p>
     * <p>
     * Constraints: Value must be <code>1150-65535</code>
     * </p>
     * <p>
     * Default: The same port as the original DB cluster.
     * </p>
     * 
     * @param port
     *        The port number on which the new DB cluster accepts connections.</p>
     *        <p>
     *        Constraints: Value must be <code>1150-65535</code>
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
     * Constraints: Value must be <code>1150-65535</code>
     * </p>
     * <p>
     * Default: The same port as the original DB cluster.
     * </p>
     * 
     * @return The port number on which the new DB cluster accepts connections.</p>
     *         <p>
     *         Constraints: Value must be <code>1150-65535</code>
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
     * Constraints: Value must be <code>1150-65535</code>
     * </p>
     * <p>
     * Default: The same port as the original DB cluster.
     * </p>
     * 
     * @param port
     *        The port number on which the new DB cluster accepts connections.</p>
     *        <p>
     *        Constraints: Value must be <code>1150-65535</code>
     *        </p>
     *        <p>
     *        Default: The same port as the original DB cluster.
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
     * Constraints: Must contain no more than 255 alphanumeric characters, periods, underscores, spaces, or hyphens.
     * Must not be default.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * 
     * @param dBSubnetGroupName
     *        The DB subnet group name to use for the new DB cluster.</p>
     *        <p>
     *        Constraints: Must contain no more than 255 alphanumeric characters, periods, underscores, spaces, or
     *        hyphens. Must not be default.
     *        </p>
     *        <p>
     *        Example: <code>mySubnetgroup</code>
     */

    public void setDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
    }

    /**
     * <p>
     * The DB subnet group name to use for the new DB cluster.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters, periods, underscores, spaces, or hyphens.
     * Must not be default.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * 
     * @return The DB subnet group name to use for the new DB cluster.</p>
     *         <p>
     *         Constraints: Must contain no more than 255 alphanumeric characters, periods, underscores, spaces, or
     *         hyphens. Must not be default.
     *         </p>
     *         <p>
     *         Example: <code>mySubnetgroup</code>
     */

    public String getDBSubnetGroupName() {
        return this.dBSubnetGroupName;
    }

    /**
     * <p>
     * The DB subnet group name to use for the new DB cluster.
     * </p>
     * <p>
     * Constraints: Must contain no more than 255 alphanumeric characters, periods, underscores, spaces, or hyphens.
     * Must not be default.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * 
     * @param dBSubnetGroupName
     *        The DB subnet group name to use for the new DB cluster.</p>
     *        <p>
     *        Constraints: Must contain no more than 255 alphanumeric characters, periods, underscores, spaces, or
     *        hyphens. Must not be default.
     *        </p>
     *        <p>
     *        Example: <code>mySubnetgroup</code>
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
     * 
     * @param optionGroupName
     *        The name of the option group for the new DB cluster.
     */

    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p>
     * The name of the option group for the new DB cluster.
     * </p>
     * 
     * @return The name of the option group for the new DB cluster.
     */

    public String getOptionGroupName() {
        return this.optionGroupName;
    }

    /**
     * <p>
     * The name of the option group for the new DB cluster.
     * </p>
     * 
     * @param optionGroupName
     *        The name of the option group for the new DB cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterToPointInTimeRequest withOptionGroupName(String optionGroupName) {
        setOptionGroupName(optionGroupName);
        return this;
    }

    /**
     * <p>
     * A lst of VPC security groups that the new DB cluster belongs to.
     * </p>
     * 
     * @return A lst of VPC security groups that the new DB cluster belongs to.
     */

    public java.util.List<String> getVpcSecurityGroupIds() {
        if (vpcSecurityGroupIds == null) {
            vpcSecurityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * A lst of VPC security groups that the new DB cluster belongs to.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A lst of VPC security groups that the new DB cluster belongs to.
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
     * A lst of VPC security groups that the new DB cluster belongs to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroupIds(java.util.Collection)} or {@link #withVpcSecurityGroupIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A lst of VPC security groups that the new DB cluster belongs to.
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
     * A lst of VPC security groups that the new DB cluster belongs to.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A lst of VPC security groups that the new DB cluster belongs to.
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
     * The KMS key identifier to use when restoring an encrypted DB cluster from an encrypted DB cluster.
     * </p>
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are restoring a DB
     * cluster with the same AWS account that owns the KMS encryption key used to encrypt the new DB cluster, then you
     * can use the KMS key alias instead of the ARN for the KMS encryption key.
     * </p>
     * <p>
     * You can restore to a new DB cluster and encrypt the new DB cluster with a KMS key that is different than the KMS
     * key used to encrypt the source DB cluster. The new DB cluster will be encrypted with the KMS key identified by
     * the <code>KmsKeyId</code> parameter.
     * </p>
     * <p>
     * If you do not specify a value for the <code>KmsKeyId</code> parameter, then the following will occur:
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
     * If the DB cluster is not encrypted, then the restored DB cluster is not encrypted.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>DBClusterIdentifier</code> refers to a DB cluster that is note encrypted, then the restore request is
     * rejected.
     * </p>
     * 
     * @param kmsKeyId
     *        The KMS key identifier to use when restoring an encrypted DB cluster from an encrypted DB cluster.</p>
     *        <p>
     *        The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are restoring
     *        a DB cluster with the same AWS account that owns the KMS encryption key used to encrypt the new DB
     *        cluster, then you can use the KMS key alias instead of the ARN for the KMS encryption key.
     *        </p>
     *        <p>
     *        You can restore to a new DB cluster and encrypt the new DB cluster with a KMS key that is different than
     *        the KMS key used to encrypt the source DB cluster. The new DB cluster will be encrypted with the KMS key
     *        identified by the <code>KmsKeyId</code> parameter.
     *        </p>
     *        <p>
     *        If you do not specify a value for the <code>KmsKeyId</code> parameter, then the following will occur:
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
     *        If the DB cluster is not encrypted, then the restored DB cluster is not encrypted.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If <code>DBClusterIdentifier</code> refers to a DB cluster that is note encrypted, then the restore
     *        request is rejected.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The KMS key identifier to use when restoring an encrypted DB cluster from an encrypted DB cluster.
     * </p>
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are restoring a DB
     * cluster with the same AWS account that owns the KMS encryption key used to encrypt the new DB cluster, then you
     * can use the KMS key alias instead of the ARN for the KMS encryption key.
     * </p>
     * <p>
     * You can restore to a new DB cluster and encrypt the new DB cluster with a KMS key that is different than the KMS
     * key used to encrypt the source DB cluster. The new DB cluster will be encrypted with the KMS key identified by
     * the <code>KmsKeyId</code> parameter.
     * </p>
     * <p>
     * If you do not specify a value for the <code>KmsKeyId</code> parameter, then the following will occur:
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
     * If the DB cluster is not encrypted, then the restored DB cluster is not encrypted.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>DBClusterIdentifier</code> refers to a DB cluster that is note encrypted, then the restore request is
     * rejected.
     * </p>
     * 
     * @return The KMS key identifier to use when restoring an encrypted DB cluster from an encrypted DB cluster.</p>
     *         <p>
     *         The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are restoring
     *         a DB cluster with the same AWS account that owns the KMS encryption key used to encrypt the new DB
     *         cluster, then you can use the KMS key alias instead of the ARN for the KMS encryption key.
     *         </p>
     *         <p>
     *         You can restore to a new DB cluster and encrypt the new DB cluster with a KMS key that is different than
     *         the KMS key used to encrypt the source DB cluster. The new DB cluster will be encrypted with the KMS key
     *         identified by the <code>KmsKeyId</code> parameter.
     *         </p>
     *         <p>
     *         If you do not specify a value for the <code>KmsKeyId</code> parameter, then the following will occur:
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
     *         If the DB cluster is not encrypted, then the restored DB cluster is not encrypted.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If <code>DBClusterIdentifier</code> refers to a DB cluster that is note encrypted, then the restore
     *         request is rejected.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The KMS key identifier to use when restoring an encrypted DB cluster from an encrypted DB cluster.
     * </p>
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are restoring a DB
     * cluster with the same AWS account that owns the KMS encryption key used to encrypt the new DB cluster, then you
     * can use the KMS key alias instead of the ARN for the KMS encryption key.
     * </p>
     * <p>
     * You can restore to a new DB cluster and encrypt the new DB cluster with a KMS key that is different than the KMS
     * key used to encrypt the source DB cluster. The new DB cluster will be encrypted with the KMS key identified by
     * the <code>KmsKeyId</code> parameter.
     * </p>
     * <p>
     * If you do not specify a value for the <code>KmsKeyId</code> parameter, then the following will occur:
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
     * If the DB cluster is not encrypted, then the restored DB cluster is not encrypted.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>DBClusterIdentifier</code> refers to a DB cluster that is note encrypted, then the restore request is
     * rejected.
     * </p>
     * 
     * @param kmsKeyId
     *        The KMS key identifier to use when restoring an encrypted DB cluster from an encrypted DB cluster.</p>
     *        <p>
     *        The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are restoring
     *        a DB cluster with the same AWS account that owns the KMS encryption key used to encrypt the new DB
     *        cluster, then you can use the KMS key alias instead of the ARN for the KMS encryption key.
     *        </p>
     *        <p>
     *        You can restore to a new DB cluster and encrypt the new DB cluster with a KMS key that is different than
     *        the KMS key used to encrypt the source DB cluster. The new DB cluster will be encrypted with the KMS key
     *        identified by the <code>KmsKeyId</code> parameter.
     *        </p>
     *        <p>
     *        If you do not specify a value for the <code>KmsKeyId</code> parameter, then the following will occur:
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
     *        If the DB cluster is not encrypted, then the restored DB cluster is not encrypted.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If <code>DBClusterIdentifier</code> refers to a DB cluster that is note encrypted, then the restore
     *        request is rejected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreDBClusterToPointInTimeRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("DBClusterIdentifier: " + getDBClusterIdentifier() + ",");
        if (getSourceDBClusterIdentifier() != null)
            sb.append("SourceDBClusterIdentifier: " + getSourceDBClusterIdentifier() + ",");
        if (getRestoreToTime() != null)
            sb.append("RestoreToTime: " + getRestoreToTime() + ",");
        if (getUseLatestRestorableTime() != null)
            sb.append("UseLatestRestorableTime: " + getUseLatestRestorableTime() + ",");
        if (getPort() != null)
            sb.append("Port: " + getPort() + ",");
        if (getDBSubnetGroupName() != null)
            sb.append("DBSubnetGroupName: " + getDBSubnetGroupName() + ",");
        if (getOptionGroupName() != null)
            sb.append("OptionGroupName: " + getOptionGroupName() + ",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: " + getVpcSecurityGroupIds() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSourceDBClusterIdentifier() == null) ? 0 : getSourceDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getRestoreToTime() == null) ? 0 : getRestoreToTime().hashCode());
        hashCode = prime * hashCode + ((getUseLatestRestorableTime() == null) ? 0 : getUseLatestRestorableTime().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getDBSubnetGroupName() == null) ? 0 : getDBSubnetGroupName().hashCode());
        hashCode = prime * hashCode + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public RestoreDBClusterToPointInTimeRequest clone() {
        return (RestoreDBClusterToPointInTimeRequest) super.clone();
    }
}
