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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/CreateService" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateServiceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name that you want to assign to the service.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An optional parameter that you can use to resolve concurrent creation requests. <code>CreatorRequestId</code>
     * helps to determine if a specific client owns the namespace.
     * </p>
     */
    private String creatorRequestId;
    /**
     * <p>
     * A description for the service.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A complex type that contains information about the resource record sets that you want Amazon Route 53 to create
     * when you register an instance.
     * </p>
     */
    private DnsConfig dnsConfig;
    /**
     * <p>
     * <i>Public DNS namespaces only.</i> A complex type that contains settings for an optional health check. If you
     * specify settings for a health check, Amazon Route 53 associates the health check with all the resource record
     * sets that you specify in <code>DnsConfig</code>.
     * </p>
     * <note>
     * <p>
     * The health check uses 30 seconds as the request interval. This is the number of seconds between the time that
     * each Amazon Route 53 health checker gets a response from your endpoint and the time that it sends the next health
     * check request. A health checker in each data center around the world sends your endpoint a health check request
     * every 30 seconds. On average, your endpoint receives a health check request about every two seconds. Health
     * checkers in different data centers don't coordinate with one another, so you'll sometimes see several requests
     * per second followed by a few seconds with no health checks at all.
     * </p>
     * </note>
     * <p>
     * For information about the charges for health checks, see <a href="http://aws.amazon.com/route53/pricing">Amazon
     * Route 53 Pricing</a>.
     * </p>
     */
    private HealthCheckConfig healthCheckConfig;

    /**
     * <p>
     * The name that you want to assign to the service.
     * </p>
     * 
     * @param name
     *        The name that you want to assign to the service.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name that you want to assign to the service.
     * </p>
     * 
     * @return The name that you want to assign to the service.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name that you want to assign to the service.
     * </p>
     * 
     * @param name
     *        The name that you want to assign to the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withName(String name) {
        setName(name);
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

    public CreateServiceRequest withCreatorRequestId(String creatorRequestId) {
        setCreatorRequestId(creatorRequestId);
        return this;
    }

    /**
     * <p>
     * A description for the service.
     * </p>
     * 
     * @param description
     *        A description for the service.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the service.
     * </p>
     * 
     * @return A description for the service.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the service.
     * </p>
     * 
     * @param description
     *        A description for the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about the resource record sets that you want Amazon Route 53 to create
     * when you register an instance.
     * </p>
     * 
     * @param dnsConfig
     *        A complex type that contains information about the resource record sets that you want Amazon Route 53 to
     *        create when you register an instance.
     */

    public void setDnsConfig(DnsConfig dnsConfig) {
        this.dnsConfig = dnsConfig;
    }

    /**
     * <p>
     * A complex type that contains information about the resource record sets that you want Amazon Route 53 to create
     * when you register an instance.
     * </p>
     * 
     * @return A complex type that contains information about the resource record sets that you want Amazon Route 53 to
     *         create when you register an instance.
     */

    public DnsConfig getDnsConfig() {
        return this.dnsConfig;
    }

    /**
     * <p>
     * A complex type that contains information about the resource record sets that you want Amazon Route 53 to create
     * when you register an instance.
     * </p>
     * 
     * @param dnsConfig
     *        A complex type that contains information about the resource record sets that you want Amazon Route 53 to
     *        create when you register an instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withDnsConfig(DnsConfig dnsConfig) {
        setDnsConfig(dnsConfig);
        return this;
    }

    /**
     * <p>
     * <i>Public DNS namespaces only.</i> A complex type that contains settings for an optional health check. If you
     * specify settings for a health check, Amazon Route 53 associates the health check with all the resource record
     * sets that you specify in <code>DnsConfig</code>.
     * </p>
     * <note>
     * <p>
     * The health check uses 30 seconds as the request interval. This is the number of seconds between the time that
     * each Amazon Route 53 health checker gets a response from your endpoint and the time that it sends the next health
     * check request. A health checker in each data center around the world sends your endpoint a health check request
     * every 30 seconds. On average, your endpoint receives a health check request about every two seconds. Health
     * checkers in different data centers don't coordinate with one another, so you'll sometimes see several requests
     * per second followed by a few seconds with no health checks at all.
     * </p>
     * </note>
     * <p>
     * For information about the charges for health checks, see <a href="http://aws.amazon.com/route53/pricing">Amazon
     * Route 53 Pricing</a>.
     * </p>
     * 
     * @param healthCheckConfig
     *        <i>Public DNS namespaces only.</i> A complex type that contains settings for an optional health check. If
     *        you specify settings for a health check, Amazon Route 53 associates the health check with all the resource
     *        record sets that you specify in <code>DnsConfig</code>.</p> <note>
     *        <p>
     *        The health check uses 30 seconds as the request interval. This is the number of seconds between the time
     *        that each Amazon Route 53 health checker gets a response from your endpoint and the time that it sends the
     *        next health check request. A health checker in each data center around the world sends your endpoint a
     *        health check request every 30 seconds. On average, your endpoint receives a health check request about
     *        every two seconds. Health checkers in different data centers don't coordinate with one another, so you'll
     *        sometimes see several requests per second followed by a few seconds with no health checks at all.
     *        </p>
     *        </note>
     *        <p>
     *        For information about the charges for health checks, see <a
     *        href="http://aws.amazon.com/route53/pricing">Amazon Route 53 Pricing</a>.
     */

    public void setHealthCheckConfig(HealthCheckConfig healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
    }

    /**
     * <p>
     * <i>Public DNS namespaces only.</i> A complex type that contains settings for an optional health check. If you
     * specify settings for a health check, Amazon Route 53 associates the health check with all the resource record
     * sets that you specify in <code>DnsConfig</code>.
     * </p>
     * <note>
     * <p>
     * The health check uses 30 seconds as the request interval. This is the number of seconds between the time that
     * each Amazon Route 53 health checker gets a response from your endpoint and the time that it sends the next health
     * check request. A health checker in each data center around the world sends your endpoint a health check request
     * every 30 seconds. On average, your endpoint receives a health check request about every two seconds. Health
     * checkers in different data centers don't coordinate with one another, so you'll sometimes see several requests
     * per second followed by a few seconds with no health checks at all.
     * </p>
     * </note>
     * <p>
     * For information about the charges for health checks, see <a href="http://aws.amazon.com/route53/pricing">Amazon
     * Route 53 Pricing</a>.
     * </p>
     * 
     * @return <i>Public DNS namespaces only.</i> A complex type that contains settings for an optional health check. If
     *         you specify settings for a health check, Amazon Route 53 associates the health check with all the
     *         resource record sets that you specify in <code>DnsConfig</code>.</p> <note>
     *         <p>
     *         The health check uses 30 seconds as the request interval. This is the number of seconds between the time
     *         that each Amazon Route 53 health checker gets a response from your endpoint and the time that it sends
     *         the next health check request. A health checker in each data center around the world sends your endpoint
     *         a health check request every 30 seconds. On average, your endpoint receives a health check request about
     *         every two seconds. Health checkers in different data centers don't coordinate with one another, so you'll
     *         sometimes see several requests per second followed by a few seconds with no health checks at all.
     *         </p>
     *         </note>
     *         <p>
     *         For information about the charges for health checks, see <a
     *         href="http://aws.amazon.com/route53/pricing">Amazon Route 53 Pricing</a>.
     */

    public HealthCheckConfig getHealthCheckConfig() {
        return this.healthCheckConfig;
    }

    /**
     * <p>
     * <i>Public DNS namespaces only.</i> A complex type that contains settings for an optional health check. If you
     * specify settings for a health check, Amazon Route 53 associates the health check with all the resource record
     * sets that you specify in <code>DnsConfig</code>.
     * </p>
     * <note>
     * <p>
     * The health check uses 30 seconds as the request interval. This is the number of seconds between the time that
     * each Amazon Route 53 health checker gets a response from your endpoint and the time that it sends the next health
     * check request. A health checker in each data center around the world sends your endpoint a health check request
     * every 30 seconds. On average, your endpoint receives a health check request about every two seconds. Health
     * checkers in different data centers don't coordinate with one another, so you'll sometimes see several requests
     * per second followed by a few seconds with no health checks at all.
     * </p>
     * </note>
     * <p>
     * For information about the charges for health checks, see <a href="http://aws.amazon.com/route53/pricing">Amazon
     * Route 53 Pricing</a>.
     * </p>
     * 
     * @param healthCheckConfig
     *        <i>Public DNS namespaces only.</i> A complex type that contains settings for an optional health check. If
     *        you specify settings for a health check, Amazon Route 53 associates the health check with all the resource
     *        record sets that you specify in <code>DnsConfig</code>.</p> <note>
     *        <p>
     *        The health check uses 30 seconds as the request interval. This is the number of seconds between the time
     *        that each Amazon Route 53 health checker gets a response from your endpoint and the time that it sends the
     *        next health check request. A health checker in each data center around the world sends your endpoint a
     *        health check request every 30 seconds. On average, your endpoint receives a health check request about
     *        every two seconds. Health checkers in different data centers don't coordinate with one another, so you'll
     *        sometimes see several requests per second followed by a few seconds with no health checks at all.
     *        </p>
     *        </note>
     *        <p>
     *        For information about the charges for health checks, see <a
     *        href="http://aws.amazon.com/route53/pricing">Amazon Route 53 Pricing</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withHealthCheckConfig(HealthCheckConfig healthCheckConfig) {
        setHealthCheckConfig(healthCheckConfig);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCreatorRequestId() != null)
            sb.append("CreatorRequestId: ").append(getCreatorRequestId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDnsConfig() != null)
            sb.append("DnsConfig: ").append(getDnsConfig()).append(",");
        if (getHealthCheckConfig() != null)
            sb.append("HealthCheckConfig: ").append(getHealthCheckConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateServiceRequest == false)
            return false;
        CreateServiceRequest other = (CreateServiceRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCreatorRequestId() == null ^ this.getCreatorRequestId() == null)
            return false;
        if (other.getCreatorRequestId() != null && other.getCreatorRequestId().equals(this.getCreatorRequestId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDnsConfig() == null ^ this.getDnsConfig() == null)
            return false;
        if (other.getDnsConfig() != null && other.getDnsConfig().equals(this.getDnsConfig()) == false)
            return false;
        if (other.getHealthCheckConfig() == null ^ this.getHealthCheckConfig() == null)
            return false;
        if (other.getHealthCheckConfig() != null && other.getHealthCheckConfig().equals(this.getHealthCheckConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCreatorRequestId() == null) ? 0 : getCreatorRequestId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDnsConfig() == null) ? 0 : getDnsConfig().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckConfig() == null) ? 0 : getHealthCheckConfig().hashCode());
        return hashCode;
    }

    @Override
    public CreateServiceRequest clone() {
        return (CreateServiceRequest) super.clone();
    }

}
