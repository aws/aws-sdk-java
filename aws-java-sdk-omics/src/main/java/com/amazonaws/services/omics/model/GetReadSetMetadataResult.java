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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetReadSetMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetReadSetMetadataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The read set's ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * When the read set was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The read set's description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The read set's file type.
     * </p>
     */
    private String fileType;
    /**
     * <p>
     * The read set's files.
     * </p>
     */
    private ReadSetFiles files;
    /**
     * <p>
     * The read set's ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The read set's name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The read set's genome reference ARN.
     * </p>
     */
    private String referenceArn;
    /**
     * <p>
     * The read set's sample ID.
     * </p>
     */
    private String sampleId;
    /**
     * <p>
     * The read set's sequence information.
     * </p>
     */
    private SequenceInformation sequenceInformation;
    /**
     * <p>
     * The read set's sequence store ID.
     * </p>
     */
    private String sequenceStoreId;
    /**
     * <p>
     * The read set's status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The read set's subject ID.
     * </p>
     */
    private String subjectId;

    /**
     * <p>
     * The read set's ARN.
     * </p>
     * 
     * @param arn
     *        The read set's ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The read set's ARN.
     * </p>
     * 
     * @return The read set's ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The read set's ARN.
     * </p>
     * 
     * @param arn
     *        The read set's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReadSetMetadataResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * When the read set was created.
     * </p>
     * 
     * @param creationTime
     *        When the read set was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the read set was created.
     * </p>
     * 
     * @return When the read set was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the read set was created.
     * </p>
     * 
     * @param creationTime
     *        When the read set was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReadSetMetadataResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The read set's description.
     * </p>
     * 
     * @param description
     *        The read set's description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The read set's description.
     * </p>
     * 
     * @return The read set's description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The read set's description.
     * </p>
     * 
     * @param description
     *        The read set's description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReadSetMetadataResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The read set's file type.
     * </p>
     * 
     * @param fileType
     *        The read set's file type.
     * @see FileType
     */

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    /**
     * <p>
     * The read set's file type.
     * </p>
     * 
     * @return The read set's file type.
     * @see FileType
     */

    public String getFileType() {
        return this.fileType;
    }

    /**
     * <p>
     * The read set's file type.
     * </p>
     * 
     * @param fileType
     *        The read set's file type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileType
     */

    public GetReadSetMetadataResult withFileType(String fileType) {
        setFileType(fileType);
        return this;
    }

    /**
     * <p>
     * The read set's file type.
     * </p>
     * 
     * @param fileType
     *        The read set's file type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileType
     */

    public GetReadSetMetadataResult withFileType(FileType fileType) {
        this.fileType = fileType.toString();
        return this;
    }

    /**
     * <p>
     * The read set's files.
     * </p>
     * 
     * @param files
     *        The read set's files.
     */

    public void setFiles(ReadSetFiles files) {
        this.files = files;
    }

    /**
     * <p>
     * The read set's files.
     * </p>
     * 
     * @return The read set's files.
     */

    public ReadSetFiles getFiles() {
        return this.files;
    }

    /**
     * <p>
     * The read set's files.
     * </p>
     * 
     * @param files
     *        The read set's files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReadSetMetadataResult withFiles(ReadSetFiles files) {
        setFiles(files);
        return this;
    }

    /**
     * <p>
     * The read set's ID.
     * </p>
     * 
     * @param id
     *        The read set's ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The read set's ID.
     * </p>
     * 
     * @return The read set's ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The read set's ID.
     * </p>
     * 
     * @param id
     *        The read set's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReadSetMetadataResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The read set's name.
     * </p>
     * 
     * @param name
     *        The read set's name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The read set's name.
     * </p>
     * 
     * @return The read set's name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The read set's name.
     * </p>
     * 
     * @param name
     *        The read set's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReadSetMetadataResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The read set's genome reference ARN.
     * </p>
     * 
     * @param referenceArn
     *        The read set's genome reference ARN.
     */

    public void setReferenceArn(String referenceArn) {
        this.referenceArn = referenceArn;
    }

    /**
     * <p>
     * The read set's genome reference ARN.
     * </p>
     * 
     * @return The read set's genome reference ARN.
     */

    public String getReferenceArn() {
        return this.referenceArn;
    }

    /**
     * <p>
     * The read set's genome reference ARN.
     * </p>
     * 
     * @param referenceArn
     *        The read set's genome reference ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReadSetMetadataResult withReferenceArn(String referenceArn) {
        setReferenceArn(referenceArn);
        return this;
    }

    /**
     * <p>
     * The read set's sample ID.
     * </p>
     * 
     * @param sampleId
     *        The read set's sample ID.
     */

    public void setSampleId(String sampleId) {
        this.sampleId = sampleId;
    }

    /**
     * <p>
     * The read set's sample ID.
     * </p>
     * 
     * @return The read set's sample ID.
     */

    public String getSampleId() {
        return this.sampleId;
    }

    /**
     * <p>
     * The read set's sample ID.
     * </p>
     * 
     * @param sampleId
     *        The read set's sample ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReadSetMetadataResult withSampleId(String sampleId) {
        setSampleId(sampleId);
        return this;
    }

    /**
     * <p>
     * The read set's sequence information.
     * </p>
     * 
     * @param sequenceInformation
     *        The read set's sequence information.
     */

    public void setSequenceInformation(SequenceInformation sequenceInformation) {
        this.sequenceInformation = sequenceInformation;
    }

    /**
     * <p>
     * The read set's sequence information.
     * </p>
     * 
     * @return The read set's sequence information.
     */

    public SequenceInformation getSequenceInformation() {
        return this.sequenceInformation;
    }

    /**
     * <p>
     * The read set's sequence information.
     * </p>
     * 
     * @param sequenceInformation
     *        The read set's sequence information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReadSetMetadataResult withSequenceInformation(SequenceInformation sequenceInformation) {
        setSequenceInformation(sequenceInformation);
        return this;
    }

    /**
     * <p>
     * The read set's sequence store ID.
     * </p>
     * 
     * @param sequenceStoreId
     *        The read set's sequence store ID.
     */

    public void setSequenceStoreId(String sequenceStoreId) {
        this.sequenceStoreId = sequenceStoreId;
    }

    /**
     * <p>
     * The read set's sequence store ID.
     * </p>
     * 
     * @return The read set's sequence store ID.
     */

    public String getSequenceStoreId() {
        return this.sequenceStoreId;
    }

    /**
     * <p>
     * The read set's sequence store ID.
     * </p>
     * 
     * @param sequenceStoreId
     *        The read set's sequence store ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReadSetMetadataResult withSequenceStoreId(String sequenceStoreId) {
        setSequenceStoreId(sequenceStoreId);
        return this;
    }

    /**
     * <p>
     * The read set's status.
     * </p>
     * 
     * @param status
     *        The read set's status.
     * @see ReadSetStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The read set's status.
     * </p>
     * 
     * @return The read set's status.
     * @see ReadSetStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The read set's status.
     * </p>
     * 
     * @param status
     *        The read set's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReadSetStatus
     */

    public GetReadSetMetadataResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The read set's status.
     * </p>
     * 
     * @param status
     *        The read set's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReadSetStatus
     */

    public GetReadSetMetadataResult withStatus(ReadSetStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The read set's subject ID.
     * </p>
     * 
     * @param subjectId
     *        The read set's subject ID.
     */

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    /**
     * <p>
     * The read set's subject ID.
     * </p>
     * 
     * @return The read set's subject ID.
     */

    public String getSubjectId() {
        return this.subjectId;
    }

    /**
     * <p>
     * The read set's subject ID.
     * </p>
     * 
     * @param subjectId
     *        The read set's subject ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReadSetMetadataResult withSubjectId(String subjectId) {
        setSubjectId(subjectId);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getFileType() != null)
            sb.append("FileType: ").append(getFileType()).append(",");
        if (getFiles() != null)
            sb.append("Files: ").append(getFiles()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getReferenceArn() != null)
            sb.append("ReferenceArn: ").append(getReferenceArn()).append(",");
        if (getSampleId() != null)
            sb.append("SampleId: ").append(getSampleId()).append(",");
        if (getSequenceInformation() != null)
            sb.append("SequenceInformation: ").append(getSequenceInformation()).append(",");
        if (getSequenceStoreId() != null)
            sb.append("SequenceStoreId: ").append(getSequenceStoreId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSubjectId() != null)
            sb.append("SubjectId: ").append(getSubjectId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetReadSetMetadataResult == false)
            return false;
        GetReadSetMetadataResult other = (GetReadSetMetadataResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getFileType() == null ^ this.getFileType() == null)
            return false;
        if (other.getFileType() != null && other.getFileType().equals(this.getFileType()) == false)
            return false;
        if (other.getFiles() == null ^ this.getFiles() == null)
            return false;
        if (other.getFiles() != null && other.getFiles().equals(this.getFiles()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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
        if (other.getSequenceInformation() == null ^ this.getSequenceInformation() == null)
            return false;
        if (other.getSequenceInformation() != null && other.getSequenceInformation().equals(this.getSequenceInformation()) == false)
            return false;
        if (other.getSequenceStoreId() == null ^ this.getSequenceStoreId() == null)
            return false;
        if (other.getSequenceStoreId() != null && other.getSequenceStoreId().equals(this.getSequenceStoreId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSubjectId() == null ^ this.getSubjectId() == null)
            return false;
        if (other.getSubjectId() != null && other.getSubjectId().equals(this.getSubjectId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getFileType() == null) ? 0 : getFileType().hashCode());
        hashCode = prime * hashCode + ((getFiles() == null) ? 0 : getFiles().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getReferenceArn() == null) ? 0 : getReferenceArn().hashCode());
        hashCode = prime * hashCode + ((getSampleId() == null) ? 0 : getSampleId().hashCode());
        hashCode = prime * hashCode + ((getSequenceInformation() == null) ? 0 : getSequenceInformation().hashCode());
        hashCode = prime * hashCode + ((getSequenceStoreId() == null) ? 0 : getSequenceStoreId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSubjectId() == null) ? 0 : getSubjectId().hashCode());
        return hashCode;
    }

    @Override
    public GetReadSetMetadataResult clone() {
        try {
            return (GetReadSetMetadataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
