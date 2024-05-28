/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The ListMetadataTransferJobs filter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/ListMetadataTransferJobsFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMetadataTransferJobsFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The workspace Id.
     * </p>
     */
    private String workspaceId;
    /**
     * <p>
     * The filter state.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The workspace Id.
     * </p>
     * 
     * @param workspaceId
     *        The workspace Id.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The workspace Id.
     * </p>
     * 
     * @return The workspace Id.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The workspace Id.
     * </p>
     * 
     * @param workspaceId
     *        The workspace Id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMetadataTransferJobsFilter withWorkspaceId(String workspaceId) {
        setWorkspaceId(workspaceId);
        return this;
    }

    /**
     * <p>
     * The filter state.
     * </p>
     * 
     * @param state
     *        The filter state.
     * @see MetadataTransferJobState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The filter state.
     * </p>
     * 
     * @return The filter state.
     * @see MetadataTransferJobState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The filter state.
     * </p>
     * 
     * @param state
     *        The filter state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetadataTransferJobState
     */

    public ListMetadataTransferJobsFilter withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The filter state.
     * </p>
     * 
     * @param state
     *        The filter state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetadataTransferJobState
     */

    public ListMetadataTransferJobsFilter withState(MetadataTransferJobState state) {
        this.state = state.toString();
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
        if (getWorkspaceId() != null)
            sb.append("WorkspaceId: ").append(getWorkspaceId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMetadataTransferJobsFilter == false)
            return false;
        ListMetadataTransferJobsFilter other = (ListMetadataTransferJobsFilter) obj;
        if (other.getWorkspaceId() == null ^ this.getWorkspaceId() == null)
            return false;
        if (other.getWorkspaceId() != null && other.getWorkspaceId().equals(this.getWorkspaceId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public ListMetadataTransferJobsFilter clone() {
        try {
            return (ListMetadataTransferJobsFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.ListMetadataTransferJobsFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
