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
package com.amazonaws.services.servicediscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/UpdateInstanceCustomHealthStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateInstanceCustomHealthStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the service that includes the configuration for the custom health check that you want to change the
     * status for.
     * </p>
     */
    private String serviceId;
    /**
     * <p>
     * The ID of the instance that you want to change the health status for.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The new status of the instance, <code>HEALTHY</code> or <code>UNHEALTHY</code>.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The ID of the service that includes the configuration for the custom health check that you want to change the
     * status for.
     * </p>
     * 
     * @param serviceId
     *        The ID of the service that includes the configuration for the custom health check that you want to change
     *        the status for.
     */

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * <p>
     * The ID of the service that includes the configuration for the custom health check that you want to change the
     * status for.
     * </p>
     * 
     * @return The ID of the service that includes the configuration for the custom health check that you want to change
     *         the status for.
     */

    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * <p>
     * The ID of the service that includes the configuration for the custom health check that you want to change the
     * status for.
     * </p>
     * 
     * @param serviceId
     *        The ID of the service that includes the configuration for the custom health check that you want to change
     *        the status for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInstanceCustomHealthStatusRequest withServiceId(String serviceId) {
        setServiceId(serviceId);
        return this;
    }

    /**
     * <p>
     * The ID of the instance that you want to change the health status for.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance that you want to change the health status for.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance that you want to change the health status for.
     * </p>
     * 
     * @return The ID of the instance that you want to change the health status for.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance that you want to change the health status for.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance that you want to change the health status for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateInstanceCustomHealthStatusRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The new status of the instance, <code>HEALTHY</code> or <code>UNHEALTHY</code>.
     * </p>
     * 
     * @param status
     *        The new status of the instance, <code>HEALTHY</code> or <code>UNHEALTHY</code>.
     * @see CustomHealthStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The new status of the instance, <code>HEALTHY</code> or <code>UNHEALTHY</code>.
     * </p>
     * 
     * @return The new status of the instance, <code>HEALTHY</code> or <code>UNHEALTHY</code>.
     * @see CustomHealthStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The new status of the instance, <code>HEALTHY</code> or <code>UNHEALTHY</code>.
     * </p>
     * 
     * @param status
     *        The new status of the instance, <code>HEALTHY</code> or <code>UNHEALTHY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomHealthStatus
     */

    public UpdateInstanceCustomHealthStatusRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The new status of the instance, <code>HEALTHY</code> or <code>UNHEALTHY</code>.
     * </p>
     * 
     * @param status
     *        The new status of the instance, <code>HEALTHY</code> or <code>UNHEALTHY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CustomHealthStatus
     */

    public UpdateInstanceCustomHealthStatusRequest withStatus(CustomHealthStatus status) {
        this.status = status.toString();
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
        if (getServiceId() != null)
            sb.append("ServiceId: ").append(getServiceId()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateInstanceCustomHealthStatusRequest == false)
            return false;
        UpdateInstanceCustomHealthStatusRequest other = (UpdateInstanceCustomHealthStatusRequest) obj;
        if (other.getServiceId() == null ^ this.getServiceId() == null)
            return false;
        if (other.getServiceId() != null && other.getServiceId().equals(this.getServiceId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateInstanceCustomHealthStatusRequest clone() {
        return (UpdateInstanceCustomHealthStatusRequest) super.clone();
    }

}
