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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/CreateWorkspace" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWorkspaceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the workspace.
     * </p>
     */
    private String workspaceId;
    /**
     * <p>
     * The description of the workspace.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ARN of the S3 bucket where resources associated with the workspace are stored.
     * </p>
     */
    private String s3Location;
    /**
     * <p>
     * The ARN of the execution role associated with the workspace.
     * </p>
     */
    private String role;
    /**
     * <p>
     * Metadata that you can use to manage the workspace
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ID of the workspace.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace.
     * </p>
     * 
     * @return The ID of the workspace.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceRequest withWorkspaceId(String workspaceId) {
        setWorkspaceId(workspaceId);
        return this;
    }

    /**
     * <p>
     * The description of the workspace.
     * </p>
     * 
     * @param description
     *        The description of the workspace.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the workspace.
     * </p>
     * 
     * @return The description of the workspace.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the workspace.
     * </p>
     * 
     * @param description
     *        The description of the workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ARN of the S3 bucket where resources associated with the workspace are stored.
     * </p>
     * 
     * @param s3Location
     *        The ARN of the S3 bucket where resources associated with the workspace are stored.
     */

    public void setS3Location(String s3Location) {
        this.s3Location = s3Location;
    }

    /**
     * <p>
     * The ARN of the S3 bucket where resources associated with the workspace are stored.
     * </p>
     * 
     * @return The ARN of the S3 bucket where resources associated with the workspace are stored.
     */

    public String getS3Location() {
        return this.s3Location;
    }

    /**
     * <p>
     * The ARN of the S3 bucket where resources associated with the workspace are stored.
     * </p>
     * 
     * @param s3Location
     *        The ARN of the S3 bucket where resources associated with the workspace are stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceRequest withS3Location(String s3Location) {
        setS3Location(s3Location);
        return this;
    }

    /**
     * <p>
     * The ARN of the execution role associated with the workspace.
     * </p>
     * 
     * @param role
     *        The ARN of the execution role associated with the workspace.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The ARN of the execution role associated with the workspace.
     * </p>
     * 
     * @return The ARN of the execution role associated with the workspace.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The ARN of the execution role associated with the workspace.
     * </p>
     * 
     * @param role
     *        The ARN of the execution role associated with the workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceRequest withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * Metadata that you can use to manage the workspace
     * </p>
     * 
     * @return Metadata that you can use to manage the workspace
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata that you can use to manage the workspace
     * </p>
     * 
     * @param tags
     *        Metadata that you can use to manage the workspace
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Metadata that you can use to manage the workspace
     * </p>
     * 
     * @param tags
     *        Metadata that you can use to manage the workspace
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateWorkspaceRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceRequest addTagsEntry(String key, String value) {
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

    public CreateWorkspaceRequest clearTagsEntries() {
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getS3Location() != null)
            sb.append("S3Location: ").append(getS3Location()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
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

        if (obj instanceof CreateWorkspaceRequest == false)
            return false;
        CreateWorkspaceRequest other = (CreateWorkspaceRequest) obj;
        if (other.getWorkspaceId() == null ^ this.getWorkspaceId() == null)
            return false;
        if (other.getWorkspaceId() != null && other.getWorkspaceId().equals(this.getWorkspaceId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getS3Location() == null ^ this.getS3Location() == null)
            return false;
        if (other.getS3Location() != null && other.getS3Location().equals(this.getS3Location()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
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
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getS3Location() == null) ? 0 : getS3Location().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateWorkspaceRequest clone() {
        return (CreateWorkspaceRequest) super.clone();
    }

}
