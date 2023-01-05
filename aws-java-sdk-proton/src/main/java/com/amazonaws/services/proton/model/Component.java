/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Detailed data of an Proton component resource.
 * </p>
 * <p>
 * For more information about components, see <a
 * href="https://docs.aws.amazon.com/proton/latest/userguide/ag-components.html">Proton components</a> in the <i>Proton
 * User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/Component" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Component implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The time when the component was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The component deployment status.
     * </p>
     */
    private String deploymentStatus;
    /**
     * <p>
     * The message associated with the component deployment status.
     * </p>
     */
    private String deploymentStatusMessage;
    /**
     * <p>
     * A description of the component.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the Proton environment that this component is associated with.
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * The time when a deployment of the component was last attempted.
     * </p>
     */
    private java.util.Date lastDeploymentAttemptedAt;
    /**
     * <p>
     * The time when the component was last deployed successfully.
     * </p>
     */
    private java.util.Date lastDeploymentSucceededAt;
    /**
     * <p>
     * The time when the component was last modified.
     * </p>
     */
    private java.util.Date lastModifiedAt;
    /**
     * <p>
     * The name of the component.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the service instance that this component is attached to. Provided when a component is attached to a
     * service instance.
     * </p>
     */
    private String serviceInstanceName;
    /**
     * <p>
     * The name of the service that <code>serviceInstanceName</code> is associated with. Provided when a component is
     * attached to a service instance.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * The service spec that the component uses to access service inputs. Provided when a component is attached to a
     * service instance.
     * </p>
     */
    private String serviceSpec;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the component.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the component.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The time when the component was created.
     * </p>
     * 
     * @param createdAt
     *        The time when the component was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time when the component was created.
     * </p>
     * 
     * @return The time when the component was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time when the component was created.
     * </p>
     * 
     * @param createdAt
     *        The time when the component was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The component deployment status.
     * </p>
     * 
     * @param deploymentStatus
     *        The component deployment status.
     * @see DeploymentStatus
     */

    public void setDeploymentStatus(String deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
    }

    /**
     * <p>
     * The component deployment status.
     * </p>
     * 
     * @return The component deployment status.
     * @see DeploymentStatus
     */

    public String getDeploymentStatus() {
        return this.deploymentStatus;
    }

    /**
     * <p>
     * The component deployment status.
     * </p>
     * 
     * @param deploymentStatus
     *        The component deployment status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentStatus
     */

    public Component withDeploymentStatus(String deploymentStatus) {
        setDeploymentStatus(deploymentStatus);
        return this;
    }

    /**
     * <p>
     * The component deployment status.
     * </p>
     * 
     * @param deploymentStatus
     *        The component deployment status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentStatus
     */

    public Component withDeploymentStatus(DeploymentStatus deploymentStatus) {
        this.deploymentStatus = deploymentStatus.toString();
        return this;
    }

    /**
     * <p>
     * The message associated with the component deployment status.
     * </p>
     * 
     * @param deploymentStatusMessage
     *        The message associated with the component deployment status.
     */

    public void setDeploymentStatusMessage(String deploymentStatusMessage) {
        this.deploymentStatusMessage = deploymentStatusMessage;
    }

    /**
     * <p>
     * The message associated with the component deployment status.
     * </p>
     * 
     * @return The message associated with the component deployment status.
     */

    public String getDeploymentStatusMessage() {
        return this.deploymentStatusMessage;
    }

    /**
     * <p>
     * The message associated with the component deployment status.
     * </p>
     * 
     * @param deploymentStatusMessage
     *        The message associated with the component deployment status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withDeploymentStatusMessage(String deploymentStatusMessage) {
        setDeploymentStatusMessage(deploymentStatusMessage);
        return this;
    }

    /**
     * <p>
     * A description of the component.
     * </p>
     * 
     * @param description
     *        A description of the component.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the component.
     * </p>
     * 
     * @return A description of the component.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the component.
     * </p>
     * 
     * @param description
     *        A description of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the Proton environment that this component is associated with.
     * </p>
     * 
     * @param environmentName
     *        The name of the Proton environment that this component is associated with.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of the Proton environment that this component is associated with.
     * </p>
     * 
     * @return The name of the Proton environment that this component is associated with.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * The name of the Proton environment that this component is associated with.
     * </p>
     * 
     * @param environmentName
     *        The name of the Proton environment that this component is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * The time when a deployment of the component was last attempted.
     * </p>
     * 
     * @param lastDeploymentAttemptedAt
     *        The time when a deployment of the component was last attempted.
     */

    public void setLastDeploymentAttemptedAt(java.util.Date lastDeploymentAttemptedAt) {
        this.lastDeploymentAttemptedAt = lastDeploymentAttemptedAt;
    }

    /**
     * <p>
     * The time when a deployment of the component was last attempted.
     * </p>
     * 
     * @return The time when a deployment of the component was last attempted.
     */

    public java.util.Date getLastDeploymentAttemptedAt() {
        return this.lastDeploymentAttemptedAt;
    }

    /**
     * <p>
     * The time when a deployment of the component was last attempted.
     * </p>
     * 
     * @param lastDeploymentAttemptedAt
     *        The time when a deployment of the component was last attempted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withLastDeploymentAttemptedAt(java.util.Date lastDeploymentAttemptedAt) {
        setLastDeploymentAttemptedAt(lastDeploymentAttemptedAt);
        return this;
    }

    /**
     * <p>
     * The time when the component was last deployed successfully.
     * </p>
     * 
     * @param lastDeploymentSucceededAt
     *        The time when the component was last deployed successfully.
     */

    public void setLastDeploymentSucceededAt(java.util.Date lastDeploymentSucceededAt) {
        this.lastDeploymentSucceededAt = lastDeploymentSucceededAt;
    }

    /**
     * <p>
     * The time when the component was last deployed successfully.
     * </p>
     * 
     * @return The time when the component was last deployed successfully.
     */

    public java.util.Date getLastDeploymentSucceededAt() {
        return this.lastDeploymentSucceededAt;
    }

    /**
     * <p>
     * The time when the component was last deployed successfully.
     * </p>
     * 
     * @param lastDeploymentSucceededAt
     *        The time when the component was last deployed successfully.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withLastDeploymentSucceededAt(java.util.Date lastDeploymentSucceededAt) {
        setLastDeploymentSucceededAt(lastDeploymentSucceededAt);
        return this;
    }

    /**
     * <p>
     * The time when the component was last modified.
     * </p>
     * 
     * @param lastModifiedAt
     *        The time when the component was last modified.
     */

    public void setLastModifiedAt(java.util.Date lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    /**
     * <p>
     * The time when the component was last modified.
     * </p>
     * 
     * @return The time when the component was last modified.
     */

    public java.util.Date getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     * <p>
     * The time when the component was last modified.
     * </p>
     * 
     * @param lastModifiedAt
     *        The time when the component was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withLastModifiedAt(java.util.Date lastModifiedAt) {
        setLastModifiedAt(lastModifiedAt);
        return this;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * 
     * @param name
     *        The name of the component.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * 
     * @return The name of the component.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the component.
     * </p>
     * 
     * @param name
     *        The name of the component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the service instance that this component is attached to. Provided when a component is attached to a
     * service instance.
     * </p>
     * 
     * @param serviceInstanceName
     *        The name of the service instance that this component is attached to. Provided when a component is attached
     *        to a service instance.
     */

    public void setServiceInstanceName(String serviceInstanceName) {
        this.serviceInstanceName = serviceInstanceName;
    }

    /**
     * <p>
     * The name of the service instance that this component is attached to. Provided when a component is attached to a
     * service instance.
     * </p>
     * 
     * @return The name of the service instance that this component is attached to. Provided when a component is
     *         attached to a service instance.
     */

    public String getServiceInstanceName() {
        return this.serviceInstanceName;
    }

    /**
     * <p>
     * The name of the service instance that this component is attached to. Provided when a component is attached to a
     * service instance.
     * </p>
     * 
     * @param serviceInstanceName
     *        The name of the service instance that this component is attached to. Provided when a component is attached
     *        to a service instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withServiceInstanceName(String serviceInstanceName) {
        setServiceInstanceName(serviceInstanceName);
        return this;
    }

    /**
     * <p>
     * The name of the service that <code>serviceInstanceName</code> is associated with. Provided when a component is
     * attached to a service instance.
     * </p>
     * 
     * @param serviceName
     *        The name of the service that <code>serviceInstanceName</code> is associated with. Provided when a
     *        component is attached to a service instance.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the service that <code>serviceInstanceName</code> is associated with. Provided when a component is
     * attached to a service instance.
     * </p>
     * 
     * @return The name of the service that <code>serviceInstanceName</code> is associated with. Provided when a
     *         component is attached to a service instance.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the service that <code>serviceInstanceName</code> is associated with. Provided when a component is
     * attached to a service instance.
     * </p>
     * 
     * @param serviceName
     *        The name of the service that <code>serviceInstanceName</code> is associated with. Provided when a
     *        component is attached to a service instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * The service spec that the component uses to access service inputs. Provided when a component is attached to a
     * service instance.
     * </p>
     * 
     * @param serviceSpec
     *        The service spec that the component uses to access service inputs. Provided when a component is attached
     *        to a service instance.
     */

    public void setServiceSpec(String serviceSpec) {
        this.serviceSpec = serviceSpec;
    }

    /**
     * <p>
     * The service spec that the component uses to access service inputs. Provided when a component is attached to a
     * service instance.
     * </p>
     * 
     * @return The service spec that the component uses to access service inputs. Provided when a component is attached
     *         to a service instance.
     */

    public String getServiceSpec() {
        return this.serviceSpec;
    }

    /**
     * <p>
     * The service spec that the component uses to access service inputs. Provided when a component is attached to a
     * service instance.
     * </p>
     * 
     * @param serviceSpec
     *        The service spec that the component uses to access service inputs. Provided when a component is attached
     *        to a service instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Component withServiceSpec(String serviceSpec) {
        setServiceSpec(serviceSpec);
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
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName()).append(",");
        if (getLastDeploymentAttemptedAt() != null)
            sb.append("LastDeploymentAttemptedAt: ").append(getLastDeploymentAttemptedAt()).append(",");
        if (getLastDeploymentSucceededAt() != null)
            sb.append("LastDeploymentSucceededAt: ").append(getLastDeploymentSucceededAt()).append(",");
        if (getLastModifiedAt() != null)
            sb.append("LastModifiedAt: ").append(getLastModifiedAt()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getServiceInstanceName() != null)
            sb.append("ServiceInstanceName: ").append(getServiceInstanceName()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getServiceSpec() != null)
            sb.append("ServiceSpec: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Component == false)
            return false;
        Component other = (Component) obj;
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
        if (other.getLastModifiedAt() == null ^ this.getLastModifiedAt() == null)
            return false;
        if (other.getLastModifiedAt() != null && other.getLastModifiedAt().equals(this.getLastModifiedAt()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getServiceInstanceName() == null ^ this.getServiceInstanceName() == null)
            return false;
        if (other.getServiceInstanceName() != null && other.getServiceInstanceName().equals(this.getServiceInstanceName()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getServiceSpec() == null ^ this.getServiceSpec() == null)
            return false;
        if (other.getServiceSpec() != null && other.getServiceSpec().equals(this.getServiceSpec()) == false)
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
        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getLastDeploymentAttemptedAt() == null) ? 0 : getLastDeploymentAttemptedAt().hashCode());
        hashCode = prime * hashCode + ((getLastDeploymentSucceededAt() == null) ? 0 : getLastDeploymentSucceededAt().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedAt() == null) ? 0 : getLastModifiedAt().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getServiceInstanceName() == null) ? 0 : getServiceInstanceName().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getServiceSpec() == null) ? 0 : getServiceSpec().hashCode());
        return hashCode;
    }

    @Override
    public Component clone() {
        try {
            return (Component) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.proton.model.transform.ComponentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
