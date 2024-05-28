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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/UpdateConfiguredTable" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateConfiguredTableRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the configured table to update. Currently accepts the configured table ID.
     * </p>
     */
    private String configuredTableIdentifier;
    /**
     * <p>
     * A new name for the configured table.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A new description for the configured table.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The identifier for the configured table to update. Currently accepts the configured table ID.
     * </p>
     * 
     * @param configuredTableIdentifier
     *        The identifier for the configured table to update. Currently accepts the configured table ID.
     */

    public void setConfiguredTableIdentifier(String configuredTableIdentifier) {
        this.configuredTableIdentifier = configuredTableIdentifier;
    }

    /**
     * <p>
     * The identifier for the configured table to update. Currently accepts the configured table ID.
     * </p>
     * 
     * @return The identifier for the configured table to update. Currently accepts the configured table ID.
     */

    public String getConfiguredTableIdentifier() {
        return this.configuredTableIdentifier;
    }

    /**
     * <p>
     * The identifier for the configured table to update. Currently accepts the configured table ID.
     * </p>
     * 
     * @param configuredTableIdentifier
     *        The identifier for the configured table to update. Currently accepts the configured table ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfiguredTableRequest withConfiguredTableIdentifier(String configuredTableIdentifier) {
        setConfiguredTableIdentifier(configuredTableIdentifier);
        return this;
    }

    /**
     * <p>
     * A new name for the configured table.
     * </p>
     * 
     * @param name
     *        A new name for the configured table.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A new name for the configured table.
     * </p>
     * 
     * @return A new name for the configured table.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A new name for the configured table.
     * </p>
     * 
     * @param name
     *        A new name for the configured table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfiguredTableRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A new description for the configured table.
     * </p>
     * 
     * @param description
     *        A new description for the configured table.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A new description for the configured table.
     * </p>
     * 
     * @return A new description for the configured table.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A new description for the configured table.
     * </p>
     * 
     * @param description
     *        A new description for the configured table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfiguredTableRequest withDescription(String description) {
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
        if (getConfiguredTableIdentifier() != null)
            sb.append("ConfiguredTableIdentifier: ").append(getConfiguredTableIdentifier()).append(",");
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

        if (obj instanceof UpdateConfiguredTableRequest == false)
            return false;
        UpdateConfiguredTableRequest other = (UpdateConfiguredTableRequest) obj;
        if (other.getConfiguredTableIdentifier() == null ^ this.getConfiguredTableIdentifier() == null)
            return false;
        if (other.getConfiguredTableIdentifier() != null && other.getConfiguredTableIdentifier().equals(this.getConfiguredTableIdentifier()) == false)
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

        hashCode = prime * hashCode + ((getConfiguredTableIdentifier() == null) ? 0 : getConfiguredTableIdentifier().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateConfiguredTableRequest clone() {
        return (UpdateConfiguredTableRequest) super.clone();
    }

}
