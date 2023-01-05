/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/CreateStandbyWorkspaces" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateStandbyWorkspacesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the Standby WorkSpace that could not be created.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<FailedCreateStandbyWorkspacesRequest> failedStandbyRequests;
    /**
     * <p>
     * Information about the Standby WorkSpace that was created.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PendingCreateStandbyWorkspacesRequest> pendingStandbyRequests;

    /**
     * <p>
     * Information about the Standby WorkSpace that could not be created.
     * </p>
     * 
     * @return Information about the Standby WorkSpace that could not be created.
     */

    public java.util.List<FailedCreateStandbyWorkspacesRequest> getFailedStandbyRequests() {
        if (failedStandbyRequests == null) {
            failedStandbyRequests = new com.amazonaws.internal.SdkInternalList<FailedCreateStandbyWorkspacesRequest>();
        }
        return failedStandbyRequests;
    }

    /**
     * <p>
     * Information about the Standby WorkSpace that could not be created.
     * </p>
     * 
     * @param failedStandbyRequests
     *        Information about the Standby WorkSpace that could not be created.
     */

    public void setFailedStandbyRequests(java.util.Collection<FailedCreateStandbyWorkspacesRequest> failedStandbyRequests) {
        if (failedStandbyRequests == null) {
            this.failedStandbyRequests = null;
            return;
        }

        this.failedStandbyRequests = new com.amazonaws.internal.SdkInternalList<FailedCreateStandbyWorkspacesRequest>(failedStandbyRequests);
    }

    /**
     * <p>
     * Information about the Standby WorkSpace that could not be created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailedStandbyRequests(java.util.Collection)} or
     * {@link #withFailedStandbyRequests(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param failedStandbyRequests
     *        Information about the Standby WorkSpace that could not be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStandbyWorkspacesResult withFailedStandbyRequests(FailedCreateStandbyWorkspacesRequest... failedStandbyRequests) {
        if (this.failedStandbyRequests == null) {
            setFailedStandbyRequests(new com.amazonaws.internal.SdkInternalList<FailedCreateStandbyWorkspacesRequest>(failedStandbyRequests.length));
        }
        for (FailedCreateStandbyWorkspacesRequest ele : failedStandbyRequests) {
            this.failedStandbyRequests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the Standby WorkSpace that could not be created.
     * </p>
     * 
     * @param failedStandbyRequests
     *        Information about the Standby WorkSpace that could not be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStandbyWorkspacesResult withFailedStandbyRequests(java.util.Collection<FailedCreateStandbyWorkspacesRequest> failedStandbyRequests) {
        setFailedStandbyRequests(failedStandbyRequests);
        return this;
    }

    /**
     * <p>
     * Information about the Standby WorkSpace that was created.
     * </p>
     * 
     * @return Information about the Standby WorkSpace that was created.
     */

    public java.util.List<PendingCreateStandbyWorkspacesRequest> getPendingStandbyRequests() {
        if (pendingStandbyRequests == null) {
            pendingStandbyRequests = new com.amazonaws.internal.SdkInternalList<PendingCreateStandbyWorkspacesRequest>();
        }
        return pendingStandbyRequests;
    }

    /**
     * <p>
     * Information about the Standby WorkSpace that was created.
     * </p>
     * 
     * @param pendingStandbyRequests
     *        Information about the Standby WorkSpace that was created.
     */

    public void setPendingStandbyRequests(java.util.Collection<PendingCreateStandbyWorkspacesRequest> pendingStandbyRequests) {
        if (pendingStandbyRequests == null) {
            this.pendingStandbyRequests = null;
            return;
        }

        this.pendingStandbyRequests = new com.amazonaws.internal.SdkInternalList<PendingCreateStandbyWorkspacesRequest>(pendingStandbyRequests);
    }

    /**
     * <p>
     * Information about the Standby WorkSpace that was created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPendingStandbyRequests(java.util.Collection)} or
     * {@link #withPendingStandbyRequests(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param pendingStandbyRequests
     *        Information about the Standby WorkSpace that was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStandbyWorkspacesResult withPendingStandbyRequests(PendingCreateStandbyWorkspacesRequest... pendingStandbyRequests) {
        if (this.pendingStandbyRequests == null) {
            setPendingStandbyRequests(new com.amazonaws.internal.SdkInternalList<PendingCreateStandbyWorkspacesRequest>(pendingStandbyRequests.length));
        }
        for (PendingCreateStandbyWorkspacesRequest ele : pendingStandbyRequests) {
            this.pendingStandbyRequests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the Standby WorkSpace that was created.
     * </p>
     * 
     * @param pendingStandbyRequests
     *        Information about the Standby WorkSpace that was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStandbyWorkspacesResult withPendingStandbyRequests(java.util.Collection<PendingCreateStandbyWorkspacesRequest> pendingStandbyRequests) {
        setPendingStandbyRequests(pendingStandbyRequests);
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
        if (getFailedStandbyRequests() != null)
            sb.append("FailedStandbyRequests: ").append(getFailedStandbyRequests()).append(",");
        if (getPendingStandbyRequests() != null)
            sb.append("PendingStandbyRequests: ").append(getPendingStandbyRequests());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateStandbyWorkspacesResult == false)
            return false;
        CreateStandbyWorkspacesResult other = (CreateStandbyWorkspacesResult) obj;
        if (other.getFailedStandbyRequests() == null ^ this.getFailedStandbyRequests() == null)
            return false;
        if (other.getFailedStandbyRequests() != null && other.getFailedStandbyRequests().equals(this.getFailedStandbyRequests()) == false)
            return false;
        if (other.getPendingStandbyRequests() == null ^ this.getPendingStandbyRequests() == null)
            return false;
        if (other.getPendingStandbyRequests() != null && other.getPendingStandbyRequests().equals(this.getPendingStandbyRequests()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailedStandbyRequests() == null) ? 0 : getFailedStandbyRequests().hashCode());
        hashCode = prime * hashCode + ((getPendingStandbyRequests() == null) ? 0 : getPendingStandbyRequests().hashCode());
        return hashCode;
    }

    @Override
    public CreateStandbyWorkspacesResult clone() {
        try {
            return (CreateStandbyWorkspacesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
