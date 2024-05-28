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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/verifiedpermissions-2021-12-01/IsAuthorizedWithToken"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IsAuthorizedWithTokenRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the ID of the policy store. Policies in this policy store will be used to make an authorization
     * decision for the input.
     * </p>
     */
    private String policyStoreId;
    /**
     * <p>
     * Specifies an identity token for the principal to be authorized. This token is provided to you by the identity
     * provider (IdP) associated with the specified identity source. You must specify either an <code>accessToken</code>
     * , an <code>identityToken</code>, or both.
     * </p>
     * <p>
     * Must be an ID token. Verified Permissions returns an error if the <code>token_use</code> claim in the submitted
     * token isn't <code>id</code>.
     * </p>
     */
    private String identityToken;
    /**
     * <p>
     * Specifies an access token for the principal to be authorized. This token is provided to you by the identity
     * provider (IdP) associated with the specified identity source. You must specify either an <code>accessToken</code>
     * , an <code>identityToken</code>, or both.
     * </p>
     * <p>
     * Must be an access token. Verified Permissions returns an error if the <code>token_use</code> claim in the
     * submitted token isn't <code>access</code>.
     * </p>
     */
    private String accessToken;
    /**
     * <p>
     * Specifies the requested action to be authorized. Is the specified principal authorized to perform this action on
     * the specified resource.
     * </p>
     */
    private ActionIdentifier action;
    /**
     * <p>
     * Specifies the resource for which the authorization decision is made. For example, is the principal allowed to
     * perform the action on the resource?
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
     * Specifies the list of resources and their associated attributes that Verified Permissions can examine when
     * evaluating the policies.
     * </p>
     * <important>
     * <p>
     * You can't include principals in this parameter, only resource and action entities. This parameter can't include
     * any entities of a type that matches the user or group entity types that you defined in your identity source.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>IsAuthorizedWithToken</code> operation takes principal attributes from <b> <i>only</i> </b> the
     * <code>identityToken</code> or <code>accessToken</code> passed to the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * For action entities, you can include only their <code>Identifier</code> and <code>EntityType</code>.
     * </p>
     * </li>
     * </ul>
     * </important>
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

    public IsAuthorizedWithTokenRequest withPolicyStoreId(String policyStoreId) {
        setPolicyStoreId(policyStoreId);
        return this;
    }

    /**
     * <p>
     * Specifies an identity token for the principal to be authorized. This token is provided to you by the identity
     * provider (IdP) associated with the specified identity source. You must specify either an <code>accessToken</code>
     * , an <code>identityToken</code>, or both.
     * </p>
     * <p>
     * Must be an ID token. Verified Permissions returns an error if the <code>token_use</code> claim in the submitted
     * token isn't <code>id</code>.
     * </p>
     * 
     * @param identityToken
     *        Specifies an identity token for the principal to be authorized. This token is provided to you by the
     *        identity provider (IdP) associated with the specified identity source. You must specify either an
     *        <code>accessToken</code>, an <code>identityToken</code>, or both.</p>
     *        <p>
     *        Must be an ID token. Verified Permissions returns an error if the <code>token_use</code> claim in the
     *        submitted token isn't <code>id</code>.
     */

    public void setIdentityToken(String identityToken) {
        this.identityToken = identityToken;
    }

    /**
     * <p>
     * Specifies an identity token for the principal to be authorized. This token is provided to you by the identity
     * provider (IdP) associated with the specified identity source. You must specify either an <code>accessToken</code>
     * , an <code>identityToken</code>, or both.
     * </p>
     * <p>
     * Must be an ID token. Verified Permissions returns an error if the <code>token_use</code> claim in the submitted
     * token isn't <code>id</code>.
     * </p>
     * 
     * @return Specifies an identity token for the principal to be authorized. This token is provided to you by the
     *         identity provider (IdP) associated with the specified identity source. You must specify either an
     *         <code>accessToken</code>, an <code>identityToken</code>, or both.</p>
     *         <p>
     *         Must be an ID token. Verified Permissions returns an error if the <code>token_use</code> claim in the
     *         submitted token isn't <code>id</code>.
     */

    public String getIdentityToken() {
        return this.identityToken;
    }

    /**
     * <p>
     * Specifies an identity token for the principal to be authorized. This token is provided to you by the identity
     * provider (IdP) associated with the specified identity source. You must specify either an <code>accessToken</code>
     * , an <code>identityToken</code>, or both.
     * </p>
     * <p>
     * Must be an ID token. Verified Permissions returns an error if the <code>token_use</code> claim in the submitted
     * token isn't <code>id</code>.
     * </p>
     * 
     * @param identityToken
     *        Specifies an identity token for the principal to be authorized. This token is provided to you by the
     *        identity provider (IdP) associated with the specified identity source. You must specify either an
     *        <code>accessToken</code>, an <code>identityToken</code>, or both.</p>
     *        <p>
     *        Must be an ID token. Verified Permissions returns an error if the <code>token_use</code> claim in the
     *        submitted token isn't <code>id</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IsAuthorizedWithTokenRequest withIdentityToken(String identityToken) {
        setIdentityToken(identityToken);
        return this;
    }

    /**
     * <p>
     * Specifies an access token for the principal to be authorized. This token is provided to you by the identity
     * provider (IdP) associated with the specified identity source. You must specify either an <code>accessToken</code>
     * , an <code>identityToken</code>, or both.
     * </p>
     * <p>
     * Must be an access token. Verified Permissions returns an error if the <code>token_use</code> claim in the
     * submitted token isn't <code>access</code>.
     * </p>
     * 
     * @param accessToken
     *        Specifies an access token for the principal to be authorized. This token is provided to you by the
     *        identity provider (IdP) associated with the specified identity source. You must specify either an
     *        <code>accessToken</code>, an <code>identityToken</code>, or both.</p>
     *        <p>
     *        Must be an access token. Verified Permissions returns an error if the <code>token_use</code> claim in the
     *        submitted token isn't <code>access</code>.
     */

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * <p>
     * Specifies an access token for the principal to be authorized. This token is provided to you by the identity
     * provider (IdP) associated with the specified identity source. You must specify either an <code>accessToken</code>
     * , an <code>identityToken</code>, or both.
     * </p>
     * <p>
     * Must be an access token. Verified Permissions returns an error if the <code>token_use</code> claim in the
     * submitted token isn't <code>access</code>.
     * </p>
     * 
     * @return Specifies an access token for the principal to be authorized. This token is provided to you by the
     *         identity provider (IdP) associated with the specified identity source. You must specify either an
     *         <code>accessToken</code>, an <code>identityToken</code>, or both.</p>
     *         <p>
     *         Must be an access token. Verified Permissions returns an error if the <code>token_use</code> claim in the
     *         submitted token isn't <code>access</code>.
     */

    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * <p>
     * Specifies an access token for the principal to be authorized. This token is provided to you by the identity
     * provider (IdP) associated with the specified identity source. You must specify either an <code>accessToken</code>
     * , an <code>identityToken</code>, or both.
     * </p>
     * <p>
     * Must be an access token. Verified Permissions returns an error if the <code>token_use</code> claim in the
     * submitted token isn't <code>access</code>.
     * </p>
     * 
     * @param accessToken
     *        Specifies an access token for the principal to be authorized. This token is provided to you by the
     *        identity provider (IdP) associated with the specified identity source. You must specify either an
     *        <code>accessToken</code>, an <code>identityToken</code>, or both.</p>
     *        <p>
     *        Must be an access token. Verified Permissions returns an error if the <code>token_use</code> claim in the
     *        submitted token isn't <code>access</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IsAuthorizedWithTokenRequest withAccessToken(String accessToken) {
        setAccessToken(accessToken);
        return this;
    }

    /**
     * <p>
     * Specifies the requested action to be authorized. Is the specified principal authorized to perform this action on
     * the specified resource.
     * </p>
     * 
     * @param action
     *        Specifies the requested action to be authorized. Is the specified principal authorized to perform this
     *        action on the specified resource.
     */

    public void setAction(ActionIdentifier action) {
        this.action = action;
    }

    /**
     * <p>
     * Specifies the requested action to be authorized. Is the specified principal authorized to perform this action on
     * the specified resource.
     * </p>
     * 
     * @return Specifies the requested action to be authorized. Is the specified principal authorized to perform this
     *         action on the specified resource.
     */

    public ActionIdentifier getAction() {
        return this.action;
    }

    /**
     * <p>
     * Specifies the requested action to be authorized. Is the specified principal authorized to perform this action on
     * the specified resource.
     * </p>
     * 
     * @param action
     *        Specifies the requested action to be authorized. Is the specified principal authorized to perform this
     *        action on the specified resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IsAuthorizedWithTokenRequest withAction(ActionIdentifier action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * Specifies the resource for which the authorization decision is made. For example, is the principal allowed to
     * perform the action on the resource?
     * </p>
     * 
     * @param resource
     *        Specifies the resource for which the authorization decision is made. For example, is the principal allowed
     *        to perform the action on the resource?
     */

    public void setResource(EntityIdentifier resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * Specifies the resource for which the authorization decision is made. For example, is the principal allowed to
     * perform the action on the resource?
     * </p>
     * 
     * @return Specifies the resource for which the authorization decision is made. For example, is the principal
     *         allowed to perform the action on the resource?
     */

    public EntityIdentifier getResource() {
        return this.resource;
    }

    /**
     * <p>
     * Specifies the resource for which the authorization decision is made. For example, is the principal allowed to
     * perform the action on the resource?
     * </p>
     * 
     * @param resource
     *        Specifies the resource for which the authorization decision is made. For example, is the principal allowed
     *        to perform the action on the resource?
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IsAuthorizedWithTokenRequest withResource(EntityIdentifier resource) {
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

    public IsAuthorizedWithTokenRequest withContext(ContextDefinition context) {
        setContext(context);
        return this;
    }

    /**
     * <p>
     * Specifies the list of resources and their associated attributes that Verified Permissions can examine when
     * evaluating the policies.
     * </p>
     * <important>
     * <p>
     * You can't include principals in this parameter, only resource and action entities. This parameter can't include
     * any entities of a type that matches the user or group entity types that you defined in your identity source.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>IsAuthorizedWithToken</code> operation takes principal attributes from <b> <i>only</i> </b> the
     * <code>identityToken</code> or <code>accessToken</code> passed to the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * For action entities, you can include only their <code>Identifier</code> and <code>EntityType</code>.
     * </p>
     * </li>
     * </ul>
     * </important>
     * 
     * @param entities
     *        Specifies the list of resources and their associated attributes that Verified Permissions can examine when
     *        evaluating the policies. </p> <important>
     *        <p>
     *        You can't include principals in this parameter, only resource and action entities. This parameter can't
     *        include any entities of a type that matches the user or group entity types that you defined in your
     *        identity source.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The <code>IsAuthorizedWithToken</code> operation takes principal attributes from <b> <i>only</i> </b> the
     *        <code>identityToken</code> or <code>accessToken</code> passed to the operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For action entities, you can include only their <code>Identifier</code> and <code>EntityType</code>.
     *        </p>
     *        </li>
     *        </ul>
     */

    public void setEntities(EntitiesDefinition entities) {
        this.entities = entities;
    }

    /**
     * <p>
     * Specifies the list of resources and their associated attributes that Verified Permissions can examine when
     * evaluating the policies.
     * </p>
     * <important>
     * <p>
     * You can't include principals in this parameter, only resource and action entities. This parameter can't include
     * any entities of a type that matches the user or group entity types that you defined in your identity source.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>IsAuthorizedWithToken</code> operation takes principal attributes from <b> <i>only</i> </b> the
     * <code>identityToken</code> or <code>accessToken</code> passed to the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * For action entities, you can include only their <code>Identifier</code> and <code>EntityType</code>.
     * </p>
     * </li>
     * </ul>
     * </important>
     * 
     * @return Specifies the list of resources and their associated attributes that Verified Permissions can examine
     *         when evaluating the policies. </p> <important>
     *         <p>
     *         You can't include principals in this parameter, only resource and action entities. This parameter can't
     *         include any entities of a type that matches the user or group entity types that you defined in your
     *         identity source.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The <code>IsAuthorizedWithToken</code> operation takes principal attributes from <b> <i>only</i> </b> the
     *         <code>identityToken</code> or <code>accessToken</code> passed to the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For action entities, you can include only their <code>Identifier</code> and <code>EntityType</code>.
     *         </p>
     *         </li>
     *         </ul>
     */

    public EntitiesDefinition getEntities() {
        return this.entities;
    }

    /**
     * <p>
     * Specifies the list of resources and their associated attributes that Verified Permissions can examine when
     * evaluating the policies.
     * </p>
     * <important>
     * <p>
     * You can't include principals in this parameter, only resource and action entities. This parameter can't include
     * any entities of a type that matches the user or group entity types that you defined in your identity source.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>IsAuthorizedWithToken</code> operation takes principal attributes from <b> <i>only</i> </b> the
     * <code>identityToken</code> or <code>accessToken</code> passed to the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * For action entities, you can include only their <code>Identifier</code> and <code>EntityType</code>.
     * </p>
     * </li>
     * </ul>
     * </important>
     * 
     * @param entities
     *        Specifies the list of resources and their associated attributes that Verified Permissions can examine when
     *        evaluating the policies. </p> <important>
     *        <p>
     *        You can't include principals in this parameter, only resource and action entities. This parameter can't
     *        include any entities of a type that matches the user or group entity types that you defined in your
     *        identity source.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The <code>IsAuthorizedWithToken</code> operation takes principal attributes from <b> <i>only</i> </b> the
     *        <code>identityToken</code> or <code>accessToken</code> passed to the operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For action entities, you can include only their <code>Identifier</code> and <code>EntityType</code>.
     *        </p>
     *        </li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IsAuthorizedWithTokenRequest withEntities(EntitiesDefinition entities) {
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
        if (getIdentityToken() != null)
            sb.append("IdentityToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getAccessToken() != null)
            sb.append("AccessToken: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof IsAuthorizedWithTokenRequest == false)
            return false;
        IsAuthorizedWithTokenRequest other = (IsAuthorizedWithTokenRequest) obj;
        if (other.getPolicyStoreId() == null ^ this.getPolicyStoreId() == null)
            return false;
        if (other.getPolicyStoreId() != null && other.getPolicyStoreId().equals(this.getPolicyStoreId()) == false)
            return false;
        if (other.getIdentityToken() == null ^ this.getIdentityToken() == null)
            return false;
        if (other.getIdentityToken() != null && other.getIdentityToken().equals(this.getIdentityToken()) == false)
            return false;
        if (other.getAccessToken() == null ^ this.getAccessToken() == null)
            return false;
        if (other.getAccessToken() != null && other.getAccessToken().equals(this.getAccessToken()) == false)
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
        hashCode = prime * hashCode + ((getIdentityToken() == null) ? 0 : getIdentityToken().hashCode());
        hashCode = prime * hashCode + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getContext() == null) ? 0 : getContext().hashCode());
        hashCode = prime * hashCode + ((getEntities() == null) ? 0 : getEntities().hashCode());
        return hashCode;
    }

    @Override
    public IsAuthorizedWithTokenRequest clone() {
        return (IsAuthorizedWithTokenRequest) super.clone();
    }

}
