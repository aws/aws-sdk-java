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
 * Provides options for defining a job.
 * </p>
 */
public class JobParameters implements Serializable {

    /**
     * When initiating a job to retrieve a vault inventory, you can
     * optionally add this parameter to your request to specify the output
     * format. If you are initiating an inventory job and do not specify a
     * Format field, JSON is the default format. Valid Values are "CSV" and
     * "JSON".
     */
    private String format;

    /**
     * The job type. You can initiate a job to retrieve an archive or get an
     * inventory of a vault. Valid Values are "archive-retrieval" and
     * "inventory-retrieval".
     */
    private String type;

    /**
     * The ID of the archive that you want to retrieve. This field is
     * required only if <code>Type</code> is set to archive-retrieval. An
     * error occurs if you specify this request parameter for an inventory
     * retrieval job request.
     */
    private String archiveId;

    /**
     * The optional description for the job. The description must be less
     * than or equal to 1,024 bytes. The allowable characters are 7-bit ASCII
     * without control codes���specifically, ASCII values 32���126 decimal or
     * 0x20���0x7E hexadecimal.
     */
    private String description;

    /**
     * The Amazon SNS topic ARN to which Amazon Glacier sends a notification
     * when the job is completed and the output is ready for you to download.
     * The specified topic publishes the notification to its subscribers. The
     * SNS topic must exist.
     */
    private String sNSTopic;

    private String retrievalByteRange;

    /**
     * Default constructor for a new JobParameters object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public JobParameters() {}
    
    /**
     * Constructs a new JobParameters object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param format When initiating a job to retrieve a vault inventory, you
     * can optionally add this parameter to your request to specify the
     * output format. If you are initiating an inventory job and do not
     * specify a Format field, JSON is the default format. Valid Values are
     * "CSV" and "JSON".
     * @param type The job type. You can initiate a job to retrieve an
     * archive or get an inventory of a vault. Valid Values are
     * "archive-retrieval" and "inventory-retrieval".
     * @param archiveId The ID of the archive that you want to retrieve. This
     * field is required only if <code>Type</code> is set to
     * archive-retrieval. An error occurs if you specify this request
     * parameter for an inventory retrieval job request.
     * @param description The optional description for the job. The
     * description must be less than or equal to 1,024 bytes. The allowable
     * characters are 7-bit ASCII without control codes���specifically, ASCII
     * values 32���126 decimal or 0x20���0x7E hexadecimal.
     */
    public JobParameters(String format, String type, String archiveId, String description) {
        setFormat(format);
        setType(type);
        setArchiveId(archiveId);
        setDescription(description);
    }

    /**
     * When initiating a job to retrieve a vault inventory, you can
     * optionally add this parameter to your request to specify the output
     * format. If you are initiating an inventory job and do not specify a
     * Format field, JSON is the default format. Valid Values are "CSV" and
     * "JSON".
     *
     * @return When initiating a job to retrieve a vault inventory, you can
     *         optionally add this parameter to your request to specify the output
     *         format. If you are initiating an inventory job and do not specify a
     *         Format field, JSON is the default format. Valid Values are "CSV" and
     *         "JSON".
     */
    public String getFormat() {
        return format;
    }
    
    /**
     * When initiating a job to retrieve a vault inventory, you can
     * optionally add this parameter to your request to specify the output
     * format. If you are initiating an inventory job and do not specify a
     * Format field, JSON is the default format. Valid Values are "CSV" and
     * "JSON".
     *
     * @param format When initiating a job to retrieve a vault inventory, you can
     *         optionally add this parameter to your request to specify the output
     *         format. If you are initiating an inventory job and do not specify a
     *         Format field, JSON is the default format. Valid Values are "CSV" and
     *         "JSON".
     */
    public void setFormat(String format) {
        this.format = format;
    }
    
    /**
     * When initiating a job to retrieve a vault inventory, you can
     * optionally add this parameter to your request to specify the output
     * format. If you are initiating an inventory job and do not specify a
     * Format field, JSON is the default format. Valid Values are "CSV" and
     * "JSON".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param format When initiating a job to retrieve a vault inventory, you can
     *         optionally add this parameter to your request to specify the output
     *         format. If you are initiating an inventory job and do not specify a
     *         Format field, JSON is the default format. Valid Values are "CSV" and
     *         "JSON".
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public JobParameters withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * The job type. You can initiate a job to retrieve an archive or get an
     * inventory of a vault. Valid Values are "archive-retrieval" and
     * "inventory-retrieval".
     *
     * @return The job type. You can initiate a job to retrieve an archive or get an
     *         inventory of a vault. Valid Values are "archive-retrieval" and
     *         "inventory-retrieval".
     */
    public String getType() {
        return type;
    }
    
    /**
     * The job type. You can initiate a job to retrieve an archive or get an
     * inventory of a vault. Valid Values are "archive-retrieval" and
     * "inventory-retrieval".
     *
     * @param type The job type. You can initiate a job to retrieve an archive or get an
     *         inventory of a vault. Valid Values are "archive-retrieval" and
     *         "inventory-retrieval".
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * The job type. You can initiate a job to retrieve an archive or get an
     * inventory of a vault. Valid Values are "archive-retrieval" and
     * "inventory-retrieval".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param type The job type. You can initiate a job to retrieve an archive or get an
     *         inventory of a vault. Valid Values are "archive-retrieval" and
     *         "inventory-retrieval".
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public JobParameters withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * The ID of the archive that you want to retrieve. This field is
     * required only if <code>Type</code> is set to archive-retrieval. An
     * error occurs if you specify this request parameter for an inventory
     * retrieval job request.
     *
     * @return The ID of the archive that you want to retrieve. This field is
     *         required only if <code>Type</code> is set to archive-retrieval. An
     *         error occurs if you specify this request parameter for an inventory
     *         retrieval job request.
     */
    public String getArchiveId() {
        return archiveId;
    }
    
    /**
     * The ID of the archive that you want to retrieve. This field is
     * required only if <code>Type</code> is set to archive-retrieval. An
     * error occurs if you specify this request parameter for an inventory
     * retrieval job request.
     *
     * @param archiveId The ID of the archive that you want to retrieve. This field is
     *         required only if <code>Type</code> is set to archive-retrieval. An
     *         error occurs if you specify this request parameter for an inventory
     *         retrieval job request.
     */
    public void setArchiveId(String archiveId) {
        this.archiveId = archiveId;
    }
    
    /**
     * The ID of the archive that you want to retrieve. This field is
     * required only if <code>Type</code> is set to archive-retrieval. An
     * error occurs if you specify this request parameter for an inventory
     * retrieval job request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param archiveId The ID of the archive that you want to retrieve. This field is
     *         required only if <code>Type</code> is set to archive-retrieval. An
     *         error occurs if you specify this request parameter for an inventory
     *         retrieval job request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public JobParameters withArchiveId(String archiveId) {
        this.archiveId = archiveId;
        return this;
    }

    /**
     * The optional description for the job. The description must be less
     * than or equal to 1,024 bytes. The allowable characters are 7-bit ASCII
     * without control codes���specifically, ASCII values 32���126 decimal or
     * 0x20���0x7E hexadecimal.
     *
     * @return The optional description for the job. The description must be less
     *         than or equal to 1,024 bytes. The allowable characters are 7-bit ASCII
     *         without control codes���specifically, ASCII values 32���126 decimal or
     *         0x20���0x7E hexadecimal.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The optional description for the job. The description must be less
     * than or equal to 1,024 bytes. The allowable characters are 7-bit ASCII
     * without control codes���specifically, ASCII values 32���126 decimal or
     * 0x20���0x7E hexadecimal.
     *
     * @param description The optional description for the job. The description must be less
     *         than or equal to 1,024 bytes. The allowable characters are 7-bit ASCII
     *         without control codes���specifically, ASCII values 32���126 decimal or
     *         0x20���0x7E hexadecimal.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The optional description for the job. The description must be less
     * than or equal to 1,024 bytes. The allowable characters are 7-bit ASCII
     * without control codes���specifically, ASCII values 32���126 decimal or
     * 0x20���0x7E hexadecimal.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The optional description for the job. The description must be less
     *         than or equal to 1,024 bytes. The allowable characters are 7-bit ASCII
     *         without control codes���specifically, ASCII values 32���126 decimal or
     *         0x20���0x7E hexadecimal.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public JobParameters withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The Amazon SNS topic ARN to which Amazon Glacier sends a notification
     * when the job is completed and the output is ready for you to download.
     * The specified topic publishes the notification to its subscribers. The
     * SNS topic must exist.
     *
     * @return The Amazon SNS topic ARN to which Amazon Glacier sends a notification
     *         when the job is completed and the output is ready for you to download.
     *         The specified topic publishes the notification to its subscribers. The
     *         SNS topic must exist.
     */
    public String getSNSTopic() {
        return sNSTopic;
    }
    
    /**
     * The Amazon SNS topic ARN to which Amazon Glacier sends a notification
     * when the job is completed and the output is ready for you to download.
     * The specified topic publishes the notification to its subscribers. The
     * SNS topic must exist.
     *
     * @param sNSTopic The Amazon SNS topic ARN to which Amazon Glacier sends a notification
     *         when the job is completed and the output is ready for you to download.
     *         The specified topic publishes the notification to its subscribers. The
     *         SNS topic must exist.
     */
    public void setSNSTopic(String sNSTopic) {
        this.sNSTopic = sNSTopic;
    }
    
    /**
     * The Amazon SNS topic ARN to which Amazon Glacier sends a notification
     * when the job is completed and the output is ready for you to download.
     * The specified topic publishes the notification to its subscribers. The
     * SNS topic must exist.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sNSTopic The Amazon SNS topic ARN to which Amazon Glacier sends a notification
     *         when the job is completed and the output is ready for you to download.
     *         The specified topic publishes the notification to its subscribers. The
     *         SNS topic must exist.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public JobParameters withSNSTopic(String sNSTopic) {
        this.sNSTopic = sNSTopic;
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
    public JobParameters withRetrievalByteRange(String retrievalByteRange) {
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
        if (getFormat() != null) sb.append("Format: " + getFormat() + ",");
        if (getType() != null) sb.append("Type: " + getType() + ",");
        if (getArchiveId() != null) sb.append("ArchiveId: " + getArchiveId() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getSNSTopic() != null) sb.append("SNSTopic: " + getSNSTopic() + ",");
        if (getRetrievalByteRange() != null) sb.append("RetrievalByteRange: " + getRetrievalByteRange() );
        sb.append("}");
        return sb.toString();
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
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof JobParameters == false) return false;
        JobParameters other = (JobParameters)obj;
        
        if (other.getFormat() == null ^ this.getFormat() == null) return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false) return false; 
        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false; 
        if (other.getArchiveId() == null ^ this.getArchiveId() == null) return false;
        if (other.getArchiveId() != null && other.getArchiveId().equals(this.getArchiveId()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getSNSTopic() == null ^ this.getSNSTopic() == null) return false;
        if (other.getSNSTopic() != null && other.getSNSTopic().equals(this.getSNSTopic()) == false) return false; 
        if (other.getRetrievalByteRange() == null ^ this.getRetrievalByteRange() == null) return false;
        if (other.getRetrievalByteRange() != null && other.getRetrievalByteRange().equals(this.getRetrievalByteRange()) == false) return false; 
        return true;
    }
    
}
    