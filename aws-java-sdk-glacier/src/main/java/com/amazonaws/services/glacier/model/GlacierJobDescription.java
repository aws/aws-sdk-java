/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glacier.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the description of an Amazon Glacier job.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GlacierJobDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An opaque string that identifies an Amazon Glacier job.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The job description provided when initiating the job.
     * </p>
     */
    private String jobDescription;
    /**
     * <p>
     * The job type. This value is either <code>ArchiveRetrieval</code>, <code>InventoryRetrieval</code>, or
     * <code>Select</code>.
     * </p>
     */
    private String action;
    /**
     * <p>
     * The archive ID requested for a select job or archive retrieval. Otherwise, this field is null.
     * </p>
     */
    private String archiveId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vault from which an archive retrieval was requested.
     * </p>
     */
    private String vaultARN;
    /**
     * <p>
     * The UTC date when the job was created. This value is a string representation of ISO 8601 date format, for example
     * <code>"2012-03-20T17:03:43.221Z"</code>.
     * </p>
     */
    private String creationDate;
    /**
     * <p>
     * The job status. When a job is completed, you get the job's output using Get Job Output (GET output).
     * </p>
     */
    private Boolean completed;
    /**
     * <p>
     * The status code can be <code>InProgress</code>, <code>Succeeded</code>, or <code>Failed</code>, and indicates the
     * status of the job.
     * </p>
     */
    private String statusCode;
    /**
     * <p>
     * A friendly message that describes the job status.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * For an archive retrieval job, this value is the size in bytes of the archive being requested for download. For an
     * inventory retrieval or select job, this value is null.
     * </p>
     */
    private Long archiveSizeInBytes;
    /**
     * <p>
     * For an inventory retrieval job, this value is the size in bytes of the inventory requested for download. For an
     * archive retrieval or select job, this value is null.
     * </p>
     */
    private Long inventorySizeInBytes;
    /**
     * <p>
     * An Amazon SNS topic that receives notification.
     * </p>
     */
    private String sNSTopic;
    /**
     * <p>
     * The UTC time that the job request completed. While the job is in progress, the value is null.
     * </p>
     */
    private String completionDate;
    /**
     * <p>
     * For an archive retrieval job, this value is the checksum of the archive. Otherwise, this value is null.
     * </p>
     * <p>
     * The SHA256 tree hash value for the requested range of an archive. If the <b>InitiateJob</b> request for an
     * archive specified a tree-hash aligned range, then this field returns a value.
     * </p>
     * <p>
     * If the whole archive is retrieved, this value is the same as the ArchiveSHA256TreeHash value.
     * </p>
     * <p>
     * This field is null for the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Archive retrieval jobs that specify a range that is not tree-hash aligned
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Archival jobs that specify a range that is equal to the whole archive, when the job status is
     * <code>InProgress</code>
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Inventory jobs
     * </p>
     * </li>
     * <li>
     * <p>
     * Select jobs
     * </p>
     * </li>
     * </ul>
     */
    private String sHA256TreeHash;
    /**
     * <p>
     * The SHA256 tree hash of the entire archive for an archive retrieval. For inventory retrieval or select jobs, this
     * field is null.
     * </p>
     */
    private String archiveSHA256TreeHash;
    /**
     * <p>
     * The retrieved byte range for archive retrieval jobs in the form <i>StartByteValue</i>-<i>EndByteValue</i>. If no
     * range was specified in the archive retrieval, then the whole archive is retrieved. In this case,
     * <i>StartByteValue</i> equals 0 and <i>EndByteValue</i> equals the size of the archive minus 1. For inventory
     * retrieval or select jobs, this field is null.
     * </p>
     */
    private String retrievalByteRange;
    /**
     * <p>
     * The tier to use for a select or an archive retrieval. Valid values are <code>Expedited</code>,
     * <code>Standard</code>, or <code>Bulk</code>. <code>Standard</code> is the default.
     * </p>
     */
    private String tier;
    /**
     * <p>
     * Parameters used for range inventory retrieval.
     * </p>
     */
    private InventoryRetrievalJobDescription inventoryRetrievalParameters;
    /**
     * <p>
     * Contains the job output location.
     * </p>
     */
    private String jobOutputPath;
    /**
     * <p>
     * Contains the parameters used for a select.
     * </p>
     */
    private SelectParameters selectParameters;
    /**
     * <p>
     * Contains the location where the data from the select job is stored.
     * </p>
     */
    private OutputLocation outputLocation;

    /**
     * <p>
     * An opaque string that identifies an Amazon Glacier job.
     * </p>
     * 
     * @param jobId
     *        An opaque string that identifies an Amazon Glacier job.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * An opaque string that identifies an Amazon Glacier job.
     * </p>
     * 
     * @return An opaque string that identifies an Amazon Glacier job.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * An opaque string that identifies an Amazon Glacier job.
     * </p>
     * 
     * @param jobId
     *        An opaque string that identifies an Amazon Glacier job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlacierJobDescription withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The job description provided when initiating the job.
     * </p>
     * 
     * @param jobDescription
     *        The job description provided when initiating the job.
     */

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    /**
     * <p>
     * The job description provided when initiating the job.
     * </p>
     * 
     * @return The job description provided when initiating the job.
     */

    public String getJobDescription() {
        return this.jobDescription;
    }

    /**
     * <p>
     * The job description provided when initiating the job.
     * </p>
     * 
     * @param jobDescription
     *        The job description provided when initiating the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlacierJobDescription withJobDescription(String jobDescription) {
        setJobDescription(jobDescription);
        return this;
    }

    /**
     * <p>
     * The job type. This value is either <code>ArchiveRetrieval</code>, <code>InventoryRetrieval</code>, or
     * <code>Select</code>.
     * </p>
     * 
     * @param action
     *        The job type. This value is either <code>ArchiveRetrieval</code>, <code>InventoryRetrieval</code>, or
     *        <code>Select</code>.
     * @see ActionCode
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The job type. This value is either <code>ArchiveRetrieval</code>, <code>InventoryRetrieval</code>, or
     * <code>Select</code>.
     * </p>
     * 
     * @return The job type. This value is either <code>ArchiveRetrieval</code>, <code>InventoryRetrieval</code>, or
     *         <code>Select</code>.
     * @see ActionCode
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The job type. This value is either <code>ArchiveRetrieval</code>, <code>InventoryRetrieval</code>, or
     * <code>Select</code>.
     * </p>
     * 
     * @param action
     *        The job type. This value is either <code>ArchiveRetrieval</code>, <code>InventoryRetrieval</code>, or
     *        <code>Select</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionCode
     */

    public GlacierJobDescription withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The job type. This value is either <code>ArchiveRetrieval</code>, <code>InventoryRetrieval</code>, or
     * <code>Select</code>.
     * </p>
     * 
     * @param action
     *        The job type. This value is either <code>ArchiveRetrieval</code>, <code>InventoryRetrieval</code>, or
     *        <code>Select</code>.
     * @see ActionCode
     */

    public void setAction(ActionCode action) {
        withAction(action);
    }

    /**
     * <p>
     * The job type. This value is either <code>ArchiveRetrieval</code>, <code>InventoryRetrieval</code>, or
     * <code>Select</code>.
     * </p>
     * 
     * @param action
     *        The job type. This value is either <code>ArchiveRetrieval</code>, <code>InventoryRetrieval</code>, or
     *        <code>Select</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionCode
     */

    public GlacierJobDescription withAction(ActionCode action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The archive ID requested for a select job or archive retrieval. Otherwise, this field is null.
     * </p>
     * 
     * @param archiveId
     *        The archive ID requested for a select job or archive retrieval. Otherwise, this field is null.
     */

    public void setArchiveId(String archiveId) {
        this.archiveId = archiveId;
    }

    /**
     * <p>
     * The archive ID requested for a select job or archive retrieval. Otherwise, this field is null.
     * </p>
     * 
     * @return The archive ID requested for a select job or archive retrieval. Otherwise, this field is null.
     */

    public String getArchiveId() {
        return this.archiveId;
    }

    /**
     * <p>
     * The archive ID requested for a select job or archive retrieval. Otherwise, this field is null.
     * </p>
     * 
     * @param archiveId
     *        The archive ID requested for a select job or archive retrieval. Otherwise, this field is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlacierJobDescription withArchiveId(String archiveId) {
        setArchiveId(archiveId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vault from which an archive retrieval was requested.
     * </p>
     * 
     * @param vaultARN
     *        The Amazon Resource Name (ARN) of the vault from which an archive retrieval was requested.
     */

    public void setVaultARN(String vaultARN) {
        this.vaultARN = vaultARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vault from which an archive retrieval was requested.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the vault from which an archive retrieval was requested.
     */

    public String getVaultARN() {
        return this.vaultARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the vault from which an archive retrieval was requested.
     * </p>
     * 
     * @param vaultARN
     *        The Amazon Resource Name (ARN) of the vault from which an archive retrieval was requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlacierJobDescription withVaultARN(String vaultARN) {
        setVaultARN(vaultARN);
        return this;
    }

    /**
     * <p>
     * The UTC date when the job was created. This value is a string representation of ISO 8601 date format, for example
     * <code>"2012-03-20T17:03:43.221Z"</code>.
     * </p>
     * 
     * @param creationDate
     *        The UTC date when the job was created. This value is a string representation of ISO 8601 date format, for
     *        example <code>"2012-03-20T17:03:43.221Z"</code>.
     */

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The UTC date when the job was created. This value is a string representation of ISO 8601 date format, for example
     * <code>"2012-03-20T17:03:43.221Z"</code>.
     * </p>
     * 
     * @return The UTC date when the job was created. This value is a string representation of ISO 8601 date format, for
     *         example <code>"2012-03-20T17:03:43.221Z"</code>.
     */

    public String getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The UTC date when the job was created. This value is a string representation of ISO 8601 date format, for example
     * <code>"2012-03-20T17:03:43.221Z"</code>.
     * </p>
     * 
     * @param creationDate
     *        The UTC date when the job was created. This value is a string representation of ISO 8601 date format, for
     *        example <code>"2012-03-20T17:03:43.221Z"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlacierJobDescription withCreationDate(String creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The job status. When a job is completed, you get the job's output using Get Job Output (GET output).
     * </p>
     * 
     * @param completed
     *        The job status. When a job is completed, you get the job's output using Get Job Output (GET output).
     */

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    /**
     * <p>
     * The job status. When a job is completed, you get the job's output using Get Job Output (GET output).
     * </p>
     * 
     * @return The job status. When a job is completed, you get the job's output using Get Job Output (GET output).
     */

    public Boolean getCompleted() {
        return this.completed;
    }

    /**
     * <p>
     * The job status. When a job is completed, you get the job's output using Get Job Output (GET output).
     * </p>
     * 
     * @param completed
     *        The job status. When a job is completed, you get the job's output using Get Job Output (GET output).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlacierJobDescription withCompleted(Boolean completed) {
        setCompleted(completed);
        return this;
    }

    /**
     * <p>
     * The job status. When a job is completed, you get the job's output using Get Job Output (GET output).
     * </p>
     * 
     * @return The job status. When a job is completed, you get the job's output using Get Job Output (GET output).
     */

    public Boolean isCompleted() {
        return this.completed;
    }

    /**
     * <p>
     * The status code can be <code>InProgress</code>, <code>Succeeded</code>, or <code>Failed</code>, and indicates the
     * status of the job.
     * </p>
     * 
     * @param statusCode
     *        The status code can be <code>InProgress</code>, <code>Succeeded</code>, or <code>Failed</code>, and
     *        indicates the status of the job.
     * @see StatusCode
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The status code can be <code>InProgress</code>, <code>Succeeded</code>, or <code>Failed</code>, and indicates the
     * status of the job.
     * </p>
     * 
     * @return The status code can be <code>InProgress</code>, <code>Succeeded</code>, or <code>Failed</code>, and
     *         indicates the status of the job.
     * @see StatusCode
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The status code can be <code>InProgress</code>, <code>Succeeded</code>, or <code>Failed</code>, and indicates the
     * status of the job.
     * </p>
     * 
     * @param statusCode
     *        The status code can be <code>InProgress</code>, <code>Succeeded</code>, or <code>Failed</code>, and
     *        indicates the status of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusCode
     */

    public GlacierJobDescription withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * The status code can be <code>InProgress</code>, <code>Succeeded</code>, or <code>Failed</code>, and indicates the
     * status of the job.
     * </p>
     * 
     * @param statusCode
     *        The status code can be <code>InProgress</code>, <code>Succeeded</code>, or <code>Failed</code>, and
     *        indicates the status of the job.
     * @see StatusCode
     */

    public void setStatusCode(StatusCode statusCode) {
        withStatusCode(statusCode);
    }

    /**
     * <p>
     * The status code can be <code>InProgress</code>, <code>Succeeded</code>, or <code>Failed</code>, and indicates the
     * status of the job.
     * </p>
     * 
     * @param statusCode
     *        The status code can be <code>InProgress</code>, <code>Succeeded</code>, or <code>Failed</code>, and
     *        indicates the status of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusCode
     */

    public GlacierJobDescription withStatusCode(StatusCode statusCode) {
        this.statusCode = statusCode.toString();
        return this;
    }

    /**
     * <p>
     * A friendly message that describes the job status.
     * </p>
     * 
     * @param statusMessage
     *        A friendly message that describes the job status.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A friendly message that describes the job status.
     * </p>
     * 
     * @return A friendly message that describes the job status.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * A friendly message that describes the job status.
     * </p>
     * 
     * @param statusMessage
     *        A friendly message that describes the job status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlacierJobDescription withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * For an archive retrieval job, this value is the size in bytes of the archive being requested for download. For an
     * inventory retrieval or select job, this value is null.
     * </p>
     * 
     * @param archiveSizeInBytes
     *        For an archive retrieval job, this value is the size in bytes of the archive being requested for download.
     *        For an inventory retrieval or select job, this value is null.
     */

    public void setArchiveSizeInBytes(Long archiveSizeInBytes) {
        this.archiveSizeInBytes = archiveSizeInBytes;
    }

    /**
     * <p>
     * For an archive retrieval job, this value is the size in bytes of the archive being requested for download. For an
     * inventory retrieval or select job, this value is null.
     * </p>
     * 
     * @return For an archive retrieval job, this value is the size in bytes of the archive being requested for
     *         download. For an inventory retrieval or select job, this value is null.
     */

    public Long getArchiveSizeInBytes() {
        return this.archiveSizeInBytes;
    }

    /**
     * <p>
     * For an archive retrieval job, this value is the size in bytes of the archive being requested for download. For an
     * inventory retrieval or select job, this value is null.
     * </p>
     * 
     * @param archiveSizeInBytes
     *        For an archive retrieval job, this value is the size in bytes of the archive being requested for download.
     *        For an inventory retrieval or select job, this value is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlacierJobDescription withArchiveSizeInBytes(Long archiveSizeInBytes) {
        setArchiveSizeInBytes(archiveSizeInBytes);
        return this;
    }

    /**
     * <p>
     * For an inventory retrieval job, this value is the size in bytes of the inventory requested for download. For an
     * archive retrieval or select job, this value is null.
     * </p>
     * 
     * @param inventorySizeInBytes
     *        For an inventory retrieval job, this value is the size in bytes of the inventory requested for download.
     *        For an archive retrieval or select job, this value is null.
     */

    public void setInventorySizeInBytes(Long inventorySizeInBytes) {
        this.inventorySizeInBytes = inventorySizeInBytes;
    }

    /**
     * <p>
     * For an inventory retrieval job, this value is the size in bytes of the inventory requested for download. For an
     * archive retrieval or select job, this value is null.
     * </p>
     * 
     * @return For an inventory retrieval job, this value is the size in bytes of the inventory requested for download.
     *         For an archive retrieval or select job, this value is null.
     */

    public Long getInventorySizeInBytes() {
        return this.inventorySizeInBytes;
    }

    /**
     * <p>
     * For an inventory retrieval job, this value is the size in bytes of the inventory requested for download. For an
     * archive retrieval or select job, this value is null.
     * </p>
     * 
     * @param inventorySizeInBytes
     *        For an inventory retrieval job, this value is the size in bytes of the inventory requested for download.
     *        For an archive retrieval or select job, this value is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlacierJobDescription withInventorySizeInBytes(Long inventorySizeInBytes) {
        setInventorySizeInBytes(inventorySizeInBytes);
        return this;
    }

    /**
     * <p>
     * An Amazon SNS topic that receives notification.
     * </p>
     * 
     * @param sNSTopic
     *        An Amazon SNS topic that receives notification.
     */

    public void setSNSTopic(String sNSTopic) {
        this.sNSTopic = sNSTopic;
    }

    /**
     * <p>
     * An Amazon SNS topic that receives notification.
     * </p>
     * 
     * @return An Amazon SNS topic that receives notification.
     */

    public String getSNSTopic() {
        return this.sNSTopic;
    }

    /**
     * <p>
     * An Amazon SNS topic that receives notification.
     * </p>
     * 
     * @param sNSTopic
     *        An Amazon SNS topic that receives notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlacierJobDescription withSNSTopic(String sNSTopic) {
        setSNSTopic(sNSTopic);
        return this;
    }

    /**
     * <p>
     * The UTC time that the job request completed. While the job is in progress, the value is null.
     * </p>
     * 
     * @param completionDate
     *        The UTC time that the job request completed. While the job is in progress, the value is null.
     */

    public void setCompletionDate(String completionDate) {
        this.completionDate = completionDate;
    }

    /**
     * <p>
     * The UTC time that the job request completed. While the job is in progress, the value is null.
     * </p>
     * 
     * @return The UTC time that the job request completed. While the job is in progress, the value is null.
     */

    public String getCompletionDate() {
        return this.completionDate;
    }

    /**
     * <p>
     * The UTC time that the job request completed. While the job is in progress, the value is null.
     * </p>
     * 
     * @param completionDate
     *        The UTC time that the job request completed. While the job is in progress, the value is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlacierJobDescription withCompletionDate(String completionDate) {
        setCompletionDate(completionDate);
        return this;
    }

    /**
     * <p>
     * For an archive retrieval job, this value is the checksum of the archive. Otherwise, this value is null.
     * </p>
     * <p>
     * The SHA256 tree hash value for the requested range of an archive. If the <b>InitiateJob</b> request for an
     * archive specified a tree-hash aligned range, then this field returns a value.
     * </p>
     * <p>
     * If the whole archive is retrieved, this value is the same as the ArchiveSHA256TreeHash value.
     * </p>
     * <p>
     * This field is null for the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Archive retrieval jobs that specify a range that is not tree-hash aligned
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Archival jobs that specify a range that is equal to the whole archive, when the job status is
     * <code>InProgress</code>
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Inventory jobs
     * </p>
     * </li>
     * <li>
     * <p>
     * Select jobs
     * </p>
     * </li>
     * </ul>
     * 
     * @param sHA256TreeHash
     *        For an archive retrieval job, this value is the checksum of the archive. Otherwise, this value is
     *        null.</p>
     *        <p>
     *        The SHA256 tree hash value for the requested range of an archive. If the <b>InitiateJob</b> request for an
     *        archive specified a tree-hash aligned range, then this field returns a value.
     *        </p>
     *        <p>
     *        If the whole archive is retrieved, this value is the same as the ArchiveSHA256TreeHash value.
     *        </p>
     *        <p>
     *        This field is null for the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Archive retrieval jobs that specify a range that is not tree-hash aligned
     *        </p>
     *        </li>
     *        </ul>
     *        <ul>
     *        <li>
     *        <p>
     *        Archival jobs that specify a range that is equal to the whole archive, when the job status is
     *        <code>InProgress</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <ul>
     *        <li>
     *        <p>
     *        Inventory jobs
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Select jobs
     *        </p>
     *        </li>
     */

    public void setSHA256TreeHash(String sHA256TreeHash) {
        this.sHA256TreeHash = sHA256TreeHash;
    }

    /**
     * <p>
     * For an archive retrieval job, this value is the checksum of the archive. Otherwise, this value is null.
     * </p>
     * <p>
     * The SHA256 tree hash value for the requested range of an archive. If the <b>InitiateJob</b> request for an
     * archive specified a tree-hash aligned range, then this field returns a value.
     * </p>
     * <p>
     * If the whole archive is retrieved, this value is the same as the ArchiveSHA256TreeHash value.
     * </p>
     * <p>
     * This field is null for the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Archive retrieval jobs that specify a range that is not tree-hash aligned
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Archival jobs that specify a range that is equal to the whole archive, when the job status is
     * <code>InProgress</code>
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Inventory jobs
     * </p>
     * </li>
     * <li>
     * <p>
     * Select jobs
     * </p>
     * </li>
     * </ul>
     * 
     * @return For an archive retrieval job, this value is the checksum of the archive. Otherwise, this value is
     *         null.</p>
     *         <p>
     *         The SHA256 tree hash value for the requested range of an archive. If the <b>InitiateJob</b> request for
     *         an archive specified a tree-hash aligned range, then this field returns a value.
     *         </p>
     *         <p>
     *         If the whole archive is retrieved, this value is the same as the ArchiveSHA256TreeHash value.
     *         </p>
     *         <p>
     *         This field is null for the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Archive retrieval jobs that specify a range that is not tree-hash aligned
     *         </p>
     *         </li>
     *         </ul>
     *         <ul>
     *         <li>
     *         <p>
     *         Archival jobs that specify a range that is equal to the whole archive, when the job status is
     *         <code>InProgress</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <ul>
     *         <li>
     *         <p>
     *         Inventory jobs
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Select jobs
     *         </p>
     *         </li>
     */

    public String getSHA256TreeHash() {
        return this.sHA256TreeHash;
    }

    /**
     * <p>
     * For an archive retrieval job, this value is the checksum of the archive. Otherwise, this value is null.
     * </p>
     * <p>
     * The SHA256 tree hash value for the requested range of an archive. If the <b>InitiateJob</b> request for an
     * archive specified a tree-hash aligned range, then this field returns a value.
     * </p>
     * <p>
     * If the whole archive is retrieved, this value is the same as the ArchiveSHA256TreeHash value.
     * </p>
     * <p>
     * This field is null for the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Archive retrieval jobs that specify a range that is not tree-hash aligned
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Archival jobs that specify a range that is equal to the whole archive, when the job status is
     * <code>InProgress</code>
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Inventory jobs
     * </p>
     * </li>
     * <li>
     * <p>
     * Select jobs
     * </p>
     * </li>
     * </ul>
     * 
     * @param sHA256TreeHash
     *        For an archive retrieval job, this value is the checksum of the archive. Otherwise, this value is
     *        null.</p>
     *        <p>
     *        The SHA256 tree hash value for the requested range of an archive. If the <b>InitiateJob</b> request for an
     *        archive specified a tree-hash aligned range, then this field returns a value.
     *        </p>
     *        <p>
     *        If the whole archive is retrieved, this value is the same as the ArchiveSHA256TreeHash value.
     *        </p>
     *        <p>
     *        This field is null for the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Archive retrieval jobs that specify a range that is not tree-hash aligned
     *        </p>
     *        </li>
     *        </ul>
     *        <ul>
     *        <li>
     *        <p>
     *        Archival jobs that specify a range that is equal to the whole archive, when the job status is
     *        <code>InProgress</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <ul>
     *        <li>
     *        <p>
     *        Inventory jobs
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Select jobs
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlacierJobDescription withSHA256TreeHash(String sHA256TreeHash) {
        setSHA256TreeHash(sHA256TreeHash);
        return this;
    }

    /**
     * <p>
     * The SHA256 tree hash of the entire archive for an archive retrieval. For inventory retrieval or select jobs, this
     * field is null.
     * </p>
     * 
     * @param archiveSHA256TreeHash
     *        The SHA256 tree hash of the entire archive for an archive retrieval. For inventory retrieval or select
     *        jobs, this field is null.
     */

    public void setArchiveSHA256TreeHash(String archiveSHA256TreeHash) {
        this.archiveSHA256TreeHash = archiveSHA256TreeHash;
    }

    /**
     * <p>
     * The SHA256 tree hash of the entire archive for an archive retrieval. For inventory retrieval or select jobs, this
     * field is null.
     * </p>
     * 
     * @return The SHA256 tree hash of the entire archive for an archive retrieval. For inventory retrieval or select
     *         jobs, this field is null.
     */

    public String getArchiveSHA256TreeHash() {
        return this.archiveSHA256TreeHash;
    }

    /**
     * <p>
     * The SHA256 tree hash of the entire archive for an archive retrieval. For inventory retrieval or select jobs, this
     * field is null.
     * </p>
     * 
     * @param archiveSHA256TreeHash
     *        The SHA256 tree hash of the entire archive for an archive retrieval. For inventory retrieval or select
     *        jobs, this field is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlacierJobDescription withArchiveSHA256TreeHash(String archiveSHA256TreeHash) {
        setArchiveSHA256TreeHash(archiveSHA256TreeHash);
        return this;
    }

    /**
     * <p>
     * The retrieved byte range for archive retrieval jobs in the form <i>StartByteValue</i>-<i>EndByteValue</i>. If no
     * range was specified in the archive retrieval, then the whole archive is retrieved. In this case,
     * <i>StartByteValue</i> equals 0 and <i>EndByteValue</i> equals the size of the archive minus 1. For inventory
     * retrieval or select jobs, this field is null.
     * </p>
     * 
     * @param retrievalByteRange
     *        The retrieved byte range for archive retrieval jobs in the form <i>StartByteValue</i>-<i>EndByteValue</i>.
     *        If no range was specified in the archive retrieval, then the whole archive is retrieved. In this case,
     *        <i>StartByteValue</i> equals 0 and <i>EndByteValue</i> equals the size of the archive minus 1. For
     *        inventory retrieval or select jobs, this field is null.
     */

    public void setRetrievalByteRange(String retrievalByteRange) {
        this.retrievalByteRange = retrievalByteRange;
    }

    /**
     * <p>
     * The retrieved byte range for archive retrieval jobs in the form <i>StartByteValue</i>-<i>EndByteValue</i>. If no
     * range was specified in the archive retrieval, then the whole archive is retrieved. In this case,
     * <i>StartByteValue</i> equals 0 and <i>EndByteValue</i> equals the size of the archive minus 1. For inventory
     * retrieval or select jobs, this field is null.
     * </p>
     * 
     * @return The retrieved byte range for archive retrieval jobs in the form
     *         <i>StartByteValue</i>-<i>EndByteValue</i>. If no range was specified in the archive retrieval, then the
     *         whole archive is retrieved. In this case, <i>StartByteValue</i> equals 0 and <i>EndByteValue</i> equals
     *         the size of the archive minus 1. For inventory retrieval or select jobs, this field is null.
     */

    public String getRetrievalByteRange() {
        return this.retrievalByteRange;
    }

    /**
     * <p>
     * The retrieved byte range for archive retrieval jobs in the form <i>StartByteValue</i>-<i>EndByteValue</i>. If no
     * range was specified in the archive retrieval, then the whole archive is retrieved. In this case,
     * <i>StartByteValue</i> equals 0 and <i>EndByteValue</i> equals the size of the archive minus 1. For inventory
     * retrieval or select jobs, this field is null.
     * </p>
     * 
     * @param retrievalByteRange
     *        The retrieved byte range for archive retrieval jobs in the form <i>StartByteValue</i>-<i>EndByteValue</i>.
     *        If no range was specified in the archive retrieval, then the whole archive is retrieved. In this case,
     *        <i>StartByteValue</i> equals 0 and <i>EndByteValue</i> equals the size of the archive minus 1. For
     *        inventory retrieval or select jobs, this field is null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlacierJobDescription withRetrievalByteRange(String retrievalByteRange) {
        setRetrievalByteRange(retrievalByteRange);
        return this;
    }

    /**
     * <p>
     * The tier to use for a select or an archive retrieval. Valid values are <code>Expedited</code>,
     * <code>Standard</code>, or <code>Bulk</code>. <code>Standard</code> is the default.
     * </p>
     * 
     * @param tier
     *        The tier to use for a select or an archive retrieval. Valid values are <code>Expedited</code>,
     *        <code>Standard</code>, or <code>Bulk</code>. <code>Standard</code> is the default.
     */

    public void setTier(String tier) {
        this.tier = tier;
    }

    /**
     * <p>
     * The tier to use for a select or an archive retrieval. Valid values are <code>Expedited</code>,
     * <code>Standard</code>, or <code>Bulk</code>. <code>Standard</code> is the default.
     * </p>
     * 
     * @return The tier to use for a select or an archive retrieval. Valid values are <code>Expedited</code>,
     *         <code>Standard</code>, or <code>Bulk</code>. <code>Standard</code> is the default.
     */

    public String getTier() {
        return this.tier;
    }

    /**
     * <p>
     * The tier to use for a select or an archive retrieval. Valid values are <code>Expedited</code>,
     * <code>Standard</code>, or <code>Bulk</code>. <code>Standard</code> is the default.
     * </p>
     * 
     * @param tier
     *        The tier to use for a select or an archive retrieval. Valid values are <code>Expedited</code>,
     *        <code>Standard</code>, or <code>Bulk</code>. <code>Standard</code> is the default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlacierJobDescription withTier(String tier) {
        setTier(tier);
        return this;
    }

    /**
     * <p>
     * Parameters used for range inventory retrieval.
     * </p>
     * 
     * @param inventoryRetrievalParameters
     *        Parameters used for range inventory retrieval.
     */

    public void setInventoryRetrievalParameters(InventoryRetrievalJobDescription inventoryRetrievalParameters) {
        this.inventoryRetrievalParameters = inventoryRetrievalParameters;
    }

    /**
     * <p>
     * Parameters used for range inventory retrieval.
     * </p>
     * 
     * @return Parameters used for range inventory retrieval.
     */

    public InventoryRetrievalJobDescription getInventoryRetrievalParameters() {
        return this.inventoryRetrievalParameters;
    }

    /**
     * <p>
     * Parameters used for range inventory retrieval.
     * </p>
     * 
     * @param inventoryRetrievalParameters
     *        Parameters used for range inventory retrieval.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlacierJobDescription withInventoryRetrievalParameters(InventoryRetrievalJobDescription inventoryRetrievalParameters) {
        setInventoryRetrievalParameters(inventoryRetrievalParameters);
        return this;
    }

    /**
     * <p>
     * Contains the job output location.
     * </p>
     * 
     * @param jobOutputPath
     *        Contains the job output location.
     */

    public void setJobOutputPath(String jobOutputPath) {
        this.jobOutputPath = jobOutputPath;
    }

    /**
     * <p>
     * Contains the job output location.
     * </p>
     * 
     * @return Contains the job output location.
     */

    public String getJobOutputPath() {
        return this.jobOutputPath;
    }

    /**
     * <p>
     * Contains the job output location.
     * </p>
     * 
     * @param jobOutputPath
     *        Contains the job output location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlacierJobDescription withJobOutputPath(String jobOutputPath) {
        setJobOutputPath(jobOutputPath);
        return this;
    }

    /**
     * <p>
     * Contains the parameters used for a select.
     * </p>
     * 
     * @param selectParameters
     *        Contains the parameters used for a select.
     */

    public void setSelectParameters(SelectParameters selectParameters) {
        this.selectParameters = selectParameters;
    }

    /**
     * <p>
     * Contains the parameters used for a select.
     * </p>
     * 
     * @return Contains the parameters used for a select.
     */

    public SelectParameters getSelectParameters() {
        return this.selectParameters;
    }

    /**
     * <p>
     * Contains the parameters used for a select.
     * </p>
     * 
     * @param selectParameters
     *        Contains the parameters used for a select.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlacierJobDescription withSelectParameters(SelectParameters selectParameters) {
        setSelectParameters(selectParameters);
        return this;
    }

    /**
     * <p>
     * Contains the location where the data from the select job is stored.
     * </p>
     * 
     * @param outputLocation
     *        Contains the location where the data from the select job is stored.
     */

    public void setOutputLocation(OutputLocation outputLocation) {
        this.outputLocation = outputLocation;
    }

    /**
     * <p>
     * Contains the location where the data from the select job is stored.
     * </p>
     * 
     * @return Contains the location where the data from the select job is stored.
     */

    public OutputLocation getOutputLocation() {
        return this.outputLocation;
    }

    /**
     * <p>
     * Contains the location where the data from the select job is stored.
     * </p>
     * 
     * @param outputLocation
     *        Contains the location where the data from the select job is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlacierJobDescription withOutputLocation(OutputLocation outputLocation) {
        setOutputLocation(outputLocation);
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
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getJobDescription() != null)
            sb.append("JobDescription: ").append(getJobDescription()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getArchiveId() != null)
            sb.append("ArchiveId: ").append(getArchiveId()).append(",");
        if (getVaultARN() != null)
            sb.append("VaultARN: ").append(getVaultARN()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getCompleted() != null)
            sb.append("Completed: ").append(getCompleted()).append(",");
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getArchiveSizeInBytes() != null)
            sb.append("ArchiveSizeInBytes: ").append(getArchiveSizeInBytes()).append(",");
        if (getInventorySizeInBytes() != null)
            sb.append("InventorySizeInBytes: ").append(getInventorySizeInBytes()).append(",");
        if (getSNSTopic() != null)
            sb.append("SNSTopic: ").append(getSNSTopic()).append(",");
        if (getCompletionDate() != null)
            sb.append("CompletionDate: ").append(getCompletionDate()).append(",");
        if (getSHA256TreeHash() != null)
            sb.append("SHA256TreeHash: ").append(getSHA256TreeHash()).append(",");
        if (getArchiveSHA256TreeHash() != null)
            sb.append("ArchiveSHA256TreeHash: ").append(getArchiveSHA256TreeHash()).append(",");
        if (getRetrievalByteRange() != null)
            sb.append("RetrievalByteRange: ").append(getRetrievalByteRange()).append(",");
        if (getTier() != null)
            sb.append("Tier: ").append(getTier()).append(",");
        if (getInventoryRetrievalParameters() != null)
            sb.append("InventoryRetrievalParameters: ").append(getInventoryRetrievalParameters()).append(",");
        if (getJobOutputPath() != null)
            sb.append("JobOutputPath: ").append(getJobOutputPath()).append(",");
        if (getSelectParameters() != null)
            sb.append("SelectParameters: ").append(getSelectParameters()).append(",");
        if (getOutputLocation() != null)
            sb.append("OutputLocation: ").append(getOutputLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GlacierJobDescription == false)
            return false;
        GlacierJobDescription other = (GlacierJobDescription) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobDescription() == null ^ this.getJobDescription() == null)
            return false;
        if (other.getJobDescription() != null && other.getJobDescription().equals(this.getJobDescription()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getArchiveId() == null ^ this.getArchiveId() == null)
            return false;
        if (other.getArchiveId() != null && other.getArchiveId().equals(this.getArchiveId()) == false)
            return false;
        if (other.getVaultARN() == null ^ this.getVaultARN() == null)
            return false;
        if (other.getVaultARN() != null && other.getVaultARN().equals(this.getVaultARN()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getCompleted() == null ^ this.getCompleted() == null)
            return false;
        if (other.getCompleted() != null && other.getCompleted().equals(this.getCompleted()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getArchiveSizeInBytes() == null ^ this.getArchiveSizeInBytes() == null)
            return false;
        if (other.getArchiveSizeInBytes() != null && other.getArchiveSizeInBytes().equals(this.getArchiveSizeInBytes()) == false)
            return false;
        if (other.getInventorySizeInBytes() == null ^ this.getInventorySizeInBytes() == null)
            return false;
        if (other.getInventorySizeInBytes() != null && other.getInventorySizeInBytes().equals(this.getInventorySizeInBytes()) == false)
            return false;
        if (other.getSNSTopic() == null ^ this.getSNSTopic() == null)
            return false;
        if (other.getSNSTopic() != null && other.getSNSTopic().equals(this.getSNSTopic()) == false)
            return false;
        if (other.getCompletionDate() == null ^ this.getCompletionDate() == null)
            return false;
        if (other.getCompletionDate() != null && other.getCompletionDate().equals(this.getCompletionDate()) == false)
            return false;
        if (other.getSHA256TreeHash() == null ^ this.getSHA256TreeHash() == null)
            return false;
        if (other.getSHA256TreeHash() != null && other.getSHA256TreeHash().equals(this.getSHA256TreeHash()) == false)
            return false;
        if (other.getArchiveSHA256TreeHash() == null ^ this.getArchiveSHA256TreeHash() == null)
            return false;
        if (other.getArchiveSHA256TreeHash() != null && other.getArchiveSHA256TreeHash().equals(this.getArchiveSHA256TreeHash()) == false)
            return false;
        if (other.getRetrievalByteRange() == null ^ this.getRetrievalByteRange() == null)
            return false;
        if (other.getRetrievalByteRange() != null && other.getRetrievalByteRange().equals(this.getRetrievalByteRange()) == false)
            return false;
        if (other.getTier() == null ^ this.getTier() == null)
            return false;
        if (other.getTier() != null && other.getTier().equals(this.getTier()) == false)
            return false;
        if (other.getInventoryRetrievalParameters() == null ^ this.getInventoryRetrievalParameters() == null)
            return false;
        if (other.getInventoryRetrievalParameters() != null && other.getInventoryRetrievalParameters().equals(this.getInventoryRetrievalParameters()) == false)
            return false;
        if (other.getJobOutputPath() == null ^ this.getJobOutputPath() == null)
            return false;
        if (other.getJobOutputPath() != null && other.getJobOutputPath().equals(this.getJobOutputPath()) == false)
            return false;
        if (other.getSelectParameters() == null ^ this.getSelectParameters() == null)
            return false;
        if (other.getSelectParameters() != null && other.getSelectParameters().equals(this.getSelectParameters()) == false)
            return false;
        if (other.getOutputLocation() == null ^ this.getOutputLocation() == null)
            return false;
        if (other.getOutputLocation() != null && other.getOutputLocation().equals(this.getOutputLocation()) == false)
            return false;
        return true;
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
        hashCode = prime * hashCode + ((getCompleted() == null) ? 0 : getCompleted().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getArchiveSizeInBytes() == null) ? 0 : getArchiveSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getInventorySizeInBytes() == null) ? 0 : getInventorySizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getSNSTopic() == null) ? 0 : getSNSTopic().hashCode());
        hashCode = prime * hashCode + ((getCompletionDate() == null) ? 0 : getCompletionDate().hashCode());
        hashCode = prime * hashCode + ((getSHA256TreeHash() == null) ? 0 : getSHA256TreeHash().hashCode());
        hashCode = prime * hashCode + ((getArchiveSHA256TreeHash() == null) ? 0 : getArchiveSHA256TreeHash().hashCode());
        hashCode = prime * hashCode + ((getRetrievalByteRange() == null) ? 0 : getRetrievalByteRange().hashCode());
        hashCode = prime * hashCode + ((getTier() == null) ? 0 : getTier().hashCode());
        hashCode = prime * hashCode + ((getInventoryRetrievalParameters() == null) ? 0 : getInventoryRetrievalParameters().hashCode());
        hashCode = prime * hashCode + ((getJobOutputPath() == null) ? 0 : getJobOutputPath().hashCode());
        hashCode = prime * hashCode + ((getSelectParameters() == null) ? 0 : getSelectParameters().hashCode());
        hashCode = prime * hashCode + ((getOutputLocation() == null) ? 0 : getOutputLocation().hashCode());
        return hashCode;
    }

    @Override
    public GlacierJobDescription clone() {
        try {
            return (GlacierJobDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glacier.model.transform.GlacierJobDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
