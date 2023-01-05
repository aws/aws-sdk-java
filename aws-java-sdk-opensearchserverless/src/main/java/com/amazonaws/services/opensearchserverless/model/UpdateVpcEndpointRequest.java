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
package com.amazonaws.services.opensearchserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/UpdateVpcEndpoint"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateVpcEndpointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifiers of the security groups to add to the endpoint. Security groups define the ports,
     * protocols, and sources for inbound traffic that you are authorizing into your endpoint.
     * </p>
     */
    private java.util.List<String> addSecurityGroupIds;
    /**
     * <p>
     * The ID of one or more subnets to add to the endpoint.
     * </p>
     */
    private java.util.List<String> addSubnetIds;
    /**
     * <p>
     * Unique, case-sensitive identifier to ensure idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The unique identifier of the interface endpoint to update.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The unique identifiers of the security groups to remove from the endpoint.
     * </p>
     */
    private java.util.List<String> removeSecurityGroupIds;
    /**
     * <p>
     * The unique identifiers of the subnets to remove from the endpoint.
     * </p>
     */
    private java.util.List<String> removeSubnetIds;

    /**
     * <p>
     * The unique identifiers of the security groups to add to the endpoint. Security groups define the ports,
     * protocols, and sources for inbound traffic that you are authorizing into your endpoint.
     * </p>
     * 
     * @return The unique identifiers of the security groups to add to the endpoint. Security groups define the ports,
     *         protocols, and sources for inbound traffic that you are authorizing into your endpoint.
     */

    public java.util.List<String> getAddSecurityGroupIds() {
        return addSecurityGroupIds;
    }

    /**
     * <p>
     * The unique identifiers of the security groups to add to the endpoint. Security groups define the ports,
     * protocols, and sources for inbound traffic that you are authorizing into your endpoint.
     * </p>
     * 
     * @param addSecurityGroupIds
     *        The unique identifiers of the security groups to add to the endpoint. Security groups define the ports,
     *        protocols, and sources for inbound traffic that you are authorizing into your endpoint.
     */

    public void setAddSecurityGroupIds(java.util.Collection<String> addSecurityGroupIds) {
        if (addSecurityGroupIds == null) {
            this.addSecurityGroupIds = null;
            return;
        }

        this.addSecurityGroupIds = new java.util.ArrayList<String>(addSecurityGroupIds);
    }

    /**
     * <p>
     * The unique identifiers of the security groups to add to the endpoint. Security groups define the ports,
     * protocols, and sources for inbound traffic that you are authorizing into your endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddSecurityGroupIds(java.util.Collection)} or {@link #withAddSecurityGroupIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param addSecurityGroupIds
     *        The unique identifiers of the security groups to add to the endpoint. Security groups define the ports,
     *        protocols, and sources for inbound traffic that you are authorizing into your endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVpcEndpointRequest withAddSecurityGroupIds(String... addSecurityGroupIds) {
        if (this.addSecurityGroupIds == null) {
            setAddSecurityGroupIds(new java.util.ArrayList<String>(addSecurityGroupIds.length));
        }
        for (String ele : addSecurityGroupIds) {
            this.addSecurityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The unique identifiers of the security groups to add to the endpoint. Security groups define the ports,
     * protocols, and sources for inbound traffic that you are authorizing into your endpoint.
     * </p>
     * 
     * @param addSecurityGroupIds
     *        The unique identifiers of the security groups to add to the endpoint. Security groups define the ports,
     *        protocols, and sources for inbound traffic that you are authorizing into your endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVpcEndpointRequest withAddSecurityGroupIds(java.util.Collection<String> addSecurityGroupIds) {
        setAddSecurityGroupIds(addSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * The ID of one or more subnets to add to the endpoint.
     * </p>
     * 
     * @return The ID of one or more subnets to add to the endpoint.
     */

    public java.util.List<String> getAddSubnetIds() {
        return addSubnetIds;
    }

    /**
     * <p>
     * The ID of one or more subnets to add to the endpoint.
     * </p>
     * 
     * @param addSubnetIds
     *        The ID of one or more subnets to add to the endpoint.
     */

    public void setAddSubnetIds(java.util.Collection<String> addSubnetIds) {
        if (addSubnetIds == null) {
            this.addSubnetIds = null;
            return;
        }

        this.addSubnetIds = new java.util.ArrayList<String>(addSubnetIds);
    }

    /**
     * <p>
     * The ID of one or more subnets to add to the endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddSubnetIds(java.util.Collection)} or {@link #withAddSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param addSubnetIds
     *        The ID of one or more subnets to add to the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVpcEndpointRequest withAddSubnetIds(String... addSubnetIds) {
        if (this.addSubnetIds == null) {
            setAddSubnetIds(new java.util.ArrayList<String>(addSubnetIds.length));
        }
        for (String ele : addSubnetIds) {
            this.addSubnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ID of one or more subnets to add to the endpoint.
     * </p>
     * 
     * @param addSubnetIds
     *        The ID of one or more subnets to add to the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVpcEndpointRequest withAddSubnetIds(java.util.Collection<String> addSubnetIds) {
        setAddSubnetIds(addSubnetIds);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier to ensure idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier to ensure idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier to ensure idempotency of the request.
     * </p>
     * 
     * @return Unique, case-sensitive identifier to ensure idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier to ensure idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier to ensure idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVpcEndpointRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the interface endpoint to update.
     * </p>
     * 
     * @param id
     *        The unique identifier of the interface endpoint to update.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier of the interface endpoint to update.
     * </p>
     * 
     * @return The unique identifier of the interface endpoint to update.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier of the interface endpoint to update.
     * </p>
     * 
     * @param id
     *        The unique identifier of the interface endpoint to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVpcEndpointRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The unique identifiers of the security groups to remove from the endpoint.
     * </p>
     * 
     * @return The unique identifiers of the security groups to remove from the endpoint.
     */

    public java.util.List<String> getRemoveSecurityGroupIds() {
        return removeSecurityGroupIds;
    }

    /**
     * <p>
     * The unique identifiers of the security groups to remove from the endpoint.
     * </p>
     * 
     * @param removeSecurityGroupIds
     *        The unique identifiers of the security groups to remove from the endpoint.
     */

    public void setRemoveSecurityGroupIds(java.util.Collection<String> removeSecurityGroupIds) {
        if (removeSecurityGroupIds == null) {
            this.removeSecurityGroupIds = null;
            return;
        }

        this.removeSecurityGroupIds = new java.util.ArrayList<String>(removeSecurityGroupIds);
    }

    /**
     * <p>
     * The unique identifiers of the security groups to remove from the endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemoveSecurityGroupIds(java.util.Collection)} or
     * {@link #withRemoveSecurityGroupIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param removeSecurityGroupIds
     *        The unique identifiers of the security groups to remove from the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVpcEndpointRequest withRemoveSecurityGroupIds(String... removeSecurityGroupIds) {
        if (this.removeSecurityGroupIds == null) {
            setRemoveSecurityGroupIds(new java.util.ArrayList<String>(removeSecurityGroupIds.length));
        }
        for (String ele : removeSecurityGroupIds) {
            this.removeSecurityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The unique identifiers of the security groups to remove from the endpoint.
     * </p>
     * 
     * @param removeSecurityGroupIds
     *        The unique identifiers of the security groups to remove from the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVpcEndpointRequest withRemoveSecurityGroupIds(java.util.Collection<String> removeSecurityGroupIds) {
        setRemoveSecurityGroupIds(removeSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * The unique identifiers of the subnets to remove from the endpoint.
     * </p>
     * 
     * @return The unique identifiers of the subnets to remove from the endpoint.
     */

    public java.util.List<String> getRemoveSubnetIds() {
        return removeSubnetIds;
    }

    /**
     * <p>
     * The unique identifiers of the subnets to remove from the endpoint.
     * </p>
     * 
     * @param removeSubnetIds
     *        The unique identifiers of the subnets to remove from the endpoint.
     */

    public void setRemoveSubnetIds(java.util.Collection<String> removeSubnetIds) {
        if (removeSubnetIds == null) {
            this.removeSubnetIds = null;
            return;
        }

        this.removeSubnetIds = new java.util.ArrayList<String>(removeSubnetIds);
    }

    /**
     * <p>
     * The unique identifiers of the subnets to remove from the endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemoveSubnetIds(java.util.Collection)} or {@link #withRemoveSubnetIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param removeSubnetIds
     *        The unique identifiers of the subnets to remove from the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVpcEndpointRequest withRemoveSubnetIds(String... removeSubnetIds) {
        if (this.removeSubnetIds == null) {
            setRemoveSubnetIds(new java.util.ArrayList<String>(removeSubnetIds.length));
        }
        for (String ele : removeSubnetIds) {
            this.removeSubnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The unique identifiers of the subnets to remove from the endpoint.
     * </p>
     * 
     * @param removeSubnetIds
     *        The unique identifiers of the subnets to remove from the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVpcEndpointRequest withRemoveSubnetIds(java.util.Collection<String> removeSubnetIds) {
        setRemoveSubnetIds(removeSubnetIds);
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
        if (getAddSecurityGroupIds() != null)
            sb.append("AddSecurityGroupIds: ").append(getAddSecurityGroupIds()).append(",");
        if (getAddSubnetIds() != null)
            sb.append("AddSubnetIds: ").append(getAddSubnetIds()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getRemoveSecurityGroupIds() != null)
            sb.append("RemoveSecurityGroupIds: ").append(getRemoveSecurityGroupIds()).append(",");
        if (getRemoveSubnetIds() != null)
            sb.append("RemoveSubnetIds: ").append(getRemoveSubnetIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateVpcEndpointRequest == false)
            return false;
        UpdateVpcEndpointRequest other = (UpdateVpcEndpointRequest) obj;
        if (other.getAddSecurityGroupIds() == null ^ this.getAddSecurityGroupIds() == null)
            return false;
        if (other.getAddSecurityGroupIds() != null && other.getAddSecurityGroupIds().equals(this.getAddSecurityGroupIds()) == false)
            return false;
        if (other.getAddSubnetIds() == null ^ this.getAddSubnetIds() == null)
            return false;
        if (other.getAddSubnetIds() != null && other.getAddSubnetIds().equals(this.getAddSubnetIds()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getRemoveSecurityGroupIds() == null ^ this.getRemoveSecurityGroupIds() == null)
            return false;
        if (other.getRemoveSecurityGroupIds() != null && other.getRemoveSecurityGroupIds().equals(this.getRemoveSecurityGroupIds()) == false)
            return false;
        if (other.getRemoveSubnetIds() == null ^ this.getRemoveSubnetIds() == null)
            return false;
        if (other.getRemoveSubnetIds() != null && other.getRemoveSubnetIds().equals(this.getRemoveSubnetIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddSecurityGroupIds() == null) ? 0 : getAddSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getAddSubnetIds() == null) ? 0 : getAddSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getRemoveSecurityGroupIds() == null) ? 0 : getRemoveSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getRemoveSubnetIds() == null) ? 0 : getRemoveSubnetIds().hashCode());
        return hashCode;
    }

    @Override
    public UpdateVpcEndpointRequest clone() {
        return (UpdateVpcEndpointRequest) super.clone();
    }

}
