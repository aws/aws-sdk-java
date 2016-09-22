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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the inputs for the <a>RebuildWorkspaces</a> operation.
 * </p>
 */
public class RebuildWorkspacesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array of structures that specify the WorkSpaces to rebuild.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RebuildRequest> rebuildWorkspaceRequests;

    /**
     * <p>
     * An array of structures that specify the WorkSpaces to rebuild.
     * </p>
     * 
     * @return An array of structures that specify the WorkSpaces to rebuild.
     */

    public java.util.List<RebuildRequest> getRebuildWorkspaceRequests() {
        if (rebuildWorkspaceRequests == null) {
            rebuildWorkspaceRequests = new com.amazonaws.internal.SdkInternalList<RebuildRequest>();
        }
        return rebuildWorkspaceRequests;
    }

    /**
     * <p>
     * An array of structures that specify the WorkSpaces to rebuild.
     * </p>
     * 
     * @param rebuildWorkspaceRequests
     *        An array of structures that specify the WorkSpaces to rebuild.
     */

    public void setRebuildWorkspaceRequests(java.util.Collection<RebuildRequest> rebuildWorkspaceRequests) {
        if (rebuildWorkspaceRequests == null) {
            this.rebuildWorkspaceRequests = null;
            return;
        }

        this.rebuildWorkspaceRequests = new com.amazonaws.internal.SdkInternalList<RebuildRequest>(rebuildWorkspaceRequests);
    }

    /**
     * <p>
     * An array of structures that specify the WorkSpaces to rebuild.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRebuildWorkspaceRequests(java.util.Collection)} or
     * {@link #withRebuildWorkspaceRequests(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param rebuildWorkspaceRequests
     *        An array of structures that specify the WorkSpaces to rebuild.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RebuildWorkspacesRequest withRebuildWorkspaceRequests(RebuildRequest... rebuildWorkspaceRequests) {
        if (this.rebuildWorkspaceRequests == null) {
            setRebuildWorkspaceRequests(new com.amazonaws.internal.SdkInternalList<RebuildRequest>(rebuildWorkspaceRequests.length));
        }
        for (RebuildRequest ele : rebuildWorkspaceRequests) {
            this.rebuildWorkspaceRequests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures that specify the WorkSpaces to rebuild.
     * </p>
     * 
     * @param rebuildWorkspaceRequests
     *        An array of structures that specify the WorkSpaces to rebuild.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RebuildWorkspacesRequest withRebuildWorkspaceRequests(java.util.Collection<RebuildRequest> rebuildWorkspaceRequests) {
        setRebuildWorkspaceRequests(rebuildWorkspaceRequests);
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
        if (getRebuildWorkspaceRequests() != null)
            sb.append("RebuildWorkspaceRequests: " + getRebuildWorkspaceRequests());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RebuildWorkspacesRequest == false)
            return false;
        RebuildWorkspacesRequest other = (RebuildWorkspacesRequest) obj;
        if (other.getRebuildWorkspaceRequests() == null ^ this.getRebuildWorkspaceRequests() == null)
            return false;
        if (other.getRebuildWorkspaceRequests() != null && other.getRebuildWorkspaceRequests().equals(this.getRebuildWorkspaceRequests()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRebuildWorkspaceRequests() == null) ? 0 : getRebuildWorkspaceRequests().hashCode());
        return hashCode;
    }

    @Override
    public RebuildWorkspacesRequest clone() {
        return (RebuildWorkspacesRequest) super.clone();
    }
}
