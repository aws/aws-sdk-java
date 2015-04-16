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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.workspaces.AmazonWorkspaces#terminateWorkspaces(TerminateWorkspacesRequest) TerminateWorkspaces operation}.
 * <p>
 * Terminates the specified WorkSpaces.
 * </p>
 * <p>
 * Terminating a WorkSpace is a permanent action and cannot be undone.
 * The user's data is not maintained and will be destroyed. If you need
 * to archive any user data, contact Amazon Web Services before
 * terminating the WorkSpace.
 * </p>
 * <p>
 * You can terminate a WorkSpace that is in any state except
 * <code>SUSPENDED</code> .
 * </p>
 * <p>
 * <b>NOTE:</b> This operation is asynchronous and will return before the
 * WorkSpaces have been completely terminated.
 * </p>
 *
 * @see com.amazonaws.services.workspaces.AmazonWorkspaces#terminateWorkspaces(TerminateWorkspacesRequest)
 */
public class TerminateWorkspacesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * An array of structures that specify the WorkSpaces to terminate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<TerminateRequest> terminateWorkspaceRequests;

    /**
     * An array of structures that specify the WorkSpaces to terminate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @return An array of structures that specify the WorkSpaces to terminate.
     */
    public java.util.List<TerminateRequest> getTerminateWorkspaceRequests() {
        if (terminateWorkspaceRequests == null) {
              terminateWorkspaceRequests = new com.amazonaws.internal.ListWithAutoConstructFlag<TerminateRequest>();
              terminateWorkspaceRequests.setAutoConstruct(true);
        }
        return terminateWorkspaceRequests;
    }
    
    /**
     * An array of structures that specify the WorkSpaces to terminate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param terminateWorkspaceRequests An array of structures that specify the WorkSpaces to terminate.
     */
    public void setTerminateWorkspaceRequests(java.util.Collection<TerminateRequest> terminateWorkspaceRequests) {
        if (terminateWorkspaceRequests == null) {
            this.terminateWorkspaceRequests = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<TerminateRequest> terminateWorkspaceRequestsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<TerminateRequest>(terminateWorkspaceRequests.size());
        terminateWorkspaceRequestsCopy.addAll(terminateWorkspaceRequests);
        this.terminateWorkspaceRequests = terminateWorkspaceRequestsCopy;
    }
    
    /**
     * An array of structures that specify the WorkSpaces to terminate.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTerminateWorkspaceRequests(java.util.Collection)}
     * or {@link #withTerminateWorkspaceRequests(java.util.Collection)} if
     * you want to override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param terminateWorkspaceRequests An array of structures that specify the WorkSpaces to terminate.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TerminateWorkspacesRequest withTerminateWorkspaceRequests(TerminateRequest... terminateWorkspaceRequests) {
        if (getTerminateWorkspaceRequests() == null) setTerminateWorkspaceRequests(new java.util.ArrayList<TerminateRequest>(terminateWorkspaceRequests.length));
        for (TerminateRequest value : terminateWorkspaceRequests) {
            getTerminateWorkspaceRequests().add(value);
        }
        return this;
    }
    
    /**
     * An array of structures that specify the WorkSpaces to terminate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param terminateWorkspaceRequests An array of structures that specify the WorkSpaces to terminate.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TerminateWorkspacesRequest withTerminateWorkspaceRequests(java.util.Collection<TerminateRequest> terminateWorkspaceRequests) {
        if (terminateWorkspaceRequests == null) {
            this.terminateWorkspaceRequests = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<TerminateRequest> terminateWorkspaceRequestsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<TerminateRequest>(terminateWorkspaceRequests.size());
            terminateWorkspaceRequestsCopy.addAll(terminateWorkspaceRequests);
            this.terminateWorkspaceRequests = terminateWorkspaceRequestsCopy;
        }

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
        if (getTerminateWorkspaceRequests() != null) sb.append("TerminateWorkspaceRequests: " + getTerminateWorkspaceRequests() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTerminateWorkspaceRequests() == null) ? 0 : getTerminateWorkspaceRequests().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof TerminateWorkspacesRequest == false) return false;
        TerminateWorkspacesRequest other = (TerminateWorkspacesRequest)obj;
        
        if (other.getTerminateWorkspaceRequests() == null ^ this.getTerminateWorkspaceRequests() == null) return false;
        if (other.getTerminateWorkspaceRequests() != null && other.getTerminateWorkspaceRequests().equals(this.getTerminateWorkspaceRequests()) == false) return false; 
        return true;
    }
    
    @Override
    public TerminateWorkspacesRequest clone() {
        
            return (TerminateWorkspacesRequest) super.clone();
    }

}
    