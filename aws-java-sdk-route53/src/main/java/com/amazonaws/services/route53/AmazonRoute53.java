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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.route53.model.*;

/**
 * Interface for accessing Route 53.
 */
public interface AmazonRoute53 {

    /**
     * Overrides the default endpoint for this client
     * ("https://route53.amazonaws.com"). Callers can use this method to control
     * which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "route53.amazonaws.com") or a
     * full URL, including the protocol (ex: "https://route53.amazonaws.com").
     * If the protocol is not specified here, the default protocol from this
     * client's {@link ClientConfiguration} will be used, which by default is
     * HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see: <a
     * href=
     * "http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912"
     * > http://developer.amazonwebservices.com/connect/entry.jspa?externalID=
     * 3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when
     * the client is created and before any service requests are made. Changing
     * it afterwards creates inevitable race conditions for any service requests
     * in transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "route53.amazonaws.com") or a full URL,
     *        including the protocol (ex: "https://route53.amazonaws.com") of
     *        the region specific AWS endpoint this client will communicate
     *        with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonRoute53#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See
     *        {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *        accessing a given region. Must not be null and must be a region
     *        where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class,
     *      com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     */
    void setRegion(Region region);

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
     * @return Result of the AssociateVPCWithHostedZone operation returned by
     *         the service.
     * @throws NoSuchHostedZoneException
     * @throws InvalidVPCIdException
     *         The hosted zone you are trying to create for your VPC_ID does not
     *         belong to you. Amazon Route 53 returns this error when the VPC
     *         specified by <code>VPCId</code> does not belong to you.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws PublicZoneVPCAssociationException
     *         The hosted zone you are trying to associate VPC with doesn't have
     *         any VPC association. Amazon Route 53 currently doesn't support
     *         associate a VPC with a public hosted zone.
     * @throws ConflictingDomainExistsException
     * @throws LimitsExceededException
     *         The limits specified for a resource have been exceeded.
     * @sample AmazonRoute53.AssociateVPCWithHostedZone
     */
    AssociateVPCWithHostedZoneResult associateVPCWithHostedZone(
            AssociateVPCWithHostedZoneRequest associateVPCWithHostedZoneRequest);

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
     * @return Result of the ChangeResourceRecordSets operation returned by the
     *         service.
     * @throws NoSuchHostedZoneException
     * @throws NoSuchHealthCheckException
     *         The health check you are trying to get or delete does not exist.
     * @throws InvalidChangeBatchException
     *         This error contains a list of one or more error messages. Each
     *         error message indicates one error in the change batch. For more
     *         information, see <a href=
     *         "http://docs.aws.amazon.com/Route53/latest/APIReference/API_ChangeResourceRecordSets.html#example_Errors"
     *         >Example InvalidChangeBatch Errors</a>.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws PriorRequestNotCompleteException
     *         The request was rejected because Amazon Route 53 was still
     *         processing a prior request.
     * @sample AmazonRoute53.ChangeResourceRecordSets
     */
    ChangeResourceRecordSetsResult changeResourceRecordSets(
            ChangeResourceRecordSetsRequest changeResourceRecordSetsRequest);

    /**
     * @param changeTagsForResourceRequest
     *        A complex type containing information about a request to add,
     *        change, or delete the tags that are associated with a resource.
     * @return Result of the ChangeTagsForResource operation returned by the
     *         service.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws NoSuchHealthCheckException
     *         The health check you are trying to get or delete does not exist.
     * @throws NoSuchHostedZoneException
     * @throws PriorRequestNotCompleteException
     *         The request was rejected because Amazon Route 53 was still
     *         processing a prior request.
     * @throws ThrottlingException
     * @sample AmazonRoute53.ChangeTagsForResource
     */
    ChangeTagsForResourceResult changeTagsForResource(
            ChangeTagsForResourceRequest changeTagsForResourceRequest);

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
     * @return Result of the CreateHealthCheck operation returned by the
     *         service.
     * @throws TooManyHealthChecksException
     * @throws HealthCheckAlreadyExistsException
     *         The health check you are trying to create already exists. Amazon
     *         Route 53 returns this error when a health check has already been
     *         created with the specified <code>CallerReference</code>.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.CreateHealthCheck
     */
    CreateHealthCheckResult createHealthCheck(
            CreateHealthCheckRequest createHealthCheckRequest);

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
     * @return Result of the CreateHostedZone operation returned by the service.
     * @throws InvalidDomainNameException
     *         This error indicates that the specified domain name is not valid.
     * @throws HostedZoneAlreadyExistsException
     *         The hosted zone you are trying to create already exists. Amazon
     *         Route 53 returns this error when a hosted zone has already been
     *         created with the specified <code>CallerReference</code>.
     * @throws TooManyHostedZonesException
     *         This error indicates that you've reached the maximum number of
     *         hosted zones that can be created for the current AWS account. You
     *         can request an increase to the limit on the <a
     *         href="http://aws.amazon.com/route53-request/">Contact Us</a>
     *         page.
     * @throws InvalidVPCIdException
     *         The hosted zone you are trying to create for your VPC_ID does not
     *         belong to you. Amazon Route 53 returns this error when the VPC
     *         specified by <code>VPCId</code> does not belong to you.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws DelegationSetNotAvailableException
     *         Amazon Route 53 allows some duplicate domain names, but there is
     *         a maximum number of duplicate names. This error indicates that
     *         you have reached that maximum. If you want to create another
     *         hosted zone with the same name and Amazon Route 53 generates this
     *         error, you can request an increase to the limit on the <a
     *         href="http://aws.amazon.com/route53-request/">Contact Us</a>
     *         page.
     * @throws ConflictingDomainExistsException
     * @throws NoSuchDelegationSetException
     *         The specified delegation set does not exist.
     * @throws DelegationSetNotReusableException
     *         The specified delegation set has not been marked as reusable.
     * @sample AmazonRoute53.CreateHostedZone
     */
    CreateHostedZoneResult createHostedZone(
            CreateHostedZoneRequest createHostedZoneRequest);

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
     * @return Result of the CreateReusableDelegationSet operation returned by
     *         the service.
     * @throws DelegationSetAlreadyCreatedException
     *         A delegation set with the same owner and caller reference
     *         combination has already been created.
     * @throws LimitsExceededException
     *         The limits specified for a resource have been exceeded.
     * @throws HostedZoneNotFoundException
     *         The specified HostedZone cannot be found.
     * @throws InvalidArgumentException
     *         At least one of the specified arguments is invalid.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws DelegationSetNotAvailableException
     *         Amazon Route 53 allows some duplicate domain names, but there is
     *         a maximum number of duplicate names. This error indicates that
     *         you have reached that maximum. If you want to create another
     *         hosted zone with the same name and Amazon Route 53 generates this
     *         error, you can request an increase to the limit on the <a
     *         href="http://aws.amazon.com/route53-request/">Contact Us</a>
     *         page.
     * @throws DelegationSetAlreadyReusableException
     *         The specified delegation set has already been marked as reusable.
     * @sample AmazonRoute53.CreateReusableDelegationSet
     */
    CreateReusableDelegationSetResult createReusableDelegationSet(
            CreateReusableDelegationSetRequest createReusableDelegationSetRequest);

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
     * @return Result of the CreateTrafficPolicy operation returned by the
     *         service.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws TooManyTrafficPoliciesException
     *         You've created the maximum number of traffic policies that can be
     *         created for the current AWS account. You can request an increase
     *         to the limit on the <a
     *         href="http://aws.amazon.com/route53-request/">Contact Us</a>
     *         page.
     * @throws TrafficPolicyAlreadyExistsException
     *         A traffic policy that has the same value for <code>Name</code>
     *         already exists.
     * @throws InvalidTrafficPolicyDocumentException
     *         The format of the traffic policy document that you specified in
     *         the <code>Document</code> element is invalid.
     * @sample AmazonRoute53.CreateTrafficPolicy
     */
    CreateTrafficPolicyResult createTrafficPolicy(
            CreateTrafficPolicyRequest createTrafficPolicyRequest);

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
     * @return Result of the CreateTrafficPolicyInstance operation returned by
     *         the service.
     * @throws NoSuchHostedZoneException
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws TooManyTrafficPolicyInstancesException
     *         You've created the maximum number of traffic policy instances
     *         that can be created for the current AWS account. You can request
     *         an increase to the limit on the <a
     *         href="http://aws.amazon.com/route53-request/">Contact Us</a>
     *         page.
     * @throws NoSuchTrafficPolicyException
     *         No traffic policy exists with the specified ID.
     * @throws TrafficPolicyInstanceAlreadyExistsException
     *         Traffic policy instance with given Id already exists.
     * @sample AmazonRoute53.CreateTrafficPolicyInstance
     */
    CreateTrafficPolicyInstanceResult createTrafficPolicyInstance(
            CreateTrafficPolicyInstanceRequest createTrafficPolicyInstanceRequest);

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
     * @return Result of the CreateTrafficPolicyVersion operation returned by
     *         the service.
     * @throws NoSuchTrafficPolicyException
     *         No traffic policy exists with the specified ID.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws ConcurrentModificationException
     *         Another user submitted a request to update the object at the same
     *         time that you did. Retry the request.
     * @throws InvalidTrafficPolicyDocumentException
     *         The format of the traffic policy document that you specified in
     *         the <code>Document</code> element is invalid.
     * @sample AmazonRoute53.CreateTrafficPolicyVersion
     */
    CreateTrafficPolicyVersionResult createTrafficPolicyVersion(
            CreateTrafficPolicyVersionRequest createTrafficPolicyVersionRequest);

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
     * @return Result of the DeleteHealthCheck operation returned by the
     *         service.
     * @throws NoSuchHealthCheckException
     *         The health check you are trying to get or delete does not exist.
     * @throws HealthCheckInUseException
     *         There are resource records associated with this health check.
     *         Before you can delete the health check, you must disassociate it
     *         from the resource record sets.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.DeleteHealthCheck
     */
    DeleteHealthCheckResult deleteHealthCheck(
            DeleteHealthCheckRequest deleteHealthCheckRequest);

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
     * @return Result of the DeleteHostedZone operation returned by the service.
     * @throws NoSuchHostedZoneException
     * @throws HostedZoneNotEmptyException
     *         The hosted zone contains resource record sets in addition to the
     *         default NS and SOA resource record sets. Before you can delete
     *         the hosted zone, you must delete the additional resource record
     *         sets.
     * @throws PriorRequestNotCompleteException
     *         The request was rejected because Amazon Route 53 was still
     *         processing a prior request.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.DeleteHostedZone
     */
    DeleteHostedZoneResult deleteHostedZone(
            DeleteHostedZoneRequest deleteHostedZoneRequest);

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
     * @return Result of the DeleteReusableDelegationSet operation returned by
     *         the service.
     * @throws NoSuchDelegationSetException
     *         The specified delegation set does not exist.
     * @throws DelegationSetInUseException
     *         The specified delegation contains associated hosted zones which
     *         must be deleted before the reusable delegation set can be
     *         deleted.
     * @throws DelegationSetNotReusableException
     *         The specified delegation set has not been marked as reusable.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.DeleteReusableDelegationSet
     */
    DeleteReusableDelegationSetResult deleteReusableDelegationSet(
            DeleteReusableDelegationSetRequest deleteReusableDelegationSetRequest);

    /**
     * <p>
     * Deletes a traffic policy. To delete a traffic policy, send a
     * <code>DELETE</code> request to the <code>2015-01-01/trafficpolicy</code>
     * resource.
     * </p>
     * 
     * @param deleteTrafficPolicyRequest
     *        A request to delete a specified traffic policy version.
     * @return Result of the DeleteTrafficPolicy operation returned by the
     *         service.
     * @throws NoSuchTrafficPolicyException
     *         No traffic policy exists with the specified ID.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws TrafficPolicyInUseException
     *         One or more traffic policy instances were created by using the
     *         specified traffic policy.
     * @throws ConcurrentModificationException
     *         Another user submitted a request to update the object at the same
     *         time that you did. Retry the request.
     * @sample AmazonRoute53.DeleteTrafficPolicy
     */
    DeleteTrafficPolicyResult deleteTrafficPolicy(
            DeleteTrafficPolicyRequest deleteTrafficPolicyRequest);

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
     * @return Result of the DeleteTrafficPolicyInstance operation returned by
     *         the service.
     * @throws NoSuchTrafficPolicyInstanceException
     *         No traffic policy instance exists with the specified ID.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws PriorRequestNotCompleteException
     *         The request was rejected because Amazon Route 53 was still
     *         processing a prior request.
     * @sample AmazonRoute53.DeleteTrafficPolicyInstance
     */
    DeleteTrafficPolicyInstanceResult deleteTrafficPolicyInstance(
            DeleteTrafficPolicyInstanceRequest deleteTrafficPolicyInstanceRequest);

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
     * @return Result of the DisassociateVPCFromHostedZone operation returned by
     *         the service.
     * @throws NoSuchHostedZoneException
     * @throws InvalidVPCIdException
     *         The hosted zone you are trying to create for your VPC_ID does not
     *         belong to you. Amazon Route 53 returns this error when the VPC
     *         specified by <code>VPCId</code> does not belong to you.
     * @throws VPCAssociationNotFoundException
     *         The VPC you specified is not currently associated with the hosted
     *         zone.
     * @throws LastVPCAssociationException
     *         The VPC you are trying to disassociate from the hosted zone is
     *         the last the VPC that is associated with the hosted zone. Amazon
     *         Route 53 currently doesn't support disassociate the last VPC from
     *         the hosted zone.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.DisassociateVPCFromHostedZone
     */
    DisassociateVPCFromHostedZoneResult disassociateVPCFromHostedZone(
            DisassociateVPCFromHostedZoneRequest disassociateVPCFromHostedZoneRequest);

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
     * @return Result of the GetChange operation returned by the service.
     * @throws NoSuchChangeException
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.GetChange
     */
    GetChangeResult getChange(GetChangeRequest getChangeRequest);

    /**
     * <p>
     * This action returns the status and changes of a change batch request.
     * </p>
     * 
     * @param getChangeDetailsRequest
     *        The input for a GetChangeDetails request.
     * @return Result of the GetChangeDetails operation returned by the service.
     * @throws NoSuchChangeException
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.GetChangeDetails
     */
    GetChangeDetailsResult getChangeDetails(
            GetChangeDetailsRequest getChangeDetailsRequest);

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
     * @return Result of the GetCheckerIpRanges operation returned by the
     *         service.
     * @sample AmazonRoute53.GetCheckerIpRanges
     */
    GetCheckerIpRangesResult getCheckerIpRanges(
            GetCheckerIpRangesRequest getCheckerIpRangesRequest);

    /**
     * Simplified method form for invoking the GetCheckerIpRanges operation.
     *
     * @see #getCheckerIpRanges(GetCheckerIpRangesRequest)
     */
    GetCheckerIpRangesResult getCheckerIpRanges();

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
     * @return Result of the GetGeoLocation operation returned by the service.
     * @throws NoSuchGeoLocationException
     *         The geo location you are trying to get does not exist.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.GetGeoLocation
     */
    GetGeoLocationResult getGeoLocation(
            GetGeoLocationRequest getGeoLocationRequest);

    /**
     * Simplified method form for invoking the GetGeoLocation operation.
     *
     * @see #getGeoLocation(GetGeoLocationRequest)
     */
    GetGeoLocationResult getGeoLocation();

    /**
     * <p>
     * To retrieve the health check, send a <code>GET</code> request to the
     * <code>2015-01-01/healthcheck/<i>health check ID</i></code> resource.
     * </p>
     * 
     * @param getHealthCheckRequest
     *        A complex type that contains information about the request to get
     *        a health check.
     * @return Result of the GetHealthCheck operation returned by the service.
     * @throws NoSuchHealthCheckException
     *         The health check you are trying to get or delete does not exist.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws IncompatibleVersionException
     *         The resource you are trying to access is unsupported on this
     *         Amazon Route 53 endpoint. Please consider using a newer endpoint
     *         or a tool that does so.
     * @sample AmazonRoute53.GetHealthCheck
     */
    GetHealthCheckResult getHealthCheck(
            GetHealthCheckRequest getHealthCheckRequest);

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
     * @return Result of the GetHealthCheckCount operation returned by the
     *         service.
     * @sample AmazonRoute53.GetHealthCheckCount
     */
    GetHealthCheckCountResult getHealthCheckCount(
            GetHealthCheckCountRequest getHealthCheckCountRequest);

    /**
     * Simplified method form for invoking the GetHealthCheckCount operation.
     *
     * @see #getHealthCheckCount(GetHealthCheckCountRequest)
     */
    GetHealthCheckCountResult getHealthCheckCount();

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
     * @return Result of the GetHealthCheckLastFailureReason operation returned
     *         by the service.
     * @throws NoSuchHealthCheckException
     *         The health check you are trying to get or delete does not exist.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.GetHealthCheckLastFailureReason
     */
    GetHealthCheckLastFailureReasonResult getHealthCheckLastFailureReason(
            GetHealthCheckLastFailureReasonRequest getHealthCheckLastFailureReasonRequest);

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
     * @return Result of the GetHealthCheckStatus operation returned by the
     *         service.
     * @throws NoSuchHealthCheckException
     *         The health check you are trying to get or delete does not exist.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.GetHealthCheckStatus
     */
    GetHealthCheckStatusResult getHealthCheckStatus(
            GetHealthCheckStatusRequest getHealthCheckStatusRequest);

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
     * @return Result of the GetHostedZone operation returned by the service.
     * @throws NoSuchHostedZoneException
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.GetHostedZone
     */
    GetHostedZoneResult getHostedZone(GetHostedZoneRequest getHostedZoneRequest);

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
     * @return Result of the GetHostedZoneCount operation returned by the
     *         service.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.GetHostedZoneCount
     */
    GetHostedZoneCountResult getHostedZoneCount(
            GetHostedZoneCountRequest getHostedZoneCountRequest);

    /**
     * Simplified method form for invoking the GetHostedZoneCount operation.
     *
     * @see #getHostedZoneCount(GetHostedZoneCountRequest)
     */
    GetHostedZoneCountResult getHostedZoneCount();

    /**
     * <p>
     * To retrieve the reusable delegation set, send a <code>GET</code> request
     * to the <code>2015-01-01/delegationset/<i>delegation set ID</i></code>
     * resource.
     * </p>
     * 
     * @param getReusableDelegationSetRequest
     *        The input for a GetReusableDelegationSet request.
     * @return Result of the GetReusableDelegationSet operation returned by the
     *         service.
     * @throws NoSuchDelegationSetException
     *         The specified delegation set does not exist.
     * @throws DelegationSetNotReusableException
     *         The specified delegation set has not been marked as reusable.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.GetReusableDelegationSet
     */
    GetReusableDelegationSetResult getReusableDelegationSet(
            GetReusableDelegationSetRequest getReusableDelegationSetRequest);

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
     * @return Result of the GetTrafficPolicy operation returned by the service.
     * @throws NoSuchTrafficPolicyException
     *         No traffic policy exists with the specified ID.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.GetTrafficPolicy
     */
    GetTrafficPolicyResult getTrafficPolicy(
            GetTrafficPolicyRequest getTrafficPolicyRequest);

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
     * @return Result of the GetTrafficPolicyInstance operation returned by the
     *         service.
     * @throws NoSuchTrafficPolicyInstanceException
     *         No traffic policy instance exists with the specified ID.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.GetTrafficPolicyInstance
     */
    GetTrafficPolicyInstanceResult getTrafficPolicyInstance(
            GetTrafficPolicyInstanceRequest getTrafficPolicyInstanceRequest);

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
     * @return Result of the GetTrafficPolicyInstanceCount operation returned by
     *         the service.
     * @sample AmazonRoute53.GetTrafficPolicyInstanceCount
     */
    GetTrafficPolicyInstanceCountResult getTrafficPolicyInstanceCount(
            GetTrafficPolicyInstanceCountRequest getTrafficPolicyInstanceCountRequest);

    /**
     * Simplified method form for invoking the GetTrafficPolicyInstanceCount
     * operation.
     *
     * @see #getTrafficPolicyInstanceCount(GetTrafficPolicyInstanceCountRequest)
     */
    GetTrafficPolicyInstanceCountResult getTrafficPolicyInstanceCount();

    /**
     * <p>
     * This action gets the list of ChangeBatches in a given time period for a
     * given hosted zone.
     * </p>
     * 
     * @param listChangeBatchesByHostedZoneRequest
     *        The input for a ListChangeBatchesByHostedZone request.
     * @return Result of the ListChangeBatchesByHostedZone operation returned by
     *         the service.
     * @throws NoSuchHostedZoneException
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.ListChangeBatchesByHostedZone
     */
    ListChangeBatchesByHostedZoneResult listChangeBatchesByHostedZone(
            ListChangeBatchesByHostedZoneRequest listChangeBatchesByHostedZoneRequest);

    /**
     * <p>
     * This action gets the list of ChangeBatches in a given time period for a
     * given hosted zone and RRSet.
     * </p>
     * 
     * @param listChangeBatchesByRRSetRequest
     *        The input for a ListChangeBatchesByRRSet request.
     * @return Result of the ListChangeBatchesByRRSet operation returned by the
     *         service.
     * @throws NoSuchHostedZoneException
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.ListChangeBatchesByRRSet
     */
    ListChangeBatchesByRRSetResult listChangeBatchesByRRSet(
            ListChangeBatchesByRRSetRequest listChangeBatchesByRRSetRequest);

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
     * @return Result of the ListGeoLocations operation returned by the service.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.ListGeoLocations
     */
    ListGeoLocationsResult listGeoLocations(
            ListGeoLocationsRequest listGeoLocationsRequest);

    /**
     * Simplified method form for invoking the ListGeoLocations operation.
     *
     * @see #listGeoLocations(ListGeoLocationsRequest)
     */
    ListGeoLocationsResult listGeoLocations();

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
     * @return Result of the ListHealthChecks operation returned by the service.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws IncompatibleVersionException
     *         The resource you are trying to access is unsupported on this
     *         Amazon Route 53 endpoint. Please consider using a newer endpoint
     *         or a tool that does so.
     * @sample AmazonRoute53.ListHealthChecks
     */
    ListHealthChecksResult listHealthChecks(
            ListHealthChecksRequest listHealthChecksRequest);

    /**
     * Simplified method form for invoking the ListHealthChecks operation.
     *
     * @see #listHealthChecks(ListHealthChecksRequest)
     */
    ListHealthChecksResult listHealthChecks();

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
     * @return Result of the ListHostedZones operation returned by the service.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws NoSuchDelegationSetException
     *         The specified delegation set does not exist.
     * @throws DelegationSetNotReusableException
     *         The specified delegation set has not been marked as reusable.
     * @sample AmazonRoute53.ListHostedZones
     */
    ListHostedZonesResult listHostedZones(
            ListHostedZonesRequest listHostedZonesRequest);

    /**
     * Simplified method form for invoking the ListHostedZones operation.
     *
     * @see #listHostedZones(ListHostedZonesRequest)
     */
    ListHostedZonesResult listHostedZones();

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
     * @return Result of the ListHostedZonesByName operation returned by the
     *         service.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws InvalidDomainNameException
     *         This error indicates that the specified domain name is not valid.
     * @sample AmazonRoute53.ListHostedZonesByName
     */
    ListHostedZonesByNameResult listHostedZonesByName(
            ListHostedZonesByNameRequest listHostedZonesByNameRequest);

    /**
     * Simplified method form for invoking the ListHostedZonesByName operation.
     *
     * @see #listHostedZonesByName(ListHostedZonesByNameRequest)
     */
    ListHostedZonesByNameResult listHostedZonesByName();

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
     * @return Result of the ListResourceRecordSets operation returned by the
     *         service.
     * @throws NoSuchHostedZoneException
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.ListResourceRecordSets
     */
    ListResourceRecordSetsResult listResourceRecordSets(
            ListResourceRecordSetsRequest listResourceRecordSetsRequest);

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
     * @return Result of the ListReusableDelegationSets operation returned by
     *         the service.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.ListReusableDelegationSets
     */
    ListReusableDelegationSetsResult listReusableDelegationSets(
            ListReusableDelegationSetsRequest listReusableDelegationSetsRequest);

    /**
     * Simplified method form for invoking the ListReusableDelegationSets
     * operation.
     *
     * @see #listReusableDelegationSets(ListReusableDelegationSetsRequest)
     */
    ListReusableDelegationSetsResult listReusableDelegationSets();

    /**
     * @param listTagsForResourceRequest
     *        A complex type containing information about a request for a list
     *        of the tags that are associated with an individual resource.
     * @return Result of the ListTagsForResource operation returned by the
     *         service.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws NoSuchHealthCheckException
     *         The health check you are trying to get or delete does not exist.
     * @throws NoSuchHostedZoneException
     * @throws PriorRequestNotCompleteException
     *         The request was rejected because Amazon Route 53 was still
     *         processing a prior request.
     * @throws ThrottlingException
     * @sample AmazonRoute53.ListTagsForResource
     */
    ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * @param listTagsForResourcesRequest
     *        A complex type containing information about a request for a list
     *        of the tags that are associated with up to 10 specified resources.
     * @return Result of the ListTagsForResources operation returned by the
     *         service.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws NoSuchHealthCheckException
     *         The health check you are trying to get or delete does not exist.
     * @throws NoSuchHostedZoneException
     * @throws PriorRequestNotCompleteException
     *         The request was rejected because Amazon Route 53 was still
     *         processing a prior request.
     * @throws ThrottlingException
     * @sample AmazonRoute53.ListTagsForResources
     */
    ListTagsForResourcesResult listTagsForResources(
            ListTagsForResourcesRequest listTagsForResourcesRequest);

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
     * @return Result of the ListTrafficPolicies operation returned by the
     *         service.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.ListTrafficPolicies
     */
    ListTrafficPoliciesResult listTrafficPolicies(
            ListTrafficPoliciesRequest listTrafficPoliciesRequest);

    /**
     * Simplified method form for invoking the ListTrafficPolicies operation.
     *
     * @see #listTrafficPolicies(ListTrafficPoliciesRequest)
     */
    ListTrafficPoliciesResult listTrafficPolicies();

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
     * @return Result of the ListTrafficPolicyInstances operation returned by
     *         the service.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws NoSuchTrafficPolicyInstanceException
     *         No traffic policy instance exists with the specified ID.
     * @sample AmazonRoute53.ListTrafficPolicyInstances
     */
    ListTrafficPolicyInstancesResult listTrafficPolicyInstances(
            ListTrafficPolicyInstancesRequest listTrafficPolicyInstancesRequest);

    /**
     * Simplified method form for invoking the ListTrafficPolicyInstances
     * operation.
     *
     * @see #listTrafficPolicyInstances(ListTrafficPolicyInstancesRequest)
     */
    ListTrafficPolicyInstancesResult listTrafficPolicyInstances();

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
     * @return Result of the ListTrafficPolicyInstancesByHostedZone operation
     *         returned by the service.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws NoSuchTrafficPolicyInstanceException
     *         No traffic policy instance exists with the specified ID.
     * @throws NoSuchHostedZoneException
     * @sample AmazonRoute53.ListTrafficPolicyInstancesByHostedZone
     */
    ListTrafficPolicyInstancesByHostedZoneResult listTrafficPolicyInstancesByHostedZone(
            ListTrafficPolicyInstancesByHostedZoneRequest listTrafficPolicyInstancesByHostedZoneRequest);

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
     * @return Result of the ListTrafficPolicyInstancesByPolicy operation
     *         returned by the service.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws NoSuchTrafficPolicyInstanceException
     *         No traffic policy instance exists with the specified ID.
     * @throws NoSuchTrafficPolicyException
     *         No traffic policy exists with the specified ID.
     * @sample AmazonRoute53.ListTrafficPolicyInstancesByPolicy
     */
    ListTrafficPolicyInstancesByPolicyResult listTrafficPolicyInstancesByPolicy(
            ListTrafficPolicyInstancesByPolicyRequest listTrafficPolicyInstancesByPolicyRequest);

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
     * @return Result of the ListTrafficPolicyVersions operation returned by the
     *         service.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws NoSuchTrafficPolicyException
     *         No traffic policy exists with the specified ID.
     * @sample AmazonRoute53.ListTrafficPolicyVersions
     */
    ListTrafficPolicyVersionsResult listTrafficPolicyVersions(
            ListTrafficPolicyVersionsRequest listTrafficPolicyVersionsRequest);

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
     * @return Result of the UpdateHealthCheck operation returned by the
     *         service.
     * @throws NoSuchHealthCheckException
     *         The health check you are trying to get or delete does not exist.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws HealthCheckVersionMismatchException
     * @sample AmazonRoute53.UpdateHealthCheck
     */
    UpdateHealthCheckResult updateHealthCheck(
            UpdateHealthCheckRequest updateHealthCheckRequest);

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
     * @return Result of the UpdateHostedZoneComment operation returned by the
     *         service.
     * @throws NoSuchHostedZoneException
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @sample AmazonRoute53.UpdateHostedZoneComment
     */
    UpdateHostedZoneCommentResult updateHostedZoneComment(
            UpdateHostedZoneCommentRequest updateHostedZoneCommentRequest);

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
     * @return Result of the UpdateTrafficPolicyComment operation returned by
     *         the service.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws NoSuchTrafficPolicyException
     *         No traffic policy exists with the specified ID.
     * @throws ConcurrentModificationException
     *         Another user submitted a request to update the object at the same
     *         time that you did. Retry the request.
     * @sample AmazonRoute53.UpdateTrafficPolicyComment
     */
    UpdateTrafficPolicyCommentResult updateTrafficPolicyComment(
            UpdateTrafficPolicyCommentRequest updateTrafficPolicyCommentRequest);

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
     * @return Result of the UpdateTrafficPolicyInstance operation returned by
     *         the service.
     * @throws InvalidInputException
     *         Some value specified in the request is invalid or the XML
     *         document is malformed.
     * @throws NoSuchTrafficPolicyException
     *         No traffic policy exists with the specified ID.
     * @throws NoSuchTrafficPolicyInstanceException
     *         No traffic policy instance exists with the specified ID.
     * @throws PriorRequestNotCompleteException
     *         The request was rejected because Amazon Route 53 was still
     *         processing a prior request.
     * @throws ConflictingTypesException
     *         You tried to update a traffic policy instance by using a traffic
     *         policy version that has a different DNS type than the current
     *         type for the instance. You specified the type in the JSON
     *         document in the <code>CreateTrafficPolicy</code> or
     *         <code>CreateTrafficPolicyVersion</code>request.
     * @sample AmazonRoute53.UpdateTrafficPolicyInstance
     */
    UpdateTrafficPolicyInstanceResult updateTrafficPolicyInstance(
            UpdateTrafficPolicyInstanceRequest updateTrafficPolicyInstanceRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request,
     * typically used for debugging issues where a service isn't acting as
     * expected. This data isn't considered part of the result data returned by
     * an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
