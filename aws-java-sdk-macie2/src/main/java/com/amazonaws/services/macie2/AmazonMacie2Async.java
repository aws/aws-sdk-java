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
 * Amazon Macie is a fully managed data security and data privacy service that uses machine learning and pattern
 * matching to discover and protect your sensitive data in AWS. Macie automates the discovery of sensitive data, such as
 * PII and intellectual property, to provide you with insight into the data that your organization stores in AWS. Macie
 * also provides an inventory of your Amazon S3 buckets, which it continually monitors for you. If Macie detects
 * sensitive data or potential data access issues, it generates detailed findings for you to review and act upon as
 * necessary.
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
     * monitors and analyzes.
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
     * monitors and analyzes.
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
     * Retrieves the Amazon Macie configuration settings for an AWS organization.
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
     * Retrieves the Amazon Macie configuration settings for an AWS organization.
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
     * Disables an Amazon Macie account and deletes Macie resources for the account.
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
     * Disables an Amazon Macie account and deletes Macie resources for the account.
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
     * Disables an account as the delegated Amazon Macie administrator account for an AWS organization.
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
     * Disables an account as the delegated Amazon Macie administrator account for an AWS organization.
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
     * Designates an account as the delegated Amazon Macie administrator account for an AWS organization.
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
     * Designates an account as the delegated Amazon Macie administrator account for an AWS organization.
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
     * Retrieves (queries) aggregated statistical data for all the S3 buckets that Amazon Macie monitors and analyzes.
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
     * Retrieves (queries) aggregated statistical data for all the S3 buckets that Amazon Macie monitors and analyzes.
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
     * Retrieves the configuration settings for publishing findings to AWS Security Hub.
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
     * Retrieves the configuration settings for publishing findings to AWS Security Hub.
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
     * Retrieves the current status and configuration settings for an Amazon Macie account.
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
     * Retrieves the current status and configuration settings for an Amazon Macie account.
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
     * Retrieves information about all the Amazon Macie membership invitations that were received by an account.
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
     * Retrieves information about all the Amazon Macie membership invitations that were received by an account.
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
     * Retrieves information about the delegated Amazon Macie administrator account for an AWS organization.
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
     * Retrieves information about the delegated Amazon Macie administrator account for an AWS organization.
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
     * Retrieves the tags (keys and values) that are associated with a classification job, custom data identifier,
     * findings filter, or member account.
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
     * Retrieves the tags (keys and values) that are associated with a classification job, custom data identifier,
     * findings filter, or member account.
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
     * Updates the configuration settings for publishing findings to AWS Security Hub.
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
     * Updates the configuration settings for publishing findings to AWS Security Hub.
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
     * Adds or updates one or more tags (keys and values) that are associated with a classification job, custom data
     * identifier, findings filter, or member account.
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
     * Adds or updates one or more tags (keys and values) that are associated with a classification job, custom data
     * identifier, findings filter, or member account.
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
     * Removes one or more tags (keys and values) from a classification job, custom data identifier, findings filter, or
     * member account.
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
     * Removes one or more tags (keys and values) from a classification job, custom data identifier, findings filter, or
     * member account.
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
     * Suspends or re-enables an Amazon Macie account, or updates the configuration settings for a Macie account.
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
     * Suspends or re-enables an Amazon Macie account, or updates the configuration settings for a Macie account.
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
     * Enables an Amazon Macie administrator to suspend or re-enable a member account.
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
     * Enables an Amazon Macie administrator to suspend or re-enable a member account.
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
     * Updates the Amazon Macie configuration settings for an AWS organization.
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
     * Updates the Amazon Macie configuration settings for an AWS organization.
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

}
