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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DeleteRegistrationAttachment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteRegistrationAttachmentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the registration attachment.
     * </p>
     */
    private String registrationAttachmentArn;
    /**
     * <p>
     * The unique identifier for the registration attachment.
     * </p>
     */
    private String registrationAttachmentId;
    /**
     * <p>
     * The status of the registration attachment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>UPLOAD_IN_PROGRESS</code> The attachment is being uploaded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPLOAD_COMPLETE</code> The attachment has been uploaded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPLOAD_FAILED</code> The attachment failed to uploaded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> The attachment has been deleted..
     * </p>
     * </li>
     * </ul>
     */
    private String attachmentStatus;
    /**
     * <p>
     * The error message if the upload failed.
     * </p>
     */
    private String attachmentUploadErrorReason;
    /**
     * <p>
     * The time when the registration attachment was created, in <a href="https://www.epochconverter.com/">UNIX epoch
     * time</a> format.
     * </p>
     */
    private java.util.Date createdTimestamp;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the registration attachment.
     * </p>
     * 
     * @param registrationAttachmentArn
     *        The Amazon Resource Name (ARN) for the registration attachment.
     */

    public void setRegistrationAttachmentArn(String registrationAttachmentArn) {
        this.registrationAttachmentArn = registrationAttachmentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the registration attachment.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the registration attachment.
     */

    public String getRegistrationAttachmentArn() {
        return this.registrationAttachmentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the registration attachment.
     * </p>
     * 
     * @param registrationAttachmentArn
     *        The Amazon Resource Name (ARN) for the registration attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRegistrationAttachmentResult withRegistrationAttachmentArn(String registrationAttachmentArn) {
        setRegistrationAttachmentArn(registrationAttachmentArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the registration attachment.
     * </p>
     * 
     * @param registrationAttachmentId
     *        The unique identifier for the registration attachment.
     */

    public void setRegistrationAttachmentId(String registrationAttachmentId) {
        this.registrationAttachmentId = registrationAttachmentId;
    }

    /**
     * <p>
     * The unique identifier for the registration attachment.
     * </p>
     * 
     * @return The unique identifier for the registration attachment.
     */

    public String getRegistrationAttachmentId() {
        return this.registrationAttachmentId;
    }

    /**
     * <p>
     * The unique identifier for the registration attachment.
     * </p>
     * 
     * @param registrationAttachmentId
     *        The unique identifier for the registration attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRegistrationAttachmentResult withRegistrationAttachmentId(String registrationAttachmentId) {
        setRegistrationAttachmentId(registrationAttachmentId);
        return this;
    }

    /**
     * <p>
     * The status of the registration attachment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>UPLOAD_IN_PROGRESS</code> The attachment is being uploaded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPLOAD_COMPLETE</code> The attachment has been uploaded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPLOAD_FAILED</code> The attachment failed to uploaded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> The attachment has been deleted..
     * </p>
     * </li>
     * </ul>
     * 
     * @param attachmentStatus
     *        The status of the registration attachment. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>UPLOAD_IN_PROGRESS</code> The attachment is being uploaded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPLOAD_COMPLETE</code> The attachment has been uploaded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPLOAD_FAILED</code> The attachment failed to uploaded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETED</code> The attachment has been deleted..
     *        </p>
     *        </li>
     * @see AttachmentStatus
     */

    public void setAttachmentStatus(String attachmentStatus) {
        this.attachmentStatus = attachmentStatus;
    }

    /**
     * <p>
     * The status of the registration attachment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>UPLOAD_IN_PROGRESS</code> The attachment is being uploaded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPLOAD_COMPLETE</code> The attachment has been uploaded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPLOAD_FAILED</code> The attachment failed to uploaded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> The attachment has been deleted..
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the registration attachment. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>UPLOAD_IN_PROGRESS</code> The attachment is being uploaded.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPLOAD_COMPLETE</code> The attachment has been uploaded.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPLOAD_FAILED</code> The attachment failed to uploaded.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETED</code> The attachment has been deleted..
     *         </p>
     *         </li>
     * @see AttachmentStatus
     */

    public String getAttachmentStatus() {
        return this.attachmentStatus;
    }

    /**
     * <p>
     * The status of the registration attachment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>UPLOAD_IN_PROGRESS</code> The attachment is being uploaded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPLOAD_COMPLETE</code> The attachment has been uploaded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPLOAD_FAILED</code> The attachment failed to uploaded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> The attachment has been deleted..
     * </p>
     * </li>
     * </ul>
     * 
     * @param attachmentStatus
     *        The status of the registration attachment. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>UPLOAD_IN_PROGRESS</code> The attachment is being uploaded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPLOAD_COMPLETE</code> The attachment has been uploaded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPLOAD_FAILED</code> The attachment failed to uploaded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETED</code> The attachment has been deleted..
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttachmentStatus
     */

    public DeleteRegistrationAttachmentResult withAttachmentStatus(String attachmentStatus) {
        setAttachmentStatus(attachmentStatus);
        return this;
    }

    /**
     * <p>
     * The status of the registration attachment.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>UPLOAD_IN_PROGRESS</code> The attachment is being uploaded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPLOAD_COMPLETE</code> The attachment has been uploaded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPLOAD_FAILED</code> The attachment failed to uploaded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> The attachment has been deleted..
     * </p>
     * </li>
     * </ul>
     * 
     * @param attachmentStatus
     *        The status of the registration attachment. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>UPLOAD_IN_PROGRESS</code> The attachment is being uploaded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPLOAD_COMPLETE</code> The attachment has been uploaded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPLOAD_FAILED</code> The attachment failed to uploaded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETED</code> The attachment has been deleted..
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttachmentStatus
     */

    public DeleteRegistrationAttachmentResult withAttachmentStatus(AttachmentStatus attachmentStatus) {
        this.attachmentStatus = attachmentStatus.toString();
        return this;
    }

    /**
     * <p>
     * The error message if the upload failed.
     * </p>
     * 
     * @param attachmentUploadErrorReason
     *        The error message if the upload failed.
     * @see AttachmentUploadErrorReason
     */

    public void setAttachmentUploadErrorReason(String attachmentUploadErrorReason) {
        this.attachmentUploadErrorReason = attachmentUploadErrorReason;
    }

    /**
     * <p>
     * The error message if the upload failed.
     * </p>
     * 
     * @return The error message if the upload failed.
     * @see AttachmentUploadErrorReason
     */

    public String getAttachmentUploadErrorReason() {
        return this.attachmentUploadErrorReason;
    }

    /**
     * <p>
     * The error message if the upload failed.
     * </p>
     * 
     * @param attachmentUploadErrorReason
     *        The error message if the upload failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttachmentUploadErrorReason
     */

    public DeleteRegistrationAttachmentResult withAttachmentUploadErrorReason(String attachmentUploadErrorReason) {
        setAttachmentUploadErrorReason(attachmentUploadErrorReason);
        return this;
    }

    /**
     * <p>
     * The error message if the upload failed.
     * </p>
     * 
     * @param attachmentUploadErrorReason
     *        The error message if the upload failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttachmentUploadErrorReason
     */

    public DeleteRegistrationAttachmentResult withAttachmentUploadErrorReason(AttachmentUploadErrorReason attachmentUploadErrorReason) {
        this.attachmentUploadErrorReason = attachmentUploadErrorReason.toString();
        return this;
    }

    /**
     * <p>
     * The time when the registration attachment was created, in <a href="https://www.epochconverter.com/">UNIX epoch
     * time</a> format.
     * </p>
     * 
     * @param createdTimestamp
     *        The time when the registration attachment was created, in <a href="https://www.epochconverter.com/">UNIX
     *        epoch time</a> format.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The time when the registration attachment was created, in <a href="https://www.epochconverter.com/">UNIX epoch
     * time</a> format.
     * </p>
     * 
     * @return The time when the registration attachment was created, in <a href="https://www.epochconverter.com/">UNIX
     *         epoch time</a> format.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The time when the registration attachment was created, in <a href="https://www.epochconverter.com/">UNIX epoch
     * time</a> format.
     * </p>
     * 
     * @param createdTimestamp
     *        The time when the registration attachment was created, in <a href="https://www.epochconverter.com/">UNIX
     *        epoch time</a> format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRegistrationAttachmentResult withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
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
        if (getRegistrationAttachmentArn() != null)
            sb.append("RegistrationAttachmentArn: ").append(getRegistrationAttachmentArn()).append(",");
        if (getRegistrationAttachmentId() != null)
            sb.append("RegistrationAttachmentId: ").append(getRegistrationAttachmentId()).append(",");
        if (getAttachmentStatus() != null)
            sb.append("AttachmentStatus: ").append(getAttachmentStatus()).append(",");
        if (getAttachmentUploadErrorReason() != null)
            sb.append("AttachmentUploadErrorReason: ").append(getAttachmentUploadErrorReason()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteRegistrationAttachmentResult == false)
            return false;
        DeleteRegistrationAttachmentResult other = (DeleteRegistrationAttachmentResult) obj;
        if (other.getRegistrationAttachmentArn() == null ^ this.getRegistrationAttachmentArn() == null)
            return false;
        if (other.getRegistrationAttachmentArn() != null && other.getRegistrationAttachmentArn().equals(this.getRegistrationAttachmentArn()) == false)
            return false;
        if (other.getRegistrationAttachmentId() == null ^ this.getRegistrationAttachmentId() == null)
            return false;
        if (other.getRegistrationAttachmentId() != null && other.getRegistrationAttachmentId().equals(this.getRegistrationAttachmentId()) == false)
            return false;
        if (other.getAttachmentStatus() == null ^ this.getAttachmentStatus() == null)
            return false;
        if (other.getAttachmentStatus() != null && other.getAttachmentStatus().equals(this.getAttachmentStatus()) == false)
            return false;
        if (other.getAttachmentUploadErrorReason() == null ^ this.getAttachmentUploadErrorReason() == null)
            return false;
        if (other.getAttachmentUploadErrorReason() != null && other.getAttachmentUploadErrorReason().equals(this.getAttachmentUploadErrorReason()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistrationAttachmentArn() == null) ? 0 : getRegistrationAttachmentArn().hashCode());
        hashCode = prime * hashCode + ((getRegistrationAttachmentId() == null) ? 0 : getRegistrationAttachmentId().hashCode());
        hashCode = prime * hashCode + ((getAttachmentStatus() == null) ? 0 : getAttachmentStatus().hashCode());
        hashCode = prime * hashCode + ((getAttachmentUploadErrorReason() == null) ? 0 : getAttachmentUploadErrorReason().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public DeleteRegistrationAttachmentResult clone() {
        try {
            return (DeleteRegistrationAttachmentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
