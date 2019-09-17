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
 * Request to create a configuration template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/CreateConfigurationTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConfigurationTemplateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the application to associate with this configuration template. If no application is found with this
     * name, AWS Elastic Beanstalk returns an <code>InvalidParameterValue</code> error.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * The name of the configuration template.
     * </p>
     * <p>
     * Constraint: This name must be unique per application.
     * </p>
     * <p>
     * Default: If a configuration template already exists with this name, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     */
    private String templateName;
    /**
     * <p>
     * The name of the solution stack used by this configuration. The solution stack specifies the operating system,
     * architecture, and application server for a configuration template. It determines the set of configuration options
     * as well as the possible and default values.
     * </p>
     * <p>
     * Use <a>ListAvailableSolutionStacks</a> to obtain a list of available solution stacks.
     * </p>
     * <p>
     * A solution stack name or a source configuration parameter must be specified, otherwise AWS Elastic Beanstalk
     * returns an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * If a solution stack name is not specified and the source configuration parameter is specified, AWS Elastic
     * Beanstalk uses the same solution stack as the source configuration template.
     * </p>
     */
    private String solutionStackName;
    /**
     * <p>
     * The ARN of the custom platform.
     * </p>
     */
    private String platformArn;
    /**
     * <p>
     * If specified, AWS Elastic Beanstalk uses the configuration values from the specified configuration template to
     * create a new configuration.
     * </p>
     * <p>
     * Values specified in the <code>OptionSettings</code> parameter of this call overrides any values obtained from the
     * <code>SourceConfiguration</code>.
     * </p>
     * <p>
     * If no configuration template is found, returns an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Constraint: If both the solution stack name parameter and the source configuration parameters are specified, the
     * solution stack of the source configuration template must match the specified solution stack name or else AWS
     * Elastic Beanstalk returns an <code>InvalidParameterCombination</code> error.
     * </p>
     */
    private SourceConfiguration sourceConfiguration;
    /**
     * <p>
     * The ID of the environment used with this configuration template.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * Describes this configuration.
     * </p>
     */
    private String description;
    /**
     * <p>
     * If specified, AWS Elastic Beanstalk sets the specified configuration option to the requested value. The new value
     * overrides the value obtained from the solution stack or the source configuration template.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ConfigurationOptionSetting> optionSettings;
    /**
     * <p>
     * Specifies the tags applied to the configuration template.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * Default constructor for CreateConfigurationTemplateRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public CreateConfigurationTemplateRequest() {
    }

    /**
     * Constructs a new CreateConfigurationTemplateRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize any additional object members.
     * 
     * @param applicationName
     *        The name of the application to associate with this configuration template. If no application is found with
     *        this name, AWS Elastic Beanstalk returns an <code>InvalidParameterValue</code> error.
     * @param templateName
     *        The name of the configuration template.</p>
     *        <p>
     *        Constraint: This name must be unique per application.
     *        </p>
     *        <p>
     *        Default: If a configuration template already exists with this name, AWS Elastic Beanstalk returns an
     *        <code>InvalidParameterValue</code> error.
     */
    public CreateConfigurationTemplateRequest(String applicationName, String templateName) {
        setApplicationName(applicationName);
        setTemplateName(templateName);
    }

    /**
     * <p>
     * The name of the application to associate with this configuration template. If no application is found with this
     * name, AWS Elastic Beanstalk returns an <code>InvalidParameterValue</code> error.
     * </p>
     * 
     * @param applicationName
     *        The name of the application to associate with this configuration template. If no application is found with
     *        this name, AWS Elastic Beanstalk returns an <code>InvalidParameterValue</code> error.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application to associate with this configuration template. If no application is found with this
     * name, AWS Elastic Beanstalk returns an <code>InvalidParameterValue</code> error.
     * </p>
     * 
     * @return The name of the application to associate with this configuration template. If no application is found
     *         with this name, AWS Elastic Beanstalk returns an <code>InvalidParameterValue</code> error.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of the application to associate with this configuration template. If no application is found with this
     * name, AWS Elastic Beanstalk returns an <code>InvalidParameterValue</code> error.
     * </p>
     * 
     * @param applicationName
     *        The name of the application to associate with this configuration template. If no application is found with
     *        this name, AWS Elastic Beanstalk returns an <code>InvalidParameterValue</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationTemplateRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * The name of the configuration template.
     * </p>
     * <p>
     * Constraint: This name must be unique per application.
     * </p>
     * <p>
     * Default: If a configuration template already exists with this name, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * 
     * @param templateName
     *        The name of the configuration template.</p>
     *        <p>
     *        Constraint: This name must be unique per application.
     *        </p>
     *        <p>
     *        Default: If a configuration template already exists with this name, AWS Elastic Beanstalk returns an
     *        <code>InvalidParameterValue</code> error.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the configuration template.
     * </p>
     * <p>
     * Constraint: This name must be unique per application.
     * </p>
     * <p>
     * Default: If a configuration template already exists with this name, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * 
     * @return The name of the configuration template.</p>
     *         <p>
     *         Constraint: This name must be unique per application.
     *         </p>
     *         <p>
     *         Default: If a configuration template already exists with this name, AWS Elastic Beanstalk returns an
     *         <code>InvalidParameterValue</code> error.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the configuration template.
     * </p>
     * <p>
     * Constraint: This name must be unique per application.
     * </p>
     * <p>
     * Default: If a configuration template already exists with this name, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * 
     * @param templateName
     *        The name of the configuration template.</p>
     *        <p>
     *        Constraint: This name must be unique per application.
     *        </p>
     *        <p>
     *        Default: If a configuration template already exists with this name, AWS Elastic Beanstalk returns an
     *        <code>InvalidParameterValue</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationTemplateRequest withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

    /**
     * <p>
     * The name of the solution stack used by this configuration. The solution stack specifies the operating system,
     * architecture, and application server for a configuration template. It determines the set of configuration options
     * as well as the possible and default values.
     * </p>
     * <p>
     * Use <a>ListAvailableSolutionStacks</a> to obtain a list of available solution stacks.
     * </p>
     * <p>
     * A solution stack name or a source configuration parameter must be specified, otherwise AWS Elastic Beanstalk
     * returns an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * If a solution stack name is not specified and the source configuration parameter is specified, AWS Elastic
     * Beanstalk uses the same solution stack as the source configuration template.
     * </p>
     * 
     * @param solutionStackName
     *        The name of the solution stack used by this configuration. The solution stack specifies the operating
     *        system, architecture, and application server for a configuration template. It determines the set of
     *        configuration options as well as the possible and default values.</p>
     *        <p>
     *        Use <a>ListAvailableSolutionStacks</a> to obtain a list of available solution stacks.
     *        </p>
     *        <p>
     *        A solution stack name or a source configuration parameter must be specified, otherwise AWS Elastic
     *        Beanstalk returns an <code>InvalidParameterValue</code> error.
     *        </p>
     *        <p>
     *        If a solution stack name is not specified and the source configuration parameter is specified, AWS Elastic
     *        Beanstalk uses the same solution stack as the source configuration template.
     */

    public void setSolutionStackName(String solutionStackName) {
        this.solutionStackName = solutionStackName;
    }

    /**
     * <p>
     * The name of the solution stack used by this configuration. The solution stack specifies the operating system,
     * architecture, and application server for a configuration template. It determines the set of configuration options
     * as well as the possible and default values.
     * </p>
     * <p>
     * Use <a>ListAvailableSolutionStacks</a> to obtain a list of available solution stacks.
     * </p>
     * <p>
     * A solution stack name or a source configuration parameter must be specified, otherwise AWS Elastic Beanstalk
     * returns an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * If a solution stack name is not specified and the source configuration parameter is specified, AWS Elastic
     * Beanstalk uses the same solution stack as the source configuration template.
     * </p>
     * 
     * @return The name of the solution stack used by this configuration. The solution stack specifies the operating
     *         system, architecture, and application server for a configuration template. It determines the set of
     *         configuration options as well as the possible and default values.</p>
     *         <p>
     *         Use <a>ListAvailableSolutionStacks</a> to obtain a list of available solution stacks.
     *         </p>
     *         <p>
     *         A solution stack name or a source configuration parameter must be specified, otherwise AWS Elastic
     *         Beanstalk returns an <code>InvalidParameterValue</code> error.
     *         </p>
     *         <p>
     *         If a solution stack name is not specified and the source configuration parameter is specified, AWS
     *         Elastic Beanstalk uses the same solution stack as the source configuration template.
     */

    public String getSolutionStackName() {
        return this.solutionStackName;
    }

    /**
     * <p>
     * The name of the solution stack used by this configuration. The solution stack specifies the operating system,
     * architecture, and application server for a configuration template. It determines the set of configuration options
     * as well as the possible and default values.
     * </p>
     * <p>
     * Use <a>ListAvailableSolutionStacks</a> to obtain a list of available solution stacks.
     * </p>
     * <p>
     * A solution stack name or a source configuration parameter must be specified, otherwise AWS Elastic Beanstalk
     * returns an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * If a solution stack name is not specified and the source configuration parameter is specified, AWS Elastic
     * Beanstalk uses the same solution stack as the source configuration template.
     * </p>
     * 
     * @param solutionStackName
     *        The name of the solution stack used by this configuration. The solution stack specifies the operating
     *        system, architecture, and application server for a configuration template. It determines the set of
     *        configuration options as well as the possible and default values.</p>
     *        <p>
     *        Use <a>ListAvailableSolutionStacks</a> to obtain a list of available solution stacks.
     *        </p>
     *        <p>
     *        A solution stack name or a source configuration parameter must be specified, otherwise AWS Elastic
     *        Beanstalk returns an <code>InvalidParameterValue</code> error.
     *        </p>
     *        <p>
     *        If a solution stack name is not specified and the source configuration parameter is specified, AWS Elastic
     *        Beanstalk uses the same solution stack as the source configuration template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationTemplateRequest withSolutionStackName(String solutionStackName) {
        setSolutionStackName(solutionStackName);
        return this;
    }

    /**
     * <p>
     * The ARN of the custom platform.
     * </p>
     * 
     * @param platformArn
     *        The ARN of the custom platform.
     */

    public void setPlatformArn(String platformArn) {
        this.platformArn = platformArn;
    }

    /**
     * <p>
     * The ARN of the custom platform.
     * </p>
     * 
     * @return The ARN of the custom platform.
     */

    public String getPlatformArn() {
        return this.platformArn;
    }

    /**
     * <p>
     * The ARN of the custom platform.
     * </p>
     * 
     * @param platformArn
     *        The ARN of the custom platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationTemplateRequest withPlatformArn(String platformArn) {
        setPlatformArn(platformArn);
        return this;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk uses the configuration values from the specified configuration template to
     * create a new configuration.
     * </p>
     * <p>
     * Values specified in the <code>OptionSettings</code> parameter of this call overrides any values obtained from the
     * <code>SourceConfiguration</code>.
     * </p>
     * <p>
     * If no configuration template is found, returns an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Constraint: If both the solution stack name parameter and the source configuration parameters are specified, the
     * solution stack of the source configuration template must match the specified solution stack name or else AWS
     * Elastic Beanstalk returns an <code>InvalidParameterCombination</code> error.
     * </p>
     * 
     * @param sourceConfiguration
     *        If specified, AWS Elastic Beanstalk uses the configuration values from the specified configuration
     *        template to create a new configuration.</p>
     *        <p>
     *        Values specified in the <code>OptionSettings</code> parameter of this call overrides any values obtained
     *        from the <code>SourceConfiguration</code>.
     *        </p>
     *        <p>
     *        If no configuration template is found, returns an <code>InvalidParameterValue</code> error.
     *        </p>
     *        <p>
     *        Constraint: If both the solution stack name parameter and the source configuration parameters are
     *        specified, the solution stack of the source configuration template must match the specified solution stack
     *        name or else AWS Elastic Beanstalk returns an <code>InvalidParameterCombination</code> error.
     */

    public void setSourceConfiguration(SourceConfiguration sourceConfiguration) {
        this.sourceConfiguration = sourceConfiguration;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk uses the configuration values from the specified configuration template to
     * create a new configuration.
     * </p>
     * <p>
     * Values specified in the <code>OptionSettings</code> parameter of this call overrides any values obtained from the
     * <code>SourceConfiguration</code>.
     * </p>
     * <p>
     * If no configuration template is found, returns an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Constraint: If both the solution stack name parameter and the source configuration parameters are specified, the
     * solution stack of the source configuration template must match the specified solution stack name or else AWS
     * Elastic Beanstalk returns an <code>InvalidParameterCombination</code> error.
     * </p>
     * 
     * @return If specified, AWS Elastic Beanstalk uses the configuration values from the specified configuration
     *         template to create a new configuration.</p>
     *         <p>
     *         Values specified in the <code>OptionSettings</code> parameter of this call overrides any values obtained
     *         from the <code>SourceConfiguration</code>.
     *         </p>
     *         <p>
     *         If no configuration template is found, returns an <code>InvalidParameterValue</code> error.
     *         </p>
     *         <p>
     *         Constraint: If both the solution stack name parameter and the source configuration parameters are
     *         specified, the solution stack of the source configuration template must match the specified solution
     *         stack name or else AWS Elastic Beanstalk returns an <code>InvalidParameterCombination</code> error.
     */

    public SourceConfiguration getSourceConfiguration() {
        return this.sourceConfiguration;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk uses the configuration values from the specified configuration template to
     * create a new configuration.
     * </p>
     * <p>
     * Values specified in the <code>OptionSettings</code> parameter of this call overrides any values obtained from the
     * <code>SourceConfiguration</code>.
     * </p>
     * <p>
     * If no configuration template is found, returns an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Constraint: If both the solution stack name parameter and the source configuration parameters are specified, the
     * solution stack of the source configuration template must match the specified solution stack name or else AWS
     * Elastic Beanstalk returns an <code>InvalidParameterCombination</code> error.
     * </p>
     * 
     * @param sourceConfiguration
     *        If specified, AWS Elastic Beanstalk uses the configuration values from the specified configuration
     *        template to create a new configuration.</p>
     *        <p>
     *        Values specified in the <code>OptionSettings</code> parameter of this call overrides any values obtained
     *        from the <code>SourceConfiguration</code>.
     *        </p>
     *        <p>
     *        If no configuration template is found, returns an <code>InvalidParameterValue</code> error.
     *        </p>
     *        <p>
     *        Constraint: If both the solution stack name parameter and the source configuration parameters are
     *        specified, the solution stack of the source configuration template must match the specified solution stack
     *        name or else AWS Elastic Beanstalk returns an <code>InvalidParameterCombination</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationTemplateRequest withSourceConfiguration(SourceConfiguration sourceConfiguration) {
        setSourceConfiguration(sourceConfiguration);
        return this;
    }

    /**
     * <p>
     * The ID of the environment used with this configuration template.
     * </p>
     * 
     * @param environmentId
     *        The ID of the environment used with this configuration template.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The ID of the environment used with this configuration template.
     * </p>
     * 
     * @return The ID of the environment used with this configuration template.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * The ID of the environment used with this configuration template.
     * </p>
     * 
     * @param environmentId
     *        The ID of the environment used with this configuration template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationTemplateRequest withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * Describes this configuration.
     * </p>
     * 
     * @param description
     *        Describes this configuration.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Describes this configuration.
     * </p>
     * 
     * @return Describes this configuration.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Describes this configuration.
     * </p>
     * 
     * @param description
     *        Describes this configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationTemplateRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk sets the specified configuration option to the requested value. The new value
     * overrides the value obtained from the solution stack or the source configuration template.
     * </p>
     * 
     * @return If specified, AWS Elastic Beanstalk sets the specified configuration option to the requested value. The
     *         new value overrides the value obtained from the solution stack or the source configuration template.
     */

    public java.util.List<ConfigurationOptionSetting> getOptionSettings() {
        if (optionSettings == null) {
            optionSettings = new com.amazonaws.internal.SdkInternalList<ConfigurationOptionSetting>();
        }
        return optionSettings;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk sets the specified configuration option to the requested value. The new value
     * overrides the value obtained from the solution stack or the source configuration template.
     * </p>
     * 
     * @param optionSettings
     *        If specified, AWS Elastic Beanstalk sets the specified configuration option to the requested value. The
     *        new value overrides the value obtained from the solution stack or the source configuration template.
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
     * If specified, AWS Elastic Beanstalk sets the specified configuration option to the requested value. The new value
     * overrides the value obtained from the solution stack or the source configuration template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptionSettings(java.util.Collection)} or {@link #withOptionSettings(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param optionSettings
     *        If specified, AWS Elastic Beanstalk sets the specified configuration option to the requested value. The
     *        new value overrides the value obtained from the solution stack or the source configuration template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationTemplateRequest withOptionSettings(ConfigurationOptionSetting... optionSettings) {
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
     * If specified, AWS Elastic Beanstalk sets the specified configuration option to the requested value. The new value
     * overrides the value obtained from the solution stack or the source configuration template.
     * </p>
     * 
     * @param optionSettings
     *        If specified, AWS Elastic Beanstalk sets the specified configuration option to the requested value. The
     *        new value overrides the value obtained from the solution stack or the source configuration template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationTemplateRequest withOptionSettings(java.util.Collection<ConfigurationOptionSetting> optionSettings) {
        setOptionSettings(optionSettings);
        return this;
    }

    /**
     * <p>
     * Specifies the tags applied to the configuration template.
     * </p>
     * 
     * @return Specifies the tags applied to the configuration template.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Specifies the tags applied to the configuration template.
     * </p>
     * 
     * @param tags
     *        Specifies the tags applied to the configuration template.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * Specifies the tags applied to the configuration template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Specifies the tags applied to the configuration template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationTemplateRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the tags applied to the configuration template.
     * </p>
     * 
     * @param tags
     *        Specifies the tags applied to the configuration template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationTemplateRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getSolutionStackName() != null)
            sb.append("SolutionStackName: ").append(getSolutionStackName()).append(",");
        if (getPlatformArn() != null)
            sb.append("PlatformArn: ").append(getPlatformArn()).append(",");
        if (getSourceConfiguration() != null)
            sb.append("SourceConfiguration: ").append(getSourceConfiguration()).append(",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getOptionSettings() != null)
            sb.append("OptionSettings: ").append(getOptionSettings()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateConfigurationTemplateRequest == false)
            return false;
        CreateConfigurationTemplateRequest other = (CreateConfigurationTemplateRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getSolutionStackName() == null ^ this.getSolutionStackName() == null)
            return false;
        if (other.getSolutionStackName() != null && other.getSolutionStackName().equals(this.getSolutionStackName()) == false)
            return false;
        if (other.getPlatformArn() == null ^ this.getPlatformArn() == null)
            return false;
        if (other.getPlatformArn() != null && other.getPlatformArn().equals(this.getPlatformArn()) == false)
            return false;
        if (other.getSourceConfiguration() == null ^ this.getSourceConfiguration() == null)
            return false;
        if (other.getSourceConfiguration() != null && other.getSourceConfiguration().equals(this.getSourceConfiguration()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getOptionSettings() == null ^ this.getOptionSettings() == null)
            return false;
        if (other.getOptionSettings() != null && other.getOptionSettings().equals(this.getOptionSettings()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode + ((getSolutionStackName() == null) ? 0 : getSolutionStackName().hashCode());
        hashCode = prime * hashCode + ((getPlatformArn() == null) ? 0 : getPlatformArn().hashCode());
        hashCode = prime * hashCode + ((getSourceConfiguration() == null) ? 0 : getSourceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getOptionSettings() == null) ? 0 : getOptionSettings().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateConfigurationTemplateRequest clone() {
        return (CreateConfigurationTemplateRequest) super.clone();
    }

}
