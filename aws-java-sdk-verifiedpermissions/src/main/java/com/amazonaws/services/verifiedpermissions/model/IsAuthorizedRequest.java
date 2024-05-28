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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/IsAuthorized" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IsAuthorizedRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the ID of the policy store. Policies in this policy store will be used to make an authorization
     * decision for the input.
     * </p>
     */
    private String policyStoreId;
    /**
     * <p>
     * Specifies the principal for which the authorization decision is to be made.
     * </p>
     */
    private EntityIdentifier principal;
    /**
     * <p>
     * Specifies the requested action to be authorized. For example, is the principal authorized to perform this action
     * on the resource?
     * </p>
     */
    private ActionIdentifier action;
    /**
     * <p>
     * Specifies the resource for which the authorization decision is to be made.
     * </p>
     */
    private EntityIdentifier resource;
    /**
     * <p>
     * Specifies additional context that can be used to make more granular authorization decisions.
     * </p>
     */
    private ContextDefinition context;
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
     * Specifies the ID of the policy store. Policies in this policy store will be used to make an authorization
     * decision for the input.
     * </p>
     * 
     * @param policyStoreId
     *        Specifies the ID of the policy store. Policies in this policy store will be used to make an authorization
     *        decision for the input.
     */

    public void setPolicyStoreId(String policyStoreId) {
        this.policyStoreId = policyStoreId;
    }

    /**
     * <p>
     * Specifies the ID of the policy store. Policies in this policy store will be used to make an authorization
     * decision for the input.
     * </p>
     * 
     * @return Specifies the ID of the policy store. Policies in this policy store will be used to make an authorization
     *         decision for the input.
     */

    public String getPolicyStoreId() {
        return this.policyStoreId;
    }

    /**
     * <p>
     * Specifies the ID of the policy store. Policies in this policy store will be used to make an authorization
     * decision for the input.
     * </p>
     * 
     * @param policyStoreId
     *        Specifies the ID of the policy store. Policies in this policy store will be used to make an authorization
     *        decision for the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IsAuthorizedRequest withPolicyStoreId(String policyStoreId) {
        setPolicyStoreId(policyStoreId);
        return this;
    }

    /**
     * <p>
     * Specifies the principal for which the authorization decision is to be made.
     * </p>
     * 
     * @param principal
     *        Specifies the principal for which the authorization decision is to be made.
     */

    public void setPrincipal(EntityIdentifier principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * Specifies the principal for which the authorization decision is to be made.
     * </p>
     * 
     * @return Specifies the principal for which the authorization decision is to be made.
     */

    public EntityIdentifier getPrincipal() {
        return this.principal;
    }

    /**
     * <p>
     * Specifies the principal for which the authorization decision is to be made.
     * </p>
     * 
     * @param principal
     *        Specifies the principal for which the authorization decision is to be made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IsAuthorizedRequest withPrincipal(EntityIdentifier principal) {
        setPrincipal(principal);
        return this;
    }

    /**
     * <p>
     * Specifies the requested action to be authorized. For example, is the principal authorized to perform this action
     * on the resource?
     * </p>
     * 
     * @param action
     *        Specifies the requested action to be authorized. For example, is the principal authorized to perform this
     *        action on the resource?
     */

    public void setAction(ActionIdentifier action) {
        this.action = action;
    }

    /**
     * <p>
     * Specifies the requested action to be authorized. For example, is the principal authorized to perform this action
     * on the resource?
     * </p>
     * 
     * @return Specifies the requested action to be authorized. For example, is the principal authorized to perform this
     *         action on the resource?
     */

    public ActionIdentifier getAction() {
        return this.action;
    }

    /**
     * <p>
     * Specifies the requested action to be authorized. For example, is the principal authorized to perform this action
     * on the resource?
     * </p>
     * 
     * @param action
     *        Specifies the requested action to be authorized. For example, is the principal authorized to perform this
     *        action on the resource?
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IsAuthorizedRequest withAction(ActionIdentifier action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * Specifies the resource for which the authorization decision is to be made.
     * </p>
     * 
     * @param resource
     *        Specifies the resource for which the authorization decision is to be made.
     */

    public void setResource(EntityIdentifier resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * Specifies the resource for which the authorization decision is to be made.
     * </p>
     * 
     * @return Specifies the resource for which the authorization decision is to be made.
     */

    public EntityIdentifier getResource() {
        return this.resource;
    }

    /**
     * <p>
     * Specifies the resource for which the authorization decision is to be made.
     * </p>
     * 
     * @param resource
     *        Specifies the resource for which the authorization decision is to be made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IsAuthorizedRequest withResource(EntityIdentifier resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * Specifies additional context that can be used to make more granular authorization decisions.
     * </p>
     * 
     * @param context
     *        Specifies additional context that can be used to make more granular authorization decisions.
     */

    public void setContext(ContextDefinition context) {
        this.context = context;
    }

    /**
     * <p>
     * Specifies additional context that can be used to make more granular authorization decisions.
     * </p>
     * 
     * @return Specifies additional context that can be used to make more granular authorization decisions.
     */

    public ContextDefinition getContext() {
        return this.context;
    }

    /**
     * <p>
     * Specifies additional context that can be used to make more granular authorization decisions.
     * </p>
     * 
     * @param context
     *        Specifies additional context that can be used to make more granular authorization decisions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IsAuthorizedRequest withContext(ContextDefinition context) {
        setContext(context);
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

    public IsAuthorizedRequest withEntities(EntitiesDefinition entities) {
        setEntities(entities);
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
        if (getPrincipal() != null)
            sb.append("Principal: ").append(getPrincipal()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getResource() != null)
            sb.append("Resource: ").append(getResource()).append(",");
        if (getContext() != null)
            sb.append("Context: ").append(getContext()).append(",");
        if (getEntities() != null)
            sb.append("Entities: ").append(getEntities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IsAuthorizedRequest == false)
            return false;
        IsAuthorizedRequest other = (IsAuthorizedRequest) obj;
        if (other.getPolicyStoreId() == null ^ this.getPolicyStoreId() == null)
            return false;
        if (other.getPolicyStoreId() != null && other.getPolicyStoreId().equals(this.getPolicyStoreId()) == false)
            return false;
        if (other.getPrincipal() == null ^ this.getPrincipal() == null)
            return false;
        if (other.getPrincipal() != null && other.getPrincipal().equals(this.getPrincipal()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
        if (other.getContext() == null ^ this.getContext() == null)
            return false;
        if (other.getContext() != null && other.getContext().equals(this.getContext()) == false)
            return false;
        if (other.getEntities() == null ^ this.getEntities() == null)
            return false;
        if (other.getEntities() != null && other.getEntities().equals(this.getEntities()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyStoreId() == null) ? 0 : getPolicyStoreId().hashCode());
        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getContext() == null) ? 0 : getContext().hashCode());
        hashCode = prime * hashCode + ((getEntities() == null) ? 0 : getEntities().hashCode());
        return hashCode;
    }

    @Override
    public IsAuthorizedRequest clone() {
        return (IsAuthorizedRequest) super.clone();
    }

}
