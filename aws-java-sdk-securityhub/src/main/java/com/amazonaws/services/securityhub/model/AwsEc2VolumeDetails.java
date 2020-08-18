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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about an EC2 volume.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2VolumeDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2VolumeDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates when the volume was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     */
    private String createTime;
    /**
     * <p>
     * Whether the volume is encrypted.
     * </p>
     */
    private Boolean encrypted;
    /**
     * <p>
     * The size of the volume, in GiBs.
     * </p>
     */
    private Integer size;
    /**
     * <p>
     * The snapshot from which the volume was created.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * The volume state.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to protect the volume
     * encryption key for the volume.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The volume attachments.
     * </p>
     */
    private java.util.List<AwsEc2VolumeAttachment> attachments;

    /**
     * <p>
     * Indicates when the volume was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param createTime
     *        Indicates when the volume was created.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * Indicates when the volume was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return Indicates when the volume was created.</p>
     *         <p>
     *         Uses the <code>date-time</code> format specified in <a
     *         href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *         Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * Indicates when the volume was created.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param createTime
     *        Indicates when the volume was created.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VolumeDetails withCreateTime(String createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * Whether the volume is encrypted.
     * </p>
     * 
     * @param encrypted
     *        Whether the volume is encrypted.
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Whether the volume is encrypted.
     * </p>
     * 
     * @return Whether the volume is encrypted.
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * Whether the volume is encrypted.
     * </p>
     * 
     * @param encrypted
     *        Whether the volume is encrypted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VolumeDetails withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * Whether the volume is encrypted.
     * </p>
     * 
     * @return Whether the volume is encrypted.
     */

    public Boolean isEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * The size of the volume, in GiBs.
     * </p>
     * 
     * @param size
     *        The size of the volume, in GiBs.
     */

    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * <p>
     * The size of the volume, in GiBs.
     * </p>
     * 
     * @return The size of the volume, in GiBs.
     */

    public Integer getSize() {
        return this.size;
    }

    /**
     * <p>
     * The size of the volume, in GiBs.
     * </p>
     * 
     * @param size
     *        The size of the volume, in GiBs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VolumeDetails withSize(Integer size) {
        setSize(size);
        return this;
    }

    /**
     * <p>
     * The snapshot from which the volume was created.
     * </p>
     * 
     * @param snapshotId
     *        The snapshot from which the volume was created.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The snapshot from which the volume was created.
     * </p>
     * 
     * @return The snapshot from which the volume was created.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The snapshot from which the volume was created.
     * </p>
     * 
     * @param snapshotId
     *        The snapshot from which the volume was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VolumeDetails withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * The volume state.
     * </p>
     * 
     * @param status
     *        The volume state.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The volume state.
     * </p>
     * 
     * @return The volume state.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The volume state.
     * </p>
     * 
     * @param status
     *        The volume state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VolumeDetails withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to protect the volume
     * encryption key for the volume.
     * </p>
     * 
     * @param kmsKeyId
     *        The ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to protect the
     *        volume encryption key for the volume.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to protect the volume
     * encryption key for the volume.
     * </p>
     * 
     * @return The ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to protect
     *         the volume encryption key for the volume.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to protect the volume
     * encryption key for the volume.
     * </p>
     * 
     * @param kmsKeyId
     *        The ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to protect the
     *        volume encryption key for the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VolumeDetails withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The volume attachments.
     * </p>
     * 
     * @return The volume attachments.
     */

    public java.util.List<AwsEc2VolumeAttachment> getAttachments() {
        return attachments;
    }

    /**
     * <p>
     * The volume attachments.
     * </p>
     * 
     * @param attachments
     *        The volume attachments.
     */

    public void setAttachments(java.util.Collection<AwsEc2VolumeAttachment> attachments) {
        if (attachments == null) {
            this.attachments = null;
            return;
        }

        this.attachments = new java.util.ArrayList<AwsEc2VolumeAttachment>(attachments);
    }

    /**
     * <p>
     * The volume attachments.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttachments(java.util.Collection)} or {@link #withAttachments(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attachments
     *        The volume attachments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VolumeDetails withAttachments(AwsEc2VolumeAttachment... attachments) {
        if (this.attachments == null) {
            setAttachments(new java.util.ArrayList<AwsEc2VolumeAttachment>(attachments.length));
        }
        for (AwsEc2VolumeAttachment ele : attachments) {
            this.attachments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The volume attachments.
     * </p>
     * 
     * @param attachments
     *        The volume attachments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2VolumeDetails withAttachments(java.util.Collection<AwsEc2VolumeAttachment> attachments) {
        setAttachments(attachments);
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
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getEncrypted() != null)
            sb.append("Encrypted: ").append(getEncrypted()).append(",");
        if (getSize() != null)
            sb.append("Size: ").append(getSize()).append(",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getAttachments() != null)
            sb.append("Attachments: ").append(getAttachments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2VolumeDetails == false)
            return false;
        AwsEc2VolumeDetails other = (AwsEc2VolumeDetails) obj;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getAttachments() == null ^ this.getAttachments() == null)
            return false;
        if (other.getAttachments() != null && other.getAttachments().equals(this.getAttachments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getAttachments() == null) ? 0 : getAttachments().hashCode());
        return hashCode;
    }

    @Override
    public AwsEc2VolumeDetails clone() {
        try {
            return (AwsEc2VolumeDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2VolumeDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
