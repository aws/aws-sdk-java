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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CreateContainerServiceDeployment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateContainerServiceDeploymentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the container service for which to create the deployment.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * An object that describes the settings of the containers that will be launched on the container service.
     * </p>
     */
    private java.util.Map<String, Container> containers;
    /**
     * <p>
     * An object that describes the settings of the public endpoint for the container service.
     * </p>
     */
    private EndpointRequest publicEndpoint;

    /**
     * <p>
     * The name of the container service for which to create the deployment.
     * </p>
     * 
     * @param serviceName
     *        The name of the container service for which to create the deployment.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the container service for which to create the deployment.
     * </p>
     * 
     * @return The name of the container service for which to create the deployment.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the container service for which to create the deployment.
     * </p>
     * 
     * @param serviceName
     *        The name of the container service for which to create the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContainerServiceDeploymentRequest withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * An object that describes the settings of the containers that will be launched on the container service.
     * </p>
     * 
     * @return An object that describes the settings of the containers that will be launched on the container service.
     */

    public java.util.Map<String, Container> getContainers() {
        return containers;
    }

    /**
     * <p>
     * An object that describes the settings of the containers that will be launched on the container service.
     * </p>
     * 
     * @param containers
     *        An object that describes the settings of the containers that will be launched on the container service.
     */

    public void setContainers(java.util.Map<String, Container> containers) {
        this.containers = containers;
    }

    /**
     * <p>
     * An object that describes the settings of the containers that will be launched on the container service.
     * </p>
     * 
     * @param containers
     *        An object that describes the settings of the containers that will be launched on the container service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContainerServiceDeploymentRequest withContainers(java.util.Map<String, Container> containers) {
        setContainers(containers);
        return this;
    }

    /**
     * Add a single Containers entry
     *
     * @see CreateContainerServiceDeploymentRequest#withContainers
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateContainerServiceDeploymentRequest addContainersEntry(String key, Container value) {
        if (null == this.containers) {
            this.containers = new java.util.HashMap<String, Container>();
        }
        if (this.containers.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.containers.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Containers.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContainerServiceDeploymentRequest clearContainersEntries() {
        this.containers = null;
        return this;
    }

    /**
     * <p>
     * An object that describes the settings of the public endpoint for the container service.
     * </p>
     * 
     * @param publicEndpoint
     *        An object that describes the settings of the public endpoint for the container service.
     */

    public void setPublicEndpoint(EndpointRequest publicEndpoint) {
        this.publicEndpoint = publicEndpoint;
    }

    /**
     * <p>
     * An object that describes the settings of the public endpoint for the container service.
     * </p>
     * 
     * @return An object that describes the settings of the public endpoint for the container service.
     */

    public EndpointRequest getPublicEndpoint() {
        return this.publicEndpoint;
    }

    /**
     * <p>
     * An object that describes the settings of the public endpoint for the container service.
     * </p>
     * 
     * @param publicEndpoint
     *        An object that describes the settings of the public endpoint for the container service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateContainerServiceDeploymentRequest withPublicEndpoint(EndpointRequest publicEndpoint) {
        setPublicEndpoint(publicEndpoint);
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
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getContainers() != null)
            sb.append("Containers: ").append(getContainers()).append(",");
        if (getPublicEndpoint() != null)
            sb.append("PublicEndpoint: ").append(getPublicEndpoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateContainerServiceDeploymentRequest == false)
            return false;
        CreateContainerServiceDeploymentRequest other = (CreateContainerServiceDeploymentRequest) obj;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getContainers() == null ^ this.getContainers() == null)
            return false;
        if (other.getContainers() != null && other.getContainers().equals(this.getContainers()) == false)
            return false;
        if (other.getPublicEndpoint() == null ^ this.getPublicEndpoint() == null)
            return false;
        if (other.getPublicEndpoint() != null && other.getPublicEndpoint().equals(this.getPublicEndpoint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getContainers() == null) ? 0 : getContainers().hashCode());
        hashCode = prime * hashCode + ((getPublicEndpoint() == null) ? 0 : getPublicEndpoint().hashCode());
        return hashCode;
    }

    @Override
    public CreateContainerServiceDeploymentRequest clone() {
        return (CreateContainerServiceDeploymentRequest) super.clone();
    }

}
