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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a summary of the properties of a workspace.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/WorkspaceSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkspaceSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Alias of this workspace.
     * </p>
     */
    private String alias;
    /**
     * <p>
     * The AmazonResourceName of this workspace.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The time when the workspace was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The status of this workspace.
     * </p>
     */
    private WorkspaceStatus status;
    /**
     * <p>
     * Unique string identifying this workspace.
     * </p>
     */
    private String workspaceId;

    /**
     * <p>
     * Alias of this workspace.
     * </p>
     * 
     * @param alias
     *        Alias of this workspace.
     */

    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * <p>
     * Alias of this workspace.
     * </p>
     * 
     * @return Alias of this workspace.
     */

    public String getAlias() {
        return this.alias;
    }

    /**
     * <p>
     * Alias of this workspace.
     * </p>
     * 
     * @param alias
     *        Alias of this workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceSummary withAlias(String alias) {
        setAlias(alias);
        return this;
    }

    /**
     * <p>
     * The AmazonResourceName of this workspace.
     * </p>
     * 
     * @param arn
     *        The AmazonResourceName of this workspace.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The AmazonResourceName of this workspace.
     * </p>
     * 
     * @return The AmazonResourceName of this workspace.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The AmazonResourceName of this workspace.
     * </p>
     * 
     * @param arn
     *        The AmazonResourceName of this workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The time when the workspace was created.
     * </p>
     * 
     * @param createdAt
     *        The time when the workspace was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time when the workspace was created.
     * </p>
     * 
     * @return The time when the workspace was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time when the workspace was created.
     * </p>
     * 
     * @param createdAt
     *        The time when the workspace was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The status of this workspace.
     * </p>
     * 
     * @param status
     *        The status of this workspace.
     */

    public void setStatus(WorkspaceStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of this workspace.
     * </p>
     * 
     * @return The status of this workspace.
     */

    public WorkspaceStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of this workspace.
     * </p>
     * 
     * @param status
     *        The status of this workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceSummary withStatus(WorkspaceStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Unique string identifying this workspace.
     * </p>
     * 
     * @param workspaceId
     *        Unique string identifying this workspace.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * Unique string identifying this workspace.
     * </p>
     * 
     * @return Unique string identifying this workspace.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * Unique string identifying this workspace.
     * </p>
     * 
     * @param workspaceId
     *        Unique string identifying this workspace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkspaceSummary withWorkspaceId(String workspaceId) {
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
        if (getAlias() != null)
            sb.append("Alias: ").append(getAlias()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
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

        if (obj instanceof WorkspaceSummary == false)
            return false;
        WorkspaceSummary other = (WorkspaceSummary) obj;
        if (other.getAlias() == null ^ this.getAlias() == null)
            return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
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

        hashCode = prime * hashCode + ((getAlias() == null) ? 0 : getAlias().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        return hashCode;
    }

    @Override
    public WorkspaceSummary clone() {
        try {
            return (WorkspaceSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.prometheus.model.transform.WorkspaceSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
