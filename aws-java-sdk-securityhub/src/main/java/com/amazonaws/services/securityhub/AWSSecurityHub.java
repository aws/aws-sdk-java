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
 * Security Hub provides you with a comprehensive view of the security state of your AWS environment and resources. It
 * also provides you with the compliance status of your environment based on CIS AWS Foundations compliance checks.
 * Security Hub collects security data from AWS accounts, services, and integrated third-party products and helps you
 * analyze security trends in your environment to identify the highest priority security issues. For more information
 * about Security Hub, see the <i> <a
 * href="https://docs.aws.amazon.com/securityhub/latest/userguide/what-is-securityhub.html">AWS Security Hub User
 * Guide</a> </i>.
 * </p>
 * <p>
 * When you use operations in the Security Hub API, the requests are executed only in the AWS Region that is currently
 * active or in the specific AWS Region that you specify in your request. Any configuration or settings change that
 * results from the operation is applied only to that Region. To make the same change in other Regions, execute the same
 * command for each Region to apply the change to. For example, if your Region is set to <code>us-west-2</code>, when
 * you use <code>CreateMembers</code> to add a member account to Security Hub, the association of the member account
 * with the master account is created only in the us-west-2 Region. Security Hub must be enabled for the member account
 * in the same Region that the invite was sent from.
 * </p>
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
     * Accepts the invitation to be a member account and be monitored by the Security Hub master account that the
     * invitation was sent from. When the member account accepts the invitation, permission is granted to the master
     * account to view findings generated in the member account.
     * </p>
     * 
     * @param acceptInvitationRequest
     * @return Result of the AcceptInvitation operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @throws InvalidAccessException
     *         AWS Security Hub isn't enabled for the account used to make this request.
     * @sample AWSSecurityHub.AcceptInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AcceptInvitation" target="_top">AWS
     *      API Documentation</a>
     */
    AcceptInvitationResult acceptInvitation(AcceptInvitationRequest acceptInvitationRequest);

    /**
     * <p>
     * Disables the standards specified by the provided <code>StandardsSubscriptionArns</code>. For more information,
     * see <a href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards.html">Standards
     * Supported in AWS Security Hub</a>.
     * </p>
     * 
     * @param batchDisableStandardsRequest
     * @return Result of the BatchDisableStandards operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub isn't enabled for the account used to make this request.
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
     * Enables the standards specified by the provided <code>standardsArn</code>. In this release, only CIS AWS
     * Foundations standards are supported. For more information, see <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards.html">Standards Supported in
     * AWS Security Hub</a>.
     * </p>
     * 
     * @param batchEnableStandardsRequest
     * @return Result of the BatchEnableStandards operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub isn't enabled for the account used to make this request.
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
     * Imports security findings generated from an integrated third-party product into Security Hub. This action is
     * requested by the integrated product to import its findings into Security Hub. The maximum allowed size for a
     * finding is 240 Kb. An error is returned for any finding larger than 240 Kb.
     * </p>
     * 
     * @param batchImportFindingsRequest
     * @return Result of the BatchImportFindings operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         AWS Security Hub isn't enabled for the account used to make this request.
     * @sample AWSSecurityHub.BatchImportFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchImportFindings"
     *      target="_top">AWS API Documentation</a>
     */
    BatchImportFindingsResult batchImportFindings(BatchImportFindingsRequest batchImportFindingsRequest);

    /**
     * <p>
     * Creates a custom action target in Security Hub. You can use custom actions on findings and insights in Security
     * Hub to trigger target actions in Amazon CloudWatch Events.
     * </p>
     * 
     * @param createActionTargetRequest
     * @return Result of the CreateActionTarget operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub isn't enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws ResourceConflictException
     *         The resource specified in the request conflicts with an existing resource.
     * @sample AWSSecurityHub.CreateActionTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/CreateActionTarget" target="_top">AWS
     *      API Documentation</a>
     */
    CreateActionTargetResult createActionTarget(CreateActionTargetRequest createActionTargetRequest);

    /**
     * <p>
     * Creates a custom insight in Security Hub. An insight is a consolidation of findings that relate to a security
     * issue that requires attention or remediation. Use the <code>GroupByAttribute</code> to group the related findings
     * in the insight.
     * </p>
     * 
     * @param createInsightRequest
     * @return Result of the CreateInsight operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         AWS Security Hub isn't enabled for the account used to make this request.
     * @throws ResourceConflictException
     *         The resource specified in the request conflicts with an existing resource.
     * @sample AWSSecurityHub.CreateInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/CreateInsight" target="_top">AWS API
     *      Documentation</a>
     */
    CreateInsightResult createInsight(CreateInsightRequest createInsightRequest);

    /**
     * <p>
     * Creates a member association in Security Hub between the specified accounts and the account used to make the
     * request, which is the master account. To successfully create a member, you must use this action from an account
     * that already has Security Hub enabled. You can use the <a>EnableSecurityHub</a> to enable Security Hub.
     * </p>
     * <p>
     * After you use <code>CreateMembers</code> to create member account associations in Security Hub, you need to use
     * the <a>InviteMembers</a> action, which invites the accounts to enable Security Hub and become member accounts in
     * Security Hub. If the invitation is accepted by the account owner, the account becomes a member account in
     * Security Hub, and a permission policy is added that permits the master account to view the findings generated in
     * the member account. When Security Hub is enabled in the invited account, findings start being sent to both the
     * member and master accounts.
     * </p>
     * <p>
     * You can remove the association between the master and member accounts by using the
     * <a>DisassociateFromMasterAccount</a> or <a>DisassociateMembers</a> operation.
     * </p>
     * 
     * @param createMembersRequest
     * @return Result of the CreateMembers operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         AWS Security Hub isn't enabled for the account used to make this request.
     * @throws ResourceConflictException
     *         The resource specified in the request conflicts with an existing resource.
     * @sample AWSSecurityHub.CreateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/CreateMembers" target="_top">AWS API
     *      Documentation</a>
     */
    CreateMembersResult createMembers(CreateMembersRequest createMembersRequest);

    /**
     * <p>
     * Declines invitations to become a member account.
     * </p>
     * 
     * @param declineInvitationsRequest
     * @return Result of the DeclineInvitations operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub isn't enabled for the account used to make this request.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.DeclineInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeclineInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    DeclineInvitationsResult declineInvitations(DeclineInvitationsRequest declineInvitationsRequest);

    /**
     * <p>
     * Deletes a custom action target from Security Hub. Deleting a custom action target doesn't affect any findings or
     * insights that were already sent to Amazon CloudWatch Events using the custom action.
     * </p>
     * 
     * @param deleteActionTargetRequest
     * @return Result of the DeleteActionTarget operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub isn't enabled for the account used to make this request.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.DeleteActionTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteActionTarget" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteActionTargetResult deleteActionTarget(DeleteActionTargetRequest deleteActionTargetRequest);

    /**
     * <p>
     * Deletes the insight specified by the <code>InsightArn</code>.
     * </p>
     * 
     * @param deleteInsightRequest
     * @return Result of the DeleteInsight operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub isn't enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.DeleteInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteInsight" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteInsightResult deleteInsight(DeleteInsightRequest deleteInsightRequest);

    /**
     * <p>
     * Deletes invitations received by the AWS account to become a member account.
     * </p>
     * 
     * @param deleteInvitationsRequest
     * @return Result of the DeleteInvitations operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @throws InvalidAccessException
     *         AWS Security Hub isn't enabled for the account used to make this request.
     * @sample AWSSecurityHub.DeleteInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteInvitationsResult deleteInvitations(DeleteInvitationsRequest deleteInvitationsRequest);

    /**
     * <p>
     * Deletes the specified member accounts from Security Hub.
     * </p>
     * 
     * @param deleteMembersRequest
     * @return Result of the DeleteMembers operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub isn't enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.DeleteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteMembers" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteMembersResult deleteMembers(DeleteMembersRequest deleteMembersRequest);

    /**
     * <p>
     * Returns a list of the custom action targets in Security Hub in your account.
     * </p>
     * 
     * @param describeActionTargetsRequest
     * @return Result of the DescribeActionTargets operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub isn't enabled for the account used to make this request.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.DescribeActionTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeActionTargets"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeActionTargetsResult describeActionTargets(DescribeActionTargetsRequest describeActionTargetsRequest);

    /**
     * <p>
     * Returns details about the Hub resource in your account, including the <code>HubArn</code> and the time when you
     * enabled Security Hub.
     * </p>
     * 
     * @param describeHubRequest
     * @return Result of the DescribeHub operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         AWS Security Hub isn't enabled for the account used to make this request.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.DescribeHub
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeHub" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeHubResult describeHub(DescribeHubRequest describeHubRequest);

    /**
     * <p>
     * Returns information about the products available that you can subscribe to and integrate with Security Hub to
     * consolidate findings.
     * </p>
     * 
     * @param describeProductsRequest
     * @return Result of the DescribeProducts operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         AWS Security Hub isn't enabled for the account used to make this request.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @sample AWSSecurityHub.DescribeProducts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeProducts" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeProductsResult describeProducts(DescribeProductsRequest describeProductsRequest);

    /**
     * <p>
     * Disables the integration of the specified product with Security Hub. Findings from that product are no longer
     * sent to Security Hub after the integration is disabled.
     * </p>
     * 
     * @param disableImportFindingsForProductRequest
     * @return Result of the DisableImportFindingsForProduct operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @throws InvalidAccessException
     *         AWS Security Hub isn't enabled for the account used to make this request.
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
     * Disables Security Hub in your account only in the current Region. To disable Security Hub in all Regions, you
     * must submit one request per Region where you have enabled Security Hub. When you disable Security Hub for a
     * master account, it doesn't disable Security Hub for any associated member accounts.
     * </p>
     * <p>
     * When you disable Security Hub, your existing findings and insights and any Security Hub configuration settings
     * are deleted after 90 days and can't be recovered. Any standards that were enabled are disabled, and your master
     * and member account associations are removed. If you want to save your existing findings, you must export them
     * before you disable Security Hub.
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
     *         AWS Security Hub isn't enabled for the account used to make this request.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.DisableSecurityHub
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisableSecurityHub" target="_top">AWS
     *      API Documentation</a>
     */
    DisableSecurityHubResult disableSecurityHub(DisableSecurityHubRequest disableSecurityHubRequest);

    /**
     * <p>
     * Disassociates the current Security Hub member account from the associated master account.
     * </p>
     * 
     * @param disassociateFromMasterAccountRequest
     * @return Result of the DisassociateFromMasterAccount operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub isn't enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.DisassociateFromMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisassociateFromMasterAccount"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateFromMasterAccountResult disassociateFromMasterAccount(DisassociateFromMasterAccountRequest disassociateFromMasterAccountRequest);

    /**
     * <p>
     * Disassociates the specified member accounts from the associated master account.
     * </p>
     * 
     * @param disassociateMembersRequest
     * @return Result of the DisassociateMembers operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub isn't enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.DisassociateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisassociateMembers"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateMembersResult disassociateMembers(DisassociateMembersRequest disassociateMembersRequest);

    /**
     * <p>
     * Enables the integration of a partner product with Security Hub. Integrated products send findings to Security
     * Hub. When you enable a product integration, a permission policy that grants permission for the product to send
     * findings to Security Hub is applied.
     * </p>
     * 
     * @param enableImportFindingsForProductRequest
     * @return Result of the EnableImportFindingsForProduct operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub isn't enabled for the account used to make this request.
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
     * Enables Security Hub for your account in the current Region or the Region you specify in the request. When you
     * enable Security Hub, you grant to Security Hub the permissions necessary to gather findings from AWS Config,
     * Amazon GuardDuty, Amazon Inspector, and Amazon Macie. To learn more, see <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-settingup.html">Setting Up AWS
     * Security Hub</a>.
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
     *         AWS Security Hub isn't enabled for the account used to make this request.
     * @throws ResourceConflictException
     *         The resource specified in the request conflicts with an existing resource.
     * @throws AccessDeniedException
     *         You don't have permission to perform the action specified in the request.
     * @sample AWSSecurityHub.EnableSecurityHub
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/EnableSecurityHub" target="_top">AWS
     *      API Documentation</a>
     */
    EnableSecurityHubResult enableSecurityHub(EnableSecurityHubRequest enableSecurityHubRequest);

    /**
     * <p>
     * Returns a list of the standards that are currently enabled.
     * </p>
     * 
     * @param getEnabledStandardsRequest
     * @return Result of the GetEnabledStandards operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub isn't enabled for the account used to make this request.
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
     * Returns a list of findings that match the specified criteria.
     * </p>
     * 
     * @param getFindingsRequest
     * @return Result of the GetFindings operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub isn't enabled for the account used to make this request.
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
     * Lists the results of the Security Hub insight that the insight ARN specifies.
     * </p>
     * 
     * @param getInsightResultsRequest
     * @return Result of the GetInsightResults operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub isn't enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.GetInsightResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetInsightResults" target="_top">AWS
     *      API Documentation</a>
     */
    GetInsightResultsResult getInsightResults(GetInsightResultsRequest getInsightResultsRequest);

    /**
     * <p>
     * Lists and describes insights that insight ARNs specify.
     * </p>
     * 
     * @param getInsightsRequest
     * @return Result of the GetInsights operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub isn't enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
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
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub isn't enabled for the account used to make this request.
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
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub isn't enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.GetMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetMasterAccount" target="_top">AWS
     *      API Documentation</a>
     */
    GetMasterAccountResult getMasterAccount(GetMasterAccountRequest getMasterAccountRequest);

    /**
     * <p>
     * Returns the details on the Security Hub member accounts that the account IDs specify.
     * </p>
     * 
     * @param getMembersRequest
     * @return Result of the GetMembers operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub isn't enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.GetMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetMembers" target="_top">AWS API
     *      Documentation</a>
     */
    GetMembersResult getMembers(GetMembersRequest getMembersRequest);

    /**
     * <p>
     * Invites other AWS accounts to become member accounts for the Security Hub master account that the invitation is
     * sent from. Before you can use this action to invite a member, you must first create the member account in
     * Security Hub by using the <a>CreateMembers</a> action. When the account owner accepts the invitation to become a
     * member account and enables Security Hub, the master account can view the findings generated from member account.
     * </p>
     * 
     * @param inviteMembersRequest
     * @return Result of the InviteMembers operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub isn't enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.InviteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/InviteMembers" target="_top">AWS API
     *      Documentation</a>
     */
    InviteMembersResult inviteMembers(InviteMembersRequest inviteMembersRequest);

    /**
     * <p>
     * Lists all findings-generating solutions (products) whose findings you have subscribed to receive in Security Hub.
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
     *         AWS Security Hub isn't enabled for the account used to make this request.
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
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub isn't enabled for the account used to make this request.
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
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub isn't enabled for the account used to make this request.
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
     * Returns a list of tags associated with a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Adds one or more tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the name and description of a custom action target in Security Hub.
     * </p>
     * 
     * @param updateActionTargetRequest
     * @return Result of the UpdateActionTarget operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @throws InvalidAccessException
     *         AWS Security Hub isn't enabled for the account used to make this request.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.UpdateActionTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateActionTarget" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateActionTargetResult updateActionTarget(UpdateActionTargetRequest updateActionTargetRequest);

    /**
     * <p>
     * Updates the <code>Note</code> and <code>RecordState</code> of the Security Hub-aggregated findings that the
     * filter attributes specify. Any member account that can view the finding also sees the update to the finding.
     * </p>
     * 
     * @param updateFindingsRequest
     * @return Result of the UpdateFindings operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws InvalidAccessException
     *         AWS Security Hub isn't enabled for the account used to make this request.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
     * @sample AWSSecurityHub.UpdateFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateFindings" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateFindingsResult updateFindings(UpdateFindingsRequest updateFindingsRequest);

    /**
     * <p>
     * Updates the Security Hub insight that the insight ARN specifies.
     * </p>
     * 
     * @param updateInsightRequest
     * @return Result of the UpdateInsight operation returned by the service.
     * @throws InternalException
     *         Internal server error.
     * @throws InvalidInputException
     *         The request was rejected because you supplied an invalid or out-of-range value for an input parameter.
     * @throws InvalidAccessException
     *         AWS Security Hub isn't enabled for the account used to make this request.
     * @throws LimitExceededException
     *         The request was rejected because it attempted to create resources beyond the current AWS account limits.
     *         The error code describes the limit exceeded.
     * @throws ResourceNotFoundException
     *         The request was rejected because we can't find the specified resource.
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
