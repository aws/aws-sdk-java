/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the properties of the exported table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ExportDescription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the table export.
     * </p>
     */
    private String exportArn;
    /**
     * <p>
     * Export can be in one of the following states: IN_PROGRESS, COMPLETED, or FAILED.
     * </p>
     */
    private String exportStatus;
    /**
     * <p>
     * The time at which the export task began.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The time at which the export task completed.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The name of the manifest file for the export task.
     * </p>
     */
    private String exportManifest;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the table that was exported.
     * </p>
     */
    private String tableArn;
    /**
     * <p>
     * Unique ID of the table that was exported.
     * </p>
     */
    private String tableId;
    /**
     * <p>
     * Point in time from which table data was exported.
     * </p>
     */
    private java.util.Date exportTime;
    /**
     * <p>
     * The client token that was provided for the export task. A client token makes calls to
     * <code>ExportTableToPointInTimeInput</code> idempotent, meaning that multiple identical calls have the same effect
     * as one single call.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The name of the Amazon S3 bucket containing the export.
     * </p>
     */
    private String s3Bucket;
    /**
     * <p>
     * The ID of the AWS account that owns the bucket containing the export.
     * </p>
     */
    private String s3BucketOwner;
    /**
     * <p>
     * The Amazon S3 bucket prefix used as the file name and path of the exported snapshot.
     * </p>
     */
    private String s3Prefix;
    /**
     * <p>
     * Type of encryption used on the bucket where export data is stored. Valid values for <code>S3SseAlgorithm</code>
     * are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AES256</code> - server-side encryption with Amazon S3 managed keys
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS</code> - server-side encryption with AWS KMS managed keys
     * </p>
     * </li>
     * </ul>
     */
    private String s3SseAlgorithm;
    /**
     * <p>
     * The ID of the AWS KMS managed key used to encrypt the S3 bucket where export data is stored (if applicable).
     * </p>
     */
    private String s3SseKmsKeyId;
    /**
     * <p>
     * Status code for the result of the failed export.
     * </p>
     */
    private String failureCode;
    /**
     * <p>
     * Export failure reason description.
     * </p>
     */
    private String failureMessage;
    /**
     * <p>
     * The format of the exported data. Valid values for <code>ExportFormat</code> are <code>DYNAMODB_JSON</code> or
     * <code>ION</code>.
     * </p>
     */
    private String exportFormat;
    /**
     * <p>
     * The billable size of the table export.
     * </p>
     */
    private Long billedSizeBytes;
    /**
     * <p>
     * The number of items exported.
     * </p>
     */
    private Long itemCount;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the table export.
     * </p>
     * 
     * @param exportArn
     *        The Amazon Resource Name (ARN) of the table export.
     */

    public void setExportArn(String exportArn) {
        this.exportArn = exportArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the table export.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the table export.
     */

    public String getExportArn() {
        return this.exportArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the table export.
     * </p>
     * 
     * @param exportArn
     *        The Amazon Resource Name (ARN) of the table export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportDescription withExportArn(String exportArn) {
        setExportArn(exportArn);
        return this;
    }

    /**
     * <p>
     * Export can be in one of the following states: IN_PROGRESS, COMPLETED, or FAILED.
     * </p>
     * 
     * @param exportStatus
     *        Export can be in one of the following states: IN_PROGRESS, COMPLETED, or FAILED.
     * @see ExportStatus
     */

    public void setExportStatus(String exportStatus) {
        this.exportStatus = exportStatus;
    }

    /**
     * <p>
     * Export can be in one of the following states: IN_PROGRESS, COMPLETED, or FAILED.
     * </p>
     * 
     * @return Export can be in one of the following states: IN_PROGRESS, COMPLETED, or FAILED.
     * @see ExportStatus
     */

    public String getExportStatus() {
        return this.exportStatus;
    }

    /**
     * <p>
     * Export can be in one of the following states: IN_PROGRESS, COMPLETED, or FAILED.
     * </p>
     * 
     * @param exportStatus
     *        Export can be in one of the following states: IN_PROGRESS, COMPLETED, or FAILED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportStatus
     */

    public ExportDescription withExportStatus(String exportStatus) {
        setExportStatus(exportStatus);
        return this;
    }

    /**
     * <p>
     * Export can be in one of the following states: IN_PROGRESS, COMPLETED, or FAILED.
     * </p>
     * 
     * @param exportStatus
     *        Export can be in one of the following states: IN_PROGRESS, COMPLETED, or FAILED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportStatus
     */

    public ExportDescription withExportStatus(ExportStatus exportStatus) {
        this.exportStatus = exportStatus.toString();
        return this;
    }

    /**
     * <p>
     * The time at which the export task began.
     * </p>
     * 
     * @param startTime
     *        The time at which the export task began.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time at which the export task began.
     * </p>
     * 
     * @return The time at which the export task began.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time at which the export task began.
     * </p>
     * 
     * @param startTime
     *        The time at which the export task began.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportDescription withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The time at which the export task completed.
     * </p>
     * 
     * @param endTime
     *        The time at which the export task completed.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time at which the export task completed.
     * </p>
     * 
     * @return The time at which the export task completed.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time at which the export task completed.
     * </p>
     * 
     * @param endTime
     *        The time at which the export task completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportDescription withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The name of the manifest file for the export task.
     * </p>
     * 
     * @param exportManifest
     *        The name of the manifest file for the export task.
     */

    public void setExportManifest(String exportManifest) {
        this.exportManifest = exportManifest;
    }

    /**
     * <p>
     * The name of the manifest file for the export task.
     * </p>
     * 
     * @return The name of the manifest file for the export task.
     */

    public String getExportManifest() {
        return this.exportManifest;
    }

    /**
     * <p>
     * The name of the manifest file for the export task.
     * </p>
     * 
     * @param exportManifest
     *        The name of the manifest file for the export task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportDescription withExportManifest(String exportManifest) {
        setExportManifest(exportManifest);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the table that was exported.
     * </p>
     * 
     * @param tableArn
     *        The Amazon Resource Name (ARN) of the table that was exported.
     */

    public void setTableArn(String tableArn) {
        this.tableArn = tableArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the table that was exported.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the table that was exported.
     */

    public String getTableArn() {
        return this.tableArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the table that was exported.
     * </p>
     * 
     * @param tableArn
     *        The Amazon Resource Name (ARN) of the table that was exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportDescription withTableArn(String tableArn) {
        setTableArn(tableArn);
        return this;
    }

    /**
     * <p>
     * Unique ID of the table that was exported.
     * </p>
     * 
     * @param tableId
     *        Unique ID of the table that was exported.
     */

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    /**
     * <p>
     * Unique ID of the table that was exported.
     * </p>
     * 
     * @return Unique ID of the table that was exported.
     */

    public String getTableId() {
        return this.tableId;
    }

    /**
     * <p>
     * Unique ID of the table that was exported.
     * </p>
     * 
     * @param tableId
     *        Unique ID of the table that was exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportDescription withTableId(String tableId) {
        setTableId(tableId);
        return this;
    }

    /**
     * <p>
     * Point in time from which table data was exported.
     * </p>
     * 
     * @param exportTime
     *        Point in time from which table data was exported.
     */

    public void setExportTime(java.util.Date exportTime) {
        this.exportTime = exportTime;
    }

    /**
     * <p>
     * Point in time from which table data was exported.
     * </p>
     * 
     * @return Point in time from which table data was exported.
     */

    public java.util.Date getExportTime() {
        return this.exportTime;
    }

    /**
     * <p>
     * Point in time from which table data was exported.
     * </p>
     * 
     * @param exportTime
     *        Point in time from which table data was exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportDescription withExportTime(java.util.Date exportTime) {
        setExportTime(exportTime);
        return this;
    }

    /**
     * <p>
     * The client token that was provided for the export task. A client token makes calls to
     * <code>ExportTableToPointInTimeInput</code> idempotent, meaning that multiple identical calls have the same effect
     * as one single call.
     * </p>
     * 
     * @param clientToken
     *        The client token that was provided for the export task. A client token makes calls to
     *        <code>ExportTableToPointInTimeInput</code> idempotent, meaning that multiple identical calls have the same
     *        effect as one single call.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The client token that was provided for the export task. A client token makes calls to
     * <code>ExportTableToPointInTimeInput</code> idempotent, meaning that multiple identical calls have the same effect
     * as one single call.
     * </p>
     * 
     * @return The client token that was provided for the export task. A client token makes calls to
     *         <code>ExportTableToPointInTimeInput</code> idempotent, meaning that multiple identical calls have the
     *         same effect as one single call.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The client token that was provided for the export task. A client token makes calls to
     * <code>ExportTableToPointInTimeInput</code> idempotent, meaning that multiple identical calls have the same effect
     * as one single call.
     * </p>
     * 
     * @param clientToken
     *        The client token that was provided for the export task. A client token makes calls to
     *        <code>ExportTableToPointInTimeInput</code> idempotent, meaning that multiple identical calls have the same
     *        effect as one single call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportDescription withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket containing the export.
     * </p>
     * 
     * @param s3Bucket
     *        The name of the Amazon S3 bucket containing the export.
     */

    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket containing the export.
     * </p>
     * 
     * @return The name of the Amazon S3 bucket containing the export.
     */

    public String getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket containing the export.
     * </p>
     * 
     * @param s3Bucket
     *        The name of the Amazon S3 bucket containing the export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportDescription withS3Bucket(String s3Bucket) {
        setS3Bucket(s3Bucket);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the bucket containing the export.
     * </p>
     * 
     * @param s3BucketOwner
     *        The ID of the AWS account that owns the bucket containing the export.
     */

    public void setS3BucketOwner(String s3BucketOwner) {
        this.s3BucketOwner = s3BucketOwner;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the bucket containing the export.
     * </p>
     * 
     * @return The ID of the AWS account that owns the bucket containing the export.
     */

    public String getS3BucketOwner() {
        return this.s3BucketOwner;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the bucket containing the export.
     * </p>
     * 
     * @param s3BucketOwner
     *        The ID of the AWS account that owns the bucket containing the export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportDescription withS3BucketOwner(String s3BucketOwner) {
        setS3BucketOwner(s3BucketOwner);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket prefix used as the file name and path of the exported snapshot.
     * </p>
     * 
     * @param s3Prefix
     *        The Amazon S3 bucket prefix used as the file name and path of the exported snapshot.
     */

    public void setS3Prefix(String s3Prefix) {
        this.s3Prefix = s3Prefix;
    }

    /**
     * <p>
     * The Amazon S3 bucket prefix used as the file name and path of the exported snapshot.
     * </p>
     * 
     * @return The Amazon S3 bucket prefix used as the file name and path of the exported snapshot.
     */

    public String getS3Prefix() {
        return this.s3Prefix;
    }

    /**
     * <p>
     * The Amazon S3 bucket prefix used as the file name and path of the exported snapshot.
     * </p>
     * 
     * @param s3Prefix
     *        The Amazon S3 bucket prefix used as the file name and path of the exported snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportDescription withS3Prefix(String s3Prefix) {
        setS3Prefix(s3Prefix);
        return this;
    }

    /**
     * <p>
     * Type of encryption used on the bucket where export data is stored. Valid values for <code>S3SseAlgorithm</code>
     * are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AES256</code> - server-side encryption with Amazon S3 managed keys
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS</code> - server-side encryption with AWS KMS managed keys
     * </p>
     * </li>
     * </ul>
     * 
     * @param s3SseAlgorithm
     *        Type of encryption used on the bucket where export data is stored. Valid values for
     *        <code>S3SseAlgorithm</code> are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AES256</code> - server-side encryption with Amazon S3 managed keys
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KMS</code> - server-side encryption with AWS KMS managed keys
     *        </p>
     *        </li>
     * @see S3SseAlgorithm
     */

    public void setS3SseAlgorithm(String s3SseAlgorithm) {
        this.s3SseAlgorithm = s3SseAlgorithm;
    }

    /**
     * <p>
     * Type of encryption used on the bucket where export data is stored. Valid values for <code>S3SseAlgorithm</code>
     * are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AES256</code> - server-side encryption with Amazon S3 managed keys
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS</code> - server-side encryption with AWS KMS managed keys
     * </p>
     * </li>
     * </ul>
     * 
     * @return Type of encryption used on the bucket where export data is stored. Valid values for
     *         <code>S3SseAlgorithm</code> are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AES256</code> - server-side encryption with Amazon S3 managed keys
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>KMS</code> - server-side encryption with AWS KMS managed keys
     *         </p>
     *         </li>
     * @see S3SseAlgorithm
     */

    public String getS3SseAlgorithm() {
        return this.s3SseAlgorithm;
    }

    /**
     * <p>
     * Type of encryption used on the bucket where export data is stored. Valid values for <code>S3SseAlgorithm</code>
     * are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AES256</code> - server-side encryption with Amazon S3 managed keys
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS</code> - server-side encryption with AWS KMS managed keys
     * </p>
     * </li>
     * </ul>
     * 
     * @param s3SseAlgorithm
     *        Type of encryption used on the bucket where export data is stored. Valid values for
     *        <code>S3SseAlgorithm</code> are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AES256</code> - server-side encryption with Amazon S3 managed keys
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KMS</code> - server-side encryption with AWS KMS managed keys
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3SseAlgorithm
     */

    public ExportDescription withS3SseAlgorithm(String s3SseAlgorithm) {
        setS3SseAlgorithm(s3SseAlgorithm);
        return this;
    }

    /**
     * <p>
     * Type of encryption used on the bucket where export data is stored. Valid values for <code>S3SseAlgorithm</code>
     * are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AES256</code> - server-side encryption with Amazon S3 managed keys
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS</code> - server-side encryption with AWS KMS managed keys
     * </p>
     * </li>
     * </ul>
     * 
     * @param s3SseAlgorithm
     *        Type of encryption used on the bucket where export data is stored. Valid values for
     *        <code>S3SseAlgorithm</code> are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AES256</code> - server-side encryption with Amazon S3 managed keys
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KMS</code> - server-side encryption with AWS KMS managed keys
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3SseAlgorithm
     */

    public ExportDescription withS3SseAlgorithm(S3SseAlgorithm s3SseAlgorithm) {
        this.s3SseAlgorithm = s3SseAlgorithm.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the AWS KMS managed key used to encrypt the S3 bucket where export data is stored (if applicable).
     * </p>
     * 
     * @param s3SseKmsKeyId
     *        The ID of the AWS KMS managed key used to encrypt the S3 bucket where export data is stored (if
     *        applicable).
     */

    public void setS3SseKmsKeyId(String s3SseKmsKeyId) {
        this.s3SseKmsKeyId = s3SseKmsKeyId;
    }

    /**
     * <p>
     * The ID of the AWS KMS managed key used to encrypt the S3 bucket where export data is stored (if applicable).
     * </p>
     * 
     * @return The ID of the AWS KMS managed key used to encrypt the S3 bucket where export data is stored (if
     *         applicable).
     */

    public String getS3SseKmsKeyId() {
        return this.s3SseKmsKeyId;
    }

    /**
     * <p>
     * The ID of the AWS KMS managed key used to encrypt the S3 bucket where export data is stored (if applicable).
     * </p>
     * 
     * @param s3SseKmsKeyId
     *        The ID of the AWS KMS managed key used to encrypt the S3 bucket where export data is stored (if
     *        applicable).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportDescription withS3SseKmsKeyId(String s3SseKmsKeyId) {
        setS3SseKmsKeyId(s3SseKmsKeyId);
        return this;
    }

    /**
     * <p>
     * Status code for the result of the failed export.
     * </p>
     * 
     * @param failureCode
     *        Status code for the result of the failed export.
     */

    public void setFailureCode(String failureCode) {
        this.failureCode = failureCode;
    }

    /**
     * <p>
     * Status code for the result of the failed export.
     * </p>
     * 
     * @return Status code for the result of the failed export.
     */

    public String getFailureCode() {
        return this.failureCode;
    }

    /**
     * <p>
     * Status code for the result of the failed export.
     * </p>
     * 
     * @param failureCode
     *        Status code for the result of the failed export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportDescription withFailureCode(String failureCode) {
        setFailureCode(failureCode);
        return this;
    }

    /**
     * <p>
     * Export failure reason description.
     * </p>
     * 
     * @param failureMessage
     *        Export failure reason description.
     */

    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }

    /**
     * <p>
     * Export failure reason description.
     * </p>
     * 
     * @return Export failure reason description.
     */

    public String getFailureMessage() {
        return this.failureMessage;
    }

    /**
     * <p>
     * Export failure reason description.
     * </p>
     * 
     * @param failureMessage
     *        Export failure reason description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportDescription withFailureMessage(String failureMessage) {
        setFailureMessage(failureMessage);
        return this;
    }

    /**
     * <p>
     * The format of the exported data. Valid values for <code>ExportFormat</code> are <code>DYNAMODB_JSON</code> or
     * <code>ION</code>.
     * </p>
     * 
     * @param exportFormat
     *        The format of the exported data. Valid values for <code>ExportFormat</code> are <code>DYNAMODB_JSON</code>
     *        or <code>ION</code>.
     * @see ExportFormat
     */

    public void setExportFormat(String exportFormat) {
        this.exportFormat = exportFormat;
    }

    /**
     * <p>
     * The format of the exported data. Valid values for <code>ExportFormat</code> are <code>DYNAMODB_JSON</code> or
     * <code>ION</code>.
     * </p>
     * 
     * @return The format of the exported data. Valid values for <code>ExportFormat</code> are
     *         <code>DYNAMODB_JSON</code> or <code>ION</code>.
     * @see ExportFormat
     */

    public String getExportFormat() {
        return this.exportFormat;
    }

    /**
     * <p>
     * The format of the exported data. Valid values for <code>ExportFormat</code> are <code>DYNAMODB_JSON</code> or
     * <code>ION</code>.
     * </p>
     * 
     * @param exportFormat
     *        The format of the exported data. Valid values for <code>ExportFormat</code> are <code>DYNAMODB_JSON</code>
     *        or <code>ION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportFormat
     */

    public ExportDescription withExportFormat(String exportFormat) {
        setExportFormat(exportFormat);
        return this;
    }

    /**
     * <p>
     * The format of the exported data. Valid values for <code>ExportFormat</code> are <code>DYNAMODB_JSON</code> or
     * <code>ION</code>.
     * </p>
     * 
     * @param exportFormat
     *        The format of the exported data. Valid values for <code>ExportFormat</code> are <code>DYNAMODB_JSON</code>
     *        or <code>ION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportFormat
     */

    public ExportDescription withExportFormat(ExportFormat exportFormat) {
        this.exportFormat = exportFormat.toString();
        return this;
    }

    /**
     * <p>
     * The billable size of the table export.
     * </p>
     * 
     * @param billedSizeBytes
     *        The billable size of the table export.
     */

    public void setBilledSizeBytes(Long billedSizeBytes) {
        this.billedSizeBytes = billedSizeBytes;
    }

    /**
     * <p>
     * The billable size of the table export.
     * </p>
     * 
     * @return The billable size of the table export.
     */

    public Long getBilledSizeBytes() {
        return this.billedSizeBytes;
    }

    /**
     * <p>
     * The billable size of the table export.
     * </p>
     * 
     * @param billedSizeBytes
     *        The billable size of the table export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportDescription withBilledSizeBytes(Long billedSizeBytes) {
        setBilledSizeBytes(billedSizeBytes);
        return this;
    }

    /**
     * <p>
     * The number of items exported.
     * </p>
     * 
     * @param itemCount
     *        The number of items exported.
     */

    public void setItemCount(Long itemCount) {
        this.itemCount = itemCount;
    }

    /**
     * <p>
     * The number of items exported.
     * </p>
     * 
     * @return The number of items exported.
     */

    public Long getItemCount() {
        return this.itemCount;
    }

    /**
     * <p>
     * The number of items exported.
     * </p>
     * 
     * @param itemCount
     *        The number of items exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportDescription withItemCount(Long itemCount) {
        setItemCount(itemCount);
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
        if (getExportArn() != null)
            sb.append("ExportArn: ").append(getExportArn()).append(",");
        if (getExportStatus() != null)
            sb.append("ExportStatus: ").append(getExportStatus()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getExportManifest() != null)
            sb.append("ExportManifest: ").append(getExportManifest()).append(",");
        if (getTableArn() != null)
            sb.append("TableArn: ").append(getTableArn()).append(",");
        if (getTableId() != null)
            sb.append("TableId: ").append(getTableId()).append(",");
        if (getExportTime() != null)
            sb.append("ExportTime: ").append(getExportTime()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getS3Bucket() != null)
            sb.append("S3Bucket: ").append(getS3Bucket()).append(",");
        if (getS3BucketOwner() != null)
            sb.append("S3BucketOwner: ").append(getS3BucketOwner()).append(",");
        if (getS3Prefix() != null)
            sb.append("S3Prefix: ").append(getS3Prefix()).append(",");
        if (getS3SseAlgorithm() != null)
            sb.append("S3SseAlgorithm: ").append(getS3SseAlgorithm()).append(",");
        if (getS3SseKmsKeyId() != null)
            sb.append("S3SseKmsKeyId: ").append(getS3SseKmsKeyId()).append(",");
        if (getFailureCode() != null)
            sb.append("FailureCode: ").append(getFailureCode()).append(",");
        if (getFailureMessage() != null)
            sb.append("FailureMessage: ").append(getFailureMessage()).append(",");
        if (getExportFormat() != null)
            sb.append("ExportFormat: ").append(getExportFormat()).append(",");
        if (getBilledSizeBytes() != null)
            sb.append("BilledSizeBytes: ").append(getBilledSizeBytes()).append(",");
        if (getItemCount() != null)
            sb.append("ItemCount: ").append(getItemCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportDescription == false)
            return false;
        ExportDescription other = (ExportDescription) obj;
        if (other.getExportArn() == null ^ this.getExportArn() == null)
            return false;
        if (other.getExportArn() != null && other.getExportArn().equals(this.getExportArn()) == false)
            return false;
        if (other.getExportStatus() == null ^ this.getExportStatus() == null)
            return false;
        if (other.getExportStatus() != null && other.getExportStatus().equals(this.getExportStatus()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getExportManifest() == null ^ this.getExportManifest() == null)
            return false;
        if (other.getExportManifest() != null && other.getExportManifest().equals(this.getExportManifest()) == false)
            return false;
        if (other.getTableArn() == null ^ this.getTableArn() == null)
            return false;
        if (other.getTableArn() != null && other.getTableArn().equals(this.getTableArn()) == false)
            return false;
        if (other.getTableId() == null ^ this.getTableId() == null)
            return false;
        if (other.getTableId() != null && other.getTableId().equals(this.getTableId()) == false)
            return false;
        if (other.getExportTime() == null ^ this.getExportTime() == null)
            return false;
        if (other.getExportTime() != null && other.getExportTime().equals(this.getExportTime()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getS3Bucket() == null ^ this.getS3Bucket() == null)
            return false;
        if (other.getS3Bucket() != null && other.getS3Bucket().equals(this.getS3Bucket()) == false)
            return false;
        if (other.getS3BucketOwner() == null ^ this.getS3BucketOwner() == null)
            return false;
        if (other.getS3BucketOwner() != null && other.getS3BucketOwner().equals(this.getS3BucketOwner()) == false)
            return false;
        if (other.getS3Prefix() == null ^ this.getS3Prefix() == null)
            return false;
        if (other.getS3Prefix() != null && other.getS3Prefix().equals(this.getS3Prefix()) == false)
            return false;
        if (other.getS3SseAlgorithm() == null ^ this.getS3SseAlgorithm() == null)
            return false;
        if (other.getS3SseAlgorithm() != null && other.getS3SseAlgorithm().equals(this.getS3SseAlgorithm()) == false)
            return false;
        if (other.getS3SseKmsKeyId() == null ^ this.getS3SseKmsKeyId() == null)
            return false;
        if (other.getS3SseKmsKeyId() != null && other.getS3SseKmsKeyId().equals(this.getS3SseKmsKeyId()) == false)
            return false;
        if (other.getFailureCode() == null ^ this.getFailureCode() == null)
            return false;
        if (other.getFailureCode() != null && other.getFailureCode().equals(this.getFailureCode()) == false)
            return false;
        if (other.getFailureMessage() == null ^ this.getFailureMessage() == null)
            return false;
        if (other.getFailureMessage() != null && other.getFailureMessage().equals(this.getFailureMessage()) == false)
            return false;
        if (other.getExportFormat() == null ^ this.getExportFormat() == null)
            return false;
        if (other.getExportFormat() != null && other.getExportFormat().equals(this.getExportFormat()) == false)
            return false;
        if (other.getBilledSizeBytes() == null ^ this.getBilledSizeBytes() == null)
            return false;
        if (other.getBilledSizeBytes() != null && other.getBilledSizeBytes().equals(this.getBilledSizeBytes()) == false)
            return false;
        if (other.getItemCount() == null ^ this.getItemCount() == null)
            return false;
        if (other.getItemCount() != null && other.getItemCount().equals(this.getItemCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExportArn() == null) ? 0 : getExportArn().hashCode());
        hashCode = prime * hashCode + ((getExportStatus() == null) ? 0 : getExportStatus().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getExportManifest() == null) ? 0 : getExportManifest().hashCode());
        hashCode = prime * hashCode + ((getTableArn() == null) ? 0 : getTableArn().hashCode());
        hashCode = prime * hashCode + ((getTableId() == null) ? 0 : getTableId().hashCode());
        hashCode = prime * hashCode + ((getExportTime() == null) ? 0 : getExportTime().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getS3BucketOwner() == null) ? 0 : getS3BucketOwner().hashCode());
        hashCode = prime * hashCode + ((getS3Prefix() == null) ? 0 : getS3Prefix().hashCode());
        hashCode = prime * hashCode + ((getS3SseAlgorithm() == null) ? 0 : getS3SseAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getS3SseKmsKeyId() == null) ? 0 : getS3SseKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getFailureCode() == null) ? 0 : getFailureCode().hashCode());
        hashCode = prime * hashCode + ((getFailureMessage() == null) ? 0 : getFailureMessage().hashCode());
        hashCode = prime * hashCode + ((getExportFormat() == null) ? 0 : getExportFormat().hashCode());
        hashCode = prime * hashCode + ((getBilledSizeBytes() == null) ? 0 : getBilledSizeBytes().hashCode());
        hashCode = prime * hashCode + ((getItemCount() == null) ? 0 : getItemCount().hashCode());
        return hashCode;
    }

    @Override
    public ExportDescription clone() {
        try {
            return (ExportDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.ExportDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
