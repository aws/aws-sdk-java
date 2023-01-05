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
 * Represents the properties of the table being imported into.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ImportTableDescription" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportTableDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Number (ARN) corresponding to the import request.
     * </p>
     */
    private String importArn;
    /**
     * <p>
     * The status of the import.
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
     * The table id corresponding to the table created by import table process.
     * </p>
     */
    private String tableId;
    /**
     * <p>
     * The client token that was provided for the import task. Reusing the client token on retry makes a call to
     * <code>ImportTable</code> idempotent.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Values for the S3 bucket the source file is imported from. Includes bucket name (required), key prefix (optional)
     * and bucket account owner ID (optional).
     * </p>
     */
    private S3BucketSource s3BucketSource;
    /**
     * <p>
     * The number of errors occurred on importing the source file into the target table.
     * </p>
     */
    private Long errorCount;
    /**
     * <p>
     * The Amazon Resource Number (ARN) of the Cloudwatch Log Group associated with the target table.
     * </p>
     */
    private String cloudWatchLogGroupArn;
    /**
     * <p>
     * The format of the source data going into the target table.
     * </p>
     */
    private String inputFormat;
    /**
     * <p>
     * The format options for the data that was imported into the target table. There is one value, CsvOption.
     * </p>
     */
    private InputFormatOptions inputFormatOptions;
    /**
     * <p>
     * The compression options for the data that has been imported into the target table. The values are NONE, GZIP, or
     * ZSTD.
     * </p>
     */
    private String inputCompressionType;
    /**
     * <p>
     * The parameters for the new table that is being imported into.
     * </p>
     */
    private TableCreationParameters tableCreationParameters;
    /**
     * <p>
     * The time when this import task started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The time at which the creation of the table associated with this import task completed.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The total size of data processed from the source file, in Bytes.
     * </p>
     */
    private Long processedSizeBytes;
    /**
     * <p>
     * The total number of items processed from the source file.
     * </p>
     */
    private Long processedItemCount;
    /**
     * <p>
     * The number of items successfully imported into the new table.
     * </p>
     */
    private Long importedItemCount;
    /**
     * <p>
     * The error code corresponding to the failure that the import job ran into during execution.
     * </p>
     */
    private String failureCode;
    /**
     * <p>
     * The error message corresponding to the failure that the import job ran into during execution.
     * </p>
     */
    private String failureMessage;

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

    public ImportTableDescription withImportArn(String importArn) {
        setImportArn(importArn);
        return this;
    }

    /**
     * <p>
     * The status of the import.
     * </p>
     * 
     * @param importStatus
     *        The status of the import.
     * @see ImportStatus
     */

    public void setImportStatus(String importStatus) {
        this.importStatus = importStatus;
    }

    /**
     * <p>
     * The status of the import.
     * </p>
     * 
     * @return The status of the import.
     * @see ImportStatus
     */

    public String getImportStatus() {
        return this.importStatus;
    }

    /**
     * <p>
     * The status of the import.
     * </p>
     * 
     * @param importStatus
     *        The status of the import.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportStatus
     */

    public ImportTableDescription withImportStatus(String importStatus) {
        setImportStatus(importStatus);
        return this;
    }

    /**
     * <p>
     * The status of the import.
     * </p>
     * 
     * @param importStatus
     *        The status of the import.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportStatus
     */

    public ImportTableDescription withImportStatus(ImportStatus importStatus) {
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

    public ImportTableDescription withTableArn(String tableArn) {
        setTableArn(tableArn);
        return this;
    }

    /**
     * <p>
     * The table id corresponding to the table created by import table process.
     * </p>
     * 
     * @param tableId
     *        The table id corresponding to the table created by import table process.
     */

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    /**
     * <p>
     * The table id corresponding to the table created by import table process.
     * </p>
     * 
     * @return The table id corresponding to the table created by import table process.
     */

    public String getTableId() {
        return this.tableId;
    }

    /**
     * <p>
     * The table id corresponding to the table created by import table process.
     * </p>
     * 
     * @param tableId
     *        The table id corresponding to the table created by import table process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTableDescription withTableId(String tableId) {
        setTableId(tableId);
        return this;
    }

    /**
     * <p>
     * The client token that was provided for the import task. Reusing the client token on retry makes a call to
     * <code>ImportTable</code> idempotent.
     * </p>
     * 
     * @param clientToken
     *        The client token that was provided for the import task. Reusing the client token on retry makes a call to
     *        <code>ImportTable</code> idempotent.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The client token that was provided for the import task. Reusing the client token on retry makes a call to
     * <code>ImportTable</code> idempotent.
     * </p>
     * 
     * @return The client token that was provided for the import task. Reusing the client token on retry makes a call to
     *         <code>ImportTable</code> idempotent.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The client token that was provided for the import task. Reusing the client token on retry makes a call to
     * <code>ImportTable</code> idempotent.
     * </p>
     * 
     * @param clientToken
     *        The client token that was provided for the import task. Reusing the client token on retry makes a call to
     *        <code>ImportTable</code> idempotent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTableDescription withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Values for the S3 bucket the source file is imported from. Includes bucket name (required), key prefix (optional)
     * and bucket account owner ID (optional).
     * </p>
     * 
     * @param s3BucketSource
     *        Values for the S3 bucket the source file is imported from. Includes bucket name (required), key prefix
     *        (optional) and bucket account owner ID (optional).
     */

    public void setS3BucketSource(S3BucketSource s3BucketSource) {
        this.s3BucketSource = s3BucketSource;
    }

    /**
     * <p>
     * Values for the S3 bucket the source file is imported from. Includes bucket name (required), key prefix (optional)
     * and bucket account owner ID (optional).
     * </p>
     * 
     * @return Values for the S3 bucket the source file is imported from. Includes bucket name (required), key prefix
     *         (optional) and bucket account owner ID (optional).
     */

    public S3BucketSource getS3BucketSource() {
        return this.s3BucketSource;
    }

    /**
     * <p>
     * Values for the S3 bucket the source file is imported from. Includes bucket name (required), key prefix (optional)
     * and bucket account owner ID (optional).
     * </p>
     * 
     * @param s3BucketSource
     *        Values for the S3 bucket the source file is imported from. Includes bucket name (required), key prefix
     *        (optional) and bucket account owner ID (optional).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTableDescription withS3BucketSource(S3BucketSource s3BucketSource) {
        setS3BucketSource(s3BucketSource);
        return this;
    }

    /**
     * <p>
     * The number of errors occurred on importing the source file into the target table.
     * </p>
     * 
     * @param errorCount
     *        The number of errors occurred on importing the source file into the target table.
     */

    public void setErrorCount(Long errorCount) {
        this.errorCount = errorCount;
    }

    /**
     * <p>
     * The number of errors occurred on importing the source file into the target table.
     * </p>
     * 
     * @return The number of errors occurred on importing the source file into the target table.
     */

    public Long getErrorCount() {
        return this.errorCount;
    }

    /**
     * <p>
     * The number of errors occurred on importing the source file into the target table.
     * </p>
     * 
     * @param errorCount
     *        The number of errors occurred on importing the source file into the target table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTableDescription withErrorCount(Long errorCount) {
        setErrorCount(errorCount);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the Cloudwatch Log Group associated with the target table.
     * </p>
     * 
     * @param cloudWatchLogGroupArn
     *        The Amazon Resource Number (ARN) of the Cloudwatch Log Group associated with the target table.
     */

    public void setCloudWatchLogGroupArn(String cloudWatchLogGroupArn) {
        this.cloudWatchLogGroupArn = cloudWatchLogGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the Cloudwatch Log Group associated with the target table.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) of the Cloudwatch Log Group associated with the target table.
     */

    public String getCloudWatchLogGroupArn() {
        return this.cloudWatchLogGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the Cloudwatch Log Group associated with the target table.
     * </p>
     * 
     * @param cloudWatchLogGroupArn
     *        The Amazon Resource Number (ARN) of the Cloudwatch Log Group associated with the target table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTableDescription withCloudWatchLogGroupArn(String cloudWatchLogGroupArn) {
        setCloudWatchLogGroupArn(cloudWatchLogGroupArn);
        return this;
    }

    /**
     * <p>
     * The format of the source data going into the target table.
     * </p>
     * 
     * @param inputFormat
     *        The format of the source data going into the target table.
     * @see InputFormat
     */

    public void setInputFormat(String inputFormat) {
        this.inputFormat = inputFormat;
    }

    /**
     * <p>
     * The format of the source data going into the target table.
     * </p>
     * 
     * @return The format of the source data going into the target table.
     * @see InputFormat
     */

    public String getInputFormat() {
        return this.inputFormat;
    }

    /**
     * <p>
     * The format of the source data going into the target table.
     * </p>
     * 
     * @param inputFormat
     *        The format of the source data going into the target table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputFormat
     */

    public ImportTableDescription withInputFormat(String inputFormat) {
        setInputFormat(inputFormat);
        return this;
    }

    /**
     * <p>
     * The format of the source data going into the target table.
     * </p>
     * 
     * @param inputFormat
     *        The format of the source data going into the target table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputFormat
     */

    public ImportTableDescription withInputFormat(InputFormat inputFormat) {
        this.inputFormat = inputFormat.toString();
        return this;
    }

    /**
     * <p>
     * The format options for the data that was imported into the target table. There is one value, CsvOption.
     * </p>
     * 
     * @param inputFormatOptions
     *        The format options for the data that was imported into the target table. There is one value, CsvOption.
     */

    public void setInputFormatOptions(InputFormatOptions inputFormatOptions) {
        this.inputFormatOptions = inputFormatOptions;
    }

    /**
     * <p>
     * The format options for the data that was imported into the target table. There is one value, CsvOption.
     * </p>
     * 
     * @return The format options for the data that was imported into the target table. There is one value, CsvOption.
     */

    public InputFormatOptions getInputFormatOptions() {
        return this.inputFormatOptions;
    }

    /**
     * <p>
     * The format options for the data that was imported into the target table. There is one value, CsvOption.
     * </p>
     * 
     * @param inputFormatOptions
     *        The format options for the data that was imported into the target table. There is one value, CsvOption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTableDescription withInputFormatOptions(InputFormatOptions inputFormatOptions) {
        setInputFormatOptions(inputFormatOptions);
        return this;
    }

    /**
     * <p>
     * The compression options for the data that has been imported into the target table. The values are NONE, GZIP, or
     * ZSTD.
     * </p>
     * 
     * @param inputCompressionType
     *        The compression options for the data that has been imported into the target table. The values are NONE,
     *        GZIP, or ZSTD.
     * @see InputCompressionType
     */

    public void setInputCompressionType(String inputCompressionType) {
        this.inputCompressionType = inputCompressionType;
    }

    /**
     * <p>
     * The compression options for the data that has been imported into the target table. The values are NONE, GZIP, or
     * ZSTD.
     * </p>
     * 
     * @return The compression options for the data that has been imported into the target table. The values are NONE,
     *         GZIP, or ZSTD.
     * @see InputCompressionType
     */

    public String getInputCompressionType() {
        return this.inputCompressionType;
    }

    /**
     * <p>
     * The compression options for the data that has been imported into the target table. The values are NONE, GZIP, or
     * ZSTD.
     * </p>
     * 
     * @param inputCompressionType
     *        The compression options for the data that has been imported into the target table. The values are NONE,
     *        GZIP, or ZSTD.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputCompressionType
     */

    public ImportTableDescription withInputCompressionType(String inputCompressionType) {
        setInputCompressionType(inputCompressionType);
        return this;
    }

    /**
     * <p>
     * The compression options for the data that has been imported into the target table. The values are NONE, GZIP, or
     * ZSTD.
     * </p>
     * 
     * @param inputCompressionType
     *        The compression options for the data that has been imported into the target table. The values are NONE,
     *        GZIP, or ZSTD.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputCompressionType
     */

    public ImportTableDescription withInputCompressionType(InputCompressionType inputCompressionType) {
        this.inputCompressionType = inputCompressionType.toString();
        return this;
    }

    /**
     * <p>
     * The parameters for the new table that is being imported into.
     * </p>
     * 
     * @param tableCreationParameters
     *        The parameters for the new table that is being imported into.
     */

    public void setTableCreationParameters(TableCreationParameters tableCreationParameters) {
        this.tableCreationParameters = tableCreationParameters;
    }

    /**
     * <p>
     * The parameters for the new table that is being imported into.
     * </p>
     * 
     * @return The parameters for the new table that is being imported into.
     */

    public TableCreationParameters getTableCreationParameters() {
        return this.tableCreationParameters;
    }

    /**
     * <p>
     * The parameters for the new table that is being imported into.
     * </p>
     * 
     * @param tableCreationParameters
     *        The parameters for the new table that is being imported into.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTableDescription withTableCreationParameters(TableCreationParameters tableCreationParameters) {
        setTableCreationParameters(tableCreationParameters);
        return this;
    }

    /**
     * <p>
     * The time when this import task started.
     * </p>
     * 
     * @param startTime
     *        The time when this import task started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time when this import task started.
     * </p>
     * 
     * @return The time when this import task started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time when this import task started.
     * </p>
     * 
     * @param startTime
     *        The time when this import task started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTableDescription withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The time at which the creation of the table associated with this import task completed.
     * </p>
     * 
     * @param endTime
     *        The time at which the creation of the table associated with this import task completed.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time at which the creation of the table associated with this import task completed.
     * </p>
     * 
     * @return The time at which the creation of the table associated with this import task completed.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time at which the creation of the table associated with this import task completed.
     * </p>
     * 
     * @param endTime
     *        The time at which the creation of the table associated with this import task completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTableDescription withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The total size of data processed from the source file, in Bytes.
     * </p>
     * 
     * @param processedSizeBytes
     *        The total size of data processed from the source file, in Bytes.
     */

    public void setProcessedSizeBytes(Long processedSizeBytes) {
        this.processedSizeBytes = processedSizeBytes;
    }

    /**
     * <p>
     * The total size of data processed from the source file, in Bytes.
     * </p>
     * 
     * @return The total size of data processed from the source file, in Bytes.
     */

    public Long getProcessedSizeBytes() {
        return this.processedSizeBytes;
    }

    /**
     * <p>
     * The total size of data processed from the source file, in Bytes.
     * </p>
     * 
     * @param processedSizeBytes
     *        The total size of data processed from the source file, in Bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTableDescription withProcessedSizeBytes(Long processedSizeBytes) {
        setProcessedSizeBytes(processedSizeBytes);
        return this;
    }

    /**
     * <p>
     * The total number of items processed from the source file.
     * </p>
     * 
     * @param processedItemCount
     *        The total number of items processed from the source file.
     */

    public void setProcessedItemCount(Long processedItemCount) {
        this.processedItemCount = processedItemCount;
    }

    /**
     * <p>
     * The total number of items processed from the source file.
     * </p>
     * 
     * @return The total number of items processed from the source file.
     */

    public Long getProcessedItemCount() {
        return this.processedItemCount;
    }

    /**
     * <p>
     * The total number of items processed from the source file.
     * </p>
     * 
     * @param processedItemCount
     *        The total number of items processed from the source file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTableDescription withProcessedItemCount(Long processedItemCount) {
        setProcessedItemCount(processedItemCount);
        return this;
    }

    /**
     * <p>
     * The number of items successfully imported into the new table.
     * </p>
     * 
     * @param importedItemCount
     *        The number of items successfully imported into the new table.
     */

    public void setImportedItemCount(Long importedItemCount) {
        this.importedItemCount = importedItemCount;
    }

    /**
     * <p>
     * The number of items successfully imported into the new table.
     * </p>
     * 
     * @return The number of items successfully imported into the new table.
     */

    public Long getImportedItemCount() {
        return this.importedItemCount;
    }

    /**
     * <p>
     * The number of items successfully imported into the new table.
     * </p>
     * 
     * @param importedItemCount
     *        The number of items successfully imported into the new table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTableDescription withImportedItemCount(Long importedItemCount) {
        setImportedItemCount(importedItemCount);
        return this;
    }

    /**
     * <p>
     * The error code corresponding to the failure that the import job ran into during execution.
     * </p>
     * 
     * @param failureCode
     *        The error code corresponding to the failure that the import job ran into during execution.
     */

    public void setFailureCode(String failureCode) {
        this.failureCode = failureCode;
    }

    /**
     * <p>
     * The error code corresponding to the failure that the import job ran into during execution.
     * </p>
     * 
     * @return The error code corresponding to the failure that the import job ran into during execution.
     */

    public String getFailureCode() {
        return this.failureCode;
    }

    /**
     * <p>
     * The error code corresponding to the failure that the import job ran into during execution.
     * </p>
     * 
     * @param failureCode
     *        The error code corresponding to the failure that the import job ran into during execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTableDescription withFailureCode(String failureCode) {
        setFailureCode(failureCode);
        return this;
    }

    /**
     * <p>
     * The error message corresponding to the failure that the import job ran into during execution.
     * </p>
     * 
     * @param failureMessage
     *        The error message corresponding to the failure that the import job ran into during execution.
     */

    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }

    /**
     * <p>
     * The error message corresponding to the failure that the import job ran into during execution.
     * </p>
     * 
     * @return The error message corresponding to the failure that the import job ran into during execution.
     */

    public String getFailureMessage() {
        return this.failureMessage;
    }

    /**
     * <p>
     * The error message corresponding to the failure that the import job ran into during execution.
     * </p>
     * 
     * @param failureMessage
     *        The error message corresponding to the failure that the import job ran into during execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTableDescription withFailureMessage(String failureMessage) {
        setFailureMessage(failureMessage);
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
        if (getTableId() != null)
            sb.append("TableId: ").append(getTableId()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getS3BucketSource() != null)
            sb.append("S3BucketSource: ").append(getS3BucketSource()).append(",");
        if (getErrorCount() != null)
            sb.append("ErrorCount: ").append(getErrorCount()).append(",");
        if (getCloudWatchLogGroupArn() != null)
            sb.append("CloudWatchLogGroupArn: ").append(getCloudWatchLogGroupArn()).append(",");
        if (getInputFormat() != null)
            sb.append("InputFormat: ").append(getInputFormat()).append(",");
        if (getInputFormatOptions() != null)
            sb.append("InputFormatOptions: ").append(getInputFormatOptions()).append(",");
        if (getInputCompressionType() != null)
            sb.append("InputCompressionType: ").append(getInputCompressionType()).append(",");
        if (getTableCreationParameters() != null)
            sb.append("TableCreationParameters: ").append(getTableCreationParameters()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getProcessedSizeBytes() != null)
            sb.append("ProcessedSizeBytes: ").append(getProcessedSizeBytes()).append(",");
        if (getProcessedItemCount() != null)
            sb.append("ProcessedItemCount: ").append(getProcessedItemCount()).append(",");
        if (getImportedItemCount() != null)
            sb.append("ImportedItemCount: ").append(getImportedItemCount()).append(",");
        if (getFailureCode() != null)
            sb.append("FailureCode: ").append(getFailureCode()).append(",");
        if (getFailureMessage() != null)
            sb.append("FailureMessage: ").append(getFailureMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportTableDescription == false)
            return false;
        ImportTableDescription other = (ImportTableDescription) obj;
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
        if (other.getTableId() == null ^ this.getTableId() == null)
            return false;
        if (other.getTableId() != null && other.getTableId().equals(this.getTableId()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getS3BucketSource() == null ^ this.getS3BucketSource() == null)
            return false;
        if (other.getS3BucketSource() != null && other.getS3BucketSource().equals(this.getS3BucketSource()) == false)
            return false;
        if (other.getErrorCount() == null ^ this.getErrorCount() == null)
            return false;
        if (other.getErrorCount() != null && other.getErrorCount().equals(this.getErrorCount()) == false)
            return false;
        if (other.getCloudWatchLogGroupArn() == null ^ this.getCloudWatchLogGroupArn() == null)
            return false;
        if (other.getCloudWatchLogGroupArn() != null && other.getCloudWatchLogGroupArn().equals(this.getCloudWatchLogGroupArn()) == false)
            return false;
        if (other.getInputFormat() == null ^ this.getInputFormat() == null)
            return false;
        if (other.getInputFormat() != null && other.getInputFormat().equals(this.getInputFormat()) == false)
            return false;
        if (other.getInputFormatOptions() == null ^ this.getInputFormatOptions() == null)
            return false;
        if (other.getInputFormatOptions() != null && other.getInputFormatOptions().equals(this.getInputFormatOptions()) == false)
            return false;
        if (other.getInputCompressionType() == null ^ this.getInputCompressionType() == null)
            return false;
        if (other.getInputCompressionType() != null && other.getInputCompressionType().equals(this.getInputCompressionType()) == false)
            return false;
        if (other.getTableCreationParameters() == null ^ this.getTableCreationParameters() == null)
            return false;
        if (other.getTableCreationParameters() != null && other.getTableCreationParameters().equals(this.getTableCreationParameters()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getProcessedSizeBytes() == null ^ this.getProcessedSizeBytes() == null)
            return false;
        if (other.getProcessedSizeBytes() != null && other.getProcessedSizeBytes().equals(this.getProcessedSizeBytes()) == false)
            return false;
        if (other.getProcessedItemCount() == null ^ this.getProcessedItemCount() == null)
            return false;
        if (other.getProcessedItemCount() != null && other.getProcessedItemCount().equals(this.getProcessedItemCount()) == false)
            return false;
        if (other.getImportedItemCount() == null ^ this.getImportedItemCount() == null)
            return false;
        if (other.getImportedItemCount() != null && other.getImportedItemCount().equals(this.getImportedItemCount()) == false)
            return false;
        if (other.getFailureCode() == null ^ this.getFailureCode() == null)
            return false;
        if (other.getFailureCode() != null && other.getFailureCode().equals(this.getFailureCode()) == false)
            return false;
        if (other.getFailureMessage() == null ^ this.getFailureMessage() == null)
            return false;
        if (other.getFailureMessage() != null && other.getFailureMessage().equals(this.getFailureMessage()) == false)
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
        hashCode = prime * hashCode + ((getTableId() == null) ? 0 : getTableId().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getS3BucketSource() == null) ? 0 : getS3BucketSource().hashCode());
        hashCode = prime * hashCode + ((getErrorCount() == null) ? 0 : getErrorCount().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLogGroupArn() == null) ? 0 : getCloudWatchLogGroupArn().hashCode());
        hashCode = prime * hashCode + ((getInputFormat() == null) ? 0 : getInputFormat().hashCode());
        hashCode = prime * hashCode + ((getInputFormatOptions() == null) ? 0 : getInputFormatOptions().hashCode());
        hashCode = prime * hashCode + ((getInputCompressionType() == null) ? 0 : getInputCompressionType().hashCode());
        hashCode = prime * hashCode + ((getTableCreationParameters() == null) ? 0 : getTableCreationParameters().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getProcessedSizeBytes() == null) ? 0 : getProcessedSizeBytes().hashCode());
        hashCode = prime * hashCode + ((getProcessedItemCount() == null) ? 0 : getProcessedItemCount().hashCode());
        hashCode = prime * hashCode + ((getImportedItemCount() == null) ? 0 : getImportedItemCount().hashCode());
        hashCode = prime * hashCode + ((getFailureCode() == null) ? 0 : getFailureCode().hashCode());
        hashCode = prime * hashCode + ((getFailureMessage() == null) ? 0 : getFailureMessage().hashCode());
        return hashCode;
    }

    @Override
    public ImportTableDescription clone() {
        try {
            return (ImportTableDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.ImportTableDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
