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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/CreateSyncJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSyncJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The workspace Id.
     * </p>
     */
    private String workspaceId;
    /**
     * <p>
     * The sync source.
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
     * The SyncJob IAM role. This IAM role is used by the sync job to read from the syncSource, and create, update or
     * delete the corresponding resources.
     * </p>
     */
    private String syncRole;
    /**
     * <p>
     * The SyncJob tags.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The workspace Id.
     * </p>
     * 
     * @param workspaceId
     *        The workspace Id.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The workspace Id.
     * </p>
     * 
     * @return The workspace Id.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The workspace Id.
     * </p>
     * 
     * @param workspaceId
     *        The workspace Id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSyncJobRequest withWorkspaceId(String workspaceId) {
        setWorkspaceId(workspaceId);
        return this;
    }

    /**
     * <p>
     * The sync source.
     * </p>
     * <note>
     * <p>
     * Currently the only supported syncSoucre is <code>SITEWISE </code>.
     * </p>
     * </note>
     * 
     * @param syncSource
     *        The sync source.</p> <note>
     *        <p>
     *        Currently the only supported syncSoucre is <code>SITEWISE </code>.
     *        </p>
     */

    public void setSyncSource(String syncSource) {
        this.syncSource = syncSource;
    }

    /**
     * <p>
     * The sync source.
     * </p>
     * <note>
     * <p>
     * Currently the only supported syncSoucre is <code>SITEWISE </code>.
     * </p>
     * </note>
     * 
     * @return The sync source.</p> <note>
     *         <p>
     *         Currently the only supported syncSoucre is <code>SITEWISE </code>.
     *         </p>
     */

    public String getSyncSource() {
        return this.syncSource;
    }

    /**
     * <p>
     * The sync source.
     * </p>
     * <note>
     * <p>
     * Currently the only supported syncSoucre is <code>SITEWISE </code>.
     * </p>
     * </note>
     * 
     * @param syncSource
     *        The sync source.</p> <note>
     *        <p>
     *        Currently the only supported syncSoucre is <code>SITEWISE </code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSyncJobRequest withSyncSource(String syncSource) {
        setSyncSource(syncSource);
        return this;
    }

    /**
     * <p>
     * The SyncJob IAM role. This IAM role is used by the sync job to read from the syncSource, and create, update or
     * delete the corresponding resources.
     * </p>
     * 
     * @param syncRole
     *        The SyncJob IAM role. This IAM role is used by the sync job to read from the syncSource, and create,
     *        update or delete the corresponding resources.
     */

    public void setSyncRole(String syncRole) {
        this.syncRole = syncRole;
    }

    /**
     * <p>
     * The SyncJob IAM role. This IAM role is used by the sync job to read from the syncSource, and create, update or
     * delete the corresponding resources.
     * </p>
     * 
     * @return The SyncJob IAM role. This IAM role is used by the sync job to read from the syncSource, and create,
     *         update or delete the corresponding resources.
     */

    public String getSyncRole() {
        return this.syncRole;
    }

    /**
     * <p>
     * The SyncJob IAM role. This IAM role is used by the sync job to read from the syncSource, and create, update or
     * delete the corresponding resources.
     * </p>
     * 
     * @param syncRole
     *        The SyncJob IAM role. This IAM role is used by the sync job to read from the syncSource, and create,
     *        update or delete the corresponding resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSyncJobRequest withSyncRole(String syncRole) {
        setSyncRole(syncRole);
        return this;
    }

    /**
     * <p>
     * The SyncJob tags.
     * </p>
     * 
     * @return The SyncJob tags.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The SyncJob tags.
     * </p>
     * 
     * @param tags
     *        The SyncJob tags.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The SyncJob tags.
     * </p>
     * 
     * @param tags
     *        The SyncJob tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSyncJobRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateSyncJobRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateSyncJobRequest addTagsEntry(String key, String value) {
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

    public CreateSyncJobRequest clearTagsEntries() {
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
        if (getWorkspaceId() != null)
            sb.append("WorkspaceId: ").append(getWorkspaceId()).append(",");
        if (getSyncSource() != null)
            sb.append("SyncSource: ").append(getSyncSource()).append(",");
        if (getSyncRole() != null)
            sb.append("SyncRole: ").append(getSyncRole()).append(",");
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

        if (obj instanceof CreateSyncJobRequest == false)
            return false;
        CreateSyncJobRequest other = (CreateSyncJobRequest) obj;
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

        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        hashCode = prime * hashCode + ((getSyncSource() == null) ? 0 : getSyncSource().hashCode());
        hashCode = prime * hashCode + ((getSyncRole() == null) ? 0 : getSyncRole().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateSyncJobRequest clone() {
        return (CreateSyncJobRequest) super.clone();
    }

}
