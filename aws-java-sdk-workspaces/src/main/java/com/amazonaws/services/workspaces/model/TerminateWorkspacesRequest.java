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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/TerminateWorkspaces" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TerminateWorkspacesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The WorkSpaces to terminate. You can specify up to 25 WorkSpaces.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TerminateRequest> terminateWorkspaceRequests;

    /**
     * <p>
     * The WorkSpaces to terminate. You can specify up to 25 WorkSpaces.
     * </p>
     * 
     * @return The WorkSpaces to terminate. You can specify up to 25 WorkSpaces.
     */

    public java.util.List<TerminateRequest> getTerminateWorkspaceRequests() {
        if (terminateWorkspaceRequests == null) {
            terminateWorkspaceRequests = new com.amazonaws.internal.SdkInternalList<TerminateRequest>();
        }
        return terminateWorkspaceRequests;
    }

    /**
     * <p>
     * The WorkSpaces to terminate. You can specify up to 25 WorkSpaces.
     * </p>
     * 
     * @param terminateWorkspaceRequests
     *        The WorkSpaces to terminate. You can specify up to 25 WorkSpaces.
     */

    public void setTerminateWorkspaceRequests(java.util.Collection<TerminateRequest> terminateWorkspaceRequests) {
        if (terminateWorkspaceRequests == null) {
            this.terminateWorkspaceRequests = null;
            return;
        }

        this.terminateWorkspaceRequests = new com.amazonaws.internal.SdkInternalList<TerminateRequest>(terminateWorkspaceRequests);
    }

    /**
     * <p>
     * The WorkSpaces to terminate. You can specify up to 25 WorkSpaces.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTerminateWorkspaceRequests(java.util.Collection)} or
     * {@link #withTerminateWorkspaceRequests(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param terminateWorkspaceRequests
     *        The WorkSpaces to terminate. You can specify up to 25 WorkSpaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateWorkspacesRequest withTerminateWorkspaceRequests(TerminateRequest... terminateWorkspaceRequests) {
        if (this.terminateWorkspaceRequests == null) {
            setTerminateWorkspaceRequests(new com.amazonaws.internal.SdkInternalList<TerminateRequest>(terminateWorkspaceRequests.length));
        }
        for (TerminateRequest ele : terminateWorkspaceRequests) {
            this.terminateWorkspaceRequests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The WorkSpaces to terminate. You can specify up to 25 WorkSpaces.
     * </p>
     * 
     * @param terminateWorkspaceRequests
     *        The WorkSpaces to terminate. You can specify up to 25 WorkSpaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateWorkspacesRequest withTerminateWorkspaceRequests(java.util.Collection<TerminateRequest> terminateWorkspaceRequests) {
        setTerminateWorkspaceRequests(terminateWorkspaceRequests);
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
        if (getTerminateWorkspaceRequests() != null)
            sb.append("TerminateWorkspaceRequests: ").append(getTerminateWorkspaceRequests());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TerminateWorkspacesRequest == false)
            return false;
        TerminateWorkspacesRequest other = (TerminateWorkspacesRequest) obj;
        if (other.getTerminateWorkspaceRequests() == null ^ this.getTerminateWorkspaceRequests() == null)
            return false;
        if (other.getTerminateWorkspaceRequests() != null && other.getTerminateWorkspaceRequests().equals(this.getTerminateWorkspaceRequests()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTerminateWorkspaceRequests() == null) ? 0 : getTerminateWorkspaceRequests().hashCode());
        return hashCode;
    }

    @Override
    public TerminateWorkspacesRequest clone() {
        return (TerminateWorkspacesRequest) super.clone();
    }

}
