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
 * <i>Public DNS namespaces only.</i> A complex type that contains settings for an optional health check. If you specify
 * settings for a health check, AWS Cloud Map associates the health check with the records that you specify in
 * <code>DnsConfig</code>.
 * </p>
 * <important>
 * <p>
 * If you specify a health check configuration, you can specify either <code>HealthCheckCustomConfig</code> or
 * <code>HealthCheckConfig</code> but not both.
 * </p>
 * </important>
 * <p>
 * Health checks are basic Route 53 health checks that monitor an AWS endpoint. For information about pricing for health
 * checks, see <a href="http://aws.amazon.com/route53/pricing/">Amazon Route 53 Pricing</a>.
 * </p>
 * <p>
 * Note the following about configuring health checks.
 * </p>
 * <p>
 * <b>A and AAAA records</b>
 * </p>
 * <p>
 * If <code>DnsConfig</code> includes configurations for both A and AAAA records, AWS Cloud Map creates a health check
 * that uses the IPv4 address to check the health of the resource. If the endpoint that is specified by the IPv4 address
 * is unhealthy, Route 53 considers both the A and AAAA records to be unhealthy.
 * </p>
 * <p>
 * <b>CNAME records</b>
 * </p>
 * <p>
 * You can't specify settings for <code>HealthCheckConfig</code> when the <code>DNSConfig</code> includes
 * <code>CNAME</code> for the value of <code>Type</code>. If you do, the <code>CreateService</code> request will fail
 * with an <code>InvalidInput</code> error.
 * </p>
 * <p>
 * <b>Request interval</b>
 * </p>
 * <p>
 * A Route 53 health checker in each health-checking region sends a health check request to an endpoint every 30
 * seconds. On average, your endpoint receives a health check request about every two seconds. However, health checkers
 * don't coordinate with one another, so you'll sometimes see several requests per second followed by a few seconds with
 * no health checks at all.
 * </p>
 * <p>
 * <b>Health checking regions</b>
 * </p>
 * <p>
 * Health checkers perform checks from all Route 53 health-checking regions. For a list of the current regions, see <a
 * href=
 * "http://docs.aws.amazon.com/Route53/latest/APIReference/API_HealthCheckConfig.html#Route53-Type-HealthCheckConfig-Regions"
 * >Regions</a>.
 * </p>
 * <p>
 * <b>Alias records</b>
 * </p>
 * <p>
 * When you register an instance, if you include the <code>AWS_ALIAS_DNS_NAME</code> attribute, AWS Cloud Map creates a
 * Route 53 alias record. Note the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Route 53 automatically sets <code>EvaluateTargetHealth</code> to true for alias records. When
 * <code>EvaluateTargetHealth</code> is true, the alias record inherits the health of the referenced AWS resource. such
 * as an ELB load balancer. For more information, see <a href=
 * "http://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html#Route53-Type-AliasTarget-EvaluateTargetHealth"
 * >EvaluateTargetHealth</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * If you include <code>HealthCheckConfig</code> and then use the service to register an instance that creates an alias
 * record, Route 53 doesn't create the health check.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Charges for health checks</b>
 * </p>
 * <p>
 * Health checks are basic Route 53 health checks that monitor an AWS endpoint. For information about pricing for health
 * checks, see <a href="http://aws.amazon.com/route53/pricing/">Amazon Route 53 Pricing</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/HealthCheckConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HealthCheckConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of health check that you want to create, which indicates how Route 53 determines whether an endpoint is
     * healthy.
     * </p>
     * <important>
     * <p>
     * You can't change the value of <code>Type</code> after you create a health check.
     * </p>
     * </important>
     * <p>
     * You can create the following types of health checks:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>HTTP</b>: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an HTTP request and
     * waits for an HTTP status code of 200 or greater and less than 400.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>HTTPS</b>: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an HTTPS request and
     * waits for an HTTP status code of 200 or greater and less than 400.
     * </p>
     * <important>
     * <p>
     * If you specify HTTPS for the value of <code>Type</code>, the endpoint must support TLS v1.0 or later.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <b>TCP</b>: Route 53 tries to establish a TCP connection.
     * </p>
     * <p>
     * If you specify <code>TCP</code> for <code>Type</code>, don't specify a value for <code>ResourcePath</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html">How
     * Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Route 53 Developer Guide</i>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The path that you want Route 53 to request when performing health checks. The path can be any value for which
     * your endpoint will return an HTTP status code of 2xx or 3xx when the endpoint is healthy, such as the file
     * <code>/docs/route53-health-check.html</code>. Route 53 automatically adds the DNS name for the service. If you
     * don't specify a value for <code>ResourcePath</code>, the default value is <code>/</code>.
     * </p>
     * <p>
     * If you specify <code>TCP</code> for <code>Type</code>, you must <i>not</i> specify a value for
     * <code>ResourcePath</code>.
     * </p>
     */
    private String resourcePath;
    /**
     * <p>
     * The number of consecutive health checks that an endpoint must pass or fail for Route 53 to change the current
     * status of the endpoint from unhealthy to healthy or vice versa. For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html">How
     * Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Route 53 Developer Guide</i>.
     * </p>
     */
    private Integer failureThreshold;

    /**
     * <p>
     * The type of health check that you want to create, which indicates how Route 53 determines whether an endpoint is
     * healthy.
     * </p>
     * <important>
     * <p>
     * You can't change the value of <code>Type</code> after you create a health check.
     * </p>
     * </important>
     * <p>
     * You can create the following types of health checks:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>HTTP</b>: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an HTTP request and
     * waits for an HTTP status code of 200 or greater and less than 400.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>HTTPS</b>: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an HTTPS request and
     * waits for an HTTP status code of 200 or greater and less than 400.
     * </p>
     * <important>
     * <p>
     * If you specify HTTPS for the value of <code>Type</code>, the endpoint must support TLS v1.0 or later.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <b>TCP</b>: Route 53 tries to establish a TCP connection.
     * </p>
     * <p>
     * If you specify <code>TCP</code> for <code>Type</code>, don't specify a value for <code>ResourcePath</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html">How
     * Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Route 53 Developer Guide</i>.
     * </p>
     * 
     * @param type
     *        The type of health check that you want to create, which indicates how Route 53 determines whether an
     *        endpoint is healthy.</p> <important>
     *        <p>
     *        You can't change the value of <code>Type</code> after you create a health check.
     *        </p>
     *        </important>
     *        <p>
     *        You can create the following types of health checks:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>HTTP</b>: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an HTTP request
     *        and waits for an HTTP status code of 200 or greater and less than 400.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>HTTPS</b>: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an HTTPS
     *        request and waits for an HTTP status code of 200 or greater and less than 400.
     *        </p>
     *        <important>
     *        <p>
     *        If you specify HTTPS for the value of <code>Type</code>, the endpoint must support TLS v1.0 or later.
     *        </p>
     *        </important></li>
     *        <li>
     *        <p>
     *        <b>TCP</b>: Route 53 tries to establish a TCP connection.
     *        </p>
     *        <p>
     *        If you specify <code>TCP</code> for <code>Type</code>, don't specify a value for <code>ResourcePath</code>
     *        .
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html"
     *        >How Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Route 53 Developer Guide</i>.
     * @see HealthCheckType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of health check that you want to create, which indicates how Route 53 determines whether an endpoint is
     * healthy.
     * </p>
     * <important>
     * <p>
     * You can't change the value of <code>Type</code> after you create a health check.
     * </p>
     * </important>
     * <p>
     * You can create the following types of health checks:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>HTTP</b>: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an HTTP request and
     * waits for an HTTP status code of 200 or greater and less than 400.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>HTTPS</b>: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an HTTPS request and
     * waits for an HTTP status code of 200 or greater and less than 400.
     * </p>
     * <important>
     * <p>
     * If you specify HTTPS for the value of <code>Type</code>, the endpoint must support TLS v1.0 or later.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <b>TCP</b>: Route 53 tries to establish a TCP connection.
     * </p>
     * <p>
     * If you specify <code>TCP</code> for <code>Type</code>, don't specify a value for <code>ResourcePath</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html">How
     * Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Route 53 Developer Guide</i>.
     * </p>
     * 
     * @return The type of health check that you want to create, which indicates how Route 53 determines whether an
     *         endpoint is healthy.</p> <important>
     *         <p>
     *         You can't change the value of <code>Type</code> after you create a health check.
     *         </p>
     *         </important>
     *         <p>
     *         You can create the following types of health checks:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>HTTP</b>: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an HTTP
     *         request and waits for an HTTP status code of 200 or greater and less than 400.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>HTTPS</b>: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an HTTPS
     *         request and waits for an HTTP status code of 200 or greater and less than 400.
     *         </p>
     *         <important>
     *         <p>
     *         If you specify HTTPS for the value of <code>Type</code>, the endpoint must support TLS v1.0 or later.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         <b>TCP</b>: Route 53 tries to establish a TCP connection.
     *         </p>
     *         <p>
     *         If you specify <code>TCP</code> for <code>Type</code>, don't specify a value for
     *         <code>ResourcePath</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html"
     *         >How Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Route 53 Developer Guide</i>.
     * @see HealthCheckType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of health check that you want to create, which indicates how Route 53 determines whether an endpoint is
     * healthy.
     * </p>
     * <important>
     * <p>
     * You can't change the value of <code>Type</code> after you create a health check.
     * </p>
     * </important>
     * <p>
     * You can create the following types of health checks:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>HTTP</b>: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an HTTP request and
     * waits for an HTTP status code of 200 or greater and less than 400.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>HTTPS</b>: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an HTTPS request and
     * waits for an HTTP status code of 200 or greater and less than 400.
     * </p>
     * <important>
     * <p>
     * If you specify HTTPS for the value of <code>Type</code>, the endpoint must support TLS v1.0 or later.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <b>TCP</b>: Route 53 tries to establish a TCP connection.
     * </p>
     * <p>
     * If you specify <code>TCP</code> for <code>Type</code>, don't specify a value for <code>ResourcePath</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html">How
     * Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Route 53 Developer Guide</i>.
     * </p>
     * 
     * @param type
     *        The type of health check that you want to create, which indicates how Route 53 determines whether an
     *        endpoint is healthy.</p> <important>
     *        <p>
     *        You can't change the value of <code>Type</code> after you create a health check.
     *        </p>
     *        </important>
     *        <p>
     *        You can create the following types of health checks:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>HTTP</b>: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an HTTP request
     *        and waits for an HTTP status code of 200 or greater and less than 400.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>HTTPS</b>: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an HTTPS
     *        request and waits for an HTTP status code of 200 or greater and less than 400.
     *        </p>
     *        <important>
     *        <p>
     *        If you specify HTTPS for the value of <code>Type</code>, the endpoint must support TLS v1.0 or later.
     *        </p>
     *        </important></li>
     *        <li>
     *        <p>
     *        <b>TCP</b>: Route 53 tries to establish a TCP connection.
     *        </p>
     *        <p>
     *        If you specify <code>TCP</code> for <code>Type</code>, don't specify a value for <code>ResourcePath</code>
     *        .
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html"
     *        >How Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Route 53 Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthCheckType
     */

    public HealthCheckConfig withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of health check that you want to create, which indicates how Route 53 determines whether an endpoint is
     * healthy.
     * </p>
     * <important>
     * <p>
     * You can't change the value of <code>Type</code> after you create a health check.
     * </p>
     * </important>
     * <p>
     * You can create the following types of health checks:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>HTTP</b>: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an HTTP request and
     * waits for an HTTP status code of 200 or greater and less than 400.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>HTTPS</b>: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an HTTPS request and
     * waits for an HTTP status code of 200 or greater and less than 400.
     * </p>
     * <important>
     * <p>
     * If you specify HTTPS for the value of <code>Type</code>, the endpoint must support TLS v1.0 or later.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <b>TCP</b>: Route 53 tries to establish a TCP connection.
     * </p>
     * <p>
     * If you specify <code>TCP</code> for <code>Type</code>, don't specify a value for <code>ResourcePath</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html">How
     * Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Route 53 Developer Guide</i>.
     * </p>
     * 
     * @param type
     *        The type of health check that you want to create, which indicates how Route 53 determines whether an
     *        endpoint is healthy.</p> <important>
     *        <p>
     *        You can't change the value of <code>Type</code> after you create a health check.
     *        </p>
     *        </important>
     *        <p>
     *        You can create the following types of health checks:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>HTTP</b>: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an HTTP request
     *        and waits for an HTTP status code of 200 or greater and less than 400.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>HTTPS</b>: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an HTTPS
     *        request and waits for an HTTP status code of 200 or greater and less than 400.
     *        </p>
     *        <important>
     *        <p>
     *        If you specify HTTPS for the value of <code>Type</code>, the endpoint must support TLS v1.0 or later.
     *        </p>
     *        </important></li>
     *        <li>
     *        <p>
     *        <b>TCP</b>: Route 53 tries to establish a TCP connection.
     *        </p>
     *        <p>
     *        If you specify <code>TCP</code> for <code>Type</code>, don't specify a value for <code>ResourcePath</code>
     *        .
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html"
     *        >How Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Route 53 Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthCheckType
     */

    public HealthCheckConfig withType(HealthCheckType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The path that you want Route 53 to request when performing health checks. The path can be any value for which
     * your endpoint will return an HTTP status code of 2xx or 3xx when the endpoint is healthy, such as the file
     * <code>/docs/route53-health-check.html</code>. Route 53 automatically adds the DNS name for the service. If you
     * don't specify a value for <code>ResourcePath</code>, the default value is <code>/</code>.
     * </p>
     * <p>
     * If you specify <code>TCP</code> for <code>Type</code>, you must <i>not</i> specify a value for
     * <code>ResourcePath</code>.
     * </p>
     * 
     * @param resourcePath
     *        The path that you want Route 53 to request when performing health checks. The path can be any value for
     *        which your endpoint will return an HTTP status code of 2xx or 3xx when the endpoint is healthy, such as
     *        the file <code>/docs/route53-health-check.html</code>. Route 53 automatically adds the DNS name for the
     *        service. If you don't specify a value for <code>ResourcePath</code>, the default value is <code>/</code>
     *        .</p>
     *        <p>
     *        If you specify <code>TCP</code> for <code>Type</code>, you must <i>not</i> specify a value for
     *        <code>ResourcePath</code>.
     */

    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    /**
     * <p>
     * The path that you want Route 53 to request when performing health checks. The path can be any value for which
     * your endpoint will return an HTTP status code of 2xx or 3xx when the endpoint is healthy, such as the file
     * <code>/docs/route53-health-check.html</code>. Route 53 automatically adds the DNS name for the service. If you
     * don't specify a value for <code>ResourcePath</code>, the default value is <code>/</code>.
     * </p>
     * <p>
     * If you specify <code>TCP</code> for <code>Type</code>, you must <i>not</i> specify a value for
     * <code>ResourcePath</code>.
     * </p>
     * 
     * @return The path that you want Route 53 to request when performing health checks. The path can be any value for
     *         which your endpoint will return an HTTP status code of 2xx or 3xx when the endpoint is healthy, such as
     *         the file <code>/docs/route53-health-check.html</code>. Route 53 automatically adds the DNS name for the
     *         service. If you don't specify a value for <code>ResourcePath</code>, the default value is <code>/</code>
     *         .</p>
     *         <p>
     *         If you specify <code>TCP</code> for <code>Type</code>, you must <i>not</i> specify a value for
     *         <code>ResourcePath</code>.
     */

    public String getResourcePath() {
        return this.resourcePath;
    }

    /**
     * <p>
     * The path that you want Route 53 to request when performing health checks. The path can be any value for which
     * your endpoint will return an HTTP status code of 2xx or 3xx when the endpoint is healthy, such as the file
     * <code>/docs/route53-health-check.html</code>. Route 53 automatically adds the DNS name for the service. If you
     * don't specify a value for <code>ResourcePath</code>, the default value is <code>/</code>.
     * </p>
     * <p>
     * If you specify <code>TCP</code> for <code>Type</code>, you must <i>not</i> specify a value for
     * <code>ResourcePath</code>.
     * </p>
     * 
     * @param resourcePath
     *        The path that you want Route 53 to request when performing health checks. The path can be any value for
     *        which your endpoint will return an HTTP status code of 2xx or 3xx when the endpoint is healthy, such as
     *        the file <code>/docs/route53-health-check.html</code>. Route 53 automatically adds the DNS name for the
     *        service. If you don't specify a value for <code>ResourcePath</code>, the default value is <code>/</code>
     *        .</p>
     *        <p>
     *        If you specify <code>TCP</code> for <code>Type</code>, you must <i>not</i> specify a value for
     *        <code>ResourcePath</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheckConfig withResourcePath(String resourcePath) {
        setResourcePath(resourcePath);
        return this;
    }

    /**
     * <p>
     * The number of consecutive health checks that an endpoint must pass or fail for Route 53 to change the current
     * status of the endpoint from unhealthy to healthy or vice versa. For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html">How
     * Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Route 53 Developer Guide</i>.
     * </p>
     * 
     * @param failureThreshold
     *        The number of consecutive health checks that an endpoint must pass or fail for Route 53 to change the
     *        current status of the endpoint from unhealthy to healthy or vice versa. For more information, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html"
     *        >How Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Route 53 Developer Guide</i>.
     */

    public void setFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    /**
     * <p>
     * The number of consecutive health checks that an endpoint must pass or fail for Route 53 to change the current
     * status of the endpoint from unhealthy to healthy or vice versa. For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html">How
     * Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Route 53 Developer Guide</i>.
     * </p>
     * 
     * @return The number of consecutive health checks that an endpoint must pass or fail for Route 53 to change the
     *         current status of the endpoint from unhealthy to healthy or vice versa. For more information, see <a
     *         href=
     *         "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html"
     *         >How Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Route 53 Developer Guide</i>.
     */

    public Integer getFailureThreshold() {
        return this.failureThreshold;
    }

    /**
     * <p>
     * The number of consecutive health checks that an endpoint must pass or fail for Route 53 to change the current
     * status of the endpoint from unhealthy to healthy or vice versa. For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html">How
     * Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Route 53 Developer Guide</i>.
     * </p>
     * 
     * @param failureThreshold
     *        The number of consecutive health checks that an endpoint must pass or fail for Route 53 to change the
     *        current status of the endpoint from unhealthy to healthy or vice versa. For more information, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html"
     *        >How Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Route 53 Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheckConfig withFailureThreshold(Integer failureThreshold) {
        setFailureThreshold(failureThreshold);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getResourcePath() != null)
            sb.append("ResourcePath: ").append(getResourcePath()).append(",");
        if (getFailureThreshold() != null)
            sb.append("FailureThreshold: ").append(getFailureThreshold());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HealthCheckConfig == false)
            return false;
        HealthCheckConfig other = (HealthCheckConfig) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getResourcePath() == null ^ this.getResourcePath() == null)
            return false;
        if (other.getResourcePath() != null && other.getResourcePath().equals(this.getResourcePath()) == false)
            return false;
        if (other.getFailureThreshold() == null ^ this.getFailureThreshold() == null)
            return false;
        if (other.getFailureThreshold() != null && other.getFailureThreshold().equals(this.getFailureThreshold()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getResourcePath() == null) ? 0 : getResourcePath().hashCode());
        hashCode = prime * hashCode + ((getFailureThreshold() == null) ? 0 : getFailureThreshold().hashCode());
        return hashCode;
    }

    @Override
    public HealthCheckConfig clone() {
        try {
            return (HealthCheckConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicediscovery.model.transform.HealthCheckConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
