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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/GetWorkspace" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWorkspaceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the workspace.
     * </p>
     */
    private String workspaceId;
    /**
     * <p>
     * The ARN of the workspace.
     * </p>
     */
    private String arn;
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
     * The date and time when the workspace was created.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The date and time when the workspace was last updated.
     * </p>
     */
    private java.util.Date updateDateTime;

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

    public GetWorkspaceResult withWorkspaceId(String workspaceId) {
        setWorkspaceId(workspaceId);
        return this;
    }

    /**
     * <p>
     * The ARN of the workspace.
     * </p>
     * 
     * @param arn
     *        The ARN of the workspace.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the workspace.
     * </p>
     * 
     * @return The ARN of the workspace.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the workspace.
     * </p>
     * 
     * @param arn
     *        The ARN of the workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkspaceResult withArn(String arn) {
        setArn(arn);
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

    public GetWorkspaceResult withDescription(String description) {
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

    public GetWorkspaceResult withS3Location(String s3Location) {
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

    public GetWorkspaceResult withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * The date and time when the workspace was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time when the workspace was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date and time when the workspace was created.
     * </p>
     * 
     * @return The date and time when the workspace was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The date and time when the workspace was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time when the workspace was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkspaceResult withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time when the workspace was last updated.
     * </p>
     * 
     * @param updateDateTime
     *        The date and time when the workspace was last updated.
     */

    public void setUpdateDateTime(java.util.Date updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    /**
     * <p>
     * The date and time when the workspace was last updated.
     * </p>
     * 
     * @return The date and time when the workspace was last updated.
     */

    public java.util.Date getUpdateDateTime() {
        return this.updateDateTime;
    }

    /**
     * <p>
     * The date and time when the workspace was last updated.
     * </p>
     * 
     * @param updateDateTime
     *        The date and time when the workspace was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWorkspaceResult withUpdateDateTime(java.util.Date updateDateTime) {
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
        if (getWorkspaceId() != null)
            sb.append("WorkspaceId: ").append(getWorkspaceId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getS3Location() != null)
            sb.append("S3Location: ").append(getS3Location()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
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

        if (obj instanceof GetWorkspaceResult == false)
            return false;
        GetWorkspaceResult other = (GetWorkspaceResult) obj;
        if (other.getWorkspaceId() == null ^ this.getWorkspaceId() == null)
            return false;
        if (other.getWorkspaceId() != null && other.getWorkspaceId().equals(this.getWorkspaceId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
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

        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getS3Location() == null) ? 0 : getS3Location().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateDateTime() == null) ? 0 : getUpdateDateTime().hashCode());
        return hashCode;
    }

    @Override
    public GetWorkspaceResult clone() {
        try {
            return (GetWorkspaceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
