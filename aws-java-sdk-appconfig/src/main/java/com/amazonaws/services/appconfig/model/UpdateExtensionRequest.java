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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/UpdateExtension" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateExtensionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name, the ID, or the Amazon Resource Name (ARN) of the extension.
     * </p>
     */
    private String extensionIdentifier;
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
     * One or more parameters for the actions called by the extension.
     * </p>
     */
    private java.util.Map<String, Parameter> parameters;
    /**
     * <p>
     * The extension version number.
     * </p>
     */
    private Integer versionNumber;

    /**
     * <p>
     * The name, the ID, or the Amazon Resource Name (ARN) of the extension.
     * </p>
     * 
     * @param extensionIdentifier
     *        The name, the ID, or the Amazon Resource Name (ARN) of the extension.
     */

    public void setExtensionIdentifier(String extensionIdentifier) {
        this.extensionIdentifier = extensionIdentifier;
    }

    /**
     * <p>
     * The name, the ID, or the Amazon Resource Name (ARN) of the extension.
     * </p>
     * 
     * @return The name, the ID, or the Amazon Resource Name (ARN) of the extension.
     */

    public String getExtensionIdentifier() {
        return this.extensionIdentifier;
    }

    /**
     * <p>
     * The name, the ID, or the Amazon Resource Name (ARN) of the extension.
     * </p>
     * 
     * @param extensionIdentifier
     *        The name, the ID, or the Amazon Resource Name (ARN) of the extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateExtensionRequest withExtensionIdentifier(String extensionIdentifier) {
        setExtensionIdentifier(extensionIdentifier);
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

    public UpdateExtensionRequest withDescription(String description) {
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

    public UpdateExtensionRequest withActions(java.util.Map<String, java.util.List<Action>> actions) {
        setActions(actions);
        return this;
    }

    /**
     * Add a single Actions entry
     *
     * @see UpdateExtensionRequest#withActions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateExtensionRequest addActionsEntry(String key, java.util.List<Action> value) {
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

    public UpdateExtensionRequest clearActionsEntries() {
        this.actions = null;
        return this;
    }

    /**
     * <p>
     * One or more parameters for the actions called by the extension.
     * </p>
     * 
     * @return One or more parameters for the actions called by the extension.
     */

    public java.util.Map<String, Parameter> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * One or more parameters for the actions called by the extension.
     * </p>
     * 
     * @param parameters
     *        One or more parameters for the actions called by the extension.
     */

    public void setParameters(java.util.Map<String, Parameter> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * One or more parameters for the actions called by the extension.
     * </p>
     * 
     * @param parameters
     *        One or more parameters for the actions called by the extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateExtensionRequest withParameters(java.util.Map<String, Parameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see UpdateExtensionRequest#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateExtensionRequest addParametersEntry(String key, Parameter value) {
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

    public UpdateExtensionRequest clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The extension version number.
     * </p>
     * 
     * @param versionNumber
     *        The extension version number.
     */

    public void setVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * <p>
     * The extension version number.
     * </p>
     * 
     * @return The extension version number.
     */

    public Integer getVersionNumber() {
        return this.versionNumber;
    }

    /**
     * <p>
     * The extension version number.
     * </p>
     * 
     * @param versionNumber
     *        The extension version number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateExtensionRequest withVersionNumber(Integer versionNumber) {
        setVersionNumber(versionNumber);
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
        if (getExtensionIdentifier() != null)
            sb.append("ExtensionIdentifier: ").append(getExtensionIdentifier()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getActions() != null)
            sb.append("Actions: ").append(getActions()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getVersionNumber() != null)
            sb.append("VersionNumber: ").append(getVersionNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateExtensionRequest == false)
            return false;
        UpdateExtensionRequest other = (UpdateExtensionRequest) obj;
        if (other.getExtensionIdentifier() == null ^ this.getExtensionIdentifier() == null)
            return false;
        if (other.getExtensionIdentifier() != null && other.getExtensionIdentifier().equals(this.getExtensionIdentifier()) == false)
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
        if (other.getVersionNumber() == null ^ this.getVersionNumber() == null)
            return false;
        if (other.getVersionNumber() != null && other.getVersionNumber().equals(this.getVersionNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExtensionIdentifier() == null) ? 0 : getExtensionIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getVersionNumber() == null) ? 0 : getVersionNumber().hashCode());
        return hashCode;
    }

    @Override
    public UpdateExtensionRequest clone() {
        return (UpdateExtensionRequest) super.clone();
    }

}
