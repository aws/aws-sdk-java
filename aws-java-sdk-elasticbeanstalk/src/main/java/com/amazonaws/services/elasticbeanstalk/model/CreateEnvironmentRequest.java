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
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/CreateEnvironment" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEnvironmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the application that contains the version to be deployed.
     * </p>
     * <p>
     * If no application is found with this name, <code>CreateEnvironment</code> returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * A unique name for the deployment environment. Used in the application URL.
     * </p>
     * <p>
     * Constraint: Must be from 4 to 40 characters in length. The name can contain only letters, numbers, and hyphens.
     * It cannot start or end with a hyphen. This name must be unique within a region in your account. If the specified
     * name already exists in the region, AWS Elastic Beanstalk returns an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Default: If the CNAME parameter is not specified, the environment name becomes part of the CNAME, and therefore
     * part of the visible URL for your application.
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * The name of the group to which the target environment belongs. Specify a group name only if the environment's
     * name is specified in an environment manifest and not with the environment name parameter. See <a
     * href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html">Environment Manifest
     * (env.yaml)</a> for details.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * Describes this environment.
     * </p>
     */
    private String description;
    /**
     * <p>
     * If specified, the environment attempts to use this value as the prefix for the CNAME. If not specified, the CNAME
     * is generated automatically by appending a random alphanumeric string to the environment name.
     * </p>
     */
    private String cNAMEPrefix;
    /**
     * <p>
     * This specifies the tier to use for creating this environment.
     * </p>
     */
    private EnvironmentTier tier;
    /**
     * <p>
     * Specifies the tags applied to resources in the environment.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The name of the application version to deploy.
     * </p>
     * <p>
     * If the specified application has no associated application versions, AWS Elastic Beanstalk
     * <code>UpdateEnvironment</code> returns an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Default: If not specified, AWS Elastic Beanstalk attempts to launch the sample application in the container.
     * </p>
     */
    private String versionLabel;
    /**
     * <p>
     * The name of the configuration template to use in deployment. If no configuration template is found with this
     * name, AWS Elastic Beanstalk returns an <code>InvalidParameterValue</code> error.
     * </p>
     */
    private String templateName;
    /**
     * <p>
     * This is an alternative to specifying a template name. If specified, AWS Elastic Beanstalk sets the configuration
     * values to the default values associated with the specified solution stack.
     * </p>
     * <p>
     * For a list of current solution stacks, see <a
     * href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/concepts.platforms.html">Elastic Beanstalk Supported
     * Platforms</a>.
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
     * If specified, AWS Elastic Beanstalk sets the specified configuration options to the requested value in the
     * configuration set for the new environment. These override the values obtained from the solution stack or the
     * configuration template.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ConfigurationOptionSetting> optionSettings;
    /**
     * <p>
     * A list of custom user-defined configuration options to remove from the configuration set for this new
     * environment.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<OptionSpecification> optionsToRemove;

    /**
     * Default constructor for CreateEnvironmentRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public CreateEnvironmentRequest() {
    }

    /**
     * Constructs a new CreateEnvironmentRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param applicationName
     *        The name of the application that contains the version to be deployed.</p>
     *        <p>
     *        If no application is found with this name, <code>CreateEnvironment</code> returns an
     *        <code>InvalidParameterValue</code> error.
     * @param environmentName
     *        A unique name for the deployment environment. Used in the application URL.
     *        </p>
     *        <p>
     *        Constraint: Must be from 4 to 40 characters in length. The name can contain only letters, numbers, and
     *        hyphens. It cannot start or end with a hyphen. This name must be unique within a region in your account.
     *        If the specified name already exists in the region, AWS Elastic Beanstalk returns an
     *        <code>InvalidParameterValue</code> error.
     *        </p>
     *        <p>
     *        Default: If the CNAME parameter is not specified, the environment name becomes part of the CNAME, and
     *        therefore part of the visible URL for your application.
     */
    public CreateEnvironmentRequest(String applicationName, String environmentName) {
        setApplicationName(applicationName);
        setEnvironmentName(environmentName);
    }

    /**
     * <p>
     * The name of the application that contains the version to be deployed.
     * </p>
     * <p>
     * If no application is found with this name, <code>CreateEnvironment</code> returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * 
     * @param applicationName
     *        The name of the application that contains the version to be deployed.</p>
     *        <p>
     *        If no application is found with this name, <code>CreateEnvironment</code> returns an
     *        <code>InvalidParameterValue</code> error.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application that contains the version to be deployed.
     * </p>
     * <p>
     * If no application is found with this name, <code>CreateEnvironment</code> returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * 
     * @return The name of the application that contains the version to be deployed.</p>
     *         <p>
     *         If no application is found with this name, <code>CreateEnvironment</code> returns an
     *         <code>InvalidParameterValue</code> error.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of the application that contains the version to be deployed.
     * </p>
     * <p>
     * If no application is found with this name, <code>CreateEnvironment</code> returns an
     * <code>InvalidParameterValue</code> error.
     * </p>
     * 
     * @param applicationName
     *        The name of the application that contains the version to be deployed.</p>
     *        <p>
     *        If no application is found with this name, <code>CreateEnvironment</code> returns an
     *        <code>InvalidParameterValue</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * A unique name for the deployment environment. Used in the application URL.
     * </p>
     * <p>
     * Constraint: Must be from 4 to 40 characters in length. The name can contain only letters, numbers, and hyphens.
     * It cannot start or end with a hyphen. This name must be unique within a region in your account. If the specified
     * name already exists in the region, AWS Elastic Beanstalk returns an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Default: If the CNAME parameter is not specified, the environment name becomes part of the CNAME, and therefore
     * part of the visible URL for your application.
     * </p>
     * 
     * @param environmentName
     *        A unique name for the deployment environment. Used in the application URL.</p>
     *        <p>
     *        Constraint: Must be from 4 to 40 characters in length. The name can contain only letters, numbers, and
     *        hyphens. It cannot start or end with a hyphen. This name must be unique within a region in your account.
     *        If the specified name already exists in the region, AWS Elastic Beanstalk returns an
     *        <code>InvalidParameterValue</code> error.
     *        </p>
     *        <p>
     *        Default: If the CNAME parameter is not specified, the environment name becomes part of the CNAME, and
     *        therefore part of the visible URL for your application.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * A unique name for the deployment environment. Used in the application URL.
     * </p>
     * <p>
     * Constraint: Must be from 4 to 40 characters in length. The name can contain only letters, numbers, and hyphens.
     * It cannot start or end with a hyphen. This name must be unique within a region in your account. If the specified
     * name already exists in the region, AWS Elastic Beanstalk returns an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Default: If the CNAME parameter is not specified, the environment name becomes part of the CNAME, and therefore
     * part of the visible URL for your application.
     * </p>
     * 
     * @return A unique name for the deployment environment. Used in the application URL.</p>
     *         <p>
     *         Constraint: Must be from 4 to 40 characters in length. The name can contain only letters, numbers, and
     *         hyphens. It cannot start or end with a hyphen. This name must be unique within a region in your account.
     *         If the specified name already exists in the region, AWS Elastic Beanstalk returns an
     *         <code>InvalidParameterValue</code> error.
     *         </p>
     *         <p>
     *         Default: If the CNAME parameter is not specified, the environment name becomes part of the CNAME, and
     *         therefore part of the visible URL for your application.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * A unique name for the deployment environment. Used in the application URL.
     * </p>
     * <p>
     * Constraint: Must be from 4 to 40 characters in length. The name can contain only letters, numbers, and hyphens.
     * It cannot start or end with a hyphen. This name must be unique within a region in your account. If the specified
     * name already exists in the region, AWS Elastic Beanstalk returns an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Default: If the CNAME parameter is not specified, the environment name becomes part of the CNAME, and therefore
     * part of the visible URL for your application.
     * </p>
     * 
     * @param environmentName
     *        A unique name for the deployment environment. Used in the application URL.</p>
     *        <p>
     *        Constraint: Must be from 4 to 40 characters in length. The name can contain only letters, numbers, and
     *        hyphens. It cannot start or end with a hyphen. This name must be unique within a region in your account.
     *        If the specified name already exists in the region, AWS Elastic Beanstalk returns an
     *        <code>InvalidParameterValue</code> error.
     *        </p>
     *        <p>
     *        Default: If the CNAME parameter is not specified, the environment name becomes part of the CNAME, and
     *        therefore part of the visible URL for your application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * The name of the group to which the target environment belongs. Specify a group name only if the environment's
     * name is specified in an environment manifest and not with the environment name parameter. See <a
     * href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html">Environment Manifest
     * (env.yaml)</a> for details.
     * </p>
     * 
     * @param groupName
     *        The name of the group to which the target environment belongs. Specify a group name only if the
     *        environment's name is specified in an environment manifest and not with the environment name parameter.
     *        See <a
     *        href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html">Environment
     *        Manifest (env.yaml)</a> for details.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the group to which the target environment belongs. Specify a group name only if the environment's
     * name is specified in an environment manifest and not with the environment name parameter. See <a
     * href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html">Environment Manifest
     * (env.yaml)</a> for details.
     * </p>
     * 
     * @return The name of the group to which the target environment belongs. Specify a group name only if the
     *         environment's name is specified in an environment manifest and not with the environment name parameter.
     *         See <a
     *         href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html">Environment
     *         Manifest (env.yaml)</a> for details.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The name of the group to which the target environment belongs. Specify a group name only if the environment's
     * name is specified in an environment manifest and not with the environment name parameter. See <a
     * href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html">Environment Manifest
     * (env.yaml)</a> for details.
     * </p>
     * 
     * @param groupName
     *        The name of the group to which the target environment belongs. Specify a group name only if the
     *        environment's name is specified in an environment manifest and not with the environment name parameter.
     *        See <a
     *        href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html">Environment
     *        Manifest (env.yaml)</a> for details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * Describes this environment.
     * </p>
     * 
     * @param description
     *        Describes this environment.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Describes this environment.
     * </p>
     * 
     * @return Describes this environment.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Describes this environment.
     * </p>
     * 
     * @param description
     *        Describes this environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * If specified, the environment attempts to use this value as the prefix for the CNAME. If not specified, the CNAME
     * is generated automatically by appending a random alphanumeric string to the environment name.
     * </p>
     * 
     * @param cNAMEPrefix
     *        If specified, the environment attempts to use this value as the prefix for the CNAME. If not specified,
     *        the CNAME is generated automatically by appending a random alphanumeric string to the environment name.
     */

    public void setCNAMEPrefix(String cNAMEPrefix) {
        this.cNAMEPrefix = cNAMEPrefix;
    }

    /**
     * <p>
     * If specified, the environment attempts to use this value as the prefix for the CNAME. If not specified, the CNAME
     * is generated automatically by appending a random alphanumeric string to the environment name.
     * </p>
     * 
     * @return If specified, the environment attempts to use this value as the prefix for the CNAME. If not specified,
     *         the CNAME is generated automatically by appending a random alphanumeric string to the environment name.
     */

    public String getCNAMEPrefix() {
        return this.cNAMEPrefix;
    }

    /**
     * <p>
     * If specified, the environment attempts to use this value as the prefix for the CNAME. If not specified, the CNAME
     * is generated automatically by appending a random alphanumeric string to the environment name.
     * </p>
     * 
     * @param cNAMEPrefix
     *        If specified, the environment attempts to use this value as the prefix for the CNAME. If not specified,
     *        the CNAME is generated automatically by appending a random alphanumeric string to the environment name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withCNAMEPrefix(String cNAMEPrefix) {
        setCNAMEPrefix(cNAMEPrefix);
        return this;
    }

    /**
     * <p>
     * This specifies the tier to use for creating this environment.
     * </p>
     * 
     * @param tier
     *        This specifies the tier to use for creating this environment.
     */

    public void setTier(EnvironmentTier tier) {
        this.tier = tier;
    }

    /**
     * <p>
     * This specifies the tier to use for creating this environment.
     * </p>
     * 
     * @return This specifies the tier to use for creating this environment.
     */

    public EnvironmentTier getTier() {
        return this.tier;
    }

    /**
     * <p>
     * This specifies the tier to use for creating this environment.
     * </p>
     * 
     * @param tier
     *        This specifies the tier to use for creating this environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withTier(EnvironmentTier tier) {
        setTier(tier);
        return this;
    }

    /**
     * <p>
     * Specifies the tags applied to resources in the environment.
     * </p>
     * 
     * @return Specifies the tags applied to resources in the environment.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Specifies the tags applied to resources in the environment.
     * </p>
     * 
     * @param tags
     *        Specifies the tags applied to resources in the environment.
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
     * Specifies the tags applied to resources in the environment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Specifies the tags applied to resources in the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withTags(Tag... tags) {
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
     * Specifies the tags applied to resources in the environment.
     * </p>
     * 
     * @param tags
     *        Specifies the tags applied to resources in the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The name of the application version to deploy.
     * </p>
     * <p>
     * If the specified application has no associated application versions, AWS Elastic Beanstalk
     * <code>UpdateEnvironment</code> returns an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Default: If not specified, AWS Elastic Beanstalk attempts to launch the sample application in the container.
     * </p>
     * 
     * @param versionLabel
     *        The name of the application version to deploy.</p>
     *        <p>
     *        If the specified application has no associated application versions, AWS Elastic Beanstalk
     *        <code>UpdateEnvironment</code> returns an <code>InvalidParameterValue</code> error.
     *        </p>
     *        <p>
     *        Default: If not specified, AWS Elastic Beanstalk attempts to launch the sample application in the
     *        container.
     */

    public void setVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
    }

    /**
     * <p>
     * The name of the application version to deploy.
     * </p>
     * <p>
     * If the specified application has no associated application versions, AWS Elastic Beanstalk
     * <code>UpdateEnvironment</code> returns an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Default: If not specified, AWS Elastic Beanstalk attempts to launch the sample application in the container.
     * </p>
     * 
     * @return The name of the application version to deploy.</p>
     *         <p>
     *         If the specified application has no associated application versions, AWS Elastic Beanstalk
     *         <code>UpdateEnvironment</code> returns an <code>InvalidParameterValue</code> error.
     *         </p>
     *         <p>
     *         Default: If not specified, AWS Elastic Beanstalk attempts to launch the sample application in the
     *         container.
     */

    public String getVersionLabel() {
        return this.versionLabel;
    }

    /**
     * <p>
     * The name of the application version to deploy.
     * </p>
     * <p>
     * If the specified application has no associated application versions, AWS Elastic Beanstalk
     * <code>UpdateEnvironment</code> returns an <code>InvalidParameterValue</code> error.
     * </p>
     * <p>
     * Default: If not specified, AWS Elastic Beanstalk attempts to launch the sample application in the container.
     * </p>
     * 
     * @param versionLabel
     *        The name of the application version to deploy.</p>
     *        <p>
     *        If the specified application has no associated application versions, AWS Elastic Beanstalk
     *        <code>UpdateEnvironment</code> returns an <code>InvalidParameterValue</code> error.
     *        </p>
     *        <p>
     *        Default: If not specified, AWS Elastic Beanstalk attempts to launch the sample application in the
     *        container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withVersionLabel(String versionLabel) {
        setVersionLabel(versionLabel);
        return this;
    }

    /**
     * <p>
     * The name of the configuration template to use in deployment. If no configuration template is found with this
     * name, AWS Elastic Beanstalk returns an <code>InvalidParameterValue</code> error.
     * </p>
     * 
     * @param templateName
     *        The name of the configuration template to use in deployment. If no configuration template is found with
     *        this name, AWS Elastic Beanstalk returns an <code>InvalidParameterValue</code> error.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the configuration template to use in deployment. If no configuration template is found with this
     * name, AWS Elastic Beanstalk returns an <code>InvalidParameterValue</code> error.
     * </p>
     * 
     * @return The name of the configuration template to use in deployment. If no configuration template is found with
     *         this name, AWS Elastic Beanstalk returns an <code>InvalidParameterValue</code> error.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the configuration template to use in deployment. If no configuration template is found with this
     * name, AWS Elastic Beanstalk returns an <code>InvalidParameterValue</code> error.
     * </p>
     * 
     * @param templateName
     *        The name of the configuration template to use in deployment. If no configuration template is found with
     *        this name, AWS Elastic Beanstalk returns an <code>InvalidParameterValue</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

    /**
     * <p>
     * This is an alternative to specifying a template name. If specified, AWS Elastic Beanstalk sets the configuration
     * values to the default values associated with the specified solution stack.
     * </p>
     * <p>
     * For a list of current solution stacks, see <a
     * href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/concepts.platforms.html">Elastic Beanstalk Supported
     * Platforms</a>.
     * </p>
     * 
     * @param solutionStackName
     *        This is an alternative to specifying a template name. If specified, AWS Elastic Beanstalk sets the
     *        configuration values to the default values associated with the specified solution stack.</p>
     *        <p>
     *        For a list of current solution stacks, see <a
     *        href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/concepts.platforms.html">Elastic Beanstalk
     *        Supported Platforms</a>.
     */

    public void setSolutionStackName(String solutionStackName) {
        this.solutionStackName = solutionStackName;
    }

    /**
     * <p>
     * This is an alternative to specifying a template name. If specified, AWS Elastic Beanstalk sets the configuration
     * values to the default values associated with the specified solution stack.
     * </p>
     * <p>
     * For a list of current solution stacks, see <a
     * href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/concepts.platforms.html">Elastic Beanstalk Supported
     * Platforms</a>.
     * </p>
     * 
     * @return This is an alternative to specifying a template name. If specified, AWS Elastic Beanstalk sets the
     *         configuration values to the default values associated with the specified solution stack.</p>
     *         <p>
     *         For a list of current solution stacks, see <a
     *         href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/concepts.platforms.html">Elastic Beanstalk
     *         Supported Platforms</a>.
     */

    public String getSolutionStackName() {
        return this.solutionStackName;
    }

    /**
     * <p>
     * This is an alternative to specifying a template name. If specified, AWS Elastic Beanstalk sets the configuration
     * values to the default values associated with the specified solution stack.
     * </p>
     * <p>
     * For a list of current solution stacks, see <a
     * href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/concepts.platforms.html">Elastic Beanstalk Supported
     * Platforms</a>.
     * </p>
     * 
     * @param solutionStackName
     *        This is an alternative to specifying a template name. If specified, AWS Elastic Beanstalk sets the
     *        configuration values to the default values associated with the specified solution stack.</p>
     *        <p>
     *        For a list of current solution stacks, see <a
     *        href="https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/concepts.platforms.html">Elastic Beanstalk
     *        Supported Platforms</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withSolutionStackName(String solutionStackName) {
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

    public CreateEnvironmentRequest withPlatformArn(String platformArn) {
        setPlatformArn(platformArn);
        return this;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk sets the specified configuration options to the requested value in the
     * configuration set for the new environment. These override the values obtained from the solution stack or the
     * configuration template.
     * </p>
     * 
     * @return If specified, AWS Elastic Beanstalk sets the specified configuration options to the requested value in
     *         the configuration set for the new environment. These override the values obtained from the solution stack
     *         or the configuration template.
     */

    public java.util.List<ConfigurationOptionSetting> getOptionSettings() {
        if (optionSettings == null) {
            optionSettings = new com.amazonaws.internal.SdkInternalList<ConfigurationOptionSetting>();
        }
        return optionSettings;
    }

    /**
     * <p>
     * If specified, AWS Elastic Beanstalk sets the specified configuration options to the requested value in the
     * configuration set for the new environment. These override the values obtained from the solution stack or the
     * configuration template.
     * </p>
     * 
     * @param optionSettings
     *        If specified, AWS Elastic Beanstalk sets the specified configuration options to the requested value in the
     *        configuration set for the new environment. These override the values obtained from the solution stack or
     *        the configuration template.
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
     * If specified, AWS Elastic Beanstalk sets the specified configuration options to the requested value in the
     * configuration set for the new environment. These override the values obtained from the solution stack or the
     * configuration template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptionSettings(java.util.Collection)} or {@link #withOptionSettings(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param optionSettings
     *        If specified, AWS Elastic Beanstalk sets the specified configuration options to the requested value in the
     *        configuration set for the new environment. These override the values obtained from the solution stack or
     *        the configuration template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withOptionSettings(ConfigurationOptionSetting... optionSettings) {
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
     * If specified, AWS Elastic Beanstalk sets the specified configuration options to the requested value in the
     * configuration set for the new environment. These override the values obtained from the solution stack or the
     * configuration template.
     * </p>
     * 
     * @param optionSettings
     *        If specified, AWS Elastic Beanstalk sets the specified configuration options to the requested value in the
     *        configuration set for the new environment. These override the values obtained from the solution stack or
     *        the configuration template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withOptionSettings(java.util.Collection<ConfigurationOptionSetting> optionSettings) {
        setOptionSettings(optionSettings);
        return this;
    }

    /**
     * <p>
     * A list of custom user-defined configuration options to remove from the configuration set for this new
     * environment.
     * </p>
     * 
     * @return A list of custom user-defined configuration options to remove from the configuration set for this new
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
     * A list of custom user-defined configuration options to remove from the configuration set for this new
     * environment.
     * </p>
     * 
     * @param optionsToRemove
     *        A list of custom user-defined configuration options to remove from the configuration set for this new
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
     * A list of custom user-defined configuration options to remove from the configuration set for this new
     * environment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOptionsToRemove(java.util.Collection)} or {@link #withOptionsToRemove(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param optionsToRemove
     *        A list of custom user-defined configuration options to remove from the configuration set for this new
     *        environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withOptionsToRemove(OptionSpecification... optionsToRemove) {
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
     * A list of custom user-defined configuration options to remove from the configuration set for this new
     * environment.
     * </p>
     * 
     * @param optionsToRemove
     *        A list of custom user-defined configuration options to remove from the configuration set for this new
     *        environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEnvironmentRequest withOptionsToRemove(java.util.Collection<OptionSpecification> optionsToRemove) {
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
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName()).append(",");
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCNAMEPrefix() != null)
            sb.append("CNAMEPrefix: ").append(getCNAMEPrefix()).append(",");
        if (getTier() != null)
            sb.append("Tier: ").append(getTier()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof CreateEnvironmentRequest == false)
            return false;
        CreateEnvironmentRequest other = (CreateEnvironmentRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
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
        if (other.getCNAMEPrefix() == null ^ this.getCNAMEPrefix() == null)
            return false;
        if (other.getCNAMEPrefix() != null && other.getCNAMEPrefix().equals(this.getCNAMEPrefix()) == false)
            return false;
        if (other.getTier() == null ^ this.getTier() == null)
            return false;
        if (other.getTier() != null && other.getTier().equals(this.getTier()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCNAMEPrefix() == null) ? 0 : getCNAMEPrefix().hashCode());
        hashCode = prime * hashCode + ((getTier() == null) ? 0 : getTier().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVersionLabel() == null) ? 0 : getVersionLabel().hashCode());
        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode + ((getSolutionStackName() == null) ? 0 : getSolutionStackName().hashCode());
        hashCode = prime * hashCode + ((getPlatformArn() == null) ? 0 : getPlatformArn().hashCode());
        hashCode = prime * hashCode + ((getOptionSettings() == null) ? 0 : getOptionSettings().hashCode());
        hashCode = prime * hashCode + ((getOptionsToRemove() == null) ? 0 : getOptionsToRemove().hashCode());
        return hashCode;
    }

    @Override
    public CreateEnvironmentRequest clone() {
        return (CreateEnvironmentRequest) super.clone();
    }

}
