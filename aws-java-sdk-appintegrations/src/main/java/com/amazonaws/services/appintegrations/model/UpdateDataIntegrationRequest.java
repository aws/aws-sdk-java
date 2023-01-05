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
package com.amazonaws.services.appintegrations.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/UpdateDataIntegration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDataIntegrationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the DataIntegration.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * The name of the DataIntegration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the DataIntegration.
     * </p>
     */
    private String description;

    /**
     * <p>
     * A unique identifier for the DataIntegration.
     * </p>
     * 
     * @param identifier
     *        A unique identifier for the DataIntegration.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * A unique identifier for the DataIntegration.
     * </p>
     * 
     * @return A unique identifier for the DataIntegration.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * A unique identifier for the DataIntegration.
     * </p>
     * 
     * @param identifier
     *        A unique identifier for the DataIntegration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataIntegrationRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * The name of the DataIntegration.
     * </p>
     * 
     * @param name
     *        The name of the DataIntegration.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the DataIntegration.
     * </p>
     * 
     * @return The name of the DataIntegration.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the DataIntegration.
     * </p>
     * 
     * @param name
     *        The name of the DataIntegration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataIntegrationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the DataIntegration.
     * </p>
     * 
     * @param description
     *        A description of the DataIntegration.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the DataIntegration.
     * </p>
     * 
     * @return A description of the DataIntegration.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the DataIntegration.
     * </p>
     * 
     * @param description
     *        A description of the DataIntegration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataIntegrationRequest withDescription(String description) {
        setDescription(description);
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
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDataIntegrationRequest == false)
            return false;
        UpdateDataIntegrationRequest other = (UpdateDataIntegrationRequest) obj;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDataIntegrationRequest clone() {
        return (UpdateDataIntegrationRequest) super.clone();
    }

}
