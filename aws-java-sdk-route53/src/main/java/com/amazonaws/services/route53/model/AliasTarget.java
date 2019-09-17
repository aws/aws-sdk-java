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
 * <i>Alias resource record sets only:</i> Information about the AWS resource, such as a CloudFront distribution or an
 * Amazon S3 bucket, that you want to route traffic to.
 * </p>
 * <p>
 * When creating resource record sets for a private hosted zone, note the following:
 * </p>
 * <ul>
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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/AliasTarget" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AliasTarget implements Serializable, Cloneable {

    /**
     * <p>
     * <i>Alias resource records sets only</i>: The value used depends on where you want to route traffic:
     * </p>
     * <dl>
     * <dt>Amazon API Gateway custom regional APIs and edge-optimized APIs</dt>
     * <dd>
     * <p>
     * Specify the hosted zone ID for your API. You can get the applicable value using the AWS CLI command <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-domain-names.html">get-domain-names</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For regional APIs, specify the value of <code>regionalHostedZoneId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For edge-optimized APIs, specify the value of <code>distributionHostedZoneId</code>.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Amazon Virtual Private Cloud interface VPC endpoint</dt>
     * <dd>
     * <p>
     * Specify the hosted zone ID for your interface endpoint. You can get the value of <code>HostedZoneId</code> using
     * the AWS CLI command <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-vpc-endpoints.html">describe
     * -vpc-endpoints</a>.
     * </p>
     * </dd>
     * <dt>CloudFront distribution</dt>
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
     * Specify the hosted zone ID for the region that you created the environment in. The environment must have a
     * regionalized subdomain. For a list of regions and the corresponding hosted zone IDs, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#elasticbeanstalk_region">AWS Elastic Beanstalk</a>
     * in the "AWS Regions and Endpoints" chapter of the <i>Amazon Web Services General Reference</i>.
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
     * <a href="https://docs.aws.amazon.com/general/latest/gr/rande.html#elb_region">Elastic Load Balancing</a> table in
     * the "AWS Regions and Endpoints" chapter of the <i>Amazon Web Services General Reference</i>: Use the value that
     * corresponds with the region that you created your load balancer in. Note that there are separate columns for
     * Application and Classic Load Balancers and for Network Load Balancers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AWS Management Console</b>: Go to the Amazon EC2 page, choose <b>Load Balancers</b> in the navigation pane,
     * select the load balancer, and get the value of the <b>Hosted zone</b> field on the <b>Description</b> tab.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Elastic Load Balancing API</b>: Use <code>DescribeLoadBalancers</code> to get the applicable value. For more
     * information, see the applicable guide:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Classic Load Balancers: Use <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/2012-06-01/APIReference/API_DescribeLoadBalancers.html"
     * >DescribeLoadBalancers</a> to get the value of <code>CanonicalHostedZoneNameId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Application and Network Load Balancers: Use <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html"
     * >DescribeLoadBalancers</a> to get the value of <code>CanonicalHostedZoneId</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>AWS CLI</b>: Use <code>describe-load-balancers</code> to get the applicable value. For more information, see
     * the applicable guide:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Classic Load Balancers: Use <a
     * href="http://docs.aws.amazon.com/cli/latest/reference/elb/describe-load-balancers.html"
     * >describe-load-balancers</a> to get the value of <code>CanonicalHostedZoneNameId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Application and Network Load Balancers: Use <a
     * href="http://docs.aws.amazon.com/cli/latest/reference/elbv2/describe-load-balancers.html"
     * >describe-load-balancers</a> to get the value of <code>CanonicalHostedZoneId</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </dd>
     * <dt>An Amazon S3 bucket configured as a static website</dt>
     * <dd>
     * <p>
     * Specify the hosted zone ID for the region that you created the bucket in. For more information about valid
     * values, see the <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Amazon Simple Storage
     * Service Website Endpoints</a> table in the "AWS Regions and Endpoints" chapter of the <i>Amazon Web Services
     * General Reference</i>.
     * </p>
     * </dd>
     * <dt>Another Route 53 resource record set in your hosted zone</dt>
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
     * <dl>
     * <dt>Amazon API Gateway custom regional APIs and edge-optimized APIs</dt>
     * <dd>
     * <p>
     * Specify the applicable domain name for your API. You can get the applicable value using the AWS CLI command <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-domain-names.html">get-domain-names</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For regional APIs, specify the value of <code>regionalDomainName</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For edge-optimized APIs, specify the value of <code>distributionDomainName</code>. This is the name of the
     * associated CloudFront distribution, such as <code>da1b2c3d4e5.cloudfront.net</code>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The name of the record that you're creating must match a custom domain name for your API, such as
     * <code>api.example.com</code>.
     * </p>
     * </note></dd>
     * <dt>Amazon Virtual Private Cloud interface VPC endpoint</dt>
     * <dd>
     * <p>
     * Enter the API endpoint for the interface endpoint, such as
     * <code>vpce-123456789abcdef01-example-us-east-1a.elasticloadbalancing.us-east-1.vpce.amazonaws.com</code>. For
     * edge-optimized APIs, this is the domain name for the corresponding CloudFront distribution. You can get the value
     * of <code>DnsName</code> using the AWS CLI command <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-vpc-endpoints.html"
     * >describe-vpc-endpoints</a>.
     * </p>
     * </dd>
     * <dt>CloudFront distribution</dt>
     * <dd>
     * <p>
     * Specify the domain name that CloudFront assigned when you created your distribution.
     * </p>
     * <p>
     * Your CloudFront distribution must include an alternate domain name that matches the name of the resource record
     * set. For example, if the name of the resource record set is <i>acme.example.com</i>, your CloudFront distribution
     * must include <i>acme.example.com</i> as one of the alternate domain names. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/CNAMEs.html">Using Alternate Domain Names
     * (CNAMEs)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * You can't create a resource record set in a private hosted zone to route traffic to a CloudFront distribution.
     * </p>
     * <note>
     * <p>
     * For failover alias records, you can't specify a CloudFront distribution for both the primary and secondary
     * records. A distribution must include an alternate domain name that matches the name of the record. However, the
     * primary and secondary records have the same name, and you can't include the same alternate domain name in more
     * than one distribution.
     * </p>
     * </note></dd>
     * <dt>Elastic Beanstalk environment</dt>
     * <dd>
     * <p>
     * If the domain name for your Elastic Beanstalk environment includes the region that you deployed the environment
     * in, you can create an alias record that routes traffic to the environment. For example, the domain name
     * <code>my-environment.<i>us-west-2</i>.elasticbeanstalk.com</code> is a regionalized domain name.
     * </p>
     * <important>
     * <p>
     * For environments that were created before early 2016, the domain name doesn't include the region. To route
     * traffic to these environments, you must create a CNAME record instead of an alias record. Note that you can't
     * create a CNAME record for the root domain name. For example, if your domain name is example.com, you can create a
     * record that routes traffic for acme.example.com to your Elastic Beanstalk environment, but you can't create a
     * record that routes traffic for example.com to your Elastic Beanstalk environment.
     * </p>
     * </important>
     * <p>
     * For Elastic Beanstalk environments that have regionalized subdomains, specify the <code>CNAME</code> attribute
     * for the environment. You can use the following methods to get the value of the CNAME attribute:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AWS Management Console</i>: For information about how to get the value by using the console, see <a
     * href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/customdomains.html">Using Custom Domains with AWS
     * Elastic Beanstalk</a> in the <i>AWS Elastic Beanstalk Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Elastic Beanstalk API</i>: Use the <code>DescribeEnvironments</code> action to get the value of the
     * <code>CNAME</code> attribute. For more information, see <a
     * href="http://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_DescribeEnvironments.html"
     * >DescribeEnvironments</a> in the <i>AWS Elastic Beanstalk API Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>AWS CLI</i>: Use the <code>describe-environments</code> command to get the value of the <code>CNAME</code>
     * attribute. For more information, see <a
     * href="http://docs.aws.amazon.com/cli/latest/reference/elasticbeanstalk/describe-environments.html"
     * >describe-environments</a> in the <i>AWS Command Line Interface Reference</i>.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>ELB load balancer</dt>
     * <dd>
     * <p>
     * Specify the DNS name that is associated with the load balancer. Get the DNS name by using the AWS Management
     * Console, the ELB API, or the AWS CLI.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>AWS Management Console</b>: Go to the EC2 page, choose <b>Load Balancers</b> in the navigation pane, choose
     * the load balancer, choose the <b>Description</b> tab, and get the value of the <b>DNS name</b> field.
     * </p>
     * <p>
     * If you're routing traffic to a Classic Load Balancer, get the value that begins with <b>dualstack</b>. If you're
     * routing traffic to another type of load balancer, get the value that applies to the record type, A or AAAA.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Elastic Load Balancing API</b>: Use <code>DescribeLoadBalancers</code> to get the value of
     * <code>DNSName</code>. For more information, see the applicable guide:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Classic Load Balancers: <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/2012-06-01/APIReference/API_DescribeLoadBalancers.html"
     * >DescribeLoadBalancers</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Application and Network Load Balancers: <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html"
     * >DescribeLoadBalancers</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>AWS CLI</b>: Use <code>describe-load-balancers</code> to get the value of <code>DNSName</code>. For more
     * information, see the applicable guide:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Classic Load Balancers: <a
     * href="http://docs.aws.amazon.com/cli/latest/reference/elb/describe-load-balancers.html"
     * >describe-load-balancers</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Application and Network Load Balancers: <a
     * href="http://docs.aws.amazon.com/cli/latest/reference/elbv2/describe-load-balancers.html"
     * >describe-load-balancers</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </dd>
     * <dt>Amazon S3 bucket that is configured as a static website</dt>
     * <dd>
     * <p>
     * Specify the domain name of the Amazon S3 website endpoint that you created the bucket in, for example,
     * <code>s3-website.us-east-2.amazonaws.com</code>. For more information about valid values, see the table <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Amazon Simple Storage Service (S3)
     * Website Endpoints</a> in the <i>Amazon Web Services General Reference</i>. For more information about using S3
     * buckets for websites, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/getting-started.html">Getting Started with Amazon
     * Route 53</a> in the <i>Amazon Route 53 Developer Guide.</i>
     * </p>
     * </dd>
     * <dt>Another Route 53 resource record set</dt>
     * <dd>
     * <p>
     * Specify the value of the <code>Name</code> element for a resource record set in the current hosted zone.
     * </p>
     * <note>
     * <p>
     * If you're creating an alias record that has the same name as the hosted zone (known as the zone apex), you can't
     * specify the domain name for a record for which the value of <code>Type</code> is <code>CNAME</code>. This is
     * because the alias record must have the same type as the record that you're routing traffic to, and creating a
     * CNAME record for the zone apex isn't supported even for an alias record.
     * </p>
     * </note></dd>
     * </dl>
     */
    private String dNSName;
    /**
     * <p>
     * <i>Applies only to alias, failover alias, geolocation alias, latency alias, and weighted alias resource record
     * sets:</i> When <code>EvaluateTargetHealth</code> is <code>true</code>, an alias resource record set inherits the
     * health of the referenced AWS resource, such as an ELB load balancer or another resource record set in the hosted
     * zone.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <dl>
     * <dt>CloudFront distributions</dt>
     * <dd>
     * <p>
     * You can't set <code>EvaluateTargetHealth</code> to <code>true</code> when the alias target is a CloudFront
     * distribution.
     * </p>
     * </dd>
     * <dt>Elastic Beanstalk environments that have regionalized subdomains</dt>
     * <dd>
     * <p>
     * If you specify an Elastic Beanstalk environment in <code>DNSName</code> and the environment contains an ELB load
     * balancer, Elastic Load Balancing routes queries only to the healthy Amazon EC2 instances that are registered with
     * the load balancer. (An environment automatically contains an ELB load balancer if it includes more than one
     * Amazon EC2 instance.) If you set <code>EvaluateTargetHealth</code> to <code>true</code> and either no Amazon EC2
     * instances are healthy or the load balancer itself is unhealthy, Route 53 routes queries to other available
     * resources that are healthy, if any.
     * </p>
     * <p>
     * If the environment contains a single Amazon EC2 instance, there are no special requirements.
     * </p>
     * </dd>
     * <dt>ELB load balancers</dt>
     * <dd>
     * <p>
     * Health checking behavior depends on the type of load balancer:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Classic Load Balancers</b>: If you specify an ELB Classic Load Balancer in <code>DNSName</code>, Elastic Load
     * Balancing routes queries only to the healthy Amazon EC2 instances that are registered with the load balancer. If
     * you set <code>EvaluateTargetHealth</code> to <code>true</code> and either no EC2 instances are healthy or the
     * load balancer itself is unhealthy, Route 53 routes queries to other resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Application and Network Load Balancers</b>: If you specify an ELB Application or Network Load Balancer and you
     * set <code>EvaluateTargetHealth</code> to <code>true</code>, Route 53 routes queries to the load balancer based on
     * the health of the target groups that are associated with the load balancer:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an Application or Network Load Balancer to be considered healthy, every target group that contains targets
     * must contain at least one healthy target. If any target group contains only unhealthy targets, the load balancer
     * is considered unhealthy, and Route 53 routes queries to other resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * A target group that has no registered targets is considered unhealthy.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <note>
     * <p>
     * When you create a load balancer, you configure settings for Elastic Load Balancing health checks; they're not
     * Route 53 health checks, but they perform a similar function. Do not create Route 53 health checks for the EC2
     * instances that you register with an ELB load balancer.
     * </p>
     * </note></dd>
     * <dt>S3 buckets</dt>
     * <dd>
     * <p>
     * There are no special requirements for setting <code>EvaluateTargetHealth</code> to <code>true</code> when the
     * alias target is an S3 bucket.
     * </p>
     * </dd>
     * <dt>Other records in the same hosted zone</dt>
     * <dd>
     * <p>
     * If the AWS resource that you specify in <code>DNSName</code> is a record or a group of records (for example, a
     * group of weighted records) but is not another alias record, we recommend that you associate a health check with
     * all of the records in the alias target. For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html#dns-failover-complex-configs-hc-omitting"
     * >What Happens When You Omit Health Checks?</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </dd>
     * </dl>
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
     *        <i>Alias resource records sets only</i>: The value used depends on where you want to route traffic:</p>
     *        <dl>
     *        <dt>Amazon API Gateway custom regional APIs and edge-optimized APIs</dt>
     *        <dd>
     *        <p>
     *        Specify the hosted zone ID for your API. You can get the applicable value using the AWS CLI command <a
     *        href
     *        ="https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-domain-names.html">get-domain-names</a>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For regional APIs, specify the value of <code>regionalHostedZoneId</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For edge-optimized APIs, specify the value of <code>distributionHostedZoneId</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>Amazon Virtual Private Cloud interface VPC endpoint</dt>
     *        <dd>
     *        <p>
     *        Specify the hosted zone ID for your interface endpoint. You can get the value of <code>HostedZoneId</code>
     *        using the AWS CLI command <a
     *        href="https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-vpc-endpoints.html"
     *        >describe-vpc-endpoints</a>.
     *        </p>
     *        </dd>
     *        <dt>CloudFront distribution</dt>
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
     *        Specify the hosted zone ID for the region that you created the environment in. The environment must have a
     *        regionalized subdomain. For a list of regions and the corresponding hosted zone IDs, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/rande.html#elasticbeanstalk_region">AWS Elastic
     *        Beanstalk</a> in the "AWS Regions and Endpoints" chapter of the <i>Amazon Web Services General
     *        Reference</i>.
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
     *        <a href="https://docs.aws.amazon.com/general/latest/gr/rande.html#elb_region">Elastic Load Balancing</a>
     *        table in the "AWS Regions and Endpoints" chapter of the <i>Amazon Web Services General Reference</i>: Use
     *        the value that corresponds with the region that you created your load balancer in. Note that there are
     *        separate columns for Application and Classic Load Balancers and for Network Load Balancers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AWS Management Console</b>: Go to the Amazon EC2 page, choose <b>Load Balancers</b> in the navigation
     *        pane, select the load balancer, and get the value of the <b>Hosted zone</b> field on the
     *        <b>Description</b> tab.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Elastic Load Balancing API</b>: Use <code>DescribeLoadBalancers</code> to get the applicable value. For
     *        more information, see the applicable guide:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Classic Load Balancers: Use <a href=
     *        "http://docs.aws.amazon.com/elasticloadbalancing/2012-06-01/APIReference/API_DescribeLoadBalancers.html"
     *        >DescribeLoadBalancers</a> to get the value of <code>CanonicalHostedZoneNameId</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Application and Network Load Balancers: Use <a href=
     *        "http://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html"
     *        >DescribeLoadBalancers</a> to get the value of <code>CanonicalHostedZoneId</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AWS CLI</b>: Use <code>describe-load-balancers</code> to get the applicable value. For more
     *        information, see the applicable guide:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Classic Load Balancers: Use <a
     *        href="http://docs.aws.amazon.com/cli/latest/reference/elb/describe-load-balancers.html"
     *        >describe-load-balancers</a> to get the value of <code>CanonicalHostedZoneNameId</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Application and Network Load Balancers: Use <a
     *        href="http://docs.aws.amazon.com/cli/latest/reference/elbv2/describe-load-balancers.html"
     *        >describe-load-balancers</a> to get the value of <code>CanonicalHostedZoneId</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>An Amazon S3 bucket configured as a static website</dt>
     *        <dd>
     *        <p>
     *        Specify the hosted zone ID for the region that you created the bucket in. For more information about valid
     *        values, see the <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Amazon Simple
     *        Storage Service Website Endpoints</a> table in the "AWS Regions and Endpoints" chapter of the <i>Amazon
     *        Web Services General Reference</i>.
     *        </p>
     *        </dd>
     *        <dt>Another Route 53 resource record set in your hosted zone</dt>
     *        <dd>
     *        <p>
     *        Specify the hosted zone ID of your hosted zone. (An alias resource record set can't reference a resource
     *        record set in a different hosted zone.)
     *        </p>
     *        </dd>
     * @param dNSName
     *        <i>Alias resource record sets only:</i> The value that you specify depends on where you want to route
     *        queries:</p>
     *        <dl>
     *        <dt>Amazon API Gateway custom regional APIs and edge-optimized APIs</dt>
     *        <dd>
     *        <p>
     *        Specify the applicable domain name for your API. You can get the applicable value using the AWS CLI
     *        command <a
     *        href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-domain-names.html">get-domain
     *        -names</a>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For regional APIs, specify the value of <code>regionalDomainName</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For edge-optimized APIs, specify the value of <code>distributionDomainName</code>. This is the name of the
     *        associated CloudFront distribution, such as <code>da1b2c3d4e5.cloudfront.net</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The name of the record that you're creating must match a custom domain name for your API, such as
     *        <code>api.example.com</code>.
     *        </p>
     *        </note></dd>
     *        <dt>Amazon Virtual Private Cloud interface VPC endpoint</dt>
     *        <dd>
     *        <p>
     *        Enter the API endpoint for the interface endpoint, such as
     *        <code>vpce-123456789abcdef01-example-us-east-1a.elasticloadbalancing.us-east-1.vpce.amazonaws.com</code>.
     *        For edge-optimized APIs, this is the domain name for the corresponding CloudFront distribution. You can
     *        get the value of <code>DnsName</code> using the AWS CLI command <a
     *        href="https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-vpc-endpoints.html"
     *        >describe-vpc-endpoints</a>.
     *        </p>
     *        </dd>
     *        <dt>CloudFront distribution</dt>
     *        <dd>
     *        <p>
     *        Specify the domain name that CloudFront assigned when you created your distribution.
     *        </p>
     *        <p>
     *        Your CloudFront distribution must include an alternate domain name that matches the name of the resource
     *        record set. For example, if the name of the resource record set is <i>acme.example.com</i>, your
     *        CloudFront distribution must include <i>acme.example.com</i> as one of the alternate domain names. For
     *        more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/CNAMEs.html">Using Alternate
     *        Domain Names (CNAMEs)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *        </p>
     *        <p>
     *        You can't create a resource record set in a private hosted zone to route traffic to a CloudFront
     *        distribution.
     *        </p>
     *        <note>
     *        <p>
     *        For failover alias records, you can't specify a CloudFront distribution for both the primary and secondary
     *        records. A distribution must include an alternate domain name that matches the name of the record.
     *        However, the primary and secondary records have the same name, and you can't include the same alternate
     *        domain name in more than one distribution.
     *        </p>
     *        </note></dd>
     *        <dt>Elastic Beanstalk environment</dt>
     *        <dd>
     *        <p>
     *        If the domain name for your Elastic Beanstalk environment includes the region that you deployed the
     *        environment in, you can create an alias record that routes traffic to the environment. For example, the
     *        domain name <code>my-environment.<i>us-west-2</i>.elasticbeanstalk.com</code> is a regionalized domain
     *        name.
     *        </p>
     *        <important>
     *        <p>
     *        For environments that were created before early 2016, the domain name doesn't include the region. To route
     *        traffic to these environments, you must create a CNAME record instead of an alias record. Note that you
     *        can't create a CNAME record for the root domain name. For example, if your domain name is example.com, you
     *        can create a record that routes traffic for acme.example.com to your Elastic Beanstalk environment, but
     *        you can't create a record that routes traffic for example.com to your Elastic Beanstalk environment.
     *        </p>
     *        </important>
     *        <p>
     *        For Elastic Beanstalk environments that have regionalized subdomains, specify the <code>CNAME</code>
     *        attribute for the environment. You can use the following methods to get the value of the CNAME attribute:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>AWS Management Console</i>: For information about how to get the value by using the console, see <a
     *        href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/customdomains.html">Using Custom Domains with
     *        AWS Elastic Beanstalk</a> in the <i>AWS Elastic Beanstalk Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>Elastic Beanstalk API</i>: Use the <code>DescribeEnvironments</code> action to get the value of the
     *        <code>CNAME</code> attribute. For more information, see <a
     *        href="http://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_DescribeEnvironments.html"
     *        >DescribeEnvironments</a> in the <i>AWS Elastic Beanstalk API Reference</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>AWS CLI</i>: Use the <code>describe-environments</code> command to get the value of the
     *        <code>CNAME</code> attribute. For more information, see <a
     *        href="http://docs.aws.amazon.com/cli/latest/reference/elasticbeanstalk/describe-environments.html"
     *        >describe-environments</a> in the <i>AWS Command Line Interface Reference</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>ELB load balancer</dt>
     *        <dd>
     *        <p>
     *        Specify the DNS name that is associated with the load balancer. Get the DNS name by using the AWS
     *        Management Console, the ELB API, or the AWS CLI.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>AWS Management Console</b>: Go to the EC2 page, choose <b>Load Balancers</b> in the navigation pane,
     *        choose the load balancer, choose the <b>Description</b> tab, and get the value of the <b>DNS name</b>
     *        field.
     *        </p>
     *        <p>
     *        If you're routing traffic to a Classic Load Balancer, get the value that begins with <b>dualstack</b>. If
     *        you're routing traffic to another type of load balancer, get the value that applies to the record type, A
     *        or AAAA.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Elastic Load Balancing API</b>: Use <code>DescribeLoadBalancers</code> to get the value of
     *        <code>DNSName</code>. For more information, see the applicable guide:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Classic Load Balancers: <a href=
     *        "http://docs.aws.amazon.com/elasticloadbalancing/2012-06-01/APIReference/API_DescribeLoadBalancers.html"
     *        >DescribeLoadBalancers</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Application and Network Load Balancers: <a href=
     *        "http://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html"
     *        >DescribeLoadBalancers</a>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AWS CLI</b>: Use <code>describe-load-balancers</code> to get the value of <code>DNSName</code>. For
     *        more information, see the applicable guide:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Classic Load Balancers: <a
     *        href="http://docs.aws.amazon.com/cli/latest/reference/elb/describe-load-balancers.html"
     *        >describe-load-balancers</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Application and Network Load Balancers: <a
     *        href="http://docs.aws.amazon.com/cli/latest/reference/elbv2/describe-load-balancers.html"
     *        >describe-load-balancers</a>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>Amazon S3 bucket that is configured as a static website</dt>
     *        <dd>
     *        <p>
     *        Specify the domain name of the Amazon S3 website endpoint that you created the bucket in, for example,
     *        <code>s3-website.us-east-2.amazonaws.com</code>. For more information about valid values, see the table <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Amazon Simple Storage Service
     *        (S3) Website Endpoints</a> in the <i>Amazon Web Services General Reference</i>. For more information about
     *        using S3 buckets for websites, see <a
     *        href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/getting-started.html">Getting Started with
     *        Amazon Route 53</a> in the <i>Amazon Route 53 Developer Guide.</i>
     *        </p>
     *        </dd>
     *        <dt>Another Route 53 resource record set</dt>
     *        <dd>
     *        <p>
     *        Specify the value of the <code>Name</code> element for a resource record set in the current hosted zone.
     *        </p>
     *        <note>
     *        <p>
     *        If you're creating an alias record that has the same name as the hosted zone (known as the zone apex), you
     *        can't specify the domain name for a record for which the value of <code>Type</code> is <code>CNAME</code>.
     *        This is because the alias record must have the same type as the record that you're routing traffic to, and
     *        creating a CNAME record for the zone apex isn't supported even for an alias record.
     *        </p>
     *        </note></dd>
     */
    public AliasTarget(String hostedZoneId, String dNSName) {
        setHostedZoneId(hostedZoneId);
        setDNSName(dNSName);
    }

    /**
     * <p>
     * <i>Alias resource records sets only</i>: The value used depends on where you want to route traffic:
     * </p>
     * <dl>
     * <dt>Amazon API Gateway custom regional APIs and edge-optimized APIs</dt>
     * <dd>
     * <p>
     * Specify the hosted zone ID for your API. You can get the applicable value using the AWS CLI command <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-domain-names.html">get-domain-names</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For regional APIs, specify the value of <code>regionalHostedZoneId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For edge-optimized APIs, specify the value of <code>distributionHostedZoneId</code>.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Amazon Virtual Private Cloud interface VPC endpoint</dt>
     * <dd>
     * <p>
     * Specify the hosted zone ID for your interface endpoint. You can get the value of <code>HostedZoneId</code> using
     * the AWS CLI command <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-vpc-endpoints.html">describe
     * -vpc-endpoints</a>.
     * </p>
     * </dd>
     * <dt>CloudFront distribution</dt>
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
     * Specify the hosted zone ID for the region that you created the environment in. The environment must have a
     * regionalized subdomain. For a list of regions and the corresponding hosted zone IDs, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#elasticbeanstalk_region">AWS Elastic Beanstalk</a>
     * in the "AWS Regions and Endpoints" chapter of the <i>Amazon Web Services General Reference</i>.
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
     * <a href="https://docs.aws.amazon.com/general/latest/gr/rande.html#elb_region">Elastic Load Balancing</a> table in
     * the "AWS Regions and Endpoints" chapter of the <i>Amazon Web Services General Reference</i>: Use the value that
     * corresponds with the region that you created your load balancer in. Note that there are separate columns for
     * Application and Classic Load Balancers and for Network Load Balancers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AWS Management Console</b>: Go to the Amazon EC2 page, choose <b>Load Balancers</b> in the navigation pane,
     * select the load balancer, and get the value of the <b>Hosted zone</b> field on the <b>Description</b> tab.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Elastic Load Balancing API</b>: Use <code>DescribeLoadBalancers</code> to get the applicable value. For more
     * information, see the applicable guide:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Classic Load Balancers: Use <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/2012-06-01/APIReference/API_DescribeLoadBalancers.html"
     * >DescribeLoadBalancers</a> to get the value of <code>CanonicalHostedZoneNameId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Application and Network Load Balancers: Use <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html"
     * >DescribeLoadBalancers</a> to get the value of <code>CanonicalHostedZoneId</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>AWS CLI</b>: Use <code>describe-load-balancers</code> to get the applicable value. For more information, see
     * the applicable guide:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Classic Load Balancers: Use <a
     * href="http://docs.aws.amazon.com/cli/latest/reference/elb/describe-load-balancers.html"
     * >describe-load-balancers</a> to get the value of <code>CanonicalHostedZoneNameId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Application and Network Load Balancers: Use <a
     * href="http://docs.aws.amazon.com/cli/latest/reference/elbv2/describe-load-balancers.html"
     * >describe-load-balancers</a> to get the value of <code>CanonicalHostedZoneId</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </dd>
     * <dt>An Amazon S3 bucket configured as a static website</dt>
     * <dd>
     * <p>
     * Specify the hosted zone ID for the region that you created the bucket in. For more information about valid
     * values, see the <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Amazon Simple Storage
     * Service Website Endpoints</a> table in the "AWS Regions and Endpoints" chapter of the <i>Amazon Web Services
     * General Reference</i>.
     * </p>
     * </dd>
     * <dt>Another Route 53 resource record set in your hosted zone</dt>
     * <dd>
     * <p>
     * Specify the hosted zone ID of your hosted zone. (An alias resource record set can't reference a resource record
     * set in a different hosted zone.)
     * </p>
     * </dd>
     * </dl>
     * 
     * @param hostedZoneId
     *        <i>Alias resource records sets only</i>: The value used depends on where you want to route traffic:</p>
     *        <dl>
     *        <dt>Amazon API Gateway custom regional APIs and edge-optimized APIs</dt>
     *        <dd>
     *        <p>
     *        Specify the hosted zone ID for your API. You can get the applicable value using the AWS CLI command <a
     *        href
     *        ="https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-domain-names.html">get-domain-names</a>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For regional APIs, specify the value of <code>regionalHostedZoneId</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For edge-optimized APIs, specify the value of <code>distributionHostedZoneId</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>Amazon Virtual Private Cloud interface VPC endpoint</dt>
     *        <dd>
     *        <p>
     *        Specify the hosted zone ID for your interface endpoint. You can get the value of <code>HostedZoneId</code>
     *        using the AWS CLI command <a
     *        href="https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-vpc-endpoints.html"
     *        >describe-vpc-endpoints</a>.
     *        </p>
     *        </dd>
     *        <dt>CloudFront distribution</dt>
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
     *        Specify the hosted zone ID for the region that you created the environment in. The environment must have a
     *        regionalized subdomain. For a list of regions and the corresponding hosted zone IDs, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/rande.html#elasticbeanstalk_region">AWS Elastic
     *        Beanstalk</a> in the "AWS Regions and Endpoints" chapter of the <i>Amazon Web Services General
     *        Reference</i>.
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
     *        <a href="https://docs.aws.amazon.com/general/latest/gr/rande.html#elb_region">Elastic Load Balancing</a>
     *        table in the "AWS Regions and Endpoints" chapter of the <i>Amazon Web Services General Reference</i>: Use
     *        the value that corresponds with the region that you created your load balancer in. Note that there are
     *        separate columns for Application and Classic Load Balancers and for Network Load Balancers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AWS Management Console</b>: Go to the Amazon EC2 page, choose <b>Load Balancers</b> in the navigation
     *        pane, select the load balancer, and get the value of the <b>Hosted zone</b> field on the
     *        <b>Description</b> tab.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Elastic Load Balancing API</b>: Use <code>DescribeLoadBalancers</code> to get the applicable value. For
     *        more information, see the applicable guide:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Classic Load Balancers: Use <a href=
     *        "http://docs.aws.amazon.com/elasticloadbalancing/2012-06-01/APIReference/API_DescribeLoadBalancers.html"
     *        >DescribeLoadBalancers</a> to get the value of <code>CanonicalHostedZoneNameId</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Application and Network Load Balancers: Use <a href=
     *        "http://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html"
     *        >DescribeLoadBalancers</a> to get the value of <code>CanonicalHostedZoneId</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AWS CLI</b>: Use <code>describe-load-balancers</code> to get the applicable value. For more
     *        information, see the applicable guide:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Classic Load Balancers: Use <a
     *        href="http://docs.aws.amazon.com/cli/latest/reference/elb/describe-load-balancers.html"
     *        >describe-load-balancers</a> to get the value of <code>CanonicalHostedZoneNameId</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Application and Network Load Balancers: Use <a
     *        href="http://docs.aws.amazon.com/cli/latest/reference/elbv2/describe-load-balancers.html"
     *        >describe-load-balancers</a> to get the value of <code>CanonicalHostedZoneId</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>An Amazon S3 bucket configured as a static website</dt>
     *        <dd>
     *        <p>
     *        Specify the hosted zone ID for the region that you created the bucket in. For more information about valid
     *        values, see the <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Amazon Simple
     *        Storage Service Website Endpoints</a> table in the "AWS Regions and Endpoints" chapter of the <i>Amazon
     *        Web Services General Reference</i>.
     *        </p>
     *        </dd>
     *        <dt>Another Route 53 resource record set in your hosted zone</dt>
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
     * <i>Alias resource records sets only</i>: The value used depends on where you want to route traffic:
     * </p>
     * <dl>
     * <dt>Amazon API Gateway custom regional APIs and edge-optimized APIs</dt>
     * <dd>
     * <p>
     * Specify the hosted zone ID for your API. You can get the applicable value using the AWS CLI command <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-domain-names.html">get-domain-names</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For regional APIs, specify the value of <code>regionalHostedZoneId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For edge-optimized APIs, specify the value of <code>distributionHostedZoneId</code>.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Amazon Virtual Private Cloud interface VPC endpoint</dt>
     * <dd>
     * <p>
     * Specify the hosted zone ID for your interface endpoint. You can get the value of <code>HostedZoneId</code> using
     * the AWS CLI command <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-vpc-endpoints.html">describe
     * -vpc-endpoints</a>.
     * </p>
     * </dd>
     * <dt>CloudFront distribution</dt>
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
     * Specify the hosted zone ID for the region that you created the environment in. The environment must have a
     * regionalized subdomain. For a list of regions and the corresponding hosted zone IDs, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#elasticbeanstalk_region">AWS Elastic Beanstalk</a>
     * in the "AWS Regions and Endpoints" chapter of the <i>Amazon Web Services General Reference</i>.
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
     * <a href="https://docs.aws.amazon.com/general/latest/gr/rande.html#elb_region">Elastic Load Balancing</a> table in
     * the "AWS Regions and Endpoints" chapter of the <i>Amazon Web Services General Reference</i>: Use the value that
     * corresponds with the region that you created your load balancer in. Note that there are separate columns for
     * Application and Classic Load Balancers and for Network Load Balancers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AWS Management Console</b>: Go to the Amazon EC2 page, choose <b>Load Balancers</b> in the navigation pane,
     * select the load balancer, and get the value of the <b>Hosted zone</b> field on the <b>Description</b> tab.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Elastic Load Balancing API</b>: Use <code>DescribeLoadBalancers</code> to get the applicable value. For more
     * information, see the applicable guide:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Classic Load Balancers: Use <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/2012-06-01/APIReference/API_DescribeLoadBalancers.html"
     * >DescribeLoadBalancers</a> to get the value of <code>CanonicalHostedZoneNameId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Application and Network Load Balancers: Use <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html"
     * >DescribeLoadBalancers</a> to get the value of <code>CanonicalHostedZoneId</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>AWS CLI</b>: Use <code>describe-load-balancers</code> to get the applicable value. For more information, see
     * the applicable guide:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Classic Load Balancers: Use <a
     * href="http://docs.aws.amazon.com/cli/latest/reference/elb/describe-load-balancers.html"
     * >describe-load-balancers</a> to get the value of <code>CanonicalHostedZoneNameId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Application and Network Load Balancers: Use <a
     * href="http://docs.aws.amazon.com/cli/latest/reference/elbv2/describe-load-balancers.html"
     * >describe-load-balancers</a> to get the value of <code>CanonicalHostedZoneId</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </dd>
     * <dt>An Amazon S3 bucket configured as a static website</dt>
     * <dd>
     * <p>
     * Specify the hosted zone ID for the region that you created the bucket in. For more information about valid
     * values, see the <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Amazon Simple Storage
     * Service Website Endpoints</a> table in the "AWS Regions and Endpoints" chapter of the <i>Amazon Web Services
     * General Reference</i>.
     * </p>
     * </dd>
     * <dt>Another Route 53 resource record set in your hosted zone</dt>
     * <dd>
     * <p>
     * Specify the hosted zone ID of your hosted zone. (An alias resource record set can't reference a resource record
     * set in a different hosted zone.)
     * </p>
     * </dd>
     * </dl>
     * 
     * @return <i>Alias resource records sets only</i>: The value used depends on where you want to route traffic:</p>
     *         <dl>
     *         <dt>Amazon API Gateway custom regional APIs and edge-optimized APIs</dt>
     *         <dd>
     *         <p>
     *         Specify the hosted zone ID for your API. You can get the applicable value using the AWS CLI command <a
     *         href
     *         ="https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-domain-names.html">get-domain-names<
     *         /a>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For regional APIs, specify the value of <code>regionalHostedZoneId</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For edge-optimized APIs, specify the value of <code>distributionHostedZoneId</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         </dd>
     *         <dt>Amazon Virtual Private Cloud interface VPC endpoint</dt>
     *         <dd>
     *         <p>
     *         Specify the hosted zone ID for your interface endpoint. You can get the value of
     *         <code>HostedZoneId</code> using the AWS CLI command <a
     *         href="https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-vpc-endpoints.html"
     *         >describe-vpc-endpoints</a>.
     *         </p>
     *         </dd>
     *         <dt>CloudFront distribution</dt>
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
     *         Specify the hosted zone ID for the region that you created the environment in. The environment must have
     *         a regionalized subdomain. For a list of regions and the corresponding hosted zone IDs, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/rande.html#elasticbeanstalk_region">AWS Elastic
     *         Beanstalk</a> in the "AWS Regions and Endpoints" chapter of the <i>Amazon Web Services General
     *         Reference</i>.
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
     *         <a href="https://docs.aws.amazon.com/general/latest/gr/rande.html#elb_region">Elastic Load Balancing</a>
     *         table in the "AWS Regions and Endpoints" chapter of the <i>Amazon Web Services General Reference</i>: Use
     *         the value that corresponds with the region that you created your load balancer in. Note that there are
     *         separate columns for Application and Classic Load Balancers and for Network Load Balancers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>AWS Management Console</b>: Go to the Amazon EC2 page, choose <b>Load Balancers</b> in the navigation
     *         pane, select the load balancer, and get the value of the <b>Hosted zone</b> field on the
     *         <b>Description</b> tab.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Elastic Load Balancing API</b>: Use <code>DescribeLoadBalancers</code> to get the applicable value.
     *         For more information, see the applicable guide:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Classic Load Balancers: Use <a href=
     *         "http://docs.aws.amazon.com/elasticloadbalancing/2012-06-01/APIReference/API_DescribeLoadBalancers.html"
     *         >DescribeLoadBalancers</a> to get the value of <code>CanonicalHostedZoneNameId</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Application and Network Load Balancers: Use <a href=
     *         "http://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html"
     *         >DescribeLoadBalancers</a> to get the value of <code>CanonicalHostedZoneId</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <b>AWS CLI</b>: Use <code>describe-load-balancers</code> to get the applicable value. For more
     *         information, see the applicable guide:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Classic Load Balancers: Use <a
     *         href="http://docs.aws.amazon.com/cli/latest/reference/elb/describe-load-balancers.html"
     *         >describe-load-balancers</a> to get the value of <code>CanonicalHostedZoneNameId</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Application and Network Load Balancers: Use <a
     *         href="http://docs.aws.amazon.com/cli/latest/reference/elbv2/describe-load-balancers.html"
     *         >describe-load-balancers</a> to get the value of <code>CanonicalHostedZoneId</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         </dd>
     *         <dt>An Amazon S3 bucket configured as a static website</dt>
     *         <dd>
     *         <p>
     *         Specify the hosted zone ID for the region that you created the bucket in. For more information about
     *         valid values, see the <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Amazon
     *         Simple Storage Service Website Endpoints</a> table in the "AWS Regions and Endpoints" chapter of the
     *         <i>Amazon Web Services General Reference</i>.
     *         </p>
     *         </dd>
     *         <dt>Another Route 53 resource record set in your hosted zone</dt>
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
     * <i>Alias resource records sets only</i>: The value used depends on where you want to route traffic:
     * </p>
     * <dl>
     * <dt>Amazon API Gateway custom regional APIs and edge-optimized APIs</dt>
     * <dd>
     * <p>
     * Specify the hosted zone ID for your API. You can get the applicable value using the AWS CLI command <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-domain-names.html">get-domain-names</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For regional APIs, specify the value of <code>regionalHostedZoneId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For edge-optimized APIs, specify the value of <code>distributionHostedZoneId</code>.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>Amazon Virtual Private Cloud interface VPC endpoint</dt>
     * <dd>
     * <p>
     * Specify the hosted zone ID for your interface endpoint. You can get the value of <code>HostedZoneId</code> using
     * the AWS CLI command <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-vpc-endpoints.html">describe
     * -vpc-endpoints</a>.
     * </p>
     * </dd>
     * <dt>CloudFront distribution</dt>
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
     * Specify the hosted zone ID for the region that you created the environment in. The environment must have a
     * regionalized subdomain. For a list of regions and the corresponding hosted zone IDs, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#elasticbeanstalk_region">AWS Elastic Beanstalk</a>
     * in the "AWS Regions and Endpoints" chapter of the <i>Amazon Web Services General Reference</i>.
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
     * <a href="https://docs.aws.amazon.com/general/latest/gr/rande.html#elb_region">Elastic Load Balancing</a> table in
     * the "AWS Regions and Endpoints" chapter of the <i>Amazon Web Services General Reference</i>: Use the value that
     * corresponds with the region that you created your load balancer in. Note that there are separate columns for
     * Application and Classic Load Balancers and for Network Load Balancers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AWS Management Console</b>: Go to the Amazon EC2 page, choose <b>Load Balancers</b> in the navigation pane,
     * select the load balancer, and get the value of the <b>Hosted zone</b> field on the <b>Description</b> tab.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Elastic Load Balancing API</b>: Use <code>DescribeLoadBalancers</code> to get the applicable value. For more
     * information, see the applicable guide:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Classic Load Balancers: Use <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/2012-06-01/APIReference/API_DescribeLoadBalancers.html"
     * >DescribeLoadBalancers</a> to get the value of <code>CanonicalHostedZoneNameId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Application and Network Load Balancers: Use <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html"
     * >DescribeLoadBalancers</a> to get the value of <code>CanonicalHostedZoneId</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>AWS CLI</b>: Use <code>describe-load-balancers</code> to get the applicable value. For more information, see
     * the applicable guide:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Classic Load Balancers: Use <a
     * href="http://docs.aws.amazon.com/cli/latest/reference/elb/describe-load-balancers.html"
     * >describe-load-balancers</a> to get the value of <code>CanonicalHostedZoneNameId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Application and Network Load Balancers: Use <a
     * href="http://docs.aws.amazon.com/cli/latest/reference/elbv2/describe-load-balancers.html"
     * >describe-load-balancers</a> to get the value of <code>CanonicalHostedZoneId</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </dd>
     * <dt>An Amazon S3 bucket configured as a static website</dt>
     * <dd>
     * <p>
     * Specify the hosted zone ID for the region that you created the bucket in. For more information about valid
     * values, see the <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Amazon Simple Storage
     * Service Website Endpoints</a> table in the "AWS Regions and Endpoints" chapter of the <i>Amazon Web Services
     * General Reference</i>.
     * </p>
     * </dd>
     * <dt>Another Route 53 resource record set in your hosted zone</dt>
     * <dd>
     * <p>
     * Specify the hosted zone ID of your hosted zone. (An alias resource record set can't reference a resource record
     * set in a different hosted zone.)
     * </p>
     * </dd>
     * </dl>
     * 
     * @param hostedZoneId
     *        <i>Alias resource records sets only</i>: The value used depends on where you want to route traffic:</p>
     *        <dl>
     *        <dt>Amazon API Gateway custom regional APIs and edge-optimized APIs</dt>
     *        <dd>
     *        <p>
     *        Specify the hosted zone ID for your API. You can get the applicable value using the AWS CLI command <a
     *        href
     *        ="https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-domain-names.html">get-domain-names</a>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For regional APIs, specify the value of <code>regionalHostedZoneId</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For edge-optimized APIs, specify the value of <code>distributionHostedZoneId</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>Amazon Virtual Private Cloud interface VPC endpoint</dt>
     *        <dd>
     *        <p>
     *        Specify the hosted zone ID for your interface endpoint. You can get the value of <code>HostedZoneId</code>
     *        using the AWS CLI command <a
     *        href="https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-vpc-endpoints.html"
     *        >describe-vpc-endpoints</a>.
     *        </p>
     *        </dd>
     *        <dt>CloudFront distribution</dt>
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
     *        Specify the hosted zone ID for the region that you created the environment in. The environment must have a
     *        regionalized subdomain. For a list of regions and the corresponding hosted zone IDs, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/rande.html#elasticbeanstalk_region">AWS Elastic
     *        Beanstalk</a> in the "AWS Regions and Endpoints" chapter of the <i>Amazon Web Services General
     *        Reference</i>.
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
     *        <a href="https://docs.aws.amazon.com/general/latest/gr/rande.html#elb_region">Elastic Load Balancing</a>
     *        table in the "AWS Regions and Endpoints" chapter of the <i>Amazon Web Services General Reference</i>: Use
     *        the value that corresponds with the region that you created your load balancer in. Note that there are
     *        separate columns for Application and Classic Load Balancers and for Network Load Balancers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AWS Management Console</b>: Go to the Amazon EC2 page, choose <b>Load Balancers</b> in the navigation
     *        pane, select the load balancer, and get the value of the <b>Hosted zone</b> field on the
     *        <b>Description</b> tab.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Elastic Load Balancing API</b>: Use <code>DescribeLoadBalancers</code> to get the applicable value. For
     *        more information, see the applicable guide:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Classic Load Balancers: Use <a href=
     *        "http://docs.aws.amazon.com/elasticloadbalancing/2012-06-01/APIReference/API_DescribeLoadBalancers.html"
     *        >DescribeLoadBalancers</a> to get the value of <code>CanonicalHostedZoneNameId</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Application and Network Load Balancers: Use <a href=
     *        "http://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html"
     *        >DescribeLoadBalancers</a> to get the value of <code>CanonicalHostedZoneId</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AWS CLI</b>: Use <code>describe-load-balancers</code> to get the applicable value. For more
     *        information, see the applicable guide:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Classic Load Balancers: Use <a
     *        href="http://docs.aws.amazon.com/cli/latest/reference/elb/describe-load-balancers.html"
     *        >describe-load-balancers</a> to get the value of <code>CanonicalHostedZoneNameId</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Application and Network Load Balancers: Use <a
     *        href="http://docs.aws.amazon.com/cli/latest/reference/elbv2/describe-load-balancers.html"
     *        >describe-load-balancers</a> to get the value of <code>CanonicalHostedZoneId</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>An Amazon S3 bucket configured as a static website</dt>
     *        <dd>
     *        <p>
     *        Specify the hosted zone ID for the region that you created the bucket in. For more information about valid
     *        values, see the <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Amazon Simple
     *        Storage Service Website Endpoints</a> table in the "AWS Regions and Endpoints" chapter of the <i>Amazon
     *        Web Services General Reference</i>.
     *        </p>
     *        </dd>
     *        <dt>Another Route 53 resource record set in your hosted zone</dt>
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
     * <dl>
     * <dt>Amazon API Gateway custom regional APIs and edge-optimized APIs</dt>
     * <dd>
     * <p>
     * Specify the applicable domain name for your API. You can get the applicable value using the AWS CLI command <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-domain-names.html">get-domain-names</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For regional APIs, specify the value of <code>regionalDomainName</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For edge-optimized APIs, specify the value of <code>distributionDomainName</code>. This is the name of the
     * associated CloudFront distribution, such as <code>da1b2c3d4e5.cloudfront.net</code>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The name of the record that you're creating must match a custom domain name for your API, such as
     * <code>api.example.com</code>.
     * </p>
     * </note></dd>
     * <dt>Amazon Virtual Private Cloud interface VPC endpoint</dt>
     * <dd>
     * <p>
     * Enter the API endpoint for the interface endpoint, such as
     * <code>vpce-123456789abcdef01-example-us-east-1a.elasticloadbalancing.us-east-1.vpce.amazonaws.com</code>. For
     * edge-optimized APIs, this is the domain name for the corresponding CloudFront distribution. You can get the value
     * of <code>DnsName</code> using the AWS CLI command <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-vpc-endpoints.html"
     * >describe-vpc-endpoints</a>.
     * </p>
     * </dd>
     * <dt>CloudFront distribution</dt>
     * <dd>
     * <p>
     * Specify the domain name that CloudFront assigned when you created your distribution.
     * </p>
     * <p>
     * Your CloudFront distribution must include an alternate domain name that matches the name of the resource record
     * set. For example, if the name of the resource record set is <i>acme.example.com</i>, your CloudFront distribution
     * must include <i>acme.example.com</i> as one of the alternate domain names. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/CNAMEs.html">Using Alternate Domain Names
     * (CNAMEs)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * You can't create a resource record set in a private hosted zone to route traffic to a CloudFront distribution.
     * </p>
     * <note>
     * <p>
     * For failover alias records, you can't specify a CloudFront distribution for both the primary and secondary
     * records. A distribution must include an alternate domain name that matches the name of the record. However, the
     * primary and secondary records have the same name, and you can't include the same alternate domain name in more
     * than one distribution.
     * </p>
     * </note></dd>
     * <dt>Elastic Beanstalk environment</dt>
     * <dd>
     * <p>
     * If the domain name for your Elastic Beanstalk environment includes the region that you deployed the environment
     * in, you can create an alias record that routes traffic to the environment. For example, the domain name
     * <code>my-environment.<i>us-west-2</i>.elasticbeanstalk.com</code> is a regionalized domain name.
     * </p>
     * <important>
     * <p>
     * For environments that were created before early 2016, the domain name doesn't include the region. To route
     * traffic to these environments, you must create a CNAME record instead of an alias record. Note that you can't
     * create a CNAME record for the root domain name. For example, if your domain name is example.com, you can create a
     * record that routes traffic for acme.example.com to your Elastic Beanstalk environment, but you can't create a
     * record that routes traffic for example.com to your Elastic Beanstalk environment.
     * </p>
     * </important>
     * <p>
     * For Elastic Beanstalk environments that have regionalized subdomains, specify the <code>CNAME</code> attribute
     * for the environment. You can use the following methods to get the value of the CNAME attribute:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AWS Management Console</i>: For information about how to get the value by using the console, see <a
     * href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/customdomains.html">Using Custom Domains with AWS
     * Elastic Beanstalk</a> in the <i>AWS Elastic Beanstalk Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Elastic Beanstalk API</i>: Use the <code>DescribeEnvironments</code> action to get the value of the
     * <code>CNAME</code> attribute. For more information, see <a
     * href="http://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_DescribeEnvironments.html"
     * >DescribeEnvironments</a> in the <i>AWS Elastic Beanstalk API Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>AWS CLI</i>: Use the <code>describe-environments</code> command to get the value of the <code>CNAME</code>
     * attribute. For more information, see <a
     * href="http://docs.aws.amazon.com/cli/latest/reference/elasticbeanstalk/describe-environments.html"
     * >describe-environments</a> in the <i>AWS Command Line Interface Reference</i>.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>ELB load balancer</dt>
     * <dd>
     * <p>
     * Specify the DNS name that is associated with the load balancer. Get the DNS name by using the AWS Management
     * Console, the ELB API, or the AWS CLI.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>AWS Management Console</b>: Go to the EC2 page, choose <b>Load Balancers</b> in the navigation pane, choose
     * the load balancer, choose the <b>Description</b> tab, and get the value of the <b>DNS name</b> field.
     * </p>
     * <p>
     * If you're routing traffic to a Classic Load Balancer, get the value that begins with <b>dualstack</b>. If you're
     * routing traffic to another type of load balancer, get the value that applies to the record type, A or AAAA.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Elastic Load Balancing API</b>: Use <code>DescribeLoadBalancers</code> to get the value of
     * <code>DNSName</code>. For more information, see the applicable guide:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Classic Load Balancers: <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/2012-06-01/APIReference/API_DescribeLoadBalancers.html"
     * >DescribeLoadBalancers</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Application and Network Load Balancers: <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html"
     * >DescribeLoadBalancers</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>AWS CLI</b>: Use <code>describe-load-balancers</code> to get the value of <code>DNSName</code>. For more
     * information, see the applicable guide:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Classic Load Balancers: <a
     * href="http://docs.aws.amazon.com/cli/latest/reference/elb/describe-load-balancers.html"
     * >describe-load-balancers</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Application and Network Load Balancers: <a
     * href="http://docs.aws.amazon.com/cli/latest/reference/elbv2/describe-load-balancers.html"
     * >describe-load-balancers</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </dd>
     * <dt>Amazon S3 bucket that is configured as a static website</dt>
     * <dd>
     * <p>
     * Specify the domain name of the Amazon S3 website endpoint that you created the bucket in, for example,
     * <code>s3-website.us-east-2.amazonaws.com</code>. For more information about valid values, see the table <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Amazon Simple Storage Service (S3)
     * Website Endpoints</a> in the <i>Amazon Web Services General Reference</i>. For more information about using S3
     * buckets for websites, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/getting-started.html">Getting Started with Amazon
     * Route 53</a> in the <i>Amazon Route 53 Developer Guide.</i>
     * </p>
     * </dd>
     * <dt>Another Route 53 resource record set</dt>
     * <dd>
     * <p>
     * Specify the value of the <code>Name</code> element for a resource record set in the current hosted zone.
     * </p>
     * <note>
     * <p>
     * If you're creating an alias record that has the same name as the hosted zone (known as the zone apex), you can't
     * specify the domain name for a record for which the value of <code>Type</code> is <code>CNAME</code>. This is
     * because the alias record must have the same type as the record that you're routing traffic to, and creating a
     * CNAME record for the zone apex isn't supported even for an alias record.
     * </p>
     * </note></dd>
     * </dl>
     * 
     * @param dNSName
     *        <i>Alias resource record sets only:</i> The value that you specify depends on where you want to route
     *        queries:</p>
     *        <dl>
     *        <dt>Amazon API Gateway custom regional APIs and edge-optimized APIs</dt>
     *        <dd>
     *        <p>
     *        Specify the applicable domain name for your API. You can get the applicable value using the AWS CLI
     *        command <a
     *        href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-domain-names.html">get-domain
     *        -names</a>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For regional APIs, specify the value of <code>regionalDomainName</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For edge-optimized APIs, specify the value of <code>distributionDomainName</code>. This is the name of the
     *        associated CloudFront distribution, such as <code>da1b2c3d4e5.cloudfront.net</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The name of the record that you're creating must match a custom domain name for your API, such as
     *        <code>api.example.com</code>.
     *        </p>
     *        </note></dd>
     *        <dt>Amazon Virtual Private Cloud interface VPC endpoint</dt>
     *        <dd>
     *        <p>
     *        Enter the API endpoint for the interface endpoint, such as
     *        <code>vpce-123456789abcdef01-example-us-east-1a.elasticloadbalancing.us-east-1.vpce.amazonaws.com</code>.
     *        For edge-optimized APIs, this is the domain name for the corresponding CloudFront distribution. You can
     *        get the value of <code>DnsName</code> using the AWS CLI command <a
     *        href="https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-vpc-endpoints.html"
     *        >describe-vpc-endpoints</a>.
     *        </p>
     *        </dd>
     *        <dt>CloudFront distribution</dt>
     *        <dd>
     *        <p>
     *        Specify the domain name that CloudFront assigned when you created your distribution.
     *        </p>
     *        <p>
     *        Your CloudFront distribution must include an alternate domain name that matches the name of the resource
     *        record set. For example, if the name of the resource record set is <i>acme.example.com</i>, your
     *        CloudFront distribution must include <i>acme.example.com</i> as one of the alternate domain names. For
     *        more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/CNAMEs.html">Using Alternate
     *        Domain Names (CNAMEs)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *        </p>
     *        <p>
     *        You can't create a resource record set in a private hosted zone to route traffic to a CloudFront
     *        distribution.
     *        </p>
     *        <note>
     *        <p>
     *        For failover alias records, you can't specify a CloudFront distribution for both the primary and secondary
     *        records. A distribution must include an alternate domain name that matches the name of the record.
     *        However, the primary and secondary records have the same name, and you can't include the same alternate
     *        domain name in more than one distribution.
     *        </p>
     *        </note></dd>
     *        <dt>Elastic Beanstalk environment</dt>
     *        <dd>
     *        <p>
     *        If the domain name for your Elastic Beanstalk environment includes the region that you deployed the
     *        environment in, you can create an alias record that routes traffic to the environment. For example, the
     *        domain name <code>my-environment.<i>us-west-2</i>.elasticbeanstalk.com</code> is a regionalized domain
     *        name.
     *        </p>
     *        <important>
     *        <p>
     *        For environments that were created before early 2016, the domain name doesn't include the region. To route
     *        traffic to these environments, you must create a CNAME record instead of an alias record. Note that you
     *        can't create a CNAME record for the root domain name. For example, if your domain name is example.com, you
     *        can create a record that routes traffic for acme.example.com to your Elastic Beanstalk environment, but
     *        you can't create a record that routes traffic for example.com to your Elastic Beanstalk environment.
     *        </p>
     *        </important>
     *        <p>
     *        For Elastic Beanstalk environments that have regionalized subdomains, specify the <code>CNAME</code>
     *        attribute for the environment. You can use the following methods to get the value of the CNAME attribute:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>AWS Management Console</i>: For information about how to get the value by using the console, see <a
     *        href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/customdomains.html">Using Custom Domains with
     *        AWS Elastic Beanstalk</a> in the <i>AWS Elastic Beanstalk Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>Elastic Beanstalk API</i>: Use the <code>DescribeEnvironments</code> action to get the value of the
     *        <code>CNAME</code> attribute. For more information, see <a
     *        href="http://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_DescribeEnvironments.html"
     *        >DescribeEnvironments</a> in the <i>AWS Elastic Beanstalk API Reference</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>AWS CLI</i>: Use the <code>describe-environments</code> command to get the value of the
     *        <code>CNAME</code> attribute. For more information, see <a
     *        href="http://docs.aws.amazon.com/cli/latest/reference/elasticbeanstalk/describe-environments.html"
     *        >describe-environments</a> in the <i>AWS Command Line Interface Reference</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>ELB load balancer</dt>
     *        <dd>
     *        <p>
     *        Specify the DNS name that is associated with the load balancer. Get the DNS name by using the AWS
     *        Management Console, the ELB API, or the AWS CLI.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>AWS Management Console</b>: Go to the EC2 page, choose <b>Load Balancers</b> in the navigation pane,
     *        choose the load balancer, choose the <b>Description</b> tab, and get the value of the <b>DNS name</b>
     *        field.
     *        </p>
     *        <p>
     *        If you're routing traffic to a Classic Load Balancer, get the value that begins with <b>dualstack</b>. If
     *        you're routing traffic to another type of load balancer, get the value that applies to the record type, A
     *        or AAAA.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Elastic Load Balancing API</b>: Use <code>DescribeLoadBalancers</code> to get the value of
     *        <code>DNSName</code>. For more information, see the applicable guide:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Classic Load Balancers: <a href=
     *        "http://docs.aws.amazon.com/elasticloadbalancing/2012-06-01/APIReference/API_DescribeLoadBalancers.html"
     *        >DescribeLoadBalancers</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Application and Network Load Balancers: <a href=
     *        "http://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html"
     *        >DescribeLoadBalancers</a>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AWS CLI</b>: Use <code>describe-load-balancers</code> to get the value of <code>DNSName</code>. For
     *        more information, see the applicable guide:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Classic Load Balancers: <a
     *        href="http://docs.aws.amazon.com/cli/latest/reference/elb/describe-load-balancers.html"
     *        >describe-load-balancers</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Application and Network Load Balancers: <a
     *        href="http://docs.aws.amazon.com/cli/latest/reference/elbv2/describe-load-balancers.html"
     *        >describe-load-balancers</a>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>Amazon S3 bucket that is configured as a static website</dt>
     *        <dd>
     *        <p>
     *        Specify the domain name of the Amazon S3 website endpoint that you created the bucket in, for example,
     *        <code>s3-website.us-east-2.amazonaws.com</code>. For more information about valid values, see the table <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Amazon Simple Storage Service
     *        (S3) Website Endpoints</a> in the <i>Amazon Web Services General Reference</i>. For more information about
     *        using S3 buckets for websites, see <a
     *        href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/getting-started.html">Getting Started with
     *        Amazon Route 53</a> in the <i>Amazon Route 53 Developer Guide.</i>
     *        </p>
     *        </dd>
     *        <dt>Another Route 53 resource record set</dt>
     *        <dd>
     *        <p>
     *        Specify the value of the <code>Name</code> element for a resource record set in the current hosted zone.
     *        </p>
     *        <note>
     *        <p>
     *        If you're creating an alias record that has the same name as the hosted zone (known as the zone apex), you
     *        can't specify the domain name for a record for which the value of <code>Type</code> is <code>CNAME</code>.
     *        This is because the alias record must have the same type as the record that you're routing traffic to, and
     *        creating a CNAME record for the zone apex isn't supported even for an alias record.
     *        </p>
     *        </note></dd>
     */

    public void setDNSName(String dNSName) {
        this.dNSName = dNSName;
    }

    /**
     * <p>
     * <i>Alias resource record sets only:</i> The value that you specify depends on where you want to route queries:
     * </p>
     * <dl>
     * <dt>Amazon API Gateway custom regional APIs and edge-optimized APIs</dt>
     * <dd>
     * <p>
     * Specify the applicable domain name for your API. You can get the applicable value using the AWS CLI command <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-domain-names.html">get-domain-names</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For regional APIs, specify the value of <code>regionalDomainName</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For edge-optimized APIs, specify the value of <code>distributionDomainName</code>. This is the name of the
     * associated CloudFront distribution, such as <code>da1b2c3d4e5.cloudfront.net</code>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The name of the record that you're creating must match a custom domain name for your API, such as
     * <code>api.example.com</code>.
     * </p>
     * </note></dd>
     * <dt>Amazon Virtual Private Cloud interface VPC endpoint</dt>
     * <dd>
     * <p>
     * Enter the API endpoint for the interface endpoint, such as
     * <code>vpce-123456789abcdef01-example-us-east-1a.elasticloadbalancing.us-east-1.vpce.amazonaws.com</code>. For
     * edge-optimized APIs, this is the domain name for the corresponding CloudFront distribution. You can get the value
     * of <code>DnsName</code> using the AWS CLI command <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-vpc-endpoints.html"
     * >describe-vpc-endpoints</a>.
     * </p>
     * </dd>
     * <dt>CloudFront distribution</dt>
     * <dd>
     * <p>
     * Specify the domain name that CloudFront assigned when you created your distribution.
     * </p>
     * <p>
     * Your CloudFront distribution must include an alternate domain name that matches the name of the resource record
     * set. For example, if the name of the resource record set is <i>acme.example.com</i>, your CloudFront distribution
     * must include <i>acme.example.com</i> as one of the alternate domain names. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/CNAMEs.html">Using Alternate Domain Names
     * (CNAMEs)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * You can't create a resource record set in a private hosted zone to route traffic to a CloudFront distribution.
     * </p>
     * <note>
     * <p>
     * For failover alias records, you can't specify a CloudFront distribution for both the primary and secondary
     * records. A distribution must include an alternate domain name that matches the name of the record. However, the
     * primary and secondary records have the same name, and you can't include the same alternate domain name in more
     * than one distribution.
     * </p>
     * </note></dd>
     * <dt>Elastic Beanstalk environment</dt>
     * <dd>
     * <p>
     * If the domain name for your Elastic Beanstalk environment includes the region that you deployed the environment
     * in, you can create an alias record that routes traffic to the environment. For example, the domain name
     * <code>my-environment.<i>us-west-2</i>.elasticbeanstalk.com</code> is a regionalized domain name.
     * </p>
     * <important>
     * <p>
     * For environments that were created before early 2016, the domain name doesn't include the region. To route
     * traffic to these environments, you must create a CNAME record instead of an alias record. Note that you can't
     * create a CNAME record for the root domain name. For example, if your domain name is example.com, you can create a
     * record that routes traffic for acme.example.com to your Elastic Beanstalk environment, but you can't create a
     * record that routes traffic for example.com to your Elastic Beanstalk environment.
     * </p>
     * </important>
     * <p>
     * For Elastic Beanstalk environments that have regionalized subdomains, specify the <code>CNAME</code> attribute
     * for the environment. You can use the following methods to get the value of the CNAME attribute:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AWS Management Console</i>: For information about how to get the value by using the console, see <a
     * href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/customdomains.html">Using Custom Domains with AWS
     * Elastic Beanstalk</a> in the <i>AWS Elastic Beanstalk Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Elastic Beanstalk API</i>: Use the <code>DescribeEnvironments</code> action to get the value of the
     * <code>CNAME</code> attribute. For more information, see <a
     * href="http://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_DescribeEnvironments.html"
     * >DescribeEnvironments</a> in the <i>AWS Elastic Beanstalk API Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>AWS CLI</i>: Use the <code>describe-environments</code> command to get the value of the <code>CNAME</code>
     * attribute. For more information, see <a
     * href="http://docs.aws.amazon.com/cli/latest/reference/elasticbeanstalk/describe-environments.html"
     * >describe-environments</a> in the <i>AWS Command Line Interface Reference</i>.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>ELB load balancer</dt>
     * <dd>
     * <p>
     * Specify the DNS name that is associated with the load balancer. Get the DNS name by using the AWS Management
     * Console, the ELB API, or the AWS CLI.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>AWS Management Console</b>: Go to the EC2 page, choose <b>Load Balancers</b> in the navigation pane, choose
     * the load balancer, choose the <b>Description</b> tab, and get the value of the <b>DNS name</b> field.
     * </p>
     * <p>
     * If you're routing traffic to a Classic Load Balancer, get the value that begins with <b>dualstack</b>. If you're
     * routing traffic to another type of load balancer, get the value that applies to the record type, A or AAAA.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Elastic Load Balancing API</b>: Use <code>DescribeLoadBalancers</code> to get the value of
     * <code>DNSName</code>. For more information, see the applicable guide:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Classic Load Balancers: <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/2012-06-01/APIReference/API_DescribeLoadBalancers.html"
     * >DescribeLoadBalancers</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Application and Network Load Balancers: <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html"
     * >DescribeLoadBalancers</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>AWS CLI</b>: Use <code>describe-load-balancers</code> to get the value of <code>DNSName</code>. For more
     * information, see the applicable guide:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Classic Load Balancers: <a
     * href="http://docs.aws.amazon.com/cli/latest/reference/elb/describe-load-balancers.html"
     * >describe-load-balancers</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Application and Network Load Balancers: <a
     * href="http://docs.aws.amazon.com/cli/latest/reference/elbv2/describe-load-balancers.html"
     * >describe-load-balancers</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </dd>
     * <dt>Amazon S3 bucket that is configured as a static website</dt>
     * <dd>
     * <p>
     * Specify the domain name of the Amazon S3 website endpoint that you created the bucket in, for example,
     * <code>s3-website.us-east-2.amazonaws.com</code>. For more information about valid values, see the table <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Amazon Simple Storage Service (S3)
     * Website Endpoints</a> in the <i>Amazon Web Services General Reference</i>. For more information about using S3
     * buckets for websites, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/getting-started.html">Getting Started with Amazon
     * Route 53</a> in the <i>Amazon Route 53 Developer Guide.</i>
     * </p>
     * </dd>
     * <dt>Another Route 53 resource record set</dt>
     * <dd>
     * <p>
     * Specify the value of the <code>Name</code> element for a resource record set in the current hosted zone.
     * </p>
     * <note>
     * <p>
     * If you're creating an alias record that has the same name as the hosted zone (known as the zone apex), you can't
     * specify the domain name for a record for which the value of <code>Type</code> is <code>CNAME</code>. This is
     * because the alias record must have the same type as the record that you're routing traffic to, and creating a
     * CNAME record for the zone apex isn't supported even for an alias record.
     * </p>
     * </note></dd>
     * </dl>
     * 
     * @return <i>Alias resource record sets only:</i> The value that you specify depends on where you want to route
     *         queries:</p>
     *         <dl>
     *         <dt>Amazon API Gateway custom regional APIs and edge-optimized APIs</dt>
     *         <dd>
     *         <p>
     *         Specify the applicable domain name for your API. You can get the applicable value using the AWS CLI
     *         command <a
     *         href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-domain-names.html">get-domain
     *         -names</a>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For regional APIs, specify the value of <code>regionalDomainName</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For edge-optimized APIs, specify the value of <code>distributionDomainName</code>. This is the name of
     *         the associated CloudFront distribution, such as <code>da1b2c3d4e5.cloudfront.net</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         The name of the record that you're creating must match a custom domain name for your API, such as
     *         <code>api.example.com</code>.
     *         </p>
     *         </note></dd>
     *         <dt>Amazon Virtual Private Cloud interface VPC endpoint</dt>
     *         <dd>
     *         <p>
     *         Enter the API endpoint for the interface endpoint, such as
     *         <code>vpce-123456789abcdef01-example-us-east-1a.elasticloadbalancing.us-east-1.vpce.amazonaws.com</code>.
     *         For edge-optimized APIs, this is the domain name for the corresponding CloudFront distribution. You can
     *         get the value of <code>DnsName</code> using the AWS CLI command <a
     *         href="https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-vpc-endpoints.html"
     *         >describe-vpc-endpoints</a>.
     *         </p>
     *         </dd>
     *         <dt>CloudFront distribution</dt>
     *         <dd>
     *         <p>
     *         Specify the domain name that CloudFront assigned when you created your distribution.
     *         </p>
     *         <p>
     *         Your CloudFront distribution must include an alternate domain name that matches the name of the resource
     *         record set. For example, if the name of the resource record set is <i>acme.example.com</i>, your
     *         CloudFront distribution must include <i>acme.example.com</i> as one of the alternate domain names. For
     *         more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/CNAMEs.html">Using Alternate
     *         Domain Names (CNAMEs)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *         </p>
     *         <p>
     *         You can't create a resource record set in a private hosted zone to route traffic to a CloudFront
     *         distribution.
     *         </p>
     *         <note>
     *         <p>
     *         For failover alias records, you can't specify a CloudFront distribution for both the primary and
     *         secondary records. A distribution must include an alternate domain name that matches the name of the
     *         record. However, the primary and secondary records have the same name, and you can't include the same
     *         alternate domain name in more than one distribution.
     *         </p>
     *         </note></dd>
     *         <dt>Elastic Beanstalk environment</dt>
     *         <dd>
     *         <p>
     *         If the domain name for your Elastic Beanstalk environment includes the region that you deployed the
     *         environment in, you can create an alias record that routes traffic to the environment. For example, the
     *         domain name <code>my-environment.<i>us-west-2</i>.elasticbeanstalk.com</code> is a regionalized domain
     *         name.
     *         </p>
     *         <important>
     *         <p>
     *         For environments that were created before early 2016, the domain name doesn't include the region. To
     *         route traffic to these environments, you must create a CNAME record instead of an alias record. Note that
     *         you can't create a CNAME record for the root domain name. For example, if your domain name is
     *         example.com, you can create a record that routes traffic for acme.example.com to your Elastic Beanstalk
     *         environment, but you can't create a record that routes traffic for example.com to your Elastic Beanstalk
     *         environment.
     *         </p>
     *         </important>
     *         <p>
     *         For Elastic Beanstalk environments that have regionalized subdomains, specify the <code>CNAME</code>
     *         attribute for the environment. You can use the following methods to get the value of the CNAME attribute:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>AWS Management Console</i>: For information about how to get the value by using the console, see <a
     *         href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/customdomains.html">Using Custom Domains with
     *         AWS Elastic Beanstalk</a> in the <i>AWS Elastic Beanstalk Developer Guide</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Elastic Beanstalk API</i>: Use the <code>DescribeEnvironments</code> action to get the value of the
     *         <code>CNAME</code> attribute. For more information, see <a
     *         href="http://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_DescribeEnvironments.html"
     *         >DescribeEnvironments</a> in the <i>AWS Elastic Beanstalk API Reference</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>AWS CLI</i>: Use the <code>describe-environments</code> command to get the value of the
     *         <code>CNAME</code> attribute. For more information, see <a
     *         href="http://docs.aws.amazon.com/cli/latest/reference/elasticbeanstalk/describe-environments.html"
     *         >describe-environments</a> in the <i>AWS Command Line Interface Reference</i>.
     *         </p>
     *         </li>
     *         </ul>
     *         </dd>
     *         <dt>ELB load balancer</dt>
     *         <dd>
     *         <p>
     *         Specify the DNS name that is associated with the load balancer. Get the DNS name by using the AWS
     *         Management Console, the ELB API, or the AWS CLI.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>AWS Management Console</b>: Go to the EC2 page, choose <b>Load Balancers</b> in the navigation pane,
     *         choose the load balancer, choose the <b>Description</b> tab, and get the value of the <b>DNS name</b>
     *         field.
     *         </p>
     *         <p>
     *         If you're routing traffic to a Classic Load Balancer, get the value that begins with <b>dualstack</b>. If
     *         you're routing traffic to another type of load balancer, get the value that applies to the record type, A
     *         or AAAA.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Elastic Load Balancing API</b>: Use <code>DescribeLoadBalancers</code> to get the value of
     *         <code>DNSName</code>. For more information, see the applicable guide:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Classic Load Balancers: <a href=
     *         "http://docs.aws.amazon.com/elasticloadbalancing/2012-06-01/APIReference/API_DescribeLoadBalancers.html"
     *         >DescribeLoadBalancers</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Application and Network Load Balancers: <a href=
     *         "http://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html"
     *         >DescribeLoadBalancers</a>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <b>AWS CLI</b>: Use <code>describe-load-balancers</code> to get the value of <code>DNSName</code>. For
     *         more information, see the applicable guide:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Classic Load Balancers: <a
     *         href="http://docs.aws.amazon.com/cli/latest/reference/elb/describe-load-balancers.html"
     *         >describe-load-balancers</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Application and Network Load Balancers: <a
     *         href="http://docs.aws.amazon.com/cli/latest/reference/elbv2/describe-load-balancers.html"
     *         >describe-load-balancers</a>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         </dd>
     *         <dt>Amazon S3 bucket that is configured as a static website</dt>
     *         <dd>
     *         <p>
     *         Specify the domain name of the Amazon S3 website endpoint that you created the bucket in, for example,
     *         <code>s3-website.us-east-2.amazonaws.com</code>. For more information about valid values, see the table
     *         <a href="http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Amazon Simple Storage Service
     *         (S3) Website Endpoints</a> in the <i>Amazon Web Services General Reference</i>. For more information
     *         about using S3 buckets for websites, see <a
     *         href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/getting-started.html">Getting Started with
     *         Amazon Route 53</a> in the <i>Amazon Route 53 Developer Guide.</i>
     *         </p>
     *         </dd>
     *         <dt>Another Route 53 resource record set</dt>
     *         <dd>
     *         <p>
     *         Specify the value of the <code>Name</code> element for a resource record set in the current hosted zone.
     *         </p>
     *         <note>
     *         <p>
     *         If you're creating an alias record that has the same name as the hosted zone (known as the zone apex),
     *         you can't specify the domain name for a record for which the value of <code>Type</code> is
     *         <code>CNAME</code>. This is because the alias record must have the same type as the record that you're
     *         routing traffic to, and creating a CNAME record for the zone apex isn't supported even for an alias
     *         record.
     *         </p>
     *         </note></dd>
     */

    public String getDNSName() {
        return this.dNSName;
    }

    /**
     * <p>
     * <i>Alias resource record sets only:</i> The value that you specify depends on where you want to route queries:
     * </p>
     * <dl>
     * <dt>Amazon API Gateway custom regional APIs and edge-optimized APIs</dt>
     * <dd>
     * <p>
     * Specify the applicable domain name for your API. You can get the applicable value using the AWS CLI command <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-domain-names.html">get-domain-names</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For regional APIs, specify the value of <code>regionalDomainName</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For edge-optimized APIs, specify the value of <code>distributionDomainName</code>. This is the name of the
     * associated CloudFront distribution, such as <code>da1b2c3d4e5.cloudfront.net</code>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The name of the record that you're creating must match a custom domain name for your API, such as
     * <code>api.example.com</code>.
     * </p>
     * </note></dd>
     * <dt>Amazon Virtual Private Cloud interface VPC endpoint</dt>
     * <dd>
     * <p>
     * Enter the API endpoint for the interface endpoint, such as
     * <code>vpce-123456789abcdef01-example-us-east-1a.elasticloadbalancing.us-east-1.vpce.amazonaws.com</code>. For
     * edge-optimized APIs, this is the domain name for the corresponding CloudFront distribution. You can get the value
     * of <code>DnsName</code> using the AWS CLI command <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-vpc-endpoints.html"
     * >describe-vpc-endpoints</a>.
     * </p>
     * </dd>
     * <dt>CloudFront distribution</dt>
     * <dd>
     * <p>
     * Specify the domain name that CloudFront assigned when you created your distribution.
     * </p>
     * <p>
     * Your CloudFront distribution must include an alternate domain name that matches the name of the resource record
     * set. For example, if the name of the resource record set is <i>acme.example.com</i>, your CloudFront distribution
     * must include <i>acme.example.com</i> as one of the alternate domain names. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/CNAMEs.html">Using Alternate Domain Names
     * (CNAMEs)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <p>
     * You can't create a resource record set in a private hosted zone to route traffic to a CloudFront distribution.
     * </p>
     * <note>
     * <p>
     * For failover alias records, you can't specify a CloudFront distribution for both the primary and secondary
     * records. A distribution must include an alternate domain name that matches the name of the record. However, the
     * primary and secondary records have the same name, and you can't include the same alternate domain name in more
     * than one distribution.
     * </p>
     * </note></dd>
     * <dt>Elastic Beanstalk environment</dt>
     * <dd>
     * <p>
     * If the domain name for your Elastic Beanstalk environment includes the region that you deployed the environment
     * in, you can create an alias record that routes traffic to the environment. For example, the domain name
     * <code>my-environment.<i>us-west-2</i>.elasticbeanstalk.com</code> is a regionalized domain name.
     * </p>
     * <important>
     * <p>
     * For environments that were created before early 2016, the domain name doesn't include the region. To route
     * traffic to these environments, you must create a CNAME record instead of an alias record. Note that you can't
     * create a CNAME record for the root domain name. For example, if your domain name is example.com, you can create a
     * record that routes traffic for acme.example.com to your Elastic Beanstalk environment, but you can't create a
     * record that routes traffic for example.com to your Elastic Beanstalk environment.
     * </p>
     * </important>
     * <p>
     * For Elastic Beanstalk environments that have regionalized subdomains, specify the <code>CNAME</code> attribute
     * for the environment. You can use the following methods to get the value of the CNAME attribute:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>AWS Management Console</i>: For information about how to get the value by using the console, see <a
     * href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/customdomains.html">Using Custom Domains with AWS
     * Elastic Beanstalk</a> in the <i>AWS Elastic Beanstalk Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Elastic Beanstalk API</i>: Use the <code>DescribeEnvironments</code> action to get the value of the
     * <code>CNAME</code> attribute. For more information, see <a
     * href="http://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_DescribeEnvironments.html"
     * >DescribeEnvironments</a> in the <i>AWS Elastic Beanstalk API Reference</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>AWS CLI</i>: Use the <code>describe-environments</code> command to get the value of the <code>CNAME</code>
     * attribute. For more information, see <a
     * href="http://docs.aws.amazon.com/cli/latest/reference/elasticbeanstalk/describe-environments.html"
     * >describe-environments</a> in the <i>AWS Command Line Interface Reference</i>.
     * </p>
     * </li>
     * </ul>
     * </dd>
     * <dt>ELB load balancer</dt>
     * <dd>
     * <p>
     * Specify the DNS name that is associated with the load balancer. Get the DNS name by using the AWS Management
     * Console, the ELB API, or the AWS CLI.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>AWS Management Console</b>: Go to the EC2 page, choose <b>Load Balancers</b> in the navigation pane, choose
     * the load balancer, choose the <b>Description</b> tab, and get the value of the <b>DNS name</b> field.
     * </p>
     * <p>
     * If you're routing traffic to a Classic Load Balancer, get the value that begins with <b>dualstack</b>. If you're
     * routing traffic to another type of load balancer, get the value that applies to the record type, A or AAAA.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Elastic Load Balancing API</b>: Use <code>DescribeLoadBalancers</code> to get the value of
     * <code>DNSName</code>. For more information, see the applicable guide:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Classic Load Balancers: <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/2012-06-01/APIReference/API_DescribeLoadBalancers.html"
     * >DescribeLoadBalancers</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Application and Network Load Balancers: <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html"
     * >DescribeLoadBalancers</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b>AWS CLI</b>: Use <code>describe-load-balancers</code> to get the value of <code>DNSName</code>. For more
     * information, see the applicable guide:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Classic Load Balancers: <a
     * href="http://docs.aws.amazon.com/cli/latest/reference/elb/describe-load-balancers.html"
     * >describe-load-balancers</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * Application and Network Load Balancers: <a
     * href="http://docs.aws.amazon.com/cli/latest/reference/elbv2/describe-load-balancers.html"
     * >describe-load-balancers</a>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </dd>
     * <dt>Amazon S3 bucket that is configured as a static website</dt>
     * <dd>
     * <p>
     * Specify the domain name of the Amazon S3 website endpoint that you created the bucket in, for example,
     * <code>s3-website.us-east-2.amazonaws.com</code>. For more information about valid values, see the table <a
     * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Amazon Simple Storage Service (S3)
     * Website Endpoints</a> in the <i>Amazon Web Services General Reference</i>. For more information about using S3
     * buckets for websites, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/getting-started.html">Getting Started with Amazon
     * Route 53</a> in the <i>Amazon Route 53 Developer Guide.</i>
     * </p>
     * </dd>
     * <dt>Another Route 53 resource record set</dt>
     * <dd>
     * <p>
     * Specify the value of the <code>Name</code> element for a resource record set in the current hosted zone.
     * </p>
     * <note>
     * <p>
     * If you're creating an alias record that has the same name as the hosted zone (known as the zone apex), you can't
     * specify the domain name for a record for which the value of <code>Type</code> is <code>CNAME</code>. This is
     * because the alias record must have the same type as the record that you're routing traffic to, and creating a
     * CNAME record for the zone apex isn't supported even for an alias record.
     * </p>
     * </note></dd>
     * </dl>
     * 
     * @param dNSName
     *        <i>Alias resource record sets only:</i> The value that you specify depends on where you want to route
     *        queries:</p>
     *        <dl>
     *        <dt>Amazon API Gateway custom regional APIs and edge-optimized APIs</dt>
     *        <dd>
     *        <p>
     *        Specify the applicable domain name for your API. You can get the applicable value using the AWS CLI
     *        command <a
     *        href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-domain-names.html">get-domain
     *        -names</a>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For regional APIs, specify the value of <code>regionalDomainName</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For edge-optimized APIs, specify the value of <code>distributionDomainName</code>. This is the name of the
     *        associated CloudFront distribution, such as <code>da1b2c3d4e5.cloudfront.net</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The name of the record that you're creating must match a custom domain name for your API, such as
     *        <code>api.example.com</code>.
     *        </p>
     *        </note></dd>
     *        <dt>Amazon Virtual Private Cloud interface VPC endpoint</dt>
     *        <dd>
     *        <p>
     *        Enter the API endpoint for the interface endpoint, such as
     *        <code>vpce-123456789abcdef01-example-us-east-1a.elasticloadbalancing.us-east-1.vpce.amazonaws.com</code>.
     *        For edge-optimized APIs, this is the domain name for the corresponding CloudFront distribution. You can
     *        get the value of <code>DnsName</code> using the AWS CLI command <a
     *        href="https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-vpc-endpoints.html"
     *        >describe-vpc-endpoints</a>.
     *        </p>
     *        </dd>
     *        <dt>CloudFront distribution</dt>
     *        <dd>
     *        <p>
     *        Specify the domain name that CloudFront assigned when you created your distribution.
     *        </p>
     *        <p>
     *        Your CloudFront distribution must include an alternate domain name that matches the name of the resource
     *        record set. For example, if the name of the resource record set is <i>acme.example.com</i>, your
     *        CloudFront distribution must include <i>acme.example.com</i> as one of the alternate domain names. For
     *        more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/CNAMEs.html">Using Alternate
     *        Domain Names (CNAMEs)</a> in the <i>Amazon CloudFront Developer Guide</i>.
     *        </p>
     *        <p>
     *        You can't create a resource record set in a private hosted zone to route traffic to a CloudFront
     *        distribution.
     *        </p>
     *        <note>
     *        <p>
     *        For failover alias records, you can't specify a CloudFront distribution for both the primary and secondary
     *        records. A distribution must include an alternate domain name that matches the name of the record.
     *        However, the primary and secondary records have the same name, and you can't include the same alternate
     *        domain name in more than one distribution.
     *        </p>
     *        </note></dd>
     *        <dt>Elastic Beanstalk environment</dt>
     *        <dd>
     *        <p>
     *        If the domain name for your Elastic Beanstalk environment includes the region that you deployed the
     *        environment in, you can create an alias record that routes traffic to the environment. For example, the
     *        domain name <code>my-environment.<i>us-west-2</i>.elasticbeanstalk.com</code> is a regionalized domain
     *        name.
     *        </p>
     *        <important>
     *        <p>
     *        For environments that were created before early 2016, the domain name doesn't include the region. To route
     *        traffic to these environments, you must create a CNAME record instead of an alias record. Note that you
     *        can't create a CNAME record for the root domain name. For example, if your domain name is example.com, you
     *        can create a record that routes traffic for acme.example.com to your Elastic Beanstalk environment, but
     *        you can't create a record that routes traffic for example.com to your Elastic Beanstalk environment.
     *        </p>
     *        </important>
     *        <p>
     *        For Elastic Beanstalk environments that have regionalized subdomains, specify the <code>CNAME</code>
     *        attribute for the environment. You can use the following methods to get the value of the CNAME attribute:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>AWS Management Console</i>: For information about how to get the value by using the console, see <a
     *        href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/customdomains.html">Using Custom Domains with
     *        AWS Elastic Beanstalk</a> in the <i>AWS Elastic Beanstalk Developer Guide</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>Elastic Beanstalk API</i>: Use the <code>DescribeEnvironments</code> action to get the value of the
     *        <code>CNAME</code> attribute. For more information, see <a
     *        href="http://docs.aws.amazon.com/elasticbeanstalk/latest/api/API_DescribeEnvironments.html"
     *        >DescribeEnvironments</a> in the <i>AWS Elastic Beanstalk API Reference</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>AWS CLI</i>: Use the <code>describe-environments</code> command to get the value of the
     *        <code>CNAME</code> attribute. For more information, see <a
     *        href="http://docs.aws.amazon.com/cli/latest/reference/elasticbeanstalk/describe-environments.html"
     *        >describe-environments</a> in the <i>AWS Command Line Interface Reference</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>ELB load balancer</dt>
     *        <dd>
     *        <p>
     *        Specify the DNS name that is associated with the load balancer. Get the DNS name by using the AWS
     *        Management Console, the ELB API, or the AWS CLI.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>AWS Management Console</b>: Go to the EC2 page, choose <b>Load Balancers</b> in the navigation pane,
     *        choose the load balancer, choose the <b>Description</b> tab, and get the value of the <b>DNS name</b>
     *        field.
     *        </p>
     *        <p>
     *        If you're routing traffic to a Classic Load Balancer, get the value that begins with <b>dualstack</b>. If
     *        you're routing traffic to another type of load balancer, get the value that applies to the record type, A
     *        or AAAA.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Elastic Load Balancing API</b>: Use <code>DescribeLoadBalancers</code> to get the value of
     *        <code>DNSName</code>. For more information, see the applicable guide:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Classic Load Balancers: <a href=
     *        "http://docs.aws.amazon.com/elasticloadbalancing/2012-06-01/APIReference/API_DescribeLoadBalancers.html"
     *        >DescribeLoadBalancers</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Application and Network Load Balancers: <a href=
     *        "http://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html"
     *        >DescribeLoadBalancers</a>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AWS CLI</b>: Use <code>describe-load-balancers</code> to get the value of <code>DNSName</code>. For
     *        more information, see the applicable guide:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Classic Load Balancers: <a
     *        href="http://docs.aws.amazon.com/cli/latest/reference/elb/describe-load-balancers.html"
     *        >describe-load-balancers</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Application and Network Load Balancers: <a
     *        href="http://docs.aws.amazon.com/cli/latest/reference/elbv2/describe-load-balancers.html"
     *        >describe-load-balancers</a>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        </dd>
     *        <dt>Amazon S3 bucket that is configured as a static website</dt>
     *        <dd>
     *        <p>
     *        Specify the domain name of the Amazon S3 website endpoint that you created the bucket in, for example,
     *        <code>s3-website.us-east-2.amazonaws.com</code>. For more information about valid values, see the table <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Amazon Simple Storage Service
     *        (S3) Website Endpoints</a> in the <i>Amazon Web Services General Reference</i>. For more information about
     *        using S3 buckets for websites, see <a
     *        href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/getting-started.html">Getting Started with
     *        Amazon Route 53</a> in the <i>Amazon Route 53 Developer Guide.</i>
     *        </p>
     *        </dd>
     *        <dt>Another Route 53 resource record set</dt>
     *        <dd>
     *        <p>
     *        Specify the value of the <code>Name</code> element for a resource record set in the current hosted zone.
     *        </p>
     *        <note>
     *        <p>
     *        If you're creating an alias record that has the same name as the hosted zone (known as the zone apex), you
     *        can't specify the domain name for a record for which the value of <code>Type</code> is <code>CNAME</code>.
     *        This is because the alias record must have the same type as the record that you're routing traffic to, and
     *        creating a CNAME record for the zone apex isn't supported even for an alias record.
     *        </p>
     *        </note></dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AliasTarget withDNSName(String dNSName) {
        setDNSName(dNSName);
        return this;
    }

    /**
     * <p>
     * <i>Applies only to alias, failover alias, geolocation alias, latency alias, and weighted alias resource record
     * sets:</i> When <code>EvaluateTargetHealth</code> is <code>true</code>, an alias resource record set inherits the
     * health of the referenced AWS resource, such as an ELB load balancer or another resource record set in the hosted
     * zone.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <dl>
     * <dt>CloudFront distributions</dt>
     * <dd>
     * <p>
     * You can't set <code>EvaluateTargetHealth</code> to <code>true</code> when the alias target is a CloudFront
     * distribution.
     * </p>
     * </dd>
     * <dt>Elastic Beanstalk environments that have regionalized subdomains</dt>
     * <dd>
     * <p>
     * If you specify an Elastic Beanstalk environment in <code>DNSName</code> and the environment contains an ELB load
     * balancer, Elastic Load Balancing routes queries only to the healthy Amazon EC2 instances that are registered with
     * the load balancer. (An environment automatically contains an ELB load balancer if it includes more than one
     * Amazon EC2 instance.) If you set <code>EvaluateTargetHealth</code> to <code>true</code> and either no Amazon EC2
     * instances are healthy or the load balancer itself is unhealthy, Route 53 routes queries to other available
     * resources that are healthy, if any.
     * </p>
     * <p>
     * If the environment contains a single Amazon EC2 instance, there are no special requirements.
     * </p>
     * </dd>
     * <dt>ELB load balancers</dt>
     * <dd>
     * <p>
     * Health checking behavior depends on the type of load balancer:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Classic Load Balancers</b>: If you specify an ELB Classic Load Balancer in <code>DNSName</code>, Elastic Load
     * Balancing routes queries only to the healthy Amazon EC2 instances that are registered with the load balancer. If
     * you set <code>EvaluateTargetHealth</code> to <code>true</code> and either no EC2 instances are healthy or the
     * load balancer itself is unhealthy, Route 53 routes queries to other resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Application and Network Load Balancers</b>: If you specify an ELB Application or Network Load Balancer and you
     * set <code>EvaluateTargetHealth</code> to <code>true</code>, Route 53 routes queries to the load balancer based on
     * the health of the target groups that are associated with the load balancer:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an Application or Network Load Balancer to be considered healthy, every target group that contains targets
     * must contain at least one healthy target. If any target group contains only unhealthy targets, the load balancer
     * is considered unhealthy, and Route 53 routes queries to other resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * A target group that has no registered targets is considered unhealthy.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <note>
     * <p>
     * When you create a load balancer, you configure settings for Elastic Load Balancing health checks; they're not
     * Route 53 health checks, but they perform a similar function. Do not create Route 53 health checks for the EC2
     * instances that you register with an ELB load balancer.
     * </p>
     * </note></dd>
     * <dt>S3 buckets</dt>
     * <dd>
     * <p>
     * There are no special requirements for setting <code>EvaluateTargetHealth</code> to <code>true</code> when the
     * alias target is an S3 bucket.
     * </p>
     * </dd>
     * <dt>Other records in the same hosted zone</dt>
     * <dd>
     * <p>
     * If the AWS resource that you specify in <code>DNSName</code> is a record or a group of records (for example, a
     * group of weighted records) but is not another alias record, we recommend that you associate a health check with
     * all of the records in the alias target. For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html#dns-failover-complex-configs-hc-omitting"
     * >What Happens When You Omit Health Checks?</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * For more information and examples, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html">Amazon Route 53 Health Checks
     * and DNS Failover</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * 
     * @param evaluateTargetHealth
     *        <i>Applies only to alias, failover alias, geolocation alias, latency alias, and weighted alias resource
     *        record sets:</i> When <code>EvaluateTargetHealth</code> is <code>true</code>, an alias resource record set
     *        inherits the health of the referenced AWS resource, such as an ELB load balancer or another resource
     *        record set in the hosted zone.</p>
     *        <p>
     *        Note the following:
     *        </p>
     *        <dl>
     *        <dt>CloudFront distributions</dt>
     *        <dd>
     *        <p>
     *        You can't set <code>EvaluateTargetHealth</code> to <code>true</code> when the alias target is a CloudFront
     *        distribution.
     *        </p>
     *        </dd>
     *        <dt>Elastic Beanstalk environments that have regionalized subdomains</dt>
     *        <dd>
     *        <p>
     *        If you specify an Elastic Beanstalk environment in <code>DNSName</code> and the environment contains an
     *        ELB load balancer, Elastic Load Balancing routes queries only to the healthy Amazon EC2 instances that are
     *        registered with the load balancer. (An environment automatically contains an ELB load balancer if it
     *        includes more than one Amazon EC2 instance.) If you set <code>EvaluateTargetHealth</code> to
     *        <code>true</code> and either no Amazon EC2 instances are healthy or the load balancer itself is unhealthy,
     *        Route 53 routes queries to other available resources that are healthy, if any.
     *        </p>
     *        <p>
     *        If the environment contains a single Amazon EC2 instance, there are no special requirements.
     *        </p>
     *        </dd>
     *        <dt>ELB load balancers</dt>
     *        <dd>
     *        <p>
     *        Health checking behavior depends on the type of load balancer:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Classic Load Balancers</b>: If you specify an ELB Classic Load Balancer in <code>DNSName</code>,
     *        Elastic Load Balancing routes queries only to the healthy Amazon EC2 instances that are registered with
     *        the load balancer. If you set <code>EvaluateTargetHealth</code> to <code>true</code> and either no EC2
     *        instances are healthy or the load balancer itself is unhealthy, Route 53 routes queries to other
     *        resources.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Application and Network Load Balancers</b>: If you specify an ELB Application or Network Load Balancer
     *        and you set <code>EvaluateTargetHealth</code> to <code>true</code>, Route 53 routes queries to the load
     *        balancer based on the health of the target groups that are associated with the load balancer:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For an Application or Network Load Balancer to be considered healthy, every target group that contains
     *        targets must contain at least one healthy target. If any target group contains only unhealthy targets, the
     *        load balancer is considered unhealthy, and Route 53 routes queries to other resources.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A target group that has no registered targets is considered unhealthy.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        When you create a load balancer, you configure settings for Elastic Load Balancing health checks; they're
     *        not Route 53 health checks, but they perform a similar function. Do not create Route 53 health checks for
     *        the EC2 instances that you register with an ELB load balancer.
     *        </p>
     *        </note></dd>
     *        <dt>S3 buckets</dt>
     *        <dd>
     *        <p>
     *        There are no special requirements for setting <code>EvaluateTargetHealth</code> to <code>true</code> when
     *        the alias target is an S3 bucket.
     *        </p>
     *        </dd>
     *        <dt>Other records in the same hosted zone</dt>
     *        <dd>
     *        <p>
     *        If the AWS resource that you specify in <code>DNSName</code> is a record or a group of records (for
     *        example, a group of weighted records) but is not another alias record, we recommend that you associate a
     *        health check with all of the records in the alias target. For more information, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html#dns-failover-complex-configs-hc-omitting"
     *        >What Happens When You Omit Health Checks?</a> in the <i>Amazon Route 53 Developer Guide</i>.
     *        </p>
     *        </dd>
     *        </dl>
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
     * <i>Applies only to alias, failover alias, geolocation alias, latency alias, and weighted alias resource record
     * sets:</i> When <code>EvaluateTargetHealth</code> is <code>true</code>, an alias resource record set inherits the
     * health of the referenced AWS resource, such as an ELB load balancer or another resource record set in the hosted
     * zone.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <dl>
     * <dt>CloudFront distributions</dt>
     * <dd>
     * <p>
     * You can't set <code>EvaluateTargetHealth</code> to <code>true</code> when the alias target is a CloudFront
     * distribution.
     * </p>
     * </dd>
     * <dt>Elastic Beanstalk environments that have regionalized subdomains</dt>
     * <dd>
     * <p>
     * If you specify an Elastic Beanstalk environment in <code>DNSName</code> and the environment contains an ELB load
     * balancer, Elastic Load Balancing routes queries only to the healthy Amazon EC2 instances that are registered with
     * the load balancer. (An environment automatically contains an ELB load balancer if it includes more than one
     * Amazon EC2 instance.) If you set <code>EvaluateTargetHealth</code> to <code>true</code> and either no Amazon EC2
     * instances are healthy or the load balancer itself is unhealthy, Route 53 routes queries to other available
     * resources that are healthy, if any.
     * </p>
     * <p>
     * If the environment contains a single Amazon EC2 instance, there are no special requirements.
     * </p>
     * </dd>
     * <dt>ELB load balancers</dt>
     * <dd>
     * <p>
     * Health checking behavior depends on the type of load balancer:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Classic Load Balancers</b>: If you specify an ELB Classic Load Balancer in <code>DNSName</code>, Elastic Load
     * Balancing routes queries only to the healthy Amazon EC2 instances that are registered with the load balancer. If
     * you set <code>EvaluateTargetHealth</code> to <code>true</code> and either no EC2 instances are healthy or the
     * load balancer itself is unhealthy, Route 53 routes queries to other resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Application and Network Load Balancers</b>: If you specify an ELB Application or Network Load Balancer and you
     * set <code>EvaluateTargetHealth</code> to <code>true</code>, Route 53 routes queries to the load balancer based on
     * the health of the target groups that are associated with the load balancer:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an Application or Network Load Balancer to be considered healthy, every target group that contains targets
     * must contain at least one healthy target. If any target group contains only unhealthy targets, the load balancer
     * is considered unhealthy, and Route 53 routes queries to other resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * A target group that has no registered targets is considered unhealthy.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <note>
     * <p>
     * When you create a load balancer, you configure settings for Elastic Load Balancing health checks; they're not
     * Route 53 health checks, but they perform a similar function. Do not create Route 53 health checks for the EC2
     * instances that you register with an ELB load balancer.
     * </p>
     * </note></dd>
     * <dt>S3 buckets</dt>
     * <dd>
     * <p>
     * There are no special requirements for setting <code>EvaluateTargetHealth</code> to <code>true</code> when the
     * alias target is an S3 bucket.
     * </p>
     * </dd>
     * <dt>Other records in the same hosted zone</dt>
     * <dd>
     * <p>
     * If the AWS resource that you specify in <code>DNSName</code> is a record or a group of records (for example, a
     * group of weighted records) but is not another alias record, we recommend that you associate a health check with
     * all of the records in the alias target. For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html#dns-failover-complex-configs-hc-omitting"
     * >What Happens When You Omit Health Checks?</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * For more information and examples, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html">Amazon Route 53 Health Checks
     * and DNS Failover</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * 
     * @return <i>Applies only to alias, failover alias, geolocation alias, latency alias, and weighted alias resource
     *         record sets:</i> When <code>EvaluateTargetHealth</code> is <code>true</code>, an alias resource record
     *         set inherits the health of the referenced AWS resource, such as an ELB load balancer or another resource
     *         record set in the hosted zone.</p>
     *         <p>
     *         Note the following:
     *         </p>
     *         <dl>
     *         <dt>CloudFront distributions</dt>
     *         <dd>
     *         <p>
     *         You can't set <code>EvaluateTargetHealth</code> to <code>true</code> when the alias target is a
     *         CloudFront distribution.
     *         </p>
     *         </dd>
     *         <dt>Elastic Beanstalk environments that have regionalized subdomains</dt>
     *         <dd>
     *         <p>
     *         If you specify an Elastic Beanstalk environment in <code>DNSName</code> and the environment contains an
     *         ELB load balancer, Elastic Load Balancing routes queries only to the healthy Amazon EC2 instances that
     *         are registered with the load balancer. (An environment automatically contains an ELB load balancer if it
     *         includes more than one Amazon EC2 instance.) If you set <code>EvaluateTargetHealth</code> to
     *         <code>true</code> and either no Amazon EC2 instances are healthy or the load balancer itself is
     *         unhealthy, Route 53 routes queries to other available resources that are healthy, if any.
     *         </p>
     *         <p>
     *         If the environment contains a single Amazon EC2 instance, there are no special requirements.
     *         </p>
     *         </dd>
     *         <dt>ELB load balancers</dt>
     *         <dd>
     *         <p>
     *         Health checking behavior depends on the type of load balancer:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Classic Load Balancers</b>: If you specify an ELB Classic Load Balancer in <code>DNSName</code>,
     *         Elastic Load Balancing routes queries only to the healthy Amazon EC2 instances that are registered with
     *         the load balancer. If you set <code>EvaluateTargetHealth</code> to <code>true</code> and either no EC2
     *         instances are healthy or the load balancer itself is unhealthy, Route 53 routes queries to other
     *         resources.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Application and Network Load Balancers</b>: If you specify an ELB Application or Network Load Balancer
     *         and you set <code>EvaluateTargetHealth</code> to <code>true</code>, Route 53 routes queries to the load
     *         balancer based on the health of the target groups that are associated with the load balancer:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For an Application or Network Load Balancer to be considered healthy, every target group that contains
     *         targets must contain at least one healthy target. If any target group contains only unhealthy targets,
     *         the load balancer is considered unhealthy, and Route 53 routes queries to other resources.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A target group that has no registered targets is considered unhealthy.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         When you create a load balancer, you configure settings for Elastic Load Balancing health checks; they're
     *         not Route 53 health checks, but they perform a similar function. Do not create Route 53 health checks for
     *         the EC2 instances that you register with an ELB load balancer.
     *         </p>
     *         </note></dd>
     *         <dt>S3 buckets</dt>
     *         <dd>
     *         <p>
     *         There are no special requirements for setting <code>EvaluateTargetHealth</code> to <code>true</code> when
     *         the alias target is an S3 bucket.
     *         </p>
     *         </dd>
     *         <dt>Other records in the same hosted zone</dt>
     *         <dd>
     *         <p>
     *         If the AWS resource that you specify in <code>DNSName</code> is a record or a group of records (for
     *         example, a group of weighted records) but is not another alias record, we recommend that you associate a
     *         health check with all of the records in the alias target. For more information, see <a href=
     *         "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html#dns-failover-complex-configs-hc-omitting"
     *         >What Happens When You Omit Health Checks?</a> in the <i>Amazon Route 53 Developer Guide</i>.
     *         </p>
     *         </dd>
     *         </dl>
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
     * <i>Applies only to alias, failover alias, geolocation alias, latency alias, and weighted alias resource record
     * sets:</i> When <code>EvaluateTargetHealth</code> is <code>true</code>, an alias resource record set inherits the
     * health of the referenced AWS resource, such as an ELB load balancer or another resource record set in the hosted
     * zone.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <dl>
     * <dt>CloudFront distributions</dt>
     * <dd>
     * <p>
     * You can't set <code>EvaluateTargetHealth</code> to <code>true</code> when the alias target is a CloudFront
     * distribution.
     * </p>
     * </dd>
     * <dt>Elastic Beanstalk environments that have regionalized subdomains</dt>
     * <dd>
     * <p>
     * If you specify an Elastic Beanstalk environment in <code>DNSName</code> and the environment contains an ELB load
     * balancer, Elastic Load Balancing routes queries only to the healthy Amazon EC2 instances that are registered with
     * the load balancer. (An environment automatically contains an ELB load balancer if it includes more than one
     * Amazon EC2 instance.) If you set <code>EvaluateTargetHealth</code> to <code>true</code> and either no Amazon EC2
     * instances are healthy or the load balancer itself is unhealthy, Route 53 routes queries to other available
     * resources that are healthy, if any.
     * </p>
     * <p>
     * If the environment contains a single Amazon EC2 instance, there are no special requirements.
     * </p>
     * </dd>
     * <dt>ELB load balancers</dt>
     * <dd>
     * <p>
     * Health checking behavior depends on the type of load balancer:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Classic Load Balancers</b>: If you specify an ELB Classic Load Balancer in <code>DNSName</code>, Elastic Load
     * Balancing routes queries only to the healthy Amazon EC2 instances that are registered with the load balancer. If
     * you set <code>EvaluateTargetHealth</code> to <code>true</code> and either no EC2 instances are healthy or the
     * load balancer itself is unhealthy, Route 53 routes queries to other resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Application and Network Load Balancers</b>: If you specify an ELB Application or Network Load Balancer and you
     * set <code>EvaluateTargetHealth</code> to <code>true</code>, Route 53 routes queries to the load balancer based on
     * the health of the target groups that are associated with the load balancer:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an Application or Network Load Balancer to be considered healthy, every target group that contains targets
     * must contain at least one healthy target. If any target group contains only unhealthy targets, the load balancer
     * is considered unhealthy, and Route 53 routes queries to other resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * A target group that has no registered targets is considered unhealthy.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <note>
     * <p>
     * When you create a load balancer, you configure settings for Elastic Load Balancing health checks; they're not
     * Route 53 health checks, but they perform a similar function. Do not create Route 53 health checks for the EC2
     * instances that you register with an ELB load balancer.
     * </p>
     * </note></dd>
     * <dt>S3 buckets</dt>
     * <dd>
     * <p>
     * There are no special requirements for setting <code>EvaluateTargetHealth</code> to <code>true</code> when the
     * alias target is an S3 bucket.
     * </p>
     * </dd>
     * <dt>Other records in the same hosted zone</dt>
     * <dd>
     * <p>
     * If the AWS resource that you specify in <code>DNSName</code> is a record or a group of records (for example, a
     * group of weighted records) but is not another alias record, we recommend that you associate a health check with
     * all of the records in the alias target. For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html#dns-failover-complex-configs-hc-omitting"
     * >What Happens When You Omit Health Checks?</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * For more information and examples, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html">Amazon Route 53 Health Checks
     * and DNS Failover</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * 
     * @param evaluateTargetHealth
     *        <i>Applies only to alias, failover alias, geolocation alias, latency alias, and weighted alias resource
     *        record sets:</i> When <code>EvaluateTargetHealth</code> is <code>true</code>, an alias resource record set
     *        inherits the health of the referenced AWS resource, such as an ELB load balancer or another resource
     *        record set in the hosted zone.</p>
     *        <p>
     *        Note the following:
     *        </p>
     *        <dl>
     *        <dt>CloudFront distributions</dt>
     *        <dd>
     *        <p>
     *        You can't set <code>EvaluateTargetHealth</code> to <code>true</code> when the alias target is a CloudFront
     *        distribution.
     *        </p>
     *        </dd>
     *        <dt>Elastic Beanstalk environments that have regionalized subdomains</dt>
     *        <dd>
     *        <p>
     *        If you specify an Elastic Beanstalk environment in <code>DNSName</code> and the environment contains an
     *        ELB load balancer, Elastic Load Balancing routes queries only to the healthy Amazon EC2 instances that are
     *        registered with the load balancer. (An environment automatically contains an ELB load balancer if it
     *        includes more than one Amazon EC2 instance.) If you set <code>EvaluateTargetHealth</code> to
     *        <code>true</code> and either no Amazon EC2 instances are healthy or the load balancer itself is unhealthy,
     *        Route 53 routes queries to other available resources that are healthy, if any.
     *        </p>
     *        <p>
     *        If the environment contains a single Amazon EC2 instance, there are no special requirements.
     *        </p>
     *        </dd>
     *        <dt>ELB load balancers</dt>
     *        <dd>
     *        <p>
     *        Health checking behavior depends on the type of load balancer:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Classic Load Balancers</b>: If you specify an ELB Classic Load Balancer in <code>DNSName</code>,
     *        Elastic Load Balancing routes queries only to the healthy Amazon EC2 instances that are registered with
     *        the load balancer. If you set <code>EvaluateTargetHealth</code> to <code>true</code> and either no EC2
     *        instances are healthy or the load balancer itself is unhealthy, Route 53 routes queries to other
     *        resources.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Application and Network Load Balancers</b>: If you specify an ELB Application or Network Load Balancer
     *        and you set <code>EvaluateTargetHealth</code> to <code>true</code>, Route 53 routes queries to the load
     *        balancer based on the health of the target groups that are associated with the load balancer:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For an Application or Network Load Balancer to be considered healthy, every target group that contains
     *        targets must contain at least one healthy target. If any target group contains only unhealthy targets, the
     *        load balancer is considered unhealthy, and Route 53 routes queries to other resources.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A target group that has no registered targets is considered unhealthy.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        When you create a load balancer, you configure settings for Elastic Load Balancing health checks; they're
     *        not Route 53 health checks, but they perform a similar function. Do not create Route 53 health checks for
     *        the EC2 instances that you register with an ELB load balancer.
     *        </p>
     *        </note></dd>
     *        <dt>S3 buckets</dt>
     *        <dd>
     *        <p>
     *        There are no special requirements for setting <code>EvaluateTargetHealth</code> to <code>true</code> when
     *        the alias target is an S3 bucket.
     *        </p>
     *        </dd>
     *        <dt>Other records in the same hosted zone</dt>
     *        <dd>
     *        <p>
     *        If the AWS resource that you specify in <code>DNSName</code> is a record or a group of records (for
     *        example, a group of weighted records) but is not another alias record, we recommend that you associate a
     *        health check with all of the records in the alias target. For more information, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html#dns-failover-complex-configs-hc-omitting"
     *        >What Happens When You Omit Health Checks?</a> in the <i>Amazon Route 53 Developer Guide</i>.
     *        </p>
     *        </dd>
     *        </dl>
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
     * <i>Applies only to alias, failover alias, geolocation alias, latency alias, and weighted alias resource record
     * sets:</i> When <code>EvaluateTargetHealth</code> is <code>true</code>, an alias resource record set inherits the
     * health of the referenced AWS resource, such as an ELB load balancer or another resource record set in the hosted
     * zone.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <dl>
     * <dt>CloudFront distributions</dt>
     * <dd>
     * <p>
     * You can't set <code>EvaluateTargetHealth</code> to <code>true</code> when the alias target is a CloudFront
     * distribution.
     * </p>
     * </dd>
     * <dt>Elastic Beanstalk environments that have regionalized subdomains</dt>
     * <dd>
     * <p>
     * If you specify an Elastic Beanstalk environment in <code>DNSName</code> and the environment contains an ELB load
     * balancer, Elastic Load Balancing routes queries only to the healthy Amazon EC2 instances that are registered with
     * the load balancer. (An environment automatically contains an ELB load balancer if it includes more than one
     * Amazon EC2 instance.) If you set <code>EvaluateTargetHealth</code> to <code>true</code> and either no Amazon EC2
     * instances are healthy or the load balancer itself is unhealthy, Route 53 routes queries to other available
     * resources that are healthy, if any.
     * </p>
     * <p>
     * If the environment contains a single Amazon EC2 instance, there are no special requirements.
     * </p>
     * </dd>
     * <dt>ELB load balancers</dt>
     * <dd>
     * <p>
     * Health checking behavior depends on the type of load balancer:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Classic Load Balancers</b>: If you specify an ELB Classic Load Balancer in <code>DNSName</code>, Elastic Load
     * Balancing routes queries only to the healthy Amazon EC2 instances that are registered with the load balancer. If
     * you set <code>EvaluateTargetHealth</code> to <code>true</code> and either no EC2 instances are healthy or the
     * load balancer itself is unhealthy, Route 53 routes queries to other resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Application and Network Load Balancers</b>: If you specify an ELB Application or Network Load Balancer and you
     * set <code>EvaluateTargetHealth</code> to <code>true</code>, Route 53 routes queries to the load balancer based on
     * the health of the target groups that are associated with the load balancer:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an Application or Network Load Balancer to be considered healthy, every target group that contains targets
     * must contain at least one healthy target. If any target group contains only unhealthy targets, the load balancer
     * is considered unhealthy, and Route 53 routes queries to other resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * A target group that has no registered targets is considered unhealthy.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <note>
     * <p>
     * When you create a load balancer, you configure settings for Elastic Load Balancing health checks; they're not
     * Route 53 health checks, but they perform a similar function. Do not create Route 53 health checks for the EC2
     * instances that you register with an ELB load balancer.
     * </p>
     * </note></dd>
     * <dt>S3 buckets</dt>
     * <dd>
     * <p>
     * There are no special requirements for setting <code>EvaluateTargetHealth</code> to <code>true</code> when the
     * alias target is an S3 bucket.
     * </p>
     * </dd>
     * <dt>Other records in the same hosted zone</dt>
     * <dd>
     * <p>
     * If the AWS resource that you specify in <code>DNSName</code> is a record or a group of records (for example, a
     * group of weighted records) but is not another alias record, we recommend that you associate a health check with
     * all of the records in the alias target. For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html#dns-failover-complex-configs-hc-omitting"
     * >What Happens When You Omit Health Checks?</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * For more information and examples, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html">Amazon Route 53 Health Checks
     * and DNS Failover</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * 
     * @return <i>Applies only to alias, failover alias, geolocation alias, latency alias, and weighted alias resource
     *         record sets:</i> When <code>EvaluateTargetHealth</code> is <code>true</code>, an alias resource record
     *         set inherits the health of the referenced AWS resource, such as an ELB load balancer or another resource
     *         record set in the hosted zone.</p>
     *         <p>
     *         Note the following:
     *         </p>
     *         <dl>
     *         <dt>CloudFront distributions</dt>
     *         <dd>
     *         <p>
     *         You can't set <code>EvaluateTargetHealth</code> to <code>true</code> when the alias target is a
     *         CloudFront distribution.
     *         </p>
     *         </dd>
     *         <dt>Elastic Beanstalk environments that have regionalized subdomains</dt>
     *         <dd>
     *         <p>
     *         If you specify an Elastic Beanstalk environment in <code>DNSName</code> and the environment contains an
     *         ELB load balancer, Elastic Load Balancing routes queries only to the healthy Amazon EC2 instances that
     *         are registered with the load balancer. (An environment automatically contains an ELB load balancer if it
     *         includes more than one Amazon EC2 instance.) If you set <code>EvaluateTargetHealth</code> to
     *         <code>true</code> and either no Amazon EC2 instances are healthy or the load balancer itself is
     *         unhealthy, Route 53 routes queries to other available resources that are healthy, if any.
     *         </p>
     *         <p>
     *         If the environment contains a single Amazon EC2 instance, there are no special requirements.
     *         </p>
     *         </dd>
     *         <dt>ELB load balancers</dt>
     *         <dd>
     *         <p>
     *         Health checking behavior depends on the type of load balancer:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Classic Load Balancers</b>: If you specify an ELB Classic Load Balancer in <code>DNSName</code>,
     *         Elastic Load Balancing routes queries only to the healthy Amazon EC2 instances that are registered with
     *         the load balancer. If you set <code>EvaluateTargetHealth</code> to <code>true</code> and either no EC2
     *         instances are healthy or the load balancer itself is unhealthy, Route 53 routes queries to other
     *         resources.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Application and Network Load Balancers</b>: If you specify an ELB Application or Network Load Balancer
     *         and you set <code>EvaluateTargetHealth</code> to <code>true</code>, Route 53 routes queries to the load
     *         balancer based on the health of the target groups that are associated with the load balancer:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For an Application or Network Load Balancer to be considered healthy, every target group that contains
     *         targets must contain at least one healthy target. If any target group contains only unhealthy targets,
     *         the load balancer is considered unhealthy, and Route 53 routes queries to other resources.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A target group that has no registered targets is considered unhealthy.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         When you create a load balancer, you configure settings for Elastic Load Balancing health checks; they're
     *         not Route 53 health checks, but they perform a similar function. Do not create Route 53 health checks for
     *         the EC2 instances that you register with an ELB load balancer.
     *         </p>
     *         </note></dd>
     *         <dt>S3 buckets</dt>
     *         <dd>
     *         <p>
     *         There are no special requirements for setting <code>EvaluateTargetHealth</code> to <code>true</code> when
     *         the alias target is an S3 bucket.
     *         </p>
     *         </dd>
     *         <dt>Other records in the same hosted zone</dt>
     *         <dd>
     *         <p>
     *         If the AWS resource that you specify in <code>DNSName</code> is a record or a group of records (for
     *         example, a group of weighted records) but is not another alias record, we recommend that you associate a
     *         health check with all of the records in the alias target. For more information, see <a href=
     *         "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-complex-configs.html#dns-failover-complex-configs-hc-omitting"
     *         >What Happens When You Omit Health Checks?</a> in the <i>Amazon Route 53 Developer Guide</i>.
     *         </p>
     *         </dd>
     *         </dl>
     *         <p>
     *         For more information and examples, see <a
     *         href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html">Amazon Route 53 Health
     *         Checks and DNS Failover</a> in the <i>Amazon Route 53 Developer Guide</i>.
     */

    public Boolean isEvaluateTargetHealth() {
        return this.evaluateTargetHealth;
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
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: ").append(getHostedZoneId()).append(",");
        if (getDNSName() != null)
            sb.append("DNSName: ").append(getDNSName()).append(",");
        if (getEvaluateTargetHealth() != null)
            sb.append("EvaluateTargetHealth: ").append(getEvaluateTargetHealth());
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
