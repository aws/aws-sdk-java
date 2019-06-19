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
 * Request to update an environment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/UpdateEnvironment" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEnvironmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the application with which the environment is associated.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * The ID of the environment to update.
     * </p>
     * <p>
     * If no environment with this ID exists, AWS Elastic Beanstalk returns an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Condition: You must specify either this or an EnvironmentName, or both. If you do not specify either, AWS Elastic
     * Beanstalk returns <code>MissingRequiredParameter</code> error.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * The name of the environment to update. If no environment with this name exists, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Condition: You must specify either this or an EnvironmentId, or both. If you do not specify either, AWS Elastic
     * Beanstalk returns <code>MissingRequiredParameter</code> error.
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * The name of the group to which the target environment belongs. Specify a group name only if the environment's
     * name is specified in an environment manifest and not with the environment name or environment ID parameters. See
     * <a href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html">Environment
     * Manifest (env.yaml)</a> for details.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * If this parameter is specified, AWS Elastic Beanstalk updates the description of this environment.
     * </p>
     */
    private String description;
    /**
     * <p>
     * This specifies the tier to use to update the environment.
     * </p>
     * <p>
     * Condition: At this time, if you change the tier version, name, or type, AWS Elastic Beanstalk returns
     * <code>InvalidParameterValue</code> error.
     * </p>
     */
    private EnvironmentTier tier;
    /**
     * <p>
     * If this parameter is specified, AWS Elastic Beanstalk deploys the named application version to the environment.
     * If no such application version is found, returns an <code>InvalidParameterValue</code> error.
     * </p>
     */
    private String versionLabel;
    /**
     * <p>
     * If this parameter is specified, AWS Elastic Beanstalk deploys this configuration template to the environment. If
     * no such configuration template is found, AWS Elastic Beanstalk returns an <code>InvalidParameterValue</code>
     * error.
     * </p>
     */
    private String templateName;
    /**
     * <p>
     * This specifies the platform version that the environment will run after the environment is updated.
     * </p>
     */
    private String solutionStackName;
    /**
     * <p>
     * The ARN of the platform, if used.
     * </p>
     */
    private String platformArn;
    /**
     * <p>
     * If specified, AWS Elastic Beanstalk updates the configuration set associated with the running environment and
     * sets the specified configuration options to the requested value.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ConfigurationOptionSetting> optionSettings;
    /**
     * <p>
     * A list of custom user-defined configuration options to remove from the configuration set for this environment.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<OptionSpecification> optionsToRemove;

    /**
     * <p>
     * The name of the application with which the environment is associated.
     * </p>
     * 
     * @param applicationName
     *        The name of the application with which the environment is associated.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application with which the environment is associated.
     * </p>
     * 
     * @return The name of the application with which the environment is associated.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of the application with which the environment is associated.
     * </p>
     * 
     * @param applicationName
     *        The name of the application with which the environment is associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * The ID of the environment to update.
     * </p>
     * <p>
     * If no environment with this ID exists, AWS Elastic Beanstalk returns an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Condition: You must specify either this or an EnvironmentName, or both. If you do not specify either, AWS Elastic
     * Beanstalk returns <code>MissingRequiredParameter</code> error.
     * </p>
     * 
     * @param environmentId
     *        The ID of the environment to update.</p>
     *        <p>
     *        If no environment with this ID exists, AWS Elastic Beanstalk returns an <code>InvalidParameterValue</code>
     *        error.
     *        </p>
     *        <p>
     *        Condition: You must specify either this or an EnvironmentName, or both. If you do not specify either, AWS
     *        Elastic Beanstalk returns <code>MissingRequiredParameter</code> error.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The ID of the environment to update.
     * </p>
     * <p>
     * If no environment with this ID exists, AWS Elastic Beanstalk returns an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Condition: You must specify either this or an EnvironmentName, or both. If you do not specify either, AWS Elastic
     * Beanstalk returns <code>MissingRequiredParameter</code> error.
     * </p>
     * 
     * @return The ID of the environment to update.</p>
     *         <p>
     *         If no environment with this ID exists, AWS Elastic Beanstalk returns an
     *         <code>InvalidParameterValue</code> error.
     *         </p>
     *         <p>
     *         Condition: You must specify either this or an EnvironmentName, or both. If you do not specify either, AWS
     *         Elastic Beanstalk returns <code>MissingRequiredParameter</code> error.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * The ID of the environment to update.
     * </p>
     * <p>
     * If no environment with this ID exists, AWS Elastic Beanstalk returns an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Condition: You must specify either this or an EnvironmentName, or both. If you do not specify either, AWS Elastic
     * Beanstalk returns <code>MissingRequiredParameter</code> error.
     * </p>
     * 
     * @param environmentId
     *        The ID of the environment to update.</p>
     *        <p>
     *        If no environment with this ID exists, AWS Elastic Beanstalk returns an <code>InvalidParameterValue</code>
     *        error.
     *        </p>
     *        <p>
     *        Condition: You must specify either this or an EnvironmentName, or both. If you do not specify either, AWS
     *        Elastic Beanstalk returns <code>MissingRequiredParameter</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * The name of the environment to update. If no environment with this name exists, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Condition: You must specify either this or an EnvironmentId, or both. If you do not specify either, AWS Elastic
     * Beanstalk returns <code>MissingRequiredParameter</code> error.
     * </p>
     * 
     * @param environmentName
     *        The name of the environment to update. If no environment with this name exists, AWS Elastic Beanstalk
     *        returns an <code>InvalidParameterValue</code> error. </p>
     *        <p>
     *        Condition: You must specify either this or an EnvironmentId, or both. If you do not specify either, AWS
     *        Elastic Beanstalk returns <code>MissingRequiredParameter</code> error.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of the environment to update. If no environment with this name exists, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Condition: You must specify either this or an EnvironmentId, or both. If you do not specify either, AWS Elastic
     * Beanstalk returns <code>MissingRequiredParameter</code> error.
     * </p>
     * 
     * @return The name of the environment to update. If no environment with this name exists, AWS Elastic Beanstalk
     *         returns an <code>InvalidParameterValue</code> error. </p>
     *         <p>
     *         Condition: You must specify either this or an EnvironmentId, or both. If you do not specify either, AWS
     *         Elastic Beanstalk returns <code>MissingRequiredParameter</code> error.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * The name of the environment to update. If no environment with this name exists, AWS Elastic Beanstalk returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Condition: You must specify either this or an EnvironmentId, or both. If you do not specify either, AWS Elastic
     * Beanstalk returns <code>MissingRequiredParameter</code> error.
     * </p>
     * 
     * @param environmentName
     *        The name of the environment to update. If no environment with this name exists, AWS Elastic Beanstalk
     *        returns an <code>InvalidParameterValue</code> error. </p>
     *        <p>
     *        Condition: You must specify either this or an EnvironmentId, or both. If you do not specify either, AWS
     *        Elastic Beanstalk returns <code>MissingRequiredParameter</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * The name of the group to which the target environment belongs. Specify a group name only if the environment's
     * name is specified in an environment manifest and not with the environment name or environment ID parameters. See
     * <a href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html">Environment
     * Manifest (env.yaml)</a> for details.
     * </p>
     * 
     * @param groupName
     *        The name of the group to which the target environment belongs. Specify a group name only if the
     *        environment's name is specified in an environment manifest and not with the environment name or
     *        environment ID parameters. See <a
     *        href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html">Environment
     *        Manifest (env.yaml)</a> for details.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the group to which the target environment belongs. Specify a group name only if the environment's
     * name is specified in an environment manifest and not with the environment name or environment ID parameters. See
     * <a href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html">Environment
     * Manifest (env.yaml)</a> for details.
     * </p>
     * 
     * @return The name of the group to which the target environment belongs. Specify a group name only if the
     *         environment's name is specified in an environment manifest and not with the environment name or
     *         environment ID parameters. See <a
     *         href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html">Environment
     *         Manifest (env.yaml)</a> for details.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The name of the group to which the target environment belongs. Specify a group name only if the environment's
     * name is specified in an environment manifest and not with the environment name or environment ID parameters. See
     * <a href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html">Environment
     * Manifest (env.yaml)</a> for details.
     * </p>
     * 
     * @param groupName
     *        The name of the group to which the target environment belongs. Specify a group name only if the
     *        environment's name is specified in an environment manifest and not with the environment name or
     *        environment ID parameters. See <a
     *        href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html">Environment
     *        Manifest (env.yaml)</a> for details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * If this parameter is specified, AWS Elastic Beanstalk updates the description of this environment.
     * </p>
     * 
     * @param description
     *        If this parameter is specified, AWS Elastic Beanstalk updates the description of this environment.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * If this parameter is specified, AWS Elastic Beanstalk updates the description of this environment.
     * </p>
     * 
     * @return If this parameter is specified, AWS Elastic Beanstalk updates the description of this environment.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * If this parameter is specified, AWS Elastic Beanstalk updates the description of this environment.
     * </p>
     * 
     * @param description
     *        If this parameter is specified, AWS Elastic Beanstalk updates the description of this environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * This specifies the tier to use to update the environment.
     * </p>
     * <p>
     * Condition: At this time, if you change the tier version, name, or type, AWS Elastic Beanstalk returns
     * <code>InvalidParameterValue</code> error.
     * </p>
     * 
     * @param tier
     *        This specifies the tier to use to update the environment.</p>
     *        <p>
     *        Condition: At this time, if you change the tier version, name, or type, AWS Elastic Beanstalk returns
     *        <code>InvalidParameterValue</code> error.
     */

    public void setTier(EnvironmentTier tier) {
        this.tier = tier;
    }

    /**
     * <p>
     * This specifies the tier to use to update the environment.
     * </p>
     * <p>
     * Condition: At this time, if you change the tier version, name, or type, AWS Elastic Beanstalk returns
     * <code>InvalidParameterValue</code> error.
     * </p>
     * 
     * @return This specifies the tier to use to update the environment.</p>
     *         <p>
     *         Condition: At this time, if you change the tier version, name, or type, AWS Elastic Beanstalk returns
     *         <code>InvalidParameterValue</code> error.
     */

    public EnvironmentTier getTier() {
        return this.tier;
    }

    /**
     * <p>
     * This specifies the tier to use to update the environment.
     * </p>
     * <p>
     * Condition: At this time, if you change the tier version, name, or type, AWS Elastic Beanstalk returns
     * <code>InvalidParameterValue</code> error.
     * </p>
     * 
     * @param tier
     *        This specifies the tier to use to update the environment.</p>
     *        <p>
     *        Condition: At this time, if you change the tier version, name, or type, AWS Elastic Beanstalk returns
     *        <code>InvalidParameterValue</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withTier(EnvironmentTier tier) {
        setTier(tier);
        return this;
    }

    /**
     * <p>
     * If this parameter is specified, AWS Elastic Beanstalk deploys the named application version to the environment.
     * If no such application version is found, returns an <code>InvalidParameterValue</code> error.
     * </p>
     * 
     * @param versionLabel
     *        If this parameter is specified, AWS Elastic Beanstalk deploys the named application version to the
     *        environment. If no such application version is found, returns an <code>InvalidParameterValue</code> error.
     */

    public void setVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
    }

    /**
     * <p>
     * If this parameter is specified, AWS Elastic Beanstalk deploys the named application version to the environment.
     * If no such application version is found, returns an <code>InvalidParameterValue</code> error.
     * </p>
     * 
     * @return If this parameter is specified, AWS Elastic Beanstalk deploys the named application version to the
     *         environment. If no such application version is found, returns an <code>InvalidParameterValue</code>
     *         error.
     */

    public String getVersionLabel() {
        return this.versionLabel;
    }

    /**
     * <p>
     * If this parameter is specified, AWS Elastic Beanstalk deploys the named application version to the environment.
     * If no such application version is found, returns an <code>InvalidParameterValue</code> error.
     * </p>
     * 
     * @param versionLabel
     *        If this parameter is specified, AWS Elastic Beanstalk deploys the named application version to the
     *        environment. If no such application version is found, returns an <code>InvalidParameterValue</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withVersionLabel(String versionLabel) {
        setVersionLabel(versionLabel);
        return this;
    }

    /**
     * <p>
     * If this parameter is specified, AWS Elastic Beanstalk deploys this configuration template to the environment. If
     * no such configuration template is found, AWS Elastic Beanstalk returns an <code>InvalidParameterValue</code>
     * error.
     * </p>
     * 
     * @param templateName
     *        If this parameter is specified, AWS Elastic Beanstalk deploys this configuration template to the
     *        environment. If no such configuration template is found, AWS Elastic Beanstalk returns an
     *        <code>InvalidParameterValue</code> error.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * If this parameter is specified, AWS Elastic Beanstalk deploys this configuration template to the environment. If
     * no such configuration template is found, AWS Elastic Beanstalk returns an <code>InvalidParameterValue</code>
     * error.
     * </p>
     * 
     * @return If this parameter is specified, AWS Elastic Beanstalk deploys this configuration template to the
     *         environment. If no such configuration template is found, AWS Elastic Beanstalk returns an
     *         <code>InvalidParameterValue</code> error.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * If this parameter is specified, AWS Elastic Beanstalk deploys this configuration template to the environment. If
     * no such configuration template is found, AWS Elastic Beanstalk returns an <code>InvalidParameterValue</code>
     * error.
     * </p>
     * 
     * @param templateName
     *        If this parameter is specified, AWS Elastic Beanstalk deploys this configuration template to the
     *        environment. If no such configuration template is found, AWS Elastic Beanstalk returns an
     *        <code>InvalidParameterValue</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

    /**
     * <p>
     * This specifies the platform version that the environment will run after the environment is updated.
     * </p>
     * 
     * @param solutionStackName
     *        This specifies the platform version that the environment will run after the environment is updated.
     */

    public void setSolutionStackName(String solutionStackName) {
        this.solutionStackName = solutionStackName;
    }

    /**
     * <p>
     * This specifies the platform version that the environment will run after the environment is updated.
     * </p>
     * 
     * @return This specifies the platform version that the environment will run after the environment is updated.
     */

    public String getSolutionStackName() {
        return this.solutionStackName;
    }

    /**
     * <p>
     * This specifies the platform version that the environment will run after the environment is updated.
     * </p>
     * 
     * @param solutionStackName
     *        This specifies the platform version that the environment will run after the environment is updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withSolutionStackName(String solutionStackName) {
        setSolutionStackName(solutionStackName);
        return this;
    }

    /**
     * <p>
     * The ARN of the platform, if used.
     * </p>
     * 
     * @param platformArn
     *        The ARN of the platform, if used.
     */

    public void setPlatformArn(String platformArn) {
        this.platformArn = platformArn;
    }

    /**
     * <p>
     * The ARN of the platform, if used.
     * </p>
     * 
     * @return The ARN of the platform, if used.
     */

    public String getPlatformArn() {
        return this.platformArn;
    }

    /**
     * <p>
     * The ARN of the platform, if used.
     * </p>
     * 
     * @param platformArn
     *        The ARN of the platform, if used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withPlatformArn(String platformArn) {
        setPlatformArn(platformArn);
        return this;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk updates the configuration set associated with the running environment and
     * sets the specified configuration options to the requested value.
     * </p>
     * 
     * @return If specified, AWS Elastic Beanstalk updates the configuration set associated with the running environment
     *         and sets the specified configuration options to the requested value.
     */

    public java.util.List<ConfigurationOptionSetting> getOptionSettings() {
        if (optionSettings == null) {
            optionSettings = new com.amazonaws.internal.SdkInternalList<ConfigurationOptionSetting>();
        }
        return optionSettings;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk updates the configuration set associated with the running environment and
     * sets the specified configuration options to the requested value.
     * </p>
     * 
     * @param optionSettings
     *        If specified, AWS Elastic Beanstalk updates the configuration set associated with the running environment
     *        and sets the specified configuration options to the requested value.
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
     * If specified, AWS Elastic Beanstalk updates the configuration set associated with the running environment and
     * sets the specified configuration options to the requested value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptionSettings(java.util.Collection)} or {@link #withOptionSettings(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param optionSettings
     *        If specified, AWS Elastic Beanstalk updates the configuration set associated with the running environment
     *        and sets the specified configuration options to the requested value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withOptionSettings(ConfigurationOptionSetting... optionSettings) {
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
     * If specified, AWS Elastic Beanstalk updates the configuration set associated with the running environment and
     * sets the specified configuration options to the requested value.
     * </p>
     * 
     * @param optionSettings
     *        If specified, AWS Elastic Beanstalk updates the configuration set associated with the running environment
     *        and sets the specified configuration options to the requested value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withOptionSettings(java.util.Collection<ConfigurationOptionSetting> optionSettings) {
        setOptionSettings(optionSettings);
        return this;
    }

    /**
     * <p>
     * A list of custom user-defined configuration options to remove from the configuration set for this environment.
     * </p>
     * 
     * @return A list of custom user-defined configuration options to remove from the configuration set for this
     *         environment.
     */

    public java.util.List<OptionSpecification> getOptionsToRemove() {
        if (optionsToRemove == null) {
            optionsToRemove = new com.amazonaws.internal.SdkInternalList<OptionSpecification>();
        }
        return optionsToRemove;
    }

    /**
     * <p>
     * A list of custom user-defined configuration options to remove from the configuration set for this environment.
     * </p>
     * 
     * @param optionsToRemove
     *        A list of custom user-defined configuration options to remove from the configuration set for this
     *        environment.
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
     * A list of custom user-defined configuration options to remove from the configuration set for this environment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptionsToRemove(java.util.Collection)} or {@link #withOptionsToRemove(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param optionsToRemove
     *        A list of custom user-defined configuration options to remove from the configuration set for this
     *        environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withOptionsToRemove(OptionSpecification... optionsToRemove) {
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
     * A list of custom user-defined configuration options to remove from the configuration set for this environment.
     * </p>
     * 
     * @param optionsToRemove
     *        A list of custom user-defined configuration options to remove from the configuration set for this
     *        environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withOptionsToRemove(java.util.Collection<OptionSpecification> optionsToRemove) {
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
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName()).append(",");
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTier() != null)
            sb.append("Tier: ").append(getTier()).append(",");
        if (getVersionLabel() != null)
            sb.append("VersionLabel: ").append(getVersionLabel()).append(",");
        if (getTemplateName() != null)
            sb.append("TemplateName: ").append(getTemplateName()).append(",");
        if (getSolutionStackName() != null)
            sb.append("SolutionStackName: ").append(getSolutionStackName()).append(",");
        if (getPlatformArn() != null)
            sb.append("PlatformArn: ").append(getPlatformArn()).append(",");
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

        if (obj instanceof UpdateEnvironmentRequest == false)
            return false;
        UpdateEnvironmentRequest other = (UpdateEnvironmentRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTier() == null ^ this.getTier() == null)
            return false;
        if (other.getTier() != null && other.getTier().equals(this.getTier()) == false)
            return false;
        if (other.getVersionLabel() == null ^ this.getVersionLabel() == null)
            return false;
        if (other.getVersionLabel() != null && other.getVersionLabel().equals(this.getVersionLabel()) == false)
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
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTier() == null) ? 0 : getTier().hashCode());
        hashCode = prime * hashCode + ((getVersionLabel() == null) ? 0 : getVersionLabel().hashCode());
        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode + ((getSolutionStackName() == null) ? 0 : getSolutionStackName().hashCode());
        hashCode = prime * hashCode + ((getPlatformArn() == null) ? 0 : getPlatformArn().hashCode());
        hashCode = prime * hashCode + ((getOptionSettings() == null) ? 0 : getOptionSettings().hashCode());
        hashCode = prime * hashCode + ((getOptionsToRemove() == null) ? 0 : getOptionsToRemove().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEnvironmentRequest clone() {
        return (UpdateEnvironmentRequest) super.clone();
    }

}
