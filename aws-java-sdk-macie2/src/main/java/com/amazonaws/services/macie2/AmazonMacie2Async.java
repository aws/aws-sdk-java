/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.macie2;

import javax.annotation.Generated;

import com.amazonaws.services.macie2.model.*;

/**
 * Interface for accessing Amazon Macie 2 asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.macie2.AbstractAmazonMacie2Async} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Macie
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonMacie2Async extends AmazonMacie2 {

    /**
     * <p>
     * Accepts an Amazon Macie membership invitation that was received from a specific account.
     * </p>
     * 
     * @param acceptInvitationRequest
     * @return A Java Future containing the result of the AcceptInvitation operation returned by the service.
     * @sample AmazonMacie2Async.AcceptInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/AcceptInvitation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AcceptInvitationResult> acceptInvitationAsync(AcceptInvitationRequest acceptInvitationRequest);

    /**
     * <p>
     * Accepts an Amazon Macie membership invitation that was received from a specific account.
     * </p>
     * 
     * @param acceptInvitationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AcceptInvitation operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.AcceptInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/AcceptInvitation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AcceptInvitationResult> acceptInvitationAsync(AcceptInvitationRequest acceptInvitationRequest,
            com.amazonaws.handlers.AsyncHandler<AcceptInvitationRequest, AcceptInvitationResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about one or more custom data identifiers.
     * </p>
     * 
     * @param batchGetCustomDataIdentifiersRequest
     * @return A Java Future containing the result of the BatchGetCustomDataIdentifiers operation returned by the
     *         service.
     * @sample AmazonMacie2Async.BatchGetCustomDataIdentifiers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/BatchGetCustomDataIdentifiers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetCustomDataIdentifiersResult> batchGetCustomDataIdentifiersAsync(
            BatchGetCustomDataIdentifiersRequest batchGetCustomDataIdentifiersRequest);

    /**
     * <p>
     * Retrieves information about one or more custom data identifiers.
     * </p>
     * 
     * @param batchGetCustomDataIdentifiersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetCustomDataIdentifiers operation returned by the
     *         service.
     * @sample AmazonMacie2AsyncHandler.BatchGetCustomDataIdentifiers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/BatchGetCustomDataIdentifiers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetCustomDataIdentifiersResult> batchGetCustomDataIdentifiersAsync(
            BatchGetCustomDataIdentifiersRequest batchGetCustomDataIdentifiersRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetCustomDataIdentifiersRequest, BatchGetCustomDataIdentifiersResult> asyncHandler);

    /**
     * <p>
     * Creates and defines the settings for an allow list.
     * </p>
     * 
     * @param createAllowListRequest
     * @return A Java Future containing the result of the CreateAllowList operation returned by the service.
     * @sample AmazonMacie2Async.CreateAllowList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/CreateAllowList" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAllowListResult> createAllowListAsync(CreateAllowListRequest createAllowListRequest);

    /**
     * <p>
     * Creates and defines the settings for an allow list.
     * </p>
     * 
     * @param createAllowListRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAllowList operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.CreateAllowList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/CreateAllowList" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAllowListResult> createAllowListAsync(CreateAllowListRequest createAllowListRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAllowListRequest, CreateAllowListResult> asyncHandler);

    /**
     * <p>
     * Creates and defines the settings for a classification job.
     * </p>
     * 
     * @param createClassificationJobRequest
     * @return A Java Future containing the result of the CreateClassificationJob operation returned by the service.
     * @sample AmazonMacie2Async.CreateClassificationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/CreateClassificationJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateClassificationJobResult> createClassificationJobAsync(CreateClassificationJobRequest createClassificationJobRequest);

    /**
     * <p>
     * Creates and defines the settings for a classification job.
     * </p>
     * 
     * @param createClassificationJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateClassificationJob operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.CreateClassificationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/CreateClassificationJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateClassificationJobResult> createClassificationJobAsync(CreateClassificationJobRequest createClassificationJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateClassificationJobRequest, CreateClassificationJobResult> asyncHandler);

    /**
     * <p>
     * Creates and defines the criteria and other settings for a custom data identifier.
     * </p>
     * 
     * @param createCustomDataIdentifierRequest
     * @return A Java Future containing the result of the CreateCustomDataIdentifier operation returned by the service.
     * @sample AmazonMacie2Async.CreateCustomDataIdentifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/CreateCustomDataIdentifier"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCustomDataIdentifierResult> createCustomDataIdentifierAsync(
            CreateCustomDataIdentifierRequest createCustomDataIdentifierRequest);

    /**
     * <p>
     * Creates and defines the criteria and other settings for a custom data identifier.
     * </p>
     * 
     * @param createCustomDataIdentifierRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCustomDataIdentifier operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.CreateCustomDataIdentifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/CreateCustomDataIdentifier"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateCustomDataIdentifierResult> createCustomDataIdentifierAsync(
            CreateCustomDataIdentifierRequest createCustomDataIdentifierRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCustomDataIdentifierRequest, CreateCustomDataIdentifierResult> asyncHandler);

    /**
     * <p>
     * Creates and defines the criteria and other settings for a findings filter.
     * </p>
     * 
     * @param createFindingsFilterRequest
     * @return A Java Future containing the result of the CreateFindingsFilter operation returned by the service.
     * @sample AmazonMacie2Async.CreateFindingsFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/CreateFindingsFilter" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateFindingsFilterResult> createFindingsFilterAsync(CreateFindingsFilterRequest createFindingsFilterRequest);

    /**
     * <p>
     * Creates and defines the criteria and other settings for a findings filter.
     * </p>
     * 
     * @param createFindingsFilterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFindingsFilter operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.CreateFindingsFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/CreateFindingsFilter" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateFindingsFilterResult> createFindingsFilterAsync(CreateFindingsFilterRequest createFindingsFilterRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFindingsFilterRequest, CreateFindingsFilterResult> asyncHandler);

    /**
     * <p>
     * Sends an Amazon Macie membership invitation to one or more accounts.
     * </p>
     * 
     * @param createInvitationsRequest
     * @return A Java Future containing the result of the CreateInvitations operation returned by the service.
     * @sample AmazonMacie2Async.CreateInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/CreateInvitations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateInvitationsResult> createInvitationsAsync(CreateInvitationsRequest createInvitationsRequest);

    /**
     * <p>
     * Sends an Amazon Macie membership invitation to one or more accounts.
     * </p>
     * 
     * @param createInvitationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateInvitations operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.CreateInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/CreateInvitations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateInvitationsResult> createInvitationsAsync(CreateInvitationsRequest createInvitationsRequest,
            com.amazonaws.handlers.AsyncHandler<CreateInvitationsRequest, CreateInvitationsResult> asyncHandler);

    /**
     * <p>
     * Associates an account with an Amazon Macie administrator account.
     * </p>
     * 
     * @param createMemberRequest
     * @return A Java Future containing the result of the CreateMember operation returned by the service.
     * @sample AmazonMacie2Async.CreateMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/CreateMember" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateMemberResult> createMemberAsync(CreateMemberRequest createMemberRequest);

    /**
     * <p>
     * Associates an account with an Amazon Macie administrator account.
     * </p>
     * 
     * @param createMemberRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMember operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.CreateMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/CreateMember" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateMemberResult> createMemberAsync(CreateMemberRequest createMemberRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMemberRequest, CreateMemberResult> asyncHandler);

    /**
     * <p>
     * Creates sample findings.
     * </p>
     * 
     * @param createSampleFindingsRequest
     * @return A Java Future containing the result of the CreateSampleFindings operation returned by the service.
     * @sample AmazonMacie2Async.CreateSampleFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/CreateSampleFindings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateSampleFindingsResult> createSampleFindingsAsync(CreateSampleFindingsRequest createSampleFindingsRequest);

    /**
     * <p>
     * Creates sample findings.
     * </p>
     * 
     * @param createSampleFindingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSampleFindings operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.CreateSampleFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/CreateSampleFindings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateSampleFindingsResult> createSampleFindingsAsync(CreateSampleFindingsRequest createSampleFindingsRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSampleFindingsRequest, CreateSampleFindingsResult> asyncHandler);

    /**
     * <p>
     * Declines Amazon Macie membership invitations that were received from specific accounts.
     * </p>
     * 
     * @param declineInvitationsRequest
     * @return A Java Future containing the result of the DeclineInvitations operation returned by the service.
     * @sample AmazonMacie2Async.DeclineInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DeclineInvitations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeclineInvitationsResult> declineInvitationsAsync(DeclineInvitationsRequest declineInvitationsRequest);

    /**
     * <p>
     * Declines Amazon Macie membership invitations that were received from specific accounts.
     * </p>
     * 
     * @param declineInvitationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeclineInvitations operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.DeclineInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DeclineInvitations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeclineInvitationsResult> declineInvitationsAsync(DeclineInvitationsRequest declineInvitationsRequest,
            com.amazonaws.handlers.AsyncHandler<DeclineInvitationsRequest, DeclineInvitationsResult> asyncHandler);

    /**
     * <p>
     * Deletes an allow list.
     * </p>
     * 
     * @param deleteAllowListRequest
     * @return A Java Future containing the result of the DeleteAllowList operation returned by the service.
     * @sample AmazonMacie2Async.DeleteAllowList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DeleteAllowList" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAllowListResult> deleteAllowListAsync(DeleteAllowListRequest deleteAllowListRequest);

    /**
     * <p>
     * Deletes an allow list.
     * </p>
     * 
     * @param deleteAllowListRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAllowList operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.DeleteAllowList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DeleteAllowList" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAllowListResult> deleteAllowListAsync(DeleteAllowListRequest deleteAllowListRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAllowListRequest, DeleteAllowListResult> asyncHandler);

    /**
     * <p>
     * Soft deletes a custom data identifier.
     * </p>
     * 
     * @param deleteCustomDataIdentifierRequest
     * @return A Java Future containing the result of the DeleteCustomDataIdentifier operation returned by the service.
     * @sample AmazonMacie2Async.DeleteCustomDataIdentifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DeleteCustomDataIdentifier"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCustomDataIdentifierResult> deleteCustomDataIdentifierAsync(
            DeleteCustomDataIdentifierRequest deleteCustomDataIdentifierRequest);

    /**
     * <p>
     * Soft deletes a custom data identifier.
     * </p>
     * 
     * @param deleteCustomDataIdentifierRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCustomDataIdentifier operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.DeleteCustomDataIdentifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DeleteCustomDataIdentifier"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCustomDataIdentifierResult> deleteCustomDataIdentifierAsync(
            DeleteCustomDataIdentifierRequest deleteCustomDataIdentifierRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCustomDataIdentifierRequest, DeleteCustomDataIdentifierResult> asyncHandler);

    /**
     * <p>
     * Deletes a findings filter.
     * </p>
     * 
     * @param deleteFindingsFilterRequest
     * @return A Java Future containing the result of the DeleteFindingsFilter operation returned by the service.
     * @sample AmazonMacie2Async.DeleteFindingsFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DeleteFindingsFilter" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFindingsFilterResult> deleteFindingsFilterAsync(DeleteFindingsFilterRequest deleteFindingsFilterRequest);

    /**
     * <p>
     * Deletes a findings filter.
     * </p>
     * 
     * @param deleteFindingsFilterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFindingsFilter operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.DeleteFindingsFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DeleteFindingsFilter" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFindingsFilterResult> deleteFindingsFilterAsync(DeleteFindingsFilterRequest deleteFindingsFilterRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFindingsFilterRequest, DeleteFindingsFilterResult> asyncHandler);

    /**
     * <p>
     * Deletes Amazon Macie membership invitations that were received from specific accounts.
     * </p>
     * 
     * @param deleteInvitationsRequest
     * @return A Java Future containing the result of the DeleteInvitations operation returned by the service.
     * @sample AmazonMacie2Async.DeleteInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DeleteInvitations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteInvitationsResult> deleteInvitationsAsync(DeleteInvitationsRequest deleteInvitationsRequest);

    /**
     * <p>
     * Deletes Amazon Macie membership invitations that were received from specific accounts.
     * </p>
     * 
     * @param deleteInvitationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteInvitations operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.DeleteInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DeleteInvitations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteInvitationsResult> deleteInvitationsAsync(DeleteInvitationsRequest deleteInvitationsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteInvitationsRequest, DeleteInvitationsResult> asyncHandler);

    /**
     * <p>
     * Deletes the association between an Amazon Macie administrator account and an account.
     * </p>
     * 
     * @param deleteMemberRequest
     * @return A Java Future containing the result of the DeleteMember operation returned by the service.
     * @sample AmazonMacie2Async.DeleteMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DeleteMember" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteMemberResult> deleteMemberAsync(DeleteMemberRequest deleteMemberRequest);

    /**
     * <p>
     * Deletes the association between an Amazon Macie administrator account and an account.
     * </p>
     * 
     * @param deleteMemberRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMember operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.DeleteMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DeleteMember" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteMemberResult> deleteMemberAsync(DeleteMemberRequest deleteMemberRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMemberRequest, DeleteMemberResult> asyncHandler);

    /**
     * <p>
     * Retrieves (queries) statistical data and other information about one or more S3 buckets that Amazon Macie
     * monitors and analyzes for an account.
     * </p>
     * 
     * @param describeBucketsRequest
     * @return A Java Future containing the result of the DescribeBuckets operation returned by the service.
     * @sample AmazonMacie2Async.DescribeBuckets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DescribeBuckets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeBucketsResult> describeBucketsAsync(DescribeBucketsRequest describeBucketsRequest);

    /**
     * <p>
     * Retrieves (queries) statistical data and other information about one or more S3 buckets that Amazon Macie
     * monitors and analyzes for an account.
     * </p>
     * 
     * @param describeBucketsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeBuckets operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.DescribeBuckets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DescribeBuckets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeBucketsResult> describeBucketsAsync(DescribeBucketsRequest describeBucketsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBucketsRequest, DescribeBucketsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the status and settings for a classification job.
     * </p>
     * 
     * @param describeClassificationJobRequest
     * @return A Java Future containing the result of the DescribeClassificationJob operation returned by the service.
     * @sample AmazonMacie2Async.DescribeClassificationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DescribeClassificationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeClassificationJobResult> describeClassificationJobAsync(
            DescribeClassificationJobRequest describeClassificationJobRequest);

    /**
     * <p>
     * Retrieves the status and settings for a classification job.
     * </p>
     * 
     * @param describeClassificationJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeClassificationJob operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.DescribeClassificationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DescribeClassificationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeClassificationJobResult> describeClassificationJobAsync(
            DescribeClassificationJobRequest describeClassificationJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeClassificationJobRequest, DescribeClassificationJobResult> asyncHandler);

    /**
     * <p>
     * Retrieves the Amazon Macie configuration settings for an organization in Organizations.
     * </p>
     * 
     * @param describeOrganizationConfigurationRequest
     * @return A Java Future containing the result of the DescribeOrganizationConfiguration operation returned by the
     *         service.
     * @sample AmazonMacie2Async.DescribeOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DescribeOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOrganizationConfigurationResult> describeOrganizationConfigurationAsync(
            DescribeOrganizationConfigurationRequest describeOrganizationConfigurationRequest);

    /**
     * <p>
     * Retrieves the Amazon Macie configuration settings for an organization in Organizations.
     * </p>
     * 
     * @param describeOrganizationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeOrganizationConfiguration operation returned by the
     *         service.
     * @sample AmazonMacie2AsyncHandler.DescribeOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DescribeOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOrganizationConfigurationResult> describeOrganizationConfigurationAsync(
            DescribeOrganizationConfigurationRequest describeOrganizationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeOrganizationConfigurationRequest, DescribeOrganizationConfigurationResult> asyncHandler);

    /**
     * <p>
     * Disables Amazon Macie and deletes all settings and resources for a Macie account.
     * </p>
     * 
     * @param disableMacieRequest
     * @return A Java Future containing the result of the DisableMacie operation returned by the service.
     * @sample AmazonMacie2Async.DisableMacie
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DisableMacie" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisableMacieResult> disableMacieAsync(DisableMacieRequest disableMacieRequest);

    /**
     * <p>
     * Disables Amazon Macie and deletes all settings and resources for a Macie account.
     * </p>
     * 
     * @param disableMacieRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableMacie operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.DisableMacie
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DisableMacie" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisableMacieResult> disableMacieAsync(DisableMacieRequest disableMacieRequest,
            com.amazonaws.handlers.AsyncHandler<DisableMacieRequest, DisableMacieResult> asyncHandler);

    /**
     * <p>
     * Disables an account as the delegated Amazon Macie administrator account for an organization in Organizations.
     * </p>
     * 
     * @param disableOrganizationAdminAccountRequest
     * @return A Java Future containing the result of the DisableOrganizationAdminAccount operation returned by the
     *         service.
     * @sample AmazonMacie2Async.DisableOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DisableOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableOrganizationAdminAccountResult> disableOrganizationAdminAccountAsync(
            DisableOrganizationAdminAccountRequest disableOrganizationAdminAccountRequest);

    /**
     * <p>
     * Disables an account as the delegated Amazon Macie administrator account for an organization in Organizations.
     * </p>
     * 
     * @param disableOrganizationAdminAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableOrganizationAdminAccount operation returned by the
     *         service.
     * @sample AmazonMacie2AsyncHandler.DisableOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DisableOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableOrganizationAdminAccountResult> disableOrganizationAdminAccountAsync(
            DisableOrganizationAdminAccountRequest disableOrganizationAdminAccountRequest,
            com.amazonaws.handlers.AsyncHandler<DisableOrganizationAdminAccountRequest, DisableOrganizationAdminAccountResult> asyncHandler);

    /**
     * <p>
     * Disassociates a member account from its Amazon Macie administrator account.
     * </p>
     * 
     * @param disassociateFromAdministratorAccountRequest
     * @return A Java Future containing the result of the DisassociateFromAdministratorAccount operation returned by the
     *         service.
     * @sample AmazonMacie2Async.DisassociateFromAdministratorAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DisassociateFromAdministratorAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateFromAdministratorAccountResult> disassociateFromAdministratorAccountAsync(
            DisassociateFromAdministratorAccountRequest disassociateFromAdministratorAccountRequest);

    /**
     * <p>
     * Disassociates a member account from its Amazon Macie administrator account.
     * </p>
     * 
     * @param disassociateFromAdministratorAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateFromAdministratorAccount operation returned by the
     *         service.
     * @sample AmazonMacie2AsyncHandler.DisassociateFromAdministratorAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DisassociateFromAdministratorAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateFromAdministratorAccountResult> disassociateFromAdministratorAccountAsync(
            DisassociateFromAdministratorAccountRequest disassociateFromAdministratorAccountRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateFromAdministratorAccountRequest, DisassociateFromAdministratorAccountResult> asyncHandler);

    /**
     * <p>
     * (Deprecated) Disassociates a member account from its Amazon Macie administrator account. This operation has been
     * replaced by the <link linkend="DisassociateFromAdministratorAccount">DisassociateFromAdministratorAccount</link>
     * operation.
     * </p>
     * 
     * @param disassociateFromMasterAccountRequest
     * @return A Java Future containing the result of the DisassociateFromMasterAccount operation returned by the
     *         service.
     * @sample AmazonMacie2Async.DisassociateFromMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DisassociateFromMasterAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateFromMasterAccountResult> disassociateFromMasterAccountAsync(
            DisassociateFromMasterAccountRequest disassociateFromMasterAccountRequest);

    /**
     * <p>
     * (Deprecated) Disassociates a member account from its Amazon Macie administrator account. This operation has been
     * replaced by the <link linkend="DisassociateFromAdministratorAccount">DisassociateFromAdministratorAccount</link>
     * operation.
     * </p>
     * 
     * @param disassociateFromMasterAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateFromMasterAccount operation returned by the
     *         service.
     * @sample AmazonMacie2AsyncHandler.DisassociateFromMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DisassociateFromMasterAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateFromMasterAccountResult> disassociateFromMasterAccountAsync(
            DisassociateFromMasterAccountRequest disassociateFromMasterAccountRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateFromMasterAccountRequest, DisassociateFromMasterAccountResult> asyncHandler);

    /**
     * <p>
     * Disassociates an Amazon Macie administrator account from a member account.
     * </p>
     * 
     * @param disassociateMemberRequest
     * @return A Java Future containing the result of the DisassociateMember operation returned by the service.
     * @sample AmazonMacie2Async.DisassociateMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DisassociateMember" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisassociateMemberResult> disassociateMemberAsync(DisassociateMemberRequest disassociateMemberRequest);

    /**
     * <p>
     * Disassociates an Amazon Macie administrator account from a member account.
     * </p>
     * 
     * @param disassociateMemberRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateMember operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.DisassociateMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DisassociateMember" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisassociateMemberResult> disassociateMemberAsync(DisassociateMemberRequest disassociateMemberRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateMemberRequest, DisassociateMemberResult> asyncHandler);

    /**
     * <p>
     * Enables Amazon Macie and specifies the configuration settings for a Macie account.
     * </p>
     * 
     * @param enableMacieRequest
     * @return A Java Future containing the result of the EnableMacie operation returned by the service.
     * @sample AmazonMacie2Async.EnableMacie
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/EnableMacie" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EnableMacieResult> enableMacieAsync(EnableMacieRequest enableMacieRequest);

    /**
     * <p>
     * Enables Amazon Macie and specifies the configuration settings for a Macie account.
     * </p>
     * 
     * @param enableMacieRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableMacie operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.EnableMacie
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/EnableMacie" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EnableMacieResult> enableMacieAsync(EnableMacieRequest enableMacieRequest,
            com.amazonaws.handlers.AsyncHandler<EnableMacieRequest, EnableMacieResult> asyncHandler);

    /**
     * <p>
     * Designates an account as the delegated Amazon Macie administrator account for an organization in Organizations.
     * </p>
     * 
     * @param enableOrganizationAdminAccountRequest
     * @return A Java Future containing the result of the EnableOrganizationAdminAccount operation returned by the
     *         service.
     * @sample AmazonMacie2Async.EnableOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/EnableOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableOrganizationAdminAccountResult> enableOrganizationAdminAccountAsync(
            EnableOrganizationAdminAccountRequest enableOrganizationAdminAccountRequest);

    /**
     * <p>
     * Designates an account as the delegated Amazon Macie administrator account for an organization in Organizations.
     * </p>
     * 
     * @param enableOrganizationAdminAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableOrganizationAdminAccount operation returned by the
     *         service.
     * @sample AmazonMacie2AsyncHandler.EnableOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/EnableOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableOrganizationAdminAccountResult> enableOrganizationAdminAccountAsync(
            EnableOrganizationAdminAccountRequest enableOrganizationAdminAccountRequest,
            com.amazonaws.handlers.AsyncHandler<EnableOrganizationAdminAccountRequest, EnableOrganizationAdminAccountResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the Amazon Macie administrator account for an account.
     * </p>
     * 
     * @param getAdministratorAccountRequest
     * @return A Java Future containing the result of the GetAdministratorAccount operation returned by the service.
     * @sample AmazonMacie2Async.GetAdministratorAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetAdministratorAccount" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAdministratorAccountResult> getAdministratorAccountAsync(GetAdministratorAccountRequest getAdministratorAccountRequest);

    /**
     * <p>
     * Retrieves information about the Amazon Macie administrator account for an account.
     * </p>
     * 
     * @param getAdministratorAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAdministratorAccount operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.GetAdministratorAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetAdministratorAccount" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetAdministratorAccountResult> getAdministratorAccountAsync(GetAdministratorAccountRequest getAdministratorAccountRequest,
            com.amazonaws.handlers.AsyncHandler<GetAdministratorAccountRequest, GetAdministratorAccountResult> asyncHandler);

    /**
     * <p>
     * Retrieves the settings and status of an allow list.
     * </p>
     * 
     * @param getAllowListRequest
     * @return A Java Future containing the result of the GetAllowList operation returned by the service.
     * @sample AmazonMacie2Async.GetAllowList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetAllowList" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAllowListResult> getAllowListAsync(GetAllowListRequest getAllowListRequest);

    /**
     * <p>
     * Retrieves the settings and status of an allow list.
     * </p>
     * 
     * @param getAllowListRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAllowList operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.GetAllowList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetAllowList" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAllowListResult> getAllowListAsync(GetAllowListRequest getAllowListRequest,
            com.amazonaws.handlers.AsyncHandler<GetAllowListRequest, GetAllowListResult> asyncHandler);

    /**
     * <p>
     * Retrieves the configuration settings and status of automated sensitive data discovery for an account.
     * </p>
     * 
     * @param getAutomatedDiscoveryConfigurationRequest
     * @return A Java Future containing the result of the GetAutomatedDiscoveryConfiguration operation returned by the
     *         service.
     * @sample AmazonMacie2Async.GetAutomatedDiscoveryConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetAutomatedDiscoveryConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAutomatedDiscoveryConfigurationResult> getAutomatedDiscoveryConfigurationAsync(
            GetAutomatedDiscoveryConfigurationRequest getAutomatedDiscoveryConfigurationRequest);

    /**
     * <p>
     * Retrieves the configuration settings and status of automated sensitive data discovery for an account.
     * </p>
     * 
     * @param getAutomatedDiscoveryConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAutomatedDiscoveryConfiguration operation returned by the
     *         service.
     * @sample AmazonMacie2AsyncHandler.GetAutomatedDiscoveryConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetAutomatedDiscoveryConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAutomatedDiscoveryConfigurationResult> getAutomatedDiscoveryConfigurationAsync(
            GetAutomatedDiscoveryConfigurationRequest getAutomatedDiscoveryConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetAutomatedDiscoveryConfigurationRequest, GetAutomatedDiscoveryConfigurationResult> asyncHandler);

    /**
     * <p>
     * Retrieves (queries) aggregated statistical data about all the S3 buckets that Amazon Macie monitors and analyzes
     * for an account.
     * </p>
     * 
     * @param getBucketStatisticsRequest
     * @return A Java Future containing the result of the GetBucketStatistics operation returned by the service.
     * @sample AmazonMacie2Async.GetBucketStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetBucketStatistics" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBucketStatisticsResult> getBucketStatisticsAsync(GetBucketStatisticsRequest getBucketStatisticsRequest);

    /**
     * <p>
     * Retrieves (queries) aggregated statistical data about all the S3 buckets that Amazon Macie monitors and analyzes
     * for an account.
     * </p>
     * 
     * @param getBucketStatisticsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetBucketStatistics operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.GetBucketStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetBucketStatistics" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetBucketStatisticsResult> getBucketStatisticsAsync(GetBucketStatisticsRequest getBucketStatisticsRequest,
            com.amazonaws.handlers.AsyncHandler<GetBucketStatisticsRequest, GetBucketStatisticsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the configuration settings for storing data classification results.
     * </p>
     * 
     * @param getClassificationExportConfigurationRequest
     * @return A Java Future containing the result of the GetClassificationExportConfiguration operation returned by the
     *         service.
     * @sample AmazonMacie2Async.GetClassificationExportConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetClassificationExportConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetClassificationExportConfigurationResult> getClassificationExportConfigurationAsync(
            GetClassificationExportConfigurationRequest getClassificationExportConfigurationRequest);

    /**
     * <p>
     * Retrieves the configuration settings for storing data classification results.
     * </p>
     * 
     * @param getClassificationExportConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetClassificationExportConfiguration operation returned by the
     *         service.
     * @sample AmazonMacie2AsyncHandler.GetClassificationExportConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetClassificationExportConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetClassificationExportConfigurationResult> getClassificationExportConfigurationAsync(
            GetClassificationExportConfigurationRequest getClassificationExportConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetClassificationExportConfigurationRequest, GetClassificationExportConfigurationResult> asyncHandler);

    /**
     * <p>
     * Retrieves the classification scope settings for an account.
     * </p>
     * 
     * @param getClassificationScopeRequest
     * @return A Java Future containing the result of the GetClassificationScope operation returned by the service.
     * @sample AmazonMacie2Async.GetClassificationScope
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetClassificationScope" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetClassificationScopeResult> getClassificationScopeAsync(GetClassificationScopeRequest getClassificationScopeRequest);

    /**
     * <p>
     * Retrieves the classification scope settings for an account.
     * </p>
     * 
     * @param getClassificationScopeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetClassificationScope operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.GetClassificationScope
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetClassificationScope" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetClassificationScopeResult> getClassificationScopeAsync(GetClassificationScopeRequest getClassificationScopeRequest,
            com.amazonaws.handlers.AsyncHandler<GetClassificationScopeRequest, GetClassificationScopeResult> asyncHandler);

    /**
     * <p>
     * Retrieves the criteria and other settings for a custom data identifier.
     * </p>
     * 
     * @param getCustomDataIdentifierRequest
     * @return A Java Future containing the result of the GetCustomDataIdentifier operation returned by the service.
     * @sample AmazonMacie2Async.GetCustomDataIdentifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetCustomDataIdentifier" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetCustomDataIdentifierResult> getCustomDataIdentifierAsync(GetCustomDataIdentifierRequest getCustomDataIdentifierRequest);

    /**
     * <p>
     * Retrieves the criteria and other settings for a custom data identifier.
     * </p>
     * 
     * @param getCustomDataIdentifierRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCustomDataIdentifier operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.GetCustomDataIdentifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetCustomDataIdentifier" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetCustomDataIdentifierResult> getCustomDataIdentifierAsync(GetCustomDataIdentifierRequest getCustomDataIdentifierRequest,
            com.amazonaws.handlers.AsyncHandler<GetCustomDataIdentifierRequest, GetCustomDataIdentifierResult> asyncHandler);

    /**
     * <p>
     * Retrieves (queries) aggregated statistical data about findings.
     * </p>
     * 
     * @param getFindingStatisticsRequest
     * @return A Java Future containing the result of the GetFindingStatistics operation returned by the service.
     * @sample AmazonMacie2Async.GetFindingStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetFindingStatistics" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetFindingStatisticsResult> getFindingStatisticsAsync(GetFindingStatisticsRequest getFindingStatisticsRequest);

    /**
     * <p>
     * Retrieves (queries) aggregated statistical data about findings.
     * </p>
     * 
     * @param getFindingStatisticsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFindingStatistics operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.GetFindingStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetFindingStatistics" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetFindingStatisticsResult> getFindingStatisticsAsync(GetFindingStatisticsRequest getFindingStatisticsRequest,
            com.amazonaws.handlers.AsyncHandler<GetFindingStatisticsRequest, GetFindingStatisticsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the details of one or more findings.
     * </p>
     * 
     * @param getFindingsRequest
     * @return A Java Future containing the result of the GetFindings operation returned by the service.
     * @sample AmazonMacie2Async.GetFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetFindings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFindingsResult> getFindingsAsync(GetFindingsRequest getFindingsRequest);

    /**
     * <p>
     * Retrieves the details of one or more findings.
     * </p>
     * 
     * @param getFindingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFindings operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.GetFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetFindings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFindingsResult> getFindingsAsync(GetFindingsRequest getFindingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetFindingsRequest, GetFindingsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the criteria and other settings for a findings filter.
     * </p>
     * 
     * @param getFindingsFilterRequest
     * @return A Java Future containing the result of the GetFindingsFilter operation returned by the service.
     * @sample AmazonMacie2Async.GetFindingsFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetFindingsFilter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFindingsFilterResult> getFindingsFilterAsync(GetFindingsFilterRequest getFindingsFilterRequest);

    /**
     * <p>
     * Retrieves the criteria and other settings for a findings filter.
     * </p>
     * 
     * @param getFindingsFilterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFindingsFilter operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.GetFindingsFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetFindingsFilter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFindingsFilterResult> getFindingsFilterAsync(GetFindingsFilterRequest getFindingsFilterRequest,
            com.amazonaws.handlers.AsyncHandler<GetFindingsFilterRequest, GetFindingsFilterResult> asyncHandler);

    /**
     * <p>
     * Retrieves the configuration settings for publishing findings to Security Hub.
     * </p>
     * 
     * @param getFindingsPublicationConfigurationRequest
     * @return A Java Future containing the result of the GetFindingsPublicationConfiguration operation returned by the
     *         service.
     * @sample AmazonMacie2Async.GetFindingsPublicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetFindingsPublicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFindingsPublicationConfigurationResult> getFindingsPublicationConfigurationAsync(
            GetFindingsPublicationConfigurationRequest getFindingsPublicationConfigurationRequest);

    /**
     * <p>
     * Retrieves the configuration settings for publishing findings to Security Hub.
     * </p>
     * 
     * @param getFindingsPublicationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFindingsPublicationConfiguration operation returned by the
     *         service.
     * @sample AmazonMacie2AsyncHandler.GetFindingsPublicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetFindingsPublicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFindingsPublicationConfigurationResult> getFindingsPublicationConfigurationAsync(
            GetFindingsPublicationConfigurationRequest getFindingsPublicationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetFindingsPublicationConfigurationRequest, GetFindingsPublicationConfigurationResult> asyncHandler);

    /**
     * <p>
     * Retrieves the count of Amazon Macie membership invitations that were received by an account.
     * </p>
     * 
     * @param getInvitationsCountRequest
     * @return A Java Future containing the result of the GetInvitationsCount operation returned by the service.
     * @sample AmazonMacie2Async.GetInvitationsCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetInvitationsCount" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetInvitationsCountResult> getInvitationsCountAsync(GetInvitationsCountRequest getInvitationsCountRequest);

    /**
     * <p>
     * Retrieves the count of Amazon Macie membership invitations that were received by an account.
     * </p>
     * 
     * @param getInvitationsCountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInvitationsCount operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.GetInvitationsCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetInvitationsCount" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetInvitationsCountResult> getInvitationsCountAsync(GetInvitationsCountRequest getInvitationsCountRequest,
            com.amazonaws.handlers.AsyncHandler<GetInvitationsCountRequest, GetInvitationsCountResult> asyncHandler);

    /**
     * <p>
     * Retrieves the status and configuration settings for an Amazon Macie account.
     * </p>
     * 
     * @param getMacieSessionRequest
     * @return A Java Future containing the result of the GetMacieSession operation returned by the service.
     * @sample AmazonMacie2Async.GetMacieSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetMacieSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMacieSessionResult> getMacieSessionAsync(GetMacieSessionRequest getMacieSessionRequest);

    /**
     * <p>
     * Retrieves the status and configuration settings for an Amazon Macie account.
     * </p>
     * 
     * @param getMacieSessionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMacieSession operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.GetMacieSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetMacieSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMacieSessionResult> getMacieSessionAsync(GetMacieSessionRequest getMacieSessionRequest,
            com.amazonaws.handlers.AsyncHandler<GetMacieSessionRequest, GetMacieSessionResult> asyncHandler);

    /**
     * <p>
     * (Deprecated) Retrieves information about the Amazon Macie administrator account for an account. This operation
     * has been replaced by the <link linkend="GetAdministratorAccount">GetAdministratorAccount</link> operation.
     * </p>
     * 
     * @param getMasterAccountRequest
     * @return A Java Future containing the result of the GetMasterAccount operation returned by the service.
     * @sample AmazonMacie2Async.GetMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetMasterAccount" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMasterAccountResult> getMasterAccountAsync(GetMasterAccountRequest getMasterAccountRequest);

    /**
     * <p>
     * (Deprecated) Retrieves information about the Amazon Macie administrator account for an account. This operation
     * has been replaced by the <link linkend="GetAdministratorAccount">GetAdministratorAccount</link> operation.
     * </p>
     * 
     * @param getMasterAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMasterAccount operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.GetMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetMasterAccount" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMasterAccountResult> getMasterAccountAsync(GetMasterAccountRequest getMasterAccountRequest,
            com.amazonaws.handlers.AsyncHandler<GetMasterAccountRequest, GetMasterAccountResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about an account that's associated with an Amazon Macie administrator account.
     * </p>
     * 
     * @param getMemberRequest
     * @return A Java Future containing the result of the GetMember operation returned by the service.
     * @sample AmazonMacie2Async.GetMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetMember" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMemberResult> getMemberAsync(GetMemberRequest getMemberRequest);

    /**
     * <p>
     * Retrieves information about an account that's associated with an Amazon Macie administrator account.
     * </p>
     * 
     * @param getMemberRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMember operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.GetMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetMember" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMemberResult> getMemberAsync(GetMemberRequest getMemberRequest,
            com.amazonaws.handlers.AsyncHandler<GetMemberRequest, GetMemberResult> asyncHandler);

    /**
     * <p>
     * Retrieves (queries) sensitive data discovery statistics and the sensitivity score for an S3 bucket.
     * </p>
     * 
     * @param getResourceProfileRequest
     * @return A Java Future containing the result of the GetResourceProfile operation returned by the service.
     * @sample AmazonMacie2Async.GetResourceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetResourceProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetResourceProfileResult> getResourceProfileAsync(GetResourceProfileRequest getResourceProfileRequest);

    /**
     * <p>
     * Retrieves (queries) sensitive data discovery statistics and the sensitivity score for an S3 bucket.
     * </p>
     * 
     * @param getResourceProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResourceProfile operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.GetResourceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetResourceProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetResourceProfileResult> getResourceProfileAsync(GetResourceProfileRequest getResourceProfileRequest,
            com.amazonaws.handlers.AsyncHandler<GetResourceProfileRequest, GetResourceProfileResult> asyncHandler);

    /**
     * <p>
     * Retrieves the status and configuration settings for retrieving occurrences of sensitive data reported by
     * findings.
     * </p>
     * 
     * @param getRevealConfigurationRequest
     * @return A Java Future containing the result of the GetRevealConfiguration operation returned by the service.
     * @sample AmazonMacie2Async.GetRevealConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetRevealConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetRevealConfigurationResult> getRevealConfigurationAsync(GetRevealConfigurationRequest getRevealConfigurationRequest);

    /**
     * <p>
     * Retrieves the status and configuration settings for retrieving occurrences of sensitive data reported by
     * findings.
     * </p>
     * 
     * @param getRevealConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRevealConfiguration operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.GetRevealConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetRevealConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetRevealConfigurationResult> getRevealConfigurationAsync(GetRevealConfigurationRequest getRevealConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetRevealConfigurationRequest, GetRevealConfigurationResult> asyncHandler);

    /**
     * <p>
     * Retrieves occurrences of sensitive data reported by a finding.
     * </p>
     * 
     * @param getSensitiveDataOccurrencesRequest
     * @return A Java Future containing the result of the GetSensitiveDataOccurrences operation returned by the service.
     * @sample AmazonMacie2Async.GetSensitiveDataOccurrences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetSensitiveDataOccurrences"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSensitiveDataOccurrencesResult> getSensitiveDataOccurrencesAsync(
            GetSensitiveDataOccurrencesRequest getSensitiveDataOccurrencesRequest);

    /**
     * <p>
     * Retrieves occurrences of sensitive data reported by a finding.
     * </p>
     * 
     * @param getSensitiveDataOccurrencesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSensitiveDataOccurrences operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.GetSensitiveDataOccurrences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetSensitiveDataOccurrences"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSensitiveDataOccurrencesResult> getSensitiveDataOccurrencesAsync(
            GetSensitiveDataOccurrencesRequest getSensitiveDataOccurrencesRequest,
            com.amazonaws.handlers.AsyncHandler<GetSensitiveDataOccurrencesRequest, GetSensitiveDataOccurrencesResult> asyncHandler);

    /**
     * <p>
     * Checks whether occurrences of sensitive data can be retrieved for a finding.
     * </p>
     * 
     * @param getSensitiveDataOccurrencesAvailabilityRequest
     * @return A Java Future containing the result of the GetSensitiveDataOccurrencesAvailability operation returned by
     *         the service.
     * @sample AmazonMacie2Async.GetSensitiveDataOccurrencesAvailability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetSensitiveDataOccurrencesAvailability"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSensitiveDataOccurrencesAvailabilityResult> getSensitiveDataOccurrencesAvailabilityAsync(
            GetSensitiveDataOccurrencesAvailabilityRequest getSensitiveDataOccurrencesAvailabilityRequest);

    /**
     * <p>
     * Checks whether occurrences of sensitive data can be retrieved for a finding.
     * </p>
     * 
     * @param getSensitiveDataOccurrencesAvailabilityRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSensitiveDataOccurrencesAvailability operation returned by
     *         the service.
     * @sample AmazonMacie2AsyncHandler.GetSensitiveDataOccurrencesAvailability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetSensitiveDataOccurrencesAvailability"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSensitiveDataOccurrencesAvailabilityResult> getSensitiveDataOccurrencesAvailabilityAsync(
            GetSensitiveDataOccurrencesAvailabilityRequest getSensitiveDataOccurrencesAvailabilityRequest,
            com.amazonaws.handlers.AsyncHandler<GetSensitiveDataOccurrencesAvailabilityRequest, GetSensitiveDataOccurrencesAvailabilityResult> asyncHandler);

    /**
     * <p>
     * Retrieves the settings for the sensitivity inspection template for an account.
     * </p>
     * 
     * @param getSensitivityInspectionTemplateRequest
     * @return A Java Future containing the result of the GetSensitivityInspectionTemplate operation returned by the
     *         service.
     * @sample AmazonMacie2Async.GetSensitivityInspectionTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetSensitivityInspectionTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSensitivityInspectionTemplateResult> getSensitivityInspectionTemplateAsync(
            GetSensitivityInspectionTemplateRequest getSensitivityInspectionTemplateRequest);

    /**
     * <p>
     * Retrieves the settings for the sensitivity inspection template for an account.
     * </p>
     * 
     * @param getSensitivityInspectionTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSensitivityInspectionTemplate operation returned by the
     *         service.
     * @sample AmazonMacie2AsyncHandler.GetSensitivityInspectionTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetSensitivityInspectionTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSensitivityInspectionTemplateResult> getSensitivityInspectionTemplateAsync(
            GetSensitivityInspectionTemplateRequest getSensitivityInspectionTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<GetSensitivityInspectionTemplateRequest, GetSensitivityInspectionTemplateResult> asyncHandler);

    /**
     * <p>
     * Retrieves (queries) quotas and aggregated usage data for one or more accounts.
     * </p>
     * 
     * @param getUsageStatisticsRequest
     * @return A Java Future containing the result of the GetUsageStatistics operation returned by the service.
     * @sample AmazonMacie2Async.GetUsageStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetUsageStatistics" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetUsageStatisticsResult> getUsageStatisticsAsync(GetUsageStatisticsRequest getUsageStatisticsRequest);

    /**
     * <p>
     * Retrieves (queries) quotas and aggregated usage data for one or more accounts.
     * </p>
     * 
     * @param getUsageStatisticsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetUsageStatistics operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.GetUsageStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetUsageStatistics" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetUsageStatisticsResult> getUsageStatisticsAsync(GetUsageStatisticsRequest getUsageStatisticsRequest,
            com.amazonaws.handlers.AsyncHandler<GetUsageStatisticsRequest, GetUsageStatisticsResult> asyncHandler);

    /**
     * <p>
     * Retrieves (queries) aggregated usage data for an account.
     * </p>
     * 
     * @param getUsageTotalsRequest
     * @return A Java Future containing the result of the GetUsageTotals operation returned by the service.
     * @sample AmazonMacie2Async.GetUsageTotals
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetUsageTotals" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetUsageTotalsResult> getUsageTotalsAsync(GetUsageTotalsRequest getUsageTotalsRequest);

    /**
     * <p>
     * Retrieves (queries) aggregated usage data for an account.
     * </p>
     * 
     * @param getUsageTotalsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetUsageTotals operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.GetUsageTotals
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetUsageTotals" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetUsageTotalsResult> getUsageTotalsAsync(GetUsageTotalsRequest getUsageTotalsRequest,
            com.amazonaws.handlers.AsyncHandler<GetUsageTotalsRequest, GetUsageTotalsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a subset of information about all the allow lists for an account.
     * </p>
     * 
     * @param listAllowListsRequest
     * @return A Java Future containing the result of the ListAllowLists operation returned by the service.
     * @sample AmazonMacie2Async.ListAllowLists
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListAllowLists" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAllowListsResult> listAllowListsAsync(ListAllowListsRequest listAllowListsRequest);

    /**
     * <p>
     * Retrieves a subset of information about all the allow lists for an account.
     * </p>
     * 
     * @param listAllowListsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAllowLists operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.ListAllowLists
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListAllowLists" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAllowListsResult> listAllowListsAsync(ListAllowListsRequest listAllowListsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAllowListsRequest, ListAllowListsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a subset of information about one or more classification jobs.
     * </p>
     * 
     * @param listClassificationJobsRequest
     * @return A Java Future containing the result of the ListClassificationJobs operation returned by the service.
     * @sample AmazonMacie2Async.ListClassificationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListClassificationJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListClassificationJobsResult> listClassificationJobsAsync(ListClassificationJobsRequest listClassificationJobsRequest);

    /**
     * <p>
     * Retrieves a subset of information about one or more classification jobs.
     * </p>
     * 
     * @param listClassificationJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListClassificationJobs operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.ListClassificationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListClassificationJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListClassificationJobsResult> listClassificationJobsAsync(ListClassificationJobsRequest listClassificationJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListClassificationJobsRequest, ListClassificationJobsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a subset of information about the classification scope for an account.
     * </p>
     * 
     * @param listClassificationScopesRequest
     * @return A Java Future containing the result of the ListClassificationScopes operation returned by the service.
     * @sample AmazonMacie2Async.ListClassificationScopes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListClassificationScopes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListClassificationScopesResult> listClassificationScopesAsync(ListClassificationScopesRequest listClassificationScopesRequest);

    /**
     * <p>
     * Retrieves a subset of information about the classification scope for an account.
     * </p>
     * 
     * @param listClassificationScopesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListClassificationScopes operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.ListClassificationScopes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListClassificationScopes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListClassificationScopesResult> listClassificationScopesAsync(ListClassificationScopesRequest listClassificationScopesRequest,
            com.amazonaws.handlers.AsyncHandler<ListClassificationScopesRequest, ListClassificationScopesResult> asyncHandler);

    /**
     * <p>
     * Retrieves a subset of information about all the custom data identifiers for an account.
     * </p>
     * 
     * @param listCustomDataIdentifiersRequest
     * @return A Java Future containing the result of the ListCustomDataIdentifiers operation returned by the service.
     * @sample AmazonMacie2Async.ListCustomDataIdentifiers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListCustomDataIdentifiers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCustomDataIdentifiersResult> listCustomDataIdentifiersAsync(
            ListCustomDataIdentifiersRequest listCustomDataIdentifiersRequest);

    /**
     * <p>
     * Retrieves a subset of information about all the custom data identifiers for an account.
     * </p>
     * 
     * @param listCustomDataIdentifiersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCustomDataIdentifiers operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.ListCustomDataIdentifiers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListCustomDataIdentifiers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCustomDataIdentifiersResult> listCustomDataIdentifiersAsync(
            ListCustomDataIdentifiersRequest listCustomDataIdentifiersRequest,
            com.amazonaws.handlers.AsyncHandler<ListCustomDataIdentifiersRequest, ListCustomDataIdentifiersResult> asyncHandler);

    /**
     * <p>
     * Retrieves a subset of information about one or more findings.
     * </p>
     * 
     * @param listFindingsRequest
     * @return A Java Future containing the result of the ListFindings operation returned by the service.
     * @sample AmazonMacie2Async.ListFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListFindings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFindingsResult> listFindingsAsync(ListFindingsRequest listFindingsRequest);

    /**
     * <p>
     * Retrieves a subset of information about one or more findings.
     * </p>
     * 
     * @param listFindingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFindings operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.ListFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListFindings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFindingsResult> listFindingsAsync(ListFindingsRequest listFindingsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFindingsRequest, ListFindingsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a subset of information about all the findings filters for an account.
     * </p>
     * 
     * @param listFindingsFiltersRequest
     * @return A Java Future containing the result of the ListFindingsFilters operation returned by the service.
     * @sample AmazonMacie2Async.ListFindingsFilters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListFindingsFilters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFindingsFiltersResult> listFindingsFiltersAsync(ListFindingsFiltersRequest listFindingsFiltersRequest);

    /**
     * <p>
     * Retrieves a subset of information about all the findings filters for an account.
     * </p>
     * 
     * @param listFindingsFiltersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFindingsFilters operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.ListFindingsFilters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListFindingsFilters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFindingsFiltersResult> listFindingsFiltersAsync(ListFindingsFiltersRequest listFindingsFiltersRequest,
            com.amazonaws.handlers.AsyncHandler<ListFindingsFiltersRequest, ListFindingsFiltersResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the Amazon Macie membership invitations that were received by an account.
     * </p>
     * 
     * @param listInvitationsRequest
     * @return A Java Future containing the result of the ListInvitations operation returned by the service.
     * @sample AmazonMacie2Async.ListInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListInvitations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListInvitationsResult> listInvitationsAsync(ListInvitationsRequest listInvitationsRequest);

    /**
     * <p>
     * Retrieves information about the Amazon Macie membership invitations that were received by an account.
     * </p>
     * 
     * @param listInvitationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListInvitations operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.ListInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListInvitations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListInvitationsResult> listInvitationsAsync(ListInvitationsRequest listInvitationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListInvitationsRequest, ListInvitationsResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about all the managed data identifiers that Amazon Macie currently provides.
     * </p>
     * 
     * @param listManagedDataIdentifiersRequest
     * @return A Java Future containing the result of the ListManagedDataIdentifiers operation returned by the service.
     * @sample AmazonMacie2Async.ListManagedDataIdentifiers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListManagedDataIdentifiers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListManagedDataIdentifiersResult> listManagedDataIdentifiersAsync(
            ListManagedDataIdentifiersRequest listManagedDataIdentifiersRequest);

    /**
     * <p>
     * Retrieves information about all the managed data identifiers that Amazon Macie currently provides.
     * </p>
     * 
     * @param listManagedDataIdentifiersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListManagedDataIdentifiers operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.ListManagedDataIdentifiers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListManagedDataIdentifiers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListManagedDataIdentifiersResult> listManagedDataIdentifiersAsync(
            ListManagedDataIdentifiersRequest listManagedDataIdentifiersRequest,
            com.amazonaws.handlers.AsyncHandler<ListManagedDataIdentifiersRequest, ListManagedDataIdentifiersResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the accounts that are associated with an Amazon Macie administrator account.
     * </p>
     * 
     * @param listMembersRequest
     * @return A Java Future containing the result of the ListMembers operation returned by the service.
     * @sample AmazonMacie2Async.ListMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMembersResult> listMembersAsync(ListMembersRequest listMembersRequest);

    /**
     * <p>
     * Retrieves information about the accounts that are associated with an Amazon Macie administrator account.
     * </p>
     * 
     * @param listMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMembers operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.ListMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMembersResult> listMembersAsync(ListMembersRequest listMembersRequest,
            com.amazonaws.handlers.AsyncHandler<ListMembersRequest, ListMembersResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the delegated Amazon Macie administrator account for an organization in
     * Organizations.
     * </p>
     * 
     * @param listOrganizationAdminAccountsRequest
     * @return A Java Future containing the result of the ListOrganizationAdminAccounts operation returned by the
     *         service.
     * @sample AmazonMacie2Async.ListOrganizationAdminAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListOrganizationAdminAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListOrganizationAdminAccountsResult> listOrganizationAdminAccountsAsync(
            ListOrganizationAdminAccountsRequest listOrganizationAdminAccountsRequest);

    /**
     * <p>
     * Retrieves information about the delegated Amazon Macie administrator account for an organization in
     * Organizations.
     * </p>
     * 
     * @param listOrganizationAdminAccountsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListOrganizationAdminAccounts operation returned by the
     *         service.
     * @sample AmazonMacie2AsyncHandler.ListOrganizationAdminAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListOrganizationAdminAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListOrganizationAdminAccountsResult> listOrganizationAdminAccountsAsync(
            ListOrganizationAdminAccountsRequest listOrganizationAdminAccountsRequest,
            com.amazonaws.handlers.AsyncHandler<ListOrganizationAdminAccountsRequest, ListOrganizationAdminAccountsResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about objects that were selected from an S3 bucket for automated sensitive data discovery.
     * </p>
     * 
     * @param listResourceProfileArtifactsRequest
     * @return A Java Future containing the result of the ListResourceProfileArtifacts operation returned by the
     *         service.
     * @sample AmazonMacie2Async.ListResourceProfileArtifacts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListResourceProfileArtifacts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResourceProfileArtifactsResult> listResourceProfileArtifactsAsync(
            ListResourceProfileArtifactsRequest listResourceProfileArtifactsRequest);

    /**
     * <p>
     * Retrieves information about objects that were selected from an S3 bucket for automated sensitive data discovery.
     * </p>
     * 
     * @param listResourceProfileArtifactsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResourceProfileArtifacts operation returned by the
     *         service.
     * @sample AmazonMacie2AsyncHandler.ListResourceProfileArtifacts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListResourceProfileArtifacts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResourceProfileArtifactsResult> listResourceProfileArtifactsAsync(
            ListResourceProfileArtifactsRequest listResourceProfileArtifactsRequest,
            com.amazonaws.handlers.AsyncHandler<ListResourceProfileArtifactsRequest, ListResourceProfileArtifactsResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the types and amount of sensitive data that Amazon Macie found in an S3 bucket.
     * </p>
     * 
     * @param listResourceProfileDetectionsRequest
     * @return A Java Future containing the result of the ListResourceProfileDetections operation returned by the
     *         service.
     * @sample AmazonMacie2Async.ListResourceProfileDetections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListResourceProfileDetections"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResourceProfileDetectionsResult> listResourceProfileDetectionsAsync(
            ListResourceProfileDetectionsRequest listResourceProfileDetectionsRequest);

    /**
     * <p>
     * Retrieves information about the types and amount of sensitive data that Amazon Macie found in an S3 bucket.
     * </p>
     * 
     * @param listResourceProfileDetectionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResourceProfileDetections operation returned by the
     *         service.
     * @sample AmazonMacie2AsyncHandler.ListResourceProfileDetections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListResourceProfileDetections"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResourceProfileDetectionsResult> listResourceProfileDetectionsAsync(
            ListResourceProfileDetectionsRequest listResourceProfileDetectionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListResourceProfileDetectionsRequest, ListResourceProfileDetectionsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a subset of information about the sensitivity inspection template for an account.
     * </p>
     * 
     * @param listSensitivityInspectionTemplatesRequest
     * @return A Java Future containing the result of the ListSensitivityInspectionTemplates operation returned by the
     *         service.
     * @sample AmazonMacie2Async.ListSensitivityInspectionTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListSensitivityInspectionTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSensitivityInspectionTemplatesResult> listSensitivityInspectionTemplatesAsync(
            ListSensitivityInspectionTemplatesRequest listSensitivityInspectionTemplatesRequest);

    /**
     * <p>
     * Retrieves a subset of information about the sensitivity inspection template for an account.
     * </p>
     * 
     * @param listSensitivityInspectionTemplatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSensitivityInspectionTemplates operation returned by the
     *         service.
     * @sample AmazonMacie2AsyncHandler.ListSensitivityInspectionTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListSensitivityInspectionTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSensitivityInspectionTemplatesResult> listSensitivityInspectionTemplatesAsync(
            ListSensitivityInspectionTemplatesRequest listSensitivityInspectionTemplatesRequest,
            com.amazonaws.handlers.AsyncHandler<ListSensitivityInspectionTemplatesRequest, ListSensitivityInspectionTemplatesResult> asyncHandler);

    /**
     * <p>
     * Retrieves the tags (keys and values) that are associated with an Amazon Macie resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonMacie2Async.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Retrieves the tags (keys and values) that are associated with an Amazon Macie resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Creates or updates the configuration settings for storing data classification results.
     * </p>
     * 
     * @param putClassificationExportConfigurationRequest
     * @return A Java Future containing the result of the PutClassificationExportConfiguration operation returned by the
     *         service.
     * @sample AmazonMacie2Async.PutClassificationExportConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/PutClassificationExportConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutClassificationExportConfigurationResult> putClassificationExportConfigurationAsync(
            PutClassificationExportConfigurationRequest putClassificationExportConfigurationRequest);

    /**
     * <p>
     * Creates or updates the configuration settings for storing data classification results.
     * </p>
     * 
     * @param putClassificationExportConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutClassificationExportConfiguration operation returned by the
     *         service.
     * @sample AmazonMacie2AsyncHandler.PutClassificationExportConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/PutClassificationExportConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutClassificationExportConfigurationResult> putClassificationExportConfigurationAsync(
            PutClassificationExportConfigurationRequest putClassificationExportConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<PutClassificationExportConfigurationRequest, PutClassificationExportConfigurationResult> asyncHandler);

    /**
     * <p>
     * Updates the configuration settings for publishing findings to Security Hub.
     * </p>
     * 
     * @param putFindingsPublicationConfigurationRequest
     * @return A Java Future containing the result of the PutFindingsPublicationConfiguration operation returned by the
     *         service.
     * @sample AmazonMacie2Async.PutFindingsPublicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/PutFindingsPublicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutFindingsPublicationConfigurationResult> putFindingsPublicationConfigurationAsync(
            PutFindingsPublicationConfigurationRequest putFindingsPublicationConfigurationRequest);

    /**
     * <p>
     * Updates the configuration settings for publishing findings to Security Hub.
     * </p>
     * 
     * @param putFindingsPublicationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutFindingsPublicationConfiguration operation returned by the
     *         service.
     * @sample AmazonMacie2AsyncHandler.PutFindingsPublicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/PutFindingsPublicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<PutFindingsPublicationConfigurationResult> putFindingsPublicationConfigurationAsync(
            PutFindingsPublicationConfigurationRequest putFindingsPublicationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<PutFindingsPublicationConfigurationRequest, PutFindingsPublicationConfigurationResult> asyncHandler);

    /**
     * <p>
     * Retrieves (queries) statistical data and other information about Amazon Web Services resources that Amazon Macie
     * monitors and analyzes.
     * </p>
     * 
     * @param searchResourcesRequest
     * @return A Java Future containing the result of the SearchResources operation returned by the service.
     * @sample AmazonMacie2Async.SearchResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/SearchResources" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchResourcesResult> searchResourcesAsync(SearchResourcesRequest searchResourcesRequest);

    /**
     * <p>
     * Retrieves (queries) statistical data and other information about Amazon Web Services resources that Amazon Macie
     * monitors and analyzes.
     * </p>
     * 
     * @param searchResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchResources operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.SearchResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/SearchResources" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<SearchResourcesResult> searchResourcesAsync(SearchResourcesRequest searchResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<SearchResourcesRequest, SearchResourcesResult> asyncHandler);

    /**
     * <p>
     * Adds or updates one or more tags (keys and values) that are associated with an Amazon Macie resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonMacie2Async.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds or updates one or more tags (keys and values) that are associated with an Amazon Macie resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Tests a custom data identifier.
     * </p>
     * 
     * @param testCustomDataIdentifierRequest
     * @return A Java Future containing the result of the TestCustomDataIdentifier operation returned by the service.
     * @sample AmazonMacie2Async.TestCustomDataIdentifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/TestCustomDataIdentifier"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TestCustomDataIdentifierResult> testCustomDataIdentifierAsync(TestCustomDataIdentifierRequest testCustomDataIdentifierRequest);

    /**
     * <p>
     * Tests a custom data identifier.
     * </p>
     * 
     * @param testCustomDataIdentifierRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TestCustomDataIdentifier operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.TestCustomDataIdentifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/TestCustomDataIdentifier"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TestCustomDataIdentifierResult> testCustomDataIdentifierAsync(TestCustomDataIdentifierRequest testCustomDataIdentifierRequest,
            com.amazonaws.handlers.AsyncHandler<TestCustomDataIdentifierRequest, TestCustomDataIdentifierResult> asyncHandler);

    /**
     * <p>
     * Removes one or more tags (keys and values) from an Amazon Macie resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonMacie2Async.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes one or more tags (keys and values) from an Amazon Macie resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the settings for an allow list.
     * </p>
     * 
     * @param updateAllowListRequest
     * @return A Java Future containing the result of the UpdateAllowList operation returned by the service.
     * @sample AmazonMacie2Async.UpdateAllowList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateAllowList" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAllowListResult> updateAllowListAsync(UpdateAllowListRequest updateAllowListRequest);

    /**
     * <p>
     * Updates the settings for an allow list.
     * </p>
     * 
     * @param updateAllowListRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAllowList operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.UpdateAllowList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateAllowList" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAllowListResult> updateAllowListAsync(UpdateAllowListRequest updateAllowListRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAllowListRequest, UpdateAllowListResult> asyncHandler);

    /**
     * <p>
     * Enables or disables automated sensitive data discovery for an account.
     * </p>
     * 
     * @param updateAutomatedDiscoveryConfigurationRequest
     * @return A Java Future containing the result of the UpdateAutomatedDiscoveryConfiguration operation returned by
     *         the service.
     * @sample AmazonMacie2Async.UpdateAutomatedDiscoveryConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateAutomatedDiscoveryConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAutomatedDiscoveryConfigurationResult> updateAutomatedDiscoveryConfigurationAsync(
            UpdateAutomatedDiscoveryConfigurationRequest updateAutomatedDiscoveryConfigurationRequest);

    /**
     * <p>
     * Enables or disables automated sensitive data discovery for an account.
     * </p>
     * 
     * @param updateAutomatedDiscoveryConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAutomatedDiscoveryConfiguration operation returned by
     *         the service.
     * @sample AmazonMacie2AsyncHandler.UpdateAutomatedDiscoveryConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateAutomatedDiscoveryConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateAutomatedDiscoveryConfigurationResult> updateAutomatedDiscoveryConfigurationAsync(
            UpdateAutomatedDiscoveryConfigurationRequest updateAutomatedDiscoveryConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAutomatedDiscoveryConfigurationRequest, UpdateAutomatedDiscoveryConfigurationResult> asyncHandler);

    /**
     * <p>
     * Changes the status of a classification job.
     * </p>
     * 
     * @param updateClassificationJobRequest
     * @return A Java Future containing the result of the UpdateClassificationJob operation returned by the service.
     * @sample AmazonMacie2Async.UpdateClassificationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateClassificationJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateClassificationJobResult> updateClassificationJobAsync(UpdateClassificationJobRequest updateClassificationJobRequest);

    /**
     * <p>
     * Changes the status of a classification job.
     * </p>
     * 
     * @param updateClassificationJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateClassificationJob operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.UpdateClassificationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateClassificationJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateClassificationJobResult> updateClassificationJobAsync(UpdateClassificationJobRequest updateClassificationJobRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateClassificationJobRequest, UpdateClassificationJobResult> asyncHandler);

    /**
     * <p>
     * Updates the classification scope settings for an account.
     * </p>
     * 
     * @param updateClassificationScopeRequest
     * @return A Java Future containing the result of the UpdateClassificationScope operation returned by the service.
     * @sample AmazonMacie2Async.UpdateClassificationScope
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateClassificationScope"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateClassificationScopeResult> updateClassificationScopeAsync(
            UpdateClassificationScopeRequest updateClassificationScopeRequest);

    /**
     * <p>
     * Updates the classification scope settings for an account.
     * </p>
     * 
     * @param updateClassificationScopeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateClassificationScope operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.UpdateClassificationScope
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateClassificationScope"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateClassificationScopeResult> updateClassificationScopeAsync(
            UpdateClassificationScopeRequest updateClassificationScopeRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateClassificationScopeRequest, UpdateClassificationScopeResult> asyncHandler);

    /**
     * <p>
     * Updates the criteria and other settings for a findings filter.
     * </p>
     * 
     * @param updateFindingsFilterRequest
     * @return A Java Future containing the result of the UpdateFindingsFilter operation returned by the service.
     * @sample AmazonMacie2Async.UpdateFindingsFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateFindingsFilter" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFindingsFilterResult> updateFindingsFilterAsync(UpdateFindingsFilterRequest updateFindingsFilterRequest);

    /**
     * <p>
     * Updates the criteria and other settings for a findings filter.
     * </p>
     * 
     * @param updateFindingsFilterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFindingsFilter operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.UpdateFindingsFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateFindingsFilter" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFindingsFilterResult> updateFindingsFilterAsync(UpdateFindingsFilterRequest updateFindingsFilterRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFindingsFilterRequest, UpdateFindingsFilterResult> asyncHandler);

    /**
     * <p>
     * Suspends or re-enables Amazon Macie, or updates the configuration settings for a Macie account.
     * </p>
     * 
     * @param updateMacieSessionRequest
     * @return A Java Future containing the result of the UpdateMacieSession operation returned by the service.
     * @sample AmazonMacie2Async.UpdateMacieSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateMacieSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateMacieSessionResult> updateMacieSessionAsync(UpdateMacieSessionRequest updateMacieSessionRequest);

    /**
     * <p>
     * Suspends or re-enables Amazon Macie, or updates the configuration settings for a Macie account.
     * </p>
     * 
     * @param updateMacieSessionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMacieSession operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.UpdateMacieSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateMacieSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateMacieSessionResult> updateMacieSessionAsync(UpdateMacieSessionRequest updateMacieSessionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMacieSessionRequest, UpdateMacieSessionResult> asyncHandler);

    /**
     * <p>
     * Enables an Amazon Macie administrator to suspend or re-enable Macie for a member account.
     * </p>
     * 
     * @param updateMemberSessionRequest
     * @return A Java Future containing the result of the UpdateMemberSession operation returned by the service.
     * @sample AmazonMacie2Async.UpdateMemberSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateMemberSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateMemberSessionResult> updateMemberSessionAsync(UpdateMemberSessionRequest updateMemberSessionRequest);

    /**
     * <p>
     * Enables an Amazon Macie administrator to suspend or re-enable Macie for a member account.
     * </p>
     * 
     * @param updateMemberSessionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMemberSession operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.UpdateMemberSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateMemberSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateMemberSessionResult> updateMemberSessionAsync(UpdateMemberSessionRequest updateMemberSessionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMemberSessionRequest, UpdateMemberSessionResult> asyncHandler);

    /**
     * <p>
     * Updates the Amazon Macie configuration settings for an organization in Organizations.
     * </p>
     * 
     * @param updateOrganizationConfigurationRequest
     * @return A Java Future containing the result of the UpdateOrganizationConfiguration operation returned by the
     *         service.
     * @sample AmazonMacie2Async.UpdateOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateOrganizationConfigurationResult> updateOrganizationConfigurationAsync(
            UpdateOrganizationConfigurationRequest updateOrganizationConfigurationRequest);

    /**
     * <p>
     * Updates the Amazon Macie configuration settings for an organization in Organizations.
     * </p>
     * 
     * @param updateOrganizationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateOrganizationConfiguration operation returned by the
     *         service.
     * @sample AmazonMacie2AsyncHandler.UpdateOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateOrganizationConfigurationResult> updateOrganizationConfigurationAsync(
            UpdateOrganizationConfigurationRequest updateOrganizationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateOrganizationConfigurationRequest, UpdateOrganizationConfigurationResult> asyncHandler);

    /**
     * <p>
     * Updates the sensitivity score for an S3 bucket.
     * </p>
     * 
     * @param updateResourceProfileRequest
     * @return A Java Future containing the result of the UpdateResourceProfile operation returned by the service.
     * @sample AmazonMacie2Async.UpdateResourceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateResourceProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateResourceProfileResult> updateResourceProfileAsync(UpdateResourceProfileRequest updateResourceProfileRequest);

    /**
     * <p>
     * Updates the sensitivity score for an S3 bucket.
     * </p>
     * 
     * @param updateResourceProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateResourceProfile operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.UpdateResourceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateResourceProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateResourceProfileResult> updateResourceProfileAsync(UpdateResourceProfileRequest updateResourceProfileRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateResourceProfileRequest, UpdateResourceProfileResult> asyncHandler);

    /**
     * <p>
     * Updates the sensitivity scoring settings for an S3 bucket.
     * </p>
     * 
     * @param updateResourceProfileDetectionsRequest
     * @return A Java Future containing the result of the UpdateResourceProfileDetections operation returned by the
     *         service.
     * @sample AmazonMacie2Async.UpdateResourceProfileDetections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateResourceProfileDetections"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateResourceProfileDetectionsResult> updateResourceProfileDetectionsAsync(
            UpdateResourceProfileDetectionsRequest updateResourceProfileDetectionsRequest);

    /**
     * <p>
     * Updates the sensitivity scoring settings for an S3 bucket.
     * </p>
     * 
     * @param updateResourceProfileDetectionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateResourceProfileDetections operation returned by the
     *         service.
     * @sample AmazonMacie2AsyncHandler.UpdateResourceProfileDetections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateResourceProfileDetections"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateResourceProfileDetectionsResult> updateResourceProfileDetectionsAsync(
            UpdateResourceProfileDetectionsRequest updateResourceProfileDetectionsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateResourceProfileDetectionsRequest, UpdateResourceProfileDetectionsResult> asyncHandler);

    /**
     * <p>
     * Updates the status and configuration settings for retrieving occurrences of sensitive data reported by findings.
     * </p>
     * 
     * @param updateRevealConfigurationRequest
     * @return A Java Future containing the result of the UpdateRevealConfiguration operation returned by the service.
     * @sample AmazonMacie2Async.UpdateRevealConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateRevealConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRevealConfigurationResult> updateRevealConfigurationAsync(
            UpdateRevealConfigurationRequest updateRevealConfigurationRequest);

    /**
     * <p>
     * Updates the status and configuration settings for retrieving occurrences of sensitive data reported by findings.
     * </p>
     * 
     * @param updateRevealConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRevealConfiguration operation returned by the service.
     * @sample AmazonMacie2AsyncHandler.UpdateRevealConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateRevealConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRevealConfigurationResult> updateRevealConfigurationAsync(
            UpdateRevealConfigurationRequest updateRevealConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRevealConfigurationRequest, UpdateRevealConfigurationResult> asyncHandler);

    /**
     * <p>
     * Updates the settings for the sensitivity inspection template for an account.
     * </p>
     * 
     * @param updateSensitivityInspectionTemplateRequest
     * @return A Java Future containing the result of the UpdateSensitivityInspectionTemplate operation returned by the
     *         service.
     * @sample AmazonMacie2Async.UpdateSensitivityInspectionTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateSensitivityInspectionTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSensitivityInspectionTemplateResult> updateSensitivityInspectionTemplateAsync(
            UpdateSensitivityInspectionTemplateRequest updateSensitivityInspectionTemplateRequest);

    /**
     * <p>
     * Updates the settings for the sensitivity inspection template for an account.
     * </p>
     * 
     * @param updateSensitivityInspectionTemplateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSensitivityInspectionTemplate operation returned by the
     *         service.
     * @sample AmazonMacie2AsyncHandler.UpdateSensitivityInspectionTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateSensitivityInspectionTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSensitivityInspectionTemplateResult> updateSensitivityInspectionTemplateAsync(
            UpdateSensitivityInspectionTemplateRequest updateSensitivityInspectionTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSensitivityInspectionTemplateRequest, UpdateSensitivityInspectionTemplateResult> asyncHandler);

}
