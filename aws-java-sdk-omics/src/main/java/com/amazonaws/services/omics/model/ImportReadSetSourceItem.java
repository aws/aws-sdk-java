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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A source for an import read set job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ImportReadSetSourceItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportReadSetSourceItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The source's description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Where the source originated.
     * </p>
     */
    private String generatedFrom;
    /**
     * <p>
     * The source's name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The source's genome reference ARN.
     * </p>
     */
    private String referenceArn;
    /**
     * <p>
     * The source's sample ID.
     * </p>
     */
    private String sampleId;
    /**
     * <p>
     * The source's file type.
     * </p>
     */
    private String sourceFileType;
    /**
     * <p>
     * The source files' location in Amazon S3.
     * </p>
     */
    private SourceFiles sourceFiles;
    /**
     * <p>
     * The source's status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The source's status message.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The source's subject ID.
     * </p>
     */
    private String subjectId;
    /**
     * <p>
     * The source's tags.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The source's description.
     * </p>
     * 
     * @param description
     *        The source's description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The source's description.
     * </p>
     * 
     * @return The source's description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The source's description.
     * </p>
     * 
     * @param description
     *        The source's description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportReadSetSourceItem withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Where the source originated.
     * </p>
     * 
     * @param generatedFrom
     *        Where the source originated.
     */

    public void setGeneratedFrom(String generatedFrom) {
        this.generatedFrom = generatedFrom;
    }

    /**
     * <p>
     * Where the source originated.
     * </p>
     * 
     * @return Where the source originated.
     */

    public String getGeneratedFrom() {
        return this.generatedFrom;
    }

    /**
     * <p>
     * Where the source originated.
     * </p>
     * 
     * @param generatedFrom
     *        Where the source originated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportReadSetSourceItem withGeneratedFrom(String generatedFrom) {
        setGeneratedFrom(generatedFrom);
        return this;
    }

    /**
     * <p>
     * The source's name.
     * </p>
     * 
     * @param name
     *        The source's name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The source's name.
     * </p>
     * 
     * @return The source's name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The source's name.
     * </p>
     * 
     * @param name
     *        The source's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportReadSetSourceItem withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The source's genome reference ARN.
     * </p>
     * 
     * @param referenceArn
     *        The source's genome reference ARN.
     */

    public void setReferenceArn(String referenceArn) {
        this.referenceArn = referenceArn;
    }

    /**
     * <p>
     * The source's genome reference ARN.
     * </p>
     * 
     * @return The source's genome reference ARN.
     */

    public String getReferenceArn() {
        return this.referenceArn;
    }

    /**
     * <p>
     * The source's genome reference ARN.
     * </p>
     * 
     * @param referenceArn
     *        The source's genome reference ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportReadSetSourceItem withReferenceArn(String referenceArn) {
        setReferenceArn(referenceArn);
        return this;
    }

    /**
     * <p>
     * The source's sample ID.
     * </p>
     * 
     * @param sampleId
     *        The source's sample ID.
     */

    public void setSampleId(String sampleId) {
        this.sampleId = sampleId;
    }

    /**
     * <p>
     * The source's sample ID.
     * </p>
     * 
     * @return The source's sample ID.
     */

    public String getSampleId() {
        return this.sampleId;
    }

    /**
     * <p>
     * The source's sample ID.
     * </p>
     * 
     * @param sampleId
     *        The source's sample ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportReadSetSourceItem withSampleId(String sampleId) {
        setSampleId(sampleId);
        return this;
    }

    /**
     * <p>
     * The source's file type.
     * </p>
     * 
     * @param sourceFileType
     *        The source's file type.
     * @see FileType
     */

    public void setSourceFileType(String sourceFileType) {
        this.sourceFileType = sourceFileType;
    }

    /**
     * <p>
     * The source's file type.
     * </p>
     * 
     * @return The source's file type.
     * @see FileType
     */

    public String getSourceFileType() {
        return this.sourceFileType;
    }

    /**
     * <p>
     * The source's file type.
     * </p>
     * 
     * @param sourceFileType
     *        The source's file type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileType
     */

    public ImportReadSetSourceItem withSourceFileType(String sourceFileType) {
        setSourceFileType(sourceFileType);
        return this;
    }

    /**
     * <p>
     * The source's file type.
     * </p>
     * 
     * @param sourceFileType
     *        The source's file type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileType
     */

    public ImportReadSetSourceItem withSourceFileType(FileType sourceFileType) {
        this.sourceFileType = sourceFileType.toString();
        return this;
    }

    /**
     * <p>
     * The source files' location in Amazon S3.
     * </p>
     * 
     * @param sourceFiles
     *        The source files' location in Amazon S3.
     */

    public void setSourceFiles(SourceFiles sourceFiles) {
        this.sourceFiles = sourceFiles;
    }

    /**
     * <p>
     * The source files' location in Amazon S3.
     * </p>
     * 
     * @return The source files' location in Amazon S3.
     */

    public SourceFiles getSourceFiles() {
        return this.sourceFiles;
    }

    /**
     * <p>
     * The source files' location in Amazon S3.
     * </p>
     * 
     * @param sourceFiles
     *        The source files' location in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportReadSetSourceItem withSourceFiles(SourceFiles sourceFiles) {
        setSourceFiles(sourceFiles);
        return this;
    }

    /**
     * <p>
     * The source's status.
     * </p>
     * 
     * @param status
     *        The source's status.
     * @see ReadSetImportJobItemStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The source's status.
     * </p>
     * 
     * @return The source's status.
     * @see ReadSetImportJobItemStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The source's status.
     * </p>
     * 
     * @param status
     *        The source's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReadSetImportJobItemStatus
     */

    public ImportReadSetSourceItem withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The source's status.
     * </p>
     * 
     * @param status
     *        The source's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReadSetImportJobItemStatus
     */

    public ImportReadSetSourceItem withStatus(ReadSetImportJobItemStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The source's status message.
     * </p>
     * 
     * @param statusMessage
     *        The source's status message.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The source's status message.
     * </p>
     * 
     * @return The source's status message.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The source's status message.
     * </p>
     * 
     * @param statusMessage
     *        The source's status message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportReadSetSourceItem withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The source's subject ID.
     * </p>
     * 
     * @param subjectId
     *        The source's subject ID.
     */

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    /**
     * <p>
     * The source's subject ID.
     * </p>
     * 
     * @return The source's subject ID.
     */

    public String getSubjectId() {
        return this.subjectId;
    }

    /**
     * <p>
     * The source's subject ID.
     * </p>
     * 
     * @param subjectId
     *        The source's subject ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportReadSetSourceItem withSubjectId(String subjectId) {
        setSubjectId(subjectId);
        return this;
    }

    /**
     * <p>
     * The source's tags.
     * </p>
     * 
     * @return The source's tags.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The source's tags.
     * </p>
     * 
     * @param tags
     *        The source's tags.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The source's tags.
     * </p>
     * 
     * @param tags
     *        The source's tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportReadSetSourceItem withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see ImportReadSetSourceItem#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ImportReadSetSourceItem addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportReadSetSourceItem clearTagsEntries() {
        this.tags = null;
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getGeneratedFrom() != null)
            sb.append("GeneratedFrom: ").append(getGeneratedFrom()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getReferenceArn() != null)
            sb.append("ReferenceArn: ").append(getReferenceArn()).append(",");
        if (getSampleId() != null)
            sb.append("SampleId: ").append(getSampleId()).append(",");
        if (getSourceFileType() != null)
            sb.append("SourceFileType: ").append(getSourceFileType()).append(",");
        if (getSourceFiles() != null)
            sb.append("SourceFiles: ").append(getSourceFiles()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getSubjectId() != null)
            sb.append("SubjectId: ").append(getSubjectId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportReadSetSourceItem == false)
            return false;
        ImportReadSetSourceItem other = (ImportReadSetSourceItem) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getGeneratedFrom() == null ^ this.getGeneratedFrom() == null)
            return false;
        if (other.getGeneratedFrom() != null && other.getGeneratedFrom().equals(this.getGeneratedFrom()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getReferenceArn() == null ^ this.getReferenceArn() == null)
            return false;
        if (other.getReferenceArn() != null && other.getReferenceArn().equals(this.getReferenceArn()) == false)
            return false;
        if (other.getSampleId() == null ^ this.getSampleId() == null)
            return false;
        if (other.getSampleId() != null && other.getSampleId().equals(this.getSampleId()) == false)
            return false;
        if (other.getSourceFileType() == null ^ this.getSourceFileType() == null)
            return false;
        if (other.getSourceFileType() != null && other.getSourceFileType().equals(this.getSourceFileType()) == false)
            return false;
        if (other.getSourceFiles() == null ^ this.getSourceFiles() == null)
            return false;
        if (other.getSourceFiles() != null && other.getSourceFiles().equals(this.getSourceFiles()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getSubjectId() == null ^ this.getSubjectId() == null)
            return false;
        if (other.getSubjectId() != null && other.getSubjectId().equals(this.getSubjectId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getGeneratedFrom() == null) ? 0 : getGeneratedFrom().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getReferenceArn() == null) ? 0 : getReferenceArn().hashCode());
        hashCode = prime * hashCode + ((getSampleId() == null) ? 0 : getSampleId().hashCode());
        hashCode = prime * hashCode + ((getSourceFileType() == null) ? 0 : getSourceFileType().hashCode());
        hashCode = prime * hashCode + ((getSourceFiles() == null) ? 0 : getSourceFiles().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getSubjectId() == null) ? 0 : getSubjectId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ImportReadSetSourceItem clone() {
        try {
            return (ImportReadSetSourceItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.omics.model.transform.ImportReadSetSourceItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
