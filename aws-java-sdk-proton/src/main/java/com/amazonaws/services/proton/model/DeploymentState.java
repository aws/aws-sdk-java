/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The detailed data about the current state of the deployment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/DeploymentState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentState implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The state of the component associated with the deployment.
     * </p>
     */
    private ComponentState component;
    /**
     * <p>
     * The state of the environment associated with the deployment.
     * </p>
     */
    private EnvironmentState environment;
    /**
     * <p>
     * The state of the service instance associated with the deployment.
     * </p>
     */
    private ServiceInstanceState serviceInstance;
    /**
     * <p>
     * The state of the service pipeline associated with the deployment.
     * </p>
     */
    private ServicePipelineState servicePipeline;

    /**
     * <p>
     * The state of the component associated with the deployment.
     * </p>
     * 
     * @param component
     *        The state of the component associated with the deployment.
     */

    public void setComponent(ComponentState component) {
        this.component = component;
    }

    /**
     * <p>
     * The state of the component associated with the deployment.
     * </p>
     * 
     * @return The state of the component associated with the deployment.
     */

    public ComponentState getComponent() {
        return this.component;
    }

    /**
     * <p>
     * The state of the component associated with the deployment.
     * </p>
     * 
     * @param component
     *        The state of the component associated with the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentState withComponent(ComponentState component) {
        setComponent(component);
        return this;
    }

    /**
     * <p>
     * The state of the environment associated with the deployment.
     * </p>
     * 
     * @param environment
     *        The state of the environment associated with the deployment.
     */

    public void setEnvironment(EnvironmentState environment) {
        this.environment = environment;
    }

    /**
     * <p>
     * The state of the environment associated with the deployment.
     * </p>
     * 
     * @return The state of the environment associated with the deployment.
     */

    public EnvironmentState getEnvironment() {
        return this.environment;
    }

    /**
     * <p>
     * The state of the environment associated with the deployment.
     * </p>
     * 
     * @param environment
     *        The state of the environment associated with the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentState withEnvironment(EnvironmentState environment) {
        setEnvironment(environment);
        return this;
    }

    /**
     * <p>
     * The state of the service instance associated with the deployment.
     * </p>
     * 
     * @param serviceInstance
     *        The state of the service instance associated with the deployment.
     */

    public void setServiceInstance(ServiceInstanceState serviceInstance) {
        this.serviceInstance = serviceInstance;
    }

    /**
     * <p>
     * The state of the service instance associated with the deployment.
     * </p>
     * 
     * @return The state of the service instance associated with the deployment.
     */

    public ServiceInstanceState getServiceInstance() {
        return this.serviceInstance;
    }

    /**
     * <p>
     * The state of the service instance associated with the deployment.
     * </p>
     * 
     * @param serviceInstance
     *        The state of the service instance associated with the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentState withServiceInstance(ServiceInstanceState serviceInstance) {
        setServiceInstance(serviceInstance);
        return this;
    }

    /**
     * <p>
     * The state of the service pipeline associated with the deployment.
     * </p>
     * 
     * @param servicePipeline
     *        The state of the service pipeline associated with the deployment.
     */

    public void setServicePipeline(ServicePipelineState servicePipeline) {
        this.servicePipeline = servicePipeline;
    }

    /**
     * <p>
     * The state of the service pipeline associated with the deployment.
     * </p>
     * 
     * @return The state of the service pipeline associated with the deployment.
     */

    public ServicePipelineState getServicePipeline() {
        return this.servicePipeline;
    }

    /**
     * <p>
     * The state of the service pipeline associated with the deployment.
     * </p>
     * 
     * @param servicePipeline
     *        The state of the service pipeline associated with the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentState withServicePipeline(ServicePipelineState servicePipeline) {
        setServicePipeline(servicePipeline);
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
        if (getComponent() != null)
            sb.append("Component: ").append(getComponent()).append(",");
        if (getEnvironment() != null)
            sb.append("Environment: ").append(getEnvironment()).append(",");
        if (getServiceInstance() != null)
            sb.append("ServiceInstance: ").append(getServiceInstance()).append(",");
        if (getServicePipeline() != null)
            sb.append("ServicePipeline: ").append(getServicePipeline());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentState == false)
            return false;
        DeploymentState other = (DeploymentState) obj;
        if (other.getComponent() == null ^ this.getComponent() == null)
            return false;
        if (other.getComponent() != null && other.getComponent().equals(this.getComponent()) == false)
            return false;
        if (other.getEnvironment() == null ^ this.getEnvironment() == null)
            return false;
        if (other.getEnvironment() != null && other.getEnvironment().equals(this.getEnvironment()) == false)
            return false;
        if (other.getServiceInstance() == null ^ this.getServiceInstance() == null)
            return false;
        if (other.getServiceInstance() != null && other.getServiceInstance().equals(this.getServiceInstance()) == false)
            return false;
        if (other.getServicePipeline() == null ^ this.getServicePipeline() == null)
            return false;
        if (other.getServicePipeline() != null && other.getServicePipeline().equals(this.getServicePipeline()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComponent() == null) ? 0 : getComponent().hashCode());
        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        hashCode = prime * hashCode + ((getServiceInstance() == null) ? 0 : getServiceInstance().hashCode());
        hashCode = prime * hashCode + ((getServicePipeline() == null) ? 0 : getServicePipeline().hashCode());
        return hashCode;
    }

    @Override
    public DeploymentState clone() {
        try {
            return (DeploymentState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.proton.model.transform.DeploymentStateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
