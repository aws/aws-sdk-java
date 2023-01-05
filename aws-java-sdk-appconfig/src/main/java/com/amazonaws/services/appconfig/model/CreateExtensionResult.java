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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/CreateExtension" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateExtensionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The system-generated ID of the extension.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The extension name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The extension version number.
     * </p>
     */
    private Integer versionNumber;
    /**
     * <p>
     * The system-generated Amazon Resource Name (ARN) for the extension.
     * </p>
     */
    private String arn;
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
     * The system-generated ID of the extension.
     * </p>
     * 
     * @param id
     *        The system-generated ID of the extension.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The system-generated ID of the extension.
     * </p>
     * 
     * @return The system-generated ID of the extension.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The system-generated ID of the extension.
     * </p>
     * 
     * @param id
     *        The system-generated ID of the extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExtensionResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The extension name.
     * </p>
     * 
     * @param name
     *        The extension name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The extension name.
     * </p>
     * 
     * @return The extension name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The extension name.
     * </p>
     * 
     * @param name
     *        The extension name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExtensionResult withName(String name) {
        setName(name);
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

    public CreateExtensionResult withVersionNumber(Integer versionNumber) {
        setVersionNumber(versionNumber);
        return this;
    }

    /**
     * <p>
     * The system-generated Amazon Resource Name (ARN) for the extension.
     * </p>
     * 
     * @param arn
     *        The system-generated Amazon Resource Name (ARN) for the extension.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The system-generated Amazon Resource Name (ARN) for the extension.
     * </p>
     * 
     * @return The system-generated Amazon Resource Name (ARN) for the extension.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The system-generated Amazon Resource Name (ARN) for the extension.
     * </p>
     * 
     * @param arn
     *        The system-generated Amazon Resource Name (ARN) for the extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExtensionResult withArn(String arn) {
        setArn(arn);
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

    public CreateExtensionResult withDescription(String description) {
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

    public CreateExtensionResult withActions(java.util.Map<String, java.util.List<Action>> actions) {
        setActions(actions);
        return this;
    }

    /**
     * Add a single Actions entry
     *
     * @see CreateExtensionResult#withActions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateExtensionResult addActionsEntry(String key, java.util.List<Action> value) {
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

    public CreateExtensionResult clearActionsEntries() {
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

    public CreateExtensionResult withParameters(java.util.Map<String, Parameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see CreateExtensionResult#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateExtensionResult addParametersEntry(String key, Parameter value) {
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

    public CreateExtensionResult clearParametersEntries() {
        this.parameters = null;
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVersionNumber() != null)
            sb.append("VersionNumber: ").append(getVersionNumber()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getActions() != null)
            sb.append("Actions: ").append(getActions()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateExtensionResult == false)
            return false;
        CreateExtensionResult other = (CreateExtensionResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersionNumber() == null ^ this.getVersionNumber() == null)
            return false;
        if (other.getVersionNumber() != null && other.getVersionNumber().equals(this.getVersionNumber()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersionNumber() == null) ? 0 : getVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public CreateExtensionResult clone() {
        try {
            return (CreateExtensionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
