/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/StartWorkspaces" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartWorkspacesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The WorkSpaces to start. You can specify up to 25 WorkSpaces.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<StartRequest> startWorkspaceRequests;

    /**
     * <p>
     * The WorkSpaces to start. You can specify up to 25 WorkSpaces.
     * </p>
     * 
     * @return The WorkSpaces to start. You can specify up to 25 WorkSpaces.
     */

    public java.util.List<StartRequest> getStartWorkspaceRequests() {
        if (startWorkspaceRequests == null) {
            startWorkspaceRequests = new com.amazonaws.internal.SdkInternalList<StartRequest>();
        }
        return startWorkspaceRequests;
    }

    /**
     * <p>
     * The WorkSpaces to start. You can specify up to 25 WorkSpaces.
     * </p>
     * 
     * @param startWorkspaceRequests
     *        The WorkSpaces to start. You can specify up to 25 WorkSpaces.
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
     * The WorkSpaces to start. You can specify up to 25 WorkSpaces.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStartWorkspaceRequests(java.util.Collection)} or
     * {@link #withStartWorkspaceRequests(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param startWorkspaceRequests
     *        The WorkSpaces to start. You can specify up to 25 WorkSpaces.
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
     * The WorkSpaces to start. You can specify up to 25 WorkSpaces.
     * </p>
     * 
     * @param startWorkspaceRequests
     *        The WorkSpaces to start. You can specify up to 25 WorkSpaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartWorkspacesRequest withStartWorkspaceRequests(java.util.Collection<StartRequest> startWorkspaceRequests) {
        setStartWorkspaceRequests(startWorkspaceRequests);
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
        if (getStartWorkspaceRequests() != null)
            sb.append("StartWorkspaceRequests: ").append(getStartWorkspaceRequests());
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
