/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * This section provides documentation for the Amazon CodeGuru Reviewer API operations. CodeGuru Reviewer is a service
 * that uses program analysis and machine learning to detect potential defects that are difficult for developers to find
 * and recommendations to address them in your Java and Python code.
 * </p>
 * <p>
 * By proactively detecting and providing recommendations for addressing code defects and implementing best practices,
 * CodeGuru Reviewer improves the overall quality and maintainability of your code base during the code review stage.
 * For more information about CodeGuru Reviewer, see the <i> <a
 * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-ug/welcome.html">Amazon CodeGuru Reviewer User
 * Guide</a>.</i>
 * </p>
 * <p>
 * To improve the security of your CodeGuru Reviewer API calls, you can establish a private connection between your VPC
 * and CodeGuru Reviewer by creating an <i>interface VPC endpoint</i>. For more information, see <a
 * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-ug/vpc-interface-endpoints.html">CodeGuru Reviewer and
 * interface VPC endpoints (AWS PrivateLink)</a> in the <i>Amazon CodeGuru Reviewer User Guide</i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonCodeGuruReviewerAsync extends AmazonCodeGuruReviewer {

    /**
     * <p>
     * Use to associate an AWS CodeCommit repository or a repostory managed by AWS CodeStar Connections with Amazon
     * CodeGuru Reviewer. When you associate a repository, CodeGuru Reviewer reviews source code changes in the
     * repository's pull requests and provides automatic recommendations. You can view recommendations using the
     * CodeGuru Reviewer console. For more information, see <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-ug/recommendations.html">Recommendations in Amazon
     * CodeGuru Reviewer</a> in the <i>Amazon CodeGuru Reviewer User Guide.</i>
     * </p>
     * <p>
     * If you associate a CodeCommit repository, it must be in the same AWS Region and AWS account where its CodeGuru
     * Reviewer code reviews are configured.
     * </p>
     * <p>
     * Bitbucket and GitHub Enterprise Server repositories are managed by AWS CodeStar Connections to connect to
     * CodeGuru Reviewer. For more information, see <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-ug/getting-started-associate-repository.html"
     * >Associate a repository</a> in the <i>Amazon CodeGuru Reviewer User Guide.</i>
     * </p>
     * <note>
     * <p>
     * You cannot use the CodeGuru Reviewer SDK or the AWS CLI to associate a GitHub repository with Amazon CodeGuru
     * Reviewer. To associate a GitHub repository, use the console. For more information, see <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-ug/getting-started-with-guru.html">Getting started
     * with CodeGuru Reviewer</a> in the <i>CodeGuru Reviewer User Guide.</i>
     * </p>
     * </note>
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
     * Use to associate an AWS CodeCommit repository or a repostory managed by AWS CodeStar Connections with Amazon
     * CodeGuru Reviewer. When you associate a repository, CodeGuru Reviewer reviews source code changes in the
     * repository's pull requests and provides automatic recommendations. You can view recommendations using the
     * CodeGuru Reviewer console. For more information, see <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-ug/recommendations.html">Recommendations in Amazon
     * CodeGuru Reviewer</a> in the <i>Amazon CodeGuru Reviewer User Guide.</i>
     * </p>
     * <p>
     * If you associate a CodeCommit repository, it must be in the same AWS Region and AWS account where its CodeGuru
     * Reviewer code reviews are configured.
     * </p>
     * <p>
     * Bitbucket and GitHub Enterprise Server repositories are managed by AWS CodeStar Connections to connect to
     * CodeGuru Reviewer. For more information, see <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-ug/getting-started-associate-repository.html"
     * >Associate a repository</a> in the <i>Amazon CodeGuru Reviewer User Guide.</i>
     * </p>
     * <note>
     * <p>
     * You cannot use the CodeGuru Reviewer SDK or the AWS CLI to associate a GitHub repository with Amazon CodeGuru
     * Reviewer. To associate a GitHub repository, use the console. For more information, see <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-ug/getting-started-with-guru.html">Getting started
     * with CodeGuru Reviewer</a> in the <i>CodeGuru Reviewer User Guide.</i>
     * </p>
     * </note>
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
     * Use to create a code review with a <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CodeReviewType.html">
     * <code>CodeReviewType</code> </a> of <code>RepositoryAnalysis</code>. This type of code review analyzes all code
     * under a specified branch in an associated repository. <code>PullRequest</code> code reviews are automatically
     * triggered by a pull request so cannot be created using this method.
     * </p>
     * 
     * @param createCodeReviewRequest
     * @return A Java Future containing the result of the CreateCodeReview operation returned by the service.
     * @sample AmazonCodeGuruReviewerAsync.CreateCodeReview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/CreateCodeReview"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCodeReviewResult> createCodeReviewAsync(CreateCodeReviewRequest createCodeReviewRequest);

    /**
     * <p>
     * Use to create a code review with a <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CodeReviewType.html">
     * <code>CodeReviewType</code> </a> of <code>RepositoryAnalysis</code>. This type of code review analyzes all code
     * under a specified branch in an associated repository. <code>PullRequest</code> code reviews are automatically
     * triggered by a pull request so cannot be created using this method.
     * </p>
     * 
     * @param createCodeReviewRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCodeReview operation returned by the service.
     * @sample AmazonCodeGuruReviewerAsyncHandler.CreateCodeReview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/CreateCodeReview"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCodeReviewResult> createCodeReviewAsync(CreateCodeReviewRequest createCodeReviewRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCodeReviewRequest, CreateCodeReviewResult> asyncHandler);

    /**
     * <p>
     * Returns the metadata associated with the code review along with its status.
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
     * Returns the metadata associated with the code review along with its status.
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
     * Returns a <a href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociation.html">
     * <code>RepositoryAssociation</code> </a> object that contains information about the requested repository
     * association.
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
     * Returns a <a href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociation.html">
     * <code>RepositoryAssociation</code> </a> object that contains information about the requested repository
     * association.
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
     * Returns a list of <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RecommendationFeedbackSummary.html">
     * <code>RecommendationFeedbackSummary</code> </a> objects that contain customer recommendation feedback for all
     * CodeGuru Reviewer users.
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
     * Returns a list of <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RecommendationFeedbackSummary.html">
     * <code>RecommendationFeedbackSummary</code> </a> objects that contain customer recommendation feedback for all
     * CodeGuru Reviewer users.
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
     * Returns a list of <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociationSummary.html">
     * <code>RepositoryAssociationSummary</code> </a> objects that contain summary information about a repository
     * association. You can filter the returned list by <a href=
     * "https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociationSummary.html#reviewer-Type-RepositoryAssociationSummary-ProviderType"
     * > <code>ProviderType</code> </a>, <a href=
     * "https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociationSummary.html#reviewer-Type-RepositoryAssociationSummary-Name"
     * > <code>Name</code> </a>, <a href=
     * "https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociationSummary.html#reviewer-Type-RepositoryAssociationSummary-State"
     * > <code>State</code> </a>, and <a href=
     * "https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociationSummary.html#reviewer-Type-RepositoryAssociationSummary-Owner"
     * > <code>Owner</code> </a>.
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
     * Returns a list of <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociationSummary.html">
     * <code>RepositoryAssociationSummary</code> </a> objects that contain summary information about a repository
     * association. You can filter the returned list by <a href=
     * "https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociationSummary.html#reviewer-Type-RepositoryAssociationSummary-ProviderType"
     * > <code>ProviderType</code> </a>, <a href=
     * "https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociationSummary.html#reviewer-Type-RepositoryAssociationSummary-Name"
     * > <code>Name</code> </a>, <a href=
     * "https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociationSummary.html#reviewer-Type-RepositoryAssociationSummary-State"
     * > <code>State</code> </a>, and <a href=
     * "https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociationSummary.html#reviewer-Type-RepositoryAssociationSummary-Owner"
     * > <code>Owner</code> </a>.
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
     * Returns the list of tags associated with an associated repository resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonCodeGuruReviewerAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns the list of tags associated with an associated repository resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonCodeGuruReviewerAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Stores customer feedback for a CodeGuru Reviewer recommendation. When this API is called again with different
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
     * Stores customer feedback for a CodeGuru Reviewer recommendation. When this API is called again with different
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

    /**
     * <p>
     * Adds one or more tags to an associated repository.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonCodeGuruReviewerAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds one or more tags to an associated repository.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonCodeGuruReviewerAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes a tag from an associated repository.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonCodeGuruReviewerAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes a tag from an associated repository.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonCodeGuruReviewerAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

}
