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
package com.amazonaws.services.redshiftserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A snapshot object that contains databases.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/Snapshot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Snapshot implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * All of the Amazon Web Services accounts that have access to restore a snapshot to a provisioned cluster.
     * </p>
     */
    private java.util.List<String> accountsWithProvisionedRestoreAccess;
    /**
     * <p>
     * All of the Amazon Web Services accounts that have access to restore a snapshot to a namespace.
     * </p>
     */
    private java.util.List<String> accountsWithRestoreAccess;
    /**
     * <p>
     * The size of the incremental backup in megabytes.
     * </p>
     */
    private Double actualIncrementalBackupSizeInMegaBytes;
    /**
     * <p>
     * The username of the database within a snapshot.
     * </p>
     */
    private String adminUsername;
    /**
     * <p>
     * The size in megabytes of the data that has been backed up to a snapshot.
     * </p>
     */
    private Double backupProgressInMegaBytes;
    /**
     * <p>
     * The rate at which data is backed up into a snapshot in megabytes per second.
     * </p>
     */
    private Double currentBackupRateInMegaBytesPerSecond;
    /**
     * <p>
     * The amount of time it took to back up data into a snapshot.
     * </p>
     */
    private Long elapsedTimeInSeconds;
    /**
     * <p>
     * The estimated amount of seconds until the snapshot completes backup.
     * </p>
     */
    private Long estimatedSecondsToCompletion;
    /**
     * <p>
     * The unique identifier of the KMS key used to encrypt the snapshot.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the namespace the snapshot was created from.
     * </p>
     */
    private String namespaceArn;
    /**
     * <p>
     * The name of the namepsace.
     * </p>
     */
    private String namespaceName;
    /**
     * <p>
     * The owner Amazon Web Services; account of the snapshot.
     * </p>
     */
    private String ownerAccount;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot.
     * </p>
     */
    private String snapshotArn;
    /**
     * <p>
     * The timestamp of when the snapshot was created.
     * </p>
     */
    private java.util.Date snapshotCreateTime;
    /**
     * <p>
     * The name of the snapshot.
     * </p>
     */
    private String snapshotName;
    /**
     * <p>
     * The amount of days until the snapshot is deleted.
     * </p>
     */
    private Integer snapshotRemainingDays;
    /**
     * <p>
     * The period of time, in days, of how long the snapshot is retained.
     * </p>
     */
    private Integer snapshotRetentionPeriod;
    /**
     * <p>
     * The timestamp of when data within the snapshot started getting retained.
     * </p>
     */
    private java.util.Date snapshotRetentionStartTime;
    /**
     * <p>
     * The status of the snapshot.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The total size, in megabytes, of how big the snapshot is.
     * </p>
     */
    private Double totalBackupSizeInMegaBytes;

    /**
     * <p>
     * All of the Amazon Web Services accounts that have access to restore a snapshot to a provisioned cluster.
     * </p>
     * 
     * @return All of the Amazon Web Services accounts that have access to restore a snapshot to a provisioned cluster.
     */

    public java.util.List<String> getAccountsWithProvisionedRestoreAccess() {
        return accountsWithProvisionedRestoreAccess;
    }

    /**
     * <p>
     * All of the Amazon Web Services accounts that have access to restore a snapshot to a provisioned cluster.
     * </p>
     * 
     * @param accountsWithProvisionedRestoreAccess
     *        All of the Amazon Web Services accounts that have access to restore a snapshot to a provisioned cluster.
     */

    public void setAccountsWithProvisionedRestoreAccess(java.util.Collection<String> accountsWithProvisionedRestoreAccess) {
        if (accountsWithProvisionedRestoreAccess == null) {
            this.accountsWithProvisionedRestoreAccess = null;
            return;
        }

        this.accountsWithProvisionedRestoreAccess = new java.util.ArrayList<String>(accountsWithProvisionedRestoreAccess);
    }

    /**
     * <p>
     * All of the Amazon Web Services accounts that have access to restore a snapshot to a provisioned cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountsWithProvisionedRestoreAccess(java.util.Collection)} or
     * {@link #withAccountsWithProvisionedRestoreAccess(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param accountsWithProvisionedRestoreAccess
     *        All of the Amazon Web Services accounts that have access to restore a snapshot to a provisioned cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withAccountsWithProvisionedRestoreAccess(String... accountsWithProvisionedRestoreAccess) {
        if (this.accountsWithProvisionedRestoreAccess == null) {
            setAccountsWithProvisionedRestoreAccess(new java.util.ArrayList<String>(accountsWithProvisionedRestoreAccess.length));
        }
        for (String ele : accountsWithProvisionedRestoreAccess) {
            this.accountsWithProvisionedRestoreAccess.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * All of the Amazon Web Services accounts that have access to restore a snapshot to a provisioned cluster.
     * </p>
     * 
     * @param accountsWithProvisionedRestoreAccess
     *        All of the Amazon Web Services accounts that have access to restore a snapshot to a provisioned cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withAccountsWithProvisionedRestoreAccess(java.util.Collection<String> accountsWithProvisionedRestoreAccess) {
        setAccountsWithProvisionedRestoreAccess(accountsWithProvisionedRestoreAccess);
        return this;
    }

    /**
     * <p>
     * All of the Amazon Web Services accounts that have access to restore a snapshot to a namespace.
     * </p>
     * 
     * @return All of the Amazon Web Services accounts that have access to restore a snapshot to a namespace.
     */

    public java.util.List<String> getAccountsWithRestoreAccess() {
        return accountsWithRestoreAccess;
    }

    /**
     * <p>
     * All of the Amazon Web Services accounts that have access to restore a snapshot to a namespace.
     * </p>
     * 
     * @param accountsWithRestoreAccess
     *        All of the Amazon Web Services accounts that have access to restore a snapshot to a namespace.
     */

    public void setAccountsWithRestoreAccess(java.util.Collection<String> accountsWithRestoreAccess) {
        if (accountsWithRestoreAccess == null) {
            this.accountsWithRestoreAccess = null;
            return;
        }

        this.accountsWithRestoreAccess = new java.util.ArrayList<String>(accountsWithRestoreAccess);
    }

    /**
     * <p>
     * All of the Amazon Web Services accounts that have access to restore a snapshot to a namespace.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountsWithRestoreAccess(java.util.Collection)} or
     * {@link #withAccountsWithRestoreAccess(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param accountsWithRestoreAccess
     *        All of the Amazon Web Services accounts that have access to restore a snapshot to a namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withAccountsWithRestoreAccess(String... accountsWithRestoreAccess) {
        if (this.accountsWithRestoreAccess == null) {
            setAccountsWithRestoreAccess(new java.util.ArrayList<String>(accountsWithRestoreAccess.length));
        }
        for (String ele : accountsWithRestoreAccess) {
            this.accountsWithRestoreAccess.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * All of the Amazon Web Services accounts that have access to restore a snapshot to a namespace.
     * </p>
     * 
     * @param accountsWithRestoreAccess
     *        All of the Amazon Web Services accounts that have access to restore a snapshot to a namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withAccountsWithRestoreAccess(java.util.Collection<String> accountsWithRestoreAccess) {
        setAccountsWithRestoreAccess(accountsWithRestoreAccess);
        return this;
    }

    /**
     * <p>
     * The size of the incremental backup in megabytes.
     * </p>
     * 
     * @param actualIncrementalBackupSizeInMegaBytes
     *        The size of the incremental backup in megabytes.
     */

    public void setActualIncrementalBackupSizeInMegaBytes(Double actualIncrementalBackupSizeInMegaBytes) {
        this.actualIncrementalBackupSizeInMegaBytes = actualIncrementalBackupSizeInMegaBytes;
    }

    /**
     * <p>
     * The size of the incremental backup in megabytes.
     * </p>
     * 
     * @return The size of the incremental backup in megabytes.
     */

    public Double getActualIncrementalBackupSizeInMegaBytes() {
        return this.actualIncrementalBackupSizeInMegaBytes;
    }

    /**
     * <p>
     * The size of the incremental backup in megabytes.
     * </p>
     * 
     * @param actualIncrementalBackupSizeInMegaBytes
     *        The size of the incremental backup in megabytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withActualIncrementalBackupSizeInMegaBytes(Double actualIncrementalBackupSizeInMegaBytes) {
        setActualIncrementalBackupSizeInMegaBytes(actualIncrementalBackupSizeInMegaBytes);
        return this;
    }

    /**
     * <p>
     * The username of the database within a snapshot.
     * </p>
     * 
     * @param adminUsername
     *        The username of the database within a snapshot.
     */

    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
    }

    /**
     * <p>
     * The username of the database within a snapshot.
     * </p>
     * 
     * @return The username of the database within a snapshot.
     */

    public String getAdminUsername() {
        return this.adminUsername;
    }

    /**
     * <p>
     * The username of the database within a snapshot.
     * </p>
     * 
     * @param adminUsername
     *        The username of the database within a snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withAdminUsername(String adminUsername) {
        setAdminUsername(adminUsername);
        return this;
    }

    /**
     * <p>
     * The size in megabytes of the data that has been backed up to a snapshot.
     * </p>
     * 
     * @param backupProgressInMegaBytes
     *        The size in megabytes of the data that has been backed up to a snapshot.
     */

    public void setBackupProgressInMegaBytes(Double backupProgressInMegaBytes) {
        this.backupProgressInMegaBytes = backupProgressInMegaBytes;
    }

    /**
     * <p>
     * The size in megabytes of the data that has been backed up to a snapshot.
     * </p>
     * 
     * @return The size in megabytes of the data that has been backed up to a snapshot.
     */

    public Double getBackupProgressInMegaBytes() {
        return this.backupProgressInMegaBytes;
    }

    /**
     * <p>
     * The size in megabytes of the data that has been backed up to a snapshot.
     * </p>
     * 
     * @param backupProgressInMegaBytes
     *        The size in megabytes of the data that has been backed up to a snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withBackupProgressInMegaBytes(Double backupProgressInMegaBytes) {
        setBackupProgressInMegaBytes(backupProgressInMegaBytes);
        return this;
    }

    /**
     * <p>
     * The rate at which data is backed up into a snapshot in megabytes per second.
     * </p>
     * 
     * @param currentBackupRateInMegaBytesPerSecond
     *        The rate at which data is backed up into a snapshot in megabytes per second.
     */

    public void setCurrentBackupRateInMegaBytesPerSecond(Double currentBackupRateInMegaBytesPerSecond) {
        this.currentBackupRateInMegaBytesPerSecond = currentBackupRateInMegaBytesPerSecond;
    }

    /**
     * <p>
     * The rate at which data is backed up into a snapshot in megabytes per second.
     * </p>
     * 
     * @return The rate at which data is backed up into a snapshot in megabytes per second.
     */

    public Double getCurrentBackupRateInMegaBytesPerSecond() {
        return this.currentBackupRateInMegaBytesPerSecond;
    }

    /**
     * <p>
     * The rate at which data is backed up into a snapshot in megabytes per second.
     * </p>
     * 
     * @param currentBackupRateInMegaBytesPerSecond
     *        The rate at which data is backed up into a snapshot in megabytes per second.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withCurrentBackupRateInMegaBytesPerSecond(Double currentBackupRateInMegaBytesPerSecond) {
        setCurrentBackupRateInMegaBytesPerSecond(currentBackupRateInMegaBytesPerSecond);
        return this;
    }

    /**
     * <p>
     * The amount of time it took to back up data into a snapshot.
     * </p>
     * 
     * @param elapsedTimeInSeconds
     *        The amount of time it took to back up data into a snapshot.
     */

    public void setElapsedTimeInSeconds(Long elapsedTimeInSeconds) {
        this.elapsedTimeInSeconds = elapsedTimeInSeconds;
    }

    /**
     * <p>
     * The amount of time it took to back up data into a snapshot.
     * </p>
     * 
     * @return The amount of time it took to back up data into a snapshot.
     */

    public Long getElapsedTimeInSeconds() {
        return this.elapsedTimeInSeconds;
    }

    /**
     * <p>
     * The amount of time it took to back up data into a snapshot.
     * </p>
     * 
     * @param elapsedTimeInSeconds
     *        The amount of time it took to back up data into a snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withElapsedTimeInSeconds(Long elapsedTimeInSeconds) {
        setElapsedTimeInSeconds(elapsedTimeInSeconds);
        return this;
    }

    /**
     * <p>
     * The estimated amount of seconds until the snapshot completes backup.
     * </p>
     * 
     * @param estimatedSecondsToCompletion
     *        The estimated amount of seconds until the snapshot completes backup.
     */

    public void setEstimatedSecondsToCompletion(Long estimatedSecondsToCompletion) {
        this.estimatedSecondsToCompletion = estimatedSecondsToCompletion;
    }

    /**
     * <p>
     * The estimated amount of seconds until the snapshot completes backup.
     * </p>
     * 
     * @return The estimated amount of seconds until the snapshot completes backup.
     */

    public Long getEstimatedSecondsToCompletion() {
        return this.estimatedSecondsToCompletion;
    }

    /**
     * <p>
     * The estimated amount of seconds until the snapshot completes backup.
     * </p>
     * 
     * @param estimatedSecondsToCompletion
     *        The estimated amount of seconds until the snapshot completes backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withEstimatedSecondsToCompletion(Long estimatedSecondsToCompletion) {
        setEstimatedSecondsToCompletion(estimatedSecondsToCompletion);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the KMS key used to encrypt the snapshot.
     * </p>
     * 
     * @param kmsKeyId
     *        The unique identifier of the KMS key used to encrypt the snapshot.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The unique identifier of the KMS key used to encrypt the snapshot.
     * </p>
     * 
     * @return The unique identifier of the KMS key used to encrypt the snapshot.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The unique identifier of the KMS key used to encrypt the snapshot.
     * </p>
     * 
     * @param kmsKeyId
     *        The unique identifier of the KMS key used to encrypt the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the namespace the snapshot was created from.
     * </p>
     * 
     * @param namespaceArn
     *        The Amazon Resource Name (ARN) of the namespace the snapshot was created from.
     */

    public void setNamespaceArn(String namespaceArn) {
        this.namespaceArn = namespaceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the namespace the snapshot was created from.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the namespace the snapshot was created from.
     */

    public String getNamespaceArn() {
        return this.namespaceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the namespace the snapshot was created from.
     * </p>
     * 
     * @param namespaceArn
     *        The Amazon Resource Name (ARN) of the namespace the snapshot was created from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withNamespaceArn(String namespaceArn) {
        setNamespaceArn(namespaceArn);
        return this;
    }

    /**
     * <p>
     * The name of the namepsace.
     * </p>
     * 
     * @param namespaceName
     *        The name of the namepsace.
     */

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    /**
     * <p>
     * The name of the namepsace.
     * </p>
     * 
     * @return The name of the namepsace.
     */

    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * <p>
     * The name of the namepsace.
     * </p>
     * 
     * @param namespaceName
     *        The name of the namepsace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withNamespaceName(String namespaceName) {
        setNamespaceName(namespaceName);
        return this;
    }

    /**
     * <p>
     * The owner Amazon Web Services; account of the snapshot.
     * </p>
     * 
     * @param ownerAccount
     *        The owner Amazon Web Services; account of the snapshot.
     */

    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * The owner Amazon Web Services; account of the snapshot.
     * </p>
     * 
     * @return The owner Amazon Web Services; account of the snapshot.
     */

    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * <p>
     * The owner Amazon Web Services; account of the snapshot.
     * </p>
     * 
     * @param ownerAccount
     *        The owner Amazon Web Services; account of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withOwnerAccount(String ownerAccount) {
        setOwnerAccount(ownerAccount);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot.
     * </p>
     * 
     * @param snapshotArn
     *        The Amazon Resource Name (ARN) of the snapshot.
     */

    public void setSnapshotArn(String snapshotArn) {
        this.snapshotArn = snapshotArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the snapshot.
     */

    public String getSnapshotArn() {
        return this.snapshotArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot.
     * </p>
     * 
     * @param snapshotArn
     *        The Amazon Resource Name (ARN) of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withSnapshotArn(String snapshotArn) {
        setSnapshotArn(snapshotArn);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the snapshot was created.
     * </p>
     * 
     * @param snapshotCreateTime
     *        The timestamp of when the snapshot was created.
     */

    public void setSnapshotCreateTime(java.util.Date snapshotCreateTime) {
        this.snapshotCreateTime = snapshotCreateTime;
    }

    /**
     * <p>
     * The timestamp of when the snapshot was created.
     * </p>
     * 
     * @return The timestamp of when the snapshot was created.
     */

    public java.util.Date getSnapshotCreateTime() {
        return this.snapshotCreateTime;
    }

    /**
     * <p>
     * The timestamp of when the snapshot was created.
     * </p>
     * 
     * @param snapshotCreateTime
     *        The timestamp of when the snapshot was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withSnapshotCreateTime(java.util.Date snapshotCreateTime) {
        setSnapshotCreateTime(snapshotCreateTime);
        return this;
    }

    /**
     * <p>
     * The name of the snapshot.
     * </p>
     * 
     * @param snapshotName
     *        The name of the snapshot.
     */

    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }

    /**
     * <p>
     * The name of the snapshot.
     * </p>
     * 
     * @return The name of the snapshot.
     */

    public String getSnapshotName() {
        return this.snapshotName;
    }

    /**
     * <p>
     * The name of the snapshot.
     * </p>
     * 
     * @param snapshotName
     *        The name of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withSnapshotName(String snapshotName) {
        setSnapshotName(snapshotName);
        return this;
    }

    /**
     * <p>
     * The amount of days until the snapshot is deleted.
     * </p>
     * 
     * @param snapshotRemainingDays
     *        The amount of days until the snapshot is deleted.
     */

    public void setSnapshotRemainingDays(Integer snapshotRemainingDays) {
        this.snapshotRemainingDays = snapshotRemainingDays;
    }

    /**
     * <p>
     * The amount of days until the snapshot is deleted.
     * </p>
     * 
     * @return The amount of days until the snapshot is deleted.
     */

    public Integer getSnapshotRemainingDays() {
        return this.snapshotRemainingDays;
    }

    /**
     * <p>
     * The amount of days until the snapshot is deleted.
     * </p>
     * 
     * @param snapshotRemainingDays
     *        The amount of days until the snapshot is deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withSnapshotRemainingDays(Integer snapshotRemainingDays) {
        setSnapshotRemainingDays(snapshotRemainingDays);
        return this;
    }

    /**
     * <p>
     * The period of time, in days, of how long the snapshot is retained.
     * </p>
     * 
     * @param snapshotRetentionPeriod
     *        The period of time, in days, of how long the snapshot is retained.
     */

    public void setSnapshotRetentionPeriod(Integer snapshotRetentionPeriod) {
        this.snapshotRetentionPeriod = snapshotRetentionPeriod;
    }

    /**
     * <p>
     * The period of time, in days, of how long the snapshot is retained.
     * </p>
     * 
     * @return The period of time, in days, of how long the snapshot is retained.
     */

    public Integer getSnapshotRetentionPeriod() {
        return this.snapshotRetentionPeriod;
    }

    /**
     * <p>
     * The period of time, in days, of how long the snapshot is retained.
     * </p>
     * 
     * @param snapshotRetentionPeriod
     *        The period of time, in days, of how long the snapshot is retained.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withSnapshotRetentionPeriod(Integer snapshotRetentionPeriod) {
        setSnapshotRetentionPeriod(snapshotRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * The timestamp of when data within the snapshot started getting retained.
     * </p>
     * 
     * @param snapshotRetentionStartTime
     *        The timestamp of when data within the snapshot started getting retained.
     */

    public void setSnapshotRetentionStartTime(java.util.Date snapshotRetentionStartTime) {
        this.snapshotRetentionStartTime = snapshotRetentionStartTime;
    }

    /**
     * <p>
     * The timestamp of when data within the snapshot started getting retained.
     * </p>
     * 
     * @return The timestamp of when data within the snapshot started getting retained.
     */

    public java.util.Date getSnapshotRetentionStartTime() {
        return this.snapshotRetentionStartTime;
    }

    /**
     * <p>
     * The timestamp of when data within the snapshot started getting retained.
     * </p>
     * 
     * @param snapshotRetentionStartTime
     *        The timestamp of when data within the snapshot started getting retained.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withSnapshotRetentionStartTime(java.util.Date snapshotRetentionStartTime) {
        setSnapshotRetentionStartTime(snapshotRetentionStartTime);
        return this;
    }

    /**
     * <p>
     * The status of the snapshot.
     * </p>
     * 
     * @param status
     *        The status of the snapshot.
     * @see SnapshotStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the snapshot.
     * </p>
     * 
     * @return The status of the snapshot.
     * @see SnapshotStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the snapshot.
     * </p>
     * 
     * @param status
     *        The status of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapshotStatus
     */

    public Snapshot withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the snapshot.
     * </p>
     * 
     * @param status
     *        The status of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnapshotStatus
     */

    public Snapshot withStatus(SnapshotStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The total size, in megabytes, of how big the snapshot is.
     * </p>
     * 
     * @param totalBackupSizeInMegaBytes
     *        The total size, in megabytes, of how big the snapshot is.
     */

    public void setTotalBackupSizeInMegaBytes(Double totalBackupSizeInMegaBytes) {
        this.totalBackupSizeInMegaBytes = totalBackupSizeInMegaBytes;
    }

    /**
     * <p>
     * The total size, in megabytes, of how big the snapshot is.
     * </p>
     * 
     * @return The total size, in megabytes, of how big the snapshot is.
     */

    public Double getTotalBackupSizeInMegaBytes() {
        return this.totalBackupSizeInMegaBytes;
    }

    /**
     * <p>
     * The total size, in megabytes, of how big the snapshot is.
     * </p>
     * 
     * @param totalBackupSizeInMegaBytes
     *        The total size, in megabytes, of how big the snapshot is.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Snapshot withTotalBackupSizeInMegaBytes(Double totalBackupSizeInMegaBytes) {
        setTotalBackupSizeInMegaBytes(totalBackupSizeInMegaBytes);
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
        if (getAccountsWithProvisionedRestoreAccess() != null)
            sb.append("AccountsWithProvisionedRestoreAccess: ").append(getAccountsWithProvisionedRestoreAccess()).append(",");
        if (getAccountsWithRestoreAccess() != null)
            sb.append("AccountsWithRestoreAccess: ").append(getAccountsWithRestoreAccess()).append(",");
        if (getActualIncrementalBackupSizeInMegaBytes() != null)
            sb.append("ActualIncrementalBackupSizeInMegaBytes: ").append(getActualIncrementalBackupSizeInMegaBytes()).append(",");
        if (getAdminUsername() != null)
            sb.append("AdminUsername: ").append(getAdminUsername()).append(",");
        if (getBackupProgressInMegaBytes() != null)
            sb.append("BackupProgressInMegaBytes: ").append(getBackupProgressInMegaBytes()).append(",");
        if (getCurrentBackupRateInMegaBytesPerSecond() != null)
            sb.append("CurrentBackupRateInMegaBytesPerSecond: ").append(getCurrentBackupRateInMegaBytesPerSecond()).append(",");
        if (getElapsedTimeInSeconds() != null)
            sb.append("ElapsedTimeInSeconds: ").append(getElapsedTimeInSeconds()).append(",");
        if (getEstimatedSecondsToCompletion() != null)
            sb.append("EstimatedSecondsToCompletion: ").append(getEstimatedSecondsToCompletion()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getNamespaceArn() != null)
            sb.append("NamespaceArn: ").append(getNamespaceArn()).append(",");
        if (getNamespaceName() != null)
            sb.append("NamespaceName: ").append(getNamespaceName()).append(",");
        if (getOwnerAccount() != null)
            sb.append("OwnerAccount: ").append(getOwnerAccount()).append(",");
        if (getSnapshotArn() != null)
            sb.append("SnapshotArn: ").append(getSnapshotArn()).append(",");
        if (getSnapshotCreateTime() != null)
            sb.append("SnapshotCreateTime: ").append(getSnapshotCreateTime()).append(",");
        if (getSnapshotName() != null)
            sb.append("SnapshotName: ").append(getSnapshotName()).append(",");
        if (getSnapshotRemainingDays() != null)
            sb.append("SnapshotRemainingDays: ").append(getSnapshotRemainingDays()).append(",");
        if (getSnapshotRetentionPeriod() != null)
            sb.append("SnapshotRetentionPeriod: ").append(getSnapshotRetentionPeriod()).append(",");
        if (getSnapshotRetentionStartTime() != null)
            sb.append("SnapshotRetentionStartTime: ").append(getSnapshotRetentionStartTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTotalBackupSizeInMegaBytes() != null)
            sb.append("TotalBackupSizeInMegaBytes: ").append(getTotalBackupSizeInMegaBytes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Snapshot == false)
            return false;
        Snapshot other = (Snapshot) obj;
        if (other.getAccountsWithProvisionedRestoreAccess() == null ^ this.getAccountsWithProvisionedRestoreAccess() == null)
            return false;
        if (other.getAccountsWithProvisionedRestoreAccess() != null
                && other.getAccountsWithProvisionedRestoreAccess().equals(this.getAccountsWithProvisionedRestoreAccess()) == false)
            return false;
        if (other.getAccountsWithRestoreAccess() == null ^ this.getAccountsWithRestoreAccess() == null)
            return false;
        if (other.getAccountsWithRestoreAccess() != null && other.getAccountsWithRestoreAccess().equals(this.getAccountsWithRestoreAccess()) == false)
            return false;
        if (other.getActualIncrementalBackupSizeInMegaBytes() == null ^ this.getActualIncrementalBackupSizeInMegaBytes() == null)
            return false;
        if (other.getActualIncrementalBackupSizeInMegaBytes() != null
                && other.getActualIncrementalBackupSizeInMegaBytes().equals(this.getActualIncrementalBackupSizeInMegaBytes()) == false)
            return false;
        if (other.getAdminUsername() == null ^ this.getAdminUsername() == null)
            return false;
        if (other.getAdminUsername() != null && other.getAdminUsername().equals(this.getAdminUsername()) == false)
            return false;
        if (other.getBackupProgressInMegaBytes() == null ^ this.getBackupProgressInMegaBytes() == null)
            return false;
        if (other.getBackupProgressInMegaBytes() != null && other.getBackupProgressInMegaBytes().equals(this.getBackupProgressInMegaBytes()) == false)
            return false;
        if (other.getCurrentBackupRateInMegaBytesPerSecond() == null ^ this.getCurrentBackupRateInMegaBytesPerSecond() == null)
            return false;
        if (other.getCurrentBackupRateInMegaBytesPerSecond() != null
                && other.getCurrentBackupRateInMegaBytesPerSecond().equals(this.getCurrentBackupRateInMegaBytesPerSecond()) == false)
            return false;
        if (other.getElapsedTimeInSeconds() == null ^ this.getElapsedTimeInSeconds() == null)
            return false;
        if (other.getElapsedTimeInSeconds() != null && other.getElapsedTimeInSeconds().equals(this.getElapsedTimeInSeconds()) == false)
            return false;
        if (other.getEstimatedSecondsToCompletion() == null ^ this.getEstimatedSecondsToCompletion() == null)
            return false;
        if (other.getEstimatedSecondsToCompletion() != null && other.getEstimatedSecondsToCompletion().equals(this.getEstimatedSecondsToCompletion()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getNamespaceArn() == null ^ this.getNamespaceArn() == null)
            return false;
        if (other.getNamespaceArn() != null && other.getNamespaceArn().equals(this.getNamespaceArn()) == false)
            return false;
        if (other.getNamespaceName() == null ^ this.getNamespaceName() == null)
            return false;
        if (other.getNamespaceName() != null && other.getNamespaceName().equals(this.getNamespaceName()) == false)
            return false;
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null)
            return false;
        if (other.getOwnerAccount() != null && other.getOwnerAccount().equals(this.getOwnerAccount()) == false)
            return false;
        if (other.getSnapshotArn() == null ^ this.getSnapshotArn() == null)
            return false;
        if (other.getSnapshotArn() != null && other.getSnapshotArn().equals(this.getSnapshotArn()) == false)
            return false;
        if (other.getSnapshotCreateTime() == null ^ this.getSnapshotCreateTime() == null)
            return false;
        if (other.getSnapshotCreateTime() != null && other.getSnapshotCreateTime().equals(this.getSnapshotCreateTime()) == false)
            return false;
        if (other.getSnapshotName() == null ^ this.getSnapshotName() == null)
            return false;
        if (other.getSnapshotName() != null && other.getSnapshotName().equals(this.getSnapshotName()) == false)
            return false;
        if (other.getSnapshotRemainingDays() == null ^ this.getSnapshotRemainingDays() == null)
            return false;
        if (other.getSnapshotRemainingDays() != null && other.getSnapshotRemainingDays().equals(this.getSnapshotRemainingDays()) == false)
            return false;
        if (other.getSnapshotRetentionPeriod() == null ^ this.getSnapshotRetentionPeriod() == null)
            return false;
        if (other.getSnapshotRetentionPeriod() != null && other.getSnapshotRetentionPeriod().equals(this.getSnapshotRetentionPeriod()) == false)
            return false;
        if (other.getSnapshotRetentionStartTime() == null ^ this.getSnapshotRetentionStartTime() == null)
            return false;
        if (other.getSnapshotRetentionStartTime() != null && other.getSnapshotRetentionStartTime().equals(this.getSnapshotRetentionStartTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTotalBackupSizeInMegaBytes() == null ^ this.getTotalBackupSizeInMegaBytes() == null)
            return false;
        if (other.getTotalBackupSizeInMegaBytes() != null && other.getTotalBackupSizeInMegaBytes().equals(this.getTotalBackupSizeInMegaBytes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountsWithProvisionedRestoreAccess() == null) ? 0 : getAccountsWithProvisionedRestoreAccess().hashCode());
        hashCode = prime * hashCode + ((getAccountsWithRestoreAccess() == null) ? 0 : getAccountsWithRestoreAccess().hashCode());
        hashCode = prime * hashCode + ((getActualIncrementalBackupSizeInMegaBytes() == null) ? 0 : getActualIncrementalBackupSizeInMegaBytes().hashCode());
        hashCode = prime * hashCode + ((getAdminUsername() == null) ? 0 : getAdminUsername().hashCode());
        hashCode = prime * hashCode + ((getBackupProgressInMegaBytes() == null) ? 0 : getBackupProgressInMegaBytes().hashCode());
        hashCode = prime * hashCode + ((getCurrentBackupRateInMegaBytesPerSecond() == null) ? 0 : getCurrentBackupRateInMegaBytesPerSecond().hashCode());
        hashCode = prime * hashCode + ((getElapsedTimeInSeconds() == null) ? 0 : getElapsedTimeInSeconds().hashCode());
        hashCode = prime * hashCode + ((getEstimatedSecondsToCompletion() == null) ? 0 : getEstimatedSecondsToCompletion().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getNamespaceArn() == null) ? 0 : getNamespaceArn().hashCode());
        hashCode = prime * hashCode + ((getNamespaceName() == null) ? 0 : getNamespaceName().hashCode());
        hashCode = prime * hashCode + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode());
        hashCode = prime * hashCode + ((getSnapshotArn() == null) ? 0 : getSnapshotArn().hashCode());
        hashCode = prime * hashCode + ((getSnapshotCreateTime() == null) ? 0 : getSnapshotCreateTime().hashCode());
        hashCode = prime * hashCode + ((getSnapshotName() == null) ? 0 : getSnapshotName().hashCode());
        hashCode = prime * hashCode + ((getSnapshotRemainingDays() == null) ? 0 : getSnapshotRemainingDays().hashCode());
        hashCode = prime * hashCode + ((getSnapshotRetentionPeriod() == null) ? 0 : getSnapshotRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getSnapshotRetentionStartTime() == null) ? 0 : getSnapshotRetentionStartTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTotalBackupSizeInMegaBytes() == null) ? 0 : getTotalBackupSizeInMegaBytes().hashCode());
        return hashCode;
    }

    @Override
    public Snapshot clone() {
        try {
            return (Snapshot) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.redshiftserverless.model.transform.SnapshotMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
