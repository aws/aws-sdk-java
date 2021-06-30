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
     * <p>
     * If you want Cloud Map to create an <code>SRV</code> record when you register an instance and you're using a
     * system that requires a specific <code>SRV</code> format, such as <a href="http://www.haproxy.org/">HAProxy</a>,
     * specify the following for <code>Name</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Start the name with an underscore (_), such as <code>_exampleservice</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * End the name with <i>._protocol</i>, such as <code>._tcp</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you register an instance, Cloud Map creates an <code>SRV</code> record and assigns a name to the record by
     * concatenating the service name and the namespace name (for example,
     * </p>
     * <p>
     * <code>_exampleservice._tcp.example.com</code>).
     * </p>
     * <note>
     * <p>
     * For services that are accessible by DNS queries, you can't create multiple services with names that differ only
     * by case (such as EXAMPLE and example). Otherwise, these services have the same DNS name and can't be
     * distinguished. However, if you use a namespace that's only accessible by API calls, then you can create services
     * that with names that differ only by case.
     * </p>
     * </note>
     */
    private String name;
    /**
     * <p>
     * The ID of the namespace that you want to use to create the service. The namespace ID must be specified, but it
     * can be specified either here or in the <code>DnsConfig</code> object.
     * </p>
     */
    private String namespaceId;
    /**
     * <p>
     * A unique string that identifies the request and that allows failed <code>CreateService</code> requests to be
     * retried without the risk of running the operation twice. <code>CreatorRequestId</code> can be any unique string
     * (for example, a date/timestamp).
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
     * A complex type that contains information about the Amazon Route 53 records that you want Cloud Map to create when
     * you register an instance.
     * </p>
     */
    private DnsConfig dnsConfig;
    /**
     * <p>
     * <i>Public DNS and HTTP namespaces only.</i> A complex type that contains settings for an optional Route 53 health
     * check. If you specify settings for a health check, Cloud Map associates the health check with all the Route 53
     * DNS records that you specify in <code>DnsConfig</code>.
     * </p>
     * <important>
     * <p>
     * If you specify a health check configuration, you can specify either <code>HealthCheckCustomConfig</code> or
     * <code>HealthCheckConfig</code> but not both.
     * </p>
     * </important>
     * <p>
     * For information about the charges for health checks, see <a href="http://aws.amazon.com/cloud-map/pricing/">Cloud
     * Map Pricing</a>.
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
     * <p>
     * You can't add, update, or delete a <code>HealthCheckCustomConfig</code> configuration from an existing service.
     * </p>
     */
    private HealthCheckCustomConfig healthCheckCustomConfig;
    /**
     * <p>
     * The tags to add to the service. Each tag consists of a key and an optional value that you define. Tags keys can
     * be up to 128 characters in length, and tag values can be up to 256 characters in length.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * If present, specifies that the service instances are only discoverable using the <code>DiscoverInstances</code>
     * API operation. No DNS records is registered for the service instances. The only valid value is <code>HTTP</code>.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The name that you want to assign to the service.
     * </p>
     * <p>
     * If you want Cloud Map to create an <code>SRV</code> record when you register an instance and you're using a
     * system that requires a specific <code>SRV</code> format, such as <a href="http://www.haproxy.org/">HAProxy</a>,
     * specify the following for <code>Name</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Start the name with an underscore (_), such as <code>_exampleservice</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * End the name with <i>._protocol</i>, such as <code>._tcp</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you register an instance, Cloud Map creates an <code>SRV</code> record and assigns a name to the record by
     * concatenating the service name and the namespace name (for example,
     * </p>
     * <p>
     * <code>_exampleservice._tcp.example.com</code>).
     * </p>
     * <note>
     * <p>
     * For services that are accessible by DNS queries, you can't create multiple services with names that differ only
     * by case (such as EXAMPLE and example). Otherwise, these services have the same DNS name and can't be
     * distinguished. However, if you use a namespace that's only accessible by API calls, then you can create services
     * that with names that differ only by case.
     * </p>
     * </note>
     * 
     * @param name
     *        The name that you want to assign to the service.</p>
     *        <p>
     *        If you want Cloud Map to create an <code>SRV</code> record when you register an instance and you're using
     *        a system that requires a specific <code>SRV</code> format, such as <a
     *        href="http://www.haproxy.org/">HAProxy</a>, specify the following for <code>Name</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Start the name with an underscore (_), such as <code>_exampleservice</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        End the name with <i>._protocol</i>, such as <code>._tcp</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When you register an instance, Cloud Map creates an <code>SRV</code> record and assigns a name to the
     *        record by concatenating the service name and the namespace name (for example,
     *        </p>
     *        <p>
     *        <code>_exampleservice._tcp.example.com</code>).
     *        </p>
     *        <note>
     *        <p>
     *        For services that are accessible by DNS queries, you can't create multiple services with names that differ
     *        only by case (such as EXAMPLE and example). Otherwise, these services have the same DNS name and can't be
     *        distinguished. However, if you use a namespace that's only accessible by API calls, then you can create
     *        services that with names that differ only by case.
     *        </p>
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name that you want to assign to the service.
     * </p>
     * <p>
     * If you want Cloud Map to create an <code>SRV</code> record when you register an instance and you're using a
     * system that requires a specific <code>SRV</code> format, such as <a href="http://www.haproxy.org/">HAProxy</a>,
     * specify the following for <code>Name</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Start the name with an underscore (_), such as <code>_exampleservice</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * End the name with <i>._protocol</i>, such as <code>._tcp</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you register an instance, Cloud Map creates an <code>SRV</code> record and assigns a name to the record by
     * concatenating the service name and the namespace name (for example,
     * </p>
     * <p>
     * <code>_exampleservice._tcp.example.com</code>).
     * </p>
     * <note>
     * <p>
     * For services that are accessible by DNS queries, you can't create multiple services with names that differ only
     * by case (such as EXAMPLE and example). Otherwise, these services have the same DNS name and can't be
     * distinguished. However, if you use a namespace that's only accessible by API calls, then you can create services
     * that with names that differ only by case.
     * </p>
     * </note>
     * 
     * @return The name that you want to assign to the service.</p>
     *         <p>
     *         If you want Cloud Map to create an <code>SRV</code> record when you register an instance and you're using
     *         a system that requires a specific <code>SRV</code> format, such as <a
     *         href="http://www.haproxy.org/">HAProxy</a>, specify the following for <code>Name</code>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Start the name with an underscore (_), such as <code>_exampleservice</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         End the name with <i>._protocol</i>, such as <code>._tcp</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When you register an instance, Cloud Map creates an <code>SRV</code> record and assigns a name to the
     *         record by concatenating the service name and the namespace name (for example,
     *         </p>
     *         <p>
     *         <code>_exampleservice._tcp.example.com</code>).
     *         </p>
     *         <note>
     *         <p>
     *         For services that are accessible by DNS queries, you can't create multiple services with names that
     *         differ only by case (such as EXAMPLE and example). Otherwise, these services have the same DNS name and
     *         can't be distinguished. However, if you use a namespace that's only accessible by API calls, then you can
     *         create services that with names that differ only by case.
     *         </p>
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name that you want to assign to the service.
     * </p>
     * <p>
     * If you want Cloud Map to create an <code>SRV</code> record when you register an instance and you're using a
     * system that requires a specific <code>SRV</code> format, such as <a href="http://www.haproxy.org/">HAProxy</a>,
     * specify the following for <code>Name</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Start the name with an underscore (_), such as <code>_exampleservice</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * End the name with <i>._protocol</i>, such as <code>._tcp</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you register an instance, Cloud Map creates an <code>SRV</code> record and assigns a name to the record by
     * concatenating the service name and the namespace name (for example,
     * </p>
     * <p>
     * <code>_exampleservice._tcp.example.com</code>).
     * </p>
     * <note>
     * <p>
     * For services that are accessible by DNS queries, you can't create multiple services with names that differ only
     * by case (such as EXAMPLE and example). Otherwise, these services have the same DNS name and can't be
     * distinguished. However, if you use a namespace that's only accessible by API calls, then you can create services
     * that with names that differ only by case.
     * </p>
     * </note>
     * 
     * @param name
     *        The name that you want to assign to the service.</p>
     *        <p>
     *        If you want Cloud Map to create an <code>SRV</code> record when you register an instance and you're using
     *        a system that requires a specific <code>SRV</code> format, such as <a
     *        href="http://www.haproxy.org/">HAProxy</a>, specify the following for <code>Name</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Start the name with an underscore (_), such as <code>_exampleservice</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        End the name with <i>._protocol</i>, such as <code>._tcp</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When you register an instance, Cloud Map creates an <code>SRV</code> record and assigns a name to the
     *        record by concatenating the service name and the namespace name (for example,
     *        </p>
     *        <p>
     *        <code>_exampleservice._tcp.example.com</code>).
     *        </p>
     *        <note>
     *        <p>
     *        For services that are accessible by DNS queries, you can't create multiple services with names that differ
     *        only by case (such as EXAMPLE and example). Otherwise, these services have the same DNS name and can't be
     *        distinguished. However, if you use a namespace that's only accessible by API calls, then you can create
     *        services that with names that differ only by case.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the namespace that you want to use to create the service. The namespace ID must be specified, but it
     * can be specified either here or in the <code>DnsConfig</code> object.
     * </p>
     * 
     * @param namespaceId
     *        The ID of the namespace that you want to use to create the service. The namespace ID must be specified,
     *        but it can be specified either here or in the <code>DnsConfig</code> object.
     */

    public void setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
    }

    /**
     * <p>
     * The ID of the namespace that you want to use to create the service. The namespace ID must be specified, but it
     * can be specified either here or in the <code>DnsConfig</code> object.
     * </p>
     * 
     * @return The ID of the namespace that you want to use to create the service. The namespace ID must be specified,
     *         but it can be specified either here or in the <code>DnsConfig</code> object.
     */

    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * <p>
     * The ID of the namespace that you want to use to create the service. The namespace ID must be specified, but it
     * can be specified either here or in the <code>DnsConfig</code> object.
     * </p>
     * 
     * @param namespaceId
     *        The ID of the namespace that you want to use to create the service. The namespace ID must be specified,
     *        but it can be specified either here or in the <code>DnsConfig</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withNamespaceId(String namespaceId) {
        setNamespaceId(namespaceId);
        return this;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed <code>CreateService</code> requests to be
     * retried without the risk of running the operation twice. <code>CreatorRequestId</code> can be any unique string
     * (for example, a date/timestamp).
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string that identifies the request and that allows failed <code>CreateService</code> requests to
     *        be retried without the risk of running the operation twice. <code>CreatorRequestId</code> can be any
     *        unique string (for example, a date/timestamp).
     */

    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed <code>CreateService</code> requests to be
     * retried without the risk of running the operation twice. <code>CreatorRequestId</code> can be any unique string
     * (for example, a date/timestamp).
     * </p>
     * 
     * @return A unique string that identifies the request and that allows failed <code>CreateService</code> requests to
     *         be retried without the risk of running the operation twice. <code>CreatorRequestId</code> can be any
     *         unique string (for example, a date/timestamp).
     */

    public String getCreatorRequestId() {
        return this.creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed <code>CreateService</code> requests to be
     * retried without the risk of running the operation twice. <code>CreatorRequestId</code> can be any unique string
     * (for example, a date/timestamp).
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string that identifies the request and that allows failed <code>CreateService</code> requests to
     *        be retried without the risk of running the operation twice. <code>CreatorRequestId</code> can be any
     *        unique string (for example, a date/timestamp).
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
     * A complex type that contains information about the Amazon Route 53 records that you want Cloud Map to create when
     * you register an instance.
     * </p>
     * 
     * @param dnsConfig
     *        A complex type that contains information about the Amazon Route 53 records that you want Cloud Map to
     *        create when you register an instance.
     */

    public void setDnsConfig(DnsConfig dnsConfig) {
        this.dnsConfig = dnsConfig;
    }

    /**
     * <p>
     * A complex type that contains information about the Amazon Route 53 records that you want Cloud Map to create when
     * you register an instance.
     * </p>
     * 
     * @return A complex type that contains information about the Amazon Route 53 records that you want Cloud Map to
     *         create when you register an instance.
     */

    public DnsConfig getDnsConfig() {
        return this.dnsConfig;
    }

    /**
     * <p>
     * A complex type that contains information about the Amazon Route 53 records that you want Cloud Map to create when
     * you register an instance.
     * </p>
     * 
     * @param dnsConfig
     *        A complex type that contains information about the Amazon Route 53 records that you want Cloud Map to
     *        create when you register an instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withDnsConfig(DnsConfig dnsConfig) {
        setDnsConfig(dnsConfig);
        return this;
    }

    /**
     * <p>
     * <i>Public DNS and HTTP namespaces only.</i> A complex type that contains settings for an optional Route 53 health
     * check. If you specify settings for a health check, Cloud Map associates the health check with all the Route 53
     * DNS records that you specify in <code>DnsConfig</code>.
     * </p>
     * <important>
     * <p>
     * If you specify a health check configuration, you can specify either <code>HealthCheckCustomConfig</code> or
     * <code>HealthCheckConfig</code> but not both.
     * </p>
     * </important>
     * <p>
     * For information about the charges for health checks, see <a href="http://aws.amazon.com/cloud-map/pricing/">Cloud
     * Map Pricing</a>.
     * </p>
     * 
     * @param healthCheckConfig
     *        <i>Public DNS and HTTP namespaces only.</i> A complex type that contains settings for an optional Route 53
     *        health check. If you specify settings for a health check, Cloud Map associates the health check with all
     *        the Route 53 DNS records that you specify in <code>DnsConfig</code>.</p> <important>
     *        <p>
     *        If you specify a health check configuration, you can specify either <code>HealthCheckCustomConfig</code>
     *        or <code>HealthCheckConfig</code> but not both.
     *        </p>
     *        </important>
     *        <p>
     *        For information about the charges for health checks, see <a
     *        href="http://aws.amazon.com/cloud-map/pricing/">Cloud Map Pricing</a>.
     */

    public void setHealthCheckConfig(HealthCheckConfig healthCheckConfig) {
        this.healthCheckConfig = healthCheckConfig;
    }

    /**
     * <p>
     * <i>Public DNS and HTTP namespaces only.</i> A complex type that contains settings for an optional Route 53 health
     * check. If you specify settings for a health check, Cloud Map associates the health check with all the Route 53
     * DNS records that you specify in <code>DnsConfig</code>.
     * </p>
     * <important>
     * <p>
     * If you specify a health check configuration, you can specify either <code>HealthCheckCustomConfig</code> or
     * <code>HealthCheckConfig</code> but not both.
     * </p>
     * </important>
     * <p>
     * For information about the charges for health checks, see <a href="http://aws.amazon.com/cloud-map/pricing/">Cloud
     * Map Pricing</a>.
     * </p>
     * 
     * @return <i>Public DNS and HTTP namespaces only.</i> A complex type that contains settings for an optional Route
     *         53 health check. If you specify settings for a health check, Cloud Map associates the health check with
     *         all the Route 53 DNS records that you specify in <code>DnsConfig</code>.</p> <important>
     *         <p>
     *         If you specify a health check configuration, you can specify either <code>HealthCheckCustomConfig</code>
     *         or <code>HealthCheckConfig</code> but not both.
     *         </p>
     *         </important>
     *         <p>
     *         For information about the charges for health checks, see <a
     *         href="http://aws.amazon.com/cloud-map/pricing/">Cloud Map Pricing</a>.
     */

    public HealthCheckConfig getHealthCheckConfig() {
        return this.healthCheckConfig;
    }

    /**
     * <p>
     * <i>Public DNS and HTTP namespaces only.</i> A complex type that contains settings for an optional Route 53 health
     * check. If you specify settings for a health check, Cloud Map associates the health check with all the Route 53
     * DNS records that you specify in <code>DnsConfig</code>.
     * </p>
     * <important>
     * <p>
     * If you specify a health check configuration, you can specify either <code>HealthCheckCustomConfig</code> or
     * <code>HealthCheckConfig</code> but not both.
     * </p>
     * </important>
     * <p>
     * For information about the charges for health checks, see <a href="http://aws.amazon.com/cloud-map/pricing/">Cloud
     * Map Pricing</a>.
     * </p>
     * 
     * @param healthCheckConfig
     *        <i>Public DNS and HTTP namespaces only.</i> A complex type that contains settings for an optional Route 53
     *        health check. If you specify settings for a health check, Cloud Map associates the health check with all
     *        the Route 53 DNS records that you specify in <code>DnsConfig</code>.</p> <important>
     *        <p>
     *        If you specify a health check configuration, you can specify either <code>HealthCheckCustomConfig</code>
     *        or <code>HealthCheckConfig</code> but not both.
     *        </p>
     *        </important>
     *        <p>
     *        For information about the charges for health checks, see <a
     *        href="http://aws.amazon.com/cloud-map/pricing/">Cloud Map Pricing</a>.
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
     * <p>
     * You can't add, update, or delete a <code>HealthCheckCustomConfig</code> configuration from an existing service.
     * </p>
     * 
     * @param healthCheckCustomConfig
     *        A complex type that contains information about an optional custom health check.</p> <important>
     *        <p>
     *        If you specify a health check configuration, you can specify either <code>HealthCheckCustomConfig</code>
     *        or <code>HealthCheckConfig</code> but not both.
     *        </p>
     *        </important>
     *        <p>
     *        You can't add, update, or delete a <code>HealthCheckCustomConfig</code> configuration from an existing
     *        service.
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
     * <p>
     * You can't add, update, or delete a <code>HealthCheckCustomConfig</code> configuration from an existing service.
     * </p>
     * 
     * @return A complex type that contains information about an optional custom health check.</p> <important>
     *         <p>
     *         If you specify a health check configuration, you can specify either <code>HealthCheckCustomConfig</code>
     *         or <code>HealthCheckConfig</code> but not both.
     *         </p>
     *         </important>
     *         <p>
     *         You can't add, update, or delete a <code>HealthCheckCustomConfig</code> configuration from an existing
     *         service.
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
     * <p>
     * You can't add, update, or delete a <code>HealthCheckCustomConfig</code> configuration from an existing service.
     * </p>
     * 
     * @param healthCheckCustomConfig
     *        A complex type that contains information about an optional custom health check.</p> <important>
     *        <p>
     *        If you specify a health check configuration, you can specify either <code>HealthCheckCustomConfig</code>
     *        or <code>HealthCheckConfig</code> but not both.
     *        </p>
     *        </important>
     *        <p>
     *        You can't add, update, or delete a <code>HealthCheckCustomConfig</code> configuration from an existing
     *        service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withHealthCheckCustomConfig(HealthCheckCustomConfig healthCheckCustomConfig) {
        setHealthCheckCustomConfig(healthCheckCustomConfig);
        return this;
    }

    /**
     * <p>
     * The tags to add to the service. Each tag consists of a key and an optional value that you define. Tags keys can
     * be up to 128 characters in length, and tag values can be up to 256 characters in length.
     * </p>
     * 
     * @return The tags to add to the service. Each tag consists of a key and an optional value that you define. Tags
     *         keys can be up to 128 characters in length, and tag values can be up to 256 characters in length.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to add to the service. Each tag consists of a key and an optional value that you define. Tags keys can
     * be up to 128 characters in length, and tag values can be up to 256 characters in length.
     * </p>
     * 
     * @param tags
     *        The tags to add to the service. Each tag consists of a key and an optional value that you define. Tags
     *        keys can be up to 128 characters in length, and tag values can be up to 256 characters in length.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags to add to the service. Each tag consists of a key and an optional value that you define. Tags keys can
     * be up to 128 characters in length, and tag values can be up to 256 characters in length.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags to add to the service. Each tag consists of a key and an optional value that you define. Tags
     *        keys can be up to 128 characters in length, and tag values can be up to 256 characters in length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to add to the service. Each tag consists of a key and an optional value that you define. Tags keys can
     * be up to 128 characters in length, and tag values can be up to 256 characters in length.
     * </p>
     * 
     * @param tags
     *        The tags to add to the service. Each tag consists of a key and an optional value that you define. Tags
     *        keys can be up to 128 characters in length, and tag values can be up to 256 characters in length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * If present, specifies that the service instances are only discoverable using the <code>DiscoverInstances</code>
     * API operation. No DNS records is registered for the service instances. The only valid value is <code>HTTP</code>.
     * </p>
     * 
     * @param type
     *        If present, specifies that the service instances are only discoverable using the
     *        <code>DiscoverInstances</code> API operation. No DNS records is registered for the service instances. The
     *        only valid value is <code>HTTP</code>.
     * @see ServiceTypeOption
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * If present, specifies that the service instances are only discoverable using the <code>DiscoverInstances</code>
     * API operation. No DNS records is registered for the service instances. The only valid value is <code>HTTP</code>.
     * </p>
     * 
     * @return If present, specifies that the service instances are only discoverable using the
     *         <code>DiscoverInstances</code> API operation. No DNS records is registered for the service instances. The
     *         only valid value is <code>HTTP</code>.
     * @see ServiceTypeOption
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * If present, specifies that the service instances are only discoverable using the <code>DiscoverInstances</code>
     * API operation. No DNS records is registered for the service instances. The only valid value is <code>HTTP</code>.
     * </p>
     * 
     * @param type
     *        If present, specifies that the service instances are only discoverable using the
     *        <code>DiscoverInstances</code> API operation. No DNS records is registered for the service instances. The
     *        only valid value is <code>HTTP</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceTypeOption
     */

    public CreateServiceRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * If present, specifies that the service instances are only discoverable using the <code>DiscoverInstances</code>
     * API operation. No DNS records is registered for the service instances. The only valid value is <code>HTTP</code>.
     * </p>
     * 
     * @param type
     *        If present, specifies that the service instances are only discoverable using the
     *        <code>DiscoverInstances</code> API operation. No DNS records is registered for the service instances. The
     *        only valid value is <code>HTTP</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceTypeOption
     */

    public CreateServiceRequest withType(ServiceTypeOption type) {
        this.type = type.toString();
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
            sb.append("HealthCheckCustomConfig: ").append(getHealthCheckCustomConfig()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public CreateServiceRequest clone() {
        return (CreateServiceRequest) super.clone();
    }

}
