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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/RegisterInstance" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the service that you want to use for settings for the instance.
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
     * If the service that is specified by <code>ServiceId</code> includes settings for an SRV record, the value of
     * <code>InstanceId</code> is automatically included as part of the value for the SRV record. For more information,
     * see <a>DnsRecord$Type</a>.
     * </p>
     * </li>
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
     * <li>
     * <p>
     * If you specify an existing <code>InstanceId</code> and <code>ServiceId</code>, AWS Cloud Map updates the existing
     * DNS records, if any. If there's also an existing health check, AWS Cloud Map deletes the old health check and
     * creates a new one.
     * </p>
     * <note>
     * <p>
     * The health check isn't deleted immediately, so it will still appear for a while if you submit a
     * <code>ListHealthChecks</code> request, for example.
     * </p>
     * </note></li>
     * </ul>
     */
    private String instanceId;
    /**
     * <p>
     * A unique string that identifies the request and that allows failed <code>RegisterInstance</code> requests to be
     * retried without the risk of executing the operation twice. You must use a unique <code>CreatorRequestId</code>
     * string every time you submit a <code>RegisterInstance</code> request if you're registering additional instances
     * for the same namespace and service. <code>CreatorRequestId</code> can be any unique string, for example, a
     * date/time stamp.
     * </p>
     */
    private String creatorRequestId;
    /**
     * <p>
     * A string map that contains the following information for the service that you specify in <code>ServiceId</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The attributes that apply to the records that are defined in the service.
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
     * <p>
     * <b>AWS_ALIAS_DNS_NAME</b>
     * </p>
     * <p>
     * <b/>
     * </p>
     * <p>
     * If you want AWS Cloud Map to create an Amazon Route 53 alias record that routes traffic to an Elastic Load
     * Balancing load balancer, specify the DNS name that is associated with the load balancer. For information about
     * how to get the DNS name, see "DNSName" in the topic <a
     * href="http://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html">AliasTarget</a> in the
     * <i>Route 53 API Reference</i>.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The configuration for the service that is specified by <code>ServiceId</code> must include settings for an A
     * record, an AAAA record, or both.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the service that is specified by <code>ServiceId</code>, the value of <code>RoutingPolicy</code> must be
     * <code>WEIGHTED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the service that is specified by <code>ServiceId</code> includes <code>HealthCheckConfig</code> settings, AWS
     * Cloud Map will create the Route 53 health check, but it won't associate the health check with the alias record.
     * </p>
     * </li>
     * <li>
     * <p>
     * Auto naming currently doesn't support creating alias records that route traffic to AWS resources other than ELB
     * load balancers.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a value for <code>AWS_ALIAS_DNS_NAME</code>, don't specify values for any of the
     * <code>AWS_INSTANCE</code> attributes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>AWS_INIT_HEALTH_STATUS</b>
     * </p>
     * <p>
     * If the service configuration includes <code>HealthCheckCustomConfig</code>, you can optionally use
     * <code>AWS_INIT_HEALTH_STATUS</code> to specify the initial status of the custom health check,
     * <code>HEALTHY</code> or <code>UNHEALTHY</code>. If you don't specify a value for
     * <code>AWS_INIT_HEALTH_STATUS</code>, the initial status is <code>HEALTHY</code>.
     * </p>
     * <p>
     * <b>AWS_INSTANCE_CNAME</b>
     * </p>
     * <p>
     * If the service configuration includes a CNAME record, the domain name that you want Route 53 to return in
     * response to DNS queries, for example, <code>example.com</code>.
     * </p>
     * <p>
     * This value is required if the service specified by <code>ServiceId</code> includes settings for an CNAME record.
     * </p>
     * <p>
     * <b>AWS_INSTANCE_IPV4</b>
     * </p>
     * <p>
     * If the service configuration includes an A record, the IPv4 address that you want Route 53 to return in response
     * to DNS queries, for example, <code>192.0.2.44</code>.
     * </p>
     * <p>
     * This value is required if the service specified by <code>ServiceId</code> includes settings for an A record. If
     * the service includes settings for an SRV record, you must specify a value for <code>AWS_INSTANCE_IPV4</code>,
     * <code>AWS_INSTANCE_IPV6</code>, or both.
     * </p>
     * <p>
     * <b>AWS_INSTANCE_IPV6</b>
     * </p>
     * <p>
     * If the service configuration includes an AAAA record, the IPv6 address that you want Route 53 to return in
     * response to DNS queries, for example, <code>2001:0db8:85a3:0000:0000:abcd:0001:2345</code>.
     * </p>
     * <p>
     * This value is required if the service specified by <code>ServiceId</code> includes settings for an AAAA record.
     * If the service includes settings for an SRV record, you must specify a value for <code>AWS_INSTANCE_IPV4</code>,
     * <code>AWS_INSTANCE_IPV6</code>, or both.
     * </p>
     * <p>
     * <b>AWS_INSTANCE_PORT</b>
     * </p>
     * <p>
     * If the service includes an SRV record, the value that you want Route 53 to return for the port.
     * </p>
     * <p>
     * If the service includes <code>HealthCheckConfig</code>, the port on the endpoint that you want Route 53 to send
     * requests to.
     * </p>
     * <p>
     * This value is required if you specified settings for an SRV record when you created the service.
     * </p>
     * <p>
     * <b>Custom attributes</b>
     * </p>
     * <p>
     * You can add up to 30 custom attributes. For each key-value pair, the maximum length of the attribute name is 255
     * characters, and the maximum length of the attribute value is 1,024 characters.
     * </p>
     */
    private java.util.Map<String, String> attributes;

    /**
     * <p>
     * The ID of the service that you want to use for settings for the instance.
     * </p>
     * 
     * @param serviceId
     *        The ID of the service that you want to use for settings for the instance.
     */

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * <p>
     * The ID of the service that you want to use for settings for the instance.
     * </p>
     * 
     * @return The ID of the service that you want to use for settings for the instance.
     */

    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * <p>
     * The ID of the service that you want to use for settings for the instance.
     * </p>
     * 
     * @param serviceId
     *        The ID of the service that you want to use for settings for the instance.
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
     * If the service that is specified by <code>ServiceId</code> includes settings for an SRV record, the value of
     * <code>InstanceId</code> is automatically included as part of the value for the SRV record. For more information,
     * see <a>DnsRecord$Type</a>.
     * </p>
     * </li>
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
     * <li>
     * <p>
     * If you specify an existing <code>InstanceId</code> and <code>ServiceId</code>, AWS Cloud Map updates the existing
     * DNS records, if any. If there's also an existing health check, AWS Cloud Map deletes the old health check and
     * creates a new one.
     * </p>
     * <note>
     * <p>
     * The health check isn't deleted immediately, so it will still appear for a while if you submit a
     * <code>ListHealthChecks</code> request, for example.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @param instanceId
     *        An identifier that you want to associate with the instance. Note the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the service that is specified by <code>ServiceId</code> includes settings for an SRV record, the value
     *        of <code>InstanceId</code> is automatically included as part of the value for the SRV record. For more
     *        information, see <a>DnsRecord$Type</a>.
     *        </p>
     *        </li>
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
     *        <li>
     *        <p>
     *        If you specify an existing <code>InstanceId</code> and <code>ServiceId</code>, AWS Cloud Map updates the
     *        existing DNS records, if any. If there's also an existing health check, AWS Cloud Map deletes the old
     *        health check and creates a new one.
     *        </p>
     *        <note>
     *        <p>
     *        The health check isn't deleted immediately, so it will still appear for a while if you submit a
     *        <code>ListHealthChecks</code> request, for example.
     *        </p>
     *        </note></li>
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
     * If the service that is specified by <code>ServiceId</code> includes settings for an SRV record, the value of
     * <code>InstanceId</code> is automatically included as part of the value for the SRV record. For more information,
     * see <a>DnsRecord$Type</a>.
     * </p>
     * </li>
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
     * <li>
     * <p>
     * If you specify an existing <code>InstanceId</code> and <code>ServiceId</code>, AWS Cloud Map updates the existing
     * DNS records, if any. If there's also an existing health check, AWS Cloud Map deletes the old health check and
     * creates a new one.
     * </p>
     * <note>
     * <p>
     * The health check isn't deleted immediately, so it will still appear for a while if you submit a
     * <code>ListHealthChecks</code> request, for example.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @return An identifier that you want to associate with the instance. Note the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the service that is specified by <code>ServiceId</code> includes settings for an SRV record, the value
     *         of <code>InstanceId</code> is automatically included as part of the value for the SRV record. For more
     *         information, see <a>DnsRecord$Type</a>.
     *         </p>
     *         </li>
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
     *         <li>
     *         <p>
     *         If you specify an existing <code>InstanceId</code> and <code>ServiceId</code>, AWS Cloud Map updates the
     *         existing DNS records, if any. If there's also an existing health check, AWS Cloud Map deletes the old
     *         health check and creates a new one.
     *         </p>
     *         <note>
     *         <p>
     *         The health check isn't deleted immediately, so it will still appear for a while if you submit a
     *         <code>ListHealthChecks</code> request, for example.
     *         </p>
     *         </note></li>
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
     * If the service that is specified by <code>ServiceId</code> includes settings for an SRV record, the value of
     * <code>InstanceId</code> is automatically included as part of the value for the SRV record. For more information,
     * see <a>DnsRecord$Type</a>.
     * </p>
     * </li>
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
     * <li>
     * <p>
     * If you specify an existing <code>InstanceId</code> and <code>ServiceId</code>, AWS Cloud Map updates the existing
     * DNS records, if any. If there's also an existing health check, AWS Cloud Map deletes the old health check and
     * creates a new one.
     * </p>
     * <note>
     * <p>
     * The health check isn't deleted immediately, so it will still appear for a while if you submit a
     * <code>ListHealthChecks</code> request, for example.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @param instanceId
     *        An identifier that you want to associate with the instance. Note the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        If the service that is specified by <code>ServiceId</code> includes settings for an SRV record, the value
     *        of <code>InstanceId</code> is automatically included as part of the value for the SRV record. For more
     *        information, see <a>DnsRecord$Type</a>.
     *        </p>
     *        </li>
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
     *        <li>
     *        <p>
     *        If you specify an existing <code>InstanceId</code> and <code>ServiceId</code>, AWS Cloud Map updates the
     *        existing DNS records, if any. If there's also an existing health check, AWS Cloud Map deletes the old
     *        health check and creates a new one.
     *        </p>
     *        <note>
     *        <p>
     *        The health check isn't deleted immediately, so it will still appear for a while if you submit a
     *        <code>ListHealthChecks</code> request, for example.
     *        </p>
     *        </note></li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterInstanceRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed <code>RegisterInstance</code> requests to be
     * retried without the risk of executing the operation twice. You must use a unique <code>CreatorRequestId</code>
     * string every time you submit a <code>RegisterInstance</code> request if you're registering additional instances
     * for the same namespace and service. <code>CreatorRequestId</code> can be any unique string, for example, a
     * date/time stamp.
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string that identifies the request and that allows failed <code>RegisterInstance</code> requests
     *        to be retried without the risk of executing the operation twice. You must use a unique
     *        <code>CreatorRequestId</code> string every time you submit a <code>RegisterInstance</code> request if
     *        you're registering additional instances for the same namespace and service. <code>CreatorRequestId</code>
     *        can be any unique string, for example, a date/time stamp.
     */

    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed <code>RegisterInstance</code> requests to be
     * retried without the risk of executing the operation twice. You must use a unique <code>CreatorRequestId</code>
     * string every time you submit a <code>RegisterInstance</code> request if you're registering additional instances
     * for the same namespace and service. <code>CreatorRequestId</code> can be any unique string, for example, a
     * date/time stamp.
     * </p>
     * 
     * @return A unique string that identifies the request and that allows failed <code>RegisterInstance</code> requests
     *         to be retried without the risk of executing the operation twice. You must use a unique
     *         <code>CreatorRequestId</code> string every time you submit a <code>RegisterInstance</code> request if
     *         you're registering additional instances for the same namespace and service. <code>CreatorRequestId</code>
     *         can be any unique string, for example, a date/time stamp.
     */

    public String getCreatorRequestId() {
        return this.creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and that allows failed <code>RegisterInstance</code> requests to be
     * retried without the risk of executing the operation twice. You must use a unique <code>CreatorRequestId</code>
     * string every time you submit a <code>RegisterInstance</code> request if you're registering additional instances
     * for the same namespace and service. <code>CreatorRequestId</code> can be any unique string, for example, a
     * date/time stamp.
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string that identifies the request and that allows failed <code>RegisterInstance</code> requests
     *        to be retried without the risk of executing the operation twice. You must use a unique
     *        <code>CreatorRequestId</code> string every time you submit a <code>RegisterInstance</code> request if
     *        you're registering additional instances for the same namespace and service. <code>CreatorRequestId</code>
     *        can be any unique string, for example, a date/time stamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterInstanceRequest withCreatorRequestId(String creatorRequestId) {
        setCreatorRequestId(creatorRequestId);
        return this;
    }

    /**
     * <p>
     * A string map that contains the following information for the service that you specify in <code>ServiceId</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The attributes that apply to the records that are defined in the service.
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
     * <p>
     * <b>AWS_ALIAS_DNS_NAME</b>
     * </p>
     * <p>
     * <b/>
     * </p>
     * <p>
     * If you want AWS Cloud Map to create an Amazon Route 53 alias record that routes traffic to an Elastic Load
     * Balancing load balancer, specify the DNS name that is associated with the load balancer. For information about
     * how to get the DNS name, see "DNSName" in the topic <a
     * href="http://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html">AliasTarget</a> in the
     * <i>Route 53 API Reference</i>.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The configuration for the service that is specified by <code>ServiceId</code> must include settings for an A
     * record, an AAAA record, or both.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the service that is specified by <code>ServiceId</code>, the value of <code>RoutingPolicy</code> must be
     * <code>WEIGHTED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the service that is specified by <code>ServiceId</code> includes <code>HealthCheckConfig</code> settings, AWS
     * Cloud Map will create the Route 53 health check, but it won't associate the health check with the alias record.
     * </p>
     * </li>
     * <li>
     * <p>
     * Auto naming currently doesn't support creating alias records that route traffic to AWS resources other than ELB
     * load balancers.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a value for <code>AWS_ALIAS_DNS_NAME</code>, don't specify values for any of the
     * <code>AWS_INSTANCE</code> attributes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>AWS_INIT_HEALTH_STATUS</b>
     * </p>
     * <p>
     * If the service configuration includes <code>HealthCheckCustomConfig</code>, you can optionally use
     * <code>AWS_INIT_HEALTH_STATUS</code> to specify the initial status of the custom health check,
     * <code>HEALTHY</code> or <code>UNHEALTHY</code>. If you don't specify a value for
     * <code>AWS_INIT_HEALTH_STATUS</code>, the initial status is <code>HEALTHY</code>.
     * </p>
     * <p>
     * <b>AWS_INSTANCE_CNAME</b>
     * </p>
     * <p>
     * If the service configuration includes a CNAME record, the domain name that you want Route 53 to return in
     * response to DNS queries, for example, <code>example.com</code>.
     * </p>
     * <p>
     * This value is required if the service specified by <code>ServiceId</code> includes settings for an CNAME record.
     * </p>
     * <p>
     * <b>AWS_INSTANCE_IPV4</b>
     * </p>
     * <p>
     * If the service configuration includes an A record, the IPv4 address that you want Route 53 to return in response
     * to DNS queries, for example, <code>192.0.2.44</code>.
     * </p>
     * <p>
     * This value is required if the service specified by <code>ServiceId</code> includes settings for an A record. If
     * the service includes settings for an SRV record, you must specify a value for <code>AWS_INSTANCE_IPV4</code>,
     * <code>AWS_INSTANCE_IPV6</code>, or both.
     * </p>
     * <p>
     * <b>AWS_INSTANCE_IPV6</b>
     * </p>
     * <p>
     * If the service configuration includes an AAAA record, the IPv6 address that you want Route 53 to return in
     * response to DNS queries, for example, <code>2001:0db8:85a3:0000:0000:abcd:0001:2345</code>.
     * </p>
     * <p>
     * This value is required if the service specified by <code>ServiceId</code> includes settings for an AAAA record.
     * If the service includes settings for an SRV record, you must specify a value for <code>AWS_INSTANCE_IPV4</code>,
     * <code>AWS_INSTANCE_IPV6</code>, or both.
     * </p>
     * <p>
     * <b>AWS_INSTANCE_PORT</b>
     * </p>
     * <p>
     * If the service includes an SRV record, the value that you want Route 53 to return for the port.
     * </p>
     * <p>
     * If the service includes <code>HealthCheckConfig</code>, the port on the endpoint that you want Route 53 to send
     * requests to.
     * </p>
     * <p>
     * This value is required if you specified settings for an SRV record when you created the service.
     * </p>
     * <p>
     * <b>Custom attributes</b>
     * </p>
     * <p>
     * You can add up to 30 custom attributes. For each key-value pair, the maximum length of the attribute name is 255
     * characters, and the maximum length of the attribute value is 1,024 characters.
     * </p>
     * 
     * @return A string map that contains the following information for the service that you specify in
     *         <code>ServiceId</code>:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The attributes that apply to the records that are defined in the service.
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
     *         <p>
     *         <b>AWS_ALIAS_DNS_NAME</b>
     *         </p>
     *         <p>
     *         <b/>
     *         </p>
     *         <p>
     *         If you want AWS Cloud Map to create an Amazon Route 53 alias record that routes traffic to an Elastic
     *         Load Balancing load balancer, specify the DNS name that is associated with the load balancer. For
     *         information about how to get the DNS name, see "DNSName" in the topic <a
     *         href="http://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html">AliasTarget</a> in the
     *         <i>Route 53 API Reference</i>.
     *         </p>
     *         <p>
     *         Note the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The configuration for the service that is specified by <code>ServiceId</code> must include settings for
     *         an A record, an AAAA record, or both.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         In the service that is specified by <code>ServiceId</code>, the value of <code>RoutingPolicy</code> must
     *         be <code>WEIGHTED</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the service that is specified by <code>ServiceId</code> includes <code>HealthCheckConfig</code>
     *         settings, AWS Cloud Map will create the Route 53 health check, but it won't associate the health check
     *         with the alias record.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Auto naming currently doesn't support creating alias records that route traffic to AWS resources other
     *         than ELB load balancers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you specify a value for <code>AWS_ALIAS_DNS_NAME</code>, don't specify values for any of the
     *         <code>AWS_INSTANCE</code> attributes.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>AWS_INIT_HEALTH_STATUS</b>
     *         </p>
     *         <p>
     *         If the service configuration includes <code>HealthCheckCustomConfig</code>, you can optionally use
     *         <code>AWS_INIT_HEALTH_STATUS</code> to specify the initial status of the custom health check,
     *         <code>HEALTHY</code> or <code>UNHEALTHY</code>. If you don't specify a value for
     *         <code>AWS_INIT_HEALTH_STATUS</code>, the initial status is <code>HEALTHY</code>.
     *         </p>
     *         <p>
     *         <b>AWS_INSTANCE_CNAME</b>
     *         </p>
     *         <p>
     *         If the service configuration includes a CNAME record, the domain name that you want Route 53 to return in
     *         response to DNS queries, for example, <code>example.com</code>.
     *         </p>
     *         <p>
     *         This value is required if the service specified by <code>ServiceId</code> includes settings for an CNAME
     *         record.
     *         </p>
     *         <p>
     *         <b>AWS_INSTANCE_IPV4</b>
     *         </p>
     *         <p>
     *         If the service configuration includes an A record, the IPv4 address that you want Route 53 to return in
     *         response to DNS queries, for example, <code>192.0.2.44</code>.
     *         </p>
     *         <p>
     *         This value is required if the service specified by <code>ServiceId</code> includes settings for an A
     *         record. If the service includes settings for an SRV record, you must specify a value for
     *         <code>AWS_INSTANCE_IPV4</code>, <code>AWS_INSTANCE_IPV6</code>, or both.
     *         </p>
     *         <p>
     *         <b>AWS_INSTANCE_IPV6</b>
     *         </p>
     *         <p>
     *         If the service configuration includes an AAAA record, the IPv6 address that you want Route 53 to return
     *         in response to DNS queries, for example, <code>2001:0db8:85a3:0000:0000:abcd:0001:2345</code>.
     *         </p>
     *         <p>
     *         This value is required if the service specified by <code>ServiceId</code> includes settings for an AAAA
     *         record. If the service includes settings for an SRV record, you must specify a value for
     *         <code>AWS_INSTANCE_IPV4</code>, <code>AWS_INSTANCE_IPV6</code>, or both.
     *         </p>
     *         <p>
     *         <b>AWS_INSTANCE_PORT</b>
     *         </p>
     *         <p>
     *         If the service includes an SRV record, the value that you want Route 53 to return for the port.
     *         </p>
     *         <p>
     *         If the service includes <code>HealthCheckConfig</code>, the port on the endpoint that you want Route 53
     *         to send requests to.
     *         </p>
     *         <p>
     *         This value is required if you specified settings for an SRV record when you created the service.
     *         </p>
     *         <p>
     *         <b>Custom attributes</b>
     *         </p>
     *         <p>
     *         You can add up to 30 custom attributes. For each key-value pair, the maximum length of the attribute name
     *         is 255 characters, and the maximum length of the attribute value is 1,024 characters.
     */

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * A string map that contains the following information for the service that you specify in <code>ServiceId</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The attributes that apply to the records that are defined in the service.
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
     * <p>
     * <b>AWS_ALIAS_DNS_NAME</b>
     * </p>
     * <p>
     * <b/>
     * </p>
     * <p>
     * If you want AWS Cloud Map to create an Amazon Route 53 alias record that routes traffic to an Elastic Load
     * Balancing load balancer, specify the DNS name that is associated with the load balancer. For information about
     * how to get the DNS name, see "DNSName" in the topic <a
     * href="http://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html">AliasTarget</a> in the
     * <i>Route 53 API Reference</i>.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The configuration for the service that is specified by <code>ServiceId</code> must include settings for an A
     * record, an AAAA record, or both.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the service that is specified by <code>ServiceId</code>, the value of <code>RoutingPolicy</code> must be
     * <code>WEIGHTED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the service that is specified by <code>ServiceId</code> includes <code>HealthCheckConfig</code> settings, AWS
     * Cloud Map will create the Route 53 health check, but it won't associate the health check with the alias record.
     * </p>
     * </li>
     * <li>
     * <p>
     * Auto naming currently doesn't support creating alias records that route traffic to AWS resources other than ELB
     * load balancers.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a value for <code>AWS_ALIAS_DNS_NAME</code>, don't specify values for any of the
     * <code>AWS_INSTANCE</code> attributes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>AWS_INIT_HEALTH_STATUS</b>
     * </p>
     * <p>
     * If the service configuration includes <code>HealthCheckCustomConfig</code>, you can optionally use
     * <code>AWS_INIT_HEALTH_STATUS</code> to specify the initial status of the custom health check,
     * <code>HEALTHY</code> or <code>UNHEALTHY</code>. If you don't specify a value for
     * <code>AWS_INIT_HEALTH_STATUS</code>, the initial status is <code>HEALTHY</code>.
     * </p>
     * <p>
     * <b>AWS_INSTANCE_CNAME</b>
     * </p>
     * <p>
     * If the service configuration includes a CNAME record, the domain name that you want Route 53 to return in
     * response to DNS queries, for example, <code>example.com</code>.
     * </p>
     * <p>
     * This value is required if the service specified by <code>ServiceId</code> includes settings for an CNAME record.
     * </p>
     * <p>
     * <b>AWS_INSTANCE_IPV4</b>
     * </p>
     * <p>
     * If the service configuration includes an A record, the IPv4 address that you want Route 53 to return in response
     * to DNS queries, for example, <code>192.0.2.44</code>.
     * </p>
     * <p>
     * This value is required if the service specified by <code>ServiceId</code> includes settings for an A record. If
     * the service includes settings for an SRV record, you must specify a value for <code>AWS_INSTANCE_IPV4</code>,
     * <code>AWS_INSTANCE_IPV6</code>, or both.
     * </p>
     * <p>
     * <b>AWS_INSTANCE_IPV6</b>
     * </p>
     * <p>
     * If the service configuration includes an AAAA record, the IPv6 address that you want Route 53 to return in
     * response to DNS queries, for example, <code>2001:0db8:85a3:0000:0000:abcd:0001:2345</code>.
     * </p>
     * <p>
     * This value is required if the service specified by <code>ServiceId</code> includes settings for an AAAA record.
     * If the service includes settings for an SRV record, you must specify a value for <code>AWS_INSTANCE_IPV4</code>,
     * <code>AWS_INSTANCE_IPV6</code>, or both.
     * </p>
     * <p>
     * <b>AWS_INSTANCE_PORT</b>
     * </p>
     * <p>
     * If the service includes an SRV record, the value that you want Route 53 to return for the port.
     * </p>
     * <p>
     * If the service includes <code>HealthCheckConfig</code>, the port on the endpoint that you want Route 53 to send
     * requests to.
     * </p>
     * <p>
     * This value is required if you specified settings for an SRV record when you created the service.
     * </p>
     * <p>
     * <b>Custom attributes</b>
     * </p>
     * <p>
     * You can add up to 30 custom attributes. For each key-value pair, the maximum length of the attribute name is 255
     * characters, and the maximum length of the attribute value is 1,024 characters.
     * </p>
     * 
     * @param attributes
     *        A string map that contains the following information for the service that you specify in
     *        <code>ServiceId</code>:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The attributes that apply to the records that are defined in the service.
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
     *        <p>
     *        <b>AWS_ALIAS_DNS_NAME</b>
     *        </p>
     *        <p>
     *        <b/>
     *        </p>
     *        <p>
     *        If you want AWS Cloud Map to create an Amazon Route 53 alias record that routes traffic to an Elastic Load
     *        Balancing load balancer, specify the DNS name that is associated with the load balancer. For information
     *        about how to get the DNS name, see "DNSName" in the topic <a
     *        href="http://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html">AliasTarget</a> in the
     *        <i>Route 53 API Reference</i>.
     *        </p>
     *        <p>
     *        Note the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The configuration for the service that is specified by <code>ServiceId</code> must include settings for an
     *        A record, an AAAA record, or both.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In the service that is specified by <code>ServiceId</code>, the value of <code>RoutingPolicy</code> must
     *        be <code>WEIGHTED</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the service that is specified by <code>ServiceId</code> includes <code>HealthCheckConfig</code>
     *        settings, AWS Cloud Map will create the Route 53 health check, but it won't associate the health check
     *        with the alias record.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Auto naming currently doesn't support creating alias records that route traffic to AWS resources other
     *        than ELB load balancers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify a value for <code>AWS_ALIAS_DNS_NAME</code>, don't specify values for any of the
     *        <code>AWS_INSTANCE</code> attributes.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>AWS_INIT_HEALTH_STATUS</b>
     *        </p>
     *        <p>
     *        If the service configuration includes <code>HealthCheckCustomConfig</code>, you can optionally use
     *        <code>AWS_INIT_HEALTH_STATUS</code> to specify the initial status of the custom health check,
     *        <code>HEALTHY</code> or <code>UNHEALTHY</code>. If you don't specify a value for
     *        <code>AWS_INIT_HEALTH_STATUS</code>, the initial status is <code>HEALTHY</code>.
     *        </p>
     *        <p>
     *        <b>AWS_INSTANCE_CNAME</b>
     *        </p>
     *        <p>
     *        If the service configuration includes a CNAME record, the domain name that you want Route 53 to return in
     *        response to DNS queries, for example, <code>example.com</code>.
     *        </p>
     *        <p>
     *        This value is required if the service specified by <code>ServiceId</code> includes settings for an CNAME
     *        record.
     *        </p>
     *        <p>
     *        <b>AWS_INSTANCE_IPV4</b>
     *        </p>
     *        <p>
     *        If the service configuration includes an A record, the IPv4 address that you want Route 53 to return in
     *        response to DNS queries, for example, <code>192.0.2.44</code>.
     *        </p>
     *        <p>
     *        This value is required if the service specified by <code>ServiceId</code> includes settings for an A
     *        record. If the service includes settings for an SRV record, you must specify a value for
     *        <code>AWS_INSTANCE_IPV4</code>, <code>AWS_INSTANCE_IPV6</code>, or both.
     *        </p>
     *        <p>
     *        <b>AWS_INSTANCE_IPV6</b>
     *        </p>
     *        <p>
     *        If the service configuration includes an AAAA record, the IPv6 address that you want Route 53 to return in
     *        response to DNS queries, for example, <code>2001:0db8:85a3:0000:0000:abcd:0001:2345</code>.
     *        </p>
     *        <p>
     *        This value is required if the service specified by <code>ServiceId</code> includes settings for an AAAA
     *        record. If the service includes settings for an SRV record, you must specify a value for
     *        <code>AWS_INSTANCE_IPV4</code>, <code>AWS_INSTANCE_IPV6</code>, or both.
     *        </p>
     *        <p>
     *        <b>AWS_INSTANCE_PORT</b>
     *        </p>
     *        <p>
     *        If the service includes an SRV record, the value that you want Route 53 to return for the port.
     *        </p>
     *        <p>
     *        If the service includes <code>HealthCheckConfig</code>, the port on the endpoint that you want Route 53 to
     *        send requests to.
     *        </p>
     *        <p>
     *        This value is required if you specified settings for an SRV record when you created the service.
     *        </p>
     *        <p>
     *        <b>Custom attributes</b>
     *        </p>
     *        <p>
     *        You can add up to 30 custom attributes. For each key-value pair, the maximum length of the attribute name
     *        is 255 characters, and the maximum length of the attribute value is 1,024 characters.
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * A string map that contains the following information for the service that you specify in <code>ServiceId</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The attributes that apply to the records that are defined in the service.
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
     * <p>
     * <b>AWS_ALIAS_DNS_NAME</b>
     * </p>
     * <p>
     * <b/>
     * </p>
     * <p>
     * If you want AWS Cloud Map to create an Amazon Route 53 alias record that routes traffic to an Elastic Load
     * Balancing load balancer, specify the DNS name that is associated with the load balancer. For information about
     * how to get the DNS name, see "DNSName" in the topic <a
     * href="http://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html">AliasTarget</a> in the
     * <i>Route 53 API Reference</i>.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The configuration for the service that is specified by <code>ServiceId</code> must include settings for an A
     * record, an AAAA record, or both.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the service that is specified by <code>ServiceId</code>, the value of <code>RoutingPolicy</code> must be
     * <code>WEIGHTED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the service that is specified by <code>ServiceId</code> includes <code>HealthCheckConfig</code> settings, AWS
     * Cloud Map will create the Route 53 health check, but it won't associate the health check with the alias record.
     * </p>
     * </li>
     * <li>
     * <p>
     * Auto naming currently doesn't support creating alias records that route traffic to AWS resources other than ELB
     * load balancers.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify a value for <code>AWS_ALIAS_DNS_NAME</code>, don't specify values for any of the
     * <code>AWS_INSTANCE</code> attributes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>AWS_INIT_HEALTH_STATUS</b>
     * </p>
     * <p>
     * If the service configuration includes <code>HealthCheckCustomConfig</code>, you can optionally use
     * <code>AWS_INIT_HEALTH_STATUS</code> to specify the initial status of the custom health check,
     * <code>HEALTHY</code> or <code>UNHEALTHY</code>. If you don't specify a value for
     * <code>AWS_INIT_HEALTH_STATUS</code>, the initial status is <code>HEALTHY</code>.
     * </p>
     * <p>
     * <b>AWS_INSTANCE_CNAME</b>
     * </p>
     * <p>
     * If the service configuration includes a CNAME record, the domain name that you want Route 53 to return in
     * response to DNS queries, for example, <code>example.com</code>.
     * </p>
     * <p>
     * This value is required if the service specified by <code>ServiceId</code> includes settings for an CNAME record.
     * </p>
     * <p>
     * <b>AWS_INSTANCE_IPV4</b>
     * </p>
     * <p>
     * If the service configuration includes an A record, the IPv4 address that you want Route 53 to return in response
     * to DNS queries, for example, <code>192.0.2.44</code>.
     * </p>
     * <p>
     * This value is required if the service specified by <code>ServiceId</code> includes settings for an A record. If
     * the service includes settings for an SRV record, you must specify a value for <code>AWS_INSTANCE_IPV4</code>,
     * <code>AWS_INSTANCE_IPV6</code>, or both.
     * </p>
     * <p>
     * <b>AWS_INSTANCE_IPV6</b>
     * </p>
     * <p>
     * If the service configuration includes an AAAA record, the IPv6 address that you want Route 53 to return in
     * response to DNS queries, for example, <code>2001:0db8:85a3:0000:0000:abcd:0001:2345</code>.
     * </p>
     * <p>
     * This value is required if the service specified by <code>ServiceId</code> includes settings for an AAAA record.
     * If the service includes settings for an SRV record, you must specify a value for <code>AWS_INSTANCE_IPV4</code>,
     * <code>AWS_INSTANCE_IPV6</code>, or both.
     * </p>
     * <p>
     * <b>AWS_INSTANCE_PORT</b>
     * </p>
     * <p>
     * If the service includes an SRV record, the value that you want Route 53 to return for the port.
     * </p>
     * <p>
     * If the service includes <code>HealthCheckConfig</code>, the port on the endpoint that you want Route 53 to send
     * requests to.
     * </p>
     * <p>
     * This value is required if you specified settings for an SRV record when you created the service.
     * </p>
     * <p>
     * <b>Custom attributes</b>
     * </p>
     * <p>
     * You can add up to 30 custom attributes. For each key-value pair, the maximum length of the attribute name is 255
     * characters, and the maximum length of the attribute value is 1,024 characters.
     * </p>
     * 
     * @param attributes
     *        A string map that contains the following information for the service that you specify in
     *        <code>ServiceId</code>:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The attributes that apply to the records that are defined in the service.
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
     *        <p>
     *        <b>AWS_ALIAS_DNS_NAME</b>
     *        </p>
     *        <p>
     *        <b/>
     *        </p>
     *        <p>
     *        If you want AWS Cloud Map to create an Amazon Route 53 alias record that routes traffic to an Elastic Load
     *        Balancing load balancer, specify the DNS name that is associated with the load balancer. For information
     *        about how to get the DNS name, see "DNSName" in the topic <a
     *        href="http://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html">AliasTarget</a> in the
     *        <i>Route 53 API Reference</i>.
     *        </p>
     *        <p>
     *        Note the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The configuration for the service that is specified by <code>ServiceId</code> must include settings for an
     *        A record, an AAAA record, or both.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In the service that is specified by <code>ServiceId</code>, the value of <code>RoutingPolicy</code> must
     *        be <code>WEIGHTED</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the service that is specified by <code>ServiceId</code> includes <code>HealthCheckConfig</code>
     *        settings, AWS Cloud Map will create the Route 53 health check, but it won't associate the health check
     *        with the alias record.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Auto naming currently doesn't support creating alias records that route traffic to AWS resources other
     *        than ELB load balancers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify a value for <code>AWS_ALIAS_DNS_NAME</code>, don't specify values for any of the
     *        <code>AWS_INSTANCE</code> attributes.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>AWS_INIT_HEALTH_STATUS</b>
     *        </p>
     *        <p>
     *        If the service configuration includes <code>HealthCheckCustomConfig</code>, you can optionally use
     *        <code>AWS_INIT_HEALTH_STATUS</code> to specify the initial status of the custom health check,
     *        <code>HEALTHY</code> or <code>UNHEALTHY</code>. If you don't specify a value for
     *        <code>AWS_INIT_HEALTH_STATUS</code>, the initial status is <code>HEALTHY</code>.
     *        </p>
     *        <p>
     *        <b>AWS_INSTANCE_CNAME</b>
     *        </p>
     *        <p>
     *        If the service configuration includes a CNAME record, the domain name that you want Route 53 to return in
     *        response to DNS queries, for example, <code>example.com</code>.
     *        </p>
     *        <p>
     *        This value is required if the service specified by <code>ServiceId</code> includes settings for an CNAME
     *        record.
     *        </p>
     *        <p>
     *        <b>AWS_INSTANCE_IPV4</b>
     *        </p>
     *        <p>
     *        If the service configuration includes an A record, the IPv4 address that you want Route 53 to return in
     *        response to DNS queries, for example, <code>192.0.2.44</code>.
     *        </p>
     *        <p>
     *        This value is required if the service specified by <code>ServiceId</code> includes settings for an A
     *        record. If the service includes settings for an SRV record, you must specify a value for
     *        <code>AWS_INSTANCE_IPV4</code>, <code>AWS_INSTANCE_IPV6</code>, or both.
     *        </p>
     *        <p>
     *        <b>AWS_INSTANCE_IPV6</b>
     *        </p>
     *        <p>
     *        If the service configuration includes an AAAA record, the IPv6 address that you want Route 53 to return in
     *        response to DNS queries, for example, <code>2001:0db8:85a3:0000:0000:abcd:0001:2345</code>.
     *        </p>
     *        <p>
     *        This value is required if the service specified by <code>ServiceId</code> includes settings for an AAAA
     *        record. If the service includes settings for an SRV record, you must specify a value for
     *        <code>AWS_INSTANCE_IPV4</code>, <code>AWS_INSTANCE_IPV6</code>, or both.
     *        </p>
     *        <p>
     *        <b>AWS_INSTANCE_PORT</b>
     *        </p>
     *        <p>
     *        If the service includes an SRV record, the value that you want Route 53 to return for the port.
     *        </p>
     *        <p>
     *        If the service includes <code>HealthCheckConfig</code>, the port on the endpoint that you want Route 53 to
     *        send requests to.
     *        </p>
     *        <p>
     *        This value is required if you specified settings for an SRV record when you created the service.
     *        </p>
     *        <p>
     *        <b>Custom attributes</b>
     *        </p>
     *        <p>
     *        You can add up to 30 custom attributes. For each key-value pair, the maximum length of the attribute name
     *        is 255 characters, and the maximum length of the attribute value is 1,024 characters.
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
