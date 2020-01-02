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
     * request. You can view recommendations in the AWS CodeCommit repository.
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
     * request. You can view recommendations in the AWS CodeCommit repository.
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

}
