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
 * A complex type that contains information about the instances that you registered by using a specified service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/InstanceSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID for an instance that you created by using a specified service.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A string map that contains the following information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The attributes that are associate with the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each attribute, the applicable value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Supported attribute keys include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_ALIAS_DNS_NAME</code>: For an alias record that routes traffic to an Elastic Load Balancing load
     * balancer, the DNS name that is associated with the load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_INSTANCE_CNAME</code>: For a CNAME record, the domain name that Route 53 returns in response to DNS
     * queries, for example, <code>example.com</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_INSTANCE_IPV4</code>: For an A record, the IPv4 address that Route 53 returns in response to DNS
     * queries, for example, <code>192.0.2.44</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_INSTANCE_IPV6</code>: For an AAAA record, the IPv6 address that Route 53 returns in response to DNS
     * queries, for example, <code>2001:0db8:85a3:0000:0000:abcd:0001:2345</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_INSTANCE_PORT</code>: For an SRV record, the value that Route 53 returns for the port. In addition, if
     * the service includes <code>HealthCheckConfig</code>, the port on the endpoint that Route 53 sends requests to.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> attributes;

    /**
     * <p>
     * The ID for an instance that you created by using a specified service.
     * </p>
     * 
     * @param id
     *        The ID for an instance that you created by using a specified service.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID for an instance that you created by using a specified service.
     * </p>
     * 
     * @return The ID for an instance that you created by using a specified service.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID for an instance that you created by using a specified service.
     * </p>
     * 
     * @param id
     *        The ID for an instance that you created by using a specified service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A string map that contains the following information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The attributes that are associate with the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each attribute, the applicable value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Supported attribute keys include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_ALIAS_DNS_NAME</code>: For an alias record that routes traffic to an Elastic Load Balancing load
     * balancer, the DNS name that is associated with the load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_INSTANCE_CNAME</code>: For a CNAME record, the domain name that Route 53 returns in response to DNS
     * queries, for example, <code>example.com</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_INSTANCE_IPV4</code>: For an A record, the IPv4 address that Route 53 returns in response to DNS
     * queries, for example, <code>192.0.2.44</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_INSTANCE_IPV6</code>: For an AAAA record, the IPv6 address that Route 53 returns in response to DNS
     * queries, for example, <code>2001:0db8:85a3:0000:0000:abcd:0001:2345</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_INSTANCE_PORT</code>: For an SRV record, the value that Route 53 returns for the port. In addition, if
     * the service includes <code>HealthCheckConfig</code>, the port on the endpoint that Route 53 sends requests to.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A string map that contains the following information:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The attributes that are associate with the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For each attribute, the applicable value.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Supported attribute keys include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AWS_ALIAS_DNS_NAME</code>: For an alias record that routes traffic to an Elastic Load Balancing
     *         load balancer, the DNS name that is associated with the load balancer.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS_INSTANCE_CNAME</code>: For a CNAME record, the domain name that Route 53 returns in response to
     *         DNS queries, for example, <code>example.com</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS_INSTANCE_IPV4</code>: For an A record, the IPv4 address that Route 53 returns in response to
     *         DNS queries, for example, <code>192.0.2.44</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS_INSTANCE_IPV6</code>: For an AAAA record, the IPv6 address that Route 53 returns in response to
     *         DNS queries, for example, <code>2001:0db8:85a3:0000:0000:abcd:0001:2345</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS_INSTANCE_PORT</code>: For an SRV record, the value that Route 53 returns for the port. In
     *         addition, if the service includes <code>HealthCheckConfig</code>, the port on the endpoint that Route 53
     *         sends requests to.
     *         </p>
     *         </li>
     */

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * A string map that contains the following information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The attributes that are associate with the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each attribute, the applicable value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Supported attribute keys include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_ALIAS_DNS_NAME</code>: For an alias record that routes traffic to an Elastic Load Balancing load
     * balancer, the DNS name that is associated with the load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_INSTANCE_CNAME</code>: For a CNAME record, the domain name that Route 53 returns in response to DNS
     * queries, for example, <code>example.com</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_INSTANCE_IPV4</code>: For an A record, the IPv4 address that Route 53 returns in response to DNS
     * queries, for example, <code>192.0.2.44</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_INSTANCE_IPV6</code>: For an AAAA record, the IPv6 address that Route 53 returns in response to DNS
     * queries, for example, <code>2001:0db8:85a3:0000:0000:abcd:0001:2345</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_INSTANCE_PORT</code>: For an SRV record, the value that Route 53 returns for the port. In addition, if
     * the service includes <code>HealthCheckConfig</code>, the port on the endpoint that Route 53 sends requests to.
     * </p>
     * </li>
     * </ul>
     * 
     * @param attributes
     *        A string map that contains the following information:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The attributes that are associate with the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For each attribute, the applicable value.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Supported attribute keys include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AWS_ALIAS_DNS_NAME</code>: For an alias record that routes traffic to an Elastic Load Balancing load
     *        balancer, the DNS name that is associated with the load balancer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS_INSTANCE_CNAME</code>: For a CNAME record, the domain name that Route 53 returns in response to
     *        DNS queries, for example, <code>example.com</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS_INSTANCE_IPV4</code>: For an A record, the IPv4 address that Route 53 returns in response to DNS
     *        queries, for example, <code>192.0.2.44</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS_INSTANCE_IPV6</code>: For an AAAA record, the IPv6 address that Route 53 returns in response to
     *        DNS queries, for example, <code>2001:0db8:85a3:0000:0000:abcd:0001:2345</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS_INSTANCE_PORT</code>: For an SRV record, the value that Route 53 returns for the port. In
     *        addition, if the service includes <code>HealthCheckConfig</code>, the port on the endpoint that Route 53
     *        sends requests to.
     *        </p>
     *        </li>
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * A string map that contains the following information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The attributes that are associate with the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each attribute, the applicable value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Supported attribute keys include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_ALIAS_DNS_NAME</code>: For an alias record that routes traffic to an Elastic Load Balancing load
     * balancer, the DNS name that is associated with the load balancer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_INSTANCE_CNAME</code>: For a CNAME record, the domain name that Route 53 returns in response to DNS
     * queries, for example, <code>example.com</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_INSTANCE_IPV4</code>: For an A record, the IPv4 address that Route 53 returns in response to DNS
     * queries, for example, <code>192.0.2.44</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_INSTANCE_IPV6</code>: For an AAAA record, the IPv6 address that Route 53 returns in response to DNS
     * queries, for example, <code>2001:0db8:85a3:0000:0000:abcd:0001:2345</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_INSTANCE_PORT</code>: For an SRV record, the value that Route 53 returns for the port. In addition, if
     * the service includes <code>HealthCheckConfig</code>, the port on the endpoint that Route 53 sends requests to.
     * </p>
     * </li>
     * </ul>
     * 
     * @param attributes
     *        A string map that contains the following information:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The attributes that are associate with the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For each attribute, the applicable value.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Supported attribute keys include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AWS_ALIAS_DNS_NAME</code>: For an alias record that routes traffic to an Elastic Load Balancing load
     *        balancer, the DNS name that is associated with the load balancer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS_INSTANCE_CNAME</code>: For a CNAME record, the domain name that Route 53 returns in response to
     *        DNS queries, for example, <code>example.com</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS_INSTANCE_IPV4</code>: For an A record, the IPv4 address that Route 53 returns in response to DNS
     *        queries, for example, <code>192.0.2.44</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS_INSTANCE_IPV6</code>: For an AAAA record, the IPv6 address that Route 53 returns in response to
     *        DNS queries, for example, <code>2001:0db8:85a3:0000:0000:abcd:0001:2345</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS_INSTANCE_PORT</code>: For an SRV record, the value that Route 53 returns for the port. In
     *        addition, if the service includes <code>HealthCheckConfig</code>, the port on the endpoint that Route 53
     *        sends requests to.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceSummary withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    public InstanceSummary addAttributesEntry(String key, String value) {
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

    public InstanceSummary clearAttributesEntries() {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
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

        if (obj instanceof InstanceSummary == false)
            return false;
        InstanceSummary other = (InstanceSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public InstanceSummary clone() {
        try {
            return (InstanceSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicediscovery.model.transform.InstanceSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
