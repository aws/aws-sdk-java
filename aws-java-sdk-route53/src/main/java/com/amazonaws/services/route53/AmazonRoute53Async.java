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
package com.amazonaws.services.route53;

import com.amazonaws.services.route53.model.*;

/**
 * Interface for accessing Route 53 asynchronously. Each asynchronous method
 * will return a Java Future object representing the asynchronous operation;
 * overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 */
public interface AmazonRoute53Async extends AmazonRoute53 {

    /**
     * <p>
     * This action associates a VPC with an hosted zone.
     * </p>
     * <p>
     * To associate a VPC with an hosted zone, send a <code>POST</code> request
     * to the
     * <code>2015-01-01/hostedzone/<i>hosted zone ID</i>/associatevpc</code>
     * resource. The request body must include an XML document with a
     * <code>AssociateVPCWithHostedZoneRequest</code> element. The response
     * returns the <code>AssociateVPCWithHostedZoneResponse</code> element that
     * contains <code>ChangeInfo</code> for you to track the progress of the
     * <code>AssociateVPCWithHostedZoneRequest</code> you made. See
     * <code>GetChange</code> operation for how to track the progress of your
     * change.
     * </p>
     * 
     * @param associateVPCWithHostedZoneRequest
     *        A complex type that contains information about the request to
     *        associate a VPC with an hosted zone.
     * @return A Java Future containing the result of the
     *         AssociateVPCWithHostedZone operation returned by the service.
     * @sample AmazonRoute53Async.AssociateVPCWithHostedZone
     */
    java.util.concurrent.Future<AssociateVPCWithHostedZoneResult> associateVPCWithHostedZoneAsync(
            AssociateVPCWithHostedZoneRequest associateVPCWithHostedZoneRequest);

    /**
     * <p>
     * This action associates a VPC with an hosted zone.
     * </p>
     * <p>
     * To associate a VPC with an hosted zone, send a <code>POST</code> request
     * to the
     * <code>2015-01-01/hostedzone/<i>hosted zone ID</i>/associatevpc</code>
     * resource. The request body must include an XML document with a
     * <code>AssociateVPCWithHostedZoneRequest</code> element. The response
     * returns the <code>AssociateVPCWithHostedZoneResponse</code> element that
     * contains <code>ChangeInfo</code> for you to track the progress of the
     * <code>AssociateVPCWithHostedZoneRequest</code> you made. See
     * <code>GetChange</code> operation for how to track the progress of your
     * change.
     * </p>
     * 
     * @param associateVPCWithHostedZoneRequest
     *        A complex type that contains information about the request to
     *        associate a VPC with an hosted zone.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         AssociateVPCWithHostedZone operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.AssociateVPCWithHostedZone
     */
    java.util.concurrent.Future<AssociateVPCWithHostedZoneResult> associateVPCWithHostedZoneAsync(
            AssociateVPCWithHostedZoneRequest associateVPCWithHostedZoneRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateVPCWithHostedZoneRequest, AssociateVPCWithHostedZoneResult> asyncHandler);

    /**
     * <p>
     * Use this action to create or change your authoritative DNS information.
     * To use this action, send a <code>POST</code> request to the
     * <code>2015-01-01/hostedzone/<i>hosted Zone ID</i>/rrset</code> resource.
     * The request body must include an XML document with a
     * <code>ChangeResourceRecordSetsRequest</code> element.
     * </p>
     * <p>
     * Changes are a list of change items and are considered transactional. For
     * more information on transactional changes, also known as change batches,
     * see <a
     * href="http://docs.aws.amazon.com/Route53/latest/APIReference/">POST
     * ChangeResourceRecordSets</a> in the <i>Amazon Route 53 API Reference</i>.
     * </p>
     * <important>Due to the nature of transactional changes, you cannot delete
     * the same resource record set more than once in a single change batch. If
     * you attempt to delete the same change batch more than once, Amazon Route
     * 53 returns an <code>InvalidChangeBatch</code> error.</important>
     * <p>
     * In response to a <code>ChangeResourceRecordSets</code> request, your DNS
     * data is changed on all Amazon Route 53 DNS servers. Initially, the status
     * of a change is <code>PENDING</code>. This means the change has not yet
     * propagated to all the authoritative Amazon Route 53 DNS servers. When the
     * change is propagated to all hosts, the change returns a status of
     * <code>INSYNC</code>.
     * </p>
     * <p>
     * Note the following limitations on a <code>ChangeResourceRecordSets</code>
     * request:
     * </p>
     * <ul>
     * <li>A request cannot contain more than 100 Change elements.</li>
     * <li>A request cannot contain more than 1000 ResourceRecord elements.</li>
     * <li>The sum of the number of characters (including spaces) in all
     * <code>Value</code> elements in a request cannot exceed 32,000 characters.
     * </li>
     * </ul>
     * 
     * @param changeResourceRecordSetsRequest
     *        A complex type that contains a change batch.
     * @return A Java Future containing the result of the
     *         ChangeResourceRecordSets operation returned by the service.
     * @sample AmazonRoute53Async.ChangeResourceRecordSets
     */
    java.util.concurrent.Future<ChangeResourceRecordSetsResult> changeResourceRecordSetsAsync(
            ChangeResourceRecordSetsRequest changeResourceRecordSetsRequest);

    /**
     * <p>
     * Use this action to create or change your authoritative DNS information.
     * To use this action, send a <code>POST</code> request to the
     * <code>2015-01-01/hostedzone/<i>hosted Zone ID</i>/rrset</code> resource.
     * The request body must include an XML document with a
     * <code>ChangeResourceRecordSetsRequest</code> element.
     * </p>
     * <p>
     * Changes are a list of change items and are considered transactional. For
     * more information on transactional changes, also known as change batches,
     * see <a
     * href="http://docs.aws.amazon.com/Route53/latest/APIReference/">POST
     * ChangeResourceRecordSets</a> in the <i>Amazon Route 53 API Reference</i>.
     * </p>
     * <important>Due to the nature of transactional changes, you cannot delete
     * the same resource record set more than once in a single change batch. If
     * you attempt to delete the same change batch more than once, Amazon Route
     * 53 returns an <code>InvalidChangeBatch</code> error.</important>
     * <p>
     * In response to a <code>ChangeResourceRecordSets</code> request, your DNS
     * data is changed on all Amazon Route 53 DNS servers. Initially, the status
     * of a change is <code>PENDING</code>. This means the change has not yet
     * propagated to all the authoritative Amazon Route 53 DNS servers. When the
     * change is propagated to all hosts, the change returns a status of
     * <code>INSYNC</code>.
     * </p>
     * <p>
     * Note the following limitations on a <code>ChangeResourceRecordSets</code>
     * request:
     * </p>
     * <ul>
     * <li>A request cannot contain more than 100 Change elements.</li>
     * <li>A request cannot contain more than 1000 ResourceRecord elements.</li>
     * <li>The sum of the number of characters (including spaces) in all
     * <code>Value</code> elements in a request cannot exceed 32,000 characters.
     * </li>
     * </ul>
     * 
     * @param changeResourceRecordSetsRequest
     *        A complex type that contains a change batch.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         ChangeResourceRecordSets operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.ChangeResourceRecordSets
     */
    java.util.concurrent.Future<ChangeResourceRecordSetsResult> changeResourceRecordSetsAsync(
            ChangeResourceRecordSetsRequest changeResourceRecordSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ChangeResourceRecordSetsRequest, ChangeResourceRecordSetsResult> asyncHandler);

    /**
     * @param changeTagsForResourceRequest
     *        A complex type containing information about a request to add,
     *        change, or delete the tags that are associated with a resource.
     * @return A Java Future containing the result of the ChangeTagsForResource
     *         operation returned by the service.
     * @sample AmazonRoute53Async.ChangeTagsForResource
     */
    java.util.concurrent.Future<ChangeTagsForResourceResult> changeTagsForResourceAsync(
            ChangeTagsForResourceRequest changeTagsForResourceRequest);

    /**
     * @param changeTagsForResourceRequest
     *        A complex type containing information about a request to add,
     *        change, or delete the tags that are associated with a resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ChangeTagsForResource
     *         operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.ChangeTagsForResource
     */
    java.util.concurrent.Future<ChangeTagsForResourceResult> changeTagsForResourceAsync(
            ChangeTagsForResourceRequest changeTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ChangeTagsForResourceRequest, ChangeTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * This action creates a new health check.
     * </p>
     * <p>
     * To create a new health check, send a <code>POST</code> request to the
     * <code>2015-01-01/healthcheck</code> resource. The request body must
     * include an XML document with a <code>CreateHealthCheckRequest</code>
     * element. The response returns the <code>CreateHealthCheckResponse</code>
     * element that contains metadata about the health check.
     * </p>
     * 
     * @param createHealthCheckRequest
     *        >A complex type that contains information about the request to
     *        create a health check.
     * @return A Java Future containing the result of the CreateHealthCheck
     *         operation returned by the service.
     * @sample AmazonRoute53Async.CreateHealthCheck
     */
    java.util.concurrent.Future<CreateHealthCheckResult> createHealthCheckAsync(
            CreateHealthCheckRequest createHealthCheckRequest);

    /**
     * <p>
     * This action creates a new health check.
     * </p>
     * <p>
     * To create a new health check, send a <code>POST</code> request to the
     * <code>2015-01-01/healthcheck</code> resource. The request body must
     * include an XML document with a <code>CreateHealthCheckRequest</code>
     * element. The response returns the <code>CreateHealthCheckResponse</code>
     * element that contains metadata about the health check.
     * </p>
     * 
     * @param createHealthCheckRequest
     *        >A complex type that contains information about the request to
     *        create a health check.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateHealthCheck
     *         operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.CreateHealthCheck
     */
    java.util.concurrent.Future<CreateHealthCheckResult> createHealthCheckAsync(
            CreateHealthCheckRequest createHealthCheckRequest,
            com.amazonaws.handlers.AsyncHandler<CreateHealthCheckRequest, CreateHealthCheckResult> asyncHandler);

    /**
     * <p>
     * This action creates a new hosted zone.
     * </p>
     * <p>
     * To create a new hosted zone, send a <code>POST</code> request to the
     * <code>2015-01-01/hostedzone</code> resource. The request body must
     * include an XML document with a <code>CreateHostedZoneRequest</code>
     * element. The response returns the <code>CreateHostedZoneResponse</code>
     * element that contains metadata about the hosted zone.
     * </p>
     * <p>
     * Amazon Route 53 automatically creates a default SOA record and four NS
     * records for the zone. The NS records in the hosted zone are the name
     * servers you give your registrar to delegate your domain to. For more
     * information about SOA and NS records, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/SOA-NSrecords.html"
     * >NS and SOA Records that Amazon Route 53 Creates for a Hosted Zone</a> in
     * the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * When you create a zone, its initial status is <code>PENDING</code>. This
     * means that it is not yet available on all DNS servers. The status of the
     * zone changes to <code>INSYNC</code> when the NS and SOA records are
     * available on all Amazon Route 53 DNS servers.
     * </p>
     * <p>
     * When trying to create a hosted zone using a reusable delegation set, you
     * could specify an optional DelegationSetId, and Route53 would assign those
     * 4 NS records for the zone, instead of alloting a new one.
     * </p>
     * 
     * @param createHostedZoneRequest
     *        A complex type that contains information about the request to
     *        create a hosted zone.
     * @return A Java Future containing the result of the CreateHostedZone
     *         operation returned by the service.
     * @sample AmazonRoute53Async.CreateHostedZone
     */
    java.util.concurrent.Future<CreateHostedZoneResult> createHostedZoneAsync(
            CreateHostedZoneRequest createHostedZoneRequest);

    /**
     * <p>
     * This action creates a new hosted zone.
     * </p>
     * <p>
     * To create a new hosted zone, send a <code>POST</code> request to the
     * <code>2015-01-01/hostedzone</code> resource. The request body must
     * include an XML document with a <code>CreateHostedZoneRequest</code>
     * element. The response returns the <code>CreateHostedZoneResponse</code>
     * element that contains metadata about the hosted zone.
     * </p>
     * <p>
     * Amazon Route 53 automatically creates a default SOA record and four NS
     * records for the zone. The NS records in the hosted zone are the name
     * servers you give your registrar to delegate your domain to. For more
     * information about SOA and NS records, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/SOA-NSrecords.html"
     * >NS and SOA Records that Amazon Route 53 Creates for a Hosted Zone</a> in
     * the <i>Amazon Route 53 Developer Guide</i>.
     * </p>
     * <p>
     * When you create a zone, its initial status is <code>PENDING</code>. This
     * means that it is not yet available on all DNS servers. The status of the
     * zone changes to <code>INSYNC</code> when the NS and SOA records are
     * available on all Amazon Route 53 DNS servers.
     * </p>
     * <p>
     * When trying to create a hosted zone using a reusable delegation set, you
     * could specify an optional DelegationSetId, and Route53 would assign those
     * 4 NS records for the zone, instead of alloting a new one.
     * </p>
     * 
     * @param createHostedZoneRequest
     *        A complex type that contains information about the request to
     *        create a hosted zone.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateHostedZone
     *         operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.CreateHostedZone
     */
    java.util.concurrent.Future<CreateHostedZoneResult> createHostedZoneAsync(
            CreateHostedZoneRequest createHostedZoneRequest,
            com.amazonaws.handlers.AsyncHandler<CreateHostedZoneRequest, CreateHostedZoneResult> asyncHandler);

    /**
     * <p>
     * This action creates a reusable delegationSet.
     * </p>
     * <p>
     * To create a new reusable delegationSet, send a <code>POST</code> request
     * to the <code>2015-01-01/delegationset</code> resource. The request body
     * must include an XML document with a
     * <code>CreateReusableDelegationSetRequest</code> element. The response
     * returns the <code>CreateReusableDelegationSetResponse</code> element that
     * contains metadata about the delegationSet.
     * </p>
     * <p>
     * If the optional parameter HostedZoneId is specified, it marks the
     * delegationSet associated with that particular hosted zone as reusable.
     * </p>
     * 
     * @param createReusableDelegationSetRequest
     * @return A Java Future containing the result of the
     *         CreateReusableDelegationSet operation returned by the service.
     * @sample AmazonRoute53Async.CreateReusableDelegationSet
     */
    java.util.concurrent.Future<CreateReusableDelegationSetResult> createReusableDelegationSetAsync(
            CreateReusableDelegationSetRequest createReusableDelegationSetRequest);

    /**
     * <p>
     * This action creates a reusable delegationSet.
     * </p>
     * <p>
     * To create a new reusable delegationSet, send a <code>POST</code> request
     * to the <code>2015-01-01/delegationset</code> resource. The request body
     * must include an XML document with a
     * <code>CreateReusableDelegationSetRequest</code> element. The response
     * returns the <code>CreateReusableDelegationSetResponse</code> element that
     * contains metadata about the delegationSet.
     * </p>
     * <p>
     * If the optional parameter HostedZoneId is specified, it marks the
     * delegationSet associated with that particular hosted zone as reusable.
     * </p>
     * 
     * @param createReusableDelegationSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         CreateReusableDelegationSet operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.CreateReusableDelegationSet
     */
    java.util.concurrent.Future<CreateReusableDelegationSetResult> createReusableDelegationSetAsync(
            CreateReusableDelegationSetRequest createReusableDelegationSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateReusableDelegationSetRequest, CreateReusableDelegationSetResult> asyncHandler);

    /**
     * <p>
     * Creates a traffic policy, which you use to create multiple DNS resource
     * record sets for one domain name (such as example.com) or one subdomain
     * name (such as www.example.com).
     * </p>
     * <p>
     * To create a traffic policy, send a <code>POST</code> request to the
     * <code>2015-01-01/trafficpolicy</code> resource. The request body must
     * include an XML document with a <code>CreateTrafficPolicyRequest</code>
     * element. The response includes the
     * <code>CreateTrafficPolicyResponse</code> element, which contains
     * information about the new traffic policy.
     * </p>
     * 
     * @param createTrafficPolicyRequest
     *        A complex type that contains information about the traffic policy
     *        that you want to create.
     * @return A Java Future containing the result of the CreateTrafficPolicy
     *         operation returned by the service.
     * @sample AmazonRoute53Async.CreateTrafficPolicy
     */
    java.util.concurrent.Future<CreateTrafficPolicyResult> createTrafficPolicyAsync(
            CreateTrafficPolicyRequest createTrafficPolicyRequest);

    /**
     * <p>
     * Creates a traffic policy, which you use to create multiple DNS resource
     * record sets for one domain name (such as example.com) or one subdomain
     * name (such as www.example.com).
     * </p>
     * <p>
     * To create a traffic policy, send a <code>POST</code> request to the
     * <code>2015-01-01/trafficpolicy</code> resource. The request body must
     * include an XML document with a <code>CreateTrafficPolicyRequest</code>
     * element. The response includes the
     * <code>CreateTrafficPolicyResponse</code> element, which contains
     * information about the new traffic policy.
     * </p>
     * 
     * @param createTrafficPolicyRequest
     *        A complex type that contains information about the traffic policy
     *        that you want to create.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTrafficPolicy
     *         operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.CreateTrafficPolicy
     */
    java.util.concurrent.Future<CreateTrafficPolicyResult> createTrafficPolicyAsync(
            CreateTrafficPolicyRequest createTrafficPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTrafficPolicyRequest, CreateTrafficPolicyResult> asyncHandler);

    /**
     * <p>
     * Creates resource record sets in a specified hosted zone based on the
     * settings in a specified traffic policy version. In addition,
     * <code>CreateTrafficPolicyInstance</code> associates the resource record
     * sets with a specified domain name (such as example.com) or subdomain name
     * (such as www.example.com). Amazon Route 53 responds to DNS queries for
     * the domain or subdomain name by using the resource record sets that
     * <code>CreateTrafficPolicyInstance</code> created.
     * </p>
     * <p>
     * To create a traffic policy instance, send a <code>POST</code> request to
     * the <code>2015-01-01/trafficpolicyinstance</code> resource. The request
     * body must include an XML document with a
     * <code>CreateTrafficPolicyRequest</code> element. The response returns the
     * <code>CreateTrafficPolicyInstanceResponse</code> element, which contains
     * information about the traffic policy instance.
     * </p>
     * 
     * @param createTrafficPolicyInstanceRequest
     *        A complex type that contains information about the resource record
     *        sets that you want to create based on a specified traffic policy.
     * @return A Java Future containing the result of the
     *         CreateTrafficPolicyInstance operation returned by the service.
     * @sample AmazonRoute53Async.CreateTrafficPolicyInstance
     */
    java.util.concurrent.Future<CreateTrafficPolicyInstanceResult> createTrafficPolicyInstanceAsync(
            CreateTrafficPolicyInstanceRequest createTrafficPolicyInstanceRequest);

    /**
     * <p>
     * Creates resource record sets in a specified hosted zone based on the
     * settings in a specified traffic policy version. In addition,
     * <code>CreateTrafficPolicyInstance</code> associates the resource record
     * sets with a specified domain name (such as example.com) or subdomain name
     * (such as www.example.com). Amazon Route 53 responds to DNS queries for
     * the domain or subdomain name by using the resource record sets that
     * <code>CreateTrafficPolicyInstance</code> created.
     * </p>
     * <p>
     * To create a traffic policy instance, send a <code>POST</code> request to
     * the <code>2015-01-01/trafficpolicyinstance</code> resource. The request
     * body must include an XML document with a
     * <code>CreateTrafficPolicyRequest</code> element. The response returns the
     * <code>CreateTrafficPolicyInstanceResponse</code> element, which contains
     * information about the traffic policy instance.
     * </p>
     * 
     * @param createTrafficPolicyInstanceRequest
     *        A complex type that contains information about the resource record
     *        sets that you want to create based on a specified traffic policy.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         CreateTrafficPolicyInstance operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.CreateTrafficPolicyInstance
     */
    java.util.concurrent.Future<CreateTrafficPolicyInstanceResult> createTrafficPolicyInstanceAsync(
            CreateTrafficPolicyInstanceRequest createTrafficPolicyInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTrafficPolicyInstanceRequest, CreateTrafficPolicyInstanceResult> asyncHandler);

    /**
     * <p>
     * Creates a new version of an existing traffic policy. When you create a
     * new version of a traffic policy, you specify the ID of the traffic policy
     * that you want to update and a JSON-formatted document that describes the
     * new version.
     * </p>
     * <p>
     * You use traffic policies to create multiple DNS resource record sets for
     * one domain name (such as example.com) or one subdomain name (such as
     * www.example.com).
     * </p>
     * <p>
     * To create a new version, send a <code>POST</code> request to the
     * <code>2015-01-01/trafficpolicy/</code> resource. The request body
     * includes an XML document with a
     * <code>CreateTrafficPolicyVersionRequest</code> element. The response
     * returns the <code>CreateTrafficPolicyVersionResponse</code> element,
     * which contains information about the new version of the traffic policy.
     * </p>
     * 
     * @param createTrafficPolicyVersionRequest
     *        A complex type that contains information about the traffic policy
     *        for which you want to create a new version.
     * @return A Java Future containing the result of the
     *         CreateTrafficPolicyVersion operation returned by the service.
     * @sample AmazonRoute53Async.CreateTrafficPolicyVersion
     */
    java.util.concurrent.Future<CreateTrafficPolicyVersionResult> createTrafficPolicyVersionAsync(
            CreateTrafficPolicyVersionRequest createTrafficPolicyVersionRequest);

    /**
     * <p>
     * Creates a new version of an existing traffic policy. When you create a
     * new version of a traffic policy, you specify the ID of the traffic policy
     * that you want to update and a JSON-formatted document that describes the
     * new version.
     * </p>
     * <p>
     * You use traffic policies to create multiple DNS resource record sets for
     * one domain name (such as example.com) or one subdomain name (such as
     * www.example.com).
     * </p>
     * <p>
     * To create a new version, send a <code>POST</code> request to the
     * <code>2015-01-01/trafficpolicy/</code> resource. The request body
     * includes an XML document with a
     * <code>CreateTrafficPolicyVersionRequest</code> element. The response
     * returns the <code>CreateTrafficPolicyVersionResponse</code> element,
     * which contains information about the new version of the traffic policy.
     * </p>
     * 
     * @param createTrafficPolicyVersionRequest
     *        A complex type that contains information about the traffic policy
     *        for which you want to create a new version.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         CreateTrafficPolicyVersion operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.CreateTrafficPolicyVersion
     */
    java.util.concurrent.Future<CreateTrafficPolicyVersionResult> createTrafficPolicyVersionAsync(
            CreateTrafficPolicyVersionRequest createTrafficPolicyVersionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTrafficPolicyVersionRequest, CreateTrafficPolicyVersionResult> asyncHandler);

    /**
     * <p>
     * This action deletes a health check. To delete a health check, send a
     * <code>DELETE</code> request to the
     * <code>2015-01-01/healthcheck/<i>health check ID</i></code> resource.
     * </p>
     * <important> You can delete a health check only if there are no resource
     * record sets associated with this health check. If resource record sets
     * are associated with this health check, you must disassociate them before
     * you can delete your health check. If you try to delete a health check
     * that is associated with resource record sets, Amazon Route 53 will deny
     * your request with a <code>HealthCheckInUse</code> error. For information
     * about disassociating the records from your health check, see
     * <a>ChangeResourceRecordSets</a>.</important>
     * 
     * @param deleteHealthCheckRequest
     *        A complex type containing the request information for delete
     *        health check.
     * @return A Java Future containing the result of the DeleteHealthCheck
     *         operation returned by the service.
     * @sample AmazonRoute53Async.DeleteHealthCheck
     */
    java.util.concurrent.Future<DeleteHealthCheckResult> deleteHealthCheckAsync(
            DeleteHealthCheckRequest deleteHealthCheckRequest);

    /**
     * <p>
     * This action deletes a health check. To delete a health check, send a
     * <code>DELETE</code> request to the
     * <code>2015-01-01/healthcheck/<i>health check ID</i></code> resource.
     * </p>
     * <important> You can delete a health check only if there are no resource
     * record sets associated with this health check. If resource record sets
     * are associated with this health check, you must disassociate them before
     * you can delete your health check. If you try to delete a health check
     * that is associated with resource record sets, Amazon Route 53 will deny
     * your request with a <code>HealthCheckInUse</code> error. For information
     * about disassociating the records from your health check, see
     * <a>ChangeResourceRecordSets</a>.</important>
     * 
     * @param deleteHealthCheckRequest
     *        A complex type containing the request information for delete
     *        health check.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteHealthCheck
     *         operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.DeleteHealthCheck
     */
    java.util.concurrent.Future<DeleteHealthCheckResult> deleteHealthCheckAsync(
            DeleteHealthCheckRequest deleteHealthCheckRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteHealthCheckRequest, DeleteHealthCheckResult> asyncHandler);

    /**
     * <p>
     * This action deletes a hosted zone. To delete a hosted zone, send a
     * <code>DELETE</code> request to the
     * <code>2015-01-01/hostedzone/<i>hosted zone ID</i></code> resource.
     * </p>
     * <p>
     * For more information about deleting a hosted zone, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DeleteHostedZone.html"
     * >Deleting a Hosted Zone</a> in the <i>Amazon Route 53 Developer
     * Guide</i>.
     * </p>
     * <important> You can delete a hosted zone only if there are no resource
     * record sets other than the default SOA record and NS resource record
     * sets. If your hosted zone contains other resource record sets, you must
     * delete them before you can delete your hosted zone. If you try to delete
     * a hosted zone that contains other resource record sets, Amazon Route 53
     * will deny your request with a <code>HostedZoneNotEmpty</code> error. For
     * information about deleting records from your hosted zone, see
     * <a>ChangeResourceRecordSets</a>.</important>
     * 
     * @param deleteHostedZoneRequest
     *        A complex type that contains information about the hosted zone
     *        that you want to delete.
     * @return A Java Future containing the result of the DeleteHostedZone
     *         operation returned by the service.
     * @sample AmazonRoute53Async.DeleteHostedZone
     */
    java.util.concurrent.Future<DeleteHostedZoneResult> deleteHostedZoneAsync(
            DeleteHostedZoneRequest deleteHostedZoneRequest);

    /**
     * <p>
     * This action deletes a hosted zone. To delete a hosted zone, send a
     * <code>DELETE</code> request to the
     * <code>2015-01-01/hostedzone/<i>hosted zone ID</i></code> resource.
     * </p>
     * <p>
     * For more information about deleting a hosted zone, see <a href=
     * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DeleteHostedZone.html"
     * >Deleting a Hosted Zone</a> in the <i>Amazon Route 53 Developer
     * Guide</i>.
     * </p>
     * <important> You can delete a hosted zone only if there are no resource
     * record sets other than the default SOA record and NS resource record
     * sets. If your hosted zone contains other resource record sets, you must
     * delete them before you can delete your hosted zone. If you try to delete
     * a hosted zone that contains other resource record sets, Amazon Route 53
     * will deny your request with a <code>HostedZoneNotEmpty</code> error. For
     * information about deleting records from your hosted zone, see
     * <a>ChangeResourceRecordSets</a>.</important>
     * 
     * @param deleteHostedZoneRequest
     *        A complex type that contains information about the hosted zone
     *        that you want to delete.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteHostedZone
     *         operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.DeleteHostedZone
     */
    java.util.concurrent.Future<DeleteHostedZoneResult> deleteHostedZoneAsync(
            DeleteHostedZoneRequest deleteHostedZoneRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteHostedZoneRequest, DeleteHostedZoneResult> asyncHandler);

    /**
     * <p>
     * This action deletes a reusable delegation set. To delete a reusable
     * delegation set, send a <code>DELETE</code> request to the
     * <code>2015-01-01/delegationset/<i>delegation set ID</i></code> resource.
     * </p>
     * <important> You can delete a reusable delegation set only if there are no
     * associated hosted zones. If your reusable delegation set contains
     * associated hosted zones, you must delete them before you can delete your
     * reusable delegation set. If you try to delete a reusable delegation set
     * that contains associated hosted zones, Amazon Route 53 will deny your
     * request with a <code>DelegationSetInUse</code> error.</important>
     * 
     * @param deleteReusableDelegationSetRequest
     *        A complex type containing the information for the delete request.
     * @return A Java Future containing the result of the
     *         DeleteReusableDelegationSet operation returned by the service.
     * @sample AmazonRoute53Async.DeleteReusableDelegationSet
     */
    java.util.concurrent.Future<DeleteReusableDelegationSetResult> deleteReusableDelegationSetAsync(
            DeleteReusableDelegationSetRequest deleteReusableDelegationSetRequest);

    /**
     * <p>
     * This action deletes a reusable delegation set. To delete a reusable
     * delegation set, send a <code>DELETE</code> request to the
     * <code>2015-01-01/delegationset/<i>delegation set ID</i></code> resource.
     * </p>
     * <important> You can delete a reusable delegation set only if there are no
     * associated hosted zones. If your reusable delegation set contains
     * associated hosted zones, you must delete them before you can delete your
     * reusable delegation set. If you try to delete a reusable delegation set
     * that contains associated hosted zones, Amazon Route 53 will deny your
     * request with a <code>DelegationSetInUse</code> error.</important>
     * 
     * @param deleteReusableDelegationSetRequest
     *        A complex type containing the information for the delete request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DeleteReusableDelegationSet operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.DeleteReusableDelegationSet
     */
    java.util.concurrent.Future<DeleteReusableDelegationSetResult> deleteReusableDelegationSetAsync(
            DeleteReusableDelegationSetRequest deleteReusableDelegationSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteReusableDelegationSetRequest, DeleteReusableDelegationSetResult> asyncHandler);

    /**
     * <p>
     * Deletes a traffic policy. To delete a traffic policy, send a
     * <code>DELETE</code> request to the <code>2015-01-01/trafficpolicy</code>
     * resource.
     * </p>
     * 
     * @param deleteTrafficPolicyRequest
     *        A request to delete a specified traffic policy version.
     * @return A Java Future containing the result of the DeleteTrafficPolicy
     *         operation returned by the service.
     * @sample AmazonRoute53Async.DeleteTrafficPolicy
     */
    java.util.concurrent.Future<DeleteTrafficPolicyResult> deleteTrafficPolicyAsync(
            DeleteTrafficPolicyRequest deleteTrafficPolicyRequest);

    /**
     * <p>
     * Deletes a traffic policy. To delete a traffic policy, send a
     * <code>DELETE</code> request to the <code>2015-01-01/trafficpolicy</code>
     * resource.
     * </p>
     * 
     * @param deleteTrafficPolicyRequest
     *        A request to delete a specified traffic policy version.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTrafficPolicy
     *         operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.DeleteTrafficPolicy
     */
    java.util.concurrent.Future<DeleteTrafficPolicyResult> deleteTrafficPolicyAsync(
            DeleteTrafficPolicyRequest deleteTrafficPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTrafficPolicyRequest, DeleteTrafficPolicyResult> asyncHandler);

    /**
     * <p>
     * Deletes a traffic policy instance and all of the resource record sets
     * that Amazon Route 53 created when you created the instance.
     * </p>
     * <p>
     * To delete a traffic policy instance, send a <code>DELETE</code> request
     * to the
     * <code>2015-01-01/trafficpolicy/<i>traffic policy instance ID</i></code>
     * resource.
     * </p>
     * <important>When you delete a traffic policy instance, Amazon Route 53
     * also deletes all of the resource record sets that were created when you
     * created the traffic policy instance.</important>
     * 
     * @param deleteTrafficPolicyInstanceRequest
     *        A complex type that contains information about the traffic policy
     *        instance that you want to delete.
     * @return A Java Future containing the result of the
     *         DeleteTrafficPolicyInstance operation returned by the service.
     * @sample AmazonRoute53Async.DeleteTrafficPolicyInstance
     */
    java.util.concurrent.Future<DeleteTrafficPolicyInstanceResult> deleteTrafficPolicyInstanceAsync(
            DeleteTrafficPolicyInstanceRequest deleteTrafficPolicyInstanceRequest);

    /**
     * <p>
     * Deletes a traffic policy instance and all of the resource record sets
     * that Amazon Route 53 created when you created the instance.
     * </p>
     * <p>
     * To delete a traffic policy instance, send a <code>DELETE</code> request
     * to the
     * <code>2015-01-01/trafficpolicy/<i>traffic policy instance ID</i></code>
     * resource.
     * </p>
     * <important>When you delete a traffic policy instance, Amazon Route 53
     * also deletes all of the resource record sets that were created when you
     * created the traffic policy instance.</important>
     * 
     * @param deleteTrafficPolicyInstanceRequest
     *        A complex type that contains information about the traffic policy
     *        instance that you want to delete.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DeleteTrafficPolicyInstance operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.DeleteTrafficPolicyInstance
     */
    java.util.concurrent.Future<DeleteTrafficPolicyInstanceResult> deleteTrafficPolicyInstanceAsync(
            DeleteTrafficPolicyInstanceRequest deleteTrafficPolicyInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTrafficPolicyInstanceRequest, DeleteTrafficPolicyInstanceResult> asyncHandler);

    /**
     * <p>
     * This action disassociates a VPC from an hosted zone.
     * </p>
     * <p>
     * To disassociate a VPC to a hosted zone, send a <code>POST</code> request
     * to the
     * <code>2015-01-01/hostedzone/<i>hosted zone ID</i>/disassociatevpc</code>
     * resource. The request body must include an XML document with a
     * <code>DisassociateVPCFromHostedZoneRequest</code> element. The response
     * returns the <code>DisassociateVPCFromHostedZoneResponse</code> element
     * that contains <code>ChangeInfo</code> for you to track the progress of
     * the <code>DisassociateVPCFromHostedZoneRequest</code> you made. See
     * <code>GetChange</code> operation for how to track the progress of your
     * change.
     * </p>
     * 
     * @param disassociateVPCFromHostedZoneRequest
     *        A complex type that contains information about the request to
     *        disassociate a VPC from an hosted zone.
     * @return A Java Future containing the result of the
     *         DisassociateVPCFromHostedZone operation returned by the service.
     * @sample AmazonRoute53Async.DisassociateVPCFromHostedZone
     */
    java.util.concurrent.Future<DisassociateVPCFromHostedZoneResult> disassociateVPCFromHostedZoneAsync(
            DisassociateVPCFromHostedZoneRequest disassociateVPCFromHostedZoneRequest);

    /**
     * <p>
     * This action disassociates a VPC from an hosted zone.
     * </p>
     * <p>
     * To disassociate a VPC to a hosted zone, send a <code>POST</code> request
     * to the
     * <code>2015-01-01/hostedzone/<i>hosted zone ID</i>/disassociatevpc</code>
     * resource. The request body must include an XML document with a
     * <code>DisassociateVPCFromHostedZoneRequest</code> element. The response
     * returns the <code>DisassociateVPCFromHostedZoneResponse</code> element
     * that contains <code>ChangeInfo</code> for you to track the progress of
     * the <code>DisassociateVPCFromHostedZoneRequest</code> you made. See
     * <code>GetChange</code> operation for how to track the progress of your
     * change.
     * </p>
     * 
     * @param disassociateVPCFromHostedZoneRequest
     *        A complex type that contains information about the request to
     *        disassociate a VPC from an hosted zone.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DisassociateVPCFromHostedZone operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.DisassociateVPCFromHostedZone
     */
    java.util.concurrent.Future<DisassociateVPCFromHostedZoneResult> disassociateVPCFromHostedZoneAsync(
            DisassociateVPCFromHostedZoneRequest disassociateVPCFromHostedZoneRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateVPCFromHostedZoneRequest, DisassociateVPCFromHostedZoneResult> asyncHandler);

    /**
     * <p>
     * This action returns the current status of a change batch request. The
     * status is one of the following values:
     * </p>
     * <p>
     * - <code>PENDING</code> indicates that the changes in this request have
     * not replicated to all Amazon Route 53 DNS servers. This is the initial
     * status of all change batch requests.
     * </p>
     * <p>
     * - <code>INSYNC</code> indicates that the changes have replicated to all
     * Amazon Route 53 DNS servers.
     * </p>
     * 
     * @param getChangeRequest
     *        The input for a GetChange request.
     * @return A Java Future containing the result of the GetChange operation
     *         returned by the service.
     * @sample AmazonRoute53Async.GetChange
     */
    java.util.concurrent.Future<GetChangeResult> getChangeAsync(
            GetChangeRequest getChangeRequest);

    /**
     * <p>
     * This action returns the current status of a change batch request. The
     * status is one of the following values:
     * </p>
     * <p>
     * - <code>PENDING</code> indicates that the changes in this request have
     * not replicated to all Amazon Route 53 DNS servers. This is the initial
     * status of all change batch requests.
     * </p>
     * <p>
     * - <code>INSYNC</code> indicates that the changes have replicated to all
     * Amazon Route 53 DNS servers.
     * </p>
     * 
     * @param getChangeRequest
     *        The input for a GetChange request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetChange operation
     *         returned by the service.
     * @sample AmazonRoute53AsyncHandler.GetChange
     */
    java.util.concurrent.Future<GetChangeResult> getChangeAsync(
            GetChangeRequest getChangeRequest,
            com.amazonaws.handlers.AsyncHandler<GetChangeRequest, GetChangeResult> asyncHandler);

    /**
     * <p>
     * This action returns the status and changes of a change batch request.
     * </p>
     * 
     * @param getChangeDetailsRequest
     *        The input for a GetChangeDetails request.
     * @return A Java Future containing the result of the GetChangeDetails
     *         operation returned by the service.
     * @sample AmazonRoute53Async.GetChangeDetails
     */
    java.util.concurrent.Future<GetChangeDetailsResult> getChangeDetailsAsync(
            GetChangeDetailsRequest getChangeDetailsRequest);

    /**
     * <p>
     * This action returns the status and changes of a change batch request.
     * </p>
     * 
     * @param getChangeDetailsRequest
     *        The input for a GetChangeDetails request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetChangeDetails
     *         operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.GetChangeDetails
     */
    java.util.concurrent.Future<GetChangeDetailsResult> getChangeDetailsAsync(
            GetChangeDetailsRequest getChangeDetailsRequest,
            com.amazonaws.handlers.AsyncHandler<GetChangeDetailsRequest, GetChangeDetailsResult> asyncHandler);

    /**
     * <p>
     * To retrieve a list of the IP ranges used by Amazon Route 53 health
     * checkers to check the health of your resources, send a <code>GET</code>
     * request to the <code>2015-01-01/checkeripranges</code> resource. You can
     * use these IP addresses to configure router and firewall rules to allow
     * health checkers to check the health of your resources.
     * </p>
     * 
     * @param getCheckerIpRangesRequest
     *        Empty request.
     * @return A Java Future containing the result of the GetCheckerIpRanges
     *         operation returned by the service.
     * @sample AmazonRoute53Async.GetCheckerIpRanges
     */
    java.util.concurrent.Future<GetCheckerIpRangesResult> getCheckerIpRangesAsync(
            GetCheckerIpRangesRequest getCheckerIpRangesRequest);

    /**
     * <p>
     * To retrieve a list of the IP ranges used by Amazon Route 53 health
     * checkers to check the health of your resources, send a <code>GET</code>
     * request to the <code>2015-01-01/checkeripranges</code> resource. You can
     * use these IP addresses to configure router and firewall rules to allow
     * health checkers to check the health of your resources.
     * </p>
     * 
     * @param getCheckerIpRangesRequest
     *        Empty request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCheckerIpRanges
     *         operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.GetCheckerIpRanges
     */
    java.util.concurrent.Future<GetCheckerIpRangesResult> getCheckerIpRangesAsync(
            GetCheckerIpRangesRequest getCheckerIpRangesRequest,
            com.amazonaws.handlers.AsyncHandler<GetCheckerIpRangesRequest, GetCheckerIpRangesResult> asyncHandler);

    /**
     * Simplified method form for invoking the GetCheckerIpRanges operation.
     *
     * @see #getCheckerIpRangesAsync(GetCheckerIpRangesRequest)
     */
    java.util.concurrent.Future<GetCheckerIpRangesResult> getCheckerIpRangesAsync();

    /**
     * Simplified method form for invoking the GetCheckerIpRanges operation with
     * an AsyncHandler.
     *
     * @see #getCheckerIpRangesAsync(GetCheckerIpRangesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<GetCheckerIpRangesResult> getCheckerIpRangesAsync(
            com.amazonaws.handlers.AsyncHandler<GetCheckerIpRangesRequest, GetCheckerIpRangesResult> asyncHandler);

    /**
     * <p>
     * To retrieve a single geo location, send a <code>GET</code> request to the
     * <code>2015-01-01/geolocation</code> resource with one of these options:
     * continentcode | countrycode | countrycode and subdivisioncode.
     * </p>
     * 
     * @param getGeoLocationRequest
     *        A complex type that contains information about the request to get
     *        a geo location.
     * @return A Java Future containing the result of the GetGeoLocation
     *         operation returned by the service.
     * @sample AmazonRoute53Async.GetGeoLocation
     */
    java.util.concurrent.Future<GetGeoLocationResult> getGeoLocationAsync(
            GetGeoLocationRequest getGeoLocationRequest);

    /**
     * <p>
     * To retrieve a single geo location, send a <code>GET</code> request to the
     * <code>2015-01-01/geolocation</code> resource with one of these options:
     * continentcode | countrycode | countrycode and subdivisioncode.
     * </p>
     * 
     * @param getGeoLocationRequest
     *        A complex type that contains information about the request to get
     *        a geo location.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGeoLocation
     *         operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.GetGeoLocation
     */
    java.util.concurrent.Future<GetGeoLocationResult> getGeoLocationAsync(
            GetGeoLocationRequest getGeoLocationRequest,
            com.amazonaws.handlers.AsyncHandler<GetGeoLocationRequest, GetGeoLocationResult> asyncHandler);

    /**
     * Simplified method form for invoking the GetGeoLocation operation.
     *
     * @see #getGeoLocationAsync(GetGeoLocationRequest)
     */
    java.util.concurrent.Future<GetGeoLocationResult> getGeoLocationAsync();

    /**
     * Simplified method form for invoking the GetGeoLocation operation with an
     * AsyncHandler.
     *
     * @see #getGeoLocationAsync(GetGeoLocationRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<GetGeoLocationResult> getGeoLocationAsync(
            com.amazonaws.handlers.AsyncHandler<GetGeoLocationRequest, GetGeoLocationResult> asyncHandler);

    /**
     * <p>
     * To retrieve the health check, send a <code>GET</code> request to the
     * <code>2015-01-01/healthcheck/<i>health check ID</i></code> resource.
     * </p>
     * 
     * @param getHealthCheckRequest
     *        A complex type that contains information about the request to get
     *        a health check.
     * @return A Java Future containing the result of the GetHealthCheck
     *         operation returned by the service.
     * @sample AmazonRoute53Async.GetHealthCheck
     */
    java.util.concurrent.Future<GetHealthCheckResult> getHealthCheckAsync(
            GetHealthCheckRequest getHealthCheckRequest);

    /**
     * <p>
     * To retrieve the health check, send a <code>GET</code> request to the
     * <code>2015-01-01/healthcheck/<i>health check ID</i></code> resource.
     * </p>
     * 
     * @param getHealthCheckRequest
     *        A complex type that contains information about the request to get
     *        a health check.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetHealthCheck
     *         operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.GetHealthCheck
     */
    java.util.concurrent.Future<GetHealthCheckResult> getHealthCheckAsync(
            GetHealthCheckRequest getHealthCheckRequest,
            com.amazonaws.handlers.AsyncHandler<GetHealthCheckRequest, GetHealthCheckResult> asyncHandler);

    /**
     * <p>
     * To retrieve a count of all your health checks, send a <code>GET</code>
     * request to the <code>2015-01-01/healthcheckcount</code> resource.
     * </p>
     * 
     * @param getHealthCheckCountRequest
     *        To retrieve a count of all your health checks, send a
     *        <code>GET</code> request to the
     *        <code>2015-01-01/healthcheckcount</code> resource.
     * @return A Java Future containing the result of the GetHealthCheckCount
     *         operation returned by the service.
     * @sample AmazonRoute53Async.GetHealthCheckCount
     */
    java.util.concurrent.Future<GetHealthCheckCountResult> getHealthCheckCountAsync(
            GetHealthCheckCountRequest getHealthCheckCountRequest);

    /**
     * <p>
     * To retrieve a count of all your health checks, send a <code>GET</code>
     * request to the <code>2015-01-01/healthcheckcount</code> resource.
     * </p>
     * 
     * @param getHealthCheckCountRequest
     *        To retrieve a count of all your health checks, send a
     *        <code>GET</code> request to the
     *        <code>2015-01-01/healthcheckcount</code> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetHealthCheckCount
     *         operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.GetHealthCheckCount
     */
    java.util.concurrent.Future<GetHealthCheckCountResult> getHealthCheckCountAsync(
            GetHealthCheckCountRequest getHealthCheckCountRequest,
            com.amazonaws.handlers.AsyncHandler<GetHealthCheckCountRequest, GetHealthCheckCountResult> asyncHandler);

    /**
     * Simplified method form for invoking the GetHealthCheckCount operation.
     *
     * @see #getHealthCheckCountAsync(GetHealthCheckCountRequest)
     */
    java.util.concurrent.Future<GetHealthCheckCountResult> getHealthCheckCountAsync();

    /**
     * Simplified method form for invoking the GetHealthCheckCount operation
     * with an AsyncHandler.
     *
     * @see #getHealthCheckCountAsync(GetHealthCheckCountRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<GetHealthCheckCountResult> getHealthCheckCountAsync(
            com.amazonaws.handlers.AsyncHandler<GetHealthCheckCountRequest, GetHealthCheckCountResult> asyncHandler);

    /**
     * <p>
     * If you want to learn why a health check is currently failing or why it
     * failed most recently (if at all), you can get the failure reason for the
     * most recent failure. Send a <code>GET</code> request to the
     * <code>2015-01-01/healthcheck/<i>health check ID</i>/lastfailurereason</code>
     * resource.
     * </p>
     * 
     * @param getHealthCheckLastFailureReasonRequest
     *        A complex type that contains information about the request to get
     *        the most recent failure reason for a health check.
     * @return A Java Future containing the result of the
     *         GetHealthCheckLastFailureReason operation returned by the
     *         service.
     * @sample AmazonRoute53Async.GetHealthCheckLastFailureReason
     */
    java.util.concurrent.Future<GetHealthCheckLastFailureReasonResult> getHealthCheckLastFailureReasonAsync(
            GetHealthCheckLastFailureReasonRequest getHealthCheckLastFailureReasonRequest);

    /**
     * <p>
     * If you want to learn why a health check is currently failing or why it
     * failed most recently (if at all), you can get the failure reason for the
     * most recent failure. Send a <code>GET</code> request to the
     * <code>2015-01-01/healthcheck/<i>health check ID</i>/lastfailurereason</code>
     * resource.
     * </p>
     * 
     * @param getHealthCheckLastFailureReasonRequest
     *        A complex type that contains information about the request to get
     *        the most recent failure reason for a health check.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         GetHealthCheckLastFailureReason operation returned by the
     *         service.
     * @sample AmazonRoute53AsyncHandler.GetHealthCheckLastFailureReason
     */
    java.util.concurrent.Future<GetHealthCheckLastFailureReasonResult> getHealthCheckLastFailureReasonAsync(
            GetHealthCheckLastFailureReasonRequest getHealthCheckLastFailureReasonRequest,
            com.amazonaws.handlers.AsyncHandler<GetHealthCheckLastFailureReasonRequest, GetHealthCheckLastFailureReasonResult> asyncHandler);

    /**
     * <p>
     * To retrieve the health check status, send a <code>GET</code> request to
     * the <code>2015-01-01/healthcheck/<i>health check ID</i>/status</code>
     * resource. You can use this call to get a health check's current status.
     * </p>
     * 
     * @param getHealthCheckStatusRequest
     *        A complex type that contains information about the request to get
     *        health check status for a health check.
     * @return A Java Future containing the result of the GetHealthCheckStatus
     *         operation returned by the service.
     * @sample AmazonRoute53Async.GetHealthCheckStatus
     */
    java.util.concurrent.Future<GetHealthCheckStatusResult> getHealthCheckStatusAsync(
            GetHealthCheckStatusRequest getHealthCheckStatusRequest);

    /**
     * <p>
     * To retrieve the health check status, send a <code>GET</code> request to
     * the <code>2015-01-01/healthcheck/<i>health check ID</i>/status</code>
     * resource. You can use this call to get a health check's current status.
     * </p>
     * 
     * @param getHealthCheckStatusRequest
     *        A complex type that contains information about the request to get
     *        health check status for a health check.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetHealthCheckStatus
     *         operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.GetHealthCheckStatus
     */
    java.util.concurrent.Future<GetHealthCheckStatusResult> getHealthCheckStatusAsync(
            GetHealthCheckStatusRequest getHealthCheckStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetHealthCheckStatusRequest, GetHealthCheckStatusResult> asyncHandler);

    /**
     * <p>
     * To retrieve the delegation set for a hosted zone, send a <code>GET</code>
     * request to the <code>2015-01-01/hostedzone/<i>hosted zone ID</i></code>
     * resource. The delegation set is the four Amazon Route 53 name servers
     * that were assigned to the hosted zone when you created it.
     * </p>
     * 
     * @param getHostedZoneRequest
     *        The input for a GetHostedZone request.
     * @return A Java Future containing the result of the GetHostedZone
     *         operation returned by the service.
     * @sample AmazonRoute53Async.GetHostedZone
     */
    java.util.concurrent.Future<GetHostedZoneResult> getHostedZoneAsync(
            GetHostedZoneRequest getHostedZoneRequest);

    /**
     * <p>
     * To retrieve the delegation set for a hosted zone, send a <code>GET</code>
     * request to the <code>2015-01-01/hostedzone/<i>hosted zone ID</i></code>
     * resource. The delegation set is the four Amazon Route 53 name servers
     * that were assigned to the hosted zone when you created it.
     * </p>
     * 
     * @param getHostedZoneRequest
     *        The input for a GetHostedZone request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetHostedZone
     *         operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.GetHostedZone
     */
    java.util.concurrent.Future<GetHostedZoneResult> getHostedZoneAsync(
            GetHostedZoneRequest getHostedZoneRequest,
            com.amazonaws.handlers.AsyncHandler<GetHostedZoneRequest, GetHostedZoneResult> asyncHandler);

    /**
     * <p>
     * To retrieve a count of all your hosted zones, send a <code>GET</code>
     * request to the <code>2015-01-01/hostedzonecount</code> resource.
     * </p>
     * 
     * @param getHostedZoneCountRequest
     *        To retrieve a count of all your hosted zones, send a
     *        <code>GET</code> request to the
     *        <code>2015-01-01/hostedzonecount</code> resource.
     * @return A Java Future containing the result of the GetHostedZoneCount
     *         operation returned by the service.
     * @sample AmazonRoute53Async.GetHostedZoneCount
     */
    java.util.concurrent.Future<GetHostedZoneCountResult> getHostedZoneCountAsync(
            GetHostedZoneCountRequest getHostedZoneCountRequest);

    /**
     * <p>
     * To retrieve a count of all your hosted zones, send a <code>GET</code>
     * request to the <code>2015-01-01/hostedzonecount</code> resource.
     * </p>
     * 
     * @param getHostedZoneCountRequest
     *        To retrieve a count of all your hosted zones, send a
     *        <code>GET</code> request to the
     *        <code>2015-01-01/hostedzonecount</code> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetHostedZoneCount
     *         operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.GetHostedZoneCount
     */
    java.util.concurrent.Future<GetHostedZoneCountResult> getHostedZoneCountAsync(
            GetHostedZoneCountRequest getHostedZoneCountRequest,
            com.amazonaws.handlers.AsyncHandler<GetHostedZoneCountRequest, GetHostedZoneCountResult> asyncHandler);

    /**
     * Simplified method form for invoking the GetHostedZoneCount operation.
     *
     * @see #getHostedZoneCountAsync(GetHostedZoneCountRequest)
     */
    java.util.concurrent.Future<GetHostedZoneCountResult> getHostedZoneCountAsync();

    /**
     * Simplified method form for invoking the GetHostedZoneCount operation with
     * an AsyncHandler.
     *
     * @see #getHostedZoneCountAsync(GetHostedZoneCountRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<GetHostedZoneCountResult> getHostedZoneCountAsync(
            com.amazonaws.handlers.AsyncHandler<GetHostedZoneCountRequest, GetHostedZoneCountResult> asyncHandler);

    /**
     * <p>
     * To retrieve the reusable delegation set, send a <code>GET</code> request
     * to the <code>2015-01-01/delegationset/<i>delegation set ID</i></code>
     * resource.
     * </p>
     * 
     * @param getReusableDelegationSetRequest
     *        The input for a GetReusableDelegationSet request.
     * @return A Java Future containing the result of the
     *         GetReusableDelegationSet operation returned by the service.
     * @sample AmazonRoute53Async.GetReusableDelegationSet
     */
    java.util.concurrent.Future<GetReusableDelegationSetResult> getReusableDelegationSetAsync(
            GetReusableDelegationSetRequest getReusableDelegationSetRequest);

    /**
     * <p>
     * To retrieve the reusable delegation set, send a <code>GET</code> request
     * to the <code>2015-01-01/delegationset/<i>delegation set ID</i></code>
     * resource.
     * </p>
     * 
     * @param getReusableDelegationSetRequest
     *        The input for a GetReusableDelegationSet request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         GetReusableDelegationSet operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.GetReusableDelegationSet
     */
    java.util.concurrent.Future<GetReusableDelegationSetResult> getReusableDelegationSetAsync(
            GetReusableDelegationSetRequest getReusableDelegationSetRequest,
            com.amazonaws.handlers.AsyncHandler<GetReusableDelegationSetRequest, GetReusableDelegationSetResult> asyncHandler);

    /**
     * <p>
     * Gets information about a specific traffic policy version. To get the
     * information, send a <code>GET</code> request to the
     * <code>2015-01-01/trafficpolicy</code> resource.
     * </p>
     * 
     * @param getTrafficPolicyRequest
     *        Gets information about a specific traffic policy version. To get
     *        the information, send a GET request to the
     *        2015-01-01/trafficpolicy resource, and specify the ID and the
     *        version of the traffic policy.
     * @return A Java Future containing the result of the GetTrafficPolicy
     *         operation returned by the service.
     * @sample AmazonRoute53Async.GetTrafficPolicy
     */
    java.util.concurrent.Future<GetTrafficPolicyResult> getTrafficPolicyAsync(
            GetTrafficPolicyRequest getTrafficPolicyRequest);

    /**
     * <p>
     * Gets information about a specific traffic policy version. To get the
     * information, send a <code>GET</code> request to the
     * <code>2015-01-01/trafficpolicy</code> resource.
     * </p>
     * 
     * @param getTrafficPolicyRequest
     *        Gets information about a specific traffic policy version. To get
     *        the information, send a GET request to the
     *        2015-01-01/trafficpolicy resource, and specify the ID and the
     *        version of the traffic policy.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTrafficPolicy
     *         operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.GetTrafficPolicy
     */
    java.util.concurrent.Future<GetTrafficPolicyResult> getTrafficPolicyAsync(
            GetTrafficPolicyRequest getTrafficPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetTrafficPolicyRequest, GetTrafficPolicyResult> asyncHandler);

    /**
     * <p>
     * Gets information about a specified traffic policy instance.
     * </p>
     * <p>
     * To get information about the traffic policy instance, send a
     * <code>GET</code> request to the
     * <code>2015-01-01/trafficpolicyinstance</code> resource.
     * </p>
     * <note>After you submit a <code>CreateTrafficPolicyInstance</code> or an
     * <code>UpdateTrafficPolicyInstance</code> request, there's a brief delay
     * while Amazon Route 53 creates the resource record sets that are specified
     * in the traffic policy definition. For more information, see the
     * <a>State</a> response element. </note>
     * 
     * @param getTrafficPolicyInstanceRequest
     *        Gets information about a specified traffic policy instance.</p>
     *        <p>
     *        To get information about a traffic policy instance, send a
     *        <code>GET</code> request to the
     *        <code>2015-01-01/trafficpolicyinstance/<i>Id</i></code> resource.
     * @return A Java Future containing the result of the
     *         GetTrafficPolicyInstance operation returned by the service.
     * @sample AmazonRoute53Async.GetTrafficPolicyInstance
     */
    java.util.concurrent.Future<GetTrafficPolicyInstanceResult> getTrafficPolicyInstanceAsync(
            GetTrafficPolicyInstanceRequest getTrafficPolicyInstanceRequest);

    /**
     * <p>
     * Gets information about a specified traffic policy instance.
     * </p>
     * <p>
     * To get information about the traffic policy instance, send a
     * <code>GET</code> request to the
     * <code>2015-01-01/trafficpolicyinstance</code> resource.
     * </p>
     * <note>After you submit a <code>CreateTrafficPolicyInstance</code> or an
     * <code>UpdateTrafficPolicyInstance</code> request, there's a brief delay
     * while Amazon Route 53 creates the resource record sets that are specified
     * in the traffic policy definition. For more information, see the
     * <a>State</a> response element. </note>
     * 
     * @param getTrafficPolicyInstanceRequest
     *        Gets information about a specified traffic policy instance.</p>
     *        <p>
     *        To get information about a traffic policy instance, send a
     *        <code>GET</code> request to the
     *        <code>2015-01-01/trafficpolicyinstance/<i>Id</i></code> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         GetTrafficPolicyInstance operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.GetTrafficPolicyInstance
     */
    java.util.concurrent.Future<GetTrafficPolicyInstanceResult> getTrafficPolicyInstanceAsync(
            GetTrafficPolicyInstanceRequest getTrafficPolicyInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<GetTrafficPolicyInstanceRequest, GetTrafficPolicyInstanceResult> asyncHandler);

    /**
     * <p>
     * Gets the number of traffic policy instances that are associated with the
     * current AWS account.
     * </p>
     * <p>
     * To get the number of traffic policy instances, send a <code>GET</code>
     * request to the <code>2015-01-01/trafficpolicyinstancecount</code>
     * resource.
     * </p>
     * 
     * @param getTrafficPolicyInstanceCountRequest
     *        To retrieve a count of all your traffic policy instances, send a
     *        <code>GET</code> request to the
     *        <code>2015-01-01/trafficpolicyinstancecount</code> resource.
     * @return A Java Future containing the result of the
     *         GetTrafficPolicyInstanceCount operation returned by the service.
     * @sample AmazonRoute53Async.GetTrafficPolicyInstanceCount
     */
    java.util.concurrent.Future<GetTrafficPolicyInstanceCountResult> getTrafficPolicyInstanceCountAsync(
            GetTrafficPolicyInstanceCountRequest getTrafficPolicyInstanceCountRequest);

    /**
     * <p>
     * Gets the number of traffic policy instances that are associated with the
     * current AWS account.
     * </p>
     * <p>
     * To get the number of traffic policy instances, send a <code>GET</code>
     * request to the <code>2015-01-01/trafficpolicyinstancecount</code>
     * resource.
     * </p>
     * 
     * @param getTrafficPolicyInstanceCountRequest
     *        To retrieve a count of all your traffic policy instances, send a
     *        <code>GET</code> request to the
     *        <code>2015-01-01/trafficpolicyinstancecount</code> resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         GetTrafficPolicyInstanceCount operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.GetTrafficPolicyInstanceCount
     */
    java.util.concurrent.Future<GetTrafficPolicyInstanceCountResult> getTrafficPolicyInstanceCountAsync(
            GetTrafficPolicyInstanceCountRequest getTrafficPolicyInstanceCountRequest,
            com.amazonaws.handlers.AsyncHandler<GetTrafficPolicyInstanceCountRequest, GetTrafficPolicyInstanceCountResult> asyncHandler);

    /**
     * Simplified method form for invoking the GetTrafficPolicyInstanceCount
     * operation.
     *
     * @see #getTrafficPolicyInstanceCountAsync(GetTrafficPolicyInstanceCountRequest)
     */
    java.util.concurrent.Future<GetTrafficPolicyInstanceCountResult> getTrafficPolicyInstanceCountAsync();

    /**
     * Simplified method form for invoking the GetTrafficPolicyInstanceCount
     * operation with an AsyncHandler.
     *
     * @see #getTrafficPolicyInstanceCountAsync(GetTrafficPolicyInstanceCountRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<GetTrafficPolicyInstanceCountResult> getTrafficPolicyInstanceCountAsync(
            com.amazonaws.handlers.AsyncHandler<GetTrafficPolicyInstanceCountRequest, GetTrafficPolicyInstanceCountResult> asyncHandler);

    /**
     * <p>
     * This action gets the list of ChangeBatches in a given time period for a
     * given hosted zone.
     * </p>
     * 
     * @param listChangeBatchesByHostedZoneRequest
     *        The input for a ListChangeBatchesByHostedZone request.
     * @return A Java Future containing the result of the
     *         ListChangeBatchesByHostedZone operation returned by the service.
     * @sample AmazonRoute53Async.ListChangeBatchesByHostedZone
     */
    java.util.concurrent.Future<ListChangeBatchesByHostedZoneResult> listChangeBatchesByHostedZoneAsync(
            ListChangeBatchesByHostedZoneRequest listChangeBatchesByHostedZoneRequest);

    /**
     * <p>
     * This action gets the list of ChangeBatches in a given time period for a
     * given hosted zone.
     * </p>
     * 
     * @param listChangeBatchesByHostedZoneRequest
     *        The input for a ListChangeBatchesByHostedZone request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         ListChangeBatchesByHostedZone operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.ListChangeBatchesByHostedZone
     */
    java.util.concurrent.Future<ListChangeBatchesByHostedZoneResult> listChangeBatchesByHostedZoneAsync(
            ListChangeBatchesByHostedZoneRequest listChangeBatchesByHostedZoneRequest,
            com.amazonaws.handlers.AsyncHandler<ListChangeBatchesByHostedZoneRequest, ListChangeBatchesByHostedZoneResult> asyncHandler);

    /**
     * <p>
     * This action gets the list of ChangeBatches in a given time period for a
     * given hosted zone and RRSet.
     * </p>
     * 
     * @param listChangeBatchesByRRSetRequest
     *        The input for a ListChangeBatchesByRRSet request.
     * @return A Java Future containing the result of the
     *         ListChangeBatchesByRRSet operation returned by the service.
     * @sample AmazonRoute53Async.ListChangeBatchesByRRSet
     */
    java.util.concurrent.Future<ListChangeBatchesByRRSetResult> listChangeBatchesByRRSetAsync(
            ListChangeBatchesByRRSetRequest listChangeBatchesByRRSetRequest);

    /**
     * <p>
     * This action gets the list of ChangeBatches in a given time period for a
     * given hosted zone and RRSet.
     * </p>
     * 
     * @param listChangeBatchesByRRSetRequest
     *        The input for a ListChangeBatchesByRRSet request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         ListChangeBatchesByRRSet operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.ListChangeBatchesByRRSet
     */
    java.util.concurrent.Future<ListChangeBatchesByRRSetResult> listChangeBatchesByRRSetAsync(
            ListChangeBatchesByRRSetRequest listChangeBatchesByRRSetRequest,
            com.amazonaws.handlers.AsyncHandler<ListChangeBatchesByRRSetRequest, ListChangeBatchesByRRSetResult> asyncHandler);

    /**
     * <p>
     * To retrieve a list of supported geo locations, send a <code>GET</code>
     * request to the <code>2015-01-01/geolocations</code> resource. The
     * response to this request includes a <code>GeoLocationDetailsList</code>
     * element with zero, one, or multiple <code>GeoLocationDetails</code> child
     * elements. The list is sorted by country code, and then subdivision code,
     * followed by continents at the end of the list.
     * </p>
     * <p>
     * By default, the list of geo locations is displayed on a single page. You
     * can control the length of the page that is displayed by using the
     * <code>MaxItems</code> parameter. If the list is truncated,
     * <code>IsTruncated</code> will be set to <i>true</i> and a combination of
     * <code>NextContinentCode, NextCountryCode, NextSubdivisionCode</code> will
     * be populated. You can pass these as parameters to
     * <code>StartContinentCode, StartCountryCode, StartSubdivisionCode</code>
     * to control the geo location that the list begins with.
     * </p>
     * 
     * @param listGeoLocationsRequest
     *        The input for a ListGeoLocations request.
     * @return A Java Future containing the result of the ListGeoLocations
     *         operation returned by the service.
     * @sample AmazonRoute53Async.ListGeoLocations
     */
    java.util.concurrent.Future<ListGeoLocationsResult> listGeoLocationsAsync(
            ListGeoLocationsRequest listGeoLocationsRequest);

    /**
     * <p>
     * To retrieve a list of supported geo locations, send a <code>GET</code>
     * request to the <code>2015-01-01/geolocations</code> resource. The
     * response to this request includes a <code>GeoLocationDetailsList</code>
     * element with zero, one, or multiple <code>GeoLocationDetails</code> child
     * elements. The list is sorted by country code, and then subdivision code,
     * followed by continents at the end of the list.
     * </p>
     * <p>
     * By default, the list of geo locations is displayed on a single page. You
     * can control the length of the page that is displayed by using the
     * <code>MaxItems</code> parameter. If the list is truncated,
     * <code>IsTruncated</code> will be set to <i>true</i> and a combination of
     * <code>NextContinentCode, NextCountryCode, NextSubdivisionCode</code> will
     * be populated. You can pass these as parameters to
     * <code>StartContinentCode, StartCountryCode, StartSubdivisionCode</code>
     * to control the geo location that the list begins with.
     * </p>
     * 
     * @param listGeoLocationsRequest
     *        The input for a ListGeoLocations request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGeoLocations
     *         operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.ListGeoLocations
     */
    java.util.concurrent.Future<ListGeoLocationsResult> listGeoLocationsAsync(
            ListGeoLocationsRequest listGeoLocationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListGeoLocationsRequest, ListGeoLocationsResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListGeoLocations operation.
     *
     * @see #listGeoLocationsAsync(ListGeoLocationsRequest)
     */
    java.util.concurrent.Future<ListGeoLocationsResult> listGeoLocationsAsync();

    /**
     * Simplified method form for invoking the ListGeoLocations operation with
     * an AsyncHandler.
     *
     * @see #listGeoLocationsAsync(ListGeoLocationsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListGeoLocationsResult> listGeoLocationsAsync(
            com.amazonaws.handlers.AsyncHandler<ListGeoLocationsRequest, ListGeoLocationsResult> asyncHandler);

    /**
     * <p>
     * To retrieve a list of your health checks, send a <code>GET</code> request
     * to the <code>2015-01-01/healthcheck</code> resource. The response to this
     * request includes a <code>HealthChecks</code> element with zero, one, or
     * multiple <code>HealthCheck</code> child elements. By default, the list of
     * health checks is displayed on a single page. You can control the length
     * of the page that is displayed by using the <code>MaxItems</code>
     * parameter. You can use the <code>Marker</code> parameter to control the
     * health check that the list begins with.
     * </p>
     * <note> Amazon Route 53 returns a maximum of 100 items. If you set
     * MaxItems to a value greater than 100, Amazon Route 53 returns only the
     * first 100.</note>
     * 
     * @param listHealthChecksRequest
     *        To retrieve a list of your health checks, send a <code>GET</code>
     *        request to the <code>2015-01-01/healthcheck</code> resource. The
     *        response to this request includes a <code>HealthChecks</code>
     *        element with zero or more <code>HealthCheck</code> child elements.
     *        By default, the list of health checks is displayed on a single
     *        page. You can control the length of the page that is displayed by
     *        using the <code>MaxItems</code> parameter. You can use the
     *        <code>Marker</code> parameter to control the health check that the
     *        list begins with.</p> <note> Amazon Route 53 returns a maximum of
     *        100 items. If you set <code>MaxItems</code> to a value greater
     *        than 100, Amazon Route 53 returns only the first 100.
     * @return A Java Future containing the result of the ListHealthChecks
     *         operation returned by the service.
     * @sample AmazonRoute53Async.ListHealthChecks
     */
    java.util.concurrent.Future<ListHealthChecksResult> listHealthChecksAsync(
            ListHealthChecksRequest listHealthChecksRequest);

    /**
     * <p>
     * To retrieve a list of your health checks, send a <code>GET</code> request
     * to the <code>2015-01-01/healthcheck</code> resource. The response to this
     * request includes a <code>HealthChecks</code> element with zero, one, or
     * multiple <code>HealthCheck</code> child elements. By default, the list of
     * health checks is displayed on a single page. You can control the length
     * of the page that is displayed by using the <code>MaxItems</code>
     * parameter. You can use the <code>Marker</code> parameter to control the
     * health check that the list begins with.
     * </p>
     * <note> Amazon Route 53 returns a maximum of 100 items. If you set
     * MaxItems to a value greater than 100, Amazon Route 53 returns only the
     * first 100.</note>
     * 
     * @param listHealthChecksRequest
     *        To retrieve a list of your health checks, send a <code>GET</code>
     *        request to the <code>2015-01-01/healthcheck</code> resource. The
     *        response to this request includes a <code>HealthChecks</code>
     *        element with zero or more <code>HealthCheck</code> child elements.
     *        By default, the list of health checks is displayed on a single
     *        page. You can control the length of the page that is displayed by
     *        using the <code>MaxItems</code> parameter. You can use the
     *        <code>Marker</code> parameter to control the health check that the
     *        list begins with.</p> <note> Amazon Route 53 returns a maximum of
     *        100 items. If you set <code>MaxItems</code> to a value greater
     *        than 100, Amazon Route 53 returns only the first 100.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListHealthChecks
     *         operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.ListHealthChecks
     */
    java.util.concurrent.Future<ListHealthChecksResult> listHealthChecksAsync(
            ListHealthChecksRequest listHealthChecksRequest,
            com.amazonaws.handlers.AsyncHandler<ListHealthChecksRequest, ListHealthChecksResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListHealthChecks operation.
     *
     * @see #listHealthChecksAsync(ListHealthChecksRequest)
     */
    java.util.concurrent.Future<ListHealthChecksResult> listHealthChecksAsync();

    /**
     * Simplified method form for invoking the ListHealthChecks operation with
     * an AsyncHandler.
     *
     * @see #listHealthChecksAsync(ListHealthChecksRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListHealthChecksResult> listHealthChecksAsync(
            com.amazonaws.handlers.AsyncHandler<ListHealthChecksRequest, ListHealthChecksResult> asyncHandler);

    /**
     * <p>
     * To retrieve a list of your hosted zones, send a <code>GET</code> request
     * to the <code>2015-01-01/hostedzone</code> resource. The response to this
     * request includes a <code>HostedZones</code> element with zero, one, or
     * multiple <code>HostedZone</code> child elements. By default, the list of
     * hosted zones is displayed on a single page. You can control the length of
     * the page that is displayed by using the <code>MaxItems</code> parameter.
     * You can use the <code>Marker</code> parameter to control the hosted zone
     * that the list begins with.
     * </p>
     * <note> Amazon Route 53 returns a maximum of 100 items. If you set
     * MaxItems to a value greater than 100, Amazon Route 53 returns only the
     * first 100.</note>
     * 
     * @param listHostedZonesRequest
     *        To retrieve a list of your hosted zones, send a <code>GET</code>
     *        request to the <code>2015-01-01/hostedzone</code> resource. The
     *        response to this request includes a <code>HostedZones</code>
     *        element with zero or more <code>HostedZone</code> child elements.
     *        By default, the list of hosted zones is displayed on a single
     *        page. You can control the length of the page that is displayed by
     *        using the <code>MaxItems</code> parameter. You can use the
     *        <code>Marker</code> parameter to control the hosted zone that the
     *        list begins with. For more information about listing hosted zones,
     *        see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ListInfoOnHostedZone.html"
     *        >Listing the Hosted Zones for an AWS Account</a> in the <i>Amazon
     *        Route 53 Developer Guide</i>.</p> <note> Amazon Route 53 returns a
     *        maximum of 100 items. If you set <code>MaxItems</code> to a value
     *        greater than 100, Amazon Route 53 returns only the first 100.
     * @return A Java Future containing the result of the ListHostedZones
     *         operation returned by the service.
     * @sample AmazonRoute53Async.ListHostedZones
     */
    java.util.concurrent.Future<ListHostedZonesResult> listHostedZonesAsync(
            ListHostedZonesRequest listHostedZonesRequest);

    /**
     * <p>
     * To retrieve a list of your hosted zones, send a <code>GET</code> request
     * to the <code>2015-01-01/hostedzone</code> resource. The response to this
     * request includes a <code>HostedZones</code> element with zero, one, or
     * multiple <code>HostedZone</code> child elements. By default, the list of
     * hosted zones is displayed on a single page. You can control the length of
     * the page that is displayed by using the <code>MaxItems</code> parameter.
     * You can use the <code>Marker</code> parameter to control the hosted zone
     * that the list begins with.
     * </p>
     * <note> Amazon Route 53 returns a maximum of 100 items. If you set
     * MaxItems to a value greater than 100, Amazon Route 53 returns only the
     * first 100.</note>
     * 
     * @param listHostedZonesRequest
     *        To retrieve a list of your hosted zones, send a <code>GET</code>
     *        request to the <code>2015-01-01/hostedzone</code> resource. The
     *        response to this request includes a <code>HostedZones</code>
     *        element with zero or more <code>HostedZone</code> child elements.
     *        By default, the list of hosted zones is displayed on a single
     *        page. You can control the length of the page that is displayed by
     *        using the <code>MaxItems</code> parameter. You can use the
     *        <code>Marker</code> parameter to control the hosted zone that the
     *        list begins with. For more information about listing hosted zones,
     *        see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ListInfoOnHostedZone.html"
     *        >Listing the Hosted Zones for an AWS Account</a> in the <i>Amazon
     *        Route 53 Developer Guide</i>.</p> <note> Amazon Route 53 returns a
     *        maximum of 100 items. If you set <code>MaxItems</code> to a value
     *        greater than 100, Amazon Route 53 returns only the first 100.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListHostedZones
     *         operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.ListHostedZones
     */
    java.util.concurrent.Future<ListHostedZonesResult> listHostedZonesAsync(
            ListHostedZonesRequest listHostedZonesRequest,
            com.amazonaws.handlers.AsyncHandler<ListHostedZonesRequest, ListHostedZonesResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListHostedZones operation.
     *
     * @see #listHostedZonesAsync(ListHostedZonesRequest)
     */
    java.util.concurrent.Future<ListHostedZonesResult> listHostedZonesAsync();

    /**
     * Simplified method form for invoking the ListHostedZones operation with an
     * AsyncHandler.
     *
     * @see #listHostedZonesAsync(ListHostedZonesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListHostedZonesResult> listHostedZonesAsync(
            com.amazonaws.handlers.AsyncHandler<ListHostedZonesRequest, ListHostedZonesResult> asyncHandler);

    /**
     * <p>
     * To retrieve a list of your hosted zones in lexicographic order, send a
     * <code>GET</code> request to the <code>2015-01-01/hostedzonesbyname</code>
     * resource. The response to this request includes a
     * <code>HostedZones</code> element with zero or more
     * <code>HostedZone</code> child elements lexicographically ordered by DNS
     * name. By default, the list of hosted zones is displayed on a single page.
     * You can control the length of the page that is displayed by using the
     * <code>MaxItems</code> parameter. You can use the <code>DNSName</code> and
     * <code>HostedZoneId</code> parameters to control the hosted zone that the
     * list begins with.
     * </p>
     * <note> Amazon Route 53 returns a maximum of 100 items. If you set
     * MaxItems to a value greater than 100, Amazon Route 53 returns only the
     * first 100.</note>
     * 
     * @param listHostedZonesByNameRequest
     *        To retrieve a list of your hosted zones in lexicographic order,
     *        send a <code>GET</code> request to the
     *        <code>2015-01-01/hostedzonesbyname</code> resource. The response
     *        to this request includes a <code>HostedZones</code> element with
     *        zero or more <code>HostedZone</code> child elements
     *        lexicographically ordered by DNS name. By default, the list of
     *        hosted zones is displayed on a single page. You can control the
     *        length of the page that is displayed by using the
     *        <code>MaxItems</code> parameter. You can use the
     *        <code>DNSName</code> and <code>HostedZoneId</code> parameters to
     *        control the hosted zone that the list begins with.</p>
     *        <p>
     *        For more information about listing hosted zones, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ListInfoOnHostedZone.html"
     *        >Listing the Hosted Zones for an AWS Account</a> in the <i>Amazon
     *        Route 53 Developer Guide</i>.
     * @return A Java Future containing the result of the ListHostedZonesByName
     *         operation returned by the service.
     * @sample AmazonRoute53Async.ListHostedZonesByName
     */
    java.util.concurrent.Future<ListHostedZonesByNameResult> listHostedZonesByNameAsync(
            ListHostedZonesByNameRequest listHostedZonesByNameRequest);

    /**
     * <p>
     * To retrieve a list of your hosted zones in lexicographic order, send a
     * <code>GET</code> request to the <code>2015-01-01/hostedzonesbyname</code>
     * resource. The response to this request includes a
     * <code>HostedZones</code> element with zero or more
     * <code>HostedZone</code> child elements lexicographically ordered by DNS
     * name. By default, the list of hosted zones is displayed on a single page.
     * You can control the length of the page that is displayed by using the
     * <code>MaxItems</code> parameter. You can use the <code>DNSName</code> and
     * <code>HostedZoneId</code> parameters to control the hosted zone that the
     * list begins with.
     * </p>
     * <note> Amazon Route 53 returns a maximum of 100 items. If you set
     * MaxItems to a value greater than 100, Amazon Route 53 returns only the
     * first 100.</note>
     * 
     * @param listHostedZonesByNameRequest
     *        To retrieve a list of your hosted zones in lexicographic order,
     *        send a <code>GET</code> request to the
     *        <code>2015-01-01/hostedzonesbyname</code> resource. The response
     *        to this request includes a <code>HostedZones</code> element with
     *        zero or more <code>HostedZone</code> child elements
     *        lexicographically ordered by DNS name. By default, the list of
     *        hosted zones is displayed on a single page. You can control the
     *        length of the page that is displayed by using the
     *        <code>MaxItems</code> parameter. You can use the
     *        <code>DNSName</code> and <code>HostedZoneId</code> parameters to
     *        control the hosted zone that the list begins with.</p>
     *        <p>
     *        For more information about listing hosted zones, see <a href=
     *        "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ListInfoOnHostedZone.html"
     *        >Listing the Hosted Zones for an AWS Account</a> in the <i>Amazon
     *        Route 53 Developer Guide</i>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListHostedZonesByName
     *         operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.ListHostedZonesByName
     */
    java.util.concurrent.Future<ListHostedZonesByNameResult> listHostedZonesByNameAsync(
            ListHostedZonesByNameRequest listHostedZonesByNameRequest,
            com.amazonaws.handlers.AsyncHandler<ListHostedZonesByNameRequest, ListHostedZonesByNameResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListHostedZonesByName operation.
     *
     * @see #listHostedZonesByNameAsync(ListHostedZonesByNameRequest)
     */
    java.util.concurrent.Future<ListHostedZonesByNameResult> listHostedZonesByNameAsync();

    /**
     * Simplified method form for invoking the ListHostedZonesByName operation
     * with an AsyncHandler.
     *
     * @see #listHostedZonesByNameAsync(ListHostedZonesByNameRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListHostedZonesByNameResult> listHostedZonesByNameAsync(
            com.amazonaws.handlers.AsyncHandler<ListHostedZonesByNameRequest, ListHostedZonesByNameResult> asyncHandler);

    /**
     * <p>
     * Imagine all the resource record sets in a zone listed out in front of
     * you. Imagine them sorted lexicographically first by DNS name (with the
     * labels reversed, like "com.amazon.www" for example), and secondarily,
     * lexicographically by record type. This operation retrieves at most
     * MaxItems resource record sets from this list, in order, starting at a
     * position specified by the Name and Type arguments:
     * </p>
     * <ul>
     * <li>If both Name and Type are omitted, this means start the results at
     * the first RRSET in the HostedZone.</li>
     * <li>If Name is specified but Type is omitted, this means start the
     * results at the first RRSET in the list whose name is greater than or
     * equal to Name.</li>
     * <li>If both Name and Type are specified, this means start the results at
     * the first RRSET in the list whose name is greater than or equal to Name
     * and whose type is greater than or equal to Type.</li>
     * <li>It is an error to specify the Type but not the Name.</li>
     * </ul>
     * <p>
     * Use ListResourceRecordSets to retrieve a single known record set by
     * specifying the record set's name and type, and setting MaxItems = 1
     * </p>
     * <p>
     * To retrieve all the records in a HostedZone, first pause any processes
     * making calls to ChangeResourceRecordSets. Initially call
     * ListResourceRecordSets without a Name and Type to get the first page of
     * record sets. For subsequent calls, set Name and Type to the NextName and
     * NextType values returned by the previous response.
     * </p>
     * <p>
     * In the presence of concurrent ChangeResourceRecordSets calls, there is no
     * consistency of results across calls to ListResourceRecordSets. The only
     * way to get a consistent multi-page snapshot of all RRSETs in a zone is to
     * stop making changes while pagination is in progress.
     * </p>
     * <p>
     * However, the results from ListResourceRecordSets are consistent within a
     * page. If MakeChange calls are taking place concurrently, the result of
     * each one will either be completely visible in your results or not at all.
     * You will not see partial changes, or changes that do not ultimately
     * succeed. (This follows from the fact that MakeChange is atomic)
     * </p>
     * <p>
     * The results from ListResourceRecordSets are strongly consistent with
     * ChangeResourceRecordSets. To be precise, if a single process makes a call
     * to ChangeResourceRecordSets and receives a successful response, the
     * effects of that change will be visible in a subsequent call to
     * ListResourceRecordSets by that process.
     * </p>
     * 
     * @param listResourceRecordSetsRequest
     *        The input for a ListResourceRecordSets request.
     * @return A Java Future containing the result of the ListResourceRecordSets
     *         operation returned by the service.
     * @sample AmazonRoute53Async.ListResourceRecordSets
     */
    java.util.concurrent.Future<ListResourceRecordSetsResult> listResourceRecordSetsAsync(
            ListResourceRecordSetsRequest listResourceRecordSetsRequest);

    /**
     * <p>
     * Imagine all the resource record sets in a zone listed out in front of
     * you. Imagine them sorted lexicographically first by DNS name (with the
     * labels reversed, like "com.amazon.www" for example), and secondarily,
     * lexicographically by record type. This operation retrieves at most
     * MaxItems resource record sets from this list, in order, starting at a
     * position specified by the Name and Type arguments:
     * </p>
     * <ul>
     * <li>If both Name and Type are omitted, this means start the results at
     * the first RRSET in the HostedZone.</li>
     * <li>If Name is specified but Type is omitted, this means start the
     * results at the first RRSET in the list whose name is greater than or
     * equal to Name.</li>
     * <li>If both Name and Type are specified, this means start the results at
     * the first RRSET in the list whose name is greater than or equal to Name
     * and whose type is greater than or equal to Type.</li>
     * <li>It is an error to specify the Type but not the Name.</li>
     * </ul>
     * <p>
     * Use ListResourceRecordSets to retrieve a single known record set by
     * specifying the record set's name and type, and setting MaxItems = 1
     * </p>
     * <p>
     * To retrieve all the records in a HostedZone, first pause any processes
     * making calls to ChangeResourceRecordSets. Initially call
     * ListResourceRecordSets without a Name and Type to get the first page of
     * record sets. For subsequent calls, set Name and Type to the NextName and
     * NextType values returned by the previous response.
     * </p>
     * <p>
     * In the presence of concurrent ChangeResourceRecordSets calls, there is no
     * consistency of results across calls to ListResourceRecordSets. The only
     * way to get a consistent multi-page snapshot of all RRSETs in a zone is to
     * stop making changes while pagination is in progress.
     * </p>
     * <p>
     * However, the results from ListResourceRecordSets are consistent within a
     * page. If MakeChange calls are taking place concurrently, the result of
     * each one will either be completely visible in your results or not at all.
     * You will not see partial changes, or changes that do not ultimately
     * succeed. (This follows from the fact that MakeChange is atomic)
     * </p>
     * <p>
     * The results from ListResourceRecordSets are strongly consistent with
     * ChangeResourceRecordSets. To be precise, if a single process makes a call
     * to ChangeResourceRecordSets and receives a successful response, the
     * effects of that change will be visible in a subsequent call to
     * ListResourceRecordSets by that process.
     * </p>
     * 
     * @param listResourceRecordSetsRequest
     *        The input for a ListResourceRecordSets request.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResourceRecordSets
     *         operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.ListResourceRecordSets
     */
    java.util.concurrent.Future<ListResourceRecordSetsResult> listResourceRecordSetsAsync(
            ListResourceRecordSetsRequest listResourceRecordSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListResourceRecordSetsRequest, ListResourceRecordSetsResult> asyncHandler);

    /**
     * <p>
     * To retrieve a list of your reusable delegation sets, send a
     * <code>GET</code> request to the <code>2015-01-01/delegationset</code>
     * resource. The response to this request includes a
     * <code>DelegationSets</code> element with zero, one, or multiple
     * <code>DelegationSet</code> child elements. By default, the list of
     * delegation sets is displayed on a single page. You can control the length
     * of the page that is displayed by using the <code>MaxItems</code>
     * parameter. You can use the <code>Marker</code> parameter to control the
     * delegation set that the list begins with.
     * </p>
     * <note> Amazon Route 53 returns a maximum of 100 items. If you set
     * MaxItems to a value greater than 100, Amazon Route 53 returns only the
     * first 100.</note>
     * 
     * @param listReusableDelegationSetsRequest
     *        To retrieve a list of your reusable delegation sets, send a
     *        <code>GET</code> request to the
     *        <code>2015-01-01/delegationset</code> resource. The response to
     *        this request includes a <code>DelegationSets</code> element with
     *        zero or more <code>DelegationSet</code> child elements. By
     *        default, the list of reusable delegation sets is displayed on a
     *        single page. You can control the length of the page that is
     *        displayed by using the <code>MaxItems</code> parameter. You can
     *        use the <code>Marker</code> parameter to control the delegation
     *        set that the list begins with.</p> <note> Amazon Route 53 returns
     *        a maximum of 100 items. If you set <code>MaxItems</code> to a
     *        value greater than 100, Amazon Route 53 returns only the first
     *        100.
     * @return A Java Future containing the result of the
     *         ListReusableDelegationSets operation returned by the service.
     * @sample AmazonRoute53Async.ListReusableDelegationSets
     */
    java.util.concurrent.Future<ListReusableDelegationSetsResult> listReusableDelegationSetsAsync(
            ListReusableDelegationSetsRequest listReusableDelegationSetsRequest);

    /**
     * <p>
     * To retrieve a list of your reusable delegation sets, send a
     * <code>GET</code> request to the <code>2015-01-01/delegationset</code>
     * resource. The response to this request includes a
     * <code>DelegationSets</code> element with zero, one, or multiple
     * <code>DelegationSet</code> child elements. By default, the list of
     * delegation sets is displayed on a single page. You can control the length
     * of the page that is displayed by using the <code>MaxItems</code>
     * parameter. You can use the <code>Marker</code> parameter to control the
     * delegation set that the list begins with.
     * </p>
     * <note> Amazon Route 53 returns a maximum of 100 items. If you set
     * MaxItems to a value greater than 100, Amazon Route 53 returns only the
     * first 100.</note>
     * 
     * @param listReusableDelegationSetsRequest
     *        To retrieve a list of your reusable delegation sets, send a
     *        <code>GET</code> request to the
     *        <code>2015-01-01/delegationset</code> resource. The response to
     *        this request includes a <code>DelegationSets</code> element with
     *        zero or more <code>DelegationSet</code> child elements. By
     *        default, the list of reusable delegation sets is displayed on a
     *        single page. You can control the length of the page that is
     *        displayed by using the <code>MaxItems</code> parameter. You can
     *        use the <code>Marker</code> parameter to control the delegation
     *        set that the list begins with.</p> <note> Amazon Route 53 returns
     *        a maximum of 100 items. If you set <code>MaxItems</code> to a
     *        value greater than 100, Amazon Route 53 returns only the first
     *        100.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         ListReusableDelegationSets operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.ListReusableDelegationSets
     */
    java.util.concurrent.Future<ListReusableDelegationSetsResult> listReusableDelegationSetsAsync(
            ListReusableDelegationSetsRequest listReusableDelegationSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListReusableDelegationSetsRequest, ListReusableDelegationSetsResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListReusableDelegationSets
     * operation.
     *
     * @see #listReusableDelegationSetsAsync(ListReusableDelegationSetsRequest)
     */
    java.util.concurrent.Future<ListReusableDelegationSetsResult> listReusableDelegationSetsAsync();

    /**
     * Simplified method form for invoking the ListReusableDelegationSets
     * operation with an AsyncHandler.
     *
     * @see #listReusableDelegationSetsAsync(ListReusableDelegationSetsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListReusableDelegationSetsResult> listReusableDelegationSetsAsync(
            com.amazonaws.handlers.AsyncHandler<ListReusableDelegationSetsRequest, ListReusableDelegationSetsResult> asyncHandler);

    /**
     * @param listTagsForResourceRequest
     *        A complex type containing information about a request for a list
     *        of the tags that are associated with an individual resource.
     * @return A Java Future containing the result of the ListTagsForResource
     *         operation returned by the service.
     * @sample AmazonRoute53Async.ListTagsForResource
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(
            ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * @param listTagsForResourceRequest
     *        A complex type containing information about a request for a list
     *        of the tags that are associated with an individual resource.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource
     *         operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.ListTagsForResource
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(
            ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * @param listTagsForResourcesRequest
     *        A complex type containing information about a request for a list
     *        of the tags that are associated with up to 10 specified resources.
     * @return A Java Future containing the result of the ListTagsForResources
     *         operation returned by the service.
     * @sample AmazonRoute53Async.ListTagsForResources
     */
    java.util.concurrent.Future<ListTagsForResourcesResult> listTagsForResourcesAsync(
            ListTagsForResourcesRequest listTagsForResourcesRequest);

    /**
     * @param listTagsForResourcesRequest
     *        A complex type containing information about a request for a list
     *        of the tags that are associated with up to 10 specified resources.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResources
     *         operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.ListTagsForResources
     */
    java.util.concurrent.Future<ListTagsForResourcesResult> listTagsForResourcesAsync(
            ListTagsForResourcesRequest listTagsForResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourcesRequest, ListTagsForResourcesResult> asyncHandler);

    /**
     * <p>
     * Gets information about the latest version for every traffic policy that
     * is associated with the current AWS account. To get the information, send
     * a <code>GET</code> request to the <code>2015-01-01/trafficpolicy</code>
     * resource.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If you
     * have a lot of traffic policies, you can use the <code>maxitems</code>
     * parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes three values that help you navigate from one group
     * of <code>maxitems</code> traffic policies to the next:
     * </p>
     * <ul>
     * <li><b>IsTruncated</b></li>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is
     * <code>true</code>, there are more traffic policies associated with the
     * current AWS account.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, this response includes
     * the last traffic policy that is associated with the current account.
     * </p>
     * <li><b>TrafficPolicyIdMarker</b></li>
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>,
     * <code>TrafficPolicyIdMarker</code> is the ID of the first traffic policy
     * in the next group of <code>MaxItems</code> traffic policies. If you want
     * to list more traffic policies, make another call to
     * <code>ListTrafficPolicies</code>, and specify the value of the
     * <code>TrafficPolicyIdMarker</code> element from the response in the
     * <code>TrafficPolicyIdMarker</code> request parameter.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, the
     * <code>TrafficPolicyIdMarker</code> element is omitted from the response.
     * </p>
     * <li><b>MaxItems</b></li>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in
     * the request that produced the current response.
     * </p>
     * </ul>
     * 
     * @param listTrafficPoliciesRequest
     *        A complex type that contains the information about the request to
     *        list the traffic policies that are associated with the current AWS
     *        account.
     * @return A Java Future containing the result of the ListTrafficPolicies
     *         operation returned by the service.
     * @sample AmazonRoute53Async.ListTrafficPolicies
     */
    java.util.concurrent.Future<ListTrafficPoliciesResult> listTrafficPoliciesAsync(
            ListTrafficPoliciesRequest listTrafficPoliciesRequest);

    /**
     * <p>
     * Gets information about the latest version for every traffic policy that
     * is associated with the current AWS account. To get the information, send
     * a <code>GET</code> request to the <code>2015-01-01/trafficpolicy</code>
     * resource.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If you
     * have a lot of traffic policies, you can use the <code>maxitems</code>
     * parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes three values that help you navigate from one group
     * of <code>maxitems</code> traffic policies to the next:
     * </p>
     * <ul>
     * <li><b>IsTruncated</b></li>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is
     * <code>true</code>, there are more traffic policies associated with the
     * current AWS account.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, this response includes
     * the last traffic policy that is associated with the current account.
     * </p>
     * <li><b>TrafficPolicyIdMarker</b></li>
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>,
     * <code>TrafficPolicyIdMarker</code> is the ID of the first traffic policy
     * in the next group of <code>MaxItems</code> traffic policies. If you want
     * to list more traffic policies, make another call to
     * <code>ListTrafficPolicies</code>, and specify the value of the
     * <code>TrafficPolicyIdMarker</code> element from the response in the
     * <code>TrafficPolicyIdMarker</code> request parameter.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, the
     * <code>TrafficPolicyIdMarker</code> element is omitted from the response.
     * </p>
     * <li><b>MaxItems</b></li>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in
     * the request that produced the current response.
     * </p>
     * </ul>
     * 
     * @param listTrafficPoliciesRequest
     *        A complex type that contains the information about the request to
     *        list the traffic policies that are associated with the current AWS
     *        account.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTrafficPolicies
     *         operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.ListTrafficPolicies
     */
    java.util.concurrent.Future<ListTrafficPoliciesResult> listTrafficPoliciesAsync(
            ListTrafficPoliciesRequest listTrafficPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTrafficPoliciesRequest, ListTrafficPoliciesResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListTrafficPolicies operation.
     *
     * @see #listTrafficPoliciesAsync(ListTrafficPoliciesRequest)
     */
    java.util.concurrent.Future<ListTrafficPoliciesResult> listTrafficPoliciesAsync();

    /**
     * Simplified method form for invoking the ListTrafficPolicies operation
     * with an AsyncHandler.
     *
     * @see #listTrafficPoliciesAsync(ListTrafficPoliciesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListTrafficPoliciesResult> listTrafficPoliciesAsync(
            com.amazonaws.handlers.AsyncHandler<ListTrafficPoliciesRequest, ListTrafficPoliciesResult> asyncHandler);

    /**
     * <p>
     * Gets information about the traffic policy instances that you created by
     * using the current AWS account.
     * </p>
     * <note>After you submit an <code>UpdateTrafficPolicyInstance</code>
     * request, there's a brief delay while Amazon Route 53 creates the resource
     * record sets that are specified in the traffic policy definition. For more
     * information, see the <a>State</a> response element.</note>
     * <p>
     * To get information about the traffic policy instances that are associated
     * with the current AWS account, send a <code>GET</code> request to the
     * <code>2015-01-01/trafficpolicyinstance</code> resource.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If you
     * have a lot of traffic policy instances, you can use the
     * <code>MaxItems</code> parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes five values that help you navigate from one group
     * of <code>MaxItems</code> traffic policy instances to the next:
     * </p>
     * <ul>
     * <li><b>IsTruncated</b></li>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is
     * <code>true</code>, there are more traffic policy instances associated
     * with the current AWS account.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, this response includes
     * the last traffic policy instance that is associated with the current
     * account.
     * </p>
     * <li><b>MaxItems</b></li>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in
     * the request that produced the current response.
     * </p>
     * <li><b>HostedZoneIdMarker</b>, <b>TrafficPolicyInstanceNameMarker</b>,
     * and <b>TrafficPolicyInstanceTypeMarker</b></li>
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, these three values in
     * the response represent the first traffic policy instance in the next
     * group of <code>MaxItems</code> traffic policy instances. To list more
     * traffic policy instances, make another call to
     * <code>ListTrafficPolicyInstances</code>, and specify these values in the
     * corresponding request parameters.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, all three elements are
     * omitted from the response.
     * </p>
     * </ul>
     * 
     * @param listTrafficPolicyInstancesRequest
     *        A complex type that contains the information about the request to
     *        list your traffic policy instances.
     * @return A Java Future containing the result of the
     *         ListTrafficPolicyInstances operation returned by the service.
     * @sample AmazonRoute53Async.ListTrafficPolicyInstances
     */
    java.util.concurrent.Future<ListTrafficPolicyInstancesResult> listTrafficPolicyInstancesAsync(
            ListTrafficPolicyInstancesRequest listTrafficPolicyInstancesRequest);

    /**
     * <p>
     * Gets information about the traffic policy instances that you created by
     * using the current AWS account.
     * </p>
     * <note>After you submit an <code>UpdateTrafficPolicyInstance</code>
     * request, there's a brief delay while Amazon Route 53 creates the resource
     * record sets that are specified in the traffic policy definition. For more
     * information, see the <a>State</a> response element.</note>
     * <p>
     * To get information about the traffic policy instances that are associated
     * with the current AWS account, send a <code>GET</code> request to the
     * <code>2015-01-01/trafficpolicyinstance</code> resource.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If you
     * have a lot of traffic policy instances, you can use the
     * <code>MaxItems</code> parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes five values that help you navigate from one group
     * of <code>MaxItems</code> traffic policy instances to the next:
     * </p>
     * <ul>
     * <li><b>IsTruncated</b></li>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is
     * <code>true</code>, there are more traffic policy instances associated
     * with the current AWS account.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, this response includes
     * the last traffic policy instance that is associated with the current
     * account.
     * </p>
     * <li><b>MaxItems</b></li>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in
     * the request that produced the current response.
     * </p>
     * <li><b>HostedZoneIdMarker</b>, <b>TrafficPolicyInstanceNameMarker</b>,
     * and <b>TrafficPolicyInstanceTypeMarker</b></li>
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, these three values in
     * the response represent the first traffic policy instance in the next
     * group of <code>MaxItems</code> traffic policy instances. To list more
     * traffic policy instances, make another call to
     * <code>ListTrafficPolicyInstances</code>, and specify these values in the
     * corresponding request parameters.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, all three elements are
     * omitted from the response.
     * </p>
     * </ul>
     * 
     * @param listTrafficPolicyInstancesRequest
     *        A complex type that contains the information about the request to
     *        list your traffic policy instances.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         ListTrafficPolicyInstances operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.ListTrafficPolicyInstances
     */
    java.util.concurrent.Future<ListTrafficPolicyInstancesResult> listTrafficPolicyInstancesAsync(
            ListTrafficPolicyInstancesRequest listTrafficPolicyInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<ListTrafficPolicyInstancesRequest, ListTrafficPolicyInstancesResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListTrafficPolicyInstances
     * operation.
     *
     * @see #listTrafficPolicyInstancesAsync(ListTrafficPolicyInstancesRequest)
     */
    java.util.concurrent.Future<ListTrafficPolicyInstancesResult> listTrafficPolicyInstancesAsync();

    /**
     * Simplified method form for invoking the ListTrafficPolicyInstances
     * operation with an AsyncHandler.
     *
     * @see #listTrafficPolicyInstancesAsync(ListTrafficPolicyInstancesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListTrafficPolicyInstancesResult> listTrafficPolicyInstancesAsync(
            com.amazonaws.handlers.AsyncHandler<ListTrafficPolicyInstancesRequest, ListTrafficPolicyInstancesResult> asyncHandler);

    /**
     * <p>
     * Gets information about the traffic policy instances that you created in a
     * specified hosted zone.
     * </p>
     * <note>After you submit an <code>UpdateTrafficPolicyInstance</code>
     * request, there's a brief delay while Amazon Route 53 creates the resource
     * record sets that are specified in the traffic policy definition. For more
     * information, see the <a>State</a> response element.</note>
     * <p>
     * To get information about the traffic policy instances that you created in
     * a specified hosted zone, send a <code>GET</code> request to the
     * <code>2015-01-01/trafficpolicyinstance</code> resource and include the ID
     * of the hosted zone.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If you
     * have a lot of traffic policy instances, you can use the
     * <code>MaxItems</code> parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes four values that help you navigate from one group
     * of <code>MaxItems</code> traffic policy instances to the next:
     * </p>
     * <ul>
     * <li><b>IsTruncated</b></li>
     * <p>
     * If the value of <code/>IsTruncated in the response is <code>true</code>,
     * there are more traffic policy instances associated with the current AWS
     * account.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, this response includes
     * the last traffic policy instance that is associated with the current
     * account.
     * </p>
     * <li><b>MaxItems</b></li>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in
     * the request that produced the current response.
     * </p>
     * <li><b>TrafficPolicyInstanceNameMarker</b> and
     * <b>TrafficPolicyInstanceTypeMarker</b></li>
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, these two values in the
     * response represent the first traffic policy instance in the next group of
     * <code>MaxItems</code> traffic policy instances. To list more traffic
     * policy instances, make another call to
     * <code>ListTrafficPolicyInstancesByHostedZone</code>, and specify these
     * values in the corresponding request parameters.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, all three elements are
     * omitted from the response.
     * </p>
     * </ul>
     * 
     * @param listTrafficPolicyInstancesByHostedZoneRequest
     *        A request for the traffic policy instances that you created in a
     *        specified hosted zone.
     * @return A Java Future containing the result of the
     *         ListTrafficPolicyInstancesByHostedZone operation returned by the
     *         service.
     * @sample AmazonRoute53Async.ListTrafficPolicyInstancesByHostedZone
     */
    java.util.concurrent.Future<ListTrafficPolicyInstancesByHostedZoneResult> listTrafficPolicyInstancesByHostedZoneAsync(
            ListTrafficPolicyInstancesByHostedZoneRequest listTrafficPolicyInstancesByHostedZoneRequest);

    /**
     * <p>
     * Gets information about the traffic policy instances that you created in a
     * specified hosted zone.
     * </p>
     * <note>After you submit an <code>UpdateTrafficPolicyInstance</code>
     * request, there's a brief delay while Amazon Route 53 creates the resource
     * record sets that are specified in the traffic policy definition. For more
     * information, see the <a>State</a> response element.</note>
     * <p>
     * To get information about the traffic policy instances that you created in
     * a specified hosted zone, send a <code>GET</code> request to the
     * <code>2015-01-01/trafficpolicyinstance</code> resource and include the ID
     * of the hosted zone.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If you
     * have a lot of traffic policy instances, you can use the
     * <code>MaxItems</code> parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes four values that help you navigate from one group
     * of <code>MaxItems</code> traffic policy instances to the next:
     * </p>
     * <ul>
     * <li><b>IsTruncated</b></li>
     * <p>
     * If the value of <code/>IsTruncated in the response is <code>true</code>,
     * there are more traffic policy instances associated with the current AWS
     * account.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, this response includes
     * the last traffic policy instance that is associated with the current
     * account.
     * </p>
     * <li><b>MaxItems</b></li>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in
     * the request that produced the current response.
     * </p>
     * <li><b>TrafficPolicyInstanceNameMarker</b> and
     * <b>TrafficPolicyInstanceTypeMarker</b></li>
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, these two values in the
     * response represent the first traffic policy instance in the next group of
     * <code>MaxItems</code> traffic policy instances. To list more traffic
     * policy instances, make another call to
     * <code>ListTrafficPolicyInstancesByHostedZone</code>, and specify these
     * values in the corresponding request parameters.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, all three elements are
     * omitted from the response.
     * </p>
     * </ul>
     * 
     * @param listTrafficPolicyInstancesByHostedZoneRequest
     *        A request for the traffic policy instances that you created in a
     *        specified hosted zone.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         ListTrafficPolicyInstancesByHostedZone operation returned by the
     *         service.
     * @sample AmazonRoute53AsyncHandler.ListTrafficPolicyInstancesByHostedZone
     */
    java.util.concurrent.Future<ListTrafficPolicyInstancesByHostedZoneResult> listTrafficPolicyInstancesByHostedZoneAsync(
            ListTrafficPolicyInstancesByHostedZoneRequest listTrafficPolicyInstancesByHostedZoneRequest,
            com.amazonaws.handlers.AsyncHandler<ListTrafficPolicyInstancesByHostedZoneRequest, ListTrafficPolicyInstancesByHostedZoneResult> asyncHandler);

    /**
     * <p>
     * Gets information about the traffic policy instances that you created by
     * using a specify traffic policy version.
     * </p>
     * <note>After you submit a <code>CreateTrafficPolicyInstance</code> or an
     * <code>UpdateTrafficPolicyInstance</code> request, there's a brief delay
     * while Amazon Route 53 creates the resource record sets that are specified
     * in the traffic policy definition. For more information, see the
     * <a>State</a> response element.</note>
     * <p>
     * To get information about the traffic policy instances that you created by
     * using a specify traffic policy version, send a <code>GET</code> request
     * to the <code>2015-01-01/trafficpolicyinstance</code> resource and include
     * the ID and version of the traffic policy.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If you
     * have a lot of traffic policy instances, you can use the
     * <code>MaxItems</code> parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes five values that help you navigate from one group
     * of <code>MaxItems</code> traffic policy instances to the next:
     * </p>
     * <ul>
     * <li><b>IsTruncated</b>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is
     * <code>true</code>, there are more traffic policy instances associated
     * with the specified traffic policy.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, this response includes
     * the last traffic policy instance that is associated with the specified
     * traffic policy.
     * </p>
     * </li>
     * <li><b>MaxItems</b>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in
     * the request that produced the current response.
     * </p>
     * </li>
     * <li><b>HostedZoneIdMarker</b>, <b>TrafficPolicyInstanceNameMarker</b>,
     * and <b>TrafficPolicyInstanceTypeMarker</b>
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, these values in the
     * response represent the first traffic policy instance in the next group of
     * <code>MaxItems</code> traffic policy instances. To list more traffic
     * policy instances, make another call to
     * <code>ListTrafficPolicyInstancesByPolicy</code>, and specify these values
     * in the corresponding request parameters.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, all three elements are
     * omitted from the response.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listTrafficPolicyInstancesByPolicyRequest
     *        A complex type that contains the information about the request to
     *        list your traffic policy instances.
     * @return A Java Future containing the result of the
     *         ListTrafficPolicyInstancesByPolicy operation returned by the
     *         service.
     * @sample AmazonRoute53Async.ListTrafficPolicyInstancesByPolicy
     */
    java.util.concurrent.Future<ListTrafficPolicyInstancesByPolicyResult> listTrafficPolicyInstancesByPolicyAsync(
            ListTrafficPolicyInstancesByPolicyRequest listTrafficPolicyInstancesByPolicyRequest);

    /**
     * <p>
     * Gets information about the traffic policy instances that you created by
     * using a specify traffic policy version.
     * </p>
     * <note>After you submit a <code>CreateTrafficPolicyInstance</code> or an
     * <code>UpdateTrafficPolicyInstance</code> request, there's a brief delay
     * while Amazon Route 53 creates the resource record sets that are specified
     * in the traffic policy definition. For more information, see the
     * <a>State</a> response element.</note>
     * <p>
     * To get information about the traffic policy instances that you created by
     * using a specify traffic policy version, send a <code>GET</code> request
     * to the <code>2015-01-01/trafficpolicyinstance</code> resource and include
     * the ID and version of the traffic policy.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If you
     * have a lot of traffic policy instances, you can use the
     * <code>MaxItems</code> parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes five values that help you navigate from one group
     * of <code>MaxItems</code> traffic policy instances to the next:
     * </p>
     * <ul>
     * <li><b>IsTruncated</b>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is
     * <code>true</code>, there are more traffic policy instances associated
     * with the specified traffic policy.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, this response includes
     * the last traffic policy instance that is associated with the specified
     * traffic policy.
     * </p>
     * </li>
     * <li><b>MaxItems</b>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in
     * the request that produced the current response.
     * </p>
     * </li>
     * <li><b>HostedZoneIdMarker</b>, <b>TrafficPolicyInstanceNameMarker</b>,
     * and <b>TrafficPolicyInstanceTypeMarker</b>
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, these values in the
     * response represent the first traffic policy instance in the next group of
     * <code>MaxItems</code> traffic policy instances. To list more traffic
     * policy instances, make another call to
     * <code>ListTrafficPolicyInstancesByPolicy</code>, and specify these values
     * in the corresponding request parameters.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, all three elements are
     * omitted from the response.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listTrafficPolicyInstancesByPolicyRequest
     *        A complex type that contains the information about the request to
     *        list your traffic policy instances.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         ListTrafficPolicyInstancesByPolicy operation returned by the
     *         service.
     * @sample AmazonRoute53AsyncHandler.ListTrafficPolicyInstancesByPolicy
     */
    java.util.concurrent.Future<ListTrafficPolicyInstancesByPolicyResult> listTrafficPolicyInstancesByPolicyAsync(
            ListTrafficPolicyInstancesByPolicyRequest listTrafficPolicyInstancesByPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<ListTrafficPolicyInstancesByPolicyRequest, ListTrafficPolicyInstancesByPolicyResult> asyncHandler);

    /**
     * <p>
     * Gets information about all of the versions for a specified traffic
     * policy. <code>ListTrafficPolicyVersions</code> lists only versions that
     * have not been deleted.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If you
     * have a lot of traffic policies, you can use the <code>maxitems</code>
     * parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes three values that help you navigate from one group
     * of <code>maxitems</code>maxitems traffic policies to the next:
     * </p>
     * <ul>
     * <li><b>IsTruncated</b></li>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is
     * <code>true</code>, there are more traffic policy versions associated with
     * the specified traffic policy.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, this response includes
     * the last traffic policy version that is associated with the specified
     * traffic policy.
     * </p>
     * <li><b>TrafficPolicyVersionMarker</b></li>
     * <p>
     * The ID of the next traffic policy version that is associated with the
     * current AWS account. If you want to list more traffic policies, make
     * another call to <code>ListTrafficPolicyVersions</code>, and specify the
     * value of the <code>TrafficPolicyVersionMarker</code> element in the
     * <code>TrafficPolicyVersionMarker</code> request parameter.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, Amazon Route 53 omits
     * the <code>TrafficPolicyVersionMarker</code> element from the response.
     * </p>
     * <li><b>MaxItems</b></li>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in
     * the request that produced the current response.
     * </p>
     * </ul>
     * 
     * @param listTrafficPolicyVersionsRequest
     *        A complex type that contains the information about the request to
     *        list your traffic policies.
     * @return A Java Future containing the result of the
     *         ListTrafficPolicyVersions operation returned by the service.
     * @sample AmazonRoute53Async.ListTrafficPolicyVersions
     */
    java.util.concurrent.Future<ListTrafficPolicyVersionsResult> listTrafficPolicyVersionsAsync(
            ListTrafficPolicyVersionsRequest listTrafficPolicyVersionsRequest);

    /**
     * <p>
     * Gets information about all of the versions for a specified traffic
     * policy. <code>ListTrafficPolicyVersions</code> lists only versions that
     * have not been deleted.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If you
     * have a lot of traffic policies, you can use the <code>maxitems</code>
     * parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes three values that help you navigate from one group
     * of <code>maxitems</code>maxitems traffic policies to the next:
     * </p>
     * <ul>
     * <li><b>IsTruncated</b></li>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is
     * <code>true</code>, there are more traffic policy versions associated with
     * the specified traffic policy.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, this response includes
     * the last traffic policy version that is associated with the specified
     * traffic policy.
     * </p>
     * <li><b>TrafficPolicyVersionMarker</b></li>
     * <p>
     * The ID of the next traffic policy version that is associated with the
     * current AWS account. If you want to list more traffic policies, make
     * another call to <code>ListTrafficPolicyVersions</code>, and specify the
     * value of the <code>TrafficPolicyVersionMarker</code> element in the
     * <code>TrafficPolicyVersionMarker</code> request parameter.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code>, Amazon Route 53 omits
     * the <code>TrafficPolicyVersionMarker</code> element from the response.
     * </p>
     * <li><b>MaxItems</b></li>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in
     * the request that produced the current response.
     * </p>
     * </ul>
     * 
     * @param listTrafficPolicyVersionsRequest
     *        A complex type that contains the information about the request to
     *        list your traffic policies.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         ListTrafficPolicyVersions operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.ListTrafficPolicyVersions
     */
    java.util.concurrent.Future<ListTrafficPolicyVersionsResult> listTrafficPolicyVersionsAsync(
            ListTrafficPolicyVersionsRequest listTrafficPolicyVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTrafficPolicyVersionsRequest, ListTrafficPolicyVersionsResult> asyncHandler);

    /**
     * <p>
     * This action updates an existing health check.
     * </p>
     * <p>
     * To update a health check, send a <code>POST</code> request to the
     * <code>2015-01-01/healthcheck/<i>health check ID</i></code> resource. The
     * request body must include an XML document with an
     * <code>UpdateHealthCheckRequest</code> element. The response returns an
     * <code>UpdateHealthCheckResponse</code> element, which contains metadata
     * about the health check.
     * </p>
     * 
     * @param updateHealthCheckRequest
     *        >A complex type that contains information about the request to
     *        update a health check.
     * @return A Java Future containing the result of the UpdateHealthCheck
     *         operation returned by the service.
     * @sample AmazonRoute53Async.UpdateHealthCheck
     */
    java.util.concurrent.Future<UpdateHealthCheckResult> updateHealthCheckAsync(
            UpdateHealthCheckRequest updateHealthCheckRequest);

    /**
     * <p>
     * This action updates an existing health check.
     * </p>
     * <p>
     * To update a health check, send a <code>POST</code> request to the
     * <code>2015-01-01/healthcheck/<i>health check ID</i></code> resource. The
     * request body must include an XML document with an
     * <code>UpdateHealthCheckRequest</code> element. The response returns an
     * <code>UpdateHealthCheckResponse</code> element, which contains metadata
     * about the health check.
     * </p>
     * 
     * @param updateHealthCheckRequest
     *        >A complex type that contains information about the request to
     *        update a health check.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateHealthCheck
     *         operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.UpdateHealthCheck
     */
    java.util.concurrent.Future<UpdateHealthCheckResult> updateHealthCheckAsync(
            UpdateHealthCheckRequest updateHealthCheckRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateHealthCheckRequest, UpdateHealthCheckResult> asyncHandler);

    /**
     * <p>
     * To update the hosted zone comment, send a <code>POST</code> request to
     * the <code>2015-01-01/hostedzone/<i>hosted zone ID</i></code> resource.
     * The request body must include an XML document with a
     * <code>UpdateHostedZoneCommentRequest</code> element. The response to this
     * request includes the modified <code>HostedZone</code> element.
     * </p>
     * <note> The comment can have a maximum length of 256 characters.</note>
     * 
     * @param updateHostedZoneCommentRequest
     *        A complex type that contains information about the request to
     *        update a hosted zone comment.
     * @return A Java Future containing the result of the
     *         UpdateHostedZoneComment operation returned by the service.
     * @sample AmazonRoute53Async.UpdateHostedZoneComment
     */
    java.util.concurrent.Future<UpdateHostedZoneCommentResult> updateHostedZoneCommentAsync(
            UpdateHostedZoneCommentRequest updateHostedZoneCommentRequest);

    /**
     * <p>
     * To update the hosted zone comment, send a <code>POST</code> request to
     * the <code>2015-01-01/hostedzone/<i>hosted zone ID</i></code> resource.
     * The request body must include an XML document with a
     * <code>UpdateHostedZoneCommentRequest</code> element. The response to this
     * request includes the modified <code>HostedZone</code> element.
     * </p>
     * <note> The comment can have a maximum length of 256 characters.</note>
     * 
     * @param updateHostedZoneCommentRequest
     *        A complex type that contains information about the request to
     *        update a hosted zone comment.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         UpdateHostedZoneComment operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.UpdateHostedZoneComment
     */
    java.util.concurrent.Future<UpdateHostedZoneCommentResult> updateHostedZoneCommentAsync(
            UpdateHostedZoneCommentRequest updateHostedZoneCommentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateHostedZoneCommentRequest, UpdateHostedZoneCommentResult> asyncHandler);

    /**
     * <p>
     * Updates the comment for a specified traffic policy version.
     * </p>
     * <p>
     * To update the comment, send a <code>POST</code> request to the
     * <code>/2015-01-01/trafficpolicy/</code> resource.
     * </p>
     * <p>
     * The request body must include an XML document with an
     * <code>UpdateTrafficPolicyCommentRequest</code> element.
     * </p>
     * 
     * @param updateTrafficPolicyCommentRequest
     *        A complex type that contains information about the traffic policy
     *        for which you want to update the comment.
     * @return A Java Future containing the result of the
     *         UpdateTrafficPolicyComment operation returned by the service.
     * @sample AmazonRoute53Async.UpdateTrafficPolicyComment
     */
    java.util.concurrent.Future<UpdateTrafficPolicyCommentResult> updateTrafficPolicyCommentAsync(
            UpdateTrafficPolicyCommentRequest updateTrafficPolicyCommentRequest);

    /**
     * <p>
     * Updates the comment for a specified traffic policy version.
     * </p>
     * <p>
     * To update the comment, send a <code>POST</code> request to the
     * <code>/2015-01-01/trafficpolicy/</code> resource.
     * </p>
     * <p>
     * The request body must include an XML document with an
     * <code>UpdateTrafficPolicyCommentRequest</code> element.
     * </p>
     * 
     * @param updateTrafficPolicyCommentRequest
     *        A complex type that contains information about the traffic policy
     *        for which you want to update the comment.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         UpdateTrafficPolicyComment operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.UpdateTrafficPolicyComment
     */
    java.util.concurrent.Future<UpdateTrafficPolicyCommentResult> updateTrafficPolicyCommentAsync(
            UpdateTrafficPolicyCommentRequest updateTrafficPolicyCommentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTrafficPolicyCommentRequest, UpdateTrafficPolicyCommentResult> asyncHandler);

    /**
     * <p>
     * Updates the resource record sets in a specified hosted zone that were
     * created based on the settings in a specified traffic policy version.
     * </p>
     * <important>The DNS type of the resource record sets that you're updating
     * must match the DNS type in the JSON document that is associated with the
     * traffic policy version that you're using to update the traffic policy
     * instance.</important>
     * <p>
     * When you update a traffic policy instance, Amazon Route 53 continues to
     * respond to DNS queries for the root resource record set name (such as
     * example.com) while it replaces one group of resource record sets with
     * another. Amazon Route 53 performs the following operations:
     * </p>
     * <ol>
     * <li>Amazon Route 53 creates a new group of resource record sets based on
     * the specified traffic policy. This is true regardless of how substantial
     * the differences are between the existing resource record sets and the new
     * resource record sets.</li>
     * <li>When all of the new resource record sets have been created, Amazon
     * Route 53 starts to respond to DNS queries for the root resource record
     * set name (such as example.com) by using the new resource record sets.</li>
     * <li>Amazon Route 53 deletes the old group of resource record sets that
     * are associated with the root resource record set name.</li>
     * </ol>
     * <p>
     * To update a traffic policy instance, send a <code>POST</code> request to
     * the
     * <code>/2015-01-01/trafficpolicyinstance/<i>traffic policy ID</i></code>
     * resource. The request body must include an XML document with an
     * <code>UpdateTrafficPolicyInstanceRequest</code> element.
     * </p>
     * 
     * @param updateTrafficPolicyInstanceRequest
     *        A complex type that contains information about the resource record
     *        sets that you want to update based on a specified traffic policy
     *        instance.
     * @return A Java Future containing the result of the
     *         UpdateTrafficPolicyInstance operation returned by the service.
     * @sample AmazonRoute53Async.UpdateTrafficPolicyInstance
     */
    java.util.concurrent.Future<UpdateTrafficPolicyInstanceResult> updateTrafficPolicyInstanceAsync(
            UpdateTrafficPolicyInstanceRequest updateTrafficPolicyInstanceRequest);

    /**
     * <p>
     * Updates the resource record sets in a specified hosted zone that were
     * created based on the settings in a specified traffic policy version.
     * </p>
     * <important>The DNS type of the resource record sets that you're updating
     * must match the DNS type in the JSON document that is associated with the
     * traffic policy version that you're using to update the traffic policy
     * instance.</important>
     * <p>
     * When you update a traffic policy instance, Amazon Route 53 continues to
     * respond to DNS queries for the root resource record set name (such as
     * example.com) while it replaces one group of resource record sets with
     * another. Amazon Route 53 performs the following operations:
     * </p>
     * <ol>
     * <li>Amazon Route 53 creates a new group of resource record sets based on
     * the specified traffic policy. This is true regardless of how substantial
     * the differences are between the existing resource record sets and the new
     * resource record sets.</li>
     * <li>When all of the new resource record sets have been created, Amazon
     * Route 53 starts to respond to DNS queries for the root resource record
     * set name (such as example.com) by using the new resource record sets.</li>
     * <li>Amazon Route 53 deletes the old group of resource record sets that
     * are associated with the root resource record set name.</li>
     * </ol>
     * <p>
     * To update a traffic policy instance, send a <code>POST</code> request to
     * the
     * <code>/2015-01-01/trafficpolicyinstance/<i>traffic policy ID</i></code>
     * resource. The request body must include an XML document with an
     * <code>UpdateTrafficPolicyInstanceRequest</code> element.
     * </p>
     * 
     * @param updateTrafficPolicyInstanceRequest
     *        A complex type that contains information about the resource record
     *        sets that you want to update based on a specified traffic policy
     *        instance.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         UpdateTrafficPolicyInstance operation returned by the service.
     * @sample AmazonRoute53AsyncHandler.UpdateTrafficPolicyInstance
     */
    java.util.concurrent.Future<UpdateTrafficPolicyInstanceResult> updateTrafficPolicyInstanceAsync(
            UpdateTrafficPolicyInstanceRequest updateTrafficPolicyInstanceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTrafficPolicyInstanceRequest, UpdateTrafficPolicyInstanceResult> asyncHandler);

}
