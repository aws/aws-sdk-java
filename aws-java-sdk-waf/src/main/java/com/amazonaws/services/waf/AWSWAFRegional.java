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
package com.amazonaws.services.waf;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.waf.model.*;

/**
 * Interface for accessing WAF Regional.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.waf.AbstractAWSWAFRegional} instead.
 * </p>
 * <p>
 * <p>
 * This is the <i>AWS WAF Regional API Reference</i> for using AWS WAF with Elastic Load Balancing (ELB) Application
 * Load Balancers. The AWS WAF actions and data types listed in the reference are available for protecting Application
 * Load Balancers. You can use these actions and data types by means of the endpoints listed in <a
 * href="https://docs.aws.amazon.com/general/latest/gr/rande.html#waf_region">AWS Regions and Endpoints</a>. This guide
 * is for developers who need detailed information about the AWS WAF API actions, data types, and errors. For detailed
 * information about AWS WAF features and an overview of how to use the AWS WAF API, see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSWAFRegional {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "waf-regional";

    /**
     * Overrides the default endpoint for this client ("https://waf-regional.us-east-1.amazonaws.com/"). Callers can use
     * this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "waf-regional.us-east-1.amazonaws.com/") or a full URL, including the
     * protocol (ex: "https://waf-regional.us-east-1.amazonaws.com/"). If the protocol is not specified here, the
     * default protocol from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "waf-regional.us-east-1.amazonaws.com/") or a full URL, including the protocol (ex:
     *        "https://waf-regional.us-east-1.amazonaws.com/") of the region specific AWS endpoint this client will
     *        communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSWAFRegional#setEndpoint(String)}, sets the regional endpoint for this client's
     * service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

    /**
     * <p>
     * Associates a web ACL with a resource, either an application load balancer or Amazon API Gateway stage.
     * </p>
     * 
     * @param associateWebACLRequest
     * @return Result of the AssociateWebACL operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>RateBasedRule</code> with a <code>RateKey</code> value other than
     *         <code>IP</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, METHOD, QUERY_STRING, URI, or BODY.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFUnavailableEntityException
     *         The operation failed because the entity referenced is temporarily unavailable. Retry your request.
     * @sample AWSWAFRegional.AssociateWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/AssociateWebACL" target="_top">AWS
     *      API Documentation</a>
     */
    AssociateWebACLResult associateWebACL(AssociateWebACLRequest associateWebACLRequest);

    /**
     * <p>
     * Creates a <code>ByteMatchSet</code>. You then use <a>UpdateByteMatchSet</a> to identify the part of a web request
     * that you want AWS WAF to inspect, such as the values of the <code>User-Agent</code> header or the query string.
     * For example, you can create a <code>ByteMatchSet</code> that matches any requests with <code>User-Agent</code>
     * headers that contain the string <code>BadBot</code>. You can then configure AWS WAF to reject those requests.
     * </p>
     * <p>
     * To create and configure a <code>ByteMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>CreateByteMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateByteMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <code>UpdateByteMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateByteMatchSet</a> request to specify the part of the request that you want AWS WAF to inspect
     * (for example, the header or the URI) and the value that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createByteMatchSetRequest
     * @return Result of the CreateByteMatchSet operation returned by the service.
     * @throws WAFDisallowedNameException
     *         The name specified is invalid.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>RateBasedRule</code> with a <code>RateKey</code> value other than
     *         <code>IP</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, METHOD, QUERY_STRING, URI, or BODY.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFLimitsExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>WebACL</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @sample AWSWAFRegional.CreateByteMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateByteMatchSet"
     *      target="_top">AWS API Documentation</a>
     */
    CreateByteMatchSetResult createByteMatchSet(CreateByteMatchSetRequest createByteMatchSetRequest);

    /**
     * <p>
     * Creates an <a>GeoMatchSet</a>, which you use to specify which web requests you want to allow or block based on
     * the country that the requests originate from. For example, if you're receiving a lot of requests from one or more
     * countries and you want to block the requests, you can create an <code>GeoMatchSet</code> that contains those
     * countries and then configure AWS WAF to block the requests.
     * </p>
     * <p>
     * To create and configure a <code>GeoMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>CreateGeoMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateGeoMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <a>UpdateGeoMatchSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateGeoMatchSetSet</code> request to specify the countries that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createGeoMatchSetRequest
     * @return Result of the CreateGeoMatchSet operation returned by the service.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFDisallowedNameException
     *         The name specified is invalid.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>RateBasedRule</code> with a <code>RateKey</code> value other than
     *         <code>IP</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, METHOD, QUERY_STRING, URI, or BODY.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFLimitsExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>WebACL</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @sample AWSWAFRegional.CreateGeoMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateGeoMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    CreateGeoMatchSetResult createGeoMatchSet(CreateGeoMatchSetRequest createGeoMatchSetRequest);

    /**
     * <p>
     * Creates an <a>IPSet</a>, which you use to specify which web requests that you want to allow or block based on the
     * IP addresses that the requests originate from. For example, if you're receiving a lot of requests from one or
     * more individual IP addresses or one or more ranges of IP addresses and you want to block the requests, you can
     * create an <code>IPSet</code> that contains those IP addresses and then configure AWS WAF to block the requests.
     * </p>
     * <p>
     * To create and configure an <code>IPSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>CreateIPSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateIPSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <a>UpdateIPSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateIPSet</code> request to specify the IP addresses that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createIPSetRequest
     * @return Result of the CreateIPSet operation returned by the service.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFDisallowedNameException
     *         The name specified is invalid.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>RateBasedRule</code> with a <code>RateKey</code> value other than
     *         <code>IP</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, METHOD, QUERY_STRING, URI, or BODY.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFLimitsExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>WebACL</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @sample AWSWAFRegional.CreateIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    CreateIPSetResult createIPSet(CreateIPSetRequest createIPSetRequest);

    /**
     * <p>
     * Creates a <a>RateBasedRule</a>. The <code>RateBasedRule</code> contains a <code>RateLimit</code>, which specifies
     * the maximum number of requests that AWS WAF allows from a specified IP address in a five-minute period. The
     * <code>RateBasedRule</code> also contains the <code>IPSet</code> objects, <code>ByteMatchSet</code> objects, and
     * other predicates that identify the requests that you want to count or block if these requests exceed the
     * <code>RateLimit</code>.
     * </p>
     * <p>
     * If you add more than one predicate to a <code>RateBasedRule</code>, a request not only must exceed the
     * <code>RateLimit</code>, but it also must match all the specifications to be counted or blocked. For example,
     * suppose you add the following to a <code>RateBasedRule</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An <code>IPSet</code> that matches the IP address <code>192.0.2.44/32</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>ByteMatchSet</code> that matches <code>BadBot</code> in the <code>User-Agent</code> header
     * </p>
     * </li>
     * </ul>
     * <p>
     * Further, you specify a <code>RateLimit</code> of 15,000.
     * </p>
     * <p>
     * You then add the <code>RateBasedRule</code> to a <code>WebACL</code> and specify that you want to block requests
     * that meet the conditions in the rule. For a request to be blocked, it must come from the IP address 192.0.2.44
     * <i>and</i> the <code>User-Agent</code> header in the request must contain the value <code>BadBot</code>. Further,
     * requests that match these two conditions must be received at a rate of more than 15,000 requests every five
     * minutes. If both conditions are met and the rate is exceeded, AWS WAF blocks the requests. If the rate drops
     * below 15,000 for a five-minute period, AWS WAF no longer blocks the requests.
     * </p>
     * <p>
     * As a second example, suppose you want to limit requests to a particular page on your site. To do this, you could
     * add the following to a <code>RateBasedRule</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A <code>ByteMatchSet</code> with <code>FieldToMatch</code> of <code>URI</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>PositionalConstraint</code> of <code>STARTS_WITH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>TargetString</code> of <code>login</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Further, you specify a <code>RateLimit</code> of 15,000.
     * </p>
     * <p>
     * By adding this <code>RateBasedRule</code> to a <code>WebACL</code>, you could limit requests to your login page
     * without affecting the rest of your site.
     * </p>
     * <p>
     * To create and configure a <code>RateBasedRule</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create and update the predicates that you want to include in the rule. For more information, see
     * <a>CreateByteMatchSet</a>, <a>CreateIPSet</a>, and <a>CreateSqlInjectionMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>CreateRule</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateRateBasedRule</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <a>UpdateRule</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateRateBasedRule</code> request to specify the predicates that you want to include in the
     * rule.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update a <code>WebACL</code> that contains the <code>RateBasedRule</code>. For more information, see
     * <a>CreateWebACL</a>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createRateBasedRuleRequest
     * @return Result of the CreateRateBasedRule operation returned by the service.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFDisallowedNameException
     *         The name specified is invalid.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>RateBasedRule</code> with a <code>RateKey</code> value other than
     *         <code>IP</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, METHOD, QUERY_STRING, URI, or BODY.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFLimitsExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>WebACL</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @sample AWSWAFRegional.CreateRateBasedRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateRateBasedRule"
     *      target="_top">AWS API Documentation</a>
     */
    CreateRateBasedRuleResult createRateBasedRule(CreateRateBasedRuleRequest createRateBasedRuleRequest);

    /**
     * <p>
     * Creates a <a>RegexMatchSet</a>. You then use <a>UpdateRegexMatchSet</a> to identify the part of a web request
     * that you want AWS WAF to inspect, such as the values of the <code>User-Agent</code> header or the query string.
     * For example, you can create a <code>RegexMatchSet</code> that contains a <code>RegexMatchTuple</code> that looks
     * for any requests with <code>User-Agent</code> headers that match a <code>RegexPatternSet</code> with pattern
     * <code>B[a@]dB[o0]t</code>. You can then configure AWS WAF to reject those requests.
     * </p>
     * <p>
     * To create and configure a <code>RegexMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>CreateRegexMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateRegexMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <code>UpdateRegexMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateRegexMatchSet</a> request to specify the part of the request that you want AWS WAF to inspect
     * (for example, the header or the URI) and the value, using a <code>RegexPatternSet</code>, that you want AWS WAF
     * to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createRegexMatchSetRequest
     * @return Result of the CreateRegexMatchSet operation returned by the service.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFDisallowedNameException
     *         The name specified is invalid.
     * @throws WAFLimitsExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>WebACL</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @sample AWSWAFRegional.CreateRegexMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateRegexMatchSet"
     *      target="_top">AWS API Documentation</a>
     */
    CreateRegexMatchSetResult createRegexMatchSet(CreateRegexMatchSetRequest createRegexMatchSetRequest);

    /**
     * <p>
     * Creates a <code>RegexPatternSet</code>. You then use <a>UpdateRegexPatternSet</a> to specify the regular
     * expression (regex) pattern that you want AWS WAF to search for, such as <code>B[a@]dB[o0]t</code>. You can then
     * configure AWS WAF to reject those requests.
     * </p>
     * <p>
     * To create and configure a <code>RegexPatternSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>CreateRegexPatternSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateRegexPatternSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <code>UpdateRegexPatternSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateRegexPatternSet</a> request to specify the string that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createRegexPatternSetRequest
     * @return Result of the CreateRegexPatternSet operation returned by the service.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFDisallowedNameException
     *         The name specified is invalid.
     * @throws WAFLimitsExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>WebACL</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @sample AWSWAFRegional.CreateRegexPatternSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateRegexPatternSet"
     *      target="_top">AWS API Documentation</a>
     */
    CreateRegexPatternSetResult createRegexPatternSet(CreateRegexPatternSetRequest createRegexPatternSetRequest);

    /**
     * <p>
     * Creates a <code>Rule</code>, which contains the <code>IPSet</code> objects, <code>ByteMatchSet</code> objects,
     * and other predicates that identify the requests that you want to block. If you add more than one predicate to a
     * <code>Rule</code>, a request must match all of the specifications to be allowed or blocked. For example, suppose
     * that you add the following to a <code>Rule</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An <code>IPSet</code> that matches the IP address <code>192.0.2.44/32</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>ByteMatchSet</code> that matches <code>BadBot</code> in the <code>User-Agent</code> header
     * </p>
     * </li>
     * </ul>
     * <p>
     * You then add the <code>Rule</code> to a <code>WebACL</code> and specify that you want to blocks requests that
     * satisfy the <code>Rule</code>. For a request to be blocked, it must come from the IP address 192.0.2.44
     * <i>and</i> the <code>User-Agent</code> header in the request must contain the value <code>BadBot</code>.
     * </p>
     * <p>
     * To create and configure a <code>Rule</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create and update the predicates that you want to include in the <code>Rule</code>. For more information, see
     * <a>CreateByteMatchSet</a>, <a>CreateIPSet</a>, and <a>CreateSqlInjectionMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>CreateRule</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateRule</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <a>UpdateRule</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateRule</code> request to specify the predicates that you want to include in the
     * <code>Rule</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update a <code>WebACL</code> that contains the <code>Rule</code>. For more information, see
     * <a>CreateWebACL</a>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createRuleRequest
     * @return Result of the CreateRule operation returned by the service.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFDisallowedNameException
     *         The name specified is invalid.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>RateBasedRule</code> with a <code>RateKey</code> value other than
     *         <code>IP</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, METHOD, QUERY_STRING, URI, or BODY.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFLimitsExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>WebACL</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @sample AWSWAFRegional.CreateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateRule" target="_top">AWS API
     *      Documentation</a>
     */
    CreateRuleResult createRule(CreateRuleRequest createRuleRequest);

    /**
     * <p>
     * Creates a <code>RuleGroup</code>. A rule group is a collection of predefined rules that you add to a web ACL. You
     * use <a>UpdateRuleGroup</a> to add rules to the rule group.
     * </p>
     * <p>
     * Rule groups are subject to the following limits:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Three rule groups per account. You can request an increase to this limit by contacting customer support.
     * </p>
     * </li>
     * <li>
     * <p>
     * One rule group per web ACL.
     * </p>
     * </li>
     * <li>
     * <p>
     * Ten rules per rule group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createRuleGroupRequest
     * @return Result of the CreateRuleGroup operation returned by the service.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFDisallowedNameException
     *         The name specified is invalid.
     * @throws WAFLimitsExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>WebACL</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @sample AWSWAFRegional.CreateRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateRuleGroup" target="_top">AWS
     *      API Documentation</a>
     */
    CreateRuleGroupResult createRuleGroup(CreateRuleGroupRequest createRuleGroupRequest);

    /**
     * <p>
     * Creates a <code>SizeConstraintSet</code>. You then use <a>UpdateSizeConstraintSet</a> to identify the part of a
     * web request that you want AWS WAF to check for length, such as the length of the <code>User-Agent</code> header
     * or the length of the query string. For example, you can create a <code>SizeConstraintSet</code> that matches any
     * requests that have a query string that is longer than 100 bytes. You can then configure AWS WAF to reject those
     * requests.
     * </p>
     * <p>
     * To create and configure a <code>SizeConstraintSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>CreateSizeConstraintSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateSizeConstraintSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <code>UpdateSizeConstraintSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateSizeConstraintSet</a> request to specify the part of the request that you want AWS WAF to
     * inspect (for example, the header or the URI) and the value that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createSizeConstraintSetRequest
     * @return Result of the CreateSizeConstraintSet operation returned by the service.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFDisallowedNameException
     *         The name specified is invalid.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>RateBasedRule</code> with a <code>RateKey</code> value other than
     *         <code>IP</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, METHOD, QUERY_STRING, URI, or BODY.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFLimitsExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>WebACL</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @sample AWSWAFRegional.CreateSizeConstraintSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateSizeConstraintSet"
     *      target="_top">AWS API Documentation</a>
     */
    CreateSizeConstraintSetResult createSizeConstraintSet(CreateSizeConstraintSetRequest createSizeConstraintSetRequest);

    /**
     * <p>
     * Creates a <a>SqlInjectionMatchSet</a>, which you use to allow, block, or count requests that contain snippets of
     * SQL code in a specified part of web requests. AWS WAF searches for character sequences that are likely to be
     * malicious strings.
     * </p>
     * <p>
     * To create and configure a <code>SqlInjectionMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>CreateSqlInjectionMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateSqlInjectionMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <a>UpdateSqlInjectionMatchSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateSqlInjectionMatchSet</a> request to specify the parts of web requests in which you want to
     * allow, block, or count malicious SQL code.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createSqlInjectionMatchSetRequest
     *        A request to create a <a>SqlInjectionMatchSet</a>.
     * @return Result of the CreateSqlInjectionMatchSet operation returned by the service.
     * @throws WAFDisallowedNameException
     *         The name specified is invalid.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>RateBasedRule</code> with a <code>RateKey</code> value other than
     *         <code>IP</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, METHOD, QUERY_STRING, URI, or BODY.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFLimitsExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>WebACL</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @sample AWSWAFRegional.CreateSqlInjectionMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateSqlInjectionMatchSet"
     *      target="_top">AWS API Documentation</a>
     */
    CreateSqlInjectionMatchSetResult createSqlInjectionMatchSet(CreateSqlInjectionMatchSetRequest createSqlInjectionMatchSetRequest);

    /**
     * <p>
     * Creates a <code>WebACL</code>, which contains the <code>Rules</code> that identify the CloudFront web requests
     * that you want to allow, block, or count. AWS WAF evaluates <code>Rules</code> in order based on the value of
     * <code>Priority</code> for each <code>Rule</code>.
     * </p>
     * <p>
     * You also specify a default action, either <code>ALLOW</code> or <code>BLOCK</code>. If a web request doesn't
     * match any of the <code>Rules</code> in a <code>WebACL</code>, AWS WAF responds to the request with the default
     * action.
     * </p>
     * <p>
     * To create and configure a <code>WebACL</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create and update the <code>ByteMatchSet</code> objects and other predicates that you want to include in
     * <code>Rules</code>. For more information, see <a>CreateByteMatchSet</a>, <a>UpdateByteMatchSet</a>,
     * <a>CreateIPSet</a>, <a>UpdateIPSet</a>, <a>CreateSqlInjectionMatchSet</a>, and <a>UpdateSqlInjectionMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update the <code>Rules</code> that you want to include in the <code>WebACL</code>. For more
     * information, see <a>CreateRule</a> and <a>UpdateRule</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>CreateWebACL</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateWebACL</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <a>UpdateWebACL</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateWebACL</a> request to specify the <code>Rules</code> that you want to include in the
     * <code>WebACL</code>, to specify the default action, and to associate the <code>WebACL</code> with a CloudFront
     * distribution.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createWebACLRequest
     * @return Result of the CreateWebACL operation returned by the service.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFDisallowedNameException
     *         The name specified is invalid.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>RateBasedRule</code> with a <code>RateKey</code> value other than
     *         <code>IP</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, METHOD, QUERY_STRING, URI, or BODY.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFLimitsExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>WebACL</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @sample AWSWAFRegional.CreateWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    CreateWebACLResult createWebACL(CreateWebACLRequest createWebACLRequest);

    /**
     * <p>
     * Creates an <a>XssMatchSet</a>, which you use to allow, block, or count requests that contain cross-site scripting
     * attacks in the specified part of web requests. AWS WAF searches for character sequences that are likely to be
     * malicious strings.
     * </p>
     * <p>
     * To create and configure an <code>XssMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>CreateXssMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>CreateXssMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <a>UpdateXssMatchSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <a>UpdateXssMatchSet</a> request to specify the parts of web requests in which you want to allow,
     * block, or count cross-site scripting attacks.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param createXssMatchSetRequest
     *        A request to create an <a>XssMatchSet</a>.
     * @return Result of the CreateXssMatchSet operation returned by the service.
     * @throws WAFDisallowedNameException
     *         The name specified is invalid.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>RateBasedRule</code> with a <code>RateKey</code> value other than
     *         <code>IP</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, METHOD, QUERY_STRING, URI, or BODY.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFLimitsExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>WebACL</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @sample AWSWAFRegional.CreateXssMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/CreateXssMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    CreateXssMatchSetResult createXssMatchSet(CreateXssMatchSetRequest createXssMatchSetRequest);

    /**
     * <p>
     * Permanently deletes a <a>ByteMatchSet</a>. You can't delete a <code>ByteMatchSet</code> if it's still used in any
     * <code>Rules</code> or if it still includes any <a>ByteMatchTuple</a> objects (any filters).
     * </p>
     * <p>
     * If you just want to remove a <code>ByteMatchSet</code> from a <code>Rule</code>, use <a>UpdateRule</a>.
     * </p>
     * <p>
     * To permanently delete a <code>ByteMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>ByteMatchSet</code> to remove filters, if any. For more information, see
     * <a>UpdateByteMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>DeleteByteMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteByteMatchSet</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteByteMatchSetRequest
     * @return Result of the DeleteByteMatchSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFReferencedItemException
     *         The operation failed because you tried to delete an object that is still in use. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that is still referenced by a <code>Rule</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that is still referenced by a <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFNonEmptyEntityException
     *         The operation failed because you tried to delete an object that isn't empty. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>WebACL</code> that still contains one or more <code>Rule</code> objects.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that still contains one or more <code>ByteMatchSet</code> objects
     *         or other predicates.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that contains one or more <code>ByteMatchTuple</code>
     *         objects.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete an <code>IPSet</code> that references one or more IP addresses.
     *         </p>
     *         </li>
     * @sample AWSWAFRegional.DeleteByteMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteByteMatchSet"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteByteMatchSetResult deleteByteMatchSet(DeleteByteMatchSetRequest deleteByteMatchSetRequest);

    /**
     * <p>
     * Permanently deletes a <a>GeoMatchSet</a>. You can't delete a <code>GeoMatchSet</code> if it's still used in any
     * <code>Rules</code> or if it still includes any countries.
     * </p>
     * <p>
     * If you just want to remove a <code>GeoMatchSet</code> from a <code>Rule</code>, use <a>UpdateRule</a>.
     * </p>
     * <p>
     * To permanently delete a <code>GeoMatchSet</code> from AWS WAF, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>GeoMatchSet</code> to remove any countries. For more information, see <a>UpdateGeoMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>DeleteGeoMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteGeoMatchSet</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteGeoMatchSetRequest
     * @return Result of the DeleteGeoMatchSet operation returned by the service.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFReferencedItemException
     *         The operation failed because you tried to delete an object that is still in use. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that is still referenced by a <code>Rule</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that is still referenced by a <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFNonEmptyEntityException
     *         The operation failed because you tried to delete an object that isn't empty. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>WebACL</code> that still contains one or more <code>Rule</code> objects.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that still contains one or more <code>ByteMatchSet</code> objects
     *         or other predicates.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that contains one or more <code>ByteMatchTuple</code>
     *         objects.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete an <code>IPSet</code> that references one or more IP addresses.
     *         </p>
     *         </li>
     * @sample AWSWAFRegional.DeleteGeoMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteGeoMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteGeoMatchSetResult deleteGeoMatchSet(DeleteGeoMatchSetRequest deleteGeoMatchSetRequest);

    /**
     * <p>
     * Permanently deletes an <a>IPSet</a>. You can't delete an <code>IPSet</code> if it's still used in any
     * <code>Rules</code> or if it still includes any IP addresses.
     * </p>
     * <p>
     * If you just want to remove an <code>IPSet</code> from a <code>Rule</code>, use <a>UpdateRule</a>.
     * </p>
     * <p>
     * To permanently delete an <code>IPSet</code> from AWS WAF, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>IPSet</code> to remove IP address ranges, if any. For more information, see <a>UpdateIPSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>DeleteIPSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteIPSet</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteIPSetRequest
     * @return Result of the DeleteIPSet operation returned by the service.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFReferencedItemException
     *         The operation failed because you tried to delete an object that is still in use. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that is still referenced by a <code>Rule</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that is still referenced by a <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFNonEmptyEntityException
     *         The operation failed because you tried to delete an object that isn't empty. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>WebACL</code> that still contains one or more <code>Rule</code> objects.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that still contains one or more <code>ByteMatchSet</code> objects
     *         or other predicates.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that contains one or more <code>ByteMatchTuple</code>
     *         objects.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete an <code>IPSet</code> that references one or more IP addresses.
     *         </p>
     *         </li>
     * @sample AWSWAFRegional.DeleteIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteIPSetResult deleteIPSet(DeleteIPSetRequest deleteIPSetRequest);

    /**
     * <p>
     * Permanently deletes the <a>LoggingConfiguration</a> from the specified web ACL.
     * </p>
     * 
     * @param deleteLoggingConfigurationRequest
     * @return Result of the DeleteLoggingConfiguration operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @sample AWSWAFRegional.DeleteLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteLoggingConfigurationResult deleteLoggingConfiguration(DeleteLoggingConfigurationRequest deleteLoggingConfigurationRequest);

    /**
     * <p>
     * Permanently deletes an IAM policy from the specified RuleGroup.
     * </p>
     * <p>
     * The user making the request must be the owner of the RuleGroup.
     * </p>
     * 
     * @param deletePermissionPolicyRequest
     * @return Result of the DeletePermissionPolicy operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @sample AWSWAFRegional.DeletePermissionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeletePermissionPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    DeletePermissionPolicyResult deletePermissionPolicy(DeletePermissionPolicyRequest deletePermissionPolicyRequest);

    /**
     * <p>
     * Permanently deletes a <a>RateBasedRule</a>. You can't delete a rule if it's still used in any <code>WebACL</code>
     * objects or if it still includes any predicates, such as <code>ByteMatchSet</code> objects.
     * </p>
     * <p>
     * If you just want to remove a rule from a <code>WebACL</code>, use <a>UpdateWebACL</a>.
     * </p>
     * <p>
     * To permanently delete a <code>RateBasedRule</code> from AWS WAF, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>RateBasedRule</code> to remove predicates, if any. For more information, see
     * <a>UpdateRateBasedRule</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>DeleteRateBasedRule</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteRateBasedRule</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteRateBasedRuleRequest
     * @return Result of the DeleteRateBasedRule operation returned by the service.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFReferencedItemException
     *         The operation failed because you tried to delete an object that is still in use. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that is still referenced by a <code>Rule</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that is still referenced by a <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFNonEmptyEntityException
     *         The operation failed because you tried to delete an object that isn't empty. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>WebACL</code> that still contains one or more <code>Rule</code> objects.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that still contains one or more <code>ByteMatchSet</code> objects
     *         or other predicates.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that contains one or more <code>ByteMatchTuple</code>
     *         objects.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete an <code>IPSet</code> that references one or more IP addresses.
     *         </p>
     *         </li>
     * @sample AWSWAFRegional.DeleteRateBasedRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteRateBasedRule"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteRateBasedRuleResult deleteRateBasedRule(DeleteRateBasedRuleRequest deleteRateBasedRuleRequest);

    /**
     * <p>
     * Permanently deletes a <a>RegexMatchSet</a>. You can't delete a <code>RegexMatchSet</code> if it's still used in
     * any <code>Rules</code> or if it still includes any <code>RegexMatchTuples</code> objects (any filters).
     * </p>
     * <p>
     * If you just want to remove a <code>RegexMatchSet</code> from a <code>Rule</code>, use <a>UpdateRule</a>.
     * </p>
     * <p>
     * To permanently delete a <code>RegexMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>RegexMatchSet</code> to remove filters, if any. For more information, see
     * <a>UpdateRegexMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>DeleteRegexMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteRegexMatchSet</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteRegexMatchSetRequest
     * @return Result of the DeleteRegexMatchSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFReferencedItemException
     *         The operation failed because you tried to delete an object that is still in use. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that is still referenced by a <code>Rule</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that is still referenced by a <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFNonEmptyEntityException
     *         The operation failed because you tried to delete an object that isn't empty. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>WebACL</code> that still contains one or more <code>Rule</code> objects.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that still contains one or more <code>ByteMatchSet</code> objects
     *         or other predicates.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that contains one or more <code>ByteMatchTuple</code>
     *         objects.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete an <code>IPSet</code> that references one or more IP addresses.
     *         </p>
     *         </li>
     * @sample AWSWAFRegional.DeleteRegexMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteRegexMatchSet"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteRegexMatchSetResult deleteRegexMatchSet(DeleteRegexMatchSetRequest deleteRegexMatchSetRequest);

    /**
     * <p>
     * Permanently deletes a <a>RegexPatternSet</a>. You can't delete a <code>RegexPatternSet</code> if it's still used
     * in any <code>RegexMatchSet</code> or if the <code>RegexPatternSet</code> is not empty.
     * </p>
     * 
     * @param deleteRegexPatternSetRequest
     * @return Result of the DeleteRegexPatternSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFReferencedItemException
     *         The operation failed because you tried to delete an object that is still in use. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that is still referenced by a <code>Rule</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that is still referenced by a <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFNonEmptyEntityException
     *         The operation failed because you tried to delete an object that isn't empty. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>WebACL</code> that still contains one or more <code>Rule</code> objects.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that still contains one or more <code>ByteMatchSet</code> objects
     *         or other predicates.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that contains one or more <code>ByteMatchTuple</code>
     *         objects.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete an <code>IPSet</code> that references one or more IP addresses.
     *         </p>
     *         </li>
     * @sample AWSWAFRegional.DeleteRegexPatternSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteRegexPatternSet"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteRegexPatternSetResult deleteRegexPatternSet(DeleteRegexPatternSetRequest deleteRegexPatternSetRequest);

    /**
     * <p>
     * Permanently deletes a <a>Rule</a>. You can't delete a <code>Rule</code> if it's still used in any
     * <code>WebACL</code> objects or if it still includes any predicates, such as <code>ByteMatchSet</code> objects.
     * </p>
     * <p>
     * If you just want to remove a <code>Rule</code> from a <code>WebACL</code>, use <a>UpdateWebACL</a>.
     * </p>
     * <p>
     * To permanently delete a <code>Rule</code> from AWS WAF, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>Rule</code> to remove predicates, if any. For more information, see <a>UpdateRule</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>DeleteRule</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteRule</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteRuleRequest
     * @return Result of the DeleteRule operation returned by the service.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFReferencedItemException
     *         The operation failed because you tried to delete an object that is still in use. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that is still referenced by a <code>Rule</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that is still referenced by a <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFNonEmptyEntityException
     *         The operation failed because you tried to delete an object that isn't empty. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>WebACL</code> that still contains one or more <code>Rule</code> objects.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that still contains one or more <code>ByteMatchSet</code> objects
     *         or other predicates.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that contains one or more <code>ByteMatchTuple</code>
     *         objects.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete an <code>IPSet</code> that references one or more IP addresses.
     *         </p>
     *         </li>
     * @sample AWSWAFRegional.DeleteRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteRule" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteRuleResult deleteRule(DeleteRuleRequest deleteRuleRequest);

    /**
     * <p>
     * Permanently deletes a <a>RuleGroup</a>. You can't delete a <code>RuleGroup</code> if it's still used in any
     * <code>WebACL</code> objects or if it still includes any rules.
     * </p>
     * <p>
     * If you just want to remove a <code>RuleGroup</code> from a <code>WebACL</code>, use <a>UpdateWebACL</a>.
     * </p>
     * <p>
     * To permanently delete a <code>RuleGroup</code> from AWS WAF, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>RuleGroup</code> to remove rules, if any. For more information, see <a>UpdateRuleGroup</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>DeleteRuleGroup</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteRuleGroup</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteRuleGroupRequest
     * @return Result of the DeleteRuleGroup operation returned by the service.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFReferencedItemException
     *         The operation failed because you tried to delete an object that is still in use. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that is still referenced by a <code>Rule</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that is still referenced by a <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFNonEmptyEntityException
     *         The operation failed because you tried to delete an object that isn't empty. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>WebACL</code> that still contains one or more <code>Rule</code> objects.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that still contains one or more <code>ByteMatchSet</code> objects
     *         or other predicates.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that contains one or more <code>ByteMatchTuple</code>
     *         objects.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete an <code>IPSet</code> that references one or more IP addresses.
     *         </p>
     *         </li>
     * @throws WAFInvalidOperationException
     *         The operation failed because there was nothing to do. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to remove a <code>Rule</code> from a <code>WebACL</code>, but the <code>Rule</code> isn't in
     *         the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to remove an IP address from an <code>IPSet</code>, but the IP address isn't in the specified
     *         <code>IPSet</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to remove a <code>ByteMatchTuple</code> from a <code>ByteMatchSet</code>, but the
     *         <code>ByteMatchTuple</code> isn't in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>Rule</code> to a <code>WebACL</code>, but the <code>Rule</code> already exists
     *         in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchTuple</code> to a <code>ByteMatchSet</code>, but the
     *         <code>ByteMatchTuple</code> already exists in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     * @sample AWSWAFRegional.DeleteRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteRuleGroup" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteRuleGroupResult deleteRuleGroup(DeleteRuleGroupRequest deleteRuleGroupRequest);

    /**
     * <p>
     * Permanently deletes a <a>SizeConstraintSet</a>. You can't delete a <code>SizeConstraintSet</code> if it's still
     * used in any <code>Rules</code> or if it still includes any <a>SizeConstraint</a> objects (any filters).
     * </p>
     * <p>
     * If you just want to remove a <code>SizeConstraintSet</code> from a <code>Rule</code>, use <a>UpdateRule</a>.
     * </p>
     * <p>
     * To permanently delete a <code>SizeConstraintSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>SizeConstraintSet</code> to remove filters, if any. For more information, see
     * <a>UpdateSizeConstraintSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>DeleteSizeConstraintSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteSizeConstraintSet</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteSizeConstraintSetRequest
     * @return Result of the DeleteSizeConstraintSet operation returned by the service.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFReferencedItemException
     *         The operation failed because you tried to delete an object that is still in use. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that is still referenced by a <code>Rule</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that is still referenced by a <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFNonEmptyEntityException
     *         The operation failed because you tried to delete an object that isn't empty. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>WebACL</code> that still contains one or more <code>Rule</code> objects.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that still contains one or more <code>ByteMatchSet</code> objects
     *         or other predicates.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that contains one or more <code>ByteMatchTuple</code>
     *         objects.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete an <code>IPSet</code> that references one or more IP addresses.
     *         </p>
     *         </li>
     * @sample AWSWAFRegional.DeleteSizeConstraintSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteSizeConstraintSet"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteSizeConstraintSetResult deleteSizeConstraintSet(DeleteSizeConstraintSetRequest deleteSizeConstraintSetRequest);

    /**
     * <p>
     * Permanently deletes a <a>SqlInjectionMatchSet</a>. You can't delete a <code>SqlInjectionMatchSet</code> if it's
     * still used in any <code>Rules</code> or if it still contains any <a>SqlInjectionMatchTuple</a> objects.
     * </p>
     * <p>
     * If you just want to remove a <code>SqlInjectionMatchSet</code> from a <code>Rule</code>, use <a>UpdateRule</a>.
     * </p>
     * <p>
     * To permanently delete a <code>SqlInjectionMatchSet</code> from AWS WAF, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>SqlInjectionMatchSet</code> to remove filters, if any. For more information, see
     * <a>UpdateSqlInjectionMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>DeleteSqlInjectionMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteSqlInjectionMatchSet</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteSqlInjectionMatchSetRequest
     *        A request to delete a <a>SqlInjectionMatchSet</a> from AWS WAF.
     * @return Result of the DeleteSqlInjectionMatchSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFReferencedItemException
     *         The operation failed because you tried to delete an object that is still in use. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that is still referenced by a <code>Rule</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that is still referenced by a <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFNonEmptyEntityException
     *         The operation failed because you tried to delete an object that isn't empty. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>WebACL</code> that still contains one or more <code>Rule</code> objects.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that still contains one or more <code>ByteMatchSet</code> objects
     *         or other predicates.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that contains one or more <code>ByteMatchTuple</code>
     *         objects.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete an <code>IPSet</code> that references one or more IP addresses.
     *         </p>
     *         </li>
     * @sample AWSWAFRegional.DeleteSqlInjectionMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteSqlInjectionMatchSet"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteSqlInjectionMatchSetResult deleteSqlInjectionMatchSet(DeleteSqlInjectionMatchSetRequest deleteSqlInjectionMatchSetRequest);

    /**
     * <p>
     * Permanently deletes a <a>WebACL</a>. You can't delete a <code>WebACL</code> if it still contains any
     * <code>Rules</code>.
     * </p>
     * <p>
     * To delete a <code>WebACL</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>WebACL</code> to remove <code>Rules</code>, if any. For more information, see
     * <a>UpdateWebACL</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>DeleteWebACL</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteWebACL</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteWebACLRequest
     * @return Result of the DeleteWebACL operation returned by the service.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFReferencedItemException
     *         The operation failed because you tried to delete an object that is still in use. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that is still referenced by a <code>Rule</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that is still referenced by a <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFNonEmptyEntityException
     *         The operation failed because you tried to delete an object that isn't empty. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>WebACL</code> that still contains one or more <code>Rule</code> objects.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that still contains one or more <code>ByteMatchSet</code> objects
     *         or other predicates.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that contains one or more <code>ByteMatchTuple</code>
     *         objects.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete an <code>IPSet</code> that references one or more IP addresses.
     *         </p>
     *         </li>
     * @sample AWSWAFRegional.DeleteWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteWebACLResult deleteWebACL(DeleteWebACLRequest deleteWebACLRequest);

    /**
     * <p>
     * Permanently deletes an <a>XssMatchSet</a>. You can't delete an <code>XssMatchSet</code> if it's still used in any
     * <code>Rules</code> or if it still contains any <a>XssMatchTuple</a> objects.
     * </p>
     * <p>
     * If you just want to remove an <code>XssMatchSet</code> from a <code>Rule</code>, use <a>UpdateRule</a>.
     * </p>
     * <p>
     * To permanently delete an <code>XssMatchSet</code> from AWS WAF, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Update the <code>XssMatchSet</code> to remove filters, if any. For more information, see
     * <a>UpdateXssMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of a
     * <code>DeleteXssMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DeleteXssMatchSet</code> request.
     * </p>
     * </li>
     * </ol>
     * 
     * @param deleteXssMatchSetRequest
     *        A request to delete an <a>XssMatchSet</a> from AWS WAF.
     * @return Result of the DeleteXssMatchSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFReferencedItemException
     *         The operation failed because you tried to delete an object that is still in use. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that is still referenced by a <code>Rule</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that is still referenced by a <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFNonEmptyEntityException
     *         The operation failed because you tried to delete an object that isn't empty. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>WebACL</code> that still contains one or more <code>Rule</code> objects.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that still contains one or more <code>ByteMatchSet</code> objects
     *         or other predicates.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that contains one or more <code>ByteMatchTuple</code>
     *         objects.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete an <code>IPSet</code> that references one or more IP addresses.
     *         </p>
     *         </li>
     * @sample AWSWAFRegional.DeleteXssMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DeleteXssMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteXssMatchSetResult deleteXssMatchSet(DeleteXssMatchSetRequest deleteXssMatchSetRequest);

    /**
     * <p>
     * Removes a web ACL from the specified resource, either an application load balancer or Amazon API Gateway stage.
     * </p>
     * 
     * @param disassociateWebACLRequest
     * @return Result of the DisassociateWebACL operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>RateBasedRule</code> with a <code>RateKey</code> value other than
     *         <code>IP</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, METHOD, QUERY_STRING, URI, or BODY.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @sample AWSWAFRegional.DisassociateWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/DisassociateWebACL"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateWebACLResult disassociateWebACL(DisassociateWebACLRequest disassociateWebACLRequest);

    /**
     * <p>
     * Returns the <a>ByteMatchSet</a> specified by <code>ByteMatchSetId</code>.
     * </p>
     * 
     * @param getByteMatchSetRequest
     * @return Result of the GetByteMatchSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @sample AWSWAFRegional.GetByteMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetByteMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    GetByteMatchSetResult getByteMatchSet(GetByteMatchSetRequest getByteMatchSetRequest);

    /**
     * <p>
     * When you want to create, update, or delete AWS WAF objects, get a change token and include the change token in
     * the create, update, or delete request. Change tokens ensure that your application doesn't submit conflicting
     * requests to AWS WAF.
     * </p>
     * <p>
     * Each create, update, or delete request must use a unique change token. If your application submits a
     * <code>GetChangeToken</code> request and then submits a second <code>GetChangeToken</code> request before
     * submitting a create, update, or delete request, the second <code>GetChangeToken</code> request returns the same
     * value as the first <code>GetChangeToken</code> request.
     * </p>
     * <p>
     * When you use a change token in a create, update, or delete request, the status of the change token changes to
     * <code>PENDING</code>, which indicates that AWS WAF is propagating the change to all AWS WAF servers. Use
     * <code>GetChangeTokenStatus</code> to determine the status of your change token.
     * </p>
     * 
     * @param getChangeTokenRequest
     * @return Result of the GetChangeToken operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSWAFRegional.GetChangeToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetChangeToken" target="_top">AWS
     *      API Documentation</a>
     */
    GetChangeTokenResult getChangeToken(GetChangeTokenRequest getChangeTokenRequest);

    /**
     * <p>
     * Returns the status of a <code>ChangeToken</code> that you got by calling <a>GetChangeToken</a>.
     * <code>ChangeTokenStatus</code> is one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONED</code>: You requested the change token by calling <code>GetChangeToken</code>, but you haven't
     * used it yet in a call to create, update, or delete an AWS WAF object.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code>: AWS WAF is propagating the create, update, or delete request to all AWS WAF servers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INSYNC</code>: Propagation is complete.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getChangeTokenStatusRequest
     * @return Result of the GetChangeTokenStatus operation returned by the service.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSWAFRegional.GetChangeTokenStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetChangeTokenStatus"
     *      target="_top">AWS API Documentation</a>
     */
    GetChangeTokenStatusResult getChangeTokenStatus(GetChangeTokenStatusRequest getChangeTokenStatusRequest);

    /**
     * <p>
     * Returns the <a>GeoMatchSet</a> that is specified by <code>GeoMatchSetId</code>.
     * </p>
     * 
     * @param getGeoMatchSetRequest
     * @return Result of the GetGeoMatchSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @sample AWSWAFRegional.GetGeoMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetGeoMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    GetGeoMatchSetResult getGeoMatchSet(GetGeoMatchSetRequest getGeoMatchSetRequest);

    /**
     * <p>
     * Returns the <a>IPSet</a> that is specified by <code>IPSetId</code>.
     * </p>
     * 
     * @param getIPSetRequest
     * @return Result of the GetIPSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @sample AWSWAFRegional.GetIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    GetIPSetResult getIPSet(GetIPSetRequest getIPSetRequest);

    /**
     * <p>
     * Returns the <a>LoggingConfiguration</a> for the specified web ACL.
     * </p>
     * 
     * @param getLoggingConfigurationRequest
     * @return Result of the GetLoggingConfiguration operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @sample AWSWAFRegional.GetLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetLoggingConfigurationResult getLoggingConfiguration(GetLoggingConfigurationRequest getLoggingConfigurationRequest);

    /**
     * <p>
     * Returns the IAM policy attached to the RuleGroup.
     * </p>
     * 
     * @param getPermissionPolicyRequest
     * @return Result of the GetPermissionPolicy operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @sample AWSWAFRegional.GetPermissionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetPermissionPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    GetPermissionPolicyResult getPermissionPolicy(GetPermissionPolicyRequest getPermissionPolicyRequest);

    /**
     * <p>
     * Returns the <a>RateBasedRule</a> that is specified by the <code>RuleId</code> that you included in the
     * <code>GetRateBasedRule</code> request.
     * </p>
     * 
     * @param getRateBasedRuleRequest
     * @return Result of the GetRateBasedRule operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @sample AWSWAFRegional.GetRateBasedRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetRateBasedRule" target="_top">AWS
     *      API Documentation</a>
     */
    GetRateBasedRuleResult getRateBasedRule(GetRateBasedRuleRequest getRateBasedRuleRequest);

    /**
     * <p>
     * Returns an array of IP addresses currently being blocked by the <a>RateBasedRule</a> that is specified by the
     * <code>RuleId</code>. The maximum number of managed keys that will be blocked is 10,000. If more than 10,000
     * addresses exceed the rate limit, the 10,000 addresses with the highest rates will be blocked.
     * </p>
     * 
     * @param getRateBasedRuleManagedKeysRequest
     * @return Result of the GetRateBasedRuleManagedKeys operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>RateBasedRule</code> with a <code>RateKey</code> value other than
     *         <code>IP</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, METHOD, QUERY_STRING, URI, or BODY.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @sample AWSWAFRegional.GetRateBasedRuleManagedKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetRateBasedRuleManagedKeys"
     *      target="_top">AWS API Documentation</a>
     */
    GetRateBasedRuleManagedKeysResult getRateBasedRuleManagedKeys(GetRateBasedRuleManagedKeysRequest getRateBasedRuleManagedKeysRequest);

    /**
     * <p>
     * Returns the <a>RegexMatchSet</a> specified by <code>RegexMatchSetId</code>.
     * </p>
     * 
     * @param getRegexMatchSetRequest
     * @return Result of the GetRegexMatchSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @sample AWSWAFRegional.GetRegexMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetRegexMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    GetRegexMatchSetResult getRegexMatchSet(GetRegexMatchSetRequest getRegexMatchSetRequest);

    /**
     * <p>
     * Returns the <a>RegexPatternSet</a> specified by <code>RegexPatternSetId</code>.
     * </p>
     * 
     * @param getRegexPatternSetRequest
     * @return Result of the GetRegexPatternSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @sample AWSWAFRegional.GetRegexPatternSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetRegexPatternSet"
     *      target="_top">AWS API Documentation</a>
     */
    GetRegexPatternSetResult getRegexPatternSet(GetRegexPatternSetRequest getRegexPatternSetRequest);

    /**
     * <p>
     * Returns the <a>Rule</a> that is specified by the <code>RuleId</code> that you included in the
     * <code>GetRule</code> request.
     * </p>
     * 
     * @param getRuleRequest
     * @return Result of the GetRule operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @sample AWSWAFRegional.GetRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetRule" target="_top">AWS API
     *      Documentation</a>
     */
    GetRuleResult getRule(GetRuleRequest getRuleRequest);

    /**
     * <p>
     * Returns the <a>RuleGroup</a> that is specified by the <code>RuleGroupId</code> that you included in the
     * <code>GetRuleGroup</code> request.
     * </p>
     * <p>
     * To view the rules in a rule group, use <a>ListActivatedRulesInRuleGroup</a>.
     * </p>
     * 
     * @param getRuleGroupRequest
     * @return Result of the GetRuleGroup operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @sample AWSWAFRegional.GetRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetRuleGroup" target="_top">AWS API
     *      Documentation</a>
     */
    GetRuleGroupResult getRuleGroup(GetRuleGroupRequest getRuleGroupRequest);

    /**
     * <p>
     * Gets detailed information about a specified number of requests--a sample--that AWS WAF randomly selects from
     * among the first 5,000 requests that your AWS resource received during a time range that you choose. You can
     * specify a sample size of up to 500 requests, and you can specify any time range in the previous three hours.
     * </p>
     * <p>
     * <code>GetSampledRequests</code> returns a time range, which is usually the time range that you specified.
     * However, if your resource (such as a CloudFront distribution) received 5,000 requests before the specified time
     * range elapsed, <code>GetSampledRequests</code> returns an updated time range. This new time range indicates the
     * actual period during which AWS WAF selected the requests in the sample.
     * </p>
     * 
     * @param getSampledRequestsRequest
     * @return Result of the GetSampledRequests operation returned by the service.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSWAFRegional.GetSampledRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetSampledRequests"
     *      target="_top">AWS API Documentation</a>
     */
    GetSampledRequestsResult getSampledRequests(GetSampledRequestsRequest getSampledRequestsRequest);

    /**
     * <p>
     * Returns the <a>SizeConstraintSet</a> specified by <code>SizeConstraintSetId</code>.
     * </p>
     * 
     * @param getSizeConstraintSetRequest
     * @return Result of the GetSizeConstraintSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @sample AWSWAFRegional.GetSizeConstraintSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetSizeConstraintSet"
     *      target="_top">AWS API Documentation</a>
     */
    GetSizeConstraintSetResult getSizeConstraintSet(GetSizeConstraintSetRequest getSizeConstraintSetRequest);

    /**
     * <p>
     * Returns the <a>SqlInjectionMatchSet</a> that is specified by <code>SqlInjectionMatchSetId</code>.
     * </p>
     * 
     * @param getSqlInjectionMatchSetRequest
     *        A request to get a <a>SqlInjectionMatchSet</a>.
     * @return Result of the GetSqlInjectionMatchSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @sample AWSWAFRegional.GetSqlInjectionMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetSqlInjectionMatchSet"
     *      target="_top">AWS API Documentation</a>
     */
    GetSqlInjectionMatchSetResult getSqlInjectionMatchSet(GetSqlInjectionMatchSetRequest getSqlInjectionMatchSetRequest);

    /**
     * <p>
     * Returns the <a>WebACL</a> that is specified by <code>WebACLId</code>.
     * </p>
     * 
     * @param getWebACLRequest
     * @return Result of the GetWebACL operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @sample AWSWAFRegional.GetWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    GetWebACLResult getWebACL(GetWebACLRequest getWebACLRequest);

    /**
     * <p>
     * Returns the web ACL for the specified resource, either an application load balancer or Amazon API Gateway stage.
     * </p>
     * 
     * @param getWebACLForResourceRequest
     * @return Result of the GetWebACLForResource operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>RateBasedRule</code> with a <code>RateKey</code> value other than
     *         <code>IP</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, METHOD, QUERY_STRING, URI, or BODY.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFUnavailableEntityException
     *         The operation failed because the entity referenced is temporarily unavailable. Retry your request.
     * @sample AWSWAFRegional.GetWebACLForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetWebACLForResource"
     *      target="_top">AWS API Documentation</a>
     */
    GetWebACLForResourceResult getWebACLForResource(GetWebACLForResourceRequest getWebACLForResourceRequest);

    /**
     * <p>
     * Returns the <a>XssMatchSet</a> that is specified by <code>XssMatchSetId</code>.
     * </p>
     * 
     * @param getXssMatchSetRequest
     *        A request to get an <a>XssMatchSet</a>.
     * @return Result of the GetXssMatchSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @sample AWSWAFRegional.GetXssMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetXssMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    GetXssMatchSetResult getXssMatchSet(GetXssMatchSetRequest getXssMatchSetRequest);

    /**
     * <p>
     * Returns an array of <a>ActivatedRule</a> objects.
     * </p>
     * 
     * @param listActivatedRulesInRuleGroupRequest
     * @return Result of the ListActivatedRulesInRuleGroup operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>RateBasedRule</code> with a <code>RateKey</code> value other than
     *         <code>IP</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, METHOD, QUERY_STRING, URI, or BODY.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @sample AWSWAFRegional.ListActivatedRulesInRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListActivatedRulesInRuleGroup"
     *      target="_top">AWS API Documentation</a>
     */
    ListActivatedRulesInRuleGroupResult listActivatedRulesInRuleGroup(ListActivatedRulesInRuleGroupRequest listActivatedRulesInRuleGroupRequest);

    /**
     * <p>
     * Returns an array of <a>ByteMatchSetSummary</a> objects.
     * </p>
     * 
     * @param listByteMatchSetsRequest
     * @return Result of the ListByteMatchSets operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @sample AWSWAFRegional.ListByteMatchSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListByteMatchSets" target="_top">AWS
     *      API Documentation</a>
     */
    ListByteMatchSetsResult listByteMatchSets(ListByteMatchSetsRequest listByteMatchSetsRequest);

    /**
     * <p>
     * Returns an array of <a>GeoMatchSetSummary</a> objects in the response.
     * </p>
     * 
     * @param listGeoMatchSetsRequest
     * @return Result of the ListGeoMatchSets operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @sample AWSWAFRegional.ListGeoMatchSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListGeoMatchSets" target="_top">AWS
     *      API Documentation</a>
     */
    ListGeoMatchSetsResult listGeoMatchSets(ListGeoMatchSetsRequest listGeoMatchSetsRequest);

    /**
     * <p>
     * Returns an array of <a>IPSetSummary</a> objects in the response.
     * </p>
     * 
     * @param listIPSetsRequest
     * @return Result of the ListIPSets operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @sample AWSWAFRegional.ListIPSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListIPSets" target="_top">AWS API
     *      Documentation</a>
     */
    ListIPSetsResult listIPSets(ListIPSetsRequest listIPSetsRequest);

    /**
     * <p>
     * Returns an array of <a>LoggingConfiguration</a> objects.
     * </p>
     * 
     * @param listLoggingConfigurationsRequest
     * @return Result of the ListLoggingConfigurations operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>RateBasedRule</code> with a <code>RateKey</code> value other than
     *         <code>IP</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, METHOD, QUERY_STRING, URI, or BODY.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @sample AWSWAFRegional.ListLoggingConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListLoggingConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    ListLoggingConfigurationsResult listLoggingConfigurations(ListLoggingConfigurationsRequest listLoggingConfigurationsRequest);

    /**
     * <p>
     * Returns an array of <a>RuleSummary</a> objects.
     * </p>
     * 
     * @param listRateBasedRulesRequest
     * @return Result of the ListRateBasedRules operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @sample AWSWAFRegional.ListRateBasedRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListRateBasedRules"
     *      target="_top">AWS API Documentation</a>
     */
    ListRateBasedRulesResult listRateBasedRules(ListRateBasedRulesRequest listRateBasedRulesRequest);

    /**
     * <p>
     * Returns an array of <a>RegexMatchSetSummary</a> objects.
     * </p>
     * 
     * @param listRegexMatchSetsRequest
     * @return Result of the ListRegexMatchSets operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @sample AWSWAFRegional.ListRegexMatchSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListRegexMatchSets"
     *      target="_top">AWS API Documentation</a>
     */
    ListRegexMatchSetsResult listRegexMatchSets(ListRegexMatchSetsRequest listRegexMatchSetsRequest);

    /**
     * <p>
     * Returns an array of <a>RegexPatternSetSummary</a> objects.
     * </p>
     * 
     * @param listRegexPatternSetsRequest
     * @return Result of the ListRegexPatternSets operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @sample AWSWAFRegional.ListRegexPatternSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListRegexPatternSets"
     *      target="_top">AWS API Documentation</a>
     */
    ListRegexPatternSetsResult listRegexPatternSets(ListRegexPatternSetsRequest listRegexPatternSetsRequest);

    /**
     * <p>
     * Returns an array of resources associated with the specified web ACL.
     * </p>
     * 
     * @param listResourcesForWebACLRequest
     * @return Result of the ListResourcesForWebACL operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>RateBasedRule</code> with a <code>RateKey</code> value other than
     *         <code>IP</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, METHOD, QUERY_STRING, URI, or BODY.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @sample AWSWAFRegional.ListResourcesForWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListResourcesForWebACL"
     *      target="_top">AWS API Documentation</a>
     */
    ListResourcesForWebACLResult listResourcesForWebACL(ListResourcesForWebACLRequest listResourcesForWebACLRequest);

    /**
     * <p>
     * Returns an array of <a>RuleGroup</a> objects.
     * </p>
     * 
     * @param listRuleGroupsRequest
     * @return Result of the ListRuleGroups operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSWAFRegional.ListRuleGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListRuleGroups" target="_top">AWS
     *      API Documentation</a>
     */
    ListRuleGroupsResult listRuleGroups(ListRuleGroupsRequest listRuleGroupsRequest);

    /**
     * <p>
     * Returns an array of <a>RuleSummary</a> objects.
     * </p>
     * 
     * @param listRulesRequest
     * @return Result of the ListRules operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @sample AWSWAFRegional.ListRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListRules" target="_top">AWS API
     *      Documentation</a>
     */
    ListRulesResult listRules(ListRulesRequest listRulesRequest);

    /**
     * <p>
     * Returns an array of <a>SizeConstraintSetSummary</a> objects.
     * </p>
     * 
     * @param listSizeConstraintSetsRequest
     * @return Result of the ListSizeConstraintSets operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @sample AWSWAFRegional.ListSizeConstraintSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListSizeConstraintSets"
     *      target="_top">AWS API Documentation</a>
     */
    ListSizeConstraintSetsResult listSizeConstraintSets(ListSizeConstraintSetsRequest listSizeConstraintSetsRequest);

    /**
     * <p>
     * Returns an array of <a>SqlInjectionMatchSet</a> objects.
     * </p>
     * 
     * @param listSqlInjectionMatchSetsRequest
     *        A request to list the <a>SqlInjectionMatchSet</a> objects created by the current AWS account.
     * @return Result of the ListSqlInjectionMatchSets operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @sample AWSWAFRegional.ListSqlInjectionMatchSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListSqlInjectionMatchSets"
     *      target="_top">AWS API Documentation</a>
     */
    ListSqlInjectionMatchSetsResult listSqlInjectionMatchSets(ListSqlInjectionMatchSetsRequest listSqlInjectionMatchSetsRequest);

    /**
     * <p>
     * Returns an array of <a>RuleGroup</a> objects that you are subscribed to.
     * </p>
     * 
     * @param listSubscribedRuleGroupsRequest
     * @return Result of the ListSubscribedRuleGroups operation returned by the service.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSWAFRegional.ListSubscribedRuleGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListSubscribedRuleGroups"
     *      target="_top">AWS API Documentation</a>
     */
    ListSubscribedRuleGroupsResult listSubscribedRuleGroups(ListSubscribedRuleGroupsRequest listSubscribedRuleGroupsRequest);

    /**
     * <p>
     * Returns an array of <a>WebACLSummary</a> objects in the response.
     * </p>
     * 
     * @param listWebACLsRequest
     * @return Result of the ListWebACLs operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @sample AWSWAFRegional.ListWebACLs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListWebACLs" target="_top">AWS API
     *      Documentation</a>
     */
    ListWebACLsResult listWebACLs(ListWebACLsRequest listWebACLsRequest);

    /**
     * <p>
     * Returns an array of <a>XssMatchSet</a> objects.
     * </p>
     * 
     * @param listXssMatchSetsRequest
     *        A request to list the <a>XssMatchSet</a> objects created by the current AWS account.
     * @return Result of the ListXssMatchSets operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @sample AWSWAFRegional.ListXssMatchSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListXssMatchSets" target="_top">AWS
     *      API Documentation</a>
     */
    ListXssMatchSetsResult listXssMatchSets(ListXssMatchSetsRequest listXssMatchSetsRequest);

    /**
     * <p>
     * Associates a <a>LoggingConfiguration</a> with a specified web ACL.
     * </p>
     * <p>
     * You can access information about all traffic that AWS WAF inspects using the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create an Amazon Kinesis Data Firehose .
     * </p>
     * <p>
     * Create the data firehose with a PUT source and in the region that you are operating. However, if you are
     * capturing logs for Amazon CloudFront, always create the firehose in US East (N. Virginia).
     * </p>
     * </li>
     * <li>
     * <p>
     * Associate that firehose to your web ACL using a <code>PutLoggingConfiguration</code> request.
     * </p>
     * </li>
     * </ol>
     * <p>
     * When you successfully enable logging using a <code>PutLoggingConfiguration</code> request, AWS WAF will create a
     * service linked role with the necessary permissions to write logs to the Amazon Kinesis Data Firehose. For more
     * information, see <a href="https://docs.aws.amazon.com/waf/latest/developerguide/logging.html">Logging Web ACL
     * Traffic Information</a> in the <i>AWS WAF Developer Guide</i>.
     * </p>
     * 
     * @param putLoggingConfigurationRequest
     * @return Result of the PutLoggingConfiguration operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFServiceLinkedRoleErrorException
     *         AWS WAF is not able to access the service linked role. This can be caused by a previous
     *         <code>PutLoggingConfiguration</code> request, which can lock the service linked role for about 20
     *         seconds. Please try your request again. The service linked role can also be locked by a previous
     *         <code>DeleteServiceLinkedRole</code> request, which can lock the role for 15 minutes or more. If you
     *         recently made a <code>DeleteServiceLinkedRole</code>, wait at least 15 minutes and try the request again.
     *         If you receive this same exception again, you will have to wait additional time until the role is
     *         unlocked.
     * @sample AWSWAFRegional.PutLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/PutLoggingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    PutLoggingConfigurationResult putLoggingConfiguration(PutLoggingConfigurationRequest putLoggingConfigurationRequest);

    /**
     * <p>
     * Attaches a IAM policy to the specified resource. The only supported use for this action is to share a RuleGroup
     * across accounts.
     * </p>
     * <p>
     * The <code>PutPermissionPolicy</code> is subject to the following restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You can attach only one policy with each <code>PutPermissionPolicy</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * The policy must include an <code>Effect</code>, <code>Action</code> and <code>Principal</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Effect</code> must specify <code>Allow</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Action</code> in the policy must be <code>waf:UpdateWebACL</code>,
     * <code>waf-regional:UpdateWebACL</code>, <code>waf:GetRuleGroup</code> and <code>waf-regional:GetRuleGroup</code>
     * . Any extra or wildcard actions in the policy will be rejected.
     * </p>
     * </li>
     * <li>
     * <p>
     * The policy cannot include a <code>Resource</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * The ARN in the request must be a valid WAF RuleGroup ARN and the RuleGroup must exist in the same region.
     * </p>
     * </li>
     * <li>
     * <p>
     * The user making the request must be the owner of the RuleGroup.
     * </p>
     * </li>
     * <li>
     * <p>
     * Your policy must be composed using IAM Policy version 2012-10-17.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html">IAM
     * Policies</a>.
     * </p>
     * <p>
     * An example of a valid policy parameter is shown in the Examples section below.
     * </p>
     * 
     * @param putPermissionPolicyRequest
     * @return Result of the PutPermissionPolicy operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFInvalidPermissionPolicyException
     *         The operation failed because the specified policy is not in the proper format. </p>
     *         <p>
     *         The policy is subject to the following restrictions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         You can attach only one policy with each <code>PutPermissionPolicy</code> request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The policy must include an <code>Effect</code>, <code>Action</code> and <code>Principal</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Effect</code> must specify <code>Allow</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>Action</code> in the policy must be <code>waf:UpdateWebACL</code>,
     *         <code>waf-regional:UpdateWebACL</code>, <code>waf:GetRuleGroup</code> and
     *         <code>waf-regional:GetRuleGroup</code> . Any extra or wildcard actions in the policy will be rejected.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The policy cannot include a <code>Resource</code> parameter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The ARN in the request must be a valid WAF RuleGroup ARN and the RuleGroup must exist in the same region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The user making the request must be the owner of the RuleGroup.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your policy must be composed using IAM Policy version 2012-10-17.
     *         </p>
     *         </li>
     * @sample AWSWAFRegional.PutPermissionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/PutPermissionPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    PutPermissionPolicyResult putPermissionPolicy(PutPermissionPolicyRequest putPermissionPolicyRequest);

    /**
     * <p>
     * Inserts or deletes <a>ByteMatchTuple</a> objects (filters) in a <a>ByteMatchSet</a>. For each
     * <code>ByteMatchTuple</code> object, you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether to insert or delete the object from the array. If you want to change a <code>ByteMatchSetUpdate</code>
     * object, you delete the existing object and add a new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * The part of a web request that you want AWS WAF to inspect, such as a query string or the value of the
     * <code>User-Agent</code> header.
     * </p>
     * </li>
     * <li>
     * <p>
     * The bytes (typically a string that corresponds with ASCII characters) that you want AWS WAF to look for. For more
     * information, including how you specify the values for the AWS WAF API and the AWS CLI or SDKs, see
     * <code>TargetString</code> in the <a>ByteMatchTuple</a> data type.
     * </p>
     * </li>
     * <li>
     * <p>
     * Where to look, such as at the beginning or the end of a query string.
     * </p>
     * </li>
     * <li>
     * <p>
     * Whether to perform any conversions on the request, such as converting it to lowercase, before inspecting it for
     * the specified string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, you can add a <code>ByteMatchSetUpdate</code> object that matches web requests in which
     * <code>User-Agent</code> headers contain the string <code>BadBot</code>. You can then configure AWS WAF to block
     * those requests.
     * </p>
     * <p>
     * To create and configure a <code>ByteMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create a <code>ByteMatchSet.</code> For more information, see <a>CreateByteMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of
     * an <code>UpdateByteMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateByteMatchSet</code> request to specify the part of the request that you want AWS WAF to
     * inspect (for example, the header or the URI) and the value that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param updateByteMatchSetRequest
     * @return Result of the UpdateByteMatchSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFInvalidOperationException
     *         The operation failed because there was nothing to do. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to remove a <code>Rule</code> from a <code>WebACL</code>, but the <code>Rule</code> isn't in
     *         the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to remove an IP address from an <code>IPSet</code>, but the IP address isn't in the specified
     *         <code>IPSet</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to remove a <code>ByteMatchTuple</code> from a <code>ByteMatchSet</code>, but the
     *         <code>ByteMatchTuple</code> isn't in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>Rule</code> to a <code>WebACL</code>, but the <code>Rule</code> already exists
     *         in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchTuple</code> to a <code>ByteMatchSet</code>, but the
     *         <code>ByteMatchTuple</code> already exists in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>RateBasedRule</code> with a <code>RateKey</code> value other than
     *         <code>IP</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, METHOD, QUERY_STRING, URI, or BODY.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentContainerException
     *         The operation failed because you tried to add an object to or delete an object from another object that
     *         doesn't exist. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to add a <code>Rule</code> to or delete a <code>Rule</code> from a <code>WebACL</code> that
     *         doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchSet</code> to or delete a <code>ByteMatchSet</code> from a
     *         <code>Rule</code> that doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add an IP address to or delete an IP address from an <code>IPSet</code> that doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchTuple</code> to or delete a <code>ByteMatchTuple</code> from a
     *         <code>ByteMatchSet</code> that doesn't exist.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFLimitsExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>WebACL</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @sample AWSWAFRegional.UpdateByteMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateByteMatchSet"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateByteMatchSetResult updateByteMatchSet(UpdateByteMatchSetRequest updateByteMatchSetRequest);

    /**
     * <p>
     * Inserts or deletes <a>GeoMatchConstraint</a> objects in an <code>GeoMatchSet</code>. For each
     * <code>GeoMatchConstraint</code> object, you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether to insert or delete the object from the array. If you want to change an <code>GeoMatchConstraint</code>
     * object, you delete the existing object and add a new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Type</code>. The only valid value for <code>Type</code> is <code>Country</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Value</code>, which is a two character code for the country to add to the
     * <code>GeoMatchConstraint</code> object. Valid codes are listed in <a>GeoMatchConstraint$Value</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To create and configure an <code>GeoMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Submit a <a>CreateGeoMatchSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of
     * an <a>UpdateGeoMatchSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateGeoMatchSet</code> request to specify the country that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * When you update an <code>GeoMatchSet</code>, you specify the country that you want to add and/or the country that
     * you want to delete. If you want to change a country, you delete the existing country and add the new one.
     * </p>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param updateGeoMatchSetRequest
     * @return Result of the UpdateGeoMatchSet operation returned by the service.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFInvalidOperationException
     *         The operation failed because there was nothing to do. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to remove a <code>Rule</code> from a <code>WebACL</code>, but the <code>Rule</code> isn't in
     *         the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to remove an IP address from an <code>IPSet</code>, but the IP address isn't in the specified
     *         <code>IPSet</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to remove a <code>ByteMatchTuple</code> from a <code>ByteMatchSet</code>, but the
     *         <code>ByteMatchTuple</code> isn't in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>Rule</code> to a <code>WebACL</code>, but the <code>Rule</code> already exists
     *         in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchTuple</code> to a <code>ByteMatchSet</code>, but the
     *         <code>ByteMatchTuple</code> already exists in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>RateBasedRule</code> with a <code>RateKey</code> value other than
     *         <code>IP</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, METHOD, QUERY_STRING, URI, or BODY.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentContainerException
     *         The operation failed because you tried to add an object to or delete an object from another object that
     *         doesn't exist. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to add a <code>Rule</code> to or delete a <code>Rule</code> from a <code>WebACL</code> that
     *         doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchSet</code> to or delete a <code>ByteMatchSet</code> from a
     *         <code>Rule</code> that doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add an IP address to or delete an IP address from an <code>IPSet</code> that doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchTuple</code> to or delete a <code>ByteMatchTuple</code> from a
     *         <code>ByteMatchSet</code> that doesn't exist.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFReferencedItemException
     *         The operation failed because you tried to delete an object that is still in use. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that is still referenced by a <code>Rule</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that is still referenced by a <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFLimitsExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>WebACL</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @sample AWSWAFRegional.UpdateGeoMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateGeoMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateGeoMatchSetResult updateGeoMatchSet(UpdateGeoMatchSetRequest updateGeoMatchSetRequest);

    /**
     * <p>
     * Inserts or deletes <a>IPSetDescriptor</a> objects in an <code>IPSet</code>. For each <code>IPSetDescriptor</code>
     * object, you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether to insert or delete the object from the array. If you want to change an <code>IPSetDescriptor</code>
     * object, you delete the existing object and add a new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * The IP address version, <code>IPv4</code> or <code>IPv6</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The IP address in CIDR notation, for example, <code>192.0.2.0/24</code> (for the range of IP addresses from
     * <code>192.0.2.0</code> to <code>192.0.2.255</code>) or <code>192.0.2.44/32</code> (for the individual IP address
     * <code>192.0.2.44</code>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * AWS WAF supports IPv4 address ranges: /8 and any range between /16 through /32. AWS WAF supports IPv6 address
     * ranges: /24, /32, /48, /56, /64, and /128. For more information about CIDR notation, see the Wikipedia entry <a
     * href="https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing">Classless Inter-Domain Routing</a>.
     * </p>
     * <p>
     * IPv6 addresses can be represented using any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 1111:0000:0000:0000:0000:0000:0000:0111/128
     * </p>
     * </li>
     * <li>
     * <p>
     * 1111:0:0:0:0:0:0:0111/128
     * </p>
     * </li>
     * <li>
     * <p>
     * 1111::0111/128
     * </p>
     * </li>
     * <li>
     * <p>
     * 1111::111/128
     * </p>
     * </li>
     * </ul>
     * <p>
     * You use an <code>IPSet</code> to specify which web requests you want to allow or block based on the IP addresses
     * that the requests originated from. For example, if you're receiving a lot of requests from one or a small number
     * of IP addresses and you want to block the requests, you can create an <code>IPSet</code> that specifies those IP
     * addresses, and then configure AWS WAF to block the requests.
     * </p>
     * <p>
     * To create and configure an <code>IPSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Submit a <a>CreateIPSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of
     * an <a>UpdateIPSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateIPSet</code> request to specify the IP addresses that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * When you update an <code>IPSet</code>, you specify the IP addresses that you want to add and/or the IP addresses
     * that you want to delete. If you want to change an IP address, you delete the existing IP address and add the new
     * one.
     * </p>
     * <p>
     * You can insert a maximum of 1000 addresses in a single request.
     * </p>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param updateIPSetRequest
     * @return Result of the UpdateIPSet operation returned by the service.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFInvalidOperationException
     *         The operation failed because there was nothing to do. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to remove a <code>Rule</code> from a <code>WebACL</code>, but the <code>Rule</code> isn't in
     *         the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to remove an IP address from an <code>IPSet</code>, but the IP address isn't in the specified
     *         <code>IPSet</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to remove a <code>ByteMatchTuple</code> from a <code>ByteMatchSet</code>, but the
     *         <code>ByteMatchTuple</code> isn't in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>Rule</code> to a <code>WebACL</code>, but the <code>Rule</code> already exists
     *         in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchTuple</code> to a <code>ByteMatchSet</code>, but the
     *         <code>ByteMatchTuple</code> already exists in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>RateBasedRule</code> with a <code>RateKey</code> value other than
     *         <code>IP</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, METHOD, QUERY_STRING, URI, or BODY.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentContainerException
     *         The operation failed because you tried to add an object to or delete an object from another object that
     *         doesn't exist. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to add a <code>Rule</code> to or delete a <code>Rule</code> from a <code>WebACL</code> that
     *         doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchSet</code> to or delete a <code>ByteMatchSet</code> from a
     *         <code>Rule</code> that doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add an IP address to or delete an IP address from an <code>IPSet</code> that doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchTuple</code> to or delete a <code>ByteMatchTuple</code> from a
     *         <code>ByteMatchSet</code> that doesn't exist.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFReferencedItemException
     *         The operation failed because you tried to delete an object that is still in use. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that is still referenced by a <code>Rule</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that is still referenced by a <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFLimitsExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>WebACL</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @sample AWSWAFRegional.UpdateIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateIPSetResult updateIPSet(UpdateIPSetRequest updateIPSetRequest);

    /**
     * <p>
     * Inserts or deletes <a>Predicate</a> objects in a rule and updates the <code>RateLimit</code> in the rule.
     * </p>
     * <p>
     * Each <code>Predicate</code> object identifies a predicate, such as a <a>ByteMatchSet</a> or an <a>IPSet</a>, that
     * specifies the web requests that you want to block or count. The <code>RateLimit</code> specifies the number of
     * requests every five minutes that triggers the rule.
     * </p>
     * <p>
     * If you add more than one predicate to a <code>RateBasedRule</code>, a request must match all the predicates and
     * exceed the <code>RateLimit</code> to be counted or blocked. For example, suppose you add the following to a
     * <code>RateBasedRule</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An <code>IPSet</code> that matches the IP address <code>192.0.2.44/32</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>ByteMatchSet</code> that matches <code>BadBot</code> in the <code>User-Agent</code> header
     * </p>
     * </li>
     * </ul>
     * <p>
     * Further, you specify a <code>RateLimit</code> of 15,000.
     * </p>
     * <p>
     * You then add the <code>RateBasedRule</code> to a <code>WebACL</code> and specify that you want to block requests
     * that satisfy the rule. For a request to be blocked, it must come from the IP address 192.0.2.44 <i>and</i> the
     * <code>User-Agent</code> header in the request must contain the value <code>BadBot</code>. Further, requests that
     * match these two conditions much be received at a rate of more than 15,000 every five minutes. If the rate drops
     * below this limit, AWS WAF no longer blocks the requests.
     * </p>
     * <p>
     * As a second example, suppose you want to limit requests to a particular page on your site. To do this, you could
     * add the following to a <code>RateBasedRule</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A <code>ByteMatchSet</code> with <code>FieldToMatch</code> of <code>URI</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>PositionalConstraint</code> of <code>STARTS_WITH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>TargetString</code> of <code>login</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Further, you specify a <code>RateLimit</code> of 15,000.
     * </p>
     * <p>
     * By adding this <code>RateBasedRule</code> to a <code>WebACL</code>, you could limit requests to your login page
     * without affecting the rest of your site.
     * </p>
     * 
     * @param updateRateBasedRuleRequest
     * @return Result of the UpdateRateBasedRule operation returned by the service.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFInvalidOperationException
     *         The operation failed because there was nothing to do. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to remove a <code>Rule</code> from a <code>WebACL</code>, but the <code>Rule</code> isn't in
     *         the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to remove an IP address from an <code>IPSet</code>, but the IP address isn't in the specified
     *         <code>IPSet</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to remove a <code>ByteMatchTuple</code> from a <code>ByteMatchSet</code>, but the
     *         <code>ByteMatchTuple</code> isn't in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>Rule</code> to a <code>WebACL</code>, but the <code>Rule</code> already exists
     *         in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchTuple</code> to a <code>ByteMatchSet</code>, but the
     *         <code>ByteMatchTuple</code> already exists in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>RateBasedRule</code> with a <code>RateKey</code> value other than
     *         <code>IP</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, METHOD, QUERY_STRING, URI, or BODY.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentContainerException
     *         The operation failed because you tried to add an object to or delete an object from another object that
     *         doesn't exist. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to add a <code>Rule</code> to or delete a <code>Rule</code> from a <code>WebACL</code> that
     *         doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchSet</code> to or delete a <code>ByteMatchSet</code> from a
     *         <code>Rule</code> that doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add an IP address to or delete an IP address from an <code>IPSet</code> that doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchTuple</code> to or delete a <code>ByteMatchTuple</code> from a
     *         <code>ByteMatchSet</code> that doesn't exist.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFReferencedItemException
     *         The operation failed because you tried to delete an object that is still in use. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that is still referenced by a <code>Rule</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that is still referenced by a <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFLimitsExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>WebACL</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @sample AWSWAFRegional.UpdateRateBasedRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateRateBasedRule"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateRateBasedRuleResult updateRateBasedRule(UpdateRateBasedRuleRequest updateRateBasedRuleRequest);

    /**
     * <p>
     * Inserts or deletes <a>RegexMatchTuple</a> objects (filters) in a <a>RegexMatchSet</a>. For each
     * <code>RegexMatchSetUpdate</code> object, you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether to insert or delete the object from the array. If you want to change a <code>RegexMatchSetUpdate</code>
     * object, you delete the existing object and add a new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * The part of a web request that you want AWS WAF to inspectupdate, such as a query string or the value of the
     * <code>User-Agent</code> header.
     * </p>
     * </li>
     * <li>
     * <p>
     * The identifier of the pattern (a regular expression) that you want AWS WAF to look for. For more information, see
     * <a>RegexPatternSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Whether to perform any conversions on the request, such as converting it to lowercase, before inspecting it for
     * the specified string.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, you can create a <code>RegexPatternSet</code> that matches any requests with <code>User-Agent</code>
     * headers that contain the string <code>B[a@]dB[o0]t</code>. You can then configure AWS WAF to reject those
     * requests.
     * </p>
     * <p>
     * To create and configure a <code>RegexMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create a <code>RegexMatchSet.</code> For more information, see <a>CreateRegexMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of
     * an <code>UpdateRegexMatchSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateRegexMatchSet</code> request to specify the part of the request that you want AWS WAF to
     * inspect (for example, the header or the URI) and the identifier of the <code>RegexPatternSet</code> that contain
     * the regular expression patters you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param updateRegexMatchSetRequest
     * @return Result of the UpdateRegexMatchSet operation returned by the service.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFDisallowedNameException
     *         The name specified is invalid.
     * @throws WAFLimitsExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>WebACL</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFNonexistentContainerException
     *         The operation failed because you tried to add an object to or delete an object from another object that
     *         doesn't exist. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to add a <code>Rule</code> to or delete a <code>Rule</code> from a <code>WebACL</code> that
     *         doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchSet</code> to or delete a <code>ByteMatchSet</code> from a
     *         <code>Rule</code> that doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add an IP address to or delete an IP address from an <code>IPSet</code> that doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchTuple</code> to or delete a <code>ByteMatchTuple</code> from a
     *         <code>ByteMatchSet</code> that doesn't exist.
     *         </p>
     *         </li>
     * @throws WAFInvalidOperationException
     *         The operation failed because there was nothing to do. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to remove a <code>Rule</code> from a <code>WebACL</code>, but the <code>Rule</code> isn't in
     *         the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to remove an IP address from an <code>IPSet</code>, but the IP address isn't in the specified
     *         <code>IPSet</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to remove a <code>ByteMatchTuple</code> from a <code>ByteMatchSet</code>, but the
     *         <code>ByteMatchTuple</code> isn't in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>Rule</code> to a <code>WebACL</code>, but the <code>Rule</code> already exists
     *         in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchTuple</code> to a <code>ByteMatchSet</code>, but the
     *         <code>ByteMatchTuple</code> already exists in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @sample AWSWAFRegional.UpdateRegexMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateRegexMatchSet"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateRegexMatchSetResult updateRegexMatchSet(UpdateRegexMatchSetRequest updateRegexMatchSetRequest);

    /**
     * <p>
     * Inserts or deletes <code>RegexPatternString</code> objects in a <a>RegexPatternSet</a>. For each
     * <code>RegexPatternString</code> object, you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether to insert or delete the <code>RegexPatternString</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The regular expression pattern that you want to insert or delete. For more information, see
     * <a>RegexPatternSet</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, you can create a <code>RegexPatternString</code> such as <code>B[a@]dB[o0]t</code>. AWS WAF will
     * match this <code>RegexPatternString</code> to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * BadBot
     * </p>
     * </li>
     * <li>
     * <p>
     * BadB0t
     * </p>
     * </li>
     * <li>
     * <p>
     * B@dBot
     * </p>
     * </li>
     * <li>
     * <p>
     * B@dB0t
     * </p>
     * </li>
     * </ul>
     * <p>
     * To create and configure a <code>RegexPatternSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create a <code>RegexPatternSet.</code> For more information, see <a>CreateRegexPatternSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of
     * an <code>UpdateRegexPatternSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateRegexPatternSet</code> request to specify the regular expression pattern that you want AWS
     * WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param updateRegexPatternSetRequest
     * @return Result of the UpdateRegexPatternSet operation returned by the service.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFLimitsExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>WebACL</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFNonexistentContainerException
     *         The operation failed because you tried to add an object to or delete an object from another object that
     *         doesn't exist. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to add a <code>Rule</code> to or delete a <code>Rule</code> from a <code>WebACL</code> that
     *         doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchSet</code> to or delete a <code>ByteMatchSet</code> from a
     *         <code>Rule</code> that doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add an IP address to or delete an IP address from an <code>IPSet</code> that doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchTuple</code> to or delete a <code>ByteMatchTuple</code> from a
     *         <code>ByteMatchSet</code> that doesn't exist.
     *         </p>
     *         </li>
     * @throws WAFInvalidOperationException
     *         The operation failed because there was nothing to do. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to remove a <code>Rule</code> from a <code>WebACL</code>, but the <code>Rule</code> isn't in
     *         the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to remove an IP address from an <code>IPSet</code>, but the IP address isn't in the specified
     *         <code>IPSet</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to remove a <code>ByteMatchTuple</code> from a <code>ByteMatchSet</code>, but the
     *         <code>ByteMatchTuple</code> isn't in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>Rule</code> to a <code>WebACL</code>, but the <code>Rule</code> already exists
     *         in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchTuple</code> to a <code>ByteMatchSet</code>, but the
     *         <code>ByteMatchTuple</code> already exists in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFInvalidRegexPatternException
     *         The regular expression (regex) you specified in <code>RegexPatternString</code> is invalid.
     * @sample AWSWAFRegional.UpdateRegexPatternSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateRegexPatternSet"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateRegexPatternSetResult updateRegexPatternSet(UpdateRegexPatternSetRequest updateRegexPatternSetRequest);

    /**
     * <p>
     * Inserts or deletes <a>Predicate</a> objects in a <code>Rule</code>. Each <code>Predicate</code> object identifies
     * a predicate, such as a <a>ByteMatchSet</a> or an <a>IPSet</a>, that specifies the web requests that you want to
     * allow, block, or count. If you add more than one predicate to a <code>Rule</code>, a request must match all of
     * the specifications to be allowed, blocked, or counted. For example, suppose that you add the following to a
     * <code>Rule</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A <code>ByteMatchSet</code> that matches the value <code>BadBot</code> in the <code>User-Agent</code> header
     * </p>
     * </li>
     * <li>
     * <p>
     * An <code>IPSet</code> that matches the IP address <code>192.0.2.44</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You then add the <code>Rule</code> to a <code>WebACL</code> and specify that you want to block requests that
     * satisfy the <code>Rule</code>. For a request to be blocked, the <code>User-Agent</code> header in the request
     * must contain the value <code>BadBot</code> <i>and</i> the request must originate from the IP address 192.0.2.44.
     * </p>
     * <p>
     * To create and configure a <code>Rule</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create and update the predicates that you want to include in the <code>Rule</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create the <code>Rule</code>. See <a>CreateRule</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <a>UpdateRule</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateRule</code> request to add predicates to the <code>Rule</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update a <code>WebACL</code> that contains the <code>Rule</code>. See <a>CreateWebACL</a>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * If you want to replace one <code>ByteMatchSet</code> or <code>IPSet</code> with another, you delete the existing
     * one and add the new one.
     * </p>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param updateRuleRequest
     * @return Result of the UpdateRule operation returned by the service.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFInvalidOperationException
     *         The operation failed because there was nothing to do. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to remove a <code>Rule</code> from a <code>WebACL</code>, but the <code>Rule</code> isn't in
     *         the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to remove an IP address from an <code>IPSet</code>, but the IP address isn't in the specified
     *         <code>IPSet</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to remove a <code>ByteMatchTuple</code> from a <code>ByteMatchSet</code>, but the
     *         <code>ByteMatchTuple</code> isn't in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>Rule</code> to a <code>WebACL</code>, but the <code>Rule</code> already exists
     *         in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchTuple</code> to a <code>ByteMatchSet</code>, but the
     *         <code>ByteMatchTuple</code> already exists in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>RateBasedRule</code> with a <code>RateKey</code> value other than
     *         <code>IP</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, METHOD, QUERY_STRING, URI, or BODY.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentContainerException
     *         The operation failed because you tried to add an object to or delete an object from another object that
     *         doesn't exist. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to add a <code>Rule</code> to or delete a <code>Rule</code> from a <code>WebACL</code> that
     *         doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchSet</code> to or delete a <code>ByteMatchSet</code> from a
     *         <code>Rule</code> that doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add an IP address to or delete an IP address from an <code>IPSet</code> that doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchTuple</code> to or delete a <code>ByteMatchTuple</code> from a
     *         <code>ByteMatchSet</code> that doesn't exist.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFReferencedItemException
     *         The operation failed because you tried to delete an object that is still in use. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that is still referenced by a <code>Rule</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that is still referenced by a <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFLimitsExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>WebACL</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @sample AWSWAFRegional.UpdateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateRule" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateRuleResult updateRule(UpdateRuleRequest updateRuleRequest);

    /**
     * <p>
     * Inserts or deletes <a>ActivatedRule</a> objects in a <code>RuleGroup</code>.
     * </p>
     * <p>
     * You can only insert <code>REGULAR</code> rules into a rule group.
     * </p>
     * <p>
     * You can have a maximum of ten rules per rule group.
     * </p>
     * <p>
     * To create and configure a <code>RuleGroup</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create and update the <code>Rules</code> that you want to include in the <code>RuleGroup</code>. See
     * <a>CreateRule</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <a>UpdateRuleGroup</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateRuleGroup</code> request to add <code>Rules</code> to the <code>RuleGroup</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update a <code>WebACL</code> that contains the <code>RuleGroup</code>. See <a>CreateWebACL</a>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * If you want to replace one <code>Rule</code> with another, you delete the existing one and add the new one.
     * </p>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param updateRuleGroupRequest
     * @return Result of the UpdateRuleGroup operation returned by the service.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFNonexistentContainerException
     *         The operation failed because you tried to add an object to or delete an object from another object that
     *         doesn't exist. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to add a <code>Rule</code> to or delete a <code>Rule</code> from a <code>WebACL</code> that
     *         doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchSet</code> to or delete a <code>ByteMatchSet</code> from a
     *         <code>Rule</code> that doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add an IP address to or delete an IP address from an <code>IPSet</code> that doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchTuple</code> to or delete a <code>ByteMatchTuple</code> from a
     *         <code>ByteMatchSet</code> that doesn't exist.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFInvalidOperationException
     *         The operation failed because there was nothing to do. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to remove a <code>Rule</code> from a <code>WebACL</code>, but the <code>Rule</code> isn't in
     *         the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to remove an IP address from an <code>IPSet</code>, but the IP address isn't in the specified
     *         <code>IPSet</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to remove a <code>ByteMatchTuple</code> from a <code>ByteMatchSet</code>, but the
     *         <code>ByteMatchTuple</code> isn't in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>Rule</code> to a <code>WebACL</code>, but the <code>Rule</code> already exists
     *         in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchTuple</code> to a <code>ByteMatchSet</code>, but the
     *         <code>ByteMatchTuple</code> already exists in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFLimitsExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>WebACL</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>RateBasedRule</code> with a <code>RateKey</code> value other than
     *         <code>IP</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, METHOD, QUERY_STRING, URI, or BODY.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @sample AWSWAFRegional.UpdateRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateRuleGroup" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateRuleGroupResult updateRuleGroup(UpdateRuleGroupRequest updateRuleGroupRequest);

    /**
     * <p>
     * Inserts or deletes <a>SizeConstraint</a> objects (filters) in a <a>SizeConstraintSet</a>. For each
     * <code>SizeConstraint</code> object, you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Whether to insert or delete the object from the array. If you want to change a
     * <code>SizeConstraintSetUpdate</code> object, you delete the existing object and add a new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * The part of a web request that you want AWS WAF to evaluate, such as the length of a query string or the length
     * of the <code>User-Agent</code> header.
     * </p>
     * </li>
     * <li>
     * <p>
     * Whether to perform any transformations on the request, such as converting it to lowercase, before checking its
     * length. Note that transformations of the request body are not supported because the AWS resource forwards only
     * the first <code>8192</code> bytes of your request to AWS WAF.
     * </p>
     * <p>
     * You can only specify a single type of TextTransformation.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <code>ComparisonOperator</code> used for evaluating the selected part of the request against the specified
     * <code>Size</code>, such as equals, greater than, less than, and so on.
     * </p>
     * </li>
     * <li>
     * <p>
     * The length, in bytes, that you want AWS WAF to watch for in selected part of the request. The length is computed
     * after applying the transformation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, you can add a <code>SizeConstraintSetUpdate</code> object that matches web requests in which the
     * length of the <code>User-Agent</code> header is greater than 100 bytes. You can then configure AWS WAF to block
     * those requests.
     * </p>
     * <p>
     * To create and configure a <code>SizeConstraintSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create a <code>SizeConstraintSet.</code> For more information, see <a>CreateSizeConstraintSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of
     * an <code>UpdateSizeConstraintSet</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateSizeConstraintSet</code> request to specify the part of the request that you want AWS WAF
     * to inspect (for example, the header or the URI) and the value that you want AWS WAF to watch for.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param updateSizeConstraintSetRequest
     * @return Result of the UpdateSizeConstraintSet operation returned by the service.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFInvalidOperationException
     *         The operation failed because there was nothing to do. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to remove a <code>Rule</code> from a <code>WebACL</code>, but the <code>Rule</code> isn't in
     *         the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to remove an IP address from an <code>IPSet</code>, but the IP address isn't in the specified
     *         <code>IPSet</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to remove a <code>ByteMatchTuple</code> from a <code>ByteMatchSet</code>, but the
     *         <code>ByteMatchTuple</code> isn't in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>Rule</code> to a <code>WebACL</code>, but the <code>Rule</code> already exists
     *         in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchTuple</code> to a <code>ByteMatchSet</code>, but the
     *         <code>ByteMatchTuple</code> already exists in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>RateBasedRule</code> with a <code>RateKey</code> value other than
     *         <code>IP</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, METHOD, QUERY_STRING, URI, or BODY.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentContainerException
     *         The operation failed because you tried to add an object to or delete an object from another object that
     *         doesn't exist. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to add a <code>Rule</code> to or delete a <code>Rule</code> from a <code>WebACL</code> that
     *         doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchSet</code> to or delete a <code>ByteMatchSet</code> from a
     *         <code>Rule</code> that doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add an IP address to or delete an IP address from an <code>IPSet</code> that doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchTuple</code> to or delete a <code>ByteMatchTuple</code> from a
     *         <code>ByteMatchSet</code> that doesn't exist.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFReferencedItemException
     *         The operation failed because you tried to delete an object that is still in use. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that is still referenced by a <code>Rule</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that is still referenced by a <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFLimitsExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>WebACL</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @sample AWSWAFRegional.UpdateSizeConstraintSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateSizeConstraintSet"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateSizeConstraintSetResult updateSizeConstraintSet(UpdateSizeConstraintSetRequest updateSizeConstraintSetRequest);

    /**
     * <p>
     * Inserts or deletes <a>SqlInjectionMatchTuple</a> objects (filters) in a <a>SqlInjectionMatchSet</a>. For each
     * <code>SqlInjectionMatchTuple</code> object, you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Action</code>: Whether to insert the object into or delete the object from the array. To change a
     * <code>SqlInjectionMatchTuple</code>, you delete the existing object and add a new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FieldToMatch</code>: The part of web requests that you want AWS WAF to inspect and, if you want AWS WAF to
     * inspect a header or custom query parameter, the name of the header or parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TextTransformation</code>: Which text transformation, if any, to perform on the web request before
     * inspecting the request for snippets of malicious SQL code.
     * </p>
     * <p>
     * You can only specify a single type of TextTransformation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You use <code>SqlInjectionMatchSet</code> objects to specify which CloudFront requests that you want to allow,
     * block, or count. For example, if you're receiving requests that contain snippets of SQL code in the query string
     * and you want to block the requests, you can create a <code>SqlInjectionMatchSet</code> with the applicable
     * settings, and then configure AWS WAF to block the requests.
     * </p>
     * <p>
     * To create and configure a <code>SqlInjectionMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Submit a <a>CreateSqlInjectionMatchSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of
     * an <a>UpdateIPSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateSqlInjectionMatchSet</code> request to specify the parts of web requests that you want AWS
     * WAF to inspect for snippets of SQL code.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param updateSqlInjectionMatchSetRequest
     *        A request to update a <a>SqlInjectionMatchSet</a>.
     * @return Result of the UpdateSqlInjectionMatchSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFInvalidOperationException
     *         The operation failed because there was nothing to do. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to remove a <code>Rule</code> from a <code>WebACL</code>, but the <code>Rule</code> isn't in
     *         the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to remove an IP address from an <code>IPSet</code>, but the IP address isn't in the specified
     *         <code>IPSet</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to remove a <code>ByteMatchTuple</code> from a <code>ByteMatchSet</code>, but the
     *         <code>ByteMatchTuple</code> isn't in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>Rule</code> to a <code>WebACL</code>, but the <code>Rule</code> already exists
     *         in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchTuple</code> to a <code>ByteMatchSet</code>, but the
     *         <code>ByteMatchTuple</code> already exists in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>RateBasedRule</code> with a <code>RateKey</code> value other than
     *         <code>IP</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, METHOD, QUERY_STRING, URI, or BODY.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentContainerException
     *         The operation failed because you tried to add an object to or delete an object from another object that
     *         doesn't exist. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to add a <code>Rule</code> to or delete a <code>Rule</code> from a <code>WebACL</code> that
     *         doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchSet</code> to or delete a <code>ByteMatchSet</code> from a
     *         <code>Rule</code> that doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add an IP address to or delete an IP address from an <code>IPSet</code> that doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchTuple</code> to or delete a <code>ByteMatchTuple</code> from a
     *         <code>ByteMatchSet</code> that doesn't exist.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFLimitsExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>WebACL</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @sample AWSWAFRegional.UpdateSqlInjectionMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateSqlInjectionMatchSet"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateSqlInjectionMatchSetResult updateSqlInjectionMatchSet(UpdateSqlInjectionMatchSetRequest updateSqlInjectionMatchSetRequest);

    /**
     * <p>
     * Inserts or deletes <a>ActivatedRule</a> objects in a <code>WebACL</code>. Each <code>Rule</code> identifies web
     * requests that you want to allow, block, or count. When you update a <code>WebACL</code>, you specify the
     * following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A default action for the <code>WebACL</code>, either <code>ALLOW</code> or <code>BLOCK</code>. AWS WAF performs
     * the default action if a request doesn't match the criteria in any of the <code>Rules</code> in a
     * <code>WebACL</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>Rules</code> that you want to add or delete. If you want to replace one <code>Rule</code> with another,
     * you delete the existing <code>Rule</code> and add the new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * For each <code>Rule</code>, whether you want AWS WAF to allow requests, block requests, or count requests that
     * match the conditions in the <code>Rule</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The order in which you want AWS WAF to evaluate the <code>Rules</code> in a <code>WebACL</code>. If you add more
     * than one <code>Rule</code> to a <code>WebACL</code>, AWS WAF evaluates each request against the
     * <code>Rules</code> in order based on the value of <code>Priority</code>. (The <code>Rule</code> that has the
     * lowest value for <code>Priority</code> is evaluated first.) When a web request matches all the predicates (such
     * as <code>ByteMatchSets</code> and <code>IPSets</code>) in a <code>Rule</code>, AWS WAF immediately takes the
     * corresponding action, allow or block, and doesn't evaluate the request against the remaining <code>Rules</code>
     * in the <code>WebACL</code>, if any.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To create and configure a <code>WebACL</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Create and update the predicates that you want to include in <code>Rules</code>. For more information, see
     * <a>CreateByteMatchSet</a>, <a>UpdateByteMatchSet</a>, <a>CreateIPSet</a>, <a>UpdateIPSet</a>,
     * <a>CreateSqlInjectionMatchSet</a>, and <a>UpdateSqlInjectionMatchSet</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create and update the <code>Rules</code> that you want to include in the <code>WebACL</code>. For more
     * information, see <a>CreateRule</a> and <a>UpdateRule</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create a <code>WebACL</code>. See <a>CreateWebACL</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <code>GetChangeToken</code> to get the change token that you provide in the <code>ChangeToken</code>
     * parameter of an <a>UpdateWebACL</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateWebACL</code> request to specify the <code>Rules</code> that you want to include in the
     * <code>WebACL</code>, to specify the default action, and to associate the <code>WebACL</code> with a CloudFront
     * distribution.
     * </p>
     * <p>
     * The <code>ActivatedRule</code> can be a rule group. If you specify a rule group as your
     * <code>ActivatedRule</code>, you can exclude specific rules from that rule group.
     * </p>
     * <p>
     * If you already have a rule group associated with a web ACL and want to submit an <code>UpdateWebACL</code>
     * request to exclude certain rules from that rule group, you must first remove the rule group from the web ACL, the
     * re-insert it again, specifying the excluded rules. For details, see <a>ActivatedRule$ExcludedRules</a>.
     * </p>
     * </li>
     * </ol>
     * <p>
     * Be aware that if you try to add a RATE_BASED rule to a web ACL without setting the rule type when first creating
     * the rule, the <a>UpdateWebACL</a> request will fail because the request tries to add a REGULAR rule (the default
     * rule type) with the specified ID, which does not exist.
     * </p>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param updateWebACLRequest
     * @return Result of the UpdateWebACL operation returned by the service.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFInvalidOperationException
     *         The operation failed because there was nothing to do. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to remove a <code>Rule</code> from a <code>WebACL</code>, but the <code>Rule</code> isn't in
     *         the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to remove an IP address from an <code>IPSet</code>, but the IP address isn't in the specified
     *         <code>IPSet</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to remove a <code>ByteMatchTuple</code> from a <code>ByteMatchSet</code>, but the
     *         <code>ByteMatchTuple</code> isn't in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>Rule</code> to a <code>WebACL</code>, but the <code>Rule</code> already exists
     *         in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchTuple</code> to a <code>ByteMatchSet</code>, but the
     *         <code>ByteMatchTuple</code> already exists in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>RateBasedRule</code> with a <code>RateKey</code> value other than
     *         <code>IP</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, METHOD, QUERY_STRING, URI, or BODY.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentContainerException
     *         The operation failed because you tried to add an object to or delete an object from another object that
     *         doesn't exist. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to add a <code>Rule</code> to or delete a <code>Rule</code> from a <code>WebACL</code> that
     *         doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchSet</code> to or delete a <code>ByteMatchSet</code> from a
     *         <code>Rule</code> that doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add an IP address to or delete an IP address from an <code>IPSet</code> that doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchTuple</code> to or delete a <code>ByteMatchTuple</code> from a
     *         <code>ByteMatchSet</code> that doesn't exist.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFReferencedItemException
     *         The operation failed because you tried to delete an object that is still in use. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to delete a <code>ByteMatchSet</code> that is still referenced by a <code>Rule</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to delete a <code>Rule</code> that is still referenced by a <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFLimitsExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>WebACL</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @throws WAFSubscriptionNotFoundException
     *         The specified subscription does not exist.
     * @sample AWSWAFRegional.UpdateWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateWebACLResult updateWebACL(UpdateWebACLRequest updateWebACLRequest);

    /**
     * <p>
     * Inserts or deletes <a>XssMatchTuple</a> objects (filters) in an <a>XssMatchSet</a>. For each
     * <code>XssMatchTuple</code> object, you specify the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Action</code>: Whether to insert the object into or delete the object from the array. To change an
     * <code>XssMatchTuple</code>, you delete the existing object and add a new one.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FieldToMatch</code>: The part of web requests that you want AWS WAF to inspect and, if you want AWS WAF to
     * inspect a header or custom query parameter, the name of the header or parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TextTransformation</code>: Which text transformation, if any, to perform on the web request before
     * inspecting the request for cross-site scripting attacks.
     * </p>
     * <p>
     * You can only specify a single type of TextTransformation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You use <code>XssMatchSet</code> objects to specify which CloudFront requests that you want to allow, block, or
     * count. For example, if you're receiving requests that contain cross-site scripting attacks in the request body
     * and you want to block the requests, you can create an <code>XssMatchSet</code> with the applicable settings, and
     * then configure AWS WAF to block the requests.
     * </p>
     * <p>
     * To create and configure an <code>XssMatchSet</code>, perform the following steps:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Submit a <a>CreateXssMatchSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use <a>GetChangeToken</a> to get the change token that you provide in the <code>ChangeToken</code> parameter of
     * an <a>UpdateIPSet</a> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit an <code>UpdateXssMatchSet</code> request to specify the parts of web requests that you want AWS WAF to
     * inspect for cross-site scripting attacks.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For more information about how to use the AWS WAF API to allow or block HTTP requests, see the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
     * </p>
     * 
     * @param updateXssMatchSetRequest
     *        A request to update an <a>XssMatchSet</a>.
     * @return Result of the UpdateXssMatchSet operation returned by the service.
     * @throws WAFInternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws WAFInvalidAccountException
     *         The operation failed because you tried to create, update, or delete an object by using an invalid account
     *         identifier.
     * @throws WAFInvalidOperationException
     *         The operation failed because there was nothing to do. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to remove a <code>Rule</code> from a <code>WebACL</code>, but the <code>Rule</code> isn't in
     *         the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to remove an IP address from an <code>IPSet</code>, but the IP address isn't in the specified
     *         <code>IPSet</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to remove a <code>ByteMatchTuple</code> from a <code>ByteMatchSet</code>, but the
     *         <code>ByteMatchTuple</code> isn't in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>Rule</code> to a <code>WebACL</code>, but the <code>Rule</code> already exists
     *         in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchTuple</code> to a <code>ByteMatchSet</code>, but the
     *         <code>ByteMatchTuple</code> already exists in the specified <code>WebACL</code>.
     *         </p>
     *         </li>
     * @throws WAFInvalidParameterException
     *         The operation failed because AWS WAF didn't recognize a parameter in the request. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You specified an invalid parameter name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You specified an invalid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update an object (<code>ByteMatchSet</code>, <code>IPSet</code>, <code>Rule</code>, or
     *         <code>WebACL</code>) using an action other than <code>INSERT</code> or <code>DELETE</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>WebACL</code> with a <code>DefaultAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to create a <code>RateBasedRule</code> with a <code>RateKey</code> value other than
     *         <code>IP</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>WebACL</code> with a <code>WafAction</code> <code>Type</code> other than
     *         <code>ALLOW</code>, <code>BLOCK</code>, or <code>COUNT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>FieldToMatch</code> <code>Type</code> other
     *         than HEADER, METHOD, QUERY_STRING, URI, or BODY.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to update a <code>ByteMatchSet</code> with a <code>Field</code> of <code>HEADER</code> but no
     *         value for <code>Data</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Your request references an ARN that is malformed, or corresponds to a resource with which a web ACL
     *         cannot be associated.
     *         </p>
     *         </li>
     * @throws WAFNonexistentContainerException
     *         The operation failed because you tried to add an object to or delete an object from another object that
     *         doesn't exist. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         You tried to add a <code>Rule</code> to or delete a <code>Rule</code> from a <code>WebACL</code> that
     *         doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchSet</code> to or delete a <code>ByteMatchSet</code> from a
     *         <code>Rule</code> that doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add an IP address to or delete an IP address from an <code>IPSet</code> that doesn't exist.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You tried to add a <code>ByteMatchTuple</code> to or delete a <code>ByteMatchTuple</code> from a
     *         <code>ByteMatchSet</code> that doesn't exist.
     *         </p>
     *         </li>
     * @throws WAFNonexistentItemException
     *         The operation failed because the referenced object doesn't exist.
     * @throws WAFStaleDataException
     *         The operation failed because you tried to create, update, or delete an object by using a change token
     *         that has already been used.
     * @throws WAFLimitsExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>WebACL</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/limits.html">Limits</a> in the <i>AWS WAF
     *         Developer Guide</i>.
     * @sample AWSWAFRegional.UpdateXssMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/UpdateXssMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateXssMatchSetResult updateXssMatchSet(UpdateXssMatchSetRequest updateXssMatchSetRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
