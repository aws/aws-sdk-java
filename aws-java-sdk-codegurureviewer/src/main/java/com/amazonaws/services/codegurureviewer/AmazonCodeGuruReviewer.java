/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codegurureviewer;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.codegurureviewer.model.*;

/**
 * Interface for accessing CodeGuruReviewer.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.codegurureviewer.AbstractAmazonCodeGuruReviewer} instead.
 * </p>
 * <p>
 * <p>
 * This section provides documentation for the Amazon CodeGuru Reviewer API operations.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonCodeGuruReviewer {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "codeguru-reviewer";

    /**
     * <p>
     * Associates an AWS CodeCommit repository with Amazon CodeGuru Reviewer. When you associate an AWS CodeCommit
     * repository with Amazon CodeGuru Reviewer, Amazon CodeGuru Reviewer will provide recommendations for each pull
     * request raised within the repository. You can view recommendations in the AWS CodeCommit repository.
     * </p>
     * <p>
     * You can associate a GitHub repository using the Amazon CodeGuru Reviewer console.
     * </p>
     * 
     * @param associateRepositoryRequest
     * @return Result of the AssociateRepository operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonCodeGuruReviewer.AssociateRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/AssociateRepository"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateRepositoryResult associateRepository(AssociateRepositoryRequest associateRepositoryRequest);

    /**
     * <p>
     * Returns the metadaata associated with the code review along with its status.
     * </p>
     * 
     * @param describeCodeReviewRequest
     * @return Result of the DescribeCodeReview operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource specified in the request was not found.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonCodeGuruReviewer.DescribeCodeReview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/DescribeCodeReview"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeCodeReviewResult describeCodeReview(DescribeCodeReviewRequest describeCodeReviewRequest);

    /**
     * <p>
     * Describes the customer feedback for a CodeGuru Reviewer recommendation.
     * </p>
     * 
     * @param describeRecommendationFeedbackRequest
     * @return Result of the DescribeRecommendationFeedback operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource specified in the request was not found.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonCodeGuruReviewer.DescribeRecommendationFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/DescribeRecommendationFeedback"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeRecommendationFeedbackResult describeRecommendationFeedback(DescribeRecommendationFeedbackRequest describeRecommendationFeedbackRequest);

    /**
     * <p>
     * Describes a repository association.
     * </p>
     * 
     * @param describeRepositoryAssociationRequest
     * @return Result of the DescribeRepositoryAssociation operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonCodeGuruReviewer.DescribeRepositoryAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/DescribeRepositoryAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeRepositoryAssociationResult describeRepositoryAssociation(DescribeRepositoryAssociationRequest describeRepositoryAssociationRequest);

    /**
     * <p>
     * Removes the association between Amazon CodeGuru Reviewer and a repository.
     * </p>
     * 
     * @param disassociateRepositoryRequest
     * @return Result of the DisassociateRepository operation returned by the service.
     * @throws NotFoundException
     *         The resource specified in the request was not found.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonCodeGuruReviewer.DisassociateRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/DisassociateRepository"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateRepositoryResult disassociateRepository(DisassociateRepositoryRequest disassociateRepositoryRequest);

    /**
     * <p>
     * Lists all the code reviews that the customer has created in the past 90 days.
     * </p>
     * 
     * @param listCodeReviewsRequest
     * @return Result of the ListCodeReviews operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @sample AmazonCodeGuruReviewer.ListCodeReviews
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/ListCodeReviews"
     *      target="_top">AWS API Documentation</a>
     */
    ListCodeReviewsResult listCodeReviews(ListCodeReviewsRequest listCodeReviewsRequest);

    /**
     * <p>
     * Lists the customer feedback for a CodeGuru Reviewer recommendation for all users. This API will be used from the
     * console to extract the previously given feedback by the user to pre-populate the feedback emojis for all
     * recommendations.
     * </p>
     * 
     * @param listRecommendationFeedbackRequest
     * @return Result of the ListRecommendationFeedback operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource specified in the request was not found.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonCodeGuruReviewer.ListRecommendationFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/ListRecommendationFeedback"
     *      target="_top">AWS API Documentation</a>
     */
    ListRecommendationFeedbackResult listRecommendationFeedback(ListRecommendationFeedbackRequest listRecommendationFeedbackRequest);

    /**
     * <p>
     * Returns the list of all recommendations for a completed code review.
     * </p>
     * 
     * @param listRecommendationsRequest
     * @return Result of the ListRecommendations operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource specified in the request was not found.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonCodeGuruReviewer.ListRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/ListRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    ListRecommendationsResult listRecommendations(ListRecommendationsRequest listRecommendationsRequest);

    /**
     * <p>
     * Lists repository associations. You can optionally filter on one or more of the following recommendation
     * properties: provider types, states, names, and owners.
     * </p>
     * 
     * @param listRepositoryAssociationsRequest
     * @return Result of the ListRepositoryAssociations operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonCodeGuruReviewer.ListRepositoryAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/ListRepositoryAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    ListRepositoryAssociationsResult listRepositoryAssociations(ListRepositoryAssociationsRequest listRepositoryAssociationsRequest);

    /**
     * <p>
     * Stores customer feedback for a CodeGuru-Reviewer recommendation. When this API is called again with different
     * reactions the previous feedback is overwritten.
     * </p>
     * 
     * @param putRecommendationFeedbackRequest
     * @return Result of the PutRecommendationFeedback operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource specified in the request was not found.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonCodeGuruReviewer.PutRecommendationFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/PutRecommendationFeedback"
     *      target="_top">AWS API Documentation</a>
     */
    PutRecommendationFeedbackResult putRecommendationFeedback(PutRecommendationFeedbackRequest putRecommendationFeedbackRequest);

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
