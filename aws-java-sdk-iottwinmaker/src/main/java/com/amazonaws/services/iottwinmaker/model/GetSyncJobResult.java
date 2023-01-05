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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetSyncJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSyncJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The sync job ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The ID of the workspace that contains the sync job.
     * </p>
     */
    private String workspaceId;
    /**
     * <p>
     * The sync soucre.
     * </p>
     * <note>
     * <p>
     * Currently the only supported syncSoucre is <code>SITEWISE </code>.
     * </p>
     * </note>
     */
    private String syncSource;
    /**
     * <p>
     * The sync IAM role.
     * </p>
     */
    private String syncRole;
    /**
     * <p>
     * The SyncJob response status.
     * </p>
     */
    private SyncJobStatus status;
    /**
     * <p>
     * The creation date and time.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The update date and time.
     * </p>
     */
    private java.util.Date updateDateTime;

    /**
     * <p>
     * The sync job ARN.
     * </p>
     * 
     * @param arn
     *        The sync job ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The sync job ARN.
     * </p>
     * 
     * @return The sync job ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The sync job ARN.
     * </p>
     * 
     * @param arn
     *        The sync job ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSyncJobResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The ID of the workspace that contains the sync job.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace that contains the sync job.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace that contains the sync job.
     * </p>
     * 
     * @return The ID of the workspace that contains the sync job.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace that contains the sync job.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace that contains the sync job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSyncJobResult withWorkspaceId(String workspaceId) {
        setWorkspaceId(workspaceId);
        return this;
    }

    /**
     * <p>
     * The sync soucre.
     * </p>
     * <note>
     * <p>
     * Currently the only supported syncSoucre is <code>SITEWISE </code>.
     * </p>
     * </note>
     * 
     * @param syncSource
     *        The sync soucre.</p> <note>
     *        <p>
     *        Currently the only supported syncSoucre is <code>SITEWISE </code>.
     *        </p>
     */

    public void setSyncSource(String syncSource) {
        this.syncSource = syncSource;
    }

    /**
     * <p>
     * The sync soucre.
     * </p>
     * <note>
     * <p>
     * Currently the only supported syncSoucre is <code>SITEWISE </code>.
     * </p>
     * </note>
     * 
     * @return The sync soucre.</p> <note>
     *         <p>
     *         Currently the only supported syncSoucre is <code>SITEWISE </code>.
     *         </p>
     */

    public String getSyncSource() {
        return this.syncSource;
    }

    /**
     * <p>
     * The sync soucre.
     * </p>
     * <note>
     * <p>
     * Currently the only supported syncSoucre is <code>SITEWISE </code>.
     * </p>
     * </note>
     * 
     * @param syncSource
     *        The sync soucre.</p> <note>
     *        <p>
     *        Currently the only supported syncSoucre is <code>SITEWISE </code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSyncJobResult withSyncSource(String syncSource) {
        setSyncSource(syncSource);
        return this;
    }

    /**
     * <p>
     * The sync IAM role.
     * </p>
     * 
     * @param syncRole
     *        The sync IAM role.
     */

    public void setSyncRole(String syncRole) {
        this.syncRole = syncRole;
    }

    /**
     * <p>
     * The sync IAM role.
     * </p>
     * 
     * @return The sync IAM role.
     */

    public String getSyncRole() {
        return this.syncRole;
    }

    /**
     * <p>
     * The sync IAM role.
     * </p>
     * 
     * @param syncRole
     *        The sync IAM role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSyncJobResult withSyncRole(String syncRole) {
        setSyncRole(syncRole);
        return this;
    }

    /**
     * <p>
     * The SyncJob response status.
     * </p>
     * 
     * @param status
     *        The SyncJob response status.
     */

    public void setStatus(SyncJobStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The SyncJob response status.
     * </p>
     * 
     * @return The SyncJob response status.
     */

    public SyncJobStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The SyncJob response status.
     * </p>
     * 
     * @param status
     *        The SyncJob response status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSyncJobResult withStatus(SyncJobStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The creation date and time.
     * </p>
     * 
     * @param creationDateTime
     *        The creation date and time.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The creation date and time.
     * </p>
     * 
     * @return The creation date and time.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The creation date and time.
     * </p>
     * 
     * @param creationDateTime
     *        The creation date and time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSyncJobResult withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The update date and time.
     * </p>
     * 
     * @param updateDateTime
     *        The update date and time.
     */

    public void setUpdateDateTime(java.util.Date updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    /**
     * <p>
     * The update date and time.
     * </p>
     * 
     * @return The update date and time.
     */

    public java.util.Date getUpdateDateTime() {
        return this.updateDateTime;
    }

    /**
     * <p>
     * The update date and time.
     * </p>
     * 
     * @param updateDateTime
     *        The update date and time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSyncJobResult withUpdateDateTime(java.util.Date updateDateTime) {
        setUpdateDateTime(updateDateTime);
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
        if (getWorkspaceId() != null)
            sb.append("WorkspaceId: ").append(getWorkspaceId()).append(",");
        if (getSyncSource() != null)
            sb.append("SyncSource: ").append(getSyncSource()).append(",");
        if (getSyncRole() != null)
            sb.append("SyncRole: ").append(getSyncRole()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getUpdateDateTime() != null)
            sb.append("UpdateDateTime: ").append(getUpdateDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSyncJobResult == false)
            return false;
        GetSyncJobResult other = (GetSyncJobResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getWorkspaceId() == null ^ this.getWorkspaceId() == null)
            return false;
        if (other.getWorkspaceId() != null && other.getWorkspaceId().equals(this.getWorkspaceId()) == false)
            return false;
        if (other.getSyncSource() == null ^ this.getSyncSource() == null)
            return false;
        if (other.getSyncSource() != null && other.getSyncSource().equals(this.getSyncSource()) == false)
            return false;
        if (other.getSyncRole() == null ^ this.getSyncRole() == null)
            return false;
        if (other.getSyncRole() != null && other.getSyncRole().equals(this.getSyncRole()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getUpdateDateTime() == null ^ this.getUpdateDateTime() == null)
            return false;
        if (other.getUpdateDateTime() != null && other.getUpdateDateTime().equals(this.getUpdateDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        hashCode = prime * hashCode + ((getSyncSource() == null) ? 0 : getSyncSource().hashCode());
        hashCode = prime * hashCode + ((getSyncRole() == null) ? 0 : getSyncRole().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateDateTime() == null) ? 0 : getUpdateDateTime().hashCode());
        return hashCode;
    }

    @Override
    public GetSyncJobResult clone() {
        try {
            return (GetSyncJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
