/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

/**
 * <p>
 * Provisioning artifact properties.
 * </p>
 */
public class ProvisioningArtifactProperties implements Serializable, Cloneable {

    /**
     * <p>
     * The name assigned to the provisioning artifact properties.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The text description of the provisioning artifact properties.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Additional information about the provisioning artifact properties.
     * </p>
     */
    private java.util.Map<String, String> info;
    /**
     * <p>
     * The type of the provisioning artifact properties.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The name assigned to the provisioning artifact properties.
     * </p>
     * 
     * @param name
     *        The name assigned to the provisioning artifact properties.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name assigned to the provisioning artifact properties.
     * </p>
     * 
     * @return The name assigned to the provisioning artifact properties.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name assigned to the provisioning artifact properties.
     * </p>
     * 
     * @param name
     *        The name assigned to the provisioning artifact properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisioningArtifactProperties withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The text description of the provisioning artifact properties.
     * </p>
     * 
     * @param description
     *        The text description of the provisioning artifact properties.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The text description of the provisioning artifact properties.
     * </p>
     * 
     * @return The text description of the provisioning artifact properties.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The text description of the provisioning artifact properties.
     * </p>
     * 
     * @param description
     *        The text description of the provisioning artifact properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisioningArtifactProperties withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Additional information about the provisioning artifact properties.
     * </p>
     * 
     * @return Additional information about the provisioning artifact properties.
     */

    public java.util.Map<String, String> getInfo() {
        return info;
    }

    /**
     * <p>
     * Additional information about the provisioning artifact properties.
     * </p>
     * 
     * @param info
     *        Additional information about the provisioning artifact properties.
     */

    public void setInfo(java.util.Map<String, String> info) {
        this.info = info;
    }

    /**
     * <p>
     * Additional information about the provisioning artifact properties.
     * </p>
     * 
     * @param info
     *        Additional information about the provisioning artifact properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisioningArtifactProperties withInfo(java.util.Map<String, String> info) {
        setInfo(info);
        return this;
    }

    public ProvisioningArtifactProperties addInfoEntry(String key, String value) {
        if (null == this.info) {
            this.info = new java.util.HashMap<String, String>();
        }
        if (this.info.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.info.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Info.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisioningArtifactProperties clearInfoEntries() {
        this.info = null;
        return this;
    }

    /**
     * <p>
     * The type of the provisioning artifact properties.
     * </p>
     * 
     * @param type
     *        The type of the provisioning artifact properties.
     * @see ProvisioningArtifactType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the provisioning artifact properties.
     * </p>
     * 
     * @return The type of the provisioning artifact properties.
     * @see ProvisioningArtifactType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the provisioning artifact properties.
     * </p>
     * 
     * @param type
     *        The type of the provisioning artifact properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProvisioningArtifactType
     */

    public ProvisioningArtifactProperties withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the provisioning artifact properties.
     * </p>
     * 
     * @param type
     *        The type of the provisioning artifact properties.
     * @see ProvisioningArtifactType
     */

    public void setType(ProvisioningArtifactType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of the provisioning artifact properties.
     * </p>
     * 
     * @param type
     *        The type of the provisioning artifact properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProvisioningArtifactType
     */

    public ProvisioningArtifactProperties withType(ProvisioningArtifactType type) {
        setType(type);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getInfo() != null)
            sb.append("Info: " + getInfo() + ",");
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisioningArtifactProperties == false)
            return false;
        ProvisioningArtifactProperties other = (ProvisioningArtifactProperties) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getInfo() == null ^ this.getInfo() == null)
            return false;
        if (other.getInfo() != null && other.getInfo().equals(this.getInfo()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getInfo() == null) ? 0 : getInfo().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public ProvisioningArtifactProperties clone() {
        try {
            return (ProvisioningArtifactProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
