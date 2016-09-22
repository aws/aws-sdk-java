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
 * 
 */
public class StartWorkspacesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The requests.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<StartRequest> startWorkspaceRequests;

    /**
     * <p>
     * The requests.
     * </p>
     * 
     * @return The requests.
     */

    public java.util.List<StartRequest> getStartWorkspaceRequests() {
        if (startWorkspaceRequests == null) {
            startWorkspaceRequests = new com.amazonaws.internal.SdkInternalList<StartRequest>();
        }
        return startWorkspaceRequests;
    }

    /**
     * <p>
     * The requests.
     * </p>
     * 
     * @param startWorkspaceRequests
     *        The requests.
     */

    public void setStartWorkspaceRequests(java.util.Collection<StartRequest> startWorkspaceRequests) {
        if (startWorkspaceRequests == null) {
            this.startWorkspaceRequests = null;
            return;
        }

        this.startWorkspaceRequests = new com.amazonaws.internal.SdkInternalList<StartRequest>(startWorkspaceRequests);
    }

    /**
     * <p>
     * The requests.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStartWorkspaceRequests(java.util.Collection)} or
     * {@link #withStartWorkspaceRequests(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param startWorkspaceRequests
     *        The requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartWorkspacesRequest withStartWorkspaceRequests(StartRequest... startWorkspaceRequests) {
        if (this.startWorkspaceRequests == null) {
            setStartWorkspaceRequests(new com.amazonaws.internal.SdkInternalList<StartRequest>(startWorkspaceRequests.length));
        }
        for (StartRequest ele : startWorkspaceRequests) {
            this.startWorkspaceRequests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The requests.
     * </p>
     * 
     * @param startWorkspaceRequests
     *        The requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartWorkspacesRequest withStartWorkspaceRequests(java.util.Collection<StartRequest> startWorkspaceRequests) {
        setStartWorkspaceRequests(startWorkspaceRequests);
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
        if (getStartWorkspaceRequests() != null)
            sb.append("StartWorkspaceRequests: " + getStartWorkspaceRequests());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartWorkspacesRequest == false)
            return false;
        StartWorkspacesRequest other = (StartWorkspacesRequest) obj;
        if (other.getStartWorkspaceRequests() == null ^ this.getStartWorkspaceRequests() == null)
            return false;
        if (other.getStartWorkspaceRequests() != null && other.getStartWorkspaceRequests().equals(this.getStartWorkspaceRequests()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartWorkspaceRequests() == null) ? 0 : getStartWorkspaceRequests().hashCode());
        return hashCode;
    }

    @Override
    public StartWorkspacesRequest clone() {
        return (StartWorkspacesRequest) super.clone();
    }
}
