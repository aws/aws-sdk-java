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

import com.amazonaws.services.waf.model.*;

/**
 * Interface for accessing WAF asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.waf.AbstractAWSWAFAsync} instead.
 * </p>
 * <p>
 * <p>
 * This is the <i>AWS WAF API Reference</i> for using AWS WAF with Amazon CloudFront. The AWS WAF actions and data types
 * listed in the reference are available for protecting Amazon CloudFront distributions. You can use these actions and
 * data types via the endpoint <i>waf.amazonaws.com</i>. This guide is for developers who need detailed information
 * about the AWS WAF API actions, data types, and errors. For detailed information about AWS WAF features and an
 * overview of how to use the AWS WAF API, see the <a href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS
 * WAF Developer Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSWAFAsync extends AWSWAF {

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
     * @return A Java Future containing the result of the CreateByteMatchSet operation returned by the service.
     * @sample AWSWAFAsync.CreateByteMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/CreateByteMatchSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateByteMatchSetResult> createByteMatchSetAsync(CreateByteMatchSetRequest createByteMatchSetRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateByteMatchSet operation returned by the service.
     * @sample AWSWAFAsyncHandler.CreateByteMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/CreateByteMatchSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateByteMatchSetResult> createByteMatchSetAsync(CreateByteMatchSetRequest createByteMatchSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateByteMatchSetRequest, CreateByteMatchSetResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateGeoMatchSet operation returned by the service.
     * @sample AWSWAFAsync.CreateGeoMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/CreateGeoMatchSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateGeoMatchSetResult> createGeoMatchSetAsync(CreateGeoMatchSetRequest createGeoMatchSetRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGeoMatchSet operation returned by the service.
     * @sample AWSWAFAsyncHandler.CreateGeoMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/CreateGeoMatchSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateGeoMatchSetResult> createGeoMatchSetAsync(CreateGeoMatchSetRequest createGeoMatchSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGeoMatchSetRequest, CreateGeoMatchSetResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateIPSet operation returned by the service.
     * @sample AWSWAFAsync.CreateIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/CreateIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateIPSetResult> createIPSetAsync(CreateIPSetRequest createIPSetRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateIPSet operation returned by the service.
     * @sample AWSWAFAsyncHandler.CreateIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/CreateIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateIPSetResult> createIPSetAsync(CreateIPSetRequest createIPSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateIPSetRequest, CreateIPSetResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateRateBasedRule operation returned by the service.
     * @sample AWSWAFAsync.CreateRateBasedRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/CreateRateBasedRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRateBasedRuleResult> createRateBasedRuleAsync(CreateRateBasedRuleRequest createRateBasedRuleRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRateBasedRule operation returned by the service.
     * @sample AWSWAFAsyncHandler.CreateRateBasedRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/CreateRateBasedRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRateBasedRuleResult> createRateBasedRuleAsync(CreateRateBasedRuleRequest createRateBasedRuleRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRateBasedRuleRequest, CreateRateBasedRuleResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateRegexMatchSet operation returned by the service.
     * @sample AWSWAFAsync.CreateRegexMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/CreateRegexMatchSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRegexMatchSetResult> createRegexMatchSetAsync(CreateRegexMatchSetRequest createRegexMatchSetRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRegexMatchSet operation returned by the service.
     * @sample AWSWAFAsyncHandler.CreateRegexMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/CreateRegexMatchSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRegexMatchSetResult> createRegexMatchSetAsync(CreateRegexMatchSetRequest createRegexMatchSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRegexMatchSetRequest, CreateRegexMatchSetResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateRegexPatternSet operation returned by the service.
     * @sample AWSWAFAsync.CreateRegexPatternSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/CreateRegexPatternSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRegexPatternSetResult> createRegexPatternSetAsync(CreateRegexPatternSetRequest createRegexPatternSetRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRegexPatternSet operation returned by the service.
     * @sample AWSWAFAsyncHandler.CreateRegexPatternSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/CreateRegexPatternSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRegexPatternSetResult> createRegexPatternSetAsync(CreateRegexPatternSetRequest createRegexPatternSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRegexPatternSetRequest, CreateRegexPatternSetResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateRule operation returned by the service.
     * @sample AWSWAFAsync.CreateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/CreateRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRuleResult> createRuleAsync(CreateRuleRequest createRuleRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRule operation returned by the service.
     * @sample AWSWAFAsyncHandler.CreateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/CreateRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRuleResult> createRuleAsync(CreateRuleRequest createRuleRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRuleRequest, CreateRuleResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateRuleGroup operation returned by the service.
     * @sample AWSWAFAsync.CreateRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/CreateRuleGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRuleGroupResult> createRuleGroupAsync(CreateRuleGroupRequest createRuleGroupRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRuleGroup operation returned by the service.
     * @sample AWSWAFAsyncHandler.CreateRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/CreateRuleGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRuleGroupResult> createRuleGroupAsync(CreateRuleGroupRequest createRuleGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRuleGroupRequest, CreateRuleGroupResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateSizeConstraintSet operation returned by the service.
     * @sample AWSWAFAsync.CreateSizeConstraintSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/CreateSizeConstraintSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateSizeConstraintSetResult> createSizeConstraintSetAsync(CreateSizeConstraintSetRequest createSizeConstraintSetRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSizeConstraintSet operation returned by the service.
     * @sample AWSWAFAsyncHandler.CreateSizeConstraintSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/CreateSizeConstraintSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateSizeConstraintSetResult> createSizeConstraintSetAsync(CreateSizeConstraintSetRequest createSizeConstraintSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSizeConstraintSetRequest, CreateSizeConstraintSetResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateSqlInjectionMatchSet operation returned by the service.
     * @sample AWSWAFAsync.CreateSqlInjectionMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/CreateSqlInjectionMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateSqlInjectionMatchSetResult> createSqlInjectionMatchSetAsync(
            CreateSqlInjectionMatchSetRequest createSqlInjectionMatchSetRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSqlInjectionMatchSet operation returned by the service.
     * @sample AWSWAFAsyncHandler.CreateSqlInjectionMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/CreateSqlInjectionMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateSqlInjectionMatchSetResult> createSqlInjectionMatchSetAsync(
            CreateSqlInjectionMatchSetRequest createSqlInjectionMatchSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSqlInjectionMatchSetRequest, CreateSqlInjectionMatchSetResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateWebACL operation returned by the service.
     * @sample AWSWAFAsync.CreateWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/CreateWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateWebACLResult> createWebACLAsync(CreateWebACLRequest createWebACLRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateWebACL operation returned by the service.
     * @sample AWSWAFAsyncHandler.CreateWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/CreateWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateWebACLResult> createWebACLAsync(CreateWebACLRequest createWebACLRequest,
            com.amazonaws.handlers.AsyncHandler<CreateWebACLRequest, CreateWebACLResult> asyncHandler);

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
     * @return A Java Future containing the result of the CreateXssMatchSet operation returned by the service.
     * @sample AWSWAFAsync.CreateXssMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/CreateXssMatchSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateXssMatchSetResult> createXssMatchSetAsync(CreateXssMatchSetRequest createXssMatchSetRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateXssMatchSet operation returned by the service.
     * @sample AWSWAFAsyncHandler.CreateXssMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/CreateXssMatchSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateXssMatchSetResult> createXssMatchSetAsync(CreateXssMatchSetRequest createXssMatchSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateXssMatchSetRequest, CreateXssMatchSetResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteByteMatchSet operation returned by the service.
     * @sample AWSWAFAsync.DeleteByteMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/DeleteByteMatchSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteByteMatchSetResult> deleteByteMatchSetAsync(DeleteByteMatchSetRequest deleteByteMatchSetRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteByteMatchSet operation returned by the service.
     * @sample AWSWAFAsyncHandler.DeleteByteMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/DeleteByteMatchSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteByteMatchSetResult> deleteByteMatchSetAsync(DeleteByteMatchSetRequest deleteByteMatchSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteByteMatchSetRequest, DeleteByteMatchSetResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteGeoMatchSet operation returned by the service.
     * @sample AWSWAFAsync.DeleteGeoMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/DeleteGeoMatchSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteGeoMatchSetResult> deleteGeoMatchSetAsync(DeleteGeoMatchSetRequest deleteGeoMatchSetRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteGeoMatchSet operation returned by the service.
     * @sample AWSWAFAsyncHandler.DeleteGeoMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/DeleteGeoMatchSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteGeoMatchSetResult> deleteGeoMatchSetAsync(DeleteGeoMatchSetRequest deleteGeoMatchSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteGeoMatchSetRequest, DeleteGeoMatchSetResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteIPSet operation returned by the service.
     * @sample AWSWAFAsync.DeleteIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/DeleteIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteIPSetResult> deleteIPSetAsync(DeleteIPSetRequest deleteIPSetRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteIPSet operation returned by the service.
     * @sample AWSWAFAsyncHandler.DeleteIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/DeleteIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteIPSetResult> deleteIPSetAsync(DeleteIPSetRequest deleteIPSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteIPSetRequest, DeleteIPSetResult> asyncHandler);

    /**
     * <p>
     * Permanently deletes the <a>LoggingConfiguration</a> from the specified web ACL.
     * </p>
     * 
     * @param deleteLoggingConfigurationRequest
     * @return A Java Future containing the result of the DeleteLoggingConfiguration operation returned by the service.
     * @sample AWSWAFAsync.DeleteLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/DeleteLoggingConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLoggingConfigurationResult> deleteLoggingConfigurationAsync(
            DeleteLoggingConfigurationRequest deleteLoggingConfigurationRequest);

    /**
     * <p>
     * Permanently deletes the <a>LoggingConfiguration</a> from the specified web ACL.
     * </p>
     * 
     * @param deleteLoggingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLoggingConfiguration operation returned by the service.
     * @sample AWSWAFAsyncHandler.DeleteLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/DeleteLoggingConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLoggingConfigurationResult> deleteLoggingConfigurationAsync(
            DeleteLoggingConfigurationRequest deleteLoggingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLoggingConfigurationRequest, DeleteLoggingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Permanently deletes an IAM policy from the specified RuleGroup.
     * </p>
     * <p>
     * The user making the request must be the owner of the RuleGroup.
     * </p>
     * 
     * @param deletePermissionPolicyRequest
     * @return A Java Future containing the result of the DeletePermissionPolicy operation returned by the service.
     * @sample AWSWAFAsync.DeletePermissionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/DeletePermissionPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePermissionPolicyResult> deletePermissionPolicyAsync(DeletePermissionPolicyRequest deletePermissionPolicyRequest);

    /**
     * <p>
     * Permanently deletes an IAM policy from the specified RuleGroup.
     * </p>
     * <p>
     * The user making the request must be the owner of the RuleGroup.
     * </p>
     * 
     * @param deletePermissionPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePermissionPolicy operation returned by the service.
     * @sample AWSWAFAsyncHandler.DeletePermissionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/DeletePermissionPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePermissionPolicyResult> deletePermissionPolicyAsync(DeletePermissionPolicyRequest deletePermissionPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePermissionPolicyRequest, DeletePermissionPolicyResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteRateBasedRule operation returned by the service.
     * @sample AWSWAFAsync.DeleteRateBasedRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/DeleteRateBasedRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRateBasedRuleResult> deleteRateBasedRuleAsync(DeleteRateBasedRuleRequest deleteRateBasedRuleRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRateBasedRule operation returned by the service.
     * @sample AWSWAFAsyncHandler.DeleteRateBasedRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/DeleteRateBasedRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRateBasedRuleResult> deleteRateBasedRuleAsync(DeleteRateBasedRuleRequest deleteRateBasedRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRateBasedRuleRequest, DeleteRateBasedRuleResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteRegexMatchSet operation returned by the service.
     * @sample AWSWAFAsync.DeleteRegexMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/DeleteRegexMatchSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRegexMatchSetResult> deleteRegexMatchSetAsync(DeleteRegexMatchSetRequest deleteRegexMatchSetRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRegexMatchSet operation returned by the service.
     * @sample AWSWAFAsyncHandler.DeleteRegexMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/DeleteRegexMatchSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRegexMatchSetResult> deleteRegexMatchSetAsync(DeleteRegexMatchSetRequest deleteRegexMatchSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRegexMatchSetRequest, DeleteRegexMatchSetResult> asyncHandler);

    /**
     * <p>
     * Permanently deletes a <a>RegexPatternSet</a>. You can't delete a <code>RegexPatternSet</code> if it's still used
     * in any <code>RegexMatchSet</code> or if the <code>RegexPatternSet</code> is not empty.
     * </p>
     * 
     * @param deleteRegexPatternSetRequest
     * @return A Java Future containing the result of the DeleteRegexPatternSet operation returned by the service.
     * @sample AWSWAFAsync.DeleteRegexPatternSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/DeleteRegexPatternSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRegexPatternSetResult> deleteRegexPatternSetAsync(DeleteRegexPatternSetRequest deleteRegexPatternSetRequest);

    /**
     * <p>
     * Permanently deletes a <a>RegexPatternSet</a>. You can't delete a <code>RegexPatternSet</code> if it's still used
     * in any <code>RegexMatchSet</code> or if the <code>RegexPatternSet</code> is not empty.
     * </p>
     * 
     * @param deleteRegexPatternSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRegexPatternSet operation returned by the service.
     * @sample AWSWAFAsyncHandler.DeleteRegexPatternSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/DeleteRegexPatternSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRegexPatternSetResult> deleteRegexPatternSetAsync(DeleteRegexPatternSetRequest deleteRegexPatternSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRegexPatternSetRequest, DeleteRegexPatternSetResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteRule operation returned by the service.
     * @sample AWSWAFAsync.DeleteRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/DeleteRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(DeleteRuleRequest deleteRuleRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRule operation returned by the service.
     * @sample AWSWAFAsyncHandler.DeleteRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/DeleteRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(DeleteRuleRequest deleteRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRuleRequest, DeleteRuleResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteRuleGroup operation returned by the service.
     * @sample AWSWAFAsync.DeleteRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/DeleteRuleGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRuleGroupResult> deleteRuleGroupAsync(DeleteRuleGroupRequest deleteRuleGroupRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRuleGroup operation returned by the service.
     * @sample AWSWAFAsyncHandler.DeleteRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/DeleteRuleGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRuleGroupResult> deleteRuleGroupAsync(DeleteRuleGroupRequest deleteRuleGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRuleGroupRequest, DeleteRuleGroupResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteSizeConstraintSet operation returned by the service.
     * @sample AWSWAFAsync.DeleteSizeConstraintSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/DeleteSizeConstraintSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSizeConstraintSetResult> deleteSizeConstraintSetAsync(DeleteSizeConstraintSetRequest deleteSizeConstraintSetRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSizeConstraintSet operation returned by the service.
     * @sample AWSWAFAsyncHandler.DeleteSizeConstraintSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/DeleteSizeConstraintSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSizeConstraintSetResult> deleteSizeConstraintSetAsync(DeleteSizeConstraintSetRequest deleteSizeConstraintSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSizeConstraintSetRequest, DeleteSizeConstraintSetResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteSqlInjectionMatchSet operation returned by the service.
     * @sample AWSWAFAsync.DeleteSqlInjectionMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/DeleteSqlInjectionMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSqlInjectionMatchSetResult> deleteSqlInjectionMatchSetAsync(
            DeleteSqlInjectionMatchSetRequest deleteSqlInjectionMatchSetRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSqlInjectionMatchSet operation returned by the service.
     * @sample AWSWAFAsyncHandler.DeleteSqlInjectionMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/DeleteSqlInjectionMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSqlInjectionMatchSetResult> deleteSqlInjectionMatchSetAsync(
            DeleteSqlInjectionMatchSetRequest deleteSqlInjectionMatchSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSqlInjectionMatchSetRequest, DeleteSqlInjectionMatchSetResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteWebACL operation returned by the service.
     * @sample AWSWAFAsync.DeleteWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/DeleteWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteWebACLResult> deleteWebACLAsync(DeleteWebACLRequest deleteWebACLRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteWebACL operation returned by the service.
     * @sample AWSWAFAsyncHandler.DeleteWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/DeleteWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteWebACLResult> deleteWebACLAsync(DeleteWebACLRequest deleteWebACLRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteWebACLRequest, DeleteWebACLResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteXssMatchSet operation returned by the service.
     * @sample AWSWAFAsync.DeleteXssMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/DeleteXssMatchSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteXssMatchSetResult> deleteXssMatchSetAsync(DeleteXssMatchSetRequest deleteXssMatchSetRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteXssMatchSet operation returned by the service.
     * @sample AWSWAFAsyncHandler.DeleteXssMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/DeleteXssMatchSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteXssMatchSetResult> deleteXssMatchSetAsync(DeleteXssMatchSetRequest deleteXssMatchSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteXssMatchSetRequest, DeleteXssMatchSetResult> asyncHandler);

    /**
     * <p>
     * Returns the <a>ByteMatchSet</a> specified by <code>ByteMatchSetId</code>.
     * </p>
     * 
     * @param getByteMatchSetRequest
     * @return A Java Future containing the result of the GetByteMatchSet operation returned by the service.
     * @sample AWSWAFAsync.GetByteMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/GetByteMatchSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetByteMatchSetResult> getByteMatchSetAsync(GetByteMatchSetRequest getByteMatchSetRequest);

    /**
     * <p>
     * Returns the <a>ByteMatchSet</a> specified by <code>ByteMatchSetId</code>.
     * </p>
     * 
     * @param getByteMatchSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetByteMatchSet operation returned by the service.
     * @sample AWSWAFAsyncHandler.GetByteMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/GetByteMatchSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetByteMatchSetResult> getByteMatchSetAsync(GetByteMatchSetRequest getByteMatchSetRequest,
            com.amazonaws.handlers.AsyncHandler<GetByteMatchSetRequest, GetByteMatchSetResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetChangeToken operation returned by the service.
     * @sample AWSWAFAsync.GetChangeToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/GetChangeToken" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetChangeTokenResult> getChangeTokenAsync(GetChangeTokenRequest getChangeTokenRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetChangeToken operation returned by the service.
     * @sample AWSWAFAsyncHandler.GetChangeToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/GetChangeToken" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetChangeTokenResult> getChangeTokenAsync(GetChangeTokenRequest getChangeTokenRequest,
            com.amazonaws.handlers.AsyncHandler<GetChangeTokenRequest, GetChangeTokenResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetChangeTokenStatus operation returned by the service.
     * @sample AWSWAFAsync.GetChangeTokenStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/GetChangeTokenStatus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetChangeTokenStatusResult> getChangeTokenStatusAsync(GetChangeTokenStatusRequest getChangeTokenStatusRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetChangeTokenStatus operation returned by the service.
     * @sample AWSWAFAsyncHandler.GetChangeTokenStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/GetChangeTokenStatus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetChangeTokenStatusResult> getChangeTokenStatusAsync(GetChangeTokenStatusRequest getChangeTokenStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetChangeTokenStatusRequest, GetChangeTokenStatusResult> asyncHandler);

    /**
     * <p>
     * Returns the <a>GeoMatchSet</a> that is specified by <code>GeoMatchSetId</code>.
     * </p>
     * 
     * @param getGeoMatchSetRequest
     * @return A Java Future containing the result of the GetGeoMatchSet operation returned by the service.
     * @sample AWSWAFAsync.GetGeoMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/GetGeoMatchSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGeoMatchSetResult> getGeoMatchSetAsync(GetGeoMatchSetRequest getGeoMatchSetRequest);

    /**
     * <p>
     * Returns the <a>GeoMatchSet</a> that is specified by <code>GeoMatchSetId</code>.
     * </p>
     * 
     * @param getGeoMatchSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGeoMatchSet operation returned by the service.
     * @sample AWSWAFAsyncHandler.GetGeoMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/GetGeoMatchSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGeoMatchSetResult> getGeoMatchSetAsync(GetGeoMatchSetRequest getGeoMatchSetRequest,
            com.amazonaws.handlers.AsyncHandler<GetGeoMatchSetRequest, GetGeoMatchSetResult> asyncHandler);

    /**
     * <p>
     * Returns the <a>IPSet</a> that is specified by <code>IPSetId</code>.
     * </p>
     * 
     * @param getIPSetRequest
     * @return A Java Future containing the result of the GetIPSet operation returned by the service.
     * @sample AWSWAFAsync.GetIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/GetIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetIPSetResult> getIPSetAsync(GetIPSetRequest getIPSetRequest);

    /**
     * <p>
     * Returns the <a>IPSet</a> that is specified by <code>IPSetId</code>.
     * </p>
     * 
     * @param getIPSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetIPSet operation returned by the service.
     * @sample AWSWAFAsyncHandler.GetIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/GetIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetIPSetResult> getIPSetAsync(GetIPSetRequest getIPSetRequest,
            com.amazonaws.handlers.AsyncHandler<GetIPSetRequest, GetIPSetResult> asyncHandler);

    /**
     * <p>
     * Returns the <a>LoggingConfiguration</a> for the specified web ACL.
     * </p>
     * 
     * @param getLoggingConfigurationRequest
     * @return A Java Future containing the result of the GetLoggingConfiguration operation returned by the service.
     * @sample AWSWAFAsync.GetLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/GetLoggingConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetLoggingConfigurationResult> getLoggingConfigurationAsync(GetLoggingConfigurationRequest getLoggingConfigurationRequest);

    /**
     * <p>
     * Returns the <a>LoggingConfiguration</a> for the specified web ACL.
     * </p>
     * 
     * @param getLoggingConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLoggingConfiguration operation returned by the service.
     * @sample AWSWAFAsyncHandler.GetLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/GetLoggingConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetLoggingConfigurationResult> getLoggingConfigurationAsync(GetLoggingConfigurationRequest getLoggingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetLoggingConfigurationRequest, GetLoggingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Returns the IAM policy attached to the RuleGroup.
     * </p>
     * 
     * @param getPermissionPolicyRequest
     * @return A Java Future containing the result of the GetPermissionPolicy operation returned by the service.
     * @sample AWSWAFAsync.GetPermissionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/GetPermissionPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPermissionPolicyResult> getPermissionPolicyAsync(GetPermissionPolicyRequest getPermissionPolicyRequest);

    /**
     * <p>
     * Returns the IAM policy attached to the RuleGroup.
     * </p>
     * 
     * @param getPermissionPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPermissionPolicy operation returned by the service.
     * @sample AWSWAFAsyncHandler.GetPermissionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/GetPermissionPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPermissionPolicyResult> getPermissionPolicyAsync(GetPermissionPolicyRequest getPermissionPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetPermissionPolicyRequest, GetPermissionPolicyResult> asyncHandler);

    /**
     * <p>
     * Returns the <a>RateBasedRule</a> that is specified by the <code>RuleId</code> that you included in the
     * <code>GetRateBasedRule</code> request.
     * </p>
     * 
     * @param getRateBasedRuleRequest
     * @return A Java Future containing the result of the GetRateBasedRule operation returned by the service.
     * @sample AWSWAFAsync.GetRateBasedRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/GetRateBasedRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRateBasedRuleResult> getRateBasedRuleAsync(GetRateBasedRuleRequest getRateBasedRuleRequest);

    /**
     * <p>
     * Returns the <a>RateBasedRule</a> that is specified by the <code>RuleId</code> that you included in the
     * <code>GetRateBasedRule</code> request.
     * </p>
     * 
     * @param getRateBasedRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRateBasedRule operation returned by the service.
     * @sample AWSWAFAsyncHandler.GetRateBasedRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/GetRateBasedRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRateBasedRuleResult> getRateBasedRuleAsync(GetRateBasedRuleRequest getRateBasedRuleRequest,
            com.amazonaws.handlers.AsyncHandler<GetRateBasedRuleRequest, GetRateBasedRuleResult> asyncHandler);

    /**
     * <p>
     * Returns an array of IP addresses currently being blocked by the <a>RateBasedRule</a> that is specified by the
     * <code>RuleId</code>. The maximum number of managed keys that will be blocked is 10,000. If more than 10,000
     * addresses exceed the rate limit, the 10,000 addresses with the highest rates will be blocked.
     * </p>
     * 
     * @param getRateBasedRuleManagedKeysRequest
     * @return A Java Future containing the result of the GetRateBasedRuleManagedKeys operation returned by the service.
     * @sample AWSWAFAsync.GetRateBasedRuleManagedKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/GetRateBasedRuleManagedKeys"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRateBasedRuleManagedKeysResult> getRateBasedRuleManagedKeysAsync(
            GetRateBasedRuleManagedKeysRequest getRateBasedRuleManagedKeysRequest);

    /**
     * <p>
     * Returns an array of IP addresses currently being blocked by the <a>RateBasedRule</a> that is specified by the
     * <code>RuleId</code>. The maximum number of managed keys that will be blocked is 10,000. If more than 10,000
     * addresses exceed the rate limit, the 10,000 addresses with the highest rates will be blocked.
     * </p>
     * 
     * @param getRateBasedRuleManagedKeysRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRateBasedRuleManagedKeys operation returned by the service.
     * @sample AWSWAFAsyncHandler.GetRateBasedRuleManagedKeys
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/GetRateBasedRuleManagedKeys"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRateBasedRuleManagedKeysResult> getRateBasedRuleManagedKeysAsync(
            GetRateBasedRuleManagedKeysRequest getRateBasedRuleManagedKeysRequest,
            com.amazonaws.handlers.AsyncHandler<GetRateBasedRuleManagedKeysRequest, GetRateBasedRuleManagedKeysResult> asyncHandler);

    /**
     * <p>
     * Returns the <a>RegexMatchSet</a> specified by <code>RegexMatchSetId</code>.
     * </p>
     * 
     * @param getRegexMatchSetRequest
     * @return A Java Future containing the result of the GetRegexMatchSet operation returned by the service.
     * @sample AWSWAFAsync.GetRegexMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/GetRegexMatchSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRegexMatchSetResult> getRegexMatchSetAsync(GetRegexMatchSetRequest getRegexMatchSetRequest);

    /**
     * <p>
     * Returns the <a>RegexMatchSet</a> specified by <code>RegexMatchSetId</code>.
     * </p>
     * 
     * @param getRegexMatchSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRegexMatchSet operation returned by the service.
     * @sample AWSWAFAsyncHandler.GetRegexMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/GetRegexMatchSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRegexMatchSetResult> getRegexMatchSetAsync(GetRegexMatchSetRequest getRegexMatchSetRequest,
            com.amazonaws.handlers.AsyncHandler<GetRegexMatchSetRequest, GetRegexMatchSetResult> asyncHandler);

    /**
     * <p>
     * Returns the <a>RegexPatternSet</a> specified by <code>RegexPatternSetId</code>.
     * </p>
     * 
     * @param getRegexPatternSetRequest
     * @return A Java Future containing the result of the GetRegexPatternSet operation returned by the service.
     * @sample AWSWAFAsync.GetRegexPatternSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/GetRegexPatternSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRegexPatternSetResult> getRegexPatternSetAsync(GetRegexPatternSetRequest getRegexPatternSetRequest);

    /**
     * <p>
     * Returns the <a>RegexPatternSet</a> specified by <code>RegexPatternSetId</code>.
     * </p>
     * 
     * @param getRegexPatternSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRegexPatternSet operation returned by the service.
     * @sample AWSWAFAsyncHandler.GetRegexPatternSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/GetRegexPatternSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRegexPatternSetResult> getRegexPatternSetAsync(GetRegexPatternSetRequest getRegexPatternSetRequest,
            com.amazonaws.handlers.AsyncHandler<GetRegexPatternSetRequest, GetRegexPatternSetResult> asyncHandler);

    /**
     * <p>
     * Returns the <a>Rule</a> that is specified by the <code>RuleId</code> that you included in the
     * <code>GetRule</code> request.
     * </p>
     * 
     * @param getRuleRequest
     * @return A Java Future containing the result of the GetRule operation returned by the service.
     * @sample AWSWAFAsync.GetRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/GetRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRuleResult> getRuleAsync(GetRuleRequest getRuleRequest);

    /**
     * <p>
     * Returns the <a>Rule</a> that is specified by the <code>RuleId</code> that you included in the
     * <code>GetRule</code> request.
     * </p>
     * 
     * @param getRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRule operation returned by the service.
     * @sample AWSWAFAsyncHandler.GetRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/GetRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRuleResult> getRuleAsync(GetRuleRequest getRuleRequest,
            com.amazonaws.handlers.AsyncHandler<GetRuleRequest, GetRuleResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetRuleGroup operation returned by the service.
     * @sample AWSWAFAsync.GetRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/GetRuleGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRuleGroupResult> getRuleGroupAsync(GetRuleGroupRequest getRuleGroupRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRuleGroup operation returned by the service.
     * @sample AWSWAFAsyncHandler.GetRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/GetRuleGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetRuleGroupResult> getRuleGroupAsync(GetRuleGroupRequest getRuleGroupRequest,
            com.amazonaws.handlers.AsyncHandler<GetRuleGroupRequest, GetRuleGroupResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetSampledRequests operation returned by the service.
     * @sample AWSWAFAsync.GetSampledRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/GetSampledRequests" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSampledRequestsResult> getSampledRequestsAsync(GetSampledRequestsRequest getSampledRequestsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSampledRequests operation returned by the service.
     * @sample AWSWAFAsyncHandler.GetSampledRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/GetSampledRequests" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSampledRequestsResult> getSampledRequestsAsync(GetSampledRequestsRequest getSampledRequestsRequest,
            com.amazonaws.handlers.AsyncHandler<GetSampledRequestsRequest, GetSampledRequestsResult> asyncHandler);

    /**
     * <p>
     * Returns the <a>SizeConstraintSet</a> specified by <code>SizeConstraintSetId</code>.
     * </p>
     * 
     * @param getSizeConstraintSetRequest
     * @return A Java Future containing the result of the GetSizeConstraintSet operation returned by the service.
     * @sample AWSWAFAsync.GetSizeConstraintSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/GetSizeConstraintSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSizeConstraintSetResult> getSizeConstraintSetAsync(GetSizeConstraintSetRequest getSizeConstraintSetRequest);

    /**
     * <p>
     * Returns the <a>SizeConstraintSet</a> specified by <code>SizeConstraintSetId</code>.
     * </p>
     * 
     * @param getSizeConstraintSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSizeConstraintSet operation returned by the service.
     * @sample AWSWAFAsyncHandler.GetSizeConstraintSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/GetSizeConstraintSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSizeConstraintSetResult> getSizeConstraintSetAsync(GetSizeConstraintSetRequest getSizeConstraintSetRequest,
            com.amazonaws.handlers.AsyncHandler<GetSizeConstraintSetRequest, GetSizeConstraintSetResult> asyncHandler);

    /**
     * <p>
     * Returns the <a>SqlInjectionMatchSet</a> that is specified by <code>SqlInjectionMatchSetId</code>.
     * </p>
     * 
     * @param getSqlInjectionMatchSetRequest
     *        A request to get a <a>SqlInjectionMatchSet</a>.
     * @return A Java Future containing the result of the GetSqlInjectionMatchSet operation returned by the service.
     * @sample AWSWAFAsync.GetSqlInjectionMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/GetSqlInjectionMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSqlInjectionMatchSetResult> getSqlInjectionMatchSetAsync(GetSqlInjectionMatchSetRequest getSqlInjectionMatchSetRequest);

    /**
     * <p>
     * Returns the <a>SqlInjectionMatchSet</a> that is specified by <code>SqlInjectionMatchSetId</code>.
     * </p>
     * 
     * @param getSqlInjectionMatchSetRequest
     *        A request to get a <a>SqlInjectionMatchSet</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSqlInjectionMatchSet operation returned by the service.
     * @sample AWSWAFAsyncHandler.GetSqlInjectionMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/GetSqlInjectionMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSqlInjectionMatchSetResult> getSqlInjectionMatchSetAsync(GetSqlInjectionMatchSetRequest getSqlInjectionMatchSetRequest,
            com.amazonaws.handlers.AsyncHandler<GetSqlInjectionMatchSetRequest, GetSqlInjectionMatchSetResult> asyncHandler);

    /**
     * <p>
     * Returns the <a>WebACL</a> that is specified by <code>WebACLId</code>.
     * </p>
     * 
     * @param getWebACLRequest
     * @return A Java Future containing the result of the GetWebACL operation returned by the service.
     * @sample AWSWAFAsync.GetWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/GetWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetWebACLResult> getWebACLAsync(GetWebACLRequest getWebACLRequest);

    /**
     * <p>
     * Returns the <a>WebACL</a> that is specified by <code>WebACLId</code>.
     * </p>
     * 
     * @param getWebACLRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetWebACL operation returned by the service.
     * @sample AWSWAFAsyncHandler.GetWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/GetWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetWebACLResult> getWebACLAsync(GetWebACLRequest getWebACLRequest,
            com.amazonaws.handlers.AsyncHandler<GetWebACLRequest, GetWebACLResult> asyncHandler);

    /**
     * <p>
     * Returns the <a>XssMatchSet</a> that is specified by <code>XssMatchSetId</code>.
     * </p>
     * 
     * @param getXssMatchSetRequest
     *        A request to get an <a>XssMatchSet</a>.
     * @return A Java Future containing the result of the GetXssMatchSet operation returned by the service.
     * @sample AWSWAFAsync.GetXssMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/GetXssMatchSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetXssMatchSetResult> getXssMatchSetAsync(GetXssMatchSetRequest getXssMatchSetRequest);

    /**
     * <p>
     * Returns the <a>XssMatchSet</a> that is specified by <code>XssMatchSetId</code>.
     * </p>
     * 
     * @param getXssMatchSetRequest
     *        A request to get an <a>XssMatchSet</a>.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetXssMatchSet operation returned by the service.
     * @sample AWSWAFAsyncHandler.GetXssMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/GetXssMatchSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetXssMatchSetResult> getXssMatchSetAsync(GetXssMatchSetRequest getXssMatchSetRequest,
            com.amazonaws.handlers.AsyncHandler<GetXssMatchSetRequest, GetXssMatchSetResult> asyncHandler);

    /**
     * <p>
     * Returns an array of <a>ActivatedRule</a> objects.
     * </p>
     * 
     * @param listActivatedRulesInRuleGroupRequest
     * @return A Java Future containing the result of the ListActivatedRulesInRuleGroup operation returned by the
     *         service.
     * @sample AWSWAFAsync.ListActivatedRulesInRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/ListActivatedRulesInRuleGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListActivatedRulesInRuleGroupResult> listActivatedRulesInRuleGroupAsync(
            ListActivatedRulesInRuleGroupRequest listActivatedRulesInRuleGroupRequest);

    /**
     * <p>
     * Returns an array of <a>ActivatedRule</a> objects.
     * </p>
     * 
     * @param listActivatedRulesInRuleGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListActivatedRulesInRuleGroup operation returned by the
     *         service.
     * @sample AWSWAFAsyncHandler.ListActivatedRulesInRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/ListActivatedRulesInRuleGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListActivatedRulesInRuleGroupResult> listActivatedRulesInRuleGroupAsync(
            ListActivatedRulesInRuleGroupRequest listActivatedRulesInRuleGroupRequest,
            com.amazonaws.handlers.AsyncHandler<ListActivatedRulesInRuleGroupRequest, ListActivatedRulesInRuleGroupResult> asyncHandler);

    /**
     * <p>
     * Returns an array of <a>ByteMatchSetSummary</a> objects.
     * </p>
     * 
     * @param listByteMatchSetsRequest
     * @return A Java Future containing the result of the ListByteMatchSets operation returned by the service.
     * @sample AWSWAFAsync.ListByteMatchSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/ListByteMatchSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListByteMatchSetsResult> listByteMatchSetsAsync(ListByteMatchSetsRequest listByteMatchSetsRequest);

    /**
     * <p>
     * Returns an array of <a>ByteMatchSetSummary</a> objects.
     * </p>
     * 
     * @param listByteMatchSetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListByteMatchSets operation returned by the service.
     * @sample AWSWAFAsyncHandler.ListByteMatchSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/ListByteMatchSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListByteMatchSetsResult> listByteMatchSetsAsync(ListByteMatchSetsRequest listByteMatchSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListByteMatchSetsRequest, ListByteMatchSetsResult> asyncHandler);

    /**
     * <p>
     * Returns an array of <a>GeoMatchSetSummary</a> objects in the response.
     * </p>
     * 
     * @param listGeoMatchSetsRequest
     * @return A Java Future containing the result of the ListGeoMatchSets operation returned by the service.
     * @sample AWSWAFAsync.ListGeoMatchSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/ListGeoMatchSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGeoMatchSetsResult> listGeoMatchSetsAsync(ListGeoMatchSetsRequest listGeoMatchSetsRequest);

    /**
     * <p>
     * Returns an array of <a>GeoMatchSetSummary</a> objects in the response.
     * </p>
     * 
     * @param listGeoMatchSetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGeoMatchSets operation returned by the service.
     * @sample AWSWAFAsyncHandler.ListGeoMatchSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/ListGeoMatchSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGeoMatchSetsResult> listGeoMatchSetsAsync(ListGeoMatchSetsRequest listGeoMatchSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListGeoMatchSetsRequest, ListGeoMatchSetsResult> asyncHandler);

    /**
     * <p>
     * Returns an array of <a>IPSetSummary</a> objects in the response.
     * </p>
     * 
     * @param listIPSetsRequest
     * @return A Java Future containing the result of the ListIPSets operation returned by the service.
     * @sample AWSWAFAsync.ListIPSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/ListIPSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListIPSetsResult> listIPSetsAsync(ListIPSetsRequest listIPSetsRequest);

    /**
     * <p>
     * Returns an array of <a>IPSetSummary</a> objects in the response.
     * </p>
     * 
     * @param listIPSetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListIPSets operation returned by the service.
     * @sample AWSWAFAsyncHandler.ListIPSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/ListIPSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListIPSetsResult> listIPSetsAsync(ListIPSetsRequest listIPSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListIPSetsRequest, ListIPSetsResult> asyncHandler);

    /**
     * <p>
     * Returns an array of <a>LoggingConfiguration</a> objects.
     * </p>
     * 
     * @param listLoggingConfigurationsRequest
     * @return A Java Future containing the result of the ListLoggingConfigurations operation returned by the service.
     * @sample AWSWAFAsync.ListLoggingConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/ListLoggingConfigurations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListLoggingConfigurationsResult> listLoggingConfigurationsAsync(
            ListLoggingConfigurationsRequest listLoggingConfigurationsRequest);

    /**
     * <p>
     * Returns an array of <a>LoggingConfiguration</a> objects.
     * </p>
     * 
     * @param listLoggingConfigurationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLoggingConfigurations operation returned by the service.
     * @sample AWSWAFAsyncHandler.ListLoggingConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/ListLoggingConfigurations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListLoggingConfigurationsResult> listLoggingConfigurationsAsync(
            ListLoggingConfigurationsRequest listLoggingConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListLoggingConfigurationsRequest, ListLoggingConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Returns an array of <a>RuleSummary</a> objects.
     * </p>
     * 
     * @param listRateBasedRulesRequest
     * @return A Java Future containing the result of the ListRateBasedRules operation returned by the service.
     * @sample AWSWAFAsync.ListRateBasedRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/ListRateBasedRules" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRateBasedRulesResult> listRateBasedRulesAsync(ListRateBasedRulesRequest listRateBasedRulesRequest);

    /**
     * <p>
     * Returns an array of <a>RuleSummary</a> objects.
     * </p>
     * 
     * @param listRateBasedRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRateBasedRules operation returned by the service.
     * @sample AWSWAFAsyncHandler.ListRateBasedRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/ListRateBasedRules" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRateBasedRulesResult> listRateBasedRulesAsync(ListRateBasedRulesRequest listRateBasedRulesRequest,
            com.amazonaws.handlers.AsyncHandler<ListRateBasedRulesRequest, ListRateBasedRulesResult> asyncHandler);

    /**
     * <p>
     * Returns an array of <a>RegexMatchSetSummary</a> objects.
     * </p>
     * 
     * @param listRegexMatchSetsRequest
     * @return A Java Future containing the result of the ListRegexMatchSets operation returned by the service.
     * @sample AWSWAFAsync.ListRegexMatchSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/ListRegexMatchSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRegexMatchSetsResult> listRegexMatchSetsAsync(ListRegexMatchSetsRequest listRegexMatchSetsRequest);

    /**
     * <p>
     * Returns an array of <a>RegexMatchSetSummary</a> objects.
     * </p>
     * 
     * @param listRegexMatchSetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRegexMatchSets operation returned by the service.
     * @sample AWSWAFAsyncHandler.ListRegexMatchSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/ListRegexMatchSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRegexMatchSetsResult> listRegexMatchSetsAsync(ListRegexMatchSetsRequest listRegexMatchSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRegexMatchSetsRequest, ListRegexMatchSetsResult> asyncHandler);

    /**
     * <p>
     * Returns an array of <a>RegexPatternSetSummary</a> objects.
     * </p>
     * 
     * @param listRegexPatternSetsRequest
     * @return A Java Future containing the result of the ListRegexPatternSets operation returned by the service.
     * @sample AWSWAFAsync.ListRegexPatternSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/ListRegexPatternSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRegexPatternSetsResult> listRegexPatternSetsAsync(ListRegexPatternSetsRequest listRegexPatternSetsRequest);

    /**
     * <p>
     * Returns an array of <a>RegexPatternSetSummary</a> objects.
     * </p>
     * 
     * @param listRegexPatternSetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRegexPatternSets operation returned by the service.
     * @sample AWSWAFAsyncHandler.ListRegexPatternSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/ListRegexPatternSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRegexPatternSetsResult> listRegexPatternSetsAsync(ListRegexPatternSetsRequest listRegexPatternSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRegexPatternSetsRequest, ListRegexPatternSetsResult> asyncHandler);

    /**
     * <p>
     * Returns an array of <a>RuleGroup</a> objects.
     * </p>
     * 
     * @param listRuleGroupsRequest
     * @return A Java Future containing the result of the ListRuleGroups operation returned by the service.
     * @sample AWSWAFAsync.ListRuleGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/ListRuleGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRuleGroupsResult> listRuleGroupsAsync(ListRuleGroupsRequest listRuleGroupsRequest);

    /**
     * <p>
     * Returns an array of <a>RuleGroup</a> objects.
     * </p>
     * 
     * @param listRuleGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRuleGroups operation returned by the service.
     * @sample AWSWAFAsyncHandler.ListRuleGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/ListRuleGroups" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRuleGroupsResult> listRuleGroupsAsync(ListRuleGroupsRequest listRuleGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRuleGroupsRequest, ListRuleGroupsResult> asyncHandler);

    /**
     * <p>
     * Returns an array of <a>RuleSummary</a> objects.
     * </p>
     * 
     * @param listRulesRequest
     * @return A Java Future containing the result of the ListRules operation returned by the service.
     * @sample AWSWAFAsync.ListRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/ListRules" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRulesResult> listRulesAsync(ListRulesRequest listRulesRequest);

    /**
     * <p>
     * Returns an array of <a>RuleSummary</a> objects.
     * </p>
     * 
     * @param listRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRules operation returned by the service.
     * @sample AWSWAFAsyncHandler.ListRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/ListRules" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRulesResult> listRulesAsync(ListRulesRequest listRulesRequest,
            com.amazonaws.handlers.AsyncHandler<ListRulesRequest, ListRulesResult> asyncHandler);

    /**
     * <p>
     * Returns an array of <a>SizeConstraintSetSummary</a> objects.
     * </p>
     * 
     * @param listSizeConstraintSetsRequest
     * @return A Java Future containing the result of the ListSizeConstraintSets operation returned by the service.
     * @sample AWSWAFAsync.ListSizeConstraintSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/ListSizeConstraintSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSizeConstraintSetsResult> listSizeConstraintSetsAsync(ListSizeConstraintSetsRequest listSizeConstraintSetsRequest);

    /**
     * <p>
     * Returns an array of <a>SizeConstraintSetSummary</a> objects.
     * </p>
     * 
     * @param listSizeConstraintSetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSizeConstraintSets operation returned by the service.
     * @sample AWSWAFAsyncHandler.ListSizeConstraintSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/ListSizeConstraintSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSizeConstraintSetsResult> listSizeConstraintSetsAsync(ListSizeConstraintSetsRequest listSizeConstraintSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSizeConstraintSetsRequest, ListSizeConstraintSetsResult> asyncHandler);

    /**
     * <p>
     * Returns an array of <a>SqlInjectionMatchSet</a> objects.
     * </p>
     * 
     * @param listSqlInjectionMatchSetsRequest
     *        A request to list the <a>SqlInjectionMatchSet</a> objects created by the current AWS account.
     * @return A Java Future containing the result of the ListSqlInjectionMatchSets operation returned by the service.
     * @sample AWSWAFAsync.ListSqlInjectionMatchSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/ListSqlInjectionMatchSets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSqlInjectionMatchSetsResult> listSqlInjectionMatchSetsAsync(
            ListSqlInjectionMatchSetsRequest listSqlInjectionMatchSetsRequest);

    /**
     * <p>
     * Returns an array of <a>SqlInjectionMatchSet</a> objects.
     * </p>
     * 
     * @param listSqlInjectionMatchSetsRequest
     *        A request to list the <a>SqlInjectionMatchSet</a> objects created by the current AWS account.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSqlInjectionMatchSets operation returned by the service.
     * @sample AWSWAFAsyncHandler.ListSqlInjectionMatchSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/ListSqlInjectionMatchSets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSqlInjectionMatchSetsResult> listSqlInjectionMatchSetsAsync(
            ListSqlInjectionMatchSetsRequest listSqlInjectionMatchSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSqlInjectionMatchSetsRequest, ListSqlInjectionMatchSetsResult> asyncHandler);

    /**
     * <p>
     * Returns an array of <a>RuleGroup</a> objects that you are subscribed to.
     * </p>
     * 
     * @param listSubscribedRuleGroupsRequest
     * @return A Java Future containing the result of the ListSubscribedRuleGroups operation returned by the service.
     * @sample AWSWAFAsync.ListSubscribedRuleGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/ListSubscribedRuleGroups" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSubscribedRuleGroupsResult> listSubscribedRuleGroupsAsync(ListSubscribedRuleGroupsRequest listSubscribedRuleGroupsRequest);

    /**
     * <p>
     * Returns an array of <a>RuleGroup</a> objects that you are subscribed to.
     * </p>
     * 
     * @param listSubscribedRuleGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSubscribedRuleGroups operation returned by the service.
     * @sample AWSWAFAsyncHandler.ListSubscribedRuleGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/ListSubscribedRuleGroups" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSubscribedRuleGroupsResult> listSubscribedRuleGroupsAsync(ListSubscribedRuleGroupsRequest listSubscribedRuleGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSubscribedRuleGroupsRequest, ListSubscribedRuleGroupsResult> asyncHandler);

    /**
     * <p>
     * Returns an array of <a>WebACLSummary</a> objects in the response.
     * </p>
     * 
     * @param listWebACLsRequest
     * @return A Java Future containing the result of the ListWebACLs operation returned by the service.
     * @sample AWSWAFAsync.ListWebACLs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/ListWebACLs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListWebACLsResult> listWebACLsAsync(ListWebACLsRequest listWebACLsRequest);

    /**
     * <p>
     * Returns an array of <a>WebACLSummary</a> objects in the response.
     * </p>
     * 
     * @param listWebACLsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListWebACLs operation returned by the service.
     * @sample AWSWAFAsyncHandler.ListWebACLs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/ListWebACLs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListWebACLsResult> listWebACLsAsync(ListWebACLsRequest listWebACLsRequest,
            com.amazonaws.handlers.AsyncHandler<ListWebACLsRequest, ListWebACLsResult> asyncHandler);

    /**
     * <p>
     * Returns an array of <a>XssMatchSet</a> objects.
     * </p>
     * 
     * @param listXssMatchSetsRequest
     *        A request to list the <a>XssMatchSet</a> objects created by the current AWS account.
     * @return A Java Future containing the result of the ListXssMatchSets operation returned by the service.
     * @sample AWSWAFAsync.ListXssMatchSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/ListXssMatchSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListXssMatchSetsResult> listXssMatchSetsAsync(ListXssMatchSetsRequest listXssMatchSetsRequest);

    /**
     * <p>
     * Returns an array of <a>XssMatchSet</a> objects.
     * </p>
     * 
     * @param listXssMatchSetsRequest
     *        A request to list the <a>XssMatchSet</a> objects created by the current AWS account.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListXssMatchSets operation returned by the service.
     * @sample AWSWAFAsyncHandler.ListXssMatchSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/ListXssMatchSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListXssMatchSetsResult> listXssMatchSetsAsync(ListXssMatchSetsRequest listXssMatchSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListXssMatchSetsRequest, ListXssMatchSetsResult> asyncHandler);

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
     * @return A Java Future containing the result of the PutLoggingConfiguration operation returned by the service.
     * @sample AWSWAFAsync.PutLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/PutLoggingConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutLoggingConfigurationResult> putLoggingConfigurationAsync(PutLoggingConfigurationRequest putLoggingConfigurationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutLoggingConfiguration operation returned by the service.
     * @sample AWSWAFAsyncHandler.PutLoggingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/PutLoggingConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutLoggingConfigurationResult> putLoggingConfigurationAsync(PutLoggingConfigurationRequest putLoggingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<PutLoggingConfigurationRequest, PutLoggingConfigurationResult> asyncHandler);

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
     * @return A Java Future containing the result of the PutPermissionPolicy operation returned by the service.
     * @sample AWSWAFAsync.PutPermissionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/PutPermissionPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutPermissionPolicyResult> putPermissionPolicyAsync(PutPermissionPolicyRequest putPermissionPolicyRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutPermissionPolicy operation returned by the service.
     * @sample AWSWAFAsyncHandler.PutPermissionPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/PutPermissionPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutPermissionPolicyResult> putPermissionPolicyAsync(PutPermissionPolicyRequest putPermissionPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutPermissionPolicyRequest, PutPermissionPolicyResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateByteMatchSet operation returned by the service.
     * @sample AWSWAFAsync.UpdateByteMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/UpdateByteMatchSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateByteMatchSetResult> updateByteMatchSetAsync(UpdateByteMatchSetRequest updateByteMatchSetRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateByteMatchSet operation returned by the service.
     * @sample AWSWAFAsyncHandler.UpdateByteMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/UpdateByteMatchSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateByteMatchSetResult> updateByteMatchSetAsync(UpdateByteMatchSetRequest updateByteMatchSetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateByteMatchSetRequest, UpdateByteMatchSetResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateGeoMatchSet operation returned by the service.
     * @sample AWSWAFAsync.UpdateGeoMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/UpdateGeoMatchSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateGeoMatchSetResult> updateGeoMatchSetAsync(UpdateGeoMatchSetRequest updateGeoMatchSetRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateGeoMatchSet operation returned by the service.
     * @sample AWSWAFAsyncHandler.UpdateGeoMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/UpdateGeoMatchSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateGeoMatchSetResult> updateGeoMatchSetAsync(UpdateGeoMatchSetRequest updateGeoMatchSetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGeoMatchSetRequest, UpdateGeoMatchSetResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateIPSet operation returned by the service.
     * @sample AWSWAFAsync.UpdateIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/UpdateIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateIPSetResult> updateIPSetAsync(UpdateIPSetRequest updateIPSetRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateIPSet operation returned by the service.
     * @sample AWSWAFAsyncHandler.UpdateIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/UpdateIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateIPSetResult> updateIPSetAsync(UpdateIPSetRequest updateIPSetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateIPSetRequest, UpdateIPSetResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateRateBasedRule operation returned by the service.
     * @sample AWSWAFAsync.UpdateRateBasedRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/UpdateRateBasedRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRateBasedRuleResult> updateRateBasedRuleAsync(UpdateRateBasedRuleRequest updateRateBasedRuleRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRateBasedRule operation returned by the service.
     * @sample AWSWAFAsyncHandler.UpdateRateBasedRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/UpdateRateBasedRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRateBasedRuleResult> updateRateBasedRuleAsync(UpdateRateBasedRuleRequest updateRateBasedRuleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRateBasedRuleRequest, UpdateRateBasedRuleResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateRegexMatchSet operation returned by the service.
     * @sample AWSWAFAsync.UpdateRegexMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/UpdateRegexMatchSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRegexMatchSetResult> updateRegexMatchSetAsync(UpdateRegexMatchSetRequest updateRegexMatchSetRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRegexMatchSet operation returned by the service.
     * @sample AWSWAFAsyncHandler.UpdateRegexMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/UpdateRegexMatchSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRegexMatchSetResult> updateRegexMatchSetAsync(UpdateRegexMatchSetRequest updateRegexMatchSetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRegexMatchSetRequest, UpdateRegexMatchSetResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateRegexPatternSet operation returned by the service.
     * @sample AWSWAFAsync.UpdateRegexPatternSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/UpdateRegexPatternSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRegexPatternSetResult> updateRegexPatternSetAsync(UpdateRegexPatternSetRequest updateRegexPatternSetRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRegexPatternSet operation returned by the service.
     * @sample AWSWAFAsyncHandler.UpdateRegexPatternSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/UpdateRegexPatternSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRegexPatternSetResult> updateRegexPatternSetAsync(UpdateRegexPatternSetRequest updateRegexPatternSetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRegexPatternSetRequest, UpdateRegexPatternSetResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateRule operation returned by the service.
     * @sample AWSWAFAsync.UpdateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/UpdateRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRuleResult> updateRuleAsync(UpdateRuleRequest updateRuleRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRule operation returned by the service.
     * @sample AWSWAFAsyncHandler.UpdateRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/UpdateRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRuleResult> updateRuleAsync(UpdateRuleRequest updateRuleRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRuleRequest, UpdateRuleResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateRuleGroup operation returned by the service.
     * @sample AWSWAFAsync.UpdateRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/UpdateRuleGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRuleGroupResult> updateRuleGroupAsync(UpdateRuleGroupRequest updateRuleGroupRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRuleGroup operation returned by the service.
     * @sample AWSWAFAsyncHandler.UpdateRuleGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/UpdateRuleGroup" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateRuleGroupResult> updateRuleGroupAsync(UpdateRuleGroupRequest updateRuleGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRuleGroupRequest, UpdateRuleGroupResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateSizeConstraintSet operation returned by the service.
     * @sample AWSWAFAsync.UpdateSizeConstraintSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/UpdateSizeConstraintSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSizeConstraintSetResult> updateSizeConstraintSetAsync(UpdateSizeConstraintSetRequest updateSizeConstraintSetRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSizeConstraintSet operation returned by the service.
     * @sample AWSWAFAsyncHandler.UpdateSizeConstraintSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/UpdateSizeConstraintSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSizeConstraintSetResult> updateSizeConstraintSetAsync(UpdateSizeConstraintSetRequest updateSizeConstraintSetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSizeConstraintSetRequest, UpdateSizeConstraintSetResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateSqlInjectionMatchSet operation returned by the service.
     * @sample AWSWAFAsync.UpdateSqlInjectionMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/UpdateSqlInjectionMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSqlInjectionMatchSetResult> updateSqlInjectionMatchSetAsync(
            UpdateSqlInjectionMatchSetRequest updateSqlInjectionMatchSetRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSqlInjectionMatchSet operation returned by the service.
     * @sample AWSWAFAsyncHandler.UpdateSqlInjectionMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/UpdateSqlInjectionMatchSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSqlInjectionMatchSetResult> updateSqlInjectionMatchSetAsync(
            UpdateSqlInjectionMatchSetRequest updateSqlInjectionMatchSetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSqlInjectionMatchSetRequest, UpdateSqlInjectionMatchSetResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateWebACL operation returned by the service.
     * @sample AWSWAFAsync.UpdateWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/UpdateWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateWebACLResult> updateWebACLAsync(UpdateWebACLRequest updateWebACLRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateWebACL operation returned by the service.
     * @sample AWSWAFAsyncHandler.UpdateWebACL
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/UpdateWebACL" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateWebACLResult> updateWebACLAsync(UpdateWebACLRequest updateWebACLRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateWebACLRequest, UpdateWebACLResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateXssMatchSet operation returned by the service.
     * @sample AWSWAFAsync.UpdateXssMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/UpdateXssMatchSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateXssMatchSetResult> updateXssMatchSetAsync(UpdateXssMatchSetRequest updateXssMatchSetRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateXssMatchSet operation returned by the service.
     * @sample AWSWAFAsyncHandler.UpdateXssMatchSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-2015-08-24/UpdateXssMatchSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateXssMatchSetResult> updateXssMatchSetAsync(UpdateXssMatchSetRequest updateXssMatchSetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateXssMatchSetRequest, UpdateXssMatchSetResult> asyncHandler);

}
