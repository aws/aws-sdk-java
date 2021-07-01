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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateActionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the action. Must be unique to your account in an Amazon Web Services Region.
     * </p>
     */
    private String actionName;
    /**
     * <p>
     * The source type, ID, and URI.
     * </p>
     */
    private ActionSource source;
    /**
     * <p>
     * The action type.
     * </p>
     */
    private String actionType;
    /**
     * <p>
     * The description of the action.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The status of the action.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A list of properties to add to the action.
     * </p>
     */
    private java.util.Map<String, String> properties;

    private MetadataProperties metadataProperties;
    /**
     * <p>
     * A list of tags to apply to the action.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the action. Must be unique to your account in an Amazon Web Services Region.
     * </p>
     * 
     * @param actionName
     *        The name of the action. Must be unique to your account in an Amazon Web Services Region.
     */

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * <p>
     * The name of the action. Must be unique to your account in an Amazon Web Services Region.
     * </p>
     * 
     * @return The name of the action. Must be unique to your account in an Amazon Web Services Region.
     */

    public String getActionName() {
        return this.actionName;
    }

    /**
     * <p>
     * The name of the action. Must be unique to your account in an Amazon Web Services Region.
     * </p>
     * 
     * @param actionName
     *        The name of the action. Must be unique to your account in an Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateActionRequest withActionName(String actionName) {
        setActionName(actionName);
        return this;
    }

    /**
     * <p>
     * The source type, ID, and URI.
     * </p>
     * 
     * @param source
     *        The source type, ID, and URI.
     */

    public void setSource(ActionSource source) {
        this.source = source;
    }

    /**
     * <p>
     * The source type, ID, and URI.
     * </p>
     * 
     * @return The source type, ID, and URI.
     */

    public ActionSource getSource() {
        return this.source;
    }

    /**
     * <p>
     * The source type, ID, and URI.
     * </p>
     * 
     * @param source
     *        The source type, ID, and URI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateActionRequest withSource(ActionSource source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The action type.
     * </p>
     * 
     * @param actionType
     *        The action type.
     */

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * <p>
     * The action type.
     * </p>
     * 
     * @return The action type.
     */

    public String getActionType() {
        return this.actionType;
    }

    /**
     * <p>
     * The action type.
     * </p>
     * 
     * @param actionType
     *        The action type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateActionRequest withActionType(String actionType) {
        setActionType(actionType);
        return this;
    }

    /**
     * <p>
     * The description of the action.
     * </p>
     * 
     * @param description
     *        The description of the action.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the action.
     * </p>
     * 
     * @return The description of the action.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the action.
     * </p>
     * 
     * @param description
     *        The description of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateActionRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * 
     * @param status
     *        The status of the action.
     * @see ActionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * 
     * @return The status of the action.
     * @see ActionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * 
     * @param status
     *        The status of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionStatus
     */

    public CreateActionRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the action.
     * </p>
     * 
     * @param status
     *        The status of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionStatus
     */

    public CreateActionRequest withStatus(ActionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A list of properties to add to the action.
     * </p>
     * 
     * @return A list of properties to add to the action.
     */

    public java.util.Map<String, String> getProperties() {
        return properties;
    }

    /**
     * <p>
     * A list of properties to add to the action.
     * </p>
     * 
     * @param properties
     *        A list of properties to add to the action.
     */

    public void setProperties(java.util.Map<String, String> properties) {
        this.properties = properties;
    }

    /**
     * <p>
     * A list of properties to add to the action.
     * </p>
     * 
     * @param properties
     *        A list of properties to add to the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateActionRequest withProperties(java.util.Map<String, String> properties) {
        setProperties(properties);
        return this;
    }

    /**
     * Add a single Properties entry
     *
     * @see CreateActionRequest#withProperties
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateActionRequest addPropertiesEntry(String key, String value) {
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

    public CreateActionRequest clearPropertiesEntries() {
        this.properties = null;
        return this;
    }

    /**
     * @param metadataProperties
     */

    public void setMetadataProperties(MetadataProperties metadataProperties) {
        this.metadataProperties = metadataProperties;
    }

    /**
     * @return
     */

    public MetadataProperties getMetadataProperties() {
        return this.metadataProperties;
    }

    /**
     * @param metadataProperties
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateActionRequest withMetadataProperties(MetadataProperties metadataProperties) {
        setMetadataProperties(metadataProperties);
        return this;
    }

    /**
     * <p>
     * A list of tags to apply to the action.
     * </p>
     * 
     * @return A list of tags to apply to the action.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags to apply to the action.
     * </p>
     * 
     * @param tags
     *        A list of tags to apply to the action.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags to apply to the action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags to apply to the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateActionRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags to apply to the action.
     * </p>
     * 
     * @param tags
     *        A list of tags to apply to the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateActionRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getActionType() != null)
            sb.append("ActionType: ").append(getActionType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getProperties() != null)
            sb.append("Properties: ").append(getProperties()).append(",");
        if (getMetadataProperties() != null)
            sb.append("MetadataProperties: ").append(getMetadataProperties()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateActionRequest == false)
            return false;
        CreateActionRequest other = (CreateActionRequest) obj;
        if (other.getActionName() == null ^ this.getActionName() == null)
            return false;
        if (other.getActionName() != null && other.getActionName().equals(this.getActionName()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getActionType() == null ^ this.getActionType() == null)
            return false;
        if (other.getActionType() != null && other.getActionType().equals(this.getActionType()) == false)
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
        if (other.getMetadataProperties() == null ^ this.getMetadataProperties() == null)
            return false;
        if (other.getMetadataProperties() != null && other.getMetadataProperties().equals(this.getMetadataProperties()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionName() == null) ? 0 : getActionName().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getActionType() == null) ? 0 : getActionType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        hashCode = prime * hashCode + ((getMetadataProperties() == null) ? 0 : getMetadataProperties().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateActionRequest clone() {
        return (CreateActionRequest) super.clone();
    }

}
