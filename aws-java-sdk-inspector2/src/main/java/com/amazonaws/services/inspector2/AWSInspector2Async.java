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
package com.amazonaws.services.inspector2;

import javax.annotation.Generated;

import com.amazonaws.services.inspector2.model.*;

/**
 * Interface for accessing Inspector2 asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.inspector2.AbstractAWSInspector2Async} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Inspector is a vulnerability discovery service that automates continuous scanning for security vulnerabilities
 * within your Amazon EC2 and Amazon ECR environments.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSInspector2Async extends AWSInspector2 {

    /**
     * <p>
     * Associates an Amazon Web Services account with an Amazon Inspector delegated administrator.
     * </p>
     * 
     * @param associateMemberRequest
     * @return A Java Future containing the result of the AssociateMember operation returned by the service.
     * @sample AWSInspector2Async.AssociateMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/AssociateMember" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateMemberResult> associateMemberAsync(AssociateMemberRequest associateMemberRequest);

    /**
     * <p>
     * Associates an Amazon Web Services account with an Amazon Inspector delegated administrator.
     * </p>
     * 
     * @param associateMemberRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateMember operation returned by the service.
     * @sample AWSInspector2AsyncHandler.AssociateMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/AssociateMember" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateMemberResult> associateMemberAsync(AssociateMemberRequest associateMemberRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateMemberRequest, AssociateMemberResult> asyncHandler);

    /**
     * <p>
     * Retrieves the Amazon Inspector status of multiple Amazon Web Services accounts within your environment.
     * </p>
     * 
     * @param batchGetAccountStatusRequest
     * @return A Java Future containing the result of the BatchGetAccountStatus operation returned by the service.
     * @sample AWSInspector2Async.BatchGetAccountStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/BatchGetAccountStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetAccountStatusResult> batchGetAccountStatusAsync(BatchGetAccountStatusRequest batchGetAccountStatusRequest);

    /**
     * <p>
     * Retrieves the Amazon Inspector status of multiple Amazon Web Services accounts within your environment.
     * </p>
     * 
     * @param batchGetAccountStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetAccountStatus operation returned by the service.
     * @sample AWSInspector2AsyncHandler.BatchGetAccountStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/BatchGetAccountStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetAccountStatusResult> batchGetAccountStatusAsync(BatchGetAccountStatusRequest batchGetAccountStatusRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetAccountStatusRequest, BatchGetAccountStatusResult> asyncHandler);

    /**
     * <p>
     * Gets free trial status for multiple Amazon Web Services accounts.
     * </p>
     * 
     * @param batchGetFreeTrialInfoRequest
     * @return A Java Future containing the result of the BatchGetFreeTrialInfo operation returned by the service.
     * @sample AWSInspector2Async.BatchGetFreeTrialInfo
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/BatchGetFreeTrialInfo"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetFreeTrialInfoResult> batchGetFreeTrialInfoAsync(BatchGetFreeTrialInfoRequest batchGetFreeTrialInfoRequest);

    /**
     * <p>
     * Gets free trial status for multiple Amazon Web Services accounts.
     * </p>
     * 
     * @param batchGetFreeTrialInfoRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetFreeTrialInfo operation returned by the service.
     * @sample AWSInspector2AsyncHandler.BatchGetFreeTrialInfo
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/BatchGetFreeTrialInfo"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetFreeTrialInfoResult> batchGetFreeTrialInfoAsync(BatchGetFreeTrialInfoRequest batchGetFreeTrialInfoRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetFreeTrialInfoRequest, BatchGetFreeTrialInfoResult> asyncHandler);

    /**
     * <p>
     * Cancels the given findings report.
     * </p>
     * 
     * @param cancelFindingsReportRequest
     * @return A Java Future containing the result of the CancelFindingsReport operation returned by the service.
     * @sample AWSInspector2Async.CancelFindingsReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/CancelFindingsReport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelFindingsReportResult> cancelFindingsReportAsync(CancelFindingsReportRequest cancelFindingsReportRequest);

    /**
     * <p>
     * Cancels the given findings report.
     * </p>
     * 
     * @param cancelFindingsReportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelFindingsReport operation returned by the service.
     * @sample AWSInspector2AsyncHandler.CancelFindingsReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/CancelFindingsReport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelFindingsReportResult> cancelFindingsReportAsync(CancelFindingsReportRequest cancelFindingsReportRequest,
            com.amazonaws.handlers.AsyncHandler<CancelFindingsReportRequest, CancelFindingsReportResult> asyncHandler);

    /**
     * <p>
     * Creates a filter resource using specified filter criteria.
     * </p>
     * 
     * @param createFilterRequest
     * @return A Java Future containing the result of the CreateFilter operation returned by the service.
     * @sample AWSInspector2Async.CreateFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/CreateFilter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFilterResult> createFilterAsync(CreateFilterRequest createFilterRequest);

    /**
     * <p>
     * Creates a filter resource using specified filter criteria.
     * </p>
     * 
     * @param createFilterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFilter operation returned by the service.
     * @sample AWSInspector2AsyncHandler.CreateFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/CreateFilter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFilterResult> createFilterAsync(CreateFilterRequest createFilterRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFilterRequest, CreateFilterResult> asyncHandler);

    /**
     * <p>
     * Creates a finding report.
     * </p>
     * 
     * @param createFindingsReportRequest
     * @return A Java Future containing the result of the CreateFindingsReport operation returned by the service.
     * @sample AWSInspector2Async.CreateFindingsReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/CreateFindingsReport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateFindingsReportResult> createFindingsReportAsync(CreateFindingsReportRequest createFindingsReportRequest);

    /**
     * <p>
     * Creates a finding report.
     * </p>
     * 
     * @param createFindingsReportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFindingsReport operation returned by the service.
     * @sample AWSInspector2AsyncHandler.CreateFindingsReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/CreateFindingsReport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateFindingsReportResult> createFindingsReportAsync(CreateFindingsReportRequest createFindingsReportRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFindingsReportRequest, CreateFindingsReportResult> asyncHandler);

    /**
     * <p>
     * Deletes a filter resource.
     * </p>
     * 
     * @param deleteFilterRequest
     * @return A Java Future containing the result of the DeleteFilter operation returned by the service.
     * @sample AWSInspector2Async.DeleteFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/DeleteFilter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFilterResult> deleteFilterAsync(DeleteFilterRequest deleteFilterRequest);

    /**
     * <p>
     * Deletes a filter resource.
     * </p>
     * 
     * @param deleteFilterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFilter operation returned by the service.
     * @sample AWSInspector2AsyncHandler.DeleteFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/DeleteFilter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFilterResult> deleteFilterAsync(DeleteFilterRequest deleteFilterRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFilterRequest, DeleteFilterResult> asyncHandler);

    /**
     * <p>
     * Describe Amazon Inspector configuration settings for an Amazon Web Services organization.
     * </p>
     * 
     * @param describeOrganizationConfigurationRequest
     * @return A Java Future containing the result of the DescribeOrganizationConfiguration operation returned by the
     *         service.
     * @sample AWSInspector2Async.DescribeOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/DescribeOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOrganizationConfigurationResult> describeOrganizationConfigurationAsync(
            DescribeOrganizationConfigurationRequest describeOrganizationConfigurationRequest);

    /**
     * <p>
     * Describe Amazon Inspector configuration settings for an Amazon Web Services organization.
     * </p>
     * 
     * @param describeOrganizationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeOrganizationConfiguration operation returned by the
     *         service.
     * @sample AWSInspector2AsyncHandler.DescribeOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/DescribeOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOrganizationConfigurationResult> describeOrganizationConfigurationAsync(
            DescribeOrganizationConfigurationRequest describeOrganizationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeOrganizationConfigurationRequest, DescribeOrganizationConfigurationResult> asyncHandler);

    /**
     * <p>
     * Disables Amazon Inspector scans for one or more Amazon Web Services accounts. Disabling all scan types in an
     * account disables the Amazon Inspector service.
     * </p>
     * 
     * @param disableRequest
     * @return A Java Future containing the result of the Disable operation returned by the service.
     * @sample AWSInspector2Async.Disable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/Disable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisableResult> disableAsync(DisableRequest disableRequest);

    /**
     * <p>
     * Disables Amazon Inspector scans for one or more Amazon Web Services accounts. Disabling all scan types in an
     * account disables the Amazon Inspector service.
     * </p>
     * 
     * @param disableRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the Disable operation returned by the service.
     * @sample AWSInspector2AsyncHandler.Disable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/Disable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisableResult> disableAsync(DisableRequest disableRequest,
            com.amazonaws.handlers.AsyncHandler<DisableRequest, DisableResult> asyncHandler);

    /**
     * <p>
     * Disables the Amazon Inspector delegated administrator for your organization.
     * </p>
     * 
     * @param disableDelegatedAdminAccountRequest
     * @return A Java Future containing the result of the DisableDelegatedAdminAccount operation returned by the
     *         service.
     * @sample AWSInspector2Async.DisableDelegatedAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/DisableDelegatedAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableDelegatedAdminAccountResult> disableDelegatedAdminAccountAsync(
            DisableDelegatedAdminAccountRequest disableDelegatedAdminAccountRequest);

    /**
     * <p>
     * Disables the Amazon Inspector delegated administrator for your organization.
     * </p>
     * 
     * @param disableDelegatedAdminAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableDelegatedAdminAccount operation returned by the
     *         service.
     * @sample AWSInspector2AsyncHandler.DisableDelegatedAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/DisableDelegatedAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableDelegatedAdminAccountResult> disableDelegatedAdminAccountAsync(
            DisableDelegatedAdminAccountRequest disableDelegatedAdminAccountRequest,
            com.amazonaws.handlers.AsyncHandler<DisableDelegatedAdminAccountRequest, DisableDelegatedAdminAccountResult> asyncHandler);

    /**
     * <p>
     * Disassociates a member account from an Amazon Inspector delegated administrator.
     * </p>
     * 
     * @param disassociateMemberRequest
     * @return A Java Future containing the result of the DisassociateMember operation returned by the service.
     * @sample AWSInspector2Async.DisassociateMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/DisassociateMember" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateMemberResult> disassociateMemberAsync(DisassociateMemberRequest disassociateMemberRequest);

    /**
     * <p>
     * Disassociates a member account from an Amazon Inspector delegated administrator.
     * </p>
     * 
     * @param disassociateMemberRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateMember operation returned by the service.
     * @sample AWSInspector2AsyncHandler.DisassociateMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/DisassociateMember" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateMemberResult> disassociateMemberAsync(DisassociateMemberRequest disassociateMemberRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateMemberRequest, DisassociateMemberResult> asyncHandler);

    /**
     * <p>
     * Enables Amazon Inspector scans for one or more Amazon Web Services accounts.
     * </p>
     * 
     * @param enableRequest
     * @return A Java Future containing the result of the Enable operation returned by the service.
     * @sample AWSInspector2Async.Enable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/Enable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EnableResult> enableAsync(EnableRequest enableRequest);

    /**
     * <p>
     * Enables Amazon Inspector scans for one or more Amazon Web Services accounts.
     * </p>
     * 
     * @param enableRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the Enable operation returned by the service.
     * @sample AWSInspector2AsyncHandler.Enable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/Enable" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EnableResult> enableAsync(EnableRequest enableRequest,
            com.amazonaws.handlers.AsyncHandler<EnableRequest, EnableResult> asyncHandler);

    /**
     * <p>
     * Enables the Amazon Inspector delegated administrator for your Organizations organization.
     * </p>
     * 
     * @param enableDelegatedAdminAccountRequest
     * @return A Java Future containing the result of the EnableDelegatedAdminAccount operation returned by the service.
     * @sample AWSInspector2Async.EnableDelegatedAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/EnableDelegatedAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableDelegatedAdminAccountResult> enableDelegatedAdminAccountAsync(
            EnableDelegatedAdminAccountRequest enableDelegatedAdminAccountRequest);

    /**
     * <p>
     * Enables the Amazon Inspector delegated administrator for your Organizations organization.
     * </p>
     * 
     * @param enableDelegatedAdminAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableDelegatedAdminAccount operation returned by the service.
     * @sample AWSInspector2AsyncHandler.EnableDelegatedAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/EnableDelegatedAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableDelegatedAdminAccountResult> enableDelegatedAdminAccountAsync(
            EnableDelegatedAdminAccountRequest enableDelegatedAdminAccountRequest,
            com.amazonaws.handlers.AsyncHandler<EnableDelegatedAdminAccountRequest, EnableDelegatedAdminAccountResult> asyncHandler);

    /**
     * <p>
     * Retrieves setting configurations for Inspector scans.
     * </p>
     * 
     * @param getConfigurationRequest
     * @return A Java Future containing the result of the GetConfiguration operation returned by the service.
     * @sample AWSInspector2Async.GetConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/GetConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetConfigurationResult> getConfigurationAsync(GetConfigurationRequest getConfigurationRequest);

    /**
     * <p>
     * Retrieves setting configurations for Inspector scans.
     * </p>
     * 
     * @param getConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetConfiguration operation returned by the service.
     * @sample AWSInspector2AsyncHandler.GetConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/GetConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetConfigurationResult> getConfigurationAsync(GetConfigurationRequest getConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetConfigurationRequest, GetConfigurationResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the Amazon Inspector delegated administrator for your organization.
     * </p>
     * 
     * @param getDelegatedAdminAccountRequest
     * @return A Java Future containing the result of the GetDelegatedAdminAccount operation returned by the service.
     * @sample AWSInspector2Async.GetDelegatedAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/GetDelegatedAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDelegatedAdminAccountResult> getDelegatedAdminAccountAsync(GetDelegatedAdminAccountRequest getDelegatedAdminAccountRequest);

    /**
     * <p>
     * Retrieves information about the Amazon Inspector delegated administrator for your organization.
     * </p>
     * 
     * @param getDelegatedAdminAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDelegatedAdminAccount operation returned by the service.
     * @sample AWSInspector2AsyncHandler.GetDelegatedAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/GetDelegatedAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDelegatedAdminAccountResult> getDelegatedAdminAccountAsync(GetDelegatedAdminAccountRequest getDelegatedAdminAccountRequest,
            com.amazonaws.handlers.AsyncHandler<GetDelegatedAdminAccountRequest, GetDelegatedAdminAccountResult> asyncHandler);

    /**
     * <p>
     * Gets the status of a findings report.
     * </p>
     * 
     * @param getFindingsReportStatusRequest
     * @return A Java Future containing the result of the GetFindingsReportStatus operation returned by the service.
     * @sample AWSInspector2Async.GetFindingsReportStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/GetFindingsReportStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFindingsReportStatusResult> getFindingsReportStatusAsync(GetFindingsReportStatusRequest getFindingsReportStatusRequest);

    /**
     * <p>
     * Gets the status of a findings report.
     * </p>
     * 
     * @param getFindingsReportStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFindingsReportStatus operation returned by the service.
     * @sample AWSInspector2AsyncHandler.GetFindingsReportStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/GetFindingsReportStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFindingsReportStatusResult> getFindingsReportStatusAsync(GetFindingsReportStatusRequest getFindingsReportStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetFindingsReportStatusRequest, GetFindingsReportStatusResult> asyncHandler);

    /**
     * <p>
     * Gets member information for your organization.
     * </p>
     * 
     * @param getMemberRequest
     * @return A Java Future containing the result of the GetMember operation returned by the service.
     * @sample AWSInspector2Async.GetMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/GetMember" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMemberResult> getMemberAsync(GetMemberRequest getMemberRequest);

    /**
     * <p>
     * Gets member information for your organization.
     * </p>
     * 
     * @param getMemberRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMember operation returned by the service.
     * @sample AWSInspector2AsyncHandler.GetMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/GetMember" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMemberResult> getMemberAsync(GetMemberRequest getMemberRequest,
            com.amazonaws.handlers.AsyncHandler<GetMemberRequest, GetMemberResult> asyncHandler);

    /**
     * <p>
     * Lists the permissions an account has to configure Amazon Inspector.
     * </p>
     * 
     * @param listAccountPermissionsRequest
     * @return A Java Future containing the result of the ListAccountPermissions operation returned by the service.
     * @sample AWSInspector2Async.ListAccountPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListAccountPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAccountPermissionsResult> listAccountPermissionsAsync(ListAccountPermissionsRequest listAccountPermissionsRequest);

    /**
     * <p>
     * Lists the permissions an account has to configure Amazon Inspector.
     * </p>
     * 
     * @param listAccountPermissionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAccountPermissions operation returned by the service.
     * @sample AWSInspector2AsyncHandler.ListAccountPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListAccountPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAccountPermissionsResult> listAccountPermissionsAsync(ListAccountPermissionsRequest listAccountPermissionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAccountPermissionsRequest, ListAccountPermissionsResult> asyncHandler);

    /**
     * <p>
     * Lists coverage details for you environment.
     * </p>
     * 
     * @param listCoverageRequest
     * @return A Java Future containing the result of the ListCoverage operation returned by the service.
     * @sample AWSInspector2Async.ListCoverage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListCoverage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListCoverageResult> listCoverageAsync(ListCoverageRequest listCoverageRequest);

    /**
     * <p>
     * Lists coverage details for you environment.
     * </p>
     * 
     * @param listCoverageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCoverage operation returned by the service.
     * @sample AWSInspector2AsyncHandler.ListCoverage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListCoverage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListCoverageResult> listCoverageAsync(ListCoverageRequest listCoverageRequest,
            com.amazonaws.handlers.AsyncHandler<ListCoverageRequest, ListCoverageResult> asyncHandler);

    /**
     * <p>
     * Lists Amazon Inspector coverage statistics for your environment.
     * </p>
     * 
     * @param listCoverageStatisticsRequest
     * @return A Java Future containing the result of the ListCoverageStatistics operation returned by the service.
     * @sample AWSInspector2Async.ListCoverageStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListCoverageStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCoverageStatisticsResult> listCoverageStatisticsAsync(ListCoverageStatisticsRequest listCoverageStatisticsRequest);

    /**
     * <p>
     * Lists Amazon Inspector coverage statistics for your environment.
     * </p>
     * 
     * @param listCoverageStatisticsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCoverageStatistics operation returned by the service.
     * @sample AWSInspector2AsyncHandler.ListCoverageStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListCoverageStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListCoverageStatisticsResult> listCoverageStatisticsAsync(ListCoverageStatisticsRequest listCoverageStatisticsRequest,
            com.amazonaws.handlers.AsyncHandler<ListCoverageStatisticsRequest, ListCoverageStatisticsResult> asyncHandler);

    /**
     * <p>
     * Lists information about the Amazon Inspector delegated administrator of your organization.
     * </p>
     * 
     * @param listDelegatedAdminAccountsRequest
     * @return A Java Future containing the result of the ListDelegatedAdminAccounts operation returned by the service.
     * @sample AWSInspector2Async.ListDelegatedAdminAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListDelegatedAdminAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDelegatedAdminAccountsResult> listDelegatedAdminAccountsAsync(
            ListDelegatedAdminAccountsRequest listDelegatedAdminAccountsRequest);

    /**
     * <p>
     * Lists information about the Amazon Inspector delegated administrator of your organization.
     * </p>
     * 
     * @param listDelegatedAdminAccountsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDelegatedAdminAccounts operation returned by the service.
     * @sample AWSInspector2AsyncHandler.ListDelegatedAdminAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListDelegatedAdminAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDelegatedAdminAccountsResult> listDelegatedAdminAccountsAsync(
            ListDelegatedAdminAccountsRequest listDelegatedAdminAccountsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDelegatedAdminAccountsRequest, ListDelegatedAdminAccountsResult> asyncHandler);

    /**
     * <p>
     * Lists the filters associated with your account.
     * </p>
     * 
     * @param listFiltersRequest
     * @return A Java Future containing the result of the ListFilters operation returned by the service.
     * @sample AWSInspector2Async.ListFilters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListFilters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFiltersResult> listFiltersAsync(ListFiltersRequest listFiltersRequest);

    /**
     * <p>
     * Lists the filters associated with your account.
     * </p>
     * 
     * @param listFiltersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFilters operation returned by the service.
     * @sample AWSInspector2AsyncHandler.ListFilters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListFilters" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFiltersResult> listFiltersAsync(ListFiltersRequest listFiltersRequest,
            com.amazonaws.handlers.AsyncHandler<ListFiltersRequest, ListFiltersResult> asyncHandler);

    /**
     * <p>
     * Lists aggregated finding data for your environment based on specific criteria.
     * </p>
     * 
     * @param listFindingAggregationsRequest
     * @return A Java Future containing the result of the ListFindingAggregations operation returned by the service.
     * @sample AWSInspector2Async.ListFindingAggregations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListFindingAggregations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFindingAggregationsResult> listFindingAggregationsAsync(ListFindingAggregationsRequest listFindingAggregationsRequest);

    /**
     * <p>
     * Lists aggregated finding data for your environment based on specific criteria.
     * </p>
     * 
     * @param listFindingAggregationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFindingAggregations operation returned by the service.
     * @sample AWSInspector2AsyncHandler.ListFindingAggregations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListFindingAggregations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFindingAggregationsResult> listFindingAggregationsAsync(ListFindingAggregationsRequest listFindingAggregationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFindingAggregationsRequest, ListFindingAggregationsResult> asyncHandler);

    /**
     * <p>
     * Lists findings for your environment.
     * </p>
     * 
     * @param listFindingsRequest
     * @return A Java Future containing the result of the ListFindings operation returned by the service.
     * @sample AWSInspector2Async.ListFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListFindings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFindingsResult> listFindingsAsync(ListFindingsRequest listFindingsRequest);

    /**
     * <p>
     * Lists findings for your environment.
     * </p>
     * 
     * @param listFindingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFindings operation returned by the service.
     * @sample AWSInspector2AsyncHandler.ListFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListFindings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFindingsResult> listFindingsAsync(ListFindingsRequest listFindingsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFindingsRequest, ListFindingsResult> asyncHandler);

    /**
     * <p>
     * List members associated with the Amazon Inspector delegated administrator for your organization.
     * </p>
     * 
     * @param listMembersRequest
     * @return A Java Future containing the result of the ListMembers operation returned by the service.
     * @sample AWSInspector2Async.ListMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMembersResult> listMembersAsync(ListMembersRequest listMembersRequest);

    /**
     * <p>
     * List members associated with the Amazon Inspector delegated administrator for your organization.
     * </p>
     * 
     * @param listMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMembers operation returned by the service.
     * @sample AWSInspector2AsyncHandler.ListMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMembersResult> listMembersAsync(ListMembersRequest listMembersRequest,
            com.amazonaws.handlers.AsyncHandler<ListMembersRequest, ListMembersResult> asyncHandler);

    /**
     * <p>
     * Lists all tags attached to a given resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSInspector2Async.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists all tags attached to a given resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSInspector2AsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Lists the Amazon Inspector usage totals over the last 30 days.
     * </p>
     * 
     * @param listUsageTotalsRequest
     * @return A Java Future containing the result of the ListUsageTotals operation returned by the service.
     * @sample AWSInspector2Async.ListUsageTotals
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListUsageTotals" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListUsageTotalsResult> listUsageTotalsAsync(ListUsageTotalsRequest listUsageTotalsRequest);

    /**
     * <p>
     * Lists the Amazon Inspector usage totals over the last 30 days.
     * </p>
     * 
     * @param listUsageTotalsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListUsageTotals operation returned by the service.
     * @sample AWSInspector2AsyncHandler.ListUsageTotals
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListUsageTotals" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListUsageTotalsResult> listUsageTotalsAsync(ListUsageTotalsRequest listUsageTotalsRequest,
            com.amazonaws.handlers.AsyncHandler<ListUsageTotalsRequest, ListUsageTotalsResult> asyncHandler);

    /**
     * <p>
     * Adds tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSInspector2Async.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/TagResource" target="_top">AWS API
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
     * @sample AWSInspector2AsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSInspector2Async.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/UntagResource" target="_top">AWS API
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
     * @sample AWSInspector2AsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates setting configurations for your Amazon Inspector account. When you use this API as an Amazon Inspector
     * delegated administrator this updates the setting for all accounts you manage. Member accounts in an organization
     * cannot update this setting.
     * </p>
     * 
     * @param updateConfigurationRequest
     * @return A Java Future containing the result of the UpdateConfiguration operation returned by the service.
     * @sample AWSInspector2Async.UpdateConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/UpdateConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConfigurationResult> updateConfigurationAsync(UpdateConfigurationRequest updateConfigurationRequest);

    /**
     * <p>
     * Updates setting configurations for your Amazon Inspector account. When you use this API as an Amazon Inspector
     * delegated administrator this updates the setting for all accounts you manage. Member accounts in an organization
     * cannot update this setting.
     * </p>
     * 
     * @param updateConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateConfiguration operation returned by the service.
     * @sample AWSInspector2AsyncHandler.UpdateConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/UpdateConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConfigurationResult> updateConfigurationAsync(UpdateConfigurationRequest updateConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateConfigurationRequest, UpdateConfigurationResult> asyncHandler);

    /**
     * <p>
     * Specifies the action that is to be applied to the findings that match the filter.
     * </p>
     * 
     * @param updateFilterRequest
     * @return A Java Future containing the result of the UpdateFilter operation returned by the service.
     * @sample AWSInspector2Async.UpdateFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/UpdateFilter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFilterResult> updateFilterAsync(UpdateFilterRequest updateFilterRequest);

    /**
     * <p>
     * Specifies the action that is to be applied to the findings that match the filter.
     * </p>
     * 
     * @param updateFilterRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFilter operation returned by the service.
     * @sample AWSInspector2AsyncHandler.UpdateFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/UpdateFilter" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFilterResult> updateFilterAsync(UpdateFilterRequest updateFilterRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFilterRequest, UpdateFilterResult> asyncHandler);

    /**
     * <p>
     * Updates the configurations for your Amazon Inspector organization.
     * </p>
     * 
     * @param updateOrganizationConfigurationRequest
     * @return A Java Future containing the result of the UpdateOrganizationConfiguration operation returned by the
     *         service.
     * @sample AWSInspector2Async.UpdateOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/UpdateOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateOrganizationConfigurationResult> updateOrganizationConfigurationAsync(
            UpdateOrganizationConfigurationRequest updateOrganizationConfigurationRequest);

    /**
     * <p>
     * Updates the configurations for your Amazon Inspector organization.
     * </p>
     * 
     * @param updateOrganizationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateOrganizationConfiguration operation returned by the
     *         service.
     * @sample AWSInspector2AsyncHandler.UpdateOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/UpdateOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateOrganizationConfigurationResult> updateOrganizationConfigurationAsync(
            UpdateOrganizationConfigurationRequest updateOrganizationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateOrganizationConfigurationRequest, UpdateOrganizationConfigurationResult> asyncHandler);

}
