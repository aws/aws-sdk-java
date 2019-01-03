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
 * A list of validation messages for a specified configuration template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/ValidateConfigurationSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidateConfigurationSettingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the application that the configuration template or environment belongs to.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * The name of the configuration template to validate the settings against.
     * </p>
     * <p>
     * Condition: You cannot specify both this and an environment name.
     * </p>
     */
    private String templateName;
    /**
     * <p>
     * The name of the environment to validate the settings against.
     * </p>
     * <p>
     * Condition: You cannot specify both this and a configuration template name.
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * A list of the options and desired values to evaluate.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ConfigurationOptionSetting> optionSettings;

    /**
     * Default constructor for ValidateConfigurationSettingsRequest object. Callers should use the setter or fluent
     * setter (with...) methods to initialize the object after creating it.
     */
    public ValidateConfigurationSettingsRequest() {
    }

    /**
     * Constructs a new ValidateConfigurationSettingsRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize any additional object members.
     * 
     * @param applicationName
     *        The name of the application that the configuration template or environment belongs to.
     * @param optionSettings
     *        A list of the options and desired values to evaluate.
     */
    public ValidateConfigurationSettingsRequest(String applicationName, java.util.List<ConfigurationOptionSetting> optionSettings) {
        setApplicationName(applicationName);
        setOptionSettings(optionSettings);
    }

    /**
     * <p>
     * The name of the application that the configuration template or environment belongs to.
     * </p>
     * 
     * @param applicationName
     *        The name of the application that the configuration template or environment belongs to.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application that the configuration template or environment belongs to.
     * </p>
     * 
     * @return The name of the application that the configuration template or environment belongs to.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of the application that the configuration template or environment belongs to.
     * </p>
     * 
     * @param applicationName
     *        The name of the application that the configuration template or environment belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateConfigurationSettingsRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * The name of the configuration template to validate the settings against.
     * </p>
     * <p>
     * Condition: You cannot specify both this and an environment name.
     * </p>
     * 
     * @param templateName
     *        The name of the configuration template to validate the settings against.</p>
     *        <p>
     *        Condition: You cannot specify both this and an environment name.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the configuration template to validate the settings against.
     * </p>
     * <p>
     * Condition: You cannot specify both this and an environment name.
     * </p>
     * 
     * @return The name of the configuration template to validate the settings against.</p>
     *         <p>
     *         Condition: You cannot specify both this and an environment name.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the configuration template to validate the settings against.
     * </p>
     * <p>
     * Condition: You cannot specify both this and an environment name.
     * </p>
     * 
     * @param templateName
     *        The name of the configuration template to validate the settings against.</p>
     *        <p>
     *        Condition: You cannot specify both this and an environment name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateConfigurationSettingsRequest withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

    /**
     * <p>
     * The name of the environment to validate the settings against.
     * </p>
     * <p>
     * Condition: You cannot specify both this and a configuration template name.
     * </p>
     * 
     * @param environmentName
     *        The name of the environment to validate the settings against.</p>
     *        <p>
     *        Condition: You cannot specify both this and a configuration template name.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of the environment to validate the settings against.
     * </p>
     * <p>
     * Condition: You cannot specify both this and a configuration template name.
     * </p>
     * 
     * @return The name of the environment to validate the settings against.</p>
     *         <p>
     *         Condition: You cannot specify both this and a configuration template name.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * The name of the environment to validate the settings against.
     * </p>
     * <p>
     * Condition: You cannot specify both this and a configuration template name.
     * </p>
     * 
     * @param environmentName
     *        The name of the environment to validate the settings against.</p>
     *        <p>
     *        Condition: You cannot specify both this and a configuration template name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateConfigurationSettingsRequest withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * A list of the options and desired values to evaluate.
     * </p>
     * 
     * @return A list of the options and desired values to evaluate.
     */

    public java.util.List<ConfigurationOptionSetting> getOptionSettings() {
        if (optionSettings == null) {
            optionSettings = new com.amazonaws.internal.SdkInternalList<ConfigurationOptionSetting>();
        }
        return optionSettings;
    }

    /**
     * <p>
     * A list of the options and desired values to evaluate.
     * </p>
     * 
     * @param optionSettings
     *        A list of the options and desired values to evaluate.
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
     * A list of the options and desired values to evaluate.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptionSettings(java.util.Collection)} or {@link #withOptionSettings(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param optionSettings
     *        A list of the options and desired values to evaluate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateConfigurationSettingsRequest withOptionSettings(ConfigurationOptionSetting... optionSettings) {
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
     * A list of the options and desired values to evaluate.
     * </p>
     * 
     * @param optionSettings
     *        A list of the options and desired values to evaluate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateConfigurationSettingsRequest withOptionSettings(java.util.Collection<ConfigurationOptionSetting> optionSettings) {
        setOptionSettings(optionSettings);
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
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName()).append(",");
        if (getOptionSettings() != null)
            sb.append("OptionSettings: ").append(getOptionSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidateConfigurationSettingsRequest == false)
            return false;
        ValidateConfigurationSettingsRequest other = (ValidateConfigurationSettingsRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getOptionSettings() == null ^ this.getOptionSettings() == null)
            return false;
        if (other.getOptionSettings() != null && other.getOptionSettings().equals(this.getOptionSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getOptionSettings() == null) ? 0 : getOptionSettings().hashCode());
        return hashCode;
    }

    @Override
    public ValidateConfigurationSettingsRequest clone() {
        return (ValidateConfigurationSettingsRequest) super.clone();
    }

}
