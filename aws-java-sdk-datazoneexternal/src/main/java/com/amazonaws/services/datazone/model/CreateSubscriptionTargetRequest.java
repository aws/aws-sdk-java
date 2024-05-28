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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/CreateSubscriptionTarget" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSubscriptionTargetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The asset types that can be included in the subscription target.
     * </p>
     */
    private java.util.List<String> applicableAssetTypes;
    /**
     * <p>
     * The authorized principals of the subscription target.
     * </p>
     */
    private java.util.List<String> authorizedPrincipals;
    /**
     * <p>
     * A unique, case-sensitive identifier that is provided to ensure the idempotency of the request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The ID of the Amazon DataZone domain in which subscription target is created.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * The ID of the environment in which subscription target is created.
     * </p>
     */
    private String environmentIdentifier;
    /**
     * <p>
     * The manage access role that is used to create the subscription target.
     * </p>
     */
    private String manageAccessRole;
    /**
     * <p>
     * The name of the subscription target.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The provider of the subscription target.
     * </p>
     */
    private String provider;
    /**
     * <p>
     * The configuration of the subscription target.
     * </p>
     */
    private java.util.List<SubscriptionTargetForm> subscriptionTargetConfig;
    /**
     * <p>
     * The type of the subscription target.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The asset types that can be included in the subscription target.
     * </p>
     * 
     * @return The asset types that can be included in the subscription target.
     */

    public java.util.List<String> getApplicableAssetTypes() {
        return applicableAssetTypes;
    }

    /**
     * <p>
     * The asset types that can be included in the subscription target.
     * </p>
     * 
     * @param applicableAssetTypes
     *        The asset types that can be included in the subscription target.
     */

    public void setApplicableAssetTypes(java.util.Collection<String> applicableAssetTypes) {
        if (applicableAssetTypes == null) {
            this.applicableAssetTypes = null;
            return;
        }

        this.applicableAssetTypes = new java.util.ArrayList<String>(applicableAssetTypes);
    }

    /**
     * <p>
     * The asset types that can be included in the subscription target.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApplicableAssetTypes(java.util.Collection)} or {@link #withApplicableAssetTypes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param applicableAssetTypes
     *        The asset types that can be included in the subscription target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionTargetRequest withApplicableAssetTypes(String... applicableAssetTypes) {
        if (this.applicableAssetTypes == null) {
            setApplicableAssetTypes(new java.util.ArrayList<String>(applicableAssetTypes.length));
        }
        for (String ele : applicableAssetTypes) {
            this.applicableAssetTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The asset types that can be included in the subscription target.
     * </p>
     * 
     * @param applicableAssetTypes
     *        The asset types that can be included in the subscription target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionTargetRequest withApplicableAssetTypes(java.util.Collection<String> applicableAssetTypes) {
        setApplicableAssetTypes(applicableAssetTypes);
        return this;
    }

    /**
     * <p>
     * The authorized principals of the subscription target.
     * </p>
     * 
     * @return The authorized principals of the subscription target.
     */

    public java.util.List<String> getAuthorizedPrincipals() {
        return authorizedPrincipals;
    }

    /**
     * <p>
     * The authorized principals of the subscription target.
     * </p>
     * 
     * @param authorizedPrincipals
     *        The authorized principals of the subscription target.
     */

    public void setAuthorizedPrincipals(java.util.Collection<String> authorizedPrincipals) {
        if (authorizedPrincipals == null) {
            this.authorizedPrincipals = null;
            return;
        }

        this.authorizedPrincipals = new java.util.ArrayList<String>(authorizedPrincipals);
    }

    /**
     * <p>
     * The authorized principals of the subscription target.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAuthorizedPrincipals(java.util.Collection)} or {@link #withAuthorizedPrincipals(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param authorizedPrincipals
     *        The authorized principals of the subscription target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionTargetRequest withAuthorizedPrincipals(String... authorizedPrincipals) {
        if (this.authorizedPrincipals == null) {
            setAuthorizedPrincipals(new java.util.ArrayList<String>(authorizedPrincipals.length));
        }
        for (String ele : authorizedPrincipals) {
            this.authorizedPrincipals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The authorized principals of the subscription target.
     * </p>
     * 
     * @param authorizedPrincipals
     *        The authorized principals of the subscription target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionTargetRequest withAuthorizedPrincipals(java.util.Collection<String> authorizedPrincipals) {
        setAuthorizedPrincipals(authorizedPrincipals);
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

    public CreateSubscriptionTargetRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which subscription target is created.
     * </p>
     * 
     * @param domainIdentifier
     *        The ID of the Amazon DataZone domain in which subscription target is created.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which subscription target is created.
     * </p>
     * 
     * @return The ID of the Amazon DataZone domain in which subscription target is created.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which subscription target is created.
     * </p>
     * 
     * @param domainIdentifier
     *        The ID of the Amazon DataZone domain in which subscription target is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionTargetRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The ID of the environment in which subscription target is created.
     * </p>
     * 
     * @param environmentIdentifier
     *        The ID of the environment in which subscription target is created.
     */

    public void setEnvironmentIdentifier(String environmentIdentifier) {
        this.environmentIdentifier = environmentIdentifier;
    }

    /**
     * <p>
     * The ID of the environment in which subscription target is created.
     * </p>
     * 
     * @return The ID of the environment in which subscription target is created.
     */

    public String getEnvironmentIdentifier() {
        return this.environmentIdentifier;
    }

    /**
     * <p>
     * The ID of the environment in which subscription target is created.
     * </p>
     * 
     * @param environmentIdentifier
     *        The ID of the environment in which subscription target is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionTargetRequest withEnvironmentIdentifier(String environmentIdentifier) {
        setEnvironmentIdentifier(environmentIdentifier);
        return this;
    }

    /**
     * <p>
     * The manage access role that is used to create the subscription target.
     * </p>
     * 
     * @param manageAccessRole
     *        The manage access role that is used to create the subscription target.
     */

    public void setManageAccessRole(String manageAccessRole) {
        this.manageAccessRole = manageAccessRole;
    }

    /**
     * <p>
     * The manage access role that is used to create the subscription target.
     * </p>
     * 
     * @return The manage access role that is used to create the subscription target.
     */

    public String getManageAccessRole() {
        return this.manageAccessRole;
    }

    /**
     * <p>
     * The manage access role that is used to create the subscription target.
     * </p>
     * 
     * @param manageAccessRole
     *        The manage access role that is used to create the subscription target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionTargetRequest withManageAccessRole(String manageAccessRole) {
        setManageAccessRole(manageAccessRole);
        return this;
    }

    /**
     * <p>
     * The name of the subscription target.
     * </p>
     * 
     * @param name
     *        The name of the subscription target.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the subscription target.
     * </p>
     * 
     * @return The name of the subscription target.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the subscription target.
     * </p>
     * 
     * @param name
     *        The name of the subscription target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionTargetRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The provider of the subscription target.
     * </p>
     * 
     * @param provider
     *        The provider of the subscription target.
     */

    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * <p>
     * The provider of the subscription target.
     * </p>
     * 
     * @return The provider of the subscription target.
     */

    public String getProvider() {
        return this.provider;
    }

    /**
     * <p>
     * The provider of the subscription target.
     * </p>
     * 
     * @param provider
     *        The provider of the subscription target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionTargetRequest withProvider(String provider) {
        setProvider(provider);
        return this;
    }

    /**
     * <p>
     * The configuration of the subscription target.
     * </p>
     * 
     * @return The configuration of the subscription target.
     */

    public java.util.List<SubscriptionTargetForm> getSubscriptionTargetConfig() {
        return subscriptionTargetConfig;
    }

    /**
     * <p>
     * The configuration of the subscription target.
     * </p>
     * 
     * @param subscriptionTargetConfig
     *        The configuration of the subscription target.
     */

    public void setSubscriptionTargetConfig(java.util.Collection<SubscriptionTargetForm> subscriptionTargetConfig) {
        if (subscriptionTargetConfig == null) {
            this.subscriptionTargetConfig = null;
            return;
        }

        this.subscriptionTargetConfig = new java.util.ArrayList<SubscriptionTargetForm>(subscriptionTargetConfig);
    }

    /**
     * <p>
     * The configuration of the subscription target.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubscriptionTargetConfig(java.util.Collection)} or
     * {@link #withSubscriptionTargetConfig(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param subscriptionTargetConfig
     *        The configuration of the subscription target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionTargetRequest withSubscriptionTargetConfig(SubscriptionTargetForm... subscriptionTargetConfig) {
        if (this.subscriptionTargetConfig == null) {
            setSubscriptionTargetConfig(new java.util.ArrayList<SubscriptionTargetForm>(subscriptionTargetConfig.length));
        }
        for (SubscriptionTargetForm ele : subscriptionTargetConfig) {
            this.subscriptionTargetConfig.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The configuration of the subscription target.
     * </p>
     * 
     * @param subscriptionTargetConfig
     *        The configuration of the subscription target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionTargetRequest withSubscriptionTargetConfig(java.util.Collection<SubscriptionTargetForm> subscriptionTargetConfig) {
        setSubscriptionTargetConfig(subscriptionTargetConfig);
        return this;
    }

    /**
     * <p>
     * The type of the subscription target.
     * </p>
     * 
     * @param type
     *        The type of the subscription target.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the subscription target.
     * </p>
     * 
     * @return The type of the subscription target.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the subscription target.
     * </p>
     * 
     * @param type
     *        The type of the subscription target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionTargetRequest withType(String type) {
        setType(type);
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
        if (getApplicableAssetTypes() != null)
            sb.append("ApplicableAssetTypes: ").append(getApplicableAssetTypes()).append(",");
        if (getAuthorizedPrincipals() != null)
            sb.append("AuthorizedPrincipals: ").append(getAuthorizedPrincipals()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getEnvironmentIdentifier() != null)
            sb.append("EnvironmentIdentifier: ").append(getEnvironmentIdentifier()).append(",");
        if (getManageAccessRole() != null)
            sb.append("ManageAccessRole: ").append(getManageAccessRole()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getProvider() != null)
            sb.append("Provider: ").append(getProvider()).append(",");
        if (getSubscriptionTargetConfig() != null)
            sb.append("SubscriptionTargetConfig: ").append(getSubscriptionTargetConfig()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSubscriptionTargetRequest == false)
            return false;
        CreateSubscriptionTargetRequest other = (CreateSubscriptionTargetRequest) obj;
        if (other.getApplicableAssetTypes() == null ^ this.getApplicableAssetTypes() == null)
            return false;
        if (other.getApplicableAssetTypes() != null && other.getApplicableAssetTypes().equals(this.getApplicableAssetTypes()) == false)
            return false;
        if (other.getAuthorizedPrincipals() == null ^ this.getAuthorizedPrincipals() == null)
            return false;
        if (other.getAuthorizedPrincipals() != null && other.getAuthorizedPrincipals().equals(this.getAuthorizedPrincipals()) == false)
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
        if (other.getManageAccessRole() == null ^ this.getManageAccessRole() == null)
            return false;
        if (other.getManageAccessRole() != null && other.getManageAccessRole().equals(this.getManageAccessRole()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProvider() == null ^ this.getProvider() == null)
            return false;
        if (other.getProvider() != null && other.getProvider().equals(this.getProvider()) == false)
            return false;
        if (other.getSubscriptionTargetConfig() == null ^ this.getSubscriptionTargetConfig() == null)
            return false;
        if (other.getSubscriptionTargetConfig() != null && other.getSubscriptionTargetConfig().equals(this.getSubscriptionTargetConfig()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicableAssetTypes() == null) ? 0 : getApplicableAssetTypes().hashCode());
        hashCode = prime * hashCode + ((getAuthorizedPrincipals() == null) ? 0 : getAuthorizedPrincipals().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentIdentifier() == null) ? 0 : getEnvironmentIdentifier().hashCode());
        hashCode = prime * hashCode + ((getManageAccessRole() == null) ? 0 : getManageAccessRole().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProvider() == null) ? 0 : getProvider().hashCode());
        hashCode = prime * hashCode + ((getSubscriptionTargetConfig() == null) ? 0 : getSubscriptionTargetConfig().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public CreateSubscriptionTargetRequest clone() {
        return (CreateSubscriptionTargetRequest) super.clone();
    }

}
