/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;

/**
 * Interface for accessing AWS SecurityHub asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.securityhub.AbstractAWSSecurityHubAsync} instead.
 * </p>
 * <p>
 * <p>
 * AWS Security Hub provides you with a comprehensive view of your security state within AWS and your compliance with
 * the security industry standards and best practices. Security Hub collects security data from across AWS accounts,
 * services, and supported third-party partners and helps you analyze your security trends and identify the highest
 * priority security issues. For more information, see <a
 * href="https://docs.aws.amazon.com/securityhub/latest/userguide/what-is-securityhub.html">AWS Security Hub User
 * Guide</a>.
 * </p>
 * <important>
 * <p>
 * Currently, AWS Security Hub is in Preview release.
 * </p>
 * </important>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSSecurityHubAsync extends AWSSecurityHub {

    /**
     * <p>
     * Accepts the invitation to be monitored by a master SecurityHub account.
     * </p>
     * 
     * @param acceptInvitationRequest
     * @return A Java Future containing the result of the AcceptInvitation operation returned by the service.
     * @sample AWSSecurityHubAsync.AcceptInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AcceptInvitation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AcceptInvitationResult> acceptInvitationAsync(AcceptInvitationRequest acceptInvitationRequest);

    /**
     * <p>
     * Accepts the invitation to be monitored by a master SecurityHub account.
     * </p>
     * 
     * @param acceptInvitationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AcceptInvitation operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.AcceptInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AcceptInvitation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AcceptInvitationResult> acceptInvitationAsync(AcceptInvitationRequest acceptInvitationRequest,
            com.amazonaws.handlers.AsyncHandler<AcceptInvitationRequest, AcceptInvitationResult> asyncHandler);

    /**
     * <p>
     * Disables the standards specified by the standards subscription ARNs. In the context of Security Hub, supported
     * standards (for example, CIS AWS Foundations) are automated and continuous checks that help determine your
     * compliance status against security industry (including AWS) best practices.
     * </p>
     * 
     * @param batchDisableStandardsRequest
     * @return A Java Future containing the result of the BatchDisableStandards operation returned by the service.
     * @sample AWSSecurityHubAsync.BatchDisableStandards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchDisableStandards"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDisableStandardsResult> batchDisableStandardsAsync(BatchDisableStandardsRequest batchDisableStandardsRequest);

    /**
     * <p>
     * Disables the standards specified by the standards subscription ARNs. In the context of Security Hub, supported
     * standards (for example, CIS AWS Foundations) are automated and continuous checks that help determine your
     * compliance status against security industry (including AWS) best practices.
     * </p>
     * 
     * @param batchDisableStandardsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDisableStandards operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.BatchDisableStandards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchDisableStandards"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDisableStandardsResult> batchDisableStandardsAsync(BatchDisableStandardsRequest batchDisableStandardsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDisableStandardsRequest, BatchDisableStandardsResult> asyncHandler);

    /**
     * <p>
     * Enables the standards specified by the standards ARNs. In the context of Security Hub, supported standards (for
     * example, CIS AWS Foundations) are automated and continuous checks that help determine your compliance status
     * against security industry (including AWS) best practices.
     * </p>
     * 
     * @param batchEnableStandardsRequest
     * @return A Java Future containing the result of the BatchEnableStandards operation returned by the service.
     * @sample AWSSecurityHubAsync.BatchEnableStandards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchEnableStandards"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchEnableStandardsResult> batchEnableStandardsAsync(BatchEnableStandardsRequest batchEnableStandardsRequest);

    /**
     * <p>
     * Enables the standards specified by the standards ARNs. In the context of Security Hub, supported standards (for
     * example, CIS AWS Foundations) are automated and continuous checks that help determine your compliance status
     * against security industry (including AWS) best practices.
     * </p>
     * 
     * @param batchEnableStandardsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchEnableStandards operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.BatchEnableStandards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchEnableStandards"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchEnableStandardsResult> batchEnableStandardsAsync(BatchEnableStandardsRequest batchEnableStandardsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchEnableStandardsRequest, BatchEnableStandardsResult> asyncHandler);

    /**
     * <p>
     * Imports security findings that are generated by the integrated third-party products into Security Hub.
     * </p>
     * 
     * @param batchImportFindingsRequest
     * @return A Java Future containing the result of the BatchImportFindings operation returned by the service.
     * @sample AWSSecurityHubAsync.BatchImportFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchImportFindings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchImportFindingsResult> batchImportFindingsAsync(BatchImportFindingsRequest batchImportFindingsRequest);

    /**
     * <p>
     * Imports security findings that are generated by the integrated third-party products into Security Hub.
     * </p>
     * 
     * @param batchImportFindingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchImportFindings operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.BatchImportFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchImportFindings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchImportFindingsResult> batchImportFindingsAsync(BatchImportFindingsRequest batchImportFindingsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchImportFindingsRequest, BatchImportFindingsResult> asyncHandler);

    /**
     * <p>
     * Creates an insight, which is a consolidation of findings that identifies a security area that requires attention
     * or intervention.
     * </p>
     * 
     * @param createInsightRequest
     * @return A Java Future containing the result of the CreateInsight operation returned by the service.
     * @sample AWSSecurityHubAsync.CreateInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/CreateInsight" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateInsightResult> createInsightAsync(CreateInsightRequest createInsightRequest);

    /**
     * <p>
     * Creates an insight, which is a consolidation of findings that identifies a security area that requires attention
     * or intervention.
     * </p>
     * 
     * @param createInsightRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateInsight operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.CreateInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/CreateInsight" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateInsightResult> createInsightAsync(CreateInsightRequest createInsightRequest,
            com.amazonaws.handlers.AsyncHandler<CreateInsightRequest, CreateInsightResult> asyncHandler);

    /**
     * <p>
     * Creates member Security Hub accounts in the current AWS account (which becomes the master Security Hub account)
     * that has Security Hub enabled.
     * </p>
     * 
     * @param createMembersRequest
     * @return A Java Future containing the result of the CreateMembers operation returned by the service.
     * @sample AWSSecurityHubAsync.CreateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/CreateMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateMembersResult> createMembersAsync(CreateMembersRequest createMembersRequest);

    /**
     * <p>
     * Creates member Security Hub accounts in the current AWS account (which becomes the master Security Hub account)
     * that has Security Hub enabled.
     * </p>
     * 
     * @param createMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMembers operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.CreateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/CreateMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateMembersResult> createMembersAsync(CreateMembersRequest createMembersRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMembersRequest, CreateMembersResult> asyncHandler);

    /**
     * <p>
     * Declines invitations that are sent to this AWS account (invitee) by the AWS accounts (inviters) that are
     * specified by the account IDs.
     * </p>
     * 
     * @param declineInvitationsRequest
     * @return A Java Future containing the result of the DeclineInvitations operation returned by the service.
     * @sample AWSSecurityHubAsync.DeclineInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeclineInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeclineInvitationsResult> declineInvitationsAsync(DeclineInvitationsRequest declineInvitationsRequest);

    /**
     * <p>
     * Declines invitations that are sent to this AWS account (invitee) by the AWS accounts (inviters) that are
     * specified by the account IDs.
     * </p>
     * 
     * @param declineInvitationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeclineInvitations operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.DeclineInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeclineInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeclineInvitationsResult> declineInvitationsAsync(DeclineInvitationsRequest declineInvitationsRequest,
            com.amazonaws.handlers.AsyncHandler<DeclineInvitationsRequest, DeclineInvitationsResult> asyncHandler);

    /**
     * <p>
     * Deletes an insight that is specified by the insight ARN.
     * </p>
     * 
     * @param deleteInsightRequest
     * @return A Java Future containing the result of the DeleteInsight operation returned by the service.
     * @sample AWSSecurityHubAsync.DeleteInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteInsight" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteInsightResult> deleteInsightAsync(DeleteInsightRequest deleteInsightRequest);

    /**
     * <p>
     * Deletes an insight that is specified by the insight ARN.
     * </p>
     * 
     * @param deleteInsightRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteInsight operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.DeleteInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteInsight" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteInsightResult> deleteInsightAsync(DeleteInsightRequest deleteInsightRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteInsightRequest, DeleteInsightResult> asyncHandler);

    /**
     * <p>
     * Deletes invitations that are sent to this AWS account (invitee) by the AWS accounts (inviters) that are specified
     * by their account IDs.
     * </p>
     * 
     * @param deleteInvitationsRequest
     * @return A Java Future containing the result of the DeleteInvitations operation returned by the service.
     * @sample AWSSecurityHubAsync.DeleteInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteInvitationsResult> deleteInvitationsAsync(DeleteInvitationsRequest deleteInvitationsRequest);

    /**
     * <p>
     * Deletes invitations that are sent to this AWS account (invitee) by the AWS accounts (inviters) that are specified
     * by their account IDs.
     * </p>
     * 
     * @param deleteInvitationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteInvitations operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.DeleteInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteInvitationsResult> deleteInvitationsAsync(DeleteInvitationsRequest deleteInvitationsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteInvitationsRequest, DeleteInvitationsResult> asyncHandler);

    /**
     * <p>
     * Deletes the Security Hub member accounts that are specified by the account IDs.
     * </p>
     * 
     * @param deleteMembersRequest
     * @return A Java Future containing the result of the DeleteMembers operation returned by the service.
     * @sample AWSSecurityHubAsync.DeleteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteMembersResult> deleteMembersAsync(DeleteMembersRequest deleteMembersRequest);

    /**
     * <p>
     * Deletes the Security Hub member accounts that are specified by the account IDs.
     * </p>
     * 
     * @param deleteMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMembers operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.DeleteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteMembersResult> deleteMembersAsync(DeleteMembersRequest deleteMembersRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMembersRequest, DeleteMembersResult> asyncHandler);

    /**
     * <p>
     * Cancels the subscription that allows a findings-generating solution (product) to import its findings into
     * Security Hub.
     * </p>
     * 
     * @param disableImportFindingsForProductRequest
     * @return A Java Future containing the result of the DisableImportFindingsForProduct operation returned by the
     *         service.
     * @sample AWSSecurityHubAsync.DisableImportFindingsForProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisableImportFindingsForProduct"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableImportFindingsForProductResult> disableImportFindingsForProductAsync(
            DisableImportFindingsForProductRequest disableImportFindingsForProductRequest);

    /**
     * <p>
     * Cancels the subscription that allows a findings-generating solution (product) to import its findings into
     * Security Hub.
     * </p>
     * 
     * @param disableImportFindingsForProductRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableImportFindingsForProduct operation returned by the
     *         service.
     * @sample AWSSecurityHubAsyncHandler.DisableImportFindingsForProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisableImportFindingsForProduct"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableImportFindingsForProductResult> disableImportFindingsForProductAsync(
            DisableImportFindingsForProductRequest disableImportFindingsForProductRequest,
            com.amazonaws.handlers.AsyncHandler<DisableImportFindingsForProductRequest, DisableImportFindingsForProductResult> asyncHandler);

    /**
     * <p>
     * Disables the AWS Security Hub Service.
     * </p>
     * 
     * @param disableSecurityHubRequest
     * @return A Java Future containing the result of the DisableSecurityHub operation returned by the service.
     * @sample AWSSecurityHubAsync.DisableSecurityHub
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisableSecurityHub" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisableSecurityHubResult> disableSecurityHubAsync(DisableSecurityHubRequest disableSecurityHubRequest);

    /**
     * <p>
     * Disables the AWS Security Hub Service.
     * </p>
     * 
     * @param disableSecurityHubRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableSecurityHub operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.DisableSecurityHub
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisableSecurityHub" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisableSecurityHubResult> disableSecurityHubAsync(DisableSecurityHubRequest disableSecurityHubRequest,
            com.amazonaws.handlers.AsyncHandler<DisableSecurityHubRequest, DisableSecurityHubResult> asyncHandler);

    /**
     * <p>
     * Disassociates the current Security Hub member account from its master account.
     * </p>
     * 
     * @param disassociateFromMasterAccountRequest
     * @return A Java Future containing the result of the DisassociateFromMasterAccount operation returned by the
     *         service.
     * @sample AWSSecurityHubAsync.DisassociateFromMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisassociateFromMasterAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateFromMasterAccountResult> disassociateFromMasterAccountAsync(
            DisassociateFromMasterAccountRequest disassociateFromMasterAccountRequest);

    /**
     * <p>
     * Disassociates the current Security Hub member account from its master account.
     * </p>
     * 
     * @param disassociateFromMasterAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateFromMasterAccount operation returned by the
     *         service.
     * @sample AWSSecurityHubAsyncHandler.DisassociateFromMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisassociateFromMasterAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateFromMasterAccountResult> disassociateFromMasterAccountAsync(
            DisassociateFromMasterAccountRequest disassociateFromMasterAccountRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateFromMasterAccountRequest, DisassociateFromMasterAccountResult> asyncHandler);

    /**
     * <p>
     * Disassociates the Security Hub member accounts that are specified by the account IDs from their master account.
     * </p>
     * 
     * @param disassociateMembersRequest
     * @return A Java Future containing the result of the DisassociateMembers operation returned by the service.
     * @sample AWSSecurityHubAsync.DisassociateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisassociateMembers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateMembersResult> disassociateMembersAsync(DisassociateMembersRequest disassociateMembersRequest);

    /**
     * <p>
     * Disassociates the Security Hub member accounts that are specified by the account IDs from their master account.
     * </p>
     * 
     * @param disassociateMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateMembers operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.DisassociateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisassociateMembers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateMembersResult> disassociateMembersAsync(DisassociateMembersRequest disassociateMembersRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateMembersRequest, DisassociateMembersResult> asyncHandler);

    /**
     * <p>
     * Sets up the subscription that enables a findings-generating solution (product) to import its findings into
     * Security Hub.
     * </p>
     * 
     * @param enableImportFindingsForProductRequest
     * @return A Java Future containing the result of the EnableImportFindingsForProduct operation returned by the
     *         service.
     * @sample AWSSecurityHubAsync.EnableImportFindingsForProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/EnableImportFindingsForProduct"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableImportFindingsForProductResult> enableImportFindingsForProductAsync(
            EnableImportFindingsForProductRequest enableImportFindingsForProductRequest);

    /**
     * <p>
     * Sets up the subscription that enables a findings-generating solution (product) to import its findings into
     * Security Hub.
     * </p>
     * 
     * @param enableImportFindingsForProductRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableImportFindingsForProduct operation returned by the
     *         service.
     * @sample AWSSecurityHubAsyncHandler.EnableImportFindingsForProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/EnableImportFindingsForProduct"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableImportFindingsForProductResult> enableImportFindingsForProductAsync(
            EnableImportFindingsForProductRequest enableImportFindingsForProductRequest,
            com.amazonaws.handlers.AsyncHandler<EnableImportFindingsForProductRequest, EnableImportFindingsForProductResult> asyncHandler);

    /**
     * <p>
     * Enables the AWS Security Hub service.
     * </p>
     * 
     * @param enableSecurityHubRequest
     * @return A Java Future containing the result of the EnableSecurityHub operation returned by the service.
     * @sample AWSSecurityHubAsync.EnableSecurityHub
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/EnableSecurityHub" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<EnableSecurityHubResult> enableSecurityHubAsync(EnableSecurityHubRequest enableSecurityHubRequest);

    /**
     * <p>
     * Enables the AWS Security Hub service.
     * </p>
     * 
     * @param enableSecurityHubRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableSecurityHub operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.EnableSecurityHub
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/EnableSecurityHub" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<EnableSecurityHubResult> enableSecurityHubAsync(EnableSecurityHubRequest enableSecurityHubRequest,
            com.amazonaws.handlers.AsyncHandler<EnableSecurityHubRequest, EnableSecurityHubResult> asyncHandler);

    /**
     * <p>
     * Lists and describes enabled standards.
     * </p>
     * 
     * @param getEnabledStandardsRequest
     * @return A Java Future containing the result of the GetEnabledStandards operation returned by the service.
     * @sample AWSSecurityHubAsync.GetEnabledStandards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetEnabledStandards"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEnabledStandardsResult> getEnabledStandardsAsync(GetEnabledStandardsRequest getEnabledStandardsRequest);

    /**
     * <p>
     * Lists and describes enabled standards.
     * </p>
     * 
     * @param getEnabledStandardsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEnabledStandards operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.GetEnabledStandards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetEnabledStandards"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEnabledStandardsResult> getEnabledStandardsAsync(GetEnabledStandardsRequest getEnabledStandardsRequest,
            com.amazonaws.handlers.AsyncHandler<GetEnabledStandardsRequest, GetEnabledStandardsResult> asyncHandler);

    /**
     * <p>
     * Lists and describes Security Hub-aggregated findings that are specified by filter attributes.
     * </p>
     * 
     * @param getFindingsRequest
     * @return A Java Future containing the result of the GetFindings operation returned by the service.
     * @sample AWSSecurityHubAsync.GetFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetFindings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFindingsResult> getFindingsAsync(GetFindingsRequest getFindingsRequest);

    /**
     * <p>
     * Lists and describes Security Hub-aggregated findings that are specified by filter attributes.
     * </p>
     * 
     * @param getFindingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFindings operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.GetFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetFindings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFindingsResult> getFindingsAsync(GetFindingsRequest getFindingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetFindingsRequest, GetFindingsResult> asyncHandler);

    /**
     * <p>
     * Lists the results of the Security Hub insight specified by the insight ARN.
     * </p>
     * 
     * @param getInsightResultsRequest
     * @return A Java Future containing the result of the GetInsightResults operation returned by the service.
     * @sample AWSSecurityHubAsync.GetInsightResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetInsightResults" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetInsightResultsResult> getInsightResultsAsync(GetInsightResultsRequest getInsightResultsRequest);

    /**
     * <p>
     * Lists the results of the Security Hub insight specified by the insight ARN.
     * </p>
     * 
     * @param getInsightResultsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInsightResults operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.GetInsightResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetInsightResults" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetInsightResultsResult> getInsightResultsAsync(GetInsightResultsRequest getInsightResultsRequest,
            com.amazonaws.handlers.AsyncHandler<GetInsightResultsRequest, GetInsightResultsResult> asyncHandler);

    /**
     * <p>
     * Lists and describes insights that are specified by insight ARNs.
     * </p>
     * 
     * @param getInsightsRequest
     * @return A Java Future containing the result of the GetInsights operation returned by the service.
     * @sample AWSSecurityHubAsync.GetInsights
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetInsights" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetInsightsResult> getInsightsAsync(GetInsightsRequest getInsightsRequest);

    /**
     * <p>
     * Lists and describes insights that are specified by insight ARNs.
     * </p>
     * 
     * @param getInsightsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInsights operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.GetInsights
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetInsights" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetInsightsResult> getInsightsAsync(GetInsightsRequest getInsightsRequest,
            com.amazonaws.handlers.AsyncHandler<GetInsightsRequest, GetInsightsResult> asyncHandler);

    /**
     * <p>
     * Returns the count of all Security Hub membership invitations that were sent to the current member account, not
     * including the currently accepted invitation.
     * </p>
     * 
     * @param getInvitationsCountRequest
     * @return A Java Future containing the result of the GetInvitationsCount operation returned by the service.
     * @sample AWSSecurityHubAsync.GetInvitationsCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetInvitationsCount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetInvitationsCountResult> getInvitationsCountAsync(GetInvitationsCountRequest getInvitationsCountRequest);

    /**
     * <p>
     * Returns the count of all Security Hub membership invitations that were sent to the current member account, not
     * including the currently accepted invitation.
     * </p>
     * 
     * @param getInvitationsCountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInvitationsCount operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.GetInvitationsCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetInvitationsCount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetInvitationsCountResult> getInvitationsCountAsync(GetInvitationsCountRequest getInvitationsCountRequest,
            com.amazonaws.handlers.AsyncHandler<GetInvitationsCountRequest, GetInvitationsCountResult> asyncHandler);

    /**
     * <p>
     * Provides the details for the Security Hub master account to the current member account.
     * </p>
     * 
     * @param getMasterAccountRequest
     * @return A Java Future containing the result of the GetMasterAccount operation returned by the service.
     * @sample AWSSecurityHubAsync.GetMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetMasterAccount" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetMasterAccountResult> getMasterAccountAsync(GetMasterAccountRequest getMasterAccountRequest);

    /**
     * <p>
     * Provides the details for the Security Hub master account to the current member account.
     * </p>
     * 
     * @param getMasterAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMasterAccount operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.GetMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetMasterAccount" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetMasterAccountResult> getMasterAccountAsync(GetMasterAccountRequest getMasterAccountRequest,
            com.amazonaws.handlers.AsyncHandler<GetMasterAccountRequest, GetMasterAccountResult> asyncHandler);

    /**
     * <p>
     * Returns the details on the Security Hub member accounts that are specified by the account IDs.
     * </p>
     * 
     * @param getMembersRequest
     * @return A Java Future containing the result of the GetMembers operation returned by the service.
     * @sample AWSSecurityHubAsync.GetMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMembersResult> getMembersAsync(GetMembersRequest getMembersRequest);

    /**
     * <p>
     * Returns the details on the Security Hub member accounts that are specified by the account IDs.
     * </p>
     * 
     * @param getMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMembers operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.GetMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMembersResult> getMembersAsync(GetMembersRequest getMembersRequest,
            com.amazonaws.handlers.AsyncHandler<GetMembersRequest, GetMembersResult> asyncHandler);

    /**
     * <p>
     * Invites other AWS accounts to enable Security Hub and become Security Hub member accounts. When an account
     * accepts the invitation and becomes a member account, the master account can view Security Hub findings of the
     * member account.
     * </p>
     * 
     * @param inviteMembersRequest
     * @return A Java Future containing the result of the InviteMembers operation returned by the service.
     * @sample AWSSecurityHubAsync.InviteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/InviteMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<InviteMembersResult> inviteMembersAsync(InviteMembersRequest inviteMembersRequest);

    /**
     * <p>
     * Invites other AWS accounts to enable Security Hub and become Security Hub member accounts. When an account
     * accepts the invitation and becomes a member account, the master account can view Security Hub findings of the
     * member account.
     * </p>
     * 
     * @param inviteMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the InviteMembers operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.InviteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/InviteMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<InviteMembersResult> inviteMembersAsync(InviteMembersRequest inviteMembersRequest,
            com.amazonaws.handlers.AsyncHandler<InviteMembersRequest, InviteMembersResult> asyncHandler);

    /**
     * <p>
     * Lists all findings-generating solutions (products) whose findings you've subscribed to receive in Security Hub.
     * </p>
     * 
     * @param listEnabledProductsForImportRequest
     * @return A Java Future containing the result of the ListEnabledProductsForImport operation returned by the
     *         service.
     * @sample AWSSecurityHubAsync.ListEnabledProductsForImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListEnabledProductsForImport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEnabledProductsForImportResult> listEnabledProductsForImportAsync(
            ListEnabledProductsForImportRequest listEnabledProductsForImportRequest);

    /**
     * <p>
     * Lists all findings-generating solutions (products) whose findings you've subscribed to receive in Security Hub.
     * </p>
     * 
     * @param listEnabledProductsForImportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEnabledProductsForImport operation returned by the
     *         service.
     * @sample AWSSecurityHubAsyncHandler.ListEnabledProductsForImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListEnabledProductsForImport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEnabledProductsForImportResult> listEnabledProductsForImportAsync(
            ListEnabledProductsForImportRequest listEnabledProductsForImportRequest,
            com.amazonaws.handlers.AsyncHandler<ListEnabledProductsForImportRequest, ListEnabledProductsForImportResult> asyncHandler);

    /**
     * <p>
     * Lists all Security Hub membership invitations that were sent to the current AWS account.
     * </p>
     * 
     * @param listInvitationsRequest
     * @return A Java Future containing the result of the ListInvitations operation returned by the service.
     * @sample AWSSecurityHubAsync.ListInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListInvitationsResult> listInvitationsAsync(ListInvitationsRequest listInvitationsRequest);

    /**
     * <p>
     * Lists all Security Hub membership invitations that were sent to the current AWS account.
     * </p>
     * 
     * @param listInvitationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListInvitations operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.ListInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListInvitationsResult> listInvitationsAsync(ListInvitationsRequest listInvitationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListInvitationsRequest, ListInvitationsResult> asyncHandler);

    /**
     * <p>
     * Lists details about all member accounts for the current Security Hub master account.
     * </p>
     * 
     * @param listMembersRequest
     * @return A Java Future containing the result of the ListMembers operation returned by the service.
     * @sample AWSSecurityHubAsync.ListMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMembersResult> listMembersAsync(ListMembersRequest listMembersRequest);

    /**
     * <p>
     * Lists details about all member accounts for the current Security Hub master account.
     * </p>
     * 
     * @param listMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMembers operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.ListMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMembersResult> listMembersAsync(ListMembersRequest listMembersRequest,
            com.amazonaws.handlers.AsyncHandler<ListMembersRequest, ListMembersResult> asyncHandler);

    /**
     * <p>
     * Updates the AWS Security Hub-aggregated findings specified by the filter attributes.
     * </p>
     * 
     * @param updateFindingsRequest
     * @return A Java Future containing the result of the UpdateFindings operation returned by the service.
     * @sample AWSSecurityHubAsync.UpdateFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateFindings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFindingsResult> updateFindingsAsync(UpdateFindingsRequest updateFindingsRequest);

    /**
     * <p>
     * Updates the AWS Security Hub-aggregated findings specified by the filter attributes.
     * </p>
     * 
     * @param updateFindingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFindings operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.UpdateFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateFindings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFindingsResult> updateFindingsAsync(UpdateFindingsRequest updateFindingsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFindingsRequest, UpdateFindingsResult> asyncHandler);

    /**
     * <p>
     * Updates the AWS Security Hub insight specified by the insight ARN.
     * </p>
     * 
     * @param updateInsightRequest
     * @return A Java Future containing the result of the UpdateInsight operation returned by the service.
     * @sample AWSSecurityHubAsync.UpdateInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateInsight" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateInsightResult> updateInsightAsync(UpdateInsightRequest updateInsightRequest);

    /**
     * <p>
     * Updates the AWS Security Hub insight specified by the insight ARN.
     * </p>
     * 
     * @param updateInsightRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateInsight operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.UpdateInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateInsight" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateInsightResult> updateInsightAsync(UpdateInsightRequest updateInsightRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateInsightRequest, UpdateInsightResult> asyncHandler);

}
