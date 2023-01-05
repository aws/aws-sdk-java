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
package com.amazonaws.services.fis.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a resource type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/TargetResourceType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetResourceType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The resource type.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * A description of the resource type.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The parameters for the resource type.
     * </p>
     */
    private java.util.Map<String, TargetResourceTypeParameter> parameters;

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceType
     *        The resource type.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @return The resource type.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceType
     *        The resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetResourceType withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * A description of the resource type.
     * </p>
     * 
     * @param description
     *        A description of the resource type.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the resource type.
     * </p>
     * 
     * @return A description of the resource type.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the resource type.
     * </p>
     * 
     * @param description
     *        A description of the resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetResourceType withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The parameters for the resource type.
     * </p>
     * 
     * @return The parameters for the resource type.
     */

    public java.util.Map<String, TargetResourceTypeParameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The parameters for the resource type.
     * </p>
     * 
     * @param parameters
     *        The parameters for the resource type.
     */

    public void setParameters(java.util.Map<String, TargetResourceTypeParameter> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The parameters for the resource type.
     * </p>
     * 
     * @param parameters
     *        The parameters for the resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetResourceType withParameters(java.util.Map<String, TargetResourceTypeParameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see TargetResourceType#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public TargetResourceType addParametersEntry(String key, TargetResourceTypeParameter value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, TargetResourceTypeParameter>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetResourceType clearParametersEntries() {
        this.parameters = null;
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
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetResourceType == false)
            return false;
        TargetResourceType other = (TargetResourceType) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public TargetResourceType clone() {
        try {
            return (TargetResourceType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fis.model.transform.TargetResourceTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
