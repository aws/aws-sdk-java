/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ebs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ebs-2019-11-02/StartSnapshot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartSnapshotResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The description of the snapshot.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * The AWS account ID of the snapshot owner.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The status of the snapshot.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The timestamp when the snapshot was created.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The size of the volume, in GiB.
     * </p>
     */
    private Long volumeSize;
    /**
     * <p>
     * The size of the blocks in the snapshot, in bytes.
     * </p>
     */
    private Integer blockSize;
    /**
     * <p>
     * The tags applied to the snapshot. You can specify up to 50 tags per snapshot. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"> Tagging your Amazon EC2 resources</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The ID of the parent snapshot.
     * </p>
     */
    private String parentSnapshotId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Key Management Service (AWS KMS) customer master key (CMK) used to
     * encrypt the snapshot.
     * </p>
     */
    private String kmsKeyArn;

    /**
     * <p>
     * The description of the snapshot.
     * </p>
     * 
     * @param description
     *        The description of the snapshot.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the snapshot.
     * </p>
     * 
     * @return The description of the snapshot.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the snapshot.
     * </p>
     * 
     * @param description
     *        The description of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSnapshotResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the snapshot.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * 
     * @return The ID of the snapshot.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSnapshotResult withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the snapshot owner.
     * </p>
     * 
     * @param ownerId
     *        The AWS account ID of the snapshot owner.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The AWS account ID of the snapshot owner.
     * </p>
     * 
     * @return The AWS account ID of the snapshot owner.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The AWS account ID of the snapshot owner.
     * </p>
     * 
     * @param ownerId
     *        The AWS account ID of the snapshot owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSnapshotResult withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The status of the snapshot.
     * </p>
     * 
     * @param status
     *        The status of the snapshot.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the snapshot.
     * </p>
     * 
     * @return The status of the snapshot.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the snapshot.
     * </p>
     * 
     * @param status
     *        The status of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public StartSnapshotResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the snapshot.
     * </p>
     * 
     * @param status
     *        The status of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public StartSnapshotResult withStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp when the snapshot was created.
     * </p>
     * 
     * @param startTime
     *        The timestamp when the snapshot was created.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The timestamp when the snapshot was created.
     * </p>
     * 
     * @return The timestamp when the snapshot was created.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The timestamp when the snapshot was created.
     * </p>
     * 
     * @param startTime
     *        The timestamp when the snapshot was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSnapshotResult withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The size of the volume, in GiB.
     * </p>
     * 
     * @param volumeSize
     *        The size of the volume, in GiB.
     */

    public void setVolumeSize(Long volumeSize) {
        this.volumeSize = volumeSize;
    }

    /**
     * <p>
     * The size of the volume, in GiB.
     * </p>
     * 
     * @return The size of the volume, in GiB.
     */

    public Long getVolumeSize() {
        return this.volumeSize;
    }

    /**
     * <p>
     * The size of the volume, in GiB.
     * </p>
     * 
     * @param volumeSize
     *        The size of the volume, in GiB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSnapshotResult withVolumeSize(Long volumeSize) {
        setVolumeSize(volumeSize);
        return this;
    }

    /**
     * <p>
     * The size of the blocks in the snapshot, in bytes.
     * </p>
     * 
     * @param blockSize
     *        The size of the blocks in the snapshot, in bytes.
     */

    public void setBlockSize(Integer blockSize) {
        this.blockSize = blockSize;
    }

    /**
     * <p>
     * The size of the blocks in the snapshot, in bytes.
     * </p>
     * 
     * @return The size of the blocks in the snapshot, in bytes.
     */

    public Integer getBlockSize() {
        return this.blockSize;
    }

    /**
     * <p>
     * The size of the blocks in the snapshot, in bytes.
     * </p>
     * 
     * @param blockSize
     *        The size of the blocks in the snapshot, in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSnapshotResult withBlockSize(Integer blockSize) {
        setBlockSize(blockSize);
        return this;
    }

    /**
     * <p>
     * The tags applied to the snapshot. You can specify up to 50 tags per snapshot. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"> Tagging your Amazon EC2 resources</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @return The tags applied to the snapshot. You can specify up to 50 tags per snapshot. For more information, see
     *         <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"> Tagging your Amazon EC2
     *         resources</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags applied to the snapshot. You can specify up to 50 tags per snapshot. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"> Tagging your Amazon EC2 resources</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param tags
     *        The tags applied to the snapshot. You can specify up to 50 tags per snapshot. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"> Tagging your Amazon EC2
     *        resources</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags applied to the snapshot. You can specify up to 50 tags per snapshot. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"> Tagging your Amazon EC2 resources</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags applied to the snapshot. You can specify up to 50 tags per snapshot. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"> Tagging your Amazon EC2
     *        resources</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSnapshotResult withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags applied to the snapshot. You can specify up to 50 tags per snapshot. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"> Tagging your Amazon EC2 resources</a>
     * in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * 
     * @param tags
     *        The tags applied to the snapshot. You can specify up to 50 tags per snapshot. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"> Tagging your Amazon EC2
     *        resources</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSnapshotResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The ID of the parent snapshot.
     * </p>
     * 
     * @param parentSnapshotId
     *        The ID of the parent snapshot.
     */

    public void setParentSnapshotId(String parentSnapshotId) {
        this.parentSnapshotId = parentSnapshotId;
    }

    /**
     * <p>
     * The ID of the parent snapshot.
     * </p>
     * 
     * @return The ID of the parent snapshot.
     */

    public String getParentSnapshotId() {
        return this.parentSnapshotId;
    }

    /**
     * <p>
     * The ID of the parent snapshot.
     * </p>
     * 
     * @param parentSnapshotId
     *        The ID of the parent snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSnapshotResult withParentSnapshotId(String parentSnapshotId) {
        setParentSnapshotId(parentSnapshotId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Key Management Service (AWS KMS) customer master key (CMK) used to
     * encrypt the snapshot.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of the AWS Key Management Service (AWS KMS) customer master key (CMK) used
     *        to encrypt the snapshot.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Key Management Service (AWS KMS) customer master key (CMK) used to
     * encrypt the snapshot.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS Key Management Service (AWS KMS) customer master key (CMK) used
     *         to encrypt the snapshot.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Key Management Service (AWS KMS) customer master key (CMK) used to
     * encrypt the snapshot.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of the AWS Key Management Service (AWS KMS) customer master key (CMK) used
     *        to encrypt the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSnapshotResult withKmsKeyArn(String kmsKeyArn) {
        setKmsKeyArn(kmsKeyArn);
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
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getVolumeSize() != null)
            sb.append("VolumeSize: ").append(getVolumeSize()).append(",");
        if (getBlockSize() != null)
            sb.append("BlockSize: ").append(getBlockSize()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getParentSnapshotId() != null)
            sb.append("ParentSnapshotId: ").append(getParentSnapshotId()).append(",");
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartSnapshotResult == false)
            return false;
        StartSnapshotResult other = (StartSnapshotResult) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getVolumeSize() == null ^ this.getVolumeSize() == null)
            return false;
        if (other.getVolumeSize() != null && other.getVolumeSize().equals(this.getVolumeSize()) == false)
            return false;
        if (other.getBlockSize() == null ^ this.getBlockSize() == null)
            return false;
        if (other.getBlockSize() != null && other.getBlockSize().equals(this.getBlockSize()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getParentSnapshotId() == null ^ this.getParentSnapshotId() == null)
            return false;
        if (other.getParentSnapshotId() != null && other.getParentSnapshotId().equals(this.getParentSnapshotId()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getVolumeSize() == null) ? 0 : getVolumeSize().hashCode());
        hashCode = prime * hashCode + ((getBlockSize() == null) ? 0 : getBlockSize().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getParentSnapshotId() == null) ? 0 : getParentSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public StartSnapshotResult clone() {
        try {
            return (StartSnapshotResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
