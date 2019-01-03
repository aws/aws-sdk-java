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
     * The ID of the namespace that you want to use to create the service.
     * </p>
     */
    private String namespaceId;
    /**
     * <p>
     * A unique string that identifies the request and that allows failed <code>CreateService</code> requests to be
     * retried without the risk of executing the operation twice. <code>CreatorRequestId</code> can be any unique
     * string, for example, a date/time stamp.
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
     * A complex type that contains information about the Amazon Route 53 records that you want AWS Cloud Map to create
     * when you register an instance.
     * </p>
     */
    private DnsConfig dnsConfig;
    /**
     * <p>
     * <i>Public DNS namespaces only.</i> A complex type that contains settings for an optional Route 53 health check.
     * If you specify settings for a health check, AWS Cloud Map associates the health check with all the Route 53 DNS
     * records that you specify in <code>DnsConfig</code>.
     * </p>
     * <important>
     * <p>
     * If you specify a health check configuration, you can specify either <code>HealthCheckCustomConfig</code> or
     * <code>HealthCheckConfig</code> but not both.
     * </p>
     * </important>
     * <p>
     * For information about the charges for health checks, see <a href="http://aws.amazon.com/cloud-map/pricing/">AWS
     * Cloud Map Pricing</a>.
     * </p>
     */
    private HealthCheckConfig healthCheckConfig;
    /**
     * <p>
     * A complex type that contains information about an optional custom health check.
     * </p>
     * <important>
     * <p>
     * If you specify a health check configuration, you can specify either <code>HealthCheckCustomConfig</code> or
     * <code>HealthCheckConfig</code> but not both.
     * </p>
     * </important>
     */
    private HealthCheckCustomConfig healthCheckCustomConfig;

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
     * The ID of the namespace that you want to use to create the service.
     * </p>
     * 
     * @param namespaceId
     *        The ID of the namespace that you want to use to create the service.
     */

    public void setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
    }

    /**
     * <p>
     * The ID of the namespace that you want to use to create the service.
     * </p>
     * 
     * @return The ID of the namespace that you want to use to create the service.
     */

    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * <p>
     * The ID of the namespace that you want to use to create the service.
     * </p>
     * 
     * @param namespaceId
     *        The ID of the namespace that you want to use to create the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withNamespaceId(String namespaceId) {
        setNamespaceId(namespaceId);
        return this;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed <code>CreateService</code> requests to be
     * retried without the risk of executing the operation twice. <code>CreatorRequestId</code> can be any unique
     * string, for example, a date/time stamp.
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string that identifies the request and that allows failed <code>CreateService</code> requests to
     *        be retried without the risk of executing the operation twice. <code>CreatorRequestId</code> can be any
     *        unique string, for example, a date/time stamp.
     */

    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed <code>CreateService</code> requests to be
     * retried without the risk of executing the operation twice. <code>CreatorRequestId</code> can be any unique
     * string, for example, a date/time stamp.
     * </p>
     * 
     * @return A unique string that identifies the request and that allows failed <code>CreateService</code> requests to
     *         be retried without the risk of executing the operation twice. <code>CreatorRequestId</code> can be any
     *         unique string, for example, a date/time stamp.
     */

    public String getCreatorRequestId() {
        return this.creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed <code>CreateService</code> requests to be
     * retried without the risk of executing the operation twice. <code>CreatorRequestId</code> can be any unique
     * string, for example, a date/time stamp.
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string that identifies the request and that allows failed <code>CreateService</code> requests to
     *        be retried without the risk of executing the operation twice. <code>CreatorRequestId</code> can be any
     *        unique string, for example, a date/time stamp.
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
     * A complex type that contains information about the Amazon Route 53 records that you want AWS Cloud Map to create
     * when you register an instance.
     * </p>
     * 
     * @param dnsConfig
     *        A complex type that contains information about the Amazon Route 53 records that you want AWS Cloud Map to
     *        create when you register an instance.
     */

    public void setDnsConfig(DnsConfig dnsConfig) {
        this.dnsConfig = dnsConfig;
    }

    /**
     * <p>
     * A complex type that contains information about the Amazon Route 53 records that you want AWS Cloud Map to create
     * when you register an instance.
     * </p>
     * 
     * @return A complex type that contains information about the Amazon Route 53 records that you want AWS Cloud Map to
     *         create when you register an instance.
     */

    public DnsConfig getDnsConfig() {
        return this.dnsConfig;
    }

    /**
     * <p>
     * A complex type that contains information about the Amazon Route 53 records that you want AWS Cloud Map to create
     * when you register an instance.
     * </p>
     * 
     * @param dnsConfig
     *        A complex type that contains information about the Amazon Route 53 records that you want AWS Cloud Map to
     *        create when you register an instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withDnsConfig(DnsConfig dnsConfig) {
        setDnsConfig(dnsConfig);
        return this;
    }

    /**
     * <p>
     * <i>Public DNS namespaces only.</i> A complex type that contains settings for an optional Route 53 health check.
     * If you specify settings for a health check, AWS Cloud Map associates the health check with all the Route 53 DNS
     * records that you specify in <code>DnsConfig</code>.
     * </p>
     * <important>
     * <p>
     * If you specify a health check configuration, you can specify either <code>HealthCheckCustomConfig</code> or
     * <code>HealthCheckConfig</code> but not both.
     * </p>
     * </important>
     * <p>
     * For information about the charges for health checks, see <a href="http://aws.amazon.com/cloud-map/pricing/">AWS
     * Cloud Map Pricing</a>.
     * </p>
     * 
     * @param healthCheckConfig
     *        <i>Public DNS namespaces only.</i> A complex type that contains settings for an optional Route 53 health
     *        check. If you specify settings for a health check, AWS Cloud Map associates the health check with all the
     *        Route 53 DNS records that you specify in <code>DnsConfig</code>.</p> <important>
     *        <p>
     *        If you specify a health check configuration, you can specify either <code>HealthCheckCustomConfig</code>
     *        or <code>HealthCheckConfig</code> but not both.
     *        </p>
     *        </important>
     *        <p>
     *        For information about the charges for health checks, see <a
     *        href="http://aws.amazon.com/cloud-map/pricing/">AWS Cloud Map Pricing</a>.
     */

    public void setHealthCheckConfig(HealthCheckConfig healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
    }

    /**
     * <p>
     * <i>Public DNS namespaces only.</i> A complex type that contains settings for an optional Route 53 health check.
     * If you specify settings for a health check, AWS Cloud Map associates the health check with all the Route 53 DNS
     * records that you specify in <code>DnsConfig</code>.
     * </p>
     * <important>
     * <p>
     * If you specify a health check configuration, you can specify either <code>HealthCheckCustomConfig</code> or
     * <code>HealthCheckConfig</code> but not both.
     * </p>
     * </important>
     * <p>
     * For information about the charges for health checks, see <a href="http://aws.amazon.com/cloud-map/pricing/">AWS
     * Cloud Map Pricing</a>.
     * </p>
     * 
     * @return <i>Public DNS namespaces only.</i> A complex type that contains settings for an optional Route 53 health
     *         check. If you specify settings for a health check, AWS Cloud Map associates the health check with all the
     *         Route 53 DNS records that you specify in <code>DnsConfig</code>.</p> <important>
     *         <p>
     *         If you specify a health check configuration, you can specify either <code>HealthCheckCustomConfig</code>
     *         or <code>HealthCheckConfig</code> but not both.
     *         </p>
     *         </important>
     *         <p>
     *         For information about the charges for health checks, see <a
     *         href="http://aws.amazon.com/cloud-map/pricing/">AWS Cloud Map Pricing</a>.
     */

    public HealthCheckConfig getHealthCheckConfig() {
        return this.healthCheckConfig;
    }

    /**
     * <p>
     * <i>Public DNS namespaces only.</i> A complex type that contains settings for an optional Route 53 health check.
     * If you specify settings for a health check, AWS Cloud Map associates the health check with all the Route 53 DNS
     * records that you specify in <code>DnsConfig</code>.
     * </p>
     * <important>
     * <p>
     * If you specify a health check configuration, you can specify either <code>HealthCheckCustomConfig</code> or
     * <code>HealthCheckConfig</code> but not both.
     * </p>
     * </important>
     * <p>
     * For information about the charges for health checks, see <a href="http://aws.amazon.com/cloud-map/pricing/">AWS
     * Cloud Map Pricing</a>.
     * </p>
     * 
     * @param healthCheckConfig
     *        <i>Public DNS namespaces only.</i> A complex type that contains settings for an optional Route 53 health
     *        check. If you specify settings for a health check, AWS Cloud Map associates the health check with all the
     *        Route 53 DNS records that you specify in <code>DnsConfig</code>.</p> <important>
     *        <p>
     *        If you specify a health check configuration, you can specify either <code>HealthCheckCustomConfig</code>
     *        or <code>HealthCheckConfig</code> but not both.
     *        </p>
     *        </important>
     *        <p>
     *        For information about the charges for health checks, see <a
     *        href="http://aws.amazon.com/cloud-map/pricing/">AWS Cloud Map Pricing</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withHealthCheckConfig(HealthCheckConfig healthCheckConfig) {
        setHealthCheckConfig(healthCheckConfig);
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about an optional custom health check.
     * </p>
     * <important>
     * <p>
     * If you specify a health check configuration, you can specify either <code>HealthCheckCustomConfig</code> or
     * <code>HealthCheckConfig</code> but not both.
     * </p>
     * </important>
     * 
     * @param healthCheckCustomConfig
     *        A complex type that contains information about an optional custom health check.</p> <important>
     *        <p>
     *        If you specify a health check configuration, you can specify either <code>HealthCheckCustomConfig</code>
     *        or <code>HealthCheckConfig</code> but not both.
     *        </p>
     */

    public void setHealthCheckCustomConfig(HealthCheckCustomConfig healthCheckCustomConfig) {
        this.healthCheckCustomConfig = healthCheckCustomConfig;
    }

    /**
     * <p>
     * A complex type that contains information about an optional custom health check.
     * </p>
     * <important>
     * <p>
     * If you specify a health check configuration, you can specify either <code>HealthCheckCustomConfig</code> or
     * <code>HealthCheckConfig</code> but not both.
     * </p>
     * </important>
     * 
     * @return A complex type that contains information about an optional custom health check.</p> <important>
     *         <p>
     *         If you specify a health check configuration, you can specify either <code>HealthCheckCustomConfig</code>
     *         or <code>HealthCheckConfig</code> but not both.
     *         </p>
     */

    public HealthCheckCustomConfig getHealthCheckCustomConfig() {
        return this.healthCheckCustomConfig;
    }

    /**
     * <p>
     * A complex type that contains information about an optional custom health check.
     * </p>
     * <important>
     * <p>
     * If you specify a health check configuration, you can specify either <code>HealthCheckCustomConfig</code> or
     * <code>HealthCheckConfig</code> but not both.
     * </p>
     * </important>
     * 
     * @param healthCheckCustomConfig
     *        A complex type that contains information about an optional custom health check.</p> <important>
     *        <p>
     *        If you specify a health check configuration, you can specify either <code>HealthCheckCustomConfig</code>
     *        or <code>HealthCheckConfig</code> but not both.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withHealthCheckCustomConfig(HealthCheckCustomConfig healthCheckCustomConfig) {
        setHealthCheckCustomConfig(healthCheckCustomConfig);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getNamespaceId() != null)
            sb.append("NamespaceId: ").append(getNamespaceId()).append(",");
        if (getCreatorRequestId() != null)
            sb.append("CreatorRequestId: ").append(getCreatorRequestId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDnsConfig() != null)
            sb.append("DnsConfig: ").append(getDnsConfig()).append(",");
        if (getHealthCheckConfig() != null)
            sb.append("HealthCheckConfig: ").append(getHealthCheckConfig()).append(",");
        if (getHealthCheckCustomConfig() != null)
            sb.append("HealthCheckCustomConfig: ").append(getHealthCheckCustomConfig());
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
        if (other.getNamespaceId() == null ^ this.getNamespaceId() == null)
            return false;
        if (other.getNamespaceId() != null && other.getNamespaceId().equals(this.getNamespaceId()) == false)
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
        if (other.getHealthCheckCustomConfig() == null ^ this.getHealthCheckCustomConfig() == null)
            return false;
        if (other.getHealthCheckCustomConfig() != null && other.getHealthCheckCustomConfig().equals(this.getHealthCheckCustomConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNamespaceId() == null) ? 0 : getNamespaceId().hashCode());
        hashCode = prime * hashCode + ((getCreatorRequestId() == null) ? 0 : getCreatorRequestId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDnsConfig() == null) ? 0 : getDnsConfig().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckConfig() == null) ? 0 : getHealthCheckConfig().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckCustomConfig() == null) ? 0 : getHealthCheckCustomConfig().hashCode());
        return hashCode;
    }

    @Override
    public CreateServiceRequest clone() {
        return (CreateServiceRequest) super.clone();
    }

}
