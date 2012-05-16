/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudfront_2012_03_15;

import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.cloudfront_2012_03_15.model.CreateCloudFrontOriginAccessIdentityRequest;
import com.amazonaws.services.cloudfront_2012_03_15.model.CreateCloudFrontOriginAccessIdentityResult;
import com.amazonaws.services.cloudfront_2012_03_15.model.CreateDistributionRequest;
import com.amazonaws.services.cloudfront_2012_03_15.model.CreateDistributionResult;
import com.amazonaws.services.cloudfront_2012_03_15.model.CreateInvalidationRequest;
import com.amazonaws.services.cloudfront_2012_03_15.model.CreateInvalidationResult;
import com.amazonaws.services.cloudfront_2012_03_15.model.CreateStreamingDistributionRequest;
import com.amazonaws.services.cloudfront_2012_03_15.model.CreateStreamingDistributionResult;
import com.amazonaws.services.cloudfront_2012_03_15.model.DeleteCloudFrontOriginAccessIdentityRequest;
import com.amazonaws.services.cloudfront_2012_03_15.model.DeleteDistributionRequest;
import com.amazonaws.services.cloudfront_2012_03_15.model.DeleteStreamingDistributionRequest;
import com.amazonaws.services.cloudfront_2012_03_15.model.GetCloudFrontOriginAccessIdentityConfigRequest;
import com.amazonaws.services.cloudfront_2012_03_15.model.GetCloudFrontOriginAccessIdentityConfigResult;
import com.amazonaws.services.cloudfront_2012_03_15.model.GetCloudFrontOriginAccessIdentityRequest;
import com.amazonaws.services.cloudfront_2012_03_15.model.GetCloudFrontOriginAccessIdentityResult;
import com.amazonaws.services.cloudfront_2012_03_15.model.GetDistributionConfigRequest;
import com.amazonaws.services.cloudfront_2012_03_15.model.GetDistributionConfigResult;
import com.amazonaws.services.cloudfront_2012_03_15.model.GetDistributionRequest;
import com.amazonaws.services.cloudfront_2012_03_15.model.GetDistributionResult;
import com.amazonaws.services.cloudfront_2012_03_15.model.GetInvalidationRequest;
import com.amazonaws.services.cloudfront_2012_03_15.model.GetInvalidationResult;
import com.amazonaws.services.cloudfront_2012_03_15.model.GetStreamingDistributionConfigRequest;
import com.amazonaws.services.cloudfront_2012_03_15.model.GetStreamingDistributionConfigResult;
import com.amazonaws.services.cloudfront_2012_03_15.model.GetStreamingDistributionRequest;
import com.amazonaws.services.cloudfront_2012_03_15.model.GetStreamingDistributionResult;
import com.amazonaws.services.cloudfront_2012_03_15.model.ListCloudFrontOriginAccessIdentitiesRequest;
import com.amazonaws.services.cloudfront_2012_03_15.model.ListCloudFrontOriginAccessIdentitiesResult;
import com.amazonaws.services.cloudfront_2012_03_15.model.ListDistributionsRequest;
import com.amazonaws.services.cloudfront_2012_03_15.model.ListDistributionsResult;
import com.amazonaws.services.cloudfront_2012_03_15.model.ListInvalidationsRequest;
import com.amazonaws.services.cloudfront_2012_03_15.model.ListInvalidationsResult;
import com.amazonaws.services.cloudfront_2012_03_15.model.ListStreamingDistributionsRequest;
import com.amazonaws.services.cloudfront_2012_03_15.model.ListStreamingDistributionsResult;
import com.amazonaws.services.cloudfront_2012_03_15.model.UpdateCloudFrontOriginAccessIdentityRequest;
import com.amazonaws.services.cloudfront_2012_03_15.model.UpdateCloudFrontOriginAccessIdentityResult;
import com.amazonaws.services.cloudfront_2012_03_15.model.UpdateDistributionRequest;
import com.amazonaws.services.cloudfront_2012_03_15.model.UpdateDistributionResult;
import com.amazonaws.services.cloudfront_2012_03_15.model.UpdateStreamingDistributionRequest;
import com.amazonaws.services.cloudfront_2012_03_15.model.UpdateStreamingDistributionResult;

/**
 * Interface for accessing AmazonCloudFront asynchronously,
 * using Java Futures.
 *
 * @deprecated The Amazon CloudFront client in this namespace uses an older API version.
 *             This client is available to help customers as they migrate to the new API version.
 */
@Deprecated
public interface AmazonCloudFrontAsync extends AmazonCloudFront {
    /**
     * <p>
     * Delete an origin access identity.
     * </p>
     *
     * @param deleteCloudFrontOriginAccessIdentityRequest Container for the
     *           necessary parameters to execute the
     *           DeleteCloudFrontOriginAccessIdentity operation on AmazonCloudFront.
     *
     * @return A Java Future object containing the response from the
     *         DeleteCloudFrontOriginAccessIdentity service method, as returned by
     *         AmazonCloudFront.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteCloudFrontOriginAccessIdentityAsync(DeleteCloudFrontOriginAccessIdentityRequest deleteCloudFrontOriginAccessIdentityRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Get the configuration information about a streaming distribution.
     * </p>
     *
     * @param getStreamingDistributionConfigRequest Container for the
     *           necessary parameters to execute the GetStreamingDistributionConfig
     *           operation on AmazonCloudFront.
     *
     * @return A Java Future object containing the response from the
     *         GetStreamingDistributionConfig service method, as returned by
     *         AmazonCloudFront.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetStreamingDistributionConfigResult> getStreamingDistributionConfigAsync(GetStreamingDistributionConfigRequest getStreamingDistributionConfigRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Get the information about an invalidation.
     * </p>
     *
     * @param getInvalidationRequest Container for the necessary parameters
     *           to execute the GetInvalidation operation on AmazonCloudFront.
     *
     * @return A Java Future object containing the response from the
     *         GetInvalidation service method, as returned by AmazonCloudFront.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetInvalidationResult> getInvalidationAsync(GetInvalidationRequest getInvalidationRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Delete a streaming distribution.
     * </p>
     *
     * @param deleteStreamingDistributionRequest Container for the necessary
     *           parameters to execute the DeleteStreamingDistribution operation on
     *           AmazonCloudFront.
     *
     * @return A Java Future object containing the response from the
     *         DeleteStreamingDistribution service method, as returned by
     *         AmazonCloudFront.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteStreamingDistributionAsync(DeleteStreamingDistributionRequest deleteStreamingDistributionRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Create a new streaming distribution.
     * </p>
     *
     * @param createStreamingDistributionRequest Container for the necessary
     *           parameters to execute the CreateStreamingDistribution operation on
     *           AmazonCloudFront.
     *
     * @return A Java Future object containing the response from the
     *         CreateStreamingDistribution service method, as returned by
     *         AmazonCloudFront.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateStreamingDistributionResult> createStreamingDistributionAsync(CreateStreamingDistributionRequest createStreamingDistributionRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Create a new distribution.
     * </p>
     *
     * @param createDistributionRequest Container for the necessary
     *           parameters to execute the CreateDistribution operation on
     *           AmazonCloudFront.
     *
     * @return A Java Future object containing the response from the
     *         CreateDistribution service method, as returned by AmazonCloudFront.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateDistributionResult> createDistributionAsync(CreateDistributionRequest createDistributionRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Delete a distribution.
     * </p>
     *
     * @param deleteDistributionRequest Container for the necessary
     *           parameters to execute the DeleteDistribution operation on
     *           AmazonCloudFront.
     *
     * @return A Java Future object containing the response from the
     *         DeleteDistribution service method, as returned by AmazonCloudFront.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<Void> deleteDistributionAsync(DeleteDistributionRequest deleteDistributionRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Update a distribution.
     * </p>
     *
     * @param updateDistributionRequest Container for the necessary
     *           parameters to execute the UpdateDistribution operation on
     *           AmazonCloudFront.
     *
     * @return A Java Future object containing the response from the
     *         UpdateDistribution service method, as returned by AmazonCloudFront.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateDistributionResult> updateDistributionAsync(UpdateDistributionRequest updateDistributionRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Update a streaming distribution.
     * </p>
     *
     * @param updateStreamingDistributionRequest Container for the necessary
     *           parameters to execute the UpdateStreamingDistribution operation on
     *           AmazonCloudFront.
     *
     * @return A Java Future object containing the response from the
     *         UpdateStreamingDistribution service method, as returned by
     *         AmazonCloudFront.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateStreamingDistributionResult> updateStreamingDistributionAsync(UpdateStreamingDistributionRequest updateStreamingDistributionRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Create a new origin access identity.
     * </p>
     *
     * @param createCloudFrontOriginAccessIdentityRequest Container for the
     *           necessary parameters to execute the
     *           CreateCloudFrontOriginAccessIdentity operation on AmazonCloudFront.
     *
     * @return A Java Future object containing the response from the
     *         CreateCloudFrontOriginAccessIdentity service method, as returned by
     *         AmazonCloudFront.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateCloudFrontOriginAccessIdentityResult> createCloudFrontOriginAccessIdentityAsync(CreateCloudFrontOriginAccessIdentityRequest createCloudFrontOriginAccessIdentityRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Get the information about a distribution.
     * </p>
     *
     * @param getDistributionRequest Container for the necessary parameters
     *           to execute the GetDistribution operation on AmazonCloudFront.
     *
     * @return A Java Future object containing the response from the
     *         GetDistribution service method, as returned by AmazonCloudFront.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetDistributionResult> getDistributionAsync(GetDistributionRequest getDistributionRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Get the configuration information about an origin access identity.
     * </p>
     *
     * @param getCloudFrontOriginAccessIdentityConfigRequest Container for
     *           the necessary parameters to execute the
     *           GetCloudFrontOriginAccessIdentityConfig operation on AmazonCloudFront.
     *
     * @return A Java Future object containing the response from the
     *         GetCloudFrontOriginAccessIdentityConfig service method, as returned by
     *         AmazonCloudFront.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetCloudFrontOriginAccessIdentityConfigResult> getCloudFrontOriginAccessIdentityConfigAsync(GetCloudFrontOriginAccessIdentityConfigRequest getCloudFrontOriginAccessIdentityConfigRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Get the information about a streaming distribution.
     * </p>
     *
     * @param getStreamingDistributionRequest Container for the necessary
     *           parameters to execute the GetStreamingDistribution operation on
     *           AmazonCloudFront.
     *
     * @return A Java Future object containing the response from the
     *         GetStreamingDistribution service method, as returned by
     *         AmazonCloudFront.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetStreamingDistributionResult> getStreamingDistributionAsync(GetStreamingDistributionRequest getStreamingDistributionRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * List distributions.
     * </p>
     *
     * @param listDistributionsRequest Container for the necessary parameters
     *           to execute the ListDistributions operation on AmazonCloudFront.
     *
     * @return A Java Future object containing the response from the
     *         ListDistributions service method, as returned by AmazonCloudFront.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListDistributionsResult> listDistributionsAsync(ListDistributionsRequest listDistributionsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Update an origin access identity.
     * </p>
     *
     * @param updateCloudFrontOriginAccessIdentityRequest Container for the
     *           necessary parameters to execute the
     *           UpdateCloudFrontOriginAccessIdentity operation on AmazonCloudFront.
     *
     * @return A Java Future object containing the response from the
     *         UpdateCloudFrontOriginAccessIdentity service method, as returned by
     *         AmazonCloudFront.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateCloudFrontOriginAccessIdentityResult> updateCloudFrontOriginAccessIdentityAsync(UpdateCloudFrontOriginAccessIdentityRequest updateCloudFrontOriginAccessIdentityRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Get the configuration information about a distribution.
     * </p>
     *
     * @param getDistributionConfigRequest Container for the necessary
     *           parameters to execute the GetDistributionConfig operation on
     *           AmazonCloudFront.
     *
     * @return A Java Future object containing the response from the
     *         GetDistributionConfig service method, as returned by AmazonCloudFront.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetDistributionConfigResult> getDistributionConfigAsync(GetDistributionConfigRequest getDistributionConfigRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Get the information about an origin access identity.
     * </p>
     *
     * @param getCloudFrontOriginAccessIdentityRequest Container for the
     *           necessary parameters to execute the GetCloudFrontOriginAccessIdentity
     *           operation on AmazonCloudFront.
     *
     * @return A Java Future object containing the response from the
     *         GetCloudFrontOriginAccessIdentity service method, as returned by
     *         AmazonCloudFront.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<GetCloudFrontOriginAccessIdentityResult> getCloudFrontOriginAccessIdentityAsync(GetCloudFrontOriginAccessIdentityRequest getCloudFrontOriginAccessIdentityRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * Create a new invalidation.
     * </p>
     *
     * @param createInvalidationRequest Container for the necessary
     *           parameters to execute the CreateInvalidation operation on
     *           AmazonCloudFront.
     *
     * @return A Java Future object containing the response from the
     *         CreateInvalidation service method, as returned by AmazonCloudFront.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateInvalidationResult> createInvalidationAsync(CreateInvalidationRequest createInvalidationRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * List origin access identities.
     * </p>
     *
     * @param listCloudFrontOriginAccessIdentitiesRequest Container for the
     *           necessary parameters to execute the
     *           ListCloudFrontOriginAccessIdentities operation on AmazonCloudFront.
     *
     * @return A Java Future object containing the response from the
     *         ListCloudFrontOriginAccessIdentities service method, as returned by
     *         AmazonCloudFront.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListCloudFrontOriginAccessIdentitiesResult> listCloudFrontOriginAccessIdentitiesAsync(ListCloudFrontOriginAccessIdentitiesRequest listCloudFrontOriginAccessIdentitiesRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * List streaming distributions.
     * </p>
     *
     * @param listStreamingDistributionsRequest Container for the necessary
     *           parameters to execute the ListStreamingDistributions operation on
     *           AmazonCloudFront.
     *
     * @return A Java Future object containing the response from the
     *         ListStreamingDistributions service method, as returned by
     *         AmazonCloudFront.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListStreamingDistributionsResult> listStreamingDistributionsAsync(ListStreamingDistributionsRequest listStreamingDistributionsRequest)
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * List invalidation batches.
     * </p>
     *
     * @param listInvalidationsRequest Container for the necessary parameters
     *           to execute the ListInvalidations operation on AmazonCloudFront.
     *
     * @return A Java Future object containing the response from the
     *         ListInvalidations service method, as returned by AmazonCloudFront.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AmazonCloudFront indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListInvalidationsResult> listInvalidationsAsync(ListInvalidationsRequest listInvalidationsRequest)
            throws AmazonServiceException, AmazonClientException;

}
