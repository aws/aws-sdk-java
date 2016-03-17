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
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#restoreDBClusterToPointInTime(RestoreDBClusterToPointInTimeRequest) RestoreDBClusterToPointInTime operation}.
 * <p>
 * Restores a DB cluster to an arbitrary point in time. Users can
 * restore to any point in time before <code>LatestRestorableTime</code>
 * for up to <code>BackupRetentionPeriod</code> days. The target DB
 * cluster is created from the source DB cluster with the same
 * configuration as the original DB cluster, except that the new DB
 * cluster is created with the default DB security group.
 * </p>
 * <p>
 * For more information on Amazon Aurora, see
 * <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html"> Aurora on Amazon RDS </a>
 * in the <i>Amazon RDS User Guide.</i>
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#restoreDBClusterToPointInTime(RestoreDBClusterToPointInTimeRequest)
 */
public class RestoreDBClusterToPointInTimeRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name of the new DB cluster to be created. <p>Constraints: <ul>
     * <li>Must contain from 1 to 63 alphanumeric characters or hyphens</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul>
     */
    private String dBClusterIdentifier;

    /**
     * The identifier of the source DB cluster from which to restore.
     * <p>Constraints: <ul> <li>Must be the identifier of an existing
     * database instance</li> <li>Must contain from 1 to 63 alphanumeric
     * characters or hyphens</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * </ul>
     */
    private String sourceDBClusterIdentifier;

    /**
     * The date and time to restore the DB cluster to. <p>Valid Values: Value
     * must be a time in Universal Coordinated Time (UTC) format
     * <p>Constraints: <ul> <li>Must be before the latest restorable time for
     * the DB instance</li> <li>Cannot be specified if
     * <code>UseLatestRestorableTime</code> parameter is true</li> </ul>
     * <p>Example: <code>2015-03-07T23:45:00Z</code>
     */
    private java.util.Date restoreToTime;

    /**
     * A value that is set to <code>true</code> to restore the DB cluster to
     * the latest restorable backup time, and <code>false</code> otherwise.
     * <p>Default: <code>false</code> <p>Constraints: Cannot be specified if
     * <code>RestoreToTime</code> parameter is provided.
     */
    private Boolean useLatestRestorableTime;

    /**
     * The port number on which the new DB cluster accepts connections.
     * <p>Constraints: Value must be <code>1150-65535</code> <p>Default: The
     * same port as the original DB cluster.
     */
    private Integer port;

    /**
     * The DB subnet group name to use for the new DB cluster.
     * <p>Constraints: Must contain no more than 255 alphanumeric characters,
     * periods, underscores, spaces, or hyphens. Must not be default.
     * <p>Example: <code>mySubnetgroup</code>
     */
    private String dBSubnetGroupName;

    /**
     * The name of the option group for the new DB cluster.
     */
    private String optionGroupName;

    /**
     * A lst of VPC security groups that the new DB cluster belongs to.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> vpcSecurityGroupIds;

    /**
     * A list of tags.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The KMS key identifier to use when restoring an encrypted DB cluster
     * from an encrypted DB cluster. <p>The KMS key identifier is the Amazon
     * Resource Name (ARN) for the KMS encryption key. If you are restoring a
     * DB cluster with the same AWS account that owns the KMS encryption key
     * used to encrypt the new DB cluster, then you can use the KMS key alias
     * instead of the ARN for the KMS encryption key. <p>You can restore to a
     * new DB cluster and encrypt the new DB cluster with a KMS key that is
     * different than the KMS key used to encrypt the source DB cluster. The
     * new DB cluster will be encrypted with the KMS key identified by the
     * <code>KmsKeyId</code> parameter. <p>If you do not specify a value for
     * the <code>KmsKeyId</code> parameter, then the following will occur:
     * <ul> <li>If the DB cluster is encrypted, then the restored DB cluster
     * is encrypted using the KMS key that was used to encrypt the source DB
     * cluster.</li> </ul> <li>If the DB cluster is not encrypted, then the
     * restored DB cluster is not encrypted.</li> <p>If
     * <code>DBClusterIdentifier</code> refers to a DB cluster that is note
     * encrypted, then the restore request is rejected.
     */
    private String kmsKeyId;

    /**
     * The name of the new DB cluster to be created. <p>Constraints: <ul>
     * <li>Must contain from 1 to 63 alphanumeric characters or hyphens</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul>
     *
     * @return The name of the new DB cluster to be created. <p>Constraints: <ul>
     *         <li>Must contain from 1 to 63 alphanumeric characters or hyphens</li>
     *         <li>First character must be a letter</li> <li>Cannot end with a hyphen
     *         or contain two consecutive hyphens</li> </ul>
     */
    public String getDBClusterIdentifier() {
        return dBClusterIdentifier;
    }
    
    /**
     * The name of the new DB cluster to be created. <p>Constraints: <ul>
     * <li>Must contain from 1 to 63 alphanumeric characters or hyphens</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul>
     *
     * @param dBClusterIdentifier The name of the new DB cluster to be created. <p>Constraints: <ul>
     *         <li>Must contain from 1 to 63 alphanumeric characters or hyphens</li>
     *         <li>First character must be a letter</li> <li>Cannot end with a hyphen
     *         or contain two consecutive hyphens</li> </ul>
     */
    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }
    
    /**
     * The name of the new DB cluster to be created. <p>Constraints: <ul>
     * <li>Must contain from 1 to 63 alphanumeric characters or hyphens</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBClusterIdentifier The name of the new DB cluster to be created. <p>Constraints: <ul>
     *         <li>Must contain from 1 to 63 alphanumeric characters or hyphens</li>
     *         <li>First character must be a letter</li> <li>Cannot end with a hyphen
     *         or contain two consecutive hyphens</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreDBClusterToPointInTimeRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
        return this;
    }

    /**
     * The identifier of the source DB cluster from which to restore.
     * <p>Constraints: <ul> <li>Must be the identifier of an existing
     * database instance</li> <li>Must contain from 1 to 63 alphanumeric
     * characters or hyphens</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * </ul>
     *
     * @return The identifier of the source DB cluster from which to restore.
     *         <p>Constraints: <ul> <li>Must be the identifier of an existing
     *         database instance</li> <li>Must contain from 1 to 63 alphanumeric
     *         characters or hyphens</li> <li>First character must be a letter</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     *         </ul>
     */
    public String getSourceDBClusterIdentifier() {
        return sourceDBClusterIdentifier;
    }
    
    /**
     * The identifier of the source DB cluster from which to restore.
     * <p>Constraints: <ul> <li>Must be the identifier of an existing
     * database instance</li> <li>Must contain from 1 to 63 alphanumeric
     * characters or hyphens</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * </ul>
     *
     * @param sourceDBClusterIdentifier The identifier of the source DB cluster from which to restore.
     *         <p>Constraints: <ul> <li>Must be the identifier of an existing
     *         database instance</li> <li>Must contain from 1 to 63 alphanumeric
     *         characters or hyphens</li> <li>First character must be a letter</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     *         </ul>
     */
    public void setSourceDBClusterIdentifier(String sourceDBClusterIdentifier) {
        this.sourceDBClusterIdentifier = sourceDBClusterIdentifier;
    }
    
    /**
     * The identifier of the source DB cluster from which to restore.
     * <p>Constraints: <ul> <li>Must be the identifier of an existing
     * database instance</li> <li>Must contain from 1 to 63 alphanumeric
     * characters or hyphens</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceDBClusterIdentifier The identifier of the source DB cluster from which to restore.
     *         <p>Constraints: <ul> <li>Must be the identifier of an existing
     *         database instance</li> <li>Must contain from 1 to 63 alphanumeric
     *         characters or hyphens</li> <li>First character must be a letter</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     *         </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreDBClusterToPointInTimeRequest withSourceDBClusterIdentifier(String sourceDBClusterIdentifier) {
        this.sourceDBClusterIdentifier = sourceDBClusterIdentifier;
        return this;
    }

    /**
     * The date and time to restore the DB cluster to. <p>Valid Values: Value
     * must be a time in Universal Coordinated Time (UTC) format
     * <p>Constraints: <ul> <li>Must be before the latest restorable time for
     * the DB instance</li> <li>Cannot be specified if
     * <code>UseLatestRestorableTime</code> parameter is true</li> </ul>
     * <p>Example: <code>2015-03-07T23:45:00Z</code>
     *
     * @return The date and time to restore the DB cluster to. <p>Valid Values: Value
     *         must be a time in Universal Coordinated Time (UTC) format
     *         <p>Constraints: <ul> <li>Must be before the latest restorable time for
     *         the DB instance</li> <li>Cannot be specified if
     *         <code>UseLatestRestorableTime</code> parameter is true</li> </ul>
     *         <p>Example: <code>2015-03-07T23:45:00Z</code>
     */
    public java.util.Date getRestoreToTime() {
        return restoreToTime;
    }
    
    /**
     * The date and time to restore the DB cluster to. <p>Valid Values: Value
     * must be a time in Universal Coordinated Time (UTC) format
     * <p>Constraints: <ul> <li>Must be before the latest restorable time for
     * the DB instance</li> <li>Cannot be specified if
     * <code>UseLatestRestorableTime</code> parameter is true</li> </ul>
     * <p>Example: <code>2015-03-07T23:45:00Z</code>
     *
     * @param restoreToTime The date and time to restore the DB cluster to. <p>Valid Values: Value
     *         must be a time in Universal Coordinated Time (UTC) format
     *         <p>Constraints: <ul> <li>Must be before the latest restorable time for
     *         the DB instance</li> <li>Cannot be specified if
     *         <code>UseLatestRestorableTime</code> parameter is true</li> </ul>
     *         <p>Example: <code>2015-03-07T23:45:00Z</code>
     */
    public void setRestoreToTime(java.util.Date restoreToTime) {
        this.restoreToTime = restoreToTime;
    }
    
    /**
     * The date and time to restore the DB cluster to. <p>Valid Values: Value
     * must be a time in Universal Coordinated Time (UTC) format
     * <p>Constraints: <ul> <li>Must be before the latest restorable time for
     * the DB instance</li> <li>Cannot be specified if
     * <code>UseLatestRestorableTime</code> parameter is true</li> </ul>
     * <p>Example: <code>2015-03-07T23:45:00Z</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param restoreToTime The date and time to restore the DB cluster to. <p>Valid Values: Value
     *         must be a time in Universal Coordinated Time (UTC) format
     *         <p>Constraints: <ul> <li>Must be before the latest restorable time for
     *         the DB instance</li> <li>Cannot be specified if
     *         <code>UseLatestRestorableTime</code> parameter is true</li> </ul>
     *         <p>Example: <code>2015-03-07T23:45:00Z</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreDBClusterToPointInTimeRequest withRestoreToTime(java.util.Date restoreToTime) {
        this.restoreToTime = restoreToTime;
        return this;
    }

    /**
     * A value that is set to <code>true</code> to restore the DB cluster to
     * the latest restorable backup time, and <code>false</code> otherwise.
     * <p>Default: <code>false</code> <p>Constraints: Cannot be specified if
     * <code>RestoreToTime</code> parameter is provided.
     *
     * @return A value that is set to <code>true</code> to restore the DB cluster to
     *         the latest restorable backup time, and <code>false</code> otherwise.
     *         <p>Default: <code>false</code> <p>Constraints: Cannot be specified if
     *         <code>RestoreToTime</code> parameter is provided.
     */
    public Boolean isUseLatestRestorableTime() {
        return useLatestRestorableTime;
    }
    
    /**
     * A value that is set to <code>true</code> to restore the DB cluster to
     * the latest restorable backup time, and <code>false</code> otherwise.
     * <p>Default: <code>false</code> <p>Constraints: Cannot be specified if
     * <code>RestoreToTime</code> parameter is provided.
     *
     * @param useLatestRestorableTime A value that is set to <code>true</code> to restore the DB cluster to
     *         the latest restorable backup time, and <code>false</code> otherwise.
     *         <p>Default: <code>false</code> <p>Constraints: Cannot be specified if
     *         <code>RestoreToTime</code> parameter is provided.
     */
    public void setUseLatestRestorableTime(Boolean useLatestRestorableTime) {
        this.useLatestRestorableTime = useLatestRestorableTime;
    }
    
    /**
     * A value that is set to <code>true</code> to restore the DB cluster to
     * the latest restorable backup time, and <code>false</code> otherwise.
     * <p>Default: <code>false</code> <p>Constraints: Cannot be specified if
     * <code>RestoreToTime</code> parameter is provided.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param useLatestRestorableTime A value that is set to <code>true</code> to restore the DB cluster to
     *         the latest restorable backup time, and <code>false</code> otherwise.
     *         <p>Default: <code>false</code> <p>Constraints: Cannot be specified if
     *         <code>RestoreToTime</code> parameter is provided.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreDBClusterToPointInTimeRequest withUseLatestRestorableTime(Boolean useLatestRestorableTime) {
        this.useLatestRestorableTime = useLatestRestorableTime;
        return this;
    }

    /**
     * A value that is set to <code>true</code> to restore the DB cluster to
     * the latest restorable backup time, and <code>false</code> otherwise.
     * <p>Default: <code>false</code> <p>Constraints: Cannot be specified if
     * <code>RestoreToTime</code> parameter is provided.
     *
     * @return A value that is set to <code>true</code> to restore the DB cluster to
     *         the latest restorable backup time, and <code>false</code> otherwise.
     *         <p>Default: <code>false</code> <p>Constraints: Cannot be specified if
     *         <code>RestoreToTime</code> parameter is provided.
     */
    public Boolean getUseLatestRestorableTime() {
        return useLatestRestorableTime;
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
    public RestoreDBClusterToPointInTimeRequest withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * The DB subnet group name to use for the new DB cluster.
     * <p>Constraints: Must contain no more than 255 alphanumeric characters,
     * periods, underscores, spaces, or hyphens. Must not be default.
     * <p>Example: <code>mySubnetgroup</code>
     *
     * @return The DB subnet group name to use for the new DB cluster.
     *         <p>Constraints: Must contain no more than 255 alphanumeric characters,
     *         periods, underscores, spaces, or hyphens. Must not be default.
     *         <p>Example: <code>mySubnetgroup</code>
     */
    public String getDBSubnetGroupName() {
        return dBSubnetGroupName;
    }
    
    /**
     * The DB subnet group name to use for the new DB cluster.
     * <p>Constraints: Must contain no more than 255 alphanumeric characters,
     * periods, underscores, spaces, or hyphens. Must not be default.
     * <p>Example: <code>mySubnetgroup</code>
     *
     * @param dBSubnetGroupName The DB subnet group name to use for the new DB cluster.
     *         <p>Constraints: Must contain no more than 255 alphanumeric characters,
     *         periods, underscores, spaces, or hyphens. Must not be default.
     *         <p>Example: <code>mySubnetgroup</code>
     */
    public void setDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
    }
    
    /**
     * The DB subnet group name to use for the new DB cluster.
     * <p>Constraints: Must contain no more than 255 alphanumeric characters,
     * periods, underscores, spaces, or hyphens. Must not be default.
     * <p>Example: <code>mySubnetgroup</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSubnetGroupName The DB subnet group name to use for the new DB cluster.
     *         <p>Constraints: Must contain no more than 255 alphanumeric characters,
     *         periods, underscores, spaces, or hyphens. Must not be default.
     *         <p>Example: <code>mySubnetgroup</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreDBClusterToPointInTimeRequest withDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
        return this;
    }

    /**
     * The name of the option group for the new DB cluster.
     *
     * @return The name of the option group for the new DB cluster.
     */
    public String getOptionGroupName() {
        return optionGroupName;
    }
    
    /**
     * The name of the option group for the new DB cluster.
     *
     * @param optionGroupName The name of the option group for the new DB cluster.
     */
    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }
    
    /**
     * The name of the option group for the new DB cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionGroupName The name of the option group for the new DB cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreDBClusterToPointInTimeRequest withOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
        return this;
    }

    /**
     * A lst of VPC security groups that the new DB cluster belongs to.
     *
     * @return A lst of VPC security groups that the new DB cluster belongs to.
     */
    public java.util.List<String> getVpcSecurityGroupIds() {
        if (vpcSecurityGroupIds == null) {
              vpcSecurityGroupIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              vpcSecurityGroupIds.setAutoConstruct(true);
        }
        return vpcSecurityGroupIds;
    }
    
    /**
     * A lst of VPC security groups that the new DB cluster belongs to.
     *
     * @param vpcSecurityGroupIds A lst of VPC security groups that the new DB cluster belongs to.
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
     * A lst of VPC security groups that the new DB cluster belongs to.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setVpcSecurityGroupIds(java.util.Collection)} or
     * {@link #withVpcSecurityGroupIds(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcSecurityGroupIds A lst of VPC security groups that the new DB cluster belongs to.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreDBClusterToPointInTimeRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
        if (getVpcSecurityGroupIds() == null) setVpcSecurityGroupIds(new java.util.ArrayList<String>(vpcSecurityGroupIds.length));
        for (String value : vpcSecurityGroupIds) {
            getVpcSecurityGroupIds().add(value);
        }
        return this;
    }
    
    /**
     * A lst of VPC security groups that the new DB cluster belongs to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcSecurityGroupIds A lst of VPC security groups that the new DB cluster belongs to.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreDBClusterToPointInTimeRequest withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
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
    public RestoreDBClusterToPointInTimeRequest withTags(Tag... tags) {
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
    public RestoreDBClusterToPointInTimeRequest withTags(java.util.Collection<Tag> tags) {
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
     * from an encrypted DB cluster. <p>The KMS key identifier is the Amazon
     * Resource Name (ARN) for the KMS encryption key. If you are restoring a
     * DB cluster with the same AWS account that owns the KMS encryption key
     * used to encrypt the new DB cluster, then you can use the KMS key alias
     * instead of the ARN for the KMS encryption key. <p>You can restore to a
     * new DB cluster and encrypt the new DB cluster with a KMS key that is
     * different than the KMS key used to encrypt the source DB cluster. The
     * new DB cluster will be encrypted with the KMS key identified by the
     * <code>KmsKeyId</code> parameter. <p>If you do not specify a value for
     * the <code>KmsKeyId</code> parameter, then the following will occur:
     * <ul> <li>If the DB cluster is encrypted, then the restored DB cluster
     * is encrypted using the KMS key that was used to encrypt the source DB
     * cluster.</li> </ul> <li>If the DB cluster is not encrypted, then the
     * restored DB cluster is not encrypted.</li> <p>If
     * <code>DBClusterIdentifier</code> refers to a DB cluster that is note
     * encrypted, then the restore request is rejected.
     *
     * @return The KMS key identifier to use when restoring an encrypted DB cluster
     *         from an encrypted DB cluster. <p>The KMS key identifier is the Amazon
     *         Resource Name (ARN) for the KMS encryption key. If you are restoring a
     *         DB cluster with the same AWS account that owns the KMS encryption key
     *         used to encrypt the new DB cluster, then you can use the KMS key alias
     *         instead of the ARN for the KMS encryption key. <p>You can restore to a
     *         new DB cluster and encrypt the new DB cluster with a KMS key that is
     *         different than the KMS key used to encrypt the source DB cluster. The
     *         new DB cluster will be encrypted with the KMS key identified by the
     *         <code>KmsKeyId</code> parameter. <p>If you do not specify a value for
     *         the <code>KmsKeyId</code> parameter, then the following will occur:
     *         <ul> <li>If the DB cluster is encrypted, then the restored DB cluster
     *         is encrypted using the KMS key that was used to encrypt the source DB
     *         cluster.</li> </ul> <li>If the DB cluster is not encrypted, then the
     *         restored DB cluster is not encrypted.</li> <p>If
     *         <code>DBClusterIdentifier</code> refers to a DB cluster that is note
     *         encrypted, then the restore request is rejected.
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }
    
    /**
     * The KMS key identifier to use when restoring an encrypted DB cluster
     * from an encrypted DB cluster. <p>The KMS key identifier is the Amazon
     * Resource Name (ARN) for the KMS encryption key. If you are restoring a
     * DB cluster with the same AWS account that owns the KMS encryption key
     * used to encrypt the new DB cluster, then you can use the KMS key alias
     * instead of the ARN for the KMS encryption key. <p>You can restore to a
     * new DB cluster and encrypt the new DB cluster with a KMS key that is
     * different than the KMS key used to encrypt the source DB cluster. The
     * new DB cluster will be encrypted with the KMS key identified by the
     * <code>KmsKeyId</code> parameter. <p>If you do not specify a value for
     * the <code>KmsKeyId</code> parameter, then the following will occur:
     * <ul> <li>If the DB cluster is encrypted, then the restored DB cluster
     * is encrypted using the KMS key that was used to encrypt the source DB
     * cluster.</li> </ul> <li>If the DB cluster is not encrypted, then the
     * restored DB cluster is not encrypted.</li> <p>If
     * <code>DBClusterIdentifier</code> refers to a DB cluster that is note
     * encrypted, then the restore request is rejected.
     *
     * @param kmsKeyId The KMS key identifier to use when restoring an encrypted DB cluster
     *         from an encrypted DB cluster. <p>The KMS key identifier is the Amazon
     *         Resource Name (ARN) for the KMS encryption key. If you are restoring a
     *         DB cluster with the same AWS account that owns the KMS encryption key
     *         used to encrypt the new DB cluster, then you can use the KMS key alias
     *         instead of the ARN for the KMS encryption key. <p>You can restore to a
     *         new DB cluster and encrypt the new DB cluster with a KMS key that is
     *         different than the KMS key used to encrypt the source DB cluster. The
     *         new DB cluster will be encrypted with the KMS key identified by the
     *         <code>KmsKeyId</code> parameter. <p>If you do not specify a value for
     *         the <code>KmsKeyId</code> parameter, then the following will occur:
     *         <ul> <li>If the DB cluster is encrypted, then the restored DB cluster
     *         is encrypted using the KMS key that was used to encrypt the source DB
     *         cluster.</li> </ul> <li>If the DB cluster is not encrypted, then the
     *         restored DB cluster is not encrypted.</li> <p>If
     *         <code>DBClusterIdentifier</code> refers to a DB cluster that is note
     *         encrypted, then the restore request is rejected.
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }
    
    /**
     * The KMS key identifier to use when restoring an encrypted DB cluster
     * from an encrypted DB cluster. <p>The KMS key identifier is the Amazon
     * Resource Name (ARN) for the KMS encryption key. If you are restoring a
     * DB cluster with the same AWS account that owns the KMS encryption key
     * used to encrypt the new DB cluster, then you can use the KMS key alias
     * instead of the ARN for the KMS encryption key. <p>You can restore to a
     * new DB cluster and encrypt the new DB cluster with a KMS key that is
     * different than the KMS key used to encrypt the source DB cluster. The
     * new DB cluster will be encrypted with the KMS key identified by the
     * <code>KmsKeyId</code> parameter. <p>If you do not specify a value for
     * the <code>KmsKeyId</code> parameter, then the following will occur:
     * <ul> <li>If the DB cluster is encrypted, then the restored DB cluster
     * is encrypted using the KMS key that was used to encrypt the source DB
     * cluster.</li> </ul> <li>If the DB cluster is not encrypted, then the
     * restored DB cluster is not encrypted.</li> <p>If
     * <code>DBClusterIdentifier</code> refers to a DB cluster that is note
     * encrypted, then the restore request is rejected.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param kmsKeyId The KMS key identifier to use when restoring an encrypted DB cluster
     *         from an encrypted DB cluster. <p>The KMS key identifier is the Amazon
     *         Resource Name (ARN) for the KMS encryption key. If you are restoring a
     *         DB cluster with the same AWS account that owns the KMS encryption key
     *         used to encrypt the new DB cluster, then you can use the KMS key alias
     *         instead of the ARN for the KMS encryption key. <p>You can restore to a
     *         new DB cluster and encrypt the new DB cluster with a KMS key that is
     *         different than the KMS key used to encrypt the source DB cluster. The
     *         new DB cluster will be encrypted with the KMS key identified by the
     *         <code>KmsKeyId</code> parameter. <p>If you do not specify a value for
     *         the <code>KmsKeyId</code> parameter, then the following will occur:
     *         <ul> <li>If the DB cluster is encrypted, then the restored DB cluster
     *         is encrypted using the KMS key that was used to encrypt the source DB
     *         cluster.</li> </ul> <li>If the DB cluster is not encrypted, then the
     *         restored DB cluster is not encrypted.</li> <p>If
     *         <code>DBClusterIdentifier</code> refers to a DB cluster that is note
     *         encrypted, then the restore request is rejected.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RestoreDBClusterToPointInTimeRequest withKmsKeyId(String kmsKeyId) {
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
        if (getDBClusterIdentifier() != null) sb.append("DBClusterIdentifier: " + getDBClusterIdentifier() + ",");
        if (getSourceDBClusterIdentifier() != null) sb.append("SourceDBClusterIdentifier: " + getSourceDBClusterIdentifier() + ",");
        if (getRestoreToTime() != null) sb.append("RestoreToTime: " + getRestoreToTime() + ",");
        if (isUseLatestRestorableTime() != null) sb.append("UseLatestRestorableTime: " + isUseLatestRestorableTime() + ",");
        if (getPort() != null) sb.append("Port: " + getPort() + ",");
        if (getDBSubnetGroupName() != null) sb.append("DBSubnetGroupName: " + getDBSubnetGroupName() + ",");
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
        
        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getSourceDBClusterIdentifier() == null) ? 0 : getSourceDBClusterIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getRestoreToTime() == null) ? 0 : getRestoreToTime().hashCode()); 
        hashCode = prime * hashCode + ((isUseLatestRestorableTime() == null) ? 0 : isUseLatestRestorableTime().hashCode()); 
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode()); 
        hashCode = prime * hashCode + ((getDBSubnetGroupName() == null) ? 0 : getDBSubnetGroupName().hashCode()); 
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

        if (obj instanceof RestoreDBClusterToPointInTimeRequest == false) return false;
        RestoreDBClusterToPointInTimeRequest other = (RestoreDBClusterToPointInTimeRequest)obj;
        
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null) return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false) return false; 
        if (other.getSourceDBClusterIdentifier() == null ^ this.getSourceDBClusterIdentifier() == null) return false;
        if (other.getSourceDBClusterIdentifier() != null && other.getSourceDBClusterIdentifier().equals(this.getSourceDBClusterIdentifier()) == false) return false; 
        if (other.getRestoreToTime() == null ^ this.getRestoreToTime() == null) return false;
        if (other.getRestoreToTime() != null && other.getRestoreToTime().equals(this.getRestoreToTime()) == false) return false; 
        if (other.isUseLatestRestorableTime() == null ^ this.isUseLatestRestorableTime() == null) return false;
        if (other.isUseLatestRestorableTime() != null && other.isUseLatestRestorableTime().equals(this.isUseLatestRestorableTime()) == false) return false; 
        if (other.getPort() == null ^ this.getPort() == null) return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false) return false; 
        if (other.getDBSubnetGroupName() == null ^ this.getDBSubnetGroupName() == null) return false;
        if (other.getDBSubnetGroupName() != null && other.getDBSubnetGroupName().equals(this.getDBSubnetGroupName()) == false) return false; 
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
    public RestoreDBClusterToPointInTimeRequest clone() {
        
            return (RestoreDBClusterToPointInTimeRequest) super.clone();
    }

}
    