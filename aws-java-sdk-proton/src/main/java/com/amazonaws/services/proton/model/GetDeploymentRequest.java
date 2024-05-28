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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/proton-2020-07-20/GetDeployment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDeploymentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of a component that you want to get the detailed data for.
     * </p>
     */
    private String componentName;
    /**
     * <p>
     * The name of a environment that you want to get the detailed data for.
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * The ID of the deployment that you want to get the detailed data for.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the service instance associated with the given deployment ID. <code>serviceName</code> must be
     * specified to identify the service instance.
     * </p>
     */
    private String serviceInstanceName;
    /**
     * <p>
     * The name of the service associated with the given deployment ID.
     * </p>
     */
    private String serviceName;

    /**
     * <p>
     * The name of a component that you want to get the detailed data for.
     * </p>
     * 
     * @param componentName
     *        The name of a component that you want to get the detailed data for.
     */

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    /**
     * <p>
     * The name of a component that you want to get the detailed data for.
     * </p>
     * 
     * @return The name of a component that you want to get the detailed data for.
     */

    public String getComponentName() {
        return this.componentName;
    }

    /**
     * <p>
     * The name of a component that you want to get the detailed data for.
     * </p>
     * 
     * @param componentName
     *        The name of a component that you want to get the detailed data for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentRequest withComponentName(String componentName) {
        setComponentName(componentName);
        return this;
    }

    /**
     * <p>
     * The name of a environment that you want to get the detailed data for.
     * </p>
     * 
     * @param environmentName
     *        The name of a environment that you want to get the detailed data for.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of a environment that you want to get the detailed data for.
     * </p>
     * 
     * @return The name of a environment that you want to get the detailed data for.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * The name of a environment that you want to get the detailed data for.
     * </p>
     * 
     * @param environmentName
     *        The name of a environment that you want to get the detailed data for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentRequest withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * The ID of the deployment that you want to get the detailed data for.
     * </p>
     * 
     * @param id
     *        The ID of the deployment that you want to get the detailed data for.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the deployment that you want to get the detailed data for.
     * </p>
     * 
     * @return The ID of the deployment that you want to get the detailed data for.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the deployment that you want to get the detailed data for.
     * </p>
     * 
     * @param id
     *        The ID of the deployment that you want to get the detailed data for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the service instance associated with the given deployment ID. <code>serviceName</code> must be
     * specified to identify the service instance.
     * </p>
     * 
     * @param serviceInstanceName
     *        The name of the service instance associated with the given deployment ID. <code>serviceName</code> must be
     *        specified to identify the service instance.
     */

    public void setServiceInstanceName(String serviceInstanceName) {
        this.serviceInstanceName = serviceInstanceName;
    }

    /**
     * <p>
     * The name of the service instance associated with the given deployment ID. <code>serviceName</code> must be
     * specified to identify the service instance.
     * </p>
     * 
     * @return The name of the service instance associated with the given deployment ID. <code>serviceName</code> must
     *         be specified to identify the service instance.
     */

    public String getServiceInstanceName() {
        return this.serviceInstanceName;
    }

    /**
     * <p>
     * The name of the service instance associated with the given deployment ID. <code>serviceName</code> must be
     * specified to identify the service instance.
     * </p>
     * 
     * @param serviceInstanceName
     *        The name of the service instance associated with the given deployment ID. <code>serviceName</code> must be
     *        specified to identify the service instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentRequest withServiceInstanceName(String serviceInstanceName) {
        setServiceInstanceName(serviceInstanceName);
        return this;
    }

    /**
     * <p>
     * The name of the service associated with the given deployment ID.
     * </p>
     * 
     * @param serviceName
     *        The name of the service associated with the given deployment ID.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the service associated with the given deployment ID.
     * </p>
     * 
     * @return The name of the service associated with the given deployment ID.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the service associated with the given deployment ID.
     * </p>
     * 
     * @param serviceName
     *        The name of the service associated with the given deployment ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDeploymentRequest withServiceName(String serviceName) {
        setServiceName(serviceName);
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
        if (getComponentName() != null)
            sb.append("ComponentName: ").append(getComponentName()).append(",");
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getServiceInstanceName() != null)
            sb.append("ServiceInstanceName: ").append(getServiceInstanceName()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDeploymentRequest == false)
            return false;
        GetDeploymentRequest other = (GetDeploymentRequest) obj;
        if (other.getComponentName() == null ^ this.getComponentName() == null)
            return false;
        if (other.getComponentName() != null && other.getComponentName().equals(this.getComponentName()) == false)
            return false;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getServiceInstanceName() == null ^ this.getServiceInstanceName() == null)
            return false;
        if (other.getServiceInstanceName() != null && other.getServiceInstanceName().equals(this.getServiceInstanceName()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComponentName() == null) ? 0 : getComponentName().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getServiceInstanceName() == null) ? 0 : getServiceInstanceName().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        return hashCode;
    }

    @Override
    public GetDeploymentRequest clone() {
        return (GetDeploymentRequest) super.clone();
    }

}
