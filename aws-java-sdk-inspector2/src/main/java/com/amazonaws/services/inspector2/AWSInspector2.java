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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.inspector2.model.*;

/**
 * Interface for accessing Inspector2.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.inspector2.AbstractAWSInspector2} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Inspector is a vulnerability discovery service that automates continuous scanning for security vulnerabilities
 * within your Amazon EC2 and Amazon ECR environments.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSInspector2 {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "inspector2";

    /**
     * <p>
     * Associates an Amazon Web Services account with an Amazon Inspector delegated administrator.
     * </p>
     * 
     * @param associateMemberRequest
     * @return Result of the AssociateMember operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.AssociateMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/AssociateMember" target="_top">AWS API
     *      Documentation</a>
     */
    AssociateMemberResult associateMember(AssociateMemberRequest associateMemberRequest);

    /**
     * <p>
     * Retrieves the Amazon Inspector status of multiple Amazon Web Services accounts within your environment.
     * </p>
     * 
     * @param batchGetAccountStatusRequest
     * @return Result of the BatchGetAccountStatus operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access an invalid resource. Make sure the resource is specified correctly.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.BatchGetAccountStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/BatchGetAccountStatus"
     *      target="_top">AWS API Documentation</a>
     */
    BatchGetAccountStatusResult batchGetAccountStatus(BatchGetAccountStatusRequest batchGetAccountStatusRequest);

    /**
     * <p>
     * Gets free trial status for multiple Amazon Web Services accounts.
     * </p>
     * 
     * @param batchGetFreeTrialInfoRequest
     * @return Result of the BatchGetFreeTrialInfo operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.BatchGetFreeTrialInfo
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/BatchGetFreeTrialInfo"
     *      target="_top">AWS API Documentation</a>
     */
    BatchGetFreeTrialInfoResult batchGetFreeTrialInfo(BatchGetFreeTrialInfoRequest batchGetFreeTrialInfoRequest);

    /**
     * <p>
     * Cancels the given findings report.
     * </p>
     * 
     * @param cancelFindingsReportRequest
     * @return Result of the CancelFindingsReport operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access an invalid resource. Make sure the resource is specified correctly.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.CancelFindingsReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/CancelFindingsReport"
     *      target="_top">AWS API Documentation</a>
     */
    CancelFindingsReportResult cancelFindingsReport(CancelFindingsReportRequest cancelFindingsReportRequest);

    /**
     * <p>
     * Creates a filter resource using specified filter criteria.
     * </p>
     * 
     * @param createFilterRequest
     * @return Result of the CreateFilter operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         You have exceeded your service quota. To perform the requested action, remove some of the relevant
     *         resources, or use Service Quotas to request a service quota increase.
     * @throws BadRequestException
     *         One or more tags submitted as part of the request is not valid.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.CreateFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/CreateFilter" target="_top">AWS API
     *      Documentation</a>
     */
    CreateFilterResult createFilter(CreateFilterRequest createFilterRequest);

    /**
     * <p>
     * Creates a finding report.
     * </p>
     * 
     * @param createFindingsReportRequest
     * @return Result of the CreateFindingsReport operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access an invalid resource. Make sure the resource is specified correctly.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.CreateFindingsReport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/CreateFindingsReport"
     *      target="_top">AWS API Documentation</a>
     */
    CreateFindingsReportResult createFindingsReport(CreateFindingsReportRequest createFindingsReportRequest);

    /**
     * <p>
     * Deletes a filter resource.
     * </p>
     * 
     * @param deleteFilterRequest
     * @return Result of the DeleteFilter operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access an invalid resource. Make sure the resource is specified correctly.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.DeleteFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/DeleteFilter" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteFilterResult deleteFilter(DeleteFilterRequest deleteFilterRequest);

    /**
     * <p>
     * Describe Amazon Inspector configuration settings for an Amazon Web Services organization.
     * </p>
     * 
     * @param describeOrganizationConfigurationRequest
     * @return Result of the DescribeOrganizationConfiguration operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.DescribeOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/DescribeOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeOrganizationConfigurationResult describeOrganizationConfiguration(DescribeOrganizationConfigurationRequest describeOrganizationConfigurationRequest);

    /**
     * <p>
     * Disables Amazon Inspector scans for one or more Amazon Web Services accounts. Disabling all scan types in an
     * account disables the Amazon Inspector service.
     * </p>
     * 
     * @param disableRequest
     * @return Result of the Disable operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access an invalid resource. Make sure the resource is specified correctly.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.Disable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/Disable" target="_top">AWS API
     *      Documentation</a>
     */
    DisableResult disable(DisableRequest disableRequest);

    /**
     * <p>
     * Disables the Amazon Inspector delegated administrator for your organization.
     * </p>
     * 
     * @param disableDelegatedAdminAccountRequest
     * @return Result of the DisableDelegatedAdminAccount operation returned by the service.
     * @throws ConflictException
     *         A conflict occurred.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access an invalid resource. Make sure the resource is specified correctly.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.DisableDelegatedAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/DisableDelegatedAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    DisableDelegatedAdminAccountResult disableDelegatedAdminAccount(DisableDelegatedAdminAccountRequest disableDelegatedAdminAccountRequest);

    /**
     * <p>
     * Disassociates a member account from an Amazon Inspector delegated administrator.
     * </p>
     * 
     * @param disassociateMemberRequest
     * @return Result of the DisassociateMember operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.DisassociateMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/DisassociateMember" target="_top">AWS
     *      API Documentation</a>
     */
    DisassociateMemberResult disassociateMember(DisassociateMemberRequest disassociateMemberRequest);

    /**
     * <p>
     * Enables Amazon Inspector scans for one or more Amazon Web Services accounts.
     * </p>
     * 
     * @param enableRequest
     * @return Result of the Enable operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access an invalid resource. Make sure the resource is specified correctly.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.Enable
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/Enable" target="_top">AWS API
     *      Documentation</a>
     */
    EnableResult enable(EnableRequest enableRequest);

    /**
     * <p>
     * Enables the Amazon Inspector delegated administrator for your Organizations organization.
     * </p>
     * 
     * @param enableDelegatedAdminAccountRequest
     * @return Result of the EnableDelegatedAdminAccount operation returned by the service.
     * @throws ConflictException
     *         A conflict occurred.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access an invalid resource. Make sure the resource is specified correctly.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.EnableDelegatedAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/EnableDelegatedAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    EnableDelegatedAdminAccountResult enableDelegatedAdminAccount(EnableDelegatedAdminAccountRequest enableDelegatedAdminAccountRequest);

    /**
     * <p>
     * Retrieves setting configurations for Inspector scans.
     * </p>
     * 
     * @param getConfigurationRequest
     * @return Result of the GetConfiguration operation returned by the service.
     * @throws ResourceNotFoundException
     *         The operation tried to access an invalid resource. Make sure the resource is specified correctly.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.GetConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/GetConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    GetConfigurationResult getConfiguration(GetConfigurationRequest getConfigurationRequest);

    /**
     * <p>
     * Retrieves information about the Amazon Inspector delegated administrator for your organization.
     * </p>
     * 
     * @param getDelegatedAdminAccountRequest
     * @return Result of the GetDelegatedAdminAccount operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws ResourceNotFoundException
     *         The operation tried to access an invalid resource. Make sure the resource is specified correctly.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.GetDelegatedAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/GetDelegatedAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    GetDelegatedAdminAccountResult getDelegatedAdminAccount(GetDelegatedAdminAccountRequest getDelegatedAdminAccountRequest);

    /**
     * <p>
     * Gets the status of a findings report.
     * </p>
     * 
     * @param getFindingsReportStatusRequest
     * @return Result of the GetFindingsReportStatus operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access an invalid resource. Make sure the resource is specified correctly.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.GetFindingsReportStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/GetFindingsReportStatus"
     *      target="_top">AWS API Documentation</a>
     */
    GetFindingsReportStatusResult getFindingsReportStatus(GetFindingsReportStatusRequest getFindingsReportStatusRequest);

    /**
     * <p>
     * Gets member information for your organization.
     * </p>
     * 
     * @param getMemberRequest
     * @return Result of the GetMember operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access an invalid resource. Make sure the resource is specified correctly.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.GetMember
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/GetMember" target="_top">AWS API
     *      Documentation</a>
     */
    GetMemberResult getMember(GetMemberRequest getMemberRequest);

    /**
     * <p>
     * Lists the permissions an account has to configure Amazon Inspector.
     * </p>
     * 
     * @param listAccountPermissionsRequest
     * @return Result of the ListAccountPermissions operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.ListAccountPermissions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListAccountPermissions"
     *      target="_top">AWS API Documentation</a>
     */
    ListAccountPermissionsResult listAccountPermissions(ListAccountPermissionsRequest listAccountPermissionsRequest);

    /**
     * <p>
     * Lists coverage details for you environment.
     * </p>
     * 
     * @param listCoverageRequest
     * @return Result of the ListCoverage operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.ListCoverage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListCoverage" target="_top">AWS API
     *      Documentation</a>
     */
    ListCoverageResult listCoverage(ListCoverageRequest listCoverageRequest);

    /**
     * <p>
     * Lists Amazon Inspector coverage statistics for your environment.
     * </p>
     * 
     * @param listCoverageStatisticsRequest
     * @return Result of the ListCoverageStatistics operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.ListCoverageStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListCoverageStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    ListCoverageStatisticsResult listCoverageStatistics(ListCoverageStatisticsRequest listCoverageStatisticsRequest);

    /**
     * <p>
     * Lists information about the Amazon Inspector delegated administrator of your organization.
     * </p>
     * 
     * @param listDelegatedAdminAccountsRequest
     * @return Result of the ListDelegatedAdminAccounts operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.ListDelegatedAdminAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListDelegatedAdminAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    ListDelegatedAdminAccountsResult listDelegatedAdminAccounts(ListDelegatedAdminAccountsRequest listDelegatedAdminAccountsRequest);

    /**
     * <p>
     * Lists the filters associated with your account.
     * </p>
     * 
     * @param listFiltersRequest
     * @return Result of the ListFilters operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.ListFilters
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListFilters" target="_top">AWS API
     *      Documentation</a>
     */
    ListFiltersResult listFilters(ListFiltersRequest listFiltersRequest);

    /**
     * <p>
     * Lists aggregated finding data for your environment based on specific criteria.
     * </p>
     * 
     * @param listFindingAggregationsRequest
     * @return Result of the ListFindingAggregations operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.ListFindingAggregations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListFindingAggregations"
     *      target="_top">AWS API Documentation</a>
     */
    ListFindingAggregationsResult listFindingAggregations(ListFindingAggregationsRequest listFindingAggregationsRequest);

    /**
     * <p>
     * Lists findings for your environment.
     * </p>
     * 
     * @param listFindingsRequest
     * @return Result of the ListFindings operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.ListFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListFindings" target="_top">AWS API
     *      Documentation</a>
     */
    ListFindingsResult listFindings(ListFindingsRequest listFindingsRequest);

    /**
     * <p>
     * List members associated with the Amazon Inspector delegated administrator for your organization.
     * </p>
     * 
     * @param listMembersRequest
     * @return Result of the ListMembers operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.ListMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListMembers" target="_top">AWS API
     *      Documentation</a>
     */
    ListMembersResult listMembers(ListMembersRequest listMembersRequest);

    /**
     * <p>
     * Lists all tags attached to a given resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws ResourceNotFoundException
     *         The operation tried to access an invalid resource. Make sure the resource is specified correctly.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the Amazon Inspector usage totals over the last 30 days.
     * </p>
     * 
     * @param listUsageTotalsRequest
     * @return Result of the ListUsageTotals operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.ListUsageTotals
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListUsageTotals" target="_top">AWS API
     *      Documentation</a>
     */
    ListUsageTotalsResult listUsageTotals(ListUsageTotalsRequest listUsageTotalsRequest);

    /**
     * <p>
     * Adds tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws BadRequestException
     *         One or more tags submitted as part of the request is not valid.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws ResourceNotFoundException
     *         The operation tried to access an invalid resource. Make sure the resource is specified correctly.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws ResourceNotFoundException
     *         The operation tried to access an invalid resource. Make sure the resource is specified correctly.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates setting configurations for your Amazon Inspector account. When you use this API as an Amazon Inspector
     * delegated administrator this updates the setting for all accounts you manage. Member accounts in an organization
     * cannot update this setting.
     * </p>
     * 
     * @param updateConfigurationRequest
     * @return Result of the UpdateConfiguration operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.UpdateConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/UpdateConfiguration" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateConfigurationResult updateConfiguration(UpdateConfigurationRequest updateConfigurationRequest);

    /**
     * <p>
     * Specifies the action that is to be applied to the findings that match the filter.
     * </p>
     * 
     * @param updateFilterRequest
     * @return Result of the UpdateFilter operation returned by the service.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The operation tried to access an invalid resource. Make sure the resource is specified correctly.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.UpdateFilter
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/UpdateFilter" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateFilterResult updateFilter(UpdateFilterRequest updateFilterRequest);

    /**
     * <p>
     * Updates the configurations for your Amazon Inspector organization.
     * </p>
     * 
     * @param updateOrganizationConfigurationRequest
     * @return Result of the UpdateOrganizationConfiguration operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         The request has failed validation due to missing required fields or having invalid inputs.
     * @throws ThrottlingException
     *         The limit on the number of requests per second was exceeded.
     * @throws InternalServerException
     *         The request has failed due to an internal failure of the Amazon Inspector service.
     * @sample AWSInspector2.UpdateOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/UpdateOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateOrganizationConfigurationResult updateOrganizationConfiguration(UpdateOrganizationConfigurationRequest updateOrganizationConfigurationRequest);

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
