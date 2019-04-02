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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.securityhub.model.*;

/**
 * Interface for accessing AWS SecurityHub.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.securityhub.AbstractAWSSecurityHub} instead.
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
public interface AWSSecurityHub {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "securityhub";

    /**
     * <p>
     * Accepts the invitation to be monitored by a master SecurityHub account.
     * </p>
     * 
     * @param acceptInvitationRequest
     * @return Result of the AcceptInvitation operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because the specified resource cannot be found.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @sample AWSSecurityHub.AcceptInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AcceptInvitation" target="_top">AWS
     *      API Documentation</a>
     */
    AcceptInvitationResult acceptInvitation(AcceptInvitationRequest acceptInvitationRequest);

    /**
     * <p>
     * Disables the standards specified by the standards subscription ARNs. In the context of Security Hub, supported
     * standards (for example, CIS AWS Foundations) are automated and continuous checks that help determine your
     * compliance status against security industry (including AWS) best practices.
     * </p>
     * 
     * @param batchDisableStandardsRequest
     * @return Result of the BatchDisableStandards operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @sample AWSSecurityHub.BatchDisableStandards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchDisableStandards"
     *      target="_top">AWS API Documentation</a>
     */
    BatchDisableStandardsResult batchDisableStandards(BatchDisableStandardsRequest batchDisableStandardsRequest);

    /**
     * <p>
     * Enables the standards specified by the standards ARNs. In the context of Security Hub, supported standards (for
     * example, CIS AWS Foundations) are automated and continuous checks that help determine your compliance status
     * against security industry (including AWS) best practices.
     * </p>
     * 
     * @param batchEnableStandardsRequest
     * @return Result of the BatchEnableStandards operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @sample AWSSecurityHub.BatchEnableStandards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchEnableStandards"
     *      target="_top">AWS API Documentation</a>
     */
    BatchEnableStandardsResult batchEnableStandards(BatchEnableStandardsRequest batchEnableStandardsRequest);

    /**
     * <p>
     * Imports security findings that are generated by the integrated third-party products into Security Hub.
     * </p>
     * 
     * @param batchImportFindingsRequest
     * @return Result of the BatchImportFindings operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @sample AWSSecurityHub.BatchImportFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchImportFindings"
     *      target="_top">AWS API Documentation</a>
     */
    BatchImportFindingsResult batchImportFindings(BatchImportFindingsRequest batchImportFindingsRequest);

    /**
     * <p>
     * Creates an insight, which is a consolidation of findings that identifies a security area that requires attention
     * or intervention.
     * </p>
     * 
     * @param createInsightRequest
     * @return Result of the CreateInsight operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws ResourceConflictException
     *         The resource specified in the request conflicts with an existing resource.
     * @sample AWSSecurityHub.CreateInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/CreateInsight" target="_top">AWS API
     *      Documentation</a>
     */
    CreateInsightResult createInsight(CreateInsightRequest createInsightRequest);

    /**
     * <p>
     * Creates member Security Hub accounts in the current AWS account (which becomes the master Security Hub account)
     * that has Security Hub enabled.
     * </p>
     * 
     * @param createMembersRequest
     * @return Result of the CreateMembers operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws ResourceConflictException
     *         The resource specified in the request conflicts with an existing resource.
     * @sample AWSSecurityHub.CreateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/CreateMembers" target="_top">AWS API
     *      Documentation</a>
     */
    CreateMembersResult createMembers(CreateMembersRequest createMembersRequest);

    /**
     * <p>
     * Declines invitations that are sent to this AWS account (invitee) by the AWS accounts (inviters) that are
     * specified by the account IDs.
     * </p>
     * 
     * @param declineInvitationsRequest
     * @return Result of the DeclineInvitations operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws ResourceNotFoundException
     *         The request was rejected because the specified resource cannot be found.
     * @sample AWSSecurityHub.DeclineInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeclineInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    DeclineInvitationsResult declineInvitations(DeclineInvitationsRequest declineInvitationsRequest);

    /**
     * <p>
     * Deletes an insight that is specified by the insight ARN.
     * </p>
     * 
     * @param deleteInsightRequest
     * @return Result of the DeleteInsight operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because the specified resource cannot be found.
     * @sample AWSSecurityHub.DeleteInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteInsight" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteInsightResult deleteInsight(DeleteInsightRequest deleteInsightRequest);

    /**
     * <p>
     * Deletes invitations that are sent to this AWS account (invitee) by the AWS accounts (inviters) that are specified
     * by their account IDs.
     * </p>
     * 
     * @param deleteInvitationsRequest
     * @return Result of the DeleteInvitations operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because the specified resource cannot be found.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @sample AWSSecurityHub.DeleteInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteInvitationsResult deleteInvitations(DeleteInvitationsRequest deleteInvitationsRequest);

    /**
     * <p>
     * Deletes the Security Hub member accounts that are specified by the account IDs.
     * </p>
     * 
     * @param deleteMembersRequest
     * @return Result of the DeleteMembers operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because the specified resource cannot be found.
     * @sample AWSSecurityHub.DeleteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteMembers" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteMembersResult deleteMembers(DeleteMembersRequest deleteMembersRequest);

    /**
     * <p>
     * Cancels the subscription that allows a findings-generating solution (product) to import its findings into
     * Security Hub.
     * </p>
     * 
     * @param disableImportFindingsForProductRequest
     * @return Result of the DisableImportFindingsForProduct operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws ResourceNotFoundException
     *         The request was rejected because the specified resource cannot be found.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @sample AWSSecurityHub.DisableImportFindingsForProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisableImportFindingsForProduct"
     *      target="_top">AWS API Documentation</a>
     */
    DisableImportFindingsForProductResult disableImportFindingsForProduct(DisableImportFindingsForProductRequest disableImportFindingsForProductRequest);

    /**
     * <p>
     * Disables the AWS Security Hub Service.
     * </p>
     * 
     * @param disableSecurityHubRequest
     * @return Result of the DisableSecurityHub operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws ResourceNotFoundException
     *         The request was rejected because the specified resource cannot be found.
     * @sample AWSSecurityHub.DisableSecurityHub
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisableSecurityHub" target="_top">AWS
     *      API Documentation</a>
     */
    DisableSecurityHubResult disableSecurityHub(DisableSecurityHubRequest disableSecurityHubRequest);

    /**
     * <p>
     * Disassociates the current Security Hub member account from its master account.
     * </p>
     * 
     * @param disassociateFromMasterAccountRequest
     * @return Result of the DisassociateFromMasterAccount operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because the specified resource cannot be found.
     * @sample AWSSecurityHub.DisassociateFromMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisassociateFromMasterAccount"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateFromMasterAccountResult disassociateFromMasterAccount(DisassociateFromMasterAccountRequest disassociateFromMasterAccountRequest);

    /**
     * <p>
     * Disassociates the Security Hub member accounts that are specified by the account IDs from their master account.
     * </p>
     * 
     * @param disassociateMembersRequest
     * @return Result of the DisassociateMembers operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because the specified resource cannot be found.
     * @sample AWSSecurityHub.DisassociateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisassociateMembers"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateMembersResult disassociateMembers(DisassociateMembersRequest disassociateMembersRequest);

    /**
     * <p>
     * Sets up the subscription that enables a findings-generating solution (product) to import its findings into
     * Security Hub.
     * </p>
     * 
     * @param enableImportFindingsForProductRequest
     * @return Result of the EnableImportFindingsForProduct operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws ResourceConflictException
     *         The resource specified in the request conflicts with an existing resource.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @sample AWSSecurityHub.EnableImportFindingsForProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/EnableImportFindingsForProduct"
     *      target="_top">AWS API Documentation</a>
     */
    EnableImportFindingsForProductResult enableImportFindingsForProduct(EnableImportFindingsForProductRequest enableImportFindingsForProductRequest);

    /**
     * <p>
     * Enables the AWS Security Hub service.
     * </p>
     * 
     * @param enableSecurityHubRequest
     * @return Result of the EnableSecurityHub operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws ResourceConflictException
     *         The resource specified in the request conflicts with an existing resource.
     * @throws AccessDeniedException
     *         You do not have permission to to perform the action specified in the request.
     * @sample AWSSecurityHub.EnableSecurityHub
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/EnableSecurityHub" target="_top">AWS
     *      API Documentation</a>
     */
    EnableSecurityHubResult enableSecurityHub(EnableSecurityHubRequest enableSecurityHubRequest);

    /**
     * <p>
     * Lists and describes enabled standards.
     * </p>
     * 
     * @param getEnabledStandardsRequest
     * @return Result of the GetEnabledStandards operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @sample AWSSecurityHub.GetEnabledStandards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetEnabledStandards"
     *      target="_top">AWS API Documentation</a>
     */
    GetEnabledStandardsResult getEnabledStandards(GetEnabledStandardsRequest getEnabledStandardsRequest);

    /**
     * <p>
     * Lists and describes Security Hub-aggregated findings that are specified by filter attributes.
     * </p>
     * 
     * @param getFindingsRequest
     * @return Result of the GetFindings operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @sample AWSSecurityHub.GetFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetFindings" target="_top">AWS API
     *      Documentation</a>
     */
    GetFindingsResult getFindings(GetFindingsRequest getFindingsRequest);

    /**
     * <p>
     * Lists the results of the Security Hub insight specified by the insight ARN.
     * </p>
     * 
     * @param getInsightResultsRequest
     * @return Result of the GetInsightResults operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because the specified resource cannot be found.
     * @sample AWSSecurityHub.GetInsightResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetInsightResults" target="_top">AWS
     *      API Documentation</a>
     */
    GetInsightResultsResult getInsightResults(GetInsightResultsRequest getInsightResultsRequest);

    /**
     * <p>
     * Lists and describes insights that are specified by insight ARNs.
     * </p>
     * 
     * @param getInsightsRequest
     * @return Result of the GetInsights operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because the specified resource cannot be found.
     * @sample AWSSecurityHub.GetInsights
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetInsights" target="_top">AWS API
     *      Documentation</a>
     */
    GetInsightsResult getInsights(GetInsightsRequest getInsightsRequest);

    /**
     * <p>
     * Returns the count of all Security Hub membership invitations that were sent to the current member account, not
     * including the currently accepted invitation.
     * </p>
     * 
     * @param getInvitationsCountRequest
     * @return Result of the GetInvitationsCount operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @sample AWSSecurityHub.GetInvitationsCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetInvitationsCount"
     *      target="_top">AWS API Documentation</a>
     */
    GetInvitationsCountResult getInvitationsCount(GetInvitationsCountRequest getInvitationsCountRequest);

    /**
     * <p>
     * Provides the details for the Security Hub master account to the current member account.
     * </p>
     * 
     * @param getMasterAccountRequest
     * @return Result of the GetMasterAccount operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because the specified resource cannot be found.
     * @sample AWSSecurityHub.GetMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetMasterAccount" target="_top">AWS
     *      API Documentation</a>
     */
    GetMasterAccountResult getMasterAccount(GetMasterAccountRequest getMasterAccountRequest);

    /**
     * <p>
     * Returns the details on the Security Hub member accounts that are specified by the account IDs.
     * </p>
     * 
     * @param getMembersRequest
     * @return Result of the GetMembers operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because the specified resource cannot be found.
     * @sample AWSSecurityHub.GetMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetMembers" target="_top">AWS API
     *      Documentation</a>
     */
    GetMembersResult getMembers(GetMembersRequest getMembersRequest);

    /**
     * <p>
     * Invites other AWS accounts to enable Security Hub and become Security Hub member accounts. When an account
     * accepts the invitation and becomes a member account, the master account can view Security Hub findings of the
     * member account.
     * </p>
     * 
     * @param inviteMembersRequest
     * @return Result of the InviteMembers operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because the specified resource cannot be found.
     * @sample AWSSecurityHub.InviteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/InviteMembers" target="_top">AWS API
     *      Documentation</a>
     */
    InviteMembersResult inviteMembers(InviteMembersRequest inviteMembersRequest);

    /**
     * <p>
     * Lists all findings-generating solutions (products) whose findings you've subscribed to receive in Security Hub.
     * </p>
     * 
     * @param listEnabledProductsForImportRequest
     * @return Result of the ListEnabledProductsForImport operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @sample AWSSecurityHub.ListEnabledProductsForImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListEnabledProductsForImport"
     *      target="_top">AWS API Documentation</a>
     */
    ListEnabledProductsForImportResult listEnabledProductsForImport(ListEnabledProductsForImportRequest listEnabledProductsForImportRequest);

    /**
     * <p>
     * Lists all Security Hub membership invitations that were sent to the current AWS account.
     * </p>
     * 
     * @param listInvitationsRequest
     * @return Result of the ListInvitations operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @sample AWSSecurityHub.ListInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    ListInvitationsResult listInvitations(ListInvitationsRequest listInvitationsRequest);

    /**
     * <p>
     * Lists details about all member accounts for the current Security Hub master account.
     * </p>
     * 
     * @param listMembersRequest
     * @return Result of the ListMembers operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @sample AWSSecurityHub.ListMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListMembers" target="_top">AWS API
     *      Documentation</a>
     */
    ListMembersResult listMembers(ListMembersRequest listMembersRequest);

    /**
     * <p>
     * Updates the AWS Security Hub-aggregated findings specified by the filter attributes.
     * </p>
     * 
     * @param updateFindingsRequest
     * @return Result of the UpdateFindings operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws ResourceNotFoundException
     *         The request was rejected because the specified resource cannot be found.
     * @sample AWSSecurityHub.UpdateFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateFindings" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateFindingsResult updateFindings(UpdateFindingsRequest updateFindingsRequest);

    /**
     * <p>
     * Updates the AWS Security Hub insight specified by the insight ARN.
     * </p>
     * 
     * @param updateInsightRequest
     * @return Result of the UpdateInsight operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because an invalid or out-of-range value was supplied for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub is not enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because the specified resource cannot be found.
     * @sample AWSSecurityHub.UpdateInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateInsight" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateInsightResult updateInsight(UpdateInsightRequest updateInsightRequest);

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
