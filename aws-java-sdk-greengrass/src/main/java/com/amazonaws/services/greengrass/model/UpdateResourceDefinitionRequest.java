/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/UpdateResourceDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateResourceDefinitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The name of the definition. */
    private String name;
    /** The ID of the resource definition. */
    private String resourceDefinitionId;

    /**
     * The name of the definition.
     * 
     * @param name
     *        The name of the definition.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the definition.
     * 
     * @return The name of the definition.
     */

    public String getName() {
        return this.name;
    }

    /**
     * The name of the definition.
     * 
     * @param name
     *        The name of the definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResourceDefinitionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * The ID of the resource definition.
     * 
     * @param resourceDefinitionId
     *        The ID of the resource definition.
     */

    public void setResourceDefinitionId(String resourceDefinitionId) {
        this.resourceDefinitionId = resourceDefinitionId;
    }

    /**
     * The ID of the resource definition.
     * 
     * @return The ID of the resource definition.
     */

    public String getResourceDefinitionId() {
        return this.resourceDefinitionId;
    }

    /**
     * The ID of the resource definition.
     * 
     * @param resourceDefinitionId
     *        The ID of the resource definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResourceDefinitionRequest withResourceDefinitionId(String resourceDefinitionId) {
        setResourceDefinitionId(resourceDefinitionId);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getResourceDefinitionId() != null)
            sb.append("ResourceDefinitionId: ").append(getResourceDefinitionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateResourceDefinitionRequest == false)
            return false;
        UpdateResourceDefinitionRequest other = (UpdateResourceDefinitionRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getResourceDefinitionId() == null ^ this.getResourceDefinitionId() == null)
            return false;
        if (other.getResourceDefinitionId() != null && other.getResourceDefinitionId().equals(this.getResourceDefinitionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getResourceDefinitionId() == null) ? 0 : getResourceDefinitionId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateResourceDefinitionRequest clone() {
        return (UpdateResourceDefinitionRequest) super.clone();
    }

}
