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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateSubscriptionTarget" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSubscriptionTargetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The applicable asset types to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     * </p>
     */
    private java.util.List<String> applicableAssetTypes;
    /**
     * <p>
     * The authorized principals to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     * </p>
     */
    private java.util.List<String> authorizedPrincipals;
    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a subscription target is to be updated.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * The identifier of the environment in which a subscription target is to be updated.
     * </p>
     */
    private String environmentIdentifier;
    /**
     * <p>
     * Identifier of the subscription target that is to be updated.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * The manage access role to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     * </p>
     */
    private String manageAccessRole;
    /**
     * <p>
     * The name to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The provider to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     * </p>
     */
    private String provider;
    /**
     * <p>
     * The configuration to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     * </p>
     */
    private java.util.List<SubscriptionTargetForm> subscriptionTargetConfig;

    /**
     * <p>
     * The applicable asset types to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     * </p>
     * 
     * @return The applicable asset types to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     */

    public java.util.List<String> getApplicableAssetTypes() {
        return applicableAssetTypes;
    }

    /**
     * <p>
     * The applicable asset types to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     * </p>
     * 
     * @param applicableAssetTypes
     *        The applicable asset types to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
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
     * The applicable asset types to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setApplicableAssetTypes(java.util.Collection)} or {@link #withApplicableAssetTypes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param applicableAssetTypes
     *        The applicable asset types to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionTargetRequest withApplicableAssetTypes(String... applicableAssetTypes) {
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
     * The applicable asset types to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     * </p>
     * 
     * @param applicableAssetTypes
     *        The applicable asset types to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionTargetRequest withApplicableAssetTypes(java.util.Collection<String> applicableAssetTypes) {
        setApplicableAssetTypes(applicableAssetTypes);
        return this;
    }

    /**
     * <p>
     * The authorized principals to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     * </p>
     * 
     * @return The authorized principals to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     */

    public java.util.List<String> getAuthorizedPrincipals() {
        return authorizedPrincipals;
    }

    /**
     * <p>
     * The authorized principals to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     * </p>
     * 
     * @param authorizedPrincipals
     *        The authorized principals to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
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
     * The authorized principals to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAuthorizedPrincipals(java.util.Collection)} or {@link #withAuthorizedPrincipals(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param authorizedPrincipals
     *        The authorized principals to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionTargetRequest withAuthorizedPrincipals(String... authorizedPrincipals) {
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
     * The authorized principals to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     * </p>
     * 
     * @param authorizedPrincipals
     *        The authorized principals to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionTargetRequest withAuthorizedPrincipals(java.util.Collection<String> authorizedPrincipals) {
        setAuthorizedPrincipals(authorizedPrincipals);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a subscription target is to be updated.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain in which a subscription target is to be updated.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a subscription target is to be updated.
     * </p>
     * 
     * @return The identifier of the Amazon DataZone domain in which a subscription target is to be updated.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a subscription target is to be updated.
     * </p>
     * 
     * @param domainIdentifier
     *        The identifier of the Amazon DataZone domain in which a subscription target is to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionTargetRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier of the environment in which a subscription target is to be updated.
     * </p>
     * 
     * @param environmentIdentifier
     *        The identifier of the environment in which a subscription target is to be updated.
     */

    public void setEnvironmentIdentifier(String environmentIdentifier) {
        this.environmentIdentifier = environmentIdentifier;
    }

    /**
     * <p>
     * The identifier of the environment in which a subscription target is to be updated.
     * </p>
     * 
     * @return The identifier of the environment in which a subscription target is to be updated.
     */

    public String getEnvironmentIdentifier() {
        return this.environmentIdentifier;
    }

    /**
     * <p>
     * The identifier of the environment in which a subscription target is to be updated.
     * </p>
     * 
     * @param environmentIdentifier
     *        The identifier of the environment in which a subscription target is to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionTargetRequest withEnvironmentIdentifier(String environmentIdentifier) {
        setEnvironmentIdentifier(environmentIdentifier);
        return this;
    }

    /**
     * <p>
     * Identifier of the subscription target that is to be updated.
     * </p>
     * 
     * @param identifier
     *        Identifier of the subscription target that is to be updated.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * Identifier of the subscription target that is to be updated.
     * </p>
     * 
     * @return Identifier of the subscription target that is to be updated.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * Identifier of the subscription target that is to be updated.
     * </p>
     * 
     * @param identifier
     *        Identifier of the subscription target that is to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionTargetRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * The manage access role to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     * </p>
     * 
     * @param manageAccessRole
     *        The manage access role to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     */

    public void setManageAccessRole(String manageAccessRole) {
        this.manageAccessRole = manageAccessRole;
    }

    /**
     * <p>
     * The manage access role to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     * </p>
     * 
     * @return The manage access role to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     */

    public String getManageAccessRole() {
        return this.manageAccessRole;
    }

    /**
     * <p>
     * The manage access role to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     * </p>
     * 
     * @param manageAccessRole
     *        The manage access role to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionTargetRequest withManageAccessRole(String manageAccessRole) {
        setManageAccessRole(manageAccessRole);
        return this;
    }

    /**
     * <p>
     * The name to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     * </p>
     * 
     * @param name
     *        The name to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     * </p>
     * 
     * @return The name to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     * </p>
     * 
     * @param name
     *        The name to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionTargetRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The provider to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     * </p>
     * 
     * @param provider
     *        The provider to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     */

    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * <p>
     * The provider to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     * </p>
     * 
     * @return The provider to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     */

    public String getProvider() {
        return this.provider;
    }

    /**
     * <p>
     * The provider to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     * </p>
     * 
     * @param provider
     *        The provider to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionTargetRequest withProvider(String provider) {
        setProvider(provider);
        return this;
    }

    /**
     * <p>
     * The configuration to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     * </p>
     * 
     * @return The configuration to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     */

    public java.util.List<SubscriptionTargetForm> getSubscriptionTargetConfig() {
        return subscriptionTargetConfig;
    }

    /**
     * <p>
     * The configuration to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     * </p>
     * 
     * @param subscriptionTargetConfig
     *        The configuration to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
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
     * The configuration to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubscriptionTargetConfig(java.util.Collection)} or
     * {@link #withSubscriptionTargetConfig(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param subscriptionTargetConfig
     *        The configuration to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionTargetRequest withSubscriptionTargetConfig(SubscriptionTargetForm... subscriptionTargetConfig) {
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
     * The configuration to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     * </p>
     * 
     * @param subscriptionTargetConfig
     *        The configuration to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionTargetRequest withSubscriptionTargetConfig(java.util.Collection<SubscriptionTargetForm> subscriptionTargetConfig) {
        setSubscriptionTargetConfig(subscriptionTargetConfig);
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
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getEnvironmentIdentifier() != null)
            sb.append("EnvironmentIdentifier: ").append(getEnvironmentIdentifier()).append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getManageAccessRole() != null)
            sb.append("ManageAccessRole: ").append(getManageAccessRole()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getProvider() != null)
            sb.append("Provider: ").append(getProvider()).append(",");
        if (getSubscriptionTargetConfig() != null)
            sb.append("SubscriptionTargetConfig: ").append(getSubscriptionTargetConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSubscriptionTargetRequest == false)
            return false;
        UpdateSubscriptionTargetRequest other = (UpdateSubscriptionTargetRequest) obj;
        if (other.getApplicableAssetTypes() == null ^ this.getApplicableAssetTypes() == null)
            return false;
        if (other.getApplicableAssetTypes() != null && other.getApplicableAssetTypes().equals(this.getApplicableAssetTypes()) == false)
            return false;
        if (other.getAuthorizedPrincipals() == null ^ this.getAuthorizedPrincipals() == null)
            return false;
        if (other.getAuthorizedPrincipals() != null && other.getAuthorizedPrincipals().equals(this.getAuthorizedPrincipals()) == false)
            return false;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getEnvironmentIdentifier() == null ^ this.getEnvironmentIdentifier() == null)
            return false;
        if (other.getEnvironmentIdentifier() != null && other.getEnvironmentIdentifier().equals(this.getEnvironmentIdentifier()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicableAssetTypes() == null) ? 0 : getApplicableAssetTypes().hashCode());
        hashCode = prime * hashCode + ((getAuthorizedPrincipals() == null) ? 0 : getAuthorizedPrincipals().hashCode());
        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentIdentifier() == null) ? 0 : getEnvironmentIdentifier().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getManageAccessRole() == null) ? 0 : getManageAccessRole().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProvider() == null) ? 0 : getProvider().hashCode());
        hashCode = prime * hashCode + ((getSubscriptionTargetConfig() == null) ? 0 : getSubscriptionTargetConfig().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSubscriptionTargetRequest clone() {
        return (UpdateSubscriptionTargetRequest) super.clone();
    }

}
