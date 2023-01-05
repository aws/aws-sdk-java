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
package com.amazonaws.services.appconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/CreateExtension" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateExtensionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for the extension. Each extension name in your account must be unique. Extension versions use the same
     * name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Information about the extension.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The actions defined in the extension.
     * </p>
     */
    private java.util.Map<String, java.util.List<Action>> actions;
    /**
     * <p>
     * The parameters accepted by the extension. You specify parameter values when you associate the extension to an
     * AppConfig resource by using the <code>CreateExtensionAssociation</code> API action. For Lambda extension actions,
     * these parameters are included in the Lambda request object.
     * </p>
     */
    private java.util.Map<String, Parameter> parameters;
    /**
     * <p>
     * Adds one or more tags for the specified extension. Tags are metadata that help you categorize resources in
     * different ways, for example, by purpose, owner, or environment. Each tag consists of a key and an optional value,
     * both of which you define.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * You can omit this field when you create an extension. When you create a new version, specify the most recent
     * current version number. For example, you create version 3, enter 2 for this field.
     * </p>
     */
    private Integer latestVersionNumber;

    /**
     * <p>
     * A name for the extension. Each extension name in your account must be unique. Extension versions use the same
     * name.
     * </p>
     * 
     * @param name
     *        A name for the extension. Each extension name in your account must be unique. Extension versions use the
     *        same name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the extension. Each extension name in your account must be unique. Extension versions use the same
     * name.
     * </p>
     * 
     * @return A name for the extension. Each extension name in your account must be unique. Extension versions use the
     *         same name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the extension. Each extension name in your account must be unique. Extension versions use the same
     * name.
     * </p>
     * 
     * @param name
     *        A name for the extension. Each extension name in your account must be unique. Extension versions use the
     *        same name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExtensionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Information about the extension.
     * </p>
     * 
     * @param description
     *        Information about the extension.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Information about the extension.
     * </p>
     * 
     * @return Information about the extension.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Information about the extension.
     * </p>
     * 
     * @param description
     *        Information about the extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExtensionRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The actions defined in the extension.
     * </p>
     * 
     * @return The actions defined in the extension.
     */

    public java.util.Map<String, java.util.List<Action>> getActions() {
        return actions;
    }

    /**
     * <p>
     * The actions defined in the extension.
     * </p>
     * 
     * @param actions
     *        The actions defined in the extension.
     */

    public void setActions(java.util.Map<String, java.util.List<Action>> actions) {
        this.actions = actions;
    }

    /**
     * <p>
     * The actions defined in the extension.
     * </p>
     * 
     * @param actions
     *        The actions defined in the extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExtensionRequest withActions(java.util.Map<String, java.util.List<Action>> actions) {
        setActions(actions);
        return this;
    }

    /**
     * Add a single Actions entry
     *
     * @see CreateExtensionRequest#withActions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateExtensionRequest addActionsEntry(String key, java.util.List<Action> value) {
        if (null == this.actions) {
            this.actions = new java.util.HashMap<String, java.util.List<Action>>();
        }
        if (this.actions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.actions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Actions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExtensionRequest clearActionsEntries() {
        this.actions = null;
        return this;
    }

    /**
     * <p>
     * The parameters accepted by the extension. You specify parameter values when you associate the extension to an
     * AppConfig resource by using the <code>CreateExtensionAssociation</code> API action. For Lambda extension actions,
     * these parameters are included in the Lambda request object.
     * </p>
     * 
     * @return The parameters accepted by the extension. You specify parameter values when you associate the extension
     *         to an AppConfig resource by using the <code>CreateExtensionAssociation</code> API action. For Lambda
     *         extension actions, these parameters are included in the Lambda request object.
     */

    public java.util.Map<String, Parameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The parameters accepted by the extension. You specify parameter values when you associate the extension to an
     * AppConfig resource by using the <code>CreateExtensionAssociation</code> API action. For Lambda extension actions,
     * these parameters are included in the Lambda request object.
     * </p>
     * 
     * @param parameters
     *        The parameters accepted by the extension. You specify parameter values when you associate the extension to
     *        an AppConfig resource by using the <code>CreateExtensionAssociation</code> API action. For Lambda
     *        extension actions, these parameters are included in the Lambda request object.
     */

    public void setParameters(java.util.Map<String, Parameter> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The parameters accepted by the extension. You specify parameter values when you associate the extension to an
     * AppConfig resource by using the <code>CreateExtensionAssociation</code> API action. For Lambda extension actions,
     * these parameters are included in the Lambda request object.
     * </p>
     * 
     * @param parameters
     *        The parameters accepted by the extension. You specify parameter values when you associate the extension to
     *        an AppConfig resource by using the <code>CreateExtensionAssociation</code> API action. For Lambda
     *        extension actions, these parameters are included in the Lambda request object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExtensionRequest withParameters(java.util.Map<String, Parameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see CreateExtensionRequest#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateExtensionRequest addParametersEntry(String key, Parameter value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, Parameter>();
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

    public CreateExtensionRequest clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * Adds one or more tags for the specified extension. Tags are metadata that help you categorize resources in
     * different ways, for example, by purpose, owner, or environment. Each tag consists of a key and an optional value,
     * both of which you define.
     * </p>
     * 
     * @return Adds one or more tags for the specified extension. Tags are metadata that help you categorize resources
     *         in different ways, for example, by purpose, owner, or environment. Each tag consists of a key and an
     *         optional value, both of which you define.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Adds one or more tags for the specified extension. Tags are metadata that help you categorize resources in
     * different ways, for example, by purpose, owner, or environment. Each tag consists of a key and an optional value,
     * both of which you define.
     * </p>
     * 
     * @param tags
     *        Adds one or more tags for the specified extension. Tags are metadata that help you categorize resources in
     *        different ways, for example, by purpose, owner, or environment. Each tag consists of a key and an optional
     *        value, both of which you define.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Adds one or more tags for the specified extension. Tags are metadata that help you categorize resources in
     * different ways, for example, by purpose, owner, or environment. Each tag consists of a key and an optional value,
     * both of which you define.
     * </p>
     * 
     * @param tags
     *        Adds one or more tags for the specified extension. Tags are metadata that help you categorize resources in
     *        different ways, for example, by purpose, owner, or environment. Each tag consists of a key and an optional
     *        value, both of which you define.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExtensionRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateExtensionRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateExtensionRequest addTagsEntry(String key, String value) {
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

    public CreateExtensionRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * You can omit this field when you create an extension. When you create a new version, specify the most recent
     * current version number. For example, you create version 3, enter 2 for this field.
     * </p>
     * 
     * @param latestVersionNumber
     *        You can omit this field when you create an extension. When you create a new version, specify the most
     *        recent current version number. For example, you create version 3, enter 2 for this field.
     */

    public void setLatestVersionNumber(Integer latestVersionNumber) {
        this.latestVersionNumber = latestVersionNumber;
    }

    /**
     * <p>
     * You can omit this field when you create an extension. When you create a new version, specify the most recent
     * current version number. For example, you create version 3, enter 2 for this field.
     * </p>
     * 
     * @return You can omit this field when you create an extension. When you create a new version, specify the most
     *         recent current version number. For example, you create version 3, enter 2 for this field.
     */

    public Integer getLatestVersionNumber() {
        return this.latestVersionNumber;
    }

    /**
     * <p>
     * You can omit this field when you create an extension. When you create a new version, specify the most recent
     * current version number. For example, you create version 3, enter 2 for this field.
     * </p>
     * 
     * @param latestVersionNumber
     *        You can omit this field when you create an extension. When you create a new version, specify the most
     *        recent current version number. For example, you create version 3, enter 2 for this field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExtensionRequest withLatestVersionNumber(Integer latestVersionNumber) {
        setLatestVersionNumber(latestVersionNumber);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getActions() != null)
            sb.append("Actions: ").append(getActions()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getLatestVersionNumber() != null)
            sb.append("LatestVersionNumber: ").append(getLatestVersionNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateExtensionRequest == false)
            return false;
        CreateExtensionRequest other = (CreateExtensionRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getLatestVersionNumber() == null ^ this.getLatestVersionNumber() == null)
            return false;
        if (other.getLatestVersionNumber() != null && other.getLatestVersionNumber().equals(this.getLatestVersionNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getLatestVersionNumber() == null) ? 0 : getLatestVersionNumber().hashCode());
        return hashCode;
    }

    @Override
    public CreateExtensionRequest clone() {
        return (CreateExtensionRequest) super.clone();
    }

}
