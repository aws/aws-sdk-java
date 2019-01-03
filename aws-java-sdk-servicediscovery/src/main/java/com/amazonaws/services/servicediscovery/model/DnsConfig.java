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
 * A complex type that contains information about the Amazon Route 53 DNS records that you want AWS Cloud Map to create
 * when you register an instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/DnsConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DnsConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the namespace to use for DNS configuration.
     * </p>
     */
    @Deprecated
    private String namespaceId;
    /**
     * <p>
     * The routing policy that you want to apply to all Route 53 DNS records that AWS Cloud Map creates when you
     * register an instance and specify this service.
     * </p>
     * <note>
     * <p>
     * If you want to use this service to register instances that create alias records, specify <code>WEIGHTED</code>
     * for the routing policy.
     * </p>
     * </note>
     * <p>
     * You can specify the following values:
     * </p>
     * <p>
     * <b>MULTIVALUE</b>
     * </p>
     * <p>
     * If you define a health check for the service and the health check is healthy, Route 53 returns the applicable
     * value for up to eight instances.
     * </p>
     * <p>
     * For example, suppose the service includes configurations for one A record and a health check, and you use the
     * service to register 10 instances. Route 53 responds to DNS queries with IP addresses for up to eight healthy
     * instances. If fewer than eight instances are healthy, Route 53 responds to every DNS query with the IP addresses
     * for all of the healthy instances.
     * </p>
     * <p>
     * If you don't define a health check for the service, Route 53 assumes that all instances are healthy and returns
     * the values for up to eight instances.
     * </p>
     * <p>
     * For more information about the multivalue routing policy, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html#routing-policy-multivalue"
     * >Multivalue Answer Routing</a> in the <i>Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * <b>WEIGHTED</b>
     * </p>
     * <p>
     * Route 53 returns the applicable value from one randomly selected instance from among the instances that you
     * registered using the same service. Currently, all records have the same weight, so you can't route more or less
     * traffic to any instances.
     * </p>
     * <p>
     * For example, suppose the service includes configurations for one A record and a health check, and you use the
     * service to register 10 instances. Route 53 responds to DNS queries with the IP address for one randomly selected
     * instance from among the healthy instances. If no instances are healthy, Route 53 responds to DNS queries as if
     * all of the instances were healthy.
     * </p>
     * <p>
     * If you don't define a health check for the service, Route 53 assumes that all instances are healthy and returns
     * the applicable value for one randomly selected instance.
     * </p>
     * <p>
     * For more information about the weighted routing policy, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html#routing-policy-weighted"
     * >Weighted Routing</a> in the <i>Route 53 Developer Guide</i>.
     * </p>
     */
    private String routingPolicy;
    /**
     * <p>
     * An array that contains one <code>DnsRecord</code> object for each Route 53 DNS record that you want AWS Cloud Map
     * to create when you register an instance.
     * </p>
     */
    private java.util.List<DnsRecord> dnsRecords;

    /**
     * <p>
     * The ID of the namespace to use for DNS configuration.
     * </p>
     * 
     * @param namespaceId
     *        The ID of the namespace to use for DNS configuration.
     */
    @Deprecated
    public void setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
    }

    /**
     * <p>
     * The ID of the namespace to use for DNS configuration.
     * </p>
     * 
     * @return The ID of the namespace to use for DNS configuration.
     */
    @Deprecated
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * <p>
     * The ID of the namespace to use for DNS configuration.
     * </p>
     * 
     * @param namespaceId
     *        The ID of the namespace to use for DNS configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public DnsConfig withNamespaceId(String namespaceId) {
        setNamespaceId(namespaceId);
        return this;
    }

    /**
     * <p>
     * The routing policy that you want to apply to all Route 53 DNS records that AWS Cloud Map creates when you
     * register an instance and specify this service.
     * </p>
     * <note>
     * <p>
     * If you want to use this service to register instances that create alias records, specify <code>WEIGHTED</code>
     * for the routing policy.
     * </p>
     * </note>
     * <p>
     * You can specify the following values:
     * </p>
     * <p>
     * <b>MULTIVALUE</b>
     * </p>
     * <p>
     * If you define a health check for the service and the health check is healthy, Route 53 returns the applicable
     * value for up to eight instances.
     * </p>
     * <p>
     * For example, suppose the service includes configurations for one A record and a health check, and you use the
     * service to register 10 instances. Route 53 responds to DNS queries with IP addresses for up to eight healthy
     * instances. If fewer than eight instances are healthy, Route 53 responds to every DNS query with the IP addresses
     * for all of the healthy instances.
     * </p>
     * <p>
     * If you don't define a health check for the service, Route 53 assumes that all instances are healthy and returns
     * the values for up to eight instances.
     * </p>
     * <p>
     * For more information about the multivalue routing policy, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html#routing-policy-multivalue"
     * >Multivalue Answer Routing</a> in the <i>Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * <b>WEIGHTED</b>
     * </p>
     * <p>
     * Route 53 returns the applicable value from one randomly selected instance from among the instances that you
     * registered using the same service. Currently, all records have the same weight, so you can't route more or less
     * traffic to any instances.
     * </p>
     * <p>
     * For example, suppose the service includes configurations for one A record and a health check, and you use the
     * service to register 10 instances. Route 53 responds to DNS queries with the IP address for one randomly selected
     * instance from among the healthy instances. If no instances are healthy, Route 53 responds to DNS queries as if
     * all of the instances were healthy.
     * </p>
     * <p>
     * If you don't define a health check for the service, Route 53 assumes that all instances are healthy and returns
     * the applicable value for one randomly selected instance.
     * </p>
     * <p>
     * For more information about the weighted routing policy, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html#routing-policy-weighted"
     * >Weighted Routing</a> in the <i>Route 53 Developer Guide</i>.
     * </p>
     * 
     * @param routingPolicy
     *        The routing policy that you want to apply to all Route 53 DNS records that AWS Cloud Map creates when you
     *        register an instance and specify this service.</p> <note>
     *        <p>
     *        If you want to use this service to register instances that create alias records, specify
     *        <code>WEIGHTED</code> for the routing policy.
     *        </p>
     *        </note>
     *        <p>
     *        You can specify the following values:
     *        </p>
     *        <p>
     *        <b>MULTIVALUE</b>
     *        </p>
     *        <p>
     *        If you define a health check for the service and the health check is healthy, Route 53 returns the
     *        applicable value for up to eight instances.
     *        </p>
     *        <p>
     *        For example, suppose the service includes configurations for one A record and a health check, and you use
     *        the service to register 10 instances. Route 53 responds to DNS queries with IP addresses for up to eight
     *        healthy instances. If fewer than eight instances are healthy, Route 53 responds to every DNS query with
     *        the IP addresses for all of the healthy instances.
     *        </p>
     *        <p>
     *        If you don't define a health check for the service, Route 53 assumes that all instances are healthy and
     *        returns the values for up to eight instances.
     *        </p>
     *        <p>
     *        For more information about the multivalue routing policy, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html#routing-policy-multivalue"
     *        >Multivalue Answer Routing</a> in the <i>Route 53 Developer Guide</i>.
     *        </p>
     *        <p>
     *        <b>WEIGHTED</b>
     *        </p>
     *        <p>
     *        Route 53 returns the applicable value from one randomly selected instance from among the instances that
     *        you registered using the same service. Currently, all records have the same weight, so you can't route
     *        more or less traffic to any instances.
     *        </p>
     *        <p>
     *        For example, suppose the service includes configurations for one A record and a health check, and you use
     *        the service to register 10 instances. Route 53 responds to DNS queries with the IP address for one
     *        randomly selected instance from among the healthy instances. If no instances are healthy, Route 53
     *        responds to DNS queries as if all of the instances were healthy.
     *        </p>
     *        <p>
     *        If you don't define a health check for the service, Route 53 assumes that all instances are healthy and
     *        returns the applicable value for one randomly selected instance.
     *        </p>
     *        <p>
     *        For more information about the weighted routing policy, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html#routing-policy-weighted"
     *        >Weighted Routing</a> in the <i>Route 53 Developer Guide</i>.
     * @see RoutingPolicy
     */

    public void setRoutingPolicy(String routingPolicy) {
        this.routingPolicy = routingPolicy;
    }

    /**
     * <p>
     * The routing policy that you want to apply to all Route 53 DNS records that AWS Cloud Map creates when you
     * register an instance and specify this service.
     * </p>
     * <note>
     * <p>
     * If you want to use this service to register instances that create alias records, specify <code>WEIGHTED</code>
     * for the routing policy.
     * </p>
     * </note>
     * <p>
     * You can specify the following values:
     * </p>
     * <p>
     * <b>MULTIVALUE</b>
     * </p>
     * <p>
     * If you define a health check for the service and the health check is healthy, Route 53 returns the applicable
     * value for up to eight instances.
     * </p>
     * <p>
     * For example, suppose the service includes configurations for one A record and a health check, and you use the
     * service to register 10 instances. Route 53 responds to DNS queries with IP addresses for up to eight healthy
     * instances. If fewer than eight instances are healthy, Route 53 responds to every DNS query with the IP addresses
     * for all of the healthy instances.
     * </p>
     * <p>
     * If you don't define a health check for the service, Route 53 assumes that all instances are healthy and returns
     * the values for up to eight instances.
     * </p>
     * <p>
     * For more information about the multivalue routing policy, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html#routing-policy-multivalue"
     * >Multivalue Answer Routing</a> in the <i>Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * <b>WEIGHTED</b>
     * </p>
     * <p>
     * Route 53 returns the applicable value from one randomly selected instance from among the instances that you
     * registered using the same service. Currently, all records have the same weight, so you can't route more or less
     * traffic to any instances.
     * </p>
     * <p>
     * For example, suppose the service includes configurations for one A record and a health check, and you use the
     * service to register 10 instances. Route 53 responds to DNS queries with the IP address for one randomly selected
     * instance from among the healthy instances. If no instances are healthy, Route 53 responds to DNS queries as if
     * all of the instances were healthy.
     * </p>
     * <p>
     * If you don't define a health check for the service, Route 53 assumes that all instances are healthy and returns
     * the applicable value for one randomly selected instance.
     * </p>
     * <p>
     * For more information about the weighted routing policy, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html#routing-policy-weighted"
     * >Weighted Routing</a> in the <i>Route 53 Developer Guide</i>.
     * </p>
     * 
     * @return The routing policy that you want to apply to all Route 53 DNS records that AWS Cloud Map creates when you
     *         register an instance and specify this service.</p> <note>
     *         <p>
     *         If you want to use this service to register instances that create alias records, specify
     *         <code>WEIGHTED</code> for the routing policy.
     *         </p>
     *         </note>
     *         <p>
     *         You can specify the following values:
     *         </p>
     *         <p>
     *         <b>MULTIVALUE</b>
     *         </p>
     *         <p>
     *         If you define a health check for the service and the health check is healthy, Route 53 returns the
     *         applicable value for up to eight instances.
     *         </p>
     *         <p>
     *         For example, suppose the service includes configurations for one A record and a health check, and you use
     *         the service to register 10 instances. Route 53 responds to DNS queries with IP addresses for up to eight
     *         healthy instances. If fewer than eight instances are healthy, Route 53 responds to every DNS query with
     *         the IP addresses for all of the healthy instances.
     *         </p>
     *         <p>
     *         If you don't define a health check for the service, Route 53 assumes that all instances are healthy and
     *         returns the values for up to eight instances.
     *         </p>
     *         <p>
     *         For more information about the multivalue routing policy, see <a href=
     *         "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html#routing-policy-multivalue"
     *         >Multivalue Answer Routing</a> in the <i>Route 53 Developer Guide</i>.
     *         </p>
     *         <p>
     *         <b>WEIGHTED</b>
     *         </p>
     *         <p>
     *         Route 53 returns the applicable value from one randomly selected instance from among the instances that
     *         you registered using the same service. Currently, all records have the same weight, so you can't route
     *         more or less traffic to any instances.
     *         </p>
     *         <p>
     *         For example, suppose the service includes configurations for one A record and a health check, and you use
     *         the service to register 10 instances. Route 53 responds to DNS queries with the IP address for one
     *         randomly selected instance from among the healthy instances. If no instances are healthy, Route 53
     *         responds to DNS queries as if all of the instances were healthy.
     *         </p>
     *         <p>
     *         If you don't define a health check for the service, Route 53 assumes that all instances are healthy and
     *         returns the applicable value for one randomly selected instance.
     *         </p>
     *         <p>
     *         For more information about the weighted routing policy, see <a href=
     *         "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html#routing-policy-weighted"
     *         >Weighted Routing</a> in the <i>Route 53 Developer Guide</i>.
     * @see RoutingPolicy
     */

    public String getRoutingPolicy() {
        return this.routingPolicy;
    }

    /**
     * <p>
     * The routing policy that you want to apply to all Route 53 DNS records that AWS Cloud Map creates when you
     * register an instance and specify this service.
     * </p>
     * <note>
     * <p>
     * If you want to use this service to register instances that create alias records, specify <code>WEIGHTED</code>
     * for the routing policy.
     * </p>
     * </note>
     * <p>
     * You can specify the following values:
     * </p>
     * <p>
     * <b>MULTIVALUE</b>
     * </p>
     * <p>
     * If you define a health check for the service and the health check is healthy, Route 53 returns the applicable
     * value for up to eight instances.
     * </p>
     * <p>
     * For example, suppose the service includes configurations for one A record and a health check, and you use the
     * service to register 10 instances. Route 53 responds to DNS queries with IP addresses for up to eight healthy
     * instances. If fewer than eight instances are healthy, Route 53 responds to every DNS query with the IP addresses
     * for all of the healthy instances.
     * </p>
     * <p>
     * If you don't define a health check for the service, Route 53 assumes that all instances are healthy and returns
     * the values for up to eight instances.
     * </p>
     * <p>
     * For more information about the multivalue routing policy, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html#routing-policy-multivalue"
     * >Multivalue Answer Routing</a> in the <i>Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * <b>WEIGHTED</b>
     * </p>
     * <p>
     * Route 53 returns the applicable value from one randomly selected instance from among the instances that you
     * registered using the same service. Currently, all records have the same weight, so you can't route more or less
     * traffic to any instances.
     * </p>
     * <p>
     * For example, suppose the service includes configurations for one A record and a health check, and you use the
     * service to register 10 instances. Route 53 responds to DNS queries with the IP address for one randomly selected
     * instance from among the healthy instances. If no instances are healthy, Route 53 responds to DNS queries as if
     * all of the instances were healthy.
     * </p>
     * <p>
     * If you don't define a health check for the service, Route 53 assumes that all instances are healthy and returns
     * the applicable value for one randomly selected instance.
     * </p>
     * <p>
     * For more information about the weighted routing policy, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html#routing-policy-weighted"
     * >Weighted Routing</a> in the <i>Route 53 Developer Guide</i>.
     * </p>
     * 
     * @param routingPolicy
     *        The routing policy that you want to apply to all Route 53 DNS records that AWS Cloud Map creates when you
     *        register an instance and specify this service.</p> <note>
     *        <p>
     *        If you want to use this service to register instances that create alias records, specify
     *        <code>WEIGHTED</code> for the routing policy.
     *        </p>
     *        </note>
     *        <p>
     *        You can specify the following values:
     *        </p>
     *        <p>
     *        <b>MULTIVALUE</b>
     *        </p>
     *        <p>
     *        If you define a health check for the service and the health check is healthy, Route 53 returns the
     *        applicable value for up to eight instances.
     *        </p>
     *        <p>
     *        For example, suppose the service includes configurations for one A record and a health check, and you use
     *        the service to register 10 instances. Route 53 responds to DNS queries with IP addresses for up to eight
     *        healthy instances. If fewer than eight instances are healthy, Route 53 responds to every DNS query with
     *        the IP addresses for all of the healthy instances.
     *        </p>
     *        <p>
     *        If you don't define a health check for the service, Route 53 assumes that all instances are healthy and
     *        returns the values for up to eight instances.
     *        </p>
     *        <p>
     *        For more information about the multivalue routing policy, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html#routing-policy-multivalue"
     *        >Multivalue Answer Routing</a> in the <i>Route 53 Developer Guide</i>.
     *        </p>
     *        <p>
     *        <b>WEIGHTED</b>
     *        </p>
     *        <p>
     *        Route 53 returns the applicable value from one randomly selected instance from among the instances that
     *        you registered using the same service. Currently, all records have the same weight, so you can't route
     *        more or less traffic to any instances.
     *        </p>
     *        <p>
     *        For example, suppose the service includes configurations for one A record and a health check, and you use
     *        the service to register 10 instances. Route 53 responds to DNS queries with the IP address for one
     *        randomly selected instance from among the healthy instances. If no instances are healthy, Route 53
     *        responds to DNS queries as if all of the instances were healthy.
     *        </p>
     *        <p>
     *        If you don't define a health check for the service, Route 53 assumes that all instances are healthy and
     *        returns the applicable value for one randomly selected instance.
     *        </p>
     *        <p>
     *        For more information about the weighted routing policy, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html#routing-policy-weighted"
     *        >Weighted Routing</a> in the <i>Route 53 Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RoutingPolicy
     */

    public DnsConfig withRoutingPolicy(String routingPolicy) {
        setRoutingPolicy(routingPolicy);
        return this;
    }

    /**
     * <p>
     * The routing policy that you want to apply to all Route 53 DNS records that AWS Cloud Map creates when you
     * register an instance and specify this service.
     * </p>
     * <note>
     * <p>
     * If you want to use this service to register instances that create alias records, specify <code>WEIGHTED</code>
     * for the routing policy.
     * </p>
     * </note>
     * <p>
     * You can specify the following values:
     * </p>
     * <p>
     * <b>MULTIVALUE</b>
     * </p>
     * <p>
     * If you define a health check for the service and the health check is healthy, Route 53 returns the applicable
     * value for up to eight instances.
     * </p>
     * <p>
     * For example, suppose the service includes configurations for one A record and a health check, and you use the
     * service to register 10 instances. Route 53 responds to DNS queries with IP addresses for up to eight healthy
     * instances. If fewer than eight instances are healthy, Route 53 responds to every DNS query with the IP addresses
     * for all of the healthy instances.
     * </p>
     * <p>
     * If you don't define a health check for the service, Route 53 assumes that all instances are healthy and returns
     * the values for up to eight instances.
     * </p>
     * <p>
     * For more information about the multivalue routing policy, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html#routing-policy-multivalue"
     * >Multivalue Answer Routing</a> in the <i>Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * <b>WEIGHTED</b>
     * </p>
     * <p>
     * Route 53 returns the applicable value from one randomly selected instance from among the instances that you
     * registered using the same service. Currently, all records have the same weight, so you can't route more or less
     * traffic to any instances.
     * </p>
     * <p>
     * For example, suppose the service includes configurations for one A record and a health check, and you use the
     * service to register 10 instances. Route 53 responds to DNS queries with the IP address for one randomly selected
     * instance from among the healthy instances. If no instances are healthy, Route 53 responds to DNS queries as if
     * all of the instances were healthy.
     * </p>
     * <p>
     * If you don't define a health check for the service, Route 53 assumes that all instances are healthy and returns
     * the applicable value for one randomly selected instance.
     * </p>
     * <p>
     * For more information about the weighted routing policy, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html#routing-policy-weighted"
     * >Weighted Routing</a> in the <i>Route 53 Developer Guide</i>.
     * </p>
     * 
     * @param routingPolicy
     *        The routing policy that you want to apply to all Route 53 DNS records that AWS Cloud Map creates when you
     *        register an instance and specify this service.</p> <note>
     *        <p>
     *        If you want to use this service to register instances that create alias records, specify
     *        <code>WEIGHTED</code> for the routing policy.
     *        </p>
     *        </note>
     *        <p>
     *        You can specify the following values:
     *        </p>
     *        <p>
     *        <b>MULTIVALUE</b>
     *        </p>
     *        <p>
     *        If you define a health check for the service and the health check is healthy, Route 53 returns the
     *        applicable value for up to eight instances.
     *        </p>
     *        <p>
     *        For example, suppose the service includes configurations for one A record and a health check, and you use
     *        the service to register 10 instances. Route 53 responds to DNS queries with IP addresses for up to eight
     *        healthy instances. If fewer than eight instances are healthy, Route 53 responds to every DNS query with
     *        the IP addresses for all of the healthy instances.
     *        </p>
     *        <p>
     *        If you don't define a health check for the service, Route 53 assumes that all instances are healthy and
     *        returns the values for up to eight instances.
     *        </p>
     *        <p>
     *        For more information about the multivalue routing policy, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html#routing-policy-multivalue"
     *        >Multivalue Answer Routing</a> in the <i>Route 53 Developer Guide</i>.
     *        </p>
     *        <p>
     *        <b>WEIGHTED</b>
     *        </p>
     *        <p>
     *        Route 53 returns the applicable value from one randomly selected instance from among the instances that
     *        you registered using the same service. Currently, all records have the same weight, so you can't route
     *        more or less traffic to any instances.
     *        </p>
     *        <p>
     *        For example, suppose the service includes configurations for one A record and a health check, and you use
     *        the service to register 10 instances. Route 53 responds to DNS queries with the IP address for one
     *        randomly selected instance from among the healthy instances. If no instances are healthy, Route 53
     *        responds to DNS queries as if all of the instances were healthy.
     *        </p>
     *        <p>
     *        If you don't define a health check for the service, Route 53 assumes that all instances are healthy and
     *        returns the applicable value for one randomly selected instance.
     *        </p>
     *        <p>
     *        For more information about the weighted routing policy, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html#routing-policy-weighted"
     *        >Weighted Routing</a> in the <i>Route 53 Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RoutingPolicy
     */

    public DnsConfig withRoutingPolicy(RoutingPolicy routingPolicy) {
        this.routingPolicy = routingPolicy.toString();
        return this;
    }

    /**
     * <p>
     * An array that contains one <code>DnsRecord</code> object for each Route 53 DNS record that you want AWS Cloud Map
     * to create when you register an instance.
     * </p>
     * 
     * @return An array that contains one <code>DnsRecord</code> object for each Route 53 DNS record that you want AWS
     *         Cloud Map to create when you register an instance.
     */

    public java.util.List<DnsRecord> getDnsRecords() {
        return dnsRecords;
    }

    /**
     * <p>
     * An array that contains one <code>DnsRecord</code> object for each Route 53 DNS record that you want AWS Cloud Map
     * to create when you register an instance.
     * </p>
     * 
     * @param dnsRecords
     *        An array that contains one <code>DnsRecord</code> object for each Route 53 DNS record that you want AWS
     *        Cloud Map to create when you register an instance.
     */

    public void setDnsRecords(java.util.Collection<DnsRecord> dnsRecords) {
        if (dnsRecords == null) {
            this.dnsRecords = null;
            return;
        }

        this.dnsRecords = new java.util.ArrayList<DnsRecord>(dnsRecords);
    }

    /**
     * <p>
     * An array that contains one <code>DnsRecord</code> object for each Route 53 DNS record that you want AWS Cloud Map
     * to create when you register an instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDnsRecords(java.util.Collection)} or {@link #withDnsRecords(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dnsRecords
     *        An array that contains one <code>DnsRecord</code> object for each Route 53 DNS record that you want AWS
     *        Cloud Map to create when you register an instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DnsConfig withDnsRecords(DnsRecord... dnsRecords) {
        if (this.dnsRecords == null) {
            setDnsRecords(new java.util.ArrayList<DnsRecord>(dnsRecords.length));
        }
        for (DnsRecord ele : dnsRecords) {
            this.dnsRecords.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array that contains one <code>DnsRecord</code> object for each Route 53 DNS record that you want AWS Cloud Map
     * to create when you register an instance.
     * </p>
     * 
     * @param dnsRecords
     *        An array that contains one <code>DnsRecord</code> object for each Route 53 DNS record that you want AWS
     *        Cloud Map to create when you register an instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DnsConfig withDnsRecords(java.util.Collection<DnsRecord> dnsRecords) {
        setDnsRecords(dnsRecords);
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
        if (getNamespaceId() != null)
            sb.append("NamespaceId: ").append(getNamespaceId()).append(",");
        if (getRoutingPolicy() != null)
            sb.append("RoutingPolicy: ").append(getRoutingPolicy()).append(",");
        if (getDnsRecords() != null)
            sb.append("DnsRecords: ").append(getDnsRecords());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DnsConfig == false)
            return false;
        DnsConfig other = (DnsConfig) obj;
        if (other.getNamespaceId() == null ^ this.getNamespaceId() == null)
            return false;
        if (other.getNamespaceId() != null && other.getNamespaceId().equals(this.getNamespaceId()) == false)
            return false;
        if (other.getRoutingPolicy() == null ^ this.getRoutingPolicy() == null)
            return false;
        if (other.getRoutingPolicy() != null && other.getRoutingPolicy().equals(this.getRoutingPolicy()) == false)
            return false;
        if (other.getDnsRecords() == null ^ this.getDnsRecords() == null)
            return false;
        if (other.getDnsRecords() != null && other.getDnsRecords().equals(this.getDnsRecords()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamespaceId() == null) ? 0 : getNamespaceId().hashCode());
        hashCode = prime * hashCode + ((getRoutingPolicy() == null) ? 0 : getRoutingPolicy().hashCode());
        hashCode = prime * hashCode + ((getDnsRecords() == null) ? 0 : getDnsRecords().hashCode());
        return hashCode;
    }

    @Override
    public DnsConfig clone() {
        try {
            return (DnsConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicediscovery.model.transform.DnsConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
