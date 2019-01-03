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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.guardduty.model.*;

/**
 * Interface for accessing Amazon GuardDuty.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.guardduty.AbstractAmazonGuardDuty} instead.
 * </p>
 * <p>
 * Assess, monitor, manage, and remediate security issues across your AWS infrastructure, applications, and data.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonGuardDuty {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "guardduty";

    /**
     * Accepts the invitation to be monitored by a master GuardDuty account.
     * 
     * @param acceptInvitationRequest
     *        AcceptInvitation request body.
     * @return Result of the AcceptInvitation operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @sample AmazonGuardDuty.AcceptInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/AcceptInvitation" target="_top">AWS API
     *      Documentation</a>
     */
    AcceptInvitationResult acceptInvitation(AcceptInvitationRequest acceptInvitationRequest);

    /**
     * Archives Amazon GuardDuty findings specified by the list of finding IDs.
     * 
     * @param archiveFindingsRequest
     *        ArchiveFindings request body.
     * @return Result of the ArchiveFindings operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @sample AmazonGuardDuty.ArchiveFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ArchiveFindings" target="_top">AWS API
     *      Documentation</a>
     */
    ArchiveFindingsResult archiveFindings(ArchiveFindingsRequest archiveFindingsRequest);

    /**
     * Creates a single Amazon GuardDuty detector. A detector is an object that represents the GuardDuty service. A
     * detector must be created in order for GuardDuty to become operational.
     * 
     * @param createDetectorRequest
     *        CreateDetector request body.
     * @return Result of the CreateDetector operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @sample AmazonGuardDuty.CreateDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateDetector" target="_top">AWS API
     *      Documentation</a>
     */
    CreateDetectorResult createDetector(CreateDetectorRequest createDetectorRequest);

    /**
     * Creates a filter using the specified finding criteria.
     * 
     * @param createFilterRequest
     *        CreateFilterRequest request body.
     * @return Result of the CreateFilter operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @sample AmazonGuardDuty.CreateFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateFilter" target="_top">AWS API
     *      Documentation</a>
     */
    CreateFilterResult createFilter(CreateFilterRequest createFilterRequest);

    /**
     * Creates a new IPSet - a list of trusted IP addresses that have been whitelisted for secure communication with AWS
     * infrastructure and applications.
     * 
     * @param createIPSetRequest
     *        CreateIPSet request body.
     * @return Result of the CreateIPSet operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @sample AmazonGuardDuty.CreateIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    CreateIPSetResult createIPSet(CreateIPSetRequest createIPSetRequest);

    /**
     * Creates member accounts of the current AWS account by specifying a list of AWS account IDs. The current AWS
     * account can then invite these members to manage GuardDuty in their accounts.
     * 
     * @param createMembersRequest
     *        CreateMembers request body.
     * @return Result of the CreateMembers operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @sample AmazonGuardDuty.CreateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateMembers" target="_top">AWS API
     *      Documentation</a>
     */
    CreateMembersResult createMembers(CreateMembersRequest createMembersRequest);

    /**
     * Generates example findings of types specified by the list of finding types. If 'NULL' is specified for
     * findingTypes, the API generates example findings of all supported finding types.
     * 
     * @param createSampleFindingsRequest
     *        CreateSampleFindings request body.
     * @return Result of the CreateSampleFindings operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @sample AmazonGuardDuty.CreateSampleFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateSampleFindings" target="_top">AWS
     *      API Documentation</a>
     */
    CreateSampleFindingsResult createSampleFindings(CreateSampleFindingsRequest createSampleFindingsRequest);

    /**
     * Create a new ThreatIntelSet. ThreatIntelSets consist of known malicious IP addresses. GuardDuty generates
     * findings based on ThreatIntelSets.
     * 
     * @param createThreatIntelSetRequest
     *        CreateThreatIntelSet request body.
     * @return Result of the CreateThreatIntelSet operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @sample AmazonGuardDuty.CreateThreatIntelSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateThreatIntelSet" target="_top">AWS
     *      API Documentation</a>
     */
    CreateThreatIntelSetResult createThreatIntelSet(CreateThreatIntelSetRequest createThreatIntelSetRequest);

    /**
     * Declines invitations sent to the current member account by AWS account specified by their account IDs.
     * 
     * @param declineInvitationsRequest
     *        DeclineInvitations request body.
     * @return Result of the DeclineInvitations operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @sample AmazonGuardDuty.DeclineInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeclineInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    DeclineInvitationsResult declineInvitations(DeclineInvitationsRequest declineInvitationsRequest);

    /**
     * Deletes a Amazon GuardDuty detector specified by the detector ID.
     * 
     * @param deleteDetectorRequest
     * @return Result of the DeleteDetector operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @sample AmazonGuardDuty.DeleteDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteDetector" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteDetectorResult deleteDetector(DeleteDetectorRequest deleteDetectorRequest);

    /**
     * Deletes the filter specified by the filter name.
     * 
     * @param deleteFilterRequest
     * @return Result of the DeleteFilter operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @sample AmazonGuardDuty.DeleteFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteFilter" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteFilterResult deleteFilter(DeleteFilterRequest deleteFilterRequest);

    /**
     * Deletes the IPSet specified by the IPSet ID.
     * 
     * @param deleteIPSetRequest
     * @return Result of the DeleteIPSet operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @sample AmazonGuardDuty.DeleteIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteIPSetResult deleteIPSet(DeleteIPSetRequest deleteIPSetRequest);

    /**
     * Deletes invitations sent to the current member account by AWS accounts specified by their account IDs.
     * 
     * @param deleteInvitationsRequest
     *        DeleteInvitations request body.
     * @return Result of the DeleteInvitations operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @sample AmazonGuardDuty.DeleteInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteInvitationsResult deleteInvitations(DeleteInvitationsRequest deleteInvitationsRequest);

    /**
     * Deletes GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.
     * 
     * @param deleteMembersRequest
     *        DeleteMembers request body.
     * @return Result of the DeleteMembers operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @sample AmazonGuardDuty.DeleteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteMembers" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteMembersResult deleteMembers(DeleteMembersRequest deleteMembersRequest);

    /**
     * Deletes ThreatIntelSet specified by the ThreatIntelSet ID.
     * 
     * @param deleteThreatIntelSetRequest
     * @return Result of the DeleteThreatIntelSet operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @sample AmazonGuardDuty.DeleteThreatIntelSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteThreatIntelSet" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteThreatIntelSetResult deleteThreatIntelSet(DeleteThreatIntelSetRequest deleteThreatIntelSetRequest);

    /**
     * Disassociates the current GuardDuty member account from its master account.
     * 
     * @param disassociateFromMasterAccountRequest
     * @return Result of the DisassociateFromMasterAccount operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @sample AmazonGuardDuty.DisassociateFromMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DisassociateFromMasterAccount"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateFromMasterAccountResult disassociateFromMasterAccount(DisassociateFromMasterAccountRequest disassociateFromMasterAccountRequest);

    /**
     * Disassociates GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.
     * 
     * @param disassociateMembersRequest
     *        DisassociateMembers request body.
     * @return Result of the DisassociateMembers operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @sample AmazonGuardDuty.DisassociateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DisassociateMembers" target="_top">AWS
     *      API Documentation</a>
     */
    DisassociateMembersResult disassociateMembers(DisassociateMembersRequest disassociateMembersRequest);

    /**
     * Retrieves an Amazon GuardDuty detector specified by the detectorId.
     * 
     * @param getDetectorRequest
     * @return Result of the GetDetector operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @sample AmazonGuardDuty.GetDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetDetector" target="_top">AWS API
     *      Documentation</a>
     */
    GetDetectorResult getDetector(GetDetectorRequest getDetectorRequest);

    /**
     * Returns the details of the filter specified by the filter name.
     * 
     * @param getFilterRequest
     * @return Result of the GetFilter operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @sample AmazonGuardDuty.GetFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetFilter" target="_top">AWS API
     *      Documentation</a>
     */
    GetFilterResult getFilter(GetFilterRequest getFilterRequest);

    /**
     * Describes Amazon GuardDuty findings specified by finding IDs.
     * 
     * @param getFindingsRequest
     *        GetFindings request body.
     * @return Result of the GetFindings operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @sample AmazonGuardDuty.GetFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetFindings" target="_top">AWS API
     *      Documentation</a>
     */
    GetFindingsResult getFindings(GetFindingsRequest getFindingsRequest);

    /**
     * Lists Amazon GuardDuty findings' statistics for the specified detector ID.
     * 
     * @param getFindingsStatisticsRequest
     *        GetFindingsStatistics request body.
     * @return Result of the GetFindingsStatistics operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @sample AmazonGuardDuty.GetFindingsStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetFindingsStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    GetFindingsStatisticsResult getFindingsStatistics(GetFindingsStatisticsRequest getFindingsStatisticsRequest);

    /**
     * Retrieves the IPSet specified by the IPSet ID.
     * 
     * @param getIPSetRequest
     * @return Result of the GetIPSet operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @sample AmazonGuardDuty.GetIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    GetIPSetResult getIPSet(GetIPSetRequest getIPSetRequest);

    /**
     * Returns the count of all GuardDuty membership invitations that were sent to the current member account except the
     * currently accepted invitation.
     * 
     * @param getInvitationsCountRequest
     * @return Result of the GetInvitationsCount operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @sample AmazonGuardDuty.GetInvitationsCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetInvitationsCount" target="_top">AWS
     *      API Documentation</a>
     */
    GetInvitationsCountResult getInvitationsCount(GetInvitationsCountRequest getInvitationsCountRequest);

    /**
     * Provides the details for the GuardDuty master account to the current GuardDuty member account.
     * 
     * @param getMasterAccountRequest
     * @return Result of the GetMasterAccount operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @sample AmazonGuardDuty.GetMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetMasterAccount" target="_top">AWS API
     *      Documentation</a>
     */
    GetMasterAccountResult getMasterAccount(GetMasterAccountRequest getMasterAccountRequest);

    /**
     * Retrieves GuardDuty member accounts (to the current GuardDuty master account) specified by the account IDs.
     * 
     * @param getMembersRequest
     *        GetMembers request body.
     * @return Result of the GetMembers operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @sample AmazonGuardDuty.GetMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetMembers" target="_top">AWS API
     *      Documentation</a>
     */
    GetMembersResult getMembers(GetMembersRequest getMembersRequest);

    /**
     * Retrieves the ThreatIntelSet that is specified by the ThreatIntelSet ID.
     * 
     * @param getThreatIntelSetRequest
     * @return Result of the GetThreatIntelSet operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @sample AmazonGuardDuty.GetThreatIntelSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetThreatIntelSet" target="_top">AWS
     *      API Documentation</a>
     */
    GetThreatIntelSetResult getThreatIntelSet(GetThreatIntelSetRequest getThreatIntelSetRequest);

    /**
     * Invites other AWS accounts (created as members of the current AWS account by CreateMembers) to enable GuardDuty
     * and allow the current AWS account to view and manage these accounts' GuardDuty findings on their behalf as the
     * master account.
     * 
     * @param inviteMembersRequest
     *        InviteMembers request body.
     * @return Result of the InviteMembers operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @sample AmazonGuardDuty.InviteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/InviteMembers" target="_top">AWS API
     *      Documentation</a>
     */
    InviteMembersResult inviteMembers(InviteMembersRequest inviteMembersRequest);

    /**
     * Lists detectorIds of all the existing Amazon GuardDuty detector resources.
     * 
     * @param listDetectorsRequest
     * @return Result of the ListDetectors operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @sample AmazonGuardDuty.ListDetectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListDetectors" target="_top">AWS API
     *      Documentation</a>
     */
    ListDetectorsResult listDetectors(ListDetectorsRequest listDetectorsRequest);

    /**
     * Returns a paginated list of the current filters.
     * 
     * @param listFiltersRequest
     * @return Result of the ListFilters operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @sample AmazonGuardDuty.ListFilters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListFilters" target="_top">AWS API
     *      Documentation</a>
     */
    ListFiltersResult listFilters(ListFiltersRequest listFiltersRequest);

    /**
     * Lists Amazon GuardDuty findings for the specified detector ID.
     * 
     * @param listFindingsRequest
     *        ListFindings request body.
     * @return Result of the ListFindings operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @sample AmazonGuardDuty.ListFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListFindings" target="_top">AWS API
     *      Documentation</a>
     */
    ListFindingsResult listFindings(ListFindingsRequest listFindingsRequest);

    /**
     * Lists the IPSets of the GuardDuty service specified by the detector ID.
     * 
     * @param listIPSetsRequest
     * @return Result of the ListIPSets operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @sample AmazonGuardDuty.ListIPSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListIPSets" target="_top">AWS API
     *      Documentation</a>
     */
    ListIPSetsResult listIPSets(ListIPSetsRequest listIPSetsRequest);

    /**
     * Lists all GuardDuty membership invitations that were sent to the current AWS account.
     * 
     * @param listInvitationsRequest
     * @return Result of the ListInvitations operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @sample AmazonGuardDuty.ListInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListInvitations" target="_top">AWS API
     *      Documentation</a>
     */
    ListInvitationsResult listInvitations(ListInvitationsRequest listInvitationsRequest);

    /**
     * Lists details about all member accounts for the current GuardDuty master account.
     * 
     * @param listMembersRequest
     * @return Result of the ListMembers operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @sample AmazonGuardDuty.ListMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListMembers" target="_top">AWS API
     *      Documentation</a>
     */
    ListMembersResult listMembers(ListMembersRequest listMembersRequest);

    /**
     * Lists the ThreatIntelSets of the GuardDuty service specified by the detector ID.
     * 
     * @param listThreatIntelSetsRequest
     * @return Result of the ListThreatIntelSets operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @sample AmazonGuardDuty.ListThreatIntelSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListThreatIntelSets" target="_top">AWS
     *      API Documentation</a>
     */
    ListThreatIntelSetsResult listThreatIntelSets(ListThreatIntelSetsRequest listThreatIntelSetsRequest);

    /**
     * Re-enables GuardDuty to monitor findings of the member accounts specified by the account IDs. A master GuardDuty
     * account can run this command after disabling GuardDuty from monitoring these members' findings by running
     * StopMonitoringMembers.
     * 
     * @param startMonitoringMembersRequest
     *        StartMonitoringMembers request body.
     * @return Result of the StartMonitoringMembers operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @sample AmazonGuardDuty.StartMonitoringMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/StartMonitoringMembers"
     *      target="_top">AWS API Documentation</a>
     */
    StartMonitoringMembersResult startMonitoringMembers(StartMonitoringMembersRequest startMonitoringMembersRequest);

    /**
     * Disables GuardDuty from monitoring findings of the member accounts specified by the account IDs. After running
     * this command, a master GuardDuty account can run StartMonitoringMembers to re-enable GuardDuty to monitor these
     * members’ findings.
     * 
     * @param stopMonitoringMembersRequest
     *        StopMonitoringMembers request body.
     * @return Result of the StopMonitoringMembers operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @sample AmazonGuardDuty.StopMonitoringMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/StopMonitoringMembers"
     *      target="_top">AWS API Documentation</a>
     */
    StopMonitoringMembersResult stopMonitoringMembers(StopMonitoringMembersRequest stopMonitoringMembersRequest);

    /**
     * Unarchives Amazon GuardDuty findings specified by the list of finding IDs.
     * 
     * @param unarchiveFindingsRequest
     *        UnarchiveFindings request body.
     * @return Result of the UnarchiveFindings operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @sample AmazonGuardDuty.UnarchiveFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UnarchiveFindings" target="_top">AWS
     *      API Documentation</a>
     */
    UnarchiveFindingsResult unarchiveFindings(UnarchiveFindingsRequest unarchiveFindingsRequest);

    /**
     * Updates an Amazon GuardDuty detector specified by the detectorId.
     * 
     * @param updateDetectorRequest
     *        UpdateDetector request body.
     * @return Result of the UpdateDetector operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @sample AmazonGuardDuty.UpdateDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateDetector" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateDetectorResult updateDetector(UpdateDetectorRequest updateDetectorRequest);

    /**
     * Updates the filter specified by the filter name.
     * 
     * @param updateFilterRequest
     *        UpdateFilterRequest request body.
     * @return Result of the UpdateFilter operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @sample AmazonGuardDuty.UpdateFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateFilter" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateFilterResult updateFilter(UpdateFilterRequest updateFilterRequest);

    /**
     * Marks specified Amazon GuardDuty findings as useful or not useful.
     * 
     * @param updateFindingsFeedbackRequest
     *        UpdateFindingsFeedback request body.
     * @return Result of the UpdateFindingsFeedback operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @sample AmazonGuardDuty.UpdateFindingsFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateFindingsFeedback"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateFindingsFeedbackResult updateFindingsFeedback(UpdateFindingsFeedbackRequest updateFindingsFeedbackRequest);

    /**
     * Updates the IPSet specified by the IPSet ID.
     * 
     * @param updateIPSetRequest
     *        UpdateIPSet request body.
     * @return Result of the UpdateIPSet operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @sample AmazonGuardDuty.UpdateIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateIPSetResult updateIPSet(UpdateIPSetRequest updateIPSetRequest);

    /**
     * Updates the ThreatIntelSet specified by ThreatIntelSet ID.
     * 
     * @param updateThreatIntelSetRequest
     *        UpdateThreatIntelSet request body.
     * @return Result of the UpdateThreatIntelSet operation returned by the service.
     * @throws BadRequestException
     *         400 response
     * @throws InternalServerErrorException
     *         500 response
     * @sample AmazonGuardDuty.UpdateThreatIntelSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateThreatIntelSet" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateThreatIntelSetResult updateThreatIntelSet(UpdateThreatIntelSetRequest updateThreatIntelSetRequest);

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
