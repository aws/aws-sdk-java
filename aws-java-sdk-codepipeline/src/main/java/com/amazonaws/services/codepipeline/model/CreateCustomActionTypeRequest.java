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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a create custom action operation.
 * </p>
 */
public class CreateCustomActionTypeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The category of the custom action, such as a build action or a test action.
     * </p>
     * <note>
     * <p>
     * Although Source and Approval are listed as valid values, they are not currently functional. These values are
     * reserved for future use.
     * </p>
     * </note>
     */
    private String category;
    /**
     * <p>
     * The provider of the service used in the custom action, such as AWS CodeDeploy.
     * </p>
     */
    private String provider;
    /**
     * <p>
     * The version identifier of the custom action.
     * </p>
     */
    private String version;

    private ActionTypeSettings settings;
    /**
     * <p>
     * The configuration properties for the custom action.
     * </p>
     * <note>
     * <p>
     * You can refer to a name in the configuration properties of the custom action within the URL templates by
     * following the format of {Config:name}, as long as the configuration property is both required and not secret. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/codepipeline/latest/userguide/how-to-create-custom-action.html">Create a Custom
     * Action for a Pipeline</a>.
     * </p>
     * </note>
     */
    private java.util.List<ActionConfigurationProperty> configurationProperties;

    private ArtifactDetails inputArtifactDetails;

    private ArtifactDetails outputArtifactDetails;

    /**
     * <p>
     * The category of the custom action, such as a build action or a test action.
     * </p>
     * <note>
     * <p>
     * Although Source and Approval are listed as valid values, they are not currently functional. These values are
     * reserved for future use.
     * </p>
     * </note>
     * 
     * @param category
     *        The category of the custom action, such as a build action or a test action.</p> <note>
     *        <p>
     *        Although Source and Approval are listed as valid values, they are not currently functional. These values
     *        are reserved for future use.
     *        </p>
     * @see ActionCategory
     */

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * <p>
     * The category of the custom action, such as a build action or a test action.
     * </p>
     * <note>
     * <p>
     * Although Source and Approval are listed as valid values, they are not currently functional. These values are
     * reserved for future use.
     * </p>
     * </note>
     * 
     * @return The category of the custom action, such as a build action or a test action.</p> <note>
     *         <p>
     *         Although Source and Approval are listed as valid values, they are not currently functional. These values
     *         are reserved for future use.
     *         </p>
     * @see ActionCategory
     */

    public String getCategory() {
        return this.category;
    }

    /**
     * <p>
     * The category of the custom action, such as a build action or a test action.
     * </p>
     * <note>
     * <p>
     * Although Source and Approval are listed as valid values, they are not currently functional. These values are
     * reserved for future use.
     * </p>
     * </note>
     * 
     * @param category
     *        The category of the custom action, such as a build action or a test action.</p> <note>
     *        <p>
     *        Although Source and Approval are listed as valid values, they are not currently functional. These values
     *        are reserved for future use.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionCategory
     */

    public CreateCustomActionTypeRequest withCategory(String category) {
        setCategory(category);
        return this;
    }

    /**
     * <p>
     * The category of the custom action, such as a build action or a test action.
     * </p>
     * <note>
     * <p>
     * Although Source and Approval are listed as valid values, they are not currently functional. These values are
     * reserved for future use.
     * </p>
     * </note>
     * 
     * @param category
     *        The category of the custom action, such as a build action or a test action.</p> <note>
     *        <p>
     *        Although Source and Approval are listed as valid values, they are not currently functional. These values
     *        are reserved for future use.
     *        </p>
     * @see ActionCategory
     */

    public void setCategory(ActionCategory category) {
        this.category = category.toString();
    }

    /**
     * <p>
     * The category of the custom action, such as a build action or a test action.
     * </p>
     * <note>
     * <p>
     * Although Source and Approval are listed as valid values, they are not currently functional. These values are
     * reserved for future use.
     * </p>
     * </note>
     * 
     * @param category
     *        The category of the custom action, such as a build action or a test action.</p> <note>
     *        <p>
     *        Although Source and Approval are listed as valid values, they are not currently functional. These values
     *        are reserved for future use.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ActionCategory
     */

    public CreateCustomActionTypeRequest withCategory(ActionCategory category) {
        setCategory(category);
        return this;
    }

    /**
     * <p>
     * The provider of the service used in the custom action, such as AWS CodeDeploy.
     * </p>
     * 
     * @param provider
     *        The provider of the service used in the custom action, such as AWS CodeDeploy.
     */

    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * <p>
     * The provider of the service used in the custom action, such as AWS CodeDeploy.
     * </p>
     * 
     * @return The provider of the service used in the custom action, such as AWS CodeDeploy.
     */

    public String getProvider() {
        return this.provider;
    }

    /**
     * <p>
     * The provider of the service used in the custom action, such as AWS CodeDeploy.
     * </p>
     * 
     * @param provider
     *        The provider of the service used in the custom action, such as AWS CodeDeploy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomActionTypeRequest withProvider(String provider) {
        setProvider(provider);
        return this;
    }

    /**
     * <p>
     * The version identifier of the custom action.
     * </p>
     * 
     * @param version
     *        The version identifier of the custom action.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version identifier of the custom action.
     * </p>
     * 
     * @return The version identifier of the custom action.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version identifier of the custom action.
     * </p>
     * 
     * @param version
     *        The version identifier of the custom action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomActionTypeRequest withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * @param settings
     */

    public void setSettings(ActionTypeSettings settings) {
        this.settings = settings;
    }

    /**
     * @return
     */

    public ActionTypeSettings getSettings() {
        return this.settings;
    }

    /**
     * @param settings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomActionTypeRequest withSettings(ActionTypeSettings settings) {
        setSettings(settings);
        return this;
    }

    /**
     * <p>
     * The configuration properties for the custom action.
     * </p>
     * <note>
     * <p>
     * You can refer to a name in the configuration properties of the custom action within the URL templates by
     * following the format of {Config:name}, as long as the configuration property is both required and not secret. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/codepipeline/latest/userguide/how-to-create-custom-action.html">Create a Custom
     * Action for a Pipeline</a>.
     * </p>
     * </note>
     * 
     * @return The configuration properties for the custom action.</p> <note>
     *         <p>
     *         You can refer to a name in the configuration properties of the custom action within the URL templates by
     *         following the format of {Config:name}, as long as the configuration property is both required and not
     *         secret. For more information, see <a
     *         href="http://docs.aws.amazon.com/codepipeline/latest/userguide/how-to-create-custom-action.html">Create a
     *         Custom Action for a Pipeline</a>.
     *         </p>
     */

    public java.util.List<ActionConfigurationProperty> getConfigurationProperties() {
        return configurationProperties;
    }

    /**
     * <p>
     * The configuration properties for the custom action.
     * </p>
     * <note>
     * <p>
     * You can refer to a name in the configuration properties of the custom action within the URL templates by
     * following the format of {Config:name}, as long as the configuration property is both required and not secret. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/codepipeline/latest/userguide/how-to-create-custom-action.html">Create a Custom
     * Action for a Pipeline</a>.
     * </p>
     * </note>
     * 
     * @param configurationProperties
     *        The configuration properties for the custom action.</p> <note>
     *        <p>
     *        You can refer to a name in the configuration properties of the custom action within the URL templates by
     *        following the format of {Config:name}, as long as the configuration property is both required and not
     *        secret. For more information, see <a
     *        href="http://docs.aws.amazon.com/codepipeline/latest/userguide/how-to-create-custom-action.html">Create a
     *        Custom Action for a Pipeline</a>.
     *        </p>
     */

    public void setConfigurationProperties(java.util.Collection<ActionConfigurationProperty> configurationProperties) {
        if (configurationProperties == null) {
            this.configurationProperties = null;
            return;
        }

        this.configurationProperties = new java.util.ArrayList<ActionConfigurationProperty>(configurationProperties);
    }

    /**
     * <p>
     * The configuration properties for the custom action.
     * </p>
     * <note>
     * <p>
     * You can refer to a name in the configuration properties of the custom action within the URL templates by
     * following the format of {Config:name}, as long as the configuration property is both required and not secret. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/codepipeline/latest/userguide/how-to-create-custom-action.html">Create a Custom
     * Action for a Pipeline</a>.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigurationProperties(java.util.Collection)} or
     * {@link #withConfigurationProperties(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param configurationProperties
     *        The configuration properties for the custom action.</p> <note>
     *        <p>
     *        You can refer to a name in the configuration properties of the custom action within the URL templates by
     *        following the format of {Config:name}, as long as the configuration property is both required and not
     *        secret. For more information, see <a
     *        href="http://docs.aws.amazon.com/codepipeline/latest/userguide/how-to-create-custom-action.html">Create a
     *        Custom Action for a Pipeline</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomActionTypeRequest withConfigurationProperties(ActionConfigurationProperty... configurationProperties) {
        if (this.configurationProperties == null) {
            setConfigurationProperties(new java.util.ArrayList<ActionConfigurationProperty>(configurationProperties.length));
        }
        for (ActionConfigurationProperty ele : configurationProperties) {
            this.configurationProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The configuration properties for the custom action.
     * </p>
     * <note>
     * <p>
     * You can refer to a name in the configuration properties of the custom action within the URL templates by
     * following the format of {Config:name}, as long as the configuration property is both required and not secret. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/codepipeline/latest/userguide/how-to-create-custom-action.html">Create a Custom
     * Action for a Pipeline</a>.
     * </p>
     * </note>
     * 
     * @param configurationProperties
     *        The configuration properties for the custom action.</p> <note>
     *        <p>
     *        You can refer to a name in the configuration properties of the custom action within the URL templates by
     *        following the format of {Config:name}, as long as the configuration property is both required and not
     *        secret. For more information, see <a
     *        href="http://docs.aws.amazon.com/codepipeline/latest/userguide/how-to-create-custom-action.html">Create a
     *        Custom Action for a Pipeline</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomActionTypeRequest withConfigurationProperties(java.util.Collection<ActionConfigurationProperty> configurationProperties) {
        setConfigurationProperties(configurationProperties);
        return this;
    }

    /**
     * @param inputArtifactDetails
     */

    public void setInputArtifactDetails(ArtifactDetails inputArtifactDetails) {
        this.inputArtifactDetails = inputArtifactDetails;
    }

    /**
     * @return
     */

    public ArtifactDetails getInputArtifactDetails() {
        return this.inputArtifactDetails;
    }

    /**
     * @param inputArtifactDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomActionTypeRequest withInputArtifactDetails(ArtifactDetails inputArtifactDetails) {
        setInputArtifactDetails(inputArtifactDetails);
        return this;
    }

    /**
     * @param outputArtifactDetails
     */

    public void setOutputArtifactDetails(ArtifactDetails outputArtifactDetails) {
        this.outputArtifactDetails = outputArtifactDetails;
    }

    /**
     * @return
     */

    public ArtifactDetails getOutputArtifactDetails() {
        return this.outputArtifactDetails;
    }

    /**
     * @param outputArtifactDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCustomActionTypeRequest withOutputArtifactDetails(ArtifactDetails outputArtifactDetails) {
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
        if (getCategory() != null)
            sb.append("Category: " + getCategory() + ",");
        if (getProvider() != null)
            sb.append("Provider: " + getProvider() + ",");
        if (getVersion() != null)
            sb.append("Version: " + getVersion() + ",");
        if (getSettings() != null)
            sb.append("Settings: " + getSettings() + ",");
        if (getConfigurationProperties() != null)
            sb.append("ConfigurationProperties: " + getConfigurationProperties() + ",");
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

        if (obj instanceof CreateCustomActionTypeRequest == false)
            return false;
        CreateCustomActionTypeRequest other = (CreateCustomActionTypeRequest) obj;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getProvider() == null ^ this.getProvider() == null)
            return false;
        if (other.getProvider() != null && other.getProvider().equals(this.getProvider()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        if (other.getConfigurationProperties() == null ^ this.getConfigurationProperties() == null)
            return false;
        if (other.getConfigurationProperties() != null && other.getConfigurationProperties().equals(this.getConfigurationProperties()) == false)
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

        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getProvider() == null) ? 0 : getProvider().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode + ((getConfigurationProperties() == null) ? 0 : getConfigurationProperties().hashCode());
        hashCode = prime * hashCode + ((getInputArtifactDetails() == null) ? 0 : getInputArtifactDetails().hashCode());
        hashCode = prime * hashCode + ((getOutputArtifactDetails() == null) ? 0 : getOutputArtifactDetails().hashCode());
        return hashCode;
    }

    @Override
    public CreateCustomActionTypeRequest clone() {
        return (CreateCustomActionTypeRequest) super.clone();
    }
}
