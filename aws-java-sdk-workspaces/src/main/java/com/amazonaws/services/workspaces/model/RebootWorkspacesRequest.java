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
 * Container for the parameters to the {@link com.amazonaws.services.workspaces.AmazonWorkspaces#rebootWorkspaces(RebootWorkspacesRequest) RebootWorkspaces operation}.
 * <p>
 * Reboots the specified WorkSpaces.
 * </p>
 * <p>
 * To be able to reboot a WorkSpace, the WorkSpace must have a
 * <b>State</b> of <code>AVAILABLE</code> ,
 * <code>IMPAIRED</code> , or <code>INOPERABLE</code>
 * .
 * </p>
 * <p>
 * <b>NOTE:</b> This operation is asynchronous and will return before the
 * WorkSpaces have rebooted.
 * </p>
 *
 * @see com.amazonaws.services.workspaces.AmazonWorkspaces#rebootWorkspaces(RebootWorkspacesRequest)
 */
public class RebootWorkspacesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * An array of structures that specify the WorkSpaces to reboot.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<RebootRequest> rebootWorkspaceRequests;

    /**
     * An array of structures that specify the WorkSpaces to reboot.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @return An array of structures that specify the WorkSpaces to reboot.
     */
    public java.util.List<RebootRequest> getRebootWorkspaceRequests() {
        if (rebootWorkspaceRequests == null) {
              rebootWorkspaceRequests = new com.amazonaws.internal.ListWithAutoConstructFlag<RebootRequest>();
              rebootWorkspaceRequests.setAutoConstruct(true);
        }
        return rebootWorkspaceRequests;
    }
    
    /**
     * An array of structures that specify the WorkSpaces to reboot.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param rebootWorkspaceRequests An array of structures that specify the WorkSpaces to reboot.
     */
    public void setRebootWorkspaceRequests(java.util.Collection<RebootRequest> rebootWorkspaceRequests) {
        if (rebootWorkspaceRequests == null) {
            this.rebootWorkspaceRequests = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<RebootRequest> rebootWorkspaceRequestsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<RebootRequest>(rebootWorkspaceRequests.size());
        rebootWorkspaceRequestsCopy.addAll(rebootWorkspaceRequests);
        this.rebootWorkspaceRequests = rebootWorkspaceRequestsCopy;
    }
    
    /**
     * An array of structures that specify the WorkSpaces to reboot.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setRebootWorkspaceRequests(java.util.Collection)} or
     * {@link #withRebootWorkspaceRequests(java.util.Collection)} if you want
     * to override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param rebootWorkspaceRequests An array of structures that specify the WorkSpaces to reboot.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RebootWorkspacesRequest withRebootWorkspaceRequests(RebootRequest... rebootWorkspaceRequests) {
        if (getRebootWorkspaceRequests() == null) setRebootWorkspaceRequests(new java.util.ArrayList<RebootRequest>(rebootWorkspaceRequests.length));
        for (RebootRequest value : rebootWorkspaceRequests) {
            getRebootWorkspaceRequests().add(value);
        }
        return this;
    }
    
    /**
     * An array of structures that specify the WorkSpaces to reboot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param rebootWorkspaceRequests An array of structures that specify the WorkSpaces to reboot.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RebootWorkspacesRequest withRebootWorkspaceRequests(java.util.Collection<RebootRequest> rebootWorkspaceRequests) {
        if (rebootWorkspaceRequests == null) {
            this.rebootWorkspaceRequests = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<RebootRequest> rebootWorkspaceRequestsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<RebootRequest>(rebootWorkspaceRequests.size());
            rebootWorkspaceRequestsCopy.addAll(rebootWorkspaceRequests);
            this.rebootWorkspaceRequests = rebootWorkspaceRequestsCopy;
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
        if (getRebootWorkspaceRequests() != null) sb.append("RebootWorkspaceRequests: " + getRebootWorkspaceRequests() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRebootWorkspaceRequests() == null) ? 0 : getRebootWorkspaceRequests().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RebootWorkspacesRequest == false) return false;
        RebootWorkspacesRequest other = (RebootWorkspacesRequest)obj;
        
        if (other.getRebootWorkspaceRequests() == null ^ this.getRebootWorkspaceRequests() == null) return false;
        if (other.getRebootWorkspaceRequests() != null && other.getRebootWorkspaceRequests().equals(this.getRebootWorkspaceRequests()) == false) return false; 
        return true;
    }
    
    @Override
    public RebootWorkspacesRequest clone() {
        
            return (RebootWorkspacesRequest) super.clone();
    }

}
    