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
public interface AmazonGuardDutyAsync extends AmazonGuardDuty {

    /**
     * <p>
     * Accepts the invitation to be a member account and get monitored by a GuardDuty administrator account that sent
     * the invitation.
     * </p>
     * 
     * @param acceptAdministratorInvitationRequest
     * @return A Java Future containing the result of the AcceptAdministratorInvitation operation returned by the
     *         service.
     * @sample AmazonGuardDutyAsync.AcceptAdministratorInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/AcceptAdministratorInvitation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AcceptAdministratorInvitationResult> acceptAdministratorInvitationAsync(
            AcceptAdministratorInvitationRequest acceptAdministratorInvitationRequest);

    /**
     * <p>
     * Accepts the invitation to be a member account and get monitored by a GuardDuty administrator account that sent
     * the invitation.
     * </p>
     * 
     * @param acceptAdministratorInvitationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AcceptAdministratorInvitation operation returned by the
     *         service.
     * @sample AmazonGuardDutyAsyncHandler.AcceptAdministratorInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/AcceptAdministratorInvitation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AcceptAdministratorInvitationResult> acceptAdministratorInvitationAsync(
            AcceptAdministratorInvitationRequest acceptAdministratorInvitationRequest,
            com.amazonaws.handlers.AsyncHandler<AcceptAdministratorInvitationRequest, AcceptAdministratorInvitationResult> asyncHandler);

    /**
     * <p>
     * Accepts the invitation to be monitored by a GuardDuty administrator account.
     * </p>
     * 
     * @param acceptInvitationRequest
     * @return A Java Future containing the result of the AcceptInvitation operation returned by the service.
     * @sample AmazonGuardDutyAsync.AcceptInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/AcceptInvitation" target="_top">AWS API
     *      Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<AcceptInvitationResult> acceptInvitationAsync(AcceptInvitationRequest acceptInvitationRequest);

    /**
     * <p>
     * Accepts the invitation to be monitored by a GuardDuty administrator account.
     * </p>
     * 
     * @param acceptInvitationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AcceptInvitation operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.AcceptInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/AcceptInvitation" target="_top">AWS API
     *      Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<AcceptInvitationResult> acceptInvitationAsync(AcceptInvitationRequest acceptInvitationRequest,
            com.amazonaws.handlers.AsyncHandler<AcceptInvitationRequest, AcceptInvitationResult> asyncHandler);

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
     * @return A Java Future containing the result of the ArchiveFindings operation returned by the service.
     * @sample AmazonGuardDutyAsync.ArchiveFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ArchiveFindings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ArchiveFindingsResult> archiveFindingsAsync(ArchiveFindingsRequest archiveFindingsRequest);

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
     * @return A Java Future containing the result of the CreateDetector operation returned by the service.
     * @sample AmazonGuardDutyAsync.CreateDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateDetector" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateDetectorResult> createDetectorAsync(CreateDetectorRequest createDetectorRequest);

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
     * <p>
     * Creates a filter using the specified finding criteria. The maximum number of saved filters per Amazon Web
     * Services account per Region is 100. For more information, see <a
     * href="https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_limits.html">Quotas for GuardDuty</a>.
     * </p>
     * 
     * @param createFilterRequest
     * @return A Java Future containing the result of the CreateFilter operation returned by the service.
     * @sample AmazonGuardDutyAsync.CreateFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateFilter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFilterResult> createFilterAsync(CreateFilterRequest createFilterRequest);

    /**
     * <p>
     * Creates a filter using the specified finding criteria. The maximum number of saved filters per Amazon Web
     * Services account per Region is 100. For more information, see <a
     * href="https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_limits.html">Quotas for GuardDuty</a>.
     * </p>
     * 
     * @param createFilterRequest
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
     * <p>
     * Creates a new IPSet, which is called a trusted IP list in the console user interface. An IPSet is a list of IP
     * addresses that are trusted for secure communication with Amazon Web Services infrastructure and applications.
     * GuardDuty doesn't generate findings for IP addresses that are included in IPSets. Only users from the
     * administrator account can use this operation.
     * </p>
     * 
     * @param createIPSetRequest
     * @return A Java Future containing the result of the CreateIPSet operation returned by the service.
     * @sample AmazonGuardDutyAsync.CreateIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateIPSetResult> createIPSetAsync(CreateIPSetRequest createIPSetRequest);

    /**
     * <p>
     * Creates a new IPSet, which is called a trusted IP list in the console user interface. An IPSet is a list of IP
     * addresses that are trusted for secure communication with Amazon Web Services infrastructure and applications.
     * GuardDuty doesn't generate findings for IP addresses that are included in IPSets. Only users from the
     * administrator account can use this operation.
     * </p>
     * 
     * @param createIPSetRequest
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
     * @return A Java Future containing the result of the CreateMembers operation returned by the service.
     * @sample AmazonGuardDutyAsync.CreateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateMembersResult> createMembersAsync(CreateMembersRequest createMembersRequest);

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
     * <p>
     * Creates a publishing destination to export findings to. The resource to export findings to must exist before you
     * use this operation.
     * </p>
     * 
     * @param createPublishingDestinationRequest
     * @return A Java Future containing the result of the CreatePublishingDestination operation returned by the service.
     * @sample AmazonGuardDutyAsync.CreatePublishingDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreatePublishingDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePublishingDestinationResult> createPublishingDestinationAsync(
            CreatePublishingDestinationRequest createPublishingDestinationRequest);

    /**
     * <p>
     * Creates a publishing destination to export findings to. The resource to export findings to must exist before you
     * use this operation.
     * </p>
     * 
     * @param createPublishingDestinationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePublishingDestination operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.CreatePublishingDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreatePublishingDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePublishingDestinationResult> createPublishingDestinationAsync(
            CreatePublishingDestinationRequest createPublishingDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePublishingDestinationRequest, CreatePublishingDestinationResult> asyncHandler);

    /**
     * <p>
     * Generates sample findings of types specified by the list of finding types. If 'NULL' is specified for
     * <code>findingTypes</code>, the API generates sample findings of all supported finding types.
     * </p>
     * 
     * @param createSampleFindingsRequest
     * @return A Java Future containing the result of the CreateSampleFindings operation returned by the service.
     * @sample AmazonGuardDutyAsync.CreateSampleFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateSampleFindings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateSampleFindingsResult> createSampleFindingsAsync(CreateSampleFindingsRequest createSampleFindingsRequest);

    /**
     * <p>
     * Generates sample findings of types specified by the list of finding types. If 'NULL' is specified for
     * <code>findingTypes</code>, the API generates sample findings of all supported finding types.
     * </p>
     * 
     * @param createSampleFindingsRequest
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
     * <p>
     * Creates a new ThreatIntelSet. ThreatIntelSets consist of known malicious IP addresses. GuardDuty generates
     * findings based on ThreatIntelSets. Only users of the administrator account can use this operation.
     * </p>
     * 
     * @param createThreatIntelSetRequest
     * @return A Java Future containing the result of the CreateThreatIntelSet operation returned by the service.
     * @sample AmazonGuardDutyAsync.CreateThreatIntelSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateThreatIntelSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateThreatIntelSetResult> createThreatIntelSetAsync(CreateThreatIntelSetRequest createThreatIntelSetRequest);

    /**
     * <p>
     * Creates a new ThreatIntelSet. ThreatIntelSets consist of known malicious IP addresses. GuardDuty generates
     * findings based on ThreatIntelSets. Only users of the administrator account can use this operation.
     * </p>
     * 
     * @param createThreatIntelSetRequest
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
     * <p>
     * Declines invitations sent to the current member account by Amazon Web Services accounts specified by their
     * account IDs.
     * </p>
     * 
     * @param declineInvitationsRequest
     * @return A Java Future containing the result of the DeclineInvitations operation returned by the service.
     * @sample AmazonGuardDutyAsync.DeclineInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeclineInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeclineInvitationsResult> declineInvitationsAsync(DeclineInvitationsRequest declineInvitationsRequest);

    /**
     * <p>
     * Declines invitations sent to the current member account by Amazon Web Services accounts specified by their
     * account IDs.
     * </p>
     * 
     * @param declineInvitationsRequest
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
     * <p>
     * Deletes an Amazon GuardDuty detector that is specified by the detector ID.
     * </p>
     * 
     * @param deleteDetectorRequest
     * @return A Java Future containing the result of the DeleteDetector operation returned by the service.
     * @sample AmazonGuardDutyAsync.DeleteDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteDetector" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteDetectorResult> deleteDetectorAsync(DeleteDetectorRequest deleteDetectorRequest);

    /**
     * <p>
     * Deletes an Amazon GuardDuty detector that is specified by the detector ID.
     * </p>
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
     * <p>
     * Deletes the filter specified by the filter name.
     * </p>
     * 
     * @param deleteFilterRequest
     * @return A Java Future containing the result of the DeleteFilter operation returned by the service.
     * @sample AmazonGuardDutyAsync.DeleteFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteFilter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFilterResult> deleteFilterAsync(DeleteFilterRequest deleteFilterRequest);

    /**
     * <p>
     * Deletes the filter specified by the filter name.
     * </p>
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
     * <p>
     * Deletes the IPSet specified by the <code>ipSetId</code>. IPSets are called trusted IP lists in the console user
     * interface.
     * </p>
     * 
     * @param deleteIPSetRequest
     * @return A Java Future containing the result of the DeleteIPSet operation returned by the service.
     * @sample AmazonGuardDutyAsync.DeleteIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteIPSetResult> deleteIPSetAsync(DeleteIPSetRequest deleteIPSetRequest);

    /**
     * <p>
     * Deletes the IPSet specified by the <code>ipSetId</code>. IPSets are called trusted IP lists in the console user
     * interface.
     * </p>
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
     * <p>
     * Deletes invitations sent to the current member account by Amazon Web Services accounts specified by their account
     * IDs.
     * </p>
     * 
     * @param deleteInvitationsRequest
     * @return A Java Future containing the result of the DeleteInvitations operation returned by the service.
     * @sample AmazonGuardDutyAsync.DeleteInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteInvitationsResult> deleteInvitationsAsync(DeleteInvitationsRequest deleteInvitationsRequest);

    /**
     * <p>
     * Deletes invitations sent to the current member account by Amazon Web Services accounts specified by their account
     * IDs.
     * </p>
     * 
     * @param deleteInvitationsRequest
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
     * <p>
     * Deletes GuardDuty member accounts (to the current GuardDuty administrator account) specified by the account IDs.
     * </p>
     * <p>
     * With <code>autoEnableOrganizationMembers</code> configuration for your organization set to <code>ALL</code>,
     * you'll receive an error if you attempt to disable GuardDuty for a member account in your organization.
     * </p>
     * 
     * @param deleteMembersRequest
     * @return A Java Future containing the result of the DeleteMembers operation returned by the service.
     * @sample AmazonGuardDutyAsync.DeleteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteMembersResult> deleteMembersAsync(DeleteMembersRequest deleteMembersRequest);

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
     * <p>
     * Deletes the publishing definition with the specified <code>destinationId</code>.
     * </p>
     * 
     * @param deletePublishingDestinationRequest
     * @return A Java Future containing the result of the DeletePublishingDestination operation returned by the service.
     * @sample AmazonGuardDutyAsync.DeletePublishingDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeletePublishingDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePublishingDestinationResult> deletePublishingDestinationAsync(
            DeletePublishingDestinationRequest deletePublishingDestinationRequest);

    /**
     * <p>
     * Deletes the publishing definition with the specified <code>destinationId</code>.
     * </p>
     * 
     * @param deletePublishingDestinationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePublishingDestination operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.DeletePublishingDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeletePublishingDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePublishingDestinationResult> deletePublishingDestinationAsync(
            DeletePublishingDestinationRequest deletePublishingDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePublishingDestinationRequest, DeletePublishingDestinationResult> asyncHandler);

    /**
     * <p>
     * Deletes the ThreatIntelSet specified by the ThreatIntelSet ID.
     * </p>
     * 
     * @param deleteThreatIntelSetRequest
     * @return A Java Future containing the result of the DeleteThreatIntelSet operation returned by the service.
     * @sample AmazonGuardDutyAsync.DeleteThreatIntelSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DeleteThreatIntelSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteThreatIntelSetResult> deleteThreatIntelSetAsync(DeleteThreatIntelSetRequest deleteThreatIntelSetRequest);

    /**
     * <p>
     * Deletes the ThreatIntelSet specified by the ThreatIntelSet ID.
     * </p>
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
     * @return A Java Future containing the result of the DescribeMalwareScans operation returned by the service.
     * @sample AmazonGuardDutyAsync.DescribeMalwareScans
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DescribeMalwareScans" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMalwareScansResult> describeMalwareScansAsync(DescribeMalwareScansRequest describeMalwareScansRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMalwareScans operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.DescribeMalwareScans
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DescribeMalwareScans" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMalwareScansResult> describeMalwareScansAsync(DescribeMalwareScansRequest describeMalwareScansRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMalwareScansRequest, DescribeMalwareScansResult> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeOrganizationConfiguration operation returned by the
     *         service.
     * @sample AmazonGuardDutyAsync.DescribeOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DescribeOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOrganizationConfigurationResult> describeOrganizationConfigurationAsync(
            DescribeOrganizationConfigurationRequest describeOrganizationConfigurationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeOrganizationConfiguration operation returned by the
     *         service.
     * @sample AmazonGuardDutyAsyncHandler.DescribeOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DescribeOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOrganizationConfigurationResult> describeOrganizationConfigurationAsync(
            DescribeOrganizationConfigurationRequest describeOrganizationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeOrganizationConfigurationRequest, DescribeOrganizationConfigurationResult> asyncHandler);

    /**
     * <p>
     * Returns information about the publishing destination specified by the provided <code>destinationId</code>.
     * </p>
     * 
     * @param describePublishingDestinationRequest
     * @return A Java Future containing the result of the DescribePublishingDestination operation returned by the
     *         service.
     * @sample AmazonGuardDutyAsync.DescribePublishingDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DescribePublishingDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePublishingDestinationResult> describePublishingDestinationAsync(
            DescribePublishingDestinationRequest describePublishingDestinationRequest);

    /**
     * <p>
     * Returns information about the publishing destination specified by the provided <code>destinationId</code>.
     * </p>
     * 
     * @param describePublishingDestinationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePublishingDestination operation returned by the
     *         service.
     * @sample AmazonGuardDutyAsyncHandler.DescribePublishingDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DescribePublishingDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePublishingDestinationResult> describePublishingDestinationAsync(
            DescribePublishingDestinationRequest describePublishingDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePublishingDestinationRequest, DescribePublishingDestinationResult> asyncHandler);

    /**
     * <p>
     * Removes the existing GuardDuty delegated administrator of the organization. Only the organization's management
     * account can run this API operation.
     * </p>
     * 
     * @param disableOrganizationAdminAccountRequest
     * @return A Java Future containing the result of the DisableOrganizationAdminAccount operation returned by the
     *         service.
     * @sample AmazonGuardDutyAsync.DisableOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DisableOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableOrganizationAdminAccountResult> disableOrganizationAdminAccountAsync(
            DisableOrganizationAdminAccountRequest disableOrganizationAdminAccountRequest);

    /**
     * <p>
     * Removes the existing GuardDuty delegated administrator of the organization. Only the organization's management
     * account can run this API operation.
     * </p>
     * 
     * @param disableOrganizationAdminAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableOrganizationAdminAccount operation returned by the
     *         service.
     * @sample AmazonGuardDutyAsyncHandler.DisableOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DisableOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableOrganizationAdminAccountResult> disableOrganizationAdminAccountAsync(
            DisableOrganizationAdminAccountRequest disableOrganizationAdminAccountRequest,
            com.amazonaws.handlers.AsyncHandler<DisableOrganizationAdminAccountRequest, DisableOrganizationAdminAccountResult> asyncHandler);

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
     * @return A Java Future containing the result of the DisassociateFromAdministratorAccount operation returned by the
     *         service.
     * @sample AmazonGuardDutyAsync.DisassociateFromAdministratorAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DisassociateFromAdministratorAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateFromAdministratorAccountResult> disassociateFromAdministratorAccountAsync(
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
     * <p>
     * With <code>autoEnableOrganizationMembers</code> configuration for your organization set to <code>ALL</code>,
     * you'll receive an error if you attempt to disable GuardDuty in a member account.
     * </p>
     * 
     * @param disassociateFromAdministratorAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateFromAdministratorAccount operation returned by the
     *         service.
     * @sample AmazonGuardDutyAsyncHandler.DisassociateFromAdministratorAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DisassociateFromAdministratorAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateFromAdministratorAccountResult> disassociateFromAdministratorAccountAsync(
            DisassociateFromAdministratorAccountRequest disassociateFromAdministratorAccountRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateFromAdministratorAccountRequest, DisassociateFromAdministratorAccountResult> asyncHandler);

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
     * @return A Java Future containing the result of the DisassociateFromMasterAccount operation returned by the
     *         service.
     * @sample AmazonGuardDutyAsync.DisassociateFromMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DisassociateFromMasterAccount"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<DisassociateFromMasterAccountResult> disassociateFromMasterAccountAsync(
            DisassociateFromMasterAccountRequest disassociateFromMasterAccountRequest);

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
    @Deprecated
    java.util.concurrent.Future<DisassociateFromMasterAccountResult> disassociateFromMasterAccountAsync(
            DisassociateFromMasterAccountRequest disassociateFromMasterAccountRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateFromMasterAccountRequest, DisassociateFromMasterAccountResult> asyncHandler);

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
     * @return A Java Future containing the result of the DisassociateMembers operation returned by the service.
     * @sample AmazonGuardDutyAsync.DisassociateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DisassociateMembers" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateMembersResult> disassociateMembersAsync(DisassociateMembersRequest disassociateMembersRequest);

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
     * <p>
     * Designates an Amazon Web Services account within the organization as your GuardDuty delegated administrator. Only
     * the organization's management account can run this API operation.
     * </p>
     * 
     * @param enableOrganizationAdminAccountRequest
     * @return A Java Future containing the result of the EnableOrganizationAdminAccount operation returned by the
     *         service.
     * @sample AmazonGuardDutyAsync.EnableOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/EnableOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableOrganizationAdminAccountResult> enableOrganizationAdminAccountAsync(
            EnableOrganizationAdminAccountRequest enableOrganizationAdminAccountRequest);

    /**
     * <p>
     * Designates an Amazon Web Services account within the organization as your GuardDuty delegated administrator. Only
     * the organization's management account can run this API operation.
     * </p>
     * 
     * @param enableOrganizationAdminAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableOrganizationAdminAccount operation returned by the
     *         service.
     * @sample AmazonGuardDutyAsyncHandler.EnableOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/EnableOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableOrganizationAdminAccountResult> enableOrganizationAdminAccountAsync(
            EnableOrganizationAdminAccountRequest enableOrganizationAdminAccountRequest,
            com.amazonaws.handlers.AsyncHandler<EnableOrganizationAdminAccountRequest, EnableOrganizationAdminAccountResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetAdministratorAccount operation returned by the service.
     * @sample AmazonGuardDutyAsync.GetAdministratorAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetAdministratorAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAdministratorAccountResult> getAdministratorAccountAsync(GetAdministratorAccountRequest getAdministratorAccountRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAdministratorAccount operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.GetAdministratorAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetAdministratorAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAdministratorAccountResult> getAdministratorAccountAsync(GetAdministratorAccountRequest getAdministratorAccountRequest,
            com.amazonaws.handlers.AsyncHandler<GetAdministratorAccountRequest, GetAdministratorAccountResult> asyncHandler);

    /**
     * <p>
     * Retrieves aggregated statistics for your account. If you are a GuardDuty administrator, you can retrieve the
     * statistics for all the resources associated with the active member accounts in your organization who have enabled
     * Runtime Monitoring and have the GuardDuty security agent running on their resources.
     * </p>
     * 
     * @param getCoverageStatisticsRequest
     * @return A Java Future containing the result of the GetCoverageStatistics operation returned by the service.
     * @sample AmazonGuardDutyAsync.GetCoverageStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetCoverageStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCoverageStatisticsResult> getCoverageStatisticsAsync(GetCoverageStatisticsRequest getCoverageStatisticsRequest);

    /**
     * <p>
     * Retrieves aggregated statistics for your account. If you are a GuardDuty administrator, you can retrieve the
     * statistics for all the resources associated with the active member accounts in your organization who have enabled
     * Runtime Monitoring and have the GuardDuty security agent running on their resources.
     * </p>
     * 
     * @param getCoverageStatisticsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCoverageStatistics operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.GetCoverageStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetCoverageStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetCoverageStatisticsResult> getCoverageStatisticsAsync(GetCoverageStatisticsRequest getCoverageStatisticsRequest,
            com.amazonaws.handlers.AsyncHandler<GetCoverageStatisticsRequest, GetCoverageStatisticsResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetDetector operation returned by the service.
     * @sample AmazonGuardDutyAsync.GetDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetDetector" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetDetectorResult> getDetectorAsync(GetDetectorRequest getDetectorRequest);

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
     * <p>
     * Returns the details of the filter specified by the filter name.
     * </p>
     * 
     * @param getFilterRequest
     * @return A Java Future containing the result of the GetFilter operation returned by the service.
     * @sample AmazonGuardDutyAsync.GetFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetFilter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFilterResult> getFilterAsync(GetFilterRequest getFilterRequest);

    /**
     * <p>
     * Returns the details of the filter specified by the filter name.
     * </p>
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
     * <p>
     * Describes Amazon GuardDuty findings specified by finding IDs.
     * </p>
     * 
     * @param getFindingsRequest
     * @return A Java Future containing the result of the GetFindings operation returned by the service.
     * @sample AmazonGuardDutyAsync.GetFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetFindings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFindingsResult> getFindingsAsync(GetFindingsRequest getFindingsRequest);

    /**
     * <p>
     * Describes Amazon GuardDuty findings specified by finding IDs.
     * </p>
     * 
     * @param getFindingsRequest
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
     * @return A Java Future containing the result of the GetFindingsStatistics operation returned by the service.
     * @sample AmazonGuardDutyAsync.GetFindingsStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetFindingsStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFindingsStatisticsResult> getFindingsStatisticsAsync(GetFindingsStatisticsRequest getFindingsStatisticsRequest);

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
     * <p>
     * Retrieves the IPSet specified by the <code>ipSetId</code>.
     * </p>
     * 
     * @param getIPSetRequest
     * @return A Java Future containing the result of the GetIPSet operation returned by the service.
     * @sample AmazonGuardDutyAsync.GetIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetIPSetResult> getIPSetAsync(GetIPSetRequest getIPSetRequest);

    /**
     * <p>
     * Retrieves the IPSet specified by the <code>ipSetId</code>.
     * </p>
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
     * <p>
     * Returns the count of all GuardDuty membership invitations that were sent to the current member account except the
     * currently accepted invitation.
     * </p>
     * 
     * @param getInvitationsCountRequest
     * @return A Java Future containing the result of the GetInvitationsCount operation returned by the service.
     * @sample AmazonGuardDutyAsync.GetInvitationsCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetInvitationsCount" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetInvitationsCountResult> getInvitationsCountAsync(GetInvitationsCountRequest getInvitationsCountRequest);

    /**
     * <p>
     * Returns the count of all GuardDuty membership invitations that were sent to the current member account except the
     * currently accepted invitation.
     * </p>
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
     * @return A Java Future containing the result of the GetMalwareScanSettings operation returned by the service.
     * @sample AmazonGuardDutyAsync.GetMalwareScanSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetMalwareScanSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMalwareScanSettingsResult> getMalwareScanSettingsAsync(GetMalwareScanSettingsRequest getMalwareScanSettingsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMalwareScanSettings operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.GetMalwareScanSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetMalwareScanSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetMalwareScanSettingsResult> getMalwareScanSettingsAsync(GetMalwareScanSettingsRequest getMalwareScanSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetMalwareScanSettingsRequest, GetMalwareScanSettingsResult> asyncHandler);

    /**
     * <p>
     * Provides the details for the GuardDuty administrator account associated with the current GuardDuty member
     * account.
     * </p>
     * 
     * @param getMasterAccountRequest
     * @return A Java Future containing the result of the GetMasterAccount operation returned by the service.
     * @sample AmazonGuardDutyAsync.GetMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetMasterAccount" target="_top">AWS API
     *      Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<GetMasterAccountResult> getMasterAccountAsync(GetMasterAccountRequest getMasterAccountRequest);

    /**
     * <p>
     * Provides the details for the GuardDuty administrator account associated with the current GuardDuty member
     * account.
     * </p>
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
    @Deprecated
    java.util.concurrent.Future<GetMasterAccountResult> getMasterAccountAsync(GetMasterAccountRequest getMasterAccountRequest,
            com.amazonaws.handlers.AsyncHandler<GetMasterAccountRequest, GetMasterAccountResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetMemberDetectors operation returned by the service.
     * @sample AmazonGuardDutyAsync.GetMemberDetectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetMemberDetectors" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetMemberDetectorsResult> getMemberDetectorsAsync(GetMemberDetectorsRequest getMemberDetectorsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMemberDetectors operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.GetMemberDetectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetMemberDetectors" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetMemberDetectorsResult> getMemberDetectorsAsync(GetMemberDetectorsRequest getMemberDetectorsRequest,
            com.amazonaws.handlers.AsyncHandler<GetMemberDetectorsRequest, GetMemberDetectorsResult> asyncHandler);

    /**
     * <p>
     * Retrieves GuardDuty member accounts (of the current GuardDuty administrator account) specified by the account
     * IDs.
     * </p>
     * 
     * @param getMembersRequest
     * @return A Java Future containing the result of the GetMembers operation returned by the service.
     * @sample AmazonGuardDutyAsync.GetMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMembersResult> getMembersAsync(GetMembersRequest getMembersRequest);

    /**
     * <p>
     * Retrieves GuardDuty member accounts (of the current GuardDuty administrator account) specified by the account
     * IDs.
     * </p>
     * 
     * @param getMembersRequest
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
     * @return A Java Future containing the result of the GetOrganizationStatistics operation returned by the service.
     * @sample AmazonGuardDutyAsync.GetOrganizationStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetOrganizationStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetOrganizationStatisticsResult> getOrganizationStatisticsAsync(
            GetOrganizationStatisticsRequest getOrganizationStatisticsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetOrganizationStatistics operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.GetOrganizationStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetOrganizationStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetOrganizationStatisticsResult> getOrganizationStatisticsAsync(
            GetOrganizationStatisticsRequest getOrganizationStatisticsRequest,
            com.amazonaws.handlers.AsyncHandler<GetOrganizationStatisticsRequest, GetOrganizationStatisticsResult> asyncHandler);

    /**
     * <p>
     * Provides the number of days left for each data source used in the free trial period.
     * </p>
     * 
     * @param getRemainingFreeTrialDaysRequest
     * @return A Java Future containing the result of the GetRemainingFreeTrialDays operation returned by the service.
     * @sample AmazonGuardDutyAsync.GetRemainingFreeTrialDays
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetRemainingFreeTrialDays"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRemainingFreeTrialDaysResult> getRemainingFreeTrialDaysAsync(
            GetRemainingFreeTrialDaysRequest getRemainingFreeTrialDaysRequest);

    /**
     * <p>
     * Provides the number of days left for each data source used in the free trial period.
     * </p>
     * 
     * @param getRemainingFreeTrialDaysRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRemainingFreeTrialDays operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.GetRemainingFreeTrialDays
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetRemainingFreeTrialDays"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetRemainingFreeTrialDaysResult> getRemainingFreeTrialDaysAsync(
            GetRemainingFreeTrialDaysRequest getRemainingFreeTrialDaysRequest,
            com.amazonaws.handlers.AsyncHandler<GetRemainingFreeTrialDaysRequest, GetRemainingFreeTrialDaysResult> asyncHandler);

    /**
     * <p>
     * Retrieves the ThreatIntelSet that is specified by the ThreatIntelSet ID.
     * </p>
     * 
     * @param getThreatIntelSetRequest
     * @return A Java Future containing the result of the GetThreatIntelSet operation returned by the service.
     * @sample AmazonGuardDutyAsync.GetThreatIntelSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetThreatIntelSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetThreatIntelSetResult> getThreatIntelSetAsync(GetThreatIntelSetRequest getThreatIntelSetRequest);

    /**
     * <p>
     * Retrieves the ThreatIntelSet that is specified by the ThreatIntelSet ID.
     * </p>
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
     * @return A Java Future containing the result of the GetUsageStatistics operation returned by the service.
     * @sample AmazonGuardDutyAsync.GetUsageStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetUsageStatistics" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetUsageStatisticsResult> getUsageStatisticsAsync(GetUsageStatisticsRequest getUsageStatisticsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetUsageStatistics operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.GetUsageStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetUsageStatistics" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetUsageStatisticsResult> getUsageStatisticsAsync(GetUsageStatisticsRequest getUsageStatisticsRequest,
            com.amazonaws.handlers.AsyncHandler<GetUsageStatisticsRequest, GetUsageStatisticsResult> asyncHandler);

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
     * @return A Java Future containing the result of the InviteMembers operation returned by the service.
     * @sample AmazonGuardDutyAsync.InviteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/InviteMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<InviteMembersResult> inviteMembersAsync(InviteMembersRequest inviteMembersRequest);

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
     * <p>
     * Lists coverage details for your GuardDuty account. If you're a GuardDuty administrator, you can retrieve all
     * resources associated with the active member accounts in your organization.
     * </p>
     * <p>
     * Make sure the accounts have Runtime Monitoring enabled and GuardDuty agent running on their resources.
     * </p>
     * 
     * @param listCoverageRequest
     * @return A Java Future containing the result of the ListCoverage operation returned by the service.
     * @sample AmazonGuardDutyAsync.ListCoverage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListCoverage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListCoverageResult> listCoverageAsync(ListCoverageRequest listCoverageRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCoverage operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.ListCoverage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListCoverage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListCoverageResult> listCoverageAsync(ListCoverageRequest listCoverageRequest,
            com.amazonaws.handlers.AsyncHandler<ListCoverageRequest, ListCoverageResult> asyncHandler);

    /**
     * <p>
     * Lists detectorIds of all the existing Amazon GuardDuty detector resources.
     * </p>
     * 
     * @param listDetectorsRequest
     * @return A Java Future containing the result of the ListDetectors operation returned by the service.
     * @sample AmazonGuardDutyAsync.ListDetectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListDetectors" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListDetectorsResult> listDetectorsAsync(ListDetectorsRequest listDetectorsRequest);

    /**
     * <p>
     * Lists detectorIds of all the existing Amazon GuardDuty detector resources.
     * </p>
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
     * <p>
     * Returns a paginated list of the current filters.
     * </p>
     * 
     * @param listFiltersRequest
     * @return A Java Future containing the result of the ListFilters operation returned by the service.
     * @sample AmazonGuardDutyAsync.ListFilters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListFilters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFiltersResult> listFiltersAsync(ListFiltersRequest listFiltersRequest);

    /**
     * <p>
     * Returns a paginated list of the current filters.
     * </p>
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
     * @return A Java Future containing the result of the ListFindings operation returned by the service.
     * @sample AmazonGuardDutyAsync.ListFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListFindings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFindingsResult> listFindingsAsync(ListFindingsRequest listFindingsRequest);

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
     * <p>
     * Lists the IPSets of the GuardDuty service specified by the detector ID. If you use this operation from a member
     * account, the IPSets returned are the IPSets from the associated administrator account.
     * </p>
     * 
     * @param listIPSetsRequest
     * @return A Java Future containing the result of the ListIPSets operation returned by the service.
     * @sample AmazonGuardDutyAsync.ListIPSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListIPSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListIPSetsResult> listIPSetsAsync(ListIPSetsRequest listIPSetsRequest);

    /**
     * <p>
     * Lists the IPSets of the GuardDuty service specified by the detector ID. If you use this operation from a member
     * account, the IPSets returned are the IPSets from the associated administrator account.
     * </p>
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
     * <p>
     * Lists all GuardDuty membership invitations that were sent to the current Amazon Web Services account.
     * </p>
     * 
     * @param listInvitationsRequest
     * @return A Java Future containing the result of the ListInvitations operation returned by the service.
     * @sample AmazonGuardDutyAsync.ListInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListInvitations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListInvitationsResult> listInvitationsAsync(ListInvitationsRequest listInvitationsRequest);

    /**
     * <p>
     * Lists all GuardDuty membership invitations that were sent to the current Amazon Web Services account.
     * </p>
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
     * <p>
     * Lists details about all member accounts for the current GuardDuty administrator account.
     * </p>
     * 
     * @param listMembersRequest
     * @return A Java Future containing the result of the ListMembers operation returned by the service.
     * @sample AmazonGuardDutyAsync.ListMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMembersResult> listMembersAsync(ListMembersRequest listMembersRequest);

    /**
     * <p>
     * Lists details about all member accounts for the current GuardDuty administrator account.
     * </p>
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
     * <p>
     * Lists the accounts designated as GuardDuty delegated administrators. Only the organization's management account
     * can run this API operation.
     * </p>
     * 
     * @param listOrganizationAdminAccountsRequest
     * @return A Java Future containing the result of the ListOrganizationAdminAccounts operation returned by the
     *         service.
     * @sample AmazonGuardDutyAsync.ListOrganizationAdminAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListOrganizationAdminAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListOrganizationAdminAccountsResult> listOrganizationAdminAccountsAsync(
            ListOrganizationAdminAccountsRequest listOrganizationAdminAccountsRequest);

    /**
     * <p>
     * Lists the accounts designated as GuardDuty delegated administrators. Only the organization's management account
     * can run this API operation.
     * </p>
     * 
     * @param listOrganizationAdminAccountsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListOrganizationAdminAccounts operation returned by the
     *         service.
     * @sample AmazonGuardDutyAsyncHandler.ListOrganizationAdminAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListOrganizationAdminAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListOrganizationAdminAccountsResult> listOrganizationAdminAccountsAsync(
            ListOrganizationAdminAccountsRequest listOrganizationAdminAccountsRequest,
            com.amazonaws.handlers.AsyncHandler<ListOrganizationAdminAccountsRequest, ListOrganizationAdminAccountsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of publishing destinations associated with the specified <code>detectorId</code>.
     * </p>
     * 
     * @param listPublishingDestinationsRequest
     * @return A Java Future containing the result of the ListPublishingDestinations operation returned by the service.
     * @sample AmazonGuardDutyAsync.ListPublishingDestinations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListPublishingDestinations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPublishingDestinationsResult> listPublishingDestinationsAsync(
            ListPublishingDestinationsRequest listPublishingDestinationsRequest);

    /**
     * <p>
     * Returns a list of publishing destinations associated with the specified <code>detectorId</code>.
     * </p>
     * 
     * @param listPublishingDestinationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPublishingDestinations operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.ListPublishingDestinations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListPublishingDestinations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPublishingDestinationsResult> listPublishingDestinationsAsync(
            ListPublishingDestinationsRequest listPublishingDestinationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPublishingDestinationsRequest, ListPublishingDestinationsResult> asyncHandler);

    /**
     * <p>
     * Lists tags for a resource. Tagging is currently supported for detectors, finding filters, IP sets, threat intel
     * sets, and publishing destination, with a limit of 50 tags per resource. When invoked, this operation returns all
     * assigned tags for a given resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonGuardDutyAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists tags for a resource. Tagging is currently supported for detectors, finding filters, IP sets, threat intel
     * sets, and publishing destination, with a limit of 50 tags per resource. When invoked, this operation returns all
     * assigned tags for a given resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Lists the ThreatIntelSets of the GuardDuty service specified by the detector ID. If you use this operation from a
     * member account, the ThreatIntelSets associated with the administrator account are returned.
     * </p>
     * 
     * @param listThreatIntelSetsRequest
     * @return A Java Future containing the result of the ListThreatIntelSets operation returned by the service.
     * @sample AmazonGuardDutyAsync.ListThreatIntelSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ListThreatIntelSets" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListThreatIntelSetsResult> listThreatIntelSetsAsync(ListThreatIntelSetsRequest listThreatIntelSetsRequest);

    /**
     * <p>
     * Lists the ThreatIntelSets of the GuardDuty service specified by the detector ID. If you use this operation from a
     * member account, the ThreatIntelSets associated with the administrator account are returned.
     * </p>
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
     * @return A Java Future containing the result of the StartMalwareScan operation returned by the service.
     * @sample AmazonGuardDutyAsync.StartMalwareScan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/StartMalwareScan" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartMalwareScanResult> startMalwareScanAsync(StartMalwareScanRequest startMalwareScanRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartMalwareScan operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.StartMalwareScan
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/StartMalwareScan" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartMalwareScanResult> startMalwareScanAsync(StartMalwareScanRequest startMalwareScanRequest,
            com.amazonaws.handlers.AsyncHandler<StartMalwareScanRequest, StartMalwareScanResult> asyncHandler);

    /**
     * <p>
     * Turns on GuardDuty monitoring of the specified member accounts. Use this operation to restart monitoring of
     * accounts that you stopped monitoring with the <a
     * href="https://docs.aws.amazon.com/guardduty/latest/APIReference/API_StopMonitoringMembers.html"
     * >StopMonitoringMembers</a> operation.
     * </p>
     * 
     * @param startMonitoringMembersRequest
     * @return A Java Future containing the result of the StartMonitoringMembers operation returned by the service.
     * @sample AmazonGuardDutyAsync.StartMonitoringMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/StartMonitoringMembers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartMonitoringMembersResult> startMonitoringMembersAsync(StartMonitoringMembersRequest startMonitoringMembersRequest);

    /**
     * <p>
     * Turns on GuardDuty monitoring of the specified member accounts. Use this operation to restart monitoring of
     * accounts that you stopped monitoring with the <a
     * href="https://docs.aws.amazon.com/guardduty/latest/APIReference/API_StopMonitoringMembers.html"
     * >StopMonitoringMembers</a> operation.
     * </p>
     * 
     * @param startMonitoringMembersRequest
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
     * @return A Java Future containing the result of the StopMonitoringMembers operation returned by the service.
     * @sample AmazonGuardDutyAsync.StopMonitoringMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/StopMonitoringMembers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopMonitoringMembersResult> stopMonitoringMembersAsync(StopMonitoringMembersRequest stopMonitoringMembersRequest);

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
     * <p>
     * Adds tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonGuardDutyAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Unarchives GuardDuty findings specified by the <code>findingIds</code>.
     * </p>
     * 
     * @param unarchiveFindingsRequest
     * @return A Java Future containing the result of the UnarchiveFindings operation returned by the service.
     * @sample AmazonGuardDutyAsync.UnarchiveFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UnarchiveFindings" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UnarchiveFindingsResult> unarchiveFindingsAsync(UnarchiveFindingsRequest unarchiveFindingsRequest);

    /**
     * <p>
     * Unarchives GuardDuty findings specified by the <code>findingIds</code>.
     * </p>
     * 
     * @param unarchiveFindingsRequest
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
     * <p>
     * Removes tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonGuardDutyAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateDetector operation returned by the service.
     * @sample AmazonGuardDutyAsync.UpdateDetector
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateDetector" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateDetectorResult> updateDetectorAsync(UpdateDetectorRequest updateDetectorRequest);

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
     * <p>
     * Updates the filter specified by the filter name.
     * </p>
     * 
     * @param updateFilterRequest
     * @return A Java Future containing the result of the UpdateFilter operation returned by the service.
     * @sample AmazonGuardDutyAsync.UpdateFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateFilter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFilterResult> updateFilterAsync(UpdateFilterRequest updateFilterRequest);

    /**
     * <p>
     * Updates the filter specified by the filter name.
     * </p>
     * 
     * @param updateFilterRequest
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
     * <p>
     * Marks the specified GuardDuty findings as useful or not useful.
     * </p>
     * 
     * @param updateFindingsFeedbackRequest
     * @return A Java Future containing the result of the UpdateFindingsFeedback operation returned by the service.
     * @sample AmazonGuardDutyAsync.UpdateFindingsFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateFindingsFeedback"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFindingsFeedbackResult> updateFindingsFeedbackAsync(UpdateFindingsFeedbackRequest updateFindingsFeedbackRequest);

    /**
     * <p>
     * Marks the specified GuardDuty findings as useful or not useful.
     * </p>
     * 
     * @param updateFindingsFeedbackRequest
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
     * <p>
     * Updates the IPSet specified by the IPSet ID.
     * </p>
     * 
     * @param updateIPSetRequest
     * @return A Java Future containing the result of the UpdateIPSet operation returned by the service.
     * @sample AmazonGuardDutyAsync.UpdateIPSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateIPSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateIPSetResult> updateIPSetAsync(UpdateIPSetRequest updateIPSetRequest);

    /**
     * <p>
     * Updates the IPSet specified by the IPSet ID.
     * </p>
     * 
     * @param updateIPSetRequest
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
     * @return A Java Future containing the result of the UpdateMalwareScanSettings operation returned by the service.
     * @sample AmazonGuardDutyAsync.UpdateMalwareScanSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateMalwareScanSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMalwareScanSettingsResult> updateMalwareScanSettingsAsync(
            UpdateMalwareScanSettingsRequest updateMalwareScanSettingsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMalwareScanSettings operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.UpdateMalwareScanSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateMalwareScanSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMalwareScanSettingsResult> updateMalwareScanSettingsAsync(
            UpdateMalwareScanSettingsRequest updateMalwareScanSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMalwareScanSettingsRequest, UpdateMalwareScanSettingsResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateMemberDetectors operation returned by the service.
     * @sample AmazonGuardDutyAsync.UpdateMemberDetectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateMemberDetectors"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMemberDetectorsResult> updateMemberDetectorsAsync(UpdateMemberDetectorsRequest updateMemberDetectorsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMemberDetectors operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.UpdateMemberDetectors
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateMemberDetectors"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMemberDetectorsResult> updateMemberDetectorsAsync(UpdateMemberDetectorsRequest updateMemberDetectorsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMemberDetectorsRequest, UpdateMemberDetectorsResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateOrganizationConfiguration operation returned by the
     *         service.
     * @sample AmazonGuardDutyAsync.UpdateOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateOrganizationConfigurationResult> updateOrganizationConfigurationAsync(
            UpdateOrganizationConfigurationRequest updateOrganizationConfigurationRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateOrganizationConfiguration operation returned by the
     *         service.
     * @sample AmazonGuardDutyAsyncHandler.UpdateOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateOrganizationConfigurationResult> updateOrganizationConfigurationAsync(
            UpdateOrganizationConfigurationRequest updateOrganizationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateOrganizationConfigurationRequest, UpdateOrganizationConfigurationResult> asyncHandler);

    /**
     * <p>
     * Updates information about the publishing destination specified by the <code>destinationId</code>.
     * </p>
     * 
     * @param updatePublishingDestinationRequest
     * @return A Java Future containing the result of the UpdatePublishingDestination operation returned by the service.
     * @sample AmazonGuardDutyAsync.UpdatePublishingDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdatePublishingDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePublishingDestinationResult> updatePublishingDestinationAsync(
            UpdatePublishingDestinationRequest updatePublishingDestinationRequest);

    /**
     * <p>
     * Updates information about the publishing destination specified by the <code>destinationId</code>.
     * </p>
     * 
     * @param updatePublishingDestinationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePublishingDestination operation returned by the service.
     * @sample AmazonGuardDutyAsyncHandler.UpdatePublishingDestination
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdatePublishingDestination"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePublishingDestinationResult> updatePublishingDestinationAsync(
            UpdatePublishingDestinationRequest updatePublishingDestinationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePublishingDestinationRequest, UpdatePublishingDestinationResult> asyncHandler);

    /**
     * <p>
     * Updates the ThreatIntelSet specified by the ThreatIntelSet ID.
     * </p>
     * 
     * @param updateThreatIntelSetRequest
     * @return A Java Future containing the result of the UpdateThreatIntelSet operation returned by the service.
     * @sample AmazonGuardDutyAsync.UpdateThreatIntelSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/UpdateThreatIntelSet" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateThreatIntelSetResult> updateThreatIntelSetAsync(UpdateThreatIntelSetRequest updateThreatIntelSetRequest);

    /**
     * <p>
     * Updates the ThreatIntelSet specified by the ThreatIntelSet ID.
     * </p>
     * 
     * @param updateThreatIntelSetRequest
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
