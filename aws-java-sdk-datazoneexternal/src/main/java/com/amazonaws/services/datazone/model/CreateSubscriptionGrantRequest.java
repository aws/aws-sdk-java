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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateSubscriptionGrant" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSubscriptionGrantRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The names of the assets for which the subscription grant is created.
     * </p>
     */
    private java.util.List<AssetTargetNameMap> assetTargetNames;
    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the subscription grant is created.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * The ID of the environment in which the subscription grant is created.
     * </p>
     */
    private String environmentIdentifier;
    /**
     * <p>
     * The entity to which the subscription is to be granted.
     * </p>
     */
    private GrantedEntityInput grantedEntity;
    /**
     * <p>
     * The ID of the subscription target for which the subscription grant is created.
     * </p>
     */
    private String subscriptionTargetIdentifier;

    /**
     * <p>
     * The names of the assets for which the subscription grant is created.
     * </p>
     * 
     * @return The names of the assets for which the subscription grant is created.
     */

    public java.util.List<AssetTargetNameMap> getAssetTargetNames() {
        return assetTargetNames;
    }

    /**
     * <p>
     * The names of the assets for which the subscription grant is created.
     * </p>
     * 
     * @param assetTargetNames
     *        The names of the assets for which the subscription grant is created.
     */

    public void setAssetTargetNames(java.util.Collection<AssetTargetNameMap> assetTargetNames) {
        if (assetTargetNames == null) {
            this.assetTargetNames = null;
            return;
        }

        this.assetTargetNames = new java.util.ArrayList<AssetTargetNameMap>(assetTargetNames);
    }

    /**
     * <p>
     * The names of the assets for which the subscription grant is created.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssetTargetNames(java.util.Collection)} or {@link #withAssetTargetNames(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param assetTargetNames
     *        The names of the assets for which the subscription grant is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionGrantRequest withAssetTargetNames(AssetTargetNameMap... assetTargetNames) {
        if (this.assetTargetNames == null) {
            setAssetTargetNames(new java.util.ArrayList<AssetTargetNameMap>(assetTargetNames.length));
        }
        for (AssetTargetNameMap ele : assetTargetNames) {
            this.assetTargetNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the assets for which the subscription grant is created.
     * </p>
     * 
     * @param assetTargetNames
     *        The names of the assets for which the subscription grant is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionGrantRequest withAssetTargetNames(java.util.Collection<AssetTargetNameMap> assetTargetNames) {
        setAssetTargetNames(assetTargetNames);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionGrantRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the subscription grant is created.
     * </p>
     * 
     * @param domainIdentifier
     *        The ID of the Amazon DataZone domain in which the subscription grant is created.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the subscription grant is created.
     * </p>
     * 
     * @return The ID of the Amazon DataZone domain in which the subscription grant is created.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the subscription grant is created.
     * </p>
     * 
     * @param domainIdentifier
     *        The ID of the Amazon DataZone domain in which the subscription grant is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionGrantRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The ID of the environment in which the subscription grant is created.
     * </p>
     * 
     * @param environmentIdentifier
     *        The ID of the environment in which the subscription grant is created.
     */

    public void setEnvironmentIdentifier(String environmentIdentifier) {
        this.environmentIdentifier = environmentIdentifier;
    }

    /**
     * <p>
     * The ID of the environment in which the subscription grant is created.
     * </p>
     * 
     * @return The ID of the environment in which the subscription grant is created.
     */

    public String getEnvironmentIdentifier() {
        return this.environmentIdentifier;
    }

    /**
     * <p>
     * The ID of the environment in which the subscription grant is created.
     * </p>
     * 
     * @param environmentIdentifier
     *        The ID of the environment in which the subscription grant is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionGrantRequest withEnvironmentIdentifier(String environmentIdentifier) {
        setEnvironmentIdentifier(environmentIdentifier);
        return this;
    }

    /**
     * <p>
     * The entity to which the subscription is to be granted.
     * </p>
     * 
     * @param grantedEntity
     *        The entity to which the subscription is to be granted.
     */

    public void setGrantedEntity(GrantedEntityInput grantedEntity) {
        this.grantedEntity = grantedEntity;
    }

    /**
     * <p>
     * The entity to which the subscription is to be granted.
     * </p>
     * 
     * @return The entity to which the subscription is to be granted.
     */

    public GrantedEntityInput getGrantedEntity() {
        return this.grantedEntity;
    }

    /**
     * <p>
     * The entity to which the subscription is to be granted.
     * </p>
     * 
     * @param grantedEntity
     *        The entity to which the subscription is to be granted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionGrantRequest withGrantedEntity(GrantedEntityInput grantedEntity) {
        setGrantedEntity(grantedEntity);
        return this;
    }

    /**
     * <p>
     * The ID of the subscription target for which the subscription grant is created.
     * </p>
     * 
     * @param subscriptionTargetIdentifier
     *        The ID of the subscription target for which the subscription grant is created.
     */

    public void setSubscriptionTargetIdentifier(String subscriptionTargetIdentifier) {
        this.subscriptionTargetIdentifier = subscriptionTargetIdentifier;
    }

    /**
     * <p>
     * The ID of the subscription target for which the subscription grant is created.
     * </p>
     * 
     * @return The ID of the subscription target for which the subscription grant is created.
     */

    public String getSubscriptionTargetIdentifier() {
        return this.subscriptionTargetIdentifier;
    }

    /**
     * <p>
     * The ID of the subscription target for which the subscription grant is created.
     * </p>
     * 
     * @param subscriptionTargetIdentifier
     *        The ID of the subscription target for which the subscription grant is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionGrantRequest withSubscriptionTargetIdentifier(String subscriptionTargetIdentifier) {
        setSubscriptionTargetIdentifier(subscriptionTargetIdentifier);
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
        if (getAssetTargetNames() != null)
            sb.append("AssetTargetNames: ").append(getAssetTargetNames()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getEnvironmentIdentifier() != null)
            sb.append("EnvironmentIdentifier: ").append(getEnvironmentIdentifier()).append(",");
        if (getGrantedEntity() != null)
            sb.append("GrantedEntity: ").append(getGrantedEntity()).append(",");
        if (getSubscriptionTargetIdentifier() != null)
            sb.append("SubscriptionTargetIdentifier: ").append(getSubscriptionTargetIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSubscriptionGrantRequest == false)
            return false;
        CreateSubscriptionGrantRequest other = (CreateSubscriptionGrantRequest) obj;
        if (other.getAssetTargetNames() == null ^ this.getAssetTargetNames() == null)
            return false;
        if (other.getAssetTargetNames() != null && other.getAssetTargetNames().equals(this.getAssetTargetNames()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getEnvironmentIdentifier() == null ^ this.getEnvironmentIdentifier() == null)
            return false;
        if (other.getEnvironmentIdentifier() != null && other.getEnvironmentIdentifier().equals(this.getEnvironmentIdentifier()) == false)
            return false;
        if (other.getGrantedEntity() == null ^ this.getGrantedEntity() == null)
            return false;
        if (other.getGrantedEntity() != null && other.getGrantedEntity().equals(this.getGrantedEntity()) == false)
            return false;
        if (other.getSubscriptionTargetIdentifier() == null ^ this.getSubscriptionTargetIdentifier() == null)
            return false;
        if (other.getSubscriptionTargetIdentifier() != null && other.getSubscriptionTargetIdentifier().equals(this.getSubscriptionTargetIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssetTargetNames() == null) ? 0 : getAssetTargetNames().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentIdentifier() == null) ? 0 : getEnvironmentIdentifier().hashCode());
        hashCode = prime * hashCode + ((getGrantedEntity() == null) ? 0 : getGrantedEntity().hashCode());
        hashCode = prime * hashCode + ((getSubscriptionTargetIdentifier() == null) ? 0 : getSubscriptionTargetIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public CreateSubscriptionGrantRequest clone() {
        return (CreateSubscriptionGrantRequest) super.clone();
    }

}
