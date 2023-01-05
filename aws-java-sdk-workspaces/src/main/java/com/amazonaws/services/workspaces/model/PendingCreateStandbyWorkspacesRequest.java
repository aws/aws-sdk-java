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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the Standby WorkSpace.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/PendingCreateStandbyWorkspacesRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PendingCreateStandbyWorkspacesRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes the Standby WorkSpace that was created.
     * </p>
     * <p>
     * Because this operation is asynchronous, the identifier returned is not immediately available for use with other
     * operations. For example, if you call <a
     * href="https://docs.aws.amazon.com/workspaces/latest/api/API_DescribeWorkspaces.html"> DescribeWorkspaces</a>
     * before the WorkSpace is created, the information returned can be incomplete.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The identifier of the directory for the Standby WorkSpace.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The operational state of the Standby WorkSpace.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The identifier of the Standby WorkSpace.
     * </p>
     */
    private String workspaceId;

    /**
     * <p>
     * Describes the Standby WorkSpace that was created.
     * </p>
     * <p>
     * Because this operation is asynchronous, the identifier returned is not immediately available for use with other
     * operations. For example, if you call <a
     * href="https://docs.aws.amazon.com/workspaces/latest/api/API_DescribeWorkspaces.html"> DescribeWorkspaces</a>
     * before the WorkSpace is created, the information returned can be incomplete.
     * </p>
     * 
     * @param userName
     *        Describes the Standby WorkSpace that was created.</p>
     *        <p>
     *        Because this operation is asynchronous, the identifier returned is not immediately available for use with
     *        other operations. For example, if you call <a
     *        href="https://docs.aws.amazon.com/workspaces/latest/api/API_DescribeWorkspaces.html">
     *        DescribeWorkspaces</a> before the WorkSpace is created, the information returned can be incomplete.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * Describes the Standby WorkSpace that was created.
     * </p>
     * <p>
     * Because this operation is asynchronous, the identifier returned is not immediately available for use with other
     * operations. For example, if you call <a
     * href="https://docs.aws.amazon.com/workspaces/latest/api/API_DescribeWorkspaces.html"> DescribeWorkspaces</a>
     * before the WorkSpace is created, the information returned can be incomplete.
     * </p>
     * 
     * @return Describes the Standby WorkSpace that was created.</p>
     *         <p>
     *         Because this operation is asynchronous, the identifier returned is not immediately available for use with
     *         other operations. For example, if you call <a
     *         href="https://docs.aws.amazon.com/workspaces/latest/api/API_DescribeWorkspaces.html">
     *         DescribeWorkspaces</a> before the WorkSpace is created, the information returned can be incomplete.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * Describes the Standby WorkSpace that was created.
     * </p>
     * <p>
     * Because this operation is asynchronous, the identifier returned is not immediately available for use with other
     * operations. For example, if you call <a
     * href="https://docs.aws.amazon.com/workspaces/latest/api/API_DescribeWorkspaces.html"> DescribeWorkspaces</a>
     * before the WorkSpace is created, the information returned can be incomplete.
     * </p>
     * 
     * @param userName
     *        Describes the Standby WorkSpace that was created.</p>
     *        <p>
     *        Because this operation is asynchronous, the identifier returned is not immediately available for use with
     *        other operations. For example, if you call <a
     *        href="https://docs.aws.amazon.com/workspaces/latest/api/API_DescribeWorkspaces.html">
     *        DescribeWorkspaces</a> before the WorkSpace is created, the information returned can be incomplete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingCreateStandbyWorkspacesRequest withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The identifier of the directory for the Standby WorkSpace.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory for the Standby WorkSpace.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The identifier of the directory for the Standby WorkSpace.
     * </p>
     * 
     * @return The identifier of the directory for the Standby WorkSpace.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The identifier of the directory for the Standby WorkSpace.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory for the Standby WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingCreateStandbyWorkspacesRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The operational state of the Standby WorkSpace.
     * </p>
     * 
     * @param state
     *        The operational state of the Standby WorkSpace.
     * @see WorkspaceState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The operational state of the Standby WorkSpace.
     * </p>
     * 
     * @return The operational state of the Standby WorkSpace.
     * @see WorkspaceState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The operational state of the Standby WorkSpace.
     * </p>
     * 
     * @param state
     *        The operational state of the Standby WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkspaceState
     */

    public PendingCreateStandbyWorkspacesRequest withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The operational state of the Standby WorkSpace.
     * </p>
     * 
     * @param state
     *        The operational state of the Standby WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkspaceState
     */

    public PendingCreateStandbyWorkspacesRequest withState(WorkspaceState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the Standby WorkSpace.
     * </p>
     * 
     * @param workspaceId
     *        The identifier of the Standby WorkSpace.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The identifier of the Standby WorkSpace.
     * </p>
     * 
     * @return The identifier of the Standby WorkSpace.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The identifier of the Standby WorkSpace.
     * </p>
     * 
     * @param workspaceId
     *        The identifier of the Standby WorkSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingCreateStandbyWorkspacesRequest withWorkspaceId(String workspaceId) {
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
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName()).append(",");
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
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

        if (obj instanceof PendingCreateStandbyWorkspacesRequest == false)
            return false;
        PendingCreateStandbyWorkspacesRequest other = (PendingCreateStandbyWorkspacesRequest) obj;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
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

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        return hashCode;
    }

    @Override
    public PendingCreateStandbyWorkspacesRequest clone() {
        try {
            return (PendingCreateStandbyWorkspacesRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspaces.model.transform.PendingCreateStandbyWorkspacesRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
