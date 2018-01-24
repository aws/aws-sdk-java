/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/RegisterInstance" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the service that you want to use for settings for the resource record sets and health check that Amazon
     * Route 53 will create.
     * </p>
     */
    private String serviceId;
    /**
     * <p>
     * An identifier that you want to associate with the instance. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can use this value to update an existing instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * To register a new instance, you must specify a value that is unique among instances that you register by using
     * the same service.
     * </p>
     * </li>
     * </ul>
     */
    private String instanceId;
    /**
     * <p>
     * An optional parameter that you can use to resolve concurrent creation requests. <code>CreatorRequestId</code>
     * helps to determine if a specific client owns the namespace.
     * </p>
     */
    private String creatorRequestId;
    /**
     * <p>
     * A string map that contain attribute keys and values. Supported attribute keys include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_INSTANCE_PORT</code>: The port on the endpoint that you want Amazon Route 53 to perform health checks
     * on. This value is also used for the port value in an SRV record if the service that you specify includes an SRV
     * record. For more information, see <a>CreateService</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_INSTANCE_IPV4</code>: If the service that you specify contains a resource record set template for an A
     * record, the IPv4 address that you want Amazon Route 53 to use for the value of the A record.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_INSTANCE_IPV6</code>: If the service that you specify contains a resource record set template for an
     * AAAA record, the IPv6 address that you want Amazon Route 53 to use for the value of the AAAA record.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> attributes;

    /**
     * <p>
     * The ID of the service that you want to use for settings for the resource record sets and health check that Amazon
     * Route 53 will create.
     * </p>
     * 
     * @param serviceId
     *        The ID of the service that you want to use for settings for the resource record sets and health check that
     *        Amazon Route 53 will create.
     */

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * <p>
     * The ID of the service that you want to use for settings for the resource record sets and health check that Amazon
     * Route 53 will create.
     * </p>
     * 
     * @return The ID of the service that you want to use for settings for the resource record sets and health check
     *         that Amazon Route 53 will create.
     */

    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * <p>
     * The ID of the service that you want to use for settings for the resource record sets and health check that Amazon
     * Route 53 will create.
     * </p>
     * 
     * @param serviceId
     *        The ID of the service that you want to use for settings for the resource record sets and health check that
     *        Amazon Route 53 will create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterInstanceRequest withServiceId(String serviceId) {
        setServiceId(serviceId);
        return this;
    }

    /**
     * <p>
     * An identifier that you want to associate with the instance. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can use this value to update an existing instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * To register a new instance, you must specify a value that is unique among instances that you register by using
     * the same service.
     * </p>
     * </li>
     * </ul>
     * 
     * @param instanceId
     *        An identifier that you want to associate with the instance. Note the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        You can use this value to update an existing instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To register a new instance, you must specify a value that is unique among instances that you register by
     *        using the same service.
     *        </p>
     *        </li>
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * An identifier that you want to associate with the instance. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can use this value to update an existing instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * To register a new instance, you must specify a value that is unique among instances that you register by using
     * the same service.
     * </p>
     * </li>
     * </ul>
     * 
     * @return An identifier that you want to associate with the instance. Note the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You can use this value to update an existing instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To register a new instance, you must specify a value that is unique among instances that you register by
     *         using the same service.
     *         </p>
     *         </li>
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * An identifier that you want to associate with the instance. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can use this value to update an existing instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * To register a new instance, you must specify a value that is unique among instances that you register by using
     * the same service.
     * </p>
     * </li>
     * </ul>
     * 
     * @param instanceId
     *        An identifier that you want to associate with the instance. Note the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        You can use this value to update an existing instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        To register a new instance, you must specify a value that is unique among instances that you register by
     *        using the same service.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterInstanceRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * An optional parameter that you can use to resolve concurrent creation requests. <code>CreatorRequestId</code>
     * helps to determine if a specific client owns the namespace.
     * </p>
     * 
     * @param creatorRequestId
     *        An optional parameter that you can use to resolve concurrent creation requests.
     *        <code>CreatorRequestId</code> helps to determine if a specific client owns the namespace.
     */

    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * <p>
     * An optional parameter that you can use to resolve concurrent creation requests. <code>CreatorRequestId</code>
     * helps to determine if a specific client owns the namespace.
     * </p>
     * 
     * @return An optional parameter that you can use to resolve concurrent creation requests.
     *         <code>CreatorRequestId</code> helps to determine if a specific client owns the namespace.
     */

    public String getCreatorRequestId() {
        return this.creatorRequestId;
    }

    /**
     * <p>
     * An optional parameter that you can use to resolve concurrent creation requests. <code>CreatorRequestId</code>
     * helps to determine if a specific client owns the namespace.
     * </p>
     * 
     * @param creatorRequestId
     *        An optional parameter that you can use to resolve concurrent creation requests.
     *        <code>CreatorRequestId</code> helps to determine if a specific client owns the namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterInstanceRequest withCreatorRequestId(String creatorRequestId) {
        setCreatorRequestId(creatorRequestId);
        return this;
    }

    /**
     * <p>
     * A string map that contain attribute keys and values. Supported attribute keys include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_INSTANCE_PORT</code>: The port on the endpoint that you want Amazon Route 53 to perform health checks
     * on. This value is also used for the port value in an SRV record if the service that you specify includes an SRV
     * record. For more information, see <a>CreateService</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_INSTANCE_IPV4</code>: If the service that you specify contains a resource record set template for an A
     * record, the IPv4 address that you want Amazon Route 53 to use for the value of the A record.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_INSTANCE_IPV6</code>: If the service that you specify contains a resource record set template for an
     * AAAA record, the IPv6 address that you want Amazon Route 53 to use for the value of the AAAA record.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A string map that contain attribute keys and values. Supported attribute keys include the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AWS_INSTANCE_PORT</code>: The port on the endpoint that you want Amazon Route 53 to perform health
     *         checks on. This value is also used for the port value in an SRV record if the service that you specify
     *         includes an SRV record. For more information, see <a>CreateService</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS_INSTANCE_IPV4</code>: If the service that you specify contains a resource record set template
     *         for an A record, the IPv4 address that you want Amazon Route 53 to use for the value of the A record.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS_INSTANCE_IPV6</code>: If the service that you specify contains a resource record set template
     *         for an AAAA record, the IPv6 address that you want Amazon Route 53 to use for the value of the AAAA
     *         record.
     *         </p>
     *         </li>
     */

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * A string map that contain attribute keys and values. Supported attribute keys include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_INSTANCE_PORT</code>: The port on the endpoint that you want Amazon Route 53 to perform health checks
     * on. This value is also used for the port value in an SRV record if the service that you specify includes an SRV
     * record. For more information, see <a>CreateService</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_INSTANCE_IPV4</code>: If the service that you specify contains a resource record set template for an A
     * record, the IPv4 address that you want Amazon Route 53 to use for the value of the A record.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_INSTANCE_IPV6</code>: If the service that you specify contains a resource record set template for an
     * AAAA record, the IPv6 address that you want Amazon Route 53 to use for the value of the AAAA record.
     * </p>
     * </li>
     * </ul>
     * 
     * @param attributes
     *        A string map that contain attribute keys and values. Supported attribute keys include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AWS_INSTANCE_PORT</code>: The port on the endpoint that you want Amazon Route 53 to perform health
     *        checks on. This value is also used for the port value in an SRV record if the service that you specify
     *        includes an SRV record. For more information, see <a>CreateService</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS_INSTANCE_IPV4</code>: If the service that you specify contains a resource record set template
     *        for an A record, the IPv4 address that you want Amazon Route 53 to use for the value of the A record.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS_INSTANCE_IPV6</code>: If the service that you specify contains a resource record set template
     *        for an AAAA record, the IPv6 address that you want Amazon Route 53 to use for the value of the AAAA
     *        record.
     *        </p>
     *        </li>
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * A string map that contain attribute keys and values. Supported attribute keys include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_INSTANCE_PORT</code>: The port on the endpoint that you want Amazon Route 53 to perform health checks
     * on. This value is also used for the port value in an SRV record if the service that you specify includes an SRV
     * record. For more information, see <a>CreateService</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_INSTANCE_IPV4</code>: If the service that you specify contains a resource record set template for an A
     * record, the IPv4 address that you want Amazon Route 53 to use for the value of the A record.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_INSTANCE_IPV6</code>: If the service that you specify contains a resource record set template for an
     * AAAA record, the IPv6 address that you want Amazon Route 53 to use for the value of the AAAA record.
     * </p>
     * </li>
     * </ul>
     * 
     * @param attributes
     *        A string map that contain attribute keys and values. Supported attribute keys include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AWS_INSTANCE_PORT</code>: The port on the endpoint that you want Amazon Route 53 to perform health
     *        checks on. This value is also used for the port value in an SRV record if the service that you specify
     *        includes an SRV record. For more information, see <a>CreateService</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS_INSTANCE_IPV4</code>: If the service that you specify contains a resource record set template
     *        for an A record, the IPv4 address that you want Amazon Route 53 to use for the value of the A record.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS_INSTANCE_IPV6</code>: If the service that you specify contains a resource record set template
     *        for an AAAA record, the IPv6 address that you want Amazon Route 53 to use for the value of the AAAA
     *        record.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterInstanceRequest withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    public RegisterInstanceRequest addAttributesEntry(String key, String value) {
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

    public RegisterInstanceRequest clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
        if (getCreatorRequestId() != null)
            sb.append("CreatorRequestId: ").append(getCreatorRequestId()).append(",");
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

        if (obj instanceof RegisterInstanceRequest == false)
            return false;
        RegisterInstanceRequest other = (RegisterInstanceRequest) obj;
        if (other.getServiceId() == null ^ this.getServiceId() == null)
            return false;
        if (other.getServiceId() != null && other.getServiceId().equals(this.getServiceId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getCreatorRequestId() == null ^ this.getCreatorRequestId() == null)
            return false;
        if (other.getCreatorRequestId() != null && other.getCreatorRequestId().equals(this.getCreatorRequestId()) == false)
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

        hashCode = prime * hashCode + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getCreatorRequestId() == null) ? 0 : getCreatorRequestId().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public RegisterInstanceRequest clone() {
        return (RegisterInstanceRequest) super.clone();
    }

}
