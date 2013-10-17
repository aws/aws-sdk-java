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
 * Container for the parameters to the {@link com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#createEnvironment(CreateEnvironmentRequest) CreateEnvironment operation}.
 * <p>
 * Launches an environment for the specified application using the specified configuration.
 * </p>
 *
 * @see com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#createEnvironment(CreateEnvironmentRequest)
 */
public class CreateEnvironmentRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the application that contains the version to be deployed.
     * <p> If no application is found with this name,
     * <code>CreateEnvironment</code> returns an
     * <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * The name of the application version to deploy. <p> If the specified
     * application has no associated application versions, AWS Elastic
     * Beanstalk <code>UpdateEnvironment</code> returns an
     * <code>InvalidParameterValue</code> error. <p> Default: If not
     * specified, AWS Elastic Beanstalk attempts to launch the most recently
     * created application version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String versionLabel;

    /**
     * A unique name for the deployment environment. Used in the application
     * URL. <p>Constraint: Must be from 4 to 23 characters in length. The
     * name can contain only letters, numbers, and hyphens. It cannot start
     * or end with a hyphen. This name must be unique in your account. If the
     * specified name already exists, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error. <p>Default: If the CNAME
     * parameter is not specified, the environment name becomes part of the
     * CNAME, and therefore part of the visible URL for your application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     */
    private String environmentName;

    /**
     * The name of the configuration template to use in deployment. If no
     * configuration template is found with this name, AWS Elastic Beanstalk
     * returns an <code>InvalidParameterValue</code> error. <p> Condition:
     * You must specify either this parameter or a
     * <code>SolutionStackName</code>, but not both. If you specify both, AWS
     * Elastic Beanstalk returns an <code>InvalidParameterCombination</code>
     * error. If you do not specify either, AWS Elastic Beanstalk returns a
     * <code>MissingRequiredParameter</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String templateName;

    /**
     * This is an alternative to specifying a configuration name. If
     * specified, AWS Elastic Beanstalk sets the configuration values to the
     * default values associated with the specified solution stack. <p>
     * Condition: You must specify either this or a
     * <code>TemplateName</code>, but not both. If you specify both, AWS
     * Elastic Beanstalk returns an <code>InvalidParameterCombination</code>
     * error. If you do not specify either, AWS Elastic Beanstalk returns a
     * <code>MissingRequiredParameter</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private String solutionStackName;

    /**
     * If specified, the environment attempts to use this value as the prefix
     * for the CNAME. If not specified, the environment uses the environment
     * name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 63<br/>
     */
    private String cNAMEPrefix;

    /**
     * Describes this environment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     */
    private String description;

    /**
     * If specified, AWS Elastic Beanstalk sets the specified configuration
     * options to the requested value in the configuration set for the new
     * environment. These override the values obtained from the solution
     * stack or the configuration template.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ConfigurationOptionSetting> optionSettings;

    /**
     * A list of custom user-defined configuration options to remove from the
     * configuration set for this new environment.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<OptionSpecification> optionsToRemove;

    /**
     * Default constructor for a new CreateEnvironmentRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateEnvironmentRequest() {}
    
    /**
     * Constructs a new CreateEnvironmentRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param applicationName The name of the application that contains the
     * version to be deployed. <p> If no application is found with this name,
     * <code>CreateEnvironment</code> returns an
     * <code>InvalidParameterValue</code> error.
     * @param environmentName A unique name for the deployment environment.
     * Used in the application URL. <p>Constraint: Must be from 4 to 23
     * characters in length. The name can contain only letters, numbers, and
     * hyphens. It cannot start or end with a hyphen. This name must be
     * unique in your account. If the specified name already exists, AWS
     * Elastic Beanstalk returns an <code>InvalidParameterValue</code> error.
     * <p>Default: If the CNAME parameter is not specified, the environment
     * name becomes part of the CNAME, and therefore part of the visible URL
     * for your application.
     */
    public CreateEnvironmentRequest(String applicationName, String environmentName) {
        setApplicationName(applicationName);
        setEnvironmentName(environmentName);
    }

    /**
     * The name of the application that contains the version to be deployed.
     * <p> If no application is found with this name,
     * <code>CreateEnvironment</code> returns an
     * <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of the application that contains the version to be deployed.
     *         <p> If no application is found with this name,
     *         <code>CreateEnvironment</code> returns an
     *         <code>InvalidParameterValue</code> error.
     */
    public String getApplicationName() {
        return applicationName;
    }
    
    /**
     * The name of the application that contains the version to be deployed.
     * <p> If no application is found with this name,
     * <code>CreateEnvironment</code> returns an
     * <code>InvalidParameterValue</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of the application that contains the version to be deployed.
     *         <p> If no application is found with this name,
     *         <code>CreateEnvironment</code> returns an
     *         <code>InvalidParameterValue</code> error.
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    
    /**
     * The name of the application that contains the version to be deployed.
     * <p> If no application is found with this name,
     * <code>CreateEnvironment</code> returns an
     * <code>InvalidParameterValue</code> error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of the application that contains the version to be deployed.
     *         <p> If no application is found with this name,
     *         <code>CreateEnvironment</code> returns an
     *         <code>InvalidParameterValue</code> error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateEnvironmentRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * The name of the application version to deploy. <p> If the specified
     * application has no associated application versions, AWS Elastic
     * Beanstalk <code>UpdateEnvironment</code> returns an
     * <code>InvalidParameterValue</code> error. <p> Default: If not
     * specified, AWS Elastic Beanstalk attempts to launch the most recently
     * created application version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of the application version to deploy. <p> If the specified
     *         application has no associated application versions, AWS Elastic
     *         Beanstalk <code>UpdateEnvironment</code> returns an
     *         <code>InvalidParameterValue</code> error. <p> Default: If not
     *         specified, AWS Elastic Beanstalk attempts to launch the most recently
     *         created application version.
     */
    public String getVersionLabel() {
        return versionLabel;
    }
    
    /**
     * The name of the application version to deploy. <p> If the specified
     * application has no associated application versions, AWS Elastic
     * Beanstalk <code>UpdateEnvironment</code> returns an
     * <code>InvalidParameterValue</code> error. <p> Default: If not
     * specified, AWS Elastic Beanstalk attempts to launch the most recently
     * created application version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param versionLabel The name of the application version to deploy. <p> If the specified
     *         application has no associated application versions, AWS Elastic
     *         Beanstalk <code>UpdateEnvironment</code> returns an
     *         <code>InvalidParameterValue</code> error. <p> Default: If not
     *         specified, AWS Elastic Beanstalk attempts to launch the most recently
     *         created application version.
     */
    public void setVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
    }
    
    /**
     * The name of the application version to deploy. <p> If the specified
     * application has no associated application versions, AWS Elastic
     * Beanstalk <code>UpdateEnvironment</code> returns an
     * <code>InvalidParameterValue</code> error. <p> Default: If not
     * specified, AWS Elastic Beanstalk attempts to launch the most recently
     * created application version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param versionLabel The name of the application version to deploy. <p> If the specified
     *         application has no associated application versions, AWS Elastic
     *         Beanstalk <code>UpdateEnvironment</code> returns an
     *         <code>InvalidParameterValue</code> error. <p> Default: If not
     *         specified, AWS Elastic Beanstalk attempts to launch the most recently
     *         created application version.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateEnvironmentRequest withVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
        return this;
    }

    /**
     * A unique name for the deployment environment. Used in the application
     * URL. <p>Constraint: Must be from 4 to 23 characters in length. The
     * name can contain only letters, numbers, and hyphens. It cannot start
     * or end with a hyphen. This name must be unique in your account. If the
     * specified name already exists, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error. <p>Default: If the CNAME
     * parameter is not specified, the environment name becomes part of the
     * CNAME, and therefore part of the visible URL for your application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @return A unique name for the deployment environment. Used in the application
     *         URL. <p>Constraint: Must be from 4 to 23 characters in length. The
     *         name can contain only letters, numbers, and hyphens. It cannot start
     *         or end with a hyphen. This name must be unique in your account. If the
     *         specified name already exists, AWS Elastic Beanstalk returns an
     *         <code>InvalidParameterValue</code> error. <p>Default: If the CNAME
     *         parameter is not specified, the environment name becomes part of the
     *         CNAME, and therefore part of the visible URL for your application.
     */
    public String getEnvironmentName() {
        return environmentName;
    }
    
    /**
     * A unique name for the deployment environment. Used in the application
     * URL. <p>Constraint: Must be from 4 to 23 characters in length. The
     * name can contain only letters, numbers, and hyphens. It cannot start
     * or end with a hyphen. This name must be unique in your account. If the
     * specified name already exists, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error. <p>Default: If the CNAME
     * parameter is not specified, the environment name becomes part of the
     * CNAME, and therefore part of the visible URL for your application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @param environmentName A unique name for the deployment environment. Used in the application
     *         URL. <p>Constraint: Must be from 4 to 23 characters in length. The
     *         name can contain only letters, numbers, and hyphens. It cannot start
     *         or end with a hyphen. This name must be unique in your account. If the
     *         specified name already exists, AWS Elastic Beanstalk returns an
     *         <code>InvalidParameterValue</code> error. <p>Default: If the CNAME
     *         parameter is not specified, the environment name becomes part of the
     *         CNAME, and therefore part of the visible URL for your application.
     */
    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }
    
    /**
     * A unique name for the deployment environment. Used in the application
     * URL. <p>Constraint: Must be from 4 to 23 characters in length. The
     * name can contain only letters, numbers, and hyphens. It cannot start
     * or end with a hyphen. This name must be unique in your account. If the
     * specified name already exists, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error. <p>Default: If the CNAME
     * parameter is not specified, the environment name becomes part of the
     * CNAME, and therefore part of the visible URL for your application.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @param environmentName A unique name for the deployment environment. Used in the application
     *         URL. <p>Constraint: Must be from 4 to 23 characters in length. The
     *         name can contain only letters, numbers, and hyphens. It cannot start
     *         or end with a hyphen. This name must be unique in your account. If the
     *         specified name already exists, AWS Elastic Beanstalk returns an
     *         <code>InvalidParameterValue</code> error. <p>Default: If the CNAME
     *         parameter is not specified, the environment name becomes part of the
     *         CNAME, and therefore part of the visible URL for your application.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateEnvironmentRequest withEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }

    /**
     * The name of the configuration template to use in deployment. If no
     * configuration template is found with this name, AWS Elastic Beanstalk
     * returns an <code>InvalidParameterValue</code> error. <p> Condition:
     * You must specify either this parameter or a
     * <code>SolutionStackName</code>, but not both. If you specify both, AWS
     * Elastic Beanstalk returns an <code>InvalidParameterCombination</code>
     * error. If you do not specify either, AWS Elastic Beanstalk returns a
     * <code>MissingRequiredParameter</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of the configuration template to use in deployment. If no
     *         configuration template is found with this name, AWS Elastic Beanstalk
     *         returns an <code>InvalidParameterValue</code> error. <p> Condition:
     *         You must specify either this parameter or a
     *         <code>SolutionStackName</code>, but not both. If you specify both, AWS
     *         Elastic Beanstalk returns an <code>InvalidParameterCombination</code>
     *         error. If you do not specify either, AWS Elastic Beanstalk returns a
     *         <code>MissingRequiredParameter</code> error.
     */
    public String getTemplateName() {
        return templateName;
    }
    
    /**
     * The name of the configuration template to use in deployment. If no
     * configuration template is found with this name, AWS Elastic Beanstalk
     * returns an <code>InvalidParameterValue</code> error. <p> Condition:
     * You must specify either this parameter or a
     * <code>SolutionStackName</code>, but not both. If you specify both, AWS
     * Elastic Beanstalk returns an <code>InvalidParameterCombination</code>
     * error. If you do not specify either, AWS Elastic Beanstalk returns a
     * <code>MissingRequiredParameter</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param templateName The name of the configuration template to use in deployment. If no
     *         configuration template is found with this name, AWS Elastic Beanstalk
     *         returns an <code>InvalidParameterValue</code> error. <p> Condition:
     *         You must specify either this parameter or a
     *         <code>SolutionStackName</code>, but not both. If you specify both, AWS
     *         Elastic Beanstalk returns an <code>InvalidParameterCombination</code>
     *         error. If you do not specify either, AWS Elastic Beanstalk returns a
     *         <code>MissingRequiredParameter</code> error.
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }
    
    /**
     * The name of the configuration template to use in deployment. If no
     * configuration template is found with this name, AWS Elastic Beanstalk
     * returns an <code>InvalidParameterValue</code> error. <p> Condition:
     * You must specify either this parameter or a
     * <code>SolutionStackName</code>, but not both. If you specify both, AWS
     * Elastic Beanstalk returns an <code>InvalidParameterCombination</code>
     * error. If you do not specify either, AWS Elastic Beanstalk returns a
     * <code>MissingRequiredParameter</code> error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param templateName The name of the configuration template to use in deployment. If no
     *         configuration template is found with this name, AWS Elastic Beanstalk
     *         returns an <code>InvalidParameterValue</code> error. <p> Condition:
     *         You must specify either this parameter or a
     *         <code>SolutionStackName</code>, but not both. If you specify both, AWS
     *         Elastic Beanstalk returns an <code>InvalidParameterCombination</code>
     *         error. If you do not specify either, AWS Elastic Beanstalk returns a
     *         <code>MissingRequiredParameter</code> error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateEnvironmentRequest withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * This is an alternative to specifying a configuration name. If
     * specified, AWS Elastic Beanstalk sets the configuration values to the
     * default values associated with the specified solution stack. <p>
     * Condition: You must specify either this or a
     * <code>TemplateName</code>, but not both. If you specify both, AWS
     * Elastic Beanstalk returns an <code>InvalidParameterCombination</code>
     * error. If you do not specify either, AWS Elastic Beanstalk returns a
     * <code>MissingRequiredParameter</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return This is an alternative to specifying a configuration name. If
     *         specified, AWS Elastic Beanstalk sets the configuration values to the
     *         default values associated with the specified solution stack. <p>
     *         Condition: You must specify either this or a
     *         <code>TemplateName</code>, but not both. If you specify both, AWS
     *         Elastic Beanstalk returns an <code>InvalidParameterCombination</code>
     *         error. If you do not specify either, AWS Elastic Beanstalk returns a
     *         <code>MissingRequiredParameter</code> error.
     */
    public String getSolutionStackName() {
        return solutionStackName;
    }
    
    /**
     * This is an alternative to specifying a configuration name. If
     * specified, AWS Elastic Beanstalk sets the configuration values to the
     * default values associated with the specified solution stack. <p>
     * Condition: You must specify either this or a
     * <code>TemplateName</code>, but not both. If you specify both, AWS
     * Elastic Beanstalk returns an <code>InvalidParameterCombination</code>
     * error. If you do not specify either, AWS Elastic Beanstalk returns a
     * <code>MissingRequiredParameter</code> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param solutionStackName This is an alternative to specifying a configuration name. If
     *         specified, AWS Elastic Beanstalk sets the configuration values to the
     *         default values associated with the specified solution stack. <p>
     *         Condition: You must specify either this or a
     *         <code>TemplateName</code>, but not both. If you specify both, AWS
     *         Elastic Beanstalk returns an <code>InvalidParameterCombination</code>
     *         error. If you do not specify either, AWS Elastic Beanstalk returns a
     *         <code>MissingRequiredParameter</code> error.
     */
    public void setSolutionStackName(String solutionStackName) {
        this.solutionStackName = solutionStackName;
    }
    
    /**
     * This is an alternative to specifying a configuration name. If
     * specified, AWS Elastic Beanstalk sets the configuration values to the
     * default values associated with the specified solution stack. <p>
     * Condition: You must specify either this or a
     * <code>TemplateName</code>, but not both. If you specify both, AWS
     * Elastic Beanstalk returns an <code>InvalidParameterCombination</code>
     * error. If you do not specify either, AWS Elastic Beanstalk returns a
     * <code>MissingRequiredParameter</code> error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param solutionStackName This is an alternative to specifying a configuration name. If
     *         specified, AWS Elastic Beanstalk sets the configuration values to the
     *         default values associated with the specified solution stack. <p>
     *         Condition: You must specify either this or a
     *         <code>TemplateName</code>, but not both. If you specify both, AWS
     *         Elastic Beanstalk returns an <code>InvalidParameterCombination</code>
     *         error. If you do not specify either, AWS Elastic Beanstalk returns a
     *         <code>MissingRequiredParameter</code> error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateEnvironmentRequest withSolutionStackName(String solutionStackName) {
        this.solutionStackName = solutionStackName;
        return this;
    }

    /**
     * If specified, the environment attempts to use this value as the prefix
     * for the CNAME. If not specified, the environment uses the environment
     * name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 63<br/>
     *
     * @return If specified, the environment attempts to use this value as the prefix
     *         for the CNAME. If not specified, the environment uses the environment
     *         name.
     */
    public String getCNAMEPrefix() {
        return cNAMEPrefix;
    }
    
    /**
     * If specified, the environment attempts to use this value as the prefix
     * for the CNAME. If not specified, the environment uses the environment
     * name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 63<br/>
     *
     * @param cNAMEPrefix If specified, the environment attempts to use this value as the prefix
     *         for the CNAME. If not specified, the environment uses the environment
     *         name.
     */
    public void setCNAMEPrefix(String cNAMEPrefix) {
        this.cNAMEPrefix = cNAMEPrefix;
    }
    
    /**
     * If specified, the environment attempts to use this value as the prefix
     * for the CNAME. If not specified, the environment uses the environment
     * name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 63<br/>
     *
     * @param cNAMEPrefix If specified, the environment attempts to use this value as the prefix
     *         for the CNAME. If not specified, the environment uses the environment
     *         name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateEnvironmentRequest withCNAMEPrefix(String cNAMEPrefix) {
        this.cNAMEPrefix = cNAMEPrefix;
        return this;
    }

    /**
     * Describes this environment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @return Describes this environment.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Describes this environment.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description Describes this environment.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Describes this environment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description Describes this environment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateEnvironmentRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * If specified, AWS Elastic Beanstalk sets the specified configuration
     * options to the requested value in the configuration set for the new
     * environment. These override the values obtained from the solution
     * stack or the configuration template.
     *
     * @return If specified, AWS Elastic Beanstalk sets the specified configuration
     *         options to the requested value in the configuration set for the new
     *         environment. These override the values obtained from the solution
     *         stack or the configuration template.
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
     * options to the requested value in the configuration set for the new
     * environment. These override the values obtained from the solution
     * stack or the configuration template.
     *
     * @param optionSettings If specified, AWS Elastic Beanstalk sets the specified configuration
     *         options to the requested value in the configuration set for the new
     *         environment. These override the values obtained from the solution
     *         stack or the configuration template.
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
     * options to the requested value in the configuration set for the new
     * environment. These override the values obtained from the solution
     * stack or the configuration template.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionSettings If specified, AWS Elastic Beanstalk sets the specified configuration
     *         options to the requested value in the configuration set for the new
     *         environment. These override the values obtained from the solution
     *         stack or the configuration template.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateEnvironmentRequest withOptionSettings(ConfigurationOptionSetting... optionSettings) {
        if (getOptionSettings() == null) setOptionSettings(new java.util.ArrayList<ConfigurationOptionSetting>(optionSettings.length));
        for (ConfigurationOptionSetting value : optionSettings) {
            getOptionSettings().add(value);
        }
        return this;
    }
    
    /**
     * If specified, AWS Elastic Beanstalk sets the specified configuration
     * options to the requested value in the configuration set for the new
     * environment. These override the values obtained from the solution
     * stack or the configuration template.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionSettings If specified, AWS Elastic Beanstalk sets the specified configuration
     *         options to the requested value in the configuration set for the new
     *         environment. These override the values obtained from the solution
     *         stack or the configuration template.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateEnvironmentRequest withOptionSettings(java.util.Collection<ConfigurationOptionSetting> optionSettings) {
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
     * A list of custom user-defined configuration options to remove from the
     * configuration set for this new environment.
     *
     * @return A list of custom user-defined configuration options to remove from the
     *         configuration set for this new environment.
     */
    public java.util.List<OptionSpecification> getOptionsToRemove() {
        if (optionsToRemove == null) {
              optionsToRemove = new com.amazonaws.internal.ListWithAutoConstructFlag<OptionSpecification>();
              optionsToRemove.setAutoConstruct(true);
        }
        return optionsToRemove;
    }
    
    /**
     * A list of custom user-defined configuration options to remove from the
     * configuration set for this new environment.
     *
     * @param optionsToRemove A list of custom user-defined configuration options to remove from the
     *         configuration set for this new environment.
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
     * A list of custom user-defined configuration options to remove from the
     * configuration set for this new environment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionsToRemove A list of custom user-defined configuration options to remove from the
     *         configuration set for this new environment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateEnvironmentRequest withOptionsToRemove(OptionSpecification... optionsToRemove) {
        if (getOptionsToRemove() == null) setOptionsToRemove(new java.util.ArrayList<OptionSpecification>(optionsToRemove.length));
        for (OptionSpecification value : optionsToRemove) {
            getOptionsToRemove().add(value);
        }
        return this;
    }
    
    /**
     * A list of custom user-defined configuration options to remove from the
     * configuration set for this new environment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionsToRemove A list of custom user-defined configuration options to remove from the
     *         configuration set for this new environment.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateEnvironmentRequest withOptionsToRemove(java.util.Collection<OptionSpecification> optionsToRemove) {
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
        if (getVersionLabel() != null) sb.append("VersionLabel: " + getVersionLabel() + ",");
        if (getEnvironmentName() != null) sb.append("EnvironmentName: " + getEnvironmentName() + ",");
        if (getTemplateName() != null) sb.append("TemplateName: " + getTemplateName() + ",");
        if (getSolutionStackName() != null) sb.append("SolutionStackName: " + getSolutionStackName() + ",");
        if (getCNAMEPrefix() != null) sb.append("CNAMEPrefix: " + getCNAMEPrefix() + ",");
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
        hashCode = prime * hashCode + ((getVersionLabel() == null) ? 0 : getVersionLabel().hashCode()); 
        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode()); 
        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode()); 
        hashCode = prime * hashCode + ((getSolutionStackName() == null) ? 0 : getSolutionStackName().hashCode()); 
        hashCode = prime * hashCode + ((getCNAMEPrefix() == null) ? 0 : getCNAMEPrefix().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getOptionSettings() == null) ? 0 : getOptionSettings().hashCode()); 
        hashCode = prime * hashCode + ((getOptionsToRemove() == null) ? 0 : getOptionsToRemove().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateEnvironmentRequest == false) return false;
        CreateEnvironmentRequest other = (CreateEnvironmentRequest)obj;
        
        if (other.getApplicationName() == null ^ this.getApplicationName() == null) return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false) return false; 
        if (other.getVersionLabel() == null ^ this.getVersionLabel() == null) return false;
        if (other.getVersionLabel() != null && other.getVersionLabel().equals(this.getVersionLabel()) == false) return false; 
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null) return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false) return false; 
        if (other.getTemplateName() == null ^ this.getTemplateName() == null) return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false) return false; 
        if (other.getSolutionStackName() == null ^ this.getSolutionStackName() == null) return false;
        if (other.getSolutionStackName() != null && other.getSolutionStackName().equals(this.getSolutionStackName()) == false) return false; 
        if (other.getCNAMEPrefix() == null ^ this.getCNAMEPrefix() == null) return false;
        if (other.getCNAMEPrefix() != null && other.getCNAMEPrefix().equals(this.getCNAMEPrefix()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getOptionSettings() == null ^ this.getOptionSettings() == null) return false;
        if (other.getOptionSettings() != null && other.getOptionSettings().equals(this.getOptionSettings()) == false) return false; 
        if (other.getOptionsToRemove() == null ^ this.getOptionsToRemove() == null) return false;
        if (other.getOptionsToRemove() != null && other.getOptionsToRemove().equals(this.getOptionsToRemove()) == false) return false; 
        return true;
    }
    
}
    