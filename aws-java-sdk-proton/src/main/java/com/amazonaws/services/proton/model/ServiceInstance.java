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
 * The service instance detail data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/ServiceInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceInstance implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service instance.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The time when the service instance was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The service instance deployment status.
     * </p>
     */
    private String deploymentStatus;
    /**
     * <p>
     * A service instance deployment status message.
     * </p>
     */
    private String deploymentStatusMessage;
    /**
     * <p>
     * The name of the environment that the service instance was deployed into.
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * The time when a deployment of the service instance was last attempted.
     * </p>
     */
    private java.util.Date lastDeploymentAttemptedAt;
    /**
     * <p>
     * The time when the service instance was last deployed successfully.
     * </p>
     */
    private java.util.Date lastDeploymentSucceededAt;
    /**
     * <p>
     * The name of the service instance.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the service that the service instance belongs to.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * The service spec that was used to create the service instance.
     * </p>
     */
    private String spec;
    /**
     * <p>
     * The ID of the major version of the service template that was used to create the service instance.
     * </p>
     */
    private String templateMajorVersion;
    /**
     * <p>
     * The ID of the minor version of the service template that was used to create the service instance.
     * </p>
     */
    private String templateMinorVersion;
    /**
     * <p>
     * The name of the service template that was used to create the service instance.
     * </p>
     */
    private String templateName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service instance.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the service instance.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service instance.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the service instance.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service instance.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the service instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceInstance withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The time when the service instance was created.
     * </p>
     * 
     * @param createdAt
     *        The time when the service instance was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time when the service instance was created.
     * </p>
     * 
     * @return The time when the service instance was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time when the service instance was created.
     * </p>
     * 
     * @param createdAt
     *        The time when the service instance was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceInstance withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The service instance deployment status.
     * </p>
     * 
     * @param deploymentStatus
     *        The service instance deployment status.
     * @see DeploymentStatus
     */

    public void setDeploymentStatus(String deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
    }

    /**
     * <p>
     * The service instance deployment status.
     * </p>
     * 
     * @return The service instance deployment status.
     * @see DeploymentStatus
     */

    public String getDeploymentStatus() {
        return this.deploymentStatus;
    }

    /**
     * <p>
     * The service instance deployment status.
     * </p>
     * 
     * @param deploymentStatus
     *        The service instance deployment status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentStatus
     */

    public ServiceInstance withDeploymentStatus(String deploymentStatus) {
        setDeploymentStatus(deploymentStatus);
        return this;
    }

    /**
     * <p>
     * The service instance deployment status.
     * </p>
     * 
     * @param deploymentStatus
     *        The service instance deployment status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentStatus
     */

    public ServiceInstance withDeploymentStatus(DeploymentStatus deploymentStatus) {
        this.deploymentStatus = deploymentStatus.toString();
        return this;
    }

    /**
     * <p>
     * A service instance deployment status message.
     * </p>
     * 
     * @param deploymentStatusMessage
     *        A service instance deployment status message.
     */

    public void setDeploymentStatusMessage(String deploymentStatusMessage) {
        this.deploymentStatusMessage = deploymentStatusMessage;
    }

    /**
     * <p>
     * A service instance deployment status message.
     * </p>
     * 
     * @return A service instance deployment status message.
     */

    public String getDeploymentStatusMessage() {
        return this.deploymentStatusMessage;
    }

    /**
     * <p>
     * A service instance deployment status message.
     * </p>
     * 
     * @param deploymentStatusMessage
     *        A service instance deployment status message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceInstance withDeploymentStatusMessage(String deploymentStatusMessage) {
        setDeploymentStatusMessage(deploymentStatusMessage);
        return this;
    }

    /**
     * <p>
     * The name of the environment that the service instance was deployed into.
     * </p>
     * 
     * @param environmentName
     *        The name of the environment that the service instance was deployed into.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of the environment that the service instance was deployed into.
     * </p>
     * 
     * @return The name of the environment that the service instance was deployed into.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * The name of the environment that the service instance was deployed into.
     * </p>
     * 
     * @param environmentName
     *        The name of the environment that the service instance was deployed into.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceInstance withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * The time when a deployment of the service instance was last attempted.
     * </p>
     * 
     * @param lastDeploymentAttemptedAt
     *        The time when a deployment of the service instance was last attempted.
     */

    public void setLastDeploymentAttemptedAt(java.util.Date lastDeploymentAttemptedAt) {
        this.lastDeploymentAttemptedAt = lastDeploymentAttemptedAt;
    }

    /**
     * <p>
     * The time when a deployment of the service instance was last attempted.
     * </p>
     * 
     * @return The time when a deployment of the service instance was last attempted.
     */

    public java.util.Date getLastDeploymentAttemptedAt() {
        return this.lastDeploymentAttemptedAt;
    }

    /**
     * <p>
     * The time when a deployment of the service instance was last attempted.
     * </p>
     * 
     * @param lastDeploymentAttemptedAt
     *        The time when a deployment of the service instance was last attempted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceInstance withLastDeploymentAttemptedAt(java.util.Date lastDeploymentAttemptedAt) {
        setLastDeploymentAttemptedAt(lastDeploymentAttemptedAt);
        return this;
    }

    /**
     * <p>
     * The time when the service instance was last deployed successfully.
     * </p>
     * 
     * @param lastDeploymentSucceededAt
     *        The time when the service instance was last deployed successfully.
     */

    public void setLastDeploymentSucceededAt(java.util.Date lastDeploymentSucceededAt) {
        this.lastDeploymentSucceededAt = lastDeploymentSucceededAt;
    }

    /**
     * <p>
     * The time when the service instance was last deployed successfully.
     * </p>
     * 
     * @return The time when the service instance was last deployed successfully.
     */

    public java.util.Date getLastDeploymentSucceededAt() {
        return this.lastDeploymentSucceededAt;
    }

    /**
     * <p>
     * The time when the service instance was last deployed successfully.
     * </p>
     * 
     * @param lastDeploymentSucceededAt
     *        The time when the service instance was last deployed successfully.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceInstance withLastDeploymentSucceededAt(java.util.Date lastDeploymentSucceededAt) {
        setLastDeploymentSucceededAt(lastDeploymentSucceededAt);
        return this;
    }

    /**
     * <p>
     * The name of the service instance.
     * </p>
     * 
     * @param name
     *        The name of the service instance.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the service instance.
     * </p>
     * 
     * @return The name of the service instance.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the service instance.
     * </p>
     * 
     * @param name
     *        The name of the service instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceInstance withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the service that the service instance belongs to.
     * </p>
     * 
     * @param serviceName
     *        The name of the service that the service instance belongs to.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the service that the service instance belongs to.
     * </p>
     * 
     * @return The name of the service that the service instance belongs to.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the service that the service instance belongs to.
     * </p>
     * 
     * @param serviceName
     *        The name of the service that the service instance belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceInstance withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * The service spec that was used to create the service instance.
     * </p>
     * 
     * @param spec
     *        The service spec that was used to create the service instance.
     */

    public void setSpec(String spec) {
        this.spec = spec;
    }

    /**
     * <p>
     * The service spec that was used to create the service instance.
     * </p>
     * 
     * @return The service spec that was used to create the service instance.
     */

    public String getSpec() {
        return this.spec;
    }

    /**
     * <p>
     * The service spec that was used to create the service instance.
     * </p>
     * 
     * @param spec
     *        The service spec that was used to create the service instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceInstance withSpec(String spec) {
        setSpec(spec);
        return this;
    }

    /**
     * <p>
     * The ID of the major version of the service template that was used to create the service instance.
     * </p>
     * 
     * @param templateMajorVersion
     *        The ID of the major version of the service template that was used to create the service instance.
     */

    public void setTemplateMajorVersion(String templateMajorVersion) {
        this.templateMajorVersion = templateMajorVersion;
    }

    /**
     * <p>
     * The ID of the major version of the service template that was used to create the service instance.
     * </p>
     * 
     * @return The ID of the major version of the service template that was used to create the service instance.
     */

    public String getTemplateMajorVersion() {
        return this.templateMajorVersion;
    }

    /**
     * <p>
     * The ID of the major version of the service template that was used to create the service instance.
     * </p>
     * 
     * @param templateMajorVersion
     *        The ID of the major version of the service template that was used to create the service instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceInstance withTemplateMajorVersion(String templateMajorVersion) {
        setTemplateMajorVersion(templateMajorVersion);
        return this;
    }

    /**
     * <p>
     * The ID of the minor version of the service template that was used to create the service instance.
     * </p>
     * 
     * @param templateMinorVersion
     *        The ID of the minor version of the service template that was used to create the service instance.
     */

    public void setTemplateMinorVersion(String templateMinorVersion) {
        this.templateMinorVersion = templateMinorVersion;
    }

    /**
     * <p>
     * The ID of the minor version of the service template that was used to create the service instance.
     * </p>
     * 
     * @return The ID of the minor version of the service template that was used to create the service instance.
     */

    public String getTemplateMinorVersion() {
        return this.templateMinorVersion;
    }

    /**
     * <p>
     * The ID of the minor version of the service template that was used to create the service instance.
     * </p>
     * 
     * @param templateMinorVersion
     *        The ID of the minor version of the service template that was used to create the service instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceInstance withTemplateMinorVersion(String templateMinorVersion) {
        setTemplateMinorVersion(templateMinorVersion);
        return this;
    }

    /**
     * <p>
     * The name of the service template that was used to create the service instance.
     * </p>
     * 
     * @param templateName
     *        The name of the service template that was used to create the service instance.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the service template that was used to create the service instance.
     * </p>
     * 
     * @return The name of the service template that was used to create the service instance.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the service template that was used to create the service instance.
     * </p>
     * 
     * @param templateName
     *        The name of the service template that was used to create the service instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceInstance withTemplateName(String templateName) {
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
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName()).append(",");
        if (getLastDeploymentAttemptedAt() != null)
            sb.append("LastDeploymentAttemptedAt: ").append(getLastDeploymentAttemptedAt()).append(",");
        if (getLastDeploymentSucceededAt() != null)
            sb.append("LastDeploymentSucceededAt: ").append(getLastDeploymentSucceededAt()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
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

        if (obj instanceof ServiceInstance == false)
            return false;
        ServiceInstance other = (ServiceInstance) obj;
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
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
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
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
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
        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getLastDeploymentAttemptedAt() == null) ? 0 : getLastDeploymentAttemptedAt().hashCode());
        hashCode = prime * hashCode + ((getLastDeploymentSucceededAt() == null) ? 0 : getLastDeploymentSucceededAt().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getSpec() == null) ? 0 : getSpec().hashCode());
        hashCode = prime * hashCode + ((getTemplateMajorVersion() == null) ? 0 : getTemplateMajorVersion().hashCode());
        hashCode = prime * hashCode + ((getTemplateMinorVersion() == null) ? 0 : getTemplateMinorVersion().hashCode());
        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        return hashCode;
    }

    @Override
    public ServiceInstance clone() {
        try {
            return (ServiceInstance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.proton.model.transform.ServiceInstanceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
