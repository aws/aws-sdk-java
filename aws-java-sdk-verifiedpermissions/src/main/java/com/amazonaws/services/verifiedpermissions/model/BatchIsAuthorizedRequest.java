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
package com.amazonaws.services.verifiedpermissions.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/BatchIsAuthorized"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchIsAuthorizedRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the ID of the policy store. Policies in this policy store will be used to make the authorization
     * decisions for the input.
     * </p>
     */
    private String policyStoreId;
    /**
     * <p>
     * Specifies the list of resources and principals and their associated attributes that Verified Permissions can
     * examine when evaluating the policies.
     * </p>
     * <note>
     * <p>
     * You can include only principal and resource entities in this parameter; you can't include actions. You must
     * specify actions in the schema.
     * </p>
     * </note>
     */
    private EntitiesDefinition entities;
    /**
     * <p>
     * An array of up to 30 requests that you want Verified Permissions to evaluate.
     * </p>
     */
    private java.util.List<BatchIsAuthorizedInputItem> requests;

    /**
     * <p>
     * Specifies the ID of the policy store. Policies in this policy store will be used to make the authorization
     * decisions for the input.
     * </p>
     * 
     * @param policyStoreId
     *        Specifies the ID of the policy store. Policies in this policy store will be used to make the authorization
     *        decisions for the input.
     */

    public void setPolicyStoreId(String policyStoreId) {
        this.policyStoreId = policyStoreId;
    }

    /**
     * <p>
     * Specifies the ID of the policy store. Policies in this policy store will be used to make the authorization
     * decisions for the input.
     * </p>
     * 
     * @return Specifies the ID of the policy store. Policies in this policy store will be used to make the
     *         authorization decisions for the input.
     */

    public String getPolicyStoreId() {
        return this.policyStoreId;
    }

    /**
     * <p>
     * Specifies the ID of the policy store. Policies in this policy store will be used to make the authorization
     * decisions for the input.
     * </p>
     * 
     * @param policyStoreId
     *        Specifies the ID of the policy store. Policies in this policy store will be used to make the authorization
     *        decisions for the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchIsAuthorizedRequest withPolicyStoreId(String policyStoreId) {
        setPolicyStoreId(policyStoreId);
        return this;
    }

    /**
     * <p>
     * Specifies the list of resources and principals and their associated attributes that Verified Permissions can
     * examine when evaluating the policies.
     * </p>
     * <note>
     * <p>
     * You can include only principal and resource entities in this parameter; you can't include actions. You must
     * specify actions in the schema.
     * </p>
     * </note>
     * 
     * @param entities
     *        Specifies the list of resources and principals and their associated attributes that Verified Permissions
     *        can examine when evaluating the policies. </p> <note>
     *        <p>
     *        You can include only principal and resource entities in this parameter; you can't include actions. You
     *        must specify actions in the schema.
     *        </p>
     */

    public void setEntities(EntitiesDefinition entities) {
        this.entities = entities;
    }

    /**
     * <p>
     * Specifies the list of resources and principals and their associated attributes that Verified Permissions can
     * examine when evaluating the policies.
     * </p>
     * <note>
     * <p>
     * You can include only principal and resource entities in this parameter; you can't include actions. You must
     * specify actions in the schema.
     * </p>
     * </note>
     * 
     * @return Specifies the list of resources and principals and their associated attributes that Verified Permissions
     *         can examine when evaluating the policies. </p> <note>
     *         <p>
     *         You can include only principal and resource entities in this parameter; you can't include actions. You
     *         must specify actions in the schema.
     *         </p>
     */

    public EntitiesDefinition getEntities() {
        return this.entities;
    }

    /**
     * <p>
     * Specifies the list of resources and principals and their associated attributes that Verified Permissions can
     * examine when evaluating the policies.
     * </p>
     * <note>
     * <p>
     * You can include only principal and resource entities in this parameter; you can't include actions. You must
     * specify actions in the schema.
     * </p>
     * </note>
     * 
     * @param entities
     *        Specifies the list of resources and principals and their associated attributes that Verified Permissions
     *        can examine when evaluating the policies. </p> <note>
     *        <p>
     *        You can include only principal and resource entities in this parameter; you can't include actions. You
     *        must specify actions in the schema.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchIsAuthorizedRequest withEntities(EntitiesDefinition entities) {
        setEntities(entities);
        return this;
    }

    /**
     * <p>
     * An array of up to 30 requests that you want Verified Permissions to evaluate.
     * </p>
     * 
     * @return An array of up to 30 requests that you want Verified Permissions to evaluate.
     */

    public java.util.List<BatchIsAuthorizedInputItem> getRequests() {
        return requests;
    }

    /**
     * <p>
     * An array of up to 30 requests that you want Verified Permissions to evaluate.
     * </p>
     * 
     * @param requests
     *        An array of up to 30 requests that you want Verified Permissions to evaluate.
     */

    public void setRequests(java.util.Collection<BatchIsAuthorizedInputItem> requests) {
        if (requests == null) {
            this.requests = null;
            return;
        }

        this.requests = new java.util.ArrayList<BatchIsAuthorizedInputItem>(requests);
    }

    /**
     * <p>
     * An array of up to 30 requests that you want Verified Permissions to evaluate.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRequests(java.util.Collection)} or {@link #withRequests(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param requests
     *        An array of up to 30 requests that you want Verified Permissions to evaluate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchIsAuthorizedRequest withRequests(BatchIsAuthorizedInputItem... requests) {
        if (this.requests == null) {
            setRequests(new java.util.ArrayList<BatchIsAuthorizedInputItem>(requests.length));
        }
        for (BatchIsAuthorizedInputItem ele : requests) {
            this.requests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of up to 30 requests that you want Verified Permissions to evaluate.
     * </p>
     * 
     * @param requests
     *        An array of up to 30 requests that you want Verified Permissions to evaluate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchIsAuthorizedRequest withRequests(java.util.Collection<BatchIsAuthorizedInputItem> requests) {
        setRequests(requests);
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
        if (getPolicyStoreId() != null)
            sb.append("PolicyStoreId: ").append(getPolicyStoreId()).append(",");
        if (getEntities() != null)
            sb.append("Entities: ").append(getEntities()).append(",");
        if (getRequests() != null)
            sb.append("Requests: ").append(getRequests());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchIsAuthorizedRequest == false)
            return false;
        BatchIsAuthorizedRequest other = (BatchIsAuthorizedRequest) obj;
        if (other.getPolicyStoreId() == null ^ this.getPolicyStoreId() == null)
            return false;
        if (other.getPolicyStoreId() != null && other.getPolicyStoreId().equals(this.getPolicyStoreId()) == false)
            return false;
        if (other.getEntities() == null ^ this.getEntities() == null)
            return false;
        if (other.getEntities() != null && other.getEntities().equals(this.getEntities()) == false)
            return false;
        if (other.getRequests() == null ^ this.getRequests() == null)
            return false;
        if (other.getRequests() != null && other.getRequests().equals(this.getRequests()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyStoreId() == null) ? 0 : getPolicyStoreId().hashCode());
        hashCode = prime * hashCode + ((getEntities() == null) ? 0 : getEntities().hashCode());
        hashCode = prime * hashCode + ((getRequests() == null) ? 0 : getRequests().hashCode());
        return hashCode;
    }

    @Override
    public BatchIsAuthorizedRequest clone() {
        return (BatchIsAuthorizedRequest) super.clone();
    }

}
