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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Configuration ID of the application to be updated.
     * </p>
     */
    private String configurationId;
    /**
     * <p>
     * New name of the application to be updated.
     * </p>
     */
    private String name;
    /**
     * <p>
     * New description of the application to be updated.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Configuration ID of the application to be updated.
     * </p>
     * 
     * @param configurationId
     *        Configuration ID of the application to be updated.
     */

    public void setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
    }

    /**
     * <p>
     * Configuration ID of the application to be updated.
     * </p>
     * 
     * @return Configuration ID of the application to be updated.
     */

    public String getConfigurationId() {
        return this.configurationId;
    }

    /**
     * <p>
     * Configuration ID of the application to be updated.
     * </p>
     * 
     * @param configurationId
     *        Configuration ID of the application to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withConfigurationId(String configurationId) {
        setConfigurationId(configurationId);
        return this;
    }

    /**
     * <p>
     * New name of the application to be updated.
     * </p>
     * 
     * @param name
     *        New name of the application to be updated.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * New name of the application to be updated.
     * </p>
     * 
     * @return New name of the application to be updated.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * New name of the application to be updated.
     * </p>
     * 
     * @param name
     *        New name of the application to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * New description of the application to be updated.
     * </p>
     * 
     * @param description
     *        New description of the application to be updated.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * New description of the application to be updated.
     * </p>
     * 
     * @return New description of the application to be updated.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * New description of the application to be updated.
     * </p>
     * 
     * @param description
     *        New description of the application to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationRequest withDescription(String description) {
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
        if (getConfigurationId() != null)
            sb.append("ConfigurationId: ").append(getConfigurationId()).append(",");
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

        if (obj instanceof UpdateApplicationRequest == false)
            return false;
        UpdateApplicationRequest other = (UpdateApplicationRequest) obj;
        if (other.getConfigurationId() == null ^ this.getConfigurationId() == null)
            return false;
        if (other.getConfigurationId() != null && other.getConfigurationId().equals(this.getConfigurationId()) == false)
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

        hashCode = prime * hashCode + ((getConfigurationId() == null) ? 0 : getConfigurationId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateApplicationRequest clone() {
        return (UpdateApplicationRequest) super.clone();
    }

}
