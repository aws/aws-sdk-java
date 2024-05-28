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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns a list of the commands that were ran on the target resource.
 * </p>
 * <p>
 * The status of each command is also returned.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/SetupHistory" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetupHistory implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A GUID that's used to identify the operation.
     * </p>
     */
    private String operationId;
    /**
     * <p>
     * Information about the specified request.
     * </p>
     */
    private SetupRequest request;
    /**
     * <p>
     * The target resource name for the request.
     * </p>
     */
    private SetupHistoryResource resource;
    /**
     * <p>
     * Describes the full details of the request.
     * </p>
     */
    private java.util.List<SetupExecutionDetails> executionDetails;
    /**
     * <p>
     * The status of the request.
     * </p>
     */
    private String status;

    /**
     * <p>
     * A GUID that's used to identify the operation.
     * </p>
     * 
     * @param operationId
     *        A GUID that's used to identify the operation.
     */

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    /**
     * <p>
     * A GUID that's used to identify the operation.
     * </p>
     * 
     * @return A GUID that's used to identify the operation.
     */

    public String getOperationId() {
        return this.operationId;
    }

    /**
     * <p>
     * A GUID that's used to identify the operation.
     * </p>
     * 
     * @param operationId
     *        A GUID that's used to identify the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetupHistory withOperationId(String operationId) {
        setOperationId(operationId);
        return this;
    }

    /**
     * <p>
     * Information about the specified request.
     * </p>
     * 
     * @param request
     *        Information about the specified request.
     */

    public void setRequest(SetupRequest request) {
        this.request = request;
    }

    /**
     * <p>
     * Information about the specified request.
     * </p>
     * 
     * @return Information about the specified request.
     */

    public SetupRequest getRequest() {
        return this.request;
    }

    /**
     * <p>
     * Information about the specified request.
     * </p>
     * 
     * @param request
     *        Information about the specified request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetupHistory withRequest(SetupRequest request) {
        setRequest(request);
        return this;
    }

    /**
     * <p>
     * The target resource name for the request.
     * </p>
     * 
     * @param resource
     *        The target resource name for the request.
     */

    public void setResource(SetupHistoryResource resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The target resource name for the request.
     * </p>
     * 
     * @return The target resource name for the request.
     */

    public SetupHistoryResource getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The target resource name for the request.
     * </p>
     * 
     * @param resource
     *        The target resource name for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetupHistory withResource(SetupHistoryResource resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * Describes the full details of the request.
     * </p>
     * 
     * @return Describes the full details of the request.
     */

    public java.util.List<SetupExecutionDetails> getExecutionDetails() {
        return executionDetails;
    }

    /**
     * <p>
     * Describes the full details of the request.
     * </p>
     * 
     * @param executionDetails
     *        Describes the full details of the request.
     */

    public void setExecutionDetails(java.util.Collection<SetupExecutionDetails> executionDetails) {
        if (executionDetails == null) {
            this.executionDetails = null;
            return;
        }

        this.executionDetails = new java.util.ArrayList<SetupExecutionDetails>(executionDetails);
    }

    /**
     * <p>
     * Describes the full details of the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExecutionDetails(java.util.Collection)} or {@link #withExecutionDetails(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param executionDetails
     *        Describes the full details of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetupHistory withExecutionDetails(SetupExecutionDetails... executionDetails) {
        if (this.executionDetails == null) {
            setExecutionDetails(new java.util.ArrayList<SetupExecutionDetails>(executionDetails.length));
        }
        for (SetupExecutionDetails ele : executionDetails) {
            this.executionDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes the full details of the request.
     * </p>
     * 
     * @param executionDetails
     *        Describes the full details of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetupHistory withExecutionDetails(java.util.Collection<SetupExecutionDetails> executionDetails) {
        setExecutionDetails(executionDetails);
        return this;
    }

    /**
     * <p>
     * The status of the request.
     * </p>
     * 
     * @param status
     *        The status of the request.
     * @see SetupStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the request.
     * </p>
     * 
     * @return The status of the request.
     * @see SetupStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the request.
     * </p>
     * 
     * @param status
     *        The status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SetupStatus
     */

    public SetupHistory withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the request.
     * </p>
     * 
     * @param status
     *        The status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SetupStatus
     */

    public SetupHistory withStatus(SetupStatus status) {
        this.status = status.toString();
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
        if (getOperationId() != null)
            sb.append("OperationId: ").append(getOperationId()).append(",");
        if (getRequest() != null)
            sb.append("Request: ").append(getRequest()).append(",");
        if (getResource() != null)
            sb.append("Resource: ").append(getResource()).append(",");
        if (getExecutionDetails() != null)
            sb.append("ExecutionDetails: ").append(getExecutionDetails()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetupHistory == false)
            return false;
        SetupHistory other = (SetupHistory) obj;
        if (other.getOperationId() == null ^ this.getOperationId() == null)
            return false;
        if (other.getOperationId() != null && other.getOperationId().equals(this.getOperationId()) == false)
            return false;
        if (other.getRequest() == null ^ this.getRequest() == null)
            return false;
        if (other.getRequest() != null && other.getRequest().equals(this.getRequest()) == false)
            return false;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getExecutionDetails() == null ^ this.getExecutionDetails() == null)
            return false;
        if (other.getExecutionDetails() != null && other.getExecutionDetails().equals(this.getExecutionDetails()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOperationId() == null) ? 0 : getOperationId().hashCode());
        hashCode = prime * hashCode + ((getRequest() == null) ? 0 : getRequest().hashCode());
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getExecutionDetails() == null) ? 0 : getExecutionDetails().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public SetupHistory clone() {
        try {
            return (SetupHistory) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.SetupHistoryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
