/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A complex type that contains the health check request information.
 * </p>
 */
public class UpdateHealthCheckRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID for the health check for which you want detailed information. When you created the health check,
     * <code>CreateHealthCheck</code> returned the ID in the response, in the <code>HealthCheckId</code> element.
     * </p>
     */
    private String healthCheckId;
    /**
     * <p>
     * A sequential counter that Amazon Route 53 sets to <code>1</code> when you create a health check and increments by
     * <code>1</code> each time you update settings for the health check.
     * </p>
     * <p>
     * We recommend that you use <code>GetHealthCheck</code> or <code>ListHealthChecks</code> to get the current value
     * of <code>HealthCheckVersion</code> for the health check that you want to update, and that you include that value
     * in your <code>UpdateHealthCheck</code> request. This prevents Amazon Route 53 from overwriting an intervening
     * update:
     * </p>
     * <ul>
     * <li>
     * <p>
     * f the value in the <code>UpdateHealthCheck</code> request matches the value of <code>HealthCheckVersion</code> in
     * the health check, Amazon Route 53 updates the health check with the new settings.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value of <code>HealthCheckVersion</code> in the health check is greater, the health check was changed
     * after you got the version number. Amazon Route 53 does not update the health check, and it returns a
     * <code>HealthCheckVersionMismatch</code> error.
     * </p>
     * </li>
     * </ul>
     */
    private Long healthCheckVersion;
    /**
     * <p>
     * The IPv4 or IPv6 IP address for the endpoint that you want Amazon Route 53 to perform health checks on. If you
     * don't specify a value for <code>IPAddress</code>, Amazon Route 53 sends a DNS request to resolve the domain name
     * that you specify in <code>FullyQualifiedDomainName</code> at the interval that you specify in
     * <code>RequestInterval</code>. Using an IP address that is returned by DNS, Amazon Route 53 then checks the health
     * of the endpoint.
     * </p>
     * <p>
     * If the endpoint is an EC2 instance, we recommend that you create an Elastic IP address, associate it with your
     * EC2 instance, and specify the Elastic IP address for <code>IPAddress</code>. This ensures that the IP address of
     * your instance never changes. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic IP Addresses
     * (EIP)</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <note>
     * <p>
     * If a health check already has a value for <code>IPAddress</code>, you can change the value. However, you can't
     * update an existing health check to add or remove the value of <code>IPAddress</code>.
     * </p>
     * </note>
     * <p>
     * For more information, see <a>UpdateHealthCheckRequest$FullyQualifiedDomainName</a>.
     * </p>
     * <p>
     * Constraints: Amazon Route 53 can't check the health of endpoints for which the IP address is in local, private,
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
     */
    private String iPAddress;
    /**
     * <p>
     * The port on the endpoint on which you want Amazon Route 53 to perform health checks.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The path that you want Amazon Route 53 to request when performing health checks. The path can be any value for
     * which your endpoint will return an HTTP status code of 2xx or 3xx when the endpoint is healthy, for example the
     * file /docs/route53-health-check.html.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     */
    private String resourcePath;
    /**
     * <p>
     * Amazon Route 53 behavior depends on whether you specify a value for <code>IPAddress</code>.
     * </p>
     * <note>
     * <p>
     * If a health check already has a value for <code>IPAddress</code>, you can change the value. However, you can't
     * update an existing health check to add or remove the value of <code>IPAddress</code>.
     * </p>
     * </note>
     * <p>
     * <b>If you specify a value for</b> <code>IPAddress</code>:
     * </p>
     * <p>
     * Amazon Route 53 sends health check requests to the specified IPv4 or IPv6 address and passes the value of
     * <code>FullyQualifiedDomainName</code> in the <code>Host</code> header for all health checks except TCP health
     * checks. This is typically the fully qualified DNS name of the endpoint on which you want Amazon Route 53 to
     * perform health checks.
     * </p>
     * <p>
     * When Amazon Route 53 checks the health of an endpoint, here is how it constructs the <code>Host</code> header:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify a value of <code>80</code> for <code>Port</code> and <code>HTTP</code> or
     * <code>HTTP_STR_MATCH</code> for <code>Type</code>, Amazon Route 53 passes the value of
     * <code>FullyQualifiedDomainName</code> to the endpoint in the <code>Host</code> header.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a value of <code>443</code> for <code>Port</code> and <code>HTTPS</code> or
     * <code>HTTPS_STR_MATCH</code> for <code>Type</code>, Amazon Route 53 passes the value of
     * <code>FullyQualifiedDomainName</code> to the endpoint in the Host header.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify another value for <code>Port</code> and any value except <code>TCP</code> for <code>Type</code>,
     * Amazon Route 53 passes <i> <code>FullyQualifiedDomainName</code>:<code>Port</code> </i> to the endpoint in the
     * Host header.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value for <code>FullyQualifiedDomainName</code>, Amazon Route 53 substitutes the value of
     * <code>IPAddress</code> in the <code>Host</code> header in each of the above cases.
     * </p>
     * <p>
     * <b>If you don't specify a value for</b> <code>IPAddress</code>:
     * </p>
     * <p>
     * If you don't specify a value for <code>IPAddress</code>, Amazon Route 53 sends a DNS request to the domain that
     * you specify in <code>FullyQualifiedDomainName</code> at the interval you specify in <code>RequestInterval</code>.
     * Using an IPv4 address that is returned by DNS, Amazon Route 53 then checks the health of the endpoint.
     * </p>
     * <note>
     * <p>
     * If you don't specify a value for <code>IPAddress</code>, Amazon Route 53 uses only IPv4 to send health checks to
     * the endpoint. If there's no resource record set with a type of A for the name that you specify for
     * <code>FullyQualifiedDomainName</code>, the health check fails with a "DNS resolution failed" error.
     * </p>
     * </note>
     * <p>
     * If you want to check the health of weighted, latency, or failover resource record sets and you choose to specify
     * the endpoint only by <code>FullyQualifiedDomainName</code>, we recommend that you create a separate health check
     * for each endpoint. For example, create a health check for each HTTP server that is serving content for
     * www.example.com. For the value of <code>FullyQualifiedDomainName</code>, specify the domain name of the server
     * (such as <code>us-east-1-www.example.com</code>), not the name of the resource record sets (www.example.com).
     * </p>
     * <important>
     * <p>
     * In this configuration, if the value of <code>FullyQualifiedDomainName</code> matches the name of the resource
     * record sets and you then associate the health check with those resource record sets, health check results will be
     * unpredictable.
     * </p>
     * </important>
     * <p>
     * In addition, if the value of <code>Type</code> is <code>HTTP</code>, <code>HTTPS</code>,
     * <code>HTTP_STR_MATCH</code>, or <code>HTTPS_STR_MATCH</code>, Amazon Route 53 passes the value of
     * <code>FullyQualifiedDomainName</code> in the <code>Host</code> header, as it does when you specify a value for
     * <code>IPAddress</code>. If the value of <code>Type</code> is <code>TCP</code>, Amazon Route 53 doesn't pass a
     * <code>Host</code> header.
     * </p>
     */
    private String fullyQualifiedDomainName;
    /**
     * <p>
     * If the value of <code>Type</code> is <code>HTTP_STR_MATCH</code> or <code>HTTP_STR_MATCH</code>, the string that
     * you want Amazon Route 53 to search for in the response body from the specified resource. If the string appears in
     * the response body, Amazon Route 53 considers the resource healthy. (You can't change the value of
     * <code>Type</code> when you update a health check.)
     * </p>
     */
    private String searchString;
    /**
     * <p>
     * The number of consecutive health checks that an endpoint must pass or fail for Amazon Route 53 to change the
     * current status of the endpoint from unhealthy to healthy or vice versa. For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html">How
     * Amazon Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     */
    private Integer failureThreshold;
    /**
     * <p>
     * Specify whether you want Amazon Route 53 to invert the status of a health check, for example, to consider a
     * health check unhealthy when it otherwise would be considered healthy.
     * </p>
     */
    private Boolean inverted;
    /**
     * <p>
     * The number of child health checks that are associated with a <code>CALCULATED</code> health that Amazon Route 53
     * must consider healthy for the <code>CALCULATED</code> health check to be considered healthy. To specify the child
     * health checks that you want to associate with a <code>CALCULATED</code> health check, use the
     * <code>ChildHealthChecks</code> and <code>ChildHealthCheck</code> elements.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify a number greater than the number of child health checks, Amazon Route 53 always considers this
     * health check to be unhealthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify <code>0</code>, Amazon Route 53 always considers this health check to be healthy.
     * </p>
     * </li>
     * </ul>
     */
    private Integer healthThreshold;
    /**
     * <p>
     * A complex type that contains one <code>ChildHealthCheck</code> element for each health check that you want to
     * associate with a <code>CALCULATED</code> health check.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> childHealthChecks;
    /**
     * <p>
     * Specify whether you want Amazon Route 53 to send the value of <code>FullyQualifiedDomainName</code> to the
     * endpoint in the <code>client_hello</code> message during <code>TLS</code> negotiation. This allows the endpoint
     * to respond to <code>HTTPS</code> health check requests with the applicable SSL/TLS certificate.
     * </p>
     * <p>
     * Some endpoints require that HTTPS requests include the host name in the <code>client_hello</code> message. If you
     * don't enable SNI, the status of the health check will be SSL alert <code>handshake_failure</code>. A health check
     * can also have that status for other reasons. If SNI is enabled and you're still getting the error, check the
     * SSL/TLS configuration on your endpoint and confirm that your certificate is valid.
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
     * A complex type that contains one Region element for each region from which you want Amazon Route 53 health
     * checkers to check the specified endpoint.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> regions;

    private AlarmIdentifier alarmIdentifier;
    /**
     * <p>
     * When CloudWatch has insufficient data about the metric to determine the alarm state, the status that you want
     * Amazon Route 53 to assign to the health check:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Healthy</code>: Amazon Route 53 considers the health check to be healthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unhealthy</code>: Amazon Route 53 considers the health check to be unhealthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastKnownStatus</code>: Amazon Route 53 uses the status of the health check from the last time CloudWatch
     * had sufficient data to determine the alarm state. For new health checks that have no last known status, the
     * default status for the health check is healthy.
     * </p>
     * </li>
     * </ul>
     */
    private String insufficientDataHealthStatus;

    /**
     * <p>
     * The ID for the health check for which you want detailed information. When you created the health check,
     * <code>CreateHealthCheck</code> returned the ID in the response, in the <code>HealthCheckId</code> element.
     * </p>
     * 
     * @param healthCheckId
     *        The ID for the health check for which you want detailed information. When you created the health check,
     *        <code>CreateHealthCheck</code> returned the ID in the response, in the <code>HealthCheckId</code> element.
     */

    public void setHealthCheckId(String healthCheckId) {
        this.healthCheckId = healthCheckId;
    }

    /**
     * <p>
     * The ID for the health check for which you want detailed information. When you created the health check,
     * <code>CreateHealthCheck</code> returned the ID in the response, in the <code>HealthCheckId</code> element.
     * </p>
     * 
     * @return The ID for the health check for which you want detailed information. When you created the health check,
     *         <code>CreateHealthCheck</code> returned the ID in the response, in the <code>HealthCheckId</code>
     *         element.
     */

    public String getHealthCheckId() {
        return this.healthCheckId;
    }

    /**
     * <p>
     * The ID for the health check for which you want detailed information. When you created the health check,
     * <code>CreateHealthCheck</code> returned the ID in the response, in the <code>HealthCheckId</code> element.
     * </p>
     * 
     * @param healthCheckId
     *        The ID for the health check for which you want detailed information. When you created the health check,
     *        <code>CreateHealthCheck</code> returned the ID in the response, in the <code>HealthCheckId</code> element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateHealthCheckRequest withHealthCheckId(String healthCheckId) {
        setHealthCheckId(healthCheckId);
        return this;
    }

    /**
     * <p>
     * A sequential counter that Amazon Route 53 sets to <code>1</code> when you create a health check and increments by
     * <code>1</code> each time you update settings for the health check.
     * </p>
     * <p>
     * We recommend that you use <code>GetHealthCheck</code> or <code>ListHealthChecks</code> to get the current value
     * of <code>HealthCheckVersion</code> for the health check that you want to update, and that you include that value
     * in your <code>UpdateHealthCheck</code> request. This prevents Amazon Route 53 from overwriting an intervening
     * update:
     * </p>
     * <ul>
     * <li>
     * <p>
     * f the value in the <code>UpdateHealthCheck</code> request matches the value of <code>HealthCheckVersion</code> in
     * the health check, Amazon Route 53 updates the health check with the new settings.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value of <code>HealthCheckVersion</code> in the health check is greater, the health check was changed
     * after you got the version number. Amazon Route 53 does not update the health check, and it returns a
     * <code>HealthCheckVersionMismatch</code> error.
     * </p>
     * </li>
     * </ul>
     * 
     * @param healthCheckVersion
     *        A sequential counter that Amazon Route 53 sets to <code>1</code> when you create a health check and
     *        increments by <code>1</code> each time you update settings for the health check.</p>
     *        <p>
     *        We recommend that you use <code>GetHealthCheck</code> or <code>ListHealthChecks</code> to get the current
     *        value of <code>HealthCheckVersion</code> for the health check that you want to update, and that you
     *        include that value in your <code>UpdateHealthCheck</code> request. This prevents Amazon Route 53 from
     *        overwriting an intervening update:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        f the value in the <code>UpdateHealthCheck</code> request matches the value of
     *        <code>HealthCheckVersion</code> in the health check, Amazon Route 53 updates the health check with the new
     *        settings.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the value of <code>HealthCheckVersion</code> in the health check is greater, the health check was
     *        changed after you got the version number. Amazon Route 53 does not update the health check, and it returns
     *        a <code>HealthCheckVersionMismatch</code> error.
     *        </p>
     *        </li>
     */

    public void setHealthCheckVersion(Long healthCheckVersion) {
        this.healthCheckVersion = healthCheckVersion;
    }

    /**
     * <p>
     * A sequential counter that Amazon Route 53 sets to <code>1</code> when you create a health check and increments by
     * <code>1</code> each time you update settings for the health check.
     * </p>
     * <p>
     * We recommend that you use <code>GetHealthCheck</code> or <code>ListHealthChecks</code> to get the current value
     * of <code>HealthCheckVersion</code> for the health check that you want to update, and that you include that value
     * in your <code>UpdateHealthCheck</code> request. This prevents Amazon Route 53 from overwriting an intervening
     * update:
     * </p>
     * <ul>
     * <li>
     * <p>
     * f the value in the <code>UpdateHealthCheck</code> request matches the value of <code>HealthCheckVersion</code> in
     * the health check, Amazon Route 53 updates the health check with the new settings.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value of <code>HealthCheckVersion</code> in the health check is greater, the health check was changed
     * after you got the version number. Amazon Route 53 does not update the health check, and it returns a
     * <code>HealthCheckVersionMismatch</code> error.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A sequential counter that Amazon Route 53 sets to <code>1</code> when you create a health check and
     *         increments by <code>1</code> each time you update settings for the health check.</p>
     *         <p>
     *         We recommend that you use <code>GetHealthCheck</code> or <code>ListHealthChecks</code> to get the current
     *         value of <code>HealthCheckVersion</code> for the health check that you want to update, and that you
     *         include that value in your <code>UpdateHealthCheck</code> request. This prevents Amazon Route 53 from
     *         overwriting an intervening update:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         f the value in the <code>UpdateHealthCheck</code> request matches the value of
     *         <code>HealthCheckVersion</code> in the health check, Amazon Route 53 updates the health check with the
     *         new settings.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the value of <code>HealthCheckVersion</code> in the health check is greater, the health check was
     *         changed after you got the version number. Amazon Route 53 does not update the health check, and it
     *         returns a <code>HealthCheckVersionMismatch</code> error.
     *         </p>
     *         </li>
     */

    public Long getHealthCheckVersion() {
        return this.healthCheckVersion;
    }

    /**
     * <p>
     * A sequential counter that Amazon Route 53 sets to <code>1</code> when you create a health check and increments by
     * <code>1</code> each time you update settings for the health check.
     * </p>
     * <p>
     * We recommend that you use <code>GetHealthCheck</code> or <code>ListHealthChecks</code> to get the current value
     * of <code>HealthCheckVersion</code> for the health check that you want to update, and that you include that value
     * in your <code>UpdateHealthCheck</code> request. This prevents Amazon Route 53 from overwriting an intervening
     * update:
     * </p>
     * <ul>
     * <li>
     * <p>
     * f the value in the <code>UpdateHealthCheck</code> request matches the value of <code>HealthCheckVersion</code> in
     * the health check, Amazon Route 53 updates the health check with the new settings.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value of <code>HealthCheckVersion</code> in the health check is greater, the health check was changed
     * after you got the version number. Amazon Route 53 does not update the health check, and it returns a
     * <code>HealthCheckVersionMismatch</code> error.
     * </p>
     * </li>
     * </ul>
     * 
     * @param healthCheckVersion
     *        A sequential counter that Amazon Route 53 sets to <code>1</code> when you create a health check and
     *        increments by <code>1</code> each time you update settings for the health check.</p>
     *        <p>
     *        We recommend that you use <code>GetHealthCheck</code> or <code>ListHealthChecks</code> to get the current
     *        value of <code>HealthCheckVersion</code> for the health check that you want to update, and that you
     *        include that value in your <code>UpdateHealthCheck</code> request. This prevents Amazon Route 53 from
     *        overwriting an intervening update:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        f the value in the <code>UpdateHealthCheck</code> request matches the value of
     *        <code>HealthCheckVersion</code> in the health check, Amazon Route 53 updates the health check with the new
     *        settings.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the value of <code>HealthCheckVersion</code> in the health check is greater, the health check was
     *        changed after you got the version number. Amazon Route 53 does not update the health check, and it returns
     *        a <code>HealthCheckVersionMismatch</code> error.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateHealthCheckRequest withHealthCheckVersion(Long healthCheckVersion) {
        setHealthCheckVersion(healthCheckVersion);
        return this;
    }

    /**
     * <p>
     * The IPv4 or IPv6 IP address for the endpoint that you want Amazon Route 53 to perform health checks on. If you
     * don't specify a value for <code>IPAddress</code>, Amazon Route 53 sends a DNS request to resolve the domain name
     * that you specify in <code>FullyQualifiedDomainName</code> at the interval that you specify in
     * <code>RequestInterval</code>. Using an IP address that is returned by DNS, Amazon Route 53 then checks the health
     * of the endpoint.
     * </p>
     * <p>
     * If the endpoint is an EC2 instance, we recommend that you create an Elastic IP address, associate it with your
     * EC2 instance, and specify the Elastic IP address for <code>IPAddress</code>. This ensures that the IP address of
     * your instance never changes. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic IP Addresses
     * (EIP)</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <note>
     * <p>
     * If a health check already has a value for <code>IPAddress</code>, you can change the value. However, you can't
     * update an existing health check to add or remove the value of <code>IPAddress</code>.
     * </p>
     * </note>
     * <p>
     * For more information, see <a>UpdateHealthCheckRequest$FullyQualifiedDomainName</a>.
     * </p>
     * <p>
     * Constraints: Amazon Route 53 can't check the health of endpoints for which the IP address is in local, private,
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
     * 
     * @param iPAddress
     *        The IPv4 or IPv6 IP address for the endpoint that you want Amazon Route 53 to perform health checks on. If
     *        you don't specify a value for <code>IPAddress</code>, Amazon Route 53 sends a DNS request to resolve the
     *        domain name that you specify in <code>FullyQualifiedDomainName</code> at the interval that you specify in
     *        <code>RequestInterval</code>. Using an IP address that is returned by DNS, Amazon Route 53 then checks the
     *        health of the endpoint.</p>
     *        <p>
     *        If the endpoint is an EC2 instance, we recommend that you create an Elastic IP address, associate it with
     *        your EC2 instance, and specify the Elastic IP address for <code>IPAddress</code>. This ensures that the IP
     *        address of your instance never changes. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic IP
     *        Addresses (EIP)</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     *        </p>
     *        <note>
     *        <p>
     *        If a health check already has a value for <code>IPAddress</code>, you can change the value. However, you
     *        can't update an existing health check to add or remove the value of <code>IPAddress</code>.
     *        </p>
     *        </note>
     *        <p>
     *        For more information, see <a>UpdateHealthCheckRequest$FullyQualifiedDomainName</a>.
     *        </p>
     *        <p>
     *        Constraints: Amazon Route 53 can't check the health of endpoints for which the IP address is in local,
     *        private, non-routable, or multicast ranges. For more information about IP addresses for which you can't
     *        create health checks, see the following documents:
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
     */

    public void setIPAddress(String iPAddress) {
        this.iPAddress = iPAddress;
    }

    /**
     * <p>
     * The IPv4 or IPv6 IP address for the endpoint that you want Amazon Route 53 to perform health checks on. If you
     * don't specify a value for <code>IPAddress</code>, Amazon Route 53 sends a DNS request to resolve the domain name
     * that you specify in <code>FullyQualifiedDomainName</code> at the interval that you specify in
     * <code>RequestInterval</code>. Using an IP address that is returned by DNS, Amazon Route 53 then checks the health
     * of the endpoint.
     * </p>
     * <p>
     * If the endpoint is an EC2 instance, we recommend that you create an Elastic IP address, associate it with your
     * EC2 instance, and specify the Elastic IP address for <code>IPAddress</code>. This ensures that the IP address of
     * your instance never changes. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic IP Addresses
     * (EIP)</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <note>
     * <p>
     * If a health check already has a value for <code>IPAddress</code>, you can change the value. However, you can't
     * update an existing health check to add or remove the value of <code>IPAddress</code>.
     * </p>
     * </note>
     * <p>
     * For more information, see <a>UpdateHealthCheckRequest$FullyQualifiedDomainName</a>.
     * </p>
     * <p>
     * Constraints: Amazon Route 53 can't check the health of endpoints for which the IP address is in local, private,
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
     * 
     * @return The IPv4 or IPv6 IP address for the endpoint that you want Amazon Route 53 to perform health checks on.
     *         If you don't specify a value for <code>IPAddress</code>, Amazon Route 53 sends a DNS request to resolve
     *         the domain name that you specify in <code>FullyQualifiedDomainName</code> at the interval that you
     *         specify in <code>RequestInterval</code>. Using an IP address that is returned by DNS, Amazon Route 53
     *         then checks the health of the endpoint.</p>
     *         <p>
     *         If the endpoint is an EC2 instance, we recommend that you create an Elastic IP address, associate it with
     *         your EC2 instance, and specify the Elastic IP address for <code>IPAddress</code>. This ensures that the
     *         IP address of your instance never changes. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic IP
     *         Addresses (EIP)</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     *         </p>
     *         <note>
     *         <p>
     *         If a health check already has a value for <code>IPAddress</code>, you can change the value. However, you
     *         can't update an existing health check to add or remove the value of <code>IPAddress</code>.
     *         </p>
     *         </note>
     *         <p>
     *         For more information, see <a>UpdateHealthCheckRequest$FullyQualifiedDomainName</a>.
     *         </p>
     *         <p>
     *         Constraints: Amazon Route 53 can't check the health of endpoints for which the IP address is in local,
     *         private, non-routable, or multicast ranges. For more information about IP addresses for which you can't
     *         create health checks, see the following documents:
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
     */

    public String getIPAddress() {
        return this.iPAddress;
    }

    /**
     * <p>
     * The IPv4 or IPv6 IP address for the endpoint that you want Amazon Route 53 to perform health checks on. If you
     * don't specify a value for <code>IPAddress</code>, Amazon Route 53 sends a DNS request to resolve the domain name
     * that you specify in <code>FullyQualifiedDomainName</code> at the interval that you specify in
     * <code>RequestInterval</code>. Using an IP address that is returned by DNS, Amazon Route 53 then checks the health
     * of the endpoint.
     * </p>
     * <p>
     * If the endpoint is an EC2 instance, we recommend that you create an Elastic IP address, associate it with your
     * EC2 instance, and specify the Elastic IP address for <code>IPAddress</code>. This ensures that the IP address of
     * your instance never changes. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic IP Addresses
     * (EIP)</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <note>
     * <p>
     * If a health check already has a value for <code>IPAddress</code>, you can change the value. However, you can't
     * update an existing health check to add or remove the value of <code>IPAddress</code>.
     * </p>
     * </note>
     * <p>
     * For more information, see <a>UpdateHealthCheckRequest$FullyQualifiedDomainName</a>.
     * </p>
     * <p>
     * Constraints: Amazon Route 53 can't check the health of endpoints for which the IP address is in local, private,
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
     * 
     * @param iPAddress
     *        The IPv4 or IPv6 IP address for the endpoint that you want Amazon Route 53 to perform health checks on. If
     *        you don't specify a value for <code>IPAddress</code>, Amazon Route 53 sends a DNS request to resolve the
     *        domain name that you specify in <code>FullyQualifiedDomainName</code> at the interval that you specify in
     *        <code>RequestInterval</code>. Using an IP address that is returned by DNS, Amazon Route 53 then checks the
     *        health of the endpoint.</p>
     *        <p>
     *        If the endpoint is an EC2 instance, we recommend that you create an Elastic IP address, associate it with
     *        your EC2 instance, and specify the Elastic IP address for <code>IPAddress</code>. This ensures that the IP
     *        address of your instance never changes. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/elastic-ip-addresses-eip.html">Elastic IP
     *        Addresses (EIP)</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     *        </p>
     *        <note>
     *        <p>
     *        If a health check already has a value for <code>IPAddress</code>, you can change the value. However, you
     *        can't update an existing health check to add or remove the value of <code>IPAddress</code>.
     *        </p>
     *        </note>
     *        <p>
     *        For more information, see <a>UpdateHealthCheckRequest$FullyQualifiedDomainName</a>.
     *        </p>
     *        <p>
     *        Constraints: Amazon Route 53 can't check the health of endpoints for which the IP address is in local,
     *        private, non-routable, or multicast ranges. For more information about IP addresses for which you can't
     *        create health checks, see the following documents:
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
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateHealthCheckRequest withIPAddress(String iPAddress) {
        setIPAddress(iPAddress);
        return this;
    }

    /**
     * <p>
     * The port on the endpoint on which you want Amazon Route 53 to perform health checks.
     * </p>
     * 
     * @param port
     *        The port on the endpoint on which you want Amazon Route 53 to perform health checks.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port on the endpoint on which you want Amazon Route 53 to perform health checks.
     * </p>
     * 
     * @return The port on the endpoint on which you want Amazon Route 53 to perform health checks.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port on the endpoint on which you want Amazon Route 53 to perform health checks.
     * </p>
     * 
     * @param port
     *        The port on the endpoint on which you want Amazon Route 53 to perform health checks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateHealthCheckRequest withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The path that you want Amazon Route 53 to request when performing health checks. The path can be any value for
     * which your endpoint will return an HTTP status code of 2xx or 3xx when the endpoint is healthy, for example the
     * file /docs/route53-health-check.html.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     * 
     * @param resourcePath
     *        The path that you want Amazon Route 53 to request when performing health checks. The path can be any value
     *        for which your endpoint will return an HTTP status code of 2xx or 3xx when the endpoint is healthy, for
     *        example the file /docs/route53-health-check.html. </p>
     *        <p>
     *        Specify this value only if you want to change it.
     */

    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    /**
     * <p>
     * The path that you want Amazon Route 53 to request when performing health checks. The path can be any value for
     * which your endpoint will return an HTTP status code of 2xx or 3xx when the endpoint is healthy, for example the
     * file /docs/route53-health-check.html.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     * 
     * @return The path that you want Amazon Route 53 to request when performing health checks. The path can be any
     *         value for which your endpoint will return an HTTP status code of 2xx or 3xx when the endpoint is healthy,
     *         for example the file /docs/route53-health-check.html. </p>
     *         <p>
     *         Specify this value only if you want to change it.
     */

    public String getResourcePath() {
        return this.resourcePath;
    }

    /**
     * <p>
     * The path that you want Amazon Route 53 to request when performing health checks. The path can be any value for
     * which your endpoint will return an HTTP status code of 2xx or 3xx when the endpoint is healthy, for example the
     * file /docs/route53-health-check.html.
     * </p>
     * <p>
     * Specify this value only if you want to change it.
     * </p>
     * 
     * @param resourcePath
     *        The path that you want Amazon Route 53 to request when performing health checks. The path can be any value
     *        for which your endpoint will return an HTTP status code of 2xx or 3xx when the endpoint is healthy, for
     *        example the file /docs/route53-health-check.html. </p>
     *        <p>
     *        Specify this value only if you want to change it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateHealthCheckRequest withResourcePath(String resourcePath) {
        setResourcePath(resourcePath);
        return this;
    }

    /**
     * <p>
     * Amazon Route 53 behavior depends on whether you specify a value for <code>IPAddress</code>.
     * </p>
     * <note>
     * <p>
     * If a health check already has a value for <code>IPAddress</code>, you can change the value. However, you can't
     * update an existing health check to add or remove the value of <code>IPAddress</code>.
     * </p>
     * </note>
     * <p>
     * <b>If you specify a value for</b> <code>IPAddress</code>:
     * </p>
     * <p>
     * Amazon Route 53 sends health check requests to the specified IPv4 or IPv6 address and passes the value of
     * <code>FullyQualifiedDomainName</code> in the <code>Host</code> header for all health checks except TCP health
     * checks. This is typically the fully qualified DNS name of the endpoint on which you want Amazon Route 53 to
     * perform health checks.
     * </p>
     * <p>
     * When Amazon Route 53 checks the health of an endpoint, here is how it constructs the <code>Host</code> header:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify a value of <code>80</code> for <code>Port</code> and <code>HTTP</code> or
     * <code>HTTP_STR_MATCH</code> for <code>Type</code>, Amazon Route 53 passes the value of
     * <code>FullyQualifiedDomainName</code> to the endpoint in the <code>Host</code> header.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a value of <code>443</code> for <code>Port</code> and <code>HTTPS</code> or
     * <code>HTTPS_STR_MATCH</code> for <code>Type</code>, Amazon Route 53 passes the value of
     * <code>FullyQualifiedDomainName</code> to the endpoint in the Host header.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify another value for <code>Port</code> and any value except <code>TCP</code> for <code>Type</code>,
     * Amazon Route 53 passes <i> <code>FullyQualifiedDomainName</code>:<code>Port</code> </i> to the endpoint in the
     * Host header.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value for <code>FullyQualifiedDomainName</code>, Amazon Route 53 substitutes the value of
     * <code>IPAddress</code> in the <code>Host</code> header in each of the above cases.
     * </p>
     * <p>
     * <b>If you don't specify a value for</b> <code>IPAddress</code>:
     * </p>
     * <p>
     * If you don't specify a value for <code>IPAddress</code>, Amazon Route 53 sends a DNS request to the domain that
     * you specify in <code>FullyQualifiedDomainName</code> at the interval you specify in <code>RequestInterval</code>.
     * Using an IPv4 address that is returned by DNS, Amazon Route 53 then checks the health of the endpoint.
     * </p>
     * <note>
     * <p>
     * If you don't specify a value for <code>IPAddress</code>, Amazon Route 53 uses only IPv4 to send health checks to
     * the endpoint. If there's no resource record set with a type of A for the name that you specify for
     * <code>FullyQualifiedDomainName</code>, the health check fails with a "DNS resolution failed" error.
     * </p>
     * </note>
     * <p>
     * If you want to check the health of weighted, latency, or failover resource record sets and you choose to specify
     * the endpoint only by <code>FullyQualifiedDomainName</code>, we recommend that you create a separate health check
     * for each endpoint. For example, create a health check for each HTTP server that is serving content for
     * www.example.com. For the value of <code>FullyQualifiedDomainName</code>, specify the domain name of the server
     * (such as <code>us-east-1-www.example.com</code>), not the name of the resource record sets (www.example.com).
     * </p>
     * <important>
     * <p>
     * In this configuration, if the value of <code>FullyQualifiedDomainName</code> matches the name of the resource
     * record sets and you then associate the health check with those resource record sets, health check results will be
     * unpredictable.
     * </p>
     * </important>
     * <p>
     * In addition, if the value of <code>Type</code> is <code>HTTP</code>, <code>HTTPS</code>,
     * <code>HTTP_STR_MATCH</code>, or <code>HTTPS_STR_MATCH</code>, Amazon Route 53 passes the value of
     * <code>FullyQualifiedDomainName</code> in the <code>Host</code> header, as it does when you specify a value for
     * <code>IPAddress</code>. If the value of <code>Type</code> is <code>TCP</code>, Amazon Route 53 doesn't pass a
     * <code>Host</code> header.
     * </p>
     * 
     * @param fullyQualifiedDomainName
     *        Amazon Route 53 behavior depends on whether you specify a value for <code>IPAddress</code>.</p> <note>
     *        <p>
     *        If a health check already has a value for <code>IPAddress</code>, you can change the value. However, you
     *        can't update an existing health check to add or remove the value of <code>IPAddress</code>.
     *        </p>
     *        </note>
     *        <p>
     *        <b>If you specify a value for</b> <code>IPAddress</code>:
     *        </p>
     *        <p>
     *        Amazon Route 53 sends health check requests to the specified IPv4 or IPv6 address and passes the value of
     *        <code>FullyQualifiedDomainName</code> in the <code>Host</code> header for all health checks except TCP
     *        health checks. This is typically the fully qualified DNS name of the endpoint on which you want Amazon
     *        Route 53 to perform health checks.
     *        </p>
     *        <p>
     *        When Amazon Route 53 checks the health of an endpoint, here is how it constructs the <code>Host</code>
     *        header:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you specify a value of <code>80</code> for <code>Port</code> and <code>HTTP</code> or
     *        <code>HTTP_STR_MATCH</code> for <code>Type</code>, Amazon Route 53 passes the value of
     *        <code>FullyQualifiedDomainName</code> to the endpoint in the <code>Host</code> header.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify a value of <code>443</code> for <code>Port</code> and <code>HTTPS</code> or
     *        <code>HTTPS_STR_MATCH</code> for <code>Type</code>, Amazon Route 53 passes the value of
     *        <code>FullyQualifiedDomainName</code> to the endpoint in the Host header.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify another value for <code>Port</code> and any value except <code>TCP</code> for
     *        <code>Type</code>, Amazon Route 53 passes <i> <code>FullyQualifiedDomainName</code>:<code>Port</code> </i>
     *        to the endpoint in the Host header.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't specify a value for <code>FullyQualifiedDomainName</code>, Amazon Route 53 substitutes the
     *        value of <code>IPAddress</code> in the <code>Host</code> header in each of the above cases.
     *        </p>
     *        <p>
     *        <b>If you don't specify a value for</b> <code>IPAddress</code>:
     *        </p>
     *        <p>
     *        If you don't specify a value for <code>IPAddress</code>, Amazon Route 53 sends a DNS request to the domain
     *        that you specify in <code>FullyQualifiedDomainName</code> at the interval you specify in
     *        <code>RequestInterval</code>. Using an IPv4 address that is returned by DNS, Amazon Route 53 then checks
     *        the health of the endpoint.
     *        </p>
     *        <note>
     *        <p>
     *        If you don't specify a value for <code>IPAddress</code>, Amazon Route 53 uses only IPv4 to send health
     *        checks to the endpoint. If there's no resource record set with a type of A for the name that you specify
     *        for <code>FullyQualifiedDomainName</code>, the health check fails with a "DNS resolution failed" error.
     *        </p>
     *        </note>
     *        <p>
     *        If you want to check the health of weighted, latency, or failover resource record sets and you choose to
     *        specify the endpoint only by <code>FullyQualifiedDomainName</code>, we recommend that you create a
     *        separate health check for each endpoint. For example, create a health check for each HTTP server that is
     *        serving content for www.example.com. For the value of <code>FullyQualifiedDomainName</code>, specify the
     *        domain name of the server (such as <code>us-east-1-www.example.com</code>), not the name of the resource
     *        record sets (www.example.com).
     *        </p>
     *        <important>
     *        <p>
     *        In this configuration, if the value of <code>FullyQualifiedDomainName</code> matches the name of the
     *        resource record sets and you then associate the health check with those resource record sets, health check
     *        results will be unpredictable.
     *        </p>
     *        </important>
     *        <p>
     *        In addition, if the value of <code>Type</code> is <code>HTTP</code>, <code>HTTPS</code>,
     *        <code>HTTP_STR_MATCH</code>, or <code>HTTPS_STR_MATCH</code>, Amazon Route 53 passes the value of
     *        <code>FullyQualifiedDomainName</code> in the <code>Host</code> header, as it does when you specify a value
     *        for <code>IPAddress</code>. If the value of <code>Type</code> is <code>TCP</code>, Amazon Route 53 doesn't
     *        pass a <code>Host</code> header.
     */

    public void setFullyQualifiedDomainName(String fullyQualifiedDomainName) {
        this.fullyQualifiedDomainName = fullyQualifiedDomainName;
    }

    /**
     * <p>
     * Amazon Route 53 behavior depends on whether you specify a value for <code>IPAddress</code>.
     * </p>
     * <note>
     * <p>
     * If a health check already has a value for <code>IPAddress</code>, you can change the value. However, you can't
     * update an existing health check to add or remove the value of <code>IPAddress</code>.
     * </p>
     * </note>
     * <p>
     * <b>If you specify a value for</b> <code>IPAddress</code>:
     * </p>
     * <p>
     * Amazon Route 53 sends health check requests to the specified IPv4 or IPv6 address and passes the value of
     * <code>FullyQualifiedDomainName</code> in the <code>Host</code> header for all health checks except TCP health
     * checks. This is typically the fully qualified DNS name of the endpoint on which you want Amazon Route 53 to
     * perform health checks.
     * </p>
     * <p>
     * When Amazon Route 53 checks the health of an endpoint, here is how it constructs the <code>Host</code> header:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify a value of <code>80</code> for <code>Port</code> and <code>HTTP</code> or
     * <code>HTTP_STR_MATCH</code> for <code>Type</code>, Amazon Route 53 passes the value of
     * <code>FullyQualifiedDomainName</code> to the endpoint in the <code>Host</code> header.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a value of <code>443</code> for <code>Port</code> and <code>HTTPS</code> or
     * <code>HTTPS_STR_MATCH</code> for <code>Type</code>, Amazon Route 53 passes the value of
     * <code>FullyQualifiedDomainName</code> to the endpoint in the Host header.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify another value for <code>Port</code> and any value except <code>TCP</code> for <code>Type</code>,
     * Amazon Route 53 passes <i> <code>FullyQualifiedDomainName</code>:<code>Port</code> </i> to the endpoint in the
     * Host header.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value for <code>FullyQualifiedDomainName</code>, Amazon Route 53 substitutes the value of
     * <code>IPAddress</code> in the <code>Host</code> header in each of the above cases.
     * </p>
     * <p>
     * <b>If you don't specify a value for</b> <code>IPAddress</code>:
     * </p>
     * <p>
     * If you don't specify a value for <code>IPAddress</code>, Amazon Route 53 sends a DNS request to the domain that
     * you specify in <code>FullyQualifiedDomainName</code> at the interval you specify in <code>RequestInterval</code>.
     * Using an IPv4 address that is returned by DNS, Amazon Route 53 then checks the health of the endpoint.
     * </p>
     * <note>
     * <p>
     * If you don't specify a value for <code>IPAddress</code>, Amazon Route 53 uses only IPv4 to send health checks to
     * the endpoint. If there's no resource record set with a type of A for the name that you specify for
     * <code>FullyQualifiedDomainName</code>, the health check fails with a "DNS resolution failed" error.
     * </p>
     * </note>
     * <p>
     * If you want to check the health of weighted, latency, or failover resource record sets and you choose to specify
     * the endpoint only by <code>FullyQualifiedDomainName</code>, we recommend that you create a separate health check
     * for each endpoint. For example, create a health check for each HTTP server that is serving content for
     * www.example.com. For the value of <code>FullyQualifiedDomainName</code>, specify the domain name of the server
     * (such as <code>us-east-1-www.example.com</code>), not the name of the resource record sets (www.example.com).
     * </p>
     * <important>
     * <p>
     * In this configuration, if the value of <code>FullyQualifiedDomainName</code> matches the name of the resource
     * record sets and you then associate the health check with those resource record sets, health check results will be
     * unpredictable.
     * </p>
     * </important>
     * <p>
     * In addition, if the value of <code>Type</code> is <code>HTTP</code>, <code>HTTPS</code>,
     * <code>HTTP_STR_MATCH</code>, or <code>HTTPS_STR_MATCH</code>, Amazon Route 53 passes the value of
     * <code>FullyQualifiedDomainName</code> in the <code>Host</code> header, as it does when you specify a value for
     * <code>IPAddress</code>. If the value of <code>Type</code> is <code>TCP</code>, Amazon Route 53 doesn't pass a
     * <code>Host</code> header.
     * </p>
     * 
     * @return Amazon Route 53 behavior depends on whether you specify a value for <code>IPAddress</code>.</p> <note>
     *         <p>
     *         If a health check already has a value for <code>IPAddress</code>, you can change the value. However, you
     *         can't update an existing health check to add or remove the value of <code>IPAddress</code>.
     *         </p>
     *         </note>
     *         <p>
     *         <b>If you specify a value for</b> <code>IPAddress</code>:
     *         </p>
     *         <p>
     *         Amazon Route 53 sends health check requests to the specified IPv4 or IPv6 address and passes the value of
     *         <code>FullyQualifiedDomainName</code> in the <code>Host</code> header for all health checks except TCP
     *         health checks. This is typically the fully qualified DNS name of the endpoint on which you want Amazon
     *         Route 53 to perform health checks.
     *         </p>
     *         <p>
     *         When Amazon Route 53 checks the health of an endpoint, here is how it constructs the <code>Host</code>
     *         header:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you specify a value of <code>80</code> for <code>Port</code> and <code>HTTP</code> or
     *         <code>HTTP_STR_MATCH</code> for <code>Type</code>, Amazon Route 53 passes the value of
     *         <code>FullyQualifiedDomainName</code> to the endpoint in the <code>Host</code> header.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you specify a value of <code>443</code> for <code>Port</code> and <code>HTTPS</code> or
     *         <code>HTTPS_STR_MATCH</code> for <code>Type</code>, Amazon Route 53 passes the value of
     *         <code>FullyQualifiedDomainName</code> to the endpoint in the Host header.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you specify another value for <code>Port</code> and any value except <code>TCP</code> for
     *         <code>Type</code>, Amazon Route 53 passes <i> <code>FullyQualifiedDomainName</code>:<code>Port</code>
     *         </i> to the endpoint in the Host header.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you don't specify a value for <code>FullyQualifiedDomainName</code>, Amazon Route 53 substitutes the
     *         value of <code>IPAddress</code> in the <code>Host</code> header in each of the above cases.
     *         </p>
     *         <p>
     *         <b>If you don't specify a value for</b> <code>IPAddress</code>:
     *         </p>
     *         <p>
     *         If you don't specify a value for <code>IPAddress</code>, Amazon Route 53 sends a DNS request to the
     *         domain that you specify in <code>FullyQualifiedDomainName</code> at the interval you specify in
     *         <code>RequestInterval</code>. Using an IPv4 address that is returned by DNS, Amazon Route 53 then checks
     *         the health of the endpoint.
     *         </p>
     *         <note>
     *         <p>
     *         If you don't specify a value for <code>IPAddress</code>, Amazon Route 53 uses only IPv4 to send health
     *         checks to the endpoint. If there's no resource record set with a type of A for the name that you specify
     *         for <code>FullyQualifiedDomainName</code>, the health check fails with a "DNS resolution failed" error.
     *         </p>
     *         </note>
     *         <p>
     *         If you want to check the health of weighted, latency, or failover resource record sets and you choose to
     *         specify the endpoint only by <code>FullyQualifiedDomainName</code>, we recommend that you create a
     *         separate health check for each endpoint. For example, create a health check for each HTTP server that is
     *         serving content for www.example.com. For the value of <code>FullyQualifiedDomainName</code>, specify the
     *         domain name of the server (such as <code>us-east-1-www.example.com</code>), not the name of the resource
     *         record sets (www.example.com).
     *         </p>
     *         <important>
     *         <p>
     *         In this configuration, if the value of <code>FullyQualifiedDomainName</code> matches the name of the
     *         resource record sets and you then associate the health check with those resource record sets, health
     *         check results will be unpredictable.
     *         </p>
     *         </important>
     *         <p>
     *         In addition, if the value of <code>Type</code> is <code>HTTP</code>, <code>HTTPS</code>,
     *         <code>HTTP_STR_MATCH</code>, or <code>HTTPS_STR_MATCH</code>, Amazon Route 53 passes the value of
     *         <code>FullyQualifiedDomainName</code> in the <code>Host</code> header, as it does when you specify a
     *         value for <code>IPAddress</code>. If the value of <code>Type</code> is <code>TCP</code>, Amazon Route 53
     *         doesn't pass a <code>Host</code> header.
     */

    public String getFullyQualifiedDomainName() {
        return this.fullyQualifiedDomainName;
    }

    /**
     * <p>
     * Amazon Route 53 behavior depends on whether you specify a value for <code>IPAddress</code>.
     * </p>
     * <note>
     * <p>
     * If a health check already has a value for <code>IPAddress</code>, you can change the value. However, you can't
     * update an existing health check to add or remove the value of <code>IPAddress</code>.
     * </p>
     * </note>
     * <p>
     * <b>If you specify a value for</b> <code>IPAddress</code>:
     * </p>
     * <p>
     * Amazon Route 53 sends health check requests to the specified IPv4 or IPv6 address and passes the value of
     * <code>FullyQualifiedDomainName</code> in the <code>Host</code> header for all health checks except TCP health
     * checks. This is typically the fully qualified DNS name of the endpoint on which you want Amazon Route 53 to
     * perform health checks.
     * </p>
     * <p>
     * When Amazon Route 53 checks the health of an endpoint, here is how it constructs the <code>Host</code> header:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify a value of <code>80</code> for <code>Port</code> and <code>HTTP</code> or
     * <code>HTTP_STR_MATCH</code> for <code>Type</code>, Amazon Route 53 passes the value of
     * <code>FullyQualifiedDomainName</code> to the endpoint in the <code>Host</code> header.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a value of <code>443</code> for <code>Port</code> and <code>HTTPS</code> or
     * <code>HTTPS_STR_MATCH</code> for <code>Type</code>, Amazon Route 53 passes the value of
     * <code>FullyQualifiedDomainName</code> to the endpoint in the Host header.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify another value for <code>Port</code> and any value except <code>TCP</code> for <code>Type</code>,
     * Amazon Route 53 passes <i> <code>FullyQualifiedDomainName</code>:<code>Port</code> </i> to the endpoint in the
     * Host header.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify a value for <code>FullyQualifiedDomainName</code>, Amazon Route 53 substitutes the value of
     * <code>IPAddress</code> in the <code>Host</code> header in each of the above cases.
     * </p>
     * <p>
     * <b>If you don't specify a value for</b> <code>IPAddress</code>:
     * </p>
     * <p>
     * If you don't specify a value for <code>IPAddress</code>, Amazon Route 53 sends a DNS request to the domain that
     * you specify in <code>FullyQualifiedDomainName</code> at the interval you specify in <code>RequestInterval</code>.
     * Using an IPv4 address that is returned by DNS, Amazon Route 53 then checks the health of the endpoint.
     * </p>
     * <note>
     * <p>
     * If you don't specify a value for <code>IPAddress</code>, Amazon Route 53 uses only IPv4 to send health checks to
     * the endpoint. If there's no resource record set with a type of A for the name that you specify for
     * <code>FullyQualifiedDomainName</code>, the health check fails with a "DNS resolution failed" error.
     * </p>
     * </note>
     * <p>
     * If you want to check the health of weighted, latency, or failover resource record sets and you choose to specify
     * the endpoint only by <code>FullyQualifiedDomainName</code>, we recommend that you create a separate health check
     * for each endpoint. For example, create a health check for each HTTP server that is serving content for
     * www.example.com. For the value of <code>FullyQualifiedDomainName</code>, specify the domain name of the server
     * (such as <code>us-east-1-www.example.com</code>), not the name of the resource record sets (www.example.com).
     * </p>
     * <important>
     * <p>
     * In this configuration, if the value of <code>FullyQualifiedDomainName</code> matches the name of the resource
     * record sets and you then associate the health check with those resource record sets, health check results will be
     * unpredictable.
     * </p>
     * </important>
     * <p>
     * In addition, if the value of <code>Type</code> is <code>HTTP</code>, <code>HTTPS</code>,
     * <code>HTTP_STR_MATCH</code>, or <code>HTTPS_STR_MATCH</code>, Amazon Route 53 passes the value of
     * <code>FullyQualifiedDomainName</code> in the <code>Host</code> header, as it does when you specify a value for
     * <code>IPAddress</code>. If the value of <code>Type</code> is <code>TCP</code>, Amazon Route 53 doesn't pass a
     * <code>Host</code> header.
     * </p>
     * 
     * @param fullyQualifiedDomainName
     *        Amazon Route 53 behavior depends on whether you specify a value for <code>IPAddress</code>.</p> <note>
     *        <p>
     *        If a health check already has a value for <code>IPAddress</code>, you can change the value. However, you
     *        can't update an existing health check to add or remove the value of <code>IPAddress</code>.
     *        </p>
     *        </note>
     *        <p>
     *        <b>If you specify a value for</b> <code>IPAddress</code>:
     *        </p>
     *        <p>
     *        Amazon Route 53 sends health check requests to the specified IPv4 or IPv6 address and passes the value of
     *        <code>FullyQualifiedDomainName</code> in the <code>Host</code> header for all health checks except TCP
     *        health checks. This is typically the fully qualified DNS name of the endpoint on which you want Amazon
     *        Route 53 to perform health checks.
     *        </p>
     *        <p>
     *        When Amazon Route 53 checks the health of an endpoint, here is how it constructs the <code>Host</code>
     *        header:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you specify a value of <code>80</code> for <code>Port</code> and <code>HTTP</code> or
     *        <code>HTTP_STR_MATCH</code> for <code>Type</code>, Amazon Route 53 passes the value of
     *        <code>FullyQualifiedDomainName</code> to the endpoint in the <code>Host</code> header.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify a value of <code>443</code> for <code>Port</code> and <code>HTTPS</code> or
     *        <code>HTTPS_STR_MATCH</code> for <code>Type</code>, Amazon Route 53 passes the value of
     *        <code>FullyQualifiedDomainName</code> to the endpoint in the Host header.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify another value for <code>Port</code> and any value except <code>TCP</code> for
     *        <code>Type</code>, Amazon Route 53 passes <i> <code>FullyQualifiedDomainName</code>:<code>Port</code> </i>
     *        to the endpoint in the Host header.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't specify a value for <code>FullyQualifiedDomainName</code>, Amazon Route 53 substitutes the
     *        value of <code>IPAddress</code> in the <code>Host</code> header in each of the above cases.
     *        </p>
     *        <p>
     *        <b>If you don't specify a value for</b> <code>IPAddress</code>:
     *        </p>
     *        <p>
     *        If you don't specify a value for <code>IPAddress</code>, Amazon Route 53 sends a DNS request to the domain
     *        that you specify in <code>FullyQualifiedDomainName</code> at the interval you specify in
     *        <code>RequestInterval</code>. Using an IPv4 address that is returned by DNS, Amazon Route 53 then checks
     *        the health of the endpoint.
     *        </p>
     *        <note>
     *        <p>
     *        If you don't specify a value for <code>IPAddress</code>, Amazon Route 53 uses only IPv4 to send health
     *        checks to the endpoint. If there's no resource record set with a type of A for the name that you specify
     *        for <code>FullyQualifiedDomainName</code>, the health check fails with a "DNS resolution failed" error.
     *        </p>
     *        </note>
     *        <p>
     *        If you want to check the health of weighted, latency, or failover resource record sets and you choose to
     *        specify the endpoint only by <code>FullyQualifiedDomainName</code>, we recommend that you create a
     *        separate health check for each endpoint. For example, create a health check for each HTTP server that is
     *        serving content for www.example.com. For the value of <code>FullyQualifiedDomainName</code>, specify the
     *        domain name of the server (such as <code>us-east-1-www.example.com</code>), not the name of the resource
     *        record sets (www.example.com).
     *        </p>
     *        <important>
     *        <p>
     *        In this configuration, if the value of <code>FullyQualifiedDomainName</code> matches the name of the
     *        resource record sets and you then associate the health check with those resource record sets, health check
     *        results will be unpredictable.
     *        </p>
     *        </important>
     *        <p>
     *        In addition, if the value of <code>Type</code> is <code>HTTP</code>, <code>HTTPS</code>,
     *        <code>HTTP_STR_MATCH</code>, or <code>HTTPS_STR_MATCH</code>, Amazon Route 53 passes the value of
     *        <code>FullyQualifiedDomainName</code> in the <code>Host</code> header, as it does when you specify a value
     *        for <code>IPAddress</code>. If the value of <code>Type</code> is <code>TCP</code>, Amazon Route 53 doesn't
     *        pass a <code>Host</code> header.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateHealthCheckRequest withFullyQualifiedDomainName(String fullyQualifiedDomainName) {
        setFullyQualifiedDomainName(fullyQualifiedDomainName);
        return this;
    }

    /**
     * <p>
     * If the value of <code>Type</code> is <code>HTTP_STR_MATCH</code> or <code>HTTP_STR_MATCH</code>, the string that
     * you want Amazon Route 53 to search for in the response body from the specified resource. If the string appears in
     * the response body, Amazon Route 53 considers the resource healthy. (You can't change the value of
     * <code>Type</code> when you update a health check.)
     * </p>
     * 
     * @param searchString
     *        If the value of <code>Type</code> is <code>HTTP_STR_MATCH</code> or <code>HTTP_STR_MATCH</code>, the
     *        string that you want Amazon Route 53 to search for in the response body from the specified resource. If
     *        the string appears in the response body, Amazon Route 53 considers the resource healthy. (You can't change
     *        the value of <code>Type</code> when you update a health check.)
     */

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    /**
     * <p>
     * If the value of <code>Type</code> is <code>HTTP_STR_MATCH</code> or <code>HTTP_STR_MATCH</code>, the string that
     * you want Amazon Route 53 to search for in the response body from the specified resource. If the string appears in
     * the response body, Amazon Route 53 considers the resource healthy. (You can't change the value of
     * <code>Type</code> when you update a health check.)
     * </p>
     * 
     * @return If the value of <code>Type</code> is <code>HTTP_STR_MATCH</code> or <code>HTTP_STR_MATCH</code>, the
     *         string that you want Amazon Route 53 to search for in the response body from the specified resource. If
     *         the string appears in the response body, Amazon Route 53 considers the resource healthy. (You can't
     *         change the value of <code>Type</code> when you update a health check.)
     */

    public String getSearchString() {
        return this.searchString;
    }

    /**
     * <p>
     * If the value of <code>Type</code> is <code>HTTP_STR_MATCH</code> or <code>HTTP_STR_MATCH</code>, the string that
     * you want Amazon Route 53 to search for in the response body from the specified resource. If the string appears in
     * the response body, Amazon Route 53 considers the resource healthy. (You can't change the value of
     * <code>Type</code> when you update a health check.)
     * </p>
     * 
     * @param searchString
     *        If the value of <code>Type</code> is <code>HTTP_STR_MATCH</code> or <code>HTTP_STR_MATCH</code>, the
     *        string that you want Amazon Route 53 to search for in the response body from the specified resource. If
     *        the string appears in the response body, Amazon Route 53 considers the resource healthy. (You can't change
     *        the value of <code>Type</code> when you update a health check.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateHealthCheckRequest withSearchString(String searchString) {
        setSearchString(searchString);
        return this;
    }

    /**
     * <p>
     * The number of consecutive health checks that an endpoint must pass or fail for Amazon Route 53 to change the
     * current status of the endpoint from unhealthy to healthy or vice versa. For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html">How
     * Amazon Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * 
     * @param failureThreshold
     *        The number of consecutive health checks that an endpoint must pass or fail for Amazon Route 53 to change
     *        the current status of the endpoint from unhealthy to healthy or vice versa. For more information, see <a
     *        href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html"
     *        >How Amazon Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Amazon Route 53 Developer
     *        Guide</i>.
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
     * 
     * @return The number of consecutive health checks that an endpoint must pass or fail for Amazon Route 53 to change
     *         the current status of the endpoint from unhealthy to healthy or vice versa. For more information, see <a
     *         href=
     *         "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html"
     *         >How Amazon Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Amazon Route 53 Developer
     *         Guide</i>.
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
     * 
     * @param failureThreshold
     *        The number of consecutive health checks that an endpoint must pass or fail for Amazon Route 53 to change
     *        the current status of the endpoint from unhealthy to healthy or vice versa. For more information, see <a
     *        href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-determining-health-of-endpoints.html"
     *        >How Amazon Route 53 Determines Whether an Endpoint Is Healthy</a> in the <i>Amazon Route 53 Developer
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateHealthCheckRequest withFailureThreshold(Integer failureThreshold) {
        setFailureThreshold(failureThreshold);
        return this;
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

    public UpdateHealthCheckRequest withInverted(Boolean inverted) {
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
     * The number of child health checks that are associated with a <code>CALCULATED</code> health that Amazon Route 53
     * must consider healthy for the <code>CALCULATED</code> health check to be considered healthy. To specify the child
     * health checks that you want to associate with a <code>CALCULATED</code> health check, use the
     * <code>ChildHealthChecks</code> and <code>ChildHealthCheck</code> elements.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify a number greater than the number of child health checks, Amazon Route 53 always considers this
     * health check to be unhealthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify <code>0</code>, Amazon Route 53 always considers this health check to be healthy.
     * </p>
     * </li>
     * </ul>
     * 
     * @param healthThreshold
     *        The number of child health checks that are associated with a <code>CALCULATED</code> health that Amazon
     *        Route 53 must consider healthy for the <code>CALCULATED</code> health check to be considered healthy. To
     *        specify the child health checks that you want to associate with a <code>CALCULATED</code> health check,
     *        use the <code>ChildHealthChecks</code> and <code>ChildHealthCheck</code> elements.</p>
     *        <p>
     *        Note the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you specify a number greater than the number of child health checks, Amazon Route 53 always considers
     *        this health check to be unhealthy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify <code>0</code>, Amazon Route 53 always considers this health check to be healthy.
     *        </p>
     *        </li>
     */

    public void setHealthThreshold(Integer healthThreshold) {
        this.healthThreshold = healthThreshold;
    }

    /**
     * <p>
     * The number of child health checks that are associated with a <code>CALCULATED</code> health that Amazon Route 53
     * must consider healthy for the <code>CALCULATED</code> health check to be considered healthy. To specify the child
     * health checks that you want to associate with a <code>CALCULATED</code> health check, use the
     * <code>ChildHealthChecks</code> and <code>ChildHealthCheck</code> elements.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify a number greater than the number of child health checks, Amazon Route 53 always considers this
     * health check to be unhealthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify <code>0</code>, Amazon Route 53 always considers this health check to be healthy.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The number of child health checks that are associated with a <code>CALCULATED</code> health that Amazon
     *         Route 53 must consider healthy for the <code>CALCULATED</code> health check to be considered healthy. To
     *         specify the child health checks that you want to associate with a <code>CALCULATED</code> health check,
     *         use the <code>ChildHealthChecks</code> and <code>ChildHealthCheck</code> elements.</p>
     *         <p>
     *         Note the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you specify a number greater than the number of child health checks, Amazon Route 53 always considers
     *         this health check to be unhealthy.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you specify <code>0</code>, Amazon Route 53 always considers this health check to be healthy.
     *         </p>
     *         </li>
     */

    public Integer getHealthThreshold() {
        return this.healthThreshold;
    }

    /**
     * <p>
     * The number of child health checks that are associated with a <code>CALCULATED</code> health that Amazon Route 53
     * must consider healthy for the <code>CALCULATED</code> health check to be considered healthy. To specify the child
     * health checks that you want to associate with a <code>CALCULATED</code> health check, use the
     * <code>ChildHealthChecks</code> and <code>ChildHealthCheck</code> elements.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you specify a number greater than the number of child health checks, Amazon Route 53 always considers this
     * health check to be unhealthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify <code>0</code>, Amazon Route 53 always considers this health check to be healthy.
     * </p>
     * </li>
     * </ul>
     * 
     * @param healthThreshold
     *        The number of child health checks that are associated with a <code>CALCULATED</code> health that Amazon
     *        Route 53 must consider healthy for the <code>CALCULATED</code> health check to be considered healthy. To
     *        specify the child health checks that you want to associate with a <code>CALCULATED</code> health check,
     *        use the <code>ChildHealthChecks</code> and <code>ChildHealthCheck</code> elements.</p>
     *        <p>
     *        Note the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you specify a number greater than the number of child health checks, Amazon Route 53 always considers
     *        this health check to be unhealthy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify <code>0</code>, Amazon Route 53 always considers this health check to be healthy.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateHealthCheckRequest withHealthThreshold(Integer healthThreshold) {
        setHealthThreshold(healthThreshold);
        return this;
    }

    /**
     * <p>
     * A complex type that contains one <code>ChildHealthCheck</code> element for each health check that you want to
     * associate with a <code>CALCULATED</code> health check.
     * </p>
     * 
     * @return A complex type that contains one <code>ChildHealthCheck</code> element for each health check that you
     *         want to associate with a <code>CALCULATED</code> health check.
     */

    public java.util.List<String> getChildHealthChecks() {
        if (childHealthChecks == null) {
            childHealthChecks = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return childHealthChecks;
    }

    /**
     * <p>
     * A complex type that contains one <code>ChildHealthCheck</code> element for each health check that you want to
     * associate with a <code>CALCULATED</code> health check.
     * </p>
     * 
     * @param childHealthChecks
     *        A complex type that contains one <code>ChildHealthCheck</code> element for each health check that you want
     *        to associate with a <code>CALCULATED</code> health check.
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
     * A complex type that contains one <code>ChildHealthCheck</code> element for each health check that you want to
     * associate with a <code>CALCULATED</code> health check.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChildHealthChecks(java.util.Collection)} or {@link #withChildHealthChecks(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param childHealthChecks
     *        A complex type that contains one <code>ChildHealthCheck</code> element for each health check that you want
     *        to associate with a <code>CALCULATED</code> health check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateHealthCheckRequest withChildHealthChecks(String... childHealthChecks) {
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
     * A complex type that contains one <code>ChildHealthCheck</code> element for each health check that you want to
     * associate with a <code>CALCULATED</code> health check.
     * </p>
     * 
     * @param childHealthChecks
     *        A complex type that contains one <code>ChildHealthCheck</code> element for each health check that you want
     *        to associate with a <code>CALCULATED</code> health check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateHealthCheckRequest withChildHealthChecks(java.util.Collection<String> childHealthChecks) {
        setChildHealthChecks(childHealthChecks);
        return this;
    }

    /**
     * <p>
     * Specify whether you want Amazon Route 53 to send the value of <code>FullyQualifiedDomainName</code> to the
     * endpoint in the <code>client_hello</code> message during <code>TLS</code> negotiation. This allows the endpoint
     * to respond to <code>HTTPS</code> health check requests with the applicable SSL/TLS certificate.
     * </p>
     * <p>
     * Some endpoints require that HTTPS requests include the host name in the <code>client_hello</code> message. If you
     * don't enable SNI, the status of the health check will be SSL alert <code>handshake_failure</code>. A health check
     * can also have that status for other reasons. If SNI is enabled and you're still getting the error, check the
     * SSL/TLS configuration on your endpoint and confirm that your certificate is valid.
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
     *        endpoint in the <code>client_hello</code> message during <code>TLS</code> negotiation. This allows the
     *        endpoint to respond to <code>HTTPS</code> health check requests with the applicable SSL/TLS
     *        certificate.</p>
     *        <p>
     *        Some endpoints require that HTTPS requests include the host name in the <code>client_hello</code> message.
     *        If you don't enable SNI, the status of the health check will be SSL alert <code>handshake_failure</code>.
     *        A health check can also have that status for other reasons. If SNI is enabled and you're still getting the
     *        error, check the SSL/TLS configuration on your endpoint and confirm that your certificate is valid.
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
     * endpoint in the <code>client_hello</code> message during <code>TLS</code> negotiation. This allows the endpoint
     * to respond to <code>HTTPS</code> health check requests with the applicable SSL/TLS certificate.
     * </p>
     * <p>
     * Some endpoints require that HTTPS requests include the host name in the <code>client_hello</code> message. If you
     * don't enable SNI, the status of the health check will be SSL alert <code>handshake_failure</code>. A health check
     * can also have that status for other reasons. If SNI is enabled and you're still getting the error, check the
     * SSL/TLS configuration on your endpoint and confirm that your certificate is valid.
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
     *         the endpoint in the <code>client_hello</code> message during <code>TLS</code> negotiation. This allows
     *         the endpoint to respond to <code>HTTPS</code> health check requests with the applicable SSL/TLS
     *         certificate.</p>
     *         <p>
     *         Some endpoints require that HTTPS requests include the host name in the <code>client_hello</code>
     *         message. If you don't enable SNI, the status of the health check will be SSL alert
     *         <code>handshake_failure</code>. A health check can also have that status for other reasons. If SNI is
     *         enabled and you're still getting the error, check the SSL/TLS configuration on your endpoint and confirm
     *         that your certificate is valid.
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
     * endpoint in the <code>client_hello</code> message during <code>TLS</code> negotiation. This allows the endpoint
     * to respond to <code>HTTPS</code> health check requests with the applicable SSL/TLS certificate.
     * </p>
     * <p>
     * Some endpoints require that HTTPS requests include the host name in the <code>client_hello</code> message. If you
     * don't enable SNI, the status of the health check will be SSL alert <code>handshake_failure</code>. A health check
     * can also have that status for other reasons. If SNI is enabled and you're still getting the error, check the
     * SSL/TLS configuration on your endpoint and confirm that your certificate is valid.
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
     *        endpoint in the <code>client_hello</code> message during <code>TLS</code> negotiation. This allows the
     *        endpoint to respond to <code>HTTPS</code> health check requests with the applicable SSL/TLS
     *        certificate.</p>
     *        <p>
     *        Some endpoints require that HTTPS requests include the host name in the <code>client_hello</code> message.
     *        If you don't enable SNI, the status of the health check will be SSL alert <code>handshake_failure</code>.
     *        A health check can also have that status for other reasons. If SNI is enabled and you're still getting the
     *        error, check the SSL/TLS configuration on your endpoint and confirm that your certificate is valid.
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

    public UpdateHealthCheckRequest withEnableSNI(Boolean enableSNI) {
        setEnableSNI(enableSNI);
        return this;
    }

    /**
     * <p>
     * Specify whether you want Amazon Route 53 to send the value of <code>FullyQualifiedDomainName</code> to the
     * endpoint in the <code>client_hello</code> message during <code>TLS</code> negotiation. This allows the endpoint
     * to respond to <code>HTTPS</code> health check requests with the applicable SSL/TLS certificate.
     * </p>
     * <p>
     * Some endpoints require that HTTPS requests include the host name in the <code>client_hello</code> message. If you
     * don't enable SNI, the status of the health check will be SSL alert <code>handshake_failure</code>. A health check
     * can also have that status for other reasons. If SNI is enabled and you're still getting the error, check the
     * SSL/TLS configuration on your endpoint and confirm that your certificate is valid.
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
     *         the endpoint in the <code>client_hello</code> message during <code>TLS</code> negotiation. This allows
     *         the endpoint to respond to <code>HTTPS</code> health check requests with the applicable SSL/TLS
     *         certificate.</p>
     *         <p>
     *         Some endpoints require that HTTPS requests include the host name in the <code>client_hello</code>
     *         message. If you don't enable SNI, the status of the health check will be SSL alert
     *         <code>handshake_failure</code>. A health check can also have that status for other reasons. If SNI is
     *         enabled and you're still getting the error, check the SSL/TLS configuration on your endpoint and confirm
     *         that your certificate is valid.
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
     * A complex type that contains one Region element for each region from which you want Amazon Route 53 health
     * checkers to check the specified endpoint.
     * </p>
     * 
     * @return A complex type that contains one Region element for each region from which you want Amazon Route 53
     *         health checkers to check the specified endpoint.
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
     * A complex type that contains one Region element for each region from which you want Amazon Route 53 health
     * checkers to check the specified endpoint.
     * </p>
     * 
     * @param regions
     *        A complex type that contains one Region element for each region from which you want Amazon Route 53 health
     *        checkers to check the specified endpoint.
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
     * A complex type that contains one Region element for each region from which you want Amazon Route 53 health
     * checkers to check the specified endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegions(java.util.Collection)} or {@link #withRegions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param regions
     *        A complex type that contains one Region element for each region from which you want Amazon Route 53 health
     *        checkers to check the specified endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthCheckRegion
     */

    public UpdateHealthCheckRequest withRegions(String... regions) {
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
     * A complex type that contains one Region element for each region from which you want Amazon Route 53 health
     * checkers to check the specified endpoint.
     * </p>
     * 
     * @param regions
     *        A complex type that contains one Region element for each region from which you want Amazon Route 53 health
     *        checkers to check the specified endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthCheckRegion
     */

    public UpdateHealthCheckRequest withRegions(java.util.Collection<String> regions) {
        setRegions(regions);
        return this;
    }

    /**
     * <p>
     * A complex type that contains one Region element for each region from which you want Amazon Route 53 health
     * checkers to check the specified endpoint.
     * </p>
     * 
     * @param regions
     *        A complex type that contains one Region element for each region from which you want Amazon Route 53 health
     *        checkers to check the specified endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthCheckRegion
     */

    public UpdateHealthCheckRequest withRegions(HealthCheckRegion... regions) {
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
     * @param alarmIdentifier
     */

    public void setAlarmIdentifier(AlarmIdentifier alarmIdentifier) {
        this.alarmIdentifier = alarmIdentifier;
    }

    /**
     * @return
     */

    public AlarmIdentifier getAlarmIdentifier() {
        return this.alarmIdentifier;
    }

    /**
     * @param alarmIdentifier
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateHealthCheckRequest withAlarmIdentifier(AlarmIdentifier alarmIdentifier) {
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
     * <code>Healthy</code>: Amazon Route 53 considers the health check to be healthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unhealthy</code>: Amazon Route 53 considers the health check to be unhealthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastKnownStatus</code>: Amazon Route 53 uses the status of the health check from the last time CloudWatch
     * had sufficient data to determine the alarm state. For new health checks that have no last known status, the
     * default status for the health check is healthy.
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
     *        <code>Healthy</code>: Amazon Route 53 considers the health check to be healthy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Unhealthy</code>: Amazon Route 53 considers the health check to be unhealthy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LastKnownStatus</code>: Amazon Route 53 uses the status of the health check from the last time
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
     * <code>Healthy</code>: Amazon Route 53 considers the health check to be healthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unhealthy</code>: Amazon Route 53 considers the health check to be unhealthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastKnownStatus</code>: Amazon Route 53 uses the status of the health check from the last time CloudWatch
     * had sufficient data to determine the alarm state. For new health checks that have no last known status, the
     * default status for the health check is healthy.
     * </p>
     * </li>
     * </ul>
     * 
     * @return When CloudWatch has insufficient data about the metric to determine the alarm state, the status that you
     *         want Amazon Route 53 to assign to the health check:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Healthy</code>: Amazon Route 53 considers the health check to be healthy.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Unhealthy</code>: Amazon Route 53 considers the health check to be unhealthy.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LastKnownStatus</code>: Amazon Route 53 uses the status of the health check from the last time
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
     * <code>Healthy</code>: Amazon Route 53 considers the health check to be healthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unhealthy</code>: Amazon Route 53 considers the health check to be unhealthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastKnownStatus</code>: Amazon Route 53 uses the status of the health check from the last time CloudWatch
     * had sufficient data to determine the alarm state. For new health checks that have no last known status, the
     * default status for the health check is healthy.
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
     *        <code>Healthy</code>: Amazon Route 53 considers the health check to be healthy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Unhealthy</code>: Amazon Route 53 considers the health check to be unhealthy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LastKnownStatus</code>: Amazon Route 53 uses the status of the health check from the last time
     *        CloudWatch had sufficient data to determine the alarm state. For new health checks that have no last known
     *        status, the default status for the health check is healthy.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsufficientDataHealthStatus
     */

    public UpdateHealthCheckRequest withInsufficientDataHealthStatus(String insufficientDataHealthStatus) {
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
     * <code>Healthy</code>: Amazon Route 53 considers the health check to be healthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unhealthy</code>: Amazon Route 53 considers the health check to be unhealthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastKnownStatus</code>: Amazon Route 53 uses the status of the health check from the last time CloudWatch
     * had sufficient data to determine the alarm state. For new health checks that have no last known status, the
     * default status for the health check is healthy.
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
     *        <code>Healthy</code>: Amazon Route 53 considers the health check to be healthy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Unhealthy</code>: Amazon Route 53 considers the health check to be unhealthy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LastKnownStatus</code>: Amazon Route 53 uses the status of the health check from the last time
     *        CloudWatch had sufficient data to determine the alarm state. For new health checks that have no last known
     *        status, the default status for the health check is healthy.
     *        </p>
     *        </li>
     * @see InsufficientDataHealthStatus
     */

    public void setInsufficientDataHealthStatus(InsufficientDataHealthStatus insufficientDataHealthStatus) {
        this.insufficientDataHealthStatus = insufficientDataHealthStatus.toString();
    }

    /**
     * <p>
     * When CloudWatch has insufficient data about the metric to determine the alarm state, the status that you want
     * Amazon Route 53 to assign to the health check:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Healthy</code>: Amazon Route 53 considers the health check to be healthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unhealthy</code>: Amazon Route 53 considers the health check to be unhealthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LastKnownStatus</code>: Amazon Route 53 uses the status of the health check from the last time CloudWatch
     * had sufficient data to determine the alarm state. For new health checks that have no last known status, the
     * default status for the health check is healthy.
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
     *        <code>Healthy</code>: Amazon Route 53 considers the health check to be healthy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Unhealthy</code>: Amazon Route 53 considers the health check to be unhealthy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LastKnownStatus</code>: Amazon Route 53 uses the status of the health check from the last time
     *        CloudWatch had sufficient data to determine the alarm state. For new health checks that have no last known
     *        status, the default status for the health check is healthy.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsufficientDataHealthStatus
     */

    public UpdateHealthCheckRequest withInsufficientDataHealthStatus(InsufficientDataHealthStatus insufficientDataHealthStatus) {
        setInsufficientDataHealthStatus(insufficientDataHealthStatus);
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
        if (getHealthCheckId() != null)
            sb.append("HealthCheckId: " + getHealthCheckId() + ",");
        if (getHealthCheckVersion() != null)
            sb.append("HealthCheckVersion: " + getHealthCheckVersion() + ",");
        if (getIPAddress() != null)
            sb.append("IPAddress: " + getIPAddress() + ",");
        if (getPort() != null)
            sb.append("Port: " + getPort() + ",");
        if (getResourcePath() != null)
            sb.append("ResourcePath: " + getResourcePath() + ",");
        if (getFullyQualifiedDomainName() != null)
            sb.append("FullyQualifiedDomainName: " + getFullyQualifiedDomainName() + ",");
        if (getSearchString() != null)
            sb.append("SearchString: " + getSearchString() + ",");
        if (getFailureThreshold() != null)
            sb.append("FailureThreshold: " + getFailureThreshold() + ",");
        if (getInverted() != null)
            sb.append("Inverted: " + getInverted() + ",");
        if (getHealthThreshold() != null)
            sb.append("HealthThreshold: " + getHealthThreshold() + ",");
        if (getChildHealthChecks() != null)
            sb.append("ChildHealthChecks: " + getChildHealthChecks() + ",");
        if (getEnableSNI() != null)
            sb.append("EnableSNI: " + getEnableSNI() + ",");
        if (getRegions() != null)
            sb.append("Regions: " + getRegions() + ",");
        if (getAlarmIdentifier() != null)
            sb.append("AlarmIdentifier: " + getAlarmIdentifier() + ",");
        if (getInsufficientDataHealthStatus() != null)
            sb.append("InsufficientDataHealthStatus: " + getInsufficientDataHealthStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateHealthCheckRequest == false)
            return false;
        UpdateHealthCheckRequest other = (UpdateHealthCheckRequest) obj;
        if (other.getHealthCheckId() == null ^ this.getHealthCheckId() == null)
            return false;
        if (other.getHealthCheckId() != null && other.getHealthCheckId().equals(this.getHealthCheckId()) == false)
            return false;
        if (other.getHealthCheckVersion() == null ^ this.getHealthCheckVersion() == null)
            return false;
        if (other.getHealthCheckVersion() != null && other.getHealthCheckVersion().equals(this.getHealthCheckVersion()) == false)
            return false;
        if (other.getIPAddress() == null ^ this.getIPAddress() == null)
            return false;
        if (other.getIPAddress() != null && other.getIPAddress().equals(this.getIPAddress()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
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
        if (other.getFailureThreshold() == null ^ this.getFailureThreshold() == null)
            return false;
        if (other.getFailureThreshold() != null && other.getFailureThreshold().equals(this.getFailureThreshold()) == false)
            return false;
        if (other.getInverted() == null ^ this.getInverted() == null)
            return false;
        if (other.getInverted() != null && other.getInverted().equals(this.getInverted()) == false)
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

        hashCode = prime * hashCode + ((getHealthCheckId() == null) ? 0 : getHealthCheckId().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckVersion() == null) ? 0 : getHealthCheckVersion().hashCode());
        hashCode = prime * hashCode + ((getIPAddress() == null) ? 0 : getIPAddress().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getResourcePath() == null) ? 0 : getResourcePath().hashCode());
        hashCode = prime * hashCode + ((getFullyQualifiedDomainName() == null) ? 0 : getFullyQualifiedDomainName().hashCode());
        hashCode = prime * hashCode + ((getSearchString() == null) ? 0 : getSearchString().hashCode());
        hashCode = prime * hashCode + ((getFailureThreshold() == null) ? 0 : getFailureThreshold().hashCode());
        hashCode = prime * hashCode + ((getInverted() == null) ? 0 : getInverted().hashCode());
        hashCode = prime * hashCode + ((getHealthThreshold() == null) ? 0 : getHealthThreshold().hashCode());
        hashCode = prime * hashCode + ((getChildHealthChecks() == null) ? 0 : getChildHealthChecks().hashCode());
        hashCode = prime * hashCode + ((getEnableSNI() == null) ? 0 : getEnableSNI().hashCode());
        hashCode = prime * hashCode + ((getRegions() == null) ? 0 : getRegions().hashCode());
        hashCode = prime * hashCode + ((getAlarmIdentifier() == null) ? 0 : getAlarmIdentifier().hashCode());
        hashCode = prime * hashCode + ((getInsufficientDataHealthStatus() == null) ? 0 : getInsufficientDataHealthStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateHealthCheckRequest clone() {
        return (UpdateHealthCheckRequest) super.clone();
    }
}
