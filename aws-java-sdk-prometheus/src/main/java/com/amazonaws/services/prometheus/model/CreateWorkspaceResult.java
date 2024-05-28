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
package com.amazonaws.services.prometheus.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of a <code>CreateWorkspace</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/CreateWorkspace" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWorkspaceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN for the new workspace.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * (optional) If the workspace was created with a customer managed KMS key, the ARN for the key used.
     * </p>
     */
    private String kmsKeyArn;
    /**
     * <p>
     * The current status of the new workspace. Immediately after you create the workspace, the status is usually
     * <code>CREATING</code>.
     * </p>
     */
    private WorkspaceStatus status;
    /**
     * <p>
     * The list of tag keys and values that are associated with the workspace.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The unique ID for the new workspace.
     * </p>
     */
    private String workspaceId;

    /**
     * <p>
     * The ARN for the new workspace.
     * </p>
     * 
     * @param arn
     *        The ARN for the new workspace.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN for the new workspace.
     * </p>
     * 
     * @return The ARN for the new workspace.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN for the new workspace.
     * </p>
     * 
     * @param arn
     *        The ARN for the new workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * (optional) If the workspace was created with a customer managed KMS key, the ARN for the key used.
     * </p>
     * 
     * @param kmsKeyArn
     *        (optional) If the workspace was created with a customer managed KMS key, the ARN for the key used.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * (optional) If the workspace was created with a customer managed KMS key, the ARN for the key used.
     * </p>
     * 
     * @return (optional) If the workspace was created with a customer managed KMS key, the ARN for the key used.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * (optional) If the workspace was created with a customer managed KMS key, the ARN for the key used.
     * </p>
     * 
     * @param kmsKeyArn
     *        (optional) If the workspace was created with a customer managed KMS key, the ARN for the key used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceResult withKmsKeyArn(String kmsKeyArn) {
        setKmsKeyArn(kmsKeyArn);
        return this;
    }

    /**
     * <p>
     * The current status of the new workspace. Immediately after you create the workspace, the status is usually
     * <code>CREATING</code>.
     * </p>
     * 
     * @param status
     *        The current status of the new workspace. Immediately after you create the workspace, the status is usually
     *        <code>CREATING</code>.
     */

    public void setStatus(WorkspaceStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the new workspace. Immediately after you create the workspace, the status is usually
     * <code>CREATING</code>.
     * </p>
     * 
     * @return The current status of the new workspace. Immediately after you create the workspace, the status is
     *         usually <code>CREATING</code>.
     */

    public WorkspaceStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the new workspace. Immediately after you create the workspace, the status is usually
     * <code>CREATING</code>.
     * </p>
     * 
     * @param status
     *        The current status of the new workspace. Immediately after you create the workspace, the status is usually
     *        <code>CREATING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceResult withStatus(WorkspaceStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The list of tag keys and values that are associated with the workspace.
     * </p>
     * 
     * @return The list of tag keys and values that are associated with the workspace.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of tag keys and values that are associated with the workspace.
     * </p>
     * 
     * @param tags
     *        The list of tag keys and values that are associated with the workspace.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The list of tag keys and values that are associated with the workspace.
     * </p>
     * 
     * @param tags
     *        The list of tag keys and values that are associated with the workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateWorkspaceResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceResult addTagsEntry(String key, String value) {
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

    public CreateWorkspaceResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The unique ID for the new workspace.
     * </p>
     * 
     * @param workspaceId
     *        The unique ID for the new workspace.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The unique ID for the new workspace.
     * </p>
     * 
     * @return The unique ID for the new workspace.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The unique ID for the new workspace.
     * </p>
     * 
     * @param workspaceId
     *        The unique ID for the new workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceResult withWorkspaceId(String workspaceId) {
        setWorkspaceId(workspaceId);
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
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: ").append(getKmsKeyArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getWorkspaceId() != null)
            sb.append("WorkspaceId: ").append(getWorkspaceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWorkspaceResult == false)
            return false;
        CreateWorkspaceResult other = (CreateWorkspaceResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getWorkspaceId() == null ^ this.getWorkspaceId() == null)
            return false;
        if (other.getWorkspaceId() != null && other.getWorkspaceId().equals(this.getWorkspaceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        return hashCode;
    }

    @Override
    public CreateWorkspaceResult clone() {
        try {
            return (CreateWorkspaceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
