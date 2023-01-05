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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.services.macie2.waiters.AmazonMacie2Waiters;

/**
 * Interface for accessing Amazon Macie 2.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.macie2.AbstractAmazonMacie2} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Macie
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonMacie2 {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "macie2";

    /**
     * <p>
     * Accepts an Amazon Macie membership invitation that was received from a specific account.
     * </p>
     * 
     * @param acceptInvitationRequest
     * @return Result of the AcceptInvitation operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.AcceptInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/AcceptInvitation" target="_top">AWS API
     *      Documentation</a>
     */
    AcceptInvitationResult acceptInvitation(AcceptInvitationRequest acceptInvitationRequest);

    /**
     * <p>
     * Retrieves information about one or more custom data identifiers.
     * </p>
     * 
     * @param batchGetCustomDataIdentifiersRequest
     * @return Result of the BatchGetCustomDataIdentifiers operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.BatchGetCustomDataIdentifiers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/BatchGetCustomDataIdentifiers"
     *      target="_top">AWS API Documentation</a>
     */
    BatchGetCustomDataIdentifiersResult batchGetCustomDataIdentifiers(BatchGetCustomDataIdentifiersRequest batchGetCustomDataIdentifiersRequest);

    /**
     * <p>
     * Creates and defines the settings for an allow list.
     * </p>
     * 
     * @param createAllowListRequest
     * @return Result of the CreateAllowList operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.CreateAllowList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/CreateAllowList" target="_top">AWS API
     *      Documentation</a>
     */
    CreateAllowListResult createAllowList(CreateAllowListRequest createAllowListRequest);

    /**
     * <p>
     * Creates and defines the settings for a classification job.
     * </p>
     * 
     * @param createClassificationJobRequest
     * @return Result of the CreateClassificationJob operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.CreateClassificationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/CreateClassificationJob" target="_top">AWS
     *      API Documentation</a>
     */
    CreateClassificationJobResult createClassificationJob(CreateClassificationJobRequest createClassificationJobRequest);

    /**
     * <p>
     * Creates and defines the criteria and other settings for a custom data identifier.
     * </p>
     * 
     * @param createCustomDataIdentifierRequest
     * @return Result of the CreateCustomDataIdentifier operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.CreateCustomDataIdentifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/CreateCustomDataIdentifier"
     *      target="_top">AWS API Documentation</a>
     */
    CreateCustomDataIdentifierResult createCustomDataIdentifier(CreateCustomDataIdentifierRequest createCustomDataIdentifierRequest);

    /**
     * <p>
     * Creates and defines the criteria and other settings for a findings filter.
     * </p>
     * 
     * @param createFindingsFilterRequest
     * @return Result of the CreateFindingsFilter operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.CreateFindingsFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/CreateFindingsFilter" target="_top">AWS
     *      API Documentation</a>
     */
    CreateFindingsFilterResult createFindingsFilter(CreateFindingsFilterRequest createFindingsFilterRequest);

    /**
     * <p>
     * Sends an Amazon Macie membership invitation to one or more accounts.
     * </p>
     * 
     * @param createInvitationsRequest
     * @return Result of the CreateInvitations operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.CreateInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/CreateInvitations" target="_top">AWS API
     *      Documentation</a>
     */
    CreateInvitationsResult createInvitations(CreateInvitationsRequest createInvitationsRequest);

    /**
     * <p>
     * Associates an account with an Amazon Macie administrator account.
     * </p>
     * 
     * @param createMemberRequest
     * @return Result of the CreateMember operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.CreateMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/CreateMember" target="_top">AWS API
     *      Documentation</a>
     */
    CreateMemberResult createMember(CreateMemberRequest createMemberRequest);

    /**
     * <p>
     * Creates sample findings.
     * </p>
     * 
     * @param createSampleFindingsRequest
     * @return Result of the CreateSampleFindings operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.CreateSampleFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/CreateSampleFindings" target="_top">AWS
     *      API Documentation</a>
     */
    CreateSampleFindingsResult createSampleFindings(CreateSampleFindingsRequest createSampleFindingsRequest);

    /**
     * <p>
     * Declines Amazon Macie membership invitations that were received from specific accounts.
     * </p>
     * 
     * @param declineInvitationsRequest
     * @return Result of the DeclineInvitations operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.DeclineInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DeclineInvitations" target="_top">AWS API
     *      Documentation</a>
     */
    DeclineInvitationsResult declineInvitations(DeclineInvitationsRequest declineInvitationsRequest);

    /**
     * <p>
     * Deletes an allow list.
     * </p>
     * 
     * @param deleteAllowListRequest
     * @return Result of the DeleteAllowList operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @sample AmazonMacie2.DeleteAllowList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DeleteAllowList" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteAllowListResult deleteAllowList(DeleteAllowListRequest deleteAllowListRequest);

    /**
     * <p>
     * Soft deletes a custom data identifier.
     * </p>
     * 
     * @param deleteCustomDataIdentifierRequest
     * @return Result of the DeleteCustomDataIdentifier operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.DeleteCustomDataIdentifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DeleteCustomDataIdentifier"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteCustomDataIdentifierResult deleteCustomDataIdentifier(DeleteCustomDataIdentifierRequest deleteCustomDataIdentifierRequest);

    /**
     * <p>
     * Deletes a findings filter.
     * </p>
     * 
     * @param deleteFindingsFilterRequest
     * @return Result of the DeleteFindingsFilter operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.DeleteFindingsFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DeleteFindingsFilter" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteFindingsFilterResult deleteFindingsFilter(DeleteFindingsFilterRequest deleteFindingsFilterRequest);

    /**
     * <p>
     * Deletes Amazon Macie membership invitations that were received from specific accounts.
     * </p>
     * 
     * @param deleteInvitationsRequest
     * @return Result of the DeleteInvitations operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.DeleteInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DeleteInvitations" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteInvitationsResult deleteInvitations(DeleteInvitationsRequest deleteInvitationsRequest);

    /**
     * <p>
     * Deletes the association between an Amazon Macie administrator account and an account.
     * </p>
     * 
     * @param deleteMemberRequest
     * @return Result of the DeleteMember operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.DeleteMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DeleteMember" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteMemberResult deleteMember(DeleteMemberRequest deleteMemberRequest);

    /**
     * <p>
     * Retrieves (queries) statistical data and other information about one or more S3 buckets that Amazon Macie
     * monitors and analyzes for an account.
     * </p>
     * 
     * @param describeBucketsRequest
     * @return Result of the DescribeBuckets operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.DescribeBuckets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DescribeBuckets" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeBucketsResult describeBuckets(DescribeBucketsRequest describeBucketsRequest);

    /**
     * <p>
     * Retrieves the status and settings for a classification job.
     * </p>
     * 
     * @param describeClassificationJobRequest
     * @return Result of the DescribeClassificationJob operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.DescribeClassificationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DescribeClassificationJob"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeClassificationJobResult describeClassificationJob(DescribeClassificationJobRequest describeClassificationJobRequest);

    /**
     * <p>
     * Retrieves the Amazon Macie configuration settings for an organization in Organizations.
     * </p>
     * 
     * @param describeOrganizationConfigurationRequest
     * @return Result of the DescribeOrganizationConfiguration operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.DescribeOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DescribeOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeOrganizationConfigurationResult describeOrganizationConfiguration(DescribeOrganizationConfigurationRequest describeOrganizationConfigurationRequest);

    /**
     * <p>
     * Disables Amazon Macie and deletes all settings and resources for a Macie account.
     * </p>
     * 
     * @param disableMacieRequest
     * @return Result of the DisableMacie operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.DisableMacie
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DisableMacie" target="_top">AWS API
     *      Documentation</a>
     */
    DisableMacieResult disableMacie(DisableMacieRequest disableMacieRequest);

    /**
     * <p>
     * Disables an account as the delegated Amazon Macie administrator account for an organization in Organizations.
     * </p>
     * 
     * @param disableOrganizationAdminAccountRequest
     * @return Result of the DisableOrganizationAdminAccount operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.DisableOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DisableOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    DisableOrganizationAdminAccountResult disableOrganizationAdminAccount(DisableOrganizationAdminAccountRequest disableOrganizationAdminAccountRequest);

    /**
     * <p>
     * Disassociates a member account from its Amazon Macie administrator account.
     * </p>
     * 
     * @param disassociateFromAdministratorAccountRequest
     * @return Result of the DisassociateFromAdministratorAccount operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.DisassociateFromAdministratorAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DisassociateFromAdministratorAccount"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateFromAdministratorAccountResult disassociateFromAdministratorAccount(
            DisassociateFromAdministratorAccountRequest disassociateFromAdministratorAccountRequest);

    /**
     * <p>
     * (Deprecated) Disassociates a member account from its Amazon Macie administrator account. This operation has been
     * replaced by the <link linkend="DisassociateFromAdministratorAccount">DisassociateFromAdministratorAccount</link>
     * operation.
     * </p>
     * 
     * @param disassociateFromMasterAccountRequest
     * @return Result of the DisassociateFromMasterAccount operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.DisassociateFromMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DisassociateFromMasterAccount"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateFromMasterAccountResult disassociateFromMasterAccount(DisassociateFromMasterAccountRequest disassociateFromMasterAccountRequest);

    /**
     * <p>
     * Disassociates an Amazon Macie administrator account from a member account.
     * </p>
     * 
     * @param disassociateMemberRequest
     * @return Result of the DisassociateMember operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.DisassociateMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/DisassociateMember" target="_top">AWS API
     *      Documentation</a>
     */
    DisassociateMemberResult disassociateMember(DisassociateMemberRequest disassociateMemberRequest);

    /**
     * <p>
     * Enables Amazon Macie and specifies the configuration settings for a Macie account.
     * </p>
     * 
     * @param enableMacieRequest
     * @return Result of the EnableMacie operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.EnableMacie
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/EnableMacie" target="_top">AWS API
     *      Documentation</a>
     */
    EnableMacieResult enableMacie(EnableMacieRequest enableMacieRequest);

    /**
     * <p>
     * Designates an account as the delegated Amazon Macie administrator account for an organization in Organizations.
     * </p>
     * 
     * @param enableOrganizationAdminAccountRequest
     * @return Result of the EnableOrganizationAdminAccount operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.EnableOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/EnableOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    EnableOrganizationAdminAccountResult enableOrganizationAdminAccount(EnableOrganizationAdminAccountRequest enableOrganizationAdminAccountRequest);

    /**
     * <p>
     * Retrieves information about the Amazon Macie administrator account for an account.
     * </p>
     * 
     * @param getAdministratorAccountRequest
     * @return Result of the GetAdministratorAccount operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.GetAdministratorAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetAdministratorAccount" target="_top">AWS
     *      API Documentation</a>
     */
    GetAdministratorAccountResult getAdministratorAccount(GetAdministratorAccountRequest getAdministratorAccountRequest);

    /**
     * <p>
     * Retrieves the settings and status of an allow list.
     * </p>
     * 
     * @param getAllowListRequest
     * @return Result of the GetAllowList operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @sample AmazonMacie2.GetAllowList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetAllowList" target="_top">AWS API
     *      Documentation</a>
     */
    GetAllowListResult getAllowList(GetAllowListRequest getAllowListRequest);

    /**
     * <p>
     * Retrieves the configuration settings and status of automated sensitive data discovery for an account.
     * </p>
     * 
     * @param getAutomatedDiscoveryConfigurationRequest
     * @return Result of the GetAutomatedDiscoveryConfiguration operation returned by the service.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @sample AmazonMacie2.GetAutomatedDiscoveryConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetAutomatedDiscoveryConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetAutomatedDiscoveryConfigurationResult getAutomatedDiscoveryConfiguration(
            GetAutomatedDiscoveryConfigurationRequest getAutomatedDiscoveryConfigurationRequest);

    /**
     * <p>
     * Retrieves (queries) aggregated statistical data about all the S3 buckets that Amazon Macie monitors and analyzes
     * for an account.
     * </p>
     * 
     * @param getBucketStatisticsRequest
     * @return Result of the GetBucketStatistics operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.GetBucketStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetBucketStatistics" target="_top">AWS API
     *      Documentation</a>
     */
    GetBucketStatisticsResult getBucketStatistics(GetBucketStatisticsRequest getBucketStatisticsRequest);

    /**
     * <p>
     * Retrieves the configuration settings for storing data classification results.
     * </p>
     * 
     * @param getClassificationExportConfigurationRequest
     * @return Result of the GetClassificationExportConfiguration operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.GetClassificationExportConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetClassificationExportConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetClassificationExportConfigurationResult getClassificationExportConfiguration(
            GetClassificationExportConfigurationRequest getClassificationExportConfigurationRequest);

    /**
     * <p>
     * Retrieves the classification scope settings for an account.
     * </p>
     * 
     * @param getClassificationScopeRequest
     * @return Result of the GetClassificationScope operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @sample AmazonMacie2.GetClassificationScope
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetClassificationScope" target="_top">AWS
     *      API Documentation</a>
     */
    GetClassificationScopeResult getClassificationScope(GetClassificationScopeRequest getClassificationScopeRequest);

    /**
     * <p>
     * Retrieves the criteria and other settings for a custom data identifier.
     * </p>
     * 
     * @param getCustomDataIdentifierRequest
     * @return Result of the GetCustomDataIdentifier operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.GetCustomDataIdentifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetCustomDataIdentifier" target="_top">AWS
     *      API Documentation</a>
     */
    GetCustomDataIdentifierResult getCustomDataIdentifier(GetCustomDataIdentifierRequest getCustomDataIdentifierRequest);

    /**
     * <p>
     * Retrieves (queries) aggregated statistical data about findings.
     * </p>
     * 
     * @param getFindingStatisticsRequest
     * @return Result of the GetFindingStatistics operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.GetFindingStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetFindingStatistics" target="_top">AWS
     *      API Documentation</a>
     */
    GetFindingStatisticsResult getFindingStatistics(GetFindingStatisticsRequest getFindingStatisticsRequest);

    /**
     * <p>
     * Retrieves the details of one or more findings.
     * </p>
     * 
     * @param getFindingsRequest
     * @return Result of the GetFindings operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.GetFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetFindings" target="_top">AWS API
     *      Documentation</a>
     */
    GetFindingsResult getFindings(GetFindingsRequest getFindingsRequest);

    /**
     * <p>
     * Retrieves the criteria and other settings for a findings filter.
     * </p>
     * 
     * @param getFindingsFilterRequest
     * @return Result of the GetFindingsFilter operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.GetFindingsFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetFindingsFilter" target="_top">AWS API
     *      Documentation</a>
     */
    GetFindingsFilterResult getFindingsFilter(GetFindingsFilterRequest getFindingsFilterRequest);

    /**
     * <p>
     * Retrieves the configuration settings for publishing findings to Security Hub.
     * </p>
     * 
     * @param getFindingsPublicationConfigurationRequest
     * @return Result of the GetFindingsPublicationConfiguration operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.GetFindingsPublicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetFindingsPublicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetFindingsPublicationConfigurationResult getFindingsPublicationConfiguration(
            GetFindingsPublicationConfigurationRequest getFindingsPublicationConfigurationRequest);

    /**
     * <p>
     * Retrieves the count of Amazon Macie membership invitations that were received by an account.
     * </p>
     * 
     * @param getInvitationsCountRequest
     * @return Result of the GetInvitationsCount operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.GetInvitationsCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetInvitationsCount" target="_top">AWS API
     *      Documentation</a>
     */
    GetInvitationsCountResult getInvitationsCount(GetInvitationsCountRequest getInvitationsCountRequest);

    /**
     * <p>
     * Retrieves the status and configuration settings for an Amazon Macie account.
     * </p>
     * 
     * @param getMacieSessionRequest
     * @return Result of the GetMacieSession operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.GetMacieSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetMacieSession" target="_top">AWS API
     *      Documentation</a>
     */
    GetMacieSessionResult getMacieSession(GetMacieSessionRequest getMacieSessionRequest);

    /**
     * <p>
     * (Deprecated) Retrieves information about the Amazon Macie administrator account for an account. This operation
     * has been replaced by the <link linkend="GetAdministratorAccount">GetAdministratorAccount</link> operation.
     * </p>
     * 
     * @param getMasterAccountRequest
     * @return Result of the GetMasterAccount operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.GetMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetMasterAccount" target="_top">AWS API
     *      Documentation</a>
     */
    GetMasterAccountResult getMasterAccount(GetMasterAccountRequest getMasterAccountRequest);

    /**
     * <p>
     * Retrieves information about an account that's associated with an Amazon Macie administrator account.
     * </p>
     * 
     * @param getMemberRequest
     * @return Result of the GetMember operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.GetMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetMember" target="_top">AWS API
     *      Documentation</a>
     */
    GetMemberResult getMember(GetMemberRequest getMemberRequest);

    /**
     * <p>
     * Retrieves (queries) sensitive data discovery statistics and the sensitivity score for an S3 bucket.
     * </p>
     * 
     * @param getResourceProfileRequest
     * @return Result of the GetResourceProfile operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @sample AmazonMacie2.GetResourceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetResourceProfile" target="_top">AWS API
     *      Documentation</a>
     */
    GetResourceProfileResult getResourceProfile(GetResourceProfileRequest getResourceProfileRequest);

    /**
     * <p>
     * Retrieves the status and configuration settings for retrieving occurrences of sensitive data reported by
     * findings.
     * </p>
     * 
     * @param getRevealConfigurationRequest
     * @return Result of the GetRevealConfiguration operation returned by the service.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @sample AmazonMacie2.GetRevealConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetRevealConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    GetRevealConfigurationResult getRevealConfiguration(GetRevealConfigurationRequest getRevealConfigurationRequest);

    /**
     * <p>
     * Retrieves occurrences of sensitive data reported by a finding.
     * </p>
     * 
     * @param getSensitiveDataOccurrencesRequest
     * @return Result of the GetSensitiveDataOccurrences operation returned by the service.
     * @throws UnprocessableEntityException
     *         The request failed because it contains instructions that Amazon Macie can't process (Unprocessable
     *         Entity).
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @sample AmazonMacie2.GetSensitiveDataOccurrences
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetSensitiveDataOccurrences"
     *      target="_top">AWS API Documentation</a>
     */
    GetSensitiveDataOccurrencesResult getSensitiveDataOccurrences(GetSensitiveDataOccurrencesRequest getSensitiveDataOccurrencesRequest);

    /**
     * <p>
     * Checks whether occurrences of sensitive data can be retrieved for a finding.
     * </p>
     * 
     * @param getSensitiveDataOccurrencesAvailabilityRequest
     * @return Result of the GetSensitiveDataOccurrencesAvailability operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @sample AmazonMacie2.GetSensitiveDataOccurrencesAvailability
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetSensitiveDataOccurrencesAvailability"
     *      target="_top">AWS API Documentation</a>
     */
    GetSensitiveDataOccurrencesAvailabilityResult getSensitiveDataOccurrencesAvailability(
            GetSensitiveDataOccurrencesAvailabilityRequest getSensitiveDataOccurrencesAvailabilityRequest);

    /**
     * <p>
     * Retrieves the settings for the sensitivity inspection template for an account.
     * </p>
     * 
     * @param getSensitivityInspectionTemplateRequest
     * @return Result of the GetSensitivityInspectionTemplate operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @sample AmazonMacie2.GetSensitivityInspectionTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetSensitivityInspectionTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    GetSensitivityInspectionTemplateResult getSensitivityInspectionTemplate(GetSensitivityInspectionTemplateRequest getSensitivityInspectionTemplateRequest);

    /**
     * <p>
     * Retrieves (queries) quotas and aggregated usage data for one or more accounts.
     * </p>
     * 
     * @param getUsageStatisticsRequest
     * @return Result of the GetUsageStatistics operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.GetUsageStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetUsageStatistics" target="_top">AWS API
     *      Documentation</a>
     */
    GetUsageStatisticsResult getUsageStatistics(GetUsageStatisticsRequest getUsageStatisticsRequest);

    /**
     * <p>
     * Retrieves (queries) aggregated usage data for an account.
     * </p>
     * 
     * @param getUsageTotalsRequest
     * @return Result of the GetUsageTotals operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.GetUsageTotals
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/GetUsageTotals" target="_top">AWS API
     *      Documentation</a>
     */
    GetUsageTotalsResult getUsageTotals(GetUsageTotalsRequest getUsageTotalsRequest);

    /**
     * <p>
     * Retrieves a subset of information about all the allow lists for an account.
     * </p>
     * 
     * @param listAllowListsRequest
     * @return Result of the ListAllowLists operation returned by the service.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @sample AmazonMacie2.ListAllowLists
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListAllowLists" target="_top">AWS API
     *      Documentation</a>
     */
    ListAllowListsResult listAllowLists(ListAllowListsRequest listAllowListsRequest);

    /**
     * <p>
     * Retrieves a subset of information about one or more classification jobs.
     * </p>
     * 
     * @param listClassificationJobsRequest
     * @return Result of the ListClassificationJobs operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.ListClassificationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListClassificationJobs" target="_top">AWS
     *      API Documentation</a>
     */
    ListClassificationJobsResult listClassificationJobs(ListClassificationJobsRequest listClassificationJobsRequest);

    /**
     * <p>
     * Retrieves a subset of information about the classification scope for an account.
     * </p>
     * 
     * @param listClassificationScopesRequest
     * @return Result of the ListClassificationScopes operation returned by the service.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @sample AmazonMacie2.ListClassificationScopes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListClassificationScopes"
     *      target="_top">AWS API Documentation</a>
     */
    ListClassificationScopesResult listClassificationScopes(ListClassificationScopesRequest listClassificationScopesRequest);

    /**
     * <p>
     * Retrieves a subset of information about all the custom data identifiers for an account.
     * </p>
     * 
     * @param listCustomDataIdentifiersRequest
     * @return Result of the ListCustomDataIdentifiers operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.ListCustomDataIdentifiers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListCustomDataIdentifiers"
     *      target="_top">AWS API Documentation</a>
     */
    ListCustomDataIdentifiersResult listCustomDataIdentifiers(ListCustomDataIdentifiersRequest listCustomDataIdentifiersRequest);

    /**
     * <p>
     * Retrieves a subset of information about one or more findings.
     * </p>
     * 
     * @param listFindingsRequest
     * @return Result of the ListFindings operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.ListFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListFindings" target="_top">AWS API
     *      Documentation</a>
     */
    ListFindingsResult listFindings(ListFindingsRequest listFindingsRequest);

    /**
     * <p>
     * Retrieves a subset of information about all the findings filters for an account.
     * </p>
     * 
     * @param listFindingsFiltersRequest
     * @return Result of the ListFindingsFilters operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.ListFindingsFilters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListFindingsFilters" target="_top">AWS API
     *      Documentation</a>
     */
    ListFindingsFiltersResult listFindingsFilters(ListFindingsFiltersRequest listFindingsFiltersRequest);

    /**
     * <p>
     * Retrieves information about the Amazon Macie membership invitations that were received by an account.
     * </p>
     * 
     * @param listInvitationsRequest
     * @return Result of the ListInvitations operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.ListInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListInvitations" target="_top">AWS API
     *      Documentation</a>
     */
    ListInvitationsResult listInvitations(ListInvitationsRequest listInvitationsRequest);

    /**
     * <p>
     * Retrieves information about all the managed data identifiers that Amazon Macie currently provides.
     * </p>
     * 
     * @param listManagedDataIdentifiersRequest
     * @return Result of the ListManagedDataIdentifiers operation returned by the service.
     * @sample AmazonMacie2.ListManagedDataIdentifiers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListManagedDataIdentifiers"
     *      target="_top">AWS API Documentation</a>
     */
    ListManagedDataIdentifiersResult listManagedDataIdentifiers(ListManagedDataIdentifiersRequest listManagedDataIdentifiersRequest);

    /**
     * <p>
     * Retrieves information about the accounts that are associated with an Amazon Macie administrator account.
     * </p>
     * 
     * @param listMembersRequest
     * @return Result of the ListMembers operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.ListMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListMembers" target="_top">AWS API
     *      Documentation</a>
     */
    ListMembersResult listMembers(ListMembersRequest listMembersRequest);

    /**
     * <p>
     * Retrieves information about the delegated Amazon Macie administrator account for an organization in
     * Organizations.
     * </p>
     * 
     * @param listOrganizationAdminAccountsRequest
     * @return Result of the ListOrganizationAdminAccounts operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.ListOrganizationAdminAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListOrganizationAdminAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    ListOrganizationAdminAccountsResult listOrganizationAdminAccounts(ListOrganizationAdminAccountsRequest listOrganizationAdminAccountsRequest);

    /**
     * <p>
     * Retrieves information about objects that were selected from an S3 bucket for automated sensitive data discovery.
     * </p>
     * 
     * @param listResourceProfileArtifactsRequest
     * @return Result of the ListResourceProfileArtifacts operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @sample AmazonMacie2.ListResourceProfileArtifacts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListResourceProfileArtifacts"
     *      target="_top">AWS API Documentation</a>
     */
    ListResourceProfileArtifactsResult listResourceProfileArtifacts(ListResourceProfileArtifactsRequest listResourceProfileArtifactsRequest);

    /**
     * <p>
     * Retrieves information about the types and amount of sensitive data that Amazon Macie found in an S3 bucket.
     * </p>
     * 
     * @param listResourceProfileDetectionsRequest
     * @return Result of the ListResourceProfileDetections operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @sample AmazonMacie2.ListResourceProfileDetections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListResourceProfileDetections"
     *      target="_top">AWS API Documentation</a>
     */
    ListResourceProfileDetectionsResult listResourceProfileDetections(ListResourceProfileDetectionsRequest listResourceProfileDetectionsRequest);

    /**
     * <p>
     * Retrieves a subset of information about the sensitivity inspection template for an account.
     * </p>
     * 
     * @param listSensitivityInspectionTemplatesRequest
     * @return Result of the ListSensitivityInspectionTemplates operation returned by the service.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @sample AmazonMacie2.ListSensitivityInspectionTemplates
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListSensitivityInspectionTemplates"
     *      target="_top">AWS API Documentation</a>
     */
    ListSensitivityInspectionTemplatesResult listSensitivityInspectionTemplates(
            ListSensitivityInspectionTemplatesRequest listSensitivityInspectionTemplatesRequest);

    /**
     * <p>
     * Retrieves the tags (keys and values) that are associated with an Amazon Macie resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @sample AmazonMacie2.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Creates or updates the configuration settings for storing data classification results.
     * </p>
     * 
     * @param putClassificationExportConfigurationRequest
     * @return Result of the PutClassificationExportConfiguration operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.PutClassificationExportConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/PutClassificationExportConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    PutClassificationExportConfigurationResult putClassificationExportConfiguration(
            PutClassificationExportConfigurationRequest putClassificationExportConfigurationRequest);

    /**
     * <p>
     * Updates the configuration settings for publishing findings to Security Hub.
     * </p>
     * 
     * @param putFindingsPublicationConfigurationRequest
     * @return Result of the PutFindingsPublicationConfiguration operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.PutFindingsPublicationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/PutFindingsPublicationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    PutFindingsPublicationConfigurationResult putFindingsPublicationConfiguration(
            PutFindingsPublicationConfigurationRequest putFindingsPublicationConfigurationRequest);

    /**
     * <p>
     * Retrieves (queries) statistical data and other information about Amazon Web Services resources that Amazon Macie
     * monitors and analyzes.
     * </p>
     * 
     * @param searchResourcesRequest
     * @return Result of the SearchResources operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.SearchResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/SearchResources" target="_top">AWS API
     *      Documentation</a>
     */
    SearchResourcesResult searchResources(SearchResourcesRequest searchResourcesRequest);

    /**
     * <p>
     * Adds or updates one or more tags (keys and values) that are associated with an Amazon Macie resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @sample AmazonMacie2.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Tests a custom data identifier.
     * </p>
     * 
     * @param testCustomDataIdentifierRequest
     * @return Result of the TestCustomDataIdentifier operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.TestCustomDataIdentifier
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/TestCustomDataIdentifier"
     *      target="_top">AWS API Documentation</a>
     */
    TestCustomDataIdentifierResult testCustomDataIdentifier(TestCustomDataIdentifierRequest testCustomDataIdentifierRequest);

    /**
     * <p>
     * Removes one or more tags (keys and values) from an Amazon Macie resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @sample AmazonMacie2.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the settings for an allow list.
     * </p>
     * 
     * @param updateAllowListRequest
     * @return Result of the UpdateAllowList operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @sample AmazonMacie2.UpdateAllowList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateAllowList" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateAllowListResult updateAllowList(UpdateAllowListRequest updateAllowListRequest);

    /**
     * <p>
     * Enables or disables automated sensitive data discovery for an account.
     * </p>
     * 
     * @param updateAutomatedDiscoveryConfigurationRequest
     * @return Result of the UpdateAutomatedDiscoveryConfiguration operation returned by the service.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @sample AmazonMacie2.UpdateAutomatedDiscoveryConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateAutomatedDiscoveryConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateAutomatedDiscoveryConfigurationResult updateAutomatedDiscoveryConfiguration(
            UpdateAutomatedDiscoveryConfigurationRequest updateAutomatedDiscoveryConfigurationRequest);

    /**
     * <p>
     * Changes the status of a classification job.
     * </p>
     * 
     * @param updateClassificationJobRequest
     * @return Result of the UpdateClassificationJob operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.UpdateClassificationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateClassificationJob" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateClassificationJobResult updateClassificationJob(UpdateClassificationJobRequest updateClassificationJobRequest);

    /**
     * <p>
     * Updates the classification scope settings for an account.
     * </p>
     * 
     * @param updateClassificationScopeRequest
     * @return Result of the UpdateClassificationScope operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @sample AmazonMacie2.UpdateClassificationScope
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateClassificationScope"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateClassificationScopeResult updateClassificationScope(UpdateClassificationScopeRequest updateClassificationScopeRequest);

    /**
     * <p>
     * Updates the criteria and other settings for a findings filter.
     * </p>
     * 
     * @param updateFindingsFilterRequest
     * @return Result of the UpdateFindingsFilter operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.UpdateFindingsFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateFindingsFilter" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateFindingsFilterResult updateFindingsFilter(UpdateFindingsFilterRequest updateFindingsFilterRequest);

    /**
     * <p>
     * Suspends or re-enables Amazon Macie, or updates the configuration settings for a Macie account.
     * </p>
     * 
     * @param updateMacieSessionRequest
     * @return Result of the UpdateMacieSession operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.UpdateMacieSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateMacieSession" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateMacieSessionResult updateMacieSession(UpdateMacieSessionRequest updateMacieSessionRequest);

    /**
     * <p>
     * Enables an Amazon Macie administrator to suspend or re-enable Macie for a member account.
     * </p>
     * 
     * @param updateMemberSessionRequest
     * @return Result of the UpdateMemberSession operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.UpdateMemberSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateMemberSession" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateMemberSessionResult updateMemberSession(UpdateMemberSessionRequest updateMemberSessionRequest);

    /**
     * <p>
     * Updates the Amazon Macie configuration settings for an organization in Organizations.
     * </p>
     * 
     * @param updateOrganizationConfigurationRequest
     * @return Result of the UpdateOrganizationConfiguration operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ConflictException
     *         The request failed because it conflicts with the current state of the specified resource.
     * @sample AmazonMacie2.UpdateOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateOrganizationConfigurationResult updateOrganizationConfiguration(UpdateOrganizationConfigurationRequest updateOrganizationConfigurationRequest);

    /**
     * <p>
     * Updates the sensitivity score for an S3 bucket.
     * </p>
     * 
     * @param updateResourceProfileRequest
     * @return Result of the UpdateResourceProfile operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @sample AmazonMacie2.UpdateResourceProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateResourceProfile" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateResourceProfileResult updateResourceProfile(UpdateResourceProfileRequest updateResourceProfileRequest);

    /**
     * <p>
     * Updates the sensitivity scoring settings for an S3 bucket.
     * </p>
     * 
     * @param updateResourceProfileDetectionsRequest
     * @return Result of the UpdateResourceProfileDetections operation returned by the service.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws ServiceQuotaExceededException
     *         The request failed because fulfilling the request would exceed one or more service quotas for your
     *         account.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @sample AmazonMacie2.UpdateResourceProfileDetections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateResourceProfileDetections"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateResourceProfileDetectionsResult updateResourceProfileDetections(UpdateResourceProfileDetectionsRequest updateResourceProfileDetectionsRequest);

    /**
     * <p>
     * Updates the status and configuration settings for retrieving occurrences of sensitive data reported by findings.
     * </p>
     * 
     * @param updateRevealConfigurationRequest
     * @return Result of the UpdateRevealConfiguration operation returned by the service.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @sample AmazonMacie2.UpdateRevealConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateRevealConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateRevealConfigurationResult updateRevealConfiguration(UpdateRevealConfigurationRequest updateRevealConfigurationRequest);

    /**
     * <p>
     * Updates the settings for the sensitivity inspection template for an account.
     * </p>
     * 
     * @param updateSensitivityInspectionTemplateRequest
     * @return Result of the UpdateSensitivityInspectionTemplate operation returned by the service.
     * @throws ResourceNotFoundException
     *         The request failed because the specified resource wasn't found.
     * @throws ThrottlingException
     *         The request failed because you sent too many requests during a certain amount of time.
     * @throws ValidationException
     *         The request failed because the input doesn't satisfy the constraints specified by the service.
     * @throws InternalServerException
     *         The request failed due to an unknown internal server error, exception, or failure.
     * @throws AccessDeniedException
     *         The request was denied because you don't have sufficient access to the specified resource.
     * @sample AmazonMacie2.UpdateSensitivityInspectionTemplate
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateSensitivityInspectionTemplate"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateSensitivityInspectionTemplateResult updateSensitivityInspectionTemplate(
            UpdateSensitivityInspectionTemplateRequest updateSensitivityInspectionTemplateRequest);

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

    AmazonMacie2Waiters waiters();

}
