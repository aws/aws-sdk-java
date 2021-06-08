/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Represents the output of a CreateWorkspace operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/CreateWorkspace" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWorkspaceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the workspace that was just created.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The status of the workspace that was just created (usually CREATING).
     * </p>
     */
    private WorkspaceStatus status;
    /**
     * <p>
     * The generated ID of the workspace that was just created.
     * </p>
     */
    private String workspaceId;

    /**
     * <p>
     * The ARN of the workspace that was just created.
     * </p>
     * 
     * @param arn
     *        The ARN of the workspace that was just created.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the workspace that was just created.
     * </p>
     * 
     * @return The ARN of the workspace that was just created.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the workspace that was just created.
     * </p>
     * 
     * @param arn
     *        The ARN of the workspace that was just created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The status of the workspace that was just created (usually CREATING).
     * </p>
     * 
     * @param status
     *        The status of the workspace that was just created (usually CREATING).
     */

    public void setStatus(WorkspaceStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the workspace that was just created (usually CREATING).
     * </p>
     * 
     * @return The status of the workspace that was just created (usually CREATING).
     */

    public WorkspaceStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the workspace that was just created (usually CREATING).
     * </p>
     * 
     * @param status
     *        The status of the workspace that was just created (usually CREATING).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWorkspaceResult withStatus(WorkspaceStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The generated ID of the workspace that was just created.
     * </p>
     * 
     * @param workspaceId
     *        The generated ID of the workspace that was just created.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The generated ID of the workspace that was just created.
     * </p>
     * 
     * @return The generated ID of the workspace that was just created.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The generated ID of the workspace that was just created.
     * </p>
     * 
     * @param workspaceId
     *        The generated ID of the workspace that was just created.
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
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
