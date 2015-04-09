/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about a WorkSpace that could not be rebooted
 * (RebootWorkspaces), rebuilt (RebuildWorkspaces), or terminated
 * (TerminateWorkspaces).
 * </p>
 */
public class FailedWorkspaceChangeRequest implements Serializable, Cloneable {

    /**
     * The identifier of the WorkSpace.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^ws-[0-9a-z]{8,63}$<br/>
     */
    private String workspaceId;

    /**
     * The error code.
     */
    private String errorCode;

    /**
     * The textual error message.
     */
    private String errorMessage;

    /**
     * The identifier of the WorkSpace.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^ws-[0-9a-z]{8,63}$<br/>
     *
     * @return The identifier of the WorkSpace.
     */
    public String getWorkspaceId() {
        return workspaceId;
    }
    
    /**
     * The identifier of the WorkSpace.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^ws-[0-9a-z]{8,63}$<br/>
     *
     * @param workspaceId The identifier of the WorkSpace.
     */
    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }
    
    /**
     * The identifier of the WorkSpace.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^ws-[0-9a-z]{8,63}$<br/>
     *
     * @param workspaceId The identifier of the WorkSpace.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public FailedWorkspaceChangeRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * The error code.
     *
     * @return The error code.
     */
    public String getErrorCode() {
        return errorCode;
    }
    
    /**
     * The error code.
     *
     * @param errorCode The error code.
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
    
    /**
     * The error code.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param errorCode The error code.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public FailedWorkspaceChangeRequest withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * The textual error message.
     *
     * @return The textual error message.
     */
    public String getErrorMessage() {
        return errorMessage;
    }
    
    /**
     * The textual error message.
     *
     * @param errorMessage The textual error message.
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
    
    /**
     * The textual error message.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param errorMessage The textual error message.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public FailedWorkspaceChangeRequest withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getWorkspaceId() != null) sb.append("WorkspaceId: " + getWorkspaceId() + ",");
        if (getErrorCode() != null) sb.append("ErrorCode: " + getErrorCode() + ",");
        if (getErrorMessage() != null) sb.append("ErrorMessage: " + getErrorMessage() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode()); 
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode()); 
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof FailedWorkspaceChangeRequest == false) return false;
        FailedWorkspaceChangeRequest other = (FailedWorkspaceChangeRequest)obj;
        
        if (other.getWorkspaceId() == null ^ this.getWorkspaceId() == null) return false;
        if (other.getWorkspaceId() != null && other.getWorkspaceId().equals(this.getWorkspaceId()) == false) return false; 
        if (other.getErrorCode() == null ^ this.getErrorCode() == null) return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false) return false; 
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null) return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false) return false; 
        return true;
    }
    
    @Override
    public FailedWorkspaceChangeRequest clone() {
        try {
            return (FailedWorkspaceChangeRequest) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    