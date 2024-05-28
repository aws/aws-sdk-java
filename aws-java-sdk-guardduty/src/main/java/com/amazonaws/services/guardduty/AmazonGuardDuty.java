/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * Amazon GuardDuty is a continuous security monitoring service that analyzes and processes the following foundational
 * data sources - VPC flow logs, Amazon Web Services CloudTrail management event logs, CloudTrail S3 data event logs,
 * EKS audit logs, DNS logs, Amazon EBS volume data, runtime activity belonging to container workloads, such as Amazon
 * EKS, Amazon ECS (including Amazon Web Services Fargate), and Amazon EC2 instances. It uses threat intelligence feeds,
 * such as lists of malicious IPs and domains, and machine learning to identify unexpected, potentially unauthorized,
 * and malicious activity within your Amazon Web Services environment. This can include issues like escalations of
 * privileges, uses of exposed credentials, or communication with malicious IPs, domains, or presence of malware on your
 * Amazon EC2 instances and container workloads. For example, GuardDuty can detect compromised EC2 instances and
 * container workloads serving malware, or mining bitcoin.
 * </p>
 * <p>
 * GuardDuty also monitors Amazon Web Services account access behavior for signs of compromise, such as unauthorized
 * infrastructure deployments like EC2 instances deployed in a Region that has never been used, or unusual API calls
 * like a password policy change to reduce password strength.
 * </p>
 * <p>
 * GuardDuty informs you about the status of your Amazon Web Services environment by producing security findings that
 * you can view in the GuardDuty console or through Amazon EventBridge. For more information, see the <i> <a
 * href="https://docs.aws.amazon.com/guardduty/latest/ug/what-is-guardduty.html">Amazon GuardDuty User Guide</a> </i>.
 * </p>
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
     * <p>
     * Accepts the invitation to be a member account and get monitored by a GuardDuty administrator account that sent
     * the invitation.
     * </p>
     * 
     * @param acceptAdministratorInvitationRequest
     * @return Result of the AcceptAdministratorInvitation operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.AcceptAdministratorInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/AcceptAdministratorInvitation"
     *      target="_top">AWS API Documentation</a>
     */
    AcceptAdministratorInvitationResult acceptAdministratorInvitation(AcceptAdministratorInvitationRequest acceptAdministratorInvitationRequest);

    /**
     * <p>
     * Accepts the invitation to be monitored by a GuardDuty administrator account.
     * </p>
     * 
     * @param acceptInvitationRequest
     * @return Result of the AcceptInvitation operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.AcceptInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/AcceptInvitation" target="_top">AWS API
     *      Documentation</a>
     */
    @Deprecated
    AcceptInvitationResult acceptInvitation(AcceptInvitationRequest acceptInvitationRequest);

    /**
     * <p>
     * Archives GuardDuty findings that are specified by the list of finding IDs.
     * </p>
     * <note>
     * <p>
     * Only the administrator account can archive findings. Member accounts don't have permission to archive findings
     * from their accounts.
     * </p>
     * </note>
     * 
     * @param archiveFindingsRequest
     * @return Result of the ArchiveFindings operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.ArchiveFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ArchiveFindings" target="_top">AWS API
     *      Documentation</a>
     */
    ArchiveFindingsResult archiveFindings(ArchiveFindingsRequest archiveFindingsRequest);

    /**
     * <p>
     * Creates a single GuardDuty detector. A detector is a resource that represents the GuardDuty service. To start
     * using GuardDuty, you must create a detector in each Region where you enable the service. You can have only one
     * detector per account per Region. All data sources are enabled in a new detector by default.
     * </p>
     * <ul>
     * <li>
     * <p>
     * When you don't specify any <code>features</code>, with an exception to <code>RUNTIME_MONITORING</code>, all the
     * optional features are enabled by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * When you specify some of the <code>features</code>, any feature that is not specified in the API call gets
     * enabled by default, with an exception to <code>RUNTIME_MONITORING</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Specifying both EKS Runtime Monitoring (<code>EKS_RUNTIME_MONITORING</code>) and Runtime Monitoring (
     * <code>RUNTIME_MONITORING</code>) will cause an error. You can add only one of these two features because Runtime
     * Monitoring already includes the threat detection for Amazon EKS resources. For more information, see <a
     * href="https://docs.aws.amazon.com/guardduty/latest/ug/runtime-monitoring.html">Runtime Monitoring</a>.
     * </p>
     * <p>
     * There might be regional differences because some data sources might not be available in all the Amazon Web
     * Services Regions where GuardDuty is presently supported. For more information, see <a
     * href="https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_regions.html">Regions and endpoints</a>.
     * </p>
     * 
     * @param createDetectorRequest
     * @return Result of the CreateDetector operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.CreateDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateDetector" target="_top">AWS API
     *      Documentation</a>
     */
    CreateDetectorResult createDetector(CreateDetectorRequest createDetectorRequest);

    /**
     * <p>
     * Creates a filter using the specified finding criteria. The maximum number of saved filters per Amazon Web
     * Services account per Region is 100. For more information, see <a
     * href="https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_limits.html">Quotas for GuardDuty</a>.
     * </p>
     * 
     * @param createFilterRequest
     * @return Result of the CreateFilter operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.CreateFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateFilter" target="_top">AWS API
     *      Documentation</a>
     */
    CreateFilterResult createFilter(CreateFilterRequest createFilterRequest);

    /**
     * <p>
     * Creates a new IPSet, which is called a trusted IP list in the console user interface. An IPSet is a list of IP
     * addresses that are trusted for secure communication with Amazon Web Services infrastructure and applications.
     * GuardDuty doesn't generate findings for IP addresses that are included in IPSets. Only users from the
     * administrator account can use this operation.
     * </p>
     * 
     * @param createIPSetRequest
     * @return Result of the CreateIPSet operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.CreateIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    CreateIPSetResult createIPSet(CreateIPSetRequest createIPSetRequest);

    /**
     * <p>
     * Creates member accounts of the current Amazon Web Services account by specifying a list of Amazon Web Services
     * account IDs. This step is a prerequisite for managing the associated member accounts either by invitation or
     * through an organization.
     * </p>
     * <p>
     * As a delegated administrator, using <code>CreateMembers</code> will enable GuardDuty in the added member
     * accounts, with the exception of the organization delegated administrator account. A delegated administrator must
     * enable GuardDuty prior to being added as a member.
     * </p>
     * <p>
     * When you use CreateMembers as an Organizations delegated administrator, GuardDuty applies your organization's
     * auto-enable settings to the member accounts in this request, irrespective of the accounts being new or existing
     * members. For more information about the existing auto-enable settings for your organization, see <a
     * href="https://docs.aws.amazon.com/guardduty/latest/APIReference/API_DescribeOrganizationConfiguration.html"
     * >DescribeOrganizationConfiguration</a>.
     * </p>
     * <p>
     * If you disassociate a member account that was added by invitation, the member account details obtained from this
     * API, including the associated email addresses, will be retained. This is done so that the delegated administrator
     * can invoke the <a
     * href="https://docs.aws.amazon.com/guardduty/latest/APIReference/API_InviteMembers.html">InviteMembers</a> API
     * without the need to invoke the CreateMembers API again. To remove the details associated with a member account,
     * the delegated administrator must invoke the <a
     * href="https://docs.aws.amazon.com/guardduty/latest/APIReference/API_DeleteMembers.html">DeleteMembers</a> API.
     * </p>
     * <p>
     * When the member accounts added through Organizations are later disassociated, you (administrator) can't invite
     * them by calling the InviteMembers API. You can create an association with these member accounts again only by
     * calling the CreateMembers API.
     * </p>
     * 
     * @param createMembersRequest
     * @return Result of the CreateMembers operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.CreateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateMembers" target="_top">AWS API
     *      Documentation</a>
     */
    CreateMembersResult createMembers(CreateMembersRequest createMembersRequest);

    /**
     * <p>
     * Creates a publishing destination to export findings to. The resource to export findings to must exist before you
     * use this operation.
     * </p>
     * 
     * @param createPublishingDestinationRequest
     * @return Result of the CreatePublishingDestination operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.CreatePublishingDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreatePublishingDestination"
     *      target="_top">AWS API Documentation</a>
     */
    CreatePublishingDestinationResult createPublishingDestination(CreatePublishingDestinationRequest createPublishingDestinationRequest);

    /**
     * <p>
     * Generates sample findings of types specified by the list of finding types. If 'NULL' is specified for
     * <code>findingTypes</code>, the API generates sample findings of all supported finding types.
     * </p>
     * 
     * @param createSampleFindingsRequest
     * @return Result of the CreateSampleFindings operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.CreateSampleFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateSampleFindings" target="_top">AWS
     *      API Documentation</a>
     */
    CreateSampleFindingsResult createSampleFindings(CreateSampleFindingsRequest createSampleFindingsRequest);

    /**
     * <p>
     * Creates a new ThreatIntelSet. ThreatIntelSets consist of known malicious IP addresses. GuardDuty generates
     * findings based on ThreatIntelSets. Only users of the administrator account can use this operation.
     * </p>
     * 
     * @param createThreatIntelSetRequest
     * @return Result of the CreateThreatIntelSet operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.CreateThreatIntelSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateThreatIntelSet" target="_top">AWS
     *      API Documentation</a>
     */
    CreateThreatIntelSetResult createThreatIntelSet(CreateThreatIntelSetRequest createThreatIntelSetRequest);

    /**
     * <p>
     * Declines invitations sent to the current member account by Amazon Web Services accounts specified by their
     * account IDs.
     * </p>
     * 
     * @param declineInvitationsRequest
     * @return Result of the DeclineInvitations operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.DeclineInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeclineInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    DeclineInvitationsResult declineInvitations(DeclineInvitationsRequest declineInvitationsRequest);

    /**
     * <p>
     * Deletes an Amazon GuardDuty detector that is specified by the detector ID.
     * </p>
     * 
     * @param deleteDetectorRequest
     * @return Result of the DeleteDetector operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.DeleteDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteDetector" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteDetectorResult deleteDetector(DeleteDetectorRequest deleteDetectorRequest);

    /**
     * <p>
     * Deletes the filter specified by the filter name.
     * </p>
     * 
     * @param deleteFilterRequest
     * @return Result of the DeleteFilter operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.DeleteFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteFilter" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteFilterResult deleteFilter(DeleteFilterRequest deleteFilterRequest);

    /**
     * <p>
     * Deletes the IPSet specified by the <code>ipSetId</code>. IPSets are called trusted IP lists in the console user
     * interface.
     * </p>
     * 
     * @param deleteIPSetRequest
     * @return Result of the DeleteIPSet operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.DeleteIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteIPSetResult deleteIPSet(DeleteIPSetRequest deleteIPSetRequest);

    /**
     * <p>
     * Deletes invitations sent to the current member account by Amazon Web Services accounts specified by their account
     * IDs.
     * </p>
     * 
     * @param deleteInvitationsRequest
     * @return Result of the DeleteInvitations operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.DeleteInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteInvitationsResult deleteInvitations(DeleteInvitationsRequest deleteInvitationsRequest);

    /**
     * <p>
     * Deletes GuardDuty member accounts (to the current GuardDuty administrator account) specified by the account IDs.
     * </p>
     * <p>
     * With <code>autoEnableOrganizationMembers</code> configuration for your organization set to <code>ALL</code>,
     * you'll receive an error if you attempt to disable GuardDuty for a member account in your organization.
     * </p>
     * 
     * @param deleteMembersRequest
     * @return Result of the DeleteMembers operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.DeleteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteMembers" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteMembersResult deleteMembers(DeleteMembersRequest deleteMembersRequest);

    /**
     * <p>
     * Deletes the publishing definition with the specified <code>destinationId</code>.
     * </p>
     * 
     * @param deletePublishingDestinationRequest
     * @return Result of the DeletePublishingDestination operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.DeletePublishingDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeletePublishingDestination"
     *      target="_top">AWS API Documentation</a>
     */
    DeletePublishingDestinationResult deletePublishingDestination(DeletePublishingDestinationRequest deletePublishingDestinationRequest);

    /**
     * <p>
     * Deletes the ThreatIntelSet specified by the ThreatIntelSet ID.
     * </p>
     * 
     * @param deleteThreatIntelSetRequest
     * @return Result of the DeleteThreatIntelSet operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.DeleteThreatIntelSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteThreatIntelSet" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteThreatIntelSetResult deleteThreatIntelSet(DeleteThreatIntelSetRequest deleteThreatIntelSetRequest);

    /**
     * <p>
     * Returns a list of malware scans. Each member account can view the malware scans for their own accounts. An
     * administrator can view the malware scans for all the member accounts.
     * </p>
     * <p>
     * There might be regional differences because some data sources might not be available in all the Amazon Web
     * Services Regions where GuardDuty is presently supported. For more information, see <a
     * href="https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_regions.html">Regions and endpoints</a>.
     * </p>
     * 
     * @param describeMalwareScansRequest
     * @return Result of the DescribeMalwareScans operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.DescribeMalwareScans
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DescribeMalwareScans" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeMalwareScansResult describeMalwareScans(DescribeMalwareScansRequest describeMalwareScansRequest);

    /**
     * <p>
     * Returns information about the account selected as the delegated administrator for GuardDuty.
     * </p>
     * <p>
     * There might be regional differences because some data sources might not be available in all the Amazon Web
     * Services Regions where GuardDuty is presently supported. For more information, see <a
     * href="https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_regions.html">Regions and endpoints</a>.
     * </p>
     * 
     * @param describeOrganizationConfigurationRequest
     * @return Result of the DescribeOrganizationConfiguration operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.DescribeOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DescribeOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeOrganizationConfigurationResult describeOrganizationConfiguration(DescribeOrganizationConfigurationRequest describeOrganizationConfigurationRequest);

    /**
     * <p>
     * Returns information about the publishing destination specified by the provided <code>destinationId</code>.
     * </p>
     * 
     * @param describePublishingDestinationRequest
     * @return Result of the DescribePublishingDestination operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.DescribePublishingDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DescribePublishingDestination"
     *      target="_top">AWS API Documentation</a>
     */
    DescribePublishingDestinationResult describePublishingDestination(DescribePublishingDestinationRequest describePublishingDestinationRequest);

    /**
     * <p>
     * Removes the existing GuardDuty delegated administrator of the organization. Only the organization's management
     * account can run this API operation.
     * </p>
     * 
     * @param disableOrganizationAdminAccountRequest
     * @return Result of the DisableOrganizationAdminAccount operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.DisableOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DisableOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    DisableOrganizationAdminAccountResult disableOrganizationAdminAccount(DisableOrganizationAdminAccountRequest disableOrganizationAdminAccountRequest);

    /**
     * <p>
     * Disassociates the current GuardDuty member account from its administrator account.
     * </p>
     * <p>
     * When you disassociate an invited member from a GuardDuty delegated administrator, the member account details
     * obtained from the <a
     * href="https://docs.aws.amazon.com/guardduty/latest/APIReference/API_CreateMembers.html">CreateMembers</a> API,
     * including the associated email addresses, are retained. This is done so that the delegated administrator can
     * invoke the <a
     * href="https://docs.aws.amazon.com/guardduty/latest/APIReference/API_InviteMembers.html">InviteMembers</a> API
     * without the need to invoke the CreateMembers API again. To remove the details associated with a member account,
     * the delegated administrator must invoke the <a
     * href="https://docs.aws.amazon.com/guardduty/latest/APIReference/API_DeleteMembers.html">DeleteMembers</a> API.
     * </p>
     * <p>
     * With <code>autoEnableOrganizationMembers</code> configuration for your organization set to <code>ALL</code>,
     * you'll receive an error if you attempt to disable GuardDuty in a member account.
     * </p>
     * 
     * @param disassociateFromAdministratorAccountRequest
     * @return Result of the DisassociateFromAdministratorAccount operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.DisassociateFromAdministratorAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DisassociateFromAdministratorAccount"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateFromAdministratorAccountResult disassociateFromAdministratorAccount(
            DisassociateFromAdministratorAccountRequest disassociateFromAdministratorAccountRequest);

    /**
     * <p>
     * Disassociates the current GuardDuty member account from its administrator account.
     * </p>
     * <p>
     * When you disassociate an invited member from a GuardDuty delegated administrator, the member account details
     * obtained from the <a
     * href="https://docs.aws.amazon.com/guardduty/latest/APIReference/API_CreateMembers.html">CreateMembers</a> API,
     * including the associated email addresses, are retained. This is done so that the delegated administrator can
     * invoke the <a
     * href="https://docs.aws.amazon.com/guardduty/latest/APIReference/API_InviteMembers.html">InviteMembers</a> API
     * without the need to invoke the CreateMembers API again. To remove the details associated with a member account,
     * the delegated administrator must invoke the <a
     * href="https://docs.aws.amazon.com/guardduty/latest/APIReference/API_DeleteMembers.html">DeleteMembers</a> API.
     * </p>
     * 
     * @param disassociateFromMasterAccountRequest
     * @return Result of the DisassociateFromMasterAccount operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.DisassociateFromMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DisassociateFromMasterAccount"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    DisassociateFromMasterAccountResult disassociateFromMasterAccount(DisassociateFromMasterAccountRequest disassociateFromMasterAccountRequest);

    /**
     * <p>
     * Disassociates GuardDuty member accounts (from the current administrator account) specified by the account IDs.
     * </p>
     * <p>
     * When you disassociate an invited member from a GuardDuty delegated administrator, the member account details
     * obtained from the <a
     * href="https://docs.aws.amazon.com/guardduty/latest/APIReference/API_CreateMembers.html">CreateMembers</a> API,
     * including the associated email addresses, are retained. This is done so that the delegated administrator can
     * invoke the <a
     * href="https://docs.aws.amazon.com/guardduty/latest/APIReference/API_InviteMembers.html">InviteMembers</a> API
     * without the need to invoke the CreateMembers API again. To remove the details associated with a member account,
     * the delegated administrator must invoke the <a
     * href="https://docs.aws.amazon.com/guardduty/latest/APIReference/API_DeleteMembers.html">DeleteMembers</a> API.
     * </p>
     * <p>
     * With <code>autoEnableOrganizationMembers</code> configuration for your organization set to <code>ALL</code>,
     * you'll receive an error if you attempt to disassociate a member account before removing them from your
     * organization.
     * </p>
     * <p>
     * If you disassociate a member account that was added by invitation, the member account details obtained from this
     * API, including the associated email addresses, will be retained. This is done so that the delegated administrator
     * can invoke the <a
     * href="https://docs.aws.amazon.com/guardduty/latest/APIReference/API_InviteMembers.html">InviteMembers</a> API
     * without the need to invoke the CreateMembers API again. To remove the details associated with a member account,
     * the delegated administrator must invoke the <a
     * href="https://docs.aws.amazon.com/guardduty/latest/APIReference/API_DeleteMembers.html">DeleteMembers</a> API.
     * </p>
     * <p>
     * When the member accounts added through Organizations are later disassociated, you (administrator) can't invite
     * them by calling the InviteMembers API. You can create an association with these member accounts again only by
     * calling the CreateMembers API.
     * </p>
     * 
     * @param disassociateMembersRequest
     * @return Result of the DisassociateMembers operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.DisassociateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DisassociateMembers" target="_top">AWS
     *      API Documentation</a>
     */
    DisassociateMembersResult disassociateMembers(DisassociateMembersRequest disassociateMembersRequest);

    /**
     * <p>
     * Designates an Amazon Web Services account within the organization as your GuardDuty delegated administrator. Only
     * the organization's management account can run this API operation.
     * </p>
     * 
     * @param enableOrganizationAdminAccountRequest
     * @return Result of the EnableOrganizationAdminAccount operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.EnableOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/EnableOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    EnableOrganizationAdminAccountResult enableOrganizationAdminAccount(EnableOrganizationAdminAccountRequest enableOrganizationAdminAccountRequest);

    /**
     * <p>
     * Provides the details of the GuardDuty administrator account associated with the current GuardDuty member account.
     * </p>
     * <note>
     * <p>
     * If the organization's management account or a delegated administrator runs this API, it will return success (
     * <code>HTTP 200</code>) but no content.
     * </p>
     * </note>
     * 
     * @param getAdministratorAccountRequest
     * @return Result of the GetAdministratorAccount operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.GetAdministratorAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetAdministratorAccount"
     *      target="_top">AWS API Documentation</a>
     */
    GetAdministratorAccountResult getAdministratorAccount(GetAdministratorAccountRequest getAdministratorAccountRequest);

    /**
     * <p>
     * Retrieves aggregated statistics for your account. If you are a GuardDuty administrator, you can retrieve the
     * statistics for all the resources associated with the active member accounts in your organization who have enabled
     * Runtime Monitoring and have the GuardDuty security agent running on their resources.
     * </p>
     * 
     * @param getCoverageStatisticsRequest
     * @return Result of the GetCoverageStatistics operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.GetCoverageStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetCoverageStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    GetCoverageStatisticsResult getCoverageStatistics(GetCoverageStatisticsRequest getCoverageStatisticsRequest);

    /**
     * <p>
     * Retrieves an Amazon GuardDuty detector specified by the detectorId.
     * </p>
     * <p>
     * There might be regional differences because some data sources might not be available in all the Amazon Web
     * Services Regions where GuardDuty is presently supported. For more information, see <a
     * href="https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_regions.html">Regions and endpoints</a>.
     * </p>
     * 
     * @param getDetectorRequest
     * @return Result of the GetDetector operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.GetDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetDetector" target="_top">AWS API
     *      Documentation</a>
     */
    GetDetectorResult getDetector(GetDetectorRequest getDetectorRequest);

    /**
     * <p>
     * Returns the details of the filter specified by the filter name.
     * </p>
     * 
     * @param getFilterRequest
     * @return Result of the GetFilter operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.GetFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetFilter" target="_top">AWS API
     *      Documentation</a>
     */
    GetFilterResult getFilter(GetFilterRequest getFilterRequest);

    /**
     * <p>
     * Describes Amazon GuardDuty findings specified by finding IDs.
     * </p>
     * 
     * @param getFindingsRequest
     * @return Result of the GetFindings operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.GetFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetFindings" target="_top">AWS API
     *      Documentation</a>
     */
    GetFindingsResult getFindings(GetFindingsRequest getFindingsRequest);

    /**
     * <p>
     * Lists Amazon GuardDuty findings statistics for the specified detector ID.
     * </p>
     * <p>
     * There might be regional differences because some flags might not be available in all the Regions where GuardDuty
     * is currently supported. For more information, see <a
     * href="https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_regions.html">Regions and endpoints</a>.
     * </p>
     * 
     * @param getFindingsStatisticsRequest
     * @return Result of the GetFindingsStatistics operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.GetFindingsStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetFindingsStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    GetFindingsStatisticsResult getFindingsStatistics(GetFindingsStatisticsRequest getFindingsStatisticsRequest);

    /**
     * <p>
     * Retrieves the IPSet specified by the <code>ipSetId</code>.
     * </p>
     * 
     * @param getIPSetRequest
     * @return Result of the GetIPSet operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.GetIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    GetIPSetResult getIPSet(GetIPSetRequest getIPSetRequest);

    /**
     * <p>
     * Returns the count of all GuardDuty membership invitations that were sent to the current member account except the
     * currently accepted invitation.
     * </p>
     * 
     * @param getInvitationsCountRequest
     * @return Result of the GetInvitationsCount operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.GetInvitationsCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetInvitationsCount" target="_top">AWS
     *      API Documentation</a>
     */
    GetInvitationsCountResult getInvitationsCount(GetInvitationsCountRequest getInvitationsCountRequest);

    /**
     * <p>
     * Returns the details of the malware scan settings.
     * </p>
     * <p>
     * There might be regional differences because some data sources might not be available in all the Amazon Web
     * Services Regions where GuardDuty is presently supported. For more information, see <a
     * href="https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_regions.html">Regions and endpoints</a>.
     * </p>
     * 
     * @param getMalwareScanSettingsRequest
     * @return Result of the GetMalwareScanSettings operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.GetMalwareScanSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetMalwareScanSettings"
     *      target="_top">AWS API Documentation</a>
     */
    GetMalwareScanSettingsResult getMalwareScanSettings(GetMalwareScanSettingsRequest getMalwareScanSettingsRequest);

    /**
     * <p>
     * Provides the details for the GuardDuty administrator account associated with the current GuardDuty member
     * account.
     * </p>
     * 
     * @param getMasterAccountRequest
     * @return Result of the GetMasterAccount operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.GetMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetMasterAccount" target="_top">AWS API
     *      Documentation</a>
     */
    @Deprecated
    GetMasterAccountResult getMasterAccount(GetMasterAccountRequest getMasterAccountRequest);

    /**
     * <p>
     * Describes which data sources are enabled for the member account's detector.
     * </p>
     * <p>
     * There might be regional differences because some data sources might not be available in all the Amazon Web
     * Services Regions where GuardDuty is presently supported. For more information, see <a
     * href="https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_regions.html">Regions and endpoints</a>.
     * </p>
     * 
     * @param getMemberDetectorsRequest
     * @return Result of the GetMemberDetectors operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.GetMemberDetectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetMemberDetectors" target="_top">AWS
     *      API Documentation</a>
     */
    GetMemberDetectorsResult getMemberDetectors(GetMemberDetectorsRequest getMemberDetectorsRequest);

    /**
     * <p>
     * Retrieves GuardDuty member accounts (of the current GuardDuty administrator account) specified by the account
     * IDs.
     * </p>
     * 
     * @param getMembersRequest
     * @return Result of the GetMembers operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.GetMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetMembers" target="_top">AWS API
     *      Documentation</a>
     */
    GetMembersResult getMembers(GetMembersRequest getMembersRequest);

    /**
     * <p>
     * Retrieves how many active member accounts have each feature enabled within GuardDuty. Only a delegated GuardDuty
     * administrator of an organization can run this API.
     * </p>
     * <p>
     * When you create a new organization, it might take up to 24 hours to generate the statistics for the entire
     * organization.
     * </p>
     * 
     * @param getOrganizationStatisticsRequest
     * @return Result of the GetOrganizationStatistics operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.GetOrganizationStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetOrganizationStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    GetOrganizationStatisticsResult getOrganizationStatistics(GetOrganizationStatisticsRequest getOrganizationStatisticsRequest);

    /**
     * <p>
     * Provides the number of days left for each data source used in the free trial period.
     * </p>
     * 
     * @param getRemainingFreeTrialDaysRequest
     * @return Result of the GetRemainingFreeTrialDays operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.GetRemainingFreeTrialDays
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetRemainingFreeTrialDays"
     *      target="_top">AWS API Documentation</a>
     */
    GetRemainingFreeTrialDaysResult getRemainingFreeTrialDays(GetRemainingFreeTrialDaysRequest getRemainingFreeTrialDaysRequest);

    /**
     * <p>
     * Retrieves the ThreatIntelSet that is specified by the ThreatIntelSet ID.
     * </p>
     * 
     * @param getThreatIntelSetRequest
     * @return Result of the GetThreatIntelSet operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.GetThreatIntelSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetThreatIntelSet" target="_top">AWS
     *      API Documentation</a>
     */
    GetThreatIntelSetResult getThreatIntelSet(GetThreatIntelSetRequest getThreatIntelSetRequest);

    /**
     * <p>
     * Lists Amazon GuardDuty usage statistics over the last 30 days for the specified detector ID. For newly enabled
     * detectors or data sources, the cost returned will include only the usage so far under 30 days. This may differ
     * from the cost metrics in the console, which project usage over 30 days to provide a monthly cost estimate. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/guardduty/latest/ug/monitoring_costs.html#usage-calculations">Understanding How
     * Usage Costs are Calculated</a>.
     * </p>
     * 
     * @param getUsageStatisticsRequest
     * @return Result of the GetUsageStatistics operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.GetUsageStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetUsageStatistics" target="_top">AWS
     *      API Documentation</a>
     */
    GetUsageStatisticsResult getUsageStatistics(GetUsageStatisticsRequest getUsageStatisticsRequest);

    /**
     * <p>
     * Invites Amazon Web Services accounts to become members of an organization administered by the Amazon Web Services
     * account that invokes this API. If you are using Amazon Web Services Organizations to manage your GuardDuty
     * environment, this step is not needed. For more information, see <a
     * href="https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_organizations.html">Managing accounts with
     * organizations</a>.
     * </p>
     * <p>
     * To invite Amazon Web Services accounts, the first step is to ensure that GuardDuty has been enabled in the
     * potential member accounts. You can now invoke this API to add accounts by invitation. The invited accounts can
     * either accept or decline the invitation from their GuardDuty accounts. Each invited Amazon Web Services account
     * can choose to accept the invitation from only one Amazon Web Services account. For more information, see <a
     * href="https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_invitations.html">Managing GuardDuty accounts by
     * invitation</a>.
     * </p>
     * <p>
     * After the invite has been accepted and you choose to disassociate a member account (by using <a
     * href="https://docs.aws.amazon.com/guardduty/latest/APIReference/API_DisassociateMembers.html"
     * >DisassociateMembers</a>) from your account, the details of the member account obtained by invoking <a
     * href="https://docs.aws.amazon.com/guardduty/latest/APIReference/API_CreateMembers.html">CreateMembers</a>,
     * including the associated email addresses, will be retained. This is done so that you can invoke InviteMembers
     * without the need to invoke <a
     * href="https://docs.aws.amazon.com/guardduty/latest/APIReference/API_CreateMembers.html">CreateMembers</a> again.
     * To remove the details associated with a member account, you must also invoke <a
     * href="https://docs.aws.amazon.com/guardduty/latest/APIReference/API_DeleteMembers.html">DeleteMembers</a>.
     * </p>
     * <p>
     * If you disassociate a member account that was added by invitation, the member account details obtained from this
     * API, including the associated email addresses, will be retained. This is done so that the delegated administrator
     * can invoke the <a
     * href="https://docs.aws.amazon.com/guardduty/latest/APIReference/API_InviteMembers.html">InviteMembers</a> API
     * without the need to invoke the CreateMembers API again. To remove the details associated with a member account,
     * the delegated administrator must invoke the <a
     * href="https://docs.aws.amazon.com/guardduty/latest/APIReference/API_DeleteMembers.html">DeleteMembers</a> API.
     * </p>
     * <p>
     * When the member accounts added through Organizations are later disassociated, you (administrator) can't invite
     * them by calling the InviteMembers API. You can create an association with these member accounts again only by
     * calling the CreateMembers API.
     * </p>
     * 
     * @param inviteMembersRequest
     * @return Result of the InviteMembers operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.InviteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/InviteMembers" target="_top">AWS API
     *      Documentation</a>
     */
    InviteMembersResult inviteMembers(InviteMembersRequest inviteMembersRequest);

    /**
     * <p>
     * Lists coverage details for your GuardDuty account. If you're a GuardDuty administrator, you can retrieve all
     * resources associated with the active member accounts in your organization.
     * </p>
     * <p>
     * Make sure the accounts have Runtime Monitoring enabled and GuardDuty agent running on their resources.
     * </p>
     * 
     * @param listCoverageRequest
     * @return Result of the ListCoverage operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.ListCoverage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListCoverage" target="_top">AWS API
     *      Documentation</a>
     */
    ListCoverageResult listCoverage(ListCoverageRequest listCoverageRequest);

    /**
     * <p>
     * Lists detectorIds of all the existing Amazon GuardDuty detector resources.
     * </p>
     * 
     * @param listDetectorsRequest
     * @return Result of the ListDetectors operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.ListDetectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListDetectors" target="_top">AWS API
     *      Documentation</a>
     */
    ListDetectorsResult listDetectors(ListDetectorsRequest listDetectorsRequest);

    /**
     * <p>
     * Returns a paginated list of the current filters.
     * </p>
     * 
     * @param listFiltersRequest
     * @return Result of the ListFilters operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.ListFilters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListFilters" target="_top">AWS API
     *      Documentation</a>
     */
    ListFiltersResult listFilters(ListFiltersRequest listFiltersRequest);

    /**
     * <p>
     * Lists GuardDuty findings for the specified detector ID.
     * </p>
     * <p>
     * There might be regional differences because some flags might not be available in all the Regions where GuardDuty
     * is currently supported. For more information, see <a
     * href="https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_regions.html">Regions and endpoints</a>.
     * </p>
     * 
     * @param listFindingsRequest
     * @return Result of the ListFindings operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.ListFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListFindings" target="_top">AWS API
     *      Documentation</a>
     */
    ListFindingsResult listFindings(ListFindingsRequest listFindingsRequest);

    /**
     * <p>
     * Lists the IPSets of the GuardDuty service specified by the detector ID. If you use this operation from a member
     * account, the IPSets returned are the IPSets from the associated administrator account.
     * </p>
     * 
     * @param listIPSetsRequest
     * @return Result of the ListIPSets operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.ListIPSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListIPSets" target="_top">AWS API
     *      Documentation</a>
     */
    ListIPSetsResult listIPSets(ListIPSetsRequest listIPSetsRequest);

    /**
     * <p>
     * Lists all GuardDuty membership invitations that were sent to the current Amazon Web Services account.
     * </p>
     * 
     * @param listInvitationsRequest
     * @return Result of the ListInvitations operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.ListInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListInvitations" target="_top">AWS API
     *      Documentation</a>
     */
    ListInvitationsResult listInvitations(ListInvitationsRequest listInvitationsRequest);

    /**
     * <p>
     * Lists details about all member accounts for the current GuardDuty administrator account.
     * </p>
     * 
     * @param listMembersRequest
     * @return Result of the ListMembers operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.ListMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListMembers" target="_top">AWS API
     *      Documentation</a>
     */
    ListMembersResult listMembers(ListMembersRequest listMembersRequest);

    /**
     * <p>
     * Lists the accounts designated as GuardDuty delegated administrators. Only the organization's management account
     * can run this API operation.
     * </p>
     * 
     * @param listOrganizationAdminAccountsRequest
     * @return Result of the ListOrganizationAdminAccounts operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.ListOrganizationAdminAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListOrganizationAdminAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    ListOrganizationAdminAccountsResult listOrganizationAdminAccounts(ListOrganizationAdminAccountsRequest listOrganizationAdminAccountsRequest);

    /**
     * <p>
     * Returns a list of publishing destinations associated with the specified <code>detectorId</code>.
     * </p>
     * 
     * @param listPublishingDestinationsRequest
     * @return Result of the ListPublishingDestinations operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.ListPublishingDestinations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListPublishingDestinations"
     *      target="_top">AWS API Documentation</a>
     */
    ListPublishingDestinationsResult listPublishingDestinations(ListPublishingDestinationsRequest listPublishingDestinationsRequest);

    /**
     * <p>
     * Lists tags for a resource. Tagging is currently supported for detectors, finding filters, IP sets, threat intel
     * sets, and publishing destination, with a limit of 50 tags per resource. When invoked, this operation returns all
     * assigned tags for a given resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws AccessDeniedException
     *         An access denied exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the ThreatIntelSets of the GuardDuty service specified by the detector ID. If you use this operation from a
     * member account, the ThreatIntelSets associated with the administrator account are returned.
     * </p>
     * 
     * @param listThreatIntelSetsRequest
     * @return Result of the ListThreatIntelSets operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.ListThreatIntelSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListThreatIntelSets" target="_top">AWS
     *      API Documentation</a>
     */
    ListThreatIntelSetsResult listThreatIntelSets(ListThreatIntelSetsRequest listThreatIntelSetsRequest);

    /**
     * <p>
     * Initiates the malware scan. Invoking this API will automatically create the <a
     * href="https://docs.aws.amazon.com/guardduty/latest/ug/slr-permissions-malware-protection.html">Service-linked
     * role</a> in the corresponding account.
     * </p>
     * <p>
     * When the malware scan starts, you can use the associated scan ID to track the status of the scan. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/guardduty/latest/APIReference/API_DescribeMalwareScans.html"
     * >DescribeMalwareScans</a>.
     * </p>
     * 
     * @param startMalwareScanRequest
     * @return Result of the StartMalwareScan operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws ConflictException
     *         A request conflict exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.StartMalwareScan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/StartMalwareScan" target="_top">AWS API
     *      Documentation</a>
     */
    StartMalwareScanResult startMalwareScan(StartMalwareScanRequest startMalwareScanRequest);

    /**
     * <p>
     * Turns on GuardDuty monitoring of the specified member accounts. Use this operation to restart monitoring of
     * accounts that you stopped monitoring with the <a
     * href="https://docs.aws.amazon.com/guardduty/latest/APIReference/API_StopMonitoringMembers.html"
     * >StopMonitoringMembers</a> operation.
     * </p>
     * 
     * @param startMonitoringMembersRequest
     * @return Result of the StartMonitoringMembers operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.StartMonitoringMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/StartMonitoringMembers"
     *      target="_top">AWS API Documentation</a>
     */
    StartMonitoringMembersResult startMonitoringMembers(StartMonitoringMembersRequest startMonitoringMembersRequest);

    /**
     * <p>
     * Stops GuardDuty monitoring for the specified member accounts. Use the <code>StartMonitoringMembers</code>
     * operation to restart monitoring for those accounts.
     * </p>
     * <p>
     * With <code>autoEnableOrganizationMembers</code> configuration for your organization set to <code>ALL</code>,
     * you'll receive an error if you attempt to stop monitoring the member accounts in your organization.
     * </p>
     * 
     * @param stopMonitoringMembersRequest
     * @return Result of the StopMonitoringMembers operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.StopMonitoringMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/StopMonitoringMembers"
     *      target="_top">AWS API Documentation</a>
     */
    StopMonitoringMembersResult stopMonitoringMembers(StopMonitoringMembersRequest stopMonitoringMembersRequest);

    /**
     * <p>
     * Adds tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws AccessDeniedException
     *         An access denied exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Unarchives GuardDuty findings specified by the <code>findingIds</code>.
     * </p>
     * 
     * @param unarchiveFindingsRequest
     * @return Result of the UnarchiveFindings operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.UnarchiveFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UnarchiveFindings" target="_top">AWS
     *      API Documentation</a>
     */
    UnarchiveFindingsResult unarchiveFindings(UnarchiveFindingsRequest unarchiveFindingsRequest);

    /**
     * <p>
     * Removes tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws AccessDeniedException
     *         An access denied exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates the GuardDuty detector specified by the detector ID.
     * </p>
     * <p>
     * Specifying both EKS Runtime Monitoring (<code>EKS_RUNTIME_MONITORING</code>) and Runtime Monitoring (
     * <code>RUNTIME_MONITORING</code>) will cause an error. You can add only one of these two features because Runtime
     * Monitoring already includes the threat detection for Amazon EKS resources. For more information, see <a
     * href="https://docs.aws.amazon.com/guardduty/latest/ug/runtime-monitoring.html">Runtime Monitoring</a>.
     * </p>
     * <p>
     * There might be regional differences because some data sources might not be available in all the Amazon Web
     * Services Regions where GuardDuty is presently supported. For more information, see <a
     * href="https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_regions.html">Regions and endpoints</a>.
     * </p>
     * 
     * @param updateDetectorRequest
     * @return Result of the UpdateDetector operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.UpdateDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateDetector" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateDetectorResult updateDetector(UpdateDetectorRequest updateDetectorRequest);

    /**
     * <p>
     * Updates the filter specified by the filter name.
     * </p>
     * 
     * @param updateFilterRequest
     * @return Result of the UpdateFilter operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.UpdateFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateFilter" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateFilterResult updateFilter(UpdateFilterRequest updateFilterRequest);

    /**
     * <p>
     * Marks the specified GuardDuty findings as useful or not useful.
     * </p>
     * 
     * @param updateFindingsFeedbackRequest
     * @return Result of the UpdateFindingsFeedback operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.UpdateFindingsFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateFindingsFeedback"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateFindingsFeedbackResult updateFindingsFeedback(UpdateFindingsFeedbackRequest updateFindingsFeedbackRequest);

    /**
     * <p>
     * Updates the IPSet specified by the IPSet ID.
     * </p>
     * 
     * @param updateIPSetRequest
     * @return Result of the UpdateIPSet operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.UpdateIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateIPSetResult updateIPSet(UpdateIPSetRequest updateIPSetRequest);

    /**
     * <p>
     * Updates the malware scan settings.
     * </p>
     * <p>
     * There might be regional differences because some data sources might not be available in all the Amazon Web
     * Services Regions where GuardDuty is presently supported. For more information, see <a
     * href="https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_regions.html">Regions and endpoints</a>.
     * </p>
     * 
     * @param updateMalwareScanSettingsRequest
     * @return Result of the UpdateMalwareScanSettings operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.UpdateMalwareScanSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateMalwareScanSettings"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateMalwareScanSettingsResult updateMalwareScanSettings(UpdateMalwareScanSettingsRequest updateMalwareScanSettingsRequest);

    /**
     * <p>
     * Contains information on member accounts to be updated.
     * </p>
     * <p>
     * Specifying both EKS Runtime Monitoring (<code>EKS_RUNTIME_MONITORING</code>) and Runtime Monitoring (
     * <code>RUNTIME_MONITORING</code>) will cause an error. You can add only one of these two features because Runtime
     * Monitoring already includes the threat detection for Amazon EKS resources. For more information, see <a
     * href="https://docs.aws.amazon.com/guardduty/latest/ug/runtime-monitoring.html">Runtime Monitoring</a>.
     * </p>
     * <p>
     * There might be regional differences because some data sources might not be available in all the Amazon Web
     * Services Regions where GuardDuty is presently supported. For more information, see <a
     * href="https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_regions.html">Regions and endpoints</a>.
     * </p>
     * 
     * @param updateMemberDetectorsRequest
     * @return Result of the UpdateMemberDetectors operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.UpdateMemberDetectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateMemberDetectors"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateMemberDetectorsResult updateMemberDetectors(UpdateMemberDetectorsRequest updateMemberDetectorsRequest);

    /**
     * <p>
     * Configures the delegated administrator account with the provided values. You must provide a value for either
     * <code>autoEnableOrganizationMembers</code> or <code>autoEnable</code>, but not both.
     * </p>
     * <p>
     * Specifying both EKS Runtime Monitoring (<code>EKS_RUNTIME_MONITORING</code>) and Runtime Monitoring (
     * <code>RUNTIME_MONITORING</code>) will cause an error. You can add only one of these two features because Runtime
     * Monitoring already includes the threat detection for Amazon EKS resources. For more information, see <a
     * href="https://docs.aws.amazon.com/guardduty/latest/ug/runtime-monitoring.html">Runtime Monitoring</a>.
     * </p>
     * <p>
     * There might be regional differences because some data sources might not be available in all the Amazon Web
     * Services Regions where GuardDuty is presently supported. For more information, see <a
     * href="https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_regions.html">Regions and endpoints</a>.
     * </p>
     * 
     * @param updateOrganizationConfigurationRequest
     * @return Result of the UpdateOrganizationConfiguration operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.UpdateOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateOrganizationConfigurationResult updateOrganizationConfiguration(UpdateOrganizationConfigurationRequest updateOrganizationConfigurationRequest);

    /**
     * <p>
     * Updates information about the publishing destination specified by the <code>destinationId</code>.
     * </p>
     * 
     * @param updatePublishingDestinationRequest
     * @return Result of the UpdatePublishingDestination operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
     * @sample AmazonGuardDuty.UpdatePublishingDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdatePublishingDestination"
     *      target="_top">AWS API Documentation</a>
     */
    UpdatePublishingDestinationResult updatePublishingDestination(UpdatePublishingDestinationRequest updatePublishingDestinationRequest);

    /**
     * <p>
     * Updates the ThreatIntelSet specified by the ThreatIntelSet ID.
     * </p>
     * 
     * @param updateThreatIntelSetRequest
     * @return Result of the UpdateThreatIntelSet operation returned by the service.
     * @throws BadRequestException
     *         A bad request exception object.
     * @throws InternalServerErrorException
     *         An internal server error exception object.
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
