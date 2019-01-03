/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The result message containing the options for the specified solution stack.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/UpdateConfigurationTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateConfigurationTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the application associated with the configuration template to update.
     * </p>
     * <p>
     * If no application is found with this name, <code>UpdateConfigurationTemplate</code> returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * The name of the configuration template to update.
     * </p>
     * <p>
     * If no configuration template is found with this name, <code>UpdateConfigurationTemplate</code> returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     */
    private String templateName;
    /**
     * <p>
     * A new description for the configuration.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A list of configuration option settings to update with the new specified option value.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ConfigurationOptionSetting> optionSettings;
    /**
     * <p>
     * A list of configuration options to remove from the configuration set.
     * </p>
     * <p>
     * Constraint: You can remove only <code>UserDefined</code> configuration options.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<OptionSpecification> optionsToRemove;

    /**
     * Default constructor for UpdateConfigurationTemplateRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public UpdateConfigurationTemplateRequest() {
    }

    /**
     * Constructs a new UpdateConfigurationTemplateRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize any additional object members.
     * 
     * @param applicationName
     *        The name of the application associated with the configuration template to update.</p>
     *        <p>
     *        If no application is found with this name, <code>UpdateConfigurationTemplate</code> returns an
     *        <code>InvalidParameterValue</code> error.
     * @param templateName
     *        The name of the configuration template to update.
     *        </p>
     *        <p>
     *        If no configuration template is found with this name, <code>UpdateConfigurationTemplate</code> returns an
     *        <code>InvalidParameterValue</code> error.
     */
    public UpdateConfigurationTemplateRequest(String applicationName, String templateName) {
        setApplicationName(applicationName);
        setTemplateName(templateName);
    }

    /**
     * <p>
     * The name of the application associated with the configuration template to update.
     * </p>
     * <p>
     * If no application is found with this name, <code>UpdateConfigurationTemplate</code> returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * 
     * @param applicationName
     *        The name of the application associated with the configuration template to update.</p>
     *        <p>
     *        If no application is found with this name, <code>UpdateConfigurationTemplate</code> returns an
     *        <code>InvalidParameterValue</code> error.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application associated with the configuration template to update.
     * </p>
     * <p>
     * If no application is found with this name, <code>UpdateConfigurationTemplate</code> returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * 
     * @return The name of the application associated with the configuration template to update.</p>
     *         <p>
     *         If no application is found with this name, <code>UpdateConfigurationTemplate</code> returns an
     *         <code>InvalidParameterValue</code> error.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of the application associated with the configuration template to update.
     * </p>
     * <p>
     * If no application is found with this name, <code>UpdateConfigurationTemplate</code> returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * 
     * @param applicationName
     *        The name of the application associated with the configuration template to update.</p>
     *        <p>
     *        If no application is found with this name, <code>UpdateConfigurationTemplate</code> returns an
     *        <code>InvalidParameterValue</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfigurationTemplateRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * The name of the configuration template to update.
     * </p>
     * <p>
     * If no configuration template is found with this name, <code>UpdateConfigurationTemplate</code> returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * 
     * @param templateName
     *        The name of the configuration template to update.</p>
     *        <p>
     *        If no configuration template is found with this name, <code>UpdateConfigurationTemplate</code> returns an
     *        <code>InvalidParameterValue</code> error.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the configuration template to update.
     * </p>
     * <p>
     * If no configuration template is found with this name, <code>UpdateConfigurationTemplate</code> returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * 
     * @return The name of the configuration template to update.</p>
     *         <p>
     *         If no configuration template is found with this name, <code>UpdateConfigurationTemplate</code> returns an
     *         <code>InvalidParameterValue</code> error.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the configuration template to update.
     * </p>
     * <p>
     * If no configuration template is found with this name, <code>UpdateConfigurationTemplate</code> returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * 
     * @param templateName
     *        The name of the configuration template to update.</p>
     *        <p>
     *        If no configuration template is found with this name, <code>UpdateConfigurationTemplate</code> returns an
     *        <code>InvalidParameterValue</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfigurationTemplateRequest withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

    /**
     * <p>
     * A new description for the configuration.
     * </p>
     * 
     * @param description
     *        A new description for the configuration.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A new description for the configuration.
     * </p>
     * 
     * @return A new description for the configuration.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A new description for the configuration.
     * </p>
     * 
     * @param description
     *        A new description for the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfigurationTemplateRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A list of configuration option settings to update with the new specified option value.
     * </p>
     * 
     * @return A list of configuration option settings to update with the new specified option value.
     */

    public java.util.List<ConfigurationOptionSetting> getOptionSettings() {
        if (optionSettings == null) {
            optionSettings = new com.amazonaws.internal.SdkInternalList<ConfigurationOptionSetting>();
        }
        return optionSettings;
    }

    /**
     * <p>
     * A list of configuration option settings to update with the new specified option value.
     * </p>
     * 
     * @param optionSettings
     *        A list of configuration option settings to update with the new specified option value.
     */

    public void setOptionSettings(java.util.Collection<ConfigurationOptionSetting> optionSettings) {
        if (optionSettings == null) {
            this.optionSettings = null;
            return;
        }

        this.optionSettings = new com.amazonaws.internal.SdkInternalList<ConfigurationOptionSetting>(optionSettings);
    }

    /**
     * <p>
     * A list of configuration option settings to update with the new specified option value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptionSettings(java.util.Collection)} or {@link #withOptionSettings(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param optionSettings
     *        A list of configuration option settings to update with the new specified option value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfigurationTemplateRequest withOptionSettings(ConfigurationOptionSetting... optionSettings) {
        if (this.optionSettings == null) {
            setOptionSettings(new com.amazonaws.internal.SdkInternalList<ConfigurationOptionSetting>(optionSettings.length));
        }
        for (ConfigurationOptionSetting ele : optionSettings) {
            this.optionSettings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of configuration option settings to update with the new specified option value.
     * </p>
     * 
     * @param optionSettings
     *        A list of configuration option settings to update with the new specified option value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfigurationTemplateRequest withOptionSettings(java.util.Collection<ConfigurationOptionSetting> optionSettings) {
        setOptionSettings(optionSettings);
        return this;
    }

    /**
     * <p>
     * A list of configuration options to remove from the configuration set.
     * </p>
     * <p>
     * Constraint: You can remove only <code>UserDefined</code> configuration options.
     * </p>
     * 
     * @return A list of configuration options to remove from the configuration set.</p>
     *         <p>
     *         Constraint: You can remove only <code>UserDefined</code> configuration options.
     */

    public java.util.List<OptionSpecification> getOptionsToRemove() {
        if (optionsToRemove == null) {
            optionsToRemove = new com.amazonaws.internal.SdkInternalList<OptionSpecification>();
        }
        return optionsToRemove;
    }

    /**
     * <p>
     * A list of configuration options to remove from the configuration set.
     * </p>
     * <p>
     * Constraint: You can remove only <code>UserDefined</code> configuration options.
     * </p>
     * 
     * @param optionsToRemove
     *        A list of configuration options to remove from the configuration set.</p>
     *        <p>
     *        Constraint: You can remove only <code>UserDefined</code> configuration options.
     */

    public void setOptionsToRemove(java.util.Collection<OptionSpecification> optionsToRemove) {
        if (optionsToRemove == null) {
            this.optionsToRemove = null;
            return;
        }

        this.optionsToRemove = new com.amazonaws.internal.SdkInternalList<OptionSpecification>(optionsToRemove);
    }

    /**
     * <p>
     * A list of configuration options to remove from the configuration set.
     * </p>
     * <p>
     * Constraint: You can remove only <code>UserDefined</code> configuration options.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptionsToRemove(java.util.Collection)} or {@link #withOptionsToRemove(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param optionsToRemove
     *        A list of configuration options to remove from the configuration set.</p>
     *        <p>
     *        Constraint: You can remove only <code>UserDefined</code> configuration options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfigurationTemplateRequest withOptionsToRemove(OptionSpecification... optionsToRemove) {
        if (this.optionsToRemove == null) {
            setOptionsToRemove(new com.amazonaws.internal.SdkInternalList<OptionSpecification>(optionsToRemove.length));
        }
        for (OptionSpecification ele : optionsToRemove) {
            this.optionsToRemove.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of configuration options to remove from the configuration set.
     * </p>
     * <p>
     * Constraint: You can remove only <code>UserDefined</code> configuration options.
     * </p>
     * 
     * @param optionsToRemove
     *        A list of configuration options to remove from the configuration set.</p>
     *        <p>
     *        Constraint: You can remove only <code>UserDefined</code> configuration options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConfigurationTemplateRequest withOptionsToRemove(java.util.Collection<OptionSpecification> optionsToRemove) {
        setOptionsToRemove(optionsToRemove);
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: ").append(getApplicationName()).append(",");
        if (getTemplateName() != null)
            sb.append("TemplateName: ").append(getTemplateName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getOptionSettings() != null)
            sb.append("OptionSettings: ").append(getOptionSettings()).append(",");
        if (getOptionsToRemove() != null)
            sb.append("OptionsToRemove: ").append(getOptionsToRemove());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateConfigurationTemplateRequest == false)
            return false;
        UpdateConfigurationTemplateRequest other = (UpdateConfigurationTemplateRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getOptionSettings() == null ^ this.getOptionSettings() == null)
            return false;
        if (other.getOptionSettings() != null && other.getOptionSettings().equals(this.getOptionSettings()) == false)
            return false;
        if (other.getOptionsToRemove() == null ^ this.getOptionsToRemove() == null)
            return false;
        if (other.getOptionsToRemove() != null && other.getOptionsToRemove().equals(this.getOptionsToRemove()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getOptionSettings() == null) ? 0 : getOptionSettings().hashCode());
        hashCode = prime * hashCode + ((getOptionsToRemove() == null) ? 0 : getOptionsToRemove().hashCode());
        return hashCode;
    }

    @Override
    public UpdateConfigurationTemplateRequest clone() {
        return (UpdateConfigurationTemplateRequest) super.clone();
    }

}
