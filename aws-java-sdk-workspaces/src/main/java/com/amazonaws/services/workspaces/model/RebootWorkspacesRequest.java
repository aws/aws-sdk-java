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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/RebootWorkspaces" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RebootWorkspacesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The WorkSpaces to reboot. You can specify up to 25 WorkSpaces.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RebootRequest> rebootWorkspaceRequests;

    /**
     * <p>
     * The WorkSpaces to reboot. You can specify up to 25 WorkSpaces.
     * </p>
     * 
     * @return The WorkSpaces to reboot. You can specify up to 25 WorkSpaces.
     */

    public java.util.List<RebootRequest> getRebootWorkspaceRequests() {
        if (rebootWorkspaceRequests == null) {
            rebootWorkspaceRequests = new com.amazonaws.internal.SdkInternalList<RebootRequest>();
        }
        return rebootWorkspaceRequests;
    }

    /**
     * <p>
     * The WorkSpaces to reboot. You can specify up to 25 WorkSpaces.
     * </p>
     * 
     * @param rebootWorkspaceRequests
     *        The WorkSpaces to reboot. You can specify up to 25 WorkSpaces.
     */

    public void setRebootWorkspaceRequests(java.util.Collection<RebootRequest> rebootWorkspaceRequests) {
        if (rebootWorkspaceRequests == null) {
            this.rebootWorkspaceRequests = null;
            return;
        }

        this.rebootWorkspaceRequests = new com.amazonaws.internal.SdkInternalList<RebootRequest>(rebootWorkspaceRequests);
    }

    /**
     * <p>
     * The WorkSpaces to reboot. You can specify up to 25 WorkSpaces.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRebootWorkspaceRequests(java.util.Collection)} or
     * {@link #withRebootWorkspaceRequests(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param rebootWorkspaceRequests
     *        The WorkSpaces to reboot. You can specify up to 25 WorkSpaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RebootWorkspacesRequest withRebootWorkspaceRequests(RebootRequest... rebootWorkspaceRequests) {
        if (this.rebootWorkspaceRequests == null) {
            setRebootWorkspaceRequests(new com.amazonaws.internal.SdkInternalList<RebootRequest>(rebootWorkspaceRequests.length));
        }
        for (RebootRequest ele : rebootWorkspaceRequests) {
            this.rebootWorkspaceRequests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The WorkSpaces to reboot. You can specify up to 25 WorkSpaces.
     * </p>
     * 
     * @param rebootWorkspaceRequests
     *        The WorkSpaces to reboot. You can specify up to 25 WorkSpaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RebootWorkspacesRequest withRebootWorkspaceRequests(java.util.Collection<RebootRequest> rebootWorkspaceRequests) {
        setRebootWorkspaceRequests(rebootWorkspaceRequests);
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
        if (getRebootWorkspaceRequests() != null)
            sb.append("RebootWorkspaceRequests: ").append(getRebootWorkspaceRequests());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RebootWorkspacesRequest == false)
            return false;
        RebootWorkspacesRequest other = (RebootWorkspacesRequest) obj;
        if (other.getRebootWorkspaceRequests() == null ^ this.getRebootWorkspaceRequests() == null)
            return false;
        if (other.getRebootWorkspaceRequests() != null && other.getRebootWorkspaceRequests().equals(this.getRebootWorkspaceRequests()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRebootWorkspaceRequests() == null) ? 0 : getRebootWorkspaceRequests().hashCode());
        return hashCode;
    }

    @Override
    public RebootWorkspacesRequest clone() {
        return (RebootWorkspacesRequest) super.clone();
    }

}
