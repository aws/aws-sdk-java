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
package com.amazonaws.services.cloudfront;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.services.cloudfront.waiters.AmazonCloudFrontWaiters;

/**
 * Interface for accessing CloudFront.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cloudfront.AbstractAmazonCloudFront} instead.
 * </p>
 * <p>
 * <fullname>Amazon CloudFront</fullname>
 * <p>
 * This is the <i>Amazon CloudFront API Reference</i>. This guide is for developers who need detailed information about
 * the CloudFront API actions, data types, and errors. For detailed information about CloudFront features and their
 * associated API calls, see the <i>Amazon CloudFront Developer Guide</i>.
 * </p>
 */
public interface AmazonCloudFront {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "cloudfront";

    /**
     * Overrides the default endpoint for this client ("https://cloudfront.amazonaws.com/"). Callers can use this method
     * to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "cloudfront.amazonaws.com/") or a full URL, including the protocol
     * (ex: "https://cloudfront.amazonaws.com/"). If the protocol is not specified here, the default protocol from this
     * client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a
     * href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "cloudfront.amazonaws.com/") or a full URL, including the protocol (ex:
     *        "https://cloudfront.amazonaws.com/") of the region specific AWS endpoint this client will communicate
     *        with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonCloudFront#setEndpoint(String)}, sets the regional endpoint for this client's
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
     */
    void setRegion(Region region);

    /**
     * <p>
     * Creates a new origin access identity. If you're using Amazon S3 for your origin, you can use an origin access
     * identity to require users to access your content using a CloudFront URL instead of the Amazon S3 URL. For more
     * information about how to use origin access identities, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html">Serving Private
     * Content through CloudFront</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param createCloudFrontOriginAccessIdentityRequest
     *        The request to create a new origin access identity.
     * @return Result of the CreateCloudFrontOriginAccessIdentity operation returned by the service.
     * @throws CloudFrontOriginAccessIdentityAlreadyExistsException
     *         If the <code>CallerReference</code> is a value you already sent in a previous request to create an
     *         identity but the content of the <code>CloudFrontOriginAccessIdentityConfig</code> is different from the
     *         original request, CloudFront returns a <code>CloudFrontOriginAccessIdentityAlreadyExists</code> error.
     * @throws MissingBodyException
     *         This operation requires a body. Ensure that the body is present and the Content-Type header is set.
     * @throws TooManyCloudFrontOriginAccessIdentitiesException
     *         Processing your request would cause you to exceed the maximum number of origin access identities allowed.
     * @throws InvalidArgumentException
     *         The argument is invalid.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> do not match.
     * @sample AmazonCloudFront.CreateCloudFrontOriginAccessIdentity
     */
    CreateCloudFrontOriginAccessIdentityResult createCloudFrontOriginAccessIdentity(
            CreateCloudFrontOriginAccessIdentityRequest createCloudFrontOriginAccessIdentityRequest);

    /**
     * <p>
     * Creates a new web distribution. Send a <code>GET</code> request to the
     * <code>/<i>CloudFront API version</i>/distribution</code>/<code>distribution ID</code> resource.
     * </p>
     * 
     * @param createDistributionRequest
     *        The request to create a new distribution.
     * @return Result of the CreateDistribution operation returned by the service.
     * @throws CNAMEAlreadyExistsException
     * @throws DistributionAlreadyExistsException
     *         The caller reference you attempted to create the distribution with is associated with another
     *         distribution.
     * @throws InvalidOriginException
     *         The Amazon S3 origin server specified does not refer to a valid Amazon S3 bucket.
     * @throws InvalidOriginAccessIdentityException
     *         The origin access identity is not valid or doesn't exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws TooManyTrustedSignersException
     *         Your request contains more trusted signers than are allowed per distribution.
     * @throws TrustedSignerDoesNotExistException
     *         One or more of your trusted signers do not exist.
     * @throws InvalidViewerCertificateException
     * @throws InvalidMinimumProtocolVersionException
     * @throws MissingBodyException
     *         This operation requires a body. Ensure that the body is present and the Content-Type header is set.
     * @throws TooManyDistributionCNAMEsException
     *         Your request contains more CNAMEs than are allowed per distribution.
     * @throws TooManyDistributionsException
     *         Processing your request would cause you to exceed the maximum number of distributions allowed.
     * @throws InvalidDefaultRootObjectException
     *         The default root object file name is too big or contains an invalid character.
     * @throws InvalidRelativePathException
     *         The relative path is too big, is not URL-encoded, or does not begin with a slash (/).
     * @throws InvalidErrorCodeException
     * @throws InvalidResponseCodeException
     * @throws InvalidArgumentException
     *         The argument is invalid.
     * @throws InvalidRequiredProtocolException
     *         This operation requires the HTTPS protocol. Ensure that you specify the HTTPS protocol in your request,
     *         or omit the <code>RequiredProtocols</code> element from your distribution configuration.
     * @throws NoSuchOriginException
     *         No origin exists with the specified <code>Origin Id</code>.
     * @throws TooManyOriginsException
     *         You cannot create more origins for the distribution.
     * @throws TooManyCacheBehaviorsException
     *         You cannot create more cache behaviors for the distribution.
     * @throws TooManyCookieNamesInWhiteListException
     *         Your request contains more cookie names in the whitelist than are allowed per cache behavior.
     * @throws InvalidForwardCookiesException
     *         Your request contains forward cookies option which doesn't match with the expectation for the
     *         <code>whitelisted</code> list of cookie names. Either list of cookie names has been specified when not
     *         allowed or list of cookie names is missing when expected.
     * @throws TooManyHeadersInForwardedValuesException
     * @throws InvalidHeadersForS3OriginException
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> do not match.
     * @throws TooManyCertificatesException
     *         You cannot create anymore custom SSL/TLS certificates.
     * @throws InvalidLocationCodeException
     * @throws InvalidGeoRestrictionParameterException
     * @throws InvalidProtocolSettingsException
     *         You cannot specify SSLv3 as the minimum protocol version if you only want to support only clients that
     *         support Server Name Indication (SNI).
     * @throws InvalidTTLOrderException
     * @throws InvalidWebACLIdException
     * @throws TooManyOriginCustomHeadersException
     * @throws TooManyQueryStringParametersException
     * @throws InvalidQueryStringParametersException
     * @sample AmazonCloudFront.CreateDistribution
     */
    CreateDistributionResult createDistribution(CreateDistributionRequest createDistributionRequest);

    /**
     * <p>
     * Create a new distribution with tags.
     * </p>
     * 
     * @param createDistributionWithTagsRequest
     *        The request to create a new distribution with tags.
     * @return Result of the CreateDistributionWithTags operation returned by the service.
     * @throws CNAMEAlreadyExistsException
     * @throws DistributionAlreadyExistsException
     *         The caller reference you attempted to create the distribution with is associated with another
     *         distribution.
     * @throws InvalidOriginException
     *         The Amazon S3 origin server specified does not refer to a valid Amazon S3 bucket.
     * @throws InvalidOriginAccessIdentityException
     *         The origin access identity is not valid or doesn't exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws TooManyTrustedSignersException
     *         Your request contains more trusted signers than are allowed per distribution.
     * @throws TrustedSignerDoesNotExistException
     *         One or more of your trusted signers do not exist.
     * @throws InvalidViewerCertificateException
     * @throws InvalidMinimumProtocolVersionException
     * @throws MissingBodyException
     *         This operation requires a body. Ensure that the body is present and the Content-Type header is set.
     * @throws TooManyDistributionCNAMEsException
     *         Your request contains more CNAMEs than are allowed per distribution.
     * @throws TooManyDistributionsException
     *         Processing your request would cause you to exceed the maximum number of distributions allowed.
     * @throws InvalidDefaultRootObjectException
     *         The default root object file name is too big or contains an invalid character.
     * @throws InvalidRelativePathException
     *         The relative path is too big, is not URL-encoded, or does not begin with a slash (/).
     * @throws InvalidErrorCodeException
     * @throws InvalidResponseCodeException
     * @throws InvalidArgumentException
     *         The argument is invalid.
     * @throws InvalidRequiredProtocolException
     *         This operation requires the HTTPS protocol. Ensure that you specify the HTTPS protocol in your request,
     *         or omit the <code>RequiredProtocols</code> element from your distribution configuration.
     * @throws NoSuchOriginException
     *         No origin exists with the specified <code>Origin Id</code>.
     * @throws TooManyOriginsException
     *         You cannot create more origins for the distribution.
     * @throws TooManyCacheBehaviorsException
     *         You cannot create more cache behaviors for the distribution.
     * @throws TooManyCookieNamesInWhiteListException
     *         Your request contains more cookie names in the whitelist than are allowed per cache behavior.
     * @throws InvalidForwardCookiesException
     *         Your request contains forward cookies option which doesn't match with the expectation for the
     *         <code>whitelisted</code> list of cookie names. Either list of cookie names has been specified when not
     *         allowed or list of cookie names is missing when expected.
     * @throws TooManyHeadersInForwardedValuesException
     * @throws InvalidHeadersForS3OriginException
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> do not match.
     * @throws TooManyCertificatesException
     *         You cannot create anymore custom SSL/TLS certificates.
     * @throws InvalidLocationCodeException
     * @throws InvalidGeoRestrictionParameterException
     * @throws InvalidProtocolSettingsException
     *         You cannot specify SSLv3 as the minimum protocol version if you only want to support only clients that
     *         support Server Name Indication (SNI).
     * @throws InvalidTTLOrderException
     * @throws InvalidWebACLIdException
     * @throws TooManyOriginCustomHeadersException
     * @throws InvalidTaggingException
     * @throws TooManyQueryStringParametersException
     * @throws InvalidQueryStringParametersException
     * @sample AmazonCloudFront.CreateDistributionWithTags
     */
    CreateDistributionWithTagsResult createDistributionWithTags(CreateDistributionWithTagsRequest createDistributionWithTagsRequest);

    /**
     * <p>
     * Create a new invalidation.
     * </p>
     * 
     * @param createInvalidationRequest
     *        The request to create an invalidation.
     * @return Result of the CreateInvalidation operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws MissingBodyException
     *         This operation requires a body. Ensure that the body is present and the Content-Type header is set.
     * @throws InvalidArgumentException
     *         The argument is invalid.
     * @throws NoSuchDistributionException
     *         The specified distribution does not exist.
     * @throws BatchTooLargeException
     * @throws TooManyInvalidationsInProgressException
     *         You have exceeded the maximum number of allowable InProgress invalidation batch requests, or invalidation
     *         objects.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> do not match.
     * @sample AmazonCloudFront.CreateInvalidation
     */
    CreateInvalidationResult createInvalidation(CreateInvalidationRequest createInvalidationRequest);

    /**
     * <p>
     * Creates a new RMTP distribution. An RTMP distribution is similar to a web distribution, but an RTMP distribution
     * streams media files using the Adobe Real-Time Messaging Protocol (RTMP) instead of serving files using HTTP.
     * </p>
     * <p>
     * To create a new web distribution, submit a <code>POST</code> request to the <i>CloudFront API
     * version</i>/distribution resource. The request body must include a document with a
     * <i>StreamingDistributionConfig</i> element. The response echoes the <code>StreamingDistributionConfig</code>
     * element and returns other information about the RTMP distribution.
     * </p>
     * <p>
     * To get the status of your request, use the <i>GET StreamingDistribution</i> API action. When the value of
     * <code>Enabled</code> is <code>true</code> and the value of <code>Status</code> is <code>Deployed</code>, your
     * distribution is ready. A distribution usually deploys in less than 15 minutes.
     * </p>
     * <p>
     * For more information about web distributions, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-rtmp.html">Working with RTMP
     * Distributions</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * <important>
     * <p>
     * Beginning with the 2012-05-05 version of the CloudFront API, we made substantial changes to the format of the XML
     * document that you include in the request body when you create or update a web distribution or an RTMP
     * distribution, and when you invalidate objects. With previous versions of the API, we discovered that it was too
     * easy to accidentally delete one or more values for an element that accepts multiple values, for example, CNAMEs
     * and trusted signers. Our changes for the 2012-05-05 release are intended to prevent these accidental deletions
     * and to notify you when there's a mismatch between the number of values you say you're specifying in the
     * <code>Quantity</code> element and the number of values specified.
     * </p>
     * </important>
     * 
     * @param createStreamingDistributionRequest
     *        The request to create a new streaming distribution.
     * @return Result of the CreateStreamingDistribution operation returned by the service.
     * @throws CNAMEAlreadyExistsException
     * @throws StreamingDistributionAlreadyExistsException
     * @throws InvalidOriginException
     *         The Amazon S3 origin server specified does not refer to a valid Amazon S3 bucket.
     * @throws InvalidOriginAccessIdentityException
     *         The origin access identity is not valid or doesn't exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws TooManyTrustedSignersException
     *         Your request contains more trusted signers than are allowed per distribution.
     * @throws TrustedSignerDoesNotExistException
     *         One or more of your trusted signers do not exist.
     * @throws MissingBodyException
     *         This operation requires a body. Ensure that the body is present and the Content-Type header is set.
     * @throws TooManyStreamingDistributionCNAMEsException
     * @throws TooManyStreamingDistributionsException
     *         Processing your request would cause you to exceed the maximum number of streaming distributions allowed.
     * @throws InvalidArgumentException
     *         The argument is invalid.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> do not match.
     * @sample AmazonCloudFront.CreateStreamingDistribution
     */
    CreateStreamingDistributionResult createStreamingDistribution(CreateStreamingDistributionRequest createStreamingDistributionRequest);

    /**
     * <p>
     * Create a new streaming distribution with tags.
     * </p>
     * 
     * @param createStreamingDistributionWithTagsRequest
     *        The request to create a new streaming distribution with tags.
     * @return Result of the CreateStreamingDistributionWithTags operation returned by the service.
     * @throws CNAMEAlreadyExistsException
     * @throws StreamingDistributionAlreadyExistsException
     * @throws InvalidOriginException
     *         The Amazon S3 origin server specified does not refer to a valid Amazon S3 bucket.
     * @throws InvalidOriginAccessIdentityException
     *         The origin access identity is not valid or doesn't exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws TooManyTrustedSignersException
     *         Your request contains more trusted signers than are allowed per distribution.
     * @throws TrustedSignerDoesNotExistException
     *         One or more of your trusted signers do not exist.
     * @throws MissingBodyException
     *         This operation requires a body. Ensure that the body is present and the Content-Type header is set.
     * @throws TooManyStreamingDistributionCNAMEsException
     * @throws TooManyStreamingDistributionsException
     *         Processing your request would cause you to exceed the maximum number of streaming distributions allowed.
     * @throws InvalidArgumentException
     *         The argument is invalid.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> do not match.
     * @throws InvalidTaggingException
     * @sample AmazonCloudFront.CreateStreamingDistributionWithTags
     */
    CreateStreamingDistributionWithTagsResult createStreamingDistributionWithTags(
            CreateStreamingDistributionWithTagsRequest createStreamingDistributionWithTagsRequest);

    /**
     * <p>
     * Delete an origin access identity.
     * </p>
     * 
     * @param deleteCloudFrontOriginAccessIdentityRequest
     *        Deletes a origin access identity.
     * @return Result of the DeleteCloudFrontOriginAccessIdentity operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid for the distribution.
     * @throws NoSuchCloudFrontOriginAccessIdentityException
     *         The specified origin access identity does not exist.
     * @throws PreconditionFailedException
     *         The precondition given in one or more of the request-header fields evaluated to <code>false</code>.
     * @throws CloudFrontOriginAccessIdentityInUseException
     * @sample AmazonCloudFront.DeleteCloudFrontOriginAccessIdentity
     */
    DeleteCloudFrontOriginAccessIdentityResult deleteCloudFrontOriginAccessIdentity(
            DeleteCloudFrontOriginAccessIdentityRequest deleteCloudFrontOriginAccessIdentityRequest);

    /**
     * <p>
     * Delete a distribution.
     * </p>
     * 
     * @param deleteDistributionRequest
     *        This action deletes a web distribution. To delete a web distribution using the CloudFront API, perform the
     *        following steps.</p>
     *        <p>
     *        <b>To delete a web distribution using the CloudFront API:</b>
     *        </p>
     *        <ol>
     *        <li>
     *        <p>
     *        Disable the web distribution
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Submit a <code>GET Distribution Config</code> request to get the current configuration and the
     *        <code>Etag</code> header for the distribution.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Update the XML document that was returned in the response to your <code>GET Distribution Config</code>
     *        request to change the value of <code>Enabled</code> to <code>false</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Submit a <code>PUT Distribution Config</code> request to update the configuration for your distribution.
     *        In the request body, include the XML document that you updated in Step 3. Set the value of the HTTP
     *        <code>If-Match</code> header to the value of the <code>ETag</code> header that CloudFront returned when
     *        you submitted the <code>GET Distribution Config</code> request in Step 2.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Review the response to the <code>PUT Distribution Config</code> request to confirm that the distribution
     *        was successfully disabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Submit a <code>GET Distribution</code> request to confirm that your changes have propagated. When
     *        propagation is complete, the value of <code>Status</code> is <code>Deployed</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Submit a <code>DELETE Distribution</code> request. Set the value of the HTTP <code>If-Match</code> header
     *        to the value of the <code>ETag</code> header that CloudFront returned when you submitted the
     *        <code>GET Distribution Config</code> request in Step 6.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Review the response to your <code>DELETE Distribution</code> request to confirm that the distribution was
     *        successfully deleted.
     *        </p>
     *        </li>
     *        </ol>
     *        <p>
     *        For information about deleting a distribution using the CloudFront console, see <a
     *        href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/HowToDeleteDistribution.html"
     *        >Deleting a Distribution</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * @return Result of the DeleteDistribution operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws DistributionNotDisabledException
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid for the distribution.
     * @throws NoSuchDistributionException
     *         The specified distribution does not exist.
     * @throws PreconditionFailedException
     *         The precondition given in one or more of the request-header fields evaluated to <code>false</code>.
     * @sample AmazonCloudFront.DeleteDistribution
     */
    DeleteDistributionResult deleteDistribution(DeleteDistributionRequest deleteDistributionRequest);

    /**
     * <p>
     * Delete a streaming distribution. To delete an RTMP distribution using the CloudFront API, perform the following
     * steps.
     * </p>
     * <p>
     * <b>To delete an RTMP distribution using the CloudFront API</b>:
     * </p>
     * <ol>
     * <li>
     * <p>
     * Disable the RTMP distribution.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>GET Streaming Distribution Config</code> request to get the current configuration and the
     * <code>Etag</code> header for the distribution.
     * </p>
     * </li>
     * <li>
     * <p>
     * Update the XML document that was returned in the response to your <code>GET Streaming Distribution Config</code>
     * request to change the value of <code>Enabled</code> to <code>false</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>PUT Streaming Distribution Config</code> request to update the configuration for your
     * distribution. In the request body, include the XML document that you updated in Step 3. Then set the value of the
     * HTTP <code>If-Match</code> header to the value of the <code>ETag</code> header that CloudFront returned when you
     * submitted the <code>GET Streaming Distribution Config</code> request in Step 2.
     * </p>
     * </li>
     * <li>
     * <p>
     * Review the response to the <code>PUT Streaming Distribution Config</code> request to confirm that the
     * distribution was successfully disabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>GET Streaming Distribution Config</code> request to confirm that your changes have propagated.
     * When propagation is complete, the value of <code>Status</code> is <code>Deployed</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Submit a <code>DELETE Streaming Distribution</code> request. Set the value of the HTTP <code>If-Match</code>
     * header to the value of the <code>ETag</code> header that CloudFront returned when you submitted the
     * <code>GET Streaming Distribution Config</code> request in Step 2.
     * </p>
     * </li>
     * <li>
     * <p>
     * Review the response to your <code>DELETE Streaming Distribution</code> request to confirm that the distribution
     * was successfully deleted.
     * </p>
     * </li>
     * </ol>
     * <p>
     * For information about deleting a distribution using the CloudFront console, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/HowToDeleteDistribution.html">Deleting a
     * Distribution</a> in the <i>Amazon CloudFront Developer Guide</i>.
     * </p>
     * 
     * @param deleteStreamingDistributionRequest
     *        The request to delete a streaming distribution.
     * @return Result of the DeleteStreamingDistribution operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws StreamingDistributionNotDisabledException
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid for the distribution.
     * @throws NoSuchStreamingDistributionException
     *         The specified streaming distribution does not exist.
     * @throws PreconditionFailedException
     *         The precondition given in one or more of the request-header fields evaluated to <code>false</code>.
     * @sample AmazonCloudFront.DeleteStreamingDistribution
     */
    DeleteStreamingDistributionResult deleteStreamingDistribution(DeleteStreamingDistributionRequest deleteStreamingDistributionRequest);

    /**
     * <p>
     * Get the information about an origin access identity.
     * </p>
     * 
     * @param getCloudFrontOriginAccessIdentityRequest
     *        The request to get an origin access identity's information.
     * @return Result of the GetCloudFrontOriginAccessIdentity operation returned by the service.
     * @throws NoSuchCloudFrontOriginAccessIdentityException
     *         The specified origin access identity does not exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.GetCloudFrontOriginAccessIdentity
     */
    GetCloudFrontOriginAccessIdentityResult getCloudFrontOriginAccessIdentity(GetCloudFrontOriginAccessIdentityRequest getCloudFrontOriginAccessIdentityRequest);

    /**
     * <p>
     * Get the configuration information about an origin access identity.
     * </p>
     * 
     * @param getCloudFrontOriginAccessIdentityConfigRequest
     *        The origin access identity's configuration information. For more information, see
     *        <a>CloudFrontOriginAccessIdentityConfigComplexType</a>.
     * @return Result of the GetCloudFrontOriginAccessIdentityConfig operation returned by the service.
     * @throws NoSuchCloudFrontOriginAccessIdentityException
     *         The specified origin access identity does not exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.GetCloudFrontOriginAccessIdentityConfig
     */
    GetCloudFrontOriginAccessIdentityConfigResult getCloudFrontOriginAccessIdentityConfig(
            GetCloudFrontOriginAccessIdentityConfigRequest getCloudFrontOriginAccessIdentityConfigRequest);

    /**
     * <p>
     * Get the information about a distribution.
     * </p>
     * 
     * @param getDistributionRequest
     *        The request to get a distribution's information.
     * @return Result of the GetDistribution operation returned by the service.
     * @throws NoSuchDistributionException
     *         The specified distribution does not exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.GetDistribution
     */
    GetDistributionResult getDistribution(GetDistributionRequest getDistributionRequest);

    /**
     * <p>
     * Get the configuration information about a distribution.
     * </p>
     * 
     * @param getDistributionConfigRequest
     *        The request to get a distribution configuration.
     * @return Result of the GetDistributionConfig operation returned by the service.
     * @throws NoSuchDistributionException
     *         The specified distribution does not exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.GetDistributionConfig
     */
    GetDistributionConfigResult getDistributionConfig(GetDistributionConfigRequest getDistributionConfigRequest);

    /**
     * <p>
     * Get the information about an invalidation.
     * </p>
     * 
     * @param getInvalidationRequest
     *        The request to get an invalidation's information.
     * @return Result of the GetInvalidation operation returned by the service.
     * @throws NoSuchInvalidationException
     *         The specified invalidation does not exist.
     * @throws NoSuchDistributionException
     *         The specified distribution does not exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.GetInvalidation
     */
    GetInvalidationResult getInvalidation(GetInvalidationRequest getInvalidationRequest);

    /**
     * <p>
     * Gets information about a specified RTMP distribution, including the distribution configuration.
     * </p>
     * 
     * @param getStreamingDistributionRequest
     *        The request to get a streaming distribution's information.
     * @return Result of the GetStreamingDistribution operation returned by the service.
     * @throws NoSuchStreamingDistributionException
     *         The specified streaming distribution does not exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.GetStreamingDistribution
     */
    GetStreamingDistributionResult getStreamingDistribution(GetStreamingDistributionRequest getStreamingDistributionRequest);

    /**
     * <p>
     * Get the configuration information about a streaming distribution.
     * </p>
     * 
     * @param getStreamingDistributionConfigRequest
     *        To request to get a streaming distribution configuration.
     * @return Result of the GetStreamingDistributionConfig operation returned by the service.
     * @throws NoSuchStreamingDistributionException
     *         The specified streaming distribution does not exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.GetStreamingDistributionConfig
     */
    GetStreamingDistributionConfigResult getStreamingDistributionConfig(GetStreamingDistributionConfigRequest getStreamingDistributionConfigRequest);

    /**
     * <p>
     * Lists origin access identities.
     * </p>
     * 
     * @param listCloudFrontOriginAccessIdentitiesRequest
     *        The request to list origin access identities.
     * @return Result of the ListCloudFrontOriginAccessIdentities operation returned by the service.
     * @throws InvalidArgumentException
     *         The argument is invalid.
     * @sample AmazonCloudFront.ListCloudFrontOriginAccessIdentities
     */
    ListCloudFrontOriginAccessIdentitiesResult listCloudFrontOriginAccessIdentities(
            ListCloudFrontOriginAccessIdentitiesRequest listCloudFrontOriginAccessIdentitiesRequest);

    /**
     * <p>
     * List distributions.
     * </p>
     * 
     * @param listDistributionsRequest
     *        The request to list your distributions.
     * @return Result of the ListDistributions operation returned by the service.
     * @throws InvalidArgumentException
     *         The argument is invalid.
     * @sample AmazonCloudFront.ListDistributions
     */
    ListDistributionsResult listDistributions(ListDistributionsRequest listDistributionsRequest);

    /**
     * <p>
     * List the distributions that are associated with a specified AWS WAF web ACL.
     * </p>
     * 
     * @param listDistributionsByWebACLIdRequest
     *        The request to list distributions that are associated with a specified AWS WAF web ACL.
     * @return Result of the ListDistributionsByWebACLId operation returned by the service.
     * @throws InvalidArgumentException
     *         The argument is invalid.
     * @throws InvalidWebACLIdException
     * @sample AmazonCloudFront.ListDistributionsByWebACLId
     */
    ListDistributionsByWebACLIdResult listDistributionsByWebACLId(ListDistributionsByWebACLIdRequest listDistributionsByWebACLIdRequest);

    /**
     * <p>
     * Lists invalidation batches.
     * </p>
     * 
     * @param listInvalidationsRequest
     *        The request to list invalidations.
     * @return Result of the ListInvalidations operation returned by the service.
     * @throws InvalidArgumentException
     *         The argument is invalid.
     * @throws NoSuchDistributionException
     *         The specified distribution does not exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.ListInvalidations
     */
    ListInvalidationsResult listInvalidations(ListInvalidationsRequest listInvalidationsRequest);

    /**
     * <p>
     * List streaming distributions.
     * </p>
     * 
     * @param listStreamingDistributionsRequest
     *        The request to list your streaming distributions.
     * @return Result of the ListStreamingDistributions operation returned by the service.
     * @throws InvalidArgumentException
     *         The argument is invalid.
     * @sample AmazonCloudFront.ListStreamingDistributions
     */
    ListStreamingDistributionsResult listStreamingDistributions(ListStreamingDistributionsRequest listStreamingDistributionsRequest);

    /**
     * <p>
     * List tags for a CloudFront resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     *        The request to list tags for a CloudFront resource.
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws InvalidArgumentException
     *         The argument is invalid.
     * @throws InvalidTaggingException
     * @throws NoSuchResourceException
     * @sample AmazonCloudFront.ListTagsForResource
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Add tags to a CloudFront resource.
     * </p>
     * 
     * @param tagResourceRequest
     *        The request to add tags to a CloudFront resource.
     * @return Result of the TagResource operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws InvalidArgumentException
     *         The argument is invalid.
     * @throws InvalidTaggingException
     * @throws NoSuchResourceException
     * @sample AmazonCloudFront.TagResource
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Remove tags from a CloudFront resource.
     * </p>
     * 
     * @param untagResourceRequest
     *        The request to remove tags from a CloudFront resource.
     * @return Result of the UntagResource operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws InvalidArgumentException
     *         The argument is invalid.
     * @throws InvalidTaggingException
     * @throws NoSuchResourceException
     * @sample AmazonCloudFront.UntagResource
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Update an origin access identity.
     * </p>
     * 
     * @param updateCloudFrontOriginAccessIdentityRequest
     *        The request to update an origin access identity.
     * @return Result of the UpdateCloudFrontOriginAccessIdentity operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws IllegalUpdateException
     *         Origin and <code>CallerReference</code> cannot be updated.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid for the distribution.
     * @throws MissingBodyException
     *         This operation requires a body. Ensure that the body is present and the Content-Type header is set.
     * @throws NoSuchCloudFrontOriginAccessIdentityException
     *         The specified origin access identity does not exist.
     * @throws PreconditionFailedException
     *         The precondition given in one or more of the request-header fields evaluated to <code>false</code>.
     * @throws InvalidArgumentException
     *         The argument is invalid.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> do not match.
     * @sample AmazonCloudFront.UpdateCloudFrontOriginAccessIdentity
     */
    UpdateCloudFrontOriginAccessIdentityResult updateCloudFrontOriginAccessIdentity(
            UpdateCloudFrontOriginAccessIdentityRequest updateCloudFrontOriginAccessIdentityRequest);

    /**
     * <p>
     * Update a distribution.
     * </p>
     * 
     * @param updateDistributionRequest
     *        The request to update a distribution.
     * @return Result of the UpdateDistribution operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws CNAMEAlreadyExistsException
     * @throws IllegalUpdateException
     *         Origin and <code>CallerReference</code> cannot be updated.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid for the distribution.
     * @throws MissingBodyException
     *         This operation requires a body. Ensure that the body is present and the Content-Type header is set.
     * @throws NoSuchDistributionException
     *         The specified distribution does not exist.
     * @throws PreconditionFailedException
     *         The precondition given in one or more of the request-header fields evaluated to <code>false</code>.
     * @throws TooManyDistributionCNAMEsException
     *         Your request contains more CNAMEs than are allowed per distribution.
     * @throws InvalidDefaultRootObjectException
     *         The default root object file name is too big or contains an invalid character.
     * @throws InvalidRelativePathException
     *         The relative path is too big, is not URL-encoded, or does not begin with a slash (/).
     * @throws InvalidErrorCodeException
     * @throws InvalidResponseCodeException
     * @throws InvalidArgumentException
     *         The argument is invalid.
     * @throws InvalidOriginAccessIdentityException
     *         The origin access identity is not valid or doesn't exist.
     * @throws TooManyTrustedSignersException
     *         Your request contains more trusted signers than are allowed per distribution.
     * @throws TrustedSignerDoesNotExistException
     *         One or more of your trusted signers do not exist.
     * @throws InvalidViewerCertificateException
     * @throws InvalidMinimumProtocolVersionException
     * @throws InvalidRequiredProtocolException
     *         This operation requires the HTTPS protocol. Ensure that you specify the HTTPS protocol in your request,
     *         or omit the <code>RequiredProtocols</code> element from your distribution configuration.
     * @throws NoSuchOriginException
     *         No origin exists with the specified <code>Origin Id</code>.
     * @throws TooManyOriginsException
     *         You cannot create more origins for the distribution.
     * @throws TooManyCacheBehaviorsException
     *         You cannot create more cache behaviors for the distribution.
     * @throws TooManyCookieNamesInWhiteListException
     *         Your request contains more cookie names in the whitelist than are allowed per cache behavior.
     * @throws InvalidForwardCookiesException
     *         Your request contains forward cookies option which doesn't match with the expectation for the
     *         <code>whitelisted</code> list of cookie names. Either list of cookie names has been specified when not
     *         allowed or list of cookie names is missing when expected.
     * @throws TooManyHeadersInForwardedValuesException
     * @throws InvalidHeadersForS3OriginException
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> do not match.
     * @throws TooManyCertificatesException
     *         You cannot create anymore custom SSL/TLS certificates.
     * @throws InvalidLocationCodeException
     * @throws InvalidGeoRestrictionParameterException
     * @throws InvalidTTLOrderException
     * @throws InvalidWebACLIdException
     * @throws TooManyOriginCustomHeadersException
     * @throws TooManyQueryStringParametersException
     * @throws InvalidQueryStringParametersException
     * @sample AmazonCloudFront.UpdateDistribution
     */
    UpdateDistributionResult updateDistribution(UpdateDistributionRequest updateDistributionRequest);

    /**
     * <p>
     * Update a streaming distribution.
     * </p>
     * 
     * @param updateStreamingDistributionRequest
     *        The request to update a streaming distribution.
     * @return Result of the UpdateStreamingDistribution operation returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws CNAMEAlreadyExistsException
     * @throws IllegalUpdateException
     *         Origin and <code>CallerReference</code> cannot be updated.
     * @throws InvalidIfMatchVersionException
     *         The <code>If-Match</code> version is missing or not valid for the distribution.
     * @throws MissingBodyException
     *         This operation requires a body. Ensure that the body is present and the Content-Type header is set.
     * @throws NoSuchStreamingDistributionException
     *         The specified streaming distribution does not exist.
     * @throws PreconditionFailedException
     *         The precondition given in one or more of the request-header fields evaluated to <code>false</code>.
     * @throws TooManyStreamingDistributionCNAMEsException
     * @throws InvalidArgumentException
     *         The argument is invalid.
     * @throws InvalidOriginAccessIdentityException
     *         The origin access identity is not valid or doesn't exist.
     * @throws TooManyTrustedSignersException
     *         Your request contains more trusted signers than are allowed per distribution.
     * @throws TrustedSignerDoesNotExistException
     *         One or more of your trusted signers do not exist.
     * @throws InconsistentQuantitiesException
     *         The value of <code>Quantity</code> and the size of <code>Items</code> do not match.
     * @sample AmazonCloudFront.UpdateStreamingDistribution
     */
    UpdateStreamingDistributionResult updateStreamingDistribution(UpdateStreamingDistributionRequest updateStreamingDistributionRequest);

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

    AmazonCloudFrontWaiters waiters();

}
