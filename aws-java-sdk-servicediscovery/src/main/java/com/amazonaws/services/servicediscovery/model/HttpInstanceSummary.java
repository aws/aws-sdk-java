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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * In a response to a <a>DiscoverInstance</a> request, <code>HttpInstanceSummary</code> contains information about one
 * instance that matches the values that you specified in the request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/HttpInstanceSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HttpInstanceSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of an instance that matches the values that you specified in the request.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The name of the namespace that you specified when you registered the instance.
     * </p>
     */
    private String namespaceName;
    /**
     * <p>
     * The name of the service that you specified when you registered the instance.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * If you configured health checking in the service, the current health status of the service instance.
     * </p>
     */
    private String healthStatus;
    /**
     * <p>
     * If you included any attributes when you registered the instance, the values of those attributes.
     * </p>
     */
    private java.util.Map<String, String> attributes;

    /**
     * <p>
     * The ID of an instance that matches the values that you specified in the request.
     * </p>
     * 
     * @param instanceId
     *        The ID of an instance that matches the values that you specified in the request.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of an instance that matches the values that you specified in the request.
     * </p>
     * 
     * @return The ID of an instance that matches the values that you specified in the request.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of an instance that matches the values that you specified in the request.
     * </p>
     * 
     * @param instanceId
     *        The ID of an instance that matches the values that you specified in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpInstanceSummary withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The name of the namespace that you specified when you registered the instance.
     * </p>
     * 
     * @param namespaceName
     *        The name of the namespace that you specified when you registered the instance.
     */

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    /**
     * <p>
     * The name of the namespace that you specified when you registered the instance.
     * </p>
     * 
     * @return The name of the namespace that you specified when you registered the instance.
     */

    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * <p>
     * The name of the namespace that you specified when you registered the instance.
     * </p>
     * 
     * @param namespaceName
     *        The name of the namespace that you specified when you registered the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpInstanceSummary withNamespaceName(String namespaceName) {
        setNamespaceName(namespaceName);
        return this;
    }

    /**
     * <p>
     * The name of the service that you specified when you registered the instance.
     * </p>
     * 
     * @param serviceName
     *        The name of the service that you specified when you registered the instance.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the service that you specified when you registered the instance.
     * </p>
     * 
     * @return The name of the service that you specified when you registered the instance.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the service that you specified when you registered the instance.
     * </p>
     * 
     * @param serviceName
     *        The name of the service that you specified when you registered the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpInstanceSummary withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * If you configured health checking in the service, the current health status of the service instance.
     * </p>
     * 
     * @param healthStatus
     *        If you configured health checking in the service, the current health status of the service instance.
     * @see HealthStatus
     */

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    /**
     * <p>
     * If you configured health checking in the service, the current health status of the service instance.
     * </p>
     * 
     * @return If you configured health checking in the service, the current health status of the service instance.
     * @see HealthStatus
     */

    public String getHealthStatus() {
        return this.healthStatus;
    }

    /**
     * <p>
     * If you configured health checking in the service, the current health status of the service instance.
     * </p>
     * 
     * @param healthStatus
     *        If you configured health checking in the service, the current health status of the service instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthStatus
     */

    public HttpInstanceSummary withHealthStatus(String healthStatus) {
        setHealthStatus(healthStatus);
        return this;
    }

    /**
     * <p>
     * If you configured health checking in the service, the current health status of the service instance.
     * </p>
     * 
     * @param healthStatus
     *        If you configured health checking in the service, the current health status of the service instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthStatus
     */

    public HttpInstanceSummary withHealthStatus(HealthStatus healthStatus) {
        this.healthStatus = healthStatus.toString();
        return this;
    }

    /**
     * <p>
     * If you included any attributes when you registered the instance, the values of those attributes.
     * </p>
     * 
     * @return If you included any attributes when you registered the instance, the values of those attributes.
     */

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * If you included any attributes when you registered the instance, the values of those attributes.
     * </p>
     * 
     * @param attributes
     *        If you included any attributes when you registered the instance, the values of those attributes.
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * If you included any attributes when you registered the instance, the values of those attributes.
     * </p>
     * 
     * @param attributes
     *        If you included any attributes when you registered the instance, the values of those attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpInstanceSummary withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    public HttpInstanceSummary addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpInstanceSummary clearAttributesEntries() {
        this.attributes = null;
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getNamespaceName() != null)
            sb.append("NamespaceName: ").append(getNamespaceName()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getHealthStatus() != null)
            sb.append("HealthStatus: ").append(getHealthStatus()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HttpInstanceSummary == false)
            return false;
        HttpInstanceSummary other = (HttpInstanceSummary) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getNamespaceName() == null ^ this.getNamespaceName() == null)
            return false;
        if (other.getNamespaceName() != null && other.getNamespaceName().equals(this.getNamespaceName()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getHealthStatus() == null ^ this.getHealthStatus() == null)
            return false;
        if (other.getHealthStatus() != null && other.getHealthStatus().equals(this.getHealthStatus()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getNamespaceName() == null) ? 0 : getNamespaceName().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getHealthStatus() == null) ? 0 : getHealthStatus().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public HttpInstanceSummary clone() {
        try {
            return (HttpInstanceSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicediscovery.model.transform.HttpInstanceSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
