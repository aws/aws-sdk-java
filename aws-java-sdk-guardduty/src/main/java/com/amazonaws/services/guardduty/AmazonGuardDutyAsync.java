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
package com.amazonaws.services.guardduty;

import javax.annotation.Generated;

import com.amazonaws.services.guardduty.model.*;

/**
 * Interface for accessing Amazon GuardDuty asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.guardduty.AbstractAmazonGuardDutyAsync} instead.
 * </p>
 * <p>
 * Assess, monitor, manage, and remediate security issues across your AWS infrastructure, applications, and data.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonGuardDutyAsync extends AmazonGuardDuty {

    /**
     * Accepts the invitation to be monitored by a master GuardDuty account.
     * 
     * @param acceptInvitationRequest
     *        AcceptInvitation request body.
     * @return A Java Future containing the result of the AcceptInvitation operation returned by the service.
     * @sample AmazonGuardDutyAsync.AcceptInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/AcceptInvitation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AcceptInvitationResult> acceptInvitationAsync(AcceptInvitationRequest acceptInvitationRequest);

    /**
     * Accepts the invitation to be monitored by a master GuardDuty account.
     * 
     * @param acceptInvitationRequest
     *        AcceptInvitation request body.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AcceptInvitation operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.AcceptInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/AcceptInvitation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AcceptInvitationResult> acceptInvitationAsync(AcceptInvitationRequest acceptInvitationRequest,
            com.amazonaws.handlers.AsyncHandler<AcceptInvitationRequest, AcceptInvitationResult> asyncHandler);

    /**
     * Archives Amazon GuardDuty findings specified by the list of finding IDs.
     * 
     * @param archiveFindingsRequest
     *        ArchiveFindings request body.
     * @return A Java Future containing the result of the ArchiveFindings operation returned by the service.
     * @sample AmazonGuardDutyAsync.ArchiveFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ArchiveFindings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ArchiveFindingsResult> archiveFindingsAsync(ArchiveFindingsRequest archiveFindingsRequest);

    /**
     * Archives Amazon GuardDuty findings specified by the list of finding IDs.
     * 
     * @param archiveFindingsRequest
     *        ArchiveFindings request body.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ArchiveFindings operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.ArchiveFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ArchiveFindings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ArchiveFindingsResult> archiveFindingsAsync(ArchiveFindingsRequest archiveFindingsRequest,
            com.amazonaws.handlers.AsyncHandler<ArchiveFindingsRequest, ArchiveFindingsResult> asyncHandler);

    /**
     * Creates a single Amazon GuardDuty detector. A detector is an object that represents the GuardDuty service. A
     * detector must be created in order for GuardDuty to become operational.
     * 
     * @param createDetectorRequest
     *        CreateDetector request body.
     * @return A Java Future containing the result of the CreateDetector operation returned by the service.
     * @sample AmazonGuardDutyAsync.CreateDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateDetector" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDetectorResult> createDetectorAsync(CreateDetectorRequest createDetectorRequest);

    /**
     * Creates a single Amazon GuardDuty detector. A detector is an object that represents the GuardDuty service. A
     * detector must be created in order for GuardDuty to become operational.
     * 
     * @param createDetectorRequest
     *        CreateDetector request body.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDetector operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.CreateDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateDetector" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDetectorResult> createDetectorAsync(CreateDetectorRequest createDetectorRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDetectorRequest, CreateDetectorResult> asyncHandler);

    /**
     * Creates a filter using the specified finding criteria.
     * 
     * @param createFilterRequest
     *        CreateFilterRequest request body.
     * @return A Java Future containing the result of the CreateFilter operation returned by the service.
     * @sample AmazonGuardDutyAsync.CreateFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateFilter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFilterResult> createFilterAsync(CreateFilterRequest createFilterRequest);

    /**
     * Creates a filter using the specified finding criteria.
     * 
     * @param createFilterRequest
     *        CreateFilterRequest request body.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFilter operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.CreateFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateFilter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFilterResult> createFilterAsync(CreateFilterRequest createFilterRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFilterRequest, CreateFilterResult> asyncHandler);

    /**
     * Creates a new IPSet - a list of trusted IP addresses that have been whitelisted for secure communication with AWS
     * infrastructure and applications.
     * 
     * @param createIPSetRequest
     *        CreateIPSet request body.
     * @return A Java Future containing the result of the CreateIPSet operation returned by the service.
     * @sample AmazonGuardDutyAsync.CreateIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateIPSetResult> createIPSetAsync(CreateIPSetRequest createIPSetRequest);

    /**
     * Creates a new IPSet - a list of trusted IP addresses that have been whitelisted for secure communication with AWS
     * infrastructure and applications.
     * 
     * @param createIPSetRequest
     *        CreateIPSet request body.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateIPSet operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.CreateIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateIPSetResult> createIPSetAsync(CreateIPSetRequest createIPSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateIPSetRequest, CreateIPSetResult> asyncHandler);

    /**
     * Creates member accounts of the current AWS account by specifying a list of AWS account IDs. The current AWS
     * account can then invite these members to manage GuardDuty in their accounts.
     * 
     * @param createMembersRequest
     *        CreateMembers request body.
     * @return A Java Future containing the result of the CreateMembers operation returned by the service.
     * @sample AmazonGuardDutyAsync.CreateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateMembersResult> createMembersAsync(CreateMembersRequest createMembersRequest);

    /**
     * Creates member accounts of the current AWS account by specifying a list of AWS account IDs. The current AWS
     * account can then invite these members to manage GuardDuty in their accounts.
     * 
     * @param createMembersRequest
     *        CreateMembers request body.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMembers operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.CreateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateMembersResult> createMembersAsync(CreateMembersRequest createMembersRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMembersRequest, CreateMembersResult> asyncHandler);

    /**
     * Generates example findings of types specified by the list of finding types. If 'NULL' is specified for
     * findingTypes, the API generates example findings of all supported finding types.
     * 
     * @param createSampleFindingsRequest
     *        CreateSampleFindings request body.
     * @return A Java Future containing the result of the CreateSampleFindings operation returned by the service.
     * @sample AmazonGuardDutyAsync.CreateSampleFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateSampleFindings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateSampleFindingsResult> createSampleFindingsAsync(CreateSampleFindingsRequest createSampleFindingsRequest);

    /**
     * Generates example findings of types specified by the list of finding types. If 'NULL' is specified for
     * findingTypes, the API generates example findings of all supported finding types.
     * 
     * @param createSampleFindingsRequest
     *        CreateSampleFindings request body.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSampleFindings operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.CreateSampleFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateSampleFindings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateSampleFindingsResult> createSampleFindingsAsync(CreateSampleFindingsRequest createSampleFindingsRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSampleFindingsRequest, CreateSampleFindingsResult> asyncHandler);

    /**
     * Create a new ThreatIntelSet. ThreatIntelSets consist of known malicious IP addresses. GuardDuty generates
     * findings based on ThreatIntelSets.
     * 
     * @param createThreatIntelSetRequest
     *        CreateThreatIntelSet request body.
     * @return A Java Future containing the result of the CreateThreatIntelSet operation returned by the service.
     * @sample AmazonGuardDutyAsync.CreateThreatIntelSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateThreatIntelSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateThreatIntelSetResult> createThreatIntelSetAsync(CreateThreatIntelSetRequest createThreatIntelSetRequest);

    /**
     * Create a new ThreatIntelSet. ThreatIntelSets consist of known malicious IP addresses. GuardDuty generates
     * findings based on ThreatIntelSets.
     * 
     * @param createThreatIntelSetRequest
     *        CreateThreatIntelSet request body.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateThreatIntelSet operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.CreateThreatIntelSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateThreatIntelSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateThreatIntelSetResult> createThreatIntelSetAsync(CreateThreatIntelSetRequest createThreatIntelSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateThreatIntelSetRequest, CreateThreatIntelSetResult> asyncHandler);

    /**
     * Declines invitations sent to the current member account by AWS account specified by their account IDs.
     * 
     * @param declineInvitationsRequest
     *        DeclineInvitations request body.
     * @return A Java Future containing the result of the DeclineInvitations operation returned by the service.
     * @sample AmazonGuardDutyAsync.DeclineInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeclineInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeclineInvitationsResult> declineInvitationsAsync(DeclineInvitationsRequest declineInvitationsRequest);

    /**
     * Declines invitations sent to the current member account by AWS account specified by their account IDs.
     * 
     * @param declineInvitationsRequest
     *        DeclineInvitations request body.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeclineInvitations operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.DeclineInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeclineInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeclineInvitationsResult> declineInvitationsAsync(DeclineInvitationsRequest declineInvitationsRequest,
            com.amazonaws.handlers.AsyncHandler<DeclineInvitationsRequest, DeclineInvitationsResult> asyncHandler);

    /**
     * Deletes a Amazon GuardDuty detector specified by the detector ID.
     * 
     * @param deleteDetectorRequest
     * @return A Java Future containing the result of the DeleteDetector operation returned by the service.
     * @sample AmazonGuardDutyAsync.DeleteDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteDetector" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDetectorResult> deleteDetectorAsync(DeleteDetectorRequest deleteDetectorRequest);

    /**
     * Deletes a Amazon GuardDuty detector specified by the detector ID.
     * 
     * @param deleteDetectorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDetector operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.DeleteDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteDetector" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDetectorResult> deleteDetectorAsync(DeleteDetectorRequest deleteDetectorRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDetectorRequest, DeleteDetectorResult> asyncHandler);

    /**
     * Deletes the filter specified by the filter name.
     * 
     * @param deleteFilterRequest
     * @return A Java Future containing the result of the DeleteFilter operation returned by the service.
     * @sample AmazonGuardDutyAsync.DeleteFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteFilter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFilterResult> deleteFilterAsync(DeleteFilterRequest deleteFilterRequest);

    /**
     * Deletes the filter specified by the filter name.
     * 
     * @param deleteFilterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFilter operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.DeleteFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteFilter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFilterResult> deleteFilterAsync(DeleteFilterRequest deleteFilterRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFilterRequest, DeleteFilterResult> asyncHandler);

    /**
     * Deletes the IPSet specified by the IPSet ID.
     * 
     * @param deleteIPSetRequest
     * @return A Java Future containing the result of the DeleteIPSet operation returned by the service.
     * @sample AmazonGuardDutyAsync.DeleteIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteIPSetResult> deleteIPSetAsync(DeleteIPSetRequest deleteIPSetRequest);

    /**
     * Deletes the IPSet specified by the IPSet ID.
     * 
     * @param deleteIPSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteIPSet operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.DeleteIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteIPSetResult> deleteIPSetAsync(DeleteIPSetRequest deleteIPSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteIPSetRequest, DeleteIPSetResult> asyncHandler);

    /**
     * Deletes invitations sent to the current member account by AWS accounts specified by their account IDs.
     * 
     * @param deleteInvitationsRequest
     *        DeleteInvitations request body.
     * @return A Java Future containing the result of the DeleteInvitations operation returned by the service.
     * @sample AmazonGuardDutyAsync.DeleteInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteInvitationsResult> deleteInvitationsAsync(DeleteInvitationsRequest deleteInvitationsRequest);

    /**
     * Deletes invitations sent to the current member account by AWS accounts specified by their account IDs.
     * 
     * @param deleteInvitationsRequest
     *        DeleteInvitations request body.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteInvitations operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.DeleteInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteInvitationsResult> deleteInvitationsAsync(DeleteInvitationsRequest deleteInvitationsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteInvitationsRequest, DeleteInvitationsResult> asyncHandler);

    /**
     * Deletes GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.
     * 
     * @param deleteMembersRequest
     *        DeleteMembers request body.
     * @return A Java Future containing the result of the DeleteMembers operation returned by the service.
     * @sample AmazonGuardDutyAsync.DeleteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteMembersResult> deleteMembersAsync(DeleteMembersRequest deleteMembersRequest);

    /**
     * Deletes GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.
     * 
     * @param deleteMembersRequest
     *        DeleteMembers request body.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMembers operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.DeleteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteMembersResult> deleteMembersAsync(DeleteMembersRequest deleteMembersRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMembersRequest, DeleteMembersResult> asyncHandler);

    /**
     * Deletes ThreatIntelSet specified by the ThreatIntelSet ID.
     * 
     * @param deleteThreatIntelSetRequest
     * @return A Java Future containing the result of the DeleteThreatIntelSet operation returned by the service.
     * @sample AmazonGuardDutyAsync.DeleteThreatIntelSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteThreatIntelSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteThreatIntelSetResult> deleteThreatIntelSetAsync(DeleteThreatIntelSetRequest deleteThreatIntelSetRequest);

    /**
     * Deletes ThreatIntelSet specified by the ThreatIntelSet ID.
     * 
     * @param deleteThreatIntelSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteThreatIntelSet operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.DeleteThreatIntelSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteThreatIntelSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteThreatIntelSetResult> deleteThreatIntelSetAsync(DeleteThreatIntelSetRequest deleteThreatIntelSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteThreatIntelSetRequest, DeleteThreatIntelSetResult> asyncHandler);

    /**
     * Disassociates the current GuardDuty member account from its master account.
     * 
     * @param disassociateFromMasterAccountRequest
     * @return A Java Future containing the result of the DisassociateFromMasterAccount operation returned by the
     *         service.
     * @sample AmazonGuardDutyAsync.DisassociateFromMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DisassociateFromMasterAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateFromMasterAccountResult> disassociateFromMasterAccountAsync(
            DisassociateFromMasterAccountRequest disassociateFromMasterAccountRequest);

    /**
     * Disassociates the current GuardDuty member account from its master account.
     * 
     * @param disassociateFromMasterAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateFromMasterAccount operation returned by the
     *         service.
     * @sample AmazonGuardDutyAsyncHandler.DisassociateFromMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DisassociateFromMasterAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateFromMasterAccountResult> disassociateFromMasterAccountAsync(
            DisassociateFromMasterAccountRequest disassociateFromMasterAccountRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateFromMasterAccountRequest, DisassociateFromMasterAccountResult> asyncHandler);

    /**
     * Disassociates GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.
     * 
     * @param disassociateMembersRequest
     *        DisassociateMembers request body.
     * @return A Java Future containing the result of the DisassociateMembers operation returned by the service.
     * @sample AmazonGuardDutyAsync.DisassociateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DisassociateMembers" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateMembersResult> disassociateMembersAsync(DisassociateMembersRequest disassociateMembersRequest);

    /**
     * Disassociates GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.
     * 
     * @param disassociateMembersRequest
     *        DisassociateMembers request body.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateMembers operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.DisassociateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DisassociateMembers" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateMembersResult> disassociateMembersAsync(DisassociateMembersRequest disassociateMembersRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateMembersRequest, DisassociateMembersResult> asyncHandler);

    /**
     * Retrieves an Amazon GuardDuty detector specified by the detectorId.
     * 
     * @param getDetectorRequest
     * @return A Java Future containing the result of the GetDetector operation returned by the service.
     * @sample AmazonGuardDutyAsync.GetDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetDetector" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDetectorResult> getDetectorAsync(GetDetectorRequest getDetectorRequest);

    /**
     * Retrieves an Amazon GuardDuty detector specified by the detectorId.
     * 
     * @param getDetectorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDetector operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.GetDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetDetector" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDetectorResult> getDetectorAsync(GetDetectorRequest getDetectorRequest,
            com.amazonaws.handlers.AsyncHandler<GetDetectorRequest, GetDetectorResult> asyncHandler);

    /**
     * Returns the details of the filter specified by the filter name.
     * 
     * @param getFilterRequest
     * @return A Java Future containing the result of the GetFilter operation returned by the service.
     * @sample AmazonGuardDutyAsync.GetFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetFilter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFilterResult> getFilterAsync(GetFilterRequest getFilterRequest);

    /**
     * Returns the details of the filter specified by the filter name.
     * 
     * @param getFilterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFilter operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.GetFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetFilter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFilterResult> getFilterAsync(GetFilterRequest getFilterRequest,
            com.amazonaws.handlers.AsyncHandler<GetFilterRequest, GetFilterResult> asyncHandler);

    /**
     * Describes Amazon GuardDuty findings specified by finding IDs.
     * 
     * @param getFindingsRequest
     *        GetFindings request body.
     * @return A Java Future containing the result of the GetFindings operation returned by the service.
     * @sample AmazonGuardDutyAsync.GetFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetFindings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFindingsResult> getFindingsAsync(GetFindingsRequest getFindingsRequest);

    /**
     * Describes Amazon GuardDuty findings specified by finding IDs.
     * 
     * @param getFindingsRequest
     *        GetFindings request body.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFindings operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.GetFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetFindings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFindingsResult> getFindingsAsync(GetFindingsRequest getFindingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetFindingsRequest, GetFindingsResult> asyncHandler);

    /**
     * Lists Amazon GuardDuty findings' statistics for the specified detector ID.
     * 
     * @param getFindingsStatisticsRequest
     *        GetFindingsStatistics request body.
     * @return A Java Future containing the result of the GetFindingsStatistics operation returned by the service.
     * @sample AmazonGuardDutyAsync.GetFindingsStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetFindingsStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFindingsStatisticsResult> getFindingsStatisticsAsync(GetFindingsStatisticsRequest getFindingsStatisticsRequest);

    /**
     * Lists Amazon GuardDuty findings' statistics for the specified detector ID.
     * 
     * @param getFindingsStatisticsRequest
     *        GetFindingsStatistics request body.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFindingsStatistics operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.GetFindingsStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetFindingsStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFindingsStatisticsResult> getFindingsStatisticsAsync(GetFindingsStatisticsRequest getFindingsStatisticsRequest,
            com.amazonaws.handlers.AsyncHandler<GetFindingsStatisticsRequest, GetFindingsStatisticsResult> asyncHandler);

    /**
     * Retrieves the IPSet specified by the IPSet ID.
     * 
     * @param getIPSetRequest
     * @return A Java Future containing the result of the GetIPSet operation returned by the service.
     * @sample AmazonGuardDutyAsync.GetIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetIPSetResult> getIPSetAsync(GetIPSetRequest getIPSetRequest);

    /**
     * Retrieves the IPSet specified by the IPSet ID.
     * 
     * @param getIPSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetIPSet operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.GetIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetIPSetResult> getIPSetAsync(GetIPSetRequest getIPSetRequest,
            com.amazonaws.handlers.AsyncHandler<GetIPSetRequest, GetIPSetResult> asyncHandler);

    /**
     * Returns the count of all GuardDuty membership invitations that were sent to the current member account except the
     * currently accepted invitation.
     * 
     * @param getInvitationsCountRequest
     * @return A Java Future containing the result of the GetInvitationsCount operation returned by the service.
     * @sample AmazonGuardDutyAsync.GetInvitationsCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetInvitationsCount" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetInvitationsCountResult> getInvitationsCountAsync(GetInvitationsCountRequest getInvitationsCountRequest);

    /**
     * Returns the count of all GuardDuty membership invitations that were sent to the current member account except the
     * currently accepted invitation.
     * 
     * @param getInvitationsCountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInvitationsCount operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.GetInvitationsCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetInvitationsCount" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetInvitationsCountResult> getInvitationsCountAsync(GetInvitationsCountRequest getInvitationsCountRequest,
            com.amazonaws.handlers.AsyncHandler<GetInvitationsCountRequest, GetInvitationsCountResult> asyncHandler);

    /**
     * Provides the details for the GuardDuty master account to the current GuardDuty member account.
     * 
     * @param getMasterAccountRequest
     * @return A Java Future containing the result of the GetMasterAccount operation returned by the service.
     * @sample AmazonGuardDutyAsync.GetMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetMasterAccount" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMasterAccountResult> getMasterAccountAsync(GetMasterAccountRequest getMasterAccountRequest);

    /**
     * Provides the details for the GuardDuty master account to the current GuardDuty member account.
     * 
     * @param getMasterAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMasterAccount operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.GetMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetMasterAccount" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMasterAccountResult> getMasterAccountAsync(GetMasterAccountRequest getMasterAccountRequest,
            com.amazonaws.handlers.AsyncHandler<GetMasterAccountRequest, GetMasterAccountResult> asyncHandler);

    /**
     * Retrieves GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.
     * 
     * @param getMembersRequest
     *        GetMembers request body.
     * @return A Java Future containing the result of the GetMembers operation returned by the service.
     * @sample AmazonGuardDutyAsync.GetMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMembersResult> getMembersAsync(GetMembersRequest getMembersRequest);

    /**
     * Retrieves GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.
     * 
     * @param getMembersRequest
     *        GetMembers request body.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMembers operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.GetMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMembersResult> getMembersAsync(GetMembersRequest getMembersRequest,
            com.amazonaws.handlers.AsyncHandler<GetMembersRequest, GetMembersResult> asyncHandler);

    /**
     * Retrieves the ThreatIntelSet that is specified by the ThreatIntelSet ID.
     * 
     * @param getThreatIntelSetRequest
     * @return A Java Future containing the result of the GetThreatIntelSet operation returned by the service.
     * @sample AmazonGuardDutyAsync.GetThreatIntelSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetThreatIntelSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetThreatIntelSetResult> getThreatIntelSetAsync(GetThreatIntelSetRequest getThreatIntelSetRequest);

    /**
     * Retrieves the ThreatIntelSet that is specified by the ThreatIntelSet ID.
     * 
     * @param getThreatIntelSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetThreatIntelSet operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.GetThreatIntelSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetThreatIntelSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetThreatIntelSetResult> getThreatIntelSetAsync(GetThreatIntelSetRequest getThreatIntelSetRequest,
            com.amazonaws.handlers.AsyncHandler<GetThreatIntelSetRequest, GetThreatIntelSetResult> asyncHandler);

    /**
     * Invites other AWS accounts (created as members of the current AWS account by CreateMembers) to enable GuardDuty
     * and allow the current AWS account to view and manage these accounts' GuardDuty findings on their behalf as the
     * master account.
     * 
     * @param inviteMembersRequest
     *        InviteMembers request body.
     * @return A Java Future containing the result of the InviteMembers operation returned by the service.
     * @sample AmazonGuardDutyAsync.InviteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/InviteMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<InviteMembersResult> inviteMembersAsync(InviteMembersRequest inviteMembersRequest);

    /**
     * Invites other AWS accounts (created as members of the current AWS account by CreateMembers) to enable GuardDuty
     * and allow the current AWS account to view and manage these accounts' GuardDuty findings on their behalf as the
     * master account.
     * 
     * @param inviteMembersRequest
     *        InviteMembers request body.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the InviteMembers operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.InviteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/InviteMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<InviteMembersResult> inviteMembersAsync(InviteMembersRequest inviteMembersRequest,
            com.amazonaws.handlers.AsyncHandler<InviteMembersRequest, InviteMembersResult> asyncHandler);

    /**
     * Lists detectorIds of all the existing Amazon GuardDuty detector resources.
     * 
     * @param listDetectorsRequest
     * @return A Java Future containing the result of the ListDetectors operation returned by the service.
     * @sample AmazonGuardDutyAsync.ListDetectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListDetectors" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDetectorsResult> listDetectorsAsync(ListDetectorsRequest listDetectorsRequest);

    /**
     * Lists detectorIds of all the existing Amazon GuardDuty detector resources.
     * 
     * @param listDetectorsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDetectors operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.ListDetectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListDetectors" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDetectorsResult> listDetectorsAsync(ListDetectorsRequest listDetectorsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDetectorsRequest, ListDetectorsResult> asyncHandler);

    /**
     * Returns a paginated list of the current filters.
     * 
     * @param listFiltersRequest
     * @return A Java Future containing the result of the ListFilters operation returned by the service.
     * @sample AmazonGuardDutyAsync.ListFilters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListFilters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFiltersResult> listFiltersAsync(ListFiltersRequest listFiltersRequest);

    /**
     * Returns a paginated list of the current filters.
     * 
     * @param listFiltersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFilters operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.ListFilters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListFilters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFiltersResult> listFiltersAsync(ListFiltersRequest listFiltersRequest,
            com.amazonaws.handlers.AsyncHandler<ListFiltersRequest, ListFiltersResult> asyncHandler);

    /**
     * Lists Amazon GuardDuty findings for the specified detector ID.
     * 
     * @param listFindingsRequest
     *        ListFindings request body.
     * @return A Java Future containing the result of the ListFindings operation returned by the service.
     * @sample AmazonGuardDutyAsync.ListFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListFindings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFindingsResult> listFindingsAsync(ListFindingsRequest listFindingsRequest);

    /**
     * Lists Amazon GuardDuty findings for the specified detector ID.
     * 
     * @param listFindingsRequest
     *        ListFindings request body.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFindings operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.ListFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListFindings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFindingsResult> listFindingsAsync(ListFindingsRequest listFindingsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFindingsRequest, ListFindingsResult> asyncHandler);

    /**
     * Lists the IPSets of the GuardDuty service specified by the detector ID.
     * 
     * @param listIPSetsRequest
     * @return A Java Future containing the result of the ListIPSets operation returned by the service.
     * @sample AmazonGuardDutyAsync.ListIPSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListIPSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListIPSetsResult> listIPSetsAsync(ListIPSetsRequest listIPSetsRequest);

    /**
     * Lists the IPSets of the GuardDuty service specified by the detector ID.
     * 
     * @param listIPSetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListIPSets operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.ListIPSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListIPSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListIPSetsResult> listIPSetsAsync(ListIPSetsRequest listIPSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListIPSetsRequest, ListIPSetsResult> asyncHandler);

    /**
     * Lists all GuardDuty membership invitations that were sent to the current AWS account.
     * 
     * @param listInvitationsRequest
     * @return A Java Future containing the result of the ListInvitations operation returned by the service.
     * @sample AmazonGuardDutyAsync.ListInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListInvitations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListInvitationsResult> listInvitationsAsync(ListInvitationsRequest listInvitationsRequest);

    /**
     * Lists all GuardDuty membership invitations that were sent to the current AWS account.
     * 
     * @param listInvitationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListInvitations operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.ListInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListInvitations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListInvitationsResult> listInvitationsAsync(ListInvitationsRequest listInvitationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListInvitationsRequest, ListInvitationsResult> asyncHandler);

    /**
     * Lists details about all member accounts for the current GuardDuty master account.
     * 
     * @param listMembersRequest
     * @return A Java Future containing the result of the ListMembers operation returned by the service.
     * @sample AmazonGuardDutyAsync.ListMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMembersResult> listMembersAsync(ListMembersRequest listMembersRequest);

    /**
     * Lists details about all member accounts for the current GuardDuty master account.
     * 
     * @param listMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMembers operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.ListMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMembersResult> listMembersAsync(ListMembersRequest listMembersRequest,
            com.amazonaws.handlers.AsyncHandler<ListMembersRequest, ListMembersResult> asyncHandler);

    /**
     * Lists the ThreatIntelSets of the GuardDuty service specified by the detector ID.
     * 
     * @param listThreatIntelSetsRequest
     * @return A Java Future containing the result of the ListThreatIntelSets operation returned by the service.
     * @sample AmazonGuardDutyAsync.ListThreatIntelSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListThreatIntelSets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListThreatIntelSetsResult> listThreatIntelSetsAsync(ListThreatIntelSetsRequest listThreatIntelSetsRequest);

    /**
     * Lists the ThreatIntelSets of the GuardDuty service specified by the detector ID.
     * 
     * @param listThreatIntelSetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListThreatIntelSets operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.ListThreatIntelSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListThreatIntelSets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListThreatIntelSetsResult> listThreatIntelSetsAsync(ListThreatIntelSetsRequest listThreatIntelSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListThreatIntelSetsRequest, ListThreatIntelSetsResult> asyncHandler);

    /**
     * Re-enables GuardDuty to monitor findings of the member accounts specified by the account IDs. A master GuardDuty
     * account can run this command after disabling GuardDuty from monitoring these members' findings by running
     * StopMonitoringMembers.
     * 
     * @param startMonitoringMembersRequest
     *        StartMonitoringMembers request body.
     * @return A Java Future containing the result of the StartMonitoringMembers operation returned by the service.
     * @sample AmazonGuardDutyAsync.StartMonitoringMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/StartMonitoringMembers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartMonitoringMembersResult> startMonitoringMembersAsync(StartMonitoringMembersRequest startMonitoringMembersRequest);

    /**
     * Re-enables GuardDuty to monitor findings of the member accounts specified by the account IDs. A master GuardDuty
     * account can run this command after disabling GuardDuty from monitoring these members' findings by running
     * StopMonitoringMembers.
     * 
     * @param startMonitoringMembersRequest
     *        StartMonitoringMembers request body.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartMonitoringMembers operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.StartMonitoringMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/StartMonitoringMembers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartMonitoringMembersResult> startMonitoringMembersAsync(StartMonitoringMembersRequest startMonitoringMembersRequest,
            com.amazonaws.handlers.AsyncHandler<StartMonitoringMembersRequest, StartMonitoringMembersResult> asyncHandler);

    /**
     * Disables GuardDuty from monitoring findings of the member accounts specified by the account IDs. After running
     * this command, a master GuardDuty account can run StartMonitoringMembers to re-enable GuardDuty to monitor these
     * members’ findings.
     * 
     * @param stopMonitoringMembersRequest
     *        StopMonitoringMembers request body.
     * @return A Java Future containing the result of the StopMonitoringMembers operation returned by the service.
     * @sample AmazonGuardDutyAsync.StopMonitoringMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/StopMonitoringMembers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopMonitoringMembersResult> stopMonitoringMembersAsync(StopMonitoringMembersRequest stopMonitoringMembersRequest);

    /**
     * Disables GuardDuty from monitoring findings of the member accounts specified by the account IDs. After running
     * this command, a master GuardDuty account can run StartMonitoringMembers to re-enable GuardDuty to monitor these
     * members’ findings.
     * 
     * @param stopMonitoringMembersRequest
     *        StopMonitoringMembers request body.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopMonitoringMembers operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.StopMonitoringMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/StopMonitoringMembers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopMonitoringMembersResult> stopMonitoringMembersAsync(StopMonitoringMembersRequest stopMonitoringMembersRequest,
            com.amazonaws.handlers.AsyncHandler<StopMonitoringMembersRequest, StopMonitoringMembersResult> asyncHandler);

    /**
     * Unarchives Amazon GuardDuty findings specified by the list of finding IDs.
     * 
     * @param unarchiveFindingsRequest
     *        UnarchiveFindings request body.
     * @return A Java Future containing the result of the UnarchiveFindings operation returned by the service.
     * @sample AmazonGuardDutyAsync.UnarchiveFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UnarchiveFindings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UnarchiveFindingsResult> unarchiveFindingsAsync(UnarchiveFindingsRequest unarchiveFindingsRequest);

    /**
     * Unarchives Amazon GuardDuty findings specified by the list of finding IDs.
     * 
     * @param unarchiveFindingsRequest
     *        UnarchiveFindings request body.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UnarchiveFindings operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.UnarchiveFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UnarchiveFindings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UnarchiveFindingsResult> unarchiveFindingsAsync(UnarchiveFindingsRequest unarchiveFindingsRequest,
            com.amazonaws.handlers.AsyncHandler<UnarchiveFindingsRequest, UnarchiveFindingsResult> asyncHandler);

    /**
     * Updates an Amazon GuardDuty detector specified by the detectorId.
     * 
     * @param updateDetectorRequest
     *        UpdateDetector request body.
     * @return A Java Future containing the result of the UpdateDetector operation returned by the service.
     * @sample AmazonGuardDutyAsync.UpdateDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateDetector" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDetectorResult> updateDetectorAsync(UpdateDetectorRequest updateDetectorRequest);

    /**
     * Updates an Amazon GuardDuty detector specified by the detectorId.
     * 
     * @param updateDetectorRequest
     *        UpdateDetector request body.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDetector operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.UpdateDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateDetector" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDetectorResult> updateDetectorAsync(UpdateDetectorRequest updateDetectorRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDetectorRequest, UpdateDetectorResult> asyncHandler);

    /**
     * Updates the filter specified by the filter name.
     * 
     * @param updateFilterRequest
     *        UpdateFilterRequest request body.
     * @return A Java Future containing the result of the UpdateFilter operation returned by the service.
     * @sample AmazonGuardDutyAsync.UpdateFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateFilter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFilterResult> updateFilterAsync(UpdateFilterRequest updateFilterRequest);

    /**
     * Updates the filter specified by the filter name.
     * 
     * @param updateFilterRequest
     *        UpdateFilterRequest request body.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFilter operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.UpdateFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateFilter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFilterResult> updateFilterAsync(UpdateFilterRequest updateFilterRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFilterRequest, UpdateFilterResult> asyncHandler);

    /**
     * Marks specified Amazon GuardDuty findings as useful or not useful.
     * 
     * @param updateFindingsFeedbackRequest
     *        UpdateFindingsFeedback request body.
     * @return A Java Future containing the result of the UpdateFindingsFeedback operation returned by the service.
     * @sample AmazonGuardDutyAsync.UpdateFindingsFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateFindingsFeedback"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFindingsFeedbackResult> updateFindingsFeedbackAsync(UpdateFindingsFeedbackRequest updateFindingsFeedbackRequest);

    /**
     * Marks specified Amazon GuardDuty findings as useful or not useful.
     * 
     * @param updateFindingsFeedbackRequest
     *        UpdateFindingsFeedback request body.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFindingsFeedback operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.UpdateFindingsFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateFindingsFeedback"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFindingsFeedbackResult> updateFindingsFeedbackAsync(UpdateFindingsFeedbackRequest updateFindingsFeedbackRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFindingsFeedbackRequest, UpdateFindingsFeedbackResult> asyncHandler);

    /**
     * Updates the IPSet specified by the IPSet ID.
     * 
     * @param updateIPSetRequest
     *        UpdateIPSet request body.
     * @return A Java Future containing the result of the UpdateIPSet operation returned by the service.
     * @sample AmazonGuardDutyAsync.UpdateIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateIPSetResult> updateIPSetAsync(UpdateIPSetRequest updateIPSetRequest);

    /**
     * Updates the IPSet specified by the IPSet ID.
     * 
     * @param updateIPSetRequest
     *        UpdateIPSet request body.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateIPSet operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.UpdateIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateIPSetResult> updateIPSetAsync(UpdateIPSetRequest updateIPSetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateIPSetRequest, UpdateIPSetResult> asyncHandler);

    /**
     * Updates the ThreatIntelSet specified by ThreatIntelSet ID.
     * 
     * @param updateThreatIntelSetRequest
     *        UpdateThreatIntelSet request body.
     * @return A Java Future containing the result of the UpdateThreatIntelSet operation returned by the service.
     * @sample AmazonGuardDutyAsync.UpdateThreatIntelSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateThreatIntelSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateThreatIntelSetResult> updateThreatIntelSetAsync(UpdateThreatIntelSetRequest updateThreatIntelSetRequest);

    /**
     * Updates the ThreatIntelSet specified by ThreatIntelSet ID.
     * 
     * @param updateThreatIntelSetRequest
     *        UpdateThreatIntelSet request body.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateThreatIntelSet operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.UpdateThreatIntelSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateThreatIntelSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateThreatIntelSetResult> updateThreatIntelSetAsync(UpdateThreatIntelSetRequest updateThreatIntelSetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateThreatIntelSetRequest, UpdateThreatIntelSetResult> asyncHandler);

}
