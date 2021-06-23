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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.codegurureviewer.model.*;
import com.amazonaws.services.codegurureviewer.waiters.AmazonCodeGuruReviewerWaiters;

/**
 * Interface for accessing CodeGuruReviewer.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.codegurureviewer.AbstractAmazonCodeGuruReviewer} instead.
 * </p>
 * <p>
 * <p>
 * This section provides documentation for the Amazon CodeGuru Reviewer API operations. CodeGuru Reviewer is a service
 * that uses program analysis and machine learning to detect potential defects that are difficult for developers to find
 * and recommends fixes in your Java and Python code.
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
     * Use to associate an AWS CodeCommit repository or a repostory managed by AWS CodeStar Connections with Amazon
     * CodeGuru Reviewer. When you associate a repository, CodeGuru Reviewer reviews source code changes in the
     * repository's pull requests and provides automatic recommendations. You can view recommendations using the
     * CodeGuru Reviewer console. For more information, see <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-ug/recommendations.html">Recommendations in Amazon
     * CodeGuru Reviewer</a> in the <i>Amazon CodeGuru Reviewer User Guide.</i>
     * </p>
     * <p>
     * If you associate a CodeCommit or S3 repository, it must be in the same AWS Region and AWS account where its
     * CodeGuru Reviewer code reviews are configured.
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
     * Use to create a code review with a <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_CodeReviewType.html">
     * <code>CodeReviewType</code> </a> of <code>RepositoryAnalysis</code>. This type of code review analyzes all code
     * under a specified branch in an associated repository. <code>PullRequest</code> code reviews are automatically
     * triggered by a pull request.
     * </p>
     * 
     * @param createCodeReviewRequest
     * @return Result of the CreateCodeReview operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource specified in the request was not found.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AmazonCodeGuruReviewer.CreateCodeReview
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/CreateCodeReview"
     *      target="_top">AWS API Documentation</a>
     */
    CreateCodeReviewResult createCodeReview(CreateCodeReviewRequest createCodeReviewRequest);

    /**
     * <p>
     * Returns the metadata associated with the code review along with its status.
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
     * Returns a <a href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RepositoryAssociation.html">
     * <code>RepositoryAssociation</code> </a> object that contains information about the requested repository
     * association.
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
     * Returns a list of <a
     * href="https://docs.aws.amazon.com/codeguru/latest/reviewer-api/API_RecommendationFeedbackSummary.html">
     * <code>RecommendationFeedbackSummary</code> </a> objects that contain customer recommendation feedback for all
     * CodeGuru Reviewer users.
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
     * Returns the list of tags associated with an associated repository resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ResourceNotFoundException
     *         The resource specified in the request was not found.
     * @sample AmazonCodeGuruReviewer.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Stores customer feedback for a CodeGuru Reviewer recommendation. When this API is called again with different
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
     * <p>
     * Adds one or more tags to an associated repository.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ResourceNotFoundException
     *         The resource specified in the request was not found.
     * @sample AmazonCodeGuruReviewer.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes a tag from an associated repository.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws ResourceNotFoundException
     *         The resource specified in the request was not found.
     * @sample AmazonCodeGuruReviewer.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

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

    AmazonCodeGuruReviewerWaiters waiters();

}
