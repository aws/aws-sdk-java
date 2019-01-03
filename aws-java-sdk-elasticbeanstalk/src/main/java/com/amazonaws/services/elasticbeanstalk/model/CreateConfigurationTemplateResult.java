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

/**
 * <p>
 * Describes the settings for a configuration set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/CreateConfigurationTemplate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateConfigurationTemplateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the solution stack this configuration set uses.
     * </p>
     */
    private String solutionStackName;
    /**
     * <p>
     * The ARN of the platform.
     * </p>
     */
    private String platformArn;
    /**
     * <p>
     * The name of the application associated with this configuration set.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * If not <code>null</code>, the name of the configuration template for this configuration set.
     * </p>
     */
    private String templateName;
    /**
     * <p>
     * Describes this configuration set.
     * </p>
     */
    private String description;
    /**
     * <p>
     * If not <code>null</code>, the name of the environment for this configuration set.
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * If this configuration set is associated with an environment, the <code>DeploymentStatus</code> parameter
     * indicates the deployment status of this configuration set:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>null</code>: This configuration is not associated with a running environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: This is a draft configuration that is not deployed to the associated environment but is in
     * the process of deploying.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deployed</code>: This is the configuration that is currently deployed to the associated running
     * environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code>: This is a draft configuration that failed to successfully deploy.
     * </p>
     * </li>
     * </ul>
     */
    private String deploymentStatus;
    /**
     * <p>
     * The date (in UTC time) when this configuration set was created.
     * </p>
     */
    private java.util.Date dateCreated;
    /**
     * <p>
     * The date (in UTC time) when this configuration set was last modified.
     * </p>
     */
    private java.util.Date dateUpdated;
    /**
     * <p>
     * A list of the configuration options and their values in this configuration set.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ConfigurationOptionSetting> optionSettings;

    /**
     * <p>
     * The name of the solution stack this configuration set uses.
     * </p>
     * 
     * @param solutionStackName
     *        The name of the solution stack this configuration set uses.
     */

    public void setSolutionStackName(String solutionStackName) {
        this.solutionStackName = solutionStackName;
    }

    /**
     * <p>
     * The name of the solution stack this configuration set uses.
     * </p>
     * 
     * @return The name of the solution stack this configuration set uses.
     */

    public String getSolutionStackName() {
        return this.solutionStackName;
    }

    /**
     * <p>
     * The name of the solution stack this configuration set uses.
     * </p>
     * 
     * @param solutionStackName
     *        The name of the solution stack this configuration set uses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationTemplateResult withSolutionStackName(String solutionStackName) {
        setSolutionStackName(solutionStackName);
        return this;
    }

    /**
     * <p>
     * The ARN of the platform.
     * </p>
     * 
     * @param platformArn
     *        The ARN of the platform.
     */

    public void setPlatformArn(String platformArn) {
        this.platformArn = platformArn;
    }

    /**
     * <p>
     * The ARN of the platform.
     * </p>
     * 
     * @return The ARN of the platform.
     */

    public String getPlatformArn() {
        return this.platformArn;
    }

    /**
     * <p>
     * The ARN of the platform.
     * </p>
     * 
     * @param platformArn
     *        The ARN of the platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationTemplateResult withPlatformArn(String platformArn) {
        setPlatformArn(platformArn);
        return this;
    }

    /**
     * <p>
     * The name of the application associated with this configuration set.
     * </p>
     * 
     * @param applicationName
     *        The name of the application associated with this configuration set.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application associated with this configuration set.
     * </p>
     * 
     * @return The name of the application associated with this configuration set.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of the application associated with this configuration set.
     * </p>
     * 
     * @param applicationName
     *        The name of the application associated with this configuration set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationTemplateResult withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * If not <code>null</code>, the name of the configuration template for this configuration set.
     * </p>
     * 
     * @param templateName
     *        If not <code>null</code>, the name of the configuration template for this configuration set.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * If not <code>null</code>, the name of the configuration template for this configuration set.
     * </p>
     * 
     * @return If not <code>null</code>, the name of the configuration template for this configuration set.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * If not <code>null</code>, the name of the configuration template for this configuration set.
     * </p>
     * 
     * @param templateName
     *        If not <code>null</code>, the name of the configuration template for this configuration set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationTemplateResult withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

    /**
     * <p>
     * Describes this configuration set.
     * </p>
     * 
     * @param description
     *        Describes this configuration set.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Describes this configuration set.
     * </p>
     * 
     * @return Describes this configuration set.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Describes this configuration set.
     * </p>
     * 
     * @param description
     *        Describes this configuration set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationTemplateResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * If not <code>null</code>, the name of the environment for this configuration set.
     * </p>
     * 
     * @param environmentName
     *        If not <code>null</code>, the name of the environment for this configuration set.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * If not <code>null</code>, the name of the environment for this configuration set.
     * </p>
     * 
     * @return If not <code>null</code>, the name of the environment for this configuration set.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * If not <code>null</code>, the name of the environment for this configuration set.
     * </p>
     * 
     * @param environmentName
     *        If not <code>null</code>, the name of the environment for this configuration set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationTemplateResult withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * If this configuration set is associated with an environment, the <code>DeploymentStatus</code> parameter
     * indicates the deployment status of this configuration set:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>null</code>: This configuration is not associated with a running environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: This is a draft configuration that is not deployed to the associated environment but is in
     * the process of deploying.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deployed</code>: This is the configuration that is currently deployed to the associated running
     * environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code>: This is a draft configuration that failed to successfully deploy.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deploymentStatus
     *        If this configuration set is associated with an environment, the <code>DeploymentStatus</code> parameter
     *        indicates the deployment status of this configuration set: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>null</code>: This configuration is not associated with a running environment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code>: This is a draft configuration that is not deployed to the associated environment but
     *        is in the process of deploying.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deployed</code>: This is the configuration that is currently deployed to the associated running
     *        environment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>failed</code>: This is a draft configuration that failed to successfully deploy.
     *        </p>
     *        </li>
     * @see ConfigurationDeploymentStatus
     */

    public void setDeploymentStatus(String deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
    }

    /**
     * <p>
     * If this configuration set is associated with an environment, the <code>DeploymentStatus</code> parameter
     * indicates the deployment status of this configuration set:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>null</code>: This configuration is not associated with a running environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: This is a draft configuration that is not deployed to the associated environment but is in
     * the process of deploying.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deployed</code>: This is the configuration that is currently deployed to the associated running
     * environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code>: This is a draft configuration that failed to successfully deploy.
     * </p>
     * </li>
     * </ul>
     * 
     * @return If this configuration set is associated with an environment, the <code>DeploymentStatus</code> parameter
     *         indicates the deployment status of this configuration set: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>null</code>: This configuration is not associated with a running environment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>pending</code>: This is a draft configuration that is not deployed to the associated environment
     *         but is in the process of deploying.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deployed</code>: This is the configuration that is currently deployed to the associated running
     *         environment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>failed</code>: This is a draft configuration that failed to successfully deploy.
     *         </p>
     *         </li>
     * @see ConfigurationDeploymentStatus
     */

    public String getDeploymentStatus() {
        return this.deploymentStatus;
    }

    /**
     * <p>
     * If this configuration set is associated with an environment, the <code>DeploymentStatus</code> parameter
     * indicates the deployment status of this configuration set:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>null</code>: This configuration is not associated with a running environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: This is a draft configuration that is not deployed to the associated environment but is in
     * the process of deploying.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deployed</code>: This is the configuration that is currently deployed to the associated running
     * environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code>: This is a draft configuration that failed to successfully deploy.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deploymentStatus
     *        If this configuration set is associated with an environment, the <code>DeploymentStatus</code> parameter
     *        indicates the deployment status of this configuration set: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>null</code>: This configuration is not associated with a running environment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code>: This is a draft configuration that is not deployed to the associated environment but
     *        is in the process of deploying.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deployed</code>: This is the configuration that is currently deployed to the associated running
     *        environment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>failed</code>: This is a draft configuration that failed to successfully deploy.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationDeploymentStatus
     */

    public CreateConfigurationTemplateResult withDeploymentStatus(String deploymentStatus) {
        setDeploymentStatus(deploymentStatus);
        return this;
    }

    /**
     * <p>
     * If this configuration set is associated with an environment, the <code>DeploymentStatus</code> parameter
     * indicates the deployment status of this configuration set:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>null</code>: This configuration is not associated with a running environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: This is a draft configuration that is not deployed to the associated environment but is in
     * the process of deploying.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deployed</code>: This is the configuration that is currently deployed to the associated running
     * environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code>: This is a draft configuration that failed to successfully deploy.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deploymentStatus
     *        If this configuration set is associated with an environment, the <code>DeploymentStatus</code> parameter
     *        indicates the deployment status of this configuration set: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>null</code>: This configuration is not associated with a running environment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code>: This is a draft configuration that is not deployed to the associated environment but
     *        is in the process of deploying.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deployed</code>: This is the configuration that is currently deployed to the associated running
     *        environment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>failed</code>: This is a draft configuration that failed to successfully deploy.
     *        </p>
     *        </li>
     * @see ConfigurationDeploymentStatus
     */

    public void setDeploymentStatus(ConfigurationDeploymentStatus deploymentStatus) {
        withDeploymentStatus(deploymentStatus);
    }

    /**
     * <p>
     * If this configuration set is associated with an environment, the <code>DeploymentStatus</code> parameter
     * indicates the deployment status of this configuration set:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>null</code>: This configuration is not associated with a running environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: This is a draft configuration that is not deployed to the associated environment but is in
     * the process of deploying.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deployed</code>: This is the configuration that is currently deployed to the associated running
     * environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>failed</code>: This is a draft configuration that failed to successfully deploy.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deploymentStatus
     *        If this configuration set is associated with an environment, the <code>DeploymentStatus</code> parameter
     *        indicates the deployment status of this configuration set: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>null</code>: This configuration is not associated with a running environment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code>: This is a draft configuration that is not deployed to the associated environment but
     *        is in the process of deploying.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deployed</code>: This is the configuration that is currently deployed to the associated running
     *        environment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>failed</code>: This is a draft configuration that failed to successfully deploy.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationDeploymentStatus
     */

    public CreateConfigurationTemplateResult withDeploymentStatus(ConfigurationDeploymentStatus deploymentStatus) {
        this.deploymentStatus = deploymentStatus.toString();
        return this;
    }

    /**
     * <p>
     * The date (in UTC time) when this configuration set was created.
     * </p>
     * 
     * @param dateCreated
     *        The date (in UTC time) when this configuration set was created.
     */

    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * <p>
     * The date (in UTC time) when this configuration set was created.
     * </p>
     * 
     * @return The date (in UTC time) when this configuration set was created.
     */

    public java.util.Date getDateCreated() {
        return this.dateCreated;
    }

    /**
     * <p>
     * The date (in UTC time) when this configuration set was created.
     * </p>
     * 
     * @param dateCreated
     *        The date (in UTC time) when this configuration set was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationTemplateResult withDateCreated(java.util.Date dateCreated) {
        setDateCreated(dateCreated);
        return this;
    }

    /**
     * <p>
     * The date (in UTC time) when this configuration set was last modified.
     * </p>
     * 
     * @param dateUpdated
     *        The date (in UTC time) when this configuration set was last modified.
     */

    public void setDateUpdated(java.util.Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    /**
     * <p>
     * The date (in UTC time) when this configuration set was last modified.
     * </p>
     * 
     * @return The date (in UTC time) when this configuration set was last modified.
     */

    public java.util.Date getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * <p>
     * The date (in UTC time) when this configuration set was last modified.
     * </p>
     * 
     * @param dateUpdated
     *        The date (in UTC time) when this configuration set was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationTemplateResult withDateUpdated(java.util.Date dateUpdated) {
        setDateUpdated(dateUpdated);
        return this;
    }

    /**
     * <p>
     * A list of the configuration options and their values in this configuration set.
     * </p>
     * 
     * @return A list of the configuration options and their values in this configuration set.
     */

    public java.util.List<ConfigurationOptionSetting> getOptionSettings() {
        if (optionSettings == null) {
            optionSettings = new com.amazonaws.internal.SdkInternalList<ConfigurationOptionSetting>();
        }
        return optionSettings;
    }

    /**
     * <p>
     * A list of the configuration options and their values in this configuration set.
     * </p>
     * 
     * @param optionSettings
     *        A list of the configuration options and their values in this configuration set.
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
     * A list of the configuration options and their values in this configuration set.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptionSettings(java.util.Collection)} or {@link #withOptionSettings(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param optionSettings
     *        A list of the configuration options and their values in this configuration set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationTemplateResult withOptionSettings(ConfigurationOptionSetting... optionSettings) {
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
     * A list of the configuration options and their values in this configuration set.
     * </p>
     * 
     * @param optionSettings
     *        A list of the configuration options and their values in this configuration set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateConfigurationTemplateResult withOptionSettings(java.util.Collection<ConfigurationOptionSetting> optionSettings) {
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
        if (getSolutionStackName() != null)
            sb.append("SolutionStackName: ").append(getSolutionStackName()).append(",");
        if (getPlatformArn() != null)
            sb.append("PlatformArn: ").append(getPlatformArn()).append(",");
        if (getApplicationName() != null)
            sb.append("ApplicationName: ").append(getApplicationName()).append(",");
        if (getTemplateName() != null)
            sb.append("TemplateName: ").append(getTemplateName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName()).append(",");
        if (getDeploymentStatus() != null)
            sb.append("DeploymentStatus: ").append(getDeploymentStatus()).append(",");
        if (getDateCreated() != null)
            sb.append("DateCreated: ").append(getDateCreated()).append(",");
        if (getDateUpdated() != null)
            sb.append("DateUpdated: ").append(getDateUpdated()).append(",");
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

        if (obj instanceof CreateConfigurationTemplateResult == false)
            return false;
        CreateConfigurationTemplateResult other = (CreateConfigurationTemplateResult) obj;
        if (other.getSolutionStackName() == null ^ this.getSolutionStackName() == null)
            return false;
        if (other.getSolutionStackName() != null && other.getSolutionStackName().equals(this.getSolutionStackName()) == false)
            return false;
        if (other.getPlatformArn() == null ^ this.getPlatformArn() == null)
            return false;
        if (other.getPlatformArn() != null && other.getPlatformArn().equals(this.getPlatformArn()) == false)
            return false;
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
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getDeploymentStatus() == null ^ this.getDeploymentStatus() == null)
            return false;
        if (other.getDeploymentStatus() != null && other.getDeploymentStatus().equals(this.getDeploymentStatus()) == false)
            return false;
        if (other.getDateCreated() == null ^ this.getDateCreated() == null)
            return false;
        if (other.getDateCreated() != null && other.getDateCreated().equals(this.getDateCreated()) == false)
            return false;
        if (other.getDateUpdated() == null ^ this.getDateUpdated() == null)
            return false;
        if (other.getDateUpdated() != null && other.getDateUpdated().equals(this.getDateUpdated()) == false)
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

        hashCode = prime * hashCode + ((getSolutionStackName() == null) ? 0 : getSolutionStackName().hashCode());
        hashCode = prime * hashCode + ((getPlatformArn() == null) ? 0 : getPlatformArn().hashCode());
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
    public CreateConfigurationTemplateResult clone() {
        try {
            return (CreateConfigurationTemplateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
