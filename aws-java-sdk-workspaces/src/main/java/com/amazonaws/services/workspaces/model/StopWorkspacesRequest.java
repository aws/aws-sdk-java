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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/StopWorkspaces" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopWorkspacesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The WorkSpaces to stop. You can specify up to 25 WorkSpaces.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<StopRequest> stopWorkspaceRequests;

    /**
     * <p>
     * The WorkSpaces to stop. You can specify up to 25 WorkSpaces.
     * </p>
     * 
     * @return The WorkSpaces to stop. You can specify up to 25 WorkSpaces.
     */

    public java.util.List<StopRequest> getStopWorkspaceRequests() {
        if (stopWorkspaceRequests == null) {
            stopWorkspaceRequests = new com.amazonaws.internal.SdkInternalList<StopRequest>();
        }
        return stopWorkspaceRequests;
    }

    /**
     * <p>
     * The WorkSpaces to stop. You can specify up to 25 WorkSpaces.
     * </p>
     * 
     * @param stopWorkspaceRequests
     *        The WorkSpaces to stop. You can specify up to 25 WorkSpaces.
     */

    public void setStopWorkspaceRequests(java.util.Collection<StopRequest> stopWorkspaceRequests) {
        if (stopWorkspaceRequests == null) {
            this.stopWorkspaceRequests = null;
            return;
        }

        this.stopWorkspaceRequests = new com.amazonaws.internal.SdkInternalList<StopRequest>(stopWorkspaceRequests);
    }

    /**
     * <p>
     * The WorkSpaces to stop. You can specify up to 25 WorkSpaces.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStopWorkspaceRequests(java.util.Collection)} or
     * {@link #withStopWorkspaceRequests(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param stopWorkspaceRequests
     *        The WorkSpaces to stop. You can specify up to 25 WorkSpaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopWorkspacesRequest withStopWorkspaceRequests(StopRequest... stopWorkspaceRequests) {
        if (this.stopWorkspaceRequests == null) {
            setStopWorkspaceRequests(new com.amazonaws.internal.SdkInternalList<StopRequest>(stopWorkspaceRequests.length));
        }
        for (StopRequest ele : stopWorkspaceRequests) {
            this.stopWorkspaceRequests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The WorkSpaces to stop. You can specify up to 25 WorkSpaces.
     * </p>
     * 
     * @param stopWorkspaceRequests
     *        The WorkSpaces to stop. You can specify up to 25 WorkSpaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopWorkspacesRequest withStopWorkspaceRequests(java.util.Collection<StopRequest> stopWorkspaceRequests) {
        setStopWorkspaceRequests(stopWorkspaceRequests);
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
        if (getStopWorkspaceRequests() != null)
            sb.append("StopWorkspaceRequests: ").append(getStopWorkspaceRequests());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopWorkspacesRequest == false)
            return false;
        StopWorkspacesRequest other = (StopWorkspacesRequest) obj;
        if (other.getStopWorkspaceRequests() == null ^ this.getStopWorkspaceRequests() == null)
            return false;
        if (other.getStopWorkspaceRequests() != null && other.getStopWorkspaceRequests().equals(this.getStopWorkspaceRequests()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStopWorkspaceRequests() == null) ? 0 : getStopWorkspaceRequests().hashCode());
        return hashCode;
    }

    @Override
    public StopWorkspacesRequest clone() {
        return (StopWorkspacesRequest) super.clone();
    }

}
