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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetEnvironmentBlueprint" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEnvironmentBlueprintResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A timestamp of when this blueprint was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The deployment properties of this Amazon DataZone blueprint.
     * </p>
     */
    private DeploymentProperties deploymentProperties;
    /**
     * <p>
     * The description of this Amazon DataZone blueprint.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The glossary terms attached to this Amazon DataZone blueprint.
     * </p>
     */
    private java.util.List<String> glossaryTerms;
    /**
     * <p>
     * The ID of this Amazon DataZone blueprint.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of this Amazon DataZone blueprint.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The provider of this Amazon DataZone blueprint.
     * </p>
     */
    private String provider;
    /**
     * <p>
     * The provisioning properties of this Amazon DataZone blueprint.
     * </p>
     */
    private ProvisioningProperties provisioningProperties;
    /**
     * <p>
     * The timestamp of when this blueprint was updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The user parameters of this blueprint.
     * </p>
     */
    private java.util.List<CustomParameter> userParameters;

    /**
     * <p>
     * A timestamp of when this blueprint was created.
     * </p>
     * 
     * @param createdAt
     *        A timestamp of when this blueprint was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * A timestamp of when this blueprint was created.
     * </p>
     * 
     * @return A timestamp of when this blueprint was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * A timestamp of when this blueprint was created.
     * </p>
     * 
     * @param createdAt
     *        A timestamp of when this blueprint was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentBlueprintResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The deployment properties of this Amazon DataZone blueprint.
     * </p>
     * 
     * @param deploymentProperties
     *        The deployment properties of this Amazon DataZone blueprint.
     */

    public void setDeploymentProperties(DeploymentProperties deploymentProperties) {
        this.deploymentProperties = deploymentProperties;
    }

    /**
     * <p>
     * The deployment properties of this Amazon DataZone blueprint.
     * </p>
     * 
     * @return The deployment properties of this Amazon DataZone blueprint.
     */

    public DeploymentProperties getDeploymentProperties() {
        return this.deploymentProperties;
    }

    /**
     * <p>
     * The deployment properties of this Amazon DataZone blueprint.
     * </p>
     * 
     * @param deploymentProperties
     *        The deployment properties of this Amazon DataZone blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentBlueprintResult withDeploymentProperties(DeploymentProperties deploymentProperties) {
        setDeploymentProperties(deploymentProperties);
        return this;
    }

    /**
     * <p>
     * The description of this Amazon DataZone blueprint.
     * </p>
     * 
     * @param description
     *        The description of this Amazon DataZone blueprint.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of this Amazon DataZone blueprint.
     * </p>
     * 
     * @return The description of this Amazon DataZone blueprint.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of this Amazon DataZone blueprint.
     * </p>
     * 
     * @param description
     *        The description of this Amazon DataZone blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentBlueprintResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The glossary terms attached to this Amazon DataZone blueprint.
     * </p>
     * 
     * @return The glossary terms attached to this Amazon DataZone blueprint.
     */

    public java.util.List<String> getGlossaryTerms() {
        return glossaryTerms;
    }

    /**
     * <p>
     * The glossary terms attached to this Amazon DataZone blueprint.
     * </p>
     * 
     * @param glossaryTerms
     *        The glossary terms attached to this Amazon DataZone blueprint.
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
     * The glossary terms attached to this Amazon DataZone blueprint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGlossaryTerms(java.util.Collection)} or {@link #withGlossaryTerms(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param glossaryTerms
     *        The glossary terms attached to this Amazon DataZone blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentBlueprintResult withGlossaryTerms(String... glossaryTerms) {
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
     * The glossary terms attached to this Amazon DataZone blueprint.
     * </p>
     * 
     * @param glossaryTerms
     *        The glossary terms attached to this Amazon DataZone blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentBlueprintResult withGlossaryTerms(java.util.Collection<String> glossaryTerms) {
        setGlossaryTerms(glossaryTerms);
        return this;
    }

    /**
     * <p>
     * The ID of this Amazon DataZone blueprint.
     * </p>
     * 
     * @param id
     *        The ID of this Amazon DataZone blueprint.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of this Amazon DataZone blueprint.
     * </p>
     * 
     * @return The ID of this Amazon DataZone blueprint.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of this Amazon DataZone blueprint.
     * </p>
     * 
     * @param id
     *        The ID of this Amazon DataZone blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentBlueprintResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of this Amazon DataZone blueprint.
     * </p>
     * 
     * @param name
     *        The name of this Amazon DataZone blueprint.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of this Amazon DataZone blueprint.
     * </p>
     * 
     * @return The name of this Amazon DataZone blueprint.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of this Amazon DataZone blueprint.
     * </p>
     * 
     * @param name
     *        The name of this Amazon DataZone blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentBlueprintResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The provider of this Amazon DataZone blueprint.
     * </p>
     * 
     * @param provider
     *        The provider of this Amazon DataZone blueprint.
     */

    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * <p>
     * The provider of this Amazon DataZone blueprint.
     * </p>
     * 
     * @return The provider of this Amazon DataZone blueprint.
     */

    public String getProvider() {
        return this.provider;
    }

    /**
     * <p>
     * The provider of this Amazon DataZone blueprint.
     * </p>
     * 
     * @param provider
     *        The provider of this Amazon DataZone blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentBlueprintResult withProvider(String provider) {
        setProvider(provider);
        return this;
    }

    /**
     * <p>
     * The provisioning properties of this Amazon DataZone blueprint.
     * </p>
     * 
     * @param provisioningProperties
     *        The provisioning properties of this Amazon DataZone blueprint.
     */

    public void setProvisioningProperties(ProvisioningProperties provisioningProperties) {
        this.provisioningProperties = provisioningProperties;
    }

    /**
     * <p>
     * The provisioning properties of this Amazon DataZone blueprint.
     * </p>
     * 
     * @return The provisioning properties of this Amazon DataZone blueprint.
     */

    public ProvisioningProperties getProvisioningProperties() {
        return this.provisioningProperties;
    }

    /**
     * <p>
     * The provisioning properties of this Amazon DataZone blueprint.
     * </p>
     * 
     * @param provisioningProperties
     *        The provisioning properties of this Amazon DataZone blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentBlueprintResult withProvisioningProperties(ProvisioningProperties provisioningProperties) {
        setProvisioningProperties(provisioningProperties);
        return this;
    }

    /**
     * <p>
     * The timestamp of when this blueprint was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when this blueprint was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp of when this blueprint was updated.
     * </p>
     * 
     * @return The timestamp of when this blueprint was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp of when this blueprint was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when this blueprint was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentBlueprintResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The user parameters of this blueprint.
     * </p>
     * 
     * @return The user parameters of this blueprint.
     */

    public java.util.List<CustomParameter> getUserParameters() {
        return userParameters;
    }

    /**
     * <p>
     * The user parameters of this blueprint.
     * </p>
     * 
     * @param userParameters
     *        The user parameters of this blueprint.
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
     * The user parameters of this blueprint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserParameters(java.util.Collection)} or {@link #withUserParameters(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param userParameters
     *        The user parameters of this blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentBlueprintResult withUserParameters(CustomParameter... userParameters) {
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
     * The user parameters of this blueprint.
     * </p>
     * 
     * @param userParameters
     *        The user parameters of this blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnvironmentBlueprintResult withUserParameters(java.util.Collection<CustomParameter> userParameters) {
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDeploymentProperties() != null)
            sb.append("DeploymentProperties: ").append(getDeploymentProperties()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getGlossaryTerms() != null)
            sb.append("GlossaryTerms: ").append(getGlossaryTerms()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getProvider() != null)
            sb.append("Provider: ").append(getProvider()).append(",");
        if (getProvisioningProperties() != null)
            sb.append("ProvisioningProperties: ").append(getProvisioningProperties()).append(",");
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

        if (obj instanceof GetEnvironmentBlueprintResult == false)
            return false;
        GetEnvironmentBlueprintResult other = (GetEnvironmentBlueprintResult) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDeploymentProperties() == null ^ this.getDeploymentProperties() == null)
            return false;
        if (other.getDeploymentProperties() != null && other.getDeploymentProperties().equals(this.getDeploymentProperties()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getGlossaryTerms() == null ^ this.getGlossaryTerms() == null)
            return false;
        if (other.getGlossaryTerms() != null && other.getGlossaryTerms().equals(this.getGlossaryTerms()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProvider() == null ^ this.getProvider() == null)
            return false;
        if (other.getProvider() != null && other.getProvider().equals(this.getProvider()) == false)
            return false;
        if (other.getProvisioningProperties() == null ^ this.getProvisioningProperties() == null)
            return false;
        if (other.getProvisioningProperties() != null && other.getProvisioningProperties().equals(this.getProvisioningProperties()) == false)
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

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDeploymentProperties() == null) ? 0 : getDeploymentProperties().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getGlossaryTerms() == null) ? 0 : getGlossaryTerms().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProvider() == null) ? 0 : getProvider().hashCode());
        hashCode = prime * hashCode + ((getProvisioningProperties() == null) ? 0 : getProvisioningProperties().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getUserParameters() == null) ? 0 : getUserParameters().hashCode());
        return hashCode;
    }

    @Override
    public GetEnvironmentBlueprintResult clone() {
        try {
            return (GetEnvironmentBlueprintResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
