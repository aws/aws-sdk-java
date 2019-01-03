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
 * Provides options for defining a job.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * When initiating a job to retrieve a vault inventory, you can optionally add this parameter to your request to
     * specify the output format. If you are initiating an inventory job and do not specify a Format field, JSON is the
     * default format. Valid values are "CSV" and "JSON".
     * </p>
     */
    private String format;
    /**
     * <p>
     * The job type. You can initiate a job to perform a select query on an archive, retrieve an archive, or get an
     * inventory of a vault. Valid values are "select", "archive-retrieval" and "inventory-retrieval".
     * </p>
     */
    private String type;
    /**
     * <p>
     * The ID of the archive that you want to retrieve. This field is required only if <code>Type</code> is set to
     * <code>select</code> or <code>archive-retrieval</code>code&gt;. An error occurs if you specify this request
     * parameter for an inventory retrieval job request.
     * </p>
     */
    private String archiveId;
    /**
     * <p>
     * The optional description for the job. The description must be less than or equal to 1,024 bytes. The allowable
     * characters are 7-bit ASCII without control codes-specifically, ASCII values 32-126 decimal or 0x20-0x7E
     * hexadecimal.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Amazon SNS topic ARN to which Amazon Glacier sends a notification when the job is completed and the output is
     * ready for you to download. The specified topic publishes the notification to its subscribers. The SNS topic must
     * exist.
     * </p>
     */
    private String sNSTopic;
    /**
     * <p>
     * The byte range to retrieve for an archive retrieval. in the form "<i>StartByteValue</i>-<i>EndByteValue</i>" If
     * not specified, the whole archive is retrieved. If specified, the byte range must be megabyte (1024*1024) aligned
     * which means that <i>StartByteValue</i> must be divisible by 1 MB and <i>EndByteValue</i> plus 1 must be divisible
     * by 1 MB or be the end of the archive specified as the archive byte size value minus 1. If RetrievalByteRange is
     * not megabyte aligned, this operation returns a 400 response.
     * </p>
     * <p>
     * An error occurs if you specify this field for an inventory retrieval job request.
     * </p>
     */
    private String retrievalByteRange;
    /**
     * <p>
     * The tier to use for a select or an archive retrieval job. Valid values are <code>Expedited</code>,
     * <code>Standard</code>, or <code>Bulk</code>. <code>Standard</code> is the default.
     * </p>
     */
    private String tier;
    /**
     * <p>
     * Input parameters used for range inventory retrieval.
     * </p>
     */
    private InventoryRetrievalJobInput inventoryRetrievalParameters;
    /**
     * <p>
     * Contains the parameters that define a job.
     * </p>
     */
    private SelectParameters selectParameters;
    /**
     * <p>
     * Contains information about the location where the select job results are stored.
     * </p>
     */
    private OutputLocation outputLocation;

    /**
     * Default constructor for JobParameters object. Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public JobParameters() {
    }

    /**
     * Constructs a new JobParameters object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param format
     *        When initiating a job to retrieve a vault inventory, you can optionally add this parameter to your request
     *        to specify the output format. If you are initiating an inventory job and do not specify a Format field,
     *        JSON is the default format. Valid values are "CSV" and "JSON".
     * @param type
     *        The job type. You can initiate a job to perform a select query on an archive, retrieve an archive, or get
     *        an inventory of a vault. Valid values are "select", "archive-retrieval" and "inventory-retrieval".
     * @param archiveId
     *        The ID of the archive that you want to retrieve. This field is required only if <code>Type</code> is set
     *        to <code>select</code> or <code>archive-retrieval</code>code&gt;. An error occurs if you specify this
     *        request parameter for an inventory retrieval job request.
     * @param description
     *        The optional description for the job. The description must be less than or equal to 1,024 bytes. The
     *        allowable characters are 7-bit ASCII without control codes-specifically, ASCII values 32-126 decimal or
     *        0x20-0x7E hexadecimal.
     */
    public JobParameters(String format, String type, String archiveId, String description) {
        setFormat(format);
        setType(type);
        setArchiveId(archiveId);
        setDescription(description);
    }

    /**
     * <p>
     * When initiating a job to retrieve a vault inventory, you can optionally add this parameter to your request to
     * specify the output format. If you are initiating an inventory job and do not specify a Format field, JSON is the
     * default format. Valid values are "CSV" and "JSON".
     * </p>
     * 
     * @param format
     *        When initiating a job to retrieve a vault inventory, you can optionally add this parameter to your request
     *        to specify the output format. If you are initiating an inventory job and do not specify a Format field,
     *        JSON is the default format. Valid values are "CSV" and "JSON".
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * When initiating a job to retrieve a vault inventory, you can optionally add this parameter to your request to
     * specify the output format. If you are initiating an inventory job and do not specify a Format field, JSON is the
     * default format. Valid values are "CSV" and "JSON".
     * </p>
     * 
     * @return When initiating a job to retrieve a vault inventory, you can optionally add this parameter to your
     *         request to specify the output format. If you are initiating an inventory job and do not specify a Format
     *         field, JSON is the default format. Valid values are "CSV" and "JSON".
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * When initiating a job to retrieve a vault inventory, you can optionally add this parameter to your request to
     * specify the output format. If you are initiating an inventory job and do not specify a Format field, JSON is the
     * default format. Valid values are "CSV" and "JSON".
     * </p>
     * 
     * @param format
     *        When initiating a job to retrieve a vault inventory, you can optionally add this parameter to your request
     *        to specify the output format. If you are initiating an inventory job and do not specify a Format field,
     *        JSON is the default format. Valid values are "CSV" and "JSON".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobParameters withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The job type. You can initiate a job to perform a select query on an archive, retrieve an archive, or get an
     * inventory of a vault. Valid values are "select", "archive-retrieval" and "inventory-retrieval".
     * </p>
     * 
     * @param type
     *        The job type. You can initiate a job to perform a select query on an archive, retrieve an archive, or get
     *        an inventory of a vault. Valid values are "select", "archive-retrieval" and "inventory-retrieval".
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The job type. You can initiate a job to perform a select query on an archive, retrieve an archive, or get an
     * inventory of a vault. Valid values are "select", "archive-retrieval" and "inventory-retrieval".
     * </p>
     * 
     * @return The job type. You can initiate a job to perform a select query on an archive, retrieve an archive, or get
     *         an inventory of a vault. Valid values are "select", "archive-retrieval" and "inventory-retrieval".
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The job type. You can initiate a job to perform a select query on an archive, retrieve an archive, or get an
     * inventory of a vault. Valid values are "select", "archive-retrieval" and "inventory-retrieval".
     * </p>
     * 
     * @param type
     *        The job type. You can initiate a job to perform a select query on an archive, retrieve an archive, or get
     *        an inventory of a vault. Valid values are "select", "archive-retrieval" and "inventory-retrieval".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobParameters withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The ID of the archive that you want to retrieve. This field is required only if <code>Type</code> is set to
     * <code>select</code> or <code>archive-retrieval</code>code&gt;. An error occurs if you specify this request
     * parameter for an inventory retrieval job request.
     * </p>
     * 
     * @param archiveId
     *        The ID of the archive that you want to retrieve. This field is required only if <code>Type</code> is set
     *        to <code>select</code> or <code>archive-retrieval</code>code&gt;. An error occurs if you specify this
     *        request parameter for an inventory retrieval job request.
     */

    public void setArchiveId(String archiveId) {
        this.archiveId = archiveId;
    }

    /**
     * <p>
     * The ID of the archive that you want to retrieve. This field is required only if <code>Type</code> is set to
     * <code>select</code> or <code>archive-retrieval</code>code&gt;. An error occurs if you specify this request
     * parameter for an inventory retrieval job request.
     * </p>
     * 
     * @return The ID of the archive that you want to retrieve. This field is required only if <code>Type</code> is set
     *         to <code>select</code> or <code>archive-retrieval</code>code&gt;. An error occurs if you specify this
     *         request parameter for an inventory retrieval job request.
     */

    public String getArchiveId() {
        return this.archiveId;
    }

    /**
     * <p>
     * The ID of the archive that you want to retrieve. This field is required only if <code>Type</code> is set to
     * <code>select</code> or <code>archive-retrieval</code>code&gt;. An error occurs if you specify this request
     * parameter for an inventory retrieval job request.
     * </p>
     * 
     * @param archiveId
     *        The ID of the archive that you want to retrieve. This field is required only if <code>Type</code> is set
     *        to <code>select</code> or <code>archive-retrieval</code>code&gt;. An error occurs if you specify this
     *        request parameter for an inventory retrieval job request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobParameters withArchiveId(String archiveId) {
        setArchiveId(archiveId);
        return this;
    }

    /**
     * <p>
     * The optional description for the job. The description must be less than or equal to 1,024 bytes. The allowable
     * characters are 7-bit ASCII without control codes-specifically, ASCII values 32-126 decimal or 0x20-0x7E
     * hexadecimal.
     * </p>
     * 
     * @param description
     *        The optional description for the job. The description must be less than or equal to 1,024 bytes. The
     *        allowable characters are 7-bit ASCII without control codes-specifically, ASCII values 32-126 decimal or
     *        0x20-0x7E hexadecimal.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The optional description for the job. The description must be less than or equal to 1,024 bytes. The allowable
     * characters are 7-bit ASCII without control codes-specifically, ASCII values 32-126 decimal or 0x20-0x7E
     * hexadecimal.
     * </p>
     * 
     * @return The optional description for the job. The description must be less than or equal to 1,024 bytes. The
     *         allowable characters are 7-bit ASCII without control codes-specifically, ASCII values 32-126 decimal or
     *         0x20-0x7E hexadecimal.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The optional description for the job. The description must be less than or equal to 1,024 bytes. The allowable
     * characters are 7-bit ASCII without control codes-specifically, ASCII values 32-126 decimal or 0x20-0x7E
     * hexadecimal.
     * </p>
     * 
     * @param description
     *        The optional description for the job. The description must be less than or equal to 1,024 bytes. The
     *        allowable characters are 7-bit ASCII without control codes-specifically, ASCII values 32-126 decimal or
     *        0x20-0x7E hexadecimal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobParameters withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Amazon SNS topic ARN to which Amazon Glacier sends a notification when the job is completed and the output is
     * ready for you to download. The specified topic publishes the notification to its subscribers. The SNS topic must
     * exist.
     * </p>
     * 
     * @param sNSTopic
     *        The Amazon SNS topic ARN to which Amazon Glacier sends a notification when the job is completed and the
     *        output is ready for you to download. The specified topic publishes the notification to its subscribers.
     *        The SNS topic must exist.
     */

    public void setSNSTopic(String sNSTopic) {
        this.sNSTopic = sNSTopic;
    }

    /**
     * <p>
     * The Amazon SNS topic ARN to which Amazon Glacier sends a notification when the job is completed and the output is
     * ready for you to download. The specified topic publishes the notification to its subscribers. The SNS topic must
     * exist.
     * </p>
     * 
     * @return The Amazon SNS topic ARN to which Amazon Glacier sends a notification when the job is completed and the
     *         output is ready for you to download. The specified topic publishes the notification to its subscribers.
     *         The SNS topic must exist.
     */

    public String getSNSTopic() {
        return this.sNSTopic;
    }

    /**
     * <p>
     * The Amazon SNS topic ARN to which Amazon Glacier sends a notification when the job is completed and the output is
     * ready for you to download. The specified topic publishes the notification to its subscribers. The SNS topic must
     * exist.
     * </p>
     * 
     * @param sNSTopic
     *        The Amazon SNS topic ARN to which Amazon Glacier sends a notification when the job is completed and the
     *        output is ready for you to download. The specified topic publishes the notification to its subscribers.
     *        The SNS topic must exist.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobParameters withSNSTopic(String sNSTopic) {
        setSNSTopic(sNSTopic);
        return this;
    }

    /**
     * <p>
     * The byte range to retrieve for an archive retrieval. in the form "<i>StartByteValue</i>-<i>EndByteValue</i>" If
     * not specified, the whole archive is retrieved. If specified, the byte range must be megabyte (1024*1024) aligned
     * which means that <i>StartByteValue</i> must be divisible by 1 MB and <i>EndByteValue</i> plus 1 must be divisible
     * by 1 MB or be the end of the archive specified as the archive byte size value minus 1. If RetrievalByteRange is
     * not megabyte aligned, this operation returns a 400 response.
     * </p>
     * <p>
     * An error occurs if you specify this field for an inventory retrieval job request.
     * </p>
     * 
     * @param retrievalByteRange
     *        The byte range to retrieve for an archive retrieval. in the form
     *        "<i>StartByteValue</i>-<i>EndByteValue</i>" If not specified, the whole archive is retrieved. If
     *        specified, the byte range must be megabyte (1024*1024) aligned which means that <i>StartByteValue</i> must
     *        be divisible by 1 MB and <i>EndByteValue</i> plus 1 must be divisible by 1 MB or be the end of the archive
     *        specified as the archive byte size value minus 1. If RetrievalByteRange is not megabyte aligned, this
     *        operation returns a 400 response. </p>
     *        <p>
     *        An error occurs if you specify this field for an inventory retrieval job request.
     */

    public void setRetrievalByteRange(String retrievalByteRange) {
        this.retrievalByteRange = retrievalByteRange;
    }

    /**
     * <p>
     * The byte range to retrieve for an archive retrieval. in the form "<i>StartByteValue</i>-<i>EndByteValue</i>" If
     * not specified, the whole archive is retrieved. If specified, the byte range must be megabyte (1024*1024) aligned
     * which means that <i>StartByteValue</i> must be divisible by 1 MB and <i>EndByteValue</i> plus 1 must be divisible
     * by 1 MB or be the end of the archive specified as the archive byte size value minus 1. If RetrievalByteRange is
     * not megabyte aligned, this operation returns a 400 response.
     * </p>
     * <p>
     * An error occurs if you specify this field for an inventory retrieval job request.
     * </p>
     * 
     * @return The byte range to retrieve for an archive retrieval. in the form
     *         "<i>StartByteValue</i>-<i>EndByteValue</i>" If not specified, the whole archive is retrieved. If
     *         specified, the byte range must be megabyte (1024*1024) aligned which means that <i>StartByteValue</i>
     *         must be divisible by 1 MB and <i>EndByteValue</i> plus 1 must be divisible by 1 MB or be the end of the
     *         archive specified as the archive byte size value minus 1. If RetrievalByteRange is not megabyte aligned,
     *         this operation returns a 400 response. </p>
     *         <p>
     *         An error occurs if you specify this field for an inventory retrieval job request.
     */

    public String getRetrievalByteRange() {
        return this.retrievalByteRange;
    }

    /**
     * <p>
     * The byte range to retrieve for an archive retrieval. in the form "<i>StartByteValue</i>-<i>EndByteValue</i>" If
     * not specified, the whole archive is retrieved. If specified, the byte range must be megabyte (1024*1024) aligned
     * which means that <i>StartByteValue</i> must be divisible by 1 MB and <i>EndByteValue</i> plus 1 must be divisible
     * by 1 MB or be the end of the archive specified as the archive byte size value minus 1. If RetrievalByteRange is
     * not megabyte aligned, this operation returns a 400 response.
     * </p>
     * <p>
     * An error occurs if you specify this field for an inventory retrieval job request.
     * </p>
     * 
     * @param retrievalByteRange
     *        The byte range to retrieve for an archive retrieval. in the form
     *        "<i>StartByteValue</i>-<i>EndByteValue</i>" If not specified, the whole archive is retrieved. If
     *        specified, the byte range must be megabyte (1024*1024) aligned which means that <i>StartByteValue</i> must
     *        be divisible by 1 MB and <i>EndByteValue</i> plus 1 must be divisible by 1 MB or be the end of the archive
     *        specified as the archive byte size value minus 1. If RetrievalByteRange is not megabyte aligned, this
     *        operation returns a 400 response. </p>
     *        <p>
     *        An error occurs if you specify this field for an inventory retrieval job request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobParameters withRetrievalByteRange(String retrievalByteRange) {
        setRetrievalByteRange(retrievalByteRange);
        return this;
    }

    /**
     * <p>
     * The tier to use for a select or an archive retrieval job. Valid values are <code>Expedited</code>,
     * <code>Standard</code>, or <code>Bulk</code>. <code>Standard</code> is the default.
     * </p>
     * 
     * @param tier
     *        The tier to use for a select or an archive retrieval job. Valid values are <code>Expedited</code>,
     *        <code>Standard</code>, or <code>Bulk</code>. <code>Standard</code> is the default.
     */

    public void setTier(String tier) {
        this.tier = tier;
    }

    /**
     * <p>
     * The tier to use for a select or an archive retrieval job. Valid values are <code>Expedited</code>,
     * <code>Standard</code>, or <code>Bulk</code>. <code>Standard</code> is the default.
     * </p>
     * 
     * @return The tier to use for a select or an archive retrieval job. Valid values are <code>Expedited</code>,
     *         <code>Standard</code>, or <code>Bulk</code>. <code>Standard</code> is the default.
     */

    public String getTier() {
        return this.tier;
    }

    /**
     * <p>
     * The tier to use for a select or an archive retrieval job. Valid values are <code>Expedited</code>,
     * <code>Standard</code>, or <code>Bulk</code>. <code>Standard</code> is the default.
     * </p>
     * 
     * @param tier
     *        The tier to use for a select or an archive retrieval job. Valid values are <code>Expedited</code>,
     *        <code>Standard</code>, or <code>Bulk</code>. <code>Standard</code> is the default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobParameters withTier(String tier) {
        setTier(tier);
        return this;
    }

    /**
     * <p>
     * Input parameters used for range inventory retrieval.
     * </p>
     * 
     * @param inventoryRetrievalParameters
     *        Input parameters used for range inventory retrieval.
     */

    public void setInventoryRetrievalParameters(InventoryRetrievalJobInput inventoryRetrievalParameters) {
        this.inventoryRetrievalParameters = inventoryRetrievalParameters;
    }

    /**
     * <p>
     * Input parameters used for range inventory retrieval.
     * </p>
     * 
     * @return Input parameters used for range inventory retrieval.
     */

    public InventoryRetrievalJobInput getInventoryRetrievalParameters() {
        return this.inventoryRetrievalParameters;
    }

    /**
     * <p>
     * Input parameters used for range inventory retrieval.
     * </p>
     * 
     * @param inventoryRetrievalParameters
     *        Input parameters used for range inventory retrieval.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobParameters withInventoryRetrievalParameters(InventoryRetrievalJobInput inventoryRetrievalParameters) {
        setInventoryRetrievalParameters(inventoryRetrievalParameters);
        return this;
    }

    /**
     * <p>
     * Contains the parameters that define a job.
     * </p>
     * 
     * @param selectParameters
     *        Contains the parameters that define a job.
     */

    public void setSelectParameters(SelectParameters selectParameters) {
        this.selectParameters = selectParameters;
    }

    /**
     * <p>
     * Contains the parameters that define a job.
     * </p>
     * 
     * @return Contains the parameters that define a job.
     */

    public SelectParameters getSelectParameters() {
        return this.selectParameters;
    }

    /**
     * <p>
     * Contains the parameters that define a job.
     * </p>
     * 
     * @param selectParameters
     *        Contains the parameters that define a job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobParameters withSelectParameters(SelectParameters selectParameters) {
        setSelectParameters(selectParameters);
        return this;
    }

    /**
     * <p>
     * Contains information about the location where the select job results are stored.
     * </p>
     * 
     * @param outputLocation
     *        Contains information about the location where the select job results are stored.
     */

    public void setOutputLocation(OutputLocation outputLocation) {
        this.outputLocation = outputLocation;
    }

    /**
     * <p>
     * Contains information about the location where the select job results are stored.
     * </p>
     * 
     * @return Contains information about the location where the select job results are stored.
     */

    public OutputLocation getOutputLocation() {
        return this.outputLocation;
    }

    /**
     * <p>
     * Contains information about the location where the select job results are stored.
     * </p>
     * 
     * @param outputLocation
     *        Contains information about the location where the select job results are stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobParameters withOutputLocation(OutputLocation outputLocation) {
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
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getArchiveId() != null)
            sb.append("ArchiveId: ").append(getArchiveId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSNSTopic() != null)
            sb.append("SNSTopic: ").append(getSNSTopic()).append(",");
        if (getRetrievalByteRange() != null)
            sb.append("RetrievalByteRange: ").append(getRetrievalByteRange()).append(",");
        if (getTier() != null)
            sb.append("Tier: ").append(getTier()).append(",");
        if (getInventoryRetrievalParameters() != null)
            sb.append("InventoryRetrievalParameters: ").append(getInventoryRetrievalParameters()).append(",");
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

        if (obj instanceof JobParameters == false)
            return false;
        JobParameters other = (JobParameters) obj;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getArchiveId() == null ^ this.getArchiveId() == null)
            return false;
        if (other.getArchiveId() != null && other.getArchiveId().equals(this.getArchiveId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSNSTopic() == null ^ this.getSNSTopic() == null)
            return false;
        if (other.getSNSTopic() != null && other.getSNSTopic().equals(this.getSNSTopic()) == false)
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

        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getArchiveId() == null) ? 0 : getArchiveId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSNSTopic() == null) ? 0 : getSNSTopic().hashCode());
        hashCode = prime * hashCode + ((getRetrievalByteRange() == null) ? 0 : getRetrievalByteRange().hashCode());
        hashCode = prime * hashCode + ((getTier() == null) ? 0 : getTier().hashCode());
        hashCode = prime * hashCode + ((getInventoryRetrievalParameters() == null) ? 0 : getInventoryRetrievalParameters().hashCode());
        hashCode = prime * hashCode + ((getSelectParameters() == null) ? 0 : getSelectParameters().hashCode());
        hashCode = prime * hashCode + ((getOutputLocation() == null) ? 0 : getOutputLocation().hashCode());
        return hashCode;
    }

    @Override
    public JobParameters clone() {
        try {
            return (JobParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glacier.model.transform.JobParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
