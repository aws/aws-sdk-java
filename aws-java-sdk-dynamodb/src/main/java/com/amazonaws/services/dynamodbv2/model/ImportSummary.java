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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information about the source file for the import.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ImportSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Number (ARN) corresponding to the import request.
     * </p>
     */
    private String importArn;
    /**
     * <p>
     * The status of the import operation.
     * </p>
     */
    private String importStatus;
    /**
     * <p>
     * The Amazon Resource Number (ARN) of the table being imported into.
     * </p>
     */
    private String tableArn;
    /**
     * <p>
     * The path and S3 bucket of the source file that is being imported. This includes the S3Bucket (required),
     * S3KeyPrefix (optional) and S3BucketOwner (optional if the bucket is owned by the requester).
     * </p>
     */
    private S3BucketSource s3BucketSource;
    /**
     * <p>
     * The Amazon Resource Number (ARN) of the Cloudwatch Log Group associated with this import task.
     * </p>
     */
    private String cloudWatchLogGroupArn;
    /**
     * <p>
     * The format of the source data. Valid values are <code>CSV</code>, <code>DYNAMODB_JSON</code> or <code>ION</code>.
     * </p>
     */
    private String inputFormat;
    /**
     * <p>
     * The time at which this import task began.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The time at which this import task ended. (Does this include the successful complete creation of the table it was
     * imported to?)
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The Amazon Resource Number (ARN) corresponding to the import request.
     * </p>
     * 
     * @param importArn
     *        The Amazon Resource Number (ARN) corresponding to the import request.
     */

    public void setImportArn(String importArn) {
        this.importArn = importArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) corresponding to the import request.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) corresponding to the import request.
     */

    public String getImportArn() {
        return this.importArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) corresponding to the import request.
     * </p>
     * 
     * @param importArn
     *        The Amazon Resource Number (ARN) corresponding to the import request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportSummary withImportArn(String importArn) {
        setImportArn(importArn);
        return this;
    }

    /**
     * <p>
     * The status of the import operation.
     * </p>
     * 
     * @param importStatus
     *        The status of the import operation.
     * @see ImportStatus
     */

    public void setImportStatus(String importStatus) {
        this.importStatus = importStatus;
    }

    /**
     * <p>
     * The status of the import operation.
     * </p>
     * 
     * @return The status of the import operation.
     * @see ImportStatus
     */

    public String getImportStatus() {
        return this.importStatus;
    }

    /**
     * <p>
     * The status of the import operation.
     * </p>
     * 
     * @param importStatus
     *        The status of the import operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportStatus
     */

    public ImportSummary withImportStatus(String importStatus) {
        setImportStatus(importStatus);
        return this;
    }

    /**
     * <p>
     * The status of the import operation.
     * </p>
     * 
     * @param importStatus
     *        The status of the import operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportStatus
     */

    public ImportSummary withImportStatus(ImportStatus importStatus) {
        this.importStatus = importStatus.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the table being imported into.
     * </p>
     * 
     * @param tableArn
     *        The Amazon Resource Number (ARN) of the table being imported into.
     */

    public void setTableArn(String tableArn) {
        this.tableArn = tableArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the table being imported into.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) of the table being imported into.
     */

    public String getTableArn() {
        return this.tableArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the table being imported into.
     * </p>
     * 
     * @param tableArn
     *        The Amazon Resource Number (ARN) of the table being imported into.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportSummary withTableArn(String tableArn) {
        setTableArn(tableArn);
        return this;
    }

    /**
     * <p>
     * The path and S3 bucket of the source file that is being imported. This includes the S3Bucket (required),
     * S3KeyPrefix (optional) and S3BucketOwner (optional if the bucket is owned by the requester).
     * </p>
     * 
     * @param s3BucketSource
     *        The path and S3 bucket of the source file that is being imported. This includes the S3Bucket (required),
     *        S3KeyPrefix (optional) and S3BucketOwner (optional if the bucket is owned by the requester).
     */

    public void setS3BucketSource(S3BucketSource s3BucketSource) {
        this.s3BucketSource = s3BucketSource;
    }

    /**
     * <p>
     * The path and S3 bucket of the source file that is being imported. This includes the S3Bucket (required),
     * S3KeyPrefix (optional) and S3BucketOwner (optional if the bucket is owned by the requester).
     * </p>
     * 
     * @return The path and S3 bucket of the source file that is being imported. This includes the S3Bucket (required),
     *         S3KeyPrefix (optional) and S3BucketOwner (optional if the bucket is owned by the requester).
     */

    public S3BucketSource getS3BucketSource() {
        return this.s3BucketSource;
    }

    /**
     * <p>
     * The path and S3 bucket of the source file that is being imported. This includes the S3Bucket (required),
     * S3KeyPrefix (optional) and S3BucketOwner (optional if the bucket is owned by the requester).
     * </p>
     * 
     * @param s3BucketSource
     *        The path and S3 bucket of the source file that is being imported. This includes the S3Bucket (required),
     *        S3KeyPrefix (optional) and S3BucketOwner (optional if the bucket is owned by the requester).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportSummary withS3BucketSource(S3BucketSource s3BucketSource) {
        setS3BucketSource(s3BucketSource);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the Cloudwatch Log Group associated with this import task.
     * </p>
     * 
     * @param cloudWatchLogGroupArn
     *        The Amazon Resource Number (ARN) of the Cloudwatch Log Group associated with this import task.
     */

    public void setCloudWatchLogGroupArn(String cloudWatchLogGroupArn) {
        this.cloudWatchLogGroupArn = cloudWatchLogGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the Cloudwatch Log Group associated with this import task.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) of the Cloudwatch Log Group associated with this import task.
     */

    public String getCloudWatchLogGroupArn() {
        return this.cloudWatchLogGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the Cloudwatch Log Group associated with this import task.
     * </p>
     * 
     * @param cloudWatchLogGroupArn
     *        The Amazon Resource Number (ARN) of the Cloudwatch Log Group associated with this import task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportSummary withCloudWatchLogGroupArn(String cloudWatchLogGroupArn) {
        setCloudWatchLogGroupArn(cloudWatchLogGroupArn);
        return this;
    }

    /**
     * <p>
     * The format of the source data. Valid values are <code>CSV</code>, <code>DYNAMODB_JSON</code> or <code>ION</code>.
     * </p>
     * 
     * @param inputFormat
     *        The format of the source data. Valid values are <code>CSV</code>, <code>DYNAMODB_JSON</code> or
     *        <code>ION</code>.
     * @see InputFormat
     */

    public void setInputFormat(String inputFormat) {
        this.inputFormat = inputFormat;
    }

    /**
     * <p>
     * The format of the source data. Valid values are <code>CSV</code>, <code>DYNAMODB_JSON</code> or <code>ION</code>.
     * </p>
     * 
     * @return The format of the source data. Valid values are <code>CSV</code>, <code>DYNAMODB_JSON</code> or
     *         <code>ION</code>.
     * @see InputFormat
     */

    public String getInputFormat() {
        return this.inputFormat;
    }

    /**
     * <p>
     * The format of the source data. Valid values are <code>CSV</code>, <code>DYNAMODB_JSON</code> or <code>ION</code>.
     * </p>
     * 
     * @param inputFormat
     *        The format of the source data. Valid values are <code>CSV</code>, <code>DYNAMODB_JSON</code> or
     *        <code>ION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputFormat
     */

    public ImportSummary withInputFormat(String inputFormat) {
        setInputFormat(inputFormat);
        return this;
    }

    /**
     * <p>
     * The format of the source data. Valid values are <code>CSV</code>, <code>DYNAMODB_JSON</code> or <code>ION</code>.
     * </p>
     * 
     * @param inputFormat
     *        The format of the source data. Valid values are <code>CSV</code>, <code>DYNAMODB_JSON</code> or
     *        <code>ION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputFormat
     */

    public ImportSummary withInputFormat(InputFormat inputFormat) {
        this.inputFormat = inputFormat.toString();
        return this;
    }

    /**
     * <p>
     * The time at which this import task began.
     * </p>
     * 
     * @param startTime
     *        The time at which this import task began.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time at which this import task began.
     * </p>
     * 
     * @return The time at which this import task began.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time at which this import task began.
     * </p>
     * 
     * @param startTime
     *        The time at which this import task began.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportSummary withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The time at which this import task ended. (Does this include the successful complete creation of the table it was
     * imported to?)
     * </p>
     * 
     * @param endTime
     *        The time at which this import task ended. (Does this include the successful complete creation of the table
     *        it was imported to?)
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time at which this import task ended. (Does this include the successful complete creation of the table it was
     * imported to?)
     * </p>
     * 
     * @return The time at which this import task ended. (Does this include the successful complete creation of the
     *         table it was imported to?)
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time at which this import task ended. (Does this include the successful complete creation of the table it was
     * imported to?)
     * </p>
     * 
     * @param endTime
     *        The time at which this import task ended. (Does this include the successful complete creation of the table
     *        it was imported to?)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportSummary withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
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
        if (getImportArn() != null)
            sb.append("ImportArn: ").append(getImportArn()).append(",");
        if (getImportStatus() != null)
            sb.append("ImportStatus: ").append(getImportStatus()).append(",");
        if (getTableArn() != null)
            sb.append("TableArn: ").append(getTableArn()).append(",");
        if (getS3BucketSource() != null)
            sb.append("S3BucketSource: ").append(getS3BucketSource()).append(",");
        if (getCloudWatchLogGroupArn() != null)
            sb.append("CloudWatchLogGroupArn: ").append(getCloudWatchLogGroupArn()).append(",");
        if (getInputFormat() != null)
            sb.append("InputFormat: ").append(getInputFormat()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportSummary == false)
            return false;
        ImportSummary other = (ImportSummary) obj;
        if (other.getImportArn() == null ^ this.getImportArn() == null)
            return false;
        if (other.getImportArn() != null && other.getImportArn().equals(this.getImportArn()) == false)
            return false;
        if (other.getImportStatus() == null ^ this.getImportStatus() == null)
            return false;
        if (other.getImportStatus() != null && other.getImportStatus().equals(this.getImportStatus()) == false)
            return false;
        if (other.getTableArn() == null ^ this.getTableArn() == null)
            return false;
        if (other.getTableArn() != null && other.getTableArn().equals(this.getTableArn()) == false)
            return false;
        if (other.getS3BucketSource() == null ^ this.getS3BucketSource() == null)
            return false;
        if (other.getS3BucketSource() != null && other.getS3BucketSource().equals(this.getS3BucketSource()) == false)
            return false;
        if (other.getCloudWatchLogGroupArn() == null ^ this.getCloudWatchLogGroupArn() == null)
            return false;
        if (other.getCloudWatchLogGroupArn() != null && other.getCloudWatchLogGroupArn().equals(this.getCloudWatchLogGroupArn()) == false)
            return false;
        if (other.getInputFormat() == null ^ this.getInputFormat() == null)
            return false;
        if (other.getInputFormat() != null && other.getInputFormat().equals(this.getInputFormat()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImportArn() == null) ? 0 : getImportArn().hashCode());
        hashCode = prime * hashCode + ((getImportStatus() == null) ? 0 : getImportStatus().hashCode());
        hashCode = prime * hashCode + ((getTableArn() == null) ? 0 : getTableArn().hashCode());
        hashCode = prime * hashCode + ((getS3BucketSource() == null) ? 0 : getS3BucketSource().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLogGroupArn() == null) ? 0 : getCloudWatchLogGroupArn().hashCode());
        hashCode = prime * hashCode + ((getInputFormat() == null) ? 0 : getInputFormat().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public ImportSummary clone() {
        try {
            return (ImportSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.ImportSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
