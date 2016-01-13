/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * <i>Alias resource record sets only:</i> Information about the CloudFront
 * distribution, ELB load balancer, Amazon S3 bucket, or Amazon Route 53
 * resource record set to which you are routing traffic.
 * </p>
 * <p>
 * If you're creating resource record sets for a private hosted zone, note the
 * following:
 * </p>
 * <ul>
 * <li>You can create alias resource record sets only for Amazon Route 53
 * resource record sets in the same private hosted zone. Creating alias resource
 * record sets for CloudFront distributions, ELB load balancers, and Amazon S3
 * buckets is not supported.</li>
 * <li>You can't create alias resource record sets for failover, geolocation, or
 * latency resource record sets in a private hosted zone.</li>
 * </ul>
 * <p>
 * For more information and an example, see <a href=
 * "http://docs.aws.amazon.com/Route53/latest/APIReference/CreateAliasRRSAPI.html"
 * >Example: Creating Alias Resource Record Sets</a> in the <i>Amazon Route 53
 * API Reference</i>.
 * </p>
 */
public class AliasTarget implements Serializable, Cloneable {

    /**
     * <p>
     * <i>Alias resource record sets only:</i> The value you use depends on
     * where you want to route queries:
     * </p>
     * <ul>
     * <li><b>A CloudFront distribution:</b> Specify <code>Z2FDTNDATAQYW2</code>
     * .</li>
     * <li>An ELB load balancer: Specify the value of the hosted zone ID for the
     * load balancer. You can get the hosted zone ID by using the AWS Management
     * Console, the ELB API, or the AWS CLI. Use the same method to get values
     * for <code>HostedZoneId</code> and <code>DNSName</code>. If you get one
     * value from the console and the other value from the API or the CLI,
     * creating the resource record set will fail.</li>
     * <li><b>An Amazon S3 bucket that is configured as a static website:</b>
     * Specify the hosted zone ID for the Amazon S3 website endpoint in which
     * you created the bucket. For more information about valid values, see the
     * table <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region"
     * >Amazon Simple Storage Service (S3) Website Endpoints</a> in the
     * <i>Amazon Web Services General Reference</i>.</li>
     * <li><b>Another Amazon Route 53 resource record set in your hosted
     * zone:</b> Specify the hosted zone ID of your hosted zone. (An alias
     * resource record set cannot reference a resource record set in a different
     * hosted zone.)</li>
     * </ul>
     * <p>
     * For more information and an example, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/APIReference/CreateAliasRRSAPI.html"
     * >Example: Creating Alias Resource Record Sets</a> in the <i>Amazon Route
     * 53 API Reference</i>.
     * </p>
     */
    private String hostedZoneId;
    /**
     * <p>
     * <i>Alias resource record sets only:</i> The external DNS name associated
     * with the AWS Resource. The value that you specify depends on where you
     * want to route queries:
     * </p>
     * <ul>
     * <li><b>A CloudFront distribution:</b> Specify the domain name that
     * CloudFront assigned when you created your distribution. Your CloudFront
     * distribution must include an alternate domain name that matches the name
     * of the resource record set. For example, if the name of the resource
     * record set is <code>acme.example.com</code>, your CloudFront distribution
     * must include <code>acme.example.com</code> as one of the alternate domain
     * names. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/CNAMEs.html"
     * >Using Alternate Domain Names (CNAMEs)</a> in the <i>Amazon CloudFront
     * Developer Guide</i>.</li>
     * <li><b>An ELB load balancer:</b> Specify the DNS name associated with the
     * load balancer. You can get the DNS name by using the AWS Management
     * Console, the ELB API, or the AWS CLI. Use the same method to get values
     * for <code>HostedZoneId</code> and <code>DNSName</code>. If you get one
     * value from the console and the other value from the API or the CLI,
     * creating the resource record set will fail.</li>
     * <li><b>An Amazon S3 bucket that is configured as a static website:</b>
     * Specify the domain name of the Amazon S3 website endpoint in which you
     * created the bucket; for example,
     * <code>s3-website-us-east-1.amazonaws.com</code>. For more information
     * about valid values, see the table <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region"
     * >Amazon Simple Storage Service (S3) Website Endpoints</a> in the
     * <i>Amazon Web Services General Reference</i>. For more information about
     * using Amazon S3 buckets for websites, see <a href=
     * "http://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html"
     * >Hosting a Static Website on Amazon S3</a> in the <i>Amazon Simple
     * Storage Service Developer Guide</i>.</li>
     * <li/>
     * </ul>
     * <p>
     * For more information and an example, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/APIReference/CreateAliasRRSAPI.html"
     * >Example: Creating Alias Resource Record Sets</a> in the <i>Amazon Route
     * 53 API Reference</i>.
     * </p>
     */
    private String dNSName;
    /**
     * <p>
     * <i>Alias resource record sets only:</i> If you set the value of
     * <code>EvaluateTargetHealth</code> to <code>true</code> for the resource
     * record set or sets in an alias, weighted alias, latency alias, or
     * failover alias resource record set, and if you specify a value for
     * <code>HealthCheckId</code> for every resource record set that is
     * referenced by these alias resource record sets, the alias resource record
     * sets inherit the health of the referenced resource record sets.
     * </p>
     * <p>
     * In this configuration, when Amazon Route 53 receives a DNS query for an
     * alias resource record set:
     * </p>
     * <ol>
     * <li>Amazon Route 53 looks at the resource record sets that are referenced
     * by the alias resource record sets to determine which health checks
     * they're using.</li>
     * <li>Amazon Route 53 checks the current status of each health check.
     * (Amazon Route 53 periodically checks the health of the endpoint that is
     * specified in a health check; it doesn't perform the health check when the
     * DNS query arrives.)</li>
     * <li>Based on the status of the health checks, Amazon Route 53 determines
     * which resource record sets are healthy. Unhealthy resource record sets
     * are immediately removed from consideration. In addition, if all of the
     * resource record sets that are referenced by an alias resource record set
     * are unhealthy, that alias resource record set also is immediately removed
     * from consideration.</li>
     * <li>Based on the configuration of the alias resource record sets
     * (weighted alias or latency alias, for example) and the configuration of
     * the resource record sets that they reference, Amazon Route 53 chooses a
     * resource record set from the healthy resource record sets, and responds
     * to the query.</li>
     * </ol>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>You cannot set EvaluateTargetHealth to true when the alias target is
     * a CloudFront distribution.</li>
     * <li>If the AWS resource that you specify in <code>AliasTarget</code> is a
     * resource record set or a group of resource record sets (for example, a
     * group of weighted resource record sets), but it is not another alias
     * resource record set, we recommend that you associate a health check with
     * all of the resource record sets in the alias target. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html#dns-failover-complex-configs-hc-omitting"
     * >What Happens When You Omit Health Checks?</a> in the <i>Amazon Route 53
     * Developer Guide</i>.</li>
     * <li>If you specify an ELB load balancer in <code>AliasTarget</code>,
     * Elastic Load Balancing routes queries only to the healthy Amazon EC2
     * instances that are registered with the load balancer. If no Amazon EC2
     * instances are healthy or if the load balancer itself is unhealthy, and if
     * <code>EvaluateTargetHealth</code> is <code>true</code> for the
     * corresponding alias resource record set, Amazon Route 53 routes queries
     * to other resources.</li>
     * <li>When you create a load balancer, you configure settings for Elastic
     * Load Balancing health checks; they're not Amazon Route 53 health checks,
     * but they perform a similar function. Do not create Amazon Route 53 health
     * checks for the Amazon EC2 instances that you register with an ELB load
     * balancer. For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html"
     * >How Health Checks Work in More Complex Amazon Route 53
     * Configurations</a> in the <i>Amazon Route 53 Developer Guide</i>.</li>
     * </ul>
     * <p>
     * We recommend that you set <code>EvaluateTargetHealth</code> to
     * <code>true</code> only when you have enough idle capacity to handle the
     * failure of one or more endpoints.
     * </p>
     * <p>
     * For more information and examples, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html"
     * >Amazon Route 53 Health Checks and DNS Failover</a> in the <i>Amazon
     * Route 53 Developer Guide</i>.
     * </p>
     */
    private Boolean evaluateTargetHealth;

    /**
     * Default constructor for AliasTarget object. Callers should use the setter
     * or fluent setter (with...) methods to initialize the object after
     * creating it.
     */
    public AliasTarget() {
    }

    /**
     * Constructs a new AliasTarget object. Callers should use the setter or
     * fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param hostedZoneId
     *        Alias resource record sets only:</i> The value you use depends on
     *        where you want to route queries:</p>
     *        <ul>
     *        <li><b>A CloudFront distribution:</b> Specify
     *        <code>Z2FDTNDATAQYW2</code>.</li>
     *        <li>An ELB load balancer: Specify the value of the hosted zone ID
     *        for the load balancer. You can get the hosted zone ID by using the
     *        AWS Management Console, the ELB API, or the AWS CLI. Use the same
     *        method to get values for <code>HostedZoneId</code> and
     *        <code>DNSName</code>. If you get one value from the console and
     *        the other value from the API or the CLI, creating the resource
     *        record set will fail.</li>
     *        <li><b>An Amazon S3 bucket that is configured as a static
     *        website:</b> Specify the hosted zone ID for the Amazon S3 website
     *        endpoint in which you created the bucket. For more information
     *        about valid values, see the table <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region"
     *        >Amazon Simple Storage Service (S3) Website Endpoints</a> in the
     *        <i>Amazon Web Services General Reference</i>.</li>
     *        <li><b>Another Amazon Route 53 resource record set in your hosted
     *        zone:</b> Specify the hosted zone ID of your hosted zone. (An
     *        alias resource record set cannot reference a resource record set
     *        in a different hosted zone.)</li>
     *        </ul>
     *        <p>
     *        For more information and an example, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/APIReference/CreateAliasRRSAPI.html"
     *        >Example: Creating Alias Resource Record Sets</a> in the <i>Amazon
     *        Route 53 API Reference
     * @param dNSName
     *        Alias resource record sets only:</i> The external DNS name
     *        associated with the AWS Resource. The value that you specify
     *        depends on where you want to route queries:
     *        </p>
     *        <ul>
     *        <li><b>A CloudFront distribution:</b> Specify the domain name that
     *        CloudFront assigned when you created your distribution. Your
     *        CloudFront distribution must include an alternate domain name that
     *        matches the name of the resource record set. For example, if the
     *        name of the resource record set is <code>acme.example.com</code>,
     *        your CloudFront distribution must include
     *        <code>acme.example.com</code> as one of the alternate domain
     *        names. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/CNAMEs.html"
     *        >Using Alternate Domain Names (CNAMEs)</a> in the <i>Amazon
     *        CloudFront Developer Guide</i>.</li>
     *        <li><b>An ELB load balancer:</b> Specify the DNS name associated
     *        with the load balancer. You can get the DNS name by using the AWS
     *        Management Console, the ELB API, or the AWS CLI. Use the same
     *        method to get values for <code>HostedZoneId</code> and
     *        <code>DNSName</code>. If you get one value from the console and
     *        the other value from the API or the CLI, creating the resource
     *        record set will fail.</li>
     *        <li><b>An Amazon S3 bucket that is configured as a static
     *        website:</b> Specify the domain name of the Amazon S3 website
     *        endpoint in which you created the bucket; for example,
     *        <code>s3-website-us-east-1.amazonaws.com</code>. For more
     *        information about valid values, see the table <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region"
     *        >Amazon Simple Storage Service (S3) Website Endpoints</a> in the
     *        <i>Amazon Web Services General Reference</i>. For more information
     *        about using Amazon S3 buckets for websites, see <a href=
     *        "http://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html"
     *        >Hosting a Static Website on Amazon S3</a> in the <i>Amazon Simple
     *        Storage Service Developer Guide</i>.</li>
     *        <li/>
     *        </ul>
     *        <p>
     *        For more information and an example, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/APIReference/CreateAliasRRSAPI.html"
     *        >Example: Creating Alias Resource Record Sets</a> in the <i>Amazon
     *        Route 53 API Reference
     */
    public AliasTarget(String hostedZoneId, String dNSName) {
        setHostedZoneId(hostedZoneId);
        setDNSName(dNSName);
    }

    /**
     * <p>
     * <i>Alias resource record sets only:</i> The value you use depends on
     * where you want to route queries:
     * </p>
     * <ul>
     * <li><b>A CloudFront distribution:</b> Specify <code>Z2FDTNDATAQYW2</code>
     * .</li>
     * <li>An ELB load balancer: Specify the value of the hosted zone ID for the
     * load balancer. You can get the hosted zone ID by using the AWS Management
     * Console, the ELB API, or the AWS CLI. Use the same method to get values
     * for <code>HostedZoneId</code> and <code>DNSName</code>. If you get one
     * value from the console and the other value from the API or the CLI,
     * creating the resource record set will fail.</li>
     * <li><b>An Amazon S3 bucket that is configured as a static website:</b>
     * Specify the hosted zone ID for the Amazon S3 website endpoint in which
     * you created the bucket. For more information about valid values, see the
     * table <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region"
     * >Amazon Simple Storage Service (S3) Website Endpoints</a> in the
     * <i>Amazon Web Services General Reference</i>.</li>
     * <li><b>Another Amazon Route 53 resource record set in your hosted
     * zone:</b> Specify the hosted zone ID of your hosted zone. (An alias
     * resource record set cannot reference a resource record set in a different
     * hosted zone.)</li>
     * </ul>
     * <p>
     * For more information and an example, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/APIReference/CreateAliasRRSAPI.html"
     * >Example: Creating Alias Resource Record Sets</a> in the <i>Amazon Route
     * 53 API Reference</i>.
     * </p>
     * 
     * @param hostedZoneId
     *        Alias resource record sets only:</i> The value you use depends on
     *        where you want to route queries:</p>
     *        <ul>
     *        <li><b>A CloudFront distribution:</b> Specify
     *        <code>Z2FDTNDATAQYW2</code>.</li>
     *        <li>An ELB load balancer: Specify the value of the hosted zone ID
     *        for the load balancer. You can get the hosted zone ID by using the
     *        AWS Management Console, the ELB API, or the AWS CLI. Use the same
     *        method to get values for <code>HostedZoneId</code> and
     *        <code>DNSName</code>. If you get one value from the console and
     *        the other value from the API or the CLI, creating the resource
     *        record set will fail.</li>
     *        <li><b>An Amazon S3 bucket that is configured as a static
     *        website:</b> Specify the hosted zone ID for the Amazon S3 website
     *        endpoint in which you created the bucket. For more information
     *        about valid values, see the table <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region"
     *        >Amazon Simple Storage Service (S3) Website Endpoints</a> in the
     *        <i>Amazon Web Services General Reference</i>.</li>
     *        <li><b>Another Amazon Route 53 resource record set in your hosted
     *        zone:</b> Specify the hosted zone ID of your hosted zone. (An
     *        alias resource record set cannot reference a resource record set
     *        in a different hosted zone.)</li>
     *        </ul>
     *        <p>
     *        For more information and an example, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/APIReference/CreateAliasRRSAPI.html"
     *        >Example: Creating Alias Resource Record Sets</a> in the <i>Amazon
     *        Route 53 API Reference
     */
    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * <i>Alias resource record sets only:</i> The value you use depends on
     * where you want to route queries:
     * </p>
     * <ul>
     * <li><b>A CloudFront distribution:</b> Specify <code>Z2FDTNDATAQYW2</code>
     * .</li>
     * <li>An ELB load balancer: Specify the value of the hosted zone ID for the
     * load balancer. You can get the hosted zone ID by using the AWS Management
     * Console, the ELB API, or the AWS CLI. Use the same method to get values
     * for <code>HostedZoneId</code> and <code>DNSName</code>. If you get one
     * value from the console and the other value from the API or the CLI,
     * creating the resource record set will fail.</li>
     * <li><b>An Amazon S3 bucket that is configured as a static website:</b>
     * Specify the hosted zone ID for the Amazon S3 website endpoint in which
     * you created the bucket. For more information about valid values, see the
     * table <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region"
     * >Amazon Simple Storage Service (S3) Website Endpoints</a> in the
     * <i>Amazon Web Services General Reference</i>.</li>
     * <li><b>Another Amazon Route 53 resource record set in your hosted
     * zone:</b> Specify the hosted zone ID of your hosted zone. (An alias
     * resource record set cannot reference a resource record set in a different
     * hosted zone.)</li>
     * </ul>
     * <p>
     * For more information and an example, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/APIReference/CreateAliasRRSAPI.html"
     * >Example: Creating Alias Resource Record Sets</a> in the <i>Amazon Route
     * 53 API Reference</i>.
     * </p>
     * 
     * @return Alias resource record sets only:</i> The value you use depends on
     *         where you want to route queries:</p>
     *         <ul>
     *         <li><b>A CloudFront distribution:</b> Specify
     *         <code>Z2FDTNDATAQYW2</code>.</li>
     *         <li>An ELB load balancer: Specify the value of the hosted zone ID
     *         for the load balancer. You can get the hosted zone ID by using
     *         the AWS Management Console, the ELB API, or the AWS CLI. Use the
     *         same method to get values for <code>HostedZoneId</code> and
     *         <code>DNSName</code>. If you get one value from the console and
     *         the other value from the API or the CLI, creating the resource
     *         record set will fail.</li>
     *         <li><b>An Amazon S3 bucket that is configured as a static
     *         website:</b> Specify the hosted zone ID for the Amazon S3 website
     *         endpoint in which you created the bucket. For more information
     *         about valid values, see the table <a href=
     *         "http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region"
     *         >Amazon Simple Storage Service (S3) Website Endpoints</a> in the
     *         <i>Amazon Web Services General Reference</i>.</li>
     *         <li><b>Another Amazon Route 53 resource record set in your hosted
     *         zone:</b> Specify the hosted zone ID of your hosted zone. (An
     *         alias resource record set cannot reference a resource record set
     *         in a different hosted zone.)</li>
     *         </ul>
     *         <p>
     *         For more information and an example, see <a href=
     *         "http://docs.aws.amazon.com/Route53/latest/APIReference/CreateAliasRRSAPI.html"
     *         >Example: Creating Alias Resource Record Sets</a> in the
     *         <i>Amazon Route 53 API Reference
     */
    public String getHostedZoneId() {
        return this.hostedZoneId;
    }

    /**
     * <p>
     * <i>Alias resource record sets only:</i> The value you use depends on
     * where you want to route queries:
     * </p>
     * <ul>
     * <li><b>A CloudFront distribution:</b> Specify <code>Z2FDTNDATAQYW2</code>
     * .</li>
     * <li>An ELB load balancer: Specify the value of the hosted zone ID for the
     * load balancer. You can get the hosted zone ID by using the AWS Management
     * Console, the ELB API, or the AWS CLI. Use the same method to get values
     * for <code>HostedZoneId</code> and <code>DNSName</code>. If you get one
     * value from the console and the other value from the API or the CLI,
     * creating the resource record set will fail.</li>
     * <li><b>An Amazon S3 bucket that is configured as a static website:</b>
     * Specify the hosted zone ID for the Amazon S3 website endpoint in which
     * you created the bucket. For more information about valid values, see the
     * table <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region"
     * >Amazon Simple Storage Service (S3) Website Endpoints</a> in the
     * <i>Amazon Web Services General Reference</i>.</li>
     * <li><b>Another Amazon Route 53 resource record set in your hosted
     * zone:</b> Specify the hosted zone ID of your hosted zone. (An alias
     * resource record set cannot reference a resource record set in a different
     * hosted zone.)</li>
     * </ul>
     * <p>
     * For more information and an example, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/APIReference/CreateAliasRRSAPI.html"
     * >Example: Creating Alias Resource Record Sets</a> in the <i>Amazon Route
     * 53 API Reference</i>.
     * </p>
     * 
     * @param hostedZoneId
     *        Alias resource record sets only:</i> The value you use depends on
     *        where you want to route queries:</p>
     *        <ul>
     *        <li><b>A CloudFront distribution:</b> Specify
     *        <code>Z2FDTNDATAQYW2</code>.</li>
     *        <li>An ELB load balancer: Specify the value of the hosted zone ID
     *        for the load balancer. You can get the hosted zone ID by using the
     *        AWS Management Console, the ELB API, or the AWS CLI. Use the same
     *        method to get values for <code>HostedZoneId</code> and
     *        <code>DNSName</code>. If you get one value from the console and
     *        the other value from the API or the CLI, creating the resource
     *        record set will fail.</li>
     *        <li><b>An Amazon S3 bucket that is configured as a static
     *        website:</b> Specify the hosted zone ID for the Amazon S3 website
     *        endpoint in which you created the bucket. For more information
     *        about valid values, see the table <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region"
     *        >Amazon Simple Storage Service (S3) Website Endpoints</a> in the
     *        <i>Amazon Web Services General Reference</i>.</li>
     *        <li><b>Another Amazon Route 53 resource record set in your hosted
     *        zone:</b> Specify the hosted zone ID of your hosted zone. (An
     *        alias resource record set cannot reference a resource record set
     *        in a different hosted zone.)</li>
     *        </ul>
     *        <p>
     *        For more information and an example, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/APIReference/CreateAliasRRSAPI.html"
     *        >Example: Creating Alias Resource Record Sets</a> in the <i>Amazon
     *        Route 53 API Reference
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public AliasTarget withHostedZoneId(String hostedZoneId) {
        setHostedZoneId(hostedZoneId);
        return this;
    }

    /**
     * <p>
     * <i>Alias resource record sets only:</i> The external DNS name associated
     * with the AWS Resource. The value that you specify depends on where you
     * want to route queries:
     * </p>
     * <ul>
     * <li><b>A CloudFront distribution:</b> Specify the domain name that
     * CloudFront assigned when you created your distribution. Your CloudFront
     * distribution must include an alternate domain name that matches the name
     * of the resource record set. For example, if the name of the resource
     * record set is <code>acme.example.com</code>, your CloudFront distribution
     * must include <code>acme.example.com</code> as one of the alternate domain
     * names. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/CNAMEs.html"
     * >Using Alternate Domain Names (CNAMEs)</a> in the <i>Amazon CloudFront
     * Developer Guide</i>.</li>
     * <li><b>An ELB load balancer:</b> Specify the DNS name associated with the
     * load balancer. You can get the DNS name by using the AWS Management
     * Console, the ELB API, or the AWS CLI. Use the same method to get values
     * for <code>HostedZoneId</code> and <code>DNSName</code>. If you get one
     * value from the console and the other value from the API or the CLI,
     * creating the resource record set will fail.</li>
     * <li><b>An Amazon S3 bucket that is configured as a static website:</b>
     * Specify the domain name of the Amazon S3 website endpoint in which you
     * created the bucket; for example,
     * <code>s3-website-us-east-1.amazonaws.com</code>. For more information
     * about valid values, see the table <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region"
     * >Amazon Simple Storage Service (S3) Website Endpoints</a> in the
     * <i>Amazon Web Services General Reference</i>. For more information about
     * using Amazon S3 buckets for websites, see <a href=
     * "http://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html"
     * >Hosting a Static Website on Amazon S3</a> in the <i>Amazon Simple
     * Storage Service Developer Guide</i>.</li>
     * <li/>
     * </ul>
     * <p>
     * For more information and an example, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/APIReference/CreateAliasRRSAPI.html"
     * >Example: Creating Alias Resource Record Sets</a> in the <i>Amazon Route
     * 53 API Reference</i>.
     * </p>
     * 
     * @param dNSName
     *        Alias resource record sets only:</i> The external DNS name
     *        associated with the AWS Resource. The value that you specify
     *        depends on where you want to route queries:</p>
     *        <ul>
     *        <li><b>A CloudFront distribution:</b> Specify the domain name that
     *        CloudFront assigned when you created your distribution. Your
     *        CloudFront distribution must include an alternate domain name that
     *        matches the name of the resource record set. For example, if the
     *        name of the resource record set is <code>acme.example.com</code>,
     *        your CloudFront distribution must include
     *        <code>acme.example.com</code> as one of the alternate domain
     *        names. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/CNAMEs.html"
     *        >Using Alternate Domain Names (CNAMEs)</a> in the <i>Amazon
     *        CloudFront Developer Guide</i>.</li>
     *        <li><b>An ELB load balancer:</b> Specify the DNS name associated
     *        with the load balancer. You can get the DNS name by using the AWS
     *        Management Console, the ELB API, or the AWS CLI. Use the same
     *        method to get values for <code>HostedZoneId</code> and
     *        <code>DNSName</code>. If you get one value from the console and
     *        the other value from the API or the CLI, creating the resource
     *        record set will fail.</li>
     *        <li><b>An Amazon S3 bucket that is configured as a static
     *        website:</b> Specify the domain name of the Amazon S3 website
     *        endpoint in which you created the bucket; for example,
     *        <code>s3-website-us-east-1.amazonaws.com</code>. For more
     *        information about valid values, see the table <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region"
     *        >Amazon Simple Storage Service (S3) Website Endpoints</a> in the
     *        <i>Amazon Web Services General Reference</i>. For more information
     *        about using Amazon S3 buckets for websites, see <a href=
     *        "http://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html"
     *        >Hosting a Static Website on Amazon S3</a> in the <i>Amazon Simple
     *        Storage Service Developer Guide</i>.</li>
     *        <li/>
     *        </ul>
     *        <p>
     *        For more information and an example, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/APIReference/CreateAliasRRSAPI.html"
     *        >Example: Creating Alias Resource Record Sets</a> in the <i>Amazon
     *        Route 53 API Reference
     */
    public void setDNSName(String dNSName) {
        this.dNSName = dNSName;
    }

    /**
     * <p>
     * <i>Alias resource record sets only:</i> The external DNS name associated
     * with the AWS Resource. The value that you specify depends on where you
     * want to route queries:
     * </p>
     * <ul>
     * <li><b>A CloudFront distribution:</b> Specify the domain name that
     * CloudFront assigned when you created your distribution. Your CloudFront
     * distribution must include an alternate domain name that matches the name
     * of the resource record set. For example, if the name of the resource
     * record set is <code>acme.example.com</code>, your CloudFront distribution
     * must include <code>acme.example.com</code> as one of the alternate domain
     * names. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/CNAMEs.html"
     * >Using Alternate Domain Names (CNAMEs)</a> in the <i>Amazon CloudFront
     * Developer Guide</i>.</li>
     * <li><b>An ELB load balancer:</b> Specify the DNS name associated with the
     * load balancer. You can get the DNS name by using the AWS Management
     * Console, the ELB API, or the AWS CLI. Use the same method to get values
     * for <code>HostedZoneId</code> and <code>DNSName</code>. If you get one
     * value from the console and the other value from the API or the CLI,
     * creating the resource record set will fail.</li>
     * <li><b>An Amazon S3 bucket that is configured as a static website:</b>
     * Specify the domain name of the Amazon S3 website endpoint in which you
     * created the bucket; for example,
     * <code>s3-website-us-east-1.amazonaws.com</code>. For more information
     * about valid values, see the table <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region"
     * >Amazon Simple Storage Service (S3) Website Endpoints</a> in the
     * <i>Amazon Web Services General Reference</i>. For more information about
     * using Amazon S3 buckets for websites, see <a href=
     * "http://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html"
     * >Hosting a Static Website on Amazon S3</a> in the <i>Amazon Simple
     * Storage Service Developer Guide</i>.</li>
     * <li/>
     * </ul>
     * <p>
     * For more information and an example, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/APIReference/CreateAliasRRSAPI.html"
     * >Example: Creating Alias Resource Record Sets</a> in the <i>Amazon Route
     * 53 API Reference</i>.
     * </p>
     * 
     * @return Alias resource record sets only:</i> The external DNS name
     *         associated with the AWS Resource. The value that you specify
     *         depends on where you want to route queries:</p>
     *         <ul>
     *         <li><b>A CloudFront distribution:</b> Specify the domain name
     *         that CloudFront assigned when you created your distribution. Your
     *         CloudFront distribution must include an alternate domain name
     *         that matches the name of the resource record set. For example, if
     *         the name of the resource record set is
     *         <code>acme.example.com</code>, your CloudFront distribution must
     *         include <code>acme.example.com</code> as one of the alternate
     *         domain names. For more information, see <a href=
     *         "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/CNAMEs.html"
     *         >Using Alternate Domain Names (CNAMEs)</a> in the <i>Amazon
     *         CloudFront Developer Guide</i>.</li>
     *         <li><b>An ELB load balancer:</b> Specify the DNS name associated
     *         with the load balancer. You can get the DNS name by using the AWS
     *         Management Console, the ELB API, or the AWS CLI. Use the same
     *         method to get values for <code>HostedZoneId</code> and
     *         <code>DNSName</code>. If you get one value from the console and
     *         the other value from the API or the CLI, creating the resource
     *         record set will fail.</li>
     *         <li><b>An Amazon S3 bucket that is configured as a static
     *         website:</b> Specify the domain name of the Amazon S3 website
     *         endpoint in which you created the bucket; for example,
     *         <code>s3-website-us-east-1.amazonaws.com</code>. For more
     *         information about valid values, see the table <a href=
     *         "http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region"
     *         >Amazon Simple Storage Service (S3) Website Endpoints</a> in the
     *         <i>Amazon Web Services General Reference</i>. For more
     *         information about using Amazon S3 buckets for websites, see <a
     *         href=
     *         "http://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html"
     *         >Hosting a Static Website on Amazon S3</a> in the <i>Amazon
     *         Simple Storage Service Developer Guide</i>.</li>
     *         <li/>
     *         </ul>
     *         <p>
     *         For more information and an example, see <a href=
     *         "http://docs.aws.amazon.com/Route53/latest/APIReference/CreateAliasRRSAPI.html"
     *         >Example: Creating Alias Resource Record Sets</a> in the
     *         <i>Amazon Route 53 API Reference
     */
    public String getDNSName() {
        return this.dNSName;
    }

    /**
     * <p>
     * <i>Alias resource record sets only:</i> The external DNS name associated
     * with the AWS Resource. The value that you specify depends on where you
     * want to route queries:
     * </p>
     * <ul>
     * <li><b>A CloudFront distribution:</b> Specify the domain name that
     * CloudFront assigned when you created your distribution. Your CloudFront
     * distribution must include an alternate domain name that matches the name
     * of the resource record set. For example, if the name of the resource
     * record set is <code>acme.example.com</code>, your CloudFront distribution
     * must include <code>acme.example.com</code> as one of the alternate domain
     * names. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/CNAMEs.html"
     * >Using Alternate Domain Names (CNAMEs)</a> in the <i>Amazon CloudFront
     * Developer Guide</i>.</li>
     * <li><b>An ELB load balancer:</b> Specify the DNS name associated with the
     * load balancer. You can get the DNS name by using the AWS Management
     * Console, the ELB API, or the AWS CLI. Use the same method to get values
     * for <code>HostedZoneId</code> and <code>DNSName</code>. If you get one
     * value from the console and the other value from the API or the CLI,
     * creating the resource record set will fail.</li>
     * <li><b>An Amazon S3 bucket that is configured as a static website:</b>
     * Specify the domain name of the Amazon S3 website endpoint in which you
     * created the bucket; for example,
     * <code>s3-website-us-east-1.amazonaws.com</code>. For more information
     * about valid values, see the table <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region"
     * >Amazon Simple Storage Service (S3) Website Endpoints</a> in the
     * <i>Amazon Web Services General Reference</i>. For more information about
     * using Amazon S3 buckets for websites, see <a href=
     * "http://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html"
     * >Hosting a Static Website on Amazon S3</a> in the <i>Amazon Simple
     * Storage Service Developer Guide</i>.</li>
     * <li/>
     * </ul>
     * <p>
     * For more information and an example, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/APIReference/CreateAliasRRSAPI.html"
     * >Example: Creating Alias Resource Record Sets</a> in the <i>Amazon Route
     * 53 API Reference</i>.
     * </p>
     * 
     * @param dNSName
     *        Alias resource record sets only:</i> The external DNS name
     *        associated with the AWS Resource. The value that you specify
     *        depends on where you want to route queries:</p>
     *        <ul>
     *        <li><b>A CloudFront distribution:</b> Specify the domain name that
     *        CloudFront assigned when you created your distribution. Your
     *        CloudFront distribution must include an alternate domain name that
     *        matches the name of the resource record set. For example, if the
     *        name of the resource record set is <code>acme.example.com</code>,
     *        your CloudFront distribution must include
     *        <code>acme.example.com</code> as one of the alternate domain
     *        names. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/CNAMEs.html"
     *        >Using Alternate Domain Names (CNAMEs)</a> in the <i>Amazon
     *        CloudFront Developer Guide</i>.</li>
     *        <li><b>An ELB load balancer:</b> Specify the DNS name associated
     *        with the load balancer. You can get the DNS name by using the AWS
     *        Management Console, the ELB API, or the AWS CLI. Use the same
     *        method to get values for <code>HostedZoneId</code> and
     *        <code>DNSName</code>. If you get one value from the console and
     *        the other value from the API or the CLI, creating the resource
     *        record set will fail.</li>
     *        <li><b>An Amazon S3 bucket that is configured as a static
     *        website:</b> Specify the domain name of the Amazon S3 website
     *        endpoint in which you created the bucket; for example,
     *        <code>s3-website-us-east-1.amazonaws.com</code>. For more
     *        information about valid values, see the table <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region"
     *        >Amazon Simple Storage Service (S3) Website Endpoints</a> in the
     *        <i>Amazon Web Services General Reference</i>. For more information
     *        about using Amazon S3 buckets for websites, see <a href=
     *        "http://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html"
     *        >Hosting a Static Website on Amazon S3</a> in the <i>Amazon Simple
     *        Storage Service Developer Guide</i>.</li>
     *        <li/>
     *        </ul>
     *        <p>
     *        For more information and an example, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/APIReference/CreateAliasRRSAPI.html"
     *        >Example: Creating Alias Resource Record Sets</a> in the <i>Amazon
     *        Route 53 API Reference
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public AliasTarget withDNSName(String dNSName) {
        setDNSName(dNSName);
        return this;
    }

    /**
     * <p>
     * <i>Alias resource record sets only:</i> If you set the value of
     * <code>EvaluateTargetHealth</code> to <code>true</code> for the resource
     * record set or sets in an alias, weighted alias, latency alias, or
     * failover alias resource record set, and if you specify a value for
     * <code>HealthCheckId</code> for every resource record set that is
     * referenced by these alias resource record sets, the alias resource record
     * sets inherit the health of the referenced resource record sets.
     * </p>
     * <p>
     * In this configuration, when Amazon Route 53 receives a DNS query for an
     * alias resource record set:
     * </p>
     * <ol>
     * <li>Amazon Route 53 looks at the resource record sets that are referenced
     * by the alias resource record sets to determine which health checks
     * they're using.</li>
     * <li>Amazon Route 53 checks the current status of each health check.
     * (Amazon Route 53 periodically checks the health of the endpoint that is
     * specified in a health check; it doesn't perform the health check when the
     * DNS query arrives.)</li>
     * <li>Based on the status of the health checks, Amazon Route 53 determines
     * which resource record sets are healthy. Unhealthy resource record sets
     * are immediately removed from consideration. In addition, if all of the
     * resource record sets that are referenced by an alias resource record set
     * are unhealthy, that alias resource record set also is immediately removed
     * from consideration.</li>
     * <li>Based on the configuration of the alias resource record sets
     * (weighted alias or latency alias, for example) and the configuration of
     * the resource record sets that they reference, Amazon Route 53 chooses a
     * resource record set from the healthy resource record sets, and responds
     * to the query.</li>
     * </ol>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>You cannot set EvaluateTargetHealth to true when the alias target is
     * a CloudFront distribution.</li>
     * <li>If the AWS resource that you specify in <code>AliasTarget</code> is a
     * resource record set or a group of resource record sets (for example, a
     * group of weighted resource record sets), but it is not another alias
     * resource record set, we recommend that you associate a health check with
     * all of the resource record sets in the alias target. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html#dns-failover-complex-configs-hc-omitting"
     * >What Happens When You Omit Health Checks?</a> in the <i>Amazon Route 53
     * Developer Guide</i>.</li>
     * <li>If you specify an ELB load balancer in <code>AliasTarget</code>,
     * Elastic Load Balancing routes queries only to the healthy Amazon EC2
     * instances that are registered with the load balancer. If no Amazon EC2
     * instances are healthy or if the load balancer itself is unhealthy, and if
     * <code>EvaluateTargetHealth</code> is <code>true</code> for the
     * corresponding alias resource record set, Amazon Route 53 routes queries
     * to other resources.</li>
     * <li>When you create a load balancer, you configure settings for Elastic
     * Load Balancing health checks; they're not Amazon Route 53 health checks,
     * but they perform a similar function. Do not create Amazon Route 53 health
     * checks for the Amazon EC2 instances that you register with an ELB load
     * balancer. For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html"
     * >How Health Checks Work in More Complex Amazon Route 53
     * Configurations</a> in the <i>Amazon Route 53 Developer Guide</i>.</li>
     * </ul>
     * <p>
     * We recommend that you set <code>EvaluateTargetHealth</code> to
     * <code>true</code> only when you have enough idle capacity to handle the
     * failure of one or more endpoints.
     * </p>
     * <p>
     * For more information and examples, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html"
     * >Amazon Route 53 Health Checks and DNS Failover</a> in the <i>Amazon
     * Route 53 Developer Guide</i>.
     * </p>
     * 
     * @param evaluateTargetHealth
     *        Alias resource record sets only:</i> If you set the value of
     *        <code>EvaluateTargetHealth</code> to <code>true</code> for the
     *        resource record set or sets in an alias, weighted alias, latency
     *        alias, or failover alias resource record set, and if you specify a
     *        value for <code>HealthCheckId</code> for every resource record set
     *        that is referenced by these alias resource record sets, the alias
     *        resource record sets inherit the health of the referenced resource
     *        record sets.</p>
     *        <p>
     *        In this configuration, when Amazon Route 53 receives a DNS query
     *        for an alias resource record set:
     *        </p>
     *        <ol>
     *        <li>Amazon Route 53 looks at the resource record sets that are
     *        referenced by the alias resource record sets to determine which
     *        health checks they're using.</li>
     *        <li>Amazon Route 53 checks the current status of each health
     *        check. (Amazon Route 53 periodically checks the health of the
     *        endpoint that is specified in a health check; it doesn't perform
     *        the health check when the DNS query arrives.)</li>
     *        <li>Based on the status of the health checks, Amazon Route 53
     *        determines which resource record sets are healthy. Unhealthy
     *        resource record sets are immediately removed from consideration.
     *        In addition, if all of the resource record sets that are
     *        referenced by an alias resource record set are unhealthy, that
     *        alias resource record set also is immediately removed from
     *        consideration.</li>
     *        <li>Based on the configuration of the alias resource record sets
     *        (weighted alias or latency alias, for example) and the
     *        configuration of the resource record sets that they reference,
     *        Amazon Route 53 chooses a resource record set from the healthy
     *        resource record sets, and responds to the query.</li>
     *        </ol>
     *        <p>
     *        Note the following:
     *        </p>
     *        <ul>
     *        <li>You cannot set EvaluateTargetHealth to true when the alias
     *        target is a CloudFront distribution.</li>
     *        <li>If the AWS resource that you specify in
     *        <code>AliasTarget</code> is a resource record set or a group of
     *        resource record sets (for example, a group of weighted resource
     *        record sets), but it is not another alias resource record set, we
     *        recommend that you associate a health check with all of the
     *        resource record sets in the alias target. For more information,
     *        see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html#dns-failover-complex-configs-hc-omitting"
     *        >What Happens When You Omit Health Checks?</a> in the <i>Amazon
     *        Route 53 Developer Guide</i>.</li>
     *        <li>If you specify an ELB load balancer in
     *        <code>AliasTarget</code>, Elastic Load Balancing routes queries
     *        only to the healthy Amazon EC2 instances that are registered with
     *        the load balancer. If no Amazon EC2 instances are healthy or if
     *        the load balancer itself is unhealthy, and if
     *        <code>EvaluateTargetHealth</code> is <code>true</code> for the
     *        corresponding alias resource record set, Amazon Route 53 routes
     *        queries to other resources.</li>
     *        <li>When you create a load balancer, you configure settings for
     *        Elastic Load Balancing health checks; they're not Amazon Route 53
     *        health checks, but they perform a similar function. Do not create
     *        Amazon Route 53 health checks for the Amazon EC2 instances that
     *        you register with an ELB load balancer. For more information, see
     *        <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html"
     *        >How Health Checks Work in More Complex Amazon Route 53
     *        Configurations</a> in the <i>Amazon Route 53 Developer Guide</i>.</li>
     *        </ul>
     *        <p>
     *        We recommend that you set <code>EvaluateTargetHealth</code> to
     *        <code>true</code> only when you have enough idle capacity to
     *        handle the failure of one or more endpoints.
     *        </p>
     *        <p>
     *        For more information and examples, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html"
     *        >Amazon Route 53 Health Checks and DNS Failover</a> in the
     *        <i>Amazon Route 53 Developer Guide
     */
    public void setEvaluateTargetHealth(Boolean evaluateTargetHealth) {
        this.evaluateTargetHealth = evaluateTargetHealth;
    }

    /**
     * <p>
     * <i>Alias resource record sets only:</i> If you set the value of
     * <code>EvaluateTargetHealth</code> to <code>true</code> for the resource
     * record set or sets in an alias, weighted alias, latency alias, or
     * failover alias resource record set, and if you specify a value for
     * <code>HealthCheckId</code> for every resource record set that is
     * referenced by these alias resource record sets, the alias resource record
     * sets inherit the health of the referenced resource record sets.
     * </p>
     * <p>
     * In this configuration, when Amazon Route 53 receives a DNS query for an
     * alias resource record set:
     * </p>
     * <ol>
     * <li>Amazon Route 53 looks at the resource record sets that are referenced
     * by the alias resource record sets to determine which health checks
     * they're using.</li>
     * <li>Amazon Route 53 checks the current status of each health check.
     * (Amazon Route 53 periodically checks the health of the endpoint that is
     * specified in a health check; it doesn't perform the health check when the
     * DNS query arrives.)</li>
     * <li>Based on the status of the health checks, Amazon Route 53 determines
     * which resource record sets are healthy. Unhealthy resource record sets
     * are immediately removed from consideration. In addition, if all of the
     * resource record sets that are referenced by an alias resource record set
     * are unhealthy, that alias resource record set also is immediately removed
     * from consideration.</li>
     * <li>Based on the configuration of the alias resource record sets
     * (weighted alias or latency alias, for example) and the configuration of
     * the resource record sets that they reference, Amazon Route 53 chooses a
     * resource record set from the healthy resource record sets, and responds
     * to the query.</li>
     * </ol>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>You cannot set EvaluateTargetHealth to true when the alias target is
     * a CloudFront distribution.</li>
     * <li>If the AWS resource that you specify in <code>AliasTarget</code> is a
     * resource record set or a group of resource record sets (for example, a
     * group of weighted resource record sets), but it is not another alias
     * resource record set, we recommend that you associate a health check with
     * all of the resource record sets in the alias target. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html#dns-failover-complex-configs-hc-omitting"
     * >What Happens When You Omit Health Checks?</a> in the <i>Amazon Route 53
     * Developer Guide</i>.</li>
     * <li>If you specify an ELB load balancer in <code>AliasTarget</code>,
     * Elastic Load Balancing routes queries only to the healthy Amazon EC2
     * instances that are registered with the load balancer. If no Amazon EC2
     * instances are healthy or if the load balancer itself is unhealthy, and if
     * <code>EvaluateTargetHealth</code> is <code>true</code> for the
     * corresponding alias resource record set, Amazon Route 53 routes queries
     * to other resources.</li>
     * <li>When you create a load balancer, you configure settings for Elastic
     * Load Balancing health checks; they're not Amazon Route 53 health checks,
     * but they perform a similar function. Do not create Amazon Route 53 health
     * checks for the Amazon EC2 instances that you register with an ELB load
     * balancer. For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html"
     * >How Health Checks Work in More Complex Amazon Route 53
     * Configurations</a> in the <i>Amazon Route 53 Developer Guide</i>.</li>
     * </ul>
     * <p>
     * We recommend that you set <code>EvaluateTargetHealth</code> to
     * <code>true</code> only when you have enough idle capacity to handle the
     * failure of one or more endpoints.
     * </p>
     * <p>
     * For more information and examples, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html"
     * >Amazon Route 53 Health Checks and DNS Failover</a> in the <i>Amazon
     * Route 53 Developer Guide</i>.
     * </p>
     * 
     * @return Alias resource record sets only:</i> If you set the value of
     *         <code>EvaluateTargetHealth</code> to <code>true</code> for the
     *         resource record set or sets in an alias, weighted alias, latency
     *         alias, or failover alias resource record set, and if you specify
     *         a value for <code>HealthCheckId</code> for every resource record
     *         set that is referenced by these alias resource record sets, the
     *         alias resource record sets inherit the health of the referenced
     *         resource record sets.</p>
     *         <p>
     *         In this configuration, when Amazon Route 53 receives a DNS query
     *         for an alias resource record set:
     *         </p>
     *         <ol>
     *         <li>Amazon Route 53 looks at the resource record sets that are
     *         referenced by the alias resource record sets to determine which
     *         health checks they're using.</li>
     *         <li>Amazon Route 53 checks the current status of each health
     *         check. (Amazon Route 53 periodically checks the health of the
     *         endpoint that is specified in a health check; it doesn't perform
     *         the health check when the DNS query arrives.)</li>
     *         <li>Based on the status of the health checks, Amazon Route 53
     *         determines which resource record sets are healthy. Unhealthy
     *         resource record sets are immediately removed from consideration.
     *         In addition, if all of the resource record sets that are
     *         referenced by an alias resource record set are unhealthy, that
     *         alias resource record set also is immediately removed from
     *         consideration.</li>
     *         <li>Based on the configuration of the alias resource record sets
     *         (weighted alias or latency alias, for example) and the
     *         configuration of the resource record sets that they reference,
     *         Amazon Route 53 chooses a resource record set from the healthy
     *         resource record sets, and responds to the query.</li>
     *         </ol>
     *         <p>
     *         Note the following:
     *         </p>
     *         <ul>
     *         <li>You cannot set EvaluateTargetHealth to true when the alias
     *         target is a CloudFront distribution.</li>
     *         <li>If the AWS resource that you specify in
     *         <code>AliasTarget</code> is a resource record set or a group of
     *         resource record sets (for example, a group of weighted resource
     *         record sets), but it is not another alias resource record set, we
     *         recommend that you associate a health check with all of the
     *         resource record sets in the alias target. For more information,
     *         see <a href=
     *         "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html#dns-failover-complex-configs-hc-omitting"
     *         >What Happens When You Omit Health Checks?</a> in the <i>Amazon
     *         Route 53 Developer Guide</i>.</li>
     *         <li>If you specify an ELB load balancer in
     *         <code>AliasTarget</code>, Elastic Load Balancing routes queries
     *         only to the healthy Amazon EC2 instances that are registered with
     *         the load balancer. If no Amazon EC2 instances are healthy or if
     *         the load balancer itself is unhealthy, and if
     *         <code>EvaluateTargetHealth</code> is <code>true</code> for the
     *         corresponding alias resource record set, Amazon Route 53 routes
     *         queries to other resources.</li>
     *         <li>When you create a load balancer, you configure settings for
     *         Elastic Load Balancing health checks; they're not Amazon Route 53
     *         health checks, but they perform a similar function. Do not create
     *         Amazon Route 53 health checks for the Amazon EC2 instances that
     *         you register with an ELB load balancer. For more information, see
     *         <a href=
     *         "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html"
     *         >How Health Checks Work in More Complex Amazon Route 53
     *         Configurations</a> in the <i>Amazon Route 53 Developer Guide</i>.
     *         </li>
     *         </ul>
     *         <p>
     *         We recommend that you set <code>EvaluateTargetHealth</code> to
     *         <code>true</code> only when you have enough idle capacity to
     *         handle the failure of one or more endpoints.
     *         </p>
     *         <p>
     *         For more information and examples, see <a href=
     *         "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html"
     *         >Amazon Route 53 Health Checks and DNS Failover</a> in the
     *         <i>Amazon Route 53 Developer Guide
     */
    public Boolean getEvaluateTargetHealth() {
        return this.evaluateTargetHealth;
    }

    /**
     * <p>
     * <i>Alias resource record sets only:</i> If you set the value of
     * <code>EvaluateTargetHealth</code> to <code>true</code> for the resource
     * record set or sets in an alias, weighted alias, latency alias, or
     * failover alias resource record set, and if you specify a value for
     * <code>HealthCheckId</code> for every resource record set that is
     * referenced by these alias resource record sets, the alias resource record
     * sets inherit the health of the referenced resource record sets.
     * </p>
     * <p>
     * In this configuration, when Amazon Route 53 receives a DNS query for an
     * alias resource record set:
     * </p>
     * <ol>
     * <li>Amazon Route 53 looks at the resource record sets that are referenced
     * by the alias resource record sets to determine which health checks
     * they're using.</li>
     * <li>Amazon Route 53 checks the current status of each health check.
     * (Amazon Route 53 periodically checks the health of the endpoint that is
     * specified in a health check; it doesn't perform the health check when the
     * DNS query arrives.)</li>
     * <li>Based on the status of the health checks, Amazon Route 53 determines
     * which resource record sets are healthy. Unhealthy resource record sets
     * are immediately removed from consideration. In addition, if all of the
     * resource record sets that are referenced by an alias resource record set
     * are unhealthy, that alias resource record set also is immediately removed
     * from consideration.</li>
     * <li>Based on the configuration of the alias resource record sets
     * (weighted alias or latency alias, for example) and the configuration of
     * the resource record sets that they reference, Amazon Route 53 chooses a
     * resource record set from the healthy resource record sets, and responds
     * to the query.</li>
     * </ol>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>You cannot set EvaluateTargetHealth to true when the alias target is
     * a CloudFront distribution.</li>
     * <li>If the AWS resource that you specify in <code>AliasTarget</code> is a
     * resource record set or a group of resource record sets (for example, a
     * group of weighted resource record sets), but it is not another alias
     * resource record set, we recommend that you associate a health check with
     * all of the resource record sets in the alias target. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html#dns-failover-complex-configs-hc-omitting"
     * >What Happens When You Omit Health Checks?</a> in the <i>Amazon Route 53
     * Developer Guide</i>.</li>
     * <li>If you specify an ELB load balancer in <code>AliasTarget</code>,
     * Elastic Load Balancing routes queries only to the healthy Amazon EC2
     * instances that are registered with the load balancer. If no Amazon EC2
     * instances are healthy or if the load balancer itself is unhealthy, and if
     * <code>EvaluateTargetHealth</code> is <code>true</code> for the
     * corresponding alias resource record set, Amazon Route 53 routes queries
     * to other resources.</li>
     * <li>When you create a load balancer, you configure settings for Elastic
     * Load Balancing health checks; they're not Amazon Route 53 health checks,
     * but they perform a similar function. Do not create Amazon Route 53 health
     * checks for the Amazon EC2 instances that you register with an ELB load
     * balancer. For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html"
     * >How Health Checks Work in More Complex Amazon Route 53
     * Configurations</a> in the <i>Amazon Route 53 Developer Guide</i>.</li>
     * </ul>
     * <p>
     * We recommend that you set <code>EvaluateTargetHealth</code> to
     * <code>true</code> only when you have enough idle capacity to handle the
     * failure of one or more endpoints.
     * </p>
     * <p>
     * For more information and examples, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html"
     * >Amazon Route 53 Health Checks and DNS Failover</a> in the <i>Amazon
     * Route 53 Developer Guide</i>.
     * </p>
     * 
     * @param evaluateTargetHealth
     *        Alias resource record sets only:</i> If you set the value of
     *        <code>EvaluateTargetHealth</code> to <code>true</code> for the
     *        resource record set or sets in an alias, weighted alias, latency
     *        alias, or failover alias resource record set, and if you specify a
     *        value for <code>HealthCheckId</code> for every resource record set
     *        that is referenced by these alias resource record sets, the alias
     *        resource record sets inherit the health of the referenced resource
     *        record sets.</p>
     *        <p>
     *        In this configuration, when Amazon Route 53 receives a DNS query
     *        for an alias resource record set:
     *        </p>
     *        <ol>
     *        <li>Amazon Route 53 looks at the resource record sets that are
     *        referenced by the alias resource record sets to determine which
     *        health checks they're using.</li>
     *        <li>Amazon Route 53 checks the current status of each health
     *        check. (Amazon Route 53 periodically checks the health of the
     *        endpoint that is specified in a health check; it doesn't perform
     *        the health check when the DNS query arrives.)</li>
     *        <li>Based on the status of the health checks, Amazon Route 53
     *        determines which resource record sets are healthy. Unhealthy
     *        resource record sets are immediately removed from consideration.
     *        In addition, if all of the resource record sets that are
     *        referenced by an alias resource record set are unhealthy, that
     *        alias resource record set also is immediately removed from
     *        consideration.</li>
     *        <li>Based on the configuration of the alias resource record sets
     *        (weighted alias or latency alias, for example) and the
     *        configuration of the resource record sets that they reference,
     *        Amazon Route 53 chooses a resource record set from the healthy
     *        resource record sets, and responds to the query.</li>
     *        </ol>
     *        <p>
     *        Note the following:
     *        </p>
     *        <ul>
     *        <li>You cannot set EvaluateTargetHealth to true when the alias
     *        target is a CloudFront distribution.</li>
     *        <li>If the AWS resource that you specify in
     *        <code>AliasTarget</code> is a resource record set or a group of
     *        resource record sets (for example, a group of weighted resource
     *        record sets), but it is not another alias resource record set, we
     *        recommend that you associate a health check with all of the
     *        resource record sets in the alias target. For more information,
     *        see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html#dns-failover-complex-configs-hc-omitting"
     *        >What Happens When You Omit Health Checks?</a> in the <i>Amazon
     *        Route 53 Developer Guide</i>.</li>
     *        <li>If you specify an ELB load balancer in
     *        <code>AliasTarget</code>, Elastic Load Balancing routes queries
     *        only to the healthy Amazon EC2 instances that are registered with
     *        the load balancer. If no Amazon EC2 instances are healthy or if
     *        the load balancer itself is unhealthy, and if
     *        <code>EvaluateTargetHealth</code> is <code>true</code> for the
     *        corresponding alias resource record set, Amazon Route 53 routes
     *        queries to other resources.</li>
     *        <li>When you create a load balancer, you configure settings for
     *        Elastic Load Balancing health checks; they're not Amazon Route 53
     *        health checks, but they perform a similar function. Do not create
     *        Amazon Route 53 health checks for the Amazon EC2 instances that
     *        you register with an ELB load balancer. For more information, see
     *        <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html"
     *        >How Health Checks Work in More Complex Amazon Route 53
     *        Configurations</a> in the <i>Amazon Route 53 Developer Guide</i>.</li>
     *        </ul>
     *        <p>
     *        We recommend that you set <code>EvaluateTargetHealth</code> to
     *        <code>true</code> only when you have enough idle capacity to
     *        handle the failure of one or more endpoints.
     *        </p>
     *        <p>
     *        For more information and examples, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html"
     *        >Amazon Route 53 Health Checks and DNS Failover</a> in the
     *        <i>Amazon Route 53 Developer Guide
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public AliasTarget withEvaluateTargetHealth(Boolean evaluateTargetHealth) {
        setEvaluateTargetHealth(evaluateTargetHealth);
        return this;
    }

    /**
     * <p>
     * <i>Alias resource record sets only:</i> If you set the value of
     * <code>EvaluateTargetHealth</code> to <code>true</code> for the resource
     * record set or sets in an alias, weighted alias, latency alias, or
     * failover alias resource record set, and if you specify a value for
     * <code>HealthCheckId</code> for every resource record set that is
     * referenced by these alias resource record sets, the alias resource record
     * sets inherit the health of the referenced resource record sets.
     * </p>
     * <p>
     * In this configuration, when Amazon Route 53 receives a DNS query for an
     * alias resource record set:
     * </p>
     * <ol>
     * <li>Amazon Route 53 looks at the resource record sets that are referenced
     * by the alias resource record sets to determine which health checks
     * they're using.</li>
     * <li>Amazon Route 53 checks the current status of each health check.
     * (Amazon Route 53 periodically checks the health of the endpoint that is
     * specified in a health check; it doesn't perform the health check when the
     * DNS query arrives.)</li>
     * <li>Based on the status of the health checks, Amazon Route 53 determines
     * which resource record sets are healthy. Unhealthy resource record sets
     * are immediately removed from consideration. In addition, if all of the
     * resource record sets that are referenced by an alias resource record set
     * are unhealthy, that alias resource record set also is immediately removed
     * from consideration.</li>
     * <li>Based on the configuration of the alias resource record sets
     * (weighted alias or latency alias, for example) and the configuration of
     * the resource record sets that they reference, Amazon Route 53 chooses a
     * resource record set from the healthy resource record sets, and responds
     * to the query.</li>
     * </ol>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>You cannot set EvaluateTargetHealth to true when the alias target is
     * a CloudFront distribution.</li>
     * <li>If the AWS resource that you specify in <code>AliasTarget</code> is a
     * resource record set or a group of resource record sets (for example, a
     * group of weighted resource record sets), but it is not another alias
     * resource record set, we recommend that you associate a health check with
     * all of the resource record sets in the alias target. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html#dns-failover-complex-configs-hc-omitting"
     * >What Happens When You Omit Health Checks?</a> in the <i>Amazon Route 53
     * Developer Guide</i>.</li>
     * <li>If you specify an ELB load balancer in <code>AliasTarget</code>,
     * Elastic Load Balancing routes queries only to the healthy Amazon EC2
     * instances that are registered with the load balancer. If no Amazon EC2
     * instances are healthy or if the load balancer itself is unhealthy, and if
     * <code>EvaluateTargetHealth</code> is <code>true</code> for the
     * corresponding alias resource record set, Amazon Route 53 routes queries
     * to other resources.</li>
     * <li>When you create a load balancer, you configure settings for Elastic
     * Load Balancing health checks; they're not Amazon Route 53 health checks,
     * but they perform a similar function. Do not create Amazon Route 53 health
     * checks for the Amazon EC2 instances that you register with an ELB load
     * balancer. For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html"
     * >How Health Checks Work in More Complex Amazon Route 53
     * Configurations</a> in the <i>Amazon Route 53 Developer Guide</i>.</li>
     * </ul>
     * <p>
     * We recommend that you set <code>EvaluateTargetHealth</code> to
     * <code>true</code> only when you have enough idle capacity to handle the
     * failure of one or more endpoints.
     * </p>
     * <p>
     * For more information and examples, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html"
     * >Amazon Route 53 Health Checks and DNS Failover</a> in the <i>Amazon
     * Route 53 Developer Guide</i>.
     * </p>
     * 
     * @return Alias resource record sets only:</i> If you set the value of
     *         <code>EvaluateTargetHealth</code> to <code>true</code> for the
     *         resource record set or sets in an alias, weighted alias, latency
     *         alias, or failover alias resource record set, and if you specify
     *         a value for <code>HealthCheckId</code> for every resource record
     *         set that is referenced by these alias resource record sets, the
     *         alias resource record sets inherit the health of the referenced
     *         resource record sets.</p>
     *         <p>
     *         In this configuration, when Amazon Route 53 receives a DNS query
     *         for an alias resource record set:
     *         </p>
     *         <ol>
     *         <li>Amazon Route 53 looks at the resource record sets that are
     *         referenced by the alias resource record sets to determine which
     *         health checks they're using.</li>
     *         <li>Amazon Route 53 checks the current status of each health
     *         check. (Amazon Route 53 periodically checks the health of the
     *         endpoint that is specified in a health check; it doesn't perform
     *         the health check when the DNS query arrives.)</li>
     *         <li>Based on the status of the health checks, Amazon Route 53
     *         determines which resource record sets are healthy. Unhealthy
     *         resource record sets are immediately removed from consideration.
     *         In addition, if all of the resource record sets that are
     *         referenced by an alias resource record set are unhealthy, that
     *         alias resource record set also is immediately removed from
     *         consideration.</li>
     *         <li>Based on the configuration of the alias resource record sets
     *         (weighted alias or latency alias, for example) and the
     *         configuration of the resource record sets that they reference,
     *         Amazon Route 53 chooses a resource record set from the healthy
     *         resource record sets, and responds to the query.</li>
     *         </ol>
     *         <p>
     *         Note the following:
     *         </p>
     *         <ul>
     *         <li>You cannot set EvaluateTargetHealth to true when the alias
     *         target is a CloudFront distribution.</li>
     *         <li>If the AWS resource that you specify in
     *         <code>AliasTarget</code> is a resource record set or a group of
     *         resource record sets (for example, a group of weighted resource
     *         record sets), but it is not another alias resource record set, we
     *         recommend that you associate a health check with all of the
     *         resource record sets in the alias target. For more information,
     *         see <a href=
     *         "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html#dns-failover-complex-configs-hc-omitting"
     *         >What Happens When You Omit Health Checks?</a> in the <i>Amazon
     *         Route 53 Developer Guide</i>.</li>
     *         <li>If you specify an ELB load balancer in
     *         <code>AliasTarget</code>, Elastic Load Balancing routes queries
     *         only to the healthy Amazon EC2 instances that are registered with
     *         the load balancer. If no Amazon EC2 instances are healthy or if
     *         the load balancer itself is unhealthy, and if
     *         <code>EvaluateTargetHealth</code> is <code>true</code> for the
     *         corresponding alias resource record set, Amazon Route 53 routes
     *         queries to other resources.</li>
     *         <li>When you create a load balancer, you configure settings for
     *         Elastic Load Balancing health checks; they're not Amazon Route 53
     *         health checks, but they perform a similar function. Do not create
     *         Amazon Route 53 health checks for the Amazon EC2 instances that
     *         you register with an ELB load balancer. For more information, see
     *         <a href=
     *         "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html"
     *         >How Health Checks Work in More Complex Amazon Route 53
     *         Configurations</a> in the <i>Amazon Route 53 Developer Guide</i>.
     *         </li>
     *         </ul>
     *         <p>
     *         We recommend that you set <code>EvaluateTargetHealth</code> to
     *         <code>true</code> only when you have enough idle capacity to
     *         handle the failure of one or more endpoints.
     *         </p>
     *         <p>
     *         For more information and examples, see <a href=
     *         "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html"
     *         >Amazon Route 53 Health Checks and DNS Failover</a> in the
     *         <i>Amazon Route 53 Developer Guide
     */
    public Boolean isEvaluateTargetHealth() {
        return this.evaluateTargetHealth;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: " + getHostedZoneId() + ",");
        if (getDNSName() != null)
            sb.append("DNSName: " + getDNSName() + ",");
        if (getEvaluateTargetHealth() != null)
            sb.append("EvaluateTargetHealth: " + getEvaluateTargetHealth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AliasTarget == false)
            return false;
        AliasTarget other = (AliasTarget) obj;
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null
                && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        if (other.getDNSName() == null ^ this.getDNSName() == null)
            return false;
        if (other.getDNSName() != null
                && other.getDNSName().equals(this.getDNSName()) == false)
            return false;
        if (other.getEvaluateTargetHealth() == null
                ^ this.getEvaluateTargetHealth() == null)
            return false;
        if (other.getEvaluateTargetHealth() != null
                && other.getEvaluateTargetHealth().equals(
                        this.getEvaluateTargetHealth()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getHostedZoneId() == null) ? 0 : getHostedZoneId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDNSName() == null) ? 0 : getDNSName().hashCode());
        hashCode = prime
                * hashCode
                + ((getEvaluateTargetHealth() == null) ? 0
                        : getEvaluateTargetHealth().hashCode());
        return hashCode;
    }

    @Override
    public AliasTarget clone() {
        try {
            return (AliasTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}