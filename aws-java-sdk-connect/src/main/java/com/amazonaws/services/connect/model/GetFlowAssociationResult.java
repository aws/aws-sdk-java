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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetFlowAssociation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFlowAssociationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the resource.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The identifier of the flow.
     * </p>
     */
    private String flowId;
    /**
     * <p>
     * A valid resource type.
     * </p>
     */
    private String resourceType;

    /**
     * <p>
     * The identifier of the resource.
     * </p>
     * 
     * @param resourceId
     *        The identifier of the resource.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The identifier of the resource.
     * </p>
     * 
     * @return The identifier of the resource.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The identifier of the resource.
     * </p>
     * 
     * @param resourceId
     *        The identifier of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFlowAssociationResult withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The identifier of the flow.
     * </p>
     * 
     * @param flowId
     *        The identifier of the flow.
     */

    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    /**
     * <p>
     * The identifier of the flow.
     * </p>
     * 
     * @return The identifier of the flow.
     */

    public String getFlowId() {
        return this.flowId;
    }

    /**
     * <p>
     * The identifier of the flow.
     * </p>
     * 
     * @param flowId
     *        The identifier of the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFlowAssociationResult withFlowId(String flowId) {
        setFlowId(flowId);
        return this;
    }

    /**
     * <p>
     * A valid resource type.
     * </p>
     * 
     * @param resourceType
     *        A valid resource type.
     * @see FlowAssociationResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * A valid resource type.
     * </p>
     * 
     * @return A valid resource type.
     * @see FlowAssociationResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * A valid resource type.
     * </p>
     * 
     * @param resourceType
     *        A valid resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlowAssociationResourceType
     */

    public GetFlowAssociationResult withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * A valid resource type.
     * </p>
     * 
     * @param resourceType
     *        A valid resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlowAssociationResourceType
     */

    public GetFlowAssociationResult withResourceType(FlowAssociationResourceType resourceType) {
        this.resourceType = resourceType.toString();
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
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getFlowId() != null)
            sb.append("FlowId: ").append(getFlowId()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFlowAssociationResult == false)
            return false;
        GetFlowAssociationResult other = (GetFlowAssociationResult) obj;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getFlowId() == null ^ this.getFlowId() == null)
            return false;
        if (other.getFlowId() != null && other.getFlowId().equals(this.getFlowId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getFlowId() == null) ? 0 : getFlowId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        return hashCode;
    }

    @Override
    public GetFlowAssociationResult clone() {
        try {
            return (GetFlowAssociationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
