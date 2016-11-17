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

/**
 * <p>
 * <i>Alias resource record sets only:</i> Information about the CloudFront distribution, Elastic Beanstalk environment,
 * ELB load balancer, Amazon S3 bucket, or Amazon Route 53 resource record set that you're redirecting queries to. The
 * Elastic Beanstalk environment must have a regionalized subdomain.
 * </p>
 * <p>
 * When creating resource record sets for a private hosted zone, note the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Resource record sets can't be created for CloudFront distributions in a private hosted zone.
 * </p>
 * </li>
 * <li>
 * <p>
 * Creating geolocation alias resource record sets or latency alias resource record sets in a private hosted zone is
 * unsupported.
 * </p>
 * </li>
 * <li>
 * <p>
 * For information about creating failover resource record sets in a private hosted zone, see <a
 * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-private-hosted-zones.html">Configuring
 * Failover in a Private Hosted Zone</a>.
 * </p>
 * </li>
 * </ul>
 */
public class AliasTarget implements Serializable, Cloneable {

    /**
     * <p>
     * <i>Alias resource records sets only</i>: The value used depends on where the queries are routed:
     * </p>
     * <dl>
     * <dt>A CloudFront distribution</dt>
     * <dd>
     * <p>
     * Specify <code>Z2FDTNDATAQYW2</code>.
     * </p>
     * <note>
     * <p>
     * Alias resource record sets for CloudFront can't be created in a private zone.
     * </p>
     * </note></dd>
     * <dt>Elastic Beanstalk environment</dt>
     * <dd>
     * <p>
     * Specify the hosted zone ID for the region in which you created the environment. The environment must have a
     * regionalized subdomain. For a list of regions and the corresponding hosted zone IDs, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#elasticbeanstalk_region">AWS Elastic Beanstalk</a>
     * in the Regions and Endpoints chapter of the <i>Amazon Web Services General Reference</i>.
     * </p>
     * </dd>
     * <dt>ELB load balancer</dt>
     * <dd>
     * <p>
     * Specify the value of the hosted zone ID for the load balancer. Use the following methods to get the hosted zone
     * ID:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS Management Console: Go to the Amazon EC2 page, click <b>Load Balancers</b> in the navigation pane, select the
     * load balancer, and get the value of the <b>Hosted Zone ID</b> field on the <b>Description</b> tab. Use the same
     * process to get the value of <b>DNS Name</b>. See <a>HostedZone$Name</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Elastic Load Balancing API: Use <code>DescribeLoadBalancers</code> to get the value of
     * <code>CanonicalHostedZoneNameID</code>. Use the same process to get the <code>CanonicalHostedZoneName</code>. See
     * <a>HostedZone$Name</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS CLI: Use
     * <code> <a href="http://docs.aws.amazon.com/cli/latest/reference/elb/describe-load-balancers.html">describe-load-balancers</a> </code>
     * to get the value of <code>CanonicalHostedZoneNameID</code>. Use the same process to get the
     * <code>CanonicalHostedZoneName</code>. See <a>HostedZone$Name</a>.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>An Amazon S3 bucket configured as a static website</dt>
     * <dd>
     * <p>
     * Specify the hosted zone ID for the Amazon S3 website endpoint in which you created the bucket. For more
     * information about valid values, see the table <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region"> Amazon S3 (S3) Website Endpoints</a> in
     * the <i>Amazon Web Services General Reference</i>.
     * </p>
     * </dd>
     * <dt>Another Amazon Route 53 resource record set in your hosted zone</dt>
     * <dd>
     * <p>
     * Specify the hosted zone ID of your hosted zone. (An alias resource record set can't reference a resource record
     * set in a different hosted zone.)
     * </p>
     * </dd>
     * </dl>
     */
    private String hostedZoneId;
    /**
     * <p>
     * <i>Alias resource record sets only:</i> The value that you specify depends on where you want to route queries:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>A CloudFront distribution:</b> Specify the domain name that CloudFront assigned when you created your
     * distribution.
     * </p>
     * <p>
     * Your CloudFront distribution must include an alternate domain name that matches the name of the resource record
     * set. For example, if the name of the resource record set is <i>acme.example.com</i>, your CloudFront distribution
     * must include <i>acme.example.com</i> as one of the alternate domain names. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/CNAMEs.html">Using Alternate Domain Names
     * (CNAMEs)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Elastic Beanstalk environment</b>: Specify the <code>CNAME</code> attribute for the environment. (The
     * environment must have a regionalized domain name.) You can use the following methods to get the value of the
     * CNAME attribute:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AWS Managment Console</i>: For information about how to get the value by using the console, see <a
     * href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/customdomains.html">Using Custom Domains with AWS
     * Elastic Beanstalk</a> in the <i>AWS Elastic Beanstalk Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Elastic Load Balancing API</i>: Use the <code>DescribeEnvironments</code> action to get the value of the
     * <code>CNAME</code> attribute. For more information, see <a
     * href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/API_DescribeEnvironments.html"
     * >DescribeEnvironments</a> in the <i>AWS Elastic Beanstalk API Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>AWS CLI</i>: Use the describe-environments command to get the value of the <code>CNAME</code> attribute. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/cli/latest/reference/elasticbeanstalk/describe-environments.html"
     * >describe-environments</a> in the <i>AWS Command Line Interface Reference</i>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>An ELB load balancer:</b> Specify the DNS name associated with the load balancer. Get the DNS name by using
     * the AWS Management Console, the ELB API, or the AWS CLI. Use the same method to get values for
     * <code>HostedZoneId</code> and <code>DNSName</code>. If you get one value from the console and the other value
     * from the API or the CLI, creating the resource record set will fail.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AWS Management Console</i>: Go to the EC2 page, click <b>Load Balancers</b> in the navigation pane, choose the
     * load balancer, choose the <b>Description</b> tab, and get the value of the <b>DNS Name</b> field that begins with
     * dualstack. Use the same process to get the <b>Hosted Zone ID</b>. See <a>HostedZone$Id</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Elastic Load Balancing API</i>: Use
     * <code> <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_DescribeLoadBalancers.html">DescribeLoadBalancers</a> </code>
     * to get the value of <code>CanonicalHostedZoneName</code>. Use the same process to get the
     * <code>CanonicalHostedZoneNameId</code>. See <a>HostedZone$Id</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>AWS CLI</i>: Use
     * <code> <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_DescribeLoadBalancers.html">describe-load-balancers</a> </code>
     * to get the value of <code>CanonicalHostedZoneName</code>. Use the same process to get the
     * <code>CanonicalHostedZoneNameId</code>. See HostedZoneId.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>An Amazon S3 bucket that is configured as a static website:</b> Specify the domain name of the Amazon S3
     * website endpoint in which you created the bucket; for example, <code>s3-website-us-east-1.amazonaws.com</code>.
     * For more information about valid values, see the table <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Amazon Simple Storage Service (S3)
     * Website Endpoints</a> in the <i>Amazon Web Services General Reference</i>. For more information about using S3
     * buckets for websites, see <a href="http://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html">Hosting a
     * Static Website on Amazon S3</a> in the <i>Amazon S3 Developer Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Another Amazon Route 53 resource record set</b>: Specify the value of the <code>Name</code> element for a
     * resource record set in the current hosted zone.
     * </p>
     * </li>
     * </ul>
     */
    private String dNSName;
    /**
     * <p>
     * <i>Applies only to alias, weighted alias, latency alias, and failover alias record sets:</i> If you set the value
     * of <code>EvaluateTargetHealth</code> to <code>true</code> for the resource record set or sets in an alias,
     * weighted alias, latency alias, or failover alias resource record set, and if you specify a value for
     * <code> <a>HealthCheck$Id</a> </code> for every resource record set that is referenced by these alias resource
     * record sets, the alias resource record sets inherit the health of the referenced resource record sets.
     * </p>
     * <p>
     * In this configuration, when Amazon Route 53 receives a DNS query for an alias resource record set:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Route 53 looks at the resource record sets that are referenced by the alias resource record sets to
     * determine which health checks they're using.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Route 53 checks the current status of each health check. (Amazon Route 53 periodically checks the health
     * of the endpoint that is specified in a health check; it doesn't perform the health check when the DNS query
     * arrives.)
     * </p>
     * </li>
     * <li>
     * <p>
     * Based on the status of the health checks, Amazon Route 53 determines which resource record sets are healthy.
     * Unhealthy resource record sets are immediately removed from consideration. In addition, if all of the resource
     * record sets that are referenced by an alias resource record set are unhealthy, that alias resource record set
     * also is immediately removed from consideration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Based on the configuration of the alias resource record sets (weighted alias or latency alias, for example) and
     * the configuration of the resource record sets that they reference, Amazon Route 53 chooses a resource record set
     * from the healthy resource record sets, and responds to the query.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't set <code>EvaluateTargetHealth</code> to <code>true</code> when the alias target is a CloudFront
     * distribution.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the AWS resource that you specify in <code>AliasTarget</code> is a resource record set or a group of resource
     * record sets (for example, a group of weighted resource record sets), but it is not another alias resource record
     * set, we recommend that you associate a health check with all of the resource record sets in the alias target.For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html#dns-failover-complex-configs-hc-omitting"
     * >What Happens When You Omit Health Checks?</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify an Elastic Beanstalk environment in <code>HostedZoneId</code> and <code>DNSName</code>, and if the
     * environment contains an ELB load balancer, Elastic Load Balancing routes queries only to the healthy Amazon EC2
     * instances that are registered with the load balancer. (An environment automatically contains an ELB load balancer
     * if it includes more than one EC2 instance.) If you set <code>EvaluateTargetHealth</code> to <code>true</code> and
     * either no EC2 instances are healthy or the load balancer itself is unhealthy, Amazon Route 53 routes queries to
     * other available resources that are healthy, if any.
     * </p>
     * <p>
     * If the environment contains a single EC2 instance, there are no special requirements.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify an ELB load balancer in <code> <a>AliasTarget</a> </code>, Elastic Load Balancing routes queries
     * only to the healthy EC2 instances that are registered with the load balancer. If no EC2 instances are healthy or
     * if the load balancer itself is unhealthy, and if <code>EvaluateTargetHealth</code> is true for the corresponding
     * alias resource record set, Amazon Route 53 routes queries to other resources. When you create a load balancer,
     * you configure settings for Elastic Load Balancing health checks; they're not Amazon Route 53 health checks, but
     * they perform a similar function. Do not create Amazon Route 53 health checks for the EC2 instances that you
     * register with an ELB load balancer.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html">How Health
     * Checks Work in More Complex Amazon Route 53 Configurations</a> in the <i>Amazon Route 53 Developers Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * We recommend that you set <code>EvaluateTargetHealth</code> to true only when you have enough idle capacity to
     * handle the failure of one or more endpoints.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information and examples, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html">Amazon Route 53 Health Checks
     * and DNS Failover</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     */
    private Boolean evaluateTargetHealth;

    /**
     * Default constructor for AliasTarget object. Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public AliasTarget() {
    }

    /**
     * Constructs a new AliasTarget object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param hostedZoneId
     *        <i>Alias resource records sets only</i>: The value used depends on where the queries are routed:</p>
     *        <dl>
     *        <dt>A CloudFront distribution</dt>
     *        <dd>
     *        <p>
     *        Specify <code>Z2FDTNDATAQYW2</code>.
     *        </p>
     *        <note>
     *        <p>
     *        Alias resource record sets for CloudFront can't be created in a private zone.
     *        </p>
     *        </note></dd>
     *        <dt>Elastic Beanstalk environment</dt>
     *        <dd>
     *        <p>
     *        Specify the hosted zone ID for the region in which you created the environment. The environment must have
     *        a regionalized subdomain. For a list of regions and the corresponding hosted zone IDs, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/rande.html#elasticbeanstalk_region">AWS Elastic
     *        Beanstalk</a> in the Regions and Endpoints chapter of the <i>Amazon Web Services General Reference</i>.
     *        </p>
     *        </dd>
     *        <dt>ELB load balancer</dt>
     *        <dd>
     *        <p>
     *        Specify the value of the hosted zone ID for the load balancer. Use the following methods to get the hosted
     *        zone ID:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        AWS Management Console: Go to the Amazon EC2 page, click <b>Load Balancers</b> in the navigation pane,
     *        select the load balancer, and get the value of the <b>Hosted Zone ID</b> field on the <b>Description</b>
     *        tab. Use the same process to get the value of <b>DNS Name</b>. See <a>HostedZone$Name</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Elastic Load Balancing API: Use <code>DescribeLoadBalancers</code> to get the value of
     *        <code>CanonicalHostedZoneNameID</code>. Use the same process to get the
     *        <code>CanonicalHostedZoneName</code>. See <a>HostedZone$Name</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS CLI: Use
     *        <code> <a href="http://docs.aws.amazon.com/cli/latest/reference/elb/describe-load-balancers.html">describe-load-balancers</a> </code>
     *        to get the value of <code>CanonicalHostedZoneNameID</code>. Use the same process to get the
     *        <code>CanonicalHostedZoneName</code>. See <a>HostedZone$Name</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>An Amazon S3 bucket configured as a static website</dt>
     *        <dd>
     *        <p>
     *        Specify the hosted zone ID for the Amazon S3 website endpoint in which you created the bucket. For more
     *        information about valid values, see the table <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region"> Amazon S3 (S3) Website
     *        Endpoints</a> in the <i>Amazon Web Services General Reference</i>.
     *        </p>
     *        </dd>
     *        <dt>Another Amazon Route 53 resource record set in your hosted zone</dt>
     *        <dd>
     *        <p>
     *        Specify the hosted zone ID of your hosted zone. (An alias resource record set can't reference a resource
     *        record set in a different hosted zone.)
     *        </p>
     *        </dd>
     * @param dNSName
     *        <i>Alias resource record sets only:</i> The value that you specify depends on where you want to route
     *        queries:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>A CloudFront distribution:</b> Specify the domain name that CloudFront assigned when you created your
     *        distribution.
     *        </p>
     *        <p>
     *        Your CloudFront distribution must include an alternate domain name that matches the name of the resource
     *        record set. For example, if the name of the resource record set is <i>acme.example.com</i>, your
     *        CloudFront distribution must include <i>acme.example.com</i> as one of the alternate domain names. For
     *        more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/CNAMEs.html">Using Alternate
     *        Domain Names (CNAMEs)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <b>Elastic Beanstalk environment</b>: Specify the <code>CNAME</code> attribute for the environment. (The
     *        environment must have a regionalized domain name.) You can use the following methods to get the value of
     *        the CNAME attribute:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>AWS Managment Console</i>: For information about how to get the value by using the console, see <a
     *        href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/customdomains.html">Using Custom Domains with
     *        AWS Elastic Beanstalk</a> in the <i>AWS Elastic Beanstalk Developer Guide</i>.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <i>Elastic Load Balancing API</i>: Use the <code>DescribeEnvironments</code> action to get the value of
     *        the <code>CNAME</code> attribute. For more information, see <a
     *        href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/API_DescribeEnvironments.html"
     *        >DescribeEnvironments</a> in the <i>AWS Elastic Beanstalk API Reference</i>.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <i>AWS CLI</i>: Use the describe-environments command to get the value of the <code>CNAME</code>
     *        attribute. For more information, see <a
     *        href="http://docs.aws.amazon.com/cli/latest/reference/elasticbeanstalk/describe-environments.html"
     *        >describe-environments</a> in the <i>AWS Command Line Interface Reference</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        </li> <li>
     *        <p>
     *        <b>An ELB load balancer:</b> Specify the DNS name associated with the load balancer. Get the DNS name by
     *        using the AWS Management Console, the ELB API, or the AWS CLI. Use the same method to get values for
     *        <code>HostedZoneId</code> and <code>DNSName</code>. If you get one value from the console and the other
     *        value from the API or the CLI, creating the resource record set will fail.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>AWS Management Console</i>: Go to the EC2 page, click <b>Load Balancers</b> in the navigation pane,
     *        choose the load balancer, choose the <b>Description</b> tab, and get the value of the <b>DNS Name</b>
     *        field that begins with dualstack. Use the same process to get the <b>Hosted Zone ID</b>. See
     *        <a>HostedZone$Id</a>.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <i>Elastic Load Balancing API</i>: Use <code> <a
     *        href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_DescribeLoadBalancers.html"
     *        >DescribeLoadBalancers</a> </code> to get the value of <code>CanonicalHostedZoneName</code>. Use the same
     *        process to get the <code>CanonicalHostedZoneNameId</code>. See <a>HostedZone$Id</a>.
     *        </p>
     *        </li> <li>
     *        <p>
     *        <i>AWS CLI</i>: Use <code> <a
     *        href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_DescribeLoadBalancers.html"
     *        >describe-load-balancers</a> </code> to get the value of <code>CanonicalHostedZoneName</code>. Use the
     *        same process to get the <code>CanonicalHostedZoneNameId</code>. See HostedZoneId.
     *        </p>
     *        </li>
     *        </ul>
     *        </li> <li>
     *        <p>
     *        <b>An Amazon S3 bucket that is configured as a static website:</b> Specify the domain name of the Amazon
     *        S3 website endpoint in which you created the bucket; for example, <code>s3-website-us-east-1.amazonaws.com
     *        </code>. For more information about valid values, see the table <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Amazon Simple Storage Service
     *        (S3) Website Endpoints</a> in the <i>Amazon Web Services General Reference</i>. For more information about
     *        using S3 buckets for websites, see <a
     *        href="http://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html">Hosting a Static Website on
     *        Amazon S3</a> in the <i>Amazon S3 Developer Guide.</i>
     *        </p>
     *        </li> <li>
     *        <p>
     *        <b>Another Amazon Route 53 resource record set</b>: Specify the value of the <code>Name</code> element for
     *        a resource record set in the current hosted zone.
     *        </p>
     *        </li>
     */
    public AliasTarget(String hostedZoneId, String dNSName) {
        setHostedZoneId(hostedZoneId);
        setDNSName(dNSName);
    }

    /**
     * <p>
     * <i>Alias resource records sets only</i>: The value used depends on where the queries are routed:
     * </p>
     * <dl>
     * <dt>A CloudFront distribution</dt>
     * <dd>
     * <p>
     * Specify <code>Z2FDTNDATAQYW2</code>.
     * </p>
     * <note>
     * <p>
     * Alias resource record sets for CloudFront can't be created in a private zone.
     * </p>
     * </note></dd>
     * <dt>Elastic Beanstalk environment</dt>
     * <dd>
     * <p>
     * Specify the hosted zone ID for the region in which you created the environment. The environment must have a
     * regionalized subdomain. For a list of regions and the corresponding hosted zone IDs, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#elasticbeanstalk_region">AWS Elastic Beanstalk</a>
     * in the Regions and Endpoints chapter of the <i>Amazon Web Services General Reference</i>.
     * </p>
     * </dd>
     * <dt>ELB load balancer</dt>
     * <dd>
     * <p>
     * Specify the value of the hosted zone ID for the load balancer. Use the following methods to get the hosted zone
     * ID:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS Management Console: Go to the Amazon EC2 page, click <b>Load Balancers</b> in the navigation pane, select the
     * load balancer, and get the value of the <b>Hosted Zone ID</b> field on the <b>Description</b> tab. Use the same
     * process to get the value of <b>DNS Name</b>. See <a>HostedZone$Name</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Elastic Load Balancing API: Use <code>DescribeLoadBalancers</code> to get the value of
     * <code>CanonicalHostedZoneNameID</code>. Use the same process to get the <code>CanonicalHostedZoneName</code>. See
     * <a>HostedZone$Name</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS CLI: Use
     * <code> <a href="http://docs.aws.amazon.com/cli/latest/reference/elb/describe-load-balancers.html">describe-load-balancers</a> </code>
     * to get the value of <code>CanonicalHostedZoneNameID</code>. Use the same process to get the
     * <code>CanonicalHostedZoneName</code>. See <a>HostedZone$Name</a>.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>An Amazon S3 bucket configured as a static website</dt>
     * <dd>
     * <p>
     * Specify the hosted zone ID for the Amazon S3 website endpoint in which you created the bucket. For more
     * information about valid values, see the table <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region"> Amazon S3 (S3) Website Endpoints</a> in
     * the <i>Amazon Web Services General Reference</i>.
     * </p>
     * </dd>
     * <dt>Another Amazon Route 53 resource record set in your hosted zone</dt>
     * <dd>
     * <p>
     * Specify the hosted zone ID of your hosted zone. (An alias resource record set can't reference a resource record
     * set in a different hosted zone.)
     * </p>
     * </dd>
     * </dl>
     * 
     * @param hostedZoneId
     *        <i>Alias resource records sets only</i>: The value used depends on where the queries are routed:</p>
     *        <dl>
     *        <dt>A CloudFront distribution</dt>
     *        <dd>
     *        <p>
     *        Specify <code>Z2FDTNDATAQYW2</code>.
     *        </p>
     *        <note>
     *        <p>
     *        Alias resource record sets for CloudFront can't be created in a private zone.
     *        </p>
     *        </note></dd>
     *        <dt>Elastic Beanstalk environment</dt>
     *        <dd>
     *        <p>
     *        Specify the hosted zone ID for the region in which you created the environment. The environment must have
     *        a regionalized subdomain. For a list of regions and the corresponding hosted zone IDs, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/rande.html#elasticbeanstalk_region">AWS Elastic
     *        Beanstalk</a> in the Regions and Endpoints chapter of the <i>Amazon Web Services General Reference</i>.
     *        </p>
     *        </dd>
     *        <dt>ELB load balancer</dt>
     *        <dd>
     *        <p>
     *        Specify the value of the hosted zone ID for the load balancer. Use the following methods to get the hosted
     *        zone ID:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        AWS Management Console: Go to the Amazon EC2 page, click <b>Load Balancers</b> in the navigation pane,
     *        select the load balancer, and get the value of the <b>Hosted Zone ID</b> field on the <b>Description</b>
     *        tab. Use the same process to get the value of <b>DNS Name</b>. See <a>HostedZone$Name</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Elastic Load Balancing API: Use <code>DescribeLoadBalancers</code> to get the value of
     *        <code>CanonicalHostedZoneNameID</code>. Use the same process to get the
     *        <code>CanonicalHostedZoneName</code>. See <a>HostedZone$Name</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS CLI: Use
     *        <code> <a href="http://docs.aws.amazon.com/cli/latest/reference/elb/describe-load-balancers.html">describe-load-balancers</a> </code>
     *        to get the value of <code>CanonicalHostedZoneNameID</code>. Use the same process to get the
     *        <code>CanonicalHostedZoneName</code>. See <a>HostedZone$Name</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>An Amazon S3 bucket configured as a static website</dt>
     *        <dd>
     *        <p>
     *        Specify the hosted zone ID for the Amazon S3 website endpoint in which you created the bucket. For more
     *        information about valid values, see the table <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region"> Amazon S3 (S3) Website
     *        Endpoints</a> in the <i>Amazon Web Services General Reference</i>.
     *        </p>
     *        </dd>
     *        <dt>Another Amazon Route 53 resource record set in your hosted zone</dt>
     *        <dd>
     *        <p>
     *        Specify the hosted zone ID of your hosted zone. (An alias resource record set can't reference a resource
     *        record set in a different hosted zone.)
     *        </p>
     *        </dd>
     */

    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * <i>Alias resource records sets only</i>: The value used depends on where the queries are routed:
     * </p>
     * <dl>
     * <dt>A CloudFront distribution</dt>
     * <dd>
     * <p>
     * Specify <code>Z2FDTNDATAQYW2</code>.
     * </p>
     * <note>
     * <p>
     * Alias resource record sets for CloudFront can't be created in a private zone.
     * </p>
     * </note></dd>
     * <dt>Elastic Beanstalk environment</dt>
     * <dd>
     * <p>
     * Specify the hosted zone ID for the region in which you created the environment. The environment must have a
     * regionalized subdomain. For a list of regions and the corresponding hosted zone IDs, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#elasticbeanstalk_region">AWS Elastic Beanstalk</a>
     * in the Regions and Endpoints chapter of the <i>Amazon Web Services General Reference</i>.
     * </p>
     * </dd>
     * <dt>ELB load balancer</dt>
     * <dd>
     * <p>
     * Specify the value of the hosted zone ID for the load balancer. Use the following methods to get the hosted zone
     * ID:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS Management Console: Go to the Amazon EC2 page, click <b>Load Balancers</b> in the navigation pane, select the
     * load balancer, and get the value of the <b>Hosted Zone ID</b> field on the <b>Description</b> tab. Use the same
     * process to get the value of <b>DNS Name</b>. See <a>HostedZone$Name</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Elastic Load Balancing API: Use <code>DescribeLoadBalancers</code> to get the value of
     * <code>CanonicalHostedZoneNameID</code>. Use the same process to get the <code>CanonicalHostedZoneName</code>. See
     * <a>HostedZone$Name</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS CLI: Use
     * <code> <a href="http://docs.aws.amazon.com/cli/latest/reference/elb/describe-load-balancers.html">describe-load-balancers</a> </code>
     * to get the value of <code>CanonicalHostedZoneNameID</code>. Use the same process to get the
     * <code>CanonicalHostedZoneName</code>. See <a>HostedZone$Name</a>.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>An Amazon S3 bucket configured as a static website</dt>
     * <dd>
     * <p>
     * Specify the hosted zone ID for the Amazon S3 website endpoint in which you created the bucket. For more
     * information about valid values, see the table <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region"> Amazon S3 (S3) Website Endpoints</a> in
     * the <i>Amazon Web Services General Reference</i>.
     * </p>
     * </dd>
     * <dt>Another Amazon Route 53 resource record set in your hosted zone</dt>
     * <dd>
     * <p>
     * Specify the hosted zone ID of your hosted zone. (An alias resource record set can't reference a resource record
     * set in a different hosted zone.)
     * </p>
     * </dd>
     * </dl>
     * 
     * @return <i>Alias resource records sets only</i>: The value used depends on where the queries are routed:</p>
     *         <dl>
     *         <dt>A CloudFront distribution</dt>
     *         <dd>
     *         <p>
     *         Specify <code>Z2FDTNDATAQYW2</code>.
     *         </p>
     *         <note>
     *         <p>
     *         Alias resource record sets for CloudFront can't be created in a private zone.
     *         </p>
     *         </note></dd>
     *         <dt>Elastic Beanstalk environment</dt>
     *         <dd>
     *         <p>
     *         Specify the hosted zone ID for the region in which you created the environment. The environment must have
     *         a regionalized subdomain. For a list of regions and the corresponding hosted zone IDs, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html#elasticbeanstalk_region">AWS Elastic
     *         Beanstalk</a> in the Regions and Endpoints chapter of the <i>Amazon Web Services General Reference</i>.
     *         </p>
     *         </dd>
     *         <dt>ELB load balancer</dt>
     *         <dd>
     *         <p>
     *         Specify the value of the hosted zone ID for the load balancer. Use the following methods to get the
     *         hosted zone ID:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         AWS Management Console: Go to the Amazon EC2 page, click <b>Load Balancers</b> in the navigation pane,
     *         select the load balancer, and get the value of the <b>Hosted Zone ID</b> field on the <b>Description</b>
     *         tab. Use the same process to get the value of <b>DNS Name</b>. See <a>HostedZone$Name</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Elastic Load Balancing API: Use <code>DescribeLoadBalancers</code> to get the value of
     *         <code>CanonicalHostedZoneNameID</code>. Use the same process to get the
     *         <code>CanonicalHostedZoneName</code>. See <a>HostedZone$Name</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         AWS CLI: Use
     *         <code> <a href="http://docs.aws.amazon.com/cli/latest/reference/elb/describe-load-balancers.html">describe-load-balancers</a> </code>
     *         to get the value of <code>CanonicalHostedZoneNameID</code>. Use the same process to get the
     *         <code>CanonicalHostedZoneName</code>. See <a>HostedZone$Name</a>.
     *         </p>
     *         </li>
     *         </ul>
     *         </dd>
     *         <dt>An Amazon S3 bucket configured as a static website</dt>
     *         <dd>
     *         <p>
     *         Specify the hosted zone ID for the Amazon S3 website endpoint in which you created the bucket. For more
     *         information about valid values, see the table <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region"> Amazon S3 (S3) Website
     *         Endpoints</a> in the <i>Amazon Web Services General Reference</i>.
     *         </p>
     *         </dd>
     *         <dt>Another Amazon Route 53 resource record set in your hosted zone</dt>
     *         <dd>
     *         <p>
     *         Specify the hosted zone ID of your hosted zone. (An alias resource record set can't reference a resource
     *         record set in a different hosted zone.)
     *         </p>
     *         </dd>
     */

    public String getHostedZoneId() {
        return this.hostedZoneId;
    }

    /**
     * <p>
     * <i>Alias resource records sets only</i>: The value used depends on where the queries are routed:
     * </p>
     * <dl>
     * <dt>A CloudFront distribution</dt>
     * <dd>
     * <p>
     * Specify <code>Z2FDTNDATAQYW2</code>.
     * </p>
     * <note>
     * <p>
     * Alias resource record sets for CloudFront can't be created in a private zone.
     * </p>
     * </note></dd>
     * <dt>Elastic Beanstalk environment</dt>
     * <dd>
     * <p>
     * Specify the hosted zone ID for the region in which you created the environment. The environment must have a
     * regionalized subdomain. For a list of regions and the corresponding hosted zone IDs, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#elasticbeanstalk_region">AWS Elastic Beanstalk</a>
     * in the Regions and Endpoints chapter of the <i>Amazon Web Services General Reference</i>.
     * </p>
     * </dd>
     * <dt>ELB load balancer</dt>
     * <dd>
     * <p>
     * Specify the value of the hosted zone ID for the load balancer. Use the following methods to get the hosted zone
     * ID:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AWS Management Console: Go to the Amazon EC2 page, click <b>Load Balancers</b> in the navigation pane, select the
     * load balancer, and get the value of the <b>Hosted Zone ID</b> field on the <b>Description</b> tab. Use the same
     * process to get the value of <b>DNS Name</b>. See <a>HostedZone$Name</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Elastic Load Balancing API: Use <code>DescribeLoadBalancers</code> to get the value of
     * <code>CanonicalHostedZoneNameID</code>. Use the same process to get the <code>CanonicalHostedZoneName</code>. See
     * <a>HostedZone$Name</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS CLI: Use
     * <code> <a href="http://docs.aws.amazon.com/cli/latest/reference/elb/describe-load-balancers.html">describe-load-balancers</a> </code>
     * to get the value of <code>CanonicalHostedZoneNameID</code>. Use the same process to get the
     * <code>CanonicalHostedZoneName</code>. See <a>HostedZone$Name</a>.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>An Amazon S3 bucket configured as a static website</dt>
     * <dd>
     * <p>
     * Specify the hosted zone ID for the Amazon S3 website endpoint in which you created the bucket. For more
     * information about valid values, see the table <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region"> Amazon S3 (S3) Website Endpoints</a> in
     * the <i>Amazon Web Services General Reference</i>.
     * </p>
     * </dd>
     * <dt>Another Amazon Route 53 resource record set in your hosted zone</dt>
     * <dd>
     * <p>
     * Specify the hosted zone ID of your hosted zone. (An alias resource record set can't reference a resource record
     * set in a different hosted zone.)
     * </p>
     * </dd>
     * </dl>
     * 
     * @param hostedZoneId
     *        <i>Alias resource records sets only</i>: The value used depends on where the queries are routed:</p>
     *        <dl>
     *        <dt>A CloudFront distribution</dt>
     *        <dd>
     *        <p>
     *        Specify <code>Z2FDTNDATAQYW2</code>.
     *        </p>
     *        <note>
     *        <p>
     *        Alias resource record sets for CloudFront can't be created in a private zone.
     *        </p>
     *        </note></dd>
     *        <dt>Elastic Beanstalk environment</dt>
     *        <dd>
     *        <p>
     *        Specify the hosted zone ID for the region in which you created the environment. The environment must have
     *        a regionalized subdomain. For a list of regions and the corresponding hosted zone IDs, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/rande.html#elasticbeanstalk_region">AWS Elastic
     *        Beanstalk</a> in the Regions and Endpoints chapter of the <i>Amazon Web Services General Reference</i>.
     *        </p>
     *        </dd>
     *        <dt>ELB load balancer</dt>
     *        <dd>
     *        <p>
     *        Specify the value of the hosted zone ID for the load balancer. Use the following methods to get the hosted
     *        zone ID:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        AWS Management Console: Go to the Amazon EC2 page, click <b>Load Balancers</b> in the navigation pane,
     *        select the load balancer, and get the value of the <b>Hosted Zone ID</b> field on the <b>Description</b>
     *        tab. Use the same process to get the value of <b>DNS Name</b>. See <a>HostedZone$Name</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Elastic Load Balancing API: Use <code>DescribeLoadBalancers</code> to get the value of
     *        <code>CanonicalHostedZoneNameID</code>. Use the same process to get the
     *        <code>CanonicalHostedZoneName</code>. See <a>HostedZone$Name</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        AWS CLI: Use
     *        <code> <a href="http://docs.aws.amazon.com/cli/latest/reference/elb/describe-load-balancers.html">describe-load-balancers</a> </code>
     *        to get the value of <code>CanonicalHostedZoneNameID</code>. Use the same process to get the
     *        <code>CanonicalHostedZoneName</code>. See <a>HostedZone$Name</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>An Amazon S3 bucket configured as a static website</dt>
     *        <dd>
     *        <p>
     *        Specify the hosted zone ID for the Amazon S3 website endpoint in which you created the bucket. For more
     *        information about valid values, see the table <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region"> Amazon S3 (S3) Website
     *        Endpoints</a> in the <i>Amazon Web Services General Reference</i>.
     *        </p>
     *        </dd>
     *        <dt>Another Amazon Route 53 resource record set in your hosted zone</dt>
     *        <dd>
     *        <p>
     *        Specify the hosted zone ID of your hosted zone. (An alias resource record set can't reference a resource
     *        record set in a different hosted zone.)
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AliasTarget withHostedZoneId(String hostedZoneId) {
        setHostedZoneId(hostedZoneId);
        return this;
    }

    /**
     * <p>
     * <i>Alias resource record sets only:</i> The value that you specify depends on where you want to route queries:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>A CloudFront distribution:</b> Specify the domain name that CloudFront assigned when you created your
     * distribution.
     * </p>
     * <p>
     * Your CloudFront distribution must include an alternate domain name that matches the name of the resource record
     * set. For example, if the name of the resource record set is <i>acme.example.com</i>, your CloudFront distribution
     * must include <i>acme.example.com</i> as one of the alternate domain names. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/CNAMEs.html">Using Alternate Domain Names
     * (CNAMEs)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Elastic Beanstalk environment</b>: Specify the <code>CNAME</code> attribute for the environment. (The
     * environment must have a regionalized domain name.) You can use the following methods to get the value of the
     * CNAME attribute:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AWS Managment Console</i>: For information about how to get the value by using the console, see <a
     * href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/customdomains.html">Using Custom Domains with AWS
     * Elastic Beanstalk</a> in the <i>AWS Elastic Beanstalk Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Elastic Load Balancing API</i>: Use the <code>DescribeEnvironments</code> action to get the value of the
     * <code>CNAME</code> attribute. For more information, see <a
     * href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/API_DescribeEnvironments.html"
     * >DescribeEnvironments</a> in the <i>AWS Elastic Beanstalk API Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>AWS CLI</i>: Use the describe-environments command to get the value of the <code>CNAME</code> attribute. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/cli/latest/reference/elasticbeanstalk/describe-environments.html"
     * >describe-environments</a> in the <i>AWS Command Line Interface Reference</i>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>An ELB load balancer:</b> Specify the DNS name associated with the load balancer. Get the DNS name by using
     * the AWS Management Console, the ELB API, or the AWS CLI. Use the same method to get values for
     * <code>HostedZoneId</code> and <code>DNSName</code>. If you get one value from the console and the other value
     * from the API or the CLI, creating the resource record set will fail.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AWS Management Console</i>: Go to the EC2 page, click <b>Load Balancers</b> in the navigation pane, choose the
     * load balancer, choose the <b>Description</b> tab, and get the value of the <b>DNS Name</b> field that begins with
     * dualstack. Use the same process to get the <b>Hosted Zone ID</b>. See <a>HostedZone$Id</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Elastic Load Balancing API</i>: Use
     * <code> <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_DescribeLoadBalancers.html">DescribeLoadBalancers</a> </code>
     * to get the value of <code>CanonicalHostedZoneName</code>. Use the same process to get the
     * <code>CanonicalHostedZoneNameId</code>. See <a>HostedZone$Id</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>AWS CLI</i>: Use
     * <code> <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_DescribeLoadBalancers.html">describe-load-balancers</a> </code>
     * to get the value of <code>CanonicalHostedZoneName</code>. Use the same process to get the
     * <code>CanonicalHostedZoneNameId</code>. See HostedZoneId.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>An Amazon S3 bucket that is configured as a static website:</b> Specify the domain name of the Amazon S3
     * website endpoint in which you created the bucket; for example, <code>s3-website-us-east-1.amazonaws.com</code>.
     * For more information about valid values, see the table <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Amazon Simple Storage Service (S3)
     * Website Endpoints</a> in the <i>Amazon Web Services General Reference</i>. For more information about using S3
     * buckets for websites, see <a href="http://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html">Hosting a
     * Static Website on Amazon S3</a> in the <i>Amazon S3 Developer Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Another Amazon Route 53 resource record set</b>: Specify the value of the <code>Name</code> element for a
     * resource record set in the current hosted zone.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dNSName
     *        <i>Alias resource record sets only:</i> The value that you specify depends on where you want to route
     *        queries:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>A CloudFront distribution:</b> Specify the domain name that CloudFront assigned when you created your
     *        distribution.
     *        </p>
     *        <p>
     *        Your CloudFront distribution must include an alternate domain name that matches the name of the resource
     *        record set. For example, if the name of the resource record set is <i>acme.example.com</i>, your
     *        CloudFront distribution must include <i>acme.example.com</i> as one of the alternate domain names. For
     *        more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/CNAMEs.html">Using Alternate
     *        Domain Names (CNAMEs)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Elastic Beanstalk environment</b>: Specify the <code>CNAME</code> attribute for the environment. (The
     *        environment must have a regionalized domain name.) You can use the following methods to get the value of
     *        the CNAME attribute:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>AWS Managment Console</i>: For information about how to get the value by using the console, see <a
     *        href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/customdomains.html">Using Custom Domains with
     *        AWS Elastic Beanstalk</a> in the <i>AWS Elastic Beanstalk Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>Elastic Load Balancing API</i>: Use the <code>DescribeEnvironments</code> action to get the value of
     *        the <code>CNAME</code> attribute. For more information, see <a
     *        href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/API_DescribeEnvironments.html"
     *        >DescribeEnvironments</a> in the <i>AWS Elastic Beanstalk API Reference</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>AWS CLI</i>: Use the describe-environments command to get the value of the <code>CNAME</code>
     *        attribute. For more information, see <a
     *        href="http://docs.aws.amazon.com/cli/latest/reference/elasticbeanstalk/describe-environments.html"
     *        >describe-environments</a> in the <i>AWS Command Line Interface Reference</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>An ELB load balancer:</b> Specify the DNS name associated with the load balancer. Get the DNS name by
     *        using the AWS Management Console, the ELB API, or the AWS CLI. Use the same method to get values for
     *        <code>HostedZoneId</code> and <code>DNSName</code>. If you get one value from the console and the other
     *        value from the API or the CLI, creating the resource record set will fail.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>AWS Management Console</i>: Go to the EC2 page, click <b>Load Balancers</b> in the navigation pane,
     *        choose the load balancer, choose the <b>Description</b> tab, and get the value of the <b>DNS Name</b>
     *        field that begins with dualstack. Use the same process to get the <b>Hosted Zone ID</b>. See
     *        <a>HostedZone$Id</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>Elastic Load Balancing API</i>: Use
     *        <code> <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_DescribeLoadBalancers.html">DescribeLoadBalancers</a> </code>
     *        to get the value of <code>CanonicalHostedZoneName</code>. Use the same process to get the
     *        <code>CanonicalHostedZoneNameId</code>. See <a>HostedZone$Id</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>AWS CLI</i>: Use
     *        <code> <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_DescribeLoadBalancers.html">describe-load-balancers</a> </code>
     *        to get the value of <code>CanonicalHostedZoneName</code>. Use the same process to get the
     *        <code>CanonicalHostedZoneNameId</code>. See HostedZoneId.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>An Amazon S3 bucket that is configured as a static website:</b> Specify the domain name of the Amazon
     *        S3 website endpoint in which you created the bucket; for example,
     *        <code>s3-website-us-east-1.amazonaws.com</code>. For more information about valid values, see the table <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Amazon Simple Storage Service
     *        (S3) Website Endpoints</a> in the <i>Amazon Web Services General Reference</i>. For more information about
     *        using S3 buckets for websites, see <a
     *        href="http://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html">Hosting a Static Website on
     *        Amazon S3</a> in the <i>Amazon S3 Developer Guide.</i>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Another Amazon Route 53 resource record set</b>: Specify the value of the <code>Name</code> element for
     *        a resource record set in the current hosted zone.
     *        </p>
     *        </li>
     */

    public void setDNSName(String dNSName) {
        this.dNSName = dNSName;
    }

    /**
     * <p>
     * <i>Alias resource record sets only:</i> The value that you specify depends on where you want to route queries:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>A CloudFront distribution:</b> Specify the domain name that CloudFront assigned when you created your
     * distribution.
     * </p>
     * <p>
     * Your CloudFront distribution must include an alternate domain name that matches the name of the resource record
     * set. For example, if the name of the resource record set is <i>acme.example.com</i>, your CloudFront distribution
     * must include <i>acme.example.com</i> as one of the alternate domain names. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/CNAMEs.html">Using Alternate Domain Names
     * (CNAMEs)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Elastic Beanstalk environment</b>: Specify the <code>CNAME</code> attribute for the environment. (The
     * environment must have a regionalized domain name.) You can use the following methods to get the value of the
     * CNAME attribute:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AWS Managment Console</i>: For information about how to get the value by using the console, see <a
     * href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/customdomains.html">Using Custom Domains with AWS
     * Elastic Beanstalk</a> in the <i>AWS Elastic Beanstalk Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Elastic Load Balancing API</i>: Use the <code>DescribeEnvironments</code> action to get the value of the
     * <code>CNAME</code> attribute. For more information, see <a
     * href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/API_DescribeEnvironments.html"
     * >DescribeEnvironments</a> in the <i>AWS Elastic Beanstalk API Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>AWS CLI</i>: Use the describe-environments command to get the value of the <code>CNAME</code> attribute. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/cli/latest/reference/elasticbeanstalk/describe-environments.html"
     * >describe-environments</a> in the <i>AWS Command Line Interface Reference</i>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>An ELB load balancer:</b> Specify the DNS name associated with the load balancer. Get the DNS name by using
     * the AWS Management Console, the ELB API, or the AWS CLI. Use the same method to get values for
     * <code>HostedZoneId</code> and <code>DNSName</code>. If you get one value from the console and the other value
     * from the API or the CLI, creating the resource record set will fail.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AWS Management Console</i>: Go to the EC2 page, click <b>Load Balancers</b> in the navigation pane, choose the
     * load balancer, choose the <b>Description</b> tab, and get the value of the <b>DNS Name</b> field that begins with
     * dualstack. Use the same process to get the <b>Hosted Zone ID</b>. See <a>HostedZone$Id</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Elastic Load Balancing API</i>: Use
     * <code> <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_DescribeLoadBalancers.html">DescribeLoadBalancers</a> </code>
     * to get the value of <code>CanonicalHostedZoneName</code>. Use the same process to get the
     * <code>CanonicalHostedZoneNameId</code>. See <a>HostedZone$Id</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>AWS CLI</i>: Use
     * <code> <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_DescribeLoadBalancers.html">describe-load-balancers</a> </code>
     * to get the value of <code>CanonicalHostedZoneName</code>. Use the same process to get the
     * <code>CanonicalHostedZoneNameId</code>. See HostedZoneId.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>An Amazon S3 bucket that is configured as a static website:</b> Specify the domain name of the Amazon S3
     * website endpoint in which you created the bucket; for example, <code>s3-website-us-east-1.amazonaws.com</code>.
     * For more information about valid values, see the table <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Amazon Simple Storage Service (S3)
     * Website Endpoints</a> in the <i>Amazon Web Services General Reference</i>. For more information about using S3
     * buckets for websites, see <a href="http://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html">Hosting a
     * Static Website on Amazon S3</a> in the <i>Amazon S3 Developer Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Another Amazon Route 53 resource record set</b>: Specify the value of the <code>Name</code> element for a
     * resource record set in the current hosted zone.
     * </p>
     * </li>
     * </ul>
     * 
     * @return <i>Alias resource record sets only:</i> The value that you specify depends on where you want to route
     *         queries:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>A CloudFront distribution:</b> Specify the domain name that CloudFront assigned when you created your
     *         distribution.
     *         </p>
     *         <p>
     *         Your CloudFront distribution must include an alternate domain name that matches the name of the resource
     *         record set. For example, if the name of the resource record set is <i>acme.example.com</i>, your
     *         CloudFront distribution must include <i>acme.example.com</i> as one of the alternate domain names. For
     *         more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/CNAMEs.html">Using Alternate
     *         Domain Names (CNAMEs)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Elastic Beanstalk environment</b>: Specify the <code>CNAME</code> attribute for the environment. (The
     *         environment must have a regionalized domain name.) You can use the following methods to get the value of
     *         the CNAME attribute:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>AWS Managment Console</i>: For information about how to get the value by using the console, see <a
     *         href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/customdomains.html">Using Custom Domains with
     *         AWS Elastic Beanstalk</a> in the <i>AWS Elastic Beanstalk Developer Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Elastic Load Balancing API</i>: Use the <code>DescribeEnvironments</code> action to get the value of
     *         the <code>CNAME</code> attribute. For more information, see <a
     *         href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/API_DescribeEnvironments.html"
     *         >DescribeEnvironments</a> in the <i>AWS Elastic Beanstalk API Reference</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>AWS CLI</i>: Use the describe-environments command to get the value of the <code>CNAME</code>
     *         attribute. For more information, see <a
     *         href="http://docs.aws.amazon.com/cli/latest/reference/elasticbeanstalk/describe-environments.html"
     *         >describe-environments</a> in the <i>AWS Command Line Interface Reference</i>.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <b>An ELB load balancer:</b> Specify the DNS name associated with the load balancer. Get the DNS name by
     *         using the AWS Management Console, the ELB API, or the AWS CLI. Use the same method to get values for
     *         <code>HostedZoneId</code> and <code>DNSName</code>. If you get one value from the console and the other
     *         value from the API or the CLI, creating the resource record set will fail.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>AWS Management Console</i>: Go to the EC2 page, click <b>Load Balancers</b> in the navigation pane,
     *         choose the load balancer, choose the <b>Description</b> tab, and get the value of the <b>DNS Name</b>
     *         field that begins with dualstack. Use the same process to get the <b>Hosted Zone ID</b>. See
     *         <a>HostedZone$Id</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Elastic Load Balancing API</i>: Use
     *         <code> <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_DescribeLoadBalancers.html">DescribeLoadBalancers</a> </code>
     *         to get the value of <code>CanonicalHostedZoneName</code>. Use the same process to get the
     *         <code>CanonicalHostedZoneNameId</code>. See <a>HostedZone$Id</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>AWS CLI</i>: Use
     *         <code> <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_DescribeLoadBalancers.html">describe-load-balancers</a> </code>
     *         to get the value of <code>CanonicalHostedZoneName</code>. Use the same process to get the
     *         <code>CanonicalHostedZoneNameId</code>. See HostedZoneId.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <b>An Amazon S3 bucket that is configured as a static website:</b> Specify the domain name of the Amazon
     *         S3 website endpoint in which you created the bucket; for example,
     *         <code>s3-website-us-east-1.amazonaws.com</code>. For more information about valid values, see the table
     *         <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Amazon Simple Storage Service
     *         (S3) Website Endpoints</a> in the <i>Amazon Web Services General Reference</i>. For more information
     *         about using S3 buckets for websites, see <a
     *         href="http://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html">Hosting a Static Website on
     *         Amazon S3</a> in the <i>Amazon S3 Developer Guide.</i>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Another Amazon Route 53 resource record set</b>: Specify the value of the <code>Name</code> element
     *         for a resource record set in the current hosted zone.
     *         </p>
     *         </li>
     */

    public String getDNSName() {
        return this.dNSName;
    }

    /**
     * <p>
     * <i>Alias resource record sets only:</i> The value that you specify depends on where you want to route queries:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>A CloudFront distribution:</b> Specify the domain name that CloudFront assigned when you created your
     * distribution.
     * </p>
     * <p>
     * Your CloudFront distribution must include an alternate domain name that matches the name of the resource record
     * set. For example, if the name of the resource record set is <i>acme.example.com</i>, your CloudFront distribution
     * must include <i>acme.example.com</i> as one of the alternate domain names. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/CNAMEs.html">Using Alternate Domain Names
     * (CNAMEs)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Elastic Beanstalk environment</b>: Specify the <code>CNAME</code> attribute for the environment. (The
     * environment must have a regionalized domain name.) You can use the following methods to get the value of the
     * CNAME attribute:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AWS Managment Console</i>: For information about how to get the value by using the console, see <a
     * href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/customdomains.html">Using Custom Domains with AWS
     * Elastic Beanstalk</a> in the <i>AWS Elastic Beanstalk Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Elastic Load Balancing API</i>: Use the <code>DescribeEnvironments</code> action to get the value of the
     * <code>CNAME</code> attribute. For more information, see <a
     * href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/API_DescribeEnvironments.html"
     * >DescribeEnvironments</a> in the <i>AWS Elastic Beanstalk API Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>AWS CLI</i>: Use the describe-environments command to get the value of the <code>CNAME</code> attribute. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/cli/latest/reference/elasticbeanstalk/describe-environments.html"
     * >describe-environments</a> in the <i>AWS Command Line Interface Reference</i>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>An ELB load balancer:</b> Specify the DNS name associated with the load balancer. Get the DNS name by using
     * the AWS Management Console, the ELB API, or the AWS CLI. Use the same method to get values for
     * <code>HostedZoneId</code> and <code>DNSName</code>. If you get one value from the console and the other value
     * from the API or the CLI, creating the resource record set will fail.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AWS Management Console</i>: Go to the EC2 page, click <b>Load Balancers</b> in the navigation pane, choose the
     * load balancer, choose the <b>Description</b> tab, and get the value of the <b>DNS Name</b> field that begins with
     * dualstack. Use the same process to get the <b>Hosted Zone ID</b>. See <a>HostedZone$Id</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Elastic Load Balancing API</i>: Use
     * <code> <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_DescribeLoadBalancers.html">DescribeLoadBalancers</a> </code>
     * to get the value of <code>CanonicalHostedZoneName</code>. Use the same process to get the
     * <code>CanonicalHostedZoneNameId</code>. See <a>HostedZone$Id</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>AWS CLI</i>: Use
     * <code> <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_DescribeLoadBalancers.html">describe-load-balancers</a> </code>
     * to get the value of <code>CanonicalHostedZoneName</code>. Use the same process to get the
     * <code>CanonicalHostedZoneNameId</code>. See HostedZoneId.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>An Amazon S3 bucket that is configured as a static website:</b> Specify the domain name of the Amazon S3
     * website endpoint in which you created the bucket; for example, <code>s3-website-us-east-1.amazonaws.com</code>.
     * For more information about valid values, see the table <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Amazon Simple Storage Service (S3)
     * Website Endpoints</a> in the <i>Amazon Web Services General Reference</i>. For more information about using S3
     * buckets for websites, see <a href="http://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html">Hosting a
     * Static Website on Amazon S3</a> in the <i>Amazon S3 Developer Guide.</i>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Another Amazon Route 53 resource record set</b>: Specify the value of the <code>Name</code> element for a
     * resource record set in the current hosted zone.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dNSName
     *        <i>Alias resource record sets only:</i> The value that you specify depends on where you want to route
     *        queries:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>A CloudFront distribution:</b> Specify the domain name that CloudFront assigned when you created your
     *        distribution.
     *        </p>
     *        <p>
     *        Your CloudFront distribution must include an alternate domain name that matches the name of the resource
     *        record set. For example, if the name of the resource record set is <i>acme.example.com</i>, your
     *        CloudFront distribution must include <i>acme.example.com</i> as one of the alternate domain names. For
     *        more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/CNAMEs.html">Using Alternate
     *        Domain Names (CNAMEs)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Elastic Beanstalk environment</b>: Specify the <code>CNAME</code> attribute for the environment. (The
     *        environment must have a regionalized domain name.) You can use the following methods to get the value of
     *        the CNAME attribute:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>AWS Managment Console</i>: For information about how to get the value by using the console, see <a
     *        href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/customdomains.html">Using Custom Domains with
     *        AWS Elastic Beanstalk</a> in the <i>AWS Elastic Beanstalk Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>Elastic Load Balancing API</i>: Use the <code>DescribeEnvironments</code> action to get the value of
     *        the <code>CNAME</code> attribute. For more information, see <a
     *        href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/API_DescribeEnvironments.html"
     *        >DescribeEnvironments</a> in the <i>AWS Elastic Beanstalk API Reference</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>AWS CLI</i>: Use the describe-environments command to get the value of the <code>CNAME</code>
     *        attribute. For more information, see <a
     *        href="http://docs.aws.amazon.com/cli/latest/reference/elasticbeanstalk/describe-environments.html"
     *        >describe-environments</a> in the <i>AWS Command Line Interface Reference</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>An ELB load balancer:</b> Specify the DNS name associated with the load balancer. Get the DNS name by
     *        using the AWS Management Console, the ELB API, or the AWS CLI. Use the same method to get values for
     *        <code>HostedZoneId</code> and <code>DNSName</code>. If you get one value from the console and the other
     *        value from the API or the CLI, creating the resource record set will fail.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>AWS Management Console</i>: Go to the EC2 page, click <b>Load Balancers</b> in the navigation pane,
     *        choose the load balancer, choose the <b>Description</b> tab, and get the value of the <b>DNS Name</b>
     *        field that begins with dualstack. Use the same process to get the <b>Hosted Zone ID</b>. See
     *        <a>HostedZone$Id</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>Elastic Load Balancing API</i>: Use
     *        <code> <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_DescribeLoadBalancers.html">DescribeLoadBalancers</a> </code>
     *        to get the value of <code>CanonicalHostedZoneName</code>. Use the same process to get the
     *        <code>CanonicalHostedZoneNameId</code>. See <a>HostedZone$Id</a>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>AWS CLI</i>: Use
     *        <code> <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_DescribeLoadBalancers.html">describe-load-balancers</a> </code>
     *        to get the value of <code>CanonicalHostedZoneName</code>. Use the same process to get the
     *        <code>CanonicalHostedZoneNameId</code>. See HostedZoneId.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>An Amazon S3 bucket that is configured as a static website:</b> Specify the domain name of the Amazon
     *        S3 website endpoint in which you created the bucket; for example,
     *        <code>s3-website-us-east-1.amazonaws.com</code>. For more information about valid values, see the table <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Amazon Simple Storage Service
     *        (S3) Website Endpoints</a> in the <i>Amazon Web Services General Reference</i>. For more information about
     *        using S3 buckets for websites, see <a
     *        href="http://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html">Hosting a Static Website on
     *        Amazon S3</a> in the <i>Amazon S3 Developer Guide.</i>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Another Amazon Route 53 resource record set</b>: Specify the value of the <code>Name</code> element for
     *        a resource record set in the current hosted zone.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AliasTarget withDNSName(String dNSName) {
        setDNSName(dNSName);
        return this;
    }

    /**
     * <p>
     * <i>Applies only to alias, weighted alias, latency alias, and failover alias record sets:</i> If you set the value
     * of <code>EvaluateTargetHealth</code> to <code>true</code> for the resource record set or sets in an alias,
     * weighted alias, latency alias, or failover alias resource record set, and if you specify a value for
     * <code> <a>HealthCheck$Id</a> </code> for every resource record set that is referenced by these alias resource
     * record sets, the alias resource record sets inherit the health of the referenced resource record sets.
     * </p>
     * <p>
     * In this configuration, when Amazon Route 53 receives a DNS query for an alias resource record set:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Route 53 looks at the resource record sets that are referenced by the alias resource record sets to
     * determine which health checks they're using.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Route 53 checks the current status of each health check. (Amazon Route 53 periodically checks the health
     * of the endpoint that is specified in a health check; it doesn't perform the health check when the DNS query
     * arrives.)
     * </p>
     * </li>
     * <li>
     * <p>
     * Based on the status of the health checks, Amazon Route 53 determines which resource record sets are healthy.
     * Unhealthy resource record sets are immediately removed from consideration. In addition, if all of the resource
     * record sets that are referenced by an alias resource record set are unhealthy, that alias resource record set
     * also is immediately removed from consideration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Based on the configuration of the alias resource record sets (weighted alias or latency alias, for example) and
     * the configuration of the resource record sets that they reference, Amazon Route 53 chooses a resource record set
     * from the healthy resource record sets, and responds to the query.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't set <code>EvaluateTargetHealth</code> to <code>true</code> when the alias target is a CloudFront
     * distribution.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the AWS resource that you specify in <code>AliasTarget</code> is a resource record set or a group of resource
     * record sets (for example, a group of weighted resource record sets), but it is not another alias resource record
     * set, we recommend that you associate a health check with all of the resource record sets in the alias target.For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html#dns-failover-complex-configs-hc-omitting"
     * >What Happens When You Omit Health Checks?</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify an Elastic Beanstalk environment in <code>HostedZoneId</code> and <code>DNSName</code>, and if the
     * environment contains an ELB load balancer, Elastic Load Balancing routes queries only to the healthy Amazon EC2
     * instances that are registered with the load balancer. (An environment automatically contains an ELB load balancer
     * if it includes more than one EC2 instance.) If you set <code>EvaluateTargetHealth</code> to <code>true</code> and
     * either no EC2 instances are healthy or the load balancer itself is unhealthy, Amazon Route 53 routes queries to
     * other available resources that are healthy, if any.
     * </p>
     * <p>
     * If the environment contains a single EC2 instance, there are no special requirements.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify an ELB load balancer in <code> <a>AliasTarget</a> </code>, Elastic Load Balancing routes queries
     * only to the healthy EC2 instances that are registered with the load balancer. If no EC2 instances are healthy or
     * if the load balancer itself is unhealthy, and if <code>EvaluateTargetHealth</code> is true for the corresponding
     * alias resource record set, Amazon Route 53 routes queries to other resources. When you create a load balancer,
     * you configure settings for Elastic Load Balancing health checks; they're not Amazon Route 53 health checks, but
     * they perform a similar function. Do not create Amazon Route 53 health checks for the EC2 instances that you
     * register with an ELB load balancer.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html">How Health
     * Checks Work in More Complex Amazon Route 53 Configurations</a> in the <i>Amazon Route 53 Developers Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * We recommend that you set <code>EvaluateTargetHealth</code> to true only when you have enough idle capacity to
     * handle the failure of one or more endpoints.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information and examples, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html">Amazon Route 53 Health Checks
     * and DNS Failover</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * 
     * @param evaluateTargetHealth
     *        <i>Applies only to alias, weighted alias, latency alias, and failover alias record sets:</i> If you set
     *        the value of <code>EvaluateTargetHealth</code> to <code>true</code> for the resource record set or sets in
     *        an alias, weighted alias, latency alias, or failover alias resource record set, and if you specify a value
     *        for <code> <a>HealthCheck$Id</a> </code> for every resource record set that is referenced by these alias
     *        resource record sets, the alias resource record sets inherit the health of the referenced resource record
     *        sets.</p>
     *        <p>
     *        In this configuration, when Amazon Route 53 receives a DNS query for an alias resource record set:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Amazon Route 53 looks at the resource record sets that are referenced by the alias resource record sets to
     *        determine which health checks they're using.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Route 53 checks the current status of each health check. (Amazon Route 53 periodically checks the
     *        health of the endpoint that is specified in a health check; it doesn't perform the health check when the
     *        DNS query arrives.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Based on the status of the health checks, Amazon Route 53 determines which resource record sets are
     *        healthy. Unhealthy resource record sets are immediately removed from consideration. In addition, if all of
     *        the resource record sets that are referenced by an alias resource record set are unhealthy, that alias
     *        resource record set also is immediately removed from consideration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Based on the configuration of the alias resource record sets (weighted alias or latency alias, for
     *        example) and the configuration of the resource record sets that they reference, Amazon Route 53 chooses a
     *        resource record set from the healthy resource record sets, and responds to the query.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Note the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You can't set <code>EvaluateTargetHealth</code> to <code>true</code> when the alias target is a CloudFront
     *        distribution.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the AWS resource that you specify in <code>AliasTarget</code> is a resource record set or a group of
     *        resource record sets (for example, a group of weighted resource record sets), but it is not another alias
     *        resource record set, we recommend that you associate a health check with all of the resource record sets
     *        in the alias target.For more information, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html#dns-failover-complex-configs-hc-omitting"
     *        >What Happens When You Omit Health Checks?</a> in the <i>Amazon Route 53 Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify an Elastic Beanstalk environment in <code>HostedZoneId</code> and <code>DNSName</code>, and
     *        if the environment contains an ELB load balancer, Elastic Load Balancing routes queries only to the
     *        healthy Amazon EC2 instances that are registered with the load balancer. (An environment automatically
     *        contains an ELB load balancer if it includes more than one EC2 instance.) If you set
     *        <code>EvaluateTargetHealth</code> to <code>true</code> and either no EC2 instances are healthy or the load
     *        balancer itself is unhealthy, Amazon Route 53 routes queries to other available resources that are
     *        healthy, if any.
     *        </p>
     *        <p>
     *        If the environment contains a single EC2 instance, there are no special requirements.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify an ELB load balancer in <code> <a>AliasTarget</a> </code>, Elastic Load Balancing routes
     *        queries only to the healthy EC2 instances that are registered with the load balancer. If no EC2 instances
     *        are healthy or if the load balancer itself is unhealthy, and if <code>EvaluateTargetHealth</code> is true
     *        for the corresponding alias resource record set, Amazon Route 53 routes queries to other resources. When
     *        you create a load balancer, you configure settings for Elastic Load Balancing health checks; they're not
     *        Amazon Route 53 health checks, but they perform a similar function. Do not create Amazon Route 53 health
     *        checks for the EC2 instances that you register with an ELB load balancer.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html">How
     *        Health Checks Work in More Complex Amazon Route 53 Configurations</a> in the <i>Amazon Route 53 Developers
     *        Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        We recommend that you set <code>EvaluateTargetHealth</code> to true only when you have enough idle
     *        capacity to handle the failure of one or more endpoints.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information and examples, see <a
     *        href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html">Amazon Route 53 Health
     *        Checks and DNS Failover</a> in the <i>Amazon Route 53 Developer Guide</i>.
     */

    public void setEvaluateTargetHealth(Boolean evaluateTargetHealth) {
        this.evaluateTargetHealth = evaluateTargetHealth;
    }

    /**
     * <p>
     * <i>Applies only to alias, weighted alias, latency alias, and failover alias record sets:</i> If you set the value
     * of <code>EvaluateTargetHealth</code> to <code>true</code> for the resource record set or sets in an alias,
     * weighted alias, latency alias, or failover alias resource record set, and if you specify a value for
     * <code> <a>HealthCheck$Id</a> </code> for every resource record set that is referenced by these alias resource
     * record sets, the alias resource record sets inherit the health of the referenced resource record sets.
     * </p>
     * <p>
     * In this configuration, when Amazon Route 53 receives a DNS query for an alias resource record set:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Route 53 looks at the resource record sets that are referenced by the alias resource record sets to
     * determine which health checks they're using.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Route 53 checks the current status of each health check. (Amazon Route 53 periodically checks the health
     * of the endpoint that is specified in a health check; it doesn't perform the health check when the DNS query
     * arrives.)
     * </p>
     * </li>
     * <li>
     * <p>
     * Based on the status of the health checks, Amazon Route 53 determines which resource record sets are healthy.
     * Unhealthy resource record sets are immediately removed from consideration. In addition, if all of the resource
     * record sets that are referenced by an alias resource record set are unhealthy, that alias resource record set
     * also is immediately removed from consideration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Based on the configuration of the alias resource record sets (weighted alias or latency alias, for example) and
     * the configuration of the resource record sets that they reference, Amazon Route 53 chooses a resource record set
     * from the healthy resource record sets, and responds to the query.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't set <code>EvaluateTargetHealth</code> to <code>true</code> when the alias target is a CloudFront
     * distribution.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the AWS resource that you specify in <code>AliasTarget</code> is a resource record set or a group of resource
     * record sets (for example, a group of weighted resource record sets), but it is not another alias resource record
     * set, we recommend that you associate a health check with all of the resource record sets in the alias target.For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html#dns-failover-complex-configs-hc-omitting"
     * >What Happens When You Omit Health Checks?</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify an Elastic Beanstalk environment in <code>HostedZoneId</code> and <code>DNSName</code>, and if the
     * environment contains an ELB load balancer, Elastic Load Balancing routes queries only to the healthy Amazon EC2
     * instances that are registered with the load balancer. (An environment automatically contains an ELB load balancer
     * if it includes more than one EC2 instance.) If you set <code>EvaluateTargetHealth</code> to <code>true</code> and
     * either no EC2 instances are healthy or the load balancer itself is unhealthy, Amazon Route 53 routes queries to
     * other available resources that are healthy, if any.
     * </p>
     * <p>
     * If the environment contains a single EC2 instance, there are no special requirements.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify an ELB load balancer in <code> <a>AliasTarget</a> </code>, Elastic Load Balancing routes queries
     * only to the healthy EC2 instances that are registered with the load balancer. If no EC2 instances are healthy or
     * if the load balancer itself is unhealthy, and if <code>EvaluateTargetHealth</code> is true for the corresponding
     * alias resource record set, Amazon Route 53 routes queries to other resources. When you create a load balancer,
     * you configure settings for Elastic Load Balancing health checks; they're not Amazon Route 53 health checks, but
     * they perform a similar function. Do not create Amazon Route 53 health checks for the EC2 instances that you
     * register with an ELB load balancer.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html">How Health
     * Checks Work in More Complex Amazon Route 53 Configurations</a> in the <i>Amazon Route 53 Developers Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * We recommend that you set <code>EvaluateTargetHealth</code> to true only when you have enough idle capacity to
     * handle the failure of one or more endpoints.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information and examples, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html">Amazon Route 53 Health Checks
     * and DNS Failover</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * 
     * @return <i>Applies only to alias, weighted alias, latency alias, and failover alias record sets:</i> If you set
     *         the value of <code>EvaluateTargetHealth</code> to <code>true</code> for the resource record set or sets
     *         in an alias, weighted alias, latency alias, or failover alias resource record set, and if you specify a
     *         value for <code> <a>HealthCheck$Id</a> </code> for every resource record set that is referenced by these
     *         alias resource record sets, the alias resource record sets inherit the health of the referenced resource
     *         record sets.</p>
     *         <p>
     *         In this configuration, when Amazon Route 53 receives a DNS query for an alias resource record set:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Amazon Route 53 looks at the resource record sets that are referenced by the alias resource record sets
     *         to determine which health checks they're using.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Route 53 checks the current status of each health check. (Amazon Route 53 periodically checks the
     *         health of the endpoint that is specified in a health check; it doesn't perform the health check when the
     *         DNS query arrives.)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Based on the status of the health checks, Amazon Route 53 determines which resource record sets are
     *         healthy. Unhealthy resource record sets are immediately removed from consideration. In addition, if all
     *         of the resource record sets that are referenced by an alias resource record set are unhealthy, that alias
     *         resource record set also is immediately removed from consideration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Based on the configuration of the alias resource record sets (weighted alias or latency alias, for
     *         example) and the configuration of the resource record sets that they reference, Amazon Route 53 chooses a
     *         resource record set from the healthy resource record sets, and responds to the query.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Note the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You can't set <code>EvaluateTargetHealth</code> to <code>true</code> when the alias target is a
     *         CloudFront distribution.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the AWS resource that you specify in <code>AliasTarget</code> is a resource record set or a group of
     *         resource record sets (for example, a group of weighted resource record sets), but it is not another alias
     *         resource record set, we recommend that you associate a health check with all of the resource record sets
     *         in the alias target.For more information, see <a href=
     *         "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html#dns-failover-complex-configs-hc-omitting"
     *         >What Happens When You Omit Health Checks?</a> in the <i>Amazon Route 53 Developer Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you specify an Elastic Beanstalk environment in <code>HostedZoneId</code> and <code>DNSName</code>,
     *         and if the environment contains an ELB load balancer, Elastic Load Balancing routes queries only to the
     *         healthy Amazon EC2 instances that are registered with the load balancer. (An environment automatically
     *         contains an ELB load balancer if it includes more than one EC2 instance.) If you set
     *         <code>EvaluateTargetHealth</code> to <code>true</code> and either no EC2 instances are healthy or the
     *         load balancer itself is unhealthy, Amazon Route 53 routes queries to other available resources that are
     *         healthy, if any.
     *         </p>
     *         <p>
     *         If the environment contains a single EC2 instance, there are no special requirements.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you specify an ELB load balancer in <code> <a>AliasTarget</a> </code>, Elastic Load Balancing routes
     *         queries only to the healthy EC2 instances that are registered with the load balancer. If no EC2 instances
     *         are healthy or if the load balancer itself is unhealthy, and if <code>EvaluateTargetHealth</code> is true
     *         for the corresponding alias resource record set, Amazon Route 53 routes queries to other resources. When
     *         you create a load balancer, you configure settings for Elastic Load Balancing health checks; they're not
     *         Amazon Route 53 health checks, but they perform a similar function. Do not create Amazon Route 53 health
     *         checks for the EC2 instances that you register with an ELB load balancer.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html">How
     *         Health Checks Work in More Complex Amazon Route 53 Configurations</a> in the <i>Amazon Route 53
     *         Developers Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         We recommend that you set <code>EvaluateTargetHealth</code> to true only when you have enough idle
     *         capacity to handle the failure of one or more endpoints.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information and examples, see <a
     *         href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html">Amazon Route 53 Health
     *         Checks and DNS Failover</a> in the <i>Amazon Route 53 Developer Guide</i>.
     */

    public Boolean getEvaluateTargetHealth() {
        return this.evaluateTargetHealth;
    }

    /**
     * <p>
     * <i>Applies only to alias, weighted alias, latency alias, and failover alias record sets:</i> If you set the value
     * of <code>EvaluateTargetHealth</code> to <code>true</code> for the resource record set or sets in an alias,
     * weighted alias, latency alias, or failover alias resource record set, and if you specify a value for
     * <code> <a>HealthCheck$Id</a> </code> for every resource record set that is referenced by these alias resource
     * record sets, the alias resource record sets inherit the health of the referenced resource record sets.
     * </p>
     * <p>
     * In this configuration, when Amazon Route 53 receives a DNS query for an alias resource record set:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Route 53 looks at the resource record sets that are referenced by the alias resource record sets to
     * determine which health checks they're using.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Route 53 checks the current status of each health check. (Amazon Route 53 periodically checks the health
     * of the endpoint that is specified in a health check; it doesn't perform the health check when the DNS query
     * arrives.)
     * </p>
     * </li>
     * <li>
     * <p>
     * Based on the status of the health checks, Amazon Route 53 determines which resource record sets are healthy.
     * Unhealthy resource record sets are immediately removed from consideration. In addition, if all of the resource
     * record sets that are referenced by an alias resource record set are unhealthy, that alias resource record set
     * also is immediately removed from consideration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Based on the configuration of the alias resource record sets (weighted alias or latency alias, for example) and
     * the configuration of the resource record sets that they reference, Amazon Route 53 chooses a resource record set
     * from the healthy resource record sets, and responds to the query.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't set <code>EvaluateTargetHealth</code> to <code>true</code> when the alias target is a CloudFront
     * distribution.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the AWS resource that you specify in <code>AliasTarget</code> is a resource record set or a group of resource
     * record sets (for example, a group of weighted resource record sets), but it is not another alias resource record
     * set, we recommend that you associate a health check with all of the resource record sets in the alias target.For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html#dns-failover-complex-configs-hc-omitting"
     * >What Happens When You Omit Health Checks?</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify an Elastic Beanstalk environment in <code>HostedZoneId</code> and <code>DNSName</code>, and if the
     * environment contains an ELB load balancer, Elastic Load Balancing routes queries only to the healthy Amazon EC2
     * instances that are registered with the load balancer. (An environment automatically contains an ELB load balancer
     * if it includes more than one EC2 instance.) If you set <code>EvaluateTargetHealth</code> to <code>true</code> and
     * either no EC2 instances are healthy or the load balancer itself is unhealthy, Amazon Route 53 routes queries to
     * other available resources that are healthy, if any.
     * </p>
     * <p>
     * If the environment contains a single EC2 instance, there are no special requirements.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify an ELB load balancer in <code> <a>AliasTarget</a> </code>, Elastic Load Balancing routes queries
     * only to the healthy EC2 instances that are registered with the load balancer. If no EC2 instances are healthy or
     * if the load balancer itself is unhealthy, and if <code>EvaluateTargetHealth</code> is true for the corresponding
     * alias resource record set, Amazon Route 53 routes queries to other resources. When you create a load balancer,
     * you configure settings for Elastic Load Balancing health checks; they're not Amazon Route 53 health checks, but
     * they perform a similar function. Do not create Amazon Route 53 health checks for the EC2 instances that you
     * register with an ELB load balancer.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html">How Health
     * Checks Work in More Complex Amazon Route 53 Configurations</a> in the <i>Amazon Route 53 Developers Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * We recommend that you set <code>EvaluateTargetHealth</code> to true only when you have enough idle capacity to
     * handle the failure of one or more endpoints.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information and examples, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html">Amazon Route 53 Health Checks
     * and DNS Failover</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * 
     * @param evaluateTargetHealth
     *        <i>Applies only to alias, weighted alias, latency alias, and failover alias record sets:</i> If you set
     *        the value of <code>EvaluateTargetHealth</code> to <code>true</code> for the resource record set or sets in
     *        an alias, weighted alias, latency alias, or failover alias resource record set, and if you specify a value
     *        for <code> <a>HealthCheck$Id</a> </code> for every resource record set that is referenced by these alias
     *        resource record sets, the alias resource record sets inherit the health of the referenced resource record
     *        sets.</p>
     *        <p>
     *        In this configuration, when Amazon Route 53 receives a DNS query for an alias resource record set:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Amazon Route 53 looks at the resource record sets that are referenced by the alias resource record sets to
     *        determine which health checks they're using.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Route 53 checks the current status of each health check. (Amazon Route 53 periodically checks the
     *        health of the endpoint that is specified in a health check; it doesn't perform the health check when the
     *        DNS query arrives.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Based on the status of the health checks, Amazon Route 53 determines which resource record sets are
     *        healthy. Unhealthy resource record sets are immediately removed from consideration. In addition, if all of
     *        the resource record sets that are referenced by an alias resource record set are unhealthy, that alias
     *        resource record set also is immediately removed from consideration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Based on the configuration of the alias resource record sets (weighted alias or latency alias, for
     *        example) and the configuration of the resource record sets that they reference, Amazon Route 53 chooses a
     *        resource record set from the healthy resource record sets, and responds to the query.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Note the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        You can't set <code>EvaluateTargetHealth</code> to <code>true</code> when the alias target is a CloudFront
     *        distribution.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the AWS resource that you specify in <code>AliasTarget</code> is a resource record set or a group of
     *        resource record sets (for example, a group of weighted resource record sets), but it is not another alias
     *        resource record set, we recommend that you associate a health check with all of the resource record sets
     *        in the alias target.For more information, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html#dns-failover-complex-configs-hc-omitting"
     *        >What Happens When You Omit Health Checks?</a> in the <i>Amazon Route 53 Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify an Elastic Beanstalk environment in <code>HostedZoneId</code> and <code>DNSName</code>, and
     *        if the environment contains an ELB load balancer, Elastic Load Balancing routes queries only to the
     *        healthy Amazon EC2 instances that are registered with the load balancer. (An environment automatically
     *        contains an ELB load balancer if it includes more than one EC2 instance.) If you set
     *        <code>EvaluateTargetHealth</code> to <code>true</code> and either no EC2 instances are healthy or the load
     *        balancer itself is unhealthy, Amazon Route 53 routes queries to other available resources that are
     *        healthy, if any.
     *        </p>
     *        <p>
     *        If the environment contains a single EC2 instance, there are no special requirements.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you specify an ELB load balancer in <code> <a>AliasTarget</a> </code>, Elastic Load Balancing routes
     *        queries only to the healthy EC2 instances that are registered with the load balancer. If no EC2 instances
     *        are healthy or if the load balancer itself is unhealthy, and if <code>EvaluateTargetHealth</code> is true
     *        for the corresponding alias resource record set, Amazon Route 53 routes queries to other resources. When
     *        you create a load balancer, you configure settings for Elastic Load Balancing health checks; they're not
     *        Amazon Route 53 health checks, but they perform a similar function. Do not create Amazon Route 53 health
     *        checks for the EC2 instances that you register with an ELB load balancer.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html">How
     *        Health Checks Work in More Complex Amazon Route 53 Configurations</a> in the <i>Amazon Route 53 Developers
     *        Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        We recommend that you set <code>EvaluateTargetHealth</code> to true only when you have enough idle
     *        capacity to handle the failure of one or more endpoints.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information and examples, see <a
     *        href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html">Amazon Route 53 Health
     *        Checks and DNS Failover</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AliasTarget withEvaluateTargetHealth(Boolean evaluateTargetHealth) {
        setEvaluateTargetHealth(evaluateTargetHealth);
        return this;
    }

    /**
     * <p>
     * <i>Applies only to alias, weighted alias, latency alias, and failover alias record sets:</i> If you set the value
     * of <code>EvaluateTargetHealth</code> to <code>true</code> for the resource record set or sets in an alias,
     * weighted alias, latency alias, or failover alias resource record set, and if you specify a value for
     * <code> <a>HealthCheck$Id</a> </code> for every resource record set that is referenced by these alias resource
     * record sets, the alias resource record sets inherit the health of the referenced resource record sets.
     * </p>
     * <p>
     * In this configuration, when Amazon Route 53 receives a DNS query for an alias resource record set:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Route 53 looks at the resource record sets that are referenced by the alias resource record sets to
     * determine which health checks they're using.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Route 53 checks the current status of each health check. (Amazon Route 53 periodically checks the health
     * of the endpoint that is specified in a health check; it doesn't perform the health check when the DNS query
     * arrives.)
     * </p>
     * </li>
     * <li>
     * <p>
     * Based on the status of the health checks, Amazon Route 53 determines which resource record sets are healthy.
     * Unhealthy resource record sets are immediately removed from consideration. In addition, if all of the resource
     * record sets that are referenced by an alias resource record set are unhealthy, that alias resource record set
     * also is immediately removed from consideration.
     * </p>
     * </li>
     * <li>
     * <p>
     * Based on the configuration of the alias resource record sets (weighted alias or latency alias, for example) and
     * the configuration of the resource record sets that they reference, Amazon Route 53 chooses a resource record set
     * from the healthy resource record sets, and responds to the query.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't set <code>EvaluateTargetHealth</code> to <code>true</code> when the alias target is a CloudFront
     * distribution.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the AWS resource that you specify in <code>AliasTarget</code> is a resource record set or a group of resource
     * record sets (for example, a group of weighted resource record sets), but it is not another alias resource record
     * set, we recommend that you associate a health check with all of the resource record sets in the alias target.For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html#dns-failover-complex-configs-hc-omitting"
     * >What Happens When You Omit Health Checks?</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify an Elastic Beanstalk environment in <code>HostedZoneId</code> and <code>DNSName</code>, and if the
     * environment contains an ELB load balancer, Elastic Load Balancing routes queries only to the healthy Amazon EC2
     * instances that are registered with the load balancer. (An environment automatically contains an ELB load balancer
     * if it includes more than one EC2 instance.) If you set <code>EvaluateTargetHealth</code> to <code>true</code> and
     * either no EC2 instances are healthy or the load balancer itself is unhealthy, Amazon Route 53 routes queries to
     * other available resources that are healthy, if any.
     * </p>
     * <p>
     * If the environment contains a single EC2 instance, there are no special requirements.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you specify an ELB load balancer in <code> <a>AliasTarget</a> </code>, Elastic Load Balancing routes queries
     * only to the healthy EC2 instances that are registered with the load balancer. If no EC2 instances are healthy or
     * if the load balancer itself is unhealthy, and if <code>EvaluateTargetHealth</code> is true for the corresponding
     * alias resource record set, Amazon Route 53 routes queries to other resources. When you create a load balancer,
     * you configure settings for Elastic Load Balancing health checks; they're not Amazon Route 53 health checks, but
     * they perform a similar function. Do not create Amazon Route 53 health checks for the EC2 instances that you
     * register with an ELB load balancer.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html">How Health
     * Checks Work in More Complex Amazon Route 53 Configurations</a> in the <i>Amazon Route 53 Developers Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * We recommend that you set <code>EvaluateTargetHealth</code> to true only when you have enough idle capacity to
     * handle the failure of one or more endpoints.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information and examples, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html">Amazon Route 53 Health Checks
     * and DNS Failover</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * 
     * @return <i>Applies only to alias, weighted alias, latency alias, and failover alias record sets:</i> If you set
     *         the value of <code>EvaluateTargetHealth</code> to <code>true</code> for the resource record set or sets
     *         in an alias, weighted alias, latency alias, or failover alias resource record set, and if you specify a
     *         value for <code> <a>HealthCheck$Id</a> </code> for every resource record set that is referenced by these
     *         alias resource record sets, the alias resource record sets inherit the health of the referenced resource
     *         record sets.</p>
     *         <p>
     *         In this configuration, when Amazon Route 53 receives a DNS query for an alias resource record set:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Amazon Route 53 looks at the resource record sets that are referenced by the alias resource record sets
     *         to determine which health checks they're using.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Route 53 checks the current status of each health check. (Amazon Route 53 periodically checks the
     *         health of the endpoint that is specified in a health check; it doesn't perform the health check when the
     *         DNS query arrives.)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Based on the status of the health checks, Amazon Route 53 determines which resource record sets are
     *         healthy. Unhealthy resource record sets are immediately removed from consideration. In addition, if all
     *         of the resource record sets that are referenced by an alias resource record set are unhealthy, that alias
     *         resource record set also is immediately removed from consideration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Based on the configuration of the alias resource record sets (weighted alias or latency alias, for
     *         example) and the configuration of the resource record sets that they reference, Amazon Route 53 chooses a
     *         resource record set from the healthy resource record sets, and responds to the query.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Note the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You can't set <code>EvaluateTargetHealth</code> to <code>true</code> when the alias target is a
     *         CloudFront distribution.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the AWS resource that you specify in <code>AliasTarget</code> is a resource record set or a group of
     *         resource record sets (for example, a group of weighted resource record sets), but it is not another alias
     *         resource record set, we recommend that you associate a health check with all of the resource record sets
     *         in the alias target.For more information, see <a href=
     *         "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html#dns-failover-complex-configs-hc-omitting"
     *         >What Happens When You Omit Health Checks?</a> in the <i>Amazon Route 53 Developer Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you specify an Elastic Beanstalk environment in <code>HostedZoneId</code> and <code>DNSName</code>,
     *         and if the environment contains an ELB load balancer, Elastic Load Balancing routes queries only to the
     *         healthy Amazon EC2 instances that are registered with the load balancer. (An environment automatically
     *         contains an ELB load balancer if it includes more than one EC2 instance.) If you set
     *         <code>EvaluateTargetHealth</code> to <code>true</code> and either no EC2 instances are healthy or the
     *         load balancer itself is unhealthy, Amazon Route 53 routes queries to other available resources that are
     *         healthy, if any.
     *         </p>
     *         <p>
     *         If the environment contains a single EC2 instance, there are no special requirements.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you specify an ELB load balancer in <code> <a>AliasTarget</a> </code>, Elastic Load Balancing routes
     *         queries only to the healthy EC2 instances that are registered with the load balancer. If no EC2 instances
     *         are healthy or if the load balancer itself is unhealthy, and if <code>EvaluateTargetHealth</code> is true
     *         for the corresponding alias resource record set, Amazon Route 53 routes queries to other resources. When
     *         you create a load balancer, you configure settings for Elastic Load Balancing health checks; they're not
     *         Amazon Route 53 health checks, but they perform a similar function. Do not create Amazon Route 53 health
     *         checks for the EC2 instances that you register with an ELB load balancer.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html">How
     *         Health Checks Work in More Complex Amazon Route 53 Configurations</a> in the <i>Amazon Route 53
     *         Developers Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         We recommend that you set <code>EvaluateTargetHealth</code> to true only when you have enough idle
     *         capacity to handle the failure of one or more endpoints.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information and examples, see <a
     *         href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html">Amazon Route 53 Health
     *         Checks and DNS Failover</a> in the <i>Amazon Route 53 Developer Guide</i>.
     */

    public Boolean isEvaluateTargetHealth() {
        return this.evaluateTargetHealth;
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
        if (other.getHostedZoneId() != null && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        if (other.getDNSName() == null ^ this.getDNSName() == null)
            return false;
        if (other.getDNSName() != null && other.getDNSName().equals(this.getDNSName()) == false)
            return false;
        if (other.getEvaluateTargetHealth() == null ^ this.getEvaluateTargetHealth() == null)
            return false;
        if (other.getEvaluateTargetHealth() != null && other.getEvaluateTargetHealth().equals(this.getEvaluateTargetHealth()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
        hashCode = prime * hashCode + ((getDNSName() == null) ? 0 : getDNSName().hashCode());
        hashCode = prime * hashCode + ((getEvaluateTargetHealth() == null) ? 0 : getEvaluateTargetHealth().hashCode());
        return hashCode;
    }

    @Override
    public AliasTarget clone() {
        try {
            return (AliasTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
