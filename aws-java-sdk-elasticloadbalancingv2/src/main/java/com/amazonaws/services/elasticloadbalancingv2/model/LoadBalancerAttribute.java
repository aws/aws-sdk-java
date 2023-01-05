/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about a load balancer attribute.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/LoadBalancerAttribute"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoadBalancerAttribute implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * <p>
     * The following attributes are supported by all load balancers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>deletion_protection.enabled</code> - Indicates whether deletion protection is enabled. The value is
     * <code>true</code> or <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>load_balancing.cross_zone.enabled</code> - Indicates whether cross-zone load balancing is enabled. The
     * possible values are <code>true</code> and <code>false</code>. The default for Network Load Balancers and Gateway
     * Load Balancers is <code>false</code>. The default for Application Load Balancers is <code>true</code>, and cannot
     * be changed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes are supported by both Application Load Balancers and Network Load Balancers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>access_logs.s3.enabled</code> - Indicates whether access logs are enabled. The value is <code>true</code>
     * or <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>access_logs.s3.bucket</code> - The name of the S3 bucket for the access logs. This attribute is required if
     * access logs are enabled. The bucket must exist in the same region as the load balancer and have a bucket policy
     * that grants Elastic Load Balancing permissions to write to the bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>access_logs.s3.prefix</code> - The prefix for the location in the S3 bucket for the access logs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6.deny_all_igw_traffic</code> - Blocks internet gateway (IGW) access to the load balancer. It is set to
     * <code>false</code> for internet-facing load balancers and <code>true</code> for internal load balancers,
     * preventing unintended access to your internal load balancer through an internet gateway.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes are supported by only Application Load Balancers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>idle_timeout.timeout_seconds</code> - The idle timeout value, in seconds. The valid range is 1-4000
     * seconds. The default is 60 seconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>routing.http.desync_mitigation_mode</code> - Determines how the load balancer handles requests that might
     * pose a security risk to your application. The possible values are <code>monitor</code>, <code>defensive</code>,
     * and <code>strictest</code>. The default is <code>defensive</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>routing.http.drop_invalid_header_fields.enabled</code> - Indicates whether HTTP headers with invalid header
     * fields are removed by the load balancer (<code>true</code>) or routed to targets (<code>false</code>). The
     * default is <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>routing.http.preserve_host_header.enabled</code> - Indicates whether the Application Load Balancer should
     * preserve the <code>Host</code> header in the HTTP request and send it to the target without any change. The
     * possible values are <code>true</code> and <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>routing.http.x_amzn_tls_version_and_cipher_suite.enabled</code> - Indicates whether the two headers (
     * <code>x-amzn-tls-version</code> and <code>x-amzn-tls-cipher-suite</code>), which contain information about the
     * negotiated TLS version and cipher suite, are added to the client request before sending it to the target. The
     * <code>x-amzn-tls-version</code> header has information about the TLS protocol version negotiated with the client,
     * and the <code>x-amzn-tls-cipher-suite</code> header has information about the cipher suite negotiated with the
     * client. Both headers are in OpenSSL format. The possible values for the attribute are <code>true</code> and
     * <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>routing.http.xff_client_port.enabled</code> - Indicates whether the <code>X-Forwarded-For</code> header
     * should preserve the source port that the client used to connect to the load balancer. The possible values are
     * <code>true</code> and <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>routing.http.xff_header_processing.mode</code> - Enables you to modify, preserve, or remove the
     * <code>X-Forwarded-For</code> header in the HTTP request before the Application Load Balancer sends the request to
     * the target. The possible values are <code>append</code>, <code>preserve</code>, and <code>remove</code>. The
     * default is <code>append</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the value is <code>append</code>, the Application Load Balancer adds the client IP address (of the last hop)
     * to the <code>X-Forwarded-For</code> header in the HTTP request before it sends it to targets.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value is <code>preserve</code> the Application Load Balancer preserves the <code>X-Forwarded-For</code>
     * header in the HTTP request, and sends it to targets without any change.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value is <code>remove</code>, the Application Load Balancer removes the <code>X-Forwarded-For</code>
     * header in the HTTP request before it sends it to targets.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>routing.http2.enabled</code> - Indicates whether HTTP/2 is enabled. The possible values are
     * <code>true</code> and <code>false</code>. The default is <code>true</code>. Elastic Load Balancing requires that
     * message header names contain only alphanumeric characters and hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>waf.fail_open.enabled</code> - Indicates whether to allow a WAF-enabled load balancer to route requests to
     * targets if it is unable to forward the request to Amazon Web Services WAF. The possible values are
     * <code>true</code> and <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String key;
    /**
     * <p>
     * The value of the attribute.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * <p>
     * The following attributes are supported by all load balancers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>deletion_protection.enabled</code> - Indicates whether deletion protection is enabled. The value is
     * <code>true</code> or <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>load_balancing.cross_zone.enabled</code> - Indicates whether cross-zone load balancing is enabled. The
     * possible values are <code>true</code> and <code>false</code>. The default for Network Load Balancers and Gateway
     * Load Balancers is <code>false</code>. The default for Application Load Balancers is <code>true</code>, and cannot
     * be changed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes are supported by both Application Load Balancers and Network Load Balancers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>access_logs.s3.enabled</code> - Indicates whether access logs are enabled. The value is <code>true</code>
     * or <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>access_logs.s3.bucket</code> - The name of the S3 bucket for the access logs. This attribute is required if
     * access logs are enabled. The bucket must exist in the same region as the load balancer and have a bucket policy
     * that grants Elastic Load Balancing permissions to write to the bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>access_logs.s3.prefix</code> - The prefix for the location in the S3 bucket for the access logs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6.deny_all_igw_traffic</code> - Blocks internet gateway (IGW) access to the load balancer. It is set to
     * <code>false</code> for internet-facing load balancers and <code>true</code> for internal load balancers,
     * preventing unintended access to your internal load balancer through an internet gateway.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes are supported by only Application Load Balancers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>idle_timeout.timeout_seconds</code> - The idle timeout value, in seconds. The valid range is 1-4000
     * seconds. The default is 60 seconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>routing.http.desync_mitigation_mode</code> - Determines how the load balancer handles requests that might
     * pose a security risk to your application. The possible values are <code>monitor</code>, <code>defensive</code>,
     * and <code>strictest</code>. The default is <code>defensive</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>routing.http.drop_invalid_header_fields.enabled</code> - Indicates whether HTTP headers with invalid header
     * fields are removed by the load balancer (<code>true</code>) or routed to targets (<code>false</code>). The
     * default is <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>routing.http.preserve_host_header.enabled</code> - Indicates whether the Application Load Balancer should
     * preserve the <code>Host</code> header in the HTTP request and send it to the target without any change. The
     * possible values are <code>true</code> and <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>routing.http.x_amzn_tls_version_and_cipher_suite.enabled</code> - Indicates whether the two headers (
     * <code>x-amzn-tls-version</code> and <code>x-amzn-tls-cipher-suite</code>), which contain information about the
     * negotiated TLS version and cipher suite, are added to the client request before sending it to the target. The
     * <code>x-amzn-tls-version</code> header has information about the TLS protocol version negotiated with the client,
     * and the <code>x-amzn-tls-cipher-suite</code> header has information about the cipher suite negotiated with the
     * client. Both headers are in OpenSSL format. The possible values for the attribute are <code>true</code> and
     * <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>routing.http.xff_client_port.enabled</code> - Indicates whether the <code>X-Forwarded-For</code> header
     * should preserve the source port that the client used to connect to the load balancer. The possible values are
     * <code>true</code> and <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>routing.http.xff_header_processing.mode</code> - Enables you to modify, preserve, or remove the
     * <code>X-Forwarded-For</code> header in the HTTP request before the Application Load Balancer sends the request to
     * the target. The possible values are <code>append</code>, <code>preserve</code>, and <code>remove</code>. The
     * default is <code>append</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the value is <code>append</code>, the Application Load Balancer adds the client IP address (of the last hop)
     * to the <code>X-Forwarded-For</code> header in the HTTP request before it sends it to targets.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value is <code>preserve</code> the Application Load Balancer preserves the <code>X-Forwarded-For</code>
     * header in the HTTP request, and sends it to targets without any change.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value is <code>remove</code>, the Application Load Balancer removes the <code>X-Forwarded-For</code>
     * header in the HTTP request before it sends it to targets.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>routing.http2.enabled</code> - Indicates whether HTTP/2 is enabled. The possible values are
     * <code>true</code> and <code>false</code>. The default is <code>true</code>. Elastic Load Balancing requires that
     * message header names contain only alphanumeric characters and hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>waf.fail_open.enabled</code> - Indicates whether to allow a WAF-enabled load balancer to route requests to
     * targets if it is unable to forward the request to Amazon Web Services WAF. The possible values are
     * <code>true</code> and <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param key
     *        The name of the attribute.</p>
     *        <p>
     *        The following attributes are supported by all load balancers:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>deletion_protection.enabled</code> - Indicates whether deletion protection is enabled. The value is
     *        <code>true</code> or <code>false</code>. The default is <code>false</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>load_balancing.cross_zone.enabled</code> - Indicates whether cross-zone load balancing is enabled.
     *        The possible values are <code>true</code> and <code>false</code>. The default for Network Load Balancers
     *        and Gateway Load Balancers is <code>false</code>. The default for Application Load Balancers is
     *        <code>true</code>, and cannot be changed.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following attributes are supported by both Application Load Balancers and Network Load Balancers:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>access_logs.s3.enabled</code> - Indicates whether access logs are enabled. The value is
     *        <code>true</code> or <code>false</code>. The default is <code>false</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>access_logs.s3.bucket</code> - The name of the S3 bucket for the access logs. This attribute is
     *        required if access logs are enabled. The bucket must exist in the same region as the load balancer and
     *        have a bucket policy that grants Elastic Load Balancing permissions to write to the bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>access_logs.s3.prefix</code> - The prefix for the location in the S3 bucket for the access logs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ipv6.deny_all_igw_traffic</code> - Blocks internet gateway (IGW) access to the load balancer. It is
     *        set to <code>false</code> for internet-facing load balancers and <code>true</code> for internal load
     *        balancers, preventing unintended access to your internal load balancer through an internet gateway.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following attributes are supported by only Application Load Balancers:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>idle_timeout.timeout_seconds</code> - The idle timeout value, in seconds. The valid range is 1-4000
     *        seconds. The default is 60 seconds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>routing.http.desync_mitigation_mode</code> - Determines how the load balancer handles requests that
     *        might pose a security risk to your application. The possible values are <code>monitor</code>,
     *        <code>defensive</code>, and <code>strictest</code>. The default is <code>defensive</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>routing.http.drop_invalid_header_fields.enabled</code> - Indicates whether HTTP headers with invalid
     *        header fields are removed by the load balancer (<code>true</code>) or routed to targets (
     *        <code>false</code>). The default is <code>false</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>routing.http.preserve_host_header.enabled</code> - Indicates whether the Application Load Balancer
     *        should preserve the <code>Host</code> header in the HTTP request and send it to the target without any
     *        change. The possible values are <code>true</code> and <code>false</code>. The default is
     *        <code>false</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>routing.http.x_amzn_tls_version_and_cipher_suite.enabled</code> - Indicates whether the two headers
     *        (<code>x-amzn-tls-version</code> and <code>x-amzn-tls-cipher-suite</code>), which contain information
     *        about the negotiated TLS version and cipher suite, are added to the client request before sending it to
     *        the target. The <code>x-amzn-tls-version</code> header has information about the TLS protocol version
     *        negotiated with the client, and the <code>x-amzn-tls-cipher-suite</code> header has information about the
     *        cipher suite negotiated with the client. Both headers are in OpenSSL format. The possible values for the
     *        attribute are <code>true</code> and <code>false</code>. The default is <code>false</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>routing.http.xff_client_port.enabled</code> - Indicates whether the <code>X-Forwarded-For</code>
     *        header should preserve the source port that the client used to connect to the load balancer. The possible
     *        values are <code>true</code> and <code>false</code>. The default is <code>false</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>routing.http.xff_header_processing.mode</code> - Enables you to modify, preserve, or remove the
     *        <code>X-Forwarded-For</code> header in the HTTP request before the Application Load Balancer sends the
     *        request to the target. The possible values are <code>append</code>, <code>preserve</code>, and
     *        <code>remove</code>. The default is <code>append</code>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the value is <code>append</code>, the Application Load Balancer adds the client IP address (of the last
     *        hop) to the <code>X-Forwarded-For</code> header in the HTTP request before it sends it to targets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the value is <code>preserve</code> the Application Load Balancer preserves the
     *        <code>X-Forwarded-For</code> header in the HTTP request, and sends it to targets without any change.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the value is <code>remove</code>, the Application Load Balancer removes the
     *        <code>X-Forwarded-For</code> header in the HTTP request before it sends it to targets.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>routing.http2.enabled</code> - Indicates whether HTTP/2 is enabled. The possible values are
     *        <code>true</code> and <code>false</code>. The default is <code>true</code>. Elastic Load Balancing
     *        requires that message header names contain only alphanumeric characters and hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>waf.fail_open.enabled</code> - Indicates whether to allow a WAF-enabled load balancer to route
     *        requests to targets if it is unable to forward the request to Amazon Web Services WAF. The possible values
     *        are <code>true</code> and <code>false</code>. The default is <code>false</code>.
     *        </p>
     *        </li>
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * <p>
     * The following attributes are supported by all load balancers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>deletion_protection.enabled</code> - Indicates whether deletion protection is enabled. The value is
     * <code>true</code> or <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>load_balancing.cross_zone.enabled</code> - Indicates whether cross-zone load balancing is enabled. The
     * possible values are <code>true</code> and <code>false</code>. The default for Network Load Balancers and Gateway
     * Load Balancers is <code>false</code>. The default for Application Load Balancers is <code>true</code>, and cannot
     * be changed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes are supported by both Application Load Balancers and Network Load Balancers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>access_logs.s3.enabled</code> - Indicates whether access logs are enabled. The value is <code>true</code>
     * or <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>access_logs.s3.bucket</code> - The name of the S3 bucket for the access logs. This attribute is required if
     * access logs are enabled. The bucket must exist in the same region as the load balancer and have a bucket policy
     * that grants Elastic Load Balancing permissions to write to the bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>access_logs.s3.prefix</code> - The prefix for the location in the S3 bucket for the access logs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6.deny_all_igw_traffic</code> - Blocks internet gateway (IGW) access to the load balancer. It is set to
     * <code>false</code> for internet-facing load balancers and <code>true</code> for internal load balancers,
     * preventing unintended access to your internal load balancer through an internet gateway.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes are supported by only Application Load Balancers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>idle_timeout.timeout_seconds</code> - The idle timeout value, in seconds. The valid range is 1-4000
     * seconds. The default is 60 seconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>routing.http.desync_mitigation_mode</code> - Determines how the load balancer handles requests that might
     * pose a security risk to your application. The possible values are <code>monitor</code>, <code>defensive</code>,
     * and <code>strictest</code>. The default is <code>defensive</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>routing.http.drop_invalid_header_fields.enabled</code> - Indicates whether HTTP headers with invalid header
     * fields are removed by the load balancer (<code>true</code>) or routed to targets (<code>false</code>). The
     * default is <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>routing.http.preserve_host_header.enabled</code> - Indicates whether the Application Load Balancer should
     * preserve the <code>Host</code> header in the HTTP request and send it to the target without any change. The
     * possible values are <code>true</code> and <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>routing.http.x_amzn_tls_version_and_cipher_suite.enabled</code> - Indicates whether the two headers (
     * <code>x-amzn-tls-version</code> and <code>x-amzn-tls-cipher-suite</code>), which contain information about the
     * negotiated TLS version and cipher suite, are added to the client request before sending it to the target. The
     * <code>x-amzn-tls-version</code> header has information about the TLS protocol version negotiated with the client,
     * and the <code>x-amzn-tls-cipher-suite</code> header has information about the cipher suite negotiated with the
     * client. Both headers are in OpenSSL format. The possible values for the attribute are <code>true</code> and
     * <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>routing.http.xff_client_port.enabled</code> - Indicates whether the <code>X-Forwarded-For</code> header
     * should preserve the source port that the client used to connect to the load balancer. The possible values are
     * <code>true</code> and <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>routing.http.xff_header_processing.mode</code> - Enables you to modify, preserve, or remove the
     * <code>X-Forwarded-For</code> header in the HTTP request before the Application Load Balancer sends the request to
     * the target. The possible values are <code>append</code>, <code>preserve</code>, and <code>remove</code>. The
     * default is <code>append</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the value is <code>append</code>, the Application Load Balancer adds the client IP address (of the last hop)
     * to the <code>X-Forwarded-For</code> header in the HTTP request before it sends it to targets.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value is <code>preserve</code> the Application Load Balancer preserves the <code>X-Forwarded-For</code>
     * header in the HTTP request, and sends it to targets without any change.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value is <code>remove</code>, the Application Load Balancer removes the <code>X-Forwarded-For</code>
     * header in the HTTP request before it sends it to targets.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>routing.http2.enabled</code> - Indicates whether HTTP/2 is enabled. The possible values are
     * <code>true</code> and <code>false</code>. The default is <code>true</code>. Elastic Load Balancing requires that
     * message header names contain only alphanumeric characters and hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>waf.fail_open.enabled</code> - Indicates whether to allow a WAF-enabled load balancer to route requests to
     * targets if it is unable to forward the request to Amazon Web Services WAF. The possible values are
     * <code>true</code> and <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the attribute.</p>
     *         <p>
     *         The following attributes are supported by all load balancers:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>deletion_protection.enabled</code> - Indicates whether deletion protection is enabled. The value is
     *         <code>true</code> or <code>false</code>. The default is <code>false</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>load_balancing.cross_zone.enabled</code> - Indicates whether cross-zone load balancing is enabled.
     *         The possible values are <code>true</code> and <code>false</code>. The default for Network Load Balancers
     *         and Gateway Load Balancers is <code>false</code>. The default for Application Load Balancers is
     *         <code>true</code>, and cannot be changed.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The following attributes are supported by both Application Load Balancers and Network Load Balancers:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>access_logs.s3.enabled</code> - Indicates whether access logs are enabled. The value is
     *         <code>true</code> or <code>false</code>. The default is <code>false</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>access_logs.s3.bucket</code> - The name of the S3 bucket for the access logs. This attribute is
     *         required if access logs are enabled. The bucket must exist in the same region as the load balancer and
     *         have a bucket policy that grants Elastic Load Balancing permissions to write to the bucket.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>access_logs.s3.prefix</code> - The prefix for the location in the S3 bucket for the access logs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ipv6.deny_all_igw_traffic</code> - Blocks internet gateway (IGW) access to the load balancer. It is
     *         set to <code>false</code> for internet-facing load balancers and <code>true</code> for internal load
     *         balancers, preventing unintended access to your internal load balancer through an internet gateway.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The following attributes are supported by only Application Load Balancers:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>idle_timeout.timeout_seconds</code> - The idle timeout value, in seconds. The valid range is 1-4000
     *         seconds. The default is 60 seconds.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>routing.http.desync_mitigation_mode</code> - Determines how the load balancer handles requests that
     *         might pose a security risk to your application. The possible values are <code>monitor</code>,
     *         <code>defensive</code>, and <code>strictest</code>. The default is <code>defensive</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>routing.http.drop_invalid_header_fields.enabled</code> - Indicates whether HTTP headers with
     *         invalid header fields are removed by the load balancer (<code>true</code>) or routed to targets (
     *         <code>false</code>). The default is <code>false</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>routing.http.preserve_host_header.enabled</code> - Indicates whether the Application Load Balancer
     *         should preserve the <code>Host</code> header in the HTTP request and send it to the target without any
     *         change. The possible values are <code>true</code> and <code>false</code>. The default is
     *         <code>false</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>routing.http.x_amzn_tls_version_and_cipher_suite.enabled</code> - Indicates whether the two headers
     *         (<code>x-amzn-tls-version</code> and <code>x-amzn-tls-cipher-suite</code>), which contain information
     *         about the negotiated TLS version and cipher suite, are added to the client request before sending it to
     *         the target. The <code>x-amzn-tls-version</code> header has information about the TLS protocol version
     *         negotiated with the client, and the <code>x-amzn-tls-cipher-suite</code> header has information about the
     *         cipher suite negotiated with the client. Both headers are in OpenSSL format. The possible values for the
     *         attribute are <code>true</code> and <code>false</code>. The default is <code>false</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>routing.http.xff_client_port.enabled</code> - Indicates whether the <code>X-Forwarded-For</code>
     *         header should preserve the source port that the client used to connect to the load balancer. The possible
     *         values are <code>true</code> and <code>false</code>. The default is <code>false</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>routing.http.xff_header_processing.mode</code> - Enables you to modify, preserve, or remove the
     *         <code>X-Forwarded-For</code> header in the HTTP request before the Application Load Balancer sends the
     *         request to the target. The possible values are <code>append</code>, <code>preserve</code>, and
     *         <code>remove</code>. The default is <code>append</code>.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the value is <code>append</code>, the Application Load Balancer adds the client IP address (of the
     *         last hop) to the <code>X-Forwarded-For</code> header in the HTTP request before it sends it to targets.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the value is <code>preserve</code> the Application Load Balancer preserves the
     *         <code>X-Forwarded-For</code> header in the HTTP request, and sends it to targets without any change.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the value is <code>remove</code>, the Application Load Balancer removes the
     *         <code>X-Forwarded-For</code> header in the HTTP request before it sends it to targets.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>routing.http2.enabled</code> - Indicates whether HTTP/2 is enabled. The possible values are
     *         <code>true</code> and <code>false</code>. The default is <code>true</code>. Elastic Load Balancing
     *         requires that message header names contain only alphanumeric characters and hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>waf.fail_open.enabled</code> - Indicates whether to allow a WAF-enabled load balancer to route
     *         requests to targets if it is unable to forward the request to Amazon Web Services WAF. The possible
     *         values are <code>true</code> and <code>false</code>. The default is <code>false</code>.
     *         </p>
     *         </li>
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The name of the attribute.
     * </p>
     * <p>
     * The following attributes are supported by all load balancers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>deletion_protection.enabled</code> - Indicates whether deletion protection is enabled. The value is
     * <code>true</code> or <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>load_balancing.cross_zone.enabled</code> - Indicates whether cross-zone load balancing is enabled. The
     * possible values are <code>true</code> and <code>false</code>. The default for Network Load Balancers and Gateway
     * Load Balancers is <code>false</code>. The default for Application Load Balancers is <code>true</code>, and cannot
     * be changed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes are supported by both Application Load Balancers and Network Load Balancers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>access_logs.s3.enabled</code> - Indicates whether access logs are enabled. The value is <code>true</code>
     * or <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>access_logs.s3.bucket</code> - The name of the S3 bucket for the access logs. This attribute is required if
     * access logs are enabled. The bucket must exist in the same region as the load balancer and have a bucket policy
     * that grants Elastic Load Balancing permissions to write to the bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>access_logs.s3.prefix</code> - The prefix for the location in the S3 bucket for the access logs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6.deny_all_igw_traffic</code> - Blocks internet gateway (IGW) access to the load balancer. It is set to
     * <code>false</code> for internet-facing load balancers and <code>true</code> for internal load balancers,
     * preventing unintended access to your internal load balancer through an internet gateway.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following attributes are supported by only Application Load Balancers:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>idle_timeout.timeout_seconds</code> - The idle timeout value, in seconds. The valid range is 1-4000
     * seconds. The default is 60 seconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>routing.http.desync_mitigation_mode</code> - Determines how the load balancer handles requests that might
     * pose a security risk to your application. The possible values are <code>monitor</code>, <code>defensive</code>,
     * and <code>strictest</code>. The default is <code>defensive</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>routing.http.drop_invalid_header_fields.enabled</code> - Indicates whether HTTP headers with invalid header
     * fields are removed by the load balancer (<code>true</code>) or routed to targets (<code>false</code>). The
     * default is <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>routing.http.preserve_host_header.enabled</code> - Indicates whether the Application Load Balancer should
     * preserve the <code>Host</code> header in the HTTP request and send it to the target without any change. The
     * possible values are <code>true</code> and <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>routing.http.x_amzn_tls_version_and_cipher_suite.enabled</code> - Indicates whether the two headers (
     * <code>x-amzn-tls-version</code> and <code>x-amzn-tls-cipher-suite</code>), which contain information about the
     * negotiated TLS version and cipher suite, are added to the client request before sending it to the target. The
     * <code>x-amzn-tls-version</code> header has information about the TLS protocol version negotiated with the client,
     * and the <code>x-amzn-tls-cipher-suite</code> header has information about the cipher suite negotiated with the
     * client. Both headers are in OpenSSL format. The possible values for the attribute are <code>true</code> and
     * <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>routing.http.xff_client_port.enabled</code> - Indicates whether the <code>X-Forwarded-For</code> header
     * should preserve the source port that the client used to connect to the load balancer. The possible values are
     * <code>true</code> and <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>routing.http.xff_header_processing.mode</code> - Enables you to modify, preserve, or remove the
     * <code>X-Forwarded-For</code> header in the HTTP request before the Application Load Balancer sends the request to
     * the target. The possible values are <code>append</code>, <code>preserve</code>, and <code>remove</code>. The
     * default is <code>append</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the value is <code>append</code>, the Application Load Balancer adds the client IP address (of the last hop)
     * to the <code>X-Forwarded-For</code> header in the HTTP request before it sends it to targets.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value is <code>preserve</code> the Application Load Balancer preserves the <code>X-Forwarded-For</code>
     * header in the HTTP request, and sends it to targets without any change.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value is <code>remove</code>, the Application Load Balancer removes the <code>X-Forwarded-For</code>
     * header in the HTTP request before it sends it to targets.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>routing.http2.enabled</code> - Indicates whether HTTP/2 is enabled. The possible values are
     * <code>true</code> and <code>false</code>. The default is <code>true</code>. Elastic Load Balancing requires that
     * message header names contain only alphanumeric characters and hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>waf.fail_open.enabled</code> - Indicates whether to allow a WAF-enabled load balancer to route requests to
     * targets if it is unable to forward the request to Amazon Web Services WAF. The possible values are
     * <code>true</code> and <code>false</code>. The default is <code>false</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param key
     *        The name of the attribute.</p>
     *        <p>
     *        The following attributes are supported by all load balancers:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>deletion_protection.enabled</code> - Indicates whether deletion protection is enabled. The value is
     *        <code>true</code> or <code>false</code>. The default is <code>false</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>load_balancing.cross_zone.enabled</code> - Indicates whether cross-zone load balancing is enabled.
     *        The possible values are <code>true</code> and <code>false</code>. The default for Network Load Balancers
     *        and Gateway Load Balancers is <code>false</code>. The default for Application Load Balancers is
     *        <code>true</code>, and cannot be changed.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following attributes are supported by both Application Load Balancers and Network Load Balancers:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>access_logs.s3.enabled</code> - Indicates whether access logs are enabled. The value is
     *        <code>true</code> or <code>false</code>. The default is <code>false</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>access_logs.s3.bucket</code> - The name of the S3 bucket for the access logs. This attribute is
     *        required if access logs are enabled. The bucket must exist in the same region as the load balancer and
     *        have a bucket policy that grants Elastic Load Balancing permissions to write to the bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>access_logs.s3.prefix</code> - The prefix for the location in the S3 bucket for the access logs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ipv6.deny_all_igw_traffic</code> - Blocks internet gateway (IGW) access to the load balancer. It is
     *        set to <code>false</code> for internet-facing load balancers and <code>true</code> for internal load
     *        balancers, preventing unintended access to your internal load balancer through an internet gateway.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following attributes are supported by only Application Load Balancers:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>idle_timeout.timeout_seconds</code> - The idle timeout value, in seconds. The valid range is 1-4000
     *        seconds. The default is 60 seconds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>routing.http.desync_mitigation_mode</code> - Determines how the load balancer handles requests that
     *        might pose a security risk to your application. The possible values are <code>monitor</code>,
     *        <code>defensive</code>, and <code>strictest</code>. The default is <code>defensive</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>routing.http.drop_invalid_header_fields.enabled</code> - Indicates whether HTTP headers with invalid
     *        header fields are removed by the load balancer (<code>true</code>) or routed to targets (
     *        <code>false</code>). The default is <code>false</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>routing.http.preserve_host_header.enabled</code> - Indicates whether the Application Load Balancer
     *        should preserve the <code>Host</code> header in the HTTP request and send it to the target without any
     *        change. The possible values are <code>true</code> and <code>false</code>. The default is
     *        <code>false</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>routing.http.x_amzn_tls_version_and_cipher_suite.enabled</code> - Indicates whether the two headers
     *        (<code>x-amzn-tls-version</code> and <code>x-amzn-tls-cipher-suite</code>), which contain information
     *        about the negotiated TLS version and cipher suite, are added to the client request before sending it to
     *        the target. The <code>x-amzn-tls-version</code> header has information about the TLS protocol version
     *        negotiated with the client, and the <code>x-amzn-tls-cipher-suite</code> header has information about the
     *        cipher suite negotiated with the client. Both headers are in OpenSSL format. The possible values for the
     *        attribute are <code>true</code> and <code>false</code>. The default is <code>false</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>routing.http.xff_client_port.enabled</code> - Indicates whether the <code>X-Forwarded-For</code>
     *        header should preserve the source port that the client used to connect to the load balancer. The possible
     *        values are <code>true</code> and <code>false</code>. The default is <code>false</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>routing.http.xff_header_processing.mode</code> - Enables you to modify, preserve, or remove the
     *        <code>X-Forwarded-For</code> header in the HTTP request before the Application Load Balancer sends the
     *        request to the target. The possible values are <code>append</code>, <code>preserve</code>, and
     *        <code>remove</code>. The default is <code>append</code>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the value is <code>append</code>, the Application Load Balancer adds the client IP address (of the last
     *        hop) to the <code>X-Forwarded-For</code> header in the HTTP request before it sends it to targets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the value is <code>preserve</code> the Application Load Balancer preserves the
     *        <code>X-Forwarded-For</code> header in the HTTP request, and sends it to targets without any change.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the value is <code>remove</code>, the Application Load Balancer removes the
     *        <code>X-Forwarded-For</code> header in the HTTP request before it sends it to targets.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>routing.http2.enabled</code> - Indicates whether HTTP/2 is enabled. The possible values are
     *        <code>true</code> and <code>false</code>. The default is <code>true</code>. Elastic Load Balancing
     *        requires that message header names contain only alphanumeric characters and hyphens.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>waf.fail_open.enabled</code> - Indicates whether to allow a WAF-enabled load balancer to route
     *        requests to targets if it is unable to forward the request to Amazon Web Services WAF. The possible values
     *        are <code>true</code> and <code>false</code>. The default is <code>false</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerAttribute withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The value of the attribute.
     * </p>
     * 
     * @param value
     *        The value of the attribute.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the attribute.
     * </p>
     * 
     * @return The value of the attribute.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the attribute.
     * </p>
     * 
     * @param value
     *        The value of the attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerAttribute withValue(String value) {
        setValue(value);
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoadBalancerAttribute == false)
            return false;
        LoadBalancerAttribute other = (LoadBalancerAttribute) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public LoadBalancerAttribute clone() {
        try {
            return (LoadBalancerAttribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
