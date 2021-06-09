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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The environment detail data. An AWS Proton environment is a set resources shared across an AWS Proton service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/Environment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Environment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The time when the environment was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The environment deployment status.
     * </p>
     */
    private String deploymentStatus;
    /**
     * <p>
     * An environment deployment status message.
     * </p>
     */
    private String deploymentStatusMessage;
    /**
     * <p>
     * The description of the environment.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ID of the environment account connection that's used to provision infrastructure resources in an environment
     * account.
     * </p>
     */
    private String environmentAccountConnectionId;
    /**
     * <p>
     * The ID of the environment account that the environment infrastructure resources are provisioned in.
     * </p>
     */
    private String environmentAccountId;
    /**
     * <p>
     * The time when a deployment of the environment was last attempted.
     * </p>
     */
    private java.util.Date lastDeploymentAttemptedAt;
    /**
     * <p>
     * The time when the environment was last deployed successfully.
     * </p>
     */
    private java.util.Date lastDeploymentSucceededAt;
    /**
     * <p>
     * The name of the environment.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of the AWS Proton service role that allows AWS Proton to make calls to other services on your behalf.
     * </p>
     */
    private String protonServiceRoleArn;
    /**
     * <p>
     * When included, indicates that the environment template is for customer provisioned and managed infrastructure.
     * </p>
     */
    private String provisioning;
    /**
     * <p>
     * The environment spec.
     * </p>
     */
    private String spec;
    /**
     * <p>
     * The ID of the major version of the environment template.
     * </p>
     */
    private String templateMajorVersion;
    /**
     * <p>
     * The ID of the minor version of the environment template.
     * </p>
     */
    private String templateMinorVersion;
    /**
     * <p>
     * The ARN of the environment template.
     * </p>
     */
    private String templateName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the environment.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the environment.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the environment.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The time when the environment was created.
     * </p>
     * 
     * @param createdAt
     *        The time when the environment was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time when the environment was created.
     * </p>
     * 
     * @return The time when the environment was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time when the environment was created.
     * </p>
     * 
     * @param createdAt
     *        The time when the environment was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The environment deployment status.
     * </p>
     * 
     * @param deploymentStatus
     *        The environment deployment status.
     * @see DeploymentStatus
     */

    public void setDeploymentStatus(String deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
    }

    /**
     * <p>
     * The environment deployment status.
     * </p>
     * 
     * @return The environment deployment status.
     * @see DeploymentStatus
     */

    public String getDeploymentStatus() {
        return this.deploymentStatus;
    }

    /**
     * <p>
     * The environment deployment status.
     * </p>
     * 
     * @param deploymentStatus
     *        The environment deployment status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentStatus
     */

    public Environment withDeploymentStatus(String deploymentStatus) {
        setDeploymentStatus(deploymentStatus);
        return this;
    }

    /**
     * <p>
     * The environment deployment status.
     * </p>
     * 
     * @param deploymentStatus
     *        The environment deployment status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentStatus
     */

    public Environment withDeploymentStatus(DeploymentStatus deploymentStatus) {
        this.deploymentStatus = deploymentStatus.toString();
        return this;
    }

    /**
     * <p>
     * An environment deployment status message.
     * </p>
     * 
     * @param deploymentStatusMessage
     *        An environment deployment status message.
     */

    public void setDeploymentStatusMessage(String deploymentStatusMessage) {
        this.deploymentStatusMessage = deploymentStatusMessage;
    }

    /**
     * <p>
     * An environment deployment status message.
     * </p>
     * 
     * @return An environment deployment status message.
     */

    public String getDeploymentStatusMessage() {
        return this.deploymentStatusMessage;
    }

    /**
     * <p>
     * An environment deployment status message.
     * </p>
     * 
     * @param deploymentStatusMessage
     *        An environment deployment status message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withDeploymentStatusMessage(String deploymentStatusMessage) {
        setDeploymentStatusMessage(deploymentStatusMessage);
        return this;
    }

    /**
     * <p>
     * The description of the environment.
     * </p>
     * 
     * @param description
     *        The description of the environment.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the environment.
     * </p>
     * 
     * @return The description of the environment.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the environment.
     * </p>
     * 
     * @param description
     *        The description of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ID of the environment account connection that's used to provision infrastructure resources in an environment
     * account.
     * </p>
     * 
     * @param environmentAccountConnectionId
     *        The ID of the environment account connection that's used to provision infrastructure resources in an
     *        environment account.
     */

    public void setEnvironmentAccountConnectionId(String environmentAccountConnectionId) {
        this.environmentAccountConnectionId = environmentAccountConnectionId;
    }

    /**
     * <p>
     * The ID of the environment account connection that's used to provision infrastructure resources in an environment
     * account.
     * </p>
     * 
     * @return The ID of the environment account connection that's used to provision infrastructure resources in an
     *         environment account.
     */

    public String getEnvironmentAccountConnectionId() {
        return this.environmentAccountConnectionId;
    }

    /**
     * <p>
     * The ID of the environment account connection that's used to provision infrastructure resources in an environment
     * account.
     * </p>
     * 
     * @param environmentAccountConnectionId
     *        The ID of the environment account connection that's used to provision infrastructure resources in an
     *        environment account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withEnvironmentAccountConnectionId(String environmentAccountConnectionId) {
        setEnvironmentAccountConnectionId(environmentAccountConnectionId);
        return this;
    }

    /**
     * <p>
     * The ID of the environment account that the environment infrastructure resources are provisioned in.
     * </p>
     * 
     * @param environmentAccountId
     *        The ID of the environment account that the environment infrastructure resources are provisioned in.
     */

    public void setEnvironmentAccountId(String environmentAccountId) {
        this.environmentAccountId = environmentAccountId;
    }

    /**
     * <p>
     * The ID of the environment account that the environment infrastructure resources are provisioned in.
     * </p>
     * 
     * @return The ID of the environment account that the environment infrastructure resources are provisioned in.
     */

    public String getEnvironmentAccountId() {
        return this.environmentAccountId;
    }

    /**
     * <p>
     * The ID of the environment account that the environment infrastructure resources are provisioned in.
     * </p>
     * 
     * @param environmentAccountId
     *        The ID of the environment account that the environment infrastructure resources are provisioned in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withEnvironmentAccountId(String environmentAccountId) {
        setEnvironmentAccountId(environmentAccountId);
        return this;
    }

    /**
     * <p>
     * The time when a deployment of the environment was last attempted.
     * </p>
     * 
     * @param lastDeploymentAttemptedAt
     *        The time when a deployment of the environment was last attempted.
     */

    public void setLastDeploymentAttemptedAt(java.util.Date lastDeploymentAttemptedAt) {
        this.lastDeploymentAttemptedAt = lastDeploymentAttemptedAt;
    }

    /**
     * <p>
     * The time when a deployment of the environment was last attempted.
     * </p>
     * 
     * @return The time when a deployment of the environment was last attempted.
     */

    public java.util.Date getLastDeploymentAttemptedAt() {
        return this.lastDeploymentAttemptedAt;
    }

    /**
     * <p>
     * The time when a deployment of the environment was last attempted.
     * </p>
     * 
     * @param lastDeploymentAttemptedAt
     *        The time when a deployment of the environment was last attempted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withLastDeploymentAttemptedAt(java.util.Date lastDeploymentAttemptedAt) {
        setLastDeploymentAttemptedAt(lastDeploymentAttemptedAt);
        return this;
    }

    /**
     * <p>
     * The time when the environment was last deployed successfully.
     * </p>
     * 
     * @param lastDeploymentSucceededAt
     *        The time when the environment was last deployed successfully.
     */

    public void setLastDeploymentSucceededAt(java.util.Date lastDeploymentSucceededAt) {
        this.lastDeploymentSucceededAt = lastDeploymentSucceededAt;
    }

    /**
     * <p>
     * The time when the environment was last deployed successfully.
     * </p>
     * 
     * @return The time when the environment was last deployed successfully.
     */

    public java.util.Date getLastDeploymentSucceededAt() {
        return this.lastDeploymentSucceededAt;
    }

    /**
     * <p>
     * The time when the environment was last deployed successfully.
     * </p>
     * 
     * @param lastDeploymentSucceededAt
     *        The time when the environment was last deployed successfully.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withLastDeploymentSucceededAt(java.util.Date lastDeploymentSucceededAt) {
        setLastDeploymentSucceededAt(lastDeploymentSucceededAt);
        return this;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * 
     * @param name
     *        The name of the environment.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * 
     * @return The name of the environment.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * 
     * @param name
     *        The name of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of the AWS Proton service role that allows AWS Proton to make calls to other services on your behalf.
     * </p>
     * 
     * @param protonServiceRoleArn
     *        The ARN of the AWS Proton service role that allows AWS Proton to make calls to other services on your
     *        behalf.
     */

    public void setProtonServiceRoleArn(String protonServiceRoleArn) {
        this.protonServiceRoleArn = protonServiceRoleArn;
    }

    /**
     * <p>
     * The ARN of the AWS Proton service role that allows AWS Proton to make calls to other services on your behalf.
     * </p>
     * 
     * @return The ARN of the AWS Proton service role that allows AWS Proton to make calls to other services on your
     *         behalf.
     */

    public String getProtonServiceRoleArn() {
        return this.protonServiceRoleArn;
    }

    /**
     * <p>
     * The ARN of the AWS Proton service role that allows AWS Proton to make calls to other services on your behalf.
     * </p>
     * 
     * @param protonServiceRoleArn
     *        The ARN of the AWS Proton service role that allows AWS Proton to make calls to other services on your
     *        behalf.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withProtonServiceRoleArn(String protonServiceRoleArn) {
        setProtonServiceRoleArn(protonServiceRoleArn);
        return this;
    }

    /**
     * <p>
     * When included, indicates that the environment template is for customer provisioned and managed infrastructure.
     * </p>
     * 
     * @param provisioning
     *        When included, indicates that the environment template is for customer provisioned and managed
     *        infrastructure.
     * @see Provisioning
     */

    public void setProvisioning(String provisioning) {
        this.provisioning = provisioning;
    }

    /**
     * <p>
     * When included, indicates that the environment template is for customer provisioned and managed infrastructure.
     * </p>
     * 
     * @return When included, indicates that the environment template is for customer provisioned and managed
     *         infrastructure.
     * @see Provisioning
     */

    public String getProvisioning() {
        return this.provisioning;
    }

    /**
     * <p>
     * When included, indicates that the environment template is for customer provisioned and managed infrastructure.
     * </p>
     * 
     * @param provisioning
     *        When included, indicates that the environment template is for customer provisioned and managed
     *        infrastructure.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Provisioning
     */

    public Environment withProvisioning(String provisioning) {
        setProvisioning(provisioning);
        return this;
    }

    /**
     * <p>
     * When included, indicates that the environment template is for customer provisioned and managed infrastructure.
     * </p>
     * 
     * @param provisioning
     *        When included, indicates that the environment template is for customer provisioned and managed
     *        infrastructure.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Provisioning
     */

    public Environment withProvisioning(Provisioning provisioning) {
        this.provisioning = provisioning.toString();
        return this;
    }

    /**
     * <p>
     * The environment spec.
     * </p>
     * 
     * @param spec
     *        The environment spec.
     */

    public void setSpec(String spec) {
        this.spec = spec;
    }

    /**
     * <p>
     * The environment spec.
     * </p>
     * 
     * @return The environment spec.
     */

    public String getSpec() {
        return this.spec;
    }

    /**
     * <p>
     * The environment spec.
     * </p>
     * 
     * @param spec
     *        The environment spec.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withSpec(String spec) {
        setSpec(spec);
        return this;
    }

    /**
     * <p>
     * The ID of the major version of the environment template.
     * </p>
     * 
     * @param templateMajorVersion
     *        The ID of the major version of the environment template.
     */

    public void setTemplateMajorVersion(String templateMajorVersion) {
        this.templateMajorVersion = templateMajorVersion;
    }

    /**
     * <p>
     * The ID of the major version of the environment template.
     * </p>
     * 
     * @return The ID of the major version of the environment template.
     */

    public String getTemplateMajorVersion() {
        return this.templateMajorVersion;
    }

    /**
     * <p>
     * The ID of the major version of the environment template.
     * </p>
     * 
     * @param templateMajorVersion
     *        The ID of the major version of the environment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withTemplateMajorVersion(String templateMajorVersion) {
        setTemplateMajorVersion(templateMajorVersion);
        return this;
    }

    /**
     * <p>
     * The ID of the minor version of the environment template.
     * </p>
     * 
     * @param templateMinorVersion
     *        The ID of the minor version of the environment template.
     */

    public void setTemplateMinorVersion(String templateMinorVersion) {
        this.templateMinorVersion = templateMinorVersion;
    }

    /**
     * <p>
     * The ID of the minor version of the environment template.
     * </p>
     * 
     * @return The ID of the minor version of the environment template.
     */

    public String getTemplateMinorVersion() {
        return this.templateMinorVersion;
    }

    /**
     * <p>
     * The ID of the minor version of the environment template.
     * </p>
     * 
     * @param templateMinorVersion
     *        The ID of the minor version of the environment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withTemplateMinorVersion(String templateMinorVersion) {
        setTemplateMinorVersion(templateMinorVersion);
        return this;
    }

    /**
     * <p>
     * The ARN of the environment template.
     * </p>
     * 
     * @param templateName
     *        The ARN of the environment template.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The ARN of the environment template.
     * </p>
     * 
     * @return The ARN of the environment template.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The ARN of the environment template.
     * </p>
     * 
     * @param templateName
     *        The ARN of the environment template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Environment withTemplateName(String templateName) {
        setTemplateName(templateName);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDeploymentStatus() != null)
            sb.append("DeploymentStatus: ").append(getDeploymentStatus()).append(",");
        if (getDeploymentStatusMessage() != null)
            sb.append("DeploymentStatusMessage: ").append("***Sensitive Data Redacted***").append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getEnvironmentAccountConnectionId() != null)
            sb.append("EnvironmentAccountConnectionId: ").append(getEnvironmentAccountConnectionId()).append(",");
        if (getEnvironmentAccountId() != null)
            sb.append("EnvironmentAccountId: ").append(getEnvironmentAccountId()).append(",");
        if (getLastDeploymentAttemptedAt() != null)
            sb.append("LastDeploymentAttemptedAt: ").append(getLastDeploymentAttemptedAt()).append(",");
        if (getLastDeploymentSucceededAt() != null)
            sb.append("LastDeploymentSucceededAt: ").append(getLastDeploymentSucceededAt()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getProtonServiceRoleArn() != null)
            sb.append("ProtonServiceRoleArn: ").append(getProtonServiceRoleArn()).append(",");
        if (getProvisioning() != null)
            sb.append("Provisioning: ").append(getProvisioning()).append(",");
        if (getSpec() != null)
            sb.append("Spec: ").append("***Sensitive Data Redacted***").append(",");
        if (getTemplateMajorVersion() != null)
            sb.append("TemplateMajorVersion: ").append(getTemplateMajorVersion()).append(",");
        if (getTemplateMinorVersion() != null)
            sb.append("TemplateMinorVersion: ").append(getTemplateMinorVersion()).append(",");
        if (getTemplateName() != null)
            sb.append("TemplateName: ").append(getTemplateName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Environment == false)
            return false;
        Environment other = (Environment) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDeploymentStatus() == null ^ this.getDeploymentStatus() == null)
            return false;
        if (other.getDeploymentStatus() != null && other.getDeploymentStatus().equals(this.getDeploymentStatus()) == false)
            return false;
        if (other.getDeploymentStatusMessage() == null ^ this.getDeploymentStatusMessage() == null)
            return false;
        if (other.getDeploymentStatusMessage() != null && other.getDeploymentStatusMessage().equals(this.getDeploymentStatusMessage()) == false)
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
        if (other.getEnvironmentAccountId() == null ^ this.getEnvironmentAccountId() == null)
            return false;
        if (other.getEnvironmentAccountId() != null && other.getEnvironmentAccountId().equals(this.getEnvironmentAccountId()) == false)
            return false;
        if (other.getLastDeploymentAttemptedAt() == null ^ this.getLastDeploymentAttemptedAt() == null)
            return false;
        if (other.getLastDeploymentAttemptedAt() != null && other.getLastDeploymentAttemptedAt().equals(this.getLastDeploymentAttemptedAt()) == false)
            return false;
        if (other.getLastDeploymentSucceededAt() == null ^ this.getLastDeploymentSucceededAt() == null)
            return false;
        if (other.getLastDeploymentSucceededAt() != null && other.getLastDeploymentSucceededAt().equals(this.getLastDeploymentSucceededAt()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProtonServiceRoleArn() == null ^ this.getProtonServiceRoleArn() == null)
            return false;
        if (other.getProtonServiceRoleArn() != null && other.getProtonServiceRoleArn().equals(this.getProtonServiceRoleArn()) == false)
            return false;
        if (other.getProvisioning() == null ^ this.getProvisioning() == null)
            return false;
        if (other.getProvisioning() != null && other.getProvisioning().equals(this.getProvisioning()) == false)
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
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDeploymentStatus() == null) ? 0 : getDeploymentStatus().hashCode());
        hashCode = prime * hashCode + ((getDeploymentStatusMessage() == null) ? 0 : getDeploymentStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentAccountConnectionId() == null) ? 0 : getEnvironmentAccountConnectionId().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentAccountId() == null) ? 0 : getEnvironmentAccountId().hashCode());
        hashCode = prime * hashCode + ((getLastDeploymentAttemptedAt() == null) ? 0 : getLastDeploymentAttemptedAt().hashCode());
        hashCode = prime * hashCode + ((getLastDeploymentSucceededAt() == null) ? 0 : getLastDeploymentSucceededAt().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProtonServiceRoleArn() == null) ? 0 : getProtonServiceRoleArn().hashCode());
        hashCode = prime * hashCode + ((getProvisioning() == null) ? 0 : getProvisioning().hashCode());
        hashCode = prime * hashCode + ((getSpec() == null) ? 0 : getSpec().hashCode());
        hashCode = prime * hashCode + ((getTemplateMajorVersion() == null) ? 0 : getTemplateMajorVersion().hashCode());
        hashCode = prime * hashCode + ((getTemplateMinorVersion() == null) ? 0 : getTemplateMinorVersion().hashCode());
        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        return hashCode;
    }

    @Override
    public Environment clone() {
        try {
            return (Environment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.proton.model.transform.EnvironmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
