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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ExportTableToPointInTime" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportTableToPointInTimeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the table to export.
     * </p>
     */
    private String tableArn;
    /**
     * <p>
     * Time in the past from which to export table data. The table export will be a snapshot of the table's state at
     * this point in time.
     * </p>
     */
    private java.util.Date exportTime;
    /**
     * <p>
     * Providing a <code>ClientToken</code> makes the call to <code>ExportTableToPointInTimeInput</code> idempotent,
     * meaning that multiple identical calls have the same effect as one single call.
     * </p>
     * <p>
     * A client token is valid for 8 hours after the first request that uses it is completed. After 8 hours, any request
     * with the same client token is treated as a new request. Do not resubmit the same request with the same client
     * token for more than 8 hours, or the result might not be idempotent.
     * </p>
     * <p>
     * If you submit a request with the same client token but a change in other parameters within the 8-hour idempotency
     * window, DynamoDB returns an <code>IdempotentParameterMismatch</code> exception.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The name of the Amazon S3 bucket to export the snapshot to.
     * </p>
     */
    private String s3Bucket;
    /**
     * <p>
     * The ID of the AWS account that owns the bucket the export will be stored in.
     * </p>
     */
    private String s3BucketOwner;
    /**
     * <p>
     * The Amazon S3 bucket prefix to use as the file name and path of the exported snapshot.
     * </p>
     */
    private String s3Prefix;
    /**
     * <p>
     * Type of encryption used on the bucket where export data will be stored. Valid values for
     * <code>S3SseAlgorithm</code> are:
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
     * The ID of the AWS KMS managed key used to encrypt the S3 bucket where export data will be stored (if applicable).
     * </p>
     */
    private String s3SseKmsKeyId;
    /**
     * <p>
     * The format for the exported data. Valid values for <code>ExportFormat</code> are <code>DYNAMODB_JSON</code> or
     * <code>ION</code>.
     * </p>
     */
    private String exportFormat;

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the table to export.
     * </p>
     * 
     * @param tableArn
     *        The Amazon Resource Name (ARN) associated with the table to export.
     */

    public void setTableArn(String tableArn) {
        this.tableArn = tableArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the table to export.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) associated with the table to export.
     */

    public String getTableArn() {
        return this.tableArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the table to export.
     * </p>
     * 
     * @param tableArn
     *        The Amazon Resource Name (ARN) associated with the table to export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTableToPointInTimeRequest withTableArn(String tableArn) {
        setTableArn(tableArn);
        return this;
    }

    /**
     * <p>
     * Time in the past from which to export table data. The table export will be a snapshot of the table's state at
     * this point in time.
     * </p>
     * 
     * @param exportTime
     *        Time in the past from which to export table data. The table export will be a snapshot of the table's state
     *        at this point in time.
     */

    public void setExportTime(java.util.Date exportTime) {
        this.exportTime = exportTime;
    }

    /**
     * <p>
     * Time in the past from which to export table data. The table export will be a snapshot of the table's state at
     * this point in time.
     * </p>
     * 
     * @return Time in the past from which to export table data. The table export will be a snapshot of the table's
     *         state at this point in time.
     */

    public java.util.Date getExportTime() {
        return this.exportTime;
    }

    /**
     * <p>
     * Time in the past from which to export table data. The table export will be a snapshot of the table's state at
     * this point in time.
     * </p>
     * 
     * @param exportTime
     *        Time in the past from which to export table data. The table export will be a snapshot of the table's state
     *        at this point in time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTableToPointInTimeRequest withExportTime(java.util.Date exportTime) {
        setExportTime(exportTime);
        return this;
    }

    /**
     * <p>
     * Providing a <code>ClientToken</code> makes the call to <code>ExportTableToPointInTimeInput</code> idempotent,
     * meaning that multiple identical calls have the same effect as one single call.
     * </p>
     * <p>
     * A client token is valid for 8 hours after the first request that uses it is completed. After 8 hours, any request
     * with the same client token is treated as a new request. Do not resubmit the same request with the same client
     * token for more than 8 hours, or the result might not be idempotent.
     * </p>
     * <p>
     * If you submit a request with the same client token but a change in other parameters within the 8-hour idempotency
     * window, DynamoDB returns an <code>IdempotentParameterMismatch</code> exception.
     * </p>
     * 
     * @param clientToken
     *        Providing a <code>ClientToken</code> makes the call to <code>ExportTableToPointInTimeInput</code>
     *        idempotent, meaning that multiple identical calls have the same effect as one single call.</p>
     *        <p>
     *        A client token is valid for 8 hours after the first request that uses it is completed. After 8 hours, any
     *        request with the same client token is treated as a new request. Do not resubmit the same request with the
     *        same client token for more than 8 hours, or the result might not be idempotent.
     *        </p>
     *        <p>
     *        If you submit a request with the same client token but a change in other parameters within the 8-hour
     *        idempotency window, DynamoDB returns an <code>IdempotentParameterMismatch</code> exception.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Providing a <code>ClientToken</code> makes the call to <code>ExportTableToPointInTimeInput</code> idempotent,
     * meaning that multiple identical calls have the same effect as one single call.
     * </p>
     * <p>
     * A client token is valid for 8 hours after the first request that uses it is completed. After 8 hours, any request
     * with the same client token is treated as a new request. Do not resubmit the same request with the same client
     * token for more than 8 hours, or the result might not be idempotent.
     * </p>
     * <p>
     * If you submit a request with the same client token but a change in other parameters within the 8-hour idempotency
     * window, DynamoDB returns an <code>IdempotentParameterMismatch</code> exception.
     * </p>
     * 
     * @return Providing a <code>ClientToken</code> makes the call to <code>ExportTableToPointInTimeInput</code>
     *         idempotent, meaning that multiple identical calls have the same effect as one single call.</p>
     *         <p>
     *         A client token is valid for 8 hours after the first request that uses it is completed. After 8 hours, any
     *         request with the same client token is treated as a new request. Do not resubmit the same request with the
     *         same client token for more than 8 hours, or the result might not be idempotent.
     *         </p>
     *         <p>
     *         If you submit a request with the same client token but a change in other parameters within the 8-hour
     *         idempotency window, DynamoDB returns an <code>IdempotentParameterMismatch</code> exception.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Providing a <code>ClientToken</code> makes the call to <code>ExportTableToPointInTimeInput</code> idempotent,
     * meaning that multiple identical calls have the same effect as one single call.
     * </p>
     * <p>
     * A client token is valid for 8 hours after the first request that uses it is completed. After 8 hours, any request
     * with the same client token is treated as a new request. Do not resubmit the same request with the same client
     * token for more than 8 hours, or the result might not be idempotent.
     * </p>
     * <p>
     * If you submit a request with the same client token but a change in other parameters within the 8-hour idempotency
     * window, DynamoDB returns an <code>IdempotentParameterMismatch</code> exception.
     * </p>
     * 
     * @param clientToken
     *        Providing a <code>ClientToken</code> makes the call to <code>ExportTableToPointInTimeInput</code>
     *        idempotent, meaning that multiple identical calls have the same effect as one single call.</p>
     *        <p>
     *        A client token is valid for 8 hours after the first request that uses it is completed. After 8 hours, any
     *        request with the same client token is treated as a new request. Do not resubmit the same request with the
     *        same client token for more than 8 hours, or the result might not be idempotent.
     *        </p>
     *        <p>
     *        If you submit a request with the same client token but a change in other parameters within the 8-hour
     *        idempotency window, DynamoDB returns an <code>IdempotentParameterMismatch</code> exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTableToPointInTimeRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket to export the snapshot to.
     * </p>
     * 
     * @param s3Bucket
     *        The name of the Amazon S3 bucket to export the snapshot to.
     */

    public void setS3Bucket(String s3Bucket) {
        this.s3Bucket = s3Bucket;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket to export the snapshot to.
     * </p>
     * 
     * @return The name of the Amazon S3 bucket to export the snapshot to.
     */

    public String getS3Bucket() {
        return this.s3Bucket;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket to export the snapshot to.
     * </p>
     * 
     * @param s3Bucket
     *        The name of the Amazon S3 bucket to export the snapshot to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTableToPointInTimeRequest withS3Bucket(String s3Bucket) {
        setS3Bucket(s3Bucket);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the bucket the export will be stored in.
     * </p>
     * 
     * @param s3BucketOwner
     *        The ID of the AWS account that owns the bucket the export will be stored in.
     */

    public void setS3BucketOwner(String s3BucketOwner) {
        this.s3BucketOwner = s3BucketOwner;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the bucket the export will be stored in.
     * </p>
     * 
     * @return The ID of the AWS account that owns the bucket the export will be stored in.
     */

    public String getS3BucketOwner() {
        return this.s3BucketOwner;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the bucket the export will be stored in.
     * </p>
     * 
     * @param s3BucketOwner
     *        The ID of the AWS account that owns the bucket the export will be stored in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTableToPointInTimeRequest withS3BucketOwner(String s3BucketOwner) {
        setS3BucketOwner(s3BucketOwner);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket prefix to use as the file name and path of the exported snapshot.
     * </p>
     * 
     * @param s3Prefix
     *        The Amazon S3 bucket prefix to use as the file name and path of the exported snapshot.
     */

    public void setS3Prefix(String s3Prefix) {
        this.s3Prefix = s3Prefix;
    }

    /**
     * <p>
     * The Amazon S3 bucket prefix to use as the file name and path of the exported snapshot.
     * </p>
     * 
     * @return The Amazon S3 bucket prefix to use as the file name and path of the exported snapshot.
     */

    public String getS3Prefix() {
        return this.s3Prefix;
    }

    /**
     * <p>
     * The Amazon S3 bucket prefix to use as the file name and path of the exported snapshot.
     * </p>
     * 
     * @param s3Prefix
     *        The Amazon S3 bucket prefix to use as the file name and path of the exported snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTableToPointInTimeRequest withS3Prefix(String s3Prefix) {
        setS3Prefix(s3Prefix);
        return this;
    }

    /**
     * <p>
     * Type of encryption used on the bucket where export data will be stored. Valid values for
     * <code>S3SseAlgorithm</code> are:
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
     *        Type of encryption used on the bucket where export data will be stored. Valid values for
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
     * Type of encryption used on the bucket where export data will be stored. Valid values for
     * <code>S3SseAlgorithm</code> are:
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
     * @return Type of encryption used on the bucket where export data will be stored. Valid values for
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
     * Type of encryption used on the bucket where export data will be stored. Valid values for
     * <code>S3SseAlgorithm</code> are:
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
     *        Type of encryption used on the bucket where export data will be stored. Valid values for
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

    public ExportTableToPointInTimeRequest withS3SseAlgorithm(String s3SseAlgorithm) {
        setS3SseAlgorithm(s3SseAlgorithm);
        return this;
    }

    /**
     * <p>
     * Type of encryption used on the bucket where export data will be stored. Valid values for
     * <code>S3SseAlgorithm</code> are:
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
     *        Type of encryption used on the bucket where export data will be stored. Valid values for
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

    public ExportTableToPointInTimeRequest withS3SseAlgorithm(S3SseAlgorithm s3SseAlgorithm) {
        this.s3SseAlgorithm = s3SseAlgorithm.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the AWS KMS managed key used to encrypt the S3 bucket where export data will be stored (if applicable).
     * </p>
     * 
     * @param s3SseKmsKeyId
     *        The ID of the AWS KMS managed key used to encrypt the S3 bucket where export data will be stored (if
     *        applicable).
     */

    public void setS3SseKmsKeyId(String s3SseKmsKeyId) {
        this.s3SseKmsKeyId = s3SseKmsKeyId;
    }

    /**
     * <p>
     * The ID of the AWS KMS managed key used to encrypt the S3 bucket where export data will be stored (if applicable).
     * </p>
     * 
     * @return The ID of the AWS KMS managed key used to encrypt the S3 bucket where export data will be stored (if
     *         applicable).
     */

    public String getS3SseKmsKeyId() {
        return this.s3SseKmsKeyId;
    }

    /**
     * <p>
     * The ID of the AWS KMS managed key used to encrypt the S3 bucket where export data will be stored (if applicable).
     * </p>
     * 
     * @param s3SseKmsKeyId
     *        The ID of the AWS KMS managed key used to encrypt the S3 bucket where export data will be stored (if
     *        applicable).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTableToPointInTimeRequest withS3SseKmsKeyId(String s3SseKmsKeyId) {
        setS3SseKmsKeyId(s3SseKmsKeyId);
        return this;
    }

    /**
     * <p>
     * The format for the exported data. Valid values for <code>ExportFormat</code> are <code>DYNAMODB_JSON</code> or
     * <code>ION</code>.
     * </p>
     * 
     * @param exportFormat
     *        The format for the exported data. Valid values for <code>ExportFormat</code> are
     *        <code>DYNAMODB_JSON</code> or <code>ION</code>.
     * @see ExportFormat
     */

    public void setExportFormat(String exportFormat) {
        this.exportFormat = exportFormat;
    }

    /**
     * <p>
     * The format for the exported data. Valid values for <code>ExportFormat</code> are <code>DYNAMODB_JSON</code> or
     * <code>ION</code>.
     * </p>
     * 
     * @return The format for the exported data. Valid values for <code>ExportFormat</code> are
     *         <code>DYNAMODB_JSON</code> or <code>ION</code>.
     * @see ExportFormat
     */

    public String getExportFormat() {
        return this.exportFormat;
    }

    /**
     * <p>
     * The format for the exported data. Valid values for <code>ExportFormat</code> are <code>DYNAMODB_JSON</code> or
     * <code>ION</code>.
     * </p>
     * 
     * @param exportFormat
     *        The format for the exported data. Valid values for <code>ExportFormat</code> are
     *        <code>DYNAMODB_JSON</code> or <code>ION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportFormat
     */

    public ExportTableToPointInTimeRequest withExportFormat(String exportFormat) {
        setExportFormat(exportFormat);
        return this;
    }

    /**
     * <p>
     * The format for the exported data. Valid values for <code>ExportFormat</code> are <code>DYNAMODB_JSON</code> or
     * <code>ION</code>.
     * </p>
     * 
     * @param exportFormat
     *        The format for the exported data. Valid values for <code>ExportFormat</code> are
     *        <code>DYNAMODB_JSON</code> or <code>ION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportFormat
     */

    public ExportTableToPointInTimeRequest withExportFormat(ExportFormat exportFormat) {
        this.exportFormat = exportFormat.toString();
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
        if (getTableArn() != null)
            sb.append("TableArn: ").append(getTableArn()).append(",");
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
        if (getExportFormat() != null)
            sb.append("ExportFormat: ").append(getExportFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportTableToPointInTimeRequest == false)
            return false;
        ExportTableToPointInTimeRequest other = (ExportTableToPointInTimeRequest) obj;
        if (other.getTableArn() == null ^ this.getTableArn() == null)
            return false;
        if (other.getTableArn() != null && other.getTableArn().equals(this.getTableArn()) == false)
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
        if (other.getExportFormat() == null ^ this.getExportFormat() == null)
            return false;
        if (other.getExportFormat() != null && other.getExportFormat().equals(this.getExportFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableArn() == null) ? 0 : getTableArn().hashCode());
        hashCode = prime * hashCode + ((getExportTime() == null) ? 0 : getExportTime().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getS3Bucket() == null) ? 0 : getS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getS3BucketOwner() == null) ? 0 : getS3BucketOwner().hashCode());
        hashCode = prime * hashCode + ((getS3Prefix() == null) ? 0 : getS3Prefix().hashCode());
        hashCode = prime * hashCode + ((getS3SseAlgorithm() == null) ? 0 : getS3SseAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getS3SseKmsKeyId() == null) ? 0 : getS3SseKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getExportFormat() == null) ? 0 : getExportFormat().hashCode());
        return hashCode;
    }

    @Override
    public ExportTableToPointInTimeRequest clone() {
        return (ExportTableToPointInTimeRequest) super.clone();
    }

}
