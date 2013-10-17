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
 * Container for the parameters to the {@link com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#createConfigurationTemplate(CreateConfigurationTemplateRequest) CreateConfigurationTemplate operation}.
 * <p>
 * Creates a configuration template. Templates are associated with a specific application and are used to deploy different versions of the application
 * with the same configuration settings.
 * </p>
 * <p>
 * Related Topics
 * </p>
 * 
 * <ul>
 * <li> DescribeConfigurationOptions </li>
 * <li> DescribeConfigurationSettings </li>
 * <li> ListAvailableSolutionStacks </li>
 * 
 * </ul>
 *
 * @see com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#createConfigurationTemplate(CreateConfigurationTemplateRequest)
 */
public class CreateConfigurationTemplateRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the application to associate with this configuration
     * template. If no application is found with this name, AWS Elastic
     * Beanstalk returns an <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * The name of the configuration template. <p>Constraint: This name must
     * be unique per application. <p>Default: If a configuration template
     * already exists with this name, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String templateName;

    /**
     * The name of the solution stack used by this configuration. The
     * solution stack specifies the operating system, architecture, and
     * application server for a configuration template. It determines the set
     * of configuration options as well as the possible and default values.
     * <p> Use <a>ListAvailableSolutionStacks</a> to obtain a list of
     * available solution stacks. <p> Default: If the
     * <code>SolutionStackName</code> is not specified and the source
     * configuration parameter is blank, AWS Elastic Beanstalk uses the
     * default solution stack. <p>If not specified and the source
     * configuration parameter is specified, AWS Elastic Beanstalk uses the
     * same solution stack as the source configuration template.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private String solutionStackName;

    /**
     * If specified, AWS Elastic Beanstalk uses the configuration values from
     * the specified configuration template to create a new configuration.
     * <p> Values specified in the <code>OptionSettings</code> parameter of
     * this call overrides any values obtained from the
     * <code>SourceConfiguration</code>. <p> If no configuration template is
     * found, returns an <code>InvalidParameterValue</code> error. <p>
     * Constraint: If both the solution stack name parameter and the source
     * configuration parameters are specified, the solution stack of the
     * source configuration template must match the specified solution stack
     * name or else AWS Elastic Beanstalk returns an
     * <code>InvalidParameterCombination</code> error.
     */
    private SourceConfiguration sourceConfiguration;

    /**
     * The ID of the environment used with this configuration template.
     */
    private String environmentId;

    /**
     * Describes this configuration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     */
    private String description;

    /**
     * If specified, AWS Elastic Beanstalk sets the specified configuration
     * option to the requested value. The new value overrides the value
     * obtained from the solution stack or the source configuration template.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ConfigurationOptionSetting> optionSettings;

    /**
     * Default constructor for a new CreateConfigurationTemplateRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateConfigurationTemplateRequest() {}
    
    /**
     * Constructs a new CreateConfigurationTemplateRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param applicationName The name of the application to associate with
     * this configuration template. If no application is found with this
     * name, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     * @param templateName The name of the configuration template.
     * <p>Constraint: This name must be unique per application. <p>Default:
     * If a configuration template already exists with this name, AWS Elastic
     * Beanstalk returns an <code>InvalidParameterValue</code> error.
     */
    public CreateConfigurationTemplateRequest(String applicationName, String templateName) {
        setApplicationName(applicationName);
        setTemplateName(templateName);
    }

    /**
     * The name of the application to associate with this configuration
     * template. If no application is found with this name, AWS Elastic
     * Beanstalk returns an <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of the application to associate with this configuration
     *         template. If no application is found with this name, AWS Elastic
     *         Beanstalk returns an <code>InvalidParameterValue</code> error.
     */
    public String getApplicationName() {
        return applicationName;
    }
    
    /**
     * The name of the application to associate with this configuration
     * template. If no application is found with this name, AWS Elastic
     * Beanstalk returns an <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of the application to associate with this configuration
     *         template. If no application is found with this name, AWS Elastic
     *         Beanstalk returns an <code>InvalidParameterValue</code> error.
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    
    /**
     * The name of the application to associate with this configuration
     * template. If no application is found with this name, AWS Elastic
     * Beanstalk returns an <code>InvalidParameterValue</code> error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of the application to associate with this configuration
     *         template. If no application is found with this name, AWS Elastic
     *         Beanstalk returns an <code>InvalidParameterValue</code> error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateConfigurationTemplateRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * The name of the configuration template. <p>Constraint: This name must
     * be unique per application. <p>Default: If a configuration template
     * already exists with this name, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of the configuration template. <p>Constraint: This name must
     *         be unique per application. <p>Default: If a configuration template
     *         already exists with this name, AWS Elastic Beanstalk returns an
     *         <code>InvalidParameterValue</code> error.
     */
    public String getTemplateName() {
        return templateName;
    }
    
    /**
     * The name of the configuration template. <p>Constraint: This name must
     * be unique per application. <p>Default: If a configuration template
     * already exists with this name, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param templateName The name of the configuration template. <p>Constraint: This name must
     *         be unique per application. <p>Default: If a configuration template
     *         already exists with this name, AWS Elastic Beanstalk returns an
     *         <code>InvalidParameterValue</code> error.
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }
    
    /**
     * The name of the configuration template. <p>Constraint: This name must
     * be unique per application. <p>Default: If a configuration template
     * already exists with this name, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param templateName The name of the configuration template. <p>Constraint: This name must
     *         be unique per application. <p>Default: If a configuration template
     *         already exists with this name, AWS Elastic Beanstalk returns an
     *         <code>InvalidParameterValue</code> error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateConfigurationTemplateRequest withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * The name of the solution stack used by this configuration. The
     * solution stack specifies the operating system, architecture, and
     * application server for a configuration template. It determines the set
     * of configuration options as well as the possible and default values.
     * <p> Use <a>ListAvailableSolutionStacks</a> to obtain a list of
     * available solution stacks. <p> Default: If the
     * <code>SolutionStackName</code> is not specified and the source
     * configuration parameter is blank, AWS Elastic Beanstalk uses the
     * default solution stack. <p>If not specified and the source
     * configuration parameter is specified, AWS Elastic Beanstalk uses the
     * same solution stack as the source configuration template.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return The name of the solution stack used by this configuration. The
     *         solution stack specifies the operating system, architecture, and
     *         application server for a configuration template. It determines the set
     *         of configuration options as well as the possible and default values.
     *         <p> Use <a>ListAvailableSolutionStacks</a> to obtain a list of
     *         available solution stacks. <p> Default: If the
     *         <code>SolutionStackName</code> is not specified and the source
     *         configuration parameter is blank, AWS Elastic Beanstalk uses the
     *         default solution stack. <p>If not specified and the source
     *         configuration parameter is specified, AWS Elastic Beanstalk uses the
     *         same solution stack as the source configuration template.
     */
    public String getSolutionStackName() {
        return solutionStackName;
    }
    
    /**
     * The name of the solution stack used by this configuration. The
     * solution stack specifies the operating system, architecture, and
     * application server for a configuration template. It determines the set
     * of configuration options as well as the possible and default values.
     * <p> Use <a>ListAvailableSolutionStacks</a> to obtain a list of
     * available solution stacks. <p> Default: If the
     * <code>SolutionStackName</code> is not specified and the source
     * configuration parameter is blank, AWS Elastic Beanstalk uses the
     * default solution stack. <p>If not specified and the source
     * configuration parameter is specified, AWS Elastic Beanstalk uses the
     * same solution stack as the source configuration template.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param solutionStackName The name of the solution stack used by this configuration. The
     *         solution stack specifies the operating system, architecture, and
     *         application server for a configuration template. It determines the set
     *         of configuration options as well as the possible and default values.
     *         <p> Use <a>ListAvailableSolutionStacks</a> to obtain a list of
     *         available solution stacks. <p> Default: If the
     *         <code>SolutionStackName</code> is not specified and the source
     *         configuration parameter is blank, AWS Elastic Beanstalk uses the
     *         default solution stack. <p>If not specified and the source
     *         configuration parameter is specified, AWS Elastic Beanstalk uses the
     *         same solution stack as the source configuration template.
     */
    public void setSolutionStackName(String solutionStackName) {
        this.solutionStackName = solutionStackName;
    }
    
    /**
     * The name of the solution stack used by this configuration. The
     * solution stack specifies the operating system, architecture, and
     * application server for a configuration template. It determines the set
     * of configuration options as well as the possible and default values.
     * <p> Use <a>ListAvailableSolutionStacks</a> to obtain a list of
     * available solution stacks. <p> Default: If the
     * <code>SolutionStackName</code> is not specified and the source
     * configuration parameter is blank, AWS Elastic Beanstalk uses the
     * default solution stack. <p>If not specified and the source
     * configuration parameter is specified, AWS Elastic Beanstalk uses the
     * same solution stack as the source configuration template.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param solutionStackName The name of the solution stack used by this configuration. The
     *         solution stack specifies the operating system, architecture, and
     *         application server for a configuration template. It determines the set
     *         of configuration options as well as the possible and default values.
     *         <p> Use <a>ListAvailableSolutionStacks</a> to obtain a list of
     *         available solution stacks. <p> Default: If the
     *         <code>SolutionStackName</code> is not specified and the source
     *         configuration parameter is blank, AWS Elastic Beanstalk uses the
     *         default solution stack. <p>If not specified and the source
     *         configuration parameter is specified, AWS Elastic Beanstalk uses the
     *         same solution stack as the source configuration template.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateConfigurationTemplateRequest withSolutionStackName(String solutionStackName) {
        this.solutionStackName = solutionStackName;
        return this;
    }

    /**
     * If specified, AWS Elastic Beanstalk uses the configuration values from
     * the specified configuration template to create a new configuration.
     * <p> Values specified in the <code>OptionSettings</code> parameter of
     * this call overrides any values obtained from the
     * <code>SourceConfiguration</code>. <p> If no configuration template is
     * found, returns an <code>InvalidParameterValue</code> error. <p>
     * Constraint: If both the solution stack name parameter and the source
     * configuration parameters are specified, the solution stack of the
     * source configuration template must match the specified solution stack
     * name or else AWS Elastic Beanstalk returns an
     * <code>InvalidParameterCombination</code> error.
     *
     * @return If specified, AWS Elastic Beanstalk uses the configuration values from
     *         the specified configuration template to create a new configuration.
     *         <p> Values specified in the <code>OptionSettings</code> parameter of
     *         this call overrides any values obtained from the
     *         <code>SourceConfiguration</code>. <p> If no configuration template is
     *         found, returns an <code>InvalidParameterValue</code> error. <p>
     *         Constraint: If both the solution stack name parameter and the source
     *         configuration parameters are specified, the solution stack of the
     *         source configuration template must match the specified solution stack
     *         name or else AWS Elastic Beanstalk returns an
     *         <code>InvalidParameterCombination</code> error.
     */
    public SourceConfiguration getSourceConfiguration() {
        return sourceConfiguration;
    }
    
    /**
     * If specified, AWS Elastic Beanstalk uses the configuration values from
     * the specified configuration template to create a new configuration.
     * <p> Values specified in the <code>OptionSettings</code> parameter of
     * this call overrides any values obtained from the
     * <code>SourceConfiguration</code>. <p> If no configuration template is
     * found, returns an <code>InvalidParameterValue</code> error. <p>
     * Constraint: If both the solution stack name parameter and the source
     * configuration parameters are specified, the solution stack of the
     * source configuration template must match the specified solution stack
     * name or else AWS Elastic Beanstalk returns an
     * <code>InvalidParameterCombination</code> error.
     *
     * @param sourceConfiguration If specified, AWS Elastic Beanstalk uses the configuration values from
     *         the specified configuration template to create a new configuration.
     *         <p> Values specified in the <code>OptionSettings</code> parameter of
     *         this call overrides any values obtained from the
     *         <code>SourceConfiguration</code>. <p> If no configuration template is
     *         found, returns an <code>InvalidParameterValue</code> error. <p>
     *         Constraint: If both the solution stack name parameter and the source
     *         configuration parameters are specified, the solution stack of the
     *         source configuration template must match the specified solution stack
     *         name or else AWS Elastic Beanstalk returns an
     *         <code>InvalidParameterCombination</code> error.
     */
    public void setSourceConfiguration(SourceConfiguration sourceConfiguration) {
        this.sourceConfiguration = sourceConfiguration;
    }
    
    /**
     * If specified, AWS Elastic Beanstalk uses the configuration values from
     * the specified configuration template to create a new configuration.
     * <p> Values specified in the <code>OptionSettings</code> parameter of
     * this call overrides any values obtained from the
     * <code>SourceConfiguration</code>. <p> If no configuration template is
     * found, returns an <code>InvalidParameterValue</code> error. <p>
     * Constraint: If both the solution stack name parameter and the source
     * configuration parameters are specified, the solution stack of the
     * source configuration template must match the specified solution stack
     * name or else AWS Elastic Beanstalk returns an
     * <code>InvalidParameterCombination</code> error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceConfiguration If specified, AWS Elastic Beanstalk uses the configuration values from
     *         the specified configuration template to create a new configuration.
     *         <p> Values specified in the <code>OptionSettings</code> parameter of
     *         this call overrides any values obtained from the
     *         <code>SourceConfiguration</code>. <p> If no configuration template is
     *         found, returns an <code>InvalidParameterValue</code> error. <p>
     *         Constraint: If both the solution stack name parameter and the source
     *         configuration parameters are specified, the solution stack of the
     *         source configuration template must match the specified solution stack
     *         name or else AWS Elastic Beanstalk returns an
     *         <code>InvalidParameterCombination</code> error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateConfigurationTemplateRequest withSourceConfiguration(SourceConfiguration sourceConfiguration) {
        this.sourceConfiguration = sourceConfiguration;
        return this;
    }

    /**
     * The ID of the environment used with this configuration template.
     *
     * @return The ID of the environment used with this configuration template.
     */
    public String getEnvironmentId() {
        return environmentId;
    }
    
    /**
     * The ID of the environment used with this configuration template.
     *
     * @param environmentId The ID of the environment used with this configuration template.
     */
    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }
    
    /**
     * The ID of the environment used with this configuration template.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param environmentId The ID of the environment used with this configuration template.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateConfigurationTemplateRequest withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    /**
     * Describes this configuration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @return Describes this configuration.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Describes this configuration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description Describes this configuration.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Describes this configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description Describes this configuration.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateConfigurationTemplateRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * If specified, AWS Elastic Beanstalk sets the specified configuration
     * option to the requested value. The new value overrides the value
     * obtained from the solution stack or the source configuration template.
     *
     * @return If specified, AWS Elastic Beanstalk sets the specified configuration
     *         option to the requested value. The new value overrides the value
     *         obtained from the solution stack or the source configuration template.
     */
    public java.util.List<ConfigurationOptionSetting> getOptionSettings() {
        if (optionSettings == null) {
              optionSettings = new com.amazonaws.internal.ListWithAutoConstructFlag<ConfigurationOptionSetting>();
              optionSettings.setAutoConstruct(true);
        }
        return optionSettings;
    }
    
    /**
     * If specified, AWS Elastic Beanstalk sets the specified configuration
     * option to the requested value. The new value overrides the value
     * obtained from the solution stack or the source configuration template.
     *
     * @param optionSettings If specified, AWS Elastic Beanstalk sets the specified configuration
     *         option to the requested value. The new value overrides the value
     *         obtained from the solution stack or the source configuration template.
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
     * If specified, AWS Elastic Beanstalk sets the specified configuration
     * option to the requested value. The new value overrides the value
     * obtained from the solution stack or the source configuration template.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionSettings If specified, AWS Elastic Beanstalk sets the specified configuration
     *         option to the requested value. The new value overrides the value
     *         obtained from the solution stack or the source configuration template.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateConfigurationTemplateRequest withOptionSettings(ConfigurationOptionSetting... optionSettings) {
        if (getOptionSettings() == null) setOptionSettings(new java.util.ArrayList<ConfigurationOptionSetting>(optionSettings.length));
        for (ConfigurationOptionSetting value : optionSettings) {
            getOptionSettings().add(value);
        }
        return this;
    }
    
    /**
     * If specified, AWS Elastic Beanstalk sets the specified configuration
     * option to the requested value. The new value overrides the value
     * obtained from the solution stack or the source configuration template.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionSettings If specified, AWS Elastic Beanstalk sets the specified configuration
     *         option to the requested value. The new value overrides the value
     *         obtained from the solution stack or the source configuration template.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateConfigurationTemplateRequest withOptionSettings(java.util.Collection<ConfigurationOptionSetting> optionSettings) {
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
        if (getSolutionStackName() != null) sb.append("SolutionStackName: " + getSolutionStackName() + ",");
        if (getSourceConfiguration() != null) sb.append("SourceConfiguration: " + getSourceConfiguration() + ",");
        if (getEnvironmentId() != null) sb.append("EnvironmentId: " + getEnvironmentId() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getOptionSettings() != null) sb.append("OptionSettings: " + getOptionSettings() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode()); 
        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode()); 
        hashCode = prime * hashCode + ((getSolutionStackName() == null) ? 0 : getSolutionStackName().hashCode()); 
        hashCode = prime * hashCode + ((getSourceConfiguration() == null) ? 0 : getSourceConfiguration().hashCode()); 
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getOptionSettings() == null) ? 0 : getOptionSettings().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateConfigurationTemplateRequest == false) return false;
        CreateConfigurationTemplateRequest other = (CreateConfigurationTemplateRequest)obj;
        
        if (other.getApplicationName() == null ^ this.getApplicationName() == null) return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false) return false; 
        if (other.getTemplateName() == null ^ this.getTemplateName() == null) return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false) return false; 
        if (other.getSolutionStackName() == null ^ this.getSolutionStackName() == null) return false;
        if (other.getSolutionStackName() != null && other.getSolutionStackName().equals(this.getSolutionStackName()) == false) return false; 
        if (other.getSourceConfiguration() == null ^ this.getSourceConfiguration() == null) return false;
        if (other.getSourceConfiguration() != null && other.getSourceConfiguration().equals(this.getSourceConfiguration()) == false) return false; 
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null) return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getOptionSettings() == null ^ this.getOptionSettings() == null) return false;
        if (other.getOptionSettings() != null && other.getOptionSettings().equals(this.getOptionSettings()) == false) return false; 
        return true;
    }
    
}
    