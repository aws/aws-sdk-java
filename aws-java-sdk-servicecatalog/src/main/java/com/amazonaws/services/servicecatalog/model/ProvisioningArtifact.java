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
 * Contains information indicating the ways in which a product can be provisioned.
 * </p>
 */
public class ProvisioningArtifact implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the artifact.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the artifact.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The text description of the artifact.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The UTC timestamp of the creation time.
     * </p>
     */
    private java.util.Date createdTime;

    /**
     * <p>
     * The identifier for the artifact.
     * </p>
     * 
     * @param id
     *        The identifier for the artifact.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for the artifact.
     * </p>
     * 
     * @return The identifier for the artifact.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier for the artifact.
     * </p>
     * 
     * @param id
     *        The identifier for the artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisioningArtifact withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the artifact.
     * </p>
     * 
     * @param name
     *        The name of the artifact.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the artifact.
     * </p>
     * 
     * @return The name of the artifact.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the artifact.
     * </p>
     * 
     * @param name
     *        The name of the artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisioningArtifact withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The text description of the artifact.
     * </p>
     * 
     * @param description
     *        The text description of the artifact.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The text description of the artifact.
     * </p>
     * 
     * @return The text description of the artifact.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The text description of the artifact.
     * </p>
     * 
     * @param description
     *        The text description of the artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisioningArtifact withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The UTC timestamp of the creation time.
     * </p>
     * 
     * @param createdTime
     *        The UTC timestamp of the creation time.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The UTC timestamp of the creation time.
     * </p>
     * 
     * @return The UTC timestamp of the creation time.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The UTC timestamp of the creation time.
     * </p>
     * 
     * @param createdTime
     *        The UTC timestamp of the creation time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProvisioningArtifact withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: " + getCreatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisioningArtifact == false)
            return false;
        ProvisioningArtifact other = (ProvisioningArtifact) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        return hashCode;
    }

    @Override
    public ProvisioningArtifact clone() {
        try {
            return (ProvisioningArtifact) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
