/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glacier.model;

import java.io.Serializable;


/**
 * <p>
 * Describes an Amazon Glacier job.
 * </p>
 */
public class DescribeJobResult implements Serializable {

    /**
     * An opaque string that identifies an Amazon Glacier job.
     */
    private String jobId;

    /**
     * The job description you provided when you initiated the job.
     */
    private String jobDescription;

    /**
     * The job type. It is either ArchiveRetrieval or InventoryRetrieval.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ArchiveRetrieval, InventoryRetrieval
     */
    private String action;

    /**
     * For an ArchiveRetrieval job, this is the archive ID requested for
     * download. Otherwise, this field is null.
     */
    private String archiveId;

    /**
     * The Amazon Resource Name (ARN) of the vault from which the archive
     * retrieval was requested.
     */
    private String vaultARN;

    /**
     * The UTC date when the job was created. A string representation of ISO
     * 8601 date format, for example, "2012-03-20T17:03:43.221Z".
     */
    private String creationDate;

    /**
     * The job status. When a job is completed, you get the job's output.
     */
    private Boolean completed;

    /**
     * The status code can be InProgress, Succeeded, or Failed, and indicates
     * the status of the job.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Succeeded, Failed
     */
    private String statusCode;

    /**
     * A friendly message that describes the job status.
     */
    private String statusMessage;

    /**
     * For an ArchiveRetrieval job, this is the size in bytes of the archive
     * being requested for download. For the InventoryRetrieval job, the
     * value is null.
     */
    private Long archiveSizeInBytes;

    /**
     * For an InventoryRetrieval job, this is the size in bytes of the
     * inventory requested for download. For the ArchiveRetrieval job, the
     * value is null.
     */
    private Long inventorySizeInBytes;

    /**
     * An Amazon Simple Notification Service (Amazon SNS) topic that receives
     * notification.
     */
    private String sNSTopic;

    /**
     * The UTC time that the archive retrieval request completed. While the
     * job is in progress, the value will be null.
     */
    private String completionDate;

    /**
     * For an ArchiveRetrieval job, it is the checksum of the archive.
     * Otherwise, the value is null.
     */
    private String sHA256TreeHash;

    private String archiveSHA256TreeHash;

    private String retrievalByteRange;

    /**
     * An opaque string that identifies an Amazon Glacier job.
     *
     * @return An opaque string that identifies an Amazon Glacier job.
     */
    public String getJobId() {
        return jobId;
    }
    
    /**
     * An opaque string that identifies an Amazon Glacier job.
     *
     * @param jobId An opaque string that identifies an Amazon Glacier job.
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }
    
    /**
     * An opaque string that identifies an Amazon Glacier job.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobId An opaque string that identifies an Amazon Glacier job.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeJobResult withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * The job description you provided when you initiated the job.
     *
     * @return The job description you provided when you initiated the job.
     */
    public String getJobDescription() {
        return jobDescription;
    }
    
    /**
     * The job description you provided when you initiated the job.
     *
     * @param jobDescription The job description you provided when you initiated the job.
     */
    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }
    
    /**
     * The job description you provided when you initiated the job.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobDescription The job description you provided when you initiated the job.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeJobResult withJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
        return this;
    }

    /**
     * The job type. It is either ArchiveRetrieval or InventoryRetrieval.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ArchiveRetrieval, InventoryRetrieval
     *
     * @return The job type. It is either ArchiveRetrieval or InventoryRetrieval.
     *
     * @see ActionCode
     */
    public String getAction() {
        return action;
    }
    
    /**
     * The job type. It is either ArchiveRetrieval or InventoryRetrieval.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ArchiveRetrieval, InventoryRetrieval
     *
     * @param action The job type. It is either ArchiveRetrieval or InventoryRetrieval.
     *
     * @see ActionCode
     */
    public void setAction(String action) {
        this.action = action;
    }
    
    /**
     * The job type. It is either ArchiveRetrieval or InventoryRetrieval.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ArchiveRetrieval, InventoryRetrieval
     *
     * @param action The job type. It is either ArchiveRetrieval or InventoryRetrieval.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ActionCode
     */
    public DescribeJobResult withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * The job type. It is either ArchiveRetrieval or InventoryRetrieval.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ArchiveRetrieval, InventoryRetrieval
     *
     * @param action The job type. It is either ArchiveRetrieval or InventoryRetrieval.
     *
     * @see ActionCode
     */
    public void setAction(ActionCode action) {
        this.action = action.toString();
    }
    
    /**
     * The job type. It is either ArchiveRetrieval or InventoryRetrieval.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ArchiveRetrieval, InventoryRetrieval
     *
     * @param action The job type. It is either ArchiveRetrieval or InventoryRetrieval.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ActionCode
     */
    public DescribeJobResult withAction(ActionCode action) {
        this.action = action.toString();
        return this;
    }

    /**
     * For an ArchiveRetrieval job, this is the archive ID requested for
     * download. Otherwise, this field is null.
     *
     * @return For an ArchiveRetrieval job, this is the archive ID requested for
     *         download. Otherwise, this field is null.
     */
    public String getArchiveId() {
        return archiveId;
    }
    
    /**
     * For an ArchiveRetrieval job, this is the archive ID requested for
     * download. Otherwise, this field is null.
     *
     * @param archiveId For an ArchiveRetrieval job, this is the archive ID requested for
     *         download. Otherwise, this field is null.
     */
    public void setArchiveId(String archiveId) {
        this.archiveId = archiveId;
    }
    
    /**
     * For an ArchiveRetrieval job, this is the archive ID requested for
     * download. Otherwise, this field is null.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param archiveId For an ArchiveRetrieval job, this is the archive ID requested for
     *         download. Otherwise, this field is null.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeJobResult withArchiveId(String archiveId) {
        this.archiveId = archiveId;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the vault from which the archive
     * retrieval was requested.
     *
     * @return The Amazon Resource Name (ARN) of the vault from which the archive
     *         retrieval was requested.
     */
    public String getVaultARN() {
        return vaultARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the vault from which the archive
     * retrieval was requested.
     *
     * @param vaultARN The Amazon Resource Name (ARN) of the vault from which the archive
     *         retrieval was requested.
     */
    public void setVaultARN(String vaultARN) {
        this.vaultARN = vaultARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the vault from which the archive
     * retrieval was requested.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vaultARN The Amazon Resource Name (ARN) of the vault from which the archive
     *         retrieval was requested.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeJobResult withVaultARN(String vaultARN) {
        this.vaultARN = vaultARN;
        return this;
    }

    /**
     * The UTC date when the job was created. A string representation of ISO
     * 8601 date format, for example, "2012-03-20T17:03:43.221Z".
     *
     * @return The UTC date when the job was created. A string representation of ISO
     *         8601 date format, for example, "2012-03-20T17:03:43.221Z".
     */
    public String getCreationDate() {
        return creationDate;
    }
    
    /**
     * The UTC date when the job was created. A string representation of ISO
     * 8601 date format, for example, "2012-03-20T17:03:43.221Z".
     *
     * @param creationDate The UTC date when the job was created. A string representation of ISO
     *         8601 date format, for example, "2012-03-20T17:03:43.221Z".
     */
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
    
    /**
     * The UTC date when the job was created. A string representation of ISO
     * 8601 date format, for example, "2012-03-20T17:03:43.221Z".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param creationDate The UTC date when the job was created. A string representation of ISO
     *         8601 date format, for example, "2012-03-20T17:03:43.221Z".
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeJobResult withCreationDate(String creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * The job status. When a job is completed, you get the job's output.
     *
     * @return The job status. When a job is completed, you get the job's output.
     */
    public Boolean isCompleted() {
        return completed;
    }
    
    /**
     * The job status. When a job is completed, you get the job's output.
     *
     * @param completed The job status. When a job is completed, you get the job's output.
     */
    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
    
    /**
     * The job status. When a job is completed, you get the job's output.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param completed The job status. When a job is completed, you get the job's output.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeJobResult withCompleted(Boolean completed) {
        this.completed = completed;
        return this;
    }

    /**
     * The job status. When a job is completed, you get the job's output.
     *
     * @return The job status. When a job is completed, you get the job's output.
     */
    public Boolean getCompleted() {
        return completed;
    }

    /**
     * The status code can be InProgress, Succeeded, or Failed, and indicates
     * the status of the job.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Succeeded, Failed
     *
     * @return The status code can be InProgress, Succeeded, or Failed, and indicates
     *         the status of the job.
     *
     * @see StatusCode
     */
    public String getStatusCode() {
        return statusCode;
    }
    
    /**
     * The status code can be InProgress, Succeeded, or Failed, and indicates
     * the status of the job.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Succeeded, Failed
     *
     * @param statusCode The status code can be InProgress, Succeeded, or Failed, and indicates
     *         the status of the job.
     *
     * @see StatusCode
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
    
    /**
     * The status code can be InProgress, Succeeded, or Failed, and indicates
     * the status of the job.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Succeeded, Failed
     *
     * @param statusCode The status code can be InProgress, Succeeded, or Failed, and indicates
     *         the status of the job.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see StatusCode
     */
    public DescribeJobResult withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * The status code can be InProgress, Succeeded, or Failed, and indicates
     * the status of the job.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Succeeded, Failed
     *
     * @param statusCode The status code can be InProgress, Succeeded, or Failed, and indicates
     *         the status of the job.
     *
     * @see StatusCode
     */
    public void setStatusCode(StatusCode statusCode) {
        this.statusCode = statusCode.toString();
    }
    
    /**
     * The status code can be InProgress, Succeeded, or Failed, and indicates
     * the status of the job.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>InProgress, Succeeded, Failed
     *
     * @param statusCode The status code can be InProgress, Succeeded, or Failed, and indicates
     *         the status of the job.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see StatusCode
     */
    public DescribeJobResult withStatusCode(StatusCode statusCode) {
        this.statusCode = statusCode.toString();
        return this;
    }

    /**
     * A friendly message that describes the job status.
     *
     * @return A friendly message that describes the job status.
     */
    public String getStatusMessage() {
        return statusMessage;
    }
    
    /**
     * A friendly message that describes the job status.
     *
     * @param statusMessage A friendly message that describes the job status.
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }
    
    /**
     * A friendly message that describes the job status.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param statusMessage A friendly message that describes the job status.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeJobResult withStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    /**
     * For an ArchiveRetrieval job, this is the size in bytes of the archive
     * being requested for download. For the InventoryRetrieval job, the
     * value is null.
     *
     * @return For an ArchiveRetrieval job, this is the size in bytes of the archive
     *         being requested for download. For the InventoryRetrieval job, the
     *         value is null.
     */
    public Long getArchiveSizeInBytes() {
        return archiveSizeInBytes;
    }
    
    /**
     * For an ArchiveRetrieval job, this is the size in bytes of the archive
     * being requested for download. For the InventoryRetrieval job, the
     * value is null.
     *
     * @param archiveSizeInBytes For an ArchiveRetrieval job, this is the size in bytes of the archive
     *         being requested for download. For the InventoryRetrieval job, the
     *         value is null.
     */
    public void setArchiveSizeInBytes(Long archiveSizeInBytes) {
        this.archiveSizeInBytes = archiveSizeInBytes;
    }
    
    /**
     * For an ArchiveRetrieval job, this is the size in bytes of the archive
     * being requested for download. For the InventoryRetrieval job, the
     * value is null.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param archiveSizeInBytes For an ArchiveRetrieval job, this is the size in bytes of the archive
     *         being requested for download. For the InventoryRetrieval job, the
     *         value is null.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeJobResult withArchiveSizeInBytes(Long archiveSizeInBytes) {
        this.archiveSizeInBytes = archiveSizeInBytes;
        return this;
    }

    /**
     * For an InventoryRetrieval job, this is the size in bytes of the
     * inventory requested for download. For the ArchiveRetrieval job, the
     * value is null.
     *
     * @return For an InventoryRetrieval job, this is the size in bytes of the
     *         inventory requested for download. For the ArchiveRetrieval job, the
     *         value is null.
     */
    public Long getInventorySizeInBytes() {
        return inventorySizeInBytes;
    }
    
    /**
     * For an InventoryRetrieval job, this is the size in bytes of the
     * inventory requested for download. For the ArchiveRetrieval job, the
     * value is null.
     *
     * @param inventorySizeInBytes For an InventoryRetrieval job, this is the size in bytes of the
     *         inventory requested for download. For the ArchiveRetrieval job, the
     *         value is null.
     */
    public void setInventorySizeInBytes(Long inventorySizeInBytes) {
        this.inventorySizeInBytes = inventorySizeInBytes;
    }
    
    /**
     * For an InventoryRetrieval job, this is the size in bytes of the
     * inventory requested for download. For the ArchiveRetrieval job, the
     * value is null.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param inventorySizeInBytes For an InventoryRetrieval job, this is the size in bytes of the
     *         inventory requested for download. For the ArchiveRetrieval job, the
     *         value is null.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeJobResult withInventorySizeInBytes(Long inventorySizeInBytes) {
        this.inventorySizeInBytes = inventorySizeInBytes;
        return this;
    }

    /**
     * An Amazon Simple Notification Service (Amazon SNS) topic that receives
     * notification.
     *
     * @return An Amazon Simple Notification Service (Amazon SNS) topic that receives
     *         notification.
     */
    public String getSNSTopic() {
        return sNSTopic;
    }
    
    /**
     * An Amazon Simple Notification Service (Amazon SNS) topic that receives
     * notification.
     *
     * @param sNSTopic An Amazon Simple Notification Service (Amazon SNS) topic that receives
     *         notification.
     */
    public void setSNSTopic(String sNSTopic) {
        this.sNSTopic = sNSTopic;
    }
    
    /**
     * An Amazon Simple Notification Service (Amazon SNS) topic that receives
     * notification.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sNSTopic An Amazon Simple Notification Service (Amazon SNS) topic that receives
     *         notification.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeJobResult withSNSTopic(String sNSTopic) {
        this.sNSTopic = sNSTopic;
        return this;
    }

    /**
     * The UTC time that the archive retrieval request completed. While the
     * job is in progress, the value will be null.
     *
     * @return The UTC time that the archive retrieval request completed. While the
     *         job is in progress, the value will be null.
     */
    public String getCompletionDate() {
        return completionDate;
    }
    
    /**
     * The UTC time that the archive retrieval request completed. While the
     * job is in progress, the value will be null.
     *
     * @param completionDate The UTC time that the archive retrieval request completed. While the
     *         job is in progress, the value will be null.
     */
    public void setCompletionDate(String completionDate) {
        this.completionDate = completionDate;
    }
    
    /**
     * The UTC time that the archive retrieval request completed. While the
     * job is in progress, the value will be null.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param completionDate The UTC time that the archive retrieval request completed. While the
     *         job is in progress, the value will be null.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeJobResult withCompletionDate(String completionDate) {
        this.completionDate = completionDate;
        return this;
    }

    /**
     * For an ArchiveRetrieval job, it is the checksum of the archive.
     * Otherwise, the value is null.
     *
     * @return For an ArchiveRetrieval job, it is the checksum of the archive.
     *         Otherwise, the value is null.
     */
    public String getSHA256TreeHash() {
        return sHA256TreeHash;
    }
    
    /**
     * For an ArchiveRetrieval job, it is the checksum of the archive.
     * Otherwise, the value is null.
     *
     * @param sHA256TreeHash For an ArchiveRetrieval job, it is the checksum of the archive.
     *         Otherwise, the value is null.
     */
    public void setSHA256TreeHash(String sHA256TreeHash) {
        this.sHA256TreeHash = sHA256TreeHash;
    }
    
    /**
     * For an ArchiveRetrieval job, it is the checksum of the archive.
     * Otherwise, the value is null.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sHA256TreeHash For an ArchiveRetrieval job, it is the checksum of the archive.
     *         Otherwise, the value is null.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeJobResult withSHA256TreeHash(String sHA256TreeHash) {
        this.sHA256TreeHash = sHA256TreeHash;
        return this;
    }

    /**
     * Returns the value of the ArchiveSHA256TreeHash property for this
     * object.
     *
     * @return The value of the ArchiveSHA256TreeHash property for this object.
     */
    public String getArchiveSHA256TreeHash() {
        return archiveSHA256TreeHash;
    }
    
    /**
     * Sets the value of the ArchiveSHA256TreeHash property for this object.
     *
     * @param archiveSHA256TreeHash The new value for the ArchiveSHA256TreeHash property for this object.
     */
    public void setArchiveSHA256TreeHash(String archiveSHA256TreeHash) {
        this.archiveSHA256TreeHash = archiveSHA256TreeHash;
    }
    
    /**
     * Sets the value of the ArchiveSHA256TreeHash property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param archiveSHA256TreeHash The new value for the ArchiveSHA256TreeHash property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeJobResult withArchiveSHA256TreeHash(String archiveSHA256TreeHash) {
        this.archiveSHA256TreeHash = archiveSHA256TreeHash;
        return this;
    }

    /**
     * Returns the value of the RetrievalByteRange property for this object.
     *
     * @return The value of the RetrievalByteRange property for this object.
     */
    public String getRetrievalByteRange() {
        return retrievalByteRange;
    }
    
    /**
     * Sets the value of the RetrievalByteRange property for this object.
     *
     * @param retrievalByteRange The new value for the RetrievalByteRange property for this object.
     */
    public void setRetrievalByteRange(String retrievalByteRange) {
        this.retrievalByteRange = retrievalByteRange;
    }
    
    /**
     * Sets the value of the RetrievalByteRange property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param retrievalByteRange The new value for the RetrievalByteRange property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeJobResult withRetrievalByteRange(String retrievalByteRange) {
        this.retrievalByteRange = retrievalByteRange;
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
        if (getJobId() != null) sb.append("JobId: " + getJobId() + ",");
        if (getJobDescription() != null) sb.append("JobDescription: " + getJobDescription() + ",");
        if (getAction() != null) sb.append("Action: " + getAction() + ",");
        if (getArchiveId() != null) sb.append("ArchiveId: " + getArchiveId() + ",");
        if (getVaultARN() != null) sb.append("VaultARN: " + getVaultARN() + ",");
        if (getCreationDate() != null) sb.append("CreationDate: " + getCreationDate() + ",");
        if (isCompleted() != null) sb.append("Completed: " + isCompleted() + ",");
        if (getStatusCode() != null) sb.append("StatusCode: " + getStatusCode() + ",");
        if (getStatusMessage() != null) sb.append("StatusMessage: " + getStatusMessage() + ",");
        if (getArchiveSizeInBytes() != null) sb.append("ArchiveSizeInBytes: " + getArchiveSizeInBytes() + ",");
        if (getInventorySizeInBytes() != null) sb.append("InventorySizeInBytes: " + getInventorySizeInBytes() + ",");
        if (getSNSTopic() != null) sb.append("SNSTopic: " + getSNSTopic() + ",");
        if (getCompletionDate() != null) sb.append("CompletionDate: " + getCompletionDate() + ",");
        if (getSHA256TreeHash() != null) sb.append("SHA256TreeHash: " + getSHA256TreeHash() + ",");
        if (getArchiveSHA256TreeHash() != null) sb.append("ArchiveSHA256TreeHash: " + getArchiveSHA256TreeHash() + ",");
        if (getRetrievalByteRange() != null) sb.append("RetrievalByteRange: " + getRetrievalByteRange() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode()); 
        hashCode = prime * hashCode + ((getJobDescription() == null) ? 0 : getJobDescription().hashCode()); 
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode()); 
        hashCode = prime * hashCode + ((getArchiveId() == null) ? 0 : getArchiveId().hashCode()); 
        hashCode = prime * hashCode + ((getVaultARN() == null) ? 0 : getVaultARN().hashCode()); 
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode()); 
        hashCode = prime * hashCode + ((isCompleted() == null) ? 0 : isCompleted().hashCode()); 
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode()); 
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode()); 
        hashCode = prime * hashCode + ((getArchiveSizeInBytes() == null) ? 0 : getArchiveSizeInBytes().hashCode()); 
        hashCode = prime * hashCode + ((getInventorySizeInBytes() == null) ? 0 : getInventorySizeInBytes().hashCode()); 
        hashCode = prime * hashCode + ((getSNSTopic() == null) ? 0 : getSNSTopic().hashCode()); 
        hashCode = prime * hashCode + ((getCompletionDate() == null) ? 0 : getCompletionDate().hashCode()); 
        hashCode = prime * hashCode + ((getSHA256TreeHash() == null) ? 0 : getSHA256TreeHash().hashCode()); 
        hashCode = prime * hashCode + ((getArchiveSHA256TreeHash() == null) ? 0 : getArchiveSHA256TreeHash().hashCode()); 
        hashCode = prime * hashCode + ((getRetrievalByteRange() == null) ? 0 : getRetrievalByteRange().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeJobResult == false) return false;
        DescribeJobResult other = (DescribeJobResult)obj;
        
        if (other.getJobId() == null ^ this.getJobId() == null) return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false) return false; 
        if (other.getJobDescription() == null ^ this.getJobDescription() == null) return false;
        if (other.getJobDescription() != null && other.getJobDescription().equals(this.getJobDescription()) == false) return false; 
        if (other.getAction() == null ^ this.getAction() == null) return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false) return false; 
        if (other.getArchiveId() == null ^ this.getArchiveId() == null) return false;
        if (other.getArchiveId() != null && other.getArchiveId().equals(this.getArchiveId()) == false) return false; 
        if (other.getVaultARN() == null ^ this.getVaultARN() == null) return false;
        if (other.getVaultARN() != null && other.getVaultARN().equals(this.getVaultARN()) == false) return false; 
        if (other.getCreationDate() == null ^ this.getCreationDate() == null) return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false) return false; 
        if (other.isCompleted() == null ^ this.isCompleted() == null) return false;
        if (other.isCompleted() != null && other.isCompleted().equals(this.isCompleted()) == false) return false; 
        if (other.getStatusCode() == null ^ this.getStatusCode() == null) return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false) return false; 
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null) return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false) return false; 
        if (other.getArchiveSizeInBytes() == null ^ this.getArchiveSizeInBytes() == null) return false;
        if (other.getArchiveSizeInBytes() != null && other.getArchiveSizeInBytes().equals(this.getArchiveSizeInBytes()) == false) return false; 
        if (other.getInventorySizeInBytes() == null ^ this.getInventorySizeInBytes() == null) return false;
        if (other.getInventorySizeInBytes() != null && other.getInventorySizeInBytes().equals(this.getInventorySizeInBytes()) == false) return false; 
        if (other.getSNSTopic() == null ^ this.getSNSTopic() == null) return false;
        if (other.getSNSTopic() != null && other.getSNSTopic().equals(this.getSNSTopic()) == false) return false; 
        if (other.getCompletionDate() == null ^ this.getCompletionDate() == null) return false;
        if (other.getCompletionDate() != null && other.getCompletionDate().equals(this.getCompletionDate()) == false) return false; 
        if (other.getSHA256TreeHash() == null ^ this.getSHA256TreeHash() == null) return false;
        if (other.getSHA256TreeHash() != null && other.getSHA256TreeHash().equals(this.getSHA256TreeHash()) == false) return false; 
        if (other.getArchiveSHA256TreeHash() == null ^ this.getArchiveSHA256TreeHash() == null) return false;
        if (other.getArchiveSHA256TreeHash() != null && other.getArchiveSHA256TreeHash().equals(this.getArchiveSHA256TreeHash()) == false) return false; 
        if (other.getRetrievalByteRange() == null ^ this.getRetrievalByteRange() == null) return false;
        if (other.getRetrievalByteRange() != null && other.getRetrievalByteRange().equals(this.getRetrievalByteRange()) == false) return false; 
        return true;
    }
    
}
    