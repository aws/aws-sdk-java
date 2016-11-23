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
package com.amazonaws.services.route53;

import com.amazonaws.services.route53.model.*;

/**
 * Interface for accessing Route 53 asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.route53.AbstractAmazonRoute53Async} instead.
 * </p>
 */
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
     * </important>
     * <p>
     * Send a <code>POST</code> request to the <code>/2013-04-01/hostedzone/<i>hosted zone ID</i>/associatevpc</code>
     * resource. The request body must include a document with an <code>AssociateVPCWithHostedZoneRequest</code>
     * element. The response contains a <code>ChangeInfo</code> data type that you can use to track the progress of the
     * request.
     * </p>
     * <note>
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
     * </important>
     * <p>
     * Send a <code>POST</code> request to the <code>/2013-04-01/hostedzone/<i>hosted zone ID</i>/associatevpc</code>
     * resource. The request body must include a document with an <code>AssociateVPCWithHostedZoneRequest</code>
     * element. The response contains a <code>ChangeInfo</code> data type that you can use to track the progress of the
     * request.
     * </p>
     * <note>
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
     */
    java.util.concurrent.Future<AssociateVPCWithHostedZoneResult> associateVPCWithHostedZoneAsync(
            AssociateVPCWithHostedZoneRequest associateVPCWithHostedZoneRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateVPCWithHostedZoneRequest, AssociateVPCWithHostedZoneResult> asyncHandler);

    /**
     * <p>
     * Create, change, update, or delete authoritative DNS information on all Amazon Route 53 servers. Send a
     * <code>POST</code> request to:
     * </p>
     * <p>
     * <code>/2013-04-01/hostedzone/<i>Amazon Route 53 hosted Zone ID</i>/rrset</code> resource.
     * </p>
     * <p>
     * The request body must include a document with a <code>ChangeResourceRecordSetsRequest</code> element. The request
     * body contains a list of change items, known as a change batch. Change batches are considered transactional
     * changes. When using the Amazon Route 53 API to change resource record sets, Amazon Route 53 either makes all or
     * none of the changes in a change batch request. This ensures that Amazon Route 53 never partially implements the
     * intended changes to the resource record sets in a hosted zone.
     * </p>
     * <p>
     * For example, a change batch request that deletes the <code>CNAME</code> record for www.example.com and creates an
     * alias resource record set for www.example.com. Amazon Route 53 deletes the first resource record set and creates
     * the second resource record set in a single operation. If either the <code>DELETE</code> or the
     * <code>CREATE</code> action fails, then both changes (plus any other changes in the batch) fail, and the original
     * <code>CNAME</code> record continues to exist.
     * </p>
     * <important>
     * <p>
     * Due to the nature of transactional changes, you can't delete the same resource record set more than once in a
     * single change batch. If you attempt to delete the same change batch more than once, Amazon Route 53 returns an
     * <code>InvalidChangeBatch</code> error.
     * </p>
     * </important> <note>
     * <p>
     * To create resource record sets for complex routing configurations, use either the traffic flow visual editor in
     * the Amazon Route 53 console or the API actions for traffic policies and traffic policy instances. Save the
     * configuration as a traffic policy, then associate the traffic policy with one or more domain names (such as
     * example.com) or subdomain names (such as www.example.com), in the same hosted zone or in multiple hosted zones.
     * You can roll back the updates if the new configuration isn't performing as expected. For more information, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/traffic-flow.html">Using Traffic Flow to Route DNS
     * Traffic</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </note>
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
     * exist, Amazon Route 53 updates it with the values in the request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The values that you need to include in the request depend on the type of resource record set that you're
     * creating, deleting, or updating:
     * </p>
     * <p>
     * <b>Basic resource record sets (excluding alias, failover, geolocation, latency, and weighted resource record
     * sets)</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Type</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TTL</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Failover, geolocation, latency, or weighted resource record sets (excluding alias resource record sets)</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Type</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TTL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SetIdentifier</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Alias resource record sets (including failover alias, geolocation alias, latency alias, and weighted alias
     * resource record sets)</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Type</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AliasTarget</code> (includes <code>DNSName</code>, <code>EvaluateTargetHealth</code>, and
     * <code>HostedZoneId</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SetIdentifier</code> (for failover, geolocation, latency, and weighted resource record sets)
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you submit a <code>ChangeResourceRecordSets</code> request, Amazon Route 53 propagates your changes to all
     * of the Amazon Route 53 authoritative DNS servers. While your changes are propagating, <code>GetChange</code>
     * returns a status of <code>PENDING</code>. When propagation is complete, <code>GetChange</code> returns a status
     * of <code>INSYNC</code>. Changes generally propagate to all Amazon Route 53 name servers in a few minutes. In rare
     * circumstances, propagation can take up to 30 minutes. For more information, see <a>GetChange</a>
     * </p>
     * <p>
     * For information about the limits on a <code>ChangeResourceRecordSets</code> request, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DNSLimitations.html">Limits</a> in the <i>Amazon
     * Route 53 Developer Guide</i>.
     * </p>
     * 
     * @param changeResourceRecordSetsRequest
     *        A complex type that contains change information for the resource record set.
     * @return A Java Future containing the result of the ChangeResourceRecordSets operation returned by the service.
     * @sample AmazonRoute53Async.ChangeResourceRecordSets
     */
    java.util.concurrent.Future<ChangeResourceRecordSetsResult> changeResourceRecordSetsAsync(ChangeResourceRecordSetsRequest changeResourceRecordSetsRequest);

    /**
     * <p>
     * Create, change, update, or delete authoritative DNS information on all Amazon Route 53 servers. Send a
     * <code>POST</code> request to:
     * </p>
     * <p>
     * <code>/2013-04-01/hostedzone/<i>Amazon Route 53 hosted Zone ID</i>/rrset</code> resource.
     * </p>
     * <p>
     * The request body must include a document with a <code>ChangeResourceRecordSetsRequest</code> element. The request
     * body contains a list of change items, known as a change batch. Change batches are considered transactional
     * changes. When using the Amazon Route 53 API to change resource record sets, Amazon Route 53 either makes all or
     * none of the changes in a change batch request. This ensures that Amazon Route 53 never partially implements the
     * intended changes to the resource record sets in a hosted zone.
     * </p>
     * <p>
     * For example, a change batch request that deletes the <code>CNAME</code> record for www.example.com and creates an
     * alias resource record set for www.example.com. Amazon Route 53 deletes the first resource record set and creates
     * the second resource record set in a single operation. If either the <code>DELETE</code> or the
     * <code>CREATE</code> action fails, then both changes (plus any other changes in the batch) fail, and the original
     * <code>CNAME</code> record continues to exist.
     * </p>
     * <important>
     * <p>
     * Due to the nature of transactional changes, you can't delete the same resource record set more than once in a
     * single change batch. If you attempt to delete the same change batch more than once, Amazon Route 53 returns an
     * <code>InvalidChangeBatch</code> error.
     * </p>
     * </important> <note>
     * <p>
     * To create resource record sets for complex routing configurations, use either the traffic flow visual editor in
     * the Amazon Route 53 console or the API actions for traffic policies and traffic policy instances. Save the
     * configuration as a traffic policy, then associate the traffic policy with one or more domain names (such as
     * example.com) or subdomain names (such as www.example.com), in the same hosted zone or in multiple hosted zones.
     * You can roll back the updates if the new configuration isn't performing as expected. For more information, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/traffic-flow.html">Using Traffic Flow to Route DNS
     * Traffic</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </note>
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
     * exist, Amazon Route 53 updates it with the values in the request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The values that you need to include in the request depend on the type of resource record set that you're
     * creating, deleting, or updating:
     * </p>
     * <p>
     * <b>Basic resource record sets (excluding alias, failover, geolocation, latency, and weighted resource record
     * sets)</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Type</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TTL</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Failover, geolocation, latency, or weighted resource record sets (excluding alias resource record sets)</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Type</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TTL</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SetIdentifier</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Alias resource record sets (including failover alias, geolocation alias, latency alias, and weighted alias
     * resource record sets)</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Type</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AliasTarget</code> (includes <code>DNSName</code>, <code>EvaluateTargetHealth</code>, and
     * <code>HostedZoneId</code>)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SetIdentifier</code> (for failover, geolocation, latency, and weighted resource record sets)
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you submit a <code>ChangeResourceRecordSets</code> request, Amazon Route 53 propagates your changes to all
     * of the Amazon Route 53 authoritative DNS servers. While your changes are propagating, <code>GetChange</code>
     * returns a status of <code>PENDING</code>. When propagation is complete, <code>GetChange</code> returns a status
     * of <code>INSYNC</code>. Changes generally propagate to all Amazon Route 53 name servers in a few minutes. In rare
     * circumstances, propagation can take up to 30 minutes. For more information, see <a>GetChange</a>
     * </p>
     * <p>
     * For information about the limits on a <code>ChangeResourceRecordSets</code> request, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DNSLimitations.html">Limits</a> in the <i>Amazon
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
     */
    java.util.concurrent.Future<ChangeResourceRecordSetsResult> changeResourceRecordSetsAsync(ChangeResourceRecordSetsRequest changeResourceRecordSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ChangeResourceRecordSetsRequest, ChangeResourceRecordSetsResult> asyncHandler);

    /**
     * <p>
     * Adds, edits, or deletes tags for a health check or a hosted zone.
     * </p>
     * <p>
     * For information about using tags for cost allocation, see <a
     * href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Using Cost Allocation
     * Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param changeTagsForResourceRequest
     *        A complex type that contains information about the tags that you want to add, edit, or delete.
     * @return A Java Future containing the result of the ChangeTagsForResource operation returned by the service.
     * @sample AmazonRoute53Async.ChangeTagsForResource
     */
    java.util.concurrent.Future<ChangeTagsForResourceResult> changeTagsForResourceAsync(ChangeTagsForResourceRequest changeTagsForResourceRequest);

    /**
     * <p>
     * Adds, edits, or deletes tags for a health check or a hosted zone.
     * </p>
     * <p>
     * For information about using tags for cost allocation, see <a
     * href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Using Cost Allocation
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
     */
    java.util.concurrent.Future<ChangeTagsForResourceResult> changeTagsForResourceAsync(ChangeTagsForResourceRequest changeTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ChangeTagsForResourceRequest, ChangeTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Creates a new health check.
     * </p>
     * <p>
     * To create a new health check, send a <code>POST</code> request to the <code>/2013-04-01/healthcheck</code>
     * resource. The request body must include a document with a <code>CreateHealthCheckRequest</code> element. The
     * response returns the <code>CreateHealthCheckResponse</code> element, containing the health check ID specified
     * when adding health check to a resource record set. For information about adding health checks to resource record
     * sets, see <a>ResourceRecordSet$HealthCheckId</a> in <a>ChangeResourceRecordSets</a>.
     * </p>
     * <p>
     * If you are registering EC2 instances with an Elastic Load Balancing (ELB) load balancer, do not create Amazon
     * Route 53 health checks for the EC2 instances. When you register an EC2 instance with a load balancer, you
     * configure settings for an ELB health check, which performs a similar function to an Amazon Route 53 health check.
     * </p>
     * <p>
     * You can associate health checks with failover resource record sets in a private hosted zone. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Route 53 health checkers are outside the VPC. To check the health of an endpoint within a VPC by IP
     * address, you must assign a public IP address to the instance in the VPC.
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
     */
    java.util.concurrent.Future<CreateHealthCheckResult> createHealthCheckAsync(CreateHealthCheckRequest createHealthCheckRequest);

    /**
     * <p>
     * Creates a new health check.
     * </p>
     * <p>
     * To create a new health check, send a <code>POST</code> request to the <code>/2013-04-01/healthcheck</code>
     * resource. The request body must include a document with a <code>CreateHealthCheckRequest</code> element. The
     * response returns the <code>CreateHealthCheckResponse</code> element, containing the health check ID specified
     * when adding health check to a resource record set. For information about adding health checks to resource record
     * sets, see <a>ResourceRecordSet$HealthCheckId</a> in <a>ChangeResourceRecordSets</a>.
     * </p>
     * <p>
     * If you are registering EC2 instances with an Elastic Load Balancing (ELB) load balancer, do not create Amazon
     * Route 53 health checks for the EC2 instances. When you register an EC2 instance with a load balancer, you
     * configure settings for an ELB health check, which performs a similar function to an Amazon Route 53 health check.
     * </p>
     * <p>
     * You can associate health checks with failover resource record sets in a private hosted zone. Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Amazon Route 53 health checkers are outside the VPC. To check the health of an endpoint within a VPC by IP
     * address, you must assign a public IP address to the instance in the VPC.
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
     */
    java.util.concurrent.Future<CreateHealthCheckResult> createHealthCheckAsync(CreateHealthCheckRequest createHealthCheckRequest,
            com.amazonaws.handlers.AsyncHandler<CreateHealthCheckRequest, CreateHealthCheckResult> asyncHandler);

    /**
     * <p>
     * Creates a new public hosted zone, used to specify how the Domain Name System (DNS) routes traffic on the Internet
     * for a domain, such as example.com, and its subdomains.
     * </p>
     * <important>
     * <p>
     * Public hosted zones can't be converted to a private hosted zone or vice versa. Instead, create a new hosted zone
     * with the same name and create new resource record sets.
     * </p>
     * </important>
     * <p>
     * Send a <code>POST</code> request to the <code>/2013-04-01/hostedzone</code> resource. The request body must
     * include a document with a <code>CreateHostedZoneRequest</code> element. The response returns the
     * <code>CreateHostedZoneResponse</code> element containing metadata about the hosted zone.
     * </p>
     * <p>
     * Fore more information about charges for hosted zones, see <a href="http://aws.amazon.com/route53/pricing/">Amazon
     * Route 53 Pricing</a>.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't create a hosted zone for a top-level domain (TLD).
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Route 53 automatically creates a default SOA record and four NS records for the zone. For more information
     * about SOA and NS records, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/SOA-NSrecords.html">NS and SOA Records that Amazon
     * Route 53 Creates for a Hosted Zone</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your domain is registered with a registrar other than Amazon Route 53, you must update the name servers with
     * your registrar to make Amazon Route 53 your DNS service. For more information, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/creating-migrating.html">Configuring Amazon Route
     * 53 as your DNS Service</a> in the <i>Amazon Route 53 Developer's Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * After creating a zone, its initial status is <code>PENDING</code>. This means that it is not yet available on all
     * DNS servers. The status of the zone changes to <code>INSYNC</code> when the NS and SOA records are available on
     * all Amazon Route 53 DNS servers.
     * </p>
     * <p>
     * When trying to create a hosted zone using a reusable delegation set, specify an optional DelegationSetId, and
     * Amazon Route 53 would assign those 4 NS records for the zone, instead of allotting a new one.
     * </p>
     * 
     * @param createHostedZoneRequest
     *        A complex type containing the hosted zone request information.
     * @return A Java Future containing the result of the CreateHostedZone operation returned by the service.
     * @sample AmazonRoute53Async.CreateHostedZone
     */
    java.util.concurrent.Future<CreateHostedZoneResult> createHostedZoneAsync(CreateHostedZoneRequest createHostedZoneRequest);

    /**
     * <p>
     * Creates a new public hosted zone, used to specify how the Domain Name System (DNS) routes traffic on the Internet
     * for a domain, such as example.com, and its subdomains.
     * </p>
     * <important>
     * <p>
     * Public hosted zones can't be converted to a private hosted zone or vice versa. Instead, create a new hosted zone
     * with the same name and create new resource record sets.
     * </p>
     * </important>
     * <p>
     * Send a <code>POST</code> request to the <code>/2013-04-01/hostedzone</code> resource. The request body must
     * include a document with a <code>CreateHostedZoneRequest</code> element. The response returns the
     * <code>CreateHostedZoneResponse</code> element containing metadata about the hosted zone.
     * </p>
     * <p>
     * Fore more information about charges for hosted zones, see <a href="http://aws.amazon.com/route53/pricing/">Amazon
     * Route 53 Pricing</a>.
     * </p>
     * <p>
     * Note the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can't create a hosted zone for a top-level domain (TLD).
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Route 53 automatically creates a default SOA record and four NS records for the zone. For more information
     * about SOA and NS records, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/SOA-NSrecords.html">NS and SOA Records that Amazon
     * Route 53 Creates for a Hosted Zone</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If your domain is registered with a registrar other than Amazon Route 53, you must update the name servers with
     * your registrar to make Amazon Route 53 your DNS service. For more information, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/creating-migrating.html">Configuring Amazon Route
     * 53 as your DNS Service</a> in the <i>Amazon Route 53 Developer's Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * After creating a zone, its initial status is <code>PENDING</code>. This means that it is not yet available on all
     * DNS servers. The status of the zone changes to <code>INSYNC</code> when the NS and SOA records are available on
     * all Amazon Route 53 DNS servers.
     * </p>
     * <p>
     * When trying to create a hosted zone using a reusable delegation set, specify an optional DelegationSetId, and
     * Amazon Route 53 would assign those 4 NS records for the zone, instead of allotting a new one.
     * </p>
     * 
     * @param createHostedZoneRequest
     *        A complex type containing the hosted zone request information.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateHostedZone operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.CreateHostedZone
     */
    java.util.concurrent.Future<CreateHostedZoneResult> createHostedZoneAsync(CreateHostedZoneRequest createHostedZoneRequest,
            com.amazonaws.handlers.AsyncHandler<CreateHostedZoneRequest, CreateHostedZoneResult> asyncHandler);

    /**
     * <p>
     * Creates a delegation set (a group of four name servers) that can be reused by multiple hosted zones. If a hosted
     * zoned ID is specified, <code>CreateReusableDelegationSet</code> marks the delegation set associated with that
     * zone as reusable
     * </p>
     * <p>
     * Send a <code>POST</code> request to the <code>/2013-04-01/delegationset</code> resource. The request body must
     * include a document with a <code>CreateReusableDelegationSetRequest</code> element.
     * </p>
     * <note>
     * <p>
     * A reusable delegation set can't be associated with a private hosted zone/
     * </p>
     * </note>
     * <p>
     * For more information, including a procedure on how to create and configure a reusable delegation set (also known
     * as white label name servers), see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/white-label-name-servers.html">Configuring White
     * Label Name Servers</a>.
     * </p>
     * 
     * @param createReusableDelegationSetRequest
     * @return A Java Future containing the result of the CreateReusableDelegationSet operation returned by the service.
     * @sample AmazonRoute53Async.CreateReusableDelegationSet
     */
    java.util.concurrent.Future<CreateReusableDelegationSetResult> createReusableDelegationSetAsync(
            CreateReusableDelegationSetRequest createReusableDelegationSetRequest);

    /**
     * <p>
     * Creates a delegation set (a group of four name servers) that can be reused by multiple hosted zones. If a hosted
     * zoned ID is specified, <code>CreateReusableDelegationSet</code> marks the delegation set associated with that
     * zone as reusable
     * </p>
     * <p>
     * Send a <code>POST</code> request to the <code>/2013-04-01/delegationset</code> resource. The request body must
     * include a document with a <code>CreateReusableDelegationSetRequest</code> element.
     * </p>
     * <note>
     * <p>
     * A reusable delegation set can't be associated with a private hosted zone/
     * </p>
     * </note>
     * <p>
     * For more information, including a procedure on how to create and configure a reusable delegation set (also known
     * as white label name servers), see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/white-label-name-servers.html">Configuring White
     * Label Name Servers</a>.
     * </p>
     * 
     * @param createReusableDelegationSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateReusableDelegationSet operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.CreateReusableDelegationSet
     */
    java.util.concurrent.Future<CreateReusableDelegationSetResult> createReusableDelegationSetAsync(
            CreateReusableDelegationSetRequest createReusableDelegationSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateReusableDelegationSetRequest, CreateReusableDelegationSetResult> asyncHandler);

    /**
     * <p>
     * Creates a traffic policy, which you use to create multiple DNS resource record sets for one domain name (such as
     * example.com) or one subdomain name (such as www.example.com).
     * </p>
     * <p>
     * Send a <code>POST</code> request to the <code>/2013-04-01/trafficpolicy</code> resource. The request body must
     * include a document with a <code>CreateTrafficPolicyRequest</code> element. The response includes the
     * <code>CreateTrafficPolicyResponse</code> element, which contains information about the new traffic policy.
     * </p>
     * 
     * @param createTrafficPolicyRequest
     *        A complex type that contains information about the traffic policy that you want to create.
     * @return A Java Future containing the result of the CreateTrafficPolicy operation returned by the service.
     * @sample AmazonRoute53Async.CreateTrafficPolicy
     */
    java.util.concurrent.Future<CreateTrafficPolicyResult> createTrafficPolicyAsync(CreateTrafficPolicyRequest createTrafficPolicyRequest);

    /**
     * <p>
     * Creates a traffic policy, which you use to create multiple DNS resource record sets for one domain name (such as
     * example.com) or one subdomain name (such as www.example.com).
     * </p>
     * <p>
     * Send a <code>POST</code> request to the <code>/2013-04-01/trafficpolicy</code> resource. The request body must
     * include a document with a <code>CreateTrafficPolicyRequest</code> element. The response includes the
     * <code>CreateTrafficPolicyResponse</code> element, which contains information about the new traffic policy.
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
     * <p>
     * Send a <code>POST</code> request to the <code>/2013-04-01/trafficpolicyinstance</code> resource. The request body
     * must include a document with a <code>CreateTrafficPolicyRequest</code> element. The response returns the
     * <code>CreateTrafficPolicyInstanceResponse</code> element, which contains information about the traffic policy
     * instance.
     * </p>
     * 
     * @param createTrafficPolicyInstanceRequest
     *        A complex type that contains information about the resource record sets that you want to create based on a
     *        specified traffic policy.
     * @return A Java Future containing the result of the CreateTrafficPolicyInstance operation returned by the service.
     * @sample AmazonRoute53Async.CreateTrafficPolicyInstance
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
     * <p>
     * Send a <code>POST</code> request to the <code>/2013-04-01/trafficpolicyinstance</code> resource. The request body
     * must include a document with a <code>CreateTrafficPolicyRequest</code> element. The response returns the
     * <code>CreateTrafficPolicyInstanceResponse</code> element, which contains information about the traffic policy
     * instance.
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
     * <p>
     * Send a <code>POST</code> request to the <code>/2013-04-01/trafficpolicy/</code> resource. The request body
     * includes a document with a <code>CreateTrafficPolicyVersionRequest</code> element. The response returns the
     * <code>CreateTrafficPolicyVersionResponse</code> element, which contains information about the new version of the
     * traffic policy.
     * </p>
     * 
     * @param createTrafficPolicyVersionRequest
     *        A complex type that contains information about the traffic policy for which you want to create a new
     *        version.
     * @return A Java Future containing the result of the CreateTrafficPolicyVersion operation returned by the service.
     * @sample AmazonRoute53Async.CreateTrafficPolicyVersion
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
     * <p>
     * Send a <code>POST</code> request to the <code>/2013-04-01/trafficpolicy/</code> resource. The request body
     * includes a document with a <code>CreateTrafficPolicyVersionRequest</code> element. The response returns the
     * <code>CreateTrafficPolicyVersionResponse</code> element, which contains information about the new version of the
     * traffic policy.
     * </p>
     * 
     * @param createTrafficPolicyVersionRequest
     *        A complex type that contains information about the traffic policy for which you want to create a new
     *        version.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTrafficPolicyVersion operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.CreateTrafficPolicyVersion
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
     * <p>
     * Send a <code>POST</code> request to the
     * <code>/2013-04-01/hostedzone/<i>hosted zone ID</i>/authorizevpcassociation</code> resource. The request body must
     * include a document with a <code>CreateVPCAssociationAuthorizationRequest</code> element. The response contains
     * information about the authorization.
     * </p>
     * 
     * @param createVPCAssociationAuthorizationRequest
     *        A complex type that contains information about the request to authorize associating a VPC with your
     *        private hosted zone. Authorization is only required when a private hosted zone and a VPC were created by
     *        using different accounts.
     * @return A Java Future containing the result of the CreateVPCAssociationAuthorization operation returned by the
     *         service.
     * @sample AmazonRoute53Async.CreateVPCAssociationAuthorization
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
     * <p>
     * Send a <code>POST</code> request to the
     * <code>/2013-04-01/hostedzone/<i>hosted zone ID</i>/authorizevpcassociation</code> resource. The request body must
     * include a document with a <code>CreateVPCAssociationAuthorizationRequest</code> element. The response contains
     * information about the authorization.
     * </p>
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
     */
    java.util.concurrent.Future<CreateVPCAssociationAuthorizationResult> createVPCAssociationAuthorizationAsync(
            CreateVPCAssociationAuthorizationRequest createVPCAssociationAuthorizationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVPCAssociationAuthorizationRequest, CreateVPCAssociationAuthorizationResult> asyncHandler);

    /**
     * <p>
     * Deletes a health check. Send a <code>DELETE</code> request to the
     * <code>/2013-04-01/healthcheck/<i>health check ID</i> </code> resource.
     * </p>
     * <important>
     * <p>
     * Amazon Route 53 does not prevent you from deleting a health check even if the health check is associated with one
     * or more resource record sets. If you delete a health check and you don't update the associated resource record
     * sets, the future status of the health check can't be predicted and may change. This will affect the routing of
     * DNS queries for your DNS failover configuration. For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/health-checks-creating-deleting.html#health-checks-deleting.html"
     * >Replacing and Deleting Health Checks</a> in the Amazon Route 53 Developer Guide.
     * </p>
     * </important>
     * 
     * @param deleteHealthCheckRequest
     *        This action deletes a health check. Send a <code>DELETE</code> request to the
     *        <code>/2013-04-01/DeleteHealthCheckRequest</code> resource.
     * @return A Java Future containing the result of the DeleteHealthCheck operation returned by the service.
     * @sample AmazonRoute53Async.DeleteHealthCheck
     */
    java.util.concurrent.Future<DeleteHealthCheckResult> deleteHealthCheckAsync(DeleteHealthCheckRequest deleteHealthCheckRequest);

    /**
     * <p>
     * Deletes a health check. Send a <code>DELETE</code> request to the
     * <code>/2013-04-01/healthcheck/<i>health check ID</i> </code> resource.
     * </p>
     * <important>
     * <p>
     * Amazon Route 53 does not prevent you from deleting a health check even if the health check is associated with one
     * or more resource record sets. If you delete a health check and you don't update the associated resource record
     * sets, the future status of the health check can't be predicted and may change. This will affect the routing of
     * DNS queries for your DNS failover configuration. For more information, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/health-checks-creating-deleting.html#health-checks-deleting.html"
     * >Replacing and Deleting Health Checks</a> in the Amazon Route 53 Developer Guide.
     * </p>
     * </important>
     * 
     * @param deleteHealthCheckRequest
     *        This action deletes a health check. Send a <code>DELETE</code> request to the
     *        <code>/2013-04-01/DeleteHealthCheckRequest</code> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteHealthCheck operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.DeleteHealthCheck
     */
    java.util.concurrent.Future<DeleteHealthCheckResult> deleteHealthCheckAsync(DeleteHealthCheckRequest deleteHealthCheckRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteHealthCheckRequest, DeleteHealthCheckResult> asyncHandler);

    /**
     * <p>
     * Deletes a hosted zone. Send a <code>DELETE</code> request to the
     * <code>/<i>Amazon Route 53 API version</i>/hostedzone/<i>hosted zone ID</i> </code> resource.
     * </p>
     * <important>
     * <p>
     * Delete a hosted zone only if there are no resource record sets other than the default SOA record and NS resource
     * record sets. If the hosted zone contains other resource record sets, delete them before deleting the hosted zone.
     * If you try to delete a hosted zone that contains other resource record sets, Amazon Route 53 denies your request
     * with a <code>HostedZoneNotEmpty</code> error. For information about deleting records from your hosted zone, see
     * <a>ChangeResourceRecordSets</a>.
     * </p>
     * </important>
     * 
     * @param deleteHostedZoneRequest
     *        A complex type that contains information about the hosted zone that you want to delete.
     * @return A Java Future containing the result of the DeleteHostedZone operation returned by the service.
     * @sample AmazonRoute53Async.DeleteHostedZone
     */
    java.util.concurrent.Future<DeleteHostedZoneResult> deleteHostedZoneAsync(DeleteHostedZoneRequest deleteHostedZoneRequest);

    /**
     * <p>
     * Deletes a hosted zone. Send a <code>DELETE</code> request to the
     * <code>/<i>Amazon Route 53 API version</i>/hostedzone/<i>hosted zone ID</i> </code> resource.
     * </p>
     * <important>
     * <p>
     * Delete a hosted zone only if there are no resource record sets other than the default SOA record and NS resource
     * record sets. If the hosted zone contains other resource record sets, delete them before deleting the hosted zone.
     * If you try to delete a hosted zone that contains other resource record sets, Amazon Route 53 denies your request
     * with a <code>HostedZoneNotEmpty</code> error. For information about deleting records from your hosted zone, see
     * <a>ChangeResourceRecordSets</a>.
     * </p>
     * </important>
     * 
     * @param deleteHostedZoneRequest
     *        A complex type that contains information about the hosted zone that you want to delete.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteHostedZone operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.DeleteHostedZone
     */
    java.util.concurrent.Future<DeleteHostedZoneResult> deleteHostedZoneAsync(DeleteHostedZoneRequest deleteHostedZoneRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteHostedZoneRequest, DeleteHostedZoneResult> asyncHandler);

    /**
     * <p>
     * Deletes a reusable delegation set. Send a <code>DELETE</code> request to the
     * <code>/2013-04-01/delegationset/<i>delegation set ID</i> </code> resource.
     * </p>
     * <important>
     * <p>
     * You can delete a reusable delegation set only if there are no associated hosted zones.
     * </p>
     * </important>
     * <p>
     * To verify that the reusable delegation set is not associated with any hosted zones, run the
     * <a>GetReusableDelegationSet</a> action and specify the ID of the reusable delegation set that you want to delete.
     * </p>
     * 
     * @param deleteReusableDelegationSetRequest
     *        A complex type containing the information for the delete request.
     * @return A Java Future containing the result of the DeleteReusableDelegationSet operation returned by the service.
     * @sample AmazonRoute53Async.DeleteReusableDelegationSet
     */
    java.util.concurrent.Future<DeleteReusableDelegationSetResult> deleteReusableDelegationSetAsync(
            DeleteReusableDelegationSetRequest deleteReusableDelegationSetRequest);

    /**
     * <p>
     * Deletes a reusable delegation set. Send a <code>DELETE</code> request to the
     * <code>/2013-04-01/delegationset/<i>delegation set ID</i> </code> resource.
     * </p>
     * <important>
     * <p>
     * You can delete a reusable delegation set only if there are no associated hosted zones.
     * </p>
     * </important>
     * <p>
     * To verify that the reusable delegation set is not associated with any hosted zones, run the
     * <a>GetReusableDelegationSet</a> action and specify the ID of the reusable delegation set that you want to delete.
     * </p>
     * 
     * @param deleteReusableDelegationSetRequest
     *        A complex type containing the information for the delete request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteReusableDelegationSet operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.DeleteReusableDelegationSet
     */
    java.util.concurrent.Future<DeleteReusableDelegationSetResult> deleteReusableDelegationSetAsync(
            DeleteReusableDelegationSetRequest deleteReusableDelegationSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteReusableDelegationSetRequest, DeleteReusableDelegationSetResult> asyncHandler);

    /**
     * <p>
     * Deletes a traffic policy.
     * </p>
     * <p>
     * Send a <code>DELETE</code> request to the <code>/<i>Amazon Route 53 API version</i>/trafficpolicy</code>
     * resource.
     * </p>
     * 
     * @param deleteTrafficPolicyRequest
     *        A request to delete a specified traffic policy version.
     * @return A Java Future containing the result of the DeleteTrafficPolicy operation returned by the service.
     * @sample AmazonRoute53Async.DeleteTrafficPolicy
     */
    java.util.concurrent.Future<DeleteTrafficPolicyResult> deleteTrafficPolicyAsync(DeleteTrafficPolicyRequest deleteTrafficPolicyRequest);

    /**
     * <p>
     * Deletes a traffic policy.
     * </p>
     * <p>
     * Send a <code>DELETE</code> request to the <code>/<i>Amazon Route 53 API version</i>/trafficpolicy</code>
     * resource.
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
     */
    java.util.concurrent.Future<DeleteTrafficPolicyResult> deleteTrafficPolicyAsync(DeleteTrafficPolicyRequest deleteTrafficPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTrafficPolicyRequest, DeleteTrafficPolicyResult> asyncHandler);

    /**
     * <p>
     * Deletes a traffic policy instance and all of the resource record sets that Amazon Route 53 created when you
     * created the instance.
     * </p>
     * <p>
     * Send a <code>DELETE</code> request to the
     * <code>/<i>Amazon Route 53 API version</i>/trafficpolicy/<i>traffic policy instance ID</i> </code> resource.
     * </p>
     * <note>
     * <p>
     * In the Amazon Route 53 console, traffic policy instances are known as policy records.
     * </p>
     * </note>
     * 
     * @param deleteTrafficPolicyInstanceRequest
     *        A complex type that contains information about the traffic policy instance that you want to delete.
     * @return A Java Future containing the result of the DeleteTrafficPolicyInstance operation returned by the service.
     * @sample AmazonRoute53Async.DeleteTrafficPolicyInstance
     */
    java.util.concurrent.Future<DeleteTrafficPolicyInstanceResult> deleteTrafficPolicyInstanceAsync(
            DeleteTrafficPolicyInstanceRequest deleteTrafficPolicyInstanceRequest);

    /**
     * <p>
     * Deletes a traffic policy instance and all of the resource record sets that Amazon Route 53 created when you
     * created the instance.
     * </p>
     * <p>
     * Send a <code>DELETE</code> request to the
     * <code>/<i>Amazon Route 53 API version</i>/trafficpolicy/<i>traffic policy instance ID</i> </code> resource.
     * </p>
     * <note>
     * <p>
     * In the Amazon Route 53 console, traffic policy instances are known as policy records.
     * </p>
     * </note>
     * 
     * @param deleteTrafficPolicyInstanceRequest
     *        A complex type that contains information about the traffic policy instance that you want to delete.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTrafficPolicyInstance operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.DeleteTrafficPolicyInstance
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
     * <p>
     * Send a <code>DELETE</code> request to the
     * <code>/2013-04-01/hostedzone/<i>hosted zone ID</i>/deauthorizevpcassociation</code> resource. The request body
     * must include a document with a <code>DeleteVPCAssociationAuthorizationRequest</code> element.
     * </p>
     * 
     * @param deleteVPCAssociationAuthorizationRequest
     *        A complex type that contains information about the request to remove authorization to associate a VPC that
     *        was created by one AWS account with a hosted zone that was created with a different AWS account.
     * @return A Java Future containing the result of the DeleteVPCAssociationAuthorization operation returned by the
     *         service.
     * @sample AmazonRoute53Async.DeleteVPCAssociationAuthorization
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
     * <p>
     * Send a <code>DELETE</code> request to the
     * <code>/2013-04-01/hostedzone/<i>hosted zone ID</i>/deauthorizevpcassociation</code> resource. The request body
     * must include a document with a <code>DeleteVPCAssociationAuthorizationRequest</code> element.
     * </p>
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
     */
    java.util.concurrent.Future<DeleteVPCAssociationAuthorizationResult> deleteVPCAssociationAuthorizationAsync(
            DeleteVPCAssociationAuthorizationRequest deleteVPCAssociationAuthorizationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVPCAssociationAuthorizationRequest, DeleteVPCAssociationAuthorizationResult> asyncHandler);

    /**
     * <p>
     * Disassociates a VPC from a Amazon Route 53 private hosted zone.
     * </p>
     * <note>
     * <p>
     * You can't disassociate the last VPC from a private hosted zone.
     * </p>
     * </note>
     * <p>
     * Send a <code>POST</code> request to the <code>/2013-04-01/hostedzone/<i>hosted zone ID</i>/disassociatevpc</code>
     * resource. The request body must include a document with a <code>DisassociateVPCFromHostedZoneRequest</code>
     * element. The response includes a <code>DisassociateVPCFromHostedZoneResponse</code> element.
     * </p>
     * <important>
     * <p>
     * You can't disassociate a VPC from a private hosted zone when only one VPC is associated with the hosted zone. You
     * also can't convert a private hosted zone into a public hosted zone.
     * </p>
     * </important>
     * 
     * @param disassociateVPCFromHostedZoneRequest
     *        A complex type that contains information about the VPC that you want to disassociate from a specified
     *        private hosted zone.
     * @return A Java Future containing the result of the DisassociateVPCFromHostedZone operation returned by the
     *         service.
     * @sample AmazonRoute53Async.DisassociateVPCFromHostedZone
     */
    java.util.concurrent.Future<DisassociateVPCFromHostedZoneResult> disassociateVPCFromHostedZoneAsync(
            DisassociateVPCFromHostedZoneRequest disassociateVPCFromHostedZoneRequest);

    /**
     * <p>
     * Disassociates a VPC from a Amazon Route 53 private hosted zone.
     * </p>
     * <note>
     * <p>
     * You can't disassociate the last VPC from a private hosted zone.
     * </p>
     * </note>
     * <p>
     * Send a <code>POST</code> request to the <code>/2013-04-01/hostedzone/<i>hosted zone ID</i>/disassociatevpc</code>
     * resource. The request body must include a document with a <code>DisassociateVPCFromHostedZoneRequest</code>
     * element. The response includes a <code>DisassociateVPCFromHostedZoneResponse</code> element.
     * </p>
     * <important>
     * <p>
     * You can't disassociate a VPC from a private hosted zone when only one VPC is associated with the hosted zone. You
     * also can't convert a private hosted zone into a public hosted zone.
     * </p>
     * </important>
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
     */
    java.util.concurrent.Future<DisassociateVPCFromHostedZoneResult> disassociateVPCFromHostedZoneAsync(
            DisassociateVPCFromHostedZoneRequest disassociateVPCFromHostedZoneRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateVPCFromHostedZoneRequest, DisassociateVPCFromHostedZoneResult> asyncHandler);

    /**
     * <p>
     * Returns the current status of a change batch request. The status is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> indicates that the changes in this request have not replicated to all Amazon Route 53 DNS
     * servers. This is the initial status of all change batch requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSYNC</code> indicates that the changes have replicated to all Amazon Route 53 DNS servers.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getChangeRequest
     *        The input for a GetChange request.
     * @return A Java Future containing the result of the GetChange operation returned by the service.
     * @sample AmazonRoute53Async.GetChange
     */
    java.util.concurrent.Future<GetChangeResult> getChangeAsync(GetChangeRequest getChangeRequest);

    /**
     * <p>
     * Returns the current status of a change batch request. The status is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> indicates that the changes in this request have not replicated to all Amazon Route 53 DNS
     * servers. This is the initial status of all change batch requests.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSYNC</code> indicates that the changes have replicated to all Amazon Route 53 DNS servers.
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
     */
    java.util.concurrent.Future<GetChangeResult> getChangeAsync(GetChangeRequest getChangeRequest,
            com.amazonaws.handlers.AsyncHandler<GetChangeRequest, GetChangeResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of the IP ranges used by Amazon Route 53 health checkers to check the health of your resources.
     * Send a <code>GET</code> request to the <code>/<i>Amazon Route 53 API version</i>/checkeripranges</code> resource.
     * Use these IP addresses to configure router and firewall rules to allow health checkers to check the health of
     * your resources.
     * </p>
     * 
     * @param getCheckerIpRangesRequest
     *        Empty request.
     * @return A Java Future containing the result of the GetCheckerIpRanges operation returned by the service.
     * @sample AmazonRoute53Async.GetCheckerIpRanges
     */
    java.util.concurrent.Future<GetCheckerIpRangesResult> getCheckerIpRangesAsync(GetCheckerIpRangesRequest getCheckerIpRangesRequest);

    /**
     * <p>
     * Retrieves a list of the IP ranges used by Amazon Route 53 health checkers to check the health of your resources.
     * Send a <code>GET</code> request to the <code>/<i>Amazon Route 53 API version</i>/checkeripranges</code> resource.
     * Use these IP addresses to configure router and firewall rules to allow health checkers to check the health of
     * your resources.
     * </p>
     * 
     * @param getCheckerIpRangesRequest
     *        Empty request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCheckerIpRanges operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.GetCheckerIpRanges
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
     * Retrieves a single geo location. Send a <code>GET</code> request to the <code>/2013-04-01/geolocation</code>
     * resource with one of these options: continentcode | countrycode | countrycode and subdivisioncode.
     * </p>
     * 
     * @param getGeoLocationRequest
     *        A complex type that contains information about the request to get a geo location.
     * @return A Java Future containing the result of the GetGeoLocation operation returned by the service.
     * @sample AmazonRoute53Async.GetGeoLocation
     */
    java.util.concurrent.Future<GetGeoLocationResult> getGeoLocationAsync(GetGeoLocationRequest getGeoLocationRequest);

    /**
     * <p>
     * Retrieves a single geo location. Send a <code>GET</code> request to the <code>/2013-04-01/geolocation</code>
     * resource with one of these options: continentcode | countrycode | countrycode and subdivisioncode.
     * </p>
     * 
     * @param getGeoLocationRequest
     *        A complex type that contains information about the request to get a geo location.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGeoLocation operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.GetGeoLocation
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
     * Gets information about a specified health check. Send a <code>GET</code> request to the
     * <code>/2013-04-01/healthcheck/<i>health check ID</i> </code> resource. For more information about using the
     * console to perform this operation, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html">Amazon Route 53 Health Checks
     * and DNS Failover</a> in the Amazon Route 53 Developer Guide.
     * </p>
     * 
     * @param getHealthCheckRequest
     *        This action gets information about a specified health check.</p>
     *        <p>
     *        Send a <code>GET</code> request to the
     *        <code>/<i>Amazon Route 53 API version</i>/gethealthcheckrequest</code> resource.
     *        </p>
     *        <p>
     *        For information about getting information about a health check using the Amazon Route 53 console, see <a
     *        href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html">Amazon Route 53 Health
     *        Checks and DNS Failover</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * @return A Java Future containing the result of the GetHealthCheck operation returned by the service.
     * @sample AmazonRoute53Async.GetHealthCheck
     */
    java.util.concurrent.Future<GetHealthCheckResult> getHealthCheckAsync(GetHealthCheckRequest getHealthCheckRequest);

    /**
     * <p>
     * Gets information about a specified health check. Send a <code>GET</code> request to the
     * <code>/2013-04-01/healthcheck/<i>health check ID</i> </code> resource. For more information about using the
     * console to perform this operation, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html">Amazon Route 53 Health Checks
     * and DNS Failover</a> in the Amazon Route 53 Developer Guide.
     * </p>
     * 
     * @param getHealthCheckRequest
     *        This action gets information about a specified health check.</p>
     *        <p>
     *        Send a <code>GET</code> request to the
     *        <code>/<i>Amazon Route 53 API version</i>/gethealthcheckrequest</code> resource.
     *        </p>
     *        <p>
     *        For information about getting information about a health check using the Amazon Route 53 console, see <a
     *        href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html">Amazon Route 53 Health
     *        Checks and DNS Failover</a> in the <i>Amazon Route 53 Developer Guide</i>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetHealthCheck operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.GetHealthCheck
     */
    java.util.concurrent.Future<GetHealthCheckResult> getHealthCheckAsync(GetHealthCheckRequest getHealthCheckRequest,
            com.amazonaws.handlers.AsyncHandler<GetHealthCheckRequest, GetHealthCheckResult> asyncHandler);

    /**
     * <p>
     * To retrieve a count of all your health checks, send a <code>GET</code> request to the
     * <code>/2013-04-01/healthcheckcount</code> resource.
     * </p>
     * 
     * @param getHealthCheckCountRequest
     *        To retrieve a count of all your health checks, send a <code>GET</code> request to the
     *        <code>/2013-04-01/healthcheckcount</code> resource.
     * @return A Java Future containing the result of the GetHealthCheckCount operation returned by the service.
     * @sample AmazonRoute53Async.GetHealthCheckCount
     */
    java.util.concurrent.Future<GetHealthCheckCountResult> getHealthCheckCountAsync(GetHealthCheckCountRequest getHealthCheckCountRequest);

    /**
     * <p>
     * To retrieve a count of all your health checks, send a <code>GET</code> request to the
     * <code>/2013-04-01/healthcheckcount</code> resource.
     * </p>
     * 
     * @param getHealthCheckCountRequest
     *        To retrieve a count of all your health checks, send a <code>GET</code> request to the
     *        <code>/2013-04-01/healthcheckcount</code> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetHealthCheckCount operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.GetHealthCheckCount
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
     * If you want to learn why a health check is currently failing or why it failed most recently (if at all), you can
     * get the failure reason for the most recent failure. Send a <code>GET</code> request to the
     * <code>/<i>Amazon Route 53 API version</i>/healthcheck/<i>health check ID</i>/lastfailurereason</code> resource.
     * </p>
     * 
     * @param getHealthCheckLastFailureReasonRequest
     *        This action gets the reason that a specified health check failed most recently.</p>
     *        <p>
     *        To get the reason for the last failure of a health check, send a GET request to the
     *        /2013-04-01/healthcheck/health check ID/lastfailurereason resource.
     *        </p>
     *        <p>
     *        For information about viewing the last failure reason for a health check using the Amazon Route 53
     *        console, see <a
     *        href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/health-checks-monitor-view-status.html"
     *        >Viewing Health Check Status and the Reason for Health Check Failures</a> in the <i>Amazon Route 53
     *        Developer Guide</i>.
     * @return A Java Future containing the result of the GetHealthCheckLastFailureReason operation returned by the
     *         service.
     * @sample AmazonRoute53Async.GetHealthCheckLastFailureReason
     */
    java.util.concurrent.Future<GetHealthCheckLastFailureReasonResult> getHealthCheckLastFailureReasonAsync(
            GetHealthCheckLastFailureReasonRequest getHealthCheckLastFailureReasonRequest);

    /**
     * <p>
     * If you want to learn why a health check is currently failing or why it failed most recently (if at all), you can
     * get the failure reason for the most recent failure. Send a <code>GET</code> request to the
     * <code>/<i>Amazon Route 53 API version</i>/healthcheck/<i>health check ID</i>/lastfailurereason</code> resource.
     * </p>
     * 
     * @param getHealthCheckLastFailureReasonRequest
     *        This action gets the reason that a specified health check failed most recently.</p>
     *        <p>
     *        To get the reason for the last failure of a health check, send a GET request to the
     *        /2013-04-01/healthcheck/health check ID/lastfailurereason resource.
     *        </p>
     *        <p>
     *        For information about viewing the last failure reason for a health check using the Amazon Route 53
     *        console, see <a
     *        href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/health-checks-monitor-view-status.html"
     *        >Viewing Health Check Status and the Reason for Health Check Failures</a> in the <i>Amazon Route 53
     *        Developer Guide</i>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetHealthCheckLastFailureReason operation returned by the
     *         service.
     * @sample AmazonRoute53AsyncHandler.GetHealthCheckLastFailureReason
     */
    java.util.concurrent.Future<GetHealthCheckLastFailureReasonResult> getHealthCheckLastFailureReasonAsync(
            GetHealthCheckLastFailureReasonRequest getHealthCheckLastFailureReasonRequest,
            com.amazonaws.handlers.AsyncHandler<GetHealthCheckLastFailureReasonRequest, GetHealthCheckLastFailureReasonResult> asyncHandler);

    /**
     * <p>
     * Gets status of a specified health check. Send a <code>GET</code> request to the
     * <code>/2013-04-01/healthcheck/<i>health check ID</i>/status</code> resource. You can use this call to get a
     * health check's current status.
     * </p>
     * 
     * @param getHealthCheckStatusRequest
     *        A complex type that contains information about the request to get health check status for a health check.
     * @return A Java Future containing the result of the GetHealthCheckStatus operation returned by the service.
     * @sample AmazonRoute53Async.GetHealthCheckStatus
     */
    java.util.concurrent.Future<GetHealthCheckStatusResult> getHealthCheckStatusAsync(GetHealthCheckStatusRequest getHealthCheckStatusRequest);

    /**
     * <p>
     * Gets status of a specified health check. Send a <code>GET</code> request to the
     * <code>/2013-04-01/healthcheck/<i>health check ID</i>/status</code> resource. You can use this call to get a
     * health check's current status.
     * </p>
     * 
     * @param getHealthCheckStatusRequest
     *        A complex type that contains information about the request to get health check status for a health check.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetHealthCheckStatus operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.GetHealthCheckStatus
     */
    java.util.concurrent.Future<GetHealthCheckStatusResult> getHealthCheckStatusAsync(GetHealthCheckStatusRequest getHealthCheckStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetHealthCheckStatusRequest, GetHealthCheckStatusResult> asyncHandler);

    /**
     * <p>
     * Retrieves the delegation set for a hosted zone, including the four name servers assigned to the hosted zone. Send
     * a <code>GET</code> request to the
     * <code>/<i>Amazon Route 53 API version</i>/hostedzone/<i>hosted zone ID</i> </code> resource.
     * </p>
     * 
     * @param getHostedZoneRequest
     *        The input for a GetHostedZone request.
     * @return A Java Future containing the result of the GetHostedZone operation returned by the service.
     * @sample AmazonRoute53Async.GetHostedZone
     */
    java.util.concurrent.Future<GetHostedZoneResult> getHostedZoneAsync(GetHostedZoneRequest getHostedZoneRequest);

    /**
     * <p>
     * Retrieves the delegation set for a hosted zone, including the four name servers assigned to the hosted zone. Send
     * a <code>GET</code> request to the
     * <code>/<i>Amazon Route 53 API version</i>/hostedzone/<i>hosted zone ID</i> </code> resource.
     * </p>
     * 
     * @param getHostedZoneRequest
     *        The input for a GetHostedZone request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetHostedZone operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.GetHostedZone
     */
    java.util.concurrent.Future<GetHostedZoneResult> getHostedZoneAsync(GetHostedZoneRequest getHostedZoneRequest,
            com.amazonaws.handlers.AsyncHandler<GetHostedZoneRequest, GetHostedZoneResult> asyncHandler);

    /**
     * <p>
     * Retrieves a count of all your hosted zones. Send a <code>GET</code> request to the
     * <code>/2013-04-01/hostedzonecount</code> resource.
     * </p>
     * 
     * @param getHostedZoneCountRequest
     *        To retrieve a count of all your hosted zones, send a <code>GET</code> request to the
     *        <code>/2013-04-01/hostedzonecount</code> resource.
     * @return A Java Future containing the result of the GetHostedZoneCount operation returned by the service.
     * @sample AmazonRoute53Async.GetHostedZoneCount
     */
    java.util.concurrent.Future<GetHostedZoneCountResult> getHostedZoneCountAsync(GetHostedZoneCountRequest getHostedZoneCountRequest);

    /**
     * <p>
     * Retrieves a count of all your hosted zones. Send a <code>GET</code> request to the
     * <code>/2013-04-01/hostedzonecount</code> resource.
     * </p>
     * 
     * @param getHostedZoneCountRequest
     *        To retrieve a count of all your hosted zones, send a <code>GET</code> request to the
     *        <code>/2013-04-01/hostedzonecount</code> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetHostedZoneCount operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.GetHostedZoneCount
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
     * Retrieves the reusable delegation set. Send a <code>GET</code> request to the
     * <code>/2013-04-01/delegationset/<i>delegation set ID</i> </code> resource.
     * </p>
     * 
     * @param getReusableDelegationSetRequest
     *        The input for a <code>GetReusableDelegationSet</code> request.
     * @return A Java Future containing the result of the GetReusableDelegationSet operation returned by the service.
     * @sample AmazonRoute53Async.GetReusableDelegationSet
     */
    java.util.concurrent.Future<GetReusableDelegationSetResult> getReusableDelegationSetAsync(GetReusableDelegationSetRequest getReusableDelegationSetRequest);

    /**
     * <p>
     * Retrieves the reusable delegation set. Send a <code>GET</code> request to the
     * <code>/2013-04-01/delegationset/<i>delegation set ID</i> </code> resource.
     * </p>
     * 
     * @param getReusableDelegationSetRequest
     *        The input for a <code>GetReusableDelegationSet</code> request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetReusableDelegationSet operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.GetReusableDelegationSet
     */
    java.util.concurrent.Future<GetReusableDelegationSetResult> getReusableDelegationSetAsync(GetReusableDelegationSetRequest getReusableDelegationSetRequest,
            com.amazonaws.handlers.AsyncHandler<GetReusableDelegationSetRequest, GetReusableDelegationSetResult> asyncHandler);

    /**
     * <p>
     * Gets information about a specific traffic policy version.
     * </p>
     * <p>
     * Send a <code>GET</code> request to the <code>/<i>Amazon Route 53 API version</i>/trafficpolicy</code> resource.
     * </p>
     * 
     * @param getTrafficPolicyRequest
     *        Gets information about a specific traffic policy version. To get the information, send a GET request to
     *        the /2013-04-01/trafficpolicy resource, and specify the ID and the version of the traffic policy.
     * @return A Java Future containing the result of the GetTrafficPolicy operation returned by the service.
     * @sample AmazonRoute53Async.GetTrafficPolicy
     */
    java.util.concurrent.Future<GetTrafficPolicyResult> getTrafficPolicyAsync(GetTrafficPolicyRequest getTrafficPolicyRequest);

    /**
     * <p>
     * Gets information about a specific traffic policy version.
     * </p>
     * <p>
     * Send a <code>GET</code> request to the <code>/<i>Amazon Route 53 API version</i>/trafficpolicy</code> resource.
     * </p>
     * 
     * @param getTrafficPolicyRequest
     *        Gets information about a specific traffic policy version. To get the information, send a GET request to
     *        the /2013-04-01/trafficpolicy resource, and specify the ID and the version of the traffic policy.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTrafficPolicy operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.GetTrafficPolicy
     */
    java.util.concurrent.Future<GetTrafficPolicyResult> getTrafficPolicyAsync(GetTrafficPolicyRequest getTrafficPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetTrafficPolicyRequest, GetTrafficPolicyResult> asyncHandler);

    /**
     * <p>
     * Gets information about a specified traffic policy instance.
     * </p>
     * <p>
     * Send a <code>GET</code> request to the <code>/<i>Amazon Route 53 API version</i>/trafficpolicyinstance</code>
     * resource.
     * </p>
     * <note>
     * <p>
     * After you submit a <code>CreateTrafficPolicyInstance</code> or an <code>UpdateTrafficPolicyInstance</code>
     * request, there's a brief delay while Amazon Route 53 creates the resource record sets that are specified in the
     * traffic policy definition. For more information, see the <code>State</code> response element.
     * </p>
     * </note> <note>
     * <p>
     * In the Amazon Route 53 console, traffic policy instances are known as policy records.
     * </p>
     * </note>
     * 
     * @param getTrafficPolicyInstanceRequest
     *        Gets information about a specified traffic policy instance.</p>
     *        <p>
     *        To get information about a traffic policy instance, send a <code>GET</code> request to the
     *        <code>/<i>Amazon Route 53 API version</i>/trafficpolicyinstance/<i>Id</i> </code> resource.
     * @return A Java Future containing the result of the GetTrafficPolicyInstance operation returned by the service.
     * @sample AmazonRoute53Async.GetTrafficPolicyInstance
     */
    java.util.concurrent.Future<GetTrafficPolicyInstanceResult> getTrafficPolicyInstanceAsync(GetTrafficPolicyInstanceRequest getTrafficPolicyInstanceRequest);

    /**
     * <p>
     * Gets information about a specified traffic policy instance.
     * </p>
     * <p>
     * Send a <code>GET</code> request to the <code>/<i>Amazon Route 53 API version</i>/trafficpolicyinstance</code>
     * resource.
     * </p>
     * <note>
     * <p>
     * After you submit a <code>CreateTrafficPolicyInstance</code> or an <code>UpdateTrafficPolicyInstance</code>
     * request, there's a brief delay while Amazon Route 53 creates the resource record sets that are specified in the
     * traffic policy definition. For more information, see the <code>State</code> response element.
     * </p>
     * </note> <note>
     * <p>
     * In the Amazon Route 53 console, traffic policy instances are known as policy records.
     * </p>
     * </note>
     * 
     * @param getTrafficPolicyInstanceRequest
     *        Gets information about a specified traffic policy instance.</p>
     *        <p>
     *        To get information about a traffic policy instance, send a <code>GET</code> request to the
     *        <code>/<i>Amazon Route 53 API version</i>/trafficpolicyinstance/<i>Id</i> </code> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTrafficPolicyInstance operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.GetTrafficPolicyInstance
     */
    java.util.concurrent.Future<GetTrafficPolicyInstanceResult> getTrafficPolicyInstanceAsync(GetTrafficPolicyInstanceRequest getTrafficPolicyInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<GetTrafficPolicyInstanceRequest, GetTrafficPolicyInstanceResult> asyncHandler);

    /**
     * <p>
     * Gets the number of traffic policy instances that are associated with the current AWS account.
     * </p>
     * <p>
     * To get the number of traffic policy instances, send a <code>GET</code> request to the
     * <code>/2013-04-01/trafficpolicyinstancecount</code> resource.
     * </p>
     * 
     * @param getTrafficPolicyInstanceCountRequest
     *        To retrieve a count of all your traffic policy instances, send a <code>GET</code> request to the
     *        <code>/2013-04-01/trafficpolicyinstancecount</code> resource.
     * @return A Java Future containing the result of the GetTrafficPolicyInstanceCount operation returned by the
     *         service.
     * @sample AmazonRoute53Async.GetTrafficPolicyInstanceCount
     */
    java.util.concurrent.Future<GetTrafficPolicyInstanceCountResult> getTrafficPolicyInstanceCountAsync(
            GetTrafficPolicyInstanceCountRequest getTrafficPolicyInstanceCountRequest);

    /**
     * <p>
     * Gets the number of traffic policy instances that are associated with the current AWS account.
     * </p>
     * <p>
     * To get the number of traffic policy instances, send a <code>GET</code> request to the
     * <code>/2013-04-01/trafficpolicyinstancecount</code> resource.
     * </p>
     * 
     * @param getTrafficPolicyInstanceCountRequest
     *        To retrieve a count of all your traffic policy instances, send a <code>GET</code> request to the
     *        <code>/2013-04-01/trafficpolicyinstancecount</code> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTrafficPolicyInstanceCount operation returned by the
     *         service.
     * @sample AmazonRoute53AsyncHandler.GetTrafficPolicyInstanceCount
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
     * Retrieves a list of supported geo locations. Send a <code>GET</code> request to the
     * <code>/2013-04-01/geolocations</code> resource. The response to this request includes a
     * <code>GeoLocationDetailsList</code> element for each location that Amazon Route 53 supports.
     * </p>
     * <p>
     * Countries are listed first, and continents are listed last. If Amazon Route 53 supports subdivisions for a
     * country (for example, states or provinces), the subdivisions for that country are listed in alphabetical order
     * immediately after the corresponding country.
     * </p>
     * 
     * @param listGeoLocationsRequest
     *        To get a list of geographic locations that Amazon Route 53 supports for geolocation, send a
     *        <code>GET</code> request to the <code>/<i>Amazon Route 53 API version</i>/geolocations</code> resource.
     *        The response to this request includes a <code>GeoLocationDetails</code> element for each location that
     *        Amazon Route 53 supports.</p>
     *        <p>
     *        Countries are listed first, and continents are listed last. If Amazon Route 53 supports subdivisions for a
     *        country (for example, states or provinces), the subdivisions for that country are listed in alphabetical
     *        order immediately after the corresponding country.
     * @return A Java Future containing the result of the ListGeoLocations operation returned by the service.
     * @sample AmazonRoute53Async.ListGeoLocations
     */
    java.util.concurrent.Future<ListGeoLocationsResult> listGeoLocationsAsync(ListGeoLocationsRequest listGeoLocationsRequest);

    /**
     * <p>
     * Retrieves a list of supported geo locations. Send a <code>GET</code> request to the
     * <code>/2013-04-01/geolocations</code> resource. The response to this request includes a
     * <code>GeoLocationDetailsList</code> element for each location that Amazon Route 53 supports.
     * </p>
     * <p>
     * Countries are listed first, and continents are listed last. If Amazon Route 53 supports subdivisions for a
     * country (for example, states or provinces), the subdivisions for that country are listed in alphabetical order
     * immediately after the corresponding country.
     * </p>
     * 
     * @param listGeoLocationsRequest
     *        To get a list of geographic locations that Amazon Route 53 supports for geolocation, send a
     *        <code>GET</code> request to the <code>/<i>Amazon Route 53 API version</i>/geolocations</code> resource.
     *        The response to this request includes a <code>GeoLocationDetails</code> element for each location that
     *        Amazon Route 53 supports.</p>
     *        <p>
     *        Countries are listed first, and continents are listed last. If Amazon Route 53 supports subdivisions for a
     *        country (for example, states or provinces), the subdivisions for that country are listed in alphabetical
     *        order immediately after the corresponding country.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGeoLocations operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.ListGeoLocations
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
     * Retrieve a list of your health checks. Send a <code>GET</code> request to the
     * <code>/2013-04-01/healthcheck</code> resource. The response to this request includes a <code>HealthChecks</code>
     * element with zero or more <code>HealthCheck</code> child elements. By default, the list of health checks is
     * displayed on a single page. You can control the length of the page that is displayed by using the
     * <code>MaxItems</code> parameter. You can use the <code>Marker</code> parameter to control the health check that
     * the list begins with.
     * </p>
     * <p>
     * For information about listing health checks using the Amazon Route 53 console, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html">Amazon Route 53 Health Checks
     * and DNS Failover</a>.
     * </p>
     * 
     * @param listHealthChecksRequest
     *        To retrieve a list of your health checks, send a <code>GET</code> request to the
     *        <code>/2013-04-01/healthcheck</code> resource. The response to this request includes a
     *        <code>HealthChecks</code> element with zero or more <code>HealthCheck</code> child elements. By default,
     *        the list of health checks is displayed on a single page. You can control the length of the page that is
     *        displayed by using the <code>MaxItems</code> parameter. You can use the <code>Marker</code> parameter to
     *        control the health check that the list begins with.</p> <note>
     *        <p>
     *        Amazon Route 53 returns a maximum of 100 items. If you set <code>MaxItems</code> to a value greater than
     *        100, Amazon Route 53 returns only the first 100.
     *        </p>
     * @return A Java Future containing the result of the ListHealthChecks operation returned by the service.
     * @sample AmazonRoute53Async.ListHealthChecks
     */
    java.util.concurrent.Future<ListHealthChecksResult> listHealthChecksAsync(ListHealthChecksRequest listHealthChecksRequest);

    /**
     * <p>
     * Retrieve a list of your health checks. Send a <code>GET</code> request to the
     * <code>/2013-04-01/healthcheck</code> resource. The response to this request includes a <code>HealthChecks</code>
     * element with zero or more <code>HealthCheck</code> child elements. By default, the list of health checks is
     * displayed on a single page. You can control the length of the page that is displayed by using the
     * <code>MaxItems</code> parameter. You can use the <code>Marker</code> parameter to control the health check that
     * the list begins with.
     * </p>
     * <p>
     * For information about listing health checks using the Amazon Route 53 console, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover.html">Amazon Route 53 Health Checks
     * and DNS Failover</a>.
     * </p>
     * 
     * @param listHealthChecksRequest
     *        To retrieve a list of your health checks, send a <code>GET</code> request to the
     *        <code>/2013-04-01/healthcheck</code> resource. The response to this request includes a
     *        <code>HealthChecks</code> element with zero or more <code>HealthCheck</code> child elements. By default,
     *        the list of health checks is displayed on a single page. You can control the length of the page that is
     *        displayed by using the <code>MaxItems</code> parameter. You can use the <code>Marker</code> parameter to
     *        control the health check that the list begins with.</p> <note>
     *        <p>
     *        Amazon Route 53 returns a maximum of 100 items. If you set <code>MaxItems</code> to a value greater than
     *        100, Amazon Route 53 returns only the first 100.
     *        </p>
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListHealthChecks operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.ListHealthChecks
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
     * To retrieve a list of your public and private hosted zones, send a <code>GET</code> request to the
     * <code>/2013-04-01/hostedzone</code> resource. The response to this request includes a <code>HostedZones</code>
     * child element for each hosted zone created by the current AWS account.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If you have a lot of hosted zones, you can use
     * the <code>maxitems</code> parameter to list them in groups of up to 100. The response includes four values that
     * help navigate from one group of <code>maxitems</code> hosted zones to the next:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MaxItems</code> is the value specified for the <code>maxitems</code> parameter in the request that produced
     * the current response.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is true, there are more hosted zones associated with the
     * current AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NextMarker</code> is the hosted zone ID of the next hosted zone that is associated with the current AWS
     * account. If you want to list more hosted zones, make another call to <code>ListHostedZones</code>, and specify
     * the value of the <code>NextMarker</code> element in the marker parameter.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is false, the <code>NextMarker</code> element is omitted from the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you're making the second or subsequent call to <code>ListHostedZones</code>, the <code>Marker</code> element
     * matches the value that you specified in the <code>marker</code> parameter in the previous request.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listHostedZonesRequest
     *        To retrieve a list of your public and private hosted zones, send a <code>GET</code> request to the
     *        <code>/2013-04-01/hostedzone</code> resource. The response to this request includes a HostedZone child
     *        element for each hosted zone that was created by the current AWS account.</p>
     *        <p>
     *        Amazon Route 53 returns a maximum of 100 items in each response. If you have a lot of hosted zones, you
     *        can use the maxitems parameter to list them in groups of up to 100. The response includes four values that
     *        help you navigate from one group of maxitems hosted zones to the next:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MaxItems</code> is the value that you specified for the <code>maxitems</code> parameter in the
     *        request that produced the current response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the value of <code>IsTruncated</code> in the response is <code>true</code>, there are more hosted zones
     *        associated with the current AWS account.
     *        </p>
     *        <p>
     *        If <code>IsTruncated</code> is <code>false</code>, this response includes the last hosted zone that is
     *        associated with the current account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NextMarker</code> is the hosted zone ID of the next hosted zone that is associated with the current
     *        AWS account. If you want to list more hosted zones, make another call to <code>ListHostedZones</code>, and
     *        specify the value of the <code>NextMarker</code> element in the marker parameter.
     *        </p>
     *        <p>
     *        If <code>IsTruncated</code> is <code>false</code>, the <code>NextMarker</code> element is omitted from the
     *        response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you're making the second or subsequent call to <code>ListHostedZones</code>, the <code>Marker</code>
     *        element matches the value that you specified in the <code>marker</code> parameter in the previous request.
     *        </p>
     *        </li>
     * @return A Java Future containing the result of the ListHostedZones operation returned by the service.
     * @sample AmazonRoute53Async.ListHostedZones
     */
    java.util.concurrent.Future<ListHostedZonesResult> listHostedZonesAsync(ListHostedZonesRequest listHostedZonesRequest);

    /**
     * <p>
     * To retrieve a list of your public and private hosted zones, send a <code>GET</code> request to the
     * <code>/2013-04-01/hostedzone</code> resource. The response to this request includes a <code>HostedZones</code>
     * child element for each hosted zone created by the current AWS account.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If you have a lot of hosted zones, you can use
     * the <code>maxitems</code> parameter to list them in groups of up to 100. The response includes four values that
     * help navigate from one group of <code>maxitems</code> hosted zones to the next:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MaxItems</code> is the value specified for the <code>maxitems</code> parameter in the request that produced
     * the current response.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is true, there are more hosted zones associated with the
     * current AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NextMarker</code> is the hosted zone ID of the next hosted zone that is associated with the current AWS
     * account. If you want to list more hosted zones, make another call to <code>ListHostedZones</code>, and specify
     * the value of the <code>NextMarker</code> element in the marker parameter.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is false, the <code>NextMarker</code> element is omitted from the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you're making the second or subsequent call to <code>ListHostedZones</code>, the <code>Marker</code> element
     * matches the value that you specified in the <code>marker</code> parameter in the previous request.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listHostedZonesRequest
     *        To retrieve a list of your public and private hosted zones, send a <code>GET</code> request to the
     *        <code>/2013-04-01/hostedzone</code> resource. The response to this request includes a HostedZone child
     *        element for each hosted zone that was created by the current AWS account.</p>
     *        <p>
     *        Amazon Route 53 returns a maximum of 100 items in each response. If you have a lot of hosted zones, you
     *        can use the maxitems parameter to list them in groups of up to 100. The response includes four values that
     *        help you navigate from one group of maxitems hosted zones to the next:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MaxItems</code> is the value that you specified for the <code>maxitems</code> parameter in the
     *        request that produced the current response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the value of <code>IsTruncated</code> in the response is <code>true</code>, there are more hosted zones
     *        associated with the current AWS account.
     *        </p>
     *        <p>
     *        If <code>IsTruncated</code> is <code>false</code>, this response includes the last hosted zone that is
     *        associated with the current account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NextMarker</code> is the hosted zone ID of the next hosted zone that is associated with the current
     *        AWS account. If you want to list more hosted zones, make another call to <code>ListHostedZones</code>, and
     *        specify the value of the <code>NextMarker</code> element in the marker parameter.
     *        </p>
     *        <p>
     *        If <code>IsTruncated</code> is <code>false</code>, the <code>NextMarker</code> element is omitted from the
     *        response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you're making the second or subsequent call to <code>ListHostedZones</code>, the <code>Marker</code>
     *        element matches the value that you specified in the <code>marker</code> parameter in the previous request.
     *        </p>
     *        </li>
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListHostedZones operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.ListHostedZones
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
     * Retrieves a list of your hosted zones in lexicographic order. Send a <code>GET</code> request to the
     * <code>/2013-04-01/hostedzonesbyname</code> resource. The response includes a <code>HostedZones</code> child
     * element for each hosted zone created by the current AWS account.
     * </p>
     * <p>
     * <code>ListHostedZonesByName</code> sorts hosted zones by name with the labels reversed. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>com.example.www.</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note the trailing dot, which can change the sort order in some circumstances.
     * </p>
     * <p>
     * If the domain name includes escape characters or Punycode, <code>ListHostedZonesByName</code> alphabetizes the
     * domain name using the escaped or Punycoded value, which is the format that Amazon Route 53 saves in its database.
     * For example, to create a hosted zone for example.com, specify ex\344mple.com for the domain name.
     * <code>ListHostedZonesByName</code> alphabetizes it as:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>com.ex\344mple.</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The labels are reversed and alphabetized using the escaped value. For more information about valid domain name
     * formats, including internationalized domain names, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html">DNS Domain Name Format</a>
     * in the Amazon Route 53 Developer Guide.
     * </p>
     * <p>
     * Amazon Route 53 returns up to 100 items in each response. If you have a lot of hosted zones, use the
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
     *        To retrieve a list of your public and private hosted zones in ASCII order by domain name, send a
     *        <code>GET</code> request to the <code>/<i>Amazon Route 53 API version</i>/hostedzonesbyname</code>
     *        resource. The response to this request includes a <code>HostedZone</code> child element for each hosted
     *        zone that was created by the current AWS account. <code>ListHostedZonesByName</code> sorts hosted zones by
     *        name with the labels reversed, for example:</p>
     *        <p>
     *        <code>com.example.www.</code>
     *        </p>
     *        <p>
     *        Note the trailing dot, which can change the sort order in some circumstances.
     *        </p>
     *        <p>
     *        If the domain name includes escape characters or Punycode, <code>ListHostedZonesByName</code> alphabetizes
     *        the domain name using the escaped or Punycoded value, which is the format that Amazon Route 53 saves in
     *        its database. For example, to create a hosted zone for exämple.com, you specify
     *        <code>ex\344mple.com</code> for the domain name. <code>ListHostedZonesByName</code> alphabetizes it as:
     *        <code>com.ex\344mple</code>. The labels are reversed, and it's alphabetized using the escaped value. For
     *        more information about valid domain name formats, including internationalized domain names, see <a
     *        href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html">DNS Domain Name
     *        Format</a> in the <i>Amazon Route 53 Developer Guide</i>.
     *        </p>
     *        <p>
     *        Amazon Route 53 returns up to 100 items in each response. If you have a lot of hosted zones, you can use
     *        the <code>MaxItems</code> parameter to list them in groups of up to 100. The response includes values that
     *        help you navigate from one group of <code>MaxItems</code> hosted zones to the next:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The <code>DNSName</code> and <code>HostedZoneId</code> elements in the response contain the values, if
     *        any, that you specified for the <code>dnsname</code> and <code>hostedzoneid</code> parameters in the
     *        request that produced the current response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <code>MaxItems</code> element in the response contains the value, if any, that you specified for the
     *        <code>maxitems</code> parameter in the request that produced the current response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the value of <code>IsTruncated</code> in the response is true, there are more hosted zones associated
     *        with the current Amazon Route 53 account.
     *        </p>
     *        <p>
     *        If <code>IsTruncated</code> is <code>false</code>, this response includes the last hosted zone that is
     *        associated with the current account. The <code>NextDNSName</code> element and
     *        <code>NextHostedZoneId</code> elements are omitted from the response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <code>NextDNSName</code> and <code>NextHostedZoneId</code> elements in the response contain the domain
     *        name and the hosted zone ID of the next hosted zone that is associated with the current AWS account. If
     *        you want to list more hosted zones, make another call to <code>ListHostedZonesByName</code>, and specify
     *        the value of <code>NextDNSName</code> and <code>NextHostedZoneId</code> in the <code>dnsname</code> and
     *        <code>hostedzoneid</code> parameters, respectively.
     *        </p>
     *        </li>
     * @return A Java Future containing the result of the ListHostedZonesByName operation returned by the service.
     * @sample AmazonRoute53Async.ListHostedZonesByName
     */
    java.util.concurrent.Future<ListHostedZonesByNameResult> listHostedZonesByNameAsync(ListHostedZonesByNameRequest listHostedZonesByNameRequest);

    /**
     * <p>
     * Retrieves a list of your hosted zones in lexicographic order. Send a <code>GET</code> request to the
     * <code>/2013-04-01/hostedzonesbyname</code> resource. The response includes a <code>HostedZones</code> child
     * element for each hosted zone created by the current AWS account.
     * </p>
     * <p>
     * <code>ListHostedZonesByName</code> sorts hosted zones by name with the labels reversed. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>com.example.www.</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Note the trailing dot, which can change the sort order in some circumstances.
     * </p>
     * <p>
     * If the domain name includes escape characters or Punycode, <code>ListHostedZonesByName</code> alphabetizes the
     * domain name using the escaped or Punycoded value, which is the format that Amazon Route 53 saves in its database.
     * For example, to create a hosted zone for example.com, specify ex\344mple.com for the domain name.
     * <code>ListHostedZonesByName</code> alphabetizes it as:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>com.ex\344mple.</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * The labels are reversed and alphabetized using the escaped value. For more information about valid domain name
     * formats, including internationalized domain names, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html">DNS Domain Name Format</a>
     * in the Amazon Route 53 Developer Guide.
     * </p>
     * <p>
     * Amazon Route 53 returns up to 100 items in each response. If you have a lot of hosted zones, use the
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
     *        To retrieve a list of your public and private hosted zones in ASCII order by domain name, send a
     *        <code>GET</code> request to the <code>/<i>Amazon Route 53 API version</i>/hostedzonesbyname</code>
     *        resource. The response to this request includes a <code>HostedZone</code> child element for each hosted
     *        zone that was created by the current AWS account. <code>ListHostedZonesByName</code> sorts hosted zones by
     *        name with the labels reversed, for example:</p>
     *        <p>
     *        <code>com.example.www.</code>
     *        </p>
     *        <p>
     *        Note the trailing dot, which can change the sort order in some circumstances.
     *        </p>
     *        <p>
     *        If the domain name includes escape characters or Punycode, <code>ListHostedZonesByName</code> alphabetizes
     *        the domain name using the escaped or Punycoded value, which is the format that Amazon Route 53 saves in
     *        its database. For example, to create a hosted zone for exämple.com, you specify
     *        <code>ex\344mple.com</code> for the domain name. <code>ListHostedZonesByName</code> alphabetizes it as:
     *        <code>com.ex\344mple</code>. The labels are reversed, and it's alphabetized using the escaped value. For
     *        more information about valid domain name formats, including internationalized domain names, see <a
     *        href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DomainNameFormat.html">DNS Domain Name
     *        Format</a> in the <i>Amazon Route 53 Developer Guide</i>.
     *        </p>
     *        <p>
     *        Amazon Route 53 returns up to 100 items in each response. If you have a lot of hosted zones, you can use
     *        the <code>MaxItems</code> parameter to list them in groups of up to 100. The response includes values that
     *        help you navigate from one group of <code>MaxItems</code> hosted zones to the next:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The <code>DNSName</code> and <code>HostedZoneId</code> elements in the response contain the values, if
     *        any, that you specified for the <code>dnsname</code> and <code>hostedzoneid</code> parameters in the
     *        request that produced the current response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <code>MaxItems</code> element in the response contains the value, if any, that you specified for the
     *        <code>maxitems</code> parameter in the request that produced the current response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the value of <code>IsTruncated</code> in the response is true, there are more hosted zones associated
     *        with the current Amazon Route 53 account.
     *        </p>
     *        <p>
     *        If <code>IsTruncated</code> is <code>false</code>, this response includes the last hosted zone that is
     *        associated with the current account. The <code>NextDNSName</code> element and
     *        <code>NextHostedZoneId</code> elements are omitted from the response.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <code>NextDNSName</code> and <code>NextHostedZoneId</code> elements in the response contain the domain
     *        name and the hosted zone ID of the next hosted zone that is associated with the current AWS account. If
     *        you want to list more hosted zones, make another call to <code>ListHostedZonesByName</code>, and specify
     *        the value of <code>NextDNSName</code> and <code>NextHostedZoneId</code> in the <code>dnsname</code> and
     *        <code>hostedzoneid</code> parameters, respectively.
     *        </p>
     *        </li>
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListHostedZonesByName operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.ListHostedZonesByName
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
     * Lists the resource record sets in a specified hosted zone.
     * </p>
     * <p>
     * <code>ListResourceRecordSets</code> returns up to 100 resource record sets at a time in ASCII order, beginning at
     * a position specified by the <code>name</code> and <code>type</code> elements. The action sorts results first by
     * DNS name with the labels reversed, for example:
     * </p>
     * <p>
     * <code>com.example.www.</code>
     * </p>
     * <p>
     * Note the trailing dot, which can change the sort order in some circumstances.
     * </p>
     * <p>
     * When multiple records have the same DNS name, the action sorts results by the record type.
     * </p>
     * <p>
     * You can use the name and type elements to adjust the beginning position of the list of resource record sets
     * returned:
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
     * This action returns the most current version of the records. This includes records that are <code>PENDING</code>,
     * and that are not yet available on all Amazon Route 53 DNS servers.
     * </p>
     * <p>
     * To ensure that you get an accurate listing of the resource record sets for a hosted zone at a point in time, do
     * not submit a <code>ChangeResourceRecordSets</code> request while you're paging through the results of a
     * <code>ListResourceRecordSets</code> request. If you do, some pages may display results without the latest changes
     * while other pages display results with the latest changes.
     * </p>
     * 
     * @param listResourceRecordSetsRequest
     *        The input for a ListResourceRecordSets request.
     * @return A Java Future containing the result of the ListResourceRecordSets operation returned by the service.
     * @sample AmazonRoute53Async.ListResourceRecordSets
     */
    java.util.concurrent.Future<ListResourceRecordSetsResult> listResourceRecordSetsAsync(ListResourceRecordSetsRequest listResourceRecordSetsRequest);

    /**
     * <p>
     * Lists the resource record sets in a specified hosted zone.
     * </p>
     * <p>
     * <code>ListResourceRecordSets</code> returns up to 100 resource record sets at a time in ASCII order, beginning at
     * a position specified by the <code>name</code> and <code>type</code> elements. The action sorts results first by
     * DNS name with the labels reversed, for example:
     * </p>
     * <p>
     * <code>com.example.www.</code>
     * </p>
     * <p>
     * Note the trailing dot, which can change the sort order in some circumstances.
     * </p>
     * <p>
     * When multiple records have the same DNS name, the action sorts results by the record type.
     * </p>
     * <p>
     * You can use the name and type elements to adjust the beginning position of the list of resource record sets
     * returned:
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
     * This action returns the most current version of the records. This includes records that are <code>PENDING</code>,
     * and that are not yet available on all Amazon Route 53 DNS servers.
     * </p>
     * <p>
     * To ensure that you get an accurate listing of the resource record sets for a hosted zone at a point in time, do
     * not submit a <code>ChangeResourceRecordSets</code> request while you're paging through the results of a
     * <code>ListResourceRecordSets</code> request. If you do, some pages may display results without the latest changes
     * while other pages display results with the latest changes.
     * </p>
     * 
     * @param listResourceRecordSetsRequest
     *        The input for a ListResourceRecordSets request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResourceRecordSets operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.ListResourceRecordSets
     */
    java.util.concurrent.Future<ListResourceRecordSetsResult> listResourceRecordSetsAsync(ListResourceRecordSetsRequest listResourceRecordSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListResourceRecordSetsRequest, ListResourceRecordSetsResult> asyncHandler);

    /**
     * <p>
     * To retrieve a list of your reusable delegation sets, send a <code>GET</code> request to the
     * <code>/2013-04-01/delegationset</code> resource. The response to this request includes a
     * <code>DelegationSets</code> element with zero, one, or multiple <code>DelegationSet</code> child elements. By
     * default, the list of delegation sets is displayed on a single page. You can control the length of the page that
     * is displayed by using the <code>MaxItems</code> parameter. You can use the <code>Marker</code> parameter to
     * control the delegation set that the list begins with.
     * </p>
     * <note>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items. If you set MaxItems to a value greater than 100, Amazon Route 53
     * returns only the first 100.
     * </p>
     * </note>
     * 
     * @param listReusableDelegationSetsRequest
     *        To retrieve a list of your reusable delegation sets, send a <code>GET</code> request to the
     *        <code>/2013-04-01/delegationset</code> resource. The response to this request includes a
     *        <code>DelegationSets</code> element with zero or more <code>DelegationSet</code> child elements. By
     *        default, the list of reusable delegation sets is displayed on a single page. You can control the length of
     *        the page that is displayed by using the <code>MaxItems</code> parameter. You can use the
     *        <code>Marker</code> parameter to control the delegation set that the list begins with.</p> <note>
     *        <p>
     *        Amazon Route 53 returns a maximum of 100 items. If you set <code>MaxItems</code> to a value greater than
     *        100, Amazon Route 53 returns only the first 100.
     *        </p>
     * @return A Java Future containing the result of the ListReusableDelegationSets operation returned by the service.
     * @sample AmazonRoute53Async.ListReusableDelegationSets
     */
    java.util.concurrent.Future<ListReusableDelegationSetsResult> listReusableDelegationSetsAsync(
            ListReusableDelegationSetsRequest listReusableDelegationSetsRequest);

    /**
     * <p>
     * To retrieve a list of your reusable delegation sets, send a <code>GET</code> request to the
     * <code>/2013-04-01/delegationset</code> resource. The response to this request includes a
     * <code>DelegationSets</code> element with zero, one, or multiple <code>DelegationSet</code> child elements. By
     * default, the list of delegation sets is displayed on a single page. You can control the length of the page that
     * is displayed by using the <code>MaxItems</code> parameter. You can use the <code>Marker</code> parameter to
     * control the delegation set that the list begins with.
     * </p>
     * <note>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items. If you set MaxItems to a value greater than 100, Amazon Route 53
     * returns only the first 100.
     * </p>
     * </note>
     * 
     * @param listReusableDelegationSetsRequest
     *        To retrieve a list of your reusable delegation sets, send a <code>GET</code> request to the
     *        <code>/2013-04-01/delegationset</code> resource. The response to this request includes a
     *        <code>DelegationSets</code> element with zero or more <code>DelegationSet</code> child elements. By
     *        default, the list of reusable delegation sets is displayed on a single page. You can control the length of
     *        the page that is displayed by using the <code>MaxItems</code> parameter. You can use the
     *        <code>Marker</code> parameter to control the delegation set that the list begins with.</p> <note>
     *        <p>
     *        Amazon Route 53 returns a maximum of 100 items. If you set <code>MaxItems</code> to a value greater than
     *        100, Amazon Route 53 returns only the first 100.
     *        </p>
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListReusableDelegationSets operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.ListReusableDelegationSets
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
     * href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Using Cost Allocation
     * Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        A complex type containing information about a request for a list of the tags that are associated with an
     *        individual resource.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonRoute53Async.ListTagsForResource
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists tags for one health check or hosted zone.
     * </p>
     * <p>
     * For information about using tags for cost allocation, see <a
     * href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Using Cost Allocation
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
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Lists tags for up to 10 health checks or hosted zones.
     * </p>
     * <p>
     * For information about using tags for cost allocation, see <a
     * href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Using Cost Allocation
     * Tags</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param listTagsForResourcesRequest
     *        A complex type that contains information about the health checks or hosted zones for which you want to
     *        list tags.
     * @return A Java Future containing the result of the ListTagsForResources operation returned by the service.
     * @sample AmazonRoute53Async.ListTagsForResources
     */
    java.util.concurrent.Future<ListTagsForResourcesResult> listTagsForResourcesAsync(ListTagsForResourcesRequest listTagsForResourcesRequest);

    /**
     * <p>
     * Lists tags for up to 10 health checks or hosted zones.
     * </p>
     * <p>
     * For information about using tags for cost allocation, see <a
     * href="http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html">Using Cost Allocation
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
     */
    java.util.concurrent.Future<ListTagsForResourcesResult> listTagsForResourcesAsync(ListTagsForResourcesRequest listTagsForResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourcesRequest, ListTagsForResourcesResult> asyncHandler);

    /**
     * <p>
     * Gets information about the latest version for every traffic policy that is associated with the current AWS
     * account. Send a <code>GET</code> request to the <code>/<i>Amazon Route 53 API version</i>/trafficpolicy</code>
     * resource.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policies, you can
     * use the <code>maxitems</code> parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes three values that help you navigate from one group of <code>maxitems</code> traffic
     * policies to the next:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>IsTruncated</b>
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is <code>true</code>, there are more traffic policies
     * associated with the current AWS account.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, this response includes the last traffic policy that is
     * associated with the current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TrafficPolicyIdMarker</b>
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, <code>TrafficPolicyIdMarker</code> is the ID of the first
     * traffic policy in the next group of <code>MaxItems</code> traffic policies. If you want to list more traffic
     * policies, make another call to <code>ListTrafficPolicies</code>, and specify the value of the
     * <code>TrafficPolicyIdMarker</code> element from the response in the <code>TrafficPolicyIdMarker</code> request
     * parameter.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, the <code>TrafficPolicyIdMarker</code> element is omitted from
     * the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MaxItems</b>
     * </p>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in the request that produced the current
     * response.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listTrafficPoliciesRequest
     *        A complex type that contains the information about the request to list the traffic policies that are
     *        associated with the current AWS account.
     * @return A Java Future containing the result of the ListTrafficPolicies operation returned by the service.
     * @sample AmazonRoute53Async.ListTrafficPolicies
     */
    java.util.concurrent.Future<ListTrafficPoliciesResult> listTrafficPoliciesAsync(ListTrafficPoliciesRequest listTrafficPoliciesRequest);

    /**
     * <p>
     * Gets information about the latest version for every traffic policy that is associated with the current AWS
     * account. Send a <code>GET</code> request to the <code>/<i>Amazon Route 53 API version</i>/trafficpolicy</code>
     * resource.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policies, you can
     * use the <code>maxitems</code> parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes three values that help you navigate from one group of <code>maxitems</code> traffic
     * policies to the next:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>IsTruncated</b>
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is <code>true</code>, there are more traffic policies
     * associated with the current AWS account.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, this response includes the last traffic policy that is
     * associated with the current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TrafficPolicyIdMarker</b>
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, <code>TrafficPolicyIdMarker</code> is the ID of the first
     * traffic policy in the next group of <code>MaxItems</code> traffic policies. If you want to list more traffic
     * policies, make another call to <code>ListTrafficPolicies</code>, and specify the value of the
     * <code>TrafficPolicyIdMarker</code> element from the response in the <code>TrafficPolicyIdMarker</code> request
     * parameter.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, the <code>TrafficPolicyIdMarker</code> element is omitted from
     * the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MaxItems</b>
     * </p>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in the request that produced the current
     * response.
     * </p>
     * </li>
     * </ul>
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
     * Send a <code>GET</code> request to the <code>/<i>Amazon Route 53 API version</i>/trafficpolicyinstance</code>
     * resource.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policy instances,
     * you can use the <code>MaxItems</code> parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes five values that help you navigate from one group of <code>MaxItems</code> traffic policy
     * instances to the next:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>IsTruncated</b>
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is <code>true</code>, there are more traffic policy
     * instances associated with the current AWS account.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, this response includes the last traffic policy instance that
     * is associated with the current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MaxItems</b>
     * </p>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in the request that produced the current
     * response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>HostedZoneIdMarker</b>, <b>TrafficPolicyInstanceNameMarker</b>, and <b>TrafficPolicyInstanceTypeMarker</b>
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, these three values in the response represent the first traffic
     * policy instance in the next group of <code>MaxItems</code> traffic policy instances. To list more traffic policy
     * instances, make another call to <code>ListTrafficPolicyInstances</code>, and specify these values in the
     * corresponding request parameters.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, all three elements are omitted from the response.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listTrafficPolicyInstancesRequest
     *        A complex type that contains the information about the request to list your traffic policy instances.
     * @return A Java Future containing the result of the ListTrafficPolicyInstances operation returned by the service.
     * @sample AmazonRoute53Async.ListTrafficPolicyInstances
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
     * Send a <code>GET</code> request to the <code>/<i>Amazon Route 53 API version</i>/trafficpolicyinstance</code>
     * resource.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policy instances,
     * you can use the <code>MaxItems</code> parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes five values that help you navigate from one group of <code>MaxItems</code> traffic policy
     * instances to the next:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>IsTruncated</b>
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is <code>true</code>, there are more traffic policy
     * instances associated with the current AWS account.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, this response includes the last traffic policy instance that
     * is associated with the current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MaxItems</b>
     * </p>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in the request that produced the current
     * response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>HostedZoneIdMarker</b>, <b>TrafficPolicyInstanceNameMarker</b>, and <b>TrafficPolicyInstanceTypeMarker</b>
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, these three values in the response represent the first traffic
     * policy instance in the next group of <code>MaxItems</code> traffic policy instances. To list more traffic policy
     * instances, make another call to <code>ListTrafficPolicyInstances</code>, and specify these values in the
     * corresponding request parameters.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, all three elements are omitted from the response.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listTrafficPolicyInstancesRequest
     *        A complex type that contains the information about the request to list your traffic policy instances.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTrafficPolicyInstances operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.ListTrafficPolicyInstances
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
     * After you submit an <code>UpdateTrafficPolicyInstance</code> request, there's a brief delay while Amazon Route 53
     * creates the resource record sets that are specified in the traffic policy definition. For more information, see
     * the <code>State</code> response element.
     * </p>
     * </note>
     * <p>
     * Send a <code>GET</code> request to the <code>/<i>Amazon Route 53 API version</i>/trafficpolicyinstance</code>
     * resource and include the ID of the hosted zone.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policy instances,
     * you can use the <code>MaxItems</code> parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes four values that help you navigate from one group of <code>MaxItems</code> traffic policy
     * instances to the next:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>IsTruncated</b>
     * </p>
     * <p>
     * If the value of <code/>IsTruncated in the response is <code>true</code>, there are more traffic policy instances
     * associated with the current AWS account.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, this response includes the last traffic policy instance that
     * is associated with the current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MaxItems</b>
     * </p>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in the request that produced the current
     * response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TrafficPolicyInstanceNameMarker</b> and <b>TrafficPolicyInstanceTypeMarker</b>
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, these two values in the response represent the first traffic
     * policy instance in the next group of <code>MaxItems</code> traffic policy instances. To list more traffic policy
     * instances, make another call to <code>ListTrafficPolicyInstancesByHostedZone</code>, and specify these values in
     * the corresponding request parameters.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, all three elements are omitted from the response.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listTrafficPolicyInstancesByHostedZoneRequest
     *        A request for the traffic policy instances that you created in a specified hosted zone.
     * @return A Java Future containing the result of the ListTrafficPolicyInstancesByHostedZone operation returned by
     *         the service.
     * @sample AmazonRoute53Async.ListTrafficPolicyInstancesByHostedZone
     */
    java.util.concurrent.Future<ListTrafficPolicyInstancesByHostedZoneResult> listTrafficPolicyInstancesByHostedZoneAsync(
            ListTrafficPolicyInstancesByHostedZoneRequest listTrafficPolicyInstancesByHostedZoneRequest);

    /**
     * <p>
     * Gets information about the traffic policy instances that you created in a specified hosted zone.
     * </p>
     * <note>
     * <p>
     * After you submit an <code>UpdateTrafficPolicyInstance</code> request, there's a brief delay while Amazon Route 53
     * creates the resource record sets that are specified in the traffic policy definition. For more information, see
     * the <code>State</code> response element.
     * </p>
     * </note>
     * <p>
     * Send a <code>GET</code> request to the <code>/<i>Amazon Route 53 API version</i>/trafficpolicyinstance</code>
     * resource and include the ID of the hosted zone.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policy instances,
     * you can use the <code>MaxItems</code> parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes four values that help you navigate from one group of <code>MaxItems</code> traffic policy
     * instances to the next:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>IsTruncated</b>
     * </p>
     * <p>
     * If the value of <code/>IsTruncated in the response is <code>true</code>, there are more traffic policy instances
     * associated with the current AWS account.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, this response includes the last traffic policy instance that
     * is associated with the current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MaxItems</b>
     * </p>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in the request that produced the current
     * response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TrafficPolicyInstanceNameMarker</b> and <b>TrafficPolicyInstanceTypeMarker</b>
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, these two values in the response represent the first traffic
     * policy instance in the next group of <code>MaxItems</code> traffic policy instances. To list more traffic policy
     * instances, make another call to <code>ListTrafficPolicyInstancesByHostedZone</code>, and specify these values in
     * the corresponding request parameters.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, all three elements are omitted from the response.
     * </p>
     * </li>
     * </ul>
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
     * Send a <code>GET</code> request to the <code>/<i>Route 53 API version</i>/trafficpolicyinstance</code> resource
     * and include the ID and version of the traffic policy.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policy instances,
     * you can use the <code>MaxItems</code> parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes five values that help you navigate from one group of <code>MaxItems</code> traffic policy
     * instances to the next:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>IsTruncated</b>
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is <code>true</code>, there are more traffic policy
     * instances associated with the specified traffic policy.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, this response includes the last traffic policy instance that
     * is associated with the specified traffic policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MaxItems</b>
     * </p>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in the request that produced the current
     * response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>HostedZoneIdMarker</b>, <b>TrafficPolicyInstanceNameMarker</b>, and <b>TrafficPolicyInstanceTypeMarker</b>
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, these values in the response represent the first traffic policy
     * instance in the next group of <code>MaxItems</code> traffic policy instances. To list more traffic policy
     * instances, make another call to <code>ListTrafficPolicyInstancesByPolicy</code>, and specify these values in the
     * corresponding request parameters.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, all three elements are omitted from the response.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listTrafficPolicyInstancesByPolicyRequest
     *        A complex type that contains the information about the request to list your traffic policy instances.
     * @return A Java Future containing the result of the ListTrafficPolicyInstancesByPolicy operation returned by the
     *         service.
     * @sample AmazonRoute53Async.ListTrafficPolicyInstancesByPolicy
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
     * Send a <code>GET</code> request to the <code>/<i>Route 53 API version</i>/trafficpolicyinstance</code> resource
     * and include the ID and version of the traffic policy.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policy instances,
     * you can use the <code>MaxItems</code> parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes five values that help you navigate from one group of <code>MaxItems</code> traffic policy
     * instances to the next:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>IsTruncated</b>
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is <code>true</code>, there are more traffic policy
     * instances associated with the specified traffic policy.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, this response includes the last traffic policy instance that
     * is associated with the specified traffic policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MaxItems</b>
     * </p>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in the request that produced the current
     * response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>HostedZoneIdMarker</b>, <b>TrafficPolicyInstanceNameMarker</b>, and <b>TrafficPolicyInstanceTypeMarker</b>
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, these values in the response represent the first traffic policy
     * instance in the next group of <code>MaxItems</code> traffic policy instances. To list more traffic policy
     * instances, make another call to <code>ListTrafficPolicyInstancesByPolicy</code>, and specify these values in the
     * corresponding request parameters.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, all three elements are omitted from the response.
     * </p>
     * </li>
     * </ul>
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
     */
    java.util.concurrent.Future<ListTrafficPolicyInstancesByPolicyResult> listTrafficPolicyInstancesByPolicyAsync(
            ListTrafficPolicyInstancesByPolicyRequest listTrafficPolicyInstancesByPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<ListTrafficPolicyInstancesByPolicyRequest, ListTrafficPolicyInstancesByPolicyResult> asyncHandler);

    /**
     * <p>
     * Gets information about all of the versions for a specified traffic policy.
     * </p>
     * <p>
     * Send a <code>GET</code> request to the <code>/<i>Amazon Route 53 API version</i>/trafficpolicy</code> resource
     * and specify the ID of the traffic policy for which you want to list versions.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policies, you can
     * use the <code>maxitems</code> parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes three values that help you navigate from one group of <code>maxitems</code> traffic
     * policies to the next:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>IsTruncated</b>
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is <code>true</code>, there are more traffic policy
     * versions associated with the specified traffic policy.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, this response includes the last traffic policy version that is
     * associated with the specified traffic policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TrafficPolicyVersionMarker</b>
     * </p>
     * <p>
     * The ID of the next traffic policy version that is associated with the current AWS account. If you want to list
     * more traffic policies, make another call to <code>ListTrafficPolicyVersions</code>, and specify the value of the
     * <code>TrafficPolicyVersionMarker</code> element in the <code>TrafficPolicyVersionMarker</code> request parameter.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, Amazon Route 53 omits the
     * <code>TrafficPolicyVersionMarker</code> element from the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MaxItems</b>
     * </p>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in the request that produced the current
     * response.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listTrafficPolicyVersionsRequest
     *        A complex type that contains the information about the request to list your traffic policies.
     * @return A Java Future containing the result of the ListTrafficPolicyVersions operation returned by the service.
     * @sample AmazonRoute53Async.ListTrafficPolicyVersions
     */
    java.util.concurrent.Future<ListTrafficPolicyVersionsResult> listTrafficPolicyVersionsAsync(
            ListTrafficPolicyVersionsRequest listTrafficPolicyVersionsRequest);

    /**
     * <p>
     * Gets information about all of the versions for a specified traffic policy.
     * </p>
     * <p>
     * Send a <code>GET</code> request to the <code>/<i>Amazon Route 53 API version</i>/trafficpolicy</code> resource
     * and specify the ID of the traffic policy for which you want to list versions.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If you have a lot of traffic policies, you can
     * use the <code>maxitems</code> parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes three values that help you navigate from one group of <code>maxitems</code> traffic
     * policies to the next:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>IsTruncated</b>
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is <code>true</code>, there are more traffic policy
     * versions associated with the specified traffic policy.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, this response includes the last traffic policy version that is
     * associated with the specified traffic policy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TrafficPolicyVersionMarker</b>
     * </p>
     * <p>
     * The ID of the next traffic policy version that is associated with the current AWS account. If you want to list
     * more traffic policies, make another call to <code>ListTrafficPolicyVersions</code>, and specify the value of the
     * <code>TrafficPolicyVersionMarker</code> element in the <code>TrafficPolicyVersionMarker</code> request parameter.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, Amazon Route 53 omits the
     * <code>TrafficPolicyVersionMarker</code> element from the response.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MaxItems</b>
     * </p>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in the request that produced the current
     * response.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listTrafficPolicyVersionsRequest
     *        A complex type that contains the information about the request to list your traffic policies.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTrafficPolicyVersions operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.ListTrafficPolicyVersions
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
     * Send a <code>GET</code> request to the
     * <code>/2013-04-01/hostedzone/<i>hosted zone ID</i>/authorizevpcassociation</code> resource. The response to this
     * request includes a <code>VPCs</code> element with a <code>VPC</code> child element for each VPC that can be
     * associated with the hosted zone.
     * </p>
     * <p>
     * Amazon Route 53 returns up to 50 VPCs per page. To return fewer VPCs per page, include the
     * <code>MaxResults</code> parameter:
     * </p>
     * <p>
     * <code>/2013-04-01/hostedzone/<i>hosted zone ID</i>/authorizevpcassociation?MaxItems=<i>VPCs per page</i> </code>
     * </p>
     * <p>
     * If the response includes a <code>NextToken</code> element, there are more VPCs to list. To get the next page of
     * VPCs, submit another <code>ListVPCAssociationAuthorizations</code> request, and include the value of the
     * <code>NextToken</code> element from the response in the <code>NextToken</code> request parameter:
     * </p>
     * <p>
     * <code>/2013-04-01/hostedzone/<i>hosted zone ID</i>/authorizevpcassociation?MaxItems=<i>VPCs per page</i>&amp;NextToken=<i/> </code>
     * </p>
     * 
     * @param listVPCAssociationAuthorizationsRequest
     *        A complex type that contains information about that can be associated with your hosted zone.
     * @return A Java Future containing the result of the ListVPCAssociationAuthorizations operation returned by the
     *         service.
     * @sample AmazonRoute53Async.ListVPCAssociationAuthorizations
     */
    java.util.concurrent.Future<ListVPCAssociationAuthorizationsResult> listVPCAssociationAuthorizationsAsync(
            ListVPCAssociationAuthorizationsRequest listVPCAssociationAuthorizationsRequest);

    /**
     * <p>
     * Gets a list of the VPCs that were created by other accounts and that can be associated with a specified hosted
     * zone because you've submitted one or more <code>CreateVPCAssociationAuthorization</code> requests.
     * </p>
     * <p>
     * Send a <code>GET</code> request to the
     * <code>/2013-04-01/hostedzone/<i>hosted zone ID</i>/authorizevpcassociation</code> resource. The response to this
     * request includes a <code>VPCs</code> element with a <code>VPC</code> child element for each VPC that can be
     * associated with the hosted zone.
     * </p>
     * <p>
     * Amazon Route 53 returns up to 50 VPCs per page. To return fewer VPCs per page, include the
     * <code>MaxResults</code> parameter:
     * </p>
     * <p>
     * <code>/2013-04-01/hostedzone/<i>hosted zone ID</i>/authorizevpcassociation?MaxItems=<i>VPCs per page</i> </code>
     * </p>
     * <p>
     * If the response includes a <code>NextToken</code> element, there are more VPCs to list. To get the next page of
     * VPCs, submit another <code>ListVPCAssociationAuthorizations</code> request, and include the value of the
     * <code>NextToken</code> element from the response in the <code>NextToken</code> request parameter:
     * </p>
     * <p>
     * <code>/2013-04-01/hostedzone/<i>hosted zone ID</i>/authorizevpcassociation?MaxItems=<i>VPCs per page</i>&amp;NextToken=<i/> </code>
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
     *        a subnet mask. </p>
     *        <p>
     *        <b>Parameters</b>
     *        </p>
     *        <dl>
     *        <dt>hostedzoneid</dt>
     *        <dd>
     *        <p>
     *        The ID of the hosted zone that you want Amazon Route 53 to simulate a query for.
     *        </p>
     *        </dd>
     *        <dt>recordname</dt>
     *        <dd>
     *        <p>
     *        The name of the resource record set that you want Amazon Route 53 to simulate a query for.
     *        </p>
     *        </dd>
     *        <dt>recordtype</dt>
     *        <dd>
     *        <p>
     *        The type of the resource record set.
     *        </p>
     *        </dd>
     *        <dt>resolverip (optional)</dt>
     *        <dd>
     *        <p>
     *        If you want to simulate a request from a specific DNS resolver, specify the IP address for that resolver.
     *        If you omit this value, <code>TestDNSAnswer</code> uses the IP address of a DNS resolver in the AWS US
     *        East region.
     *        </p>
     *        </dd>
     *        <dt>edns0clientsubnetip (optional)</dt>
     *        <dd>
     *        <p>
     *        If the resolver that you specified for <code>resolverip</code> supports EDNS0, specify the IP address of a
     *        client in the applicable location.
     *        </p>
     *        </dd>
     *        <dt>edns0clientsubnetmask (optional)</dt>
     *        <dd>
     *        <p>
     *        If you specify an IP address for <code>edns0clientsubnetip</code>, you can optionally specify the number
     *        of bits of the IP address that you want the checking tool to include in the DNS query. For example, if you
     *        specify <code>192.0.2.44</code> for <code>edns0clientsubnetip</code> and <code>24</code> for
     *        <code>edns0clientsubnetmask</code>, the checking tool will simulate a request from
     *        <code>192.0.2.0/24</code>. The default value is 24 bits.
     *        </p>
     *        </dd>
     * @return A Java Future containing the result of the TestDNSAnswer operation returned by the service.
     * @sample AmazonRoute53Async.TestDNSAnswer
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
     *        a subnet mask. </p>
     *        <p>
     *        <b>Parameters</b>
     *        </p>
     *        <dl>
     *        <dt>hostedzoneid</dt>
     *        <dd>
     *        <p>
     *        The ID of the hosted zone that you want Amazon Route 53 to simulate a query for.
     *        </p>
     *        </dd>
     *        <dt>recordname</dt>
     *        <dd>
     *        <p>
     *        The name of the resource record set that you want Amazon Route 53 to simulate a query for.
     *        </p>
     *        </dd>
     *        <dt>recordtype</dt>
     *        <dd>
     *        <p>
     *        The type of the resource record set.
     *        </p>
     *        </dd>
     *        <dt>resolverip (optional)</dt>
     *        <dd>
     *        <p>
     *        If you want to simulate a request from a specific DNS resolver, specify the IP address for that resolver.
     *        If you omit this value, <code>TestDNSAnswer</code> uses the IP address of a DNS resolver in the AWS US
     *        East region.
     *        </p>
     *        </dd>
     *        <dt>edns0clientsubnetip (optional)</dt>
     *        <dd>
     *        <p>
     *        If the resolver that you specified for <code>resolverip</code> supports EDNS0, specify the IP address of a
     *        client in the applicable location.
     *        </p>
     *        </dd>
     *        <dt>edns0clientsubnetmask (optional)</dt>
     *        <dd>
     *        <p>
     *        If you specify an IP address for <code>edns0clientsubnetip</code>, you can optionally specify the number
     *        of bits of the IP address that you want the checking tool to include in the DNS query. For example, if you
     *        specify <code>192.0.2.44</code> for <code>edns0clientsubnetip</code> and <code>24</code> for
     *        <code>edns0clientsubnetmask</code>, the checking tool will simulate a request from
     *        <code>192.0.2.0/24</code>. The default value is 24 bits.
     *        </p>
     *        </dd>
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TestDNSAnswer operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.TestDNSAnswer
     */
    java.util.concurrent.Future<TestDNSAnswerResult> testDNSAnswerAsync(TestDNSAnswerRequest testDNSAnswerRequest,
            com.amazonaws.handlers.AsyncHandler<TestDNSAnswerRequest, TestDNSAnswerResult> asyncHandler);

    /**
     * <p>
     * Updates an existing health check.
     * </p>
     * <p>
     * Send a <code>POST</code> request to the <code>/2013-04-01/healthcheck/<i>health check ID</i> </code> resource.
     * The request body must include a document with an <code>UpdateHealthCheckRequest</code> element. For more
     * information about updating health checks, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/health-checks-creating-deleting.html">Creating,
     * Updating, and Deleting Health Checks</a> in the Amazon Route 53 Developer Guide.
     * </p>
     * 
     * @param updateHealthCheckRequest
     *        A complex type that contains the health check request information.
     * @return A Java Future containing the result of the UpdateHealthCheck operation returned by the service.
     * @sample AmazonRoute53Async.UpdateHealthCheck
     */
    java.util.concurrent.Future<UpdateHealthCheckResult> updateHealthCheckAsync(UpdateHealthCheckRequest updateHealthCheckRequest);

    /**
     * <p>
     * Updates an existing health check.
     * </p>
     * <p>
     * Send a <code>POST</code> request to the <code>/2013-04-01/healthcheck/<i>health check ID</i> </code> resource.
     * The request body must include a document with an <code>UpdateHealthCheckRequest</code> element. For more
     * information about updating health checks, see <a
     * href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/health-checks-creating-deleting.html">Creating,
     * Updating, and Deleting Health Checks</a> in the Amazon Route 53 Developer Guide.
     * </p>
     * 
     * @param updateHealthCheckRequest
     *        A complex type that contains the health check request information.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateHealthCheck operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.UpdateHealthCheck
     */
    java.util.concurrent.Future<UpdateHealthCheckResult> updateHealthCheckAsync(UpdateHealthCheckRequest updateHealthCheckRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateHealthCheckRequest, UpdateHealthCheckResult> asyncHandler);

    /**
     * <p>
     * Updates the hosted zone comment. Send a <code>POST</code> request to the
     * <code>/2013-04-01/hostedzone/<i>hosted zone ID</i> </code> resource.
     * </p>
     * 
     * @param updateHostedZoneCommentRequest
     *        A complex type that contains the hosted zone request information.
     * @return A Java Future containing the result of the UpdateHostedZoneComment operation returned by the service.
     * @sample AmazonRoute53Async.UpdateHostedZoneComment
     */
    java.util.concurrent.Future<UpdateHostedZoneCommentResult> updateHostedZoneCommentAsync(UpdateHostedZoneCommentRequest updateHostedZoneCommentRequest);

    /**
     * <p>
     * Updates the hosted zone comment. Send a <code>POST</code> request to the
     * <code>/2013-04-01/hostedzone/<i>hosted zone ID</i> </code> resource.
     * </p>
     * 
     * @param updateHostedZoneCommentRequest
     *        A complex type that contains the hosted zone request information.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateHostedZoneComment operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.UpdateHostedZoneComment
     */
    java.util.concurrent.Future<UpdateHostedZoneCommentResult> updateHostedZoneCommentAsync(UpdateHostedZoneCommentRequest updateHostedZoneCommentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateHostedZoneCommentRequest, UpdateHostedZoneCommentResult> asyncHandler);

    /**
     * <p>
     * Updates the comment for a specified traffic policy version.
     * </p>
     * <p>
     * Send a <code>POST</code> request to the <code>/2013-04-01/trafficpolicy/</code> resource.
     * </p>
     * <p>
     * The request body must include a document with an <code>UpdateTrafficPolicyCommentRequest</code> element.
     * </p>
     * 
     * @param updateTrafficPolicyCommentRequest
     *        A complex type that contains information about the traffic policy for which you want to update the
     *        comment.
     * @return A Java Future containing the result of the UpdateTrafficPolicyComment operation returned by the service.
     * @sample AmazonRoute53Async.UpdateTrafficPolicyComment
     */
    java.util.concurrent.Future<UpdateTrafficPolicyCommentResult> updateTrafficPolicyCommentAsync(
            UpdateTrafficPolicyCommentRequest updateTrafficPolicyCommentRequest);

    /**
     * <p>
     * Updates the comment for a specified traffic policy version.
     * </p>
     * <p>
     * Send a <code>POST</code> request to the <code>/2013-04-01/trafficpolicy/</code> resource.
     * </p>
     * <p>
     * The request body must include a document with an <code>UpdateTrafficPolicyCommentRequest</code> element.
     * </p>
     * 
     * @param updateTrafficPolicyCommentRequest
     *        A complex type that contains information about the traffic policy for which you want to update the
     *        comment.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTrafficPolicyComment operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.UpdateTrafficPolicyComment
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
     * Send a <code>POST</code> request to the <code>/2013-04-01/trafficpolicyinstance/<i>traffic policy ID</i> </code>
     * resource. The request body must include a document with an <code>UpdateTrafficPolicyInstanceRequest</code>
     * element.
     * </p>
     * <p>
     * When you update a traffic policy instance, Amazon Route 53 continues to respond to DNS queries for the root
     * resource record set name (such as example.com) while it replaces one group of resource record sets with another.
     * Amazon Route 53 performs the following operations:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Amazon Route 53 creates a new group of resource record sets based on the specified traffic policy. This is true
     * regardless of how substantial the differences are between the existing resource record sets and the new resource
     * record sets.
     * </p>
     * </li>
     * <li>
     * <p>
     * When all of the new resource record sets have been created, Amazon Route 53 starts to respond to DNS queries for
     * the root resource record set name (such as example.com) by using the new resource record sets.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Route 53 deletes the old group of resource record sets that are associated with the root resource record
     * set name.
     * </p>
     * </li>
     * </ol>
     * 
     * @param updateTrafficPolicyInstanceRequest
     *        A complex type that contains information about the resource record sets that you want to update based on a
     *        specified traffic policy instance.
     * @return A Java Future containing the result of the UpdateTrafficPolicyInstance operation returned by the service.
     * @sample AmazonRoute53Async.UpdateTrafficPolicyInstance
     */
    java.util.concurrent.Future<UpdateTrafficPolicyInstanceResult> updateTrafficPolicyInstanceAsync(
            UpdateTrafficPolicyInstanceRequest updateTrafficPolicyInstanceRequest);

    /**
     * <p>
     * Updates the resource record sets in a specified hosted zone that were created based on the settings in a
     * specified traffic policy version.
     * </p>
     * <p>
     * Send a <code>POST</code> request to the <code>/2013-04-01/trafficpolicyinstance/<i>traffic policy ID</i> </code>
     * resource. The request body must include a document with an <code>UpdateTrafficPolicyInstanceRequest</code>
     * element.
     * </p>
     * <p>
     * When you update a traffic policy instance, Amazon Route 53 continues to respond to DNS queries for the root
     * resource record set name (such as example.com) while it replaces one group of resource record sets with another.
     * Amazon Route 53 performs the following operations:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Amazon Route 53 creates a new group of resource record sets based on the specified traffic policy. This is true
     * regardless of how substantial the differences are between the existing resource record sets and the new resource
     * record sets.
     * </p>
     * </li>
     * <li>
     * <p>
     * When all of the new resource record sets have been created, Amazon Route 53 starts to respond to DNS queries for
     * the root resource record set name (such as example.com) by using the new resource record sets.
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Route 53 deletes the old group of resource record sets that are associated with the root resource record
     * set name.
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
     */
    java.util.concurrent.Future<UpdateTrafficPolicyInstanceResult> updateTrafficPolicyInstanceAsync(
            UpdateTrafficPolicyInstanceRequest updateTrafficPolicyInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTrafficPolicyInstanceRequest, UpdateTrafficPolicyInstanceResult> asyncHandler);

}
