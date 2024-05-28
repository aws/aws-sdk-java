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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of an environment blueprint summary.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/EnvironmentBlueprintSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnvironmentBlueprintSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The timestamp of when an environment blueprint was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The description of a blueprint.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The identifier of the blueprint.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the blueprint.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The provider of the blueprint.
     * </p>
     */
    private String provider;
    /**
     * <p>
     * The provisioning properties of the blueprint.
     * </p>
     */
    private ProvisioningProperties provisioningProperties;
    /**
     * <p>
     * The timestamp of when the blueprint was enabled.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The timestamp of when an environment blueprint was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when an environment blueprint was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when an environment blueprint was created.
     * </p>
     * 
     * @return The timestamp of when an environment blueprint was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when an environment blueprint was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when an environment blueprint was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentBlueprintSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The description of a blueprint.
     * </p>
     * 
     * @param description
     *        The description of a blueprint.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of a blueprint.
     * </p>
     * 
     * @return The description of a blueprint.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of a blueprint.
     * </p>
     * 
     * @param description
     *        The description of a blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentBlueprintSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The identifier of the blueprint.
     * </p>
     * 
     * @param id
     *        The identifier of the blueprint.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the blueprint.
     * </p>
     * 
     * @return The identifier of the blueprint.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the blueprint.
     * </p>
     * 
     * @param id
     *        The identifier of the blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentBlueprintSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the blueprint.
     * </p>
     * 
     * @param name
     *        The name of the blueprint.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the blueprint.
     * </p>
     * 
     * @return The name of the blueprint.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the blueprint.
     * </p>
     * 
     * @param name
     *        The name of the blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentBlueprintSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The provider of the blueprint.
     * </p>
     * 
     * @param provider
     *        The provider of the blueprint.
     */

    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * <p>
     * The provider of the blueprint.
     * </p>
     * 
     * @return The provider of the blueprint.
     */

    public String getProvider() {
        return this.provider;
    }

    /**
     * <p>
     * The provider of the blueprint.
     * </p>
     * 
     * @param provider
     *        The provider of the blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentBlueprintSummary withProvider(String provider) {
        setProvider(provider);
        return this;
    }

    /**
     * <p>
     * The provisioning properties of the blueprint.
     * </p>
     * 
     * @param provisioningProperties
     *        The provisioning properties of the blueprint.
     */

    public void setProvisioningProperties(ProvisioningProperties provisioningProperties) {
        this.provisioningProperties = provisioningProperties;
    }

    /**
     * <p>
     * The provisioning properties of the blueprint.
     * </p>
     * 
     * @return The provisioning properties of the blueprint.
     */

    public ProvisioningProperties getProvisioningProperties() {
        return this.provisioningProperties;
    }

    /**
     * <p>
     * The provisioning properties of the blueprint.
     * </p>
     * 
     * @param provisioningProperties
     *        The provisioning properties of the blueprint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentBlueprintSummary withProvisioningProperties(ProvisioningProperties provisioningProperties) {
        setProvisioningProperties(provisioningProperties);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the blueprint was enabled.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the blueprint was enabled.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the blueprint was enabled.
     * </p>
     * 
     * @return The timestamp of when the blueprint was enabled.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the blueprint was enabled.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the blueprint was enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentBlueprintSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getProvider() != null)
            sb.append("Provider: ").append(getProvider()).append(",");
        if (getProvisioningProperties() != null)
            sb.append("ProvisioningProperties: ").append(getProvisioningProperties()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnvironmentBlueprintSummary == false)
            return false;
        EnvironmentBlueprintSummary other = (EnvironmentBlueprintSummary) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProvider() == null) ? 0 : getProvider().hashCode());
        hashCode = prime * hashCode + ((getProvisioningProperties() == null) ? 0 : getProvisioningProperties().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public EnvironmentBlueprintSummary clone() {
        try {
            return (EnvironmentBlueprintSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.EnvironmentBlueprintSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
