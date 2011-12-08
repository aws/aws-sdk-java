/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticbeanstalk.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#updateConfigurationTemplate(UpdateConfigurationTemplateRequest) UpdateConfigurationTemplate operation}.
 * <p>
 * Updates the specified configuration template to have the specified
 * properties or configuration option values.
 * </p>
 * <p>
 * <b>NOTE:</b> If a property (for example, ApplicationName) is not
 * provided, its value remains unchanged. To clear such properties,
 * specify an empty string.
 * </p>
 * <p>
 * Related Topics
 * </p>
 * 
 * <ul>
 * <li> DescribeConfigurationOptions </li>
 * 
 * </ul>
 *
 * @see com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#updateConfigurationTemplate(UpdateConfigurationTemplateRequest)
 */
public class UpdateConfigurationTemplateRequest extends AmazonWebServiceRequest {

    /**
     * The name of the application associated with the configuration template
     * to update. <p> If no application is found with this name,
     * <code>UpdateConfigurationTemplate</code> returns an
     * <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * The name of the configuration template to update. <p> If no
     * configuration template is found with this name,
     * <code>UpdateConfigurationTemplate</code> returns an
     * <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String templateName;

    /**
     * A new description for the configuration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     */
    private String description;

    /**
     * A list of configuration option settings to update with the new
     * specified option value.
     */
    private java.util.List<ConfigurationOptionSetting> optionSettings;

    /**
     * A list of configuration options to remove from the configuration set.
     * <p> Constraint: You can remove only <code>UserDefined</code>
     * configuration options.
     */
    private java.util.List<OptionSpecification> optionsToRemove;

    /**
     * Default constructor for a new UpdateConfigurationTemplateRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public UpdateConfigurationTemplateRequest() {}
    
    /**
     * Constructs a new UpdateConfigurationTemplateRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param applicationName The name of the application associated with the
     * configuration template to update. <p> If no application is found with
     * this name, <code>UpdateConfigurationTemplate</code> returns an
     * <code>InvalidParameterValue</code> error.
     * @param templateName The name of the configuration template to update.
     * <p> If no configuration template is found with this name,
     * <code>UpdateConfigurationTemplate</code> returns an
     * <code>InvalidParameterValue</code> error.
     */
    public UpdateConfigurationTemplateRequest(String applicationName, String templateName) {
        this.applicationName = applicationName;
        this.templateName = templateName;
    }

    
    
    /**
     * The name of the application associated with the configuration template
     * to update. <p> If no application is found with this name,
     * <code>UpdateConfigurationTemplate</code> returns an
     * <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of the application associated with the configuration template
     *         to update. <p> If no application is found with this name,
     *         <code>UpdateConfigurationTemplate</code> returns an
     *         <code>InvalidParameterValue</code> error.
     */
    public String getApplicationName() {
        return applicationName;
    }
    
    /**
     * The name of the application associated with the configuration template
     * to update. <p> If no application is found with this name,
     * <code>UpdateConfigurationTemplate</code> returns an
     * <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of the application associated with the configuration template
     *         to update. <p> If no application is found with this name,
     *         <code>UpdateConfigurationTemplate</code> returns an
     *         <code>InvalidParameterValue</code> error.
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    
    /**
     * The name of the application associated with the configuration template
     * to update. <p> If no application is found with this name,
     * <code>UpdateConfigurationTemplate</code> returns an
     * <code>InvalidParameterValue</code> error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of the application associated with the configuration template
     *         to update. <p> If no application is found with this name,
     *         <code>UpdateConfigurationTemplate</code> returns an
     *         <code>InvalidParameterValue</code> error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateConfigurationTemplateRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    
    
    /**
     * The name of the configuration template to update. <p> If no
     * configuration template is found with this name,
     * <code>UpdateConfigurationTemplate</code> returns an
     * <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of the configuration template to update. <p> If no
     *         configuration template is found with this name,
     *         <code>UpdateConfigurationTemplate</code> returns an
     *         <code>InvalidParameterValue</code> error.
     */
    public String getTemplateName() {
        return templateName;
    }
    
    /**
     * The name of the configuration template to update. <p> If no
     * configuration template is found with this name,
     * <code>UpdateConfigurationTemplate</code> returns an
     * <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param templateName The name of the configuration template to update. <p> If no
     *         configuration template is found with this name,
     *         <code>UpdateConfigurationTemplate</code> returns an
     *         <code>InvalidParameterValue</code> error.
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }
    
    /**
     * The name of the configuration template to update. <p> If no
     * configuration template is found with this name,
     * <code>UpdateConfigurationTemplate</code> returns an
     * <code>InvalidParameterValue</code> error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param templateName The name of the configuration template to update. <p> If no
     *         configuration template is found with this name,
     *         <code>UpdateConfigurationTemplate</code> returns an
     *         <code>InvalidParameterValue</code> error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateConfigurationTemplateRequest withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    
    
    /**
     * A new description for the configuration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @return A new description for the configuration.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A new description for the configuration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description A new description for the configuration.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A new description for the configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description A new description for the configuration.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateConfigurationTemplateRequest withDescription(String description) {
        this.description = description;
        return this;
    }
    
    
    /**
     * A list of configuration option settings to update with the new
     * specified option value.
     *
     * @return A list of configuration option settings to update with the new
     *         specified option value.
     */
    public java.util.List<ConfigurationOptionSetting> getOptionSettings() {
        
        if (optionSettings == null) {
            optionSettings = new java.util.ArrayList<ConfigurationOptionSetting>();
        }
        return optionSettings;
    }
    
    /**
     * A list of configuration option settings to update with the new
     * specified option value.
     *
     * @param optionSettings A list of configuration option settings to update with the new
     *         specified option value.
     */
    public void setOptionSettings(java.util.Collection<ConfigurationOptionSetting> optionSettings) {
        java.util.List<ConfigurationOptionSetting> optionSettingsCopy = new java.util.ArrayList<ConfigurationOptionSetting>();
        if (optionSettings != null) {
            optionSettingsCopy.addAll(optionSettings);
        }
        this.optionSettings = optionSettingsCopy;
    }
    
    /**
     * A list of configuration option settings to update with the new
     * specified option value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionSettings A list of configuration option settings to update with the new
     *         specified option value.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateConfigurationTemplateRequest withOptionSettings(ConfigurationOptionSetting... optionSettings) {
        if (getOptionSettings() == null) setOptionSettings(new java.util.ArrayList<ConfigurationOptionSetting>());
        for (ConfigurationOptionSetting value : optionSettings) {
            getOptionSettings().add(value);
        }
        return this;
    }
    
    /**
     * A list of configuration option settings to update with the new
     * specified option value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionSettings A list of configuration option settings to update with the new
     *         specified option value.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateConfigurationTemplateRequest withOptionSettings(java.util.Collection<ConfigurationOptionSetting> optionSettings) {
        java.util.List<ConfigurationOptionSetting> optionSettingsCopy = new java.util.ArrayList<ConfigurationOptionSetting>();
        if (optionSettings != null) {
            optionSettingsCopy.addAll(optionSettings);
        }
        this.optionSettings = optionSettingsCopy;

        return this;
    }
    
    /**
     * A list of configuration options to remove from the configuration set.
     * <p> Constraint: You can remove only <code>UserDefined</code>
     * configuration options.
     *
     * @return A list of configuration options to remove from the configuration set.
     *         <p> Constraint: You can remove only <code>UserDefined</code>
     *         configuration options.
     */
    public java.util.List<OptionSpecification> getOptionsToRemove() {
        
        if (optionsToRemove == null) {
            optionsToRemove = new java.util.ArrayList<OptionSpecification>();
        }
        return optionsToRemove;
    }
    
    /**
     * A list of configuration options to remove from the configuration set.
     * <p> Constraint: You can remove only <code>UserDefined</code>
     * configuration options.
     *
     * @param optionsToRemove A list of configuration options to remove from the configuration set.
     *         <p> Constraint: You can remove only <code>UserDefined</code>
     *         configuration options.
     */
    public void setOptionsToRemove(java.util.Collection<OptionSpecification> optionsToRemove) {
        java.util.List<OptionSpecification> optionsToRemoveCopy = new java.util.ArrayList<OptionSpecification>();
        if (optionsToRemove != null) {
            optionsToRemoveCopy.addAll(optionsToRemove);
        }
        this.optionsToRemove = optionsToRemoveCopy;
    }
    
    /**
     * A list of configuration options to remove from the configuration set.
     * <p> Constraint: You can remove only <code>UserDefined</code>
     * configuration options.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionsToRemove A list of configuration options to remove from the configuration set.
     *         <p> Constraint: You can remove only <code>UserDefined</code>
     *         configuration options.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateConfigurationTemplateRequest withOptionsToRemove(OptionSpecification... optionsToRemove) {
        if (getOptionsToRemove() == null) setOptionsToRemove(new java.util.ArrayList<OptionSpecification>());
        for (OptionSpecification value : optionsToRemove) {
            getOptionsToRemove().add(value);
        }
        return this;
    }
    
    /**
     * A list of configuration options to remove from the configuration set.
     * <p> Constraint: You can remove only <code>UserDefined</code>
     * configuration options.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionsToRemove A list of configuration options to remove from the configuration set.
     *         <p> Constraint: You can remove only <code>UserDefined</code>
     *         configuration options.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateConfigurationTemplateRequest withOptionsToRemove(java.util.Collection<OptionSpecification> optionsToRemove) {
        java.util.List<OptionSpecification> optionsToRemoveCopy = new java.util.ArrayList<OptionSpecification>();
        if (optionsToRemove != null) {
            optionsToRemoveCopy.addAll(optionsToRemove);
        }
        this.optionsToRemove = optionsToRemoveCopy;

        return this;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("ApplicationName: " + applicationName + ", ");
        sb.append("TemplateName: " + templateName + ", ");
        sb.append("Description: " + description + ", ");
        sb.append("OptionSettings: " + optionSettings + ", ");
        sb.append("OptionsToRemove: " + optionsToRemove + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    