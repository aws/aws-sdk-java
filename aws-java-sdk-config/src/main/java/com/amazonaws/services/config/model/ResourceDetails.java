/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns information about the resource being evaluated.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ResourceDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique resource ID for an evaluation.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The type of resource being evaluated.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The resource definition to be evaluated as per the resource configuration schema type.
     * </p>
     */
    private String resourceConfiguration;
    /**
     * <p>
     * The schema type of the resource configuration.
     * </p>
     */
    private String resourceConfigurationSchemaType;

    /**
     * <p>
     * A unique resource ID for an evaluation.
     * </p>
     * 
     * @param resourceId
     *        A unique resource ID for an evaluation.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * A unique resource ID for an evaluation.
     * </p>
     * 
     * @return A unique resource ID for an evaluation.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * A unique resource ID for an evaluation.
     * </p>
     * 
     * @param resourceId
     *        A unique resource ID for an evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The type of resource being evaluated.
     * </p>
     * 
     * @param resourceType
     *        The type of resource being evaluated.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource being evaluated.
     * </p>
     * 
     * @return The type of resource being evaluated.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource being evaluated.
     * </p>
     * 
     * @param resourceType
     *        The type of resource being evaluated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The resource definition to be evaluated as per the resource configuration schema type.
     * </p>
     * 
     * @param resourceConfiguration
     *        The resource definition to be evaluated as per the resource configuration schema type.
     */

    public void setResourceConfiguration(String resourceConfiguration) {
        this.resourceConfiguration = resourceConfiguration;
    }

    /**
     * <p>
     * The resource definition to be evaluated as per the resource configuration schema type.
     * </p>
     * 
     * @return The resource definition to be evaluated as per the resource configuration schema type.
     */

    public String getResourceConfiguration() {
        return this.resourceConfiguration;
    }

    /**
     * <p>
     * The resource definition to be evaluated as per the resource configuration schema type.
     * </p>
     * 
     * @param resourceConfiguration
     *        The resource definition to be evaluated as per the resource configuration schema type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withResourceConfiguration(String resourceConfiguration) {
        setResourceConfiguration(resourceConfiguration);
        return this;
    }

    /**
     * <p>
     * The schema type of the resource configuration.
     * </p>
     * 
     * @param resourceConfigurationSchemaType
     *        The schema type of the resource configuration.
     * @see ResourceConfigurationSchemaType
     */

    public void setResourceConfigurationSchemaType(String resourceConfigurationSchemaType) {
        this.resourceConfigurationSchemaType = resourceConfigurationSchemaType;
    }

    /**
     * <p>
     * The schema type of the resource configuration.
     * </p>
     * 
     * @return The schema type of the resource configuration.
     * @see ResourceConfigurationSchemaType
     */

    public String getResourceConfigurationSchemaType() {
        return this.resourceConfigurationSchemaType;
    }

    /**
     * <p>
     * The schema type of the resource configuration.
     * </p>
     * 
     * @param resourceConfigurationSchemaType
     *        The schema type of the resource configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceConfigurationSchemaType
     */

    public ResourceDetails withResourceConfigurationSchemaType(String resourceConfigurationSchemaType) {
        setResourceConfigurationSchemaType(resourceConfigurationSchemaType);
        return this;
    }

    /**
     * <p>
     * The schema type of the resource configuration.
     * </p>
     * 
     * @param resourceConfigurationSchemaType
     *        The schema type of the resource configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceConfigurationSchemaType
     */

    public ResourceDetails withResourceConfigurationSchemaType(ResourceConfigurationSchemaType resourceConfigurationSchemaType) {
        this.resourceConfigurationSchemaType = resourceConfigurationSchemaType.toString();
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
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceConfiguration() != null)
            sb.append("ResourceConfiguration: ").append(getResourceConfiguration()).append(",");
        if (getResourceConfigurationSchemaType() != null)
            sb.append("ResourceConfigurationSchemaType: ").append(getResourceConfigurationSchemaType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceDetails == false)
            return false;
        ResourceDetails other = (ResourceDetails) obj;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceConfiguration() == null ^ this.getResourceConfiguration() == null)
            return false;
        if (other.getResourceConfiguration() != null && other.getResourceConfiguration().equals(this.getResourceConfiguration()) == false)
            return false;
        if (other.getResourceConfigurationSchemaType() == null ^ this.getResourceConfigurationSchemaType() == null)
            return false;
        if (other.getResourceConfigurationSchemaType() != null
                && other.getResourceConfigurationSchemaType().equals(this.getResourceConfigurationSchemaType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceConfiguration() == null) ? 0 : getResourceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getResourceConfigurationSchemaType() == null) ? 0 : getResourceConfigurationSchemaType().hashCode());
        return hashCode;
    }

    @Override
    public ResourceDetails clone() {
        try {
            return (ResourceDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.ResourceDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
