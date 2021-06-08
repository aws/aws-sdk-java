/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdateAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateActionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the action to update.
     * </p>
     */
    private String actionName;
    /**
     * <p>
     * The new description for the action.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The new status for the action.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The new list of properties. Overwrites the current property list.
     * </p>
     */
    private java.util.Map<String, String> properties;
    /**
     * <p>
     * A list of properties to remove.
     * </p>
     */
    private java.util.List<String> propertiesToRemove;

    /**
     * <p>
     * The name of the action to update.
     * </p>
     * 
     * @param actionName
     *        The name of the action to update.
     */

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * <p>
     * The name of the action to update.
     * </p>
     * 
     * @return The name of the action to update.
     */

    public String getActionName() {
        return this.actionName;
    }

    /**
     * <p>
     * The name of the action to update.
     * </p>
     * 
     * @param actionName
     *        The name of the action to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateActionRequest withActionName(String actionName) {
        setActionName(actionName);
        return this;
    }

    /**
     * <p>
     * The new description for the action.
     * </p>
     * 
     * @param description
     *        The new description for the action.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The new description for the action.
     * </p>
     * 
     * @return The new description for the action.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The new description for the action.
     * </p>
     * 
     * @param description
     *        The new description for the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateActionRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The new status for the action.
     * </p>
     * 
     * @param status
     *        The new status for the action.
     * @see ActionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The new status for the action.
     * </p>
     * 
     * @return The new status for the action.
     * @see ActionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The new status for the action.
     * </p>
     * 
     * @param status
     *        The new status for the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionStatus
     */

    public UpdateActionRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The new status for the action.
     * </p>
     * 
     * @param status
     *        The new status for the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionStatus
     */

    public UpdateActionRequest withStatus(ActionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The new list of properties. Overwrites the current property list.
     * </p>
     * 
     * @return The new list of properties. Overwrites the current property list.
     */

    public java.util.Map<String, String> getProperties() {
        return properties;
    }

    /**
     * <p>
     * The new list of properties. Overwrites the current property list.
     * </p>
     * 
     * @param properties
     *        The new list of properties. Overwrites the current property list.
     */

    public void setProperties(java.util.Map<String, String> properties) {
        this.properties = properties;
    }

    /**
     * <p>
     * The new list of properties. Overwrites the current property list.
     * </p>
     * 
     * @param properties
     *        The new list of properties. Overwrites the current property list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateActionRequest withProperties(java.util.Map<String, String> properties) {
        setProperties(properties);
        return this;
    }

    /**
     * Add a single Properties entry
     *
     * @see UpdateActionRequest#withProperties
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateActionRequest addPropertiesEntry(String key, String value) {
        if (null == this.properties) {
            this.properties = new java.util.HashMap<String, String>();
        }
        if (this.properties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.properties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Properties.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateActionRequest clearPropertiesEntries() {
        this.properties = null;
        return this;
    }

    /**
     * <p>
     * A list of properties to remove.
     * </p>
     * 
     * @return A list of properties to remove.
     */

    public java.util.List<String> getPropertiesToRemove() {
        return propertiesToRemove;
    }

    /**
     * <p>
     * A list of properties to remove.
     * </p>
     * 
     * @param propertiesToRemove
     *        A list of properties to remove.
     */

    public void setPropertiesToRemove(java.util.Collection<String> propertiesToRemove) {
        if (propertiesToRemove == null) {
            this.propertiesToRemove = null;
            return;
        }

        this.propertiesToRemove = new java.util.ArrayList<String>(propertiesToRemove);
    }

    /**
     * <p>
     * A list of properties to remove.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPropertiesToRemove(java.util.Collection)} or {@link #withPropertiesToRemove(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param propertiesToRemove
     *        A list of properties to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateActionRequest withPropertiesToRemove(String... propertiesToRemove) {
        if (this.propertiesToRemove == null) {
            setPropertiesToRemove(new java.util.ArrayList<String>(propertiesToRemove.length));
        }
        for (String ele : propertiesToRemove) {
            this.propertiesToRemove.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of properties to remove.
     * </p>
     * 
     * @param propertiesToRemove
     *        A list of properties to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateActionRequest withPropertiesToRemove(java.util.Collection<String> propertiesToRemove) {
        setPropertiesToRemove(propertiesToRemove);
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
        if (getActionName() != null)
            sb.append("ActionName: ").append(getActionName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getProperties() != null)
            sb.append("Properties: ").append(getProperties()).append(",");
        if (getPropertiesToRemove() != null)
            sb.append("PropertiesToRemove: ").append(getPropertiesToRemove());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateActionRequest == false)
            return false;
        UpdateActionRequest other = (UpdateActionRequest) obj;
        if (other.getActionName() == null ^ this.getActionName() == null)
            return false;
        if (other.getActionName() != null && other.getActionName().equals(this.getActionName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false)
            return false;
        if (other.getPropertiesToRemove() == null ^ this.getPropertiesToRemove() == null)
            return false;
        if (other.getPropertiesToRemove() != null && other.getPropertiesToRemove().equals(this.getPropertiesToRemove()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionName() == null) ? 0 : getActionName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        hashCode = prime * hashCode + ((getPropertiesToRemove() == null) ? 0 : getPropertiesToRemove().hashCode());
        return hashCode;
    }

    @Override
    public UpdateActionRequest clone() {
        return (UpdateActionRequest) super.clone();
    }

}
