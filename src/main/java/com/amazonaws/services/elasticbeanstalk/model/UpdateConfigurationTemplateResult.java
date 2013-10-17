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


/**
 * <p>
 * Describes the settings for a configuration set.
 * </p>
 */
public class UpdateConfigurationTemplateResult implements Serializable {

    /**
     * The name of the solution stack this configuration set uses.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     */
    private String solutionStackName;

    /**
     * The name of the application associated with this configuration set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * If not <code>null</code>, the name of the configuration template for
     * this configuration set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String templateName;

    /**
     * Describes this configuration set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     */
    private String description;

    /**
     * If not <code>null</code>, the name of the environment for this
     * configuration set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     */
    private String environmentName;

    /**
     * If this configuration set is associated with an environment, the
     * <code>DeploymentStatus</code> parameter indicates the deployment
     * status of this configuration set: <enumValues> <value name="null"> <p>
     * <code>null</code>: This configuration is not associated with a running
     * environment. </value> <value name="pending"> <p> <code>pending</code>:
     * This is a draft configuration that is not deployed to the associated
     * environment but is in the process of deploying. </value> <value
     * name="deployed"> <p> <code>deployed</code>: This is the configuration
     * that is currently deployed to the associated running environment.
     * </value> <value name="failed"> <p> <code>failed</code>: This is a
     * draft configuration, that failed to successfully deploy. </value>
     * </enumValues> <ul> <li> <code>null</code>: This configuration is not
     * associated with a running environment. </li> <li>
     * <code>pending</code>: This is a draft configuration that is not
     * deployed to the associated environment but is in the process of
     * deploying. </li> <li> <code>deployed</code>: This is the configuration
     * that is currently deployed to the associated running environment.
     * </li> <li> <code>failed</code>: This is a draft configuration that
     * failed to successfully deploy. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>deployed, pending, failed
     */
    private String deploymentStatus;

    /**
     * The date (in UTC time) when this configuration set was created.
     */
    private java.util.Date dateCreated;

    /**
     * The date (in UTC time) when this configuration set was last modified.
     */
    private java.util.Date dateUpdated;

    /**
     * A list of the configuration options and their values in this
     * configuration set.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ConfigurationOptionSetting> optionSettings;

    /**
     * The name of the solution stack this configuration set uses.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @return The name of the solution stack this configuration set uses.
     */
    public String getSolutionStackName() {
        return solutionStackName;
    }
    
    /**
     * The name of the solution stack this configuration set uses.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param solutionStackName The name of the solution stack this configuration set uses.
     */
    public void setSolutionStackName(String solutionStackName) {
        this.solutionStackName = solutionStackName;
    }
    
    /**
     * The name of the solution stack this configuration set uses.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 100<br/>
     *
     * @param solutionStackName The name of the solution stack this configuration set uses.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateConfigurationTemplateResult withSolutionStackName(String solutionStackName) {
        this.solutionStackName = solutionStackName;
        return this;
    }

    /**
     * The name of the application associated with this configuration set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of the application associated with this configuration set.
     */
    public String getApplicationName() {
        return applicationName;
    }
    
    /**
     * The name of the application associated with this configuration set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of the application associated with this configuration set.
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    
    /**
     * The name of the application associated with this configuration set.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of the application associated with this configuration set.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateConfigurationTemplateResult withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * If not <code>null</code>, the name of the configuration template for
     * this configuration set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return If not <code>null</code>, the name of the configuration template for
     *         this configuration set.
     */
    public String getTemplateName() {
        return templateName;
    }
    
    /**
     * If not <code>null</code>, the name of the configuration template for
     * this configuration set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param templateName If not <code>null</code>, the name of the configuration template for
     *         this configuration set.
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }
    
    /**
     * If not <code>null</code>, the name of the configuration template for
     * this configuration set.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param templateName If not <code>null</code>, the name of the configuration template for
     *         this configuration set.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateConfigurationTemplateResult withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * Describes this configuration set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @return Describes this configuration set.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Describes this configuration set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description Describes this configuration set.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Describes this configuration set.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 200<br/>
     *
     * @param description Describes this configuration set.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateConfigurationTemplateResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * If not <code>null</code>, the name of the environment for this
     * configuration set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @return If not <code>null</code>, the name of the environment for this
     *         configuration set.
     */
    public String getEnvironmentName() {
        return environmentName;
    }
    
    /**
     * If not <code>null</code>, the name of the environment for this
     * configuration set.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @param environmentName If not <code>null</code>, the name of the environment for this
     *         configuration set.
     */
    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }
    
    /**
     * If not <code>null</code>, the name of the environment for this
     * configuration set.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @param environmentName If not <code>null</code>, the name of the environment for this
     *         configuration set.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateConfigurationTemplateResult withEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }

    /**
     * If this configuration set is associated with an environment, the
     * <code>DeploymentStatus</code> parameter indicates the deployment
     * status of this configuration set: <enumValues> <value name="null"> <p>
     * <code>null</code>: This configuration is not associated with a running
     * environment. </value> <value name="pending"> <p> <code>pending</code>:
     * This is a draft configuration that is not deployed to the associated
     * environment but is in the process of deploying. </value> <value
     * name="deployed"> <p> <code>deployed</code>: This is the configuration
     * that is currently deployed to the associated running environment.
     * </value> <value name="failed"> <p> <code>failed</code>: This is a
     * draft configuration, that failed to successfully deploy. </value>
     * </enumValues> <ul> <li> <code>null</code>: This configuration is not
     * associated with a running environment. </li> <li>
     * <code>pending</code>: This is a draft configuration that is not
     * deployed to the associated environment but is in the process of
     * deploying. </li> <li> <code>deployed</code>: This is the configuration
     * that is currently deployed to the associated running environment.
     * </li> <li> <code>failed</code>: This is a draft configuration that
     * failed to successfully deploy. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>deployed, pending, failed
     *
     * @return If this configuration set is associated with an environment, the
     *         <code>DeploymentStatus</code> parameter indicates the deployment
     *         status of this configuration set: <enumValues> <value name="null"> <p>
     *         <code>null</code>: This configuration is not associated with a running
     *         environment. </value> <value name="pending"> <p> <code>pending</code>:
     *         This is a draft configuration that is not deployed to the associated
     *         environment but is in the process of deploying. </value> <value
     *         name="deployed"> <p> <code>deployed</code>: This is the configuration
     *         that is currently deployed to the associated running environment.
     *         </value> <value name="failed"> <p> <code>failed</code>: This is a
     *         draft configuration, that failed to successfully deploy. </value>
     *         </enumValues> <ul> <li> <code>null</code>: This configuration is not
     *         associated with a running environment. </li> <li>
     *         <code>pending</code>: This is a draft configuration that is not
     *         deployed to the associated environment but is in the process of
     *         deploying. </li> <li> <code>deployed</code>: This is the configuration
     *         that is currently deployed to the associated running environment.
     *         </li> <li> <code>failed</code>: This is a draft configuration that
     *         failed to successfully deploy. </li> </ul>
     *
     * @see ConfigurationDeploymentStatus
     */
    public String getDeploymentStatus() {
        return deploymentStatus;
    }
    
    /**
     * If this configuration set is associated with an environment, the
     * <code>DeploymentStatus</code> parameter indicates the deployment
     * status of this configuration set: <enumValues> <value name="null"> <p>
     * <code>null</code>: This configuration is not associated with a running
     * environment. </value> <value name="pending"> <p> <code>pending</code>:
     * This is a draft configuration that is not deployed to the associated
     * environment but is in the process of deploying. </value> <value
     * name="deployed"> <p> <code>deployed</code>: This is the configuration
     * that is currently deployed to the associated running environment.
     * </value> <value name="failed"> <p> <code>failed</code>: This is a
     * draft configuration, that failed to successfully deploy. </value>
     * </enumValues> <ul> <li> <code>null</code>: This configuration is not
     * associated with a running environment. </li> <li>
     * <code>pending</code>: This is a draft configuration that is not
     * deployed to the associated environment but is in the process of
     * deploying. </li> <li> <code>deployed</code>: This is the configuration
     * that is currently deployed to the associated running environment.
     * </li> <li> <code>failed</code>: This is a draft configuration that
     * failed to successfully deploy. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>deployed, pending, failed
     *
     * @param deploymentStatus If this configuration set is associated with an environment, the
     *         <code>DeploymentStatus</code> parameter indicates the deployment
     *         status of this configuration set: <enumValues> <value name="null"> <p>
     *         <code>null</code>: This configuration is not associated with a running
     *         environment. </value> <value name="pending"> <p> <code>pending</code>:
     *         This is a draft configuration that is not deployed to the associated
     *         environment but is in the process of deploying. </value> <value
     *         name="deployed"> <p> <code>deployed</code>: This is the configuration
     *         that is currently deployed to the associated running environment.
     *         </value> <value name="failed"> <p> <code>failed</code>: This is a
     *         draft configuration, that failed to successfully deploy. </value>
     *         </enumValues> <ul> <li> <code>null</code>: This configuration is not
     *         associated with a running environment. </li> <li>
     *         <code>pending</code>: This is a draft configuration that is not
     *         deployed to the associated environment but is in the process of
     *         deploying. </li> <li> <code>deployed</code>: This is the configuration
     *         that is currently deployed to the associated running environment.
     *         </li> <li> <code>failed</code>: This is a draft configuration that
     *         failed to successfully deploy. </li> </ul>
     *
     * @see ConfigurationDeploymentStatus
     */
    public void setDeploymentStatus(String deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
    }
    
    /**
     * If this configuration set is associated with an environment, the
     * <code>DeploymentStatus</code> parameter indicates the deployment
     * status of this configuration set: <enumValues> <value name="null"> <p>
     * <code>null</code>: This configuration is not associated with a running
     * environment. </value> <value name="pending"> <p> <code>pending</code>:
     * This is a draft configuration that is not deployed to the associated
     * environment but is in the process of deploying. </value> <value
     * name="deployed"> <p> <code>deployed</code>: This is the configuration
     * that is currently deployed to the associated running environment.
     * </value> <value name="failed"> <p> <code>failed</code>: This is a
     * draft configuration, that failed to successfully deploy. </value>
     * </enumValues> <ul> <li> <code>null</code>: This configuration is not
     * associated with a running environment. </li> <li>
     * <code>pending</code>: This is a draft configuration that is not
     * deployed to the associated environment but is in the process of
     * deploying. </li> <li> <code>deployed</code>: This is the configuration
     * that is currently deployed to the associated running environment.
     * </li> <li> <code>failed</code>: This is a draft configuration that
     * failed to successfully deploy. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>deployed, pending, failed
     *
     * @param deploymentStatus If this configuration set is associated with an environment, the
     *         <code>DeploymentStatus</code> parameter indicates the deployment
     *         status of this configuration set: <enumValues> <value name="null"> <p>
     *         <code>null</code>: This configuration is not associated with a running
     *         environment. </value> <value name="pending"> <p> <code>pending</code>:
     *         This is a draft configuration that is not deployed to the associated
     *         environment but is in the process of deploying. </value> <value
     *         name="deployed"> <p> <code>deployed</code>: This is the configuration
     *         that is currently deployed to the associated running environment.
     *         </value> <value name="failed"> <p> <code>failed</code>: This is a
     *         draft configuration, that failed to successfully deploy. </value>
     *         </enumValues> <ul> <li> <code>null</code>: This configuration is not
     *         associated with a running environment. </li> <li>
     *         <code>pending</code>: This is a draft configuration that is not
     *         deployed to the associated environment but is in the process of
     *         deploying. </li> <li> <code>deployed</code>: This is the configuration
     *         that is currently deployed to the associated running environment.
     *         </li> <li> <code>failed</code>: This is a draft configuration that
     *         failed to successfully deploy. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ConfigurationDeploymentStatus
     */
    public UpdateConfigurationTemplateResult withDeploymentStatus(String deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
        return this;
    }

    /**
     * If this configuration set is associated with an environment, the
     * <code>DeploymentStatus</code> parameter indicates the deployment
     * status of this configuration set: <enumValues> <value name="null"> <p>
     * <code>null</code>: This configuration is not associated with a running
     * environment. </value> <value name="pending"> <p> <code>pending</code>:
     * This is a draft configuration that is not deployed to the associated
     * environment but is in the process of deploying. </value> <value
     * name="deployed"> <p> <code>deployed</code>: This is the configuration
     * that is currently deployed to the associated running environment.
     * </value> <value name="failed"> <p> <code>failed</code>: This is a
     * draft configuration, that failed to successfully deploy. </value>
     * </enumValues> <ul> <li> <code>null</code>: This configuration is not
     * associated with a running environment. </li> <li>
     * <code>pending</code>: This is a draft configuration that is not
     * deployed to the associated environment but is in the process of
     * deploying. </li> <li> <code>deployed</code>: This is the configuration
     * that is currently deployed to the associated running environment.
     * </li> <li> <code>failed</code>: This is a draft configuration that
     * failed to successfully deploy. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>deployed, pending, failed
     *
     * @param deploymentStatus If this configuration set is associated with an environment, the
     *         <code>DeploymentStatus</code> parameter indicates the deployment
     *         status of this configuration set: <enumValues> <value name="null"> <p>
     *         <code>null</code>: This configuration is not associated with a running
     *         environment. </value> <value name="pending"> <p> <code>pending</code>:
     *         This is a draft configuration that is not deployed to the associated
     *         environment but is in the process of deploying. </value> <value
     *         name="deployed"> <p> <code>deployed</code>: This is the configuration
     *         that is currently deployed to the associated running environment.
     *         </value> <value name="failed"> <p> <code>failed</code>: This is a
     *         draft configuration, that failed to successfully deploy. </value>
     *         </enumValues> <ul> <li> <code>null</code>: This configuration is not
     *         associated with a running environment. </li> <li>
     *         <code>pending</code>: This is a draft configuration that is not
     *         deployed to the associated environment but is in the process of
     *         deploying. </li> <li> <code>deployed</code>: This is the configuration
     *         that is currently deployed to the associated running environment.
     *         </li> <li> <code>failed</code>: This is a draft configuration that
     *         failed to successfully deploy. </li> </ul>
     *
     * @see ConfigurationDeploymentStatus
     */
    public void setDeploymentStatus(ConfigurationDeploymentStatus deploymentStatus) {
        this.deploymentStatus = deploymentStatus.toString();
    }
    
    /**
     * If this configuration set is associated with an environment, the
     * <code>DeploymentStatus</code> parameter indicates the deployment
     * status of this configuration set: <enumValues> <value name="null"> <p>
     * <code>null</code>: This configuration is not associated with a running
     * environment. </value> <value name="pending"> <p> <code>pending</code>:
     * This is a draft configuration that is not deployed to the associated
     * environment but is in the process of deploying. </value> <value
     * name="deployed"> <p> <code>deployed</code>: This is the configuration
     * that is currently deployed to the associated running environment.
     * </value> <value name="failed"> <p> <code>failed</code>: This is a
     * draft configuration, that failed to successfully deploy. </value>
     * </enumValues> <ul> <li> <code>null</code>: This configuration is not
     * associated with a running environment. </li> <li>
     * <code>pending</code>: This is a draft configuration that is not
     * deployed to the associated environment but is in the process of
     * deploying. </li> <li> <code>deployed</code>: This is the configuration
     * that is currently deployed to the associated running environment.
     * </li> <li> <code>failed</code>: This is a draft configuration that
     * failed to successfully deploy. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>deployed, pending, failed
     *
     * @param deploymentStatus If this configuration set is associated with an environment, the
     *         <code>DeploymentStatus</code> parameter indicates the deployment
     *         status of this configuration set: <enumValues> <value name="null"> <p>
     *         <code>null</code>: This configuration is not associated with a running
     *         environment. </value> <value name="pending"> <p> <code>pending</code>:
     *         This is a draft configuration that is not deployed to the associated
     *         environment but is in the process of deploying. </value> <value
     *         name="deployed"> <p> <code>deployed</code>: This is the configuration
     *         that is currently deployed to the associated running environment.
     *         </value> <value name="failed"> <p> <code>failed</code>: This is a
     *         draft configuration, that failed to successfully deploy. </value>
     *         </enumValues> <ul> <li> <code>null</code>: This configuration is not
     *         associated with a running environment. </li> <li>
     *         <code>pending</code>: This is a draft configuration that is not
     *         deployed to the associated environment but is in the process of
     *         deploying. </li> <li> <code>deployed</code>: This is the configuration
     *         that is currently deployed to the associated running environment.
     *         </li> <li> <code>failed</code>: This is a draft configuration that
     *         failed to successfully deploy. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ConfigurationDeploymentStatus
     */
    public UpdateConfigurationTemplateResult withDeploymentStatus(ConfigurationDeploymentStatus deploymentStatus) {
        this.deploymentStatus = deploymentStatus.toString();
        return this;
    }

    /**
     * The date (in UTC time) when this configuration set was created.
     *
     * @return The date (in UTC time) when this configuration set was created.
     */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }
    
    /**
     * The date (in UTC time) when this configuration set was created.
     *
     * @param dateCreated The date (in UTC time) when this configuration set was created.
     */
    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    
    /**
     * The date (in UTC time) when this configuration set was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dateCreated The date (in UTC time) when this configuration set was created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateConfigurationTemplateResult withDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }

    /**
     * The date (in UTC time) when this configuration set was last modified.
     *
     * @return The date (in UTC time) when this configuration set was last modified.
     */
    public java.util.Date getDateUpdated() {
        return dateUpdated;
    }
    
    /**
     * The date (in UTC time) when this configuration set was last modified.
     *
     * @param dateUpdated The date (in UTC time) when this configuration set was last modified.
     */
    public void setDateUpdated(java.util.Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
    
    /**
     * The date (in UTC time) when this configuration set was last modified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dateUpdated The date (in UTC time) when this configuration set was last modified.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateConfigurationTemplateResult withDateUpdated(java.util.Date dateUpdated) {
        this.dateUpdated = dateUpdated;
        return this;
    }

    /**
     * A list of the configuration options and their values in this
     * configuration set.
     *
     * @return A list of the configuration options and their values in this
     *         configuration set.
     */
    public java.util.List<ConfigurationOptionSetting> getOptionSettings() {
        if (optionSettings == null) {
              optionSettings = new com.amazonaws.internal.ListWithAutoConstructFlag<ConfigurationOptionSetting>();
              optionSettings.setAutoConstruct(true);
        }
        return optionSettings;
    }
    
    /**
     * A list of the configuration options and their values in this
     * configuration set.
     *
     * @param optionSettings A list of the configuration options and their values in this
     *         configuration set.
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
     * A list of the configuration options and their values in this
     * configuration set.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionSettings A list of the configuration options and their values in this
     *         configuration set.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateConfigurationTemplateResult withOptionSettings(ConfigurationOptionSetting... optionSettings) {
        if (getOptionSettings() == null) setOptionSettings(new java.util.ArrayList<ConfigurationOptionSetting>(optionSettings.length));
        for (ConfigurationOptionSetting value : optionSettings) {
            getOptionSettings().add(value);
        }
        return this;
    }
    
    /**
     * A list of the configuration options and their values in this
     * configuration set.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param optionSettings A list of the configuration options and their values in this
     *         configuration set.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateConfigurationTemplateResult withOptionSettings(java.util.Collection<ConfigurationOptionSetting> optionSettings) {
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
        if (getSolutionStackName() != null) sb.append("SolutionStackName: " + getSolutionStackName() + ",");
        if (getApplicationName() != null) sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getTemplateName() != null) sb.append("TemplateName: " + getTemplateName() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getEnvironmentName() != null) sb.append("EnvironmentName: " + getEnvironmentName() + ",");
        if (getDeploymentStatus() != null) sb.append("DeploymentStatus: " + getDeploymentStatus() + ",");
        if (getDateCreated() != null) sb.append("DateCreated: " + getDateCreated() + ",");
        if (getDateUpdated() != null) sb.append("DateUpdated: " + getDateUpdated() + ",");
        if (getOptionSettings() != null) sb.append("OptionSettings: " + getOptionSettings() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSolutionStackName() == null) ? 0 : getSolutionStackName().hashCode()); 
        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode()); 
        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode()); 
        hashCode = prime * hashCode + ((getDeploymentStatus() == null) ? 0 : getDeploymentStatus().hashCode()); 
        hashCode = prime * hashCode + ((getDateCreated() == null) ? 0 : getDateCreated().hashCode()); 
        hashCode = prime * hashCode + ((getDateUpdated() == null) ? 0 : getDateUpdated().hashCode()); 
        hashCode = prime * hashCode + ((getOptionSettings() == null) ? 0 : getOptionSettings().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateConfigurationTemplateResult == false) return false;
        UpdateConfigurationTemplateResult other = (UpdateConfigurationTemplateResult)obj;
        
        if (other.getSolutionStackName() == null ^ this.getSolutionStackName() == null) return false;
        if (other.getSolutionStackName() != null && other.getSolutionStackName().equals(this.getSolutionStackName()) == false) return false; 
        if (other.getApplicationName() == null ^ this.getApplicationName() == null) return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false) return false; 
        if (other.getTemplateName() == null ^ this.getTemplateName() == null) return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null) return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false) return false; 
        if (other.getDeploymentStatus() == null ^ this.getDeploymentStatus() == null) return false;
        if (other.getDeploymentStatus() != null && other.getDeploymentStatus().equals(this.getDeploymentStatus()) == false) return false; 
        if (other.getDateCreated() == null ^ this.getDateCreated() == null) return false;
        if (other.getDateCreated() != null && other.getDateCreated().equals(this.getDateCreated()) == false) return false; 
        if (other.getDateUpdated() == null ^ this.getDateUpdated() == null) return false;
        if (other.getDateUpdated() != null && other.getDateUpdated().equals(this.getDateUpdated()) == false) return false; 
        if (other.getOptionSettings() == null ^ this.getOptionSettings() == null) return false;
        if (other.getOptionSettings() != null && other.getOptionSettings().equals(this.getOptionSettings()) == false) return false; 
        return true;
    }
    
}
    