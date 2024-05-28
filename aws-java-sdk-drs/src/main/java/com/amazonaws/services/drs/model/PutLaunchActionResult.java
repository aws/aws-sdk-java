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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/PutLaunchAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutLaunchActionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Launch action code.
     * </p>
     */
    private String actionCode;

    private String actionId;

    private String actionVersion;
    /**
     * <p>
     * Whether the launch action is active.
     * </p>
     */
    private Boolean active;

    private String category;

    private String description;

    private String name;
    /**
     * <p>
     * Whether the launch will not be marked as failed if this action fails.
     * </p>
     */
    private Boolean optional;

    private Integer order;

    private java.util.Map<String, LaunchActionParameter> parameters;

    private String resourceId;
    /**
     * <p>
     * Launch action type.
     * </p>
     */
    private String type;

    /**
     * <p>
     * Launch action code.
     * </p>
     * 
     * @param actionCode
     *        Launch action code.
     */

    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }

    /**
     * <p>
     * Launch action code.
     * </p>
     * 
     * @return Launch action code.
     */

    public String getActionCode() {
        return this.actionCode;
    }

    /**
     * <p>
     * Launch action code.
     * </p>
     * 
     * @param actionCode
     *        Launch action code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutLaunchActionResult withActionCode(String actionCode) {
        setActionCode(actionCode);
        return this;
    }

    /**
     * @param actionId
     */

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    /**
     * @return
     */

    public String getActionId() {
        return this.actionId;
    }

    /**
     * @param actionId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutLaunchActionResult withActionId(String actionId) {
        setActionId(actionId);
        return this;
    }

    /**
     * @param actionVersion
     */

    public void setActionVersion(String actionVersion) {
        this.actionVersion = actionVersion;
    }

    /**
     * @return
     */

    public String getActionVersion() {
        return this.actionVersion;
    }

    /**
     * @param actionVersion
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutLaunchActionResult withActionVersion(String actionVersion) {
        setActionVersion(actionVersion);
        return this;
    }

    /**
     * <p>
     * Whether the launch action is active.
     * </p>
     * 
     * @param active
     *        Whether the launch action is active.
     */

    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * <p>
     * Whether the launch action is active.
     * </p>
     * 
     * @return Whether the launch action is active.
     */

    public Boolean getActive() {
        return this.active;
    }

    /**
     * <p>
     * Whether the launch action is active.
     * </p>
     * 
     * @param active
     *        Whether the launch action is active.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutLaunchActionResult withActive(Boolean active) {
        setActive(active);
        return this;
    }

    /**
     * <p>
     * Whether the launch action is active.
     * </p>
     * 
     * @return Whether the launch action is active.
     */

    public Boolean isActive() {
        return this.active;
    }

    /**
     * @param category
     * @see LaunchActionCategory
     */

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return
     * @see LaunchActionCategory
     */

    public String getCategory() {
        return this.category;
    }

    /**
     * @param category
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchActionCategory
     */

    public PutLaunchActionResult withCategory(String category) {
        setCategory(category);
        return this;
    }

    /**
     * @param category
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchActionCategory
     */

    public PutLaunchActionResult withCategory(LaunchActionCategory category) {
        this.category = category.toString();
        return this;
    }

    /**
     * @param description
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * @param description
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutLaunchActionResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */

    public String getName() {
        return this.name;
    }

    /**
     * @param name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutLaunchActionResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Whether the launch will not be marked as failed if this action fails.
     * </p>
     * 
     * @param optional
     *        Whether the launch will not be marked as failed if this action fails.
     */

    public void setOptional(Boolean optional) {
        this.optional = optional;
    }

    /**
     * <p>
     * Whether the launch will not be marked as failed if this action fails.
     * </p>
     * 
     * @return Whether the launch will not be marked as failed if this action fails.
     */

    public Boolean getOptional() {
        return this.optional;
    }

    /**
     * <p>
     * Whether the launch will not be marked as failed if this action fails.
     * </p>
     * 
     * @param optional
     *        Whether the launch will not be marked as failed if this action fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutLaunchActionResult withOptional(Boolean optional) {
        setOptional(optional);
        return this;
    }

    /**
     * <p>
     * Whether the launch will not be marked as failed if this action fails.
     * </p>
     * 
     * @return Whether the launch will not be marked as failed if this action fails.
     */

    public Boolean isOptional() {
        return this.optional;
    }

    /**
     * @param order
     */

    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * @return
     */

    public Integer getOrder() {
        return this.order;
    }

    /**
     * @param order
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutLaunchActionResult withOrder(Integer order) {
        setOrder(order);
        return this;
    }

    /**
     * @return
     */

    public java.util.Map<String, LaunchActionParameter> getParameters() {
        return parameters;
    }

    /**
     * @param parameters
     */

    public void setParameters(java.util.Map<String, LaunchActionParameter> parameters) {
        this.parameters = parameters;
    }

    /**
     * @param parameters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutLaunchActionResult withParameters(java.util.Map<String, LaunchActionParameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see PutLaunchActionResult#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public PutLaunchActionResult addParametersEntry(String key, LaunchActionParameter value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, LaunchActionParameter>();
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

    public PutLaunchActionResult clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * @param resourceId
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * @return
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @param resourceId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutLaunchActionResult withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * Launch action type.
     * </p>
     * 
     * @param type
     *        Launch action type.
     * @see LaunchActionType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Launch action type.
     * </p>
     * 
     * @return Launch action type.
     * @see LaunchActionType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Launch action type.
     * </p>
     * 
     * @param type
     *        Launch action type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchActionType
     */

    public PutLaunchActionResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Launch action type.
     * </p>
     * 
     * @param type
     *        Launch action type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchActionType
     */

    public PutLaunchActionResult withType(LaunchActionType type) {
        this.type = type.toString();
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
        if (getActionCode() != null)
            sb.append("ActionCode: ").append(getActionCode()).append(",");
        if (getActionId() != null)
            sb.append("ActionId: ").append(getActionId()).append(",");
        if (getActionVersion() != null)
            sb.append("ActionVersion: ").append(getActionVersion()).append(",");
        if (getActive() != null)
            sb.append("Active: ").append(getActive()).append(",");
        if (getCategory() != null)
            sb.append("Category: ").append(getCategory()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOptional() != null)
            sb.append("Optional: ").append(getOptional()).append(",");
        if (getOrder() != null)
            sb.append("Order: ").append(getOrder()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutLaunchActionResult == false)
            return false;
        PutLaunchActionResult other = (PutLaunchActionResult) obj;
        if (other.getActionCode() == null ^ this.getActionCode() == null)
            return false;
        if (other.getActionCode() != null && other.getActionCode().equals(this.getActionCode()) == false)
            return false;
        if (other.getActionId() == null ^ this.getActionId() == null)
            return false;
        if (other.getActionId() != null && other.getActionId().equals(this.getActionId()) == false)
            return false;
        if (other.getActionVersion() == null ^ this.getActionVersion() == null)
            return false;
        if (other.getActionVersion() != null && other.getActionVersion().equals(this.getActionVersion()) == false)
            return false;
        if (other.getActive() == null ^ this.getActive() == null)
            return false;
        if (other.getActive() != null && other.getActive().equals(this.getActive()) == false)
            return false;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOptional() == null ^ this.getOptional() == null)
            return false;
        if (other.getOptional() != null && other.getOptional().equals(this.getOptional()) == false)
            return false;
        if (other.getOrder() == null ^ this.getOrder() == null)
            return false;
        if (other.getOrder() != null && other.getOrder().equals(this.getOrder()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
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

        hashCode = prime * hashCode + ((getActionCode() == null) ? 0 : getActionCode().hashCode());
        hashCode = prime * hashCode + ((getActionId() == null) ? 0 : getActionId().hashCode());
        hashCode = prime * hashCode + ((getActionVersion() == null) ? 0 : getActionVersion().hashCode());
        hashCode = prime * hashCode + ((getActive() == null) ? 0 : getActive().hashCode());
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOptional() == null) ? 0 : getOptional().hashCode());
        hashCode = prime * hashCode + ((getOrder() == null) ? 0 : getOrder().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public PutLaunchActionResult clone() {
        try {
            return (PutLaunchActionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
