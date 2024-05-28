/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Part of the response to ListMultipartReadSetUploads, excluding completed and aborted multipart uploads.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/MultipartReadSetUploadListItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MultipartReadSetUploadListItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The sequence store ID used for the multipart upload.
     * </p>
     */
    private String sequenceStoreId;
    /**
     * <p>
     * The ID for the initiated multipart upload.
     * </p>
     */
    private String uploadId;
    /**
     * <p>
     * The type of file the read set originated from.
     * </p>
     */
    private String sourceFileType;
    /**
     * <p>
     * The read set source's subject ID.
     * </p>
     */
    private String subjectId;
    /**
     * <p>
     * The read set source's sample ID.
     * </p>
     */
    private String sampleId;
    /**
     * <p>
     * The source of an uploaded part.
     * </p>
     */
    private String generatedFrom;
    /**
     * <p>
     * The source's reference ARN.
     * </p>
     */
    private String referenceArn;
    /**
     * <p>
     * The name of a read set.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of a read set.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Any tags you wish to add to a read set.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The time stamp for when a direct upload was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The sequence store ID used for the multipart upload.
     * </p>
     * 
     * @param sequenceStoreId
     *        The sequence store ID used for the multipart upload.
     */

    public void setSequenceStoreId(String sequenceStoreId) {
        this.sequenceStoreId = sequenceStoreId;
    }

    /**
     * <p>
     * The sequence store ID used for the multipart upload.
     * </p>
     * 
     * @return The sequence store ID used for the multipart upload.
     */

    public String getSequenceStoreId() {
        return this.sequenceStoreId;
    }

    /**
     * <p>
     * The sequence store ID used for the multipart upload.
     * </p>
     * 
     * @param sequenceStoreId
     *        The sequence store ID used for the multipart upload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultipartReadSetUploadListItem withSequenceStoreId(String sequenceStoreId) {
        setSequenceStoreId(sequenceStoreId);
        return this;
    }

    /**
     * <p>
     * The ID for the initiated multipart upload.
     * </p>
     * 
     * @param uploadId
     *        The ID for the initiated multipart upload.
     */

    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    /**
     * <p>
     * The ID for the initiated multipart upload.
     * </p>
     * 
     * @return The ID for the initiated multipart upload.
     */

    public String getUploadId() {
        return this.uploadId;
    }

    /**
     * <p>
     * The ID for the initiated multipart upload.
     * </p>
     * 
     * @param uploadId
     *        The ID for the initiated multipart upload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultipartReadSetUploadListItem withUploadId(String uploadId) {
        setUploadId(uploadId);
        return this;
    }

    /**
     * <p>
     * The type of file the read set originated from.
     * </p>
     * 
     * @param sourceFileType
     *        The type of file the read set originated from.
     * @see FileType
     */

    public void setSourceFileType(String sourceFileType) {
        this.sourceFileType = sourceFileType;
    }

    /**
     * <p>
     * The type of file the read set originated from.
     * </p>
     * 
     * @return The type of file the read set originated from.
     * @see FileType
     */

    public String getSourceFileType() {
        return this.sourceFileType;
    }

    /**
     * <p>
     * The type of file the read set originated from.
     * </p>
     * 
     * @param sourceFileType
     *        The type of file the read set originated from.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileType
     */

    public MultipartReadSetUploadListItem withSourceFileType(String sourceFileType) {
        setSourceFileType(sourceFileType);
        return this;
    }

    /**
     * <p>
     * The type of file the read set originated from.
     * </p>
     * 
     * @param sourceFileType
     *        The type of file the read set originated from.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileType
     */

    public MultipartReadSetUploadListItem withSourceFileType(FileType sourceFileType) {
        this.sourceFileType = sourceFileType.toString();
        return this;
    }

    /**
     * <p>
     * The read set source's subject ID.
     * </p>
     * 
     * @param subjectId
     *        The read set source's subject ID.
     */

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    /**
     * <p>
     * The read set source's subject ID.
     * </p>
     * 
     * @return The read set source's subject ID.
     */

    public String getSubjectId() {
        return this.subjectId;
    }

    /**
     * <p>
     * The read set source's subject ID.
     * </p>
     * 
     * @param subjectId
     *        The read set source's subject ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultipartReadSetUploadListItem withSubjectId(String subjectId) {
        setSubjectId(subjectId);
        return this;
    }

    /**
     * <p>
     * The read set source's sample ID.
     * </p>
     * 
     * @param sampleId
     *        The read set source's sample ID.
     */

    public void setSampleId(String sampleId) {
        this.sampleId = sampleId;
    }

    /**
     * <p>
     * The read set source's sample ID.
     * </p>
     * 
     * @return The read set source's sample ID.
     */

    public String getSampleId() {
        return this.sampleId;
    }

    /**
     * <p>
     * The read set source's sample ID.
     * </p>
     * 
     * @param sampleId
     *        The read set source's sample ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultipartReadSetUploadListItem withSampleId(String sampleId) {
        setSampleId(sampleId);
        return this;
    }

    /**
     * <p>
     * The source of an uploaded part.
     * </p>
     * 
     * @param generatedFrom
     *        The source of an uploaded part.
     */

    public void setGeneratedFrom(String generatedFrom) {
        this.generatedFrom = generatedFrom;
    }

    /**
     * <p>
     * The source of an uploaded part.
     * </p>
     * 
     * @return The source of an uploaded part.
     */

    public String getGeneratedFrom() {
        return this.generatedFrom;
    }

    /**
     * <p>
     * The source of an uploaded part.
     * </p>
     * 
     * @param generatedFrom
     *        The source of an uploaded part.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultipartReadSetUploadListItem withGeneratedFrom(String generatedFrom) {
        setGeneratedFrom(generatedFrom);
        return this;
    }

    /**
     * <p>
     * The source's reference ARN.
     * </p>
     * 
     * @param referenceArn
     *        The source's reference ARN.
     */

    public void setReferenceArn(String referenceArn) {
        this.referenceArn = referenceArn;
    }

    /**
     * <p>
     * The source's reference ARN.
     * </p>
     * 
     * @return The source's reference ARN.
     */

    public String getReferenceArn() {
        return this.referenceArn;
    }

    /**
     * <p>
     * The source's reference ARN.
     * </p>
     * 
     * @param referenceArn
     *        The source's reference ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultipartReadSetUploadListItem withReferenceArn(String referenceArn) {
        setReferenceArn(referenceArn);
        return this;
    }

    /**
     * <p>
     * The name of a read set.
     * </p>
     * 
     * @param name
     *        The name of a read set.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a read set.
     * </p>
     * 
     * @return The name of a read set.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of a read set.
     * </p>
     * 
     * @param name
     *        The name of a read set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultipartReadSetUploadListItem withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of a read set.
     * </p>
     * 
     * @param description
     *        The description of a read set.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of a read set.
     * </p>
     * 
     * @return The description of a read set.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of a read set.
     * </p>
     * 
     * @param description
     *        The description of a read set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultipartReadSetUploadListItem withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Any tags you wish to add to a read set.
     * </p>
     * 
     * @return Any tags you wish to add to a read set.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags you wish to add to a read set.
     * </p>
     * 
     * @param tags
     *        Any tags you wish to add to a read set.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Any tags you wish to add to a read set.
     * </p>
     * 
     * @param tags
     *        Any tags you wish to add to a read set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultipartReadSetUploadListItem withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see MultipartReadSetUploadListItem#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public MultipartReadSetUploadListItem addTagsEntry(String key, String value) {
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

    public MultipartReadSetUploadListItem clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The time stamp for when a direct upload was created.
     * </p>
     * 
     * @param creationTime
     *        The time stamp for when a direct upload was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time stamp for when a direct upload was created.
     * </p>
     * 
     * @return The time stamp for when a direct upload was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time stamp for when a direct upload was created.
     * </p>
     * 
     * @param creationTime
     *        The time stamp for when a direct upload was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultipartReadSetUploadListItem withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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
        if (getSequenceStoreId() != null)
            sb.append("SequenceStoreId: ").append(getSequenceStoreId()).append(",");
        if (getUploadId() != null)
            sb.append("UploadId: ").append(getUploadId()).append(",");
        if (getSourceFileType() != null)
            sb.append("SourceFileType: ").append(getSourceFileType()).append(",");
        if (getSubjectId() != null)
            sb.append("SubjectId: ").append(getSubjectId()).append(",");
        if (getSampleId() != null)
            sb.append("SampleId: ").append(getSampleId()).append(",");
        if (getGeneratedFrom() != null)
            sb.append("GeneratedFrom: ").append(getGeneratedFrom()).append(",");
        if (getReferenceArn() != null)
            sb.append("ReferenceArn: ").append(getReferenceArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MultipartReadSetUploadListItem == false)
            return false;
        MultipartReadSetUploadListItem other = (MultipartReadSetUploadListItem) obj;
        if (other.getSequenceStoreId() == null ^ this.getSequenceStoreId() == null)
            return false;
        if (other.getSequenceStoreId() != null && other.getSequenceStoreId().equals(this.getSequenceStoreId()) == false)
            return false;
        if (other.getUploadId() == null ^ this.getUploadId() == null)
            return false;
        if (other.getUploadId() != null && other.getUploadId().equals(this.getUploadId()) == false)
            return false;
        if (other.getSourceFileType() == null ^ this.getSourceFileType() == null)
            return false;
        if (other.getSourceFileType() != null && other.getSourceFileType().equals(this.getSourceFileType()) == false)
            return false;
        if (other.getSubjectId() == null ^ this.getSubjectId() == null)
            return false;
        if (other.getSubjectId() != null && other.getSubjectId().equals(this.getSubjectId()) == false)
            return false;
        if (other.getSampleId() == null ^ this.getSampleId() == null)
            return false;
        if (other.getSampleId() != null && other.getSampleId().equals(this.getSampleId()) == false)
            return false;
        if (other.getGeneratedFrom() == null ^ this.getGeneratedFrom() == null)
            return false;
        if (other.getGeneratedFrom() != null && other.getGeneratedFrom().equals(this.getGeneratedFrom()) == false)
            return false;
        if (other.getReferenceArn() == null ^ this.getReferenceArn() == null)
            return false;
        if (other.getReferenceArn() != null && other.getReferenceArn().equals(this.getReferenceArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSequenceStoreId() == null) ? 0 : getSequenceStoreId().hashCode());
        hashCode = prime * hashCode + ((getUploadId() == null) ? 0 : getUploadId().hashCode());
        hashCode = prime * hashCode + ((getSourceFileType() == null) ? 0 : getSourceFileType().hashCode());
        hashCode = prime * hashCode + ((getSubjectId() == null) ? 0 : getSubjectId().hashCode());
        hashCode = prime * hashCode + ((getSampleId() == null) ? 0 : getSampleId().hashCode());
        hashCode = prime * hashCode + ((getGeneratedFrom() == null) ? 0 : getGeneratedFrom().hashCode());
        hashCode = prime * hashCode + ((getReferenceArn() == null) ? 0 : getReferenceArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public MultipartReadSetUploadListItem clone() {
        try {
            return (MultipartReadSetUploadListItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.omics.model.transform.MultipartReadSetUploadListItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
