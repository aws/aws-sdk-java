/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Contains information about a WorkSpace that could not be created.
 * </p>
 */
public class FailedCreateWorkspaceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A <a>FailedCreateWorkspaceRequest$WorkspaceRequest</a> object that contains the information about the WorkSpace
     * that could not be created.
     * </p>
     */
    private WorkspaceRequest workspaceRequest;
    /**
     * <p>
     * The error code.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The textual error message.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * A <a>FailedCreateWorkspaceRequest$WorkspaceRequest</a> object that contains the information about the WorkSpace
     * that could not be created.
     * </p>
     * 
     * @param workspaceRequest
     *        A <a>FailedCreateWorkspaceRequest$WorkspaceRequest</a> object that contains the information about the
     *        WorkSpace that could not be created.
     */

    public void setWorkspaceRequest(WorkspaceRequest workspaceRequest) {
        this.workspaceRequest = workspaceRequest;
    }

    /**
     * <p>
     * A <a>FailedCreateWorkspaceRequest$WorkspaceRequest</a> object that contains the information about the WorkSpace
     * that could not be created.
     * </p>
     * 
     * @return A <a>FailedCreateWorkspaceRequest$WorkspaceRequest</a> object that contains the information about the
     *         WorkSpace that could not be created.
     */

    public WorkspaceRequest getWorkspaceRequest() {
        return this.workspaceRequest;
    }

    /**
     * <p>
     * A <a>FailedCreateWorkspaceRequest$WorkspaceRequest</a> object that contains the information about the WorkSpace
     * that could not be created.
     * </p>
     * 
     * @param workspaceRequest
     *        A <a>FailedCreateWorkspaceRequest$WorkspaceRequest</a> object that contains the information about the
     *        WorkSpace that could not be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedCreateWorkspaceRequest withWorkspaceRequest(WorkspaceRequest workspaceRequest) {
        setWorkspaceRequest(workspaceRequest);
        return this;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @param errorCode
     *        The error code.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @return The error code.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @param errorCode
     *        The error code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedCreateWorkspaceRequest withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The textual error message.
     * </p>
     * 
     * @param errorMessage
     *        The textual error message.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The textual error message.
     * </p>
     * 
     * @return The textual error message.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The textual error message.
     * </p>
     * 
     * @param errorMessage
     *        The textual error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedCreateWorkspaceRequest withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getWorkspaceRequest() != null)
            sb.append("WorkspaceRequest: " + getWorkspaceRequest() + ",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: " + getErrorCode() + ",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: " + getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FailedCreateWorkspaceRequest == false)
            return false;
        FailedCreateWorkspaceRequest other = (FailedCreateWorkspaceRequest) obj;
        if (other.getWorkspaceRequest() == null ^ this.getWorkspaceRequest() == null)
            return false;
        if (other.getWorkspaceRequest() != null && other.getWorkspaceRequest().equals(this.getWorkspaceRequest()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkspaceRequest() == null) ? 0 : getWorkspaceRequest().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public FailedCreateWorkspaceRequest clone() {
        try {
            return (FailedCreateWorkspaceRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
