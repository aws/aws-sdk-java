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
package com.amazonaws.services.translate.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The properties of a parallel data resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/ParallelDataProperties" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParallelDataProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The custom name assigned to the parallel data resource.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the parallel data resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The description assigned to the parallel data resource.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The status of the parallel data resource. When the parallel data is ready for you to use, the status is
     * <code>ACTIVE</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The source language of the translations in the parallel data file.
     * </p>
     */
    private String sourceLanguageCode;
    /**
     * <p>
     * The language codes for the target languages available in the parallel data file. All possible target languages
     * are returned as an array.
     * </p>
     */
    private java.util.List<String> targetLanguageCodes;
    /**
     * <p>
     * Specifies the format and S3 location of the parallel data input file.
     * </p>
     */
    private ParallelDataConfig parallelDataConfig;
    /**
     * <p>
     * Additional information from Amazon Translate about the parallel data resource.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The number of UTF-8 characters that Amazon Translate imported from the parallel data input file. This number
     * includes only the characters in your translation examples. It does not include characters that are used to format
     * your file. For example, if you provided a Translation Memory Exchange (.tmx) file, this number does not include
     * the tags.
     * </p>
     */
    private Long importedDataSize;
    /**
     * <p>
     * The number of records successfully imported from the parallel data input file.
     * </p>
     */
    private Long importedRecordCount;
    /**
     * <p>
     * The number of records unsuccessfully imported from the parallel data input file.
     * </p>
     */
    private Long failedRecordCount;
    /**
     * <p>
     * The number of items in the input file that Amazon Translate skipped when you created or updated the parallel data
     * resource. For example, Amazon Translate skips empty records, empty target texts, and empty lines.
     * </p>
     */
    private Long skippedRecordCount;

    private EncryptionKey encryptionKey;
    /**
     * <p>
     * The time at which the parallel data resource was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The time at which the parallel data resource was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The status of the most recent update attempt for the parallel data resource.
     * </p>
     */
    private String latestUpdateAttemptStatus;
    /**
     * <p>
     * The time that the most recent update was attempted.
     * </p>
     */
    private java.util.Date latestUpdateAttemptAt;

    /**
     * <p>
     * The custom name assigned to the parallel data resource.
     * </p>
     * 
     * @param name
     *        The custom name assigned to the parallel data resource.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The custom name assigned to the parallel data resource.
     * </p>
     * 
     * @return The custom name assigned to the parallel data resource.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The custom name assigned to the parallel data resource.
     * </p>
     * 
     * @param name
     *        The custom name assigned to the parallel data resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParallelDataProperties withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the parallel data resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the parallel data resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the parallel data resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the parallel data resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the parallel data resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the parallel data resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParallelDataProperties withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The description assigned to the parallel data resource.
     * </p>
     * 
     * @param description
     *        The description assigned to the parallel data resource.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description assigned to the parallel data resource.
     * </p>
     * 
     * @return The description assigned to the parallel data resource.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description assigned to the parallel data resource.
     * </p>
     * 
     * @param description
     *        The description assigned to the parallel data resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParallelDataProperties withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The status of the parallel data resource. When the parallel data is ready for you to use, the status is
     * <code>ACTIVE</code>.
     * </p>
     * 
     * @param status
     *        The status of the parallel data resource. When the parallel data is ready for you to use, the status is
     *        <code>ACTIVE</code>.
     * @see ParallelDataStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the parallel data resource. When the parallel data is ready for you to use, the status is
     * <code>ACTIVE</code>.
     * </p>
     * 
     * @return The status of the parallel data resource. When the parallel data is ready for you to use, the status is
     *         <code>ACTIVE</code>.
     * @see ParallelDataStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the parallel data resource. When the parallel data is ready for you to use, the status is
     * <code>ACTIVE</code>.
     * </p>
     * 
     * @param status
     *        The status of the parallel data resource. When the parallel data is ready for you to use, the status is
     *        <code>ACTIVE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParallelDataStatus
     */

    public ParallelDataProperties withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the parallel data resource. When the parallel data is ready for you to use, the status is
     * <code>ACTIVE</code>.
     * </p>
     * 
     * @param status
     *        The status of the parallel data resource. When the parallel data is ready for you to use, the status is
     *        <code>ACTIVE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParallelDataStatus
     */

    public ParallelDataProperties withStatus(ParallelDataStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The source language of the translations in the parallel data file.
     * </p>
     * 
     * @param sourceLanguageCode
     *        The source language of the translations in the parallel data file.
     */

    public void setSourceLanguageCode(String sourceLanguageCode) {
        this.sourceLanguageCode = sourceLanguageCode;
    }

    /**
     * <p>
     * The source language of the translations in the parallel data file.
     * </p>
     * 
     * @return The source language of the translations in the parallel data file.
     */

    public String getSourceLanguageCode() {
        return this.sourceLanguageCode;
    }

    /**
     * <p>
     * The source language of the translations in the parallel data file.
     * </p>
     * 
     * @param sourceLanguageCode
     *        The source language of the translations in the parallel data file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParallelDataProperties withSourceLanguageCode(String sourceLanguageCode) {
        setSourceLanguageCode(sourceLanguageCode);
        return this;
    }

    /**
     * <p>
     * The language codes for the target languages available in the parallel data file. All possible target languages
     * are returned as an array.
     * </p>
     * 
     * @return The language codes for the target languages available in the parallel data file. All possible target
     *         languages are returned as an array.
     */

    public java.util.List<String> getTargetLanguageCodes() {
        return targetLanguageCodes;
    }

    /**
     * <p>
     * The language codes for the target languages available in the parallel data file. All possible target languages
     * are returned as an array.
     * </p>
     * 
     * @param targetLanguageCodes
     *        The language codes for the target languages available in the parallel data file. All possible target
     *        languages are returned as an array.
     */

    public void setTargetLanguageCodes(java.util.Collection<String> targetLanguageCodes) {
        if (targetLanguageCodes == null) {
            this.targetLanguageCodes = null;
            return;
        }

        this.targetLanguageCodes = new java.util.ArrayList<String>(targetLanguageCodes);
    }

    /**
     * <p>
     * The language codes for the target languages available in the parallel data file. All possible target languages
     * are returned as an array.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetLanguageCodes(java.util.Collection)} or {@link #withTargetLanguageCodes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param targetLanguageCodes
     *        The language codes for the target languages available in the parallel data file. All possible target
     *        languages are returned as an array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParallelDataProperties withTargetLanguageCodes(String... targetLanguageCodes) {
        if (this.targetLanguageCodes == null) {
            setTargetLanguageCodes(new java.util.ArrayList<String>(targetLanguageCodes.length));
        }
        for (String ele : targetLanguageCodes) {
            this.targetLanguageCodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The language codes for the target languages available in the parallel data file. All possible target languages
     * are returned as an array.
     * </p>
     * 
     * @param targetLanguageCodes
     *        The language codes for the target languages available in the parallel data file. All possible target
     *        languages are returned as an array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParallelDataProperties withTargetLanguageCodes(java.util.Collection<String> targetLanguageCodes) {
        setTargetLanguageCodes(targetLanguageCodes);
        return this;
    }

    /**
     * <p>
     * Specifies the format and S3 location of the parallel data input file.
     * </p>
     * 
     * @param parallelDataConfig
     *        Specifies the format and S3 location of the parallel data input file.
     */

    public void setParallelDataConfig(ParallelDataConfig parallelDataConfig) {
        this.parallelDataConfig = parallelDataConfig;
    }

    /**
     * <p>
     * Specifies the format and S3 location of the parallel data input file.
     * </p>
     * 
     * @return Specifies the format and S3 location of the parallel data input file.
     */

    public ParallelDataConfig getParallelDataConfig() {
        return this.parallelDataConfig;
    }

    /**
     * <p>
     * Specifies the format and S3 location of the parallel data input file.
     * </p>
     * 
     * @param parallelDataConfig
     *        Specifies the format and S3 location of the parallel data input file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParallelDataProperties withParallelDataConfig(ParallelDataConfig parallelDataConfig) {
        setParallelDataConfig(parallelDataConfig);
        return this;
    }

    /**
     * <p>
     * Additional information from Amazon Translate about the parallel data resource.
     * </p>
     * 
     * @param message
     *        Additional information from Amazon Translate about the parallel data resource.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Additional information from Amazon Translate about the parallel data resource.
     * </p>
     * 
     * @return Additional information from Amazon Translate about the parallel data resource.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Additional information from Amazon Translate about the parallel data resource.
     * </p>
     * 
     * @param message
     *        Additional information from Amazon Translate about the parallel data resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParallelDataProperties withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The number of UTF-8 characters that Amazon Translate imported from the parallel data input file. This number
     * includes only the characters in your translation examples. It does not include characters that are used to format
     * your file. For example, if you provided a Translation Memory Exchange (.tmx) file, this number does not include
     * the tags.
     * </p>
     * 
     * @param importedDataSize
     *        The number of UTF-8 characters that Amazon Translate imported from the parallel data input file. This
     *        number includes only the characters in your translation examples. It does not include characters that are
     *        used to format your file. For example, if you provided a Translation Memory Exchange (.tmx) file, this
     *        number does not include the tags.
     */

    public void setImportedDataSize(Long importedDataSize) {
        this.importedDataSize = importedDataSize;
    }

    /**
     * <p>
     * The number of UTF-8 characters that Amazon Translate imported from the parallel data input file. This number
     * includes only the characters in your translation examples. It does not include characters that are used to format
     * your file. For example, if you provided a Translation Memory Exchange (.tmx) file, this number does not include
     * the tags.
     * </p>
     * 
     * @return The number of UTF-8 characters that Amazon Translate imported from the parallel data input file. This
     *         number includes only the characters in your translation examples. It does not include characters that are
     *         used to format your file. For example, if you provided a Translation Memory Exchange (.tmx) file, this
     *         number does not include the tags.
     */

    public Long getImportedDataSize() {
        return this.importedDataSize;
    }

    /**
     * <p>
     * The number of UTF-8 characters that Amazon Translate imported from the parallel data input file. This number
     * includes only the characters in your translation examples. It does not include characters that are used to format
     * your file. For example, if you provided a Translation Memory Exchange (.tmx) file, this number does not include
     * the tags.
     * </p>
     * 
     * @param importedDataSize
     *        The number of UTF-8 characters that Amazon Translate imported from the parallel data input file. This
     *        number includes only the characters in your translation examples. It does not include characters that are
     *        used to format your file. For example, if you provided a Translation Memory Exchange (.tmx) file, this
     *        number does not include the tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParallelDataProperties withImportedDataSize(Long importedDataSize) {
        setImportedDataSize(importedDataSize);
        return this;
    }

    /**
     * <p>
     * The number of records successfully imported from the parallel data input file.
     * </p>
     * 
     * @param importedRecordCount
     *        The number of records successfully imported from the parallel data input file.
     */

    public void setImportedRecordCount(Long importedRecordCount) {
        this.importedRecordCount = importedRecordCount;
    }

    /**
     * <p>
     * The number of records successfully imported from the parallel data input file.
     * </p>
     * 
     * @return The number of records successfully imported from the parallel data input file.
     */

    public Long getImportedRecordCount() {
        return this.importedRecordCount;
    }

    /**
     * <p>
     * The number of records successfully imported from the parallel data input file.
     * </p>
     * 
     * @param importedRecordCount
     *        The number of records successfully imported from the parallel data input file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParallelDataProperties withImportedRecordCount(Long importedRecordCount) {
        setImportedRecordCount(importedRecordCount);
        return this;
    }

    /**
     * <p>
     * The number of records unsuccessfully imported from the parallel data input file.
     * </p>
     * 
     * @param failedRecordCount
     *        The number of records unsuccessfully imported from the parallel data input file.
     */

    public void setFailedRecordCount(Long failedRecordCount) {
        this.failedRecordCount = failedRecordCount;
    }

    /**
     * <p>
     * The number of records unsuccessfully imported from the parallel data input file.
     * </p>
     * 
     * @return The number of records unsuccessfully imported from the parallel data input file.
     */

    public Long getFailedRecordCount() {
        return this.failedRecordCount;
    }

    /**
     * <p>
     * The number of records unsuccessfully imported from the parallel data input file.
     * </p>
     * 
     * @param failedRecordCount
     *        The number of records unsuccessfully imported from the parallel data input file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParallelDataProperties withFailedRecordCount(Long failedRecordCount) {
        setFailedRecordCount(failedRecordCount);
        return this;
    }

    /**
     * <p>
     * The number of items in the input file that Amazon Translate skipped when you created or updated the parallel data
     * resource. For example, Amazon Translate skips empty records, empty target texts, and empty lines.
     * </p>
     * 
     * @param skippedRecordCount
     *        The number of items in the input file that Amazon Translate skipped when you created or updated the
     *        parallel data resource. For example, Amazon Translate skips empty records, empty target texts, and empty
     *        lines.
     */

    public void setSkippedRecordCount(Long skippedRecordCount) {
        this.skippedRecordCount = skippedRecordCount;
    }

    /**
     * <p>
     * The number of items in the input file that Amazon Translate skipped when you created or updated the parallel data
     * resource. For example, Amazon Translate skips empty records, empty target texts, and empty lines.
     * </p>
     * 
     * @return The number of items in the input file that Amazon Translate skipped when you created or updated the
     *         parallel data resource. For example, Amazon Translate skips empty records, empty target texts, and empty
     *         lines.
     */

    public Long getSkippedRecordCount() {
        return this.skippedRecordCount;
    }

    /**
     * <p>
     * The number of items in the input file that Amazon Translate skipped when you created or updated the parallel data
     * resource. For example, Amazon Translate skips empty records, empty target texts, and empty lines.
     * </p>
     * 
     * @param skippedRecordCount
     *        The number of items in the input file that Amazon Translate skipped when you created or updated the
     *        parallel data resource. For example, Amazon Translate skips empty records, empty target texts, and empty
     *        lines.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParallelDataProperties withSkippedRecordCount(Long skippedRecordCount) {
        setSkippedRecordCount(skippedRecordCount);
        return this;
    }

    /**
     * @param encryptionKey
     */

    public void setEncryptionKey(EncryptionKey encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    /**
     * @return
     */

    public EncryptionKey getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * @param encryptionKey
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParallelDataProperties withEncryptionKey(EncryptionKey encryptionKey) {
        setEncryptionKey(encryptionKey);
        return this;
    }

    /**
     * <p>
     * The time at which the parallel data resource was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the parallel data resource was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time at which the parallel data resource was created.
     * </p>
     * 
     * @return The time at which the parallel data resource was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time at which the parallel data resource was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the parallel data resource was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParallelDataProperties withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The time at which the parallel data resource was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time at which the parallel data resource was last updated.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The time at which the parallel data resource was last updated.
     * </p>
     * 
     * @return The time at which the parallel data resource was last updated.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The time at which the parallel data resource was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time at which the parallel data resource was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParallelDataProperties withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The status of the most recent update attempt for the parallel data resource.
     * </p>
     * 
     * @param latestUpdateAttemptStatus
     *        The status of the most recent update attempt for the parallel data resource.
     * @see ParallelDataStatus
     */

    public void setLatestUpdateAttemptStatus(String latestUpdateAttemptStatus) {
        this.latestUpdateAttemptStatus = latestUpdateAttemptStatus;
    }

    /**
     * <p>
     * The status of the most recent update attempt for the parallel data resource.
     * </p>
     * 
     * @return The status of the most recent update attempt for the parallel data resource.
     * @see ParallelDataStatus
     */

    public String getLatestUpdateAttemptStatus() {
        return this.latestUpdateAttemptStatus;
    }

    /**
     * <p>
     * The status of the most recent update attempt for the parallel data resource.
     * </p>
     * 
     * @param latestUpdateAttemptStatus
     *        The status of the most recent update attempt for the parallel data resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParallelDataStatus
     */

    public ParallelDataProperties withLatestUpdateAttemptStatus(String latestUpdateAttemptStatus) {
        setLatestUpdateAttemptStatus(latestUpdateAttemptStatus);
        return this;
    }

    /**
     * <p>
     * The status of the most recent update attempt for the parallel data resource.
     * </p>
     * 
     * @param latestUpdateAttemptStatus
     *        The status of the most recent update attempt for the parallel data resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParallelDataStatus
     */

    public ParallelDataProperties withLatestUpdateAttemptStatus(ParallelDataStatus latestUpdateAttemptStatus) {
        this.latestUpdateAttemptStatus = latestUpdateAttemptStatus.toString();
        return this;
    }

    /**
     * <p>
     * The time that the most recent update was attempted.
     * </p>
     * 
     * @param latestUpdateAttemptAt
     *        The time that the most recent update was attempted.
     */

    public void setLatestUpdateAttemptAt(java.util.Date latestUpdateAttemptAt) {
        this.latestUpdateAttemptAt = latestUpdateAttemptAt;
    }

    /**
     * <p>
     * The time that the most recent update was attempted.
     * </p>
     * 
     * @return The time that the most recent update was attempted.
     */

    public java.util.Date getLatestUpdateAttemptAt() {
        return this.latestUpdateAttemptAt;
    }

    /**
     * <p>
     * The time that the most recent update was attempted.
     * </p>
     * 
     * @param latestUpdateAttemptAt
     *        The time that the most recent update was attempted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParallelDataProperties withLatestUpdateAttemptAt(java.util.Date latestUpdateAttemptAt) {
        setLatestUpdateAttemptAt(latestUpdateAttemptAt);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSourceLanguageCode() != null)
            sb.append("SourceLanguageCode: ").append(getSourceLanguageCode()).append(",");
        if (getTargetLanguageCodes() != null)
            sb.append("TargetLanguageCodes: ").append(getTargetLanguageCodes()).append(",");
        if (getParallelDataConfig() != null)
            sb.append("ParallelDataConfig: ").append(getParallelDataConfig()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getImportedDataSize() != null)
            sb.append("ImportedDataSize: ").append(getImportedDataSize()).append(",");
        if (getImportedRecordCount() != null)
            sb.append("ImportedRecordCount: ").append(getImportedRecordCount()).append(",");
        if (getFailedRecordCount() != null)
            sb.append("FailedRecordCount: ").append(getFailedRecordCount()).append(",");
        if (getSkippedRecordCount() != null)
            sb.append("SkippedRecordCount: ").append(getSkippedRecordCount()).append(",");
        if (getEncryptionKey() != null)
            sb.append("EncryptionKey: ").append(getEncryptionKey()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getLatestUpdateAttemptStatus() != null)
            sb.append("LatestUpdateAttemptStatus: ").append(getLatestUpdateAttemptStatus()).append(",");
        if (getLatestUpdateAttemptAt() != null)
            sb.append("LatestUpdateAttemptAt: ").append(getLatestUpdateAttemptAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParallelDataProperties == false)
            return false;
        ParallelDataProperties other = (ParallelDataProperties) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSourceLanguageCode() == null ^ this.getSourceLanguageCode() == null)
            return false;
        if (other.getSourceLanguageCode() != null && other.getSourceLanguageCode().equals(this.getSourceLanguageCode()) == false)
            return false;
        if (other.getTargetLanguageCodes() == null ^ this.getTargetLanguageCodes() == null)
            return false;
        if (other.getTargetLanguageCodes() != null && other.getTargetLanguageCodes().equals(this.getTargetLanguageCodes()) == false)
            return false;
        if (other.getParallelDataConfig() == null ^ this.getParallelDataConfig() == null)
            return false;
        if (other.getParallelDataConfig() != null && other.getParallelDataConfig().equals(this.getParallelDataConfig()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getImportedDataSize() == null ^ this.getImportedDataSize() == null)
            return false;
        if (other.getImportedDataSize() != null && other.getImportedDataSize().equals(this.getImportedDataSize()) == false)
            return false;
        if (other.getImportedRecordCount() == null ^ this.getImportedRecordCount() == null)
            return false;
        if (other.getImportedRecordCount() != null && other.getImportedRecordCount().equals(this.getImportedRecordCount()) == false)
            return false;
        if (other.getFailedRecordCount() == null ^ this.getFailedRecordCount() == null)
            return false;
        if (other.getFailedRecordCount() != null && other.getFailedRecordCount().equals(this.getFailedRecordCount()) == false)
            return false;
        if (other.getSkippedRecordCount() == null ^ this.getSkippedRecordCount() == null)
            return false;
        if (other.getSkippedRecordCount() != null && other.getSkippedRecordCount().equals(this.getSkippedRecordCount()) == false)
            return false;
        if (other.getEncryptionKey() == null ^ this.getEncryptionKey() == null)
            return false;
        if (other.getEncryptionKey() != null && other.getEncryptionKey().equals(this.getEncryptionKey()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getLatestUpdateAttemptStatus() == null ^ this.getLatestUpdateAttemptStatus() == null)
            return false;
        if (other.getLatestUpdateAttemptStatus() != null && other.getLatestUpdateAttemptStatus().equals(this.getLatestUpdateAttemptStatus()) == false)
            return false;
        if (other.getLatestUpdateAttemptAt() == null ^ this.getLatestUpdateAttemptAt() == null)
            return false;
        if (other.getLatestUpdateAttemptAt() != null && other.getLatestUpdateAttemptAt().equals(this.getLatestUpdateAttemptAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSourceLanguageCode() == null) ? 0 : getSourceLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getTargetLanguageCodes() == null) ? 0 : getTargetLanguageCodes().hashCode());
        hashCode = prime * hashCode + ((getParallelDataConfig() == null) ? 0 : getParallelDataConfig().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getImportedDataSize() == null) ? 0 : getImportedDataSize().hashCode());
        hashCode = prime * hashCode + ((getImportedRecordCount() == null) ? 0 : getImportedRecordCount().hashCode());
        hashCode = prime * hashCode + ((getFailedRecordCount() == null) ? 0 : getFailedRecordCount().hashCode());
        hashCode = prime * hashCode + ((getSkippedRecordCount() == null) ? 0 : getSkippedRecordCount().hashCode());
        hashCode = prime * hashCode + ((getEncryptionKey() == null) ? 0 : getEncryptionKey().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getLatestUpdateAttemptStatus() == null) ? 0 : getLatestUpdateAttemptStatus().hashCode());
        hashCode = prime * hashCode + ((getLatestUpdateAttemptAt() == null) ? 0 : getLatestUpdateAttemptAt().hashCode());
        return hashCode;
    }

    @Override
    public ParallelDataProperties clone() {
        try {
            return (ParallelDataProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.translate.model.transform.ParallelDataPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
