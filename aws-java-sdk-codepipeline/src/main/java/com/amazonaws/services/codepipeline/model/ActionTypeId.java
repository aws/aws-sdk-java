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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;

/**
 * <p>
 * Represents information about an action type.
 * </p>
 */
public class ActionTypeId implements Serializable, Cloneable {

    /**
     * <p>
     * A category defines what kind of action can be taken in the stage, and constrains the provider type for the
     * action. Valid categories are limited to one of the values below.
     * </p>
     */
    private String category;
    /**
     * <p>
     * The creator of the action being called.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * The provider of the service being called by the action. Valid providers are determined by the action category.
     * For example, an action in the Deploy category type might have a provider of AWS CodeDeploy, which would be
     * specified as CodeDeploy.
     * </p>
     */
    private String provider;
    /**
     * <p>
     * A string that identifies the action type.
     * </p>
     */
    private String version;

    /**
     * <p>
     * A category defines what kind of action can be taken in the stage, and constrains the provider type for the
     * action. Valid categories are limited to one of the values below.
     * </p>
     * 
     * @param category
     *        A category defines what kind of action can be taken in the stage, and constrains the provider type for the
     *        action. Valid categories are limited to one of the values below.
     * @see ActionCategory
     */

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * A category defines what kind of action can be taken in the stage, and constrains the provider type for the
     * action. Valid categories are limited to one of the values below.
     * </p>
     * 
     * @return A category defines what kind of action can be taken in the stage, and constrains the provider type for
     *         the action. Valid categories are limited to one of the values below.
     * @see ActionCategory
     */

    public String getCategory() {
        return this.category;
    }

    /**
     * <p>
     * A category defines what kind of action can be taken in the stage, and constrains the provider type for the
     * action. Valid categories are limited to one of the values below.
     * </p>
     * 
     * @param category
     *        A category defines what kind of action can be taken in the stage, and constrains the provider type for the
     *        action. Valid categories are limited to one of the values below.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionCategory
     */

    public ActionTypeId withCategory(String category) {
        setCategory(category);
        return this;
    }

    /**
     * <p>
     * A category defines what kind of action can be taken in the stage, and constrains the provider type for the
     * action. Valid categories are limited to one of the values below.
     * </p>
     * 
     * @param category
     *        A category defines what kind of action can be taken in the stage, and constrains the provider type for the
     *        action. Valid categories are limited to one of the values below.
     * @see ActionCategory
     */

    public void setCategory(ActionCategory category) {
        this.category = category.toString();
    }

    /**
     * <p>
     * A category defines what kind of action can be taken in the stage, and constrains the provider type for the
     * action. Valid categories are limited to one of the values below.
     * </p>
     * 
     * @param category
     *        A category defines what kind of action can be taken in the stage, and constrains the provider type for the
     *        action. Valid categories are limited to one of the values below.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionCategory
     */

    public ActionTypeId withCategory(ActionCategory category) {
        setCategory(category);
        return this;
    }

    /**
     * <p>
     * The creator of the action being called.
     * </p>
     * 
     * @param owner
     *        The creator of the action being called.
     * @see ActionOwner
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The creator of the action being called.
     * </p>
     * 
     * @return The creator of the action being called.
     * @see ActionOwner
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The creator of the action being called.
     * </p>
     * 
     * @param owner
     *        The creator of the action being called.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionOwner
     */

    public ActionTypeId withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * The creator of the action being called.
     * </p>
     * 
     * @param owner
     *        The creator of the action being called.
     * @see ActionOwner
     */

    public void setOwner(ActionOwner owner) {
        this.owner = owner.toString();
    }

    /**
     * <p>
     * The creator of the action being called.
     * </p>
     * 
     * @param owner
     *        The creator of the action being called.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionOwner
     */

    public ActionTypeId withOwner(ActionOwner owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * The provider of the service being called by the action. Valid providers are determined by the action category.
     * For example, an action in the Deploy category type might have a provider of AWS CodeDeploy, which would be
     * specified as CodeDeploy.
     * </p>
     * 
     * @param provider
     *        The provider of the service being called by the action. Valid providers are determined by the action
     *        category. For example, an action in the Deploy category type might have a provider of AWS CodeDeploy,
     *        which would be specified as CodeDeploy.
     */

    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * <p>
     * The provider of the service being called by the action. Valid providers are determined by the action category.
     * For example, an action in the Deploy category type might have a provider of AWS CodeDeploy, which would be
     * specified as CodeDeploy.
     * </p>
     * 
     * @return The provider of the service being called by the action. Valid providers are determined by the action
     *         category. For example, an action in the Deploy category type might have a provider of AWS CodeDeploy,
     *         which would be specified as CodeDeploy.
     */

    public String getProvider() {
        return this.provider;
    }

    /**
     * <p>
     * The provider of the service being called by the action. Valid providers are determined by the action category.
     * For example, an action in the Deploy category type might have a provider of AWS CodeDeploy, which would be
     * specified as CodeDeploy.
     * </p>
     * 
     * @param provider
     *        The provider of the service being called by the action. Valid providers are determined by the action
     *        category. For example, an action in the Deploy category type might have a provider of AWS CodeDeploy,
     *        which would be specified as CodeDeploy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionTypeId withProvider(String provider) {
        setProvider(provider);
        return this;
    }

    /**
     * <p>
     * A string that identifies the action type.
     * </p>
     * 
     * @param version
     *        A string that identifies the action type.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * A string that identifies the action type.
     * </p>
     * 
     * @return A string that identifies the action type.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * A string that identifies the action type.
     * </p>
     * 
     * @param version
     *        A string that identifies the action type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionTypeId withVersion(String version) {
        setVersion(version);
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
        if (getCategory() != null)
            sb.append("Category: " + getCategory() + ",");
        if (getOwner() != null)
            sb.append("Owner: " + getOwner() + ",");
        if (getProvider() != null)
            sb.append("Provider: " + getProvider() + ",");
        if (getVersion() != null)
            sb.append("Version: " + getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActionTypeId == false)
            return false;
        ActionTypeId other = (ActionTypeId) obj;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getProvider() == null ^ this.getProvider() == null)
            return false;
        if (other.getProvider() != null && other.getProvider().equals(this.getProvider()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getProvider() == null) ? 0 : getProvider().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public ActionTypeId clone() {
        try {
            return (ActionTypeId) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
