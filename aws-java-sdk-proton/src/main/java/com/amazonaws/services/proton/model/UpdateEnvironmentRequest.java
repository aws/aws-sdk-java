/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.proton.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/UpdateEnvironment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEnvironmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * There are four modes for updating an environment as described in the following. The <code>deploymentType</code>
     * field defines the mode.
     * </p>
     * <dl>
     * <dt/>
     * <dd>
     * <p>
     * <code>NONE</code>
     * </p>
     * <p>
     * In this mode, a deployment <i>doesn't</i> occur. Only the requested metadata parameters are updated.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>CURRENT_VERSION</code>
     * </p>
     * <p>
     * In this mode, the environment is deployed and updated with the new spec that you provide. Only requested
     * parameters are updated. <i>Don’t</i> include minor or major version parameters when you use this
     * <code>deployment-type</code>.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>MINOR_VERSION</code>
     * </p>
     * <p>
     * In this mode, the environment is deployed and updated with the published, recommended (latest) minor version of
     * the current major version in use, by default. You can also specify a different minor version of the current major
     * version in use.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>MAJOR_VERSION</code>
     * </p>
     * <p>
     * In this mode, the environment is deployed and updated with the published, recommended (latest) major and minor
     * version of the current template, by default. You can also specify a different major version that is higher than
     * the major version in use and a minor version (optional).
     * </p>
     * </dd>
     * </dl>
     */
    private String deploymentType;
    /**
     * <p>
     * A description of the environment update.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID of the environment account connection.
     * </p>
     * <p>
     * You can only update to a new environment account connection if it was created in the same environment account
     * that the current environment account connection was created in and associated with the current environment.
     * </p>
     */
    private String environmentAccountConnectionId;
    /**
     * <p>
     * The name of the environment to update.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of the AWS Proton service role that allows AWS Proton to make API calls to other services your behalf.
     * </p>
     */
    private String protonServiceRoleArn;
    /**
     * <p>
     * The formatted specification that defines the update.
     * </p>
     */
    private String spec;
    /**
     * <p>
     * The ID of the major version of the environment to update.
     * </p>
     */
    private String templateMajorVersion;
    /**
     * <p>
     * The ID of the minor version of the environment to update.
     * </p>
     */
    private String templateMinorVersion;

    /**
     * <p>
     * There are four modes for updating an environment as described in the following. The <code>deploymentType</code>
     * field defines the mode.
     * </p>
     * <dl>
     * <dt/>
     * <dd>
     * <p>
     * <code>NONE</code>
     * </p>
     * <p>
     * In this mode, a deployment <i>doesn't</i> occur. Only the requested metadata parameters are updated.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>CURRENT_VERSION</code>
     * </p>
     * <p>
     * In this mode, the environment is deployed and updated with the new spec that you provide. Only requested
     * parameters are updated. <i>Don’t</i> include minor or major version parameters when you use this
     * <code>deployment-type</code>.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>MINOR_VERSION</code>
     * </p>
     * <p>
     * In this mode, the environment is deployed and updated with the published, recommended (latest) minor version of
     * the current major version in use, by default. You can also specify a different minor version of the current major
     * version in use.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>MAJOR_VERSION</code>
     * </p>
     * <p>
     * In this mode, the environment is deployed and updated with the published, recommended (latest) major and minor
     * version of the current template, by default. You can also specify a different major version that is higher than
     * the major version in use and a minor version (optional).
     * </p>
     * </dd>
     * </dl>
     * 
     * @param deploymentType
     *        There are four modes for updating an environment as described in the following. The
     *        <code>deploymentType</code> field defines the mode.</p>
     *        <dl>
     *        <dt/>
     *        <dd>
     *        <p>
     *        <code>NONE</code>
     *        </p>
     *        <p>
     *        In this mode, a deployment <i>doesn't</i> occur. Only the requested metadata parameters are updated.
     *        </p>
     *        </dd>
     *        <dt/>
     *        <dd>
     *        <p>
     *        <code>CURRENT_VERSION</code>
     *        </p>
     *        <p>
     *        In this mode, the environment is deployed and updated with the new spec that you provide. Only requested
     *        parameters are updated. <i>Don’t</i> include minor or major version parameters when you use this
     *        <code>deployment-type</code>.
     *        </p>
     *        </dd>
     *        <dt/>
     *        <dd>
     *        <p>
     *        <code>MINOR_VERSION</code>
     *        </p>
     *        <p>
     *        In this mode, the environment is deployed and updated with the published, recommended (latest) minor
     *        version of the current major version in use, by default. You can also specify a different minor version of
     *        the current major version in use.
     *        </p>
     *        </dd>
     *        <dt/>
     *        <dd>
     *        <p>
     *        <code>MAJOR_VERSION</code>
     *        </p>
     *        <p>
     *        In this mode, the environment is deployed and updated with the published, recommended (latest) major and
     *        minor version of the current template, by default. You can also specify a different major version that is
     *        higher than the major version in use and a minor version (optional).
     *        </p>
     *        </dd>
     * @see DeploymentUpdateType
     */

    public void setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
    }

    /**
     * <p>
     * There are four modes for updating an environment as described in the following. The <code>deploymentType</code>
     * field defines the mode.
     * </p>
     * <dl>
     * <dt/>
     * <dd>
     * <p>
     * <code>NONE</code>
     * </p>
     * <p>
     * In this mode, a deployment <i>doesn't</i> occur. Only the requested metadata parameters are updated.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>CURRENT_VERSION</code>
     * </p>
     * <p>
     * In this mode, the environment is deployed and updated with the new spec that you provide. Only requested
     * parameters are updated. <i>Don’t</i> include minor or major version parameters when you use this
     * <code>deployment-type</code>.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>MINOR_VERSION</code>
     * </p>
     * <p>
     * In this mode, the environment is deployed and updated with the published, recommended (latest) minor version of
     * the current major version in use, by default. You can also specify a different minor version of the current major
     * version in use.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>MAJOR_VERSION</code>
     * </p>
     * <p>
     * In this mode, the environment is deployed and updated with the published, recommended (latest) major and minor
     * version of the current template, by default. You can also specify a different major version that is higher than
     * the major version in use and a minor version (optional).
     * </p>
     * </dd>
     * </dl>
     * 
     * @return There are four modes for updating an environment as described in the following. The
     *         <code>deploymentType</code> field defines the mode.</p>
     *         <dl>
     *         <dt/>
     *         <dd>
     *         <p>
     *         <code>NONE</code>
     *         </p>
     *         <p>
     *         In this mode, a deployment <i>doesn't</i> occur. Only the requested metadata parameters are updated.
     *         </p>
     *         </dd>
     *         <dt/>
     *         <dd>
     *         <p>
     *         <code>CURRENT_VERSION</code>
     *         </p>
     *         <p>
     *         In this mode, the environment is deployed and updated with the new spec that you provide. Only requested
     *         parameters are updated. <i>Don’t</i> include minor or major version parameters when you use this
     *         <code>deployment-type</code>.
     *         </p>
     *         </dd>
     *         <dt/>
     *         <dd>
     *         <p>
     *         <code>MINOR_VERSION</code>
     *         </p>
     *         <p>
     *         In this mode, the environment is deployed and updated with the published, recommended (latest) minor
     *         version of the current major version in use, by default. You can also specify a different minor version
     *         of the current major version in use.
     *         </p>
     *         </dd>
     *         <dt/>
     *         <dd>
     *         <p>
     *         <code>MAJOR_VERSION</code>
     *         </p>
     *         <p>
     *         In this mode, the environment is deployed and updated with the published, recommended (latest) major and
     *         minor version of the current template, by default. You can also specify a different major version that is
     *         higher than the major version in use and a minor version (optional).
     *         </p>
     *         </dd>
     * @see DeploymentUpdateType
     */

    public String getDeploymentType() {
        return this.deploymentType;
    }

    /**
     * <p>
     * There are four modes for updating an environment as described in the following. The <code>deploymentType</code>
     * field defines the mode.
     * </p>
     * <dl>
     * <dt/>
     * <dd>
     * <p>
     * <code>NONE</code>
     * </p>
     * <p>
     * In this mode, a deployment <i>doesn't</i> occur. Only the requested metadata parameters are updated.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>CURRENT_VERSION</code>
     * </p>
     * <p>
     * In this mode, the environment is deployed and updated with the new spec that you provide. Only requested
     * parameters are updated. <i>Don’t</i> include minor or major version parameters when you use this
     * <code>deployment-type</code>.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>MINOR_VERSION</code>
     * </p>
     * <p>
     * In this mode, the environment is deployed and updated with the published, recommended (latest) minor version of
     * the current major version in use, by default. You can also specify a different minor version of the current major
     * version in use.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>MAJOR_VERSION</code>
     * </p>
     * <p>
     * In this mode, the environment is deployed and updated with the published, recommended (latest) major and minor
     * version of the current template, by default. You can also specify a different major version that is higher than
     * the major version in use and a minor version (optional).
     * </p>
     * </dd>
     * </dl>
     * 
     * @param deploymentType
     *        There are four modes for updating an environment as described in the following. The
     *        <code>deploymentType</code> field defines the mode.</p>
     *        <dl>
     *        <dt/>
     *        <dd>
     *        <p>
     *        <code>NONE</code>
     *        </p>
     *        <p>
     *        In this mode, a deployment <i>doesn't</i> occur. Only the requested metadata parameters are updated.
     *        </p>
     *        </dd>
     *        <dt/>
     *        <dd>
     *        <p>
     *        <code>CURRENT_VERSION</code>
     *        </p>
     *        <p>
     *        In this mode, the environment is deployed and updated with the new spec that you provide. Only requested
     *        parameters are updated. <i>Don’t</i> include minor or major version parameters when you use this
     *        <code>deployment-type</code>.
     *        </p>
     *        </dd>
     *        <dt/>
     *        <dd>
     *        <p>
     *        <code>MINOR_VERSION</code>
     *        </p>
     *        <p>
     *        In this mode, the environment is deployed and updated with the published, recommended (latest) minor
     *        version of the current major version in use, by default. You can also specify a different minor version of
     *        the current major version in use.
     *        </p>
     *        </dd>
     *        <dt/>
     *        <dd>
     *        <p>
     *        <code>MAJOR_VERSION</code>
     *        </p>
     *        <p>
     *        In this mode, the environment is deployed and updated with the published, recommended (latest) major and
     *        minor version of the current template, by default. You can also specify a different major version that is
     *        higher than the major version in use and a minor version (optional).
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentUpdateType
     */

    public UpdateEnvironmentRequest withDeploymentType(String deploymentType) {
        setDeploymentType(deploymentType);
        return this;
    }

    /**
     * <p>
     * There are four modes for updating an environment as described in the following. The <code>deploymentType</code>
     * field defines the mode.
     * </p>
     * <dl>
     * <dt/>
     * <dd>
     * <p>
     * <code>NONE</code>
     * </p>
     * <p>
     * In this mode, a deployment <i>doesn't</i> occur. Only the requested metadata parameters are updated.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>CURRENT_VERSION</code>
     * </p>
     * <p>
     * In this mode, the environment is deployed and updated with the new spec that you provide. Only requested
     * parameters are updated. <i>Don’t</i> include minor or major version parameters when you use this
     * <code>deployment-type</code>.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>MINOR_VERSION</code>
     * </p>
     * <p>
     * In this mode, the environment is deployed and updated with the published, recommended (latest) minor version of
     * the current major version in use, by default. You can also specify a different minor version of the current major
     * version in use.
     * </p>
     * </dd>
     * <dt/>
     * <dd>
     * <p>
     * <code>MAJOR_VERSION</code>
     * </p>
     * <p>
     * In this mode, the environment is deployed and updated with the published, recommended (latest) major and minor
     * version of the current template, by default. You can also specify a different major version that is higher than
     * the major version in use and a minor version (optional).
     * </p>
     * </dd>
     * </dl>
     * 
     * @param deploymentType
     *        There are four modes for updating an environment as described in the following. The
     *        <code>deploymentType</code> field defines the mode.</p>
     *        <dl>
     *        <dt/>
     *        <dd>
     *        <p>
     *        <code>NONE</code>
     *        </p>
     *        <p>
     *        In this mode, a deployment <i>doesn't</i> occur. Only the requested metadata parameters are updated.
     *        </p>
     *        </dd>
     *        <dt/>
     *        <dd>
     *        <p>
     *        <code>CURRENT_VERSION</code>
     *        </p>
     *        <p>
     *        In this mode, the environment is deployed and updated with the new spec that you provide. Only requested
     *        parameters are updated. <i>Don’t</i> include minor or major version parameters when you use this
     *        <code>deployment-type</code>.
     *        </p>
     *        </dd>
     *        <dt/>
     *        <dd>
     *        <p>
     *        <code>MINOR_VERSION</code>
     *        </p>
     *        <p>
     *        In this mode, the environment is deployed and updated with the published, recommended (latest) minor
     *        version of the current major version in use, by default. You can also specify a different minor version of
     *        the current major version in use.
     *        </p>
     *        </dd>
     *        <dt/>
     *        <dd>
     *        <p>
     *        <code>MAJOR_VERSION</code>
     *        </p>
     *        <p>
     *        In this mode, the environment is deployed and updated with the published, recommended (latest) major and
     *        minor version of the current template, by default. You can also specify a different major version that is
     *        higher than the major version in use and a minor version (optional).
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentUpdateType
     */

    public UpdateEnvironmentRequest withDeploymentType(DeploymentUpdateType deploymentType) {
        this.deploymentType = deploymentType.toString();
        return this;
    }

    /**
     * <p>
     * A description of the environment update.
     * </p>
     * 
     * @param description
     *        A description of the environment update.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the environment update.
     * </p>
     * 
     * @return A description of the environment update.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the environment update.
     * </p>
     * 
     * @param description
     *        A description of the environment update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID of the environment account connection.
     * </p>
     * <p>
     * You can only update to a new environment account connection if it was created in the same environment account
     * that the current environment account connection was created in and associated with the current environment.
     * </p>
     * 
     * @param environmentAccountConnectionId
     *        The ID of the environment account connection.</p>
     *        <p>
     *        You can only update to a new environment account connection if it was created in the same environment
     *        account that the current environment account connection was created in and associated with the current
     *        environment.
     */

    public void setEnvironmentAccountConnectionId(String environmentAccountConnectionId) {
        this.environmentAccountConnectionId = environmentAccountConnectionId;
    }

    /**
     * <p>
     * The ID of the environment account connection.
     * </p>
     * <p>
     * You can only update to a new environment account connection if it was created in the same environment account
     * that the current environment account connection was created in and associated with the current environment.
     * </p>
     * 
     * @return The ID of the environment account connection.</p>
     *         <p>
     *         You can only update to a new environment account connection if it was created in the same environment
     *         account that the current environment account connection was created in and associated with the current
     *         environment.
     */

    public String getEnvironmentAccountConnectionId() {
        return this.environmentAccountConnectionId;
    }

    /**
     * <p>
     * The ID of the environment account connection.
     * </p>
     * <p>
     * You can only update to a new environment account connection if it was created in the same environment account
     * that the current environment account connection was created in and associated with the current environment.
     * </p>
     * 
     * @param environmentAccountConnectionId
     *        The ID of the environment account connection.</p>
     *        <p>
     *        You can only update to a new environment account connection if it was created in the same environment
     *        account that the current environment account connection was created in and associated with the current
     *        environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withEnvironmentAccountConnectionId(String environmentAccountConnectionId) {
        setEnvironmentAccountConnectionId(environmentAccountConnectionId);
        return this;
    }

    /**
     * <p>
     * The name of the environment to update.
     * </p>
     * 
     * @param name
     *        The name of the environment to update.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the environment to update.
     * </p>
     * 
     * @return The name of the environment to update.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the environment to update.
     * </p>
     * 
     * @param name
     *        The name of the environment to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of the AWS Proton service role that allows AWS Proton to make API calls to other services your behalf.
     * </p>
     * 
     * @param protonServiceRoleArn
     *        The ARN of the AWS Proton service role that allows AWS Proton to make API calls to other services your
     *        behalf.
     */

    public void setProtonServiceRoleArn(String protonServiceRoleArn) {
        this.protonServiceRoleArn = protonServiceRoleArn;
    }

    /**
     * <p>
     * The ARN of the AWS Proton service role that allows AWS Proton to make API calls to other services your behalf.
     * </p>
     * 
     * @return The ARN of the AWS Proton service role that allows AWS Proton to make API calls to other services your
     *         behalf.
     */

    public String getProtonServiceRoleArn() {
        return this.protonServiceRoleArn;
    }

    /**
     * <p>
     * The ARN of the AWS Proton service role that allows AWS Proton to make API calls to other services your behalf.
     * </p>
     * 
     * @param protonServiceRoleArn
     *        The ARN of the AWS Proton service role that allows AWS Proton to make API calls to other services your
     *        behalf.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withProtonServiceRoleArn(String protonServiceRoleArn) {
        setProtonServiceRoleArn(protonServiceRoleArn);
        return this;
    }

    /**
     * <p>
     * The formatted specification that defines the update.
     * </p>
     * 
     * @param spec
     *        The formatted specification that defines the update.
     */

    public void setSpec(String spec) {
        this.spec = spec;
    }

    /**
     * <p>
     * The formatted specification that defines the update.
     * </p>
     * 
     * @return The formatted specification that defines the update.
     */

    public String getSpec() {
        return this.spec;
    }

    /**
     * <p>
     * The formatted specification that defines the update.
     * </p>
     * 
     * @param spec
     *        The formatted specification that defines the update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withSpec(String spec) {
        setSpec(spec);
        return this;
    }

    /**
     * <p>
     * The ID of the major version of the environment to update.
     * </p>
     * 
     * @param templateMajorVersion
     *        The ID of the major version of the environment to update.
     */

    public void setTemplateMajorVersion(String templateMajorVersion) {
        this.templateMajorVersion = templateMajorVersion;
    }

    /**
     * <p>
     * The ID of the major version of the environment to update.
     * </p>
     * 
     * @return The ID of the major version of the environment to update.
     */

    public String getTemplateMajorVersion() {
        return this.templateMajorVersion;
    }

    /**
     * <p>
     * The ID of the major version of the environment to update.
     * </p>
     * 
     * @param templateMajorVersion
     *        The ID of the major version of the environment to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withTemplateMajorVersion(String templateMajorVersion) {
        setTemplateMajorVersion(templateMajorVersion);
        return this;
    }

    /**
     * <p>
     * The ID of the minor version of the environment to update.
     * </p>
     * 
     * @param templateMinorVersion
     *        The ID of the minor version of the environment to update.
     */

    public void setTemplateMinorVersion(String templateMinorVersion) {
        this.templateMinorVersion = templateMinorVersion;
    }

    /**
     * <p>
     * The ID of the minor version of the environment to update.
     * </p>
     * 
     * @return The ID of the minor version of the environment to update.
     */

    public String getTemplateMinorVersion() {
        return this.templateMinorVersion;
    }

    /**
     * <p>
     * The ID of the minor version of the environment to update.
     * </p>
     * 
     * @param templateMinorVersion
     *        The ID of the minor version of the environment to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentRequest withTemplateMinorVersion(String templateMinorVersion) {
        setTemplateMinorVersion(templateMinorVersion);
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
        if (getDeploymentType() != null)
            sb.append("DeploymentType: ").append(getDeploymentType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getEnvironmentAccountConnectionId() != null)
            sb.append("EnvironmentAccountConnectionId: ").append(getEnvironmentAccountConnectionId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getProtonServiceRoleArn() != null)
            sb.append("ProtonServiceRoleArn: ").append(getProtonServiceRoleArn()).append(",");
        if (getSpec() != null)
            sb.append("Spec: ").append("***Sensitive Data Redacted***").append(",");
        if (getTemplateMajorVersion() != null)
            sb.append("TemplateMajorVersion: ").append(getTemplateMajorVersion()).append(",");
        if (getTemplateMinorVersion() != null)
            sb.append("TemplateMinorVersion: ").append(getTemplateMinorVersion());
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
        if (other.getDeploymentType() == null ^ this.getDeploymentType() == null)
            return false;
        if (other.getDeploymentType() != null && other.getDeploymentType().equals(this.getDeploymentType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEnvironmentAccountConnectionId() == null ^ this.getEnvironmentAccountConnectionId() == null)
            return false;
        if (other.getEnvironmentAccountConnectionId() != null
                && other.getEnvironmentAccountConnectionId().equals(this.getEnvironmentAccountConnectionId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProtonServiceRoleArn() == null ^ this.getProtonServiceRoleArn() == null)
            return false;
        if (other.getProtonServiceRoleArn() != null && other.getProtonServiceRoleArn().equals(this.getProtonServiceRoleArn()) == false)
            return false;
        if (other.getSpec() == null ^ this.getSpec() == null)
            return false;
        if (other.getSpec() != null && other.getSpec().equals(this.getSpec()) == false)
            return false;
        if (other.getTemplateMajorVersion() == null ^ this.getTemplateMajorVersion() == null)
            return false;
        if (other.getTemplateMajorVersion() != null && other.getTemplateMajorVersion().equals(this.getTemplateMajorVersion()) == false)
            return false;
        if (other.getTemplateMinorVersion() == null ^ this.getTemplateMinorVersion() == null)
            return false;
        if (other.getTemplateMinorVersion() != null && other.getTemplateMinorVersion().equals(this.getTemplateMinorVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentType() == null) ? 0 : getDeploymentType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentAccountConnectionId() == null) ? 0 : getEnvironmentAccountConnectionId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProtonServiceRoleArn() == null) ? 0 : getProtonServiceRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSpec() == null) ? 0 : getSpec().hashCode());
        hashCode = prime * hashCode + ((getTemplateMajorVersion() == null) ? 0 : getTemplateMajorVersion().hashCode());
        hashCode = prime * hashCode + ((getTemplateMinorVersion() == null) ? 0 : getTemplateMinorVersion().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEnvironmentRequest clone() {
        return (UpdateEnvironmentRequest) super.clone();
    }

}
