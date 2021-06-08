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
package com.amazonaws.services.fis.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an action. For more information, see <a
 * href="https://docs.aws.amazon.com/fis/latest/userguide/fis-actions-reference.html">AWS FIS actions</a> in the <i>AWS
 * Fault Injection Simulator User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/Action" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Action implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the action.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The description for the action.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The action parameters, if applicable.
     * </p>
     */
    private java.util.Map<String, ActionParameter> parameters;
    /**
     * <p>
     * The supported targets for the action.
     * </p>
     */
    private java.util.Map<String, ActionTarget> targets;
    /**
     * <p>
     * The tags for the action.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ID of the action.
     * </p>
     * 
     * @param id
     *        The ID of the action.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the action.
     * </p>
     * 
     * @return The ID of the action.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the action.
     * </p>
     * 
     * @param id
     *        The ID of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The description for the action.
     * </p>
     * 
     * @param description
     *        The description for the action.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the action.
     * </p>
     * 
     * @return The description for the action.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the action.
     * </p>
     * 
     * @param description
     *        The description for the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The action parameters, if applicable.
     * </p>
     * 
     * @return The action parameters, if applicable.
     */

    public java.util.Map<String, ActionParameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The action parameters, if applicable.
     * </p>
     * 
     * @param parameters
     *        The action parameters, if applicable.
     */

    public void setParameters(java.util.Map<String, ActionParameter> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The action parameters, if applicable.
     * </p>
     * 
     * @param parameters
     *        The action parameters, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withParameters(java.util.Map<String, ActionParameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see Action#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Action addParametersEntry(String key, ActionParameter value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, ActionParameter>();
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

    public Action clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The supported targets for the action.
     * </p>
     * 
     * @return The supported targets for the action.
     */

    public java.util.Map<String, ActionTarget> getTargets() {
        return targets;
    }

    /**
     * <p>
     * The supported targets for the action.
     * </p>
     * 
     * @param targets
     *        The supported targets for the action.
     */

    public void setTargets(java.util.Map<String, ActionTarget> targets) {
        this.targets = targets;
    }

    /**
     * <p>
     * The supported targets for the action.
     * </p>
     * 
     * @param targets
     *        The supported targets for the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withTargets(java.util.Map<String, ActionTarget> targets) {
        setTargets(targets);
        return this;
    }

    /**
     * Add a single Targets entry
     *
     * @see Action#withTargets
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Action addTargetsEntry(String key, ActionTarget value) {
        if (null == this.targets) {
            this.targets = new java.util.HashMap<String, ActionTarget>();
        }
        if (this.targets.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.targets.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Targets.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action clearTargetsEntries() {
        this.targets = null;
        return this;
    }

    /**
     * <p>
     * The tags for the action.
     * </p>
     * 
     * @return The tags for the action.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for the action.
     * </p>
     * 
     * @param tags
     *        The tags for the action.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags for the action.
     * </p>
     * 
     * @param tags
     *        The tags for the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Action#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Action addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action clearTagsEntries() {
        this.tags = null;
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets()).append(",");
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

        if (obj instanceof Action == false)
            return false;
        Action other = (Action) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Action clone() {
        try {
            return (Action) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fis.model.transform.ActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
