/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Contains the details of a snapshot export to Amazon S3.
 * </p>
 * <p>
 * This data type is used as a response element in the <code>DescribeExportTasks</code> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CancelExportTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelExportTaskResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the snapshot export task. This ID isn't an identifier for the Amazon S3 bucket where the
     * snapshot is exported to.
     * </p>
     */
    private String exportTaskIdentifier;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot exported to Amazon S3.
     * </p>
     */
    private String sourceArn;
    /**
     * <p>
     * The data exported from the snapshot. Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>database</code> - Export all the data of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.table [table-name]</code> - Export a table of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.schema [schema-name]</code> - Export a database schema of the snapshot. This value isn't valid for
     * RDS for MySQL, RDS for MariaDB, or Aurora MySQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.schema.table [table-name]</code> - Export a table of the database schema. This value isn't valid
     * for RDS for MySQL, RDS for MariaDB, or Aurora MySQL.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<String> exportOnly;
    /**
     * <p>
     * The time that the snapshot was created.
     * </p>
     */
    private java.util.Date snapshotTime;
    /**
     * <p>
     * The time that the snapshot export task started.
     * </p>
     */
    private java.util.Date taskStartTime;
    /**
     * <p>
     * The time that the snapshot export task completed.
     * </p>
     */
    private java.util.Date taskEndTime;
    /**
     * <p>
     * The Amazon S3 bucket that the snapshot is exported to.
     * </p>
     */
    private String s3Bucket;
    /**
     * <p>
     * The Amazon S3 bucket prefix that is the file name and path of the exported snapshot.
     * </p>
     */
    private String s3Prefix;
    /**
     * <p>
     * The name of the IAM role that is used to write to Amazon S3 when exporting a snapshot.
     * </p>
     */
    private String iamRoleArn;
    /**
     * <p>
     * The ID of the AWS KMS key that is used to encrypt the snapshot when it's exported to Amazon S3. The KMS key ID is
     * the Amazon Resource Name (ARN), the KMS key identifier, or the KMS key alias for the KMS encryption key. The IAM
     * role used for the snapshot export must have encryption and decryption permissions to use this KMS key.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The progress status of the export task.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The progress of the snapshot export task as a percentage.
     * </p>
     */
    private Integer percentProgress;
    /**
     * <p>
     * The total amount of data exported, in gigabytes.
     * </p>
     */
    private Integer totalExtractedDataInGB;
    /**
     * <p>
     * The reason the export failed, if it failed.
     * </p>
     */
    private String failureCause;
    /**
     * <p>
     * A warning about the snapshot export task.
     * </p>
     */
    private String warningMessage;

    /**
     * <p>
     * A unique identifier for the snapshot export task. This ID isn't an identifier for the Amazon S3 bucket where the
     * snapshot is exported to.
     * </p>
     * 
     * @param exportTaskIdentifier
     *        A unique identifier for the snapshot export task. This ID isn't an identifier for the Amazon S3 bucket
     *        where the snapshot is exported to.
     */

    public void setExportTaskIdentifier(String exportTaskIdentifier) {
        this.exportTaskIdentifier = exportTaskIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the snapshot export task. This ID isn't an identifier for the Amazon S3 bucket where the
     * snapshot is exported to.
     * </p>
     * 
     * @return A unique identifier for the snapshot export task. This ID isn't an identifier for the Amazon S3 bucket
     *         where the snapshot is exported to.
     */

    public String getExportTaskIdentifier() {
        return this.exportTaskIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the snapshot export task. This ID isn't an identifier for the Amazon S3 bucket where the
     * snapshot is exported to.
     * </p>
     * 
     * @param exportTaskIdentifier
     *        A unique identifier for the snapshot export task. This ID isn't an identifier for the Amazon S3 bucket
     *        where the snapshot is exported to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelExportTaskResult withExportTaskIdentifier(String exportTaskIdentifier) {
        setExportTaskIdentifier(exportTaskIdentifier);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot exported to Amazon S3.
     * </p>
     * 
     * @param sourceArn
     *        The Amazon Resource Name (ARN) of the snapshot exported to Amazon S3.
     */

    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot exported to Amazon S3.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the snapshot exported to Amazon S3.
     */

    public String getSourceArn() {
        return this.sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot exported to Amazon S3.
     * </p>
     * 
     * @param sourceArn
     *        The Amazon Resource Name (ARN) of the snapshot exported to Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelExportTaskResult withSourceArn(String sourceArn) {
        setSourceArn(sourceArn);
        return this;
    }

    /**
     * <p>
     * The data exported from the snapshot. Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>database</code> - Export all the data of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.table [table-name]</code> - Export a table of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.schema [schema-name]</code> - Export a database schema of the snapshot. This value isn't valid for
     * RDS for MySQL, RDS for MariaDB, or Aurora MySQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.schema.table [table-name]</code> - Export a table of the database schema. This value isn't valid
     * for RDS for MySQL, RDS for MariaDB, or Aurora MySQL.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The data exported from the snapshot. Valid values are the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>database</code> - Export all the data of the snapshot.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>database.table [table-name]</code> - Export a table of the snapshot.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>database.schema [schema-name]</code> - Export a database schema of the snapshot. This value isn't
     *         valid for RDS for MySQL, RDS for MariaDB, or Aurora MySQL.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>database.schema.table [table-name]</code> - Export a table of the database schema. This value isn't
     *         valid for RDS for MySQL, RDS for MariaDB, or Aurora MySQL.
     *         </p>
     *         </li>
     */

    public java.util.List<String> getExportOnly() {
        if (exportOnly == null) {
            exportOnly = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return exportOnly;
    }

    /**
     * <p>
     * The data exported from the snapshot. Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>database</code> - Export all the data of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.table [table-name]</code> - Export a table of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.schema [schema-name]</code> - Export a database schema of the snapshot. This value isn't valid for
     * RDS for MySQL, RDS for MariaDB, or Aurora MySQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.schema.table [table-name]</code> - Export a table of the database schema. This value isn't valid
     * for RDS for MySQL, RDS for MariaDB, or Aurora MySQL.
     * </p>
     * </li>
     * </ul>
     * 
     * @param exportOnly
     *        The data exported from the snapshot. Valid values are the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>database</code> - Export all the data of the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>database.table [table-name]</code> - Export a table of the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>database.schema [schema-name]</code> - Export a database schema of the snapshot. This value isn't
     *        valid for RDS for MySQL, RDS for MariaDB, or Aurora MySQL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>database.schema.table [table-name]</code> - Export a table of the database schema. This value isn't
     *        valid for RDS for MySQL, RDS for MariaDB, or Aurora MySQL.
     *        </p>
     *        </li>
     */

    public void setExportOnly(java.util.Collection<String> exportOnly) {
        if (exportOnly == null) {
            this.exportOnly = null;
            return;
        }

        this.exportOnly = new com.amazonaws.internal.SdkInternalList<String>(exportOnly);
    }

    /**
     * <p>
     * The data exported from the snapshot. Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>database</code> - Export all the data of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.table [table-name]</code> - Export a table of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.schema [schema-name]</code> - Export a database schema of the snapshot. This value isn't valid for
     * RDS for MySQL, RDS for MariaDB, or Aurora MySQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.schema.table [table-name]</code> - Export a table of the database schema. This value isn't valid
     * for RDS for MySQL, RDS for MariaDB, or Aurora MySQL.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExportOnly(java.util.Collection)} or {@link #withExportOnly(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param exportOnly
     *        The data exported from the snapshot. Valid values are the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>database</code> - Export all the data of the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>database.table [table-name]</code> - Export a table of the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>database.schema [schema-name]</code> - Export a database schema of the snapshot. This value isn't
     *        valid for RDS for MySQL, RDS for MariaDB, or Aurora MySQL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>database.schema.table [table-name]</code> - Export a table of the database schema. This value isn't
     *        valid for RDS for MySQL, RDS for MariaDB, or Aurora MySQL.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelExportTaskResult withExportOnly(String... exportOnly) {
        if (this.exportOnly == null) {
            setExportOnly(new com.amazonaws.internal.SdkInternalList<String>(exportOnly.length));
        }
        for (String ele : exportOnly) {
            this.exportOnly.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The data exported from the snapshot. Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>database</code> - Export all the data of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.table [table-name]</code> - Export a table of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.schema [schema-name]</code> - Export a database schema of the snapshot. This value isn't valid for
     * RDS for MySQL, RDS for MariaDB, or Aurora MySQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.schema.table [table-name]</code> - Export a table of the database schema. This value isn't valid
     * for RDS for MySQL, RDS for MariaDB, or Aurora MySQL.
     * </p>
     * </li>
     * </ul>
     * 
     * @param exportOnly
     *        The data exported from the snapshot. Valid values are the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>database</code> - Export all the data of the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>database.table [table-name]</code> - Export a table of the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>database.schema [schema-name]</code> - Export a database schema of the snapshot. This value isn't
     *        valid for RDS for MySQL, RDS for MariaDB, or Aurora MySQL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>database.schema.table [table-name]</code> - Export a table of the database schema. This value isn't
     *        valid for RDS for MySQL, RDS for MariaDB, or Aurora MySQL.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelExportTaskResult withExportOnly(java.util.Collection<String> exportOnly) {
        setExportOnly(exportOnly);
        return this;
    }

    /**
     * <p>
     * The time that the snapshot was created.
     * </p>
     * 
     * @param snapshotTime
     *        The time that the snapshot was created.
     */

    public void setSnapshotTime(java.util.Date snapshotTime) {
        this.snapshotTime = snapshotTime;
    }

    /**
     * <p>
     * The time that the snapshot was created.
     * </p>
     * 
     * @return The time that the snapshot was created.
     */

    public java.util.Date getSnapshotTime() {
        return this.snapshotTime;
    }

    /**
     * <p>
     * The time that the snapshot was created.
     * </p>
     * 
     * @param snapshotTime
     *        The time that the snapshot was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelExportTaskResult withSnapshotTime(java.util.Date snapshotTime) {
        setSnapshotTime(snapshotTime);
        return this;
    }

    /**
     * <p>
     * The time that the snapshot export task started.
     * </p>
     * 
     * @param taskStartTime
     *        The time that the snapshot export task started.
     */

    public void setTaskStartTime(java.util.Date taskStartTime) {
        this.taskStartTime = taskStartTime;
    }

    /**
     * <p>
     * The time that the snapshot export task started.
     * </p>
     * 
     * @return The time that the snapshot export task started.
     */

    public java.util.Date getTaskStartTime() {
        return this.taskStartTime;
    }

    /**
     * <p>
     * The time that the snapshot export task started.
     * </p>
     * 
     * @param taskStartTime
     *        The time that the snapshot export task started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelExportTaskResult withTaskStartTime(java.util.Date taskStartTime) {
        setTaskStartTime(taskStartTime);
        return this;
    }

    /**
     * <p>
     * The time that the snapshot export task completed.
     * </p>
     * 
     * @param taskEndTime
     *        The time that the snapshot export task completed.
     */

    public void setTaskEndTime(java.util.Date taskEndTime) {
        this.taskEndTime = taskEndTime;
    }

    /**
     * <p>
     * The time that the snapshot export task completed.
     * </p>
     * 
     * @return The time that the snapshot export task completed.
     */

    public java.util.Date getTaskEndTime() {
        return this.taskEndTime;
    }

    /**
     * <p>
     * The time that the snapshot export task completed.
     * </p>
     * 
     * @param taskEndTime
     *        The time that the snapshot export task completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelExportTaskResult withTaskEndTime(java.util.Date taskEndTime) {
        setTaskEndTime(taskEndTime);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket that the snapshot is exported to.
     * </p>
     * 
     * @param s3Bucket
     *        The Amazon S3 bucket that the snapshot is exported to.
     */

    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket that the snapshot is exported to.
     * </p>
     * 
     * @return The Amazon S3 bucket that the snapshot is exported to.
     */

    public String getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket that the snapshot is exported to.
     * </p>
     * 
     * @param s3Bucket
     *        The Amazon S3 bucket that the snapshot is exported to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelExportTaskResult withS3Bucket(String s3Bucket) {
        setS3Bucket(s3Bucket);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket prefix that is the file name and path of the exported snapshot.
     * </p>
     * 
     * @param s3Prefix
     *        The Amazon S3 bucket prefix that is the file name and path of the exported snapshot.
     */

    public void setS3Prefix(String s3Prefix) {
        this.s3Prefix = s3Prefix;
    }

    /**
     * <p>
     * The Amazon S3 bucket prefix that is the file name and path of the exported snapshot.
     * </p>
     * 
     * @return The Amazon S3 bucket prefix that is the file name and path of the exported snapshot.
     */

    public String getS3Prefix() {
        return this.s3Prefix;
    }

    /**
     * <p>
     * The Amazon S3 bucket prefix that is the file name and path of the exported snapshot.
     * </p>
     * 
     * @param s3Prefix
     *        The Amazon S3 bucket prefix that is the file name and path of the exported snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelExportTaskResult withS3Prefix(String s3Prefix) {
        setS3Prefix(s3Prefix);
        return this;
    }

    /**
     * <p>
     * The name of the IAM role that is used to write to Amazon S3 when exporting a snapshot.
     * </p>
     * 
     * @param iamRoleArn
     *        The name of the IAM role that is used to write to Amazon S3 when exporting a snapshot.
     */

    public void setIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }

    /**
     * <p>
     * The name of the IAM role that is used to write to Amazon S3 when exporting a snapshot.
     * </p>
     * 
     * @return The name of the IAM role that is used to write to Amazon S3 when exporting a snapshot.
     */

    public String getIamRoleArn() {
        return this.iamRoleArn;
    }

    /**
     * <p>
     * The name of the IAM role that is used to write to Amazon S3 when exporting a snapshot.
     * </p>
     * 
     * @param iamRoleArn
     *        The name of the IAM role that is used to write to Amazon S3 when exporting a snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelExportTaskResult withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS KMS key that is used to encrypt the snapshot when it's exported to Amazon S3. The KMS key ID is
     * the Amazon Resource Name (ARN), the KMS key identifier, or the KMS key alias for the KMS encryption key. The IAM
     * role used for the snapshot export must have encryption and decryption permissions to use this KMS key.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the AWS KMS key that is used to encrypt the snapshot when it's exported to Amazon S3. The KMS
     *        key ID is the Amazon Resource Name (ARN), the KMS key identifier, or the KMS key alias for the KMS
     *        encryption key. The IAM role used for the snapshot export must have encryption and decryption permissions
     *        to use this KMS key.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ID of the AWS KMS key that is used to encrypt the snapshot when it's exported to Amazon S3. The KMS key ID is
     * the Amazon Resource Name (ARN), the KMS key identifier, or the KMS key alias for the KMS encryption key. The IAM
     * role used for the snapshot export must have encryption and decryption permissions to use this KMS key.
     * </p>
     * 
     * @return The ID of the AWS KMS key that is used to encrypt the snapshot when it's exported to Amazon S3. The KMS
     *         key ID is the Amazon Resource Name (ARN), the KMS key identifier, or the KMS key alias for the KMS
     *         encryption key. The IAM role used for the snapshot export must have encryption and decryption permissions
     *         to use this KMS key.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The ID of the AWS KMS key that is used to encrypt the snapshot when it's exported to Amazon S3. The KMS key ID is
     * the Amazon Resource Name (ARN), the KMS key identifier, or the KMS key alias for the KMS encryption key. The IAM
     * role used for the snapshot export must have encryption and decryption permissions to use this KMS key.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the AWS KMS key that is used to encrypt the snapshot when it's exported to Amazon S3. The KMS
     *        key ID is the Amazon Resource Name (ARN), the KMS key identifier, or the KMS key alias for the KMS
     *        encryption key. The IAM role used for the snapshot export must have encryption and decryption permissions
     *        to use this KMS key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelExportTaskResult withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The progress status of the export task.
     * </p>
     * 
     * @param status
     *        The progress status of the export task.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The progress status of the export task.
     * </p>
     * 
     * @return The progress status of the export task.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The progress status of the export task.
     * </p>
     * 
     * @param status
     *        The progress status of the export task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelExportTaskResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The progress of the snapshot export task as a percentage.
     * </p>
     * 
     * @param percentProgress
     *        The progress of the snapshot export task as a percentage.
     */

    public void setPercentProgress(Integer percentProgress) {
        this.percentProgress = percentProgress;
    }

    /**
     * <p>
     * The progress of the snapshot export task as a percentage.
     * </p>
     * 
     * @return The progress of the snapshot export task as a percentage.
     */

    public Integer getPercentProgress() {
        return this.percentProgress;
    }

    /**
     * <p>
     * The progress of the snapshot export task as a percentage.
     * </p>
     * 
     * @param percentProgress
     *        The progress of the snapshot export task as a percentage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelExportTaskResult withPercentProgress(Integer percentProgress) {
        setPercentProgress(percentProgress);
        return this;
    }

    /**
     * <p>
     * The total amount of data exported, in gigabytes.
     * </p>
     * 
     * @param totalExtractedDataInGB
     *        The total amount of data exported, in gigabytes.
     */

    public void setTotalExtractedDataInGB(Integer totalExtractedDataInGB) {
        this.totalExtractedDataInGB = totalExtractedDataInGB;
    }

    /**
     * <p>
     * The total amount of data exported, in gigabytes.
     * </p>
     * 
     * @return The total amount of data exported, in gigabytes.
     */

    public Integer getTotalExtractedDataInGB() {
        return this.totalExtractedDataInGB;
    }

    /**
     * <p>
     * The total amount of data exported, in gigabytes.
     * </p>
     * 
     * @param totalExtractedDataInGB
     *        The total amount of data exported, in gigabytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelExportTaskResult withTotalExtractedDataInGB(Integer totalExtractedDataInGB) {
        setTotalExtractedDataInGB(totalExtractedDataInGB);
        return this;
    }

    /**
     * <p>
     * The reason the export failed, if it failed.
     * </p>
     * 
     * @param failureCause
     *        The reason the export failed, if it failed.
     */

    public void setFailureCause(String failureCause) {
        this.failureCause = failureCause;
    }

    /**
     * <p>
     * The reason the export failed, if it failed.
     * </p>
     * 
     * @return The reason the export failed, if it failed.
     */

    public String getFailureCause() {
        return this.failureCause;
    }

    /**
     * <p>
     * The reason the export failed, if it failed.
     * </p>
     * 
     * @param failureCause
     *        The reason the export failed, if it failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelExportTaskResult withFailureCause(String failureCause) {
        setFailureCause(failureCause);
        return this;
    }

    /**
     * <p>
     * A warning about the snapshot export task.
     * </p>
     * 
     * @param warningMessage
     *        A warning about the snapshot export task.
     */

    public void setWarningMessage(String warningMessage) {
        this.warningMessage = warningMessage;
    }

    /**
     * <p>
     * A warning about the snapshot export task.
     * </p>
     * 
     * @return A warning about the snapshot export task.
     */

    public String getWarningMessage() {
        return this.warningMessage;
    }

    /**
     * <p>
     * A warning about the snapshot export task.
     * </p>
     * 
     * @param warningMessage
     *        A warning about the snapshot export task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelExportTaskResult withWarningMessage(String warningMessage) {
        setWarningMessage(warningMessage);
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
        if (getExportTaskIdentifier() != null)
            sb.append("ExportTaskIdentifier: ").append(getExportTaskIdentifier()).append(",");
        if (getSourceArn() != null)
            sb.append("SourceArn: ").append(getSourceArn()).append(",");
        if (getExportOnly() != null)
            sb.append("ExportOnly: ").append(getExportOnly()).append(",");
        if (getSnapshotTime() != null)
            sb.append("SnapshotTime: ").append(getSnapshotTime()).append(",");
        if (getTaskStartTime() != null)
            sb.append("TaskStartTime: ").append(getTaskStartTime()).append(",");
        if (getTaskEndTime() != null)
            sb.append("TaskEndTime: ").append(getTaskEndTime()).append(",");
        if (getS3Bucket() != null)
            sb.append("S3Bucket: ").append(getS3Bucket()).append(",");
        if (getS3Prefix() != null)
            sb.append("S3Prefix: ").append(getS3Prefix()).append(",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: ").append(getIamRoleArn()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getPercentProgress() != null)
            sb.append("PercentProgress: ").append(getPercentProgress()).append(",");
        if (getTotalExtractedDataInGB() != null)
            sb.append("TotalExtractedDataInGB: ").append(getTotalExtractedDataInGB()).append(",");
        if (getFailureCause() != null)
            sb.append("FailureCause: ").append(getFailureCause()).append(",");
        if (getWarningMessage() != null)
            sb.append("WarningMessage: ").append(getWarningMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelExportTaskResult == false)
            return false;
        CancelExportTaskResult other = (CancelExportTaskResult) obj;
        if (other.getExportTaskIdentifier() == null ^ this.getExportTaskIdentifier() == null)
            return false;
        if (other.getExportTaskIdentifier() != null && other.getExportTaskIdentifier().equals(this.getExportTaskIdentifier()) == false)
            return false;
        if (other.getSourceArn() == null ^ this.getSourceArn() == null)
            return false;
        if (other.getSourceArn() != null && other.getSourceArn().equals(this.getSourceArn()) == false)
            return false;
        if (other.getExportOnly() == null ^ this.getExportOnly() == null)
            return false;
        if (other.getExportOnly() != null && other.getExportOnly().equals(this.getExportOnly()) == false)
            return false;
        if (other.getSnapshotTime() == null ^ this.getSnapshotTime() == null)
            return false;
        if (other.getSnapshotTime() != null && other.getSnapshotTime().equals(this.getSnapshotTime()) == false)
            return false;
        if (other.getTaskStartTime() == null ^ this.getTaskStartTime() == null)
            return false;
        if (other.getTaskStartTime() != null && other.getTaskStartTime().equals(this.getTaskStartTime()) == false)
            return false;
        if (other.getTaskEndTime() == null ^ this.getTaskEndTime() == null)
            return false;
        if (other.getTaskEndTime() != null && other.getTaskEndTime().equals(this.getTaskEndTime()) == false)
            return false;
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getS3Prefix() == null ^ this.getS3Prefix() == null)
            return false;
        if (other.getS3Prefix() != null && other.getS3Prefix().equals(this.getS3Prefix()) == false)
            return false;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getPercentProgress() == null ^ this.getPercentProgress() == null)
            return false;
        if (other.getPercentProgress() != null && other.getPercentProgress().equals(this.getPercentProgress()) == false)
            return false;
        if (other.getTotalExtractedDataInGB() == null ^ this.getTotalExtractedDataInGB() == null)
            return false;
        if (other.getTotalExtractedDataInGB() != null && other.getTotalExtractedDataInGB().equals(this.getTotalExtractedDataInGB()) == false)
            return false;
        if (other.getFailureCause() == null ^ this.getFailureCause() == null)
            return false;
        if (other.getFailureCause() != null && other.getFailureCause().equals(this.getFailureCause()) == false)
            return false;
        if (other.getWarningMessage() == null ^ this.getWarningMessage() == null)
            return false;
        if (other.getWarningMessage() != null && other.getWarningMessage().equals(this.getWarningMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExportTaskIdentifier() == null) ? 0 : getExportTaskIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime * hashCode + ((getExportOnly() == null) ? 0 : getExportOnly().hashCode());
        hashCode = prime * hashCode + ((getSnapshotTime() == null) ? 0 : getSnapshotTime().hashCode());
        hashCode = prime * hashCode + ((getTaskStartTime() == null) ? 0 : getTaskStartTime().hashCode());
        hashCode = prime * hashCode + ((getTaskEndTime() == null) ? 0 : getTaskEndTime().hashCode());
        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getS3Prefix() == null) ? 0 : getS3Prefix().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getPercentProgress() == null) ? 0 : getPercentProgress().hashCode());
        hashCode = prime * hashCode + ((getTotalExtractedDataInGB() == null) ? 0 : getTotalExtractedDataInGB().hashCode());
        hashCode = prime * hashCode + ((getFailureCause() == null) ? 0 : getFailureCause().hashCode());
        hashCode = prime * hashCode + ((getWarningMessage() == null) ? 0 : getWarningMessage().hashCode());
        return hashCode;
    }

    @Override
    public CancelExportTaskResult clone() {
        try {
            return (CancelExportTaskResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
