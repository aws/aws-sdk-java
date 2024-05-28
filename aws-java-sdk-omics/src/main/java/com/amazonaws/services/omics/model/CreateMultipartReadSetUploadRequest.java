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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CreateMultipartReadSetUpload" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMultipartReadSetUploadRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The sequence store ID for the store that is the destination of the multipart uploads.
     * </p>
     */
    private String sequenceStoreId;
    /**
     * <p>
     * An idempotency token that can be used to avoid triggering multiple multipart uploads.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The type of file being uploaded.
     * </p>
     */
    private String sourceFileType;
    /**
     * <p>
     * The source's subject ID.
     * </p>
     */
    private String subjectId;
    /**
     * <p>
     * The source's sample ID.
     * </p>
     */
    private String sampleId;
    /**
     * <p>
     * Where the source originated.
     * </p>
     */
    private String generatedFrom;
    /**
     * <p>
     * The ARN of the reference.
     * </p>
     */
    private String referenceArn;
    /**
     * <p>
     * The name of the read set.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the read set.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Any tags to add to the read set.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The sequence store ID for the store that is the destination of the multipart uploads.
     * </p>
     * 
     * @param sequenceStoreId
     *        The sequence store ID for the store that is the destination of the multipart uploads.
     */

    public void setSequenceStoreId(String sequenceStoreId) {
        this.sequenceStoreId = sequenceStoreId;
    }

    /**
     * <p>
     * The sequence store ID for the store that is the destination of the multipart uploads.
     * </p>
     * 
     * @return The sequence store ID for the store that is the destination of the multipart uploads.
     */

    public String getSequenceStoreId() {
        return this.sequenceStoreId;
    }

    /**
     * <p>
     * The sequence store ID for the store that is the destination of the multipart uploads.
     * </p>
     * 
     * @param sequenceStoreId
     *        The sequence store ID for the store that is the destination of the multipart uploads.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMultipartReadSetUploadRequest withSequenceStoreId(String sequenceStoreId) {
        setSequenceStoreId(sequenceStoreId);
        return this;
    }

    /**
     * <p>
     * An idempotency token that can be used to avoid triggering multiple multipart uploads.
     * </p>
     * 
     * @param clientToken
     *        An idempotency token that can be used to avoid triggering multiple multipart uploads.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * An idempotency token that can be used to avoid triggering multiple multipart uploads.
     * </p>
     * 
     * @return An idempotency token that can be used to avoid triggering multiple multipart uploads.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * An idempotency token that can be used to avoid triggering multiple multipart uploads.
     * </p>
     * 
     * @param clientToken
     *        An idempotency token that can be used to avoid triggering multiple multipart uploads.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMultipartReadSetUploadRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The type of file being uploaded.
     * </p>
     * 
     * @param sourceFileType
     *        The type of file being uploaded.
     * @see FileType
     */

    public void setSourceFileType(String sourceFileType) {
        this.sourceFileType = sourceFileType;
    }

    /**
     * <p>
     * The type of file being uploaded.
     * </p>
     * 
     * @return The type of file being uploaded.
     * @see FileType
     */

    public String getSourceFileType() {
        return this.sourceFileType;
    }

    /**
     * <p>
     * The type of file being uploaded.
     * </p>
     * 
     * @param sourceFileType
     *        The type of file being uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileType
     */

    public CreateMultipartReadSetUploadRequest withSourceFileType(String sourceFileType) {
        setSourceFileType(sourceFileType);
        return this;
    }

    /**
     * <p>
     * The type of file being uploaded.
     * </p>
     * 
     * @param sourceFileType
     *        The type of file being uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileType
     */

    public CreateMultipartReadSetUploadRequest withSourceFileType(FileType sourceFileType) {
        this.sourceFileType = sourceFileType.toString();
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

    public CreateMultipartReadSetUploadRequest withSubjectId(String subjectId) {
        setSubjectId(subjectId);
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

    public CreateMultipartReadSetUploadRequest withSampleId(String sampleId) {
        setSampleId(sampleId);
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

    public CreateMultipartReadSetUploadRequest withGeneratedFrom(String generatedFrom) {
        setGeneratedFrom(generatedFrom);
        return this;
    }

    /**
     * <p>
     * The ARN of the reference.
     * </p>
     * 
     * @param referenceArn
     *        The ARN of the reference.
     */

    public void setReferenceArn(String referenceArn) {
        this.referenceArn = referenceArn;
    }

    /**
     * <p>
     * The ARN of the reference.
     * </p>
     * 
     * @return The ARN of the reference.
     */

    public String getReferenceArn() {
        return this.referenceArn;
    }

    /**
     * <p>
     * The ARN of the reference.
     * </p>
     * 
     * @param referenceArn
     *        The ARN of the reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMultipartReadSetUploadRequest withReferenceArn(String referenceArn) {
        setReferenceArn(referenceArn);
        return this;
    }

    /**
     * <p>
     * The name of the read set.
     * </p>
     * 
     * @param name
     *        The name of the read set.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the read set.
     * </p>
     * 
     * @return The name of the read set.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the read set.
     * </p>
     * 
     * @param name
     *        The name of the read set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMultipartReadSetUploadRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the read set.
     * </p>
     * 
     * @param description
     *        The description of the read set.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the read set.
     * </p>
     * 
     * @return The description of the read set.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the read set.
     * </p>
     * 
     * @param description
     *        The description of the read set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMultipartReadSetUploadRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Any tags to add to the read set.
     * </p>
     * 
     * @return Any tags to add to the read set.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags to add to the read set.
     * </p>
     * 
     * @param tags
     *        Any tags to add to the read set.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Any tags to add to the read set.
     * </p>
     * 
     * @param tags
     *        Any tags to add to the read set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMultipartReadSetUploadRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateMultipartReadSetUploadRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateMultipartReadSetUploadRequest addTagsEntry(String key, String value) {
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

    public CreateMultipartReadSetUploadRequest clearTagsEntries() {
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
        if (getSequenceStoreId() != null)
            sb.append("SequenceStoreId: ").append(getSequenceStoreId()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
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

        if (obj instanceof CreateMultipartReadSetUploadRequest == false)
            return false;
        CreateMultipartReadSetUploadRequest other = (CreateMultipartReadSetUploadRequest) obj;
        if (other.getSequenceStoreId() == null ^ this.getSequenceStoreId() == null)
            return false;
        if (other.getSequenceStoreId() != null && other.getSequenceStoreId().equals(this.getSequenceStoreId()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSequenceStoreId() == null) ? 0 : getSequenceStoreId().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getSourceFileType() == null) ? 0 : getSourceFileType().hashCode());
        hashCode = prime * hashCode + ((getSubjectId() == null) ? 0 : getSubjectId().hashCode());
        hashCode = prime * hashCode + ((getSampleId() == null) ? 0 : getSampleId().hashCode());
        hashCode = prime * hashCode + ((getGeneratedFrom() == null) ? 0 : getGeneratedFrom().hashCode());
        hashCode = prime * hashCode + ((getReferenceArn() == null) ? 0 : getReferenceArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateMultipartReadSetUploadRequest clone() {
        return (CreateMultipartReadSetUploadRequest) super.clone();
    }

}
