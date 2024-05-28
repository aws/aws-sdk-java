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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/UpdateSubscriptionTarget" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSubscriptionTargetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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
     * The timestamp of when a subscription target was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Amazon DataZone user who created the subscription target.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a subscription target is to be updated.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The identifier of the environment in which a subscription target is to be updated.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * Identifier of the subscription target that is to be updated.
     * </p>
     */
    private String id;
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
     * The identifier of the project in which a subscription target is to be updated.
     * </p>
     */
    private String projectId;
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
     * The type to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The timestamp of when the subscription target was updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The Amazon DataZone user who updated the subscription target.
     * </p>
     */
    private String updatedBy;

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

    public UpdateSubscriptionTargetResult withApplicableAssetTypes(String... applicableAssetTypes) {
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

    public UpdateSubscriptionTargetResult withApplicableAssetTypes(java.util.Collection<String> applicableAssetTypes) {
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

    public UpdateSubscriptionTargetResult withAuthorizedPrincipals(String... authorizedPrincipals) {
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

    public UpdateSubscriptionTargetResult withAuthorizedPrincipals(java.util.Collection<String> authorizedPrincipals) {
        setAuthorizedPrincipals(authorizedPrincipals);
        return this;
    }

    /**
     * <p>
     * The timestamp of when a subscription target was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when a subscription target was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when a subscription target was created.
     * </p>
     * 
     * @return The timestamp of when a subscription target was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when a subscription target was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when a subscription target was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionTargetResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the subscription target.
     * </p>
     * 
     * @param createdBy
     *        The Amazon DataZone user who created the subscription target.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the subscription target.
     * </p>
     * 
     * @return The Amazon DataZone user who created the subscription target.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the subscription target.
     * </p>
     * 
     * @param createdBy
     *        The Amazon DataZone user who created the subscription target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionTargetResult withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a subscription target is to be updated.
     * </p>
     * 
     * @param domainId
     *        The identifier of the Amazon DataZone domain in which a subscription target is to be updated.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a subscription target is to be updated.
     * </p>
     * 
     * @return The identifier of the Amazon DataZone domain in which a subscription target is to be updated.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The identifier of the Amazon DataZone domain in which a subscription target is to be updated.
     * </p>
     * 
     * @param domainId
     *        The identifier of the Amazon DataZone domain in which a subscription target is to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionTargetResult withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The identifier of the environment in which a subscription target is to be updated.
     * </p>
     * 
     * @param environmentId
     *        The identifier of the environment in which a subscription target is to be updated.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The identifier of the environment in which a subscription target is to be updated.
     * </p>
     * 
     * @return The identifier of the environment in which a subscription target is to be updated.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * The identifier of the environment in which a subscription target is to be updated.
     * </p>
     * 
     * @param environmentId
     *        The identifier of the environment in which a subscription target is to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionTargetResult withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * Identifier of the subscription target that is to be updated.
     * </p>
     * 
     * @param id
     *        Identifier of the subscription target that is to be updated.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * Identifier of the subscription target that is to be updated.
     * </p>
     * 
     * @return Identifier of the subscription target that is to be updated.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * Identifier of the subscription target that is to be updated.
     * </p>
     * 
     * @param id
     *        Identifier of the subscription target that is to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionTargetResult withId(String id) {
        setId(id);
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

    public UpdateSubscriptionTargetResult withManageAccessRole(String manageAccessRole) {
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

    public UpdateSubscriptionTargetResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The identifier of the project in which a subscription target is to be updated.
     * </p>
     * 
     * @param projectId
     *        The identifier of the project in which a subscription target is to be updated.
     */

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * <p>
     * The identifier of the project in which a subscription target is to be updated.
     * </p>
     * 
     * @return The identifier of the project in which a subscription target is to be updated.
     */

    public String getProjectId() {
        return this.projectId;
    }

    /**
     * <p>
     * The identifier of the project in which a subscription target is to be updated.
     * </p>
     * 
     * @param projectId
     *        The identifier of the project in which a subscription target is to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionTargetResult withProjectId(String projectId) {
        setProjectId(projectId);
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

    public UpdateSubscriptionTargetResult withProvider(String provider) {
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

    public UpdateSubscriptionTargetResult withSubscriptionTargetConfig(SubscriptionTargetForm... subscriptionTargetConfig) {
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

    public UpdateSubscriptionTargetResult withSubscriptionTargetConfig(java.util.Collection<SubscriptionTargetForm> subscriptionTargetConfig) {
        setSubscriptionTargetConfig(subscriptionTargetConfig);
        return this;
    }

    /**
     * <p>
     * The type to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     * </p>
     * 
     * @param type
     *        The type to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     * </p>
     * 
     * @return The type to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     * </p>
     * 
     * @param type
     *        The type to be updated as part of the <code>UpdateSubscriptionTarget</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionTargetResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the subscription target was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the subscription target was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the subscription target was updated.
     * </p>
     * 
     * @return The timestamp of when the subscription target was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the subscription target was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the subscription target was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionTargetResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The Amazon DataZone user who updated the subscription target.
     * </p>
     * 
     * @param updatedBy
     *        The Amazon DataZone user who updated the subscription target.
     */

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who updated the subscription target.
     * </p>
     * 
     * @return The Amazon DataZone user who updated the subscription target.
     */

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who updated the subscription target.
     * </p>
     * 
     * @param updatedBy
     *        The Amazon DataZone user who updated the subscription target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionTargetResult withUpdatedBy(String updatedBy) {
        setUpdatedBy(updatedBy);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getManageAccessRole() != null)
            sb.append("ManageAccessRole: ").append(getManageAccessRole()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getProjectId() != null)
            sb.append("ProjectId: ").append(getProjectId()).append(",");
        if (getProvider() != null)
            sb.append("Provider: ").append(getProvider()).append(",");
        if (getSubscriptionTargetConfig() != null)
            sb.append("SubscriptionTargetConfig: ").append(getSubscriptionTargetConfig()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getUpdatedBy() != null)
            sb.append("UpdatedBy: ").append(getUpdatedBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSubscriptionTargetResult == false)
            return false;
        UpdateSubscriptionTargetResult other = (UpdateSubscriptionTargetResult) obj;
        if (other.getApplicableAssetTypes() == null ^ this.getApplicableAssetTypes() == null)
            return false;
        if (other.getApplicableAssetTypes() != null && other.getApplicableAssetTypes().equals(this.getApplicableAssetTypes()) == false)
            return false;
        if (other.getAuthorizedPrincipals() == null ^ this.getAuthorizedPrincipals() == null)
            return false;
        if (other.getAuthorizedPrincipals() != null && other.getAuthorizedPrincipals().equals(this.getAuthorizedPrincipals()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getManageAccessRole() == null ^ this.getManageAccessRole() == null)
            return false;
        if (other.getManageAccessRole() != null && other.getManageAccessRole().equals(this.getManageAccessRole()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProjectId() == null ^ this.getProjectId() == null)
            return false;
        if (other.getProjectId() != null && other.getProjectId().equals(this.getProjectId()) == false)
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
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getUpdatedBy() == null ^ this.getUpdatedBy() == null)
            return false;
        if (other.getUpdatedBy() != null && other.getUpdatedBy().equals(this.getUpdatedBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicableAssetTypes() == null) ? 0 : getApplicableAssetTypes().hashCode());
        hashCode = prime * hashCode + ((getAuthorizedPrincipals() == null) ? 0 : getAuthorizedPrincipals().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getManageAccessRole() == null) ? 0 : getManageAccessRole().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        hashCode = prime * hashCode + ((getProvider() == null) ? 0 : getProvider().hashCode());
        hashCode = prime * hashCode + ((getSubscriptionTargetConfig() == null) ? 0 : getSubscriptionTargetConfig().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedBy() == null) ? 0 : getUpdatedBy().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSubscriptionTargetResult clone() {
        try {
            return (UpdateSubscriptionTargetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
