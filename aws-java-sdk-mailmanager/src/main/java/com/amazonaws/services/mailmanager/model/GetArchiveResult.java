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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The response containing details of the requested archive.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetArchive" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetArchiveResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the archive.
     * </p>
     */
    private String archiveArn;
    /**
     * <p>
     * The unique identifier of the archive.
     * </p>
     */
    private String archiveId;
    /**
     * <p>
     * The unique name assigned to the archive.
     * </p>
     */
    private String archiveName;
    /**
     * <p>
     * The current state of the archive:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> – The archive is ready and available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_DELETION</code> – The archive has been marked for deletion and will be permanently deleted in 30
     * days. No further modifications can be made in this state.
     * </p>
     * </li>
     * </ul>
     */
    private String archiveState;
    /**
     * <p>
     * The timestamp of when the archive was created.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key used to encrypt the archive.
     * </p>
     */
    private String kmsKeyArn;
    /**
     * <p>
     * The timestamp of when the archive was modified.
     * </p>
     */
    private java.util.Date lastUpdatedTimestamp;
    /**
     * <p>
     * The retention period for emails in this archive.
     * </p>
     */
    private ArchiveRetention retention;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the archive.
     * </p>
     * 
     * @param archiveArn
     *        The Amazon Resource Name (ARN) of the archive.
     */

    public void setArchiveArn(String archiveArn) {
        this.archiveArn = archiveArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the archive.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the archive.
     */

    public String getArchiveArn() {
        return this.archiveArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the archive.
     * </p>
     * 
     * @param archiveArn
     *        The Amazon Resource Name (ARN) of the archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetArchiveResult withArchiveArn(String archiveArn) {
        setArchiveArn(archiveArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the archive.
     * </p>
     * 
     * @param archiveId
     *        The unique identifier of the archive.
     */

    public void setArchiveId(String archiveId) {
        this.archiveId = archiveId;
    }

    /**
     * <p>
     * The unique identifier of the archive.
     * </p>
     * 
     * @return The unique identifier of the archive.
     */

    public String getArchiveId() {
        return this.archiveId;
    }

    /**
     * <p>
     * The unique identifier of the archive.
     * </p>
     * 
     * @param archiveId
     *        The unique identifier of the archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetArchiveResult withArchiveId(String archiveId) {
        setArchiveId(archiveId);
        return this;
    }

    /**
     * <p>
     * The unique name assigned to the archive.
     * </p>
     * 
     * @param archiveName
     *        The unique name assigned to the archive.
     */

    public void setArchiveName(String archiveName) {
        this.archiveName = archiveName;
    }

    /**
     * <p>
     * The unique name assigned to the archive.
     * </p>
     * 
     * @return The unique name assigned to the archive.
     */

    public String getArchiveName() {
        return this.archiveName;
    }

    /**
     * <p>
     * The unique name assigned to the archive.
     * </p>
     * 
     * @param archiveName
     *        The unique name assigned to the archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetArchiveResult withArchiveName(String archiveName) {
        setArchiveName(archiveName);
        return this;
    }

    /**
     * <p>
     * The current state of the archive:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> – The archive is ready and available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_DELETION</code> – The archive has been marked for deletion and will be permanently deleted in 30
     * days. No further modifications can be made in this state.
     * </p>
     * </li>
     * </ul>
     * 
     * @param archiveState
     *        The current state of the archive:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> – The archive is ready and available for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING_DELETION</code> – The archive has been marked for deletion and will be permanently deleted
     *        in 30 days. No further modifications can be made in this state.
     *        </p>
     *        </li>
     * @see ArchiveState
     */

    public void setArchiveState(String archiveState) {
        this.archiveState = archiveState;
    }

    /**
     * <p>
     * The current state of the archive:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> – The archive is ready and available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_DELETION</code> – The archive has been marked for deletion and will be permanently deleted in 30
     * days. No further modifications can be made in this state.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current state of the archive:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code> – The archive is ready and available for use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PENDING_DELETION</code> – The archive has been marked for deletion and will be permanently deleted
     *         in 30 days. No further modifications can be made in this state.
     *         </p>
     *         </li>
     * @see ArchiveState
     */

    public String getArchiveState() {
        return this.archiveState;
    }

    /**
     * <p>
     * The current state of the archive:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> – The archive is ready and available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_DELETION</code> – The archive has been marked for deletion and will be permanently deleted in 30
     * days. No further modifications can be made in this state.
     * </p>
     * </li>
     * </ul>
     * 
     * @param archiveState
     *        The current state of the archive:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> – The archive is ready and available for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING_DELETION</code> – The archive has been marked for deletion and will be permanently deleted
     *        in 30 days. No further modifications can be made in this state.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArchiveState
     */

    public GetArchiveResult withArchiveState(String archiveState) {
        setArchiveState(archiveState);
        return this;
    }

    /**
     * <p>
     * The current state of the archive:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> – The archive is ready and available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_DELETION</code> – The archive has been marked for deletion and will be permanently deleted in 30
     * days. No further modifications can be made in this state.
     * </p>
     * </li>
     * </ul>
     * 
     * @param archiveState
     *        The current state of the archive:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> – The archive is ready and available for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING_DELETION</code> – The archive has been marked for deletion and will be permanently deleted
     *        in 30 days. No further modifications can be made in this state.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArchiveState
     */

    public GetArchiveResult withArchiveState(ArchiveState archiveState) {
        this.archiveState = archiveState.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp of when the archive was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The timestamp of when the archive was created.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the archive was created.
     * </p>
     * 
     * @return The timestamp of when the archive was created.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the archive was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The timestamp of when the archive was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetArchiveResult withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key used to encrypt the archive.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of the KMS key used to encrypt the archive.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key used to encrypt the archive.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the KMS key used to encrypt the archive.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key used to encrypt the archive.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of the KMS key used to encrypt the archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetArchiveResult withKmsKeyArn(String kmsKeyArn) {
        setKmsKeyArn(kmsKeyArn);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the archive was modified.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        The timestamp of when the archive was modified.
     */

    public void setLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the archive was modified.
     * </p>
     * 
     * @return The timestamp of when the archive was modified.
     */

    public java.util.Date getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the archive was modified.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        The timestamp of when the archive was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetArchiveResult withLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        setLastUpdatedTimestamp(lastUpdatedTimestamp);
        return this;
    }

    /**
     * <p>
     * The retention period for emails in this archive.
     * </p>
     * 
     * @param retention
     *        The retention period for emails in this archive.
     */

    public void setRetention(ArchiveRetention retention) {
        this.retention = retention;
    }

    /**
     * <p>
     * The retention period for emails in this archive.
     * </p>
     * 
     * @return The retention period for emails in this archive.
     */

    public ArchiveRetention getRetention() {
        return this.retention;
    }

    /**
     * <p>
     * The retention period for emails in this archive.
     * </p>
     * 
     * @param retention
     *        The retention period for emails in this archive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetArchiveResult withRetention(ArchiveRetention retention) {
        setRetention(retention);
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
        if (getArchiveArn() != null)
            sb.append("ArchiveArn: ").append(getArchiveArn()).append(",");
        if (getArchiveId() != null)
            sb.append("ArchiveId: ").append(getArchiveId()).append(",");
        if (getArchiveName() != null)
            sb.append("ArchiveName: ").append(getArchiveName()).append(",");
        if (getArchiveState() != null)
            sb.append("ArchiveState: ").append(getArchiveState()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: ").append(getKmsKeyArn()).append(",");
        if (getLastUpdatedTimestamp() != null)
            sb.append("LastUpdatedTimestamp: ").append(getLastUpdatedTimestamp()).append(",");
        if (getRetention() != null)
            sb.append("Retention: ").append(getRetention());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetArchiveResult == false)
            return false;
        GetArchiveResult other = (GetArchiveResult) obj;
        if (other.getArchiveArn() == null ^ this.getArchiveArn() == null)
            return false;
        if (other.getArchiveArn() != null && other.getArchiveArn().equals(this.getArchiveArn()) == false)
            return false;
        if (other.getArchiveId() == null ^ this.getArchiveId() == null)
            return false;
        if (other.getArchiveId() != null && other.getArchiveId().equals(this.getArchiveId()) == false)
            return false;
        if (other.getArchiveName() == null ^ this.getArchiveName() == null)
            return false;
        if (other.getArchiveName() != null && other.getArchiveName().equals(this.getArchiveName()) == false)
            return false;
        if (other.getArchiveState() == null ^ this.getArchiveState() == null)
            return false;
        if (other.getArchiveState() != null && other.getArchiveState().equals(this.getArchiveState()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        if (other.getLastUpdatedTimestamp() == null ^ this.getLastUpdatedTimestamp() == null)
            return false;
        if (other.getLastUpdatedTimestamp() != null && other.getLastUpdatedTimestamp().equals(this.getLastUpdatedTimestamp()) == false)
            return false;
        if (other.getRetention() == null ^ this.getRetention() == null)
            return false;
        if (other.getRetention() != null && other.getRetention().equals(this.getRetention()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArchiveArn() == null) ? 0 : getArchiveArn().hashCode());
        hashCode = prime * hashCode + ((getArchiveId() == null) ? 0 : getArchiveId().hashCode());
        hashCode = prime * hashCode + ((getArchiveName() == null) ? 0 : getArchiveName().hashCode());
        hashCode = prime * hashCode + ((getArchiveState() == null) ? 0 : getArchiveState().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTimestamp() == null) ? 0 : getLastUpdatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getRetention() == null) ? 0 : getRetention().hashCode());
        return hashCode;
    }

    @Override
    public GetArchiveResult clone() {
        try {
            return (GetArchiveResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
