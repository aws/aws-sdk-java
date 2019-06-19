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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A complex type that contains information about the health check.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/HealthCheckConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HealthCheckConfig implements Serializable, Cloneable {

    /**
     * <p>
     * The IPv4 or IPv6 IP address of the endpoint that you want Amazon Route 53 to perform health checks on. If you
     * don't specify a value for <code>IPAddress</code>, Route 53 sends a DNS request to resolve the domain name that
     * you specify in <code>FullyQualifiedDomainName</code> at the interval that you specify in
     * <code>RequestInterval</code>. Using an IP address returned by DNS, Route 53 then checks the health of the
     * endpoint.
     * </p>
     * <p>
     * Use one of the following formats for the value of <code>IPAddress</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>IPv4 address</b>: four values between 0 and 255, separated by periods (.), for example,
     * <code>192.0.2.44</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IPv6 address</b>: eight groups of four hexadecimal values, separated by colons (:), for example,
     * <code>2001:0db8:85a3:0000:0000:abcd:0001:2345</code>. You can also shorten IPv6 addresses as described in RFC
     * 5952, for example, <code>2001:db8:85a3::abcd:1:2345</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the endpoint is an EC2 instance, we recommend that you create an Elastic IP address, associate it with your
     * EC2 instance, and specify the Elastic IP address for <code>IPAddress</code>. This ensures that the IP address of
     * your instance will never change.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_UpdateHealthCheck.html#Route53-UpdateHealthCheck-request-FullyQualifiedDomainName"
     * >FullyQualifiedDomainName</a>.
     * </p>
     * <p>
     * Constraints: Route 53 can't check the health of endpoints for which the IP address is in local, private,
     * non-routable, or multicast ranges. For more information about IP addresses for which you can't create health
     * checks, see the following documents:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://tools.ietf.org/html/rfc5735">RFC 5735, Special Use IPv4 Addresses</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://tools.ietf.org/html/rfc6598">RFC 6598, IANA-Reserved IPv4 Prefix for Shared Address Space</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://tools.ietf.org/html/rfc5156">RFC 5156, Special-Use IPv6 Addresses</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When the value of <code>Type</code> is <code>CALCULATED</code> or <code>CLOUDWATCH_METRIC</code>, omit
     * <code>IPAddress</code>.
     * </p>
     */
    private String iPAddress;
    /**
     * <p>
     * The port on the endpoint on which you want Amazon Route 53 to perform health checks. Specify a value for
     * <code>Port</code> only when you specify a value for <code>IPAddress</code>.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The type of health check that you want to create, which indicates how Amazon Route 53 determines whether an
     * endpoint is healthy.
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
     * If you specify <code>HTTPS</code> for the value of <code>Type</code>, the endpoint must support TLS v1.0 or
     * later.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <b>HTTP_STR_MATCH</b>: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an HTTP
     * request and searches the first 5,120 bytes of the response body for the string that you specify in
     * <code>SearchString</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>HTTPS_STR_MATCH</b>: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an
     * <code>HTTPS</code> request and searches the first 5,120 bytes of the response body for the string that you
     * specify in <code>SearchString</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TCP</b>: Route 53 tries to establish a TCP connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CLOUDWATCH_METRIC</b>: The health check is associated with a CloudWatch alarm. If the state of the alarm is
     * <code>OK</code>, the health check is considered healthy. If the state is <code>ALARM</code>, the health check is
     * considered unhealthy. If CloudWatch doesn't have sufficient data to determine whether the state is
     * <code>OK</code> or <code>ALARM</code>, the health check status depends on the setting for
     * <code>InsufficientDataHealthStatus</code>: <code>Healthy</code>, <code>Unhealthy</code>, or
     * <code>LastKnownStatus</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CALCULATED</b>: For health checks that monitor the status of other health checks, Route 53 adds up the number
     * of health checks that Route 53 health checkers consider to be healthy and compares that number with the value of
     * <code>HealthThreshold</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html">How
     * Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The path, if any, that you want Amazon Route 53 to request when performing health checks. The path can be any
     * value for which your endpoint will return an HTTP status code of 2xx or 3xx when the endpoint is healthy, for
     * example, the file /docs/route53-health-check.html. You can also include query string parameters, for example,
     * <code>/welcome.html?language=jp&amp;login=y</code>.
     * </p>
     */
    private String resourcePath;
    /**
     * <p>
     * Amazon Route 53 behavior depends on whether you specify a value for <code>IPAddress</code>.
     * </p>
     * <p>
     * <b>If you specify a value for</b> <code>IPAddress</code>:
     * </p>
     * <p>
     * Amazon Route 53 sends health check requests to the specified IPv4 or IPv6 address and passes the value of
     * <code>FullyQualifiedDomainName</code> in the <code>Host</code> header for all health checks except TCP health
     * checks. This is typically the fully qualified DNS name of the endpoint on which you want Route 53 to perform
     * health checks.
     * </p>
     * <p>
     * When Route 53 checks the health of an endpoint, here is how it constructs the <code>Host</code> header:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify a value of <code>80</code> for <code>Port</code> and <code>HTTP</code> or
     * <code>HTTP_STR_MATCH</code> for <code>Type</code>, Route 53 passes the value of
     * <code>FullyQualifiedDomainName</code> to the endpoint in the Host header.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a value of <code>443</code> for <code>Port</code> and <code>HTTPS</code> or
     * <code>HTTPS_STR_MATCH</code> for <code>Type</code>, Route 53 passes the value of
     * <code>FullyQualifiedDomainName</code> to the endpoint in the <code>Host</code> header.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify another value for <code>Port</code> and any value except <code>TCP</code> for <code>Type</code>,
     * Route 53 passes <code>FullyQualifiedDomainName:Port</code> to the endpoint in the <code>Host</code> header.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value for <code>FullyQualifiedDomainName</code>, Route 53 substitutes the value of
     * <code>IPAddress</code> in the <code>Host</code> header in each of the preceding cases.
     * </p>
     * <p>
     * <b>If you don't specify a value for <code>IPAddress</code> </b>:
     * </p>
     * <p>
     * Route 53 sends a DNS request to the domain that you specify for <code>FullyQualifiedDomainName</code> at the
     * interval that you specify for <code>RequestInterval</code>. Using an IPv4 address that DNS returns, Route 53 then
     * checks the health of the endpoint.
     * </p>
     * <note>
     * <p>
     * If you don't specify a value for <code>IPAddress</code>, Route 53 uses only IPv4 to send health checks to the
     * endpoint. If there's no resource record set with a type of A for the name that you specify for
     * <code>FullyQualifiedDomainName</code>, the health check fails with a "DNS resolution failed" error.
     * </p>
     * </note>
     * <p>
     * If you want to check the health of weighted, latency, or failover resource record sets and you choose to specify
     * the endpoint only by <code>FullyQualifiedDomainName</code>, we recommend that you create a separate health check
     * for each endpoint. For example, create a health check for each HTTP server that is serving content for
     * www.example.com. For the value of <code>FullyQualifiedDomainName</code>, specify the domain name of the server
     * (such as us-east-2-www.example.com), not the name of the resource record sets (www.example.com).
     * </p>
     * <important>
     * <p>
     * In this configuration, if you create a health check for which the value of <code>FullyQualifiedDomainName</code>
     * matches the name of the resource record sets and you then associate the health check with those resource record
     * sets, health check results will be unpredictable.
     * </p>
     * </important>
     * <p>
     * In addition, if the value that you specify for <code>Type</code> is <code>HTTP</code>, <code>HTTPS</code>,
     * <code>HTTP_STR_MATCH</code>, or <code>HTTPS_STR_MATCH</code>, Route 53 passes the value of
     * <code>FullyQualifiedDomainName</code> in the <code>Host</code> header, as it does when you specify a value for
     * <code>IPAddress</code>. If the value of <code>Type</code> is <code>TCP</code>, Route 53 doesn't pass a
     * <code>Host</code> header.
     * </p>
     */
    private String fullyQualifiedDomainName;
    /**
     * <p>
     * If the value of Type is <code>HTTP_STR_MATCH</code> or <code>HTTP_STR_MATCH</code>, the string that you want
     * Amazon Route 53 to search for in the response body from the specified resource. If the string appears in the
     * response body, Route 53 considers the resource healthy.
     * </p>
     * <p>
     * Route 53 considers case when searching for <code>SearchString</code> in the response body.
     * </p>
     */
    private String searchString;
    /**
     * <p>
     * The number of seconds between the time that Amazon Route 53 gets a response from your endpoint and the time that
     * it sends the next health check request. Each Route 53 health checker makes requests at this interval.
     * </p>
     * <important>
     * <p>
     * You can't change the value of <code>RequestInterval</code> after you create a health check.
     * </p>
     * </important>
     * <p>
     * If you don't specify a value for <code>RequestInterval</code>, the default value is <code>30</code> seconds.
     * </p>
     */
    private Integer requestInterval;
    /**
     * <p>
     * The number of consecutive health checks that an endpoint must pass or fail for Amazon Route 53 to change the
     * current status of the endpoint from unhealthy to healthy or vice versa. For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html">How
     * Amazon Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * If you don't specify a value for <code>FailureThreshold</code>, the default value is three health checks.
     * </p>
     */
    private Integer failureThreshold;
    /**
     * <p>
     * Specify whether you want Amazon Route 53 to measure the latency between health checkers in multiple AWS regions
     * and your endpoint, and to display CloudWatch latency graphs on the <b>Health Checks</b> page in the Route 53
     * console.
     * </p>
     * <important>
     * <p>
     * You can't change the value of <code>MeasureLatency</code> after you create a health check.
     * </p>
     * </important>
     */
    private Boolean measureLatency;
    /**
     * <p>
     * Specify whether you want Amazon Route 53 to invert the status of a health check, for example, to consider a
     * health check unhealthy when it otherwise would be considered healthy.
     * </p>
     */
    private Boolean inverted;
    /**
     * <p>
     * Stops Route 53 from performing health checks. When you disable a health check, here's what happens:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Health checks that check the health of endpoints:</b> Route 53 stops submitting requests to your application,
     * server, or other resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Calculated health checks:</b> Route 53 stops aggregating the status of the referenced health checks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Health checks that monitor CloudWatch alarms:</b> Route 53 stops monitoring the corresponding CloudWatch
     * metrics.
     * </p>
     * </li>
     * </ul>
     * <p>
     * After you disable a health check, Route 53 considers the status of the health check to always be healthy. If you
     * configured DNS failover, Route 53 continues to route traffic to the corresponding resources. If you want to stop
     * routing traffic to a resource, change the value of <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_UpdateHealthCheck.html#Route53-UpdateHealthCheck-request-Inverted"
     * >Inverted</a>.
     * </p>
     * <p>
     * Charges for a health check still apply when the health check is disabled. For more information, see <a
     * href="http://aws.amazon.com/route53/pricing/">Amazon Route 53 Pricing</a>.
     * </p>
     */
    private Boolean disabled;
    /**
     * <p>
     * The number of child health checks that are associated with a <code>CALCULATED</code> health check that Amazon
     * Route 53 must consider healthy for the <code>CALCULATED</code> health check to be considered healthy. To specify
     * the child health checks that you want to associate with a <code>CALCULATED</code> health check, use the <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_UpdateHealthCheck.html#Route53-UpdateHealthCheck-request-ChildHealthChecks"
     * >ChildHealthChecks</a> element.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify a number greater than the number of child health checks, Route 53 always considers this health
     * check to be unhealthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify <code>0</code>, Route 53 always considers this health check to be healthy.
     * </p>
     * </li>
     * </ul>
     */
    private Integer healthThreshold;
    /**
     * <p>
     * (CALCULATED Health Checks Only) A complex type that contains one <code>ChildHealthCheck</code> element for each
     * health check that you want to associate with a <code>CALCULATED</code> health check.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> childHealthChecks;
    /**
     * <p>
     * Specify whether you want Amazon Route 53 to send the value of <code>FullyQualifiedDomainName</code> to the
     * endpoint in the <code>client_hello</code> message during TLS negotiation. This allows the endpoint to respond to
     * <code>HTTPS</code> health check requests with the applicable SSL/TLS certificate.
     * </p>
     * <p>
     * Some endpoints require that <code>HTTPS</code> requests include the host name in the <code>client_hello</code>
     * message. If you don't enable SNI, the status of the health check will be <code>SSL alert handshake_failure</code>
     * . A health check can also have that status for other reasons. If SNI is enabled and you're still getting the
     * error, check the SSL/TLS configuration on your endpoint and confirm that your certificate is valid.
     * </p>
     * <p>
     * The SSL/TLS certificate on your endpoint includes a domain name in the <code>Common Name</code> field and
     * possibly several more in the <code>Subject Alternative Names</code> field. One of the domain names in the
     * certificate should match the value that you specify for <code>FullyQualifiedDomainName</code>. If the endpoint
     * responds to the <code>client_hello</code> message with a certificate that does not include the domain name that
     * you specified in <code>FullyQualifiedDomainName</code>, a health checker will retry the handshake. In the second
     * attempt, the health checker will omit <code>FullyQualifiedDomainName</code> from the <code>client_hello</code>
     * message.
     * </p>
     */
    private Boolean enableSNI;
    /**
     * <p>
     * A complex type that contains one <code>Region</code> element for each region from which you want Amazon Route 53
     * health checkers to check the specified endpoint.
     * </p>
     * <p>
     * If you don't specify any regions, Route 53 health checkers automatically performs checks from all of the regions
     * that are listed under <b>Valid Values</b>.
     * </p>
     * <p>
     * If you update a health check to remove a region that has been performing health checks, Route 53 will briefly
     * continue to perform checks from that region to ensure that some health checkers are always checking the endpoint
     * (for example, if you replace three regions with four different regions).
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> regions;
    /**
     * <p>
     * A complex type that identifies the CloudWatch alarm that you want Amazon Route 53 health checkers to use to
     * determine whether the specified health check is healthy.
     * </p>
     */
    private AlarmIdentifier alarmIdentifier;
    /**
     * <p>
     * When CloudWatch has insufficient data about the metric to determine the alarm state, the status that you want
     * Amazon Route 53 to assign to the health check:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Healthy</code>: Route 53 considers the health check to be healthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unhealthy</code>: Route 53 considers the health check to be unhealthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastKnownStatus</code>: Route 53 uses the status of the health check from the last time that CloudWatch had
     * sufficient data to determine the alarm state. For new health checks that have no last known status, the default
     * status for the health check is healthy.
     * </p>
     * </li>
     * </ul>
     */
    private String insufficientDataHealthStatus;

    /**
     * <p>
     * The IPv4 or IPv6 IP address of the endpoint that you want Amazon Route 53 to perform health checks on. If you
     * don't specify a value for <code>IPAddress</code>, Route 53 sends a DNS request to resolve the domain name that
     * you specify in <code>FullyQualifiedDomainName</code> at the interval that you specify in
     * <code>RequestInterval</code>. Using an IP address returned by DNS, Route 53 then checks the health of the
     * endpoint.
     * </p>
     * <p>
     * Use one of the following formats for the value of <code>IPAddress</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>IPv4 address</b>: four values between 0 and 255, separated by periods (.), for example,
     * <code>192.0.2.44</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IPv6 address</b>: eight groups of four hexadecimal values, separated by colons (:), for example,
     * <code>2001:0db8:85a3:0000:0000:abcd:0001:2345</code>. You can also shorten IPv6 addresses as described in RFC
     * 5952, for example, <code>2001:db8:85a3::abcd:1:2345</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the endpoint is an EC2 instance, we recommend that you create an Elastic IP address, associate it with your
     * EC2 instance, and specify the Elastic IP address for <code>IPAddress</code>. This ensures that the IP address of
     * your instance will never change.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_UpdateHealthCheck.html#Route53-UpdateHealthCheck-request-FullyQualifiedDomainName"
     * >FullyQualifiedDomainName</a>.
     * </p>
     * <p>
     * Constraints: Route 53 can't check the health of endpoints for which the IP address is in local, private,
     * non-routable, or multicast ranges. For more information about IP addresses for which you can't create health
     * checks, see the following documents:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://tools.ietf.org/html/rfc5735">RFC 5735, Special Use IPv4 Addresses</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://tools.ietf.org/html/rfc6598">RFC 6598, IANA-Reserved IPv4 Prefix for Shared Address Space</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://tools.ietf.org/html/rfc5156">RFC 5156, Special-Use IPv6 Addresses</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When the value of <code>Type</code> is <code>CALCULATED</code> or <code>CLOUDWATCH_METRIC</code>, omit
     * <code>IPAddress</code>.
     * </p>
     * 
     * @param iPAddress
     *        The IPv4 or IPv6 IP address of the endpoint that you want Amazon Route 53 to perform health checks on. If
     *        you don't specify a value for <code>IPAddress</code>, Route 53 sends a DNS request to resolve the domain
     *        name that you specify in <code>FullyQualifiedDomainName</code> at the interval that you specify in
     *        <code>RequestInterval</code>. Using an IP address returned by DNS, Route 53 then checks the health of the
     *        endpoint.</p>
     *        <p>
     *        Use one of the following formats for the value of <code>IPAddress</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>IPv4 address</b>: four values between 0 and 255, separated by periods (.), for example,
     *        <code>192.0.2.44</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>IPv6 address</b>: eight groups of four hexadecimal values, separated by colons (:), for example,
     *        <code>2001:0db8:85a3:0000:0000:abcd:0001:2345</code>. You can also shorten IPv6 addresses as described in
     *        RFC 5952, for example, <code>2001:db8:85a3::abcd:1:2345</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the endpoint is an EC2 instance, we recommend that you create an Elastic IP address, associate it with
     *        your EC2 instance, and specify the Elastic IP address for <code>IPAddress</code>. This ensures that the IP
     *        address of your instance will never change.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/Route53/latest/APIReference/API_UpdateHealthCheck.html#Route53-UpdateHealthCheck-request-FullyQualifiedDomainName"
     *        >FullyQualifiedDomainName</a>.
     *        </p>
     *        <p>
     *        Constraints: Route 53 can't check the health of endpoints for which the IP address is in local, private,
     *        non-routable, or multicast ranges. For more information about IP addresses for which you can't create
     *        health checks, see the following documents:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a href="https://tools.ietf.org/html/rfc5735">RFC 5735, Special Use IPv4 Addresses</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://tools.ietf.org/html/rfc6598">RFC 6598, IANA-Reserved IPv4 Prefix for Shared Address
     *        Space</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://tools.ietf.org/html/rfc5156">RFC 5156, Special-Use IPv6 Addresses</a>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When the value of <code>Type</code> is <code>CALCULATED</code> or <code>CLOUDWATCH_METRIC</code>, omit
     *        <code>IPAddress</code>.
     */

    public void setIPAddress(String iPAddress) {
        this.iPAddress = iPAddress;
    }

    /**
     * <p>
     * The IPv4 or IPv6 IP address of the endpoint that you want Amazon Route 53 to perform health checks on. If you
     * don't specify a value for <code>IPAddress</code>, Route 53 sends a DNS request to resolve the domain name that
     * you specify in <code>FullyQualifiedDomainName</code> at the interval that you specify in
     * <code>RequestInterval</code>. Using an IP address returned by DNS, Route 53 then checks the health of the
     * endpoint.
     * </p>
     * <p>
     * Use one of the following formats for the value of <code>IPAddress</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>IPv4 address</b>: four values between 0 and 255, separated by periods (.), for example,
     * <code>192.0.2.44</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IPv6 address</b>: eight groups of four hexadecimal values, separated by colons (:), for example,
     * <code>2001:0db8:85a3:0000:0000:abcd:0001:2345</code>. You can also shorten IPv6 addresses as described in RFC
     * 5952, for example, <code>2001:db8:85a3::abcd:1:2345</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the endpoint is an EC2 instance, we recommend that you create an Elastic IP address, associate it with your
     * EC2 instance, and specify the Elastic IP address for <code>IPAddress</code>. This ensures that the IP address of
     * your instance will never change.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_UpdateHealthCheck.html#Route53-UpdateHealthCheck-request-FullyQualifiedDomainName"
     * >FullyQualifiedDomainName</a>.
     * </p>
     * <p>
     * Constraints: Route 53 can't check the health of endpoints for which the IP address is in local, private,
     * non-routable, or multicast ranges. For more information about IP addresses for which you can't create health
     * checks, see the following documents:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://tools.ietf.org/html/rfc5735">RFC 5735, Special Use IPv4 Addresses</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://tools.ietf.org/html/rfc6598">RFC 6598, IANA-Reserved IPv4 Prefix for Shared Address Space</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://tools.ietf.org/html/rfc5156">RFC 5156, Special-Use IPv6 Addresses</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When the value of <code>Type</code> is <code>CALCULATED</code> or <code>CLOUDWATCH_METRIC</code>, omit
     * <code>IPAddress</code>.
     * </p>
     * 
     * @return The IPv4 or IPv6 IP address of the endpoint that you want Amazon Route 53 to perform health checks on. If
     *         you don't specify a value for <code>IPAddress</code>, Route 53 sends a DNS request to resolve the domain
     *         name that you specify in <code>FullyQualifiedDomainName</code> at the interval that you specify in
     *         <code>RequestInterval</code>. Using an IP address returned by DNS, Route 53 then checks the health of the
     *         endpoint.</p>
     *         <p>
     *         Use one of the following formats for the value of <code>IPAddress</code>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>IPv4 address</b>: four values between 0 and 255, separated by periods (.), for example,
     *         <code>192.0.2.44</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>IPv6 address</b>: eight groups of four hexadecimal values, separated by colons (:), for example,
     *         <code>2001:0db8:85a3:0000:0000:abcd:0001:2345</code>. You can also shorten IPv6 addresses as described in
     *         RFC 5952, for example, <code>2001:db8:85a3::abcd:1:2345</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If the endpoint is an EC2 instance, we recommend that you create an Elastic IP address, associate it with
     *         your EC2 instance, and specify the Elastic IP address for <code>IPAddress</code>. This ensures that the
     *         IP address of your instance will never change.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/APIReference/API_UpdateHealthCheck.html#Route53-UpdateHealthCheck-request-FullyQualifiedDomainName"
     *         >FullyQualifiedDomainName</a>.
     *         </p>
     *         <p>
     *         Constraints: Route 53 can't check the health of endpoints for which the IP address is in local, private,
     *         non-routable, or multicast ranges. For more information about IP addresses for which you can't create
     *         health checks, see the following documents:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a href="https://tools.ietf.org/html/rfc5735">RFC 5735, Special Use IPv4 Addresses</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href="https://tools.ietf.org/html/rfc6598">RFC 6598, IANA-Reserved IPv4 Prefix for Shared Address
     *         Space</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href="https://tools.ietf.org/html/rfc5156">RFC 5156, Special-Use IPv6 Addresses</a>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When the value of <code>Type</code> is <code>CALCULATED</code> or <code>CLOUDWATCH_METRIC</code>, omit
     *         <code>IPAddress</code>.
     */

    public String getIPAddress() {
        return this.iPAddress;
    }

    /**
     * <p>
     * The IPv4 or IPv6 IP address of the endpoint that you want Amazon Route 53 to perform health checks on. If you
     * don't specify a value for <code>IPAddress</code>, Route 53 sends a DNS request to resolve the domain name that
     * you specify in <code>FullyQualifiedDomainName</code> at the interval that you specify in
     * <code>RequestInterval</code>. Using an IP address returned by DNS, Route 53 then checks the health of the
     * endpoint.
     * </p>
     * <p>
     * Use one of the following formats for the value of <code>IPAddress</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>IPv4 address</b>: four values between 0 and 255, separated by periods (.), for example,
     * <code>192.0.2.44</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>IPv6 address</b>: eight groups of four hexadecimal values, separated by colons (:), for example,
     * <code>2001:0db8:85a3:0000:0000:abcd:0001:2345</code>. You can also shorten IPv6 addresses as described in RFC
     * 5952, for example, <code>2001:db8:85a3::abcd:1:2345</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the endpoint is an EC2 instance, we recommend that you create an Elastic IP address, associate it with your
     * EC2 instance, and specify the Elastic IP address for <code>IPAddress</code>. This ensures that the IP address of
     * your instance will never change.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_UpdateHealthCheck.html#Route53-UpdateHealthCheck-request-FullyQualifiedDomainName"
     * >FullyQualifiedDomainName</a>.
     * </p>
     * <p>
     * Constraints: Route 53 can't check the health of endpoints for which the IP address is in local, private,
     * non-routable, or multicast ranges. For more information about IP addresses for which you can't create health
     * checks, see the following documents:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://tools.ietf.org/html/rfc5735">RFC 5735, Special Use IPv4 Addresses</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://tools.ietf.org/html/rfc6598">RFC 6598, IANA-Reserved IPv4 Prefix for Shared Address Space</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://tools.ietf.org/html/rfc5156">RFC 5156, Special-Use IPv6 Addresses</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When the value of <code>Type</code> is <code>CALCULATED</code> or <code>CLOUDWATCH_METRIC</code>, omit
     * <code>IPAddress</code>.
     * </p>
     * 
     * @param iPAddress
     *        The IPv4 or IPv6 IP address of the endpoint that you want Amazon Route 53 to perform health checks on. If
     *        you don't specify a value for <code>IPAddress</code>, Route 53 sends a DNS request to resolve the domain
     *        name that you specify in <code>FullyQualifiedDomainName</code> at the interval that you specify in
     *        <code>RequestInterval</code>. Using an IP address returned by DNS, Route 53 then checks the health of the
     *        endpoint.</p>
     *        <p>
     *        Use one of the following formats for the value of <code>IPAddress</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>IPv4 address</b>: four values between 0 and 255, separated by periods (.), for example,
     *        <code>192.0.2.44</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>IPv6 address</b>: eight groups of four hexadecimal values, separated by colons (:), for example,
     *        <code>2001:0db8:85a3:0000:0000:abcd:0001:2345</code>. You can also shorten IPv6 addresses as described in
     *        RFC 5952, for example, <code>2001:db8:85a3::abcd:1:2345</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If the endpoint is an EC2 instance, we recommend that you create an Elastic IP address, associate it with
     *        your EC2 instance, and specify the Elastic IP address for <code>IPAddress</code>. This ensures that the IP
     *        address of your instance will never change.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/Route53/latest/APIReference/API_UpdateHealthCheck.html#Route53-UpdateHealthCheck-request-FullyQualifiedDomainName"
     *        >FullyQualifiedDomainName</a>.
     *        </p>
     *        <p>
     *        Constraints: Route 53 can't check the health of endpoints for which the IP address is in local, private,
     *        non-routable, or multicast ranges. For more information about IP addresses for which you can't create
     *        health checks, see the following documents:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a href="https://tools.ietf.org/html/rfc5735">RFC 5735, Special Use IPv4 Addresses</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://tools.ietf.org/html/rfc6598">RFC 6598, IANA-Reserved IPv4 Prefix for Shared Address
     *        Space</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://tools.ietf.org/html/rfc5156">RFC 5156, Special-Use IPv6 Addresses</a>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When the value of <code>Type</code> is <code>CALCULATED</code> or <code>CLOUDWATCH_METRIC</code>, omit
     *        <code>IPAddress</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheckConfig withIPAddress(String iPAddress) {
        setIPAddress(iPAddress);
        return this;
    }

    /**
     * <p>
     * The port on the endpoint on which you want Amazon Route 53 to perform health checks. Specify a value for
     * <code>Port</code> only when you specify a value for <code>IPAddress</code>.
     * </p>
     * 
     * @param port
     *        The port on the endpoint on which you want Amazon Route 53 to perform health checks. Specify a value for
     *        <code>Port</code> only when you specify a value for <code>IPAddress</code>.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port on the endpoint on which you want Amazon Route 53 to perform health checks. Specify a value for
     * <code>Port</code> only when you specify a value for <code>IPAddress</code>.
     * </p>
     * 
     * @return The port on the endpoint on which you want Amazon Route 53 to perform health checks. Specify a value for
     *         <code>Port</code> only when you specify a value for <code>IPAddress</code>.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port on the endpoint on which you want Amazon Route 53 to perform health checks. Specify a value for
     * <code>Port</code> only when you specify a value for <code>IPAddress</code>.
     * </p>
     * 
     * @param port
     *        The port on the endpoint on which you want Amazon Route 53 to perform health checks. Specify a value for
     *        <code>Port</code> only when you specify a value for <code>IPAddress</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheckConfig withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The type of health check that you want to create, which indicates how Amazon Route 53 determines whether an
     * endpoint is healthy.
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
     * If you specify <code>HTTPS</code> for the value of <code>Type</code>, the endpoint must support TLS v1.0 or
     * later.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <b>HTTP_STR_MATCH</b>: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an HTTP
     * request and searches the first 5,120 bytes of the response body for the string that you specify in
     * <code>SearchString</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>HTTPS_STR_MATCH</b>: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an
     * <code>HTTPS</code> request and searches the first 5,120 bytes of the response body for the string that you
     * specify in <code>SearchString</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TCP</b>: Route 53 tries to establish a TCP connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CLOUDWATCH_METRIC</b>: The health check is associated with a CloudWatch alarm. If the state of the alarm is
     * <code>OK</code>, the health check is considered healthy. If the state is <code>ALARM</code>, the health check is
     * considered unhealthy. If CloudWatch doesn't have sufficient data to determine whether the state is
     * <code>OK</code> or <code>ALARM</code>, the health check status depends on the setting for
     * <code>InsufficientDataHealthStatus</code>: <code>Healthy</code>, <code>Unhealthy</code>, or
     * <code>LastKnownStatus</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CALCULATED</b>: For health checks that monitor the status of other health checks, Route 53 adds up the number
     * of health checks that Route 53 health checkers consider to be healthy and compares that number with the value of
     * <code>HealthThreshold</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html">How
     * Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * 
     * @param type
     *        The type of health check that you want to create, which indicates how Amazon Route 53 determines whether
     *        an endpoint is healthy.</p> <important>
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
     *        If you specify <code>HTTPS</code> for the value of <code>Type</code>, the endpoint must support TLS v1.0
     *        or later.
     *        </p>
     *        </important></li>
     *        <li>
     *        <p>
     *        <b>HTTP_STR_MATCH</b>: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an
     *        HTTP request and searches the first 5,120 bytes of the response body for the string that you specify in
     *        <code>SearchString</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>HTTPS_STR_MATCH</b>: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an
     *        <code>HTTPS</code> request and searches the first 5,120 bytes of the response body for the string that you
     *        specify in <code>SearchString</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>TCP</b>: Route 53 tries to establish a TCP connection.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CLOUDWATCH_METRIC</b>: The health check is associated with a CloudWatch alarm. If the state of the
     *        alarm is <code>OK</code>, the health check is considered healthy. If the state is <code>ALARM</code>, the
     *        health check is considered unhealthy. If CloudWatch doesn't have sufficient data to determine whether the
     *        state is <code>OK</code> or <code>ALARM</code>, the health check status depends on the setting for
     *        <code>InsufficientDataHealthStatus</code>: <code>Healthy</code>, <code>Unhealthy</code>, or
     *        <code>LastKnownStatus</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CALCULATED</b>: For health checks that monitor the status of other health checks, Route 53 adds up the
     *        number of health checks that Route 53 health checkers consider to be healthy and compares that number with
     *        the value of <code>HealthThreshold</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html"
     *        >How Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * @see HealthCheckType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of health check that you want to create, which indicates how Amazon Route 53 determines whether an
     * endpoint is healthy.
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
     * If you specify <code>HTTPS</code> for the value of <code>Type</code>, the endpoint must support TLS v1.0 or
     * later.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <b>HTTP_STR_MATCH</b>: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an HTTP
     * request and searches the first 5,120 bytes of the response body for the string that you specify in
     * <code>SearchString</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>HTTPS_STR_MATCH</b>: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an
     * <code>HTTPS</code> request and searches the first 5,120 bytes of the response body for the string that you
     * specify in <code>SearchString</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TCP</b>: Route 53 tries to establish a TCP connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CLOUDWATCH_METRIC</b>: The health check is associated with a CloudWatch alarm. If the state of the alarm is
     * <code>OK</code>, the health check is considered healthy. If the state is <code>ALARM</code>, the health check is
     * considered unhealthy. If CloudWatch doesn't have sufficient data to determine whether the state is
     * <code>OK</code> or <code>ALARM</code>, the health check status depends on the setting for
     * <code>InsufficientDataHealthStatus</code>: <code>Healthy</code>, <code>Unhealthy</code>, or
     * <code>LastKnownStatus</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CALCULATED</b>: For health checks that monitor the status of other health checks, Route 53 adds up the number
     * of health checks that Route 53 health checkers consider to be healthy and compares that number with the value of
     * <code>HealthThreshold</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html">How
     * Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * 
     * @return The type of health check that you want to create, which indicates how Amazon Route 53 determines whether
     *         an endpoint is healthy.</p> <important>
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
     *         If you specify <code>HTTPS</code> for the value of <code>Type</code>, the endpoint must support TLS v1.0
     *         or later.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         <b>HTTP_STR_MATCH</b>: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an
     *         HTTP request and searches the first 5,120 bytes of the response body for the string that you specify in
     *         <code>SearchString</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>HTTPS_STR_MATCH</b>: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an
     *         <code>HTTPS</code> request and searches the first 5,120 bytes of the response body for the string that
     *         you specify in <code>SearchString</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>TCP</b>: Route 53 tries to establish a TCP connection.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>CLOUDWATCH_METRIC</b>: The health check is associated with a CloudWatch alarm. If the state of the
     *         alarm is <code>OK</code>, the health check is considered healthy. If the state is <code>ALARM</code>, the
     *         health check is considered unhealthy. If CloudWatch doesn't have sufficient data to determine whether the
     *         state is <code>OK</code> or <code>ALARM</code>, the health check status depends on the setting for
     *         <code>InsufficientDataHealthStatus</code>: <code>Healthy</code>, <code>Unhealthy</code>, or
     *         <code>LastKnownStatus</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>CALCULATED</b>: For health checks that monitor the status of other health checks, Route 53 adds up the
     *         number of health checks that Route 53 health checkers consider to be healthy and compares that number
     *         with the value of <code>HealthThreshold</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html"
     *         >How Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Amazon Route 53 Developer
     *         Guide</i>.
     * @see HealthCheckType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of health check that you want to create, which indicates how Amazon Route 53 determines whether an
     * endpoint is healthy.
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
     * If you specify <code>HTTPS</code> for the value of <code>Type</code>, the endpoint must support TLS v1.0 or
     * later.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <b>HTTP_STR_MATCH</b>: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an HTTP
     * request and searches the first 5,120 bytes of the response body for the string that you specify in
     * <code>SearchString</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>HTTPS_STR_MATCH</b>: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an
     * <code>HTTPS</code> request and searches the first 5,120 bytes of the response body for the string that you
     * specify in <code>SearchString</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TCP</b>: Route 53 tries to establish a TCP connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CLOUDWATCH_METRIC</b>: The health check is associated with a CloudWatch alarm. If the state of the alarm is
     * <code>OK</code>, the health check is considered healthy. If the state is <code>ALARM</code>, the health check is
     * considered unhealthy. If CloudWatch doesn't have sufficient data to determine whether the state is
     * <code>OK</code> or <code>ALARM</code>, the health check status depends on the setting for
     * <code>InsufficientDataHealthStatus</code>: <code>Healthy</code>, <code>Unhealthy</code>, or
     * <code>LastKnownStatus</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CALCULATED</b>: For health checks that monitor the status of other health checks, Route 53 adds up the number
     * of health checks that Route 53 health checkers consider to be healthy and compares that number with the value of
     * <code>HealthThreshold</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html">How
     * Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * 
     * @param type
     *        The type of health check that you want to create, which indicates how Amazon Route 53 determines whether
     *        an endpoint is healthy.</p> <important>
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
     *        If you specify <code>HTTPS</code> for the value of <code>Type</code>, the endpoint must support TLS v1.0
     *        or later.
     *        </p>
     *        </important></li>
     *        <li>
     *        <p>
     *        <b>HTTP_STR_MATCH</b>: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an
     *        HTTP request and searches the first 5,120 bytes of the response body for the string that you specify in
     *        <code>SearchString</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>HTTPS_STR_MATCH</b>: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an
     *        <code>HTTPS</code> request and searches the first 5,120 bytes of the response body for the string that you
     *        specify in <code>SearchString</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>TCP</b>: Route 53 tries to establish a TCP connection.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CLOUDWATCH_METRIC</b>: The health check is associated with a CloudWatch alarm. If the state of the
     *        alarm is <code>OK</code>, the health check is considered healthy. If the state is <code>ALARM</code>, the
     *        health check is considered unhealthy. If CloudWatch doesn't have sufficient data to determine whether the
     *        state is <code>OK</code> or <code>ALARM</code>, the health check status depends on the setting for
     *        <code>InsufficientDataHealthStatus</code>: <code>Healthy</code>, <code>Unhealthy</code>, or
     *        <code>LastKnownStatus</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CALCULATED</b>: For health checks that monitor the status of other health checks, Route 53 adds up the
     *        number of health checks that Route 53 health checkers consider to be healthy and compares that number with
     *        the value of <code>HealthThreshold</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html"
     *        >How Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthCheckType
     */

    public HealthCheckConfig withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of health check that you want to create, which indicates how Amazon Route 53 determines whether an
     * endpoint is healthy.
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
     * If you specify <code>HTTPS</code> for the value of <code>Type</code>, the endpoint must support TLS v1.0 or
     * later.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <b>HTTP_STR_MATCH</b>: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an HTTP
     * request and searches the first 5,120 bytes of the response body for the string that you specify in
     * <code>SearchString</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>HTTPS_STR_MATCH</b>: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an
     * <code>HTTPS</code> request and searches the first 5,120 bytes of the response body for the string that you
     * specify in <code>SearchString</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TCP</b>: Route 53 tries to establish a TCP connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CLOUDWATCH_METRIC</b>: The health check is associated with a CloudWatch alarm. If the state of the alarm is
     * <code>OK</code>, the health check is considered healthy. If the state is <code>ALARM</code>, the health check is
     * considered unhealthy. If CloudWatch doesn't have sufficient data to determine whether the state is
     * <code>OK</code> or <code>ALARM</code>, the health check status depends on the setting for
     * <code>InsufficientDataHealthStatus</code>: <code>Healthy</code>, <code>Unhealthy</code>, or
     * <code>LastKnownStatus</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CALCULATED</b>: For health checks that monitor the status of other health checks, Route 53 adds up the number
     * of health checks that Route 53 health checkers consider to be healthy and compares that number with the value of
     * <code>HealthThreshold</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html">How
     * Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * 
     * @param type
     *        The type of health check that you want to create, which indicates how Amazon Route 53 determines whether
     *        an endpoint is healthy.</p> <important>
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
     *        If you specify <code>HTTPS</code> for the value of <code>Type</code>, the endpoint must support TLS v1.0
     *        or later.
     *        </p>
     *        </important></li>
     *        <li>
     *        <p>
     *        <b>HTTP_STR_MATCH</b>: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an
     *        HTTP request and searches the first 5,120 bytes of the response body for the string that you specify in
     *        <code>SearchString</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>HTTPS_STR_MATCH</b>: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an
     *        <code>HTTPS</code> request and searches the first 5,120 bytes of the response body for the string that you
     *        specify in <code>SearchString</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>TCP</b>: Route 53 tries to establish a TCP connection.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CLOUDWATCH_METRIC</b>: The health check is associated with a CloudWatch alarm. If the state of the
     *        alarm is <code>OK</code>, the health check is considered healthy. If the state is <code>ALARM</code>, the
     *        health check is considered unhealthy. If CloudWatch doesn't have sufficient data to determine whether the
     *        state is <code>OK</code> or <code>ALARM</code>, the health check status depends on the setting for
     *        <code>InsufficientDataHealthStatus</code>: <code>Healthy</code>, <code>Unhealthy</code>, or
     *        <code>LastKnownStatus</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CALCULATED</b>: For health checks that monitor the status of other health checks, Route 53 adds up the
     *        number of health checks that Route 53 health checkers consider to be healthy and compares that number with
     *        the value of <code>HealthThreshold</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html"
     *        >How Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * @see HealthCheckType
     */

    public void setType(HealthCheckType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of health check that you want to create, which indicates how Amazon Route 53 determines whether an
     * endpoint is healthy.
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
     * If you specify <code>HTTPS</code> for the value of <code>Type</code>, the endpoint must support TLS v1.0 or
     * later.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <b>HTTP_STR_MATCH</b>: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an HTTP
     * request and searches the first 5,120 bytes of the response body for the string that you specify in
     * <code>SearchString</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>HTTPS_STR_MATCH</b>: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an
     * <code>HTTPS</code> request and searches the first 5,120 bytes of the response body for the string that you
     * specify in <code>SearchString</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TCP</b>: Route 53 tries to establish a TCP connection.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CLOUDWATCH_METRIC</b>: The health check is associated with a CloudWatch alarm. If the state of the alarm is
     * <code>OK</code>, the health check is considered healthy. If the state is <code>ALARM</code>, the health check is
     * considered unhealthy. If CloudWatch doesn't have sufficient data to determine whether the state is
     * <code>OK</code> or <code>ALARM</code>, the health check status depends on the setting for
     * <code>InsufficientDataHealthStatus</code>: <code>Healthy</code>, <code>Unhealthy</code>, or
     * <code>LastKnownStatus</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CALCULATED</b>: For health checks that monitor the status of other health checks, Route 53 adds up the number
     * of health checks that Route 53 health checkers consider to be healthy and compares that number with the value of
     * <code>HealthThreshold</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html">How
     * Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * 
     * @param type
     *        The type of health check that you want to create, which indicates how Amazon Route 53 determines whether
     *        an endpoint is healthy.</p> <important>
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
     *        If you specify <code>HTTPS</code> for the value of <code>Type</code>, the endpoint must support TLS v1.0
     *        or later.
     *        </p>
     *        </important></li>
     *        <li>
     *        <p>
     *        <b>HTTP_STR_MATCH</b>: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an
     *        HTTP request and searches the first 5,120 bytes of the response body for the string that you specify in
     *        <code>SearchString</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>HTTPS_STR_MATCH</b>: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an
     *        <code>HTTPS</code> request and searches the first 5,120 bytes of the response body for the string that you
     *        specify in <code>SearchString</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>TCP</b>: Route 53 tries to establish a TCP connection.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CLOUDWATCH_METRIC</b>: The health check is associated with a CloudWatch alarm. If the state of the
     *        alarm is <code>OK</code>, the health check is considered healthy. If the state is <code>ALARM</code>, the
     *        health check is considered unhealthy. If CloudWatch doesn't have sufficient data to determine whether the
     *        state is <code>OK</code> or <code>ALARM</code>, the health check status depends on the setting for
     *        <code>InsufficientDataHealthStatus</code>: <code>Healthy</code>, <code>Unhealthy</code>, or
     *        <code>LastKnownStatus</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CALCULATED</b>: For health checks that monitor the status of other health checks, Route 53 adds up the
     *        number of health checks that Route 53 health checkers consider to be healthy and compares that number with
     *        the value of <code>HealthThreshold</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html"
     *        >How Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthCheckType
     */

    public HealthCheckConfig withType(HealthCheckType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The path, if any, that you want Amazon Route 53 to request when performing health checks. The path can be any
     * value for which your endpoint will return an HTTP status code of 2xx or 3xx when the endpoint is healthy, for
     * example, the file /docs/route53-health-check.html. You can also include query string parameters, for example,
     * <code>/welcome.html?language=jp&amp;login=y</code>.
     * </p>
     * 
     * @param resourcePath
     *        The path, if any, that you want Amazon Route 53 to request when performing health checks. The path can be
     *        any value for which your endpoint will return an HTTP status code of 2xx or 3xx when the endpoint is
     *        healthy, for example, the file /docs/route53-health-check.html. You can also include query string
     *        parameters, for example, <code>/welcome.html?language=jp&amp;login=y</code>.
     */

    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    /**
     * <p>
     * The path, if any, that you want Amazon Route 53 to request when performing health checks. The path can be any
     * value for which your endpoint will return an HTTP status code of 2xx or 3xx when the endpoint is healthy, for
     * example, the file /docs/route53-health-check.html. You can also include query string parameters, for example,
     * <code>/welcome.html?language=jp&amp;login=y</code>.
     * </p>
     * 
     * @return The path, if any, that you want Amazon Route 53 to request when performing health checks. The path can be
     *         any value for which your endpoint will return an HTTP status code of 2xx or 3xx when the endpoint is
     *         healthy, for example, the file /docs/route53-health-check.html. You can also include query string
     *         parameters, for example, <code>/welcome.html?language=jp&amp;login=y</code>.
     */

    public String getResourcePath() {
        return this.resourcePath;
    }

    /**
     * <p>
     * The path, if any, that you want Amazon Route 53 to request when performing health checks. The path can be any
     * value for which your endpoint will return an HTTP status code of 2xx or 3xx when the endpoint is healthy, for
     * example, the file /docs/route53-health-check.html. You can also include query string parameters, for example,
     * <code>/welcome.html?language=jp&amp;login=y</code>.
     * </p>
     * 
     * @param resourcePath
     *        The path, if any, that you want Amazon Route 53 to request when performing health checks. The path can be
     *        any value for which your endpoint will return an HTTP status code of 2xx or 3xx when the endpoint is
     *        healthy, for example, the file /docs/route53-health-check.html. You can also include query string
     *        parameters, for example, <code>/welcome.html?language=jp&amp;login=y</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheckConfig withResourcePath(String resourcePath) {
        setResourcePath(resourcePath);
        return this;
    }

    /**
     * <p>
     * Amazon Route 53 behavior depends on whether you specify a value for <code>IPAddress</code>.
     * </p>
     * <p>
     * <b>If you specify a value for</b> <code>IPAddress</code>:
     * </p>
     * <p>
     * Amazon Route 53 sends health check requests to the specified IPv4 or IPv6 address and passes the value of
     * <code>FullyQualifiedDomainName</code> in the <code>Host</code> header for all health checks except TCP health
     * checks. This is typically the fully qualified DNS name of the endpoint on which you want Route 53 to perform
     * health checks.
     * </p>
     * <p>
     * When Route 53 checks the health of an endpoint, here is how it constructs the <code>Host</code> header:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify a value of <code>80</code> for <code>Port</code> and <code>HTTP</code> or
     * <code>HTTP_STR_MATCH</code> for <code>Type</code>, Route 53 passes the value of
     * <code>FullyQualifiedDomainName</code> to the endpoint in the Host header.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a value of <code>443</code> for <code>Port</code> and <code>HTTPS</code> or
     * <code>HTTPS_STR_MATCH</code> for <code>Type</code>, Route 53 passes the value of
     * <code>FullyQualifiedDomainName</code> to the endpoint in the <code>Host</code> header.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify another value for <code>Port</code> and any value except <code>TCP</code> for <code>Type</code>,
     * Route 53 passes <code>FullyQualifiedDomainName:Port</code> to the endpoint in the <code>Host</code> header.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value for <code>FullyQualifiedDomainName</code>, Route 53 substitutes the value of
     * <code>IPAddress</code> in the <code>Host</code> header in each of the preceding cases.
     * </p>
     * <p>
     * <b>If you don't specify a value for <code>IPAddress</code> </b>:
     * </p>
     * <p>
     * Route 53 sends a DNS request to the domain that you specify for <code>FullyQualifiedDomainName</code> at the
     * interval that you specify for <code>RequestInterval</code>. Using an IPv4 address that DNS returns, Route 53 then
     * checks the health of the endpoint.
     * </p>
     * <note>
     * <p>
     * If you don't specify a value for <code>IPAddress</code>, Route 53 uses only IPv4 to send health checks to the
     * endpoint. If there's no resource record set with a type of A for the name that you specify for
     * <code>FullyQualifiedDomainName</code>, the health check fails with a "DNS resolution failed" error.
     * </p>
     * </note>
     * <p>
     * If you want to check the health of weighted, latency, or failover resource record sets and you choose to specify
     * the endpoint only by <code>FullyQualifiedDomainName</code>, we recommend that you create a separate health check
     * for each endpoint. For example, create a health check for each HTTP server that is serving content for
     * www.example.com. For the value of <code>FullyQualifiedDomainName</code>, specify the domain name of the server
     * (such as us-east-2-www.example.com), not the name of the resource record sets (www.example.com).
     * </p>
     * <important>
     * <p>
     * In this configuration, if you create a health check for which the value of <code>FullyQualifiedDomainName</code>
     * matches the name of the resource record sets and you then associate the health check with those resource record
     * sets, health check results will be unpredictable.
     * </p>
     * </important>
     * <p>
     * In addition, if the value that you specify for <code>Type</code> is <code>HTTP</code>, <code>HTTPS</code>,
     * <code>HTTP_STR_MATCH</code>, or <code>HTTPS_STR_MATCH</code>, Route 53 passes the value of
     * <code>FullyQualifiedDomainName</code> in the <code>Host</code> header, as it does when you specify a value for
     * <code>IPAddress</code>. If the value of <code>Type</code> is <code>TCP</code>, Route 53 doesn't pass a
     * <code>Host</code> header.
     * </p>
     * 
     * @param fullyQualifiedDomainName
     *        Amazon Route 53 behavior depends on whether you specify a value for <code>IPAddress</code>.</p>
     *        <p>
     *        <b>If you specify a value for</b> <code>IPAddress</code>:
     *        </p>
     *        <p>
     *        Amazon Route 53 sends health check requests to the specified IPv4 or IPv6 address and passes the value of
     *        <code>FullyQualifiedDomainName</code> in the <code>Host</code> header for all health checks except TCP
     *        health checks. This is typically the fully qualified DNS name of the endpoint on which you want Route 53
     *        to perform health checks.
     *        </p>
     *        <p>
     *        When Route 53 checks the health of an endpoint, here is how it constructs the <code>Host</code> header:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you specify a value of <code>80</code> for <code>Port</code> and <code>HTTP</code> or
     *        <code>HTTP_STR_MATCH</code> for <code>Type</code>, Route 53 passes the value of
     *        <code>FullyQualifiedDomainName</code> to the endpoint in the Host header.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify a value of <code>443</code> for <code>Port</code> and <code>HTTPS</code> or
     *        <code>HTTPS_STR_MATCH</code> for <code>Type</code>, Route 53 passes the value of
     *        <code>FullyQualifiedDomainName</code> to the endpoint in the <code>Host</code> header.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify another value for <code>Port</code> and any value except <code>TCP</code> for
     *        <code>Type</code>, Route 53 passes <code>FullyQualifiedDomainName:Port</code> to the endpoint in the
     *        <code>Host</code> header.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't specify a value for <code>FullyQualifiedDomainName</code>, Route 53 substitutes the value of
     *        <code>IPAddress</code> in the <code>Host</code> header in each of the preceding cases.
     *        </p>
     *        <p>
     *        <b>If you don't specify a value for <code>IPAddress</code> </b>:
     *        </p>
     *        <p>
     *        Route 53 sends a DNS request to the domain that you specify for <code>FullyQualifiedDomainName</code> at
     *        the interval that you specify for <code>RequestInterval</code>. Using an IPv4 address that DNS returns,
     *        Route 53 then checks the health of the endpoint.
     *        </p>
     *        <note>
     *        <p>
     *        If you don't specify a value for <code>IPAddress</code>, Route 53 uses only IPv4 to send health checks to
     *        the endpoint. If there's no resource record set with a type of A for the name that you specify for
     *        <code>FullyQualifiedDomainName</code>, the health check fails with a "DNS resolution failed" error.
     *        </p>
     *        </note>
     *        <p>
     *        If you want to check the health of weighted, latency, or failover resource record sets and you choose to
     *        specify the endpoint only by <code>FullyQualifiedDomainName</code>, we recommend that you create a
     *        separate health check for each endpoint. For example, create a health check for each HTTP server that is
     *        serving content for www.example.com. For the value of <code>FullyQualifiedDomainName</code>, specify the
     *        domain name of the server (such as us-east-2-www.example.com), not the name of the resource record sets
     *        (www.example.com).
     *        </p>
     *        <important>
     *        <p>
     *        In this configuration, if you create a health check for which the value of
     *        <code>FullyQualifiedDomainName</code> matches the name of the resource record sets and you then associate
     *        the health check with those resource record sets, health check results will be unpredictable.
     *        </p>
     *        </important>
     *        <p>
     *        In addition, if the value that you specify for <code>Type</code> is <code>HTTP</code>, <code>HTTPS</code>,
     *        <code>HTTP_STR_MATCH</code>, or <code>HTTPS_STR_MATCH</code>, Route 53 passes the value of
     *        <code>FullyQualifiedDomainName</code> in the <code>Host</code> header, as it does when you specify a value
     *        for <code>IPAddress</code>. If the value of <code>Type</code> is <code>TCP</code>, Route 53 doesn't pass a
     *        <code>Host</code> header.
     */

    public void setFullyQualifiedDomainName(String fullyQualifiedDomainName) {
        this.fullyQualifiedDomainName = fullyQualifiedDomainName;
    }

    /**
     * <p>
     * Amazon Route 53 behavior depends on whether you specify a value for <code>IPAddress</code>.
     * </p>
     * <p>
     * <b>If you specify a value for</b> <code>IPAddress</code>:
     * </p>
     * <p>
     * Amazon Route 53 sends health check requests to the specified IPv4 or IPv6 address and passes the value of
     * <code>FullyQualifiedDomainName</code> in the <code>Host</code> header for all health checks except TCP health
     * checks. This is typically the fully qualified DNS name of the endpoint on which you want Route 53 to perform
     * health checks.
     * </p>
     * <p>
     * When Route 53 checks the health of an endpoint, here is how it constructs the <code>Host</code> header:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify a value of <code>80</code> for <code>Port</code> and <code>HTTP</code> or
     * <code>HTTP_STR_MATCH</code> for <code>Type</code>, Route 53 passes the value of
     * <code>FullyQualifiedDomainName</code> to the endpoint in the Host header.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a value of <code>443</code> for <code>Port</code> and <code>HTTPS</code> or
     * <code>HTTPS_STR_MATCH</code> for <code>Type</code>, Route 53 passes the value of
     * <code>FullyQualifiedDomainName</code> to the endpoint in the <code>Host</code> header.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify another value for <code>Port</code> and any value except <code>TCP</code> for <code>Type</code>,
     * Route 53 passes <code>FullyQualifiedDomainName:Port</code> to the endpoint in the <code>Host</code> header.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value for <code>FullyQualifiedDomainName</code>, Route 53 substitutes the value of
     * <code>IPAddress</code> in the <code>Host</code> header in each of the preceding cases.
     * </p>
     * <p>
     * <b>If you don't specify a value for <code>IPAddress</code> </b>:
     * </p>
     * <p>
     * Route 53 sends a DNS request to the domain that you specify for <code>FullyQualifiedDomainName</code> at the
     * interval that you specify for <code>RequestInterval</code>. Using an IPv4 address that DNS returns, Route 53 then
     * checks the health of the endpoint.
     * </p>
     * <note>
     * <p>
     * If you don't specify a value for <code>IPAddress</code>, Route 53 uses only IPv4 to send health checks to the
     * endpoint. If there's no resource record set with a type of A for the name that you specify for
     * <code>FullyQualifiedDomainName</code>, the health check fails with a "DNS resolution failed" error.
     * </p>
     * </note>
     * <p>
     * If you want to check the health of weighted, latency, or failover resource record sets and you choose to specify
     * the endpoint only by <code>FullyQualifiedDomainName</code>, we recommend that you create a separate health check
     * for each endpoint. For example, create a health check for each HTTP server that is serving content for
     * www.example.com. For the value of <code>FullyQualifiedDomainName</code>, specify the domain name of the server
     * (such as us-east-2-www.example.com), not the name of the resource record sets (www.example.com).
     * </p>
     * <important>
     * <p>
     * In this configuration, if you create a health check for which the value of <code>FullyQualifiedDomainName</code>
     * matches the name of the resource record sets and you then associate the health check with those resource record
     * sets, health check results will be unpredictable.
     * </p>
     * </important>
     * <p>
     * In addition, if the value that you specify for <code>Type</code> is <code>HTTP</code>, <code>HTTPS</code>,
     * <code>HTTP_STR_MATCH</code>, or <code>HTTPS_STR_MATCH</code>, Route 53 passes the value of
     * <code>FullyQualifiedDomainName</code> in the <code>Host</code> header, as it does when you specify a value for
     * <code>IPAddress</code>. If the value of <code>Type</code> is <code>TCP</code>, Route 53 doesn't pass a
     * <code>Host</code> header.
     * </p>
     * 
     * @return Amazon Route 53 behavior depends on whether you specify a value for <code>IPAddress</code>.</p>
     *         <p>
     *         <b>If you specify a value for</b> <code>IPAddress</code>:
     *         </p>
     *         <p>
     *         Amazon Route 53 sends health check requests to the specified IPv4 or IPv6 address and passes the value of
     *         <code>FullyQualifiedDomainName</code> in the <code>Host</code> header for all health checks except TCP
     *         health checks. This is typically the fully qualified DNS name of the endpoint on which you want Route 53
     *         to perform health checks.
     *         </p>
     *         <p>
     *         When Route 53 checks the health of an endpoint, here is how it constructs the <code>Host</code> header:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you specify a value of <code>80</code> for <code>Port</code> and <code>HTTP</code> or
     *         <code>HTTP_STR_MATCH</code> for <code>Type</code>, Route 53 passes the value of
     *         <code>FullyQualifiedDomainName</code> to the endpoint in the Host header.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you specify a value of <code>443</code> for <code>Port</code> and <code>HTTPS</code> or
     *         <code>HTTPS_STR_MATCH</code> for <code>Type</code>, Route 53 passes the value of
     *         <code>FullyQualifiedDomainName</code> to the endpoint in the <code>Host</code> header.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you specify another value for <code>Port</code> and any value except <code>TCP</code> for
     *         <code>Type</code>, Route 53 passes <code>FullyQualifiedDomainName:Port</code> to the endpoint in the
     *         <code>Host</code> header.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you don't specify a value for <code>FullyQualifiedDomainName</code>, Route 53 substitutes the value of
     *         <code>IPAddress</code> in the <code>Host</code> header in each of the preceding cases.
     *         </p>
     *         <p>
     *         <b>If you don't specify a value for <code>IPAddress</code> </b>:
     *         </p>
     *         <p>
     *         Route 53 sends a DNS request to the domain that you specify for <code>FullyQualifiedDomainName</code> at
     *         the interval that you specify for <code>RequestInterval</code>. Using an IPv4 address that DNS returns,
     *         Route 53 then checks the health of the endpoint.
     *         </p>
     *         <note>
     *         <p>
     *         If you don't specify a value for <code>IPAddress</code>, Route 53 uses only IPv4 to send health checks to
     *         the endpoint. If there's no resource record set with a type of A for the name that you specify for
     *         <code>FullyQualifiedDomainName</code>, the health check fails with a "DNS resolution failed" error.
     *         </p>
     *         </note>
     *         <p>
     *         If you want to check the health of weighted, latency, or failover resource record sets and you choose to
     *         specify the endpoint only by <code>FullyQualifiedDomainName</code>, we recommend that you create a
     *         separate health check for each endpoint. For example, create a health check for each HTTP server that is
     *         serving content for www.example.com. For the value of <code>FullyQualifiedDomainName</code>, specify the
     *         domain name of the server (such as us-east-2-www.example.com), not the name of the resource record sets
     *         (www.example.com).
     *         </p>
     *         <important>
     *         <p>
     *         In this configuration, if you create a health check for which the value of
     *         <code>FullyQualifiedDomainName</code> matches the name of the resource record sets and you then associate
     *         the health check with those resource record sets, health check results will be unpredictable.
     *         </p>
     *         </important>
     *         <p>
     *         In addition, if the value that you specify for <code>Type</code> is <code>HTTP</code>, <code>HTTPS</code>, <code>HTTP_STR_MATCH</code>, or <code>HTTPS_STR_MATCH</code>, Route 53 passes the value of
     *         <code>FullyQualifiedDomainName</code> in the <code>Host</code> header, as it does when you specify a
     *         value for <code>IPAddress</code>. If the value of <code>Type</code> is <code>TCP</code>, Route 53 doesn't
     *         pass a <code>Host</code> header.
     */

    public String getFullyQualifiedDomainName() {
        return this.fullyQualifiedDomainName;
    }

    /**
     * <p>
     * Amazon Route 53 behavior depends on whether you specify a value for <code>IPAddress</code>.
     * </p>
     * <p>
     * <b>If you specify a value for</b> <code>IPAddress</code>:
     * </p>
     * <p>
     * Amazon Route 53 sends health check requests to the specified IPv4 or IPv6 address and passes the value of
     * <code>FullyQualifiedDomainName</code> in the <code>Host</code> header for all health checks except TCP health
     * checks. This is typically the fully qualified DNS name of the endpoint on which you want Route 53 to perform
     * health checks.
     * </p>
     * <p>
     * When Route 53 checks the health of an endpoint, here is how it constructs the <code>Host</code> header:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify a value of <code>80</code> for <code>Port</code> and <code>HTTP</code> or
     * <code>HTTP_STR_MATCH</code> for <code>Type</code>, Route 53 passes the value of
     * <code>FullyQualifiedDomainName</code> to the endpoint in the Host header.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a value of <code>443</code> for <code>Port</code> and <code>HTTPS</code> or
     * <code>HTTPS_STR_MATCH</code> for <code>Type</code>, Route 53 passes the value of
     * <code>FullyQualifiedDomainName</code> to the endpoint in the <code>Host</code> header.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify another value for <code>Port</code> and any value except <code>TCP</code> for <code>Type</code>,
     * Route 53 passes <code>FullyQualifiedDomainName:Port</code> to the endpoint in the <code>Host</code> header.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value for <code>FullyQualifiedDomainName</code>, Route 53 substitutes the value of
     * <code>IPAddress</code> in the <code>Host</code> header in each of the preceding cases.
     * </p>
     * <p>
     * <b>If you don't specify a value for <code>IPAddress</code> </b>:
     * </p>
     * <p>
     * Route 53 sends a DNS request to the domain that you specify for <code>FullyQualifiedDomainName</code> at the
     * interval that you specify for <code>RequestInterval</code>. Using an IPv4 address that DNS returns, Route 53 then
     * checks the health of the endpoint.
     * </p>
     * <note>
     * <p>
     * If you don't specify a value for <code>IPAddress</code>, Route 53 uses only IPv4 to send health checks to the
     * endpoint. If there's no resource record set with a type of A for the name that you specify for
     * <code>FullyQualifiedDomainName</code>, the health check fails with a "DNS resolution failed" error.
     * </p>
     * </note>
     * <p>
     * If you want to check the health of weighted, latency, or failover resource record sets and you choose to specify
     * the endpoint only by <code>FullyQualifiedDomainName</code>, we recommend that you create a separate health check
     * for each endpoint. For example, create a health check for each HTTP server that is serving content for
     * www.example.com. For the value of <code>FullyQualifiedDomainName</code>, specify the domain name of the server
     * (such as us-east-2-www.example.com), not the name of the resource record sets (www.example.com).
     * </p>
     * <important>
     * <p>
     * In this configuration, if you create a health check for which the value of <code>FullyQualifiedDomainName</code>
     * matches the name of the resource record sets and you then associate the health check with those resource record
     * sets, health check results will be unpredictable.
     * </p>
     * </important>
     * <p>
     * In addition, if the value that you specify for <code>Type</code> is <code>HTTP</code>, <code>HTTPS</code>,
     * <code>HTTP_STR_MATCH</code>, or <code>HTTPS_STR_MATCH</code>, Route 53 passes the value of
     * <code>FullyQualifiedDomainName</code> in the <code>Host</code> header, as it does when you specify a value for
     * <code>IPAddress</code>. If the value of <code>Type</code> is <code>TCP</code>, Route 53 doesn't pass a
     * <code>Host</code> header.
     * </p>
     * 
     * @param fullyQualifiedDomainName
     *        Amazon Route 53 behavior depends on whether you specify a value for <code>IPAddress</code>.</p>
     *        <p>
     *        <b>If you specify a value for</b> <code>IPAddress</code>:
     *        </p>
     *        <p>
     *        Amazon Route 53 sends health check requests to the specified IPv4 or IPv6 address and passes the value of
     *        <code>FullyQualifiedDomainName</code> in the <code>Host</code> header for all health checks except TCP
     *        health checks. This is typically the fully qualified DNS name of the endpoint on which you want Route 53
     *        to perform health checks.
     *        </p>
     *        <p>
     *        When Route 53 checks the health of an endpoint, here is how it constructs the <code>Host</code> header:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you specify a value of <code>80</code> for <code>Port</code> and <code>HTTP</code> or
     *        <code>HTTP_STR_MATCH</code> for <code>Type</code>, Route 53 passes the value of
     *        <code>FullyQualifiedDomainName</code> to the endpoint in the Host header.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify a value of <code>443</code> for <code>Port</code> and <code>HTTPS</code> or
     *        <code>HTTPS_STR_MATCH</code> for <code>Type</code>, Route 53 passes the value of
     *        <code>FullyQualifiedDomainName</code> to the endpoint in the <code>Host</code> header.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify another value for <code>Port</code> and any value except <code>TCP</code> for
     *        <code>Type</code>, Route 53 passes <code>FullyQualifiedDomainName:Port</code> to the endpoint in the
     *        <code>Host</code> header.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't specify a value for <code>FullyQualifiedDomainName</code>, Route 53 substitutes the value of
     *        <code>IPAddress</code> in the <code>Host</code> header in each of the preceding cases.
     *        </p>
     *        <p>
     *        <b>If you don't specify a value for <code>IPAddress</code> </b>:
     *        </p>
     *        <p>
     *        Route 53 sends a DNS request to the domain that you specify for <code>FullyQualifiedDomainName</code> at
     *        the interval that you specify for <code>RequestInterval</code>. Using an IPv4 address that DNS returns,
     *        Route 53 then checks the health of the endpoint.
     *        </p>
     *        <note>
     *        <p>
     *        If you don't specify a value for <code>IPAddress</code>, Route 53 uses only IPv4 to send health checks to
     *        the endpoint. If there's no resource record set with a type of A for the name that you specify for
     *        <code>FullyQualifiedDomainName</code>, the health check fails with a "DNS resolution failed" error.
     *        </p>
     *        </note>
     *        <p>
     *        If you want to check the health of weighted, latency, or failover resource record sets and you choose to
     *        specify the endpoint only by <code>FullyQualifiedDomainName</code>, we recommend that you create a
     *        separate health check for each endpoint. For example, create a health check for each HTTP server that is
     *        serving content for www.example.com. For the value of <code>FullyQualifiedDomainName</code>, specify the
     *        domain name of the server (such as us-east-2-www.example.com), not the name of the resource record sets
     *        (www.example.com).
     *        </p>
     *        <important>
     *        <p>
     *        In this configuration, if you create a health check for which the value of
     *        <code>FullyQualifiedDomainName</code> matches the name of the resource record sets and you then associate
     *        the health check with those resource record sets, health check results will be unpredictable.
     *        </p>
     *        </important>
     *        <p>
     *        In addition, if the value that you specify for <code>Type</code> is <code>HTTP</code>, <code>HTTPS</code>,
     *        <code>HTTP_STR_MATCH</code>, or <code>HTTPS_STR_MATCH</code>, Route 53 passes the value of
     *        <code>FullyQualifiedDomainName</code> in the <code>Host</code> header, as it does when you specify a value
     *        for <code>IPAddress</code>. If the value of <code>Type</code> is <code>TCP</code>, Route 53 doesn't pass a
     *        <code>Host</code> header.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheckConfig withFullyQualifiedDomainName(String fullyQualifiedDomainName) {
        setFullyQualifiedDomainName(fullyQualifiedDomainName);
        return this;
    }

    /**
     * <p>
     * If the value of Type is <code>HTTP_STR_MATCH</code> or <code>HTTP_STR_MATCH</code>, the string that you want
     * Amazon Route 53 to search for in the response body from the specified resource. If the string appears in the
     * response body, Route 53 considers the resource healthy.
     * </p>
     * <p>
     * Route 53 considers case when searching for <code>SearchString</code> in the response body.
     * </p>
     * 
     * @param searchString
     *        If the value of Type is <code>HTTP_STR_MATCH</code> or <code>HTTP_STR_MATCH</code>, the string that you
     *        want Amazon Route 53 to search for in the response body from the specified resource. If the string appears
     *        in the response body, Route 53 considers the resource healthy.</p>
     *        <p>
     *        Route 53 considers case when searching for <code>SearchString</code> in the response body.
     */

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    /**
     * <p>
     * If the value of Type is <code>HTTP_STR_MATCH</code> or <code>HTTP_STR_MATCH</code>, the string that you want
     * Amazon Route 53 to search for in the response body from the specified resource. If the string appears in the
     * response body, Route 53 considers the resource healthy.
     * </p>
     * <p>
     * Route 53 considers case when searching for <code>SearchString</code> in the response body.
     * </p>
     * 
     * @return If the value of Type is <code>HTTP_STR_MATCH</code> or <code>HTTP_STR_MATCH</code>, the string that you
     *         want Amazon Route 53 to search for in the response body from the specified resource. If the string
     *         appears in the response body, Route 53 considers the resource healthy.</p>
     *         <p>
     *         Route 53 considers case when searching for <code>SearchString</code> in the response body.
     */

    public String getSearchString() {
        return this.searchString;
    }

    /**
     * <p>
     * If the value of Type is <code>HTTP_STR_MATCH</code> or <code>HTTP_STR_MATCH</code>, the string that you want
     * Amazon Route 53 to search for in the response body from the specified resource. If the string appears in the
     * response body, Route 53 considers the resource healthy.
     * </p>
     * <p>
     * Route 53 considers case when searching for <code>SearchString</code> in the response body.
     * </p>
     * 
     * @param searchString
     *        If the value of Type is <code>HTTP_STR_MATCH</code> or <code>HTTP_STR_MATCH</code>, the string that you
     *        want Amazon Route 53 to search for in the response body from the specified resource. If the string appears
     *        in the response body, Route 53 considers the resource healthy.</p>
     *        <p>
     *        Route 53 considers case when searching for <code>SearchString</code> in the response body.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheckConfig withSearchString(String searchString) {
        setSearchString(searchString);
        return this;
    }

    /**
     * <p>
     * The number of seconds between the time that Amazon Route 53 gets a response from your endpoint and the time that
     * it sends the next health check request. Each Route 53 health checker makes requests at this interval.
     * </p>
     * <important>
     * <p>
     * You can't change the value of <code>RequestInterval</code> after you create a health check.
     * </p>
     * </important>
     * <p>
     * If you don't specify a value for <code>RequestInterval</code>, the default value is <code>30</code> seconds.
     * </p>
     * 
     * @param requestInterval
     *        The number of seconds between the time that Amazon Route 53 gets a response from your endpoint and the
     *        time that it sends the next health check request. Each Route 53 health checker makes requests at this
     *        interval.</p> <important>
     *        <p>
     *        You can't change the value of <code>RequestInterval</code> after you create a health check.
     *        </p>
     *        </important>
     *        <p>
     *        If you don't specify a value for <code>RequestInterval</code>, the default value is <code>30</code>
     *        seconds.
     */

    public void setRequestInterval(Integer requestInterval) {
        this.requestInterval = requestInterval;
    }

    /**
     * <p>
     * The number of seconds between the time that Amazon Route 53 gets a response from your endpoint and the time that
     * it sends the next health check request. Each Route 53 health checker makes requests at this interval.
     * </p>
     * <important>
     * <p>
     * You can't change the value of <code>RequestInterval</code> after you create a health check.
     * </p>
     * </important>
     * <p>
     * If you don't specify a value for <code>RequestInterval</code>, the default value is <code>30</code> seconds.
     * </p>
     * 
     * @return The number of seconds between the time that Amazon Route 53 gets a response from your endpoint and the
     *         time that it sends the next health check request. Each Route 53 health checker makes requests at this
     *         interval.</p> <important>
     *         <p>
     *         You can't change the value of <code>RequestInterval</code> after you create a health check.
     *         </p>
     *         </important>
     *         <p>
     *         If you don't specify a value for <code>RequestInterval</code>, the default value is <code>30</code>
     *         seconds.
     */

    public Integer getRequestInterval() {
        return this.requestInterval;
    }

    /**
     * <p>
     * The number of seconds between the time that Amazon Route 53 gets a response from your endpoint and the time that
     * it sends the next health check request. Each Route 53 health checker makes requests at this interval.
     * </p>
     * <important>
     * <p>
     * You can't change the value of <code>RequestInterval</code> after you create a health check.
     * </p>
     * </important>
     * <p>
     * If you don't specify a value for <code>RequestInterval</code>, the default value is <code>30</code> seconds.
     * </p>
     * 
     * @param requestInterval
     *        The number of seconds between the time that Amazon Route 53 gets a response from your endpoint and the
     *        time that it sends the next health check request. Each Route 53 health checker makes requests at this
     *        interval.</p> <important>
     *        <p>
     *        You can't change the value of <code>RequestInterval</code> after you create a health check.
     *        </p>
     *        </important>
     *        <p>
     *        If you don't specify a value for <code>RequestInterval</code>, the default value is <code>30</code>
     *        seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheckConfig withRequestInterval(Integer requestInterval) {
        setRequestInterval(requestInterval);
        return this;
    }

    /**
     * <p>
     * The number of consecutive health checks that an endpoint must pass or fail for Amazon Route 53 to change the
     * current status of the endpoint from unhealthy to healthy or vice versa. For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html">How
     * Amazon Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * If you don't specify a value for <code>FailureThreshold</code>, the default value is three health checks.
     * </p>
     * 
     * @param failureThreshold
     *        The number of consecutive health checks that an endpoint must pass or fail for Amazon Route 53 to change
     *        the current status of the endpoint from unhealthy to healthy or vice versa. For more information, see <a
     *        href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html"
     *        >How Amazon Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Amazon Route 53 Developer
     *        Guide</i>.</p>
     *        <p>
     *        If you don't specify a value for <code>FailureThreshold</code>, the default value is three health checks.
     */

    public void setFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    /**
     * <p>
     * The number of consecutive health checks that an endpoint must pass or fail for Amazon Route 53 to change the
     * current status of the endpoint from unhealthy to healthy or vice versa. For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html">How
     * Amazon Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * If you don't specify a value for <code>FailureThreshold</code>, the default value is three health checks.
     * </p>
     * 
     * @return The number of consecutive health checks that an endpoint must pass or fail for Amazon Route 53 to change
     *         the current status of the endpoint from unhealthy to healthy or vice versa. For more information, see <a
     *         href=
     *         "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html"
     *         >How Amazon Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Amazon Route 53 Developer
     *         Guide</i>.</p>
     *         <p>
     *         If you don't specify a value for <code>FailureThreshold</code>, the default value is three health checks.
     */

    public Integer getFailureThreshold() {
        return this.failureThreshold;
    }

    /**
     * <p>
     * The number of consecutive health checks that an endpoint must pass or fail for Amazon Route 53 to change the
     * current status of the endpoint from unhealthy to healthy or vice versa. For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html">How
     * Amazon Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * If you don't specify a value for <code>FailureThreshold</code>, the default value is three health checks.
     * </p>
     * 
     * @param failureThreshold
     *        The number of consecutive health checks that an endpoint must pass or fail for Amazon Route 53 to change
     *        the current status of the endpoint from unhealthy to healthy or vice versa. For more information, see <a
     *        href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html"
     *        >How Amazon Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Amazon Route 53 Developer
     *        Guide</i>.</p>
     *        <p>
     *        If you don't specify a value for <code>FailureThreshold</code>, the default value is three health checks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheckConfig withFailureThreshold(Integer failureThreshold) {
        setFailureThreshold(failureThreshold);
        return this;
    }

    /**
     * <p>
     * Specify whether you want Amazon Route 53 to measure the latency between health checkers in multiple AWS regions
     * and your endpoint, and to display CloudWatch latency graphs on the <b>Health Checks</b> page in the Route 53
     * console.
     * </p>
     * <important>
     * <p>
     * You can't change the value of <code>MeasureLatency</code> after you create a health check.
     * </p>
     * </important>
     * 
     * @param measureLatency
     *        Specify whether you want Amazon Route 53 to measure the latency between health checkers in multiple AWS
     *        regions and your endpoint, and to display CloudWatch latency graphs on the <b>Health Checks</b> page in
     *        the Route 53 console.</p> <important>
     *        <p>
     *        You can't change the value of <code>MeasureLatency</code> after you create a health check.
     *        </p>
     */

    public void setMeasureLatency(Boolean measureLatency) {
        this.measureLatency = measureLatency;
    }

    /**
     * <p>
     * Specify whether you want Amazon Route 53 to measure the latency between health checkers in multiple AWS regions
     * and your endpoint, and to display CloudWatch latency graphs on the <b>Health Checks</b> page in the Route 53
     * console.
     * </p>
     * <important>
     * <p>
     * You can't change the value of <code>MeasureLatency</code> after you create a health check.
     * </p>
     * </important>
     * 
     * @return Specify whether you want Amazon Route 53 to measure the latency between health checkers in multiple AWS
     *         regions and your endpoint, and to display CloudWatch latency graphs on the <b>Health Checks</b> page in
     *         the Route 53 console.</p> <important>
     *         <p>
     *         You can't change the value of <code>MeasureLatency</code> after you create a health check.
     *         </p>
     */

    public Boolean getMeasureLatency() {
        return this.measureLatency;
    }

    /**
     * <p>
     * Specify whether you want Amazon Route 53 to measure the latency between health checkers in multiple AWS regions
     * and your endpoint, and to display CloudWatch latency graphs on the <b>Health Checks</b> page in the Route 53
     * console.
     * </p>
     * <important>
     * <p>
     * You can't change the value of <code>MeasureLatency</code> after you create a health check.
     * </p>
     * </important>
     * 
     * @param measureLatency
     *        Specify whether you want Amazon Route 53 to measure the latency between health checkers in multiple AWS
     *        regions and your endpoint, and to display CloudWatch latency graphs on the <b>Health Checks</b> page in
     *        the Route 53 console.</p> <important>
     *        <p>
     *        You can't change the value of <code>MeasureLatency</code> after you create a health check.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheckConfig withMeasureLatency(Boolean measureLatency) {
        setMeasureLatency(measureLatency);
        return this;
    }

    /**
     * <p>
     * Specify whether you want Amazon Route 53 to measure the latency between health checkers in multiple AWS regions
     * and your endpoint, and to display CloudWatch latency graphs on the <b>Health Checks</b> page in the Route 53
     * console.
     * </p>
     * <important>
     * <p>
     * You can't change the value of <code>MeasureLatency</code> after you create a health check.
     * </p>
     * </important>
     * 
     * @return Specify whether you want Amazon Route 53 to measure the latency between health checkers in multiple AWS
     *         regions and your endpoint, and to display CloudWatch latency graphs on the <b>Health Checks</b> page in
     *         the Route 53 console.</p> <important>
     *         <p>
     *         You can't change the value of <code>MeasureLatency</code> after you create a health check.
     *         </p>
     */

    public Boolean isMeasureLatency() {
        return this.measureLatency;
    }

    /**
     * <p>
     * Specify whether you want Amazon Route 53 to invert the status of a health check, for example, to consider a
     * health check unhealthy when it otherwise would be considered healthy.
     * </p>
     * 
     * @param inverted
     *        Specify whether you want Amazon Route 53 to invert the status of a health check, for example, to consider
     *        a health check unhealthy when it otherwise would be considered healthy.
     */

    public void setInverted(Boolean inverted) {
        this.inverted = inverted;
    }

    /**
     * <p>
     * Specify whether you want Amazon Route 53 to invert the status of a health check, for example, to consider a
     * health check unhealthy when it otherwise would be considered healthy.
     * </p>
     * 
     * @return Specify whether you want Amazon Route 53 to invert the status of a health check, for example, to consider
     *         a health check unhealthy when it otherwise would be considered healthy.
     */

    public Boolean getInverted() {
        return this.inverted;
    }

    /**
     * <p>
     * Specify whether you want Amazon Route 53 to invert the status of a health check, for example, to consider a
     * health check unhealthy when it otherwise would be considered healthy.
     * </p>
     * 
     * @param inverted
     *        Specify whether you want Amazon Route 53 to invert the status of a health check, for example, to consider
     *        a health check unhealthy when it otherwise would be considered healthy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheckConfig withInverted(Boolean inverted) {
        setInverted(inverted);
        return this;
    }

    /**
     * <p>
     * Specify whether you want Amazon Route 53 to invert the status of a health check, for example, to consider a
     * health check unhealthy when it otherwise would be considered healthy.
     * </p>
     * 
     * @return Specify whether you want Amazon Route 53 to invert the status of a health check, for example, to consider
     *         a health check unhealthy when it otherwise would be considered healthy.
     */

    public Boolean isInverted() {
        return this.inverted;
    }

    /**
     * <p>
     * Stops Route 53 from performing health checks. When you disable a health check, here's what happens:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Health checks that check the health of endpoints:</b> Route 53 stops submitting requests to your application,
     * server, or other resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Calculated health checks:</b> Route 53 stops aggregating the status of the referenced health checks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Health checks that monitor CloudWatch alarms:</b> Route 53 stops monitoring the corresponding CloudWatch
     * metrics.
     * </p>
     * </li>
     * </ul>
     * <p>
     * After you disable a health check, Route 53 considers the status of the health check to always be healthy. If you
     * configured DNS failover, Route 53 continues to route traffic to the corresponding resources. If you want to stop
     * routing traffic to a resource, change the value of <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_UpdateHealthCheck.html#Route53-UpdateHealthCheck-request-Inverted"
     * >Inverted</a>.
     * </p>
     * <p>
     * Charges for a health check still apply when the health check is disabled. For more information, see <a
     * href="http://aws.amazon.com/route53/pricing/">Amazon Route 53 Pricing</a>.
     * </p>
     * 
     * @param disabled
     *        Stops Route 53 from performing health checks. When you disable a health check, here's what happens:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Health checks that check the health of endpoints:</b> Route 53 stops submitting requests to your
     *        application, server, or other resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Calculated health checks:</b> Route 53 stops aggregating the status of the referenced health checks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Health checks that monitor CloudWatch alarms:</b> Route 53 stops monitoring the corresponding
     *        CloudWatch metrics.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        After you disable a health check, Route 53 considers the status of the health check to always be healthy.
     *        If you configured DNS failover, Route 53 continues to route traffic to the corresponding resources. If you
     *        want to stop routing traffic to a resource, change the value of <a href=
     *        "https://docs.aws.amazon.com/Route53/latest/APIReference/API_UpdateHealthCheck.html#Route53-UpdateHealthCheck-request-Inverted"
     *        >Inverted</a>.
     *        </p>
     *        <p>
     *        Charges for a health check still apply when the health check is disabled. For more information, see <a
     *        href="http://aws.amazon.com/route53/pricing/">Amazon Route 53 Pricing</a>.
     */

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * <p>
     * Stops Route 53 from performing health checks. When you disable a health check, here's what happens:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Health checks that check the health of endpoints:</b> Route 53 stops submitting requests to your application,
     * server, or other resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Calculated health checks:</b> Route 53 stops aggregating the status of the referenced health checks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Health checks that monitor CloudWatch alarms:</b> Route 53 stops monitoring the corresponding CloudWatch
     * metrics.
     * </p>
     * </li>
     * </ul>
     * <p>
     * After you disable a health check, Route 53 considers the status of the health check to always be healthy. If you
     * configured DNS failover, Route 53 continues to route traffic to the corresponding resources. If you want to stop
     * routing traffic to a resource, change the value of <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_UpdateHealthCheck.html#Route53-UpdateHealthCheck-request-Inverted"
     * >Inverted</a>.
     * </p>
     * <p>
     * Charges for a health check still apply when the health check is disabled. For more information, see <a
     * href="http://aws.amazon.com/route53/pricing/">Amazon Route 53 Pricing</a>.
     * </p>
     * 
     * @return Stops Route 53 from performing health checks. When you disable a health check, here's what happens:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Health checks that check the health of endpoints:</b> Route 53 stops submitting requests to your
     *         application, server, or other resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Calculated health checks:</b> Route 53 stops aggregating the status of the referenced health checks.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Health checks that monitor CloudWatch alarms:</b> Route 53 stops monitoring the corresponding
     *         CloudWatch metrics.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         After you disable a health check, Route 53 considers the status of the health check to always be healthy.
     *         If you configured DNS failover, Route 53 continues to route traffic to the corresponding resources. If
     *         you want to stop routing traffic to a resource, change the value of <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/APIReference/API_UpdateHealthCheck.html#Route53-UpdateHealthCheck-request-Inverted"
     *         >Inverted</a>.
     *         </p>
     *         <p>
     *         Charges for a health check still apply when the health check is disabled. For more information, see <a
     *         href="http://aws.amazon.com/route53/pricing/">Amazon Route 53 Pricing</a>.
     */

    public Boolean getDisabled() {
        return this.disabled;
    }

    /**
     * <p>
     * Stops Route 53 from performing health checks. When you disable a health check, here's what happens:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Health checks that check the health of endpoints:</b> Route 53 stops submitting requests to your application,
     * server, or other resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Calculated health checks:</b> Route 53 stops aggregating the status of the referenced health checks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Health checks that monitor CloudWatch alarms:</b> Route 53 stops monitoring the corresponding CloudWatch
     * metrics.
     * </p>
     * </li>
     * </ul>
     * <p>
     * After you disable a health check, Route 53 considers the status of the health check to always be healthy. If you
     * configured DNS failover, Route 53 continues to route traffic to the corresponding resources. If you want to stop
     * routing traffic to a resource, change the value of <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_UpdateHealthCheck.html#Route53-UpdateHealthCheck-request-Inverted"
     * >Inverted</a>.
     * </p>
     * <p>
     * Charges for a health check still apply when the health check is disabled. For more information, see <a
     * href="http://aws.amazon.com/route53/pricing/">Amazon Route 53 Pricing</a>.
     * </p>
     * 
     * @param disabled
     *        Stops Route 53 from performing health checks. When you disable a health check, here's what happens:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Health checks that check the health of endpoints:</b> Route 53 stops submitting requests to your
     *        application, server, or other resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Calculated health checks:</b> Route 53 stops aggregating the status of the referenced health checks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Health checks that monitor CloudWatch alarms:</b> Route 53 stops monitoring the corresponding
     *        CloudWatch metrics.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        After you disable a health check, Route 53 considers the status of the health check to always be healthy.
     *        If you configured DNS failover, Route 53 continues to route traffic to the corresponding resources. If you
     *        want to stop routing traffic to a resource, change the value of <a href=
     *        "https://docs.aws.amazon.com/Route53/latest/APIReference/API_UpdateHealthCheck.html#Route53-UpdateHealthCheck-request-Inverted"
     *        >Inverted</a>.
     *        </p>
     *        <p>
     *        Charges for a health check still apply when the health check is disabled. For more information, see <a
     *        href="http://aws.amazon.com/route53/pricing/">Amazon Route 53 Pricing</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheckConfig withDisabled(Boolean disabled) {
        setDisabled(disabled);
        return this;
    }

    /**
     * <p>
     * Stops Route 53 from performing health checks. When you disable a health check, here's what happens:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Health checks that check the health of endpoints:</b> Route 53 stops submitting requests to your application,
     * server, or other resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Calculated health checks:</b> Route 53 stops aggregating the status of the referenced health checks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Health checks that monitor CloudWatch alarms:</b> Route 53 stops monitoring the corresponding CloudWatch
     * metrics.
     * </p>
     * </li>
     * </ul>
     * <p>
     * After you disable a health check, Route 53 considers the status of the health check to always be healthy. If you
     * configured DNS failover, Route 53 continues to route traffic to the corresponding resources. If you want to stop
     * routing traffic to a resource, change the value of <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_UpdateHealthCheck.html#Route53-UpdateHealthCheck-request-Inverted"
     * >Inverted</a>.
     * </p>
     * <p>
     * Charges for a health check still apply when the health check is disabled. For more information, see <a
     * href="http://aws.amazon.com/route53/pricing/">Amazon Route 53 Pricing</a>.
     * </p>
     * 
     * @return Stops Route 53 from performing health checks. When you disable a health check, here's what happens:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Health checks that check the health of endpoints:</b> Route 53 stops submitting requests to your
     *         application, server, or other resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Calculated health checks:</b> Route 53 stops aggregating the status of the referenced health checks.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Health checks that monitor CloudWatch alarms:</b> Route 53 stops monitoring the corresponding
     *         CloudWatch metrics.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         After you disable a health check, Route 53 considers the status of the health check to always be healthy.
     *         If you configured DNS failover, Route 53 continues to route traffic to the corresponding resources. If
     *         you want to stop routing traffic to a resource, change the value of <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/APIReference/API_UpdateHealthCheck.html#Route53-UpdateHealthCheck-request-Inverted"
     *         >Inverted</a>.
     *         </p>
     *         <p>
     *         Charges for a health check still apply when the health check is disabled. For more information, see <a
     *         href="http://aws.amazon.com/route53/pricing/">Amazon Route 53 Pricing</a>.
     */

    public Boolean isDisabled() {
        return this.disabled;
    }

    /**
     * <p>
     * The number of child health checks that are associated with a <code>CALCULATED</code> health check that Amazon
     * Route 53 must consider healthy for the <code>CALCULATED</code> health check to be considered healthy. To specify
     * the child health checks that you want to associate with a <code>CALCULATED</code> health check, use the <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_UpdateHealthCheck.html#Route53-UpdateHealthCheck-request-ChildHealthChecks"
     * >ChildHealthChecks</a> element.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify a number greater than the number of child health checks, Route 53 always considers this health
     * check to be unhealthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify <code>0</code>, Route 53 always considers this health check to be healthy.
     * </p>
     * </li>
     * </ul>
     * 
     * @param healthThreshold
     *        The number of child health checks that are associated with a <code>CALCULATED</code> health check that
     *        Amazon Route 53 must consider healthy for the <code>CALCULATED</code> health check to be considered
     *        healthy. To specify the child health checks that you want to associate with a <code>CALCULATED</code>
     *        health check, use the <a href=
     *        "https://docs.aws.amazon.com/Route53/latest/APIReference/API_UpdateHealthCheck.html#Route53-UpdateHealthCheck-request-ChildHealthChecks"
     *        >ChildHealthChecks</a> element.</p>
     *        <p>
     *        Note the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you specify a number greater than the number of child health checks, Route 53 always considers this
     *        health check to be unhealthy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify <code>0</code>, Route 53 always considers this health check to be healthy.
     *        </p>
     *        </li>
     */

    public void setHealthThreshold(Integer healthThreshold) {
        this.healthThreshold = healthThreshold;
    }

    /**
     * <p>
     * The number of child health checks that are associated with a <code>CALCULATED</code> health check that Amazon
     * Route 53 must consider healthy for the <code>CALCULATED</code> health check to be considered healthy. To specify
     * the child health checks that you want to associate with a <code>CALCULATED</code> health check, use the <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_UpdateHealthCheck.html#Route53-UpdateHealthCheck-request-ChildHealthChecks"
     * >ChildHealthChecks</a> element.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify a number greater than the number of child health checks, Route 53 always considers this health
     * check to be unhealthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify <code>0</code>, Route 53 always considers this health check to be healthy.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The number of child health checks that are associated with a <code>CALCULATED</code> health check that
     *         Amazon Route 53 must consider healthy for the <code>CALCULATED</code> health check to be considered
     *         healthy. To specify the child health checks that you want to associate with a <code>CALCULATED</code>
     *         health check, use the <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/APIReference/API_UpdateHealthCheck.html#Route53-UpdateHealthCheck-request-ChildHealthChecks"
     *         >ChildHealthChecks</a> element.</p>
     *         <p>
     *         Note the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you specify a number greater than the number of child health checks, Route 53 always considers this
     *         health check to be unhealthy.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you specify <code>0</code>, Route 53 always considers this health check to be healthy.
     *         </p>
     *         </li>
     */

    public Integer getHealthThreshold() {
        return this.healthThreshold;
    }

    /**
     * <p>
     * The number of child health checks that are associated with a <code>CALCULATED</code> health check that Amazon
     * Route 53 must consider healthy for the <code>CALCULATED</code> health check to be considered healthy. To specify
     * the child health checks that you want to associate with a <code>CALCULATED</code> health check, use the <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_UpdateHealthCheck.html#Route53-UpdateHealthCheck-request-ChildHealthChecks"
     * >ChildHealthChecks</a> element.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify a number greater than the number of child health checks, Route 53 always considers this health
     * check to be unhealthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify <code>0</code>, Route 53 always considers this health check to be healthy.
     * </p>
     * </li>
     * </ul>
     * 
     * @param healthThreshold
     *        The number of child health checks that are associated with a <code>CALCULATED</code> health check that
     *        Amazon Route 53 must consider healthy for the <code>CALCULATED</code> health check to be considered
     *        healthy. To specify the child health checks that you want to associate with a <code>CALCULATED</code>
     *        health check, use the <a href=
     *        "https://docs.aws.amazon.com/Route53/latest/APIReference/API_UpdateHealthCheck.html#Route53-UpdateHealthCheck-request-ChildHealthChecks"
     *        >ChildHealthChecks</a> element.</p>
     *        <p>
     *        Note the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you specify a number greater than the number of child health checks, Route 53 always considers this
     *        health check to be unhealthy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify <code>0</code>, Route 53 always considers this health check to be healthy.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheckConfig withHealthThreshold(Integer healthThreshold) {
        setHealthThreshold(healthThreshold);
        return this;
    }

    /**
     * <p>
     * (CALCULATED Health Checks Only) A complex type that contains one <code>ChildHealthCheck</code> element for each
     * health check that you want to associate with a <code>CALCULATED</code> health check.
     * </p>
     * 
     * @return (CALCULATED Health Checks Only) A complex type that contains one <code>ChildHealthCheck</code> element
     *         for each health check that you want to associate with a <code>CALCULATED</code> health check.
     */

    public java.util.List<String> getChildHealthChecks() {
        if (childHealthChecks == null) {
            childHealthChecks = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return childHealthChecks;
    }

    /**
     * <p>
     * (CALCULATED Health Checks Only) A complex type that contains one <code>ChildHealthCheck</code> element for each
     * health check that you want to associate with a <code>CALCULATED</code> health check.
     * </p>
     * 
     * @param childHealthChecks
     *        (CALCULATED Health Checks Only) A complex type that contains one <code>ChildHealthCheck</code> element for
     *        each health check that you want to associate with a <code>CALCULATED</code> health check.
     */

    public void setChildHealthChecks(java.util.Collection<String> childHealthChecks) {
        if (childHealthChecks == null) {
            this.childHealthChecks = null;
            return;
        }

        this.childHealthChecks = new com.amazonaws.internal.SdkInternalList<String>(childHealthChecks);
    }

    /**
     * <p>
     * (CALCULATED Health Checks Only) A complex type that contains one <code>ChildHealthCheck</code> element for each
     * health check that you want to associate with a <code>CALCULATED</code> health check.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChildHealthChecks(java.util.Collection)} or {@link #withChildHealthChecks(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param childHealthChecks
     *        (CALCULATED Health Checks Only) A complex type that contains one <code>ChildHealthCheck</code> element for
     *        each health check that you want to associate with a <code>CALCULATED</code> health check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheckConfig withChildHealthChecks(String... childHealthChecks) {
        if (this.childHealthChecks == null) {
            setChildHealthChecks(new com.amazonaws.internal.SdkInternalList<String>(childHealthChecks.length));
        }
        for (String ele : childHealthChecks) {
            this.childHealthChecks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * (CALCULATED Health Checks Only) A complex type that contains one <code>ChildHealthCheck</code> element for each
     * health check that you want to associate with a <code>CALCULATED</code> health check.
     * </p>
     * 
     * @param childHealthChecks
     *        (CALCULATED Health Checks Only) A complex type that contains one <code>ChildHealthCheck</code> element for
     *        each health check that you want to associate with a <code>CALCULATED</code> health check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheckConfig withChildHealthChecks(java.util.Collection<String> childHealthChecks) {
        setChildHealthChecks(childHealthChecks);
        return this;
    }

    /**
     * <p>
     * Specify whether you want Amazon Route 53 to send the value of <code>FullyQualifiedDomainName</code> to the
     * endpoint in the <code>client_hello</code> message during TLS negotiation. This allows the endpoint to respond to
     * <code>HTTPS</code> health check requests with the applicable SSL/TLS certificate.
     * </p>
     * <p>
     * Some endpoints require that <code>HTTPS</code> requests include the host name in the <code>client_hello</code>
     * message. If you don't enable SNI, the status of the health check will be <code>SSL alert handshake_failure</code>
     * . A health check can also have that status for other reasons. If SNI is enabled and you're still getting the
     * error, check the SSL/TLS configuration on your endpoint and confirm that your certificate is valid.
     * </p>
     * <p>
     * The SSL/TLS certificate on your endpoint includes a domain name in the <code>Common Name</code> field and
     * possibly several more in the <code>Subject Alternative Names</code> field. One of the domain names in the
     * certificate should match the value that you specify for <code>FullyQualifiedDomainName</code>. If the endpoint
     * responds to the <code>client_hello</code> message with a certificate that does not include the domain name that
     * you specified in <code>FullyQualifiedDomainName</code>, a health checker will retry the handshake. In the second
     * attempt, the health checker will omit <code>FullyQualifiedDomainName</code> from the <code>client_hello</code>
     * message.
     * </p>
     * 
     * @param enableSNI
     *        Specify whether you want Amazon Route 53 to send the value of <code>FullyQualifiedDomainName</code> to the
     *        endpoint in the <code>client_hello</code> message during TLS negotiation. This allows the endpoint to
     *        respond to <code>HTTPS</code> health check requests with the applicable SSL/TLS certificate.</p>
     *        <p>
     *        Some endpoints require that <code>HTTPS</code> requests include the host name in the
     *        <code>client_hello</code> message. If you don't enable SNI, the status of the health check will be
     *        <code>SSL alert handshake_failure</code>. A health check can also have that status for other reasons. If
     *        SNI is enabled and you're still getting the error, check the SSL/TLS configuration on your endpoint and
     *        confirm that your certificate is valid.
     *        </p>
     *        <p>
     *        The SSL/TLS certificate on your endpoint includes a domain name in the <code>Common Name</code> field and
     *        possibly several more in the <code>Subject Alternative Names</code> field. One of the domain names in the
     *        certificate should match the value that you specify for <code>FullyQualifiedDomainName</code>. If the
     *        endpoint responds to the <code>client_hello</code> message with a certificate that does not include the
     *        domain name that you specified in <code>FullyQualifiedDomainName</code>, a health checker will retry the
     *        handshake. In the second attempt, the health checker will omit <code>FullyQualifiedDomainName</code> from
     *        the <code>client_hello</code> message.
     */

    public void setEnableSNI(Boolean enableSNI) {
        this.enableSNI = enableSNI;
    }

    /**
     * <p>
     * Specify whether you want Amazon Route 53 to send the value of <code>FullyQualifiedDomainName</code> to the
     * endpoint in the <code>client_hello</code> message during TLS negotiation. This allows the endpoint to respond to
     * <code>HTTPS</code> health check requests with the applicable SSL/TLS certificate.
     * </p>
     * <p>
     * Some endpoints require that <code>HTTPS</code> requests include the host name in the <code>client_hello</code>
     * message. If you don't enable SNI, the status of the health check will be <code>SSL alert handshake_failure</code>
     * . A health check can also have that status for other reasons. If SNI is enabled and you're still getting the
     * error, check the SSL/TLS configuration on your endpoint and confirm that your certificate is valid.
     * </p>
     * <p>
     * The SSL/TLS certificate on your endpoint includes a domain name in the <code>Common Name</code> field and
     * possibly several more in the <code>Subject Alternative Names</code> field. One of the domain names in the
     * certificate should match the value that you specify for <code>FullyQualifiedDomainName</code>. If the endpoint
     * responds to the <code>client_hello</code> message with a certificate that does not include the domain name that
     * you specified in <code>FullyQualifiedDomainName</code>, a health checker will retry the handshake. In the second
     * attempt, the health checker will omit <code>FullyQualifiedDomainName</code> from the <code>client_hello</code>
     * message.
     * </p>
     * 
     * @return Specify whether you want Amazon Route 53 to send the value of <code>FullyQualifiedDomainName</code> to
     *         the endpoint in the <code>client_hello</code> message during TLS negotiation. This allows the endpoint to
     *         respond to <code>HTTPS</code> health check requests with the applicable SSL/TLS certificate.</p>
     *         <p>
     *         Some endpoints require that <code>HTTPS</code> requests include the host name in the
     *         <code>client_hello</code> message. If you don't enable SNI, the status of the health check will be
     *         <code>SSL alert handshake_failure</code>. A health check can also have that status for other reasons. If
     *         SNI is enabled and you're still getting the error, check the SSL/TLS configuration on your endpoint and
     *         confirm that your certificate is valid.
     *         </p>
     *         <p>
     *         The SSL/TLS certificate on your endpoint includes a domain name in the <code>Common Name</code> field and
     *         possibly several more in the <code>Subject Alternative Names</code> field. One of the domain names in the
     *         certificate should match the value that you specify for <code>FullyQualifiedDomainName</code>. If the
     *         endpoint responds to the <code>client_hello</code> message with a certificate that does not include the
     *         domain name that you specified in <code>FullyQualifiedDomainName</code>, a health checker will retry the
     *         handshake. In the second attempt, the health checker will omit <code>FullyQualifiedDomainName</code> from
     *         the <code>client_hello</code> message.
     */

    public Boolean getEnableSNI() {
        return this.enableSNI;
    }

    /**
     * <p>
     * Specify whether you want Amazon Route 53 to send the value of <code>FullyQualifiedDomainName</code> to the
     * endpoint in the <code>client_hello</code> message during TLS negotiation. This allows the endpoint to respond to
     * <code>HTTPS</code> health check requests with the applicable SSL/TLS certificate.
     * </p>
     * <p>
     * Some endpoints require that <code>HTTPS</code> requests include the host name in the <code>client_hello</code>
     * message. If you don't enable SNI, the status of the health check will be <code>SSL alert handshake_failure</code>
     * . A health check can also have that status for other reasons. If SNI is enabled and you're still getting the
     * error, check the SSL/TLS configuration on your endpoint and confirm that your certificate is valid.
     * </p>
     * <p>
     * The SSL/TLS certificate on your endpoint includes a domain name in the <code>Common Name</code> field and
     * possibly several more in the <code>Subject Alternative Names</code> field. One of the domain names in the
     * certificate should match the value that you specify for <code>FullyQualifiedDomainName</code>. If the endpoint
     * responds to the <code>client_hello</code> message with a certificate that does not include the domain name that
     * you specified in <code>FullyQualifiedDomainName</code>, a health checker will retry the handshake. In the second
     * attempt, the health checker will omit <code>FullyQualifiedDomainName</code> from the <code>client_hello</code>
     * message.
     * </p>
     * 
     * @param enableSNI
     *        Specify whether you want Amazon Route 53 to send the value of <code>FullyQualifiedDomainName</code> to the
     *        endpoint in the <code>client_hello</code> message during TLS negotiation. This allows the endpoint to
     *        respond to <code>HTTPS</code> health check requests with the applicable SSL/TLS certificate.</p>
     *        <p>
     *        Some endpoints require that <code>HTTPS</code> requests include the host name in the
     *        <code>client_hello</code> message. If you don't enable SNI, the status of the health check will be
     *        <code>SSL alert handshake_failure</code>. A health check can also have that status for other reasons. If
     *        SNI is enabled and you're still getting the error, check the SSL/TLS configuration on your endpoint and
     *        confirm that your certificate is valid.
     *        </p>
     *        <p>
     *        The SSL/TLS certificate on your endpoint includes a domain name in the <code>Common Name</code> field and
     *        possibly several more in the <code>Subject Alternative Names</code> field. One of the domain names in the
     *        certificate should match the value that you specify for <code>FullyQualifiedDomainName</code>. If the
     *        endpoint responds to the <code>client_hello</code> message with a certificate that does not include the
     *        domain name that you specified in <code>FullyQualifiedDomainName</code>, a health checker will retry the
     *        handshake. In the second attempt, the health checker will omit <code>FullyQualifiedDomainName</code> from
     *        the <code>client_hello</code> message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheckConfig withEnableSNI(Boolean enableSNI) {
        setEnableSNI(enableSNI);
        return this;
    }

    /**
     * <p>
     * Specify whether you want Amazon Route 53 to send the value of <code>FullyQualifiedDomainName</code> to the
     * endpoint in the <code>client_hello</code> message during TLS negotiation. This allows the endpoint to respond to
     * <code>HTTPS</code> health check requests with the applicable SSL/TLS certificate.
     * </p>
     * <p>
     * Some endpoints require that <code>HTTPS</code> requests include the host name in the <code>client_hello</code>
     * message. If you don't enable SNI, the status of the health check will be <code>SSL alert handshake_failure</code>
     * . A health check can also have that status for other reasons. If SNI is enabled and you're still getting the
     * error, check the SSL/TLS configuration on your endpoint and confirm that your certificate is valid.
     * </p>
     * <p>
     * The SSL/TLS certificate on your endpoint includes a domain name in the <code>Common Name</code> field and
     * possibly several more in the <code>Subject Alternative Names</code> field. One of the domain names in the
     * certificate should match the value that you specify for <code>FullyQualifiedDomainName</code>. If the endpoint
     * responds to the <code>client_hello</code> message with a certificate that does not include the domain name that
     * you specified in <code>FullyQualifiedDomainName</code>, a health checker will retry the handshake. In the second
     * attempt, the health checker will omit <code>FullyQualifiedDomainName</code> from the <code>client_hello</code>
     * message.
     * </p>
     * 
     * @return Specify whether you want Amazon Route 53 to send the value of <code>FullyQualifiedDomainName</code> to
     *         the endpoint in the <code>client_hello</code> message during TLS negotiation. This allows the endpoint to
     *         respond to <code>HTTPS</code> health check requests with the applicable SSL/TLS certificate.</p>
     *         <p>
     *         Some endpoints require that <code>HTTPS</code> requests include the host name in the
     *         <code>client_hello</code> message. If you don't enable SNI, the status of the health check will be
     *         <code>SSL alert handshake_failure</code>. A health check can also have that status for other reasons. If
     *         SNI is enabled and you're still getting the error, check the SSL/TLS configuration on your endpoint and
     *         confirm that your certificate is valid.
     *         </p>
     *         <p>
     *         The SSL/TLS certificate on your endpoint includes a domain name in the <code>Common Name</code> field and
     *         possibly several more in the <code>Subject Alternative Names</code> field. One of the domain names in the
     *         certificate should match the value that you specify for <code>FullyQualifiedDomainName</code>. If the
     *         endpoint responds to the <code>client_hello</code> message with a certificate that does not include the
     *         domain name that you specified in <code>FullyQualifiedDomainName</code>, a health checker will retry the
     *         handshake. In the second attempt, the health checker will omit <code>FullyQualifiedDomainName</code> from
     *         the <code>client_hello</code> message.
     */

    public Boolean isEnableSNI() {
        return this.enableSNI;
    }

    /**
     * <p>
     * A complex type that contains one <code>Region</code> element for each region from which you want Amazon Route 53
     * health checkers to check the specified endpoint.
     * </p>
     * <p>
     * If you don't specify any regions, Route 53 health checkers automatically performs checks from all of the regions
     * that are listed under <b>Valid Values</b>.
     * </p>
     * <p>
     * If you update a health check to remove a region that has been performing health checks, Route 53 will briefly
     * continue to perform checks from that region to ensure that some health checkers are always checking the endpoint
     * (for example, if you replace three regions with four different regions).
     * </p>
     * 
     * @return A complex type that contains one <code>Region</code> element for each region from which you want Amazon
     *         Route 53 health checkers to check the specified endpoint.</p>
     *         <p>
     *         If you don't specify any regions, Route 53 health checkers automatically performs checks from all of the
     *         regions that are listed under <b>Valid Values</b>.
     *         </p>
     *         <p>
     *         If you update a health check to remove a region that has been performing health checks, Route 53 will
     *         briefly continue to perform checks from that region to ensure that some health checkers are always
     *         checking the endpoint (for example, if you replace three regions with four different regions).
     * @see HealthCheckRegion
     */

    public java.util.List<String> getRegions() {
        if (regions == null) {
            regions = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return regions;
    }

    /**
     * <p>
     * A complex type that contains one <code>Region</code> element for each region from which you want Amazon Route 53
     * health checkers to check the specified endpoint.
     * </p>
     * <p>
     * If you don't specify any regions, Route 53 health checkers automatically performs checks from all of the regions
     * that are listed under <b>Valid Values</b>.
     * </p>
     * <p>
     * If you update a health check to remove a region that has been performing health checks, Route 53 will briefly
     * continue to perform checks from that region to ensure that some health checkers are always checking the endpoint
     * (for example, if you replace three regions with four different regions).
     * </p>
     * 
     * @param regions
     *        A complex type that contains one <code>Region</code> element for each region from which you want Amazon
     *        Route 53 health checkers to check the specified endpoint.</p>
     *        <p>
     *        If you don't specify any regions, Route 53 health checkers automatically performs checks from all of the
     *        regions that are listed under <b>Valid Values</b>.
     *        </p>
     *        <p>
     *        If you update a health check to remove a region that has been performing health checks, Route 53 will
     *        briefly continue to perform checks from that region to ensure that some health checkers are always
     *        checking the endpoint (for example, if you replace three regions with four different regions).
     * @see HealthCheckRegion
     */

    public void setRegions(java.util.Collection<String> regions) {
        if (regions == null) {
            this.regions = null;
            return;
        }

        this.regions = new com.amazonaws.internal.SdkInternalList<String>(regions);
    }

    /**
     * <p>
     * A complex type that contains one <code>Region</code> element for each region from which you want Amazon Route 53
     * health checkers to check the specified endpoint.
     * </p>
     * <p>
     * If you don't specify any regions, Route 53 health checkers automatically performs checks from all of the regions
     * that are listed under <b>Valid Values</b>.
     * </p>
     * <p>
     * If you update a health check to remove a region that has been performing health checks, Route 53 will briefly
     * continue to perform checks from that region to ensure that some health checkers are always checking the endpoint
     * (for example, if you replace three regions with four different regions).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegions(java.util.Collection)} or {@link #withRegions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param regions
     *        A complex type that contains one <code>Region</code> element for each region from which you want Amazon
     *        Route 53 health checkers to check the specified endpoint.</p>
     *        <p>
     *        If you don't specify any regions, Route 53 health checkers automatically performs checks from all of the
     *        regions that are listed under <b>Valid Values</b>.
     *        </p>
     *        <p>
     *        If you update a health check to remove a region that has been performing health checks, Route 53 will
     *        briefly continue to perform checks from that region to ensure that some health checkers are always
     *        checking the endpoint (for example, if you replace three regions with four different regions).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthCheckRegion
     */

    public HealthCheckConfig withRegions(String... regions) {
        if (this.regions == null) {
            setRegions(new com.amazonaws.internal.SdkInternalList<String>(regions.length));
        }
        for (String ele : regions) {
            this.regions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains one <code>Region</code> element for each region from which you want Amazon Route 53
     * health checkers to check the specified endpoint.
     * </p>
     * <p>
     * If you don't specify any regions, Route 53 health checkers automatically performs checks from all of the regions
     * that are listed under <b>Valid Values</b>.
     * </p>
     * <p>
     * If you update a health check to remove a region that has been performing health checks, Route 53 will briefly
     * continue to perform checks from that region to ensure that some health checkers are always checking the endpoint
     * (for example, if you replace three regions with four different regions).
     * </p>
     * 
     * @param regions
     *        A complex type that contains one <code>Region</code> element for each region from which you want Amazon
     *        Route 53 health checkers to check the specified endpoint.</p>
     *        <p>
     *        If you don't specify any regions, Route 53 health checkers automatically performs checks from all of the
     *        regions that are listed under <b>Valid Values</b>.
     *        </p>
     *        <p>
     *        If you update a health check to remove a region that has been performing health checks, Route 53 will
     *        briefly continue to perform checks from that region to ensure that some health checkers are always
     *        checking the endpoint (for example, if you replace three regions with four different regions).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthCheckRegion
     */

    public HealthCheckConfig withRegions(java.util.Collection<String> regions) {
        setRegions(regions);
        return this;
    }

    /**
     * <p>
     * A complex type that contains one <code>Region</code> element for each region from which you want Amazon Route 53
     * health checkers to check the specified endpoint.
     * </p>
     * <p>
     * If you don't specify any regions, Route 53 health checkers automatically performs checks from all of the regions
     * that are listed under <b>Valid Values</b>.
     * </p>
     * <p>
     * If you update a health check to remove a region that has been performing health checks, Route 53 will briefly
     * continue to perform checks from that region to ensure that some health checkers are always checking the endpoint
     * (for example, if you replace three regions with four different regions).
     * </p>
     * 
     * @param regions
     *        A complex type that contains one <code>Region</code> element for each region from which you want Amazon
     *        Route 53 health checkers to check the specified endpoint.</p>
     *        <p>
     *        If you don't specify any regions, Route 53 health checkers automatically performs checks from all of the
     *        regions that are listed under <b>Valid Values</b>.
     *        </p>
     *        <p>
     *        If you update a health check to remove a region that has been performing health checks, Route 53 will
     *        briefly continue to perform checks from that region to ensure that some health checkers are always
     *        checking the endpoint (for example, if you replace three regions with four different regions).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthCheckRegion
     */

    public HealthCheckConfig withRegions(HealthCheckRegion... regions) {
        com.amazonaws.internal.SdkInternalList<String> regionsCopy = new com.amazonaws.internal.SdkInternalList<String>(regions.length);
        for (HealthCheckRegion value : regions) {
            regionsCopy.add(value.toString());
        }
        if (getRegions() == null) {
            setRegions(regionsCopy);
        } else {
            getRegions().addAll(regionsCopy);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that identifies the CloudWatch alarm that you want Amazon Route 53 health checkers to use to
     * determine whether the specified health check is healthy.
     * </p>
     * 
     * @param alarmIdentifier
     *        A complex type that identifies the CloudWatch alarm that you want Amazon Route 53 health checkers to use
     *        to determine whether the specified health check is healthy.
     */

    public void setAlarmIdentifier(AlarmIdentifier alarmIdentifier) {
        this.alarmIdentifier = alarmIdentifier;
    }

    /**
     * <p>
     * A complex type that identifies the CloudWatch alarm that you want Amazon Route 53 health checkers to use to
     * determine whether the specified health check is healthy.
     * </p>
     * 
     * @return A complex type that identifies the CloudWatch alarm that you want Amazon Route 53 health checkers to use
     *         to determine whether the specified health check is healthy.
     */

    public AlarmIdentifier getAlarmIdentifier() {
        return this.alarmIdentifier;
    }

    /**
     * <p>
     * A complex type that identifies the CloudWatch alarm that you want Amazon Route 53 health checkers to use to
     * determine whether the specified health check is healthy.
     * </p>
     * 
     * @param alarmIdentifier
     *        A complex type that identifies the CloudWatch alarm that you want Amazon Route 53 health checkers to use
     *        to determine whether the specified health check is healthy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HealthCheckConfig withAlarmIdentifier(AlarmIdentifier alarmIdentifier) {
        setAlarmIdentifier(alarmIdentifier);
        return this;
    }

    /**
     * <p>
     * When CloudWatch has insufficient data about the metric to determine the alarm state, the status that you want
     * Amazon Route 53 to assign to the health check:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Healthy</code>: Route 53 considers the health check to be healthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unhealthy</code>: Route 53 considers the health check to be unhealthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastKnownStatus</code>: Route 53 uses the status of the health check from the last time that CloudWatch had
     * sufficient data to determine the alarm state. For new health checks that have no last known status, the default
     * status for the health check is healthy.
     * </p>
     * </li>
     * </ul>
     * 
     * @param insufficientDataHealthStatus
     *        When CloudWatch has insufficient data about the metric to determine the alarm state, the status that you
     *        want Amazon Route 53 to assign to the health check:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Healthy</code>: Route 53 considers the health check to be healthy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Unhealthy</code>: Route 53 considers the health check to be unhealthy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LastKnownStatus</code>: Route 53 uses the status of the health check from the last time that
     *        CloudWatch had sufficient data to determine the alarm state. For new health checks that have no last known
     *        status, the default status for the health check is healthy.
     *        </p>
     *        </li>
     * @see InsufficientDataHealthStatus
     */

    public void setInsufficientDataHealthStatus(String insufficientDataHealthStatus) {
        this.insufficientDataHealthStatus = insufficientDataHealthStatus;
    }

    /**
     * <p>
     * When CloudWatch has insufficient data about the metric to determine the alarm state, the status that you want
     * Amazon Route 53 to assign to the health check:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Healthy</code>: Route 53 considers the health check to be healthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unhealthy</code>: Route 53 considers the health check to be unhealthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastKnownStatus</code>: Route 53 uses the status of the health check from the last time that CloudWatch had
     * sufficient data to determine the alarm state. For new health checks that have no last known status, the default
     * status for the health check is healthy.
     * </p>
     * </li>
     * </ul>
     * 
     * @return When CloudWatch has insufficient data about the metric to determine the alarm state, the status that you
     *         want Amazon Route 53 to assign to the health check:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Healthy</code>: Route 53 considers the health check to be healthy.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Unhealthy</code>: Route 53 considers the health check to be unhealthy.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LastKnownStatus</code>: Route 53 uses the status of the health check from the last time that
     *         CloudWatch had sufficient data to determine the alarm state. For new health checks that have no last
     *         known status, the default status for the health check is healthy.
     *         </p>
     *         </li>
     * @see InsufficientDataHealthStatus
     */

    public String getInsufficientDataHealthStatus() {
        return this.insufficientDataHealthStatus;
    }

    /**
     * <p>
     * When CloudWatch has insufficient data about the metric to determine the alarm state, the status that you want
     * Amazon Route 53 to assign to the health check:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Healthy</code>: Route 53 considers the health check to be healthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unhealthy</code>: Route 53 considers the health check to be unhealthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastKnownStatus</code>: Route 53 uses the status of the health check from the last time that CloudWatch had
     * sufficient data to determine the alarm state. For new health checks that have no last known status, the default
     * status for the health check is healthy.
     * </p>
     * </li>
     * </ul>
     * 
     * @param insufficientDataHealthStatus
     *        When CloudWatch has insufficient data about the metric to determine the alarm state, the status that you
     *        want Amazon Route 53 to assign to the health check:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Healthy</code>: Route 53 considers the health check to be healthy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Unhealthy</code>: Route 53 considers the health check to be unhealthy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LastKnownStatus</code>: Route 53 uses the status of the health check from the last time that
     *        CloudWatch had sufficient data to determine the alarm state. For new health checks that have no last known
     *        status, the default status for the health check is healthy.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsufficientDataHealthStatus
     */

    public HealthCheckConfig withInsufficientDataHealthStatus(String insufficientDataHealthStatus) {
        setInsufficientDataHealthStatus(insufficientDataHealthStatus);
        return this;
    }

    /**
     * <p>
     * When CloudWatch has insufficient data about the metric to determine the alarm state, the status that you want
     * Amazon Route 53 to assign to the health check:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Healthy</code>: Route 53 considers the health check to be healthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unhealthy</code>: Route 53 considers the health check to be unhealthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastKnownStatus</code>: Route 53 uses the status of the health check from the last time that CloudWatch had
     * sufficient data to determine the alarm state. For new health checks that have no last known status, the default
     * status for the health check is healthy.
     * </p>
     * </li>
     * </ul>
     * 
     * @param insufficientDataHealthStatus
     *        When CloudWatch has insufficient data about the metric to determine the alarm state, the status that you
     *        want Amazon Route 53 to assign to the health check:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Healthy</code>: Route 53 considers the health check to be healthy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Unhealthy</code>: Route 53 considers the health check to be unhealthy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LastKnownStatus</code>: Route 53 uses the status of the health check from the last time that
     *        CloudWatch had sufficient data to determine the alarm state. For new health checks that have no last known
     *        status, the default status for the health check is healthy.
     *        </p>
     *        </li>
     * @see InsufficientDataHealthStatus
     */

    public void setInsufficientDataHealthStatus(InsufficientDataHealthStatus insufficientDataHealthStatus) {
        withInsufficientDataHealthStatus(insufficientDataHealthStatus);
    }

    /**
     * <p>
     * When CloudWatch has insufficient data about the metric to determine the alarm state, the status that you want
     * Amazon Route 53 to assign to the health check:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Healthy</code>: Route 53 considers the health check to be healthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unhealthy</code>: Route 53 considers the health check to be unhealthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastKnownStatus</code>: Route 53 uses the status of the health check from the last time that CloudWatch had
     * sufficient data to determine the alarm state. For new health checks that have no last known status, the default
     * status for the health check is healthy.
     * </p>
     * </li>
     * </ul>
     * 
     * @param insufficientDataHealthStatus
     *        When CloudWatch has insufficient data about the metric to determine the alarm state, the status that you
     *        want Amazon Route 53 to assign to the health check:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Healthy</code>: Route 53 considers the health check to be healthy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Unhealthy</code>: Route 53 considers the health check to be unhealthy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LastKnownStatus</code>: Route 53 uses the status of the health check from the last time that
     *        CloudWatch had sufficient data to determine the alarm state. For new health checks that have no last known
     *        status, the default status for the health check is healthy.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsufficientDataHealthStatus
     */

    public HealthCheckConfig withInsufficientDataHealthStatus(InsufficientDataHealthStatus insufficientDataHealthStatus) {
        this.insufficientDataHealthStatus = insufficientDataHealthStatus.toString();
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
        if (getIPAddress() != null)
            sb.append("IPAddress: ").append(getIPAddress()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getResourcePath() != null)
            sb.append("ResourcePath: ").append(getResourcePath()).append(",");
        if (getFullyQualifiedDomainName() != null)
            sb.append("FullyQualifiedDomainName: ").append(getFullyQualifiedDomainName()).append(",");
        if (getSearchString() != null)
            sb.append("SearchString: ").append(getSearchString()).append(",");
        if (getRequestInterval() != null)
            sb.append("RequestInterval: ").append(getRequestInterval()).append(",");
        if (getFailureThreshold() != null)
            sb.append("FailureThreshold: ").append(getFailureThreshold()).append(",");
        if (getMeasureLatency() != null)
            sb.append("MeasureLatency: ").append(getMeasureLatency()).append(",");
        if (getInverted() != null)
            sb.append("Inverted: ").append(getInverted()).append(",");
        if (getDisabled() != null)
            sb.append("Disabled: ").append(getDisabled()).append(",");
        if (getHealthThreshold() != null)
            sb.append("HealthThreshold: ").append(getHealthThreshold()).append(",");
        if (getChildHealthChecks() != null)
            sb.append("ChildHealthChecks: ").append(getChildHealthChecks()).append(",");
        if (getEnableSNI() != null)
            sb.append("EnableSNI: ").append(getEnableSNI()).append(",");
        if (getRegions() != null)
            sb.append("Regions: ").append(getRegions()).append(",");
        if (getAlarmIdentifier() != null)
            sb.append("AlarmIdentifier: ").append(getAlarmIdentifier()).append(",");
        if (getInsufficientDataHealthStatus() != null)
            sb.append("InsufficientDataHealthStatus: ").append(getInsufficientDataHealthStatus());
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
        if (other.getIPAddress() == null ^ this.getIPAddress() == null)
            return false;
        if (other.getIPAddress() != null && other.getIPAddress().equals(this.getIPAddress()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getResourcePath() == null ^ this.getResourcePath() == null)
            return false;
        if (other.getResourcePath() != null && other.getResourcePath().equals(this.getResourcePath()) == false)
            return false;
        if (other.getFullyQualifiedDomainName() == null ^ this.getFullyQualifiedDomainName() == null)
            return false;
        if (other.getFullyQualifiedDomainName() != null && other.getFullyQualifiedDomainName().equals(this.getFullyQualifiedDomainName()) == false)
            return false;
        if (other.getSearchString() == null ^ this.getSearchString() == null)
            return false;
        if (other.getSearchString() != null && other.getSearchString().equals(this.getSearchString()) == false)
            return false;
        if (other.getRequestInterval() == null ^ this.getRequestInterval() == null)
            return false;
        if (other.getRequestInterval() != null && other.getRequestInterval().equals(this.getRequestInterval()) == false)
            return false;
        if (other.getFailureThreshold() == null ^ this.getFailureThreshold() == null)
            return false;
        if (other.getFailureThreshold() != null && other.getFailureThreshold().equals(this.getFailureThreshold()) == false)
            return false;
        if (other.getMeasureLatency() == null ^ this.getMeasureLatency() == null)
            return false;
        if (other.getMeasureLatency() != null && other.getMeasureLatency().equals(this.getMeasureLatency()) == false)
            return false;
        if (other.getInverted() == null ^ this.getInverted() == null)
            return false;
        if (other.getInverted() != null && other.getInverted().equals(this.getInverted()) == false)
            return false;
        if (other.getDisabled() == null ^ this.getDisabled() == null)
            return false;
        if (other.getDisabled() != null && other.getDisabled().equals(this.getDisabled()) == false)
            return false;
        if (other.getHealthThreshold() == null ^ this.getHealthThreshold() == null)
            return false;
        if (other.getHealthThreshold() != null && other.getHealthThreshold().equals(this.getHealthThreshold()) == false)
            return false;
        if (other.getChildHealthChecks() == null ^ this.getChildHealthChecks() == null)
            return false;
        if (other.getChildHealthChecks() != null && other.getChildHealthChecks().equals(this.getChildHealthChecks()) == false)
            return false;
        if (other.getEnableSNI() == null ^ this.getEnableSNI() == null)
            return false;
        if (other.getEnableSNI() != null && other.getEnableSNI().equals(this.getEnableSNI()) == false)
            return false;
        if (other.getRegions() == null ^ this.getRegions() == null)
            return false;
        if (other.getRegions() != null && other.getRegions().equals(this.getRegions()) == false)
            return false;
        if (other.getAlarmIdentifier() == null ^ this.getAlarmIdentifier() == null)
            return false;
        if (other.getAlarmIdentifier() != null && other.getAlarmIdentifier().equals(this.getAlarmIdentifier()) == false)
            return false;
        if (other.getInsufficientDataHealthStatus() == null ^ this.getInsufficientDataHealthStatus() == null)
            return false;
        if (other.getInsufficientDataHealthStatus() != null && other.getInsufficientDataHealthStatus().equals(this.getInsufficientDataHealthStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIPAddress() == null) ? 0 : getIPAddress().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getResourcePath() == null) ? 0 : getResourcePath().hashCode());
        hashCode = prime * hashCode + ((getFullyQualifiedDomainName() == null) ? 0 : getFullyQualifiedDomainName().hashCode());
        hashCode = prime * hashCode + ((getSearchString() == null) ? 0 : getSearchString().hashCode());
        hashCode = prime * hashCode + ((getRequestInterval() == null) ? 0 : getRequestInterval().hashCode());
        hashCode = prime * hashCode + ((getFailureThreshold() == null) ? 0 : getFailureThreshold().hashCode());
        hashCode = prime * hashCode + ((getMeasureLatency() == null) ? 0 : getMeasureLatency().hashCode());
        hashCode = prime * hashCode + ((getInverted() == null) ? 0 : getInverted().hashCode());
        hashCode = prime * hashCode + ((getDisabled() == null) ? 0 : getDisabled().hashCode());
        hashCode = prime * hashCode + ((getHealthThreshold() == null) ? 0 : getHealthThreshold().hashCode());
        hashCode = prime * hashCode + ((getChildHealthChecks() == null) ? 0 : getChildHealthChecks().hashCode());
        hashCode = prime * hashCode + ((getEnableSNI() == null) ? 0 : getEnableSNI().hashCode());
        hashCode = prime * hashCode + ((getRegions() == null) ? 0 : getRegions().hashCode());
        hashCode = prime * hashCode + ((getAlarmIdentifier() == null) ? 0 : getAlarmIdentifier().hashCode());
        hashCode = prime * hashCode + ((getInsufficientDataHealthStatus() == null) ? 0 : getInsufficientDataHealthStatus().hashCode());
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

}
