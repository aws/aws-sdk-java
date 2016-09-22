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
 * Returns information about the details of an action type.
 * </p>
 */
public class ActionType implements Serializable, Cloneable {

    private ActionTypeId id;
    /**
     * <p>
     * The settings for the action type.
     * </p>
     */
    private ActionTypeSettings settings;
    /**
     * <p>
     * The configuration properties for the action type.
     * </p>
     */
    private java.util.List<ActionConfigurationProperty> actionConfigurationProperties;
    /**
     * <p>
     * The details of the input artifact for the action, such as its commit ID.
     * </p>
     */
    private ArtifactDetails inputArtifactDetails;
    /**
     * <p>
     * The details of the output artifact of the action, such as its commit ID.
     * </p>
     */
    private ArtifactDetails outputArtifactDetails;

    /**
     * @param id
     */

    public void setId(ActionTypeId id) {
        this.id = id;
    }

    /**
     * @return
     */

    public ActionTypeId getId() {
        return this.id;
    }

    /**
     * @param id
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionType withId(ActionTypeId id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The settings for the action type.
     * </p>
     * 
     * @param settings
     *        The settings for the action type.
     */

    public void setSettings(ActionTypeSettings settings) {
        this.settings = settings;
    }

    /**
     * <p>
     * The settings for the action type.
     * </p>
     * 
     * @return The settings for the action type.
     */

    public ActionTypeSettings getSettings() {
        return this.settings;
    }

    /**
     * <p>
     * The settings for the action type.
     * </p>
     * 
     * @param settings
     *        The settings for the action type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionType withSettings(ActionTypeSettings settings) {
        setSettings(settings);
        return this;
    }

    /**
     * <p>
     * The configuration properties for the action type.
     * </p>
     * 
     * @return The configuration properties for the action type.
     */

    public java.util.List<ActionConfigurationProperty> getActionConfigurationProperties() {
        return actionConfigurationProperties;
    }

    /**
     * <p>
     * The configuration properties for the action type.
     * </p>
     * 
     * @param actionConfigurationProperties
     *        The configuration properties for the action type.
     */

    public void setActionConfigurationProperties(java.util.Collection<ActionConfigurationProperty> actionConfigurationProperties) {
        if (actionConfigurationProperties == null) {
            this.actionConfigurationProperties = null;
            return;
        }

        this.actionConfigurationProperties = new java.util.ArrayList<ActionConfigurationProperty>(actionConfigurationProperties);
    }

    /**
     * <p>
     * The configuration properties for the action type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActionConfigurationProperties(java.util.Collection)} or
     * {@link #withActionConfigurationProperties(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param actionConfigurationProperties
     *        The configuration properties for the action type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionType withActionConfigurationProperties(ActionConfigurationProperty... actionConfigurationProperties) {
        if (this.actionConfigurationProperties == null) {
            setActionConfigurationProperties(new java.util.ArrayList<ActionConfigurationProperty>(actionConfigurationProperties.length));
        }
        for (ActionConfigurationProperty ele : actionConfigurationProperties) {
            this.actionConfigurationProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The configuration properties for the action type.
     * </p>
     * 
     * @param actionConfigurationProperties
     *        The configuration properties for the action type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionType withActionConfigurationProperties(java.util.Collection<ActionConfigurationProperty> actionConfigurationProperties) {
        setActionConfigurationProperties(actionConfigurationProperties);
        return this;
    }

    /**
     * <p>
     * The details of the input artifact for the action, such as its commit ID.
     * </p>
     * 
     * @param inputArtifactDetails
     *        The details of the input artifact for the action, such as its commit ID.
     */

    public void setInputArtifactDetails(ArtifactDetails inputArtifactDetails) {
        this.inputArtifactDetails = inputArtifactDetails;
    }

    /**
     * <p>
     * The details of the input artifact for the action, such as its commit ID.
     * </p>
     * 
     * @return The details of the input artifact for the action, such as its commit ID.
     */

    public ArtifactDetails getInputArtifactDetails() {
        return this.inputArtifactDetails;
    }

    /**
     * <p>
     * The details of the input artifact for the action, such as its commit ID.
     * </p>
     * 
     * @param inputArtifactDetails
     *        The details of the input artifact for the action, such as its commit ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionType withInputArtifactDetails(ArtifactDetails inputArtifactDetails) {
        setInputArtifactDetails(inputArtifactDetails);
        return this;
    }

    /**
     * <p>
     * The details of the output artifact of the action, such as its commit ID.
     * </p>
     * 
     * @param outputArtifactDetails
     *        The details of the output artifact of the action, such as its commit ID.
     */

    public void setOutputArtifactDetails(ArtifactDetails outputArtifactDetails) {
        this.outputArtifactDetails = outputArtifactDetails;
    }

    /**
     * <p>
     * The details of the output artifact of the action, such as its commit ID.
     * </p>
     * 
     * @return The details of the output artifact of the action, such as its commit ID.
     */

    public ArtifactDetails getOutputArtifactDetails() {
        return this.outputArtifactDetails;
    }

    /**
     * <p>
     * The details of the output artifact of the action, such as its commit ID.
     * </p>
     * 
     * @param outputArtifactDetails
     *        The details of the output artifact of the action, such as its commit ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionType withOutputArtifactDetails(ArtifactDetails outputArtifactDetails) {
        setOutputArtifactDetails(outputArtifactDetails);
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
        if (getSettings() != null)
            sb.append("Settings: " + getSettings() + ",");
        if (getActionConfigurationProperties() != null)
            sb.append("ActionConfigurationProperties: " + getActionConfigurationProperties() + ",");
        if (getInputArtifactDetails() != null)
            sb.append("InputArtifactDetails: " + getInputArtifactDetails() + ",");
        if (getOutputArtifactDetails() != null)
            sb.append("OutputArtifactDetails: " + getOutputArtifactDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActionType == false)
            return false;
        ActionType other = (ActionType) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        if (other.getActionConfigurationProperties() == null ^ this.getActionConfigurationProperties() == null)
            return false;
        if (other.getActionConfigurationProperties() != null
                && other.getActionConfigurationProperties().equals(this.getActionConfigurationProperties()) == false)
            return false;
        if (other.getInputArtifactDetails() == null ^ this.getInputArtifactDetails() == null)
            return false;
        if (other.getInputArtifactDetails() != null && other.getInputArtifactDetails().equals(this.getInputArtifactDetails()) == false)
            return false;
        if (other.getOutputArtifactDetails() == null ^ this.getOutputArtifactDetails() == null)
            return false;
        if (other.getOutputArtifactDetails() != null && other.getOutputArtifactDetails().equals(this.getOutputArtifactDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode + ((getActionConfigurationProperties() == null) ? 0 : getActionConfigurationProperties().hashCode());
        hashCode = prime * hashCode + ((getInputArtifactDetails() == null) ? 0 : getInputArtifactDetails().hashCode());
        hashCode = prime * hashCode + ((getOutputArtifactDetails() == null) ? 0 : getOutputArtifactDetails().hashCode());
        return hashCode;
    }

    @Override
    public ActionType clone() {
        try {
            return (ActionType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
