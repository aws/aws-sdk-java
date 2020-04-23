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

import com.amazonaws.services.codegurureviewer.model.*;

/**
 * Interface for accessing CodeGuruReviewer asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.codegurureviewer.AbstractAmazonCodeGuruReviewerAsync} instead.
 * </p>
 * <p>
 * <p>
 * This section provides documentation for the Amazon CodeGuru Reviewer API operations.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonCodeGuruReviewerAsync extends AmazonCodeGuruReviewer {

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
     * @return A Java Future containing the result of the AssociateRepository operation returned by the service.
     * @sample AmazonCodeGuruReviewerAsync.AssociateRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/AssociateRepository"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateRepositoryResult> associateRepositoryAsync(AssociateRepositoryRequest associateRepositoryRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateRepository operation returned by the service.
     * @sample AmazonCodeGuruReviewerAsyncHandler.AssociateRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/AssociateRepository"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateRepositoryResult> associateRepositoryAsync(AssociateRepositoryRequest associateRepositoryRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateRepositoryRequest, AssociateRepositoryResult> asyncHandler);

    /**
     * <p>
     * Returns the metadaata associated with the code review along with its status.
     * </p>
     * 
     * @param describeCodeReviewRequest
     * @return A Java Future containing the result of the DescribeCodeReview operation returned by the service.
     * @sample AmazonCodeGuruReviewerAsync.DescribeCodeReview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/DescribeCodeReview"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCodeReviewResult> describeCodeReviewAsync(DescribeCodeReviewRequest describeCodeReviewRequest);

    /**
     * <p>
     * Returns the metadaata associated with the code review along with its status.
     * </p>
     * 
     * @param describeCodeReviewRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCodeReview operation returned by the service.
     * @sample AmazonCodeGuruReviewerAsyncHandler.DescribeCodeReview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/DescribeCodeReview"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeCodeReviewResult> describeCodeReviewAsync(DescribeCodeReviewRequest describeCodeReviewRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCodeReviewRequest, DescribeCodeReviewResult> asyncHandler);

    /**
     * <p>
     * Describes the customer feedback for a CodeGuru Reviewer recommendation.
     * </p>
     * 
     * @param describeRecommendationFeedbackRequest
     * @return A Java Future containing the result of the DescribeRecommendationFeedback operation returned by the
     *         service.
     * @sample AmazonCodeGuruReviewerAsync.DescribeRecommendationFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/DescribeRecommendationFeedback"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRecommendationFeedbackResult> describeRecommendationFeedbackAsync(
            DescribeRecommendationFeedbackRequest describeRecommendationFeedbackRequest);

    /**
     * <p>
     * Describes the customer feedback for a CodeGuru Reviewer recommendation.
     * </p>
     * 
     * @param describeRecommendationFeedbackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRecommendationFeedback operation returned by the
     *         service.
     * @sample AmazonCodeGuruReviewerAsyncHandler.DescribeRecommendationFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/DescribeRecommendationFeedback"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRecommendationFeedbackResult> describeRecommendationFeedbackAsync(
            DescribeRecommendationFeedbackRequest describeRecommendationFeedbackRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRecommendationFeedbackRequest, DescribeRecommendationFeedbackResult> asyncHandler);

    /**
     * <p>
     * Describes a repository association.
     * </p>
     * 
     * @param describeRepositoryAssociationRequest
     * @return A Java Future containing the result of the DescribeRepositoryAssociation operation returned by the
     *         service.
     * @sample AmazonCodeGuruReviewerAsync.DescribeRepositoryAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/DescribeRepositoryAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRepositoryAssociationResult> describeRepositoryAssociationAsync(
            DescribeRepositoryAssociationRequest describeRepositoryAssociationRequest);

    /**
     * <p>
     * Describes a repository association.
     * </p>
     * 
     * @param describeRepositoryAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRepositoryAssociation operation returned by the
     *         service.
     * @sample AmazonCodeGuruReviewerAsyncHandler.DescribeRepositoryAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/DescribeRepositoryAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRepositoryAssociationResult> describeRepositoryAssociationAsync(
            DescribeRepositoryAssociationRequest describeRepositoryAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRepositoryAssociationRequest, DescribeRepositoryAssociationResult> asyncHandler);

    /**
     * <p>
     * Removes the association between Amazon CodeGuru Reviewer and a repository.
     * </p>
     * 
     * @param disassociateRepositoryRequest
     * @return A Java Future containing the result of the DisassociateRepository operation returned by the service.
     * @sample AmazonCodeGuruReviewerAsync.DisassociateRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/DisassociateRepository"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateRepositoryResult> disassociateRepositoryAsync(DisassociateRepositoryRequest disassociateRepositoryRequest);

    /**
     * <p>
     * Removes the association between Amazon CodeGuru Reviewer and a repository.
     * </p>
     * 
     * @param disassociateRepositoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateRepository operation returned by the service.
     * @sample AmazonCodeGuruReviewerAsyncHandler.DisassociateRepository
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/DisassociateRepository"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateRepositoryResult> disassociateRepositoryAsync(DisassociateRepositoryRequest disassociateRepositoryRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateRepositoryRequest, DisassociateRepositoryResult> asyncHandler);

    /**
     * <p>
     * Lists all the code reviews that the customer has created in the past 90 days.
     * </p>
     * 
     * @param listCodeReviewsRequest
     * @return A Java Future containing the result of the ListCodeReviews operation returned by the service.
     * @sample AmazonCodeGuruReviewerAsync.ListCodeReviews
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/ListCodeReviews"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCodeReviewsResult> listCodeReviewsAsync(ListCodeReviewsRequest listCodeReviewsRequest);

    /**
     * <p>
     * Lists all the code reviews that the customer has created in the past 90 days.
     * </p>
     * 
     * @param listCodeReviewsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCodeReviews operation returned by the service.
     * @sample AmazonCodeGuruReviewerAsyncHandler.ListCodeReviews
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/ListCodeReviews"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCodeReviewsResult> listCodeReviewsAsync(ListCodeReviewsRequest listCodeReviewsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCodeReviewsRequest, ListCodeReviewsResult> asyncHandler);

    /**
     * <p>
     * Lists the customer feedback for a CodeGuru Reviewer recommendation for all users. This API will be used from the
     * console to extract the previously given feedback by the user to pre-populate the feedback emojis for all
     * recommendations.
     * </p>
     * 
     * @param listRecommendationFeedbackRequest
     * @return A Java Future containing the result of the ListRecommendationFeedback operation returned by the service.
     * @sample AmazonCodeGuruReviewerAsync.ListRecommendationFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/ListRecommendationFeedback"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRecommendationFeedbackResult> listRecommendationFeedbackAsync(
            ListRecommendationFeedbackRequest listRecommendationFeedbackRequest);

    /**
     * <p>
     * Lists the customer feedback for a CodeGuru Reviewer recommendation for all users. This API will be used from the
     * console to extract the previously given feedback by the user to pre-populate the feedback emojis for all
     * recommendations.
     * </p>
     * 
     * @param listRecommendationFeedbackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRecommendationFeedback operation returned by the service.
     * @sample AmazonCodeGuruReviewerAsyncHandler.ListRecommendationFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/ListRecommendationFeedback"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRecommendationFeedbackResult> listRecommendationFeedbackAsync(
            ListRecommendationFeedbackRequest listRecommendationFeedbackRequest,
            com.amazonaws.handlers.AsyncHandler<ListRecommendationFeedbackRequest, ListRecommendationFeedbackResult> asyncHandler);

    /**
     * <p>
     * Returns the list of all recommendations for a completed code review.
     * </p>
     * 
     * @param listRecommendationsRequest
     * @return A Java Future containing the result of the ListRecommendations operation returned by the service.
     * @sample AmazonCodeGuruReviewerAsync.ListRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/ListRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRecommendationsResult> listRecommendationsAsync(ListRecommendationsRequest listRecommendationsRequest);

    /**
     * <p>
     * Returns the list of all recommendations for a completed code review.
     * </p>
     * 
     * @param listRecommendationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRecommendations operation returned by the service.
     * @sample AmazonCodeGuruReviewerAsyncHandler.ListRecommendations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/ListRecommendations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRecommendationsResult> listRecommendationsAsync(ListRecommendationsRequest listRecommendationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRecommendationsRequest, ListRecommendationsResult> asyncHandler);

    /**
     * <p>
     * Lists repository associations. You can optionally filter on one or more of the following recommendation
     * properties: provider types, states, names, and owners.
     * </p>
     * 
     * @param listRepositoryAssociationsRequest
     * @return A Java Future containing the result of the ListRepositoryAssociations operation returned by the service.
     * @sample AmazonCodeGuruReviewerAsync.ListRepositoryAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/ListRepositoryAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRepositoryAssociationsResult> listRepositoryAssociationsAsync(
            ListRepositoryAssociationsRequest listRepositoryAssociationsRequest);

    /**
     * <p>
     * Lists repository associations. You can optionally filter on one or more of the following recommendation
     * properties: provider types, states, names, and owners.
     * </p>
     * 
     * @param listRepositoryAssociationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRepositoryAssociations operation returned by the service.
     * @sample AmazonCodeGuruReviewerAsyncHandler.ListRepositoryAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/ListRepositoryAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRepositoryAssociationsResult> listRepositoryAssociationsAsync(
            ListRepositoryAssociationsRequest listRepositoryAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRepositoryAssociationsRequest, ListRepositoryAssociationsResult> asyncHandler);

    /**
     * <p>
     * Stores customer feedback for a CodeGuru-Reviewer recommendation. When this API is called again with different
     * reactions the previous feedback is overwritten.
     * </p>
     * 
     * @param putRecommendationFeedbackRequest
     * @return A Java Future containing the result of the PutRecommendationFeedback operation returned by the service.
     * @sample AmazonCodeGuruReviewerAsync.PutRecommendationFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/PutRecommendationFeedback"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutRecommendationFeedbackResult> putRecommendationFeedbackAsync(
            PutRecommendationFeedbackRequest putRecommendationFeedbackRequest);

    /**
     * <p>
     * Stores customer feedback for a CodeGuru-Reviewer recommendation. When this API is called again with different
     * reactions the previous feedback is overwritten.
     * </p>
     * 
     * @param putRecommendationFeedbackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutRecommendationFeedback operation returned by the service.
     * @sample AmazonCodeGuruReviewerAsyncHandler.PutRecommendationFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/PutRecommendationFeedback"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutRecommendationFeedbackResult> putRecommendationFeedbackAsync(
            PutRecommendationFeedbackRequest putRecommendationFeedbackRequest,
            com.amazonaws.handlers.AsyncHandler<PutRecommendationFeedbackRequest, PutRecommendationFeedbackResult> asyncHandler);

}
