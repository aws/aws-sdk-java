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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetEnvironment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEnvironmentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon Web Services account where the environment exists.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The Amazon Web Services region where the environment exists.
     * </p>
     */
    private String awsAccountRegion;
    /**
     * <p>
     * The timestamp of when the environment was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Amazon DataZone user who created the environment.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The deployment properties of the environment.
     * </p>
     */
    private DeploymentProperties deploymentProperties;
    /**
     * <p>
     * The description of the environment.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID of the Amazon DataZone domain where the environment exists.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The actions of the environment.
     * </p>
     */
    private java.util.List<ConfigurableEnvironmentAction> environmentActions;
    /**
     * <p>
     * The blueprint with which the environment is created.
     * </p>
     */
    private String environmentBlueprintId;
    /**
     * <p>
     * The ID of the environment profile with which the environment is created.
     * </p>
     */
    private String environmentProfileId;
    /**
     * <p>
     * The business glossary terms that can be used in this environment.
     * </p>
     */
    private java.util.List<String> glossaryTerms;
    /**
     * <p>
     * The ID of the environment.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The details of the last deployment of the environment.
     * </p>
     */
    private Deployment lastDeployment;
    /**
     * <p>
     * The name of the environment.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the Amazon DataZone project in which this environment is created.
     * </p>
     */
    private String projectId;
    /**
     * <p>
     * The provider of this Amazon DataZone environment.
     * </p>
     */
    private String provider;
    /**
     * <p>
     * The provisioned resources of this Amazon DataZone environment.
     * </p>
     */
    private java.util.List<Resource> provisionedResources;
    /**
     * <p>
     * The provisioning properties of this Amazon DataZone environment.
     * </p>
     */
    private ProvisioningProperties provisioningProperties;
    /**
     * <p>
     * The status of this Amazon DataZone environment.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The timestamp of when this environment was updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The user parameters of this Amazon DataZone environment.
     * </p>
     */
    private java.util.List<CustomParameter> userParameters;

    /**
     * <p>
     * The ID of the Amazon Web Services account where the environment exists.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account where the environment exists.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account where the environment exists.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account where the environment exists.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account where the environment exists.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account where the environment exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services region where the environment exists.
     * </p>
     * 
     * @param awsAccountRegion
     *        The Amazon Web Services region where the environment exists.
     */

    public void setAwsAccountRegion(String awsAccountRegion) {
        this.awsAccountRegion = awsAccountRegion;
    }

    /**
     * <p>
     * The Amazon Web Services region where the environment exists.
     * </p>
     * 
     * @return The Amazon Web Services region where the environment exists.
     */

    public String getAwsAccountRegion() {
        return this.awsAccountRegion;
    }

    /**
     * <p>
     * The Amazon Web Services region where the environment exists.
     * </p>
     * 
     * @param awsAccountRegion
     *        The Amazon Web Services region where the environment exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withAwsAccountRegion(String awsAccountRegion) {
        setAwsAccountRegion(awsAccountRegion);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the environment was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the environment was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when the environment was created.
     * </p>
     * 
     * @return The timestamp of when the environment was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when the environment was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the environment was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the environment.
     * </p>
     * 
     * @param createdBy
     *        The Amazon DataZone user who created the environment.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the environment.
     * </p>
     * 
     * @return The Amazon DataZone user who created the environment.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The Amazon DataZone user who created the environment.
     * </p>
     * 
     * @param createdBy
     *        The Amazon DataZone user who created the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The deployment properties of the environment.
     * </p>
     * 
     * @param deploymentProperties
     *        The deployment properties of the environment.
     */

    public void setDeploymentProperties(DeploymentProperties deploymentProperties) {
        this.deploymentProperties = deploymentProperties;
    }

    /**
     * <p>
     * The deployment properties of the environment.
     * </p>
     * 
     * @return The deployment properties of the environment.
     */

    public DeploymentProperties getDeploymentProperties() {
        return this.deploymentProperties;
    }

    /**
     * <p>
     * The deployment properties of the environment.
     * </p>
     * 
     * @param deploymentProperties
     *        The deployment properties of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withDeploymentProperties(DeploymentProperties deploymentProperties) {
        setDeploymentProperties(deploymentProperties);
        return this;
    }

    /**
     * <p>
     * The description of the environment.
     * </p>
     * 
     * @param description
     *        The description of the environment.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the environment.
     * </p>
     * 
     * @return The description of the environment.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the environment.
     * </p>
     * 
     * @param description
     *        The description of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain where the environment exists.
     * </p>
     * 
     * @param domainId
     *        The ID of the Amazon DataZone domain where the environment exists.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain where the environment exists.
     * </p>
     * 
     * @return The ID of the Amazon DataZone domain where the environment exists.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain where the environment exists.
     * </p>
     * 
     * @param domainId
     *        The ID of the Amazon DataZone domain where the environment exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The actions of the environment.
     * </p>
     * 
     * @return The actions of the environment.
     */

    public java.util.List<ConfigurableEnvironmentAction> getEnvironmentActions() {
        return environmentActions;
    }

    /**
     * <p>
     * The actions of the environment.
     * </p>
     * 
     * @param environmentActions
     *        The actions of the environment.
     */

    public void setEnvironmentActions(java.util.Collection<ConfigurableEnvironmentAction> environmentActions) {
        if (environmentActions == null) {
            this.environmentActions = null;
            return;
        }

        this.environmentActions = new java.util.ArrayList<ConfigurableEnvironmentAction>(environmentActions);
    }

    /**
     * <p>
     * The actions of the environment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEnvironmentActions(java.util.Collection)} or {@link #withEnvironmentActions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param environmentActions
     *        The actions of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withEnvironmentActions(ConfigurableEnvironmentAction... environmentActions) {
        if (this.environmentActions == null) {
            setEnvironmentActions(new java.util.ArrayList<ConfigurableEnvironmentAction>(environmentActions.length));
        }
        for (ConfigurableEnvironmentAction ele : environmentActions) {
            this.environmentActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The actions of the environment.
     * </p>
     * 
     * @param environmentActions
     *        The actions of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withEnvironmentActions(java.util.Collection<ConfigurableEnvironmentAction> environmentActions) {
        setEnvironmentActions(environmentActions);
        return this;
    }

    /**
     * <p>
     * The blueprint with which the environment is created.
     * </p>
     * 
     * @param environmentBlueprintId
     *        The blueprint with which the environment is created.
     */

    public void setEnvironmentBlueprintId(String environmentBlueprintId) {
        this.environmentBlueprintId = environmentBlueprintId;
    }

    /**
     * <p>
     * The blueprint with which the environment is created.
     * </p>
     * 
     * @return The blueprint with which the environment is created.
     */

    public String getEnvironmentBlueprintId() {
        return this.environmentBlueprintId;
    }

    /**
     * <p>
     * The blueprint with which the environment is created.
     * </p>
     * 
     * @param environmentBlueprintId
     *        The blueprint with which the environment is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withEnvironmentBlueprintId(String environmentBlueprintId) {
        setEnvironmentBlueprintId(environmentBlueprintId);
        return this;
    }

    /**
     * <p>
     * The ID of the environment profile with which the environment is created.
     * </p>
     * 
     * @param environmentProfileId
     *        The ID of the environment profile with which the environment is created.
     */

    public void setEnvironmentProfileId(String environmentProfileId) {
        this.environmentProfileId = environmentProfileId;
    }

    /**
     * <p>
     * The ID of the environment profile with which the environment is created.
     * </p>
     * 
     * @return The ID of the environment profile with which the environment is created.
     */

    public String getEnvironmentProfileId() {
        return this.environmentProfileId;
    }

    /**
     * <p>
     * The ID of the environment profile with which the environment is created.
     * </p>
     * 
     * @param environmentProfileId
     *        The ID of the environment profile with which the environment is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withEnvironmentProfileId(String environmentProfileId) {
        setEnvironmentProfileId(environmentProfileId);
        return this;
    }

    /**
     * <p>
     * The business glossary terms that can be used in this environment.
     * </p>
     * 
     * @return The business glossary terms that can be used in this environment.
     */

    public java.util.List<String> getGlossaryTerms() {
        return glossaryTerms;
    }

    /**
     * <p>
     * The business glossary terms that can be used in this environment.
     * </p>
     * 
     * @param glossaryTerms
     *        The business glossary terms that can be used in this environment.
     */

    public void setGlossaryTerms(java.util.Collection<String> glossaryTerms) {
        if (glossaryTerms == null) {
            this.glossaryTerms = null;
            return;
        }

        this.glossaryTerms = new java.util.ArrayList<String>(glossaryTerms);
    }

    /**
     * <p>
     * The business glossary terms that can be used in this environment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGlossaryTerms(java.util.Collection)} or {@link #withGlossaryTerms(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param glossaryTerms
     *        The business glossary terms that can be used in this environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withGlossaryTerms(String... glossaryTerms) {
        if (this.glossaryTerms == null) {
            setGlossaryTerms(new java.util.ArrayList<String>(glossaryTerms.length));
        }
        for (String ele : glossaryTerms) {
            this.glossaryTerms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The business glossary terms that can be used in this environment.
     * </p>
     * 
     * @param glossaryTerms
     *        The business glossary terms that can be used in this environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withGlossaryTerms(java.util.Collection<String> glossaryTerms) {
        setGlossaryTerms(glossaryTerms);
        return this;
    }

    /**
     * <p>
     * The ID of the environment.
     * </p>
     * 
     * @param id
     *        The ID of the environment.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the environment.
     * </p>
     * 
     * @return The ID of the environment.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the environment.
     * </p>
     * 
     * @param id
     *        The ID of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The details of the last deployment of the environment.
     * </p>
     * 
     * @param lastDeployment
     *        The details of the last deployment of the environment.
     */

    public void setLastDeployment(Deployment lastDeployment) {
        this.lastDeployment = lastDeployment;
    }

    /**
     * <p>
     * The details of the last deployment of the environment.
     * </p>
     * 
     * @return The details of the last deployment of the environment.
     */

    public Deployment getLastDeployment() {
        return this.lastDeployment;
    }

    /**
     * <p>
     * The details of the last deployment of the environment.
     * </p>
     * 
     * @param lastDeployment
     *        The details of the last deployment of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withLastDeployment(Deployment lastDeployment) {
        setLastDeployment(lastDeployment);
        return this;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * 
     * @param name
     *        The name of the environment.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * 
     * @return The name of the environment.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * 
     * @param name
     *        The name of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone project in which this environment is created.
     * </p>
     * 
     * @param projectId
     *        The ID of the Amazon DataZone project in which this environment is created.
     */

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone project in which this environment is created.
     * </p>
     * 
     * @return The ID of the Amazon DataZone project in which this environment is created.
     */

    public String getProjectId() {
        return this.projectId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone project in which this environment is created.
     * </p>
     * 
     * @param projectId
     *        The ID of the Amazon DataZone project in which this environment is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withProjectId(String projectId) {
        setProjectId(projectId);
        return this;
    }

    /**
     * <p>
     * The provider of this Amazon DataZone environment.
     * </p>
     * 
     * @param provider
     *        The provider of this Amazon DataZone environment.
     */

    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * <p>
     * The provider of this Amazon DataZone environment.
     * </p>
     * 
     * @return The provider of this Amazon DataZone environment.
     */

    public String getProvider() {
        return this.provider;
    }

    /**
     * <p>
     * The provider of this Amazon DataZone environment.
     * </p>
     * 
     * @param provider
     *        The provider of this Amazon DataZone environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withProvider(String provider) {
        setProvider(provider);
        return this;
    }

    /**
     * <p>
     * The provisioned resources of this Amazon DataZone environment.
     * </p>
     * 
     * @return The provisioned resources of this Amazon DataZone environment.
     */

    public java.util.List<Resource> getProvisionedResources() {
        return provisionedResources;
    }

    /**
     * <p>
     * The provisioned resources of this Amazon DataZone environment.
     * </p>
     * 
     * @param provisionedResources
     *        The provisioned resources of this Amazon DataZone environment.
     */

    public void setProvisionedResources(java.util.Collection<Resource> provisionedResources) {
        if (provisionedResources == null) {
            this.provisionedResources = null;
            return;
        }

        this.provisionedResources = new java.util.ArrayList<Resource>(provisionedResources);
    }

    /**
     * <p>
     * The provisioned resources of this Amazon DataZone environment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProvisionedResources(java.util.Collection)} or {@link #withProvisionedResources(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param provisionedResources
     *        The provisioned resources of this Amazon DataZone environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withProvisionedResources(Resource... provisionedResources) {
        if (this.provisionedResources == null) {
            setProvisionedResources(new java.util.ArrayList<Resource>(provisionedResources.length));
        }
        for (Resource ele : provisionedResources) {
            this.provisionedResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The provisioned resources of this Amazon DataZone environment.
     * </p>
     * 
     * @param provisionedResources
     *        The provisioned resources of this Amazon DataZone environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withProvisionedResources(java.util.Collection<Resource> provisionedResources) {
        setProvisionedResources(provisionedResources);
        return this;
    }

    /**
     * <p>
     * The provisioning properties of this Amazon DataZone environment.
     * </p>
     * 
     * @param provisioningProperties
     *        The provisioning properties of this Amazon DataZone environment.
     */

    public void setProvisioningProperties(ProvisioningProperties provisioningProperties) {
        this.provisioningProperties = provisioningProperties;
    }

    /**
     * <p>
     * The provisioning properties of this Amazon DataZone environment.
     * </p>
     * 
     * @return The provisioning properties of this Amazon DataZone environment.
     */

    public ProvisioningProperties getProvisioningProperties() {
        return this.provisioningProperties;
    }

    /**
     * <p>
     * The provisioning properties of this Amazon DataZone environment.
     * </p>
     * 
     * @param provisioningProperties
     *        The provisioning properties of this Amazon DataZone environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withProvisioningProperties(ProvisioningProperties provisioningProperties) {
        setProvisioningProperties(provisioningProperties);
        return this;
    }

    /**
     * <p>
     * The status of this Amazon DataZone environment.
     * </p>
     * 
     * @param status
     *        The status of this Amazon DataZone environment.
     * @see EnvironmentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of this Amazon DataZone environment.
     * </p>
     * 
     * @return The status of this Amazon DataZone environment.
     * @see EnvironmentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of this Amazon DataZone environment.
     * </p>
     * 
     * @param status
     *        The status of this Amazon DataZone environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentStatus
     */

    public GetEnvironmentResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of this Amazon DataZone environment.
     * </p>
     * 
     * @param status
     *        The status of this Amazon DataZone environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentStatus
     */

    public GetEnvironmentResult withStatus(EnvironmentStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp of when this environment was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when this environment was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp of when this environment was updated.
     * </p>
     * 
     * @return The timestamp of when this environment was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp of when this environment was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when this environment was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The user parameters of this Amazon DataZone environment.
     * </p>
     * 
     * @return The user parameters of this Amazon DataZone environment.
     */

    public java.util.List<CustomParameter> getUserParameters() {
        return userParameters;
    }

    /**
     * <p>
     * The user parameters of this Amazon DataZone environment.
     * </p>
     * 
     * @param userParameters
     *        The user parameters of this Amazon DataZone environment.
     */

    public void setUserParameters(java.util.Collection<CustomParameter> userParameters) {
        if (userParameters == null) {
            this.userParameters = null;
            return;
        }

        this.userParameters = new java.util.ArrayList<CustomParameter>(userParameters);
    }

    /**
     * <p>
     * The user parameters of this Amazon DataZone environment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserParameters(java.util.Collection)} or {@link #withUserParameters(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param userParameters
     *        The user parameters of this Amazon DataZone environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withUserParameters(CustomParameter... userParameters) {
        if (this.userParameters == null) {
            setUserParameters(new java.util.ArrayList<CustomParameter>(userParameters.length));
        }
        for (CustomParameter ele : userParameters) {
            this.userParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The user parameters of this Amazon DataZone environment.
     * </p>
     * 
     * @param userParameters
     *        The user parameters of this Amazon DataZone environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentResult withUserParameters(java.util.Collection<CustomParameter> userParameters) {
        setUserParameters(userParameters);
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getAwsAccountRegion() != null)
            sb.append("AwsAccountRegion: ").append(getAwsAccountRegion()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getDeploymentProperties() != null)
            sb.append("DeploymentProperties: ").append(getDeploymentProperties()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getEnvironmentActions() != null)
            sb.append("EnvironmentActions: ").append(getEnvironmentActions()).append(",");
        if (getEnvironmentBlueprintId() != null)
            sb.append("EnvironmentBlueprintId: ").append(getEnvironmentBlueprintId()).append(",");
        if (getEnvironmentProfileId() != null)
            sb.append("EnvironmentProfileId: ").append(getEnvironmentProfileId()).append(",");
        if (getGlossaryTerms() != null)
            sb.append("GlossaryTerms: ").append(getGlossaryTerms()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLastDeployment() != null)
            sb.append("LastDeployment: ").append(getLastDeployment()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getProjectId() != null)
            sb.append("ProjectId: ").append(getProjectId()).append(",");
        if (getProvider() != null)
            sb.append("Provider: ").append(getProvider()).append(",");
        if (getProvisionedResources() != null)
            sb.append("ProvisionedResources: ").append(getProvisionedResources()).append(",");
        if (getProvisioningProperties() != null)
            sb.append("ProvisioningProperties: ").append(getProvisioningProperties()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getUserParameters() != null)
            sb.append("UserParameters: ").append(getUserParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEnvironmentResult == false)
            return false;
        GetEnvironmentResult other = (GetEnvironmentResult) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getAwsAccountRegion() == null ^ this.getAwsAccountRegion() == null)
            return false;
        if (other.getAwsAccountRegion() != null && other.getAwsAccountRegion().equals(this.getAwsAccountRegion()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getDeploymentProperties() == null ^ this.getDeploymentProperties() == null)
            return false;
        if (other.getDeploymentProperties() != null && other.getDeploymentProperties().equals(this.getDeploymentProperties()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getEnvironmentActions() == null ^ this.getEnvironmentActions() == null)
            return false;
        if (other.getEnvironmentActions() != null && other.getEnvironmentActions().equals(this.getEnvironmentActions()) == false)
            return false;
        if (other.getEnvironmentBlueprintId() == null ^ this.getEnvironmentBlueprintId() == null)
            return false;
        if (other.getEnvironmentBlueprintId() != null && other.getEnvironmentBlueprintId().equals(this.getEnvironmentBlueprintId()) == false)
            return false;
        if (other.getEnvironmentProfileId() == null ^ this.getEnvironmentProfileId() == null)
            return false;
        if (other.getEnvironmentProfileId() != null && other.getEnvironmentProfileId().equals(this.getEnvironmentProfileId()) == false)
            return false;
        if (other.getGlossaryTerms() == null ^ this.getGlossaryTerms() == null)
            return false;
        if (other.getGlossaryTerms() != null && other.getGlossaryTerms().equals(this.getGlossaryTerms()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLastDeployment() == null ^ this.getLastDeployment() == null)
            return false;
        if (other.getLastDeployment() != null && other.getLastDeployment().equals(this.getLastDeployment()) == false)
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
        if (other.getProvisionedResources() == null ^ this.getProvisionedResources() == null)
            return false;
        if (other.getProvisionedResources() != null && other.getProvisionedResources().equals(this.getProvisionedResources()) == false)
            return false;
        if (other.getProvisioningProperties() == null ^ this.getProvisioningProperties() == null)
            return false;
        if (other.getProvisioningProperties() != null && other.getProvisioningProperties().equals(this.getProvisioningProperties()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getUserParameters() == null ^ this.getUserParameters() == null)
            return false;
        if (other.getUserParameters() != null && other.getUserParameters().equals(this.getUserParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getAwsAccountRegion() == null) ? 0 : getAwsAccountRegion().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getDeploymentProperties() == null) ? 0 : getDeploymentProperties().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentActions() == null) ? 0 : getEnvironmentActions().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentBlueprintId() == null) ? 0 : getEnvironmentBlueprintId().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentProfileId() == null) ? 0 : getEnvironmentProfileId().hashCode());
        hashCode = prime * hashCode + ((getGlossaryTerms() == null) ? 0 : getGlossaryTerms().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLastDeployment() == null) ? 0 : getLastDeployment().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        hashCode = prime * hashCode + ((getProvider() == null) ? 0 : getProvider().hashCode());
        hashCode = prime * hashCode + ((getProvisionedResources() == null) ? 0 : getProvisionedResources().hashCode());
        hashCode = prime * hashCode + ((getProvisioningProperties() == null) ? 0 : getProvisioningProperties().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getUserParameters() == null) ? 0 : getUserParameters().hashCode());
        return hashCode;
    }

    @Override
    public GetEnvironmentResult clone() {
        try {
            return (GetEnvironmentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
