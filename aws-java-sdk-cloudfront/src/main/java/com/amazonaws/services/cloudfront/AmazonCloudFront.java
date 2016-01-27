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
package com.amazonaws.services.cloudfront;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.cloudfront.model.*;

/**
 * Interface for accessing CloudFront.
 */
public interface AmazonCloudFront {

    /**
     * Overrides the default endpoint for this client
     * ("https://cloudfront.amazonaws.com/"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "cloudfront.amazonaws.com/")
     * or a full URL, including the protocol (ex:
     * "https://cloudfront.amazonaws.com/"). If the protocol is not specified
     * here, the default protocol from this client's {@link ClientConfiguration}
     * will be used, which by default is HTTPS.
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
     *        The endpoint (ex: "cloudfront.amazonaws.com/") or a full URL,
     *        including the protocol (ex: "https://cloudfront.amazonaws.com/")
     *        of the region specific AWS endpoint this client will communicate
     *        with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonCloudFront#setEndpoint(String)}, sets the
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
     * Create a new origin access identity.
     * 
     * @param createCloudFrontOriginAccessIdentityRequest
     *        The request to create a new origin access identity.
     * @return Result of the CreateCloudFrontOriginAccessIdentity operation
     *         returned by the service.
     * @throws CloudFrontOriginAccessIdentityAlreadyExistsException
     *         If the CallerReference is a value you already sent in a previous
     *         request to create an identity but the content of the
     *         CloudFrontOriginAccessIdentityConfig is different from the
     *         original request, CloudFront returns a
     *         CloudFrontOriginAccessIdentityAlreadyExists error.
     * @throws MissingBodyException
     *         This operation requires a body. Ensure that the body is present
     *         and the Content-Type header is set.
     * @throws TooManyCloudFrontOriginAccessIdentitiesException
     *         Processing your request would cause you to exceed the maximum
     *         number of origin access identities allowed.
     * @throws InvalidArgumentException
     *         The argument is invalid.
     * @throws InconsistentQuantitiesException
     *         The value of Quantity and the size of Items do not match.
     * @sample AmazonCloudFront.CreateCloudFrontOriginAccessIdentity
     */
    CreateCloudFrontOriginAccessIdentityResult createCloudFrontOriginAccessIdentity(
            CreateCloudFrontOriginAccessIdentityRequest createCloudFrontOriginAccessIdentityRequest);

    /**
     * Create a new distribution.
     * 
     * @param createDistributionRequest
     *        The request to create a new distribution.
     * @return Result of the CreateDistribution operation returned by the
     *         service.
     * @throws CNAMEAlreadyExistsException
     * @throws DistributionAlreadyExistsException
     *         The caller reference you attempted to create the distribution
     *         with is associated with another distribution.
     * @throws InvalidOriginException
     *         The Amazon S3 origin server specified does not refer to a valid
     *         Amazon S3 bucket.
     * @throws InvalidOriginAccessIdentityException
     *         The origin access identity is not valid or doesn't exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws TooManyTrustedSignersException
     *         Your request contains more trusted signers than are allowed per
     *         distribution.
     * @throws TrustedSignerDoesNotExistException
     *         One or more of your trusted signers do not exist.
     * @throws InvalidViewerCertificateException
     * @throws InvalidMinimumProtocolVersionException
     * @throws MissingBodyException
     *         This operation requires a body. Ensure that the body is present
     *         and the Content-Type header is set.
     * @throws TooManyDistributionCNAMEsException
     *         Your request contains more CNAMEs than are allowed per
     *         distribution.
     * @throws TooManyDistributionsException
     *         Processing your request would cause you to exceed the maximum
     *         number of distributions allowed.
     * @throws InvalidDefaultRootObjectException
     *         The default root object file name is too big or contains an
     *         invalid character.
     * @throws InvalidRelativePathException
     *         The relative path is too big, is not URL-encoded, or does not
     *         begin with a slash (/).
     * @throws InvalidErrorCodeException
     * @throws InvalidResponseCodeException
     * @throws InvalidArgumentException
     *         The argument is invalid.
     * @throws InvalidRequiredProtocolException
     *         This operation requires the HTTPS protocol. Ensure that you
     *         specify the HTTPS protocol in your request, or omit the
     *         RequiredProtocols element from your distribution configuration.
     * @throws NoSuchOriginException
     *         No origin exists with the specified Origin Id.
     * @throws TooManyOriginsException
     *         You cannot create anymore origins for the distribution.
     * @throws TooManyCacheBehaviorsException
     *         You cannot create anymore cache behaviors for the distribution.
     * @throws TooManyCookieNamesInWhiteListException
     *         Your request contains more cookie names in the whitelist than are
     *         allowed per cache behavior.
     * @throws InvalidForwardCookiesException
     *         Your request contains forward cookies option which doesn't match
     *         with the expectation for the whitelisted list of cookie names.
     *         Either list of cookie names has been specified when not allowed
     *         or list of cookie names is missing when expected.
     * @throws TooManyHeadersInForwardedValuesException
     * @throws InvalidHeadersForS3OriginException
     * @throws InconsistentQuantitiesException
     *         The value of Quantity and the size of Items do not match.
     * @throws TooManyCertificatesException
     *         You cannot create anymore custom ssl certificates.
     * @throws InvalidLocationCodeException
     * @throws InvalidGeoRestrictionParameterException
     * @throws InvalidProtocolSettingsException
     *         You cannot specify SSLv3 as the minimum protocol version if you
     *         only want to support only clients that Support Server Name
     *         Indication (SNI).
     * @throws InvalidTTLOrderException
     * @throws InvalidWebACLIdException
     * @throws TooManyOriginCustomHeadersException
     * @sample AmazonCloudFront.CreateDistribution
     */
    CreateDistributionResult createDistribution(
            CreateDistributionRequest createDistributionRequest);

    /**
     * Create a new invalidation.
     * 
     * @param createInvalidationRequest
     *        The request to create an invalidation.
     * @return Result of the CreateInvalidation operation returned by the
     *         service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws MissingBodyException
     *         This operation requires a body. Ensure that the body is present
     *         and the Content-Type header is set.
     * @throws InvalidArgumentException
     *         The argument is invalid.
     * @throws NoSuchDistributionException
     *         The specified distribution does not exist.
     * @throws BatchTooLargeException
     * @throws TooManyInvalidationsInProgressException
     *         You have exceeded the maximum number of allowable InProgress
     *         invalidation batch requests, or invalidation objects.
     * @throws InconsistentQuantitiesException
     *         The value of Quantity and the size of Items do not match.
     * @sample AmazonCloudFront.CreateInvalidation
     */
    CreateInvalidationResult createInvalidation(
            CreateInvalidationRequest createInvalidationRequest);

    /**
     * Create a new streaming distribution.
     * 
     * @param createStreamingDistributionRequest
     *        The request to create a new streaming distribution.
     * @return Result of the CreateStreamingDistribution operation returned by
     *         the service.
     * @throws CNAMEAlreadyExistsException
     * @throws StreamingDistributionAlreadyExistsException
     * @throws InvalidOriginException
     *         The Amazon S3 origin server specified does not refer to a valid
     *         Amazon S3 bucket.
     * @throws InvalidOriginAccessIdentityException
     *         The origin access identity is not valid or doesn't exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws TooManyTrustedSignersException
     *         Your request contains more trusted signers than are allowed per
     *         distribution.
     * @throws TrustedSignerDoesNotExistException
     *         One or more of your trusted signers do not exist.
     * @throws MissingBodyException
     *         This operation requires a body. Ensure that the body is present
     *         and the Content-Type header is set.
     * @throws TooManyStreamingDistributionCNAMEsException
     * @throws TooManyStreamingDistributionsException
     *         Processing your request would cause you to exceed the maximum
     *         number of streaming distributions allowed.
     * @throws InvalidArgumentException
     *         The argument is invalid.
     * @throws InconsistentQuantitiesException
     *         The value of Quantity and the size of Items do not match.
     * @sample AmazonCloudFront.CreateStreamingDistribution
     */
    CreateStreamingDistributionResult createStreamingDistribution(
            CreateStreamingDistributionRequest createStreamingDistributionRequest);

    /**
     * Delete an origin access identity.
     * 
     * @param deleteCloudFrontOriginAccessIdentityRequest
     *        The request to delete a origin access identity.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws InvalidIfMatchVersionException
     *         The If-Match version is missing or not valid for the
     *         distribution.
     * @throws NoSuchCloudFrontOriginAccessIdentityException
     *         The specified origin access identity does not exist.
     * @throws PreconditionFailedException
     *         The precondition given in one or more of the request-header
     *         fields evaluated to false.
     * @throws CloudFrontOriginAccessIdentityInUseException
     * @sample AmazonCloudFront.DeleteCloudFrontOriginAccessIdentity
     */
    void deleteCloudFrontOriginAccessIdentity(
            DeleteCloudFrontOriginAccessIdentityRequest deleteCloudFrontOriginAccessIdentityRequest);

    /**
     * Delete a distribution.
     * 
     * @param deleteDistributionRequest
     *        The request to delete a distribution.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws DistributionNotDisabledException
     * @throws InvalidIfMatchVersionException
     *         The If-Match version is missing or not valid for the
     *         distribution.
     * @throws NoSuchDistributionException
     *         The specified distribution does not exist.
     * @throws PreconditionFailedException
     *         The precondition given in one or more of the request-header
     *         fields evaluated to false.
     * @sample AmazonCloudFront.DeleteDistribution
     */
    void deleteDistribution(DeleteDistributionRequest deleteDistributionRequest);

    /**
     * Delete a streaming distribution.
     * 
     * @param deleteStreamingDistributionRequest
     *        The request to delete a streaming distribution.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws StreamingDistributionNotDisabledException
     * @throws InvalidIfMatchVersionException
     *         The If-Match version is missing or not valid for the
     *         distribution.
     * @throws NoSuchStreamingDistributionException
     *         The specified streaming distribution does not exist.
     * @throws PreconditionFailedException
     *         The precondition given in one or more of the request-header
     *         fields evaluated to false.
     * @sample AmazonCloudFront.DeleteStreamingDistribution
     */
    void deleteStreamingDistribution(
            DeleteStreamingDistributionRequest deleteStreamingDistributionRequest);

    /**
     * Get the information about an origin access identity.
     * 
     * @param getCloudFrontOriginAccessIdentityRequest
     *        The request to get an origin access identity's information.
     * @return Result of the GetCloudFrontOriginAccessIdentity operation
     *         returned by the service.
     * @throws NoSuchCloudFrontOriginAccessIdentityException
     *         The specified origin access identity does not exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.GetCloudFrontOriginAccessIdentity
     */
    GetCloudFrontOriginAccessIdentityResult getCloudFrontOriginAccessIdentity(
            GetCloudFrontOriginAccessIdentityRequest getCloudFrontOriginAccessIdentityRequest);

    /**
     * Get the configuration information about an origin access identity.
     * 
     * @param getCloudFrontOriginAccessIdentityConfigRequest
     *        The request to get an origin access identity's configuration.
     * @return Result of the GetCloudFrontOriginAccessIdentityConfig operation
     *         returned by the service.
     * @throws NoSuchCloudFrontOriginAccessIdentityException
     *         The specified origin access identity does not exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.GetCloudFrontOriginAccessIdentityConfig
     */
    GetCloudFrontOriginAccessIdentityConfigResult getCloudFrontOriginAccessIdentityConfig(
            GetCloudFrontOriginAccessIdentityConfigRequest getCloudFrontOriginAccessIdentityConfigRequest);

    /**
     * Get the information about a distribution.
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
    GetDistributionResult getDistribution(
            GetDistributionRequest getDistributionRequest);

    /**
     * Get the configuration information about a distribution.
     * 
     * @param getDistributionConfigRequest
     *        The request to get a distribution configuration.
     * @return Result of the GetDistributionConfig operation returned by the
     *         service.
     * @throws NoSuchDistributionException
     *         The specified distribution does not exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.GetDistributionConfig
     */
    GetDistributionConfigResult getDistributionConfig(
            GetDistributionConfigRequest getDistributionConfigRequest);

    /**
     * Get the information about an invalidation.
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
    GetInvalidationResult getInvalidation(
            GetInvalidationRequest getInvalidationRequest);

    /**
     * Get the information about a streaming distribution.
     * 
     * @param getStreamingDistributionRequest
     *        The request to get a streaming distribution's information.
     * @return Result of the GetStreamingDistribution operation returned by the
     *         service.
     * @throws NoSuchStreamingDistributionException
     *         The specified streaming distribution does not exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.GetStreamingDistribution
     */
    GetStreamingDistributionResult getStreamingDistribution(
            GetStreamingDistributionRequest getStreamingDistributionRequest);

    /**
     * Get the configuration information about a streaming distribution.
     * 
     * @param getStreamingDistributionConfigRequest
     *        To request to get a streaming distribution configuration.
     * @return Result of the GetStreamingDistributionConfig operation returned
     *         by the service.
     * @throws NoSuchStreamingDistributionException
     *         The specified streaming distribution does not exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.GetStreamingDistributionConfig
     */
    GetStreamingDistributionConfigResult getStreamingDistributionConfig(
            GetStreamingDistributionConfigRequest getStreamingDistributionConfigRequest);

    /**
     * List origin access identities.
     * 
     * @param listCloudFrontOriginAccessIdentitiesRequest
     *        The request to list origin access identities.
     * @return Result of the ListCloudFrontOriginAccessIdentities operation
     *         returned by the service.
     * @throws InvalidArgumentException
     *         The argument is invalid.
     * @sample AmazonCloudFront.ListCloudFrontOriginAccessIdentities
     */
    ListCloudFrontOriginAccessIdentitiesResult listCloudFrontOriginAccessIdentities(
            ListCloudFrontOriginAccessIdentitiesRequest listCloudFrontOriginAccessIdentitiesRequest);

    /**
     * List distributions.
     * 
     * @param listDistributionsRequest
     *        The request to list your distributions.
     * @return Result of the ListDistributions operation returned by the
     *         service.
     * @throws InvalidArgumentException
     *         The argument is invalid.
     * @sample AmazonCloudFront.ListDistributions
     */
    ListDistributionsResult listDistributions(
            ListDistributionsRequest listDistributionsRequest);

    /**
     * List the distributions that are associated with a specified AWS WAF web
     * ACL.
     * 
     * @param listDistributionsByWebACLIdRequest
     *        The request to list distributions that are associated with a
     *        specified AWS WAF web ACL.
     * @return Result of the ListDistributionsByWebACLId operation returned by
     *         the service.
     * @throws InvalidArgumentException
     *         The argument is invalid.
     * @throws InvalidWebACLIdException
     * @sample AmazonCloudFront.ListDistributionsByWebACLId
     */
    ListDistributionsByWebACLIdResult listDistributionsByWebACLId(
            ListDistributionsByWebACLIdRequest listDistributionsByWebACLIdRequest);

    /**
     * List invalidation batches.
     * 
     * @param listInvalidationsRequest
     *        The request to list invalidations.
     * @return Result of the ListInvalidations operation returned by the
     *         service.
     * @throws InvalidArgumentException
     *         The argument is invalid.
     * @throws NoSuchDistributionException
     *         The specified distribution does not exist.
     * @throws AccessDeniedException
     *         Access denied.
     * @sample AmazonCloudFront.ListInvalidations
     */
    ListInvalidationsResult listInvalidations(
            ListInvalidationsRequest listInvalidationsRequest);

    /**
     * List streaming distributions.
     * 
     * @param listStreamingDistributionsRequest
     *        The request to list your streaming distributions.
     * @return Result of the ListStreamingDistributions operation returned by
     *         the service.
     * @throws InvalidArgumentException
     *         The argument is invalid.
     * @sample AmazonCloudFront.ListStreamingDistributions
     */
    ListStreamingDistributionsResult listStreamingDistributions(
            ListStreamingDistributionsRequest listStreamingDistributionsRequest);

    /**
     * Update an origin access identity.
     * 
     * @param updateCloudFrontOriginAccessIdentityRequest
     *        The request to update an origin access identity.
     * @return Result of the UpdateCloudFrontOriginAccessIdentity operation
     *         returned by the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws IllegalUpdateException
     *         Origin and CallerReference cannot be updated.
     * @throws InvalidIfMatchVersionException
     *         The If-Match version is missing or not valid for the
     *         distribution.
     * @throws MissingBodyException
     *         This operation requires a body. Ensure that the body is present
     *         and the Content-Type header is set.
     * @throws NoSuchCloudFrontOriginAccessIdentityException
     *         The specified origin access identity does not exist.
     * @throws PreconditionFailedException
     *         The precondition given in one or more of the request-header
     *         fields evaluated to false.
     * @throws InvalidArgumentException
     *         The argument is invalid.
     * @throws InconsistentQuantitiesException
     *         The value of Quantity and the size of Items do not match.
     * @sample AmazonCloudFront.UpdateCloudFrontOriginAccessIdentity
     */
    UpdateCloudFrontOriginAccessIdentityResult updateCloudFrontOriginAccessIdentity(
            UpdateCloudFrontOriginAccessIdentityRequest updateCloudFrontOriginAccessIdentityRequest);

    /**
     * Update a distribution.
     * 
     * @param updateDistributionRequest
     *        The request to update a distribution.
     * @return Result of the UpdateDistribution operation returned by the
     *         service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws CNAMEAlreadyExistsException
     * @throws IllegalUpdateException
     *         Origin and CallerReference cannot be updated.
     * @throws InvalidIfMatchVersionException
     *         The If-Match version is missing or not valid for the
     *         distribution.
     * @throws MissingBodyException
     *         This operation requires a body. Ensure that the body is present
     *         and the Content-Type header is set.
     * @throws NoSuchDistributionException
     *         The specified distribution does not exist.
     * @throws PreconditionFailedException
     *         The precondition given in one or more of the request-header
     *         fields evaluated to false.
     * @throws TooManyDistributionCNAMEsException
     *         Your request contains more CNAMEs than are allowed per
     *         distribution.
     * @throws InvalidDefaultRootObjectException
     *         The default root object file name is too big or contains an
     *         invalid character.
     * @throws InvalidRelativePathException
     *         The relative path is too big, is not URL-encoded, or does not
     *         begin with a slash (/).
     * @throws InvalidErrorCodeException
     * @throws InvalidResponseCodeException
     * @throws InvalidArgumentException
     *         The argument is invalid.
     * @throws InvalidOriginAccessIdentityException
     *         The origin access identity is not valid or doesn't exist.
     * @throws TooManyTrustedSignersException
     *         Your request contains more trusted signers than are allowed per
     *         distribution.
     * @throws TrustedSignerDoesNotExistException
     *         One or more of your trusted signers do not exist.
     * @throws InvalidViewerCertificateException
     * @throws InvalidMinimumProtocolVersionException
     * @throws InvalidRequiredProtocolException
     *         This operation requires the HTTPS protocol. Ensure that you
     *         specify the HTTPS protocol in your request, or omit the
     *         RequiredProtocols element from your distribution configuration.
     * @throws NoSuchOriginException
     *         No origin exists with the specified Origin Id.
     * @throws TooManyOriginsException
     *         You cannot create anymore origins for the distribution.
     * @throws TooManyCacheBehaviorsException
     *         You cannot create anymore cache behaviors for the distribution.
     * @throws TooManyCookieNamesInWhiteListException
     *         Your request contains more cookie names in the whitelist than are
     *         allowed per cache behavior.
     * @throws InvalidForwardCookiesException
     *         Your request contains forward cookies option which doesn't match
     *         with the expectation for the whitelisted list of cookie names.
     *         Either list of cookie names has been specified when not allowed
     *         or list of cookie names is missing when expected.
     * @throws TooManyHeadersInForwardedValuesException
     * @throws InvalidHeadersForS3OriginException
     * @throws InconsistentQuantitiesException
     *         The value of Quantity and the size of Items do not match.
     * @throws TooManyCertificatesException
     *         You cannot create anymore custom ssl certificates.
     * @throws InvalidLocationCodeException
     * @throws InvalidGeoRestrictionParameterException
     * @throws InvalidTTLOrderException
     * @throws InvalidWebACLIdException
     * @throws TooManyOriginCustomHeadersException
     * @sample AmazonCloudFront.UpdateDistribution
     */
    UpdateDistributionResult updateDistribution(
            UpdateDistributionRequest updateDistributionRequest);

    /**
     * Update a streaming distribution.
     * 
     * @param updateStreamingDistributionRequest
     *        The request to update a streaming distribution.
     * @return Result of the UpdateStreamingDistribution operation returned by
     *         the service.
     * @throws AccessDeniedException
     *         Access denied.
     * @throws CNAMEAlreadyExistsException
     * @throws IllegalUpdateException
     *         Origin and CallerReference cannot be updated.
     * @throws InvalidIfMatchVersionException
     *         The If-Match version is missing or not valid for the
     *         distribution.
     * @throws MissingBodyException
     *         This operation requires a body. Ensure that the body is present
     *         and the Content-Type header is set.
     * @throws NoSuchStreamingDistributionException
     *         The specified streaming distribution does not exist.
     * @throws PreconditionFailedException
     *         The precondition given in one or more of the request-header
     *         fields evaluated to false.
     * @throws TooManyStreamingDistributionCNAMEsException
     * @throws InvalidArgumentException
     *         The argument is invalid.
     * @throws InvalidOriginAccessIdentityException
     *         The origin access identity is not valid or doesn't exist.
     * @throws TooManyTrustedSignersException
     *         Your request contains more trusted signers than are allowed per
     *         distribution.
     * @throws TrustedSignerDoesNotExistException
     *         One or more of your trusted signers do not exist.
     * @throws InconsistentQuantitiesException
     *         The value of Quantity and the size of Items do not match.
     * @sample AmazonCloudFront.UpdateStreamingDistribution
     */
    UpdateStreamingDistributionResult updateStreamingDistribution(
            UpdateStreamingDistributionRequest updateStreamingDistributionRequest);

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
