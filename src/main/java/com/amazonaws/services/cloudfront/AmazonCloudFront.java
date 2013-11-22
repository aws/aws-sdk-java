/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Interface for accessing AmazonCloudFront.
 * 
 */
public interface AmazonCloudFront {

    /**
     * Overrides the default endpoint for this client ("https://cloudfront.amazonaws.com/").
     * Callers can use this method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "cloudfront.amazonaws.com/") or a full
     * URL, including the protocol (ex: "https://cloudfront.amazonaws.com/"). If the
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
     *            The endpoint (ex: "cloudfront.amazonaws.com/") or a full URL,
     *            including the protocol (ex: "https://cloudfront.amazonaws.com/") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

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
     * List streaming distributions.
     * </p>
     *
     * @param listStreamingDistributionsRequest Container for the necessary
     *           parameters to execute the ListStreamingDistributions service method on
     *           AmazonCloudFront.
     * 
     * @return The response from the ListStreamingDistributions service
     *         method, as returned by AmazonCloudFront.
     * 
     * @throws InvalidArgumentException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListStreamingDistributionsResult listStreamingDistributions(ListStreamingDistributionsRequest listStreamingDistributionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Update an origin access identity.
     * </p>
     *
     * @param updateCloudFrontOriginAccessIdentityRequest Container for the
     *           necessary parameters to execute the
     *           UpdateCloudFrontOriginAccessIdentity service method on
     *           AmazonCloudFront.
     * 
     * @return The response from the UpdateCloudFrontOriginAccessIdentity
     *         service method, as returned by AmazonCloudFront.
     * 
     * @throws InvalidIfMatchVersionException
     * @throws IllegalUpdateException
     * @throws MissingBodyException
     * @throws NoSuchCloudFrontOriginAccessIdentityException
     * @throws PreconditionFailedException
     * @throws AccessDeniedException
     * @throws InvalidArgumentException
     * @throws InconsistentQuantitiesException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateCloudFrontOriginAccessIdentityResult updateCloudFrontOriginAccessIdentity(UpdateCloudFrontOriginAccessIdentityRequest updateCloudFrontOriginAccessIdentityRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Create a new invalidation.
     * </p>
     *
     * @param createInvalidationRequest Container for the necessary
     *           parameters to execute the CreateInvalidation service method on
     *           AmazonCloudFront.
     * 
     * @return The response from the CreateInvalidation service method, as
     *         returned by AmazonCloudFront.
     * 
     * @throws TooManyInvalidationsInProgressException
     * @throws MissingBodyException
     * @throws NoSuchDistributionException
     * @throws BatchTooLargeException
     * @throws AccessDeniedException
     * @throws InvalidArgumentException
     * @throws InconsistentQuantitiesException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateInvalidationResult createInvalidation(CreateInvalidationRequest createInvalidationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Delete a streaming distribution.
     * </p>
     *
     * @param deleteStreamingDistributionRequest Container for the necessary
     *           parameters to execute the DeleteStreamingDistribution service method
     *           on AmazonCloudFront.
     * 
     * 
     * @throws InvalidIfMatchVersionException
     * @throws NoSuchStreamingDistributionException
     * @throws StreamingDistributionNotDisabledException
     * @throws PreconditionFailedException
     * @throws AccessDeniedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteStreamingDistribution(DeleteStreamingDistributionRequest deleteStreamingDistributionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Get the configuration information about a distribution.
     * </p>
     *
     * @param getDistributionConfigRequest Container for the necessary
     *           parameters to execute the GetDistributionConfig service method on
     *           AmazonCloudFront.
     * 
     * @return The response from the GetDistributionConfig service method, as
     *         returned by AmazonCloudFront.
     * 
     * @throws NoSuchDistributionException
     * @throws AccessDeniedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetDistributionConfigResult getDistributionConfig(GetDistributionConfigRequest getDistributionConfigRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Update a streaming distribution.
     * </p>
     *
     * @param updateStreamingDistributionRequest Container for the necessary
     *           parameters to execute the UpdateStreamingDistribution service method
     *           on AmazonCloudFront.
     * 
     * @return The response from the UpdateStreamingDistribution service
     *         method, as returned by AmazonCloudFront.
     * 
     * @throws InvalidIfMatchVersionException
     * @throws IllegalUpdateException
     * @throws MissingBodyException
     * @throws PreconditionFailedException
     * @throws CNAMEAlreadyExistsException
     * @throws InvalidArgumentException
     * @throws InconsistentQuantitiesException
     * @throws InvalidOriginAccessIdentityException
     * @throws TrustedSignerDoesNotExistException
     * @throws TooManyTrustedSignersException
     * @throws NoSuchStreamingDistributionException
     * @throws TooManyStreamingDistributionCNAMEsException
     * @throws AccessDeniedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateStreamingDistributionResult updateStreamingDistribution(UpdateStreamingDistributionRequest updateStreamingDistributionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Get the information about a distribution.
     * </p>
     *
     * @param getDistributionRequest Container for the necessary parameters
     *           to execute the GetDistribution service method on AmazonCloudFront.
     * 
     * @return The response from the GetDistribution service method, as
     *         returned by AmazonCloudFront.
     * 
     * @throws NoSuchDistributionException
     * @throws AccessDeniedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetDistributionResult getDistribution(GetDistributionRequest getDistributionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * List invalidation batches.
     * </p>
     *
     * @param listInvalidationsRequest Container for the necessary parameters
     *           to execute the ListInvalidations service method on AmazonCloudFront.
     * 
     * @return The response from the ListInvalidations service method, as
     *         returned by AmazonCloudFront.
     * 
     * @throws NoSuchDistributionException
     * @throws InvalidArgumentException
     * @throws AccessDeniedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListInvalidationsResult listInvalidations(ListInvalidationsRequest listInvalidationsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Update a distribution.
     * </p>
     *
     * @param updateDistributionRequest Container for the necessary
     *           parameters to execute the UpdateDistribution service method on
     *           AmazonCloudFront.
     * 
     * @return The response from the UpdateDistribution service method, as
     *         returned by AmazonCloudFront.
     * 
     * @throws TooManyCookieNamesInWhiteListException
     * @throws InvalidResponseCodeException
     * @throws MissingBodyException
     * @throws TooManyDistributionCNAMEsException
     * @throws NoSuchOriginException
     * @throws PreconditionFailedException
     * @throws InconsistentQuantitiesException
     * @throws CNAMEAlreadyExistsException
     * @throws InvalidArgumentException
     * @throws InvalidOriginAccessIdentityException
     * @throws TooManyCacheBehaviorsException
     * @throws TooManyTrustedSignersException
     * @throws NoSuchDistributionException
     * @throws InvalidViewerCertificateException
     * @throws TooManyOriginsException
     * @throws InvalidRequiredProtocolException
     * @throws InvalidDefaultRootObjectException
     * @throws InvalidIfMatchVersionException
     * @throws IllegalUpdateException
     * @throws InvalidForwardCookiesException
     * @throws TrustedSignerDoesNotExistException
     * @throws TooManyCertificatesException
     * @throws InvalidRelativePathException
     * @throws InvalidErrorCodeException
     * @throws AccessDeniedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public UpdateDistributionResult updateDistribution(UpdateDistributionRequest updateDistributionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Delete a distribution.
     * </p>
     *
     * @param deleteDistributionRequest Container for the necessary
     *           parameters to execute the DeleteDistribution service method on
     *           AmazonCloudFront.
     * 
     * 
     * @throws InvalidIfMatchVersionException
     * @throws NoSuchDistributionException
     * @throws DistributionNotDisabledException
     * @throws PreconditionFailedException
     * @throws AccessDeniedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteDistribution(DeleteDistributionRequest deleteDistributionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Create a new origin access identity.
     * </p>
     *
     * @param createCloudFrontOriginAccessIdentityRequest Container for the
     *           necessary parameters to execute the
     *           CreateCloudFrontOriginAccessIdentity service method on
     *           AmazonCloudFront.
     * 
     * @return The response from the CreateCloudFrontOriginAccessIdentity
     *         service method, as returned by AmazonCloudFront.
     * 
     * @throws TooManyCloudFrontOriginAccessIdentitiesException
     * @throws MissingBodyException
     * @throws InvalidArgumentException
     * @throws InconsistentQuantitiesException
     * @throws CloudFrontOriginAccessIdentityAlreadyExistsException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateCloudFrontOriginAccessIdentityResult createCloudFrontOriginAccessIdentity(CreateCloudFrontOriginAccessIdentityRequest createCloudFrontOriginAccessIdentityRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Get the information about a streaming distribution.
     * </p>
     *
     * @param getStreamingDistributionRequest Container for the necessary
     *           parameters to execute the GetStreamingDistribution service method on
     *           AmazonCloudFront.
     * 
     * @return The response from the GetStreamingDistribution service method,
     *         as returned by AmazonCloudFront.
     * 
     * @throws NoSuchStreamingDistributionException
     * @throws AccessDeniedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetStreamingDistributionResult getStreamingDistribution(GetStreamingDistributionRequest getStreamingDistributionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * List distributions.
     * </p>
     *
     * @param listDistributionsRequest Container for the necessary parameters
     *           to execute the ListDistributions service method on AmazonCloudFront.
     * 
     * @return The response from the ListDistributions service method, as
     *         returned by AmazonCloudFront.
     * 
     * @throws InvalidArgumentException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListDistributionsResult listDistributions(ListDistributionsRequest listDistributionsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Create a new streaming distribution.
     * </p>
     *
     * @param createStreamingDistributionRequest Container for the necessary
     *           parameters to execute the CreateStreamingDistribution service method
     *           on AmazonCloudFront.
     * 
     * @return The response from the CreateStreamingDistribution service
     *         method, as returned by AmazonCloudFront.
     * 
     * @throws TooManyTrustedSignersException
     * @throws MissingBodyException
     * @throws TooManyStreamingDistributionCNAMEsException
     * @throws StreamingDistributionAlreadyExistsException
     * @throws CNAMEAlreadyExistsException
     * @throws AccessDeniedException
     * @throws TooManyStreamingDistributionsException
     * @throws InvalidArgumentException
     * @throws InconsistentQuantitiesException
     * @throws InvalidOriginAccessIdentityException
     * @throws TrustedSignerDoesNotExistException
     * @throws InvalidOriginException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateStreamingDistributionResult createStreamingDistribution(CreateStreamingDistributionRequest createStreamingDistributionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * List origin access identities.
     * </p>
     *
     * @param listCloudFrontOriginAccessIdentitiesRequest Container for the
     *           necessary parameters to execute the
     *           ListCloudFrontOriginAccessIdentities service method on
     *           AmazonCloudFront.
     * 
     * @return The response from the ListCloudFrontOriginAccessIdentities
     *         service method, as returned by AmazonCloudFront.
     * 
     * @throws InvalidArgumentException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListCloudFrontOriginAccessIdentitiesResult listCloudFrontOriginAccessIdentities(ListCloudFrontOriginAccessIdentitiesRequest listCloudFrontOriginAccessIdentitiesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Delete an origin access identity.
     * </p>
     *
     * @param deleteCloudFrontOriginAccessIdentityRequest Container for the
     *           necessary parameters to execute the
     *           DeleteCloudFrontOriginAccessIdentity service method on
     *           AmazonCloudFront.
     * 
     * 
     * @throws InvalidIfMatchVersionException
     * @throws CloudFrontOriginAccessIdentityInUseException
     * @throws NoSuchCloudFrontOriginAccessIdentityException
     * @throws PreconditionFailedException
     * @throws AccessDeniedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deleteCloudFrontOriginAccessIdentity(DeleteCloudFrontOriginAccessIdentityRequest deleteCloudFrontOriginAccessIdentityRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Create a new distribution.
     * </p>
     *
     * @param createDistributionRequest Container for the necessary
     *           parameters to execute the CreateDistribution service method on
     *           AmazonCloudFront.
     * 
     * @return The response from the CreateDistribution service method, as
     *         returned by AmazonCloudFront.
     * 
     * @throws TooManyCookieNamesInWhiteListException
     * @throws InvalidDefaultRootObjectException
     * @throws InvalidResponseCodeException
     * @throws MissingBodyException
     * @throws TooManyDistributionCNAMEsException
     * @throws InvalidForwardCookiesException
     * @throws TooManyDistributionsException
     * @throws NoSuchOriginException
     * @throws InconsistentQuantitiesException
     * @throws InvalidArgumentException
     * @throws CNAMEAlreadyExistsException
     * @throws InvalidOriginAccessIdentityException
     * @throws TrustedSignerDoesNotExistException
     * @throws InvalidOriginException
     * @throws TooManyCertificatesException
     * @throws InvalidRelativePathException
     * @throws TooManyCacheBehaviorsException
     * @throws TooManyTrustedSignersException
     * @throws InvalidErrorCodeException
     * @throws InvalidViewerCertificateException
     * @throws AccessDeniedException
     * @throws TooManyOriginsException
     * @throws DistributionAlreadyExistsException
     * @throws InvalidRequiredProtocolException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreateDistributionResult createDistribution(CreateDistributionRequest createDistributionRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Get the information about an invalidation.
     * </p>
     *
     * @param getInvalidationRequest Container for the necessary parameters
     *           to execute the GetInvalidation service method on AmazonCloudFront.
     * 
     * @return The response from the GetInvalidation service method, as
     *         returned by AmazonCloudFront.
     * 
     * @throws NoSuchInvalidationException
     * @throws NoSuchDistributionException
     * @throws AccessDeniedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetInvalidationResult getInvalidation(GetInvalidationRequest getInvalidationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Get the configuration information about an origin access identity.
     * </p>
     *
     * @param getCloudFrontOriginAccessIdentityConfigRequest Container for
     *           the necessary parameters to execute the
     *           GetCloudFrontOriginAccessIdentityConfig service method on
     *           AmazonCloudFront.
     * 
     * @return The response from the GetCloudFrontOriginAccessIdentityConfig
     *         service method, as returned by AmazonCloudFront.
     * 
     * @throws NoSuchCloudFrontOriginAccessIdentityException
     * @throws AccessDeniedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetCloudFrontOriginAccessIdentityConfigResult getCloudFrontOriginAccessIdentityConfig(GetCloudFrontOriginAccessIdentityConfigRequest getCloudFrontOriginAccessIdentityConfigRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Get the information about an origin access identity.
     * </p>
     *
     * @param getCloudFrontOriginAccessIdentityRequest Container for the
     *           necessary parameters to execute the GetCloudFrontOriginAccessIdentity
     *           service method on AmazonCloudFront.
     * 
     * @return The response from the GetCloudFrontOriginAccessIdentity
     *         service method, as returned by AmazonCloudFront.
     * 
     * @throws NoSuchCloudFrontOriginAccessIdentityException
     * @throws AccessDeniedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetCloudFrontOriginAccessIdentityResult getCloudFrontOriginAccessIdentity(GetCloudFrontOriginAccessIdentityRequest getCloudFrontOriginAccessIdentityRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Get the configuration information about a streaming distribution.
     * </p>
     *
     * @param getStreamingDistributionConfigRequest Container for the
     *           necessary parameters to execute the GetStreamingDistributionConfig
     *           service method on AmazonCloudFront.
     * 
     * @return The response from the GetStreamingDistributionConfig service
     *         method, as returned by AmazonCloudFront.
     * 
     * @throws NoSuchStreamingDistributionException
     * @throws AccessDeniedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetStreamingDistributionConfigResult getStreamingDistributionConfig(GetStreamingDistributionConfigRequest getStreamingDistributionConfigRequest) 
            throws AmazonServiceException, AmazonClientException;

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
        