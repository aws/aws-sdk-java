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
 * Container for the parameters to the {@link com.amazonaws.services.workspaces.AmazonWorkspaces#rebuildWorkspaces(RebuildWorkspacesRequest) RebuildWorkspaces operation}.
 * <p>
 * Rebuilds the specified WorkSpaces.
 * </p>
 * <p>
 * Rebuilding a WorkSpace is a potentially destructive action that can
 * result in the loss of data. Rebuilding a WorkSpace causes the
 * following to occur:
 * </p>
 * 
 * <ul>
 * <li>The system is restored to the image of the bundle that the
 * WorkSpace is created from. Any applications that have been installed,
 * or system settings that have been made since the WorkSpace was created
 * will be lost.</li>
 * <li>The data drive (D drive) is re-created from the last automatic
 * snapshot taken of the data drive. The current contents of the data
 * drive are overwritten. Automatic snapshots of the data drive are taken
 * every 12 hours, so the snapshot can be as much as 12 hours old.</li>
 * 
 * </ul>
 * <p>
 * To be able to rebuild a WorkSpace, the WorkSpace must have a
 * <b>State</b> of <code>AVAILABLE</code> or <code>ERROR</code> .
 * </p>
 * <p>
 * <b>NOTE:</b> This operation is asynchronous and will return before the
 * WorkSpaces have been completely rebuilt.
 * </p>
 *
 * @see com.amazonaws.services.workspaces.AmazonWorkspaces#rebuildWorkspaces(RebuildWorkspacesRequest)
 */
public class RebuildWorkspacesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * An array of structures that specify the WorkSpaces to rebuild.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<RebuildRequest> rebuildWorkspaceRequests;

    /**
     * An array of structures that specify the WorkSpaces to rebuild.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1<br/>
     *
     * @return An array of structures that specify the WorkSpaces to rebuild.
     */
    public java.util.List<RebuildRequest> getRebuildWorkspaceRequests() {
        if (rebuildWorkspaceRequests == null) {
              rebuildWorkspaceRequests = new com.amazonaws.internal.ListWithAutoConstructFlag<RebuildRequest>();
              rebuildWorkspaceRequests.setAutoConstruct(true);
        }
        return rebuildWorkspaceRequests;
    }
    
    /**
     * An array of structures that specify the WorkSpaces to rebuild.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1<br/>
     *
     * @param rebuildWorkspaceRequests An array of structures that specify the WorkSpaces to rebuild.
     */
    public void setRebuildWorkspaceRequests(java.util.Collection<RebuildRequest> rebuildWorkspaceRequests) {
        if (rebuildWorkspaceRequests == null) {
            this.rebuildWorkspaceRequests = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<RebuildRequest> rebuildWorkspaceRequestsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<RebuildRequest>(rebuildWorkspaceRequests.size());
        rebuildWorkspaceRequestsCopy.addAll(rebuildWorkspaceRequests);
        this.rebuildWorkspaceRequests = rebuildWorkspaceRequestsCopy;
    }
    
    /**
     * An array of structures that specify the WorkSpaces to rebuild.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setRebuildWorkspaceRequests(java.util.Collection)}
     * or {@link #withRebuildWorkspaceRequests(java.util.Collection)} if you
     * want to override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1<br/>
     *
     * @param rebuildWorkspaceRequests An array of structures that specify the WorkSpaces to rebuild.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RebuildWorkspacesRequest withRebuildWorkspaceRequests(RebuildRequest... rebuildWorkspaceRequests) {
        if (getRebuildWorkspaceRequests() == null) setRebuildWorkspaceRequests(new java.util.ArrayList<RebuildRequest>(rebuildWorkspaceRequests.length));
        for (RebuildRequest value : rebuildWorkspaceRequests) {
            getRebuildWorkspaceRequests().add(value);
        }
        return this;
    }
    
    /**
     * An array of structures that specify the WorkSpaces to rebuild.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1<br/>
     *
     * @param rebuildWorkspaceRequests An array of structures that specify the WorkSpaces to rebuild.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RebuildWorkspacesRequest withRebuildWorkspaceRequests(java.util.Collection<RebuildRequest> rebuildWorkspaceRequests) {
        if (rebuildWorkspaceRequests == null) {
            this.rebuildWorkspaceRequests = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<RebuildRequest> rebuildWorkspaceRequestsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<RebuildRequest>(rebuildWorkspaceRequests.size());
            rebuildWorkspaceRequestsCopy.addAll(rebuildWorkspaceRequests);
            this.rebuildWorkspaceRequests = rebuildWorkspaceRequestsCopy;
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
        if (getRebuildWorkspaceRequests() != null) sb.append("RebuildWorkspaceRequests: " + getRebuildWorkspaceRequests() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRebuildWorkspaceRequests() == null) ? 0 : getRebuildWorkspaceRequests().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RebuildWorkspacesRequest == false) return false;
        RebuildWorkspacesRequest other = (RebuildWorkspacesRequest)obj;
        
        if (other.getRebuildWorkspaceRequests() == null ^ this.getRebuildWorkspaceRequests() == null) return false;
        if (other.getRebuildWorkspaceRequests() != null && other.getRebuildWorkspaceRequests().equals(this.getRebuildWorkspaceRequests()) == false) return false; 
        return true;
    }
    
    @Override
    public RebuildWorkspacesRequest clone() {
        
            return (RebuildWorkspacesRequest) super.clone();
    }

}
    