/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#updateConfigurationTemplate(UpdateConfigurationTemplateRequest) UpdateConfigurationTemplate operation}.
 * <p>
 * Updates the specified configuration template to have the specified properties or configuration option values.
 * </p>
 * <p>
 * <b>NOTE:</b> If a property (for example, ApplicationName) is not provided, its value remains unchanged. To clear such properties, specify an empty
 * string.
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
public class UpdateConfigurationTemplateRequest extends AmazonWebServiceRequest implements Serializable {

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
    private com.amazonaws.internal.ListWithAutoConstructFlag<ConfigurationOptionSetting> optionSettings;

    /**
     * A list of configuration options to remove from the configuration set.
     * <p> Constraint: You can remove only <code>UserDefined</code>
     * configuration options.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<OptionSpecification> optionsToRemove;

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
        setApplicationName(applicationName);
        setTemplateName(templateName);
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
              optionSettings = new com.amazonaws.internal.ListWithAutoConstructFlag<ConfigurationOptionSetting>();
              optionSettings.setAutoConstruct(true);
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
        if (optionSettings == null) {
            this.optionSettings = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ConfigurationOptionSetting> optionSettingsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ConfigurationOptionSetting>(optionSettings.size());
        optionSettingsCopy.addAll(optionSettings);
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
        if (getOptionSettings() == null) setOptionSettings(new java.util.ArrayList<ConfigurationOptionSetting>(optionSettings.length));
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
        if (optionSettings == null) {
            this.optionSettings = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ConfigurationOptionSetting> optionSettingsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ConfigurationOptionSetting>(optionSettings.size());
            optionSettingsCopy.addAll(optionSettings);
            this.optionSettings = optionSettingsCopy;
        }

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
              optionsToRemove = new com.amazonaws.internal.ListWithAutoConstructFlag<OptionSpecification>();
              optionsToRemove.setAutoConstruct(true);
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
        if (optionsToRemove == null) {
            this.optionsToRemove = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<OptionSpecification> optionsToRemoveCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<OptionSpecification>(optionsToRemove.size());
        optionsToRemoveCopy.addAll(optionsToRemove);
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
        if (getOptionsToRemove() == null) setOptionsToRemove(new java.util.ArrayList<OptionSpecification>(optionsToRemove.length));
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
        if (optionsToRemove == null) {
            this.optionsToRemove = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<OptionSpecification> optionsToRemoveCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<OptionSpecification>(optionsToRemove.size());
            optionsToRemoveCopy.addAll(optionsToRemove);
            this.optionsToRemove = optionsToRemoveCopy;
        }

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
        if (getApplicationName() != null) sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getTemplateName() != null) sb.append("TemplateName: " + getTemplateName() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getOptionSettings() != null) sb.append("OptionSettings: " + getOptionSettings() + ",");
        if (getOptionsToRemove() != null) sb.append("OptionsToRemove: " + getOptionsToRemove() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateConfigurationTemplateRequest == false) return false;
        UpdateConfigurationTemplateRequest other = (UpdateConfigurationTemplateRequest)obj;
        
        if (other.getApplicationName() == null ^ this.getApplicationName() == null) return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false) return false; 
        if (other.getTemplateName() == null ^ this.getTemplateName() == null) return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getOptionSettings() == null ^ this.getOptionSettings() == null) return false;
        if (other.getOptionSettings() != null && other.getOptionSettings().equals(this.getOptionSettings()) == false) return false; 
        if (other.getOptionsToRemove() == null ^ this.getOptionsToRemove() == null) return false;
        if (other.getOptionsToRemove() != null && other.getOptionsToRemove().equals(this.getOptionsToRemove()) == false) return false; 
        return true;
    }
    
}
    