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
package com.amazonaws.services.route53;

import javax.annotation.Generated;

import com.amazonaws.services.route53.model.*;

/**
 * Interface for accessing Route 53 asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.route53.AbstractAmazonRoute53Async} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Route 53 is a highly available and scalable Domain Name System (DNS) web service.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonRoute53Async extends AmazonRoute53 {

    /**
     * <p>
     * Associates an Amazon VPC with a private hosted zone.
     * </p>
     * <important>
     * <p>
     * To perform the association, the VPC and the private hosted zone must already exist. You can't convert a public
     * hosted zone into a private hosted zone.
     * </p>
     * </important> <note>
     * <p>
     * If you want to associate a VPC that was created by using one AWS account with a private hosted zone that was
     * created by using a different account, the AWS account that created the private hosted zone must first submit a
     * <code>CreateVPCAssociationAuthorization</code> request. Then the account that created the VPC must submit an
     * <code>AssociateVPCWithHostedZone</code> request.
     * </p>
     * </note>
     * 
     * @param associateVPCWithHostedZoneRequest
     *        A complex type that contains information about the request to associate a VPC with a private hosted zone.
     * @return A Java Future containing the result of the AssociateVPCWithHostedZone operation returned by the service.
     * @sample AmazonRoute53Async.AssociateVPCWithHostedZone
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/AssociateVPCWithHostedZone"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateVPCWithHostedZoneResult> associateVPCWithHostedZoneAsync(
            AssociateVPCWithHostedZoneRequest associateVPCWithHostedZoneRequest);

    /**
     * <p>
     * Associates an Amazon VPC with a private hosted zone.
     * </p>
     * <important>
     * <p>
     * To perform the association, the VPC and the private hosted zone must already exist. You can't convert a public
     * hosted zone into a private hosted zone.
     * </p>
     * </important> <note>
     * <p>
     * If you want to associate a VPC that was created by using one AWS account with a private hosted zone that was
     * created by using a different account, the AWS account that created the private hosted zone must first submit a
     * <code>CreateVPCAssociationAuthorization</code> request. Then the account that created the VPC must submit an
     * <code>AssociateVPCWithHostedZone</code> request.
     * </p>
     * </note>
     * 
     * @param associateVPCWithHostedZoneRequest
     *        A complex type that contains information about the request to associate a VPC with a private hosted zone.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateVPCWithHostedZone operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.AssociateVPCWithHostedZone
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/AssociateVPCWithHostedZone"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateVPCWithHostedZoneResult> associateVPCWithHostedZoneAsync(
            AssociateVPCWithHostedZoneRequest associateVPCWithHostedZoneRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateVPCWithHostedZoneRequest, AssociateVPCWithHostedZoneResult> asyncHandler);

    /**
     * <p>
     * Creates, changes, or deletes a resource record set, which contains authoritative DNS information for a specified
     * domain name or subdomain name. For example, you can use <code>ChangeResourceRecordSets</code> to create a
     * resource record set that routes traffic for test.example.com to a web server that has an IP address of
     * 192.0.2.44.
     * </p>
     * <p>
     * <b>Change Batches and Transactional Changes</b>
     * </p>
     * <p>
     * The request body must include a document with a <code>ChangeResourceRecordSetsRequest</code> element. The request
     * body contains a list of change items, known as a change batch. Change batches are considered transactional
     * changes. When using the Amazon Route 53 API to change resource record sets, Route 53 either makes all or none of
     * the changes in a change batch request. This ensures that Route 53 never partially implements the intended changes
     * to the resource record sets in a hosted zone.
     * </p>
     * <p>
     * For example, a change batch request that deletes the <code>CNAME</code> record for www.example.com and creates an
     * alias resource record set for www.example.com. Route 53 deletes the first resource record set and creates the
     * second resource record set in a single operation. If either the <code>DELETE</code> or the <code>CREATE</code>
     * action fails, then both changes (plus any other changes in the batch) fail, and the original <code>CNAME</code>
     * record continues to exist.
     * </p>
     * <important>
     * <p>
     * Due to the nature of transactional changes, you can't delete the same resource record set more than once in a
     * single change batch. If you attempt to delete the same change batch more than once, Route 53 returns an
     * <code>InvalidChangeBatch</code> error.
     * </p>
     * </important>
     * <p>
     * <b>Traffic Flow</b>
     * </p>
     * <p>
     * To create resource record sets for complex routing configurations, use either the traffic flow visual editor in
     * the Route 53 console or the API actions for traffic policies and traffic policy instances. Save the configuration
     * as a traffic policy, then associate the traffic policy with one or more domain names (such as example.com) or
     * subdomain names (such as www.example.com), in the same hosted zone or in multiple hosted zones. You can roll back
     * the updates if the new configuration isn't performing as expected. For more information, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/traffic-flow.html">Using Traffic Flow to Route DNS
     * Traffic</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * <b>Create, Delete, and Upsert</b>
     * </p>
     * <p>
     * Use <code>ChangeResourceRecordsSetsRequest</code> to perform the following actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE</code>: Creates a resource record set that has the specified values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE</code>: Deletes an existing resource record set that has the specified values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPSERT</code>: If a resource record set does not already exist, AWS creates it. If a resource set does
     * exist, Route 53 updates it with the values in the request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Syntaxes for Creating, Updating, and Deleting Resource Record Sets</b>
     * </p>
     * <p>
     * The syntax for a request depends on the type of resource record set that you want to create, delete, or update,
     * such as weighted, alias, or failover. The XML elements in your request must appear in the order listed in the
     * syntax.
     * </p>
     * <p>
     * For an example for each type of resource record set, see "Examples."
     * </p>
     * <p>
     * Don't refer to the syntax in the "Parameter Syntax" section, which includes all of the elements for every kind of
     * resource record set that you can create, delete, or update by using <code>ChangeResourceRecordSets</code>.
     * </p>
     * <p>
     * <b>Change Propagation to Route 53 DNS Servers</b>
     * </p>
     * <p>
     * When you submit a <code>ChangeResourceRecordSets</code> request, Route 53 propagates your changes to all of the
     * Route 53 authoritative DNS servers. While your changes are propagating, <code>GetChange</code> returns a status
     * of <code>PENDING</code>. When propagation is complete, <code>GetChange</code> returns a status of
     * <code>INSYNC</code>. Changes generally propagate to all Route 53 name servers within 60 seconds. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetChange.html">GetChange</a>.
     * </p>
     * <p>
     * <b>Limits on ChangeResourceRecordSets Requests</b>
     * </p>
     * <p>
     * For information about the limits on a <code>ChangeResourceRecordSets</code> request, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DNSLimitations.html">Limits</a> in the <i>Amazon
     * Route 53 Developer Guide</i>.
     * </p>
     * 
     * @param changeResourceRecordSetsRequest
     *        A complex type that contains change information for the resource record set.
     * @return A Java Future containing the result of the ChangeResourceRecordSets operation returned by the service.
     * @sample AmazonRoute53Async.ChangeResourceRecordSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ChangeResourceRecordSets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ChangeResourceRecordSetsResult> changeResourceRecordSetsAsync(ChangeResourceRecordSetsRequest changeResourceRecordSetsRequest);

    /**
     * <p>
     * Creates, changes, or deletes a resource record set, which contains authoritative DNS information for a specified
     * domain name or subdomain name. For example, you can use <code>ChangeResourceRecordSets</code> to create a
     * resource record set that routes traffic for test.example.com to a web server that has an IP address of
     * 192.0.2.44.
     * </p>
     * <p>
     * <b>Change Batches and Transactional Changes</b>
     * </p>
     * <p>
     * The request body must include a document with a <code>ChangeResourceRecordSetsRequest</code> element. The request
     * body contains a list of change items, known as a change batch. Change batches are considered transactional
     * changes. When using the Amazon Route 53 API to change resource record sets, Route 53 either makes all or none of
     * the changes in a change batch request. This ensures that Route 53 never partially implements the intended changes
     * to the resource record sets in a hosted zone.
     * </p>
     * <p>
     * For example, a change batch request that deletes the <code>CNAME</code> record for www.example.com and creates an
     * alias resource record set for www.example.com. Route 53 deletes the first resource record set and creates the
     * second resource record set in a single operation. If either the <code>DELETE</code> or the <code>CREATE</code>
     * action fails, then both changes (plus any other changes in the batch) fail, and the original <code>CNAME</code>
     * record continues to exist.
     * </p>
     * <important>
     * <p>
     * Due to the nature of transactional changes, you can't delete the same resource record set more than once in a
     * single change batch. If you attempt to delete the same change batch more than once, Route 53 returns an
     * <code>InvalidChangeBatch</code> error.
     * </p>
     * </important>
     * <p>
     * <b>Traffic Flow</b>
     * </p>
     * <p>
     * To create resource record sets for complex routing configurations, use either the traffic flow visual editor in
     * the Route 53 console or the API actions for traffic policies and traffic policy instances. Save the configuration
     * as a traffic policy, then associate the traffic policy with one or more domain names (such as example.com) or
     * subdomain names (such as www.example.com), in the same hosted zone or in multiple hosted zones. You can roll back
     * the updates if the new configuration isn't performing as expected. For more information, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/traffic-flow.html">Using Traffic Flow to Route DNS
     * Traffic</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * <b>Create, Delete, and Upsert</b>
     * </p>
     * <p>
     * Use <code>ChangeResourceRecordsSetsRequest</code> to perform the following actions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATE</code>: Creates a resource record set that has the specified values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE</code>: Deletes an existing resource record set that has the specified values.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPSERT</code>: If a resource record set does not already exist, AWS creates it. If a resource set does
     * exist, Route 53 updates it with the values in the request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Syntaxes for Creating, Updating, and Deleting Resource Record Sets</b>
     * </p>
     * <p>
     * The syntax for a request depends on the type of resource record set that you want to create, delete, or update,
     * such as weighted, alias, or failover. The XML elements in your request must appear in the order listed in the
     * syntax.
     * </p>
     * <p>
     * For an example for each type of resource record set, see "Examples."
     * </p>
     * <p>
     * Don't refer to the syntax in the "Parameter Syntax" section, which includes all of the elements for every kind of
     * resource record set that you can create, delete, or update by using <code>ChangeResourceRecordSets</code>.
     * </p>
     * <p>
     * <b>Change Propagation to Route 53 DNS Servers</b>
     * </p>
     * <p>
     * When you submit a <code>ChangeResourceRecordSets</code> request, Route 53 propagates your changes to all of the
     * Route 53 authoritative DNS servers. While your changes are propagating, <code>GetChange</code> returns a status
     * of <code>PENDING</code>. When propagation is complete, <code>GetChange</code> returns a status of
     * <code>INSYNC</code>. Changes generally propagate to all Route 53 name servers within 60 seconds. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetChange.html">GetChange</a>.
     * </p>
     * <p>
     * <b>Limits on ChangeResourceRecordSets Requests</b>
     * </p>
     * <p>
     * For information about the limits on a <code>ChangeResourceRecordSets</code> request, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DNSLimitations.html">Limits</a> in the <i>Amazon
     * Route 53 Developer Guide</i>.
     * </p>
     * 
     * @param changeResourceRecordSetsRequest
     *        A complex type that contains change information for the resource record set.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ChangeResourceRecordSets operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.ChangeResourceRecordSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ChangeResourceRecordSets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ChangeResourceRecordSetsResult> changeResourceRecordSetsAsync(ChangeResourceRecordSetsRequest changeResourceRecordSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ChangeResourceRecordSetsRequest, ChangeResourceRecordSetsResult> asyncHandler);

    /**
     * <p>
     * Adds, edits, or deletes tags for a health check or a hosted zone.
     * </p>
     * <p>
     * For information about using tags for cost allocation, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Using Cost Allocation
     * Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param changeTagsForResourceRequest
     *        A complex type that contains information about the tags that you want to add, edit, or delete.
     * @return A Java Future containing the result of the ChangeTagsForResource operation returned by the service.
     * @sample AmazonRoute53Async.ChangeTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ChangeTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ChangeTagsForResourceResult> changeTagsForResourceAsync(ChangeTagsForResourceRequest changeTagsForResourceRequest);

    /**
     * <p>
     * Adds, edits, or deletes tags for a health check or a hosted zone.
     * </p>
     * <p>
     * For information about using tags for cost allocation, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Using Cost Allocation
     * Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param changeTagsForResourceRequest
     *        A complex type that contains information about the tags that you want to add, edit, or delete.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ChangeTagsForResource operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.ChangeTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ChangeTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ChangeTagsForResourceResult> changeTagsForResourceAsync(ChangeTagsForResourceRequest changeTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ChangeTagsForResourceRequest, ChangeTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Creates a new health check.
     * </p>
     * <p>
     * For information about adding health checks to resource record sets, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_ResourceRecordSet.html#Route53-Type-ResourceRecordSet-HealthCheckId"
     * >HealthCheckId</a> in <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_ChangeResourceRecordSets.html"
     * >ChangeResourceRecordSets</a>.
     * </p>
     * <p>
     * <b>ELB Load Balancers</b>
     * </p>
     * <p>
     * If you're registering EC2 instances with an Elastic Load Balancing (ELB) load balancer, do not create Amazon
     * Route 53 health checks for the EC2 instances. When you register an EC2 instance with a load balancer, you
     * configure settings for an ELB health check, which performs a similar function to a Route 53 health check.
     * </p>
     * <p>
     * <b>Private Hosted Zones</b>
     * </p>
     * <p>
     * You can associate health checks with failover resource record sets in a private hosted zone. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Route 53 health checkers are outside the VPC. To check the health of an endpoint within a VPC by IP address, you
     * must assign a public IP address to the instance in the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can configure a health checker to check the health of an external resource that the instance relies on, such
     * as a database server.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can create a CloudWatch metric, associate an alarm with the metric, and then create a health check that is
     * based on the state of the alarm. For example, you might create a CloudWatch metric that checks the status of the
     * Amazon EC2 <code>StatusCheckFailed</code> metric, add an alarm to the metric, and then create a health check that
     * is based on the state of the alarm. For information about creating CloudWatch metrics and alarms by using the
     * CloudWatch console, see the <a
     * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/WhatIsCloudWatch.html">Amazon CloudWatch
     * User Guide</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createHealthCheckRequest
     *        A complex type that contains the health check request information.
     * @return A Java Future containing the result of the CreateHealthCheck operation returned by the service.
     * @sample AmazonRoute53Async.CreateHealthCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CreateHealthCheck" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateHealthCheckResult> createHealthCheckAsync(CreateHealthCheckRequest createHealthCheckRequest);

    /**
     * <p>
     * Creates a new health check.
     * </p>
     * <p>
     * For information about adding health checks to resource record sets, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_ResourceRecordSet.html#Route53-Type-ResourceRecordSet-HealthCheckId"
     * >HealthCheckId</a> in <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_ChangeResourceRecordSets.html"
     * >ChangeResourceRecordSets</a>.
     * </p>
     * <p>
     * <b>ELB Load Balancers</b>
     * </p>
     * <p>
     * If you're registering EC2 instances with an Elastic Load Balancing (ELB) load balancer, do not create Amazon
     * Route 53 health checks for the EC2 instances. When you register an EC2 instance with a load balancer, you
     * configure settings for an ELB health check, which performs a similar function to a Route 53 health check.
     * </p>
     * <p>
     * <b>Private Hosted Zones</b>
     * </p>
     * <p>
     * You can associate health checks with failover resource record sets in a private hosted zone. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Route 53 health checkers are outside the VPC. To check the health of an endpoint within a VPC by IP address, you
     * must assign a public IP address to the instance in the VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can configure a health checker to check the health of an external resource that the instance relies on, such
     * as a database server.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can create a CloudWatch metric, associate an alarm with the metric, and then create a health check that is
     * based on the state of the alarm. For example, you might create a CloudWatch metric that checks the status of the
     * Amazon EC2 <code>StatusCheckFailed</code> metric, add an alarm to the metric, and then create a health check that
     * is based on the state of the alarm. For information about creating CloudWatch metrics and alarms by using the
     * CloudWatch console, see the <a
     * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/WhatIsCloudWatch.html">Amazon CloudWatch
     * User Guide</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createHealthCheckRequest
     *        A complex type that contains the health check request information.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateHealthCheck operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.CreateHealthCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CreateHealthCheck" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateHealthCheckResult> createHealthCheckAsync(CreateHealthCheckRequest createHealthCheckRequest,
            com.amazonaws.handlers.AsyncHandler<CreateHealthCheckRequest, CreateHealthCheckResult> asyncHandler);

    /**
     * <p>
     * Creates a new public or private hosted zone. You create records in a public hosted zone to define how you want to
     * route traffic on the internet for a domain, such as example.com, and its subdomains (apex.example.com,
     * acme.example.com). You create records in a private hosted zone to define how you want to route traffic for a
     * domain and its subdomains within one or more Amazon Virtual Private Clouds (Amazon VPCs).
     * </p>
     * <important>
     * <p>
     * You can't convert a public hosted zone to a private hosted zone or vice versa. Instead, you must create a new
     * hosted zone with the same name and create new resource record sets.
     * </p>
     * </important>
     * <p>
     * For more information about charges for hosted zones, see <a href="http://aws.amazon.com/route53/pricing/">Amazon
     * Route 53 Pricing</a>.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't create a hosted zone for a top-level domain (TLD) such as .com.
     * </p>
     * </li>
     * <li>
     * <p>
     * For public hosted zones, Amazon Route 53 automatically creates a default SOA record and four NS records for the
     * zone. For more information about SOA and NS records, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/SOA-NSrecords.html">NS and SOA Records that Route
     * 53 Creates for a Hosted Zone</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * If you want to use the same name servers for multiple public hosted zones, you can optionally associate a
     * reusable delegation set with the hosted zone. See the <code>DelegationSetId</code> element.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your domain is registered with a registrar other than Route 53, you must update the name servers with your
     * registrar to make Route 53 the DNS service for the domain. For more information, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/MigratingDNS.html">Migrating DNS Service for an
     * Existing Domain to Amazon Route 53</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you submit a <code>CreateHostedZone</code> request, the initial status of the hosted zone is
     * <code>PENDING</code>. For public hosted zones, this means that the NS and SOA records are not yet available on
     * all Route 53 DNS servers. When the NS and SOA records are available, the status of the zone changes to
     * <code>INSYNC</code>.
     * </p>
     * 
     * @param createHostedZoneRequest
     *        A complex type that contains information about the request to create a public or private hosted zone.
     * @return A Java Future containing the result of the CreateHostedZone operation returned by the service.
     * @sample AmazonRoute53Async.CreateHostedZone
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CreateHostedZone" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateHostedZoneResult> createHostedZoneAsync(CreateHostedZoneRequest createHostedZoneRequest);

    /**
     * <p>
     * Creates a new public or private hosted zone. You create records in a public hosted zone to define how you want to
     * route traffic on the internet for a domain, such as example.com, and its subdomains (apex.example.com,
     * acme.example.com). You create records in a private hosted zone to define how you want to route traffic for a
     * domain and its subdomains within one or more Amazon Virtual Private Clouds (Amazon VPCs).
     * </p>
     * <important>
     * <p>
     * You can't convert a public hosted zone to a private hosted zone or vice versa. Instead, you must create a new
     * hosted zone with the same name and create new resource record sets.
     * </p>
     * </important>
     * <p>
     * For more information about charges for hosted zones, see <a href="http://aws.amazon.com/route53/pricing/">Amazon
     * Route 53 Pricing</a>.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't create a hosted zone for a top-level domain (TLD) such as .com.
     * </p>
     * </li>
     * <li>
     * <p>
     * For public hosted zones, Amazon Route 53 automatically creates a default SOA record and four NS records for the
     * zone. For more information about SOA and NS records, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/SOA-NSrecords.html">NS and SOA Records that Route
     * 53 Creates for a Hosted Zone</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * If you want to use the same name servers for multiple public hosted zones, you can optionally associate a
     * reusable delegation set with the hosted zone. See the <code>DelegationSetId</code> element.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your domain is registered with a registrar other than Route 53, you must update the name servers with your
     * registrar to make Route 53 the DNS service for the domain. For more information, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/MigratingDNS.html">Migrating DNS Service for an
     * Existing Domain to Amazon Route 53</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you submit a <code>CreateHostedZone</code> request, the initial status of the hosted zone is
     * <code>PENDING</code>. For public hosted zones, this means that the NS and SOA records are not yet available on
     * all Route 53 DNS servers. When the NS and SOA records are available, the status of the zone changes to
     * <code>INSYNC</code>.
     * </p>
     * 
     * @param createHostedZoneRequest
     *        A complex type that contains information about the request to create a public or private hosted zone.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateHostedZone operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.CreateHostedZone
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CreateHostedZone" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateHostedZoneResult> createHostedZoneAsync(CreateHostedZoneRequest createHostedZoneRequest,
            com.amazonaws.handlers.AsyncHandler<CreateHostedZoneRequest, CreateHostedZoneResult> asyncHandler);

    /**
     * <p>
     * Creates a configuration for DNS query logging. After you create a query logging configuration, Amazon Route 53
     * begins to publish log data to an Amazon CloudWatch Logs log group.
     * </p>
     * <p>
     * DNS query logs contain information about the queries that Route 53 receives for a specified public hosted zone,
     * such as the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Route 53 edge location that responded to the DNS query
     * </p>
     * </li>
     * <li>
     * <p>
     * Domain or subdomain that was requested
     * </p>
     * </li>
     * <li>
     * <p>
     * DNS record type, such as A or AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * DNS response code, such as <code>NoError</code> or <code>ServFail</code>
     * </p>
     * </li>
     * </ul>
     * <dl>
     * <dt>Log Group and Resource Policy</dt>
     * <dd>
     * <p>
     * Before you create a query logging configuration, perform the following operations.
     * </p>
     * <note>
     * <p>
     * If you create a query logging configuration using the Route 53 console, Route 53 performs these operations
     * automatically.
     * </p>
     * </note>
     * <ol>
     * <li>
     * <p>
     * Create a CloudWatch Logs log group, and make note of the ARN, which you specify when you create a query logging
     * configuration. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You must create the log group in the us-east-1 region.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must use the same AWS account to create the log group and the hosted zone that you want to configure query
     * logging for.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you create log groups for query logging, we recommend that you use a consistent prefix, for example:
     * </p>
     * <p>
     * <code>/aws/route53/<i>hosted zone name</i> </code>
     * </p>
     * <p>
     * In the next step, you'll create a resource policy, which controls access to one or more log groups and the
     * associated AWS resources, such as Route 53 hosted zones. There's a limit on the number of resource policies that
     * you can create, so we recommend that you use a consistent prefix so you can use the same resource policy for all
     * the log groups that you create for query logging.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Create a CloudWatch Logs resource policy, and give it the permissions that Route 53 needs to create log streams
     * and to send query logs to log streams. For the value of <code>Resource</code>, specify the ARN for the log group
     * that you created in the previous step. To use the same resource policy for all the CloudWatch Logs log groups
     * that you created for query logging configurations, replace the hosted zone name with <code>*</code>, for example:
     * </p>
     * <p>
     * <code>arn:aws:logs:us-east-1:123412341234:log-group:/aws/route53/*</code>
     * </p>
     * <note>
     * <p>
     * You can't use the CloudWatch console to create or edit a resource policy. You must use the CloudWatch API, one of
     * the AWS SDKs, or the AWS CLI.
     * </p>
     * </note></li>
     * </ol>
     * </dd>
     * <dt>Log Streams and Edge Locations</dt>
     * <dd>
     * <p>
     * When Route 53 finishes creating the configuration for DNS query logging, it does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a log stream for an edge location the first time that the edge location responds to DNS queries for the
     * specified hosted zone. That log stream is used to log all queries that Route 53 responds to for that edge
     * location.
     * </p>
     * </li>
     * <li>
     * <p>
     * Begins to send query logs to the applicable log stream.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The name of each log stream is in the following format:
     * </p>
     * <p>
     * <code> <i>hosted zone ID</i>/<i>edge location code</i> </code>
     * </p>
     * <p>
     * The edge location code is a three-letter code and an arbitrarily assigned number, for example, DFW3. The
     * three-letter code typically corresponds with the International Air Transport Association airport code for an
     * airport near the edge location. (These abbreviations might change in the future.) For a list of edge locations,
     * see "The Route 53 Global Network" on the <a href="http://aws.amazon.com/route53/details/">Route 53 Product
     * Details</a> page.
     * </p>
     * </dd>
     * <dt>Queries That Are Logged</dt>
     * <dd>
     * <p>
     * Query logs contain only the queries that DNS resolvers forward to Route 53. If a DNS resolver has already cached
     * the response to a query (such as the IP address for a load balancer for example.com), the resolver will continue
     * to return the cached response. It doesn't forward another query to Route 53 until the TTL for the corresponding
     * resource record set expires. Depending on how many DNS queries are submitted for a resource record set, and
     * depending on the TTL for that resource record set, query logs might contain information about only one query out
     * of every several thousand queries that are submitted to DNS. For more information about how DNS works, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/welcome-dns-service.html">Routing Internet
     * Traffic to Your Website or Web Application</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </dd>
     * <dt>Log File Format</dt>
     * <dd>
     * <p>
     * For a list of the values in each query log and the format of each value, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/query-logs.html">Logging DNS Queries</a> in the
     * <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </dd>
     * <dt>Pricing</dt>
     * <dd>
     * <p>
     * For information about charges for query logs, see <a href="http://aws.amazon.com/cloudwatch/pricing/">Amazon
     * CloudWatch Pricing</a>.
     * </p>
     * </dd>
     * <dt>How to Stop Logging</dt>
     * <dd>
     * <p>
     * If you want Route 53 to stop sending query logs to CloudWatch Logs, delete the query logging configuration. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteQueryLoggingConfig.html"
     * >DeleteQueryLoggingConfig</a>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param createQueryLoggingConfigRequest
     * @return A Java Future containing the result of the CreateQueryLoggingConfig operation returned by the service.
     * @sample AmazonRoute53Async.CreateQueryLoggingConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CreateQueryLoggingConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateQueryLoggingConfigResult> createQueryLoggingConfigAsync(CreateQueryLoggingConfigRequest createQueryLoggingConfigRequest);

    /**
     * <p>
     * Creates a configuration for DNS query logging. After you create a query logging configuration, Amazon Route 53
     * begins to publish log data to an Amazon CloudWatch Logs log group.
     * </p>
     * <p>
     * DNS query logs contain information about the queries that Route 53 receives for a specified public hosted zone,
     * such as the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Route 53 edge location that responded to the DNS query
     * </p>
     * </li>
     * <li>
     * <p>
     * Domain or subdomain that was requested
     * </p>
     * </li>
     * <li>
     * <p>
     * DNS record type, such as A or AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * DNS response code, such as <code>NoError</code> or <code>ServFail</code>
     * </p>
     * </li>
     * </ul>
     * <dl>
     * <dt>Log Group and Resource Policy</dt>
     * <dd>
     * <p>
     * Before you create a query logging configuration, perform the following operations.
     * </p>
     * <note>
     * <p>
     * If you create a query logging configuration using the Route 53 console, Route 53 performs these operations
     * automatically.
     * </p>
     * </note>
     * <ol>
     * <li>
     * <p>
     * Create a CloudWatch Logs log group, and make note of the ARN, which you specify when you create a query logging
     * configuration. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You must create the log group in the us-east-1 region.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must use the same AWS account to create the log group and the hosted zone that you want to configure query
     * logging for.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you create log groups for query logging, we recommend that you use a consistent prefix, for example:
     * </p>
     * <p>
     * <code>/aws/route53/<i>hosted zone name</i> </code>
     * </p>
     * <p>
     * In the next step, you'll create a resource policy, which controls access to one or more log groups and the
     * associated AWS resources, such as Route 53 hosted zones. There's a limit on the number of resource policies that
     * you can create, so we recommend that you use a consistent prefix so you can use the same resource policy for all
     * the log groups that you create for query logging.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Create a CloudWatch Logs resource policy, and give it the permissions that Route 53 needs to create log streams
     * and to send query logs to log streams. For the value of <code>Resource</code>, specify the ARN for the log group
     * that you created in the previous step. To use the same resource policy for all the CloudWatch Logs log groups
     * that you created for query logging configurations, replace the hosted zone name with <code>*</code>, for example:
     * </p>
     * <p>
     * <code>arn:aws:logs:us-east-1:123412341234:log-group:/aws/route53/*</code>
     * </p>
     * <note>
     * <p>
     * You can't use the CloudWatch console to create or edit a resource policy. You must use the CloudWatch API, one of
     * the AWS SDKs, or the AWS CLI.
     * </p>
     * </note></li>
     * </ol>
     * </dd>
     * <dt>Log Streams and Edge Locations</dt>
     * <dd>
     * <p>
     * When Route 53 finishes creating the configuration for DNS query logging, it does the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a log stream for an edge location the first time that the edge location responds to DNS queries for the
     * specified hosted zone. That log stream is used to log all queries that Route 53 responds to for that edge
     * location.
     * </p>
     * </li>
     * <li>
     * <p>
     * Begins to send query logs to the applicable log stream.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The name of each log stream is in the following format:
     * </p>
     * <p>
     * <code> <i>hosted zone ID</i>/<i>edge location code</i> </code>
     * </p>
     * <p>
     * The edge location code is a three-letter code and an arbitrarily assigned number, for example, DFW3. The
     * three-letter code typically corresponds with the International Air Transport Association airport code for an
     * airport near the edge location. (These abbreviations might change in the future.) For a list of edge locations,
     * see "The Route 53 Global Network" on the <a href="http://aws.amazon.com/route53/details/">Route 53 Product
     * Details</a> page.
     * </p>
     * </dd>
     * <dt>Queries That Are Logged</dt>
     * <dd>
     * <p>
     * Query logs contain only the queries that DNS resolvers forward to Route 53. If a DNS resolver has already cached
     * the response to a query (such as the IP address for a load balancer for example.com), the resolver will continue
     * to return the cached response. It doesn't forward another query to Route 53 until the TTL for the corresponding
     * resource record set expires. Depending on how many DNS queries are submitted for a resource record set, and
     * depending on the TTL for that resource record set, query logs might contain information about only one query out
     * of every several thousand queries that are submitted to DNS. For more information about how DNS works, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/welcome-dns-service.html">Routing Internet
     * Traffic to Your Website or Web Application</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </dd>
     * <dt>Log File Format</dt>
     * <dd>
     * <p>
     * For a list of the values in each query log and the format of each value, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/query-logs.html">Logging DNS Queries</a> in the
     * <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </dd>
     * <dt>Pricing</dt>
     * <dd>
     * <p>
     * For information about charges for query logs, see <a href="http://aws.amazon.com/cloudwatch/pricing/">Amazon
     * CloudWatch Pricing</a>.
     * </p>
     * </dd>
     * <dt>How to Stop Logging</dt>
     * <dd>
     * <p>
     * If you want Route 53 to stop sending query logs to CloudWatch Logs, delete the query logging configuration. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_DeleteQueryLoggingConfig.html"
     * >DeleteQueryLoggingConfig</a>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param createQueryLoggingConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateQueryLoggingConfig operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.CreateQueryLoggingConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CreateQueryLoggingConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateQueryLoggingConfigResult> createQueryLoggingConfigAsync(CreateQueryLoggingConfigRequest createQueryLoggingConfigRequest,
            com.amazonaws.handlers.AsyncHandler<CreateQueryLoggingConfigRequest, CreateQueryLoggingConfigResult> asyncHandler);

    /**
     * <p>
     * Creates a delegation set (a group of four name servers) that can be reused by multiple hosted zones. If a hosted
     * zoned ID is specified, <code>CreateReusableDelegationSet</code> marks the delegation set associated with that
     * zone as reusable.
     * </p>
     * <note>
     * <p>
     * You can't associate a reusable delegation set with a private hosted zone.
     * </p>
     * </note>
     * <p>
     * For information about using a reusable delegation set to configure white label name servers, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/white-label-name-servers.html">Configuring White
     * Label Name Servers</a>.
     * </p>
     * <p>
     * The process for migrating existing hosted zones to use a reusable delegation set is comparable to the process for
     * configuring white label name servers. You need to perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create a reusable delegation set.
     * </p>
     * </li>
     * <li>
     * <p>
     * Recreate hosted zones, and reduce the TTL to 60 seconds or less.
     * </p>
     * </li>
     * <li>
     * <p>
     * Recreate resource record sets in the new hosted zones.
     * </p>
     * </li>
     * <li>
     * <p>
     * Change the registrar's name servers to use the name servers for the new hosted zones.
     * </p>
     * </li>
     * <li>
     * <p>
     * Monitor traffic for the website or application.
     * </p>
     * </li>
     * <li>
     * <p>
     * Change TTLs back to their original values.
     * </p>
     * </li>
     * </ol>
     * <p>
     * If you want to migrate existing hosted zones to use a reusable delegation set, the existing hosted zones can't
     * use any of the name servers that are assigned to the reusable delegation set. If one or more hosted zones do use
     * one or more name servers that are assigned to the reusable delegation set, you can do one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For small numbers of hosted zones—up to a few hundred—it's relatively easy to create reusable delegation sets
     * until you get one that has four name servers that don't overlap with any of the name servers in your hosted
     * zones.
     * </p>
     * </li>
     * <li>
     * <p>
     * For larger numbers of hosted zones, the easiest solution is to use more than one reusable delegation set.
     * </p>
     * </li>
     * <li>
     * <p>
     * For larger numbers of hosted zones, you can also migrate hosted zones that have overlapping name servers to
     * hosted zones that don't have overlapping name servers, then migrate the hosted zones again to use the reusable
     * delegation set.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createReusableDelegationSetRequest
     * @return A Java Future containing the result of the CreateReusableDelegationSet operation returned by the service.
     * @sample AmazonRoute53Async.CreateReusableDelegationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CreateReusableDelegationSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateReusableDelegationSetResult> createReusableDelegationSetAsync(
            CreateReusableDelegationSetRequest createReusableDelegationSetRequest);

    /**
     * <p>
     * Creates a delegation set (a group of four name servers) that can be reused by multiple hosted zones. If a hosted
     * zoned ID is specified, <code>CreateReusableDelegationSet</code> marks the delegation set associated with that
     * zone as reusable.
     * </p>
     * <note>
     * <p>
     * You can't associate a reusable delegation set with a private hosted zone.
     * </p>
     * </note>
     * <p>
     * For information about using a reusable delegation set to configure white label name servers, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/white-label-name-servers.html">Configuring White
     * Label Name Servers</a>.
     * </p>
     * <p>
     * The process for migrating existing hosted zones to use a reusable delegation set is comparable to the process for
     * configuring white label name servers. You need to perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create a reusable delegation set.
     * </p>
     * </li>
     * <li>
     * <p>
     * Recreate hosted zones, and reduce the TTL to 60 seconds or less.
     * </p>
     * </li>
     * <li>
     * <p>
     * Recreate resource record sets in the new hosted zones.
     * </p>
     * </li>
     * <li>
     * <p>
     * Change the registrar's name servers to use the name servers for the new hosted zones.
     * </p>
     * </li>
     * <li>
     * <p>
     * Monitor traffic for the website or application.
     * </p>
     * </li>
     * <li>
     * <p>
     * Change TTLs back to their original values.
     * </p>
     * </li>
     * </ol>
     * <p>
     * If you want to migrate existing hosted zones to use a reusable delegation set, the existing hosted zones can't
     * use any of the name servers that are assigned to the reusable delegation set. If one or more hosted zones do use
     * one or more name servers that are assigned to the reusable delegation set, you can do one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For small numbers of hosted zones—up to a few hundred—it's relatively easy to create reusable delegation sets
     * until you get one that has four name servers that don't overlap with any of the name servers in your hosted
     * zones.
     * </p>
     * </li>
     * <li>
     * <p>
     * For larger numbers of hosted zones, the easiest solution is to use more than one reusable delegation set.
     * </p>
     * </li>
     * <li>
     * <p>
     * For larger numbers of hosted zones, you can also migrate hosted zones that have overlapping name servers to
     * hosted zones that don't have overlapping name servers, then migrate the hosted zones again to use the reusable
     * delegation set.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createReusableDelegationSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateReusableDelegationSet operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.CreateReusableDelegationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CreateReusableDelegationSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateReusableDelegationSetResult> createReusableDelegationSetAsync(
            CreateReusableDelegationSetRequest createReusableDelegationSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateReusableDelegationSetRequest, CreateReusableDelegationSetResult> asyncHandler);

    /**
     * <p>
     * Creates a traffic policy, which you use to create multiple DNS resource record sets for one domain name (such as
     * example.com) or one subdomain name (such as www.example.com).
     * </p>
     * 
     * @param createTrafficPolicyRequest
     *        A complex type that contains information about the traffic policy that you want to create.
     * @return A Java Future containing the result of the CreateTrafficPolicy operation returned by the service.
     * @sample AmazonRoute53Async.CreateTrafficPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CreateTrafficPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateTrafficPolicyResult> createTrafficPolicyAsync(CreateTrafficPolicyRequest createTrafficPolicyRequest);

    /**
     * <p>
     * Creates a traffic policy, which you use to create multiple DNS resource record sets for one domain name (such as
     * example.com) or one subdomain name (such as www.example.com).
     * </p>
     * 
     * @param createTrafficPolicyRequest
     *        A complex type that contains information about the traffic policy that you want to create.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTrafficPolicy operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.CreateTrafficPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CreateTrafficPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateTrafficPolicyResult> createTrafficPolicyAsync(CreateTrafficPolicyRequest createTrafficPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTrafficPolicyRequest, CreateTrafficPolicyResult> asyncHandler);

    /**
     * <p>
     * Creates resource record sets in a specified hosted zone based on the settings in a specified traffic policy
     * version. In addition, <code>CreateTrafficPolicyInstance</code> associates the resource record sets with a
     * specified domain name (such as example.com) or subdomain name (such as www.example.com). Amazon Route 53 responds
     * to DNS queries for the domain or subdomain name by using the resource record sets that
     * <code>CreateTrafficPolicyInstance</code> created.
     * </p>
     * 
     * @param createTrafficPolicyInstanceRequest
     *        A complex type that contains information about the resource record sets that you want to create based on a
     *        specified traffic policy.
     * @return A Java Future containing the result of the CreateTrafficPolicyInstance operation returned by the service.
     * @sample AmazonRoute53Async.CreateTrafficPolicyInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CreateTrafficPolicyInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTrafficPolicyInstanceResult> createTrafficPolicyInstanceAsync(
            CreateTrafficPolicyInstanceRequest createTrafficPolicyInstanceRequest);

    /**
     * <p>
     * Creates resource record sets in a specified hosted zone based on the settings in a specified traffic policy
     * version. In addition, <code>CreateTrafficPolicyInstance</code> associates the resource record sets with a
     * specified domain name (such as example.com) or subdomain name (such as www.example.com). Amazon Route 53 responds
     * to DNS queries for the domain or subdomain name by using the resource record sets that
     * <code>CreateTrafficPolicyInstance</code> created.
     * </p>
     * 
     * @param createTrafficPolicyInstanceRequest
     *        A complex type that contains information about the resource record sets that you want to create based on a
     *        specified traffic policy.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTrafficPolicyInstance operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.CreateTrafficPolicyInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CreateTrafficPolicyInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTrafficPolicyInstanceResult> createTrafficPolicyInstanceAsync(
            CreateTrafficPolicyInstanceRequest createTrafficPolicyInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTrafficPolicyInstanceRequest, CreateTrafficPolicyInstanceResult> asyncHandler);

    /**
     * <p>
     * Creates a new version of an existing traffic policy. When you create a new version of a traffic policy, you
     * specify the ID of the traffic policy that you want to update and a JSON-formatted document that describes the new
     * version. You use traffic policies to create multiple DNS resource record sets for one domain name (such as
     * example.com) or one subdomain name (such as www.example.com). You can create a maximum of 1000 versions of a
     * traffic policy. If you reach the limit and need to create another version, you'll need to start a new traffic
     * policy.
     * </p>
     * 
     * @param createTrafficPolicyVersionRequest
     *        A complex type that contains information about the traffic policy that you want to create a new version
     *        for.
     * @return A Java Future containing the result of the CreateTrafficPolicyVersion operation returned by the service.
     * @sample AmazonRoute53Async.CreateTrafficPolicyVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CreateTrafficPolicyVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTrafficPolicyVersionResult> createTrafficPolicyVersionAsync(
            CreateTrafficPolicyVersionRequest createTrafficPolicyVersionRequest);

    /**
     * <p>
     * Creates a new version of an existing traffic policy. When you create a new version of a traffic policy, you
     * specify the ID of the traffic policy that you want to update and a JSON-formatted document that describes the new
     * version. You use traffic policies to create multiple DNS resource record sets for one domain name (such as
     * example.com) or one subdomain name (such as www.example.com). You can create a maximum of 1000 versions of a
     * traffic policy. If you reach the limit and need to create another version, you'll need to start a new traffic
     * policy.
     * </p>
     * 
     * @param createTrafficPolicyVersionRequest
     *        A complex type that contains information about the traffic policy that you want to create a new version
     *        for.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTrafficPolicyVersion operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.CreateTrafficPolicyVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CreateTrafficPolicyVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateTrafficPolicyVersionResult> createTrafficPolicyVersionAsync(
            CreateTrafficPolicyVersionRequest createTrafficPolicyVersionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTrafficPolicyVersionRequest, CreateTrafficPolicyVersionResult> asyncHandler);

    /**
     * <p>
     * Authorizes the AWS account that created a specified VPC to submit an <code>AssociateVPCWithHostedZone</code>
     * request to associate the VPC with a specified hosted zone that was created by a different account. To submit a
     * <code>CreateVPCAssociationAuthorization</code> request, you must use the account that created the hosted zone.
     * After you authorize the association, use the account that created the VPC to submit an
     * <code>AssociateVPCWithHostedZone</code> request.
     * </p>
     * <note>
     * <p>
     * If you want to associate multiple VPCs that you created by using one account with a hosted zone that you created
     * by using a different account, you must submit one authorization request for each VPC.
     * </p>
     * </note>
     * 
     * @param createVPCAssociationAuthorizationRequest
     *        A complex type that contains information about the request to authorize associating a VPC with your
     *        private hosted zone. Authorization is only required when a private hosted zone and a VPC were created by
     *        using different accounts.
     * @return A Java Future containing the result of the CreateVPCAssociationAuthorization operation returned by the
     *         service.
     * @sample AmazonRoute53Async.CreateVPCAssociationAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CreateVPCAssociationAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateVPCAssociationAuthorizationResult> createVPCAssociationAuthorizationAsync(
            CreateVPCAssociationAuthorizationRequest createVPCAssociationAuthorizationRequest);

    /**
     * <p>
     * Authorizes the AWS account that created a specified VPC to submit an <code>AssociateVPCWithHostedZone</code>
     * request to associate the VPC with a specified hosted zone that was created by a different account. To submit a
     * <code>CreateVPCAssociationAuthorization</code> request, you must use the account that created the hosted zone.
     * After you authorize the association, use the account that created the VPC to submit an
     * <code>AssociateVPCWithHostedZone</code> request.
     * </p>
     * <note>
     * <p>
     * If you want to associate multiple VPCs that you created by using one account with a hosted zone that you created
     * by using a different account, you must submit one authorization request for each VPC.
     * </p>
     * </note>
     * 
     * @param createVPCAssociationAuthorizationRequest
     *        A complex type that contains information about the request to authorize associating a VPC with your
     *        private hosted zone. Authorization is only required when a private hosted zone and a VPC were created by
     *        using different accounts.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVPCAssociationAuthorization operation returned by the
     *         service.
     * @sample AmazonRoute53AsyncHandler.CreateVPCAssociationAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CreateVPCAssociationAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateVPCAssociationAuthorizationResult> createVPCAssociationAuthorizationAsync(
            CreateVPCAssociationAuthorizationRequest createVPCAssociationAuthorizationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVPCAssociationAuthorizationRequest, CreateVPCAssociationAuthorizationResult> asyncHandler);

    /**
     * <p>
     * Deletes a health check.
     * </p>
     * <important>
     * <p>
     * Amazon Route 53 does not prevent you from deleting a health check even if the health check is associated with one
     * or more resource record sets. If you delete a health check and you don't update the associated resource record
     * sets, the future status of the health check can't be predicted and may change. This will affect the routing of
     * DNS queries for your DNS failover configuration. For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/health-checks-creating-deleting.html#health-checks-deleting.html"
     * >Replacing and Deleting Health Checks</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </important>
     * 
     * @param deleteHealthCheckRequest
     *        This action deletes a health check.
     * @return A Java Future containing the result of the DeleteHealthCheck operation returned by the service.
     * @sample AmazonRoute53Async.DeleteHealthCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/DeleteHealthCheck" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteHealthCheckResult> deleteHealthCheckAsync(DeleteHealthCheckRequest deleteHealthCheckRequest);

    /**
     * <p>
     * Deletes a health check.
     * </p>
     * <important>
     * <p>
     * Amazon Route 53 does not prevent you from deleting a health check even if the health check is associated with one
     * or more resource record sets. If you delete a health check and you don't update the associated resource record
     * sets, the future status of the health check can't be predicted and may change. This will affect the routing of
     * DNS queries for your DNS failover configuration. For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/health-checks-creating-deleting.html#health-checks-deleting.html"
     * >Replacing and Deleting Health Checks</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </important>
     * 
     * @param deleteHealthCheckRequest
     *        This action deletes a health check.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteHealthCheck operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.DeleteHealthCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/DeleteHealthCheck" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteHealthCheckResult> deleteHealthCheckAsync(DeleteHealthCheckRequest deleteHealthCheckRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteHealthCheckRequest, DeleteHealthCheckResult> asyncHandler);

    /**
     * <p>
     * Deletes a hosted zone.
     * </p>
     * <p>
     * If the hosted zone was created by another service, such as AWS Cloud Map, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DeleteHostedZone.html#delete-public-hosted-zone-created-by-another-service"
     * >Deleting Public Hosted Zones That Were Created by Another Service</a> in the <i>Amazon Route 53 Developer
     * Guide</i> for information about how to delete it. (The process is the same for public and private hosted zones
     * that were created by another service.)
     * </p>
     * <p>
     * If you want to keep your domain registration but you want to stop routing internet traffic to your website or web
     * application, we recommend that you delete resource record sets in the hosted zone instead of deleting the hosted
     * zone.
     * </p>
     * <important>
     * <p>
     * If you delete a hosted zone, you can't undelete it. You must create a new hosted zone and update the name servers
     * for your domain registration, which can require up to 48 hours to take effect. (If you delegated responsibility
     * for a subdomain to a hosted zone and you delete the child hosted zone, you must update the name servers in the
     * parent hosted zone.) In addition, if you delete a hosted zone, someone could hijack the domain and route traffic
     * to their own resources using your domain name.
     * </p>
     * </important>
     * <p>
     * If you want to avoid the monthly charge for the hosted zone, you can transfer DNS service for the domain to a
     * free DNS service. When you transfer DNS service, you have to update the name servers for the domain registration.
     * If the domain is registered with Route 53, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_UpdateDomainNameservers.html"
     * >UpdateDomainNameservers</a> for information about how to replace Route 53 name servers with name servers for the
     * new DNS service. If the domain is registered with another registrar, use the method provided by the registrar to
     * update name servers for the domain registration. For more information, perform an internet search on
     * "free DNS service."
     * </p>
     * <p>
     * You can delete a hosted zone only if it contains only the default SOA record and NS resource record sets. If the
     * hosted zone contains other resource record sets, you must delete them before you can delete the hosted zone. If
     * you try to delete a hosted zone that contains other resource record sets, the request fails, and Route 53 returns
     * a <code>HostedZoneNotEmpty</code> error. For information about deleting records from your hosted zone, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_ChangeResourceRecordSets.html">
     * ChangeResourceRecordSets</a>.
     * </p>
     * <p>
     * To verify that the hosted zone has been deleted, do one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <code>GetHostedZone</code> action to request information about the hosted zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the <code>ListHostedZones</code> action to get a list of the hosted zones associated with the current AWS
     * account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteHostedZoneRequest
     *        A request to delete a hosted zone.
     * @return A Java Future containing the result of the DeleteHostedZone operation returned by the service.
     * @sample AmazonRoute53Async.DeleteHostedZone
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/DeleteHostedZone" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteHostedZoneResult> deleteHostedZoneAsync(DeleteHostedZoneRequest deleteHostedZoneRequest);

    /**
     * <p>
     * Deletes a hosted zone.
     * </p>
     * <p>
     * If the hosted zone was created by another service, such as AWS Cloud Map, see <a href=
     * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DeleteHostedZone.html#delete-public-hosted-zone-created-by-another-service"
     * >Deleting Public Hosted Zones That Were Created by Another Service</a> in the <i>Amazon Route 53 Developer
     * Guide</i> for information about how to delete it. (The process is the same for public and private hosted zones
     * that were created by another service.)
     * </p>
     * <p>
     * If you want to keep your domain registration but you want to stop routing internet traffic to your website or web
     * application, we recommend that you delete resource record sets in the hosted zone instead of deleting the hosted
     * zone.
     * </p>
     * <important>
     * <p>
     * If you delete a hosted zone, you can't undelete it. You must create a new hosted zone and update the name servers
     * for your domain registration, which can require up to 48 hours to take effect. (If you delegated responsibility
     * for a subdomain to a hosted zone and you delete the child hosted zone, you must update the name servers in the
     * parent hosted zone.) In addition, if you delete a hosted zone, someone could hijack the domain and route traffic
     * to their own resources using your domain name.
     * </p>
     * </important>
     * <p>
     * If you want to avoid the monthly charge for the hosted zone, you can transfer DNS service for the domain to a
     * free DNS service. When you transfer DNS service, you have to update the name servers for the domain registration.
     * If the domain is registered with Route 53, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_UpdateDomainNameservers.html"
     * >UpdateDomainNameservers</a> for information about how to replace Route 53 name servers with name servers for the
     * new DNS service. If the domain is registered with another registrar, use the method provided by the registrar to
     * update name servers for the domain registration. For more information, perform an internet search on
     * "free DNS service."
     * </p>
     * <p>
     * You can delete a hosted zone only if it contains only the default SOA record and NS resource record sets. If the
     * hosted zone contains other resource record sets, you must delete them before you can delete the hosted zone. If
     * you try to delete a hosted zone that contains other resource record sets, the request fails, and Route 53 returns
     * a <code>HostedZoneNotEmpty</code> error. For information about deleting records from your hosted zone, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_ChangeResourceRecordSets.html">
     * ChangeResourceRecordSets</a>.
     * </p>
     * <p>
     * To verify that the hosted zone has been deleted, do one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use the <code>GetHostedZone</code> action to request information about the hosted zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use the <code>ListHostedZones</code> action to get a list of the hosted zones associated with the current AWS
     * account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteHostedZoneRequest
     *        A request to delete a hosted zone.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteHostedZone operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.DeleteHostedZone
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/DeleteHostedZone" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteHostedZoneResult> deleteHostedZoneAsync(DeleteHostedZoneRequest deleteHostedZoneRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteHostedZoneRequest, DeleteHostedZoneResult> asyncHandler);

    /**
     * <p>
     * Deletes a configuration for DNS query logging. If you delete a configuration, Amazon Route 53 stops sending query
     * logs to CloudWatch Logs. Route 53 doesn't delete any logs that are already in CloudWatch Logs.
     * </p>
     * <p>
     * For more information about DNS query logs, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateQueryLoggingConfig.html"
     * >CreateQueryLoggingConfig</a>.
     * </p>
     * 
     * @param deleteQueryLoggingConfigRequest
     * @return A Java Future containing the result of the DeleteQueryLoggingConfig operation returned by the service.
     * @sample AmazonRoute53Async.DeleteQueryLoggingConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/DeleteQueryLoggingConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteQueryLoggingConfigResult> deleteQueryLoggingConfigAsync(DeleteQueryLoggingConfigRequest deleteQueryLoggingConfigRequest);

    /**
     * <p>
     * Deletes a configuration for DNS query logging. If you delete a configuration, Amazon Route 53 stops sending query
     * logs to CloudWatch Logs. Route 53 doesn't delete any logs that are already in CloudWatch Logs.
     * </p>
     * <p>
     * For more information about DNS query logs, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateQueryLoggingConfig.html"
     * >CreateQueryLoggingConfig</a>.
     * </p>
     * 
     * @param deleteQueryLoggingConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteQueryLoggingConfig operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.DeleteQueryLoggingConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/DeleteQueryLoggingConfig"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteQueryLoggingConfigResult> deleteQueryLoggingConfigAsync(DeleteQueryLoggingConfigRequest deleteQueryLoggingConfigRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteQueryLoggingConfigRequest, DeleteQueryLoggingConfigResult> asyncHandler);

    /**
     * <p>
     * Deletes a reusable delegation set.
     * </p>
     * <important>
     * <p>
     * You can delete a reusable delegation set only if it isn't associated with any hosted zones.
     * </p>
     * </important>
     * <p>
     * To verify that the reusable delegation set is not associated with any hosted zones, submit a <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetReusableDelegationSet.html"
     * >GetReusableDelegationSet</a> request and specify the ID of the reusable delegation set that you want to delete.
     * </p>
     * 
     * @param deleteReusableDelegationSetRequest
     *        A request to delete a reusable delegation set.
     * @return A Java Future containing the result of the DeleteReusableDelegationSet operation returned by the service.
     * @sample AmazonRoute53Async.DeleteReusableDelegationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/DeleteReusableDelegationSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteReusableDelegationSetResult> deleteReusableDelegationSetAsync(
            DeleteReusableDelegationSetRequest deleteReusableDelegationSetRequest);

    /**
     * <p>
     * Deletes a reusable delegation set.
     * </p>
     * <important>
     * <p>
     * You can delete a reusable delegation set only if it isn't associated with any hosted zones.
     * </p>
     * </important>
     * <p>
     * To verify that the reusable delegation set is not associated with any hosted zones, submit a <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_GetReusableDelegationSet.html"
     * >GetReusableDelegationSet</a> request and specify the ID of the reusable delegation set that you want to delete.
     * </p>
     * 
     * @param deleteReusableDelegationSetRequest
     *        A request to delete a reusable delegation set.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteReusableDelegationSet operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.DeleteReusableDelegationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/DeleteReusableDelegationSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteReusableDelegationSetResult> deleteReusableDelegationSetAsync(
            DeleteReusableDelegationSetRequest deleteReusableDelegationSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteReusableDelegationSetRequest, DeleteReusableDelegationSetResult> asyncHandler);

    /**
     * <p>
     * Deletes a traffic policy.
     * </p>
     * 
     * @param deleteTrafficPolicyRequest
     *        A request to delete a specified traffic policy version.
     * @return A Java Future containing the result of the DeleteTrafficPolicy operation returned by the service.
     * @sample AmazonRoute53Async.DeleteTrafficPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/DeleteTrafficPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTrafficPolicyResult> deleteTrafficPolicyAsync(DeleteTrafficPolicyRequest deleteTrafficPolicyRequest);

    /**
     * <p>
     * Deletes a traffic policy.
     * </p>
     * 
     * @param deleteTrafficPolicyRequest
     *        A request to delete a specified traffic policy version.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTrafficPolicy operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.DeleteTrafficPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/DeleteTrafficPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTrafficPolicyResult> deleteTrafficPolicyAsync(DeleteTrafficPolicyRequest deleteTrafficPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTrafficPolicyRequest, DeleteTrafficPolicyResult> asyncHandler);

    /**
     * <p>
     * Deletes a traffic policy instance and all of the resource record sets that Amazon Route 53 created when you
     * created the instance.
     * </p>
     * <note>
     * <p>
     * In the Route 53 console, traffic policy instances are known as policy records.
     * </p>
     * </note>
     * 
     * @param deleteTrafficPolicyInstanceRequest
     *        A request to delete a specified traffic policy instance.
     * @return A Java Future containing the result of the DeleteTrafficPolicyInstance operation returned by the service.
     * @sample AmazonRoute53Async.DeleteTrafficPolicyInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/DeleteTrafficPolicyInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTrafficPolicyInstanceResult> deleteTrafficPolicyInstanceAsync(
            DeleteTrafficPolicyInstanceRequest deleteTrafficPolicyInstanceRequest);

    /**
     * <p>
     * Deletes a traffic policy instance and all of the resource record sets that Amazon Route 53 created when you
     * created the instance.
     * </p>
     * <note>
     * <p>
     * In the Route 53 console, traffic policy instances are known as policy records.
     * </p>
     * </note>
     * 
     * @param deleteTrafficPolicyInstanceRequest
     *        A request to delete a specified traffic policy instance.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTrafficPolicyInstance operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.DeleteTrafficPolicyInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/DeleteTrafficPolicyInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteTrafficPolicyInstanceResult> deleteTrafficPolicyInstanceAsync(
            DeleteTrafficPolicyInstanceRequest deleteTrafficPolicyInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTrafficPolicyInstanceRequest, DeleteTrafficPolicyInstanceResult> asyncHandler);

    /**
     * <p>
     * Removes authorization to submit an <code>AssociateVPCWithHostedZone</code> request to associate a specified VPC
     * with a hosted zone that was created by a different account. You must use the account that created the hosted zone
     * to submit a <code>DeleteVPCAssociationAuthorization</code> request.
     * </p>
     * <important>
     * <p>
     * Sending this request only prevents the AWS account that created the VPC from associating the VPC with the Amazon
     * Route 53 hosted zone in the future. If the VPC is already associated with the hosted zone,
     * <code>DeleteVPCAssociationAuthorization</code> won't disassociate the VPC from the hosted zone. If you want to
     * delete an existing association, use <code>DisassociateVPCFromHostedZone</code>.
     * </p>
     * </important>
     * 
     * @param deleteVPCAssociationAuthorizationRequest
     *        A complex type that contains information about the request to remove authorization to associate a VPC that
     *        was created by one AWS account with a hosted zone that was created with a different AWS account.
     * @return A Java Future containing the result of the DeleteVPCAssociationAuthorization operation returned by the
     *         service.
     * @sample AmazonRoute53Async.DeleteVPCAssociationAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/DeleteVPCAssociationAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVPCAssociationAuthorizationResult> deleteVPCAssociationAuthorizationAsync(
            DeleteVPCAssociationAuthorizationRequest deleteVPCAssociationAuthorizationRequest);

    /**
     * <p>
     * Removes authorization to submit an <code>AssociateVPCWithHostedZone</code> request to associate a specified VPC
     * with a hosted zone that was created by a different account. You must use the account that created the hosted zone
     * to submit a <code>DeleteVPCAssociationAuthorization</code> request.
     * </p>
     * <important>
     * <p>
     * Sending this request only prevents the AWS account that created the VPC from associating the VPC with the Amazon
     * Route 53 hosted zone in the future. If the VPC is already associated with the hosted zone,
     * <code>DeleteVPCAssociationAuthorization</code> won't disassociate the VPC from the hosted zone. If you want to
     * delete an existing association, use <code>DisassociateVPCFromHostedZone</code>.
     * </p>
     * </important>
     * 
     * @param deleteVPCAssociationAuthorizationRequest
     *        A complex type that contains information about the request to remove authorization to associate a VPC that
     *        was created by one AWS account with a hosted zone that was created with a different AWS account.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVPCAssociationAuthorization operation returned by the
     *         service.
     * @sample AmazonRoute53AsyncHandler.DeleteVPCAssociationAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/DeleteVPCAssociationAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVPCAssociationAuthorizationResult> deleteVPCAssociationAuthorizationAsync(
            DeleteVPCAssociationAuthorizationRequest deleteVPCAssociationAuthorizationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVPCAssociationAuthorizationRequest, DeleteVPCAssociationAuthorizationResult> asyncHandler);

    /**
     * <p>
     * Disassociates a VPC from a Amazon Route 53 private hosted zone. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't disassociate the last VPC from a private hosted zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't convert a private hosted zone into a public hosted zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can submit a <code>DisassociateVPCFromHostedZone</code> request using either the account that created the
     * hosted zone or the account that created the VPC.
     * </p>
     * </li>
     * </ul>
     * 
     * @param disassociateVPCFromHostedZoneRequest
     *        A complex type that contains information about the VPC that you want to disassociate from a specified
     *        private hosted zone.
     * @return A Java Future containing the result of the DisassociateVPCFromHostedZone operation returned by the
     *         service.
     * @sample AmazonRoute53Async.DisassociateVPCFromHostedZone
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/DisassociateVPCFromHostedZone"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateVPCFromHostedZoneResult> disassociateVPCFromHostedZoneAsync(
            DisassociateVPCFromHostedZoneRequest disassociateVPCFromHostedZoneRequest);

    /**
     * <p>
     * Disassociates a VPC from a Amazon Route 53 private hosted zone. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't disassociate the last VPC from a private hosted zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't convert a private hosted zone into a public hosted zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can submit a <code>DisassociateVPCFromHostedZone</code> request using either the account that created the
     * hosted zone or the account that created the VPC.
     * </p>
     * </li>
     * </ul>
     * 
     * @param disassociateVPCFromHostedZoneRequest
     *        A complex type that contains information about the VPC that you want to disassociate from a specified
     *        private hosted zone.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateVPCFromHostedZone operation returned by the
     *         service.
     * @sample AmazonRoute53AsyncHandler.DisassociateVPCFromHostedZone
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/DisassociateVPCFromHostedZone"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateVPCFromHostedZoneResult> disassociateVPCFromHostedZoneAsync(
            DisassociateVPCFromHostedZoneRequest disassociateVPCFromHostedZoneRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateVPCFromHostedZoneRequest, DisassociateVPCFromHostedZoneResult> asyncHandler);

    /**
     * <p>
     * Gets the specified limit for the current account, for example, the maximum number of health checks that you can
     * create using the account.
     * </p>
     * <p>
     * For the default limit, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DNSLimitations.html">Limits</a> in the <i>Amazon
     * Route 53 Developer Guide</i>. To request a higher limit, <a href=
     * "https://console.aws.amazon.com/support/home#/case/create?issueType=service-limit-increase&amp;limitType=service-code-route53"
     * >open a case</a>.
     * </p>
     * <note>
     * <p>
     * You can also view account limits in AWS Trusted Advisor. Sign in to the AWS Management Console and open the
     * Trusted Advisor console at <a
     * href="https://console.aws.amazon.com/trustedadvisor">https://console.aws.amazon.com/trustedadvisor/</a>. Then
     * choose <b>Service limits</b> in the navigation pane.
     * </p>
     * </note>
     * 
     * @param getAccountLimitRequest
     *        A complex type that contains information about the request to create a hosted zone.
     * @return A Java Future containing the result of the GetAccountLimit operation returned by the service.
     * @sample AmazonRoute53Async.GetAccountLimit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetAccountLimit" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAccountLimitResult> getAccountLimitAsync(GetAccountLimitRequest getAccountLimitRequest);

    /**
     * <p>
     * Gets the specified limit for the current account, for example, the maximum number of health checks that you can
     * create using the account.
     * </p>
     * <p>
     * For the default limit, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DNSLimitations.html">Limits</a> in the <i>Amazon
     * Route 53 Developer Guide</i>. To request a higher limit, <a href=
     * "https://console.aws.amazon.com/support/home#/case/create?issueType=service-limit-increase&amp;limitType=service-code-route53"
     * >open a case</a>.
     * </p>
     * <note>
     * <p>
     * You can also view account limits in AWS Trusted Advisor. Sign in to the AWS Management Console and open the
     * Trusted Advisor console at <a
     * href="https://console.aws.amazon.com/trustedadvisor">https://console.aws.amazon.com/trustedadvisor/</a>. Then
     * choose <b>Service limits</b> in the navigation pane.
     * </p>
     * </note>
     * 
     * @param getAccountLimitRequest
     *        A complex type that contains information about the request to create a hosted zone.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccountLimit operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.GetAccountLimit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetAccountLimit" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAccountLimitResult> getAccountLimitAsync(GetAccountLimitRequest getAccountLimitRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccountLimitRequest, GetAccountLimitResult> asyncHandler);

    /**
     * <p>
     * Returns the current status of a change batch request. The status is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> indicates that the changes in this request have not propagated to all Amazon Route 53 DNS
     * servers. This is the initial status of all change batch requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSYNC</code> indicates that the changes have propagated to all Route 53 DNS servers.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getChangeRequest
     *        The input for a GetChange request.
     * @return A Java Future containing the result of the GetChange operation returned by the service.
     * @sample AmazonRoute53Async.GetChange
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetChange" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetChangeResult> getChangeAsync(GetChangeRequest getChangeRequest);

    /**
     * <p>
     * Returns the current status of a change batch request. The status is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> indicates that the changes in this request have not propagated to all Amazon Route 53 DNS
     * servers. This is the initial status of all change batch requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSYNC</code> indicates that the changes have propagated to all Route 53 DNS servers.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getChangeRequest
     *        The input for a GetChange request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetChange operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.GetChange
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetChange" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetChangeResult> getChangeAsync(GetChangeRequest getChangeRequest,
            com.amazonaws.handlers.AsyncHandler<GetChangeRequest, GetChangeResult> asyncHandler);

    /**
     * <important>
     * <p>
     * <code>GetCheckerIpRanges</code> still works, but we recommend that you download ip-ranges.json, which includes IP
     * address ranges for all AWS services. For more information, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/route-53-ip-addresses.html">IP Address Ranges of
     * Amazon Route 53 Servers</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </important>
     * 
     * @param getCheckerIpRangesRequest
     *        Empty request.
     * @return A Java Future containing the result of the GetCheckerIpRanges operation returned by the service.
     * @sample AmazonRoute53Async.GetCheckerIpRanges
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetCheckerIpRanges" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCheckerIpRangesResult> getCheckerIpRangesAsync(GetCheckerIpRangesRequest getCheckerIpRangesRequest);

    /**
     * <important>
     * <p>
     * <code>GetCheckerIpRanges</code> still works, but we recommend that you download ip-ranges.json, which includes IP
     * address ranges for all AWS services. For more information, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/route-53-ip-addresses.html">IP Address Ranges of
     * Amazon Route 53 Servers</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </important>
     * 
     * @param getCheckerIpRangesRequest
     *        Empty request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCheckerIpRanges operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.GetCheckerIpRanges
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetCheckerIpRanges" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCheckerIpRangesResult> getCheckerIpRangesAsync(GetCheckerIpRangesRequest getCheckerIpRangesRequest,
            com.amazonaws.handlers.AsyncHandler<GetCheckerIpRangesRequest, GetCheckerIpRangesResult> asyncHandler);

    /**
     * Simplified method form for invoking the GetCheckerIpRanges operation.
     *
     * @see #getCheckerIpRangesAsync(GetCheckerIpRangesRequest)
     */
    java.util.concurrent.Future<GetCheckerIpRangesResult> getCheckerIpRangesAsync();

    /**
     * Simplified method form for invoking the GetCheckerIpRanges operation with an AsyncHandler.
     *
     * @see #getCheckerIpRangesAsync(GetCheckerIpRangesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<GetCheckerIpRangesResult> getCheckerIpRangesAsync(
            com.amazonaws.handlers.AsyncHandler<GetCheckerIpRangesRequest, GetCheckerIpRangesResult> asyncHandler);

    /**
     * <p>
     * Gets information about whether a specified geographic location is supported for Amazon Route 53 geolocation
     * resource record sets.
     * </p>
     * <p>
     * Use the following syntax to determine whether a continent is supported for geolocation:
     * </p>
     * <p>
     * <code>GET /2013-04-01/geolocation?continentcode=<i>two-letter abbreviation for a continent</i> </code>
     * </p>
     * <p>
     * Use the following syntax to determine whether a country is supported for geolocation:
     * </p>
     * <p>
     * <code>GET /2013-04-01/geolocation?countrycode=<i>two-character country code</i> </code>
     * </p>
     * <p>
     * Use the following syntax to determine whether a subdivision of a country is supported for geolocation:
     * </p>
     * <p>
     * <code>GET /2013-04-01/geolocation?countrycode=<i>two-character country code</i>&amp;subdivisioncode=<i>subdivision code</i> </code>
     * </p>
     * 
     * @param getGeoLocationRequest
     *        A request for information about whether a specified geographic location is supported for Amazon Route 53
     *        geolocation resource record sets.
     * @return A Java Future containing the result of the GetGeoLocation operation returned by the service.
     * @sample AmazonRoute53Async.GetGeoLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetGeoLocation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGeoLocationResult> getGeoLocationAsync(GetGeoLocationRequest getGeoLocationRequest);

    /**
     * <p>
     * Gets information about whether a specified geographic location is supported for Amazon Route 53 geolocation
     * resource record sets.
     * </p>
     * <p>
     * Use the following syntax to determine whether a continent is supported for geolocation:
     * </p>
     * <p>
     * <code>GET /2013-04-01/geolocation?continentcode=<i>two-letter abbreviation for a continent</i> </code>
     * </p>
     * <p>
     * Use the following syntax to determine whether a country is supported for geolocation:
     * </p>
     * <p>
     * <code>GET /2013-04-01/geolocation?countrycode=<i>two-character country code</i> </code>
     * </p>
     * <p>
     * Use the following syntax to determine whether a subdivision of a country is supported for geolocation:
     * </p>
     * <p>
     * <code>GET /2013-04-01/geolocation?countrycode=<i>two-character country code</i>&amp;subdivisioncode=<i>subdivision code</i> </code>
     * </p>
     * 
     * @param getGeoLocationRequest
     *        A request for information about whether a specified geographic location is supported for Amazon Route 53
     *        geolocation resource record sets.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGeoLocation operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.GetGeoLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetGeoLocation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGeoLocationResult> getGeoLocationAsync(GetGeoLocationRequest getGeoLocationRequest,
            com.amazonaws.handlers.AsyncHandler<GetGeoLocationRequest, GetGeoLocationResult> asyncHandler);

    /**
     * Simplified method form for invoking the GetGeoLocation operation.
     *
     * @see #getGeoLocationAsync(GetGeoLocationRequest)
     */
    java.util.concurrent.Future<GetGeoLocationResult> getGeoLocationAsync();

    /**
     * Simplified method form for invoking the GetGeoLocation operation with an AsyncHandler.
     *
     * @see #getGeoLocationAsync(GetGeoLocationRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<GetGeoLocationResult> getGeoLocationAsync(
            com.amazonaws.handlers.AsyncHandler<GetGeoLocationRequest, GetGeoLocationResult> asyncHandler);

    /**
     * <p>
     * Gets information about a specified health check.
     * </p>
     * 
     * @param getHealthCheckRequest
     *        A request to get information about a specified health check.
     * @return A Java Future containing the result of the GetHealthCheck operation returned by the service.
     * @sample AmazonRoute53Async.GetHealthCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetHealthCheck" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetHealthCheckResult> getHealthCheckAsync(GetHealthCheckRequest getHealthCheckRequest);

    /**
     * <p>
     * Gets information about a specified health check.
     * </p>
     * 
     * @param getHealthCheckRequest
     *        A request to get information about a specified health check.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetHealthCheck operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.GetHealthCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetHealthCheck" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetHealthCheckResult> getHealthCheckAsync(GetHealthCheckRequest getHealthCheckRequest,
            com.amazonaws.handlers.AsyncHandler<GetHealthCheckRequest, GetHealthCheckResult> asyncHandler);

    /**
     * <p>
     * Retrieves the number of health checks that are associated with the current AWS account.
     * </p>
     * 
     * @param getHealthCheckCountRequest
     *        A request for the number of health checks that are associated with the current AWS account.
     * @return A Java Future containing the result of the GetHealthCheckCount operation returned by the service.
     * @sample AmazonRoute53Async.GetHealthCheckCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetHealthCheckCount" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetHealthCheckCountResult> getHealthCheckCountAsync(GetHealthCheckCountRequest getHealthCheckCountRequest);

    /**
     * <p>
     * Retrieves the number of health checks that are associated with the current AWS account.
     * </p>
     * 
     * @param getHealthCheckCountRequest
     *        A request for the number of health checks that are associated with the current AWS account.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetHealthCheckCount operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.GetHealthCheckCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetHealthCheckCount" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetHealthCheckCountResult> getHealthCheckCountAsync(GetHealthCheckCountRequest getHealthCheckCountRequest,
            com.amazonaws.handlers.AsyncHandler<GetHealthCheckCountRequest, GetHealthCheckCountResult> asyncHandler);

    /**
     * Simplified method form for invoking the GetHealthCheckCount operation.
     *
     * @see #getHealthCheckCountAsync(GetHealthCheckCountRequest)
     */
    java.util.concurrent.Future<GetHealthCheckCountResult> getHealthCheckCountAsync();

    /**
     * Simplified method form for invoking the GetHealthCheckCount operation with an AsyncHandler.
     *
     * @see #getHealthCheckCountAsync(GetHealthCheckCountRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<GetHealthCheckCountResult> getHealthCheckCountAsync(
            com.amazonaws.handlers.AsyncHandler<GetHealthCheckCountRequest, GetHealthCheckCountResult> asyncHandler);

    /**
     * <p>
     * Gets the reason that a specified health check failed most recently.
     * </p>
     * 
     * @param getHealthCheckLastFailureReasonRequest
     *        A request for the reason that a health check failed most recently.
     * @return A Java Future containing the result of the GetHealthCheckLastFailureReason operation returned by the
     *         service.
     * @sample AmazonRoute53Async.GetHealthCheckLastFailureReason
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetHealthCheckLastFailureReason"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetHealthCheckLastFailureReasonResult> getHealthCheckLastFailureReasonAsync(
            GetHealthCheckLastFailureReasonRequest getHealthCheckLastFailureReasonRequest);

    /**
     * <p>
     * Gets the reason that a specified health check failed most recently.
     * </p>
     * 
     * @param getHealthCheckLastFailureReasonRequest
     *        A request for the reason that a health check failed most recently.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetHealthCheckLastFailureReason operation returned by the
     *         service.
     * @sample AmazonRoute53AsyncHandler.GetHealthCheckLastFailureReason
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetHealthCheckLastFailureReason"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetHealthCheckLastFailureReasonResult> getHealthCheckLastFailureReasonAsync(
            GetHealthCheckLastFailureReasonRequest getHealthCheckLastFailureReasonRequest,
            com.amazonaws.handlers.AsyncHandler<GetHealthCheckLastFailureReasonRequest, GetHealthCheckLastFailureReasonResult> asyncHandler);

    /**
     * <p>
     * Gets status of a specified health check.
     * </p>
     * 
     * @param getHealthCheckStatusRequest
     *        A request to get the status for a health check.
     * @return A Java Future containing the result of the GetHealthCheckStatus operation returned by the service.
     * @sample AmazonRoute53Async.GetHealthCheckStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetHealthCheckStatus" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetHealthCheckStatusResult> getHealthCheckStatusAsync(GetHealthCheckStatusRequest getHealthCheckStatusRequest);

    /**
     * <p>
     * Gets status of a specified health check.
     * </p>
     * 
     * @param getHealthCheckStatusRequest
     *        A request to get the status for a health check.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetHealthCheckStatus operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.GetHealthCheckStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetHealthCheckStatus" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetHealthCheckStatusResult> getHealthCheckStatusAsync(GetHealthCheckStatusRequest getHealthCheckStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetHealthCheckStatusRequest, GetHealthCheckStatusResult> asyncHandler);

    /**
     * <p>
     * Gets information about a specified hosted zone including the four name servers assigned to the hosted zone.
     * </p>
     * 
     * @param getHostedZoneRequest
     *        A request to get information about a specified hosted zone.
     * @return A Java Future containing the result of the GetHostedZone operation returned by the service.
     * @sample AmazonRoute53Async.GetHostedZone
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetHostedZone" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetHostedZoneResult> getHostedZoneAsync(GetHostedZoneRequest getHostedZoneRequest);

    /**
     * <p>
     * Gets information about a specified hosted zone including the four name servers assigned to the hosted zone.
     * </p>
     * 
     * @param getHostedZoneRequest
     *        A request to get information about a specified hosted zone.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetHostedZone operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.GetHostedZone
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetHostedZone" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetHostedZoneResult> getHostedZoneAsync(GetHostedZoneRequest getHostedZoneRequest,
            com.amazonaws.handlers.AsyncHandler<GetHostedZoneRequest, GetHostedZoneResult> asyncHandler);

    /**
     * <p>
     * Retrieves the number of hosted zones that are associated with the current AWS account.
     * </p>
     * 
     * @param getHostedZoneCountRequest
     *        A request to retrieve a count of all the hosted zones that are associated with the current AWS account.
     * @return A Java Future containing the result of the GetHostedZoneCount operation returned by the service.
     * @sample AmazonRoute53Async.GetHostedZoneCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetHostedZoneCount" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetHostedZoneCountResult> getHostedZoneCountAsync(GetHostedZoneCountRequest getHostedZoneCountRequest);

    /**
     * <p>
     * Retrieves the number of hosted zones that are associated with the current AWS account.
     * </p>
     * 
     * @param getHostedZoneCountRequest
     *        A request to retrieve a count of all the hosted zones that are associated with the current AWS account.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetHostedZoneCount operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.GetHostedZoneCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetHostedZoneCount" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetHostedZoneCountResult> getHostedZoneCountAsync(GetHostedZoneCountRequest getHostedZoneCountRequest,
            com.amazonaws.handlers.AsyncHandler<GetHostedZoneCountRequest, GetHostedZoneCountResult> asyncHandler);

    /**
     * Simplified method form for invoking the GetHostedZoneCount operation.
     *
     * @see #getHostedZoneCountAsync(GetHostedZoneCountRequest)
     */
    java.util.concurrent.Future<GetHostedZoneCountResult> getHostedZoneCountAsync();

    /**
     * Simplified method form for invoking the GetHostedZoneCount operation with an AsyncHandler.
     *
     * @see #getHostedZoneCountAsync(GetHostedZoneCountRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<GetHostedZoneCountResult> getHostedZoneCountAsync(
            com.amazonaws.handlers.AsyncHandler<GetHostedZoneCountRequest, GetHostedZoneCountResult> asyncHandler);

    /**
     * <p>
     * Gets the specified limit for a specified hosted zone, for example, the maximum number of records that you can
     * create in the hosted zone.
     * </p>
     * <p>
     * For the default limit, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DNSLimitations.html">Limits</a> in the <i>Amazon
     * Route 53 Developer Guide</i>. To request a higher limit, <a href=
     * "https://console.aws.amazon.com/support/home#/case/create?issueType=service-limit-increase&amp;limitType=service-code-route53"
     * >open a case</a>.
     * </p>
     * 
     * @param getHostedZoneLimitRequest
     *        A complex type that contains information about the request to create a hosted zone.
     * @return A Java Future containing the result of the GetHostedZoneLimit operation returned by the service.
     * @sample AmazonRoute53Async.GetHostedZoneLimit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetHostedZoneLimit" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetHostedZoneLimitResult> getHostedZoneLimitAsync(GetHostedZoneLimitRequest getHostedZoneLimitRequest);

    /**
     * <p>
     * Gets the specified limit for a specified hosted zone, for example, the maximum number of records that you can
     * create in the hosted zone.
     * </p>
     * <p>
     * For the default limit, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DNSLimitations.html">Limits</a> in the <i>Amazon
     * Route 53 Developer Guide</i>. To request a higher limit, <a href=
     * "https://console.aws.amazon.com/support/home#/case/create?issueType=service-limit-increase&amp;limitType=service-code-route53"
     * >open a case</a>.
     * </p>
     * 
     * @param getHostedZoneLimitRequest
     *        A complex type that contains information about the request to create a hosted zone.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetHostedZoneLimit operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.GetHostedZoneLimit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetHostedZoneLimit" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetHostedZoneLimitResult> getHostedZoneLimitAsync(GetHostedZoneLimitRequest getHostedZoneLimitRequest,
            com.amazonaws.handlers.AsyncHandler<GetHostedZoneLimitRequest, GetHostedZoneLimitResult> asyncHandler);

    /**
     * <p>
     * Gets information about a specified configuration for DNS query logging.
     * </p>
     * <p>
     * For more information about DNS query logs, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateQueryLoggingConfig.html"
     * >CreateQueryLoggingConfig</a> and <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/query-logs.html">Logging DNS Queries</a>.
     * </p>
     * 
     * @param getQueryLoggingConfigRequest
     * @return A Java Future containing the result of the GetQueryLoggingConfig operation returned by the service.
     * @sample AmazonRoute53Async.GetQueryLoggingConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetQueryLoggingConfig" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetQueryLoggingConfigResult> getQueryLoggingConfigAsync(GetQueryLoggingConfigRequest getQueryLoggingConfigRequest);

    /**
     * <p>
     * Gets information about a specified configuration for DNS query logging.
     * </p>
     * <p>
     * For more information about DNS query logs, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateQueryLoggingConfig.html"
     * >CreateQueryLoggingConfig</a> and <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/query-logs.html">Logging DNS Queries</a>.
     * </p>
     * 
     * @param getQueryLoggingConfigRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetQueryLoggingConfig operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.GetQueryLoggingConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetQueryLoggingConfig" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetQueryLoggingConfigResult> getQueryLoggingConfigAsync(GetQueryLoggingConfigRequest getQueryLoggingConfigRequest,
            com.amazonaws.handlers.AsyncHandler<GetQueryLoggingConfigRequest, GetQueryLoggingConfigResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a specified reusable delegation set, including the four name servers that are
     * assigned to the delegation set.
     * </p>
     * 
     * @param getReusableDelegationSetRequest
     *        A request to get information about a specified reusable delegation set.
     * @return A Java Future containing the result of the GetReusableDelegationSet operation returned by the service.
     * @sample AmazonRoute53Async.GetReusableDelegationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetReusableDelegationSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetReusableDelegationSetResult> getReusableDelegationSetAsync(GetReusableDelegationSetRequest getReusableDelegationSetRequest);

    /**
     * <p>
     * Retrieves information about a specified reusable delegation set, including the four name servers that are
     * assigned to the delegation set.
     * </p>
     * 
     * @param getReusableDelegationSetRequest
     *        A request to get information about a specified reusable delegation set.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetReusableDelegationSet operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.GetReusableDelegationSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetReusableDelegationSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetReusableDelegationSetResult> getReusableDelegationSetAsync(GetReusableDelegationSetRequest getReusableDelegationSetRequest,
            com.amazonaws.handlers.AsyncHandler<GetReusableDelegationSetRequest, GetReusableDelegationSetResult> asyncHandler);

    /**
     * <p>
     * Gets the maximum number of hosted zones that you can associate with the specified reusable delegation set.
     * </p>
     * <p>
     * For the default limit, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DNSLimitations.html">Limits</a> in the <i>Amazon
     * Route 53 Developer Guide</i>. To request a higher limit, <a href=
     * "https://console.aws.amazon.com/support/home#/case/create?issueType=service-limit-increase&amp;limitType=service-code-route53"
     * >open a case</a>.
     * </p>
     * 
     * @param getReusableDelegationSetLimitRequest
     *        A complex type that contains information about the request to create a hosted zone.
     * @return A Java Future containing the result of the GetReusableDelegationSetLimit operation returned by the
     *         service.
     * @sample AmazonRoute53Async.GetReusableDelegationSetLimit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetReusableDelegationSetLimit"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetReusableDelegationSetLimitResult> getReusableDelegationSetLimitAsync(
            GetReusableDelegationSetLimitRequest getReusableDelegationSetLimitRequest);

    /**
     * <p>
     * Gets the maximum number of hosted zones that you can associate with the specified reusable delegation set.
     * </p>
     * <p>
     * For the default limit, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DNSLimitations.html">Limits</a> in the <i>Amazon
     * Route 53 Developer Guide</i>. To request a higher limit, <a href=
     * "https://console.aws.amazon.com/support/home#/case/create?issueType=service-limit-increase&amp;limitType=service-code-route53"
     * >open a case</a>.
     * </p>
     * 
     * @param getReusableDelegationSetLimitRequest
     *        A complex type that contains information about the request to create a hosted zone.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetReusableDelegationSetLimit operation returned by the
     *         service.
     * @sample AmazonRoute53AsyncHandler.GetReusableDelegationSetLimit
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetReusableDelegationSetLimit"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetReusableDelegationSetLimitResult> getReusableDelegationSetLimitAsync(
            GetReusableDelegationSetLimitRequest getReusableDelegationSetLimitRequest,
            com.amazonaws.handlers.AsyncHandler<GetReusableDelegationSetLimitRequest, GetReusableDelegationSetLimitResult> asyncHandler);

    /**
     * <p>
     * Gets information about a specific traffic policy version.
     * </p>
     * 
     * @param getTrafficPolicyRequest
     *        Gets information about a specific traffic policy version.
     * @return A Java Future containing the result of the GetTrafficPolicy operation returned by the service.
     * @sample AmazonRoute53Async.GetTrafficPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetTrafficPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTrafficPolicyResult> getTrafficPolicyAsync(GetTrafficPolicyRequest getTrafficPolicyRequest);

    /**
     * <p>
     * Gets information about a specific traffic policy version.
     * </p>
     * 
     * @param getTrafficPolicyRequest
     *        Gets information about a specific traffic policy version.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTrafficPolicy operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.GetTrafficPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetTrafficPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetTrafficPolicyResult> getTrafficPolicyAsync(GetTrafficPolicyRequest getTrafficPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetTrafficPolicyRequest, GetTrafficPolicyResult> asyncHandler);

    /**
     * <p>
     * Gets information about a specified traffic policy instance.
     * </p>
     * <note>
     * <p>
     * After you submit a <code>CreateTrafficPolicyInstance</code> or an <code>UpdateTrafficPolicyInstance</code>
     * request, there's a brief delay while Amazon Route 53 creates the resource record sets that are specified in the
     * traffic policy definition. For more information, see the <code>State</code> response element.
     * </p>
     * </note> <note>
     * <p>
     * In the Route 53 console, traffic policy instances are known as policy records.
     * </p>
     * </note>
     * 
     * @param getTrafficPolicyInstanceRequest
     *        Gets information about a specified traffic policy instance.
     * @return A Java Future containing the result of the GetTrafficPolicyInstance operation returned by the service.
     * @sample AmazonRoute53Async.GetTrafficPolicyInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetTrafficPolicyInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTrafficPolicyInstanceResult> getTrafficPolicyInstanceAsync(GetTrafficPolicyInstanceRequest getTrafficPolicyInstanceRequest);

    /**
     * <p>
     * Gets information about a specified traffic policy instance.
     * </p>
     * <note>
     * <p>
     * After you submit a <code>CreateTrafficPolicyInstance</code> or an <code>UpdateTrafficPolicyInstance</code>
     * request, there's a brief delay while Amazon Route 53 creates the resource record sets that are specified in the
     * traffic policy definition. For more information, see the <code>State</code> response element.
     * </p>
     * </note> <note>
     * <p>
     * In the Route 53 console, traffic policy instances are known as policy records.
     * </p>
     * </note>
     * 
     * @param getTrafficPolicyInstanceRequest
     *        Gets information about a specified traffic policy instance.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTrafficPolicyInstance operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.GetTrafficPolicyInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetTrafficPolicyInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTrafficPolicyInstanceResult> getTrafficPolicyInstanceAsync(GetTrafficPolicyInstanceRequest getTrafficPolicyInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<GetTrafficPolicyInstanceRequest, GetTrafficPolicyInstanceResult> asyncHandler);

    /**
     * <p>
     * Gets the number of traffic policy instances that are associated with the current AWS account.
     * </p>
     * 
     * @param getTrafficPolicyInstanceCountRequest
     *        Request to get the number of traffic policy instances that are associated with the current AWS account.
     * @return A Java Future containing the result of the GetTrafficPolicyInstanceCount operation returned by the
     *         service.
     * @sample AmazonRoute53Async.GetTrafficPolicyInstanceCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetTrafficPolicyInstanceCount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTrafficPolicyInstanceCountResult> getTrafficPolicyInstanceCountAsync(
            GetTrafficPolicyInstanceCountRequest getTrafficPolicyInstanceCountRequest);

    /**
     * <p>
     * Gets the number of traffic policy instances that are associated with the current AWS account.
     * </p>
     * 
     * @param getTrafficPolicyInstanceCountRequest
     *        Request to get the number of traffic policy instances that are associated with the current AWS account.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTrafficPolicyInstanceCount operation returned by the
     *         service.
     * @sample AmazonRoute53AsyncHandler.GetTrafficPolicyInstanceCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetTrafficPolicyInstanceCount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetTrafficPolicyInstanceCountResult> getTrafficPolicyInstanceCountAsync(
            GetTrafficPolicyInstanceCountRequest getTrafficPolicyInstanceCountRequest,
            com.amazonaws.handlers.AsyncHandler<GetTrafficPolicyInstanceCountRequest, GetTrafficPolicyInstanceCountResult> asyncHandler);

    /**
     * Simplified method form for invoking the GetTrafficPolicyInstanceCount operation.
     *
     * @see #getTrafficPolicyInstanceCountAsync(GetTrafficPolicyInstanceCountRequest)
     */
    java.util.concurrent.Future<GetTrafficPolicyInstanceCountResult> getTrafficPolicyInstanceCountAsync();

    /**
     * Simplified method form for invoking the GetTrafficPolicyInstanceCount operation with an AsyncHandler.
     *
     * @see #getTrafficPolicyInstanceCountAsync(GetTrafficPolicyInstanceCountRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<GetTrafficPolicyInstanceCountResult> getTrafficPolicyInstanceCountAsync(
            com.amazonaws.handlers.AsyncHandler<GetTrafficPolicyInstanceCountRequest, GetTrafficPolicyInstanceCountResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of supported geographic locations.
     * </p>
     * <p>
     * Countries are listed first, and continents are listed last. If Amazon Route 53 supports subdivisions for a
     * country (for example, states or provinces), the subdivisions for that country are listed in alphabetical order
     * immediately after the corresponding country.
     * </p>
     * 
     * @param listGeoLocationsRequest
     *        A request to get a list of geographic locations that Amazon Route 53 supports for geolocation resource
     *        record sets.
     * @return A Java Future containing the result of the ListGeoLocations operation returned by the service.
     * @sample AmazonRoute53Async.ListGeoLocations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListGeoLocations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGeoLocationsResult> listGeoLocationsAsync(ListGeoLocationsRequest listGeoLocationsRequest);

    /**
     * <p>
     * Retrieves a list of supported geographic locations.
     * </p>
     * <p>
     * Countries are listed first, and continents are listed last. If Amazon Route 53 supports subdivisions for a
     * country (for example, states or provinces), the subdivisions for that country are listed in alphabetical order
     * immediately after the corresponding country.
     * </p>
     * 
     * @param listGeoLocationsRequest
     *        A request to get a list of geographic locations that Amazon Route 53 supports for geolocation resource
     *        record sets.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGeoLocations operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.ListGeoLocations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListGeoLocations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGeoLocationsResult> listGeoLocationsAsync(ListGeoLocationsRequest listGeoLocationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListGeoLocationsRequest, ListGeoLocationsResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListGeoLocations operation.
     *
     * @see #listGeoLocationsAsync(ListGeoLocationsRequest)
     */
    java.util.concurrent.Future<ListGeoLocationsResult> listGeoLocationsAsync();

    /**
     * Simplified method form for invoking the ListGeoLocations operation with an AsyncHandler.
     *
     * @see #listGeoLocationsAsync(ListGeoLocationsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListGeoLocationsResult> listGeoLocationsAsync(
            com.amazonaws.handlers.AsyncHandler<ListGeoLocationsRequest, ListGeoLocationsResult> asyncHandler);

    /**
     * <p>
     * Retrieve a list of the health checks that are associated with the current AWS account.
     * </p>
     * 
     * @param listHealthChecksRequest
     *        A request to retrieve a list of the health checks that are associated with the current AWS account.
     * @return A Java Future containing the result of the ListHealthChecks operation returned by the service.
     * @sample AmazonRoute53Async.ListHealthChecks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListHealthChecks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListHealthChecksResult> listHealthChecksAsync(ListHealthChecksRequest listHealthChecksRequest);

    /**
     * <p>
     * Retrieve a list of the health checks that are associated with the current AWS account.
     * </p>
     * 
     * @param listHealthChecksRequest
     *        A request to retrieve a list of the health checks that are associated with the current AWS account.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListHealthChecks operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.ListHealthChecks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListHealthChecks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListHealthChecksResult> listHealthChecksAsync(ListHealthChecksRequest listHealthChecksRequest,
            com.amazonaws.handlers.AsyncHandler<ListHealthChecksRequest, ListHealthChecksResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListHealthChecks operation.
     *
     * @see #listHealthChecksAsync(ListHealthChecksRequest)
     */
    java.util.concurrent.Future<ListHealthChecksResult> listHealthChecksAsync();

    /**
     * Simplified method form for invoking the ListHealthChecks operation with an AsyncHandler.
     *
     * @see #listHealthChecksAsync(ListHealthChecksRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListHealthChecksResult> listHealthChecksAsync(
            com.amazonaws.handlers.AsyncHandler<ListHealthChecksRequest, ListHealthChecksResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of the public and private hosted zones that are associated with the current AWS account. The
     * response includes a <code>HostedZones</code> child element for each hosted zone.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If you have a lot of hosted zones, you can use
     * the <code>maxitems</code> parameter to list them in groups of up to 100.
     * </p>
     * 
     * @param listHostedZonesRequest
     *        A request to retrieve a list of the public and private hosted zones that are associated with the current
     *        AWS account.
     * @return A Java Future containing the result of the ListHostedZones operation returned by the service.
     * @sample AmazonRoute53Async.ListHostedZones
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListHostedZones" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListHostedZonesResult> listHostedZonesAsync(ListHostedZonesRequest listHostedZonesRequest);

    /**
     * <p>
     * Retrieves a list of the public and private hosted zones that are associated with the current AWS account. The
     * response includes a <code>HostedZones</code> child element for each hosted zone.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If you have a lot of hosted zones, you can use
     * the <code>maxitems</code> parameter to list them in groups of up to 100.
     * </p>
     * 
     * @param listHostedZonesRequest
     *        A request to retrieve a list of the public and private hosted zones that are associated with the current
     *        AWS account.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListHostedZones operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.ListHostedZones
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListHostedZones" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListHostedZonesResult> listHostedZonesAsync(ListHostedZonesRequest listHostedZonesRequest,
            com.amazonaws.handlers.AsyncHandler<ListHostedZonesRequest, ListHostedZonesResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListHostedZones operation.
     *
     * @see #listHostedZonesAsync(ListHostedZonesRequest)
     */
    java.util.concurrent.Future<ListHostedZonesResult> listHostedZonesAsync();

    /**
     * Simplified method form for invoking the ListHostedZones operation with an AsyncHandler.
     *
     * @see #listHostedZonesAsync(ListHostedZonesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListHostedZonesResult> listHostedZonesAsync(
            com.amazonaws.handlers.AsyncHandler<ListHostedZonesRequest, ListHostedZonesResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of your hosted zones in lexicographic order. The response includes a <code>HostedZones</code>
     * child element for each hosted zone created by the current AWS account.
     * </p>
     * <p>
     * <code>ListHostedZonesByName</code> sorts hosted zones by name with the labels reversed. For example:
     * </p>
     * <p>
     * <code>com.example.www.</code>
     * </p>
     * <p>
     * Note the trailing dot, which can change the sort order in some circumstances.
     * </p>
     * <p>
     * If the domain name includes escape characters or Punycode, <code>ListHostedZonesByName</code> alphabetizes the
     * domain name using the escaped or Punycoded value, which is the format that Amazon Route 53 saves in its database.
     * For example, to create a hosted zone for exämple.com, you specify ex\344mple.com for the domain name.
     * <code>ListHostedZonesByName</code> alphabetizes it as:
     * </p>
     * <p>
     * <code>com.ex\344mple.</code>
     * </p>
     * <p>
     * The labels are reversed and alphabetized using the escaped value. For more information about valid domain name
     * formats, including internationalized domain names, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html">DNS Domain Name Format</a>
     * in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * Route 53 returns up to 100 items in each response. If you have a lot of hosted zones, use the
     * <code>MaxItems</code> parameter to list them in groups of up to 100. The response includes values that help
     * navigate from one group of <code>MaxItems</code> hosted zones to the next:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>DNSName</code> and <code>HostedZoneId</code> elements in the response contain the values, if any,
     * specified for the <code>dnsname</code> and <code>hostedzoneid</code> parameters in the request that produced the
     * current response.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>MaxItems</code> element in the response contains the value, if any, that you specified for the
     * <code>maxitems</code> parameter in the request that produced the current response.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is true, there are more hosted zones associated with the
     * current AWS account.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is false, this response includes the last hosted zone that is associated with the
     * current account. The <code>NextDNSName</code> element and <code>NextHostedZoneId</code> elements are omitted from
     * the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>NextDNSName</code> and <code>NextHostedZoneId</code> elements in the response contain the domain name
     * and the hosted zone ID of the next hosted zone that is associated with the current AWS account. If you want to
     * list more hosted zones, make another call to <code>ListHostedZonesByName</code>, and specify the value of
     * <code>NextDNSName</code> and <code>NextHostedZoneId</code> in the <code>dnsname</code> and
     * <code>hostedzoneid</code> parameters, respectively.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listHostedZonesByNameRequest
     *        Retrieves a list of the public and private hosted zones that are associated with the current AWS account
     *        in ASCII order by domain name.
     * @return A Java Future containing the result of the ListHostedZonesByName operation returned by the service.
     * @sample AmazonRoute53Async.ListHostedZonesByName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListHostedZonesByName" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListHostedZonesByNameResult> listHostedZonesByNameAsync(ListHostedZonesByNameRequest listHostedZonesByNameRequest);

    /**
     * <p>
     * Retrieves a list of your hosted zones in lexicographic order. The response includes a <code>HostedZones</code>
     * child element for each hosted zone created by the current AWS account.
     * </p>
     * <p>
     * <code>ListHostedZonesByName</code> sorts hosted zones by name with the labels reversed. For example:
     * </p>
     * <p>
     * <code>com.example.www.</code>
     * </p>
     * <p>
     * Note the trailing dot, which can change the sort order in some circumstances.
     * </p>
     * <p>
     * If the domain name includes escape characters or Punycode, <code>ListHostedZonesByName</code> alphabetizes the
     * domain name using the escaped or Punycoded value, which is the format that Amazon Route 53 saves in its database.
     * For example, to create a hosted zone for exämple.com, you specify ex\344mple.com for the domain name.
     * <code>ListHostedZonesByName</code> alphabetizes it as:
     * </p>
     * <p>
     * <code>com.ex\344mple.</code>
     * </p>
     * <p>
     * The labels are reversed and alphabetized using the escaped value. For more information about valid domain name
     * formats, including internationalized domain names, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html">DNS Domain Name Format</a>
     * in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * Route 53 returns up to 100 items in each response. If you have a lot of hosted zones, use the
     * <code>MaxItems</code> parameter to list them in groups of up to 100. The response includes values that help
     * navigate from one group of <code>MaxItems</code> hosted zones to the next:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The <code>DNSName</code> and <code>HostedZoneId</code> elements in the response contain the values, if any,
     * specified for the <code>dnsname</code> and <code>hostedzoneid</code> parameters in the request that produced the
     * current response.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>MaxItems</code> element in the response contains the value, if any, that you specified for the
     * <code>maxitems</code> parameter in the request that produced the current response.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is true, there are more hosted zones associated with the
     * current AWS account.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is false, this response includes the last hosted zone that is associated with the
     * current account. The <code>NextDNSName</code> element and <code>NextHostedZoneId</code> elements are omitted from
     * the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>NextDNSName</code> and <code>NextHostedZoneId</code> elements in the response contain the domain name
     * and the hosted zone ID of the next hosted zone that is associated with the current AWS account. If you want to
     * list more hosted zones, make another call to <code>ListHostedZonesByName</code>, and specify the value of
     * <code>NextDNSName</code> and <code>NextHostedZoneId</code> in the <code>dnsname</code> and
     * <code>hostedzoneid</code> parameters, respectively.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listHostedZonesByNameRequest
     *        Retrieves a list of the public and private hosted zones that are associated with the current AWS account
     *        in ASCII order by domain name.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListHostedZonesByName operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.ListHostedZonesByName
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListHostedZonesByName" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListHostedZonesByNameResult> listHostedZonesByNameAsync(ListHostedZonesByNameRequest listHostedZonesByNameRequest,
            com.amazonaws.handlers.AsyncHandler<ListHostedZonesByNameRequest, ListHostedZonesByNameResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListHostedZonesByName operation.
     *
     * @see #listHostedZonesByNameAsync(ListHostedZonesByNameRequest)
     */
    java.util.concurrent.Future<ListHostedZonesByNameResult> listHostedZonesByNameAsync();

    /**
     * Simplified method form for invoking the ListHostedZonesByName operation with an AsyncHandler.
     *
     * @see #listHostedZonesByNameAsync(ListHostedZonesByNameRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListHostedZonesByNameResult> listHostedZonesByNameAsync(
            com.amazonaws.handlers.AsyncHandler<ListHostedZonesByNameRequest, ListHostedZonesByNameResult> asyncHandler);

    /**
     * <p>
     * Lists the configurations for DNS query logging that are associated with the current AWS account or the
     * configuration that is associated with a specified hosted zone.
     * </p>
     * <p>
     * For more information about DNS query logs, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateQueryLoggingConfig.html"
     * >CreateQueryLoggingConfig</a>. Additional information, including the format of DNS query logs, appears in <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/query-logs.html">Logging DNS Queries</a> in the
     * <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * 
     * @param listQueryLoggingConfigsRequest
     * @return A Java Future containing the result of the ListQueryLoggingConfigs operation returned by the service.
     * @sample AmazonRoute53Async.ListQueryLoggingConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListQueryLoggingConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListQueryLoggingConfigsResult> listQueryLoggingConfigsAsync(ListQueryLoggingConfigsRequest listQueryLoggingConfigsRequest);

    /**
     * <p>
     * Lists the configurations for DNS query logging that are associated with the current AWS account or the
     * configuration that is associated with a specified hosted zone.
     * </p>
     * <p>
     * For more information about DNS query logs, see <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateQueryLoggingConfig.html"
     * >CreateQueryLoggingConfig</a>. Additional information, including the format of DNS query logs, appears in <a
     * href="https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/query-logs.html">Logging DNS Queries</a> in the
     * <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * 
     * @param listQueryLoggingConfigsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListQueryLoggingConfigs operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.ListQueryLoggingConfigs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListQueryLoggingConfigs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListQueryLoggingConfigsResult> listQueryLoggingConfigsAsync(ListQueryLoggingConfigsRequest listQueryLoggingConfigsRequest,
            com.amazonaws.handlers.AsyncHandler<ListQueryLoggingConfigsRequest, ListQueryLoggingConfigsResult> asyncHandler);

    /**
     * <p>
     * Lists the resource record sets in a specified hosted zone.
     * </p>
     * <p>
     * <code>ListResourceRecordSets</code> returns up to 100 resource record sets at a time in ASCII order, beginning at
     * a position specified by the <code>name</code> and <code>type</code> elements.
     * </p>
     * <p>
     * <b>Sort order</b>
     * </p>
     * <p>
     * <code>ListResourceRecordSets</code> sorts results first by DNS name with the labels reversed, for example:
     * </p>
     * <p>
     * <code>com.example.www.</code>
     * </p>
     * <p>
     * Note the trailing dot, which can change the sort order when the record name contains characters that appear
     * before <code>.</code> (decimal 46) in the ASCII table. These characters include the following:
     * <code>! " # $ % &amp; ' ( ) * + , -</code>
     * </p>
     * <p>
     * When multiple records have the same DNS name, <code>ListResourceRecordSets</code> sorts results by the record
     * type.
     * </p>
     * <p>
     * <b>Specifying where to start listing records</b>
     * </p>
     * <p>
     * You can use the name and type elements to specify the resource record set that the list begins with:
     * </p>
     * <dl>
     * <dt>If you do not specify Name or Type</dt>
     * <dd>
     * <p>
     * The results begin with the first resource record set that the hosted zone contains.
     * </p>
     * </dd>
     * <dt>If you specify Name but not Type</dt>
     * <dd>
     * <p>
     * The results begin with the first resource record set in the list whose name is greater than or equal to
     * <code>Name</code>.
     * </p>
     * </dd>
     * <dt>If you specify Type but not Name</dt>
     * <dd>
     * <p>
     * Amazon Route 53 returns the <code>InvalidInput</code> error.
     * </p>
     * </dd>
     * <dt>If you specify both Name and Type</dt>
     * <dd>
     * <p>
     * The results begin with the first resource record set in the list whose name is greater than or equal to
     * <code>Name</code>, and whose type is greater than or equal to <code>Type</code>.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Resource record sets that are PENDING</b>
     * </p>
     * <p>
     * This action returns the most current version of the records. This includes records that are <code>PENDING</code>,
     * and that are not yet available on all Route 53 DNS servers.
     * </p>
     * <p>
     * <b>Changing resource record sets</b>
     * </p>
     * <p>
     * To ensure that you get an accurate listing of the resource record sets for a hosted zone at a point in time, do
     * not submit a <code>ChangeResourceRecordSets</code> request while you're paging through the results of a
     * <code>ListResourceRecordSets</code> request. If you do, some pages may display results without the latest changes
     * while other pages display results with the latest changes.
     * </p>
     * <p>
     * <b>Displaying the next page of results</b>
     * </p>
     * <p>
     * If a <code>ListResourceRecordSets</code> command returns more than one page of results, the value of
     * <code>IsTruncated</code> is <code>true</code>. To display the next page of results, get the values of
     * <code>NextRecordName</code>, <code>NextRecordType</code>, and <code>NextRecordIdentifier</code> (if any) from the
     * response. Then submit another <code>ListResourceRecordSets</code> request, and specify those values for
     * <code>StartRecordName</code>, <code>StartRecordType</code>, and <code>StartRecordIdentifier</code>.
     * </p>
     * 
     * @param listResourceRecordSetsRequest
     *        A request for the resource record sets that are associated with a specified hosted zone.
     * @return A Java Future containing the result of the ListResourceRecordSets operation returned by the service.
     * @sample AmazonRoute53Async.ListResourceRecordSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListResourceRecordSets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListResourceRecordSetsResult> listResourceRecordSetsAsync(ListResourceRecordSetsRequest listResourceRecordSetsRequest);

    /**
     * <p>
     * Lists the resource record sets in a specified hosted zone.
     * </p>
     * <p>
     * <code>ListResourceRecordSets</code> returns up to 100 resource record sets at a time in ASCII order, beginning at
     * a position specified by the <code>name</code> and <code>type</code> elements.
     * </p>
     * <p>
     * <b>Sort order</b>
     * </p>
     * <p>
     * <code>ListResourceRecordSets</code> sorts results first by DNS name with the labels reversed, for example:
     * </p>
     * <p>
     * <code>com.example.www.</code>
     * </p>
     * <p>
     * Note the trailing dot, which can change the sort order when the record name contains characters that appear
     * before <code>.</code> (decimal 46) in the ASCII table. These characters include the following:
     * <code>! " # $ % &amp; ' ( ) * + , -</code>
     * </p>
     * <p>
     * When multiple records have the same DNS name, <code>ListResourceRecordSets</code> sorts results by the record
     * type.
     * </p>
     * <p>
     * <b>Specifying where to start listing records</b>
     * </p>
     * <p>
     * You can use the name and type elements to specify the resource record set that the list begins with:
     * </p>
     * <dl>
     * <dt>If you do not specify Name or Type</dt>
     * <dd>
     * <p>
     * The results begin with the first resource record set that the hosted zone contains.
     * </p>
     * </dd>
     * <dt>If you specify Name but not Type</dt>
     * <dd>
     * <p>
     * The results begin with the first resource record set in the list whose name is greater than or equal to
     * <code>Name</code>.
     * </p>
     * </dd>
     * <dt>If you specify Type but not Name</dt>
     * <dd>
     * <p>
     * Amazon Route 53 returns the <code>InvalidInput</code> error.
     * </p>
     * </dd>
     * <dt>If you specify both Name and Type</dt>
     * <dd>
     * <p>
     * The results begin with the first resource record set in the list whose name is greater than or equal to
     * <code>Name</code>, and whose type is greater than or equal to <code>Type</code>.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Resource record sets that are PENDING</b>
     * </p>
     * <p>
     * This action returns the most current version of the records. This includes records that are <code>PENDING</code>,
     * and that are not yet available on all Route 53 DNS servers.
     * </p>
     * <p>
     * <b>Changing resource record sets</b>
     * </p>
     * <p>
     * To ensure that you get an accurate listing of the resource record sets for a hosted zone at a point in time, do
     * not submit a <code>ChangeResourceRecordSets</code> request while you're paging through the results of a
     * <code>ListResourceRecordSets</code> request. If you do, some pages may display results without the latest changes
     * while other pages display results with the latest changes.
     * </p>
     * <p>
     * <b>Displaying the next page of results</b>
     * </p>
     * <p>
     * If a <code>ListResourceRecordSets</code> command returns more than one page of results, the value of
     * <code>IsTruncated</code> is <code>true</code>. To display the next page of results, get the values of
     * <code>NextRecordName</code>, <code>NextRecordType</code>, and <code>NextRecordIdentifier</code> (if any) from the
     * response. Then submit another <code>ListResourceRecordSets</code> request, and specify those values for
     * <code>StartRecordName</code>, <code>StartRecordType</code>, and <code>StartRecordIdentifier</code>.
     * </p>
     * 
     * @param listResourceRecordSetsRequest
     *        A request for the resource record sets that are associated with a specified hosted zone.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResourceRecordSets operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.ListResourceRecordSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListResourceRecordSets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListResourceRecordSetsResult> listResourceRecordSetsAsync(ListResourceRecordSetsRequest listResourceRecordSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListResourceRecordSetsRequest, ListResourceRecordSetsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of the reusable delegation sets that are associated with the current AWS account.
     * </p>
     * 
     * @param listReusableDelegationSetsRequest
     *        A request to get a list of the reusable delegation sets that are associated with the current AWS account.
     * @return A Java Future containing the result of the ListReusableDelegationSets operation returned by the service.
     * @sample AmazonRoute53Async.ListReusableDelegationSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListReusableDelegationSets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListReusableDelegationSetsResult> listReusableDelegationSetsAsync(
            ListReusableDelegationSetsRequest listReusableDelegationSetsRequest);

    /**
     * <p>
     * Retrieves a list of the reusable delegation sets that are associated with the current AWS account.
     * </p>
     * 
     * @param listReusableDelegationSetsRequest
     *        A request to get a list of the reusable delegation sets that are associated with the current AWS account.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListReusableDelegationSets operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.ListReusableDelegationSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListReusableDelegationSets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListReusableDelegationSetsResult> listReusableDelegationSetsAsync(
            ListReusableDelegationSetsRequest listReusableDelegationSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListReusableDelegationSetsRequest, ListReusableDelegationSetsResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListReusableDelegationSets operation.
     *
     * @see #listReusableDelegationSetsAsync(ListReusableDelegationSetsRequest)
     */
    java.util.concurrent.Future<ListReusableDelegationSetsResult> listReusableDelegationSetsAsync();

    /**
     * Simplified method form for invoking the ListReusableDelegationSets operation with an AsyncHandler.
     *
     * @see #listReusableDelegationSetsAsync(ListReusableDelegationSetsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListReusableDelegationSetsResult> listReusableDelegationSetsAsync(
            com.amazonaws.handlers.AsyncHandler<ListReusableDelegationSetsRequest, ListReusableDelegationSetsResult> asyncHandler);

    /**
     * <p>
     * Lists tags for one health check or hosted zone.
     * </p>
     * <p>
     * For information about using tags for cost allocation, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Using Cost Allocation
     * Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        A complex type containing information about a request for a list of the tags that are associated with an
     *        individual resource.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonRoute53Async.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists tags for one health check or hosted zone.
     * </p>
     * <p>
     * For information about using tags for cost allocation, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Using Cost Allocation
     * Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        A complex type containing information about a request for a list of the tags that are associated with an
     *        individual resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Lists tags for up to 10 health checks or hosted zones.
     * </p>
     * <p>
     * For information about using tags for cost allocation, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Using Cost Allocation
     * Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param listTagsForResourcesRequest
     *        A complex type that contains information about the health checks or hosted zones for which you want to
     *        list tags.
     * @return A Java Future containing the result of the ListTagsForResources operation returned by the service.
     * @sample AmazonRoute53Async.ListTagsForResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListTagsForResources" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourcesResult> listTagsForResourcesAsync(ListTagsForResourcesRequest listTagsForResourcesRequest);

    /**
     * <p>
     * Lists tags for up to 10 health checks or hosted zones.
     * </p>
     * <p>
     * For information about using tags for cost allocation, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Using Cost Allocation
     * Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param listTagsForResourcesRequest
     *        A complex type that contains information about the health checks or hosted zones for which you want to
     *        list tags.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResources operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.ListTagsForResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListTagsForResources" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourcesResult> listTagsForResourcesAsync(ListTagsForResourcesRequest listTagsForResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourcesRequest, ListTagsForResourcesResult> asyncHandler);

    /**
     * <p>
     * Gets information about the latest version for every traffic policy that is associated with the current AWS
     * account. Policies are listed in the order that they were created in.
     * </p>
     * 
     * @param listTrafficPoliciesRequest
     *        A complex type that contains the information about the request to list the traffic policies that are
     *        associated with the current AWS account.
     * @return A Java Future containing the result of the ListTrafficPolicies operation returned by the service.
     * @sample AmazonRoute53Async.ListTrafficPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListTrafficPolicies" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTrafficPoliciesResult> listTrafficPoliciesAsync(ListTrafficPoliciesRequest listTrafficPoliciesRequest);

    /**
     * <p>
     * Gets information about the latest version for every traffic policy that is associated with the current AWS
     * account. Policies are listed in the order that they were created in.
     * </p>
     * 
     * @param listTrafficPoliciesRequest
     *        A complex type that contains the information about the request to list the traffic policies that are
     *        associated with the current AWS account.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTrafficPolicies operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.ListTrafficPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListTrafficPolicies" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTrafficPoliciesResult> listTrafficPoliciesAsync(ListTrafficPoliciesRequest listTrafficPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTrafficPoliciesRequest, ListTrafficPoliciesResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListTrafficPolicies operation.
     *
     * @see #listTrafficPoliciesAsync(ListTrafficPoliciesRequest)
     */
    java.util.concurrent.Future<ListTrafficPoliciesResult> listTrafficPoliciesAsync();

    /**
     * Simplified method form for invoking the ListTrafficPolicies operation with an AsyncHandler.
     *
     * @see #listTrafficPoliciesAsync(ListTrafficPoliciesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListTrafficPoliciesResult> listTrafficPoliciesAsync(
            com.amazonaws.handlers.AsyncHandler<ListTrafficPoliciesRequest, ListTrafficPoliciesResult> asyncHandler);

    /**
     * <p>
     * Gets information about the traffic policy instances that you created by using the current AWS account.
     * </p>
     * <note>
     * <p>
     * After you submit an <code>UpdateTrafficPolicyInstance</code> request, there's a brief delay while Amazon Route 53
     * creates the resource record sets that are specified in the traffic policy definition. For more information, see
     * the <code>State</code> response element.
     * </p>
     * </note>
     * <p>
     * Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policy instances, you can
     * use the <code>MaxItems</code> parameter to list them in groups of up to 100.
     * </p>
     * 
     * @param listTrafficPolicyInstancesRequest
     *        A request to get information about the traffic policy instances that you created by using the current AWS
     *        account.
     * @return A Java Future containing the result of the ListTrafficPolicyInstances operation returned by the service.
     * @sample AmazonRoute53Async.ListTrafficPolicyInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListTrafficPolicyInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTrafficPolicyInstancesResult> listTrafficPolicyInstancesAsync(
            ListTrafficPolicyInstancesRequest listTrafficPolicyInstancesRequest);

    /**
     * <p>
     * Gets information about the traffic policy instances that you created by using the current AWS account.
     * </p>
     * <note>
     * <p>
     * After you submit an <code>UpdateTrafficPolicyInstance</code> request, there's a brief delay while Amazon Route 53
     * creates the resource record sets that are specified in the traffic policy definition. For more information, see
     * the <code>State</code> response element.
     * </p>
     * </note>
     * <p>
     * Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policy instances, you can
     * use the <code>MaxItems</code> parameter to list them in groups of up to 100.
     * </p>
     * 
     * @param listTrafficPolicyInstancesRequest
     *        A request to get information about the traffic policy instances that you created by using the current AWS
     *        account.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTrafficPolicyInstances operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.ListTrafficPolicyInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListTrafficPolicyInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTrafficPolicyInstancesResult> listTrafficPolicyInstancesAsync(
            ListTrafficPolicyInstancesRequest listTrafficPolicyInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTrafficPolicyInstancesRequest, ListTrafficPolicyInstancesResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListTrafficPolicyInstances operation.
     *
     * @see #listTrafficPolicyInstancesAsync(ListTrafficPolicyInstancesRequest)
     */
    java.util.concurrent.Future<ListTrafficPolicyInstancesResult> listTrafficPolicyInstancesAsync();

    /**
     * Simplified method form for invoking the ListTrafficPolicyInstances operation with an AsyncHandler.
     *
     * @see #listTrafficPolicyInstancesAsync(ListTrafficPolicyInstancesRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListTrafficPolicyInstancesResult> listTrafficPolicyInstancesAsync(
            com.amazonaws.handlers.AsyncHandler<ListTrafficPolicyInstancesRequest, ListTrafficPolicyInstancesResult> asyncHandler);

    /**
     * <p>
     * Gets information about the traffic policy instances that you created in a specified hosted zone.
     * </p>
     * <note>
     * <p>
     * After you submit a <code>CreateTrafficPolicyInstance</code> or an <code>UpdateTrafficPolicyInstance</code>
     * request, there's a brief delay while Amazon Route 53 creates the resource record sets that are specified in the
     * traffic policy definition. For more information, see the <code>State</code> response element.
     * </p>
     * </note>
     * <p>
     * Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policy instances, you can
     * use the <code>MaxItems</code> parameter to list them in groups of up to 100.
     * </p>
     * 
     * @param listTrafficPolicyInstancesByHostedZoneRequest
     *        A request for the traffic policy instances that you created in a specified hosted zone.
     * @return A Java Future containing the result of the ListTrafficPolicyInstancesByHostedZone operation returned by
     *         the service.
     * @sample AmazonRoute53Async.ListTrafficPolicyInstancesByHostedZone
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListTrafficPolicyInstancesByHostedZone"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTrafficPolicyInstancesByHostedZoneResult> listTrafficPolicyInstancesByHostedZoneAsync(
            ListTrafficPolicyInstancesByHostedZoneRequest listTrafficPolicyInstancesByHostedZoneRequest);

    /**
     * <p>
     * Gets information about the traffic policy instances that you created in a specified hosted zone.
     * </p>
     * <note>
     * <p>
     * After you submit a <code>CreateTrafficPolicyInstance</code> or an <code>UpdateTrafficPolicyInstance</code>
     * request, there's a brief delay while Amazon Route 53 creates the resource record sets that are specified in the
     * traffic policy definition. For more information, see the <code>State</code> response element.
     * </p>
     * </note>
     * <p>
     * Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policy instances, you can
     * use the <code>MaxItems</code> parameter to list them in groups of up to 100.
     * </p>
     * 
     * @param listTrafficPolicyInstancesByHostedZoneRequest
     *        A request for the traffic policy instances that you created in a specified hosted zone.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTrafficPolicyInstancesByHostedZone operation returned by
     *         the service.
     * @sample AmazonRoute53AsyncHandler.ListTrafficPolicyInstancesByHostedZone
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListTrafficPolicyInstancesByHostedZone"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTrafficPolicyInstancesByHostedZoneResult> listTrafficPolicyInstancesByHostedZoneAsync(
            ListTrafficPolicyInstancesByHostedZoneRequest listTrafficPolicyInstancesByHostedZoneRequest,
            com.amazonaws.handlers.AsyncHandler<ListTrafficPolicyInstancesByHostedZoneRequest, ListTrafficPolicyInstancesByHostedZoneResult> asyncHandler);

    /**
     * <p>
     * Gets information about the traffic policy instances that you created by using a specify traffic policy version.
     * </p>
     * <note>
     * <p>
     * After you submit a <code>CreateTrafficPolicyInstance</code> or an <code>UpdateTrafficPolicyInstance</code>
     * request, there's a brief delay while Amazon Route 53 creates the resource record sets that are specified in the
     * traffic policy definition. For more information, see the <code>State</code> response element.
     * </p>
     * </note>
     * <p>
     * Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policy instances, you can
     * use the <code>MaxItems</code> parameter to list them in groups of up to 100.
     * </p>
     * 
     * @param listTrafficPolicyInstancesByPolicyRequest
     *        A complex type that contains the information about the request to list your traffic policy instances.
     * @return A Java Future containing the result of the ListTrafficPolicyInstancesByPolicy operation returned by the
     *         service.
     * @sample AmazonRoute53Async.ListTrafficPolicyInstancesByPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListTrafficPolicyInstancesByPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTrafficPolicyInstancesByPolicyResult> listTrafficPolicyInstancesByPolicyAsync(
            ListTrafficPolicyInstancesByPolicyRequest listTrafficPolicyInstancesByPolicyRequest);

    /**
     * <p>
     * Gets information about the traffic policy instances that you created by using a specify traffic policy version.
     * </p>
     * <note>
     * <p>
     * After you submit a <code>CreateTrafficPolicyInstance</code> or an <code>UpdateTrafficPolicyInstance</code>
     * request, there's a brief delay while Amazon Route 53 creates the resource record sets that are specified in the
     * traffic policy definition. For more information, see the <code>State</code> response element.
     * </p>
     * </note>
     * <p>
     * Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policy instances, you can
     * use the <code>MaxItems</code> parameter to list them in groups of up to 100.
     * </p>
     * 
     * @param listTrafficPolicyInstancesByPolicyRequest
     *        A complex type that contains the information about the request to list your traffic policy instances.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTrafficPolicyInstancesByPolicy operation returned by the
     *         service.
     * @sample AmazonRoute53AsyncHandler.ListTrafficPolicyInstancesByPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListTrafficPolicyInstancesByPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTrafficPolicyInstancesByPolicyResult> listTrafficPolicyInstancesByPolicyAsync(
            ListTrafficPolicyInstancesByPolicyRequest listTrafficPolicyInstancesByPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<ListTrafficPolicyInstancesByPolicyRequest, ListTrafficPolicyInstancesByPolicyResult> asyncHandler);

    /**
     * <p>
     * Gets information about all of the versions for a specified traffic policy.
     * </p>
     * <p>
     * Traffic policy versions are listed in numerical order by <code>VersionNumber</code>.
     * </p>
     * 
     * @param listTrafficPolicyVersionsRequest
     *        A complex type that contains the information about the request to list your traffic policies.
     * @return A Java Future containing the result of the ListTrafficPolicyVersions operation returned by the service.
     * @sample AmazonRoute53Async.ListTrafficPolicyVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListTrafficPolicyVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTrafficPolicyVersionsResult> listTrafficPolicyVersionsAsync(
            ListTrafficPolicyVersionsRequest listTrafficPolicyVersionsRequest);

    /**
     * <p>
     * Gets information about all of the versions for a specified traffic policy.
     * </p>
     * <p>
     * Traffic policy versions are listed in numerical order by <code>VersionNumber</code>.
     * </p>
     * 
     * @param listTrafficPolicyVersionsRequest
     *        A complex type that contains the information about the request to list your traffic policies.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTrafficPolicyVersions operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.ListTrafficPolicyVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListTrafficPolicyVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTrafficPolicyVersionsResult> listTrafficPolicyVersionsAsync(
            ListTrafficPolicyVersionsRequest listTrafficPolicyVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTrafficPolicyVersionsRequest, ListTrafficPolicyVersionsResult> asyncHandler);

    /**
     * <p>
     * Gets a list of the VPCs that were created by other accounts and that can be associated with a specified hosted
     * zone because you've submitted one or more <code>CreateVPCAssociationAuthorization</code> requests.
     * </p>
     * <p>
     * The response includes a <code>VPCs</code> element with a <code>VPC</code> child element for each VPC that can be
     * associated with the hosted zone.
     * </p>
     * 
     * @param listVPCAssociationAuthorizationsRequest
     *        A complex type that contains information about that can be associated with your hosted zone.
     * @return A Java Future containing the result of the ListVPCAssociationAuthorizations operation returned by the
     *         service.
     * @sample AmazonRoute53Async.ListVPCAssociationAuthorizations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListVPCAssociationAuthorizations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListVPCAssociationAuthorizationsResult> listVPCAssociationAuthorizationsAsync(
            ListVPCAssociationAuthorizationsRequest listVPCAssociationAuthorizationsRequest);

    /**
     * <p>
     * Gets a list of the VPCs that were created by other accounts and that can be associated with a specified hosted
     * zone because you've submitted one or more <code>CreateVPCAssociationAuthorization</code> requests.
     * </p>
     * <p>
     * The response includes a <code>VPCs</code> element with a <code>VPC</code> child element for each VPC that can be
     * associated with the hosted zone.
     * </p>
     * 
     * @param listVPCAssociationAuthorizationsRequest
     *        A complex type that contains information about that can be associated with your hosted zone.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListVPCAssociationAuthorizations operation returned by the
     *         service.
     * @sample AmazonRoute53AsyncHandler.ListVPCAssociationAuthorizations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListVPCAssociationAuthorizations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListVPCAssociationAuthorizationsResult> listVPCAssociationAuthorizationsAsync(
            ListVPCAssociationAuthorizationsRequest listVPCAssociationAuthorizationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListVPCAssociationAuthorizationsRequest, ListVPCAssociationAuthorizationsResult> asyncHandler);

    /**
     * <p>
     * Gets the value that Amazon Route 53 returns in response to a DNS request for a specified record name and type.
     * You can optionally specify the IP address of a DNS resolver, an EDNS0 client subnet IP address, and a subnet
     * mask.
     * </p>
     * 
     * @param testDNSAnswerRequest
     *        Gets the value that Amazon Route 53 returns in response to a DNS request for a specified record name and
     *        type. You can optionally specify the IP address of a DNS resolver, an EDNS0 client subnet IP address, and
     *        a subnet mask.
     * @return A Java Future containing the result of the TestDNSAnswer operation returned by the service.
     * @sample AmazonRoute53Async.TestDNSAnswer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/TestDNSAnswer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TestDNSAnswerResult> testDNSAnswerAsync(TestDNSAnswerRequest testDNSAnswerRequest);

    /**
     * <p>
     * Gets the value that Amazon Route 53 returns in response to a DNS request for a specified record name and type.
     * You can optionally specify the IP address of a DNS resolver, an EDNS0 client subnet IP address, and a subnet
     * mask.
     * </p>
     * 
     * @param testDNSAnswerRequest
     *        Gets the value that Amazon Route 53 returns in response to a DNS request for a specified record name and
     *        type. You can optionally specify the IP address of a DNS resolver, an EDNS0 client subnet IP address, and
     *        a subnet mask.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TestDNSAnswer operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.TestDNSAnswer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/TestDNSAnswer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TestDNSAnswerResult> testDNSAnswerAsync(TestDNSAnswerRequest testDNSAnswerRequest,
            com.amazonaws.handlers.AsyncHandler<TestDNSAnswerRequest, TestDNSAnswerResult> asyncHandler);

    /**
     * <p>
     * Updates an existing health check. Note that some values can't be updated.
     * </p>
     * <p>
     * For more information about updating health checks, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/health-checks-creating-deleting.html">Creating,
     * Updating, and Deleting Health Checks</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * 
     * @param updateHealthCheckRequest
     *        A complex type that contains information about a request to update a health check.
     * @return A Java Future containing the result of the UpdateHealthCheck operation returned by the service.
     * @sample AmazonRoute53Async.UpdateHealthCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/UpdateHealthCheck" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateHealthCheckResult> updateHealthCheckAsync(UpdateHealthCheckRequest updateHealthCheckRequest);

    /**
     * <p>
     * Updates an existing health check. Note that some values can't be updated.
     * </p>
     * <p>
     * For more information about updating health checks, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/health-checks-creating-deleting.html">Creating,
     * Updating, and Deleting Health Checks</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * 
     * @param updateHealthCheckRequest
     *        A complex type that contains information about a request to update a health check.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateHealthCheck operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.UpdateHealthCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/UpdateHealthCheck" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateHealthCheckResult> updateHealthCheckAsync(UpdateHealthCheckRequest updateHealthCheckRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateHealthCheckRequest, UpdateHealthCheckResult> asyncHandler);

    /**
     * <p>
     * Updates the comment for a specified hosted zone.
     * </p>
     * 
     * @param updateHostedZoneCommentRequest
     *        A request to update the comment for a hosted zone.
     * @return A Java Future containing the result of the UpdateHostedZoneComment operation returned by the service.
     * @sample AmazonRoute53Async.UpdateHostedZoneComment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/UpdateHostedZoneComment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateHostedZoneCommentResult> updateHostedZoneCommentAsync(UpdateHostedZoneCommentRequest updateHostedZoneCommentRequest);

    /**
     * <p>
     * Updates the comment for a specified hosted zone.
     * </p>
     * 
     * @param updateHostedZoneCommentRequest
     *        A request to update the comment for a hosted zone.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateHostedZoneComment operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.UpdateHostedZoneComment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/UpdateHostedZoneComment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateHostedZoneCommentResult> updateHostedZoneCommentAsync(UpdateHostedZoneCommentRequest updateHostedZoneCommentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateHostedZoneCommentRequest, UpdateHostedZoneCommentResult> asyncHandler);

    /**
     * <p>
     * Updates the comment for a specified traffic policy version.
     * </p>
     * 
     * @param updateTrafficPolicyCommentRequest
     *        A complex type that contains information about the traffic policy that you want to update the comment for.
     * @return A Java Future containing the result of the UpdateTrafficPolicyComment operation returned by the service.
     * @sample AmazonRoute53Async.UpdateTrafficPolicyComment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/UpdateTrafficPolicyComment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTrafficPolicyCommentResult> updateTrafficPolicyCommentAsync(
            UpdateTrafficPolicyCommentRequest updateTrafficPolicyCommentRequest);

    /**
     * <p>
     * Updates the comment for a specified traffic policy version.
     * </p>
     * 
     * @param updateTrafficPolicyCommentRequest
     *        A complex type that contains information about the traffic policy that you want to update the comment for.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTrafficPolicyComment operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.UpdateTrafficPolicyComment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/UpdateTrafficPolicyComment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTrafficPolicyCommentResult> updateTrafficPolicyCommentAsync(
            UpdateTrafficPolicyCommentRequest updateTrafficPolicyCommentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTrafficPolicyCommentRequest, UpdateTrafficPolicyCommentResult> asyncHandler);

    /**
     * <p>
     * Updates the resource record sets in a specified hosted zone that were created based on the settings in a
     * specified traffic policy version.
     * </p>
     * <p>
     * When you update a traffic policy instance, Amazon Route 53 continues to respond to DNS queries for the root
     * resource record set name (such as example.com) while it replaces one group of resource record sets with another.
     * Route 53 performs the following operations:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Route 53 creates a new group of resource record sets based on the specified traffic policy. This is true
     * regardless of how significant the differences are between the existing resource record sets and the new resource
     * record sets.
     * </p>
     * </li>
     * <li>
     * <p>
     * When all of the new resource record sets have been created, Route 53 starts to respond to DNS queries for the
     * root resource record set name (such as example.com) by using the new resource record sets.
     * </p>
     * </li>
     * <li>
     * <p>
     * Route 53 deletes the old group of resource record sets that are associated with the root resource record set
     * name.
     * </p>
     * </li>
     * </ol>
     * 
     * @param updateTrafficPolicyInstanceRequest
     *        A complex type that contains information about the resource record sets that you want to update based on a
     *        specified traffic policy instance.
     * @return A Java Future containing the result of the UpdateTrafficPolicyInstance operation returned by the service.
     * @sample AmazonRoute53Async.UpdateTrafficPolicyInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/UpdateTrafficPolicyInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTrafficPolicyInstanceResult> updateTrafficPolicyInstanceAsync(
            UpdateTrafficPolicyInstanceRequest updateTrafficPolicyInstanceRequest);

    /**
     * <p>
     * Updates the resource record sets in a specified hosted zone that were created based on the settings in a
     * specified traffic policy version.
     * </p>
     * <p>
     * When you update a traffic policy instance, Amazon Route 53 continues to respond to DNS queries for the root
     * resource record set name (such as example.com) while it replaces one group of resource record sets with another.
     * Route 53 performs the following operations:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Route 53 creates a new group of resource record sets based on the specified traffic policy. This is true
     * regardless of how significant the differences are between the existing resource record sets and the new resource
     * record sets.
     * </p>
     * </li>
     * <li>
     * <p>
     * When all of the new resource record sets have been created, Route 53 starts to respond to DNS queries for the
     * root resource record set name (such as example.com) by using the new resource record sets.
     * </p>
     * </li>
     * <li>
     * <p>
     * Route 53 deletes the old group of resource record sets that are associated with the root resource record set
     * name.
     * </p>
     * </li>
     * </ol>
     * 
     * @param updateTrafficPolicyInstanceRequest
     *        A complex type that contains information about the resource record sets that you want to update based on a
     *        specified traffic policy instance.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTrafficPolicyInstance operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.UpdateTrafficPolicyInstance
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/UpdateTrafficPolicyInstance"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateTrafficPolicyInstanceResult> updateTrafficPolicyInstanceAsync(
            UpdateTrafficPolicyInstanceRequest updateTrafficPolicyInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTrafficPolicyInstanceRequest, UpdateTrafficPolicyInstanceResult> asyncHandler);

}
