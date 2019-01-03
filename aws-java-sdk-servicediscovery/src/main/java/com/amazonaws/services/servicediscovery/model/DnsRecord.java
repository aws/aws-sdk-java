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
 * A complex type that contains information about the Route 53 DNS records that you want AWS Cloud Map to create when
 * you register an instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/DnsRecord" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DnsRecord implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of the resource, which indicates the type of value that Route 53 returns in response to DNS queries.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>A, AAAA, and SRV records:</b> You can specify settings for a maximum of one A, one AAAA, and one SRV record.
     * You can specify them in any combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CNAME records:</b> If you specify <code>CNAME</code> for <code>Type</code>, you can't define any other
     * records. This is a limitation of DNS: you can't create a CNAME record and any other type of record that has the
     * same name as a CNAME record.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Alias records:</b> If you want AWS Cloud Map to create a Route 53 alias record when you register an instance,
     * specify <code>A</code> or <code>AAAA</code> for <code>Type</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>All records:</b> You specify settings other than <code>TTL</code> and <code>Type</code> when you register an
     * instance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following values are supported:
     * </p>
     * <p>
     * <b>A</b>
     * </p>
     * <p>
     * Route 53 returns the IP address of the resource in IPv4 format, such as 192.0.2.44.
     * </p>
     * <p>
     * <b>AAAA</b>
     * </p>
     * <p>
     * Route 53 returns the IP address of the resource in IPv6 format, such as 2001:0db8:85a3:0000:0000:abcd:0001:2345.
     * </p>
     * <p>
     * <b>CNAME</b>
     * </p>
     * <p>
     * Route 53 returns the domain name of the resource, such as www.example.com. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You specify the domain name that you want to route traffic to when you register an instance. For more
     * information, see <a>RegisterInstanceRequest$Attributes</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must specify <code>WEIGHTED</code> for the value of <code>RoutingPolicy</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't specify both <code>CNAME</code> for <code>Type</code> and settings for <code>HealthCheckConfig</code>.
     * If you do, the request will fail with an <code>InvalidInput</code> error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>SRV</b>
     * </p>
     * <p>
     * Route 53 returns the value for an SRV record. The value for an SRV record uses the following values:
     * </p>
     * <p>
     * <code>priority weight port service-hostname</code>
     * </p>
     * <p>
     * Note the following about the values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The values of <code>priority</code> and <code>weight</code> are both set to <code>1</code> and can't be changed.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>port</code> comes from the value that you specify for the <code>AWS_INSTANCE_PORT</code>
     * attribute when you submit a <a>RegisterInstance</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>service-hostname</code> is a concatenation of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value that you specify for <code>InstanceId</code> when you register an instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name of the service.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name of the namespace.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, if the value of <code>InstanceId</code> is <code>test</code>, the name of the service is
     * <code>backend</code>, and the name of the namespace is <code>example.com</code>, the value of
     * <code>service-hostname</code> is:
     * </p>
     * <p>
     * <code>test.backend.example.com</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify settings for an SRV record and if you specify values for <code>AWS_INSTANCE_IPV4</code>,
     * <code>AWS_INSTANCE_IPV6</code>, or both in the <code>RegisterInstance</code> request, AWS Cloud Map automatically
     * creates <code>A</code> and/or <code>AAAA</code> records that have the same name as the value of
     * <code>service-hostname</code> in the SRV record. You can ignore these records.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The amount of time, in seconds, that you want DNS resolvers to cache the settings for this record.
     * </p>
     * <note>
     * <p>
     * Alias records don't include a TTL because Route 53 uses the TTL for the AWS resource that an alias record routes
     * traffic to. If you include the <code>AWS_ALIAS_DNS_NAME</code> attribute when you submit a
     * <a>RegisterInstance</a> request, the <code>TTL</code> value is ignored. Always specify a TTL for the service; you
     * can use a service to register instances that create either alias or non-alias records.
     * </p>
     * </note>
     */
    private Long tTL;

    /**
     * <p>
     * The type of the resource, which indicates the type of value that Route 53 returns in response to DNS queries.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>A, AAAA, and SRV records:</b> You can specify settings for a maximum of one A, one AAAA, and one SRV record.
     * You can specify them in any combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CNAME records:</b> If you specify <code>CNAME</code> for <code>Type</code>, you can't define any other
     * records. This is a limitation of DNS: you can't create a CNAME record and any other type of record that has the
     * same name as a CNAME record.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Alias records:</b> If you want AWS Cloud Map to create a Route 53 alias record when you register an instance,
     * specify <code>A</code> or <code>AAAA</code> for <code>Type</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>All records:</b> You specify settings other than <code>TTL</code> and <code>Type</code> when you register an
     * instance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following values are supported:
     * </p>
     * <p>
     * <b>A</b>
     * </p>
     * <p>
     * Route 53 returns the IP address of the resource in IPv4 format, such as 192.0.2.44.
     * </p>
     * <p>
     * <b>AAAA</b>
     * </p>
     * <p>
     * Route 53 returns the IP address of the resource in IPv6 format, such as 2001:0db8:85a3:0000:0000:abcd:0001:2345.
     * </p>
     * <p>
     * <b>CNAME</b>
     * </p>
     * <p>
     * Route 53 returns the domain name of the resource, such as www.example.com. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You specify the domain name that you want to route traffic to when you register an instance. For more
     * information, see <a>RegisterInstanceRequest$Attributes</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must specify <code>WEIGHTED</code> for the value of <code>RoutingPolicy</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't specify both <code>CNAME</code> for <code>Type</code> and settings for <code>HealthCheckConfig</code>.
     * If you do, the request will fail with an <code>InvalidInput</code> error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>SRV</b>
     * </p>
     * <p>
     * Route 53 returns the value for an SRV record. The value for an SRV record uses the following values:
     * </p>
     * <p>
     * <code>priority weight port service-hostname</code>
     * </p>
     * <p>
     * Note the following about the values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The values of <code>priority</code> and <code>weight</code> are both set to <code>1</code> and can't be changed.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>port</code> comes from the value that you specify for the <code>AWS_INSTANCE_PORT</code>
     * attribute when you submit a <a>RegisterInstance</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>service-hostname</code> is a concatenation of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value that you specify for <code>InstanceId</code> when you register an instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name of the service.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name of the namespace.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, if the value of <code>InstanceId</code> is <code>test</code>, the name of the service is
     * <code>backend</code>, and the name of the namespace is <code>example.com</code>, the value of
     * <code>service-hostname</code> is:
     * </p>
     * <p>
     * <code>test.backend.example.com</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify settings for an SRV record and if you specify values for <code>AWS_INSTANCE_IPV4</code>,
     * <code>AWS_INSTANCE_IPV6</code>, or both in the <code>RegisterInstance</code> request, AWS Cloud Map automatically
     * creates <code>A</code> and/or <code>AAAA</code> records that have the same name as the value of
     * <code>service-hostname</code> in the SRV record. You can ignore these records.
     * </p>
     * 
     * @param type
     *        The type of the resource, which indicates the type of value that Route 53 returns in response to DNS
     *        queries.</p>
     *        <p>
     *        Note the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>A, AAAA, and SRV records:</b> You can specify settings for a maximum of one A, one AAAA, and one SRV
     *        record. You can specify them in any combination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CNAME records:</b> If you specify <code>CNAME</code> for <code>Type</code>, you can't define any other
     *        records. This is a limitation of DNS: you can't create a CNAME record and any other type of record that
     *        has the same name as a CNAME record.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Alias records:</b> If you want AWS Cloud Map to create a Route 53 alias record when you register an
     *        instance, specify <code>A</code> or <code>AAAA</code> for <code>Type</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>All records:</b> You specify settings other than <code>TTL</code> and <code>Type</code> when you
     *        register an instance.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following values are supported:
     *        </p>
     *        <p>
     *        <b>A</b>
     *        </p>
     *        <p>
     *        Route 53 returns the IP address of the resource in IPv4 format, such as 192.0.2.44.
     *        </p>
     *        <p>
     *        <b>AAAA</b>
     *        </p>
     *        <p>
     *        Route 53 returns the IP address of the resource in IPv6 format, such as
     *        2001:0db8:85a3:0000:0000:abcd:0001:2345.
     *        </p>
     *        <p>
     *        <b>CNAME</b>
     *        </p>
     *        <p>
     *        Route 53 returns the domain name of the resource, such as www.example.com. Note the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You specify the domain name that you want to route traffic to when you register an instance. For more
     *        information, see <a>RegisterInstanceRequest$Attributes</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You must specify <code>WEIGHTED</code> for the value of <code>RoutingPolicy</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can't specify both <code>CNAME</code> for <code>Type</code> and settings for
     *        <code>HealthCheckConfig</code>. If you do, the request will fail with an <code>InvalidInput</code> error.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>SRV</b>
     *        </p>
     *        <p>
     *        Route 53 returns the value for an SRV record. The value for an SRV record uses the following values:
     *        </p>
     *        <p>
     *        <code>priority weight port service-hostname</code>
     *        </p>
     *        <p>
     *        Note the following about the values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The values of <code>priority</code> and <code>weight</code> are both set to <code>1</code> and can't be
     *        changed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The value of <code>port</code> comes from the value that you specify for the
     *        <code>AWS_INSTANCE_PORT</code> attribute when you submit a <a>RegisterInstance</a> request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The value of <code>service-hostname</code> is a concatenation of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The value that you specify for <code>InstanceId</code> when you register an instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The name of the service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The name of the namespace.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, if the value of <code>InstanceId</code> is <code>test</code>, the name of the service is
     *        <code>backend</code>, and the name of the namespace is <code>example.com</code>, the value of
     *        <code>service-hostname</code> is:
     *        </p>
     *        <p>
     *        <code>test.backend.example.com</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you specify settings for an SRV record and if you specify values for <code>AWS_INSTANCE_IPV4</code>,
     *        <code>AWS_INSTANCE_IPV6</code>, or both in the <code>RegisterInstance</code> request, AWS Cloud Map
     *        automatically creates <code>A</code> and/or <code>AAAA</code> records that have the same name as the value
     *        of <code>service-hostname</code> in the SRV record. You can ignore these records.
     * @see RecordType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the resource, which indicates the type of value that Route 53 returns in response to DNS queries.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>A, AAAA, and SRV records:</b> You can specify settings for a maximum of one A, one AAAA, and one SRV record.
     * You can specify them in any combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CNAME records:</b> If you specify <code>CNAME</code> for <code>Type</code>, you can't define any other
     * records. This is a limitation of DNS: you can't create a CNAME record and any other type of record that has the
     * same name as a CNAME record.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Alias records:</b> If you want AWS Cloud Map to create a Route 53 alias record when you register an instance,
     * specify <code>A</code> or <code>AAAA</code> for <code>Type</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>All records:</b> You specify settings other than <code>TTL</code> and <code>Type</code> when you register an
     * instance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following values are supported:
     * </p>
     * <p>
     * <b>A</b>
     * </p>
     * <p>
     * Route 53 returns the IP address of the resource in IPv4 format, such as 192.0.2.44.
     * </p>
     * <p>
     * <b>AAAA</b>
     * </p>
     * <p>
     * Route 53 returns the IP address of the resource in IPv6 format, such as 2001:0db8:85a3:0000:0000:abcd:0001:2345.
     * </p>
     * <p>
     * <b>CNAME</b>
     * </p>
     * <p>
     * Route 53 returns the domain name of the resource, such as www.example.com. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You specify the domain name that you want to route traffic to when you register an instance. For more
     * information, see <a>RegisterInstanceRequest$Attributes</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must specify <code>WEIGHTED</code> for the value of <code>RoutingPolicy</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't specify both <code>CNAME</code> for <code>Type</code> and settings for <code>HealthCheckConfig</code>.
     * If you do, the request will fail with an <code>InvalidInput</code> error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>SRV</b>
     * </p>
     * <p>
     * Route 53 returns the value for an SRV record. The value for an SRV record uses the following values:
     * </p>
     * <p>
     * <code>priority weight port service-hostname</code>
     * </p>
     * <p>
     * Note the following about the values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The values of <code>priority</code> and <code>weight</code> are both set to <code>1</code> and can't be changed.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>port</code> comes from the value that you specify for the <code>AWS_INSTANCE_PORT</code>
     * attribute when you submit a <a>RegisterInstance</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>service-hostname</code> is a concatenation of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value that you specify for <code>InstanceId</code> when you register an instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name of the service.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name of the namespace.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, if the value of <code>InstanceId</code> is <code>test</code>, the name of the service is
     * <code>backend</code>, and the name of the namespace is <code>example.com</code>, the value of
     * <code>service-hostname</code> is:
     * </p>
     * <p>
     * <code>test.backend.example.com</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify settings for an SRV record and if you specify values for <code>AWS_INSTANCE_IPV4</code>,
     * <code>AWS_INSTANCE_IPV6</code>, or both in the <code>RegisterInstance</code> request, AWS Cloud Map automatically
     * creates <code>A</code> and/or <code>AAAA</code> records that have the same name as the value of
     * <code>service-hostname</code> in the SRV record. You can ignore these records.
     * </p>
     * 
     * @return The type of the resource, which indicates the type of value that Route 53 returns in response to DNS
     *         queries.</p>
     *         <p>
     *         Note the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>A, AAAA, and SRV records:</b> You can specify settings for a maximum of one A, one AAAA, and one SRV
     *         record. You can specify them in any combination.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>CNAME records:</b> If you specify <code>CNAME</code> for <code>Type</code>, you can't define any other
     *         records. This is a limitation of DNS: you can't create a CNAME record and any other type of record that
     *         has the same name as a CNAME record.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Alias records:</b> If you want AWS Cloud Map to create a Route 53 alias record when you register an
     *         instance, specify <code>A</code> or <code>AAAA</code> for <code>Type</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>All records:</b> You specify settings other than <code>TTL</code> and <code>Type</code> when you
     *         register an instance.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The following values are supported:
     *         </p>
     *         <p>
     *         <b>A</b>
     *         </p>
     *         <p>
     *         Route 53 returns the IP address of the resource in IPv4 format, such as 192.0.2.44.
     *         </p>
     *         <p>
     *         <b>AAAA</b>
     *         </p>
     *         <p>
     *         Route 53 returns the IP address of the resource in IPv6 format, such as
     *         2001:0db8:85a3:0000:0000:abcd:0001:2345.
     *         </p>
     *         <p>
     *         <b>CNAME</b>
     *         </p>
     *         <p>
     *         Route 53 returns the domain name of the resource, such as www.example.com. Note the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specify the domain name that you want to route traffic to when you register an instance. For more
     *         information, see <a>RegisterInstanceRequest$Attributes</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You must specify <code>WEIGHTED</code> for the value of <code>RoutingPolicy</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can't specify both <code>CNAME</code> for <code>Type</code> and settings for
     *         <code>HealthCheckConfig</code>. If you do, the request will fail with an <code>InvalidInput</code> error.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>SRV</b>
     *         </p>
     *         <p>
     *         Route 53 returns the value for an SRV record. The value for an SRV record uses the following values:
     *         </p>
     *         <p>
     *         <code>priority weight port service-hostname</code>
     *         </p>
     *         <p>
     *         Note the following about the values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The values of <code>priority</code> and <code>weight</code> are both set to <code>1</code> and can't be
     *         changed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The value of <code>port</code> comes from the value that you specify for the
     *         <code>AWS_INSTANCE_PORT</code> attribute when you submit a <a>RegisterInstance</a> request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The value of <code>service-hostname</code> is a concatenation of the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The value that you specify for <code>InstanceId</code> when you register an instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The name of the service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The name of the namespace.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For example, if the value of <code>InstanceId</code> is <code>test</code>, the name of the service is
     *         <code>backend</code>, and the name of the namespace is <code>example.com</code>, the value of
     *         <code>service-hostname</code> is:
     *         </p>
     *         <p>
     *         <code>test.backend.example.com</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you specify settings for an SRV record and if you specify values for <code>AWS_INSTANCE_IPV4</code>,
     *         <code>AWS_INSTANCE_IPV6</code>, or both in the <code>RegisterInstance</code> request, AWS Cloud Map
     *         automatically creates <code>A</code> and/or <code>AAAA</code> records that have the same name as the
     *         value of <code>service-hostname</code> in the SRV record. You can ignore these records.
     * @see RecordType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the resource, which indicates the type of value that Route 53 returns in response to DNS queries.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>A, AAAA, and SRV records:</b> You can specify settings for a maximum of one A, one AAAA, and one SRV record.
     * You can specify them in any combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CNAME records:</b> If you specify <code>CNAME</code> for <code>Type</code>, you can't define any other
     * records. This is a limitation of DNS: you can't create a CNAME record and any other type of record that has the
     * same name as a CNAME record.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Alias records:</b> If you want AWS Cloud Map to create a Route 53 alias record when you register an instance,
     * specify <code>A</code> or <code>AAAA</code> for <code>Type</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>All records:</b> You specify settings other than <code>TTL</code> and <code>Type</code> when you register an
     * instance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following values are supported:
     * </p>
     * <p>
     * <b>A</b>
     * </p>
     * <p>
     * Route 53 returns the IP address of the resource in IPv4 format, such as 192.0.2.44.
     * </p>
     * <p>
     * <b>AAAA</b>
     * </p>
     * <p>
     * Route 53 returns the IP address of the resource in IPv6 format, such as 2001:0db8:85a3:0000:0000:abcd:0001:2345.
     * </p>
     * <p>
     * <b>CNAME</b>
     * </p>
     * <p>
     * Route 53 returns the domain name of the resource, such as www.example.com. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You specify the domain name that you want to route traffic to when you register an instance. For more
     * information, see <a>RegisterInstanceRequest$Attributes</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must specify <code>WEIGHTED</code> for the value of <code>RoutingPolicy</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't specify both <code>CNAME</code> for <code>Type</code> and settings for <code>HealthCheckConfig</code>.
     * If you do, the request will fail with an <code>InvalidInput</code> error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>SRV</b>
     * </p>
     * <p>
     * Route 53 returns the value for an SRV record. The value for an SRV record uses the following values:
     * </p>
     * <p>
     * <code>priority weight port service-hostname</code>
     * </p>
     * <p>
     * Note the following about the values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The values of <code>priority</code> and <code>weight</code> are both set to <code>1</code> and can't be changed.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>port</code> comes from the value that you specify for the <code>AWS_INSTANCE_PORT</code>
     * attribute when you submit a <a>RegisterInstance</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>service-hostname</code> is a concatenation of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value that you specify for <code>InstanceId</code> when you register an instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name of the service.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name of the namespace.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, if the value of <code>InstanceId</code> is <code>test</code>, the name of the service is
     * <code>backend</code>, and the name of the namespace is <code>example.com</code>, the value of
     * <code>service-hostname</code> is:
     * </p>
     * <p>
     * <code>test.backend.example.com</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify settings for an SRV record and if you specify values for <code>AWS_INSTANCE_IPV4</code>,
     * <code>AWS_INSTANCE_IPV6</code>, or both in the <code>RegisterInstance</code> request, AWS Cloud Map automatically
     * creates <code>A</code> and/or <code>AAAA</code> records that have the same name as the value of
     * <code>service-hostname</code> in the SRV record. You can ignore these records.
     * </p>
     * 
     * @param type
     *        The type of the resource, which indicates the type of value that Route 53 returns in response to DNS
     *        queries.</p>
     *        <p>
     *        Note the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>A, AAAA, and SRV records:</b> You can specify settings for a maximum of one A, one AAAA, and one SRV
     *        record. You can specify them in any combination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CNAME records:</b> If you specify <code>CNAME</code> for <code>Type</code>, you can't define any other
     *        records. This is a limitation of DNS: you can't create a CNAME record and any other type of record that
     *        has the same name as a CNAME record.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Alias records:</b> If you want AWS Cloud Map to create a Route 53 alias record when you register an
     *        instance, specify <code>A</code> or <code>AAAA</code> for <code>Type</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>All records:</b> You specify settings other than <code>TTL</code> and <code>Type</code> when you
     *        register an instance.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following values are supported:
     *        </p>
     *        <p>
     *        <b>A</b>
     *        </p>
     *        <p>
     *        Route 53 returns the IP address of the resource in IPv4 format, such as 192.0.2.44.
     *        </p>
     *        <p>
     *        <b>AAAA</b>
     *        </p>
     *        <p>
     *        Route 53 returns the IP address of the resource in IPv6 format, such as
     *        2001:0db8:85a3:0000:0000:abcd:0001:2345.
     *        </p>
     *        <p>
     *        <b>CNAME</b>
     *        </p>
     *        <p>
     *        Route 53 returns the domain name of the resource, such as www.example.com. Note the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You specify the domain name that you want to route traffic to when you register an instance. For more
     *        information, see <a>RegisterInstanceRequest$Attributes</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You must specify <code>WEIGHTED</code> for the value of <code>RoutingPolicy</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can't specify both <code>CNAME</code> for <code>Type</code> and settings for
     *        <code>HealthCheckConfig</code>. If you do, the request will fail with an <code>InvalidInput</code> error.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>SRV</b>
     *        </p>
     *        <p>
     *        Route 53 returns the value for an SRV record. The value for an SRV record uses the following values:
     *        </p>
     *        <p>
     *        <code>priority weight port service-hostname</code>
     *        </p>
     *        <p>
     *        Note the following about the values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The values of <code>priority</code> and <code>weight</code> are both set to <code>1</code> and can't be
     *        changed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The value of <code>port</code> comes from the value that you specify for the
     *        <code>AWS_INSTANCE_PORT</code> attribute when you submit a <a>RegisterInstance</a> request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The value of <code>service-hostname</code> is a concatenation of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The value that you specify for <code>InstanceId</code> when you register an instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The name of the service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The name of the namespace.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, if the value of <code>InstanceId</code> is <code>test</code>, the name of the service is
     *        <code>backend</code>, and the name of the namespace is <code>example.com</code>, the value of
     *        <code>service-hostname</code> is:
     *        </p>
     *        <p>
     *        <code>test.backend.example.com</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you specify settings for an SRV record and if you specify values for <code>AWS_INSTANCE_IPV4</code>,
     *        <code>AWS_INSTANCE_IPV6</code>, or both in the <code>RegisterInstance</code> request, AWS Cloud Map
     *        automatically creates <code>A</code> and/or <code>AAAA</code> records that have the same name as the value
     *        of <code>service-hostname</code> in the SRV record. You can ignore these records.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecordType
     */

    public DnsRecord withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the resource, which indicates the type of value that Route 53 returns in response to DNS queries.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>A, AAAA, and SRV records:</b> You can specify settings for a maximum of one A, one AAAA, and one SRV record.
     * You can specify them in any combination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CNAME records:</b> If you specify <code>CNAME</code> for <code>Type</code>, you can't define any other
     * records. This is a limitation of DNS: you can't create a CNAME record and any other type of record that has the
     * same name as a CNAME record.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Alias records:</b> If you want AWS Cloud Map to create a Route 53 alias record when you register an instance,
     * specify <code>A</code> or <code>AAAA</code> for <code>Type</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>All records:</b> You specify settings other than <code>TTL</code> and <code>Type</code> when you register an
     * instance.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following values are supported:
     * </p>
     * <p>
     * <b>A</b>
     * </p>
     * <p>
     * Route 53 returns the IP address of the resource in IPv4 format, such as 192.0.2.44.
     * </p>
     * <p>
     * <b>AAAA</b>
     * </p>
     * <p>
     * Route 53 returns the IP address of the resource in IPv6 format, such as 2001:0db8:85a3:0000:0000:abcd:0001:2345.
     * </p>
     * <p>
     * <b>CNAME</b>
     * </p>
     * <p>
     * Route 53 returns the domain name of the resource, such as www.example.com. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You specify the domain name that you want to route traffic to when you register an instance. For more
     * information, see <a>RegisterInstanceRequest$Attributes</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must specify <code>WEIGHTED</code> for the value of <code>RoutingPolicy</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't specify both <code>CNAME</code> for <code>Type</code> and settings for <code>HealthCheckConfig</code>.
     * If you do, the request will fail with an <code>InvalidInput</code> error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>SRV</b>
     * </p>
     * <p>
     * Route 53 returns the value for an SRV record. The value for an SRV record uses the following values:
     * </p>
     * <p>
     * <code>priority weight port service-hostname</code>
     * </p>
     * <p>
     * Note the following about the values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The values of <code>priority</code> and <code>weight</code> are both set to <code>1</code> and can't be changed.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>port</code> comes from the value that you specify for the <code>AWS_INSTANCE_PORT</code>
     * attribute when you submit a <a>RegisterInstance</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * The value of <code>service-hostname</code> is a concatenation of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The value that you specify for <code>InstanceId</code> when you register an instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name of the service.
     * </p>
     * </li>
     * <li>
     * <p>
     * The name of the namespace.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, if the value of <code>InstanceId</code> is <code>test</code>, the name of the service is
     * <code>backend</code>, and the name of the namespace is <code>example.com</code>, the value of
     * <code>service-hostname</code> is:
     * </p>
     * <p>
     * <code>test.backend.example.com</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you specify settings for an SRV record and if you specify values for <code>AWS_INSTANCE_IPV4</code>,
     * <code>AWS_INSTANCE_IPV6</code>, or both in the <code>RegisterInstance</code> request, AWS Cloud Map automatically
     * creates <code>A</code> and/or <code>AAAA</code> records that have the same name as the value of
     * <code>service-hostname</code> in the SRV record. You can ignore these records.
     * </p>
     * 
     * @param type
     *        The type of the resource, which indicates the type of value that Route 53 returns in response to DNS
     *        queries.</p>
     *        <p>
     *        Note the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>A, AAAA, and SRV records:</b> You can specify settings for a maximum of one A, one AAAA, and one SRV
     *        record. You can specify them in any combination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CNAME records:</b> If you specify <code>CNAME</code> for <code>Type</code>, you can't define any other
     *        records. This is a limitation of DNS: you can't create a CNAME record and any other type of record that
     *        has the same name as a CNAME record.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Alias records:</b> If you want AWS Cloud Map to create a Route 53 alias record when you register an
     *        instance, specify <code>A</code> or <code>AAAA</code> for <code>Type</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>All records:</b> You specify settings other than <code>TTL</code> and <code>Type</code> when you
     *        register an instance.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following values are supported:
     *        </p>
     *        <p>
     *        <b>A</b>
     *        </p>
     *        <p>
     *        Route 53 returns the IP address of the resource in IPv4 format, such as 192.0.2.44.
     *        </p>
     *        <p>
     *        <b>AAAA</b>
     *        </p>
     *        <p>
     *        Route 53 returns the IP address of the resource in IPv6 format, such as
     *        2001:0db8:85a3:0000:0000:abcd:0001:2345.
     *        </p>
     *        <p>
     *        <b>CNAME</b>
     *        </p>
     *        <p>
     *        Route 53 returns the domain name of the resource, such as www.example.com. Note the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You specify the domain name that you want to route traffic to when you register an instance. For more
     *        information, see <a>RegisterInstanceRequest$Attributes</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You must specify <code>WEIGHTED</code> for the value of <code>RoutingPolicy</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        You can't specify both <code>CNAME</code> for <code>Type</code> and settings for
     *        <code>HealthCheckConfig</code>. If you do, the request will fail with an <code>InvalidInput</code> error.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>SRV</b>
     *        </p>
     *        <p>
     *        Route 53 returns the value for an SRV record. The value for an SRV record uses the following values:
     *        </p>
     *        <p>
     *        <code>priority weight port service-hostname</code>
     *        </p>
     *        <p>
     *        Note the following about the values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The values of <code>priority</code> and <code>weight</code> are both set to <code>1</code> and can't be
     *        changed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The value of <code>port</code> comes from the value that you specify for the
     *        <code>AWS_INSTANCE_PORT</code> attribute when you submit a <a>RegisterInstance</a> request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The value of <code>service-hostname</code> is a concatenation of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The value that you specify for <code>InstanceId</code> when you register an instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The name of the service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The name of the namespace.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, if the value of <code>InstanceId</code> is <code>test</code>, the name of the service is
     *        <code>backend</code>, and the name of the namespace is <code>example.com</code>, the value of
     *        <code>service-hostname</code> is:
     *        </p>
     *        <p>
     *        <code>test.backend.example.com</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you specify settings for an SRV record and if you specify values for <code>AWS_INSTANCE_IPV4</code>,
     *        <code>AWS_INSTANCE_IPV6</code>, or both in the <code>RegisterInstance</code> request, AWS Cloud Map
     *        automatically creates <code>A</code> and/or <code>AAAA</code> records that have the same name as the value
     *        of <code>service-hostname</code> in the SRV record. You can ignore these records.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecordType
     */

    public DnsRecord withType(RecordType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, that you want DNS resolvers to cache the settings for this record.
     * </p>
     * <note>
     * <p>
     * Alias records don't include a TTL because Route 53 uses the TTL for the AWS resource that an alias record routes
     * traffic to. If you include the <code>AWS_ALIAS_DNS_NAME</code> attribute when you submit a
     * <a>RegisterInstance</a> request, the <code>TTL</code> value is ignored. Always specify a TTL for the service; you
     * can use a service to register instances that create either alias or non-alias records.
     * </p>
     * </note>
     * 
     * @param tTL
     *        The amount of time, in seconds, that you want DNS resolvers to cache the settings for this record.</p>
     *        <note>
     *        <p>
     *        Alias records don't include a TTL because Route 53 uses the TTL for the AWS resource that an alias record
     *        routes traffic to. If you include the <code>AWS_ALIAS_DNS_NAME</code> attribute when you submit a
     *        <a>RegisterInstance</a> request, the <code>TTL</code> value is ignored. Always specify a TTL for the
     *        service; you can use a service to register instances that create either alias or non-alias records.
     *        </p>
     */

    public void setTTL(Long tTL) {
        this.tTL = tTL;
    }

    /**
     * <p>
     * The amount of time, in seconds, that you want DNS resolvers to cache the settings for this record.
     * </p>
     * <note>
     * <p>
     * Alias records don't include a TTL because Route 53 uses the TTL for the AWS resource that an alias record routes
     * traffic to. If you include the <code>AWS_ALIAS_DNS_NAME</code> attribute when you submit a
     * <a>RegisterInstance</a> request, the <code>TTL</code> value is ignored. Always specify a TTL for the service; you
     * can use a service to register instances that create either alias or non-alias records.
     * </p>
     * </note>
     * 
     * @return The amount of time, in seconds, that you want DNS resolvers to cache the settings for this record.</p>
     *         <note>
     *         <p>
     *         Alias records don't include a TTL because Route 53 uses the TTL for the AWS resource that an alias record
     *         routes traffic to. If you include the <code>AWS_ALIAS_DNS_NAME</code> attribute when you submit a
     *         <a>RegisterInstance</a> request, the <code>TTL</code> value is ignored. Always specify a TTL for the
     *         service; you can use a service to register instances that create either alias or non-alias records.
     *         </p>
     */

    public Long getTTL() {
        return this.tTL;
    }

    /**
     * <p>
     * The amount of time, in seconds, that you want DNS resolvers to cache the settings for this record.
     * </p>
     * <note>
     * <p>
     * Alias records don't include a TTL because Route 53 uses the TTL for the AWS resource that an alias record routes
     * traffic to. If you include the <code>AWS_ALIAS_DNS_NAME</code> attribute when you submit a
     * <a>RegisterInstance</a> request, the <code>TTL</code> value is ignored. Always specify a TTL for the service; you
     * can use a service to register instances that create either alias or non-alias records.
     * </p>
     * </note>
     * 
     * @param tTL
     *        The amount of time, in seconds, that you want DNS resolvers to cache the settings for this record.</p>
     *        <note>
     *        <p>
     *        Alias records don't include a TTL because Route 53 uses the TTL for the AWS resource that an alias record
     *        routes traffic to. If you include the <code>AWS_ALIAS_DNS_NAME</code> attribute when you submit a
     *        <a>RegisterInstance</a> request, the <code>TTL</code> value is ignored. Always specify a TTL for the
     *        service; you can use a service to register instances that create either alias or non-alias records.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DnsRecord withTTL(Long tTL) {
        setTTL(tTL);
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
        if (getTTL() != null)
            sb.append("TTL: ").append(getTTL());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DnsRecord == false)
            return false;
        DnsRecord other = (DnsRecord) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getTTL() == null ^ this.getTTL() == null)
            return false;
        if (other.getTTL() != null && other.getTTL().equals(this.getTTL()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getTTL() == null) ? 0 : getTTL().hashCode());
        return hashCode;
    }

    @Override
    public DnsRecord clone() {
        try {
            return (DnsRecord) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicediscovery.model.transform.DnsRecordMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
