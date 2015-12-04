/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Interface for accessing AmazonRoute53.
 * 
 */
public interface AmazonRoute53 {

    /**
     * Overrides the default endpoint for this client ("https://route53.amazonaws.com").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "route53.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://route53.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *            The endpoint (ex: "route53.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://route53.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

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
     *            The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException
     *             If the given region is null, or if this service isn't
     *             available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;
    
    /**
     * <p>
     * Gets information about a specified traffic policy instance.
     * </p>
     * <p>
     * To get information about the traffic policy instance, send a
     * <code>GET</code> request to the
     * <code>2013-04-01/trafficpolicyinstance</code> resource.
     * </p>
     * <p>
     * <b>NOTE:</b>After you submit a CreateTrafficPolicyInstance or an
     * UpdateTrafficPolicyInstance request, there's a brief delay while
     * Amazon Route 53 creates the resource record sets that are specified in
     * the traffic policy definition. For more information, see the State
     * response element.
     * </p>
     *
     * @param getTrafficPolicyInstanceRequest Container for the necessary
     *           parameters to execute the GetTrafficPolicyInstance service method on
     *           AmazonRoute53.
     * 
     * @return The response from the GetTrafficPolicyInstance service method,
     *         as returned by AmazonRoute53.
     * 
     * @throws InvalidInputException
     * @throws NoSuchTrafficPolicyInstanceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetTrafficPolicyInstanceResult getTrafficPolicyInstance(GetTrafficPolicyInstanceRequest getTrafficPolicyInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a traffic policy, which you use to create multiple DNS
     * resource record sets for one domain name (such as example.com) or one
     * subdomain name (such as www.example.com).
     * </p>
     * <p>
     * To create a traffic policy, send a <code>POST</code> request to the
     * <code>2013-04-01/trafficpolicy</code> resource. The request body must
     * include an XML document with a <code>CreateTrafficPolicyRequest</code>
     * element. The response includes the
     * <code>CreateTrafficPolicyResponse</code> element, which contains
     * information about the new traffic policy.
     * </p>
     *
     * @param createTrafficPolicyRequest Container for the necessary
     *           parameters to execute the CreateTrafficPolicy service method on
     *           AmazonRoute53.
     * 
     * @return The response from the CreateTrafficPolicy service method, as
     *         returned by AmazonRoute53.
     * 
     * @throws InvalidTrafficPolicyDocumentException
     * @throws InvalidInputException
     * @throws TrafficPolicyAlreadyExistsException
     * @throws TooManyTrafficPoliciesException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateTrafficPolicyResult createTrafficPolicy(CreateTrafficPolicyRequest createTrafficPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the comment for a specified traffic policy version.
     * </p>
     * <p>
     * To update the comment, send a <code>POST</code> request to the
     * <code>/2013-04-01/trafficpolicy/</code> resource.
     * </p>
     * <p>
     * The request body must include an XML document with an
     * <code>UpdateTrafficPolicyCommentRequest</code> element.
     * </p>
     *
     * @param updateTrafficPolicyCommentRequest Container for the necessary
     *           parameters to execute the UpdateTrafficPolicyComment service method on
     *           AmazonRoute53.
     * 
     * @return The response from the UpdateTrafficPolicyComment service
     *         method, as returned by AmazonRoute53.
     * 
     * @throws ConcurrentModificationException
     * @throws NoSuchTrafficPolicyException
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateTrafficPolicyCommentResult updateTrafficPolicyComment(UpdateTrafficPolicyCommentRequest updateTrafficPolicyCommentRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To retrieve the delegation set for a hosted zone, send a
     * <code>GET</code> request to the <code>2013-04-01/hostedzone/hosted
     * zone ID </code> resource. The delegation set is the four Amazon Route
     * 53 name servers that were assigned to the hosted zone when you created
     * it.
     * </p>
     *
     * @param getHostedZoneRequest Container for the necessary parameters to
     *           execute the GetHostedZone service method on AmazonRoute53.
     * 
     * @return The response from the GetHostedZone service method, as
     *         returned by AmazonRoute53.
     * 
     * @throws NoSuchHostedZoneException
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetHostedZoneResult getHostedZone(GetHostedZoneRequest getHostedZoneRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This action returns the current status of a change batch request. The
     * status is one of the following values:
     * </p>
     * <p>
     * - <code>PENDING</code> indicates that the changes in this request
     * have not replicated to all Amazon Route 53 DNS servers. This is the
     * initial status of all change batch requests.
     * </p>
     * <p>
     * - <code>INSYNC</code> indicates that the changes have replicated to
     * all Amazon Route 53 DNS servers.
     * </p>
     *
     * @param getChangeRequest Container for the necessary parameters to
     *           execute the GetChange service method on AmazonRoute53.
     * 
     * @return The response from the GetChange service method, as returned by
     *         AmazonRoute53.
     * 
     * @throws NoSuchChangeException
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetChangeResult getChange(GetChangeRequest getChangeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Updates the resource record sets in a specified hosted zone that were
     * created based on the settings in a specified traffic policy version.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>The DNS type of the resource record sets that you're
     * updating must match the DNS type in the JSON document that is
     * associated with the traffic policy version that you're using to update
     * the traffic policy instance.
     * </p>
     * <p>
     * When you update a traffic policy instance, Amazon Route 53 continues
     * to respond to DNS queries for the root resource record set name (such
     * as example.com) while it replaces one group of resource record sets
     * with another. Amazon Route 53 performs the following operations:
     * </p>
     * <ol> <li>Amazon Route 53 creates a new group of resource record sets
     * based on the specified traffic policy. This is true regardless of how
     * substantial the differences are between the existing resource record
     * sets and the new resource record sets. </li>
     * <li>When all of the new resource record sets have been created,
     * Amazon Route 53 starts to respond to DNS queries for the root resource
     * record set name (such as example.com) by using the new resource record
     * sets.</li>
     * <li>Amazon Route 53 deletes the old group of resource record sets
     * that are associated with the root resource record set name.</li>
     * </ol> <p>
     * To update a traffic policy instance, send a <code>POST</code> request
     * to the <code>/2013-04-01/trafficpolicyinstance/traffic policy ID
     * </code> resource. The request body must include an XML document with
     * an <code>UpdateTrafficPolicyInstanceRequest</code> element.
     * </p>
     *
     * @param updateTrafficPolicyInstanceRequest Container for the necessary
     *           parameters to execute the UpdateTrafficPolicyInstance service method
     *           on AmazonRoute53.
     * 
     * @return The response from the UpdateTrafficPolicyInstance service
     *         method, as returned by AmazonRoute53.
     * 
     * @throws PriorRequestNotCompleteException
     * @throws ConflictingTypesException
     * @throws NoSuchTrafficPolicyException
     * @throws InvalidInputException
     * @throws NoSuchTrafficPolicyInstanceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateTrafficPolicyInstanceResult updateTrafficPolicyInstance(UpdateTrafficPolicyInstanceRequest updateTrafficPolicyInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To retrieve a single geo location, send a <code>GET</code> request to
     * the <code>2013-04-01/geolocation</code> resource with one of these
     * options: continentcode | countrycode | countrycode and
     * subdivisioncode.
     * </p>
     *
     * @param getGeoLocationRequest Container for the necessary parameters to
     *           execute the GetGeoLocation service method on AmazonRoute53.
     * 
     * @return The response from the GetGeoLocation service method, as
     *         returned by AmazonRoute53.
     * 
     * @throws NoSuchGeoLocationException
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetGeoLocationResult getGeoLocation(GetGeoLocationRequest getGeoLocationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To update the hosted zone comment, send a <code>POST</code> request
     * to the <code>2013-04-01/hostedzone/hosted zone ID </code> resource.
     * The request body must include an XML document with a
     * <code>UpdateHostedZoneCommentRequest</code> element. The response to
     * this request includes the modified <code>HostedZone</code> element.
     * </p>
     * <p>
     * <b>NOTE:</b> The comment can have a maximum length of 256 characters.
     * </p>
     *
     * @param updateHostedZoneCommentRequest Container for the necessary
     *           parameters to execute the UpdateHostedZoneComment service method on
     *           AmazonRoute53.
     * 
     * @return The response from the UpdateHostedZoneComment service method,
     *         as returned by AmazonRoute53.
     * 
     * @throws NoSuchHostedZoneException
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateHostedZoneCommentResult updateHostedZoneComment(UpdateHostedZoneCommentRequest updateHostedZoneCommentRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about all of the versions for a specified traffic
     * policy. <code>ListTrafficPolicyVersions</code> lists only versions
     * that have not been deleted.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If
     * you have a lot of traffic policies, you can use the
     * <code>maxitems</code> parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes three values that help you navigate from one
     * group of <code>maxitems</code> maxitems traffic policies to the next:
     * </p>
     * 
     * <ul>
     * <li> <b>IsTruncated</b> </li>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is
     * <code>true</code> , there are more traffic policy versions associated
     * with the specified traffic policy.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code> , this response
     * includes the last traffic policy version that is associated with the
     * specified traffic policy.
     * </p>
     * <li> <b>TrafficPolicyVersionMarker</b> </li>
     * <p>
     * The ID of the next traffic policy version that is associated with the
     * current AWS account. If you want to list more traffic policies, make
     * another call to <code>ListTrafficPolicyVersions</code> , and specify
     * the value of the <code>TrafficPolicyVersionMarker</code> element in
     * the <code>TrafficPolicyVersionMarker</code> request parameter.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code> , Amazon Route 53
     * omits the <code>TrafficPolicyVersionMarker</code> element from the
     * response.
     * </p>
     * <li> <b>MaxItems</b> </li>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter
     * in the request that produced the current response.
     * </p>
     * 
     * </ul>
     *
     * @param listTrafficPolicyVersionsRequest Container for the necessary
     *           parameters to execute the ListTrafficPolicyVersions service method on
     *           AmazonRoute53.
     * 
     * @return The response from the ListTrafficPolicyVersions service
     *         method, as returned by AmazonRoute53.
     * 
     * @throws NoSuchTrafficPolicyException
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListTrafficPolicyVersionsResult listTrafficPolicyVersions(ListTrafficPolicyVersionsRequest listTrafficPolicyVersionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This action deletes a health check. To delete a health check, send a
     * <code>DELETE</code> request to the <code>2013-04-01/healthcheck/health
     * check ID </code> resource.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> You can delete a health check only if there are no
     * resource record sets associated with this health check. If resource
     * record sets are associated with this health check, you must
     * disassociate them before you can delete your health check. If you try
     * to delete a health check that is associated with resource record sets,
     * Amazon Route 53 will deny your request with a HealthCheckInUse error.
     * For information about disassociating the records from your health
     * check, see ChangeResourceRecordSets.
     * </p>
     *
     * @param deleteHealthCheckRequest Container for the necessary parameters
     *           to execute the DeleteHealthCheck service method on AmazonRoute53.
     * 
     * @return The response from the DeleteHealthCheck service method, as
     *         returned by AmazonRoute53.
     * 
     * @throws NoSuchHealthCheckException
     * @throws HealthCheckInUseException
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteHealthCheckResult deleteHealthCheck(DeleteHealthCheckRequest deleteHealthCheckRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param listTagsForResourcesRequest Container for the necessary
     *           parameters to execute the ListTagsForResources service method on
     *           AmazonRoute53.
     * 
     * @return The response from the ListTagsForResources service method, as
     *         returned by AmazonRoute53.
     * 
     * @throws PriorRequestNotCompleteException
     * @throws NoSuchHealthCheckException
     * @throws ThrottlingException
     * @throws NoSuchHostedZoneException
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListTagsForResourcesResult listTagsForResources(ListTagsForResourcesRequest listTagsForResourcesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Imagine all the resource record sets in a zone listed out in front of
     * you. Imagine them sorted lexicographically first by DNS name (with the
     * labels reversed, like "com.amazon.www" for example), and secondarily,
     * lexicographically by record type. This operation retrieves at most
     * MaxItems resource record sets from this list, in order, starting at a
     * position specified by the Name and Type arguments:
     * </p>
     * 
     * <ul>
     * <li>If both Name and Type are omitted, this means start the results
     * at the first RRSET in the HostedZone.</li>
     * <li>If Name is specified but Type is omitted, this means start the
     * results at the first RRSET in the list whose name is greater than or
     * equal to Name. </li>
     * <li>If both Name and Type are specified, this means start the results
     * at the first RRSET in the list whose name is greater than or equal to
     * Name and whose type is greater than or equal to Type.</li>
     * <li>It is an error to specify the Type but not the Name.</li>
     * 
     * </ul>
     * <p>
     * Use ListResourceRecordSets to retrieve a single known record set by
     * specifying the record set's name and type, and setting MaxItems = 1
     * </p>
     * <p>
     * To retrieve all the records in a HostedZone, first pause any
     * processes making calls to ChangeResourceRecordSets. Initially call
     * ListResourceRecordSets without a Name and Type to get the first page
     * of record sets. For subsequent calls, set Name and Type to the
     * NextName and NextType values returned by the previous response.
     * </p>
     * <p>
     * In the presence of concurrent ChangeResourceRecordSets calls, there
     * is no consistency of results across calls to ListResourceRecordSets.
     * The only way to get a consistent multi-page snapshot of all RRSETs in
     * a zone is to stop making changes while pagination is in progress.
     * </p>
     * <p>
     * However, the results from ListResourceRecordSets are consistent
     * within a page. If MakeChange calls are taking place concurrently, the
     * result of each one will either be completely visible in your results
     * or not at all. You will not see partial changes, or changes that do
     * not ultimately succeed. (This follows from the fact that MakeChange is
     * atomic)
     * </p>
     * <p>
     * The results from ListResourceRecordSets are strongly consistent with
     * ChangeResourceRecordSets. To be precise, if a single process makes a
     * call to ChangeResourceRecordSets and receives a successful response,
     * the effects of that change will be visible in a subsequent call to
     * ListResourceRecordSets by that process.
     * </p>
     *
     * @param listResourceRecordSetsRequest Container for the necessary
     *           parameters to execute the ListResourceRecordSets service method on
     *           AmazonRoute53.
     * 
     * @return The response from the ListResourceRecordSets service method,
     *         as returned by AmazonRoute53.
     * 
     * @throws NoSuchHostedZoneException
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListResourceRecordSetsResult listResourceRecordSets(ListResourceRecordSetsRequest listResourceRecordSetsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a traffic policy instance and all of the resource record sets
     * that Amazon Route 53 created when you created the instance.
     * </p>
     * <p>
     * To delete a traffic policy instance, send a <code>DELETE</code>
     * request to the <code>2013-04-01/trafficpolicy/traffic policy instance
     * ID </code> resource.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>When you delete a traffic policy instance, Amazon
     * Route 53 also deletes all of the resource record sets that were
     * created when you created the traffic policy instance.
     * </p>
     *
     * @param deleteTrafficPolicyInstanceRequest Container for the necessary
     *           parameters to execute the DeleteTrafficPolicyInstance service method
     *           on AmazonRoute53.
     * 
     * @return The response from the DeleteTrafficPolicyInstance service
     *         method, as returned by AmazonRoute53.
     * 
     * @throws PriorRequestNotCompleteException
     * @throws InvalidInputException
     * @throws NoSuchTrafficPolicyInstanceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteTrafficPolicyInstanceResult deleteTrafficPolicyInstance(DeleteTrafficPolicyInstanceRequest deleteTrafficPolicyInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about the traffic policy instances that you created
     * in a specified hosted zone.
     * </p>
     * <p>
     * <b>NOTE:</b>After you submit an UpdateTrafficPolicyInstance request,
     * there's a brief delay while Amazon Route 53 creates the resource
     * record sets that are specified in the traffic policy definition. For
     * more information, see the State response element.
     * </p>
     * <p>
     * To get information about the traffic policy instances that you
     * created in a specified hosted zone, send a <code>GET</code> request to
     * the <code>2013-04-01/trafficpolicyinstance</code> resource and include
     * the ID of the hosted zone.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If
     * you have a lot of traffic policy instances, you can use the
     * <code>MaxItems</code> parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes four values that help you navigate from one
     * group of <code>MaxItems</code> traffic policy instances to the next:
     * </p>
     * 
     * <ul>
     * <li> <b>IsTruncated</b> </li>
     * <p>
     * If the value of <code></code> IsTruncated in the response is
     * <code>true</code> , there are more traffic policy instances associated
     * with the current AWS account.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code> , this response
     * includes the last traffic policy instance that is associated with the
     * current account.
     * </p>
     * <li> <b>MaxItems</b> </li>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter
     * in the request that produced the current response.
     * </p>
     * <li> <b>TrafficPolicyInstanceNameMarker</b> and
     * <b>TrafficPolicyInstanceTypeMarker</b> </li>
     * <p>
     * If <code>IsTruncated</code> is <code>true</code> , these two values
     * in the response represent the first traffic policy instance in the
     * next group of <code>MaxItems</code> traffic policy instances. To list
     * more traffic policy instances, make another call to
     * <code>ListTrafficPolicyInstancesByHostedZone</code> , and specify
     * these values in the corresponding request parameters.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code> , all three
     * elements are omitted from the response.
     * </p>
     * 
     * </ul>
     *
     * @param listTrafficPolicyInstancesByHostedZoneRequest Container for the
     *           necessary parameters to execute the
     *           ListTrafficPolicyInstancesByHostedZone service method on
     *           AmazonRoute53.
     * 
     * @return The response from the ListTrafficPolicyInstancesByHostedZone
     *         service method, as returned by AmazonRoute53.
     * 
     * @throws NoSuchHostedZoneException
     * @throws InvalidInputException
     * @throws NoSuchTrafficPolicyInstanceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListTrafficPolicyInstancesByHostedZoneResult listTrafficPolicyInstancesByHostedZone(ListTrafficPolicyInstancesByHostedZoneRequest listTrafficPolicyInstancesByHostedZoneRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This action deletes a reusable delegation set. To delete a reusable
     * delegation set, send a <code>DELETE</code> request to the
     * <code>2013-04-01/delegationset/delegation set ID </code> resource.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> You can delete a reusable delegation set only if
     * there are no associated hosted zones. If your reusable delegation set
     * contains associated hosted zones, you must delete them before you can
     * delete your reusable delegation set. If you try to delete a reusable
     * delegation set that contains associated hosted zones, Amazon Route 53
     * will deny your request with a DelegationSetInUse error.
     * </p>
     *
     * @param deleteReusableDelegationSetRequest Container for the necessary
     *           parameters to execute the DeleteReusableDelegationSet service method
     *           on AmazonRoute53.
     * 
     * @return The response from the DeleteReusableDelegationSet service
     *         method, as returned by AmazonRoute53.
     * 
     * @throws NoSuchDelegationSetException
     * @throws DelegationSetInUseException
     * @throws DelegationSetNotReusableException
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteReusableDelegationSetResult deleteReusableDelegationSet(DeleteReusableDelegationSetRequest deleteReusableDelegationSetRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This action returns the status and changes of a change batch request.
     * </p>
     *
     * @param getChangeDetailsRequest Container for the necessary parameters
     *           to execute the GetChangeDetails service method on AmazonRoute53.
     * 
     * @return The response from the GetChangeDetails service method, as
     *         returned by AmazonRoute53.
     * 
     * @throws NoSuchChangeException
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetChangeDetailsResult getChangeDetails(GetChangeDetailsRequest getChangeDetailsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To retrieve the health check, send a <code>GET</code> request to the
     * <code>2013-04-01/healthcheck/health check ID </code> resource.
     * </p>
     *
     * @param getHealthCheckRequest Container for the necessary parameters to
     *           execute the GetHealthCheck service method on AmazonRoute53.
     * 
     * @return The response from the GetHealthCheck service method, as
     *         returned by AmazonRoute53.
     * 
     * @throws NoSuchHealthCheckException
     * @throws IncompatibleVersionException
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetHealthCheckResult getHealthCheck(GetHealthCheckRequest getHealthCheckRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This action creates a reusable delegationSet.
     * </p>
     * <p>
     * To create a new reusable delegationSet, send a <code>POST</code>
     * request to the <code>2013-04-01/delegationset</code> resource. The
     * request body must include an XML document with a
     * <code>CreateReusableDelegationSetRequest</code> element. The response
     * returns the <code>CreateReusableDelegationSetResponse</code> element
     * that contains metadata about the delegationSet.
     * </p>
     * <p>
     * If the optional parameter HostedZoneId is specified, it marks the
     * delegationSet associated with that particular hosted zone as reusable.
     * </p>
     *
     * @param createReusableDelegationSetRequest Container for the necessary
     *           parameters to execute the CreateReusableDelegationSet service method
     *           on AmazonRoute53.
     * 
     * @return The response from the CreateReusableDelegationSet service
     *         method, as returned by AmazonRoute53.
     * 
     * @throws DelegationSetAlreadyCreatedException
     * @throws HostedZoneNotFoundException
     * @throws DelegationSetNotAvailableException
     * @throws InvalidInputException
     * @throws InvalidArgumentException
     * @throws LimitsExceededException
     * @throws DelegationSetAlreadyReusableException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateReusableDelegationSetResult createReusableDelegationSet(CreateReusableDelegationSetRequest createReusableDelegationSetRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To retrieve a list of the IP ranges used by Amazon Route 53 health
     * checkers to check the health of your resources, send a
     * <code>GET</code> request to the
     * <code>2013-04-01/checkeripranges</code> resource. You can use these IP
     * addresses to configure router and firewall rules to allow health
     * checkers to check the health of your resources.
     * </p>
     *
     * @param getCheckerIpRangesRequest Container for the necessary
     *           parameters to execute the GetCheckerIpRanges service method on
     *           AmazonRoute53.
     * 
     * @return The response from the GetCheckerIpRanges service method, as
     *         returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetCheckerIpRangesResult getCheckerIpRanges(GetCheckerIpRangesRequest getCheckerIpRangesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This action disassociates a VPC from an hosted zone.
     * </p>
     * <p>
     * To disassociate a VPC to a hosted zone, send a <code>POST</code>
     * request to the <code>2013-04-01/hostedzone/hosted zone
     * ID/disassociatevpc</code> resource. The request body must include an
     * XML document with a <code>DisassociateVPCFromHostedZoneRequest</code>
     * element. The response returns the
     * <code>DisassociateVPCFromHostedZoneResponse</code> element that
     * contains <code>ChangeInfo</code> for you to track the progress of the
     * <code>DisassociateVPCFromHostedZoneRequest</code> you made. See
     * <code>GetChange</code> operation for how to track the progress of your
     * change.
     * </p>
     *
     * @param disassociateVPCFromHostedZoneRequest Container for the
     *           necessary parameters to execute the DisassociateVPCFromHostedZone
     *           service method on AmazonRoute53.
     * 
     * @return The response from the DisassociateVPCFromHostedZone service
     *         method, as returned by AmazonRoute53.
     * 
     * @throws InvalidVPCIdException
     * @throws NoSuchHostedZoneException
     * @throws LastVPCAssociationException
     * @throws InvalidInputException
     * @throws VPCAssociationNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DisassociateVPCFromHostedZoneResult disassociateVPCFromHostedZone(DisassociateVPCFromHostedZoneRequest disassociateVPCFromHostedZoneRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This action gets the list of ChangeBatches in a given time period for
     * a given hosted zone and RRSet.
     * </p>
     *
     * @param listChangeBatchesByRRSetRequest Container for the necessary
     *           parameters to execute the ListChangeBatchesByRRSet service method on
     *           AmazonRoute53.
     * 
     * @return The response from the ListChangeBatchesByRRSet service method,
     *         as returned by AmazonRoute53.
     * 
     * @throws NoSuchHostedZoneException
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListChangeBatchesByRRSetResult listChangeBatchesByRRSet(ListChangeBatchesByRRSetRequest listChangeBatchesByRRSetRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * If you want to learn why a health check is currently failing or why
     * it failed most recently (if at all), you can get the failure reason
     * for the most recent failure. Send a <code>GET</code> request to the
     * <code>2013-04-01/healthcheck/health check ID/lastfailurereason</code>
     * resource.
     * </p>
     *
     * @param getHealthCheckLastFailureReasonRequest Container for the
     *           necessary parameters to execute the GetHealthCheckLastFailureReason
     *           service method on AmazonRoute53.
     * 
     * @return The response from the GetHealthCheckLastFailureReason service
     *         method, as returned by AmazonRoute53.
     * 
     * @throws NoSuchHealthCheckException
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetHealthCheckLastFailureReasonResult getHealthCheckLastFailureReason(GetHealthCheckLastFailureReasonRequest getHealthCheckLastFailureReasonRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To retrieve a list of your health checks, send a <code>GET</code>
     * request to the <code>2013-04-01/healthcheck</code> resource. The
     * response to this request includes a <code>HealthChecks</code> element
     * with zero, one, or multiple <code>HealthCheck</code> child elements.
     * By default, the list of health checks is displayed on a single page.
     * You can control the length of the page that is displayed by using the
     * <code>MaxItems</code> parameter. You can use the <code>Marker</code>
     * parameter to control the health check that the list begins with.
     * </p>
     * <p>
     * <b>NOTE:</b> Amazon Route 53 returns a maximum of 100 items. If you
     * set MaxItems to a value greater than 100, Amazon Route 53 returns only
     * the first 100.
     * </p>
     *
     * @param listHealthChecksRequest Container for the necessary parameters
     *           to execute the ListHealthChecks service method on AmazonRoute53.
     * 
     * @return The response from the ListHealthChecks service method, as
     *         returned by AmazonRoute53.
     * 
     * @throws IncompatibleVersionException
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListHealthChecksResult listHealthChecks(ListHealthChecksRequest listHealthChecksRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To retrieve a list of supported geo locations, send a
     * <code>GET</code> request to the <code>2013-04-01/geolocations</code>
     * resource. The response to this request includes a
     * <code>GeoLocationDetailsList</code> element with zero, one, or
     * multiple <code>GeoLocationDetails</code> child elements. The list is
     * sorted by country code, and then subdivision code, followed by
     * continents at the end of the list.
     * </p>
     * <p>
     * By default, the list of geo locations is displayed on a single page.
     * You can control the length of the page that is displayed by using the
     * <code>MaxItems</code> parameter. If the list is truncated,
     * <code>IsTruncated</code> will be set to <i>true</i> and a combination
     * of <code>NextContinentCode, NextCountryCode,
     * NextSubdivisionCode</code> will be populated. You can pass these as
     * parameters to <code>StartContinentCode, StartCountryCode,
     * StartSubdivisionCode</code> to control the geo location that the list
     * begins with.
     * </p>
     *
     * @param listGeoLocationsRequest Container for the necessary parameters
     *           to execute the ListGeoLocations service method on AmazonRoute53.
     * 
     * @return The response from the ListGeoLocations service method, as
     *         returned by AmazonRoute53.
     * 
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListGeoLocationsResult listGeoLocations(ListGeoLocationsRequest listGeoLocationsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This action creates a new health check.
     * </p>
     * <p>
     * To create a new health check, send a <code>POST</code> request to the
     * <code>2013-04-01/healthcheck</code> resource. The request body must
     * include an XML document with a <code>CreateHealthCheckRequest</code>
     * element. The response returns the
     * <code>CreateHealthCheckResponse</code> element that contains metadata
     * about the health check.
     * </p>
     *
     * @param createHealthCheckRequest Container for the necessary parameters
     *           to execute the CreateHealthCheck service method on AmazonRoute53.
     * 
     * @return The response from the CreateHealthCheck service method, as
     *         returned by AmazonRoute53.
     * 
     * @throws HealthCheckAlreadyExistsException
     * @throws InvalidInputException
     * @throws TooManyHealthChecksException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateHealthCheckResult createHealthCheck(CreateHealthCheckRequest createHealthCheckRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To retrieve a count of all your health checks, send a
     * <code>GET</code> request to the
     * <code>2013-04-01/healthcheckcount</code> resource.
     * </p>
     *
     * @param getHealthCheckCountRequest Container for the necessary
     *           parameters to execute the GetHealthCheckCount service method on
     *           AmazonRoute53.
     * 
     * @return The response from the GetHealthCheckCount service method, as
     *         returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetHealthCheckCountResult getHealthCheckCount(GetHealthCheckCountRequest getHealthCheckCountRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param changeTagsForResourceRequest Container for the necessary
     *           parameters to execute the ChangeTagsForResource service method on
     *           AmazonRoute53.
     * 
     * @return The response from the ChangeTagsForResource service method, as
     *         returned by AmazonRoute53.
     * 
     * @throws PriorRequestNotCompleteException
     * @throws NoSuchHealthCheckException
     * @throws ThrottlingException
     * @throws NoSuchHostedZoneException
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ChangeTagsForResourceResult changeTagsForResource(ChangeTagsForResourceRequest changeTagsForResourceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates resource record sets in a specified hosted zone based on the
     * settings in a specified traffic policy version. In addition,
     * <code>CreateTrafficPolicyInstance</code> associates the resource
     * record sets with a specified domain name (such as example.com) or
     * subdomain name (such as www.example.com). Amazon Route 53 responds to
     * DNS queries for the domain or subdomain name by using the resource
     * record sets that <code>CreateTrafficPolicyInstance</code> created.
     * </p>
     * <p>
     * To create a traffic policy instance, send a <code>POST</code> request
     * to the <code>2013-04-01/trafficpolicyinstance</code> resource. The
     * request body must include an XML document with a
     * <code>CreateTrafficPolicyRequest</code> element. The response returns
     * the <code>CreateTrafficPolicyInstanceResponse</code> element, which
     * contains information about the traffic policy instance.
     * </p>
     *
     * @param createTrafficPolicyInstanceRequest Container for the necessary
     *           parameters to execute the CreateTrafficPolicyInstance service method
     *           on AmazonRoute53.
     * 
     * @return The response from the CreateTrafficPolicyInstance service
     *         method, as returned by AmazonRoute53.
     * 
     * @throws NoSuchTrafficPolicyException
     * @throws TrafficPolicyInstanceAlreadyExistsException
     * @throws NoSuchHostedZoneException
     * @throws TooManyTrafficPolicyInstancesException
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateTrafficPolicyInstanceResult createTrafficPolicyInstance(CreateTrafficPolicyInstanceRequest createTrafficPolicyInstanceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about the traffic policy instances that you created
     * by using the current AWS account.
     * </p>
     * <p>
     * <b>NOTE:</b>After you submit an UpdateTrafficPolicyInstance request,
     * there's a brief delay while Amazon Route 53 creates the resource
     * record sets that are specified in the traffic policy definition. For
     * more information, see the State response element.
     * </p>
     * <p>
     * To get information about the traffic policy instances that are
     * associated with the current AWS account, send a <code>GET</code>
     * request to the <code>2013-04-01/trafficpolicyinstance</code> resource.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If
     * you have a lot of traffic policy instances, you can use the
     * <code>MaxItems</code> parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes five values that help you navigate from one
     * group of <code>MaxItems</code> traffic policy instances to the next:
     * </p>
     * 
     * <ul>
     * <li> <b>IsTruncated</b> </li>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is
     * <code>true</code> , there are more traffic policy instances associated
     * with the current AWS account.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code> , this response
     * includes the last traffic policy instance that is associated with the
     * current account.
     * </p>
     * <li> <b>MaxItems</b> </li>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter
     * in the request that produced the current response.
     * </p>
     * <li> <b>HostedZoneIdMarker</b> ,
     * <b>TrafficPolicyInstanceNameMarker</b> , and
     * <b>TrafficPolicyInstanceTypeMarker</b> </li>
     * <p>
     * If <code>IsTruncated</code> is <code>true</code> , these three values
     * in the response represent the first traffic policy instance in the
     * next group of <code>MaxItems</code> traffic policy instances. To list
     * more traffic policy instances, make another call to
     * <code>ListTrafficPolicyInstances</code> , and specify these values in
     * the corresponding request parameters.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code> , all three
     * elements are omitted from the response.
     * </p>
     * 
     * </ul>
     *
     * @param listTrafficPolicyInstancesRequest Container for the necessary
     *           parameters to execute the ListTrafficPolicyInstances service method on
     *           AmazonRoute53.
     * 
     * @return The response from the ListTrafficPolicyInstances service
     *         method, as returned by AmazonRoute53.
     * 
     * @throws InvalidInputException
     * @throws NoSuchTrafficPolicyInstanceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListTrafficPolicyInstancesResult listTrafficPolicyInstances(ListTrafficPolicyInstancesRequest listTrafficPolicyInstancesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about the latest version for every traffic policy
     * that is associated with the current AWS account. To get the
     * information, send a <code>GET</code> request to the
     * <code>2013-04-01/trafficpolicy</code> resource.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If
     * you have a lot of traffic policies, you can use the
     * <code>maxitems</code> parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes three values that help you navigate from one
     * group of <code>maxitems</code> traffic policies to the next:
     * </p>
     * 
     * <ul>
     * <li> <b>IsTruncated</b> </li>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is
     * <code>true</code> , there are more traffic policies associated with
     * the current AWS account.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code> , this response
     * includes the last traffic policy that is associated with the current
     * account.
     * </p>
     * <li> <b>TrafficPolicyIdMarker</b> </li>
     * <p>
     * If <code>IsTruncated</code> is <code>true</code> ,
     * <code>TrafficPolicyIdMarker</code> is the ID of the first traffic
     * policy in the next group of <code>MaxItems</code> traffic policies. If
     * you want to list more traffic policies, make another call to
     * <code>ListTrafficPolicies</code> , and specify the value of the
     * <code>TrafficPolicyIdMarker</code> element from the response in the
     * <code>TrafficPolicyIdMarker</code> request parameter.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code> , the
     * <code>TrafficPolicyIdMarker</code> element is omitted from the
     * response.
     * </p>
     * <li> <b>MaxItems</b> </li>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter
     * in the request that produced the current response.
     * </p>
     * 
     * </ul>
     *
     * @param listTrafficPoliciesRequest Container for the necessary
     *           parameters to execute the ListTrafficPolicies service method on
     *           AmazonRoute53.
     * 
     * @return The response from the ListTrafficPolicies service method, as
     *         returned by AmazonRoute53.
     * 
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListTrafficPoliciesResult listTrafficPolicies(ListTrafficPoliciesRequest listTrafficPoliciesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To retrieve the health check status, send a <code>GET</code> request
     * to the <code>2013-04-01/healthcheck/health check ID/status</code>
     * resource. You can use this call to get a health check's current
     * status.
     * </p>
     *
     * @param getHealthCheckStatusRequest Container for the necessary
     *           parameters to execute the GetHealthCheckStatus service method on
     *           AmazonRoute53.
     * 
     * @return The response from the GetHealthCheckStatus service method, as
     *         returned by AmazonRoute53.
     * 
     * @throws NoSuchHealthCheckException
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetHealthCheckStatusResult getHealthCheckStatus(GetHealthCheckStatusRequest getHealthCheckStatusRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To retrieve a list of your hosted zones, send a <code>GET</code>
     * request to the <code>2013-04-01/hostedzone</code> resource. The
     * response to this request includes a <code>HostedZones</code> element
     * with zero, one, or multiple <code>HostedZone</code> child elements. By
     * default, the list of hosted zones is displayed on a single page. You
     * can control the length of the page that is displayed by using the
     * <code>MaxItems</code> parameter. You can use the <code>Marker</code>
     * parameter to control the hosted zone that the list begins with.
     * </p>
     * <p>
     * <b>NOTE:</b> Amazon Route 53 returns a maximum of 100 items. If you
     * set MaxItems to a value greater than 100, Amazon Route 53 returns only
     * the first 100.
     * </p>
     *
     * @param listHostedZonesRequest Container for the necessary parameters
     *           to execute the ListHostedZones service method on AmazonRoute53.
     * 
     * @return The response from the ListHostedZones service method, as
     *         returned by AmazonRoute53.
     * 
     * @throws NoSuchDelegationSetException
     * @throws DelegationSetNotReusableException
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListHostedZonesResult listHostedZones(ListHostedZonesRequest listHostedZonesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To retrieve a count of all your hosted zones, send a <code>GET</code>
     * request to the <code>2013-04-01/hostedzonecount</code> resource.
     * </p>
     *
     * @param getHostedZoneCountRequest Container for the necessary
     *           parameters to execute the GetHostedZoneCount service method on
     *           AmazonRoute53.
     * 
     * @return The response from the GetHostedZoneCount service method, as
     *         returned by AmazonRoute53.
     * 
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetHostedZoneCountResult getHostedZoneCount(GetHostedZoneCountRequest getHostedZoneCountRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This action updates an existing health check.
     * </p>
     * <p>
     * To update a health check, send a <code>POST</code> request to the
     * <code>2013-04-01/healthcheck/health check ID </code> resource. The
     * request body must include an XML document with an
     * <code>UpdateHealthCheckRequest</code> element. The response returns an
     * <code>UpdateHealthCheckResponse</code> element, which contains
     * metadata about the health check.
     * </p>
     *
     * @param updateHealthCheckRequest Container for the necessary parameters
     *           to execute the UpdateHealthCheck service method on AmazonRoute53.
     * 
     * @return The response from the UpdateHealthCheck service method, as
     *         returned by AmazonRoute53.
     * 
     * @throws HealthCheckVersionMismatchException
     * @throws NoSuchHealthCheckException
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateHealthCheckResult updateHealthCheck(UpdateHealthCheckRequest updateHealthCheckRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To retrieve the reusable delegation set, send a <code>GET</code>
     * request to the <code>2013-04-01/delegationset/delegation set ID
     * </code> resource.
     * </p>
     *
     * @param getReusableDelegationSetRequest Container for the necessary
     *           parameters to execute the GetReusableDelegationSet service method on
     *           AmazonRoute53.
     * 
     * @return The response from the GetReusableDelegationSet service method,
     *         as returned by AmazonRoute53.
     * 
     * @throws NoSuchDelegationSetException
     * @throws DelegationSetNotReusableException
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetReusableDelegationSetResult getReusableDelegationSet(GetReusableDelegationSetRequest getReusableDelegationSetRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To retrieve a list of your hosted zones in lexicographic order, send
     * a <code>GET</code> request to the
     * <code>2013-04-01/hostedzonesbyname</code> resource. The response to
     * this request includes a <code>HostedZones</code> element with zero or
     * more <code>HostedZone</code> child elements lexicographically ordered
     * by DNS name. By default, the list of hosted zones is displayed on a
     * single page. You can control the length of the page that is displayed
     * by using the <code>MaxItems</code> parameter. You can use the
     * <code>DNSName</code> and <code>HostedZoneId</code> parameters to
     * control the hosted zone that the list begins with.
     * </p>
     * <p>
     * <b>NOTE:</b> Amazon Route 53 returns a maximum of 100 items. If you
     * set MaxItems to a value greater than 100, Amazon Route 53 returns only
     * the first 100.
     * </p>
     *
     * @param listHostedZonesByNameRequest Container for the necessary
     *           parameters to execute the ListHostedZonesByName service method on
     *           AmazonRoute53.
     * 
     * @return The response from the ListHostedZonesByName service method, as
     *         returned by AmazonRoute53.
     * 
     * @throws InvalidInputException
     * @throws InvalidDomainNameException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListHostedZonesByNameResult listHostedZonesByName(ListHostedZonesByNameRequest listHostedZonesByNameRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about a specific traffic policy version. To get the
     * information, send a <code>GET</code> request to the
     * <code>2013-04-01/trafficpolicy</code> resource.
     * </p>
     *
     * @param getTrafficPolicyRequest Container for the necessary parameters
     *           to execute the GetTrafficPolicy service method on AmazonRoute53.
     * 
     * @return The response from the GetTrafficPolicy service method, as
     *         returned by AmazonRoute53.
     * 
     * @throws NoSuchTrafficPolicyException
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetTrafficPolicyResult getTrafficPolicy(GetTrafficPolicyRequest getTrafficPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Deletes a traffic policy. To delete a traffic policy, send a
     * <code>DELETE</code> request to the
     * <code>2013-04-01/trafficpolicy</code> resource.
     * </p>
     *
     * @param deleteTrafficPolicyRequest Container for the necessary
     *           parameters to execute the DeleteTrafficPolicy service method on
     *           AmazonRoute53.
     * 
     * @return The response from the DeleteTrafficPolicy service method, as
     *         returned by AmazonRoute53.
     * 
     * @throws ConcurrentModificationException
     * @throws NoSuchTrafficPolicyException
     * @throws TrafficPolicyInUseException
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteTrafficPolicyResult deleteTrafficPolicy(DeleteTrafficPolicyRequest deleteTrafficPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets the number of traffic policy instances that are associated with
     * the current AWS account.
     * </p>
     * <p>
     * To get the number of traffic policy instances, send a
     * <code>GET</code> request to the
     * <code>2013-04-01/trafficpolicyinstancecount</code> resource.
     * </p>
     *
     * @param getTrafficPolicyInstanceCountRequest Container for the
     *           necessary parameters to execute the GetTrafficPolicyInstanceCount
     *           service method on AmazonRoute53.
     * 
     * @return The response from the GetTrafficPolicyInstanceCount service
     *         method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetTrafficPolicyInstanceCountResult getTrafficPolicyInstanceCount(GetTrafficPolicyInstanceCountRequest getTrafficPolicyInstanceCountRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This action deletes a hosted zone. To delete a hosted zone, send a
     * <code>DELETE</code> request to the <code>2013-04-01/hostedzone/hosted
     * zone ID </code> resource.
     * </p>
     * <p>
     * For more information about deleting a hosted zone, see
     * <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/DeleteHostedZone.html"> Deleting a Hosted Zone </a>
     * in the <i>Amazon Route 53 Developer Guide</i> .
     * </p>
     * <p>
     * <b>IMPORTANT:</b> You can delete a hosted zone only if there are no
     * resource record sets other than the default SOA record and NS resource
     * record sets. If your hosted zone contains other resource record sets,
     * you must delete them before you can delete your hosted zone. If you
     * try to delete a hosted zone that contains other resource record sets,
     * Amazon Route 53 will deny your request with a HostedZoneNotEmpty
     * error. For information about deleting records from your hosted zone,
     * see ChangeResourceRecordSets.
     * </p>
     *
     * @param deleteHostedZoneRequest Container for the necessary parameters
     *           to execute the DeleteHostedZone service method on AmazonRoute53.
     * 
     * @return The response from the DeleteHostedZone service method, as
     *         returned by AmazonRoute53.
     * 
     * @throws PriorRequestNotCompleteException
     * @throws HostedZoneNotEmptyException
     * @throws NoSuchHostedZoneException
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DeleteHostedZoneResult deleteHostedZone(DeleteHostedZoneRequest deleteHostedZoneRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This action creates a new hosted zone.
     * </p>
     * <p>
     * To create a new hosted zone, send a <code>POST</code> request to the
     * <code>2013-04-01/hostedzone</code> resource. The request body must
     * include an XML document with a <code>CreateHostedZoneRequest</code>
     * element. The response returns the
     * <code>CreateHostedZoneResponse</code> element that contains metadata
     * about the hosted zone.
     * </p>
     * <p>
     * Amazon Route 53 automatically creates a default SOA record and four
     * NS records for the zone. The NS records in the hosted zone are the
     * name servers you give your registrar to delegate your domain to. For
     * more information about SOA and NS records, see
     * <a href="http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/SOA-NSrecords.html"> NS and SOA Records that Amazon Route 53 Creates for a Hosted Zone </a>
     * in the <i>Amazon Route 53 Developer Guide</i> .
     * </p>
     * <p>
     * When you create a zone, its initial status is <code>PENDING</code> .
     * This means that it is not yet available on all DNS servers. The status
     * of the zone changes to <code>INSYNC</code> when the NS and SOA records
     * are available on all Amazon Route 53 DNS servers.
     * </p>
     * <p>
     * When trying to create a hosted zone using a reusable delegation set,
     * you could specify an optional DelegationSetId, and Route53 would
     * assign those 4 NS records for the zone, instead of alloting a new one.
     * </p>
     *
     * @param createHostedZoneRequest Container for the necessary parameters
     *           to execute the CreateHostedZone service method on AmazonRoute53.
     * 
     * @return The response from the CreateHostedZone service method, as
     *         returned by AmazonRoute53.
     * 
     * @throws ConflictingDomainExistsException
     * @throws TooManyHostedZonesException
     * @throws NoSuchDelegationSetException
     * @throws InvalidVPCIdException
     * @throws DelegationSetNotAvailableException
     * @throws DelegationSetNotReusableException
     * @throws InvalidDomainNameException
     * @throws InvalidInputException
     * @throws HostedZoneAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateHostedZoneResult createHostedZone(CreateHostedZoneRequest createHostedZoneRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This action associates a VPC with an hosted zone.
     * </p>
     * <p>
     * To associate a VPC with an hosted zone, send a <code>POST</code>
     * request to the <code>2013-04-01/hostedzone/hosted zone
     * ID/associatevpc</code> resource. The request body must include an XML
     * document with a <code>AssociateVPCWithHostedZoneRequest</code>
     * element. The response returns the
     * <code>AssociateVPCWithHostedZoneResponse</code> element that contains
     * <code>ChangeInfo</code> for you to track the progress of the
     * <code>AssociateVPCWithHostedZoneRequest</code> you made. See
     * <code>GetChange</code> operation for how to track the progress of your
     * change.
     * </p>
     *
     * @param associateVPCWithHostedZoneRequest Container for the necessary
     *           parameters to execute the AssociateVPCWithHostedZone service method on
     *           AmazonRoute53.
     * 
     * @return The response from the AssociateVPCWithHostedZone service
     *         method, as returned by AmazonRoute53.
     * 
     * @throws ConflictingDomainExistsException
     * @throws InvalidVPCIdException
     * @throws NoSuchHostedZoneException
     * @throws PublicZoneVPCAssociationException
     * @throws InvalidInputException
     * @throws LimitsExceededException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public AssociateVPCWithHostedZoneResult associateVPCWithHostedZone(AssociateVPCWithHostedZoneRequest associateVPCWithHostedZoneRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     *
     * @param listTagsForResourceRequest Container for the necessary
     *           parameters to execute the ListTagsForResource service method on
     *           AmazonRoute53.
     * 
     * @return The response from the ListTagsForResource service method, as
     *         returned by AmazonRoute53.
     * 
     * @throws PriorRequestNotCompleteException
     * @throws NoSuchHealthCheckException
     * @throws ThrottlingException
     * @throws NoSuchHostedZoneException
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To retrieve a list of your reusable delegation sets, send a
     * <code>GET</code> request to the <code>2013-04-01/delegationset</code>
     * resource. The response to this request includes a
     * <code>DelegationSets</code> element with zero, one, or multiple
     * <code>DelegationSet</code> child elements. By default, the list of
     * delegation sets is displayed on a single page. You can control the
     * length of the page that is displayed by using the
     * <code>MaxItems</code> parameter. You can use the <code>Marker</code>
     * parameter to control the delegation set that the list begins with.
     * </p>
     * <p>
     * <b>NOTE:</b> Amazon Route 53 returns a maximum of 100 items. If you
     * set MaxItems to a value greater than 100, Amazon Route 53 returns only
     * the first 100.
     * </p>
     *
     * @param listReusableDelegationSetsRequest Container for the necessary
     *           parameters to execute the ListReusableDelegationSets service method on
     *           AmazonRoute53.
     * 
     * @return The response from the ListReusableDelegationSets service
     *         method, as returned by AmazonRoute53.
     * 
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListReusableDelegationSetsResult listReusableDelegationSets(ListReusableDelegationSetsRequest listReusableDelegationSetsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This action gets the list of ChangeBatches in a given time period for
     * a given hosted zone.
     * </p>
     *
     * @param listChangeBatchesByHostedZoneRequest Container for the
     *           necessary parameters to execute the ListChangeBatchesByHostedZone
     *           service method on AmazonRoute53.
     * 
     * @return The response from the ListChangeBatchesByHostedZone service
     *         method, as returned by AmazonRoute53.
     * 
     * @throws NoSuchHostedZoneException
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListChangeBatchesByHostedZoneResult listChangeBatchesByHostedZone(ListChangeBatchesByHostedZoneRequest listChangeBatchesByHostedZoneRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Use this action to create or change your authoritative DNS
     * information. To use this action, send a <code>POST</code> request to
     * the <code>2013-04-01/hostedzone/hosted Zone ID/rrset</code> resource.
     * The request body must include an XML document with a
     * <code>ChangeResourceRecordSetsRequest</code> element.
     * </p>
     * <p>
     * Changes are a list of change items and are considered transactional.
     * For more information on transactional changes, also known as change
     * batches, see
     * <a href="http://docs.aws.amazon.com/Route53/latest/APIReference/"> POST ChangeResourceRecordSets </a>
     * in the <i>Amazon Route 53 API Reference</i> .
     * </p>
     * <p>
     * <b>IMPORTANT:</b>Due to the nature of transactional changes, you
     * cannot delete the same resource record set more than once in a single
     * change batch. If you attempt to delete the same change batch more than
     * once, Amazon Route 53 returns an InvalidChangeBatch error.
     * </p>
     * <p>
     * In response to a <code>ChangeResourceRecordSets</code> request, your
     * DNS data is changed on all Amazon Route 53 DNS servers. Initially, the
     * status of a change is <code>PENDING</code> . This means the change has
     * not yet propagated to all the authoritative Amazon Route 53 DNS
     * servers. When the change is propagated to all hosts, the change
     * returns a status of <code>INSYNC</code> .
     * </p>
     * <p>
     * Note the following limitations on a
     * <code>ChangeResourceRecordSets</code> request:
     * </p>
     * 
     * <ul>
     * <li>A request cannot contain more than 100 Change elements.</li>
     * <li> A request cannot contain more than 1000 ResourceRecord
     * elements.</li>
     * <li>The sum of the number of characters (including spaces) in all
     * <code>Value</code> elements in a request cannot exceed 32,000
     * characters.</li>
     * 
     * </ul>
     *
     * @param changeResourceRecordSetsRequest Container for the necessary
     *           parameters to execute the ChangeResourceRecordSets service method on
     *           AmazonRoute53.
     * 
     * @return The response from the ChangeResourceRecordSets service method,
     *         as returned by AmazonRoute53.
     * 
     * @throws PriorRequestNotCompleteException
     * @throws NoSuchHealthCheckException
     * @throws NoSuchHostedZoneException
     * @throws InvalidInputException
     * @throws InvalidChangeBatchException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ChangeResourceRecordSetsResult changeResourceRecordSets(ChangeResourceRecordSetsRequest changeResourceRecordSetsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Creates a new version of an existing traffic policy. When you create
     * a new version of a traffic policy, you specify the ID of the traffic
     * policy that you want to update and a JSON-formatted document that
     * describes the new version.
     * </p>
     * <p>
     * You use traffic policies to create multiple DNS resource record sets
     * for one domain name (such as example.com) or one subdomain name (such
     * as www.example.com).
     * </p>
     * <p>
     * To create a new version, send a <code>POST</code> request to the
     * <code>2013-04-01/trafficpolicy/</code> resource. The request body
     * includes an XML document with a
     * <code>CreateTrafficPolicyVersionRequest</code> element. The response
     * returns the <code>CreateTrafficPolicyVersionResponse</code> element,
     * which contains information about the new version of the traffic
     * policy.
     * </p>
     *
     * @param createTrafficPolicyVersionRequest Container for the necessary
     *           parameters to execute the CreateTrafficPolicyVersion service method on
     *           AmazonRoute53.
     * 
     * @return The response from the CreateTrafficPolicyVersion service
     *         method, as returned by AmazonRoute53.
     * 
     * @throws ConcurrentModificationException
     * @throws InvalidTrafficPolicyDocumentException
     * @throws NoSuchTrafficPolicyException
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateTrafficPolicyVersionResult createTrafficPolicyVersion(CreateTrafficPolicyVersionRequest createTrafficPolicyVersionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Gets information about the traffic policy instances that you created
     * by using a specify traffic policy version.
     * </p>
     * <p>
     * <b>NOTE:</b>After you submit a CreateTrafficPolicyInstance or an
     * UpdateTrafficPolicyInstance request, there's a brief delay while
     * Amazon Route 53 creates the resource record sets that are specified in
     * the traffic policy definition. For more information, see the State
     * response element.
     * </p>
     * <p>
     * To get information about the traffic policy instances that you
     * created by using a specify traffic policy version, send a
     * <code>GET</code> request to the
     * <code>2013-04-01/trafficpolicyinstance</code> resource and include the
     * ID and version of the traffic policy.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If
     * you have a lot of traffic policy instances, you can use the
     * <code>MaxItems</code> parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes five values that help you navigate from one
     * group of <code>MaxItems</code> traffic policy instances to the next:
     * </p>
     * 
     * <ul>
     * <li> <b>IsTruncated</b> <p>
     * If the value of <code>IsTruncated</code> in the response is
     * <code>true</code> , there are more traffic policy instances associated
     * with the specified traffic policy.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code> , this response
     * includes the last traffic policy instance that is associated with the
     * specified traffic policy.
     * </p>
     * </li>
     * <li> <b>MaxItems</b> <p>
     * The value that you specified for the <code>MaxItems</code> parameter
     * in the request that produced the current response.
     * </p>
     * </li>
     * <li> <b>HostedZoneIdMarker</b> ,
     * <b>TrafficPolicyInstanceNameMarker</b> , and
     * <b>TrafficPolicyInstanceTypeMarker</b> <p>
     * If <code>IsTruncated</code> is <code>true</code> , these values in
     * the response represent the first traffic policy instance in the next
     * group of <code>MaxItems</code> traffic policy instances. To list more
     * traffic policy instances, make another call to
     * <code>ListTrafficPolicyInstancesByPolicy</code> , and specify these
     * values in the corresponding request parameters.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code> , all three
     * elements are omitted from the response.
     * </p>
     * </li>
     * 
     * </ul>
     *
     * @param listTrafficPolicyInstancesByPolicyRequest Container for the
     *           necessary parameters to execute the ListTrafficPolicyInstancesByPolicy
     *           service method on AmazonRoute53.
     * 
     * @return The response from the ListTrafficPolicyInstancesByPolicy
     *         service method, as returned by AmazonRoute53.
     * 
     * @throws NoSuchTrafficPolicyException
     * @throws InvalidInputException
     * @throws NoSuchTrafficPolicyInstanceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListTrafficPolicyInstancesByPolicyResult listTrafficPolicyInstancesByPolicy(ListTrafficPolicyInstancesByPolicyRequest listTrafficPolicyInstancesByPolicyRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * To retrieve a single geo location, send a <code>GET</code> request to
     * the <code>2013-04-01/geolocation</code> resource with one of these
     * options: continentcode | countrycode | countrycode and
     * subdivisioncode.
     * </p>
     * 
     * @return The response from the GetGeoLocation service method, as
     *         returned by AmazonRoute53.
     * 
     * @throws NoSuchGeoLocationException
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetGeoLocationResult getGeoLocation() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * To retrieve a list of the IP ranges used by Amazon Route 53 health
     * checkers to check the health of your resources, send a
     * <code>GET</code> request to the
     * <code>2013-04-01/checkeripranges</code> resource. You can use these IP
     * addresses to configure router and firewall rules to allow health
     * checkers to check the health of your resources.
     * </p>
     * 
     * @return The response from the GetCheckerIpRanges service method, as
     *         returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetCheckerIpRangesResult getCheckerIpRanges() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * To retrieve a list of your health checks, send a <code>GET</code>
     * request to the <code>2013-04-01/healthcheck</code> resource. The
     * response to this request includes a <code>HealthChecks</code> element
     * with zero, one, or multiple <code>HealthCheck</code> child elements.
     * By default, the list of health checks is displayed on a single page.
     * You can control the length of the page that is displayed by using the
     * <code>MaxItems</code> parameter. You can use the <code>Marker</code>
     * parameter to control the health check that the list begins with.
     * </p>
     * <p>
     * <b>NOTE:</b> Amazon Route 53 returns a maximum of 100 items. If you
     * set MaxItems to a value greater than 100, Amazon Route 53 returns only
     * the first 100.
     * </p>
     * 
     * @return The response from the ListHealthChecks service method, as
     *         returned by AmazonRoute53.
     * 
     * @throws IncompatibleVersionException
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListHealthChecksResult listHealthChecks() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * To retrieve a list of supported geo locations, send a
     * <code>GET</code> request to the <code>2013-04-01/geolocations</code>
     * resource. The response to this request includes a
     * <code>GeoLocationDetailsList</code> element with zero, one, or
     * multiple <code>GeoLocationDetails</code> child elements. The list is
     * sorted by country code, and then subdivision code, followed by
     * continents at the end of the list.
     * </p>
     * <p>
     * By default, the list of geo locations is displayed on a single page.
     * You can control the length of the page that is displayed by using the
     * <code>MaxItems</code> parameter. If the list is truncated,
     * <code>IsTruncated</code> will be set to <i>true</i> and a combination
     * of <code>NextContinentCode, NextCountryCode,
     * NextSubdivisionCode</code> will be populated. You can pass these as
     * parameters to <code>StartContinentCode, StartCountryCode,
     * StartSubdivisionCode</code> to control the geo location that the list
     * begins with.
     * </p>
     * 
     * @return The response from the ListGeoLocations service method, as
     *         returned by AmazonRoute53.
     * 
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListGeoLocationsResult listGeoLocations() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * To retrieve a count of all your health checks, send a
     * <code>GET</code> request to the
     * <code>2013-04-01/healthcheckcount</code> resource.
     * </p>
     * 
     * @return The response from the GetHealthCheckCount service method, as
     *         returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetHealthCheckCountResult getHealthCheckCount() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Gets information about the traffic policy instances that you created
     * by using the current AWS account.
     * </p>
     * <p>
     * <b>NOTE:</b>After you submit an UpdateTrafficPolicyInstance request,
     * there's a brief delay while Amazon Route 53 creates the resource
     * record sets that are specified in the traffic policy definition. For
     * more information, see the State response element.
     * </p>
     * <p>
     * To get information about the traffic policy instances that are
     * associated with the current AWS account, send a <code>GET</code>
     * request to the <code>2013-04-01/trafficpolicyinstance</code> resource.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If
     * you have a lot of traffic policy instances, you can use the
     * <code>MaxItems</code> parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes five values that help you navigate from one
     * group of <code>MaxItems</code> traffic policy instances to the next:
     * </p>
     * 
     * <ul>
     * <li> <b>IsTruncated</b> </li>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is
     * <code>true</code> , there are more traffic policy instances associated
     * with the current AWS account.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code> , this response
     * includes the last traffic policy instance that is associated with the
     * current account.
     * </p>
     * <li> <b>MaxItems</b> </li>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter
     * in the request that produced the current response.
     * </p>
     * <li> <b>HostedZoneIdMarker</b> ,
     * <b>TrafficPolicyInstanceNameMarker</b> , and
     * <b>TrafficPolicyInstanceTypeMarker</b> </li>
     * <p>
     * If <code>IsTruncated</code> is <code>true</code> , these three values
     * in the response represent the first traffic policy instance in the
     * next group of <code>MaxItems</code> traffic policy instances. To list
     * more traffic policy instances, make another call to
     * <code>ListTrafficPolicyInstances</code> , and specify these values in
     * the corresponding request parameters.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code> , all three
     * elements are omitted from the response.
     * </p>
     * 
     * </ul>
     * 
     * @return The response from the ListTrafficPolicyInstances service
     *         method, as returned by AmazonRoute53.
     * 
     * @throws InvalidInputException
     * @throws NoSuchTrafficPolicyInstanceException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListTrafficPolicyInstancesResult listTrafficPolicyInstances() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Gets information about the latest version for every traffic policy
     * that is associated with the current AWS account. To get the
     * information, send a <code>GET</code> request to the
     * <code>2013-04-01/trafficpolicy</code> resource.
     * </p>
     * <p>
     * Amazon Route 53 returns a maximum of 100 items in each response. If
     * you have a lot of traffic policies, you can use the
     * <code>maxitems</code> parameter to list them in groups of up to 100.
     * </p>
     * <p>
     * The response includes three values that help you navigate from one
     * group of <code>maxitems</code> traffic policies to the next:
     * </p>
     * 
     * <ul>
     * <li> <b>IsTruncated</b> </li>
     * <p>
     * If the value of <code>IsTruncated</code> in the response is
     * <code>true</code> , there are more traffic policies associated with
     * the current AWS account.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code> , this response
     * includes the last traffic policy that is associated with the current
     * account.
     * </p>
     * <li> <b>TrafficPolicyIdMarker</b> </li>
     * <p>
     * If <code>IsTruncated</code> is <code>true</code> ,
     * <code>TrafficPolicyIdMarker</code> is the ID of the first traffic
     * policy in the next group of <code>MaxItems</code> traffic policies. If
     * you want to list more traffic policies, make another call to
     * <code>ListTrafficPolicies</code> , and specify the value of the
     * <code>TrafficPolicyIdMarker</code> element from the response in the
     * <code>TrafficPolicyIdMarker</code> request parameter.
     * </p>
     * <p>
     * If <code>IsTruncated</code> is <code>false</code> , the
     * <code>TrafficPolicyIdMarker</code> element is omitted from the
     * response.
     * </p>
     * <li> <b>MaxItems</b> </li>
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter
     * in the request that produced the current response.
     * </p>
     * 
     * </ul>
     * 
     * @return The response from the ListTrafficPolicies service method, as
     *         returned by AmazonRoute53.
     * 
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListTrafficPoliciesResult listTrafficPolicies() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * To retrieve a list of your hosted zones, send a <code>GET</code>
     * request to the <code>2013-04-01/hostedzone</code> resource. The
     * response to this request includes a <code>HostedZones</code> element
     * with zero, one, or multiple <code>HostedZone</code> child elements. By
     * default, the list of hosted zones is displayed on a single page. You
     * can control the length of the page that is displayed by using the
     * <code>MaxItems</code> parameter. You can use the <code>Marker</code>
     * parameter to control the hosted zone that the list begins with.
     * </p>
     * <p>
     * <b>NOTE:</b> Amazon Route 53 returns a maximum of 100 items. If you
     * set MaxItems to a value greater than 100, Amazon Route 53 returns only
     * the first 100.
     * </p>
     * 
     * @return The response from the ListHostedZones service method, as
     *         returned by AmazonRoute53.
     * 
     * @throws NoSuchDelegationSetException
     * @throws DelegationSetNotReusableException
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListHostedZonesResult listHostedZones() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * To retrieve a count of all your hosted zones, send a <code>GET</code>
     * request to the <code>2013-04-01/hostedzonecount</code> resource.
     * </p>
     * 
     * @return The response from the GetHostedZoneCount service method, as
     *         returned by AmazonRoute53.
     * 
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetHostedZoneCountResult getHostedZoneCount() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * To retrieve a list of your hosted zones in lexicographic order, send
     * a <code>GET</code> request to the
     * <code>2013-04-01/hostedzonesbyname</code> resource. The response to
     * this request includes a <code>HostedZones</code> element with zero or
     * more <code>HostedZone</code> child elements lexicographically ordered
     * by DNS name. By default, the list of hosted zones is displayed on a
     * single page. You can control the length of the page that is displayed
     * by using the <code>MaxItems</code> parameter. You can use the
     * <code>DNSName</code> and <code>HostedZoneId</code> parameters to
     * control the hosted zone that the list begins with.
     * </p>
     * <p>
     * <b>NOTE:</b> Amazon Route 53 returns a maximum of 100 items. If you
     * set MaxItems to a value greater than 100, Amazon Route 53 returns only
     * the first 100.
     * </p>
     * 
     * @return The response from the ListHostedZonesByName service method, as
     *         returned by AmazonRoute53.
     * 
     * @throws InvalidInputException
     * @throws InvalidDomainNameException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListHostedZonesByNameResult listHostedZonesByName() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * Gets the number of traffic policy instances that are associated with
     * the current AWS account.
     * </p>
     * <p>
     * To get the number of traffic policy instances, send a
     * <code>GET</code> request to the
     * <code>2013-04-01/trafficpolicyinstancecount</code> resource.
     * </p>
     * 
     * @return The response from the GetTrafficPolicyInstanceCount service
     *         method, as returned by AmazonRoute53.
     * 
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetTrafficPolicyInstanceCountResult getTrafficPolicyInstanceCount() throws AmazonServiceException, AmazonClientException;
    
    /**
     * <p>
     * To retrieve a list of your reusable delegation sets, send a
     * <code>GET</code> request to the <code>2013-04-01/delegationset</code>
     * resource. The response to this request includes a
     * <code>DelegationSets</code> element with zero, one, or multiple
     * <code>DelegationSet</code> child elements. By default, the list of
     * delegation sets is displayed on a single page. You can control the
     * length of the page that is displayed by using the
     * <code>MaxItems</code> parameter. You can use the <code>Marker</code>
     * parameter to control the delegation set that the list begins with.
     * </p>
     * <p>
     * <b>NOTE:</b> Amazon Route 53 returns a maximum of 100 items. If you
     * set MaxItems to a value greater than 100, Amazon Route 53 returns only
     * the first 100.
     * </p>
     * 
     * @return The response from the ListReusableDelegationSets service
     *         method, as returned by AmazonRoute53.
     * 
     * @throws InvalidInputException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonRoute53 indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListReusableDelegationSetsResult listReusableDelegationSets() throws AmazonServiceException, AmazonClientException;
    
    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();
    
    /**
     * Returns additional metadata for a previously executed successful request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing a request.
     *
     * @param request
     *            The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
        